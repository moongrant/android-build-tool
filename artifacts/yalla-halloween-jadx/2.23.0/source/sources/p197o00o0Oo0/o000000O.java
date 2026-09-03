package p197o00o0Oo0;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p192o00o0OO.o0000OO0;
import p196o00o0Oo.o000O0o;
import p196o00o0Oo.o00O00;
import p198o00o0OoO.o00;
import p201o00o0o00.OooOOO0;
import p201o00o0o00.OooOo00;
import p625o0ooO000.o000;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O implements o0000OO0<o00O00> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000<Context> f39043OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000<o00> f39044OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000<SchedulerConfig> f39045OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000<OooOOO0> f39046OooO0Oo;

    public o000000O(o000 o000Var, o000 o000Var2, o000OOo o000ooo2) {
        OooOo00 oooOo00 = OooOo00.OooO00o.f39145OooO00o;
        this.f39043OooO00o = o000Var;
        this.f39044OooO0O0 = o000Var2;
        this.f39045OooO0OO = o000ooo2;
        this.f39046OooO0Oo = oooOo00;
    }

    @Override // p625o0ooO000.o000
    public final Object get() {
        Context context = this.f39043OooO00o.get();
        o00 o00Var = this.f39044OooO0O0.get();
        SchedulerConfig schedulerConfig = this.f39045OooO0OO.get();
        this.f39046OooO0Oo.get();
        return new o000O0o(context, o00Var, schedulerConfig);
    }
}
