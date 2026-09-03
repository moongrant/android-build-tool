package p519o0o0O0oO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ y4 f52224OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52225OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f52226OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f52227OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(y4 y4Var, String str, MutableState<Boolean> mutableState, int i) {
        super(2);
        this.f52224OooO0Oo = y4Var;
        this.f52226OooO0o0 = str;
        this.f52225OooO0o = mutableState;
        this.f52227OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52227OooO0oO | 1);
        MutableState<Boolean> mutableState = this.f52225OooO0o;
        String str = this.f52226OooO0o0;
        this.f52224OooO0Oo.OooO0O0(iUpdateChangedFlags, composer, mutableState, str);
        return Unit.INSTANCE;
    }
}
