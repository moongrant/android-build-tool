package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.YallaTeamMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends Lambda implements Function1<YallaTeamMessage, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25528OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f25528OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(YallaTeamMessage yallaTeamMessage) {
        YallaTeamMessage it = yallaTeamMessage;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = YallaTeamMessageActivity.f25319OooOoo0;
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f25528OooO0Oo;
        yallaTeamMessageActivity.getClass();
        p598o0oo00Oo.o0000O00.OooO0O0("toMyFeedback item = ".concat(p187o00o00o0.OooO.OooO00o(it)));
        if (!yallaTeamMessageActivity.f25328OooOoOO) {
            yallaTeamMessageActivity.f25328OooOoOO = true;
            p583o0oOoo00.o00000OO.f56664OooO0o0.observe(yallaTeamMessageActivity, new YallaTeamMessageActivity.OooO00o(new o0O(yallaTeamMessageActivity)));
        }
        return Unit.INSTANCE;
    }
}
