package p100o000oOoO;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p036OoooOOO.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0o00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo<Object> f29568Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo0O f29569Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(oo0o0Oo<Object> oo0o0oo, oo0O oo0o) {
        super(0);
        this.f29568Oooo0o = oo0o0oo;
        this.f29569Oooo0oO = oo0o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0o0Oo<Object> oo0o0oo = this.f29568Oooo0o;
        oo0O oo0o = this.f29569Oooo0oO;
        Iterator<Object> it = oo0o0oo.iterator();
        while (true) {
            oo0o0Oo.OooO00o oooO00o = (oo0o0Oo.OooO00o) it;
            if (!oooO00o.hasNext()) {
                return Unit.INSTANCE;
            }
            oo0o.OooOO0o(oooO00o.next());
        }
    }
}
