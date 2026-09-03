package p526o0o0OO;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.application.App;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.MomentToShareFriend;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.OooO00o;
import kotlin.text.StringsKt;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o000O00;
import p113o00O00Oo.OooOOO0;
import p168o00Ooo0.o0ooOOo;
import p168o00Ooo0.oo000o;
import p391o0OOooOo.o0O00000;
import p453o0Ooo.OooOO0;
import p515o0o0O00.o00O00;
import p520o0o0O0O0.o00O0O;
import p522o0o0O0o.oOO00O;
import p527o0o0OO0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0O extends OooOo {
    public final void OooO0O0(Intent intent, String str, String str2) {
        PendingIntent activity = PendingIntent.getActivity(App.f11458Oooo0oO, 1807201968, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : SQLiteDatabase.CREATE_IF_NECESSARY);
        String strOooO0OO = OooOOO.OooO0OO(R.string.notification_new_message);
        Notification.Builder builderOooO00o = o0ooOOo.OooO00o();
        builderOooO00o.setContentTitle(str).setContentText(str2).setTicker(strOooO0OO).setDefaults(2).setSmallIcon(R.drawable.icon_notification_small).setLargeIcon(BitmapFactory.decodeResource(App.f11458Oooo0oO.getResources(), R.drawable.ic_logo)).setAutoCancel(true).setOngoing(false).setPriority(1).setContentIntent(activity);
        App.f11459Oooo0oo.post(new OooOOO0("Yalla_Notice_PriveteChat", builderOooO00o, 1));
    }

    public final boolean OooO0OO() {
        if (!OooO00o()) {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            if (p497o0o00Oo.OooOOO0.OooOOO0().OooOOO0()) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0Oo(@NotNull MessageIM.Message msg, boolean z) throws InvalidProtocolBufferException {
        UserInfo userInfoOooO00o;
        UserInfo userInfoOooO00o2;
        UserInfo userInfoOooO00o3;
        UserInfo userInfoOooO00o4;
        UserInfo userInfoOooO00o5;
        UserInfo userInfoOooO00o6;
        UserInfo userInfoOooO00o7;
        UserInfo userInfoOooO00o8;
        UserInfo userInfoOooO00o9;
        UserInfo userInfoOooO00o10;
        UserInfo userInfoOooO00o11;
        UserInfo userInfoOooO00o12;
        OooOO0O oooOO0O;
        UserInfo userInfoOooO00o13;
        UserInfo userInfoOooO00o14;
        UserInfo userInfoOooO00o15;
        Intrinsics.checkNotNullParameter(msg, "msg");
        o00O00.OooO0OO("ChatMsgProcessor", "message = " + msg);
        long fromId = msg.getFromId();
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Long value = oooOOO.OooOo().getValue();
        if ((value == null || fromId != value.longValue()) && !OooO0OO.OooO00o(msg.getMid())) {
            if (!(p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooO0oo(((Number) OooO00o.OooO00o(oooOOO)).longValue(), msg.getMid()) != null) || z) {
                int head = msg.getHead();
                if (head == 1504) {
                    MessageIM.Message1504 from = MessageIM.Message1504.parseFrom(msg.getBody());
                    if (from == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(from, "MessageIM.Message1504.parseFrom(body) ?: return");
                    p520o0o0O0O0.OooOOO oooOOO2 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                    String mid = from.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid, "acceptThemeMsg.mid");
                    oooOOO2.OooO0oO(oooOOO2.OooO0o(true, mid));
                    if (!OooO0OO() || (userInfoOooO00o = o000O00.OooO00o(msg.getFromId())) == null) {
                        return;
                    }
                    String strOooO0O0 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o.getUserName());
                    Intent intent = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                    intent.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                    OooOO0 oooOO1 = OooOO0.f40347OooO00o;
                    OooO0O0(intent, strOooO0O0, OooOO0.OooO00o(OooOo.OooO00o(OooOOO.OooO0OO(R.string.message_give_theme_successful), strOooO0O0)));
                    return;
                }
                if (head == 2103) {
                    o0O00000.OooO0o0("Message_receive_success", String.valueOf(oo000o.OooO0O0()));
                    MessageIM.Message2103 from2 = MessageIM.Message2103.parseFrom(msg.getBody());
                    if (from2 == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(from2, "MessageIM.Message2103.parseFrom(body) ?: return");
                    msg.getBody().OooO();
                    p520o0o0O0O0.OooOOO oooOOO3 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                    long fromId2 = msg.getFromId();
                    String content = from2.getContent();
                    Intrinsics.checkNotNullExpressionValue(content, "textMsg.content");
                    String mid2 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid2, "mid");
                    oooOOO3.OooO0oO(oooOOO3.OooOo0o(fromId2, content, mid2, msg.getTime(), true, from2.getWarn() == 1));
                    if (!OooO0OO() || (userInfoOooO00o2 = o000O00.OooO00o(msg.getFromId())) == null) {
                        return;
                    }
                    String strOooO0O1 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o2.getUserName());
                    Intent intent2 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                    intent2.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                    OooOO0 oooOO2 = OooOO0.f40347OooO00o;
                    String content2 = from2.getContent();
                    Intrinsics.checkNotNullExpressionValue(content2, "textMsg.content");
                    OooO0O0(intent2, strOooO0O1, OooOO0.OooO00o(content2));
                    return;
                }
                if (head == 2105) {
                    o0O00000.OooO0o0("Message_receive_success", String.valueOf(oo000o.OooO0O0()));
                    MessageIM.Message2105 from3 = MessageIM.Message2105.parseFrom(msg.getBody());
                    if (from3 == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(from3, "MessageIM.Message2105.parseFrom(body) ?: return");
                    p520o0o0O0O0.OooOOO oooOOO4 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                    long fromId3 = msg.getFromId();
                    int giftId = from3.getGiftId();
                    int number = from3.getNumber();
                    String giftURL = from3.getGiftURL();
                    Intrinsics.checkNotNullExpressionValue(giftURL, "giftMsg.giftURL");
                    String mid3 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid3, "mid");
                    ChatMessage chatMessageOooOO0O = p520o0o0O0O0.OooOOO.OooOO0O(fromId3, giftId, number, giftURL, mid3, msg.getTime(), true, false, false, 384);
                    oooOOO4.OooO0oO(chatMessageOooOO0O);
                    if (!OooO0OO() || (userInfoOooO00o3 = o000O00.OooO00o(msg.getFromId())) == null) {
                        return;
                    }
                    String strOooO0O2 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o3.getUserName());
                    Intent intent3 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                    intent3.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                    GiftPropModel giftPropModelOooO0O0 = oo0O.OooO0OO.f53327OooO00o.OooO0O0(from3.getGiftId());
                    OooO0O0(intent3, strOooO0O2, chatMessageOooOO0O.getGifInfo() != null ? String.valueOf(giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getName() : null) : OooOOO.OooO0OO(R.string.notification_default_gift));
                    return;
                }
                if (head == 2109) {
                    o0O00000.OooO0o0("Message_receive_success", String.valueOf(oo000o.OooO0O0()));
                    MessageIM.Message2109 from4 = MessageIM.Message2109.parseFrom(msg.getBody());
                    if (from4 == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(from4, "MessageIM.Message2109.pa…m(message.body) ?: return");
                    p520o0o0O0O0.OooOOO oooOOO5 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                    long fromId4 = msg.getFromId();
                    long duration = from4.getDuration();
                    String url = from4.getUrl();
                    Intrinsics.checkNotNullExpressionValue(url, "voiceMsg.url");
                    String mid4 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid4, "mid");
                    oooOOO5.OooO0oO(oooOOO5.OooOoO0(fromId4, "", duration, url, mid4, msg.getTime(), true));
                    if (!OooO0OO() || (userInfoOooO00o4 = o000O00.OooO00o(msg.getFromId())) == null) {
                        return;
                    }
                    String strOooO0O3 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o4.getUserName());
                    Intent intent4 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                    intent4.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                    OooO0O0(intent4, strOooO0O3, OooOOO.OooO0OO(R.string.voice_notice));
                    return;
                }
                if (head == 2115) {
                    o0O00000.OooO0o0("Message_receive_success", String.valueOf(oo000o.OooO0O0()));
                    MessageIM.Message2115 from5 = MessageIM.Message2115.parseFrom(msg.getBody());
                    if (from5 == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(from5, "MessageIM.Message2115.parseFrom(body) ?: return");
                    p520o0o0O0O0.OooOOO oooOOO6 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                    long fromId5 = msg.getFromId();
                    int type = from5.getType();
                    int number2 = from5.getNumber();
                    String mid5 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid5, "mid");
                    ChatMessage chatMessage = oooOOO6.OooO0oo(fromId5, type, number2, mid5, msg.getTime(), true);
                    Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
                    p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessage);
                    oooOOO6.OooO0oO(chatMessage);
                    if (!OooO0OO() || (userInfoOooO00o5 = o000O00.OooO00o(msg.getFromId())) == null) {
                        return;
                    }
                    String strOooO0O4 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o5.getUserName());
                    Intent intent5 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                    intent5.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                    OooO0O0(intent5, strOooO0O4, OooOOO.OooO0OO(R.string.Stickers));
                    return;
                }
                if (head == 2124) {
                    o0O00000.OooO0o0("Message_receive_success", String.valueOf(oo000o.OooO0O0()));
                    MessageIM.Message2124 from6 = MessageIM.Message2124.parseFrom(msg.getBody());
                    if (from6 == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(from6, "MessageIM.Message2124.parseFrom(body) ?: return");
                    p520o0o0O0O0.OooOOO oooOOO7 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                    long fromId6 = msg.getFromId();
                    long userId = from6.getUserId();
                    long prettyID = from6.getPrettyID();
                    String nickName = from6.getNickName();
                    Intrinsics.checkNotNullExpressionValue(nickName, "userMsg.nickName");
                    String photo = from6.getPhoto();
                    Intrinsics.checkNotNullExpressionValue(photo, "userMsg.photo");
                    String msg2 = from6.getMsg();
                    Intrinsics.checkNotNullExpressionValue(msg2, "userMsg.msg");
                    String mid6 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid6, "mid");
                    oooOOO7.OooO0oO(oooOOO7.OooOo0(fromId6, userId, prettyID, nickName, photo, msg2, mid6, msg.getTime(), true));
                    if (OooO0OO() && (userInfoOooO00o6 = o000O00.OooO00o(msg.getFromId())) != null) {
                        String strOooO0O5 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o6.getUserName());
                        Intent intent6 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                        intent6.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                        OooO0O0(intent6, strOooO0O5, OooOo.OooO00o(OooOOO.OooO0OO(R.string.XXX_shared_a_user_with_you), strOooO0O5));
                    }
                    OooO0o0(msg, from6.getMsg());
                    return;
                }
                if (head == 2140) {
                    MessageIM.Message2140 from7 = MessageIM.Message2140.parseFrom(msg.getBody());
                    if (from7 == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(from7, "MessageIM.Message2140.parseFrom(body) ?: return");
                    List<MessageIM.GiftIdUrl> giftsList = from7.getGiftsList();
                    if (giftsList != null) {
                        Intrinsics.checkNotNullExpressionValue(giftsList, "giftsList");
                        for (MessageIM.GiftIdUrl giftIdUrl : giftsList) {
                            p520o0o0O0O0.OooOOO oooOOO8 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                            long fromId7 = msg.getFromId();
                            int iOooO0o0 = oOO00O.OooO0o0(Long.valueOf(giftIdUrl.getGiftId()));
                            String giftUrl = giftIdUrl.getGiftUrl();
                            Intrinsics.checkNotNullExpressionValue(giftUrl, "gift.giftUrl");
                            String mid7 = msg.getMid();
                            Intrinsics.checkNotNullExpressionValue(mid7, "mid");
                            ChatMessage chatMessageOooOO0O2 = p520o0o0O0O0.OooOOO.OooOO0O(fromId7, iOooO0o0, 1, giftUrl, mid7, msg.getTime(), true, false, false, 384);
                            oooOOO8.OooO0oO(chatMessageOooOO0O2);
                            if (OooO0OO() && (userInfoOooO00o7 = o000O00.OooO00o(msg.getFromId())) != null) {
                                String strOooO0O6 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o7.getUserName());
                                Intent intent7 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                                intent7.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                                GiftPropModel giftPropModelOooO0O1 = oo0O.OooO0OO.f53327OooO00o.OooO0O0(oOO00O.OooO0o0(Long.valueOf(giftIdUrl.getGiftId())));
                                OooO0O0(intent7, strOooO0O6, chatMessageOooOO0O2.getGifInfo() != null ? String.valueOf(giftPropModelOooO0O1 != null ? giftPropModelOooO0O1.getName() : null) : OooOOO.OooO0OO(R.string.notification_default_gift));
                            }
                        }
                        return;
                    }
                    return;
                }
                switch (head) {
                    case 2119:
                        o0O00000.OooO0o0("Message_receive_success", String.valueOf(oo000o.OooO0O0()));
                        MessageIM.Message2119 from8 = MessageIM.Message2119.parseFrom(msg.getBody());
                        if (from8 != null) {
                            Intrinsics.checkNotNullExpressionValue(from8, "MessageIM.Message2119.parseFrom(body) ?: return");
                            p520o0o0O0O0.OooOOO oooOOO9 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                            long fromId8 = msg.getFromId();
                            int gifid = from8.getGifid();
                            String gifurl = from8.getGifurl();
                            Intrinsics.checkNotNullExpressionValue(gifurl, "gifMsg.gifurl");
                            String mid8 = msg.getMid();
                            Intrinsics.checkNotNullExpressionValue(mid8, "mid");
                            oooOOO9.OooO0oO(oooOOO9.OooO(fromId8, gifid, gifurl, mid8, msg.getTime(), true));
                            if (OooO0OO() && (userInfoOooO00o8 = o000O00.OooO00o(msg.getFromId())) != null) {
                                String strOooO0O7 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o8.getUserName());
                                Intent intent8 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                                intent8.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                                OooO0O0(intent8, strOooO0O7, OooOOO.OooO0OO(R.string.Stickers));
                            }
                        }
                        break;
                    case 2120:
                        o0O00000.OooO0o0("Message_receive_success", String.valueOf(oo000o.OooO0O0()));
                        MessageIM.Message2120 from9 = MessageIM.Message2120.parseFrom(msg.getBody());
                        if (from9 != null) {
                            Intrinsics.checkNotNullExpressionValue(from9, "MessageIM.Message2120.parseFrom(body) ?: return");
                            p520o0o0O0O0.OooOOO oooOOO10 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                            long fromId9 = msg.getFromId();
                            long i64RoomId = from9.getI64RoomId();
                            long i64RoomIdx = from9.getI64RoomIdx();
                            String name = from9.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "roomMsg.name");
                            String image = from9.getImage();
                            Intrinsics.checkNotNullExpressionValue(image, "roomMsg.image");
                            String roomIp = from9.getRoomIp();
                            Intrinsics.checkNotNullExpressionValue(roomIp, "roomMsg.roomIp");
                            String msg3 = from9.getMsg();
                            Intrinsics.checkNotNullExpressionValue(msg3, "roomMsg.msg");
                            String mid9 = msg.getMid();
                            Intrinsics.checkNotNullExpressionValue(mid9, "mid");
                            oooOOO10.OooO0oO(oooOOO10.OooOOo0(fromId9, i64RoomId, i64RoomIdx, name, image, roomIp, msg3, mid9, msg.getTime(), true));
                            if (OooO0OO() && (userInfoOooO00o9 = o000O00.OooO00o(msg.getFromId())) != null) {
                                String strOooO0O8 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o9.getUserName());
                                Intent intent9 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                                intent9.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                                OooO0O0(intent9, strOooO0O8, OooOo.OooO00o(OooOOO.OooO0OO(R.string.recommend_room_to_you), strOooO0O8));
                            }
                            OooO0o0(msg, from9.getMsg());
                        }
                        break;
                    case 2121:
                        o0O00000.OooO0o0("Message_receive_success", String.valueOf(oo000o.OooO0O0()));
                        MessageIM.Message2121 from10 = MessageIM.Message2121.parseFrom(msg.getBody());
                        if (from10 != null) {
                            Intrinsics.checkNotNullExpressionValue(from10, "MessageIM.Message2121.parseFrom(body) ?: return");
                            p520o0o0O0O0.OooOOO oooOOO11 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                            long fromId10 = msg.getFromId();
                            long momentId = from10.getMomentId();
                            String image2 = from10.getImage();
                            Intrinsics.checkNotNullExpressionValue(image2, "momentMsg.image");
                            String text = from10.getText();
                            Intrinsics.checkNotNullExpressionValue(text, "momentMsg.text");
                            int type2 = from10.getType();
                            String msg4 = from10.getMsg();
                            Intrinsics.checkNotNullExpressionValue(msg4, "momentMsg.msg");
                            String mid10 = msg.getMid();
                            Intrinsics.checkNotNullExpressionValue(mid10, "mid");
                            oooOOO11.OooO0oO(oooOOO11.OooOOOO(fromId10, momentId, image2, text, type2, msg4, mid10, msg.getTime(), true));
                            if (OooO0OO() && (userInfoOooO00o10 = o000O00.OooO00o(msg.getFromId())) != null) {
                                String strOooO0O9 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o10.getUserName());
                                Intent intent10 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                                intent10.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                                OooO0O0(intent10, strOooO0O9, OooOo.OooO00o(OooOOO.OooO0OO(R.string.XXX_shared_a_post_with_you), strOooO0O9));
                                if (from10.getType() == MomentToShareFriend.Poll.getValue()) {
                                    OooO0O0(intent10, strOooO0O9, OooOo.OooO00o(OooOOO.OooO0OO(R.string.moment_poll_share_from_user), strOooO0O9));
                                }
                            }
                            OooO0o0(msg, from10.getMsg());
                        }
                        break;
                    case 2122:
                        o0O00000.OooO0o0("Message_receive_success", String.valueOf(oo000o.OooO0O0()));
                        MessageIM.Message2122 from11 = MessageIM.Message2122.parseFrom(msg.getBody());
                        if (from11 != null) {
                            Intrinsics.checkNotNullExpressionValue(from11, "MessageIM.Message2122.parseFrom(body) ?: return");
                            p520o0o0O0O0.OooOOO oooOOO12 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                            long fromId11 = msg.getFromId();
                            long circleId = from11.getCircleId();
                            String image3 = from11.getImage();
                            Intrinsics.checkNotNullExpressionValue(image3, "topicMsg.image");
                            String name2 = from11.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "topicMsg.name");
                            int userCount = from11.getUserCount();
                            int momentCount = from11.getMomentCount();
                            String msg5 = from11.getMsg();
                            Intrinsics.checkNotNullExpressionValue(msg5, "topicMsg.msg");
                            String mid11 = msg.getMid();
                            Intrinsics.checkNotNullExpressionValue(mid11, "mid");
                            oooOOO12.OooO0oO(oooOOO12.OooOOoo(fromId11, circleId, image3, name2, userCount, momentCount, msg5, mid11, msg.getTime(), true));
                            if (OooO0OO() && (userInfoOooO00o11 = o000O00.OooO00o(msg.getFromId())) != null) {
                                String strOooO0O10 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o11.getUserName());
                                Intent intent11 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                                intent11.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                                OooO0O0(intent11, strOooO0O10, OooOo.OooO00o(OooOOO.OooO0OO(R.string.XXX_shared_a_topic_with_you), strOooO0O10));
                            }
                            OooO0o0(msg, from11.getMsg());
                        }
                        break;
                    default:
                        switch (head) {
                            case 2127:
                                o0O00000.OooO0o0("Message_receive_success", String.valueOf(oo000o.OooO0O0()));
                                MessageIM.ReceiveActivity2127 from12 = MessageIM.ReceiveActivity2127.parseFrom(msg.getBody());
                                if (from12 == null) {
                                    return;
                                }
                                Intrinsics.checkNotNullExpressionValue(from12, "MessageIM.ReceiveActivit…parseFrom(body) ?: return");
                                p520o0o0O0O0.OooOOO oooOOO13 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                                long fromId12 = msg.getFromId();
                                String image4 = from12.getImage();
                                Intrinsics.checkNotNullExpressionValue(image4, "activityMsg.image");
                                String txt1 = from12.getTxt1();
                                Intrinsics.checkNotNullExpressionValue(txt1, "activityMsg.txt1");
                                String txt2 = from12.getTxt2();
                                Intrinsics.checkNotNullExpressionValue(txt2, "activityMsg.txt2");
                                String url2 = from12.getUrl();
                                Intrinsics.checkNotNullExpressionValue(url2, "activityMsg.url");
                                String msg6 = from12.getMsg();
                                Intrinsics.checkNotNullExpressionValue(msg6, "activityMsg.msg");
                                String mid12 = msg.getMid();
                                Intrinsics.checkNotNullExpressionValue(mid12, "mid");
                                oooOOO13.OooO0oO(oooOOO13.OooOO0o(fromId12, image4, txt1, txt2, url2, msg6, mid12, msg.getTime(), true));
                                if (OooO0OO() && (userInfoOooO00o12 = o000O00.OooO00o(msg.getFromId())) != null) {
                                    String strOooO0O11 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o12.getUserName());
                                    Intent intent12 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                                    intent12.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                                    OooO0O0(intent12, strOooO0O11, OooOo.OooO00o(OooOOO.OooO0OO(R.string.message_XX_shared_a_activity_with_you), strOooO0O11));
                                }
                                OooO0o0(msg, from12.getMsg());
                                return;
                            case 2128:
                                MessageIM.Message2128 from13 = MessageIM.Message2128.parseFrom(msg.getBody());
                                if (from13 != null) {
                                    Intrinsics.checkNotNullExpressionValue(from13, "MessageIM.Message2128.parseFrom(body) ?: return");
                                    p520o0o0O0O0.OooOOO oooOOO14 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                                    String mid13 = msg.getMid();
                                    Intrinsics.checkNotNullExpressionValue(mid13, "mid");
                                    long fromId13 = msg.getFromId();
                                    long time = msg.getTime();
                                    String backgroundName = from13.getBackgroundName();
                                    Intrinsics.checkNotNullExpressionValue(backgroundName, "getRoomThemeMsg.backgroundName");
                                    String backgroundImgUrl = from13.getBackgroundImgUrl();
                                    Intrinsics.checkNotNullExpressionValue(backgroundImgUrl, "getRoomThemeMsg.backgroundImgUrl");
                                    String videoUrl = from13.getDynamicUrl();
                                    Intrinsics.checkNotNullExpressionValue(videoUrl, "getRoomThemeMsg.dynamicUrl");
                                    int dayLimit = from13.getDayLimit();
                                    long expireTm = from13.getExpireTm();
                                    long giveId = from13.getGiveId();
                                    Intrinsics.checkNotNullParameter(mid13, "mid");
                                    Intrinsics.checkNotNullParameter(backgroundName, "backgroundName");
                                    Intrinsics.checkNotNullParameter(backgroundImgUrl, "backgroundImgUrl");
                                    Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
                                    ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = new ChatMessage.GiveRoomThemeInfo();
                                    giveRoomThemeInfo.setThemeBgImgUrl(backgroundImgUrl);
                                    giveRoomThemeInfo.setThemeBgName(backgroundName);
                                    giveRoomThemeInfo.setThemeVideoUrl(videoUrl);
                                    giveRoomThemeInfo.setThemeDayLimit(dayLimit);
                                    giveRoomThemeInfo.setThemeExpireTime(expireTm);
                                    giveRoomThemeInfo.setThemeGiveId(giveId);
                                    giveRoomThemeInfo.setThemeState(ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeNotReceive.getValue());
                                    ChatMessage chatMessageOooO0O0 = oooOOO14.OooO0O0(mid13, fromId13, time, true);
                                    chatMessageOooO0O0.setGiveRoomThemeInfo(giveRoomThemeInfo);
                                    chatMessageOooO0O0.setContentType(11);
                                    p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
                                    oooOOO14.OooO0oO(chatMessageOooO0O0);
                                    if (!OooO0OO() || (userInfoOooO00o13 = o000O00.OooO00o(msg.getFromId())) == null) {
                                        oooOO0O = this;
                                    } else {
                                        String strOooO0O12 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o13.getUserName());
                                        Intent intent13 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                                        intent13.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                                        oooOO0O = this;
                                        oooOO0O.OooO0O0(intent13, strOooO0O12, OooOo.OooO00o(OooOOO.OooO0OO(R.string.message_XX_shared_a_activity_with_you), strOooO0O12));
                                    }
                                    oooOO0O.OooO0o0(msg, from13.getMsg());
                                    return;
                                }
                                break;
                            case 2129:
                                MessageIM.Message2129 from14 = MessageIM.Message2129.parseFrom(msg.getBody());
                                if (from14 != null) {
                                    Intrinsics.checkNotNullExpressionValue(from14, "MessageIM.Message2129.parseFrom(body) ?: return");
                                    p520o0o0O0O0.OooOOO oooOOO15 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                                    long fromId14 = msg.getFromId();
                                    long eventId = from14.getEventId();
                                    String eventName = from14.getEventName();
                                    Intrinsics.checkNotNullExpressionValue(eventName, "eventRoomMsg.eventName");
                                    String pic = from14.getPic();
                                    Intrinsics.checkNotNullExpressionValue(pic, "eventRoomMsg.pic");
                                    int keyWord = from14.getKeyWord();
                                    long startTime = from14.getStartTime();
                                    long endTime = from14.getEndTime();
                                    long roomId = from14.getRoomId();
                                    String roomName = from14.getRoomName();
                                    Intrinsics.checkNotNullExpressionValue(roomName, "eventRoomMsg.roomName");
                                    String roomIp2 = from14.getRoomIp();
                                    Intrinsics.checkNotNullExpressionValue(roomIp2, "eventRoomMsg.roomIp");
                                    String mid14 = msg.getMid();
                                    Intrinsics.checkNotNullExpressionValue(mid14, "mid");
                                    oooOOO15.OooO0oO(oooOOO15.OooOOO(fromId14, eventId, eventName, pic, keyWord, startTime, endTime, roomId, roomName, roomIp2, mid14, msg.getTime(), true));
                                    if (OooO0OO() && (userInfoOooO00o14 = o000O00.OooO00o(msg.getFromId())) != null) {
                                        String strOooO0O13 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o14.getUserName());
                                        Intent intent14 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                                        intent14.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                                        OooO0O0(intent14, strOooO0O13, OooOo.OooO00o(OooOOO.OooO0OO(R.string.message_you_accept_xx_share_event), strOooO0O13));
                                    }
                                }
                                break;
                            default:
                                if (msg.getFromId() <= 0) {
                                    return;
                                }
                                String messageContent = Base64.encodeToString(msg.toByteArray(), 0);
                                p520o0o0O0O0.OooOOO oooOOO16 = p520o0o0O0O0.OooOOO.f42227OooO00o;
                                long fromId15 = msg.getFromId();
                                Intrinsics.checkNotNullExpressionValue(messageContent, "content");
                                String mid15 = msg.getMid();
                                Intrinsics.checkNotNullExpressionValue(mid15, "message.mid");
                                long time2 = msg.getTime();
                                Intrinsics.checkNotNullParameter(messageContent, "messageContent");
                                Intrinsics.checkNotNullParameter(mid15, "mid");
                                ChatMessage chatMessageOooO0O1 = oooOOO16.OooO0O0(mid15, fromId15, time2, true);
                                chatMessageOooO0O1.setContentType(100);
                                chatMessageOooO0O1.setUnknownMessage(messageContent);
                                p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O1);
                                oooOOO16.OooO0oO(chatMessageOooO0O1);
                                if (!OooO0OO() || (userInfoOooO00o15 = o000O00.OooO00o(msg.getFromId())) == null) {
                                    return;
                                }
                                String strOooO0O14 = o00O0O.f42677OooO00o.OooO0O0(msg.getFromId(), userInfoOooO00o15.getUserName());
                                Intent intent15 = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
                                intent15.putExtra(o00OOOO0.OooO00o.f31680OooO00o, msg.getFromId());
                                OooO0O0(intent15, strOooO0O14, chatMessageOooO0O1.getMessage());
                                return;
                        }
                        break;
                }
            }
        }
    }

    public final void OooO0o0(MessageIM.Message message, String str) {
        UserInfo userInfoOooO00o;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        p520o0o0O0O0.OooOOO.f42227OooO00o.OooO0oO(p520o0o0O0O0.OooOOO.f42227OooO00o.OooOo0o(message.getFromId(), str, (60 & 4) != 0 ? "" : o0OoOo0.f43133OooO00o.OooO00o(Long.valueOf(message.getFromId())), (60 & 8) != 0 ? 0L : message.getTime() + 1, (60 & 16) != 0 ? false : true, false));
        if (!OooO0OO() || (userInfoOooO00o = o000O00.OooO00o(message.getFromId())) == null) {
            return;
        }
        String strOooO0O0 = o00O0O.f42677OooO00o.OooO0O0(message.getFromId(), userInfoOooO00o.getUserName());
        Intent intent = new Intent(App.f11458Oooo0oO, (Class<?>) PrivateChatActivity.class);
        intent.putExtra(o00OOOO0.OooO00o.f31680OooO00o, message.getFromId());
        OooOO0 oooOO1 = OooOO0.f40347OooO00o;
        OooO0O0(intent, strOooO0O0, OooOO0.OooO00o(str));
    }
}
