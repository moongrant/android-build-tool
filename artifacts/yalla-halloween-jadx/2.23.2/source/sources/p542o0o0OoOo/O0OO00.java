package p542o0o0OoOo;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p516o0o0O00o.o0O0oo0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class O0OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f55344OooO00o = ComposableLambdaKt.composableLambdaInstance(511672840, false, OooO00o.f55345OooO0Oo);

    public static final class OooO00o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55345OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope Toolbar = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(511672840, iIntValue, -1, "com.yalla.yalla.ui.screen.store.ComposableSingletons$StoreChatBubbleScreenKt.lambda-1.<anonymous> (StoreChatBubbleScreen.kt:87)");
                }
                o0O0oo0o.OooO0Oo(o0000.OooO0OO(o000000.Mine), false, O0O0.f55343OooO0Oo, composer2, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
