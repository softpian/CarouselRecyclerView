package com.softpian.carouselrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.softpian.carouselrecyclerview.data.PhotoItem;
import com.softpian.carouselrecyclerview.data.PhotoResponse;
import com.softpian.carouselrecyclerview.network.FlickrPhotoApi;
import com.softpian.carouselrecyclerview.network.RestfulService;
import com.softpian.carouselrecyclerview.util.Constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CarouselActivity extends AppCompatActivity {

    private final String TAG = CarouselActivity.class.getSimpleName();

    private CarouselAdapter mAdapter;
    private LinearLayoutManager mLinearLayoutManager;

    @BindView(R.id.rvCarouselRecyclerView) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_carousel);

        ButterKnife.bind(this);

        mLinearLayoutManager = new CarouselLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        List<Integer> newItems = new ArrayList<>();
        newItems.add(R.drawable.list_bg_redorange);
        newItems.add(R.drawable.list_bg_blue);
        newItems.add(R.drawable.list_bg_red);
        newItems.add(R.drawable.list_bg_green);
        newItems.add(R.drawable.list_bg_blueviolet);
        newItems.add(R.drawable.list_bg_orange);
        newItems.add(R.drawable.list_bg_peacock);
        newItems.add(R.drawable.list_bg_purple);

        mAdapter = new CarouselAdapter(newItems);
        mRecyclerView.setAdapter(mAdapter);

        FlickrPhotoApi flickrPhotoApi =
                RestfulService.getInstance().createRetrofit(FlickrPhotoApi.class, Constant.BASE_URL);

        Map<String, String> queryParameters = new HashMap<>();
        queryParameters.put("api_key", Constant.FLICKR_API_KEY);
        queryParameters.put("safe_search", Constant.SAFE_SEARCH);
        queryParameters.put("text", "BeautifulNewZealand");
        queryParameters.put("page", "1");
        queryParameters.put("per_page", "30");

        flickrPhotoApi.getFlickrPhotosSearch(queryParameters)
                .enqueue(new Callback<PhotoResponse>() {
                    @Override
                    public void onResponse(Call<PhotoResponse> call, Response<PhotoResponse> response) {
                        if (response.isSuccessful()) {
                            PhotoResponse photoResponse = response.body();
                            if (photoResponse != null && "ok".equals(photoResponse.getStat())) {
                                List<PhotoItem> photoItemList = photoResponse.getPhotos().getPhoto();
                                mAdapter.addAll(photoItemList);
                                mLinearLayoutManager.scrollToPositionWithOffset(photoItemList.size() / 2, 55);
                                Log.d(TAG, "Response succeeded!!!");
                            }
                        } else {
                            Log.e(TAG, "Response failed - response code: " + response.code() + ", messsage: " + response.message());
                        }
                    }

                    @Override
                    public void onFailure(Call<PhotoResponse> call, Throwable t) {
                        Log.e(TAG, "Exception occurred: " + t.getMessage());
                    }
                });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAdapter.notifyDataSetChanged();
    }
}
