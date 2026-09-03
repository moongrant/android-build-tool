package o00O0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o00O0O0O.OooO0o;
import o00O0OO.OooOo;
import o00O0OO.o00Ooo;
import o00O0OO.o0ooOOo;
import o00O0OO0.o000oOoO;
import oo00o.OooO;
import oo00o.o00000O0;
import oo00o.o0OOO0o;
import oo00o.oo000o;
import p115o00O00oO.Oooo0;
import p115o00O00oO.o000OOo;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO implements oo000o, o00O0O0O.OooO0OO, OooO {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f35992OooOOO0 = o0Oo0oo.OooO0o("GreedyScheduler");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f35993OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f35994OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0o f35995OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00000O0 f35996OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0O0 f35998OooO0oo;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Boolean f36001OooOO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashSet f35997OooO0oO = new HashSet();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0OOO0o f36000OooOO0O = new o0OOO0o();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Object f35999OooOO0 = new Object();

    public OooO0OO(@NonNull Context context, @NonNull androidx.work.OooO00o oooO00o, @NonNull o000oOoO o000oooo2, @NonNull o00000O0 o00000o1) {
        this.f35994OooO0Oo = context;
        this.f35996OooO0o0 = o00000o1;
        this.f35995OooO0o = new OooO0o(o000oooo2, this);
        this.f35998OooO0oo = new OooO0O0(this, oooO00o.f11469OooO0o0);
    }

    @Override // oo00o.oo000o
    public final void OooO00o(@NonNull o00Ooo... o00oooArr) {
        if (this.f36001OooOO0o == null) {
            this.f36001OooOO0o = Boolean.valueOf(o00O0OOO.o00Ooo.OooO00o(this.f35994OooO0Oo, this.f35996OooO0o0.f60220OooO0O0));
        }
        if (!this.f36001OooOO0o.booleanValue()) {
            o0Oo0oo.OooO0Oo().OooO0o0(f35992OooOOO0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f35993OooO) {
            this.f35996OooO0o0.f60223OooO0o.OooO00o(this);
            this.f35993OooO = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o00Ooo spec : o00oooArr) {
            if (!this.f36000OooOO0O.OooO00o(o0ooOOo.OooO00o(spec))) {
                long jOooO00o = spec.OooO00o();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (spec.f36217OooO0O0 == WorkInfo$State.ENQUEUED) {
                    if (jCurrentTimeMillis < jOooO00o) {
                        OooO0O0 oooO0O0 = this.f35998OooO0oo;
                        if (oooO0O0 != null) {
                            HashMap map = oooO0O0.f35991OooO0OO;
                            Runnable runnable = (Runnable) map.remove(spec.f36216OooO00o);
                            o000OOo o000ooo2 = oooO0O0.f35990OooO0O0;
                            if (runnable != null) {
                                ((oo00o.OooO0o) o000ooo2).f60201OooO00o.removeCallbacks(runnable);
                            }
                            OooO00o oooO00o = new OooO00o(oooO0O0, spec);
                            map.put(spec.f36216OooO00o, oooO00o);
                            ((oo00o.OooO0o) o000ooo2).f60201OooO00o.postDelayed(oooO00o, spec.OooO00o() - System.currentTimeMillis());
                        }
                    } else if (spec.OooO0O0()) {
                        int i = Build.VERSION.SDK_INT;
                        Oooo0 oooo0 = spec.f36224OooOO0;
                        if (oooo0.f36133OooO0OO) {
                            o0Oo0oo.OooO0Oo().OooO00o(f35992OooOOO0, "Ignoring " + spec + ". Requires device idle.");
                        } else if (i < 24 || !(!oooo0.f36138OooO0oo.isEmpty())) {
                            hashSet.add(spec);
                            hashSet2.add(spec.f36216OooO00o);
                        } else {
                            o0Oo0oo.OooO0Oo().OooO00o(f35992OooOOO0, "Ignoring " + spec + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f36000OooOO0O.OooO00o(o0ooOOo.OooO00o(spec))) {
                        o0Oo0oo.OooO0Oo().OooO00o(f35992OooOOO0, "Starting work for " + spec.f36216OooO00o);
                        o00000O0 o00000o1 = this.f35996OooO0o0;
                        o0OOO0o o0ooo0o2 = this.f36000OooOO0O;
                        o0ooo0o2.getClass();
                        Intrinsics.checkNotNullParameter(spec, "spec");
                        o00000o1.OooO0oo(o0ooo0o2.OooO0Oo(o0ooOOo.OooO00o(spec)), null);
                    }
                }
            }
        }
        synchronized (this.f35999OooOO0) {
            if (!hashSet.isEmpty()) {
                o0Oo0oo.OooO0Oo().OooO00o(f35992OooOOO0, "Starting tracking for " + TextUtils.join(",", hashSet2));
                this.f35997OooO0oO.addAll(hashSet);
                this.f35995OooO0o.OooO0Oo(this.f35997OooO0oO);
            }
        }
    }

    @Override // oo00o.oo000o
    public final void OooO0O0(@NonNull String str) {
        Runnable runnable;
        Boolean bool = this.f36001OooOO0o;
        o00000O0 o00000o1 = this.f35996OooO0o0;
        if (bool == null) {
            this.f36001OooOO0o = Boolean.valueOf(o00O0OOO.o00Ooo.OooO00o(this.f35994OooO0Oo, o00000o1.f60220OooO0O0));
        }
        boolean zBooleanValue = this.f36001OooOO0o.booleanValue();
        String str2 = f35992OooOOO0;
        if (!zBooleanValue) {
            o0Oo0oo.OooO0Oo().OooO0o0(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f35993OooO) {
            o00000o1.f60223OooO0o.OooO00o(this);
            this.f35993OooO = true;
        }
        o0Oo0oo.OooO0Oo().OooO00o(str2, "Cancelling work ID " + str);
        OooO0O0 oooO0O0 = this.f35998OooO0oo;
        if (oooO0O0 != null && (runnable = (Runnable) oooO0O0.f35991OooO0OO.remove(str)) != null) {
            ((oo00o.OooO0o) oooO0O0.f35990OooO0O0).f60201OooO00o.removeCallbacks(runnable);
        }
        Iterator<oo00o.o0ooOOo> it = this.f36000OooOO0O.OooO0O0(str).iterator();
        while (it.hasNext()) {
            o00000o1.OooO(it.next());
        }
    }

    @Override // o00O0O0O.OooO0OO
    public final void OooO0OO(@NonNull ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooOo oooOoOooO00o = o0ooOOo.OooO00o((o00Ooo) it.next());
            o0Oo0oo.OooO0Oo().OooO00o(f35992OooOOO0, "Constraints not met: Cancelling work ID " + oooOoOooO00o);
            oo00o.o0ooOOo o0oooooOooO0OO = this.f36000OooOO0O.OooO0OO(oooOoOooO00o);
            if (o0oooooOooO0OO != null) {
                this.f35996OooO0o0.OooO(o0oooooOooO0OO);
            }
        }
    }

    @Override // oo00o.OooO
    public final void OooO0Oo(@NonNull OooOo oooOo, boolean z) {
        this.f36000OooOO0O.OooO0OO(oooOo);
        synchronized (this.f35999OooOO0) {
            for (o00Ooo o00ooo2 : this.f35997OooO0oO) {
                if (o0ooOOo.OooO00o(o00ooo2).equals(oooOo)) {
                    o0Oo0oo.OooO0Oo().OooO00o(f35992OooOOO0, "Stopping tracking for " + oooOo);
                    this.f35997OooO0oO.remove(o00ooo2);
                    this.f35995OooO0o.OooO0Oo(this.f35997OooO0oO);
                    break;
                }
            }
        }
    }

    @Override // o00O0O0O.OooO0OO
    public final void OooO0o(@NonNull List<o00Ooo> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            OooOo oooOoOooO00o = o0ooOOo.OooO00o((o00Ooo) it.next());
            o0OOO0o o0ooo0o2 = this.f36000OooOO0O;
            if (!o0ooo0o2.OooO00o(oooOoOooO00o)) {
                o0Oo0oo.OooO0Oo().OooO00o(f35992OooOOO0, "Constraints met: Scheduling work ID " + oooOoOooO00o);
                this.f35996OooO0o0.OooO0oo(o0ooo0o2.OooO0Oo(oooOoOooO00o), null);
            }
        }
    }

    @Override // oo00o.oo000o
    public final boolean OooO0o0() {
        return false;
    }
}
