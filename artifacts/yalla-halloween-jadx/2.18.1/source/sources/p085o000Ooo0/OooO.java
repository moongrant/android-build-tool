package p085o000Ooo0;

import OooO00o.OooO00o;
import OooO0o.OooO0o;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Set<File> f28392OooO00o = new HashSet();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f28393OooO0O0;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i = Integer.parseInt(strNextToken);
                    int i2 = Integer.parseInt(strNextToken2);
                    if (i > 2 || (i == 2 && i2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sbOooO00o = Oooo0.OooO00o("VM with version ", property);
        sbOooO00o.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sbOooO00o.toString());
        f28393OooO0O0 = z;
    }

    public static void OooO00o(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldOooO0Oo = OooO0Oo(obj, str);
        Object[] objArr2 = (Object[]) fieldOooO0Oo.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldOooO0Oo.set(obj, objArr3);
    }

    public static void OooO0O0(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Clearing old secondary dex dir (");
            sbOooO0o0.append(file.getPath());
            sbOooO0o0.append(").");
            Log.i("MultiDex", sbOooO0o0.toString());
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Failed to list secondary dex dir content (");
                sbOooO0o1.append(file.getPath());
                sbOooO0o1.append(").");
                Log.w("MultiDex", sbOooO0o1.toString());
                return;
            }
            for (File file2 : fileArrListFiles) {
                StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Trying to delete old file ");
                sbOooO0o2.append(file2.getPath());
                sbOooO0o2.append(" of size ");
                sbOooO0o2.append(file2.length());
                Log.i("MultiDex", sbOooO0o2.toString());
                if (file2.delete()) {
                    StringBuilder sbOooO0o3 = OooO00o.OooO0o0("Deleted old file ");
                    sbOooO0o3.append(file2.getPath());
                    Log.i("MultiDex", sbOooO0o3.toString());
                } else {
                    StringBuilder sbOooO0o4 = OooO00o.OooO0o0("Failed to delete old file ");
                    sbOooO0o4.append(file2.getPath());
                    Log.w("MultiDex", sbOooO0o4.toString());
                }
            }
            if (file.delete()) {
                StringBuilder sbOooO0o5 = OooO00o.OooO0o0("Deleted old secondary dex dir ");
                sbOooO0o5.append(file.getPath());
                Log.i("MultiDex", sbOooO0o5.toString());
            } else {
                StringBuilder sbOooO0o6 = OooO00o.OooO0o0("Failed to delete secondary dex dir ");
                sbOooO0o6.append(file.getPath());
                Log.w("MultiDex", sbOooO0o6.toString());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.io.File>] */
    public static void OooO0OO(Context context, File file, File file2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        ClassLoader classLoader;
        ?? r1 = f28392OooO00o;
        synchronized (r1) {
            if (r1.contains(file)) {
                return;
            }
            r1.add(file);
            Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
            IOException e = null;
            try {
                classLoader = context.getClassLoader();
                if (!(classLoader instanceof BaseDexClassLoader)) {
                    Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                    classLoader = null;
                }
            } catch (RuntimeException e2) {
                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e2);
            }
            if (classLoader == null) {
                return;
            }
            try {
                OooO0O0(context);
            } catch (Throwable th) {
                Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
            }
            File file3 = new File(file2, "code_cache");
            try {
                OooO0o(file3);
            } catch (IOException unused) {
                file3 = new File(context.getFilesDir(), "code_cache");
                OooO0o(file3);
            }
            File file4 = new File(file3, "secondary-dexes");
            OooO0o(file4);
            OooOO0O oooOO0O = new OooOO0O(file, file4);
            try {
                try {
                    OooO0o0(classLoader, file4, oooOO0O.OooO0oo(context, false));
                } catch (IOException e3) {
                    Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e3);
                    OooO0o0(classLoader, file4, oooOO0O.OooO0oo(context, true));
                }
                try {
                    oooOO0O.close();
                } catch (IOException e4) {
                    e = e4;
                }
                if (e != null) {
                    throw e;
                }
            } catch (Throwable th2) {
                try {
                    oooOO0O.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
        }
    }

    public static Field OooO0Oo(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("Field ", str, " not found in ");
        sbOooO0OO.append(obj.getClass());
        throw new NoSuchFieldException(sbOooO0OO.toString());
    }

    public static void OooO0o(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to create dir ");
            sbOooO0o0.append(file.getPath());
            sbOooO0o0.append(". Parent file is null.");
            Log.e("MultiDex", sbOooO0o0.toString());
        } else {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Failed to create dir ");
            sbOooO0o1.append(file.getPath());
            sbOooO0o1.append(". parent file is a dir ");
            sbOooO0o1.append(parentFile.isDirectory());
            sbOooO0o1.append(", a file ");
            sbOooO0o1.append(parentFile.isFile());
            sbOooO0o1.append(", exists ");
            sbOooO0o1.append(parentFile.exists());
            sbOooO0o1.append(", readable ");
            sbOooO0o1.append(parentFile.canRead());
            sbOooO0o1.append(", writable ");
            sbOooO0o1.append(parentFile.canWrite());
            Log.e("MultiDex", sbOooO0o1.toString());
        }
        StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Failed to create directory ");
        sbOooO0o2.append(file.getPath());
        throw new IOException(sbOooO0o2.toString());
    }

    public static void OooO0o0(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Method declaredMethod;
        IOException[] iOExceptionArr;
        if (list.isEmpty()) {
            return;
        }
        Object obj = OooO0Oo(classLoader, "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        Class<?> superclass = obj.getClass();
        while (true) {
            if (superclass == null) {
                StringBuilder sbOooO0OO = OooO0o.OooO0OO("Method ", "makeDexElements", " with parameters ");
                sbOooO0OO.append(Arrays.asList(clsArr));
                sbOooO0OO.append(" not found in ");
                sbOooO0OO.append(obj.getClass());
                throw new NoSuchMethodException(sbOooO0OO.toString());
            }
            try {
                declaredMethod = superclass.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    break;
                }
                break;
            } catch (NoSuchMethodException unused) {
                superclass = superclass.getSuperclass();
            }
        }
        OooO00o(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
            }
            Field fieldOooO0Oo = OooO0Oo(obj, "dexElementsSuppressedExceptions");
            IOException[] iOExceptionArr2 = (IOException[]) fieldOooO0Oo.get(obj);
            if (iOExceptionArr2 == null) {
                iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
            } else {
                IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                arrayList.toArray(iOExceptionArr3);
                System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                iOExceptionArr = iOExceptionArr3;
            }
            fieldOooO0Oo.set(obj, iOExceptionArr);
            IOException iOException = new IOException("I/O exception during makeDexElement");
            iOException.initCause((Throwable) arrayList.get(0));
            throw iOException;
        }
    }
}
