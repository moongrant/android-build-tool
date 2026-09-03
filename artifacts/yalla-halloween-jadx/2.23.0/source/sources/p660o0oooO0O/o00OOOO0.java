package p660o0oooO0O;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ArrayList f60289OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f60290OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oo00oO f60291OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00OOOO0 f60292OooO0OO;

    public o00OOOO0(Object obj, oo00oO oo00oo) {
        this.f60290OooO00o = obj;
        this.f60291OooO0O0 = oo00oo;
    }

    public static o00OOOO0 OooO00o(Object obj, oo00oO oo00oo) {
        ArrayList arrayList = f60289OooO0Oo;
        synchronized (arrayList) {
            int size = arrayList.size();
            if (size <= 0) {
                return new o00OOOO0(obj, oo00oo);
            }
            o00OOOO0 o00oooo1 = (o00OOOO0) arrayList.remove(size - 1);
            o00oooo1.f60290OooO00o = obj;
            o00oooo1.f60291OooO0O0 = oo00oo;
            o00oooo1.f60292OooO0OO = null;
            return o00oooo1;
        }
    }
}
