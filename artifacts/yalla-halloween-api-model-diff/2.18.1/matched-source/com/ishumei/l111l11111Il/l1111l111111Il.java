package com.ishumei.l111l11111Il;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Base64;
import com.facebook.appevents.AppEventsConstants;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l1111l111111Il {
    private static final String l1111l111111Il = "eJy1Wt9P5DYQ/l9WPPQktBHcG1SVDriiVYFbEdpKoHtwkiHrrmOnsbPAnfq/d5xNgpM4u9k4vOyheH5883k8Htv39HO2hrfZ2QwYJMDV7HgWMvLjB36JCNvQtSffpILEu4LXJVGrGyrV0ddaNgG1EhEKK+GrjPIYv0ka44dfPt38QzbEY4TH3nbsHAdTkpFkdvb0/Xim3lKYnZ38d1xBoFwu17GBgPAoEzTySJp6X9KU0ZAoKviShGsSwy3h+JuZKGJQCy4VYQyiUkq+I1qUkHJFmacDMQGhdzWzoZIpWj2xoBLS8wtulplIIVO08GVieXfd5WI3PTM9ONeD85LXGtppC9rp5NDcwR4PxA/hFkobf5qJDY0g83xQCrXlkQ9hnkEriHbK3VT6oeAKE9S73P57D1KwDWSHR1YanJcG5y2DQwONYGPLIIWLLl0J/uY9VH/Zk/oKNjSEReSyuhCDLVUcMCz2kNe3ojiu4g0YWN6tZPDMIFTerYjoM21ioPKuUqxIeLTF3OA9yG0FBdfHVTlkmC8+YeA4yRxBQHSAp5iJgLCh2XxdSHcql3JL5cUHZG6Wc4TfV5NDnA+qehLmPucczWLhxioUgpRmLd5Vim05gzgUkWsXIA+o77wbIA4JmV4JLlD8rQlnNOiQ8ufe6Rm4ZRpyi6213q0BYbYTM028loF9e0NfNOk6niCacnBcJIby2Ciwi0G4U3UxhoJztsArhNaqi1mpaNLYXUvZQe1LubwH9i/mhKdRsanQyIAVisSrKMNIIOOEGbvUEn8BPb6+fcAeGcvkcESo5F37twWwD8CUyjwYSZOfB+UymBoUZgt16mgWaMAVgFM70wQwtpUJVEJCC4yA5aCEUCvvovrrS0RS1a29UZTh2nGhIgTGmLChGEzGJZq4EdsyY0LpGjIlhwALVxiIba9sp6oiCnQlA95EJ7jp8rIwZ6TuPoif/rI1RbXwvBG5LQgUdUr0G8rh5C5PgmJk9CSjP6d0t8IYm/U0DGnkxIpPE+yBKGHuzBRgnLjpBTP6gIMrPnXi5w7Ui8jW3/DwTpRw4qcA48RPLxgnfjhJYEqO7kgCzjxpUFNy1QQ1li9JE8d8whSfIpcKIK5rbbo8KuA455EByTWHakBTcTRN/tBEunVr2EjKMKNYHF3bRunWtdmBjOUlXYUi57Yrm8GAiublsrRS8bLYQ8OLvWnECuS90Gfq/Y0/lsb9loQTtItSNs4RQ537/uLKxW2Gfke4vd+qDWUWzY2Krizbjeze5ysYyeSFK5XooPhmd12F0nX8sFU6gEs8eo7y5Nd6w51RfVxw23ppvAqEZlB39c0LoEPvGwkeXRzxfGHMHYcMCc/6JqDOsp5iibr3IHOmHC5etQ+pD2fjMOgRv1QfXB711T8nARvjk0o98LVQ33uBb179gGLEthWw8nToGQfkxskKP6o8MgO8GuCrsHOwL8HjQ50xItWaixduvyPouOw5P6KVP7SV7jWB7XKw1/qIS8Ly9USOB780TJSgH3feoAZCMCD2C4EApNKYxsO5QAsVJMtNRm3lMqNKn0vPH/f0N9W1RqU5rzRnu155zGoXRYyOJRiVr1OpF3kujRuc3rBq4aNK+ryxOrvhdDWsUcSp1JVq/MTUfgbBt6X5++CwgPpmgydAxk/HHWoPmYlvXEveYkOJRoZOhlXpA+LI4N8cF0ol8Wca4S6yc2Yq0fut5nm/RB1rLSIkDur/K/H+Sb/XLIFHuGgWxQNRz2VizUzLP8r2ihizU8kIOd8iML4hhHkDgv2K8rVZ2vXTAAqH+k0rISlJqVe+We4r8sL2CjiwmtuQPVPWOJsXVYwK73fKGk8lv1JO1W87t5QG9f1F7XPT+ekkzg+Gs6vsfm5sbUFOWdShyHxWu9ASzalqI36ahK8KTYezA9G0N1YLFD0414MmkO//A9zgF+k=";

    private static int l1111l111111Il(boolean z) {
        return z ? 1 : 0;
    }

    public static Map<String, Object> l1111l111111Il() {
        String strL1111l111111Il;
        HashMap map = new HashMap();
        try {
            ArrayList<com.ishumei.l111l11111lIl.l111l11111lIl.l1111l111111Il> arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(l11l1111Ill());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("949a86"));
                    String string2 = jSONObject.getString(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c939e8585"));
                    String string3 = jSONObject.getString(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("929a8b97909b"));
                    JSONArray jSONArray2 = jSONObject.getJSONArray(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8f9e8d9e92"));
                    int i2 = jSONObject.getInt(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8b868f9a"));
                    com.ishumei.l111l11111lIl.l111l11111lIl.l1111l111111Il l1111l111111il = new com.ishumei.l111l11111lIl.l111l11111lIl.l1111l111111Il();
                    l1111l111111il.l1111l111111Il(string);
                    l1111l111111il.l111l11111lIl(string2);
                    l1111l111111il.l111l11111I1l(string3);
                    l1111l111111il.l1111l111111Il(i2);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                        arrayList2.add(jSONArray2.getString(i3));
                    }
                    l1111l111111il.l1111l111111Il(arrayList2);
                    arrayList.add(l1111l111111il);
                } catch (Exception unused) {
                }
            }
            for (com.ishumei.l111l11111lIl.l111l11111lIl.l1111l111111Il l1111l111111il2 : arrayList) {
                try {
                    Class<?> cls = Class.forName(l1111l111111il2.l1111l111111Il().replace("/", "."));
                    int iL111l11111Il = l1111l111111il2.l111l11111Il();
                    List<String> listL111l11111I1l = l1111l111111il2.l111l11111I1l();
                    if (iL111l11111Il != 3) {
                        if (Modifier.isNative(((listL111l11111I1l == null || listL111l11111I1l.size() == 0) ? cls.getDeclaredMethod(l1111l111111il2.l111l11111lIl(), new Class[0]) : cls.getDeclaredMethod(l1111l111111il2.l111l11111lIl(), l1111l111111Il(listL111l11111I1l))).getModifiers())) {
                            strL1111l111111Il = l1111l111111il2.l1111l111111Il();
                            map.put(strL1111l111111Il, 1);
                        }
                    } else if (Modifier.isNative(((listL111l11111I1l == null || listL111l11111I1l.size() == 0) ? cls.getConstructor(new Class[0]) : cls.getConstructor(l1111l111111Il(listL111l11111I1l))).getModifiers())) {
                        strL1111l111111Il = l1111l111111il2.l1111l111111Il();
                        map.put(strL1111l111111Il, 1);
                    }
                } catch (Exception unused2) {
                    map.put(l1111l111111il2.l1111l111111Il(), 2);
                }
            }
        } catch (Exception unused3) {
        }
        return map;
    }

    private static void l1111l111111Il(Class<?> cls, String str, Set<Object> set) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            set.addAll(((Map) declaredField.get(null)).keySet());
        } catch (Throwable unused) {
        }
    }

    private static boolean l1111l111111Il(ClassLoader classLoader, String str) {
        if (classLoader == null || !(classLoader instanceof BaseDexClassLoader)) {
            return false;
        }
        try {
            Class<?> cls = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9e93899694d18c868c8b9a92d1bb9a87af9e8b97b3968c8b"));
            Method method = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9e93899694d18c868c8b9a92d1bb9a87af9e8b97b3968c8bdbba939a929a918b")).getMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8b90ac8b8d969198"), null);
            Field declaredField = cls.getDeclaredField(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9a87ba939a929a918b8c"));
            declaredField.setAccessible(true);
            Field declaredField2 = BaseDexClassLoader.class.getDeclaredField(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8f9e8b97b3968c8b"));
            declaredField2.setAccessible(true);
            Object[] objArr = (Object[]) declaredField.get(declaredField2.get(classLoader));
            for (Object obj : objArr) {
                String str2 = (String) method.invoke(obj, null);
                if (str2 != null && str2.contains(str)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean l1111l111111Il(String str) {
        try {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            if (l1111l111111Il(systemClassLoader, str) || l1111l111111Il(systemClassLoader.getParent(), str)) {
                return true;
            }
            ClassLoader classLoader = l1111l111111Il.class.getClassLoader();
            return l1111l111111Il(classLoader, str) || l1111l111111Il(classLoader.getParent(), str);
        } catch (Exception unused) {
            return false;
        }
    }

    private static Class[] l1111l111111Il(List<String> list) throws ClassNotFoundException {
        Class<?> cls;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Objects.requireNonNull(str);
            switch (str) {
                case "double":
                    cls = Double.TYPE;
                    break;
                case "int":
                    cls = Integer.TYPE;
                    break;
                case "byte":
                    cls = Byte.TYPE;
                    break;
                case "char":
                    cls = Character.TYPE;
                    break;
                case "long":
                    cls = Long.TYPE;
                    break;
                case "boolean":
                    cls = Boolean.TYPE;
                    break;
                case "float":
                    cls = Float.TYPE;
                    break;
                case "short":
                    cls = Short.TYPE;
                    break;
                default:
                    cls = Class.forName(str);
                    break;
            }
            arrayList.add(cls);
        }
        Class[] clsArr = new Class[arrayList.size()];
        arrayList.toArray(clsArr);
        return clsArr;
    }

    public static Set<Object> l111l11111I1l() {
        HashSet hashSet = new HashSet();
        try {
            Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9ad18d909d89d19e919b8d90969bd1878f908c9a9bd1a78f908c9a9bb79a938f9a8d8c"));
            l1111l111111Il(clsLoadClass, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("99969a939bbc9e9c979a"), hashSet);
            l1111l111111Il(clsLoadClass, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("929a8b97909bbc9e9c979a"), hashSet);
            l1111l111111Il(clsLoadClass, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c90918c8b8d8a9c8b908dbc9e9c979a"), hashSet);
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    public static Map<String, Object> l111l11111Il() {
        Field field;
        boolean z;
        Class<?> clsLoadClass;
        Method declaredMethod;
        HashMap map = new HashMap();
        try {
            Field[] declaredFields = ClassLoader.getSystemClassLoader().loadClass(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9ad18d909d89d19e919b8d90969bd1878f908c9a9bd1a78f908c9a9bbd8d969b989a")).getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    field = declaredFields[i];
                    if (!com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8cb79090949a9bb29a8b97909bbc9e93939d9e9c948c").equals(field.getName())) {
                        if (com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("979090949a9bb29a8b97909bbc9e93939d9e9c948c").equals(field.getName())) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                } else {
                    field = null;
                }
                z = false;
                break;
            }
            if (field == null) {
                return map;
            }
            field.setAccessible(true);
            Map map2 = (Map) field.get(null);
            if (z) {
                clsLoadClass = null;
                declaredMethod = null;
            } else {
                clsLoadClass = ClassLoader.getSystemClassLoader().loadClass(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9ad18d909d89d19e919b8d90969bd1878f908c9a9bd1a78f908c9a9bbd8d969b989adbbc908f86b091a88d968b9aac908d8b9a9bac9a8b"));
                declaredMethod = clsLoadClass.getDeclaredMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bac919e8f8c97908b"), new Class[0]);
                declaredMethod.setAccessible(true);
            }
            for (Object obj : map2.entrySet()) {
                String string = ((Map.Entry) obj).getKey().toString();
                Set hashSet = (Set) map.get(string);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(string, hashSet);
                }
                Object value = ((Map.Entry) obj).getValue();
                Object[] array = (clsLoadClass == null || !clsLoadClass.isInstance(value)) ? TreeSet.class.isInstance(value) ? ((TreeSet) value).toArray() : null : (Object[]) declaredMethod.invoke(value, new Object[0]);
                if (array != null) {
                    for (Object obj2 : array) {
                        hashSet.add(obj2.getClass().getName());
                    }
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public static boolean l111l11111lIl() {
        try {
            return l1111l111111Il(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("a78f908c9a9bbd8d969b989ad1959e8d"));
        } catch (Exception unused) {
            return false;
        }
    }

    public static Map<String, Object> l111l1111l1Il() {
        HashMap map = new HashMap();
        try {
            Object objInvoke = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd19c90918b9a918bd1bc90918b9a878b")).getDeclaredMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bac868c8b9a92ac9a8d89969c9a"), String.class).invoke(com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e9c9c9a8c8c969d9693968b86"));
            Method declaredMethod = objInvoke.getClass().getDeclaredMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("968cba919e9d939a9b"), new Class[0]);
            Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bba919e9d939a9bbe9c9c9a8c8c969d9693968b86ac9a8d89969c9ab3968c8b"), Integer.TYPE);
            Object objInvoke2 = declaredMethod.invoke(objInvoke, new Object[0]);
            List list = (List) declaredMethod2.invoke(objInvoke, -1);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Object objInvoke3 = obj.getClass().getDeclaredMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bb69b"), new Class[0]).invoke(obj, new Object[0]);
                if (objInvoke3 == null) {
                    Object objInvoke4 = obj.getClass().getDeclaredMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bad9a8c9093899ab6919990"), new Class[0]).invoke(obj, new Object[0]);
                    arrayList.add(objInvoke4 == null ? obj.toString() : objInvoke4.toString());
                } else {
                    arrayList.add((String) objInvoke3);
                }
            }
            map.put("enable", ((Boolean) objInvoke2).booleanValue() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            map.put("service", arrayList);
            map.put("suc", "1");
        } catch (Throwable th) {
            map.put("e", th.getMessage());
            map.put("suc", "-1");
        }
        return map;
    }

    public static String l111l1111lI1l() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i > 29) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            Class<?> cls = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("959e899ed18a8b9693d1aaaab6bb"));
            Class<?> cls2 = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd1929a9b969ed1b29a9b969ebb8d92"));
            Class<?> cls3 = Long.TYPE;
            Constructor<?> constructor = cls.getConstructor(cls3, cls3);
            Constructor<?> constructor2 = cls2.getConstructor(cls);
            Method method = cls2.getMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8baf8d908f9a8d8b86bd868b9abe8d8d9e86"), String.class);
            Object objNewInstance = constructor2.newInstance(constructor.newInstance(-1301668207276963122L, -6645017420763422227L));
            sb.append(Base64.encodeToString((byte[]) method.invoke(objNewInstance, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9a89969c9aaa91968e8a9ab69b")), 2));
            sb.append("__");
            sb.append("_");
            cls2.getMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c93908c9a"), new Class[0]).invoke(objNewInstance, new Object[0]);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public static String l111l1111lIl() {
        StringBuilder sb = new StringBuilder();
        try {
            Method method = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd1908cd1ac9a8d89969c9ab29e919e989a8d")).getMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bac9a8d89969c9a"), String.class);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, "location");
            Object objInvoke2 = method.invoke(null, "phone");
            sb.append("locateServiceName:");
            sb.append(objInvoke.getClass().getName());
            sb.append("|");
            sb.append("phoneServiceName:");
            sb.append(objInvoke2.getClass().getName());
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public static String l111l1111llIl() {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 23) {
            return "1111111";
        }
        Locale locale = Locale.CHINA;
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0));
        objArr[1] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0));
        objArr[2] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.WRITE_SETTINGS") == 0));
        objArr[3] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0));
        objArr[4] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0));
        objArr[5] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0));
        objArr[6] = Integer.valueOf(l1111l111111Il(context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0));
        return String.format(locale, "%d%d%d%d%d%d%d", objArr);
    }

    public static String l11l1111I11l() {
        if (Build.VERSION.SDK_INT < 23) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        try {
            Field declaredField = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9ad18d909d89d19e919b8d90969bd1878f908c9a9bd1a78f908c9a9bb691968b")).getDeclaredField(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("93909e9b9a9bb2909b8a939a8c"));
            declaredField.setAccessible(true);
            Iterator it = ((ArraySet) declaredField.get(null)).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
        } catch (Throwable unused) {
        }
        return TextUtils.join("|", arrayList);
    }

    public static String l11l1111I1l() {
        if (Build.VERSION.SDK_INT >= 28) {
            return "";
        }
        String strL111l11111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c9092d19a939b9a8d9b8d96899a8d8cd18d968d8ad19a9b878fd19c9091999698d1ba9ba78fbc9091999698b893909d9e93");
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd19e8f8fd1be8f8f93969c9e8b969091b3909e9b9a8d8c"));
            Field declaredField = cls.getDeclaredField(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("98be8f8f93969c9e8b969091b3909e9b9a8d8c"));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = cls.getDeclaredField(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("92b3909e9b9a8d8c"));
            declaredField2.setAccessible(true);
            for (Map.Entry entry : ((Map) declaredField2.get(obj)).entrySet()) {
                String str = (String) entry.getKey();
                try {
                    Class.forName(strL111l11111Il, false, (ClassLoader) entry.getValue());
                    arrayList.add(str);
                } catch (ClassNotFoundException unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return TextUtils.join("|", arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.pm.PackageManager] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.content.pm.ApplicationInfo, android.content.pm.PackageItemInfo] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:50:0x006b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.util.List<java.lang.String> l11l1111I1ll() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ishumei.l111l11111Il.l1111l111111Il.l11l1111I1ll():java.util.List");
    }

    public static Map<String, Object> l11l1111Il() {
        ActivityManager activityManager;
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap(3);
        hashSet.add(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8a8c9a8dd1858f908c9a9bd19e8f8f"));
        hashSet.add(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8a8c9a8dd1858f908c9a9bd18c868c8b9a92"));
        for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
            if (hashSet.contains(runningServiceInfo.process)) {
                map.put(runningServiceInfo.process, 1);
            }
        }
        return map;
    }

    public static int l11l1111Il1l() {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir());
        sb.append(File.separator);
        sb.append(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9a878fa09d9e8c9ad19e8f94"));
        return new File(sb.toString()).exists() ? 1 : 0;
    }

    private static String l11l1111Ill() {
        try {
            return new String(com.ishumei.l111l1111llIl.l11l1111lIIl.l1111l111111Il(Base64.decode(l1111l111111Il, 0)));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String l11l1111lIIl() {
        ArrayList arrayList = new ArrayList();
        try {
            Field declaredField = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9ad18d909d89d19e919b8d90969bd1878f908c9a9bd1a78f908c9a9bb691968b")).getDeclaredField(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("93909e9b9a9baf9e9c949e989a8cb691af8d909c9a8c8c"));
            declaredField.setAccessible(true);
            arrayList.addAll((Set) declaredField.get(null));
        } catch (Throwable unused) {
        }
        return TextUtils.join("|", arrayList);
    }

    private static String l11l111l11Il() {
        try {
            String strL111l11111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8c8a9d8c8b8d9e8b9a");
            String strL111l11111Il2 = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("a78f908c9a9b");
            for (String str : com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d08f8d909cd08c9a9399d0929e8f8c"))) {
                if (!TextUtils.isEmpty(str)) {
                    if (str.contains(strL111l11111Il)) {
                        return strL111l11111Il;
                    }
                    if (str.contains(strL111l11111Il2)) {
                        return strL111l11111Il2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private static String l11l11IlIIll() {
        try {
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                Field declaredField = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd19d938a9a8b90908b97d1bd938a9a8b90908b97be9b9e8f8b9a8d")).getDeclaredField(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("92ac9a8d89969c9a"));
                declaredField.setAccessible(true);
                Object obj = declaredField.get(defaultAdapter);
                if (obj == null) {
                    throw new Exception();
                }
                Object objInvoke = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd19d938a9a8b90908b97d1b6bd938a9a8b90908b97dbac8b8a9ddbaf8d908786")).getMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bbe9b9b8d9a8c8c"), null).invoke(obj, null);
                if (objInvoke == null || !(objInvoke instanceof String)) {
                    throw new Exception();
                }
                return (String) objInvoke;
            } catch (Exception unused) {
                return "";
            }
        } catch (Exception unused2) {
            Class<?> cls = Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd1908cd1ac9a8d89969c9ab29e919e989a8d"));
            Class.forName(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd19d938a9a8b90908b97d1b6bd938a9a8b90908b97b29e919e989a8ddbac8b8a9d")).getField(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("b9b6adacaba0bcbeb3b3a0abadbeb1acbebcabb6b0b1"));
            IBinder iBinder = (IBinder) cls.getMethod(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("989a8bac9a8d89969c9a"), String.class).invoke(null, com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9d938a9a8b90908b97a0929e919e989a8d"));
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e919b8d90969bd19d938a9a8b90908b97d1b6bd938a9a8b90908b97b29e919e989a8d"));
                iBinder.transact(5, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return string == null ? "" : string;
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
    }
}
