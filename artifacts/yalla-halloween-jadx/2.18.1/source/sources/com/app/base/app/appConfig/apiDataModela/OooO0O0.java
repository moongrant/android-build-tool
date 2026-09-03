package com.app.base.app.appConfig.apiDataModela;

import com.yalla.yalla.common.model.ApiError;
import java.io.IOException;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.functions.Function1;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    public static ApiError OooO00o(IOException iOException, StringBuilder sb, String str, int i, String str2) {
        sb.append(iOException.getMessage());
        o00O00.OooO0o0(str, sb.toString());
        return new ApiError(i, str2);
    }

    public static Object OooO0O0(int[] iArr, int i, Function1 function1) {
        return function1.invoke(UInt.m590boximpl(UIntArray.m655getpVg5ArA(iArr, i)));
    }
}
