package p420o0Oo0ooO;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.picasso.o00oO0o;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class oOOoOOO0 implements oO00OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap<String, Bitmap> f39808OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39809OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39810OooO0OO;

    public oOOoOOO0(Context context) {
        StringBuilder sb = o00oO0o.f19821OooO00o;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int largeMemoryClass = (((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7;
        if (largeMemoryClass <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.f39809OooO0O0 = largeMemoryClass;
        this.f39808OooO00o = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final Bitmap OooO00o(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            Bitmap bitmap = this.f39808OooO00o.get(str);
            if (bitmap != null) {
                return bitmap;
            }
            return null;
        }
    }
}
