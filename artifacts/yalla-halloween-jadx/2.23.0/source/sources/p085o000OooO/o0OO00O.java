package p085o000OooO;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p084o000Ooo0.o000oOoO;
import p094o000o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f35151OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f35152OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f35153OooO0o0;

    public o0OO00O(oo0o0Oo oo0o0oo, o0000O00 o0000o00, String str) {
        this.f35152OooO0o = oo0o0oo;
        this.f35151OooO0Oo = o0000o00;
        this.f35153OooO0o0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f35153OooO0o0;
        oo0o0Oo oo0o0oo = this.f35152OooO0o;
        try {
            try {
                ListenableWorker.OooO00o oooO00o = (ListenableWorker.OooO00o) this.f35151OooO0Oo.get();
                if (oooO00o == null) {
                    o000oOoO.OooO0OO().OooO0O0(oo0o0Oo.f35170OooOo0O, String.format("%s returned a null result. Treating it as a failure.", oo0o0oo.f35175OooO0oO.f35264OooO0OO), new Throwable[0]);
                } else {
                    o000oOoO.OooO0OO().OooO00o(oo0o0Oo.f35170OooOo0O, String.format("%s returned a %s result.", oo0o0oo.f35175OooO0oO.f35264OooO0OO, oooO00o), new Throwable[0]);
                    oo0o0oo.f35177OooOO0 = oooO00o;
                }
            } catch (InterruptedException e) {
                e = e;
                o000oOoO.OooO0OO().OooO0O0(oo0o0Oo.f35170OooOo0O, String.format("%s failed because it threw an exception/error", str), e);
            } catch (CancellationException e2) {
                o000oOoO.OooO0OO().OooO0Oo(oo0o0Oo.f35170OooOo0O, String.format("%s was cancelled", str), e2);
            } catch (ExecutionException e3) {
                e = e3;
                o000oOoO.OooO0OO().OooO0O0(oo0o0Oo.f35170OooOo0O, String.format("%s failed because it threw an exception/error", str), e);
            }
            oo0o0oo.OooO0OO();
        } catch (Throwable th) {
            oo0o0oo.OooO0OO();
            throw th;
        }
    }
}
