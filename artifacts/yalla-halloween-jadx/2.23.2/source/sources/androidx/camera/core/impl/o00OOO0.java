package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o00OOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00OOO0 f3743OooO0O0 = new o00OOO0(new ArrayMap());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, Object> f3744OooO00o;

    public o00OOO0(@NonNull ArrayMap arrayMap) {
        this.f3744OooO00o = arrayMap;
    }

    @Nullable
    public final Object OooO00o(@NonNull String str) {
        return this.f3744OooO00o.get(str);
    }

    @NonNull
    public final Set<String> OooO0O0() {
        return this.f3744OooO00o.keySet();
    }

    @NonNull
    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
