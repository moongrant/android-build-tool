package oo00o;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f60211OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f60212OooO0o0;

    public o0000(o0000O00 o0000o00, String str) {
        this.f60212OooO0o0 = o0000o00;
        this.f60211OooO0Oo = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f60211OooO0Oo;
        o0000O00 o0000o00 = this.f60212OooO0o0;
        try {
            try {
                androidx.work.OooO0OO.OooO00o oooO00o = o0000o00.f60246OooOOoo.get();
                if (oooO00o == null) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0O0(o0000O00.f60230OooOo0, o0000o00.f60235OooO0oO.f36218OooO0OO + " returned a null result. Treating it as a failure.");
                } else {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(o0000O00.f60230OooOo0, o0000o00.f60235OooO0oO.f36218OooO0OO + " returned a " + oooO00o + ".");
                    o0000o00.f60237OooOO0 = oooO00o;
                }
            } catch (InterruptedException e) {
                e = e;
                p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0OO(o0000O00.f60230OooOo0, str + " failed because it threw an exception/error", e);
            } catch (CancellationException e2) {
                p115o00O00oO.o0Oo0oo o0oo0ooOooO0Oo = p115o00O00oO.o0Oo0oo.OooO0Oo();
                String str2 = o0000O00.f60230OooOo0;
                String str3 = str + " was cancelled";
                if (((o00O00oO.o0Oo0oo.OooO00o) o0oo0ooOooO0Oo).f36159OooO0OO <= 4) {
                    Log.i(str2, str3, e2);
                }
            } catch (ExecutionException e3) {
                e = e3;
                p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0OO(o0000O00.f60230OooOo0, str + " failed because it threw an exception/error", e);
            }
            o0000o00.OooO0O0();
        } catch (Throwable th) {
            o0000o00.OooO0O0();
            throw th;
        }
    }
}
