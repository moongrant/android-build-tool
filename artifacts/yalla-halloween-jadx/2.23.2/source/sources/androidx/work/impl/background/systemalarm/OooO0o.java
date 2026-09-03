package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import o00O0OO.OooOo;
import o00O0OOO.o000000O;
import o00O0OOO.oo000o;
import oo00o.OooO;
import oo00o.o00000O0;
import oo00o.o00Oo0;
import oo00o.o0OOO0o;
import p115o00O00oO.o0Oo0oo;
import p119o00O0Oo0.o00O0O;
import p119o00O0Oo0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0o implements OooO {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f11530OooOOO0 = o0Oo0oo.OooO0o("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.OooO00o f11531OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f11532OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000000O f11533OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OoOo0 f11534OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00Oo0 f11535OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000O0 f11536OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f11537OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Intent f11538OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public OooO0OO f11539OooOO0o;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00O0O.OooO00o oooO00o;
            RunnableC0187OooO0o runnableC0187OooO0o;
            synchronized (OooO0o.this.f11537OooOO0) {
                OooO0o oooO0o = OooO0o.this;
                oooO0o.f11538OooOO0O = (Intent) oooO0o.f11537OooOO0.get(0);
            }
            Intent intent = OooO0o.this.f11538OooOO0O;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = OooO0o.this.f11538OooOO0O.getIntExtra("KEY_START_ID", 0);
                o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
                String str = OooO0o.f11530OooOOO0;
                o0oo0ooOooO0Oo.OooO00o(str, "Processing command " + OooO0o.this.f11538OooOO0O + ", " + intExtra);
                PowerManager.WakeLock wakeLockOooO00o = o00O0OOO.o0Oo0oo.OooO00o(OooO0o.this.f11532OooO0Oo, action + " (" + intExtra + ")");
                try {
                    o0Oo0oo.OooO0Oo().OooO00o(str, "Acquiring operation wake lock (" + action + ") " + wakeLockOooO00o);
                    wakeLockOooO00o.acquire();
                    OooO0o oooO0o2 = OooO0o.this;
                    oooO0o2.f11531OooO.OooO0O0(intExtra, oooO0o2.f11538OooOO0O, oooO0o2);
                    o0Oo0oo.OooO0Oo().OooO00o(str, "Releasing operation wake lock (" + action + ") " + wakeLockOooO00o);
                    wakeLockOooO00o.release();
                    OooO0o oooO0o3 = OooO0o.this;
                    oooO00o = ((o00O0O) oooO0o3.f11534OooO0o0).f36416OooO0OO;
                    runnableC0187OooO0o = new RunnableC0187OooO0o(oooO0o3);
                } catch (Throwable th) {
                    try {
                        o0Oo0oo o0oo0ooOooO0Oo2 = o0Oo0oo.OooO0Oo();
                        String str2 = OooO0o.f11530OooOOO0;
                        o0oo0ooOooO0Oo2.OooO0OO(str2, "Unexpected error in onHandleIntent", th);
                        o0Oo0oo.OooO0Oo().OooO00o(str2, "Releasing operation wake lock (" + action + ") " + wakeLockOooO00o);
                        wakeLockOooO00o.release();
                        OooO0o oooO0o4 = OooO0o.this;
                        oooO00o = ((o00O0O) oooO0o4.f11534OooO0o0).f36416OooO0OO;
                        runnableC0187OooO0o = new RunnableC0187OooO0o(oooO0o4);
                    } catch (Throwable th2) {
                        o0Oo0oo.OooO0Oo().OooO00o(OooO0o.f11530OooOOO0, "Releasing operation wake lock (" + action + ") " + wakeLockOooO00o);
                        wakeLockOooO00o.release();
                        OooO0o oooO0o5 = OooO0o.this;
                        ((o00O0O) oooO0o5.f11534OooO0o0).f36416OooO0OO.execute(new RunnableC0187OooO0o(oooO0o5));
                        throw th2;
                    }
                }
                oooO00o.execute(runnableC0187OooO0o);
            }
        }
    }

    public static class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0o f11541OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f11542OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Intent f11543OooO0o0;

        public OooO0O0(int i, @NonNull Intent intent, @NonNull OooO0o oooO0o) {
            this.f11541OooO0Oo = oooO0o;
            this.f11543OooO0o0 = intent;
            this.f11542OooO0o = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f11541OooO0Oo.OooO00o(this.f11542OooO0o, this.f11543OooO0o0);
        }
    }

    public interface OooO0OO {
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.OooO0o$OooO0o, reason: collision with other inner class name */
    public static class RunnableC0187OooO0o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0o f11544OooO0Oo;

        public RunnableC0187OooO0o(@NonNull OooO0o oooO0o) {
            this.f11544OooO0Oo = oooO0o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0o oooO0o = this.f11544OooO0Oo;
            oooO0o.getClass();
            o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
            String str = OooO0o.f11530OooOOO0;
            o0oo0ooOooO0Oo.OooO00o(str, "Checking if commands are complete.");
            OooO0o.OooO0O0();
            synchronized (oooO0o.f11537OooOO0) {
                if (oooO0o.f11538OooOO0O != null) {
                    o0Oo0oo.OooO0Oo().OooO00o(str, "Removing command " + oooO0o.f11538OooOO0O);
                    if (!((Intent) oooO0o.f11537OooOO0.remove(0)).equals(oooO0o.f11538OooOO0O)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    oooO0o.f11538OooOO0O = null;
                }
                oo000o oo000oVar = ((o00O0O) oooO0o.f11534OooO0o0).f36414OooO00o;
                if (!oooO0o.f11531OooO.OooO00o() && oooO0o.f11537OooOO0.isEmpty() && !oo000oVar.OooO0O0()) {
                    o0Oo0oo.OooO0Oo().OooO00o(str, "No more commands & intents.");
                    OooO0OO oooO0OO = oooO0o.f11539OooOO0o;
                    if (oooO0OO != null) {
                        ((SystemAlarmService) oooO0OO).OooO00o();
                    }
                } else if (!oooO0o.f11537OooOO0.isEmpty()) {
                    oooO0o.OooO0o0();
                }
            }
        }
    }

    public OooO0o(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f11532OooO0Oo = applicationContext;
        this.f11531OooO = new androidx.work.impl.background.systemalarm.OooO00o(applicationContext, new o0OOO0o());
        o00000O0 o00000o0OooO0Oo = o00000O0.OooO0Oo(context);
        this.f11536OooO0oo = o00000o0OooO0Oo;
        this.f11533OooO0o = new o000000O(o00000o0OooO0Oo.f60220OooO0O0.f11469OooO0o0);
        o00Oo0 o00oo1 = o00000o0OooO0Oo.f60223OooO0o;
        this.f11535OooO0oO = o00oo1;
        this.f11534OooO0o0 = o00000o0OooO0Oo.f60222OooO0Oo;
        o00oo1.OooO00o(this);
        this.f11537OooOO0 = new ArrayList();
        this.f11538OooOO0O = null;
    }

    public static void OooO0O0() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @MainThread
    public final void OooO00o(int i, @NonNull Intent intent) {
        o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
        String str = f11530OooOOO0;
        o0oo0ooOooO0Oo.OooO00o(str, "Adding command " + intent + " (" + i + ")");
        OooO0O0();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o0Oo0oo.OooO0Oo().OooO0oO(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && OooO0OO()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f11537OooOO0) {
            boolean z = !this.f11537OooOO0.isEmpty();
            this.f11537OooOO0.add(intent);
            if (!z) {
                OooO0o0();
            }
        }
    }

    @MainThread
    public final boolean OooO0OO() {
        OooO0O0();
        synchronized (this.f11537OooOO0) {
            Iterator it = this.f11537OooOO0.iterator();
            while (it.hasNext()) {
                if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // oo00o.OooO
    public final void OooO0Oo(@NonNull OooOo oooOo, boolean z) {
        o00O0O.OooO00o oooO00o = ((o00O0O) this.f11534OooO0o0).f36416OooO0OO;
        String str = androidx.work.impl.background.systemalarm.OooO00o.f11508OooO0oo;
        Intent intent = new Intent(this.f11532OooO0Oo, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        androidx.work.impl.background.systemalarm.OooO00o.OooO0o0(intent, oooOo);
        oooO00o.execute(new OooO0O0(0, intent, this));
    }

    @MainThread
    public final void OooO0o0() {
        OooO0O0();
        PowerManager.WakeLock wakeLockOooO00o = o00O0OOO.o0Oo0oo.OooO00o(this.f11532OooO0Oo, "ProcessCommand");
        try {
            wakeLockOooO00o.acquire();
            ((o00O0O) this.f11536OooO0oo.f60222OooO0Oo).OooO00o(new OooO00o());
        } finally {
            wakeLockOooO00o.release();
        }
    }
}
