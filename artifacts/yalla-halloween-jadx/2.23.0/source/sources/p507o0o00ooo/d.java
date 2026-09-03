package p507o0o00ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ f f49798OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f49799OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f49800OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f49801OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, String str, Function0<Unit> function0, int i) {
        super(2);
        this.f49798OooO0Oo = fVar;
        this.f49800OooO0o0 = str;
        this.f49799OooO0o = function0;
        this.f49801OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49801OooO0oO | 1);
        String str = this.f49800OooO0o0;
        Function0<Unit> function0 = this.f49799OooO0o;
        f.OooO0O0(this.f49798OooO0Oo, str, function0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
