package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.model.FeedbackModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends Lambda implements Function1<ApiResult<FeedbackModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25953OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f25953OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<FeedbackModel> apiResult) {
        ApiResult<FeedbackModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f25953OooO0Oo.f25777OooOo0 = false;
        return Unit.INSTANCE;
    }
}
