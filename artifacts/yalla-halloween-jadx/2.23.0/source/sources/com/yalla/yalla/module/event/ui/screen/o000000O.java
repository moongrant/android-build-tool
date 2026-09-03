package com.yalla.yalla.module.event.ui.screen;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<EventModel> f23935OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f23936OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f23937OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(o000O0.OooO0O0<EventModel> oooO0O0, Context context, EventViewModel eventViewModel) {
        super(1);
        this.f23935OooO0Oo = oooO0O0;
        this.f23937OooO0o0 = context;
        this.f23936OooO0o = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        o000O0.OooO0O0<EventModel> oooO0O0 = this.f23935OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooO0O0.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(1919259628, true, new o000000(oooO0O0, this.f23937OooO0o0, this.f23936OooO0o)), 6, null);
        return Unit.INSTANCE;
    }
}
