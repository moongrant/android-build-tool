package p509o0o0O0;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.OooOO0;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f50392OooO00o = ComposableLambdaKt.composableLambdaInstance(-186757524, false, OooO00o.f50394OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f50393OooO0O0 = ComposableLambdaKt.composableLambdaInstance(-761536939, false, OooO0O0.f50395OooO0Oo);

    @SourceDebugExtension({"SMAP\nMomentTopFollowUsersComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentTopFollowUsersComp.kt\ncom/yalla/yalla/ui/composable/moment/ComposableSingletons$MomentTopFollowUsersCompKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,194:1\n164#2:195\n*S KotlinDebug\n*F\n+ 1 MomentTopFollowUsersComp.kt\ncom/yalla/yalla/ui/composable/moment/ComposableSingletons$MomentTopFollowUsersCompKt$lambda-1$1\n*L\n100#1:195\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f50394OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            LazyItemScope item = lazyItemScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-186757524, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.ComposableSingletons$MomentTopFollowUsersCompKt.lambda-1.<anonymous> (MomentTopFollowUsersComp.kt:99)");
                }
                OooOO0.OooO0Oo(Dp.m3765constructorimpl((float) 2.5d), null, composer2, 6, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMomentTopFollowUsersComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentTopFollowUsersComp.kt\ncom/yalla/yalla/ui/composable/moment/ComposableSingletons$MomentTopFollowUsersCompKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,194:1\n164#2:195\n*S KotlinDebug\n*F\n+ 1 MomentTopFollowUsersComp.kt\ncom/yalla/yalla/ui/composable/moment/ComposableSingletons$MomentTopFollowUsersCompKt$lambda-2$1\n*L\n158#1:195\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f50395OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            LazyItemScope item = lazyItemScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-761536939, iIntValue, -1, "com.yalla.yalla.ui.composable.moment.ComposableSingletons$MomentTopFollowUsersCompKt.lambda-2.<anonymous> (MomentTopFollowUsersComp.kt:157)");
                }
                OooOO0.OooO0Oo(Dp.m3765constructorimpl((float) 2.5d), null, composer2, 6, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
