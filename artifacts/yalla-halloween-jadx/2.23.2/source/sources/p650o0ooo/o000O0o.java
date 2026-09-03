package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f58497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f58498OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f58499OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f58500OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f58501OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(MutableState<Long> mutableState, Function0<Unit> function0, Function0<Unit> function1, boolean z, int i) {
        super(2);
        this.f58497OooO0Oo = mutableState;
        this.f58499OooO0o0 = function0;
        this.f58498OooO0o = function1;
        this.f58500OooO0oO = z;
        this.f58501OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o000Oo0.OooO00o(this.f58497OooO0Oo, this.f58499OooO0o0, this.f58498OooO0o, this.f58500OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f58501OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
