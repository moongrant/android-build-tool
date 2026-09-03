package com.yalla.yalla.ui.activity.room.live.side;

import Oooo000.o000OOo;
import Oooo000.o00Oo0;
import Oooo000.o00Ooo;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.app.base.fragment.ContributionFragment;
import com.app.base.mixedroom.MixedRoomActivity;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.data.constant.TurntableGameState;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o00000O0.o0OO00O;
import o0000O0.OooO0o;
import o0000OO.OooOO0O;
import o0000OO.Oooo000;
import o0000OO.o00000O0;
import o0000OO.o0O0O00;
import o00OO0O0.o0OOO0o;
import o0O0O00.o000000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000O00;
import p031OoooO.o000O0O0;
import p031OoooO.oo0o0Oo;
import p043OooooO0.o00O0000;
import p044OooooOO.o00O00O;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p255o00ooO0O.o00000O;
import p255o00ooO0O.o000O0o;
import p490o0o000oo.o0Oo0oo;
import p500o0o00Oo0.OooOOO;
import p509o0o00oOO.o0000O0;
import p512o0o00oo0.o0oO0O0o;
import p517o0o0O00.o00O00;
import p518o0o0O000.o00000OO;
import p524o0o0O0o.o00O000o;
import p525o0o0O0o0.o0O0o;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;
import p560o0oOOoo.o00O0OO0;
import p560o0oOOoo.o0O00OOO;
import p560o0oOOoo.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class RoomTurntableGameManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final RoomTurntableGameManager f23162OooO00o = new RoomTurntableGameManager();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<BaseWebView> f23164OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f23165OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f23166OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23167OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f23168OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23169OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ int f23170OoooOOo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<String> f23171o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, String str2, o0O00O<Boolean> o0o00o2, o0O00O<BaseWebView> o0o00o3, MixedRoomActivity mixedRoomActivity, o0O00O<String> o0o00o4, o0O00O<Boolean> o0o00o5, int i) {
            super(2);
            this.f23166OoooO00 = str;
            this.f23165OoooO0 = str2;
            this.f23167OoooO0O = o0o00o2;
            this.f23164OoooO = o0o00o3;
            this.f23168OoooOO0 = mixedRoomActivity;
            this.f23171o000oOoO = o0o00o4;
            this.f23169OoooOOO = o0o00o5;
            this.f23170OoooOOo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            RoomTurntableGameManager.this.OooO0O0(this.f23166OoooO00, this.f23165OoooO0, this.f23167OoooO0O, this.f23164OoooO, this.f23168OoooOO0, this.f23171o000oOoO, this.f23169OoooOOO, ooo00o, this.f23170OoooOOo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<BaseWebView> f23172Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O<String> f23173OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00O<BaseWebView> o0o00o2, o0O00O<String> o0o00o3) {
            super(1);
            this.f23172Oooo = o0o00o2;
            this.f23173OoooO00 = o0o00o3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0O00OOO(this.f23172Oooo, this.f23173OoooO00);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<o00Ooo, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23174Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23175OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f23176OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O<BaseWebView> f23177OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00O<String> f23178OoooO0O;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TurntableGameState.values().length];
                iArr[TurntableGameState.Setting.ordinal()] = 1;
                iArr[TurntableGameState.Wait.ordinal()] = 2;
                iArr[TurntableGameState.Start.ordinal()] = 3;
                iArr[TurntableGameState.Close.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O00O<Boolean> o0o00o2, o0O00O<BaseWebView> o0o00o3, MixedRoomActivity mixedRoomActivity, o0O00O<String> o0o00o4, o0O00O<Boolean> o0o00o5) {
            super(3);
            this.f23174Oooo = o0o00o2;
            this.f23177OoooO00 = o0o00o3;
            this.f23176OoooO0 = mixedRoomActivity;
            this.f23178OoooO0O = o0o00o4;
            this.f23175OoooO = o0o00o5;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x006b  */
        /* JADX WARN: Code duplicated, block: B:20:0x006f  */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00Ooo o00ooo2, oOO00O ooo00o, Integer num) {
            String strOooO00o;
            String str;
            String str2;
            o00Ooo AnimatedVisibility = o00ooo2;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            int i = OooO00o.$EnumSwitchMapping$0[o00OO000.OooOOO0.f43286OooO00o.OooO00o().ordinal()];
            String str3 = null;
            String str4 = "svga/room_turntable_wait.svga";
            if (i == 1) {
                strOooO00o = o00O0OO0.OooO00o(ooo00o2, -1101861869, R.string.room_game_box_lucky_wheel, ooo00o2);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ooo00o2.OooO0o0(-1101861215);
                            ooo00o2.Oooo0o0();
                        } else {
                            ooo00o2.OooO0o0(-1101861248);
                            ooo00o2.Oooo0o0();
                        }
                        str = null;
                    } else {
                        strOooO00o = o00O0OO0.OooO00o(ooo00o2, -1101861450, R.string.Playing, ooo00o2);
                        str4 = "svga/room_turntable_start.svga";
                    }
                    RoomTurntableGameManager roomTurntableGameManager = RoomTurntableGameManager.f23162OooO00o;
                    if (str3 == null) {
                        str2 = "";
                    } else {
                        str2 = str3;
                    }
                    roomTurntableGameManager.OooO0O0(str, str2, this.f23174Oooo, this.f23177OoooO00, this.f23176OoooO0, this.f23178OoooO0O, this.f23175OoooO, ooo00o2, 14388608);
                    return Unit.INSTANCE;
                }
                strOooO00o = o00O0OO0.OooO00o(ooo00o2, -1101861651, R.string.Waiting, ooo00o2);
            }
            str3 = strOooO00o;
            str = str4;
            RoomTurntableGameManager roomTurntableGameManager2 = RoomTurntableGameManager.f23162OooO00o;
            if (str3 == null) {
                str2 = "";
            } else {
                str2 = str3;
            }
            roomTurntableGameManager2.OooO0O0(str, str2, this.f23174Oooo, this.f23177OoooO00, this.f23176OoooO0, this.f23178OoooO0O, this.f23175OoooO, ooo00o2, 14388608);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f23180OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f23180OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            RoomTurntableGameManager.this.OooO00o(ooo00o, this.f23180OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f23182OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f23182OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            RoomTurntableGameManager.this.OooO00o(ooo00o, this.f23182OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23183Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23184OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f23185OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00O<BaseWebView> f23186OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00O<String> f23187OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0O00O<Boolean> o0o00o2, o0O00O<BaseWebView> o0o00o3, MixedRoomActivity mixedRoomActivity, o0O00O<String> o0o00o4, o0O00O<Boolean> o0o00o5) {
            super(0);
            this.f23183Oooo = o0o00o2;
            this.f23186OoooO00 = o0o00o3;
            this.f23185OoooO0 = mixedRoomActivity;
            this.f23187OoooO0O = o0o00o4;
            this.f23184OoooO = o0o00o5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.ui.activity.room.live.side.OooO00o onLogin = new com.yalla.yalla.ui.activity.room.live.side.OooO00o(this.f23183Oooo, this.f23186OoooO00, this.f23185OoooO0, this.f23187OoooO0O, this.f23184OoooO);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21771Oooooo0;
                    o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooOO0O f23188Oooo = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0O0O00.OooO00o.OooO00o(constrainAs.f27382OooO0o0, constrainAs.f27379OooO0OO.f27386OooO0OO, 6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27380OooO0Oo, constrainAs.f27379OooO0OO.f27385OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27381OooO0o, constrainAs.f27379OooO0OO.f27387OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23189Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o0000OO.OooOO0O oooOO0O) {
            super(1);
            this.f23189Oooo = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0O0O00.OooO00o.OooO00o(constrainAs.f27382OooO0o0, this.f23189Oooo.f27386OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27380OooO0Oo, this.f23189Oooo.f27385OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27381OooO0o, this.f23189Oooo.f27387OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0O0O00.OooO00o.OooO00o(constrainAs.f27383OooO0oO, this.f23189Oooo.f27388OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23190Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0000OO.OooOO0O oooOO0O) {
            super(1);
            this.f23190Oooo = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0O0O00.OooO00o.OooO00o(constrainAs.f27382OooO0o0, this.f23190Oooo.f27388OooO0o0, 4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27380OooO0Oo, constrainAs.f27379OooO0OO.f27385OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27381OooO0o, constrainAs.f27379OooO0OO.f27387OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<BaseWebView> f23192OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f23193OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f23194OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23195OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f23196OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23197OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ int f23198OoooOOo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<String> f23199o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(String str, String str2, o0O00O<Boolean> o0o00o2, o0O00O<BaseWebView> o0o00o3, MixedRoomActivity mixedRoomActivity, o0O00O<String> o0o00o4, o0O00O<Boolean> o0o00o5, int i) {
            super(2);
            this.f23194OoooO00 = str;
            this.f23193OoooO0 = str2;
            this.f23195OoooO0O = o0o00o2;
            this.f23192OoooO = o0o00o3;
            this.f23196OoooOO0 = mixedRoomActivity;
            this.f23199o000oOoO = o0o00o4;
            this.f23197OoooOOO = o0o00o5;
            this.f23198OoooOOo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            RoomTurntableGameManager.this.OooO0O0(this.f23194OoooO00, this.f23193OoooO0, this.f23195OoooO0O, this.f23192OoooO, this.f23196OoooOO0, this.f23199o000oOoO, this.f23197OoooOOO, ooo00o, this.f23198OoooOOo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends o0Oo0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f23200OooO00o;

        @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager$createAndShowGame$2$zoomOut$1", f = "RoomTurntableGameManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public OooO00o(Continuation<? super OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                o00OO000.OooOOO0 oooOOO0 = o00OO000.OooOOO0.f43286OooO00o;
                oooOOO0.OooO0O0(false);
                oooOOO0.OooO0OO(false);
                return Unit.INSTANCE;
            }
        }

        public OooOo(MixedRoomActivity mixedRoomActivity) {
            this.f23200OooO00o = mixedRoomActivity;
        }

        @Override // p490o0o000oo.o0Oo0oo
        @JavascriptInterface
        public void closePage() {
            o00OO000.OooOOO0.f43286OooO00o.OooO0Oo(TurntableGameState.Close);
        }

        @JavascriptInterface
        public void zoomOut() {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f23200OooO00o), null, null, new OooO00o(null), 3, null);
        }
    }

    public static final class OooOo00 implements BaseWebView.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23201OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o0O00O<Boolean> f23202OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o0O00O<BaseWebView> f23203OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O00O<String> f23204OooO0Oo;

        public OooOo00(o0O00O<Boolean> o0o00o2, o0O00O<Boolean> o0o00o3, o0O00O<BaseWebView> o0o00o4, o0O00O<String> o0o00o5) {
            this.f23201OooO00o = o0o00o2;
            this.f23202OooO0O0 = o0o00o3;
            this.f23203OooO0OO = o0o00o4;
            this.f23204OooO0Oo = o0o00o5;
        }

        @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
        public final void OooO00o(int i) {
        }

        @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
        public final void OooO0O0(boolean z) {
            o00O00.OooO0OO("createAndShowGame", "success = " + z);
            o0O00O<Boolean> o0o00o2 = this.f23201OooO00o;
            Boolean bool = Boolean.FALSE;
            o0o00o2.setValue(bool);
            this.f23202OooO0O0.setValue(Boolean.TRUE);
            if (z) {
                o00OO000.OooOOO0 oooOOO0 = o00OO000.OooOOO0.f43286OooO00o;
                if (oooOOO0.OooO00o() != TurntableGameState.Close) {
                    oooOOO0.OooO0O0(true);
                    oooOOO0.OooO0OO(true);
                    return;
                }
                return;
            }
            o0O00O<Boolean> o0o00o3 = this.f23201OooO00o;
            o0O00O<BaseWebView> o0o00o4 = this.f23203OooO0OO;
            this.f23204OooO0Oo.setValue("");
            o0o00o3.setValue(bool);
            BaseWebView value = o0o00o4.getValue();
            if (value != null) {
                p255o00ooO0O.oOO00O.OooO00o(value);
            }
            o00OO000.OooOOO0 oooOOO1 = o00OO000.OooOOO0.f43286OooO00o;
            o00OO000.OooOOO0.f43287OooO0O0.setValue(bool);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1418020567);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            Object objOooOO0o = ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6618OooO0Oo);
            MixedRoomActivity mixedRoomActivity = objOooOO0o instanceof MixedRoomActivity ? (MixedRoomActivity) objOooOO0o : null;
            if (mixedRoomActivity == null) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(i));
                return;
            }
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29707OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            final o0O00O o0o00o2 = (o0O00O) objOooO0o;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = o0OOO00.OooO0Oo(mixedRoomActivity.findViewById(R.id.v_room_root));
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o0O00O o0o00o3 = (o0O00O) objOooO0o2;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = o0OOO00.OooO0Oo(null);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            final o0O00O o0o00o4 = (o0O00O) objOooO0o3;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o4 = ooo00oOooOOo.OooO0o();
            if (objOooO0o4 == c0323OooO00o) {
                objOooO0o4 = o0OOO00.OooO0Oo("");
                ooo00oOooOOo.Oooo00o(objOooO0o4);
            }
            ooo00oOooOOo.Oooo0o0();
            final o0O00O o0o00o5 = (o0O00O) objOooO0o4;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o5 = ooo00oOooOOo.OooO0o();
            if (objOooO0o5 == c0323OooO00o) {
                objOooO0o5 = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00oOooOOo.Oooo00o(objOooO0o5);
            }
            ooo00oOooOOo.Oooo0o0();
            final o0O00O o0o00o6 = (o0O00O) objOooO0o5;
            Observable<Object> observable = LiveEventBus.get("OPEN_TURNTABKE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.OPEN_TURNTABKE_GAME)");
            final MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
            o00O000o.OooO00o(observable, new Observer() { // from class: o0oOOoo.o0O00O
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    p100o000oOoO.o0O00O<Boolean> showProgress = o0o00o2;
                    p100o000oOoO.o0O00O<BaseWebView> webView = o0o00o4;
                    MixedRoomActivity activity = mixedRoomActivity2;
                    p100o000oOoO.o0O00O<String> currentUrl = o0o00o5;
                    p100o000oOoO.o0O00O<Boolean> loadFinish = o0o00o6;
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    RoomTurntableGameManager roomTurntableGameManager = RoomTurntableGameManager.f23162OooO00o;
                    o00OO000.OooOOO0 oooOOO0 = o00OO000.OooOOO0.f43286OooO00o;
                    if (oooOOO0.OooO00o() == TurntableGameState.Close) {
                        oooOOO0.OooO0Oo(TurntableGameState.Setting);
                    }
                    roomTurntableGameManager.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                }
            }, ooo00oOooOOo, 72);
            o00OO000.OooOOO0 oooOOO0 = o00OO000.OooOOO0.f43286OooO00o;
            if (oooOOO0.OooO00o() == TurntableGameState.Close) {
                Boolean bool = Boolean.FALSE;
                o0o00o6.setValue(bool);
                if (OooO0Oo((BaseWebView) o0o00o4.getValue())) {
                    oooOOO0.OooO0O0(true);
                }
                oooOOO0.OooO0OO(false);
                o0o00o5.setValue("");
                o0o00o2.setValue(bool);
                if (OooO0Oo((BaseWebView) o0o00o4.getValue())) {
                    LifecycleOwnerKt.getLifecycleScope(mixedRoomActivity).launchWhenCreated(new o0oO0Ooo(o0o00o4, null));
                }
            }
            final MixedRoomActivity mixedRoomActivity3 = mixedRoomActivity;
            o00O000o.OooO00o(o0O0o.OooO00o("Turntable_Wait"), new Observer() { // from class: o0oOOoo.o0OoO00O
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    o0O00O<Boolean> showProgress = o0o00o2;
                    o0O00O<BaseWebView> webView = o0o00o4;
                    MixedRoomActivity activity = mixedRoomActivity3;
                    o0O00O<String> currentUrl = o0o00o5;
                    o0O00O<Boolean> loadFinish = o0o00o6;
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    o00OO000.OooOOO0 oooOOO1 = o00OO000.OooOOO0.f43286OooO00o;
                    if (((Boolean) o00OO000.OooOOO0.f43291OooO0o0.getValue()).booleanValue() && Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                        RoomTurntableGameManager.f23162OooO00o.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                    }
                }
            }, ooo00oOooOOo, 72);
            o00O000o.OooO00o(o0O0o.OooO00o("Turntable_Open"), new Observer() { // from class: o0oOOoo.o0O00O0o
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    o0O00O<Boolean> showProgress = o0o00o2;
                    o0O00O<BaseWebView> webView = o0o00o4;
                    MixedRoomActivity activity = mixedRoomActivity3;
                    o0O00O<String> currentUrl = o0o00o5;
                    o0O00O<Boolean> loadFinish = o0o00o6;
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    if (o00OO000.OooOOO0.f43286OooO00o.OooO00o() == TurntableGameState.Close) {
                        ToastUtil.f12582OooO00o.OooO00o(R.string.lucky_wheel_ended);
                    } else {
                        RoomTurntableGameManager.f23162OooO00o.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                    }
                }
            }, ooo00oOooOOo, 72);
            Unit unit = Unit.INSTANCE;
            ooo00oOooOOo.OooO0o0(511388516);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00o4) | ooo00oOooOOo.Oooo0oo(o0o00o5);
            Object objOooO0o6 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o6 == c0323OooO00o) {
                objOooO0o6 = new OooO00o(o0o00o4, o0o00o5);
                ooo00oOooOOo.Oooo00o(objOooO0o6);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0O0(unit, (Function1) objOooO0o6, ooo00oOooOOo);
            if (((Boolean) o00OO000.OooOOO0.f43289OooO0Oo.getValue()).booleanValue()) {
                BaseWebView baseWebView = (BaseWebView) o0o00o4.getValue();
                if (baseWebView != null) {
                    if (baseWebView.getParent() == null) {
                        ((FrameLayout) o0o00o3.getValue()).addView((View) o0o00o4.getValue());
                    }
                    p255o00ooO0O.oOO00O.OooO(baseWebView);
                }
            } else {
                BaseWebView baseWebView2 = (BaseWebView) o0o00o4.getValue();
                if (baseWebView2 != null) {
                    p255o00ooO0O.oOO00O.OooO00o(baseWebView2);
                }
            }
            o00Oo0.OooO0o0((Intrinsics.areEqual(o00O00O.OooO0O0(o00OO000.OooOOO0.f43287OooO0O0, ooo00oOooOOo).getValue(), Boolean.FALSE) || OooO0Oo((BaseWebView) o0o00o4.getValue())) ? false : true, null, o000OOo.OooO0Oo(null, 3).OooO0O0(o000OOo.OooO0OO()), o000OOo.OooO0o0(null, 3).OooO0O0(o000OOo.OooO0oo()), null, o00O0000.OooO00o(ooo00oOooOOo, 1944332031, new OooO0O0(o0o00o2, o0o00o4, mixedRoomActivity, o0o00o5, o0o00o6)), ooo00oOooOOo, 200064, 18);
        }
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooO0OO(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable final String str, @NotNull final String text, @NotNull final o0O00O<Boolean> showProgress, @NotNull o0O00O<BaseWebView> webView, @NotNull MixedRoomActivity activity, @NotNull o0O00O<String> currentUrl, @NotNull o0O00O<Boolean> loadFinish, @Nullable oOO00O ooo00o, final int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(showProgress, "showProgress");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(currentUrl, "currentUrl");
        Intrinsics.checkNotNullParameter(loadFinish, "loadFinish");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1539261329);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
        if (TextUtils.isEmpty(str)) {
            oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(str, text, showProgress, webView, activity, currentUrl, loadFinish, i));
            return;
        }
        p048OoooooO.o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(PaddingKt.OooO(OoooooO.o00OOOO0.OooO00o.f4215Oooo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13), false, false, null, new OooOO0(showProgress, webView, activity, currentUrl, loadFinish), 253);
        Object objOooO00o = o000O00.OooO00o(ooo00oOooOOo, -270267587, -3687241);
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29707OooO0O0;
        if (objOooO00o == c0323OooO00o) {
            objOooO00o = new o0000OO.o000OOo();
            ooo00oOooOOo.Oooo00o(objOooO00o);
        }
        ooo00oOooOOo.Oooo0o0();
        final o0000OO.o000OOo o000ooo2 = (o0000OO.o000OOo) objOooO00o;
        ooo00oOooOOo.OooO0o0(-3687241);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = new ConstraintLayoutScope();
            ooo00oOooOOo.Oooo00o(objOooO0o);
        }
        ooo00oOooOOo.Oooo0o0();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objOooO0o;
        ooo00oOooOOo.OooO0o0(-3687241);
        Object objOooO0o2 = ooo00oOooOOo.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
            ooo00oOooOOo.Oooo00o(objOooO0o2);
        }
        ooo00oOooOOo.Oooo0o0();
        Pair pairOooO0O0 = Oooo000.OooO0O0(constraintLayoutScope, (o0O00O) objOooO0o2, o000ooo2, ooo00oOooOOo);
        o000000 o000000Var = (o000000) pairOooO0O0.component1();
        final Function0 function0 = (Function0) pairOooO0O0.component2();
        o0O0O00.o00Ooo.OooO00o(SemanticsModifierKt.OooO00o(o00oooo0OooO0O0, false, new Function1<o0OO00O, Unit>() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager$RoomTurntableGame$$inlined$ConstraintLayout$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o0OO00O o0oo00o2) {
                o0OO00O semantics = o0oo00o2;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                o00000O0.OooO00o(semantics, o000ooo2);
                return Unit.INSTANCE;
            }
        }), o00O0000.OooO00o(ooo00oOooOOo, -819894182, new Function2<oOO00O, Integer, Unit>() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager$RoomTurntableGame$$inlined$ConstraintLayout$2

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ int f23206Oooo = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(oOO00O ooo00o2, Integer num) {
                oOO00O ooo00o3 = ooo00o2;
                if (((num.intValue() & 11) ^ 2) == 0 && ooo00o3.OooOo0()) {
                    ooo00o3.OooOoo0();
                } else {
                    Objects.requireNonNull(constraintLayoutScope);
                    constraintLayoutScope.OooO0Oo();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    int i2 = ((this.f23206Oooo >> 3) & 112) | 8;
                    if ((i2 & 14) == 0) {
                        i2 |= ooo00o3.Oooo0oo(constraintLayoutScope2) ? 4 : 2;
                    }
                    if ((i2 & 91) == 18 && ooo00o3.OooOo0()) {
                        ooo00o3.OooOoo0();
                    } else {
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        OooOO0O oooOO0OOooO00o = oooO00oOooO0OO.OooO00o();
                        OooOO0O oooOO0OOooO0O0 = oooO00oOooO0OO.OooO0O0();
                        OooOO0O oooOO0OOooO0OO = oooO00oOooO0OO.OooO0OO();
                        String str2 = str;
                        Intrinsics.checkNotNull(str2);
                        OoooooO.o00OOOO0.OooO00o oooO00o = OoooooO.o00OOOO0.OooO00o.f4215Oooo;
                        o0oO0O0o.OooO00o(str2, true, 0, null, constraintLayoutScope2.OooO00o(SizeKt.OooOO0(oooO00o, 40), oooOO0OOooO00o, RoomTurntableGameManager.OooOO0O.f23188Oooo), ooo00o3, 48, 12);
                        o0000O0 o0000o1 = o0000O0.f41710OooO00o;
                        long j = o0000O0.f41716OooO0oO;
                        long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(10);
                        ooo00o3.OooO0o0(1157296644);
                        boolean zOooo0oo = ooo00o3.Oooo0oo(oooOO0OOooO00o);
                        Object objOooO0o3 = ooo00o3.OooO0o();
                        if (zOooo0oo || objOooO0o3 == oOO00O.OooO00o.f29707OooO0O0) {
                            objOooO0o3 = new RoomTurntableGameManager.OooOOO0(oooOO0OOooO00o);
                            ooo00o3.Oooo00o(objOooO0o3);
                        }
                        ooo00o3.Oooo0o0();
                        o000O0O0.OooO0OO(text, constraintLayoutScope2.OooO00o(oooO00o, oooOO0OOooO0OO, (Function1) objOooO0o3), j, jOooO0OO, null, null, null, 0L, null, new OooO0o(3), 0L, 0, false, 2, null, null, ooo00o3, ((i >> 3) & 14) | 3456, 3072, 56816);
                        if (((Boolean) showProgress.getValue()).booleanValue()) {
                            p048OoooooO.o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(oooO00o, 32);
                            ooo00o3.OooO0o0(1157296644);
                            boolean zOooo0oo2 = ooo00o3.Oooo0oo(oooOO0OOooO00o);
                            Object objOooO0o4 = ooo00o3.OooO0o();
                            if (zOooo0oo2 || objOooO0o4 == oOO00O.OooO00o.f29707OooO0O0) {
                                objOooO0o4 = new RoomTurntableGameManager.OooOOO(oooOO0OOooO00o);
                                ooo00o3.Oooo00o(objOooO0o4);
                            }
                            ooo00o3.Oooo0o0();
                            oo0o0Oo.OooO00o(constraintLayoutScope2.OooO00o(o00oooo0OooOO0, oooOO0OOooO0O0, (Function1) objOooO0o4), 0L, 3, ooo00o3, 384, 2);
                        }
                    }
                    Objects.requireNonNull(constraintLayoutScope);
                }
                return Unit.INSTANCE;
            }
        }), o000000Var, ooo00oOooOOo, 48, 0);
        ooo00oOooOOo.Oooo0o0();
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooOOOO(str, text, showProgress, webView, activity, currentUrl, loadFinish, i));
    }

    public final synchronized void OooO0OO(final o0O00O<Boolean> o0o00o2, final o0O00O<BaseWebView> o0o00o3, MixedRoomActivity mixedRoomActivity, final o0O00O<String> o0o00o4, final o0O00O<Boolean> o0o00o5) {
        Boolean value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(value, bool)) {
            if (o0o00o3.getValue() == null) {
                BaseWebView baseWebView = new BaseWebView(mixedRoomActivity);
                baseWebView.setBackgroundColor(0);
                baseWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                o0o00o3.setValue(baseWebView);
                BaseWebView value2 = o0o00o3.getValue();
                if (value2 != null) {
                    value2.setLoadStateListener(new OooOo00(o0o00o2, o0o00o5, o0o00o3, o0o00o4));
                }
                BaseWebView value3 = o0o00o3.getValue();
                if (value3 != null) {
                    value3.addJavascriptInterface(new OooOo(mixedRoomActivity), "Yalla");
                }
                o0o00o2.setValue(bool);
            }
            SharedUrlManager.INSTANCE.getTurntableGameUrl().observe(mixedRoomActivity, new Observer() { // from class: o0oOOoo.o0O00OO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    o0O00O currentUrl = o0o00o4;
                    o0O00O loadFinish = o0o00o5;
                    o0O00O webView = o0o00o3;
                    o0O00O showProgress = o0o00o2;
                    String it = (String) obj;
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    if (Intrinsics.areEqual(currentUrl.getValue(), it)) {
                        if (((Boolean) loadFinish.getValue()).booleanValue()) {
                            o00OO000.OooOOO0 oooOOO0 = o00OO000.OooOOO0.f43286OooO00o;
                            oooOOO0.OooO0O0(true);
                            oooOOO0.OooO0OO(true);
                        }
                        showProgress.setValue(Boolean.FALSE);
                        return;
                    }
                    loadFinish.setValue(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    currentUrl.setValue(it);
                    String strOooO0O0 = o00000OO.OooO0O0(o00000OO.OooO0OO(o00000OO.OooO00o(it), null), ContributionFragment.ARG_1, String.valueOf(o00OO0O0.f43338OooooOo.OooO00o().f43344OooO0Oo.getValue()));
                    o00O00.OooO0OO("SharedUrlManager", "url = " + strOooO0O0);
                    BaseWebView baseWebView2 = (BaseWebView) webView.getValue();
                    if (baseWebView2 != null) {
                        baseWebView2.loadUrl(strOooO0O0);
                    }
                    showProgress.setValue(Boolean.TRUE);
                }
            });
        }
    }

    public final boolean OooO0Oo(BaseWebView baseWebView) {
        return (baseWebView != null ? baseWebView.getParent() : null) != null && o00O0O.OooO0OO(baseWebView);
    }
}
