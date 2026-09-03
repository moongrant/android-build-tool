package com.yalla.yalla.mixedroom;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o000O00O;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.data.constant.TurntableGameState;
import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.mixedroom.model.BroadcastNumModel;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.mixedroom.model.RoomResult;
import com.yalla.yalla.model.BecomeMmemberModel;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.CommonListResult;
import com.yalla.yalla.model.InOutRoomModel;
import com.yalla.yalla.model.MoraGiftListModel;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.RoomBroadcastModel;
import com.yalla.yalla.model.RoomBroadcastOpenNobleModel;
import com.yalla.yalla.model.RoomGiftModel;
import com.yalla.yalla.model.SilenceModel;
import com.yalla.yalla.model.SkillCardModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.gift.GiftPropTypePay;
import com.yalla.yalla.model.gift.GiftRoomAllResultModel;
import com.yalla.yalla.model.room.MicPermissionsModel;
import com.yalla.yalla.model.room.RoomChatModel;
import com.yalla.yalla.model.room.RoomOnlineContributionUpdataModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.statistical.event.RoomEventType;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import org.json.JSONObject;
import p407o0Oo0Oo.o0O0O0O;
import p414o0Oo0oO.oO000o00;
import p423o0OoO0OO.o000OOo0;
import p435o0OoOOOo.o0O0o;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOO000o;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class MixedRoomDataSource implements p394o0Oo0.OooOO0O {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static MixedRoomDataSource f22988OooOo00;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public HashMap<Long, Boolean> f22989OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public RoomConfiguration f22991OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public RoomLoginInformation f22992OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Handler f22993OooO0oO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Room.MoraStartPkRequestReply f23000OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public AbsJavaBeanApi<RoomBroadcastModel> f23001OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RoomGiftModel f23003OooOOo0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final MutableLiveData<Integer> f22994OooO0oo = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ExecutorService f22995OooOO0 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList<ChatModel> f22996OooOO0O = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f22997OooOO0o = false;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f22999OooOOO0 = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList f22998OooOOO = new ArrayList();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f23002OooOOo = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f23004OooOOoo = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p394o0Oo0.OooOOO0<MixedRoomDataSource> f22990OooO0Oo = new p394o0Oo0.OooOOO0<>(this);

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Room.NewSendBonusSubMessage f23008OooO00o;

        public OooO00o(Room.NewSendBonusSubMessage newSendBonusSubMessage) {
            this.f23008OooO00o = newSendBonusSubMessage;
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Object f23009OooO0Oo;

        public OooO0O0(Object obj) {
            this.f23009OooO0Oo = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MixedRoomDataSource mixedRoomDataSource = MixedRoomDataSource.this;
            Object obj = this.f23009OooO0Oo;
            synchronized (mixedRoomDataSource) {
                try {
                    try {
                        if (obj instanceof SilenceModel) {
                            MixedRoomDataSource.OooOOoo((SilenceModel) obj);
                        } else if (obj instanceof BecomeMmemberModel) {
                            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(((BecomeMmemberModel) obj).getUserid()));
                            if (roomUserInfoModelOooO0o0 != null) {
                                roomUserInfoModelOooO0o0.getRoomMemberType().setValue(3);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class OooO0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ com.yalla.yalla.service.room.OooO0O0 f23012OooO0o0;

        public OooO0OO(com.yalla.yalla.service.room.OooO0O0 oooO0O0) {
            this.f23012OooO0o0 = oooO0O0;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            com.yalla.yalla.service.room.OooO0O0 oooO0O0 = this.f23012OooO0o0;
            boolean zBooleanValue = oooO0O0.f24545OooOO0O.getValue().booleanValue();
            MutableLiveData<Boolean> mutableLiveData = oooO0O0.f24545OooOO0O;
            MixedRoomDataSource mixedRoomDataSource = MixedRoomDataSource.this;
            boolean z = true;
            if (zBooleanValue) {
                mutableLiveData.postValue(Boolean.FALSE);
                mixedRoomDataSource.f22991OooO0o.setIsfollow(0);
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Unfollowed);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                mutableLiveData.postValue(Boolean.TRUE);
                mixedRoomDataSource.f22991OooO0o.setIsfollow(1);
                String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Following_room_profile_toast);
                if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                    z = false;
                }
                if (!z) {
                    com.code.android.util.o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                    }
                }
            }
            LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
        }
    }

    public static void OooO0O0(Room.RoshamboModel roshamboModel) {
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o();
        ArrayList<Room.RoshamboModel> value = oooO0O0OooO00o.f24556OooOo00.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        value.add(0, roshamboModel);
        oooO0O0OooO00o.f24557OooOo0O.postValue(Integer.valueOf(value.size()));
        oooO0O0OooO00o.f24556OooOo00.postValue(value);
    }

    public static synchronized MixedRoomDataSource OooO0o0() {
        if (f22988OooOo00 == null) {
            synchronized (MixedRoomDataSource.class) {
                if (f22988OooOo00 == null) {
                    f22988OooOo00 = new MixedRoomDataSource();
                }
            }
        }
        return f22988OooOo00;
    }

    public static void OooOO0O(Room.RoshamboListReply roshamboListReply) {
        boolean z = roshamboListReply.getListkind() == 0;
        p482o0o000OO.o00oO0o o00oo0o2 = new p482o0o000OO.o00oO0o(roshamboListReply.getNumcount(), z, roshamboListReply.getMorasCount() < 10);
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        oooO00o.OooO00o().f24558OooOo0o.postValue(o00oo0o2);
        oooO00o.OooO00o().f24557OooOo0O.postValue(Integer.valueOf(roshamboListReply.getNumcount()));
        MutableLiveData<ArrayList<Room.RoshamboModel>> mutableLiveData = oooO00o.OooO00o().f24556OooOo00;
        if (z) {
            mutableLiveData.postValue(new ArrayList<>(roshamboListReply.getMorasList()));
            return;
        }
        ArrayList<Room.RoshamboModel> value = mutableLiveData.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        value.addAll(roshamboListReply.getMorasList());
        mutableLiveData.postValue(value);
    }

    public static void OooOOO0(long j) {
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o();
        Integer value = oooO0O0OooO00o.f24557OooOo0O.getValue();
        MutableLiveData<ArrayList<Room.RoshamboModel>> mutableLiveData = oooO0O0OooO00o.f24556OooOo00;
        ArrayList<Room.RoshamboModel> value2 = mutableLiveData.getValue();
        if (com.code.android.util.OooOo00.OooO0O0(value2)) {
            for (int i = 0; i < value2.size(); i++) {
                if (value2.get(i).getMorauuid() == j) {
                    value2.remove(i);
                    int iIntValue = value == null ? 0 : Integer.valueOf(value.intValue() - 1).intValue();
                    oooO0O0OooO00o.f24557OooOo0O.postValue(Integer.valueOf(iIntValue >= 0 ? iIntValue : 0));
                    break;
                }
            }
        }
        mutableLiveData.postValue(value2);
    }

    public static void OooOOoo(SilenceModel silenceModel) {
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(silenceModel.to.uid));
        if (roomUserInfoModelOooO0o0 != null) {
            roomUserInfoModelOooO0o0.getSilenced().setValue(Boolean.valueOf(silenceModel.silence));
        }
    }

    public static void OooOo00(RoomGiftModel roomGiftModel, int i) {
        if (roomGiftModel == null) {
            return;
        }
        if (roomGiftModel.getNewFrom() != null) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (o0O00oO0.OooOOo0().getValue() == roomGiftModel.getNewFrom().getUserId().getValue()) {
                if (i == GiftPropTypePay.Coin.getValue()) {
                    o0O00oO0.OooO0O0().postValue(Long.valueOf(roomGiftModel.getCoin()));
                    return;
                } else {
                    o0O00oO0.OooO0Oo().postValue(Long.valueOf(roomGiftModel.getCrystal()));
                    return;
                }
            }
        }
        if (roomGiftModel.getNewTo() != null) {
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            if (o0O00oO0.OooOOo0().getValue() == roomGiftModel.getNewTo().getUserId().getValue()) {
                if (i == GiftPropTypePay.Coin.getValue()) {
                    o0O00oO0.OooO0O0().postValue(Long.valueOf(roomGiftModel.getCoin()));
                } else if (roomGiftModel.getType() == 6 || roomGiftModel.getType() == 7) {
                    o0O00oO0.OooO0Oo().postValue(Long.valueOf(roomGiftModel.getCrystal()));
                }
            }
        }
    }

    public static void OooOo0O(long j, boolean z, int i, int i2) {
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        Integer value = oooO00o.OooO00o().OooO0o().getValue();
        Integer value2 = oooO00o.OooO00o().OooO0oo().getValue();
        Long value3 = oooO00o.OooO00o().OooO0oO().getValue();
        Boolean value4 = oooO00o.OooO00o().OooO().getValue();
        if (value != null && value.intValue() != i) {
            oooO00o.OooO00o().OooO0o().postValue(Integer.valueOf(i));
        }
        if (value2 != null && value2.intValue() != i2) {
            oooO00o.OooO00o().OooO0oo().postValue(Integer.valueOf(i2));
        }
        if (value3 != null && value3.longValue() != j) {
            oooO00o.OooO00o().OooO0oO().postValue(Long.valueOf(j));
        }
        if (value4 == null || value4.booleanValue() == z) {
            return;
        }
        oooO00o.OooO00o().OooO().postValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:158:0x04bf A[Catch: InvalidProtocolBufferException -> 0x0a25, TryCatch #0 {InvalidProtocolBufferException -> 0x0a25, blocks: (B:3:0x0016, B:224:0x06f5, B:225:0x0710, B:227:0x0749, B:229:0x074f, B:230:0x0758, B:231:0x0785, B:233:0x078f, B:234:0x07bb, B:235:0x07c3, B:237:0x07f6, B:240:0x07ff, B:242:0x081c, B:244:0x0822, B:245:0x082b, B:247:0x0831, B:200:0x065d, B:204:0x0677, B:205:0x0680, B:207:0x06a2, B:211:0x06b4, B:213:0x06c3, B:220:0x06d3, B:222:0x06e9, B:223:0x06ee, B:188:0x05f9, B:191:0x060a, B:193:0x0614, B:194:0x0626, B:197:0x0637, B:199:0x0641, B:186:0x05c7, B:187:0x05dc, B:95:0x02eb, B:97:0x02f5, B:98:0x0300, B:100:0x0319, B:101:0x0338, B:103:0x0351, B:104:0x0375, B:107:0x0386, B:109:0x039d, B:111:0x03a3, B:112:0x03b0, B:114:0x03ba, B:116:0x03c0, B:117:0x0400, B:120:0x040b, B:122:0x0411, B:124:0x0417, B:126:0x0422, B:125:0x041d, B:128:0x0432, B:130:0x0439, B:132:0x0441, B:139:0x0450, B:141:0x0466, B:142:0x046a, B:144:0x0470, B:145:0x047b, B:147:0x0485, B:149:0x048b, B:150:0x0499, B:152:0x049f, B:154:0x04b1, B:155:0x04b5, B:156:0x04b8, B:158:0x04bf, B:159:0x04d1, B:160:0x04dc, B:162:0x04e4, B:169:0x04f4, B:171:0x050a, B:172:0x050f, B:173:0x0516, B:175:0x053c, B:177:0x0546, B:179:0x055f, B:180:0x058b, B:182:0x05a5, B:183:0x05b2, B:185:0x05b8, B:69:0x0221, B:71:0x0229, B:82:0x0257, B:78:0x0238, B:80:0x024e, B:81:0x0252, B:83:0x025f, B:86:0x026e, B:87:0x02ae, B:88:0x02c4, B:92:0x02da, B:94:0x02e6, B:91:0x02d6, B:22:0x0057, B:24:0x005d, B:25:0x0063, B:27:0x0069, B:29:0x0077, B:31:0x0087, B:32:0x0092, B:33:0x009b, B:34:0x00b4, B:36:0x00be, B:39:0x00d9, B:46:0x00e9, B:47:0x00f8, B:48:0x0120, B:50:0x0134, B:51:0x013d, B:53:0x0163, B:55:0x017c, B:56:0x01a8, B:58:0x01b2, B:60:0x01b8, B:61:0x01bd, B:63:0x01da, B:65:0x01ee, B:67:0x0203, B:68:0x0214, B:248:0x0856, B:250:0x0865, B:252:0x087f, B:253:0x0886, B:254:0x088b, B:256:0x089c, B:258:0x08b6, B:260:0x08cd, B:270:0x08f7, B:266:0x08d8, B:268:0x08ee, B:269:0x08f2, B:271:0x0902, B:272:0x097b, B:274:0x0989, B:275:0x0998, B:276:0x099e, B:279:0x09bc, B:281:0x09dd, B:283:0x09e5, B:289:0x09f0, B:291:0x0a06, B:292:0x0a0a, B:293:0x0a0f), top: B:298:0x0016 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO(Message message) {
        Room.NewSendBonusAddMessage from;
        Room.NewSendBonusSubMessage from2;
        try {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Boolean bool = (Boolean) o0O00oO0.OooOo0O().getValue();
            int i = message.what;
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
            if (i == 10059) {
                boolean z = true;
                p598o0oo00Oo.o0000O00.OooO0O0("---- 房间公告跟新----");
                String noticemsg = Room.NoticeContentChangeReply.parseFrom((byte[]) message.obj).getNoticemsg();
                RoomConfiguration roomConfigurationOooO0o = OooO0o0().OooO0o();
                if (roomConfigurationOooO0o == null) {
                    return;
                }
                oooO00o.OooO00o().OooO0Oo().postValue(null);
                com.yalla.yalla.service.room.OooO00o.OooO00o().OooO0Oo().setValue(noticemsg);
                if (oooO00o.OooO00o().OooOOO()) {
                    String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Success);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 runnable = new com.code.android.util.o000Oo0(strOooO0OO);
                        Intrinsics.checkNotNullParameter(runnable, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            runnable.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(runnable);
                        }
                    }
                }
                ChatModel chatModel = new ChatModel();
                chatModel.setType(13);
                chatModel.setMessage(noticemsg);
                OooO00o(chatModel);
                p545o0oO0O00.OooOo00.OooO0O0(33, roomConfigurationOooO0o);
                return;
            }
            if (i == 10060) {
                Room.UserInfoReply from3 = Room.UserInfoReply.parseFrom((byte[]) message.obj);
                if (from3.getCode() == 0) {
                    OooOOOO(10060, RoomUserInfoModel.INSTANCE.of(from3.getUser()));
                    return;
                } else {
                    OooOOOO(10060, null);
                    return;
                }
            }
            if (i == 10062) {
                boolean z2 = true;
                p598o0oo00Oo.o0000O00.OooO0O0("---- 发起猜拳后，收到扣钱回调----");
                Room.MoraStartUpRequestReply from4 = Room.MoraStartUpRequestReply.parseFrom((byte[]) message.obj);
                if (from4 != null) {
                    if (from4.getFromuser().getUserId() == ((Long) o0O00oO0.OooOOo0().getValue()).longValue()) {
                        o0O00oO0.OooO0O0().postValue(Long.valueOf(from4.getBalance()));
                        String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.start_mora_game_success);
                        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                            z2 = false;
                        }
                        if (!z2) {
                            com.code.android.util.o000Oo0 runnable2 = new com.code.android.util.o000Oo0(strOooO0OO2);
                            Intrinsics.checkNotNullParameter(runnable2, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                runnable2.run();
                            } else {
                                o000O00O.f13422OooO0O0.post(runnable2);
                            }
                        }
                        LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE").post(Boolean.TRUE);
                    }
                    OooOOOo(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.launch_mora), from4);
                    Room.RoshamboModel.Builder builderNewBuilder = Room.RoshamboModel.newBuilder();
                    builderNewBuilder.setHeadphoto(from4.getFromuser().getHeadphoto()).setMoragiftid(from4.getMoragiftid()).setGiftImage(from4.getGiftimage()).setGiftprice(from4.getGiftprice()).setMoranum(from4.getMoranum()).setMorauuid(from4.getMuuid()).setUserId(from4.getFromuser().getUserId()).setName(from4.getFromuser().getName()).setToUserId(from4.getToUserId()).setToNickname(from4.getToNickname()).setToHeadphoto(from4.getToHeadphoto());
                    OooO0O0(builderNewBuilder.build());
                    return;
                }
                return;
            }
            if (i == 10063) {
                p598o0oo00Oo.o0000O00.OooO0O0("----点击猜拳后，和别人PK的结果----");
                Room.MoraStartPkRequestReply from5 = Room.MoraStartPkRequestReply.parseFrom((byte[]) message.obj);
                if (from5 != null) {
                    if (from5.getJoinuser().getUserId() != ((Long) o0O00oO0.OooOOo0().getValue()).longValue()) {
                        OooO0oO(from5);
                        return;
                    } else {
                        OooOOOO(10063, from5);
                        this.f23000OooOOOO = from5;
                        return;
                    }
                }
                return;
            }
            switch (i) {
                case 10051:
                    p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 幸运数字 ----->" + message);
                    ChatModel chatModel2 = (ChatModel) oOOO00.OooO00o((String) message.obj, ChatModel.class);
                    if (chatModel2 != null) {
                        if (chatModel2.isMySelfMessage(((Long) o0O00oO0.OooOOo0().getValue()).longValue())) {
                            o0O00oO0.OooO0O0().postValue(Long.valueOf(chatModel2.getFromcoin()));
                            if (chatModel2.isGetLuckyNumber()) {
                                LiveEventBus.get("LuckyNumberOpenDialog").post(Integer.valueOf(chatModel2.getNumber()));
                            }
                        }
                        chatModel2.setLuckNumAnim(true);
                        chatModel2.setType(4);
                        OooO00o(chatModel2);
                    }
                    break;
                case 10054:
                    Room.UserListReply from6 = Room.UserListReply.parseFrom((byte[]) message.obj);
                    if (from6 != null && from6.getUsersList() != null) {
                        OooO0OO(from6);
                        break;
                    }
                    break;
                case 100711:
                    Room.ChangeLuckNumSetOtherReply from7 = Room.ChangeLuckNumSetOtherReply.parseFrom((byte[]) message.obj);
                    p598o0oo00Oo.o0000O00.OooO0O0("Socket----DataSource------- 幸运数字 其他人收到通知 ----->" + message.what + ", setOtherReply = ‘" + from7 + "’");
                    if (from7 != null) {
                        OooOo0O(from7.getLuckNum(), from7.getIsAdminManage(), from7.getLucknumcost(), from7.getLucknummode());
                        if (from7.getIsNewSet()) {
                            ChatModel chatModel3 = new ChatModel();
                            chatModel3.setType(34);
                            chatModel3.setLucknum(from7.getLuckNum());
                            chatModel3.setLuckSetRole(from7.getOperator().getRole());
                            chatModel3.setLuckSetRoleUserId(from7.getOperator().getUserId());
                            OooO00o(chatModel3);
                        }
                    }
                    break;
                case DurationKt.NANOS_IN_MILLIS /* 1000000 */:
                    Room.StartTurnTableMsg from8 = Room.StartTurnTableMsg.parseFrom((byte[]) message.obj);
                    if (from8 != null && from8.getRoomId() == oooO00o.OooO00o().OooO0o0().getValue().longValue()) {
                        int gameStatus = from8.getGameStatus();
                        if (gameStatus != -1) {
                            if (gameStatus == 0) {
                                Intrinsics.checkNotNullParameter("Turntable_Wait", "key");
                                Observable observable = LiveEventBus.get("roomTurntable_Wait", Object.class);
                                Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
                                observable.post(Boolean.TRUE);
                                com.yalla.yalla.service.room.OooO00o.OooO0Oo().OooO0Oo().setValue(TurntableGameState.Wait);
                            } else if (gameStatus == 1) {
                                com.yalla.yalla.service.room.OooO00o.OooO0Oo().OooO0Oo().setValue(TurntableGameState.Start);
                            } else if (gameStatus != 2) {
                            }
                        }
                        com.yalla.yalla.service.room.OooO00o.OooO0Oo().OooO0Oo().setValue(TurntableGameState.Close);
                        if (from8.getShowBox() == 1) {
                            OooOOOO(o0O0o.Other_Device_Login, null);
                        }
                        break;
                    }
                    break;
                case 1000005:
                    Room.ErrorEvent from9 = Room.ErrorEvent.parseFrom((byte[]) message.obj);
                    p484o0o000o0.o00oO0o.OooO0OO(from9.getErrcode(), from9.getPckcode(), from9.getContent());
                    break;
                case 10008010:
                    SubscribeNotifyModel subscribeNotifyModel = (SubscribeNotifyModel) message.obj;
                    if (subscribeNotifyModel != null) {
                        for (ChatModel chatModel4 : this.f22996OooOO0O) {
                            if (chatModel4.getType() == 26 && chatModel4.getEventModel().getId() == subscribeNotifyModel.getEventId()) {
                                chatModel4.getEventModel().setHasSubscribe(subscribeNotifyModel.getHasSubscribe());
                                OooOOOO(33001, null);
                                break;
                            }
                        }
                        OooOOOO(33001, null);
                    }
                    break;
                default:
                    switch (i) {
                        case 10065:
                            Room.RoshamboListReply from10 = Room.RoshamboListReply.parseFrom((byte[]) message.obj);
                            StringBuilder sb = new StringBuilder("---- 获取到猜拳游戏列表----");
                            sb.append(from10 == null ? "null " : from10.toByteString());
                            p598o0oo00Oo.o0000O00.OooO0O0(sb.toString());
                            if (from10 != null) {
                                OooOO0O(from10);
                            }
                            break;
                        case 10066:
                            Room.MagicVoiceOut from11 = Room.MagicVoiceOut.parseFrom((byte[]) message.obj);
                            OooOO0(from11);
                            p598o0oo00Oo.o0000O00.OooO0OO("MR_ProtobufMessage", from11.toString());
                            break;
                        case 10067:
                            Room.GifMoticonReply from12 = Room.GifMoticonReply.parseFrom((byte[]) message.obj);
                            if (from12.getCode() == 0) {
                                ChatModel chatModel5 = new ChatModel();
                                chatModel5.setNewFrom(RoomUserInfoModel.INSTANCE.of(from12.getSender()));
                                chatModel5.setUuid(from12.getUuid());
                                chatModel5.setType(16);
                                chatModel5.setGif(new ChatMessageOld.Gif());
                                chatModel5.getGif().gifId = (int) from12.getGifid();
                                chatModel5.getGif().gifUrl = from12.getGifurl();
                                OooO00o(chatModel5);
                                break;
                            }
                            break;
                        case 10068:
                            String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Success);
                            if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                                com.code.android.util.o000Oo0 runnable3 = new com.code.android.util.o000Oo0(strOooO0OO3);
                                Intrinsics.checkNotNullParameter(runnable3, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    runnable3.run();
                                } else {
                                    o000O00O.f13422OooO0O0.post(runnable3);
                                }
                            }
                            p545o0oO0O00.OooOo00.OooO0O0(10068, null);
                            break;
                        default:
                            switch (i) {
                                case 10070:
                                    Room.kickTouristRequestReply from13 = Room.kickTouristRequestReply.parseFrom((byte[]) message.obj);
                                    Observable<Object> observable2 = LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM");
                                    Boolean bool2 = Boolean.TRUE;
                                    observable2.post(bool2);
                                    if (from13.getKickOp() == 1) {
                                        oooO00o.OooO00o().OooO0OO().postValue(bool2);
                                    } else if (from13.getKickOp() == 2) {
                                        oooO00o.OooO00o().OooO0OO().postValue(Boolean.FALSE);
                                    }
                                    break;
                                case 10071:
                                    Room.ChangeLuckNumSetReply from14 = Room.ChangeLuckNumSetReply.parseFrom((byte[]) message.obj);
                                    p598o0oo00Oo.o0000O00.OooO0O0("Socket----DataSource------- 幸运数字 设置者收到结果 ----->" + message.what + ", reply = ‘" + from14 + "’");
                                    if (from14 != null && from14.getCode().getCode() == 0) {
                                        OooOo0O(from14.getLuckNum(), from14.getIsAdminManage(), from14.getLucknumcost(), from14.getLucknummode());
                                        if (from14.getIsNewSet()) {
                                            ChatModel chatModel6 = new ChatModel();
                                            chatModel6.setType(33);
                                            chatModel6.setLucknum(from14.getLuckNum());
                                            chatModel6.setLuckSetRole(from14.getOperator().getRole());
                                            chatModel6.setLuckSetRoleUserId(from14.getOperator().getUserId());
                                            OooO00o(chatModel6);
                                        }
                                        break;
                                    }
                                    break;
                                case 10072:
                                    Room.GetBonusReply from15 = Room.GetBonusReply.parseFrom((byte[]) message.obj);
                                    if (from15 == null || from15.getCode() != 0) {
                                        String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.wrong_parameter);
                                        if (!(strOooO0OO4 == null || StringsKt.isBlank(strOooO0OO4))) {
                                            com.code.android.util.o000Oo0 runnable4 = new com.code.android.util.o000Oo0(strOooO0OO4);
                                            Intrinsics.checkNotNullParameter(runnable4, "runnable");
                                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                runnable4.run();
                                            } else {
                                                o000O00O.f13422OooO0O0.post(runnable4);
                                            }
                                        }
                                    } else {
                                        o0oo0000.OooO00o.OooO0O0("102137");
                                        SnapshotStateList<Room.EnvelopInfo> snapshotStateListOooO0Oo = com.yalla.yalla.service.room.OooO00o.OooO0O0().OooO0Oo();
                                        for (int i2 = 0; i2 < snapshotStateListOooO0Oo.size(); i2++) {
                                            if (snapshotStateListOooO0Oo.get(i2).getBonusid() == from15.getBonusid()) {
                                                snapshotStateListOooO0Oo.remove(i2);
                                                if (from15.getState() == 1) {
                                                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                                                    o0O00oO0.OooO0O0().setValue(Long.valueOf(from15.getLastestbalance()));
                                                }
                                                LiveEventBus.get("LuckyPacket_OpenResult_Ok").post(from15);
                                            }
                                            break;
                                        }
                                        if (from15.getState() == 1) {
                                            o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                                            o0O00oO0.OooO0O0().setValue(Long.valueOf(from15.getLastestbalance()));
                                        }
                                        LiveEventBus.get("LuckyPacket_OpenResult_Ok").post(from15);
                                    }
                                    break;
                                case 10073:
                                    Room.NewSendBonusReply from16 = Room.NewSendBonusReply.parseFrom((byte[]) message.obj);
                                    if (from16 != null) {
                                        if (from16.getCode() == 0) {
                                            if (from16.getBonustype() == 2) {
                                                o0oo0000.OooO00o.OooO0O0("102135");
                                            } else {
                                                o0oo0000.OooO00o.OooO0O0("102133");
                                            }
                                            o0O00oO0.OooO0O0().postValue(Long.valueOf(from16.getLeftcoin()));
                                        } else if (from16.getCode() == 1) {
                                            String strOooO0OO5 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Operation_failed);
                                            if (!(strOooO0OO5 == null || StringsKt.isBlank(strOooO0OO5))) {
                                                com.code.android.util.o000Oo0 runnable5 = new com.code.android.util.o000Oo0(strOooO0OO5);
                                                Intrinsics.checkNotNullParameter(runnable5, "runnable");
                                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                    runnable5.run();
                                                } else {
                                                    o000O00O.f13422OooO0O0.post(runnable5);
                                                }
                                            }
                                        } else {
                                            p484o0o000o0.o00oO0o.OooO0OO(from16.getCode(), message.what, from16);
                                        }
                                        break;
                                    }
                                    break;
                                case 10074:
                                    Room.SetAutoGrabBonusReply from17 = Room.SetAutoGrabBonusReply.parseFrom((byte[]) message.obj);
                                    if (from17 != null && from17.getCode() == 0) {
                                        this.f22992OooO0o0.setAutoGrabBonus(from17.getAutotype());
                                        oO000o00 oo000o00OooO0oo = p415o0Oo0oO0.o00Ooo.OooO0oo();
                                        int autotype = from17.getAutotype();
                                        oo000o00OooO0oo.getClass();
                                        oo000o00OooO0oo.OooO0oO(autotype, "autoShowLuckyPacketDialog" + o0O00oO0.OooOOo0().getValue());
                                        LiveEventBus.get("LuckyPacket_AutoShowDialog").post(Integer.valueOf(from17.getAutotype()));
                                        break;
                                    }
                                    break;
                                case 10075:
                                    if (((Boolean) o0O00oO0.OooOo0O().getValue()).booleanValue()) {
                                        Room.GetEnvelopListReply from18 = Room.GetEnvelopListReply.parseFrom((byte[]) message.obj);
                                        ArrayList arrayList = new ArrayList(from18.getEnvelopsList());
                                        if (from18.getCode() == 0 && arrayList.size() > 0) {
                                            com.yalla.yalla.service.room.OooO00o.OooO0O0().OooO0Oo().addAll(arrayList);
                                            break;
                                        }
                                    }
                                    break;
                                case 10076:
                                    Room.GetBonusMessage from19 = Room.GetBonusMessage.parseFrom((byte[]) message.obj);
                                    p598o0oo00Oo.o0000O00.OooO0O0("Socket----DataSource------- 抢到红包聊天框消息 新红包 -----> 10076 getBonusMessage = " + from19);
                                    if (from19 != null) {
                                        RoomUserInfoModel roomUserInfoModelOf = RoomUserInfoModel.INSTANCE.of(from19.getUser());
                                        ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                                        com.yalla.yalla.service.room.OooO00o.OooO0o(roomUserInfoModelOf);
                                        ChatModel chatModel7 = new ChatModel();
                                        chatModel7.setType(17);
                                        chatModel7.setNewFrom(roomUserInfoModelOf);
                                        chatModel7.setGetBonusMessage(from19);
                                        OooO00o(chatModel7);
                                    }
                                    break;
                                case 10077:
                                    Room.SendBonusMessage from20 = Room.SendBonusMessage.parseFrom((byte[]) message.obj);
                                    p598o0oo00Oo.o0000O00.OooO0O0("Socket----DataSource------- 发红包时响应该房间内的所有人 新红包 -----> 10077 sendBonusMessage = " + from20);
                                    if (from20 != null) {
                                        RoomUserInfoModel roomUserInfoModelOf2 = RoomUserInfoModel.INSTANCE.of(from20.getUser());
                                        ChatModel chatModel8 = new ChatModel();
                                        chatModel8.setType(18);
                                        chatModel8.setNewFrom(roomUserInfoModelOf2);
                                        chatModel8.setSendBonusMessage(from20);
                                        OooO00o(chatModel8);
                                    }
                                    break;
                                case 10078:
                                    Room.BonusDetailReply from21 = Room.BonusDetailReply.parseFrom((byte[]) message.obj);
                                    if (from21 != null) {
                                        LiveEventBus.get("LuckyPacket_Detail").post(from21);
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case 100611:
                                            p598o0oo00Oo.o0000O00.OooO0O0("---- 发出邀请后返回的Code码 房主收到----");
                                            OooOOOO(100611, Integer.valueOf(Room.InviteBarMemberRequestReply.parseFrom((byte[]) message.obj).getCode()));
                                            break;
                                        case 100612:
                                            p598o0oo00Oo.o0000O00.OooO0O0("---- 发出邀请后返回的Code码 游客收到----");
                                            OooOOOO(100612, Room.InviteBarMemberToRequestReply.parseFrom((byte[]) message.obj));
                                            break;
                                        default:
                                            switch (i) {
                                                case 100731:
                                                    if (((Boolean) o0O00oO0.OooOo0O().getValue()).booleanValue() && (from = Room.NewSendBonusAddMessage.parseFrom((byte[]) message.obj)) != null) {
                                                        com.yalla.yalla.service.room.OooO00o.OooO0O0().OooO0Oo().add(from.getEnvelop());
                                                        LiveEventBus.get("LuckyPacket_AddNew").post(Boolean.TRUE);
                                                    }
                                                    break;
                                                case 100732:
                                                    if (((Boolean) o0O00oO0.OooOo0O().getValue()).booleanValue() && (from2 = Room.NewSendBonusSubMessage.parseFrom((byte[]) message.obj)) != null) {
                                                        o000OOo0.OooO0O0(com.yalla.yalla.service.room.OooO00o.OooO0O0().OooO0Oo(), new OooO00o(from2));
                                                    }
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 1000002:
                                                            Room.AllowMicRightOut from22 = Room.AllowMicRightOut.parseFrom((byte[]) message.obj);
                                                            if (from22.getRoomId() == oooO00o.OooO00o().OooO0o0().getValue().longValue()) {
                                                                oooO00o.OooO00o().OooO0O0().postValue(Boolean.valueOf(from22.getAllowMicStatus() == 1));
                                                                String strOooO0OO6 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Success);
                                                                if (!(strOooO0OO6 == null || StringsKt.isBlank(strOooO0OO6))) {
                                                                    com.code.android.util.o000Oo0 runnable6 = new com.code.android.util.o000Oo0(strOooO0OO6);
                                                                    Intrinsics.checkNotNullParameter(runnable6, "runnable");
                                                                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                                        runnable6.run();
                                                                    } else {
                                                                        o000O00O.f13422OooO0O0.post(runnable6);
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 1000003:
                                                            oooO00o.OooO00o().OooO0O0().postValue(Boolean.valueOf(Room.AllowMicRightOut.parseFrom((byte[]) message.obj).getAllowMicStatus() == 1));
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 1100000:
                                                                    Room.InitiateVoteReply from23 = Room.InitiateVoteReply.parseFrom((byte[]) message.obj);
                                                                    p598o0oo00Oo.o0000O00.OooO0O0("发起投票返回——>code=" + from23.getCode() + ",voteId=" + from23.getVoteId());
                                                                    if (from23.getVoteId() > 0 || from23.getCreateUserId() > 0) {
                                                                        RoomGameConfig.Vote vote = new RoomGameConfig.Vote();
                                                                        vote.setVoteId(from23.getVoteId());
                                                                        vote.setStatus(0);
                                                                        oooO00o.OooO00o().OooOO0().postValue(vote);
                                                                        if (bool != null && bool.booleanValue()) {
                                                                            LiveEventBus.get("INITIATE_VOTE_REQUEST").post(from23);
                                                                        }
                                                                        if (from23.getCode() == 0) {
                                                                            ChatModel chatModel9 = new ChatModel();
                                                                            chatModel9.setVoteId(from23.getVoteId());
                                                                            chatModel9.setNewFrom(RoomUserInfoModel.INSTANCE.of(from23.getCreateUserView()));
                                                                            chatModel9.setType(21);
                                                                            chatModel9.setVoteIsRunning(true);
                                                                            OooO00o(chatModel9);
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1100001:
                                                                    Room.VoteResultNotify from24 = Room.VoteResultNotify.parseFrom((byte[]) message.obj);
                                                                    p598o0oo00Oo.o0000O00.OooO0O0("结束投票返回——>voteId=" + from24.getVoteId());
                                                                    RoomGameConfig.Vote vote2 = new RoomGameConfig.Vote();
                                                                    vote2.setVoteId(from24.getVoteId());
                                                                    vote2.setStatus(10);
                                                                    oooO00o.OooO00o().OooOO0().postValue(vote2);
                                                                    if (bool != null && bool.booleanValue()) {
                                                                        LiveEventBus.get("END_UP_VOTE_GAME").post(from24);
                                                                    }
                                                                    ChatModel chatModel10 = new ChatModel();
                                                                    chatModel10.setVoteId(from24.getVoteId());
                                                                    chatModel10.setNewFrom(RoomUserInfoModel.INSTANCE.of(from24.getCreateUserView()));
                                                                    chatModel10.setType(21);
                                                                    chatModel10.setVoteIsRunning(false);
                                                                    chatModel10.setVoteGiftImage(from24.getGiftImage());
                                                                    ArrayList arrayList3 = new ArrayList();
                                                                    for (int i3 = 0; i3 < from24.getResultList().size(); i3++) {
                                                                        ChatModel.VoteResult voteResult = new ChatModel.VoteResult();
                                                                        voteResult.setNickName(from24.getResult(i3).getNickName());
                                                                        voteResult.setTotalCount(from24.getResult(i3).getTotalCount());
                                                                        voteResult.setUserId(from24.getResult(i3).getUserId());
                                                                        arrayList3.add(voteResult);
                                                                    }
                                                                    chatModel10.setVoteResultList(arrayList3);
                                                                    OooO00o(chatModel10);
                                                                    break;
                                                                case 1100002:
                                                                    LiveEventBus.get("UPDATE_VOTE_GAME").post(Long.valueOf(Room.NumOfVotesUpdateNotifyIn.parseFrom((byte[]) message.obj).getRoomId()));
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
            p598o0oo00Oo.o0000O00.OooO0Oo("Socket Error:" + e.getMessage());
        }
    }

    public final synchronized void OooO00o(ChatModel chatModel) {
        if (chatModel == null) {
            return;
        }
        if (chatModel.getNewFrom() != null && chatModel.getNewFrom().getUserId().getValue().longValue() > 0 && chatModel.getNewFrom().getUserLevel().getValue().intValue() > 0) {
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            com.yalla.yalla.service.room.OooO00o.OooO0o(chatModel.getNewFrom());
        }
        if (this.f22996OooOO0O.size() >= 300) {
            for (int i = 0; i < 100; i++) {
                this.f22996OooOO0O.remove(0);
            }
        }
        chatModel.setRoleReceiving(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o.getValue().intValue());
        chatModel.setPlayTime(System.currentTimeMillis());
        this.f22996OooOO0O.add(chatModel);
        OooOOOO(33001, null);
    }

    public final void OooO0OO(Object obj) {
        this.f22995OooOO0.submit(new OooO0O0(obj));
    }

    /* JADX WARN: Code duplicated, block: B:196:0x066b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p394o0Oo0.OooOO0O
    public final void OooO0Oo(Message message) {
        AbsJavaBeanApi<RoomBroadcastModel> absJavaBeanApi;
        if (message == null) {
            return;
        }
        p598o0oo00Oo.o0000O00.OooO0o("DataSourceMessage Socket doHandler :\n message.what " + message.what + "\n message.arg1 = " + message.arg1 + "\n message.obj = " + message.obj);
        int i = message.what;
        if (i != 2025) {
            if (i == 10003) {
                p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 房间文字消息 ----->" + message);
                ChatModel chatModel = (ChatModel) oOOO00.OooO00o((String) message.obj, ChatModel.class);
                if (chatModel != null) {
                    int type = chatModel.getType();
                    if (type == 10) {
                        chatModel.setType(11);
                    } else if (type != 20) {
                        switch (type) {
                            case 38:
                                chatModel.setType(12);
                                break;
                            case 39:
                                chatModel.setType(0);
                                chatModel.setAtType(39);
                                break;
                            case 40:
                                chatModel.setType(0);
                                chatModel.setAtType(40);
                                break;
                            default:
                                chatModel.setType(0);
                                Long value = chatModel.getNewFrom().getUserId().getValue();
                                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                                if (value == o0O00oO0.OooOOo0().getValue()) {
                                    o0oo0000.OooO00o.OooO0O0("202035");
                                }
                                chatModel.setAtType(0);
                                break;
                        }
                    } else {
                        chatModel.setType(20);
                    }
                    OooO00o(chatModel);
                }
            } else if (i == 10007) {
                p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 房间进出通知  ----->" + message);
                InOutRoomModel inOutRoomModel = (InOutRoomModel) oOOO00.OooO00o((String) message.obj, InOutRoomModel.class);
                if (inOutRoomModel != null && inOutRoomModel.getNewUser() != null) {
                    OooO0OO(inOutRoomModel);
                }
            } else if (i != 10019) {
                if (i == 10040) {
                    RoomOnlineContributionUpdataModel roomOnlineContributionUpdataModel = (RoomOnlineContributionUpdataModel) oOOO00.OooO00o((String) message.obj, RoomOnlineContributionUpdataModel.class);
                    if (roomOnlineContributionUpdataModel != null && roomOnlineContributionUpdataModel.users != null) {
                        OooO0OO(roomOnlineContributionUpdataModel);
                    }
                } else if (i == 10050) {
                    p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 收到技能卡-胡言乱语 ----->" + message);
                    SkillCardModel skillCardModel = (SkillCardModel) oOOO00.OooO00o((String) message.obj, SkillCardModel.class);
                    if (skillCardModel != null) {
                        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                        if (o0O00oO0.OooOOo0().getValue() == skillCardModel.getNewFrom().getUserId().getValue()) {
                            o0O00oO0.OooO0O0().postValue(Long.valueOf(skillCardModel.getBalance()));
                        }
                        if (o0O00oO0.OooOOo0().getValue() == skillCardModel.getNewTarget().getUserId().getValue()) {
                            ChatModel chatModel2 = new ChatModel();
                            String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Crazy_Words);
                            if (skillCardModel.getDiffertype() == 10) {
                                chatModel2.setType(11);
                                strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Nonsense);
                            }
                            if (skillCardModel.getDiffertype() == 38) {
                                chatModel2.setType(12);
                                strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Love_Lines);
                            }
                            chatModel2.setNewFrom(skillCardModel.getNewFrom());
                            chatModel2.setMessage(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.send_you) + ZegoConstants.ZegoVideoDataAuxPublishingStream + strOooO0OO);
                            chatModel2.setSkillCard(true);
                            OooO00o(chatModel2);
                        }
                        OooOOOO(10050, skillCardModel);
                    }
                } else if (i == 10052) {
                    p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 用户金币 ----->" + ((String) message.obj));
                    RoomGiftModel roomGiftModel = (RoomGiftModel) oOOO00.OooO00o((String) message.obj, RoomGiftModel.class);
                    if (roomGiftModel != null) {
                        o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                        o0O00oO0.OooO0O0().postValue(Long.valueOf(roomGiftModel.getCoin()));
                        o0O00oO0.OooO0Oo().postValue(Long.valueOf(roomGiftModel.getCrystal()));
                    }
                } else if (i == 100031) {
                    p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 房间图片消息 ----->" + message);
                    ChatModel chatModel3 = (ChatModel) oOOO00.OooO00o((String) message.obj, ChatModel.class);
                    if (chatModel3 != null) {
                        if (chatModel3.getNewFrom() != null) {
                            Long value2 = chatModel3.getNewFrom().getUserId().getValue();
                            o0O00oO0 o0o00oo4 = o0O00oO0.f47936OooO00o;
                            if (value2 == o0O00oO0.OooOOo0().getValue()) {
                                o0oo0000.OooO00o.OooO0O0("202012");
                            }
                        }
                        chatModel3.setType(7);
                        OooO00o(chatModel3);
                    }
                } else if (i == 1000001) {
                    p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 收到广播-喇叭-新 ----->" + message);
                    try {
                        RoomResult roomResult = (RoomResult) oOOO00.OooO0O0((String) message.obj, new TypeToken<RoomResult<RoomBroadcastModel>>() { // from class: com.yalla.yalla.mixedroom.MixedRoomDataSource.2
                        }.getType());
                        if (this.f22992OooO0o0 != null && roomResult.getData() != null && ((RoomBroadcastModel) roomResult.getData()).getFrom() != null) {
                            o0O00oO0 o0o00oo5 = o0O00oO0.f47936OooO00o;
                            if (String.valueOf(o0O00oO0.OooOOo0().getValue()).equals(Long.valueOf(((RoomBroadcastModel) roomResult.getData()).getFrom().getUserId())) && ((RoomBroadcastModel) roomResult.getData()).getBalance() > 0) {
                                OooO0o0().f22994OooO0oo.postValue(Integer.valueOf(((RoomBroadcastModel) roomResult.getData()).getBalance()));
                            }
                        }
                        OooOOOO(10019, roomResult.getData());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (i == 1000004) {
                    p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 房间转盘开启消息 ----->" + message);
                    RoomChatModel roomChatModel = (RoomChatModel) oOOO00.OooO00o((String) message.obj, RoomChatModel.class);
                    if (roomChatModel != null) {
                        roomChatModel.getData().setType(19);
                        OooO00o(roomChatModel.getData());
                    }
                } else if (i == 10010) {
                    p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 接受红包 ----->" + message);
                    ChatModel chatModel4 = (ChatModel) oOOO00.OooO00o((String) message.obj, ChatModel.class);
                    if (chatModel4 != null) {
                        chatModel4.setType(8);
                        OooO00o(chatModel4);
                    }
                } else if (i == 10011) {
                    p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 点赞列表 ----->" + message);
                    OooOOOO(10011, null);
                } else if (i == 10029) {
                    p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 房主设置是否自由上麦 ----->" + message);
                    MicPermissionsModel micPermissionsModel = (MicPermissionsModel) oOOO00.OooO00o((String) message.obj, MicPermissionsModel.class);
                    if (micPermissionsModel != null && OooO0o0() != null && OooO0o0().f22991OooO0o != null) {
                        OooO0o0().f22991OooO0o.setGuestlive(micPermissionsModel.getAllow() == 1);
                    }
                } else if (i != 10030) {
                    if (i == 10043) {
                        p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 贵族购买或续费喇叭 ----->" + message);
                        RoomBroadcastOpenNobleModel roomBroadcastOpenNobleModel = (RoomBroadcastOpenNobleModel) oOOO00.OooO00o((String) message.obj, RoomBroadcastOpenNobleModel.class);
                        if (roomBroadcastOpenNobleModel != null && roomBroadcastOpenNobleModel.getData() != null) {
                            o0O00oO0 o0o00oo6 = o0O00oO0.f47936OooO00o;
                            if (p004OooO0oO.o0OoOo0.OooO00o().equals(roomBroadcastOpenNobleModel.getData().getUserid())) {
                                p598o0oo00Oo.o0000O00.OooO0O0("贵族购买或续费喇叭 VipLevel " + roomBroadcastOpenNobleModel.getData().getViplevel());
                                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                                com.yalla.yalla.service.room.OooO00o.OooO0o0((Long) o0O00oO0.OooOOo0().getValue()).getPremiumLevel().setValue(Integer.valueOf(roomBroadcastOpenNobleModel.getData().getViplevel()));
                                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                                if (roomLiveService != null) {
                                    roomLiveService.OooO0oO(10044, null);
                                }
                            }
                        }
                        OooOOOO(message.what, message.obj);
                    } else if (i == 10044) {
                        p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 查询喇叭剩余数量 ----->" + message);
                        BroadcastNumModel broadcastNumModel = (BroadcastNumModel) oOOO00.OooO00o((String) message.obj, BroadcastNumModel.class);
                        if (broadcastNumModel != null) {
                            p598o0oo00Oo.o0000O00.OooO0O0("查询喇叭剩余数量 broadcastNum = " + broadcastNumModel.balance);
                            OooO0o0().f22994OooO0oo.postValue(Integer.valueOf(broadcastNumModel.balance));
                        }
                    } else if (i == 10047) {
                        p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 特殊动画表情 ----->" + message);
                        ChatModel chatModel5 = (ChatModel) oOOO00.OooO00o((String) message.obj, ChatModel.class);
                        if (chatModel5 != null) {
                            if (chatModel5.getNewFrom() != null) {
                                ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                                com.yalla.yalla.service.room.OooO00o.OooO0o(chatModel5.getNewFrom());
                            }
                            if (chatModel5.getType() == 0) {
                                chatModel5.setType(9);
                            }
                            if (chatModel5.getType() == 1) {
                                chatModel5.setType(10);
                            }
                            if (chatModel5.getType() != 2) {
                                OooO00o(chatModel5);
                            }
                        }
                    } else if (i == 10048) {
                        p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 有人送所有人金币礼物 ----->" + message);
                        GiftRoomAllResultModel giftRoomAllResultModel = (GiftRoomAllResultModel) oOOO00.OooO00o((String) message.obj, GiftRoomAllResultModel.class);
                        int value3 = GiftPropTypePay.Coin.getValue();
                        if (giftRoomAllResultModel != null) {
                            RoomGiftModel roomGiftModelReceiveSendAllGIft = RoomGiftModel.INSTANCE.receiveSendAllGIft(giftRoomAllResultModel);
                            OooOo00(roomGiftModelReceiveSendAllGIft, value3);
                            OooOOOO(10009, roomGiftModelReceiveSendAllGIft);
                        }
                    } else if (i == 10056) {
                        OooOO0o((RoomGiftModel) oOOO00.OooO00o((String) message.obj, RoomGiftModel.class), GiftPropTypePay.Crystal.getValue(), Boolean.TRUE);
                    } else if (i == 10057) {
                        p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 有人送所有人水晶礼物 ----->" + message);
                        GiftRoomAllResultModel giftRoomAllResultModel2 = (GiftRoomAllResultModel) oOOO00.OooO00o((String) message.obj, GiftRoomAllResultModel.class);
                        int value4 = GiftPropTypePay.Crystal.getValue();
                        if (giftRoomAllResultModel2 != null) {
                            RoomGiftModel roomGiftModelReceiveSendAllGIft2 = RoomGiftModel.INSTANCE.receiveSendAllGIft(giftRoomAllResultModel2);
                            OooOo00(roomGiftModelReceiveSendAllGIft2, value4);
                            OooOOOO(10009, roomGiftModelReceiveSendAllGIft2);
                        }
                    } else if (i == 21000 || i == 21001) {
                        OooOOOO(i, message.obj);
                    } else {
                        Lazy lazy = p488o0o00O0.OooOO0.f48912OooO00o;
                        p488o0o00O0.OooOO0.OooO0OO(RoomEventType.Room_Socket_UnknowOpecode);
                        p598o0oo00Oo.o0000O00.OooO0o("doHandler default Command not processed:" + message.what);
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject((String) message.obj);
                    if (jSONObject.getInt("code") == 0) {
                        String string = jSONObject.getString("channelkey");
                        RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
                        roomLiveService2.getClass();
                        p598o0oo00Oo.o0000O00.OooO0OO("RoomLiveService", "renewChannelKey key :" + string);
                        p355o0OOOo0o.OooO oooO = roomLiveService2.f24601OooO0oO;
                        if (oooO != null) {
                            oooO.OooO0o0(string);
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                p598o0oo00Oo.o0000O00.OooO0o("Socket----DataSource------- 收到广播-喇叭 ----->" + message);
                try {
                    this.f23001OooOOOo = (AbsJavaBeanApi) oOOO00.OooO0O0((String) message.obj, new TypeToken<AbsJavaBeanApi<RoomBroadcastModel>>() { // from class: com.yalla.yalla.mixedroom.MixedRoomDataSource.3
                    }.getType());
                    p598o0oo00Oo.o0000O00.OooO0O0("收到广播 radioMessage = " + this.f23001OooOOOo);
                    if (this.f22992OooO0o0 != null && (absJavaBeanApi = this.f23001OooOOOo) != null && absJavaBeanApi.getData() != null && this.f23001OooOOOo.getData().getFrom() != null) {
                        o0O00oO0 o0o00oo7 = o0O00oO0.f47936OooO00o;
                        if (String.valueOf(o0O00oO0.OooOOo0().getValue()).equals(Long.valueOf(this.f23001OooOOOo.getData().getFrom().getUserId())) && this.f23001OooOOOo.getData().getBalance() > 0) {
                            OooO0o0().f22994OooO0oo.postValue(Integer.valueOf(this.f23001OooOOOo.getData().getBalance()));
                        }
                    }
                    OooOOOO(10019, this.f23001OooOOOo.getData());
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        } else {
            OooOOOO(i, message.obj);
        }
        OooO(message);
    }

    public final RoomConfiguration OooO0o() {
        return this.f22991OooO0o;
    }

    public final void OooO0oO(Room.MoraStartPkRequestReply moraStartPkRequestReply) {
        if (moraStartPkRequestReply == null) {
            return;
        }
        int moraresult = moraStartPkRequestReply.getMoraresult();
        ArrayList<ChatModel> arrayList = this.f22996OooOO0O;
        int size = arrayList.size() <= 50 ? arrayList.size() : 50;
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).getType() == 14 && arrayList.get(i).getMuuid() == moraStartPkRequestReply.getMuuid()) {
                if (arrayList.get(i).getPkType() != 1) {
                    break;
                }
                arrayList.get(i).setPkType(2);
                break;
            }
        }
        if (moraresult == 1) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (!p004OooO0oO.o0OoOo0.OooO00o().equals(String.valueOf(moraStartPkRequestReply.getFromuser().getUserId())) && p004OooO0oO.o0OoOo0.OooO00o().equals(String.valueOf(moraStartPkRequestReply.getJoinuser().getUserId()))) {
                o0O00oO0.OooO0O0().postValue(Long.valueOf(moraStartPkRequestReply.getBalance()));
            }
            String strOooO0O0 = p412o0Oo0o0O.o000O000.OooO0O0(moraStartPkRequestReply.getFromuser().getUserId(), moraStartPkRequestReply.getFromuser().getName());
            OooOOo0(moraStartPkRequestReply.getToUserId() > 0 ? com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_dialog_guess_win_challenge), strOooO0O0) : com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.i_Win_mora_game), strOooO0O0), moraStartPkRequestReply, RoomUserInfoModel.INSTANCE.of(moraStartPkRequestReply.getJoinuser()));
        } else if (moraresult == 2) {
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            if (p004OooO0oO.o0OoOo0.OooO00o().equals(String.valueOf(moraStartPkRequestReply.getFromuser().getUserId()))) {
                o0O00oO0.OooO0O0().postValue(Long.valueOf(moraStartPkRequestReply.getBalance()));
            } else {
                p004OooO0oO.o0OoOo0.OooO00o().equals(String.valueOf(moraStartPkRequestReply.getJoinuser().getUserId()));
            }
            String strOooO0O1 = p412o0Oo0o0O.o000O000.OooO0O0(moraStartPkRequestReply.getFromuser().getUserId(), moraStartPkRequestReply.getFromuser().getName());
            OooOOo0(moraStartPkRequestReply.getToUserId() > 0 ? com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_dialog_guess_pie_challenge), strOooO0O1) : com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.i_tie_mora_game), strOooO0O1), moraStartPkRequestReply, RoomUserInfoModel.INSTANCE.of(moraStartPkRequestReply.getJoinuser()));
        } else if (moraresult != 3) {
            OooOOOO(33001, null);
        } else {
            o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
            if (p004OooO0oO.o0OoOo0.OooO00o().equals(String.valueOf(moraStartPkRequestReply.getFromuser().getUserId()))) {
                o0O00oO0.OooO0O0().postValue(Long.valueOf(moraStartPkRequestReply.getBalance()));
            } else {
                p004OooO0oO.o0OoOo0.OooO00o().equals(String.valueOf(moraStartPkRequestReply.getJoinuser().getUserId()));
            }
            String strOooO0O2 = p412o0Oo0o0O.o000O000.OooO0O0(moraStartPkRequestReply.getJoinuser().getUserId(), moraStartPkRequestReply.getJoinuser().getName());
            OooOOo0(moraStartPkRequestReply.getToUserId() > 0 ? com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_dialog_guess_win_challenge), strOooO0O2) : com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.i_Win_mora_game), strOooO0O2), moraStartPkRequestReply, RoomUserInfoModel.INSTANCE.of(moraStartPkRequestReply.getFromuser()));
        }
        OooOOO0(moraStartPkRequestReply.getMuuid());
    }

    public final void OooO0oo(final RoomLoginInformation roomLoginInformation) {
        if (roomLoginInformation == null || roomLoginInformation.getRoom() == null) {
            return;
        }
        long id = roomLoginInformation.getRoom().getId();
        if (0 == id) {
            return;
        }
        if (this.f23004OooOOoo != id) {
            this.f23002OooOOo = 0;
            this.f23004OooOOoo = id;
        }
        p384o0OOoo0O.o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
        String strValueOf = String.valueOf(id);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.mixedroom.MixedRoomDataSource.6
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(String str, String str2) {
                MixedRoomDataSource mixedRoomDataSource = MixedRoomDataSource.this;
                int i = mixedRoomDataSource.f23002OooOOo;
                if (i < 3) {
                    mixedRoomDataSource.f23002OooOOo = i + 1;
                    mixedRoomDataSource.OooO0oo(roomLoginInformation);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(String str) {
                AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) oOOO00.OooO0O0(str, new TypeToken<AbsJavaBeanApi<RoomConfiguration>>() { // from class: com.yalla.yalla.mixedroom.MixedRoomDataSource.6.1
                }.getType());
                MixedRoomDataSource.this.OooOOo((RoomConfiguration) absJavaBeanApi.getData(), roomLoginInformation);
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
                if (!oooO00o.OooO00o().OooOO0O() && ((RoomConfiguration) absJavaBeanApi.getData()).getIsfollow() == 1) {
                    com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48526OooO0oo.setValue(Boolean.TRUE);
                }
                o0O0O0O o0o0o0oOooOoo = p408o0Oo0Oo0.o00Oo0.OooO00o().OooOoo();
                StringBuilder sb = new StringBuilder();
                sb.append(((RoomConfiguration) absJavaBeanApi.getData()).getBarid());
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                sb.append(String.valueOf(o0O00oO0.OooOOo0().getValue()));
                if (o0o0o0oOooOoo.OooO0O0(sb.toString()) == null && oooO00o.OooO00o().OooOOO0() && ((Boolean) o0O00oO0.OooOo0O().getValue()).booleanValue()) {
                    com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.OooO0oO(true);
                }
            }
        };
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("barid", strValueOf);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, "/Webservers/Bar/RoomInfo", linkedHashMapOooO00o, oooO0O0);
    }

    public final void OooOO0(Room.MagicVoiceOut magicVoiceOut) {
        boolean z;
        long userId = magicVoiceOut.getFrom().getUserId();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (userId == Long.parseLong(String.valueOf(o0O00oO0.OooOOo0().getValue()))) {
            o0O00oO0.OooO0O0().postValue(Long.valueOf(magicVoiceOut.getBalance()));
        }
        int cardid = magicVoiceOut.getCardid();
        int i = 1;
        if (cardid != 0 && cardid != 179 && cardid != 73 && cardid != 74) {
            switch (cardid) {
                case 76:
                case 77:
                case 78:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        if (magicVoiceOut.getTarget().getUserId() == Long.parseLong(String.valueOf(o0O00oO0.OooOOo0().getValue()))) {
            ChatModel chatModel = new ChatModel();
            chatModel.setType(15);
            chatModel.setMagicVoiceInfo(new ChatModel.MagicVoiceInfo(magicVoiceOut.getCardid(), oOO000o.OooO00o(magicVoiceOut.getCardid())));
            chatModel.setNewFrom(RoomUserInfoModel.INSTANCE.of(magicVoiceOut.getFrom()));
            chatModel.setMessage(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.message_room_send_voice_changer));
            OooO00o(chatModel);
            if (com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48576OooO00o.getValue().booleanValue()) {
                p355o0OOOo0o.OooO oooOOooO00o = p355o0OOOo0o.OooO0o.OooO0O0().OooO00o();
                switch (magicVoiceOut.getCardid()) {
                    case 73:
                        i = 3;
                        break;
                    case 74:
                        i = 2;
                        break;
                    case 75:
                        break;
                    case 76:
                        i = 5;
                        break;
                    case 77:
                        i = 6;
                        break;
                    default:
                        i = 0;
                        break;
                }
                oooOOooO00o.OooOO0(i);
            }
        }
        OooOOOO(10066, magicVoiceOut);
    }

    public final void OooOO0o(RoomGiftModel roomGiftModel, int i, Boolean bool) {
        if (roomGiftModel != null) {
            OooOo00(roomGiftModel, i);
            if (bool.booleanValue()) {
                try {
                    if (roomGiftModel.getRoominfo() != null && roomGiftModel.getRoominfo().getId() == Long.parseLong(this.f22991OooO0o.getBarid())) {
                        OooO00o(roomGiftModel.getRoomChatModel());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (roomGiftModel.getType() == 7 || roomGiftModel.getType() == 71 || roomGiftModel.getType() == 72) {
                return;
            }
            LiveEventBus.get("NormalGiftRunWay").post(roomGiftModel);
        }
    }

    public final void OooOOO() {
        ArrayList arrayList = this.f22998OooOOO;
        if (arrayList.size() > 0) {
            com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24553OooOOoo.postValue(arrayList);
            return;
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.mixedroom.MixedRoomDataSource.8
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(String str) {
                CommonListResult commonListResult = (CommonListResult) oOOO00.OooO0O0(str, new TypeToken<CommonListResult<MoraGiftListModel>>() { // from class: com.yalla.yalla.mixedroom.MixedRoomDataSource.8.1
                }.getType());
                if (commonListResult == null || commonListResult.data.isEmpty()) {
                    return;
                }
                MixedRoomDataSource mixedRoomDataSource = MixedRoomDataSource.this;
                mixedRoomDataSource.f22998OooOOO.addAll(commonListResult.data);
                com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24553OooOOoo.postValue(mixedRoomDataSource.f22998OooOOO);
            }
        };
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43401o00000Oo, p426o0OoO0o0.OooOOOO.OooO00o(), oooO0O0);
    }

    public final void OooOOOO(int i, Object obj) {
        Handler handler = this.f22993OooO0oO;
        if (handler != null) {
            handler.obtainMessage(i, 0, 0, obj).sendToTarget();
            return;
        }
        Message message = new Message();
        message.what = i;
        message.arg1 = 0;
        message.arg2 = 0;
        message.obj = obj;
        p545o0oO0O00.OooOo00.OooO0O0(2050, message);
    }

    public final void OooOOOo(String str, Room.MoraStartUpRequestReply moraStartUpRequestReply) {
        ChatModel chatModel = new ChatModel();
        chatModel.setType(14);
        chatModel.setNewFrom(RoomUserInfoModel.INSTANCE.of(moraStartUpRequestReply.getFromuser()));
        chatModel.setPkType(1);
        chatModel.setMessage(str);
        chatModel.setMuuid(moraStartUpRequestReply.getMuuid());
        chatModel.setGiftid(moraStartUpRequestReply.getMoragiftid());
        chatModel.setGiftPrice(moraStartUpRequestReply.getGiftprice());
        chatModel.setNum(String.valueOf(moraStartUpRequestReply.getMoranum()));
        chatModel.setGiftUrl(moraStartUpRequestReply.getGiftimage());
        chatModel.setToUserId(moraStartUpRequestReply.getToUserId());
        chatModel.setToNickname(moraStartUpRequestReply.getToNickname());
        chatModel.setToHeadphoto(moraStartUpRequestReply.getToHeadphoto());
        OooO00o(chatModel);
    }

    public final void OooOOo(RoomConfiguration roomConfiguration, RoomLoginInformation roomLoginInformation) {
        this.f22991OooO0o = roomConfiguration;
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = oooO00o.OooO00o();
        oooO0O0OooO00o.f24535OooO.postValue(roomConfiguration);
        if (roomConfiguration.getProfileLimit() != null) {
            for (ProfileLimitModel profileLimitModel : roomConfiguration.getProfileLimit()) {
                if (profileLimitModel.getOperationType() == 3) {
                    oooO0O0OooO00o.f24544OooOO0.postValue(profileLimitModel);
                }
                profileLimitModel.getOperationType();
                profileLimitModel.getOperationType();
            }
        }
        oooO0O0OooO00o.f24543OooO0oo.postValue(roomLoginInformation);
        oooO0O0OooO00o.f24537OooO0O0.postValue(com.code.android.util.OooOo00.OooO0O0(roomConfiguration.getBarname()) ? roomConfiguration.getBarname() : "");
        oooO0O0OooO00o.f24536OooO00o.postValue(com.code.android.util.OooOo00.OooO0O0(roomConfiguration.getBarimage()) ? roomConfiguration.getBarimage() : "");
        oooO0O0OooO00o.f24539OooO0Oo.postValue(Long.valueOf(Long.parseLong(roomConfiguration.getBarid())));
        oooO0O0OooO00o.f24538OooO0OO.postValue(Long.valueOf(Long.parseLong(roomConfiguration.getBaridx())));
        oooO0O0OooO00o.f24550OooOOOo.postValue(Boolean.valueOf(roomConfiguration.getIsencrypt() != 0));
        oooO0O0OooO00o.f24559OooOoO.postValue(roomConfiguration.getIsForBidRoom());
        oooO0O0OooO00o.f24561OooOoOO.postValue(roomConfiguration.getAdminLockmic());
        oooO0O0OooO00o.f24568Oooo000.postValue(roomConfiguration.getProfileLimit());
        oooO0O0OooO00o.f24562OooOoo.postValue(Integer.valueOf(roomConfiguration.getCountryid()));
        oooO0O0OooO00o.f24564OooOooO.postValue(roomConfiguration.isManageEvent);
        oooO0O0OooO00o.f24565OooOooo.postValue(Integer.valueOf(roomConfiguration.getVarietyLevel()));
        com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48588OooOOO0.setValue(Boolean.valueOf(roomConfiguration.isAdminApplymic.booleanValue()));
        p483o0o000Oo.o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24516OooO0o0;
        o000000Var.f48458OooO.setValue(Boolean.valueOf(roomConfiguration.getIspwdroom() != 0));
        com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.OooO0o(roomConfiguration.getMembernum());
        o000000Var.f48461OooO0OO.setValue(Integer.valueOf(roomConfiguration.getWage()));
        o000000Var.f48459OooO00o.setValue(Long.valueOf(Long.parseLong(roomConfiguration.getBarid())));
        o000000Var.f48464OooO0o0.setValue(Boolean.valueOf(roomConfiguration.isGuestlive()));
        o000000Var.f48460OooO0O0.setValue(Integer.valueOf(roomConfiguration.getIsPrettyBarId()));
        oooO00o.OooO00o().f24539OooO0Oo.postValue(Long.valueOf(Long.parseLong(roomConfiguration.getBarid())));
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.id = String.valueOf(roomConfiguration.getLabelid());
        categoryModel.labelname = roomConfiguration.getLabelname();
        oooO0O0OooO00o.f24551OooOOo.postValue(categoryModel);
        if (roomConfiguration.getOwn() != 1) {
            RoomHistory roomHistory = new RoomHistory();
            roomHistory.barid = roomConfiguration.getBarid() + "";
            roomHistory.baridx = roomConfiguration.getBaridx() + "";
            roomHistory.barname = roomConfiguration.getBarname();
            roomHistory.barimage = roomConfiguration.getBarimage();
            roomHistory.barlevel = roomConfiguration.getBarlevel() + "";
            roomHistory.countryid = roomConfiguration.getCountryid() + "";
            roomHistory.isencrypt = roomConfiguration.getIsencrypt() + "";
            roomHistory.isofficial = roomConfiguration.getIsofficial();
            roomHistory.labelname = roomConfiguration.getLabelname();
            roomHistory.bartype = roomConfiguration.getBartype() + "";
            roomHistory.notice = roomConfiguration.getNotice();
            roomHistory.medal = roomConfiguration.getMedal();
            roomHistory.time = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            sb.append(String.valueOf(o0O00oO0.OooOOo0().getValue()));
            sb.append(roomHistory.barid);
            roomHistory.repeat = sb.toString();
            roomHistory.uid = p004OooO0oO.o0OoOo0.OooO00o();
            p408o0Oo0Oo0.o00Oo0.OooO00o().OooOoo0().OooO0OO(roomHistory);
            ArrayList arrayListOooO00o = p408o0Oo0Oo0.o00Oo0.OooO00o().OooOoo0().OooO00o(String.valueOf(o0O00oO0.OooOOo0().getValue()));
            Collections.reverse(arrayListOooO00o);
            if (com.code.android.util.OooOo00.OooO0O0(arrayListOooO00o) && arrayListOooO00o.size() > 100) {
                p408o0Oo0Oo0.o00Oo0.OooO00o().OooOoo0().OooO0Oo((RoomHistory) arrayListOooO00o.get(0));
            }
            p545o0oO0O00.OooOo00.OooO0O0(583, null);
        }
        if (oooO00o.OooO00o().OooOOO0()) {
            oooO0O0OooO00o.f24545OooOO0O.postValue(Boolean.valueOf(roomConfiguration.getIsfollow() == 1));
        }
    }

    public final void OooOOo0(String str, Room.MoraStartPkRequestReply moraStartPkRequestReply, RoomUserInfoModel roomUserInfoModel) {
        ChatModel chatModel = new ChatModel();
        chatModel.setType(14);
        chatModel.setNewFrom(roomUserInfoModel);
        chatModel.setPkType(3);
        chatModel.setMessage(str);
        chatModel.setMuuid(moraStartPkRequestReply.getMuuid());
        chatModel.setGiftid(moraStartPkRequestReply.getMoragiftid());
        chatModel.setGiftUrl(moraStartPkRequestReply.getGiftimage());
        chatModel.setNum(String.valueOf(moraStartPkRequestReply.getMoranum()));
        chatModel.setTie(moraStartPkRequestReply.getMoraresult() == 2);
        OooO00o(chatModel);
    }

    public final void OooOo0() {
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o();
        if (oooO0O0OooO00o.f24545OooOO0O.getValue().booleanValue()) {
            o0oo0000.OooO00o.OooO0O0("102166");
        }
        p384o0OOoo0O.o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
        p384o0OOoo0O.oo000o.OooO0O0(oooO0O0OooO00o.f24539OooO0Oo.getValue() + "", oooO0O0OooO00o.f24545OooOO0O.getValue().booleanValue(), new OooO0OO(oooO0O0OooO00o));
    }

    public final void OooOo0o(long j) {
        int i = 0;
        while (true) {
            ArrayList<ChatModel> arrayList = this.f22996OooOO0O;
            if (i < arrayList.size()) {
                if (arrayList.get(i).getType() == 14 && arrayList.get(i).getMuuid() == j) {
                    if (arrayList.get(i).getPkType() != 1) {
                        break;
                    }
                    arrayList.get(i).setPkType(2);
                    OooOOOO(33001, null);
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        OooOOO0(j);
    }
}
