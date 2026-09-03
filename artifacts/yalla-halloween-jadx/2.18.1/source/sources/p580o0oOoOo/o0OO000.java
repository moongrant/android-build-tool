package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o0000O0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO000 extends Lambda implements Function1<o000oOoO, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f46399Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000(Ref.IntRef intRef) {
        super(1);
        this.f46399Oooo0o = intRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000oOoO o000oooo2) {
        long j = o000oooo2.f27322OooO00o;
        this.f46399Oooo0o.element = o000oOoO.OooO0O0(j);
        return Unit.INSTANCE;
    }
}
