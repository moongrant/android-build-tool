package p528o0o0OOOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo f53700OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53701OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(oO0Oo oo0oo, int i) {
        super(2);
        this.f53700OooO0Oo = oo0oo;
        this.f53701OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53701OooO0o0 | 1);
        oO0Oo.OooO0O0(this.f53700OooO0Oo, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
