package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f58557OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f58558OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f58559OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f58560OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(String str, MutableState<String> mutableState, int i, int i2) {
        super(2);
        this.f58557OooO0Oo = str;
        this.f58559OooO0o0 = mutableState;
        this.f58558OooO0o = i;
        this.f58560OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f58560OooO0oO | 1);
        MutableState<String> mutableState = this.f58559OooO0o0;
        int i = this.f58558OooO0o;
        o00OO0O0.OooO00o(this.f58557OooO0Oo, mutableState, i, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
