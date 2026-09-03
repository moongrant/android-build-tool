package com.yalla.yalla.model;

import Oooo000.Oooo0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/TopicFollowChange;", "", "topicId", "", "follow", "", "(JZ)V", "getFollow", "()Z", "setFollow", "(Z)V", "getTopicId", "()J", "setTopicId", "(J)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class TopicFollowChange {
    public static final int $stable = 8;
    private boolean follow;
    private long topicId;

    public TopicFollowChange(long j, boolean z) {
        this.topicId = j;
        this.follow = z;
    }

    public static /* synthetic */ TopicFollowChange copy$default(TopicFollowChange topicFollowChange, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = topicFollowChange.topicId;
        }
        if ((i & 2) != 0) {
            z = topicFollowChange.follow;
        }
        return topicFollowChange.copy(j, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFollow() {
        return this.follow;
    }

    @NotNull
    public final TopicFollowChange copy(long topicId, boolean follow) {
        return new TopicFollowChange(topicId, follow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicFollowChange)) {
            return false;
        }
        TopicFollowChange topicFollowChange = (TopicFollowChange) other;
        return this.topicId == topicFollowChange.topicId && this.follow == topicFollowChange.follow;
    }

    public final boolean getFollow() {
        return this.follow;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    public int hashCode() {
        long j = this.topicId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.follow;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return i + r0;
    }

    public final void setFollow(boolean z) {
        this.follow = z;
    }

    public final void setTopicId(long j) {
        this.topicId = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TopicFollowChange(topicId=");
        sbOooO0o0.append(this.topicId);
        sbOooO0o0.append(", follow=");
        return Oooo0.OooO0O0(sbOooO0o0, this.follow, ')');
    }
}
