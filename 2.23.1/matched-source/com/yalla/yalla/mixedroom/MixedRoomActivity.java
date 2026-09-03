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
import androidx.lifecycle.ViewModelProvider;
import com.app.base.protobuf.room.Room;
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
import com.yalla.yalla.model.event.EventModel;
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
import p270o00oooo0.o0O0OO0;
import p381o0OOoOOO.o00O00o0;
import p437o0OoOOOo.o0O00000;
import p474o0OoooOO.oo0oO0;
import p498o0o00Oo0.o00O0O0O;
import p499o0o00OoO.o000O0;
import p500o0o00Ooo.o000O0O0;
import p502o0o00o0.o0OO;
import p502o0o00o0.oO000Oo0;
import p504o0o00o0O.g3;
import p510o0o00oo0.o0OOOO0o;
import p510o0o00oo0.o0o0000;
import p541o0o0Oo0o.o00O0OOO;
import p558o0oOOoo.o0O;
import p559o0oOOoo0.o0O000;
import p559o0oOOoo0.o0O000Oo;
import p587o0oOooO.oO00Oo0;
import p593o0oOoooO.h0;
import p648o0ooOOoo.u0;
import p675oO0Oo.c2;
import p675oO0Oo.m1;
import p675oO0Oo.o0OO000;
import p675oO0Oo.o0OO000o;
import p675oO0Oo.oO0O00;
import p675oO0Oo.w2;

/* JADX INFO: loaded from: classes4.dex */
public class MixedRoomActivity extends BaseFragmentActivity implements p396o0Oo0.OooOO0O {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f22961OoooO0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OooO0O0 f22962OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Intent f22963OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public p396o0Oo0.OooOOO0<MixedRoomActivity> f22964OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f22965OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public p503o0o00o00.OooO f22966OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public o000O f22967OooOo00;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextView f22969OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public FrameLayout f22970OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public BubbleView f22971OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o000O0 f22972OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public o0o0000 f22973OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ListView f22974OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public o0OO000o f22975OooOooO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public LiveRoomVM f22977Oooo;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f22983Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public u0 f22984Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public RoomModel f22985Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public RoomFrameUIController f22986Oooo0oO;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final p444o0OoOo0O.o0000O f22968OooOo0O = new p444o0OoOo0O.o0000O(this);

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f22976OooOooo = 0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final o00000 f22979Oooo000 = new View.OnTouchListener() { // from class: com.yalla.yalla.mixedroom.o00000
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int i = MixedRoomActivity.f22961OoooO0O;
            MixedRoomActivity mixedRoomActivity = this.f23045OooO0Oo;
            mixedRoomActivity.getClass();
            if (motionEvent.getAction() == 0) {
                try {
                    if (System.currentTimeMillis() - mixedRoomActivity.f22965OooOo > 120) {
                        mixedRoomActivity.f22965OooOo = System.currentTimeMillis();
                        int i2 = mixedRoomActivity.f22976OooOooo + 1;
                        mixedRoomActivity.f22976OooOooo = i2;
                        if (i2 >= 30) {
                            SendHeartModel sendHeartModel = new SendHeartModel();
                            sendHeartModel.num = mixedRoomActivity.f22976OooOooo;
                            RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
                            if (roomLiveService != null) {
                                roomLiveService.OooO0oO(10011, oO00Oo0.OooO0OO(sendHeartModel));
                            }
                            mixedRoomActivity.f22976OooOooo = 0;
                        }
                        mixedRoomActivity.f22971OooOoO0.OooO00o();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f22980Oooo00O = false;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f22981Oooo00o = false;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f22978Oooo0 = true;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OooO00o f22982Oooo0O0 = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f22987Oooo0oo = false;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public c2 f22989OoooO00 = null;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final p496o0o00OOo.o000O000 f22988OoooO0 = new p496o0o00OOo.o000O000(this);

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
                mixedRoomActivity.f22978Oooo0 = false;
                return;
            }
            View childAt = absListView.getChildAt(absListView.getLastVisiblePosition() - absListView.getFirstVisiblePosition());
            if (com.code.android.util.OooOo00.OooO0O0(childAt)) {
                mixedRoomActivity.f22978Oooo0 = absListView.getHeight() >= childAt.getBottom();
            }
            if (!mixedRoomActivity.f22978Oooo0 || (textView = mixedRoomActivity.f22969OooOo0o) == null) {
                return;
            }
            textView.clearAnimation();
            mixedRoomActivity.f22969OooOo0o.setVisibility(8);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 0) {
                int lastVisiblePosition = absListView.getLastVisiblePosition();
                int count = absListView.getCount() - 1;
                MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
                if (lastVisiblePosition != count) {
                    if (absListView.getLastVisiblePosition() < absListView.getCount() - 1) {
                        mixedRoomActivity.f22969OooOo0o.setVisibility(0);
                        mixedRoomActivity.f22969OooOo0o.setText(p565o0oOo000.o000OOo.Room_chatline_Bottom);
                    }
                    mixedRoomActivity.f22978Oooo0 = false;
                    return;
                }
                View childAt = absListView.getChildAt(absListView.getLastVisiblePosition() - absListView.getFirstVisiblePosition());
                if (com.code.android.util.OooOo00.OooO0O0(childAt)) {
                    mixedRoomActivity.f22978Oooo0 = absListView.getHeight() >= childAt.getBottom();
                }
                if (mixedRoomActivity.f22978Oooo0) {
                    mixedRoomActivity.f22969OooOo0o.clearAnimation();
                    mixedRoomActivity.f22969OooOo0o.setVisibility(8);
                }
            }
        }
    }

    public class OooO0O0 implements ServiceConnection {
        public OooO0O0() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p597o0oo00O.OooOOOO.OooO0OO("RoomLiveService", "onServiceConnected");
            MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
            RoomModel roomModel = (RoomModel) mixedRoomActivity.getIntent().getSerializableExtra("room");
            p482o0o000O.OooOo oooOo = com.yalla.yalla.service.room.OooO00o.f24524OooO0o0;
            if (oooOo.OooO0o0() == 0) {
                if (roomModel != null) {
                    RoomLiveService.f24604OooOo00.OooO(roomModel);
                    return;
                } else {
                    MutableState mutableState = p431o0OoOO.o0Oo0oo.f46817OooO00o;
                    p431o0OoOO.o0Oo0oo.OooO00o();
                    return;
                }
            }
            if (roomModel != null && oooOo.OooO0o0() != roomModel.getId()) {
                mixedRoomActivity.OooOo0(roomModel);
                return;
            }
            int i = MixedRoomActivity.f22961OoooO0O;
            RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10054, null);
            }
            p597o0oo00O.OooOOOO.OooO0OO("RoomLiveService", "挂机恢复房间");
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            p597o0oo00O.OooOOOO.OooO0O0("onServiceDisconnected name = " + componentName);
        }
    }

    public class OooO0OO implements Animation.AnimationListener {
        public OooO0OO() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            MixedRoomActivity.this.f22981Oooo00o = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
            mixedRoomActivity.f22969OooOo0o.setVisibility(0);
            mixedRoomActivity.f22969OooOo0o.setText(p565o0oOo000.o000OOo.chatline_new);
        }
    }

    @Override // p396o0Oo0.OooOO0O
    public final void OooO0Oo(Message message) {
        OooOo0O(message);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO() {
        overridePendingTransition(p565o0oOo000.o00Ooo.anim_activity_room_open_enter, p565o0oOo000.o00Ooo.anim_empty);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO0() {
        overridePendingTransition(p565o0oOo000.o00Ooo.anim_empty, p565o0oOo000.o00Ooo.anim_activity_room_close_exit);
    }

    public final synchronized void OooOo() {
        this.f22978Oooo0 = true;
        TextView textView = this.f22969OooOo0o;
        if (textView != null) {
            textView.clearAnimation();
            this.f22969OooOo0o.setVisibility(8);
        }
        o0o0000 o0o0000Var = this.f22973OooOoo;
        if (o0o0000Var != null) {
            int count = o0o0000Var.getCount();
            this.f22974OooOoo0.setSelection(count == 0 ? 0 : count - 1);
        }
    }

    public final void OooOo0(RoomModel roomModel) {
        p597o0oo00O.OooOOOO.OooO0OO("RoomLiveService", "enterNewRoom roomModel = ".concat(p187o00o00o0.OooO.OooO00o(roomModel)));
        if (roomModel.getId() == 0) {
            return;
        }
        this.f22985Oooo0o0 = roomModel;
        OooOoO0();
        RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO(roomModel);
        }
    }

    public final void OooOo0O(Message message) {
        p497o0o00Oo.OooOOO0 oooOOO0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = message.what;
        p496o0o00OOo.o000O000 o000o001 = this.f22988OoooO0;
        boolean z = true;
        switch (i) {
            case 2025:
                h0.OooO0O0("201016");
                p597o0oo00O.OooOOOO.OooO0o("接收到消息: GlobalDef.SERVICE_STATUS_FAILD" + isFinishing());
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.net_connection_error);
                if (!isFinishing()) {
                    o000O o000o = new o000O(this);
                    o000o.OooOo00(strOooO0OO);
                    o000o.OooO0o(false);
                    o000o.OooOO0(new o00000O0());
                    o000o.OooOO0o();
                }
                break;
            case RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS /* 10001 */:
                RoomLoginInformation roomLoginInformation = (RoomLoginInformation) oO00Oo0.OooO00o((String) message.obj, RoomLoginInformation.class);
                if (roomLoginInformation != null) {
                    p597o0oo00O.OooOOOO.OooO0O0("processLoginInformation loginMessage = " + roomLoginInformation.toJSONString());
                    if (roomLoginInformation.code == 0 && roomLoginInformation.getRoom() != null) {
                        o000O0O0 o000o0o1 = o000o001.f49646OooO0oo;
                        if (o000o0o1 != null) {
                            ((o0O) o000o0o1.f49914OooO0o.getValue()).OooO0OO();
                            ((o0O) o000o0o1.f49916OooO0oO.getValue()).OooO0OO();
                            o000o0o1.OooO0OO();
                        }
                        p497o0o00Oo.OooOOO0 oooOOO1 = o000o001.f49645OooO0oO;
                        if (oooOOO1 != null) {
                            oooOOO1.f49658OooO0OO.clear();
                            RoomBroadcastView roomBroadcastView = oooOOO1.f49660OooO0o;
                            if (roomBroadcastView != null) {
                                roomBroadcastView.clearAnimation();
                            }
                        }
                    }
                }
                break;
            case 10011:
                if (!this.f22980Oooo00O) {
                    this.f22980Oooo00O = true;
                    new Thread(new o000O000(this)).start();
                }
                break;
            case 10019:
                p597o0oo00O.OooOOOO.OooO0O0("收到广播***************");
                RoomBroadcastModel roomBroadcastModel = (RoomBroadcastModel) message.obj;
                if (roomBroadcastModel != null && (oooOOO0 = o000o001.f49645OooO0oO) != null) {
                    if (!this.f22983Oooo0OO) {
                        return;
                    } else {
                        oooOOO0.OooO0o0(roomBroadcastModel);
                    }
                }
                break;
            case 10043:
                p597o0oo00O.OooOOOO.OooO0o("贵族购买或续费广播喇叭 *************** msg = " + message);
                RoomBroadcastOpenNobleModel roomBroadcastOpenNobleModel = (RoomBroadcastOpenNobleModel) oO00Oo0.OooO00o((String) message.obj, RoomBroadcastOpenNobleModel.class);
                if (roomBroadcastOpenNobleModel != null && roomBroadcastOpenNobleModel.getData() != null) {
                    p597o0oo00O.OooOOOO.OooO0O0("贵族购买或续费广播喇叭 roomBroadcastOpenNobleModel = ".concat(p187o00o00o0.OooO.OooO00o(roomBroadcastOpenNobleModel)));
                    RoomBroadcastModel roomBroadcastModel2 = new RoomBroadcastModel();
                    roomBroadcastModel2.setNobleData(13, roomBroadcastOpenNobleModel.getData());
                    if (o000o001.f49645OooO0oO != null && (roomBroadcastOpenNobleModel.getData().getAction() == 1 || roomBroadcastOpenNobleModel.getData().getAction() == 2)) {
                        if (!this.f22983Oooo0OO) {
                            return;
                        } else {
                            o000o001.f49645OooO0oO.OooO0o0(roomBroadcastModel2);
                        }
                    }
                }
                break;
            case 10050:
                SkillCardModel skillCardModel = (SkillCardModel) message.obj;
                skillCardModel.setCardType(2);
                o000O0 o000o0 = this.f22972OooOoOO;
                if (o000o0 != null) {
                    o000o0.OooO00o(skillCardModel);
                }
                break;
            case 10060:
                if (message.obj == null) {
                    String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.notinroom);
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                        } else {
                            o000oo0OooO00o.run();
                        }
                    }
                } else {
                    com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24586OoooO0.postValue((RoomUserInfoModel) message.obj);
                }
                break;
            case 10063:
                LiveEventBus.get("MORA_GAME_ANIM").post((Room.MoraStartPkRequestReply) message.obj);
                break;
            case 10066:
                Room.MagicVoiceOut magicVoiceOut = (Room.MagicVoiceOut) message.obj;
                if (this.f22972OooOoOO != null) {
                    SkillCardModel skillCardModel2 = new SkillCardModel();
                    skillCardModel2.setCardType(3);
                    RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
                    skillCardModel2.setNewFrom(companion.of(magicVoiceOut.getFrom()));
                    skillCardModel2.setNewTarget(companion.of(magicVoiceOut.getTarget()));
                    this.f22972OooOoOO.OooO00o(skillCardModel2);
                }
                break;
            case 21000:
                p597o0oo00O.OooOOOO.OooO0OO("RoomDialogDis", "dismiss 1359 ROOM_SHOW_DIALOG_21000");
                break;
            case 21001:
                p597o0oo00O.OooOOOO.OooO0OO("RoomDialogDis", "dismiss 1383 ROOM_CANCEL_DIALOG_21001");
                break;
            case 30002:
                RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oO(10054, null);
                }
                break;
            case 33001:
                OooOoo0();
                break;
            case 33002:
                g3 g3Var = o000o001.f49643OooO0o;
                if (g3Var != null) {
                    RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) message.obj;
                    if (roomUserInfoModel != null) {
                        g3Var.OooO0OO().add(roomUserInfoModel);
                    }
                    if (!g3Var.OooO0OO().isEmpty() && g3Var.f49648OooO0O0 == null) {
                        g3Var.f49648OooO0O0 = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(g3Var.f49652OooO00o), Dispatchers.getMain(), null, new p496o0o00OOo.o000O00(g3Var, null), 2, null);
                    }
                }
                break;
            case 100611:
                int iIntValue = ((Integer) message.obj).intValue();
                if (iIntValue == 0) {
                    String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Success);
                    if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO3, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o2);
                        } else {
                            o000oo0OooO00o2.run();
                        }
                    }
                } else if (iIntValue == 1) {
                    String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.error);
                    if (strOooO0OO4 != null && !StringsKt.isBlank(strOooO0OO4)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o3 = androidx.activity.OooOo00.OooO00o(strOooO0OO4, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o3);
                        } else {
                            o000oo0OooO00o3.run();
                        }
                    }
                }
                break;
            case 100612:
                final Room.InviteBarMemberToRequestReply inviteBarMemberToRequestReply = (Room.InviteBarMemberToRequestReply) message.obj;
                if (inviteBarMemberToRequestReply == null || this.f22987Oooo0oo) {
                    return;
                }
                this.f22987Oooo0oo = true;
                if (this.f22967OooOo00 == null) {
                    this.f22967OooOo00 = new o000O(this);
                }
                this.f22967OooOo00.OooOo00(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.invited_to_member));
                this.f22967OooOo00.OooOO0(new Function0() { // from class: com.yalla.yalla.mixedroom.OooOo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.f23034OooO0Oo.f22987Oooo0oo = false;
                        return null;
                    }
                });
                this.f22967OooOo00.OooOo0o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Decline));
                this.f22967OooOo00.OooOo0O(new Function0() { // from class: com.yalla.yalla.mixedroom.o0OOO0o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.f23085OooO0Oo.f22987Oooo0oo = false;
                        return null;
                    }
                });
                this.f22967OooOo00.OooOOOo(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Accept));
                this.f22967OooOo00.OooOo0(new Function0() { // from class: com.yalla.yalla.mixedroom.o000000O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2 = MixedRoomActivity.f22961OoooO0O;
                        if (MixedRoomDataSource.OooO0o0().f22996OooO0o == null) {
                            return null;
                        }
                        p483o0o000O0.OooOO0.OooO0O0(com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24560OooOOo0.getValue().intValue(), String.valueOf(inviteBarMemberToRequestReply.getFromuser().getUserId()), MixedRoomDataSource.OooO0o0().f22996OooO0o.getBaridx(), "1");
                        LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                        com.yalla.yalla.service.room.OooO00o.f24532OooOOOO.OooO0oO(false);
                        return null;
                    }
                });
                this.f22967OooOo00.OooOO0o();
                break;
            case o0O00000.Other_Device_Login /* 999001 */:
                o000O o000o2 = new o000O(this);
                o000o2.OooOOoo(p565o0oOo000.o000OOo.turntable_close_return_coin);
                o000o2.OooOO0o();
                break;
            case 1000600:
                p431o0OoOO.o0ooOOo o0ooooo = o000o001.f49647OooOO0;
                if (o0ooooo != null) {
                    RoomActivityEffectAnimModel animModel = (RoomActivityEffectAnimModel) message.obj;
                    Intrinsics.checkNotNullParameter(animModel, "animModel");
                    if (o0ooooo.f46823OooO00o.f22287OooO0oO) {
                        p431o0OoOO.o0ooOOo.OooO00o(o0ooooo, 0, animModel.getEffectFrameType(), 1, animModel.getUrl(), null, animModel.getAnimationId() == 2, 16);
                    }
                }
                break;
            default:
                p597o0oo00O.OooOOOO.OooO0o("Command not processed:" + message.what);
                break;
        }
        p597o0oo00O.OooOOOO.OooO0OO("MixedRoomActivity", "parseDoHandler  type : " + message.what + " use time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final void OooOo0o() {
        this.f22969OooOo0o.setVisibility(0);
        this.f22969OooOo0o.setText(p565o0oOo000.o000OOo.chatline_new);
        if (this.f22981Oooo00o) {
            return;
        }
        this.f22981Oooo00o = true;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimation.setDuration(2500L);
        alphaAnimation.setAnimationListener(new OooO0OO());
        this.f22969OooOo0o.startAnimation(alphaAnimation);
    }

    public final void OooOoO(RoomUserInfoModel roomUserInfoModel) {
        p444o0OoOo0O.o0000O00 o0000o00 = this.f22988OoooO0.f49638OooO;
        if (o0000o00 != null) {
            o0000o00.OooO00o(new o0O000(roomUserInfoModel.getUserName().getValue(), roomUserInfoModel.getUserId().getValue().longValue()), true);
        }
    }

    public final void OooOoO0() {
        p513o0o0O.OooO oooO;
        LiveEventBus.get("RESET_ROOM").post(Boolean.TRUE);
        o000O o000o = this.f22967OooOo00;
        if (o000o != null) {
            o000o.OooO0OO();
        }
        this.f22969OooOo0o.clearAnimation();
        this.f22969OooOo0o.setVisibility(8);
        this.f22978Oooo0 = true;
        p444o0OoOo0O.o0000O o0000o2 = this.f22968OooOo0O;
        if (o0000o2 != null) {
            o0000o2.f47230OooO0O0 = null;
        }
        u0 u0Var = this.f22984Oooo0o;
        if (u0Var != null && (oooO = u0Var.f57694OooO0O0) != null) {
            oooO.dismiss();
        }
        p496o0o00OOo.o000O000 o000o001 = this.f22988OoooO0;
        p444o0OoOo0O.o0000O00 o0000o00 = o000o001.f49638OooO;
        if (o0000o00 != null) {
            p498o0o00Oo0.o0OO00O o0oo00o2 = o0000o00.f47238OooO0OO;
            p373o0OOo0oO.o00oO0o o00oo0oOooO0O0 = o0oo00o2.OooO0O0();
            MessageEditText etMessageInput = o0oo00o2.OooO00o();
            Intrinsics.checkNotNullParameter(etMessageInput, "etMessageInput");
            if (o00oo0oOooO0O0 != null) {
                etMessageInput.setText("");
                o0O000Oo spanManager = etMessageInput.getSpanManager();
                spanManager.OooO00o();
                spanManager.f56126OooO00o.clear();
                etMessageInput.getMaskKeys().clear();
            }
        }
        Iterator<p496o0o00OOo.o000Oo0> it = o000o001.f49640OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0();
        }
        OooOoo0();
    }

    public final void OooOoOO(RoomUserInfoModel roomUserInfoModel, int i, int i2, boolean z) {
        if (this.f22968OooOo0O != null) {
            o000 onLogin = new o000(this, roomUserInfoModel, i, i2, z);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
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
        ArrayList arrayList = (ArrayList) MixedRoomDataSource.OooO0o0().f23001OooOO0O.clone();
        ArrayList<ChatModel> arrayList2 = this.f22973OooOoo.f50664OooO0o0;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.f22973OooOoo.notifyDataSetChanged();
        if (this.f22978Oooo0) {
            OooOo();
        } else {
            OooOo0o();
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        c2 c2Var = this.f22989OoooO00;
        if (c2Var != null) {
            p438o0OoOOo.o0000 o0000Var = (p438o0OoOOo.o0000) c2Var.f59065OooOOO0.getValue();
            if (i2 != 0) {
                o0000Var.getClass();
                return;
            }
            String string = o0000Var.f47023OooO00o.getString(p565o0oOo000.o000OOo.purchase_cancel);
            if (string == null || StringsKt.isBlank(string)) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        boolean z2;
        p496o0o00OOo.o000O000 o000o001 = this.f22988OoooO0;
        p444o0OoOo0O.o0000O00 o0000o00 = o000o001.f49638OooO;
        boolean z3 = false;
        if (o0000o00 != null) {
            p373o0OOo0oO.o00oO0o o00oo0oOooO0O0 = o0000o00.f47238OooO0OO.OooO0O0();
            if (o00oo0oOooO0O0 == null) {
                z = false;
            } else {
                if (o00oo0oOooO0O0.f43172OooO0o == 2) {
                    o00oo0oOooO0O0.OooO0O0();
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
        p482o0o000O.oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24528OooOO0O;
        if (oo0o0oo.f48594OooO0OO.getValue().booleanValue()) {
            oo0o0oo.f48594OooO0OO.setValue(Boolean.FALSE);
            z3 = true;
        } else {
            Iterator<p496o0o00OOo.o000Oo0> it = o000o001.f49640OooO0O0.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        if (z3) {
            return;
        }
        p503o0o00o00.OooO oooO = this.f22966OooOo0;
        if (oooO == null) {
            super.onBackPressed();
            return;
        }
        p567o0oOo0O.o000O00O o000o00o2 = oooO.f50151OooO0OO;
        MixedRoomActivity mixedRoomActivity = oooO.f50150OooO0O0;
        if (o000o00o2 == null) {
            oooO.f50151OooO0OO = new p567o0oOo0O.o000O00O(mixedRoomActivity);
        }
        oooO.f50151OooO0OO.f43645OooO0o = new p503o0o00o00.OooOO0(oooO);
        if (mixedRoomActivity == null || mixedRoomActivity.isFinishing() || mixedRoomActivity.isDestroyed()) {
            return;
        }
        oooO.f50151OooO0OO.show();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        RoomTheme roomThemeOooO0O0;
        RoomModel roomModel;
        super.onCreate(bundle);
        this.f22964OooOOoo = new p396o0Oo0.OooOOO0<>(this);
        getWindow().addFlags(128);
        int i = 0;
        o00O00o0.OooO0OO(getWindow(), 0);
        setContentView(p565o0oOo000.o0OO00O.activity_mixed_room);
        this.f22977Oooo = (LiveRoomVM) new ViewModelProvider(this).get(LiveRoomVM.class);
        Intent intent = getIntent();
        if (intent != null && (roomModel = (RoomModel) intent.getSerializableExtra("room")) != null) {
            this.f22985Oooo0o0 = roomModel;
        }
        p496o0o00OOo.o000O000 o000o001 = this.f22988OoooO0;
        MixedRoomActivity activity = o000o001.f49639OooO00o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.findViewById(p565o0oOo000.o0Oo0oo.cv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        p193o00o0O0O.o0000oo.OooO0Oo((ComposeView) viewFindViewById, o00O0OOO.f54575OooO00o);
        o000o001.f49643OooO0o = new g3(activity);
        o000o001.f49645OooO0oO = new p497o0o00Oo.OooOOO0(activity);
        o000o001.f49646OooO0oo = new o000O0O0(activity);
        new p501o0o00o.o0OOO0o(activity, o000o001);
        o000o001.f49644OooO0o0 = new p501o0o00o.o0ooOOo(activity);
        ComposeView composeView = (ComposeView) activity.findViewById(p565o0oOo000.o0Oo0oo.sideMainComposeView);
        Intrinsics.checkNotNull(composeView);
        p193o00o0O0O.o0000oo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(-1548327165, true, new p496o0o00OOo.o000(o000o001)));
        new RoomScreenShotManager(activity);
        new oO000Oo0(activity);
        o000o001.f49642OooO0Oo = new o0OO(activity);
        o000o001.f49638OooO = new p444o0OoOo0O.o0000O00(activity, o000o001.f49641OooO0OO);
        new o00O0O0O(activity);
        RoomGiftVideoPlayManager roomGiftVideoPlayManager = new RoomGiftVideoPlayManager();
        RoomGiftPlayContainer roomGiftPlayContainer = (RoomGiftPlayContainer) activity.findViewById(p565o0oOo000.o0Oo0oo.roomGifPlayContainer);
        roomGiftPlayContainer.initSvgaView(new RoomGiftSVGAView(o000o001.f49639OooO00o, null, 6, i));
        Intrinsics.checkNotNull(roomGiftPlayContainer);
        roomGiftVideoPlayManager.init(activity, roomGiftPlayContainer);
        o000o001.f49647OooOO0 = new p431o0OoOO.o0ooOOo(activity, roomGiftVideoPlayManager);
        this.f22970OooOoO = (FrameLayout) findViewById(p565o0oOo000.o0Oo0oo.v_room_root);
        RoomModel roomModel2 = this.f22985Oooo0o0;
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
        if (roomModel2 != null) {
            oooO00o.OooO00o().f24556OooOOO0.postValue((roomModel2.getId() == 0 || (roomThemeOooO0O0 = p410o0Oo0Oo0.o00O0O.OooO00o().OooOooO().OooO0O0(this.f22985Oooo0o0.getId())) == null) ? null : roomThemeOooO0O0.roomTheme);
        }
        this.f22966OooOo0 = new p503o0o00o00.OooO(this);
        this.f22974OooOoo0 = (ListView) findViewById(p565o0oOo000.o0Oo0oo.list_charline);
        this.f22973OooOoo = new o0o0000(this);
        LiveEventBus.get("DISLIKE_EVENT").observe(this, new o0000O0(this));
        o0o0000 o0o0000Var = this.f22973OooOoo;
        o0o0000Var.f50671OooOOO0 = new Function5() { // from class: com.yalla.yalla.mixedroom.OooOo00
            /* JADX WARN: Code duplicated, block: B:22:0x0070  */
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                Integer num3 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23035OooO0Oo;
                mixedRoomActivity.getClass();
                h0.OooO0O0("102038");
                if (((ChatModel) obj5).getGiftsubtype() == 600) {
                    MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p393o0OOooo0.o0OO00O.f43560OooO00o;
                    int iIntValue = num2.intValue();
                    Map<Integer, GiftPropModel> value = p393o0OOooo0.o0OO00O.f43561OooO0O0.getValue();
                    if ((value != null ? value.get(Integer.valueOf(iIntValue)) : null) == null) {
                        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.vip6_send_for_userInfo_content);
                        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
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
        o0o0000Var.f50670OooOOO = new Function6() { // from class: com.yalla.yalla.mixedroom.Oooo000
            @Override // kotlin.jvm.functions.Function6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                int i2 = MixedRoomActivity.f22961OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23037OooO0Oo;
                mixedRoomActivity.getClass();
                h0.OooO0O0("102038");
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                ((Integer) obj4).intValue();
                mixedRoomActivity.OooOoOO((RoomUserInfoModel) obj, iIntValue, iIntValue2, ((Boolean) obj5).booleanValue());
                return null;
            }
        };
        o0o0000Var.f50672OooOOOO = new Function2() { // from class: com.yalla.yalla.mixedroom.Oooo0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ProfileLimitModel next;
                final String str = (String) obj;
                final Boolean bool = (Boolean) obj2;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23036OooO0Oo;
                mixedRoomActivity.getClass();
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o2 = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
                if (oooO00o2.OooO00o().f24543OooO.getValue() == null || oooO00o2.OooO00o().f24543OooO.getValue().getProfileLimit() == null) {
                    next = null;
                } else {
                    Iterator<ProfileLimitModel> it = oooO00o2.OooO00o().f24543OooO.getValue().getProfileLimit().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (next.getOperationType() == 3) {
                        }
                    }
                    next = null;
                }
                o000O00.OooO00o(mixedRoomActivity, next, new Function0() { // from class: com.yalla.yalla.mixedroom.o000OOo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = MixedRoomActivity.f22961OoooO0O;
                        MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        mixedRoomActivity2.getClass();
                        Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
                        Observable observable = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
                        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
                        observable.post(Boolean.TRUE);
                        o0OO000.OooO00o().getClass();
                        o0OO000o o0oo000o = new o0OO000o(mixedRoomActivity2);
                        mixedRoomActivity2.f22975OooOooO = o0oo000o;
                        o0oo000o.OooOO0o(str, bool);
                        mixedRoomActivity2.f22975OooOooO.show();
                        return null;
                    }
                });
                return null;
            }
        };
        this.f22974OooOoo0.setAdapter((ListAdapter) o0o0000Var);
        this.f22974OooOoo0.setOnScrollListener(this.f22982Oooo0O0);
        this.f22974OooOoo0.setOnTouchListener(this.f22979Oooo000);
        o0o0000 o0o0000Var2 = this.f22973OooOoo;
        o0o0000Var2.f50665OooO0oO = new o000oOoO();
        o0o0000Var2.f50666OooO0oo = new Function1() { // from class: com.yalla.yalla.mixedroom.o0OoOo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ChatModel chatModel = (ChatModel) obj;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23088OooO0Oo;
                mixedRoomActivity.getClass();
                Long value = chatModel.getNewFrom().getUserId().getValue();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                if (value == oo0oO0.OooOOo0().getValue()) {
                    return null;
                }
                mixedRoomActivity.OooOoO(chatModel.getNewFrom());
                return null;
            }
        };
        o0o0000Var2.f50661OooO = new Function1() { // from class: com.yalla.yalla.mixedroom.o00O0O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2;
                MixedRoomActivity mixedRoomActivity = this.f23073OooO0Oo;
                o0o0000 o0o0000Var3 = mixedRoomActivity.f22973OooOoo;
                int iIntValue = ((Integer) obj).intValue();
                ListView listChat = mixedRoomActivity.f22974OooOoo0;
                TextView tvNewmessageTips = mixedRoomActivity.f22969OooOo0o;
                Intrinsics.checkNotNullParameter(listChat, "listChat");
                Intrinsics.checkNotNullParameter(tvNewmessageTips, "tvNewmessageTips");
                if ((o0o0000Var3 != null ? o0o0000Var3.f50664OooO0o0 : null) != null && o0o0000Var3.f50664OooO0o0.size() > iIntValue) {
                    ArrayList<ChatModel> arrayList = o0o0000Var3.f50664OooO0o0;
                    if (arrayList.get(iIntValue).getReplyInfo() != null) {
                        RoomMessageReplyInfo replyInfo = arrayList.get(iIntValue).getReplyInfo();
                        o000O00O checkKey = o000O00O.f23067OooO0Oo;
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
                        if (i2 >= 0 && i2 < o0o0000Var3.getCount()) {
                            try {
                                o0o0000Var3.f50674OooOOo0 = i2;
                                listChat.smoothScrollToPosition(i2);
                                if (listChat.getFirstVisiblePosition() > i2) {
                                    tvNewmessageTips.setVisibility(0);
                                    tvNewmessageTips.setText(p565o0oOo000.o000OOo.Room_chatline_Bottom);
                                } else {
                                    o0o0000Var3.notifyDataSetChanged();
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
        o0o0000Var2.f50667OooOO0 = new Function2() { // from class: com.yalla.yalla.mixedroom.o00Oo0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                final Integer num = (Integer) obj;
                final Boolean bool = (Boolean) obj2;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23074OooO0Oo;
                mixedRoomActivity.getClass();
                h0.OooO0O0("102289");
                if (num.intValue() >= mixedRoomActivity.f22973OooOoo.f50664OooO0o0.size()) {
                    return null;
                }
                final ArrayList arrayList = (ArrayList) mixedRoomActivity.f22973OooOoo.f50664OooO0o0.clone();
                final ChatModel chatModel = mixedRoomActivity.f22973OooOoo.f50664OooO0o0.get(num.intValue());
                Function0 onLogin = new Function0() { // from class: com.yalla.yalla.mixedroom.o0O0O00
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ArrayList arrayList2 = arrayList;
                        int i3 = MixedRoomActivity.f22961OoooO0O;
                        MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        mixedRoomActivity2.getClass();
                        new w2(mixedRoomActivity2, arrayList2, num.intValue(), com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24547OooO0Oo.getValue().longValue(), bool.booleanValue(), new o0000O0O(mixedRoomActivity2, chatModel));
                        return null;
                    }
                };
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return null;
                }
                Activity context = com.code.android.util.OooO0O0.OooO0O0();
                if (context == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) LoginActivity.class));
                return null;
            }
        };
        o0o0000Var2.f50668OooOO0O = new Function1() { // from class: com.yalla.yalla.mixedroom.o00Ooo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23075OooO0Oo;
                mixedRoomActivity.getClass();
                if (num.intValue() >= mixedRoomActivity.f22973OooOoo.f50664OooO0o0.size()) {
                    return null;
                }
                p571o0oOo0o0.o0O0O00.f56324OooO0O0.OooO0o(mixedRoomActivity.f22973OooOoo.f50664OooO0o0.get(num.intValue()).getEventModel());
                return null;
            }
        };
        o0o0000Var2.f50669OooOO0o = new Function1() { // from class: com.yalla.yalla.mixedroom.oo000o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final Integer num = (Integer) obj;
                int i2 = MixedRoomActivity.f22961OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23091OooO0Oo;
                mixedRoomActivity.getClass();
                Function0 onLogin = new Function0() { // from class: com.yalla.yalla.mixedroom.oo0o0Oo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = MixedRoomActivity.f22961OoooO0O;
                        final MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        mixedRoomActivity2.getClass();
                        Integer num2 = num;
                        if (num2.intValue() >= mixedRoomActivity2.f22973OooOoo.f50664OooO0o0.size()) {
                            return null;
                        }
                        final EventModel eventModel = mixedRoomActivity2.f22973OooOoo.f50664OooO0o0.get(num2.intValue()).getEventModel();
                        if (!eventModel.getHasSubscribe()) {
                            p571o0oOo0o0.o0O0O00.f56324OooO0O0.OooO0Oo(mixedRoomActivity2, eventModel, new Function1() { // from class: com.yalla.yalla.mixedroom.o000000
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i4 = MixedRoomActivity.f22961OoooO0O;
                                    MixedRoomActivity mixedRoomActivity3 = mixedRoomActivity2;
                                    mixedRoomActivity3.getClass();
                                    eventModel.setHasSubscribe(((Boolean) obj2).booleanValue());
                                    mixedRoomActivity3.f22973OooOoo.notifyDataSetChanged();
                                    return null;
                                }
                            });
                            return null;
                        }
                        o000O o000o = new o000O(mixedRoomActivity2);
                        o000o.OooOo00(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.event_unSubscribe_content));
                        o000o.OooOo(true);
                        o000o.OooOOOO(p565o0oOo000.o000OOo.event_unSubscribe_confirm);
                        o000o.OooOo0(new o0000O(mixedRoomActivity2, eventModel));
                        o000o.OooOO0o();
                        return null;
                    }
                };
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return null;
                }
                Activity context = com.code.android.util.OooO0O0.OooO0O0();
                if (context == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) LoginActivity.class));
                return null;
            }
        };
        OooOoo0();
        TextView textView = (TextView) findViewById(p565o0oOo000.o0Oo0oo.tv_newmessage_tips);
        this.f22969OooOo0o = textView;
        textView.setOnClickListener(new o0000OO0(this));
        this.f22971OooOoO0 = (BubbleView) findViewById(p565o0oOo000.o0Oo0oo.bubbleView);
        this.f22972OooOoOO = new o000O0(p565o0oOo000.o0Oo0oo.ly_anmi_panda, this);
        LiveEventBus.get("Skill_Card_Anim").observe(this, new o0ooOOo(this, i));
        LiveEventBus.get("HideKeyboard").observe(this, new o0000oo(this));
        p482o0o000O.OooOo00 oooOo00 = com.yalla.yalla.service.room.OooO00o.f24535OooOOo0;
        oooOo00.f48447OooO0oO.observe(this, new o00000O(this, i));
        oooOo00.f48448OooO0oo.observe(this, new o00000OO(this, i));
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = oooO00o.OooO00o();
        this.f22984Oooo0o = new u0(this);
        this.f22986Oooo0oO = new RoomFrameUIController(this, oooO0O0OooO00o);
        oooO0O0OooO00o.f24562OooOo.observe(this, new o0000O00(this));
        p596o0oo000O.OooO0o.OooO0O0().toLowerCase();
        MixedRoomDataSource.OooO0o0().f22998OooO0oO = this.f22964OooOOoo;
        Intent intent2 = new Intent(this, (Class<?>) RoomLiveService.class);
        this.f22963OooOOo0 = intent2;
        this.f22962OooOOo = new OooO0O0();
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent2);
        } else {
            startService(intent2);
        }
        bindService(this.f22963OooOOo0, this.f22962OooOOo, 1);
        if (MixedRoomDataSource.OooO0o0().f23002OooOO0o) {
            this.f22964OooOOoo.obtainMessage(2025).sendToTarget();
            return;
        }
        MixedRoomDataSource.OooO0o0().f23002OooOO0o = false;
        setVolumeControlStream(0);
        if ("Meizu".equals(Build.BRAND)) {
            getWindow().getDecorView().setSystemUiVisibility(2);
        }
        o0O0OO0.OooO0OO(575, null);
        LiveEventBus.get("GiftBackpackFrozen", Boolean.class).observe(this, new o0000Ooo(this, i));
        LiveEventBus.get("LuckyNumberOpenDialog", Integer.class).observe(this, new com.yalla.yalla.mixedroom.OooO0O0(this, i));
        LiveEventBus.get("ROOM_CHAT_REPLY", ChatModel.class).observe(this, new com.yalla.yalla.mixedroom.OooO0OO(this, i));
        LiveEventBus.get("LOGIN_REENTER_ROOM").observe(this, new OooO0o(this, i));
        LiveEventBus.get("Close_RoomUI").observe(this, new OooO(this, 0));
        LiveEventBus.get("Room_State_Close").observe(this, new OooOO0(this, 0));
        LiveEventBus.get("Disconnect_Room").observe(this, new OooOO0O(this, i));
        LiveEventBus.get("ROOM_COIN_NOT_ENOUGH").observe(this, new OooOOO0(this, i));
        LiveEventBus.get("ROOM_MEMBER_LEVEL_UPGRADE", Pair.class).observe(this, new OooOOO());
        LiveEventBus.get("QuickRechargeDialogFromMagicCardDialog").observe(this, new OooOOOO(this, i));
        LiveEventBus.get("QuickRechargeDialogFromRoomGiftSendDialog").observe(this, new o0000(this, i));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        m1 m1Var;
        super.onDestroy();
        MixedRoomDataSource.OooO0o0().f22998OooO0oO = null;
        OooO0O0 oooO0O0 = this.f22962OooOOo;
        if (oooO0O0 != null) {
            unbindService(oooO0O0);
            this.f22962OooOOo = null;
        }
        u0 u0Var = this.f22984Oooo0o;
        if (u0Var != null) {
            u0Var.f57694OooO0O0 = null;
        }
        o0o0000 o0o0000Var = this.f22973OooOoo;
        if (o0o0000Var != null && (m1Var = ((o0OOOO0o) o0o0000Var.f50663OooO0o.getValue()).f50656OooO0OO) != null && m1Var.isShowing()) {
            m1Var.dismiss();
        }
        p496o0o00OOo.o000O000 o000o001 = this.f22988OoooO0;
        if (o000o001 != null) {
            MutableState mutableState = p431o0OoOO.o0Oo0oo.f46817OooO00o;
            p431o0OoOO.o0Oo0oo.OooO0oO();
            RoomState roomState = RoomState.InRoom;
            Iterator<p496o0o00OOo.o000Oo0> it = o000o001.f49640OooO0O0.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
        }
        p597o0oo00O.OooOOOO.OooO0OO("MixedRoomActivity", "onDestroy");
        MutableState mutableState2 = p431o0OoOO.o0Oo0oo.f46817OooO00o;
        if (p431o0OoOO.o0Oo0oo.OooO0oO() != RoomState.Close) {
            p597o0oo00O.OooOOOO.OooO0OO("MixedRoomActivity", "onDestroy hookRoom");
            p431o0OoOO.o0Oo0oo.f46817OooO00o.setValue(RoomState.Hook);
            LiveEventBus.get("Close_RoomUI").post(null);
        }
        System.gc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p548o0oO0O00.OooOOOO
    public final void onEventMainThread(p548o0oO0O00.OooOOO oooOOO) {
        RoomRunWayModel roomRunWayModel;
        super.onEventMainThread(oooOOO);
        int i = oooOOO.f55803OooO00o;
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
        if (i == 33) {
            try {
                T t = oooOOO.f55805OooO0OO;
                if (t != 0) {
                    MixedRoomDataSource.OooO0o0().OooOOo((RoomConfiguration) t, oooO00o.OooO00o().f24551OooO0oo.getValue());
                    return;
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i == 106) {
            ForwardingRedPacketModel forwardingRedPacketModel = (ForwardingRedPacketModel) oooOOO.f55805OooO0OO;
            String redId = android.support.v4.media.session.OooO0OO.OooO00o(new StringBuilder(), forwardingRedPacketModel.id, "");
            String message = forwardingRedPacketModel.message;
            Intrinsics.checkNotNullParameter(redId, "redId");
            Intrinsics.checkNotNullParameter(message, "message");
            String str = "{\"id\":" + redId + ",\"message\":\"" + message + "\"}";
            RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10010, str);
                return;
            }
            return;
        }
        if (i == 113) {
            RoomLiveService roomLiveService2 = RoomLiveService.f24604OooOo00;
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
            T t2 = oooOOO.f55805OooO0OO;
            if (t2 != 0) {
                oooO00o.OooO00o().f24586OoooO0.postValue((RoomUserInfoModel) t2);
                return;
            }
            return;
        }
        if (i == 552) {
            if (oooOOO.f55804OooO0O0 == 0) {
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.send_successfully);
                if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? 1 : 0) != 0) {
                    return;
                }
                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Added_successfully);
            if (((strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) ? 1 : 0) != 0) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o2.run();
                return;
            } else {
                com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o2);
                return;
            }
        }
        if (i == 2050) {
            OooOo0O((Message) oooOOO.f55805OooO0OO);
            return;
        }
        p496o0o00OOo.o000O000 o000o001 = this.f22988OoooO0;
        if (i == 501) {
            p597o0oo00O.OooOOOO.OooO0O0("贵族开通续费 广播***************");
            RoomBroadcastModel roomBroadcastModel = new RoomBroadcastModel();
            roomBroadcastModel.setNobleData(13, new RoomBroadcastOpenNobleDataModel().setNobleActionOpen());
            p497o0o00Oo.OooOOO0 oooOOO0 = o000o001.f49645OooO0oO;
            if (oooOOO0 == null || !this.f22983Oooo0OO) {
                return;
            }
            oooOOO0.OooO0o0(roomBroadcastModel);
            return;
        }
        if (i == 502) {
            p597o0oo00O.OooOOOO.OooO0O0("贵族发送 广播喇叭 ***************");
            RoomBroadcastModel roomBroadcastModel2 = new RoomBroadcastModel();
            roomBroadcastModel2.setTextData(9, "");
            p497o0o00Oo.OooOOO0 oooOOO1 = o000o001.f49645OooO0oO;
            if (oooOOO1 == null || !this.f22983Oooo0OO) {
                return;
            }
            oooOOO1.OooO0o0(roomBroadcastModel2);
            return;
        }
        if (i == 567) {
            T t3 = oooOOO.f55805OooO0OO;
            if (!(t3 instanceof RoomRunWayModel) || (roomRunWayModel = (RoomRunWayModel) t3) == null) {
                return;
            }
            boolean zIsLuckyflag = roomRunWayModel.isLuckyflag();
            boolean zHasFirstLuckyLevel = roomRunWayModel.hasFirstLuckyLevel();
            String fromUserId = roomRunWayModel.getFromUserId();
            long luckymoney = roomRunWayModel.getLuckymoney();
            long luckymultiple = roomRunWayModel.getLuckymultiple();
            if (zIsLuckyflag && zHasFirstLuckyLevel) {
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                if (String.valueOf(oo0oO0.OooOOo0().getValue()).equals(fromUserId)) {
                    o0OO000.OooO00o().getClass();
                    oO0O00 oo0o00 = new oO0O00(this);
                    String string = getString(p565o0oOo000.o000OOo.lucky_gift_congratulation_content);
                    TextView textView = oo0o00.f59672OooOO0O;
                    if (textView != null) {
                        textView.setText(string);
                        oo0o00.f59672OooOO0O.setVisibility(0);
                    }
                    String strOooO00o = androidx.compose.ui.input.key.OooO00o.OooO00o("", luckymoney);
                    TextView textView2 = oo0o00.f59675OooOOO0;
                    if (textView2 != null) {
                        textView2.setText(strOooO00o);
                        oo0o00.f59675OooOOO0.setVisibility(0);
                    }
                    String strOooO00o2 = androidx.compose.ui.input.key.OooO00o.OooO00o("", luckymultiple);
                    if (oo0o00.f59673OooOO0o != null && !com.code.android.util.OooOo00.OooO00o(strOooO00o2)) {
                        oo0o00.f59673OooOO0o.setText(com.code.android.util.o0000O.OooO00o(oo0o00.OooO0oO(p565o0oOo000.o000OOo.lucky_gift_dialog_xxx_times_reward), strOooO00o2));
                        oo0o00.f59673OooOO0o.setVisibility(0);
                    }
                    oo0o00.show();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 568) {
            RoomLiveService roomLiveService3 = RoomLiveService.f24604OooOo00;
            if (roomLiveService3 != null) {
                roomLiveService3.OooO0oO(10054, null);
                return;
            }
            return;
        }
        switch (i) {
            case 101:
                long jLongValue = Long.valueOf((String) oooOOO.f55805OooO0OO).longValue();
                RoomLiveService roomLiveService4 = RoomLiveService.f24604OooOo00;
                if (roomLiveService4 != null) {
                    roomLiveService4.OooO0oO(10017, "{\"to\":" + jLongValue + "}");
                }
                break;
            case 102:
                String userIdx = (String) oooOOO.f55805OooO0OO;
                int i2 = oooOOO.f55804OooO0O0 == 1 ? 1 : 0;
                Intrinsics.checkNotNullParameter(userIdx, "userIdx");
                String str2 = "{\"to\":" + userIdx + ",\"silence\":" + i2 + "}";
                RoomLiveService roomLiveService5 = RoomLiveService.f24604OooOo00;
                if (roomLiveService5 != null) {
                    roomLiveService5.OooO0oO(10006, str2);
                }
                break;
            case 103:
                String userIdx2 = (String) oooOOO.f55805OooO0OO;
                Intrinsics.checkNotNullParameter(userIdx2, "userIdx");
                Intrinsics.checkNotNullParameter("", "blockaction");
                String str3 = "{\"to\":" + userIdx2 + ",\"blockaction\":}";
                RoomLiveService roomLiveService6 = RoomLiveService.f24604OooOo00;
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
        if (roomModel == null || roomModel.getId() == com.yalla.yalla.service.room.OooO00o.f24524OooO0o0.OooO0o0()) {
            return;
        }
        OooOo0(roomModel);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        PasswordSettingDialog passwordSettingDialog;
        super.onPause();
        this.f22983Oooo0OO = false;
        p503o0o00o00.OooO oooO = this.f22966OooOo0;
        if (oooO != null && (passwordSettingDialog = oooO.f50149OooO00o) != null && passwordSettingDialog.isShowing()) {
            EditText editText = this.f22966OooOo0.f50149OooO00o.f27417OooOOo0;
            p373o0OOo0oO.o00Oo0.OooO00o(editText.getContext().getApplicationContext(), new Handler(), p373o0OOo0oO.o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)"), editText.getWindowToken(), 0);
        }
        HashMap map = new HashMap();
        long j = this.f22294OooOOOO;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        map.put("staytime", sb.toString());
        h0.OooO0OO("402006", map);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        RoomModel roomModel = (RoomModel) bundle.getSerializable("roommodel");
        if (roomModel != null) {
            this.f22985Oooo0o0 = roomModel;
            MutableState mutableState = p431o0OoOO.o0Oo0oo.f46817OooO00o;
            p431o0OoOO.o0Oo0oo.OooO0o(roomModel, null);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        PasswordSettingDialog passwordSettingDialog;
        super.onResume();
        Observable<Object> observable = LiveEventBus.get("LuckyPacket_Show_MixedRoomActivityOnResume");
        Boolean bool = Boolean.TRUE;
        observable.post(bool);
        this.f22983Oooo0OO = true;
        o000O0 o000o0 = this.f22972OooOoOO;
        if (o000o0 != null) {
            o000o0.f49907OooO0oo = true;
        }
        p503o0o00o00.OooO oooO = this.f22966OooOo0;
        if (oooO != null && (passwordSettingDialog = oooO.f50149OooO00o) != null && passwordSettingDialog.isShowing()) {
            EditText editText = this.f22966OooOo0.f50149OooO00o.f27417OooOOo0;
            p373o0OOo0oO.o00Oo0.OooO00o(editText.getContext().getApplicationContext(), new Handler(), p373o0OOo0oO.o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)"), editText.getWindowToken(), 0);
        }
        Intrinsics.checkNotNullParameter("HIDE_KEYBOARD", "key");
        Observable observable2 = LiveEventBus.get("roomHIDE_KEYBOARD", Object.class);
        Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
        observable2.post(bool);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("roommodel", this.f22985Oooo0o0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        o000O0 o000o0 = this.f22972OooOoOO;
        if (o000o0 != null) {
            o000o0.f49907OooO0oo = false;
            o000o0.getClass();
        }
    }
}
