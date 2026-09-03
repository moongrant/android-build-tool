package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap<String, Bitmap> f21740OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f21741OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f21742OooO0OO;

    public OooOo(Context context) {
        StringBuilder sb = o000000O.f21773OooO00o;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int largeMemoryClass = (((context.getApplicationInfo().flags & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * ZegoConstants.ErrorMask.RoomServerErrorMask) / 7;
        if (largeMemoryClass <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.f21741OooO0O0 = largeMemoryClass;
        this.f21740OooO00o = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final Bitmap OooO00o(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Bitmap bitmap = this.f21740OooO00o.get(str);
            if (bitmap != null) {
                return bitmap;
            }
            return null;
        }
    }

    public final synchronized int OooO0O0() {
        return this.f21742OooO0OO;
    }

    public final void OooO0OO(int i) {
        while (true) {
            synchronized (this) {
                if (this.f21742OooO0OO < 0 || (this.f21740OooO00o.isEmpty() && this.f21742OooO0OO != 0)) {
                    break;
                }
                if (this.f21742OooO0OO > i && !this.f21740OooO00o.isEmpty()) {
                    Map.Entry<String, Bitmap> next = this.f21740OooO00o.entrySet().iterator().next();
                    String key = next.getKey();
                    Bitmap value = next.getValue();
                    this.f21740OooO00o.remove(key);
                    this.f21742OooO0OO -= o000000O.OooO0Oo(value);
                }
                return;
            }
        }
        throw new IllegalStateException(OooOo.class.getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
