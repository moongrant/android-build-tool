package p326o0O0ooO;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import androidx.work.ListenableWorker;
import java.util.Objects;
import java.util.UUID;
import p102o000oo.OooOOO;
import p102o000oo.OooOOOO;
import p102o000oo.o0OoOo0;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O0O00 implements Runnable {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final String f37000OoooO0O = o0OoOo0.OooO0o0("WorkForegroundRunnable");

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final ListenableWorker f37001Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00OOOO0<Void> f37002Oooo0o = new o00OOOO0<>();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Context f37003Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o00O0000.o0OoOo0 f37004Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o00O000.OooO00o f37005OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooOOOO f37006OoooO00;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f37007Oooo0o;

        public OooO00o(o00OOOO0 o00oooo1) {
            this.f37007Oooo0o = o00oooo1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f37007Oooo0o.OooOO0o(o00O0O00.this.f37001Oooo.OooO00o());
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f37009Oooo0o;

        public OooO0O0(o00OOOO0 o00oooo1) {
            this.f37009Oooo0o = o00oooo1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                OooOOO oooOOO = (OooOOO) this.f37009Oooo0o.get();
                if (oooOOO == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", o00O0O00.this.f37004Oooo0oo.f30154OooO0OO));
                }
                o0OoOo0.OooO0OO().OooO00o(o00O0O00.f37000OoooO0O, String.format("Updating notification for %s", o00O0O00.this.f37004Oooo0oo.f30154OooO0OO), new Throwable[0]);
                o00O0O00 o00o0o01 = o00O0O00.this;
                ListenableWorker listenableWorker = o00o0o01.f37001Oooo;
                listenableWorker.f9730OoooO00 = true;
                o00OOOO0<Void> o00oooo1 = o00o0o01.f37002Oooo0o;
                OooOOOO oooOOOO = o00o0o01.f37006OoooO00;
                Context context = o00o0o01.f37003Oooo0oO;
                UUID uuid = listenableWorker.f9728Oooo0oO.f9748OooO00o;
                o00O0O0O o00o0o0o2 = (o00O0O0O) oooOOOO;
                Objects.requireNonNull(o00o0o0o2);
                o00OOOO0 o00oooo2 = new o00OOOO0();
                ((o00O000.OooO0O0) o00o0o0o2.f37011OooO00o).OooO00o(new o00O0O0(o00o0o0o2, o00oooo2, uuid, oooOOO, context));
                o00oooo1.OooOO0o(o00oooo2);
            } catch (Throwable th) {
                o00O0O00.this.f37002Oooo0o.OooOO0O(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public o00O0O00(@NonNull Context context, @NonNull o00O0000.o0OoOo0 o0oooo1, @NonNull ListenableWorker listenableWorker, @NonNull OooOOOO oooOOOO, @NonNull o00O000.OooO00o oooO00o) {
        this.f37003Oooo0oO = context;
        this.f37004Oooo0oo = o0oooo1;
        this.f37001Oooo = listenableWorker;
        this.f37006OoooO00 = oooOOOO;
        this.f37005OoooO0 = oooO00o;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f37004Oooo0oo.f30168OooOOo0 || BuildCompat.OooO0O0()) {
            this.f37002Oooo0o.OooOO0(null);
            return;
        }
        o00OOOO0 o00oooo1 = new o00OOOO0();
        ((o00O000.OooO0O0) this.f37005OoooO0).f30116OooO0OO.execute(new OooO00o(o00oooo1));
        o00oooo1.OooO00o(new OooO0O0(o00oooo1), ((o00O000.OooO0O0) this.f37005OoooO0).f30116OooO0OO);
    }
}
