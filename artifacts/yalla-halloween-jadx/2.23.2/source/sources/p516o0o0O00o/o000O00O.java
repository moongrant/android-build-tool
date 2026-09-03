package p516o0o0O00o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f51198OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f51199OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f51200OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f51201OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(o000O0Oo o000o0oo2, String str, Function0<Unit> function0, int i) {
        super(2);
        this.f51198OooO0Oo = o000o0oo2;
        this.f51200OooO0o0 = str;
        this.f51199OooO0o = function0;
        this.f51201OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51201OooO0oO | 1);
        String str = this.f51200OooO0o0;
        Function0<Unit> function0 = this.f51199OooO0o;
        o000O0Oo.OooO0O0(this.f51198OooO0Oo, str, function0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
