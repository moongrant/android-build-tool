package com.app.base.mixedroom;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.app.base.base.activity.Cocos2dxBaseActivity;
import com.app.base.dialog.baseDialog.PasswordSettingDialog;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomBroadcastOpenNobleDataModel;
import com.app.base.mixedroom.model.RoomBroadcastOpenNobleModel;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.mixedroom.model.RoomUserInfoChangeModel;
import com.app.base.model.ChackFollowAndJoinModel;
import com.app.base.model.ChatModel;
import com.app.base.model.GiftAnimationModel;
import com.app.base.model.GiftRoomModel;
import com.app.base.model.ProfileLimitModel;
import com.app.base.model.RoomMessageReplyInfo;
import com.app.base.model.RoomModel;
import com.app.base.model.RoomVoiceModule;
import com.app.base.model.SkillCardModel;
import com.app.base.model.TakeMicModel;
import com.app.base.model.roomBroadcastModel.RoomBroadcastModel;
import com.app.base.model.socketPostModel.BaseMicModel;
import com.app.base.model.socketPostModel.ForwardingRedPacketModel;
import com.app.base.model.socketPostModel.SendHeartModel;
import com.app.base.model.socketPostModel.ShutUpModel;
import com.app.base.protobuf.room.Room;
import com.app.base.view.BubbleView;
import com.app.base.view.pop.passwordSettingPop.PasswordSettingModel;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.qiniu.android.dns.NetworkInfo;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.weieyu.yalla.libaudiochat.event.BluetoothHeadsetBroadcastReceiver;
import com.weieyu.yalla.libaudiochat.event.HeadsetBroadcastReceiver;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomEffectGiftPlayer;
import com.yalla.yalla.common.manager.RoomState;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.model.RoomActivityEffectAnimModel;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.vm.LiveRoomVM;
import com.yalla.yalla.common.vm.RoomMemberVM;
import com.yalla.yalla.data.db.model.RoomTheme;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import com.yalla.yalla.ui.screen.event.EventDetailScreen;
import com.yalla.yalla.ui.view.RoomBroadcastView;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import com.zego.wrapper.ZegoLiveRoomConstants;
import io.agora.rtc.Constants;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import o000O00O.OooO0OO;
import o00OO0O0.Oooo0;
import o00OO0O0.o0OO00O;
import o00OO0O0.o0OOO0o;
import p025Oooo0O0.o000O0Oo;
import p043OooooO0.o00O0000;
import p140o00OOOo0.o000O00;
import p140o00OOOo0.o0Oo0oo;
import p140o00OOOo0.o0ooOOo;
import p143o00OOooO.oo000o;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p154o00Oo0oO.oo0o0Oo;
import p160o00OoOO.OooOO0;
import p160o00OoOO.OooOO0O;
import p160o00OoOO.o000;
import p160o00OoOO.o0000;
import p160o00OoOO.o00000;
import p160o00OoOO.o00000O0;
import p160o00OoOO.o0000O0O;
import p160o00OoOO.o0000OO0;
import p160o00OoOO.o0000oo;
import p160o00OoOO.o000O000;
import p160o00OoOO.o000O00O;
import p160o00OoOO.o000O0o;
import p160o00OoOO.o000OOo0;
import p160o00OoOO.o00O000;
import p161o00OoOO0.o00OO0OO;
import p163o00OoOOo.o0OoOoOo;
import p163o00OoOOo.oo00oO;
import p164o00OoOo.o00O00OO;
import p165o00OoOo0.o00OO;
import p169o00Ooo0.o0O0O00;
import p174o00OooO0.o00OOO00;
import p177o00OoooO.oO000Oo0;
import p178o00Ooooo.oOo000o0;
import p185o00o000o.OooOOO0;
import p255o00ooO0O.o00000O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o000Oo0;
import p255o00ooO0O.o0O0ooO;
import p256o00ooO0o.oo0oOO0;
import p393o0OOooOo.o0O00000;
import p448o0OoOo0o.o0O0o0;
import p448o0OoOo0o.o0O0o000;
import p480o0OooooO.oO0o0o;
import p500o0o00Oo0.OooOOO;
import p500o0o00Oo0.oo0o0O0;
import p502o0o00Ooo.o0000O00;
import p502o0o00Ooo.o0000Ooo;
import p517o0o0O00.o00O00;
import p524o0o0O0o.oOO00O;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;
import p547o0o0OoOo.b8;
import p547o0o0OoOo.x7;
import p547o0o0OoOo.y7;
import p547o0o0OoOo.z7;
import p548o0o0Ooo0.oO000OOo;
import p548o0o0Ooo0.oO00OOOo;
import p548o0o0Ooo0.oO0O00O;
import p548o0o0Ooo0.oO0OOO00;
import p558o0oOOoOO.oO000o00;
import p559o0oOOoOo.oOo00OO0;
import p560o0oOOoo.o00O0O0O;
import p560o0oOOoo.o0oOOo;
import p561o0oOOoo0.oo0O;
import p562o0oOOooO.oO00O0oO;
import p563o0oOOooo.oO00Oo0;
import p563o0oOOooo.oO0OO00o;
import p563o0oOOooo.oOo0000O;
import p581o0oOoOOo.l;
import p581o0oOoOOo.r;
import p586o0oOoo.o000O;
import p592o0oOooOO.n3;
import p709oOooo0o.o00;
import p709oOooo0o.o000OO00;

/* JADX INFO: loaded from: classes.dex */
public class MixedRoomActivity extends Cocos2dxBaseActivity implements o00OO.OooO0O0 {

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public static final /* synthetic */ int f11779o0000O00 = 0;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public Intent f11780OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public OooO0OO f11781OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public MixedRoomService f11782OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public PasswordSettingDialog f11783Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public o00 f11784Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public o00OO.OooO0OO<MixedRoomActivity> f11785OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public oo0oOO0 f11786Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public oo00oO f11788o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public RoomModel f11789o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public o00OO f11790o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public o00O00OO f11791o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public ChackFollowAndJoinModel f11792o00000O;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public RoomEffectGiftPlayer f11794o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public LiveRoomVM f11795o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public EventViewModel f11796o00000o0;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public RoomMemberVM f11799o0000Ooo;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f11800o000OOo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public oOo00OO0 f11801o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public oO000o00 f11802o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public TextView f11803o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public long f11804o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public ListView f11805o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public n3 f11806o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public BubbleView f11807o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public oo0O f11812o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public o0OO00O f11813o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public o0Oo0oo f11814o0ooOOo;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public FrameLayout f11816oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public o0OoOoOo f11818ooOO = new o0OoOoOo(this);

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public int f11815o0ooOoO = 0;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public o00000O0 f11810o0OOO0o = new View.OnTouchListener() { // from class: o00OoOO.o00000O0
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            MixedRoomActivity mixedRoomActivity = this.f32429Oooo;
            int i = MixedRoomActivity.f11779o0000O00;
            Objects.requireNonNull(mixedRoomActivity);
            if (motionEvent.getAction() == 0) {
                try {
                    if (System.currentTimeMillis() - mixedRoomActivity.f11804o00o0O > 120) {
                        mixedRoomActivity.f11804o00o0O = System.currentTimeMillis();
                        int i2 = mixedRoomActivity.f11815o0ooOoO + 1;
                        mixedRoomActivity.f11815o0ooOoO = i2;
                        if (i2 >= 30) {
                            SendHeartModel sendHeartModel = new SendHeartModel();
                            sendHeartModel.num = mixedRoomActivity.f11815o0ooOoO;
                            Objects.requireNonNull(o00O000.OooO());
                            o00 o00Var = o00O000.f32490OooO00o;
                            if (o00Var != null) {
                                o00Var.OooO0o(10011, com.android.billingclient.api.o0Oo0oo.OooO0Oo(sendHeartModel));
                            }
                            mixedRoomActivity.f11815o0ooOoO = 0;
                        }
                        mixedRoomActivity.f11807o00ooo.OooO00o();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public boolean f11811o0Oo0oo = false;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public boolean f11809o0OO00O = false;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f11817oo0o0Oo = true;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public OooO0O0 f11808o0O0O00 = new OooO0O0();

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public boolean f11793o00000O0 = false;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public l f11797o00000oO = null;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public boolean f11798o00000oo = true;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public z7 f11787o0000 = new z7(this);

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f11819OooO00o;

        static {
            int[] iArr = new int[AbsListenerTag.values().length];
            f11819OooO00o = iArr;
            try {
                iArr[AbsListenerTag.Ok.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11819OooO00o[AbsListenerTag.Cancel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class OooO0O0 implements AbsListView.OnScrollListener {
        public OooO0O0() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            TextView textView;
            if (absListView.getLastVisiblePosition() != absListView.getCount() - 1) {
                MixedRoomActivity.this.f11817oo0o0Oo = false;
                return;
            }
            View childAt = absListView.getChildAt(absListView.getLastVisiblePosition() - absListView.getFirstVisiblePosition());
            if (com.yalla.support.common.util.OooO0OO.OooO0O0(childAt)) {
                MixedRoomActivity.this.f11817oo0o0Oo = absListView.getHeight() >= childAt.getBottom();
            }
            MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
            if (!mixedRoomActivity.f11817oo0o0Oo || (textView = mixedRoomActivity.f11803o00Ooo) == null) {
                return;
            }
            textView.clearAnimation();
            MixedRoomActivity.this.f11803o00Ooo.setVisibility(8);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 0) {
                if (absListView.getLastVisiblePosition() != absListView.getCount() - 1) {
                    if (absListView.getLastVisiblePosition() < absListView.getCount() - 1) {
                        MixedRoomActivity.this.f11803o00Ooo.setVisibility(0);
                        MixedRoomActivity.this.f11803o00Ooo.setText(R.string.Room_chatline_Bottom);
                    }
                    MixedRoomActivity.this.f11817oo0o0Oo = false;
                    return;
                }
                View childAt = absListView.getChildAt(absListView.getLastVisiblePosition() - absListView.getFirstVisiblePosition());
                if (com.yalla.support.common.util.OooO0OO.OooO0O0(childAt)) {
                    MixedRoomActivity.this.f11817oo0o0Oo = absListView.getHeight() >= childAt.getBottom();
                }
                MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
                if (mixedRoomActivity.f11817oo0o0Oo) {
                    mixedRoomActivity.f11803o00Ooo.clearAnimation();
                    MixedRoomActivity.this.f11803o00Ooo.setVisibility(8);
                }
            }
        }
    }

    public class OooO0OO implements ServiceConnection {
        public OooO0OO() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o00O00.OooO0O0("onServiceConnected name = " + componentName + ", service = " + iBinder + "Thread:" + Thread.currentThread().getName());
            MixedRoomActivity mixedRoomActivity = MixedRoomActivity.this;
            MixedRoomService service = MixedRoomService.this;
            mixedRoomActivity.f11782OooooOo = service;
            oO0OO00o oo0oo00o = mixedRoomActivity.f11787o0000.f44386OooO0o;
            if (oo0oo00o != null) {
                Intrinsics.checkNotNullParameter(service, "service");
                oo0oo00o.f44936OooO0o0 = service;
            }
            MixedRoomActivity mixedRoomActivity2 = MixedRoomActivity.this;
            mixedRoomActivity2.f11782OooooOo.OooO0oO(mixedRoomActivity2.f11785OoooooO);
            RoomModel roomModel = (RoomModel) MixedRoomActivity.this.getIntent().getSerializableExtra("room");
            o00OO000.OooO0O0 oooO0O0 = o00OO000.OooO0O0.f43232OooO00o;
            if (oooO0O0.OooO00o() == 0) {
                if (roomModel == null) {
                    MixedRoomActivity.this.OooOoo();
                    return;
                } else {
                    MixedRoomActivity.this.f11782OooooOo.OooO0OO(roomModel);
                    return;
                }
            }
            if (roomModel != null && oooO0O0.OooO00o() != roomModel.getId()) {
                MixedRoomActivity.this.OooOooO(roomModel);
                return;
            }
            MixedRoomActivity.this.f11798o00000oo = false;
            o00O000.OooO().OooOO0O();
            MixedRoomService mixedRoomService = MixedRoomActivity.this.f11782OooooOo;
            o0O0o0 o0o0o0 = mixedRoomService.f11845OoooO0;
            if (o0o0o0 != null) {
                o000OOo0 o000ooo1 = new o000OOo0(mixedRoomService);
                mixedRoomService.f11847OoooO0O = o000ooo1;
                o0o0o0.OooOo0O(o000ooo1);
            }
            Objects.requireNonNull(MixedRoomActivity.this);
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            if (o00OO000.f43208Oooo0o) {
                o00OO000.f43208Oooo0o = false;
                o00OO000.f43201Oooo.postValue(Boolean.TRUE);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            o00O00.OooO0O0("onServiceDisconnected name = " + componentName);
        }
    }

    public class OooO0o implements o000OO00 {
        public OooO0o() {
        }

        @Override // p709oOooo0o.o000OO00
        public final void onCancel() {
            MixedRoomActivity.this.OooOoo();
        }
    }

    @Override // o00OO.OooO0O0
    public final void OooO0O0(Message message) {
        OooOooo(message);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOOO() {
        overridePendingTransition(R.anim.anim_empty, R.anim.anim_activity_room_close_exit);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity
    public final void OooOOOo() {
        overridePendingTransition(R.anim.anim_activity_room_open_enter, R.anim.anim_empty);
    }

    public final void OooOoO(RoomModel roomModel) {
        oOo000o0 ooo000o0;
        this.f11789o000000 = roomModel;
        LiveEventBus.get("RESET_ROOM").post(Boolean.TRUE);
        this.f11798o00000oo = true;
        oo0oOO0 oo0ooo0 = this.f11786Ooooooo;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO0Oo();
        }
        this.f11803o00Ooo.clearAnimation();
        this.f11803o00Ooo.setVisibility(8);
        this.f11817oo0o0Oo = true;
        o0OoOoOo o0oooooo2 = this.f11818ooOO;
        if (o0oooooo2 != null) {
            o0oooooo2.f32529OooO0O0 = null;
        }
        RoomEffectGiftPlayer roomEffectGiftPlayer = this.f11794o00000OO;
        if (roomEffectGiftPlayer != null) {
            roomEffectGiftPlayer.reset();
        }
        Oooo0();
        o00OO o00oo2 = this.f11790o000000O;
        if (o00oo2 != null && (ooo000o0 = o00oo2.f32564OooO0OO) != null) {
            ooo000o0.dismiss();
        }
        oo00oO oo00oo = this.f11788o00000;
        if (oo00oo != null) {
            oo00oo.OooO00o();
            oO00OOOo oo00oooo = oo00oo.f32531OooO00o;
            oO0OOO00.OooOO0(oo00oooo.f44412OooO.getValue(), oo00oooo.OooO0OO());
        }
        Iterator<b8> it = this.f11787o0000.f44383OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0();
        }
        Oooo0o();
        MixedRoomService mixedRoomService = this.f11782OooooOo;
        if (mixedRoomService != null) {
            o00O00.OooO0oo("MixedRoomService", "MixedRoomService changeRoom");
            mixedRoomService.f11852o000oOoO = roomModel;
            Job job = o0000Ooo.f41402OooO0O0;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            o0000Ooo.f41402OooO0O0 = null;
            RoomVoiceModule roomVoiceModule = o0000Ooo.f41403OooO0OO;
            if (roomVoiceModule != null) {
                List<RoomVoiceModule.TimeVoice> timeVoice = roomVoiceModule != null ? roomVoiceModule.getTimeVoice() : null;
                if (!(timeVoice == null || timeVoice.isEmpty())) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o0000O00(null), 3, null);
                }
            }
            o0O0o000 o0o0o000OooO0O0 = o0O0o000.OooO0O0();
            Context applicationContext = mixedRoomService.getApplicationContext();
            Objects.requireNonNull(o0o0o000OooO0O0);
            try {
                BluetoothHeadsetBroadcastReceiver bluetoothHeadsetBroadcastReceiver = o0o0o000OooO0O0.f40272OooO0oO;
                if (bluetoothHeadsetBroadcastReceiver != null) {
                    applicationContext.unregisterReceiver(bluetoothHeadsetBroadcastReceiver);
                    o0o0o000OooO0O0.f40272OooO0oO = null;
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            o0O0o000 o0o0o000OooO0O1 = o0O0o000.OooO0O0();
            Context applicationContext2 = mixedRoomService.getApplicationContext();
            Objects.requireNonNull(o0o0o000OooO0O1);
            try {
                HeadsetBroadcastReceiver headsetBroadcastReceiver = o0o0o000OooO0O1.f40270OooO0o;
                if (headsetBroadcastReceiver != null && applicationContext2 != null) {
                    applicationContext2.unregisterReceiver(headsetBroadcastReceiver);
                    o0o0o000OooO0O1.f40270OooO0o = null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            mixedRoomService.OooO0o();
            o000O00O.OooO().OooOoo();
            o00OO0O0.f43338OooooOo.OooO00o().OooO00o();
            mixedRoomService.OooO0Oo();
            mixedRoomService.f11846OoooO00.f32414OooOOOO = o000O00O.OooO().f32449Oooo;
            o000O00O o000o00oOooO = o000O00O.OooO();
            o000o00oOooO.f32450OoooO = mixedRoomService.f11849OoooOOO;
            o000o00oOooO.f32454OoooOO0 = null;
            p160o00OoOO.o00 o00Var = mixedRoomService.f11846OoooO00;
            o00Var.f32406OooO0o0 = roomModel;
            o000O00O.OooO().Oooo0OO(roomModel);
            o00Var.f32415OooOOOo = true;
            o00Var.f32405OooO0o = true;
            o00Var.OooO0OO();
        }
    }

    public final void OooOoOO() {
        MixedRoomService mixedRoomService = this.f11782OooooOo;
        if (mixedRoomService != null) {
            o00O00.OooO0OO("MixedRoomService", "releaseUiHandler");
            mixedRoomService.OooO0oO(null);
            MixedRoomService mixedRoomService2 = this.f11782OooooOo;
            Objects.requireNonNull(mixedRoomService2);
            o00O00.OooO0OO("MixedRoomService", "releaseAudioChatService");
            o0O0o0 o0o0o0 = mixedRoomService2.f11845OoooO0;
            if (o0o0o0 != null) {
                o0o0o0.OooO00o();
                mixedRoomService2.f11847OoooO0O = null;
            }
        }
        OooO0OO oooO0OO = this.f11781OooooOO;
        if (oooO0OO != null) {
            unbindService(oooO0OO);
            this.f11781OooooOO = null;
        }
    }

    public final void OooOoo() {
        OooOoOO();
        finish();
        RoomStateManager.INSTANCE.disconnectRoom();
    }

    public final void OooOoo0() {
        o00 o00Var = this.f11784Oooooo0;
        if (o00Var != null) {
            Objects.requireNonNull(o00Var);
            try {
                Dialog dialog = o00Var.f53038OooO00o;
                if (dialog != null && dialog.isShowing()) {
                    o00Var.f53038OooO00o.dismiss();
                    o00Var.f53038OooO00o = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f11784Oooooo0 = null;
        }
        PasswordSettingDialog passwordSettingDialog = this.f11783Oooooo;
        if (passwordSettingDialog != null) {
            passwordSettingDialog.dismiss();
            this.f11783Oooooo = null;
        }
    }

    public final void OooOooO(RoomModel roomModel) {
        if (roomModel.getId() == 0) {
            return;
        }
        if (roomModel.getId() != o00OO000.OooO0O0.f43232OooO00o.OooO00o()) {
            OooOoO(roomModel);
            return;
        }
        o00OO000 o00oo001 = o00OO000.f43171OooO00o;
        if (o00OO000.f43208Oooo0o) {
            o00OO000.f43208Oooo0o = false;
            o00OO000.f43201Oooo.postValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:234:0x0699  */
    /* JADX WARN: Code duplicated, block: B:265:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:334:0x0996  */
    /* JADX WARN: Code duplicated, block: B:341:0x09b8 A[Catch: Exception -> 0x09e3, TryCatch #2 {Exception -> 0x09e3, blocks: (B:335:0x0999, B:337:0x09a1, B:339:0x09a5, B:341:0x09b8, B:343:0x09cd), top: B:363:0x0999 }] */
    /* JADX WARN: Code duplicated, block: B:343:0x09cd A[Catch: Exception -> 0x09e3, TRY_LEAVE, TryCatch #2 {Exception -> 0x09e3, blocks: (B:335:0x0999, B:337:0x09a1, B:339:0x09a5, B:341:0x09b8, B:343:0x09cd), top: B:363:0x0999 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0 A[Catch: Exception -> 0x00db, TryCatch #1 {Exception -> 0x00db, blocks: (B:27:0x0075, B:29:0x007b, B:31:0x0087, B:34:0x00a0, B:36:0x00b3, B:39:0x00bb, B:40:0x00c4), top: B:361:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[Catch: Exception -> 0x00db, TryCatch #1 {Exception -> 0x00db, blocks: (B:27:0x0075, B:29:0x007b, B:31:0x0087, B:34:0x00a0, B:36:0x00b3, B:39:0x00bb, B:40:0x00c4), top: B:361:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[Catch: Exception -> 0x00db, TryCatch #1 {Exception -> 0x00db, blocks: (B:27:0x0075, B:29:0x007b, B:31:0x0087, B:34:0x00a0, B:36:0x00b3, B:39:0x00bb, B:40:0x00c4), top: B:361:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4 A[Catch: Exception -> 0x00db, TRY_LEAVE, TryCatch #1 {Exception -> 0x00db, blocks: (B:27:0x0075, B:29:0x007b, B:31:0x0087, B:34:0x00a0, B:36:0x00b3, B:39:0x00bb, B:40:0x00c4), top: B:361:0x0075 }] */
    /* JADX WARN: Type inference failed for: r7v36, types: [Model, com.app.base.view.pop.passwordSettingPop.PasswordSettingModel] */
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
    public final void OooOooo(Message msg) {
        oO0OO00o oo0oo00o;
        SkillCardModel skillCardModel;
        n3 n3Var;
        p189o00o00o0.OooO0OO<RoomLoginInformation.MIC> oooO0OO;
        MixedRoomMicView mixedRoomMicViewOooO0o0;
        String headerCardUrl;
        int iOooOOO;
        ChackFollowAndJoinModel.DataBean dataBean;
        PasswordSettingDialog passwordSettingDialog;
        RoomEffectGiftPlayer roomEffectGiftPlayer;
        MixedRoomService mixedRoomService;
        MixedRoomService mixedRoomService2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = msg.what;
        boolean z = false;
        if (i == 10008) {
            RoomStateManager.INSTANCE.disconnectRoom();
            o00O00.OooO0OO("RoomDialogDis", "dismiss 1514 WM_ROOM_Kicking");
            OooOoo0();
            if (isDestroyed() || isFinishing()) {
                return;
            }
            oo0oOO0 oo0ooo0 = new oo0oOO0(this);
            oo0ooo0.OooOoo(R.string.room_ban_title);
            oo0ooo0.OooOo0(R.string.room_ban_toast);
            oo0ooo0.OooO0oO(false);
            oo0ooo0.OooOo0o(new Function0() { // from class: o00OoOO.OooOOO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    MixedRoomActivity mixedRoomActivity = this.f32390Oooo;
                    int i2 = MixedRoomActivity.f11779o0000O00;
                    mixedRoomActivity.OooOoo();
                    return null;
                }
            });
            oo0ooo0.OooOOO0();
        } else if (i == 10009) {
            o00O00.OooO0O0("收到礼物");
            Object obj = msg.obj;
            if (obj != null) {
                GiftRoomModel giftRoomModel = (GiftRoomModel) obj;
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("giftModel = ");
                sbOooO0O0.append(giftRoomModel.toJSONString());
                o00O00.OooO0O0(sbOooO0O0.toString());
                Oooo000(giftRoomModel);
            }
        } else if (i == 10049) {
            oo0oo00o = this.f11787o0000.f44386OooO0o;
            if (oo0oo00o != null && (skillCardModel = (SkillCardModel) msg.obj) != null) {
                skillCardModel.cardType = 1;
                n3Var = oo0oo00o.f44932OooO0O0.f11806o00oO0o;
                if (n3Var != null) {
                    n3Var.OooO00o(skillCardModel);
                }
                try {
                    if (skillCardModel.target.getMicPosition() > 0 && (oooO0OO = oo0oo00o.f44935OooO0o) != null) {
                        Intrinsics.checkNotNull(oooO0OO);
                        if (oooO0OO.getData().size() >= skillCardModel.target.getMicPosition()) {
                            mixedRoomMicViewOooO0o0 = oo0oo00o.OooO0o0(skillCardModel.target.getMicPosition() - 1);
                            headerCardUrl = skillCardModel.target.getHeaderCardUrl();
                            if (mixedRoomMicViewOooO0o0.f11825OoooO0 == 2) {
                                mixedRoomMicViewOooO0o0.f11828OoooOO0.setVisibility(0);
                                SVGAView sVGAView = mixedRoomMicViewOooO0o0.f11828OoooOO0;
                                sVGAView.OooO0oo(CloudImageUtilKt.imgFormat(headerCardUrl), (FragmentActivity) mixedRoomMicViewOooO0o0.f11823Oooo);
                                sVGAView.OooO();
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (i == 10050) {
            SkillCardModel skillCardModel2 = (SkillCardModel) msg.obj;
            skillCardModel2.cardType = 2;
            n3 n3Var2 = this.f11806o00oO0o;
            if (n3Var2 != null) {
                n3Var2.OooO00o(skillCardModel2);
            }
        } else if (i == 21000) {
            o00O00.OooO0OO("RoomDialogDis", "dismiss 1359 ROOM_SHOW_DIALOG_21000");
            OooOoo0();
            if (this.f11784Oooooo0 == null) {
                Objects.requireNonNull(o0ooOOo.OooO0O0());
                o00 o00Var = new o00();
                this.f11784Oooooo0 = o00Var;
                o00Var.f53039OooO0O0 = new OooO0o();
            }
            try {
                o00O00.OooO0OO("RoomDialogDis", "show 1359 ROOM_SHOW_DIALOG_21000");
                this.f11784Oooooo0.OooO00o(this, o000O0O0.OooO0OO(R.string.loading));
            } catch (Exception e2) {
                e2.printStackTrace();
                this.f11784Oooooo0 = null;
            }
        } else {
            if (i != 21001) {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 8:
                        break;
                    case 6:
                        Objects.requireNonNull(o00O000.OooO());
                        p160o00OoOO.o00 o00Var2 = o00O000.f32490OooO00o;
                        if (o00Var2 != null) {
                            o00Var2.OooO0o(10030, "");
                        }
                        break;
                    case 7:
                        oO0OO00o oo0oo00o2 = this.f11787o0000.f44386OooO0o;
                        if (oo0oo00o2 != null) {
                            Intrinsics.checkNotNullParameter(msg, "msg");
                            Object obj2 = msg.obj;
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            Long uid = Long.valueOf((String) obj2);
                            try {
                                if (com.yalla.support.common.util.OooO0OO.OooO0O0(uid) && uid == OooOOO.f41235OooO00o.OooOo().getValue()) {
                                    Boolean value = o00OO0O0.f43338OooooOo.OooO00o().f43361OooOo00.getValue();
                                    Intrinsics.checkNotNull(value);
                                    if (!value.booleanValue()) {
                                        o000O00O o000o00oOooO = o000O00O.OooO();
                                        Intrinsics.checkNotNullExpressionValue(uid, "uid");
                                        iOooOOO = o000o00oOooO.OooOOO(uid.longValue());
                                        if (iOooOOO > -1) {
                                            MixedRoomService mixedRoomService3 = oo0oo00o2.f44936OooO0o0;
                                            Intrinsics.checkNotNull(mixedRoomService3);
                                            o0O0o0 o0o0o0 = mixedRoomService3.f11845OoooO0;
                                            Object obj3 = msg.obj;
                                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                                            o0o0o0.OooOo00(o000Oo0.OooO0OO((String) obj3, 0), true);
                                        } else if (msg.arg1 <= 30) {
                                            oo0oo00o2.OooO0o0(iOooOOO).OooO0O0();
                                        }
                                    }
                                } else {
                                    o000O00O o000o00oOooO2 = o000O00O.OooO();
                                    Intrinsics.checkNotNullExpressionValue(uid, "uid");
                                    iOooOOO = o000o00oOooO2.OooOOO(uid.longValue());
                                    if (iOooOOO > -1) {
                                        MixedRoomService mixedRoomService4 = oo0oo00o2.f44936OooO0o0;
                                        Intrinsics.checkNotNull(mixedRoomService4);
                                        o0O0o0 o0o0o1 = mixedRoomService4.f11845OoooO0;
                                        Object obj4 = msg.obj;
                                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                                        o0o0o1.OooOo00(o000Oo0.OooO0OO((String) obj4, 0), true);
                                    } else if (msg.arg1 <= 30) {
                                        oo0oo00o2.OooO0o0(iOooOOO).OooO0O0();
                                    }
                                }
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                        break;
                    default:
                        switch (i) {
                            case Constants.WARN_APM_RESIDUAL_ECHO /* 1053 */:
                                RoomStateManager.INSTANCE.disconnectRoom();
                                oo0oOO0 oo0ooo1 = new oo0oOO0(this);
                                oo0ooo1.OooOooO(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.room_ban_title));
                                oo0ooo1.OooOo0(R.string.failed_into_room_reason);
                                oo0ooo1.OooOo(new Function0() { // from class: o00OoOO.OooOOOO
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        MixedRoomActivity mixedRoomActivity = this.f32392Oooo;
                                        int i2 = MixedRoomActivity.f11779o0000O00;
                                        mixedRoomActivity.OooOoo();
                                        return null;
                                    }
                                });
                                oo0ooo1.OooOO0(new Function0() { // from class: o00OoOO.OooOo00
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        MixedRoomActivity mixedRoomActivity = this.f32394Oooo;
                                        int i2 = MixedRoomActivity.f11779o0000O00;
                                        mixedRoomActivity.OooOoo();
                                        return null;
                                    }
                                });
                                oo0ooo1.OooOOOo(R.string.Log_In);
                                oo0ooo1.OooOo0o(new Function0() { // from class: o00OoOO.OooOo
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        MixedRoomActivity context = this.f32393Oooo;
                                        int i2 = MixedRoomActivity.f11779o0000O00;
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        context.startActivity(new Intent(context, (Class<?>) LoginActivity.class));
                                        context.OooOoo();
                                        return null;
                                    }
                                });
                                oo0ooo1.OooOOO0();
                                break;
                            case 2025:
                                o0O00000.OooO0OO("Room_enter_fail");
                                o00O00.OooO0oO("接收到消息: GlobalDef.SERVICE_STATUS_FAILD" + isFinishing());
                                Oooo0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.net_connection_error));
                                break;
                            case RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS /* 10001 */:
                                RoomLoginInformation roomLoginInformation = (RoomLoginInformation) com.android.billingclient.api.o0Oo0oo.OooO0O0((String) msg.obj, RoomLoginInformation.class);
                                if (roomLoginInformation != null) {
                                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("processLoginInformation loginMessage = ");
                                    sbOooO0O1.append(roomLoginInformation.toJSONString());
                                    o00O00.OooO0O0(sbOooO0O1.toString());
                                    int i2 = roomLoginInformation.f11855code;
                                    if (i2 != 0) {
                                        if (i2 == 1025) {
                                            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                                            if (o00oo001.OooO0OO() >= 5) {
                                                Oooo0o0();
                                            } else {
                                                if (OooOOO.f41235OooO00o.OooOooO().getValue().booleanValue() && this.f11792o00000O == null) {
                                                    o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
                                                    oo0o0Oo oo0o0oo = o00000OO.f32231OooO0Oo;
                                                    String str = this.f11789o000000.getId() + "";
                                                    o000O000 o000o001 = new o000O000(this);
                                                    Map<String, String> mapOooO0O0 = o00OO0OO.OooO0O0();
                                                    mapOooO0O0.put("barid", str);
                                                    p154o00Oo0oO.o0ooOOo o0ooooo2 = p154o00Oo0oO.o0ooOOo.f32239OooO00o;
                                                    o00OO0OO.OooO0OO(null, p154o00Oo0oO.o0ooOOo.f32265OooOoo, p154o00Oo0oO.o0ooOOo.f32315o0000O0O, mapOooO0O0, o000o001);
                                                }
                                                if (this.f11783Oooooo == null) {
                                                    Objects.requireNonNull(o0ooOOo.OooO0O0());
                                                    PasswordSettingDialog passwordSettingDialog2 = new PasswordSettingDialog(this);
                                                    passwordSettingDialog2.f32174OoooO0 = new o00000(this, z ? 1 : 0);
                                                    this.f11783Oooooo = passwordSettingDialog2;
                                                    passwordSettingDialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: o00OoOO.oo0o0Oo
                                                        @Override // android.content.DialogInterface.OnKeyListener
                                                        public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                                                            int i4 = MixedRoomActivity.f11779o0000O00;
                                                            return i3 == 4 && keyEvent.getRepeatCount() == 0;
                                                        }
                                                    });
                                                }
                                                ChackFollowAndJoinModel chackFollowAndJoinModel = this.f11792o00000O;
                                                if (chackFollowAndJoinModel != null && (dataBean = chackFollowAndJoinModel.data) != null && (passwordSettingDialog = this.f11783Oooooo) != null) {
                                                    passwordSettingDialog.OooOOOo(dataBean.isFollowing, dataBean.isJoined);
                                                }
                                                int iOooO0OO = o00oo001.OooO0OO();
                                                o00oo001.OooOOOO(iOooO0OO + 1);
                                                PasswordSettingDialog passwordSettingDialog3 = this.f11783Oooooo;
                                                passwordSettingDialog3.setCanceledOnTouchOutside(false);
                                                passwordSettingDialog3.f32175OoooO00 = new PasswordSettingModel("");
                                                passwordSettingDialog3.OooO0O0();
                                                passwordSettingDialog3.OooOOo(PasswordSettingDialog.PasswordDialogType.PasswordInput);
                                                passwordSettingDialog3.f11515o00000Oo = this.f11789o000000.getId() + "";
                                                passwordSettingDialog3.OooOo0(iOooO0OO > 0);
                                                passwordSettingDialog3.show();
                                                o00O00.OooO0O0("processLoginInformation LOGIN_FAILD_1025 ");
                                            }
                                        } else if (i2 != 4000000) {
                                            StringBuilder sbOooO0O2 = OooO00o.OooO00o.OooO0O0("WM_ROOM_LOGIN ERROR:");
                                            sbOooO0O2.append(roomLoginInformation.f11855code);
                                            o00O00.OooO0Oo(sbOooO0O2.toString());
                                        } else {
                                            Oooo0o0();
                                            o00O00.OooO0O0("processLoginInformation LOGIN_FAILED_4000000 5分钟内房间密码错误次数超过5次");
                                        }
                                    } else if (roomLoginInformation.getRoom() != null) {
                                        this.f11792o00000O = null;
                                        oO0OO00o oo0oo00o3 = this.f11787o0000.f44386OooO0o;
                                        if (oo0oo00o3 != null) {
                                            oo0oo00o3.OooO0oO(true);
                                        }
                                        MixedRoomService mixedRoomService5 = this.f11782OooooOo;
                                        if (mixedRoomService5 != null) {
                                            int vediotype = roomLoginInformation.getRoom().getVediotype();
                                            o00O00.OooO0oo("MixedRoomService", "initAudioChat: audioType=>" + vediotype);
                                            if (mixedRoomService5.f11844OoooO == null) {
                                                mixedRoomService5.f11844OoooO = (AudioManager) mixedRoomService5.getApplicationContext().getSystemService("audio");
                                            }
                                            if (mixedRoomService5.f11848OoooOO0 == null) {
                                                mixedRoomService5.f11848OoooOO0 = new MixedRoomService.OooO00o();
                                            }
                                            o0O0o000 o0o0o000OooO0O0 = o0O0o000.OooO0O0();
                                            Context applicationContext = mixedRoomService5.getApplicationContext();
                                            boolean z2 = !p489o0o000oO.o0ooOOo.OooO0Oo();
                                            o0o0o000OooO0O0.f40268OooO0OO = applicationContext;
                                            o0o0o000OooO0O0.f40267OooO0O0 = z2;
                                            o0o0o000OooO0O0.f40271OooO0o0 = vediotype;
                                            o00OOO00.f32714OooO00o = z2;
                                            mixedRoomService5.f11845OoooO0 = o0O0o000.OooO0O0().OooO00o();
                                            o00OO0O0.f43338OooooOo.OooO00o().f43361OooOo00.observeForever(mixedRoomService5.f11850OoooOOo);
                                            o0O0o000 o0o0o000OooO0O1 = o0O0o000.OooO0O0();
                                            Context applicationContext2 = mixedRoomService5.getApplicationContext();
                                            Objects.requireNonNull(o0o0o000OooO0O1);
                                            o0o0o000OooO0O1.f40272OooO0oO = new BluetoothHeadsetBroadcastReceiver(o0o0o000OooO0O1);
                                            IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                                            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
                                            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                                            applicationContext2.registerReceiver(o0o0o000OooO0O1.f40272OooO0oO, intentFilter);
                                            o0O0o000 o0o0o000OooO0O2 = o0O0o000.OooO0O0();
                                            Context applicationContext3 = mixedRoomService5.getApplicationContext();
                                            Objects.requireNonNull(o0o0o000OooO0O2);
                                            o0o0o000OooO0O2.f40270OooO0o = new HeadsetBroadcastReceiver(o0o0o000OooO0O2);
                                            IntentFilter intentFilter2 = new IntentFilter();
                                            intentFilter2.addAction("android.intent.action.HEADSET_PLUG");
                                            applicationContext3.registerReceiver(o0o0o000OooO0O2.f40270OooO0o, intentFilter2);
                                            this.f11782OooooOo.OooO0o0(roomLoginInformation.getChannelkey());
                                        }
                                        Oooo0();
                                        oOo00OO0 ooo00oo0 = this.f11801o00O0O;
                                        if (ooo00oo0 != null) {
                                            OooOOO0 oooOOO0 = ooo00oo0.f44693OooO0O0;
                                            if (oooOOO0 != null) {
                                                oooOOO0.OooO0O0();
                                            }
                                            OooOOO0 oooOOO1 = ooo00oo0.f44694OooO0OO;
                                            if (oooOOO1 != null) {
                                                oooOOO1.OooO0O0();
                                            }
                                            ooo00oo0.OooO00o();
                                        }
                                        oO000o00 oo000o00 = this.f11802o00Oo0;
                                        if (oo000o00 != null) {
                                            if (oo000o00.OooO0Oo() != null) {
                                                ((ArrayList) oo000o00.OooO0Oo()).clear();
                                            }
                                            RoomBroadcastView roomBroadcastView = oo000o00.f44681OooO0o;
                                            if (roomBroadcastView != null) {
                                                roomBroadcastView.clearAnimation();
                                            }
                                        }
                                        oO0OO00o oo0oo00o4 = this.f11787o0000.f44386OooO0o;
                                        if (oo0oo00o4 != null) {
                                            oo0oo00o4.OooO0oo();
                                        }
                                    }
                                }
                                break;
                            case 10011:
                                if (!this.f11811o0Oo0oo) {
                                    this.f11811o0Oo0oo = true;
                                    new Thread(new o0000OO0(this)).start();
                                }
                                break;
                            case 10043:
                                com.app.base.protobuf.OooO00o.OooO0OO("贵族购买或续费广播喇叭 *************** msg = ", msg);
                                RoomBroadcastOpenNobleModel roomBroadcastOpenNobleModel = (RoomBroadcastOpenNobleModel) com.android.billingclient.api.o0Oo0oo.OooO0O0((String) msg.obj, RoomBroadcastOpenNobleModel.class);
                                if (roomBroadcastOpenNobleModel != null && roomBroadcastOpenNobleModel.getData() != null) {
                                    StringBuilder sbOooO0O3 = OooO00o.OooO00o.OooO0O0("贵族购买或续费广播喇叭 roomBroadcastOpenNobleModel = ");
                                    sbOooO0O3.append(roomBroadcastOpenNobleModel.toJSONString());
                                    o00O00.OooO0O0(sbOooO0O3.toString());
                                    RoomBroadcastModel roomBroadcastModel = new RoomBroadcastModel();
                                    roomBroadcastModel.setNobleData(13, roomBroadcastOpenNobleModel.getData());
                                    if (this.f11802o00Oo0 != null && (roomBroadcastOpenNobleModel.getData().getAction() == 1 || roomBroadcastOpenNobleModel.getData().getAction() == 2)) {
                                        if (this.f11800o000OOo) {
                                            this.f11802o00Oo0.OooO0OO(roomBroadcastModel);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 10045:
                                oO0OO00o oo0oo00o5 = this.f11787o0000.f44386OooO0o;
                                if (oo0oo00o5 != null) {
                                    Intrinsics.checkNotNullParameter(msg, "msg");
                                    o00O00.OooO0oO("----- 通知用户信息变更 -----> msg = " + msg);
                                    Object obj5 = msg.obj;
                                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                                    RoomUserInfoChangeModel roomUserInfoChangeModel = (RoomUserInfoChangeModel) com.android.billingclient.api.o0Oo0oo.OooO0O0((String) obj5, RoomUserInfoChangeModel.class);
                                    if (roomUserInfoChangeModel != null) {
                                        StringBuilder sbOooO0O4 = OooO00o.OooO00o.OooO0O0("通知用户信息变更 roomUserInfoChangeModel = ");
                                        sbOooO0O4.append(roomUserInfoChangeModel.toJSONString());
                                        o00O00.OooO0O0(sbOooO0O4.toString());
                                        SparseArray<RoomLoginInformation.MIC> sparseArray = o000O00O.OooO().f32455OoooOOO;
                                        int size = sparseArray.size();
                                        for (int i3 = 0; i3 < size; i3++) {
                                            RoomLoginInformation.MIC mic = sparseArray.get(i3);
                                            if ((mic != null ? mic.user : null) != null && mic.user.getUserId() == roomUserInfoChangeModel.getUid()) {
                                                MixedRoomMicView mixedRoomMicViewOooO0o1 = oo0oo00o5.OooO0o0(i3);
                                                if (mixedRoomMicViewOooO0o1.f11825OoooO0 == 2) {
                                                    mixedRoomMicViewOooO0o1.f11828OoooOO0.OooOO0(false);
                                                    mixedRoomMicViewOooO0o1.f11828OoooOO0.setVisibility(8);
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 10058:
                                oO0OO00o oo0oo00o6 = this.f11787o0000.f44386OooO0o;
                                if (oo0oo00o6 != null) {
                                    oo0oo00o6.OooO0oO(false);
                                }
                                break;
                            case 10060:
                                if (msg.obj != null) {
                                    o00OO0O0.f43338OooooOo.OooO00o().f43391OoooOoo.postValue((RoomUserInfoModel) msg.obj);
                                } else {
                                    String strOooO0OO = o000O0O0.OooO0OO(R.string.notinroom);
                                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                                    if (((strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) ? (char) 1 : (char) 0) == 0) {
                                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                            o0o0oooOooO0O0.run();
                                        } else {
                                            p255o00ooO0O.o00O000 o00o001 = p255o00ooO0O.o00O000.f34368OooO00o;
                                            p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                                        }
                                    }
                                }
                                break;
                            case 10063:
                                LiveEventBus.get("MORA_GAME_ANIM").post((Room.MoraStartPkRequestReply) msg.obj);
                                break;
                            case 10066:
                                Room.MagicVoiceOut magicVoiceOut = (Room.MagicVoiceOut) msg.obj;
                                if (this.f11806o00oO0o != null) {
                                    SkillCardModel skillCardModel3 = new SkillCardModel();
                                    skillCardModel3.cardType = 3;
                                    RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
                                    skillCardModel3.from = companion.of(magicVoiceOut.getFrom());
                                    skillCardModel3.target = companion.of(magicVoiceOut.getTarget());
                                    this.f11806o00oO0o.OooO00o(skillCardModel3);
                                }
                                break;
                            case ZegoLiveRoomConstants.ErrorCode.SDK_SHOULD_NOT_READY /* 20001 */:
                                Intrinsics.checkNotNullParameter("HIDE_KEYBOARD", "key");
                                Observable observable = LiveEventBus.get("roomHIDE_KEYBOARD", Object.class);
                                Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
                                observable.post(Boolean.TRUE);
                                o00OO000 o00oo002 = o00OO000.f43171OooO00o;
                                int iOooO0OO2 = o00oo002.OooO0OO();
                                if (iOooO0OO2 > 0) {
                                    o00oo002.OooOOOO(iOooO0OO2 - 1);
                                }
                                MixedRoomService mixedRoomService6 = this.f11782OooooOo;
                                if (mixedRoomService6 != null) {
                                    mixedRoomService6.OooO0o();
                                }
                                oo0oo00o = this.f11787o0000.f44386OooO0o;
                                if (oo0oo00o != null) {
                                    skillCardModel.cardType = 1;
                                    n3Var = oo0oo00o.f44932OooO0O0.f11806o00oO0o;
                                    if (n3Var != null) {
                                        n3Var.OooO00o(skillCardModel);
                                    }
                                    if (skillCardModel.target.getMicPosition() > 0) {
                                        Intrinsics.checkNotNull(oooO0OO);
                                        if (oooO0OO.getData().size() >= skillCardModel.target.getMicPosition()) {
                                            mixedRoomMicViewOooO0o0 = oo0oo00o.OooO0o0(skillCardModel.target.getMicPosition() - 1);
                                            headerCardUrl = skillCardModel.target.getHeaderCardUrl();
                                            if (mixedRoomMicViewOooO0o0.f11825OoooO0 == 2) {
                                                mixedRoomMicViewOooO0o0.f11828OoooOO0.setVisibility(0);
                                                SVGAView sVGAView2 = mixedRoomMicViewOooO0o0.f11828OoooOO0;
                                                sVGAView2.OooO0oo(CloudImageUtilKt.imgFormat(headerCardUrl), (FragmentActivity) mixedRoomMicViewOooO0o0.f11823Oooo);
                                                sVGAView2.OooO();
                                            }
                                        }
                                    }
                                }
                                break;
                            case 30002:
                                if (this.f11782OooooOo != null) {
                                    o00O000.OooO().OooOO0O();
                                }
                                break;
                            case 100661:
                                break;
                            case CommonError.Other_Device_Login /* 999001 */:
                                oo0oOO0 oo0ooo2 = new oo0oOO0(this);
                                oo0ooo2.OooOo0(R.string.turntable_close_return_coin);
                                oo0ooo2.OooOOO0();
                                break;
                            case 1000600:
                                RoomActivityEffectAnimModel roomActivityEffectAnimModel = (RoomActivityEffectAnimModel) msg.obj;
                                if (this.f11800o000OOo && (roomEffectGiftPlayer = this.f11794o00000OO) != null) {
                                    roomEffectGiftPlayer.addEffectGift(0, 1, roomActivityEffectAnimModel.getUrl());
                                }
                                break;
                            default:
                                switch (i) {
                                    case 10016:
                                        oO0OO00o oo0oo00o7 = this.f11787o0000.f44386OooO0o;
                                        if (oo0oo00o7 != null) {
                                            RoomLoginInformation.MIC mic2 = (RoomLoginInformation.MIC) msg.obj;
                                            Intrinsics.checkNotNullParameter(mic2, "mic");
                                            o00O00.OooO0OO("麦变更", "上麦----1");
                                            long userId = mic2.user.getUserId();
                                            Long value2 = OooOOO.f41235OooO00o.OooOo().getValue();
                                            if (value2 != null && userId == value2.longValue() && (mixedRoomService = oo0oo00o7.f44936OooO0o0) != null) {
                                                Intrinsics.checkNotNull(mixedRoomService);
                                                mixedRoomService.f11845OoooO0.OooO0OO();
                                                o00O00.OooO0OO("麦变更", "上麦...MuteMic false");
                                                o00OO0O0.f43338OooooOo.OooO00o().f43361OooOo00.setValue(Boolean.FALSE);
                                                o00OO000.OooO0o.f43245OooO00o.OooOO0(true);
                                                o0O00000.OooO0OO("InRoom_take_mic_success");
                                                if (!o000O00O.OooO().OooOOOO(mic2.getVoicecard())) {
                                                    int iOooOO0 = o000O00O.OooO().OooOO0(mic2.getVoicecard());
                                                    MixedRoomService mixedRoomService7 = oo0oo00o7.f44936OooO0o0;
                                                    Intrinsics.checkNotNull(mixedRoomService7);
                                                    mixedRoomService7.f11845OoooO0.OooO0Oo(iOooOO0);
                                                }
                                            }
                                            RoomLoginInformation.MIC mic3 = o000O00O.OooO().f32455OoooOOO.get(mic2.getMicorder() - 1);
                                            if (o000O00O.OooO().OooOOOO(mic2.getVoicecard())) {
                                                mic3.setVoicecard(0);
                                            }
                                            oo0oo00o7.OooO0o0(mic2.getMicorder() - 1).setMicInformation(mic3);
                                            MixedRoomService mixedRoomService8 = oo0oo00o7.f44936OooO0o0;
                                            Intrinsics.checkNotNull(mixedRoomService8);
                                            if (mixedRoomService8.f11845OoooO0 != null && Intrinsics.areEqual(o00OO0O0.f43338OooooOo.OooO00o().f43358OooOOoo.getValue(), Boolean.FALSE)) {
                                                MixedRoomService mixedRoomService9 = oo0oo00o7.f44936OooO0o0;
                                                Intrinsics.checkNotNull(mixedRoomService9);
                                                mixedRoomService9.f11845OoooO0.OooOo00((int) mic2.user.getUserId(), false);
                                            }
                                            if (oo0oo00o7.f44935OooO0o != null) {
                                                int micorder = mic2.getMicorder();
                                                p189o00o00o0.OooO0OO<RoomLoginInformation.MIC> oooO0OO2 = oo0oo00o7.f44935OooO0o;
                                                Intrinsics.checkNotNull(oooO0OO2);
                                                if (micorder <= oooO0OO2.getData().size()) {
                                                    p189o00o00o0.OooO0OO<RoomLoginInformation.MIC> oooO0OO3 = oo0oo00o7.f44935OooO0o;
                                                    Intrinsics.checkNotNull(oooO0OO3);
                                                    oooO0OO3.getData().set(mic2.getMicorder() - 1, mic2);
                                                    if (oo0oo00o7.f44932OooO0O0.f11791o000000o.f32552OooOO0o == mic2.getOrder() - 1) {
                                                        oo0oo00o7.OooO0Oo(false);
                                                    }
                                                    oo0oo00o7.OooO0oo();
                                                    o00O00.OooO0OO("麦变更", "上麦----2");
                                                }
                                            } else {
                                                if (oo0oo00o7.f44932OooO0O0.f11791o000000o.f32552OooOO0o == mic2.getOrder() - 1) {
                                                    oo0oo00o7.OooO0Oo(false);
                                                }
                                                oo0oo00o7.OooO0oo();
                                                o00O00.OooO0OO("麦变更", "上麦----2");
                                            }
                                        }
                                        break;
                                    case 10017:
                                        oO0OO00o oo0oo00o8 = this.f11787o0000.f44386OooO0o;
                                        if (oo0oo00o8 != null) {
                                            RoomLoginInformation.MIC downResult = (RoomLoginInformation.MIC) msg.obj;
                                            Intrinsics.checkNotNullParameter(downResult, "downResult");
                                            o00O00.OooO0OO("麦变更", "下麦...1");
                                            if (oo0oo00o8.f44935OooO0o != null) {
                                                int micorder2 = downResult.getMicorder();
                                                p189o00o00o0.OooO0OO<RoomLoginInformation.MIC> oooO0OO4 = oo0oo00o8.f44935OooO0o;
                                                Intrinsics.checkNotNull(oooO0OO4);
                                                if (micorder2 <= oooO0OO4.getData().size()) {
                                                    p189o00o00o0.OooO0OO<RoomLoginInformation.MIC> oooO0OO5 = oo0oo00o8.f44935OooO0o;
                                                    Intrinsics.checkNotNull(oooO0OO5);
                                                    oooO0OO5.getData().set(downResult.getMicorder() - 1, null);
                                                    oo0oo00o8.OooO0o0(downResult.getMicorder() - 1).setMicInformation(null);
                                                    if (downResult.getUserid() == o0O0O00.OooOOO0(String.valueOf(OooOOO.f41235OooO00o.OooOo().getValue())) && (mixedRoomService2 = oo0oo00o8.f44936OooO0o0) != null) {
                                                        Intrinsics.checkNotNull(mixedRoomService2);
                                                        if (mixedRoomService2.f11845OoooO0 != null) {
                                                            MixedRoomService mixedRoomService10 = oo0oo00o8.f44936OooO0o0;
                                                            Intrinsics.checkNotNull(mixedRoomService10);
                                                            mixedRoomService10.f11845OoooO0.OooOOO0();
                                                        }
                                                        o00O00.OooO0OO("麦变更", "下麦...MuteMic");
                                                        o00OO0O0.f43338OooooOo.OooO00o().f43361OooOo00.setValue(Boolean.TRUE);
                                                        o00OO000.OooO0o.f43245OooO00o.OooOO0(false);
                                                    }
                                                    oo0oo00o8.OooO0oo();
                                                    o00O00.OooO0OO("麦变更", "下麦...2");
                                                }
                                            } else {
                                                oo0oo00o8.OooO0o0(downResult.getMicorder() - 1).setMicInformation(null);
                                                if (downResult.getUserid() == o0O0O00.OooOOO0(String.valueOf(OooOOO.f41235OooO00o.OooOo().getValue()))) {
                                                    Intrinsics.checkNotNull(mixedRoomService2);
                                                    if (mixedRoomService2.f11845OoooO0 != null) {
                                                        MixedRoomService mixedRoomService11 = oo0oo00o8.f44936OooO0o0;
                                                        Intrinsics.checkNotNull(mixedRoomService11);
                                                        mixedRoomService11.f11845OoooO0.OooOOO0();
                                                    }
                                                    o00O00.OooO0OO("麦变更", "下麦...MuteMic");
                                                    o00OO0O0.f43338OooooOo.OooO00o().f43361OooOo00.setValue(Boolean.TRUE);
                                                    o00OO000.OooO0o.f43245OooO00o.OooOO0(false);
                                                }
                                                oo0oo00o8.OooO0oo();
                                                o00O00.OooO0OO("麦变更", "下麦...2");
                                            }
                                        }
                                        break;
                                    case 10018:
                                        oO0OO00o oo0oo00o9 = this.f11787o0000.f44386OooO0o;
                                        if (oo0oo00o9 != null) {
                                            TakeMicModel model = (TakeMicModel) msg.obj;
                                            Intrinsics.checkNotNullParameter(model, "model");
                                            if (!oo0oo00o9.f44938OooO0oo) {
                                                oo0oo00o9.f44938OooO0oo = true;
                                                String str2 = model.from.name;
                                                oo0oOO0 oo0ooo3 = new oo0oOO0(oo0oo00o9.f44932OooO0O0);
                                                oo0ooo3.OooOo0O(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.mic_tops_content), str2));
                                                oo0ooo3.OooOoO0(o000O0O0.OooO0OO(R.string.Ignore));
                                                oo0ooo3.OooOOo0(o000O0O0.OooO0OO(R.string.Accept));
                                                oo0ooo3.OooOo0o(new oOo0000O(model, oo0oo00o9));
                                                oo0ooo3.OooOO0O(new p563o0oOOooo.oOo000o0(oo0oo00o9));
                                                oo0ooo3.OooOOO0();
                                            }
                                        }
                                        break;
                                    case 10019:
                                        o00O00.OooO0O0("收到广播***************");
                                        RoomBroadcastModel roomBroadcastModel2 = (RoomBroadcastModel) msg.obj;
                                        if (roomBroadcastModel2 != null && this.f11802o00Oo0 != null) {
                                            if (this.f11800o000OOo) {
                                                RoomConfiguration roomConfiguration = o000O00O.OooO().f32453OoooO0O;
                                                if (roomConfiguration != null && roomConfiguration.getBarid() != null && roomBroadcastModel2.getRoominfo() != null && String.valueOf(roomBroadcastModel2.getRoominfo().getId()).equals(roomConfiguration.getBarid()) && (roomBroadcastModel2.getType() == 14 || roomBroadcastModel2.getType() == 15)) {
                                                    GiftRoomModel giftRoomModel2 = new GiftRoomModel();
                                                    giftRoomModel2.giftid = NetworkInfo.ISP_OTHER;
                                                    giftRoomModel2.number = 1;
                                                    if (this.f11785OoooooO != null) {
                                                        Oooo000(giftRoomModel2);
                                                    }
                                                }
                                                this.f11802o00Oo0.OooO0OO(roomBroadcastModel2);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 10030:
                                                MixedRoomService mixedRoomService12 = this.f11782OooooOo;
                                                String str3 = (String) msg.obj;
                                                Objects.requireNonNull(mixedRoomService12);
                                                o00O00.OooO0OO("MixedRoomService", "renewChannelKey");
                                                o0O0o0 o0o0o2 = mixedRoomService12.f11845OoooO0;
                                                if (o0o0o2 != null) {
                                                    o0o0o2.OooOOoo(str3);
                                                }
                                                break;
                                            case 10031:
                                                oO0OO00o oo0oo00o10 = this.f11787o0000.f44386OooO0o;
                                                if (oo0oo00o10 != null) {
                                                    RoomLoginInformation.MIC lockResult = (RoomLoginInformation.MIC) msg.obj;
                                                    Intrinsics.checkNotNullParameter(lockResult, "lockResult");
                                                    oo0oo00o10.OooO0o0(lockResult.getOrder() - 1).OooO00o(true);
                                                    if (oo0oo00o10.f44932OooO0O0.f11791o000000o.f32552OooOO0o == lockResult.getOrder() - 1) {
                                                        oo0oo00o10.OooO0Oo(false);
                                                    }
                                                }
                                                break;
                                            case 10032:
                                                oO0OO00o oo0oo00o11 = this.f11787o0000.f44386OooO0o;
                                                if (oo0oo00o11 != null) {
                                                    RoomLoginInformation.MIC unLockResult = (RoomLoginInformation.MIC) msg.obj;
                                                    Intrinsics.checkNotNullParameter(unLockResult, "unLockResult");
                                                    oo0oo00o11.OooO0o0(unLockResult.getOrder() - 1).OooO00o(false);
                                                }
                                                break;
                                            default:
                                                switch (i) {
                                                    case 33001:
                                                        Oooo0o();
                                                        break;
                                                    case 33002:
                                                        oO00O0oO oo00o0oo = this.f11787o0000.f44388OooO0oO;
                                                        if (oo00o0oo != null) {
                                                            oo00o0oo.OooO0oO((RoomUserInfoModel) msg.obj);
                                                        }
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 100611:
                                                                int iIntValue = ((Integer) msg.obj).intValue();
                                                                if (iIntValue == 0) {
                                                                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Success);
                                                                    ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                                                                    if (((strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) ? (char) 1 : (char) 0) == 0) {
                                                                        o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                                                                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                                            o0o0oooOooO0O1.run();
                                                                        } else {
                                                                            p255o00ooO0O.o00O000 o00o002 = p255o00ooO0O.o00O000.f34368OooO00o;
                                                                            p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                                                                        }
                                                                    }
                                                                } else if (iIntValue == 1) {
                                                                    String strOooO0OO3 = o000O0O0.OooO0OO(R.string.error);
                                                                    ToastUtil toastUtil3 = ToastUtil.f12583OooO0O0;
                                                                    if (((strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3)) ? (char) 1 : (char) 0) == 0) {
                                                                        o0O0ooO o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, strOooO0OO3, "runnable");
                                                                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                                            o0o0oooOooO0O2.run();
                                                                        } else {
                                                                            p255o00ooO0O.o00O000 o00o003 = p255o00ooO0O.o00O000.f34368OooO00o;
                                                                            p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O2);
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case 100612:
                                                                final Room.InviteBarMemberToRequestReply inviteBarMemberToRequestReply = (Room.InviteBarMemberToRequestReply) msg.obj;
                                                                if (inviteBarMemberToRequestReply != null && !this.f11793o00000O0) {
                                                                    this.f11793o00000O0 = true;
                                                                    if (this.f11786Ooooooo == null) {
                                                                        this.f11786Ooooooo = new oo0oOO0(this);
                                                                    }
                                                                    this.f11786Ooooooo.OooOo0O(o000O0O0.OooO0OO(R.string.invited_to_member));
                                                                    this.f11786Ooooooo.OooOO0O(new Function0() { // from class: o00OoOO.OooOOO0
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            this.f32391Oooo.f11793o00000O0 = false;
                                                                            return null;
                                                                        }
                                                                    });
                                                                    this.f11786Ooooooo.OooOoO0(o000O0O0.OooO0OO(R.string.ignore));
                                                                    this.f11786Ooooooo.OooOo(new OooOO0O(this, 0));
                                                                    this.f11786Ooooooo.OooOOo0(o000O0O0.OooO0OO(R.string.Accept));
                                                                    this.f11786Ooooooo.OooOo0o(new Function0() { // from class: o00OoOO.o0OoOo0
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            Room.InviteBarMemberToRequestReply inviteBarMemberToRequestReply2 = inviteBarMemberToRequestReply;
                                                                            int i4 = MixedRoomActivity.f11779o0000O00;
                                                                            if (o000O00O.OooO().f32453OoooO0O == null) {
                                                                                return null;
                                                                            }
                                                                            o00O000.OooO().OooOOO(String.valueOf(inviteBarMemberToRequestReply2.getFromuser().getUserId()), o000O00O.OooO().f32453OoooO0O.getBaridx(), "1");
                                                                            LiveEventBus.get("JoinOrFollowRoom_Update").post(Boolean.TRUE);
                                                                            o00OO000.f43171OooO00o.OooOoO(false);
                                                                            return null;
                                                                        }
                                                                    });
                                                                    this.f11786Ooooooo.OooOOO0();
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                StringBuilder sbOooO0O5 = OooO00o.OooO00o.OooO0O0("Command not processed:");
                                                                sbOooO0O5.append(msg.what);
                                                                o00O00.OooO0oO(sbOooO0O5.toString());
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
                return;
            }
            o00O00.OooO0OO("RoomDialogDis", "dismiss 1383 ROOM_CANCEL_DIALOG_21001");
            OooOoo0();
        }
        StringBuilder sbOooO0O6 = OooO00o.OooO00o.OooO0O0("parseDoHandler  type : ");
        sbOooO0O6.append(msg.what);
        sbOooO0O6.append(" use time: ");
        sbOooO0O6.append(System.currentTimeMillis() - jCurrentTimeMillis);
        o00O00.OooO0OO("MixedRoomActivity", sbOooO0O6.toString());
    }

    public final void Oooo0() {
        oo0O oo0o = this.f11812o0OoOo0;
        if (oo0o != null) {
            Objects.requireNonNull(oo0o);
            oo0o.f44866OooO0OO = o000O00O.OooO().f32453OoooO0O;
            PasswordSettingDialog passwordSettingDialog = this.f11812o0OoOo0.f44864OooO00o;
            if (passwordSettingDialog != null) {
                passwordSettingDialog.dismiss();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x00c0  */
    public final void Oooo000(GiftRoomModel giftRoomModel) {
        boolean z;
        if (this.f11800o000OOo) {
            if (com.yalla.support.common.util.OooO0OO.OooO0O0(giftRoomModel.giftVideoUrl)) {
                RoomEffectGiftPlayer roomEffectGiftPlayer = this.f11794o00000OO;
                if (roomEffectGiftPlayer != null) {
                    roomEffectGiftPlayer.addEffectGift(giftRoomModel.giftid, giftRoomModel.number, giftRoomModel.giftVideoUrl);
                    return;
                }
                return;
            }
            if (com.yalla.support.common.util.OooO0OO.OooO0O0(giftRoomModel.customGiftInfo)) {
                RoomEffectGiftPlayer roomEffectGiftPlayer2 = this.f11794o00000OO;
                if (roomEffectGiftPlayer2 != null) {
                    roomEffectGiftPlayer2.addEffectGiftCustomMade(giftRoomModel.giftid, giftRoomModel.number, giftRoomModel.customGiftInfo);
                    return;
                }
                return;
            }
            int i = giftRoomModel.giftid;
            oo0O.OooO0OO oooO0OO = oo0O.OooO0OO.f53343OooO00o;
            GiftPropModel giftPropModelOooO0O0 = oooO0OO.OooO0O0(i);
            String videoUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getVideoUrl() : null;
            if (videoUrl == null || StringsKt.isBlank(videoUrl)) {
                z = ((((((((((i == 50 || i == 26) || i == 52) || i == 13) || i == 83) || i == 84) || i == 96) || i == 109) || i == 110) || i == 112) || i == 999) || i == 111;
            }
            if (z) {
                if (this.f11794o00000OO != null) {
                    GiftPropModel giftPropModelOooO0O1 = oooO0OO.OooO0O0(giftRoomModel.giftid);
                    this.f11794o00000OO.addEffectGift(giftRoomModel.giftid, giftRoomModel.number, giftPropModelOooO0O1 != null ? giftPropModelOooO0O1.getVideoUrl() : null);
                    return;
                }
                return;
            }
            if (giftRoomModel.isAddGiftRunway()) {
                GiftAnimationModel giftAnimationModel = new GiftAnimationModel();
                giftAnimationModel.setDataFromGiftRoomModel(giftRoomModel);
                oOo00OO0 ooo00oo0 = this.f11801o00O0O;
                if (ooo00oo0 != null) {
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("addGiftAnimation giftAnimationModel = ");
                    sbOooO0O0.append(giftAnimationModel.toJSONString());
                    o00O00.OooO0O0(sbOooO0O0.toString());
                    if (ooo00oo0.f44695OooO0Oo) {
                        ooo00oo0.f44694OooO0OO.OooO00o(giftAnimationModel);
                    } else {
                        ooo00oo0.f44693OooO0O0.OooO00o(giftAnimationModel);
                    }
                    ooo00oo0.f44695OooO0Oo = !ooo00oo0.f44695OooO0Oo;
                }
            }
        }
    }

    public final synchronized void Oooo00O() {
        this.f11817oo0o0Oo = true;
        TextView textView = this.f11803o00Ooo;
        if (textView != null) {
            textView.clearAnimation();
            this.f11803o00Ooo.setVisibility(8);
        }
        o0OO00O o0oo00o2 = this.f11813o0ooOO0;
        if (o0oo00o2 != null) {
            int count = o0oo00o2.getCount();
            this.f11805o00oO0O.setSelection(count == 0 ? 0 : count - 1);
        }
    }

    public final void Oooo00o(RoomUserInfoModel roomUserInfoModel) {
        oo00oO oo00oo = this.f11788o00000;
        if (oo00oo != null) {
            p151o00Oo0Oo.OooOo atMessage = new p151o00Oo0Oo.OooOo(roomUserInfoModel.getUserName(), roomUserInfoModel.getUserId());
            Objects.requireNonNull(oo00oo);
            Intrinsics.checkNotNullParameter(atMessage, "atMessage");
            oo00oo.OooO0O0();
            oo00oo.f32531OooO00o.OooO0o0(atMessage, true);
        }
    }

    public final void Oooo0O0(String str) {
        if (isFinishing()) {
            return;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(this);
        oo0ooo0.OooOo0O(str);
        oo0ooo0.OooO0oO(false);
        oo0ooo0.OooOO0O(new OooOO0(this, 0));
        oo0ooo0.OooOOO0();
    }

    public final void Oooo0OO(RoomUserInfoModel roomUserInfoModel, int i, int i2, int i3) {
        o0OoOoOo o0oooooo2 = this.f11818ooOO;
        if (o0oooooo2 != null) {
            o0oooooo2.OooO0O0(roomUserInfoModel, i, i2);
        }
    }

    public final synchronized void Oooo0o() {
        ArrayList arrayList = (ArrayList) o000O00O.OooO().f32458OoooOoO.clone();
        o0OO00O o0oo00o2 = this.f11813o0ooOO0;
        o0oo00o2.f31608OoooO00.clear();
        if (arrayList != null) {
            o0oo00o2.f31608OoooO00.addAll(arrayList);
        }
        this.f11813o0ooOO0.notifyDataSetChanged();
        if (this.f11817oo0o0Oo) {
            Oooo00O();
        } else {
            this.f11803o00Ooo.setVisibility(0);
            this.f11803o00Ooo.setText(R.string.chatline_new);
            if (!this.f11809o0OO00O) {
                this.f11809o0OO00O = true;
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
                alphaAnimation.setDuration(2500L);
                alphaAnimation.setAnimationListener(new o000(this));
                this.f11803o00Ooo.startAnimation(alphaAnimation);
            }
        }
    }

    public final void Oooo0o0() {
        PasswordSettingDialog passwordSettingDialog = this.f11783Oooooo;
        if (passwordSettingDialog != null) {
            passwordSettingDialog.dismiss();
        }
        o0000oo onConfirmClick = new o0000oo(this, 0);
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        showDialog((String) null, o00O0000.OooO0O0(64176246, true, new p140o00OOOo0.o00O0000(onConfirmClick)));
    }

    @Override // com.app.base.base.activity.Cocos2dxBaseActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        l lVar = this.f11797o00000oO;
        if (lVar != null) {
            lVar.OooOO0o().onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        oo00oO oo00oo = this.f11788o00000;
        boolean z = true;
        if (oo00oo != null) {
            p472o0Oooo0.o00O0000 value = oo00oo.f32531OooO00o.f44412OooO.getValue();
            if (value != null && value.OooO0o0()) {
                return;
            }
        }
        z7 z7Var = this.f11787o0000;
        Objects.requireNonNull(z7Var);
        o00OO000.OooOOO0 oooOOO0 = o00OO000.OooOOO0.f43286OooO00o;
        if (((Boolean) o00OO000.OooOOO0.f43289OooO0Oo.getValue()).booleanValue()) {
            oooOOO0.OooO0OO(false);
        } else {
            Iterator<b8> it = z7Var.f44383OooO0O0.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
            z = false;
        }
        if (z) {
            return;
        }
        oo0O oo0o = this.f11812o0OoOo0;
        if (oo0o == null) {
            super.onBackPressed();
            return;
        }
        if (oo0o.f44867OooO0Oo == null) {
            oo0o.f44867OooO0Oo = new p181o00o00.OooO0OO(oo0o.f44865OooO0O0);
        }
        oo0o.f44867OooO0Oo.f32174OoooO0 = new p561o0oOOoo0.o00OO(oo0o);
        MixedRoomActivity mixedRoomActivity = oo0o.f44865OooO0O0;
        if (mixedRoomActivity == null || mixedRoomActivity.isFinishing() || oo0o.f44865OooO0O0.isDestroyed()) {
            return;
        }
        oo0o.f44867OooO0Oo.show();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.tv_newmessage_tips) {
            Oooo00O();
        }
    }

    @Override // com.app.base.base.activity.Cocos2dxBaseActivity, com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        RoomTheme roomThemeOooO0O0;
        RoomModel roomModel;
        super.onCreate(bundle);
        this.f11785OoooooO = new o00OO.OooO0OO<>(this);
        getWindow().addFlags(128);
        int i = 0;
        oO0o0o.OooO0Oo(getWindow(), 0);
        setContentView(R.layout.activity_mixed_room);
        this.f11795o00000Oo = (LiveRoomVM) new ViewModelProvider(this).get(LiveRoomVM.class);
        this.f11796o00000o0 = (EventViewModel) new ViewModelProvider(this).get(EventViewModel.class);
        this.f11799o0000Ooo = (RoomMemberVM) new ViewModelProvider(this).get(RoomMemberVM.class);
        Intent intent = getIntent();
        if (intent != null && (roomModel = (RoomModel) intent.getSerializableExtra("room")) != null) {
            this.f11789o000000 = roomModel;
        }
        this.f11794o00000OO = new RoomEffectGiftPlayer(this);
        z7 z7Var = this.f11787o0000;
        ComposeView composeView = (ComposeView) z7Var.f44382OooO00o.findViewById(R.id.cv);
        x7 x7Var = x7.f44378OooO00o;
        composeView.setContent(x7.f44379OooO0O0);
        z7Var.f44388OooO0oO = new oO00O0oO(z7Var.f44382OooO00o);
        z7Var.f44386OooO0o = new oO0OO00o(z7Var.f44382OooO00o, z7Var);
        z7Var.f44387OooO0o0 = new oO00Oo0(z7Var.f44382OooO00o);
        int i2 = 1;
        ((ComposeView) z7Var.f44382OooO00o.findViewById(R.id.sideMainComposeView)).setContent(o00O0000.OooO0O0(1699523225, true, new y7(z7Var)));
        new RoomScreenShotManager(z7Var.f44382OooO00o);
        new o0oOOo(z7Var.f44382OooO00o);
        z7Var.f44385OooO0Oo = new o00O0O0O(z7Var.f44382OooO00o);
        new oO000OOo(z7Var.f44382OooO00o, z7Var.f44384OooO0OO);
        z7Var.f44389OooO0oo = new oO00OOOo(z7Var.f44382OooO00o);
        new oO0O00O(z7Var.f44382OooO00o);
        this.f11816oo000o = (FrameLayout) findViewById(R.id.v_room_root);
        RoomModel roomModel2 = this.f11789o000000;
        if (roomModel2 != null) {
            o00OO0O0.f43338OooooOo.OooO00o().f43355OooOOOo.postValue((roomModel2.getId() == 0 || (roomThemeOooO0O0 = p493o0o00O00.OooO0OO.OooO00o().OooOooo().OooO0O0(this.f11789o000000.getId())) == null) ? null : roomThemeOooO0O0.roomTheme);
        }
        this.f11812o0OoOo0 = new oo0O(this);
        this.f11801o00O0O = new oOo00OO0(this);
        this.f11802o00Oo0 = new oO000o00(this);
        this.f11805o00oO0O = (ListView) findViewById(R.id.list_charline);
        o0OO00O o0oo00o2 = new o0OO00O(this);
        this.f11813o0ooOO0 = o0oo00o2;
        o0oo00o2.f31613OoooOo0 = new Function4() { // from class: o00OoOO.o000000O
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                MixedRoomActivity mixedRoomActivity = this.f32426Oooo;
                int i3 = MixedRoomActivity.f11779o0000O00;
                Objects.requireNonNull(mixedRoomActivity);
                p608o0oo0O.OooOo.OooO0O0("102038");
                mixedRoomActivity.Oooo0OO((RoomUserInfoModel) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
                return null;
            }
        };
        o0oo00o2.f31614OoooOoO = new Function2() { // from class: o00OoOO.o000OOo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ProfileLimitModel next;
                final MixedRoomActivity mixedRoomActivity = this.f32483Oooo;
                final String str = (String) obj;
                final Boolean bool = (Boolean) obj2;
                int i3 = MixedRoomActivity.f11779o0000O00;
                Objects.requireNonNull(mixedRoomActivity);
                o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
                if (oooO00o.OooO00o().f43351OooOO0o.getValue() == null || oooO00o.OooO00o().f43351OooOO0o.getValue().getProfileLimit() == null) {
                    next = null;
                } else {
                    Iterator<ProfileLimitModel> it = oooO00o.OooO00o().f43351OooOO0o.getValue().getProfileLimit().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (next.getOperationType() == 3) {
                        }
                    }
                    next = null;
                }
                o00O000o.OooO00o(mixedRoomActivity, next, new Function0() { // from class: o00OoOO.Oooo0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        String str2 = str;
                        Boolean bool2 = bool;
                        int i4 = MixedRoomActivity.f11779o0000O00;
                        Objects.requireNonNull(mixedRoomActivity2);
                        Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
                        Observable observable = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
                        Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
                        observable.post(Boolean.TRUE);
                        Objects.requireNonNull(o0ooOOo.OooO0O0());
                        o0Oo0oo o0oo0oo2 = new o0Oo0oo(mixedRoomActivity2);
                        mixedRoomActivity2.f11814o0ooOOo = o0oo0oo2;
                        o0oo0oo2.OooOOO(str2, bool2);
                        mixedRoomActivity2.f11814o0ooOOo.show();
                        return null;
                    }
                });
                return null;
            }
        };
        this.f11805o00oO0O.setAdapter((ListAdapter) o0oo00o2);
        this.f11805o00oO0O.setOnScrollListener(this.f11808o0O0O00);
        this.f11805o00oO0O.setOnTouchListener(this.f11810o0OOO0o);
        o0OO00O o0oo00o3 = this.f11813o0ooOO0;
        o0oo00o3.f31609OoooO0O = new Function1() { // from class: o00OoOO.o0OO00O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = MixedRoomActivity.f11779o0000O00;
                LiveEventBus.get("QUERY_USER_IN_ROOM_INFORMATION").post(((ChatModel) obj).from);
                return null;
            }
        };
        o0oo00o3.f31606OoooO = new Function1() { // from class: o00OoOO.oo000o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MixedRoomActivity mixedRoomActivity = this.f32510Oooo;
                ChatModel chatModel = (ChatModel) obj;
                int i3 = MixedRoomActivity.f11779o0000O00;
                Objects.requireNonNull(mixedRoomActivity);
                if (chatModel.from.getUserId() == OooOOO.f41235OooO00o.OooOo().getValue().longValue()) {
                    return null;
                }
                mixedRoomActivity.Oooo00o(chatModel.from);
                return null;
            }
        };
        o0oo00o3.f31610OoooOO0 = new Function1() { // from class: o00OoOO.o00oO0o
            /* JADX WARN: Code duplicated, block: B:28:0x0079 A[EDGE_INSN: B:28:0x0079->B:29:0x007a BREAK  A[LOOP:0: B:19:0x0059->B:27:0x0077]] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ArrayList<ChatModel> arrayList;
                int i3;
                MixedRoomActivity mixedRoomActivity = this.f32497Oooo;
                int i4 = MixedRoomActivity.f11779o0000O00;
                Objects.requireNonNull(mixedRoomActivity);
                int iIntValue = ((Integer) obj).intValue();
                o0OO00O o0oo00o4 = mixedRoomActivity.f11813o0ooOO0;
                if (o0oo00o4 == null || (arrayList = o0oo00o4.f31608OoooO00) == null || arrayList.size() <= iIntValue || mixedRoomActivity.f11813o0ooOO0.f31608OoooO00.get(iIntValue) == null || mixedRoomActivity.f11813o0ooOO0.f31608OoooO00.get(iIntValue).replyInfo == null) {
                    return null;
                }
                RoomMessageReplyInfo roomMessageReplyInfo = mixedRoomActivity.f11813o0ooOO0.f31608OoooO00.get(iIntValue).replyInfo;
                ArrayList<ChatModel> arrayList2 = mixedRoomActivity.f11813o0ooOO0.f31608OoooO00;
                o000000 checkKey = o000000.f32425Oooo;
                Intrinsics.checkNotNullParameter(checkKey, "checkKey");
                if (arrayList2 != null) {
                    if (!(roomMessageReplyInfo == null)) {
                        Iterator<ChatModel> it = arrayList2.iterator();
                        i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i3 = -1;
                                break;
                            }
                            ChatModel next = it.next();
                            int i5 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (((Boolean) checkKey.invoke(roomMessageReplyInfo, next)).booleanValue()) {
                                break;
                            }
                            i3 = i5;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                } else {
                    i3 = -1;
                    break;
                }
                int count = mixedRoomActivity.f11813o0ooOO0.getCount();
                if (i3 < 0 || count <= i3) {
                    return null;
                }
                try {
                    mixedRoomActivity.f11813o0ooOO0.f31616Ooooo00 = i3;
                    mixedRoomActivity.f11805o00oO0O.smoothScrollToPosition(i3);
                    if (mixedRoomActivity.f11805o00oO0O.getFirstVisiblePosition() > i3) {
                        mixedRoomActivity.f11803o00Ooo.setVisibility(0);
                        mixedRoomActivity.f11803o00Ooo.setText(R.string.Room_chatline_Bottom);
                    } else {
                        mixedRoomActivity.f11813o0ooOO0.notifyDataSetChanged();
                    }
                    return null;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        };
        o0oo00o3.f31617o000oOoO = new Function2() { // from class: o00OoOO.o0O0O00
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                final MixedRoomActivity mixedRoomActivity = this.f32500Oooo;
                final ArrayList arrayList = (ArrayList) mixedRoomActivity.f11813o0ooOO0.f31608OoooO00.clone();
                final int iIntValue = ((Integer) obj).intValue();
                final boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Function0 onLogin = new Function0() { // from class: o00OoOO.o000oOoO
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        ArrayList arrayList2 = arrayList;
                        int i3 = iIntValue;
                        boolean z = zBooleanValue;
                        int i4 = MixedRoomActivity.f11779o0000O00;
                        Objects.requireNonNull(mixedRoomActivity2);
                        new r(mixedRoomActivity2, arrayList2, i3, o00OO0O0.f43338OooooOo.OooO00o().f43344OooO0Oo.getValue().longValue(), z);
                        return null;
                    }
                };
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return null;
                }
                Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                if (activityOooO0O0 == null) {
                    return null;
                }
                o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                return null;
            }
        };
        o0oo00o3.f31611OoooOOO = new Function1() { // from class: o00OoOO.o00Oo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EventModel model = this.f32495Oooo.f11813o0ooOO0.f31608OoooO00.get(((Integer) obj).intValue()).eventModel;
                Intrinsics.checkNotNullParameter(model, "model");
                Bundle bundleOooO00o = OooO0OO.OooO00o();
                bundleOooO00o.putSerializable("key", model);
                o000O.OooO00o(EventDetailScreen.f24587OooO00o, bundleOooO00o);
                return null;
            }
        };
        o0oo00o3.f31612OoooOOo = new Function1() { // from class: o00OoOO.o00Ooo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final MixedRoomActivity mixedRoomActivity = this.f32496Oooo;
                final Integer num = (Integer) obj;
                int i3 = MixedRoomActivity.f11779o0000O00;
                Objects.requireNonNull(mixedRoomActivity);
                Function0 onLogin = new Function0() { // from class: o00OoOO.Oooo000
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        final MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                        final EventModel eventModel = mixedRoomActivity2.f11813o0ooOO0.f31608OoooO00.get(num.intValue()).eventModel;
                        if (!eventModel.getHasSubscribe()) {
                            mixedRoomActivity2.f11796o00000o0.subscribeEvent(eventModel, new Function1() { // from class: o00OoOO.o0ooOOo
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    MixedRoomActivity mixedRoomActivity3 = mixedRoomActivity2;
                                    EventModel eventModel2 = eventModel;
                                    int i4 = MixedRoomActivity.f11779o0000O00;
                                    Objects.requireNonNull(mixedRoomActivity3);
                                    eventModel2.setHasSubscribe(((Boolean) obj2).booleanValue());
                                    mixedRoomActivity3.f11813o0ooOO0.notifyDataSetChanged();
                                    return null;
                                }
                            });
                            return null;
                        }
                        oo0oOO0 oo0ooo0 = new oo0oOO0(mixedRoomActivity2);
                        oo0ooo0.OooOo0O(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.event_unSubscribe_content));
                        oo0ooo0.OooOoO();
                        oo0ooo0.OooOOOo(R.string.event_unSubscribe_confirm);
                        oo0ooo0.OooOo0o(new o0000O(mixedRoomActivity2, eventModel));
                        oo0ooo0.OooOOO0();
                        return null;
                    }
                };
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return null;
                }
                Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                if (activityOooO0O0 == null) {
                    return null;
                }
                o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                return null;
            }
        };
        Oooo0o();
        TextView textView = (TextView) findViewById(R.id.tv_newmessage_tips);
        this.f11803o00Ooo = textView;
        textView.setOnClickListener(this);
        this.f11807o00ooo = (BubbleView) findViewById(R.id.bubbleView);
        this.f11806o00oO0o = new n3(this);
        LiveEventBus.get("HideKeyboard").observe(this, new o0000O0O(this));
        o00OO000 o00oo001 = o00OO000.f43171OooO00o;
        o00OO000.f43201Oooo.observe(this, new p143o00OOooO.o00000OO(this, i2));
        o00OO000.f43214OoooO00.observe(this, new oo000o(this, i2));
        o00OO0O0 o00oo0o0OooO00o = o00OO0O0.f43338OooooOo.OooO00o();
        this.f11790o000000O = new o00OO(this, o00oo0o0OooO00o);
        this.f11791o000000o = new o00O00OO(this, o00oo0o0OooO00o);
        this.f11788o00000 = new oo00oO(this, findViewById(R.id.layout_mixedroom_bottom), this.f11787o0000.f44389OooO0oo);
        o00oo0o0OooO00o.f43350OooOO0O.observe(this, new p160o00OoOO.o00000OO(this, i));
        o00oo0o0OooO00o.f43351OooOO0o.observe(this, new o000O0o(this));
        o00oo0o0OooO00o.f43369OooOooO.observe(this, new p160o00OoOO.o000Oo0(this));
        String strOooO00o = p169o00Ooo0.oo000o.OooO00o();
        if (strOooO00o != null) {
            strOooO00o.toLowerCase();
        }
        Intent intent2 = new Intent(this, (Class<?>) MixedRoomService.class);
        this.f11780OooooO0 = intent2;
        this.f11781OooooOO = new OooO0OO();
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent2);
        } else {
            startService(intent2);
        }
        bindService(this.f11780OooooO0, this.f11781OooooOO, 1);
        oO0OO00o oo0oo00o = this.f11787o0000.f44386OooO0o;
        if (oo0oo00o != null) {
            oo0oo00o.OooO0oO(true);
        }
        Oooo0();
        if (o000O00O.OooO().f32459OoooOoo) {
            this.f11785OoooooO.obtainMessage(2025).sendToTarget();
            return;
        }
        o000O00O.OooO().f32459OoooOoo = false;
        setVolumeControlStream(0);
        if ("Meizu".equals(Build.BRAND)) {
            getWindow().getDecorView().setSystemUiVisibility(2);
        }
        p034OoooO0O.o0Oo0oo.OooO0o0(575, null);
        LiveEventBus.get("LuckyNumberOpenDialog", Integer.class).observe(this, new p044OooooOO.o00O000(this, i2));
        LiveEventBus.get("ROOM_CHAT_REPLY", ChatModel.class).observe(this, new p160o00OoOO.o00000O(this, i));
        LiveEventBus.get("LOGIN_REENTER_ROOM").observe(this, new o0000(this, i));
        LiveEventBus.get("Close_RoomUI").observe(this, new p160o00OoOO.o0000Ooo(this, i));
        LiveEventBus.get("Disconnect_Room").observe(this, new p143o00OOooO.o000(this, i2));
        LiveEventBus.get("ROOM_COIN_NOT_ENOUGH").observe(this, new p143o00OOooO.o0000OO0(this, i2));
        LiveEventBus.get("ROOM_MEMBER_LEVEL_UPGRADE", Pair.class).observe(this, new Observer() { // from class: o00OoOO.o0000O00
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Pair<String, String> pair = (Pair) obj;
                int i3 = MixedRoomActivity.f11779o0000O00;
                if (pair != null) {
                    o00OO000 o00oo002 = o00OO000.f43171OooO00o;
                    o00OO000.f43194OooOoO.setValue(pair);
                }
            }
        });
        LiveEventBus.get("QuickRechargeDialogFromMagicCardDialog").observe(this, new p143o00OOooO.o000Oo0(this, i2));
        LiveEventBus.get("QuickRechargeDialogFromRoomGiftSendDialog").observe(this, new p143o00OOooO.o000O000(this, i2));
    }

    @Override // com.app.base.base.activity.Cocos2dxBaseActivity, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        oO000Oo0 oo000oo0;
        super.onDestroy();
        OooOoo0();
        o00OO o00oo2 = this.f11790o000000O;
        if (o00oo2 != null) {
            o00oo2.f32564OooO0OO = null;
        }
        o0OO00O o0oo00o2 = this.f11813o0ooOO0;
        if (o0oo00o2 != null && (oo000oo0 = ((Oooo0) o0oo00o2.f31607OoooO0.getValue()).f31429OooO0OO) != null && oo000oo0.isShowing()) {
            oo000oo0.dismiss();
        }
        z7 z7Var = this.f11787o0000;
        if (z7Var != null) {
            RoomStateManager.INSTANCE.getRoomState();
            RoomState roomState = RoomState.Hook;
            Iterator<b8> it = z7Var.f44383OooO0O0.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
        }
        RoomStateManager roomStateManager = RoomStateManager.INSTANCE;
        if (roomStateManager.getRoomState() != RoomState.Close) {
            roomStateManager.hookRoom();
        }
        System.gc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, p141o00OOOoO.OooO0o
    public final void onEventMainThread(p141o00OOOoO.OooO0OO msg) {
        p189o00o00o0.OooO0OO<RoomLoginInformation.MIC> oooO0OO;
        GiftAnimationModel giftAnimationModel;
        super.onEventMainThread(msg);
        int i = msg.f31906OooO00o;
        if (i == 33) {
            try {
                T t = msg.f31908OooO0OO;
                if (t != 0) {
                    o000O00O.OooO().Oooo0O0((RoomConfiguration) t, o00OO0O0.f43338OooooOo.OooO00o().f43349OooOO0.getValue());
                }
                Oooo0();
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (i == 106) {
            MixedRoomService mixedRoomService = this.f11782OooooOo;
            if (mixedRoomService != null) {
                mixedRoomService.f11846OoooO00.OooO0o(10010, com.android.billingclient.api.o0Oo0oo.OooO0Oo((ForwardingRedPacketModel) msg.f31908OooO0OO));
                return;
            }
            return;
        }
        if (i == 113) {
            MixedRoomService mixedRoomService2 = this.f11782OooooOo;
            if (mixedRoomService2 != null) {
                mixedRoomService2.f11846OoooO00.OooO0o(10051, "");
                return;
            }
            return;
        }
        if (i == 152) {
            oO0OO00o oo0oo00o = this.f11787o0000.f44386OooO0o;
            if (oo0oo00o != null) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                MixedRoomService mixedRoomService3 = oo0oo00o.f44936OooO0o0;
                if (mixedRoomService3 != null) {
                    Intrinsics.checkNotNull(mixedRoomService3);
                    if (mixedRoomService3.f11845OoooO0 != null) {
                        MixedRoomService mixedRoomService4 = oo0oo00o.f44936OooO0o0;
                        Intrinsics.checkNotNull(mixedRoomService4);
                        if (!mixedRoomService4.f11845OoooO0.OooOOo(o000O00O.OooO().f32451OoooO0.getRoom().getId())) {
                            String simpleName = oo0oo00o.f44372OooO00o.getClass().getSimpleName();
                            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("EVENTMSG_ROOM_SHUTUP:userID=>");
                            sbOooO0O0.append(msg.f31908OooO0OO);
                            sbOooO0O0.append(",语音未登录屏蔽指定声音被取消");
                            o00O00.OooO0oo(simpleName, sbOooO0O0.toString());
                            return;
                        }
                        T t2 = msg.f31908OooO0OO;
                        Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type kotlin.Long");
                        long jLongValue = ((Long) t2).longValue();
                        int iOooOOO = o000O00O.OooO().OooOOO(jLongValue);
                        RoomLoginInformation.MIC mic = o000O00O.OooO().f32455OoooOOO.get(iOooOOO);
                        mic.setMuteSound(!mic.isMuteSound());
                        MixedRoomMicView mixedRoomMicViewOooO0o0 = oo0oo00o.OooO0o0(iOooOOO);
                        if (mic.isMuteSound()) {
                            mixedRoomMicViewOooO0o0.f11838o000oOoO.setImageResource(R.drawable.icon_room_mic_mute);
                        } else {
                            mixedRoomMicViewOooO0o0.f11838o000oOoO.setImageResource(0);
                        }
                        if (Intrinsics.areEqual(o00OO0O0.f43338OooooOo.OooO00o().f43358OooOOoo.getValue(), Boolean.FALSE)) {
                            MixedRoomService mixedRoomService5 = oo0oo00o.f44936OooO0o0;
                            Intrinsics.checkNotNull(mixedRoomService5);
                            mixedRoomService5.f11845OoooO0.OooOo00(oOO00O.OooO0o0(Long.valueOf(jLongValue)), mic.isMuteSound());
                        }
                        HashMap<Long, Boolean> mapOooOO0O = o000O00O.OooO().OooOO0O();
                        Intrinsics.checkNotNullExpressionValue(mapOooOO0O, "getInstance().muteSoundMap");
                        mapOooOO0O.put(Long.valueOf(jLongValue), Boolean.valueOf(mic.isMuteSound()));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == 154) {
            RoomModel roomModel = (RoomModel) msg.f31908OooO0OO;
            if (roomModel == null) {
                return;
            }
            if (o000O00O.OooO().f32453OoooO0O != null && !TextUtils.isEmpty(o000O00O.OooO().f32453OoooO0O.getBarid())) {
                if (o000O00O.OooO().f32453OoooO0O.getBarid().equals(roomModel.getId() + "")) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.you_are_already_in_the_room);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                        return;
                    }
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                        return;
                    } else {
                        p255o00ooO0O.o00O000 o00o001 = p255o00ooO0O.o00O000.f34368OooO00o;
                        p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        return;
                    }
                }
            }
            OooOooO(roomModel);
            String roomId = roomModel.getId() + "";
            EnterRoomParentPage sourcePage = EnterRoomParentPage.lnroom_Broadcast;
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oo0o0O0(roomId, sourcePage, null), 3, null);
            return;
        }
        if (i == 552) {
            if (msg.f31907OooO0O0 == 0) {
                String strOooO0OO2 = o000O0O0.OooO0OO(R.string.send_successfully);
                ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                if (strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O1.run();
                    return;
                } else {
                    p255o00ooO0O.o00O000 o00o002 = p255o00ooO0O.o00O000.f34368OooO00o;
                    p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                    return;
                }
            }
            String strOooO0OO3 = o000O0O0.OooO0OO(R.string.Added_successfully);
            ToastUtil toastUtil3 = ToastUtil.f12583OooO0O0;
            if (strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3)) {
                return;
            }
            o0O0ooO o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, strOooO0OO3, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O2.run();
                return;
            } else {
                p255o00ooO0O.o00O000 o00o003 = p255o00ooO0O.o00O000.f34368OooO00o;
                p255o00ooO0O.o00O000.f34370OooO0OO.post(o0o0oooOooO0O2);
                return;
            }
        }
        if (i == 2050) {
            OooOooo((Message) msg.f31908OooO0OO);
            return;
        }
        if (i == 173) {
            oO0OO00o oo0oo00o2 = this.f11787o0000.f44386OooO0o;
            if (oo0oo00o2 == null || (oooO0OO = oo0oo00o2.f44935OooO0o) == null) {
                return;
            }
            Intrinsics.checkNotNull(oooO0OO);
            if (oooO0OO.getData().size() > 0) {
                p189o00o00o0.OooO0OO<RoomLoginInformation.MIC> oooO0OO2 = oo0oo00o2.f44935OooO0o;
                Intrinsics.checkNotNull(oooO0OO2);
                int size = oooO0OO2.getData().size();
                for (int i2 = 0; i2 < size; i2++) {
                    p189o00o00o0.OooO0OO<RoomLoginInformation.MIC> oooO0OO3 = oo0oo00o2.f44935OooO0o;
                    Intrinsics.checkNotNull(oooO0OO3);
                    RoomLoginInformation.MIC mic2 = oooO0OO3.getData().get(i2);
                    if ((mic2 != null ? mic2.user : null) != null) {
                        long userId = mic2.user.getUserId();
                        Long value = OooOOO.f41235OooO00o.OooOo().getValue();
                        if (value != null && userId == value.longValue()) {
                            MixedRoomMicView mixedRoomMicViewOooO0o1 = oo0oo00o2.OooO0o0(i2);
                            Boolean value2 = o00OO0O0.f43338OooooOo.OooO00o().f43361OooOo00.getValue();
                            Intrinsics.checkNotNull(value2);
                            if (value2.booleanValue()) {
                                mixedRoomMicViewOooO0o1.f11838o000oOoO.setImageResource(R.drawable.icon_room_bottom_mic_top_off);
                                return;
                            } else {
                                mixedRoomMicViewOooO0o1.f11838o000oOoO.setImageResource(0);
                                return;
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i == 174) {
            T t3 = msg.f31908OooO0OO;
            if (t3 != 0) {
                o00OO0O0.f43338OooooOo.OooO00o().f43391OoooOoo.postValue((RoomUserInfoModel) t3);
                return;
            }
            return;
        }
        if (i == 501) {
            o00O00.OooO0O0("贵族开通续费 广播***************");
            RoomBroadcastModel roomBroadcastModel = new RoomBroadcastModel();
            roomBroadcastModel.setNobleData(13, new RoomBroadcastOpenNobleDataModel().initTestData(1));
            oO000o00 oo000o00 = this.f11802o00Oo0;
            if (oo000o00 == null || !this.f11800o000OOo) {
                return;
            }
            oo000o00.OooO0OO(roomBroadcastModel);
            return;
        }
        if (i == 502) {
            o00O00.OooO0O0("贵族发送 广播喇叭 ***************");
            RoomBroadcastModel roomBroadcastModel2 = new RoomBroadcastModel();
            roomBroadcastModel2.setTextData(9, "贵族发送 广播喇叭 ***************");
            oO000o00 oo000o01 = this.f11802o00Oo0;
            if (oo000o01 == null || !this.f11800o000OOo) {
                return;
            }
            oo000o01.OooO0OO(roomBroadcastModel2);
            return;
        }
        if (i == 567) {
            T t4 = msg.f31908OooO0OO;
            if (!(t4 instanceof GiftAnimationModel) || (giftAnimationModel = (GiftAnimationModel) t4) == null) {
                return;
            }
            boolean zIsLuckyflag = giftAnimationModel.isLuckyflag();
            boolean zHasFirstLuckyLevel = giftAnimationModel.hasFirstLuckyLevel();
            String str = giftAnimationModel.fromUserId;
            long j = giftAnimationModel.luckymoney;
            long j2 = giftAnimationModel.luckymultiple;
            if (zIsLuckyflag && zHasFirstLuckyLevel && String.valueOf(OooOOO.f41235OooO00o.OooOo().getValue()).equals(str)) {
                Objects.requireNonNull(o0ooOOo.OooO0O0());
                o000O00 o000o01 = new o000O00(this);
                String string = getString(R.string.lucky_gift_congratulation_content);
                TextView textView = o000o01.f31798OoooOOO;
                if (textView != null) {
                    textView.setText(string);
                    o000o01.f31798OoooOOO.setVisibility(0);
                }
                String strOooO00o = androidx.viewpager2.adapter.OooO00o.OooO00o("", j);
                TextView textView2 = o000o01.f31800OoooOo0;
                if (textView2 != null) {
                    textView2.setText(strOooO00o);
                    o000o01.f31800OoooOo0.setVisibility(0);
                }
                String strOooO00o2 = androidx.viewpager2.adapter.OooO00o.OooO00o("", j2);
                if (o000o01.f31799OoooOOo != null && !com.yalla.support.common.util.OooO0OO.OooO00o(strOooO00o2)) {
                    o000o01.f31799OoooOOo.setText(OooOo.OooO00o(o000o01.OooO0oO(R.string.lucky_gift_dialog_xxx_times_reward), strOooO00o2));
                    o000o01.f31799OoooOOo.setVisibility(0);
                }
                o000o01.show();
                return;
            }
            return;
        }
        if (i == 568) {
            o00O000.OooO().OooOO0O();
            return;
        }
        switch (i) {
            case 101:
                if (this.f11782OooooOo != null) {
                    BaseMicModel baseMicModel = new BaseMicModel();
                    baseMicModel.to = Integer.parseInt((String) msg.f31908OooO0OO);
                    this.f11782OooooOo.f11846OoooO00.OooO0o(10017, com.android.billingclient.api.o0Oo0oo.OooO0Oo(baseMicModel));
                }
                break;
            case 102:
                if (this.f11782OooooOo != null) {
                    ShutUpModel shutUpModel = new ShutUpModel();
                    shutUpModel.to = Integer.parseInt((String) msg.f31908OooO0OO);
                    shutUpModel.silence = msg.f31907OooO0O0;
                    this.f11782OooooOo.f11846OoooO00.OooO0o(10006, com.android.billingclient.api.o0Oo0oo.OooO0Oo(shutUpModel));
                }
                break;
            case 103:
                if (this.f11782OooooOo != null) {
                    BaseMicModel baseMicModel2 = new BaseMicModel();
                    baseMicModel2.to = Integer.parseInt((String) msg.f31908OooO0OO);
                    this.f11782OooooOo.f11846OoooO00.OooO0o(10008, com.android.billingclient.api.o0Oo0oo.OooO0Oo(baseMicModel2));
                }
                break;
            default:
                switch (i) {
                    case 163:
                        Oooo00O();
                        break;
                    case 164:
                        oO0OO00o oo0oo00o3 = this.f11787o0000.f44386OooO0o;
                        if (oo0oo00o3 != null) {
                            Intrinsics.checkNotNullParameter(msg, "msg");
                            T t5 = msg.f31908OooO0OO;
                            if (t5 != 0) {
                                Intrinsics.checkNotNull(t5, "null cannot be cast to non-null type kotlin.Pair<kotlin.Long, kotlin.Int>");
                                Pair pair = (Pair) t5;
                                long jLongValue2 = ((Number) pair.component1()).longValue();
                                int iIntValue = ((Number) pair.component2()).intValue();
                                int iOooOOO2 = o000O00O.OooO().OooOOO(jLongValue2);
                                if (iOooOOO2 > -1) {
                                    MixedRoomMicView mixedRoomMicViewOooO0o2 = oo0oo00o3.OooO0o0(iOooOOO2);
                                    if (mixedRoomMicViewOooO0o2.f11825OoooO0 == 2) {
                                        mixedRoomMicViewOooO0o2.f11833OoooOoo.OooO0OO(iIntValue, false, false);
                                    }
                                }
                            }
                        }
                        break;
                    case 165:
                        Oooo0();
                        break;
                }
                break;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        RoomModel roomModel = (RoomModel) intent.getSerializableExtra("room");
        if (roomModel == null) {
            return;
        }
        OooOooO(roomModel);
    }

    @Override // com.app.base.base.activity.Cocos2dxBaseActivity, com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        PasswordSettingDialog passwordSettingDialog;
        super.onPause();
        this.f11800o000OOo = false;
        PasswordSettingDialog passwordSettingDialog2 = this.f11783Oooooo;
        if (passwordSettingDialog2 != null && passwordSettingDialog2.isShowing()) {
            EditText editText = this.f11783Oooooo.f11500Ooooo0o;
            p140o00OOOo0.o0OOO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText, "view.context"), new Handler()));
        }
        oo0O oo0o = this.f11812o0OoOo0;
        if (oo0o != null && (passwordSettingDialog = oo0o.f44864OooO00o) != null && passwordSettingDialog.isShowing()) {
            EditText editText2 = this.f11812o0OoOo0.f44864OooO00o.f11500Ooooo0o;
            p140o00OOOo0.o0OOO0o.OooO00o(editText2, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText2, "view.context"), new Handler()));
        }
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("");
        sbOooO0O0.append(this.f11483OoooOoO);
        o0O00000.OooO0o0("InRoom_stay", sbOooO0O0.toString());
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        RoomModel roomModel = (RoomModel) bundle.getSerializable("roommodel");
        if (roomModel != null) {
            this.f11789o000000 = roomModel;
            RoomStateManager.INSTANCE.enterRoom(roomModel, (EnterRoomParentPage) null);
        }
    }

    @Override // com.app.base.base.activity.Cocos2dxBaseActivity, com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        PasswordSettingDialog passwordSettingDialog;
        super.onResume();
        Observable<Object> observable = LiveEventBus.get("LuckyPacket_Show_MixedRoomActivityOnResume");
        Boolean bool = Boolean.TRUE;
        observable.post(bool);
        PasswordSettingDialog passwordSettingDialog2 = this.f11783Oooooo;
        if (passwordSettingDialog2 != null && passwordSettingDialog2.isShowing()) {
            EditText view = this.f11783Oooooo.f11500Ooooo0o;
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = p472o0Oooo0.o00O000.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(o000O0Oo.OooO0O0(view, "view.context"), new Handler()));
        }
        this.f11800o000OOo = true;
        n3 n3Var = this.f11806o00oO0o;
        if (n3Var != null) {
            n3Var.f47205OooO0oo = true;
        }
        oo0O oo0o = this.f11812o0OoOo0;
        if (oo0o != null && (passwordSettingDialog = oo0o.f44864OooO00o) != null && passwordSettingDialog.isShowing()) {
            EditText editText = this.f11812o0OoOo0.f44864OooO00o.f11500Ooooo0o;
            p140o00OOOo0.o0OOO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO0O0(editText, "view.context"), new Handler()));
        }
        Intrinsics.checkNotNullParameter("HIDE_KEYBOARD", "key");
        Observable observable2 = LiveEventBus.get("roomHIDE_KEYBOARD", Object.class);
        Intrinsics.checkNotNullExpressionValue(observable2, "get(\"room$key\", Any::class.java)");
        observable2.post(bool);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("roommodel", this.f11789o000000);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        n3 n3Var = this.f11806o00oO0o;
        if (n3Var != null) {
            n3Var.f47205OooO0oo = false;
            Objects.requireNonNull(n3Var);
        }
    }
}
