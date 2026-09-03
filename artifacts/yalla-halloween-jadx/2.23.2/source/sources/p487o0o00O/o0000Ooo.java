package p487o0o00O;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.yalla.yalla.model.RedemptionCodeAwards;
import com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p196o00o0OOO.oOO00O;
import p417o0Oo0oo0.o0Oo0oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f48768OooO00o = ComposableLambdaKt.composableLambdaInstance(1576792689, false, OooO00o.f48770OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f48769OooO0O0 = ComposableLambdaKt.composableLambdaInstance(1399653197, false, OooO0O0.f48771OooO0Oo);

    public static final class OooO00o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f48770OooO0Oo = new OooO00o();

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
                    ComposerKt.traceEventStart(1576792689, iIntValue, -1, "com.yalla.yalla.ui.activity.main.ComposableSingletons$RedemptionCodeRecordScreenKt.lambda-1.<anonymous> (RedemptionCodeRecordScreen.kt:88)");
                }
                oOO00O.OooO00o(StringResources_androidKt.stringResource(o000000.Exchange_Records_empty_data, composer2, 0), 0, 0.0f, null, null, false, null, null, null, composer2, 0, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f48771OooO0Oo = new OooO0O0();

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
                    ComposerKt.traceEventStart(1399653197, iIntValue, -1, "com.yalla.yalla.ui.activity.main.ComposableSingletons$RedemptionCodeRecordScreenKt.lambda-2.<anonymous> (RedemptionCodeRecordScreen.kt:239)");
                }
                o0Oo0oo.f46559OooO00o.OooO00o(composer2, 6);
                RedemptionCodeRecordScreen.INSTANCE.ItemAwardsItemView(RedemptionCodeAwards.INSTANCE.test(1), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
