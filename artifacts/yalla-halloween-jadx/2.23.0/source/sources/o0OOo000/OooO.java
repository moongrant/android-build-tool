package o0OOo000;

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
import com.code.android.util.o000O0;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.StyledPlayerView;
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

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/PlayerViewKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,301:1\n76#2:302\n76#2:350\n25#3:303\n25#3:310\n36#3:317\n50#3:324\n49#3:325\n83#3,3:332\n83#3,3:341\n25#3:351\n1097#4,6:304\n1097#4,6:311\n1097#4,6:318\n1097#4,6:326\n1097#4,6:335\n1097#4,6:344\n1097#4,6:352\n81#5:358\n107#5,2:359\n81#5:361\n107#5,2:362\n81#5:364\n81#5:365\n81#5:366\n107#5,2:367\n*S KotlinDebug\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/PlayerViewKt\n*L\n170#1:302\n236#1:350\n172#1:303\n175#1:310\n180#1:317\n186#1:324\n186#1:325\n202#1:332,3\n219#1:341,3\n238#1:351\n172#1:304,6\n175#1:311,6\n180#1:318,6\n186#1:326,6\n202#1:335,6\n219#1:344,6\n238#1:352,6\n172#1:358\n172#1:359,2\n175#1:361\n175#1:362,2\n178#1:364\n179#1:365\n238#1:366\n238#1:367,2\n*E\n"})
public final class OooO {

    @SourceDebugExtension({"SMAP\nPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/PlayerViewKt$VideoPlayerView$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,301:1\n63#2,5:302\n*S KotlinDebug\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/PlayerViewKt$VideoPlayerView$1$1\n*L\n187#1:302,5\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<VideoPlayerView> f43814OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f43815OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<VideoPlayerView> mutableState, MutableState<o0OOo000.OooO0OO> mutableState2) {
            super(1);
            this.f43814OooO0Oo = mutableState;
            this.f43815OooO0o0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0OOo000.OooO0o(this.f43814OooO0Oo, this.f43815OooO0o0);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Context, VideoPlayerView> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ State<Function3<Float, Long, Long, Unit>> f43816OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f43817OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<o0OOo000.OooO0OO, Unit> f43818OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f43819OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableState<VideoPlayerView> f43820OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f43821OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<OooOO0O, Unit>> f43822OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(int i, long j, Function1<? super o0OOo000.OooO0OO, Unit> function1, MutableState<VideoPlayerView> mutableState, MutableState<o0OOo000.OooO0OO> mutableState2, State<? extends Function3<? super Float, ? super Long, ? super Long, Unit>> state, State<? extends Function1<? super OooOO0O, Unit>> state2) {
            super(1);
            this.f43817OooO0Oo = i;
            this.f43819OooO0o0 = j;
            this.f43818OooO0o = function1;
            this.f43820OooO0oO = mutableState;
            this.f43821OooO0oo = mutableState2;
            this.f43816OooO = state;
            this.f43822OooOO0 = state2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final VideoPlayerView invoke(Context context) {
            Player player;
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            o000OO.OooOO0O<VideoPlayerView> oooOO0O = OooOO0.f43850OooO00o;
            Context context2 = o000O0.OooO00o();
            Intrinsics.checkNotNullParameter(context2, "context");
            VideoPlayerView videoPlayerViewOooO0O0 = OooOO0.f43850OooO00o.OooO0O0();
            o0OOo000.OooO0OO oooO0OO = null;
            if (videoPlayerViewOooO0O0 == null) {
                videoPlayerViewOooO0O0 = new VideoPlayerView(context2, null, 6, 0);
            }
            this.f43820OooO0oO.setValue(videoPlayerViewOooO0O0);
            videoPlayerViewOooO0O0.setResizeMode(this.f43817OooO0Oo);
            List<o0OOo000.OooO0OO> list = OooOOOO.f43866OooO00o;
            Context context3 = o000O0.OooO00o();
            Intrinsics.checkNotNullParameter(context3, "context");
            o0OOo000.OooO0OO oooO0OOOooO0O0 = OooOOOO.f43867OooO0O0.OooO0O0();
            if (oooO0OOOooO0O0 == null) {
                oooO0OOOooO0O0 = new o0OOo000.OooO0O0(context3);
            }
            MutableState<o0OOo000.OooO0OO> mutableState = this.f43821OooO0oo;
            mutableState.setValue(oooO0OOOooO0O0);
            videoPlayerViewOooO0O0.m4195setBackgroundColor8_81llA(this.f43819OooO0o0);
            videoPlayerViewOooO0O0.setProgressUpdateListener(this.f43816OooO.getValue());
            o0OOo000.OooO0OO player2 = mutableState.getValue();
            Intrinsics.checkNotNull(player2);
            Intrinsics.checkNotNullParameter(player2, "player");
            videoPlayerViewOooO0O0.f22545OooO0Oo = player2;
            StyledPlayerView styledPlayerView = videoPlayerViewOooO0O0.playerView;
            if (styledPlayerView != null) {
                styledPlayerView.setPlayer(player2.getPlayer());
            }
            o0OOo000.OooO0OO oooO0OO2 = videoPlayerViewOooO0O0.f22545OooO0Oo;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoPlayerControl");
            } else {
                oooO0OO = oooO0OO2;
            }
            oooO0OO.OooO0Oo().set(true);
            if (videoPlayerViewOooO0O0.progressUpdateListener != null) {
                videoPlayerViewOooO0O0.OooO00o();
                StyledPlayerView styledPlayerView2 = videoPlayerViewOooO0O0.playerView;
                if (styledPlayerView2 != null && (player = styledPlayerView2.getPlayer()) != null) {
                    player.Ooooo00(new OooOo00(videoPlayerViewOooO0O0));
                }
            }
            o0OOo000.OooO0OO value = mutableState.getValue();
            Intrinsics.checkNotNull(value);
            this.f43818OooO0o.invoke(value);
            o0OOo000.OooO0OO value2 = mutableState.getValue();
            Intrinsics.checkNotNull(value2);
            value2.OooO0OO(this.f43822OooOO0.getValue());
            return videoPlayerViewOooO0O0;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<VideoPlayerView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f43823OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0OOo000.OooO0OO> f43824OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<Function3<Float, Long, Long, Unit>> f43825OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ State<Function1<OooOO0O, Unit>> f43826OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(int i, State<? extends Function3<? super Float, ? super Long, ? super Long, Unit>> state, MutableState<o0OOo000.OooO0OO> mutableState, State<? extends Function1<? super OooOO0O, Unit>> state2) {
            super(1);
            this.f43823OooO0Oo = i;
            this.f43825OooO0o0 = state;
            this.f43824OooO0o = mutableState;
            this.f43826OooO0oO = state2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VideoPlayerView videoPlayerView) {
            VideoPlayerView it = videoPlayerView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setProgressUpdateListener(this.f43825OooO0o0.getValue());
            o0OOo000.OooO0OO value = this.f43824OooO0o.getValue();
            Intrinsics.checkNotNull(value);
            value.OooO0OO(this.f43826OooO0oO.getValue());
            it.setResizeMode(this.f43823OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<OooOO0O, Unit> f43827OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f43828OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<o0OOo000.OooO0OO, Unit> f43829OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f43830OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f43831OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function3<Float, Long, Long, Unit> f43832OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f43833OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f43834OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Modifier modifier, int i, Function1<? super o0OOo000.OooO0OO, Unit> function1, long j, Function3<? super Float, ? super Long, ? super Long, Unit> function3, Function1<? super OooOO0O, Unit> function2, int i2, int i3) {
            super(2);
            this.f43828OooO0Oo = modifier;
            this.f43830OooO0o0 = i;
            this.f43829OooO0o = function1;
            this.f43831OooO0oO = j;
            this.f43832OooO0oo = function3;
            this.f43827OooO = function2;
            this.f43833OooOO0 = i2;
            this.f43834OooOO0O = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooO.OooO00o(this.f43828OooO0Oo, this.f43830OooO0o0, this.f43829OooO0o, this.f43831OooO0oO, this.f43832OooO0oo, this.f43827OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f43833OooOO0 | 1), this.f43834OooOO0O);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0157  */
    /* JADX WARN: Code duplicated, block: B:104:0x016b  */
    /* JADX WARN: Code duplicated, block: B:107:0x019c  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:112:0x01af  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01de  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:125:0x0221 A[LOOP:0: B:123:0x021e->B:125:0x0221, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x0232  */
    /* JADX WARN: Code duplicated, block: B:132:0x0245  */
    /* JADX WARN: Code duplicated, block: B:135:0x0296 A[LOOP:1: B:134:0x0294->B:135:0x0296, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02af  */
    /* JADX WARN: Code duplicated, block: B:143:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:148:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, int i, @NotNull Function1<? super o0OOo000.OooO0OO, Unit> onCreatePlayControl, long j, @Nullable Function3<? super Float, ? super Long, ? super Long, Unit> function3, @Nullable Function1<? super OooOO0O, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        long jM1696getBlack0d7_KjU;
        int i6;
        Function3<? super Float, ? super Long, ? super Long, Unit> function4;
        int i7;
        int i8;
        Function1<? super OooOO0O, Unit> function2;
        int i9;
        boolean zChanged;
        Modifier modifier3;
        long j2;
        Function1<? super OooOO0O, Unit> function5;
        Function3<? super Float, ? super Long, ? super Long, Unit> function6;
        Modifier modifier4;
        int i10;
        Object objRememberedValue;
        Composer.Companion companion;
        int i11;
        MutableState mutableState;
        Object objRememberedValue2;
        MutableState mutableState2;
        State stateRememberUpdatedState;
        State stateRememberUpdatedState2;
        boolean zChanged2;
        Object objRememberedValue3;
        VideoPlayerView videoPlayerView;
        StyledPlayerView playerView;
        int iIntValue;
        boolean zChanged3;
        Object objRememberedValue4;
        Object[] objArr;
        int i12;
        boolean zChanged4;
        Object objRememberedValue5;
        State state;
        State state2;
        Object[] objArr2;
        State state3;
        State state4;
        int i13;
        Object objRememberedValue6;
        Modifier modifier5;
        int i14;
        Function3<? super Float, ? super Long, ? super Long, Unit> function7;
        long j3;
        Function1<? super OooOO0O, Unit> function8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCreatePlayControl, "onCreatePlayControl");
        Composer composerStartRestartGroup = composer.startRestartGroup(-336870665);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2) == 0) {
                i5 = i;
                int i16 = composerStartRestartGroup.changed(i5) ? 32 : 16;
                i4 |= i16;
            } else {
                i5 = i;
            }
            i4 |= i16;
        } else {
            i5 = i;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCreatePlayControl) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i17 = i3 & 8;
        if (i17 == 0) {
            if ((i2 & 7168) == 0) {
                jM1696getBlack0d7_KjU = j;
                i4 |= composerStartRestartGroup.changed(jM1696getBlack0d7_KjU) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((57344 & i2) == 0) {
                    function4 = function3;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i4 |= 196608;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i2 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                }
                if ((i4 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    zChanged = false;
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                            i5 = 0;
                        }
                        if (i17 != 0) {
                            jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            modifier4 = modifier3;
                            j2 = jM1696getBlack0d7_KjU;
                            function5 = null;
                            function6 = function4;
                        } else {
                            j2 = jM1696getBlack0d7_KjU;
                            function5 = function2;
                            function6 = function4;
                            modifier4 = modifier3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = function2;
                        function6 = function4;
                        modifier4 = modifier2;
                    }
                    i10 = i5;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:161)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        i11 = 2;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i11 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i11, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function6, composerStartRestartGroup, (i4 >> 12) & 14);
                    stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function5, composerStartRestartGroup, (i4 >> 15) & 14);
                    Integer numValueOf = Integer.valueOf(i10);
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
                            playerView.setResizeMode(i10);
                        }
                        objRememberedValue3 = Integer.valueOf(i10);
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
                    objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1660boximpl(j2), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged4 = false;
                    for (i12 = 0; i12 < 7; i12++) {
                        zChanged4 |= composerStartRestartGroup.changed(objArr[i12]);
                    }
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        state = stateRememberUpdatedState2;
                        state2 = stateRememberUpdatedState;
                        OooO0O0 oooO0O0 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                        composerStartRestartGroup.updateRememberedValue(oooO0O0);
                        objRememberedValue5 = oooO0O0;
                    } else {
                        state = stateRememberUpdatedState2;
                        state2 = stateRememberUpdatedState;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function1 function9 = (Function1) objRememberedValue5;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier4), 0.0f, 1, null);
                    state3 = state2;
                    state4 = state;
                    objArr2 = new Object[]{state3, mutableState, state4, Integer.valueOf(iIntValue)};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    for (i13 = 0; i13 < 4; i13++) {
                        zChanged |= composerStartRestartGroup.changed(objArr2[i13]);
                    }
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function9, modifierFillMaxWidth$default, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    i14 = i10;
                    function7 = function6;
                    j3 = j2;
                    function8 = function5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    i14 = i5;
                    j3 = jM1696getBlack0d7_KjU;
                    function8 = function2;
                    function7 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier5, i14, onCreatePlayControl, j3, function7, function8, i2, i3));
            }
            i4 |= 24576;
            function4 = function3;
            i8 = i3 & 32;
            if (i8 != 0) {
                i4 |= 196608;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
            }
            if ((i4 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                zChanged = false;
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        i5 = 0;
                    }
                    if (i17 != 0) {
                        jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        modifier4 = modifier3;
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = null;
                        function6 = function4;
                    } else {
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = function2;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        i5 = 0;
                    }
                    if (i17 != 0) {
                        jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        modifier4 = modifier3;
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = null;
                        function6 = function4;
                    } else {
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = function2;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                }
                i10 = i5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:161)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    i11 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i11 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i11, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function6, composerStartRestartGroup, (i4 >> 12) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function5, composerStartRestartGroup, (i4 >> 15) & 14);
                Integer numValueOf2 = Integer.valueOf(i10);
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
                        playerView.setResizeMode(i10);
                    }
                    objRememberedValue3 = Integer.valueOf(i10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i10);
                    }
                    objRememberedValue3 = Integer.valueOf(i10);
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
                objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1660boximpl(j2), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i12 < 7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i12]);
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    state = stateRememberUpdatedState2;
                    state2 = stateRememberUpdatedState;
                    OooO0O0 oooO0O1 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O1);
                    objRememberedValue5 = oooO0O1;
                } else {
                    state = stateRememberUpdatedState2;
                    state2 = stateRememberUpdatedState;
                    OooO0O0 oooO0O2 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O2);
                    objRememberedValue5 = oooO0O2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function10 = (Function1) objRememberedValue5;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier4), 0.0f, 1, null);
                state3 = state2;
                state4 = state;
                objArr2 = new Object[]{state3, mutableState, state4, Integer.valueOf(iIntValue)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i13 < 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr2[i13]);
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function10, modifierFillMaxWidth$default2, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                i14 = i10;
                function7 = function6;
                j3 = j2;
                function8 = function5;
            } else {
                composerStartRestartGroup.startDefaults();
                zChanged = false;
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        i5 = 0;
                    }
                    if (i17 != 0) {
                        jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        modifier4 = modifier3;
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = null;
                        function6 = function4;
                    } else {
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = function2;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        i5 = 0;
                    }
                    if (i17 != 0) {
                        jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        modifier4 = modifier3;
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = null;
                        function6 = function4;
                    } else {
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = function2;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                }
                i10 = i5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:161)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    i11 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i11 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i11, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function6, composerStartRestartGroup, (i4 >> 12) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function5, composerStartRestartGroup, (i4 >> 15) & 14);
                Integer numValueOf3 = Integer.valueOf(i10);
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
                        playerView.setResizeMode(i10);
                    }
                    objRememberedValue3 = Integer.valueOf(i10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i10);
                    }
                    objRememberedValue3 = Integer.valueOf(i10);
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
                objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1660boximpl(j2), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i12 < 7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i12]);
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    state = stateRememberUpdatedState2;
                    state2 = stateRememberUpdatedState;
                    OooO0O0 oooO0O3 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O3);
                    objRememberedValue5 = oooO0O3;
                } else {
                    state = stateRememberUpdatedState2;
                    state2 = stateRememberUpdatedState;
                    OooO0O0 oooO0O4 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O4);
                    objRememberedValue5 = oooO0O4;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function11 = (Function1) objRememberedValue5;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier4), 0.0f, 1, null);
                state3 = state2;
                state4 = state;
                objArr2 = new Object[]{state3, mutableState, state4, Integer.valueOf(iIntValue)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i13 < 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr2[i13]);
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function11, modifierFillMaxWidth$default3, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                i14 = i10;
                function7 = function6;
                j3 = j2;
                function8 = function5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier5, i14, onCreatePlayControl, j3, function7, function8, i2, i3));
        }
        i4 |= 3072;
        jM1696getBlack0d7_KjU = j;
        i6 = i3 & 16;
        if (i6 != 0) {
            if ((57344 & i2) == 0) {
                function4 = function3;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            i8 = i3 & 32;
            if (i8 != 0) {
                i4 |= 196608;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
            }
            if ((i4 & 374491) == 74898) {
                composerStartRestartGroup.startDefaults();
                zChanged = false;
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        i5 = 0;
                    }
                    if (i17 != 0) {
                        jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        modifier4 = modifier3;
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = null;
                        function6 = function4;
                    } else {
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = function2;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        i5 = 0;
                    }
                    if (i17 != 0) {
                        jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        modifier4 = modifier3;
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = null;
                        function6 = function4;
                    } else {
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = function2;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                }
                i10 = i5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:161)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    i11 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i11 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i11, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function6, composerStartRestartGroup, (i4 >> 12) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function5, composerStartRestartGroup, (i4 >> 15) & 14);
                Integer numValueOf4 = Integer.valueOf(i10);
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
                        playerView.setResizeMode(i10);
                    }
                    objRememberedValue3 = Integer.valueOf(i10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i10);
                    }
                    objRememberedValue3 = Integer.valueOf(i10);
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
                objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1660boximpl(j2), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i12 < 7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i12]);
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    state = stateRememberUpdatedState2;
                    state2 = stateRememberUpdatedState;
                    OooO0O0 oooO0O5 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O5);
                    objRememberedValue5 = oooO0O5;
                } else {
                    state = stateRememberUpdatedState2;
                    state2 = stateRememberUpdatedState;
                    OooO0O0 oooO0O6 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O6);
                    objRememberedValue5 = oooO0O6;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function12 = (Function1) objRememberedValue5;
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier4), 0.0f, 1, null);
                state3 = state2;
                state4 = state;
                objArr2 = new Object[]{state3, mutableState, state4, Integer.valueOf(iIntValue)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i13 < 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr2[i13]);
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function12, modifierFillMaxWidth$default4, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                i14 = i10;
                function7 = function6;
                j3 = j2;
                function8 = function5;
            } else {
                composerStartRestartGroup.startDefaults();
                zChanged = false;
                if ((i2 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        i5 = 0;
                    }
                    if (i17 != 0) {
                        jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        modifier4 = modifier3;
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = null;
                        function6 = function4;
                    } else {
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = function2;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                        i5 = 0;
                    }
                    if (i17 != 0) {
                        jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        modifier4 = modifier3;
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = null;
                        function6 = function4;
                    } else {
                        j2 = jM1696getBlack0d7_KjU;
                        function5 = function2;
                        function6 = function4;
                        modifier4 = modifier3;
                    }
                }
                i10 = i5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:161)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    i11 = 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i11 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i11, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function6, composerStartRestartGroup, (i4 >> 12) & 14);
                stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function5, composerStartRestartGroup, (i4 >> 15) & 14);
                Integer numValueOf5 = Integer.valueOf(i10);
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
                        playerView.setResizeMode(i10);
                    }
                    objRememberedValue3 = Integer.valueOf(i10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                    if (videoPlayerView != null) {
                        playerView = videoPlayerView.getPlayerView();
                    } else {
                        playerView = null;
                    }
                    if (playerView != null) {
                        playerView.setResizeMode(i10);
                    }
                    objRememberedValue3 = Integer.valueOf(i10);
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
                objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1660boximpl(j2), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged4 = false;
                while (i12 < 7) {
                    zChanged4 |= composerStartRestartGroup.changed(objArr[i12]);
                }
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged4) {
                    state = stateRememberUpdatedState2;
                    state2 = stateRememberUpdatedState;
                    OooO0O0 oooO0O7 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O7);
                    objRememberedValue5 = oooO0O7;
                } else {
                    state = stateRememberUpdatedState2;
                    state2 = stateRememberUpdatedState;
                    OooO0O0 oooO0O8 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                    composerStartRestartGroup.updateRememberedValue(oooO0O8);
                    objRememberedValue5 = oooO0O8;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function1 function13 = (Function1) objRememberedValue5;
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier4), 0.0f, 1, null);
                state3 = state2;
                state4 = state;
                objArr2 = new Object[]{state3, mutableState, state4, Integer.valueOf(iIntValue)};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                while (i13 < 4) {
                    zChanged |= composerStartRestartGroup.changed(objArr2[i13]);
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function13, modifierFillMaxWidth$default5, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                i14 = i10;
                function7 = function6;
                j3 = j2;
                function8 = function5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier5, i14, onCreatePlayControl, j3, function7, function8, i2, i3));
        }
        i4 |= 24576;
        function4 = function3;
        i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= 196608;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i2 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
        }
        if ((i4 & 374491) == 74898) {
            composerStartRestartGroup.startDefaults();
            zChanged = false;
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                    i5 = 0;
                }
                if (i17 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                }
                if (i6 != 0) {
                    function4 = null;
                }
                if (i8 != 0) {
                    modifier4 = modifier3;
                    j2 = jM1696getBlack0d7_KjU;
                    function5 = null;
                    function6 = function4;
                } else {
                    j2 = jM1696getBlack0d7_KjU;
                    function5 = function2;
                    function6 = function4;
                    modifier4 = modifier3;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                    i5 = 0;
                }
                if (i17 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                }
                if (i6 != 0) {
                    function4 = null;
                }
                if (i8 != 0) {
                    modifier4 = modifier3;
                    j2 = jM1696getBlack0d7_KjU;
                    function5 = null;
                    function6 = function4;
                } else {
                    j2 = jM1696getBlack0d7_KjU;
                    function5 = function2;
                    function6 = function4;
                    modifier4 = modifier3;
                }
            }
            i10 = i5;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:161)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                i11 = 2;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i11 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i11, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function6, composerStartRestartGroup, (i4 >> 12) & 14);
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function5, composerStartRestartGroup, (i4 >> 15) & 14);
            Integer numValueOf6 = Integer.valueOf(i10);
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
                    playerView.setResizeMode(i10);
                }
                objRememberedValue3 = Integer.valueOf(i10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                if (videoPlayerView != null) {
                    playerView = videoPlayerView.getPlayerView();
                } else {
                    playerView = null;
                }
                if (playerView != null) {
                    playerView.setResizeMode(i10);
                }
                objRememberedValue3 = Integer.valueOf(i10);
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
            objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1660boximpl(j2), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged4 = false;
            while (i12 < 7) {
                zChanged4 |= composerStartRestartGroup.changed(objArr[i12]);
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                state = stateRememberUpdatedState2;
                state2 = stateRememberUpdatedState;
                OooO0O0 oooO0O9 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                composerStartRestartGroup.updateRememberedValue(oooO0O9);
                objRememberedValue5 = oooO0O9;
            } else {
                state = stateRememberUpdatedState2;
                state2 = stateRememberUpdatedState;
                OooO0O0 oooO0O10 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                composerStartRestartGroup.updateRememberedValue(oooO0O10);
                objRememberedValue5 = oooO0O10;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function14 = (Function1) objRememberedValue5;
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier4), 0.0f, 1, null);
            state3 = state2;
            state4 = state;
            objArr2 = new Object[]{state3, mutableState, state4, Integer.valueOf(iIntValue)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            while (i13 < 4) {
                zChanged |= composerStartRestartGroup.changed(objArr2[i13]);
            }
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function14, modifierFillMaxWidth$default6, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            i14 = i10;
            function7 = function6;
            j3 = j2;
            function8 = function5;
        } else {
            composerStartRestartGroup.startDefaults();
            zChanged = false;
            if ((i2 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                    i5 = 0;
                }
                if (i17 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                }
                if (i6 != 0) {
                    function4 = null;
                }
                if (i8 != 0) {
                    modifier4 = modifier3;
                    j2 = jM1696getBlack0d7_KjU;
                    function5 = null;
                    function6 = function4;
                } else {
                    j2 = jM1696getBlack0d7_KjU;
                    function5 = function2;
                    function6 = function4;
                    modifier4 = modifier3;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                    i5 = 0;
                }
                if (i17 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                }
                if (i6 != 0) {
                    function4 = null;
                }
                if (i8 != 0) {
                    modifier4 = modifier3;
                    j2 = jM1696getBlack0d7_KjU;
                    function5 = null;
                    function6 = function4;
                } else {
                    j2 = jM1696getBlack0d7_KjU;
                    function5 = function2;
                    function6 = function4;
                    modifier4 = modifier3;
                }
            }
            i10 = i5;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336870665, i4, -1, "com.yalla.android.videoplayer.exoplayer.VideoPlayerView (PlayerView.kt:161)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                i11 = 2;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i11 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i11, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function6, composerStartRestartGroup, (i4 >> 12) & 14);
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function5, composerStartRestartGroup, (i4 >> 15) & 14);
            Integer numValueOf7 = Integer.valueOf(i10);
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
                    playerView.setResizeMode(i10);
                }
                objRememberedValue3 = Integer.valueOf(i10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                videoPlayerView = (VideoPlayerView) mutableState2.getValue();
                if (videoPlayerView != null) {
                    playerView = videoPlayerView.getPlayerView();
                } else {
                    playerView = null;
                }
                if (playerView != null) {
                    playerView.setResizeMode(i10);
                }
                objRememberedValue3 = Integer.valueOf(i10);
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
            objArr = new Object[]{mutableState2, Integer.valueOf(iIntValue), mutableState, Color.m1660boximpl(j2), stateRememberUpdatedState, onCreatePlayControl, stateRememberUpdatedState2};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged4 = false;
            while (i12 < 7) {
                zChanged4 |= composerStartRestartGroup.changed(objArr[i12]);
            }
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                state = stateRememberUpdatedState2;
                state2 = stateRememberUpdatedState;
                OooO0O0 oooO0O11 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                composerStartRestartGroup.updateRememberedValue(oooO0O11);
                objRememberedValue5 = oooO0O11;
            } else {
                state = stateRememberUpdatedState2;
                state2 = stateRememberUpdatedState;
                OooO0O0 oooO0O12 = new OooO0O0(iIntValue, j2, onCreatePlayControl, mutableState2, mutableState, state2, state);
                composerStartRestartGroup.updateRememberedValue(oooO0O12);
                objRememberedValue5 = oooO0O12;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function15 = (Function1) objRememberedValue5;
            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier4), 0.0f, 1, null);
            state3 = state2;
            state4 = state;
            objArr2 = new Object[]{state3, mutableState, state4, Integer.valueOf(iIntValue)};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            while (i13 < 4) {
                zChanged |= composerStartRestartGroup.changed(objArr2[i13]);
            }
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new OooO0OO(iIntValue, state3, mutableState, state4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function15, modifierFillMaxWidth$default7, (Function1) objRememberedValue6, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            i14 = i10;
            function7 = function6;
            j3 = j2;
            function8 = function5;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier5, i14, onCreatePlayControl, j3, function7, function8, i2, i3));
    }
}
