package p028Oooo0oO;

import androidx.annotation.RequiresApi;
import androidx.camera.core.OooOO0O;
import androidx.camera.core.OooOOO0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OO0O0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicBoolean f1145OooO0oO;

    public o00OO0O0(OooOOO0 oooOOO0) {
        super(oooOOO0);
        this.f1145OooO0oO = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.OooOO0O, java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f1145OooO0oO.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
