package p022Oooo00O;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p033OoooO0O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Executor f651OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f652OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public final LinkedHashSet f653OooO0OO = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public final LinkedHashSet f654OooO0Oo = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("mLock")
    public final LinkedHashSet f656OooO0o0 = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f655OooO0o = new OooO00o();

    public class OooO00o extends CameraDevice.StateCallback {
        public OooO00o() {
        }

        public final void OooO00o() {
            ArrayList arrayListOooO0o0;
            synchronized (o00OOOOo.this.f652OooO0O0) {
                arrayListOooO0o0 = o00OOOOo.this.OooO0o0();
                o00OOOOo.this.f656OooO0o0.clear();
                o00OOOOo.this.f653OooO0OO.clear();
                o00OOOOo.this.f654OooO0Oo.clear();
            }
            Iterator it = arrayListOooO0o0.iterator();
            while (it.hasNext()) {
                ((o0oO0O0o) it.next()).OooO0Oo();
            }
        }

        public final void OooO0O0() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (o00OOOOo.this.f652OooO0O0) {
                linkedHashSet.addAll(o00OOOOo.this.f656OooO0o0);
                linkedHashSet.addAll(o00OOOOo.this.f653OooO0OO);
            }
            o00OOOOo.this.f651OooO00o.execute(new o00OOOO0(linkedHashSet, 0));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(@NonNull CameraDevice cameraDevice) {
            OooO00o();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            OooO0O0();
            OooO00o();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull CameraDevice cameraDevice, int i) {
            OooO0O0();
            OooO00o();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull CameraDevice cameraDevice) {
        }
    }

    public o00OOOOo(@NonNull o0O0O00 o0o0o00) {
        this.f651OooO00o = o0o0o00;
    }

    public final void OooO00o(@NonNull o0oO0O0o o0oo0o0o2) {
        o0oO0O0o o0oo0o0o3;
        Iterator it = OooO0o0().iterator();
        while (it.hasNext() && (o0oo0o0o3 = (o0oO0O0o) it.next()) != o0oo0o0o2) {
            o0oo0o0o3.OooO0Oo();
        }
    }

    @NonNull
    public final ArrayList OooO0O0() {
        ArrayList arrayList;
        synchronized (this.f652OooO0O0) {
            arrayList = new ArrayList(this.f653OooO0OO);
        }
        return arrayList;
    }

    @NonNull
    public final ArrayList OooO0OO() {
        ArrayList arrayList;
        synchronized (this.f652OooO0O0) {
            arrayList = new ArrayList(this.f654OooO0Oo);
        }
        return arrayList;
    }

    @NonNull
    public final ArrayList OooO0Oo() {
        ArrayList arrayList;
        synchronized (this.f652OooO0O0) {
            arrayList = new ArrayList(this.f656OooO0o0);
        }
        return arrayList;
    }

    public final void OooO0o(@NonNull o0oO0O0o o0oo0o0o2) {
        synchronized (this.f652OooO0O0) {
            this.f656OooO0o0.add(o0oo0o0o2);
        }
    }

    @NonNull
    public final ArrayList OooO0o0() {
        ArrayList arrayList;
        synchronized (this.f652OooO0O0) {
            arrayList = new ArrayList();
            arrayList.addAll(OooO0O0());
            arrayList.addAll(OooO0Oo());
        }
        return arrayList;
    }
}
