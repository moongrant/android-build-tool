package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.model.FeedbackModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends Lambda implements Function1<FeedbackModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25538OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f25538OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FeedbackModel feedbackModel) {
        o0oo0000.OooO00o.OooO0O0("204006");
        this.f25538OooO0Oo.f25326OooOoO.setValue("");
        return Unit.INSTANCE;
    }
}
