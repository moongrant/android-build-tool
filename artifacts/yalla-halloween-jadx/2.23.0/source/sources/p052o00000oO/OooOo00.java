package p052o00000oO;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o0000O0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooOo00 extends o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Class<?> f34003OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Constructor<?> f34004OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static Method f34005OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static Method f34006OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f34007OooO0o0 = false;

    public static boolean OooO0oO(String str, boolean z, int i, Object obj) {
        OooO0oo();
        try {
            return ((Boolean) f34005OooO0OO.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void OooO0oo() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f34007OooO0o0) {
            return;
        }
        f34007OooO0o0 = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f34004OooO0O0 = constructor;
        f34003OooO00o = cls;
        f34005OooO0OO = method2;
        f34006OooO0Oo = method;
    }

    @Override // p052o00000oO.o00O0O
    public Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0OO oooO0OO, Resources resources, int i) {
        OooO0oo();
        try {
            Object objNewInstance = f34004OooO0O0.newInstance(new Object[0]);
            for (FontResourcesParserCompat.OooO0o oooO0o : oooO0OO.f5281OooO00o) {
                File fileOooO0Oo = o00Oo0.OooO0Oo(context);
                if (fileOooO0Oo == null) {
                    return null;
                }
                try {
                    if (!o00Oo0.OooO0O0(fileOooO0Oo, resources, oooO0o.f5286OooO0o)) {
                        return null;
                    }
                    if (!OooO0oO(fileOooO0Oo.getPath(), oooO0o.f5284OooO0OO, oooO0o.f5283OooO0O0, objNewInstance)) {
                        return null;
                    }
                    fileOooO0Oo.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileOooO0Oo.delete();
                }
            }
            OooO0oo();
            try {
                Object objNewInstance2 = Array.newInstance(f34003OooO00o, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f34006OooO0Oo.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p052o00000oO.o00O0O
    public Typeface OooO0O0(Context context, @NonNull Oooo000[] oooo000Arr, int i) {
        File file;
        if (oooo000Arr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(OooO0o(i, oooo000Arr).f34080OooO00o, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                } catch (ErrnoException unused) {
                }
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceOooO0OO = OooO0OO(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceOooO0OO;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
