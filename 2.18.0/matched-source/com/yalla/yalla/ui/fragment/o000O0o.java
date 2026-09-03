package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0o extends Lambda implements Function1<ApiResult<String>, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeMineFragment f24525Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(RoomThemeMineFragment roomThemeMineFragment) {
        super(1);
        this.f24525Oooo = roomThemeMineFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<String> apiResult) {
        ApiResult<String> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        RoomThemeMineActivity activity = this.f24525Oooo.getActivity();
        if (activity != null) {
            activity.OooOoO();
        }
        return Unit.INSTANCE;
    }
}
