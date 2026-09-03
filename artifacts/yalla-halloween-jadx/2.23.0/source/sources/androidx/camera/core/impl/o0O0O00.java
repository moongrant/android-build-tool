package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.camera.core.concurrent.CameraCoordinator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O0O00 implements CameraCoordinator.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final StringBuilder f3756OooO00o = new StringBuilder();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f3757OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f3758OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public final CameraCoordinator f3759OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f3760OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("mLock")
    public final HashMap f3761OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public CameraInternal.State f3762OooO00o = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f3763OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0O0 f3764OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO f3765OooO0Oo;

        public OooO00o(@NonNull p033OoooO0O.o0O0O00 o0o0o00, @NonNull Oooo00O.o000OO.OooO0o oooO0o, @NonNull Oooo00O.o000OO.OooO0OO oooO0OO) {
            this.f3763OooO0O0 = o0o0o00;
            this.f3764OooO0OO = oooO0o;
            this.f3765OooO0Oo = oooO0OO;
        }
    }

    public interface OooO0O0 {
    }

    public interface OooO0OO {
    }

    public o0O0O00(@NonNull p027Oooo0o0.o00O00o0 o00o00o1) {
        Object obj = new Object();
        this.f3757OooO0O0 = obj;
        this.f3761OooO0o0 = new HashMap();
        this.f3758OooO0OO = 1;
        synchronized (obj) {
            this.f3759OooO0Oo = o00o00o1;
            this.f3760OooO0o = this.f3758OooO0OO;
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.OooO00o
    public final void OooO00o(int i, int i2) {
        synchronized (this.f3757OooO0O0) {
            boolean z = true;
            this.f3758OooO0OO = i2 == 2 ? 2 : 1;
            boolean z2 = i != 2 && i2 == 2;
            if (i != 2 || i2 == 2) {
                z = false;
            }
            if (z2 || z) {
                OooO0OO();
            }
        }
    }

    @Nullable
    @GuardedBy("mLock")
    public final OooO00o OooO0O0(@NonNull String str) {
        HashMap map = this.f3761OooO0o0;
        for (p028Oooo0oO.o000O0Oo o000o0oo2 : map.keySet()) {
            if (str.equals(((o0Oo0oo) o000o0oo2.OooO00o()).OooO0Oo())) {
                return (OooO00o) map.get(o000o0oo2);
            }
        }
        return null;
    }

    @GuardedBy("mLock")
    @WorkerThread
    public final void OooO0OO() {
        boolean zOooO0o0 = p028Oooo0oO.o00O0O0.OooO0o0("CameraStateRegistry");
        StringBuilder sb = this.f3756OooO00o;
        if (zOooO0o0) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.f3761OooO0o0.entrySet()) {
            if (p028Oooo0oO.o00O0O0.OooO0o0("CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((p028Oooo0oO.o000O0Oo) entry.getKey()).toString(), ((OooO00o) entry.getValue()).f3762OooO00o != null ? ((OooO00o) entry.getValue()).f3762OooO00o.toString() : "UNKNOWN"));
            }
            CameraInternal.State state = ((OooO00o) entry.getValue()).f3762OooO00o;
            if (state != null && state.OooO00o()) {
                i++;
            }
        }
        if (p028Oooo0oO.o00O0O0.OooO0o0("CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            sb.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.f3758OooO0OO)));
            p028Oooo0oO.o00O0O0.OooO00o("CameraStateRegistry", sb.toString());
        }
        this.f3760OooO0o = Math.max(this.f3758OooO0OO - i, 0);
    }

    public final boolean OooO0Oo(@NonNull p028Oooo0oO.o000O0Oo o000o0oo2) {
        boolean z;
        synchronized (this.f3757OooO0O0) {
            OooO00o oooO00o = (OooO00o) this.f3761OooO0o0.get(o000o0oo2);
            o000OO.OooOOO0.OooO0o0(oooO00o, "Camera must first be registered with registerCamera()");
            if (p028Oooo0oO.o00O0O0.OooO0o0("CameraStateRegistry")) {
                this.f3756OooO00o.setLength(0);
                StringBuilder sb = this.f3756OooO00o;
                Locale locale = Locale.US;
                Object[] objArr = new Object[4];
                objArr[0] = o000o0oo2;
                objArr[1] = Integer.valueOf(this.f3760OooO0o);
                CameraInternal.State state = oooO00o.f3762OooO00o;
                objArr[2] = Boolean.valueOf(state != null && state.OooO00o());
                objArr[3] = oooO00o.f3762OooO00o;
                sb.append(String.format(locale, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", objArr));
            }
            if (this.f3760OooO0o > 0) {
                oooO00o.f3762OooO00o = CameraInternal.State.OPENING;
                z = true;
            } else {
                CameraInternal.State state2 = oooO00o.f3762OooO00o;
                if (state2 != null && state2.OooO00o()) {
                    oooO00o.f3762OooO00o = CameraInternal.State.OPENING;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (p028Oooo0oO.o00O0O0.OooO0o0("CameraStateRegistry")) {
                StringBuilder sb2 = this.f3756OooO00o;
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[1];
                objArr2[0] = z ? "SUCCESS" : "FAIL";
                sb2.append(String.format(locale2, " --> %s", objArr2));
                p028Oooo0oO.o00O0O0.OooO00o("CameraStateRegistry", this.f3756OooO00o.toString());
            }
            if (z) {
                OooO0OO();
            }
        }
        return z;
    }

    public final boolean OooO0o0(@NonNull String str, @Nullable String str2) {
        synchronized (this.f3757OooO0O0) {
            boolean z = true;
            if (((p027Oooo0o0.o00O00o0) this.f3759OooO0Oo).f1103OooO0o0 != 2) {
                return true;
            }
            CameraInternal.State state = null;
            CameraInternal.State state2 = OooO0O0(str) != null ? OooO0O0(str).f3762OooO00o : null;
            if (str2 != null && OooO0O0(str2) != null) {
                state = OooO0O0(str2).f3762OooO00o;
            }
            CameraInternal.State state3 = CameraInternal.State.OPEN;
            boolean z2 = state3.equals(state2) || CameraInternal.State.CONFIGURED.equals(state2);
            boolean z3 = state3.equals(state) || CameraInternal.State.CONFIGURED.equals(state);
            if (!z2 || !z3) {
                z = false;
            }
            return z;
        }
    }
}
