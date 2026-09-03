package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p207o00o0oO0.o000O0Oo;
import p505o0o00oOO.o0O0O0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAddCountTopCardDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddCountTopCardDialogUtil.kt\ncom/yalla/yalla/ui/dialog/AddCountTopCardDialogUtil$showAddCountTopCardDialog$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,118:1\n25#2:119\n25#2:126\n67#2,3:133\n66#2:136\n67#2,3:143\n66#2:146\n50#2:153\n49#2:154\n1097#3,6:120\n1097#3,6:127\n1097#3,6:137\n1097#3,6:147\n1097#3,6:155\n81#4:161\n107#4,2:162\n*S KotlinDebug\n*F\n+ 1 AddCountTopCardDialogUtil.kt\ncom/yalla/yalla/ui/dialog/AddCountTopCardDialogUtil$showAddCountTopCardDialog$1\n*L\n42#1:119\n45#1:126\n47#1:133,3\n47#1:136\n53#1:143,3\n53#1:146\n65#1:153\n65#1:154\n42#1:120,6\n45#1:127,6\n47#1:137,6\n53#1:147,6\n65#1:155,6\n45#1:161\n45#1:162,2\n*E\n"})
public final class o000O000 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f58492OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f58493OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(long j, o0O0O0Oo o0o0o0oo) {
        super(3);
        this.f58492OooO0Oo = j;
        this.f58493OooO0o0 = o0o0o0oo;
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
                ComposerKt.traceEventStart(1182386404, iIntValue, -1, "com.yalla.yalla.ui.dialog.AddCountTopCardDialogUtil.showAddCountTopCardDialog.<anonymous> (AddCountTopCardDialogUtil.kt:40)");
            }
            long j = this.f58492OooO0Oo + ((long) 100);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            Long lValueOf = Long.valueOf(j);
            composer2.startReplaceableGroup(1618982084);
            boolean zChanged = composer2.changed(lValueOf) | composer2.changed(mutableState2) | composer2.changed(mutableState3);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new o0000OO0(j, mutableState2, mutableState3);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            Function0 function0 = (Function0) objRememberedValue3;
            Long lValueOf2 = Long.valueOf(j);
            composer2.startReplaceableGroup(1618982084);
            boolean zChanged2 = composer2.changed(lValueOf2) | composer2.changed(mutableState2) | composer2.changed(mutableState3);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new o000(j, mutableState2, mutableState3);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            String strOooO0OO = o0000.OooO0OO(o000000.Store_Bid_Dialog_Tiele);
            String strOooO0OO2 = o0000.OooO0OO(o000000.Pay);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -168432817, true, new o000OO(mutableState2, function0, (Function0) objRememberedValue4, mutableState3));
            composer2.startReplaceableGroup(511388516);
            Function1<Long, Unit> function1 = this.f58493OooO0o0;
            boolean zChanged3 = composer2.changed(function1) | composer2.changed(mutableState2);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new o0000O(function1, mutableState2);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceableGroup();
            o000O0Oo.OooO0Oo(it, strOooO0OO, null, composableLambda, false, false, null, null, strOooO0OO2, false, null, false, (Function0) objRememberedValue5, null, false, false, null, null, null, null, composer2, (iIntValue & 14) | 3072, 0, 1044212);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
