package p034OoooO0O;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o000O000.OooO00o;
import oO0OOo0O.OooO0OO;
import oO0OOo0O.OooOOOO;
import oO0OOo0O.OooOo;
import oO0OOo0O.OooOo00;
import org.greenrobot.eventbus.EventBusException;
import p042Ooooo0o.o000O0O0;
import p689oO000Ooo.oo00oO;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.Object, java.util.List<java.lang.Class<?>>>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashMap, java.util.Map<java.lang.Object, java.util.List<java.lang.Class<?>>>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArrayList<oO0OOo0O.OooOo>>] */
    public static void OooO(Object obj) {
        OooO0OO oooO0OOOooO0O0 = OooO0O0();
        synchronized (oooO0OOOooO0O0) {
            List list = (List) oooO0OOOooO0O0.f52805OooO0O0.get(obj);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) oooO0OOOooO0O0.f52804OooO00o.get((Class) it.next());
                    if (list2 != null) {
                        int size = list2.size();
                        int i = 0;
                        while (i < size) {
                            OooOo oooOo = (OooOo) list2.get(i);
                            if (oooOo.f52840OooO00o == obj) {
                                oooOo.f52842OooO0OO = false;
                                list2.remove(i);
                                i--;
                                size--;
                            }
                            i++;
                        }
                    }
                }
                oooO0OOOooO0O0.f52805OooO0O0.remove(obj);
            } else {
                Log.w("EventBus", "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        }
    }

    public static final long OooO00o(int i, int i2, boolean z, boolean z2) {
        if (i2 == 0) {
            return o000O0O0.OooO00o(i, i);
        }
        if (i == 0) {
            return z ? o000O0O0.OooO00o(1, 0) : o000O0O0.OooO00o(0, 1);
        }
        if (i == i2) {
            return z ? o000O0O0.OooO00o(i2 - 1, i2) : o000O0O0.OooO00o(i2, i2 - 1);
        }
        if (z) {
            return !z2 ? o000O0O0.OooO00o(i - 1, i) : o000O0O0.OooO00o(i + 1, i);
        }
        return !z2 ? o000O0O0.OooO00o(i, i + 1) : o000O0O0.OooO00o(i, i - 1);
    }

    public static OooO0OO OooO0O0() {
        if (OooO0OO.f52800OooOOOO == null) {
            synchronized (OooO0OO.class) {
                if (OooO0OO.f52800OooOOOO == null) {
                    OooO0OO.f52800OooOOOO = new OooO0OO();
                }
            }
        }
        return OooO0OO.f52800OooOOOO;
    }

    public static boolean OooO0OO(Context context, String str) {
        return OooO00o.OooO00o(context, str) == 0;
    }

    public static void OooO0Oo() {
        OooO0o0(10068, null);
    }

    public static void OooO0o(p140o00OOOoO.OooO0OO oooO0OO) {
        OooO0O0().OooO0Oo(oooO0OO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0o0(int i, Object obj) {
        p140o00OOOoO.OooO0OO oooO0OO = new p140o00OOOoO.OooO0OO();
        oooO0OO.f31885OooO00o = i;
        oooO0OO.f31887OooO0OO = obj;
        OooO0o(oooO0OO);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void OooO0oO(p140o00OOOoO.OooO0OO oooO0OO) {
        OooO0OO oooO0OOOooO0O0 = OooO0O0();
        synchronized (oooO0OOOooO0O0.f52806OooO0OO) {
            oooO0OOOooO0O0.f52806OooO0OO.put(p140o00OOOoO.OooO0OO.class, oooO0OO);
        }
        oooO0OOOooO0O0.OooO0Oo(oooO0OO);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList, java.util.List<oO0OOo0O.OooOOOO>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map<java.lang.Class<?>, java.util.List<oO0OOo0O.OooOOOO>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.Class<?>, java.util.List<oO0OOo0O.OooOOOO>>, java.util.concurrent.ConcurrentHashMap] */
    public static void OooO0oo(Object obj) {
        oo00oO oo00ooOooO0O0;
        OooO0OO oooO0OOOooO0O0 = OooO0O0();
        Objects.requireNonNull(oooO0OOOooO0O0);
        Class<?> cls = obj.getClass();
        OooOo00 oooOo00 = oooO0OOOooO0O0.f52811OooO0oo;
        Objects.requireNonNull(oooOo00);
        List<OooOOOO> listOooO0O0 = (List) OooOo00.f52843OooO00o.get(cls);
        if (listOooO0O0 == null) {
            OooOo00.OooO00o oooO00oOooO0OO = oooOo00.OooO0OO();
            oooO00oOooO0OO.f52850OooO0o0 = cls;
            oooO00oOooO0OO.f52849OooO0o = false;
            oooO00oOooO0OO.f52851OooO0oO = null;
            while (oooO00oOooO0OO.f52850OooO0o0 != null) {
                oo00oO oo00oo = oooO00oOooO0OO.f52851OooO0oO;
                if (oo00oo == null || oo00oo.OooO0O0() == null) {
                    oo00ooOooO0O0 = null;
                } else {
                    oo00ooOooO0O0 = oooO00oOooO0OO.f52851OooO0oO.OooO0O0();
                    if (oooO00oOooO0OO.f52850OooO0o0 != oo00ooOooO0O0.OooO0OO()) {
                        oo00ooOooO0O0 = null;
                    }
                }
                oooO00oOooO0OO.f52851OooO0oO = oo00ooOooO0O0;
                if (oo00ooOooO0O0 != null) {
                    for (OooOOOO oooOOOO : oo00ooOooO0O0.OooO00o()) {
                        if (oooO00oOooO0OO.OooO00o(oooOOOO.f52834OooO00o, oooOOOO.f52836OooO0OO)) {
                            oooO00oOooO0OO.f52845OooO00o.add(oooOOOO);
                        }
                    }
                } else {
                    oooOo00.OooO00o(oooO00oOooO0OO);
                }
                oooO00oOooO0OO.OooO0OO();
            }
            listOooO0O0 = oooOo00.OooO0O0(oooO00oOooO0OO);
            if (((ArrayList) listOooO0O0).isEmpty()) {
                throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
            }
            OooOo00.f52843OooO00o.put(cls, listOooO0O0);
        }
        synchronized (oooO0OOOooO0O0) {
            Iterator<OooOOOO> it = listOooO0O0.iterator();
            while (it.hasNext()) {
                oooO0OOOooO0O0.OooO0oo(obj, it.next());
            }
        }
    }
}
