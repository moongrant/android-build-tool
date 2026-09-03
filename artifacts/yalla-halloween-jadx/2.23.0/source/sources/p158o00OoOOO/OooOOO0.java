package p158o00OoOOO;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.FloatRange;
import androidx.annotation.StyleRes;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.DialogWindowProvider;
import com.code.android.util.OooOO0;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OOO0o;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nBaseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,88:1\n36#2:89\n67#2,3:96\n66#2:99\n1097#3,6:90\n1097#3,6:100\n*S KotlinDebug\n*F\n+ 1 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt\n*L\n44#1:89\n50#1:96,3\n50#1:99\n44#1:90,6\n50#1:100,6\n*E\n"})
public final class OooOOO0 {

    @SourceDebugExtension({"SMAP\nBaseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt$BaseDialog$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,88:1\n63#2,5:89\n*S KotlinDebug\n*F\n+ 1 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt$BaseDialog$1$1\n*L\n45#1:89,5\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38255OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(1);
            this.f38255OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new OooOO0O(this.f38255OooO0Oo);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f38256OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38257OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f38258OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, MutableState<Boolean> mutableState, Function0<Unit> function0) {
            super(0);
            this.f38256OooO0Oo = z;
            this.f38258OooO0o0 = mutableState;
            this.f38257OooO0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f38256OooO0Oo) {
                this.f38258OooO0o0.setValue(Boolean.FALSE);
                Function0<Unit> function0 = this.f38257OooO0o;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nBaseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt$BaseDialog$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,88:1\n76#2:89\n36#3:90\n1097#4,6:91\n154#5:97\n*S KotlinDebug\n*F\n+ 1 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt$BaseDialog$3\n*L\n62#1:89\n63#1:90\n63#1:91,6\n75#1:97\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f38259OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f38260OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f38261OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f38262OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f38263OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(int i, int i2, float f, Function2<? super Composer, ? super Integer, Unit> function2, int i3) {
            super(2);
            this.f38259OooO0Oo = i;
            this.f38261OooO0o0 = i2;
            this.f38260OooO0o = f;
            this.f38262OooO0oO = function2;
            this.f38263OooO0oo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Window window;
            Window window2;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(981233981, iIntValue, -1, "com.code.android.yldialog.compose.BaseDialog.<anonymous> (BaseDialog.kt:60)");
                }
                View view = (View) composer2.consume(AndroidCompositionLocals_androidKt.getLocalView());
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(view);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    ViewParent parent = view.getParent();
                    DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
                    if (dialogWindowProvider == null || (window2 = dialogWindowProvider.getWindow()) == null) {
                        Context baseContext = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(baseContext, "currentView.context");
                        Intrinsics.checkNotNullParameter(baseContext, "<this>");
                        while (true) {
                            if (!(baseContext instanceof Activity)) {
                                if (!(baseContext instanceof ContextWrapper)) {
                                    window = null;
                                    break;
                                }
                                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                                Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
                            } else {
                                window = ((Activity) baseContext).getWindow();
                                break;
                            }
                        }
                        objRememberedValue = window;
                    } else {
                        objRememberedValue = window2;
                    }
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Window window3 = (Window) objRememberedValue;
                if (window3 != null) {
                    window3.setGravity(this.f38259OooO0Oo);
                    window3.setWindowAnimations(this.f38261OooO0o0);
                    float f = window3.getAttributes().dimAmount;
                    float f2 = this.f38260OooO0o;
                    if (!(f == f2)) {
                        window3.setDimAmount(f2);
                    }
                }
                OooOO0.OooO0O0(composer2, 0);
                SurfaceKt.m1185SurfaceFjzlyU(SizeKt.m530widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(360), 1, null), null, o0oO0O0o.f46945OooO00o, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1209411463, true, new OooOOO(this.f38262OooO0oO, this.f38263OooO0oo)), composer2, 1572870, 58);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f38264OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f38265OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f38266OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f38267OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38268OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38269OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f38270OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f38271OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f38272OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f38273OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f38274OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(MutableState<Boolean> mutableState, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function1, int i, int i2, float f, Function2<? super Composer, ? super Integer, Unit> function2, int i3, int i4) {
            super(2);
            this.f38265OooO0Oo = mutableState;
            this.f38267OooO0o0 = z;
            this.f38266OooO0o = z2;
            this.f38268OooO0oO = function0;
            this.f38269OooO0oo = function1;
            this.f38264OooO = i;
            this.f38270OooOO0 = i2;
            this.f38271OooOO0O = f;
            this.f38272OooOO0o = function2;
            this.f38274OooOOO0 = i3;
            this.f38273OooOOO = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OooOOO0.OooO00o(this.f38265OooO0Oo, this.f38267OooO0o0, this.f38266OooO0o, this.f38268OooO0oO, this.f38269OooO0oo, this.f38264OooO, this.f38270OooOO0, this.f38271OooOO0O, this.f38272OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38274OooOOO0 | 1), this.f38273OooOOO);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0160 A[PHI: r3 r4 r5 r6 r8 r12 r13
      0x0160: PHI (r3v30 int) = (r3v23 int), (r3v32 int) binds: [B:137:0x0199, B:114:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r4v5 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:137:0x0199, B:114:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r5v17 boolean) = (r5v13 boolean), (r5v20 boolean) binds: [B:137:0x0199, B:114:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r6v10 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r6v6 kotlin.jvm.functions.Function0<kotlin.Unit>), (r6v12 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:137:0x0199, B:114:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r8v11 int) = (r8v7 int), (r8v13 int) binds: [B:137:0x0199, B:114:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r12v6 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r12v3 kotlin.jvm.functions.Function0<kotlin.Unit>), (r12v2 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:137:0x0199, B:114:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r13v10 int) = (r13v7 int), (r13v12 int) binds: [B:137:0x0199, B:114:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0170  */
    /* JADX WARN: Code duplicated, block: B:119:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0176  */
    /* JADX WARN: Code duplicated, block: B:122:0x0178  */
    /* JADX WARN: Code duplicated, block: B:125:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x0186  */
    /* JADX WARN: Code duplicated, block: B:132:0x018b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0190  */
    /* JADX WARN: Code duplicated, block: B:136:0x0197  */
    /* JADX WARN: Code duplicated, block: B:138:0x019b  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:151:0x0205  */
    /* JADX WARN: Code duplicated, block: B:153:0x020d  */
    /* JADX WARN: Code duplicated, block: B:156:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x0224  */
    /* JADX WARN: Code duplicated, block: B:160:0x0266  */
    /* JADX WARN: Code duplicated, block: B:163:0x026e  */
    /* JADX WARN: Code duplicated, block: B:168:0x027e  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@NotNull MutableState<Boolean> show, boolean z, boolean z2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, int i, @StyleRes int i2, @FloatRange(from = 0.0d, to = 1.0d) float f, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function2;
        int i9;
        int i10;
        Function0<Unit> function3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        boolean z4;
        Function0<Unit> function4;
        int i16;
        int i17;
        float f2;
        boolean z5;
        Function0<Unit> function5;
        int i18;
        int i19;
        float f3;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Intrinsics.checkNotNullParameter(show, "show");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1600703499);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(show) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i21 = i4 & 2;
        if (i21 == 0) {
            if ((i3 & 112) == 0) {
                i5 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 896) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 7168) == 0) {
                        function2 = function0;
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i9 = 2048;
                        } else {
                            i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 16;
                    if (i10 != 0) {
                        if ((57344 & i3) == 0) {
                            function3 = function1;
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i11 = 16384;
                            } else {
                                i11 = 8192;
                            }
                            i5 |= i11;
                        }
                        if ((458752 & i3) == 0) {
                            if ((i4 & 32) == 0) {
                                i12 = i;
                                int i22 = composerStartRestartGroup.changed(i12) ? 131072 : 65536;
                                i5 |= i22;
                            } else {
                                i12 = i;
                            }
                            i5 |= i22;
                        } else {
                            i12 = i;
                        }
                        if ((i3 & 3670016) != 0) {
                            if ((i4 & 64) == 0 || !composerStartRestartGroup.changed(i2)) {
                                i20 = 524288;
                            } else {
                                i20 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            }
                            i5 |= i20;
                        }
                        i13 = i4 & 128;
                        if (i13 != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(f)) {
                                i14 = 8388608;
                            } else {
                                i14 = Configuration.BLOCK_SIZE;
                            }
                            i5 |= i14;
                        }
                        if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            if ((234881024 & i3) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i15 = 67108864;
                                } else {
                                    i15 = 33554432;
                                }
                            }
                            if ((191739611 & i5) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i21 != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = z;
                                    }
                                    if (i6 != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = z2;
                                    }
                                    if (i8 != 0) {
                                        function2 = null;
                                    }
                                    function4 = i10 == 0 ? function3 : null;
                                    if ((i4 & 32) != 0) {
                                        i5 &= -458753;
                                        i16 = 17;
                                    } else {
                                        i16 = i12;
                                    }
                                    if ((i4 & 64) != 0) {
                                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                        i5 &= -3670017;
                                    } else {
                                        i17 = i2;
                                    }
                                    if (i13 != 0) {
                                        f2 = 0.3f;
                                    } else {
                                        f2 = f;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i4 & 32) != 0) {
                                        i5 &= -458753;
                                    }
                                    if ((i4 & 64) != 0) {
                                        z3 = z;
                                        z4 = z2;
                                        i17 = i2;
                                        i5 = (-3670017) & i5;
                                        function4 = function3;
                                        i16 = i12;
                                        f2 = f;
                                    } else {
                                        z3 = z;
                                        z4 = z2;
                                        i17 = i2;
                                        f2 = f;
                                        function4 = function3;
                                        i16 = i12;
                                    }
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                                }
                                if (show.getValue().booleanValue()) {
                                    Unit unit = Unit.INSTANCE;
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    zChanged = composerStartRestartGroup.changed(function4);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new OooO00o(function4);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                    Boolean boolValueOf = Boolean.valueOf(z3);
                                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                                    zChanged2 = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Function0 function6 = (Function0) objRememberedValue2;
                                    if (z3 || !z4) {
                                        z6 = false;
                                    } else {
                                        z6 = true;
                                    }
                                    AndroidDialog_androidKt.Dialog(function6, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z4;
                                function5 = function4;
                                i18 = i16;
                                i19 = i17;
                                f3 = f2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z3 = z;
                                z5 = z2;
                                i19 = i2;
                                f3 = f;
                                function5 = function3;
                                i18 = i12;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                        }
                        i15 = 100663296;
                        i5 |= i15;
                        if ((191739611 & i5) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                            }
                            if (show.getValue().booleanValue()) {
                                Unit unit2 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                Boolean boolValueOf2 = Boolean.valueOf(z3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged2 = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Function0 function7 = (Function0) objRememberedValue2;
                                if (z3) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                AndroidDialog_androidKt.Dialog(function7, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i18 = i16;
                            i19 = i17;
                            f3 = f2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                            }
                            if (show.getValue().booleanValue()) {
                                Unit unit3 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(unit3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                Boolean boolValueOf3 = Boolean.valueOf(z3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged2 = composerStartRestartGroup.changed(boolValueOf3) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Function0 function8 = (Function0) objRememberedValue2;
                                if (z3) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                AndroidDialog_androidKt.Dialog(function8, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i18 = i16;
                            i19 = i17;
                            f3 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                    }
                    i5 |= 24576;
                    function3 = function1;
                    if ((458752 & i3) == 0) {
                        if ((i4 & 32) == 0) {
                            i12 = i;
                            if (composerStartRestartGroup.changed(i12)) {
                            }
                            i5 |= i22;
                        } else {
                            i12 = i;
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i5 |= i20;
                    }
                    i13 = i4 & 128;
                    if (i13 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f)) {
                            i14 = 8388608;
                        } else {
                            i14 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                            }
                            if (show.getValue().booleanValue()) {
                                Unit unit4 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(unit4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                Boolean boolValueOf4 = Boolean.valueOf(z3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged2 = composerStartRestartGroup.changed(boolValueOf4) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Function0 function9 = (Function0) objRememberedValue2;
                                if (z3) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                AndroidDialog_androidKt.Dialog(function9, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i18 = i16;
                            i19 = i17;
                            f3 = f2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                            }
                            if (show.getValue().booleanValue()) {
                                Unit unit5 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(unit5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                Boolean boolValueOf5 = Boolean.valueOf(z3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged2 = composerStartRestartGroup.changed(boolValueOf5) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Function0 function10 = (Function0) objRememberedValue2;
                                if (z3) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                AndroidDialog_androidKt.Dialog(function10, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i18 = i16;
                            i19 = i17;
                            f3 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                    }
                    i15 = 100663296;
                    i5 |= i15;
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit6 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit6, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf6 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf6) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function11 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function11, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit7 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit7, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf7 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf7) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function12 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function12, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                }
                i5 |= 3072;
                function2 = function0;
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((57344 & i3) == 0) {
                        function3 = function1;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i5 |= i11;
                    }
                    if ((458752 & i3) == 0) {
                        if ((i4 & 32) == 0) {
                            i12 = i;
                            if (composerStartRestartGroup.changed(i12)) {
                            }
                            i5 |= i22;
                        } else {
                            i12 = i;
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i5 |= i20;
                    }
                    i13 = i4 & 128;
                    if (i13 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f)) {
                            i14 = 8388608;
                        } else {
                            i14 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                            }
                            if (show.getValue().booleanValue()) {
                                Unit unit8 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(unit8, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                Boolean boolValueOf8 = Boolean.valueOf(z3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged2 = composerStartRestartGroup.changed(boolValueOf8) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Function0 function13 = (Function0) objRememberedValue2;
                                if (z3) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                AndroidDialog_androidKt.Dialog(function13, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i18 = i16;
                            i19 = i17;
                            f3 = f2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                            }
                            if (show.getValue().booleanValue()) {
                                Unit unit9 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(unit9, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                Boolean boolValueOf9 = Boolean.valueOf(z3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged2 = composerStartRestartGroup.changed(boolValueOf9) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Function0 function14 = (Function0) objRememberedValue2;
                                if (z3) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                AndroidDialog_androidKt.Dialog(function14, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i18 = i16;
                            i19 = i17;
                            f3 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                    }
                    i15 = 100663296;
                    i5 |= i15;
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit10 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit10, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf10 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf10) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function15 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function15, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit11 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit11, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf11 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf11) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function16 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function16, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                }
                i5 |= 24576;
                function3 = function1;
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (composerStartRestartGroup.changed(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i14;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit12 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit12, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf12 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf12) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function17 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function17, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit13 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit13, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf13 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf13) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function18 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function18, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit14 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit14, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf14 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf14) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function19 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function19, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit15 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit15, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf15 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf15) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function110 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function110, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
            }
            i5 |= 384;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 7168) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i9 = 2048;
                    } else {
                        i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((57344 & i3) == 0) {
                        function3 = function1;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i5 |= i11;
                    }
                    if ((458752 & i3) == 0) {
                        if ((i4 & 32) == 0) {
                            i12 = i;
                            if (composerStartRestartGroup.changed(i12)) {
                            }
                            i5 |= i22;
                        } else {
                            i12 = i;
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i5 |= i20;
                    }
                    i13 = i4 & 128;
                    if (i13 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f)) {
                            i14 = 8388608;
                        } else {
                            i14 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                            }
                            if (show.getValue().booleanValue()) {
                                Unit unit16 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(unit16, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                Boolean boolValueOf16 = Boolean.valueOf(z3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged2 = composerStartRestartGroup.changed(boolValueOf16) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Function0 function111 = (Function0) objRememberedValue2;
                                if (z3) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                AndroidDialog_androidKt.Dialog(function111, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i18 = i16;
                            i19 = i17;
                            f3 = f2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                            }
                            if (show.getValue().booleanValue()) {
                                Unit unit17 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(unit17, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                Boolean boolValueOf17 = Boolean.valueOf(z3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged2 = composerStartRestartGroup.changed(boolValueOf17) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Function0 function112 = (Function0) objRememberedValue2;
                                if (z3) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                AndroidDialog_androidKt.Dialog(function112, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i18 = i16;
                            i19 = i17;
                            f3 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                    }
                    i15 = 100663296;
                    i5 |= i15;
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit18 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit18, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf18 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf18) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function113 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function113, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit19 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit19, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf19 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf19) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function114 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function114, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                }
                i5 |= 24576;
                function3 = function1;
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (composerStartRestartGroup.changed(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i14;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit110 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit110, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf110 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf110) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function115 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function115, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit111 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit111, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf111 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf111) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function116 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function116, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit112 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit112, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf112 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf112) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function117 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function117, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit113 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit113, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf113 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf113) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function118 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function118, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
            }
            i5 |= 3072;
            function2 = function0;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((57344 & i3) == 0) {
                    function3 = function1;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i5 |= i11;
                }
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (composerStartRestartGroup.changed(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i14;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit114 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit114, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf114 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf114) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function119 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function119, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit115 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit115, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf115 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf115) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function1110 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function1110, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit116 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit116, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf116 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf116) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function1111 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function1111, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit117 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit117, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf117 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf117) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function1112 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function1112, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
            }
            i5 |= 24576;
            function3 = function1;
            if ((458752 & i3) == 0) {
                if ((i4 & 32) == 0) {
                    i12 = i;
                    if (composerStartRestartGroup.changed(i12)) {
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                i5 |= i22;
            } else {
                i12 = i;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i5 |= i20;
            }
            i13 = i4 & 128;
            if (i13 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i5 |= i14;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit118 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit118, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf118 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf118) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function1113 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function1113, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit119 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit119, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf119 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf119) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function1114 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function1114, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
            }
            i15 = 100663296;
            i5 |= i15;
            if ((191739611 & i5) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                }
                if (show.getValue().booleanValue()) {
                    Unit unit1110 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit1110, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    Boolean boolValueOf1110 = Boolean.valueOf(z3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(boolValueOf1110) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function1115 = (Function0) objRememberedValue2;
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AndroidDialog_androidKt.Dialog(function1115, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i18 = i16;
                i19 = i17;
                f3 = f2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                }
                if (show.getValue().booleanValue()) {
                    Unit unit1111 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit1111, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    Boolean boolValueOf1111 = Boolean.valueOf(z3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(boolValueOf1111) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function1116 = (Function0) objRememberedValue2;
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AndroidDialog_androidKt.Dialog(function1116, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i18 = i16;
                i19 = i17;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
        }
        i5 |= 48;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 896) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 7168) == 0) {
                    function2 = function0;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i9 = 2048;
                    } else {
                        i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 16;
                if (i10 != 0) {
                    if ((57344 & i3) == 0) {
                        function3 = function1;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i5 |= i11;
                    }
                    if ((458752 & i3) == 0) {
                        if ((i4 & 32) == 0) {
                            i12 = i;
                            if (composerStartRestartGroup.changed(i12)) {
                            }
                            i5 |= i22;
                        } else {
                            i12 = i;
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i5 |= i20;
                    }
                    i13 = i4 & 128;
                    if (i13 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f)) {
                            i14 = 8388608;
                        } else {
                            i14 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i14;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                            }
                            if (show.getValue().booleanValue()) {
                                Unit unit1112 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(unit1112, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                Boolean boolValueOf1112 = Boolean.valueOf(z3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged2 = composerStartRestartGroup.changed(boolValueOf1112) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Function0 function1117 = (Function0) objRememberedValue2;
                                if (z3) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                AndroidDialog_androidKt.Dialog(function1117, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i18 = i16;
                            i19 = i17;
                            f3 = f2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i21 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z;
                                }
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                if (i8 != 0) {
                                    function2 = null;
                                }
                                if (i10 == 0) {
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                    i16 = 17;
                                } else {
                                    i16 = i12;
                                }
                                if ((i4 & 64) != 0) {
                                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i17 = i2;
                                }
                                if (i13 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                            }
                            if (show.getValue().booleanValue()) {
                                Unit unit1113 = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function4);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    objRememberedValue = new OooO00o(function4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(unit1113, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                                Boolean boolValueOf1113 = Boolean.valueOf(z3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged2 = composerStartRestartGroup.changed(boolValueOf1113) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2) {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                } else {
                                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Function0 function1118 = (Function0) objRememberedValue2;
                                if (z3) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                AndroidDialog_androidKt.Dialog(function1118, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i18 = i16;
                            i19 = i17;
                            f3 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                    }
                    i15 = 100663296;
                    i5 |= i15;
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit1114 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit1114, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf1114 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf1114) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function1119 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function1119, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit1115 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit1115, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf1115 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf1115) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function11110 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function11110, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                }
                i5 |= 24576;
                function3 = function1;
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (composerStartRestartGroup.changed(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i14;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit1116 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit1116, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf1116 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf1116) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function11111 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function11111, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit1117 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit1117, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf1117 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf1117) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function11112 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function11112, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit1118 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit1118, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf1118 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf1118) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function11113 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function11113, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit1119 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit1119, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf1119 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf1119) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function11114 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function11114, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
            }
            i5 |= 3072;
            function2 = function0;
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((57344 & i3) == 0) {
                    function3 = function1;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i5 |= i11;
                }
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (composerStartRestartGroup.changed(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i14;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit11110 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit11110, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf11110 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf11110) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function11115 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function11115, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit11111 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit11111, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf11111 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf11111) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function11116 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function11116, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit11112 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit11112, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf11112 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf11112) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function11117 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function11117, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit11113 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit11113, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf11113 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf11113) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function11118 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function11118, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
            }
            i5 |= 24576;
            function3 = function1;
            if ((458752 & i3) == 0) {
                if ((i4 & 32) == 0) {
                    i12 = i;
                    if (composerStartRestartGroup.changed(i12)) {
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                i5 |= i22;
            } else {
                i12 = i;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i5 |= i20;
            }
            i13 = i4 & 128;
            if (i13 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i5 |= i14;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit11114 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit11114, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf11114 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf11114) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function11119 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function11119, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit11115 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit11115, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf11115 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf11115) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function111110 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function111110, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
            }
            i15 = 100663296;
            i5 |= i15;
            if ((191739611 & i5) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                }
                if (show.getValue().booleanValue()) {
                    Unit unit11116 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit11116, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    Boolean boolValueOf11116 = Boolean.valueOf(z3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(boolValueOf11116) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function111111 = (Function0) objRememberedValue2;
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AndroidDialog_androidKt.Dialog(function111111, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i18 = i16;
                i19 = i17;
                f3 = f2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                }
                if (show.getValue().booleanValue()) {
                    Unit unit11117 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit11117, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    Boolean boolValueOf11117 = Boolean.valueOf(z3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(boolValueOf11117) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function111112 = (Function0) objRememberedValue2;
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AndroidDialog_androidKt.Dialog(function111112, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i18 = i16;
                i19 = i17;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
        }
        i5 |= 384;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 7168) == 0) {
                function2 = function0;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i9 = 2048;
                } else {
                    i9 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i5 |= i9;
            }
            i10 = i4 & 16;
            if (i10 != 0) {
                if ((57344 & i3) == 0) {
                    function3 = function1;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i5 |= i11;
                }
                if ((458752 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        i12 = i;
                        if (composerStartRestartGroup.changed(i12)) {
                        }
                        i5 |= i22;
                    } else {
                        i12 = i;
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i5 |= i20;
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i14;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit11118 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit11118, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf11118 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf11118) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function111113 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function111113, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i21 != 0) {
                                z3 = true;
                            } else {
                                z3 = z;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            if (i8 != 0) {
                                function2 = null;
                            }
                            if (i10 == 0) {
                            }
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                                i16 = 17;
                            } else {
                                i16 = i12;
                            }
                            if ((i4 & 64) != 0) {
                                i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i17 = i2;
                            }
                            if (i13 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                        }
                        if (show.getValue().booleanValue()) {
                            Unit unit11119 = Unit.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO00o(function4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(unit11119, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                            Boolean boolValueOf11119 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf11119) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO0O0(z3, show, function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function111114 = (Function0) objRememberedValue2;
                            if (z3) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            AndroidDialog_androidKt.Dialog(function111114, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i18 = i16;
                        i19 = i17;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
                }
                i15 = 100663296;
                i5 |= i15;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit111110 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit111110, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf111110 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf111110) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function111115 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function111115, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit111111 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit111111, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf111111 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf111111) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function111116 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function111116, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
            }
            i5 |= 24576;
            function3 = function1;
            if ((458752 & i3) == 0) {
                if ((i4 & 32) == 0) {
                    i12 = i;
                    if (composerStartRestartGroup.changed(i12)) {
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                i5 |= i22;
            } else {
                i12 = i;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i5 |= i20;
            }
            i13 = i4 & 128;
            if (i13 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i5 |= i14;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit111112 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit111112, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf111112 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf111112) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function111117 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function111117, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit111113 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit111113, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf111113 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf111113) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function111118 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function111118, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
            }
            i15 = 100663296;
            i5 |= i15;
            if ((191739611 & i5) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                }
                if (show.getValue().booleanValue()) {
                    Unit unit111114 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit111114, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    Boolean boolValueOf111114 = Boolean.valueOf(z3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(boolValueOf111114) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function111119 = (Function0) objRememberedValue2;
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AndroidDialog_androidKt.Dialog(function111119, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i18 = i16;
                i19 = i17;
                f3 = f2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                }
                if (show.getValue().booleanValue()) {
                    Unit unit111115 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit111115, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    Boolean boolValueOf111115 = Boolean.valueOf(z3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(boolValueOf111115) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function1111110 = (Function0) objRememberedValue2;
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AndroidDialog_androidKt.Dialog(function1111110, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i18 = i16;
                i19 = i17;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
        }
        i5 |= 3072;
        function2 = function0;
        i10 = i4 & 16;
        if (i10 != 0) {
            if ((57344 & i3) == 0) {
                function3 = function1;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i5 |= i11;
            }
            if ((458752 & i3) == 0) {
                if ((i4 & 32) == 0) {
                    i12 = i;
                    if (composerStartRestartGroup.changed(i12)) {
                    }
                    i5 |= i22;
                } else {
                    i12 = i;
                }
                i5 |= i22;
            } else {
                i12 = i;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i5 |= i20;
            }
            i13 = i4 & 128;
            if (i13 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i5 |= i14;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit111116 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit111116, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf111116 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf111116) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function1111111 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function1111111, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i21 != 0) {
                            z3 = true;
                        } else {
                            z3 = z;
                        }
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        }
                        if (i10 == 0) {
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                            i16 = 17;
                        } else {
                            i16 = i12;
                        }
                        if ((i4 & 64) != 0) {
                            i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i17 = i2;
                        }
                        if (i13 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                    }
                    if (show.getValue().booleanValue()) {
                        Unit unit111117 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO00o(function4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(unit111117, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        Boolean boolValueOf111117 = Boolean.valueOf(z3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged2 = composerStartRestartGroup.changed(boolValueOf111117) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(z3, show, function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function1111112 = (Function0) objRememberedValue2;
                        if (z3) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        AndroidDialog_androidKt.Dialog(function1111112, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i18 = i16;
                    i19 = i17;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
            }
            i15 = 100663296;
            i5 |= i15;
            if ((191739611 & i5) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                }
                if (show.getValue().booleanValue()) {
                    Unit unit111118 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit111118, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    Boolean boolValueOf111118 = Boolean.valueOf(z3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(boolValueOf111118) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function1111113 = (Function0) objRememberedValue2;
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AndroidDialog_androidKt.Dialog(function1111113, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i18 = i16;
                i19 = i17;
                f3 = f2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                }
                if (show.getValue().booleanValue()) {
                    Unit unit111119 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit111119, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    Boolean boolValueOf111119 = Boolean.valueOf(z3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(boolValueOf111119) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function1111114 = (Function0) objRememberedValue2;
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AndroidDialog_androidKt.Dialog(function1111114, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i18 = i16;
                i19 = i17;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
        }
        i5 |= 24576;
        function3 = function1;
        if ((458752 & i3) == 0) {
            if ((i4 & 32) == 0) {
                i12 = i;
                if (composerStartRestartGroup.changed(i12)) {
                }
                i5 |= i22;
            } else {
                i12 = i;
            }
            i5 |= i22;
        } else {
            i12 = i;
        }
        if ((i3 & 3670016) != 0) {
            if ((i4 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i5 |= i20;
        }
        i13 = i4 & 128;
        if (i13 != 0) {
            i5 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i14 = 8388608;
            } else {
                i14 = Configuration.BLOCK_SIZE;
            }
            i5 |= i14;
        }
        if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            if ((234881024 & i3) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
            }
            if ((191739611 & i5) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                }
                if (show.getValue().booleanValue()) {
                    Unit unit1111110 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit1111110, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    Boolean boolValueOf1111110 = Boolean.valueOf(z3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(boolValueOf1111110) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function1111115 = (Function0) objRememberedValue2;
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AndroidDialog_androidKt.Dialog(function1111115, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i18 = i16;
                i19 = i17;
                f3 = f2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i21 != 0) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    }
                    if (i10 == 0) {
                    }
                    if ((i4 & 32) != 0) {
                        i5 &= -458753;
                        i16 = 17;
                    } else {
                        i16 = i12;
                    }
                    if ((i4 & 64) != 0) {
                        i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i17 = i2;
                    }
                    if (i13 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
                }
                if (show.getValue().booleanValue()) {
                    Unit unit1111111 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO00o(function4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(unit1111111, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    Boolean boolValueOf1111111 = Boolean.valueOf(z3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged2 = composerStartRestartGroup.changed(boolValueOf1111111) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(z3, show, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function1111116 = (Function0) objRememberedValue2;
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AndroidDialog_androidKt.Dialog(function1111116, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i18 = i16;
                i19 = i17;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
        }
        i15 = 100663296;
        i5 |= i15;
        if ((191739611 & i5) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i21 != 0) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i8 != 0) {
                    function2 = null;
                }
                if (i10 == 0) {
                }
                if ((i4 & 32) != 0) {
                    i5 &= -458753;
                    i16 = 17;
                } else {
                    i16 = i12;
                }
                if ((i4 & 64) != 0) {
                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i17 = i2;
                }
                if (i13 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            } else {
                if (i21 != 0) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i8 != 0) {
                    function2 = null;
                }
                if (i10 == 0) {
                }
                if ((i4 & 32) != 0) {
                    i5 &= -458753;
                    i16 = 17;
                } else {
                    i16 = i12;
                }
                if ((i4 & 64) != 0) {
                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i17 = i2;
                }
                if (i13 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
            }
            if (show.getValue().booleanValue()) {
                Unit unit1111112 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(unit1111112, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                Boolean boolValueOf1111112 = Boolean.valueOf(z3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(boolValueOf1111112) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0 function1111117 = (Function0) objRememberedValue2;
                if (z3) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                AndroidDialog_androidKt.Dialog(function1111117, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z4;
            function5 = function4;
            i18 = i16;
            i19 = i17;
            f3 = f2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i21 != 0) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i8 != 0) {
                    function2 = null;
                }
                if (i10 == 0) {
                }
                if ((i4 & 32) != 0) {
                    i5 &= -458753;
                    i16 = 17;
                } else {
                    i16 = i12;
                }
                if ((i4 & 64) != 0) {
                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i17 = i2;
                }
                if (i13 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            } else {
                if (i21 != 0) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i8 != 0) {
                    function2 = null;
                }
                if (i10 == 0) {
                }
                if ((i4 & 32) != 0) {
                    i5 &= -458753;
                    i16 = 17;
                } else {
                    i16 = i12;
                }
                if ((i4 & 64) != 0) {
                    i17 = o0OOO0o.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i17 = i2;
                }
                if (i13 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:31)");
            }
            if (show.getValue().booleanValue()) {
                Unit unit1111113 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooO00o(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooO00o(function4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(unit1111113, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                Boolean boolValueOf1111113 = Boolean.valueOf(z3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged2 = composerStartRestartGroup.changed(boolValueOf1111113) | composerStartRestartGroup.changed(show) | composerStartRestartGroup.changed(function2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(z3, show, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0 function1111118 = (Function0) objRememberedValue2;
                if (z3) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                AndroidDialog_androidKt.Dialog(function1111118, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i16, i17, f2, content, i5)), composerStartRestartGroup, 384, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z4;
            function5 = function4;
            i18 = i16;
            i19 = i17;
            f3 = f2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i18, i19, f3, content, i3, i4));
    }
}
