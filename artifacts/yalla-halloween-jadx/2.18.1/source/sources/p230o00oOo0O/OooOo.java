package p230o00oOo0O;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO00o<?, ?>> f33903OooO00o = new ArrayList();

    public static final class OooO00o<Z, R> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<Z> f33904OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<R> f33905OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooOo00<Z, R> f33906OooO0OO;

        public OooO00o(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull OooOo00<Z, R> oooOo00) {
            this.f33904OooO00o = cls;
            this.f33905OooO0O0 = cls2;
            this.f33906OooO0OO = oooOo00;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o00oOo0O.OooOo$OooO00o<?, ?>>] */
    @NonNull
    public final synchronized <Z, R> List<Class<R>> OooO00o(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (OooO00o oooO00o : this.f33903OooO00o) {
            if (oooO00o.f33904OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(oooO00o.f33905OooO0O0)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
