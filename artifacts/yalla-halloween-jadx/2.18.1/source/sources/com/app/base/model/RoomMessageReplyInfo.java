package com.app.base.model;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 72\u00020\u0001:\u0007789:;<=B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u00103\u001a\u0004\u0018\u00010\u00002\b\u00104\u001a\u0004\u0018\u000105J\b\u00106\u001a\u00020\u001cH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006>"}, d2 = {"Lcom/app/base/model/RoomMessageReplyInfo;", "", "()V", "emoticon", "Lcom/app/base/model/RoomMessageReplyInfo$Emoticon;", "getEmoticon", "()Lcom/app/base/model/RoomMessageReplyInfo$Emoticon;", "setEmoticon", "(Lcom/app/base/model/RoomMessageReplyInfo$Emoticon;)V", "from", "Lcom/app/base/model/RoomMessageReplyInfo$User;", "getFrom", "()Lcom/app/base/model/RoomMessageReplyInfo$User;", "setFrom", "(Lcom/app/base/model/RoomMessageReplyInfo$User;)V", "gifEmoticon", "Lcom/app/base/model/RoomMessageReplyInfo$GifEmoticon;", "getGifEmoticon", "()Lcom/app/base/model/RoomMessageReplyInfo$GifEmoticon;", "setGifEmoticon", "(Lcom/app/base/model/RoomMessageReplyInfo$GifEmoticon;)V", "gift", "Lcom/app/base/model/RoomMessageReplyInfo$Gift;", "getGift", "()Lcom/app/base/model/RoomMessageReplyInfo$Gift;", "setGift", "(Lcom/app/base/model/RoomMessageReplyInfo$Gift;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "pic", "Lcom/app/base/model/RoomMessageReplyInfo$Pic;", "getPic", "()Lcom/app/base/model/RoomMessageReplyInfo$Pic;", "setPic", "(Lcom/app/base/model/RoomMessageReplyInfo$Pic;)V", "replyType", "", "getReplyType", "()I", "setReplyType", "(I)V", ViewHierarchyConstants.TEXT_KEY, "Lcom/app/base/model/RoomMessageReplyInfo$Text;", "getText", "()Lcom/app/base/model/RoomMessageReplyInfo$Text;", "setText", "(Lcom/app/base/model/RoomMessageReplyInfo$Text;)V", "getReplayModel", "replayModel", "Lcom/app/base/model/ChatModel;", "toString", "Companion", "Emoticon", "GifEmoticon", "Gift", "Pic", "Text", "User", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RoomMessageReplyInfo {
    public static final int ReplyType_EmojiGif = 5;
    public static final int ReplyType_Gift = 3;
    public static final int ReplyType_Image = 2;
    public static final int ReplyType_Text = 1;

    @Nullable
    private Emoticon emoticon;

    @Nullable
    private User from;

    @SerializedName("gifEmoticon")
    @Nullable
    private GifEmoticon gifEmoticon;

    @Nullable
    private Gift gift;

    @Nullable
    private String id;

    @Nullable
    private Pic pic;

    @SerializedName("replytype")
    private int replyType = 1;

    @Nullable
    private Text text;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/app/base/model/RoomMessageReplyInfo$Emoticon;", "", "()V", "number", "", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", "uuid", "getUuid", "setUuid", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Emoticon {
        public static final int $stable = 8;

        @NotNull
        private String number = "";

        @NotNull
        private String uuid = "";

        @NotNull
        public final String getNumber() {
            return this.number;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public final void setNumber(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.number = str;
        }

        public final void setUuid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.uuid = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/app/base/model/RoomMessageReplyInfo$GifEmoticon;", "", "()V", "gifId", "", "getGifId", "()Ljava/lang/String;", "setGifId", "(Ljava/lang/String;)V", "gifUrl", "getGifUrl", "setGifUrl", "uuid", "getUuid", "setUuid", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GifEmoticon {
        public static final int $stable = 8;

        @SerializedName("gifurl")
        @NotNull
        private String gifUrl = "";

        @SerializedName("gifid")
        @NotNull
        private String gifId = "";

        @NotNull
        private String uuid = "";

        @NotNull
        public final String getGifId() {
            return this.gifId;
        }

        @NotNull
        public final String getGifUrl() {
            return this.gifUrl;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public final void setGifId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.gifId = str;
        }

        public final void setGifUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.gifUrl = str;
        }

        public final void setUuid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.uuid = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/app/base/model/RoomMessageReplyInfo$Gift;", "", "()V", "giftId", "", "getGiftId", "()I", "setGiftId", "(I)V", "giftUrl", "", "getGiftUrl", "()Ljava/lang/String;", "setGiftUrl", "(Ljava/lang/String;)V", "number", "getNumber", "setNumber", "to", "Lcom/app/base/model/RoomMessageReplyInfo$User;", "getTo", "()Lcom/app/base/model/RoomMessageReplyInfo$User;", "setTo", "(Lcom/app/base/model/RoomMessageReplyInfo$User;)V", "totalNumber", "getTotalNumber", "setTotalNumber", "uuid", "getUuid", "setUuid", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Gift {
        public static final int $stable = 8;

        @SerializedName("giftid")
        private int giftId;
        private int number;

        @Nullable
        private User to;

        @SerializedName("totalnumber")
        private int totalNumber;

        @SerializedName("gifturl")
        @NotNull
        private String giftUrl = "";

        @NotNull
        private String uuid = "";

        public final int getGiftId() {
            return this.giftId;
        }

        @NotNull
        public final String getGiftUrl() {
            return this.giftUrl;
        }

        public final int getNumber() {
            return this.number;
        }

        @Nullable
        public final User getTo() {
            return this.to;
        }

        public final int getTotalNumber() {
            return this.totalNumber;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public final void setGiftId(int i) {
            this.giftId = i;
        }

        public final void setGiftUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.giftUrl = str;
        }

        public final void setNumber(int i) {
            this.number = i;
        }

        public final void setTo(@Nullable User user) {
            this.to = user;
        }

        public final void setTotalNumber(int i) {
            this.totalNumber = i;
        }

        public final void setUuid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.uuid = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/app/base/model/RoomMessageReplyInfo$Pic;", "", "()V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "picHeight", "", "getPicHeight", "()I", "setPicHeight", "(I)V", "picWidth", "getPicWidth", "setPicWidth", "time", "", "getTime", "()J", "setTime", "(J)V", "uuid", "getUuid", "setUuid", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Pic {
        public static final int $stable = 8;

        @SerializedName("picheight")
        private int picHeight;

        @SerializedName("picwidth")
        private int picWidth;
        private long time;

        @NotNull
        private String message = "";

        @NotNull
        private String uuid = "";

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final int getPicHeight() {
            return this.picHeight;
        }

        public final int getPicWidth() {
            return this.picWidth;
        }

        public final long getTime() {
            return this.time;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public final void setMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.message = str;
        }

        public final void setPicHeight(int i) {
            this.picHeight = i;
        }

        public final void setPicWidth(int i) {
            this.picWidth = i;
        }

        public final void setTime(long j) {
            this.time = j;
        }

        public final void setUuid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.uuid = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/app/base/model/RoomMessageReplyInfo$Text;", "", "()V", "at", "", "Lcom/app/base/model/RoomMessageReplyInfo$User;", "getAt", "()Ljava/util/List;", "setAt", "(Ljava/util/List;)V", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage", "setMessage", "uuid", "getUuid", "setUuid", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Text {
        public static final int $stable = 8;

        @SerializedName("aites")
        @Nullable
        private List<User> at;

        @NotNull
        private String message = "";

        @NotNull
        private String lang = "en";

        @NotNull
        private String uuid = "";

        @Nullable
        public final List<User> getAt() {
            return this.at;
        }

        @NotNull
        public final String getLang() {
            return this.lang;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public final void setAt(@Nullable List<User> list) {
            this.at = list;
        }

        public final void setLang(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.lang = str;
        }

        public final void setMessage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.message = str;
        }

        public final void setUuid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.uuid = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/app/base/model/RoomMessageReplyInfo$User;", "", "()V", "bubbleInfo", "Lcom/yalla/yalla/model/RoomUserInfoModel$ChatBubbleInfo;", "getBubbleInfo", "()Lcom/yalla/yalla/model/RoomUserInfoModel$ChatBubbleInfo;", "setBubbleInfo", "(Lcom/yalla/yalla/model/RoomUserInfoModel$ChatBubbleInfo;)V", "pic", "", "getPic", "()Ljava/lang/String;", "setPic", "(Ljava/lang/String;)V", "userId", "", "getUserId", "()J", "setUserId", "(J)V", "userName", "getUserName", "setUserName", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class User {
        public static final int $stable = 8;

        @Nullable
        private RoomUserInfoModel.ChatBubbleInfo bubbleInfo;

        @SerializedName(alternate = {"uid"}, value = "userid")
        private long userId;

        @SerializedName(alternate = {"name"}, value = "username")
        @NotNull
        private String userName = "";

        @SerializedName(alternate = {"pic"}, value = "userpic")
        @NotNull
        private String pic = "";

        @Nullable
        public final RoomUserInfoModel.ChatBubbleInfo getBubbleInfo() {
            return this.bubbleInfo;
        }

        @NotNull
        public final String getPic() {
            return this.pic;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        public final void setBubbleInfo(@Nullable RoomUserInfoModel.ChatBubbleInfo chatBubbleInfo) {
            this.bubbleInfo = chatBubbleInfo;
        }

        public final void setPic(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.pic = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userName = str;
        }
    }

    @Nullable
    public final Emoticon getEmoticon() {
        return this.emoticon;
    }

    @Nullable
    public final User getFrom() {
        return this.from;
    }

    @Nullable
    public final GifEmoticon getGifEmoticon() {
        return this.gifEmoticon;
    }

    @Nullable
    public final Gift getGift() {
        return this.gift;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Pic getPic() {
        return this.pic;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010d  */
    /* JADX WARN: Code duplicated, block: B:31:0x013c  */
    /* JADX WARN: Code duplicated, block: B:34:0x014b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.app.base.model.RoomMessageReplyInfo] */
    @Nullable
    public final RoomMessageReplyInfo getReplayModel(@Nullable ChatModel replayModel) {
        Text text;
        ArrayList<AtUserInfoModel> aites;
        List<User> at;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (replayModel != null) {
            ?? roomMessageReplyInfo = new RoomMessageReplyInfo();
            roomMessageReplyInfo.id = replayModel.id;
            User user = new User();
            user.setUserId(replayModel.from.getUserId());
            user.setUserName(replayModel.from.getUserName());
            user.setPic(replayModel.from.getUserHeader());
            user.setBubbleInfo(replayModel.from.getBubbleInfo());
            roomMessageReplyInfo.from = user;
            int i = replayModel.type;
            String str = "";
            if (i == 0) {
                roomMessageReplyInfo.replyType = 1;
                text = new Text();
                String str2 = replayModel.message;
                Intrinsics.checkNotNullExpressionValue(str2, "model.message");
                text.setMessage(str2);
                String strOooO00o = oo000o.OooO00o();
                Intrinsics.checkNotNullExpressionValue(strOooO00o, "getLanguage()");
                text.setLang(strOooO00o);
                text.setAt(new ArrayList());
                String str3 = replayModel.uuid;
                Intrinsics.checkNotNullExpressionValue(str3, "model.uuid");
                text.setUuid(str3);
                aites = replayModel.aites;
                if (aites != null) {
                    Intrinsics.checkNotNullExpressionValue(aites, "aites");
                    for (AtUserInfoModel atUserInfoModel : aites) {
                        at = text.getAt();
                        if (at != null) {
                            User user2 = new User();
                            user2.setUserId(atUserInfoModel.getUserid());
                            String username = atUserInfoModel.getUsername();
                            Intrinsics.checkNotNullExpressionValue(username, "it.username");
                            user2.setUserName(username);
                            user2.setPic("");
                            at.add(user2);
                        }
                    }
                }
                roomMessageReplyInfo.text = text;
            } else if (i == 1) {
                roomMessageReplyInfo.replyType = 3;
                Gift gift = new Gift();
                gift.setGiftId(replayModel.giftid);
                String str4 = replayModel.uuid;
                Intrinsics.checkNotNullExpressionValue(str4, "model.uuid");
                gift.setUuid(str4);
                String str5 = replayModel.giftUrl;
                if (str5 != null) {
                    Intrinsics.checkNotNullExpressionValue(str5, "model.giftUrl ?: \"\"");
                    str = str5;
                }
                gift.setGiftUrl(str);
                gift.setNumber(replayModel.number);
                gift.setTotalNumber(0);
                User user3 = new User();
                RoomUserInfoModel to = replayModel.to;
                if (to != null) {
                    Intrinsics.checkNotNullExpressionValue(to, "to");
                    user3.setUserId(to.getUserId());
                    user3.setUserName(to.getUserName());
                    user3.setPic(to.getUserHeader());
                }
                gift.setTo(user3);
                roomMessageReplyInfo.gift = gift;
            } else if (i == 7) {
                roomMessageReplyInfo.replyType = 2;
                Pic pic = new Pic();
                String str6 = replayModel.message;
                Intrinsics.checkNotNullExpressionValue(str6, "model.message");
                pic.setMessage(str6);
                String str7 = replayModel.uuid;
                Intrinsics.checkNotNullExpressionValue(str7, "model.uuid");
                pic.setUuid(str7);
                pic.setPicWidth(replayModel.picwidth);
                pic.setPicHeight(replayModel.picheight);
                pic.setTime(replayModel.playTime);
                roomMessageReplyInfo.pic = pic;
            } else if (i == 16) {
                roomMessageReplyInfo.replyType = 5;
                GifEmoticon gifEmoticon = new GifEmoticon();
                ChatMessageOld.Gif gif = replayModel.gif;
                if (gif != null) {
                    Intrinsics.checkNotNullExpressionValue(gif, "gif");
                    String str8 = gif.gifUrl;
                    Intrinsics.checkNotNullExpressionValue(str8, "it.gifUrl");
                    gifEmoticon.setGifUrl(str8);
                    gifEmoticon.setGifId(OooO.OooO0oo(Integer.valueOf(gif.gifId), ""));
                    String str9 = replayModel.uuid;
                    Intrinsics.checkNotNullExpressionValue(str9, "model.uuid");
                    gifEmoticon.setUuid(str9);
                }
                roomMessageReplyInfo.gifEmoticon = gifEmoticon;
            } else if (i == 11 || i == 12) {
                roomMessageReplyInfo.replyType = 1;
                text = new Text();
                String str10 = replayModel.message;
                Intrinsics.checkNotNullExpressionValue(str10, "model.message");
                text.setMessage(str10);
                String strOooO00o2 = oo000o.OooO00o();
                Intrinsics.checkNotNullExpressionValue(strOooO00o2, "getLanguage()");
                text.setLang(strOooO00o2);
                text.setAt(new ArrayList());
                String str11 = replayModel.uuid;
                Intrinsics.checkNotNullExpressionValue(str11, "model.uuid");
                text.setUuid(str11);
                aites = replayModel.aites;
                if (aites != null) {
                    Intrinsics.checkNotNullExpressionValue(aites, "aites");
                    while (r10.hasNext()) {
                        at = text.getAt();
                        if (at != null) {
                            User user4 = new User();
                            user4.setUserId(atUserInfoModel.getUserid());
                            String username2 = atUserInfoModel.getUsername();
                            Intrinsics.checkNotNullExpressionValue(username2, "it.username");
                            user4.setUserName(username2);
                            user4.setPic("");
                            at.add(user4);
                        }
                    }
                }
                roomMessageReplyInfo.text = text;
            }
            objectRef.element = roomMessageReplyInfo;
        }
        return (RoomMessageReplyInfo) objectRef.element;
    }

    public final int getReplyType() {
        return this.replyType;
    }

    @Nullable
    public final Text getText() {
        return this.text;
    }

    public final void setEmoticon(@Nullable Emoticon emoticon) {
        this.emoticon = emoticon;
    }

    public final void setFrom(@Nullable User user) {
        this.from = user;
    }

    public final void setGifEmoticon(@Nullable GifEmoticon gifEmoticon) {
        this.gifEmoticon = gifEmoticon;
    }

    public final void setGift(@Nullable Gift gift) {
        this.gift = gift;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setPic(@Nullable Pic pic) {
        this.pic = pic;
    }

    public final void setReplyType(int i) {
        this.replyType = i;
    }

    public final void setText(@Nullable Text text) {
        this.text = text;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RoomMessageReplyInfo(replyType=");
        sbOooO0o0.append(this.replyType);
        sbOooO0o0.append(", id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", from=");
        sbOooO0o0.append(this.from);
        sbOooO0o0.append(", text=");
        sbOooO0o0.append(this.text);
        sbOooO0o0.append(", emoticon=");
        sbOooO0o0.append(this.emoticon);
        sbOooO0o0.append(", gifEmoticon=");
        sbOooO0o0.append(this.gifEmoticon);
        sbOooO0o0.append(", pic=");
        sbOooO0o0.append(this.pic);
        sbOooO0o0.append(", gift=");
        sbOooO0o0.append(this.gift);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
