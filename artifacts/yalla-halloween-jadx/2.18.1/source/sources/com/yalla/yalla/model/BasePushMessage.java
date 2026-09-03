package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/model/BasePushMessage;", "", "receiverId", "", "(J)V", "getReceiverId", "()J", "setReceiverId", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class BasePushMessage {
    public static final int $stable = 8;
    private long receiverId;

    public BasePushMessage() {
        this(0L, 1, null);
    }

    public BasePushMessage(long j) {
        this.receiverId = j;
    }

    public final long getReceiverId() {
        return this.receiverId;
    }

    public final void setReceiverId(long j) {
        this.receiverId = j;
    }

    public /* synthetic */ BasePushMessage(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
