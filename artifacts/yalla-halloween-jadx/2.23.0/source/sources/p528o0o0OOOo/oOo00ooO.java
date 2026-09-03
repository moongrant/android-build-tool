package p528o0o0OOOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00ooO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0OO00o f54385OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f54386OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f54387OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54388OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOo00ooO(oO0OO00o oo0oo00o, int i, Function1<? super Integer, Unit> function1, int i2) {
        super(2);
        this.f54385OooO0Oo = oo0oo00o;
        this.f54387OooO0o0 = i;
        this.f54386OooO0o = function1;
        this.f54388OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54388OooO0oO | 1);
        int i = this.f54387OooO0o0;
        Function1<Integer, Unit> function1 = this.f54386OooO0o;
        this.f54385OooO0Oo.OooO00o(i, iUpdateChangedFlags, composer, function1);
        return Unit.INSTANCE;
    }
}
