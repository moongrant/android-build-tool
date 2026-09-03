package com.yalla.yalla.ui.fragment.moment;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f28293OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(FragmentActivity fragmentActivity) {
        super(0);
        this.f28293OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0oo0000.OooO00o.OooO0O0("203005");
        int i = MomentSendActivity.f25726Oooo0OO;
        FragmentActivity activity = this.f28293OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(activity, "$activity");
        MomentSendActivity.OooO00o.OooO00o(activity);
        return Unit.INSTANCE;
    }
}
