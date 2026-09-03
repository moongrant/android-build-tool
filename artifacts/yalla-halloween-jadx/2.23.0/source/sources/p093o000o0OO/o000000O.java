package p093o000o0OO;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import androidx.work.ListenableWorker;
import java.util.UUID;
import p084o000Ooo0.OooOOO;
import p084o000Ooo0.OooOOO0;
import p084o000Ooo0.o000oOoO;
import p091o000o0O.o0Oo0oo;
import p094o000o0Oo.o0000O00;
import p096o000o0o0.o0000O0;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000000O implements Runnable {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f35311OooOO0 = o000oOoO.OooO0o0("WorkForegroundRunnable");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000O0 f35312OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000O00<Void> f35313OooO0Oo = new o0000O00<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0Oo0oo f35314OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f35315OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ListenableWorker f35316OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOOO f35317OooO0oo;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000O00 f35318OooO0Oo;

        public OooO00o(o0000O00 o0000o00) {
            this.f35318OooO0Oo = o0000o00;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35318OooO0Oo.OooOO0O(o000000O.this.f35316OooO0oO.OooO00o());
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000O00 f35320OooO0Oo;

        public OooO0O0(o0000O00 o0000o00) {
            this.f35320OooO0Oo = o0000o00;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            o000000O o000000o2 = o000000O.this;
            try {
                OooOOO0 oooOOO0 = (OooOOO0) this.f35320OooO0Oo.get();
                if (oooOOO0 == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", o000000o2.f35314OooO0o.f35264OooO0OO));
                }
                o000oOoO.OooO0OO().OooO00o(o000000O.f35311OooOO0, String.format("Updating notification for %s", o000000o2.f35314OooO0o.f35264OooO0OO), new Throwable[0]);
                ListenableWorker listenableWorker = o000000o2.f35316OooO0oO;
                listenableWorker.f8375OooO0oo = true;
                o0000O00<Void> o0000o00 = o000000o2.f35313OooO0Oo;
                OooOOO oooOOO = o000000o2.f35317OooO0oo;
                Context context = o000000o2.f35315OooO0o0;
                UUID uuid = listenableWorker.f8373OooO0o0.f8393OooO00o;
                o00000O0 o00000o1 = (o00000O0) oooOOO;
                o00000o1.getClass();
                o0000O00 o0000o01 = new o0000O00();
                ((o0000O0O) o00000o1.f35322OooO00o).OooO00o(new o00000(o00000o1, o0000o01, uuid, oooOOO0, context));
                o0000o00.OooOO0O(o0000o01);
            } catch (Throwable th) {
                o000000o2.f35313OooO0Oo.OooOO0(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public o000000O(@NonNull Context context, @NonNull o0Oo0oo o0oo0oo2, @NonNull ListenableWorker listenableWorker, @NonNull OooOOO oooOOO, @NonNull o0000O0 o0000o1) {
        this.f35315OooO0o0 = context;
        this.f35314OooO0o = o0oo0oo2;
        this.f35316OooO0oO = listenableWorker;
        this.f35317OooO0oo = oooOOO;
        this.f35312OooO = o0000o1;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f35314OooO0o.f35278OooOOo0 || BuildCompat.OooO0O0()) {
            this.f35313OooO0Oo.OooO0oo(null);
            return;
        }
        o0000O00 o0000o00 = new o0000O00();
        o0000O0O o0000o0o2 = (o0000O0O) this.f35312OooO;
        o0000o0o2.f35391OooO0OO.execute(new OooO00o(o0000o00));
        o0000o00.OooO(new OooO0O0(o0000o00), o0000o0o2.f35391OooO0OO);
    }
}
