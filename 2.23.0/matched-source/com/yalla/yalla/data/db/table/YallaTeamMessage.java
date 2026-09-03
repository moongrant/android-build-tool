package com.yalla.yalla.data.db.table;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "mid"})}, primaryKeys = {"uid", "mid"}, tableName = "YallaTeamMessageTable")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0005BCDEFB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010A\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001e\u0010&\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001e\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR \u0010,\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u00108\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001e\u0010;\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010 \"\u0004\b=\u0010\"R\u001e\u0010>\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00105\"\u0004\b@\u00107¨\u0006G"}, d2 = {"Lcom/yalla/yalla/data/db/table/YallaTeamMessage;", "", "()V", "buriedPointMessageId", "", "getBuriedPointMessageId", "()Ljava/lang/String;", "setBuriedPointMessageId", "(Ljava/lang/String;)V", "buriedPointSource", "getBuriedPointSource", "setBuriedPointSource", "coverImage", "getCoverImage", "setCoverImage", "detailImage", "getDetailImage", "setDetailImage", "detailTitle", "getDetailTitle", "setDetailTitle", "isRead", "", "()Z", "setRead", "(Z)V", "jumpId", "getJumpId", "setJumpId", "jumpType", "", "getJumpType", "()I", "setJumpType", "(I)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage", "setMessage", "messageType", "getMessageType", "setMessageType", "mid", "getMid", "setMid", "satisfactionSurvey", "Lcom/yalla/yalla/data/db/table/YallaTeamMessage$SatisfactionSurvey;", "getSatisfactionSurvey", "()Lcom/yalla/yalla/data/db/table/YallaTeamMessage$SatisfactionSurvey;", "setSatisfactionSurvey", "(Lcom/yalla/yalla/data/db/table/YallaTeamMessage$SatisfactionSurvey;)V", "time", "", "getTime", "()J", "setTime", "(J)V", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "type", "getType", "setType", "uid", "getUid", "setUid", "toString", "JumpId", "JumpType", "MessageType", "SatisfactionSurvey", "Type", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YallaTeamMessage {
    public static final int $stable = 8;

    @ColumnInfo(name = "isRead")
    private boolean isRead;

    @ColumnInfo(name = "jumpType")
    private int jumpType;

    @Embedded
    @Nullable
    private SatisfactionSurvey satisfactionSurvey;

    @ColumnInfo(name = "time")
    private long time;

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_TITLE)
    @Nullable
    private String title;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "uid")
    private long uid;

    @ColumnInfo(name = "mid")
    @NotNull
    private String mid = "";

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    @NotNull
    private String message = "";

    @ColumnInfo(name = "buriedPointSource")
    @NotNull
    private String buriedPointSource = "";

    @ColumnInfo(name = "buriedPointMessageId")
    @NotNull
    private String buriedPointMessageId = "";

    @ColumnInfo(name = "messageType")
    private int messageType = 1;

    @ColumnInfo(name = "jumpId")
    @NotNull
    private String jumpId = "";

    @ColumnInfo(name = "coverImage")
    @NotNull
    private String coverImage = "";

    @ColumnInfo(name = "detailImage")
    @NotNull
    private String detailImage = "";

    @ColumnInfo(name = "detailTitle")
    @NotNull
    private String detailTitle = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/yalla/yalla/data/db/table/YallaTeamMessage$JumpId;", "", "()V", "MomentList_Featured", "", "MomentList_Following", "MomentList_Topics", "MyOutfitOld_ChatBox", "MyOutfitOld_EntryEffect", "MyOutfitOld_ProfileCard", "MyOutfitOld_RoomTheme", "MyOutfitOld_Vehicles", "MyOutfit_ChatBox", "MyOutfit_EntryEffect", "MyOutfit_ProfileCard", "MyOutfit_RoomTheme", "MyOutfit_Vehicles", "RoomList_Explore", "RoomList_Popular", "RoomList_Recommended", "Store_HeadWearCard", "Store_RoomLock", "Store_RoomTheme", "Store_TopCard", "Store_Vehicle", "Vip_Vip1", "Vip_Vip2", "Vip_Vip3", "Vip_Vip4", "Vip_Vip5", "Vip_Vip6", "YallaPremium_Knight", "YallaPremium_Patrician", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JumpId {
        public static final int $stable = 0;

        @NotNull
        public static final JumpId INSTANCE = new JumpId();
        public static final int MomentList_Featured = 602;
        public static final int MomentList_Following = 601;
        public static final int MomentList_Topics = 603;
        public static final int MyOutfitOld_ChatBox = 2;
        public static final int MyOutfitOld_EntryEffect = 0;
        public static final int MyOutfitOld_ProfileCard = 1;
        public static final int MyOutfitOld_RoomTheme = 3;
        public static final int MyOutfitOld_Vehicles = 4;
        public static final int MyOutfit_ChatBox = 1002;
        public static final int MyOutfit_EntryEffect = 1000;
        public static final int MyOutfit_ProfileCard = 1001;
        public static final int MyOutfit_RoomTheme = 1003;
        public static final int MyOutfit_Vehicles = 1004;
        public static final int RoomList_Explore = 503;
        public static final int RoomList_Popular = 501;
        public static final int RoomList_Recommended = 502;
        public static final int Store_HeadWearCard = 101;
        public static final int Store_RoomLock = 104;
        public static final int Store_RoomTheme = 102;
        public static final int Store_TopCard = 105;
        public static final int Store_Vehicle = 103;
        public static final int Vip_Vip1 = 701;
        public static final int Vip_Vip2 = 702;
        public static final int Vip_Vip3 = 703;
        public static final int Vip_Vip4 = 704;
        public static final int Vip_Vip5 = 705;
        public static final int Vip_Vip6 = 706;
        public static final int YallaPremium_Knight = 402;
        public static final int YallaPremium_Patrician = 401;

        private JumpId() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/data/db/table/YallaTeamMessage$JumpType;", "", "()V", "Default", "", "MomentDetail", "MomentList", "MyOutfit", "MyOutfitOld", "RedemptionCode", "RedemptionCodeOld", "RoomEnter", "RoomEnterShowGiftBackpack", "RoomList", "RoomPrettyId", "Store", "UserPrettyId", "Vip", "Wallet", "WebUrl", "YallaPremium", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JumpType {
        public static final int $stable = 0;
        public static final int Default = 0;

        @NotNull
        public static final JumpType INSTANCE = new JumpType();
        public static final int MomentDetail = 104;
        public static final int MomentList = 6;
        public static final int MyOutfit = 10;
        public static final int MyOutfitOld = 106;
        public static final int RedemptionCode = 9;
        public static final int RedemptionCodeOld = 108;
        public static final int RoomEnter = 103;
        public static final int RoomEnterShowGiftBackpack = 107;
        public static final int RoomList = 5;
        public static final int RoomPrettyId = 2;
        public static final int Store = 1;
        public static final int UserPrettyId = 3;
        public static final int Vip = 7;
        public static final int Wallet = 8;
        public static final int WebUrl = 105;
        public static final int YallaPremium = 4;

        private JumpType() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/data/db/table/YallaTeamMessage$MessageType;", "", "()V", "Image", "", "Text", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MessageType {
        public static final int $stable = 0;

        @NotNull
        public static final MessageType INSTANCE = new MessageType();
        public static final int Image = 2;
        public static final int Text = 1;

        private MessageType() {
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/data/db/table/YallaTeamMessage$SatisfactionSurvey;", "", "()V", "isSubmit", "", "()Z", "setSubmit", "(Z)V", "messageId", "", "getMessageId", "()J", "setMessageId", "(J)V", "score", "", "getScore", "()I", "setScore", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SatisfactionSurvey {
        public static final int $stable = 8;

        @ColumnInfo(name = "surveyIsSubmit")
        private boolean isSubmit;

        @ColumnInfo(name = "surveyMessageId")
        private long messageId;

        @ColumnInfo(name = "surveyScore")
        private int score;

        public final long getMessageId() {
            return this.messageId;
        }

        public final int getScore() {
            return this.score;
        }

        /* JADX INFO: renamed from: isSubmit, reason: from getter */
        public final boolean getIsSubmit() {
            return this.isSubmit;
        }

        public final void setMessageId(long j) {
            this.messageId = j;
        }

        public final void setScore(int i) {
            this.score = i;
        }

        public final void setSubmit(boolean z) {
            this.isSubmit = z;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/data/db/table/YallaTeamMessage$Type;", "", "()V", "Feedback", "", "Feedback_reply_tip", "Feedback_tip", "Message", "Satisfaction_survey", "System_notice", "Welcome_tip", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Type {
        public static final int $stable = 0;
        public static final int Feedback = 1;
        public static final int Feedback_reply_tip = 4;
        public static final int Feedback_tip = 2;

        @NotNull
        public static final Type INSTANCE = new Type();
        public static final int Message = 3;
        public static final int Satisfaction_survey = 7;
        public static final int System_notice = 5;
        public static final int Welcome_tip = 6;

        private Type() {
        }
    }

    @NotNull
    public final String getBuriedPointMessageId() {
        return this.buriedPointMessageId;
    }

    @NotNull
    public final String getBuriedPointSource() {
        return this.buriedPointSource;
    }

    @NotNull
    public final String getCoverImage() {
        return this.coverImage;
    }

    @NotNull
    public final String getDetailImage() {
        return this.detailImage;
    }

    @NotNull
    public final String getDetailTitle() {
        return this.detailTitle;
    }

    @NotNull
    public final String getJumpId() {
        return this.jumpId;
    }

    public final int getJumpType() {
        return this.jumpType;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    @Nullable
    public final SatisfactionSurvey getSatisfactionSurvey() {
        return this.satisfactionSurvey;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: isRead, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    public final void setBuriedPointMessageId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.buriedPointMessageId = str;
    }

    public final void setBuriedPointSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.buriedPointSource = str;
    }

    public final void setCoverImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coverImage = str;
    }

    public final void setDetailImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.detailImage = str;
    }

    public final void setDetailTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.detailTitle = str;
    }

    public final void setJumpId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jumpId = str;
    }

    public final void setJumpType(int i) {
        this.jumpType = i;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setMessageType(int i) {
        this.messageType = i;
    }

    public final void setMid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mid = str;
    }

    public final void setRead(boolean z) {
        this.isRead = z;
    }

    public final void setSatisfactionSurvey(@Nullable SatisfactionSurvey satisfactionSurvey) {
        this.satisfactionSurvey = satisfactionSurvey;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    @NotNull
    public String toString() {
        return OooOO0.OooO00o(this);
    }
}
