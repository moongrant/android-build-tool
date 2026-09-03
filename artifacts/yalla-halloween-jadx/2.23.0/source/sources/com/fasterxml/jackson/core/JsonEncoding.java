package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes3.dex */
public enum JsonEncoding {
    UTF8("UTF8", "UTF-8", false),
    UTF16_BE("UTF16_BE", "UTF-16BE", true),
    UTF16_LE("UTF16_LE", "UTF-16LE", false),
    UTF32_BE("UTF32_BE", "UTF-32BE", true),
    UTF32_LE("UTF32_LE", "UTF-32LE", false);

    private final boolean _bigEndian;
    private final int _bits;
    private final String _javaName;

    JsonEncoding(String str, String str2, boolean z) {
        this._javaName = str2;
        this._bigEndian = z;
        this._bits = i;
    }
}
