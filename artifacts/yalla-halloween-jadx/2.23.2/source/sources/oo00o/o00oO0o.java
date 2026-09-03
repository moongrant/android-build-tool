package oo00o;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f60283OooO00o = p115o00O00oO.o0Oo0oo.OooO0o("Schedulers");

    public static void OooO00o(@NonNull androidx.work.OooO00o oooO00o, @NonNull WorkDatabase workDatabase, @Nullable List<oo000o> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        o00O0OO.oo000o oo000oVarOooOo0 = workDatabase.OooOo0();
        workDatabase.OooO0OO();
        try {
            int i = Build.VERSION.SDK_INT;
            int i2 = oooO00o.f11471OooO0oo;
            if (i == 23) {
                i2 /= 2;
            }
            ArrayList arrayListOooOOO0 = oo000oVarOooOo0.OooOOO0(i2);
            ArrayList arrayListOooOO0O = oo000oVarOooOo0.OooOO0O();
            if (arrayListOooOOO0 != null && arrayListOooOOO0.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListOooOOO0.iterator();
                while (it.hasNext()) {
                    oo000oVarOooOo0.OooO0OO(jCurrentTimeMillis, ((o00O0OO.o00Ooo) it.next()).f36216OooO00o);
                }
            }
            workDatabase.OooOOO();
            workDatabase.OooOO0();
            if (arrayListOooOOO0 != null && arrayListOooOOO0.size() > 0) {
                o00O0OO.o00Ooo[] o00oooArr = (o00O0OO.o00Ooo[]) arrayListOooOOO0.toArray(new o00O0OO.o00Ooo[arrayListOooOOO0.size()]);
                for (oo000o oo000oVar : list) {
                    if (oo000oVar.OooO0o0()) {
                        oo000oVar.OooO00o(o00oooArr);
                    }
                }
            }
            if (arrayListOooOO0O == null || arrayListOooOO0O.size() <= 0) {
                return;
            }
            o00O0OO.o00Ooo[] o00oooArr2 = (o00O0OO.o00Ooo[]) arrayListOooOO0O.toArray(new o00O0OO.o00Ooo[arrayListOooOO0O.size()]);
            for (oo000o oo000oVar2 : list) {
                if (!oo000oVar2.OooO0o0()) {
                    oo000oVar2.OooO00o(o00oooArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.OooOO0();
            throw th;
        }
    }
}
