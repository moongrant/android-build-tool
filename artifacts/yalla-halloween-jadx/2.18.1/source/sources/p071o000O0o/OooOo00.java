package p071o000O0o;

import OooO00o.OooO00o;
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
import o000O0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooOo00 extends OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Method f28182OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Class<?> f28183OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Constructor<?> f28184OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Method f28185OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Method f28186OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Method f28187OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Method f28188OooOOO0;

    public OooOo00() throws NoSuchMethodException {
        Method methodOooOOo0;
        Method method;
        Constructor<?> constructor;
        Method methodOooOOOO;
        Method methodOooOOOo;
        Method method2;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            methodOooOOOO = OooOOOO(cls2);
            methodOooOOOo = OooOOOo(cls2);
            method2 = cls2.getMethod("freeze", new Class[0]);
            method = cls2.getMethod("abortCreation", new Class[0]);
            methodOooOOo0 = OooOOo0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to collect necessary methods for class ");
            sbOooO0o0.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sbOooO0o0.toString(), e);
            methodOooOOo0 = null;
            method = null;
            constructor = null;
            methodOooOOOO = null;
            methodOooOOOo = null;
            method2 = null;
        }
        this.f28183OooO0oO = cls;
        this.f28184OooO0oo = constructor;
        this.f28182OooO = methodOooOOOO;
        this.f28185OooOO0 = methodOooOOOo;
        this.f28186OooOO0O = method2;
        this.f28187OooOO0o = method;
        this.f28188OooOOO0 = methodOooOOo0;
    }

    @Nullable
    private Object OooOOO() {
        try {
            return this.f28184OooO0oo.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void OooO(Object obj) {
        try {
            this.f28187OooOO0o.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // p071o000O0o.OooOOO, p071o000O0o.Oooo0
    @Nullable
    public final Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0OO oooO0OO, Resources resources, int i) {
        if (!OooOOO0()) {
            return super.OooO00o(context, oooO0OO, resources, i);
        }
        Object objOooOOO = OooOOO();
        if (objOooOOO == null) {
            return null;
        }
        for (FontResourcesParserCompat.OooO0o oooO0o : oooO0OO.f7822OooO00o) {
            if (!OooOO0(context, objOooOOO, oooO0o.f7823OooO00o, oooO0o.f7828OooO0o0, oooO0o.f7824OooO0O0, oooO0o.f7825OooO0OO ? 1 : 0, FontVariationAxis.fromFontVariationSettings(oooO0o.f7826OooO0Oo))) {
                OooO(objOooOOO);
                return null;
            }
        }
        if (OooOO0o(objOooOOO)) {
            return OooOO0O(objOooOOO);
        }
        return null;
    }

    @Override // p071o000O0o.OooOOO, p071o000O0o.Oooo0
    @Nullable
    public final Typeface OooO0O0(Context context, @NonNull Oooo000[] oooo000Arr, int i) {
        Typeface typefaceOooOO0O;
        boolean zBooleanValue;
        if (oooo000Arr.length < 1) {
            return null;
        }
        if (!OooOOO0()) {
            Oooo000 oooo000OooO0o = OooO0o(oooo000Arr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(oooo000OooO0o.f28075OooO00o, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(oooo000OooO0o.f28077OooO0OO).setItalic(oooo000OooO0o.f28078OooO0Oo).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (Oooo000 oooo000 : oooo000Arr) {
            if (oooo000.f28079OooO0o0 == 0) {
                Uri uri = oooo000.f28075OooO00o;
                if (!map.containsKey(uri)) {
                    map.put(uri, o000oOoO.OooO0o0(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objOooOOO = OooOOO();
        if (objOooOOO == null) {
            return null;
        }
        boolean z = false;
        for (Oooo000 oooo001 : oooo000Arr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(oooo001.f28075OooO00o);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f28185OooOO0.invoke(objOooOOO, byteBuffer, Integer.valueOf(oooo001.f28076OooO0O0), null, Integer.valueOf(oooo001.f28077OooO0OO), Integer.valueOf(oooo001.f28078OooO0Oo ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    OooO(objOooOOO);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            OooO(objOooOOO);
            return null;
        }
        if (OooOO0o(objOooOOO) && (typefaceOooOO0O = OooOO0O(objOooOOO)) != null) {
            return Typeface.create(typefaceOooOO0O, i);
        }
        return null;
    }

    @Override // p071o000O0o.Oooo0
    @Nullable
    public final Typeface OooO0Oo(Context context, Resources resources, int i, String str, int i2) {
        if (!OooOOO0()) {
            return super.OooO0Oo(context, resources, i, str, i2);
        }
        Object objOooOOO = OooOOO();
        if (objOooOOO == null) {
            return null;
        }
        if (!OooOO0(context, objOooOOO, str, 0, -1, -1, null)) {
            OooO(objOooOOO);
            return null;
        }
        if (OooOO0o(objOooOOO)) {
            return OooOO0O(objOooOOO);
        }
        return null;
    }

    public final boolean OooOO0(Context context, Object obj, String str, int i, int i2, int i3, @Nullable FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f28182OooO.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Nullable
    public Typeface OooOO0O(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f28183OooO0oO, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f28188OooOOO0.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean OooOO0o(Object obj) {
        try {
            return ((Boolean) this.f28186OooOO0O.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean OooOOO0() {
        if (this.f28182OooO == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f28182OooO != null;
    }

    public final Method OooOOOO(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final Method OooOOOo(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method OooOOo0(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
