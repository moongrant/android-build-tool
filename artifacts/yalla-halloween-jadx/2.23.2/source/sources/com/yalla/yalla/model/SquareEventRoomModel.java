package com.yalla.yalla.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010%\u001a\u00020\u0000J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020'H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000b¨\u0006,"}, d2 = {"Lcom/yalla/yalla/model/SquareEventRoomModel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "currentEventId", "", "getCurrentEventId", "()J", "setCurrentEventId", "(J)V", "eventCreateTime", "getEventCreateTime", "setEventCreateTime", "isNewRoomEvent", "", "()Z", "setNewRoomEvent", "(Z)V", "isStarting", "setStarting", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "roomName", "", "getRoomName", "()Ljava/lang/String;", "setRoomName", "(Ljava/lang/String;)V", "roomPic", "getRoomPic", "setRoomPic", "userId", "getUserId", "setUserId", "clone", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SquareEventRoomModel implements Parcelable {
    private long currentEventId;

    @SerializedName("eventCTime")
    private long eventCreateTime;
    private boolean isNewRoomEvent;
    private boolean isStarting;
    private long roomId;

    @NotNull
    private String roomName;

    @NotNull
    private String roomPic;
    private long userId;

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.yalla.yalla.model.SquareEventRoomModel$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/SquareEventRoomModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yalla/yalla/model/SquareEventRoomModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yalla/yalla/model/SquareEventRoomModel;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SquareEventRoomModel> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SquareEventRoomModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SquareEventRoomModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SquareEventRoomModel[] newArray(int size) {
            return new SquareEventRoomModel[size];
        }
    }

    public SquareEventRoomModel() {
        this.roomName = "";
        this.roomPic = "";
    }

    @NotNull
    public final SquareEventRoomModel clone() {
        SquareEventRoomModel squareEventRoomModel = new SquareEventRoomModel();
        squareEventRoomModel.roomId = this.roomId;
        squareEventRoomModel.roomName = this.roomName;
        squareEventRoomModel.roomPic = this.roomPic;
        squareEventRoomModel.userId = this.userId;
        squareEventRoomModel.eventCreateTime = this.eventCreateTime;
        squareEventRoomModel.currentEventId = this.currentEventId;
        squareEventRoomModel.isStarting = this.isStarting;
        squareEventRoomModel.isNewRoomEvent = false;
        return squareEventRoomModel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getCurrentEventId() {
        return this.currentEventId;
    }

    public final long getEventCreateTime() {
        return this.eventCreateTime;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final String getRoomName() {
        return this.roomName;
    }

    @NotNull
    public final String getRoomPic() {
        return this.roomPic;
    }

    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: isNewRoomEvent, reason: from getter */
    public final boolean getIsNewRoomEvent() {
        return this.isNewRoomEvent;
    }

    /* JADX INFO: renamed from: isStarting, reason: from getter */
    public final boolean getIsStarting() {
        return this.isStarting;
    }

    public final void setCurrentEventId(long j) {
        this.currentEventId = j;
    }

    public final void setEventCreateTime(long j) {
        this.eventCreateTime = j;
    }

    public final void setNewRoomEvent(boolean z) {
        this.isNewRoomEvent = z;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setRoomName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomName = str;
    }

    public final void setRoomPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomPic = str;
    }

    public final void setStarting(boolean z) {
        this.isStarting = z;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.roomId);
        parcel.writeString(this.roomName);
        parcel.writeString(this.roomPic);
        parcel.writeLong(this.userId);
        parcel.writeLong(this.eventCreateTime);
        parcel.writeLong(this.currentEventId);
        parcel.writeByte(this.isStarting ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isNewRoomEvent ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SquareEventRoomModel(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.roomId = parcel.readLong();
        String string = parcel.readString();
        this.roomName = string == null ? "" : string;
        String string2 = parcel.readString();
        this.roomPic = string2 != null ? string2 : "";
        this.userId = parcel.readLong();
        this.eventCreateTime = parcel.readLong();
        this.currentEventId = parcel.readLong();
        this.isStarting = parcel.readByte() != 0;
        this.isNewRoomEvent = parcel.readByte() != 0;
    }
}
