package p532o0o0Oo;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f54571OooO00o = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final char[] f54572OooO0O0 = new char[64];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static volatile Handler f54573OooO0OO;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f54574OooO00o;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f54574OooO00o = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54574OooO00o[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54574OooO00o[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54574OooO00o[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54574OooO00o[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean OooO(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static void OooO00o() {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean OooO0O0(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @TargetApi(19)
    public static int OooO0OO(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    @NonNull
    public static ArrayList OooO0Oo(@NonNull Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int OooO0o(int i, @Nullable Object obj) {
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static Handler OooO0o0() {
        if (f54573OooO0OO == null) {
            synchronized (o0000oo.class) {
                if (f54573OooO0OO == null) {
                    f54573OooO0OO = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f54573OooO0OO;
    }

    public static int OooO0oO(int i, boolean z) {
        return (i * 31) + (z ? 1 : 0);
    }

    public static boolean OooO0oo() {
        return !(Looper.myLooper() == Looper.getMainLooper());
    }
}
