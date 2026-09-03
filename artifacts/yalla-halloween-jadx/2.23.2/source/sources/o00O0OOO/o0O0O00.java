package o00O0OOO;

import android.content.Context;
import java.util.UUID;
import p117o00O0OOo.o00000;
import p117o00O0OOo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000O f36303OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ p115o00O00oO.o00O0O f36304OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UUID f36305OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Context f36306OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o000OOo f36307OooO0oo;

    public o0O0O00(o000OOo o000ooo2, o00000O o00000o, UUID uuid, p115o00O00oO.o00O0O o00o0o2, Context context) {
        this.f36307OooO0oo = o000ooo2;
        this.f36303OooO0Oo = o00000o;
        this.f36305OooO0o0 = uuid;
        this.f36304OooO0o = o00o0o2;
        this.f36306OooO0oO = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f36303OooO0Oo.f36334OooO0Oo instanceof o00000.OooO0O0)) {
                String string = this.f36305OooO0o0.toString();
                o00O0OO.o00Ooo o00oooOooO0oo = this.f36307OooO0oo.f36296OooO0OO.OooO0oo(string);
                if (o00oooOooO0oo == null || o00oooOooO0oo.f36217OooO0O0.OooO00o()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((oo00o.o00Oo0) this.f36307OooO0oo.f36295OooO0O0).OooO(string, this.f36304OooO0o);
                this.f36306OooO0oO.startService(androidx.work.impl.foreground.OooO00o.OooO00o(this.f36306OooO0oO, o00O0OO.o0ooOOo.OooO00o(o00oooOooO0oo), this.f36304OooO0o));
            }
            this.f36303OooO0Oo.OooO(null);
        } catch (Throwable th) {
            this.f36303OooO0Oo.OooOO0(th);
        }
    }
}
