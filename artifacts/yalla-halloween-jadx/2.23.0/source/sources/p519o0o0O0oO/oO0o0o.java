package p519o0o0O0oO;

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
import p158o00OoOOO.oo000o;
import p485o0o00O0.oOOO00Oo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0o0o extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function2<String, oO000O0O, Unit> f52898OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0o(oOOO00Oo oooo00oo) {
        super(3);
        this.f52898OooO0Oo = oooo00oo;
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
                ComposerKt.traceEventStart(-1450345690, i, -1, "com.yalla.yalla.ui.dialog.HorizontalEditDialogUtil.showHorizontalEditDialog.<anonymous> (HorizontalEditDialogUtil.kt:40)");
            }
            oO000O0O oo000o0o = new oO000O0O();
            oo000o0o.f52805OooO0o0 = it;
            oo000o.OooO0Oo(it, StringResources_androidKt.stringResource(oO00OOo0.topic_info_manage_add_admin, composer2, 0), null, ComposableLambdaKt.composableLambda(composer2, -1468254063, true, new oO0Ooooo(oo000o0o, this.f52898OooO0Oo)), true, false, null, null, null, false, null, false, null, null, false, false, null, null, null, null, composer2, (i & 14) | 27648, 0, 1048548);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
