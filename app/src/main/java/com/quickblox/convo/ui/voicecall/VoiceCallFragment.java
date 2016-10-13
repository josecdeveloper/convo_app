package com.quickblox.convo.ui.voicecall;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.quickblox.convo.R;
import com.quickblox.convo.ui.mediacall.OutgoingCallFragment;
import com.quickblox.convo.ui.views.RoundedImageView;
import com.quickblox.convo.utils.Consts;
import com.quickblox.q_municate_core.db.managers.UsersDatabaseManager;
import com.quickblox.q_municate_core.models.User;

/**
 * Implementation of {@link OutgoingCallFragment} for AUDIO calls representation
 */

public class VoiceCallFragment extends OutgoingCallFragment {

    @Override
    protected void initUI(View rootView) {
        super.initUI(rootView);

        User friendFromDB = UsersDatabaseManager.getUserById(getActivity().getBaseContext(), opponent.getUserId());

        if (friendFromDB != null) {
            ((TextView) rootView.findViewById(R.id.name_textview)).setText(friendFromDB.getFullName());
            RoundedImageView avatarView = (RoundedImageView) rootView.findViewById(R.id.avatar_imageview);
            avatarView.setOval(true);

            if (!TextUtils.isEmpty(friendFromDB.getAvatarUrl())) {
                ImageLoader.getInstance().displayImage(friendFromDB.getAvatarUrl(),
                        avatarView, Consts.UIL_USER_AVATAR_DISPLAY_OPTIONS);
            }
        }
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_voice_call;
    }

}
