package com.yalla.yalla.ui.screen.main;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.VipExperienceDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<VipExperienceDetailModel> f29173OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(o000O0.OooO0O0<VipExperienceDetailModel> oooO0O0) {
        super(1);
        this.f29173OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        o000O0.OooO0O0<VipExperienceDetailModel> oooO0O0 = this.f29173OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooO0O0.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(-632465157, true, new OooO00o(oooO0O0)), 6, null);
        return Unit.INSTANCE;
    }
}
