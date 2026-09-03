package com.zego.zegoavkit2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface ZegoMediaPlayerFileReader {
    void close(int i);

    long getSize(int i);

    int open(String str, int i);

    ByteBuffer read(int i, int i2);

    long seek(long j, int i, int i2);
}
