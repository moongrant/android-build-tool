package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.util.Collections;
import java.util.List;
import o00O0000.o00Oo0;
import p102o000oo.o0OoOo0;
import p107o000ooO0.OooOOOO;
import p109o000ooo.o00000OO;
import p109o000ooo.o0000Ooo;
import p326o0O0ooO.o00O0;
import p326o0O0ooO.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO implements o00000OO, OooOOOO, oo0o0O0.OooO0O0 {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final String f9790o000oOoO = o0OoOo0.OooO0o0("DelayMetCommandHandler");

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO0o f9791Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f9792Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f9793Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final String f9794Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f9795OoooO;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final o0000Ooo f9797OoooO00;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f9799OoooOO0 = false;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f9798OoooO0O = 0;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Object f9796OoooO0 = new Object();

    public OooO0OO(@NonNull Context context, int i, @NonNull String str, @NonNull OooO0o oooO0o) {
        this.f9792Oooo0o = context;
        this.f9793Oooo0oO = i;
        this.f9791Oooo = oooO0o;
        this.f9794Oooo0oo = str;
        this.f9797OoooO00 = new o0000Ooo(context, oooO0o.f9803Oooo0oO, this);
    }

    @Override // o0O0ooO.oo0o0O0.OooO0O0
    public final void OooO00o(@NonNull String str) {
        o0OoOo0.OooO0OO().OooO00o(f9790o000oOoO, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        OooO0oO();
    }

    @Override // p109o000ooo.o00000OO
    public final void OooO0O0(@NonNull List<String> list) {
        OooO0oO();
    }

    public final void OooO0OO() {
        synchronized (this.f9796OoooO0) {
            this.f9797OoooO00.OooO0OO();
            this.f9791Oooo.f9804Oooo0oo.OooO0O0(this.f9794Oooo0oo);
            PowerManager.WakeLock wakeLock = this.f9795OoooO;
            if (wakeLock != null && wakeLock.isHeld()) {
                o0OoOo0.OooO0OO().OooO00o(f9790o000oOoO, String.format("Releasing wakelock %s for WorkSpec %s", this.f9795OoooO, this.f9794Oooo0oo), new Throwable[0]);
                this.f9795OoooO.release();
            }
        }
    }

    @Override // p107o000ooO0.OooOOOO
    public final void OooO0Oo(@NonNull String str, boolean z) {
        o0OoOo0.OooO0OO().OooO00o(f9790o000oOoO, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        OooO0OO();
        if (z) {
            Intent intentOooO0OO = OooO00o.OooO0OO(this.f9792Oooo0o, this.f9794Oooo0oo);
            OooO0o oooO0o = this.f9791Oooo;
            oooO0o.OooO0o0(new OooO0o.OooO0O0(oooO0o, intentOooO0OO, this.f9793Oooo0oO));
        }
        if (this.f9799OoooOO0) {
            Intent intentOooO00o = OooO00o.OooO00o(this.f9792Oooo0o);
            OooO0o oooO0o2 = this.f9791Oooo;
            oooO0o2.OooO0o0(new OooO0o.OooO0O0(oooO0o2, intentOooO00o, this.f9793Oooo0oO));
        }
    }

    @Override // p109o000ooo.o00000OO
    public final void OooO0o(@NonNull List<String> list) {
        if (list.contains(this.f9794Oooo0oo)) {
            synchronized (this.f9796OoooO0) {
                if (this.f9798OoooO0O == 0) {
                    this.f9798OoooO0O = 1;
                    o0OoOo0.OooO0OO().OooO00o(f9790o000oOoO, String.format("onAllConstraintsMet for %s", this.f9794Oooo0oo), new Throwable[0]);
                    if (this.f9791Oooo.f9801Oooo.OooO0oO(this.f9794Oooo0oo, null)) {
                        this.f9791Oooo.f9804Oooo0oo.OooO00o(this.f9794Oooo0oo, this);
                    } else {
                        OooO0OO();
                    }
                } else {
                    o0OoOo0.OooO0OO().OooO00o(f9790o000oOoO, String.format("Already started work for %s", this.f9794Oooo0oo), new Throwable[0]);
                }
            }
        }
    }

    @WorkerThread
    public final void OooO0o0() {
        this.f9795OoooO = o00O0.OooO00o(this.f9792Oooo0o, String.format("%s (%s)", this.f9794Oooo0oo, Integer.valueOf(this.f9793Oooo0oO)));
        o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
        String str = f9790o000oOoO;
        o0oooo0OooO0OO.OooO00o(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f9795OoooO, this.f9794Oooo0oo), new Throwable[0]);
        this.f9795OoooO.acquire();
        o00O0000.o0OoOo0 o0oooo0OooO0oo = ((o00Oo0) this.f9791Oooo.f9807OoooO00.f29976OooO0OO.OooOo0O()).OooO0oo(this.f9794Oooo0oo);
        if (o0oooo0OooO0oo == null) {
            OooO0oO();
            return;
        }
        boolean zOooO0O0 = o0oooo0OooO0oo.OooO0O0();
        this.f9799OoooOO0 = zOooO0O0;
        if (zOooO0O0) {
            this.f9797OoooO00.OooO0O0(Collections.singletonList(o0oooo0OooO0oo));
        } else {
            o0OoOo0.OooO0OO().OooO00o(str, String.format("No constraints for %s", this.f9794Oooo0oo), new Throwable[0]);
            OooO0o(Collections.singletonList(this.f9794Oooo0oo));
        }
    }

    public final void OooO0oO() {
        synchronized (this.f9796OoooO0) {
            if (this.f9798OoooO0O < 2) {
                this.f9798OoooO0O = 2;
                o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
                String str = f9790o000oOoO;
                o0oooo0OooO0OO.OooO00o(str, String.format("Stopping work for WorkSpec %s", this.f9794Oooo0oo), new Throwable[0]);
                Context context = this.f9792Oooo0o;
                String str2 = this.f9794Oooo0oo;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                OooO0o oooO0o = this.f9791Oooo;
                oooO0o.OooO0o0(new OooO0o.OooO0O0(oooO0o, intent, this.f9793Oooo0oO));
                if (this.f9791Oooo.f9801Oooo.OooO0OO(this.f9794Oooo0oo)) {
                    o0OoOo0.OooO0OO().OooO00o(str, String.format("WorkSpec %s needs to be rescheduled", this.f9794Oooo0oo), new Throwable[0]);
                    Intent intentOooO0OO = OooO00o.OooO0OO(this.f9792Oooo0o, this.f9794Oooo0oo);
                    OooO0o oooO0o2 = this.f9791Oooo;
                    oooO0o2.OooO0o0(new OooO0o.OooO0O0(oooO0o2, intentOooO0OO, this.f9793Oooo0oO));
                } else {
                    o0OoOo0.OooO0OO().OooO00o(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f9794Oooo0oo), new Throwable[0]);
                }
            } else {
                o0OoOo0.OooO0OO().OooO00o(f9790o000oOoO, String.format("Already stopped work for %s", this.f9794Oooo0oo), new Throwable[0]);
            }
        }
    }
}
