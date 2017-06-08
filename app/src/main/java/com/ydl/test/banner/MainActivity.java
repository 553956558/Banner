package com.ydl.test.banner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BannerLayout.OnBannerItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BannerLayout bannerLayout = (BannerLayout) findViewById(R.id.banner);
        BannerLayout bannerLayout2 = (BannerLayout) findViewById(R.id.banner2);

        final List<String> urls = new ArrayList<>();
        urls.add("http://68dsw.oss-cn-beijing.aliyuncs.com/images/system/config/mall/mall_logo_0.png");
        urls.add("http://68dsw.oss-cn-beijing.aliyuncs.com/images/system/config/mall/mall_logo_0.png");
        urls.add("http://img0.imgtn.bdimg.com/it/u=1095909580,3513610062&fm=23&gp=0.jpg");
        urls.add("http://img4.imgtn.bdimg.com/it/u=1030604573,1579640549&fm=23&gp=0.jpg");
        urls.add("http://img5.imgtn.bdimg.com/it/u=2583054979,2860372508&fm=23&gp=0.jpg");
        bannerLayout.setImageLoader(new PicassoImageLoader());
        bannerLayout.setViewUrls(urls);


        bannerLayout2.setImageLoader(new PicassoImageLoader());
        bannerLayout2.setViewUrls(urls);
        bannerLayout2.setDuration(1000);
        bannerLayout2.setOnBannerItemClickListener(this);

    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(getApplicationContext(),"我是第"+position+"页",Toast.LENGTH_SHORT).show();
    }
}
