package p543o0o0Ooo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55666OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i) {
        super(2);
        this.f55666OooO0Oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        oo000000.OooOO0o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f55666OooO0Oo | 1));
        return Unit.INSTANCE;
    }
}
