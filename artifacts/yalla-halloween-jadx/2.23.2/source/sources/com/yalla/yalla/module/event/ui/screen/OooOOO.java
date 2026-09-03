package com.yalla.yalla.module.event.ui.screen;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.user.UserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p194o00o0OO.o00O00o0;
import p201o00o0Ooo.o0O0000O;
import p450o0OoOooO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ p107o000ooO0.OooOOOO<UserInfoModel> f23415OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(p107o000ooO0.OooOOOO<UserInfoModel> oooOOOO) {
        super(1);
        this.f23415OooO0Oo = oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.CC.OooO(LazyColumn, null, null, o0oO0O0o.f47556OooO0O0, 3, null);
        p107o000ooO0.OooOOOO<UserInfoModel> oooOOOO = this.f23415OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooOOOO.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(1496122668, true, new OooOOO0(oooOOOO)), 6, null);
        o0O0000O.OooO00o(LazyColumn, oooOOOO, com.code.android.util.o0000.OooO0OO(o00O00o0.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
