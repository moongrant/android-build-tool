package androidx.appcompat.app;

import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Field f2403OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f2404OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static Class<?> f2405OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f2406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static boolean f2407OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static Field f2408OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static Field f2409OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static boolean f2410OooO0oo;

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    @RequiresApi(16)
    public static void OooO00o(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!f2406OooO0Oo) {
            try {
                f2405OooO0OO = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2406OooO0Oo = true;
        }
        Class<?> cls = f2405OooO0OO;
        if (cls == null) {
            return;
        }
        if (!f2407OooO0o) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f2408OooO0o0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f2407OooO0o = true;
        }
        Field field = f2408OooO0o0;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            OooO00o.OooO00o(longSparseArray);
        }
    }
}
