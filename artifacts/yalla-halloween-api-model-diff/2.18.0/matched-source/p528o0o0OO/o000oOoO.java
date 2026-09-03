package p528o0o0OO;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o00000O;
import com.app.base.application.App;
import com.app.base.protobuf.MessageIM;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.db.table.SystemMessage;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.model.SystemMessageData;
import com.yalla.yalla.model.SystemMessageModel;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import kotlin.jvm.internal.Intrinsics;
import oo0O.OooO00o;
import org.jetbrains.annotations.NotNull;
import p034OoooO0O.o0Oo0oo;
import p169o00Ooo0.o0ooOOo;
import p493o0o00O00.OooO0OO;
import p500o0o00Oo0.OooOOO;
import p517o0o0O00.o00O00;
import p529o0o0OO0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO extends OooOo {
    public final long OooO0O0() {
        Long value = OooOOO.f41235OooO00o.OooOo().getValue();
        if (value == null) {
            return 0L;
        }
        return value.longValue();
    }

    public final SystemMessage OooO0OO(String str, long j, String str2) {
        SystemMessage systemMessage = new SystemMessage();
        systemMessage.setUid(OooO0O0());
        systemMessage.setMid(str);
        systemMessage.setMessage(str2);
        if (j <= 0) {
            synchronized (o0OoOo0.f43152OooO00o) {
                j = System.currentTimeMillis() + OooO00o.OooO00o().f53356OooO00o;
            }
        }
        systemMessage.setTime(j);
        return systemMessage;
    }

    public final boolean OooO0Oo() {
        return ((OooO0O0.f20522OooO00o.OooO0O0() instanceof SystemMessageActivity) || OooO00o()) ? false : true;
    }

    public final String OooO0o(String str, long j, SystemMessageModel systemMessageModel) {
        o00O00.OooO0OO("saveEventMsg", " saveEventMsg = " + systemMessageModel);
        SystemMessageData data = systemMessageModel.getData();
        String strOooO0OO = "";
        if (data != null) {
            SystemMessage.EventInfo eventInfo = new SystemMessage.EventInfo();
            eventInfo.setName(data.getEventName());
            eventInfo.setMinute(Integer.valueOf(data.getEventTime()));
            eventInfo.setStartTime(Long.valueOf(data.getEventStartTime()));
            eventInfo.setReason(data.getEventReason());
            eventInfo.setReasonType(Integer.valueOf(data.getReasonType()));
            eventInfo.setRoomId(Long.valueOf(data.getRoomId()));
            eventInfo.setEventId(Long.valueOf(data.getEventId()));
            SystemMessage systemMessageOooO0OO = OooO0OO(str, j, systemMessageModel.getMessage());
            systemMessageOooO0OO.setEventInfo(eventInfo);
            switch (systemMessageModel.getType()) {
                case 72:
                    systemMessageOooO0OO.setType(27);
                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Event_Message_Title_start);
                    break;
                case 73:
                    systemMessageOooO0OO.setType(28);
                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Event_Message_Title_start);
                    break;
                case 74:
                    systemMessageOooO0OO.setType(30);
                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Event_Message_Title_cancel);
                    break;
                case 75:
                    systemMessageOooO0OO.setType(31);
                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Event_Message_Title_passed);
                    break;
                case 76:
                    systemMessageOooO0OO.setType(32);
                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Event_Message_Title_recommend);
                    break;
                case 77:
                    systemMessageOooO0OO.setType(29);
                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Event_Message_Title_deleted);
                    break;
            }
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO);
        }
        return strOooO0OO;
    }

    /* JADX WARN: Code duplicated, block: B:238:0x0ab7  */
    /* JADX WARN: Code duplicated, block: B:267:? A[RETURN, SYNTHETIC] */
    public final void OooO0o0(@NotNull MessageIM.Message msg, boolean z) {
        String strOooO0OO;
        String level;
        String upCrystal;
        String coin;
        String level2;
        String coin2;
        String type;
        String type2;
        String expirationTime;
        String coin3;
        String headFrameUrl;
        String coin4;
        String medalId;
        String type3;
        String medalId2;
        String type4;
        String strOooO0OO2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        o00O00.OooO0OO("SystemMsgProcessor", " parseMessage = " + msg);
        if (msg.getFromId() == OooO0O0() || com.yalla.support.common.util.OooO0OO.OooO00o(msg.getMid()) || com.yalla.support.common.util.OooO0OO.OooO0O0(OooO0OO.OooO00o().Oooo00o().OooO0o0(Long.valueOf(OooO0O0()), msg.getMid()))) {
            return;
        }
        int head = msg.getHead();
        if (head == 1002) {
            o00O00.OooO0OO("SystemMsgProcessor", " saveJoinTopicMessage = " + msg);
            MessageIM.Message1002 from = MessageIM.Message1002.parseFrom(msg.getBody());
            if (from == null) {
                return;
            }
            SystemMessage.JoinTopicInfo joinTopicInfo = new SystemMessage.JoinTopicInfo();
            joinTopicInfo.setJoinTopicId(from.getCircleId());
            String mid = msg.getMid();
            Intrinsics.checkNotNullExpressionValue(mid, "msg.mid");
            long time = msg.getTime();
            String sendMsg = from.getSendMsg();
            Intrinsics.checkNotNullExpressionValue(sendMsg, "joinTopicMsg.sendMsg");
            SystemMessage systemMessageOooO0OO = OooO0OO(mid, time, sendMsg);
            systemMessageOooO0OO.setType(2);
            systemMessageOooO0OO.setJoinTopicInfo(joinTopicInfo);
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO);
            o0Oo0oo.OooO0o0(40, null);
            if (OooO0Oo()) {
                OooO0oO("Yalla_Notice_Monemt", com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Notice_Title_moment), systemMessageOooO0OO.getMessage(), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notify_new_message), SystemMessageActivity.class);
                return;
            }
            return;
        }
        if (head == 1051) {
            o00O00.OooO0OO("SystemMsgProcessor", " saveVipMessage = " + msg);
            MessageIM.Message1051 from2 = MessageIM.Message1051.parseFrom(msg.getBody());
            if (from2 == null) {
                return;
            }
            SystemMessage.PremiumInfo premiumInfo = new SystemMessage.PremiumInfo();
            premiumInfo.setVipLevel(from2.getNVipLv());
            String mid2 = msg.getMid();
            Intrinsics.checkNotNullExpressionValue(mid2, "msg.mid");
            SystemMessage systemMessageOooO0OO2 = OooO0OO(mid2, msg.getTime(), new String());
            systemMessageOooO0OO2.setType(1);
            systemMessageOooO0OO2.setVipInfo(premiumInfo);
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO2);
            o0Oo0oo.OooO0o0(40, null);
            if (OooO0Oo()) {
                OooO0oO("Yalla_Notice_Syatem", com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notify_new_message), systemMessageOooO0OO2.getMessage(), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notify_new_message), SystemMessageActivity.class);
                return;
            }
            return;
        }
        if (head == 1500) {
            o00O00.OooO0OO("SystemMsgProcessor", " saveTopicStateMessage = " + msg);
            MessageIM.Message1500 from3 = MessageIM.Message1500.parseFrom(msg.getBody());
            if (from3 == null) {
                return;
            }
            if (from3.getCircleUserId() == OooO0O0() && (from3.getType() == 1 || from3.getType() == 3)) {
                LiveEventBus.get("MESSAGE_TOPIC_STATE_CHANGE").post(Boolean.TRUE);
            }
            SystemMessage.TopicStateInfo topicStateInfo = new SystemMessage.TopicStateInfo();
            topicStateInfo.setTopicType(from3.getType());
            topicStateInfo.setTopicId(from3.getCircleId());
            String circleName = from3.getCircleName();
            Intrinsics.checkNotNullExpressionValue(circleName, "topicStateMsg.circleName");
            topicStateInfo.setTopicName(circleName);
            topicStateInfo.setTopicFailType(from3.getFailType());
            String mid3 = msg.getMid();
            Intrinsics.checkNotNullExpressionValue(mid3, "msg.mid");
            long time2 = msg.getTime();
            String msg2 = from3.getMsg();
            Intrinsics.checkNotNullExpressionValue(msg2, "topicStateMsg.msg");
            SystemMessage systemMessageOooO0OO3 = OooO0OO(mid3, time2, msg2);
            systemMessageOooO0OO3.setType(3);
            systemMessageOooO0OO3.setTopicStateInfo(topicStateInfo);
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO3);
            o0Oo0oo.OooO0o0(40, null);
            if (OooO0Oo()) {
                OooO0oO("Yalla_Notice_Syatem", com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notify_new_message), systemMessageOooO0OO3.getMessage(), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notify_new_message), SystemMessageActivity.class);
                return;
            }
            return;
        }
        if (head != 2102) {
            if (head != 2118) {
                return;
            }
            o00O00.OooO0OO("SystemMsgProcessor", " saveMoraMessage = " + msg);
            MessageIM.Message2118 from4 = MessageIM.Message2118.parseFrom(msg.getBody());
            if (from4 == null) {
                return;
            }
            String mid4 = msg.getMid();
            Intrinsics.checkNotNullExpressionValue(mid4, "msg.mid");
            long time3 = msg.getTime();
            String msg3 = from4.getMsg();
            Intrinsics.checkNotNullExpressionValue(msg3, "moraMsg.msg");
            SystemMessage systemMessageOooO0OO4 = OooO0OO(mid4, time3, msg3);
            systemMessageOooO0OO4.setType(4);
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO4);
            o0Oo0oo.OooO0o0(40, null);
            o00000O.OooO0O0().OooO0o(OooO0O0() + "MORA_RED_POINT", 1L);
            LiveEventBus.get("MORA_RED_POINT").post(msg);
            return;
        }
        o00O00.OooO0OO("SystemMsgProcessor", " parseBroadcastMessage = " + msg);
        SystemMessageModel systemMessageModel = (SystemMessageModel) com.android.billingclient.api.o0Oo0oo.OooO0O0(MessageIM.Message2102.parseFrom(msg.getBody()).getMsg(), SystemMessageModel.class);
        int type5 = systemMessageModel.getType();
        String strOooO00o = "";
        if (type5 == 10) {
            String mid5 = msg.getMid();
            long jOooO00o = Oooo0.OooO00o(mid5, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            o00O00.OooO0OO("SystemMsgProcessor", " saveUserUpgradeMsg = " + systemMessageModel);
            SystemMessage.UserUpgradeInfo userUpgradeInfo = new SystemMessage.UserUpgradeInfo();
            SystemMessageData data = systemMessageModel.getData();
            userUpgradeInfo.setUpCoin((data == null || (coin = data.getCoin()) == null) ? 0 : OooO.OooO0o0(coin));
            SystemMessageData data2 = systemMessageModel.getData();
            userUpgradeInfo.setUpCrystal((data2 == null || (upCrystal = data2.getUpCrystal()) == null) ? 0 : OooO.OooO0o0(upCrystal));
            SystemMessageData data3 = systemMessageModel.getData();
            userUpgradeInfo.setUserLevel((data3 == null || (level = data3.getLevel()) == null) ? 0 : OooO.OooO0o0(level));
            SystemMessage systemMessageOooO0OO5 = OooO0OO(mid5, jOooO00o, systemMessageModel.getMessage());
            systemMessageOooO0OO5.setUserUpgradeInfo(userUpgradeInfo);
            systemMessageOooO0OO5.setType(5);
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO5);
            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.str_notice_personer_promotion);
        } else if (type5 == 11) {
            String mid6 = msg.getMid();
            long jOooO00o2 = Oooo0.OooO00o(mid6, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            o00O00.OooO0OO("SystemMsgProcessor", " saveRoomUpgradeMsg = " + systemMessageModel);
            SystemMessage.RoomUpgradeInfo roomUpgradeInfo = new SystemMessage.RoomUpgradeInfo();
            SystemMessageData data4 = systemMessageModel.getData();
            roomUpgradeInfo.setRoomLevel((data4 == null || (level2 = data4.getLevel()) == null) ? 0 : OooO.OooO0o0(level2));
            SystemMessage systemMessageOooO0OO6 = OooO0OO(mid6, jOooO00o2, systemMessageModel.getMessage());
            systemMessageOooO0OO6.setRoomUpgradeInfo(roomUpgradeInfo);
            systemMessageOooO0OO6.setType(6);
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO6);
            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.str_notice_room_promotion);
        } else if (type5 == 21) {
            String mid7 = msg.getMid();
            long jOooO00o3 = Oooo0.OooO00o(mid7, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            o00O00.OooO0OO("SystemMsgProcessor", " saveRoomWagesMsg = " + systemMessageModel);
            SystemMessage.RoomWageInfo roomWageInfo = new SystemMessage.RoomWageInfo();
            SystemMessageData data5 = systemMessageModel.getData();
            roomWageInfo.setWageCoin((data5 == null || (coin2 = data5.getCoin()) == null) ? 0 : OooO.OooO0o0(coin2));
            SystemMessage systemMessageOooO0OO7 = OooO0OO(mid7, jOooO00o3, systemMessageModel.getMessage());
            systemMessageOooO0OO7.setRoomWageInfo(roomWageInfo);
            systemMessageOooO0OO7.setType(7);
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO7);
            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.str_notice_salary);
        } else if (type5 == 22) {
            String mid8 = msg.getMid();
            long jOooO00o4 = Oooo0.OooO00o(mid8, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            o00O00.OooO0OO("SystemMsgProcessor", " saveLuckyRefundMsg = " + systemMessageModel);
            SystemMessage systemMessageOooO0OO8 = OooO0OO(mid8, jOooO00o4, systemMessageModel.getMessage());
            systemMessageOooO0OO8.setType(8);
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO8);
            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.str_notice_red_packet);
        } else if (type5 == 24) {
            String mid9 = msg.getMid();
            long jOooO00o5 = Oooo0.OooO00o(mid9, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            o00O00.OooO0OO("SystemMsgProcessor", " saveGiftLuckyRefundMsg = " + systemMessageModel);
            SystemMessage systemMessageOooO0OO9 = OooO0OO(mid9, jOooO00o5, systemMessageModel.getMessage());
            systemMessageOooO0OO9.setType(9);
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO9);
            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.str_notice_red_packet);
        } else if (type5 == 42) {
            String mid10 = msg.getMid();
            long jOooO00o6 = Oooo0.OooO00o(mid10, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            o00O00.OooO0OO("SystemMsgProcessor", " saveAppWakeupMsg = " + systemMessageModel);
            SystemMessage systemMessageOooO0OO10 = OooO0OO(mid10, jOooO00o6, systemMessageModel.getMessage());
            systemMessageOooO0OO10.setType(18);
            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO10);
            strOooO0OO = systemMessageModel.getMessage();
        } else {
            if (type5 != 60) {
                if (type5 == 65) {
                    String mid11 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid11, "msg.mid");
                    long time4 = msg.getTime();
                    o00O00.OooO0OO("saveKaVipMsg", " saveKaVipMsg = " + systemMessageModel);
                    if (systemMessageModel.getData() != null) {
                        SystemMessage.VipMsgInfo vipMsgInfo = new SystemMessage.VipMsgInfo();
                        SystemMessageData data6 = systemMessageModel.getData();
                        vipMsgInfo.setKaVipType((data6 == null || (type2 = data6.getType()) == null) ? 0 : OooO.OooO0o0(type2));
                        SystemMessageData data7 = systemMessageModel.getData();
                        vipMsgInfo.setKaVipLevel(data7 != null ? data7.getKaVipLevel() : 0);
                        SystemMessage systemMessageOooO0OO11 = OooO0OO(mid11, time4, systemMessageModel.getMessage());
                        systemMessageOooO0OO11.setKaVipMsgInfo(vipMsgInfo);
                        systemMessageOooO0OO11.setType(25);
                        OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO11);
                    }
                    SystemMessageData data8 = systemMessageModel.getData();
                    Integer numValueOf = (data8 == null || (type = data8.getType()) == null) ? null : Integer.valueOf(OooO.OooO0o0(type));
                    if (numValueOf != null && numValueOf.intValue() == 1) {
                        strOooO00o = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_ka_vip_expire);
                    } else if (numValueOf != null && numValueOf.intValue() == 2) {
                        strOooO00o = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_ka_vip_will_upgrade);
                    } else if (numValueOf != null && numValueOf.intValue() == 3) {
                        String strOooO0OO3 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_ka_vip_obtain);
                        String[] strArr = new String[1];
                        VipLevel.Companion companion = VipLevel.INSTANCE;
                        SystemMessageData data9 = systemMessageModel.getData();
                        strArr[0] = String.valueOf(companion.OooO0O0(data9 != null ? data9.getKaVipLevel() : 0).OooO0O0());
                        strOooO00o = OooOo.OooO00o(strOooO0OO3, strArr);
                    }
                } else if (type5 != 66) {
                    switch (type5) {
                        case 30:
                            String mid12 = msg.getMid();
                            long jOooO00o7 = Oooo0.OooO00o(mid12, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                            o00O00.OooO0OO("SystemMsgProcessor", " saveVipWillExpireMsg = " + systemMessageModel);
                            SystemMessage systemMessageOooO0OO12 = OooO0OO(mid12, jOooO00o7, systemMessageModel.getMessage());
                            systemMessageOooO0OO12.setType(10);
                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO12);
                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.str_notice_vip_timeout);
                            break;
                        case 31:
                            String mid13 = msg.getMid();
                            long jOooO00o8 = Oooo0.OooO00o(mid13, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                            o00O00.OooO0OO("SystemMsgProcessor", " saveVipHasExpireMsg = " + systemMessageModel);
                            SystemMessage.AristocracyExpiredInfo aristocracyExpiredInfo = new SystemMessage.AristocracyExpiredInfo();
                            SystemMessageData data10 = systemMessageModel.getData();
                            aristocracyExpiredInfo.setBuyType(data10 != null ? data10.getBuyType() : 0);
                            SystemMessageData data11 = systemMessageModel.getData();
                            aristocracyExpiredInfo.setVipLevel(data11 != null ? data11.getVipLevel() : 0);
                            SystemMessageData data12 = systemMessageModel.getData();
                            aristocracyExpiredInfo.setNVIPLv(data12 != null ? data12.getNVIPLv() : 0);
                            SystemMessage systemMessageOooO0OO13 = OooO0OO(mid13, jOooO00o8, systemMessageModel.getMessage());
                            systemMessageOooO0OO13.setAristocracyInfo(aristocracyExpiredInfo);
                            systemMessageOooO0OO13.setType(11);
                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO13);
                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Confirmation);
                            break;
                        case 32:
                            String mid14 = msg.getMid();
                            long jOooO00o9 = Oooo0.OooO00o(mid14, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                            o00O00.OooO0OO("SystemMsgProcessor", " saveUniqueIdHasExpiredMsg = " + systemMessageModel);
                            SystemMessage.UniqueIdDueRemindInfo uniqueIdDueRemindInfo = new SystemMessage.UniqueIdDueRemindInfo();
                            SystemMessageData data13 = systemMessageModel.getData();
                            long jOooO0oO = 0;
                            if (data13 != null && (expirationTime = data13.getExpirationTime()) != null) {
                                jOooO0oO = OooO.OooO0oO(expirationTime);
                            }
                            uniqueIdDueRemindInfo.setExpirationTime(jOooO0oO);
                            SystemMessage systemMessageOooO0OO14 = OooO0OO(mid14, jOooO00o9, systemMessageModel.getMessage());
                            systemMessageOooO0OO14.setUniqueIdDueRemindInfo(uniqueIdDueRemindInfo);
                            systemMessageOooO0OO14.setType(12);
                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO14);
                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Confirmation);
                            break;
                        case 33:
                            String mid15 = msg.getMid();
                            long jOooO00o10 = Oooo0.OooO00o(mid15, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                            o00O00.OooO0OO("SystemMsgProcessor", " saveTopCardBidRefundMsg = " + systemMessageModel);
                            SystemMessage systemMessageOooO0OO15 = OooO0OO(mid15, jOooO00o10, systemMessageModel.getMessage());
                            systemMessageOooO0OO15.setType(13);
                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO15);
                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.system_message_top_card_refund);
                            break;
                        case 34:
                            String mid16 = msg.getMid();
                            long jOooO00o11 = Oooo0.OooO00o(mid16, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                            o00O00.OooO0OO("SystemMsgProcessor", " saveTopCardBidSuccessMsg = " + systemMessageModel);
                            SystemMessage systemMessageOooO0OO16 = OooO0OO(mid16, jOooO00o11, systemMessageModel.getMessage());
                            systemMessageOooO0OO16.setType(14);
                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO16);
                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.system_message_top_card_bid);
                            break;
                        case 35:
                            String mid17 = msg.getMid();
                            long jOooO00o12 = Oooo0.OooO00o(mid17, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                            o00O00.OooO0OO("SystemMsgProcessor", " saveVipCoinRebateMsg = " + systemMessageModel);
                            SystemMessage.ConsumerRebateInfo consumerRebateInfo = new SystemMessage.ConsumerRebateInfo();
                            SystemMessageData data14 = systemMessageModel.getData();
                            consumerRebateInfo.setRebateCoin((data14 == null || (coin3 = data14.getCoin()) == null) ? 0 : OooO.OooO0o0(coin3));
                            SystemMessage systemMessageOooO0OO17 = OooO0OO(mid17, jOooO00o12, systemMessageModel.getMessage());
                            systemMessageOooO0OO17.setConsumerRebateInfo(consumerRebateInfo);
                            systemMessageOooO0OO17.setType(15);
                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO17);
                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Rebate_on_Gift_Sending);
                            break;
                        case 36:
                            String mid18 = msg.getMid();
                            long jOooO00o13 = Oooo0.OooO00o(mid18, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                            o00O00.OooO0OO("SystemMsgProcessor", " saveHeaderFrameUnlockMsg = " + systemMessageModel);
                            SystemMessage.UnlockAvatarFrameInfo unlockAvatarFrameInfo = new SystemMessage.UnlockAvatarFrameInfo();
                            SystemMessageData data15 = systemMessageModel.getData();
                            if (data15 != null && (headFrameUrl = data15.getHeadFrameUrl()) != null) {
                                strOooO00o = headFrameUrl;
                            }
                            unlockAvatarFrameInfo.setAvatarFrameUrl(strOooO00o);
                            SystemMessage systemMessageOooO0OO18 = OooO0OO(mid18, jOooO00o13, systemMessageModel.getMessage());
                            systemMessageOooO0OO18.setUnlockAvatarFrameInfo(unlockAvatarFrameInfo);
                            systemMessageOooO0OO18.setType(16);
                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO18);
                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_unlocked_a_profile_frame);
                            break;
                        case 37:
                            String mid19 = msg.getMid();
                            long jOooO00o14 = Oooo0.OooO00o(mid19, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                            o00O00.OooO0OO("SystemMsgProcessor", " saveSubscribePremiumRewardMsg = " + systemMessageModel);
                            SystemMessage.SubscribeRewardInfo subscribeRewardInfo = new SystemMessage.SubscribeRewardInfo();
                            SystemMessageData data16 = systemMessageModel.getData();
                            subscribeRewardInfo.setRewardCoin((data16 == null || (coin4 = data16.getCoin()) == null) ? 0 : OooO.OooO0o0(coin4));
                            SystemMessage systemMessageOooO0OO19 = OooO0OO(mid19, jOooO00o14, systemMessageModel.getMessage());
                            systemMessageOooO0OO19.setSubscribeRewardInfo(subscribeRewardInfo);
                            systemMessageOooO0OO19.setType(17);
                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO19);
                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.premium_reward);
                            break;
                        default:
                            switch (type5) {
                                case 50:
                                    String mid20 = msg.getMid();
                                    long jOooO00o15 = Oooo0.OooO00o(mid20, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                    o00O00.OooO0OO("SystemMsgProcessor", " saveMedalNoticeMsg = " + systemMessageModel);
                                    SystemMessage.MedalNoticeInfo medalNoticeInfo = new SystemMessage.MedalNoticeInfo();
                                    SystemMessageData data17 = systemMessageModel.getData();
                                    medalNoticeInfo.setMedalLevel((data17 == null || (type3 = data17.getType()) == null) ? 0 : OooO.OooO0o0(type3));
                                    SystemMessageData data18 = systemMessageModel.getData();
                                    medalNoticeInfo.setMedalId((data18 == null || (medalId = data18.getMedalId()) == null) ? 0 : OooO.OooO0o0(medalId));
                                    SystemMessage systemMessageOooO0OO20 = OooO0OO(mid20, jOooO00o15, systemMessageModel.getMessage());
                                    systemMessageOooO0OO20.setMedalNoticeInfo(medalNoticeInfo);
                                    systemMessageOooO0OO20.setType(19);
                                    OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO20);
                                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.system_title_newbadge);
                                    break;
                                case 51:
                                    String mid21 = msg.getMid();
                                    long jOooO00o16 = Oooo0.OooO00o(mid21, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                    o00O00.OooO0OO("SystemMsgProcessor", " saveHonorMedalNoticeMsg = " + systemMessageModel);
                                    SystemMessage.MedalNoticeInfo medalNoticeInfo2 = new SystemMessage.MedalNoticeInfo();
                                    SystemMessageData data19 = systemMessageModel.getData();
                                    medalNoticeInfo2.setMedalLevel((data19 == null || (type4 = data19.getType()) == null) ? 0 : OooO.OooO0o0(type4));
                                    SystemMessageData data20 = systemMessageModel.getData();
                                    medalNoticeInfo2.setMedalId((data20 == null || (medalId2 = data20.getMedalId()) == null) ? 0 : OooO.OooO0o0(medalId2));
                                    SystemMessage systemMessageOooO0OO21 = OooO0OO(mid21, jOooO00o16, systemMessageModel.getMessage());
                                    systemMessageOooO0OO21.setMedalNoticeInfo(medalNoticeInfo2);
                                    systemMessageOooO0OO21.setType(20);
                                    OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO21);
                                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.system_title_newbadge);
                                    break;
                                case 52:
                                    String mid22 = msg.getMid();
                                    Intrinsics.checkNotNullExpressionValue(mid22, "msg.mid");
                                    long time5 = msg.getTime();
                                    o00O00.OooO0OO("SystemMsgProcessor", " savaCustomThemeMsg = " + systemMessageModel);
                                    SystemMessageData data21 = systemMessageModel.getData();
                                    if (data21 == null) {
                                        strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_custom_theme_failed_title);
                                    } else {
                                        int iOooO0o0 = OooO.OooO0o0(data21.getType());
                                        if (iOooO0o0 == 1) {
                                            SystemMessage.CustomTheme customTheme = new SystemMessage.CustomTheme();
                                            SystemMessage systemMessageOooO0OO22 = OooO0OO(mid22, time5, systemMessageModel.getMessage());
                                            systemMessageOooO0OO22.setCustomTheme(customTheme);
                                            systemMessageOooO0OO22.setType(22);
                                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO22);
                                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_custom_theme_successful_title);
                                        } else if (iOooO0o0 == 2) {
                                            SystemMessage.CustomTheme customTheme2 = new SystemMessage.CustomTheme();
                                            customTheme2.setCause(data21.getCause());
                                            SystemMessage systemMessageOooO0OO23 = OooO0OO(mid22, time5, systemMessageModel.getMessage());
                                            systemMessageOooO0OO23.setCustomTheme(customTheme2);
                                            systemMessageOooO0OO23.setType(23);
                                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO23);
                                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_custom_theme_failed_title);
                                        } else if (iOooO0o0 == 4) {
                                            SystemMessage.CustomTheme customTheme3 = new SystemMessage.CustomTheme();
                                            SystemMessage systemMessageOooO0OO24 = OooO0OO(mid22, time5, systemMessageModel.getMessage());
                                            systemMessageOooO0OO24.setCustomTheme(customTheme3);
                                            systemMessageOooO0OO24.setType(24);
                                            OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO24);
                                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_custom_theme_delete_title);
                                        } else {
                                            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_custom_theme_failed_title);
                                        }
                                    }
                                    break;
                                default:
                                    switch (type5) {
                                        case 72:
                                            String mid23 = msg.getMid();
                                            Intrinsics.checkNotNullExpressionValue(mid23, "msg.mid");
                                            strOooO0OO = OooO0o(mid23, msg.getTime(), systemMessageModel);
                                            break;
                                        case 73:
                                            String mid24 = msg.getMid();
                                            Intrinsics.checkNotNullExpressionValue(mid24, "msg.mid");
                                            strOooO0OO = OooO0o(mid24, msg.getTime(), systemMessageModel);
                                            break;
                                        case 74:
                                            String mid25 = msg.getMid();
                                            Intrinsics.checkNotNullExpressionValue(mid25, "msg.mid");
                                            strOooO0OO = OooO0o(mid25, msg.getTime(), systemMessageModel);
                                            break;
                                        case 75:
                                            String mid26 = msg.getMid();
                                            Intrinsics.checkNotNullExpressionValue(mid26, "msg.mid");
                                            strOooO0OO = OooO0o(mid26, msg.getTime(), systemMessageModel);
                                            break;
                                        case 76:
                                            String mid27 = msg.getMid();
                                            Intrinsics.checkNotNullExpressionValue(mid27, "msg.mid");
                                            strOooO0OO = OooO0o(mid27, msg.getTime(), systemMessageModel);
                                            break;
                                        case 77:
                                            String mid28 = msg.getMid();
                                            Intrinsics.checkNotNullExpressionValue(mid28, "msg.mid");
                                            strOooO0OO = OooO0o(mid28, msg.getTime(), systemMessageModel);
                                            break;
                                        case 78:
                                            String mid29 = msg.getMid();
                                            long jOooO00o17 = Oooo0.OooO00o(mid29, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                            o00O00.OooO0OO("saveFirstDepositReward", "saveFirstDepositReward = " + systemMessageModel);
                                            strOooO00o = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.system_mssage_title_first_recharge_rewards);
                                            SystemMessageData data22 = systemMessageModel.getData();
                                            if (data22 != null) {
                                                SystemMessage systemMessageOooO0OO25 = OooO0OO(mid29, jOooO00o17, systemMessageModel.getMessage());
                                                if (data22.getMessageType() == 0) {
                                                    systemMessageOooO0OO25.setType(33);
                                                    strOooO0OO2 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.system_mssage_title_first_recharge_rewards);
                                                } else {
                                                    systemMessageOooO0OO25.setType(35);
                                                    strOooO0OO2 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.system_mssage_title_first_month_recharge_rewards);
                                                }
                                                strOooO00o = strOooO0OO2;
                                                SystemMessage.FirstRewardInfo firstRewardInfo = new SystemMessage.FirstRewardInfo();
                                                firstRewardInfo.setRewardCoin(data22.getRewardCoin());
                                                firstRewardInfo.setMessageType(data22.getMessageType());
                                                systemMessageOooO0OO25.setFirstRewardInfo(firstRewardInfo);
                                                OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO25);
                                            }
                                            break;
                                        default:
                                            switch (type5) {
                                                case 80:
                                                    String mid30 = msg.getMid();
                                                    long jOooO00o18 = Oooo0.OooO00o(mid30, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                    o00O00.OooO0OO("saveRechargeReward", "saveRechargeReward = " + systemMessageModel);
                                                    SystemMessage systemMessageOooO0OO26 = OooO0OO(mid30, jOooO00o18, systemMessageModel.getMessage());
                                                    systemMessageOooO0OO26.setType(34);
                                                    OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO26);
                                                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Recharge_Successful);
                                                    break;
                                                case 81:
                                                    String mid31 = msg.getMid();
                                                    long jOooO00o19 = Oooo0.OooO00o(mid31, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                    o00O00.OooO0OO("saveRoomMemberBadgeFrozenMessage", "model = " + systemMessageModel);
                                                    SystemMessage systemMessageOooO0OO27 = OooO0OO(mid31, jOooO00o19, systemMessageModel.getMessage());
                                                    systemMessageOooO0OO27.setType(36);
                                                    SystemMessage.MemberBadgeFrozenInfo memberBadgeFrozenInfo = new SystemMessage.MemberBadgeFrozenInfo();
                                                    SystemMessageData data23 = systemMessageModel.getData();
                                                    if (data23 != null) {
                                                        memberBadgeFrozenInfo.setRoomId(Long.valueOf(data23.getRoomId()));
                                                        memberBadgeFrozenInfo.setRoomName(data23.getRoomName());
                                                        systemMessageOooO0OO27.setMemberBadgeFrozenInfo(memberBadgeFrozenInfo);
                                                        OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO27);
                                                    }
                                                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.member_badge_frozen_tip_title);
                                                    break;
                                                case 82:
                                                    String mid32 = msg.getMid();
                                                    long jOooO00o20 = Oooo0.OooO00o(mid32, "msg.mid", msg, systemMessageModel, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                    o00O00.OooO0OO("saveRoomMemberBadgeFrozenMessage", "model = " + systemMessageModel);
                                                    SystemMessage systemMessageOooO0OO28 = OooO0OO(mid32, jOooO00o20, systemMessageModel.getMessage());
                                                    systemMessageOooO0OO28.setType(37);
                                                    SystemMessage.MemberBadgeTopRankReward memberBadgeTopRankReward = new SystemMessage.MemberBadgeTopRankReward();
                                                    SystemMessageData data24 = systemMessageModel.getData();
                                                    if (data24 != null) {
                                                        memberBadgeTopRankReward.setShopId(Integer.valueOf(data24.getShopid()));
                                                        memberBadgeTopRankReward.setShopUrl(data24.getShopurl());
                                                        systemMessageOooO0OO28.setMemberBadgeTopRankReward(memberBadgeTopRankReward);
                                                        OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO28);
                                                    }
                                                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.member_badge_reward_title);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    String mid33 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid33, "msg.mid");
                    long time6 = msg.getTime();
                    o00O00.OooO0OO("saveGiveThemeMsg", " saveGiveThemeMsg = " + systemMessageModel);
                    SystemMessageData data25 = systemMessageModel.getData();
                    if (data25 != null) {
                        SystemMessage.GiveThemeInfo giveThemeInfo = new SystemMessage.GiveThemeInfo();
                        giveThemeInfo.setUserId(data25.getUserId());
                        giveThemeInfo.setDayNum(data25.getDayNum());
                        SystemMessage systemMessageOooO0OO29 = OooO0OO(mid33, time6, systemMessageModel.getMessage());
                        systemMessageOooO0OO29.setGiveThemeInfo(giveThemeInfo);
                        systemMessageOooO0OO29.setType(26);
                        OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO29);
                    }
                    strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_give_theme_reimburse_title);
                }
                if (OooO0Oo()) {
                    OooO0oO("Yalla_Notice_Syatem", com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notify_new_message), strOooO00o, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notify_new_message), SystemMessageActivity.class);
                }
            }
            String mid34 = msg.getMid();
            Intrinsics.checkNotNullExpressionValue(mid34, "msg.mid");
            long time7 = msg.getTime();
            o00O00.OooO0OO("SystemMsgProcessor", " saveTreasureBoxWinMsg = " + systemMessageModel);
            SystemMessageData data26 = systemMessageModel.getData();
            if (data26 != null) {
                SystemMessage.TreasureBox treasureBox = new SystemMessage.TreasureBox();
                treasureBox.setAwardType(data26.getAwardtype());
                treasureBox.setImageurl(data26.getImageurl());
                SystemMessage systemMessageOooO0OO30 = OooO0OO(mid34, time7, systemMessageModel.getMessage());
                systemMessageOooO0OO30.setTreasureBox(treasureBox);
                systemMessageOooO0OO30.setType(21);
                OooO0OO.OooO00o().Oooo00o().OooO0oO(systemMessageOooO0OO30);
            }
            strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.system_message_treasure_win);
        }
        strOooO00o = strOooO0OO;
        if (OooO0Oo()) {
            OooO0oO("Yalla_Notice_Syatem", com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notify_new_message), strOooO00o, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.notify_new_message), SystemMessageActivity.class);
        }
    }

    public final void OooO0oO(String str, String str2, String str3, String str4, Class<?> cls) {
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(str3)) {
            o0ooOOo.OooO0OO(str, str2, str3, str4, new Intent(App.f11473OoooO00, cls));
        }
    }
}
