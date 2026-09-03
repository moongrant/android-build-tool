package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/model/SubscribeNotifyModel;", "", "eventId", "", "hasSubscribe", "", "subscribeCount", "", "(JZI)V", "getEventId", "()J", "setEventId", "(J)V", "getHasSubscribe", "()Z", "setHasSubscribe", "(Z)V", "getSubscribeCount", "()I", "setSubscribeCount", "(I)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SubscribeNotifyModel {
    public static final int $stable = 8;
    private long eventId;
    private boolean hasSubscribe;
    private int subscribeCount;

    public SubscribeNotifyModel() {
        this(0L, false, 0, 7, null);
    }

    public SubscribeNotifyModel(long j, boolean z, int i) {
        this.eventId = j;
        this.hasSubscribe = z;
        this.subscribeCount = i;
    }

    public static /* synthetic */ SubscribeNotifyModel copy$default(SubscribeNotifyModel subscribeNotifyModel, long j, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = subscribeNotifyModel.eventId;
        }
        if ((i2 & 2) != 0) {
            z = subscribeNotifyModel.hasSubscribe;
        }
        if ((i2 & 4) != 0) {
            i = subscribeNotifyModel.subscribeCount;
        }
        return subscribeNotifyModel.copy(j, z, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasSubscribe() {
        return this.hasSubscribe;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSubscribeCount() {
        return this.subscribeCount;
    }

    @NotNull
    public final SubscribeNotifyModel copy(long eventId, boolean hasSubscribe, int subscribeCount) {
        return new SubscribeNotifyModel(eventId, hasSubscribe, subscribeCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeNotifyModel)) {
            return false;
        }
        SubscribeNotifyModel subscribeNotifyModel = (SubscribeNotifyModel) other;
        return this.eventId == subscribeNotifyModel.eventId && this.hasSubscribe == subscribeNotifyModel.hasSubscribe && this.subscribeCount == subscribeNotifyModel.subscribeCount;
    }

    public final long getEventId() {
        return this.eventId;
    }

    public final boolean getHasSubscribe() {
        return this.hasSubscribe;
    }

    public final int getSubscribeCount() {
        return this.subscribeCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    public int hashCode() {
        long j = this.eventId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.hasSubscribe;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((i + r0) * 31) + this.subscribeCount;
    }

    public final void setEventId(long j) {
        this.eventId = j;
    }

    public final void setHasSubscribe(boolean z) {
        this.hasSubscribe = z;
    }

    public final void setSubscribeCount(int i) {
        this.subscribeCount = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("SubscribeNotifyModel(eventId=");
        sbOooO0O0.append(this.eventId);
        sbOooO0O0.append(", hasSubscribe=");
        sbOooO0O0.append(this.hasSubscribe);
        sbOooO0O0.append(", subscribeCount=");
        return o0O0ooO.OooO00o(sbOooO0O0, this.subscribeCount, ')');
    }

    public /* synthetic */ SubscribeNotifyModel(long j, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i);
    }
}
