package com.yalla.yalla.model.event;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/yalla/yalla/model/event/EventCreateStateModel;", "", "()V", "createToken", "", "getCreateToken", "()Ljava/lang/String;", "setCreateToken", "(Ljava/lang/String;)V", "dayNum", "", "getDayNum", "()I", "setDayNum", "(I)V", "defaultPic", "getDefaultPic", "setDefaultPic", "maxCreateNum", "getMaxCreateNum", "setMaxCreateNum", ContributionFragment.ARG_1, "", "getRoomId", "()J", "setRoomId", "(J)V", "roomIdx", "getRoomIdx", "setRoomIdx", "roomName", "getRoomName", "setRoomName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EventCreateStateModel {
    public static final int $stable = 8;
    private int dayNum;
    private long roomId;

    @SerializedName("idx")
    private long roomIdx;

    @NotNull
    private String defaultPic = "";
    private int maxCreateNum = 10;

    @NotNull
    private String roomName = "";

    @NotNull
    private String createToken = "";

    @NotNull
    public final String getCreateToken() {
        return this.createToken;
    }

    public final int getDayNum() {
        return this.dayNum;
    }

    @NotNull
    public final String getDefaultPic() {
        return this.defaultPic;
    }

    public final int getMaxCreateNum() {
        return this.maxCreateNum;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getRoomIdx() {
        return this.roomIdx;
    }

    @NotNull
    public final String getRoomName() {
        return this.roomName;
    }

    public final void setCreateToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createToken = str;
    }

    public final void setDayNum(int i) {
        this.dayNum = i;
    }

    public final void setDefaultPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.defaultPic = str;
    }

    public final void setMaxCreateNum(int i) {
        this.maxCreateNum = i;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setRoomIdx(long j) {
        this.roomIdx = j;
    }

    public final void setRoomName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomName = str;
    }
}
