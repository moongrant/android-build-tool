package com.yalla.yalla.ui.activity.main;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.RedemptionCodeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<RedemptionCodeModel> f25453OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(o000O0.OooO0O0<RedemptionCodeModel> oooO0O0) {
        super(1);
        this.f25453OooO0Oo = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        o000O0.OooO0O0<RedemptionCodeModel> oooO0O0 = this.f25453OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooO0O0.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(-1227365236, true, new OooOOO(oooO0O0)), 6, null);
        p153o00OoO0.OooOo00.OooO00o(LazyColumn, oooO0O0, o0000.OooO0OO(oO00OOo0.Exchange_Records_no_more_data));
        return Unit.INSTANCE;
    }
}
