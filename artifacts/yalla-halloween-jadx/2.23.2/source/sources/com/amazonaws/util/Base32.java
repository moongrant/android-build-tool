package com.amazonaws.util;

/* JADX INFO: loaded from: classes2.dex */
public enum Base32 {
    ;

    private static final Base32Codec CODEC = new AbstractBase32Codec() { // from class: com.amazonaws.util.Base32Codec
        {
            CodecUtils.OooO00o("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        }
    };
}
