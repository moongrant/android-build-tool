package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f3776OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mCamerasLock")
    public final LinkedHashMap f3777OooO0O0 = new LinkedHashMap();

    public o0OO00O() {
        new HashSet();
    }

    @NonNull
    public final LinkedHashSet<CameraInternal> OooO00o() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.f3776OooO00o) {
            linkedHashSet = new LinkedHashSet<>((Collection<? extends CameraInternal>) this.f3777OooO0O0.values());
        }
        return linkedHashSet;
    }

    public final void OooO0O0(@NonNull o0OOO0o o0ooo0o2) throws InitializationException {
        synchronized (this.f3776OooO00o) {
            try {
                for (String str : o0ooo0o2.OooO0OO()) {
                    p028Oooo0oO.o00O0O0.OooO00o("CameraRepository", "Added camera: " + str);
                    this.f3777OooO0O0.put(str, o0ooo0o2.OooO0O0(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }
}
