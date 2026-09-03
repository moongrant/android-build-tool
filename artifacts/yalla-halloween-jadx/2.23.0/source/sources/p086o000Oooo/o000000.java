package p086o000Oooo;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.OooO00o;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p084o000Ooo0.OooO;
import p084o000Ooo0.o000oOoO;
import p084o000Ooo0.o00Ooo;
import p085o000OooO.OooOOO;
import p085o000OooO.OooOOOO;
import p085o000OooO.Oooo000;
import p085o000OooO.o0OOO0o;
import p089o000o00O.o00O00o0;
import p089o000o00O.oo00o;
import p091o000o0O.o0Oo0oo;
import p093o000o0OO.o0OO00O;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000000 implements Oooo000, o00O00o0, OooOOOO {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f35197OooOO0o = o000oOoO.OooO0o0("GreedyScheduler");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f35198OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f35199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo00o f35200OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OOO0o f35201OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000OOo f35203OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Boolean f35205OooOO0O;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashSet f35202OooO0oO = new HashSet();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Object f35204OooOO0 = new Object();

    public o000000(@NonNull Context context, @NonNull OooO00o oooO00o, @NonNull o0000O0O o0000o0o2, @NonNull o0OOO0o o0ooo0o2) {
        this.f35199OooO0Oo = context;
        this.f35201OooO0o0 = o0ooo0o2;
        this.f35200OooO0o = new oo00o(context, o0000o0o2, this);
        this.f35203OooO0oo = new o000OOo(this, oooO00o.f8383OooO0o0);
    }

    @Override // p085o000OooO.Oooo000
    public final void OooO00o(@NonNull String str) {
        Runnable runnable;
        Boolean bool = this.f35205OooOO0O;
        o0OOO0o o0ooo0o2 = this.f35201OooO0o0;
        if (bool == null) {
            this.f35205OooOO0O = Boolean.valueOf(o0OO00O.OooO00o(this.f35199OooO0Oo, o0ooo0o2.f35159OooO0O0));
        }
        boolean zBooleanValue = this.f35205OooOO0O.booleanValue();
        String str2 = f35197OooOO0o;
        if (!zBooleanValue) {
            o000oOoO.OooO0OO().OooO0Oo(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f35198OooO) {
            o0ooo0o2.f35162OooO0o.OooO00o(this);
            this.f35198OooO = true;
        }
        o000oOoO.OooO0OO().OooO00o(str2, String.format("Cancelling work ID %s", str), new Throwable[0]);
        o000OOo o000ooo2 = this.f35203OooO0oo;
        if (o000ooo2 != null && (runnable = (Runnable) o000ooo2.f35209OooO0OO.remove(str)) != null) {
            ((OooOOO) o000ooo2.f35208OooO0O0).f35121OooO00o.removeCallbacks(runnable);
        }
        o0ooo0o2.OooO0oo(str);
    }

    @Override // p089o000o00O.o00O00o0
    public final void OooO0O0(@NonNull ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o000oOoO.OooO0OO().OooO00o(f35197OooOO0o, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f35201OooO0o0.OooO0oo(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    @Override // p085o000OooO.Oooo000
    public final void OooO0OO(@NonNull o0Oo0oo... o0oo0ooArr) {
        if (this.f35205OooOO0O == null) {
            this.f35205OooOO0O = Boolean.valueOf(o0OO00O.OooO00o(this.f35199OooO0Oo, this.f35201OooO0o0.f35159OooO0O0));
        }
        if (!this.f35205OooOO0O.booleanValue()) {
            o000oOoO.OooO0OO().OooO0Oo(f35197OooOO0o, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f35198OooO) {
            this.f35201OooO0o0.f35162OooO0o.OooO00o(this);
            this.f35198OooO = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o0Oo0oo o0oo0oo2 : o0oo0ooArr) {
            long jOooO00o = o0oo0oo2.OooO00o();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (o0oo0oo2.f35263OooO0O0 == WorkInfo$State.ENQUEUED) {
                if (jCurrentTimeMillis < jOooO00o) {
                    o000OOo o000ooo2 = this.f35203OooO0oo;
                    if (o000ooo2 != null) {
                        HashMap map = o000ooo2.f35209OooO0OO;
                        Runnable runnable = (Runnable) map.remove(o0oo0oo2.f35262OooO00o);
                        o00Ooo o00ooo2 = o000ooo2.f35208OooO0O0;
                        if (runnable != null) {
                            ((OooOOO) o00ooo2).f35121OooO00o.removeCallbacks(runnable);
                        }
                        o0O0O00 o0o0o00 = new o0O0O00(o000ooo2, o0oo0oo2);
                        map.put(o0oo0oo2.f35262OooO00o, o0o0o00);
                        ((OooOOO) o00ooo2).f35121OooO00o.postDelayed(o0o0o00, o0oo0oo2.OooO00o() - System.currentTimeMillis());
                    }
                } else if (o0oo0oo2.OooO0O0()) {
                    int i = Build.VERSION.SDK_INT;
                    OooO oooO = o0oo0oo2.f35270OooOO0;
                    if (oooO.f35085OooO0OO) {
                        o000oOoO.OooO0OO().OooO00o(f35197OooOO0o, String.format("Ignoring WorkSpec %s, Requires device idle.", o0oo0oo2), new Throwable[0]);
                    } else if (i < 24) {
                        hashSet.add(o0oo0oo2);
                        hashSet2.add(o0oo0oo2.f35262OooO00o);
                    } else if (oooO.f35090OooO0oo.f35097OooO00o.size() > 0) {
                        o000oOoO.OooO0OO().OooO00o(f35197OooOO0o, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", o0oo0oo2), new Throwable[0]);
                    } else {
                        hashSet.add(o0oo0oo2);
                        hashSet2.add(o0oo0oo2.f35262OooO00o);
                    }
                } else {
                    o000oOoO.OooO0OO().OooO00o(f35197OooOO0o, String.format("Starting work for %s", o0oo0oo2.f35262OooO00o), new Throwable[0]);
                    this.f35201OooO0o0.OooO0oO(o0oo0oo2.f35262OooO00o, null);
                }
            }
        }
        synchronized (this.f35204OooOO0) {
            if (!hashSet.isEmpty()) {
                o000oOoO.OooO0OO().OooO00o(f35197OooOO0o, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f35202OooO0oO.addAll(hashSet);
                this.f35200OooO0o.OooO0OO(this.f35202OooO0oO);
            }
        }
    }

    @Override // p085o000OooO.Oooo000
    public final boolean OooO0Oo() {
        return false;
    }

    @Override // p089o000o00O.o00O00o0
    public final void OooO0o(@NonNull List<String> list) {
        for (String str : (ArrayList) list) {
            o000oOoO.OooO0OO().OooO00o(f35197OooOO0o, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f35201OooO0o0.OooO0oO(str, null);
        }
    }

    @Override // p085o000OooO.OooOOOO
    public final void OooO0o0(@NonNull String str, boolean z) {
        synchronized (this.f35204OooOO0) {
            for (o0Oo0oo o0oo0oo2 : this.f35202OooO0oO) {
                if (o0oo0oo2.f35262OooO00o.equals(str)) {
                    o000oOoO.OooO0OO().OooO00o(f35197OooOO0o, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f35202OooO0oO.remove(o0oo0oo2);
                    this.f35200OooO0o.OooO0OO(this.f35202OooO0oO);
                    break;
                }
            }
        }
    }
}
