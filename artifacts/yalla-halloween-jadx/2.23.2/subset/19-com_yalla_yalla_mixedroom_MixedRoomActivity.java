package com.yalla.yalla.mixedroom;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o000O00O;
import com.common.support.roomgiftplayer.RoomGiftVideoPlayManager;
import com.common.support.roomgiftplayer.view.RoomGiftPlayContainer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.data.db.model.RoomTheme;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.RoomActivityEffectAnimModel;
import com.yalla.yalla.model.RoomBroadcastModel;
import com.yalla.yalla.model.RoomBroadcastOpenNobleDataModel;
import com.yalla.yalla.model.RoomBroadcastOpenNobleModel;
import com.yalla.yalla.model.RoomRunWayModel;
import com.yalla.yalla.model.SkillCardModel;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.room.RoomMessageReplyInfo;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.model.socketPostModel.ForwardingRedPacketModel;
import com.yalla.yalla.model.socketPostModel.SendHeartModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import com.yalla.yalla.ui.dialog.PasswordSettingDialog;
import com.yalla.yalla.ui.view.BubbleView;
import com.yalla.yalla.ui.view.RoomGiftSVGAView;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import com.yalla.yalla.ui.view.room.RoomBroadcastView;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import p205o00o0o0o.o000O;
import p379o0OOoOOO.oOO00O;
import p435o0OoOOOo.o0O0o;
import p475o0Ooooo0.o0O00oO0;
import p497o0o00OoO.oo0O;
import p498o0o00Ooo.o0OoO00O;
import p499o0o00o.oO0Oo;
import p499o0o00o.oo0OOoo;
import p502o0o00o0O.o;
import p502o0o00o0O.oO00000;
import p504o0o00oO0.x;
import p509o0o00ooO.u1;
import p509o0o00ooO.w1;
import p525o0o0OO0.o00OO;
import p557o0oOOooO.oOo0000O;
import p557o0oOOooO.oOo00ooO;
import p558o0oOOooo.oO0O0;
import p567o0oOo0Oo.o0O000Oo;
import p590o0oOooo0.k0;
import p590o0oOooo0.oOOO00;
import p645o0ooOOoo.n3;
import p650o0ooo.a1;
import p650o0ooo.f0;
import p650o0ooo.n;
import p650o0ooo.o00O0OO0;
import p650o0ooo.o0OOO0;
import p650o0ooo.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
public class MixedRoomActivity extends BaseFragmentActivity implements p394o0Oo0.OooOO0O {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f22956OoooO0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OooO0O0 f22957OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Intent f22958OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public p394o0Oo0.OooOOO0<MixedRoomActivity> f22959OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f22960OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o f22961OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public o000O f22962OooOo00;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextView f22964OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public FrameLayout f22965OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public BubbleView f22966OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public p501o0o00o00.OooOO0O f22967OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public w1 f22968OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ListView f22969OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public oo0o0O0 f22970OooOooO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public LiveRoomVM f22972Oooo;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f22978Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public n3 f22979Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public RoomModel f22980Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public RoomFrameUIController f22981Oooo0oO;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final p442o0OoOo0O.o000OO f22963OooOo0O = new p442o0OoOo0O.o000OO(this);

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f22971OooOooo = 0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final o000000O f22974Oooo000 = new View.OnTouchListener() { // from class: com.yalla.yalla.mixedroom.o000000O
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int i = MixedRoomActivity.f22956OoooO0O;
            MixedRoomActivity mixedRoomActivity = this.f23037OooO0Oo;
            mixedRoomActivity.getClass();
            if (motionEvent.getAction() == 0) {
                try {
                    if (System.currentTimeMillis() - mixedRoomActivity.f22960OooOo > 120) {
                        mixedRoomActivity.f22960OooOo = System.currentTimeMillis();
                        int i2 = mixedRoomActivity.f22971OooOooo + 1;
                        mixedRoomActivity.f22971OooOooo = i2;
                        if (i2 >= 30) {
                            SendHeartModel sendHeartModel = new SendHeartModel();
                            sendHeartModel.num = mixedRoomActivity.f22971OooOooo;
                            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                            if (roomLiveService != null) {
                                roomLiveService.OooO0oO(10011, oOOO00.OooO0OO(sendHeartModel));
                            }
                            mixedRoomActivity.f22971OooOooo = 0;
                        }
                        mixedRoomActivity.f22966OooOoO0.OooO00o();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f22975Oooo00O = false;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f22976Oooo00o = false;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f22973Oooo0 = true;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OooO00o f22977Oooo0O0 = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f22982Oooo0oo = false;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public f0 f22984OoooO00 = null;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final p495o0o00Oo.OooO f22983OoooO0 = new p495o0o00Oo.OooO(this);

    public class OooO00o implements AbsListView.OnScrollListener {
        public OooO00o() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            TextView textView;
            int lastVisiblePosition = absListView.getLastVisiblePosition();
            int count = absListView.getCount() - 1;
            MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
            if (lastVisiblePosition != count) {
                mixedRoomActivity.f22973Oooo0 = false;
                return;
            }
            View childAt = absListView.getChildAt(absListView.getLastVisiblePosition() - absListView.getFirstVisiblePosition());
            if (com.code.android.util.OooOo00.OooO0O0(childAt)) {
                mixedRoomActivity.f22973Oooo0 = absListView.getHeight() >= childAt.getBottom();
            }
            if (!mixedRoomActivity.f22973Oooo0 || (textView = mixedRoomActivity.f22964OooOo0o) == null) {
                return;
            }
            textView.clearAnimation();
            mixedRoomActivity.f22964OooOo0o.setVisibility(8);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 0) {
                int lastVisiblePosition = absListView.getLastVisiblePosition();
                int count = absListView.getCount() - 1;
                MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
                if (lastVisiblePosition != count) {
                    if (absListView.getLastVisiblePosition() < absListView.getCount() - 1) {
                        mixedRoomActivity.f22964OooOo0o.setVisibility(0);
                        mixedRoomActivity.f22964OooOo0o.setText(p562o0oOo000.o000000.Room_chatline_Bottom);
                    }
                    mixedRoomActivity.f22973Oooo0 = false;
                    return;
                }
                View childAt = absListView.getChildAt(absListView.getLastVisiblePosition() - absListView.getFirstVisiblePosition());
                if (com.code.android.util.OooOo00.OooO0O0(childAt)) {
                    mixedRoomActivity.f22973Oooo0 = absListView.getHeight() >= childAt.getBottom();
                }
                if (mixedRoomActivity.f22973Oooo0) {
                    mixedRoomActivity.f22964OooOo0o.clearAnimation();
                    mixedRoomActivity.f22964OooOo0o.setVisibility(8);
                }
            }
        }
    }

    public class OooO0O0 implements ServiceConnection {
        public OooO0O0() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p598o0oo00Oo.o0000O00.OooO0OO("RoomLiveService", "onServiceConnected");
            MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
            RoomModel roomModel = (RoomModel) mixedRoomActivity.getIntent().getSerializableExtra("room");
            p483o0o000Oo.o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24516OooO0o0;
            if (o000000Var.OooO0o0() == 0) {
                if (roomModel != null) {
                    RoomLiveService.f24596OooOo00.OooO(roomModel);
                    return;
                } else {
                    MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
                    p429o0OoOO.o0Oo0oo.OooO00o();
                    return;
                }
            }
            if (roomModel != null && o000000Var.OooO0o0() != roomModel.getId()) {
                mixedRoomActivity.OooOo0(roomModel);
                return;
            }
            int i = MixedRoomActivity.f22956OoooO0O;
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10054, null);
            }
            p598o0oo00Oo.o0000O00.OooO0OO("RoomLiveService", "挂机恢复房间");
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            p598o0oo00Oo.o0000O00.OooO0O0("onServiceDisconnected name = " + componentName);
        }
    }

    public class OooO0OO implements Animation.AnimationListener {
        public OooO0OO() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            MixedRoomActivity.this.f22976Oooo00o = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
            mixedRoomActivity.f22964OooOo0o.setVisibility(0);
            mixedRoomActivity.f22964OooOo0o.setText(p562o0oOo000.o000000.chatline_new);
        }
    }

    @Override // p394o0Oo0.OooOO0O
    public final void OooO0Oo(Message message) {
        OooOo0O(message);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO() {
        overridePendingTransition(p562o0oOo000.oo000o.anim_activity_room_open_enter, p562o0oOo000.oo000o.anim_empty);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO0() {
        overridePendingTransition(p562o0oOo000.oo000o.anim_empty, p562o0oOo000.oo000o.anim_activity_room_close_exit);
    }

    public final synchronized void OooOo() {
        this.f22973Oooo0 = true;
        TextView textView = this.f22964OooOo0o;
        if (textView != null) {
            textView.clearAnimation();
            this.f22964OooOo0o.setVisibility(8);
        }
        w1 w1Var = this.f22968OooOoo;
        if (w1Var != null) {
            int count = w1Var.getCount();
            this.f22969OooOoo0.setSelection(count == 0 ? 0 : count - 1);
        }
    }

    public final void OooOo0(RoomModel roomModel) {
        p598o0oo00Oo.o0000O00.OooO0OO("RoomLiveService", "enterNewRoom roomModel = ".concat(p187o00o00o0.OooO.OooO00o(roomModel)));
        if (roomModel.getId() == 0) {
            return;
        }
        this.f22980Oooo0o0 = roomModel;
        OooOoO0();
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO(roomModel);
        }
    }

    public final void OooOo0O(Message message) {
        o0OoO00O o0ooo00o2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = message.what;
        p495o0o00Oo.OooO oooO = this.f22983OoooO0;
        boolean z = true;
        switch (i) {
            case 2025:
                o0oo0000.OooO00o.OooO0O0("201016");
                p598o0oo00Oo.o0000O00.OooO0o("接收到消息: GlobalDef.SERVICE_STATUS_FAILD" + isFinishing());
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.net_connection_error);
                if (!isFinishing()) {
                    o000O o000o = new o000O(this);
                    o000o.OooOo00(strOooO0OO);
                    o000o.OooO0o(false);
                    o000o.OooOO0(new o00000());
                    o000o.OooOO0o();
                }
                break;
            case RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS /* 10001 */:
                RoomLoginInformation roomLoginInformation = (RoomLoginInformation) oOOO00.OooO00o((String) message.obj, RoomLoginInformation.class);
                if (roomLoginInformation != null) {
                    p598o0oo00Oo.o0000O00.OooO0O0("processLoginInformation loginMessage = " + roomLoginInformation.toJSONString());
                    if (roomLoginInformation.code == 0 && roomLoginInformation.getRoom() != null) {
                        p500o0o00o0.OooOOO oooOOO = oooO.f49622OooO0oo;
                        if (oooOOO != null) {
                            ((oO0O0) oooOOO.f50150OooO0o.getValue()).OooO0OO();
                            ((oO0O0) oooOOO.f50152OooO0oO.getValue()).OooO0OO();
                            oooOOO.OooO0OO();
                        }
                        o0OoO00O o0ooo00o3 = oooO.f49621OooO0oO;
                        if (o0ooo00o3 != null) {
                            o0ooo00o3.f49916OooO0OO.clear();
                            RoomBroadcastView roomBroadcastView = o0ooo00o3.f49918OooO0o;
                            if (roomBroadcastView != null) {
                                roomBroadcastView.clearAnimation();
                            }
                        }
                    }
                }
                break;
            case 10011:
                if (!this.f22975Oooo00O) {
                    this.f22975Oooo00O = true;
                    new Thread(new o000(this)).start();
                }
                break;
            case 10019:
                p598o0oo00Oo.o0000O00.OooO0O0("收到广播***************");
                RoomBroadcastModel roomBroadcastModel = (RoomBroadcastModel) message.obj;
                if (roomBroadcastModel != null && (o0ooo00o2 = oooO.f49621OooO0oO) != null) {
                    if (!this.f22978Oooo0OO) {
                        return;
                    } else {
                        o0ooo00o2.OooO0o0(roomBroadcastModel);
                    }
                }
                break;
            case 10043:
                p598o0oo00Oo.o0000O00.OooO0o("贵族购买或续费广播喇叭 *************** msg = " + message);
                RoomBroadcastOpenNobleModel roomBroadcastOpenNobleModel = (RoomBroadcastOpenNobleModel) oOOO00.OooO00o((String) message.obj, RoomBroadcastOpenNobleModel.class);
                if (roomBroadcastOpenNobleModel != null && roomBroadcastOpenNobleModel.getData() != null) {
                    p598o0oo00Oo.o0000O00.OooO0O0("贵族购买或续费广播喇叭 roomBroadcastOpenNobleModel = ".concat(p187o00o00o0.OooO.OooO00o(roomBroadcastOpenNobleModel)));
                    RoomBroadcastModel roomBroadcastModel2 = new RoomBroadcastModel();
                    roomBroadcastModel2.setNobleData(13, roomBroadcastOpenNobleModel.getData());
                    if (oooO.f49621OooO0oO != null && (roomBroadcastOpenNobleModel.getData().getAction() == 1 || roomBroadcastOpenNobleModel.getData().getAction() == 2)) {
                        if (!this.f22978Oooo0OO) {
                            return;
                        } else {
                            oooO.f49621OooO0oO.OooO0o0(roomBroadcastModel2);
                        }
                    }
                }
                break;
            case 10050:
                SkillCardModel skillCardModel = (SkillCardModel) message.obj;
                skillCardModel.setCardType(2);
                p501o0o00o00.OooOO0O oooOO0O = this.f22967OooOoOO;
                if (oooOO0O != null) {
                    oooOO0O.OooO00o(skillCardModel);
                }
                break;
            case 10060:
                if (message.obj == null) {
                    String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.notinroom);
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        } else {
                            o000oo0OooO00o.run();
                        }
                    }
                } else {
                    com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24578OoooO0.postValue((RoomUserInfoModel) message.obj);
                }
                break;
            case 10063:
                LiveEventBus.get("MORA_GAME_ANIM").post((Room.MoraStartPkRequestReply) message.obj);
                break;
            case 10066:
                Room.MagicVoiceOut magicVoiceOut = (Room.MagicVoiceOut) message.obj;
                if (this.f22967OooOoOO != null) {
                    SkillCardModel skillCardModel2 = new SkillCardModel();
                    skillCardModel2.setCardType(3);
                    RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
                    skillCardModel2.setNewFrom(companion.of(magicVoiceOut.getFrom()));
                    skillCardModel2.setNewTarget(companion.of(magicVoiceOut.getTarget()));
                    this.f22967OooOoOO.OooO00o(skillCardModel2);
                }
                break;
            case 21000:
                p598o0oo00Oo.o0000O00.OooO0OO("RoomDialogDis", "dismiss 1359 ROOM_SHOW_DIALOG_21000");
                break;
            case 21001:
                p598o0oo00Oo.o0000O00.OooO0OO("RoomDialogDis", "dismiss 1383 ROOM_CANCEL_DIALOG_21001");
                break;
            case 30002:
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oO(10054, null);
                }
                break;
            case 33001:
                OooOoo0();
                break;
            case 33002:
                x xVar = oooO.f49619OooO0o;
                if (xVar != null) {
                    RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) message.obj;
                    if (roomUserInfoModel != null) {
                        xVar.OooO0OO().add(roomUserInfoModel);
                    }
                    if (!xVar.OooO0OO().isEmpty() && xVar.f49627OooO0O0 == null) {
                        xVar.f49627OooO0O0 = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(xVar.f49626OooO00o), Dispatchers.getMain(), null, new p495o0o00Oo.OooOOO0(xVar, null), 2, null);
                    }
                }
                break;
            case 100611:
                int iIntValue = ((Integer) message.obj).intValue();
                if (iIntValue == 0) {
                    String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Success);
                    if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO3, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                        } else {
                            o000oo0OooO00o2.run();
                        }
                    }
                } else if (iIntValue == 1) {
                    String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.error);
                    if (strOooO0OO4 != null && !StringsKt.isBlank(strOooO0OO4)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o3 = androidx.activity.OooOo00.OooO00o(strOooO0OO4, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o3);
                        } else {
                            o000oo0OooO00o3.run();
                        }
                    }
                }
                break;
            case 100612:
                final Room.InviteBarMemberToRequestReply inviteBarMemberToRequestReply = (Room.InviteBarMemberToRequestReply) message.obj;
                if (inviteBarMemberToRequestReply == null || this.f22982Oooo0oo) {
                    return;
                }
                this.f22982Oooo0oo = true;
                if (this.f22962OooOo00 == null) {
                    this.f22962OooOo00 = new o000O(this);
                }
                this.f22962OooOo00.OooOo00(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.invited_to_member));
                this.f22962OooOo00.OooOO0(new Function0() { // from class: com.yalla.yalla.mixedroom.OooOo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.f23028OooO0Oo.f22982Oooo0oo = false;
                        return null;
                    }
                });
                this.f22962OooOo00.OooOo0o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Decline));
                this.f22962OooOo00.OooOo0O(new Function0() { // from class: com.yalla.yalla.mixedroom.o0OOO0o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.f23072OooO0Oo.f22982Oooo0oo = false;
                        return null;
                    }
                });
                this.f22962OooOo00.OooOOOo(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Accept));
                this.f22962OooOo00.OooOo0(new Function0() { // from class: com.yalla.yalla.mixedroom.o000000
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2 = MixedRoomActivity.f22956OoooO0O;
                        if (MixedRoomDataSource.OooO0o0().f22991OooO0o == null) {
                            return null;
                        }
                        p482o0o000OO.OooOOO.OooO0O0(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24552OooOOo0.getValue().intValue(), String.valueOf(inviteBarMemberToRequestReply.getFromuser().getUserId()), MixedRoomDataSource.OooO0o0().f22991OooO0o.getBaridx(), "1");
                        LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                        com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.OooO0oO(false);
                        return null;
                    }
                });
                this.f22962OooOo00.OooOO0o();
                break;
            case o0O0o.Other_Device_Login /* 999001 */:
                o000O o000o2 = new o000O(this);
                o000o2.OooOOoo(p562o0oOo000.o000000.turntable_close_return_coin);
                o000o2.OooOO0o();
                break;
            case 1000600:
                p429o0OoOO.o0ooOOo o0ooooo = oooO.f49623OooOO0;
                if (o0ooooo != null) {
                    RoomActivityEffectAnimModel animModel = (RoomActivityEffectAnimModel) message.obj;
                    Intrinsics.checkNotNullParameter(animModel, "animModel");
                    if (o0ooooo.f46823OooO00o.f22280OooO0oO) {
                        p429o0OoOO.o0ooOOo.OooO00o(o0ooooo, 0, animModel.getEffectFrameType(), 1, animModel.getUrl(), null, animModel.getAnimationId() == 2, 16);
                    }
                }
                break;
            default:
                p598o0oo00Oo.o0000O00.OooO0o("Command not processed:" + message.what);
                break;
        }
        p598o0oo00Oo.o0000O00.OooO0OO("MixedRoomActivity", "parseDoHandler  type : " + message.what + " use time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final void OooOo0o() {
        this.f22964OooOo0o.setVisibility(0);
        this.f22964OooOo0o.setText(p562o0oOo000.o000000.chatline_new);
        if (this.f22976Oooo00o) {
            return;
        }
        this.f22976Oooo00o = true;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimation.setDuration(2500L);
        alphaAnimation.setAnimationListener(new OooO0OO());
        this.f22964OooOo0o.startAnimation(alphaAnimation);
    }

    public final void OooOoO(RoomUserInfoModel roomUserInfoModel) {
        p442o0OoOo0O.o0000 o0000Var = this.f22983OoooO0.f49614OooO;
        if (o0000Var != null) {
            o0000Var.OooO00o(new oOo00ooO(roomUserInfoModel.getUserName().getValue(), roomUserInfoModel.getUserId().getValue().longValue()), true);
        }
    }

    public final void OooOoO0() {
        o00OO o00oo2;
        LiveEventBus.get("RESET_ROOM").post(Boolean.TRUE);
        o000O o000o = this.f22962OooOo00;
        if (o000o != null) {
            o000o.OooO0OO();
        }
        this.f22964OooOo0o.clearAnimation();
        this.f22964OooOo0o.setVisibility(8);
        this.f22973Oooo0 = true;
        p442o0OoOo0O.o000OO o000oo2 = this.f22963OooOo0O;
        if (o000oo2 != null) {
            o000oo2.f47271OooO0O0 = null;
        }
        n3 n3Var = this.f22979Oooo0o;
        if (n3Var != null && (o00oo2 = n3Var.f58114OooO0O0) != null) {
            o00oo2.dismiss();
        }
        p495o0o00Oo.OooO oooO = this.f22983OoooO0;
        p442o0OoOo0O.o0000 o0000Var = oooO.f49614OooO;
        if (o0000Var != null) {
            p497o0o00OoO.o0000 o0000Var2 = o0000Var.f47221OooO0OO;
            p371o0OOo0oO.oo000o oo000oVarOooO0O0 = o0000Var2.OooO0O0();
            MessageEditText etMessageInput = o0000Var2.OooO00o();
            Intrinsics.checkNotNullParameter(etMessageInput, "etMessageInput");
            if (oo000oVarOooO0O0 != null) {
                etMessageInput.setText("");
                oOo0000O spanManager = etMessageInput.getSpanManager();
                spanManager.OooO00o();
                spanManager.f56176OooO00o.clear();
                etMessageInput.getMaskKeys().clear();
            }
        }
        Iterator<p495o0o00Oo.OooOO0O> it = oooO.f49616OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0();
        }
        OooOoo0();
    }

    public final void OooOoOO(RoomUserInfoModel roomUserInfoModel, int i, int i2, boolean z) {
        if (this.f22963OooOo0O != null) {
            o0000OO0 onLogin = new o0000OO0(this, roomUserInfoModel, i, i2, z);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    public final synchronized void OooOoo0() {
        ArrayList arrayList = (ArrayList) MixedRoomDataSource.OooO0o0().f22996OooOO0O.clone();
        ArrayList<ChatModel> arrayList2 = this.f22968OooOoo.f50854OooO0o0;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.f22968OooOoo.notifyDataSetChanged();
        if (this.f22973Oooo0) {
            OooOo();
        } else {
            OooOo0o();
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        f0 f0Var = this.f22984OoooO00;
        if (f0Var != null) {
            p436o0OoOOo.o0000 o0000Var = (p436o0OoOOo.o0000) f0Var.f58207OooOOO0.getValue();
            if (i2 != 0) {
                o0000Var.getClass();
                return;
            }
            String string = o0000Var.f47023OooO00o.getString(p562o0oOo000.o000000.purchase_cancel);
            if (string == null || StringsKt.isBlank(string)) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        boolean z2;
        p495o0o00Oo.OooO oooO = this.f22983OoooO0;
        p442o0OoOo0O.o0000 o0000Var = oooO.f49614OooO;
        boolean z3 = false;
        if (o0000Var != null) {
            p371o0OOo0oO.oo000o oo000oVarOooO0O0 = o0000Var.f47221OooO0OO.OooO0O0();
            if (oo000oVarOooO0O0 == null) {
                z = false;
            } else {
                if (oo000oVarOooO0O0.f43185OooO0o == 2) {
                    oo000oVarOooO0O0.OooO0O0();
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return;
            }
        }
        p483o0o000Oo.o0000OO0 o0000oo1 = com.yalla.yalla.service.room.OooO00o.f24520OooOO0O;
        if (o0000oo1.f48512OooO0OO.getValue().booleanValue()) {
            o0000oo1.f48512OooO0OO.setValue(Boolean.FALSE);
            z3 = true;
        } else {
            Iterator<p495o0o00Oo.OooOO0O> it = oooO.f49616OooO0O0.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        if (z3) {
            return;
        }
        o oVar = this.f22961OooOo0;
        if (oVar == null) {
            super.onBackPressed();
            return;
        }
        o0O000Oo o0o000oo2 = oVar.f50171OooO0OO;
        MixedRoomActivity mixedRoomActivity = oVar.f50170OooO0O0;
        if (o0o000oo2 == null) {
            oVar.f50171OooO0OO = new o0O000Oo(mixedRoomActivity);
        }
        oVar.f50171OooO0OO.f43649OooO0o = new oO00000(oVar);
        if (mixedRoomActivity == null || mixedRoomActivity.isFinishing() || mixedRoomActivity.isDestroyed()) {
            return;
        }
        oVar.f50171OooO0OO.show();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        RoomTheme roomThemeOooO0O0;
        RoomModel roomModel;
        super.onCreate(bundle);
        this.f22959OooOOoo = new p394o0Oo0.OooOOO0<>(this);
        getWindow().addFlags(128);
        int i = 0;
        oOO00O.OooO0OO(getWindow(), 0);
        setContentView(p562o0oOo000.oo0o0Oo.activity_mixed_room);
        this.f22972Oooo = (LiveRoomVM) new ViewModelProvider(this).get(LiveRoomVM.class);
        Intent intent = getIntent();
        if (intent != null && (roomModel = (RoomModel) intent.getSerializableExtra("room")) != null) {
            this.f22980Oooo0o0 = roomModel;
        }
        p495o0o00Oo.OooO oooO = this.f22983OoooO0;
        MixedRoomActivity activity = oooO.f49615OooO00o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.findViewById(p562o0oOo000.o0OO00O.cv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        p193o00o0O0O.o0000oo.OooO0Oo((ComposeView) viewFindViewById, p541o0o0OoOO.oOo0000O.f55290OooO00o);
        oooO.f49619OooO0o = new x(activity);
        oooO.f49621OooO0oO = new o0OoO00O(activity);
        oooO.f49622OooO0oo = new p500o0o00o0.OooOOO(activity);
        new p503o0o00oO.OooOo(activity, oooO);
        oooO.f49620OooO0o0 = new p503o0o00oO.OooOo00(activity);
        ComposeView composeView = (ComposeView) activity.findViewById(p562o0oOo000.o0OO00O.sideMainComposeView);
        Intrinsics.checkNotNull(composeView);
        p193o00o0O0O.o0000oo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(-1548327165, true, new p495o0o00Oo.OooO0o(oooO)));
        new RoomScreenShotManager(activity);
        new oO0Oo(activity);
        oooO.f49618OooO0Oo = new oo0OOoo(activity);
        oooO.f49614OooO = new p442o0OoOo0O.o0000(activity, oooO.f49617OooO0OO);
        new oo0O(activity);
        RoomGiftVideoPlayManager roomGiftVideoPlayManager = new RoomGiftVideoPlayManager();
        RoomGiftPlayContainer roomGiftPlayContainer = (RoomGiftPlayContainer) activity.findViewById(p562o0oOo000.o0OO00O.roomGifPlayContainer);
        roomGiftPlayContainer.initSvgaView(new RoomGiftSVGAView(oooO.f49615OooO00o, null, 6, i));
        Intrinsics.checkNotNull(roomGiftPlayContainer);
        roomGiftVideoPlayManager.init(activity, roomGiftPlayContainer);
        oooO.f49623OooOO0 = new p429o0OoOO.o0ooOOo(activity, roomGiftVideoPlayManager);
        this.f22965OooOoO = (FrameLayout) findViewById(p562o0oOo000.o0OO00O.v_room_root);
        RoomModel roomModel2 = this.f22980Oooo0o0;
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        if (roomModel2 != null) {
            oooO00o.OooO00o().f24548OooOOO0.postValue((roomModel2.getId() == 0 || (roomThemeOooO0O0 = p408o0Oo0Oo0.o00Oo0.OooO00o().OooOooO().OooO0O0(this.f22980Oooo0o0.getId())) == null) ? null : roomThemeOooO0O0.roomTheme);
        }
        this.f22961OooOo0 = new o(this);
        this.f22969OooOoo0 = (ListView) findViewById(p562o0oOo000.o0OO00O.list_charline);
        this.f22968OooOoo = new w1(this);
        LiveEventBus.get("DISLIKE_EVENT").observe(this, new o0000oo(this));
        w1 w1Var = this.f22968OooOoo;
        w1Var.f50861OooOOO0 = new Function5() { // from class: com.yalla.yalla.mixedroom.OooOo00
            /* JADX WARN: Code duplicated, block: B:22:0x0070  */
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                Integer num3 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23029OooO0Oo;
                mixedRoomActivity.getClass();
                o0oo0000.OooO00o.OooO0O0("102038");
                if (((ChatModel) obj5).getGiftsubtype() == 600) {
                    MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p391o0OOooo0.oo0o0Oo.f43573OooO00o;
                    int iIntValue = num2.intValue();
                    Map<Integer, GiftPropModel> value = p391o0OOooo0.oo0o0Oo.f43574OooO0O0.getValue();
                    if ((value != null ? value.get(Integer.valueOf(iIntValue)) : null) == null) {
                        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.vip6_send_for_userInfo_content);
                        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                    } else {
                        int iIntValue2 = num.intValue();
                        int iIntValue3 = num2.intValue();
                        num3.intValue();
                        mixedRoomActivity.OooOoOO(null, iIntValue2, iIntValue3, bool.booleanValue());
                    }
                } else {
                    int iIntValue4 = num.intValue();
                    int iIntValue5 = num2.intValue();
                    num3.intValue();
                    mixedRoomActivity.OooOoOO(null, iIntValue4, iIntValue5, bool.booleanValue());
                }
                return null;
            }
        };
        w1Var.f50860OooOOO = new Function6() { // from class: com.yalla.yalla.mixedroom.Oooo000
            @Override // kotlin.jvm.functions.Function6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                int i2 = MixedRoomActivity.f22956OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23031OooO0Oo;
                mixedRoomActivity.getClass();
                o0oo0000.OooO00o.OooO0O0("102038");
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                ((Integer) obj4).intValue();
                mixedRoomActivity.OooOoOO((RoomUserInfoModel) obj, iIntValue, iIntValue2, ((Boolean) obj5).booleanValue());
                return null;
            }
        };
        w1Var.f50862OooOOOO = new Function2() { // from class: com.yalla.yalla.mixedroom.Oooo0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ProfileLimitModel next;
                final String str = (String) obj;
                final Boolean bool = (Boolean) obj2;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23030OooO0Oo;
                mixedRoomActivity.getClass();
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o2 = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
                if (oooO00o2.OooO00o().f24535OooO.getValue() == null || oooO00o2.OooO00o().f24535OooO.getValue().getProfileLimit() == null) {
                    next = null;
                } else {
                    Iterator<ProfileLimitModel> it = oooO00o2.OooO00o().f24535OooO.getValue().getProfileLimit().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (next.getOperationType() == 3) {
                        }
                    }
                    next = null;
                }
                o000Oo0.OooO00o(mixedRoomActivity, next, new Function0() { // from class: com.yalla.yalla.mixedroom.oo0o0Oo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = MixedRoomActivity.f22956OoooO0O;
                        MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        mixedRoomActivity2.getClass();
                        Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
                        Observable observable = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
                        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
                        observable.post(Boolean.TRUE);
                        o00O0OO0.OooO00o().getClass();
                        oo0o0O0 oo0o0o0 = new oo0o0O0(mixedRoomActivity2);
                        mixedRoomActivity2.f22970OooOooO = oo0o0o0;
                        oo0o0o0.OooOO0o(str, bool);
                        mixedRoomActivity2.f22970OooOooO.show();
                        return null;
                    }
                });
                return null;
            }
        };
        this.f22969OooOoo0.setAdapter((ListAdapter) w1Var);
        this.f22969OooOoo0.setOnScrollListener(this.f22977Oooo0O0);
        this.f22969OooOoo0.setOnTouchListener(this.f22974Oooo000);
        w1 w1Var2 = this.f22968OooOoo;
        w1Var2.f50855OooO0oO = new o000oOoO();
        w1Var2.f50856OooO0oo = new Function1() { // from class: com.yalla.yalla.mixedroom.o0OoOo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ChatModel chatModel = (ChatModel) obj;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23075OooO0Oo;
                mixedRoomActivity.getClass();
                Long value = chatModel.getNewFrom().getUserId().getValue();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (value == o0O00oO0.OooOOo0().getValue()) {
                    return null;
                }
                mixedRoomActivity.OooOoO(chatModel.getNewFrom());
                return null;
            }
        };
        w1Var2.f50851OooO = new Function1() { // from class: com.yalla.yalla.mixedroom.o00O0O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2;
                MixedRoomActivity mixedRoomActivity = this.f23064OooO0Oo;
                w1 w1Var3 = mixedRoomActivity.f22968OooOoo;
                int iIntValue = ((Integer) obj).intValue();
                ListView listChat = mixedRoomActivity.f22969OooOoo0;
                TextView tvNewmessageTips = mixedRoomActivity.f22964OooOo0o;
                Intrinsics.checkNotNullParameter(listChat, "listChat");
                Intrinsics.checkNotNullParameter(tvNewmessageTips, "tvNewmessageTips");
                if ((w1Var3 != null ? w1Var3.f50854OooO0o0 : null) != null && w1Var3.f50854OooO0o0.size() > iIntValue) {
                    ArrayList<ChatModel> arrayList = w1Var3.f50854OooO0o0;
                    if (arrayList.get(iIntValue).getReplyInfo() != null) {
                        RoomMessageReplyInfo replyInfo = arrayList.get(iIntValue).getReplyInfo();
                        o000O00 checkKey = o000O00.f23058OooO0Oo;
                        Intrinsics.checkNotNullParameter(checkKey, "checkKey");
                        if (!(replyInfo == null)) {
                            Iterator<ChatModel> it = arrayList.iterator();
                            i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i2 = -1;
                                    break;
                                }
                                ChatModel next = it.next();
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((Boolean) checkKey.invoke(replyInfo, next)).booleanValue()) {
                                    break;
                                }
                                i2 = i3;
                            }
                        } else {
                            i2 = -1;
                            break;
                        }
                        if (i2 >= 0 && i2 < w1Var3.getCount()) {
                            try {
                                w1Var3.f50864OooOOo0 = i2;
                                listChat.smoothScrollToPosition(i2);
                                if (listChat.getFirstVisiblePosition() > i2) {
                                    tvNewmessageTips.setVisibility(0);
                                    tvNewmessageTips.setText(p562o0oOo000.o000000.Room_chatline_Bottom);
                                } else {
                                    w1Var3.notifyDataSetChanged();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                return null;
            }
        };
        w1Var2.f50857OooOO0 = new Function2() { // from class: com.yalla.yalla.mixedroom.o00Oo0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                Boolean bool = (Boolean) obj2;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23065OooO0Oo;
                mixedRoomActivity.getClass();
                o0oo0000.OooO00o.OooO0O0("102289");
                if (num.intValue() >= mixedRoomActivity.f22968OooOoo.f50854OooO0o0.size()) {
                    return null;
                }
                new a1(mixedRoomActivity, (ArrayList) mixedRoomActivity.f22968OooOoo.f50854OooO0o0.clone(), num.intValue(), com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue().longValue(), bool.booleanValue(), new o0000O0(mixedRoomActivity, mixedRoomActivity.f22968OooOoo.f50854OooO0o0.get(num.intValue())));
                return null;
            }
        };
        w1Var2.f50858OooOO0O = new Function1() { // from class: com.yalla.yalla.mixedroom.o00Ooo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23066OooO0Oo;
                mixedRoomActivity.getClass();
                if (num.intValue() >= mixedRoomActivity.f22968OooOoo.f50854OooO0o0.size()) {
                    return null;
                }
                p569o0oOo0o0.o00000OO.f56399OooO0O0.OooO0o(mixedRoomActivity.f22968OooOoo.f50854OooO0o0.get(num.intValue()).getEventModel());
                return null;
            }
        };
        w1Var2.f50859OooOO0o = new oo000o(this, i);
        OooOoo0();
        TextView textView = (TextView) findViewById(p562o0oOo000.o0OO00O.tv_newmessage_tips);
        this.f22964OooOo0o = textView;
        textView.setOnClickListener(new o0000O(this));
        this.f22966OooOoO0 = (BubbleView) findViewById(p562o0oOo000.o0OO00O.bubbleView);
        this.f22967OooOoOO = new p501o0o00o00.OooOO0O(p562o0oOo000.o0OO00O.ly_anmi_panda, this);
        LiveEventBus.get("Skill_Card_Anim").observe(this, new o0ooOOo(this, i));
        LiveEventBus.get("HideKeyboard").observe(this, new o0000O00(this));
        p483o0o000Oo.o000OOo o000ooo2 = com.yalla.yalla.service.room.OooO00o.f24527OooOOo0;
        o000ooo2.f48625OooO0oO.observe(this, new o00000O0(this, i));
        o000ooo2.f48626OooO0oo.observe(this, new o00000O(this, i));
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = oooO00o.OooO00o();
        this.f22979Oooo0o = new n3(this);
        this.f22981Oooo0oO = new RoomFrameUIController(this, oooO0O0OooO00o);
        oooO0O0OooO00o.f24554OooOo.observe(this, new o0000(this));
        p595o0oo00O.OooOo00.OooO0O0().toLowerCase();
        MixedRoomDataSource.OooO0o0().f22993OooO0oO = this.f22959OooOOoo;
        Intent intent2 = new Intent(this, (Class<?>) RoomLiveService.class);
        this.f22958OooOOo0 = intent2;
        this.f22957OooOOo = new OooO0O0();
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent2);
        } else {
            startService(intent2);
        }
        bindService(this.f22958OooOOo0, this.f22957OooOOo, 1);
        if (MixedRoomDataSource.OooO0o0().f22997OooOO0o) {
            this.f22959OooOOoo.obtainMessage(2025).sendToTarget();
            return;
        }
        MixedRoomDataSource.OooO0o0().f22997OooOO0o = false;
        setVolumeControlStream(0);
        if ("Meizu".equals(Build.BRAND)) {
            getWindow().getDecorView().setSystemUiVisibility(2);
        }
        p545o0oO0O00.OooOo00.OooO0O0(575, null);
        LiveEventBus.get("GiftBackpackFrozen", Boolean.class).observe(this, new o00000OO(this, i));
        LiveEventBus.get("LuckyNumberOpenDialog", Integer.class).observe(this, new com.yalla.yalla.mixedroom.OooO0O0(this, i));
        LiveEventBus.get("ROOM_CHAT_REPLY", ChatModel.class).observe(this, new com.yalla.yalla.mixedroom.OooO0OO(this, i));
        LiveEventBus.get("LOGIN_REENTER_ROOM").observe(this, new OooO0o(this, i));
        LiveEventBus.get("Close_RoomUI").observe(this, new OooO(this, 0));
        LiveEventBus.get("Room_State_Close").observe(this, new OooOO0(this, i));
        LiveEventBus.get("Disconnect_Room").observe(this, new OooOO0O(this, i));
        LiveEventBus.get("ROOM_COIN_NOT_ENOUGH").observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.OooOOO0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i2 = MixedRoomActivity.f22956OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23025OooO0Oo;
                mixedRoomActivity.getClass();
                k0.OooO00o(false, true, new Function1() { // from class: com.yalla.yalla.mixedroom.o00oO0o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        mixedRoomActivity.f22984OoooO00 = (f0) obj2;
                        return null;
                    }
                });
            }
        });
        LiveEventBus.get("ROOM_MEMBER_LEVEL_UPGRADE", Pair.class).observe(this, new OooOOO());
        LiveEventBus.get("QuickRechargeDialogFromMagicCardDialog").observe(this, new OooOOOO(this, i));
        LiveEventBus.get("QuickRechargeDialogFromRoomGiftSendDialog").observe(this, new o0000Ooo(this, i));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        n nVar;
        super.onDestroy();
        MixedRoomDataSource.OooO0o0().f22993OooO0oO = null;
        OooO0O0 oooO0O0 = this.f22957OooOOo;
        if (oooO0O0 != null) {
            unbindService(oooO0O0);
            this.f22957OooOOo = null;
        }
        n3 n3Var = this.f22979Oooo0o;
        if (n3Var != null) {
            n3Var.f58114OooO0O0 = null;
        }
        w1 w1Var = this.f22968OooOoo;
        if (w1Var != null && (nVar = ((u1) w1Var.f50853OooO0o.getValue()).f50840OooO0OO) != null && nVar.isShowing()) {
            nVar.dismiss();
        }
        p495o0o00Oo.OooO oooO = this.f22983OoooO0;
        if (oooO != null) {
            MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
            p429o0OoOO.o0Oo0oo.OooO0oO();
            RoomState roomState = RoomState.InRoom;
            Iterator<p495o0o00Oo.OooOO0O> it = oooO.f49616OooO0O0.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
        }
        p598o0oo00Oo.o0000O00.OooO0OO("MixedRoomActivity", "onDestroy");
        MutableState mutableState2 = p429o0OoOO.o0Oo0oo.f46817OooO00o;
        if (p429o0OoOO.o0Oo0oo.OooO0oO() != RoomState.Close) {
            p598o0oo00Oo.o0000O00.OooO0OO("MixedRoomActivity", "onDestroy hookRoom");
            p429o0OoOO.o0Oo0oo.f46817OooO00o.setValue(RoomState.Hook);
            LiveEventBus.get("Close_RoomUI").post(null);
        }
        System.gc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p545o0oO0O00.OooOOOO
    public final void onEventMainThread(p545o0oO0O00.OooOOO oooOOO) {
        RoomRunWayModel roomRunWayModel;
        super.onEventMainThread(oooOOO);
        int i = oooOOO.f55758OooO00o;
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        if (i == 33) {
            try {
                T t = oooOOO.f55760OooO0OO;
                if (t != 0) {
                    MixedRoomDataSource.OooO0o0().OooOOo((RoomConfiguration) t, oooO00o.OooO00o().f24543OooO0oo.getValue());
                    return;
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i == 106) {
            ForwardingRedPacketModel forwardingRedPacketModel = (ForwardingRedPacketModel) oooOOO.f55760OooO0OO;
            String redId = android.support.v4.media.session.OooO0OO.OooO0O0(new StringBuilder(), forwardingRedPacketModel.id, "");
            String message = forwardingRedPacketModel.message;
            Intrinsics.checkNotNullParameter(redId, "redId");
            Intrinsics.checkNotNullParameter(message, "message");
            String str = "{\"id\":" + redId + ",\"message\":\"" + message + "\"}";
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10010, str);
                return;
            }
            return;
        }
        if (i == 113) {
            RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
            if (roomLiveService2 != null) {
                roomLiveService2.OooO0oO(10051, "");
                return;
            }
            return;
        }
        if (i == 163) {
            OooOo();
            return;
        }
        if (i == 174) {
            T t2 = oooOOO.f55760OooO0OO;
            if (t2 != 0) {
                oooO00o.OooO00o().f24578OoooO0.postValue((RoomUserInfoModel) t2);
                return;
            }
            return;
        }
        if (i == 552) {
            if (oooOOO.f55759OooO0O0 == 0) {
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.send_successfully);
                if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? 1 : 0) != 0) {
                    return;
                }
                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Added_successfully);
            if (((strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) ? 1 : 0) != 0) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o2.run();
                return;
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                return;
            }
        }
        if (i == 2050) {
            OooOo0O((Message) oooOOO.f55760OooO0OO);
            return;
        }
        p495o0o00Oo.OooO oooO = this.f22983OoooO0;
        if (i == 501) {
            p598o0oo00Oo.o0000O00.OooO0O0("贵族开通续费 广播***************");
            RoomBroadcastModel roomBroadcastModel = new RoomBroadcastModel();
            roomBroadcastModel.setNobleData(13, new RoomBroadcastOpenNobleDataModel().setNobleActionOpen());
            o0OoO00O o0ooo00o2 = oooO.f49621OooO0oO;
            if (o0ooo00o2 == null || !this.f22978Oooo0OO) {
                return;
            }
            o0ooo00o2.OooO0o0(roomBroadcastModel);
            return;
        }
        if (i == 502) {
            p598o0oo00Oo.o0000O00.OooO0O0("贵族发送 广播喇叭 ***************");
            RoomBroadcastModel roomBroadcastModel2 = new RoomBroadcastModel();
            roomBroadcastModel2.setTextData(9, "");
            o0OoO00O o0ooo00o3 = oooO.f49621OooO0oO;
            if (o0ooo00o3 == null || !this.f22978Oooo0OO) {
                return;
            }
            o0ooo00o3.OooO0o0(roomBroadcastModel2);
            return;
        }
        if (i == 567) {
            T t3 = oooOOO.f55760OooO0OO;
            if (!(t3 instanceof RoomRunWayModel) || (roomRunWayModel = (RoomRunWayModel) t3) == null) {
                return;
            }
            boolean zIsLuckyflag = roomRunWayModel.isLuckyflag();
            boolean zHasFirstLuckyLevel = roomRunWayModel.hasFirstLuckyLevel();
            String fromUserId = roomRunWayModel.getFromUserId();
            long luckymoney = roomRunWayModel.getLuckymoney();
            long luckymultiple = roomRunWayModel.getLuckymultiple();
            if (zIsLuckyflag && zHasFirstLuckyLevel) {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (String.valueOf(o0O00oO0.OooOOo0().getValue()).equals(fromUserId)) {
                    o00O0OO0.OooO00o().getClass();
                    o0OOO0 o0ooo1 = new o0OOO0(this);
                    String string = getString(p562o0oOo000.o000000.lucky_gift_congratulation_content);
                    TextView textView = o0ooo1.f58692OooOO0O;
                    if (textView != null) {
                        textView.setText(string);
                        o0ooo1.f58692OooOO0O.setVisibility(0);
                    }
                    String strOooO00o = androidx.compose.ui.input.key.OooO00o.OooO00o("", luckymoney);
                    TextView textView2 = o0ooo1.f58695OooOOO0;
                    if (textView2 != null) {
                        textView2.setText(strOooO00o);
                        o0ooo1.f58695OooOOO0.setVisibility(0);
                    }
                    String strOooO00o2 = androidx.compose.ui.input.key.OooO00o.OooO00o("", luckymultiple);
                    if (o0ooo1.f58693OooOO0o != null && !com.code.android.util.OooOo00.OooO00o(strOooO00o2)) {
                        o0ooo1.f58693OooOO0o.setText(com.code.android.util.o0000O.OooO00o(o0ooo1.OooO0oO(p562o0oOo000.o000000.lucky_gift_dialog_xxx_times_reward), strOooO00o2));
                        o0ooo1.f58693OooOO0o.setVisibility(0);
                    }
                    o0ooo1.show();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 568) {
            RoomLiveService roomLiveService3 = RoomLiveService.f24596OooOo00;
            if (roomLiveService3 != null) {
                roomLiveService3.OooO0oO(10054, null);
                return;
            }
            return;
        }
        switch (i) {
            case 101:
                long jLongValue = Long.valueOf((String) oooOOO.f55760OooO0OO).longValue();
                RoomLiveService roomLiveService4 = RoomLiveService.f24596OooOo00;
                if (roomLiveService4 != null) {
                    roomLiveService4.OooO0oO(10017, "{\"to\":" + jLongValue + "}");
                }
                break;
            case 102:
                String userIdx = (String) oooOOO.f55760OooO0OO;
                int i2 = oooOOO.f55759OooO0O0 == 1 ? 1 : 0;
                Intrinsics.checkNotNullParameter(userIdx, "userIdx");
                String str2 = "{\"to\":" + userIdx + ",\"silence\":" + i2 + "}";
                RoomLiveService roomLiveService5 = RoomLiveService.f24596OooOo00;
                if (roomLiveService5 != null) {
                    roomLiveService5.OooO0oO(10006, str2);
                }
                break;
            case 103:
                String userIdx2 = (String) oooOOO.f55760OooO0OO;
                Intrinsics.checkNotNullParameter(userIdx2, "userIdx");
                Intrinsics.checkNotNullParameter("", "blockaction");
                String str3 = "{\"to\":" + userIdx2 + ",\"blockaction\":}";
                RoomLiveService roomLiveService6 = RoomLiveService.f24596OooOo00;
                if (roomLiveService6 != null) {
                    roomLiveService6.OooO0oO(10008, str3);
                }
                break;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        RoomModel roomModel = (RoomModel) intent.getSerializableExtra("room");
        if (roomModel == null || roomModel.getId() == com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0()) {
            return;
        }
        OooOo0(roomModel);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        PasswordSettingDialog passwordSettingDialog;
        super.onPause();
        this.f22978Oooo0OO = false;
        o oVar = this.f22961OooOo0;
        if (oVar != null && (passwordSettingDialog = oVar.f50169OooO00o) != null && passwordSettingDialog.isShowing()) {
            EditText editText = this.f22961OooOo0.f50169OooO00o.f27408OooOOo0;
            kotlin.collections.OooO00o.OooO0O0(editText.getContext().getApplicationContext(), new Handler(), p371o0OOo0oO.o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)"), editText.getWindowToken(), 0);
        }
        HashMap map = new HashMap();
        long j = this.f22287OooOOOO;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        map.put("staytime", sb.toString());
        o0oo0000.OooO00o.OooO0OO("402006", map);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        RoomModel roomModel = (RoomModel) bundle.getSerializable("roommodel");
        if (roomModel != null) {
            this.f22980Oooo0o0 = roomModel;
            MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
            p429o0OoOO.o0Oo0oo.OooO0o(roomModel, null);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        PasswordSettingDialog passwordSettingDialog;
        super.onResume();
        Observable<Object> observable = LiveEventBus.get("LuckyPacket_Show_MixedRoomActivityOnResume");
        Boolean bool = Boolean.TRUE;
        observable.post(bool);
        this.f22978Oooo0OO = true;
        p501o0o00o00.OooOO0O oooOO0O = this.f22967OooOoOO;
        if (oooOO0O != null) {
            oooOO0O.f50166OooO0oo = true;
        }
        o oVar = this.f22961OooOo0;
        if (oVar != null && (passwordSettingDialog = oVar.f50169OooO00o) != null && passwordSettingDialog.isShowing()) {
            EditText editText = this.f22961OooOo0.f50169OooO00o.f27408OooOOo0;
            kotlin.collections.OooO00o.OooO0O0(editText.getContext().getApplicationContext(), new Handler(), p371o0OOo0oO.o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)"), editText.getWindowToken(), 0);
        }
        Intrinsics.checkNotNullParameter("HIDE_KEYBOARD", "key");
        Observable observable2 = LiveEventBus.get("roomHIDE_KEYBOARD", Object.class);
        Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
        observable2.post(bool);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("roommodel", this.f22980Oooo0o0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        p501o0o00o00.OooOO0O oooOO0O = this.f22967OooOoOO;
        if (oooOO0O != null) {
            oooOO0O.f50166OooO0oo = false;
            oooOO0O.getClass();
        }
    }
}
