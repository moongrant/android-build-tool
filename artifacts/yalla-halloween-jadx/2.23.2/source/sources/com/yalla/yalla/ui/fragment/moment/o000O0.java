package com.yalla.yalla.ui.fragment.moment;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.unit.Dp;
import com.yalla.yalla.ui.vm.moment.MomentFeaturedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NestedScrollConnection f28318OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentFeaturedVM f28319OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentListFeaturedFragment f28320OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<p521o0o0O0o0.o000OO> f28321OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Dp> f28322OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(MutableState mutableState, MutableState mutableState2, NestedScrollConnection nestedScrollConnection, MomentListFeaturedFragment momentListFeaturedFragment, MomentFeaturedVM momentFeaturedVM) {
        super(3);
        this.f28318OooO0Oo = nestedScrollConnection;
        this.f28320OooO0o0 = momentListFeaturedFragment;
        this.f28319OooO0o = momentFeaturedVM;
        this.f28321OooO0oO = mutableState;
        this.f28322OooO0oo = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        BoxScope ContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(883955868, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MomentListFeaturedFragment.kt:197)");
            }
            Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f28318OooO0Oo, null, 2, null);
            MomentListFeaturedFragment momentListFeaturedFragment = this.f28320OooO0o0;
            LazyListState lazyListState = momentListFeaturedFragment.mLazyListState;
            Intrinsics.checkNotNull(lazyListState);
            LazyDslKt.LazyColumn(modifierNestedScroll$default, lazyListState, null, false, null, null, null, false, new o000O00O(this.f28319OooO0o, momentListFeaturedFragment, this.f28321OooO0oO, this.f28322OooO0oo), composer2, 0, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
