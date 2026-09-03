package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.VoteDetailModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO00 extends Lambda implements Function1<ApiResult<VoteDetailModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f26934OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO00(VoteHistoryDetailActivity voteHistoryDetailActivity) {
        super(1);
        this.f26934OooO0Oo = voteHistoryDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<VoteDetailModel> apiResult) {
        ApiResult<VoteDetailModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        o0OOO0 o0ooo1 = this.f26934OooO0Oo.f26785OooOo;
        if (o0ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0ooo1 = null;
        }
        o0ooo1.Oooo00o();
        return Unit.INSTANCE;
    }
}
