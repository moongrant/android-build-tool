package com.code.android.util;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nComposableUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableUtil.kt\ncom/code/android/util/ComposableUtilKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,111:1\n154#2:112\n164#2:113\n164#2:114\n36#3:115\n1097#4,6:116\n76#5:122\n76#5:123\n76#5:124\n*S KotlinDebug\n*F\n+ 1 ComposableUtil.kt\ncom/code/android/util/ComposableUtilKt\n*L\n30#1:112\n52#1:113\n64#1:114\n90#1:115\n90#1:116,6\n108#1:122\n109#1:123\n110#1:124\n*E\n"})
public final class OooOO0 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f10260OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f10261OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10262OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f10263OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(float f, Modifier modifier, int i, int i2) {
            super(2);
            this.f10260OooO0Oo = f;
            this.f10262OooO0o0 = modifier;
            this.f10261OooO0o = i;
            this.f10263OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f10261OooO0o | 1);
            OooOO0.OooO0Oo(this.f10260OooO0Oo, this.f10262OooO0o0, composer, iUpdateChangedFlags, this.f10263OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10264OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f10264OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f10264OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f10265OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f10266OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, int i) {
            super(3);
            this.f10265OooO0Oo = j;
            this.f10266OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1297778717, iIntValue, -1, "com.code.android.util.BackgroundAnimated.<anonymous> (ComposableUtil.kt:95)");
            }
            SurfaceKt.m1185SurfaceFjzlyU(null, null, this.f10265OooO0Oo, 0L, null, 0.0f, com.code.android.util.OooO.f10252OooO00o, composer2, ((this.f10266OooO0o0 << 6) & 896) | 1572864, 59);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10267OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f10268OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EnterTransition f10269OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f10270OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ExitTransition f10271OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f10272OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f10273OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f10274OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, boolean z, EnterTransition enterTransition, ExitTransition exitTransition, Modifier modifier, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f10268OooO0Oo = j;
            this.f10270OooO0o0 = z;
            this.f10269OooO0o = enterTransition;
            this.f10271OooO0oO = exitTransition;
            this.f10272OooO0oo = modifier;
            this.f10267OooO = function0;
            this.f10273OooOO0 = i;
            this.f10274OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOO0.OooO00o(this.f10268OooO0Oo, this.f10270OooO0o0, this.f10269OooO0o, this.f10271OooO0oO, this.f10272OooO0oo, this.f10267OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10273OooOO0 | 1), this.f10274OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f10275OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f10275OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOO0.OooO0O0(composer, RecomposeScopeImplKt.updateChangedFlags(this.f10275OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.code.android.util.OooOO0$OooOO0, reason: collision with other inner class name */
    public static final class C0181OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f10276OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f10277OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10278OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f10279OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0181OooOO0(float f, Modifier modifier, int i, int i2) {
            super(2);
            this.f10276OooO0Oo = f;
            this.f10278OooO0o0 = modifier;
            this.f10277OooO0o = i;
            this.f10279OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f10277OooO0o | 1);
            OooOO0.OooO0o(this.f10276OooO0Oo, this.f10278OooO0o0, composer, iUpdateChangedFlags, this.f10279OooO0oO);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0191  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0139  */
    /* JADX WARN: Code duplicated, block: B:92:0x0141  */
    /* JADX WARN: Code duplicated, block: B:95:0x0184  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(long j, boolean z, @Nullable EnterTransition enterTransition, @Nullable ExitTransition exitTransition, @Nullable Modifier modifier, @Nullable Function0<Unit> function0, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        int i6;
        ExitTransition exitTransition2;
        int i7;
        int i8;
        Modifier modifier2;
        int i9;
        int i10;
        Function0<Unit> function1;
        int i11;
        int i12;
        int i13;
        float f;
        EnterTransition enterTransitionFadeIn$default;
        ExitTransition exitTransitionFadeOut$default;
        Modifier modifier3;
        boolean zChanged;
        Object objRememberedValue;
        EnterTransition enterTransition3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-971140165);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    enterTransition2 = enterTransition;
                    if (composerStartRestartGroup.changed(enterTransition2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        exitTransition2 = exitTransition;
                        if (composerStartRestartGroup.changed(exitTransition2)) {
                            i7 = 2048;
                        } else {
                            i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((57344 & i) == 0) {
                            modifier2 = modifier;
                            if (composerStartRestartGroup.changed(modifier2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            i3 |= 196608;
                            function1 = function0;
                        } else {
                            function1 = function0;
                            if ((i & 458752) == 0) {
                                if (composerStartRestartGroup.changedInstance(function1)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                                i3 |= i11;
                            }
                        }
                        if ((i3 & 374491) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i4 != 0) {
                                i12 = 2;
                                f = 0.0f;
                                enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                                i13 = 0;
                            } else {
                                i12 = 2;
                                i13 = 0;
                                f = 0.0f;
                                enterTransitionFadeIn$default = enterTransition;
                            }
                            if (i6 != 0) {
                                exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                            } else {
                                exitTransitionFadeOut$default = exitTransition2;
                            }
                            if (i8 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i10 != 0) {
                                function1 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function1);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new OooO00o(function1);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0<Unit> function2 = function1;
                            AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function1 = function2;
                            enterTransition3 = enterTransitionFadeIn$default;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            enterTransition3 = enterTransition2;
                            exitTransitionFadeOut$default = exitTransition2;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
                    }
                    i3 |= 24576;
                    modifier2 = modifier;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        function1 = function0;
                    } else {
                        function1 = function0;
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    if ((i3 & 374491) == 74898) {
                        if (i4 != 0) {
                            i12 = 2;
                            f = 0.0f;
                            enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                            i13 = 0;
                        } else {
                            i12 = 2;
                            i13 = 0;
                            f = 0.0f;
                            enterTransitionFadeIn$default = enterTransition;
                        }
                        if (i6 != 0) {
                            exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                        } else {
                            exitTransitionFadeOut$default = exitTransition2;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                        }
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0<Unit> function3 = function1;
                        AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function1 = function3;
                        enterTransition3 = enterTransitionFadeIn$default;
                    } else {
                        if (i4 != 0) {
                            i12 = 2;
                            f = 0.0f;
                            enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                            i13 = 0;
                        } else {
                            i12 = 2;
                            i13 = 0;
                            f = 0.0f;
                            enterTransitionFadeIn$default = enterTransition;
                        }
                        if (i6 != 0) {
                            exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                        } else {
                            exitTransitionFadeOut$default = exitTransition2;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                        }
                        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0<Unit> function4 = function1;
                        AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function1 = function4;
                        enterTransition3 = enterTransitionFadeIn$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
                }
                i3 |= 3072;
                exitTransition2 = exitTransition;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        function1 = function0;
                    } else {
                        function1 = function0;
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    if ((i3 & 374491) == 74898) {
                        if (i4 != 0) {
                            i12 = 2;
                            f = 0.0f;
                            enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                            i13 = 0;
                        } else {
                            i12 = 2;
                            i13 = 0;
                            f = 0.0f;
                            enterTransitionFadeIn$default = enterTransition;
                        }
                        if (i6 != 0) {
                            exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                        } else {
                            exitTransitionFadeOut$default = exitTransition2;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                        }
                        Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0<Unit> function5 = function1;
                        AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default4, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function1 = function5;
                        enterTransition3 = enterTransitionFadeIn$default;
                    } else {
                        if (i4 != 0) {
                            i12 = 2;
                            f = 0.0f;
                            enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                            i13 = 0;
                        } else {
                            i12 = 2;
                            i13 = 0;
                            f = 0.0f;
                            enterTransitionFadeIn$default = enterTransition;
                        }
                        if (i6 != 0) {
                            exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                        } else {
                            exitTransitionFadeOut$default = exitTransition2;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                        }
                        Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0<Unit> function6 = function1;
                        AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function1 = function6;
                        enterTransition3 = enterTransitionFadeIn$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
                }
                i3 |= 24576;
                modifier2 = modifier;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function7 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default6, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function7;
                    enterTransition3 = enterTransitionFadeIn$default;
                } else {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default7 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function8 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default7, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function8;
                    enterTransition3 = enterTransitionFadeIn$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
            }
            i3 |= 384;
            enterTransition2 = enterTransition;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        function1 = function0;
                    } else {
                        function1 = function0;
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    if ((i3 & 374491) == 74898) {
                        if (i4 != 0) {
                            i12 = 2;
                            f = 0.0f;
                            enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                            i13 = 0;
                        } else {
                            i12 = 2;
                            i13 = 0;
                            f = 0.0f;
                            enterTransitionFadeIn$default = enterTransition;
                        }
                        if (i6 != 0) {
                            exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                        } else {
                            exitTransitionFadeOut$default = exitTransition2;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                        }
                        Modifier modifierFillMaxSize$default8 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0<Unit> function9 = function1;
                        AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default8, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function1 = function9;
                        enterTransition3 = enterTransitionFadeIn$default;
                    } else {
                        if (i4 != 0) {
                            i12 = 2;
                            f = 0.0f;
                            enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                            i13 = 0;
                        } else {
                            i12 = 2;
                            i13 = 0;
                            f = 0.0f;
                            enterTransitionFadeIn$default = enterTransition;
                        }
                        if (i6 != 0) {
                            exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                        } else {
                            exitTransitionFadeOut$default = exitTransition2;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                        }
                        Modifier modifierFillMaxSize$default9 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0<Unit> function10 = function1;
                        AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default9, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function1 = function10;
                        enterTransition3 = enterTransitionFadeIn$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
                }
                i3 |= 24576;
                modifier2 = modifier;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default10 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function11 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default10, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function11;
                    enterTransition3 = enterTransitionFadeIn$default;
                } else {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default11 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function12 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default11, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function12;
                    enterTransition3 = enterTransitionFadeIn$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
            }
            i3 |= 3072;
            exitTransition2 = exitTransition;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default12 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function13 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default12, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function13;
                    enterTransition3 = enterTransitionFadeIn$default;
                } else {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default13 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function14 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default13, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function14;
                    enterTransition3 = enterTransitionFadeIn$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
            }
            i3 |= 24576;
            modifier2 = modifier;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            if ((i3 & 374491) == 74898) {
                if (i4 != 0) {
                    i12 = 2;
                    f = 0.0f;
                    enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                    i13 = 0;
                } else {
                    i12 = 2;
                    i13 = 0;
                    f = 0.0f;
                    enterTransitionFadeIn$default = enterTransition;
                }
                if (i6 != 0) {
                    exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                } else {
                    exitTransitionFadeOut$default = exitTransition2;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                }
                Modifier modifierFillMaxSize$default14 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0<Unit> function15 = function1;
                AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default14, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function15;
                enterTransition3 = enterTransitionFadeIn$default;
            } else {
                if (i4 != 0) {
                    i12 = 2;
                    f = 0.0f;
                    enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                    i13 = 0;
                } else {
                    i12 = 2;
                    i13 = 0;
                    f = 0.0f;
                    enterTransitionFadeIn$default = enterTransition;
                }
                if (i6 != 0) {
                    exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                } else {
                    exitTransitionFadeOut$default = exitTransition2;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                }
                Modifier modifierFillMaxSize$default15 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0<Unit> function16 = function1;
                AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default15, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function16;
                enterTransition3 = enterTransitionFadeIn$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                enterTransition2 = enterTransition;
                if (composerStartRestartGroup.changed(enterTransition2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    exitTransition2 = exitTransition;
                    if (composerStartRestartGroup.changed(exitTransition2)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((57344 & i) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                        function1 = function0;
                    } else {
                        function1 = function0;
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                    }
                    if ((i3 & 374491) == 74898) {
                        if (i4 != 0) {
                            i12 = 2;
                            f = 0.0f;
                            enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                            i13 = 0;
                        } else {
                            i12 = 2;
                            i13 = 0;
                            f = 0.0f;
                            enterTransitionFadeIn$default = enterTransition;
                        }
                        if (i6 != 0) {
                            exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                        } else {
                            exitTransitionFadeOut$default = exitTransition2;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                        }
                        Modifier modifierFillMaxSize$default16 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0<Unit> function17 = function1;
                        AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default16, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function1 = function17;
                        enterTransition3 = enterTransitionFadeIn$default;
                    } else {
                        if (i4 != 0) {
                            i12 = 2;
                            f = 0.0f;
                            enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                            i13 = 0;
                        } else {
                            i12 = 2;
                            i13 = 0;
                            f = 0.0f;
                            enterTransitionFadeIn$default = enterTransition;
                        }
                        if (i6 != 0) {
                            exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                        } else {
                            exitTransitionFadeOut$default = exitTransition2;
                        }
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i10 != 0) {
                            function1 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                        }
                        Modifier modifierFillMaxSize$default17 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0<Unit> function18 = function1;
                        AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default17, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function1 = function18;
                        enterTransition3 = enterTransitionFadeIn$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
                }
                i3 |= 24576;
                modifier2 = modifier;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default18 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function19 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default18, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function19;
                    enterTransition3 = enterTransitionFadeIn$default;
                } else {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default19 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function110 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default19, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function110;
                    enterTransition3 = enterTransitionFadeIn$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
            }
            i3 |= 3072;
            exitTransition2 = exitTransition;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default110 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function111 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default110, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function111;
                    enterTransition3 = enterTransitionFadeIn$default;
                } else {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default111 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function112 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default111, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function112;
                    enterTransition3 = enterTransitionFadeIn$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
            }
            i3 |= 24576;
            modifier2 = modifier;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            if ((i3 & 374491) == 74898) {
                if (i4 != 0) {
                    i12 = 2;
                    f = 0.0f;
                    enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                    i13 = 0;
                } else {
                    i12 = 2;
                    i13 = 0;
                    f = 0.0f;
                    enterTransitionFadeIn$default = enterTransition;
                }
                if (i6 != 0) {
                    exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                } else {
                    exitTransitionFadeOut$default = exitTransition2;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                }
                Modifier modifierFillMaxSize$default112 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0<Unit> function113 = function1;
                AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default112, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function113;
                enterTransition3 = enterTransitionFadeIn$default;
            } else {
                if (i4 != 0) {
                    i12 = 2;
                    f = 0.0f;
                    enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                    i13 = 0;
                } else {
                    i12 = 2;
                    i13 = 0;
                    f = 0.0f;
                    enterTransitionFadeIn$default = enterTransition;
                }
                if (i6 != 0) {
                    exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                } else {
                    exitTransitionFadeOut$default = exitTransition2;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                }
                Modifier modifierFillMaxSize$default113 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0<Unit> function114 = function1;
                AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default113, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function114;
                enterTransition3 = enterTransitionFadeIn$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
        }
        i3 |= 384;
        enterTransition2 = enterTransition;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                exitTransition2 = exitTransition;
                if (composerStartRestartGroup.changed(exitTransition2)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((57344 & i) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                    function1 = function0;
                } else {
                    function1 = function0;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                }
                if ((i3 & 374491) == 74898) {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default114 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function115 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default114, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function115;
                    enterTransition3 = enterTransitionFadeIn$default;
                } else {
                    if (i4 != 0) {
                        i12 = 2;
                        f = 0.0f;
                        enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                        i13 = 0;
                    } else {
                        i12 = 2;
                        i13 = 0;
                        f = 0.0f;
                        enterTransitionFadeIn$default = enterTransition;
                    }
                    if (i6 != 0) {
                        exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                    } else {
                        exitTransitionFadeOut$default = exitTransition2;
                    }
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i10 != 0) {
                        function1 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                    }
                    Modifier modifierFillMaxSize$default115 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0<Unit> function116 = function1;
                    AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default115, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function1 = function116;
                    enterTransition3 = enterTransitionFadeIn$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
            }
            i3 |= 24576;
            modifier2 = modifier;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            if ((i3 & 374491) == 74898) {
                if (i4 != 0) {
                    i12 = 2;
                    f = 0.0f;
                    enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                    i13 = 0;
                } else {
                    i12 = 2;
                    i13 = 0;
                    f = 0.0f;
                    enterTransitionFadeIn$default = enterTransition;
                }
                if (i6 != 0) {
                    exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                } else {
                    exitTransitionFadeOut$default = exitTransition2;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                }
                Modifier modifierFillMaxSize$default116 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0<Unit> function117 = function1;
                AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default116, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function117;
                enterTransition3 = enterTransitionFadeIn$default;
            } else {
                if (i4 != 0) {
                    i12 = 2;
                    f = 0.0f;
                    enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                    i13 = 0;
                } else {
                    i12 = 2;
                    i13 = 0;
                    f = 0.0f;
                    enterTransitionFadeIn$default = enterTransition;
                }
                if (i6 != 0) {
                    exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                } else {
                    exitTransitionFadeOut$default = exitTransition2;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                }
                Modifier modifierFillMaxSize$default117 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0<Unit> function118 = function1;
                AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default117, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function118;
                enterTransition3 = enterTransitionFadeIn$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
        }
        i3 |= 3072;
        exitTransition2 = exitTransition;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((57344 & i) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
                function1 = function0;
            } else {
                function1 = function0;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
            }
            if ((i3 & 374491) == 74898) {
                if (i4 != 0) {
                    i12 = 2;
                    f = 0.0f;
                    enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                    i13 = 0;
                } else {
                    i12 = 2;
                    i13 = 0;
                    f = 0.0f;
                    enterTransitionFadeIn$default = enterTransition;
                }
                if (i6 != 0) {
                    exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                } else {
                    exitTransitionFadeOut$default = exitTransition2;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                }
                Modifier modifierFillMaxSize$default118 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0<Unit> function119 = function1;
                AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default118, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function119;
                enterTransition3 = enterTransitionFadeIn$default;
            } else {
                if (i4 != 0) {
                    i12 = 2;
                    f = 0.0f;
                    enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                    i13 = 0;
                } else {
                    i12 = 2;
                    i13 = 0;
                    f = 0.0f;
                    enterTransitionFadeIn$default = enterTransition;
                }
                if (i6 != 0) {
                    exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
                } else {
                    exitTransitionFadeOut$default = exitTransition2;
                }
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i10 != 0) {
                    function1 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
                }
                Modifier modifierFillMaxSize$default119 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0<Unit> function1110 = function1;
                AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default119, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function1 = function1110;
                enterTransition3 = enterTransitionFadeIn$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
        }
        i3 |= 24576;
        modifier2 = modifier;
        i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
        }
        if ((i3 & 374491) == 74898) {
            if (i4 != 0) {
                i12 = 2;
                f = 0.0f;
                enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                i13 = 0;
            } else {
                i12 = 2;
                i13 = 0;
                f = 0.0f;
                enterTransitionFadeIn$default = enterTransition;
            }
            if (i6 != 0) {
                exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
            } else {
                exitTransitionFadeOut$default = exitTransition2;
            }
            if (i8 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i10 != 0) {
                function1 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
            }
            Modifier modifierFillMaxSize$default1110 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0<Unit> function1111 = function1;
            AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default1110, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function1 = function1111;
            enterTransition3 = enterTransitionFadeIn$default;
        } else {
            if (i4 != 0) {
                i12 = 2;
                f = 0.0f;
                enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                i13 = 0;
            } else {
                i12 = 2;
                i13 = 0;
                f = 0.0f;
                enterTransitionFadeIn$default = enterTransition;
            }
            if (i6 != 0) {
                exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, i13, null, 6, null), f, i12, null);
            } else {
                exitTransitionFadeOut$default = exitTransition2;
            }
            if (i8 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i10 != 0) {
                function1 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-971140165, i3, -1, "com.code.android.util.BackgroundAnimated (ComposableUtil.kt:77)");
            }
            Modifier modifierFillMaxSize$default1111 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0<Unit> function1112 = function1;
            AnimatedVisibilityKt.AnimatedVisibility(z, o0O0O00.OooO0O0(modifierFillMaxSize$default1111, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1297778717, true, new OooO0O0(j, i3)), composerStartRestartGroup, ((i3 >> 3) & 14) | 196608 | (i3 & 896) | (i3 & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function1 = function1112;
            enterTransition3 = enterTransitionFadeIn$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(j, z, enterTransition3, exitTransitionFadeOut$default, modifier3, function1, i, i2));
    }

    @Composable
    public static final void OooO0O0(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-199247870);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-199247870, i, -1, "com.code.android.util.Compose360DpAdapter (ComposableUtil.kt:106)");
            }
            ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp = 360;
            ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp = (int) (((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDisplayMetrics().heightPixels / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(@Nullable Modifier modifier, float f, long j, @Nullable Composer composer, int i, int i2) {
        float f2;
        int i3;
        long j2;
        int i4;
        Modifier modifier2;
        int i5;
        float fM3765constructorimpl;
        long jM1696getBlack0d7_KjU;
        Modifier modifier3;
        float f3;
        long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1306801971);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 14) == 0) {
            f2 = f;
            i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                j2 = j;
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i7 != 0) {
                        jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                    } else {
                        jM1696getBlack0d7_KjU = j2;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1306801971, i, -1, "com.code.android.util.HorizontalDivider (ComposableUtil.kt:51)");
                    }
                    BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    f3 = fM3765constructorimpl;
                    j3 = jM1696getBlack0d7_KjU;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f3 = f2;
                    j3 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(modifier2, j3, f3, i, i2));
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i7 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                } else {
                    jM1696getBlack0d7_KjU = j2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1306801971, i, -1, "com.code.android.util.HorizontalDivider (ComposableUtil.kt:51)");
                }
                BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                f3 = fM3765constructorimpl;
                j3 = jM1696getBlack0d7_KjU;
            } else {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i7 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                } else {
                    jM1696getBlack0d7_KjU = j2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1306801971, i, -1, "com.code.android.util.HorizontalDivider (ComposableUtil.kt:51)");
                }
                BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                f3 = fM3765constructorimpl;
                j3 = jM1696getBlack0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(modifier2, j3, f3, i, i2));
        }
        i3 |= 48;
        j2 = j;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i7 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                } else {
                    jM1696getBlack0d7_KjU = j2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1306801971, i, -1, "com.code.android.util.HorizontalDivider (ComposableUtil.kt:51)");
                }
                BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                f3 = fM3765constructorimpl;
                j3 = jM1696getBlack0d7_KjU;
            } else {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i7 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                } else {
                    jM1696getBlack0d7_KjU = j2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1306801971, i, -1, "com.code.android.util.HorizontalDivider (ComposableUtil.kt:51)");
                }
                BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                f3 = fM3765constructorimpl;
                j3 = jM1696getBlack0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(modifier2, j3, f3, i, i2));
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 731) == 146) {
            if (i6 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i7 != 0) {
                jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
            } else {
                jM1696getBlack0d7_KjU = j2;
            }
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306801971, i, -1, "com.code.android.util.HorizontalDivider (ComposableUtil.kt:51)");
            }
            BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            f3 = fM3765constructorimpl;
            j3 = jM1696getBlack0d7_KjU;
        } else {
            if (i6 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i7 != 0) {
                jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
            } else {
                jM1696getBlack0d7_KjU = j2;
            }
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306801971, i, -1, "com.code.android.util.HorizontalDivider (ComposableUtil.kt:51)");
            }
            BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            f3 = fM3765constructorimpl;
            j3 = jM1696getBlack0d7_KjU;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(modifier2, j3, f3, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(float f, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1327843359);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1327843359, i, -1, "com.code.android.util.HorizontalSpacer (ComposableUtil.kt:39)");
            }
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(modifier, f), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(f, modifier, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(float f, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-315980621);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-315980621, i, -1, "com.code.android.util.VerticalSpacer (ComposableUtil.kt:45)");
            }
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(modifier, f), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new C0181OooOO0(f, modifier, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(@Nullable Modifier modifier, float f, long j, @Nullable Composer composer, int i, int i2) {
        float f2;
        int i3;
        long j2;
        int i4;
        Modifier modifier2;
        int i5;
        float fM3765constructorimpl;
        long jM1696getBlack0d7_KjU;
        Modifier modifier3;
        float f3;
        long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(288209441);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 14) == 0) {
            f2 = f;
            i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                j2 = j;
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
                    } else {
                        fM3765constructorimpl = f2;
                    }
                    if (i7 != 0) {
                        jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                    } else {
                        jM1696getBlack0d7_KjU = j2;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(288209441, i, -1, "com.code.android.util.VerticalDivider (ComposableUtil.kt:63)");
                    }
                    BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m528width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    f3 = fM3765constructorimpl;
                    j3 = jM1696getBlack0d7_KjU;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f3 = f2;
                    j3 = j2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(modifier2, j3, f3, i, i2));
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i7 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                } else {
                    jM1696getBlack0d7_KjU = j2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(288209441, i, -1, "com.code.android.util.VerticalDivider (ComposableUtil.kt:63)");
                }
                BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m528width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                f3 = fM3765constructorimpl;
                j3 = jM1696getBlack0d7_KjU;
            } else {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i7 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                } else {
                    jM1696getBlack0d7_KjU = j2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(288209441, i, -1, "com.code.android.util.VerticalDivider (ComposableUtil.kt:63)");
                }
                BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m528width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                f3 = fM3765constructorimpl;
                j3 = jM1696getBlack0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(modifier2, j3, f3, i, i2));
        }
        i3 |= 48;
        j2 = j;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i7 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                } else {
                    jM1696getBlack0d7_KjU = j2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(288209441, i, -1, "com.code.android.util.VerticalDivider (ComposableUtil.kt:63)");
                }
                BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m528width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                f3 = fM3765constructorimpl;
                j3 = jM1696getBlack0d7_KjU;
            } else {
                if (i6 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
                } else {
                    fM3765constructorimpl = f2;
                }
                if (i7 != 0) {
                    jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
                } else {
                    jM1696getBlack0d7_KjU = j2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(288209441, i, -1, "com.code.android.util.VerticalDivider (ComposableUtil.kt:63)");
                }
                BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m528width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                f3 = fM3765constructorimpl;
                j3 = jM1696getBlack0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(modifier2, j3, f3, i, i2));
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 731) == 146) {
            if (i6 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i7 != 0) {
                jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
            } else {
                jM1696getBlack0d7_KjU = j2;
            }
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(288209441, i, -1, "com.code.android.util.VerticalDivider (ComposableUtil.kt:63)");
            }
            BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m528width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            f3 = fM3765constructorimpl;
            j3 = jM1696getBlack0d7_KjU;
        } else {
            if (i6 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
            } else {
                fM3765constructorimpl = f2;
            }
            if (i7 != 0) {
                jM1696getBlack0d7_KjU = Color.INSTANCE.m1696getBlack0d7_KjU();
            } else {
                jM1696getBlack0d7_KjU = j2;
            }
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(288209441, i, -1, "com.code.android.util.VerticalDivider (ComposableUtil.kt:63)");
            }
            BoxKt.Box(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m528width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null), fM3765constructorimpl), jM1696getBlack0d7_KjU, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            f3 = fM3765constructorimpl;
            j3 = jM1696getBlack0d7_KjU;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(modifier2, j3, f3, i, i2));
    }
}
