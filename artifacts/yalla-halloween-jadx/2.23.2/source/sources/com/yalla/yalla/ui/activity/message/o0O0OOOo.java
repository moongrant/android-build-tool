package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function3<h3<YallaTeamMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25504OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(3);
        this.f25504OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(h3<YallaTeamMessage> h3Var, View view, Integer num) {
        num.intValue();
        Intrinsics.checkNotNullParameter(h3Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, this.f25504OooO0Oo, String.valueOf(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue()), false, 12);
        return Unit.INSTANCE;
    }
}
