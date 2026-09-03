package p545o0oO0O00;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.Subscribe;
import p664o0oooOO.oO00O0o;
import p664o0oooOO.oO00Oo0;
import p664o0oooOO.oO00Oo00;
import p664o0oooOO.oOOoOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 {
    public static oO00O0o OooO00o() {
        if (oO00O0o.f59838OooOOOO == null) {
            synchronized (oO00O0o.class) {
                if (oO00O0o.f59838OooOOOO == null) {
                    oO00O0o.f59838OooOOOO = new oO00O0o();
                }
            }
        }
        return oO00O0o.f59838OooOOOO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0O0(int i, Object obj) {
        OooOOO oooOOO = new OooOOO();
        oooOOO.f55758OooO00o = i;
        oooOOO.f55760OooO0OO = obj;
        OooO00o().OooO0Oo(oooOOO);
    }

    public static void OooO0OO(Object obj) {
        Method[] methods;
        Subscribe subscribe;
        boolean zOooO00o;
        oO00O0o oo00o0oOooO00o = OooO00o();
        oo00o0oOooO00o.getClass();
        Class<?> cls = obj.getClass();
        oo00o0oOooO00o.f59849OooO0oo.getClass();
        ConcurrentHashMap concurrentHashMap = oO00Oo0.f59878OooO00o;
        List list = (List) concurrentHashMap.get(cls);
        List list2 = list;
        if (list == null) {
            oO00Oo0.OooO00o oooO00oOooO0O0 = oO00Oo0.OooO0O0();
            oooO00oOooO0O0.f59885OooO0o0 = cls;
            int i = 0;
            oooO00oOooO0O0.f59884OooO0o = false;
            while (true) {
                Class<?> cls2 = oooO00oOooO0O0.f59885OooO0o0;
                if (cls2 == null) {
                    ArrayList arrayListOooO00o = oO00Oo0.OooO00o(oooO00oOooO0O0);
                    if (!arrayListOooO00o.isEmpty()) {
                        concurrentHashMap.put(cls, arrayListOooO00o);
                        list2 = arrayListOooO00o;
                        break;
                    } else {
                        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
                    }
                }
                try {
                    methods = cls2.getDeclaredMethods();
                } catch (Throwable unused) {
                    methods = oooO00oOooO0O0.f59885OooO0o0.getMethods();
                    oooO00oOooO0O0.f59884OooO0o = true;
                }
                int length = methods.length;
                int i2 = i;
                while (i2 < length) {
                    Method method = methods[i2];
                    int modifiers = method.getModifiers();
                    if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 1 && (subscribe = (Subscribe) method.getAnnotation(Subscribe.class)) != null) {
                            Class<?> cls3 = parameterTypes[i];
                            HashMap map = oooO00oOooO0O0.f59881OooO0O0;
                            Object objPut = map.put(cls3, method);
                            if (objPut == null) {
                                zOooO00o = true;
                            } else {
                                if (objPut instanceof Method) {
                                    if (!oooO00oOooO0O0.OooO00o(cls3, (Method) objPut)) {
                                        throw new IllegalStateException();
                                    }
                                    map.put(cls3, oooO00oOooO0O0);
                                }
                                zOooO00o = oooO00oOooO0O0.OooO00o(cls3, method);
                            }
                            if (zOooO00o) {
                                oooO00oOooO0O0.f59880OooO00o.add(new oO00Oo00(method, cls3, subscribe.threadMode(), subscribe.priority(), subscribe.sticky()));
                            }
                        }
                    }
                    i2++;
                    i = 0;
                }
                if (oooO00oOooO0O0.f59884OooO0o) {
                    oooO00oOooO0O0.f59885OooO0o0 = null;
                } else {
                    Class<? super Object> superclass = oooO00oOooO0O0.f59885OooO0o0.getSuperclass();
                    oooO00oOooO0O0.f59885OooO0o0 = superclass;
                    String name = superclass.getName();
                    if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                        oooO00oOooO0O0.f59885OooO0o0 = null;
                    }
                }
                i = 0;
            }
        }
        synchronized (oo00o0oOooO00o) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                oo00o0oOooO00o.OooO0oo(obj, (oO00Oo00) it.next());
            }
        }
    }

    public static void OooO0Oo(Object obj) {
        oO00O0o oo00o0oOooO00o = OooO00o();
        synchronized (oo00o0oOooO00o) {
            List list = (List) oo00o0oOooO00o.f59843OooO0O0.get(obj);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) oo00o0oOooO00o.f59842OooO00o.get((Class) it.next());
                    if (list2 != null) {
                        int size = list2.size();
                        int i = 0;
                        while (i < size) {
                            oOOoOOO0 ooooooo0 = (oOOoOOO0) list2.get(i);
                            if (ooooooo0.f59894OooO00o == obj) {
                                ooooooo0.f59896OooO0OO = false;
                                list2.remove(i);
                                i--;
                                size--;
                            }
                            i++;
                        }
                    }
                }
                oo00o0oOooO00o.f59843OooO0O0.remove(obj);
            } else {
                Log.w("EventBus", "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        }
    }
}
