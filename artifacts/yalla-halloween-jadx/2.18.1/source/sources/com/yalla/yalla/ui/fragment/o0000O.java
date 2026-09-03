package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O extends Lambda implements Function1<RoomUserInfoModel, Long> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneListDialog f24478Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(RoomMemberConveneListDialog roomMemberConveneListDialog) {
        super(1);
        this.f24478Oooo0o = roomMemberConveneListDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel item = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getInRoom() != 0) {
            this.f24478Oooo0o.f24167Ooooo0o.put(Long.valueOf(item.getUserId()), item);
        }
        return Long.valueOf(item.getUserId());
    }
}
