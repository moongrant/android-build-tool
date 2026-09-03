package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OO0 extends Lambda implements Function1<ApiResult<String>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25502OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f25502OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<String> apiResult) {
        ApiResult<String> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f25502OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
