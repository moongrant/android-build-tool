package p540o0o0OoO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p581o0oOoo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO00OO f54841OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f54842OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000oo f54843OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(o0OO00OO o0oo00oo2, o0000oo o0000ooVar, int i) {
        super(2);
        this.f54841OooO0Oo = o0oo00oo2;
        this.f54843OooO0o0 = o0000ooVar;
        this.f54842OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54842OooO0o | 1);
        o0OO00OO.OooO0o(this.f54841OooO0Oo, this.f54843OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
