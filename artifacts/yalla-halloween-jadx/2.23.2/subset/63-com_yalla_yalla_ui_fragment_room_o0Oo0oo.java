package com.yalla.yalla.ui.fragment.room;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.ThemeBoughtModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.v3;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends Lambda implements Function1<ApiResult<ThemeBoughtModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreFragment f28606OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(RoomThemeStoreFragment roomThemeStoreFragment) {
        super(1);
        this.f28606OooO0Oo = roomThemeStoreFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<ThemeBoughtModel> apiResult) {
        ApiResult<ThemeBoughtModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        RoomThemeStoreFragment roomThemeStoreFragment = this.f28606OooO0Oo;
        FragmentActivity activity = roomThemeStoreFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        ((BaseActivityK) activity).OooOo0();
        v3 v3Var = roomThemeStoreFragment.themePreviewDialog;
        if (v3Var != null) {
            v3Var.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
