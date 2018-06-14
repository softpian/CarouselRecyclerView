package com.softpian.carouselrecyclerview;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.softpian.carouselrecyclerview.data.PhotoItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder> {

    private List<PhotoItem> mPhotoItemList = new ArrayList<>();
    private List<Integer> mDrawable = new ArrayList<>();

    CarouselAdapter(List<Integer> drawableList) {
        mDrawable.addAll(drawableList);
    }

    public void addAll(List<PhotoItem> photoItems) {
        mPhotoItemList.addAll(photoItems);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CarouselViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carousel_list_item, parent, false);
        return new CarouselViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarouselViewHolder holder, int position) {
        holder.bind(mPhotoItemList.get(position), mDrawable.get(position % 8));
    }

    @Override
    public int getItemCount() {
        return mPhotoItemList.size();
    }

    static class CarouselViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ivFrame) ImageView mFrameView;
        @BindView(R.id.ivPhoto) ImageView mPhotoView;
        @BindView(R.id.tvPhotoTitle) TextView mPhotoTitleView;

        public CarouselViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void bind(PhotoItem photoItem, @DrawableRes Integer drawable) {

            Glide.with(itemView)
                    .load(drawable)
                    .into(mFrameView);

            Glide.with(itemView)
                    .load(photoItem.getPhotoUrl())
                    .into(mPhotoView);

            mPhotoTitleView.setText(photoItem.getTitle());
        }
    }
}
