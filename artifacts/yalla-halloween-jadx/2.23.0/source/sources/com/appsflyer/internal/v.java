package com.appsflyer.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v {
    public final boolean AFInAppEventParameterName;

    @NonNull
    public final String AFInAppEventType;

    @NonNull
    public final Map<String, String> AFKeystoreWrapper;

    @NonNull
    public final String valueOf;

    @Nullable
    public final byte[] values;

    public v() {
    }

    public v(String str, byte[] bArr, String str2, Map<String, String> map) {
        this.AFInAppEventType = str;
        this.values = bArr;
        this.valueOf = str2;
        this.AFKeystoreWrapper = map;
        this.AFInAppEventParameterName = false;
    }

    public static Map<String, String> AFInAppEventType(@NonNull Context context) {
        HashMap map = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = context.getResources().getConfiguration().screenLayout & 15;
            map.put("x_px", String.valueOf(displayMetrics.widthPixels));
            map.put("y_px", String.valueOf(displayMetrics.heightPixels));
            map.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            map.put("size", String.valueOf(i));
            map.put("xdp", String.valueOf(displayMetrics.xdpi));
            map.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("Couldn't aggregate screen stats: ", th);
        }
        return map;
    }
}
