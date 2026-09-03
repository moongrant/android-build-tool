package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/model/room/RoomThemeGiveState;", "", "()V", "expireTime", "", "getExpireTime", "()J", "setExpireTime", "(J)V", "fromUserId", "getFromUserId", "setFromUserId", "giveId", "getGiveId", "setGiveId", "shopId", "getShopId", "setShopId", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "", "getStatus", "()I", "setStatus", "(I)V", "toUserId", "getToUserId", "setToUserId", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RoomThemeGiveState {
    public static final int $stable = 8;
    private long expireTime;
    private long fromUserId;
    private long giveId;
    private long shopId;
    private int status;
    private long toUserId;

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final long getFromUserId() {
        return this.fromUserId;
    }

    public final long getGiveId() {
        return this.giveId;
    }

    public final long getShopId() {
        return this.shopId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getToUserId() {
        return this.toUserId;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setFromUserId(long j) {
        this.fromUserId = j;
    }

    public final void setGiveId(long j) {
        this.giveId = j;
    }

    public final void setShopId(long j) {
        this.shopId = j;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setToUserId(long j) {
        this.toUserId = j;
    }
}
