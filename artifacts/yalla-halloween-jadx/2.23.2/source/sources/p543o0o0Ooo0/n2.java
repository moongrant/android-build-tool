package p543o0o0Ooo0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BoxScope f55475OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55476OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f55477OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(BoxScope boxScope, long j, int i) {
        super(2);
        this.f55475OooO0Oo = boxScope;
        this.f55477OooO0o0 = j;
        this.f55476OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55476OooO0o | 1);
        o2.OooO0o0(this.f55475OooO0Oo, this.f55477OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
