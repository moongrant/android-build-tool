package com.yalla.yalla.ui.dialog;

import com.yalla.yalla.model.room.RoomLuckyNumberHistoryModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 extends Lambda implements Function1<RoomLuckyNumberHistoryModel, Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Oooo000 f27861OooO0Oo = new Oooo000();

    public Oooo000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(RoomLuckyNumberHistoryModel roomLuckyNumberHistoryModel) {
        RoomLuckyNumberHistoryModel item = roomLuckyNumberHistoryModel;
        Intrinsics.checkNotNullParameter(item, "item");
        return Long.valueOf(item.getUserId());
    }
}
