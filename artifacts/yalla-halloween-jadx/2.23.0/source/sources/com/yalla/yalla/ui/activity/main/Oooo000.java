package com.yalla.yalla.ui.activity.main;

import com.yalla.yalla.model.RandomActivityModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function1<ApiResult<RandomActivityModel.DataBean>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f25457OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(TaskActivity taskActivity) {
        super(1);
        this.f25457OooO0Oo = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RandomActivityModel.DataBean> apiResult) {
        ApiResult<RandomActivityModel.DataBean> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = MainActivity.f25394OooOoo;
        MainActivity.OooO00o.OooO00o(this.f25457OooO0Oo, 0, 6);
        return Unit.INSTANCE;
    }
}
