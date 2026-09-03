package com.squareup.okhttp;

import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okio.ByteString;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.Subscribe;
import p660o0oooO0O.o00OOO00;
import p660o0oooO0O.o0O00o0;
import p660o0oooO0O.o0oOO;
import p660o0oooO0O.oo00oO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo {
    public static String OooO00o(String str, String str2) {
        try {
            return "Basic " + ByteString.OooOOO0((str + CertificateUtil.DELIMITER + str2).getBytes("ISO-8859-1")).OooO00o();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    public static o00OOO00 OooO0O0() {
        if (o00OOO00.f60263OooOOOO == null) {
            synchronized (o00OOO00.class) {
                if (o00OOO00.f60263OooOOOO == null) {
                    o00OOO00.f60263OooOOOO = new o00OOO00();
                }
            }
        }
        return o00OOO00.f60263OooOOOO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0OO(int i, Object obj) {
        p418o0OoO000.OooOo oooOo = new p418o0OoO000.OooOo();
        oooOo.f45532OooO00o = i;
        oooOo.f45534OooO0OO = obj;
        OooO0O0().OooO0Oo(oooOo);
    }

    public static void OooO0Oo(Object obj) {
        Method[] methods;
        Subscribe subscribe;
        boolean zOooO00o;
        o00OOO00 o00ooo00OooO0O0 = OooO0O0();
        o00ooo00OooO0O0.getClass();
        Class<?> cls = obj.getClass();
        o00ooo00OooO0O0.f60274OooO0oo.getClass();
        ConcurrentHashMap concurrentHashMap = o0O00o0.f60298OooO00o;
        List list = (List) concurrentHashMap.get(cls);
        List list2 = list;
        if (list == null) {
            o0O00o0.OooO00o oooO00oOooO0O0 = o0O00o0.OooO0O0();
            oooO00oOooO0O0.f60305OooO0o0 = cls;
            int i = 0;
            oooO00oOooO0O0.f60304OooO0o = false;
            while (true) {
                Class<?> cls2 = oooO00oOooO0O0.f60305OooO0o0;
                if (cls2 == null) {
                    ArrayList arrayListOooO00o = o0O00o0.OooO00o(oooO00oOooO0O0);
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
                    methods = oooO00oOooO0O0.f60305OooO0o0.getMethods();
                    oooO00oOooO0O0.f60304OooO0o = true;
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
                            HashMap map = oooO00oOooO0O0.f60301OooO0O0;
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
                                oooO00oOooO0O0.f60300OooO00o.add(new o0oOO(method, cls3, subscribe.threadMode(), subscribe.priority(), subscribe.sticky()));
                            }
                        }
                    }
                    i2++;
                    i = 0;
                }
                if (oooO00oOooO0O0.f60304OooO0o) {
                    oooO00oOooO0O0.f60305OooO0o0 = null;
                } else {
                    Class<? super Object> superclass = oooO00oOooO0O0.f60305OooO0o0.getSuperclass();
                    oooO00oOooO0O0.f60305OooO0o0 = superclass;
                    String name = superclass.getName();
                    if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                        oooO00oOooO0O0.f60305OooO0o0 = null;
                    }
                }
                i = 0;
            }
        }
        synchronized (o00ooo00OooO0O0) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                o00ooo00OooO0O0.OooO0oo(obj, (o0oOO) it.next());
            }
        }
    }

    public static void OooO0o0(Object obj) {
        o00OOO00 o00ooo00OooO0O0 = OooO0O0();
        synchronized (o00ooo00OooO0O0) {
            List list = (List) o00ooo00OooO0O0.f60268OooO0O0.get(obj);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) o00ooo00OooO0O0.f60267OooO00o.get((Class) it.next());
                    if (list2 != null) {
                        int size = list2.size();
                        int i = 0;
                        while (i < size) {
                            oo00oO oo00oo = (oo00oO) list2.get(i);
                            if (oo00oo.f60313OooO00o == obj) {
                                oo00oo.f60315OooO0OO = false;
                                list2.remove(i);
                                i--;
                                size--;
                            }
                            i++;
                        }
                    }
                }
                o00ooo00OooO0O0.f60268OooO0O0.remove(obj);
            } else {
                Log.w("EventBus", "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        }
    }
}
