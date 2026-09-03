package p039OoooOoo;

import OooOO0O.OooO0OO;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00Oo0;
import java.util.concurrent.atomic.AtomicBoolean;
import p033OoooO0O.o00oO0o;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0 extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f1742OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooO00o f1743OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ SessionConfig.OooO0O0 f1744OooO0OO;

    public o0O00o0(AtomicBoolean atomicBoolean, o00O000.OooO00o oooO00o, SessionConfig.OooO0O0 oooO0O0) {
        this.f1742OooO00o = atomicBoolean;
        this.f1743OooO0O0 = oooO00o;
        this.f1744OooO0OO = oooO0O0;
    }

    @Override // androidx.camera.core.impl.o000oOoO
    public final void OooO0O0(@NonNull o00Oo0 o00oo1) {
        Object objOooO00o;
        AtomicBoolean atomicBoolean = this.f1742OooO00o;
        if (atomicBoolean.get() || (objOooO00o = o00oo1.OooO0O0().OooO00o("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) objOooO00o).intValue();
        o00O000.OooO00o oooO00o = this.f1743OooO0O0;
        if (iIntValue == oooO00o.hashCode() && oooO00o.OooO0O0(null) && !atomicBoolean.getAndSet(true)) {
            o00oO0o.OooO0OO().execute(new OooO0OO(1, this, this.f1744OooO0OO));
        }
    }
}
