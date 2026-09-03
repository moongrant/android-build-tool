package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.activity.OooOOOO;
import androidx.activity.Oooo000;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.appcompat.app.OooOO0;
import androidx.work.impl.background.systemalarm.OooO0OO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o00O0OO.OooOo;
import o00O0OO.o00Ooo;
import o00O0OO0.o000oOoO;
import o00O0OOO.o000000O;
import o00O0OOO.oo000o;
import oo00o.o0ooOOo;
import p037OoooOo0.o000O0o;
import p115o00O00oO.o0Oo0oo;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO implements o00O0O0O.OooO0OO, o000000O.OooO00o {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final String f11517OooOOOo = o0Oo0oo.OooO0o("DelayMetCommandHandler");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Object f11518OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f11519OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOo f11520OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f11521OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0o f11522OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00O0O0O.OooO0o f11523OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f11524OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final oo000o f11525OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o00O0O.OooO00o f11526OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f11527OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f11528OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final o0ooOOo f11529OooOOOO;

    public OooO0OO(@NonNull Context context, int i, @NonNull OooO0o oooO0o, @NonNull o0ooOOo o0ooooo) {
        this.f11519OooO0Oo = context;
        this.f11521OooO0o0 = i;
        this.f11522OooO0oO = oooO0o;
        this.f11520OooO0o = o0ooooo.f60300OooO00o;
        this.f11529OooOOOO = o0ooooo;
        o000oOoO o000oooo2 = oooO0o.f11536OooO0oo.f60227OooOO0;
        o00O0O o00o0o2 = (o00O0O) oooO0o.f11534OooO0o0;
        this.f11525OooOO0O = o00o0o2.f36414OooO00o;
        this.f11526OooOO0o = o00o0o2.f36416OooO0OO;
        this.f11523OooO0oo = new o00O0O0O.OooO0o(o000oooo2, this);
        this.f11527OooOOO = false;
        this.f11524OooOO0 = 0;
        this.f11518OooO = new Object();
    }

    public static void OooO0O0(OooO0OO oooO0OO) {
        OooOo oooOo = oooO0OO.f11520OooO0o;
        String str = oooOo.f36202OooO00o;
        int i = oooO0OO.f11524OooOO0;
        String str2 = f11517OooOOOo;
        if (i >= 2) {
            o0Oo0oo.OooO0Oo().OooO00o(str2, "Already stopped work for " + str);
            return;
        }
        oooO0OO.f11524OooOO0 = 2;
        o0Oo0oo.OooO0Oo().OooO00o(str2, "Stopping work for WorkSpec " + str);
        String str3 = OooO00o.f11508OooO0oo;
        Context context = oooO0OO.f11519OooO0Oo;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        OooO00o.OooO0o0(intent, oooOo);
        int i2 = oooO0OO.f11521OooO0o0;
        OooO0o oooO0o = oooO0OO.f11522OooO0oO;
        OooO0o.OooO0O0 oooO0O0 = new OooO0o.OooO0O0(i2, intent, oooO0o);
        o00O0O.OooO00o oooO00o = oooO0OO.f11526OooOO0o;
        oooO00o.execute(oooO0O0);
        if (!oooO0o.f11535OooO0oO.OooO0o(oooOo.f36202OooO00o)) {
            o0Oo0oo.OooO0Oo().OooO00o(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        o0Oo0oo.OooO0Oo().OooO00o(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        OooO00o.OooO0o0(intent2, oooOo);
        oooO00o.execute(new OooO0o.OooO0O0(i2, intent2, oooO0o));
    }

    @Override // o00O0OOO.o000000O.OooO00o
    public final void OooO00o(@NonNull OooOo oooOo) {
        o0Oo0oo.OooO0Oo().OooO00o(f11517OooOOOo, "Exceeded time limits on execution for " + oooOo);
        this.f11525OooOO0O.execute(new OooOOOO(this, 1));
    }

    @Override // o00O0O0O.OooO0OO
    public final void OooO0OO(@NonNull ArrayList arrayList) {
        this.f11525OooOO0O.execute(new Oooo000(this, 1));
    }

    public final void OooO0Oo() {
        synchronized (this.f11518OooO) {
            this.f11523OooO0oo.OooO0o0();
            this.f11522OooO0oO.f11533OooO0o.OooO00o(this.f11520OooO0o);
            PowerManager.WakeLock wakeLock = this.f11528OooOOO0;
            if (wakeLock != null && wakeLock.isHeld()) {
                o0Oo0oo.OooO0Oo().OooO00o(f11517OooOOOo, "Releasing wakelock " + this.f11528OooOOO0 + "for WorkSpec " + this.f11520OooO0o);
                this.f11528OooOOO0.release();
            }
        }
    }

    @Override // o00O0O0O.OooO0OO
    public final void OooO0o(@NonNull List<o00Ooo> list) {
        Iterator<o00Ooo> it = list.iterator();
        while (it.hasNext()) {
            if (o00O0OO.o0ooOOo.OooO00o(it.next()).equals(this.f11520OooO0o)) {
                this.f11525OooOO0O.execute(new OooOO0(this, 2));
                return;
            }
        }
    }

    @WorkerThread
    public final void OooO0o0() {
        String str = this.f11520OooO0o.f36202OooO00o;
        this.f11528OooOOO0 = o00O0OOO.o0Oo0oo.OooO00o(this.f11519OooO0Oo, p022Oooo00O.OooOO0.OooO00o(o000O0o.OooO0O0(str, " ("), this.f11521OooO0o0, ")"));
        o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
        String str2 = "Acquiring wakelock " + this.f11528OooOOO0 + "for WorkSpec " + str;
        String str3 = f11517OooOOOo;
        o0oo0ooOooO0Oo.OooO00o(str3, str2);
        this.f11528OooOOO0.acquire();
        o00Ooo o00oooOooO0oo = this.f11522OooO0oO.f11536OooO0oo.f60221OooO0OO.OooOo0().OooO0oo(str);
        if (o00oooOooO0oo == null) {
            this.f11525OooOO0O.execute(new Runnable() { // from class: o00O0O00.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    OooO0OO.OooO0O0(this.f36175OooO0Oo);
                }
            });
            return;
        }
        boolean zOooO0O0 = o00oooOooO0oo.OooO0O0();
        this.f11527OooOOO = zOooO0O0;
        if (zOooO0O0) {
            this.f11523OooO0oo.OooO0Oo(Collections.singletonList(o00oooOooO0oo));
            return;
        }
        o0Oo0oo.OooO0Oo().OooO00o(str3, "No constraints for " + str);
        OooO0o(Collections.singletonList(o00oooOooO0oo));
    }

    public final void OooO0oO(boolean z) {
        o0Oo0oo o0oo0ooOooO0Oo = o0Oo0oo.OooO0Oo();
        StringBuilder sb = new StringBuilder("onExecuted ");
        OooOo oooOo = this.f11520OooO0o;
        sb.append(oooOo);
        sb.append(", ");
        sb.append(z);
        o0oo0ooOooO0Oo.OooO00o(f11517OooOOOo, sb.toString());
        OooO0Oo();
        int i = this.f11521OooO0o0;
        OooO0o oooO0o = this.f11522OooO0oO;
        o00O0O.OooO00o oooO00o = this.f11526OooOO0o;
        Context context = this.f11519OooO0Oo;
        if (z) {
            String str = OooO00o.f11508OooO0oo;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            OooO00o.OooO0o0(intent, oooOo);
            oooO00o.execute(new OooO0o.OooO0O0(i, intent, oooO0o));
        }
        if (this.f11527OooOOO) {
            String str2 = OooO00o.f11508OooO0oo;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            oooO00o.execute(new OooO0o.OooO0O0(i, intent2, oooO0o));
        }
    }
}
