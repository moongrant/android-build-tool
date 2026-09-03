package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.user.VisitorUserInfoModel;
import com.yalla.yalla.ui.vm.user.UserVisitorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0<VisitorUserInfoModel> f30190OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserVisitorVM f30191OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(o000O0.OooO0O0<VisitorUserInfoModel> oooO0O0, UserVisitorVM userVisitorVM) {
        super(1);
        this.f30190OooO0Oo = oooO0O0;
        this.f30191OooO0o0 = userVisitorVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        o000O0.OooO0O0<VisitorUserInfoModel> oooO0O0 = this.f30190OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooO0O0.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(-1113755398, true, new o0ooOOo(oooO0O0, this.f30191OooO0o0)), 6, null);
        p153o00OoO0.OooOo00.OooO00o(LazyColumn, oooO0O0, oooO0O0.OooO0O0() >= 100 ? o0000.OooO0OO(oO00OOo0.Visitor_quantitative_restrictions) : o0000.OooO0OO(oO00OOo0.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
