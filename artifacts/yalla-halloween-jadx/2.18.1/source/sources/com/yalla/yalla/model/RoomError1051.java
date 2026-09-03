package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/model/RoomError1051;", "", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "isFollowed", "", "()Z", "setFollowed", "(Z)V", "isJoined", "setJoined", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RoomError1051 {
    public static final int $stable = 8;
    private int code = 1051;

    @SerializedName("isBarFollowed")
    private boolean isFollowed;

    @SerializedName("isBarMember")
    private boolean isJoined;

    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: isFollowed, reason: from getter */
    public final boolean getIsFollowed() {
        return this.isFollowed;
    }

    /* JADX INFO: renamed from: isJoined, reason: from getter */
    public final boolean getIsJoined() {
        return this.isJoined;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setFollowed(boolean z) {
        this.isFollowed = z;
    }

    public final void setJoined(boolean z) {
        this.isJoined = z;
    }
}
