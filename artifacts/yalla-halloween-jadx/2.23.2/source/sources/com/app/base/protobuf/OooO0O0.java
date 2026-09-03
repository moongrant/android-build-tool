package com.app.base.protobuf;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.LazyStringList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO0O0 {
    public static int OooO00o(LazyStringList lazyStringList, int i, CodedOutputStream codedOutputStream, int i2, int i3, int i4) {
        GeneratedMessageV3.writeString(codedOutputStream, i2, lazyStringList.getRaw(i));
        return i3 + i4;
    }
}
