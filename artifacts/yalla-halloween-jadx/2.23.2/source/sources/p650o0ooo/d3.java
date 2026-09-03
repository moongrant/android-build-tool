package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p207o00o0oO0.o000O0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class d3 {

    @SourceDebugExtension({"SMAP\nSendRewardDialogUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendRewardDialogUtils.kt\ncom/yalla/yalla/ui/dialog/SendRewardDialogUtils$showDialog$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,45:1\n25#2:46\n50#2:53\n49#2:54\n1097#3,6:47\n1097#3,6:55\n*S KotlinDebug\n*F\n+ 1 SendRewardDialogUtils.kt\ncom/yalla/yalla/ui/dialog/SendRewardDialogUtils$showDialog$1\n*L\n24#1:46\n29#1:53\n29#1:54\n24#1:47,6\n29#1:55,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f58189OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(3);
            this.f58189OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
            MutableState<Boolean> it = mutableState;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(it) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1466932540, iIntValue, -1, "com.yalla.yalla.ui.dialog.SendRewardDialogUtils.showDialog.<anonymous> (SendRewardDialogUtils.kt:23)");
                }
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                MutableState mutableState2 = (MutableState) objRememberedValue;
                String strOooO0OO = o0000.OooO0OO(o000000.send_reward_title);
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -947534929, true, new a3(mutableState2));
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(mutableState2);
                Function0<Unit> function0 = this.f58189OooO0Oo;
                boolean zChanged2 = zChanged | composer2.changed(function0);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new b3(mutableState2, function0);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                o000O0Oo.OooO0Oo(it, null, strOooO0OO, composableLambda, false, false, null, null, null, false, null, false, (Function0) objRememberedValue2, null, false, false, null, c3.f58174OooO0Oo, null, null, composer2, (iIntValue & 14) | 3072, 12582912, 913394);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void OooO00o(@NotNull BaseFragmentActivity activity, @NotNull Function0<Unit> confirmClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(confirmClick, "confirmClick");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-1466932540, true, new OooO00o(confirmClick)));
    }
}
