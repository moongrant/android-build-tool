package o0O0OOO0;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p289o0O0OOoO.o0000Ooo;
import p289o0O0OOoO.o0000oo;
import p641o0ooO0oo.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O<Context> f35629OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O<o0O0OOOo.OooO0o> f35630OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O<SchedulerConfig> f35631OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O<o0000Ooo> f35632OooO0Oo;

    public OooOOO(o000O o000o, o000O o000o2, o000O o000o3) {
        o0000oo o0000ooVar = o0000oo.OooO00o.f35704OooO00o;
        this.f35629OooO00o = o000o;
        this.f35630OooO0O0 = o000o2;
        this.f35631OooO0OO = o000o3;
        this.f35632OooO0Oo = o0000ooVar;
    }

    @Override // p641o0ooO0oo.o000O
    public final Object get() {
        Context context = this.f35629OooO00o.get();
        o0O0OOOo.OooO0o oooO0o = this.f35630OooO0O0.get();
        SchedulerConfig schedulerConfig = this.f35631OooO0OO.get();
        this.f35632OooO0Oo.get();
        return new o0O0OOO.OooO0O0(context, oooO0o, schedulerConfig);
    }
}
