package com.will.codecs.audio.mp3;

/* JADX INFO: loaded from: classes2.dex */
public class LameEncodc {
    public static native int lameencode(short[] sArr, short[] sArr2, int i, byte[] bArr);

    public static native int lameflush(byte[] bArr);

    public static native void lameinit(int i, int i2, int i3, int i4, int i5);
}
