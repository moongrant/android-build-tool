package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.VoteDetailModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 extends Lambda implements Function1<ApiResult<VoteDetailModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f26500OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(VoteHistoryDetailActivity voteHistoryDetailActivity) {
        super(1);
        this.f26500OooO0Oo = voteHistoryDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<VoteDetailModel> apiResult) {
        ApiResult<VoteDetailModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        oo0ooO oo0ooo = this.f26500OooO0Oo.f26331OooOo;
        if (oo0ooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0ooo = null;
        }
        oo0ooo.Oooo00o();
        return Unit.INSTANCE;
    }
}
