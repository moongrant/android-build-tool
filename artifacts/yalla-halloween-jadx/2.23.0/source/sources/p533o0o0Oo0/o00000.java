package p533o0o0Oo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f54659OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f54660OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(o00000O0 o00000o1, int i) {
        super(2);
        this.f54659OooO0Oo = o00000o1;
        this.f54660OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54660OooO0o0 | 1);
        o00000O0.OooO0O0(this.f54659OooO0Oo, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
