package p549o0oOOOoo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55883OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55884OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f55885OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O(int i, MutableState mutableState, String str) {
        super(2);
        this.f55883OooO0Oo = mutableState;
        this.f55885OooO0o0 = str;
        this.f55884OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0OO000.OooO00o(RecomposeScopeImplKt.updateChangedFlags(this.f55884OooO0o | 1), composer, this.f55883OooO0Oo, this.f55885OooO0o0);
        return Unit.INSTANCE;
    }
}
