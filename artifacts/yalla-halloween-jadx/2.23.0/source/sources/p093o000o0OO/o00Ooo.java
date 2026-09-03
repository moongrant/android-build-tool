package p093o000o0OO;

import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import p084o000Ooo0.o000oOoO;
import p084o000Ooo0.o00O0O;
import p085o000OooO.OooOo;
import p085o000OooO.OooOo00;
import p085o000OooO.Oooo000;
import p085o000OooO.o0OOO0o;
import p091o000o0O.OooOOOO;
import p091o000o0O.o0OO00O;
import p091o000o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class o00Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo00 f35342OooO0Oo = new OooOo00();

    public static void OooO00o(o0OOO0o o0ooo0o2, String str) {
        WorkDatabase workDatabase = o0ooo0o2.f35160OooO0OO;
        o0OO00O o0oo00oOooOo00 = workDatabase.OooOo00();
        OooOOOO OooOOOO2 = workDatabase.OooOOOO();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            oo0o0Oo oo0o0oo = (oo0o0Oo) o0oo00oOooOo00;
            WorkInfo$State workInfo$StateOooO0o = oo0o0oo.OooO0o(str2);
            if (workInfo$StateOooO0o != WorkInfo$State.SUCCEEDED && workInfo$StateOooO0o != WorkInfo$State.FAILED) {
                oo0o0oo.OooOOO0(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(((p091o000o0O.OooOo00) OooOOOO2).OooO00o(str2));
        }
        OooOo oooOo = o0ooo0o2.f35162OooO0o;
        synchronized (oooOo.f35132OooOOO) {
            boolean z = true;
            o000oOoO.OooO0OO().OooO00o(OooOo.f35122OooOOOO, String.format("Processor cancelling %s", str), new Throwable[0]);
            oooOo.f35131OooOO0o.add(str);
            p085o000OooO.oo0o0Oo oo0o0oo2 = (p085o000OooO.oo0o0Oo) oooOo.f35123OooO.remove(str);
            if (oo0o0oo2 == null) {
                z = false;
            }
            if (oo0o0oo2 == null) {
                oo0o0oo2 = (p085o000OooO.oo0o0Oo) oooOo.f35129OooOO0.remove(str);
            }
            OooOo.OooO0O0(str, oo0o0oo2);
            if (z) {
                oooOo.OooO();
            }
        }
        Iterator<Oooo000> it = o0ooo0o2.f35163OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(str);
        }
    }

    public abstract void OooO0O0();

    @Override // java.lang.Runnable
    public final void run() {
        OooOo00 oooOo00 = this.f35342OooO0Oo;
        try {
            OooO0O0();
            oooOo00.OooO00o(o00O0O.f35111OooO00o);
        } catch (Throwable th) {
            oooOo00.OooO00o(new o00O0O.OooO00o.C0411OooO00o(th));
        }
    }
}
