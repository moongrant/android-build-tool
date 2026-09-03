package com.yalla.yalla.ui.activity.room.live.side;

import Oooo000.o000000;
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
import o0000O0.OooO0o;
import o0000OO.OooOO0O;
import o0000OO.Oooo000;
import o0000OO.o00000O0;
import o0000OO.o000OOo;
import o0000OO.o0O0O00;
import o00OO0O0.o0OOO0o;
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
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0o;
import p488o0o000oo.o0OO00O;
import p498o0o00Oo0.OooOOO;
import p507o0o00oOO.o0000O0;
import p510o0o00oo0.o0O0O0O;
import p515o0o0O00.o00O00;
import p516o0o0O000.o00000OO;
import p522o0o0O0o.o00O000o;
import p523o0o0O0o0.oo00oO;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p558o0oOOoo.o0O00o00;
import p558o0oOOoo.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class RoomTurntableGameManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final RoomTurntableGameManager f23143OooO00o = new RoomTurntableGameManager();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f23144Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f23146Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f23147Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f23148OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f23149OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<BaseWebView> f23150OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<String> f23151OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f23152OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, String str2, o0O00OO<Boolean> o0o00oo2, o0O00OO<BaseWebView> o0o00oo3, MixedRoomActivity mixedRoomActivity, o0O00OO<String> o0o00oo4, o0O00OO<Boolean> o0o00oo5, int i) {
            super(2);
            this.f23146Oooo0oO = str;
            this.f23147Oooo0oo = str2;
            this.f23144Oooo = o0o00oo2;
            this.f23150OoooO00 = o0o00oo3;
            this.f23149OoooO0 = mixedRoomActivity;
            this.f23151OoooO0O = o0o00oo4;
            this.f23148OoooO = o0o00oo5;
            this.f23152OoooOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            RoomTurntableGameManager.this.OooO0O0(this.f23146Oooo0oO, this.f23147Oooo0oo, this.f23144Oooo, this.f23150OoooO00, this.f23149OoooO0, this.f23151OoooO0O, this.f23148OoooO, ooo00o, this.f23152OoooOO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<BaseWebView> f23153Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<String> f23154Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00OO<BaseWebView> o0o00oo2, o0O00OO<String> o0o00oo3) {
            super(1);
            this.f23153Oooo0o = o0o00oo2;
            this.f23154Oooo0oO = o0o00oo3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0oO0Ooo(this.f23153Oooo0o, this.f23154Oooo0oO);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<o00Ooo, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<String> f23155Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f23156Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<BaseWebView> f23157Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f23158Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f23159OoooO00;

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
        public OooO0O0(o0O00OO<Boolean> o0o00oo2, o0O00OO<BaseWebView> o0o00oo3, MixedRoomActivity mixedRoomActivity, o0O00OO<String> o0o00oo4, o0O00OO<Boolean> o0o00oo5) {
            super(3);
            this.f23156Oooo0o = o0o00oo2;
            this.f23157Oooo0oO = o0o00oo3;
            this.f23158Oooo0oo = mixedRoomActivity;
            this.f23155Oooo = o0o00oo4;
            this.f23159OoooO00 = o0o00oo5;
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
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            int i = OooO00o.$EnumSwitchMapping$0[o00O.OooOOO0.f43257OooO00o.OooO00o().ordinal()];
            String str3 = null;
            String str4 = "svga/room_turntable_wait.svga";
            if (i == 1) {
                strOooO00o = p558o0oOOoo.oo0o0O0.OooO00o(ooo00o2, -1101861869, R.string.room_game_box_lucky_wheel, ooo00o2);
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
                        strOooO00o = p558o0oOOoo.oo0o0O0.OooO00o(ooo00o2, -1101861450, R.string.Playing, ooo00o2);
                        str4 = "svga/room_turntable_start.svga";
                    }
                    RoomTurntableGameManager roomTurntableGameManager = RoomTurntableGameManager.f23143OooO00o;
                    if (str3 == null) {
                        str2 = "";
                    } else {
                        str2 = str3;
                    }
                    roomTurntableGameManager.OooO0O0(str, str2, this.f23156Oooo0o, this.f23157Oooo0oO, this.f23158Oooo0oo, this.f23155Oooo, this.f23159OoooO00, ooo00o2, 14388608);
                    return Unit.INSTANCE;
                }
                strOooO00o = p558o0oOOoo.oo0o0O0.OooO00o(ooo00o2, -1101861651, R.string.Waiting, ooo00o2);
            }
            str3 = strOooO00o;
            str = str4;
            RoomTurntableGameManager roomTurntableGameManager2 = RoomTurntableGameManager.f23143OooO00o;
            if (str3 == null) {
                str2 = "";
            } else {
                str2 = str3;
            }
            roomTurntableGameManager2.OooO0O0(str, str2, this.f23156Oooo0o, this.f23157Oooo0oO, this.f23158Oooo0oo, this.f23155Oooo, this.f23159OoooO00, ooo00o2, 14388608);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f23161Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f23161Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            RoomTurntableGameManager.this.OooO00o(ooo00o, this.f23161Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f23163Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f23163Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            RoomTurntableGameManager.this.OooO00o(ooo00o, this.f23163Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<String> f23164Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f23165Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<BaseWebView> f23166Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f23167Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f23168OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0O00OO<Boolean> o0o00oo2, o0O00OO<BaseWebView> o0o00oo3, MixedRoomActivity mixedRoomActivity, o0O00OO<String> o0o00oo4, o0O00OO<Boolean> o0o00oo5) {
            super(0);
            this.f23165Oooo0o = o0o00oo2;
            this.f23166Oooo0oO = o0o00oo3;
            this.f23167Oooo0oo = mixedRoomActivity;
            this.f23164Oooo = o0o00oo4;
            this.f23168OoooO00 = o0o00oo5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.ui.activity.room.live.side.OooO00o onLogin = new com.yalla.yalla.ui.activity.room.live.side.OooO00o(this.f23165Oooo0o, this.f23166Oooo0oO, this.f23167Oooo0oo, this.f23164Oooo, this.f23168OoooO00);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0O f23169Oooo0o = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0O0O00.OooO00o.OooO00o(constrainAs.f27362OooO0o0, constrainAs.f27359OooO0OO.f27366OooO0OO, 6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, constrainAs.f27359OooO0OO.f27365OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27361OooO0o, constrainAs.f27359OooO0OO.f27367OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23170Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(o0000OO.OooOO0O oooOO0O) {
            super(1);
            this.f23170Oooo0o = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0O0O00.OooO00o.OooO00o(constrainAs.f27362OooO0o0, this.f23170Oooo0o.f27366OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, this.f23170Oooo0o.f27365OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27361OooO0o, this.f23170Oooo0o.f27367OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0O0O00.OooO00o.OooO00o(constrainAs.f27363OooO0oO, this.f23170Oooo0o.f27368OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<o0000OO.OooOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000OO.OooOO0O f23171Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0000OO.OooOO0O oooOO0O) {
            super(1);
            this.f23171Oooo0o = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0000OO.OooOO0 oooOO1) {
            o0000OO.OooOO0 constrainAs = oooOO1;
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            o0O0O00.OooO00o.OooO00o(constrainAs.f27362OooO0o0, this.f23171Oooo0o.f27368OooO0o0, 4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27360OooO0Oo, constrainAs.f27359OooO0OO.f27365OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            o0000OO.o00000O.OooO00o.OooO00o(constrainAs.f27361OooO0o, constrainAs.f27359OooO0OO.f27367OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 6, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f23172Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f23174Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f23175Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f23176OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f23177OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<BaseWebView> f23178OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<String> f23179OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f23180OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(String str, String str2, o0O00OO<Boolean> o0o00oo2, o0O00OO<BaseWebView> o0o00oo3, MixedRoomActivity mixedRoomActivity, o0O00OO<String> o0o00oo4, o0O00OO<Boolean> o0o00oo5, int i) {
            super(2);
            this.f23174Oooo0oO = str;
            this.f23175Oooo0oo = str2;
            this.f23172Oooo = o0o00oo2;
            this.f23178OoooO00 = o0o00oo3;
            this.f23177OoooO0 = mixedRoomActivity;
            this.f23179OoooO0O = o0o00oo4;
            this.f23176OoooO = o0o00oo5;
            this.f23180OoooOO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            RoomTurntableGameManager.this.OooO0O0(this.f23174Oooo0oO, this.f23175Oooo0oo, this.f23172Oooo, this.f23178OoooO00, this.f23177OoooO0, this.f23179OoooO0O, this.f23176OoooO, ooo00o, this.f23180OoooOO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends o0OO00O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f23181OooO00o;

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
                o00O.OooOOO0 oooOOO0 = o00O.OooOOO0.f43257OooO00o;
                oooOOO0.OooO0O0(false);
                oooOOO0.OooO0OO(false);
                return Unit.INSTANCE;
            }
        }

        public OooOo(MixedRoomActivity mixedRoomActivity) {
            this.f23181OooO00o = mixedRoomActivity;
        }

        @Override // p488o0o000oo.o0OO00O
        @JavascriptInterface
        public void closePage() {
            o00O.OooOOO0.f43257OooO00o.OooO0Oo(TurntableGameState.Close);
        }

        @JavascriptInterface
        public void zoomOut() {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f23181OooO00o), null, null, new OooO00o(null), 3, null);
        }
    }

    public static final class OooOo00 implements BaseWebView.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f23182OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f23183OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<BaseWebView> f23184OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<String> f23185OooO0Oo;

        public OooOo00(o0O00OO<Boolean> o0o00oo2, o0O00OO<Boolean> o0o00oo3, o0O00OO<BaseWebView> o0o00oo4, o0O00OO<String> o0o00oo5) {
            this.f23182OooO00o = o0o00oo2;
            this.f23183OooO0O0 = o0o00oo3;
            this.f23184OooO0OO = o0o00oo4;
            this.f23185OooO0Oo = o0o00oo5;
        }

        @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
        public final void OooO00o(int i) {
        }

        @Override // com.yalla.yalla.common.ui.view.BaseWebView.OooO0o
        public final void OooO0O0(boolean z) {
            o00O00.OooO0OO("createAndShowGame", "success = " + z);
            o0O00OO<Boolean> o0o00oo2 = this.f23182OooO00o;
            Boolean bool = Boolean.FALSE;
            o0o00oo2.setValue(bool);
            this.f23183OooO0O0.setValue(Boolean.TRUE);
            if (z) {
                o00O.OooOOO0 oooOOO0 = o00O.OooOOO0.f43257OooO00o;
                if (oooOOO0.OooO00o() != TurntableGameState.Close) {
                    oooOOO0.OooO0O0(true);
                    oooOOO0.OooO0OO(true);
                    return;
                }
                return;
            }
            o0O00OO<Boolean> o0o00oo3 = this.f23182OooO00o;
            o0O00OO<BaseWebView> o0o00oo4 = this.f23184OooO0OO;
            this.f23185OooO0Oo.setValue("");
            o0o00oo3.setValue(bool);
            BaseWebView value = o0o00oo4.getValue();
            if (value != null) {
                p254o00ooO0O.oOO00O.OooO00o(value);
            }
            o00O.OooOOO0 oooOOO1 = o00O.OooOOO0.f43257OooO00o;
            o00O.OooOOO0.f43258OooO0O0.setValue(bool);
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
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooOO0o = ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6593OooO0Oo);
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
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            final o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = o0OOO00.OooO0Oo(mixedRoomActivity.findViewById(R.id.v_room_root));
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o0O00OO o0o00oo3 = (o0O00OO) objOooO0o2;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = o0OOO00.OooO0Oo(null);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            final o0O00OO o0o00oo4 = (o0O00OO) objOooO0o3;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o4 = ooo00oOooOOo.OooO0o();
            if (objOooO0o4 == c0323OooO00o) {
                objOooO0o4 = o0OOO00.OooO0Oo("");
                ooo00oOooOOo.Oooo00o(objOooO0o4);
            }
            ooo00oOooOOo.Oooo0o0();
            final o0O00OO o0o00oo5 = (o0O00OO) objOooO0o4;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o5 = ooo00oOooOOo.OooO0o();
            if (objOooO0o5 == c0323OooO00o) {
                objOooO0o5 = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00oOooOOo.Oooo00o(objOooO0o5);
            }
            ooo00oOooOOo.Oooo0o0();
            final o0O00OO o0o00oo6 = (o0O00OO) objOooO0o5;
            Observable<Object> observable = LiveEventBus.get("OPEN_TURNTABKE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.OPEN_TURNTABKE_GAME)");
            final MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
            o00O000o.OooO00o(observable, new Observer() { // from class: o0oOOoo.o0O00OO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    p100o000oOoO.o0O00OO<Boolean> showProgress = o0o00oo2;
                    p100o000oOoO.o0O00OO<BaseWebView> webView = o0o00oo4;
                    MixedRoomActivity activity = mixedRoomActivity2;
                    p100o000oOoO.o0O00OO<String> currentUrl = o0o00oo5;
                    p100o000oOoO.o0O00OO<Boolean> loadFinish = o0o00oo6;
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    RoomTurntableGameManager roomTurntableGameManager = RoomTurntableGameManager.f23143OooO00o;
                    o00O.OooOOO0 oooOOO0 = o00O.OooOOO0.f43257OooO00o;
                    if (oooOOO0.OooO00o() == TurntableGameState.Close) {
                        oooOOO0.OooO0Oo(TurntableGameState.Setting);
                    }
                    roomTurntableGameManager.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                }
            }, ooo00oOooOOo, 72);
            o00O.OooOOO0 oooOOO0 = o00O.OooOOO0.f43257OooO00o;
            if (oooOOO0.OooO00o() == TurntableGameState.Close) {
                Boolean bool = Boolean.FALSE;
                o0o00oo6.setValue(bool);
                if (OooO0Oo((BaseWebView) o0o00oo4.getValue())) {
                    oooOOO0.OooO0O0(true);
                }
                oooOOO0.OooO0OO(false);
                o0o00oo5.setValue("");
                o0o00oo2.setValue(bool);
                if (OooO0Oo((BaseWebView) o0o00oo4.getValue())) {
                    LifecycleOwnerKt.getLifecycleScope(mixedRoomActivity).launchWhenCreated(new o0O00o00(o0o00oo4, null));
                }
            }
            final MixedRoomActivity mixedRoomActivity3 = mixedRoomActivity;
            o00O000o.OooO00o(oo00oO.OooO00o("Turntable_Wait"), new Observer() { // from class: o0oOOoo.o0O00O0o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    o0O00OO<Boolean> showProgress = o0o00oo2;
                    o0O00OO<BaseWebView> webView = o0o00oo4;
                    MixedRoomActivity activity = mixedRoomActivity3;
                    o0O00OO<String> currentUrl = o0o00oo5;
                    o0O00OO<Boolean> loadFinish = o0o00oo6;
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    o00O.OooOOO0 oooOOO1 = o00O.OooOOO0.f43257OooO00o;
                    if (((Boolean) o00O.OooOOO0.f43262OooO0o0.getValue()).booleanValue() && Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                        RoomTurntableGameManager.f23143OooO00o.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                    }
                }
            }, ooo00oOooOOo, 72);
            o00O000o.OooO00o(oo00oO.OooO00o("Turntable_Open"), new Observer() { // from class: o0oOOoo.o0O00O
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    o0O00OO<Boolean> showProgress = o0o00oo2;
                    o0O00OO<BaseWebView> webView = o0o00oo4;
                    MixedRoomActivity activity = mixedRoomActivity3;
                    o0O00OO<String> currentUrl = o0o00oo5;
                    o0O00OO<Boolean> loadFinish = o0o00oo6;
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    if (o00O.OooOOO0.f43257OooO00o.OooO00o() == TurntableGameState.Close) {
                        ToastUtil.f12567OooO00o.OooO00o(R.string.lucky_wheel_ended);
                    } else {
                        RoomTurntableGameManager.f23143OooO00o.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                    }
                }
            }, ooo00oOooOOo, 72);
            Unit unit = Unit.INSTANCE;
            ooo00oOooOOo.OooO0o0(511388516);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00oo4) | ooo00oOooOOo.Oooo0oo(o0o00oo5);
            Object objOooO0o6 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o6 == c0323OooO00o) {
                objOooO0o6 = new OooO00o(o0o00oo4, o0o00oo5);
                ooo00oOooOOo.Oooo00o(objOooO0o6);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0O0(unit, (Function1) objOooO0o6, ooo00oOooOOo);
            if (((Boolean) o00O.OooOOO0.f43260OooO0Oo.getValue()).booleanValue()) {
                BaseWebView baseWebView = (BaseWebView) o0o00oo4.getValue();
                if (baseWebView != null) {
                    if (baseWebView.getParent() == null) {
                        ((FrameLayout) o0o00oo3.getValue()).addView((View) o0o00oo4.getValue());
                    }
                    p254o00ooO0O.oOO00O.OooO(baseWebView);
                }
            } else {
                BaseWebView baseWebView2 = (BaseWebView) o0o00oo4.getValue();
                if (baseWebView2 != null) {
                    p254o00ooO0O.oOO00O.OooO00o(baseWebView2);
                }
            }
            o00Oo0.OooO0Oo((Intrinsics.areEqual(o00O00O.OooO0O0(o00O.OooOOO0.f43258OooO0O0, ooo00oOooOOo).getValue(), Boolean.FALSE) || OooO0Oo((BaseWebView) o0o00oo4.getValue())) ? false : true, null, o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO0OO()), o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0oo()), null, o00O0000.OooO00o(ooo00oOooOOo, 1944332031, new OooO0O0(o0o00oo2, o0o00oo4, mixedRoomActivity, o0o00oo5, o0o00oo6)), ooo00oOooOOo, 200064, 18);
        }
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooO0OO(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable final String str, @NotNull final String text, @NotNull final o0O00OO<Boolean> showProgress, @NotNull o0O00OO<BaseWebView> webView, @NotNull MixedRoomActivity activity, @NotNull o0O00OO<String> currentUrl, @NotNull o0O00OO<Boolean> loadFinish, @Nullable oOO00O ooo00o, final int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(showProgress, "showProgress");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(currentUrl, "currentUrl");
        Intrinsics.checkNotNullParameter(loadFinish, "loadFinish");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1539261329);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (TextUtils.isEmpty(str)) {
            oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(str, text, showProgress, webView, activity, currentUrl, loadFinish, i));
            return;
        }
        p048OoooooO.o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(PaddingKt.OooO(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13), false, false, null, new OooOO0(showProgress, webView, activity, currentUrl, loadFinish), 253);
        Object objOooO0O0 = o000O00.OooO0O0(ooo00oOooOOo, -270267587, -3687241);
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0O0 == c0323OooO00o) {
            objOooO0O0 = new o000OOo();
            ooo00oOooOOo.Oooo00o(objOooO0O0);
        }
        ooo00oOooOOo.Oooo0o0();
        final o000OOo o000ooo2 = (o000OOo) objOooO0O0;
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
        Pair pairOooO0O0 = Oooo000.OooO0O0(constraintLayoutScope, (o0O00OO) objOooO0o2, o000ooo2, ooo00oOooOOo);
        o0O0O00.o000000 o000000Var = (o0O0O00.o000000) pairOooO0O0.component1();
        final Function0 function0 = (Function0) pairOooO0O0.component2();
        o0O0O00.o00Oo0.OooO00o(SemanticsModifierKt.OooO00o(o00oooo0OooO0O0, false, new Function1<o00000O0.o0OO00O, Unit>() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager$RoomTurntableGame$$inlined$ConstraintLayout$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o00000O0.o0OO00O o0oo00o2) {
                o00000O0.o0OO00O semantics = o0oo00o2;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                o00000O0.OooO00o(semantics, o000ooo2);
                return Unit.INSTANCE;
            }
        }), o00O0000.OooO00o(ooo00oOooOOo, -819894182, new Function2<oOO00O, Integer, Unit>() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager$RoomTurntableGame$$inlined$ConstraintLayout$2

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ int f23188Oooo0o = 0;

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
                    int i2 = ((this.f23188Oooo0o >> 3) & 112) | 8;
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
                        OoooooO.o00OOOO0.OooO00o oooO00o = OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
                        o0O0O0O.OooO00o(str2, true, 0, null, constraintLayoutScope2.OooO00o(SizeKt.OooOO0(oooO00o, 40), oooOO0OOooO00o, RoomTurntableGameManager.OooOO0O.f23169Oooo0o), ooo00o3, 48, 12);
                        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                        long j = o0000O0.f41697OooO0oO;
                        long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(10);
                        ooo00o3.OooO0o0(1157296644);
                        boolean zOooo0oo = ooo00o3.Oooo0oo(oooOO0OOooO00o);
                        Object objOooO0o3 = ooo00o3.OooO0o();
                        if (zOooo0oo || objOooO0o3 == oOO00O.OooO00o.f29689OooO0O0) {
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
                            if (zOooo0oo2 || objOooO0o4 == oOO00O.OooO00o.f29689OooO0O0) {
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

    public final synchronized void OooO0OO(final o0O00OO<Boolean> o0o00oo2, final o0O00OO<BaseWebView> o0o00oo3, MixedRoomActivity mixedRoomActivity, final o0O00OO<String> o0o00oo4, final o0O00OO<Boolean> o0o00oo5) {
        Boolean value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(value, bool)) {
            if (o0o00oo3.getValue() == null) {
                BaseWebView baseWebView = new BaseWebView(mixedRoomActivity);
                baseWebView.setBackgroundColor(0);
                baseWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                o0o00oo3.setValue(baseWebView);
                BaseWebView value2 = o0o00oo3.getValue();
                if (value2 != null) {
                    value2.setLoadStateListener(new OooOo00(o0o00oo2, o0o00oo5, o0o00oo3, o0o00oo4));
                }
                BaseWebView value3 = o0o00oo3.getValue();
                if (value3 != null) {
                    value3.addJavascriptInterface(new OooOo(mixedRoomActivity), "Yalla");
                }
                o0o00oo2.setValue(bool);
            }
            SharedUrlManager.INSTANCE.getTurntableGameUrl().observe(mixedRoomActivity, new Observer() { // from class: o0oOOoo.o0O00OOO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    o0O00OO currentUrl = o0o00oo4;
                    o0O00OO loadFinish = o0o00oo5;
                    o0O00OO webView = o0o00oo3;
                    o0O00OO showProgress = o0o00oo2;
                    String it = (String) obj;
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    if (Intrinsics.areEqual(currentUrl.getValue(), it)) {
                        if (((Boolean) loadFinish.getValue()).booleanValue()) {
                            o00O.OooOOO0 oooOOO0 = o00O.OooOOO0.f43257OooO00o;
                            oooOOO0.OooO0O0(true);
                            oooOOO0.OooO0OO(true);
                        }
                        showProgress.setValue(Boolean.FALSE);
                        return;
                    }
                    loadFinish.setValue(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    currentUrl.setValue(it);
                    String strOooO0O0 = o00000OO.OooO0O0(o00000OO.OooO0OO(o00000OO.OooO00o(it), null), ContributionFragment.ARG_1, String.valueOf(o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue()));
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
