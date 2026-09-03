package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\tR\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/model/MomentBannerModel;", "Ljava/io/Serializable;", "()V", "bannerList", "", "Lcom/yalla/yalla/model/MomentBannerModel$MomentBannerItem;", "getBannerList", "()Ljava/util/List;", "seconds", "", "getSeconds", "()J", "setSeconds", "(J)V", "delayTime", "Companion", "MomentBannerItem", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MomentBannerModel implements Serializable {
    public static final int JUMP_TYPE_URL = 0;
    public static final int JUMP_Type_Moment = 2;
    public static final int JUMP_Type_Room = 1;
    public static final int JUMP_Type_Topic = 3;

    @SerializedName("list")
    @Nullable
    private final List<MomentBannerItem> bannerList;
    private long seconds = 4000;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001e\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001e\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/yalla/yalla/model/MomentBannerModel$MomentBannerItem;", "Ljava/io/Serializable;", "()V", "id", "", "getId", "()I", "setId", "(I)V", "imageUrl", "", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "isShare", "setShare", "jumpType", "getJumpType", "setJumpType", "roomServerIp", "getRoomServerIp", "setRoomServerIp", "targetId", "", "getTargetId", "()J", "setTargetId", "(J)V", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "type", "getType", "setType", "url", "getUrl", "setUrl", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class MomentBannerItem implements Serializable {
        public static final int $stable = 8;
        private int id;

        @SerializedName("isShare")
        private int isShare;

        @SerializedName("jumptype")
        private int jumpType;
        private long targetId;
        private int type;

        @SerializedName("imageUrl")
        @NotNull
        private String imageUrl = "";

        @NotNull
        private String url = "";

        @NotNull
        private String title = "";

        @SerializedName("roomServerIp")
        @NotNull
        private String roomServerIp = "";

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final int getJumpType() {
            return this.jumpType;
        }

        @NotNull
        public final String getRoomServerIp() {
            return this.roomServerIp;
        }

        public final long getTargetId() {
            return this.targetId;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: isShare, reason: from getter */
        public final int getIsShare() {
            return this.isShare;
        }

        public final void setId(int i) {
            this.id = i;
        }

        public final void setImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.imageUrl = str;
        }

        public final void setJumpType(int i) {
            this.jumpType = i;
        }

        public final void setRoomServerIp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomServerIp = str;
        }

        public final void setShare(int i) {
            this.isShare = i;
        }

        public final void setTargetId(long j) {
            this.targetId = j;
        }

        public final void setTitle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.title = str;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final void setUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.url = str;
        }
    }

    public final long delayTime() {
        long j = this.seconds;
        if (j <= 0) {
            return 4000L;
        }
        return j * 1000;
    }

    @Nullable
    public final List<MomentBannerItem> getBannerList() {
        return this.bannerList;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final void setSeconds(long j) {
        this.seconds = j;
    }
}
