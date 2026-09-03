package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/model/OnTopPostForUserPostModel;", "", "userId", "", ShareConstants.RESULT_POST_ID, "", "(Ljava/lang/String;J)V", "getPostId", "()J", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OnTopPostForUserPostModel {
    public static final int $stable = 0;
    private final long postId;

    @NotNull
    private final String userId;

    public OnTopPostForUserPostModel() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ OnTopPostForUserPostModel copy$default(OnTopPostForUserPostModel onTopPostForUserPostModel, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onTopPostForUserPostModel.userId;
        }
        if ((i & 2) != 0) {
            j = onTopPostForUserPostModel.postId;
        }
        return onTopPostForUserPostModel.copy(str, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPostId() {
        return this.postId;
    }

    @NotNull
    public final OnTopPostForUserPostModel copy(@NotNull String userId, long postId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new OnTopPostForUserPostModel(userId, postId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnTopPostForUserPostModel)) {
            return false;
        }
        OnTopPostForUserPostModel onTopPostForUserPostModel = (OnTopPostForUserPostModel) other;
        return Intrinsics.areEqual(this.userId, onTopPostForUserPostModel.userId) && this.postId == onTopPostForUserPostModel.postId;
    }

    public final long getPostId() {
        return this.postId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        long j = this.postId;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        return "OnTopPostForUserPostModel(userId=" + this.userId + ", postId=" + this.postId + ")";
    }

    public OnTopPostForUserPostModel(@NotNull String userId, long j) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.postId = j;
    }

    public /* synthetic */ OnTopPostForUserPostModel(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j);
    }
}
