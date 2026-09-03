package p149o00Oo0o0;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.layout.o00oO0o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p186o00o00oO.o00O0;
import p186o00o00oO.o00O00OO;
import p186o00o00oO.oo00o;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSystemUiUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemUiUtil.kt\ncom/code/android/theme/util/SystemUiUtilKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,76:1\n76#2:77\n76#2:86\n76#2:95\n50#3:78\n49#3:79\n50#3:87\n49#3:88\n50#3:96\n49#3:97\n1097#4,6:80\n1097#4,6:89\n1097#4,6:98\n58#5:104\n58#5:106\n154#6:105\n154#6:107\n*S KotlinDebug\n*F\n+ 1 SystemUiUtil.kt\ncom/code/android/theme/util/SystemUiUtilKt\n*L\n23#1:77\n35#1:86\n48#1:95\n25#1:78\n25#1:79\n37#1:87\n37#1:88\n50#1:96\n50#1:97\n25#1:80,6\n37#1:89,6\n50#1:98,6\n61#1:104\n74#1:106\n61#1:105\n75#1:107\n*E\n"})
public final class o00000O {

    @DebugMetadata(c = "com.code.android.theme.util.SystemUiUtilKt$setStatusBarIconTheme$1$1", f = "SystemUiUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo00o f37947OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f37948OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oo00o oo00oVar, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f37947OooO0Oo = oo00oVar;
            this.f37948OooO0o0 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f37947OooO0Oo, this.f37948OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f37947OooO0Oo.OooO0O0(!this.f37948OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f37949OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f37950OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f37951OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, int i2, boolean z) {
            super(2);
            this.f37949OooO0Oo = z;
            this.f37951OooO0o0 = i;
            this.f37950OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f37951OooO0o0 | 1);
            int i = this.f37950OooO0o;
            o00000O.OooO0O0(this.f37949OooO0Oo, composer, iUpdateChangedFlags, i);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @JvmName(name = "getNavigationBarHeight")
    public static final float OooO00o(@NotNull WindowInsets.Companion companion, @Nullable Composer composer) {
        if (o00oO0o.OooO00o(companion, "<this>", composer, 1855918302)) {
            ComposerKt.traceEventStart(1855918302, 8, -1, "com.code.android.theme.util.<get-navigationBarHeight> (SystemUiUtil.kt:64)");
        }
        float fMo426calculateBottomPaddingD9Ej5fM = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(companion, composer, 8), composer, 0).getBottom();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fMo426calculateBottomPaddingD9Ej5fM;
    }

    @Composable
    public static final void OooO0O0(boolean z, @Nullable Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1427609436);
        if ((i & 14) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            } else if ((i2 & 1) != 0) {
                z = !((Boolean) composerStartRestartGroup.consume(o000OOo.f37692OooO00o)).booleanValue();
                i3 &= -15;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1427609436, i3, -1, "com.code.android.theme.util.setStatusBarIconTheme (SystemUiUtil.kt:22)");
            }
            o00O00OO o00o00ooOooO00o = o00O0.OooO00o(composerStartRestartGroup);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(o00o00ooOooO00o);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO00o(o00o00ooOooO00o, z, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, (i3 & 14) | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i, i2, z));
    }
}
