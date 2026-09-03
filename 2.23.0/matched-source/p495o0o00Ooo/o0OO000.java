package p495o0o00Ooo;

import android.app.Activity;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.FrameLayout;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
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
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.data.constant.TurntableGameState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
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
import p148o00Oo0o.o0ooOOo;
import p402o0Oo0OOO.o00O000o;
import p417o0OoO0.o00000O;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p475o0o000.o00000OO;
import p572o0oOoOO0.oO000O0;
import p579o0oOoo.oOo0o00;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomTurntableGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTurntableGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTurntableGameManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,358:1\n76#2:359\n25#3:360\n25#3:367\n25#3:374\n25#3:381\n25#3:388\n50#3:395\n49#3:396\n456#3,8:421\n464#3,3:435\n456#3,8:456\n464#3,3:470\n467#3,3:477\n467#3,3:483\n1097#4,6:361\n1097#4,6:368\n1097#4,6:375\n1097#4,6:382\n1097#4,6:389\n1097#4,6:397\n154#5:403\n154#5:474\n154#5:475\n154#5:476\n154#5:482\n72#6,6:404\n78#6:438\n82#6:487\n78#7,11:410\n78#7,11:445\n91#7:480\n91#7:486\n4144#8,6:429\n4144#8,6:464\n66#9,6:439\n72#9:473\n76#9:481\n81#10:488\n*S KotlinDebug\n*F\n+ 1 RoomTurntableGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTurntableGameManager\n*L\n75#1:359\n77#1:360\n79#1:367\n81#1:374\n83#1:381\n85#1:388\n109#1:395\n109#1:396\n176#1:421,8\n176#1:435,3\n188#1:456,8\n188#1:470,3\n188#1:477,3\n176#1:483,3\n77#1:361,6\n79#1:368,6\n81#1:375,6\n83#1:382,6\n85#1:389,6\n109#1:397,6\n178#1:403\n191#1:474\n198#1:475\n200#1:476\n211#1:482\n176#1:404,6\n176#1:438\n176#1:487\n176#1:410,11\n188#1:445,11\n188#1:480\n176#1:486\n176#1:429,6\n188#1:464,6\n188#1:439,6\n188#1:473\n188#1:481\n79#1:488\n*E\n"})
public final class o0OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OO000 f48859OooO00o = new o0OO000();

    public static final class OooO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48860OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48861OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f48862OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f48863OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48864OooO0oo;

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
        public OooO(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
            super(3);
            this.f48860OooO0Oo = mutableState;
            this.f48862OooO0o0 = mutableState2;
            this.f48861OooO0o = mixedRoomActivity;
            this.f48863OooO0oO = mutableState3;
            this.f48864OooO0oo = mutableState4;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0093  */
        /* JADX WARN: Code duplicated, block: B:24:0x0097  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
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
                ComposerKt.traceEventStart(1944332031, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager.Content.<anonymous> (RoomTurntableGameManager.kt:129)");
            }
            String strStringResource2 = null;
            int i = OooO00o.$EnumSwitchMapping$0[((TurntableGameState) SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24982OooOO0O.f47424OooO0O0, null, composer2, 8, 1).getValue()).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    composer2.startReplaceableGroup(-1101860865);
                    strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Waiting, composer2, 0);
                    composer2.endReplaceableGroup();
                } else if (i != 3) {
                    if (i != 4) {
                        composer2.startReplaceableGroup(-1101860427);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1101860460);
                        composer2.endReplaceableGroup();
                    }
                    str2 = null;
                } else {
                    composer2.startReplaceableGroup(-1101860663);
                    strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.Playing, composer2, 0);
                    composer2.endReplaceableGroup();
                    str = "svga/room_turntable_start.svga";
                    str2 = str;
                }
                o0OO000 o0oo000 = o0OO000.f48859OooO00o;
                if (strStringResource2 == null) {
                    str3 = "";
                } else {
                    str3 = strStringResource2;
                }
                o0oo000.OooO0O0(str2, str3, this.f48860OooO0Oo, this.f48862OooO0o0, this.f48861OooO0o, this.f48863OooO0oO, this.f48864OooO0oo, composer2, 14388608);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            composer2.startReplaceableGroup(-1101861084);
            strStringResource = StringResources_androidKt.stringResource(oO00OOo0.room_game_box_lucky_wheel, composer2, 0);
            composer2.endReplaceableGroup();
            strStringResource2 = strStringResource;
            str = "svga/room_turntable_wait.svga";
            str2 = str;
            o0OO000 o0oo001 = o0OO000.f48859OooO00o;
            if (strStringResource2 == null) {
                str3 = "";
            } else {
                str3 = strStringResource2;
            }
            o0oo001.OooO0O0(str2, str3, this.f48860OooO0Oo, this.f48862OooO0o0, this.f48861OooO0o, this.f48863OooO0oO, this.f48864OooO0oo, composer2, 14388608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48865OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48866OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f48867OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f48868OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48869OooO0oo;

        public OooO00o(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
            this.f48865OooO0Oo = mutableState;
            this.f48867OooO0o0 = mutableState2;
            this.f48866OooO0o = mixedRoomActivity;
            this.f48868OooO0oO = mutableState3;
            this.f48869OooO0oo = mutableState4;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<Boolean> mutableState = this.f48865OooO0Oo;
            MutableState<BaseWebView> mutableState2 = this.f48867OooO0o0;
            MixedRoomActivity mixedRoomActivity = this.f48866OooO0o;
            MutableState<String> mutableState3 = this.f48868OooO0oO;
            MutableState<Boolean> mutableState4 = this.f48869OooO0oo;
            o0OO000 o0oo000 = o0OO000.f48859OooO00o;
            o00000OO o00000oo2 = com.yalla.yalla.service.room.OooO00o.f24982OooOO0O;
            if (o00000oo2.f47424OooO0O0.getValue() == TurntableGameState.Close) {
                o00000oo2.f47424OooO0O0.setValue(TurntableGameState.Setting);
            }
            o0oo000.OooO0OO(mutableState, mutableState2, mixedRoomActivity, mutableState3, mutableState4);
        }
    }

    public static final class OooO0O0 implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48870OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48871OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f48872OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f48873OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48874OooO0oo;

        public OooO0O0(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
            this.f48870OooO0Oo = mutableState;
            this.f48872OooO0o0 = mutableState2;
            this.f48871OooO0o = mixedRoomActivity;
            this.f48873OooO0oO = mutableState3;
            this.f48874OooO0oo = mutableState4;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            bool.booleanValue();
            if (com.yalla.yalla.service.room.OooO00o.f24982OooOO0O.f47426OooO0Oo.getValue().booleanValue()) {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    o0OO000.f48859OooO00o.OooO0OO(this.f48870OooO0Oo, this.f48872OooO0o0, this.f48871OooO0o, this.f48873OooO0oO, this.f48874OooO0oo);
                }
            }
        }
    }

    public static final class OooO0OO implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48875OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48876OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f48877OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f48878OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48879OooO0oo;

        public OooO0OO(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
            this.f48875OooO0Oo = mutableState;
            this.f48877OooO0o0 = mutableState2;
            this.f48876OooO0o = mixedRoomActivity;
            this.f48878OooO0oO = mutableState3;
            this.f48879OooO0oo = mutableState4;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            bool.booleanValue();
            if (com.yalla.yalla.service.room.OooO00o.f24982OooOO0O.f47424OooO0O0.getValue() != TurntableGameState.Close) {
                o0OO000.f48859OooO00o.OooO0OO(this.f48875OooO0Oo, this.f48877OooO0o0, this.f48876OooO0o, this.f48878OooO0oO, this.f48879OooO0oo);
                return;
            }
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.lucky_wheel_ended);
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    @SourceDebugExtension({"SMAP\nRoomTurntableGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomTurntableGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTurntableGameManager$Content$4$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,358:1\n63#2,5:359\n*S KotlinDebug\n*F\n+ 1 RoomTurntableGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomTurntableGameManager$Content$4$1\n*L\n110#1:359,5\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f48880OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f48881OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableState<BaseWebView> mutableState, MutableState<String> mutableState2) {
            super(1);
            this.f48880OooO0Oo = mutableState;
            this.f48881OooO0o0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0OO000o(this.f48880OooO0Oo, this.f48881OooO0o0);
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48883OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f48883OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48883OooO0o0 | 1);
            o0OO000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48885OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i) {
            super(2);
            this.f48885OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48885OooO0o0 | 1);
            o0OO000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48886OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48887OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f48888OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f48889OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48890OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
            super(0);
            this.f48886OooO0Oo = mutableState;
            this.f48888OooO0o0 = mutableState2;
            this.f48887OooO0o = mixedRoomActivity;
            this.f48889OooO0oO = mutableState3;
            this.f48890OooO0oo = mutableState4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo0oO0 onLogin = new oo0oO0(this.f48886OooO0Oo, this.f48888OooO0o0, this.f48887OooO0o, this.f48889OooO0oO, this.f48890OooO0oo);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48891OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f48893OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f48894OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48895OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f48896OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f48897OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48898OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f48899OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(String str, String str2, MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, int i) {
            super(2);
            this.f48894OooO0o0 = str;
            this.f48893OooO0o = str2;
            this.f48895OooO0oO = mutableState;
            this.f48896OooO0oo = mutableState2;
            this.f48891OooO = mixedRoomActivity;
            this.f48897OooOO0 = mutableState3;
            this.f48898OooOO0O = mutableState4;
            this.f48899OooOO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0OO000.this.OooO0O0(this.f48894OooO0o0, this.f48893OooO0o, this.f48895OooO0oO, this.f48896OooO0oo, this.f48891OooO, this.f48897OooOO0, this.f48898OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f48899OooOO0o | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48900OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f48902OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f48903OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48904OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f48905OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f48906OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48907OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f48908OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(String str, String str2, MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, int i) {
            super(2);
            this.f48903OooO0o0 = str;
            this.f48902OooO0o = str2;
            this.f48904OooO0oO = mutableState;
            this.f48905OooO0oo = mutableState2;
            this.f48900OooO = mixedRoomActivity;
            this.f48906OooOO0 = mutableState3;
            this.f48907OooOO0O = mutableState4;
            this.f48908OooOO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0OO000.this.OooO0O0(this.f48903OooO0o0, this.f48902OooO0o, this.f48904OooO0oO, this.f48905OooO0oo, this.f48900OooO, this.f48906OooOO0, this.f48907OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f48908OooOO0o | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends oO000O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48909OooO00o;

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
                o00000OO o00000oo2 = com.yalla.yalla.service.room.OooO00o.f24982OooOO0O;
                MutableStateFlow<Boolean> mutableStateFlow = o00000oo2.f47426OooO0Oo;
                Boolean bool = Boolean.FALSE;
                mutableStateFlow.setValue(bool);
                o00000oo2.f47425OooO0OO.setValue(bool);
                return Unit.INSTANCE;
            }
        }

        public OooOo(MixedRoomActivity mixedRoomActivity) {
            this.f48909OooO00o = mixedRoomActivity;
        }

        @Override // p572o0oOoOO0.oO000O0
        public final void onClosePage() {
            com.yalla.yalla.service.room.OooO00o.f24982OooOO0O.f47424OooO0O0.setValue(TurntableGameState.Close);
        }

        @Override // p572o0oOoOO0.oO000O0
        @JavascriptInterface
        public void zoomOut() {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f48909OooO00o), null, null, new OooO00o(null), 3, null);
        }
    }

    public static final class OooOo00 implements BaseWebView.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48910OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48911OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f48912OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f48913OooO0Oo;

        public OooOo00(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<BaseWebView> mutableState3, MutableState<String> mutableState4) {
            this.f48910OooO00o = mutableState;
            this.f48911OooO0O0 = mutableState2;
            this.f48912OooO0OO = mutableState3;
            this.f48913OooO0Oo = mutableState4;
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO00o(int i) {
        }

        @Override // com.yalla.yalla.ui.view.webView.BaseWebView.OooO0OO
        public final void OooO0O0(boolean z) {
            p592o0oo00O.OooOOO0.OooO0OO("createAndShowGame", "success = " + z);
            Boolean bool = Boolean.FALSE;
            MutableState<Boolean> mutableState = this.f48910OooO00o;
            mutableState.setValue(bool);
            Boolean bool2 = Boolean.TRUE;
            this.f48911OooO0O0.setValue(bool2);
            if (z) {
                o00000OO o00000oo2 = com.yalla.yalla.service.room.OooO00o.f24982OooOO0O;
                if (o00000oo2.f47424OooO0O0.getValue() != TurntableGameState.Close) {
                    o00000oo2.f47426OooO0Oo.setValue(bool2);
                    o00000oo2.f47425OooO0OO.setValue(bool2);
                    return;
                }
                return;
            }
            this.f48913OooO0Oo.setValue("");
            mutableState.setValue(bool);
            BaseWebView value = this.f48912OooO0OO.getValue();
            if (value != null) {
                o000OO00.OooO0O0(value);
            }
            com.yalla.yalla.service.room.OooO00o.f24982OooOO0O.f47423OooO00o.setValue(bool);
        }
    }

    public static final class Oooo0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f48914OooO0Oo;

        public Oooo0(Oooo000 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f48914OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f48914OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f48914OooO0Oo;
        }

        public final int hashCode() {
            return this.f48914OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48914OooO0Oo.invoke(obj);
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f48915OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<BaseWebView> f48916OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48917OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f48918OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<BaseWebView> mutableState3, MutableState<Boolean> mutableState4) {
            super(1);
            this.f48915OooO0Oo = mutableState;
            this.f48917OooO0o0 = mutableState2;
            this.f48916OooO0o = mutableState3;
            this.f48918OooO0oO = mutableState4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            MutableState<String> mutableState = this.f48915OooO0Oo;
            boolean zAreEqual = Intrinsics.areEqual(mutableState.getValue(), it);
            MutableState<Boolean> mutableState2 = this.f48918OooO0oO;
            MutableState<Boolean> mutableState3 = this.f48917OooO0o0;
            if (zAreEqual) {
                if (mutableState3.getValue().booleanValue()) {
                    o00000OO o00000oo2 = com.yalla.yalla.service.room.OooO00o.f24982OooOO0O;
                    MutableStateFlow<Boolean> mutableStateFlow = o00000oo2.f47426OooO0Oo;
                    Boolean bool = Boolean.TRUE;
                    mutableStateFlow.setValue(bool);
                    o00000oo2.f47425OooO0OO.setValue(bool);
                }
                mutableState2.setValue(Boolean.FALSE);
            } else {
                mutableState3.setValue(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(it, "it");
                mutableState.setValue(it);
                String strOooO0O0 = oOo0o00.OooO0O0(oOo0o00.OooO0OO(oOo0o00.OooO00o(it), null), ContributionFragment.ARG_1, String.valueOf(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue()));
                p592o0oo00O.OooOOO0.OooO0OO("SharedUrlManager", "url = " + strOooO0O0);
                BaseWebView value = this.f48916OooO0o.getValue();
                if (value != null) {
                    value.loadUrl(strOooO0O0);
                }
                mutableState2.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0200  */
    /* JADX WARN: Code duplicated, block: B:80:0x0225  */
    /* JADX WARN: Code duplicated, block: B:82:0x022d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0233  */
    /* JADX WARN: Code duplicated, block: B:86:0x0246  */
    /* JADX WARN: Code duplicated, block: B:88:0x024e  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d6  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        int i2;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        boolean zChanged;
        Object objRememberedValue;
        BaseWebView baseWebView;
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
                ComposerKt.traceEventStart(1418020567, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager.Content (RoomTurntableGameManager.kt:73)");
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
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(i));
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
            MutableState mutableState5 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(mixedRoomActivity.findViewById(oO00O0oO.v_room_root), null, 2, null);
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
            MutableState mutableState7 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState8 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState9 = (MutableState) objRememberedValue6;
            Observable<Object> observable = LiveEventBus.get("OPEN_TURNTABKE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.OPEN_TURNTABKE_GAME)");
            o00000O.OooO00o(observable, new OooO00o(mutableState5, mutableState7, mixedRoomActivity, mutableState8, mutableState9), composerStartRestartGroup, 8);
            o00000OO o00000oo2 = com.yalla.yalla.service.room.OooO00o.f24982OooOO0O;
            Object value = SnapshotStateKt.collectAsState(o00000oo2.f47424OooO0O0, null, composerStartRestartGroup, 8, 1).getValue();
            TurntableGameState turntableGameState = TurntableGameState.Close;
            boolean z = false;
            MutableStateFlow<Boolean> mutableStateFlow = o00000oo2.f47425OooO0OO;
            if (value == turntableGameState) {
                Boolean bool = Boolean.FALSE;
                mutableState9.setValue(bool);
                BaseWebView baseWebView3 = (BaseWebView) mutableState7.getValue();
                if ((baseWebView3 != null ? baseWebView3.getParent() : null) != null && o000OO00.OooO0o0(baseWebView3)) {
                    o00000oo2.f47426OooO0Oo.setValue(Boolean.TRUE);
                }
                mutableStateFlow.setValue(bool);
                mutableState = mutableState8;
                mutableState.setValue("");
                mutableState5.setValue(bool);
                BaseWebView baseWebView4 = (BaseWebView) mutableState7.getValue();
                if ((baseWebView4 != null ? baseWebView4.getParent() : null) != null && o000OO00.OooO0o0(baseWebView4)) {
                    mutableState2 = mutableState7;
                    LifecycleOwnerKt.getLifecycleScope(mixedRoomActivity).launchWhenCreated(new oo0ooO(mutableState2, null));
                }
                Intrinsics.checkNotNullParameter("Turntable_Wait", "key");
                Observable observable2 = LiveEventBus.get("roomTurntable_Wait", Object.class);
                Intrinsics.checkNotNullExpressionValue(observable2, "get(\"room$key\", Any::class.java)");
                mutableState3 = mutableState2;
                mutableState4 = mutableState;
                MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
                o00000O.OooO00o(observable2, new OooO0O0(mutableState5, mutableState3, mixedRoomActivity2, mutableState4, mutableState9), composerStartRestartGroup, 8);
                Intrinsics.checkNotNullParameter("Turntable_Open", "key");
                Observable observable3 = LiveEventBus.get("roomTurntable_Open", Object.class);
                Intrinsics.checkNotNullExpressionValue(observable3, "get(\"room$key\", Any::class.java)");
                o00000O.OooO00o(observable3, new OooO0OO(mutableState5, mutableState3, mixedRoomActivity2, mutableState4, mutableState9), composerStartRestartGroup, 8);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(mutableState3) | composerStartRestartGroup.changed(mutableState4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new OooO0o(mutableState3, mutableState4);
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
                        o000OO00.OooOOOO(baseWebView2);
                    }
                } else {
                    baseWebView = (BaseWebView) mutableState3.getValue();
                    if (baseWebView != null) {
                        o000OO00.OooO0O0(baseWebView);
                    }
                }
                composerStartRestartGroup.startReplaceableGroup(1689153791);
                if (!((Boolean) SnapshotStateKt.collectAsState(mutableStateFlow, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue() && SnapshotStateKt.collectAsState(o00000oo2.f47424OooO0O0, null, composerStartRestartGroup, 8, 1).getValue() != turntableGameState) {
                    z = true;
                }
                composerStartRestartGroup.endReplaceableGroup();
                AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1944332031, true, new OooO(mutableState5, mutableState3, mixedRoomActivity, mutableState4, mutableState9)), composerStartRestartGroup, 200064, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                mutableState = mutableState8;
            }
            mutableState2 = mutableState7;
            Intrinsics.checkNotNullParameter("Turntable_Wait", "key");
            Observable observable4 = LiveEventBus.get("roomTurntable_Wait", Object.class);
            Intrinsics.checkNotNullExpressionValue(observable4, "get(\"room$key\", Any::class.java)");
            mutableState3 = mutableState2;
            mutableState4 = mutableState;
            MixedRoomActivity mixedRoomActivity3 = mixedRoomActivity;
            o00000O.OooO00o(observable4, new OooO0O0(mutableState5, mutableState3, mixedRoomActivity3, mutableState4, mutableState9), composerStartRestartGroup, 8);
            Intrinsics.checkNotNullParameter("Turntable_Open", "key");
            Observable observable5 = LiveEventBus.get("roomTurntable_Open", Object.class);
            Intrinsics.checkNotNullExpressionValue(observable5, "get(\"room$key\", Any::class.java)");
            o00000O.OooO00o(observable5, new OooO0OO(mutableState5, mutableState3, mixedRoomActivity3, mutableState4, mutableState9), composerStartRestartGroup, 8);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(mutableState3) | composerStartRestartGroup.changed(mutableState4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO0o(mutableState3, mutableState4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO0o(mutableState3, mutableState4);
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
                    o000OO00.OooOOOO(baseWebView2);
                }
            } else {
                baseWebView = (BaseWebView) mutableState3.getValue();
                if (baseWebView != null) {
                    o000OO00.OooO0O0(baseWebView);
                }
            }
            composerStartRestartGroup.startReplaceableGroup(1689153791);
            if (!((Boolean) SnapshotStateKt.collectAsState(mutableStateFlow, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
                z = true;
            }
            composerStartRestartGroup.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1944332031, true, new OooO(mutableState5, mutableState3, mixedRoomActivity, mutableState4, mutableState9)), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0(i));
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
            ComposerKt.traceEventStart(1539261329, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomTurntableGameManager.RoomTurntableGame (RoomTurntableGameManager.kt:162)");
        }
        if (TextUtils.isEmpty(str)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(str, text, showProgress, webView, activity, currentUrl, loadFinish, i));
            return;
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(10), 0.0f, 0.0f, 13, null), 0.0f, 1, null), false, false, 0L, false, null, null, null, new OooOOO(showProgress, webView, activity, currentUrl, loadFinish), 253);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooOOO0.OooO0O0(Arrangement.INSTANCE, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Intrinsics.checkNotNull(str);
        p154o00OoO00.OooOo00.OooO00o(str, true, 0, null, null, boxScopeInstance.align(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), companion2.getCenter()), composerStartRestartGroup, 48, 28);
        composerStartRestartGroup.startReplaceableGroup(-655193237);
        if (showProgress.getValue().booleanValue()) {
            ProgressIndicatorKt.m1137CircularProgressIndicatorLxG7B9w(boxScopeInstance.align(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(32)), companion2.getCenter()), 0L, Dp.m3765constructorimpl(3), 0L, 0, composerStartRestartGroup, 384, 26);
        }
        o0ooOOo.OooO00o(composerStartRestartGroup);
        TextKt.m1251Text4IGK_g(text, PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(4), 0.0f, 0.0f, 13, null), o0oO0O0o.f46958OooOOOO, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3671getCentere0LSkKk()), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i >> 3) & 14) | 3120, 3072, 122352);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOOO(str, text, showProgress, webView, activity, currentUrl, loadFinish, i));
    }

    public final synchronized void OooO0OO(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        T value = o000000O.OooOo0O().getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(value, bool)) {
            if (mutableState2.getValue() == null) {
                BaseWebView baseWebView = new BaseWebView(mixedRoomActivity);
                baseWebView.setBackgroundColor(0);
                baseWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                mutableState2.setValue(baseWebView);
                BaseWebView value2 = mutableState2.getValue();
                if (value2 != null) {
                    value2.setLoadStateListener(new OooOo00(mutableState, mutableState4, mutableState2, mutableState3));
                }
                BaseWebView value3 = mutableState2.getValue();
                if (value3 != null) {
                    value3.addJavascriptInterface(new OooOo(mixedRoomActivity), "Yalla");
                }
                mutableState.setValue(bool);
            }
            o00O000o.f44497OooO0oo.observe(mixedRoomActivity, new Oooo0(new Oooo000(mutableState3, mutableState4, mutableState2, mutableState)));
        }
    }
}
