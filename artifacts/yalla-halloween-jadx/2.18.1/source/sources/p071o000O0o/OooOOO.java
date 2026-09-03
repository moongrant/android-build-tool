package p071o000O0o;

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
import o000O0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooOOO extends Oooo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Class<?> f28170OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static Constructor<?> f28171OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static Method f28172OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static boolean f28173OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static Method f28174OooO0o0;

    public static boolean OooO0oO(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        OooO0oo();
        try {
            return ((Boolean) f28172OooO0Oo.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void OooO0oo() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f28173OooO0o) {
            return;
        }
        f28173OooO0o = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f28171OooO0OO = constructor;
        f28170OooO0O0 = cls;
        f28172OooO0Oo = method2;
        f28174OooO0o0 = method;
    }

    @Override // p071o000O0o.Oooo0
    public Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0OO oooO0OO, Resources resources, int i) throws NoSuchMethodException {
        OooO0oo();
        try {
            Object objNewInstance = f28171OooO0OO.newInstance(new Object[0]);
            for (FontResourcesParserCompat.OooO0o oooO0o : oooO0OO.f7822OooO00o) {
                File fileOooO0Oo = o000oOoO.OooO0Oo(context);
                if (fileOooO0Oo == null) {
                    return null;
                }
                try {
                    if (!o000oOoO.OooO0O0(fileOooO0Oo, resources, oooO0o.f7827OooO0o)) {
                        return null;
                    }
                    if (!OooO0oO(objNewInstance, fileOooO0Oo.getPath(), oooO0o.f7824OooO0O0, oooO0o.f7825OooO0OO)) {
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
                Object objNewInstance2 = Array.newInstance(f28170OooO0O0, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f28174OooO0o0.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p071o000O0o.Oooo0
    public Typeface OooO0O0(Context context, @NonNull Oooo000[] oooo000Arr, int i) {
        File file;
        if (oooo000Arr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(OooO0o(oooo000Arr, i).f28075OooO00o, "r", null);
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
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
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
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
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
