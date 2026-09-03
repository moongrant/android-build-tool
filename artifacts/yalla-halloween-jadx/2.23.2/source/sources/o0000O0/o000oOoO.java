package o0000O0;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO<T> implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Callable<T> f33572OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Handler f33573OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final o000OO.OooO00o<T> f33574OooO0o0;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000OO.OooO00o f33575OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Object f33576OooO0o0;

        public OooO00o(o000OO.OooO00o oooO00o, Object obj) {
            this.f33575OooO0Oo = oooO00o;
            this.f33576OooO0o0 = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f33575OooO0Oo.accept(this.f33576OooO0o0);
        }
    }

    public o000oOoO(@NonNull Handler handler, @NonNull OooOOO oooOOO, @NonNull OooOOOO oooOOOO) {
        this.f33572OooO0Oo = oooOOO;
        this.f33574OooO0o0 = oooOOOO;
        this.f33573OooO0o = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T tCall;
        try {
            tCall = this.f33572OooO0Oo.call();
        } catch (Exception unused) {
            tCall = null;
        }
        this.f33573OooO0o.post(new OooO00o(this.f33574OooO0o0, tCall));
    }
}
