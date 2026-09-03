package com.yalla.yalla.model.event;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Ignore;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u007f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u008d\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0007\u0010\u008c\u0001\u001a\u00020\u0000R\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001e\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001e\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR&\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00058F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR\u001e\u0010,\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010\u0013R\u001e\u0010/\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\u001e\u00102\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR\u001e\u00105\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000b\"\u0004\b7\u0010\rR\u001e\u00108\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\u001a\u0010;\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R&\u0010@\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00078F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u001a\u0010C\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0011\"\u0004\bE\u0010\u0013R\u001e\u0010F\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R\u001e\u0010H\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010=\"\u0004\bI\u0010?R\u001e\u0010J\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R\u001a\u0010L\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010=\"\u0004\bM\u0010?R\u001a\u0010N\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010=\"\u0004\bO\u0010?R\u001a\u0010P\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\rR\u001a\u0010S\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010&\"\u0004\bU\u0010(R\u001a\u0010V\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0011\"\u0004\bX\u0010\u0013R\u001a\u0010Y\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0011\"\u0004\b[\u0010\u0013R\u001e\u0010\\\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u000b\"\u0004\b^\u0010\rR\u001a\u0010_\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u000b\"\u0004\ba\u0010\rR\u001e\u0010b\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0011\"\u0004\bd\u0010\u0013R\u001e\u0010e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u000b\"\u0004\bg\u0010\rR\u001e\u0010h\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u000b\"\u0004\bj\u0010\rR\u001e\u0010k\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0011\"\u0004\bm\u0010\u0013R\u001e\u0010n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010&\"\u0004\bp\u0010(R\u001e\u0010q\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010&\"\u0004\bs\u0010(R\u001e\u0010t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010&\"\u0004\bv\u0010(R\u001e\u0010w\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010&\"\u0004\by\u0010(R\u001e\u0010z\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010&\"\u0004\b|\u0010(R\u001e\u0010}\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\u000b\"\u0004\b\u007f\u0010\rR!\u0010\u0080\u0001\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010&\"\u0005\b\u0082\u0001\u0010(R!\u0010\u0083\u0001\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\u000b\"\u0005\b\u0085\u0001\u0010\rR!\u0010\u0086\u0001\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010&\"\u0005\b\u0088\u0001\u0010(R\u001d\u0010\u0089\u0001\u001a\u00020\tX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u000b\"\u0005\b\u008b\u0001\u0010\r¨\u0006\u008e\u0001"}, d2 = {"Lcom/yalla/yalla/model/event/EventModel;", "Ljava/io/Serializable;", "()V", "_eventNumber", "Landroidx/compose/runtime/MutableState;", "", "_hasSubscribe", "", "createToken", "", "getCreateToken", "()Ljava/lang/String;", "setCreateToken", "(Ljava/lang/String;)V", "creatorUserId", "", "getCreatorUserId", "()J", "setCreatorUserId", "(J)V", "dateTag", "getDateTag", "setDateTag", "eventDesc", "getEventDesc", "setEventDesc", "eventEndTime", "getEventEndTime", "setEventEndTime", "eventImage", "getEventImage", "setEventImage", "eventName", "getEventName", "setEventName", AppMeasurementSdk.ConditionalUserProperty.VALUE, "eventNumber", "getEventNumber", "()I", "setEventNumber", "(I)V", "eventShareUrl", "getEventShareUrl", "setEventShareUrl", "eventStartTime", "getEventStartTime", "setEventStartTime", "eventState", "getEventState", "setEventState", "eventTag", "getEventTag", "setEventTag", "eventTagIcon", "getEventTagIcon", "setEventTagIcon", "eventTagId", "getEventTagId", "setEventTagId", "hasNextTimeNode", "getHasNextTimeNode", "()Z", "setHasNextTimeNode", "(Z)V", "hasSubscribe", "getHasSubscribe", "setHasSubscribe", "id", "getId", "setId", "isCanCopy", "setCanCopy", "isCanDelete", "setCanDelete", "isDefaultPic", "setDefaultPic", "isEndDay", "setEndDay", "isNewTimeNode", "setNewTimeNode", "mid", "getMid", "setMid", "region", "getRegion", "setRegion", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "roomIdx", "getRoomIdx", "setRoomIdx", "roomImage", "getRoomImage", "setRoomImage", "roomName", "getRoomName", "setRoomName", "roomOnLineNumber", "getRoomOnLineNumber", "setRoomOnLineNumber", "roomServerIP", "getRoomServerIP", "setRoomServerIP", "userHeadUrl", "getUserHeadUrl", "setUserHeadUrl", "userIdx", "getUserIdx", "setUserIdx", "userIsVip", "getUserIsVip", "setUserIsVip", "userKaVipLv", "getUserKaVipLv", "setUserKaVipLv", "userKaVipState", "getUserKaVipState", "setUserKaVipState", "userLevel", "getUserLevel", "setUserLevel", "userNVipLv", "getUserNVipLv", "setUserNVipLv", "userName", "getUserName", "setUserName", "userSex", "getUserSex", "setUserSex", "wealthBadgeImage", "getWealthBadgeImage", "setWealthBadgeImage", "wealthLevel", "getWealthLevel", "setWealthLevel", "websocketaddr", "getWebsocketaddr", "setWebsocketaddr", "clone", "State", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EventModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName(alternate = {"userId"}, value = "creatorUserId")
    private long creatorUserId;

    @SerializedName(alternate = {"endTime"}, value = "eventEndTime")
    private long eventEndTime;

    @SerializedName(alternate = {"subCount"}, value = "eventNumber")
    private int eventNumber;

    @SerializedName(alternate = {"startTime"}, value = "eventStartTime")
    private long eventStartTime;

    @SerializedName(alternate = {"fState"}, value = "eventState")
    private int eventState;

    @SerializedName(alternate = {"keyWord"}, value = "eventTagId")
    private int eventTagId;
    private boolean hasNextTimeNode;

    @SerializedName(alternate = {"isSub"}, value = "hasSubscribe")
    private boolean hasSubscribe;
    private long id;

    @SerializedName("isCanCopy")
    private boolean isCanCopy;

    @SerializedName("isCanDel")
    private boolean isCanDelete;

    @SerializedName("isDefaultPic")
    private boolean isDefaultPic;
    private boolean isEndDay;
    private boolean isNewTimeNode;
    private int region;
    private long roomId;
    private long roomIdx;

    @SerializedName(alternate = {"onLineNum"}, value = "roomOnLineNumber")
    private long roomOnLineNumber;

    @SerializedName("userIdx")
    private long userIdx;

    @SerializedName("isVip")
    private int userIsVip;

    @SerializedName("kaVipLv")
    private int userKaVipLv;

    @SerializedName("kaVipState")
    private int userKaVipState;

    @SerializedName("userLevel")
    private int userLevel;

    @SerializedName("nvipLv")
    private int userNVipLv;

    @SerializedName("wealthLevel")
    private int wealthLevel;

    @NotNull
    private String mid = "";

    @NotNull
    private String eventName = "";

    @NotNull
    private String roomName = "";

    @NotNull
    private String createToken = "";

    @SerializedName(alternate = {"keyWordText"}, value = "eventTag")
    @NotNull
    private String eventTag = "";

    @SerializedName(alternate = {"keyWordIcon"}, value = "eventTagIcon")
    @NotNull
    private String eventTagIcon = "";

    @SerializedName(alternate = {"pic"}, value = "eventImage")
    @NotNull
    private String eventImage = "";

    @SerializedName(alternate = {"roomPic"}, value = "roomImage")
    @NotNull
    private String roomImage = "";

    @Ignore
    @Nullable
    private transient MutableState<Integer> _eventNumber = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    @NotNull
    private String eventDesc = "";

    @Ignore
    @Nullable
    private transient MutableState<Boolean> _hasSubscribe = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @NotNull
    private String dateTag = "";

    @SerializedName("headUrl")
    @NotNull
    private String userHeadUrl = "";

    @SerializedName(alternate = {"userName"}, value = "nickName")
    @NotNull
    private String userName = "";

    @SerializedName("sex")
    private int userSex = 2;

    @SerializedName("roomServerIP")
    @NotNull
    private String roomServerIP = "";

    @NotNull
    private String websocketaddr = "";

    @SerializedName("evevtShareUrl")
    @NotNull
    private String eventShareUrl = "";

    @SerializedName("wealthBadgeImage")
    @NotNull
    private String wealthBadgeImage = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/model/event/EventModel$State;", "", "()V", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class State {
        public static final int $stable = 0;
        private static int NotStarted;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static int InProgress = 1;
        private static int Ended = 2;
        private static int Deleted = 3;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/event/EventModel$State$Companion;", "", "()V", "Deleted", "", "getDeleted", "()I", "setDeleted", "(I)V", "Ended", "getEnded", "setEnded", "InProgress", "getInProgress", "setInProgress", "NotStarted", "getNotStarted", "setNotStarted", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int getDeleted() {
                return State.Deleted;
            }

            public final int getEnded() {
                return State.Ended;
            }

            public final int getInProgress() {
                return State.InProgress;
            }

            public final int getNotStarted() {
                return State.NotStarted;
            }

            public final void setDeleted(int i) {
                State.Deleted = i;
            }

            public final void setEnded(int i) {
                State.Ended = i;
            }

            public final void setInProgress(int i) {
                State.InProgress = i;
            }

            public final void setNotStarted(int i) {
                State.NotStarted = i;
            }
        }
    }

    @NotNull
    public final EventModel clone() {
        EventModel eventModel = new EventModel();
        eventModel.mid = this.mid;
        eventModel.id = this.id;
        eventModel.creatorUserId = this.creatorUserId;
        eventModel.isCanCopy = this.isCanCopy;
        eventModel.isCanDelete = this.isCanDelete;
        eventModel.eventName = this.eventName;
        eventModel.roomIdx = this.roomIdx;
        eventModel.roomId = this.roomId;
        eventModel.roomName = this.roomName;
        eventModel.region = this.region;
        eventModel.eventState = this.eventState;
        eventModel.eventTag = this.eventTag;
        eventModel.eventTagId = this.eventTagId;
        eventModel.eventTagIcon = this.eventTagIcon;
        eventModel.eventImage = this.eventImage;
        eventModel.eventStartTime = this.eventStartTime;
        eventModel.eventEndTime = this.eventEndTime;
        eventModel.roomImage = this.roomImage;
        eventModel.setEventNumber(getEventNumber());
        eventModel.eventDesc = this.eventDesc;
        eventModel.setHasSubscribe(getHasSubscribe());
        eventModel.roomOnLineNumber = this.roomOnLineNumber;
        eventModel.isEndDay = this.isEndDay;
        eventModel.isNewTimeNode = this.isNewTimeNode;
        eventModel.hasNextTimeNode = this.hasNextTimeNode;
        eventModel.userIdx = this.userIdx;
        eventModel.userHeadUrl = this.userHeadUrl;
        eventModel.userName = this.userName;
        eventModel.userSex = this.userSex;
        eventModel.userKaVipState = this.userKaVipState;
        eventModel.userKaVipLv = this.userKaVipLv;
        eventModel.userLevel = this.userLevel;
        eventModel.userIsVip = this.userIsVip;
        eventModel.userNVipLv = this.userNVipLv;
        eventModel.roomServerIP = this.roomServerIP;
        eventModel.eventShareUrl = this.eventShareUrl;
        eventModel.dateTag = this.dateTag;
        eventModel.wealthLevel = this.wealthLevel;
        eventModel.wealthBadgeImage = this.wealthBadgeImage;
        return eventModel;
    }

    @NotNull
    public final String getCreateToken() {
        return this.createToken;
    }

    public final long getCreatorUserId() {
        return this.creatorUserId;
    }

    @NotNull
    public final String getDateTag() {
        return this.dateTag;
    }

    @NotNull
    public final String getEventDesc() {
        return this.eventDesc;
    }

    public final long getEventEndTime() {
        return this.eventEndTime;
    }

    @NotNull
    public final String getEventImage() {
        return this.eventImage;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final int getEventNumber() {
        if (this._eventNumber == null) {
            this._eventNumber = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(this.eventNumber), null, 2, null);
        }
        int i = this.eventNumber;
        MutableState<Integer> mutableState = this._eventNumber;
        Intrinsics.checkNotNull(mutableState);
        if (i != mutableState.getValue().intValue()) {
            MutableState<Integer> mutableState2 = this._eventNumber;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Integer.valueOf(this.eventNumber));
        }
        MutableState<Integer> mutableState3 = this._eventNumber;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().intValue();
    }

    @NotNull
    public final String getEventShareUrl() {
        return this.eventShareUrl;
    }

    public final long getEventStartTime() {
        return this.eventStartTime;
    }

    public final int getEventState() {
        return this.eventState;
    }

    @NotNull
    public final String getEventTag() {
        return this.eventTag;
    }

    @NotNull
    public final String getEventTagIcon() {
        return this.eventTagIcon;
    }

    public final int getEventTagId() {
        return this.eventTagId;
    }

    public final boolean getHasNextTimeNode() {
        return this.hasNextTimeNode;
    }

    public final boolean getHasSubscribe() {
        if (this._hasSubscribe == null) {
            this._hasSubscribe = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.hasSubscribe), null, 2, null);
        }
        boolean z = this.hasSubscribe;
        MutableState<Boolean> mutableState = this._hasSubscribe;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._hasSubscribe;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.hasSubscribe));
        }
        MutableState<Boolean> mutableState3 = this._hasSubscribe;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    public final int getRegion() {
        return this.region;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getRoomIdx() {
        return this.roomIdx;
    }

    @NotNull
    public final String getRoomImage() {
        return this.roomImage;
    }

    @NotNull
    public final String getRoomName() {
        return this.roomName;
    }

    public final long getRoomOnLineNumber() {
        return this.roomOnLineNumber;
    }

    @NotNull
    public final String getRoomServerIP() {
        return this.roomServerIP;
    }

    @NotNull
    public final String getUserHeadUrl() {
        return this.userHeadUrl;
    }

    public final long getUserIdx() {
        return this.userIdx;
    }

    public final int getUserIsVip() {
        return this.userIsVip;
    }

    public final int getUserKaVipLv() {
        return this.userKaVipLv;
    }

    public final int getUserKaVipState() {
        return this.userKaVipState;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }

    public final int getUserNVipLv() {
        return this.userNVipLv;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public final int getUserSex() {
        return this.userSex;
    }

    @NotNull
    public final String getWealthBadgeImage() {
        return this.wealthBadgeImage;
    }

    public final int getWealthLevel() {
        return this.wealthLevel;
    }

    @NotNull
    public final String getWebsocketaddr() {
        return this.websocketaddr;
    }

    /* JADX INFO: renamed from: isCanCopy, reason: from getter */
    public final boolean getIsCanCopy() {
        return this.isCanCopy;
    }

    /* JADX INFO: renamed from: isCanDelete, reason: from getter */
    public final boolean getIsCanDelete() {
        return this.isCanDelete;
    }

    /* JADX INFO: renamed from: isDefaultPic, reason: from getter */
    public final boolean getIsDefaultPic() {
        return this.isDefaultPic;
    }

    /* JADX INFO: renamed from: isEndDay, reason: from getter */
    public final boolean getIsEndDay() {
        return this.isEndDay;
    }

    /* JADX INFO: renamed from: isNewTimeNode, reason: from getter */
    public final boolean getIsNewTimeNode() {
        return this.isNewTimeNode;
    }

    public final void setCanCopy(boolean z) {
        this.isCanCopy = z;
    }

    public final void setCanDelete(boolean z) {
        this.isCanDelete = z;
    }

    public final void setCreateToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createToken = str;
    }

    public final void setCreatorUserId(long j) {
        this.creatorUserId = j;
    }

    public final void setDateTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateTag = str;
    }

    public final void setDefaultPic(boolean z) {
        this.isDefaultPic = z;
    }

    public final void setEndDay(boolean z) {
        this.isEndDay = z;
    }

    public final void setEventDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventDesc = str;
    }

    public final void setEventEndTime(long j) {
        this.eventEndTime = j;
    }

    public final void setEventImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventImage = str;
    }

    public final void setEventName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }

    public final void setEventNumber(int i) {
        this.eventNumber = i;
        if (this._eventNumber == null) {
            this._eventNumber = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        }
        MutableState<Integer> mutableState = this._eventNumber;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Integer.valueOf(i));
    }

    public final void setEventShareUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventShareUrl = str;
    }

    public final void setEventStartTime(long j) {
        this.eventStartTime = j;
    }

    public final void setEventState(int i) {
        this.eventState = i;
    }

    public final void setEventTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventTag = str;
    }

    public final void setEventTagIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventTagIcon = str;
    }

    public final void setEventTagId(int i) {
        this.eventTagId = i;
    }

    public final void setHasNextTimeNode(boolean z) {
        this.hasNextTimeNode = z;
    }

    public final void setHasSubscribe(boolean z) {
        this.hasSubscribe = z;
        if (this._hasSubscribe == null) {
            this._hasSubscribe = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        MutableState<Boolean> mutableState = this._hasSubscribe;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setMid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mid = str;
    }

    public final void setNewTimeNode(boolean z) {
        this.isNewTimeNode = z;
    }

    public final void setRegion(int i) {
        this.region = i;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setRoomIdx(long j) {
        this.roomIdx = j;
    }

    public final void setRoomImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomImage = str;
    }

    public final void setRoomName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomName = str;
    }

    public final void setRoomOnLineNumber(long j) {
        this.roomOnLineNumber = j;
    }

    public final void setRoomServerIP(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomServerIP = str;
    }

    public final void setUserHeadUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userHeadUrl = str;
    }

    public final void setUserIdx(long j) {
        this.userIdx = j;
    }

    public final void setUserIsVip(int i) {
        this.userIsVip = i;
    }

    public final void setUserKaVipLv(int i) {
        this.userKaVipLv = i;
    }

    public final void setUserKaVipState(int i) {
        this.userKaVipState = i;
    }

    public final void setUserLevel(int i) {
        this.userLevel = i;
    }

    public final void setUserNVipLv(int i) {
        this.userNVipLv = i;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    public final void setUserSex(int i) {
        this.userSex = i;
    }

    public final void setWealthBadgeImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wealthBadgeImage = str;
    }

    public final void setWealthLevel(int i) {
        this.wealthLevel = i;
    }

    public final void setWebsocketaddr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.websocketaddr = str;
    }
}
