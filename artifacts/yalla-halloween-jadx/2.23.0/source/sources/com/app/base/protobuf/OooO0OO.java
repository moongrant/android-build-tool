package com.app.base.protobuf;

import com.google.gson.Oooo0;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.LazyStringList;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO0OO {
    public static int OooO00o(LazyStringList lazyStringList, int i, CodedOutputStream codedOutputStream, int i2, int i3, int i4) throws IOException {
        GeneratedMessageV3.writeString(codedOutputStream, i2, lazyStringList.getRaw(i));
        return i3 + i4;
    }

    public static String OooO0O0(String str, Oooo0 oooo0) {
        return str + oooo0;
    }

    public static void OooO0OO(int i, HashMap map, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
        map.put(str3, Integer.valueOf(i3));
        map.put(str4, Integer.valueOf(i4));
    }
}
