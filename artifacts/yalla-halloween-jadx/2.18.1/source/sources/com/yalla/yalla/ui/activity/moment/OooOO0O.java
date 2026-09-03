package com.yalla.yalla.ui.activity.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f22409Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(MomentSendActivity momentSendActivity) {
        super(1);
        this.f22409Oooo0o = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        MomentSendActivity momentSendActivity = this.f22409Oooo0o;
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
        momentSendActivity.OooOooO().f48991OooO0oo.OooO0OO(zBooleanValue);
        return Unit.INSTANCE;
    }
}
