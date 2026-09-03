package p107o000ooO0;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.OooO00o;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00O0000.o00O0O;
import o00O0000.o00Oo0;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f29957OooO00o = o0OoOo0.OooO0o0("Schedulers");

    public static void OooO00o(@NonNull OooO00o oooO00o, @NonNull WorkDatabase workDatabase, List<Oooo000> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        o00O0O o00o0oOooOo0O = workDatabase.OooOo0O();
        workDatabase.OooO0OO();
        try {
            o00Oo0 o00oo1 = (o00Oo0) o00o0oOooOo0O;
            List<o00O0000.o0OoOo0> listOooO0OO = o00oo1.OooO0OO(Build.VERSION.SDK_INT == 23 ? oooO00o.f9740OooO0oo / 2 : oooO00o.f9740OooO0oo);
            List listOooO0O0 = o00oo1.OooO0O0();
            if (((ArrayList) listOooO0OO).size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) listOooO0OO).iterator();
                while (it.hasNext()) {
                    o00oo1.OooOO0O(((o00O0000.o0OoOo0) it.next()).f30152OooO00o, jCurrentTimeMillis);
                }
            }
            workDatabase.OooOOOO();
            workDatabase.OooOO0O();
            ArrayList arrayList = (ArrayList) listOooO0OO;
            if (arrayList.size() > 0) {
                o00O0000.o0OoOo0[] o0oooo0Arr = (o00O0000.o0OoOo0[]) arrayList.toArray(new o00O0000.o0OoOo0[arrayList.size()]);
                for (Oooo000 oooo000 : list) {
                    if (oooo000.OooO00o()) {
                        oooo000.OooO0OO(o0oooo0Arr);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) listOooO0O0;
            if (arrayList2.size() > 0) {
                o00O0000.o0OoOo0[] o0oooo0Arr2 = (o00O0000.o0OoOo0[]) arrayList2.toArray(new o00O0000.o0OoOo0[arrayList2.size()]);
                for (Oooo000 oooo001 : list) {
                    if (!oooo001.OooO00o()) {
                        oooo001.OooO0OO(o0oooo0Arr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.OooOO0O();
            throw th;
        }
    }
}
