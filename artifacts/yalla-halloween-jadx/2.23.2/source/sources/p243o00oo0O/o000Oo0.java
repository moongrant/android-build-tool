package p243o00oo0O;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p240o00oo0.o000000;
import p246o00oo0Oo.o0000Ooo;
import p246o00oo0Oo.o000O0;
import p248o00oo0o0.o0000oo;
import p249o00oo0oO.o000O;
import p249o00oo0oO.o000O0Oo;
import p629o0ooO00O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 implements o000000<o000O0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0<Context> f40094OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O0<o0000oo> f40095OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000O0<SchedulerConfig> f40096OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000O0<o000O0Oo> f40097OooO0Oo;

    public o000Oo0(o00000O0 o00000o1, o00000O0 o00000o2, o000O000 o000o001) {
        o000O o000o = o000O.OooO00o.f40218OooO00o;
        this.f40094OooO00o = o00000o1;
        this.f40095OooO0O0 = o00000o2;
        this.f40096OooO0OO = o000o001;
        this.f40097OooO0Oo = o000o;
    }

    @Override // p629o0ooO00O.o00000O0
    public final Object get() {
        Context context = this.f40094OooO00o.get();
        o0000oo o0000ooVar = this.f40095OooO0O0.get();
        SchedulerConfig schedulerConfig = this.f40096OooO0OO.get();
        this.f40097OooO0Oo.get();
        return new o0000Ooo(context, o0000ooVar, schedulerConfig);
    }
}
