package com.yalla.yalla.ui.screen.event;

import com.yalla.yalla.common.model.UserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000;
import p043OooooO0.o00O0000;
import p591o0oOooOo.r3;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends Lambda implements Function1<o000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.OooO0OO<UserInfoModel> f24666Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(androidx.paging.compose.OooO0OO<UserInfoModel> oooO0OO) {
        super(1);
        this.f24666Oooo0o = oooO0OO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000 o000Var) {
        o000 LazyColumn = o000Var;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        r3 r3Var = r3.f47329OooO00o;
        LazyColumn.OooO0O0(null, null, r3.f47331OooO0OO);
        androidx.paging.compose.OooOO0.OooO0O0(LazyColumn, this.f24666Oooo0o, null, r3.f47332OooO0Oo);
        LazyColumn.OooO0O0(null, null, o00O0000.OooO0O0(-224695532, true, new OooO0OO(this.f24666Oooo0o)));
        return Unit.INSTANCE;
    }
}
