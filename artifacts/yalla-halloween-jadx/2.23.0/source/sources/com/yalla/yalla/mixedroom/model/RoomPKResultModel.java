package com.yalla.yalla.mixedroom.model;

import OooO0OO.OooO0O0;
import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.material.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;
import p082o000OoOo.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u008b\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0006HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00066"}, d2 = {"Lcom/yalla/yalla/mixedroom/model/RoomPKResultModel;", "", "gift_picurl", "", "pk_end", "pk_time_duration", "", "room_a_barid", "", "room_a_giftamount", "room_a_giftnumber", "room_a_name", "room_a_picurl", "room_b_barid", "room_b_giftamount", "room_b_giftnumber", "room_b_name", "room_b_picurl", "(Ljava/lang/String;Ljava/lang/String;IJIILjava/lang/String;Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;)V", "getGift_picurl", "()Ljava/lang/String;", "getPk_end", "getPk_time_duration", "()I", "getRoom_a_barid", "()J", "getRoom_a_giftamount", "getRoom_a_giftnumber", "getRoom_a_name", "getRoom_a_picurl", "getRoom_b_barid", "getRoom_b_giftamount", "getRoom_b_giftnumber", "getRoom_b_name", "getRoom_b_picurl", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RoomPKResultModel {
    public static final int $stable = 0;

    @NotNull
    private final String gift_picurl;

    @NotNull
    private final String pk_end;
    private final int pk_time_duration;
    private final long room_a_barid;
    private final int room_a_giftamount;
    private final int room_a_giftnumber;

    @NotNull
    private final String room_a_name;

    @NotNull
    private final String room_a_picurl;
    private final long room_b_barid;
    private final int room_b_giftamount;
    private final int room_b_giftnumber;

    @NotNull
    private final String room_b_name;

    @NotNull
    private final String room_b_picurl;

    public RoomPKResultModel() {
        this(null, null, 0, 0L, 0, 0, null, null, 0L, 0, 0, null, null, 8191, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGift_picurl() {
        return this.gift_picurl;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getRoom_b_giftamount() {
        return this.room_b_giftamount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getRoom_b_giftnumber() {
        return this.room_b_giftnumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRoom_b_name() {
        return this.room_b_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRoom_b_picurl() {
        return this.room_b_picurl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPk_end() {
        return this.pk_end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPk_time_duration() {
        return this.pk_time_duration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getRoom_a_barid() {
        return this.room_a_barid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRoom_a_giftamount() {
        return this.room_a_giftamount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRoom_a_giftnumber() {
        return this.room_a_giftnumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRoom_a_name() {
        return this.room_a_name;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRoom_a_picurl() {
        return this.room_a_picurl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getRoom_b_barid() {
        return this.room_b_barid;
    }

    @NotNull
    public final RoomPKResultModel copy(@NotNull String gift_picurl, @NotNull String pk_end, int pk_time_duration, long room_a_barid, int room_a_giftamount, int room_a_giftnumber, @NotNull String room_a_name, @NotNull String room_a_picurl, long room_b_barid, int room_b_giftamount, int room_b_giftnumber, @NotNull String room_b_name, @NotNull String room_b_picurl) {
        Intrinsics.checkNotNullParameter(gift_picurl, "gift_picurl");
        Intrinsics.checkNotNullParameter(pk_end, "pk_end");
        Intrinsics.checkNotNullParameter(room_a_name, "room_a_name");
        Intrinsics.checkNotNullParameter(room_a_picurl, "room_a_picurl");
        Intrinsics.checkNotNullParameter(room_b_name, "room_b_name");
        Intrinsics.checkNotNullParameter(room_b_picurl, "room_b_picurl");
        return new RoomPKResultModel(gift_picurl, pk_end, pk_time_duration, room_a_barid, room_a_giftamount, room_a_giftnumber, room_a_name, room_a_picurl, room_b_barid, room_b_giftamount, room_b_giftnumber, room_b_name, room_b_picurl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomPKResultModel)) {
            return false;
        }
        RoomPKResultModel roomPKResultModel = (RoomPKResultModel) other;
        return Intrinsics.areEqual(this.gift_picurl, roomPKResultModel.gift_picurl) && Intrinsics.areEqual(this.pk_end, roomPKResultModel.pk_end) && this.pk_time_duration == roomPKResultModel.pk_time_duration && this.room_a_barid == roomPKResultModel.room_a_barid && this.room_a_giftamount == roomPKResultModel.room_a_giftamount && this.room_a_giftnumber == roomPKResultModel.room_a_giftnumber && Intrinsics.areEqual(this.room_a_name, roomPKResultModel.room_a_name) && Intrinsics.areEqual(this.room_a_picurl, roomPKResultModel.room_a_picurl) && this.room_b_barid == roomPKResultModel.room_b_barid && this.room_b_giftamount == roomPKResultModel.room_b_giftamount && this.room_b_giftnumber == roomPKResultModel.room_b_giftnumber && Intrinsics.areEqual(this.room_b_name, roomPKResultModel.room_b_name) && Intrinsics.areEqual(this.room_b_picurl, roomPKResultModel.room_b_picurl);
    }

    @NotNull
    public final String getGift_picurl() {
        return this.gift_picurl;
    }

    @NotNull
    public final String getPk_end() {
        return this.pk_end;
    }

    public final int getPk_time_duration() {
        return this.pk_time_duration;
    }

    public final long getRoom_a_barid() {
        return this.room_a_barid;
    }

    public final int getRoom_a_giftamount() {
        return this.room_a_giftamount;
    }

    public final int getRoom_a_giftnumber() {
        return this.room_a_giftnumber;
    }

    @NotNull
    public final String getRoom_a_name() {
        return this.room_a_name;
    }

    @NotNull
    public final String getRoom_a_picurl() {
        return this.room_a_picurl;
    }

    public final long getRoom_b_barid() {
        return this.room_b_barid;
    }

    public final int getRoom_b_giftamount() {
        return this.room_b_giftamount;
    }

    public final int getRoom_b_giftnumber() {
        return this.room_b_giftnumber;
    }

    @NotNull
    public final String getRoom_b_name() {
        return this.room_b_name;
    }

    @NotNull
    public final String getRoom_b_picurl() {
        return this.room_b_picurl;
    }

    public int hashCode() {
        int iOooO00o = (o0OO00O.OooO00o(this.pk_end, this.gift_picurl.hashCode() * 31, 31) + this.pk_time_duration) * 31;
        long j = this.room_a_barid;
        int iOooO00o2 = o0OO00O.OooO00o(this.room_a_picurl, o0OO00O.OooO00o(this.room_a_name, (((((iOooO00o + ((int) (j ^ (j >>> 32)))) * 31) + this.room_a_giftamount) * 31) + this.room_a_giftnumber) * 31, 31), 31);
        long j2 = this.room_b_barid;
        return this.room_b_picurl.hashCode() + o0OO00O.OooO00o(this.room_b_name, (((((iOooO00o2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.room_b_giftamount) * 31) + this.room_b_giftnumber) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.gift_picurl;
        String str2 = this.pk_end;
        int i = this.pk_time_duration;
        long j = this.room_a_barid;
        int i2 = this.room_a_giftamount;
        int i3 = this.room_a_giftnumber;
        String str3 = this.room_a_name;
        String str4 = this.room_a_picurl;
        long j2 = this.room_b_barid;
        int i4 = this.room_b_giftamount;
        int i5 = this.room_b_giftnumber;
        String str5 = this.room_b_name;
        String str6 = this.room_b_picurl;
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("RoomPKResultModel(gift_picurl=", str, ", pk_end=", str2, ", pk_time_duration=");
        sbOooO0OO.append(i);
        sbOooO0OO.append(", room_a_barid=");
        sbOooO0OO.append(j);
        sbOooO0OO.append(", room_a_giftamount=");
        sbOooO0OO.append(i2);
        sbOooO0OO.append(", room_a_giftnumber=");
        sbOooO0OO.append(i3);
        OooO0O0.OooO00o(sbOooO0OO, ", room_a_name=", str3, ", room_a_picurl=", str4);
        o000Oo0.OooO0O0.OooO00o(sbOooO0OO, ", room_b_barid=", j2, ", room_b_giftamount=");
        OooOOO0.OooO00o(sbOooO0OO, i4, ", room_b_giftnumber=", i5, ", room_b_name=");
        return OooO00o.OooO0O0(sbOooO0OO, str5, ", room_b_picurl=", str6, ")");
    }

    public RoomPKResultModel(@NotNull String gift_picurl, @NotNull String pk_end, int i, long j, int i2, int i3, @NotNull String room_a_name, @NotNull String room_a_picurl, long j2, int i4, int i5, @NotNull String room_b_name, @NotNull String room_b_picurl) {
        Intrinsics.checkNotNullParameter(gift_picurl, "gift_picurl");
        Intrinsics.checkNotNullParameter(pk_end, "pk_end");
        Intrinsics.checkNotNullParameter(room_a_name, "room_a_name");
        Intrinsics.checkNotNullParameter(room_a_picurl, "room_a_picurl");
        Intrinsics.checkNotNullParameter(room_b_name, "room_b_name");
        Intrinsics.checkNotNullParameter(room_b_picurl, "room_b_picurl");
        this.gift_picurl = gift_picurl;
        this.pk_end = pk_end;
        this.pk_time_duration = i;
        this.room_a_barid = j;
        this.room_a_giftamount = i2;
        this.room_a_giftnumber = i3;
        this.room_a_name = room_a_name;
        this.room_a_picurl = room_a_picurl;
        this.room_b_barid = j2;
        this.room_b_giftamount = i4;
        this.room_b_giftnumber = i5;
        this.room_b_name = room_b_name;
        this.room_b_picurl = room_b_picurl;
    }

    public /* synthetic */ RoomPKResultModel(String str, String str2, int i, long j, int i2, int i3, String str3, String str4, long j2, int i4, int i5, String str5, String str6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? 0L : j, (i6 & 16) != 0 ? 0 : i2, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? "" : str3, (i6 & 128) != 0 ? "" : str4, (i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? j2 : 0L, (i6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 0 : i4, (i6 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 ? i5 : 0, (i6 & 2048) != 0 ? "" : str5, (i6 & 4096) == 0 ? str6 : "");
    }
}
