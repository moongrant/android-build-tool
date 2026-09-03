package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<YallaTeamMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25946OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(3);
        this.f25946OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(p400o0Oo0OO.OooOO0O<YallaTeamMessage> oooOO0O, View view, Integer num) {
        num.intValue();
        Intrinsics.checkNotNullParameter(oooOO0O, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, this.f25946OooO0Oo, String.valueOf(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue()), false, 12);
        return Unit.INSTANCE;
    }
}
