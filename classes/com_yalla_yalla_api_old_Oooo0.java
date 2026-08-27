package com.yalla.yalla.api.old;

import com.yalla.yalla.module.moment.activity.MomentDetailActivity;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Oooo0 {
    public static int OooO00o(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static Object OooO0O0(MomentDetailActivity momentDetailActivity) {
        return momentDetailActivity.Oooo000().getMPostDetailModel().getValue();
    }

    public static String OooO0OO(Object obj, String str, String str2) {
        ResultKt.throwOnFailure(obj);
        String strOooO0o0 = com.yalla.yalla.api.call.OooO0o.OooO0o0(str);
        Intrinsics.checkNotNullParameter(strOooO0o0, str2);
        return strOooO0o0;
    }
}
