package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25936OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(0);
        this.f25936OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = YallaTeamMessageActivity.f25774OooOoo0;
        this.f25936OooO0Oo.OooOoO0().clearMessage();
        return Unit.INSTANCE;
    }
}
