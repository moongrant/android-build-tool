package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.OooOOOO;
import p089o000o00O.o00O00o0;
import p089o000o00O.oo00o;
import p091o000o0O.o0Oo0oo;
import p091o000o0O.oo0o0Oo;
import p093o000o0OO.o000000;
import p093o000o0OO.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO implements o00O00o0, OooOOOO, o00000OO.OooO0O0 {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f8434OooOOO0 = o000oOoO.OooO0o0("DelayMetCommandHandler");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f8436OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f8437OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f8438OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0o f8439OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oo00o f8440OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f8442OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f8443OooOO0o = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f8441OooOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Object f8435OooO = new Object();

    public OooO0OO(@NonNull Context context, int i, @NonNull String str, @NonNull OooO0o oooO0o) {
        this.f8436OooO0Oo = context;
        this.f8438OooO0o0 = i;
        this.f8439OooO0oO = oooO0o;
        this.f8437OooO0o = str;
        this.f8440OooO0oo = new oo00o(context, oooO0o.f8448OooO0o0, this);
    }

    @Override // o000o0OO.o00000OO.OooO0O0
    public final void OooO00o(@NonNull String str) {
        o000oOoO.OooO0OO().OooO00o(f8434OooOOO0, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        OooO0oO();
    }

    @Override // p089o000o00O.o00O00o0
    public final void OooO0O0(@NonNull ArrayList arrayList) {
        OooO0oO();
    }

    public final void OooO0OO() {
        synchronized (this.f8435OooO) {
            this.f8440OooO0oo.OooO0Oo();
            this.f8439OooO0oO.f8447OooO0o.OooO0O0(this.f8437OooO0o);
            PowerManager.WakeLock wakeLock = this.f8442OooOO0O;
            if (wakeLock != null && wakeLock.isHeld()) {
                o000oOoO.OooO0OO().OooO00o(f8434OooOOO0, String.format("Releasing wakelock %s for WorkSpec %s", this.f8442OooOO0O, this.f8437OooO0o), new Throwable[0]);
                this.f8442OooOO0O.release();
            }
        }
    }

    @WorkerThread
    public final void OooO0Oo() {
        String str = this.f8437OooO0o;
        this.f8442OooOO0O = o000000.OooO00o(this.f8436OooO0Oo, String.format("%s (%s)", str, Integer.valueOf(this.f8438OooO0o0)));
        o000oOoO o000ooooOooO0OO = o000oOoO.OooO0OO();
        Object[] objArr = {this.f8442OooOO0O, str};
        String str2 = f8434OooOOO0;
        o000ooooOooO0OO.OooO00o(str2, String.format("Acquiring wakelock %s for WorkSpec %s", objArr), new Throwable[0]);
        this.f8442OooOO0O.acquire();
        o0Oo0oo o0oo0ooOooO0oo = ((oo0o0Oo) this.f8439OooO0oO.f8450OooO0oo.f35160OooO0OO.OooOo00()).OooO0oo(str);
        if (o0oo0ooOooO0oo == null) {
            OooO0oO();
            return;
        }
        boolean zOooO0O0 = o0oo0ooOooO0oo.OooO0O0();
        this.f8443OooOO0o = zOooO0O0;
        if (zOooO0O0) {
            this.f8440OooO0oo.OooO0OO(Collections.singletonList(o0oo0ooOooO0oo));
        } else {
            o000oOoO.OooO0OO().OooO00o(str2, String.format("No constraints for %s", str), new Throwable[0]);
            OooO0o(Collections.singletonList(str));
        }
    }

    @Override // p089o000o00O.o00O00o0
    public final void OooO0o(@NonNull List<String> list) {
        if (list.contains(this.f8437OooO0o)) {
            synchronized (this.f8435OooO) {
                if (this.f8441OooOO0 == 0) {
                    this.f8441OooOO0 = 1;
                    o000oOoO.OooO0OO().OooO00o(f8434OooOOO0, String.format("onAllConstraintsMet for %s", this.f8437OooO0o), new Throwable[0]);
                    if (this.f8439OooO0oO.f8449OooO0oO.OooO0oo(this.f8437OooO0o, null)) {
                        this.f8439OooO0oO.f8447OooO0o.OooO00o(this.f8437OooO0o, this);
                    } else {
                        OooO0OO();
                    }
                } else {
                    o000oOoO.OooO0OO().OooO00o(f8434OooOOO0, String.format("Already started work for %s", this.f8437OooO0o), new Throwable[0]);
                }
            }
        }
    }

    @Override // p085o000OooO.OooOOOO
    public final void OooO0o0(@NonNull String str, boolean z) {
        o000oOoO.OooO0OO().OooO00o(f8434OooOOO0, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        OooO0OO();
        int i = this.f8438OooO0o0;
        OooO0o oooO0o = this.f8439OooO0oO;
        Context context = this.f8436OooO0Oo;
        if (z) {
            oooO0o.OooO0o(new OooO0o.OooO0O0(i, OooO00o.OooO0O0(context, this.f8437OooO0o), oooO0o));
        }
        if (this.f8443OooOO0o) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            oooO0o.OooO0o(new OooO0o.OooO0O0(i, intent, oooO0o));
        }
    }

    public final void OooO0oO() {
        synchronized (this.f8435OooO) {
            if (this.f8441OooOO0 < 2) {
                this.f8441OooOO0 = 2;
                o000oOoO o000ooooOooO0OO = o000oOoO.OooO0OO();
                String str = f8434OooOOO0;
                o000ooooOooO0OO.OooO00o(str, String.format("Stopping work for WorkSpec %s", this.f8437OooO0o), new Throwable[0]);
                Context context = this.f8436OooO0Oo;
                String str2 = this.f8437OooO0o;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                OooO0o oooO0o = this.f8439OooO0oO;
                oooO0o.OooO0o(new OooO0o.OooO0O0(this.f8438OooO0o0, intent, oooO0o));
                if (this.f8439OooO0oO.f8449OooO0oO.OooO0Oo(this.f8437OooO0o)) {
                    o000oOoO.OooO0OO().OooO00o(str, String.format("WorkSpec %s needs to be rescheduled", this.f8437OooO0o), new Throwable[0]);
                    Intent intentOooO0O0 = OooO00o.OooO0O0(this.f8436OooO0Oo, this.f8437OooO0o);
                    OooO0o oooO0o2 = this.f8439OooO0oO;
                    oooO0o2.OooO0o(new OooO0o.OooO0O0(this.f8438OooO0o0, intentOooO0O0, oooO0o2));
                } else {
                    o000oOoO.OooO0OO().OooO00o(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f8437OooO0o), new Throwable[0]);
                }
            } else {
                o000oOoO.OooO0OO().OooO00o(f8434OooOOO0, String.format("Already stopped work for %s", this.f8437OooO0o), new Throwable[0]);
            }
        }
    }
}
