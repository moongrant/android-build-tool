package com.yalla.yalla.ui.adapter;

import androidx.appcompat.app.AppCompatActivity;
import com.yalla.yalla.model.ReportCommentDetailModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O extends Lambda implements Function1<ApiResult<ReportCommentDetailModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f27199OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(o0OOO0o o0ooo0o2) {
        super(1);
        this.f27199OooO0Oo = o0ooo0o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<ReportCommentDetailModel> apiResult) {
        ApiResult<ReportCommentDetailModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        AppCompatActivity appCompatActivity = this.f27199OooO0Oo.f27200OooO00o;
        BaseActivityK baseActivityK = appCompatActivity instanceof BaseActivityK ? (BaseActivityK) appCompatActivity : null;
        if (baseActivityK != null) {
            baseActivityK.OooOo0();
        }
        return Unit.INSTANCE;
    }
}
