package p669oO0Oo;

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
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f60450OooO00o = ComposableLambdaKt.composableLambdaInstance(-2146904820, false, OooO00o.f60451OooO0Oo);

    @SourceDebugExtension({"SMAP\nLiveRoomMemberTaskDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomMemberTaskDialogKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,641:1\n154#2:642\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskDialog.kt\ncom/yalla/yalla/ui/dialog/room/ComposableSingletons$LiveRoomMemberTaskDialogKt$lambda-1$1\n*L\n239#1:642\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f60451OooO0Oo = new OooO00o();

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
                    ComposerKt.traceEventStart(-2146904820, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomMemberTaskDialogKt.lambda-1.<anonymous> (LiveRoomMemberTaskDialog.kt:237)");
                }
                OooOO0.OooO0o(Dp.m3765constructorimpl(12), null, composer2, 6, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
