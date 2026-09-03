package com.zego.wrapper.manager.room;

import android.view.View;
import androidx.compose.foundation.layout.OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoUserLiveInfo {
    public boolean isMuteAudio;
    public boolean isMuteVideo;
    public String mExtraInfo = "";
    public boolean mFirstFrame;
    public ZegoUserLiveQuality mLiveQuality;
    private int mLiveStatus;
    public float mSoundLevel;
    private int mStreamStatus;
    public View mVideoView;
    public int mViewMode;

    public int getLiveStatus() {
        return this.mLiveStatus;
    }

    public int getStatus() {
        int i = this.mStreamStatus;
        return i == 2 ? this.mLiveStatus : i;
    }

    public int getStreamStatus() {
        return this.mStreamStatus;
    }

    public void setLiveStatus(int i) {
        if (this.mLiveStatus == i) {
            return;
        }
        this.mLiveStatus = i;
    }

    public void setStreamStatus(int i) {
        if (this.mStreamStatus == i) {
            return;
        }
        this.mStreamStatus = i;
        if (i == 2) {
            this.mLiveStatus = 2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ZegoUserLiveInfo{mStreamStatus=");
        sb.append(this.mStreamStatus);
        sb.append(", mLiveStatus=");
        sb.append(this.mLiveStatus);
        sb.append(", mFirstFrame=");
        sb.append(this.mFirstFrame);
        sb.append(", mSoundLevel=");
        sb.append(this.mSoundLevel);
        sb.append(", mExtraInfo='");
        sb.append(this.mExtraInfo);
        sb.append("', mLiveQuality=");
        sb.append(this.mLiveQuality);
        sb.append(", mVideoView=");
        sb.append(this.mVideoView);
        sb.append(", mViewMode=");
        return OooO0O0.OooO00o(sb, this.mViewMode, '}');
    }
}
