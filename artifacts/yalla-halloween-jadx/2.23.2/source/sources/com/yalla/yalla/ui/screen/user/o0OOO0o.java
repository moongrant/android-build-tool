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
import p201o00o0Ooo.o0O0000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<VisitorUserInfoModel> f29646OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserVisitorVM f29647OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(p107o000ooO0.OooOOOO<VisitorUserInfoModel> oooOOOO, UserVisitorVM userVisitorVM) {
        super(1);
        this.f29646OooO0Oo = oooOOOO;
        this.f29647OooO0o0 = userVisitorVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        p107o000ooO0.OooOOOO<VisitorUserInfoModel> oooOOOO = this.f29646OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooOOOO.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(-1113755398, true, new o0ooOOo(oooOOOO, this.f29647OooO0o0)), 6, null);
        o0O0000O.OooO00o(LazyColumn, oooOOOO, oooOOOO.OooO0O0() >= 100 ? o0000.OooO0OO(o000000.Visitor_quantitative_restrictions) : o0000.OooO0OO(o000000.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
