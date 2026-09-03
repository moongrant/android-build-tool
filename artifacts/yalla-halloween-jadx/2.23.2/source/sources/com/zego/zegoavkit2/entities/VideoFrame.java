package com.zego.zegoavkit2.entities;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class VideoFrame {
    public int height;
    public int width;
    public ByteBuffer[] byteBuffers = new ByteBuffer[4];
    public int[] strides = new int[4];
}
