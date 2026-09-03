package com.yalla.yalla.ui.dialog;

import com.yalla.yalla.model.RoomLuckyNumberHistoryModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends Lambda implements Function1<RoomLuckyNumberHistoryModel, Long> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooO f23740Oooo0o = new OooO();

    public OooO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(RoomLuckyNumberHistoryModel roomLuckyNumberHistoryModel) {
        RoomLuckyNumberHistoryModel item = roomLuckyNumberHistoryModel;
        Intrinsics.checkNotNullParameter(item, "item");
        return Long.valueOf(item.getUserId());
    }
}
