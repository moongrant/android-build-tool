package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/BasePushMessage;", "", "receiverId", "", "(J)V", "mid", "", "getMid", "()Ljava/lang/String;", "getReceiverId", "()J", "setReceiverId", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class BasePushMessage {
    public static final int $stable = 8;

    @NotNull
    private final String mid;
    private long receiverId;

    public BasePushMessage() {
        this(0L, 1, null);
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    public final long getReceiverId() {
        return this.receiverId;
    }

    public final void setReceiverId(long j) {
        this.receiverId = j;
    }

    public BasePushMessage(long j) {
        this.receiverId = j;
        this.mid = "";
    }

    public /* synthetic */ BasePushMessage(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
