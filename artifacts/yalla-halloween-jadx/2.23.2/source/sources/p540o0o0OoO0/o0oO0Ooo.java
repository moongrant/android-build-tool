package p540o0o0OoO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p581o0oOoo.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f54878OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OOO f54879OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f54880OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f54881OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f54882OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f54883OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ int f54884OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ int f54885OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(o0O00OOO o0o00ooo2, int i, o0000O0 o0000o1, long j, long j2, int i2, int i3, int i4) {
        super(2);
        this.f54879OooO0Oo = o0o00ooo2;
        this.f54881OooO0o0 = i;
        this.f54880OooO0o = o0000o1;
        this.f54882OooO0oO = j;
        this.f54883OooO0oo = j2;
        this.f54878OooO = i2;
        this.f54884OooOO0 = i3;
        this.f54885OooOO0O = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0O00OOO.OooO0Oo(this.f54879OooO0Oo, this.f54881OooO0o0, this.f54880OooO0o, this.f54882OooO0oO, this.f54883OooO0oo, this.f54878OooO, this.f54884OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54885OooOO0O | 1));
        return Unit.INSTANCE;
    }
}
