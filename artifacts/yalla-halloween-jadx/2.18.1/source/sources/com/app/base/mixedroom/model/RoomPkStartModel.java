package com.app.base.mixedroom.model;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/base/mixedroom/model/RoomPkStartModel;", "", "room_a_name", "", "room_b_name", "(Ljava/lang/String;Ljava/lang/String;)V", "getRoom_a_name", "()Ljava/lang/String;", "getRoom_b_name", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class RoomPkStartModel {
    public static final int $stable = 0;

    @NotNull
    private final String room_a_name;

    @NotNull
    private final String room_b_name;

    /* JADX WARN: Multi-variable type inference failed */
    public RoomPkStartModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public RoomPkStartModel(@NotNull String room_a_name, @NotNull String room_b_name) {
        Intrinsics.checkNotNullParameter(room_a_name, "room_a_name");
        Intrinsics.checkNotNullParameter(room_b_name, "room_b_name");
        this.room_a_name = room_a_name;
        this.room_b_name = room_b_name;
    }

    public static /* synthetic */ RoomPkStartModel copy$default(RoomPkStartModel roomPkStartModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = roomPkStartModel.room_a_name;
        }
        if ((i & 2) != 0) {
            str2 = roomPkStartModel.room_b_name;
        }
        return roomPkStartModel.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoom_a_name() {
        return this.room_a_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoom_b_name() {
        return this.room_b_name;
    }

    @NotNull
    public final RoomPkStartModel copy(@NotNull String room_a_name, @NotNull String room_b_name) {
        Intrinsics.checkNotNullParameter(room_a_name, "room_a_name");
        Intrinsics.checkNotNullParameter(room_b_name, "room_b_name");
        return new RoomPkStartModel(room_a_name, room_b_name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomPkStartModel)) {
            return false;
        }
        RoomPkStartModel roomPkStartModel = (RoomPkStartModel) other;
        return Intrinsics.areEqual(this.room_a_name, roomPkStartModel.room_a_name) && Intrinsics.areEqual(this.room_b_name, roomPkStartModel.room_b_name);
    }

    @NotNull
    public final String getRoom_a_name() {
        return this.room_a_name;
    }

    @NotNull
    public final String getRoom_b_name() {
        return this.room_b_name;
    }

    public int hashCode() {
        return this.room_b_name.hashCode() + (this.room_a_name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RoomPkStartModel(room_a_name=");
        sbOooO0o0.append(this.room_a_name);
        sbOooO0o0.append(", room_b_name=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.room_b_name, ')');
    }

    public /* synthetic */ RoomPkStartModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
