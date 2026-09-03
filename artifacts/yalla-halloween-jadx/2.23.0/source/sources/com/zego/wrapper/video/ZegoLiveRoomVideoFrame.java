package com.zego.wrapper.video;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoLiveRoomVideoFrame {
    public static final int FORMAT_BGRA32 = 4;
    public static final int FORMAT_I420 = 1;
    public static final int FORMAT_NONE = -1;
    public static final int FORMAT_NV21 = 3;
    public static final int FORMAT_TEXTURE_2D = 10;
    public static final int PIXEL_BUFFER_TYPE_GL_TEXTURE_2D = 8;
    public static final int PIXEL_BUFFER_TYPE_MEM = 1;
    public byte[] buf;
    public int height;
    public int rotation;
    public int textureID;
    public int width;
    public int format = 10;
    public int[] strides = {0, 0, 0, 0};
}
