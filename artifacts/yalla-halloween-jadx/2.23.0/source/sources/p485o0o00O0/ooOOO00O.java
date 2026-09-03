package p485o0o00O0;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p147o00Oo0Oo.o000OOo;
import p184o00o00o.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO00O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f48230OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f48231OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f48232OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO00O(String str, Oooo000 oooo000, int i) {
        super(2);
        this.f48230OooO0Oo = str;
        this.f48232OooO0o0 = oooo000;
        this.f48231OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        long j;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(898155389, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailTab.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TopicDetailTabComp.kt:79)");
            }
            String str = this.f48230OooO0Oo;
            if (this.f48232OooO0o0.OooO0oO() == this.f48231OooO0o) {
                composer2.startReplaceableGroup(317233418);
                j = o000OOo.OooO0OO(composer2).f37701OooO;
            } else {
                composer2.startReplaceableGroup(317233433);
                j = o000OOo.OooO0OO(composer2).f37712OooOO0o;
            }
            composer2.endReplaceableGroup();
            TextKt.m1251Text4IGK_g(str, (Modifier) null, j, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, TextUnitKt.getSp(0), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 12782592, 0, 130898);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
