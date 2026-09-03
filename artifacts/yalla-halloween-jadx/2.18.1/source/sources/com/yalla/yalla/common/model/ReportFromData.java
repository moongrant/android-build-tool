package com.yalla.yalla.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\u0006\u0010.\u001a\u00020\u0006J\b\u0010/\u001a\u00020\u0006H\u0016J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017¨\u00065"}, d2 = {"Lcom/yalla/yalla/common/model/ReportFromData;", "Landroid/os/Parcelable;", "prettyId", "", "userId", "content", "", "sendTime", "type", "", "isReportMessage", ContributionFragment.ARG_1, "(JJLjava/lang/String;JIIJ)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "()I", "setReportMessage", "(I)V", "getPrettyId", "()J", "setPrettyId", "(J)V", "getRoomId", "setRoomId", "getSendTime", "setSendTime", "getType", "setType", "getUserId", "setUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toJSONString", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ReportFromData implements Parcelable {

    @NotNull
    private String content;
    private int isReportMessage;
    private long prettyId;
    private long roomId;
    private long sendTime;
    private int type;
    private long userId;

    @NotNull
    public static final Parcelable.Creator<ReportFromData> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReportFromData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ReportFromData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReportFromData(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ReportFromData[] newArray(int i) {
            return new ReportFromData[i];
        }
    }

    public ReportFromData() {
        this(0L, 0L, null, 0L, 0, 0, 0L, 127, null);
    }

    public ReportFromData(long j, long j2, @NotNull String content, long j3, int i, int i2, long j4) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.prettyId = j;
        this.userId = j2;
        this.content = content;
        this.sendTime = j3;
        this.type = i;
        this.isReportMessage = i2;
        this.roomId = j4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPrettyId() {
        return this.prettyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSendTime() {
        return this.sendTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIsReportMessage() {
        return this.isReportMessage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final ReportFromData copy(long prettyId, long userId, @NotNull String content, long sendTime, int type, int isReportMessage, long roomId) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new ReportFromData(prettyId, userId, content, sendTime, type, isReportMessage, roomId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportFromData)) {
            return false;
        }
        ReportFromData reportFromData = (ReportFromData) other;
        return this.prettyId == reportFromData.prettyId && this.userId == reportFromData.userId && Intrinsics.areEqual(this.content, reportFromData.content) && this.sendTime == reportFromData.sendTime && this.type == reportFromData.type && this.isReportMessage == reportFromData.isReportMessage && this.roomId == reportFromData.roomId;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final long getPrettyId() {
        return this.prettyId;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getSendTime() {
        return this.sendTime;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        long j = this.prettyId;
        long j2 = this.userId;
        int iOooO00o = o0O0O00.OooO00o(this.content, ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31);
        long j3 = this.sendTime;
        int i = (((((iOooO00o + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.type) * 31) + this.isReportMessage) * 31;
        long j4 = this.roomId;
        return i + ((int) ((j4 >>> 32) ^ j4));
    }

    public final int isReportMessage() {
        return this.isReportMessage;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setPrettyId(long j) {
        this.prettyId = j;
    }

    public final void setReportMessage(int i) {
        this.isReportMessage = i;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setSendTime(long j) {
        this.sendTime = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    @NotNull
    public final String toJSONString() {
        String strOooO0Oo = o0Oo0oo.OooO0Oo(this);
        Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
        return strOooO0Oo;
    }

    @NotNull
    public String toString() {
        return toJSONString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.prettyId);
        parcel.writeLong(this.userId);
        parcel.writeString(this.content);
        parcel.writeLong(this.sendTime);
        parcel.writeInt(this.type);
        parcel.writeInt(this.isReportMessage);
        parcel.writeLong(this.roomId);
    }

    public /* synthetic */ ReportFromData(long j, long j2, String str, long j3, int i, int i2, long j4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? 0L : j3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) == 0 ? j4 : 0L);
    }
}
