package o0o0000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0OoOo0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.moment.MomentToShareFriend;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p028Oooo0oO.o0o0Oo;
import p365o0OOo0Oo.OooOo;
import p365o0OOo0Oo.Oooo000;
import p385o0OOooOO.oOO00O;
import p406o0Oo0Ooo.oOO0O000;
import p406o0Oo0Ooo.oOO0O0O;
import p408o0Oo0o0O.o00Oo0;
import p464o0Oooo.o000000O;
import p472o0Ooooo0.oO0000o0;
import p567o0oOo0o0.o00000O;
import p579o0oOoo.oOO0O0;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nIMChatMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMChatMsgProcessor.kt\ncom/yalla/yalla/service/im/processor/IMChatMsgProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,581:1\n1855#2,2:582\n*S KotlinDebug\n*F\n+ 1 IMChatMsgProcessor.kt\ncom/yalla/yalla/service/im/processor/IMChatMsgProcessor\n*L\n501#1:582,2\n*E\n"})
public final class OooO0O0 extends OooOO0O {
    public static void OooO0O0(Intent intent, String str, String str2) {
        PendingIntent activity = PendingIntent.getActivity(App.f22702OooO0o, 1807201968, intent, 335544320);
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.notification_new_message);
        Notification.Builder builderOooO00o = oOO0O0.OooO00o();
        builderOooO00o.setContentTitle(str).setContentText(str2).setTicker(strOooO0OO).setDefaults(2).setSmallIcon(oOo00OO0.icon_notification_small).setLargeIcon(BitmapFactory.decodeResource(App.f22702OooO0o.getResources(), oOo00OO0.ic_logo)).setAutoCancel(true).setOngoing(false).setPriority(1).setContentIntent(activity);
        App.f22704OooO0oO.post(new o0o0Oo(1, "Yalla_Notice_PriveteChat", builderOooO00o));
    }

    public final boolean OooO0OO() {
        return (OooOO0O.OooO00o() || !o00Oo0.OooOO0o().OooOOO0() || (com.code.android.util.OooO0O0.OooO0O0() instanceof PrivateChatActivity)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0Oo(@NotNull MessageIM.Message msg, boolean z) throws InvalidProtocolBufferException {
        Intrinsics.checkNotNullParameter(msg, "msg");
        p592o0oo00O.OooOOO0.OooO0OO("ChatMsgProcessor", "message = " + msg);
        long fromId = msg.getFromId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if ((l != null && fromId == l.longValue()) || com.code.android.util.OooOo00.OooO00o(msg.getMid())) {
            return;
        }
        if (!(o000OOo.OooO00o().OooOOOo().OooO0o(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), msg.getMid()) != null) || z) {
            int head = msg.getHead();
            if (head == 1504) {
                MessageIM.Message1504 from = MessageIM.Message1504.parseFrom(msg.getBody());
                if (from == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(from, "MessageIM.Message1504.parseFrom(body) ?: return");
                String mid = from.getMid();
                Intrinsics.checkNotNullExpressionValue(mid, "acceptThemeMsg.mid");
                oOO0O000.OooO0oO(oOO0O000.OooO0o(mid, true));
                if (OooO0OO()) {
                    UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
                    long fromId2 = msg.getFromId();
                    userInfoRepo.getClass();
                    UserInfo userInfoOooO0Oo = UserInfoRepo.OooO0Oo(fromId2);
                    if (userInfoOooO0Oo != null) {
                        String strOooO0O0 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo.getUserName());
                        Intent intent = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                        intent.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                        MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
                        OooO0O0(intent, strOooO0O0, Oooo000.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.message_give_theme_successful), strOooO0O0)));
                        return;
                    }
                    return;
                }
                return;
            }
            if (head == 2103) {
                o0OO000.OooO0O0("204012", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                MessageIM.Message2103 from2 = MessageIM.Message2103.parseFrom(msg.getBody());
                if (from2 == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(from2, "MessageIM.Message2103.parseFrom(body) ?: return");
                msg.getBody().toStringUtf8();
                long fromId3 = msg.getFromId();
                String content = from2.getContent();
                Intrinsics.checkNotNullExpressionValue(content, "textMsg.content");
                String mid2 = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid2, "mid");
                oOO0O000.OooO0oO(oOO0O000.OooOo0o(fromId3, content, mid2, msg.getTime(), true, from2.getWarn() == 1));
                if (OooO0OO()) {
                    UserInfoRepo userInfoRepo2 = UserInfoRepo.f23204OooO00o;
                    long fromId4 = msg.getFromId();
                    userInfoRepo2.getClass();
                    UserInfo userInfoOooO0Oo2 = UserInfoRepo.OooO0Oo(fromId4);
                    if (userInfoOooO0Oo2 != null) {
                        String strOooO0O1 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo2.getUserName());
                        Intent intent2 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                        intent2.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                        MutableLiveData<List<OooOo>> mutableLiveData2 = Oooo000.f43954OooO00o;
                        String content2 = from2.getContent();
                        Intrinsics.checkNotNullExpressionValue(content2, "textMsg.content");
                        OooO0O0(intent2, strOooO0O1, Oooo000.OooO00o(content2));
                        return;
                    }
                    return;
                }
                return;
            }
            if (head == 2105) {
                o0OO000.OooO0O0("204012", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                MessageIM.Message2105 from3 = MessageIM.Message2105.parseFrom(msg.getBody());
                if (from3 == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(from3, "MessageIM.Message2105.parseFrom(body) ?: return");
                long fromId5 = msg.getFromId();
                int giftId = from3.getGiftId();
                int number = from3.getNumber();
                String giftURL = from3.getGiftURL();
                Intrinsics.checkNotNullExpressionValue(giftURL, "giftMsg.giftURL");
                String mid3 = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid3, "mid");
                ChatMessage chatMessageOooOO0O = oOO0O000.OooOO0O(fromId5, giftId, number, giftURL, mid3, msg.getTime(), true, false, false, false, false, 1920);
                oOO0O000.OooO0oO(chatMessageOooOO0O);
                if (OooO0OO()) {
                    UserInfoRepo userInfoRepo3 = UserInfoRepo.f23204OooO00o;
                    long fromId6 = msg.getFromId();
                    userInfoRepo3.getClass();
                    UserInfo userInfoOooO0Oo3 = UserInfoRepo.OooO0Oo(fromId6);
                    if (userInfoOooO0Oo3 != null) {
                        String strOooO0O2 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo3.getUserName());
                        Intent intent3 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                        intent3.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData3 = oOO00O.f44351OooO00o;
                        GiftPropModel giftPropModelOooO0O0 = oOO00O.OooO0O0(from3.getGiftId());
                        OooO0O0(intent3, strOooO0O2, chatMessageOooOO0O.getGifInfo() != null ? String.valueOf(giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getName() : null) : o0000.OooO0OO(oO00OOo0.notification_default_gift));
                        return;
                    }
                    return;
                }
                return;
            }
            if (head == 2109) {
                o0OO000.OooO0O0("204012", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                MessageIM.Message2109 from4 = MessageIM.Message2109.parseFrom(msg.getBody());
                if (from4 == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(from4, "MessageIM.Message2109.pa…m(message.body) ?: return");
                long fromId7 = msg.getFromId();
                long duration = from4.getDuration();
                String url = from4.getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "voiceMsg.url");
                String mid4 = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid4, "mid");
                oOO0O000.OooO0oO(oOO0O000.OooOoO0(fromId7, duration, "", url, mid4, msg.getTime(), true));
                if (OooO0OO()) {
                    UserInfoRepo userInfoRepo4 = UserInfoRepo.f23204OooO00o;
                    long fromId8 = msg.getFromId();
                    userInfoRepo4.getClass();
                    UserInfo userInfoOooO0Oo4 = UserInfoRepo.OooO0Oo(fromId8);
                    if (userInfoOooO0Oo4 != null) {
                        String strOooO0O3 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo4.getUserName());
                        Intent intent4 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                        intent4.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                        OooO0O0(intent4, strOooO0O3, o0000.OooO0OO(oO00OOo0.voice_notice));
                        return;
                    }
                    return;
                }
                return;
            }
            if (head == 2115) {
                o0OO000.OooO0O0("204012", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                MessageIM.Message2115 from5 = MessageIM.Message2115.parseFrom(msg.getBody());
                if (from5 == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(from5, "MessageIM.Message2115.parseFrom(body) ?: return");
                long fromId9 = msg.getFromId();
                int type = from5.getType();
                int number2 = from5.getNumber();
                String mid5 = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid5, "mid");
                ChatMessage chatMessage = oOO0O000.OooO0oo(fromId9, type, number2, mid5, msg.getTime(), true);
                Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
                o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessage);
                oOO0O000.OooO0oO(chatMessage);
                if (OooO0OO()) {
                    UserInfoRepo userInfoRepo5 = UserInfoRepo.f23204OooO00o;
                    long fromId10 = msg.getFromId();
                    userInfoRepo5.getClass();
                    UserInfo userInfoOooO0Oo5 = UserInfoRepo.OooO0Oo(fromId10);
                    if (userInfoOooO0Oo5 != null) {
                        String strOooO0O4 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo5.getUserName());
                        Intent intent5 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                        intent5.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                        OooO0O0(intent5, strOooO0O4, o0000.OooO0OO(oO00OOo0.Stickers));
                        return;
                    }
                    return;
                }
                return;
            }
            if (head == 2124) {
                o0OO000.OooO0O0("204012", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                MessageIM.Message2124 from6 = MessageIM.Message2124.parseFrom(msg.getBody());
                if (from6 == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(from6, "MessageIM.Message2124.parseFrom(body) ?: return");
                long fromId11 = msg.getFromId();
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
                oOO0O000.OooO0oO(oOO0O000.OooOo0(fromId11, userId, prettyID, nickName, photo, msg2, mid6, msg.getTime(), true));
                if (OooO0OO()) {
                    UserInfoRepo userInfoRepo6 = UserInfoRepo.f23204OooO00o;
                    long fromId12 = msg.getFromId();
                    userInfoRepo6.getClass();
                    UserInfo userInfoOooO0Oo6 = UserInfoRepo.OooO0Oo(fromId12);
                    if (userInfoOooO0Oo6 != null) {
                        String strOooO0O5 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo6.getUserName());
                        Intent intent6 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                        intent6.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                        OooO0O0(intent6, strOooO0O5, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.XXX_shared_a_user_with_you), strOooO0O5));
                    }
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
                        long fromId13 = msg.getFromId();
                        int iOooO0oO = o0OoOo0.OooO0oO(Long.valueOf(giftIdUrl.getGiftId()));
                        String giftUrl = giftIdUrl.getGiftUrl();
                        Intrinsics.checkNotNullExpressionValue(giftUrl, "gift.giftUrl");
                        String mid7 = msg.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid7, "mid");
                        ChatMessage chatMessageOooOO0O2 = oOO0O000.OooOO0O(fromId13, iOooO0oO, 1, giftUrl, mid7, msg.getTime(), true, false, false, false, false, 1920);
                        oOO0O000.OooO0oO(chatMessageOooOO0O2);
                        if (OooO0OO()) {
                            UserInfoRepo userInfoRepo7 = UserInfoRepo.f23204OooO00o;
                            long fromId14 = msg.getFromId();
                            userInfoRepo7.getClass();
                            UserInfo userInfoOooO0Oo7 = UserInfoRepo.OooO0Oo(fromId14);
                            if (userInfoOooO0Oo7 != null) {
                                String strOooO0O6 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo7.getUserName());
                                Intent intent7 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                                intent7.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData4 = oOO00O.f44351OooO00o;
                                GiftPropModel giftPropModelOooO0O1 = oOO00O.OooO0O0(o0OoOo0.OooO0oO(Long.valueOf(giftIdUrl.getGiftId())));
                                OooO0O0(intent7, strOooO0O6, chatMessageOooOO0O2.getGifInfo() != null ? String.valueOf(giftPropModelOooO0O1 != null ? giftPropModelOooO0O1.getName() : null) : o0000.OooO0OO(oO00OOo0.notification_default_gift));
                            }
                        }
                    }
                    return;
                }
                return;
            }
            switch (head) {
                case 2119:
                    o0OO000.OooO0O0("204012", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                    MessageIM.Message2119 from8 = MessageIM.Message2119.parseFrom(msg.getBody());
                    if (from8 != null) {
                        Intrinsics.checkNotNullExpressionValue(from8, "MessageIM.Message2119.parseFrom(body) ?: return");
                        long fromId15 = msg.getFromId();
                        int gifid = from8.getGifid();
                        String gifurl = from8.getGifurl();
                        Intrinsics.checkNotNullExpressionValue(gifurl, "gifMsg.gifurl");
                        String mid8 = msg.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid8, "mid");
                        oOO0O000.OooO0oO(oOO0O000.OooO(gifid, fromId15, msg.getTime(), gifurl, mid8, true));
                        if (OooO0OO()) {
                            UserInfoRepo userInfoRepo8 = UserInfoRepo.f23204OooO00o;
                            long fromId16 = msg.getFromId();
                            userInfoRepo8.getClass();
                            UserInfo userInfoOooO0Oo8 = UserInfoRepo.OooO0Oo(fromId16);
                            if (userInfoOooO0Oo8 != null) {
                                String strOooO0O7 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo8.getUserName());
                                Intent intent8 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                                intent8.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                                OooO0O0(intent8, strOooO0O7, o0000.OooO0OO(oO00OOo0.Stickers));
                            }
                        }
                    }
                    break;
                case 2120:
                    o0OO000.OooO0O0("204012", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                    MessageIM.Message2120 from9 = MessageIM.Message2120.parseFrom(msg.getBody());
                    if (from9 != null) {
                        Intrinsics.checkNotNullExpressionValue(from9, "MessageIM.Message2120.parseFrom(body) ?: return");
                        long fromId17 = msg.getFromId();
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
                        oOO0O000.OooO0oO(oOO0O000.OooOOo0(fromId17, i64RoomId, i64RoomIdx, name, image, roomIp, msg3, mid9, msg.getTime(), true));
                        if (OooO0OO()) {
                            UserInfoRepo userInfoRepo9 = UserInfoRepo.f23204OooO00o;
                            long fromId18 = msg.getFromId();
                            userInfoRepo9.getClass();
                            UserInfo userInfoOooO0Oo9 = UserInfoRepo.OooO0Oo(fromId18);
                            if (userInfoOooO0Oo9 != null) {
                                String strOooO0O8 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo9.getUserName());
                                Intent intent9 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                                intent9.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                                OooO0O0(intent9, strOooO0O8, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.recommend_room_to_you), strOooO0O8));
                            }
                        }
                        OooO0o0(msg, from9.getMsg());
                    }
                    break;
                case 2121:
                    o0OO000.OooO0O0("204012", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                    MessageIM.Message2121 from10 = MessageIM.Message2121.parseFrom(msg.getBody());
                    if (from10 != null) {
                        Intrinsics.checkNotNullExpressionValue(from10, "MessageIM.Message2121.parseFrom(body) ?: return");
                        long fromId19 = msg.getFromId();
                        long momentId64 = from10.getMomentId64();
                        String image2 = from10.getImage();
                        Intrinsics.checkNotNullExpressionValue(image2, "momentMsg.image");
                        String text = from10.getText();
                        Intrinsics.checkNotNullExpressionValue(text, "momentMsg.text");
                        int type2 = from10.getType();
                        String msg4 = from10.getMsg();
                        Intrinsics.checkNotNullExpressionValue(msg4, "momentMsg.msg");
                        String mid10 = msg.getMid();
                        Intrinsics.checkNotNullExpressionValue(mid10, "mid");
                        oOO0O000.OooO0oO(oOO0O000.OooOOOO(fromId19, momentId64, image2, text, type2, msg4, mid10, msg.getTime(), true));
                        if (OooO0OO()) {
                            UserInfoRepo userInfoRepo10 = UserInfoRepo.f23204OooO00o;
                            long fromId20 = msg.getFromId();
                            userInfoRepo10.getClass();
                            UserInfo userInfoOooO0Oo10 = UserInfoRepo.OooO0Oo(fromId20);
                            if (userInfoOooO0Oo10 != null) {
                                String strOooO0O9 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo10.getUserName());
                                Intent intent10 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                                intent10.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                                OooO0O0(intent10, strOooO0O9, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.XXX_shared_a_post_with_you), strOooO0O9));
                                if (from10.getType() == MomentToShareFriend.Poll.getValue()) {
                                    OooO0O0(intent10, strOooO0O9, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.moment_poll_share_from_user), strOooO0O9));
                                }
                            }
                        }
                        OooO0o0(msg, from10.getMsg());
                    }
                    break;
                case 2122:
                    o0OO000.OooO0O0("204012", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                    MessageIM.Message2122 from11 = MessageIM.Message2122.parseFrom(msg.getBody());
                    if (from11 != null) {
                        Intrinsics.checkNotNullExpressionValue(from11, "MessageIM.Message2122.parseFrom(body) ?: return");
                        long fromId21 = msg.getFromId();
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
                        oOO0O000.OooO0oO(oOO0O000.OooOOoo(fromId21, image3, name2, userCount, msg5, true, momentCount, mid11, circleId, msg.getTime()));
                        if (OooO0OO()) {
                            UserInfoRepo userInfoRepo11 = UserInfoRepo.f23204OooO00o;
                            long fromId22 = msg.getFromId();
                            userInfoRepo11.getClass();
                            UserInfo userInfoOooO0Oo11 = UserInfoRepo.OooO0Oo(fromId22);
                            if (userInfoOooO0Oo11 != null) {
                                String strOooO0O10 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo11.getUserName());
                                Intent intent11 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                                intent11.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                                OooO0O0(intent11, strOooO0O10, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.XXX_shared_a_topic_with_you), strOooO0O10));
                            }
                        }
                        OooO0o0(msg, from11.getMsg());
                    }
                    break;
                default:
                    switch (head) {
                        case 2127:
                            o0OO000.OooO0O0("204012", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                            MessageIM.ReceiveActivity2127 from12 = MessageIM.ReceiveActivity2127.parseFrom(msg.getBody());
                            if (from12 == null) {
                                return;
                            }
                            Intrinsics.checkNotNullExpressionValue(from12, "MessageIM.ReceiveActivit…parseFrom(body) ?: return");
                            long fromId23 = msg.getFromId();
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
                            oOO0O000.OooO0oO(oOO0O000.OooOO0o(fromId23, image4, txt1, txt2, url2, msg6, mid12, msg.getTime(), true));
                            if (OooO0OO()) {
                                UserInfoRepo userInfoRepo12 = UserInfoRepo.f23204OooO00o;
                                long fromId24 = msg.getFromId();
                                userInfoRepo12.getClass();
                                UserInfo userInfoOooO0Oo12 = UserInfoRepo.OooO0Oo(fromId24);
                                if (userInfoOooO0Oo12 != null) {
                                    String strOooO0O11 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo12.getUserName());
                                    Intent intent12 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                                    intent12.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                                    OooO0O0(intent12, strOooO0O11, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.message_XX_shared_a_activity_with_you), strOooO0O11));
                                }
                            }
                            OooO0o0(msg, from12.getMsg());
                            return;
                        case 2128:
                            MessageIM.Message2128 from13 = MessageIM.Message2128.parseFrom(msg.getBody());
                            if (from13 != null) {
                                Intrinsics.checkNotNullExpressionValue(from13, "MessageIM.Message2128.parseFrom(body) ?: return");
                                String mid13 = msg.getMid();
                                Intrinsics.checkNotNullExpressionValue(mid13, "mid");
                                long fromId25 = msg.getFromId();
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
                                ChatMessage chatMessageOooO0O0 = oOO0O000.OooO0O0(fromId25, time, mid13, true);
                                chatMessageOooO0O0.setGiveRoomThemeInfo(giveRoomThemeInfo);
                                chatMessageOooO0O0.setContentType(11);
                                o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
                                oOO0O000.OooO0oO(chatMessageOooO0O0);
                                if (OooO0OO()) {
                                    UserInfoRepo userInfoRepo13 = UserInfoRepo.f23204OooO00o;
                                    long fromId26 = msg.getFromId();
                                    userInfoRepo13.getClass();
                                    UserInfo userInfoOooO0Oo13 = UserInfoRepo.OooO0Oo(fromId26);
                                    if (userInfoOooO0Oo13 != null) {
                                        String strOooO0O12 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo13.getUserName());
                                        Intent intent13 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                                        intent13.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                                        OooO0O0(intent13, strOooO0O12, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.message_XX_shared_a_activity_with_you), strOooO0O12));
                                    }
                                }
                                OooO0o0(msg, from13.getMsg());
                                return;
                            }
                            break;
                        case 2129:
                            MessageIM.Message2129 from14 = MessageIM.Message2129.parseFrom(msg.getBody());
                            if (from14 != null) {
                                Intrinsics.checkNotNullExpressionValue(from14, "MessageIM.Message2129.parseFrom(body) ?: return");
                                long fromId27 = msg.getFromId();
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
                                oOO0O000.OooO0oO(oOO0O000.OooOOO(fromId27, eventId, eventName, pic, keyWord, startTime, endTime, roomId, roomName, roomIp2, mid14, msg.getTime(), true));
                                if (OooO0OO()) {
                                    UserInfoRepo userInfoRepo14 = UserInfoRepo.f23204OooO00o;
                                    long fromId28 = msg.getFromId();
                                    userInfoRepo14.getClass();
                                    UserInfo userInfoOooO0Oo14 = UserInfoRepo.OooO0Oo(fromId28);
                                    if (userInfoOooO0Oo14 != null) {
                                        String strOooO0O13 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo14.getUserName());
                                        Intent intent14 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                                        intent14.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                                        OooO0O0(intent14, strOooO0O13, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.message_you_accept_xx_share_event), strOooO0O13));
                                    }
                                }
                            }
                            break;
                        default:
                            if (msg.getFromId() <= 0) {
                                return;
                            }
                            String messageContent = Base64.encodeToString(msg.toByteArray(), 0);
                            long fromId29 = msg.getFromId();
                            Intrinsics.checkNotNullExpressionValue(messageContent, "content");
                            String mid15 = msg.getMid();
                            Intrinsics.checkNotNullExpressionValue(mid15, "message.mid");
                            long time2 = msg.getTime();
                            Intrinsics.checkNotNullParameter(messageContent, "messageContent");
                            Intrinsics.checkNotNullParameter(mid15, "mid");
                            ChatMessage chatMessageOooO0O1 = oOO0O000.OooO0O0(fromId29, time2, mid15, true);
                            chatMessageOooO0O1.setContentType(100);
                            chatMessageOooO0O1.setUnknownMessage(messageContent);
                            o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O1);
                            oOO0O000.OooO0oO(chatMessageOooO0O1);
                            if (OooO0OO()) {
                                UserInfoRepo userInfoRepo15 = UserInfoRepo.f23204OooO00o;
                                long fromId30 = msg.getFromId();
                                userInfoRepo15.getClass();
                                UserInfo userInfoOooO0Oo15 = UserInfoRepo.OooO0Oo(fromId30);
                                if (userInfoOooO0Oo15 != null) {
                                    String strOooO0O14 = oOO0O0O.OooO0O0(msg.getFromId(), userInfoOooO0Oo15.getUserName());
                                    Intent intent15 = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                                    intent15.putExtra(o00000O.f56211OooO00o, msg.getFromId());
                                    OooO0O0(intent15, strOooO0O14, chatMessageOooO0O1.getMessage());
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                    break;
            }
        }
    }

    public final void OooO0o0(MessageIM.Message message, String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        oOO0O000.OooO0oO(oOO0O000.OooOo(message.getFromId(), str, oO0000o0.f47205OooO00o.OooO00o(Long.valueOf(message.getFromId())), message.getTime() + 1, true, 32));
        if (OooO0OO()) {
            UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
            long fromId = message.getFromId();
            userInfoRepo.getClass();
            UserInfo userInfoOooO0Oo = UserInfoRepo.OooO0Oo(fromId);
            if (userInfoOooO0Oo != null) {
                String strOooO0O0 = oOO0O0O.OooO0O0(message.getFromId(), userInfoOooO0Oo.getUserName());
                Intent intent = new Intent(App.f22702OooO0o, (Class<?>) PrivateChatActivity.class);
                intent.putExtra(o00000O.f56211OooO00o, message.getFromId());
                OooO0O0(intent, strOooO0O0, Oooo000.OooO00o(str));
            }
        }
    }
}
