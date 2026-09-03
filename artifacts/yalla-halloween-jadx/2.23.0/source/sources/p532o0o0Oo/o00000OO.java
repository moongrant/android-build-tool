package p532o0o0Oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class o00000OO<T, Y> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f54565OooO00o = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f54566OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f54567OooO0OO;

    public static final class OooO00o<Y> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Y f54568OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f54569OooO0O0;

        public OooO00o(Y y, int i) {
            this.f54568OooO00o = y;
            this.f54569OooO0O0 = i;
        }
    }

    public o00000OO(long j) {
        this.f54566OooO0O0 = j;
    }

    @Nullable
    public final synchronized Y OooO00o(@NonNull T t) {
        OooO00o oooO00o;
        oooO00o = (OooO00o) this.f54565OooO00o.get(t);
        return oooO00o != null ? oooO00o.f54568OooO00o : null;
    }

    public int OooO0O0(@Nullable Y y) {
        return 1;
    }

    public void OooO0OO(@NonNull T t, @Nullable Y y) {
    }

    @Nullable
    public final synchronized Y OooO0Oo(@NonNull T t, @Nullable Y y) {
        int iOooO0O0 = OooO0O0(y);
        long j = iOooO0O0;
        if (j >= this.f54566OooO0O0) {
            OooO0OO(t, y);
            return null;
        }
        if (y != null) {
            this.f54567OooO0OO += j;
        }
        OooO00o oooO00o = (OooO00o) this.f54565OooO00o.put(t, y == null ? null : new OooO00o(y, iOooO0O0));
        if (oooO00o != null) {
            this.f54567OooO0OO -= (long) oooO00o.f54569OooO0O0;
            if (!oooO00o.f54568OooO00o.equals(y)) {
                OooO0OO(t, oooO00o.f54568OooO00o);
            }
        }
        OooO0o0(this.f54566OooO0O0);
        return oooO00o != null ? oooO00o.f54568OooO00o : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void OooO0o0(long j) {
        while (this.f54567OooO0OO > j) {
            Iterator it = this.f54565OooO00o.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            OooO00o oooO00o = (OooO00o) entry.getValue();
            this.f54567OooO0OO -= (long) oooO00o.f54569OooO0O0;
            Object key = entry.getKey();
            it.remove();
            OooO0OO(key, oooO00o.f54568OooO00o);
        }
    }
}
