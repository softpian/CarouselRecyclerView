# CarouselRecyclerView
Carousel-Style RecyclerView for a beautiful Android application

Introduction
------------
### RecyclerView Customized 
This repository contains a Photo frame application implementing Carousel RecyclerView for fancy Android application.

The application shows how to customize RecyclerView, especially LinearLayoutManager.

RecyclerView is one of the most used widgets and a more advanced and flexible version of ListView.

Original RecyclerView needs to be modified so that it can meet the specification of attractive User Interface.

RecyclerView in this application was customized to implement Carousel style User Interface for items in the list.   

Please refer to [Developer Guide document of Google][10] for more detailed information about Android RecyclerView implementation.

[10]: https://developer.android.com/guide/topics/ui/layout/recyclerview

### flickr RESTful API
This application uses RESTful API of [flickr][0] which is a popular image/video hosting service in order to get photos.

It receives photo data formatted in JSON and converts it to Java Objects including photo url, title, owner's name, date, description, viewer's count, comment's count and so on.

Please visit [https://www.flickr.com/services/api/](https://www.flickr.com/services/api/) for more detailed information.

[0]: https://www.flickr.com/services/api/

### Detailed Illustration

Here is code snippet which is a core mechanism for Carousel RecyclerView.

This is like a kind of Numerical Analysis or Linear Algebra codes even if it is not that complex compared to real ones.

minifyAmount is a variable for minifying the items up to 25% size near the midpont of parent view.
 
The items will be minified to 25% when distance between parent and child midpoint are 75% from the midpont of parent view.
```
float minifyAmount = 0.25f;
float minifyDistance = 0.75f;

float parentMidpoint = getWidth() / 2.f;
float d0 = 0.f;
float d1 = parentMidpoint * minifyDistance;
float s0 = 1.f;
float s1 = 1.f - minifyAmount;

for (int i = 0; i < getChildCount(); i++) {
    View child = getChildAt(i);

    float childMidpoint = (getDecoratedLeft(child) + getDecoratedRight(child)) / 2.f;
    float d = Math.min(d1, Math.abs(parentMidpoint - childMidpoint));
    float scaleFactor = s0 + (s1 - s0) * (d - d0) / (d1 - d0);

    child.setScaleX(scaleFactor);
    child.setScaleY(scaleFactor);
}
```
scaleFactor is got from the propotional expression applied below.
```
(s1 - s0) : (d1 - d0) = (scaleFactor - s0) : (d - d0)
```

For more clarification, refer to the following illustration.
<img src=https://softpian.github.io/gifs/Carousel_illustration.png width="650" />


### Android development skills
This repository is able to help understand how to use the following skills.
* How to customize LinearLayoutManager of RecyclerView for beautiful User Interface
* How to call RESTful API with Retrofit
* How to use OkHttp Logging Intercepter in order to debug HTTP request/response data  
* How to convert JSON to Java Objects with Moshi
* How to load images from a remote server with Glide
* How to reduce boilerplate codes with ButterKnife

Screenshots
-----------
<img src=https://softpian.github.io/gifs/CarouselRecyclerView.gif width="500" />


Getting Stared
--------------
In your local.properties file, put your own key given from [flickr][0]:

```
flickrApiKey="yourOwnAPIKey"
```
For example, you should write it as below. 
(The following API Key is not real one. Never use it in your application.)
```
flickrApiKey="788a5fnd5r134id6a792ff39pp68dcs3"
```


Libraries Used
---------------
* [Retrofit][1] - Type-safe HTTP client for Android and Java which makes it easier to consume RESTful API services.
* [OkHttp Logging Intercepter][2] - Logs HTTP request and response data with different logging levels in order to debug HTTP error 
* [Moshi][3] - JSON library for Android and Java which makes it easy to parse JSON into Java objects. Used with Retrofit Moshi converter
* [Glide][4] - A fast and efficient image loading library for Android focused on smooth scrolling which offers an easy to use
* [ButterKnife][5] - Binds field and method for Android views with annotation processing and it reduces boilerplate codes

[1]: http://square.github.io/retrofit/
[2]: https://github.com/square/okhttp/wiki/Interceptors
[3]: https://github.com/square/moshi
[4]: https://bumptech.github.io/glide/
[5]: http://jakewharton.github.io/butterknife/


License
-------

    Copyright Jaemoon Hwang <jaemoon.hwang@gmail.com>

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
