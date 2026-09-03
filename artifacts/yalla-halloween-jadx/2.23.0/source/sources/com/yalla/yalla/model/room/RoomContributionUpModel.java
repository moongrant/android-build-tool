package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/model/room/RoomContributionUpModel;", "", "changeUsers", "", "Lcom/yalla/yalla/model/room/ChangeUser;", "(Ljava/util/List;)V", "getChangeUsers", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RoomContributionUpModel {
    public static final int $stable = 8;

    @NotNull
    private final List<ChangeUser> changeUsers;

    /* JADX WARN: Multi-variable type inference failed */
    public RoomContributionUpModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoomContributionUpModel copy$default(RoomContributionUpModel roomContributionUpModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = roomContributionUpModel.changeUsers;
        }
        return roomContributionUpModel.copy(list);
    }

    @NotNull
    public final List<ChangeUser> component1() {
        return this.changeUsers;
    }

    @NotNull
    public final RoomContributionUpModel copy(@NotNull List<ChangeUser> changeUsers) {
        Intrinsics.checkNotNullParameter(changeUsers, "changeUsers");
        return new RoomContributionUpModel(changeUsers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RoomContributionUpModel) && Intrinsics.areEqual(this.changeUsers, ((RoomContributionUpModel) other).changeUsers);
    }

    @NotNull
    public final List<ChangeUser> getChangeUsers() {
        return this.changeUsers;
    }

    public int hashCode() {
        return this.changeUsers.hashCode();
    }

    @NotNull
    public String toString() {
        return "RoomContributionUpModel(changeUsers=" + this.changeUsers + ")";
    }

    public RoomContributionUpModel(@NotNull List<ChangeUser> changeUsers) {
        Intrinsics.checkNotNullParameter(changeUsers, "changeUsers");
        this.changeUsers = changeUsers;
    }

    public /* synthetic */ RoomContributionUpModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
