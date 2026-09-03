package androidx.appcompat.app;

import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Field f4566OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f4567OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static Class<?> f4568OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f4569OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static boolean f4570OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static Field f4571OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static Field f4572OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static boolean f4573OooO0oo;

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    @RequiresApi(16)
    public static void OooO00o(@NonNull Object obj) {
        if (!f4569OooO0Oo) {
            try {
                f4568OooO0OO = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f4569OooO0Oo = true;
        }
        Class<?> cls = f4568OooO0OO;
        if (cls == null) {
            return;
        }
        if (!f4570OooO0o) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f4571OooO0o0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f4570OooO0o = true;
        }
        Field field = f4571OooO0o0;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
        }
        if (longSparseArray != null) {
            OooO00o.OooO00o(longSparseArray);
        }
    }
}
