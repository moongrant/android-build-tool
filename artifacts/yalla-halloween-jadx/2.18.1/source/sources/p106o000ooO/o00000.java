package p106o000ooO;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.OooO00o;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o00O000.OooO0O0;
import p102o000oo.o0OoOo0;
import p107o000ooO0.OooOOO;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.Oooo000;
import p107o000ooO0.o00oO0o;
import p109o000ooo.o00000OO;
import p109o000ooo.o0000Ooo;
import p326o0O0ooO.o00O00o0;
import p326o0O0ooO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00000 implements Oooo000, o00000OO, OooOOOO {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final String f29924OoooOO0 = o0OoOo0.OooO0o0("GreedyScheduler");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f29926Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00oO0o f29927Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0000Ooo f29928Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Boolean f29929OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f29930OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public o000000O f29931OoooO00;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Set<o00O0000.o0OoOo0> f29925Oooo = new HashSet();

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Object f29932OoooO0O = new Object();

    public o00000(@NonNull Context context, @NonNull OooO00o oooO00o, @NonNull o00O000.OooO00o oooO00o2, @NonNull o00oO0o o00oo0o2) {
        this.f29926Oooo0o = context;
        this.f29927Oooo0oO = o00oo0o2;
        this.f29928Oooo0oo = new o0000Ooo(context, oooO00o2, this);
        this.f29931OoooO00 = new o000000O(this, oooO00o.f9738OooO0o0);
    }

    @Override // p107o000ooO0.Oooo000
    public final boolean OooO00o() {
        return false;
    }

    @Override // p109o000ooo.o00000OO
    public final void OooO0O0(@NonNull List<String> list) {
        for (String str : list) {
            o0OoOo0.OooO0OO().OooO00o(f29924OoooOO0, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f29927Oooo0oO.OooO0o(str);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p107o000ooO0.Oooo000
    public final void OooO0OO(@NonNull o00O0000.o0OoOo0... o0oooo0Arr) {
        if (this.f29929OoooO == null) {
            this.f29929OoooO = Boolean.valueOf(oOO00O.OooO00o(this.f29926Oooo0o, this.f29927Oooo0oO.f29975OooO0O0));
        }
        if (!this.f29929OoooO.booleanValue()) {
            o0OoOo0.OooO0OO().OooO0Oo(f29924OoooOO0, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f29930OoooO0) {
            this.f29927Oooo0oO.f29978OooO0o.OooO00o(this);
            this.f29930OoooO0 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o00O0000.o0OoOo0 o0oooo1 : o0oooo0Arr) {
            long jOooO00o = o0oooo1.OooO00o();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (o0oooo1.f30153OooO0O0 == WorkInfo$State.ENQUEUED) {
                if (jCurrentTimeMillis < jOooO00o) {
                    o000000O o000000o2 = this.f29931OoooO00;
                    if (o000000o2 != null) {
                        Runnable runnableRemove = o000000o2.f29938OooO0OO.remove(o0oooo1.f30152OooO00o);
                        if (runnableRemove != null) {
                            ((OooOOO) o000000o2.f29937OooO0O0).f29939OooO00o.removeCallbacks(runnableRemove);
                        }
                        o000000 o000000Var = new o000000(o000000o2, o0oooo1);
                        o000000o2.f29938OooO0OO.put(o0oooo1.f30152OooO00o, o000000Var);
                        ((OooOOO) o000000o2.f29937OooO0O0).f29939OooO00o.postDelayed(o000000Var, o0oooo1.OooO00o() - System.currentTimeMillis());
                    }
                } else if (o0oooo1.OooO0O0()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && o0oooo1.f30160OooOO0.f29791OooO0OO) {
                        o0OoOo0.OooO0OO().OooO00o(f29924OoooOO0, String.format("Ignoring WorkSpec %s, Requires device idle.", o0oooo1), new Throwable[0]);
                    } else if (i < 24 || !o0oooo1.f30160OooOO0.OooO00o()) {
                        hashSet.add(o0oooo1);
                        hashSet2.add(o0oooo1.f30152OooO00o);
                    } else {
                        o0OoOo0.OooO0OO().OooO00o(f29924OoooOO0, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", o0oooo1), new Throwable[0]);
                    }
                } else {
                    o0OoOo0.OooO0OO().OooO00o(f29924OoooOO0, String.format("Starting work for %s", o0oooo1.f30152OooO00o), new Throwable[0]);
                    o00oO0o o00oo0o2 = this.f29927Oooo0oO;
                    ((OooO0O0) o00oo0o2.f29977OooO0Oo).OooO00o(new o00O00o0(o00oo0o2, o0oooo1.f30152OooO00o, null));
                }
            }
        }
        synchronized (this.f29932OoooO0O) {
            if (!hashSet.isEmpty()) {
                o0OoOo0.OooO0OO().OooO00o(f29924OoooOO0, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f29925Oooo.addAll(hashSet);
                this.f29928Oooo0oo.OooO0O0(this.f29925Oooo);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<o00O0000.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.HashSet, java.util.Set<o00O0000.o0OoOo0>] */
    @Override // p107o000ooO0.OooOOOO
    public final void OooO0Oo(@NonNull String str, boolean z) {
        synchronized (this.f29932OoooO0O) {
            for (o00O0000.o0OoOo0 o0oooo1 : this.f29925Oooo) {
                if (o0oooo1.f30152OooO00o.equals(str)) {
                    o0OoOo0.OooO0OO().OooO00o(f29924OoooOO0, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f29925Oooo.remove(o0oooo1);
                    this.f29928Oooo0oo.OooO0O0(this.f29925Oooo);
                    break;
                }
            }
        }
    }

    @Override // p109o000ooo.o00000OO
    public final void OooO0o(@NonNull List<String> list) {
        for (String str : (ArrayList) list) {
            o0OoOo0.OooO0OO().OooO00o(f29924OoooOO0, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            o00oO0o o00oo0o2 = this.f29927Oooo0oO;
            ((OooO0O0) o00oo0o2.f29977OooO0Oo).OooO00o(new o00O00o0(o00oo0o2, str, null));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Runnable>] */
    @Override // p107o000ooO0.Oooo000
    public final void OooO0o0(@NonNull String str) {
        Runnable runnable;
        if (this.f29929OoooO == null) {
            this.f29929OoooO = Boolean.valueOf(oOO00O.OooO00o(this.f29926Oooo0o, this.f29927Oooo0oO.f29975OooO0O0));
        }
        if (!this.f29929OoooO.booleanValue()) {
            o0OoOo0.OooO0OO().OooO0Oo(f29924OoooOO0, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f29930OoooO0) {
            this.f29927Oooo0oO.f29978OooO0o.OooO00o(this);
            this.f29930OoooO0 = true;
        }
        o0OoOo0.OooO0OO().OooO00o(f29924OoooOO0, String.format("Cancelling work ID %s", str), new Throwable[0]);
        o000000O o000000o2 = this.f29931OoooO00;
        if (o000000o2 != null && (runnable = (Runnable) o000000o2.f29938OooO0OO.remove(str)) != null) {
            ((OooOOO) o000000o2.f29937OooO0O0).f29939OooO00o.removeCallbacks(runnable);
        }
        this.f29927Oooo0oO.OooO0o(str);
    }
}
