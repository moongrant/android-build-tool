package p519o0o0O0oO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Oo0000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f52159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f52160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f52161OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f52162OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f52163OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oo0000(int i, int i2, String str, Function0 function0, boolean z) {
        super(2);
        this.f52159OooO0Oo = z;
        this.f52161OooO0o0 = str;
        this.f52160OooO0o = function0;
        this.f52162OooO0oO = i;
        this.f52163OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        boolean z = this.f52159OooO0Oo;
        a.OooO00o(this.f52161OooO0o0, z, this.f52160OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52162OooO0oO | 1), this.f52163OooO0oo);
        return Unit.INSTANCE;
    }
}
