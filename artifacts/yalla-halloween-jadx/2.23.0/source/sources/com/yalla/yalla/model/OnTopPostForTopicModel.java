package com.yalla.yalla.model;

import android.support.v4.media.session.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/model/OnTopPostForTopicModel;", "", "topicId", "", ShareConstants.RESULT_POST_ID, "(JJ)V", "getPostId", "()J", "getTopicId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OnTopPostForTopicModel {
    public static final int $stable = 0;
    private final long postId;
    private final long topicId;

    public OnTopPostForTopicModel() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ OnTopPostForTopicModel copy$default(OnTopPostForTopicModel onTopPostForTopicModel, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = onTopPostForTopicModel.topicId;
        }
        if ((i & 2) != 0) {
            j2 = onTopPostForTopicModel.postId;
        }
        return onTopPostForTopicModel.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPostId() {
        return this.postId;
    }

    @NotNull
    public final OnTopPostForTopicModel copy(long topicId, long postId) {
        return new OnTopPostForTopicModel(topicId, postId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnTopPostForTopicModel)) {
            return false;
        }
        OnTopPostForTopicModel onTopPostForTopicModel = (OnTopPostForTopicModel) other;
        return this.topicId == onTopPostForTopicModel.topicId && this.postId == onTopPostForTopicModel.postId;
    }

    public final long getPostId() {
        return this.postId;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        long j = this.topicId;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.postId;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    @NotNull
    public String toString() {
        long j = this.topicId;
        return OooO0o.OooO0O0(o00O0000.OooO00o("OnTopPostForTopicModel(topicId=", j, ", postId="), this.postId, ")");
    }

    public OnTopPostForTopicModel(long j, long j2) {
        this.topicId = j;
        this.postId = j2;
    }

    public /* synthetic */ OnTopPostForTopicModel(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }
}
