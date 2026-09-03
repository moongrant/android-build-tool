package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25501OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(0);
        this.f25501OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f25501OooO0Oo;
        if (yallaTeamMessageActivity.f25327OooOoO0) {
            yallaTeamMessageActivity.OooOo().f45225OooO0OO.scrollToPosition(0);
        }
        return Unit.INSTANCE;
    }
}
