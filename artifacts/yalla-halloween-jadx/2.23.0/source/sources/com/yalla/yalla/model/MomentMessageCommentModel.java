package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p579o0oOoo.oO00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 )2\u00020\u0001:\u0005()*+,B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020\u001cH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006-"}, d2 = {"Lcom/yalla/yalla/model/MomentMessageCommentModel;", "Ljava/io/Serializable;", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "comment", "Lcom/yalla/yalla/model/MomentMessageCommentModel$Comment;", "getComment", "()Lcom/yalla/yalla/model/MomentMessageCommentModel$Comment;", "setComment", "(Lcom/yalla/yalla/model/MomentMessageCommentModel$Comment;)V", "from", "Lcom/yalla/yalla/model/MomentMessageCommentModel$User;", "getFrom", "()Lcom/yalla/yalla/model/MomentMessageCommentModel$User;", "setFrom", "(Lcom/yalla/yalla/model/MomentMessageCommentModel$User;)V", "moment", "Lcom/yalla/yalla/model/MomentMessageCommentModel$Moment;", "getMoment", "()Lcom/yalla/yalla/model/MomentMessageCommentModel$Moment;", "setMoment", "(Lcom/yalla/yalla/model/MomentMessageCommentModel$Moment;)V", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "report", "Lcom/yalla/yalla/model/MomentMessageCommentModel$Report;", "getReport", "()Lcom/yalla/yalla/model/MomentMessageCommentModel$Report;", "setReport", "(Lcom/yalla/yalla/model/MomentMessageCommentModel$Report;)V", "toString", "Comment", "Companion", "Moment", "Report", "User", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class MomentMessageCommentModel implements Serializable {
    public static final int CODE_MOMENT_AT_ADD = 4;
    public static final int CODE_MOMENT_AT_REVOKE = -4;
    public static final int CODE_MOMENT_COMMENT_ADD = 1;
    public static final int CODE_MOMENT_COMMENT_REVOKE = -1;
    public static final int CODE_MOMENT_LIKE_ADD = 3;
    public static final int CODE_MOMENT_LIKE_REVOKE = -3;
    public static final int CODE_MOMENT_REVERT_ADD = 2;
    public static final int CODE_MOMENT_REVERT_REVOKE = -2;
    public static final int TYPE_REPORT_CIRCLE = 3;
    public static final int TYPE_REPORT_COMMENT = 2;
    public static final int TYPE_REPORT_MOMENT = 1;
    public static final int TYPE_REWARD_COMMENT = 1;
    public static final int TYPE_REWARD_REPLY = 2;
    public static final int TYPE_TOPIC_GROUP_CREATE = 1;
    public static final int TYPE_TOPIC_GROUP_JOIN = 2;
    private int code;

    @Nullable
    private Comment comment;

    @Nullable
    private User from;

    @Nullable
    private Moment moment;

    @NotNull
    private String msg = "";

    @Nullable
    private Report report;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/MomentMessageCommentModel$Comment;", "", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Comment {
        public static final int $stable = 8;

        @SerializedName("content")
        @NotNull
        private String content = "";

        @SerializedName("cid")
        private long id;

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final long getId() {
            return this.id;
        }

        public final void setContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.content = str;
        }

        public final void setId(long j) {
            this.id = j;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/MomentMessageCommentModel$Moment;", "", "()V", "cid", "", "getCid", "()J", "setCid", "(J)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "id", "getId", "setId", "image", "getImage", "setImage", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Moment {
        public static final int $stable = 8;

        @SerializedName("cid")
        private long cid;

        @SerializedName("id")
        private long id;

        @SerializedName("image")
        @NotNull
        private String image = "";

        @SerializedName("content")
        @NotNull
        private String content = "";

        public final long getCid() {
            return this.cid;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final void setCid(long j) {
            this.cid = j;
        }

        public final void setContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.content = str;
        }

        public final void setId(long j) {
            this.id = j;
        }

        public final void setImage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.image = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/MomentMessageCommentModel$Report;", "", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "name", "getName", "setName", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Report {
        public static final int $stable = 8;

        @SerializedName("id")
        private long id;

        @SerializedName("name")
        @NotNull
        private String name = "";

        @SerializedName("content")
        @NotNull
        private String content = "";

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final void setContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.content = str;
        }

        public final void setId(long j) {
            this.id = j;
        }

        public final void setName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.name = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/MomentMessageCommentModel$User;", "", "()V", "headUrl", "", "getHeadUrl", "()Ljava/lang/String;", "setHeadUrl", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "nickName", "getNickName", "setNickName", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class User {
        public static final int $stable = 8;

        @SerializedName("id")
        private long id;

        @SerializedName("headurl")
        @NotNull
        private String headUrl = "";

        @SerializedName("nickname")
        @NotNull
        private String nickName = "";

        @NotNull
        public final String getHeadUrl() {
            return this.headUrl;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getNickName() {
            return this.nickName;
        }

        public final void setHeadUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.headUrl = str;
        }

        public final void setId(long j) {
            this.id = j;
        }

        public final void setNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.nickName = str;
        }
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Comment getComment() {
        return this.comment;
    }

    @Nullable
    public final User getFrom() {
        return this.from;
    }

    @Nullable
    public final Moment getMoment() {
        return this.moment;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final Report getReport() {
        return this.report;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setComment(@Nullable Comment comment) {
        this.comment = comment;
    }

    public final void setFrom(@Nullable User user) {
        this.from = user;
    }

    public final void setMoment(@Nullable Moment moment) {
        this.moment = moment;
    }

    public final void setMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg = str;
    }

    public final void setReport(@Nullable Report report) {
        this.report = report;
    }

    @NotNull
    public String toString() {
        return oO00Oo0.OooO00o(this);
    }
}
