package p674oooo00o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p084o000Ooo0.o000oOoO;
import p089o000o00O.oOO00O;
import p090o000o00o.o00O0O0;
import p096o000o0o0.o0000O0;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class oO0O000o<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f60980OooO0o = o000oOoO.OooO0o0("ConstraintTracker");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O0 f60981OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f60982OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f60983OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashSet f60984OooO0Oo = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public T f60985OooO0o0;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List f60986OooO0Oo;

        public OooO00o(ArrayList arrayList) {
            this.f60986OooO0Oo = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.f60986OooO0Oo.iterator();
            while (it.hasNext()) {
                ((oOO00O) it.next()).OooO00o(oO0O000o.this.f60985OooO0o0);
            }
        }
    }

    public oO0O000o(@NonNull Context context, @NonNull o0000O0 o0000o1) {
        this.f60982OooO0O0 = context.getApplicationContext();
        this.f60981OooO00o = o0000o1;
    }

    public abstract T OooO00o();

    public final void OooO0O0(o00O0O0 o00o0o0) {
        synchronized (this.f60983OooO0OO) {
            if (this.f60984OooO0Oo.remove(o00o0o0) && this.f60984OooO0Oo.isEmpty()) {
                OooO0o0();
            }
        }
    }

    public final void OooO0OO(T t) {
        synchronized (this.f60983OooO0OO) {
            T t2 = this.f60985OooO0o0;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f60985OooO0o0 = t;
                ((o0000O0O) this.f60981OooO00o).f35391OooO0OO.execute(new OooO00o(new ArrayList(this.f60984OooO0Oo)));
            }
        }
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o0();
}
