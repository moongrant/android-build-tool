package p539o0o0OoOO;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p184o00o00o.Oooo000;

/* JADX INFO: loaded from: classes5.dex */
public final class u0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f55709OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55710OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ y0 f55711OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f55712OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Context context, y0 y0Var, int i, Oooo000 oooo000) {
        super(0);
        this.f55709OooO0Oo = context;
        this.f55711OooO0o0 = y0Var;
        this.f55710OooO0o = i;
        this.f55712OooO0oO = oooo000;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f55709OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((AppCompatActivity) context);
        Oooo000 oooo000 = this.f55712OooO0oO;
        int i = this.f55710OooO0o;
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new t0(oooo000, i, null), 3, null);
        boolean z = i == 0;
        y0 y0Var = this.f55711OooO0o0;
        y0Var.f55749OooO0O0.setValue(Boolean.valueOf(z));
        Function1<? super Boolean, Unit> function1 = y0Var.f55748OooO00o;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }
}
