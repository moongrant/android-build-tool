package p442o0OoOoO0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p150o00Oo0oO.o0000Ooo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f46186OooO00o = ComposableLambdaKt.composableLambdaInstance(-422333942, false, OooO00o.f46187OooO0Oo);

    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f46187OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-422333942, iIntValue, -1, "com.yalla.yalla.module.event.ui.page.ComposableSingletons$EventMineSubscribePageKt.lambda-1.<anonymous> (EventMineSubscribePage.kt:54)");
                }
                o0000Ooo.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.event_no_data, composer2, 0), 0, 0.0f, null, null, false, null, null, null, composer2, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
