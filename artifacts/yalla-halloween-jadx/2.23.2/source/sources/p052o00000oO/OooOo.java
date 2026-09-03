package p052o00000oO;

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
import o0000O0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOo extends o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Class<?> f33487OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Constructor<?> f33488OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Method f33489OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Method f33490OooO0Oo;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f33488OooO0O0 = constructor;
        f33487OooO00o = cls;
        f33489OooO0OO = method2;
        f33490OooO0Oo = method;
    }

    public static boolean OooO0oO(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f33489OooO0OO.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // p052o00000oO.o00O0O
    @Nullable
    public final Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0OO oooO0OO, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f33488OooO0O0.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (FontResourcesParserCompat.OooO0o oooO0o : oooO0OO.f5291OooO00o) {
            int i2 = oooO0o.f5296OooO0o;
            File fileOooO0Oo = o00Oo0.OooO0Oo(context);
            if (fileOooO0Oo == null) {
                map = null;
            } else {
                try {
                    if (o00Oo0.OooO0O0(fileOooO0Oo, resources, i2)) {
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
            if (map == null || !OooO0oO(objNewInstance, map, oooO0o.f5297OooO0o0, oooO0o.f5293OooO0O0, oooO0o.f5294OooO0OO)) {
                return null;
            }
        }
        try {
            Object objNewInstance2 = Array.newInstance(f33487OooO00o, 1);
            Array.set(objNewInstance2, 0, objNewInstance);
            return (Typeface) f33490OooO0Oo.invoke(null, objNewInstance2);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // p052o00000oO.o00O0O
    @Nullable
    public final Typeface OooO0O0(Context context, @NonNull Oooo000[] oooo000Arr, int i) {
        Object objNewInstance;
        Typeface typeface;
        try {
            objNewInstance = f33488OooO0O0.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        p190o00o0O.OooOo oooOo = new p190o00o0O.OooOo();
        for (Oooo000 oooo000 : oooo000Arr) {
            Uri uri = oooo000.f33567OooO00o;
            ByteBuffer byteBufferOooO0o0 = (ByteBuffer) oooOo.getOrDefault(uri, null);
            if (byteBufferOooO0o0 == null) {
                byteBufferOooO0o0 = o00Oo0.OooO0o0(context, uri);
                oooOo.put(uri, byteBufferOooO0o0);
            }
            if (byteBufferOooO0o0 == null || !OooO0oO(objNewInstance, byteBufferOooO0o0, oooo000.f33568OooO0O0, oooo000.f33569OooO0OO, oooo000.f33570OooO0Oo)) {
                return null;
            }
        }
        try {
            Object objNewInstance2 = Array.newInstance(f33487OooO00o, 1);
            Array.set(objNewInstance2, 0, objNewInstance);
            typeface = (Typeface) f33490OooO0Oo.invoke(null, objNewInstance2);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }
}
