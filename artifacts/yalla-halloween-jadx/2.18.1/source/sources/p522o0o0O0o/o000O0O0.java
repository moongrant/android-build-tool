package p522o0o0O0o;

import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Lazy<List<Function0<Unit>>> f42984Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O0O0(Lazy<? extends List<Function0<Unit>>> lazy) {
        super(0);
        this.f42984Oooo0o = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Iterator<T> it = this.f42984Oooo0o.getValue().iterator();
        while (it.hasNext()) {
            Function0 function0 = (Function0) it.next();
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
