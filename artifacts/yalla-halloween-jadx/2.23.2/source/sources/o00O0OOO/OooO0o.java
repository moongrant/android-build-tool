package o00O0OOO;

import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import oo00o.o00000O0;
import oo00o.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo00o.o000oOoO f36281OooO0Oo = new oo00o.o000oOoO();

    public static void OooO00o(o00000O0 o00000o1, String str) {
        o0000O00 o0000o00;
        boolean z;
        WorkDatabase workDatabase = o00000o1.f60221OooO0OO;
        o00O0OO.oo000o oo000oVarOooOo0 = workDatabase.OooOo0();
        o00O0OO.OooO0O0 oooO0O0OooOOOo = workDatabase.OooOOOo();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo$State workInfo$StateOooO0oO = oo000oVarOooOo0.OooO0oO(str2);
            if (workInfo$StateOooO0oO != WorkInfo$State.SUCCEEDED && workInfo$StateOooO0oO != WorkInfo$State.FAILED) {
                oo000oVarOooOo0.OooOOO(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(oooO0O0OooOOOo.OooO00o(str2));
        }
        oo00o.o00Oo0 o00oo1 = o00000o1.f60223OooO0o;
        synchronized (o00oo1.f60278OooOOOO) {
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(oo00o.o00Oo0.f60266OooOOOo, "Processor cancelling " + str);
            o00oo1.f60277OooOOO0.add(str);
            o0000o00 = (o0000O00) o00oo1.f60267OooO.remove(str);
            z = o0000o00 != null;
            if (o0000o00 == null) {
                o0000o00 = (o0000O00) o00oo1.f60273OooOO0.remove(str);
            }
            if (o0000o00 != null) {
                o00oo1.f60274OooOO0O.remove(str);
            }
        }
        oo00o.o00Oo0.OooO0OO(o0000o00, str);
        if (z) {
            o00oo1.OooOO0o();
        }
        Iterator<oo00o.oo000o> it = o00000o1.f60224OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0(str);
        }
    }

    public abstract void OooO0O0();

    @Override // java.lang.Runnable
    public final void run() {
        oo00o.o000oOoO o000oooo2 = this.f36281OooO0Oo;
        try {
            OooO0O0();
            o000oooo2.OooO00o(p115o00O00oO.oo0o0Oo.f36163OooO00o);
        } catch (Throwable th) {
            o000oooo2.OooO00o(new o00O00oO.oo0o0Oo.OooO00o.C0414OooO00o(th));
        }
    }
}
