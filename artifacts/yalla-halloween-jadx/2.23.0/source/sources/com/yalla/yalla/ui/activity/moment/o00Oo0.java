package com.yalla.yalla.ui.activity.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f26436OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(MomentReplyActivity momentReplyActivity) {
        super(1);
        this.f26436OooO0Oo = momentReplyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        int i = MomentReplyActivity.f26149OooOoO;
        MomentReplyActivity momentReplyActivity = this.f26436OooO0Oo;
        momentReplyActivity.OooOoO0().f59393OooO0o0.setVisibility(0);
        momentReplyActivity.OooOoO0().f59393OooO0o0.OooOO0O("svga/anim_loading_horse_gray.svga", momentReplyActivity);
        momentReplyActivity.OooOoO0().f59393OooO0o0.OooOO0o();
        momentReplyActivity.OooOoo0().setSortType(iIntValue);
        momentReplyActivity.OooOoOO(true);
        return Unit.INSTANCE;
    }
}
