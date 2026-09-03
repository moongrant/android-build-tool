package p533o0o0OOoO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p230o00oOo0o.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53516OooO00o = ComposableLambdaKt.composableLambdaInstance(238744222, false, OooO00o.f53517OooO0Oo);

    public static final class OooO00o extends Lambda implements Function4<o0O0O00, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53517OooO0Oo = new OooO00o();

        public OooO00o() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
            o0O0O00 HorizontalPager = o0o0o00;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if ((iIntValue2 & 112) == 0) {
                iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(238744222, iIntValue2, -1, "com.yalla.yalla.ui.screen.main.ComposableSingletons$MainSearchScreenKt.lambda-1.<anonymous> (MainSearchScreen.kt:84)");
                }
                if (iIntValue == 1) {
                    composer2.startReplaceableGroup(758662911);
                    oO0o0o.OooO0O0(composer2, 0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(758662965);
                    oO0o0o.OooO0OO(composer2, 0);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
