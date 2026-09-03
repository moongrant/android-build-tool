package p587o0oOooOO;

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
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f56875OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f56876OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ t f56877OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000000 f56878OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, t tVar, int i, o000000 o000000Var) {
        super(0);
        this.f56875OooO0Oo = context;
        this.f56877OooO0o0 = tVar;
        this.f56876OooO0o = i;
        this.f56878OooO0oO = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f56875OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((AppCompatActivity) context);
        o000000 o000000Var = this.f56878OooO0oO;
        int i = this.f56876OooO0o;
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new m(o000000Var, i, null), 3, null);
        boolean z = i == 0;
        t tVar = this.f56877OooO0o0;
        tVar.f56977OooO0O0.setValue(Boolean.valueOf(z));
        Function1<? super Boolean, Unit> function1 = tVar.f56976OooO00o;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }
}
