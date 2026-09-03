package com.yalla.yalla.ui.activity.main;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.RedemptionCodeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p201o00o0Ooo.o0O0000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<RedemptionCodeModel> f24999OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(p107o000ooO0.OooOOOO<RedemptionCodeModel> oooOOOO) {
        super(1);
        this.f24999OooO0Oo = oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        p107o000ooO0.OooOOOO<RedemptionCodeModel> oooOOOO = this.f24999OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooOOOO.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(-1227365236, true, new OooOOO(oooOOOO)), 6, null);
        o0O0000O.OooO00o(LazyColumn, oooOOOO, o0000.OooO0OO(o000000.Exchange_Records_no_more_data));
        return Unit.INSTANCE;
    }
}
