package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/model/room/ChangeUser;", "", "name", "", "rank", "", "type", "userid", "", "(Ljava/lang/String;IIJ)V", "getName", "()Ljava/lang/String;", "getRank", "()I", "getType", "getUserid", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChangeUser {
    public static final int $stable = 0;

    @NotNull
    private final String name;
    private final int rank;
    private final int type;
    private final long userid;

    public ChangeUser() {
        this(null, 0, 0, 0L, 15, null);
    }

    public static /* synthetic */ ChangeUser copy$default(ChangeUser changeUser, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = changeUser.name;
        }
        if ((i3 & 2) != 0) {
            i = changeUser.rank;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = changeUser.type;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            j = changeUser.userid;
        }
        return changeUser.copy(str, i4, i5, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUserid() {
        return this.userid;
    }

    @NotNull
    public final ChangeUser copy(@NotNull String name, int rank, int type, long userid) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ChangeUser(name, rank, type, userid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeUser)) {
            return false;
        }
        ChangeUser changeUser = (ChangeUser) other;
        return Intrinsics.areEqual(this.name, changeUser.name) && this.rank == changeUser.rank && this.type == changeUser.type && this.userid == changeUser.userid;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserid() {
        return this.userid;
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.rank) * 31) + this.type) * 31;
        long j = this.userid;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        return "ChangeUser(name=" + this.name + ", rank=" + this.rank + ", type=" + this.type + ", userid=" + this.userid + ")";
    }

    public ChangeUser(@NotNull String name, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.rank = i;
        this.type = i2;
        this.userid = j;
    }

    public /* synthetic */ ChangeUser(String str, int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? 0L : j);
    }
}
