package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.common.util.concurrent.OooOO0O;
import p115o00O00oO.o00O0O;
import p117o00O0OOo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Worker extends OooO0OO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o00000O<OooO0OO.OooO00o> f11484OooO0oo;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00000O f11485OooO0Oo;

        public OooO00o(o00000O o00000o) {
            this.f11485OooO0Oo = o00000o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Worker.this.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
            } catch (Throwable th) {
                this.f11485OooO0Oo.OooOO0(th);
            }
        }
    }

    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.OooO0OO
    @NonNull
    public final OooOO0O<o00O0O> OooO00o() {
        o00000O o00000o = new o00000O();
        this.f11478OooO0o0.f11489OooO0OO.execute(new OooO00o(o00000o));
        return o00000o;
    }

    @Override // androidx.work.OooO0OO
    @NonNull
    public final o00000O OooO0Oo() {
        this.f11484OooO0oo = new o00000O<>();
        this.f11478OooO0o0.f11489OooO0OO.execute(new OooO0o(this));
        return this.f11484OooO0oo;
    }

    @NonNull
    @WorkerThread
    public abstract OooO0OO.OooO00o OooO0oO();
}
