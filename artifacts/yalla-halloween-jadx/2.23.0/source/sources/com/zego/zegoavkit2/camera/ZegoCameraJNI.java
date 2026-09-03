package com.zego.zegoavkit2.camera;

/* JADX INFO: loaded from: classes5.dex */
final class ZegoCameraJNI {
    public static native float getCamMaxZoomFactor(int i);

    public static native boolean setCamExposureCompensation(float f, int i);

    public static native boolean setCamExposureMode(int i, int i2);

    public static native boolean setCamExposurePoint(float f, float f2, int i);

    public static native boolean setCamExposurePointInPreview(float f, float f2, int i);

    public static native boolean setCamFocusMode(int i, int i2);

    public static native boolean setCamFocusPoint(float f, float f2, int i);

    public static native boolean setCamFocusPointInPreview(float f, float f2, int i);

    public static native boolean setCamZoomFactor(float f, int i);
}
