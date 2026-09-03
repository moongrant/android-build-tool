package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.fragment.ContributionFragment;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.common.model.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/model/TopRankResponse;", "Model", "Lcom/yalla/yalla/common/model/Response;", "()V", "barName", "", "getBarName", "()Ljava/lang/String;", "setBarName", "(Ljava/lang/String;)V", "imageUrl", "getImageUrl", "setImageUrl", "perHeadFrameUrl", "getPerHeadFrameUrl", "setPerHeadFrameUrl", "perNumber", "getPerNumber", "setPerNumber", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "roomServerIp", "getRoomServerIp", "setRoomServerIp", "str", "getStr", "setStr", "type", "getType", "setType", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TopRankResponse<Model> extends Response<Model> {
    public static final int $stable = 8;

    @SerializedName("barname")
    @NotNull
    private String barName;

    @SerializedName("imageurl")
    @NotNull
    private String imageUrl;

    @SerializedName("perheadframeurl")
    @NotNull
    private String perHeadFrameUrl;

    @SerializedName("pernumber")
    @NotNull
    private String perNumber;

    @SerializedName("roomid")
    @NotNull
    private String roomId;

    @SerializedName("roomserverip")
    @NotNull
    private String roomServerIp;

    @NotNull
    private String str;

    @NotNull
    private String type;

    public TopRankResponse() {
        super(false, null, false, null, 15, null);
        this.perNumber = "";
        this.str = "";
        this.type = "";
        this.imageUrl = "";
        this.perHeadFrameUrl = "";
        this.roomId = "";
        this.barName = "";
        this.roomServerIp = "";
    }

    @NotNull
    public final String getBarName() {
        return this.barName;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getPerHeadFrameUrl() {
        return this.perHeadFrameUrl;
    }

    @NotNull
    public final String getPerNumber() {
        return this.perNumber;
    }

    @NotNull
    public final String getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final String getRoomServerIp() {
        return this.roomServerIp;
    }

    @NotNull
    public final String getStr() {
        return this.str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setBarName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.barName = str;
    }

    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setPerHeadFrameUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perHeadFrameUrl = str;
    }

    public final void setPerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perNumber = str;
    }

    public final void setRoomId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomId = str;
    }

    public final void setRoomServerIp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomServerIp = str;
    }

    public final void setStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.str = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }
}
