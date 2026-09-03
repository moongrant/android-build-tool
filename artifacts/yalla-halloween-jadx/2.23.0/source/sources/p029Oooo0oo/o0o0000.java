package p029Oooo0oo;

import androidx.camera.core.ImageCapture;
import com.google.common.util.concurrent.OooO00o;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o000OO.OooOOO0;
import p028Oooo0oO.o00O0O0;
import p045Oooooo.o0000Ooo;
import p045Oooooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1339OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1340OooO0o0;

    public /* synthetic */ o0o0000(int i, Object obj, Object obj2) {
        this.f1338OooO0Oo = i;
        this.f1340OooO0o0 = obj;
        this.f1339OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1338OooO0Oo;
        Object obj = this.f1339OooO0o;
        Object obj2 = this.f1340OooO0o0;
        switch (i) {
            case 0:
                ImageCapture.OooOOO0 oooOOO0 = (ImageCapture.OooOOO0) obj;
                ImageCapture.OooOO0 oooOO0OooO0o = ((o0oo0000) obj2).OooO0o();
                Objects.requireNonNull(oooOO0OooO0o);
                Objects.requireNonNull(oooOOO0);
                oooOO0OooO0o.OooO0O0(oooOOO0);
                break;
            default:
                o0000Ooo.OooO0OO oooO0OO = (o0000Ooo.OooO0OO) obj2;
                OooO00o oooO00o = (OooO00o) obj;
                oooO0OO.getClass();
                if (!oooO00o.cancel(true)) {
                    OooOOO0.OooO0o(null, oooO00o.isDone());
                    try {
                        ((o000OO0O) oooO00o.get()).cancel();
                    } catch (InterruptedException | CancellationException | ExecutionException e) {
                        o00O0O0.OooO0oo(o0000Ooo.this.f1898OooO00o, "Unable to cancel the input buffer: " + e);
                        return;
                    }
                }
                break;
        }
    }
}
