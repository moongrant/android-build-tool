package com.app.base.protobuf;

import android.os.Message;
import com.google.protobuf.ByteString;
import java.util.Objects;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    public static int OooO00o(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static Object OooO0O0(short[] sArr, int i, Function1 function1) {
        return function1.invoke(UShort.m774boximpl(UShortArray.m837getMh2AYeg(sArr, i)));
    }

    public static String OooO0OO(ByteString byteString, ByteString byteString2) {
        Objects.requireNonNull(byteString);
        com.google.protobuf.OooO00o.checkByteStringIsUtf8(byteString2);
        return byteString.OooO();
    }

    public static void OooO0Oo(String str, Message message) {
        o00O00.OooO0oO(str + message);
    }
}
