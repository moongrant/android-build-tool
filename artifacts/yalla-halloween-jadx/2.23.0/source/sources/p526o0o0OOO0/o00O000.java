package p526o0o0OOO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p571o0oOoOO.oo0OOoo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f53598OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53599OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(oo0OOoo oo0oooo, int i) {
        super(2);
        this.f53598OooO0Oo = oo0oooo;
        this.f53599OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53599OooO0o0 | 1);
        o000OOo0.OooO0oO(this.f53598OooO0Oo, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
