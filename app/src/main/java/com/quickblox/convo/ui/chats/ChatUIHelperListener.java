package com.quickblox.convo.ui.chats;

public interface ChatUIHelperListener {

    public void onScrollMessagesToBottom();

    public void onScreenResetPossibilityPerformLogout(boolean canPerformLogout);
}