package p109o000ooo;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O000.OooO00o;
import p102o000oo.o0OoOo0;
import p111o000oooO.oO0;
import p111o000oooO.oO0O000;
import p111o000oooO.oO0OO00o;
import p111o000oooO.oOo0000O;
import p111o000oooO.oOo000Oo;
import p111o000oooO.oOo000o0;
import p111o000oooO.oOo00o0o;
import p111o000oooO.oOo00ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo implements oO0OO00o.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f30024OooO0Oo = o0OoOo0.OooO0o0("WorkConstraintsTracker");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o00000OO f30025OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0OO00o<?>[] f30026OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f30027OooO0OO;

    public o0000Ooo(@NonNull Context context, @NonNull OooO00o oooO00o, @Nullable o00000OO o00000oo2) {
        Context applicationContext = context.getApplicationContext();
        this.f30025OooO00o = o00000oo2;
        this.f30026OooO0O0 = new oO0OO00o[]{new oOo00o0o(applicationContext, oooO00o), new oOo00ooO(applicationContext, oooO00o), new oO0O000(applicationContext, oooO00o), new oOo000Oo(applicationContext, oooO00o), new oO0(applicationContext, oooO00o), new oOo000o0(applicationContext, oooO00o), new oOo0000O(applicationContext, oooO00o)};
        this.f30027OooO0OO = new Object();
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final boolean OooO00o(@NonNull String str) {
        synchronized (this.f30027OooO0OO) {
            for (oO0OO00o<?> oo0oo00o : this.f30026OooO0O0) {
                Object obj = oo0oo00o.f30037OooO0O0;
                if (obj != null && oo0oo00o.OooO0OO(obj) && oo0oo00o.f30036OooO00o.contains(str)) {
                    o0OoOo0.OooO0OO().OooO00o(f30024OooO0Oo, String.format("Work %s constrained by %s", str, oo0oo00o.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void OooO0O0(@NonNull Iterable<o00O0000.o0OoOo0> iterable) {
        synchronized (this.f30027OooO0OO) {
            for (oO0OO00o<?> oo0oo00o : this.f30026OooO0O0) {
                if (oo0oo00o.f30039OooO0Oo != null) {
                    oo0oo00o.f30039OooO0Oo = null;
                    oo0oo00o.OooO0o0(null, oo0oo00o.f30037OooO0O0);
                }
            }
            for (oO0OO00o<?> oo0oo00o2 : this.f30026OooO0O0) {
                oo0oo00o2.OooO0Oo(iterable);
            }
            for (oO0OO00o<?> oo0oo00o3 : this.f30026OooO0O0) {
                if (oo0oo00o3.f30039OooO0Oo != this) {
                    oo0oo00o3.f30039OooO0Oo = this;
                    oo0oo00o3.OooO0o0(this, oo0oo00o3.f30037OooO0O0);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final void OooO0OO() {
        synchronized (this.f30027OooO0OO) {
            for (oO0OO00o<?> oo0oo00o : this.f30026OooO0O0) {
                if (!oo0oo00o.f30036OooO00o.isEmpty()) {
                    oo0oo00o.f30036OooO00o.clear();
                    oo0oo00o.f30038OooO0OO.OooO0O0(oo0oo00o);
                }
            }
        }
    }
}
