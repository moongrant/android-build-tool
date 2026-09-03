package com.yalla.yalla.mixedroom.model;

import OooO0OO.OooO00o;
import OooO0OO.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.OooOOO0;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.room.MemberBadgeInfo;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.OooOO0;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 L2\u00020\u0001:\u0003LMNB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010K\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001c\u0010$\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\u001c\u0010'\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001c\u0010*\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001c\u0010-\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001c\u00100\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001c\u00103\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001c\u00106\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation;", "Lcom/yalla/yalla/mixedroom/model/RoomCommonModel;", "()V", "autoGrabBonus", "", "getAutoGrabBonus", "()I", "setAutoGrabBonus", "(I)V", "channelkey", "", "getChannelkey", "()Ljava/lang/String;", "setChannelkey", "(Ljava/lang/String;)V", "coin", "getCoin", "setCoin", "memberInfo", "Lcom/yalla/yalla/model/room/MemberBadgeInfo;", "getMemberInfo", "()Lcom/yalla/yalla/model/room/MemberBadgeInfo;", "setMemberInfo", "(Lcom/yalla/yalla/model/room/MemberBadgeInfo;)V", "miceight", "Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation$MIC;", "getMiceight", "()Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation$MIC;", "setMiceight", "(Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation$MIC;)V", "micfive", "getMicfive", "setMicfive", "micfour", "getMicfour", "setMicfour", "micnine", "getMicnine", "setMicnine", "micone", "getMicone", "setMicone", "micseven", "getMicseven", "setMicseven", "micsix", "getMicsix", "setMicsix", "micten", "getMicten", "setMicten", "micthree", "getMicthree", "setMicthree", "mictwo", "getMictwo", "setMictwo", "morder", "getMorder", "setMorder", "noisereduce", "", "getNoisereduce", "()Z", "setNoisereduce", "(Z)V", "position", "getPosition", "setPosition", "room", "Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation$RoomBean;", "getRoom", "()Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation$RoomBean;", "setRoom", "(Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation$RoomBean;)V", "toString", "Companion", "MIC", "RoomBean", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomLoginInformation extends RoomCommonModel {
    public static final int MIC_OFF = 0;
    public static final int MIC_ON = 1;

    @SerializedName("autograbbonus")
    private int autoGrabBonus;

    @Nullable
    private String channelkey;
    private int coin;

    @Nullable
    private MemberBadgeInfo memberInfo;

    @Nullable
    private MIC miceight;

    @Nullable
    private MIC micfive;

    @Nullable
    private MIC micfour;

    @Nullable
    private MIC micnine;

    @Nullable
    private MIC micone;

    @Nullable
    private MIC micseven;

    @Nullable
    private MIC micsix;

    @Nullable
    private MIC micten;

    @Nullable
    private MIC micthree;

    @Nullable
    private MIC mictwo;
    private int morder;
    private boolean noisereduce;
    private int position;

    @Nullable
    private RoomBean room;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bJ\b\u0010+\u001a\u00020,H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\rR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u000f¨\u0006."}, d2 = {"Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation$MIC;", "Lcom/yalla/yalla/mixedroom/model/RoomCommonModel;", "()V", "isMuteSound", "", "()Z", "setMuteSound", "(Z)V", "isSelectedForSendHats", "setSelectedForSendHats", "micorder", "", "getMicorder", "()I", "setMicorder", "(I)V", "newUser", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "getNewUser", "()Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "setNewUser", "(Lcom/yalla/yalla/model/room/RoomUserInfoModel;)V", "order", "getOrder", "setOrder", "reason", "getReason", "setReason", "<set-?>", "state", "getState", "user", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "userid", "", "getUserid", "()J", "setUserid", "(J)V", "voicecard", "getVoicecard", "setVoicecard", "setState", "toString", "", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MIC extends RoomCommonModel {
        public static final int MIC_BUSY = 2;
        public static final int MIC_DEFAULT = 0;
        public static final int MIC_FREE = 3;
        public static final int MIC_LEVEL_LIMIT = 4;
        public static final int MIC_LOCK = 1;
        private boolean isMuteSound;
        private boolean isSelectedForSendHats;
        private int micorder;

        @Nullable
        private transient RoomUserInfoModel newUser;
        private int order;
        private int reason;
        private int state = 0;

        @Nullable
        private RoomUserInfoDTO user;
        private long userid;
        private int voicecard;
        public static final int $stable = 8;

        public final int getMicorder() {
            return this.micorder;
        }

        @Nullable
        public final RoomUserInfoModel getNewUser() {
            if (this.newUser == null) {
                RoomUserInfoDTO roomUserInfoDTO = this.user;
                this.newUser = roomUserInfoDTO != null ? NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO) : null;
            }
            return this.newUser;
        }

        public final int getOrder() {
            return this.order;
        }

        public final int getReason() {
            return this.reason;
        }

        public final int getState() {
            return this.state;
        }

        public final long getUserid() {
            return this.userid;
        }

        public final int getVoicecard() {
            return this.voicecard;
        }

        /* JADX INFO: renamed from: isMuteSound, reason: from getter */
        public final boolean getIsMuteSound() {
            return this.isMuteSound;
        }

        /* JADX INFO: renamed from: isSelectedForSendHats, reason: from getter */
        public final boolean getIsSelectedForSendHats() {
            return this.isSelectedForSendHats;
        }

        public final void setMicorder(int i) {
            this.micorder = i;
        }

        public final void setMuteSound(boolean z) {
            this.isMuteSound = z;
        }

        public final void setNewUser(@Nullable RoomUserInfoModel roomUserInfoModel) {
            this.newUser = roomUserInfoModel;
        }

        public final void setOrder(int i) {
            this.order = i;
        }

        public final void setReason(int i) {
            this.reason = i;
        }

        public final void setSelectedForSendHats(boolean z) {
            this.isSelectedForSendHats = z;
        }

        @NotNull
        public final MIC setState(int state) {
            this.state = state;
            return this;
        }

        public final void setUserid(long j) {
            this.userid = j;
        }

        public final void setVoicecard(int i) {
            this.voicecard = i;
        }

        @Override // com.yalla.yalla.model.bean.AbsJavaBean
        @NotNull
        public String toString() {
            return OooO00o.OooO00o("MIC{state=", this.state, "}");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b(\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001UB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010T\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010-\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00100\"\u0004\b>\u00102R\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001c\u0010B\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010\u000eR\u001c\u0010E\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001c\u0010K\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\f\"\u0004\bM\u0010\u000eR\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\b¨\u0006V"}, d2 = {"Lcom/yalla/yalla/mixedroom/model/RoomLoginInformation$RoomBean;", "Ljava/io/Serializable;", "()V", "applylistlen", "", "getApplylistlen", "()I", "setApplylistlen", "(I)V", "background", "", "getBackground", "()Ljava/lang/String;", "setBackground", "(Ljava/lang/String;)V", "backgroundvideo", "getBackgroundvideo", "setBackgroundvideo", "dues", "getDues", "setDues", "id", "", "getId", "()J", "setId", "(J)V", "idx", "getIdx", "setIdx", "image", "getImage", "setImage", "ip", "getIp", "setIp", "ips", "getIps", "setIps", "level", "getLevel", "setLevel", "luckNum", "getLuckNum", "setLuckNum", "luckNumAdmin", "", "getLuckNumAdmin", "()Z", "setLuckNumAdmin", "(Z)V", "lucknumcost", "getLucknumcost", "setLucknumcost", "lucknummode", "getLucknummode", "setLucknummode", "lucknumset", "getLucknumset", "setLucknumset", "micapplyopen", "getMicapplyopen", "setMicapplyopen", "mictype", "getMictype", "setMictype", "name", "getName", "setName", "notice", "getNotice", "setNotice", "region", "getRegion", "setRegion", "topinapplylist", "getTopinapplylist", "setTopinapplylist", "type", "getType", "setType", "vediotype", "getVediotype", "setVediotype", "toString", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RoomBean implements Serializable {
        public static final int AUDIO_TYPE_AGORA = 0;
        public static final int AUDIO_TYPE_ZEGO = 1;
        public static final int MIC_TYPE_FIVE = 0;
        public static final int MIC_TYPE_TEN = 1;
        public static final long serialVersionUID = 1;
        private int applylistlen;

        @Nullable
        private String background;

        @Nullable
        private String backgroundvideo;
        private int dues;
        private long id;
        private long idx;

        @Nullable
        private String image;

        @Nullable
        private String ip;

        @Nullable
        private String ips;
        private int level;
        private long luckNum = -1;
        private boolean luckNumAdmin;
        private int lucknumcost;
        private int lucknummode;
        private int lucknumset;
        private boolean micapplyopen;
        private int mictype;

        @Nullable
        private String name;

        @Nullable
        private String notice;
        private int region;

        @Nullable
        private String topinapplylist;
        private int type;
        private int vediotype;
        public static final int $stable = 8;

        public final int getApplylistlen() {
            return this.applylistlen;
        }

        @Nullable
        public final String getBackground() {
            return this.background;
        }

        @Nullable
        public final String getBackgroundvideo() {
            return this.backgroundvideo;
        }

        public final int getDues() {
            return this.dues;
        }

        public final long getId() {
            return this.id;
        }

        public final long getIdx() {
            return this.idx;
        }

        @Nullable
        public final String getImage() {
            return this.image;
        }

        @Nullable
        public final String getIp() {
            return this.ip;
        }

        @Nullable
        public final String getIps() {
            return this.ips;
        }

        public final int getLevel() {
            return this.level;
        }

        public final long getLuckNum() {
            return this.luckNum;
        }

        public final boolean getLuckNumAdmin() {
            return this.luckNumAdmin;
        }

        public final int getLucknumcost() {
            return this.lucknumcost;
        }

        public final int getLucknummode() {
            return this.lucknummode;
        }

        public final int getLucknumset() {
            return this.lucknumset;
        }

        public final boolean getMicapplyopen() {
            return this.micapplyopen;
        }

        public final int getMictype() {
            return this.mictype;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getNotice() {
            return this.notice;
        }

        public final int getRegion() {
            return this.region;
        }

        @Nullable
        public final String getTopinapplylist() {
            return this.topinapplylist;
        }

        public final int getType() {
            return this.type;
        }

        public final int getVediotype() {
            return this.vediotype;
        }

        public final void setApplylistlen(int i) {
            this.applylistlen = i;
        }

        public final void setBackground(@Nullable String str) {
            this.background = str;
        }

        public final void setBackgroundvideo(@Nullable String str) {
            this.backgroundvideo = str;
        }

        public final void setDues(int i) {
            this.dues = i;
        }

        public final void setId(long j) {
            this.id = j;
        }

        public final void setIdx(long j) {
            this.idx = j;
        }

        public final void setImage(@Nullable String str) {
            this.image = str;
        }

        public final void setIp(@Nullable String str) {
            this.ip = str;
        }

        public final void setIps(@Nullable String str) {
            this.ips = str;
        }

        public final void setLevel(int i) {
            this.level = i;
        }

        public final void setLuckNum(long j) {
            this.luckNum = j;
        }

        public final void setLuckNumAdmin(boolean z) {
            this.luckNumAdmin = z;
        }

        public final void setLucknumcost(int i) {
            this.lucknumcost = i;
        }

        public final void setLucknummode(int i) {
            this.lucknummode = i;
        }

        public final void setLucknumset(int i) {
            this.lucknumset = i;
        }

        public final void setMicapplyopen(boolean z) {
            this.micapplyopen = z;
        }

        public final void setMictype(int i) {
            this.mictype = i;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setNotice(@Nullable String str) {
            this.notice = str;
        }

        public final void setRegion(int i) {
            this.region = i;
        }

        public final void setTopinapplylist(@Nullable String str) {
            this.topinapplylist = str;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final void setVediotype(int i) {
            this.vediotype = i;
        }

        @NotNull
        public String toString() {
            int i = this.dues;
            long j = this.idx;
            long j2 = this.id;
            String str = this.ip;
            String str2 = this.image;
            String str3 = this.name;
            int i2 = this.level;
            int i3 = this.type;
            int i4 = this.region;
            String str4 = this.notice;
            int i5 = this.mictype;
            int i6 = this.vediotype;
            String str5 = this.ips;
            int i7 = this.lucknummode;
            int i8 = this.lucknumcost;
            int i9 = this.lucknumset;
            String str6 = this.background;
            String str7 = this.backgroundvideo;
            StringBuilder sb = new StringBuilder("RoomBean{dues=");
            sb.append(i);
            sb.append(", idx=");
            sb.append(j);
            OooOOO0.OooO00o(sb, ", id=", j2, ", ip='");
            OooO0O0.OooO00o(sb, str, "', image='", str2, "', name='");
            sb.append(str3);
            sb.append("', level=");
            sb.append(i2);
            sb.append(", type=");
            o000O0Oo.OooOOO0.OooO00o(sb, i3, ", region=", i4, ", notice='");
            sb.append(str4);
            sb.append("', mictype=");
            sb.append(i5);
            sb.append(", vediotype=");
            sb.append(i6);
            sb.append(", ips='");
            sb.append(str5);
            sb.append("', lucknummode=");
            o000O0Oo.OooOOO0.OooO00o(sb, i7, ", lucknumcost=", i8, ", lucknumset=");
            sb.append(i9);
            sb.append(", background='");
            sb.append(str6);
            sb.append("', backgroundvideo='");
            return o0oOO.OooO0O0(sb, str7, "'}");
        }
    }

    public final int getAutoGrabBonus() {
        return this.autoGrabBonus;
    }

    @Nullable
    public final String getChannelkey() {
        return this.channelkey;
    }

    public final int getCoin() {
        return this.coin;
    }

    @Nullable
    public final MemberBadgeInfo getMemberInfo() {
        return this.memberInfo;
    }

    @Nullable
    public final MIC getMiceight() {
        return this.miceight;
    }

    @Nullable
    public final MIC getMicfive() {
        return this.micfive;
    }

    @Nullable
    public final MIC getMicfour() {
        return this.micfour;
    }

    @Nullable
    public final MIC getMicnine() {
        return this.micnine;
    }

    @Nullable
    public final MIC getMicone() {
        return this.micone;
    }

    @Nullable
    public final MIC getMicseven() {
        return this.micseven;
    }

    @Nullable
    public final MIC getMicsix() {
        return this.micsix;
    }

    @Nullable
    public final MIC getMicten() {
        return this.micten;
    }

    @Nullable
    public final MIC getMicthree() {
        return this.micthree;
    }

    @Nullable
    public final MIC getMictwo() {
        return this.mictwo;
    }

    public final int getMorder() {
        return this.morder;
    }

    public final boolean getNoisereduce() {
        return this.noisereduce;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final RoomBean getRoom() {
        return this.room;
    }

    public final void setAutoGrabBonus(int i) {
        this.autoGrabBonus = i;
    }

    public final void setChannelkey(@Nullable String str) {
        this.channelkey = str;
    }

    public final void setCoin(int i) {
        this.coin = i;
    }

    public final void setMemberInfo(@Nullable MemberBadgeInfo memberBadgeInfo) {
        this.memberInfo = memberBadgeInfo;
    }

    public final void setMiceight(@Nullable MIC mic) {
        this.miceight = mic;
    }

    public final void setMicfive(@Nullable MIC mic) {
        this.micfive = mic;
    }

    public final void setMicfour(@Nullable MIC mic) {
        this.micfour = mic;
    }

    public final void setMicnine(@Nullable MIC mic) {
        this.micnine = mic;
    }

    public final void setMicone(@Nullable MIC mic) {
        this.micone = mic;
    }

    public final void setMicseven(@Nullable MIC mic) {
        this.micseven = mic;
    }

    public final void setMicsix(@Nullable MIC mic) {
        this.micsix = mic;
    }

    public final void setMicten(@Nullable MIC mic) {
        this.micten = mic;
    }

    public final void setMicthree(@Nullable MIC mic) {
        this.micthree = mic;
    }

    public final void setMictwo(@Nullable MIC mic) {
        this.mictwo = mic;
    }

    public final void setMorder(int i) {
        this.morder = i;
    }

    public final void setNoisereduce(boolean z) {
        this.noisereduce = z;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setRoom(@Nullable RoomBean roomBean) {
        this.room = roomBean;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    @NotNull
    public String toString() {
        String str = this.channelkey;
        int i = this.coin;
        MIC mic = this.micfive;
        MIC mic2 = this.micfour;
        MIC mic3 = this.micone;
        MIC mic4 = this.micthree;
        MIC mic5 = this.mictwo;
        MIC mic6 = this.micsix;
        MIC mic7 = this.micseven;
        MIC mic8 = this.miceight;
        MIC mic9 = this.micnine;
        MIC mic10 = this.micten;
        int i2 = this.morder;
        int i3 = this.position;
        RoomBean roomBean = this.room;
        int i4 = this.autoGrabBonus;
        int i5 = this.code;
        StringBuilder sb = new StringBuilder("RoomLoginInformation{channelkey='");
        sb.append(str);
        sb.append("', coin=");
        sb.append(i);
        sb.append(", micfive=");
        sb.append(mic);
        sb.append(", micfour=");
        sb.append(mic2);
        sb.append(", micone=");
        sb.append(mic3);
        sb.append(", micthree=");
        sb.append(mic4);
        sb.append(", mictwo=");
        sb.append(mic5);
        sb.append(", micsix=");
        sb.append(mic6);
        sb.append(", micseven=");
        sb.append(mic7);
        sb.append(", miceight=");
        sb.append(mic8);
        sb.append(", micnine=");
        sb.append(mic9);
        sb.append(", micten=");
        sb.append(mic10);
        sb.append(", morder=");
        o000O0Oo.OooOOO0.OooO00o(sb, i2, ", position=", i3, ", room=");
        sb.append(roomBean);
        sb.append(", autoGrabBonus=");
        sb.append(i4);
        sb.append(", code=");
        return OooOO0.OooO00o(sb, i5, "}");
    }
}
