package com.yalla.yalla.ui.fragment.room;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function1<RoomUserInfoModel, MutableStateFlow<Long>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0OO f28956OooO0Oo = new OooO0OO();

    public OooO0OO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MutableStateFlow<Long> invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel item = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getUserId();
    }
}
