package p543o0o0Ooo0;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OooOO0;
import androidx.compose.material.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f55675OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f55676OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ColumnScope f55677OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(o000000 o000000Var, ColumnScopeInstance columnScopeInstance, CoroutineScope coroutineScope) {
        super(2);
        this.f55675OooO0Oo = o000000Var;
        this.f55677OooO0o0 = columnScopeInstance;
        this.f55676OooO0o = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-981232485, iIntValue, -1, "com.yalla.yalla.ui.screen.user.StoreScreenContent.<anonymous>.<anonymous>.<anonymous> (StoreScreen.kt:106)");
            }
            ColumnScope columnScope = this.f55677OooO0o0;
            int i = 0;
            for (int i2 = 2; i < i2; i2 = 2) {
                o000000 o000000Var = this.f55675OooO0Oo;
                boolean z = o000000Var.OooO0oO() == i;
                TabKt.m1219TabEVJuX4I(z, new q0(this.f55676OooO0o, o000000Var, i), OooOO0.OooO00o(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, 0L, 0L, ComposableLambdaKt.composableLambda(composer2, -1299949832, true, new r0(i, z)), composer2, 12582912, 120);
                i++;
                columnScope = columnScope;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
