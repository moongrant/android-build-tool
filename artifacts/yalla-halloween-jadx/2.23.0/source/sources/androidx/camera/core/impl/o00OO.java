package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o00OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00OO f3727OooO0O0 = new o00OO(new ArrayMap());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, Object> f3728OooO00o;

    public o00OO(@NonNull ArrayMap arrayMap) {
        this.f3728OooO00o = arrayMap;
    }

    @Nullable
    public final Object OooO00o(@NonNull String str) {
        return this.f3728OooO00o.get(str);
    }

    @NonNull
    public final Set<String> OooO0O0() {
        return this.f3728OooO00o.keySet();
    }

    @NonNull
    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
