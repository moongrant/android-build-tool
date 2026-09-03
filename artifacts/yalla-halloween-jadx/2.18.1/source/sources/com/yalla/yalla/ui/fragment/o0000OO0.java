package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000OO0 extends Lambda implements Function1<RoomUserInfoModel, Long> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0000OO0 f24484Oooo0o = new o0000OO0();

    public o0000OO0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel item = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(item, "item");
        return Long.valueOf(item.getUserId());
    }
}
