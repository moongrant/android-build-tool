package p289o0O0Oo0;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.media3.session.o000O00;
import androidx.media3.session.o000O00O;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p286o0O0OOoO.o00Ooo;
import p286o0O0OOoO.o00oO0o;
import p287o0O0OOoo.o0OO00O;
import p292o0O0OoO.o0ooOOo;
import p293o0O0OoO0.OooOo00;
import p464o0OooO0.o00000OO;
import p464o0OooO0.o0000Ooo;
import p626o0ooO.o0OOO0o;
import p664o0oooOO.oO00OO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOo00 f41565OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f41566OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O0 f41567OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000oo f41568OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f41569OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public oO00OO0O f41570OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public oO00OO0O f41571OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00Ooo f41572OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0000 f41573OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @VisibleForTesting
    public final o0000Ooo f41574OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0OO00O f41575OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ExecutorService f41576OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00Ooo f41577OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooOOO0 f41578OooOOO0;

    public class OooO00o implements Callable<Boolean> {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() throws Exception {
            try {
                oO00OO0O oo00oo0o = o0O0O00.this.f41571OooO0o0;
                OooOo00 oooOo00 = (OooOo00) oo00oo0o.f59868OooO0O0;
                String str = (String) oo00oo0o.f59867OooO00o;
                oooOo00.getClass();
                boolean zDelete = new File(oooOo00.f41695OooO0O0, str).delete();
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

    public o0O0O00(o0OOO0o o0ooo0o2, o0000 o0000Var, o00oO0o o00oo0o2, o00000O0 o00000o1, o000O00 o000o01, o000O00O o000o00o2, OooOo00 oooOo00, ExecutorService executorService) {
        this.f41567OooO0O0 = o00000o1;
        o0ooo0o2.OooO00o();
        this.f41566OooO00o = o0ooo0o2.f57662OooO00o;
        this.f41573OooO0oo = o0000Var;
        this.f41577OooOOO = o00oo0o2;
        this.f41574OooOO0 = o000o01;
        this.f41575OooOO0O = o000o00o2;
        this.f41576OooOO0o = executorService;
        this.f41565OooO = oooOo00;
        this.f41578OooOOO0 = new OooOOO0(executorService);
        this.f41569OooO0Oo = System.currentTimeMillis();
        this.f41568OooO0OO = new o0000oo();
    }

    public static Task OooO00o(final o0O0O00 o0o0o00, o0ooOOo o0ooooo) {
        Task<Void> taskForException;
        if (!Boolean.TRUE.equals(o0o0o00.f41578OooOOO0.f41474OooO0Oo.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        o0o0o00.f41571OooO0o0.OooO00o();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                o0o0o00.f41574OooOO0.OooO00o(new o00000OO() { // from class: o0O0Oo0.o0Oo0oo
                    @Override // p464o0OooO0.o00000OO
                    public final void OooO00o(String str) {
                        o0O0O00 o0o0o01 = this.f41584OooO00o;
                        o0o0o01.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - o0o0o01.f41569OooO0Oo;
                        o00Ooo o00ooo2 = o0o0o01.f41572OooO0oO;
                        o00ooo2.getClass();
                        o00ooo2.f41549OooO0o0.OooO00o(new oo000o(o00ooo2, jCurrentTimeMillis, str));
                    }
                });
                o0o0o00.f41572OooO0oO.OooO0oO();
                p292o0O0OoO.o00Ooo o00ooo2 = (p292o0O0OoO.o00Ooo) o0ooooo;
                if (o00ooo2.OooO0O0().f41676OooO0O0.f41681OooO00o) {
                    if (!o0o0o00.f41572OooO0oO.OooO0Oo(o00ooo2)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    taskForException = o0o0o00.f41572OooO0oO.OooO0oo(o00ooo2.f41657OooO.get().getTask());
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
            o0o0o00.OooO0OO();
        }
    }

    public final void OooO0O0(p292o0O0OoO.o00Ooo o00ooo2) {
        Future<?> futureSubmit = this.f41576OooOO0o.submit(new oo0o0Oo(this, o00ooo2));
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
        this.f41578OooOOO0.OooO00o(new OooO00o());
    }
}
