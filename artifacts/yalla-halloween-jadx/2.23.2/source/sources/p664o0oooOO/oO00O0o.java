package p664o0oooOO;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00O0o {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static volatile oO00O0o f59838OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final oOo00OO0 f59839OooOOOo = new oOo00OO0();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final HashMap f59840OooOOo0 = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ExecutorService f59841OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oO00Oo0 f59849OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f59850OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f59851OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f59852OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f59853OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f59854OooOOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f59845OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f59842OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f59843OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConcurrentHashMap f59844OooO0OO = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oO00O0oO f59847OooO0o0 = new oO00O0oO(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oO00O0o0 f59846OooO0o = new oO00O0o0(this);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oO0O0OoO f59848OooO0oO = new oO0O0OoO(this);

    public class OooO00o extends ThreadLocal<OooO0OO> {
        @Override // java.lang.ThreadLocal
        public final OooO0OO initialValue() {
            return new OooO0OO();
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f59855OooO00o;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f59855OooO00o = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59855OooO00o[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59855OooO00o[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59855OooO00o[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f59856OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f59857OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f59858OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f59859OooO0Oo;
    }

    public oO00O0o() {
        oOo00OO0 ooo00oo0 = f59839OooOOOo;
        ooo00oo0.getClass();
        this.f59849OooO0oo = new oO00Oo0();
        this.f59850OooOO0 = true;
        this.f59851OooOO0O = true;
        this.f59852OooOO0o = true;
        this.f59854OooOOO0 = true;
        this.f59853OooOOO = true;
        this.f59841OooO = ooo00oo0.f59898OooO00o;
    }

    public static void OooO00o(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                OooO00o(arrayList, cls.getInterfaces());
            }
        }
    }

    public final void OooO0O0(Object obj, oOOoOOO0 ooooooo0) {
        try {
            ooooooo0.f59895OooO0O0.f59886OooO00o.invoke(ooooooo0.f59894OooO00o, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            boolean z = obj instanceof oO00OOo0;
            boolean z2 = this.f59850OooOO0;
            if (!z) {
                if (z2) {
                    Log.e("EventBus", "Could not dispatch event: " + obj.getClass() + " to subscribing class " + ooooooo0.f59894OooO00o.getClass(), cause);
                }
                if (this.f59852OooOO0o) {
                    OooO0Oo(new oO00OOo0(cause, obj, ooooooo0.f59894OooO00o));
                    return;
                }
                return;
            }
            if (z2) {
                Log.e("EventBus", "SubscriberExceptionEvent subscriber " + ooooooo0.f59894OooO00o.getClass() + " threw an exception", cause);
                oO00OOo0 oo00ooo0 = (oO00OOo0) obj;
                Log.e("EventBus", "Initial event " + oo00ooo0.f59876OooO0O0 + " caused exception in " + oo00ooo0.f59877OooO0OO, oo00ooo0.f59875OooO00o);
            }
        }
    }

    public final void OooO0OO(oO00OOO oo00ooo) {
        Object obj = oo00ooo.f59870OooO00o;
        oOOoOOO0 ooooooo0 = oo00ooo.f59871OooO0O0;
        oo00ooo.f59870OooO00o = null;
        oo00ooo.f59871OooO0O0 = null;
        oo00ooo.f59872OooO0OO = null;
        ArrayList arrayList = oO00OOO.f59869OooO0Oo;
        synchronized (arrayList) {
            if (arrayList.size() < 10000) {
                arrayList.add(oo00ooo);
            }
        }
        if (ooooooo0.f59896OooO0OO) {
            OooO0O0(obj, ooooooo0);
        }
    }

    public final void OooO0Oo(Object obj) {
        OooO0OO oooO0OO = this.f59845OooO0Oo.get();
        ArrayList arrayList = oooO0OO.f59856OooO00o;
        arrayList.add(obj);
        if (oooO0OO.f59857OooO0O0) {
            return;
        }
        oooO0OO.f59858OooO0OO = Looper.getMainLooper() == Looper.myLooper();
        oooO0OO.f59857OooO0O0 = true;
        while (!arrayList.isEmpty()) {
            try {
                OooO0o0(arrayList.remove(0), oooO0OO);
            } catch (Throwable th) {
                oooO0OO.f59857OooO0O0 = false;
                oooO0OO.f59858OooO0OO = false;
                throw th;
            }
        }
        oooO0OO.f59857OooO0O0 = false;
        oooO0OO.f59858OooO0OO = false;
    }

    public final boolean OooO0o(Object obj, OooO0OO oooO0OO, Class<?> cls) {
        CopyOnWriteArrayList<oOOoOOO0> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f59842OooO00o.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (oOOoOOO0 ooooooo0 : copyOnWriteArrayList) {
            oooO0OO.f59859OooO0Oo = obj;
            OooO0oO(ooooooo0, obj, oooO0OO.f59858OooO0OO);
        }
        return true;
    }

    public final void OooO0o0(Object obj, OooO0OO oooO0OO) throws Error {
        boolean zOooO0o;
        List list;
        Class<?> cls = obj.getClass();
        if (this.f59853OooOOO) {
            HashMap map = f59840OooOOo0;
            synchronized (map) {
                try {
                    List list2 = (List) map.get(cls);
                    list = list2;
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                            arrayList.add(superclass);
                            OooO00o(arrayList, superclass.getInterfaces());
                        }
                        f59840OooOOo0.put(cls, arrayList);
                        list = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = list.size();
            zOooO0o = false;
            for (int i = 0; i < size; i++) {
                zOooO0o |= OooO0o(obj, oooO0OO, (Class) list.get(i));
            }
        } else {
            zOooO0o = OooO0o(obj, oooO0OO, cls);
        }
        if (zOooO0o) {
            return;
        }
        if (this.f59851OooOO0O) {
            Log.d("EventBus", "No subscribers registered for event " + cls);
        }
        if (!this.f59854OooOOO0 || cls == oO00OO0O.class || cls == oO00OOo0.class) {
            return;
        }
        OooO0Oo(new oO00OO0O(this, obj));
    }

    public final void OooO0oO(oOOoOOO0 ooooooo0, Object obj, boolean z) {
        int i = OooO0O0.f59855OooO00o[ooooooo0.f59895OooO0O0.f59887OooO0O0.ordinal()];
        if (i == 1) {
            OooO0O0(obj, ooooooo0);
            return;
        }
        if (i == 2) {
            if (z) {
                OooO0O0(obj, ooooooo0);
                return;
            }
            oO00O0oO oo00o0oo = this.f59847OooO0o0;
            oo00o0oo.getClass();
            oO00OOO oo00oooOooO00o = oO00OOO.OooO00o(obj, ooooooo0);
            synchronized (oo00o0oo) {
                oo00o0oo.f59863OooO00o.OooO00o(oo00oooOooO00o);
                if (!oo00o0oo.f59866OooO0Oo) {
                    oo00o0oo.f59866OooO0Oo = true;
                    if (!oo00o0oo.sendMessage(oo00o0oo.obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            }
            return;
        }
        if (i == 3) {
            if (z) {
                this.f59846OooO0o.OooO00o(obj, ooooooo0);
                return;
            } else {
                OooO0O0(obj, ooooooo0);
                return;
            }
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown thread mode: " + ooooooo0.f59895OooO0O0.f59887OooO0O0);
        }
        oO0O0OoO oo0o0ooo = this.f59848OooO0oO;
        oo0o0ooo.getClass();
        oo0o0ooo.f59892OooO0Oo.OooO00o(oO00OOO.OooO00o(obj, ooooooo0));
        oo0o0ooo.f59893OooO0o0.f59841OooO.execute(oo0o0ooo);
    }

    public final void OooO0oo(Object obj, oO00Oo00 oo00oo00) {
        Object value;
        Class<?> cls = oo00oo00.f59888OooO0OO;
        oOOoOOO0 ooooooo0 = new oOOoOOO0(obj, oo00oo00);
        HashMap map = this.f59842OooO00o;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(ooooooo0)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i != size) {
                if (oo00oo00.f59889OooO0Oo <= ((oOOoOOO0) copyOnWriteArrayList.get(i)).f59895OooO0O0.f59889OooO0Oo) {
                }
            }
            copyOnWriteArrayList.add(i, ooooooo0);
            break;
        }
        HashMap map2 = this.f59843OooO0O0;
        List arrayList = (List) map2.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (oo00oo00.f59891OooO0o0) {
            ConcurrentHashMap concurrentHashMap = this.f59844OooO0OO;
            if (!this.f59853OooOOO) {
                Object obj2 = concurrentHashMap.get(cls);
                if (obj2 != null) {
                    OooO0oO(ooooooo0, obj2, Looper.getMainLooper() == Looper.myLooper());
                    return;
                }
                return;
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                    OooO0oO(ooooooo0, value, Looper.getMainLooper() == Looper.myLooper());
                }
            }
        }
    }

    public final String toString() {
        return "EventBus[indexCount=0, eventInheritance=" + this.f59853OooOOO + "]";
    }
}
