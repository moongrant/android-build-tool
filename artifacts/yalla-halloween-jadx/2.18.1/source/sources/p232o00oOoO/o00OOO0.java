package p232o00oOoO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p217o00oO00o.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO00o<?>> f33949OooO00o = new ArrayList();

    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f33950OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00000O<T> f33951OooO0O0;

        public OooO00o(@NonNull Class<T> cls, @NonNull o00000O<T> o00000o) {
            this.f33950OooO00o = cls;
            this.f33951OooO0O0 = o00000o;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final synchronized <Z> o00000O<Z> OooO00o(@NonNull Class<Z> cls) {
        int size = this.f33949OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO00o<?> oooO00o = this.f33949OooO00o.get(i);
            if (oooO00o.f33950OooO00o.isAssignableFrom((Class<?>) cls)) {
                return oooO00o.f33951OooO0O0;
            }
        }
        return null;
    }
}
