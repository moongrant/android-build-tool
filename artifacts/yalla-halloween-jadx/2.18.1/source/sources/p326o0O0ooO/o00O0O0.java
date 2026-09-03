package p326o0O0ooO;

import android.content.Context;
import androidx.work.WorkInfo$State;
import androidx.work.impl.foreground.OooO00o;
import java.util.UUID;
import o00O0000.o00Oo0;
import p102o000oo.OooOOO;
import p107o000ooO0.OooOo;
import p236o00oOoo.o00OOO0O;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Context f36995Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f36996Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ UUID f36997Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO f36998Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00O0O0O f36999OoooO00;

    public o00O0O0(o00O0O0O o00o0o0o2, o00OOOO0 o00oooo1, UUID uuid, OooOOO oooOOO, Context context) {
        this.f36999OoooO00 = o00o0o0o2;
        this.f36996Oooo0o = o00oooo1;
        this.f36997Oooo0oO = uuid;
        this.f36998Oooo0oo = oooOOO;
        this.f36995Oooo = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f36996Oooo0o.f34032Oooo0o instanceof o00OOO0O.OooO0O0)) {
                String string = this.f36997Oooo0oO.toString();
                WorkInfo$State workInfo$StateOooO0o = ((o00Oo0) this.f36999OoooO00.f37013OooO0OO).OooO0o(string);
                if (workInfo$StateOooO0o == null || workInfo$StateOooO0o.OooO00o()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((OooOo) this.f36999OoooO00.f37012OooO0O0).OooO0o(string, this.f36998Oooo0oo);
                this.f36995Oooo.startService(OooO00o.OooO00o(this.f36995Oooo, string, this.f36998Oooo0oo));
            }
            this.f36996Oooo0o.OooOO0(null);
        } catch (Throwable th) {
            this.f36996Oooo0o.OooOO0O(th);
        }
    }
}
