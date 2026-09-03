package com.zego.wrapper.manager.room;

import OooO00o.OooO00o;
import android.view.View;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ZegoUserLiveInfo{mStreamStatus=");
        sbOooO0o0.append(this.mStreamStatus);
        sbOooO0o0.append(", mLiveStatus=");
        sbOooO0o0.append(this.mLiveStatus);
        sbOooO0o0.append(", mFirstFrame=");
        sbOooO0o0.append(this.mFirstFrame);
        sbOooO0o0.append(", mSoundLevel=");
        sbOooO0o0.append(this.mSoundLevel);
        sbOooO0o0.append(", mExtraInfo='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mExtraInfo, '\'', ", mLiveQuality=");
        sbOooO0o0.append(this.mLiveQuality);
        sbOooO0o0.append(", mVideoView=");
        sbOooO0o0.append(this.mVideoView);
        sbOooO0o0.append(", mViewMode=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.mViewMode, '}');
    }
}
