package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/model/StoreRoomChatBubbleBuyModel;", "", "balance", "", "dayNum", "", "(JI)V", "getBalance", "()J", "getDayNum", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StoreRoomChatBubbleBuyModel {
    public static final int $stable = 0;
    private final long balance;
    private final int dayNum;

    public StoreRoomChatBubbleBuyModel() {
        this(0L, 0, 3, null);
    }

    public static /* synthetic */ StoreRoomChatBubbleBuyModel copy$default(StoreRoomChatBubbleBuyModel storeRoomChatBubbleBuyModel, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = storeRoomChatBubbleBuyModel.balance;
        }
        if ((i2 & 2) != 0) {
            i = storeRoomChatBubbleBuyModel.dayNum;
        }
        return storeRoomChatBubbleBuyModel.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDayNum() {
        return this.dayNum;
    }

    @NotNull
    public final StoreRoomChatBubbleBuyModel copy(long balance, int dayNum) {
        return new StoreRoomChatBubbleBuyModel(balance, dayNum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreRoomChatBubbleBuyModel)) {
            return false;
        }
        StoreRoomChatBubbleBuyModel storeRoomChatBubbleBuyModel = (StoreRoomChatBubbleBuyModel) other;
        return this.balance == storeRoomChatBubbleBuyModel.balance && this.dayNum == storeRoomChatBubbleBuyModel.dayNum;
    }

    public final long getBalance() {
        return this.balance;
    }

    public final int getDayNum() {
        return this.dayNum;
    }

    public int hashCode() {
        long j = this.balance;
        return (((int) (j ^ (j >>> 32))) * 31) + this.dayNum;
    }

    @NotNull
    public String toString() {
        return "StoreRoomChatBubbleBuyModel(balance=" + this.balance + ", dayNum=" + this.dayNum + ")";
    }

    public StoreRoomChatBubbleBuyModel(long j, int i) {
        this.balance = j;
        this.dayNum = i;
    }

    public /* synthetic */ StoreRoomChatBubbleBuyModel(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i);
    }
}
