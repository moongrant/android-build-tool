package p159o00OoOO;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.mixedroom.model.BroadcastNumModel;
import com.app.base.mixedroom.model.RoomBroadcastOpenNobleModel;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.mixedroom.model.RoomGameConfig;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.mixedroom.model.RoomResult;
import com.app.base.mixedroom.model.RoomUserInfoChangeModel;
import com.app.base.model.BecomeMmemberModel;
import com.app.base.model.CategoryModel;
import com.app.base.model.ChatModel;
import com.app.base.model.CommonListResult;
import com.app.base.model.GetMicModel;
import com.app.base.model.GiftRoomAllResultModel;
import com.app.base.model.GiftRoomModel;
import com.app.base.model.InOutRoomModel;
import com.app.base.model.MicPermissionsModel;
import com.app.base.model.MoraGiftListModel;
import com.app.base.model.ProfileLimitModel;
import com.app.base.model.RoomChatModel;
import com.app.base.model.RoomModel;
import com.app.base.model.RoomOnlineContributionUpdataModel;
import com.app.base.model.SilenceModel;
import com.app.base.model.SkillCardModel;
import com.app.base.model.TakeMicModel;
import com.app.base.model.ThrowMicModel;
import com.app.base.model.roomBroadcastModel.RoomBroadcastModel;
import com.app.base.protobuf.room.Room;
import com.code.android.util.ToastUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.umeng.analytics.pro.i;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.statistical.event.RoomEventType;
import com.yalla.yalla.common.statistical.net.FLog;
import com.yalla.yalla.data.constant.TurntableGameState;
import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.model.GiftPropTypePay;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.zego.wrapper.ZegoLiveRoomConstants;
import com.zego.zegoavkit2.ZegoConstants;
import io.agora.rtc.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.OooOo00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o0O0ooO;
import p388o0OOooO.o00000O0;
import p391o0OOooOo.o0O00000;
import p445o0OoOo0o.o0O0OOOo;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p517o0o0O00O.o0000Ooo;
import p520o0o0O0O0.o00O0O;
import p522o0o0O0o.o00O000;
import p522o0o0O0o.o00oOoo;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p530o0o0OOO.o00OOO00;
import p532o0o0OOOO.o;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O implements o00OO.OooO0O0 {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static o000O00O f32426Oooooo0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public RoomConfiguration f32427Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00OO.OooO0OO<o000O00O> f32428Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public RoomModel f32429Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public RoomLoginInformation f32430Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Context f32432OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Handler f32433OoooO00;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public HashMap<Long, Boolean> f32435OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ArrayList<ChatModel> f32436OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f32437OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f32438OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public List<MoraGiftListModel> f32439OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public Room.MoraStartPkRequestReply f32440OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public AbsJavaBeanApi<RoomBroadcastModel> f32441Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public GiftRoomModel f32442Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f32443OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public long f32444OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f32445OooooOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ExecutorService f32446o000oOoO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final MutableLiveData<Integer> f32434OoooO0O = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public SparseArray<RoomLoginInformation.MIC> f32431OoooO = new SparseArray<>();

    public class OooO extends o00OO0O0.OooO0O0 {

        public class OooO00o extends o00000O0<CommonListResult<MoraGiftListModel>> {
        }

        public OooO(Context context) {
            super(context);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            CommonListResult commonListResult = (CommonListResult) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
            if (commonListResult == null || commonListResult.data.isEmpty()) {
                return;
            }
            o000O00O.this.f32439OoooOoO.addAll(commonListResult.data);
            o00OO00O.f43313OooooOo.OooO00o().f43340OooOoO0.postValue(o000O00O.this.f32439OoooOoO);
        }
    }

    public class OooO00o implements o00O000<Room.EnvelopInfo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Room.NewSendBonusSubMessage f32448OooO00o;

        public OooO00o(Room.NewSendBonusSubMessage newSendBonusSubMessage) {
            this.f32448OooO00o = newSendBonusSubMessage;
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Object f32449Oooo0o;

        public OooO0O0(Object obj) {
            this.f32449Oooo0o = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RoomUserInfoModel roomUserInfoModelOooOO0;
            o000O00O o000o00o2 = o000O00O.this;
            Object obj = this.f32449Oooo0o;
            synchronized (o000o00o2) {
                try {
                    if (obj instanceof GetMicModel) {
                        RoomUserInfoModel roomUserInfoModel = ((GetMicModel) obj).user;
                        o00O.f43140OooO00o.OooOO0o(roomUserInfoModel.getUserId(), roomUserInfoModel);
                    } else if (obj instanceof ThrowMicModel) {
                        RoomUserInfoModel roomUserInfoModelOooOO1 = o00O.f43140OooO00o.OooOO0(((ThrowMicModel) obj).userid);
                        if (roomUserInfoModelOooOO1 != null) {
                            roomUserInfoModelOooOO1.setHasMic(false);
                        }
                    } else if (obj instanceof SilenceModel) {
                        SilenceModel silenceModel = (SilenceModel) obj;
                        RoomUserInfoModel roomUserInfoModelOooOO2 = o00O.f43140OooO00o.OooOO0(silenceModel.to.uid);
                        if (roomUserInfoModelOooOO2 != null) {
                            roomUserInfoModelOooOO2.setSilenced(silenceModel.silence);
                        }
                    } else if ((obj instanceof BecomeMmemberModel) && (roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(((BecomeMmemberModel) obj).getUserid())) != null) {
                        roomUserInfoModelOooOO0.setRoomMemberType(3);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class OooO0OO extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ RoomLoginInformation f32451OooO00o;

        public class OooO00o extends o00000O0<AbsJavaBeanApi<RoomConfiguration>> {
        }

        public OooO0OO(RoomLoginInformation roomLoginInformation) {
            this.f32451OooO00o = roomLoginInformation;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            o000O00O o000o00o2 = o000O00O.this;
            int i = o000o00o2.f32443OooooO0;
            if (i < 3) {
                o000o00o2.f32443OooooO0 = i + 1;
                o000o00o2.OooOo00(this.f32451OooO00o);
            }
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
            o000O00O.this.Oooo0O0((RoomConfiguration) absJavaBeanApi.getData(), this.f32451OooO00o);
            o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
            if (!oooO00o.OooO00o().OooOOO() && ((RoomConfiguration) absJavaBeanApi.getData()).getIsfollow() == 1) {
                o00O.f43140OooO00o.OooOo0o(true);
            }
            o0000Ooo o0000oooOooOooO = p491o0o00O00.OooO0OO.OooO00o().OooOooO();
            StringBuilder sb = new StringBuilder();
            sb.append(((RoomConfiguration) absJavaBeanApi.getData()).getBarid());
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            sb.append(String.valueOf(oooOOO.OooOo().getValue()));
            if (o0000oooOooOooO.OooO0O0(sb.toString()) == null && oooO00o.OooO00o().OooOOOo() && oooOOO.OooOooO().getValue().booleanValue()) {
                o00O.f43140OooO00o.OooOoO(true);
            }
        }
    }

    public class OooO0o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o00OO00O f32453OooO00o;

        public OooO0o(o00OO00O o00oo00o) {
            this.f32453OooO00o = o00oo00o;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            if (this.f32453OooO00o.f43327OooOOO.getValue().booleanValue()) {
                o0O00000.OooO0OO("InRoom_roomProfile_unfollow_success");
                this.f32453OooO00o.f43327OooOOO.postValue(Boolean.FALSE);
                o000O00O.this.f32427Oooo.setIsfollow(0);
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Unfollowed));
            } else {
                o0O00000.OooO0OO("InRoom_roomRrofile_follow_success");
                this.f32453OooO00o.f43327OooOOO.postValue(Boolean.TRUE);
                o000O00O.this.f32427Oooo.setIsfollow(1);
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Following_room_profile_toast));
            }
            LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
        }
    }

    public o000O00O() {
        new HashMap();
        this.f32446o000oOoO = Executors.newSingleThreadExecutor();
        this.f32436OoooOOO = new ArrayList<>();
        this.f32437OoooOOo = false;
        this.f32438OoooOo0 = false;
        this.f32439OoooOoO = new ArrayList();
        this.f32443OooooO0 = 0;
        this.f32444OooooOO = 0L;
        this.f32445OooooOo = false;
        this.f32428Oooo0o = new o00OO.OooO0OO<>(this);
    }

    public static synchronized o000O00O OooO() {
        if (f32426Oooooo0 == null) {
            synchronized (o000O00O.class) {
                if (f32426Oooooo0 == null) {
                    f32426Oooooo0 = new o000O00O();
                }
            }
        }
        return f32426Oooooo0;
    }

    public final synchronized void OooO00o(ChatModel chatModel) {
        if (chatModel == null) {
            return;
        }
        RoomUserInfoModel roomUserInfoModel = chatModel.from;
        if (roomUserInfoModel != null && roomUserInfoModel.getUserId() > 0 && chatModel.from.getUserLevel() > 0) {
            o00O.f43140OooO00o.OooOO0o(chatModel.from.getUserId(), chatModel.from);
        }
        if (this.f32436OoooOOO.size() >= 300) {
            for (int i = 0; i < 100; i++) {
                this.f32436OoooOOO.remove(0);
            }
        }
        chatModel.roleReceiving = o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue().intValue();
        chatModel.playTime = System.currentTimeMillis();
        this.f32436OoooOOO.add(chatModel);
        Oooo0o0();
    }

    /* JADX WARN: Code duplicated, block: B:152:0x04f8 A[Catch: Exception -> 0x0505, TRY_LEAVE, TryCatch #0 {Exception -> 0x0505, blocks: (B:150:0x04e7, B:152:0x04f8), top: B:303:0x04e7 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x08d4  */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o00OO.OooO0O0
    public final void OooO0O0(Message message) {
        RoomUserInfoModel roomUserInfoModel;
        JSONObject jSONObject;
        HashMap<Long, Boolean> map;
        AbsJavaBeanApi<RoomBroadcastModel> absJavaBeanApi;
        RoomUserInfoModel roomUserInfoModel2;
        RoomLoginInformation.MIC mic;
        RoomUserInfoModel roomUserInfoModel3;
        if (message == null) {
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DataSourceMessage Socket doHandler :\n message.what ");
        sbOooO0o0.append(message.what);
        sbOooO0o0.append("\n message.arg1 = ");
        sbOooO0o0.append(message.arg1);
        sbOooO0o0.append("\n message.obj = ");
        sbOooO0o0.append(message.obj);
        o00O00.OooO0oO(sbOooO0o0.toString());
        int i = message.what;
        if (i != 10007) {
            if (i == 10008) {
                com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 我被踢出房间  ----->", message);
                Handler handler = this.f32433OoooO00;
                if (handler == null) {
                    ?? ValueOf = Boolean.valueOf(handler == null);
                    p140o00OOOoO.OooO0OO oooO0OO = new p140o00OOOoO.OooO0OO();
                    oooO0OO.f31885OooO00o = Constants.ERR_PUBLISH_STREAM_CDN_ERROR;
                    oooO0OO.f31887OooO0OO = ValueOf;
                    p034OoooO0O.o0Oo0oo.OooO0o(oooO0OO);
                } else {
                    OooOooO(10008, 0, null);
                }
                o00OO00O.f43313OooooOo.OooO00o().f43368Ooooo0o.postValue(new Pair<>(OooOOO.f41216OooO00o.OooOo().getValue(), 0));
            } else if (i == 10010) {
                com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 接受红包 ----->", message);
                ChatModel chatModel = (ChatModel) o0Oo0oo.OooO0O0((String) message.obj, ChatModel.class);
                if (chatModel != null) {
                    chatModel.type = 8;
                    OooO00o(chatModel);
                }
            } else if (i == 10011) {
                com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 点赞列表 ----->", message);
                OooOooO(10011, 0, null);
            } else if (i == 10056) {
                OooOoO((GiftRoomModel) o0Oo0oo.OooO0O0((String) message.obj, GiftRoomModel.class), GiftPropTypePay.Crystal.getValue(), Boolean.TRUE);
            } else if (i == 10057) {
                com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 有人送所有人水晶礼物 ----->", message);
                OooOoO0((GiftRoomAllResultModel) o0Oo0oo.OooO0O0((String) message.obj, GiftRoomAllResultModel.class), GiftPropTypePay.Crystal.getValue());
            } else if (i != 21000 && i != 21001) {
                switch (i) {
                    case 2025:
                        OooOooO(i, 0, message.obj);
                        break;
                    case 10003:
                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 房间文字消息 ----->", message);
                        ChatModel chatModel2 = (ChatModel) o0Oo0oo.OooO0O0((String) message.obj, ChatModel.class);
                        if (chatModel2 != null) {
                            int i2 = chatModel2.type;
                            if (i2 == 10) {
                                chatModel2.type = 11;
                            } else if (i2 != 20) {
                                switch (i2) {
                                    case 38:
                                        chatModel2.type = 12;
                                        break;
                                    case 39:
                                        chatModel2.type = 0;
                                        chatModel2.atType = 39;
                                        break;
                                    case 40:
                                        chatModel2.type = 0;
                                        chatModel2.atType = 40;
                                        break;
                                    default:
                                        chatModel2.type = 0;
                                        chatModel2.atType = 0;
                                        break;
                                }
                            } else {
                                chatModel2.type = 20;
                            }
                            OooO00o(chatModel2);
                        }
                        break;
                    case 10040:
                        RoomOnlineContributionUpdataModel roomOnlineContributionUpdataModel = (RoomOnlineContributionUpdataModel) o0Oo0oo.OooO0O0((String) message.obj, RoomOnlineContributionUpdataModel.class);
                        if (roomOnlineContributionUpdataModel != null && roomOnlineContributionUpdataModel.users != null) {
                            OooO0Oo(roomOnlineContributionUpdataModel);
                        }
                        try {
                            jSONObject = new JSONObject((String) message.obj);
                            if (jSONObject.getInt("code") == 0) {
                                OooOooO(10030, 0, jSONObject.getString("channelkey"));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 10052:
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Socket----DataSource------- 用户金币 ----->");
                        sbOooO0o1.append((String) message.obj);
                        o00O00.OooO0oO(sbOooO0o1.toString());
                        GiftRoomModel giftRoomModel = (GiftRoomModel) o0Oo0oo.OooO0O0((String) message.obj, GiftRoomModel.class);
                        if (giftRoomModel != null) {
                            OooOOO oooOOO = OooOOO.f41216OooO00o;
                            oooOOO.OooO0OO().postValue(Long.valueOf(giftRoomModel.coin));
                            oooOOO.OooO0o().postValue(Long.valueOf(giftRoomModel.crystal));
                        }
                        break;
                    case ZegoLiveRoomConstants.ErrorCode.SDK_SHOULD_NOT_READY /* 20001 */:
                        OooOooO(i, 0, message.obj);
                        SparseArray<RoomLoginInformation.MIC> sparseArray = OooO().f32431OoooO;
                        HashMap<Long, Boolean> map2 = this.f32435OoooOO0;
                        if (map2 == null) {
                            this.f32435OoooOO0 = new HashMap<>();
                        } else {
                            map2.clear();
                        }
                        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                            RoomLoginInformation.MIC mic2 = sparseArray.get(sparseArray.indexOfKey(i3));
                            if (mic2 != null && (roomUserInfoModel = mic2.user) != null) {
                                this.f32435OoooOO0.put(Long.valueOf(roomUserInfoModel.getUserId()), Boolean.valueOf(mic2.isMuteSound()));
                            }
                        }
                        break;
                    case 100031:
                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 房间图片消息 ----->", message);
                        ChatModel chatModel3 = (ChatModel) o0Oo0oo.OooO0O0((String) message.obj, ChatModel.class);
                        if (chatModel3 != null) {
                            RoomUserInfoModel roomUserInfoModel4 = chatModel3.from;
                            if (roomUserInfoModel4 != null && roomUserInfoModel4.getUserId() == OooOOO.f41216OooO00o.OooOo().getValue().longValue()) {
                                o0O00000.OooO0OO("InRoom_photo_succedd");
                            }
                            chatModel3.type = 7;
                            OooO00o(chatModel3);
                        }
                        break;
                    case 1000001:
                        o00O00.OooO0oO("Socket----DataSource------- 收到广播-喇叭-新 ----->" + message);
                        try {
                            RoomResult roomResult = (RoomResult) o0Oo0oo.OooO0OO((String) message.obj, new o000O0().getType());
                            if (this.f32430Oooo0oo != null && roomResult.getData() != null && ((RoomBroadcastModel) roomResult.getData()).getFrom() != null && String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()).equals(Long.valueOf(((RoomBroadcastModel) roomResult.getData()).getFrom().getUserId())) && ((RoomBroadcastModel) roomResult.getData()).getBalance() != null) {
                                OooO().Oooo00o(((RoomBroadcastModel) roomResult.getData()).getBalance().intValue());
                            }
                            OooOooO(10019, 0, roomResult.getData());
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        break;
                    case 1000004:
                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 房间转盘开启消息 ----->", message);
                        RoomChatModel roomChatModel = (RoomChatModel) o0Oo0oo.OooO0O0((String) message.obj, RoomChatModel.class);
                        if (roomChatModel != null) {
                            roomChatModel.getData().type = 19;
                            OooO00o(roomChatModel.getData());
                        }
                        break;
                    case 1000400:
                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 新麦上表情CODE=1000400 ----->", message);
                        ChatModel chatModel4 = (ChatModel) o0Oo0oo.OooO0O0((String) message.obj, ChatModel.class);
                        if (chatModel4 != null) {
                            for (int i4 = 0; i4 < this.f32431OoooO.size(); i4++) {
                                SparseArray<RoomLoginInformation.MIC> sparseArray2 = this.f32431OoooO;
                                RoomUserInfoModel roomUserInfoModel5 = sparseArray2.get(sparseArray2.keyAt(i4)).user;
                                if (roomUserInfoModel5 != null && roomUserInfoModel5.getUserId() == chatModel4.from.getUserId()) {
                                    Intrinsics.checkNotNullParameter("mic_emoji_panel", "key");
                                    Observable observable = LiveEventBus.get("roommic_emoji_panel", Object.class);
                                    Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
                                    observable.post(new Pair(Integer.valueOf(i4), chatModel4.emjUrl));
                                }
                            }
                        }
                        break;
                    default:
                        switch (i) {
                            case 10016:
                                o00O00.OooO0oO("Socket----DataSource------- 上麦  ----->" + message);
                                o00O00.OooO0OO("麦变更", "上麦 " + message.obj);
                                RoomLoginInformation.MIC mic3 = (RoomLoginInformation.MIC) o0Oo0oo.OooO0O0((String) message.obj, RoomLoginInformation.MIC.class);
                                if (mic3.getCode() == 0) {
                                    mic3.setState(2);
                                    this.f32431OoooO.put(mic3.getMicorder() - 1, mic3);
                                    OooOooO(10016, 0, mic3);
                                    o00OO00O.f43313OooooOo.OooO00o().f43367Ooooo00.postValue(Long.valueOf(mic3.user.getUserId()));
                                    RoomUserInfoModel roomUserInfoModel6 = mic3.user;
                                    if (roomUserInfoModel6 != null && (map = this.f32435OoooOO0) != null && map.containsKey(Long.valueOf(roomUserInfoModel6.getUserId()))) {
                                        this.f32435OoooOO0.remove(Long.valueOf(mic3.user.getUserId()));
                                    }
                                }
                                GetMicModel getMicModel = (GetMicModel) o0Oo0oo.OooO0O0((String) message.obj, GetMicModel.class);
                                if (getMicModel != null && getMicModel.user != null) {
                                    OooO0Oo(getMicModel);
                                }
                                break;
                            case 10017:
                                StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("下麦 ");
                                sbOooO0o2.append(message.obj);
                                o00O00.OooO0OO("麦变更", sbOooO0o2.toString());
                                RoomLoginInformation.MIC mic4 = (RoomLoginInformation.MIC) o0Oo0oo.OooO0O0((String) message.obj, RoomLoginInformation.MIC.class);
                                OooO0o0(mic4);
                                Object obj = (ThrowMicModel) o0Oo0oo.OooO0O0((String) message.obj, ThrowMicModel.class);
                                if (obj != null) {
                                    OooO0Oo(obj);
                                }
                                o00OO00O.f43313OooooOo.OooO00o().f43367Ooooo00.postValue(Long.valueOf(mic4.getUserid()));
                                break;
                            case 10018:
                                com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 抱麦 ----->", message);
                                OooOooO(10018, 0, (TakeMicModel) o0Oo0oo.OooO0O0((String) message.obj, TakeMicModel.class));
                                break;
                            case 10019:
                                o00O00.OooO0oO("Socket----DataSource------- 收到广播-喇叭 ----->" + message);
                                try {
                                    this.f32441Ooooo00 = (AbsJavaBeanApi) o0Oo0oo.OooO0OO((String) message.obj, new o000O0Oo().getType());
                                    o00O00.OooO0O0("收到广播 radioMessage = " + this.f32441Ooooo00);
                                    if (this.f32430Oooo0oo != null && (absJavaBeanApi = this.f32441Ooooo00) != null && absJavaBeanApi.getData() != null && this.f32441Ooooo00.getData().getFrom() != null && String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()).equals(Long.valueOf(this.f32441Ooooo00.getData().getFrom().getUserId())) && this.f32441Ooooo00.getData().getBalance() != null) {
                                        OooO().Oooo00o(this.f32441Ooooo00.getData().getBalance().intValue());
                                    }
                                    OooOooO(10019, 0, this.f32441Ooooo00.getData());
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                                break;
                            default:
                                switch (i) {
                                    case 10029:
                                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 房主设置是否自由上麦 ----->", message);
                                        MicPermissionsModel micPermissionsModel = (MicPermissionsModel) o0Oo0oo.OooO0O0((String) message.obj, MicPermissionsModel.class);
                                        if (micPermissionsModel != null && OooO() != null && OooO().f32427Oooo != null) {
                                            OooO().f32427Oooo.setGuestlive(micPermissionsModel.getAllow() == 1);
                                        }
                                        break;
                                    case 10030:
                                        jSONObject = new JSONObject((String) message.obj);
                                        if (jSONObject.getInt("code") == 0) {
                                            OooOooO(10030, 0, jSONObject.getString("channelkey"));
                                        }
                                        break;
                                    case 10031:
                                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 锁麦 ----->", message);
                                        RoomLoginInformation.MIC mic5 = (RoomLoginInformation.MIC) o0Oo0oo.OooO0O0((String) message.obj, RoomLoginInformation.MIC.class);
                                        if (mic5.f11840code == 0) {
                                            o0O00000.OooO0OO("InRoom_lock_mic_success");
                                            RoomLoginInformation.MIC mic6 = this.f32431OoooO.get(mic5.getOrder() - 1);
                                            if (mic6 != null) {
                                                mic6.setState(1);
                                            }
                                            OooOooO(10031, 0, mic5);
                                        }
                                        break;
                                    case 10032:
                                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 解锁麦 ----->", message);
                                        RoomLoginInformation.MIC mic7 = (RoomLoginInformation.MIC) o0Oo0oo.OooO0O0((String) message.obj, RoomLoginInformation.MIC.class);
                                        if (mic7.f11840code == 0) {
                                            if (this.f32431OoooO.get(mic7.getOrder() - 1) != null) {
                                                this.f32431OoooO.get(mic7.getOrder() - 1).setState(3);
                                            }
                                            OooOooO(10032, 0, mic7);
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 10043:
                                                com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 贵族购买或续费喇叭 ----->", message);
                                                RoomBroadcastOpenNobleModel roomBroadcastOpenNobleModel = (RoomBroadcastOpenNobleModel) o0Oo0oo.OooO0O0((String) message.obj, RoomBroadcastOpenNobleModel.class);
                                                if (roomBroadcastOpenNobleModel != null && roomBroadcastOpenNobleModel.getData() != null) {
                                                    OooOOO oooOOO2 = OooOOO.f41216OooO00o;
                                                    if (kotlin.collections.unsigned.OooO00o.OooO0O0(oooOOO2).equals(roomBroadcastOpenNobleModel.getData().getUserid())) {
                                                        StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0("贵族购买或续费喇叭 VipLevel ");
                                                        sbOooO0o3.append(roomBroadcastOpenNobleModel.getData().getViplevel());
                                                        o00O00.OooO0O0(sbOooO0o3.toString());
                                                        o00O.f43140OooO00o.OooOO0(oooOOO2.OooOo().getValue().longValue()).setPremiumLevel(roomBroadcastOpenNobleModel.getData().getViplevel());
                                                        Objects.requireNonNull(o00O000.OooO());
                                                        o00 o00Var = o00O000.f32468OooO00o;
                                                        if (o00Var != null) {
                                                            o00Var.OooO0o(10044, null);
                                                        }
                                                    }
                                                }
                                                OooOooO(message.what, 0, message.obj);
                                                break;
                                            case 10044:
                                                com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 查询喇叭剩余数量 ----->", message);
                                                BroadcastNumModel broadcastNumModel = (BroadcastNumModel) o0Oo0oo.OooO0O0((String) message.obj, BroadcastNumModel.class);
                                                if (broadcastNumModel != null) {
                                                    StringBuilder sbOooO0o4 = OooO00o.OooO00o.OooO0o0("查询喇叭剩余数量 broadcastNum = ");
                                                    sbOooO0o4.append(broadcastNumModel.balance);
                                                    o00O00.OooO0O0(sbOooO0o4.toString());
                                                    OooO().Oooo00o(broadcastNumModel.balance);
                                                }
                                                break;
                                            case 10045:
                                                com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 通知用户信息变更 ----->", message);
                                                RoomUserInfoChangeModel roomUserInfoChangeModel = (RoomUserInfoChangeModel) o0Oo0oo.OooO0O0((String) message.obj, RoomUserInfoChangeModel.class);
                                                if (roomUserInfoChangeModel != null) {
                                                    StringBuilder sbOooO0o5 = OooO00o.OooO00o.OooO0o0("修改用户头饰信息 roomUserInfoChangeModel = ");
                                                    sbOooO0o5.append(roomUserInfoChangeModel.toJSONString());
                                                    o00O00.OooO0O0(sbOooO0o5.toString());
                                                    try {
                                                        JSONObject jSONObject2 = new JSONObject(String.valueOf(message.obj));
                                                        if (!jSONObject2.has("kaVipLv")) {
                                                            roomUserInfoChangeModel.kaVipLv = -1;
                                                        }
                                                        if (!jSONObject2.has("kaVipState")) {
                                                            roomUserInfoChangeModel.kaVipState = -1;
                                                        }
                                                        if (!jSONObject2.has("showKAVIP")) {
                                                            roomUserInfoChangeModel.showKAVIP = -1;
                                                        }
                                                        if (!jSONObject2.has("showPremiumFirst")) {
                                                            roomUserInfoChangeModel.showPremiumFirst = -1;
                                                        }
                                                    } catch (JSONException e4) {
                                                        e4.printStackTrace();
                                                    }
                                                    for (int i5 = 0; i5 < this.f32431OoooO.size(); i5++) {
                                                        RoomLoginInformation.MIC mic8 = this.f32431OoooO.get(i5);
                                                        if (mic8 != null && (roomUserInfoModel2 = mic8.user) != null && roomUserInfoModel2.getUserId() == roomUserInfoChangeModel.getUid()) {
                                                            mic8.user.setHeaderCardId(0);
                                                            if (com.yalla.support.common.util.OooO0OO.OooO0O0(Integer.valueOf(roomUserInfoChangeModel.vehicleid))) {
                                                                mic8.user.setVehicleId(roomUserInfoChangeModel.vehicleid);
                                                                mic8.user.setVehicleSVGAUrl(roomUserInfoChangeModel.carsvga);
                                                                mic8.user.setVehicleUrl(roomUserInfoChangeModel.carimg);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (roomUserInfoChangeModel != null) {
                                                    OooO0Oo(roomUserInfoChangeModel);
                                                }
                                                OooOooO(message.what, 0, message.obj);
                                                break;
                                            default:
                                                switch (i) {
                                                    case 10047:
                                                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 特殊动画表情 ----->", message);
                                                        ChatModel chatModel5 = (ChatModel) o0Oo0oo.OooO0O0((String) message.obj, ChatModel.class);
                                                        if (chatModel5 != null) {
                                                            RoomUserInfoModel roomUserInfoModel7 = chatModel5.from;
                                                            if (roomUserInfoModel7 != null) {
                                                                o00O.f43140OooO00o.OooOO0o(roomUserInfoModel7.getUserId(), chatModel5.from);
                                                            }
                                                            RoomUserInfoModel roomUserInfoModel8 = chatModel5.from;
                                                            if (roomUserInfoModel8 != null && roomUserInfoModel8.getUserId() == OooOOO.f41216OooO00o.OooOo().getValue().longValue()) {
                                                                if (chatModel5.type == 0) {
                                                                    o0O00000.OooO0OO("InRoom_sayhi_shaizi");
                                                                }
                                                                if (chatModel5.type == 1) {
                                                                    o0O00000.OooO0OO("InRoom_sayhi_caiquan");
                                                                }
                                                            }
                                                            if (chatModel5.type == 0) {
                                                                chatModel5.type = 9;
                                                            }
                                                            if (chatModel5.type == 1) {
                                                                chatModel5.type = 10;
                                                            }
                                                            if (chatModel5.type == 2) {
                                                                for (int i6 = 0; i6 < this.f32431OoooO.size(); i6++) {
                                                                    SparseArray<RoomLoginInformation.MIC> sparseArray3 = this.f32431OoooO;
                                                                    RoomUserInfoModel roomUserInfoModel9 = sparseArray3.get(sparseArray3.keyAt(i6)).user;
                                                                    if (roomUserInfoModel9 != null && roomUserInfoModel9.getUserId() == chatModel5.from.getUserId()) {
                                                                        Intrinsics.checkNotNullParameter("mic_emoji_panel", "key");
                                                                        Observable observable2 = LiveEventBus.get("roommic_emoji_panel", Object.class);
                                                                        Intrinsics.checkNotNullExpressionValue(observable2, "get(\"room$key\", Any::class.java)");
                                                                        observable2.post(new Pair(Integer.valueOf(i6), chatModel5.emjUrl));
                                                                    }
                                                                }
                                                            } else {
                                                                OooO00o(chatModel5);
                                                            }
                                                        }
                                                        break;
                                                    case 10048:
                                                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 有人送所有人金币礼物 ----->", message);
                                                        OooOoO0((GiftRoomAllResultModel) o0Oo0oo.OooO0O0((String) message.obj, GiftRoomAllResultModel.class), GiftPropTypePay.Coin.getValue());
                                                        break;
                                                    case 10049:
                                                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 收到技能卡-头饰技能卡 ----->", message);
                                                        SkillCardModel skillCardModel = (SkillCardModel) o0Oo0oo.OooO0O0((String) message.obj, SkillCardModel.class);
                                                        if (skillCardModel != null) {
                                                            if (skillCardModel.target.getMicPosition() > 0 && (mic = this.f32431OoooO.get(skillCardModel.target.getMicPosition() - 1)) != null && (roomUserInfoModel3 = mic.user) != null) {
                                                                roomUserInfoModel3.setHeaderCardId(skillCardModel.target.getHeaderCardId());
                                                                mic.user.setHeaderCardUrl(skillCardModel.target.getHeaderCardUrl());
                                                            }
                                                            OooOOO oooOOO3 = OooOOO.f41216OooO00o;
                                                            if (oooOOO3.OooOo().getValue().longValue() == skillCardModel.from.getUserId()) {
                                                                oooOOO3.OooO0OO().postValue(Long.valueOf(skillCardModel.balance));
                                                            }
                                                            if (oooOOO3.OooOo().getValue().longValue() == skillCardModel.target.getUserId()) {
                                                                ChatModel chatModel6 = new ChatModel();
                                                                chatModel6.type = 5;
                                                                chatModel6.from = skillCardModel.from;
                                                                chatModel6.to = skillCardModel.target;
                                                                chatModel6.message = o000O0O0.OooO0OO(R.string.send_you) + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000O0O0.OooO0OO(R.string.Hats);
                                                                OooO00o(chatModel6);
                                                            }
                                                            OooOooO(10049, 0, skillCardModel);
                                                        }
                                                        break;
                                                    case 10050:
                                                        com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 收到技能卡-胡言乱语 ----->", message);
                                                        SkillCardModel skillCardModel2 = (SkillCardModel) o0Oo0oo.OooO0O0((String) message.obj, SkillCardModel.class);
                                                        if (skillCardModel2 != null) {
                                                            OooOOO oooOOO4 = OooOOO.f41216OooO00o;
                                                            if (oooOOO4.OooOo().getValue().longValue() == skillCardModel2.from.getUserId()) {
                                                                oooOOO4.OooO0OO().postValue(Long.valueOf(skillCardModel2.balance));
                                                            }
                                                            if (oooOOO4.OooOo().getValue().longValue() == skillCardModel2.target.getUserId()) {
                                                                ChatModel chatModel7 = new ChatModel();
                                                                String strOooO0OO = o000O0O0.OooO0OO(R.string.Crazy_Words);
                                                                if (skillCardModel2.differtype == 10) {
                                                                    chatModel7.type = 11;
                                                                    strOooO0OO = o000O0O0.OooO0OO(R.string.Nonsense);
                                                                }
                                                                if (skillCardModel2.differtype == 38) {
                                                                    chatModel7.type = 12;
                                                                    strOooO0OO = o000O0O0.OooO0OO(R.string.Love_Lines);
                                                                }
                                                                chatModel7.from = skillCardModel2.from;
                                                                chatModel7.message = o000O0O0.OooO0OO(R.string.send_you) + ZegoConstants.ZegoVideoDataAuxPublishingStream + strOooO0OO;
                                                                chatModel7.isSkillCard = true;
                                                                OooO00o(chatModel7);
                                                            }
                                                            OooOooO(10050, 0, skillCardModel2);
                                                        }
                                                        break;
                                                    default:
                                                        FLog.INSTANCE.roomLog(RoomEventType.Room_Socket_UnknowOpecode, null);
                                                        o00O00.OooO0oO("doHandler default Command not processed:" + message.what);
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
            } else {
                OooOooO(i, 0, message.obj);
            }
        } else {
            com.app.base.protobuf.OooO00o.OooO0Oo("Socket----DataSource------- 房间进出通知  ----->", message);
            InOutRoomModel inOutRoomModel = (InOutRoomModel) o0Oo0oo.OooO0O0((String) message.obj, InOutRoomModel.class);
            if (inOutRoomModel != null && inOutRoomModel.getUser() != null) {
                OooO0Oo(inOutRoomModel);
            }
        }
        OooOo0(message);
    }

    public final void OooO0OO(Room.RoshamboModel roshamboModel) {
        o00OO00O o00oo00oOooO00o = o00OO00O.f43313OooooOo.OooO00o();
        ArrayList<Room.RoshamboModel> value = o00oo00oOooO00o.f43339OooOoO.getValue();
        if (value == null) {
            value = new ArrayList<>();
        }
        value.add(0, roshamboModel);
        o00oo00oOooO00o.f43343OooOoo0.postValue(Integer.valueOf(value.size()));
        o00oo00oOooO00o.f43339OooOoO.postValue(value);
    }

    public final void OooO0Oo(Object obj) {
        this.f32446o000oOoO.submit(new OooO0O0(obj));
    }

    public final void OooO0o(ThrowMicModel throwMicModel) {
        OooO0Oo(throwMicModel);
    }

    public final void OooO0o0(RoomLoginInformation.MIC mic) {
        if (mic != null && mic.getCode() == 0) {
            boolean z = true;
            this.f32431OoooO.put(mic.getMicorder() - 1, new RoomLoginInformation.MIC());
            OooOooO(10017, 0, mic);
            if (kotlin.collections.unsigned.OooO00o.OooO0O0(OooOOO.f41216OooO00o).equals(mic.getUserid() + "")) {
                o00O.OooO0o.f43216OooO00o.OooOO0(false);
                if (mic.getReason() == 1) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.go_down_mic);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                    } else {
                        p254o00ooO0O.o00O000 o00o001 = p254o00ooO0O.o00O000.f34346OooO00o;
                        p254o00ooO0O.o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    }
                }
            }
        }
    }

    public final int OooO0oO() {
        for (int i = 0; i < this.f32431OoooO.size(); i++) {
            SparseArray<RoomLoginInformation.MIC> sparseArray = this.f32431OoooO;
            if (sparseArray.get(sparseArray.keyAt(i)).user == null) {
                return i + 1;
            }
        }
        return -1;
    }

    public final int OooO0oo() {
        for (int i = 0; i < this.f32431OoooO.size(); i++) {
            SparseArray<RoomLoginInformation.MIC> sparseArray = this.f32431OoooO;
            RoomLoginInformation.MIC mic = sparseArray.get(sparseArray.keyAt(i));
            if (mic.user == null && (mic.getState() == 3 || mic.getState() == 0)) {
                return i + 1;
            }
        }
        return -1;
    }

    public final int OooOO0(int i) {
        switch (i) {
            case 73:
                return 3;
            case 74:
                return 2;
            case 75:
                return 1;
            case 76:
                return 5;
            case 77:
                return 6;
            default:
                return 0;
        }
    }

    public final HashMap<Long, Boolean> OooOO0O() {
        if (this.f32435OoooOO0 == null) {
            this.f32435OoooOO0 = new HashMap<>();
        }
        return this.f32435OoooOO0;
    }

    public final List<Integer> OooOO0o() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.drawable.icon_number_0));
        arrayList.add(Integer.valueOf(R.drawable.icon_number_1));
        arrayList.add(Integer.valueOf(R.drawable.icon_number_2));
        arrayList.add(Integer.valueOf(R.drawable.icon_number_3));
        arrayList.add(Integer.valueOf(R.drawable.icon_number_4));
        arrayList.add(Integer.valueOf(R.drawable.icon_number_5));
        arrayList.add(Integer.valueOf(R.drawable.icon_number_6));
        arrayList.add(Integer.valueOf(R.drawable.icon_number_7));
        arrayList.add(Integer.valueOf(R.drawable.icon_number_8));
        arrayList.add(Integer.valueOf(R.drawable.icon_number_9));
        return arrayList;
    }

    public final int OooOOO(long j) {
        if (this.f32431OoooO.size() == 0 || j == 0) {
            return -1;
        }
        int size = this.f32431OoooO.size();
        for (int i = 0; i < size; i++) {
            RoomUserInfoModel roomUserInfoModel = this.f32431OoooO.valueAt(i).user;
            if (roomUserInfoModel != null && j == roomUserInfoModel.getUserId()) {
                return i;
            }
        }
        return -1;
    }

    public final RoomConfiguration OooOOO0() {
        return this.f32427Oooo;
    }

    public final boolean OooOOOO(int i) {
        if (i == 0 || i == 179 || i == 73 || i == 74) {
            return false;
        }
        switch (i) {
            case 76:
            case 77:
            case 78:
                return false;
            default:
                return true;
        }
    }

    public final boolean OooOOOo() {
        int i = 0;
        for (int i2 = 0; i2 < this.f32431OoooO.size(); i2++) {
            SparseArray<RoomLoginInformation.MIC> sparseArray = this.f32431OoooO;
            RoomLoginInformation.MIC mic = sparseArray.get(sparseArray.keyAt(i2));
            if (mic.getState() != 1 && mic.getState() != 4) {
                i++;
            }
        }
        return i > 1;
    }

    public final boolean OooOOo(long j) {
        if (j == 0) {
            return false;
        }
        for (int i = 0; i < this.f32431OoooO.size(); i++) {
            SparseArray<RoomLoginInformation.MIC> sparseArray = this.f32431OoooO;
            RoomUserInfoModel roomUserInfoModel = sparseArray.get(sparseArray.keyAt(i)).user;
            if (roomUserInfoModel != null && roomUserInfoModel.getUserId() == j) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooOOo0() {
        return OooOOo(OooOOO.f41216OooO00o.OooOo().getValue().longValue());
    }

    public final void OooOOoo(Room.MoraStartPkRequestReply moraStartPkRequestReply) {
        if (moraStartPkRequestReply == null) {
            return;
        }
        int moraresult = moraStartPkRequestReply.getMoraresult();
        int size = this.f32436OoooOOO.size() <= 50 ? this.f32436OoooOOO.size() : 50;
        for (int i = 0; i < size; i++) {
            if (this.f32436OoooOOO.get(i).type == 14 && this.f32436OoooOOO.get(i).muuid == moraStartPkRequestReply.getMuuid()) {
                if (this.f32436OoooOOO.get(i).pkType != 1) {
                    break;
                }
                this.f32436OoooOOO.get(i).pkType = 2;
                break;
            }
        }
        if (moraresult == 1) {
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            if (!kotlin.collections.unsigned.OooO00o.OooO0O0(oooOOO).equals(String.valueOf(moraStartPkRequestReply.getFromuser().getUserId())) && kotlin.collections.unsigned.OooO00o.OooO0O0(oooOOO).equals(String.valueOf(moraStartPkRequestReply.getJoinuser().getUserId()))) {
                oooOOO.OooO0OO().postValue(Long.valueOf(moraStartPkRequestReply.getBalance()));
            }
            String strOooO0O0 = o00O0O.f42677OooO00o.OooO0O0(moraStartPkRequestReply.getFromuser().getUserId(), moraStartPkRequestReply.getFromuser().getName());
            Oooo0(moraStartPkRequestReply.getToUserId() > 0 ? OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_dialog_guess_win_challenge), strOooO0O0) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.i_Win_mora_game), strOooO0O0), moraStartPkRequestReply, RoomUserInfoModel.INSTANCE.of(moraStartPkRequestReply.getJoinuser()));
        } else if (moraresult == 2) {
            OooOOO oooOOO2 = OooOOO.f41216OooO00o;
            if (kotlin.collections.unsigned.OooO00o.OooO0O0(oooOOO2).equals(String.valueOf(moraStartPkRequestReply.getFromuser().getUserId()))) {
                oooOOO2.OooO0OO().postValue(Long.valueOf(moraStartPkRequestReply.getBalance()));
            } else {
                kotlin.collections.unsigned.OooO00o.OooO0O0(oooOOO2).equals(String.valueOf(moraStartPkRequestReply.getJoinuser().getUserId()));
            }
            String strOooO0O1 = o00O0O.f42677OooO00o.OooO0O0(moraStartPkRequestReply.getFromuser().getUserId(), moraStartPkRequestReply.getFromuser().getName());
            Oooo0(moraStartPkRequestReply.getToUserId() > 0 ? OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_dialog_guess_pie_challenge), strOooO0O1) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.i_tie_mora_game), strOooO0O1), moraStartPkRequestReply, RoomUserInfoModel.INSTANCE.of(moraStartPkRequestReply.getJoinuser()));
        } else if (moraresult != 3) {
            Oooo0o0();
        } else {
            OooOOO oooOOO3 = OooOOO.f41216OooO00o;
            if (kotlin.collections.unsigned.OooO00o.OooO0O0(oooOOO3).equals(String.valueOf(moraStartPkRequestReply.getFromuser().getUserId()))) {
                oooOOO3.OooO0OO().postValue(Long.valueOf(moraStartPkRequestReply.getBalance()));
            } else {
                kotlin.collections.unsigned.OooO00o.OooO0O0(oooOOO3).equals(String.valueOf(moraStartPkRequestReply.getJoinuser().getUserId()));
            }
            String strOooO0O2 = o00O0O.f42677OooO00o.OooO0O0(moraStartPkRequestReply.getJoinuser().getUserId(), moraStartPkRequestReply.getJoinuser().getName());
            Oooo0(moraStartPkRequestReply.getToUserId() > 0 ? OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_dialog_guess_win_challenge), strOooO0O2) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.i_Win_mora_game), strOooO0O2), moraStartPkRequestReply, RoomUserInfoModel.INSTANCE.of(moraStartPkRequestReply.getFromuser()));
        }
        OooOoOO(moraStartPkRequestReply.getMuuid());
    }

    public final void OooOo(Room.RoshamboListReply roshamboListReply) {
        boolean z = roshamboListReply.getListkind() == 0;
        o00OOO00 o00ooo01 = new o00OOO00(roshamboListReply.getNumcount(), z, roshamboListReply.getMorasCount() < 10);
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        oooO00o.OooO00o().f43342OooOoo.postValue(o00ooo01);
        oooO00o.OooO00o().f43343OooOoo0.postValue(Integer.valueOf(roshamboListReply.getNumcount()));
        MutableLiveData<ArrayList<Room.RoshamboModel>> mutableLiveData = oooO00o.OooO00o().f43339OooOoO;
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

    /* JADX WARN: Code duplicated, block: B:169:0x0624 A[Catch: InvalidProtocolBufferException -> 0x0b38, TryCatch #0 {InvalidProtocolBufferException -> 0x0b38, blocks: (B:2:0x0000, B:6:0x0025, B:8:0x002b, B:9:0x0031, B:11:0x0037, B:13:0x0043, B:15:0x0051, B:16:0x005a, B:17:0x005f, B:18:0x007a, B:20:0x00b8, B:22:0x00be, B:23:0x00c7, B:24:0x00ed, B:26:0x00f7, B:27:0x0120, B:28:0x0127, B:30:0x015d, B:33:0x0166, B:35:0x0184, B:37:0x018a, B:38:0x0193, B:40:0x0199, B:41:0x01b9, B:42:0x01d2, B:45:0x01eb, B:46:0x01f4, B:48:0x0218, B:52:0x0229, B:54:0x0238, B:59:0x0243, B:61:0x0259, B:62:0x025e, B:63:0x0267, B:65:0x0271, B:68:0x028e, B:74:0x029d, B:75:0x02a6, B:76:0x02c8, B:78:0x02d5, B:79:0x02de, B:82:0x02ef, B:84:0x02f9, B:86:0x031c, B:87:0x0329, B:90:0x033a, B:92:0x0344, B:94:0x035b, B:95:0x035e, B:96:0x037d, B:98:0x03a8, B:100:0x03c2, B:101:0x03ea, B:102:0x03fa, B:103:0x0403, B:104:0x0417, B:105:0x042c, B:106:0x0449, B:108:0x0453, B:109:0x045e, B:111:0x047c, B:112:0x0498, B:114:0x04b6, B:115:0x04db, B:118:0x04ec, B:120:0x0503, B:122:0x0509, B:123:0x0518, B:125:0x0522, B:127:0x0528, B:128:0x0551, B:131:0x055c, B:133:0x0562, B:135:0x0568, B:137:0x0573, B:136:0x056e, B:139:0x0583, B:141:0x0589, B:143:0x0594, B:148:0x059e, B:150:0x05b4, B:151:0x05b8, B:153:0x05c0, B:154:0x05cb, B:156:0x05d5, B:158:0x05db, B:160:0x05f5, B:161:0x05fe, B:163:0x0604, B:165:0x0614, B:166:0x061b, B:167:0x061e, B:169:0x0624, B:170:0x0636, B:171:0x0641, B:173:0x064c, B:178:0x0657, B:180:0x066d, B:181:0x0672, B:182:0x067b, B:184:0x06a6, B:186:0x06b0, B:188:0x06ca, B:189:0x06f2, B:191:0x0709, B:192:0x0718, B:194:0x071e, B:195:0x072f, B:197:0x0737, B:206:0x0762, B:202:0x0741, B:204:0x0757, B:205:0x075b, B:207:0x0767, B:210:0x0776, B:211:0x07ab, B:221:0x07de, B:213:0x07af, B:214:0x07b5, B:215:0x07bb, B:216:0x07c1, B:217:0x07c7, B:218:0x07cd, B:219:0x07d3, B:220:0x07d9, B:222:0x07e3, B:223:0x07f7, B:227:0x0812, B:229:0x081e, B:226:0x080e, B:230:0x0823, B:232:0x0832, B:234:0x084c, B:235:0x0855, B:236:0x085a, B:238:0x0869, B:240:0x0883, B:242:0x089d, B:251:0x08c8, B:247:0x08a7, B:249:0x08bd, B:250:0x08c1, B:252:0x08d3, B:253:0x094f, B:255:0x095f, B:256:0x096e, B:257:0x0974, B:260:0x0990, B:262:0x09b6, B:264:0x09be, B:269:0x09c8, B:271:0x09de, B:272:0x09e2, B:273:0x09e9, B:274:0x09f7, B:277:0x0a0c, B:280:0x0a16, B:284:0x0a7a, B:281:0x0a22, B:283:0x0a2e, B:285:0x0a7d, B:288:0x0a95, B:290:0x0aaa, B:291:0x0ab7, B:287:0x0a88, B:292:0x0ac2, B:294:0x0acc, B:296:0x0ad2, B:297:0x0ad7, B:299:0x0af9, B:301:0x0b0d, B:303:0x0b20, B:304:0x0b2f), top: B:309:0x0000 }] */
    public final void OooOo0(Message message) {
        Room.NewSendBonusAddMessage from;
        Room.NewSendBonusSubMessage from2;
        try {
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            Boolean value = oooOOO.OooOooO().getValue();
            int i = message.what;
            int i2 = 10;
            switch (i) {
                case 10051:
                    o00O00.OooO0oO("Socket----DataSource------- 幸运数字 ----->" + message);
                    ChatModel chatModel = (ChatModel) o0Oo0oo.OooO0O0((String) message.obj, ChatModel.class);
                    if (chatModel != null) {
                        if (chatModel.isMySelfMessage(oooOOO.OooOo().getValue().longValue())) {
                            oooOOO.OooO0OO().postValue(Long.valueOf(chatModel.fromcoin));
                            if (chatModel.isGetLuckyNumber()) {
                                LiveEventBus.get("LuckyNumberOpenDialog").post(Integer.valueOf(chatModel.number));
                            }
                        }
                        chatModel.luckNumAnim = true;
                        chatModel.type = 4;
                        OooO00o(chatModel);
                    }
                    break;
                case 10054:
                    Room.UserListReply from3 = Room.UserListReply.parseFrom((byte[]) message.obj);
                    if (from3 != null && from3.getUsersList() != null) {
                        OooO0Oo(from3);
                        break;
                    }
                    break;
                case 10058:
                    Room.MicNumChangeReply from4 = Room.MicNumChangeReply.parseFrom((byte[]) message.obj);
                    SparseArray<RoomLoginInformation.MIC> sparseArray = new SparseArray<>();
                    if (from4.getMictype() == 0) {
                        for (int i3 = 0; i3 < this.f32431OoooO.size(); i3++) {
                            if (i3 < 5) {
                                sparseArray.put(i3, this.f32431OoooO.get(i3));
                            } else if (this.f32431OoooO.get(i3).user != null) {
                                ThrowMicModel throwMicModel = new ThrowMicModel();
                                throwMicModel.micorder = this.f32431OoooO.get(i3).getMicorder();
                                throwMicModel.reason = 0;
                                throwMicModel.userid = this.f32431OoooO.get(i3).user.getUserId();
                                this.f32431OoooO.get(i3).setUserid(this.f32431OoooO.get(i3).user.getUserId());
                                OooO0o0(this.f32431OoooO.get(i3));
                                OooO0o(throwMicModel);
                            }
                        }
                        this.f32431OoooO.clear();
                        this.f32431OoooO = sparseArray;
                        i2 = 5;
                    } else {
                        for (int i4 = 5; i4 < 10; i4++) {
                            this.f32431OoooO.put(i4, new RoomLoginInformation.MIC());
                        }
                    }
                    p034OoooO0O.o0Oo0oo.OooO0o0(177, Integer.valueOf(from4.getMictype()));
                    if (this.f32430Oooo0oo.getRoom() != null) {
                        this.f32430Oooo0oo.getRoom().setMictype(from4.getMictype());
                    }
                    OooOooo(10058, Integer.valueOf(i2));
                    break;
                case 10059:
                    o00O00.OooO0O0("---- 房间公告跟新----");
                    String noticemsg = Room.NoticeContentChangeReply.parseFrom((byte[]) message.obj).getNoticemsg();
                    RoomConfiguration roomConfigurationOooOOO0 = OooO().OooOOO0();
                    if (roomConfigurationOooOOO0 != null) {
                        roomConfigurationOooOOO0.setNotice(noticemsg);
                        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
                        oooO00o.OooO00o().OooO0o0().postValue(null);
                        oooO00o.OooO00o().OooOO0o().postValue(noticemsg);
                        if (oooO00o.OooO00o().OooOOo0()) {
                            String strOooO0OO = o000O0O0.OooO0OO(R.string.Success);
                            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                            if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? (char) 1 : (char) 0) == 0) {
                                o0O0ooO runnable = new o0O0ooO(toastUtil, strOooO0OO);
                                Intrinsics.checkNotNullParameter(runnable, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    runnable.run();
                                } else {
                                    p254o00ooO0O.o00O000 o00o001 = p254o00ooO0O.o00O000.f34346OooO00o;
                                    p254o00ooO0O.o00O000.f34348OooO0OO.post(runnable);
                                }
                            }
                        }
                        Oooo00O(roomConfigurationOooOOO0.getNotice());
                        p034OoooO0O.o0Oo0oo.OooO0o0(33, roomConfigurationOooOOO0);
                        break;
                    }
                    break;
                case 10060:
                    Room.UserInfoReply from5 = Room.UserInfoReply.parseFrom((byte[]) message.obj);
                    if (from5.getCode() == 0) {
                        OooOooo(10060, RoomUserInfoModel.INSTANCE.of(from5.getUser()));
                    } else {
                        OooOooo(10060, null);
                    }
                    break;
                case 10062:
                    o00O00.OooO0O0("---- 发起猜拳后，收到扣钱回调----");
                    Room.MoraStartUpRequestReply from6 = Room.MoraStartUpRequestReply.parseFrom((byte[]) message.obj);
                    if (from6 != null) {
                        if (from6.getFromuser().getUserId() == oooOOO.OooOo().getValue().longValue()) {
                            oooOOO.OooO0OO().postValue(Long.valueOf(from6.getBalance()));
                            String strOooO0OO2 = o000O0O0.OooO0OO(R.string.start_mora_game_success);
                            ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                            if (((strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) ? (char) 1 : (char) 0) == 0) {
                                o0O0ooO runnable2 = new o0O0ooO(toastUtil2, strOooO0OO2);
                                Intrinsics.checkNotNullParameter(runnable2, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    runnable2.run();
                                } else {
                                    p254o00ooO0O.o00O000 o00o002 = p254o00ooO0O.o00O000.f34346OooO00o;
                                    p254o00ooO0O.o00O000.f34348OooO0OO.post(runnable2);
                                }
                            }
                            LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE").post(Boolean.TRUE);
                        }
                        Oooo000(o000O0O0.OooO0OO(R.string.launch_mora), from6);
                        Room.RoshamboModel.Builder builderNewBuilder = Room.RoshamboModel.newBuilder();
                        builderNewBuilder.setHeadphoto(from6.getFromuser().getHeadphoto()).setMoragiftid(from6.getMoragiftid()).setGiftImage(from6.getGiftimage()).setGiftprice(from6.getGiftprice()).setMoranum(from6.getMoranum()).setMorauuid(from6.getMuuid()).setUserId(from6.getFromuser().getUserId()).setName(from6.getFromuser().getName()).setToUserId(from6.getToUserId()).setToNickname(from6.getToNickname()).setToHeadphoto(from6.getToHeadphoto());
                        OooO0OO(builderNewBuilder.build());
                    }
                    break;
                case 10063:
                    o00O00.OooO0O0("----点击猜拳后，和别人PK的结果----");
                    Room.MoraStartPkRequestReply from7 = Room.MoraStartPkRequestReply.parseFrom((byte[]) message.obj);
                    if (from7 != null) {
                        if (from7.getJoinuser().getUserId() == oooOOO.OooOo().getValue().longValue()) {
                            OooOooo(10063, from7);
                            this.f32440OoooOoo = from7;
                        } else {
                            OooOOoo(from7);
                        }
                    }
                    break;
                case 10065:
                    Room.RoshamboListReply from8 = Room.RoshamboListReply.parseFrom((byte[]) message.obj);
                    StringBuilder sb = new StringBuilder();
                    sb.append("---- 获取到猜拳游戏列表----");
                    sb.append(from8 == null ? "null " : from8.toByteString());
                    o00O00.OooO0O0(sb.toString());
                    if (from8 != null) {
                        OooOo(from8);
                    }
                    break;
                case 10066:
                    Room.MagicVoiceOut from9 = Room.MagicVoiceOut.parseFrom((byte[]) message.obj);
                    OooOo0O(from9);
                    o00O00.OooO0OO("MR_ProtobufMessage", from9.toString());
                    break;
                case 10067:
                    Room.GifMoticonReply from10 = Room.GifMoticonReply.parseFrom((byte[]) message.obj);
                    if (from10.getCode() == 0) {
                        ChatModel chatModel2 = new ChatModel();
                        chatModel2.from = RoomUserInfoModel.INSTANCE.of(from10.getSender());
                        chatModel2.uuid = from10.getUuid();
                        chatModel2.type = 16;
                        ChatMessageOld.Gif gif = new ChatMessageOld.Gif();
                        chatModel2.gif = gif;
                        gif.gifId = (int) from10.getGifid();
                        chatModel2.gif.gifUrl = from10.getGifurl();
                        switch (chatModel2.gif.gifId) {
                            case 1:
                                o0O00000.OooO0OO("InRoom_sayhi_horse_hi");
                                break;
                            case 2:
                                o0O00000.OooO0OO("InRoom_sayhi_horse_flirt");
                                break;
                            case 3:
                                o0O00000.OooO0OO("InRoom_sayhi_horse_applause");
                                break;
                            case 4:
                                o0O00000.OooO0OO("InRoom_sayhi_horse_excited");
                                break;
                            case 5:
                                o0O00000.OooO0OO("InRoom_sayhi_horse_strong");
                                break;
                            case 6:
                                o0O00000.OooO0OO("InRoom_sayhi_horse_cheer");
                                break;
                            case 7:
                                o0O00000.OooO0OO("InRoom_sayhi_horse_cry");
                                break;
                            case 8:
                                o0O00000.OooO0OO("InRoom_sayhi_horse_goodbye");
                                break;
                        }
                        OooO00o(chatModel2);
                        break;
                    }
                    break;
                case 10068:
                    String strOooO0OO3 = o000O0O0.OooO0OO(R.string.Success);
                    ToastUtil toastUtil3 = ToastUtil.f12568OooO0O0;
                    if (((strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3)) ? (char) 1 : (char) 0) == 0) {
                        o0O0ooO runnable3 = new o0O0ooO(toastUtil3, strOooO0OO3);
                        Intrinsics.checkNotNullParameter(runnable3, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            runnable3.run();
                        } else {
                            p254o00ooO0O.o00O000 o00o003 = p254o00ooO0O.o00O000.f34346OooO00o;
                            p254o00ooO0O.o00O000.f34348OooO0OO.post(runnable3);
                        }
                    }
                    p034OoooO0O.o0Oo0oo.OooO0Oo();
                    break;
                case 10070:
                    Room.kickTouristRequestReply from11 = Room.kickTouristRequestReply.parseFrom((byte[]) message.obj);
                    Observable<Object> observable = LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM");
                    Boolean bool = Boolean.TRUE;
                    observable.post(bool);
                    if (from11.getKickOp() == 1) {
                        o00OO00O.f43313OooooOo.OooO00o().OooO0OO().postValue(bool);
                    } else if (from11.getKickOp() == 2) {
                        o00OO00O.f43313OooooOo.OooO00o().OooO0OO().postValue(Boolean.FALSE);
                    }
                    break;
                case 10071:
                    Room.ChangeLuckNumSetReply from12 = Room.ChangeLuckNumSetReply.parseFrom((byte[]) message.obj);
                    o00O00.OooO0O0("Socket----DataSource------- 幸运数字 设置者收到结果 ----->" + message.what + ", reply = ‘" + from12 + "’");
                    if (from12 != null && from12.getCode().getCode() == 0) {
                        Oooo0oo(from12.getLucknumcost(), from12.getLucknummode(), from12.getLuckNum(), from12.getIsAdminManage());
                        if (from12.getIsNewSet()) {
                            ChatModel chatModel3 = new ChatModel();
                            chatModel3.type = 33;
                            chatModel3.lucknum = from12.getLuckNum();
                            chatModel3.luckSetRole = from12.getOperator().getRole();
                            chatModel3.luckSetRoleUserId = from12.getOperator().getUserId();
                            OooO00o(chatModel3);
                        }
                        break;
                    }
                    break;
                case 10072:
                    Room.GetBonusReply from13 = Room.GetBonusReply.parseFrom((byte[]) message.obj);
                    if (from13 == null || from13.getCode() != 0) {
                        String strOooO0OO4 = o000O0O0.OooO0OO(R.string.wrong_parameter);
                        ToastUtil toastUtil4 = ToastUtil.f12568OooO0O0;
                        if (((strOooO0OO4 == null || StringsKt.isBlank(strOooO0OO4)) ? (char) 1 : (char) 0) == 0) {
                            o0O0ooO runnable4 = new o0O0ooO(toastUtil4, strOooO0OO4);
                            Intrinsics.checkNotNullParameter(runnable4, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                runnable4.run();
                            } else {
                                p254o00ooO0O.o00O000 o00o004 = p254o00ooO0O.o00O000.f34346OooO00o;
                                p254o00ooO0O.o00O000.f34348OooO0OO.post(runnable4);
                            }
                        }
                    } else {
                        o0O00000.OooO0OO("InRoom_LuckyBag_open");
                        MutableLiveData<List<Room.EnvelopInfo>> mutableLiveDataOooO0Oo = o00OO00O.f43313OooooOo.OooO00o().OooO0Oo();
                        ArrayList arrayList = new ArrayList();
                        if (mutableLiveDataOooO0Oo.getValue() != null) {
                            arrayList.addAll(mutableLiveDataOooO0Oo.getValue());
                        }
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            if (((Room.EnvelopInfo) arrayList.get(i5)).getBonusid() == from13.getBonusid()) {
                                arrayList.remove(i5);
                                mutableLiveDataOooO0Oo.setValue(arrayList);
                                if (from13.getState() == 1) {
                                    OooOOO.f41216OooO00o.OooO0OO().setValue(Long.valueOf(from13.getLastestbalance()));
                                }
                                LiveEventBus.get("LuckyPacket_OpenResult_Ok").post(from13);
                            }
                            break;
                        }
                        if (from13.getState() == 1) {
                            OooOOO.f41216OooO00o.OooO0OO().setValue(Long.valueOf(from13.getLastestbalance()));
                        }
                        LiveEventBus.get("LuckyPacket_OpenResult_Ok").post(from13);
                    }
                    break;
                case 10073:
                    Room.NewSendBonusReply from14 = Room.NewSendBonusReply.parseFrom((byte[]) message.obj);
                    if (from14 != null) {
                        if (from14.getCode() == 0) {
                            if (from14.getBonustype() == 2) {
                                o0O00000.OooO0OO("InRoom_luckyBag_Gifts_success");
                            } else {
                                o0O00000.OooO0OO("InRoom_luckyBag_Golds_success");
                            }
                            oooOOO.OooO0OO().postValue(Long.valueOf(from14.getLeftcoin()));
                        } else if (from14.getCode() == 1) {
                            String strOooO0OO5 = o000O0O0.OooO0OO(R.string.Operation_failed);
                            ToastUtil toastUtil5 = ToastUtil.f12568OooO0O0;
                            if (((strOooO0OO5 == null || StringsKt.isBlank(strOooO0OO5)) ? (char) 1 : (char) 0) == 0) {
                                o0O0ooO runnable5 = new o0O0ooO(toastUtil5, strOooO0OO5);
                                Intrinsics.checkNotNullParameter(runnable5, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    runnable5.run();
                                } else {
                                    p254o00ooO0O.o00O000 o00o005 = p254o00ooO0O.o00O000.f34346OooO00o;
                                    p254o00ooO0O.o00O000.f34348OooO0OO.post(runnable5);
                                }
                            }
                        } else {
                            o.OooO0OO(from14.getCode(), message.what, from14);
                        }
                        break;
                    }
                    break;
                case 10074:
                    Room.SetAutoGrabBonusReply from15 = Room.SetAutoGrabBonusReply.parseFrom((byte[]) message.obj);
                    if (from15 != null && from15.getCode() == 0) {
                        this.f32430Oooo0oo.setAutoGrabBonus(from15.getAutotype());
                        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                        OooOOO0.OooO0oO().OooOOoo(from15.getAutotype());
                        LiveEventBus.get("LuckyPacket_AutoShowDialog").post(Integer.valueOf(from15.getAutotype()));
                        break;
                    }
                    break;
                case 10075:
                    if (oooOOO.OooOooO().getValue().booleanValue()) {
                        Room.GetEnvelopListReply from16 = Room.GetEnvelopListReply.parseFrom((byte[]) message.obj);
                        ArrayList arrayList2 = new ArrayList(from16.getEnvelopsList());
                        if (from16.getCode() == 0 && arrayList2.size() > 0) {
                            o00OO00O.f43313OooooOo.OooO00o().OooO0Oo().setValue(arrayList2);
                            break;
                        }
                    }
                    break;
                case 10076:
                    Room.GetBonusMessage from17 = Room.GetBonusMessage.parseFrom((byte[]) message.obj);
                    o00O00.OooO0O0("Socket----DataSource------- 抢到红包聊天框消息 新红包 -----> 10076 getBonusMessage = " + from17);
                    if (from17 != null) {
                        RoomUserInfoModel roomUserInfoModelOf = RoomUserInfoModel.INSTANCE.of(from17.getUser());
                        o00O.f43140OooO00o.OooOO0o(roomUserInfoModelOf.getUserId(), roomUserInfoModelOf);
                        ChatModel chatModel4 = new ChatModel();
                        chatModel4.type = 17;
                        chatModel4.from = roomUserInfoModelOf;
                        chatModel4.getBonusMessage = from17;
                        OooO00o(chatModel4);
                    }
                    break;
                case 10077:
                    Room.SendBonusMessage from18 = Room.SendBonusMessage.parseFrom((byte[]) message.obj);
                    o00O00.OooO0O0("Socket----DataSource------- 发红包时响应该房间内的所有人 新红包 -----> 10077 sendBonusMessage = " + from18);
                    if (from18 != null) {
                        RoomUserInfoModel roomUserInfoModelOf2 = RoomUserInfoModel.INSTANCE.of(from18.getUser());
                        ChatModel chatModel5 = new ChatModel();
                        chatModel5.type = 18;
                        chatModel5.from = roomUserInfoModelOf2;
                        chatModel5.sendBonusMessage = from18;
                        OooO00o(chatModel5);
                    }
                    break;
                case 10078:
                    Room.BonusDetailReply from19 = Room.BonusDetailReply.parseFrom((byte[]) message.obj);
                    if (from19 != null) {
                        LiveEventBus.get("LuckyPacket_Detail").post(from19);
                    }
                    break;
                case 100611:
                    o00O00.OooO0O0("---- 发出邀请后返回的Code码 房主收到----");
                    OooOooo(100611, Integer.valueOf(Room.InviteBarMemberRequestReply.parseFrom((byte[]) message.obj).getCode()));
                    break;
                case 100612:
                    o00O00.OooO0O0("---- 发出邀请后返回的Code码 游客收到----");
                    OooOooo(100612, Room.InviteBarMemberToRequestReply.parseFrom((byte[]) message.obj));
                    break;
                case 100661:
                    Room.MagicVoiceExpireNotify from20 = Room.MagicVoiceExpireNotify.parseFrom((byte[]) message.obj);
                    OooOo0o(from20);
                    o00O00.OooO0OO("MR_ProtobufMessage", from20.toString());
                    break;
                case 100701:
                    o.OooO0OO(1011, i, "");
                    break;
                case 100702:
                    RoomStateManager.INSTANCE.disconnectRoom();
                    LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM").post(Boolean.FALSE);
                    break;
                case 100711:
                    Room.ChangeLuckNumSetOtherReply from21 = Room.ChangeLuckNumSetOtherReply.parseFrom((byte[]) message.obj);
                    o00O00.OooO0O0("Socket----DataSource------- 幸运数字 其他人收到通知 ----->" + message.what + ", setOtherReply = ‘" + from21 + "’");
                    if (from21 != null) {
                        Oooo0oo(from21.getLucknumcost(), from21.getLucknummode(), from21.getLuckNum(), from21.getIsAdminManage());
                        if (from21.getIsNewSet()) {
                            ChatModel chatModel6 = new ChatModel();
                            chatModel6.type = 34;
                            chatModel6.lucknum = from21.getLuckNum();
                            chatModel6.luckSetRole = from21.getOperator().getRole();
                            chatModel6.luckSetRoleUserId = from21.getOperator().getUserId();
                            OooO00o(chatModel6);
                        }
                    }
                    break;
                case 100731:
                    if (oooOOO.OooOooO().getValue().booleanValue() && (from = Room.NewSendBonusAddMessage.parseFrom((byte[]) message.obj)) != null) {
                        o00OO00O.OooO00o oooO00o2 = o00OO00O.f43313OooooOo;
                        List<Room.EnvelopInfo> value2 = oooO00o2.OooO00o().OooO0Oo().getValue();
                        ArrayList arrayList3 = new ArrayList();
                        if (value2 != null) {
                            arrayList3.addAll(value2);
                        }
                        arrayList3.add(from.getEnvelop());
                        oooO00o2.OooO00o().OooO0Oo().setValue(arrayList3);
                        LiveEventBus.get("LuckyPacket_AddNew").post(Boolean.TRUE);
                    }
                    break;
                case 100732:
                    if (oooOOO.OooOooO().getValue().booleanValue() && (from2 = Room.NewSendBonusSubMessage.parseFrom((byte[]) message.obj)) != null) {
                        o00OO00O.OooO00o oooO00o3 = o00OO00O.f43313OooooOo;
                        List<Room.EnvelopInfo> value3 = oooO00o3.OooO00o().OooO0Oo().getValue();
                        boolean zOooO0OO = o00oOoo.OooO0OO(value3, new OooO00o(from2));
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.addAll(value3);
                        if (zOooO0OO) {
                            oooO00o3.OooO00o().OooO0Oo().setValue(arrayList4);
                        }
                    }
                    break;
                case 1000000:
                    Room.StartTurnTableMsg from22 = Room.StartTurnTableMsg.parseFrom((byte[]) message.obj);
                    if (from22 != null && from22.getRoomId() == o00OO00O.f43313OooooOo.OooO00o().OooO0o().getValue().longValue()) {
                        int gameStatus = from22.getGameStatus();
                        if (gameStatus != -1) {
                            if (gameStatus == 0) {
                                Intrinsics.checkNotNullParameter("Turntable_Wait", "key");
                                Observable observable2 = LiveEventBus.get("roomTurntable_Wait", Object.class);
                                Intrinsics.checkNotNullExpressionValue(observable2, "get(\"room$key\", Any::class.java)");
                                observable2.post(Boolean.TRUE);
                                o00O.OooOOO0.f43257OooO00o.OooO0Oo(TurntableGameState.Wait);
                            } else if (gameStatus == 1) {
                                o00O.OooOOO0.f43257OooO00o.OooO0Oo(TurntableGameState.Start);
                            } else if (gameStatus != 2) {
                            }
                        }
                        o00O.OooOOO0.f43257OooO00o.OooO0Oo(TurntableGameState.Close);
                        if (from22.getShowBox() == 1) {
                            OooOooo(CommonError.Other_Device_Login, null);
                        }
                        break;
                    }
                    break;
                case 1000002:
                    Room.AllowMicRightOut from23 = Room.AllowMicRightOut.parseFrom((byte[]) message.obj);
                    long roomId = from23.getRoomId();
                    o00OO00O.OooO00o oooO00o4 = o00OO00O.f43313OooooOo;
                    if (roomId == oooO00o4.OooO00o().OooO0o().getValue().longValue()) {
                        oooO00o4.OooO00o().OooO0O0().postValue(Boolean.valueOf(from23.getAllowMicStatus() == 1));
                        String strOooO0OO6 = o000O0O0.OooO0OO(R.string.Success);
                        ToastUtil toastUtil6 = ToastUtil.f12568OooO0O0;
                        if (((strOooO0OO6 == null || StringsKt.isBlank(strOooO0OO6)) ? (char) 1 : (char) 0) == 0) {
                            o0O0ooO runnable6 = new o0O0ooO(toastUtil6, strOooO0OO6);
                            Intrinsics.checkNotNullParameter(runnable6, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                runnable6.run();
                            } else {
                                p254o00ooO0O.o00O000 o00o006 = p254o00ooO0O.o00O000.f34346OooO00o;
                                p254o00ooO0O.o00O000.f34348OooO0OO.post(runnable6);
                            }
                        }
                    }
                    break;
                case 1000003:
                    o00OO00O.f43313OooooOo.OooO00o().OooO0O0().postValue(Boolean.valueOf(Room.AllowMicRightOut.parseFrom((byte[]) message.obj).getAllowMicStatus() == 1));
                    break;
                case 1000005:
                    Room.ErrorEvent from24 = Room.ErrorEvent.parseFrom((byte[]) message.obj);
                    o.OooO0OO(from24.getErrcode(), from24.getPckcode(), from24.getContent());
                    break;
                case 1100000:
                    Room.InitiateVoteReply from25 = Room.InitiateVoteReply.parseFrom((byte[]) message.obj);
                    o00O00.OooO0O0("发起投票返回——>code=" + from25.getCode() + ",voteId=" + from25.getVoteId());
                    if (from25.getVoteId() > 0 || from25.getCreateUserId() > 0) {
                        RoomGameConfig.Vote vote = new RoomGameConfig.Vote();
                        vote.setVoteId(from25.getVoteId());
                        vote.setStatus(0);
                        o00OO00O.f43313OooooOo.OooO00o().OooOOO0().postValue(vote);
                        if (value != null && value.booleanValue()) {
                            LiveEventBus.get("INITIATE_VOTE_REQUEST").post(from25);
                        }
                        if (from25.getCode() == 0) {
                            ChatModel chatModel7 = new ChatModel();
                            chatModel7.voteId = from25.getVoteId();
                            chatModel7.from = RoomUserInfoModel.INSTANCE.of(from25.getCreateUserView());
                            chatModel7.type = 21;
                            chatModel7.voteIsRunning = true;
                            OooO00o(chatModel7);
                        }
                    }
                    break;
                case 1100001:
                    Room.VoteResultNotify from26 = Room.VoteResultNotify.parseFrom((byte[]) message.obj);
                    o00O00.OooO0O0("结束投票返回——>voteId=" + from26.getVoteId());
                    RoomGameConfig.Vote vote2 = new RoomGameConfig.Vote();
                    vote2.setVoteId(from26.getVoteId());
                    vote2.setStatus(10);
                    o00OO00O.f43313OooooOo.OooO00o().OooOOO0().postValue(vote2);
                    if (value != null && value.booleanValue()) {
                        LiveEventBus.get("END_UP_VOTE_GAME").post(from26);
                    }
                    ChatModel chatModel8 = new ChatModel();
                    chatModel8.voteId = from26.getVoteId();
                    chatModel8.from = RoomUserInfoModel.INSTANCE.of(from26.getCreateUserView());
                    chatModel8.type = 21;
                    chatModel8.voteIsRunning = false;
                    chatModel8.voteGiftImage = from26.getGiftImage();
                    ArrayList arrayList5 = new ArrayList();
                    for (int i6 = 0; i6 < from26.getResultList().size(); i6++) {
                        ChatModel.VoteResult voteResult = new ChatModel.VoteResult();
                        voteResult.nickName = from26.getResult(i6).getNickName();
                        voteResult.totalCount = from26.getResult(i6).getTotalCount();
                        voteResult.userId = from26.getResult(i6).getUserId();
                        arrayList5.add(voteResult);
                    }
                    chatModel8.voteResultList = arrayList5;
                    OooO00o(chatModel8);
                    break;
                case 1100002:
                    LiveEventBus.get("UPDATE_VOTE_GAME").post(Long.valueOf(Room.NumOfVotesUpdateNotifyIn.parseFrom((byte[]) message.obj).getRoomId()));
                    break;
                case 10008010:
                    SubscribeNotifyModel subscribeNotifyModel = (SubscribeNotifyModel) message.obj;
                    if (subscribeNotifyModel != null) {
                        for (ChatModel chatModel9 : this.f32436OoooOOO) {
                            if (chatModel9.type == 26 && chatModel9.eventModel.getId() == subscribeNotifyModel.getEventId()) {
                                chatModel9.eventModel.setHasSubscribe(subscribeNotifyModel.getHasSubscribe());
                                Oooo0o0();
                                break;
                            }
                        }
                        Oooo0o0();
                    }
                    break;
            }
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
            o00O00.OooO0Oo("Socket Error:" + e.getMessage());
        }
    }

    public final void OooOo00(RoomLoginInformation roomLoginInformation) {
        if (roomLoginInformation == null || roomLoginInformation.getRoom() == null) {
            return;
        }
        long id = roomLoginInformation.getRoom().getId();
        if (0 == id) {
            return;
        }
        if (this.f32444OooooOO != id) {
            this.f32443OooooO0 = 0;
            this.f32444OooooOO = id;
        }
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = o00000OO.f32210OooO0Oo;
        String strValueOf = String.valueOf(id);
        OooO0OO oooO0OO = new OooO0OO(roomLoginInformation);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("barid", strValueOf);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, "/Webservers/Bar/RoomInfo", mapOooO0O0, oooO0OO);
    }

    public final void OooOo0O(Room.MagicVoiceOut magicVoiceOut) {
        long userId = magicVoiceOut.getFrom().getUserId();
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        if (userId == Long.parseLong(String.valueOf(oooOOO.OooOo().getValue()))) {
            oooOOO.OooO0OO().postValue(Long.valueOf(magicVoiceOut.getBalance()));
        }
        if (OooOOOO(magicVoiceOut.getCardid())) {
            return;
        }
        if (magicVoiceOut.getTarget().getUserId() == Long.parseLong(String.valueOf(oooOOO.OooOo().getValue()))) {
            ChatModel chatModel = new ChatModel();
            chatModel.type = 15;
            int cardid = magicVoiceOut.getCardid();
            int i = OooOo00.f32638OooO00o;
            String str = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date());
            StringBuilder sb = new StringBuilder();
            p487o0o000oO.o00oO0o o00oo0o2 = p487o0o000oO.o00oO0o.f40931OooO00o;
            sb.append(p487o0o000oO.o00oO0o.f40934OooO0Oo);
            sb.append("/SkillCard/");
            sb.append(cardid);
            sb.append(".png?");
            sb.append(str);
            chatModel.magicVoiceInfo = new ChatModel.MagicVoiceInfo(magicVoiceOut.getCardid(), sb.toString());
            chatModel.from = RoomUserInfoModel.INSTANCE.of(magicVoiceOut.getFrom());
            chatModel.message = o000O0O0.OooO0OO(R.string.message_room_send_voice_changer);
            OooO00o(chatModel);
            if (OooOOo0()) {
                o0O0OOOo.OooO0O0().OooO00o().OooO0Oo(OooOO0(magicVoiceOut.getCardid()));
            }
        }
        RoomLoginInformation.MIC mic = this.f32431OoooO.get(OooOOO(magicVoiceOut.getTarget().getUserId()));
        if (mic != null) {
            mic.setVoicecard(magicVoiceOut.getCardid());
        }
        OooOooO(10066, 0, magicVoiceOut);
    }

    public final void OooOo0o(Room.MagicVoiceExpireNotify magicVoiceExpireNotify) {
        if (magicVoiceExpireNotify.getUserId() == Long.parseLong(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue())) && OooOOo0()) {
            o0O0OOOo.OooO0O0().OooO00o().OooO0Oo(OooOO0(0));
        }
        if (OooOOo(magicVoiceExpireNotify.getUserId())) {
            int iOooOOO = OooOOO(magicVoiceExpireNotify.getUserId());
            this.f32431OoooO.get(iOooOOO).setVoicecard(0);
            OooOooO(100661, iOooOOO, null);
        }
    }

    public final void OooOoO(GiftRoomModel giftRoomModel, int i, Boolean bool) {
        if (giftRoomModel != null) {
            Oooo0o(giftRoomModel, i);
            if (bool.booleanValue()) {
                try {
                    if (Long.parseLong(this.f32427Oooo.getBarid()) == giftRoomModel.roominfo.getId()) {
                        int i2 = giftRoomModel.number;
                        ChatModel chatModel = new ChatModel();
                        chatModel.type = 1;
                        chatModel.number = i2;
                        chatModel.giftid = giftRoomModel.giftid;
                        chatModel.giftUrl = giftRoomModel.giftUrl;
                        chatModel.giftUserType = giftRoomModel.giftUserType;
                        chatModel.giftType = giftRoomModel.giftType;
                        chatModel.from = giftRoomModel.from;
                        chatModel.to = giftRoomModel.to;
                        chatModel.uuid = giftRoomModel.uuid;
                        OooO00o(chatModel);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            int i3 = giftRoomModel.type;
            if (i3 == 7 || i3 == 71 || i3 == 72) {
                return;
            }
            OooOooO(10009, 0, giftRoomModel);
        }
    }

    public final void OooOoO0(GiftRoomAllResultModel giftRoomAllResultModel, int i) {
        if (giftRoomAllResultModel != null) {
            GiftRoomModel giftRoomModel = new GiftRoomModel();
            giftRoomModel.from = giftRoomAllResultModel.from;
            giftRoomModel.type = 7;
            giftRoomModel.giftid = giftRoomAllResultModel.giftid;
            giftRoomModel.number = giftRoomAllResultModel.successnum;
            RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
            roomUserInfoModel.setUserName(o000O0O0.OooO0OO(R.string.everyone));
            giftRoomModel.to = roomUserInfoModel;
            giftRoomModel.coin = giftRoomAllResultModel.coin;
            giftRoomModel.crystal = giftRoomAllResultModel.crystal;
            giftRoomModel.luckyflag = giftRoomAllResultModel.luckyflag;
            giftRoomModel.luckymoney = giftRoomAllResultModel.luckymoney;
            giftRoomModel.luckynum = giftRoomAllResultModel.luckynum;
            giftRoomModel.luckymultiple = giftRoomAllResultModel.luckymultiple;
            giftRoomModel.luckyinstances = giftRoomAllResultModel.luckyinstances;
            Oooo0o(giftRoomModel, i);
            OooOooO(10009, 0, giftRoomModel);
        }
    }

    public final void OooOoOO(long j) {
        o00OO00O o00oo00oOooO00o = o00OO00O.f43313OooooOo.OooO00o();
        Integer value = o00oo00oOooO00o.f43343OooOoo0.getValue();
        ArrayList<Room.RoshamboModel> value2 = o00oo00oOooO00o.f43339OooOoO.getValue();
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(value2)) {
            for (int i = 0; i < value2.size(); i++) {
                if (value2.get(i).getMorauuid() == j) {
                    value2.remove(i);
                    int iIntValue = value == null ? 0 : Integer.valueOf(value.intValue() - 1).intValue();
                    o00oo00oOooO00o.f43343OooOoo0.postValue(Integer.valueOf(iIntValue >= 0 ? iIntValue : 0));
                    break;
                }
            }
        }
        o00oo00oOooO00o.f43339OooOoO.postValue(value2);
    }

    public final void OooOoo() {
        if (f32426Oooooo0 != null) {
            this.f32433OoooO00 = null;
            o00O.f43140OooO00o.OooOoO(false);
            f32426Oooooo0 = null;
        }
        f32426Oooooo0 = new o000O00O();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.MoraGiftListModel>] */
    public final void OooOoo0(Context context) {
        if (this.f32439OoooOoO.size() > 0) {
            o00OO00O.f43313OooooOo.OooO00o().f43340OooOoO0.postValue(this.f32439OoooOoO);
            return;
        }
        OooO oooO = new OooO(context);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32290o00000oo, mapOooO0O0, oooO);
    }

    public final void OooOooO(int i, int i2, Object obj) {
        Handler handler = this.f32433OoooO00;
        if (handler != null) {
            handler.obtainMessage(i, i2, 0, obj).sendToTarget();
            return;
        }
        Message message = new Message();
        message.what = i;
        message.arg1 = i2;
        message.arg2 = 0;
        message.obj = obj;
        p034OoooO0O.o0Oo0oo.OooO0o0(i.b, message);
    }

    public final void OooOooo(int i, Object obj) {
        OooOooO(i, 0, obj);
    }

    public final void Oooo(long j, int i) {
        int iOooOOO = OooOOO(j);
        if (iOooOOO >= 0) {
            this.f32431OoooO.get(iOooOOO).user.setRoomMemberType(i);
        }
        p034OoooO0O.o0Oo0oo.OooO0o0(164, new Pair(Long.valueOf(j), Integer.valueOf(i)));
    }

    public final void Oooo0(String str, Room.MoraStartPkRequestReply moraStartPkRequestReply, RoomUserInfoModel roomUserInfoModel) {
        ChatModel chatModel = new ChatModel();
        chatModel.type = 14;
        chatModel.from = roomUserInfoModel;
        chatModel.pkType = 3;
        chatModel.message = str;
        chatModel.muuid = moraStartPkRequestReply.getMuuid();
        chatModel.giftid = moraStartPkRequestReply.getMoragiftid();
        chatModel.giftUrl = moraStartPkRequestReply.getGiftimage();
        chatModel.num = String.valueOf(moraStartPkRequestReply.getMoranum());
        chatModel.isTie = moraStartPkRequestReply.getMoraresult() == 2;
        OooO00o(chatModel);
    }

    public final void Oooo000(String str, Room.MoraStartUpRequestReply moraStartUpRequestReply) {
        ChatModel chatModel = new ChatModel();
        chatModel.type = 14;
        chatModel.from = RoomUserInfoModel.INSTANCE.of(moraStartUpRequestReply.getFromuser());
        chatModel.pkType = 1;
        chatModel.message = str;
        chatModel.muuid = moraStartUpRequestReply.getMuuid();
        chatModel.giftid = moraStartUpRequestReply.getMoragiftid();
        chatModel.giftPrice = moraStartUpRequestReply.getGiftprice();
        chatModel.num = String.valueOf(moraStartUpRequestReply.getMoranum());
        chatModel.giftUrl = moraStartUpRequestReply.getGiftimage();
        chatModel.toUserId = moraStartUpRequestReply.getToUserId();
        chatModel.toNickname = moraStartUpRequestReply.getToNickname();
        chatModel.toHeadphoto = moraStartUpRequestReply.getToHeadphoto();
        OooO00o(chatModel);
    }

    public final void Oooo00O(String str) {
        ChatModel chatModel = new ChatModel();
        chatModel.type = 13;
        chatModel.message = str;
        OooO00o(chatModel);
    }

    public final void Oooo00o(int i) {
        this.f32434OoooO0O.postValue(Integer.valueOf(i));
    }

    public final void Oooo0O0(RoomConfiguration roomConfiguration, RoomLoginInformation roomLoginInformation) {
        this.f32427Oooo = roomConfiguration;
        o00OO00O o00oo00oOooO00o = o00OO00O.f43313OooooOo.OooO00o();
        o00oo00oOooO00o.f43326OooOO0o.postValue(roomConfiguration);
        if (roomConfiguration.getProfileLimit() != null) {
            for (ProfileLimitModel profileLimitModel : roomConfiguration.getProfileLimit()) {
                if (profileLimitModel.getOperationType() == 3) {
                    o00oo00oOooO00o.f43328OooOOO0.postValue(profileLimitModel);
                }
                profileLimitModel.getOperationType();
                profileLimitModel.getOperationType();
            }
        }
        o00oo00oOooO00o.f43324OooOO0.postValue(roomLoginInformation);
        o00oo00oOooO00o.f43317OooO0O0.postValue(com.yalla.support.common.util.OooO0OO.OooO0O0(roomConfiguration.getBarname()) ? roomConfiguration.getBarname() : "");
        o00oo00oOooO00o.f43316OooO00o.postValue(com.yalla.support.common.util.OooO0OO.OooO0O0(roomConfiguration.getBarimage()) ? roomConfiguration.getBarimage() : "");
        o00oo00oOooO00o.f43319OooO0Oo.postValue(Long.valueOf(Long.parseLong(roomConfiguration.getBarid())));
        o00oo00oOooO00o.f43318OooO0OO.postValue(Long.valueOf(Long.parseLong(roomConfiguration.getBaridx())));
        o00oo00oOooO00o.f43335OooOo0.postValue(Boolean.valueOf(roomConfiguration.getIsencrypt() != 0));
        o00oo00oOooO00o.f43348Oooo000.postValue(roomConfiguration.getIsForBidRoom());
        o00oo00oOooO00o.f43349Oooo00O.postValue(roomConfiguration.getAdminLockmic());
        o00oo00oOooO00o.f43353Oooo0o.postValue(roomConfiguration.getProfileLimit());
        o00oo00oOooO00o.f43347Oooo0.postValue(Integer.valueOf(roomConfiguration.getIsPrettyBarId()));
        o00oo00oOooO00o.f43351Oooo0O0.postValue(Integer.valueOf(roomConfiguration.getCountryid()));
        o00oo00oOooO00o.f43352Oooo0OO.postValue(roomConfiguration.isManageEvent);
        o00oo00oOooO00o.f43354Oooo0o0.postValue(Integer.valueOf(roomConfiguration.getVarietyLevel()));
        o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
        o00O.OooO0o.f43222OooO0oO.setValue(Boolean.valueOf(roomConfiguration.isAdminApplymic.booleanValue()));
        o00O o00o2 = o00O.f43140OooO00o;
        o00O.f43185OoooOO0.setValue(Boolean.valueOf(roomConfiguration.getIspwdroom() != 0));
        o00o2.OooOo0O(roomConfiguration.getMembernum());
        o00O.OooO0O0 oooO0O0 = o00O.OooO0O0.f43203OooO00o;
        o00O.OooO0O0.f43205OooO0OO.setValue(Integer.valueOf(roomConfiguration.getWage()));
        o00O.OooO0O0.f43204OooO0O0.setValue(Long.valueOf(Long.parseLong(roomConfiguration.getBarid())));
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.id = String.valueOf(roomConfiguration.getLabelid());
        categoryModel.labelname = roomConfiguration.getLabelname();
        o00oo00oOooO00o.f43334OooOo.postValue(categoryModel);
        if (roomConfiguration.getOwn() != 1) {
            RoomHistory roomHistory = new RoomHistory();
            roomHistory.barid = roomConfiguration.getBarid() + "";
            roomHistory.baridx = roomConfiguration.getBaridx() + "";
            roomHistory.barname = roomConfiguration.getBarname();
            roomHistory.barimage = roomConfiguration.getBarimage();
            roomHistory.barlevel = roomConfiguration.getBarlevel() + "";
            RoomModel roomModel = this.f32429Oooo0oO;
            if (roomModel != null && com.yalla.support.common.util.OooO0OO.OooO0O0(roomModel.getRoomIp())) {
                roomHistory.roomserverip = this.f32429Oooo0oO.getRoomIp();
            }
            roomHistory.countryid = roomConfiguration.getCountryid() + "";
            roomHistory.isencrypt = roomConfiguration.getIsencrypt() + "";
            roomHistory.isofficial = roomConfiguration.getIsofficial();
            roomHistory.labelname = roomConfiguration.getLabelname();
            roomHistory.bartype = roomConfiguration.getBartype() + "";
            roomHistory.notice = roomConfiguration.getNotice();
            roomHistory.medal = roomConfiguration.getMedal();
            roomHistory.time = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            sb.append(String.valueOf(oooOOO.OooOo().getValue()));
            sb.append(roomHistory.barid);
            roomHistory.repeat = sb.toString();
            roomHistory.uid = kotlin.collections.unsigned.OooO00o.OooO0O0(oooOOO);
            p491o0o00O00.OooO0OO.OooO00o().OooOoo().OooO0O0(roomHistory);
            List<RoomHistory> listOooO00o = p491o0o00O00.OooO0OO.OooO00o().OooOoo().OooO00o(String.valueOf(oooOOO.OooOo().getValue()));
            Collections.reverse(listOooO00o);
            if (com.yalla.support.common.util.OooO0OO.OooO0O0(listOooO00o) && listOooO00o.size() > 100) {
                p491o0o00O00.OooO0OO.OooO00o().OooOoo().OooO0OO(listOooO00o.get(0));
            }
            p034OoooO0O.o0Oo0oo.OooO0o0(583, null);
        }
        if (o00OO00O.f43313OooooOo.OooO00o().OooOOOo()) {
            o00oo00oOooO00o.f43327OooOOO.postValue(Boolean.valueOf(roomConfiguration.getIsfollow() == 1));
        }
    }

    public final void Oooo0OO(RoomModel roomModel) {
        String baridx;
        this.f32429Oooo0oO = roomModel;
        o00OO00O o00oo00oOooO00o = o00OO00O.f43313OooooOo.OooO00o();
        RoomModel roomModel2 = this.f32429Oooo0oO;
        MutableLiveData<String> mutableLiveData = o00oo00oOooO00o.f43316OooO00o;
        String image = roomModel2 != null ? roomModel2.getImage() : null;
        if (image == null) {
            image = "";
        }
        mutableLiveData.postValue(image);
        o00oo00oOooO00o.f43318OooO0OO.postValue((roomModel2 == null || (baridx = roomModel2.getBaridx()) == null) ? null : Long.valueOf(Long.parseLong(baridx)));
        o00oo00oOooO00o.f43319OooO0Oo.postValue(roomModel2 != null ? Long.valueOf(roomModel2.getId()) : null);
        o00O.OooO0O0 oooO0O0 = o00O.OooO0O0.f43203OooO00o;
        o00O.OooO0O0.f43204OooO0O0.setValue(Long.valueOf(roomModel2 != null ? roomModel2.getId() : 0L));
        MutableLiveData<String> mutableLiveData2 = o00oo00oOooO00o.f43317OooO0O0;
        String name = roomModel2 != null ? roomModel2.getName() : null;
        if (name == null) {
            name = ".";
        }
        mutableLiveData2.postValue(name);
        o00O00.OooO0OO("setRoomInfoLocal", "roomInfoLocal = " + roomModel2);
    }

    public final void Oooo0o(GiftRoomModel giftRoomModel, int i) {
        if (giftRoomModel == null) {
            return;
        }
        if (giftRoomModel.from != null) {
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            if (oooOOO.OooOo().getValue().longValue() == giftRoomModel.from.getUserId()) {
                if (i == GiftPropTypePay.Coin.getValue()) {
                    oooOOO.OooO0OO().postValue(Long.valueOf(giftRoomModel.coin));
                    return;
                } else {
                    oooOOO.OooO0o().postValue(Long.valueOf(giftRoomModel.crystal));
                    return;
                }
            }
        }
        if (giftRoomModel.to != null) {
            OooOOO oooOOO2 = OooOOO.f41216OooO00o;
            if (oooOOO2.OooOo().getValue().longValue() == giftRoomModel.to.getUserId()) {
                if (i == GiftPropTypePay.Coin.getValue()) {
                    oooOOO2.OooO0OO().postValue(Long.valueOf(giftRoomModel.coin));
                    return;
                }
                int i2 = giftRoomModel.type;
                if (i2 == 6 || i2 == 7) {
                    oooOOO2.OooO0o().postValue(Long.valueOf(giftRoomModel.crystal));
                }
            }
        }
    }

    public final void Oooo0o0() {
        OooOooO(33001, 0, null);
    }

    public final void Oooo0oO() {
        o00OO00O o00oo00oOooO00o = o00OO00O.f43313OooooOo.OooO00o();
        if (o00oo00oOooO00o.f43327OooOOO.getValue().booleanValue()) {
            o0O00000.OooO0OO("InRoom_roomProfile_unfollow");
        }
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o00000OO.f32210OooO0Oo.OooO0OO(o00oo00oOooO00o.f43319OooO0Oo.getValue() + "", o00oo00oOooO00o.f43327OooOOO.getValue().booleanValue(), new OooO0o(o00oo00oOooO00o));
    }

    public final void Oooo0oo(int i, int i2, long j, boolean z) {
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        Integer value = oooO00o.OooO00o().OooO0oO().getValue();
        Integer value2 = oooO00o.OooO00o().OooO().getValue();
        Long value3 = oooO00o.OooO00o().OooO0oo().getValue();
        Boolean value4 = oooO00o.OooO00o().OooOO0O().getValue();
        if (value != null && value.intValue() != i) {
            oooO00o.OooO00o().OooO0oO().postValue(Integer.valueOf(i));
        }
        if (value2 != null && value2.intValue() != i2) {
            oooO00o.OooO00o().OooO().postValue(Integer.valueOf(i2));
        }
        if (value3 != null && value3.longValue() != j) {
            oooO00o.OooO00o().OooO0oo().postValue(Long.valueOf(j));
        }
        if (value4 == null || value4.booleanValue() == z) {
            return;
        }
        oooO00o.OooO00o().OooOO0O().postValue(Boolean.valueOf(z));
    }

    public final void OoooO00(long j) {
        for (int i = 0; i < this.f32436OoooOOO.size(); i++) {
            if (this.f32436OoooOOO.get(i).type == 14 && this.f32436OoooOOO.get(i).muuid == j) {
                if (this.f32436OoooOOO.get(i).pkType != 1) {
                    break;
                }
                this.f32436OoooOOO.get(i).pkType = 2;
                Oooo0o0();
                break;
            }
        }
        OooOoOO(j);
    }
}
