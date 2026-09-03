package p071o000O0o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import o000O0.Oooo000;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOOOO extends Oooo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Class<?> f28178OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Constructor<?> f28179OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Method f28180OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Method f28181OooO0o0;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f28179OooO0OO = constructor;
        f28178OooO0O0 = cls;
        f28180OooO0Oo = method2;
        f28181OooO0o0 = method;
    }

    public static boolean OooO0oO(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f28180OooO0Oo.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface OooO0oo(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f28178OooO0O0, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f28181OooO0o0.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p071o000O0o.Oooo0
    @Nullable
    public final Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0OO oooO0OO, Resources resources, int i) {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f28179OooO0OO.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (FontResourcesParserCompat.OooO0o oooO0o : oooO0OO.f7822OooO00o) {
            int i2 = oooO0o.f7827OooO0o;
            File fileOooO0Oo = o000oOoO.OooO0Oo(context);
            if (fileOooO0Oo == null) {
                map = null;
            } else {
                try {
                    if (o000oOoO.OooO0O0(fileOooO0Oo, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(fileOooO0Oo);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                fileOooO0Oo.delete();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            map = null;
                        }
                    } else {
                        fileOooO0Oo.delete();
                        map = null;
                    }
                } catch (Throwable th3) {
                    fileOooO0Oo.delete();
                    throw th3;
                }
            }
            if (map == null || !OooO0oO(objNewInstance, map, oooO0o.f7828OooO0o0, oooO0o.f7824OooO0O0, oooO0o.f7825OooO0OO)) {
                return null;
            }
        }
        return OooO0oo(objNewInstance);
    }

    @Override // p071o000O0o.Oooo0
    @Nullable
    public final Typeface OooO0O0(Context context, @NonNull Oooo000[] oooo000Arr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = f28179OooO0OO.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        o00oO0o o00oo0o2 = new o00oO0o();
        for (Oooo000 oooo000 : oooo000Arr) {
            Uri uri = oooo000.f28075OooO00o;
            ByteBuffer byteBufferOooO0o0 = (ByteBuffer) o00oo0o2.getOrDefault(uri, null);
            if (byteBufferOooO0o0 == null) {
                byteBufferOooO0o0 = o000oOoO.OooO0o0(context, uri);
                o00oo0o2.put(uri, byteBufferOooO0o0);
            }
            if (byteBufferOooO0o0 == null || !OooO0oO(objNewInstance, byteBufferOooO0o0, oooo000.f28076OooO0O0, oooo000.f28077OooO0OO, oooo000.f28078OooO0Oo)) {
                return null;
            }
        }
        Typeface typefaceOooO0oo = OooO0oo(objNewInstance);
        if (typefaceOooO0oo == null) {
            return null;
        }
        return Typeface.create(typefaceOooO0oo, i);
    }
}
