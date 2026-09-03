package androidx.paging;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p101o000oo.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends Lambda implements Function0<Oooo000.OooO0O0<Object>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000OO0<Object> f10262OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(o0000OO0<Object> o0000oo1) {
        super(0);
        this.f10262OooO0Oo = o0000oo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Oooo000.OooO0O0<Object> invoke() {
        Oooo000 oooo000 = (Oooo000) CollectionsKt.firstOrNull((List) this.f10262OooO0Oo.f35431OooO0OO.f10190OooO00o.f10220OooO00o.OooO0O0());
        if (oooo000 != null && (oooo000 instanceof Oooo000.OooO0O0)) {
            Oooo000.OooO0O0<Object> oooO0O0 = (Oooo000.OooO0O0) oooo000;
            if (oooO0O0.f10286OooO00o == LoadType.REFRESH) {
                return oooO0O0;
            }
        }
        return null;
    }
}
