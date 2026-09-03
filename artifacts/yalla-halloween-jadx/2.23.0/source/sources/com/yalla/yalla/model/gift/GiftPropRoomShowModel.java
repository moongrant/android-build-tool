package com.yalla.yalla.model.gift;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftPropRoomShowModel;", "", "giftId", "", "giftPropTypeUser", "(II)V", "getGiftId", "()I", "getGiftPropTypeUser", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GiftPropRoomShowModel {
    public static final int $stable = 0;
    private final int giftId;
    private final int giftPropTypeUser;

    public GiftPropRoomShowModel(int i, int i2) {
        this.giftId = i;
        this.giftPropTypeUser = i2;
    }

    public final int getGiftId() {
        return this.giftId;
    }

    public final int getGiftPropTypeUser() {
        return this.giftPropTypeUser;
    }

    public /* synthetic */ GiftPropRoomShowModel(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? GiftPropTypeUser.Hot.getValue() : i2);
    }
}
