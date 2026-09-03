package com.yalla.yalla.ui.fragment;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.ThemeBoughtModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p581o0oOoOOo.b1;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0O0 extends Lambda implements Function1<ApiResult<ThemeBoughtModel>, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f24521Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(RoomThemeStoreFragment roomThemeStoreFragment) {
        super(1);
        this.f24521Oooo = roomThemeStoreFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<ThemeBoughtModel> apiResult) {
        ApiResult<ThemeBoughtModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity activity = this.f24521Oooo.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        ((BaseActivityK) activity).OooOoO();
        b1 b1Var = this.f24521Oooo.themePreviewDialog;
        if (b1Var != null) {
            b1Var.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
