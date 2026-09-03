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
    public final /* synthetic */ p107o000ooO0.OooOOOO<VipExperienceDetailModel> f28639OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(p107o000ooO0.OooOOOO<VipExperienceDetailModel> oooOOOO) {
        super(1);
        this.f28639OooO0Oo = oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        p107o000ooO0.OooOOOO<VipExperienceDetailModel> oooOOOO = this.f28639OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooOOOO.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(-632465157, true, new OooO00o(oooOOOO)), 6, null);
        return Unit.INSTANCE;
    }
}
