package p519o0o0O0oO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import com.yalla.yalla.ui.activity.room.oo00oO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p158o00OoOOO.oo000o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEditFeeDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditFeeDialogUtil.kt\ncom/yalla/yalla/ui/dialog/EditFeeDialogUtil$showEditFeeDialog$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,162:1\n25#2:163\n50#2:170\n49#2:171\n1097#3,6:164\n1097#3,6:172\n*S KotlinDebug\n*F\n+ 1 EditFeeDialogUtil.kt\ncom/yalla/yalla/ui/dialog/EditFeeDialogUtil$showEditFeeDialog$1\n*L\n51#1:163\n61#1:170\n61#1:171\n51#1:164,6\n61#1:172,6\n*E\n"})
public final class o0O0O0o0 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f52653OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f52654OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f52655OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f52656OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f52657OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(String str, oo00oO oo00oo, int i, int i2, int i3) {
        super(3);
        this.f52653OooO0Oo = str;
        this.f52655OooO0o0 = oo00oo;
        this.f52654OooO0o = i;
        this.f52656OooO0oO = i2;
        this.f52657OooO0oo = i3;
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
                ComposerKt.traceEventStart(-1016109759, iIntValue, -1, "com.yalla.yalla.ui.dialog.EditFeeDialogUtil.showEditFeeDialog.<anonymous> (EditFeeDialogUtil.kt:49)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                String strValueOf = String.valueOf(this.f52654OooO0o);
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(strValueOf, TextRangeKt.TextRange(strValueOf.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue;
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Membership_fee, composer2, 0);
            String str = this.f52653OooO0Oo;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1623948948, true, new o0O0oo0o(this.f52656OooO0oO, this.f52657OooO0oo, mutableState2));
            composer2.startReplaceableGroup(511388516);
            Function1<Integer, Unit> function1 = this.f52655OooO0o0;
            boolean zChanged = composer2.changed(function1) | composer2.changed(mutableState2);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new o0O0O0Oo(function1, mutableState2);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            oo000o.OooO0Oo(it, strStringResource, str, composableLambda, false, false, null, null, null, false, null, false, (Function0) objRememberedValue2, null, false, false, null, null, null, null, composer2, (iIntValue & 14) | 3072, 0, 1044464);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
