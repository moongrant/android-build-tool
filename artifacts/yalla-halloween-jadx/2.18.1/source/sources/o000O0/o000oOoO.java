package o000O0;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO<T> implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public Callable<T> f28080Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NonNull
    public o000OO0O.OooO00o<T> f28081Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public Handler f28082Oooo0oo;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000OO0O.OooO00o f28083Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Object f28084Oooo0oO;

        public OooO00o(o000OO0O.OooO00o oooO00o, Object obj) {
            this.f28083Oooo0o = oooO00o;
            this.f28084Oooo0oO = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f28083Oooo0o.accept(this.f28084Oooo0oO);
        }
    }

    public o000oOoO(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull o000OO0O.OooO00o<T> oooO00o) {
        this.f28080Oooo0o = callable;
        this.f28081Oooo0oO = oooO00o;
        this.f28082Oooo0oo = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T tCall;
        try {
            tCall = this.f28080Oooo0o.call();
        } catch (Exception unused) {
            tCall = null;
        }
        this.f28082Oooo0oo.post(new OooO00o(this.f28081Oooo0oO, tCall));
    }
}
