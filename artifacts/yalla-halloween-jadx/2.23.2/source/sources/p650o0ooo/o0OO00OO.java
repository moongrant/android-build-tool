package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0oo00 f58679OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f58680OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<String, o0O0oo00, Unit> f58681OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OO00OO(o0O0oo00 o0o0oo00, Function2<? super String, ? super o0O0oo00, Unit> function2, int i) {
        super(2);
        this.f58679OooO0Oo = o0o0oo00;
        this.f58681OooO0o0 = function2;
        this.f58680OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f58680OooO0o | 1);
        o0OO00o0.OooO00o(this.f58679OooO0Oo, this.f58681OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
