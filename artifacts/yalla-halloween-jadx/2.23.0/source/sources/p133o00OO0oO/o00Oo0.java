package p133o00OO0oO;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f37321OooO00o = new ArrayList();

    public static final class OooO00o<Z, R> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<Z> f37322OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<R> f37323OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00O0O<Z, R> f37324OooO0OO;

        public OooO00o(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull o00O0O<Z, R> o00o0o2) {
            this.f37322OooO00o = cls;
            this.f37323OooO0O0 = cls2;
            this.f37324OooO0OO = o00o0o2;
        }
    }

    @NonNull
    public final synchronized <Z, R> o00O0O<Z, R> OooO00o(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return o00Ooo.f37325OooO00o;
        }
        for (OooO00o oooO00o : this.f37321OooO00o) {
            if (oooO00o.f37322OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(oooO00o.f37323OooO0O0)) {
                return oooO00o.f37324OooO0OO;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList OooO0O0(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (OooO00o oooO00o : this.f37321OooO00o) {
            if ((oooO00o.f37322OooO00o.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(oooO00o.f37323OooO0O0)) && !arrayList.contains(oooO00o.f37323OooO0O0)) {
                arrayList.add(oooO00o.f37323OooO0O0);
            }
        }
        return arrayList;
    }
}
