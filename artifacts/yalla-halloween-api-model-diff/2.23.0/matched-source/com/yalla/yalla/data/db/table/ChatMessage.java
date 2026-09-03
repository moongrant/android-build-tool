package com.yalla.yalla.data.db.table;

import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o000Oo0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;
import p028Oooo0oO.o0O00o0;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "mid"})}, primaryKeys = {"uid", "mid"}, tableName = "ChatMessageTable")
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 n2\u00020\u0001:\fnopqrstuvwxyB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010m\u001a\u00020)H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001e\u00101\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR \u00104\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010:\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R \u0010@\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER \u0010F\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR \u0010L\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR \u0010R\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010X\u001a\u00020Y8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010^\u001a\u00020Y8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R\u001e\u0010a\u001a\u00020Y8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010[\"\u0004\bc\u0010]R\u001a\u0010d\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010+\"\u0004\bf\u0010-R \u0010g\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006z"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage;", "", "()V", "contentType", "", "getContentType", "()I", "setContentType", "(I)V", "emoticonInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$EmoticonInfo;", "getEmoticonInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$EmoticonInfo;", "setEmoticonInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$EmoticonInfo;)V", "gifInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$GifInfo;", "getGifInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$GifInfo;", "setGifInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$GifInfo;)V", "giftInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$GiftInfo;", "getGiftInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$GiftInfo;", "setGiftInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$GiftInfo;)V", "giveRoomThemeInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$GiveRoomThemeInfo;", "getGiveRoomThemeInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$GiveRoomThemeInfo;", "setGiveRoomThemeInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$GiveRoomThemeInfo;)V", "isAcceptMsg", "", "()Z", "setAcceptMsg", "(Z)V", "isWarn", "setWarn", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "mid", "getMid", "setMid", "sendState", "getSendState", "setSendState", "shareActivityInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$ShareActivityInfo;", "getShareActivityInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$ShareActivityInfo;", "setShareActivityInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$ShareActivityInfo;)V", "shareEventRoomInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$ShareEventRoomInfo;", "getShareEventRoomInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$ShareEventRoomInfo;", "setShareEventRoomInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$ShareEventRoomInfo;)V", "shareMomentInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$ShareMomentInfo;", "getShareMomentInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$ShareMomentInfo;", "setShareMomentInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$ShareMomentInfo;)V", "shareRoomInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$ShareRoomInfo;", "getShareRoomInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$ShareRoomInfo;", "setShareRoomInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$ShareRoomInfo;)V", "shareTopicInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$ShareTopicInfo;", "getShareTopicInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$ShareTopicInfo;", "setShareTopicInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$ShareTopicInfo;)V", "shareUserInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$ShareUserInfo;", "getShareUserInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$ShareUserInfo;", "setShareUserInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$ShareUserInfo;)V", "targetId", "", "getTargetId", "()J", "setTargetId", "(J)V", "time", "getTime", "setTime", "uid", "getUid", "setUid", "unknownMessage", "getUnknownMessage", "setUnknownMessage", "voiceInfo", "Lcom/yalla/yalla/data/db/table/ChatMessage$VoiceInfo;", "getVoiceInfo", "()Lcom/yalla/yalla/data/db/table/ChatMessage$VoiceInfo;", "setVoiceInfo", "(Lcom/yalla/yalla/data/db/table/ChatMessage$VoiceInfo;)V", "toString", "Companion", "EmoticonInfo", "GifInfo", "GiftInfo", "GiveRoomThemeInfo", "ShareActivityInfo", "ShareEventRoomInfo", "ShareMomentInfo", "ShareRoomInfo", "ShareTopicInfo", "ShareUserInfo", "VoiceInfo", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChatMessage {
    public static final int TYPE_COMMON = 0;
    public static final int TYPE_EMOTION = 3;
    public static final int TYPE_GIF = 4;
    public static final int TYPE_GIFT = 5;
    public static final int TYPE_GIVE_ROOM_THEME = 11;
    public static final int TYPE_SHARE_ACTIVITY = 10;
    public static final int TYPE_SHARE_EVENT_ROOM = 12;
    public static final int TYPE_SHARE_MOMENT = 7;
    public static final int TYPE_SHARE_ROOM = 6;
    public static final int TYPE_SHARE_TOPIC = 8;
    public static final int TYPE_SHARE_USER = 9;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_TO_YALLA_CHAT = 101;
    public static final int TYPE_UNKNOWN = 100;
    public static final int TYPE_VOICE = 2;

    @ColumnInfo(name = "contentType")
    private int contentType;

    @Embedded
    @Nullable
    private EmoticonInfo emoticonInfo;

    @Embedded
    @Nullable
    private GifInfo gifInfo;

    @Embedded
    @Nullable
    private GiftInfo giftInfo;

    @Embedded
    @Nullable
    private GiveRoomThemeInfo giveRoomThemeInfo;

    @ColumnInfo(name = "isWarn")
    private boolean isWarn;

    @ColumnInfo(name = "sendState")
    private int sendState;

    @Embedded
    @Nullable
    private ShareActivityInfo shareActivityInfo;

    @Embedded
    @Nullable
    private ShareEventRoomInfo shareEventRoomInfo;

    @Embedded
    @Nullable
    private ShareMomentInfo shareMomentInfo;

    @Embedded
    @Nullable
    private ShareRoomInfo shareRoomInfo;

    @Embedded
    @Nullable
    private ShareTopicInfo shareTopicInfo;

    @Embedded
    @Nullable
    private ShareUserInfo shareUserInfo;

    @ColumnInfo(name = "targetId")
    private long targetId;

    @ColumnInfo(name = "time")
    private long time;

    @ColumnInfo(name = "uid")
    private long uid;

    @Embedded
    @Nullable
    private VoiceInfo voiceInfo;
    public static final int $stable = 8;

    @ColumnInfo(name = "mid")
    @NotNull
    private String mid = "";

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    @NotNull
    private String message = "";

    @ColumnInfo(name = "isAcceptMsg")
    private boolean isAcceptMsg = true;

    @NotNull
    private String unknownMessage = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$EmoticonInfo;", "", "()V", "emoticonIsRead", "", "getEmoticonIsRead", "()Z", "setEmoticonIsRead", "(Z)V", "emoticonType", "", "getEmoticonType", "()I", "setEmoticonType", "(I)V", "emoticonValue", "getEmoticonValue", "setEmoticonValue", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EmoticonInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "emoticonIsRead")
        private boolean emoticonIsRead;

        @ColumnInfo(name = "emoticonType")
        private int emoticonType;

        @ColumnInfo(name = "emoticonValue")
        private int emoticonValue;

        public final boolean getEmoticonIsRead() {
            return this.emoticonIsRead;
        }

        public final int getEmoticonType() {
            return this.emoticonType;
        }

        public final int getEmoticonValue() {
            return this.emoticonValue;
        }

        public final void setEmoticonIsRead(boolean z) {
            this.emoticonIsRead = z;
        }

        public final void setEmoticonType(int i) {
            this.emoticonType = i;
        }

        public final void setEmoticonValue(int i) {
            this.emoticonValue = i;
        }

        @NotNull
        public String toString() {
            int i = this.emoticonType;
            int i2 = this.emoticonValue;
            boolean z = this.emoticonIsRead;
            StringBuilder sbOooO00o = o00000.OooO00o("EmoticonInfo(emoticonType=", i, ", emoticonValue=", i2, ", emoticonIsRead=");
            sbOooO00o.append(z);
            sbOooO00o.append(")");
            return sbOooO00o.toString();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$GifInfo;", "", "()V", "gifId", "", "getGifId", "()I", "setGifId", "(I)V", "gifUrl", "", "getGifUrl", "()Ljava/lang/String;", "setGifUrl", "(Ljava/lang/String;)V", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GifInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "gifId")
        private int gifId;

        @ColumnInfo(name = "gifUrl")
        @NotNull
        private String gifUrl = "";

        public final int getGifId() {
            return this.gifId;
        }

        @NotNull
        public final String getGifUrl() {
            return this.gifUrl;
        }

        public final void setGifId(int i) {
            this.gifId = i;
        }

        public final void setGifUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.gifUrl = str;
        }

        @NotNull
        public String toString() {
            return "GifInfo(gifId=" + this.gifId + ", gifUrl='" + this.gifUrl + "')";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$GiftInfo;", "", "()V", "giftId", "", "getGiftId", "()I", "setGiftId", "(I)V", "giftNumber", "getGiftNumber", "setGiftNumber", "giftUrl", "", "getGiftUrl", "()Ljava/lang/String;", "setGiftUrl", "(Ljava/lang/String;)V", "isGiftBackpack", "", "()Ljava/lang/Boolean;", "setGiftBackpack", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isGiftBlind", "setGiftBlind", "isGiftBlindBox", "setGiftBlindBox", "isGiftCustomMade", "setGiftCustomMade", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GiftInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "giftId")
        private int giftId;

        @ColumnInfo(name = "giftNumber")
        private int giftNumber;

        @ColumnInfo(name = "giftUrl")
        @NotNull
        private String giftUrl = "";

        @ColumnInfo(name = "isGiftBackpack")
        @Nullable
        private Boolean isGiftBackpack;

        @ColumnInfo(name = "isGiftBlind")
        @Nullable
        private Boolean isGiftBlind;

        @ColumnInfo(name = "isGiftBlindBox")
        @Nullable
        private Boolean isGiftBlindBox;

        @ColumnInfo(name = "isGiftCustomMade")
        @Nullable
        private Boolean isGiftCustomMade;

        public GiftInfo() {
            Boolean bool = Boolean.FALSE;
            this.isGiftBlind = bool;
            this.isGiftBlindBox = bool;
            this.isGiftBackpack = bool;
            this.isGiftCustomMade = bool;
        }

        public final int getGiftId() {
            return this.giftId;
        }

        public final int getGiftNumber() {
            return this.giftNumber;
        }

        @NotNull
        public final String getGiftUrl() {
            return this.giftUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: isGiftBackpack, reason: from getter */
        public final Boolean getIsGiftBackpack() {
            return this.isGiftBackpack;
        }

        @Nullable
        /* JADX INFO: renamed from: isGiftBlind, reason: from getter */
        public final Boolean getIsGiftBlind() {
            return this.isGiftBlind;
        }

        @Nullable
        /* JADX INFO: renamed from: isGiftBlindBox, reason: from getter */
        public final Boolean getIsGiftBlindBox() {
            return this.isGiftBlindBox;
        }

        @Nullable
        /* JADX INFO: renamed from: isGiftCustomMade, reason: from getter */
        public final Boolean getIsGiftCustomMade() {
            return this.isGiftCustomMade;
        }

        public final void setGiftBackpack(@Nullable Boolean bool) {
            this.isGiftBackpack = bool;
        }

        public final void setGiftBlind(@Nullable Boolean bool) {
            this.isGiftBlind = bool;
        }

        public final void setGiftBlindBox(@Nullable Boolean bool) {
            this.isGiftBlindBox = bool;
        }

        public final void setGiftCustomMade(@Nullable Boolean bool) {
            this.isGiftCustomMade = bool;
        }

        public final void setGiftId(int i) {
            this.giftId = i;
        }

        public final void setGiftNumber(int i) {
            this.giftNumber = i;
        }

        public final void setGiftUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.giftUrl = str;
        }

        @NotNull
        public String toString() {
            int i = this.giftId;
            int i2 = this.giftNumber;
            return o0O00o0.OooO0O0(o00000.OooO00o("GiftInfo(giftId=", i, ", giftNumber=", i2, ",giftUrl="), this.giftUrl, ")");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006#"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$GiveRoomThemeInfo;", "", "()V", "themeBgImgUrl", "", "getThemeBgImgUrl", "()Ljava/lang/String;", "setThemeBgImgUrl", "(Ljava/lang/String;)V", "themeBgName", "getThemeBgName", "setThemeBgName", "themeDayLimit", "", "getThemeDayLimit", "()I", "setThemeDayLimit", "(I)V", "themeExpireTime", "", "getThemeExpireTime", "()J", "setThemeExpireTime", "(J)V", "themeGiveId", "getThemeGiveId", "setThemeGiveId", "themeState", "getThemeState", "setThemeState", "themeVideoUrl", "getThemeVideoUrl", "setThemeVideoUrl", "toString", "ThemeState", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GiveRoomThemeInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "themeDayLimit")
        private int themeDayLimit;

        @ColumnInfo(name = "themeExpireTime")
        private long themeExpireTime;

        @ColumnInfo(name = "themeGiveId")
        private long themeGiveId;

        @ColumnInfo(name = "themeState")
        private int themeState;

        @ColumnInfo(name = "themeBgName")
        @NotNull
        private String themeBgName = "";

        @ColumnInfo(name = "themeBgImgUrl")
        @NotNull
        private String themeBgImgUrl = "";

        @ColumnInfo(name = "themeVideoUrl")
        @NotNull
        private String themeVideoUrl = "";

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$GiveRoomThemeInfo$ThemeState;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "ThemeNotReceive", "ThemeHasReceived", "ThemeHasExpired", "ThemeHasReturn", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum ThemeState {
            ThemeNotReceive(0),
            ThemeHasReceived(1),
            ThemeHasExpired(2),
            ThemeHasReturn(3);

            private final int value;

            ThemeState(int i) {
                this.value = i;
            }

            public final int getValue() {
                return this.value;
            }
        }

        @NotNull
        public final String getThemeBgImgUrl() {
            return this.themeBgImgUrl;
        }

        @NotNull
        public final String getThemeBgName() {
            return this.themeBgName;
        }

        public final int getThemeDayLimit() {
            return this.themeDayLimit;
        }

        public final long getThemeExpireTime() {
            return this.themeExpireTime;
        }

        public final long getThemeGiveId() {
            return this.themeGiveId;
        }

        public final int getThemeState() {
            return this.themeState;
        }

        @NotNull
        public final String getThemeVideoUrl() {
            return this.themeVideoUrl;
        }

        public final void setThemeBgImgUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.themeBgImgUrl = str;
        }

        public final void setThemeBgName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.themeBgName = str;
        }

        public final void setThemeDayLimit(int i) {
            this.themeDayLimit = i;
        }

        public final void setThemeExpireTime(long j) {
            this.themeExpireTime = j;
        }

        public final void setThemeGiveId(long j) {
            this.themeGiveId = j;
        }

        public final void setThemeState(int i) {
            this.themeState = i;
        }

        public final void setThemeVideoUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.themeVideoUrl = str;
        }

        @NotNull
        public String toString() {
            String str = this.themeBgName;
            String str2 = this.themeBgImgUrl;
            String str3 = this.themeVideoUrl;
            int i = this.themeDayLimit;
            long j = this.themeExpireTime;
            long j2 = this.themeGiveId;
            int i2 = this.themeState;
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("themeBgName=", str, ",themeBgImgUrl=", str2, ",themeVideoUrl=");
            sbOooO0OO.append(str3);
            sbOooO0OO.append(",giveThemeDayLimit=");
            sbOooO0OO.append(i);
            sbOooO0OO.append(",giveThemeExpireTime=");
            sbOooO0OO.append(j);
            OooO0O0.OooO00o(sbOooO0OO, ",themeGiveId=", j2, ",themeState=");
            sbOooO0OO.append(i2);
            return sbOooO0OO.toString();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$ShareActivityInfo;", "", "()V", "activity", "", "getActivity", "()I", "setActivity", "(I)V", "activityImage", "", "getActivityImage", "()Ljava/lang/String;", "setActivityImage", "(Ljava/lang/String;)V", "activityMsg", "getActivityMsg", "setActivityMsg", "activityText1", "getActivityText1", "setActivityText1", "activityText2", "getActivityText2", "setActivityText2", "activityUrl", "getActivityUrl", "setActivityUrl", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShareActivityInfo {
        public static final int $stable = 8;

        @Ignore
        private int activity;

        @ColumnInfo(name = "activityImage")
        @NotNull
        private String activityImage = "";

        @ColumnInfo(name = "activityText1")
        @NotNull
        private String activityText1 = "";

        @ColumnInfo(name = "activityText2")
        @NotNull
        private String activityText2 = "";

        @ColumnInfo(name = "activityMsg")
        @NotNull
        private String activityMsg = "";

        @ColumnInfo(name = "activityUrl")
        @NotNull
        private String activityUrl = "";

        public final int getActivity() {
            return this.activity;
        }

        @NotNull
        public final String getActivityImage() {
            return this.activityImage;
        }

        @NotNull
        public final String getActivityMsg() {
            return this.activityMsg;
        }

        @NotNull
        public final String getActivityText1() {
            return this.activityText1;
        }

        @NotNull
        public final String getActivityText2() {
            return this.activityText2;
        }

        @NotNull
        public final String getActivityUrl() {
            return this.activityUrl;
        }

        public final void setActivity(int i) {
            this.activity = i;
        }

        public final void setActivityImage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.activityImage = str;
        }

        public final void setActivityMsg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.activityMsg = str;
        }

        public final void setActivityText1(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.activityText1 = str;
        }

        public final void setActivityText2(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.activityText2 = str;
        }

        public final void setActivityUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.activityUrl = str;
        }

        @NotNull
        public String toString() {
            String str = this.activityImage;
            String str2 = this.activityText1;
            String str3 = this.activityText2;
            String str4 = this.activityMsg;
            String str5 = this.activityUrl;
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("ShareActivityInfo(activityImage='", str, "', activityText1='", str2, "', activityText2='");
            OooO0OO.OooO0O0.OooO00o(sbOooO0OO, str3, "', activityMsg='", str4, "', activityUrl='");
            return o0O00o0.OooO0O0(sbOooO0OO, str5, "')");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001e\u0010&\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011R\u001e\u0010)\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011¨\u0006-"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$ShareEventRoomInfo;", "", "()V", "eventEndTime", "", "getEventEndTime", "()J", "setEventEndTime", "(J)V", "eventId", "getEventId", "setEventId", "eventImageUrl", "", "getEventImageUrl", "()Ljava/lang/String;", "setEventImageUrl", "(Ljava/lang/String;)V", "eventName", "getEventName", "setEventName", "eventStartTime", "getEventStartTime", "setEventStartTime", "eventTagId", "", "getEventTagId", "()I", "setEventTagId", "(I)V", "isDeleted", "", "()Z", "setDeleted", "(Z)V", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "roomIp", "getRoomIp", "setRoomIp", "roomName", "getRoomName", "setRoomName", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShareEventRoomInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "eventEndTime")
        private long eventEndTime;

        @ColumnInfo(name = "eventId")
        private long eventId;

        @ColumnInfo(name = "eventStartTime")
        private long eventStartTime;

        @ColumnInfo(name = "eventTagId")
        private int eventTagId;

        @ColumnInfo(name = "eventDeleted")
        private boolean isDeleted;

        @ColumnInfo(name = "eventRoomId")
        private long roomId;

        @ColumnInfo(name = "eventName")
        @NotNull
        private String eventName = "";

        @ColumnInfo(name = "eventImageUrl")
        @NotNull
        private String eventImageUrl = "";

        @ColumnInfo(name = "eventRoomName")
        @NotNull
        private String roomName = "";

        @ColumnInfo(name = "eventRoomIp")
        @NotNull
        private String roomIp = "";

        public final long getEventEndTime() {
            return this.eventEndTime;
        }

        public final long getEventId() {
            return this.eventId;
        }

        @NotNull
        public final String getEventImageUrl() {
            return this.eventImageUrl;
        }

        @NotNull
        public final String getEventName() {
            return this.eventName;
        }

        public final long getEventStartTime() {
            return this.eventStartTime;
        }

        public final int getEventTagId() {
            return this.eventTagId;
        }

        public final long getRoomId() {
            return this.roomId;
        }

        @NotNull
        public final String getRoomIp() {
            return this.roomIp;
        }

        @NotNull
        public final String getRoomName() {
            return this.roomName;
        }

        /* JADX INFO: renamed from: isDeleted, reason: from getter */
        public final boolean getIsDeleted() {
            return this.isDeleted;
        }

        public final void setDeleted(boolean z) {
            this.isDeleted = z;
        }

        public final void setEventEndTime(long j) {
            this.eventEndTime = j;
        }

        public final void setEventId(long j) {
            this.eventId = j;
        }

        public final void setEventImageUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.eventImageUrl = str;
        }

        public final void setEventName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.eventName = str;
        }

        public final void setEventStartTime(long j) {
            this.eventStartTime = j;
        }

        public final void setEventTagId(int i) {
            this.eventTagId = i;
        }

        public final void setRoomId(long j) {
            this.roomId = j;
        }

        public final void setRoomIp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomIp = str;
        }

        public final void setRoomName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomName = str;
        }

        @NotNull
        public String toString() {
            long j = this.eventId;
            String str = this.eventName;
            String str2 = this.eventImageUrl;
            int i = this.eventTagId;
            long j2 = this.eventStartTime;
            long j3 = this.eventEndTime;
            long j4 = this.roomId;
            String str3 = this.roomName;
            String str4 = this.roomIp;
            boolean z = this.isDeleted;
            StringBuilder sb = new StringBuilder("ShareEventRoomInfo(eventId=");
            sb.append(j);
            sb.append(", eventName='");
            sb.append(str);
            sb.append("', eventImageUrl='");
            sb.append(str2);
            sb.append("', eventTagId=");
            sb.append(i);
            OooO0O0.OooO00o(sb, ", eventStartTime=", j2, ", eventEndTime=");
            sb.append(j3);
            OooO0O0.OooO00o(sb, ", roomId=", j4, ", roomName='");
            OooO0OO.OooO0O0.OooO00o(sb, str3, "', roomIp='", str4, "', isDeleted=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$ShareMomentInfo;", "", "()V", "momentId", "", "getMomentId", "()J", "setMomentId", "(J)V", "momentImage", "", "getMomentImage", "()Ljava/lang/String;", "setMomentImage", "(Ljava/lang/String;)V", "momentMsg", "getMomentMsg", "setMomentMsg", "momentText", "getMomentText", "setMomentText", "momentType", "", "getMomentType", "()I", "setMomentType", "(I)V", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShareMomentInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "momentId")
        private long momentId;

        @ColumnInfo(name = "momentType")
        private int momentType;

        @ColumnInfo(name = "momentImage")
        @NotNull
        private String momentImage = "";

        @ColumnInfo(name = "momentText")
        @NotNull
        private String momentText = "";

        @ColumnInfo(name = "momentMsg")
        @NotNull
        private String momentMsg = "";

        public final long getMomentId() {
            return this.momentId;
        }

        @NotNull
        public final String getMomentImage() {
            return this.momentImage;
        }

        @NotNull
        public final String getMomentMsg() {
            return this.momentMsg;
        }

        @NotNull
        public final String getMomentText() {
            return this.momentText;
        }

        public final int getMomentType() {
            return this.momentType;
        }

        public final void setMomentId(long j) {
            this.momentId = j;
        }

        public final void setMomentImage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentImage = str;
        }

        public final void setMomentMsg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentMsg = str;
        }

        public final void setMomentText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.momentText = str;
        }

        public final void setMomentType(int i) {
            this.momentType = i;
        }

        @NotNull
        public String toString() {
            long j = this.momentId;
            String str = this.momentImage;
            String str2 = this.momentText;
            String str3 = this.momentMsg;
            int i = this.momentType;
            StringBuilder sb = new StringBuilder("ShareMomentInfo(momentId=");
            sb.append(j);
            sb.append(", momentImage='");
            sb.append(str);
            OooO0OO.OooO0O0.OooO00o(sb, "', momentText='", str2, "', momentMsg='", str3);
            sb.append("', momentType='");
            sb.append(i);
            sb.append("')");
            return sb.toString();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$ShareRoomInfo;", "", "()V", "roomHeader", "", "getRoomHeader", "()Ljava/lang/String;", "setRoomHeader", "(Ljava/lang/String;)V", ContributionFragment.ARG_1, "", "getRoomId", "()J", "setRoomId", "(J)V", "roomIdx", "getRoomIdx", "setRoomIdx", "roomIp", "getRoomIp", "setRoomIp", "roomName", "getRoomName", "setRoomName", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShareRoomInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = ContributionFragment.ARG_1)
        private long roomId;

        @ColumnInfo(name = "roomIdx")
        private long roomIdx;

        @ColumnInfo(name = "roomHeader")
        @NotNull
        private String roomHeader = "";

        @ColumnInfo(name = "roomName")
        @NotNull
        private String roomName = "";

        @ColumnInfo(name = "roomIp")
        @NotNull
        private String roomIp = "";

        @NotNull
        public final String getRoomHeader() {
            return this.roomHeader;
        }

        public final long getRoomId() {
            return this.roomId;
        }

        public final long getRoomIdx() {
            return this.roomIdx;
        }

        @NotNull
        public final String getRoomIp() {
            return this.roomIp;
        }

        @NotNull
        public final String getRoomName() {
            return this.roomName;
        }

        public final void setRoomHeader(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomHeader = str;
        }

        public final void setRoomId(long j) {
            this.roomId = j;
        }

        public final void setRoomIdx(long j) {
            this.roomIdx = j;
        }

        public final void setRoomIp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomIp = str;
        }

        public final void setRoomName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomName = str;
        }

        @NotNull
        public String toString() {
            String str = this.roomHeader;
            String str2 = this.roomName;
            long j = this.roomId;
            long j2 = this.roomIdx;
            String str3 = this.roomIp;
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("ShareRoomInfo(roomHeader='", str, "', roomName='", str2, "', roomId=");
            sbOooO0OO.append(j);
            OooO0O0.OooO00o(sbOooO0OO, ", roomIdx=", j2, ", roomIp='");
            return o0O00o0.OooO0O0(sbOooO0OO, str3, "')");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$ShareTopicInfo;", "", "()V", "topicId", "", "getTopicId", "()J", "setTopicId", "(J)V", "topicImage", "", "getTopicImage", "()Ljava/lang/String;", "setTopicImage", "(Ljava/lang/String;)V", "topicMomentCount", "", "getTopicMomentCount", "()I", "setTopicMomentCount", "(I)V", "topicMsg", "getTopicMsg", "setTopicMsg", "topicName", "getTopicName", "setTopicName", "topicUserCount", "getTopicUserCount", "setTopicUserCount", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShareTopicInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "topicId")
        private long topicId;

        @ColumnInfo(name = "topicMomentCount")
        private int topicMomentCount;

        @ColumnInfo(name = "topicUserCount")
        private int topicUserCount;

        @ColumnInfo(name = "topicImage")
        @NotNull
        private String topicImage = "";

        @ColumnInfo(name = "topicName")
        @NotNull
        private String topicName = "";

        @ColumnInfo(name = "topicMsg")
        @NotNull
        private String topicMsg = "";

        public final long getTopicId() {
            return this.topicId;
        }

        @NotNull
        public final String getTopicImage() {
            return this.topicImage;
        }

        public final int getTopicMomentCount() {
            return this.topicMomentCount;
        }

        @NotNull
        public final String getTopicMsg() {
            return this.topicMsg;
        }

        @NotNull
        public final String getTopicName() {
            return this.topicName;
        }

        public final int getTopicUserCount() {
            return this.topicUserCount;
        }

        public final void setTopicId(long j) {
            this.topicId = j;
        }

        public final void setTopicImage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicImage = str;
        }

        public final void setTopicMomentCount(int i) {
            this.topicMomentCount = i;
        }

        public final void setTopicMsg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicMsg = str;
        }

        public final void setTopicName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.topicName = str;
        }

        public final void setTopicUserCount(int i) {
            this.topicUserCount = i;
        }

        @NotNull
        public String toString() {
            return "ShareTopicInfo(topicId=" + this.topicId + ", topicImage='" + this.topicImage + "', topicName='" + this.topicName + "', topicUserCount=" + this.topicUserCount + ", topicMomentCount=" + this.topicMomentCount + ", topicMsg='" + this.topicMsg + "')";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$ShareUserInfo;", "", "()V", "userHead", "", "getUserHead", "()Ljava/lang/String;", "setUserHead", "(Ljava/lang/String;)V", "userId", "", "getUserId", "()J", "setUserId", "(J)V", "userIdx", "getUserIdx", "setUserIdx", "userMsg", "getUserMsg", "setUserMsg", "userName", "getUserName", "setUserName", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShareUserInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "shareUserId")
        private long userId;

        @ColumnInfo(name = "shareUserIdx")
        private long userIdx;

        @ColumnInfo(name = "shareUserHead")
        @NotNull
        private String userHead = "";

        @ColumnInfo(name = "shareUserName")
        @NotNull
        private String userName = "";

        @ColumnInfo(name = "shareUserMessage")
        @NotNull
        private String userMsg = "";

        @NotNull
        public final String getUserHead() {
            return this.userHead;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final long getUserIdx() {
            return this.userIdx;
        }

        @NotNull
        public final String getUserMsg() {
            return this.userMsg;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        public final void setUserHead(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHead = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserIdx(long j) {
            this.userIdx = j;
        }

        public final void setUserMsg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userMsg = str;
        }

        public final void setUserName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userName = str;
        }

        @NotNull
        public String toString() {
            long j = this.userId;
            long j2 = this.userIdx;
            String str = this.userHead;
            String str2 = this.userName;
            String str3 = this.userMsg;
            StringBuilder sbOooO00o = o00O0000.OooO00o("ShareUserInfo(userId=", j, ", userIdx=");
            sbOooO00o.append(j2);
            sbOooO00o.append(", userHead='");
            sbOooO00o.append(str);
            OooO0OO.OooO0O0.OooO00o(sbOooO00o, "', userName='", str2, "', userMsg='", str3);
            sbOooO00o.append("')");
            return sbOooO00o.toString();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$VoiceInfo;", "", "()V", "filename", "", "getFilename", "()Ljava/lang/String;", "setFilename", "(Ljava/lang/String;)V", "isVoiceRead", "", "()Z", "setVoiceRead", "(Z)V", "playState", "Lcom/yalla/yalla/data/db/table/ChatMessage$VoiceInfo$PlayState;", "getPlayState", "()Lcom/yalla/yalla/data/db/table/ChatMessage$VoiceInfo$PlayState;", "setPlayState", "(Lcom/yalla/yalla/data/db/table/ChatMessage$VoiceInfo$PlayState;)V", "voiceDuration", "", "getVoiceDuration", "()J", "setVoiceDuration", "(J)V", "voiceUrl", "getVoiceUrl", "setVoiceUrl", "toString", "PlayState", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class VoiceInfo {
        public static final int $stable = 8;

        @ColumnInfo(name = "isVoiceRead")
        private boolean isVoiceRead;

        @ColumnInfo(name = "voiceDuration")
        private long voiceDuration;

        @ColumnInfo(name = "voiceUrl")
        @NotNull
        private String voiceUrl = "";

        @ColumnInfo(name = "voiceFileName")
        @NotNull
        private String filename = "";

        @Ignore
        @NotNull
        private PlayState playState = PlayState.Stop;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/data/db/table/ChatMessage$VoiceInfo$PlayState;", "", "(Ljava/lang/String;I)V", "Stop", "Download", "Playing", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum PlayState {
            Stop,
            Download,
            Playing
        }

        @NotNull
        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        public final PlayState getPlayState() {
            return this.playState;
        }

        public final long getVoiceDuration() {
            return this.voiceDuration;
        }

        @NotNull
        public final String getVoiceUrl() {
            return this.voiceUrl;
        }

        /* JADX INFO: renamed from: isVoiceRead, reason: from getter */
        public final boolean getIsVoiceRead() {
            return this.isVoiceRead;
        }

        public final void setFilename(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.filename = str;
        }

        public final void setPlayState(@NotNull PlayState playState) {
            Intrinsics.checkNotNullParameter(playState, "<set-?>");
            this.playState = playState;
        }

        public final void setVoiceDuration(long j) {
            this.voiceDuration = j;
        }

        public final void setVoiceRead(boolean z) {
            this.isVoiceRead = z;
        }

        public final void setVoiceUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.voiceUrl = str;
        }

        @NotNull
        public String toString() {
            return "VoiceInfo(voiceUrl='" + this.voiceUrl + "', voiceDuration=" + this.voiceDuration + ", filename='" + this.filename + "', isVoiceRead=" + this.isVoiceRead + ")";
        }
    }

    public final int getContentType() {
        return this.contentType;
    }

    @Nullable
    public final EmoticonInfo getEmoticonInfo() {
        return this.emoticonInfo;
    }

    @Nullable
    public final GifInfo getGifInfo() {
        return this.gifInfo;
    }

    @Nullable
    public final GiftInfo getGiftInfo() {
        return this.giftInfo;
    }

    @Nullable
    public final GiveRoomThemeInfo getGiveRoomThemeInfo() {
        return this.giveRoomThemeInfo;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    public final int getSendState() {
        return this.sendState;
    }

    @Nullable
    public final ShareActivityInfo getShareActivityInfo() {
        return this.shareActivityInfo;
    }

    @Nullable
    public final ShareEventRoomInfo getShareEventRoomInfo() {
        return this.shareEventRoomInfo;
    }

    @Nullable
    public final ShareMomentInfo getShareMomentInfo() {
        return this.shareMomentInfo;
    }

    @Nullable
    public final ShareRoomInfo getShareRoomInfo() {
        return this.shareRoomInfo;
    }

    @Nullable
    public final ShareTopicInfo getShareTopicInfo() {
        return this.shareTopicInfo;
    }

    @Nullable
    public final ShareUserInfo getShareUserInfo() {
        return this.shareUserInfo;
    }

    public final long getTargetId() {
        return this.targetId;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getUid() {
        return this.uid;
    }

    @NotNull
    public final String getUnknownMessage() {
        return this.unknownMessage;
    }

    @Nullable
    public final VoiceInfo getVoiceInfo() {
        return this.voiceInfo;
    }

    /* JADX INFO: renamed from: isAcceptMsg, reason: from getter */
    public final boolean getIsAcceptMsg() {
        return this.isAcceptMsg;
    }

    /* JADX INFO: renamed from: isWarn, reason: from getter */
    public final boolean getIsWarn() {
        return this.isWarn;
    }

    public final void setAcceptMsg(boolean z) {
        this.isAcceptMsg = z;
    }

    public final void setContentType(int i) {
        this.contentType = i;
    }

    public final void setEmoticonInfo(@Nullable EmoticonInfo emoticonInfo) {
        this.emoticonInfo = emoticonInfo;
    }

    public final void setGifInfo(@Nullable GifInfo gifInfo) {
        this.gifInfo = gifInfo;
    }

    public final void setGiftInfo(@Nullable GiftInfo giftInfo) {
        this.giftInfo = giftInfo;
    }

    public final void setGiveRoomThemeInfo(@Nullable GiveRoomThemeInfo giveRoomThemeInfo) {
        this.giveRoomThemeInfo = giveRoomThemeInfo;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setMid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mid = str;
    }

    public final void setSendState(int i) {
        this.sendState = i;
    }

    public final void setShareActivityInfo(@Nullable ShareActivityInfo shareActivityInfo) {
        this.shareActivityInfo = shareActivityInfo;
    }

    public final void setShareEventRoomInfo(@Nullable ShareEventRoomInfo shareEventRoomInfo) {
        this.shareEventRoomInfo = shareEventRoomInfo;
    }

    public final void setShareMomentInfo(@Nullable ShareMomentInfo shareMomentInfo) {
        this.shareMomentInfo = shareMomentInfo;
    }

    public final void setShareRoomInfo(@Nullable ShareRoomInfo shareRoomInfo) {
        this.shareRoomInfo = shareRoomInfo;
    }

    public final void setShareTopicInfo(@Nullable ShareTopicInfo shareTopicInfo) {
        this.shareTopicInfo = shareTopicInfo;
    }

    public final void setShareUserInfo(@Nullable ShareUserInfo shareUserInfo) {
        this.shareUserInfo = shareUserInfo;
    }

    public final void setTargetId(long j) {
        this.targetId = j;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    public final void setUnknownMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.unknownMessage = str;
    }

    public final void setVoiceInfo(@Nullable VoiceInfo voiceInfo) {
        this.voiceInfo = voiceInfo;
    }

    public final void setWarn(boolean z) {
        this.isWarn = z;
    }

    @NotNull
    public String toString() {
        long j = this.uid;
        String str = this.mid;
        long j2 = this.targetId;
        int i = this.contentType;
        String str2 = this.message;
        long j3 = this.time;
        int i2 = this.sendState;
        boolean z = this.isWarn;
        boolean z2 = this.isAcceptMsg;
        VoiceInfo voiceInfo = this.voiceInfo;
        EmoticonInfo emoticonInfo = this.emoticonInfo;
        GiftInfo giftInfo = this.giftInfo;
        GifInfo gifInfo = this.gifInfo;
        ShareRoomInfo shareRoomInfo = this.shareRoomInfo;
        ShareMomentInfo shareMomentInfo = this.shareMomentInfo;
        ShareTopicInfo shareTopicInfo = this.shareTopicInfo;
        ShareUserInfo shareUserInfo = this.shareUserInfo;
        ShareActivityInfo shareActivityInfo = this.shareActivityInfo;
        GiveRoomThemeInfo giveRoomThemeInfo = this.giveRoomThemeInfo;
        StringBuilder sb = new StringBuilder("ChatMessage(uid=");
        sb.append(j);
        sb.append(", mid='");
        sb.append(str);
        OooO0O0.OooO00o(sb, "', targetId=", j2, ", contentType=");
        sb.append(i);
        sb.append(", message='");
        sb.append(str2);
        sb.append("', time=");
        sb.append(j3);
        sb.append(", sendState=");
        sb.append(i2);
        sb.append(", isWarn=");
        sb.append(z);
        sb.append(", isAcceptMsg=");
        sb.append(z2);
        sb.append(", voiceInfo=");
        sb.append(voiceInfo);
        sb.append(", emoticonInfo=");
        sb.append(emoticonInfo);
        sb.append(", giftInfo=");
        sb.append(giftInfo);
        sb.append(", gifInfo=");
        sb.append(gifInfo);
        sb.append(", shareRoomInfo=");
        sb.append(shareRoomInfo);
        sb.append(", shareMomentInfo=");
        sb.append(shareMomentInfo);
        sb.append(", shareTopicInfo=");
        sb.append(shareTopicInfo);
        sb.append(", shareUserInfo=");
        sb.append(shareUserInfo);
        sb.append(", shareActivityInfo=");
        sb.append(shareActivityInfo);
        sb.append("),giveRoomThemeInfo=");
        sb.append(giveRoomThemeInfo);
        return sb.toString();
    }
}
