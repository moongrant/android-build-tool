package p112o000oooo;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o00O000.OooO0O0;
import p102o000oo.o0OoOo0;
import p109o000ooo.o00000O0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class oO0O00o0<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f30048OooO0o = o0OoOo0.OooO0o0("ConstraintTracker");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O000.OooO00o f30049OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f30050OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f30051OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<o00000O0<T>> f30052OooO0Oo = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public T f30053OooO0o0;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List f30054Oooo0o;

        public OooO00o(List list) {
            this.f30054Oooo0o = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.f30054Oooo0o.iterator();
            while (it.hasNext()) {
                ((o00000O0) it.next()).OooO00o(oO0O00o0.this.f30053OooO0o0);
            }
        }
    }

    public oO0O00o0(@NonNull Context context, @NonNull o00O000.OooO00o oooO00o) {
        this.f30050OooO0O0 = context.getApplicationContext();
        this.f30049OooO00o = oooO00o;
    }

    public abstract T OooO00o();

    public final void OooO0O0(o00000O0<T> o00000o1) {
        synchronized (this.f30051OooO0OO) {
            if (this.f30052OooO0Oo.remove(o00000o1) && this.f30052OooO0Oo.isEmpty()) {
                OooO0o0();
            }
        }
    }

    public final void OooO0OO(T t) {
        synchronized (this.f30051OooO0OO) {
            T t2 = this.f30053OooO0o0;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f30053OooO0o0 = t;
                ((OooO0O0) this.f30049OooO00o).f30116OooO0OO.execute(new OooO00o(new ArrayList(this.f30052OooO0Oo)));
            }
        }
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o0();
}
