package p446o0OoOoo0;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p147o00Oo0Oo.o000OOo;
import p507o0o00ooo.q1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f46399OooO00o = ComposableLambdaKt.composableLambdaInstance(-545640121, false, OooO00o.f46401OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f46400OooO0O0 = ComposableLambdaKt.composableLambdaInstance(-688673167, false, OooO0O0.f46402OooO0Oo);

    @SourceDebugExtension({"SMAP\nEventRoomPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/ComposableSingletons$EventRoomPreviewScreenKt$lambda-1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,372:1\n76#2:373\n1#3:374\n154#4:375\n36#5:376\n1097#6,6:377\n*S KotlinDebug\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/ComposableSingletons$EventRoomPreviewScreenKt$lambda-1$1\n*L\n250#1:373\n250#1:375\n253#1:376\n253#1:377,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<Modifier, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f46401OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Modifier modifier, Composer composer, Integer num) {
            int i;
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(modifier2, "modifier");
            if ((iIntValue & 14) == 0) {
                i = (composer2.changed(modifier2) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-545640121, iIntValue, -1, "com.yalla.yalla.module.event.ui.screen.ComposableSingletons$EventRoomPreviewScreenKt.lambda-1.<anonymous> (EventRoomPreviewScreen.kt:248)");
                }
                float fMo324toPx0680j_4 = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(Dp.m3765constructorimpl(8));
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Float fValueOf = Float.valueOf(fMo324toPx0680j_4);
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(fValueOf);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new o0O0o0(fMo324toPx0680j_4);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(modifierFillMaxWidth$default, (Function1) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f46402OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-688673167, iIntValue, -1, "com.yalla.yalla.module.event.ui.screen.ComposableSingletons$EventRoomPreviewScreenKt.lambda-2.<anonymous> (EventRoomPreviewScreen.kt:244)");
                }
                q1.f50178OooO00o.OooO00o(null, 0.0f, o000OOo.OooO0OO(composer2).f37704OooO0OO, composer2, 0, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
