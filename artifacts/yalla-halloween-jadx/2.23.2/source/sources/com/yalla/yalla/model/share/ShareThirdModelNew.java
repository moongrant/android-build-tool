package com.yalla.yalla.model.share;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/model/share/ShareThirdModelNew;", "", "()V", "ShareThirdH5ActivityModel", "ShareThirdRoomModel", "Lcom/yalla/yalla/model/share/ShareThirdModelNew$ShareThirdH5ActivityModel;", "Lcom/yalla/yalla/model/share/ShareThirdModelNew$ShareThirdRoomModel;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ShareThirdModelNew {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/share/ShareThirdModelNew$ShareThirdH5ActivityModel;", "Lcom/yalla/yalla/model/share/ShareThirdModelNew;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "id", "getId", "setId", "idx", "getIdx", "setIdx", "imagesUrl", "getImagesUrl", "setImagesUrl", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "url", "getUrl", "setUrl", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShareThirdH5ActivityModel extends ShareThirdModelNew {
        public static final int $stable = 8;

        @Nullable
        private String content;

        @Nullable
        private String id;

        @Nullable
        private String idx;

        @Nullable
        private String imagesUrl;

        @Nullable
        private String title;

        @Nullable
        private String url;

        public ShareThirdH5ActivityModel() {
            super(null);
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getIdx() {
            return this.idx;
        }

        @Nullable
        public final String getImagesUrl() {
            return this.imagesUrl;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setId(@Nullable String str) {
            this.id = str;
        }

        public final void setIdx(@Nullable String str) {
            this.idx = str;
        }

        public final void setImagesUrl(@Nullable String str) {
            this.imagesUrl = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/share/ShareThirdModelNew$ShareThirdRoomModel;", "Lcom/yalla/yalla/model/share/ShareThirdModelNew;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "imagesUrl", "getImagesUrl", "setImagesUrl", "roomid", "getRoomid", "setRoomid", "roomidx", "getRoomidx", "setRoomidx", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "url", "getUrl", "setUrl", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShareThirdRoomModel extends ShareThirdModelNew {
        public static final int $stable = 8;

        @Nullable
        private String content;

        @Nullable
        private String imagesUrl;

        @Nullable
        private String roomid;

        @Nullable
        private String roomidx;

        @Nullable
        private String title;

        @Nullable
        private String url;

        public ShareThirdRoomModel() {
            super(null);
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getImagesUrl() {
            return this.imagesUrl;
        }

        @Nullable
        public final String getRoomid() {
            return this.roomid;
        }

        @Nullable
        public final String getRoomidx() {
            return this.roomidx;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setImagesUrl(@Nullable String str) {
            this.imagesUrl = str;
        }

        public final void setRoomid(@Nullable String str) {
            this.roomid = str;
        }

        public final void setRoomidx(@Nullable String str) {
            this.roomidx = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    private ShareThirdModelNew() {
    }

    public /* synthetic */ ShareThirdModelNew(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
