package p650o0ooo;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p202o00o0o.o00Oo0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSendRewardDialogUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendRewardDialogUtils.kt\ncom/yalla/yalla/ui/dialog/SendRewardDialogUtils$showDialog$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,45:1\n154#2:46\n*S KotlinDebug\n*F\n+ 1 SendRewardDialogUtils.kt\ncom/yalla/yalla/ui/dialog/SendRewardDialogUtils$showDialog$1$1\n*L\n35#1:46\n*E\n"})
public final class a3 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f58153OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(MutableState<Boolean> mutableState) {
        super(3);
        this.f58153OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        ColumnScope TextDialog = columnScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-947534929, iIntValue, -1, "com.yalla.yalla.ui.dialog.SendRewardDialogUtils.showDialog.<anonymous>.<anonymous> (SendRewardDialogUtils.kt:33)");
            }
            o00Oo0.OooO0O0(PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(25), 0.0f, 2, null), o0000.OooO0OO(o000000.send_reward_info), this.f58153OooO0Oo, composer2, 390, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
