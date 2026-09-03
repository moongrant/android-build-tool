package p363o0OOOoo0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f38572OooO00o = new OooO00o(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f38573OooO0O0 = new OooO00o(true);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AtomicMarkableReference<String> f38574OooO0OO = new AtomicMarkableReference<>(null, false);

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicMarkableReference<OooOOO> f38575OooO00o;

        public OooO00o(boolean z) {
            new AtomicReference(null);
            this.f38575OooO00o = new AtomicMarkableReference<>(new OooOOO(z ? 8192 : 1024), false);
        }

        public final Map<String, String> OooO00o() {
            Map<String, String> mapUnmodifiableMap;
            OooOOO reference = this.f38575OooO00o.getReference();
            synchronized (reference) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f38544OooO00o));
            }
            return mapUnmodifiableMap;
        }
    }
}
