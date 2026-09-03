package com.yalla.yalla.ui.fragment.room;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function1<ApiResult<String>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeMineFragment f29132OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(RoomThemeMineFragment roomThemeMineFragment) {
        super(1);
        this.f29132OooO0Oo = roomThemeMineFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<String> apiResult) {
        ApiResult<String> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        RoomThemeMineActivity activity = this.f29132OooO0Oo.getActivity();
        if (activity != null) {
            activity.OooOo0();
        }
        return Unit.INSTANCE;
    }
}
