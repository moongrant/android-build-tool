package com.yalla.yalla.ui.activity.message;

import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f25966OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(1);
        this.f25966OooO0Oo = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        this.f25966OooO0Oo.OooOo0();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
