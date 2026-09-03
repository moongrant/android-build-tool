package com.yalla.yalla.model.room;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.facebook.internal.ServerProtocol;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoo0o.o00Ooo;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010$\u001a\u00020\u0007H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001c¨\u0006)"}, d2 = {"Lcom/yalla/yalla/model/room/RoomLoginModel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "apptype", "", "password", "", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", ContributionFragment.ARG_1, "", "getRoomId", "()J", "setRoomId", "(J)V", "sessionId", "getSessionId", "setSessionId", "socketUrlList", "", "getSocketUrlList", "()Ljava/util/List;", "setSocketUrlList", "(Ljava/util/List;)V", "token", "userid", "Ljava/lang/Long;", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "websocketUrlList", "getWebsocketUrlList", "setWebsocketUrlList", "describeContents", "writeToParcel", "", "flags", "CREATOR", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RoomLoginModel implements Parcelable {
    private int apptype;

    @Nullable
    private String password;

    @SerializedName("barid")
    private long roomId;

    @SerializedName("sessionid")
    @Nullable
    private String sessionId;

    @NotNull
    private List<String> socketUrlList;

    @Nullable
    private String token;

    @Nullable
    private Long userid;
    private int version;

    @NotNull
    private List<String> websocketUrlList;

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.yalla.yalla.model.room.RoomLoginModel$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/room/RoomLoginModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/yalla/yalla/model/room/RoomLoginModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/yalla/yalla/model/room/RoomLoginModel;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<RoomLoginModel> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RoomLoginModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RoomLoginModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public RoomLoginModel[] newArray(int size) {
            return new RoomLoginModel[size];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RoomLoginModel() {
        this.password = "";
        this.sessionId = "";
        this.socketUrlList = CollectionsKt.emptyList();
        this.websocketUrlList = CollectionsKt.emptyList();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        this.userid = (Long) o000000O.OooOOo0().getValue();
        this.token = (String) ((MutableLiveData) o000000O.f46703OooOooo.getValue()).getValue();
        this.version = o00Ooo.OooO0OO();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final List<String> getSocketUrlList() {
        return this.socketUrlList;
    }

    @NotNull
    public final List<String> getWebsocketUrlList() {
        return this.websocketUrlList;
    }

    public final void setPassword(@Nullable String str) {
        this.password = str;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    public final void setSocketUrlList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.socketUrlList = list;
    }

    public final void setWebsocketUrlList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.websocketUrlList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.roomId);
        parcel.writeValue(this.userid);
        parcel.writeString(this.token);
        parcel.writeString(this.password);
        parcel.writeInt(this.version);
        parcel.writeInt(this.apptype);
        parcel.writeString(this.sessionId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomLoginModel(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.roomId = parcel.readLong();
        Object value = parcel.readValue(Long.TYPE.getClassLoader());
        this.userid = value instanceof Long ? (Long) value : null;
        this.token = parcel.readString();
        this.password = parcel.readString();
        this.version = parcel.readInt();
        this.apptype = parcel.readInt();
        this.sessionId = parcel.readString();
    }
}
