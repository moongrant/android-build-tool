package p664o0oooOO;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00OOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ArrayList f59869OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f59870OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oOOoOOO0 f59871OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public oO00OOO f59872OooO0OO;

    public oO00OOO(Object obj, oOOoOOO0 ooooooo0) {
        this.f59870OooO00o = obj;
        this.f59871OooO0O0 = ooooooo0;
    }

    public static oO00OOO OooO00o(Object obj, oOOoOOO0 ooooooo0) {
        ArrayList arrayList = f59869OooO0Oo;
        synchronized (arrayList) {
            int size = arrayList.size();
            if (size <= 0) {
                return new oO00OOO(obj, ooooooo0);
            }
            oO00OOO oo00ooo = (oO00OOO) arrayList.remove(size - 1);
            oo00ooo.f59870OooO00o = obj;
            oo00ooo.f59871OooO0O0 = ooooooo0;
            oo00ooo.f59872OooO0OO = null;
            return oo00ooo;
        }
    }
}
