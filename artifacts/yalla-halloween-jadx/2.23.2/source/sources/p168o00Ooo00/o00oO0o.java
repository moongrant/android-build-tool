package p168o00Ooo00;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f38224OooO00o = new ArrayList();

    public static final class OooO00o<Z, R> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<Z> f38225OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<R> f38226OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final oo000o<Z, R> f38227OooO0OO;

        public OooO00o(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull oo000o<Z, R> oo000oVar) {
            this.f38225OooO00o = cls;
            this.f38226OooO0O0 = cls2;
            this.f38227OooO0OO = oo000oVar;
        }
    }

    @NonNull
    public final synchronized <Z, R> oo000o<Z, R> OooO00o(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return o0ooOOo.f38230OooO00o;
        }
        for (OooO00o oooO00o : this.f38224OooO00o) {
            if (oooO00o.f38225OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(oooO00o.f38226OooO0O0)) {
                return oooO00o.f38227OooO0OO;
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
        for (OooO00o oooO00o : this.f38224OooO00o) {
            if ((oooO00o.f38225OooO00o.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(oooO00o.f38226OooO0O0)) && !arrayList.contains(oooO00o.f38226OooO0O0)) {
                arrayList.add(oooO00o.f38226OooO0O0);
            }
        }
        return arrayList;
    }
}
