package com.zego.zegoavkit2;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public interface IZegoMediaPlayerWithIndexCallback {
    void onAudioBegin(int i);

    void onBufferBegin(int i);

    void onBufferEnd(int i);

    void onLoadComplete(int i);

    void onPlayEnd(int i);

    void onPlayError(int i, int i2);

    void onPlayPause(int i);

    void onPlayResume(int i);

    void onPlayStart(int i);

    void onPlayStop(int i);

    void onProcessInterval(long j, int i);

    void onReadEOF(int i);

    void onSeekComplete(int i, long j, int i2);

    void onSnapshot(Bitmap bitmap, int i);

    void onVideoBegin(int i);
}
