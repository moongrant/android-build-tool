package p089o000o00O;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p084o000Ooo0.o000oOoO;
import p090o000o00o.o00O0;
import p090o000o00o.o00O0O0;
import p090o000o00o.o00O0O00;
import p090o000o00o.o00O0O0O;
import p090o000o00o.o00O0OO;
import p090o000o00o.o00O0OO0;
import p090o000o00o.o00O0OOO;
import p090o000o00o.oo0o0O0;
import p096o000o0o0.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00o implements o00O0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f35225OooO0Oo = o000oOoO.OooO0o0("WorkConstraintsTracker");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o00O00o0 f35226OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O0<?>[] f35227OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f35228OooO0OO;

    public oo00o(@NonNull Context context, @NonNull o0000O0 o0000o1, @Nullable o00O00o0 o00o00o1) {
        Context applicationContext = context.getApplicationContext();
        this.f35226OooO00o = o00o00o1;
        this.f35227OooO0O0 = new o00O0O0[]{new o00O0(applicationContext, o0000o1), new o00O0O00(applicationContext, o0000o1), new o00O0OOO(applicationContext, o0000o1), new o00O0O0O(applicationContext, o0000o1), new o00O0OO(applicationContext, o0000o1), new oo0o0O0(applicationContext, o0000o1), new o00O0OO0(applicationContext, o0000o1)};
        this.f35228OooO0OO = new Object();
    }

    public final boolean OooO00o(@NonNull String str) {
        synchronized (this.f35228OooO0OO) {
            for (o00O0O0<?> o00o0o0 : this.f35227OooO0O0) {
                Object obj = o00o0o0.f35230OooO0O0;
                if (obj != null && o00o0o0.OooO0OO(obj) && o00o0o0.f35229OooO00o.contains(str)) {
                    o000oOoO.OooO0OO().OooO00o(f35225OooO0Oo, String.format("Work %s constrained by %s", str, o00o0o0.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void OooO0O0(@NonNull ArrayList arrayList) {
        synchronized (this.f35228OooO0OO) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (OooO00o(str)) {
                    o000oOoO.OooO0OO().OooO00o(f35225OooO0Oo, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList2.add(str);
                }
            }
            o00O00o0 o00o00o1 = this.f35226OooO00o;
            if (o00o00o1 != null) {
                o00o00o1.OooO0o(arrayList2);
            }
        }
    }

    public final void OooO0OO(@NonNull Collection collection) {
        synchronized (this.f35228OooO0OO) {
            for (o00O0O0<?> o00o0o0 : this.f35227OooO0O0) {
                if (o00o0o0.f35232OooO0Oo != null) {
                    o00o0o0.f35232OooO0Oo = null;
                    o00o0o0.OooO0o0(null, o00o0o0.f35230OooO0O0);
                }
            }
            for (o00O0O0<?> o00o0o1 : this.f35227OooO0O0) {
                o00o0o1.OooO0Oo(collection);
            }
            for (o00O0O0<?> o00o0o2 : this.f35227OooO0O0) {
                if (o00o0o2.f35232OooO0Oo != this) {
                    o00o0o2.f35232OooO0Oo = this;
                    o00o0o2.OooO0o0(this, o00o0o2.f35230OooO0O0);
                }
            }
        }
    }

    public final void OooO0Oo() {
        synchronized (this.f35228OooO0OO) {
            for (o00O0O0<?> o00o0o0 : this.f35227OooO0O0) {
                ArrayList arrayList = o00o0o0.f35229OooO00o;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    o00o0o0.f35231OooO0OO.OooO0O0(o00o0o0);
                }
            }
        }
    }
}
