package p039OoooOoo;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00Oo0;
import java.util.concurrent.atomic.AtomicBoolean;
import p028Oooo0oO.o00O00;
import p033OoooO0O.o00oO0o;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0000O extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f1694OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000Oo0.OooO00o f1695OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ SessionConfig.OooO0O0 f1696OooO0OO;

    public o0O0000O(AtomicBoolean atomicBoolean, o000Oo0.OooO00o oooO00o, SessionConfig.OooO0O0 oooO0O0) {
        this.f1694OooO00o = atomicBoolean;
        this.f1695OooO0O0 = oooO00o;
        this.f1696OooO0OO = oooO0O0;
    }

    @Override // androidx.camera.core.impl.o000oOoO
    public final void OooO0O0(@NonNull o00Oo0 o00oo1) {
        Object objOooO00o;
        AtomicBoolean atomicBoolean = this.f1694OooO00o;
        if (atomicBoolean.get() || (objOooO00o = o00oo1.OooO0O0().OooO00o("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) objOooO00o).intValue();
        o000Oo0.OooO00o oooO00o = this.f1695OooO0O0;
        if (iIntValue == oooO00o.hashCode() && oooO00o.OooO0O0(null) && !atomicBoolean.getAndSet(true)) {
            o00oO0o.OooO0OO().execute(new o00O00(1, this, this.f1696OooO0OO));
        }
    }
}
