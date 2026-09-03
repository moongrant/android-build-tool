package p232o00oOoO;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p217o00oO00o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<String> f33952OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, List<OooO00o<?, ?>>> f33953OooO0O0 = new HashMap();

    public static class OooO00o<T, R> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f33954OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<R> f33955OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00000O0<T, R> f33956OooO0OO;

        public OooO00o(@NonNull Class<T> cls, @NonNull Class<R> cls2, o00000O0<T, R> o00000o1) {
            this.f33954OooO00o = cls;
            this.f33955OooO0O0 = cls2;
            this.f33956OooO0OO = o00000o1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<o00oOoO.o00OOO00$OooO00o<?, ?>>>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<o00oOoO.o00OOO00$OooO00o<?, ?>>>] */
    @NonNull
    public final synchronized List<OooO00o<?, ?>> OooO00o(@NonNull String str) {
        List<OooO00o<?, ?>> arrayList;
        if (!this.f33952OooO00o.contains(str)) {
            this.f33952OooO00o.add(str);
        }
        arrayList = (List) this.f33953OooO0O0.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f33953OooO0O0.put(str, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<o00oOoO.o00OOO00$OooO00o<?, ?>>>] */
    @NonNull
    public final synchronized <T, R> List<Class<R>> OooO0O0(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f33952OooO00o.iterator();
        while (it.hasNext()) {
            List<OooO00o> list = (List) this.f33953OooO0O0.get((String) it.next());
            if (list != null) {
                for (OooO00o oooO00o : list) {
                    if ((oooO00o.f33954OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(oooO00o.f33955OooO0O0)) && !arrayList.contains(oooO00o.f33955OooO0O0)) {
                        arrayList.add(oooO00o.f33955OooO0O0);
                    }
                }
            }
        }
        return arrayList;
    }
}
