package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p207o00o0oO0.o000O0Oo;
import p492o0o00OO0.oOO000;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function2<String, o0O0oo00, Unit> f58677OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000(oOO000 ooo000) {
        super(3);
        this.f58677OooO0Oo = ooo000;
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
        int i = iIntValue;
        if ((i & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1450345690, i, -1, "com.yalla.yalla.ui.dialog.HorizontalEditDialogUtil.showHorizontalEditDialog.<anonymous> (HorizontalEditDialogUtil.kt:41)");
            }
            o0O0oo00 o0o0oo00 = new o0O0oo00();
            o0o0oo00.f58666OooO0o0 = it;
            o000O0Oo.OooO0Oo(it, StringResources_androidKt.stringResource(o000000.topic_info_manage_add_admin, composer2, 0), null, ComposableLambdaKt.composableLambda(composer2, -1468254063, true, new o0O(o0o0oo00, this.f58677OooO0Oo)), true, false, null, null, null, false, null, false, null, null, false, false, null, null, null, null, composer2, (i & 14) | 27648, 0, 1048548);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
