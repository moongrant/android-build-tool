package p518o0o0O0o0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f52141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Modifier f52142OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f52143OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f52144OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f52145OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(o00000O0 o00000o1, long j, Modifier modifier, int i, int i2) {
        super(2);
        this.f52141OooO0Oo = o00000o1;
        this.f52143OooO0o0 = j;
        this.f52142OooO0o = modifier;
        this.f52144OooO0oO = i;
        this.f52145OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o00000O0 o00000o1 = this.f52141OooO0Oo;
        long j = this.f52143OooO0o0;
        o00000o1.OooO00o(RecomposeScopeImplKt.updateChangedFlags(this.f52144OooO0oO | 1), this.f52145OooO0oo, j, composer, this.f52142OooO0o);
        return Unit.INSTANCE;
    }
}
