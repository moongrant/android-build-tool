package p664o0oooOO;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ConcurrentHashMap f59878OooO00o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o[] f59879OooO0O0 = new OooO00o[4];

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f59880OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HashMap f59881OooO0O0 = new HashMap();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashMap f59882OooO0OO = new HashMap();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final StringBuilder f59883OooO0Oo = new StringBuilder(128);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f59884OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Class<?> f59885OooO0o0;

        public final boolean OooO00o(Class cls, Method method) {
            StringBuilder sb = this.f59883OooO0Oo;
            sb.setLength(0);
            sb.append(method.getName());
            sb.append(Typography.greater);
            sb.append(cls.getName());
            String string = sb.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            HashMap map = this.f59882OooO0OO;
            Class cls2 = (Class) map.put(string, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            map.put(string, cls2);
            return false;
        }
    }

    public static ArrayList OooO00o(OooO00o oooO00o) {
        ArrayList arrayList = new ArrayList(oooO00o.f59880OooO00o);
        oooO00o.f59880OooO00o.clear();
        oooO00o.f59881OooO0O0.clear();
        oooO00o.f59882OooO0OO.clear();
        oooO00o.f59883OooO0Oo.setLength(0);
        oooO00o.f59885OooO0o0 = null;
        oooO00o.f59884OooO0o = false;
        synchronized (f59879OooO0O0) {
            for (int i = 0; i < 4; i++) {
                OooO00o[] oooO00oArr = f59879OooO0O0;
                if (oooO00oArr[i] == null) {
                    oooO00oArr[i] = oooO00o;
                    break;
                }
            }
        }
        return arrayList;
    }

    public static OooO00o OooO0O0() {
        synchronized (f59879OooO0O0) {
            for (int i = 0; i < 4; i++) {
                OooO00o[] oooO00oArr = f59879OooO0O0;
                OooO00o oooO00o = oooO00oArr[i];
                if (oooO00o != null) {
                    oooO00oArr[i] = null;
                    return oooO00o;
                }
            }
            return new OooO00o();
        }
    }
}
