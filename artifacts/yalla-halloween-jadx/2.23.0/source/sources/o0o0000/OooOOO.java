package o0o0000;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Oooo0;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o0000OO0;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0OoOo0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.data.db.table.SystemMessage;
import com.yalla.yalla.model.SystemMessageData;
import com.yalla.yalla.model.SystemMessageModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p385o0OOooOO.o00O00o0;
import p385o0OOooOO.oOO00O;
import p408o0Oo0o0O.o00Oo0;
import p417o0OoO0.o0000O0O;
import p464o0Oooo.o000000O;
import p472o0Ooooo0.oO0000o0;
import p579o0oOoo.oOO0O0;
import p579o0oOoo.oOo00OO0;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO extends OooOO0O {
    /* JADX WARN: Multi-variable type inference failed */
    public static long OooO0O0() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static SystemMessage OooO0OO(long j, String str, String str2) {
        long jCurrentTimeMillis;
        SystemMessage systemMessage = new SystemMessage();
        systemMessage.setUid(OooO0O0());
        systemMessage.setMid(str);
        systemMessage.setMessage(str2);
        if (j <= 0) {
            synchronized (oO0000o0.f47205OooO00o) {
                jCurrentTimeMillis = System.currentTimeMillis() + o0O.OooO0O0.OooO0Oo().f56690OooO00o;
            }
            j = jCurrentTimeMillis;
        }
        systemMessage.setTime(j);
        return systemMessage;
    }

    public static String OooO0o(String str, long j, SystemMessageModel systemMessageModel) {
        p592o0oo00O.OooOOO0.OooO0OO("saveEventMsg", " saveEventMsg = " + systemMessageModel);
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
            SystemMessage systemMessageOooO0OO = OooO0OO(j, str, systemMessageModel.getMessage());
            systemMessageOooO0OO.setEventInfo(eventInfo);
            switch (systemMessageModel.getType()) {
                case 72:
                    systemMessageOooO0OO.setType(27);
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Event_Message_Title_start);
                    break;
                case 73:
                    systemMessageOooO0OO.setType(28);
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Event_Message_Title_start);
                    break;
                case 74:
                    systemMessageOooO0OO.setType(30);
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Event_Message_Title_cancel);
                    break;
                case 75:
                    systemMessageOooO0OO.setType(31);
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Event_Message_Title_passed);
                    break;
                case 76:
                    systemMessageOooO0OO.setType(32);
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Event_Message_Title_recommend);
                    break;
                case 77:
                    systemMessageOooO0OO.setType(29);
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Event_Message_Title_deleted);
                    break;
            }
            OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO);
        }
        return strOooO0OO;
    }

    public static void OooO0oO(String str, String str2, String str3, String str4) {
        if (com.code.android.util.OooOo00.OooO0O0(str3)) {
            oOO0O0.OooO0O0(str, str2, str3, str4, new Intent(App.f22702OooO0o, (Class<?>) SystemMessageActivity.class));
        }
    }

    public final boolean OooO0Oo() {
        return ((com.code.android.util.OooO0O0.OooO0O0() instanceof SystemMessageActivity) || OooOO0O.OooO00o()) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:180:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:183:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:213:0x08da  */
    /* JADX WARN: Code duplicated, block: B:313:0x0db8  */
    /* JADX WARN: Code duplicated, block: B:342:? A[RETURN, SYNTHETIC] */
    public final void OooO0o0(@NotNull MessageIM.Message msg, boolean z) {
        String str;
        int i;
        int iOooO0o;
        String strOooO0OO;
        String level;
        String upCrystal;
        String coin;
        String strOooO0OO2;
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
        String strOooO0OO3;
        String strOooO0OO4;
        String strOooO00o;
        String badgeImage;
        Intrinsics.checkNotNullParameter(msg, "msg");
        p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " parseMessage = " + msg);
        if (msg.getFromId() == OooO0O0() || com.code.android.util.OooOo00.OooO00o(msg.getMid())) {
            return;
        }
        if (com.code.android.util.OooOo00.OooO0O0(o000OOo.OooO00o().Oooo000().OooO0o(msg.getMid(), Long.valueOf(OooO0O0())))) {
            return;
        }
        int head = msg.getHead();
        if (head == 1002) {
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveJoinTopicMessage = " + msg);
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
            SystemMessage systemMessageOooO0OO = OooO0OO(time, mid, sendMsg);
            systemMessageOooO0OO.setType(2);
            systemMessageOooO0OO.setJoinTopicInfo(joinTopicInfo);
            o000OOo.OooO00o().Oooo000().OooO0O0(systemMessageOooO0OO);
            OooOo.OooO0OO(40, null);
            if (OooO0Oo()) {
                OooO0oO("Yalla_Notice_Monemt", o0000.OooO0OO(oO00OOo0.Notice_Title_moment), systemMessageOooO0OO.getMessage(), o0000.OooO0OO(oO00OOo0.notify_new_message));
                return;
            }
            return;
        }
        if (head == 1051) {
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveVipMessage = " + msg);
            MessageIM.Message1051 from2 = MessageIM.Message1051.parseFrom(msg.getBody());
            if (from2 == null) {
                return;
            }
            SystemMessage.PremiumInfo premiumInfo = new SystemMessage.PremiumInfo();
            premiumInfo.setVipLevel(from2.getNVipLv());
            String mid2 = msg.getMid();
            Intrinsics.checkNotNullExpressionValue(mid2, "msg.mid");
            SystemMessage systemMessageOooO0OO2 = OooO0OO(msg.getTime(), mid2, new String());
            systemMessageOooO0OO2.setType(1);
            systemMessageOooO0OO2.setVipInfo(premiumInfo);
            o000OOo.OooO00o().Oooo000().OooO0O0(systemMessageOooO0OO2);
            OooOo.OooO0OO(40, null);
            if (OooO0Oo()) {
                int i2 = oO00OOo0.notify_new_message;
                OooO0oO("Yalla_Notice_Syatem", o0000.OooO0OO(i2), systemMessageOooO0OO2.getMessage(), o0000.OooO0OO(i2));
                return;
            }
            return;
        }
        if (head == 1500) {
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveTopicStateMessage = " + msg);
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
            SystemMessage systemMessageOooO0OO3 = OooO0OO(time2, mid3, msg2);
            systemMessageOooO0OO3.setType(3);
            systemMessageOooO0OO3.setTopicStateInfo(topicStateInfo);
            o000OOo.OooO00o().Oooo000().OooO0O0(systemMessageOooO0OO3);
            OooOo.OooO0OO(40, null);
            if (OooO0Oo()) {
                int i3 = oO00OOo0.notify_new_message;
                OooO0oO("Yalla_Notice_Syatem", o0000.OooO0OO(i3), systemMessageOooO0OO3.getMessage(), o0000.OooO0OO(i3));
                return;
            }
            return;
        }
        if (head != 2102) {
            if (head != 2118) {
                return;
            }
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveMoraMessage = " + msg);
            MessageIM.Message2118 from4 = MessageIM.Message2118.parseFrom(msg.getBody());
            if (from4 == null) {
                return;
            }
            String mid4 = msg.getMid();
            Intrinsics.checkNotNullExpressionValue(mid4, "msg.mid");
            long time3 = msg.getTime();
            String msg3 = from4.getMsg();
            Intrinsics.checkNotNullExpressionValue(msg3, "moraMsg.msg");
            SystemMessage systemMessageOooO0OO4 = OooO0OO(time3, mid4, msg3);
            systemMessageOooO0OO4.setType(4);
            o000OOo.OooO00o().Oooo000().OooO0O0(systemMessageOooO0OO4);
            OooOo.OooO0OO(40, null);
            o0000OO0.OooO0O0().OooO0Oo(1L, OooO0O0() + "MORA_RED_POINT");
            LiveEventBus.get("MORA_RED_POINT").post(msg);
            return;
        }
        p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " parseBroadcastMessage = " + msg);
        SystemMessageModel model = (SystemMessageModel) oOo00OO0.OooO00o(MessageIM.Message2102.parseFrom(msg.getBody()).getMsg(), SystemMessageModel.class);
        int type5 = model.getType();
        if (type5 == 10) {
            str = "Yalla_Notice_Syatem";
            String mid5 = msg.getMid();
            long jOooO00o = Oooo0.OooO00o(mid5, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveUserUpgradeMsg = " + model);
            SystemMessage.UserUpgradeInfo userUpgradeInfo = new SystemMessage.UserUpgradeInfo();
            SystemMessageData data = model.getData();
            if (data == null || (coin = data.getCoin()) == null) {
                i = 0;
                iOooO0o = 0;
            } else {
                i = 0;
                iOooO0o = o0OoOo0.OooO0o(0, coin);
            }
            userUpgradeInfo.setUpCoin(iOooO0o);
            SystemMessageData data2 = model.getData();
            userUpgradeInfo.setUpCrystal((data2 == null || (upCrystal = data2.getUpCrystal()) == null) ? i : o0OoOo0.OooO0o(0, upCrystal));
            SystemMessageData data3 = model.getData();
            userUpgradeInfo.setUserLevel((data3 == null || (level = data3.getLevel()) == null) ? i : o0OoOo0.OooO0o(0, level));
            SystemMessage systemMessageOooO0OO5 = OooO0OO(jOooO00o, mid5, model.getMessage());
            systemMessageOooO0OO5.setUserUpgradeInfo(userUpgradeInfo);
            systemMessageOooO0OO5.setType(5);
            OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO5);
            strOooO0OO = o0000.OooO0OO(oO00OOo0.str_notice_personer_promotion);
        } else if (type5 == 11) {
            str = "Yalla_Notice_Syatem";
            String mid6 = msg.getMid();
            long jOooO00o2 = Oooo0.OooO00o(mid6, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveRoomUpgradeMsg = " + model);
            SystemMessage.RoomUpgradeInfo roomUpgradeInfo = new SystemMessage.RoomUpgradeInfo();
            SystemMessageData data4 = model.getData();
            roomUpgradeInfo.setRoomLevel((data4 == null || (level2 = data4.getLevel()) == null) ? 0 : o0OoOo0.OooO0o(0, level2));
            SystemMessage systemMessageOooO0OO6 = OooO0OO(jOooO00o2, mid6, model.getMessage());
            systemMessageOooO0OO6.setRoomUpgradeInfo(roomUpgradeInfo);
            systemMessageOooO0OO6.setType(6);
            OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO6);
            strOooO0OO = o0000.OooO0OO(oO00OOo0.str_notice_room_promotion);
        } else if (type5 == 21) {
            str = "Yalla_Notice_Syatem";
            String mid7 = msg.getMid();
            long jOooO00o3 = Oooo0.OooO00o(mid7, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveRoomWagesMsg = " + model);
            SystemMessage.RoomWageInfo roomWageInfo = new SystemMessage.RoomWageInfo();
            SystemMessageData data5 = model.getData();
            roomWageInfo.setWageCoin((data5 == null || (coin2 = data5.getCoin()) == null) ? 0 : o0OoOo0.OooO0o(0, coin2));
            SystemMessage systemMessageOooO0OO7 = OooO0OO(jOooO00o3, mid7, model.getMessage());
            systemMessageOooO0OO7.setRoomWageInfo(roomWageInfo);
            systemMessageOooO0OO7.setType(7);
            OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO7);
            strOooO0OO = o0000.OooO0OO(oO00OOo0.str_notice_salary);
        } else if (type5 == 22) {
            str = "Yalla_Notice_Syatem";
            String mid8 = msg.getMid();
            long jOooO00o4 = Oooo0.OooO00o(mid8, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveLuckyRefundMsg = " + model);
            SystemMessage systemMessageOooO0OO8 = OooO0OO(jOooO00o4, mid8, model.getMessage());
            systemMessageOooO0OO8.setType(8);
            OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO8);
            strOooO0OO = o0000.OooO0OO(oO00OOo0.str_notice_red_packet);
        } else if (type5 == 24) {
            str = "Yalla_Notice_Syatem";
            String mid9 = msg.getMid();
            long jOooO00o5 = Oooo0.OooO00o(mid9, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveGiftLuckyRefundMsg = " + model);
            SystemMessage systemMessageOooO0OO9 = OooO0OO(jOooO00o5, mid9, model.getMessage());
            systemMessageOooO0OO9.setType(9);
            OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO9);
            strOooO0OO = o0000.OooO0OO(oO00OOo0.str_notice_red_packet);
        } else if (type5 == 42) {
            str = "Yalla_Notice_Syatem";
            String mid10 = msg.getMid();
            long jOooO00o6 = Oooo0.OooO00o(mid10, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveAppWakeupMsg = " + model);
            SystemMessage systemMessageOooO0OO10 = OooO0OO(jOooO00o6, mid10, model.getMessage());
            systemMessageOooO0OO10.setType(18);
            o000OOo.OooO00o().Oooo000().OooO0O0(systemMessageOooO0OO10);
            strOooO0OO = model.getMessage();
        } else {
            if (type5 != 60) {
                String strOooO00o2 = "";
                if (type5 == 65) {
                    str = "Yalla_Notice_Syatem";
                    String mid11 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid11, "msg.mid");
                    long time4 = msg.getTime();
                    p592o0oo00O.OooOOO0.OooO0OO("saveKaVipMsg", " saveKaVipMsg = " + model);
                    if (model.getData() != null) {
                        SystemMessage.VipMsgInfo vipMsgInfo = new SystemMessage.VipMsgInfo();
                        SystemMessageData data6 = model.getData();
                        vipMsgInfo.setKaVipType((data6 == null || (type2 = data6.getType()) == null) ? 0 : o0OoOo0.OooO0o(0, type2));
                        SystemMessageData data7 = model.getData();
                        vipMsgInfo.setKaVipLevel(data7 != null ? data7.getKaVipLevel() : 0);
                        SystemMessage systemMessageOooO0OO11 = OooO0OO(time4, mid11, model.getMessage());
                        systemMessageOooO0OO11.setKaVipMsgInfo(vipMsgInfo);
                        systemMessageOooO0OO11.setType(25);
                        OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO11);
                    }
                    SystemMessageData data8 = model.getData();
                    Integer numValueOf = (data8 == null || (type = data8.getType()) == null) ? null : Integer.valueOf(o0OoOo0.OooO0o(0, type));
                    if (numValueOf != null && numValueOf.intValue() == 1) {
                        strOooO00o2 = o0000.OooO0OO(oO00OOo0.message_ka_vip_expire);
                    } else if (numValueOf != null && numValueOf.intValue() == 2) {
                        strOooO00o2 = o0000.OooO0OO(oO00OOo0.message_ka_vip_will_upgrade);
                    } else if (numValueOf != null && numValueOf.intValue() == 3) {
                        String strOooO0OO5 = o0000.OooO0OO(oO00OOo0.message_ka_vip_obtain);
                        String[] strArr = new String[1];
                        VipLevel.Companion companion = VipLevel.INSTANCE;
                        SystemMessageData data9 = model.getData();
                        strArr[0] = String.valueOf(companion.of(data9 != null ? data9.getKaVipLevel() : 0).level());
                        strOooO00o2 = o0000O.OooO00o(strOooO0OO5, strArr);
                    }
                } else {
                    if (type5 != 66) {
                        str = "Yalla_Notice_Syatem";
                        long jOooO = 0;
                        switch (type5) {
                            case 30:
                                String mid12 = msg.getMid();
                                long jOooO00o7 = Oooo0.OooO00o(mid12, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveVipWillExpireMsg = " + model);
                                SystemMessage systemMessageOooO0OO12 = OooO0OO(jOooO00o7, mid12, model.getMessage());
                                systemMessageOooO0OO12.setType(10);
                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO12);
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.str_notice_vip_timeout);
                                break;
                            case 31:
                                String mid13 = msg.getMid();
                                long jOooO00o8 = Oooo0.OooO00o(mid13, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveVipHasExpireMsg = " + model);
                                SystemMessage.AristocracyExpiredInfo aristocracyExpiredInfo = new SystemMessage.AristocracyExpiredInfo();
                                SystemMessageData data10 = model.getData();
                                aristocracyExpiredInfo.setBuyType(data10 != null ? data10.getBuyType() : 0);
                                SystemMessageData data11 = model.getData();
                                aristocracyExpiredInfo.setVipLevel(data11 != null ? data11.getVipLevel() : 0);
                                SystemMessageData data12 = model.getData();
                                aristocracyExpiredInfo.setNVIPLv(data12 != null ? data12.getNVIPLv() : 0);
                                SystemMessage systemMessageOooO0OO13 = OooO0OO(jOooO00o8, mid13, model.getMessage());
                                systemMessageOooO0OO13.setAristocracyInfo(aristocracyExpiredInfo);
                                systemMessageOooO0OO13.setType(11);
                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO13);
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.Confirmation);
                                break;
                            case 32:
                                String mid14 = msg.getMid();
                                long jOooO00o9 = Oooo0.OooO00o(mid14, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveUniqueIdHasExpiredMsg = " + model);
                                SystemMessage.UniqueIdDueRemindInfo uniqueIdDueRemindInfo = new SystemMessage.UniqueIdDueRemindInfo();
                                SystemMessageData data13 = model.getData();
                                if (data13 != null && (expirationTime = data13.getExpirationTime()) != null) {
                                    jOooO = o0OoOo0.OooO(0L, expirationTime);
                                }
                                uniqueIdDueRemindInfo.setExpirationTime(jOooO);
                                SystemMessage systemMessageOooO0OO14 = OooO0OO(jOooO00o9, mid14, model.getMessage());
                                systemMessageOooO0OO14.setUniqueIdDueRemindInfo(uniqueIdDueRemindInfo);
                                systemMessageOooO0OO14.setType(12);
                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO14);
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.Confirmation);
                                break;
                            case 33:
                                String mid15 = msg.getMid();
                                long jOooO00o10 = Oooo0.OooO00o(mid15, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveTopCardBidRefundMsg = " + model);
                                SystemMessage systemMessageOooO0OO15 = OooO0OO(jOooO00o10, mid15, model.getMessage());
                                systemMessageOooO0OO15.setType(13);
                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO15);
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.system_message_top_card_refund);
                                break;
                            case 34:
                                String mid16 = msg.getMid();
                                long jOooO00o11 = Oooo0.OooO00o(mid16, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveTopCardBidSuccessMsg = " + model);
                                SystemMessage systemMessageOooO0OO16 = OooO0OO(jOooO00o11, mid16, model.getMessage());
                                systemMessageOooO0OO16.setType(14);
                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO16);
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.system_message_top_card_bid);
                                break;
                            case 35:
                                String mid17 = msg.getMid();
                                long jOooO00o12 = Oooo0.OooO00o(mid17, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveVipCoinRebateMsg = " + model);
                                SystemMessage.ConsumerRebateInfo consumerRebateInfo = new SystemMessage.ConsumerRebateInfo();
                                SystemMessageData data14 = model.getData();
                                consumerRebateInfo.setRebateCoin((data14 == null || (coin3 = data14.getCoin()) == null) ? 0 : o0OoOo0.OooO0o(0, coin3));
                                SystemMessage systemMessageOooO0OO17 = OooO0OO(jOooO00o12, mid17, model.getMessage());
                                systemMessageOooO0OO17.setConsumerRebateInfo(consumerRebateInfo);
                                systemMessageOooO0OO17.setType(15);
                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO17);
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.Rebate_on_Gift_Sending);
                                break;
                            case 36:
                                String mid18 = msg.getMid();
                                long jOooO00o13 = Oooo0.OooO00o(mid18, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveHeaderFrameUnlockMsg = " + model);
                                SystemMessage.UnlockAvatarFrameInfo unlockAvatarFrameInfo = new SystemMessage.UnlockAvatarFrameInfo();
                                SystemMessageData data15 = model.getData();
                                if (data15 != null && (headFrameUrl = data15.getHeadFrameUrl()) != null) {
                                    strOooO00o2 = headFrameUrl;
                                }
                                unlockAvatarFrameInfo.setAvatarFrameUrl(strOooO00o2);
                                SystemMessage systemMessageOooO0OO18 = OooO0OO(jOooO00o13, mid18, model.getMessage());
                                systemMessageOooO0OO18.setUnlockAvatarFrameInfo(unlockAvatarFrameInfo);
                                systemMessageOooO0OO18.setType(16);
                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO18);
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.message_unlocked_a_profile_frame);
                                break;
                            case 37:
                                String mid19 = msg.getMid();
                                long jOooO00o14 = Oooo0.OooO00o(mid19, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveSubscribePremiumRewardMsg = " + model);
                                SystemMessage.SubscribeRewardInfo subscribeRewardInfo = new SystemMessage.SubscribeRewardInfo();
                                SystemMessageData data16 = model.getData();
                                subscribeRewardInfo.setRewardCoin((data16 == null || (coin4 = data16.getCoin()) == null) ? 0 : o0OoOo0.OooO0o(0, coin4));
                                SystemMessage systemMessageOooO0OO19 = OooO0OO(jOooO00o14, mid19, model.getMessage());
                                systemMessageOooO0OO19.setSubscribeRewardInfo(subscribeRewardInfo);
                                systemMessageOooO0OO19.setType(17);
                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO19);
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.premium_reward);
                                break;
                            default:
                                switch (type5) {
                                    case 50:
                                        String mid20 = msg.getMid();
                                        long jOooO00o15 = Oooo0.OooO00o(mid20, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                        p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveMedalNoticeMsg = " + model);
                                        SystemMessage.MedalNoticeInfo medalNoticeInfo = new SystemMessage.MedalNoticeInfo();
                                        SystemMessageData data17 = model.getData();
                                        medalNoticeInfo.setMedalLevel((data17 == null || (type3 = data17.getType()) == null) ? 0 : o0OoOo0.OooO0o(0, type3));
                                        SystemMessageData data18 = model.getData();
                                        medalNoticeInfo.setMedalId((data18 == null || (medalId = data18.getMedalId()) == null) ? 0 : o0OoOo0.OooO0o(0, medalId));
                                        SystemMessage systemMessageOooO0OO20 = OooO0OO(jOooO00o15, mid20, model.getMessage());
                                        systemMessageOooO0OO20.setMedalNoticeInfo(medalNoticeInfo);
                                        systemMessageOooO0OO20.setType(19);
                                        OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO20);
                                        strOooO0OO = o0000.OooO0OO(oO00OOo0.system_title_newbadge);
                                        break;
                                    case 51:
                                        String mid21 = msg.getMid();
                                        long jOooO00o16 = Oooo0.OooO00o(mid21, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                        p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveHonorMedalNoticeMsg = " + model);
                                        SystemMessage.MedalNoticeInfo medalNoticeInfo2 = new SystemMessage.MedalNoticeInfo();
                                        SystemMessageData data19 = model.getData();
                                        medalNoticeInfo2.setMedalLevel((data19 == null || (type4 = data19.getType()) == null) ? 0 : o0OoOo0.OooO0o(0, type4));
                                        SystemMessageData data20 = model.getData();
                                        medalNoticeInfo2.setMedalId((data20 == null || (medalId2 = data20.getMedalId()) == null) ? 0 : o0OoOo0.OooO0o(0, medalId2));
                                        SystemMessage systemMessageOooO0OO21 = OooO0OO(jOooO00o16, mid21, model.getMessage());
                                        systemMessageOooO0OO21.setMedalNoticeInfo(medalNoticeInfo2);
                                        systemMessageOooO0OO21.setType(20);
                                        OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO21);
                                        strOooO0OO = o0000.OooO0OO(oO00OOo0.system_title_newbadge);
                                        break;
                                    case 52:
                                        String mid22 = msg.getMid();
                                        Intrinsics.checkNotNullExpressionValue(mid22, "msg.mid");
                                        long time5 = msg.getTime();
                                        p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " savaCustomThemeMsg = " + model);
                                        SystemMessageData data21 = model.getData();
                                        if (data21 == null) {
                                            strOooO0OO = o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_title);
                                        } else {
                                            int iOooO0o2 = o0OoOo0.OooO0o(0, data21.getType());
                                            if (iOooO0o2 == 1) {
                                                SystemMessage.CustomTheme customTheme = new SystemMessage.CustomTheme();
                                                SystemMessage systemMessageOooO0OO22 = OooO0OO(time5, mid22, model.getMessage());
                                                systemMessageOooO0OO22.setCustomTheme(customTheme);
                                                systemMessageOooO0OO22.setType(22);
                                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO22);
                                                strOooO0OO = o0000.OooO0OO(oO00OOo0.message_custom_theme_successful_title);
                                            } else if (iOooO0o2 == 2) {
                                                SystemMessage.CustomTheme customTheme2 = new SystemMessage.CustomTheme();
                                                customTheme2.setCause(data21.getCause());
                                                SystemMessage systemMessageOooO0OO23 = OooO0OO(time5, mid22, model.getMessage());
                                                systemMessageOooO0OO23.setCustomTheme(customTheme2);
                                                systemMessageOooO0OO23.setType(23);
                                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO23);
                                                strOooO0OO = o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_title);
                                            } else if (iOooO0o2 == 4) {
                                                SystemMessage.CustomTheme customTheme3 = new SystemMessage.CustomTheme();
                                                SystemMessage systemMessageOooO0OO24 = OooO0OO(time5, mid22, model.getMessage());
                                                systemMessageOooO0OO24.setCustomTheme(customTheme3);
                                                systemMessageOooO0OO24.setType(24);
                                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO24);
                                                strOooO0OO = o0000.OooO0OO(oO00OOo0.message_custom_theme_delete_title);
                                            } else {
                                                strOooO0OO = o0000.OooO0OO(oO00OOo0.message_custom_theme_failed_title);
                                            }
                                        }
                                        break;
                                    default:
                                        switch (type5) {
                                            case 72:
                                                String mid23 = msg.getMid();
                                                Intrinsics.checkNotNullExpressionValue(mid23, "msg.mid");
                                                strOooO0OO = OooO0o(mid23, msg.getTime(), model);
                                                break;
                                            case 73:
                                                String mid24 = msg.getMid();
                                                Intrinsics.checkNotNullExpressionValue(mid24, "msg.mid");
                                                strOooO0OO = OooO0o(mid24, msg.getTime(), model);
                                                break;
                                            case 74:
                                                String mid25 = msg.getMid();
                                                Intrinsics.checkNotNullExpressionValue(mid25, "msg.mid");
                                                strOooO0OO = OooO0o(mid25, msg.getTime(), model);
                                                break;
                                            case 75:
                                                String mid26 = msg.getMid();
                                                Intrinsics.checkNotNullExpressionValue(mid26, "msg.mid");
                                                strOooO0OO = OooO0o(mid26, msg.getTime(), model);
                                                break;
                                            case 76:
                                                String mid27 = msg.getMid();
                                                Intrinsics.checkNotNullExpressionValue(mid27, "msg.mid");
                                                strOooO0OO = OooO0o(mid27, msg.getTime(), model);
                                                break;
                                            case 77:
                                                String mid28 = msg.getMid();
                                                Intrinsics.checkNotNullExpressionValue(mid28, "msg.mid");
                                                strOooO0OO = OooO0o(mid28, msg.getTime(), model);
                                                break;
                                            case 78:
                                                String mid29 = msg.getMid();
                                                long jOooO00o17 = Oooo0.OooO00o(mid29, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                p592o0oo00O.OooOOO0.OooO0OO("saveFirstDepositReward", "saveFirstDepositReward = " + model);
                                                int i4 = oO00OOo0.system_mssage_title_first_recharge_rewards;
                                                strOooO0OO2 = o0000.OooO0OO(i4);
                                                SystemMessageData data22 = model.getData();
                                                if (data22 != null) {
                                                    SystemMessage systemMessageOooO0OO25 = OooO0OO(jOooO00o17, mid29, model.getMessage());
                                                    if (data22.getMessageType() == 0) {
                                                        systemMessageOooO0OO25.setType(33);
                                                        strOooO0OO3 = o0000.OooO0OO(i4);
                                                    } else {
                                                        systemMessageOooO0OO25.setType(35);
                                                        strOooO0OO3 = o0000.OooO0OO(oO00OOo0.system_mssage_title_first_month_recharge_rewards);
                                                    }
                                                    strOooO0OO2 = strOooO0OO3;
                                                    SystemMessage.FirstRewardInfo firstRewardInfo = new SystemMessage.FirstRewardInfo();
                                                    firstRewardInfo.setRewardCoin(data22.getRewardCoin());
                                                    firstRewardInfo.setMessageType(data22.getMessageType());
                                                    systemMessageOooO0OO25.setFirstRewardInfo(firstRewardInfo);
                                                    o000OOo.OooO00o().Oooo000().OooO0O0(systemMessageOooO0OO25);
                                                }
                                                break;
                                            default:
                                                switch (type5) {
                                                    case 80:
                                                        String mid30 = msg.getMid();
                                                        long jOooO00o18 = Oooo0.OooO00o(mid30, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                        p592o0oo00O.OooOOO0.OooO0OO("saveRechargeReward", "saveRechargeReward = " + model);
                                                        SystemMessage systemMessageOooO0OO26 = OooO0OO(jOooO00o18, mid30, model.getMessage());
                                                        systemMessageOooO0OO26.setType(34);
                                                        OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO26);
                                                        strOooO0OO = o0000.OooO0OO(oO00OOo0.Recharge_Successful);
                                                        break;
                                                    case 81:
                                                        String mid31 = msg.getMid();
                                                        long jOooO00o19 = Oooo0.OooO00o(mid31, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                        p592o0oo00O.OooOOO0.OooO0OO("saveRoomMemberBadgeFrozenMessage", "model = " + model);
                                                        SystemMessage systemMessageOooO0OO27 = OooO0OO(jOooO00o19, mid31, model.getMessage());
                                                        systemMessageOooO0OO27.setType(36);
                                                        SystemMessage.MemberBadgeFrozenInfo memberBadgeFrozenInfo = new SystemMessage.MemberBadgeFrozenInfo();
                                                        SystemMessageData data23 = model.getData();
                                                        if (data23 != null) {
                                                            memberBadgeFrozenInfo.setRoomId(Long.valueOf(data23.getRoomId()));
                                                            memberBadgeFrozenInfo.setRoomName(data23.getRoomName());
                                                            systemMessageOooO0OO27.setMemberBadgeFrozenInfo(memberBadgeFrozenInfo);
                                                            o000OOo.OooO00o().Oooo000().OooO0O0(systemMessageOooO0OO27);
                                                        }
                                                        strOooO0OO = o0000.OooO0OO(oO00OOo0.member_badge_frozen_tip_title);
                                                        break;
                                                    case 82:
                                                        String mid32 = msg.getMid();
                                                        long jOooO00o20 = Oooo0.OooO00o(mid32, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                        p592o0oo00O.OooOOO0.OooO0OO("saveRoomMemberBadgeFrozenMessage", "model = " + model);
                                                        SystemMessage systemMessageOooO0OO28 = OooO0OO(jOooO00o20, mid32, model.getMessage());
                                                        systemMessageOooO0OO28.setType(37);
                                                        SystemMessage.MemberBadgeTopRankReward memberBadgeTopRankReward = new SystemMessage.MemberBadgeTopRankReward();
                                                        SystemMessageData data24 = model.getData();
                                                        if (data24 != null) {
                                                            memberBadgeTopRankReward.setShopId(Integer.valueOf(data24.getShopid()));
                                                            memberBadgeTopRankReward.setShopUrl(data24.getShopurl());
                                                            systemMessageOooO0OO28.setMemberBadgeTopRankReward(memberBadgeTopRankReward);
                                                            o000OOo.OooO00o().Oooo000().OooO0O0(systemMessageOooO0OO28);
                                                        }
                                                        strOooO0OO = o0000.OooO0OO(oO00OOo0.member_badge_reward_title);
                                                        break;
                                                    case 83:
                                                        String mid33 = msg.getMid();
                                                        long jOooO00o21 = Oooo0.OooO00o(mid33, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                        p592o0oo00O.OooOOO0.OooO0OO("saveGiftBackpackExpiredMessage", "model = " + model);
                                                        SystemMessage systemMessageOooO0OO29 = OooO0OO(jOooO00o21, mid33, model.getMessage());
                                                        systemMessageOooO0OO29.setType(38);
                                                        SystemMessage.GiftBackpackExpired giftBackpackExpired = new SystemMessage.GiftBackpackExpired();
                                                        SystemMessageData data25 = model.getData();
                                                        if (data25 != null) {
                                                            giftBackpackExpired.setSex(Integer.valueOf(o0OoOo0.OooO0o(0, data25.getSex())));
                                                            giftBackpackExpired.setIspraise(Integer.valueOf(o0OoOo0.OooO0o(0, data25.getIsPraise())));
                                                            giftBackpackExpired.setLevel(Integer.valueOf(o0OoOo0.OooO0o(0, data25.getLevel())));
                                                            giftBackpackExpired.setDyid(Long.valueOf(o0OoOo0.OooO(0L, data25.getDyid())));
                                                            giftBackpackExpired.setCoin(Long.valueOf(o0OoOo0.OooO(0L, data25.getCoin())));
                                                            giftBackpackExpired.setUpcrystal(Long.valueOf(o0OoOo0.OooO(0L, data25.getUpCrystal())));
                                                            giftBackpackExpired.setLanguage(Integer.valueOf(o0OoOo0.OooO0o(0, data25.getLanguage())));
                                                            giftBackpackExpired.setHeadurl(data25.getHeadurl());
                                                            giftBackpackExpired.setNickname(data25.getNickname());
                                                            giftBackpackExpired.setDyurl(data25.getDyurl());
                                                            systemMessageOooO0OO29.setGiftBackpackExpired(giftBackpackExpired);
                                                            o000OOo.OooO00o().Oooo000().OooO0O0(systemMessageOooO0OO29);
                                                        }
                                                        strOooO0OO = o0000.OooO0OO(oO00OOo0.backpack_expired_system_title);
                                                        break;
                                                    case 84:
                                                        String mid34 = msg.getMid();
                                                        long jOooO00o22 = Oooo0.OooO00o(mid34, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                        p592o0oo00O.OooOOO0.OooO0OO("saveGiftBlindTaskRewardMessage", "model = " + model);
                                                        SystemMessage systemMessageOooO0OO30 = OooO0OO(jOooO00o22, mid34, model.getMessage());
                                                        systemMessageOooO0OO30.setType(39);
                                                        SystemMessage.GiftBlindTaskReward giftBlindTaskReward = new SystemMessage.GiftBlindTaskReward();
                                                        SystemMessageData data26 = model.getData();
                                                        if (data26 != null) {
                                                            giftBlindTaskReward.setAwardtype(Integer.valueOf(data26.getAwardtype()));
                                                            giftBlindTaskReward.setAwardcount(Integer.valueOf(o0OoOo0.OooO0o(0, data26.getAwardCount())));
                                                            giftBlindTaskReward.setAwardId(Long.valueOf(o0OoOo0.OooO(0L, data26.getAwardId())));
                                                            giftBlindTaskReward.setAwardimage(data26.getAwardImage());
                                                            systemMessageOooO0OO30.setGiftBlindTaskReward(giftBlindTaskReward);
                                                            Integer awardtype = giftBlindTaskReward.getAwardtype();
                                                            SystemMessage.AwardType awardType = SystemMessage.AwardType.INSTANCE;
                                                            int chatBox = awardType.getChatBox();
                                                            if (awardtype == null || awardtype.intValue() != chatBox) {
                                                                int headdressCard = awardType.getHeaddressCard();
                                                                if (awardtype == null || awardtype.intValue() != headdressCard) {
                                                                    int backpackGift = awardType.getBackpackGift();
                                                                    if (awardtype == null || awardtype.intValue() != backpackGift) {
                                                                        int headPortraitBox = awardType.getHeadPortraitBox();
                                                                        if (awardtype != null && awardtype.intValue() == headPortraitBox) {
                                                                            strOooO0OO4 = o0000.OooO0OO(oO00OOo0.Got_a_Profile_Frame);
                                                                        } else if (o0000O0O.OooO0o(strOooO00o2)) {
                                                                            OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO30);
                                                                        }
                                                                    } else {
                                                                        o00Oo0.OooOO0O().OooOOOo(GiftPropTypeUser.Backpack.getValue(), true);
                                                                        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
                                                                        com.code.android.util.OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new o00O00o0(0L, null));
                                                                        strOooO0OO4 = o0000.OooO0OO(oO00OOo0.Got_a_Gift);
                                                                    }
                                                                } else {
                                                                    strOooO0OO4 = o0000.OooO0OO(oO00OOo0.Got_a_Hat);
                                                                }
                                                            } else {
                                                                strOooO0OO4 = o0000.OooO0OO(oO00OOo0.Got_a_Chat_Box);
                                                            }
                                                            strOooO00o2 = strOooO0OO4;
                                                            if (o0000O0O.OooO0o(strOooO00o2)) {
                                                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO30);
                                                            }
                                                        }
                                                        break;
                                                    case 85:
                                                        String mid35 = msg.getMid();
                                                        long jOooO00o23 = Oooo0.OooO00o(mid35, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                        p592o0oo00O.OooOOO0.OooO0OO("saveGiftBlindRankingRewardMessage", "model = " + model);
                                                        SystemMessage systemMessageOooO0OO31 = OooO0OO(jOooO00o23, mid35, model.getMessage());
                                                        systemMessageOooO0OO31.setType(40);
                                                        SystemMessage.GiftBlindRankingReward giftBlindRankingReward = new SystemMessage.GiftBlindRankingReward();
                                                        SystemMessageData data27 = model.getData();
                                                        if (data27 != null) {
                                                            giftBlindRankingReward.setToprank(Integer.valueOf(o0OoOo0.OooO0o(0, data27.getToprank())));
                                                            giftBlindRankingReward.setToptype(Integer.valueOf(o0OoOo0.OooO0o(0, data27.getToptype())));
                                                            giftBlindRankingReward.setAwardtype(Integer.valueOf(data27.getAwardtype()));
                                                            giftBlindRankingReward.setAwardcount(Integer.valueOf(o0OoOo0.OooO0o(0, data27.getAwardCount())));
                                                            giftBlindRankingReward.setAwardId(Long.valueOf(o0OoOo0.OooO(0L, data27.getAwardId())));
                                                            giftBlindRankingReward.setAwardimage(data27.getAwardImage());
                                                            systemMessageOooO0OO31.setGiftBlindRankingReward(giftBlindRankingReward);
                                                            Integer toptype = giftBlindRankingReward.getToptype();
                                                            SystemMessage.TopType topType = SystemMessage.TopType.INSTANCE;
                                                            int giftRankingSend = topType.getGiftRankingSend();
                                                            if (toptype == null || toptype.intValue() != giftRankingSend) {
                                                                int giftRankingReception = topType.getGiftRankingReception();
                                                                if (toptype == null || toptype.intValue() != giftRankingReception) {
                                                                    if (data27.getAwardtype() == SystemMessage.AwardType.INSTANCE.getBackpackGift()) {
                                                                        o00Oo0.OooOO0O().OooOOOo(GiftPropTypeUser.Backpack.getValue(), true);
                                                                        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = oOO00O.f44351OooO00o;
                                                                        com.code.android.util.OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new o00O00o0(0L, null));
                                                                    }
                                                                    if (o0000O0O.OooO0o(strOooO00o2)) {
                                                                        OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO31);
                                                                    }
                                                                } else {
                                                                    strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Received_Ranking_XXX_Rewards), String.valueOf(giftBlindRankingReward.getToprank()));
                                                                }
                                                            } else {
                                                                strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Sent_Ranking_XXX_Rewards), String.valueOf(giftBlindRankingReward.getToprank()));
                                                            }
                                                            strOooO00o2 = strOooO00o;
                                                            if (data27.getAwardtype() == SystemMessage.AwardType.INSTANCE.getBackpackGift()) {
                                                                o00Oo0.OooOO0O().OooOOOo(GiftPropTypeUser.Backpack.getValue(), true);
                                                                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData3 = oOO00O.f44351OooO00o;
                                                                com.code.android.util.OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new o00O00o0(0L, null));
                                                            }
                                                            if (o0000O0O.OooO0o(strOooO00o2)) {
                                                                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO31);
                                                            }
                                                        }
                                                        break;
                                                    case 86:
                                                        String mid36 = msg.getMid();
                                                        long jOooO00o24 = Oooo0.OooO00o(mid36, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                        p592o0oo00O.OooOOO0.OooO0OO("saveVip6DistributeSupremeGiftsMessage", "model = " + model);
                                                        SystemMessage systemMessageOooO0OO32 = OooO0OO(jOooO00o24, mid36, model.getMessage());
                                                        systemMessageOooO0OO32.setType(41);
                                                        SystemMessageData data28 = model.getData();
                                                        if (data28 != null) {
                                                            data28.setAwardtype(SystemMessage.AwardType.INSTANCE.getBackpackGift());
                                                            SystemMessage.Vip6DistributeSupremeGift vip6DistributeSupremeGift = new SystemMessage.Vip6DistributeSupremeGift();
                                                            vip6DistributeSupremeGift.setPropCount(Integer.valueOf(o0OoOo0.OooO0o(0, data28.getPropCount())));
                                                            vip6DistributeSupremeGift.setPropId(Long.valueOf(o0OoOo0.OooO(0L, data28.getPropId())));
                                                            vip6DistributeSupremeGift.setPropImage(data28.getPropImage());
                                                            systemMessageOooO0OO32.setVip6DistributeSupremeGift(vip6DistributeSupremeGift);
                                                            strOooO00o2 = o0000.OooO0OO(oO00OOo0.vip6_message_notify_title);
                                                            o00Oo0.OooOO0O().OooOOOo(GiftPropTypeUser.Backpack.getValue(), true);
                                                            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData4 = oOO00O.f44351OooO00o;
                                                            com.code.android.util.OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new o00O00o0(0L, null));
                                                            o000OOo.OooO00o().Oooo000().OooO0O0(systemMessageOooO0OO32);
                                                        }
                                                        break;
                                                    case 87:
                                                        Intrinsics.checkNotNullExpressionValue(msg.getMid(), "msg.mid");
                                                        msg.getTime();
                                                        Intrinsics.checkNotNullExpressionValue(model, "model");
                                                        p592o0oo00O.OooOOO0.OooO0OO("giftBackpackUpdateMessage", "model = " + model);
                                                        if (model.getData() != null) {
                                                            o00Oo0.OooOO0O().OooOOOo(GiftPropTypeUser.Backpack.getValue(), true);
                                                            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData5 = oOO00O.f44351OooO00o;
                                                            com.code.android.util.OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new o00O00o0(0L, null));
                                                        }
                                                        break;
                                                    case 88:
                                                        String mid37 = msg.getMid();
                                                        long jOooO00o25 = Oooo0.OooO00o(mid37, "msg.mid", msg, model, DeviceRequestsHelper.DEVICE_INFO_MODEL);
                                                        p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveWealthLevelUpMsg = " + model);
                                                        SystemMessage.WealthLevelUpInfo wealthLevelUpInfo = new SystemMessage.WealthLevelUpInfo();
                                                        SystemMessageData data29 = model.getData();
                                                        wealthLevelUpInfo.setWealthLv(data29 != null ? Integer.valueOf(data29.getWealthLevel()) : 0);
                                                        SystemMessageData data30 = model.getData();
                                                        wealthLevelUpInfo.setBadgeLevel(data30 != null ? Integer.valueOf(data30.getBadgeLevel()) : 0);
                                                        SystemMessageData data31 = model.getData();
                                                        if (data31 != null && (badgeImage = data31.getBadgeImage()) != null) {
                                                            strOooO00o2 = badgeImage;
                                                        }
                                                        wealthLevelUpInfo.setBadgeImage(strOooO00o2);
                                                        SystemMessage systemMessageOooO0OO33 = OooO0OO(jOooO00o25, mid37, model.getMessage());
                                                        systemMessageOooO0OO33.setWealthLevelUpInfo(wealthLevelUpInfo);
                                                        systemMessageOooO0OO33.setType(88);
                                                        OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO33);
                                                        strOooO0OO = o0000.OooO0OO(oO00OOo0.message_wealth_notify_title);
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (OooO0Oo()) {
                            int i5 = oO00OOo0.notify_new_message;
                            OooO0oO(str, o0000.OooO0OO(i5), strOooO0OO2, o0000.OooO0OO(i5));
                        }
                    }
                    str = "Yalla_Notice_Syatem";
                    String mid38 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid38, "msg.mid");
                    long time6 = msg.getTime();
                    p592o0oo00O.OooOOO0.OooO0OO("saveGiveThemeMsg", " saveGiveThemeMsg = " + model);
                    SystemMessageData data32 = model.getData();
                    if (data32 != null) {
                        SystemMessage.GiveThemeInfo giveThemeInfo = new SystemMessage.GiveThemeInfo();
                        giveThemeInfo.setUserId(data32.getUserId());
                        giveThemeInfo.setDayNum(data32.getDayNum());
                        SystemMessage systemMessageOooO0OO34 = OooO0OO(time6, mid38, model.getMessage());
                        systemMessageOooO0OO34.setGiveThemeInfo(giveThemeInfo);
                        systemMessageOooO0OO34.setType(26);
                        OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO34);
                    }
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.message_give_theme_reimburse_title);
                }
                strOooO0OO2 = strOooO00o2;
                if (OooO0Oo()) {
                    int i6 = oO00OOo0.notify_new_message;
                    OooO0oO(str, o0000.OooO0OO(i6), strOooO0OO2, o0000.OooO0OO(i6));
                }
            }
            str = "Yalla_Notice_Syatem";
            String mid39 = msg.getMid();
            Intrinsics.checkNotNullExpressionValue(mid39, "msg.mid");
            long time7 = msg.getTime();
            p592o0oo00O.OooOOO0.OooO0OO("SystemMsgProcessor", " saveTreasureBoxWinMsg = " + model);
            SystemMessageData data33 = model.getData();
            if (data33 != null) {
                SystemMessage.TreasureBox treasureBox = new SystemMessage.TreasureBox();
                treasureBox.setAwardType(data33.getAwardtype());
                treasureBox.setImageurl(data33.getImageurl());
                SystemMessage systemMessageOooO0OO35 = OooO0OO(time7, mid39, model.getMessage());
                systemMessageOooO0OO35.setTreasureBox(treasureBox);
                systemMessageOooO0OO35.setType(21);
                OooO0OO.OooO00o.OooO0O0(systemMessageOooO0OO35);
            }
            strOooO0OO = o0000.OooO0OO(oO00OOo0.system_message_treasure_win);
        }
        strOooO0OO2 = strOooO0OO;
        if (OooO0Oo()) {
            int i7 = oO00OOo0.notify_new_message;
            OooO0oO(str, o0000.OooO0OO(i7), strOooO0OO2, o0000.OooO0OO(i7));
        }
    }
}
