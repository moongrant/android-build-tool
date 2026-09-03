package p519o0o0O0oO;

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
import p158o00OoOOO.oo000o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEditDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditDialogUtil.kt\ncom/yalla/yalla/ui/dialog/EditDialogUtil$showEditDialog$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,97:1\n25#2:98\n50#2:105\n49#2:106\n1097#3,6:99\n1097#3,6:107\n*S KotlinDebug\n*F\n+ 1 EditDialogUtil.kt\ncom/yalla/yalla/ui/dialog/EditDialogUtil$showEditDialog$1\n*L\n44#1:98\n55#1:105\n55#1:106\n44#1:99,6\n55#1:107,6\n*E\n"})
public final class o0oO0Ooo extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f52769OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f52770OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f52771OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f52772OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f52773OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0oO0Ooo(String str, Function1<? super String, Unit> function1, String str2, String str3, int i) {
        super(3);
        this.f52769OooO0Oo = str;
        this.f52771OooO0o0 = function1;
        this.f52770OooO0o = str2;
        this.f52772OooO0oO = str3;
        this.f52773OooO0oo = i;
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
                ComposerKt.traceEventStart(1904070225, iIntValue, -1, "com.yalla.yalla.ui.dialog.EditDialogUtil.showEditDialog.<anonymous> (EditDialogUtil.kt:42)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                String str = this.f52770OooO0o;
                if (str == null) {
                    str = "";
                }
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue;
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Send);
            boolean z = ((CharSequence) mutableState2.getValue()).length() > 0;
            String str2 = this.f52769OooO0Oo;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1375528442, true, new o0O00OO(this.f52773OooO0oo, mutableState2, this.f52772OooO0oO));
            composer2.startReplaceableGroup(511388516);
            Function1<String, Unit> function1 = this.f52771OooO0o0;
            boolean zChanged = composer2.changed(function1) | composer2.changed(mutableState2);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new o0O00OOO(function1, mutableState2);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            oo000o.OooO0Oo(it, str2, null, composableLambda, true, false, null, null, strOooO0OO, z, null, false, (Function0) objRememberedValue2, null, false, false, null, null, null, null, composer2, (iIntValue & 14) | 27648, 0, 1043684);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
