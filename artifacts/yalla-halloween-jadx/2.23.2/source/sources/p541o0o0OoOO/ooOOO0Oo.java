package p541o0o0OoOO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO0Oo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55334OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO0Oo(int i) {
        super(2);
        this.f55334OooO0Oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        ooOOO00O.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f55334OooO0Oo | 1));
        return Unit.INSTANCE;
    }
}
