package com.yalla.yalla.ui.activity.message;

import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25947OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(ShareToFriendsActivity shareToFriendsActivity) {
        super(1);
        this.f25947OooO0Oo = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Share_Shared_successfully);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            p587o0oOooo.o0OO000.OooO00o("202026");
        }
        this.f25947OooO0Oo.finish();
        return Unit.INSTANCE;
    }
}
