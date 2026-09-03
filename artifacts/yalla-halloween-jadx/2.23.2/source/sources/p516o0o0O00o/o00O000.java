package p516o0o0O00o;

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
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f51329OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f51330OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51331OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000000 f51332OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f51333OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f51334OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(String str, o000000 o000000Var, int i, long j, long j2, boolean z) {
        super(2);
        this.f51330OooO0Oo = str;
        this.f51332OooO0o0 = o000000Var;
        this.f51331OooO0o = i;
        this.f51333OooO0oO = j;
        this.f51334OooO0oo = j2;
        this.f51329OooO = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1090445722, iIntValue, -1, "com.yalla.yalla.ui.composable.common.CommonTab.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonTab.kt:89)");
            }
            String str = this.f51330OooO0Oo;
            o000000 o000000Var = this.f51332OooO0o0;
            int iOooO0oO = o000000Var.OooO0oO();
            int i = this.f51331OooO0o;
            TextKt.m1261Text4IGK_g(str, (Modifier) null, iOooO0oO == i ? this.f51333OooO0oO : this.f51334OooO0oo, TextUnitKt.getSp(16), (FontStyle) null, (this.f51329OooO && o000000Var.OooO0oO() == i) ? FontWeight.INSTANCE.getMedium() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, TextUnitKt.getSp(0), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 12585984, 0, 130898);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
