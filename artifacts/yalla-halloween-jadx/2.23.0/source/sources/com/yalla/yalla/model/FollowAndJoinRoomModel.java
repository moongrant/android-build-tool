package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/model/FollowAndJoinRoomModel;", "", "()V", "isFollowing", "", "()Z", "setFollowing", "(Z)V", "isJoined", "setJoined", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FollowAndJoinRoomModel {
    public static final int $stable = 8;
    private boolean isFollowing;
    private boolean isJoined;

    /* JADX INFO: renamed from: isFollowing, reason: from getter */
    public final boolean getIsFollowing() {
        return this.isFollowing;
    }

    /* JADX INFO: renamed from: isJoined, reason: from getter */
    public final boolean getIsJoined() {
        return this.isJoined;
    }

    public final void setFollowing(boolean z) {
        this.isFollowing = z;
    }

    public final void setJoined(boolean z) {
        this.isJoined = z;
    }
}
