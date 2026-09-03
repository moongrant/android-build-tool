package p107o000ooO0;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p102o000oo.o0OoOo0;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f29982Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f29983Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f29984Oooo0oo;

    public o0OOO0o(o0Oo0oo o0oo0oo2, o00OOOO0 o00oooo1, String str) {
        this.f29984Oooo0oo = o0oo0oo2;
        this.f29982Oooo0o = o00oooo1;
        this.f29983Oooo0oO = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        try {
            try {
                ListenableWorker.OooO00o oooO00o = (ListenableWorker.OooO00o) this.f29982Oooo0o.get();
                if (oooO00o == null) {
                    o0OoOo0.OooO0OO().OooO0O0(o0Oo0oo.f29985OooooOo, String.format("%s returned a null result. Treating it as a failure.", this.f29984Oooo0oo.f29992OoooO00.f30154OooO0OO), new Throwable[0]);
                } else {
                    o0OoOo0.OooO0OO().OooO00o(o0Oo0oo.f29985OooooOo, String.format("%s returned a %s result.", this.f29984Oooo0oo.f29992OoooO00.f30154OooO0OO, oooO00o), new Throwable[0]);
                    this.f29984Oooo0oo.f29990OoooO = oooO00o;
                }
            } catch (InterruptedException e) {
                e = e;
                o0OoOo0.OooO0OO().OooO0O0(o0Oo0oo.f29985OooooOo, String.format("%s failed because it threw an exception/error", this.f29983Oooo0oO), e);
            } catch (CancellationException e2) {
                o0OoOo0.OooO0OO().OooO0Oo(o0Oo0oo.f29985OooooOo, String.format("%s was cancelled", this.f29983Oooo0oO), e2);
            } catch (ExecutionException e3) {
                e = e3;
                o0OoOo0.OooO0OO().OooO0O0(o0Oo0oo.f29985OooooOo, String.format("%s failed because it threw an exception/error", this.f29983Oooo0oO), e);
            }
            this.f29984Oooo0oo.OooO0OO();
        } catch (Throwable th) {
            this.f29984Oooo0oo.OooO0OO();
            throw th;
        }
    }
}
