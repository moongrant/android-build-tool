package p481o0o0000o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.OooOo00;
import com.code.android.util.o0OoOo0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.MomentMessage;
import com.yalla.yalla.model.MomentMessageCommentModel;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.jvm.internal.Intrinsics;
import messages.Message;
import org.jetbrains.annotations.NotNull;
import p410o0Oo0Oo0.o00O0O;
import p414o0Oo0o0O.oo0O;
import p474o0OoooOO.oo0oO0;
import p587o0oOooO.oO00Oo0;
import p587o0oOooO.oOo00o0o;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000O0O0 extends o000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f48393OooO00o = "MomentMsgProcessor";

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {
        /* JADX WARN: Multi-variable type inference failed */
        public static MomentMessage OooO00o(int i, String mid, long j, String messageContent, int i2) {
            long jLongValue;
            if ((i2 & 32) != 0) {
                messageContent = "";
            }
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(messageContent, "messageContent");
            MomentMessage momentMessage = new MomentMessage();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            if (l == null) {
                jLongValue = 0;
            } else {
                Intrinsics.checkNotNull(l);
                jLongValue = l.longValue();
            }
            momentMessage.setUid(jLongValue);
            momentMessage.setType(i);
            momentMessage.setMid(mid);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j <= 0) {
                j = jCurrentTimeMillis;
            }
            if (j < 10000000000L) {
                j *= (long) 1000;
            }
            momentMessage.setTime(j);
            momentMessage.setRead(false);
            momentMessage.setMessage(messageContent);
            return momentMessage;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(@NotNull MessageIM.Message message, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = this.f48393OooO00o;
        OooOOOO.OooO00o(102, str, "\n动态消息\nMomentMsgProcessor parseMessage message = " + message, null);
        long fromId = message.getFromId();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        Long l = (Long) oo0oO0.OooOOo0().getValue();
        if ((l != null && fromId == l.longValue()) || OooOo00.OooO00o(message.getMid())) {
            return;
        }
        String mid = message.getMid();
        Intrinsics.checkNotNullExpressionValue(mid, "getMid(...)");
        Intrinsics.checkNotNullParameter(mid, "mid");
        if (OooOo00.OooO0O0(o00O0O.OooO00o().OooOo().OooO0oO(mid))) {
            return;
        }
        if (oo0oO0.OooOOo0().getValue() == 0) {
            return;
        }
        int head = message.getHead();
        if (head == 1000) {
            OooOOOO.OooO0OO(str, "\n朋友圈评论点赞通知 \nsaveMessage1000 message " + message);
            try {
                MessageIM.Message1000 from = MessageIM.Message1000.parseFrom(message.getBody());
                Intrinsics.checkNotNullExpressionValue(from, "parseFrom(...)");
                if (OooOo00.OooO00o(from)) {
                    return;
                }
                String mid2 = message.getMid();
                Intrinsics.checkNotNullExpressionValue(mid2, "getMid(...)");
                MomentMessage momentMessageOooO00o = OooO00o.OooO00o(2, mid2, message.getTime(), null, 56);
                MomentMessage.CommentPraise commentPraise = new MomentMessage.CommentPraise();
                commentPraise.setUserId(from.getPraiseUserId());
                String praiseNickname = from.getPraiseNickname();
                Intrinsics.checkNotNullExpressionValue(praiseNickname, "getPraiseNickname(...)");
                commentPraise.setUserNickName(praiseNickname);
                String praiseHeadUrl = from.getPraiseHeadUrl();
                Intrinsics.checkNotNullExpressionValue(praiseHeadUrl, "getPraiseHeadUrl(...)");
                commentPraise.setUserHeadUrl(praiseHeadUrl);
                commentPraise.setMomentId(from.getDyId());
                String dyImage = from.getDyImage();
                Intrinsics.checkNotNullExpressionValue(dyImage, "getDyImage(...)");
                commentPraise.setMomentImageUrl(dyImage);
                String ccontent = from.getCcontent();
                Intrinsics.checkNotNullExpressionValue(ccontent, "getCcontent(...)");
                commentPraise.setMomentContent(ccontent);
                momentMessageOooO00o.setCommentPraise(commentPraise);
                OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o);
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (head == 1001) {
            OooOOOO.OooO0OO(str, "\n动态送礼 \nsaveMessage1001 message " + message);
            try {
                MessageIM.Message1001 from2 = MessageIM.Message1001.parseFrom(message.getBody());
                if (OooOo00.OooO00o(from2)) {
                    return;
                }
                String mid3 = message.getMid();
                Intrinsics.checkNotNullExpressionValue(mid3, "getMid(...)");
                MomentMessage momentMessageOooO00o2 = OooO00o.OooO00o(7, mid3, message.getTime(), null, 56);
                MomentMessage.MomentGift momentGift = new MomentMessage.MomentGift();
                momentGift.setUserId(from2.getSendPropUserId());
                String sendNickname = from2.getSendNickname();
                Intrinsics.checkNotNullExpressionValue(sendNickname, "getSendNickname(...)");
                momentGift.setUserNickName(sendNickname);
                String sendHeadUrl = from2.getSendHeadUrl();
                Intrinsics.checkNotNullExpressionValue(sendHeadUrl, "getSendHeadUrl(...)");
                momentGift.setUserHeadUrl(sendHeadUrl);
                momentGift.setMomentId(from2.getDyId());
                String dyImage2 = from2.getDyImage();
                Intrinsics.checkNotNullExpressionValue(dyImage2, "getDyImage(...)");
                momentGift.setMomentImageUrl(dyImage2);
                String propImage = from2.getPropImage();
                Intrinsics.checkNotNullExpressionValue(propImage, "getPropImage(...)");
                momentGift.setGiftImage(propImage);
                momentGift.setGiftNum(from2.getPropNum());
                momentMessageOooO00o2.setMomentGift(momentGift);
                OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o2 + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o2);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (head == 1501) {
            OooOOOO.OooO0OO(str, "\n动态被删除 \nsaveMessage1501 message " + message);
            try {
                MessageIM.Message1501 from3 = MessageIM.Message1501.parseFrom(message.getBody());
                if (OooOo00.OooO00o(from3)) {
                    return;
                }
                String mid4 = message.getMid();
                Intrinsics.checkNotNullExpressionValue(mid4, "getMid(...)");
                MomentMessage momentMessageOooO00o3 = OooO00o.OooO00o(15, mid4, message.getTime(), null, 56);
                MomentMessage.MomentSystemRemove momentSystemRemove = new MomentMessage.MomentSystemRemove();
                momentSystemRemove.setMomentId(from3.getCommentId());
                String commentImg = from3.getCommentImg();
                Intrinsics.checkNotNullExpressionValue(commentImg, "getCommentImg(...)");
                momentSystemRemove.setMomentImageUrl(commentImg);
                momentSystemRemove.setDeleteType(Integer.valueOf(from3.getDeleteType()));
                momentMessageOooO00o3.setMomentSystemRemove(momentSystemRemove);
                OooOOOO.OooO0oo(str, "\n动态被删除 \nsaveMessage1501 \nmessage : " + message + " \nmessageData : " + oOo00o0o.OooO00o(from3) + "\ndb : " + momentMessageOooO00o3);
                StringBuilder sb = new StringBuilder("MomentMessageRepo saveMessage msg:");
                sb.append(momentMessageOooO00o3);
                sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                OooOOOO.OooO0O0(sb.toString());
                o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o3);
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                return;
            }
        }
        if (head == 1503) {
            OooOOOO.OooO0OO(str, "\n评论加精通知 \nsaveMessage1503 message " + message);
            try {
                MessageIM.Message1503 from4 = MessageIM.Message1503.parseFrom(message.getBody());
                if (OooOo00.OooO00o(from4)) {
                    return;
                }
                String mid5 = message.getMid();
                Intrinsics.checkNotNullExpressionValue(mid5, "getMid(...)");
                MomentMessage momentMessageOooO00o4 = OooO00o.OooO00o(11, mid5, message.getTime(), null, 56);
                MomentMessage.CommentFeatured commentFeatured = new MomentMessage.CommentFeatured();
                commentFeatured.setMomentId(from4.getDiscoveryId());
                String commentImg2 = from4.getCommentImg();
                Intrinsics.checkNotNullExpressionValue(commentImg2, "getCommentImg(...)");
                commentFeatured.setMomentImageUrl(commentImg2);
                String content = from4.getContent();
                Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
                commentFeatured.setMomentContent(content);
                commentFeatured.setCommentId(from4.getCommentId());
                momentMessageOooO00o4.setCommentFeatured(commentFeatured);
                OooOOOO.OooO0oo(str, "\n评论加精通知 \nsaveMessage1503 \nmessage : " + message + " \nmessageData : " + oOo00o0o.OooO00o(from4) + "\ndb : " + momentMessageOooO00o4);
                StringBuilder sb2 = new StringBuilder("MomentMessageRepo saveMessage msg:");
                sb2.append(momentMessageOooO00o4);
                sb2.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                OooOOOO.OooO0O0(sb2.toString());
                o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o4);
                return;
            } catch (Exception e4) {
                e4.printStackTrace();
                return;
            }
        }
        if (head == 2114) {
            OooO0OO(message);
            return;
        }
        if (head == 2117) {
            OooOOOO.OooO0OO(str, "\n动态加精通知 \nsaveMessage2117 message " + message);
            try {
                MessageIM.Message2117 from5 = MessageIM.Message2117.parseFrom(message.getBody());
                if (OooOo00.OooO00o(from5)) {
                    return;
                }
                String mid6 = message.getMid();
                Intrinsics.checkNotNullExpressionValue(mid6, "getMid(...)");
                MomentMessage momentMessageOooO00o5 = OooO00o.OooO00o(10, mid6, message.getTime(), null, 56);
                MomentMessage.MomentFeatured momentFeatured = new MomentMessage.MomentFeatured();
                momentFeatured.setMomentId(from5.getCommentId64() > 0 ? from5.getCommentId64() : from5.getCommentId());
                String commentImg3 = from5.getCommentImg();
                Intrinsics.checkNotNullExpressionValue(commentImg3, "getCommentImg(...)");
                momentFeatured.setMomentImageUrl(commentImg3);
                momentMessageOooO00o5.setMomentFeatured(momentFeatured);
                OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o5 + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o5);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        if (head == 2125) {
            OooO0Oo(message);
            return;
        }
        if (head == 2126) {
            OooO0o0(message);
            return;
        }
        if (head == 2131) {
            OooO0o(message);
            return;
        }
        if (head == 2132) {
            OooO0oO(message);
            return;
        }
        switch (head) {
            case 1003:
                OooOOOO.OooO0OO(str, "\n圈子内置顶通知 \nsaveMessage1003 message " + message);
                try {
                    Message.MessageDyToppedAndRemove messageDyToppedAndRemove = (Message.MessageDyToppedAndRemove) Message.MessageDyToppedAndRemove.f33081OooOO0O.parseFrom(message.getBody());
                    if (!OooOo00.OooO00o(messageDyToppedAndRemove)) {
                        String mid7 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid7, "getMid(...)");
                        MomentMessage momentMessageOooO00o6 = OooO00o.OooO00o(12, mid7, message.getTime(), null, 56);
                        MomentMessage.MomentTopicTop momentTopicTop = new MomentMessage.MomentTopicTop();
                        momentTopicTop.setUserId(messageDyToppedAndRemove.f33087OooO0oo);
                        String strOooO0OO = messageDyToppedAndRemove.OooO0OO();
                        Intrinsics.checkNotNullExpressionValue(strOooO0OO, "getHostImg(...)");
                        momentTopicTop.setUserHeadUrl(strOooO0OO);
                        String strOooO0O0 = messageDyToppedAndRemove.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(strOooO0O0, "getDyImg(...)");
                        momentTopicTop.setMomentImageUrl(strOooO0O0);
                        momentTopicTop.setTopicId(messageDyToppedAndRemove.f33083OooO0Oo);
                        String circleName = messageDyToppedAndRemove.getCircleName();
                        Intrinsics.checkNotNullExpressionValue(circleName, "getCircleName(...)");
                        momentTopicTop.setTopicName(circleName);
                        momentMessageOooO00o6.setMomentTopicTop(momentTopicTop);
                        OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o6 + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                        o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o6);
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return;
                }
                break;
            case 1004:
                OooOOOO.OooO0OO(str, "\n圈子内置顶取消通知 \nsaveMessage1004 message " + message);
                try {
                    Message.MessageDyToppedAndRemove messageDyToppedAndRemove2 = (Message.MessageDyToppedAndRemove) Message.MessageDyToppedAndRemove.f33081OooOO0O.parseFrom(message.getBody());
                    if (!OooOo00.OooO00o(messageDyToppedAndRemove2)) {
                        String mid8 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid8, "getMid(...)");
                        MomentMessage momentMessageOooO00o7 = OooO00o.OooO00o(-12, mid8, message.getTime(), null, 56);
                        MomentMessage.MomentTopicTopRevoke momentTopicTopRevoke = new MomentMessage.MomentTopicTopRevoke();
                        momentTopicTopRevoke.setUserId(messageDyToppedAndRemove2.f33087OooO0oo);
                        String strOooO0OO2 = messageDyToppedAndRemove2.OooO0OO();
                        Intrinsics.checkNotNullExpressionValue(strOooO0OO2, "getHostImg(...)");
                        momentTopicTopRevoke.setUserHeadUrl(strOooO0OO2);
                        String strOooO0O1 = messageDyToppedAndRemove2.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(strOooO0O1, "getDyImg(...)");
                        momentTopicTopRevoke.setMomentImageUrl(strOooO0O1);
                        momentTopicTopRevoke.setTopicId(messageDyToppedAndRemove2.f33083OooO0Oo);
                        String circleName2 = messageDyToppedAndRemove2.getCircleName();
                        Intrinsics.checkNotNullExpressionValue(circleName2, "getCircleName(...)");
                        momentTopicTopRevoke.setTopicName(circleName2);
                        momentMessageOooO00o7.setMomentTopicTopRevoke(momentTopicTopRevoke);
                        OooOOOO.OooO0oo(str, "\n圈子内置顶取消通知 \nsaveMessage1004 \nmessage : " + message + " \nmessageData : " + oOo00o0o.OooO00o(messageDyToppedAndRemove2) + "\ndb : " + momentMessageOooO00o7);
                        StringBuilder sb3 = new StringBuilder("MomentMessageRepo saveMessage msg:");
                        sb3.append(momentMessageOooO00o7);
                        sb3.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                        OooOOOO.OooO0O0(sb3.toString());
                        o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o7);
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return;
                }
                break;
            case 1005:
                OooOOOO.OooO0OO(str, "\n圈子内移除通知-圈主移出 \nsaveMessage1005 message " + message);
                try {
                    Message.MessageDyToppedAndRemove messageDyToppedAndRemove3 = (Message.MessageDyToppedAndRemove) Message.MessageDyToppedAndRemove.f33081OooOO0O.parseFrom(message.getBody());
                    if (!OooOo00.OooO00o(messageDyToppedAndRemove3)) {
                        String mid9 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid9, "getMid(...)");
                        MomentMessage momentMessageOooO00o8 = OooO00o.OooO00o(13, mid9, message.getTime(), null, 56);
                        MomentMessage.MomentTopicRemoveOwner momentTopicRemoveOwner = new MomentMessage.MomentTopicRemoveOwner();
                        momentTopicRemoveOwner.setUserId(messageDyToppedAndRemove3.f33087OooO0oo);
                        String strOooO0OO3 = messageDyToppedAndRemove3.OooO0OO();
                        Intrinsics.checkNotNullExpressionValue(strOooO0OO3, "getHostImg(...)");
                        momentTopicRemoveOwner.setUserHeadUrl(strOooO0OO3);
                        String strOooO0O2 = messageDyToppedAndRemove3.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(strOooO0O2, "getDyImg(...)");
                        momentTopicRemoveOwner.setMomentImageUrl(strOooO0O2);
                        momentTopicRemoveOwner.setMomentId(messageDyToppedAndRemove3.f33083OooO0Oo);
                        String circleName3 = messageDyToppedAndRemove3.getCircleName();
                        Intrinsics.checkNotNullExpressionValue(circleName3, "getCircleName(...)");
                        momentTopicRemoveOwner.setTopicName(circleName3);
                        momentMessageOooO00o8.setMomentTopicRemoveOwner(momentTopicRemoveOwner);
                        OooOOOO.OooO0oo(str, "\n圈子内移除通知-圈主移出 \nsaveMessage1005 \nmessage : " + message + " \nmessageData : " + oOo00o0o.OooO00o(messageDyToppedAndRemove3) + "\ndb : " + momentMessageOooO00o8);
                        StringBuilder sb4 = new StringBuilder("MomentMessageRepo saveMessage msg:");
                        sb4.append(momentMessageOooO00o8);
                        sb4.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                        OooOOOO.OooO0O0(sb4.toString());
                        o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o8);
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
                break;
            case 1006:
                OooOOOO.OooO0OO(str, "\n圈子内移除通知-管理员移出 \nsaveMessage1006 message " + message);
                try {
                    Message.MessageDyToppedAndRemove messageDyToppedAndRemove4 = (Message.MessageDyToppedAndRemove) Message.MessageDyToppedAndRemove.f33081OooOO0O.parseFrom(message.getBody());
                    if (!OooOo00.OooO00o(messageDyToppedAndRemove4)) {
                        String mid10 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid10, "getMid(...)");
                        MomentMessage momentMessageOooO00o9 = OooO00o.OooO00o(14, mid10, message.getTime(), null, 56);
                        MomentMessage.MomentTopicRemoveAdmin momentTopicRemoveAdmin = new MomentMessage.MomentTopicRemoveAdmin();
                        momentTopicRemoveAdmin.setUserId(messageDyToppedAndRemove4.f33087OooO0oo);
                        String strOooO0OO4 = messageDyToppedAndRemove4.OooO0OO();
                        Intrinsics.checkNotNullExpressionValue(strOooO0OO4, "getHostImg(...)");
                        momentTopicRemoveAdmin.setUserHeadUrl(strOooO0OO4);
                        String strOooO0O3 = messageDyToppedAndRemove4.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(strOooO0O3, "getDyImg(...)");
                        momentTopicRemoveAdmin.setMomentImageUrl(strOooO0O3);
                        momentTopicRemoveAdmin.setMomentId(messageDyToppedAndRemove4.f33083OooO0Oo);
                        String circleName4 = messageDyToppedAndRemove4.getCircleName();
                        Intrinsics.checkNotNullExpressionValue(circleName4, "getCircleName(...)");
                        momentTopicRemoveAdmin.setTopicName(circleName4);
                        momentMessageOooO00o9.setMomentTopicRemoveAdmin(momentTopicRemoveAdmin);
                        OooOOOO.OooO0oo(str, "\n圈子内移除通知-管理员移出 \nsaveMessage1006 \nmessage : " + message + " \nmessageData : " + oOo00o0o.OooO00o(messageDyToppedAndRemove4) + "\ndb : " + momentMessageOooO00o9);
                        StringBuilder sb5 = new StringBuilder("MomentMessageRepo saveMessage msg:");
                        sb5.append(momentMessageOooO00o9);
                        sb5.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                        OooOOOO.OooO0O0(sb5.toString());
                        o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o9);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
                break;
        }
    }

    public final void OooO0OO(MessageIM.Message message) throws InvalidProtocolBufferException {
        MessageIM.Message2114 messageData = MessageIM.Message2114.parseFrom(message.getBody());
        if (OooOo00.OooO00o(messageData)) {
        }
        MomentMessageCommentModel momentMessageCommentModel = (MomentMessageCommentModel) oO00Oo0.OooO00o(messageData.getContent(), MomentMessageCommentModel.class);
        OooOOOO.OooO0oo(this.f48393OooO00o, "\n朋友圈操作消息 \nsaveMessage2114 \nmessage : " + message + " \nmomentMessageCommentModel : " + momentMessageCommentModel);
        switch (momentMessageCommentModel.getCode()) {
            case -4:
                if (momentMessageCommentModel.getMoment() != null) {
                    MomentMessageCommentModel.Moment moment = momentMessageCommentModel.getMoment();
                    if ((moment != null ? Long.valueOf(moment.getCid()) : null) != null) {
                        MomentMessageCommentModel.Moment moment2 = momentMessageCommentModel.getMoment();
                        Long lValueOf = moment2 != null ? Long.valueOf(moment2.getCid()) : null;
                        Intrinsics.checkNotNull(lValueOf);
                        if (lValueOf.longValue() > 0) {
                            Intrinsics.checkNotNull(messageData);
                            Intrinsics.checkNotNull(momentMessageCommentModel);
                            Intrinsics.checkNotNullParameter(message, "message");
                            Intrinsics.checkNotNullParameter(messageData, "messageData");
                            Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                            OooOOOO.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论/动态回复 被@ - 撤回 \nsaveMessage2114MomentCommentAtRevoke messageData " + messageData);
                            try {
                                if (!OooOo00.OooO00o(messageData)) {
                                    String mid = message.getMid();
                                    Intrinsics.checkNotNullExpressionValue(mid, "getMid(...)");
                                    MomentMessage momentMessageOooO00o = OooO00o.OooO00o(-6, mid, message.getTime(), momentMessageCommentModel.getMsg(), 24);
                                    MomentMessage.CommentAt commentAt = new MomentMessage.CommentAt();
                                    MomentMessageCommentModel.User from = momentMessageCommentModel.getFrom();
                                    if (from != null) {
                                        commentAt.setUserId(from.getId());
                                        commentAt.setUserNickName(from.getNickName());
                                        commentAt.setUserHeadUrl(from.getHeadUrl());
                                    }
                                    MomentMessageCommentModel.Moment moment3 = momentMessageCommentModel.getMoment();
                                    if (moment3 != null) {
                                        commentAt.setMomentId(moment3.getId());
                                        commentAt.setCommentId(moment3.getCid());
                                        commentAt.setMomentImageUrl(moment3.getImage());
                                        commentAt.setCommentContent(moment3.getContent());
                                    }
                                    String msg = momentMessageCommentModel.getMsg();
                                    if (msg != null) {
                                        commentAt.setCommentContent(msg);
                                    }
                                    momentMessageOooO00o.setCommentAt(commentAt);
                                    OooOOOO.OooO00o(104, "MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论/动态回复 被@ - 撤回 \nsaveMessage2114MomentCommentAtRevoke db = " + momentMessageOooO00o, null);
                                    oo0O.OooO00o(momentMessageOooO00o);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                    }
                }
                break;
            case -3:
                Intrinsics.checkNotNull(messageData);
                Intrinsics.checkNotNull(momentMessageCommentModel);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                OooOOOO.OooO00o(102, "MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态点赞 - 撤回 \nsaveMessage2114MomentLikeRevoke messageData " + messageData, null);
                try {
                    if (!OooOo00.OooO00o(messageData)) {
                        String mid2 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid2, "getMid(...)");
                        MomentMessage momentMessageOooO00o2 = OooO00o.OooO00o(-1, mid2, message.getTime(), momentMessageCommentModel.getMsg(), 24);
                        MomentMessage.MomentPraise momentPraise = new MomentMessage.MomentPraise();
                        MomentMessageCommentModel.User from2 = momentMessageCommentModel.getFrom();
                        if (from2 != null) {
                            momentPraise.setUserId(from2.getId());
                            momentPraise.setUserNickName(from2.getNickName());
                            momentPraise.setUserHeadUrl(from2.getHeadUrl());
                        }
                        MomentMessageCommentModel.Moment moment4 = momentMessageCommentModel.getMoment();
                        if (moment4 != null) {
                            momentPraise.setMomentId(moment4.getId());
                            momentPraise.setMomentImageUrl(moment4.getImage());
                            momentPraise.setMomentContent(moment4.getContent());
                        }
                        momentMessageOooO00o2.setMomentPraise(momentPraise);
                        oo0O.OooO00o(momentMessageOooO00o2);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
            case -2:
                Intrinsics.checkNotNull(messageData);
                Intrinsics.checkNotNull(momentMessageCommentModel);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                OooOOOO.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态回复 - 撤回 \nsaveMessage2114MomentReplyRevoke messageData " + messageData);
                try {
                    if (!OooOo00.OooO00o(messageData)) {
                        String mid3 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid3, "getMid(...)");
                        MomentMessage momentMessageOooO00o3 = OooO00o.OooO00o(-4, mid3, message.getTime(), momentMessageCommentModel.getMsg(), 24);
                        MomentMessage.CommentReply commentReply = new MomentMessage.CommentReply();
                        MomentMessageCommentModel.User from3 = momentMessageCommentModel.getFrom();
                        if (from3 != null) {
                            commentReply.setUserId(from3.getId());
                            commentReply.setUserNickName(from3.getNickName());
                            commentReply.setUserHeadUrl(from3.getHeadUrl());
                        }
                        MomentMessageCommentModel.Moment moment5 = momentMessageCommentModel.getMoment();
                        if (moment5 != null) {
                            commentReply.setMomentId(moment5.getId());
                            commentReply.setCommentId(moment5.getCid());
                            commentReply.setMomentImageUrl(moment5.getImage());
                            commentReply.setCommentContent(moment5.getContent());
                        }
                        String msg2 = momentMessageCommentModel.getMsg();
                        if (msg2 != null) {
                            commentReply.setCommentContent(msg2);
                        }
                        momentMessageOooO00o3.setCommentReply(commentReply);
                        oo0O.OooO00o(momentMessageOooO00o3);
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
                break;
            case -1:
                Intrinsics.checkNotNull(messageData);
                Intrinsics.checkNotNull(momentMessageCommentModel);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                OooOOOO.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论 - 撤回 \nsaveMessage2114MomentCommentRevoke messageData " + messageData);
                try {
                    if (!OooOo00.OooO00o(messageData)) {
                        String mid4 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid4, "getMid(...)");
                        MomentMessage momentMessageOooO00o4 = OooO00o.OooO00o(-3, mid4, message.getTime(), momentMessageCommentModel.getMsg(), 24);
                        MomentMessage.MomentComment momentComment = new MomentMessage.MomentComment();
                        MomentMessageCommentModel.User from4 = momentMessageCommentModel.getFrom();
                        if (from4 != null) {
                            momentComment.setUserId(from4.getId());
                            momentComment.setUserNickName(from4.getNickName());
                            momentComment.setUserHeadUrl(from4.getHeadUrl());
                        }
                        MomentMessageCommentModel.Moment moment6 = momentMessageCommentModel.getMoment();
                        if (moment6 != null) {
                            momentComment.setMomentId(moment6.getId());
                            momentComment.setCommentId(moment6.getCid());
                            momentComment.setMomentImageUrl(moment6.getImage());
                            momentComment.setCommentContent(moment6.getContent());
                        }
                        String msg3 = momentMessageCommentModel.getMsg();
                        if (msg3 != null) {
                            momentComment.setCommentContent(msg3);
                        }
                        momentMessageOooO00o4.setMomentComment(momentComment);
                        oo0O.OooO00o(momentMessageOooO00o4);
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
                break;
            case 1:
                Intrinsics.checkNotNull(messageData);
                Intrinsics.checkNotNull(momentMessageCommentModel);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                OooOOOO.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论 \nsaveMessage2114MomentCommentAdd messageData " + messageData);
                try {
                    if (!OooOo00.OooO00o(messageData)) {
                        String mid5 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid5, "getMid(...)");
                        MomentMessage momentMessageOooO00o5 = OooO00o.OooO00o(3, mid5, message.getTime(), momentMessageCommentModel.getMsg(), 24);
                        MomentMessage.MomentComment momentComment2 = new MomentMessage.MomentComment();
                        MomentMessageCommentModel.User from5 = momentMessageCommentModel.getFrom();
                        if (from5 != null) {
                            momentComment2.setUserId(from5.getId());
                            momentComment2.setUserNickName(from5.getNickName());
                            momentComment2.setUserHeadUrl(from5.getHeadUrl());
                        }
                        MomentMessageCommentModel.Moment moment7 = momentMessageCommentModel.getMoment();
                        if (moment7 != null) {
                            momentComment2.setMomentId(moment7.getId());
                            momentComment2.setCommentId(moment7.getCid());
                            momentComment2.setMomentImageUrl(moment7.getImage());
                            momentComment2.setCommentContent(moment7.getContent());
                        }
                        String msg4 = momentMessageCommentModel.getMsg();
                        if (msg4 != null) {
                            momentComment2.setCommentContent(msg4);
                        }
                        momentMessageOooO00o5.setMomentComment(momentComment2);
                        OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o5 + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                        o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o5);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
                break;
            case 2:
                Intrinsics.checkNotNull(messageData);
                Intrinsics.checkNotNull(momentMessageCommentModel);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                OooOOOO.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态回复 \nsaveMessage2114MomentReplyAdd messageData " + messageData);
                try {
                    if (!OooOo00.OooO00o(messageData)) {
                        String mid6 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid6, "getMid(...)");
                        MomentMessage momentMessageOooO00o6 = OooO00o.OooO00o(4, mid6, message.getTime(), momentMessageCommentModel.getMsg(), 24);
                        MomentMessage.CommentReply commentReply2 = new MomentMessage.CommentReply();
                        MomentMessageCommentModel.User from6 = momentMessageCommentModel.getFrom();
                        if (from6 != null) {
                            commentReply2.setUserId(from6.getId());
                            commentReply2.setUserNickName(from6.getNickName());
                            commentReply2.setUserHeadUrl(from6.getHeadUrl());
                        }
                        MomentMessageCommentModel.Moment moment8 = momentMessageCommentModel.getMoment();
                        if (moment8 != null) {
                            commentReply2.setMomentId(moment8.getId());
                            commentReply2.setCommentId(moment8.getCid());
                            commentReply2.setMomentImageUrl(moment8.getImage());
                            commentReply2.setCommentContent(moment8.getContent());
                        }
                        String msg5 = momentMessageCommentModel.getMsg();
                        if (msg5 != null) {
                            commentReply2.setCommentContent(msg5);
                        }
                        momentMessageOooO00o6.setCommentReply(commentReply2);
                        OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o6 + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                        o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o6);
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return;
                }
                break;
            case 3:
                Intrinsics.checkNotNull(messageData);
                Intrinsics.checkNotNull(momentMessageCommentModel);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                OooOOOO.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态点赞 \nsaveMessage2114MomentLikeAdd messageData " + messageData);
                try {
                    if (!OooOo00.OooO00o(messageData)) {
                        String mid7 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid7, "getMid(...)");
                        MomentMessage momentMessageOooO00o7 = OooO00o.OooO00o(1, mid7, message.getTime(), momentMessageCommentModel.getMsg(), 24);
                        MomentMessage.MomentPraise momentPraise2 = new MomentMessage.MomentPraise();
                        MomentMessageCommentModel.User from7 = momentMessageCommentModel.getFrom();
                        if (from7 != null) {
                            momentPraise2.setUserId(from7.getId());
                            momentPraise2.setUserNickName(from7.getNickName());
                            momentPraise2.setUserHeadUrl(from7.getHeadUrl());
                        }
                        MomentMessageCommentModel.Moment moment9 = momentMessageCommentModel.getMoment();
                        if (moment9 != null) {
                            momentPraise2.setMomentId(moment9.getId());
                            momentPraise2.setMomentImageUrl(moment9.getImage());
                            momentPraise2.setMomentContent(moment9.getContent());
                        }
                        momentMessageOooO00o7.setMomentPraise(momentPraise2);
                        OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o7 + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                        o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o7);
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return;
                }
                break;
            case 4:
                if (momentMessageCommentModel.getMoment() != null) {
                    MomentMessageCommentModel.Moment moment10 = momentMessageCommentModel.getMoment();
                    if ((moment10 != null ? Long.valueOf(moment10.getCid()) : null) != null) {
                        MomentMessageCommentModel.Moment moment11 = momentMessageCommentModel.getMoment();
                        Long lValueOf2 = moment11 != null ? Long.valueOf(moment11.getCid()) : null;
                        Intrinsics.checkNotNull(lValueOf2);
                        if (lValueOf2.longValue() > 0) {
                            Intrinsics.checkNotNull(messageData);
                            Intrinsics.checkNotNull(momentMessageCommentModel);
                            Intrinsics.checkNotNullParameter(message, "message");
                            Intrinsics.checkNotNullParameter(messageData, "messageData");
                            Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                            OooOOOO.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论/动态回复 被@ \nsaveMessage2114MomentCommentAtAdd messageData " + messageData);
                            try {
                                if (!OooOo00.OooO00o(messageData)) {
                                    String mid8 = message.getMid();
                                    Intrinsics.checkNotNullExpressionValue(mid8, "getMid(...)");
                                    MomentMessage momentMessageOooO00o8 = OooO00o.OooO00o(6, mid8, message.getTime(), momentMessageCommentModel.getMsg(), 24);
                                    MomentMessage.CommentAt commentAt2 = new MomentMessage.CommentAt();
                                    MomentMessageCommentModel.User from8 = momentMessageCommentModel.getFrom();
                                    if (from8 != null) {
                                        commentAt2.setUserId(from8.getId());
                                        commentAt2.setUserNickName(from8.getNickName());
                                        commentAt2.setUserHeadUrl(from8.getHeadUrl());
                                    }
                                    MomentMessageCommentModel.Moment moment12 = momentMessageCommentModel.getMoment();
                                    if (moment12 != null) {
                                        commentAt2.setMomentId(moment12.getId());
                                        commentAt2.setCommentId(moment12.getCid());
                                        commentAt2.setMomentImageUrl(moment12.getImage());
                                        commentAt2.setCommentContent(moment12.getContent());
                                    }
                                    String msg6 = momentMessageCommentModel.getMsg();
                                    if (msg6 != null) {
                                        commentAt2.setCommentContent(msg6);
                                    }
                                    momentMessageOooO00o8.setCommentAt(commentAt2);
                                    OooOOOO.OooO00o(104, "MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论/动态回复 被@ \nsaveMessage2114MomentCommentAtAdd db = " + momentMessageOooO00o8, null);
                                    OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o8 + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                                    o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o8);
                                }
                            } catch (Exception e8) {
                                e8.printStackTrace();
                                return;
                            }
                        }
                    }
                }
                Intrinsics.checkNotNull(messageData);
                Intrinsics.checkNotNull(momentMessageCommentModel);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                OooOOOO.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态被@ \nsaveMessage2114MomentAtAdd messageData " + messageData);
                try {
                    if (!OooOo00.OooO00o(messageData)) {
                        String mid9 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid9, "getMid(...)");
                        MomentMessage momentMessageOooO00o9 = OooO00o.OooO00o(5, mid9, message.getTime(), momentMessageCommentModel.getMsg(), 24);
                        MomentMessage.MomentAt momentAt = new MomentMessage.MomentAt();
                        MomentMessageCommentModel.User from9 = momentMessageCommentModel.getFrom();
                        if (from9 != null) {
                            momentAt.setUserId(from9.getId());
                            momentAt.setUserNickName(from9.getNickName());
                            momentAt.setUserHeadUrl(from9.getHeadUrl());
                        }
                        MomentMessageCommentModel.Moment moment13 = momentMessageCommentModel.getMoment();
                        if (moment13 != null) {
                            momentAt.setMomentId(moment13.getId());
                            momentAt.setMomentImageUrl(moment13.getImage());
                            momentAt.setMomentContent(moment13.getContent());
                        }
                        String msg7 = momentMessageCommentModel.getMsg();
                        if (msg7 != null) {
                            momentAt.setMomentContent(msg7);
                        }
                        momentMessageOooO00o9.setMomentAt(momentAt);
                        OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o9 + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                        o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o9);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
                break;
        }
    }

    public final void OooO0Oo(MessageIM.Message message) {
        String str = this.f48393OooO00o;
        OooOOOO.OooO0OO(str, "\n动态的评论/回复打赏 \nsaveMessage2125 message " + message);
        try {
            MessageIM.Message2125 from = MessageIM.Message2125.parseFrom(message.getBody());
            if (OooOo00.OooO00o(from)) {
                return;
            }
            String mid = message.getMid();
            Intrinsics.checkNotNullExpressionValue(mid, "getMid(...)");
            MomentMessage momentMessageOooO00o = OooO00o.OooO00o(8, mid, message.getTime(), null, 56);
            if (from.getRewardType() == 1) {
                momentMessageOooO00o.setType(8);
                MomentMessage.CommentReward commentReward = new MomentMessage.CommentReward();
                commentReward.setUserId(from.getFromUid());
                String nickName = from.getNickName();
                Intrinsics.checkNotNullExpressionValue(nickName, "getNickName(...)");
                commentReward.setUserNickName(nickName);
                String headUrl = from.getHeadUrl();
                Intrinsics.checkNotNullExpressionValue(headUrl, "getHeadUrl(...)");
                commentReward.setUserHeadUrl(headUrl);
                commentReward.setMomentId(from.getMomentId());
                String momentSnapshot = from.getMomentSnapshot();
                Intrinsics.checkNotNullExpressionValue(momentSnapshot, "getMomentSnapshot(...)");
                commentReward.setMomentImageUrl(momentSnapshot);
                commentReward.setCommentId(from.getCommentId());
                String commentContent = from.getCommentContent();
                Intrinsics.checkNotNullExpressionValue(commentContent, "getCommentContent(...)");
                commentReward.setCommentContent(commentContent);
                momentMessageOooO00o.setCommentReward(commentReward);
                OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o);
            }
            if (from.getRewardType() == 2) {
                momentMessageOooO00o.setType(9);
                MomentMessage.ReplyReward replyReward = new MomentMessage.ReplyReward();
                replyReward.setUserId(from.getFromUid());
                String nickName2 = from.getNickName();
                Intrinsics.checkNotNullExpressionValue(nickName2, "getNickName(...)");
                replyReward.setUserNickName(nickName2);
                String headUrl2 = from.getHeadUrl();
                Intrinsics.checkNotNullExpressionValue(headUrl2, "getHeadUrl(...)");
                replyReward.setUserHeadUrl(headUrl2);
                replyReward.setMomentId(from.getMomentId());
                String momentSnapshot2 = from.getMomentSnapshot();
                Intrinsics.checkNotNullExpressionValue(momentSnapshot2, "getMomentSnapshot(...)");
                replyReward.setMomentImageUrl(momentSnapshot2);
                replyReward.setCommentId(from.getCommentId());
                String commentContent2 = from.getCommentContent();
                Intrinsics.checkNotNullExpressionValue(commentContent2, "getCommentContent(...)");
                replyReward.setCommentContent(commentContent2);
                momentMessageOooO00o.setReplyReward(replyReward);
                OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o);
            }
            OooOOOO.OooO0oo(str, "\n动态的评论/回复打赏 \nsaveMessage2125 \nmessage : " + message + " \nmessageData : " + oOo00o0o.OooO00o(from) + "\ndb : " + momentMessageOooO00o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0o(MessageIM.Message message) {
        String str = this.f48393OooO00o;
        OooOOOO.OooO0OO(str, "\n圈子：圈主建群_用户加群成功后通知粉丝消息 \nsaveMessage2131 message " + message);
        try {
            MessageIM.Message2131 from = MessageIM.Message2131.parseFrom(message.getBody());
            if (OooOo00.OooO00o(from)) {
                return;
            }
            int i = from.getType() == 1 ? 18 : 19;
            String mid = message.getMid();
            Intrinsics.checkNotNullExpressionValue(mid, "getMid(...)");
            MomentMessage momentMessageOooO00o = OooO00o.OooO00o(i, mid, message.getTime(), null, 56);
            MomentMessage.TopicGroupCreateSuccessNotice topicGroupCreateSuccessNotice = new MomentMessage.TopicGroupCreateSuccessNotice();
            topicGroupCreateSuccessNotice.setUserId(Long.valueOf(from.getUserId()));
            topicGroupCreateSuccessNotice.setNickName(from.getNickName());
            topicGroupCreateSuccessNotice.setHeadUrl(from.getHeadUrl());
            topicGroupCreateSuccessNotice.setCircleId(Long.valueOf(from.getCircleId()));
            topicGroupCreateSuccessNotice.setCircleName(from.getCircleName());
            topicGroupCreateSuccessNotice.setCircleHead(from.getCircleHead());
            topicGroupCreateSuccessNotice.setType(Integer.valueOf(from.getType()));
            topicGroupCreateSuccessNotice.setGroupOpenId(from.getGroupOpenId());
            momentMessageOooO00o.setTopicGroupCreateSuccessNotice(topicGroupCreateSuccessNotice);
            OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream);
            o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o);
            OooOOOO.OooO0oo(str, "\n圈子：圈主建群_用户加群成功后通知所有的粉丝消息_momentsNotifications \nsaveMessage2131 \nmessage : " + message + " \nmessageData : " + oOo00o0o.OooO00o(from) + "\ndb : " + momentMessageOooO00o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0o0(MessageIM.Message message) {
        String str = this.f48393OooO00o;
        OooOOOO.OooO0OO(str, "\n动态举报结果 \nsaveMessage2126 message " + message);
        try {
            MessageIM.Message2126 from = MessageIM.Message2126.parseFrom(message.getBody());
            if (OooOo00.OooO00o(from)) {
                return;
            }
            String mid = message.getMid();
            Intrinsics.checkNotNullExpressionValue(mid, "getMid(...)");
            MomentMessage momentMessageOooO00o = OooO00o.OooO00o(16, mid, message.getTime(), null, 56);
            if (from.getRewardType() == 1) {
                momentMessageOooO00o.setType(16);
                MomentMessage.MomentReportFeedback momentReportFeedback = new MomentMessage.MomentReportFeedback();
                momentReportFeedback.setMomentId(Long.valueOf(from.getMomentId()));
                momentReportFeedback.setMomentImageUrl(from.getMomentSnapshot());
                momentReportFeedback.setMomentContent(from.getContent());
                momentReportFeedback.setMomentTitle(from.getTitle());
                momentMessageOooO00o.setMomentReportFeedback(momentReportFeedback);
                OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o);
            }
            if (from.getRewardType() == 2) {
                momentMessageOooO00o.setType(17);
                MomentMessage.CommentReportFeedback commentReportFeedback = new MomentMessage.CommentReportFeedback();
                commentReportFeedback.setMomentId(Long.valueOf(from.getMomentId()));
                commentReportFeedback.setMomentImageUrl(from.getMomentSnapshot());
                commentReportFeedback.setContent(from.getContent());
                commentReportFeedback.setTitle(from.getTitle());
                commentReportFeedback.setCommentId(Long.valueOf(from.getCommentId()));
                commentReportFeedback.setCommentContent(from.getCommentContent());
                momentMessageOooO00o.setCommentReportFeedback(commentReportFeedback);
                OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o);
            }
            if (from.getRewardType() == 3) {
                momentMessageOooO00o.setType(20);
                MomentMessage.CircleReportFeedback circleReportFeedback = new MomentMessage.CircleReportFeedback();
                circleReportFeedback.setCircleId(Long.valueOf(from.getMomentId()));
                circleReportFeedback.setCircleImageUrl(from.getMomentSnapshot());
                circleReportFeedback.setCircleContent(from.getContent());
                circleReportFeedback.setCircleTitle(from.getTitle());
                momentMessageOooO00o.setCircleReportFeedback(circleReportFeedback);
                OooOOOO.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                o00O0O.OooO00o().OooOo().OooOOO(momentMessageOooO00o);
            }
            OooOOOO.OooO0oo(str, "\n动态举报结果 \nsaveMessage2126 \nmessage : " + message + " \nmessageData : " + oOo00o0o.OooO00o(from) + "\ndb : " + momentMessageOooO00o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0oO(MessageIM.Message message) {
        String str = this.f48393OooO00o;
        OooOOOO.OooO0OO(str, "\n圈子：建群_加群结果消息通知 \nsaveMessage2132 message " + message);
        try {
            MessageIM.Message2132 from = MessageIM.Message2132.parseFrom(message.getBody());
            if (OooOo00.OooO00o(from)) {
                return;
            }
            int i = from.getType() == 1 ? 18 : 19;
            String mid = message.getMid();
            Intrinsics.checkNotNullExpressionValue(mid, "getMid(...)");
            MomentMessage momentMessageOooO00o = OooO00o.OooO00o(i, mid, message.getTime(), null, 56);
            MomentMessage.TopicGroupCreateOrJoinResult topicGroupCreateOrJoinResult = new MomentMessage.TopicGroupCreateOrJoinResult();
            topicGroupCreateOrJoinResult.setUserId(Long.valueOf(from.getUserId()));
            topicGroupCreateOrJoinResult.setCircleId(Long.valueOf(from.getCircleId()));
            topicGroupCreateOrJoinResult.setType(Integer.valueOf(from.getType()));
            int iOooO0o0 = o0OoOo0.OooO0o0(0, topicGroupCreateOrJoinResult.getType());
            if (iOooO0o0 == 1) {
                LiveEventBus.get("TOPIC_GROUP_RESULT_CREATE").post(Long.valueOf(o0OoOo0.OooOO0(topicGroupCreateOrJoinResult.getCircleId())));
            } else if (iOooO0o0 == 2) {
                LiveEventBus.get("TOPIC_GROUP_RESULT_JOIN").post(Long.valueOf(o0OoOo0.OooOO0(topicGroupCreateOrJoinResult.getCircleId())));
            }
            momentMessageOooO00o.setTopicGroupCreateOrJoinResult(topicGroupCreateOrJoinResult);
            OooOOOO.OooO0oo(str, "\n圈子：建群_加群结果消息通知_主要用于用户创建群成功后回到圈子主页来查询群基本信息接口_更新圈子主页进入群的入口按钮 \nsaveMessage2132 \nmessage : " + message + " \nmessageData : " + oOo00o0o.OooO00o(from) + "\ndb : " + momentMessageOooO00o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
