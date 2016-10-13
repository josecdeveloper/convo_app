package com.quickblox.convo;

import android.app.Application;
import android.content.Context;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.quickblox.chat.QBChatService;
import com.quickblox.core.QBSettings;
import com.quickblox.convo.ui.media.MediaPlayerManager;
import com.quickblox.convo.utils.ActivityLifecycleHandler;
import com.quickblox.convo.utils.Consts;
import com.quickblox.convo.utils.ImageUtils;
import com.quickblox.q_municate_core.utils.PrefsHelper;

public class App extends Application {

    private static App instance;
    private MediaPlayerManager soundPlayer;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initApplication();
        registerActivityLifecycleCallbacks(new ActivityLifecycleHandler());
    }

    private void initImageLoader(Context context) {
        ImageLoader.getInstance().init(ImageUtils.getImageLoaderConfiguration(context));
    }

    public MediaPlayerManager getMediaPlayer() {
        return soundPlayer;
    }

    private void initApplication() {
        instance = this;
        QBChatService.setDebugEnabled(true);
        initImageLoader(this);
        QBSettings.getInstance().fastConfigInit(Consts.QB_APP_ID, Consts.QB_AUTH_KEY,
                Consts.QB_AUTH_SECRET);
        soundPlayer = new MediaPlayerManager(this);
        new PrefsHelper(this);
    }
}