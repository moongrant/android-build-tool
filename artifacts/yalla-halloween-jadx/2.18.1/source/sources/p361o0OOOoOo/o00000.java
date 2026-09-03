package p361o0OOOoOo;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0OOo000.OooOO0;
import p351o0OOOOo.OooOOO;
import p359o0OOOoO.Oooo0;
import p359o0OOOoO.o000oOoO;
import p366o0OOo00O.OooOO0O;
import p366o0OOo00O.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0 f38416OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38417OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O00 f38418OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000OO0 f38419OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f38420OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00000O f38421OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00000O f38422OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0OO00O f38423OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000OO f38424OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @VisibleForTesting
    public final o000oOoO f38425OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final p360o0OOOoO0.OooO0O0 f38426OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ExecutorService f38427OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final p354o0OOOo.OooOO0 f38428OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o000oOoO f38429OooOOO0;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOOOO f38430Oooo0o;

        public OooO00o(OooOOOO oooOOOO) {
            this.f38430Oooo0o = oooOOOO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00000.OooO00o(o00000.this, this.f38430Oooo0o);
        }
    }

    public class OooO0O0 implements Callable<Boolean> {
        public OooO0O0() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() throws Exception {
            try {
                boolean zDelete = o00000.this.f38422OooO0o0.OooO0O0().delete();
                if (!zDelete) {
                    Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                }
                return Boolean.valueOf(zDelete);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    public o00000(OooOOO oooOOO, o000OO o000oo2, p354o0OOOo.OooOO0 oooOO1, o0000O00 o0000o00, o000oOoO o000oooo2, p360o0OOOoO0.OooO0O0 oooO0O0, OooOO0 oooOO2, ExecutorService executorService) {
        this.f38418OooO0O0 = o0000o00;
        oooOOO.OooO00o();
        this.f38417OooO00o = oooOOO.f38263OooO00o;
        this.f38424OooO0oo = o000oo2;
        this.f38428OooOOO = oooOO1;
        this.f38425OooOO0 = o000oooo2;
        this.f38426OooOO0O = oooO0O0;
        this.f38427OooOO0o = executorService;
        this.f38416OooO = oooOO2;
        this.f38429OooOOO0 = new o000oOoO(executorService);
        this.f38420OooO0Oo = System.currentTimeMillis();
        this.f38419OooO0OO = new o0000OO0();
    }

    public static Task OooO00o(final o00000 o00000Var, OooOOOO oooOOOO) {
        Task<Void> taskForException;
        o00000Var.f38429OooOOO0.OooO00o();
        o00000Var.f38422OooO0o0.OooO00o();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                o00000Var.f38425OooOO0.OooO00o(new Oooo0() { // from class: o0OOOoOo.o000000
                    @Override // p359o0OOOoO.Oooo0
                    public final void OooO00o(String str) {
                        o00000 o00000Var2 = this.f38433OooO00o;
                        Objects.requireNonNull(o00000Var2);
                        long jCurrentTimeMillis = System.currentTimeMillis() - o00000Var2.f38420OooO0Oo;
                        o0OO00O o0oo00o2 = o00000Var2.f38423OooO0oO;
                        o0oo00o2.f38498OooO0Oo.OooO0O0(new oo0o0Oo(o0oo00o2, jCurrentTimeMillis, str));
                    }
                });
                OooOO0O oooOO0O = (OooOO0O) oooOOOO;
                if (oooOO0O.OooO0O0().f38623OooO0O0.f38628OooO00o) {
                    if (!o00000Var.f38423OooO0oO.OooO0o0(oooOO0O)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    taskForException = o00000Var.f38423OooO0oO.OooO0oO(oooOO0O.f38635OooO.get().getTask());
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    taskForException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                taskForException = Tasks.forException(e);
            }
            return taskForException;
        } finally {
            o00000Var.OooO0OO();
        }
    }

    public final void OooO0O0(OooOOOO oooOOOO) {
        Future<?> futureSubmit = this.f38427OooOO0o.submit(new OooO00o(oooOOOO));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void OooO0OO() {
        this.f38429OooOOO0.OooO0O0(new OooO0O0());
    }
}
