package p536o0o0Oo0o;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.screen.user.HeaderFrameScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54980OooO00o = ComposableLambdaKt.composableLambdaInstance(423728409, false, OooO00o.f54982OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54981OooO0O0 = ComposableLambdaKt.composableLambdaInstance(79940432, false, OooO0O0.f54983OooO0Oo);

    @SourceDebugExtension({"SMAP\nHeaderFrameScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderFrameScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$HeaderFrameScreenKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,387:1\n154#2:388\n*S KotlinDebug\n*F\n+ 1 HeaderFrameScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$HeaderFrameScreenKt$lambda-1$1\n*L\n289#1:388\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<LazyGridItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54982OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
            LazyGridItemScope item = lazyGridItemScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(423728409, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$HeaderFrameScreenKt.lambda-1.<anonymous> (HeaderFrameScreen.kt:287)");
                }
                HeaderFrameScreen.INSTANCE.m4200HeaddressListTitle6a0pyJM(oOo00OO0.icon_header_frame_item_unlock, o0000.OooO0OO(oO00OOo0.header_frame_title_unlocked), Dp.m3765constructorimpl(20), composer2, 3456, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nHeaderFrameScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderFrameScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$HeaderFrameScreenKt$lambda-2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,387:1\n154#2:388\n*S KotlinDebug\n*F\n+ 1 HeaderFrameScreen.kt\ncom/yalla/yalla/ui/screen/user/ComposableSingletons$HeaderFrameScreenKt$lambda-2$1\n*L\n302#1:388\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<LazyGridItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f54983OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
            LazyGridItemScope item = lazyGridItemScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(79940432, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ComposableSingletons$HeaderFrameScreenKt.lambda-2.<anonymous> (HeaderFrameScreen.kt:297)");
                }
                HeaderFrameScreen.INSTANCE.m4200HeaddressListTitle6a0pyJM(oOo00OO0.icon_header_frame_item_not_unlock, o0000.OooO0OO(oO00OOo0.header_frame_title_locked), Dp.m3765constructorimpl(35), composer2, 3456, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
