package p363o0OOo00O;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.common.Player;
import androidx.media3.ui.PlayerView;
import com.code.android.util.o000O00O;
import com.yalla.android.videoplayer.exoplayer.VideoPlayerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/PlayerViewKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,303:1\n76#2:304\n76#2:352\n25#3:305\n25#3:312\n36#3:319\n50#3:326\n49#3:327\n83#3,3:334\n83#3,3:343\n25#3:353\n1097#4,6:306\n1097#4,6:313\n1097#4,6:320\n1097#4,6:328\n1097#4,6:337\n1097#4,6:346\n1097#4,6:354\n81#5:360\n107#5,2:361\n81#5:363\n107#5,2:364\n81#5:366\n81#5:367\n81#5:368\n107#5,2:369\n*S KotlinDebug\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/PlayerViewKt\n*L\n172#1:304\n238#1:352\n174#1:305\n177#1:312\n182#1:319\n188#1:326\n188#1:327\n204#1:334,3\n221#1:343,3\n240#1:353\n174#1:306,6\n177#1:313,6\n182#1:320,6\n188#1:328,6\n204#1:337,6\n221#1:346,6\n240#1:354,6\n174#1:360\n174#1:361,2\n177#1:363\n177#1:364,2\n180#1:366\n181#1:367\n240#1:368\n240#1:369,2\n*E\n"})
public final class OooOO0O {

    @SourceDebugExtension({"SMAP\nPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/PlayerViewKt$VideoPlayerView$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,303:1\n63#2,5:304\n*S KotlinDebug\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/PlayerViewKt$VideoPlayerView$1$1\n*L\n189#1:304,5\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<VideoPlayerView> f43025OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<OooO> f43026OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<VideoPlayerView> mutableState, MutableState<OooO> mutableState2) {
            super(1);
            this.f43025OooO0Oo = mutableState;
            this.f43026OooO0o0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new OooOO0(this.f43025OooO0Oo, this.f43026OooO0o0);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Context, VideoPlayerView> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ State<Function3<Float, Long, Long, Unit>> f43027OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f43028OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<OooO, Unit> f43029OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f43030OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<VideoPlayerView> f43031OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<OooO> f43032OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<OooOOO, Unit>> f43033OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(int i, long j, Function1<? super OooO, Unit> function1, MutableState<VideoPlayerView> mutableState, MutableState<OooO> mutableState2, State<? extends Function3<? super Float, ? super Long, ? super Long, Unit>> state, State<? extends Function1<? super OooOOO, Unit>> state2) {
            super(1);
            this.f43028OooO0Oo = i;
            this.f43030OooO0o0 = j;
            this.f43029OooO0o = function1;
            this.f43031OooO0oO = mutableState;
            this.f43032OooO0oo = mutableState2;
            this.f43027OooO = state;
            this.f43033OooOO0 = state2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final VideoPlayerView invoke(Context context) {
            Player player;
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            o000OO.OooOO0O<VideoPlayerView> oooOO0O = OooOOO0.f43053OooO00o;
            Context context2 = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context2, "context");
            VideoPlayerView videoPlayerViewOooO0O0 = OooOOO0.f43053OooO00o.OooO0O0();
            OooO oooO = null;
            if (videoPlayerViewOooO0O0 == null) {
                videoPlayerViewOooO0O0 = new VideoPlayerView(context2, null, 6, 0);
            }
            this.f43031OooO0oO.setValue(videoPlayerViewOooO0O0);
            videoPlayerViewOooO0O0.setResizeMode(this.f43028OooO0Oo);
            List<OooO> list = Oooo000.f43069OooO00o;
            Context context3 = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context3, "context");
            OooO oooOOooO0O0 = Oooo000.f43070OooO0O0.OooO0O0();
            if (oooOOooO0O0 == null) {
                oooOOooO0O0 = new p363o0OOo00O.OooO0o(context3);
            }
            MutableState<OooO> mutableState = this.f43032OooO0oo;
            mutableState.setValue(oooOOooO0O0);
            videoPlayerViewOooO0O0.m4197setBackgroundColor8_81llA(this.f43030OooO0o0);
            videoPlayerViewOooO0O0.setProgressUpdateListener(this.f43027OooO.getValue());
            OooO player2 = mutableState.getValue();
            Intrinsics.checkNotNull(player2);
            Intrinsics.checkNotNullParameter(player2, "player");
            videoPlayerViewOooO0O0.f22072OooO0Oo = player2;
            PlayerView playerView = videoPlayerViewOooO0O0.playerView;
            if (playerView != null) {
                playerView.setPlayer(player2.getPlayer());
            }
            OooO oooO2 = videoPlayerViewOooO0O0.f22072OooO0Oo;
            if (oooO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoPlayerControl");
            } else {
                oooO = oooO2;
            }
            oooO.OooO0OO().set(true);
            if (videoPlayerViewOooO0O0.progressUpdateListener != null) {
                videoPlayerViewOooO0O0.OooO00o();
                PlayerView playerView2 = videoPlayerViewOooO0O0.playerView;
                if (playerView2 != null && (player = playerView2.getPlayer()) != null) {
                    player.OooOOoo(new Oooo0(videoPlayerViewOooO0O0));
                }
            }
            OooO value = mutableState.getValue();
            Intrinsics.checkNotNull(value);
            this.f43029OooO0o.invoke(value);
            OooO value2 = mutableState.getValue();
            Intrinsics.checkNotNull(value2);
            value2.OooO0O0(this.f43033OooOO0.getValue());
            return videoPlayerViewOooO0O0;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<VideoPlayerView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f43034OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<OooO> f43035OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<Function3<Float, Long, Long, Unit>> f43036OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ State<Function1<OooOOO, Unit>> f43037OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(int i, State<? extends Function3<? super Float, ? super Long, ? super Long, Unit>> state, MutableState<OooO> mutableState, State<? extends Function1<? super OooOOO, Unit>> state2) {
            super(1);
            this.f43034OooO0Oo = i;
            this.f43036OooO0o0 = state;
            this.f43035OooO0o = mutableState;
            this.f43037OooO0oO = state2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VideoPlayerView videoPlayerView) {
            VideoPlayerView it = videoPlayerView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setProgressUpdateListener(this.f43036OooO0o0.getValue());
            OooO value = this.f43035OooO0o.getValue();
            Intrinsics.checkNotNull(value);
            value.OooO0O0(this.f43037OooO0oO.getValue());
            it.setResizeMode(this.f43034OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<OooOOO, Unit> f43038OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f43039OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<OooO, Unit> f43040OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f43041OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f43042OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function3<Float, Long, Long, Unit> f43043OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f43044OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f43045OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Modifier modifier, int i, Function1<? super OooO, Unit> function1, long j, Function3<? super Float, ? super Long, ? super Long, Unit> function3, Function1<? super OooOOO, Unit> function2, int i2, int i3) {
            super(2);
            this.f43039OooO0Oo = modifier;
            this.f43041OooO0o0 = i;
            this.f43040OooO0o = function1;
            this.f43042OooO0oO = j;
            this.f43043OooO0oo = function3;
            this.f43038OooO = function2;
            this.f43044OooOO0 = i2;
            this.f43045OooOO0O = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOO0O.OooO00o(this.f43039OooO0Oo, this.f43041OooO0o0, this.f43040OooO0o, this.f43042OooO0oO, this.f43043OooO0oo, this.f43038OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f43044OooOO0 | 1), this.f43045OooOO0O);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0179  */
    /* JADX WARN: Code duplicated, block: B:102:0x0181  */
    /* JADX WARN: Code duplicated, block: B:103:0x0186  */
    /* JADX WARN: Code duplicated, block: B:106:0x018a  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8 A[LOOP:0: B:114:0x01f5->B:116:0x01f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0209  */
    /* JADX WARN: Code duplicated, block: B:123:0x021c  */
    /* JADX WARN: Code duplicated, block: B:126:0x026b A[LOOP:1: B:125:0x0269->B:126:0x026b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x027c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0284  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125  */
    /* JADX WARN: Code duplicated, block: B:92:0x012e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, int i, @NotNull Function1<? super OooO, Unit> onCreatePlayControl, long j, @Nullable Function3<? super Float, ? super Long, ? super Long, Unit> function3, @Nullable Function1<? super OooOOO, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        int i8;
        int i9;
        Function3<? super Float, ? super Long, ? super Long, Unit> function4;
        int i10;
        int i11;
        Function1<? super OooOOO, Unit> function2;
        int i12;
        Modifier modifier3;
        boolean zChanged;
        long jM1707getBlack0d7_KjU;
        Object objRememberedValue;
        Composer.Companion companion;
        int i13;
        MutableState mutableState;
        Object objRememberedValue2;
        MutableState mutableState2;
        State stateRememberUpdatedState;
        State stateRememberUpdatedState2;
        boolean zChanged2;
        Object objRememberedValue3;
        VideoPlayerView videoPlayerView;
        PlayerView playerView;
        int iIntValue;
        boolean zChanged3;
        Object objRememberedValue4;
        Object[] objArr;
        int i14;
        boolean zChanged4;
        Object objRememberedValue5;
        State state;
        Object obj;
        Object[] objArr2;
        State state2;
        int i15;
        Object objRememberedValue6;
        Function1<? super OooOOO, Unit> function5;
        Modifier modifier4;
        Function3<? super Float, ? super Long, ? super Long, Unit> function6;
        long j3;
        int i16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCreatePlayControl, "onCreatePlayControl");
        Composer composerStartRestartGroup = composer.startRestartGroup(-336870665);
        int i17 = i3 & 1;
        if (i17 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i18 = i3 & 2;
        if (i18 == 0) {
            if ((i2 & 112) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                i4 |= 384;
            } else if ((i2 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(onCreatePlayControl)) {
                    i6 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 7168) == 0) {
                    j2 = j;
                    if (composerStartRestartGroup.changed(j2)) {
                        i8 = 2048;
                    } else {
                        i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((57344 & i2) == 0) {
                        function4 = function3;
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 32;
                    if (i11 != 0) {
                        i4 |= 196608;
                        function2 = function1;
                    } else {
                        function2 = function1;
                        if ((i2 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i4 |= i12;
                        }
                    }
                    if ((i4 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i17 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        zChanged = false;
                        if (i18 != 0) {
                            i5 = 0;
                        }
                        if (i7 != 0) {
                            jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                        } else {
                            jM1707getBlack0d7_KjU = j2;
                        }
                        if (i9 != 0) {
                            function4 = null;
                        }
                        if (i11 != 0) {
                            function2 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            i13 = 2;
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            i13 = 2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                        stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                        Integer numValueOf = Integer.valueOf(i5);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(numValueOf);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                            videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                            if (videoPlayerView != null) {
                                playerView = videoPlayerView.getPlayerView();
                            } else {
                                playerView = null;
                            }
                            if (playerView != null) {
                                playerView.setResizeMode(i5);
                            }
                            objRememberedValue3 = Integer.valueOf(i5);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        iIntValue = ((Number) objRememberedValue3).intValue();
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                        objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged4 = false;
                        for (i14 = 0; i14 < 7; i14++) {
                            zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                        }
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            state = stateRememberUpdatedState2;
                            obj = null;
                            OooO0O0 oooO0O0 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                            composerStartRestartGroup.updateRememberedValue(oooO0O0);
                            objRememberedValue5 = oooO0O0;
                        } else {
                            state = stateRememberUpdatedState2;
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function1 function7 = (Function1) objRememberedValue5;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                        state2 = state;
                        objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        for (i15 = 0; i15 < 4; i15++) {
                            zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                        }
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView(function7, modifierFillMaxWidth$default, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function5 = function2;
                        modifier4 = modifier3;
                        function6 = function4;
                        j3 = jM1707getBlack0d7_KjU;
                        i16 = i5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        i16 = i5;
                        j3 = j2;
                        function5 = function2;
                        function6 = function4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier4, i16, onCreatePlayControl, j3, function6, function5, i2, i3));
                }
                i4 |= 24576;
                function4 = function3;
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i2 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                }
                if ((i4 & 374491) == 74898) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    zChanged = false;
                    if (i18 != 0) {
                        i5 = 0;
                    }
                    if (i7 != 0) {
                        jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                    } else {
                        jM1707getBlack0d7_KjU = j2;
                    }
                    if (i9 != 0) {
                        function4 = null;
                    }
                    if (i11 != 0) {
                        function2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        i13 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i13 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                    Integer numValueOf2 = Integer.valueOf(i5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(numValueOf2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iIntValue = ((Number) objRememberedValue3).intValue();
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                    objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged4 = false;
                    while (i14 < 7) {
                        zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O1 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O1);
                        objRememberedValue5 = oooO0O1;
                    } else {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O2 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O2);
                        objRememberedValue5 = oooO0O2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function8 = (Function1) objRememberedValue5;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                    state2 = state;
                    objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    while (i15 < 4) {
                        zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function8, modifierFillMaxWidth$default2, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2;
                    modifier4 = modifier3;
                    function6 = function4;
                    j3 = jM1707getBlack0d7_KjU;
                    i16 = i5;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    zChanged = false;
                    if (i18 != 0) {
                        i5 = 0;
                    }
                    if (i7 != 0) {
                        jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                    } else {
                        jM1707getBlack0d7_KjU = j2;
                    }
                    if (i9 != 0) {
                        function4 = null;
                    }
                    if (i11 != 0) {
                        function2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        i13 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i13 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                    Integer numValueOf3 = Integer.valueOf(i5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(numValueOf3);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iIntValue = ((Number) objRememberedValue3).intValue();
                    Unit unit3 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                    objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged4 = false;
                    while (i14 < 7) {
                        zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O3 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O3);
                        objRememberedValue5 = oooO0O3;
                    } else {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O4 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O4);
                        objRememberedValue5 = oooO0O4;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function9 = (Function1) objRememberedValue5;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                    state2 = state;
                    objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    while (i15 < 4) {
                        zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function9, modifierFillMaxWidth$default3, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2;
                    modifier4 = modifier3;
                    function6 = function4;
                    j3 = jM1707getBlack0d7_KjU;
                    i16 = i5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier4, i16, onCreatePlayControl, j3, function6, function5, i2, i3));
            }
            i4 |= 3072;
            j2 = j;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((57344 & i2) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i2 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                }
                if ((i4 & 374491) == 74898) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    zChanged = false;
                    if (i18 != 0) {
                        i5 = 0;
                    }
                    if (i7 != 0) {
                        jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                    } else {
                        jM1707getBlack0d7_KjU = j2;
                    }
                    if (i9 != 0) {
                        function4 = null;
                    }
                    if (i11 != 0) {
                        function2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        i13 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i13 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                    Integer numValueOf4 = Integer.valueOf(i5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(numValueOf4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iIntValue = ((Number) objRememberedValue3).intValue();
                    Unit unit4 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                    objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged4 = false;
                    while (i14 < 7) {
                        zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O5 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O5);
                        objRememberedValue5 = oooO0O5;
                    } else {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O6 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O6);
                        objRememberedValue5 = oooO0O6;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function10 = (Function1) objRememberedValue5;
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                    state2 = state;
                    objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    while (i15 < 4) {
                        zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function10, modifierFillMaxWidth$default4, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2;
                    modifier4 = modifier3;
                    function6 = function4;
                    j3 = jM1707getBlack0d7_KjU;
                    i16 = i5;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    zChanged = false;
                    if (i18 != 0) {
                        i5 = 0;
                    }
                    if (i7 != 0) {
                        jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                    } else {
                        jM1707getBlack0d7_KjU = j2;
                    }
                    if (i9 != 0) {
                        function4 = null;
                    }
                    if (i11 != 0) {
                        function2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        i13 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i13 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                    Integer numValueOf5 = Integer.valueOf(i5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(numValueOf5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iIntValue = ((Number) objRememberedValue3).intValue();
                    Unit unit5 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                    objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged4 = false;
                    while (i14 < 7) {
                        zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O7 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O7);
                        objRememberedValue5 = oooO0O7;
                    } else {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O8 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O8);
                        objRememberedValue5 = oooO0O8;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function11 = (Function1) objRememberedValue5;
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                    state2 = state;
                    objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    while (i15 < 4) {
                        zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function11, modifierFillMaxWidth$default5, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2;
                    modifier4 = modifier3;
                    function6 = function4;
                    j3 = jM1707getBlack0d7_KjU;
                    i16 = i5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier4, i16, onCreatePlayControl, j3, function6, function5, i2, i3));
            }
            i4 |= 24576;
            function4 = function3;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
            }
            if ((i4 & 374491) == 74898) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                zChanged = false;
                if (i18 != 0) {
                    i5 = 0;
                }
                if (i7 != 0) {
                    jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                } else {
                    jM1707getBlack0d7_KjU = j2;
                }
                if (i9 != 0) {
                    function4 = null;
                }
                if (i11 != 0) {
                    function2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    i13 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i13 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                Integer numValueOf6 = Integer.valueOf(i5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(numValueOf6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iIntValue = ((Number) objRememberedValue3).intValue();
                Unit unit6 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(unit6, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i14 < 7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O9 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O9);
                    objRememberedValue5 = oooO0O9;
                } else {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O10 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O10);
                    objRememberedValue5 = oooO0O10;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function12 = (Function1) objRememberedValue5;
                Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                state2 = state;
                objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i15 < 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function12, modifierFillMaxWidth$default6, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2;
                modifier4 = modifier3;
                function6 = function4;
                j3 = jM1707getBlack0d7_KjU;
                i16 = i5;
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                zChanged = false;
                if (i18 != 0) {
                    i5 = 0;
                }
                if (i7 != 0) {
                    jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                } else {
                    jM1707getBlack0d7_KjU = j2;
                }
                if (i9 != 0) {
                    function4 = null;
                }
                if (i11 != 0) {
                    function2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    i13 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i13 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                Integer numValueOf7 = Integer.valueOf(i5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(numValueOf7);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iIntValue = ((Number) objRememberedValue3).intValue();
                Unit unit7 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(unit7, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i14 < 7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O11 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O11);
                    objRememberedValue5 = oooO0O11;
                } else {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O12 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O12);
                    objRememberedValue5 = oooO0O12;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function13 = (Function1) objRememberedValue5;
                Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                state2 = state;
                objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i15 < 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function13, modifierFillMaxWidth$default7, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2;
                modifier4 = modifier3;
                function6 = function4;
                j3 = jM1707getBlack0d7_KjU;
                i16 = i5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier4, i16, onCreatePlayControl, j3, function6, function5, i2, i3));
        }
        i4 |= 48;
        i5 = i;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(onCreatePlayControl)) {
                i6 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 7168) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                    i8 = 2048;
                } else {
                    i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((57344 & i2) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 32;
                if (i11 != 0) {
                    i4 |= 196608;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i2 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i4 |= i12;
                    }
                }
                if ((i4 & 374491) == 74898) {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    zChanged = false;
                    if (i18 != 0) {
                        i5 = 0;
                    }
                    if (i7 != 0) {
                        jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                    } else {
                        jM1707getBlack0d7_KjU = j2;
                    }
                    if (i9 != 0) {
                        function4 = null;
                    }
                    if (i11 != 0) {
                        function2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        i13 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i13 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                    Integer numValueOf8 = Integer.valueOf(i5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(numValueOf8);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iIntValue = ((Number) objRememberedValue3).intValue();
                    Unit unit8 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit8, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                    objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged4 = false;
                    while (i14 < 7) {
                        zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O13 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O13);
                        objRememberedValue5 = oooO0O13;
                    } else {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O14 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O14);
                        objRememberedValue5 = oooO0O14;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function14 = (Function1) objRememberedValue5;
                    Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                    state2 = state;
                    objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    while (i15 < 4) {
                        zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function14, modifierFillMaxWidth$default8, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2;
                    modifier4 = modifier3;
                    function6 = function4;
                    j3 = jM1707getBlack0d7_KjU;
                    i16 = i5;
                } else {
                    if (i17 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    zChanged = false;
                    if (i18 != 0) {
                        i5 = 0;
                    }
                    if (i7 != 0) {
                        jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                    } else {
                        jM1707getBlack0d7_KjU = j2;
                    }
                    if (i9 != 0) {
                        function4 = null;
                    }
                    if (i11 != 0) {
                        function2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        i13 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i13 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                    Integer numValueOf9 = Integer.valueOf(i5);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(numValueOf9);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                        if (videoPlayerView != null) {
                            playerView = videoPlayerView.getPlayerView();
                        } else {
                            playerView = null;
                        }
                        if (playerView != null) {
                            playerView.setResizeMode(i5);
                        }
                        objRememberedValue3 = Integer.valueOf(i5);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    iIntValue = ((Number) objRememberedValue3).intValue();
                    Unit unit9 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit9, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                    objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged4 = false;
                    while (i14 < 7) {
                        zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4) {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O15 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O15);
                        objRememberedValue5 = oooO0O15;
                    } else {
                        state = stateRememberUpdatedState2;
                        obj = null;
                        OooO0O0 oooO0O16 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O16);
                        objRememberedValue5 = oooO0O16;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function15 = (Function1) objRememberedValue5;
                    Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                    state2 = state;
                    objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    while (i15 < 4) {
                        zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function15, modifierFillMaxWidth$default9, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function5 = function2;
                    modifier4 = modifier3;
                    function6 = function4;
                    j3 = jM1707getBlack0d7_KjU;
                    i16 = i5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier4, i16, onCreatePlayControl, j3, function6, function5, i2, i3));
            }
            i4 |= 24576;
            function4 = function3;
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
            }
            if ((i4 & 374491) == 74898) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                zChanged = false;
                if (i18 != 0) {
                    i5 = 0;
                }
                if (i7 != 0) {
                    jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                } else {
                    jM1707getBlack0d7_KjU = j2;
                }
                if (i9 != 0) {
                    function4 = null;
                }
                if (i11 != 0) {
                    function2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    i13 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i13 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                Integer numValueOf10 = Integer.valueOf(i5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(numValueOf10);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iIntValue = ((Number) objRememberedValue3).intValue();
                Unit unit10 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(unit10, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i14 < 7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O17 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O17);
                    objRememberedValue5 = oooO0O17;
                } else {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O18 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O18);
                    objRememberedValue5 = oooO0O18;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function16 = (Function1) objRememberedValue5;
                Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                state2 = state;
                objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i15 < 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function16, modifierFillMaxWidth$default10, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2;
                modifier4 = modifier3;
                function6 = function4;
                j3 = jM1707getBlack0d7_KjU;
                i16 = i5;
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                zChanged = false;
                if (i18 != 0) {
                    i5 = 0;
                }
                if (i7 != 0) {
                    jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                } else {
                    jM1707getBlack0d7_KjU = j2;
                }
                if (i9 != 0) {
                    function4 = null;
                }
                if (i11 != 0) {
                    function2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    i13 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i13 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                Integer numValueOf11 = Integer.valueOf(i5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(numValueOf11);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iIntValue = ((Number) objRememberedValue3).intValue();
                Unit unit11 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(unit11, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i14 < 7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O19 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O19);
                    objRememberedValue5 = oooO0O19;
                } else {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O110 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O110);
                    objRememberedValue5 = oooO0O110;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function17 = (Function1) objRememberedValue5;
                Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                state2 = state;
                objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i15 < 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function17, modifierFillMaxWidth$default11, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2;
                modifier4 = modifier3;
                function6 = function4;
                j3 = jM1707getBlack0d7_KjU;
                i16 = i5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier4, i16, onCreatePlayControl, j3, function6, function5, i2, i3));
        }
        i4 |= 3072;
        j2 = j;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((57344 & i2) == 0) {
                function4 = function3;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            i11 = i3 & 32;
            if (i11 != 0) {
                i4 |= 196608;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i4 |= i12;
                }
            }
            if ((i4 & 374491) == 74898) {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                zChanged = false;
                if (i18 != 0) {
                    i5 = 0;
                }
                if (i7 != 0) {
                    jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                } else {
                    jM1707getBlack0d7_KjU = j2;
                }
                if (i9 != 0) {
                    function4 = null;
                }
                if (i11 != 0) {
                    function2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    i13 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i13 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                Integer numValueOf12 = Integer.valueOf(i5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(numValueOf12);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iIntValue = ((Number) objRememberedValue3).intValue();
                Unit unit12 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(unit12, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i14 < 7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O111 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O111);
                    objRememberedValue5 = oooO0O111;
                } else {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O112 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O112);
                    objRememberedValue5 = oooO0O112;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function18 = (Function1) objRememberedValue5;
                Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                state2 = state;
                objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i15 < 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function18, modifierFillMaxWidth$default12, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2;
                modifier4 = modifier3;
                function6 = function4;
                j3 = jM1707getBlack0d7_KjU;
                i16 = i5;
            } else {
                if (i17 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                zChanged = false;
                if (i18 != 0) {
                    i5 = 0;
                }
                if (i7 != 0) {
                    jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
                } else {
                    jM1707getBlack0d7_KjU = j2;
                }
                if (i9 != 0) {
                    function4 = null;
                }
                if (i11 != 0) {
                    function2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    i13 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i13 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
                Integer numValueOf13 = Integer.valueOf(i5);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(numValueOf13);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i5);
                    }
                    objRememberedValue3 = Integer.valueOf(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                iIntValue = ((Number) objRememberedValue3).intValue();
                Unit unit13 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(unit13, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
                objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i14 < 7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O113 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O113);
                    objRememberedValue5 = oooO0O113;
                } else {
                    state = stateRememberUpdatedState2;
                    obj = null;
                    OooO0O0 oooO0O114 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O114);
                    objRememberedValue5 = oooO0O114;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function19 = (Function1) objRememberedValue5;
                Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
                state2 = state;
                objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i15 < 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function19, modifierFillMaxWidth$default13, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function5 = function2;
                modifier4 = modifier3;
                function6 = function4;
                j3 = jM1707getBlack0d7_KjU;
                i16 = i5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier4, i16, onCreatePlayControl, j3, function6, function5, i2, i3));
        }
        i4 |= 24576;
        function4 = function3;
        i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= 196608;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i2 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
        }
        if ((i4 & 374491) == 74898) {
            if (i17 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            zChanged = false;
            if (i18 != 0) {
                i5 = 0;
            }
            if (i7 != 0) {
                jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
            } else {
                jM1707getBlack0d7_KjU = j2;
            }
            if (i9 != 0) {
                function4 = null;
            }
            if (i11 != 0) {
                function2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                i13 = 2;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i13 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
            Integer numValueOf14 = Integer.valueOf(i5);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(numValueOf14);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                if (videoPlayerView != null) {
                    playerView = videoPlayerView.getPlayerView();
                } else {
                    playerView = null;
                }
                if (playerView != null) {
                    playerView.setResizeMode(i5);
                }
                objRememberedValue3 = Integer.valueOf(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                if (videoPlayerView != null) {
                    playerView = videoPlayerView.getPlayerView();
                } else {
                    playerView = null;
                }
                if (playerView != null) {
                    playerView.setResizeMode(i5);
                }
                objRememberedValue3 = Integer.valueOf(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            iIntValue = ((Number) objRememberedValue3).intValue();
            Unit unit14 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit14, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
            objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged4 = false;
            while (i14 < 7) {
                zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                state = stateRememberUpdatedState2;
                obj = null;
                OooO0O0 oooO0O115 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                composerStartRestartGroup.updateRememberedValue(oooO0O115);
                objRememberedValue5 = oooO0O115;
            } else {
                state = stateRememberUpdatedState2;
                obj = null;
                OooO0O0 oooO0O116 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                composerStartRestartGroup.updateRememberedValue(oooO0O116);
                objRememberedValue5 = oooO0O116;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function110 = (Function1) objRememberedValue5;
            Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
            state2 = state;
            objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            while (i15 < 4) {
                zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
            }
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function110, modifierFillMaxWidth$default14, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function5 = function2;
            modifier4 = modifier3;
            function6 = function4;
            j3 = jM1707getBlack0d7_KjU;
            i16 = i5;
        } else {
            if (i17 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            zChanged = false;
            if (i18 != 0) {
                i5 = 0;
            }
            if (i7 != 0) {
                jM1707getBlack0d7_KjU = Color.INSTANCE.m1707getBlack0d7_KjU();
            } else {
                jM1707getBlack0d7_KjU = j2;
            }
            if (i9 != 0) {
                function4 = null;
            }
            if (i11 != 0) {
                function2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:170)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                i13 = 2;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i13 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i13, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composerStartRestartGroup, (i4 >> 12) & 14);
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i4 >> 15) & 14);
            Integer numValueOf15 = Integer.valueOf(i5);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(numValueOf15);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                if (videoPlayerView != null) {
                    playerView = videoPlayerView.getPlayerView();
                } else {
                    playerView = null;
                }
                if (playerView != null) {
                    playerView.setResizeMode(i5);
                }
                objRememberedValue3 = Integer.valueOf(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                if (videoPlayerView != null) {
                    playerView = videoPlayerView.getPlayerView();
                } else {
                    playerView = null;
                }
                if (playerView != null) {
                    playerView.setResizeMode(i5);
                }
                objRememberedValue3 = Integer.valueOf(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            iIntValue = ((Number) objRememberedValue3).intValue();
            Unit unit15 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new OooO00o(mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit15, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 6);
            objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1671boximpl(jM1707getBlack0d7_KjU), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged4 = false;
            while (i14 < 7) {
                zChanged4 |= composerStartRestartGroup.changed(objArr[i14]);
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                state = stateRememberUpdatedState2;
                obj = null;
                OooO0O0 oooO0O117 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                composerStartRestartGroup.updateRememberedValue(oooO0O117);
                objRememberedValue5 = oooO0O117;
            } else {
                state = stateRememberUpdatedState2;
                obj = null;
                OooO0O0 oooO0O118 = new OooO0O0(iIntValue, jM1707getBlack0d7_KjU, onCreatePlayControl, mutableState2, mutableState, stateRememberUpdatedState, state);
                composerStartRestartGroup.updateRememberedValue(oooO0O118);
                objRememberedValue5 = oooO0O118;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function111 = (Function1) objRememberedValue5;
            Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, obj);
            state2 = state;
            objArr2 = new Object[]{stateRememberUpdatedState, mutableState, state2, Integer.valueOf(iIntValue)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            while (i15 < 4) {
                zChanged |= composerStartRestartGroup.changed(objArr2[i15]);
            }
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new OooO0OO(iIntValue, stateRememberUpdatedState, mutableState, state2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function111, modifierFillMaxWidth$default15, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function5 = function2;
            modifier4 = modifier3;
            function6 = function4;
            j3 = jM1707getBlack0d7_KjU;
            i16 = i5;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier4, i16, onCreatePlayControl, j3, function6, function5, i2, i3));
    }
}
