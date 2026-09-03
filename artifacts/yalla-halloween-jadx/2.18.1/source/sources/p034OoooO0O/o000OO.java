package p034OoooO0O;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends Lambda implements Function1<OooO, o00O0O.OooO> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function0<o00O0O.OooO> f3533Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(Function0<o00O0O.OooO> function0) {
        super(1);
        this.f3533Oooo0o = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o00O0O.OooO invoke(OooO oooO) {
        OooO magnifier = oooO;
        Intrinsics.checkNotNullParameter(magnifier, "$this$magnifier");
        return new o00O0O.OooO(this.f3533Oooo0o.invoke().f30395OooO00o);
    }
}
