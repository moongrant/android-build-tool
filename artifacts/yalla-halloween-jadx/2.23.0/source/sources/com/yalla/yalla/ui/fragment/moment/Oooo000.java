package com.yalla.yalla.ui.fragment.moment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingVM f28819OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MainMomentFollowingFragment f28820OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ NestedScrollConnection f28821OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<p515o0o0O0O0.o0Oo0oo> f28822OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Dp> f28823OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(MutableState mutableState, MutableState mutableState2, NestedScrollConnection nestedScrollConnection, MainMomentFollowingFragment mainMomentFollowingFragment, MomentFollowingVM momentFollowingVM) {
        super(2);
        this.f28819OooO0Oo = momentFollowingVM;
        this.f28821OooO0o0 = nestedScrollConnection;
        this.f28820OooO0o = mainMomentFollowingFragment;
        this.f28822OooO0oO = mutableState;
        this.f28823OooO0oo = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-845938359, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment.initView.<anonymous>.<anonymous>.<anonymous> (MainMomentFollowingFragment.kt:227)");
            }
            MomentFollowingVM momentFollowingVM = this.f28819OooO0Oo;
            p150o00Oo0oO.o0000Ooo.OooO0o0(momentFollowingVM.getContentState().getValue(), false, null, null, null, null, new OooOO0(momentFollowingVM), ComposableLambdaKt.composableLambda(composer2, -773229561, true, new OooOo(this.f28822OooO0oO, this.f28823OooO0oo, this.f28821OooO0o0, this.f28820OooO0o, this.f28819OooO0Oo)), composer2, 12582912, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
