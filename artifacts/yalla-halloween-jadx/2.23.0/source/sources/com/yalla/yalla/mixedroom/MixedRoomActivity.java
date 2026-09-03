package com.yalla.yalla.mixedroom;

import android.app.Activity;
import android.app.Dialog;
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
import com.code.android.util.o000O0;
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
import com.yalla.yalla.model.gift.GiftPropTypeUser;
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
import com.yalla.yalla.ui.view.NumberSize;
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
import p429o0OoOOO.oOO00O;
import p432o0OoOOOo.o00OOOOo;
import p433o0OoOOo.o00OOO00;
import p490o0o00OOO.o000O;
import p491o0o00OOo.o00O;
import p494o0o00OoO.o00OO00O;
import p494o0o00OoO.o00OO0O0;
import p495o0o00Ooo.o00Oo00;
import p495o0o00Ooo.o0O0O0Oo;
import p497o0o00o0.m;
import p497o0o00o0.n;
import p498o0o00o00.o0O0o00O;
import p502o0o00oOO.o0o0000;
import p502o0o00oOO.o0oo0000;
import p519o0o0O0oO.c0;
import p519o0o0O0oO.h1;
import p519o0o0O0oO.j;
import p519o0o0O0oO.o0O00O;
import p519o0o0O0oO.o0O00O0o;
import p519o0o0O0oO.w0;
import p552o0oOOoOo.o0OO0o00;
import p579o0oOoo.oOO0OO;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO000o00;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p585o0oOooOO.h;
import p585o0oOooOO.k;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public class MixedRoomActivity extends BaseFragmentActivity implements p394o0Oo00oO.o000OOo {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f23425OoooO0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OooO0O0 f23426OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Intent f23427OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public p394o0Oo00oO.o000000<MixedRoomActivity> f23428OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f23429OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o00OO00O f23430OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public p157o00OoOO0.o0OO00O f23431OooOo00;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextView f23433OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public FrameLayout f23434OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public BubbleView f23435OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public p493o0o00Oo0.OooOOO0 f23436OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public o0oo0000 f23437OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ListView f23438OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public o0O00O f23439OooOooO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public LiveRoomVM f23441Oooo;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f23447Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public p438o0OoOo00.o0O0O00 f23448Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public RoomModel f23449Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public RoomFrameUIController f23450Oooo0oO;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final o00OOO00 f23432OooOo0O = new o00OOO00(this);

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f23440OooOooo = 0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final o000000O f23443Oooo000 = new View.OnTouchListener() { // from class: com.yalla.yalla.mixedroom.o000000O
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int i = MixedRoomActivity.f23425OoooO0O;
            MixedRoomActivity mixedRoomActivity = this.f23498OooO0Oo;
            mixedRoomActivity.getClass();
            if (motionEvent.getAction() == 0) {
                try {
                    if (System.currentTimeMillis() - mixedRoomActivity.f23429OooOo > 120) {
                        mixedRoomActivity.f23429OooOo = System.currentTimeMillis();
                        int i2 = mixedRoomActivity.f23440OooOooo + 1;
                        mixedRoomActivity.f23440OooOooo = i2;
                        if (i2 >= 30) {
                            SendHeartModel sendHeartModel = new SendHeartModel();
                            sendHeartModel.num = mixedRoomActivity.f23440OooOooo;
                            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                            if (roomLiveService != null) {
                                roomLiveService.OooO0oO(10011, oOo00OO0.OooO0OO(sendHeartModel));
                            }
                            mixedRoomActivity.f23440OooOooo = 0;
                        }
                        mixedRoomActivity.f23435OooOoO0.OooO00o();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f23444Oooo00O = false;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f23445Oooo00o = false;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f23442Oooo0 = true;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OooO00o f23446Oooo0O0 = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f23451Oooo0oo = false;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public c0 f23453OoooO00 = null;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final p489o0o00OO0.OooO0OO f23452OoooO0 = new p489o0o00OO0.OooO0OO(this);

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
                mixedRoomActivity.f23442Oooo0 = false;
                return;
            }
            View childAt = absListView.getChildAt(absListView.getLastVisiblePosition() - absListView.getFirstVisiblePosition());
            if (com.code.android.util.OooOo00.OooO0O0(childAt)) {
                mixedRoomActivity.f23442Oooo0 = absListView.getHeight() >= childAt.getBottom();
            }
            if (!mixedRoomActivity.f23442Oooo0 || (textView = mixedRoomActivity.f23433OooOo0o) == null) {
                return;
            }
            textView.clearAnimation();
            mixedRoomActivity.f23433OooOo0o.setVisibility(8);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 0) {
                int lastVisiblePosition = absListView.getLastVisiblePosition();
                int count = absListView.getCount() - 1;
                MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
                if (lastVisiblePosition != count) {
                    if (absListView.getLastVisiblePosition() < absListView.getCount() - 1) {
                        mixedRoomActivity.f23433OooOo0o.setVisibility(0);
                        mixedRoomActivity.f23433OooOo0o.setText(oO00OOo0.Room_chatline_Bottom);
                    }
                    mixedRoomActivity.f23442Oooo0 = false;
                    return;
                }
                View childAt = absListView.getChildAt(absListView.getLastVisiblePosition() - absListView.getFirstVisiblePosition());
                if (com.code.android.util.OooOo00.OooO0O0(childAt)) {
                    mixedRoomActivity.f23442Oooo0 = absListView.getHeight() >= childAt.getBottom();
                }
                if (mixedRoomActivity.f23442Oooo0) {
                    mixedRoomActivity.f23433OooOo0o.clearAnimation();
                    mixedRoomActivity.f23433OooOo0o.setVisibility(8);
                }
            }
        }
    }

    public class OooO0O0 implements ServiceConnection {
        public OooO0O0() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p592o0oo00O.OooOOO0.OooO0OO("RoomLiveService", "onServiceConnected");
            MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
            RoomModel roomModel = (RoomModel) mixedRoomActivity.getIntent().getSerializableExtra("room");
            p475o0o000.oo000o oo000oVar = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0;
            if (oo000oVar.OooO0o0() == 0) {
                if (roomModel != null) {
                    RoomLiveService.f25058OooOo00.OooO(roomModel);
                    return;
                } else {
                    MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
                    p427o0OoOO00.o0OOO0o.OooO00o();
                    return;
                }
            }
            if (roomModel != null && oo000oVar.OooO0o0() != roomModel.getId()) {
                mixedRoomActivity.OooOo0(roomModel);
                return;
            }
            int i = MixedRoomActivity.f23425OoooO0O;
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10054, null);
            }
            p592o0oo00O.OooOOO0.OooO0OO("RoomLiveService", "挂机恢复房间");
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            p592o0oo00O.OooOOO0.OooO0O0("onServiceDisconnected name = " + componentName);
        }
    }

    public class OooO0OO implements Animation.AnimationListener {
        public OooO0OO() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            MixedRoomActivity.this.f23445Oooo00o = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
            mixedRoomActivity.f23433OooOo0o.setVisibility(0);
            mixedRoomActivity.f23433OooOo0o.setText(oO00OOo0.chatline_new);
        }
    }

    @Override // p394o0Oo00oO.o000OOo
    public final void OooO0Oo(Message message) {
        OooOo0O(message);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO() {
        overridePendingTransition(oO000o00.anim_activity_room_open_enter, oO000o00.anim_empty);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOO0() {
        overridePendingTransition(oO000o00.anim_empty, oO000o00.anim_activity_room_close_exit);
    }

    public final synchronized void OooOo() {
        this.f23442Oooo0 = true;
        TextView textView = this.f23433OooOo0o;
        if (textView != null) {
            textView.clearAnimation();
            this.f23433OooOo0o.setVisibility(8);
        }
        o0oo0000 o0oo0000Var = this.f23437OooOoo;
        if (o0oo0000Var != null) {
            int count = o0oo0000Var.getCount();
            this.f23438OooOoo0.setSelection(count == 0 ? 0 : count - 1);
        }
    }

    public final void OooOo0(RoomModel roomModel) {
        p592o0oo00O.OooOOO0.OooO0OO("RoomLiveService", "enterNewRoom roomModel = ".concat(p140o00OOooo.OooOO0.OooO00o(roomModel)));
        if (roomModel.getId() == 0) {
            return;
        }
        this.f23449Oooo0o0 = roomModel;
        OooOoO0();
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO(roomModel);
        }
    }

    public final void OooOo0O(Message message) {
        o00O o00o2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = message.what;
        p489o0o00OO0.OooO0OO oooO0OO = this.f23452OoooO0;
        boolean z = true;
        switch (i) {
            case 2025:
                o0OO000.OooO00o("201016");
                p592o0oo00O.OooOOO0.OooO0o("接收到消息: GlobalDef.SERVICE_STATUS_FAILD" + isFinishing());
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.net_connection_error);
                if (!isFinishing()) {
                    p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this);
                    o0oo00o2.OooOo00(strOooO0OO);
                    o0oo00o2.OooO0o(false);
                    o0oo00o2.OooOO0(new o00000());
                    o0oo00o2.OooOO0o();
                }
                break;
            case RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS /* 10001 */:
                RoomLoginInformation roomLoginInformation = (RoomLoginInformation) oOo00OO0.OooO00o((String) message.obj, RoomLoginInformation.class);
                if (roomLoginInformation != null) {
                    p592o0oo00O.OooOOO0.OooO0O0("processLoginInformation loginMessage = " + roomLoginInformation.toJSONString());
                    if (roomLoginInformation.code == 0 && roomLoginInformation.getRoom() != null) {
                        p492o0o00Oo.o00oO0o o00oo0o2 = oooO0OO.f48480OooO0oo;
                        if (o00oo0o2 != null) {
                            ((o0OO0o00) o00oo0o2.f48731OooO0o.getValue()).OooO0OO();
                            ((o0OO0o00) o00oo0o2.f48733OooO0oO.getValue()).OooO0OO();
                            o00oo0o2.OooO0OO();
                        }
                        o00O o00o3 = oooO0OO.f48479OooO0oO;
                        if (o00o3 != null) {
                            o00o3.f48719OooO0OO.clear();
                            RoomBroadcastView roomBroadcastView = o00o3.f48721OooO0o;
                            if (roomBroadcastView != null) {
                                roomBroadcastView.clearAnimation();
                            }
                        }
                    }
                }
                break;
            case 10011:
                if (!this.f23444Oooo00O) {
                    this.f23444Oooo00O = true;
                    new Thread(new o000(this)).start();
                }
                break;
            case 10019:
                p592o0oo00O.OooOOO0.OooO0O0("收到广播***************");
                RoomBroadcastModel roomBroadcastModel = (RoomBroadcastModel) message.obj;
                if (roomBroadcastModel != null && (o00o2 = oooO0OO.f48479OooO0oO) != null) {
                    if (!this.f23447Oooo0OO) {
                        return;
                    } else {
                        o00o2.OooO0o0(roomBroadcastModel);
                    }
                }
                break;
            case 10043:
                p592o0oo00O.OooOOO0.OooO0o("贵族购买或续费广播喇叭 *************** msg = " + message);
                RoomBroadcastOpenNobleModel roomBroadcastOpenNobleModel = (RoomBroadcastOpenNobleModel) oOo00OO0.OooO00o((String) message.obj, RoomBroadcastOpenNobleModel.class);
                if (roomBroadcastOpenNobleModel != null && roomBroadcastOpenNobleModel.getData() != null) {
                    p592o0oo00O.OooOOO0.OooO0O0("贵族购买或续费广播喇叭 roomBroadcastOpenNobleModel = ".concat(p140o00OOooo.OooOO0.OooO00o(roomBroadcastOpenNobleModel)));
                    RoomBroadcastModel roomBroadcastModel2 = new RoomBroadcastModel();
                    roomBroadcastModel2.setNobleData(13, roomBroadcastOpenNobleModel.getData());
                    if (oooO0OO.f48479OooO0oO != null && (roomBroadcastOpenNobleModel.getData().getAction() == 1 || roomBroadcastOpenNobleModel.getData().getAction() == 2)) {
                        if (!this.f23447Oooo0OO) {
                            return;
                        } else {
                            oooO0OO.f48479OooO0oO.OooO0o0(roomBroadcastModel2);
                        }
                    }
                }
                break;
            case 10050:
                SkillCardModel skillCardModel = (SkillCardModel) message.obj;
                skillCardModel.setCardType(2);
                p493o0o00Oo0.OooOOO0 oooOOO0 = this.f23436OooOoOO;
                if (oooOOO0 != null) {
                    oooOOO0.OooO00o(skillCardModel);
                }
                break;
            case 10060:
                if (message.obj == null) {
                    String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.notinroom);
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO2, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        } else {
                            o000oo0OooO00o.run();
                        }
                    }
                } else {
                    com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25040OoooO0.postValue((RoomUserInfoModel) message.obj);
                }
                break;
            case 10063:
                LiveEventBus.get("MORA_GAME_ANIM").post((Room.MoraStartPkRequestReply) message.obj);
                break;
            case 10066:
                Room.MagicVoiceOut magicVoiceOut = (Room.MagicVoiceOut) message.obj;
                if (this.f23436OooOoOO != null) {
                    SkillCardModel skillCardModel2 = new SkillCardModel();
                    skillCardModel2.setCardType(3);
                    RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
                    skillCardModel2.setNewFrom(companion.of(magicVoiceOut.getFrom()));
                    skillCardModel2.setNewTarget(companion.of(magicVoiceOut.getTarget()));
                    this.f23436OooOoOO.OooO00o(skillCardModel2);
                }
                break;
            case 21000:
                p592o0oo00O.OooOOO0.OooO0OO("RoomDialogDis", "dismiss 1359 ROOM_SHOW_DIALOG_21000");
                break;
            case 21001:
                p592o0oo00O.OooOOO0.OooO0OO("RoomDialogDis", "dismiss 1383 ROOM_CANCEL_DIALOG_21001");
                break;
            case 30002:
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oO(10054, null);
                }
                break;
            case 33001:
                OooOoo0();
                break;
            case 33002:
                o0O0o00O o0o0o00o = oooO0OO.f48477OooO0o;
                if (o0o0o00o != null) {
                    RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) message.obj;
                    if (roomUserInfoModel != null) {
                        o0o0o00o.OooO0OO().add(roomUserInfoModel);
                    }
                    if (!o0o0o00o.OooO0OO().isEmpty() && o0o0o00o.f48485OooO0O0 == null) {
                        o0o0o00o.f48485OooO0O0 = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(o0o0o00o.f48470OooO00o), Dispatchers.getMain(), null, new p489o0o00OO0.OooOO0(o0o0o00o, null), 2, null);
                    }
                }
                break;
            case 100611:
                int iIntValue = ((Integer) message.obj).intValue();
                if (iIntValue == 0) {
                    String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Success);
                    if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o2 = com.code.android.util.o000O00.OooO00o(strOooO0OO3, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                        } else {
                            o000oo0OooO00o2.run();
                        }
                    }
                } else if (iIntValue == 1) {
                    String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(oO00OOo0.error);
                    if (strOooO0OO4 != null && !StringsKt.isBlank(strOooO0OO4)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o3 = com.code.android.util.o000O00.OooO00o(strOooO0OO4, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
                        } else {
                            o000oo0OooO00o3.run();
                        }
                    }
                }
                break;
            case 100612:
                final Room.InviteBarMemberToRequestReply inviteBarMemberToRequestReply = (Room.InviteBarMemberToRequestReply) message.obj;
                if (inviteBarMemberToRequestReply == null || this.f23451Oooo0oo) {
                    return;
                }
                this.f23451Oooo0oo = true;
                if (this.f23431OooOo00 == null) {
                    this.f23431OooOo00 = new p157o00OoOO0.o0OO00O(this);
                }
                this.f23431OooOo00.OooOo00(com.code.android.util.o0000.OooO0OO(oO00OOo0.invited_to_member));
                this.f23431OooOo00.OooOO0(new Function0() { // from class: com.yalla.yalla.mixedroom.OooOo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.f23490OooO0Oo.f23451Oooo0oo = false;
                        return null;
                    }
                });
                this.f23431OooOo00.OooOo0o(com.code.android.util.o0000.OooO0OO(oO00OOo0.Decline));
                this.f23431OooOo00.OooOo0O(new Function0() { // from class: com.yalla.yalla.mixedroom.o0OOO0o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.f23531OooO0Oo.f23451Oooo0oo = false;
                        return null;
                    }
                });
                this.f23431OooOo00.OooOOOo(com.code.android.util.o0000.OooO0OO(oO00OOo0.Accept));
                this.f23431OooOo00.OooOo0(new Function0() { // from class: com.yalla.yalla.mixedroom.o000000
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2 = MixedRoomActivity.f23425OoooO0O;
                        if (MixedRoomDataSource.OooO0o0().f23460OooO0o == null) {
                            return null;
                        }
                        p476o0o0000o.o0000O.OooO0O0(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25014OooOOo0.getValue().intValue(), String.valueOf(inviteBarMemberToRequestReply.getFromuser().getUserId()), MixedRoomDataSource.OooO0o0().f23460OooO0o.getBaridx(), "1");
                        LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                        com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.OooO0oO(false);
                        return null;
                    }
                });
                this.f23431OooOo00.OooOO0o();
                break;
            case oOO00O.Other_Device_Login /* 999001 */:
                p157o00OoOO0.o0OO00O o0oo00o3 = new p157o00OoOO0.o0OO00O(this);
                o0oo00o3.OooOOoo(oO00OOo0.turntable_close_return_coin);
                o0oo00o3.OooOO0o();
                break;
            case 1000600:
                p427o0OoOO00.o00oO0o o00oo0o3 = oooO0OO.f48481OooOO0;
                if (o00oo0o3 != null) {
                    RoomActivityEffectAnimModel animModel = (RoomActivityEffectAnimModel) message.obj;
                    Intrinsics.checkNotNullParameter(animModel, "animModel");
                    if (o00oo0o3.f45693OooO00o.f22753OooO0oO) {
                        p427o0OoOO00.o00oO0o.OooO00o(o00oo0o3, 0, animModel.getEffectFrameType(), 1, animModel.getUrl(), null, animModel.getAnimationId() == 2, 16);
                    }
                }
                break;
            default:
                p592o0oo00O.OooOOO0.OooO0o("Command not processed:" + message.what);
                break;
        }
        p592o0oo00O.OooOOO0.OooO0OO("MixedRoomActivity", "parseDoHandler  type : " + message.what + " use time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final void OooOo0o() {
        this.f23433OooOo0o.setVisibility(0);
        this.f23433OooOo0o.setText(oO00OOo0.chatline_new);
        if (this.f23445Oooo00o) {
            return;
        }
        this.f23445Oooo00o = true;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimation.setDuration(2500L);
        alphaAnimation.setAnimationListener(new OooO0OO());
        this.f23433OooOo0o.startAnimation(alphaAnimation);
    }

    public final void OooOoO(RoomUserInfoModel roomUserInfoModel) {
        p433o0OoOOo.o00OO00O o00oo00o = this.f23452OoooO0.f48472OooO;
        if (o00oo00o != null) {
            o00oo00o.OooO00o(new h(roomUserInfoModel.getUserName().getValue(), roomUserInfoModel.getUserId().getValue().longValue()), true);
        }
    }

    public final void OooOoO0() {
        oO0OO.OooO0o oooO0o;
        LiveEventBus.get("RESET_ROOM").post(Boolean.TRUE);
        p157o00OoOO0.o0OO00O o0oo00o2 = this.f23431OooOo00;
        if (o0oo00o2 != null) {
            o0oo00o2.OooO0OO();
        }
        this.f23433OooOo0o.clearAnimation();
        this.f23433OooOo0o.setVisibility(8);
        this.f23442Oooo0 = true;
        o00OOO00 o00ooo01 = this.f23432OooOo0O;
        if (o00ooo01 != null) {
            o00ooo01.f46004OooO0O0 = null;
        }
        p438o0OoOo00.o0O0O00 o0o0o00 = this.f23448Oooo0o;
        if (o0o0o00 != null && (oooO0o = o0o0o00.f46093OooO0O0) != null) {
            oooO0o.dismiss();
        }
        p489o0o00OO0.OooO0OO oooO0OO = this.f23452OoooO0;
        p433o0OoOOo.o00OO00O o00oo00o = oooO0OO.f48472OooO;
        if (o00oo00o != null) {
            p490o0o00OOO.OooOOOO oooOOOO = o00oo00o.f45994OooO0OO;
            p367o0OOo0o0.OooOOOO oooOOOOOooO0O0 = oooOOOO.OooO0O0();
            MessageEditText etMessageInput = oooOOOO.OooO00o();
            Intrinsics.checkNotNullParameter(etMessageInput, "etMessageInput");
            if (oooOOOOOooO0O0 != null) {
                etMessageInput.setText("");
                k spanManager = etMessageInput.getSpanManager();
                spanManager.OooO00o();
                spanManager.f56774OooO00o.clear();
                etMessageInput.getMaskKeys().clear();
            }
        }
        Iterator<p489o0o00OO0.OooO> it = oooO0OO.f48474OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0();
        }
        OooOoo0();
    }

    public final void OooOoOO(RoomUserInfoModel roomUserInfoModel, int i, int i2, boolean z) {
        if (this.f23432OooOo0O != null) {
            o0000OO0 onLogin = new o0000OO0(this, roomUserInfoModel, i, i2, z);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
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
        ArrayList arrayList = (ArrayList) MixedRoomDataSource.OooO0o0().f23465OooOO0O.clone();
        ArrayList<ChatModel> arrayList2 = this.f23437OooOoo.f49490OooO0o0;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.f23437OooOoo.notifyDataSetChanged();
        if (this.f23442Oooo0) {
            OooOo();
        } else {
            OooOo0o();
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        c0 c0Var = this.f23453OoooO00;
        if (c0Var != null) {
            o00OOOOo o00ooooo2 = (o00OOOOo) c0Var.f52183OooOOO0.getValue();
            if (i2 != 0) {
                o00ooooo2.getClass();
                return;
            }
            String string = o00ooooo2.f45920OooO00o.getString(oO00OOo0.purchase_cancel);
            if (string == null || StringsKt.isBlank(string)) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        boolean z2;
        p489o0o00OO0.OooO0OO oooO0OO = this.f23452OoooO0;
        p433o0OoOOo.o00OO00O o00oo00o = oooO0OO.f48472OooO;
        boolean z3 = false;
        if (o00oo00o != null) {
            p367o0OOo0o0.OooOOOO oooOOOOOooO0O0 = o00oo00o.f45994OooO0OO.OooO0O0();
            if (oooOOOOOooO0O0 == null) {
                z = false;
            } else {
                if (oooOOOOOooO0O0.f43973OooO0o == 2) {
                    oooOOOOOooO0O0.OooO0O0();
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
        p475o0o000.o00000OO o00000oo2 = com.yalla.yalla.service.room.OooO00o.f24982OooOO0O;
        if (o00000oo2.f47425OooO0OO.getValue().booleanValue()) {
            o00000oo2.f47425OooO0OO.setValue(Boolean.FALSE);
            z3 = true;
        } else {
            Iterator<p489o0o00OO0.OooO> it = oooO0OO.f48474OooO0O0.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        if (z3) {
            return;
        }
        o00OO00O o00oo00o2 = this.f23430OooOo0;
        if (o00oo00o2 == null) {
            super.onBackPressed();
            return;
        }
        p561o0oOo00O.oo000o oo000oVar = o00oo00o2.f48754OooO0OO;
        MixedRoomActivity mixedRoomActivity = o00oo00o2.f48753OooO0O0;
        if (oo000oVar == null) {
            o00oo00o2.f48754OooO0OO = new p561o0oOo00O.oo000o(mixedRoomActivity);
        }
        o00oo00o2.f48754OooO0OO.f44397OooO0o = new o00OO0O0(o00oo00o2);
        if (mixedRoomActivity == null || mixedRoomActivity.isFinishing() || mixedRoomActivity.isDestroyed()) {
            return;
        }
        o00oo00o2.f48754OooO0OO.show();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        RoomTheme roomThemeOooO0O0;
        RoomModel roomModel;
        super.onCreate(bundle);
        this.f23428OooOOoo = new p394o0Oo00oO.o000000<>(this);
        getWindow().addFlags(128);
        int i = 0;
        p370o0OOoO.OooOOO0.OooO0OO(getWindow(), 0);
        setContentView(oO00OO0O.activity_mixed_room);
        this.f23441Oooo = (LiveRoomVM) new ViewModelProvider(this).get(LiveRoomVM.class);
        Intent intent = getIntent();
        if (intent != null && (roomModel = (RoomModel) intent.getSerializableExtra("room")) != null) {
            this.f23449Oooo0o0 = roomModel;
        }
        p489o0o00OO0.OooO0OO oooO0OO = this.f23452OoooO0;
        MixedRoomActivity activity = oooO0OO.f48473OooO00o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.findViewById(oO00O0oO.cv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<ComposeView>(R.id.cv)");
        p147o00Oo0Oo.o000OOo.OooO0Oo((ComposeView) viewFindViewById, p533o0o0Oo0.o0Oo0oo.f54827OooO00o);
        oooO0OO.f48477OooO0o = new o0O0o00O(activity);
        oooO0OO.f48479OooO0oO = new o00O(activity);
        oooO0OO.f48480OooO0oo = new p492o0o00Oo.o00oO0o(activity);
        new n(activity, oooO0OO);
        oooO0OO.f48478OooO0o0 = new m(activity);
        ComposeView sideComposeView = (ComposeView) activity.findViewById(oO00O0oO.sideMainComposeView);
        Intrinsics.checkNotNullExpressionValue(sideComposeView, "sideComposeView");
        int i2 = 1;
        p147o00Oo0Oo.o000OOo.OooO0Oo(sideComposeView, ComposableLambdaKt.composableLambdaInstance(-1548327165, true, new p489o0o00OO0.OooO0O0(oooO0OO)));
        new RoomScreenShotManager(activity);
        new o0O0O0Oo(activity);
        oooO0OO.f48476OooO0Oo = new o00Oo00(activity);
        oooO0OO.f48472OooO = new p433o0OoOOo.o00OO00O(activity, oooO0OO.f48475OooO0OO);
        new o000O(activity);
        RoomGiftVideoPlayManager roomGiftVideoPlayManager = new RoomGiftVideoPlayManager();
        RoomGiftPlayContainer container = (RoomGiftPlayContainer) activity.findViewById(oO00O0oO.roomGifPlayContainer);
        container.initSvgaView(new RoomGiftSVGAView(oooO0OO.f48473OooO00o, null, 6, i));
        Intrinsics.checkNotNullExpressionValue(container, "container");
        roomGiftVideoPlayManager.init(activity, container);
        oooO0OO.f48481OooOO0 = new p427o0OoOO00.o00oO0o(activity, roomGiftVideoPlayManager);
        this.f23434OooOoO = (FrameLayout) findViewById(oO00O0oO.v_room_root);
        RoomModel roomModel2 = this.f23449Oooo0o0;
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        if (roomModel2 != null) {
            oooO00o.OooO00o().f25010OooOOO0.postValue((roomModel2.getId() == 0 || (roomThemeOooO0O0 = p581o0oOoo00.o000OOo.OooO00o().OooOoo().OooO0O0(this.f23449Oooo0o0.getId())) == null) ? null : roomThemeOooO0O0.roomTheme);
        }
        this.f23430OooOo0 = new o00OO00O(this);
        this.f23438OooOoo0 = (ListView) findViewById(oO00O0oO.list_charline);
        this.f23437OooOoo = new o0oo0000(this);
        LiveEventBus.get("DISLIKE_EVENT").observe(this, new o0000oo(this));
        o0oo0000 o0oo0000Var = this.f23437OooOoo;
        o0oo0000Var.f49497OooOOO0 = new Function5() { // from class: com.yalla.yalla.mixedroom.OooOOOO
            /* JADX WARN: Code duplicated, block: B:22:0x0070  */
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                Integer num3 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i3 = MixedRoomActivity.f23425OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23489OooO0Oo;
                mixedRoomActivity.getClass();
                o0OO000.OooO00o("102038");
                if (((ChatModel) obj5).getGiftsubtype() == 600) {
                    MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p385o0OOooOO.oOO00O.f44351OooO00o;
                    int iIntValue = num2.intValue();
                    Map<Integer, GiftPropModel> value = p385o0OOooOO.oOO00O.f44352OooO0O0.getValue();
                    if ((value != null ? value.get(Integer.valueOf(iIntValue)) : null) == null) {
                        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.vip6_send_for_userInfo_content);
                        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                            com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
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
        o0oo0000Var.f49496OooOOO = new Function6() { // from class: com.yalla.yalla.mixedroom.OooOo00
            @Override // kotlin.jvm.functions.Function6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                int i3 = MixedRoomActivity.f23425OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23491OooO0Oo;
                mixedRoomActivity.getClass();
                o0OO000.OooO00o("102038");
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                ((Integer) obj4).intValue();
                mixedRoomActivity.OooOoOO((RoomUserInfoModel) obj, iIntValue, iIntValue2, ((Boolean) obj5).booleanValue());
                return null;
            }
        };
        o0oo0000Var.f49498OooOOOO = new Function2() { // from class: com.yalla.yalla.mixedroom.Oooo000
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ProfileLimitModel next;
                final String str = (String) obj;
                final Boolean bool = (Boolean) obj2;
                int i3 = MixedRoomActivity.f23425OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23492OooO0Oo;
                mixedRoomActivity.getClass();
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o2 = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
                if (oooO00o2.OooO00o().f24997OooO.getValue() == null || oooO00o2.OooO00o().f24997OooO.getValue().getProfileLimit() == null) {
                    next = null;
                } else {
                    Iterator<ProfileLimitModel> it = oooO00o2.OooO00o().f24997OooO.getValue().getProfileLimit().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (next.getOperationType() == 3) {
                        }
                    }
                    next = null;
                }
                o000Oo0.OooO00o(mixedRoomActivity, next, new Function0() { // from class: com.yalla.yalla.mixedroom.o0O0O00
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4 = MixedRoomActivity.f23425OoooO0O;
                        MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        mixedRoomActivity2.getClass();
                        Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
                        Observable observable = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
                        Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
                        observable.post(Boolean.TRUE);
                        o0O00O0o.OooO00o().getClass();
                        o0O00O o0o00o2 = new o0O00O(mixedRoomActivity2);
                        mixedRoomActivity2.f23439OooOooO = o0o00o2;
                        o0o00o2.OooOO0o(str, bool);
                        mixedRoomActivity2.f23439OooOooO.show();
                        return null;
                    }
                });
                return null;
            }
        };
        this.f23438OooOoo0.setAdapter((ListAdapter) o0oo0000Var);
        this.f23438OooOoo0.setOnScrollListener(this.f23446Oooo0O0);
        this.f23438OooOoo0.setOnTouchListener(this.f23443Oooo000);
        o0oo0000 o0oo0000Var2 = this.f23437OooOoo;
        o0oo0000Var2.f49491OooO0oO = new Oooo0();
        o0oo0000Var2.f49492OooO0oo = new Function1() { // from class: com.yalla.yalla.mixedroom.o000oOoO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ChatModel chatModel = (ChatModel) obj;
                int i3 = MixedRoomActivity.f23425OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23521OooO0Oo;
                mixedRoomActivity.getClass();
                Long value = chatModel.getNewFrom().getUserId().getValue();
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                if (value == p464o0Oooo.o000000O.OooOOo0().getValue()) {
                    return null;
                }
                mixedRoomActivity.OooOoO(chatModel.getNewFrom());
                return null;
            }
        };
        o0oo0000Var2.f49487OooO = new Function1() { // from class: com.yalla.yalla.mixedroom.o0OoOo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3;
                MixedRoomActivity mixedRoomActivity = this.f23534OooO0Oo;
                o0oo0000 o0oo0000Var3 = mixedRoomActivity.f23437OooOoo;
                int iIntValue = ((Integer) obj).intValue();
                ListView listChat = mixedRoomActivity.f23438OooOoo0;
                TextView tvNewmessageTips = mixedRoomActivity.f23433OooOo0o;
                Intrinsics.checkNotNullParameter(listChat, "listChat");
                Intrinsics.checkNotNullParameter(tvNewmessageTips, "tvNewmessageTips");
                if ((o0oo0000Var3 != null ? o0oo0000Var3.f49490OooO0o0 : null) != null && o0oo0000Var3.f49490OooO0o0.size() > iIntValue) {
                    ArrayList<ChatModel> arrayList = o0oo0000Var3.f49490OooO0o0;
                    if (arrayList.get(iIntValue).getReplyInfo() != null) {
                        RoomMessageReplyInfo replyInfo = arrayList.get(iIntValue).getReplyInfo();
                        o000O00 checkKey = o000O00.f23515OooO0Oo;
                        Intrinsics.checkNotNullParameter(checkKey, "checkKey");
                        if (!(replyInfo == null)) {
                            Iterator<ChatModel> it = arrayList.iterator();
                            i3 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i3 = -1;
                                    break;
                                }
                                ChatModel next = it.next();
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((Boolean) checkKey.invoke(replyInfo, next)).booleanValue()) {
                                    break;
                                }
                                i3 = i4;
                            }
                        } else {
                            i3 = -1;
                            break;
                        }
                        if (i3 >= 0 && i3 < o0oo0000Var3.getCount()) {
                            try {
                                o0oo0000Var3.f49500OooOOo0 = i3;
                                listChat.smoothScrollToPosition(i3);
                                if (listChat.getFirstVisiblePosition() > i3) {
                                    tvNewmessageTips.setVisibility(0);
                                    tvNewmessageTips.setText(oO00OOo0.Room_chatline_Bottom);
                                } else {
                                    o0oo0000Var3.notifyDataSetChanged();
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
        o0oo0000Var2.f49493OooOO0 = new Function2() { // from class: com.yalla.yalla.mixedroom.o00O0O
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                final Integer num = (Integer) obj;
                final Boolean bool = (Boolean) obj2;
                int i3 = MixedRoomActivity.f23425OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23522OooO0Oo;
                mixedRoomActivity.getClass();
                o0OO000.OooO00o("102289");
                if (num.intValue() >= mixedRoomActivity.f23437OooOoo.f49490OooO0o0.size()) {
                    return null;
                }
                final ArrayList arrayList = (ArrayList) mixedRoomActivity.f23437OooOoo.f49490OooO0o0.clone();
                final ChatModel chatModel = mixedRoomActivity.f23437OooOoo.f49490OooO0o0.get(num.intValue());
                Function0 onLogin = new Function0() { // from class: com.yalla.yalla.mixedroom.oo0o0Oo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ArrayList arrayList2 = arrayList;
                        int i4 = MixedRoomActivity.f23425OoooO0O;
                        MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        mixedRoomActivity2.getClass();
                        new w0(mixedRoomActivity2, arrayList2, num.intValue(), com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue().longValue(), bool.booleanValue(), new o0000O0(mixedRoomActivity2, chatModel));
                        return null;
                    }
                };
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
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
        o0oo0000Var2.f49494OooOO0O = new Function1() { // from class: com.yalla.yalla.mixedroom.o00Oo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                p560o0oOo000.o0000OO0.f56183OooO0O0.OooO0o(this.f23523OooO0Oo.f23437OooOoo.f49490OooO0o0.get(((Integer) obj).intValue()).getEventModel());
                return null;
            }
        };
        o0oo0000Var2.f49495OooOO0o = new Function1() { // from class: com.yalla.yalla.mixedroom.o00Ooo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final Integer num = (Integer) obj;
                int i3 = MixedRoomActivity.f23425OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23524OooO0Oo;
                mixedRoomActivity.getClass();
                Function0 onLogin = new Function0() { // from class: com.yalla.yalla.mixedroom.o0OO00O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        final MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        final EventModel eventModel = mixedRoomActivity2.f23437OooOoo.f49490OooO0o0.get(num.intValue()).getEventModel();
                        if (!eventModel.getHasSubscribe()) {
                            p560o0oOo000.o0000OO0.f56183OooO0O0.OooO0Oo(mixedRoomActivity2, eventModel, new Function1() { // from class: com.yalla.yalla.mixedroom.o000OOo
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i4 = MixedRoomActivity.f23425OoooO0O;
                                    MixedRoomActivity mixedRoomActivity3 = mixedRoomActivity2;
                                    mixedRoomActivity3.getClass();
                                    eventModel.setHasSubscribe(((Boolean) obj2).booleanValue());
                                    mixedRoomActivity3.f23437OooOoo.notifyDataSetChanged();
                                    return null;
                                }
                            });
                            return null;
                        }
                        p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(mixedRoomActivity2);
                        o0oo00o2.OooOo00(com.code.android.util.o0000.OooO0OO(oO00OOo0.event_unSubscribe_content));
                        o0oo00o2.OooOo(true);
                        o0oo00o2.OooOOOO(oO00OOo0.event_unSubscribe_confirm);
                        o0oo00o2.OooOo0(new o000OO(mixedRoomActivity2, eventModel));
                        o0oo00o2.OooOO0o();
                        return null;
                    }
                };
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
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
        TextView textView = (TextView) findViewById(oO00O0oO.tv_newmessage_tips);
        this.f23433OooOo0o = textView;
        textView.setOnClickListener(new o0000O(this));
        this.f23435OooOoO0 = (BubbleView) findViewById(oO00O0oO.bubbleView);
        this.f23436OooOoOO = new p493o0o00Oo0.OooOOO0(oO00O0oO.ly_anmi_panda, this);
        LiveEventBus.get("Skill_Card_Anim").observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.o00oO0o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                p493o0o00Oo0.OooOOO0 oooOOO0 = this.f23525OooO0Oo.f23436OooOoOO;
                if (oooOOO0 != null) {
                    oooOOO0.OooO00o((SkillCardModel) obj);
                }
            }
        });
        LiveEventBus.get("HideKeyboard").observe(this, new o0000O00(this));
        p475o0o000.o00Ooo o00ooo2 = com.yalla.yalla.service.room.OooO00o.f24989OooOOo0;
        o00ooo2.f47454OooO0oO.observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.o00000O0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i3 = MixedRoomActivity.f23425OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23500OooO0Oo;
                mixedRoomActivity.getClass();
                p475o0o000.o00Ooo o00ooo3 = com.yalla.yalla.service.room.OooO00o.f24989OooOOo0;
                int iIntValue = ((Number) o00ooo3.f47453OooO0o0.getValue()).intValue();
                MutableState mutableState = o00ooo3.f47452OooO0o;
                ((Number) mutableState.getValue()).intValue();
                mixedRoomActivity.OooOoOO(null, 0, iIntValue, ((Number) mutableState.getValue()).intValue() == GiftPropTypeUser.Backpack.getValue());
            }
        });
        o00ooo2.f47455OooO0oo.observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.o00000O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                RoomRunWayModel roomRunWayModel;
                int i3 = MixedRoomActivity.f23425OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23499OooO0Oo;
                mixedRoomActivity.getClass();
                if (!(obj instanceof RoomRunWayModel) || (roomRunWayModel = (RoomRunWayModel) obj) == null) {
                    return;
                }
                if (roomRunWayModel.getGiftsubtype() == 600) {
                    MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p385o0OOooOO.oOO00O.f44351OooO00o;
                    int giftId = roomRunWayModel.getGiftId();
                    Map<Integer, GiftPropModel> value = p385o0OOooOO.oOO00O.f44352OooO0O0.getValue();
                    if ((value != null ? value.get(Integer.valueOf(giftId)) : null) == null) {
                        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.vip6_send_for_userInfo_content);
                        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                            return;
                        }
                        com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                            return;
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            return;
                        }
                    }
                }
                long jOooO = com.code.android.util.o0OoOo0.OooO(0L, roomRunWayModel.getFromUserId());
                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(jOooO));
                if (roomUserInfoModelOooO0o0 != null) {
                    int giftId2 = roomRunWayModel.getGiftId();
                    roomRunWayModel.getGiftUserType();
                    mixedRoomActivity.OooOoOO(roomUserInfoModelOooO0o0, 0, giftId2, false);
                }
            }
        });
        com.yalla.yalla.service.room.OooO0O0 oooO0O0OooO00o = oooO00o.OooO00o();
        this.f23448Oooo0o = new p438o0OoOo00.o0O0O00(this);
        this.f23450Oooo0oO = new RoomFrameUIController(this, oooO0O0OooO00o);
        oooO0O0OooO00o.f25016OooOo.observe(this, new o0000(this));
        p591o0oo000O.OooO.OooO0O0().toLowerCase();
        MixedRoomDataSource.OooO0o0().f23462OooO0oO = this.f23428OooOOoo;
        Intent intent2 = new Intent(this, (Class<?>) RoomLiveService.class);
        this.f23427OooOOo0 = intent2;
        this.f23426OooOOo = new OooO0O0();
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent2);
        } else {
            startService(intent2);
        }
        bindService(this.f23427OooOOo0, this.f23426OooOOo, 1);
        if (MixedRoomDataSource.OooO0o0().f23466OooOO0o) {
            this.f23428OooOOoo.obtainMessage(2025).sendToTarget();
            return;
        }
        MixedRoomDataSource.OooO0o0().f23466OooOO0o = false;
        setVolumeControlStream(0);
        if ("Meizu".equals(Build.BRAND)) {
            getWindow().getDecorView().setSystemUiVisibility(2);
        }
        com.squareup.okhttp.OooOo.OooO0OO(575, null);
        LiveEventBus.get("GiftBackpackFrozen", Boolean.class).observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.o00000OO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i3 = MixedRoomActivity.f23425OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23501OooO0Oo;
                mixedRoomActivity.getClass();
                if (((Boolean) obj).booleanValue()) {
                    p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(mixedRoomActivity);
                    o0oo00o2.OooOo00(com.code.android.util.o0000.OooO0OO(oO00OOo0.backpack_frozen));
                    o0oo00o2.OooOO0o();
                }
            }
        });
        LiveEventBus.get("LuckyNumberOpenDialog", Integer.class).observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.OooO0O0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Integer num = (Integer) obj;
                int i3 = MixedRoomActivity.f23425OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23483OooO0Oo;
                mixedRoomActivity.getClass();
                if (num.intValue() > -1) {
                    h1 h1Var = new h1(mixedRoomActivity);
                    String number = String.valueOf(num.intValue());
                    Intrinsics.checkNotNullParameter(number, "number");
                    o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(h1Var.f52335OooOO0O);
                    oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                    oooO00o2.f43936OooOoo0 = 2;
                    oooO00o2.f43926OooOOoo = 3;
                    p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                    oooO00o2.f43911OooO0OO = com.code.android.util.o0OoOo0.OooOOO((String) p464o0Oooo.o000000O.OooO().getValue(), "");
                    oooO00o2.f43909OooO00o = 0;
                    oooO00o2.OooO0Oo(h1Var.OooOO0().f58776OooO0OO);
                    h1Var.OooOO0().f58779OooO0o0.setText(com.code.android.util.o0OoOo0.OooOOO((String) p464o0Oooo.o000000O.OooOOoo().getValue(), ""));
                    h1Var.OooOO0().f58777OooO0Oo.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_lucky_number_open_info_xxx), number));
                    h1Var.OooOO0().f58778OooO0o.setSize(NumberSize.Size.XX);
                    h1Var.OooOO0().f58778OooO0o.setNumCount(com.code.android.util.o0OoOo0.OooO0o0(0, com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().OooO0oo().getValue()));
                    h1Var.OooOO0().f58778OooO0o.setData(number);
                    h1Var.OooO();
                }
            }
        });
        LiveEventBus.get("ROOM_CHAT_REPLY", ChatModel.class).observe(this, new p022Oooo00O.o0000OO0(this, i2));
        LiveEventBus.get("LOGIN_REENTER_ROOM").observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.OooO0OO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i3 = MixedRoomActivity.f23425OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23484OooO0Oo;
                mixedRoomActivity.OooOoO0();
                com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().OooO00o();
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO(mixedRoomActivity.f23449Oooo0o0);
                }
            }
        });
        LiveEventBus.get("Close_RoomUI").observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.OooO0o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i3 = MixedRoomActivity.f23425OoooO0O;
                this.f23485OooO0Oo.finish();
            }
        });
        LiveEventBus.get("Room_State_Close").observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.OooO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i3 = MixedRoomActivity.f23425OoooO0O;
                this.f23482OooO0Oo.finish();
            }
        });
        LiveEventBus.get("Disconnect_Room").observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.OooOO0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i3 = MixedRoomActivity.f23425OoooO0O;
                MixedRoomActivity mixedRoomActivity = this.f23486OooO0Oo;
                MixedRoomActivity.OooO0O0 oooO0O0 = mixedRoomActivity.f23426OooOOo;
                if (oooO0O0 != null) {
                    mixedRoomActivity.unbindService(oooO0O0);
                    mixedRoomActivity.f23426OooOOo = null;
                }
            }
        });
        LiveEventBus.get("ROOM_COIN_NOT_ENOUGH").observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.OooOO0O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i3 = MixedRoomActivity.f23425OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23487OooO0Oo;
                mixedRoomActivity.getClass();
                oOO0OO.OooO00o(false, true, new Function1() { // from class: com.yalla.yalla.mixedroom.oo000o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        mixedRoomActivity.f23453OoooO00 = (c0) obj2;
                        return null;
                    }
                });
            }
        });
        LiveEventBus.get("ROOM_MEMBER_LEVEL_UPGRADE", Pair.class).observe(this, new OooOOO0());
        LiveEventBus.get("QuickRechargeDialogFromMagicCardDialog").observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.OooOOO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(final Object obj) {
                int i3 = MixedRoomActivity.f23425OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23488OooO0Oo;
                mixedRoomActivity.getClass();
                if (obj instanceof Dialog) {
                    oOO0OO.OooO00o(false, true, new Function1() { // from class: com.yalla.yalla.mixedroom.o0Oo0oo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            c0 c0Var = (c0) obj2;
                            int i4 = MixedRoomActivity.f23425OoooO0O;
                            MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                            mixedRoomActivity2.getClass();
                            p417o0OoO0.oo0o0Oo.OooO0OO((Dialog) obj, c0Var.f52534OooO0o0);
                            mixedRoomActivity2.f23453OoooO00 = c0Var;
                            return null;
                        }
                    });
                }
            }
        });
        LiveEventBus.get("QuickRechargeDialogFromRoomGiftSendDialog").observe(this, new Observer() { // from class: com.yalla.yalla.mixedroom.o0000Ooo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(final Object obj) {
                int i3 = MixedRoomActivity.f23425OoooO0O;
                final MixedRoomActivity mixedRoomActivity = this.f23513OooO0Oo;
                mixedRoomActivity.getClass();
                if (obj instanceof Dialog) {
                    oOO0OO.OooO00o(false, true, new Function1() { // from class: com.yalla.yalla.mixedroom.o0ooOOo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            c0 c0Var = (c0) obj2;
                            int i4 = MixedRoomActivity.f23425OoooO0O;
                            MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                            mixedRoomActivity2.getClass();
                            p417o0OoO0.oo0o0Oo.OooO0OO((Dialog) obj, c0Var.f52534OooO0o0);
                            mixedRoomActivity2.f23453OoooO00 = c0Var;
                            return null;
                        }
                    });
                }
            }
        });
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        j jVar;
        super.onDestroy();
        MixedRoomDataSource.OooO0o0().f23462OooO0oO = null;
        OooO0O0 oooO0O0 = this.f23426OooOOo;
        if (oooO0O0 != null) {
            unbindService(oooO0O0);
            this.f23426OooOOo = null;
        }
        p438o0OoOo00.o0O0O00 o0o0o00 = this.f23448Oooo0o;
        if (o0o0o00 != null) {
            o0o0o00.f46093OooO0O0 = null;
        }
        o0oo0000 o0oo0000Var = this.f23437OooOoo;
        if (o0oo0000Var != null && (jVar = ((o0o0000) o0oo0000Var.f49489OooO0o.getValue()).f49486OooO0OO) != null && jVar.isShowing()) {
            jVar.dismiss();
        }
        p489o0o00OO0.OooO0OO oooO0OO = this.f23452OoooO0;
        if (oooO0OO != null) {
            MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
            p427o0OoOO00.o0OOO0o.OooO0oO();
            Iterator<p489o0o00OO0.OooO> it = oooO0OO.f48474OooO0O0.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
        }
        p592o0oo00O.OooOOO0.OooO0OO("MixedRoomActivity", "onDestroy");
        MutableState mutableState2 = p427o0OoOO00.o0OOO0o.f45698OooO00o;
        if (p427o0OoOO00.o0OOO0o.OooO0oO() != RoomState.Close) {
            p592o0oo00O.OooOOO0.OooO0OO("MixedRoomActivity", "onDestroy hookRoom");
            p427o0OoOO00.o0OOO0o.f45698OooO00o.setValue(RoomState.Hook);
            LiveEventBus.get("Close_RoomUI").post(null);
        }
        System.gc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    public final void onEventMainThread(p418o0OoO000.OooOo oooOo) {
        RoomRunWayModel roomRunWayModel;
        super.onEventMainThread(oooOo);
        int i = oooOo.f45532OooO00o;
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        if (i == 33) {
            try {
                T t = oooOo.f45534OooO0OO;
                if (t != 0) {
                    MixedRoomDataSource.OooO0o0().OooOOo((RoomConfiguration) t, oooO00o.OooO00o().f25005OooO0oo.getValue());
                    return;
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i == 106) {
            ForwardingRedPacketModel forwardingRedPacketModel = (ForwardingRedPacketModel) oooOo.f45534OooO0OO;
            String redId = android.support.v4.media.session.OooO0o.OooO0O0(new StringBuilder(), forwardingRedPacketModel.id, "");
            String message = forwardingRedPacketModel.message;
            Intrinsics.checkNotNullParameter(redId, "redId");
            Intrinsics.checkNotNullParameter(message, "message");
            String str = "{\"id\":" + redId + ",\"message\":\"" + message + "\"}";
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10010, str);
                return;
            }
            return;
        }
        if (i == 113) {
            RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
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
            T t2 = oooOo.f45534OooO0OO;
            if (t2 != 0) {
                oooO00o.OooO00o().f25040OoooO0.postValue((RoomUserInfoModel) t2);
                return;
            }
            return;
        }
        if (i == 552) {
            if (oooOo.f45533OooO0O0 == 0) {
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.send_successfully);
                if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? 1 : 0) != 0) {
                    return;
                }
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Added_successfully);
            if (((strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) ? 1 : 0) != 0) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o2 = com.code.android.util.o000O00.OooO00o(strOooO0OO2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o2.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                return;
            }
        }
        if (i == 2050) {
            OooOo0O((Message) oooOo.f45534OooO0OO);
            return;
        }
        p489o0o00OO0.OooO0OO oooO0OO = this.f23452OoooO0;
        if (i == 501) {
            p592o0oo00O.OooOOO0.OooO0O0("贵族开通续费 广播***************");
            RoomBroadcastModel roomBroadcastModel = new RoomBroadcastModel();
            roomBroadcastModel.setNobleData(13, new RoomBroadcastOpenNobleDataModel().setNobleActionOpen());
            o00O o00o2 = oooO0OO.f48479OooO0oO;
            if (o00o2 == null || !this.f23447Oooo0OO) {
                return;
            }
            o00o2.OooO0o0(roomBroadcastModel);
            return;
        }
        if (i == 502) {
            p592o0oo00O.OooOOO0.OooO0O0("贵族发送 广播喇叭 ***************");
            RoomBroadcastModel roomBroadcastModel2 = new RoomBroadcastModel();
            roomBroadcastModel2.setTextData(9, "");
            o00O o00o3 = oooO0OO.f48479OooO0oO;
            if (o00o3 == null || !this.f23447Oooo0OO) {
                return;
            }
            o00o3.OooO0o0(roomBroadcastModel2);
            return;
        }
        if (i == 567) {
            T t3 = oooOo.f45534OooO0OO;
            if (!(t3 instanceof RoomRunWayModel) || (roomRunWayModel = (RoomRunWayModel) t3) == null) {
                return;
            }
            boolean zIsLuckyflag = roomRunWayModel.isLuckyflag();
            boolean zHasFirstLuckyLevel = roomRunWayModel.hasFirstLuckyLevel();
            String fromUserId = roomRunWayModel.getFromUserId();
            long luckymoney = roomRunWayModel.getLuckymoney();
            long luckymultiple = roomRunWayModel.getLuckymultiple();
            if (zIsLuckyflag && zHasFirstLuckyLevel) {
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                if (String.valueOf(p464o0Oooo.o000000O.OooOOo0().getValue()).equals(fromUserId)) {
                    o0O00O0o.OooO00o().getClass();
                    p519o0o0O0oO.oO00OO0O oo00oo0o = new p519o0o0O0oO.oO00OO0O(this);
                    String string = getString(oO00OOo0.lucky_gift_congratulation_content);
                    TextView textView = oo00oo0o.f52822OooOO0O;
                    if (textView != null) {
                        textView.setText(string);
                        oo00oo0o.f52822OooOO0O.setVisibility(0);
                    }
                    String strOooO00o = androidx.compose.ui.input.key.OooO00o.OooO00o("", luckymoney);
                    TextView textView2 = oo00oo0o.f52825OooOOO0;
                    if (textView2 != null) {
                        textView2.setText(strOooO00o);
                        oo00oo0o.f52825OooOOO0.setVisibility(0);
                    }
                    String strOooO00o2 = androidx.compose.ui.input.key.OooO00o.OooO00o("", luckymultiple);
                    if (oo00oo0o.f52823OooOO0o != null && !com.code.android.util.OooOo00.OooO00o(strOooO00o2)) {
                        oo00oo0o.f52823OooOO0o.setText(com.code.android.util.o0000O.OooO00o(oo00oo0o.OooO0oO(oO00OOo0.lucky_gift_dialog_xxx_times_reward), strOooO00o2));
                        oo00oo0o.f52823OooOO0o.setVisibility(0);
                    }
                    oo00oo0o.show();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 568) {
            RoomLiveService roomLiveService3 = RoomLiveService.f25058OooOo00;
            if (roomLiveService3 != null) {
                roomLiveService3.OooO0oO(10054, null);
                return;
            }
            return;
        }
        switch (i) {
            case 101:
                long jLongValue = Long.valueOf((String) oooOo.f45534OooO0OO).longValue();
                RoomLiveService roomLiveService4 = RoomLiveService.f25058OooOo00;
                if (roomLiveService4 != null) {
                    roomLiveService4.OooO0oO(10017, "{\"to\":" + jLongValue + "}");
                }
                break;
            case 102:
                String userIdx = (String) oooOo.f45534OooO0OO;
                int i2 = oooOo.f45533OooO0O0 == 1 ? 1 : 0;
                Intrinsics.checkNotNullParameter(userIdx, "userIdx");
                String str2 = "{\"to\":" + userIdx + ",\"silence\":" + i2 + "}";
                RoomLiveService roomLiveService5 = RoomLiveService.f25058OooOo00;
                if (roomLiveService5 != null) {
                    roomLiveService5.OooO0oO(10006, str2);
                }
                break;
            case 103:
                String userIdx2 = (String) oooOo.f45534OooO0OO;
                Intrinsics.checkNotNullParameter(userIdx2, "userIdx");
                Intrinsics.checkNotNullParameter("", "blockaction");
                String str3 = "{\"to\":" + userIdx2 + ",\"blockaction\":}";
                RoomLiveService roomLiveService6 = RoomLiveService.f25058OooOo00;
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
        if (roomModel == null || roomModel.getId() == com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0()) {
            return;
        }
        OooOo0(roomModel);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        PasswordSettingDialog passwordSettingDialog;
        super.onPause();
        this.f23447Oooo0OO = false;
        o00OO00O o00oo00o = this.f23430OooOo0;
        if (o00oo00o != null && (passwordSettingDialog = o00oo00o.f48752OooO00o) != null && passwordSettingDialog.isShowing()) {
            EditText editText = this.f23430OooOo0.f48752OooO00o.f27871OooOOo0;
            p367o0OOo0o0.OooOO0O.OooO00o(editText.getContext().getApplicationContext(), new Handler(), android.support.v4.media.session.OooO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context"), editText.getWindowToken(), 0);
        }
        HashMap map = new HashMap();
        long j = this.f22760OooOOOO;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        map.put("staytime", sb.toString());
        o0OO000.OooO0O0("402006", map);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        RoomModel roomModel = (RoomModel) bundle.getSerializable("roommodel");
        if (roomModel != null) {
            this.f23449Oooo0o0 = roomModel;
            MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
            p427o0OoOO00.o0OOO0o.OooO0o(roomModel, null);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        PasswordSettingDialog passwordSettingDialog;
        super.onResume();
        Observable<Object> observable = LiveEventBus.get("LuckyPacket_Show_MixedRoomActivityOnResume");
        Boolean bool = Boolean.TRUE;
        observable.post(bool);
        this.f23447Oooo0OO = true;
        p493o0o00Oo0.OooOOO0 oooOOO0 = this.f23436OooOoOO;
        if (oooOOO0 != null) {
            oooOOO0.f48748OooO0oo = true;
        }
        o00OO00O o00oo00o = this.f23430OooOo0;
        if (o00oo00o != null && (passwordSettingDialog = o00oo00o.f48752OooO00o) != null && passwordSettingDialog.isShowing()) {
            EditText editText = this.f23430OooOo0.f48752OooO00o.f27871OooOOo0;
            p367o0OOo0o0.OooOO0O.OooO00o(editText.getContext().getApplicationContext(), new Handler(), android.support.v4.media.session.OooO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context"), editText.getWindowToken(), 0);
        }
        Intrinsics.checkNotNullParameter("HIDE_KEYBOARD", "key");
        Observable observable2 = LiveEventBus.get("roomHIDE_KEYBOARD", Object.class);
        Intrinsics.checkNotNullExpressionValue(observable2, "get(\"room$key\", Any::class.java)");
        observable2.post(bool);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("roommodel", this.f23449Oooo0o0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        p493o0o00Oo0.OooOOO0 oooOOO0 = this.f23436OooOoOO;
        if (oooOOO0 != null) {
            oooOOO0.f48748OooO0oo = false;
            oooOOO0.getClass();
        }
    }
}
