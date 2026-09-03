package p207o00o0oO0;

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
import p205o00o0o0o.o000OO0O;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nBaseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,88:1\n36#2:89\n67#2,3:96\n66#2:99\n1097#3,6:90\n1097#3,6:100\n*S KotlinDebug\n*F\n+ 1 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt\n*L\n44#1:89\n50#1:96,3\n50#1:99\n44#1:90,6\n50#1:100,6\n*E\n"})
public final class o0000O0 {

    @SourceDebugExtension({"SMAP\nBaseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt$BaseDialog$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,88:1\n63#2,5:89\n*S KotlinDebug\n*F\n+ 1 BaseDialog.kt\ncom/code/android/yldialog/compose/BaseDialogKt$BaseDialog$1$1\n*L\n45#1:89,5\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f39415OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(1);
            this.f39415OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0000oo(this.f39415OooO0Oo);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f39416OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f39417OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f39418OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, MutableState<Boolean> mutableState, Function0<Unit> function0) {
            super(0);
            this.f39416OooO0Oo = z;
            this.f39418OooO0o0 = mutableState;
            this.f39417OooO0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f39416OooO0Oo) {
                this.f39418OooO0o0.setValue(Boolean.FALSE);
                Function0<Unit> function0 = this.f39417OooO0o;
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
        public final /* synthetic */ int f39419OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f39420OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f39421OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f39422OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f39423OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(int i, int i2, float f, Function2<? super Composer, ? super Integer, Unit> function2, int i3) {
            super(2);
            this.f39419OooO0Oo = i;
            this.f39421OooO0o0 = i2;
            this.f39420OooO0o = f;
            this.f39422OooO0oO = function2;
            this.f39423OooO0oo = i3;
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
                    ComposerKt.traceEventStart(981233981, iIntValue, -1, "com.code.android.yldialog.compose.BaseDialog.<anonymous> (BaseDialog.kt:61)");
                }
                View view = (View) composer2.consume(AndroidCompositionLocals_androidKt.getLocalView());
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(view);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    ViewParent parent = view.getParent();
                    DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
                    if (dialogWindowProvider == null || (window2 = dialogWindowProvider.getWindow()) == null) {
                        Context context = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        Intrinsics.checkNotNullParameter(context, "<this>");
                        while (true) {
                            if (!(context instanceof Activity)) {
                                if (!(context instanceof ContextWrapper)) {
                                    window = null;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
                            } else {
                                window = ((Activity) context).getWindow();
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
                    window3.setGravity(this.f39419OooO0Oo);
                    window3.setWindowAnimations(this.f39421OooO0o0);
                    float f = window3.getAttributes().dimAmount;
                    float f2 = this.f39420OooO0o;
                    if (!(f == f2)) {
                        window3.setDimAmount(f2);
                    }
                }
                OooOO0.OooO0O0(composer2, 0);
                SurfaceKt.m1201SurfaceFjzlyU(SizeKt.m532widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m3775constructorimpl(360), 1, null), null, o0OOo000.f48134OooO00o, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, -1209411463, true, new o0000O0O(this.f39422OooO0oO, this.f39423OooO0oo)), composer2, 1572870, 58);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f39424OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f39425OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f39426OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f39427OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f39428OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f39429OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f39430OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f39431OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f39432OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f39433OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f39434OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(MutableState<Boolean> mutableState, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function1, int i, int i2, float f, Function2<? super Composer, ? super Integer, Unit> function2, int i3, int i4) {
            super(2);
            this.f39425OooO0Oo = mutableState;
            this.f39427OooO0o0 = z;
            this.f39426OooO0o = z2;
            this.f39428OooO0oO = function0;
            this.f39429OooO0oo = function1;
            this.f39424OooO = i;
            this.f39430OooOO0 = i2;
            this.f39431OooOO0O = f;
            this.f39432OooOO0o = function2;
            this.f39434OooOOO0 = i3;
            this.f39433OooOOO = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0000O0.OooO00o(this.f39425OooO0Oo, this.f39427OooO0o0, this.f39426OooO0o, this.f39428OooO0oO, this.f39429OooO0oo, this.f39424OooO, this.f39430OooOO0, this.f39431OooOO0O, this.f39432OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39434OooOOO0 | 1), this.f39433OooOOO);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x015c A[PHI: r3 r4 r5 r6 r8 r12 r13
      0x015c: PHI (r3v29 int) = (r3v23 int), (r3v30 int) binds: [B:132:0x0193, B:110:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r4v5 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:132:0x0193, B:110:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r5v17 boolean) = (r5v13 boolean), (r5v20 boolean) binds: [B:132:0x0193, B:110:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r6v10 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r6v6 kotlin.jvm.functions.Function0<kotlin.Unit>), (r6v12 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:132:0x0193, B:110:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r8v10 int) = (r8v6 int), (r8v12 int) binds: [B:132:0x0193, B:110:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r12v6 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r12v3 kotlin.jvm.functions.Function0<kotlin.Unit>), (r12v2 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:132:0x0193, B:110:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r13v10 int) = (r13v7 int), (r13v12 int) binds: [B:132:0x0193, B:110:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x016d  */
    /* JADX WARN: Code duplicated, block: B:115:0x016f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0173  */
    /* JADX WARN: Code duplicated, block: B:118:0x0175  */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:124:0x017e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0181  */
    /* JADX WARN: Code duplicated, block: B:127:0x0184  */
    /* JADX WARN: Code duplicated, block: B:130:0x018a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0191  */
    /* JADX WARN: Code duplicated, block: B:133:0x0195  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207  */
    /* JADX WARN: Code duplicated, block: B:151:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x021e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0260  */
    /* JADX WARN: Code duplicated, block: B:158:0x0268  */
    /* JADX WARN: Code duplicated, block: B:163:0x0278  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
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
        int i16;
        boolean z3;
        boolean z4;
        Function0<Unit> function4;
        int i17;
        int i18;
        float f2;
        boolean z5;
        Function0<Unit> function5;
        int i19;
        int i20;
        float f3;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i21;
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
        int i22 = i4 & 2;
        if (i22 == 0) {
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
                        i12 = i4 & 32;
                        if (i12 != 0) {
                            i5 |= 196608;
                        } else if ((i3 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(i)) {
                                i13 = 131072;
                            } else {
                                i13 = 65536;
                            }
                            i5 |= i13;
                        }
                        if ((i3 & 3670016) != 0) {
                            if ((i4 & 64) == 0 || !composerStartRestartGroup.changed(i2)) {
                                i21 = 524288;
                            } else {
                                i21 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            }
                            i5 |= i21;
                        }
                        i14 = i4 & 128;
                        if (i14 != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(f)) {
                                i15 = 8388608;
                            } else {
                                i15 = Configuration.BLOCK_SIZE;
                            }
                            i5 |= i15;
                        }
                        if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            if ((234881024 & i3) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i16 = 67108864;
                                } else {
                                    i16 = 33554432;
                                }
                            }
                            if ((191739611 & i5) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i22 != 0) {
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
                                    if (i12 != 0) {
                                        i17 = 17;
                                    } else {
                                        i17 = i;
                                    }
                                    if ((i4 & 64) != 0) {
                                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                        i5 &= -3670017;
                                    } else {
                                        i18 = i2;
                                    }
                                    if (i14 != 0) {
                                        f2 = 0.3f;
                                    } else {
                                        f2 = f;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i4 & 64) != 0) {
                                        z3 = z;
                                        z4 = z2;
                                        i17 = i;
                                        i18 = i2;
                                        i5 = (-3670017) & i5;
                                        function4 = function3;
                                        f2 = f;
                                    } else {
                                        z3 = z;
                                        z4 = z2;
                                        i17 = i;
                                        i18 = i2;
                                        f2 = f;
                                        function4 = function3;
                                    }
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                    AndroidDialog_androidKt.Dialog(function6, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z4;
                                function5 = function4;
                                i19 = i17;
                                i20 = i18;
                                f3 = f2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z3 = z;
                                z5 = z2;
                                i19 = i;
                                i20 = i2;
                                f3 = f;
                                function5 = function3;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                        }
                        i16 = 100663296;
                        i5 |= i16;
                        if ((191739611 & i5) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                AndroidDialog_androidKt.Dialog(function7, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i19 = i17;
                            i20 = i18;
                            f3 = f2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                AndroidDialog_androidKt.Dialog(function8, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i19 = i17;
                            i20 = i18;
                            f3 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                    }
                    i5 |= 24576;
                    function3 = function1;
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i5 |= i13;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i21 = 524288;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    i14 = i4 & 128;
                    if (i14 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f)) {
                            i15 = 8388608;
                        } else {
                            i15 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i15;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                AndroidDialog_androidKt.Dialog(function9, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i19 = i17;
                            i20 = i18;
                            f3 = f2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                AndroidDialog_androidKt.Dialog(function10, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i19 = i17;
                            i20 = i18;
                            f3 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                    }
                    i16 = 100663296;
                    i5 |= i16;
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function11, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function12, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
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
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i5 |= i13;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i21 = 524288;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    i14 = i4 & 128;
                    if (i14 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f)) {
                            i15 = 8388608;
                        } else {
                            i15 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i15;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                AndroidDialog_androidKt.Dialog(function13, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i19 = i17;
                            i20 = i18;
                            f3 = f2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                AndroidDialog_androidKt.Dialog(function14, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i19 = i17;
                            i20 = i18;
                            f3 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                    }
                    i16 = 100663296;
                    i5 |= i16;
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function15, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function16, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                }
                i5 |= 24576;
                function3 = function1;
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                i14 = i4 & 128;
                if (i14 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i15 = 8388608;
                    } else {
                        i15 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i15;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function17, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function18, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                }
                i16 = 100663296;
                i5 |= i16;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function19, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function110, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
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
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i5 |= i13;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i21 = 524288;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    i14 = i4 & 128;
                    if (i14 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f)) {
                            i15 = 8388608;
                        } else {
                            i15 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i15;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                AndroidDialog_androidKt.Dialog(function111, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i19 = i17;
                            i20 = i18;
                            f3 = f2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                AndroidDialog_androidKt.Dialog(function112, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i19 = i17;
                            i20 = i18;
                            f3 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                    }
                    i16 = 100663296;
                    i5 |= i16;
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function113, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function114, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                }
                i5 |= 24576;
                function3 = function1;
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                i14 = i4 & 128;
                if (i14 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i15 = 8388608;
                    } else {
                        i15 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i15;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function115, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function116, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                }
                i16 = 100663296;
                i5 |= i16;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function117, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function118, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
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
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                i14 = i4 & 128;
                if (i14 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i15 = 8388608;
                    } else {
                        i15 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i15;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function119, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function1110, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                }
                i16 = 100663296;
                i5 |= i16;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function1111, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function1112, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
            }
            i5 |= 24576;
            function3 = function1;
            i12 = i4 & 32;
            if (i12 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i5 |= i13;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i5 |= i21;
            }
            i14 = i4 & 128;
            if (i14 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i15 = 8388608;
                } else {
                    i15 = Configuration.BLOCK_SIZE;
                }
                i5 |= i15;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function1113, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function1114, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
            }
            i16 = 100663296;
            i5 |= i16;
            if ((191739611 & i5) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                    AndroidDialog_androidKt.Dialog(function1115, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i19 = i17;
                i20 = i18;
                f3 = f2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                    AndroidDialog_androidKt.Dialog(function1116, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i19 = i17;
                i20 = i18;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
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
                    i12 = i4 & 32;
                    if (i12 != 0) {
                        i5 |= 196608;
                    } else if ((i3 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i5 |= i13;
                    }
                    if ((i3 & 3670016) != 0) {
                        if ((i4 & 64) == 0) {
                            i21 = 524288;
                        } else {
                            i21 = 524288;
                        }
                        i5 |= i21;
                    }
                    i14 = i4 & 128;
                    if (i14 != 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f)) {
                            i15 = 8388608;
                        } else {
                            i15 = Configuration.BLOCK_SIZE;
                        }
                        i5 |= i15;
                    }
                    if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        if ((234881024 & i3) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                        }
                        if ((191739611 & i5) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                AndroidDialog_androidKt.Dialog(function1117, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i19 = i17;
                            i20 = i18;
                            f3 = f2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            } else {
                                if (i22 != 0) {
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
                                if (i12 != 0) {
                                    i17 = 17;
                                } else {
                                    i17 = i;
                                }
                                if ((i4 & 64) != 0) {
                                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                    i5 &= -3670017;
                                } else {
                                    i18 = i2;
                                }
                                if (i14 != 0) {
                                    f2 = 0.3f;
                                } else {
                                    f2 = f;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                                AndroidDialog_androidKt.Dialog(function1118, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function5 = function4;
                            i19 = i17;
                            i20 = i18;
                            f3 = f2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                    }
                    i16 = 100663296;
                    i5 |= i16;
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function1119, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function11110, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                }
                i5 |= 24576;
                function3 = function1;
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                i14 = i4 & 128;
                if (i14 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i15 = 8388608;
                    } else {
                        i15 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i15;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function11111, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function11112, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                }
                i16 = 100663296;
                i5 |= i16;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function11113, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function11114, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
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
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                i14 = i4 & 128;
                if (i14 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i15 = 8388608;
                    } else {
                        i15 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i15;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function11115, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function11116, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                }
                i16 = 100663296;
                i5 |= i16;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function11117, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function11118, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
            }
            i5 |= 24576;
            function3 = function1;
            i12 = i4 & 32;
            if (i12 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i5 |= i13;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i5 |= i21;
            }
            i14 = i4 & 128;
            if (i14 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i15 = 8388608;
                } else {
                    i15 = Configuration.BLOCK_SIZE;
                }
                i5 |= i15;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function11119, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function111110, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
            }
            i16 = 100663296;
            i5 |= i16;
            if ((191739611 & i5) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                    AndroidDialog_androidKt.Dialog(function111111, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i19 = i17;
                i20 = i18;
                f3 = f2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                    AndroidDialog_androidKt.Dialog(function111112, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i19 = i17;
                i20 = i18;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
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
                i12 = i4 & 32;
                if (i12 != 0) {
                    i5 |= 196608;
                } else if ((i3 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i5 |= i13;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 64) == 0) {
                        i21 = 524288;
                    } else {
                        i21 = 524288;
                    }
                    i5 |= i21;
                }
                i14 = i4 & 128;
                if (i14 != 0) {
                    i5 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i15 = 8388608;
                    } else {
                        i15 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i15;
                }
                if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i3) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                    }
                    if ((191739611 & i5) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function111113, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        } else {
                            if (i22 != 0) {
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
                            if (i12 != 0) {
                                i17 = 17;
                            } else {
                                i17 = i;
                            }
                            if ((i4 & 64) != 0) {
                                i18 = o000OO0O.WindowAnimScaleWithAlpha;
                                i5 &= -3670017;
                            } else {
                                i18 = i2;
                            }
                            if (i14 != 0) {
                                f2 = 0.3f;
                            } else {
                                f2 = f;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                            AndroidDialog_androidKt.Dialog(function111114, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function5 = function4;
                        i19 = i17;
                        i20 = i18;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
                }
                i16 = 100663296;
                i5 |= i16;
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function111115, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function111116, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
            }
            i5 |= 24576;
            function3 = function1;
            i12 = i4 & 32;
            if (i12 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i5 |= i13;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i5 |= i21;
            }
            i14 = i4 & 128;
            if (i14 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i15 = 8388608;
                } else {
                    i15 = Configuration.BLOCK_SIZE;
                }
                i5 |= i15;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function111117, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function111118, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
            }
            i16 = 100663296;
            i5 |= i16;
            if ((191739611 & i5) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                    AndroidDialog_androidKt.Dialog(function111119, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i19 = i17;
                i20 = i18;
                f3 = f2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                    AndroidDialog_androidKt.Dialog(function1111110, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i19 = i17;
                i20 = i18;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
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
            i12 = i4 & 32;
            if (i12 != 0) {
                i5 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i5 |= i13;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i5 |= i21;
            }
            i14 = i4 & 128;
            if (i14 != 0) {
                i5 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i15 = 8388608;
                } else {
                    i15 = Configuration.BLOCK_SIZE;
                }
                i5 |= i15;
            }
            if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                }
                if ((191739611 & i5) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function1111111, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    } else {
                        if (i22 != 0) {
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
                        if (i12 != 0) {
                            i17 = 17;
                        } else {
                            i17 = i;
                        }
                        if ((i4 & 64) != 0) {
                            i18 = o000OO0O.WindowAnimScaleWithAlpha;
                            i5 &= -3670017;
                        } else {
                            i18 = i2;
                        }
                        if (i14 != 0) {
                            f2 = 0.3f;
                        } else {
                            f2 = f;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                        AndroidDialog_androidKt.Dialog(function1111112, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                    function5 = function4;
                    i19 = i17;
                    i20 = i18;
                    f3 = f2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
            }
            i16 = 100663296;
            i5 |= i16;
            if ((191739611 & i5) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                    AndroidDialog_androidKt.Dialog(function1111113, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i19 = i17;
                i20 = i18;
                f3 = f2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                    AndroidDialog_androidKt.Dialog(function1111114, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i19 = i17;
                i20 = i18;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
        }
        i5 |= 24576;
        function3 = function1;
        i12 = i4 & 32;
        if (i12 != 0) {
            i5 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (composerStartRestartGroup.changed(i)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i5 |= i13;
        }
        if ((i3 & 3670016) != 0) {
            if ((i4 & 64) == 0) {
                i21 = 524288;
            } else {
                i21 = 524288;
            }
            i5 |= i21;
        }
        i14 = i4 & 128;
        if (i14 != 0) {
            i5 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i15 = 8388608;
            } else {
                i15 = Configuration.BLOCK_SIZE;
            }
            i5 |= i15;
        }
        if ((i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            if ((234881024 & i3) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
            }
            if ((191739611 & i5) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                    AndroidDialog_androidKt.Dialog(function1111115, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i19 = i17;
                i20 = i18;
                f3 = f2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                } else {
                    if (i22 != 0) {
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
                    if (i12 != 0) {
                        i17 = 17;
                    } else {
                        i17 = i;
                    }
                    if ((i4 & 64) != 0) {
                        i18 = o000OO0O.WindowAnimScaleWithAlpha;
                        i5 &= -3670017;
                    } else {
                        i18 = i2;
                    }
                    if (i14 != 0) {
                        f2 = 0.3f;
                    } else {
                        f2 = f;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                    AndroidDialog_androidKt.Dialog(function1111116, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                function5 = function4;
                i19 = i17;
                i20 = i18;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
        }
        i16 = 100663296;
        i5 |= i16;
        if ((191739611 & i5) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i22 != 0) {
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
                if (i12 != 0) {
                    i17 = 17;
                } else {
                    i17 = i;
                }
                if ((i4 & 64) != 0) {
                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i18 = i2;
                }
                if (i14 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            } else {
                if (i22 != 0) {
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
                if (i12 != 0) {
                    i17 = 17;
                } else {
                    i17 = i;
                }
                if ((i4 & 64) != 0) {
                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i18 = i2;
                }
                if (i14 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                AndroidDialog_androidKt.Dialog(function1111117, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z4;
            function5 = function4;
            i19 = i17;
            i20 = i18;
            f3 = f2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i22 != 0) {
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
                if (i12 != 0) {
                    i17 = 17;
                } else {
                    i17 = i;
                }
                if ((i4 & 64) != 0) {
                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i18 = i2;
                }
                if (i14 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            } else {
                if (i22 != 0) {
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
                if (i12 != 0) {
                    i17 = 17;
                } else {
                    i17 = i;
                }
                if ((i4 & 64) != 0) {
                    i18 = o000OO0O.WindowAnimScaleWithAlpha;
                    i5 &= -3670017;
                } else {
                    i18 = i2;
                }
                if (i14 != 0) {
                    f2 = 0.3f;
                } else {
                    f2 = f;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600703499, i5, -1, "com.code.android.yldialog.compose.BaseDialog (BaseDialog.kt:41)");
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
                AndroidDialog_androidKt.Dialog(function1111118, new DialogProperties(z3, z6, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 981233981, true, new OooO0OO(i17, i18, f2, content, i5)), composerStartRestartGroup, 384, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z4;
            function5 = function4;
            i19 = i17;
            i20 = i18;
            f3 = f2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(show, z3, z5, function2, function5, i19, i20, f3, content, i3, i4));
    }
}
