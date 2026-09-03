package com.yalla.yalla.module.event.ui.screen;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<EventModel> f23949OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o000O0.OooO0O0<EventModel> oooO0O0) {
        super(1);
        this.f23949OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        o000O0.OooO0O0<EventModel> oooO0O0 = this.f23949OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooO0O0.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(1373948013, true, new o0000O0(oooO0O0)), 6, null);
        p153o00OoO0.OooOo00.OooO00o(LazyColumn, oooO0O0, com.code.android.util.o0000.OooO0OO(p148o00Oo0o.oo0o0Oo.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
