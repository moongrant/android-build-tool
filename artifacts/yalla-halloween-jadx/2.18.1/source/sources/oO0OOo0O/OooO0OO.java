package oO0OOo0O;

import android.os.Looper;
import android.util.Log;
import androidx.appcompat.widget.o00000O0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static volatile OooO0OO f52800OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooO0o f52801OooOOOo = new OooO0o();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final Map<Class<?>, List<Class<?>>> f52802OooOOo0 = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ExecutorService f52803OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<OooOo>> f52804OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Object, List<Class<?>>> f52805OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Class<?>, Object> f52806OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ThreadLocal<C0435OooO0OO> f52807OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oO0OOo0O.OooO0O0 f52808OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO f52809OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oO0OOo0O.OooO00o f52810OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo00 f52811OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f52812OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f52813OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f52814OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f52815OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f52816OooOOO0;

    public class OooO00o extends ThreadLocal<C0435OooO0OO> {
        @Override // java.lang.ThreadLocal
        public final C0435OooO0OO initialValue() {
            return new C0435OooO0OO();
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f52817OooO00o;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f52817OooO00o = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52817OooO00o[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52817OooO00o[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52817OooO00o[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOo0O.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0435OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<Object> f52818OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f52819OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f52820OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f52821OooO0Oo;
    }

    public OooO0OO() {
        OooO0o oooO0o = f52801OooOOOo;
        this.f52807OooO0Oo = new OooO00o();
        this.f52804OooO00o = new HashMap();
        this.f52805OooO0O0 = new HashMap();
        this.f52806OooO0OO = new ConcurrentHashMap();
        this.f52809OooO0o0 = new OooO(this, Looper.getMainLooper());
        this.f52808OooO0o = new oO0OOo0O.OooO0O0(this);
        this.f52810OooO0oO = new oO0OOo0O.OooO00o(this);
        Objects.requireNonNull(oooO0o);
        this.f52811OooO0oo = new OooOo00();
        this.f52812OooOO0 = true;
        this.f52813OooOO0O = true;
        this.f52814OooOO0o = true;
        this.f52816OooOOO0 = true;
        this.f52815OooOOO = true;
        this.f52803OooO = oooO0o.f52823OooO00o;
    }

    public static void OooO00o(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                OooO00o(list, cls.getInterfaces());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<oO0OOo0O.OooOO0O>] */
    public final void OooO0O0(OooOO0O oooOO0O) {
        Object obj = oooOO0O.f52826OooO00o;
        OooOo oooOo = oooOO0O.f52827OooO0O0;
        oooOO0O.f52826OooO00o = null;
        oooOO0O.f52827OooO0O0 = null;
        oooOO0O.f52828OooO0OO = null;
        ?? r2 = OooOO0O.f52825OooO0Oo;
        synchronized (r2) {
            if (r2.size() < 10000) {
                r2.add(oooOO0O);
            }
        }
        if (oooOo.f52842OooO0OO) {
            OooO0OO(oooOo, obj);
        }
    }

    public final void OooO0OO(OooOo oooOo, Object obj) {
        try {
            oooOo.f52841OooO0O0.f52834OooO00o.invoke(oooOo.f52840OooO00o, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(obj instanceof OooOOO)) {
                if (this.f52812OooOO0) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Could not dispatch event: ");
                    sbOooO0o0.append(obj.getClass());
                    sbOooO0o0.append(" to subscribing class ");
                    sbOooO0o0.append(oooOo.f52840OooO00o.getClass());
                    Log.e("EventBus", sbOooO0o0.toString(), cause);
                }
                if (this.f52814OooOO0o) {
                    OooO0Oo(new OooOOO(cause, obj, oooOo.f52840OooO00o));
                    return;
                }
                return;
            }
            if (this.f52812OooOO0) {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("SubscriberExceptionEvent subscriber ");
                sbOooO0o1.append(oooOo.f52840OooO00o.getClass());
                sbOooO0o1.append(" threw an exception");
                Log.e("EventBus", sbOooO0o1.toString(), cause);
                OooOOO oooOOO = (OooOOO) obj;
                StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("Initial event ");
                sbOooO0o2.append(oooOOO.f52830OooO0O0);
                sbOooO0o2.append(" caused exception in ");
                sbOooO0o2.append(oooOOO.f52831OooO0OO);
                Log.e("EventBus", sbOooO0o2.toString(), oooOOO.f52829OooO00o);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List, java.util.List<java.lang.Object>] */
    public final void OooO0Oo(Object obj) {
        C0435OooO0OO c0435OooO0OO = this.f52807OooO0Oo.get();
        ?? r1 = c0435OooO0OO.f52818OooO00o;
        r1.add(obj);
        if (c0435OooO0OO.f52819OooO0O0) {
            return;
        }
        c0435OooO0OO.f52820OooO0OO = Looper.getMainLooper() == Looper.myLooper();
        c0435OooO0OO.f52819OooO0O0 = true;
        while (!r1.isEmpty()) {
            try {
                OooO0o0(r1.remove(0), c0435OooO0OO);
            } catch (Throwable th) {
                c0435OooO0OO.f52819OooO0O0 = false;
                c0435OooO0OO.f52820OooO0OO = false;
                throw th;
            }
        }
        c0435OooO0OO.f52819OooO0O0 = false;
        c0435OooO0OO.f52820OooO0OO = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArrayList<oO0OOo0O.OooOo>>] */
    public final boolean OooO0o(Object obj, C0435OooO0OO c0435OooO0OO, Class<?> cls) {
        CopyOnWriteArrayList<OooOo> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f52804OooO00o.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (OooOo oooOo : copyOnWriteArrayList) {
            c0435OooO0OO.f52821OooO0Oo = obj;
            OooO0oO(oooOo, obj, c0435OooO0OO.f52820OooO0OO);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>>] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0o0(Object obj, C0435OooO0OO c0435OooO0OO) throws Error {
        boolean zOooO0o;
        List list;
        Class<?> cls = obj.getClass();
        if (this.f52815OooOOO) {
            ?? r1 = f52802OooOOo0;
            synchronized (r1) {
                List list2 = (List) r1.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        OooO00o(arrayList, superclass.getInterfaces());
                    }
                    f52802OooOOo0.put(cls, arrayList);
                    list = arrayList;
                }
            }
            int size = list.size();
            zOooO0o = false;
            for (int i = 0; i < size; i++) {
                zOooO0o |= OooO0o(obj, c0435OooO0OO, (Class) list.get(i));
            }
        } else {
            zOooO0o = OooO0o(obj, c0435OooO0OO, cls);
        }
        if (zOooO0o) {
            return;
        }
        if (this.f52813OooOO0O) {
            Log.d("EventBus", "No subscribers registered for event " + cls);
        }
        if (!this.f52816OooOOO0 || cls == OooOO0.class || cls == OooOOO.class) {
            return;
        }
        OooO0Oo(new OooOO0(obj));
    }

    public final void OooO0oO(OooOo oooOo, Object obj, boolean z) {
        int i = OooO0O0.f52817OooO00o[oooOo.f52841OooO0O0.f52835OooO0O0.ordinal()];
        if (i == 1) {
            OooO0OO(oooOo, obj);
            return;
        }
        if (i == 2) {
            if (z) {
                OooO0OO(oooOo, obj);
                return;
            }
            OooO oooO = this.f52809OooO0o0;
            Objects.requireNonNull(oooO);
            OooOO0O oooOO0OOooO00o = OooOO0O.OooO00o(oooOo, obj);
            synchronized (oooO) {
                oooO.f52791OooO00o.OooO00o(oooOO0OOooO00o);
                if (!oooO.f52794OooO0Oo) {
                    oooO.f52794OooO0Oo = true;
                    if (!oooO.sendMessage(oooO.obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            }
            return;
        }
        if (i != 3) {
            if (i != 4) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unknown thread mode: ");
                sbOooO0o0.append(oooOo.f52841OooO0O0.f52835OooO0O0);
                throw new IllegalStateException(sbOooO0o0.toString());
            }
            oO0OOo0O.OooO00o oooO00o = this.f52810OooO0oO;
            Objects.requireNonNull(oooO00o);
            oooO00o.f52795Oooo0o.OooO00o(OooOO0O.OooO00o(oooOo, obj));
            oooO00o.f52796Oooo0oO.f52803OooO.execute(oooO00o);
            return;
        }
        if (!z) {
            OooO0OO(oooOo, obj);
            return;
        }
        oO0OOo0O.OooO0O0 oooO0O0 = this.f52808OooO0o;
        Objects.requireNonNull(oooO0O0);
        OooOO0O oooOO0OOooO00o2 = OooOO0O.OooO00o(oooOo, obj);
        synchronized (oooO0O0) {
            oooO0O0.f52797Oooo0o.OooO00o(oooOO0OOooO00o2);
            if (!oooO0O0.f52799Oooo0oo) {
                oooO0O0.f52799Oooo0oo = true;
                oooO0O0.f52798Oooo0oO.f52803OooO.execute(oooO0O0);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0oo(Object obj, OooOOOO oooOOOO) {
        Object value;
        Class<?> cls = oooOOOO.f52836OooO0OO;
        OooOo oooOo = new OooOo(obj, oooOOOO);
        CopyOnWriteArrayList<OooOo> copyOnWriteArrayList = this.f52804OooO00o.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f52804OooO00o.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(oooOo)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Subscriber ");
            sbOooO0o0.append(obj.getClass());
            sbOooO0o0.append(" already registered to event ");
            sbOooO0o0.append(cls);
            throw new EventBusException(sbOooO0o0.toString());
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i == size || oooOOOO.f52837OooO0Oo > copyOnWriteArrayList.get(i).f52841OooO0O0.f52837OooO0Oo) {
                copyOnWriteArrayList.add(i, oooOo);
                break;
            }
        }
        List<Class<?>> arrayList = this.f52805OooO0O0.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f52805OooO0O0.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (oooOOOO.f52839OooO0o0) {
            if (!this.f52815OooOOO) {
                Object obj2 = this.f52806OooO0OO.get(cls);
                if (obj2 != null) {
                    OooO0oO(oooOo, obj2, Looper.getMainLooper() == Looper.myLooper());
                    return;
                }
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f52806OooO0OO.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey()) && (value = entry.getValue()) != null) {
                    OooO0oO(oooOo, value, Looper.getMainLooper() == Looper.myLooper());
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sbOooO00o = o00000O0.OooO00o("EventBus[indexCount=", 0, ", eventInheritance=");
        sbOooO00o.append(this.f52815OooOOO);
        sbOooO00o.append("]");
        return sbOooO00o.toString();
    }
}
