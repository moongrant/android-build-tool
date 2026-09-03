package p093o000o0OO;

import android.content.Context;
import androidx.work.WorkInfo$State;
import androidx.work.impl.foreground.OooO00o;
import java.util.UUID;
import p084o000Ooo0.OooOOO0;
import p085o000OooO.OooOo;
import p091o000o0O.oo0o0Oo;
import p094o000o0Oo.o0000O00;
import p094o000o0Oo.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f35304OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f35305OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UUID f35306OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Context f35307OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f35308OooO0oo;

    public o00000(o00000O0 o00000o1, o0000O00 o0000o00, UUID uuid, OooOOO0 oooOOO0, Context context) {
        this.f35308OooO0oo = o00000o1;
        this.f35304OooO0Oo = o0000o00;
        this.f35306OooO0o0 = uuid;
        this.f35305OooO0o = oooOOO0;
        this.f35307OooO0oO = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f35304OooO0Oo.f35363OooO0Oo instanceof o0000Ooo.OooO0O0)) {
                String string = this.f35306OooO0o0.toString();
                WorkInfo$State workInfo$StateOooO0o = ((oo0o0Oo) this.f35308OooO0oo.f35324OooO0OO).OooO0o(string);
                if (workInfo$StateOooO0o == null || workInfo$StateOooO0o.OooO00o()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((OooOo) this.f35308OooO0oo.f35323OooO0O0).OooO0oO(string, this.f35305OooO0o);
                this.f35307OooO0oO.startService(OooO00o.OooO00o(this.f35307OooO0oO, string, this.f35305OooO0o));
            }
            this.f35304OooO0Oo.OooO0oo(null);
        } catch (Throwable th) {
            this.f35304OooO0Oo.OooOO0(th);
        }
    }
}
