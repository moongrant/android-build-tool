package com.yalla.yalla.ui.fragment.moment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.ui.vm.moment.MomentFeaturedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p196o00o0OOO.oOO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFeaturedVM f28330OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentListFeaturedFragment f28331OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ NestedScrollConnection f28332OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<p521o0o0O0o0.o000OO> f28333OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Dp> f28334OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(MutableState mutableState, MutableState mutableState2, NestedScrollConnection nestedScrollConnection, MomentListFeaturedFragment momentListFeaturedFragment, MomentFeaturedVM momentFeaturedVM) {
        super(2);
        this.f28330OooO0Oo = momentFeaturedVM;
        this.f28332OooO0o0 = nestedScrollConnection;
        this.f28331OooO0o = momentListFeaturedFragment;
        this.f28333OooO0oO = mutableState;
        this.f28334OooO0oo = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-255783330, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment.initView.<anonymous>.<anonymous>.<anonymous> (MomentListFeaturedFragment.kt:190)");
            }
            MomentFeaturedVM momentFeaturedVM = this.f28330OooO0Oo;
            oOO00O.OooO0o0(momentFeaturedVM.getContentState().getValue(), false, null, null, null, null, new o000(momentFeaturedVM), ComposableLambdaKt.composableLambda(composer2, 883955868, true, new o000O0(this.f28333OooO0oO, this.f28334OooO0oo, this.f28332OooO0o0, this.f28331OooO0o, this.f28330OooO0Oo)), composer2, 12582912, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
