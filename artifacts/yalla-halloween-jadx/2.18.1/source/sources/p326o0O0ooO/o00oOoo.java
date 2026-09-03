package p326o0O0ooO;

import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import o00O0000.OooO0O0;
import o00O0000.OooO0OO;
import o00O0000.o00O0O;
import o00O0000.o00Oo0;
import p102o000oo.o0OoOo0;
import p107o000ooO0.OooOo;
import p107o000ooO0.OooOo00;
import p107o000ooO0.Oooo000;
import p107o000ooO0.o00oO0o;
import p107o000ooO0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class o00oOoo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooOo00 f37014Oooo0o = new OooOo00();

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    public final void OooO00o(o00oO0o o00oo0o2, String str) {
        boolean z;
        WorkDatabase workDatabase = o00oo0o2.f29976OooO0OO;
        o00O0O o00o0oOooOo0O = workDatabase.OooOo0O();
        OooO0O0 oooO0O0OooOOo0 = workDatabase.OooOOo0();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = true;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            o00Oo0 o00oo1 = (o00Oo0) o00o0oOooOo0O;
            WorkInfo$State workInfo$StateOooO0o = o00oo1.OooO0o(str2);
            if (workInfo$StateOooO0o != WorkInfo$State.SUCCEEDED && workInfo$StateOooO0o != WorkInfo$State.FAILED) {
                o00oo1.OooOOOO(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(((OooO0OO) oooO0O0OooOOo0).OooO00o(str2));
        }
        OooOo oooOo = o00oo0o2.f29978OooO0o;
        synchronized (oooOo.f29950OoooOOO) {
            o0OoOo0.OooO0OO().OooO00o(OooOo.f29940OoooOOo, String.format("Processor cancelling %s", str), new Throwable[0]);
            oooOo.f29949OoooOO0.add(str);
            o0Oo0oo o0oo0oo2 = (o0Oo0oo) oooOo.f29946OoooO0.remove(str);
            if (o0oo0oo2 == null) {
                z = false;
            }
            if (o0oo0oo2 == null) {
                o0oo0oo2 = (o0Oo0oo) oooOo.f29948OoooO0O.remove(str);
            }
            OooOo.OooO0O0(str, o0oo0oo2);
            if (z) {
                oooOo.OooO0oo();
            }
        }
        Iterator<Oooo000> it = o00oo0o2.f29979OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().OooO0o0(str);
        }
    }

    public abstract void OooO0O0();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            OooO0O0();
            this.f37014Oooo0o.OooO00o(p102o000oo.o00Oo0.f29811OooO00o);
        } catch (Throwable th) {
            this.f37014Oooo0o.OooO00o(new o000oo.o00Oo0.OooO0O0.OooO00o(th));
        }
    }
}
