package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\tR\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/model/BarBannerModel;", "", "()V", "bannerList", "", "Lcom/yalla/yalla/model/BarBannerModel$BarBannerItem;", "getBannerList", "()Ljava/util/List;", "seconds", "", "delayTime", "BarBannerItem", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BarBannerModel {
    public static final int EXTYPE_ROOM = 1;
    public static final int EXTYPE_WEB = 0;
    public static final int TYPE_ORDINARY = 0;
    public static final int TYPE_WEEK_GIFT = 1;

    @SerializedName("list")
    @Nullable
    private final List<BarBannerItem> bannerList;
    private final long seconds = 4;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0016\u0010\u0012\u001a\u00020\b8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0006¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/model/BarBannerModel$BarBannerItem;", "", "()V", "barId", "", "getBarId", "()Ljava/lang/String;", "exType", "", "getExType", "()I", "id", "getId", "setId", "(Ljava/lang/String;)V", "imageUrl", "getImageUrl", "isShare", "jumpType", "getJumpType", "roomServerip", "getRoomServerip", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "type", "getType", "url", "getUrl", "websocketaddr", "getWebsocketaddr", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BarBannerItem {
        public static final int $stable = 8;

        @SerializedName("extype")
        private final int exType;

        @SerializedName("isShare")
        private final int isShare;

        @SerializedName("jumptype")
        private final int jumpType;
        private final int type;

        @SerializedName("imageUrl")
        @NotNull
        private final String imageUrl = "";

        @NotNull
        private final String url = "";

        @NotNull
        private final String title = "";

        @NotNull
        private String id = "";

        @SerializedName("barId")
        @NotNull
        private final String barId = "";

        @SerializedName("roomServerIp")
        @NotNull
        private final String roomServerip = "";

        @NotNull
        private final String websocketaddr = "";

        @NotNull
        public final String getBarId() {
            return this.barId;
        }

        public final int getExType() {
            return this.exType;
        }

        @NotNull
        public final String getId() {
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
        public final String getRoomServerip() {
            return this.roomServerip;
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

        @NotNull
        public final String getWebsocketaddr() {
            return this.websocketaddr;
        }

        /* JADX INFO: renamed from: isShare, reason: from getter */
        public final int getIsShare() {
            return this.isShare;
        }

        public final void setId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
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
    public final List<BarBannerItem> getBannerList() {
        return this.bannerList;
    }
}
