package com.yalla.yalla.data.db.table;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Embedded;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/data/db/table/FriendInfo;", "Ljava/io/Serializable;", "userInfo", "Lcom/yalla/yalla/data/db/table/UserInfo;", "friend", "Lcom/yalla/yalla/data/db/table/Friend;", "(Lcom/yalla/yalla/data/db/table/UserInfo;Lcom/yalla/yalla/data/db/table/Friend;)V", "getFriend", "()Lcom/yalla/yalla/data/db/table/Friend;", "setFriend", "(Lcom/yalla/yalla/data/db/table/Friend;)V", "getUserInfo", "()Lcom/yalla/yalla/data/db/table/UserInfo;", "setUserInfo", "(Lcom/yalla/yalla/data/db/table/UserInfo;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FriendInfo implements Serializable {
    public static final int $stable = 8;

    @Embedded
    @NotNull
    private Friend friend;

    @Embedded
    @Nullable
    private UserInfo userInfo;

    public FriendInfo(@Nullable UserInfo userInfo, @NotNull Friend friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        this.userInfo = userInfo;
        this.friend = friend;
    }

    public static /* synthetic */ FriendInfo copy$default(FriendInfo friendInfo, UserInfo userInfo, Friend friend, int i, Object obj) {
        if ((i & 1) != 0) {
            userInfo = friendInfo.userInfo;
        }
        if ((i & 2) != 0) {
            friend = friendInfo.friend;
        }
        return friendInfo.copy(userInfo, friend);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Friend getFriend() {
        return this.friend;
    }

    @NotNull
    public final FriendInfo copy(@Nullable UserInfo userInfo, @NotNull Friend friend) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        return new FriendInfo(userInfo, friend);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendInfo)) {
            return false;
        }
        FriendInfo friendInfo = (FriendInfo) other;
        return Intrinsics.areEqual(this.userInfo, friendInfo.userInfo) && Intrinsics.areEqual(this.friend, friendInfo.friend);
    }

    @NotNull
    public final Friend getFriend() {
        return this.friend;
    }

    @Nullable
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        UserInfo userInfo = this.userInfo;
        return this.friend.hashCode() + ((userInfo == null ? 0 : userInfo.hashCode()) * 31);
    }

    public final void setFriend(@NotNull Friend friend) {
        Intrinsics.checkNotNullParameter(friend, "<set-?>");
        this.friend = friend;
    }

    public final void setUserInfo(@Nullable UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @NotNull
    public String toString() {
        return "FriendInfo(userInfo=" + this.userInfo + ", friend=" + this.friend + ")";
    }
}
