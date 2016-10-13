package com.quickblox.convo.utils;

import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.quickblox.convo.R;

public class Consts {

    // Q-municate release
    public static final String QB_APP_ID = "36317";
    public static final String QB_AUTH_KEY = "QK-SzzmE8GcdgRN";
    public static final String QB_AUTH_SECRET = "HCYfL3aNEmzzWJW";

    public static final String QB_DOMAIN = "api.stage.quickblox.com";

    // Universal Image Loader
    public static final DisplayImageOptions UIL_DEFAULT_DISPLAY_OPTIONS = new DisplayImageOptions.Builder()
            .cacheInMemory(true).imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2).cacheOnDisc(true).
                    considerExifParams(true).bitmapConfig(Bitmap.Config.RGB_565).build();


    public static final DisplayImageOptions UIL_USER_AVATAR_DISPLAY_OPTIONS = new DisplayImageOptions.Builder()
            .showImageOnLoading(R.drawable.placeholder_user).showImageForEmptyUri(R.drawable.placeholder_user)
            .showImageOnFail(R.drawable.placeholder_user).cacheOnDisc(true).cacheInMemory(true).considerExifParams(true).build();

    public static final DisplayImageOptions UIL_GROUP_AVATAR_DISPLAY_OPTIONS = new DisplayImageOptions.Builder()
            .showImageOnLoading(R.drawable.placeholder_group).showImageForEmptyUri(
                    R.drawable.placeholder_group).showImageOnFail(R.drawable.placeholder_group).cacheOnDisc(
                    true).cacheInMemory(true).considerExifParams(true).build();
}