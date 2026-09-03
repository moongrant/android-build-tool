package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/model/YallaTeamMessageModel;", "", "()V", "data", "Lcom/yalla/yalla/model/YallaTeamMessageModel$Data;", "getData", "()Lcom/yalla/yalla/model/YallaTeamMessageModel$Data;", "setData", "(Lcom/yalla/yalla/model/YallaTeamMessageModel$Data;)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "time", "getTime", "setTime", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "type", "", "getType", "()I", "setType", "(I)V", "uid", "getUid", "setUid", "Data", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class YallaTeamMessageModel {
    public static final int $stable = 8;

    @Nullable
    private Data data;

    @SerializedName("type_code")
    private int type;

    @SerializedName("content")
    @NotNull
    private String message = "";

    @SerializedName("datetime")
    @NotNull
    private String time = "";

    @NotNull
    private String uid = "";

    @NotNull
    private String title = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001a\u00100\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R\u001e\u00103\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#¨\u00066"}, d2 = {"Lcom/yalla/yalla/model/YallaTeamMessageModel$Data;", "", "()V", "buriedPointMessageId", "", "getBuriedPointMessageId", "()Ljava/lang/String;", "setBuriedPointMessageId", "(Ljava/lang/String;)V", "buriedPointSource", "getBuriedPointSource", "setBuriedPointSource", "content", "getContent", "setContent", "coverimage", "getCoverimage", "setCoverimage", "detailimage", "getDetailimage", "setDetailimage", "detailtitle", "getDetailtitle", "setDetailtitle", "jumpid", "getJumpid", "setJumpid", "jumpname", "getJumpname", "setJumpname", "jumptype", "", "getJumptype", "()I", "setJumptype", "(I)V", "jumpurl", "getJumpurl", "setJumpurl", "messageId", "", "getMessageId", "()J", "setMessageId", "(J)V", "messageType", "getMessageType", "setMessageType", "region", "getRegion", "setRegion", "sendNum", "getSendNum", "setSendNum", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Data {
        public static final int $stable = 8;
        private int jumptype;

        @SerializedName("messageid")
        private long messageId;

        @SerializedName("messagetype")
        private int messageType;
        private int region;

        @SerializedName("sendnum")
        private int sendNum;

        @NotNull
        private String content = "";

        @NotNull
        private String jumpid = "";

        @NotNull
        private String jumpname = "";

        @NotNull
        private String jumpurl = "";

        @NotNull
        private String coverimage = "";

        @NotNull
        private String detailimage = "";

        @NotNull
        private String detailtitle = "";

        @SerializedName("source")
        @NotNull
        private String buriedPointSource = "";

        @SerializedName("message_id")
        @NotNull
        private String buriedPointMessageId = "";

        @NotNull
        public final String getBuriedPointMessageId() {
            return this.buriedPointMessageId;
        }

        @NotNull
        public final String getBuriedPointSource() {
            return this.buriedPointSource;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getCoverimage() {
            return this.coverimage;
        }

        @NotNull
        public final String getDetailimage() {
            return this.detailimage;
        }

        @NotNull
        public final String getDetailtitle() {
            return this.detailtitle;
        }

        @NotNull
        public final String getJumpid() {
            return this.jumpid;
        }

        @NotNull
        public final String getJumpname() {
            return this.jumpname;
        }

        public final int getJumptype() {
            return this.jumptype;
        }

        @NotNull
        public final String getJumpurl() {
            return this.jumpurl;
        }

        public final long getMessageId() {
            return this.messageId;
        }

        public final int getMessageType() {
            return this.messageType;
        }

        public final int getRegion() {
            return this.region;
        }

        public final int getSendNum() {
            return this.sendNum;
        }

        public final void setBuriedPointMessageId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.buriedPointMessageId = str;
        }

        public final void setBuriedPointSource(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.buriedPointSource = str;
        }

        public final void setContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.content = str;
        }

        public final void setCoverimage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.coverimage = str;
        }

        public final void setDetailimage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.detailimage = str;
        }

        public final void setDetailtitle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.detailtitle = str;
        }

        public final void setJumpid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.jumpid = str;
        }

        public final void setJumpname(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.jumpname = str;
        }

        public final void setJumptype(int i) {
            this.jumptype = i;
        }

        public final void setJumpurl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.jumpurl = str;
        }

        public final void setMessageId(long j) {
            this.messageId = j;
        }

        public final void setMessageType(int i) {
            this.messageType = i;
        }

        public final void setRegion(int i) {
            this.region = i;
        }

        public final void setSendNum(int i) {
            this.sendNum = i;
        }
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public final void setData(@Nullable Data data) {
        this.data = data;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }
}
