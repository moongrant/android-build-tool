package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001e\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u0006-"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentForwardContent;", "Ljava/io/Serializable;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "eventState", "", "getEventState", "()I", "setEventState", "(I)V", "id", "", "getId", "()J", "setId", "(J)V", "image", "getImage", "setImage", "name", "getName", "setName", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "roomIdx", "getRoomIdx", "setRoomIdx", "roomName", "getRoomName", "setRoomName", "shareType", "getShareType", "setShareType", "startTime", "getStartTime", "setStartTime", "url", "getUrl", "setUrl", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentForwardContent implements Serializable {
    public static final int $stable = 8;
    private int eventState;
    private long id;

    @SerializedName("roomid")
    private long roomId;

    @SerializedName("idx")
    private long roomIdx;

    @Nullable
    private String roomName;
    private int shareType;
    private long startTime;

    @Nullable
    private String url;

    @NotNull
    private String name = "";

    @NotNull
    private String content = "";

    @NotNull
    private String image = "";

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final int getEventState() {
        return this.eventState;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getRoomIdx() {
        return this.roomIdx;
    }

    @Nullable
    public final String getRoomName() {
        return this.roomName;
    }

    public final int getShareType() {
        return this.shareType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setEventState(int i) {
        this.eventState = i;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.image = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setRoomIdx(long j) {
        this.roomIdx = j;
    }

    public final void setRoomName(@Nullable String str) {
        this.roomName = str;
    }

    public final void setShareType(int i) {
        this.shareType = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
