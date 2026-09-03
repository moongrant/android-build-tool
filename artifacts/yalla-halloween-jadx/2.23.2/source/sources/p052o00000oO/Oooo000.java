package p052o00000oO;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class Oooo000 extends OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Method f33496OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Class<?> f33497OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Constructor<?> f33498OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Method f33499OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Method f33500OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Method f33501OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Method f33502OooOO0o;

    public Oooo000() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodOooOOO0;
        Method methodOooOOO;
        Method method2;
        Method methodOooOOOO;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodOooOOO0 = OooOOO0(cls);
            methodOooOOO = OooOOO(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodOooOOOO = OooOOOO(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            methodOooOOO0 = null;
            methodOooOOO = null;
            method2 = null;
            methodOooOOOO = null;
        }
        this.f33497OooO0o = cls;
        this.f33498OooO0oO = constructor;
        this.f33499OooO0oo = methodOooOOO0;
        this.f33496OooO = methodOooOOO;
        this.f33500OooOO0 = method2;
        this.f33501OooOO0O = method;
        this.f33502OooOO0o = methodOooOOOO;
    }

    public static Method OooOOO(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public static Method OooOOO0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean OooO(Context context, Object obj, String str, int i, int i2, int i3, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f33499OooO0oo.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // p052o00000oO.OooOo00, p052o00000oO.o00O0O
    @Nullable
    public final Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0OO oooO0OO, Resources resources, int i) {
        Object objNewInstance;
        if (!OooOO0o()) {
            return super.OooO00o(context, oooO0OO, resources, i);
        }
        try {
            objNewInstance = this.f33498OooO0oO.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (FontResourcesParserCompat.OooO0o oooO0o : oooO0OO.f5291OooO00o) {
            if (!OooO(context, objNewInstance, oooO0o.f5292OooO00o, oooO0o.f5297OooO0o0, oooO0o.f5293OooO0O0, oooO0o.f5294OooO0OO ? 1 : 0, FontVariationAxis.fromFontVariationSettings(oooO0o.f5295OooO0Oo))) {
                try {
                    this.f33501OooOO0O.invoke(objNewInstance, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (OooOO0O(objNewInstance)) {
            return OooOO0(objNewInstance);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    @Override // p052o00000oO.OooOo00, p052o00000oO.o00O0O
    @Nullable
    public final Typeface OooO0O0(Context context, @NonNull o0000O0.Oooo000[] oooo000Arr, int i) {
        Object objNewInstance;
        Typeface typefaceOooOO0;
        boolean zBooleanValue;
        if (oooo000Arr.length < 1) {
            return null;
        }
        if (!OooOO0o()) {
            o0000O0.Oooo000 oooo000OooO0o = OooO0o(i, oooo000Arr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(oooo000OooO0o.f33567OooO00o, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(oooo000OooO0o.f33569OooO0OO).setItalic(oooo000OooO0o.f33570OooO0Oo).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (o0000O0.Oooo000 oooo000 : oooo000Arr) {
            if (oooo000.f33571OooO0o0 == 0) {
                Uri uri = oooo000.f33567OooO00o;
                if (!map.containsKey(uri)) {
                    map.put(uri, o00Oo0.OooO0o0(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        try {
            objNewInstance = this.f33498OooO0oO.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        int length = oooo000Arr.length;
        int i2 = 0;
        boolean z = false;
        while (true) {
            Method method = this.f33501OooOO0O;
            if (i2 >= length) {
                if (!z) {
                    try {
                        method.invoke(objNewInstance, new Object[0]);
                        return null;
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        return null;
                    }
                }
                if (OooOO0O(objNewInstance) && (typefaceOooOO0 = OooOO0(objNewInstance)) != null) {
                    return Typeface.create(typefaceOooOO0, i);
                }
                return null;
            }
            o0000O0.Oooo000 oooo001 = oooo000Arr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(oooo001.f33567OooO00o);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f33496OooO.invoke(objNewInstance, byteBuffer, Integer.valueOf(oooo001.f33568OooO0O0), null, Integer.valueOf(oooo001.f33569OooO0OO), Integer.valueOf(oooo001.f33570OooO0Oo ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused4) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    try {
                        method.invoke(objNewInstance, new Object[0]);
                        return null;
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                        return null;
                    }
                }
                z = true;
            }
            i2++;
            z = z;
        }
    }

    @Override // p052o00000oO.o00O0O
    @Nullable
    public final Typeface OooO0Oo(Context context, Resources resources, int i, String str, int i2) {
        Object objNewInstance;
        if (!OooOO0o()) {
            return super.OooO0Oo(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.f33498OooO0oO.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        if (!OooO(context, objNewInstance, str, 0, -1, -1, null)) {
            try {
                this.f33501OooOO0O.invoke(objNewInstance, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (OooOO0O(objNewInstance)) {
            return OooOO0(objNewInstance);
        }
        return null;
    }

    @Nullable
    public Typeface OooOO0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f33497OooO0o, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f33502OooOO0o.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean OooOO0O(Object obj) {
        try {
            return ((Boolean) this.f33500OooOO0.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean OooOO0o() {
        Method method = this.f33499OooO0oo;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public Method OooOOOO(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
