package com.yalla.yalla.ui.fragment.moment;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.yalla.yalla.ui.vm.moment.MomentFeaturedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p516o0o0O00o.o00Oo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFeaturedVM f28338OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(MomentFeaturedVM momentFeaturedVM) {
        super(3);
        this.f28338OooO0Oo = momentFeaturedVM;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        LazyItemScope item = lazyItemScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1843902835, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MomentListFeaturedFragment.kt:229)");
            }
            MomentFeaturedVM momentFeaturedVM = this.f28338OooO0Oo;
            EffectsKt.LaunchedEffect(momentFeaturedVM.getLoadMoreState().getValue(), new o000O0o(momentFeaturedVM, null), composer2, 64);
            o00Oo00.OooO0O0(momentFeaturedVM.getLoadMoreState().getValue(), null, composer2, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
