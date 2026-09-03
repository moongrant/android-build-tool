package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends Lambda implements Function1<RoomUserInfoModel, Long> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooO0o f22918Oooo0o = new OooO0o();

    public OooO0o() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel item = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(item, "item");
        return Long.valueOf(item.getUserId());
    }
}
