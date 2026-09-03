package p169o00Ooo0O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p154o00Oo0oo.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f38245OooO00o = new ArrayList();

    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f38246OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000OOo<T> f38247OooO0O0;

        public OooO00o(@NonNull Class<T> cls, @NonNull o000OOo<T> o000ooo2) {
            this.f38246OooO00o = cls;
            this.f38247OooO0O0 = o000ooo2;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final synchronized <Z> o000OOo<Z> OooO00o(@NonNull Class<Z> cls) {
        int size = this.f38245OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO00o oooO00o = (OooO00o) this.f38245OooO00o.get(i);
            if (oooO00o.f38246OooO00o.isAssignableFrom((Class<?>) cls)) {
                return oooO00o.f38247OooO0O0;
            }
        }
        return null;
    }
}
