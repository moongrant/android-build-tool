package p526o0o0OO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.db.table.MomentMessage;
import com.yalla.yalla.common.model.MomentMessageCommentModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p520o0o0O0O0.o000O00;
import p522o0o0O0o.oOO00O;
import p652o0ooOoo.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 extends OooOo {

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO00o f43113OooO00o = new OooO00o();

        public static MomentMessage OooO00o(int i, String mid, long j, String messageContent, int i2) {
            long jLongValue;
            if ((i2 & 32) != 0) {
                messageContent = "";
            }
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(messageContent, "messageContent");
            MomentMessage momentMessage = new MomentMessage();
            Long value = OooOOO.f41216OooO00o.OooOo().getValue();
            if (value == null) {
                jLongValue = 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(value, "Account.userId.value ?: 0L");
                jLongValue = value.longValue();
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

    public final void OooO0O0(@NotNull MessageIM.Message message, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        o00O00.OooO0oo("MomentMsgProcessor", "\n动态消息\nMomentMsgProcessor parseMessage message = " + message);
        long fromId = message.getFromId();
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        Long value = oooOOO.OooOo().getValue();
        if ((value != null && fromId == value.longValue()) || OooO0OO.OooO00o(message.getMid())) {
            return;
        }
        String mid = message.getMid();
        Intrinsics.checkNotNullExpressionValue(mid, "message.mid");
        Intrinsics.checkNotNullParameter(mid, "mid");
        if (OooO0OO.OooO0O0(p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0O0(mid))) {
            return;
        }
        if (oooOOO.OooOo().getValue() == null) {
            return;
        }
        int head = message.getHead();
        if (head == 1000) {
            o00O00.OooO0OO("MomentMsgProcessor", "\n朋友圈评论点赞通知 \nsaveMessage1000 message " + message);
            try {
                MessageIM.Message1000 from = MessageIM.Message1000.parseFrom(message.getBody());
                Intrinsics.checkNotNullExpressionValue(from, "parseFrom(message.body)");
                if (OooO0OO.OooO00o(from)) {
                    return;
                }
                String mid2 = message.getMid();
                Intrinsics.checkNotNullExpressionValue(mid2, "message.mid");
                MomentMessage momentMessageOooO00o = OooO00o.OooO00o(2, mid2, message.getTime(), null, 56);
                MomentMessage.CommentPraise commentPraise = new MomentMessage.CommentPraise();
                commentPraise.setUserId(from.getPraiseUserId());
                String praiseNickname = from.getPraiseNickname();
                Intrinsics.checkNotNullExpressionValue(praiseNickname, "messageData.praiseNickname");
                commentPraise.setUserNickName(praiseNickname);
                String praiseHeadUrl = from.getPraiseHeadUrl();
                Intrinsics.checkNotNullExpressionValue(praiseHeadUrl, "messageData.praiseHeadUrl");
                commentPraise.setUserHeadUrl(praiseHeadUrl);
                commentPraise.setMomentId(from.getDyId());
                String dyImage = from.getDyImage();
                Intrinsics.checkNotNullExpressionValue(dyImage, "messageData.dyImage");
                commentPraise.setMomentImageUrl(dyImage);
                String ccontent = from.getCcontent();
                Intrinsics.checkNotNullExpressionValue(ccontent, "messageData.ccontent");
                commentPraise.setMomentContent(ccontent);
                momentMessageOooO00o.setCommentPraise(commentPraise);
                o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ' ');
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o);
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (head == 1001) {
            o00O00.OooO0OO("MomentMsgProcessor", "\n动态送礼 \nsaveMessage1001 message " + message);
            try {
                MessageIM.Message1001 from2 = MessageIM.Message1001.parseFrom(message.getBody());
                if (OooO0OO.OooO00o(from2)) {
                    return;
                }
                String mid3 = message.getMid();
                Intrinsics.checkNotNullExpressionValue(mid3, "message.mid");
                MomentMessage momentMessageOooO00o2 = OooO00o.OooO00o(7, mid3, message.getTime(), null, 56);
                MomentMessage.MomentGift momentGift = new MomentMessage.MomentGift();
                momentGift.setUserId(from2.getSendPropUserId());
                String sendNickname = from2.getSendNickname();
                Intrinsics.checkNotNullExpressionValue(sendNickname, "messageData.sendNickname");
                momentGift.setUserNickName(sendNickname);
                String sendHeadUrl = from2.getSendHeadUrl();
                Intrinsics.checkNotNullExpressionValue(sendHeadUrl, "messageData.sendHeadUrl");
                momentGift.setUserHeadUrl(sendHeadUrl);
                momentGift.setMomentId(from2.getDyId());
                String dyImage2 = from2.getDyImage();
                Intrinsics.checkNotNullExpressionValue(dyImage2, "messageData.dyImage");
                momentGift.setMomentImageUrl(dyImage2);
                String propImage = from2.getPropImage();
                Intrinsics.checkNotNullExpressionValue(propImage, "messageData.propImage");
                momentGift.setGiftImage(propImage);
                momentGift.setGiftNum(from2.getPropNum());
                momentMessageOooO00o2.setMomentGift(momentGift);
                o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o2 + ' ');
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o2);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        if (head == 1501) {
            o00O00.OooO0OO("MomentMsgProcessor", "\n动态被删除 \nsaveMessage1501 message " + message);
            try {
                MessageIM.Message1501 from3 = MessageIM.Message1501.parseFrom(message.getBody());
                if (OooO0OO.OooO00o(from3)) {
                    return;
                }
                String mid4 = message.getMid();
                Intrinsics.checkNotNullExpressionValue(mid4, "message.mid");
                MomentMessage momentMessageOooO00o3 = OooO00o.OooO00o(15, mid4, message.getTime(), null, 56);
                MomentMessage.MomentSystemRemove momentSystemRemove = new MomentMessage.MomentSystemRemove();
                momentSystemRemove.setMomentId(from3.getCommentId());
                String commentImg = from3.getCommentImg();
                Intrinsics.checkNotNullExpressionValue(commentImg, "messageData.commentImg");
                momentSystemRemove.setMomentImageUrl(commentImg);
                momentSystemRemove.setDeleteType(Integer.valueOf(from3.getDeleteType()));
                momentMessageOooO00o3.setMomentSystemRemove(momentSystemRemove);
                StringBuilder sb = new StringBuilder();
                sb.append("\n动态被删除 \nsaveMessage1501 \nmessage : ");
                sb.append(message);
                sb.append(" \nmessageData : ");
                String strOooO0Oo = o0Oo0oo.OooO0Oo(from3);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
                sb.append(strOooO0Oo);
                sb.append("\ndb : ");
                sb.append(momentMessageOooO00o3);
                o00O00.OooOO0(sb.toString());
                o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o3 + ' ');
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o3);
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                return;
            }
        }
        if (head == 1503) {
            o00O00.OooO0OO("MomentMsgProcessor", "\n评论加精通知 \nsaveMessage1503 message " + message);
            try {
                MessageIM.Message1503 from4 = MessageIM.Message1503.parseFrom(message.getBody());
                if (OooO0OO.OooO00o(from4)) {
                    return;
                }
                String mid5 = message.getMid();
                Intrinsics.checkNotNullExpressionValue(mid5, "message.mid");
                MomentMessage momentMessageOooO00o4 = OooO00o.OooO00o(11, mid5, message.getTime(), null, 56);
                MomentMessage.CommentFeatured commentFeatured = new MomentMessage.CommentFeatured();
                commentFeatured.setMomentId(from4.getDiscoveryId());
                String commentImg2 = from4.getCommentImg();
                Intrinsics.checkNotNullExpressionValue(commentImg2, "messageData.commentImg");
                commentFeatured.setMomentImageUrl(commentImg2);
                String content = from4.getContent();
                Intrinsics.checkNotNullExpressionValue(content, "messageData.content");
                commentFeatured.setMomentContent(content);
                commentFeatured.setCommentId(from4.getCommentId());
                momentMessageOooO00o4.setCommentFeatured(commentFeatured);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n评论加精通知 \nsaveMessage1503 \nmessage : ");
                sb2.append(message);
                sb2.append(" \nmessageData : ");
                String strOooO0Oo2 = o0Oo0oo.OooO0Oo(from4);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo2, "{\n                GsonCo…toJson(obj)\n            }");
                sb2.append(strOooO0Oo2);
                sb2.append("\ndb : ");
                sb2.append(momentMessageOooO00o4);
                o00O00.OooOO0(sb2.toString());
                o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o4 + ' ');
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o4);
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
            OooO0Oo(message);
            return;
        }
        if (head == 2125) {
            OooO0o0(message);
            return;
        }
        if (head == 2126) {
            OooO0o(message);
            return;
        }
        if (head == 2131) {
            OooO0oO(message);
            return;
        }
        if (head == 2132) {
            OooO0oo(message);
            return;
        }
        switch (head) {
            case 1003:
                o00O00.OooO0OO("MomentMsgProcessor", "\n圈子内置顶通知 \nsaveMessage1003 message " + message);
                try {
                    j jVarOooO00o = j.OooO00o(message.getBody());
                    if (!OooO0OO.OooO00o(jVarOooO00o)) {
                        String mid6 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid6, "message.mid");
                        MomentMessage momentMessageOooO00o5 = OooO00o.OooO00o(12, mid6, message.getTime(), null, 56);
                        MomentMessage.MomentTopicTop momentTopicTop = new MomentMessage.MomentTopicTop();
                        momentTopicTop.setUserId(jVarOooO00o.f51158OoooO00);
                        String str = jVarOooO00o.f51157Oooo0oo;
                        Intrinsics.checkNotNullExpressionValue(str, "messageData.hostImg");
                        momentTopicTop.setUserHeadUrl(str);
                        String str2 = jVarOooO00o.f51156Oooo0oO;
                        Intrinsics.checkNotNullExpressionValue(str2, "messageData.dyImg");
                        momentTopicTop.setMomentImageUrl(str2);
                        momentTopicTop.setTopicId(jVarOooO00o.f51155Oooo0o);
                        String str3 = jVarOooO00o.f51154Oooo;
                        Intrinsics.checkNotNullExpressionValue(str3, "messageData.circleName");
                        momentTopicTop.setTopicName(str3);
                        momentMessageOooO00o5.setMomentTopicTop(momentTopicTop);
                        o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o5 + ' ');
                        p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o5);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
                break;
            case 1004:
                o00O00.OooO0OO("MomentMsgProcessor", "\n圈子内置顶取消通知 \nsaveMessage1004 message " + message);
                try {
                    j jVarOooO00o2 = j.OooO00o(message.getBody());
                    if (!OooO0OO.OooO00o(jVarOooO00o2)) {
                        String mid7 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid7, "message.mid");
                        MomentMessage momentMessageOooO00o6 = OooO00o.OooO00o(-12, mid7, message.getTime(), null, 56);
                        MomentMessage.MomentTopicTopRevoke momentTopicTopRevoke = new MomentMessage.MomentTopicTopRevoke();
                        momentTopicTopRevoke.setUserId(jVarOooO00o2.f51158OoooO00);
                        String str4 = jVarOooO00o2.f51157Oooo0oo;
                        Intrinsics.checkNotNullExpressionValue(str4, "messageData.hostImg");
                        momentTopicTopRevoke.setUserHeadUrl(str4);
                        String str5 = jVarOooO00o2.f51156Oooo0oO;
                        Intrinsics.checkNotNullExpressionValue(str5, "messageData.dyImg");
                        momentTopicTopRevoke.setMomentImageUrl(str5);
                        momentTopicTopRevoke.setTopicId(jVarOooO00o2.f51155Oooo0o);
                        String str6 = jVarOooO00o2.f51154Oooo;
                        Intrinsics.checkNotNullExpressionValue(str6, "messageData.circleName");
                        momentTopicTopRevoke.setTopicName(str6);
                        momentMessageOooO00o6.setMomentTopicTopRevoke(momentTopicTopRevoke);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("\n圈子内置顶取消通知 \nsaveMessage1004 \nmessage : ");
                        sb3.append(message);
                        sb3.append(" \nmessageData : ");
                        String strOooO0Oo3 = o0Oo0oo.OooO0Oo(jVarOooO00o2);
                        Intrinsics.checkNotNullExpressionValue(strOooO0Oo3, "{\n                GsonCo…toJson(obj)\n            }");
                        sb3.append(strOooO0Oo3);
                        sb3.append("\ndb : ");
                        sb3.append(momentMessageOooO00o6);
                        o00O00.OooOO0(sb3.toString());
                        o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o6 + ' ');
                        p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o6);
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return;
                }
                break;
            case 1005:
                o00O00.OooO0OO("MomentMsgProcessor", "\n圈子内移除通知-圈主移出 \nsaveMessage1005 message " + message);
                try {
                    j jVarOooO00o3 = j.OooO00o(message.getBody());
                    if (!OooO0OO.OooO00o(jVarOooO00o3)) {
                        String mid8 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid8, "message.mid");
                        MomentMessage momentMessageOooO00o7 = OooO00o.OooO00o(13, mid8, message.getTime(), null, 56);
                        MomentMessage.MomentTopicRemoveOwner momentTopicRemoveOwner = new MomentMessage.MomentTopicRemoveOwner();
                        momentTopicRemoveOwner.setUserId(jVarOooO00o3.f51158OoooO00);
                        String str7 = jVarOooO00o3.f51157Oooo0oo;
                        Intrinsics.checkNotNullExpressionValue(str7, "messageData.hostImg");
                        momentTopicRemoveOwner.setUserHeadUrl(str7);
                        String str8 = jVarOooO00o3.f51156Oooo0oO;
                        Intrinsics.checkNotNullExpressionValue(str8, "messageData.dyImg");
                        momentTopicRemoveOwner.setMomentImageUrl(str8);
                        momentTopicRemoveOwner.setMomentId(jVarOooO00o3.f51155Oooo0o);
                        String str9 = jVarOooO00o3.f51154Oooo;
                        Intrinsics.checkNotNullExpressionValue(str9, "messageData.circleName");
                        momentTopicRemoveOwner.setTopicName(str9);
                        momentMessageOooO00o7.setMomentTopicRemoveOwner(momentTopicRemoveOwner);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("\n圈子内移除通知-圈主移出 \nsaveMessage1005 \nmessage : ");
                        sb4.append(message);
                        sb4.append(" \nmessageData : ");
                        String strOooO0Oo4 = o0Oo0oo.OooO0Oo(jVarOooO00o3);
                        Intrinsics.checkNotNullExpressionValue(strOooO0Oo4, "{\n                GsonCo…toJson(obj)\n            }");
                        sb4.append(strOooO0Oo4);
                        sb4.append("\ndb : ");
                        sb4.append(momentMessageOooO00o7);
                        o00O00.OooOO0(sb4.toString());
                        o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o7 + ' ');
                        p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o7);
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return;
                }
                break;
            case 1006:
                o00O00.OooO0OO("MomentMsgProcessor", "\n圈子内移除通知-管理员移出 \nsaveMessage1006 message " + message);
                try {
                    j jVarOooO00o4 = j.OooO00o(message.getBody());
                    if (!OooO0OO.OooO00o(jVarOooO00o4)) {
                        String mid9 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid9, "message.mid");
                        MomentMessage momentMessageOooO00o8 = OooO00o.OooO00o(14, mid9, message.getTime(), null, 56);
                        MomentMessage.MomentTopicRemoveAdmin momentTopicRemoveAdmin = new MomentMessage.MomentTopicRemoveAdmin();
                        momentTopicRemoveAdmin.setUserId(jVarOooO00o4.f51158OoooO00);
                        String str10 = jVarOooO00o4.f51157Oooo0oo;
                        Intrinsics.checkNotNullExpressionValue(str10, "messageData.hostImg");
                        momentTopicRemoveAdmin.setUserHeadUrl(str10);
                        String str11 = jVarOooO00o4.f51156Oooo0oO;
                        Intrinsics.checkNotNullExpressionValue(str11, "messageData.dyImg");
                        momentTopicRemoveAdmin.setMomentImageUrl(str11);
                        momentTopicRemoveAdmin.setMomentId(jVarOooO00o4.f51155Oooo0o);
                        String str12 = jVarOooO00o4.f51154Oooo;
                        Intrinsics.checkNotNullExpressionValue(str12, "messageData.circleName");
                        momentTopicRemoveAdmin.setTopicName(str12);
                        momentMessageOooO00o8.setMomentTopicRemoveAdmin(momentTopicRemoveAdmin);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("\n圈子内移除通知-管理员移出 \nsaveMessage1006 \nmessage : ");
                        sb5.append(message);
                        sb5.append(" \nmessageData : ");
                        String strOooO0Oo5 = o0Oo0oo.OooO0Oo(jVarOooO00o4);
                        Intrinsics.checkNotNullExpressionValue(strOooO0Oo5, "{\n                GsonCo…toJson(obj)\n            }");
                        sb5.append(strOooO0Oo5);
                        sb5.append("\ndb : ");
                        sb5.append(momentMessageOooO00o8);
                        o00O00.OooOO0(sb5.toString());
                        o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o8 + ' ');
                        p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o8);
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
                break;
        }
    }

    public final void OooO0OO(MessageIM.Message message) throws InvalidProtocolBufferException {
        Long lValueOf;
        MessageIM.Message2114 messageData = MessageIM.Message2114.parseFrom(message.getBody());
        if (OooO0OO.OooO00o(messageData)) {
        }
        MomentMessageCommentModel momentMessageCommentModel = (MomentMessageCommentModel) o0Oo0oo.OooO0O0(messageData.getContent(), MomentMessageCommentModel.class);
        o00O00.OooOO0("\n朋友圈操作消息 \nsaveMessage2114 \nmessage : " + message + " \nmomentMessageCommentModel : " + momentMessageCommentModel);
        switch (momentMessageCommentModel.getCode()) {
            case -4:
                if (momentMessageCommentModel.getMoment() != null) {
                    MomentMessageCommentModel.Moment moment = momentMessageCommentModel.getMoment();
                    if ((moment != null ? Long.valueOf(moment.getCid()) : null) != null) {
                        MomentMessageCommentModel.Moment moment2 = momentMessageCommentModel.getMoment();
                        lValueOf = moment2 != null ? Long.valueOf(moment2.getCid()) : null;
                        Intrinsics.checkNotNull(lValueOf);
                        if (lValueOf.longValue() > 0) {
                            Intrinsics.checkNotNullExpressionValue(messageData, "messageData");
                            Intrinsics.checkNotNullExpressionValue(momentMessageCommentModel, "momentMessageCommentModel");
                            Intrinsics.checkNotNullParameter(message, "message");
                            Intrinsics.checkNotNullParameter(messageData, "messageData");
                            Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                            o00O00.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论/动态回复 被@ - 撤回 \nsaveMessage2114MomentCommentAtRevoke messageData " + messageData);
                            try {
                                if (!OooO0OO.OooO00o(messageData)) {
                                    String mid = message.getMid();
                                    Intrinsics.checkNotNullExpressionValue(mid, "message.mid");
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
                                    o00O00.OooOO0o("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论/动态回复 被@ - 撤回 \nsaveMessage2114MomentCommentAtRevoke db = " + momentMessageOooO00o);
                                    o000O00.OooO00o(momentMessageOooO00o);
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
                Intrinsics.checkNotNullExpressionValue(messageData, "messageData");
                Intrinsics.checkNotNullExpressionValue(momentMessageCommentModel, "momentMessageCommentModel");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                o00O00.OooO0oo("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态点赞 - 撤回 \nsaveMessage2114MomentLikeRevoke messageData " + messageData);
                try {
                    if (!OooO0OO.OooO00o(messageData)) {
                        String mid2 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid2, "message.mid");
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
                        o000O00.OooO00o(momentMessageOooO00o2);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
            case -2:
                Intrinsics.checkNotNullExpressionValue(messageData, "messageData");
                Intrinsics.checkNotNullExpressionValue(momentMessageCommentModel, "momentMessageCommentModel");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                o00O00.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态回复 - 撤回 \nsaveMessage2114MomentReplyRevoke messageData " + messageData);
                try {
                    if (!OooO0OO.OooO00o(messageData)) {
                        String mid3 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid3, "message.mid");
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
                        o000O00.OooO00o(momentMessageOooO00o3);
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
                break;
            case -1:
                Intrinsics.checkNotNullExpressionValue(messageData, "messageData");
                Intrinsics.checkNotNullExpressionValue(momentMessageCommentModel, "momentMessageCommentModel");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                o00O00.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论 - 撤回 \nsaveMessage2114MomentCommentRevoke messageData " + messageData);
                try {
                    if (!OooO0OO.OooO00o(messageData)) {
                        String mid4 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid4, "message.mid");
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
                        o000O00.OooO00o(momentMessageOooO00o4);
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
                break;
            case 1:
                Intrinsics.checkNotNullExpressionValue(messageData, "messageData");
                Intrinsics.checkNotNullExpressionValue(momentMessageCommentModel, "momentMessageCommentModel");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                o00O00.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论 \nsaveMessage2114MomentCommentAdd messageData " + messageData);
                try {
                    if (!OooO0OO.OooO00o(messageData)) {
                        String mid5 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid5, "message.mid");
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
                        o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o5 + ' ');
                        p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o5);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return;
                }
                break;
            case 2:
                Intrinsics.checkNotNullExpressionValue(messageData, "messageData");
                Intrinsics.checkNotNullExpressionValue(momentMessageCommentModel, "momentMessageCommentModel");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                o00O00.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态回复 \nsaveMessage2114MomentReplyAdd messageData " + messageData);
                try {
                    if (!OooO0OO.OooO00o(messageData)) {
                        String mid6 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid6, "message.mid");
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
                        o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o6 + ' ');
                        p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o6);
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return;
                }
                break;
            case 3:
                Intrinsics.checkNotNullExpressionValue(messageData, "messageData");
                Intrinsics.checkNotNullExpressionValue(momentMessageCommentModel, "momentMessageCommentModel");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                o00O00.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态点赞 \nsaveMessage2114MomentLikeAdd messageData " + messageData);
                try {
                    if (!OooO0OO.OooO00o(messageData)) {
                        String mid7 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid7, "message.mid");
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
                        o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o7 + ' ');
                        p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o7);
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
                        lValueOf = moment11 != null ? Long.valueOf(moment11.getCid()) : null;
                        Intrinsics.checkNotNull(lValueOf);
                        if (lValueOf.longValue() > 0) {
                            Intrinsics.checkNotNullExpressionValue(messageData, "messageData");
                            Intrinsics.checkNotNullExpressionValue(momentMessageCommentModel, "momentMessageCommentModel");
                            Intrinsics.checkNotNullParameter(message, "message");
                            Intrinsics.checkNotNullParameter(messageData, "messageData");
                            Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                            o00O00.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论/动态回复 被@ \nsaveMessage2114MomentCommentAtAdd messageData " + messageData);
                            try {
                                if (!OooO0OO.OooO00o(messageData)) {
                                    String mid8 = message.getMid();
                                    Intrinsics.checkNotNullExpressionValue(mid8, "message.mid");
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
                                    o00O00.OooOO0o("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态评论/动态回复 被@ \nsaveMessage2114MomentCommentAtAdd db = " + momentMessageOooO00o8);
                                    o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o8 + ' ');
                                    p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o8);
                                }
                            } catch (Exception e8) {
                                e8.printStackTrace();
                                return;
                            }
                        }
                    }
                }
                Intrinsics.checkNotNullExpressionValue(messageData, "messageData");
                Intrinsics.checkNotNullExpressionValue(momentMessageCommentModel, "momentMessageCommentModel");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                Intrinsics.checkNotNullParameter(momentMessageCommentModel, "momentMessageCommentModel");
                o00O00.OooO0OO("MomentMsgProcessor - 2114", "\n朋友圈操作消息 - 动态被@ \nsaveMessage2114MomentAtAdd messageData " + messageData);
                try {
                    if (!OooO0OO.OooO00o(messageData)) {
                        String mid9 = message.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid9, "message.mid");
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
                        o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o9 + ' ');
                        p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o9);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
                break;
        }
    }

    public final void OooO0Oo(MessageIM.Message message) {
        o00O00.OooO0OO("MomentMsgProcessor", "\n动态加精通知 \nsaveMessage2117 message " + message);
        try {
            MessageIM.Message2117 from = MessageIM.Message2117.parseFrom(message.getBody());
            if (OooO0OO.OooO00o(from)) {
                return;
            }
            String mid = message.getMid();
            Intrinsics.checkNotNullExpressionValue(mid, "message.mid");
            MomentMessage momentMessageOooO00o = OooO00o.OooO00o(10, mid, message.getTime(), null, 56);
            MomentMessage.MomentFeatured momentFeatured = new MomentMessage.MomentFeatured();
            momentFeatured.setMomentId(from.getCommentId());
            String commentImg = from.getCommentImg();
            Intrinsics.checkNotNullExpressionValue(commentImg, "messageData.commentImg");
            momentFeatured.setMomentImageUrl(commentImg);
            momentMessageOooO00o.setMomentFeatured(momentFeatured);
            o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ' ');
            p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0o(MessageIM.Message message) {
        o00O00.OooO0OO("MomentMsgProcessor", "\n动态举报结果 \nsaveMessage2126 message " + message);
        try {
            MessageIM.Message2126 from = MessageIM.Message2126.parseFrom(message.getBody());
            if (OooO0OO.OooO00o(from)) {
                return;
            }
            String mid = message.getMid();
            Intrinsics.checkNotNullExpressionValue(mid, "message.mid");
            MomentMessage momentMessageOooO00o = OooO00o.OooO00o(16, mid, message.getTime(), null, 56);
            if (from.getRewardType() == 1) {
                momentMessageOooO00o.setType(16);
                MomentMessage.MomentReportFeedback momentReportFeedback = new MomentMessage.MomentReportFeedback();
                momentReportFeedback.setMomentId(Long.valueOf(from.getMomentId()));
                momentReportFeedback.setMomentImageUrl(from.getMomentSnapshot());
                momentReportFeedback.setMomentContent(from.getContent());
                momentReportFeedback.setMomentTitle(from.getTitle());
                momentMessageOooO00o.setMomentReportFeedback(momentReportFeedback);
                o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ' ');
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o);
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
                o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ' ');
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o);
            }
            if (from.getRewardType() == 3) {
                momentMessageOooO00o.setType(20);
                MomentMessage.CircleReportFeedback circleReportFeedback = new MomentMessage.CircleReportFeedback();
                circleReportFeedback.setCircleId(Long.valueOf(from.getMomentId()));
                circleReportFeedback.setCircleImageUrl(from.getMomentSnapshot());
                circleReportFeedback.setCircleContent(from.getContent());
                circleReportFeedback.setCircleTitle(from.getTitle());
                momentMessageOooO00o.setCircleReportFeedback(circleReportFeedback);
                o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ' ');
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n动态举报结果 \nsaveMessage2126 \nmessage : ");
            sb.append(message);
            sb.append(" \nmessageData : ");
            String strOooO0Oo = o0Oo0oo.OooO0Oo(from);
            Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
            sb.append(strOooO0Oo);
            sb.append("\ndb : ");
            sb.append(momentMessageOooO00o);
            o00O00.OooOO0(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0o0(MessageIM.Message message) {
        o00O00.OooO0OO("MomentMsgProcessor", "\n动态的评论/回复打赏 \nsaveMessage2125 message " + message);
        try {
            MessageIM.Message2125 from = MessageIM.Message2125.parseFrom(message.getBody());
            if (OooO0OO.OooO00o(from)) {
                return;
            }
            String mid = message.getMid();
            Intrinsics.checkNotNullExpressionValue(mid, "message.mid");
            MomentMessage momentMessageOooO00o = OooO00o.OooO00o(8, mid, message.getTime(), null, 56);
            if (from.getRewardType() == 1) {
                momentMessageOooO00o.setType(8);
                MomentMessage.CommentReward commentReward = new MomentMessage.CommentReward();
                commentReward.setUserId(from.getFromUid());
                String nickName = from.getNickName();
                Intrinsics.checkNotNullExpressionValue(nickName, "messageData.nickName");
                commentReward.setUserNickName(nickName);
                String headUrl = from.getHeadUrl();
                Intrinsics.checkNotNullExpressionValue(headUrl, "messageData.headUrl");
                commentReward.setUserHeadUrl(headUrl);
                commentReward.setMomentId(from.getMomentId());
                String momentSnapshot = from.getMomentSnapshot();
                Intrinsics.checkNotNullExpressionValue(momentSnapshot, "messageData.momentSnapshot");
                commentReward.setMomentImageUrl(momentSnapshot);
                commentReward.setCommentId(from.getCommentId());
                String commentContent = from.getCommentContent();
                Intrinsics.checkNotNullExpressionValue(commentContent, "messageData.commentContent");
                commentReward.setCommentContent(commentContent);
                momentMessageOooO00o.setCommentReward(commentReward);
                o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ' ');
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o);
            }
            if (from.getRewardType() == 2) {
                momentMessageOooO00o.setType(9);
                MomentMessage.ReplyReward replyReward = new MomentMessage.ReplyReward();
                replyReward.setUserId(from.getFromUid());
                String nickName2 = from.getNickName();
                Intrinsics.checkNotNullExpressionValue(nickName2, "messageData.nickName");
                replyReward.setUserNickName(nickName2);
                String headUrl2 = from.getHeadUrl();
                Intrinsics.checkNotNullExpressionValue(headUrl2, "messageData.headUrl");
                replyReward.setUserHeadUrl(headUrl2);
                replyReward.setMomentId(from.getMomentId());
                String momentSnapshot2 = from.getMomentSnapshot();
                Intrinsics.checkNotNullExpressionValue(momentSnapshot2, "messageData.momentSnapshot");
                replyReward.setMomentImageUrl(momentSnapshot2);
                replyReward.setCommentId(from.getCommentId());
                String commentContent2 = from.getCommentContent();
                Intrinsics.checkNotNullExpressionValue(commentContent2, "messageData.commentContent");
                replyReward.setCommentContent(commentContent2);
                momentMessageOooO00o.setReplyReward(replyReward);
                o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ' ');
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n动态的评论/回复打赏 \nsaveMessage2125 \nmessage : ");
            sb.append(message);
            sb.append(" \nmessageData : ");
            String strOooO0Oo = o0Oo0oo.OooO0Oo(from);
            Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
            sb.append(strOooO0Oo);
            sb.append("\ndb : ");
            sb.append(momentMessageOooO00o);
            o00O00.OooOO0(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0oO(MessageIM.Message message) {
        o00O00.OooO0OO("MomentMsgProcessor", "\n圈子：圈主建群_用户加群成功后通知粉丝消息 \nsaveMessage2131 message " + message);
        try {
            MessageIM.Message2131 from = MessageIM.Message2131.parseFrom(message.getBody());
            if (OooO0OO.OooO00o(from)) {
                return;
            }
            int i = from.getType() == 1 ? 18 : 19;
            String mid = message.getMid();
            Intrinsics.checkNotNullExpressionValue(mid, "message.mid");
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
            o00O00.OooO0O0("MomentMessageRepo saveMessage msg:" + momentMessageOooO00o + ' ');
            p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0OO(momentMessageOooO00o);
            StringBuilder sb = new StringBuilder();
            sb.append("\n圈子：圈主建群_用户加群成功后通知所有的粉丝消息_momentsNotifications \nsaveMessage2131 \nmessage : ");
            sb.append(message);
            sb.append(" \nmessageData : ");
            String strOooO0Oo = o0Oo0oo.OooO0Oo(from);
            Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
            sb.append(strOooO0Oo);
            sb.append("\ndb : ");
            sb.append(momentMessageOooO00o);
            o00O00.OooOO0(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0oo(MessageIM.Message message) {
        o00O00.OooO0OO("MomentMsgProcessor", "\n圈子：建群_加群结果消息通知 \nsaveMessage2132 message " + message);
        try {
            MessageIM.Message2132 from = MessageIM.Message2132.parseFrom(message.getBody());
            if (OooO0OO.OooO00o(from)) {
                return;
            }
            int i = from.getType() == 1 ? 18 : 19;
            String mid = message.getMid();
            Intrinsics.checkNotNullExpressionValue(mid, "message.mid");
            MomentMessage momentMessageOooO00o = OooO00o.OooO00o(i, mid, message.getTime(), null, 56);
            MomentMessage.TopicGroupCreateOrJoinResult topicGroupCreateOrJoinResult = new MomentMessage.TopicGroupCreateOrJoinResult();
            topicGroupCreateOrJoinResult.setUserId(Long.valueOf(from.getUserId()));
            topicGroupCreateOrJoinResult.setCircleId(Long.valueOf(from.getCircleId()));
            topicGroupCreateOrJoinResult.setType(Integer.valueOf(from.getType()));
            int iOooO0Oo = oOO00O.OooO0Oo(topicGroupCreateOrJoinResult.getType(), 0);
            if (iOooO0Oo == 1) {
                LiveEventBus.get("TOPIC_GROUP_RESULT_CREATE").post(Long.valueOf(oOO00O.OooO0o(topicGroupCreateOrJoinResult.getCircleId())));
            } else if (iOooO0Oo == 2) {
                LiveEventBus.get("TOPIC_GROUP_RESULT_JOIN").post(Long.valueOf(oOO00O.OooO0o(topicGroupCreateOrJoinResult.getCircleId())));
            }
            momentMessageOooO00o.setTopicGroupCreateOrJoinResult(topicGroupCreateOrJoinResult);
            StringBuilder sb = new StringBuilder();
            sb.append("\n圈子：建群_加群结果消息通知_主要用于用户创建群成功后回到圈子主页来查询群基本信息接口_更新圈子主页进入群的入口按钮 \nsaveMessage2132 \nmessage : ");
            sb.append(message);
            sb.append(" \nmessageData : ");
            String strOooO0Oo = o0Oo0oo.OooO0Oo(from);
            Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
            sb.append(strOooO0Oo);
            sb.append("\ndb : ");
            sb.append(momentMessageOooO00o);
            o00O00.OooOO0(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
