package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ y4 f58201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f58202OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f58203OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f58204OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(y4 y4Var, String str, MutableState<Boolean> mutableState, int i) {
        super(2);
        this.f58201OooO0Oo = y4Var;
        this.f58203OooO0o0 = str;
        this.f58202OooO0o = mutableState;
        this.f58204OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f58204OooO0oO | 1);
        MutableState<Boolean> mutableState = this.f58202OooO0o;
        String str = this.f58203OooO0o0;
        this.f58201OooO0Oo.OooO0O0(iUpdateChangedFlags, composer, mutableState, str);
        return Unit.INSTANCE;
    }
}
