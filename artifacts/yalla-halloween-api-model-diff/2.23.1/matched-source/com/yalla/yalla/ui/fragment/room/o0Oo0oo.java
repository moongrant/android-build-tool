package com.yalla.yalla.ui.fragment.room;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.ThemeBoughtModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p675oO0Oo.r5;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends Lambda implements Function1<ApiResult<ThemeBoughtModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f28613OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(RoomThemeStoreFragment roomThemeStoreFragment) {
        super(1);
        this.f28613OooO0Oo = roomThemeStoreFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<ThemeBoughtModel> apiResult) {
        ApiResult<ThemeBoughtModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        RoomThemeStoreFragment roomThemeStoreFragment = this.f28613OooO0Oo;
        FragmentActivity activity = roomThemeStoreFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        ((BaseActivityK) activity).OooOo0();
        r5 r5Var = roomThemeStoreFragment.themePreviewDialog;
        if (r5Var != null) {
            r5Var.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
