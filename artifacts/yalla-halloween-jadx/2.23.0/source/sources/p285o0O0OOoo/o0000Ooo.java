package p285o0O0OOoo;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0O0OOOo.OooO0OO;
import p203o00o0o0o.o000OO00;
import p203o00o0o0o.o000OOo0;
import p281o0O0O0oO.OooOO0;
import p283o0O0OOo.OooOO0O;
import p284o0O0OOoO.OooOOO0;
import p286o0O0Oo.OooOo00;
import p291o0O0OoO0.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOo00 f42137OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f42138OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OO f42139OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O00 f42140OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f42141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0000O00 f42142OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0000O00 f42143OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0O0O00 f42144OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000O000 f42145OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @VisibleForTesting
    public final OooOOO0 f42146OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O f42147OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ExecutorService f42148OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o0O0OOOo.OooO00o f42149OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o0OoOo0 f42150OooOOO0;

    public class OooO00o implements Callable<Boolean> {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() throws Exception {
            try {
                o0000O00 o0000o00 = o0000Ooo.this.f42143OooO0o0;
                OooOo00 oooOo00 = o0000o00.f42127OooO0O0;
                oooOo00.getClass();
                boolean zDelete = new File(oooOo00.f42242OooO0O0, o0000o00.f42126OooO00o).delete();
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

    public o0000Ooo(OooOO0 oooOO1, o000O000 o000o001, OooO0OO oooO0OO, o000OO o000oo2, o000OO00 o000oo01, o000OOo0 o000ooo1, OooOo00 oooOo00, ExecutorService executorService) {
        this.f42139OooO0O0 = o000oo2;
        oooOO1.OooO00o();
        this.f42138OooO00o = oooOO1.f41949OooO00o;
        this.f42145OooO0oo = o000o001;
        this.f42149OooOOO = oooO0OO;
        this.f42146OooOO0 = o000oo01;
        this.f42147OooOO0O = o000ooo1;
        this.f42148OooOO0o = executorService;
        this.f42137OooO = oooOo00;
        this.f42150OooOOO0 = new o0OoOo0(executorService);
        this.f42141OooO0Oo = System.currentTimeMillis();
        this.f42140OooO0OO = new o000O00();
    }

    public static Task OooO00o(final o0000Ooo o0000ooo, p291o0O0OoO0.o0000Ooo o0000ooo2) {
        Task<Void> taskForException;
        if (!Boolean.TRUE.equals(o0000ooo.f42150OooOOO0.f42226OooO0Oo.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        o0000ooo.f42143OooO0o0.OooO00o();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                o0000ooo.f42146OooOO0.OooO00o(new p284o0O0OOoO.OooOO0O() { // from class: o0O0OOoo.o00000O0
                    @Override // p284o0O0OOoO.OooOO0O
                    public final void OooO00o(String str) {
                        o0000Ooo o0000ooo3 = this.f42120OooO00o;
                        o0000ooo3.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - o0000ooo3.f42141OooO0Oo;
                        o0O0O00 o0o0o00 = o0000ooo3.f42144OooO0oO;
                        o0o0o00.getClass();
                        o0o0o00.f42198OooO0o0.OooO00o(new o000OOo(o0o0o00, jCurrentTimeMillis, str));
                    }
                });
                o0000ooo.f42144OooO0oO.OooO0oO();
                o00000O0 o00000o1 = (o00000O0) o0000ooo2;
                if (o00000o1.OooO0O0().f42286OooO0O0.f42291OooO00o) {
                    if (!o0000ooo.f42144OooO0oO.OooO0Oo(o00000o1)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    taskForException = o0000ooo.f42144OooO0oO.OooO0oo(o00000o1.f42296OooO.get().getTask());
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
            o0000ooo.OooO0OO();
        }
    }

    public final void OooO0O0(o00000O0 o00000o1) {
        Future<?> futureSubmit = this.f42148OooOO0o.submit(new o00000OO(this, o00000o1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void OooO0OO() {
        this.f42150OooOOO0.OooO00o(new OooO00o());
    }
}
