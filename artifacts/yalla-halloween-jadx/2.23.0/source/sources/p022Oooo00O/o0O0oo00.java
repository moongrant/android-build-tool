package p022Oooo00O;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p023Oooo00o.o0OOOO00;
import p023Oooo00o.o0oo0000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O0oo00 extends o0oO0O0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f785OooO00o;

    @RequiresApi(21)
    public static class OooO00o extends o0oO0O0o.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final CameraCaptureSession.StateCallback f786OooO00o;

        public OooO00o(@NonNull List<CameraCaptureSession.StateCallback> list) {
            this.f786OooO00o = list.isEmpty() ? new oo0o0O0() : list.size() == 1 ? list.get(0) : new o00O0OO0(list);
        }

        @Override // Oooo00O.o0oO0O0o.OooO00o
        public final void OooOO0(@NonNull o0O0OOOo o0o0oooo) {
            this.f786OooO00o.onActive(o0o0oooo.OooO0oO().f921OooO00o.f953OooO00o);
        }

        @Override // Oooo00O.o0oO0O0o.OooO00o
        @RequiresApi(api = 26)
        public final void OooOO0O(@NonNull o0O0OOOo o0o0oooo) {
            o0oo0000.OooO0O0(this.f786OooO00o, o0o0oooo.OooO0oO().f921OooO00o.f953OooO00o);
        }

        @Override // Oooo00O.o0oO0O0o.OooO00o
        public final void OooOO0o(@NonNull o0oO0O0o o0oo0o0o2) {
            this.f786OooO00o.onClosed(o0oo0o0o2.OooO0oO().f921OooO00o.f953OooO00o);
        }

        @Override // Oooo00O.o0oO0O0o.OooO00o
        public final void OooOOO(@NonNull o0O0OOOo o0o0oooo) {
            this.f786OooO00o.onConfigured(o0o0oooo.OooO0oO().f921OooO00o.f953OooO00o);
        }

        @Override // Oooo00O.o0oO0O0o.OooO00o
        public final void OooOOO0(@NonNull o0oO0O0o o0oo0o0o2) {
            this.f786OooO00o.onConfigureFailed(o0oo0o0o2.OooO0oO().f921OooO00o.f953OooO00o);
        }

        @Override // Oooo00O.o0oO0O0o.OooO00o
        public final void OooOOOO(@NonNull o0O0OOOo o0o0oooo) {
            this.f786OooO00o.onReady(o0o0oooo.OooO0oO().f921OooO00o.f953OooO00o);
        }

        @Override // Oooo00O.o0oO0O0o.OooO00o
        public final void OooOOOo(@NonNull o0oO0O0o o0oo0o0o2) {
        }

        @Override // Oooo00O.o0oO0O0o.OooO00o
        @RequiresApi(api = 23)
        public final void OooOOo0(@NonNull o0O0OOOo o0o0oooo, @NonNull Surface surface) {
            o0OOOO00.OooO00o(this.f786OooO00o, o0o0oooo.OooO0oO().f921OooO00o.f953OooO00o, surface);
        }
    }

    public o0O0oo00(@NonNull List<o0oO0O0o.OooO00o> list) {
        ArrayList arrayList = new ArrayList();
        this.f785OooO00o = arrayList;
        arrayList.addAll(list);
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public final void OooOO0(@NonNull o0O0OOOo o0o0oooo) {
        Iterator it = this.f785OooO00o.iterator();
        while (it.hasNext()) {
            ((o0oO0O0o.OooO00o) it.next()).OooOO0(o0o0oooo);
        }
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    @RequiresApi(api = 26)
    public final void OooOO0O(@NonNull o0O0OOOo o0o0oooo) {
        Iterator it = this.f785OooO00o.iterator();
        while (it.hasNext()) {
            ((o0oO0O0o.OooO00o) it.next()).OooOO0O(o0o0oooo);
        }
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public final void OooOO0o(@NonNull o0oO0O0o o0oo0o0o2) {
        Iterator it = this.f785OooO00o.iterator();
        while (it.hasNext()) {
            ((o0oO0O0o.OooO00o) it.next()).OooOO0o(o0oo0o0o2);
        }
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public final void OooOOO(@NonNull o0O0OOOo o0o0oooo) {
        Iterator it = this.f785OooO00o.iterator();
        while (it.hasNext()) {
            ((o0oO0O0o.OooO00o) it.next()).OooOOO(o0o0oooo);
        }
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public final void OooOOO0(@NonNull o0oO0O0o o0oo0o0o2) {
        Iterator it = this.f785OooO00o.iterator();
        while (it.hasNext()) {
            ((o0oO0O0o.OooO00o) it.next()).OooOOO0(o0oo0o0o2);
        }
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public final void OooOOOO(@NonNull o0O0OOOo o0o0oooo) {
        Iterator it = this.f785OooO00o.iterator();
        while (it.hasNext()) {
            ((o0oO0O0o.OooO00o) it.next()).OooOOOO(o0o0oooo);
        }
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    public final void OooOOOo(@NonNull o0oO0O0o o0oo0o0o2) {
        Iterator it = this.f785OooO00o.iterator();
        while (it.hasNext()) {
            ((o0oO0O0o.OooO00o) it.next()).OooOOOo(o0oo0o0o2);
        }
    }

    @Override // Oooo00O.o0oO0O0o.OooO00o
    @RequiresApi(api = 23)
    public final void OooOOo0(@NonNull o0O0OOOo o0o0oooo, @NonNull Surface surface) {
        Iterator it = this.f785OooO00o.iterator();
        while (it.hasNext()) {
            ((o0oO0O0o.OooO00o) it.next()).OooOOo0(o0o0oooo, surface);
        }
    }
}
