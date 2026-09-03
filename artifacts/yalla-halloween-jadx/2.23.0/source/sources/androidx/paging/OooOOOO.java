package androidx.paging;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends Lambda implements Function0<Oooo000.OooO0O0<Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O00O.o000000<Object> f7168OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(o000O00O.o000000<Object> o000000Var) {
        super(0);
        this.f7168OooO0Oo = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Oooo000.OooO0O0<Object> invoke() {
        Oooo000 oooo000 = (Oooo000) CollectionsKt.firstOrNull((List) this.f7168OooO0Oo.f34490OooO0OO.f7096OooO00o.f7126OooO00o.OooO0O0());
        if (oooo000 != null && (oooo000 instanceof Oooo000.OooO0O0)) {
            Oooo000.OooO0O0<Object> oooO0O0 = (Oooo000.OooO0O0) oooo000;
            if (oooO0O0.f7192OooO00o == LoadType.REFRESH) {
                return oooO0O0;
            }
        }
        return null;
    }
}
