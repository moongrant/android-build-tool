package p085o000OooO;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.OooO00o;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p084o000Ooo0.o000oOoO;
import p091o000o0O.o0OO00O;
import p091o000o0O.o0Oo0oo;
import p091o000o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f35139OooO00o = o000oOoO.OooO0o0("Schedulers");

    public static void OooO00o(@NonNull OooO00o oooO00o, @NonNull WorkDatabase workDatabase, List<Oooo000> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        o0OO00O o0oo00oOooOo00 = workDatabase.OooOo00();
        workDatabase.OooO0OO();
        try {
            int i = Build.VERSION.SDK_INT;
            int i2 = oooO00o.f8385OooO0oo;
            if (i == 23) {
                i2 /= 2;
            }
            oo0o0Oo oo0o0oo = (oo0o0Oo) o0oo00oOooOo00;
            ArrayList arrayListOooO0OO = oo0o0oo.OooO0OO(i2);
            ArrayList arrayListOooO0O0 = oo0o0oo.OooO0O0();
            if (arrayListOooO0OO.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListOooO0OO.iterator();
                while (it.hasNext()) {
                    oo0o0oo.OooOO0(jCurrentTimeMillis, ((o0Oo0oo) it.next()).f35262OooO00o);
                }
            }
            workDatabase.OooOOO0();
            workDatabase.OooOO0();
            if (arrayListOooO0OO.size() > 0) {
                o0Oo0oo[] o0oo0ooArr = (o0Oo0oo[]) arrayListOooO0OO.toArray(new o0Oo0oo[arrayListOooO0OO.size()]);
                for (Oooo000 oooo000 : list) {
                    if (oooo000.OooO0Oo()) {
                        oooo000.OooO0OO(o0oo0ooArr);
                    }
                }
            }
            if (arrayListOooO0O0.size() > 0) {
                o0Oo0oo[] o0oo0ooArr2 = (o0Oo0oo[]) arrayListOooO0O0.toArray(new o0Oo0oo[arrayListOooO0O0.size()]);
                for (Oooo000 oooo001 : list) {
                    if (!oooo001.OooO0Oo()) {
                        oooo001.OooO0OO(o0oo0ooArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.OooOO0();
            throw th;
        }
    }
}
