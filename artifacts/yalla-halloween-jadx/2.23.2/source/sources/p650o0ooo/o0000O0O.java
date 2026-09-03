package p650o0ooo;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p207o00o0oO0.o000O0Oo;
import p505o0o00oOO.o0oO0Ooo;
import p562o0oOo000.o000000;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAddCountDialogUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddCountDialogUtils.kt\ncom/yalla/yalla/ui/dialog/AddCountDialogUtils$showAddCountDialog$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,176:1\n25#2:177\n36#2:184\n25#2:191\n25#2:198\n50#2:205\n49#2:206\n1097#3,6:178\n1097#3,6:185\n1097#3,6:192\n1097#3,6:199\n1097#3,6:207\n81#4:213\n81#4:214\n107#4,2:215\n81#4:217\n107#4,2:218\n*S KotlinDebug\n*F\n+ 1 AddCountDialogUtils.kt\ncom/yalla/yalla/ui/dialog/AddCountDialogUtils$showAddCountDialog$1\n*L\n70#1:177\n72#1:184\n77#1:191\n82#1:198\n115#1:205\n115#1:206\n70#1:178,6\n72#1:185,6\n77#1:192,6\n82#1:199,6\n115#1:207,6\n72#1:213\n77#1:214\n77#1:215,2\n82#1:217\n82#1:218,2\n*E\n"})
public final class o0000O0O extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f58459OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f58460OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f58462OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f58464OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ String f58465OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Integer f58466OooOO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f58461OooO0o0 = 1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f58463OooO0oo = 1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ long f58458OooO = 50;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o0oO0Ooo o0oo0ooo2, String str, int i, String str2, String str3, Integer num) {
        super(3);
        this.f58459OooO0Oo = o0oo0ooo2;
        this.f58460OooO0o = str;
        this.f58462OooO0oO = i;
        this.f58464OooOO0 = str2;
        this.f58465OooOO0O = str3;
        this.f58466OooOO0o = num;
    }

    public static final void OooO00o(MutableState<Long> mutableState, long j, long j2, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3) {
        if (mutableState.getValue().longValue() < j) {
            mutableState.setValue(Long.valueOf(j));
        } else if (mutableState.getValue().longValue() > j2) {
            mutableState.setValue(Long.valueOf(j2));
        }
        mutableState2.setValue(Boolean.valueOf(mutableState.getValue().longValue() > j));
        mutableState3.setValue(Boolean.valueOf(mutableState.getValue().longValue() < j2));
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
                ComposerKt.traceEventStart(-534252762, iIntValue, -1, "com.yalla.yalla.ui.dialog.AddCountDialogUtils.showAddCountDialog.<anonymous> (AddCountDialogUtils.kt:69)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(this.f58461OooO0o0), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue;
            Object value = mutableState2.getValue();
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(value);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                long jLongValue = ((Number) mutableState2.getValue()).longValue() * ((long) this.f58462OooO0oO);
                StringBuilder sb = new StringBuilder();
                sb.append(jLongValue);
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000O.OooO00o(this.f58460OooO0o, OooOOOO.OooO00o(o0O0O0Oo.OooO0Oo(sb.toString()), ZegoConstants.ZegoVideoDataAuxPublishingStream)), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState4 = (MutableState) objRememberedValue3;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState5 = (MutableState) objRememberedValue4;
            OooO00o(mutableState2, this.f58463OooO0oo, this.f58458OooO, mutableState4, mutableState5);
            String strOooO0OO = o0000.OooO0OO(o000000.choose_quantity);
            String strOooO0OO2 = o0000.OooO0OO(o000000.Confirm);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1909607919, true, new o0000oo(this.f58464OooOO0, this.f58465OooOO0O, this.f58466OooOO0o, mutableState2, this.f58463OooO0oo, this.f58458OooO, mutableState4, mutableState5, mutableState3));
            composer2.startReplaceableGroup(511388516);
            Function1<Long, Unit> function1 = this.f58459OooO0Oo;
            boolean zChanged2 = composer2.changed(function1) | composer2.changed(mutableState2);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new o0000O0(function1, mutableState2);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceableGroup();
            o000O0Oo.OooO0Oo(it, strOooO0OO, null, composableLambda, true, false, null, null, strOooO0OO2, false, null, false, (Function0) objRememberedValue5, null, false, false, null, null, null, null, composer2, (iIntValue & 14) | 27648, 0, 1044196);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
