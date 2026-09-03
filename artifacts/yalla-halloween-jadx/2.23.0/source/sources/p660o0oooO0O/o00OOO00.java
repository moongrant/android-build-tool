package p660o0oooO0O;

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
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static volatile o00OOO00 f60263OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final o00OOO0 f60264OooOOOo = new o00OOO0();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final HashMap f60265OooOOo0 = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ExecutorService f60266OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0O00o0 f60274OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f60275OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f60276OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f60277OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f60278OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f60279OooOOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f60270OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f60267OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f60268OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConcurrentHashMap f60269OooO0OO = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OOO0O f60272OooO0o0 = new o00OOO0O(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00OO f60271OooO0o = new o00OO(this);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oo0O f60273OooO0oO = new oo0O(this);

    public class OooO00o extends ThreadLocal<OooO0OO> {
        @Override // java.lang.ThreadLocal
        public final OooO0OO initialValue() {
            return new OooO0OO();
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f60280OooO00o;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f60280OooO00o = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60280OooO00o[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60280OooO00o[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60280OooO00o[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f60281OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f60282OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f60283OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f60284OooO0Oo;
    }

    public o00OOO00() {
        o00OOO0 o00ooo1 = f60264OooOOOo;
        o00ooo1.getClass();
        this.f60274OooO0oo = new o0O00o0();
        this.f60275OooOO0 = true;
        this.f60276OooOO0O = true;
        this.f60277OooOO0o = true;
        this.f60279OooOOO0 = true;
        this.f60278OooOOO = true;
        this.f60266OooO = o00ooo1.f60262OooO00o;
    }

    public static void OooO00o(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                OooO00o(arrayList, cls.getInterfaces());
            }
        }
    }

    public final void OooO0O0(Object obj, oo00oO oo00oo) {
        try {
            oo00oo.f60314OooO0O0.f60307OooO00o.invoke(oo00oo.f60313OooO00o, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            boolean z = obj instanceof o00Oo00;
            boolean z2 = this.f60275OooOO0;
            if (!z) {
                if (z2) {
                    Log.e("EventBus", "Could not dispatch event: " + obj.getClass() + " to subscribing class " + oo00oo.f60313OooO00o.getClass(), cause);
                }
                if (this.f60277OooOO0o) {
                    OooO0Oo(new o00Oo00(cause, obj, oo00oo.f60313OooO00o));
                    return;
                }
                return;
            }
            if (z2) {
                Log.e("EventBus", "SubscriberExceptionEvent subscriber " + oo00oo.f60313OooO00o.getClass() + " threw an exception", cause);
                o00Oo00 o00oo00 = (o00Oo00) obj;
                Log.e("EventBus", "Initial event " + o00oo00.f60296OooO0O0 + " caused exception in " + o00oo00.f60297OooO0OO, o00oo00.f60295OooO00o);
            }
        }
    }

    public final void OooO0OO(o00OOOO0 o00oooo1) {
        Object obj = o00oooo1.f60290OooO00o;
        oo00oO oo00oo = o00oooo1.f60291OooO0O0;
        o00oooo1.f60290OooO00o = null;
        o00oooo1.f60291OooO0O0 = null;
        o00oooo1.f60292OooO0OO = null;
        ArrayList arrayList = o00OOOO0.f60289OooO0Oo;
        synchronized (arrayList) {
            if (arrayList.size() < 10000) {
                arrayList.add(o00oooo1);
            }
        }
        if (oo00oo.f60315OooO0OO) {
            OooO0O0(obj, oo00oo);
        }
    }

    public final void OooO0Oo(Object obj) {
        OooO0OO oooO0OO = this.f60270OooO0Oo.get();
        ArrayList arrayList = oooO0OO.f60281OooO00o;
        arrayList.add(obj);
        if (oooO0OO.f60282OooO0O0) {
            return;
        }
        oooO0OO.f60283OooO0OO = Looper.getMainLooper() == Looper.myLooper();
        oooO0OO.f60282OooO0O0 = true;
        while (!arrayList.isEmpty()) {
            try {
                OooO0o0(arrayList.remove(0), oooO0OO);
            } catch (Throwable th) {
                oooO0OO.f60282OooO0O0 = false;
                oooO0OO.f60283OooO0OO = false;
                throw th;
            }
        }
        oooO0OO.f60282OooO0O0 = false;
        oooO0OO.f60283OooO0OO = false;
    }

    public final boolean OooO0o(Object obj, OooO0OO oooO0OO, Class<?> cls) {
        CopyOnWriteArrayList<oo00oO> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f60267OooO00o.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (oo00oO oo00oo : copyOnWriteArrayList) {
            oooO0OO.f60284OooO0Oo = obj;
            OooO0oO(oo00oo, obj, oooO0OO.f60283OooO0OO);
        }
        return true;
    }

    public final void OooO0o0(Object obj, OooO0OO oooO0OO) throws Error {
        boolean zOooO0o;
        List list;
        Class<?> cls = obj.getClass();
        if (this.f60278OooOOO) {
            HashMap map = f60265OooOOo0;
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
                        f60265OooOOo0.put(cls, arrayList);
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
        if (this.f60276OooOO0O) {
            Log.d("EventBus", "No subscribers registered for event " + cls);
        }
        if (!this.f60279OooOOO0 || cls == o0o0Oo.class || cls == o00Oo00.class) {
            return;
        }
        OooO0Oo(new o0o0Oo(obj));
    }

    public final void OooO0oO(oo00oO oo00oo, Object obj, boolean z) {
        int i = OooO0O0.f60280OooO00o[oo00oo.f60314OooO0O0.f60308OooO0O0.ordinal()];
        if (i == 1) {
            OooO0O0(obj, oo00oo);
            return;
        }
        if (i == 2) {
            if (z) {
                OooO0O0(obj, oo00oo);
                return;
            }
            o00OOO0O o00ooo0o = this.f60272OooO0o0;
            o00ooo0o.getClass();
            o00OOOO0 o00oooo0OooO00o = o00OOOO0.OooO00o(obj, oo00oo);
            synchronized (o00ooo0o) {
                o00ooo0o.f60285OooO00o.OooO00o(o00oooo0OooO00o);
                if (!o00ooo0o.f60288OooO0Oo) {
                    o00ooo0o.f60288OooO0Oo = true;
                    if (!o00ooo0o.sendMessage(o00ooo0o.obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            }
            return;
        }
        if (i == 3) {
            if (z) {
                this.f60271OooO0o.OooO00o(obj, oo00oo);
                return;
            } else {
                OooO0O0(obj, oo00oo);
                return;
            }
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown thread mode: " + oo00oo.f60314OooO0O0.f60308OooO0O0);
        }
        oo0O oo0o = this.f60273OooO0oO;
        oo0o.getClass();
        oo0o.f60316OooO0Oo.OooO00o(o00OOOO0.OooO00o(obj, oo00oo));
        oo0o.f60317OooO0o0.f60266OooO.execute(oo0o);
    }

    public final void OooO0oo(Object obj, o0oOO o0ooo2) {
        Object value;
        Class<?> cls = o0ooo2.f60309OooO0OO;
        oo00oO oo00oo = new oo00oO(obj, o0ooo2);
        HashMap map = this.f60267OooO00o;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(oo00oo)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i != size) {
                if (o0ooo2.f60310OooO0Oo <= ((oo00oO) copyOnWriteArrayList.get(i)).f60314OooO0O0.f60310OooO0Oo) {
                }
            }
            copyOnWriteArrayList.add(i, oo00oo);
            break;
        }
        HashMap map2 = this.f60268OooO0O0;
        List arrayList = (List) map2.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (o0ooo2.f60312OooO0o0) {
            ConcurrentHashMap concurrentHashMap = this.f60269OooO0OO;
            if (!this.f60278OooOOO) {
                Object obj2 = concurrentHashMap.get(cls);
                if (obj2 != null) {
                    OooO0oO(oo00oo, obj2, Looper.getMainLooper() == Looper.myLooper());
                    return;
                }
                return;
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                    OooO0oO(oo00oo, value, Looper.getMainLooper() == Looper.myLooper());
                }
            }
        }
    }

    public final String toString() {
        return "EventBus[indexCount=0, eventInheritance=" + this.f60278OooOOO + "]";
    }
}
