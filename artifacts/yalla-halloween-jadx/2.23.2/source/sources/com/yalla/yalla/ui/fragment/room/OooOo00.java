package com.yalla.yalla.ui.fragment.room;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p521o0o0O0o0.o000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LazyListState f28443OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMomentFragment f28444OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMomentListVM f28445OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<o000OO> f28446OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(LazyListState lazyListState, MutableState mutableState, RoomInfoMomentFragment roomInfoMomentFragment, RoomInfoMomentListVM roomInfoMomentListVM) {
        super(3);
        this.f28443OooO0Oo = lazyListState;
        this.f28445OooO0o0 = roomInfoMomentListVM;
        this.f28444OooO0o = roomInfoMomentFragment;
        this.f28446OooO0oO = mutableState;
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
                ComposerKt.traceEventStart(-407121058, iIntValue, -1, "com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RoomInfoMomentFragment.kt:107)");
            }
            LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f28443OooO0Oo, null, false, null, null, null, false, new OooOOOO(this.f28445OooO0o0, this.f28444OooO0o, this.f28446OooO0oO), composer2, 6, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
