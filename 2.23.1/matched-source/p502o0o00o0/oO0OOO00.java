package p502o0o00o0;

import android.app.Activity;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.FrameLayout;
import androidx.activity.OooOo00;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.data.constant.TurntableGameState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Function;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o00O000o;
import p200o00o0OoO.oo0O;
import p425o0OoO0OO.o00;
import p474o0OoooOO.oo0oO0;
import p477o0Ooooo0.o0O0o;
import p482o0o000O.oo0o0Oo;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0Oo0oo;
import p575o0oOoOO.o0OOooO0;
import p585o0oOoo00.o00000OO;
import p587o0oOooO.oOOOOo0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomTurntableGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTurntableGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTurntableGameManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,360:1\n76#2:361\n25#3:362\n25#3:369\n25#3:376\n25#3:383\n25#3:390\n50#3:397\n49#3:398\n456#3,8:423\n464#3,3:437\n456#3,8:458\n464#3,3:472\n467#3,3:479\n467#3,3:485\n1097#4,6:363\n1097#4,6:370\n1097#4,6:377\n1097#4,6:384\n1097#4,6:391\n1097#4,6:399\n154#5:405\n154#5:476\n154#5:477\n154#5:478\n154#5:484\n72#6,6:406\n78#6:440\n82#6:489\n78#7,11:412\n78#7,11:447\n91#7:482\n91#7:488\n4144#8,6:431\n4144#8,6:466\n66#9,6:441\n72#9:475\n76#9:483\n81#10:490\n*S KotlinDebug\n*F\n+ 1 RoomTurntableGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTurntableGameManager\n*L\n76#1:361\n78#1:362\n80#1:369\n82#1:376\n84#1:383\n86#1:390\n110#1:397\n110#1:398\n178#1:423,8\n178#1:437,3\n190#1:458,8\n190#1:472,3\n190#1:479,3\n178#1:485,3\n78#1:363,6\n80#1:370,6\n82#1:377,6\n84#1:384,6\n86#1:391,6\n110#1:399,6\n180#1:405\n193#1:476\n200#1:477\n202#1:478\n213#1:484\n178#1:406,6\n178#1:440\n178#1:489\n178#1:412,11\n190#1:447,11\n190#1:482\n178#1:488\n178#1:431,6\n190#1:466,6\n190#1:441,6\n190#1:475\n190#1:483\n80#1:490\n*E\n"})
public final class oO0OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0OOO00 f50063OooO00o = new oO0OOO00();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50065OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f50065OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50065OooO0o0 | 1);
            oO0OOO00.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomTurntableGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTurntableGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTurntableGameManager$Content$4$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,360:1\n63#2,5:361\n*S KotlinDebug\n*F\n+ 1 RoomTurntableGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTurntableGameManager$Content$4$1\n*L\n111#1:361,5\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f50066OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f50067OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<BaseWebView> mutableState, MutableState<String> mutableState2) {
            super(1);
            this.f50066OooO0Oo = mutableState;
            this.f50067OooO0o0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new oO00o00(this.f50066OooO0Oo, this.f50067OooO0o0);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f50068OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50069OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f50070OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f50071OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f50072OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50073OooO0oo;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TurntableGameState.values().length];
                try {
                    iArr[TurntableGameState.Setting.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TurntableGameState.Wait.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TurntableGameState.Start.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TurntableGameState.Close.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
            super(3);
            this.f50069OooO0Oo = mutableState;
            this.f50071OooO0o0 = mutableState2;
            this.f50070OooO0o = mixedRoomActivity;
            this.f50072OooO0oO = mutableState3;
            this.f50073OooO0oo = mutableState4;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0095  */
        /* JADX WARN: Code duplicated, block: B:24:0x0099  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            String strStringResource;
            String str;
            String str2;
            String str3;
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1944332031, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager.Content.<anonymous> (RoomTurntableGameManager.kt:132)");
            }
            String strStringResource2 = null;
            int i = OooO00o.$EnumSwitchMapping$0[((TurntableGameState) SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24528OooOO0O.f48593OooO0O0, null, composer2, 8, 1).getValue()).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    composer2.startReplaceableGroup(-1101860771);
                    strStringResource = StringResources_androidKt.stringResource(o000OOo.Waiting, composer2, 0);
                    composer2.endReplaceableGroup();
                } else if (i != 3) {
                    if (i != 4) {
                        composer2.startReplaceableGroup(-1101860333);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1101860366);
                        composer2.endReplaceableGroup();
                    }
                    str2 = null;
                } else {
                    composer2.startReplaceableGroup(-1101860569);
                    strStringResource2 = StringResources_androidKt.stringResource(o000OOo.Playing, composer2, 0);
                    composer2.endReplaceableGroup();
                    str = "svga/room_turntable_start.svga";
                    str2 = str;
                }
                oO0OOO00 oo0ooo00 = oO0OOO00.f50063OooO00o;
                if (strStringResource2 == null) {
                    str3 = "";
                } else {
                    str3 = strStringResource2;
                }
                oo0ooo00.OooO0O0(str2, str3, this.f50069OooO0Oo, this.f50071OooO0o0, this.f50070OooO0o, this.f50072OooO0oO, this.f50073OooO0oo, composer2, 14388608);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            composer2.startReplaceableGroup(-1101860990);
            strStringResource = StringResources_androidKt.stringResource(o000OOo.room_game_box_lucky_wheel, composer2, 0);
            composer2.endReplaceableGroup();
            strStringResource2 = strStringResource;
            str = "svga/room_turntable_wait.svga";
            str2 = str;
            oO0OOO00 oo0ooo01 = oO0OOO00.f50063OooO00o;
            if (strStringResource2 == null) {
                str3 = "";
            } else {
                str3 = strStringResource2;
            }
            oo0ooo01.OooO0O0(str2, str3, this.f50069OooO0Oo, this.f50071OooO0o0, this.f50070OooO0o, this.f50072OooO0oO, this.f50073OooO0oo, composer2, 14388608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50075OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f50075OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50075OooO0o0 | 1);
            oO0OOO00.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f50076OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f50078OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f50079OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50080OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f50081OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f50082OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50083OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f50084OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, String str2, MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, int i) {
            super(2);
            this.f50079OooO0o0 = str;
            this.f50078OooO0o = str2;
            this.f50080OooO0oO = mutableState;
            this.f50081OooO0oo = mutableState2;
            this.f50076OooO = mixedRoomActivity;
            this.f50082OooOO0 = mutableState3;
            this.f50083OooOO0O = mutableState4;
            this.f50084OooOO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0OOO00.this.OooO0O0(this.f50079OooO0o0, this.f50078OooO0o, this.f50080OooO0oO, this.f50081OooO0oo, this.f50076OooO, this.f50082OooOO0, this.f50083OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50084OooOO0o | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50085OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f50086OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f50087OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f50088OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50089OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
            super(0);
            this.f50085OooO0Oo = mutableState;
            this.f50087OooO0o0 = mutableState2;
            this.f50086OooO0o = mixedRoomActivity;
            this.f50088OooO0oO = mutableState3;
            this.f50089OooO0oo = mutableState4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO00o00O onLogin = new oO00o00O(this.f50085OooO0Oo, this.f50087OooO0o0, this.f50086OooO0o, this.f50088OooO0oO, this.f50089OooO0oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24734OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements BaseWebView.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50090OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50091OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f50092OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f50093OooO0Oo;

        public OooOOO(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<BaseWebView> mutableState3, MutableState<String> mutableState4) {
            this.f50090OooO00o = mutableState;
            this.f50091OooO0O0 = mutableState2;
            this.f50092OooO0OO = mutableState3;
            this.f50093OooO0Oo = mutableState4;
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO00o(int i) {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO0O0(boolean z) {
            p597o0oo00O.OooOOOO.OooO0OO("createAndShowGame", "success = " + z);
            Boolean bool = Boolean.FALSE;
            MutableState<Boolean> mutableState = this.f50090OooO00o;
            mutableState.setValue(bool);
            Boolean bool2 = Boolean.TRUE;
            this.f50091OooO0O0.setValue(bool2);
            if (z) {
                oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24528OooOO0O;
                if (oo0o0oo.f48593OooO0O0.getValue() != TurntableGameState.Close) {
                    oo0o0oo.f48595OooO0Oo.setValue(bool2);
                    oo0o0oo.f48594OooO0OO.setValue(bool2);
                    return;
                }
                return;
            }
            this.f50093OooO0Oo.setValue("");
            mutableState.setValue(bool);
            BaseWebView value = this.f50092OooO0OO.getValue();
            if (value != null) {
                o000O.OooO0O0(value);
            }
            com.yalla.yalla.service.room.OooO00o.f24528OooOO0O.f48592OooO00o.setValue(bool);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f50094OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f50096OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f50097OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50098OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f50099OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f50100OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50101OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f50102OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(String str, String str2, MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, int i) {
            super(2);
            this.f50097OooO0o0 = str;
            this.f50096OooO0o = str2;
            this.f50098OooO0oO = mutableState;
            this.f50099OooO0oo = mutableState2;
            this.f50094OooO = mixedRoomActivity;
            this.f50100OooOO0 = mutableState3;
            this.f50101OooOO0O = mutableState4;
            this.f50102OooOO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0OOO00.this.OooO0O0(this.f50097OooO0o0, this.f50096OooO0o, this.f50098OooO0oO, this.f50099OooO0oo, this.f50094OooO, this.f50100OooOO0, this.f50101OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50102OooOO0o | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends o0OOooO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f50103OooO00o;

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
                oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24528OooOO0O;
                MutableStateFlow<Boolean> mutableStateFlow = oo0o0oo.f48595OooO0Oo;
                Boolean bool = Boolean.FALSE;
                mutableStateFlow.setValue(bool);
                oo0o0oo.f48594OooO0OO.setValue(bool);
                return Unit.INSTANCE;
            }
        }

        public OooOOOO(MixedRoomActivity mixedRoomActivity) {
            this.f50103OooO00o = mixedRoomActivity;
        }

        @Override // p575o0oOoOO.o0OOooO0
        public final void onClosePage() {
            com.yalla.yalla.service.room.OooO00o.f24528OooOO0O.f48593OooO0O0.setValue(TurntableGameState.Close);
        }

        @Override // p575o0oOoOO.o0OOooO0
        @JavascriptInterface
        public void zoomOut() {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f50103OooO00o), null, null, new OooO00o(null), 3, null);
        }
    }

    public static final class OooOo implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f50104OooO0Oo;

        public OooOo(OooOo00 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f50104OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f50104OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f50104OooO0Oo;
        }

        public final int hashCode() {
            return this.f50104OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50104OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f50105OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f50106OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50107OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f50108OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<BaseWebView> mutableState3, MutableState<Boolean> mutableState4) {
            super(1);
            this.f50105OooO0Oo = mutableState;
            this.f50107OooO0o0 = mutableState2;
            this.f50106OooO0o = mutableState3;
            this.f50108OooO0oO = mutableState4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            MutableState<String> mutableState = this.f50105OooO0Oo;
            boolean zAreEqual = Intrinsics.areEqual(mutableState.getValue(), str2);
            MutableState<Boolean> mutableState2 = this.f50108OooO0oO;
            MutableState<Boolean> mutableState3 = this.f50107OooO0o0;
            if (zAreEqual) {
                if (mutableState3.getValue().booleanValue()) {
                    oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24528OooOO0O;
                    MutableStateFlow<Boolean> mutableStateFlow = oo0o0oo.f48595OooO0Oo;
                    Boolean bool = Boolean.TRUE;
                    mutableStateFlow.setValue(bool);
                    oo0o0oo.f48594OooO0OO.setValue(bool);
                }
                mutableState2.setValue(Boolean.FALSE);
            } else {
                mutableState3.setValue(Boolean.FALSE);
                Intrinsics.checkNotNull(str2);
                mutableState.setValue(str2);
                String strOooO0O0 = oOOOOo0O.OooO0O0(oOOOOo0O.OooO0OO(oOOOOo0O.OooO00o(str2), null), ContributionFragment.ARG_1, String.valueOf(com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24547OooO0Oo.getValue()));
                p597o0oo00O.OooOOOO.OooO0OO("SharedUrlManager", "url = " + strOooO0O0);
                BaseWebView value = this.f50106OooO0o.getValue();
                if (value != null) {
                    value.loadUrl(strOooO0O0);
                }
                mutableState2.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0200  */
    /* JADX WARN: Code duplicated, block: B:80:0x0227  */
    /* JADX WARN: Code duplicated, block: B:82:0x022f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0235  */
    /* JADX WARN: Code duplicated, block: B:86:0x0248  */
    /* JADX WARN: Code duplicated, block: B:88:0x0250  */
    /* JADX WARN: Code duplicated, block: B:94:0x027c  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e6  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        int i2;
        MutableState mutableState;
        MutableState mutableState2;
        final MutableState mutableState3;
        final MutableState mutableState4;
        boolean zChanged;
        Object objRememberedValue;
        BaseWebView baseWebView;
        boolean z;
        BaseWebView baseWebView2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1418020567);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1418020567, i2, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager.Content (RoomTurntableGameManager.kt:74)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            if (mixedRoomActivity == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState5 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(mixedRoomActivity.findViewById(o0Oo0oo.v_room_root), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState6 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState7 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState8 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState9 = (MutableState) objRememberedValue6;
            Observable<Object> observable = LiveEventBus.get("OPEN_TURNTABKE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            final MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
            o00.OooO00o(observable, new Observer() { // from class: o0o00o0.oO00Oo0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object it) {
                    MutableState<Boolean> showProgress = mutableState5;
                    MutableState<BaseWebView> webView = mutableState7;
                    MixedRoomActivity activity = mixedRoomActivity2;
                    MutableState<String> currentUrl = mutableState8;
                    MutableState<Boolean> loadFinish = mutableState9;
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    Intrinsics.checkNotNullParameter(it, "it");
                    oO0OOO00 oo0ooo00 = oO0OOO00.f50063OooO00o;
                    oo0o0Oo oo0o0oo = OooO00o.f24528OooOO0O;
                    if (oo0o0oo.f48593OooO0O0.getValue() == TurntableGameState.Close) {
                        oo0o0oo.f48593OooO0O0.setValue(TurntableGameState.Setting);
                    }
                    oo0ooo00.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                }
            }, composerStartRestartGroup, 72);
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24528OooOO0O;
            Object value = SnapshotStateKt.collectAsState(oo0o0oo.f48593OooO0O0, null, composerStartRestartGroup, 8, 1).getValue();
            TurntableGameState turntableGameState = TurntableGameState.Close;
            MutableStateFlow<Boolean> mutableStateFlow = oo0o0oo.f48594OooO0OO;
            if (value == turntableGameState) {
                Boolean bool = Boolean.FALSE;
                mutableState9.setValue(bool);
                BaseWebView baseWebView3 = (BaseWebView) mutableState7.getValue();
                if ((baseWebView3 != null ? baseWebView3.getParent() : null) != null && o000O.OooO0o0(baseWebView3)) {
                    oo0o0oo.f48595OooO0Oo.setValue(Boolean.TRUE);
                }
                mutableStateFlow.setValue(bool);
                mutableState = mutableState8;
                mutableState.setValue("");
                mutableState5.setValue(bool);
                BaseWebView baseWebView4 = (BaseWebView) mutableState7.getValue();
                if ((baseWebView4 != null ? baseWebView4.getParent() : null) != null && o000O.OooO0o0(baseWebView4)) {
                    mutableState2 = mutableState7;
                    LifecycleOwnerKt.getLifecycleScope(mixedRoomActivity).launchWhenCreated(new oO00o0(mutableState2, null));
                }
                Intrinsics.checkNotNullParameter("Turntable_Wait", "key");
                Observable observable2 = LiveEventBus.get("roomTurntable_Wait", Object.class);
                Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
                mutableState3 = mutableState2;
                mutableState4 = mutableState;
                final MixedRoomActivity mixedRoomActivity3 = mixedRoomActivity;
                o00.OooO00o(observable2, new Observer() { // from class: o0o00o0.oOOoOOO0
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        MutableState<Boolean> showProgress = mutableState5;
                        MutableState<BaseWebView> webView = mutableState3;
                        MixedRoomActivity activity = mixedRoomActivity3;
                        MutableState<String> currentUrl = mutableState4;
                        MutableState<Boolean> loadFinish = mutableState9;
                        ((Boolean) obj).booleanValue();
                        Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                        Intrinsics.checkNotNullParameter(webView, "$webView");
                        Intrinsics.checkNotNullParameter(activity, "$activity");
                        Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                        Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                        if (OooO00o.f24528OooOO0O.f48595OooO0Oo.getValue().booleanValue()) {
                            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                                oO0OOO00.f50063OooO00o.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                            }
                        }
                    }
                }, composerStartRestartGroup, 72);
                Intrinsics.checkNotNullParameter("Turntable_Open", "key");
                Observable observable3 = LiveEventBus.get("roomTurntable_Open", Object.class);
                Intrinsics.checkNotNullExpressionValue(observable3, "get(...)");
                o00.OooO00o(observable3, new Observer() { // from class: o0o00o0.oO00o000
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        MutableState<Boolean> showProgress = mutableState5;
                        MutableState<BaseWebView> webView = mutableState3;
                        MixedRoomActivity activity = mixedRoomActivity3;
                        MutableState<String> currentUrl = mutableState4;
                        MutableState<Boolean> loadFinish = mutableState9;
                        ((Boolean) obj).booleanValue();
                        Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                        Intrinsics.checkNotNullParameter(webView, "$webView");
                        Intrinsics.checkNotNullParameter(activity, "$activity");
                        Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                        Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                        if (OooO00o.f24528OooOO0O.f48593OooO0O0.getValue() != TurntableGameState.Close) {
                            oO0OOO00.f50063OooO00o.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                            return;
                        }
                        String strOooO0OO = o0000.OooO0OO(o000OOo.lucky_wheel_ended);
                        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                            return;
                        }
                        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                }, composerStartRestartGroup, 72);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState3) | composerStartRestartGroup.changed(mutableState4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new OooO00o(mutableState3, mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                if (((Boolean) SnapshotStateKt.collectAsState(mutableStateFlow, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
                    baseWebView2 = (BaseWebView) mutableState3.getValue();
                    if (baseWebView2 != null) {
                        if (baseWebView2.getParent() == null) {
                            ((FrameLayout) mutableState6.getValue()).addView((View) mutableState3.getValue());
                        }
                        o000O.OooOOOO(baseWebView2);
                    }
                } else {
                    baseWebView = (BaseWebView) mutableState3.getValue();
                    if (baseWebView != null) {
                        o000O.OooO0O0(baseWebView);
                    }
                }
                composerStartRestartGroup.startReplaceableGroup(1689153838);
                if (!((Boolean) SnapshotStateKt.collectAsState(mutableStateFlow, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue() || SnapshotStateKt.collectAsState(oo0o0oo.f48593OooO0O0, null, composerStartRestartGroup, 8, 1).getValue() == turntableGameState) {
                    z = false;
                } else {
                    z = true;
                }
                composerStartRestartGroup.endReplaceableGroup();
                AnimatedVisibilityKt.AnimatedVisibility(z, SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, OooO0O0.f50068OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1944332031, true, new OooO0OO(mutableState5, mutableState3, mixedRoomActivity, mutableState4, mutableState9)), composerStartRestartGroup, 200064, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                mutableState = mutableState8;
            }
            mutableState2 = mutableState7;
            Intrinsics.checkNotNullParameter("Turntable_Wait", "key");
            Observable observable4 = LiveEventBus.get("roomTurntable_Wait", Object.class);
            Intrinsics.checkNotNullExpressionValue(observable4, "get(...)");
            mutableState3 = mutableState2;
            mutableState4 = mutableState;
            final MixedRoomActivity mixedRoomActivity4 = mixedRoomActivity;
            o00.OooO00o(observable4, new Observer() { // from class: o0o00o0.oOOoOOO0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    MutableState<Boolean> showProgress = mutableState5;
                    MutableState<BaseWebView> webView = mutableState3;
                    MixedRoomActivity activity = mixedRoomActivity4;
                    MutableState<String> currentUrl = mutableState4;
                    MutableState<Boolean> loadFinish = mutableState9;
                    ((Boolean) obj).booleanValue();
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    if (OooO00o.f24528OooOO0O.f48595OooO0Oo.getValue().booleanValue()) {
                        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                        if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                            oO0OOO00.f50063OooO00o.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                        }
                    }
                }
            }, composerStartRestartGroup, 72);
            Intrinsics.checkNotNullParameter("Turntable_Open", "key");
            Observable observable5 = LiveEventBus.get("roomTurntable_Open", Object.class);
            Intrinsics.checkNotNullExpressionValue(observable5, "get(...)");
            o00.OooO00o(observable5, new Observer() { // from class: o0o00o0.oO00o000
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    MutableState<Boolean> showProgress = mutableState5;
                    MutableState<BaseWebView> webView = mutableState3;
                    MixedRoomActivity activity = mixedRoomActivity4;
                    MutableState<String> currentUrl = mutableState4;
                    MutableState<Boolean> loadFinish = mutableState9;
                    ((Boolean) obj).booleanValue();
                    Intrinsics.checkNotNullParameter(showProgress, "$showProgress");
                    Intrinsics.checkNotNullParameter(webView, "$webView");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(currentUrl, "$currentUrl");
                    Intrinsics.checkNotNullParameter(loadFinish, "$loadFinish");
                    if (OooO00o.f24528OooOO0O.f48593OooO0O0.getValue() != TurntableGameState.Close) {
                        oO0OOO00.f50063OooO00o.OooO0OO(showProgress, webView, activity, currentUrl, loadFinish);
                        return;
                    }
                    String strOooO0OO = o0000.OooO0OO(o000OOo.lucky_wheel_ended);
                    if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }, composerStartRestartGroup, 72);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(mutableState3) | composerStartRestartGroup.changed(mutableState4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(mutableState3, mutableState4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(mutableState3, mutableState4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
            if (((Boolean) SnapshotStateKt.collectAsState(mutableStateFlow, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
                baseWebView2 = (BaseWebView) mutableState3.getValue();
                if (baseWebView2 != null) {
                    if (baseWebView2.getParent() == null) {
                        ((FrameLayout) mutableState6.getValue()).addView((View) mutableState3.getValue());
                    }
                    o000O.OooOOOO(baseWebView2);
                }
            } else {
                baseWebView = (BaseWebView) mutableState3.getValue();
                if (baseWebView != null) {
                    o000O.OooO0O0(baseWebView);
                }
            }
            composerStartRestartGroup.startReplaceableGroup(1689153838);
            if (((Boolean) SnapshotStateKt.collectAsState(mutableStateFlow, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
                z = false;
            } else {
                z = false;
            }
            composerStartRestartGroup.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(z, SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, OooO0O0.f50068OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1944332031, true, new OooO0OO(mutableState5, mutableState3, mixedRoomActivity, mutableState4, mutableState9)), composerStartRestartGroup, 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0o(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable String str, @NotNull String text, @NotNull MutableState<Boolean> showProgress, @NotNull MutableState<BaseWebView> webView, @NotNull MixedRoomActivity activity, @NotNull MutableState<String> currentUrl, @NotNull MutableState<Boolean> loadFinish, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(showProgress, "showProgress");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(currentUrl, "currentUrl");
        Intrinsics.checkNotNullParameter(loadFinish, "loadFinish");
        Composer composerStartRestartGroup = composer.startRestartGroup(1539261329);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1539261329, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager.RoomTurntableGame (RoomTurntableGameManager.kt:172)");
        }
        if (TextUtils.isEmpty(str)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(str, text, showProgress, webView, activity, currentUrl, loadFinish, i));
            return;
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 0.0f, 13, null), 0.0f, 1, null), false, false, 0L, false, null, null, null, new OooOO0O(showProgress, webView, activity, currentUrl, loadFinish), 253);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Intrinsics.checkNotNull(str);
        oo0O.OooO00o(str, true, 0, null, null, boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(40)), companion2.getCenter()), composerStartRestartGroup, 48, 28);
        composerStartRestartGroup.startReplaceableGroup(-655193143);
        if (showProgress.getValue().booleanValue()) {
            ProgressIndicatorKt.m1153CircularProgressIndicatorLxG7B9w(boxScopeInstance.align(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(32)), companion2.getCenter()), 0L, Dp.m3775constructorimpl(3), 0L, 0, composerStartRestartGroup, 384, 26);
        }
        o00O000o.OooO0O0(composerStartRestartGroup);
        TextKt.m1261Text4IGK_g(text, PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 13, null), o0O0o.f48105OooOOOO, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i >> 3) & 14) | 3120, 3072, 122352);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOO0(str, text, showProgress, webView, activity, currentUrl, loadFinish, i));
    }

    public final synchronized void OooO0OO(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        T value = oo0oO0.OooOo0O().getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(value, bool)) {
            if (mutableState2.getValue() == null) {
                BaseWebView baseWebView = new BaseWebView(mixedRoomActivity);
                baseWebView.setBackgroundColor(0);
                baseWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                mutableState2.setValue(baseWebView);
                BaseWebView value2 = mutableState2.getValue();
                if (value2 != null) {
                    value2.setLoadStateListener(new OooOOO(mutableState, mutableState4, mutableState2, mutableState3));
                }
                BaseWebView value3 = mutableState2.getValue();
                if (value3 != null) {
                    value3.addJavascriptInterface(new OooOOOO(mixedRoomActivity), "Yalla");
                }
                mutableState.setValue(bool);
            }
            o00000OO.f56623OooO0oo.observe(mixedRoomActivity, new OooOo(new OooOo00(mutableState3, mutableState4, mutableState2, mutableState)));
        }
    }
}
