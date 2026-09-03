package oo0O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p126o00O0oOo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f60893OooO00o = new ArrayList();

    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f60894OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00000O<T> f60895OooO0O0;

        public OooO00o(@NonNull Class<T> cls, @NonNull o00000O<T> o00000o) {
            this.f60894OooO00o = cls;
            this.f60895OooO0O0 = o00000o;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final synchronized <Z> o00000O<Z> OooO00o(@NonNull Class<Z> cls) {
        int size = this.f60893OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO00o oooO00o = (OooO00o) this.f60893OooO00o.get(i);
            if (oooO00o.f60894OooO00o.isAssignableFrom((Class<?>) cls)) {
                return oooO00o.f60895OooO0O0;
            }
        }
        return null;
    }
}
