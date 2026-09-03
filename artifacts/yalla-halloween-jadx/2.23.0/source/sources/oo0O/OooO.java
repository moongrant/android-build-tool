package oo0O;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p126o00O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f60879OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f60880OooO0O0 = new HashMap();

    public static class OooO00o<T, R> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f60881OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<R> f60882OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00000O0<T, R> f60883OooO0OO;

        public OooO00o(@NonNull Class<T> cls, @NonNull Class<R> cls2, o00000O0<T, R> o00000o1) {
            this.f60881OooO00o = cls;
            this.f60882OooO0O0 = cls2;
            this.f60883OooO0OO = o00000o1;
        }
    }

    @NonNull
    public final synchronized List<OooO00o<?, ?>> OooO00o(@NonNull String str) {
        List<OooO00o<?, ?>> arrayList;
        if (!this.f60879OooO00o.contains(str)) {
            this.f60879OooO00o.add(str);
        }
        arrayList = (List) this.f60880OooO0O0.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f60880OooO0O0.put(str, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList OooO0O0(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f60879OooO00o.iterator();
        while (it.hasNext()) {
            List<OooO00o> list = (List) this.f60880OooO0O0.get((String) it.next());
            if (list != null) {
                for (OooO00o oooO00o : list) {
                    if ((oooO00o.f60881OooO00o.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(oooO00o.f60882OooO0O0)) && !arrayList.contains(oooO00o.f60882OooO0O0)) {
                        arrayList.add(oooO00o.f60882OooO0O0);
                    }
                }
            }
        }
        return arrayList;
    }
}
