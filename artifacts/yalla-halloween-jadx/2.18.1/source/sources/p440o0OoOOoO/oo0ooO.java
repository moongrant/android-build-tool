package p440o0OoOOoO;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import o0OO0O0.OooO0O0;
import p433o0OoOO0o.o0O00OO;
import p433o0OoOO0o.o0O00OOO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0ooO<T extends o0O00OO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f40194OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f40195OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00OOO<T> f40196OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExecutorService f40197OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OO00OO f40198OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f40199OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f40200OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Calendar f40201OooO0OO = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    }

    public oo0ooO(o0O00OOO<T> o0o00ooo2, ExecutorService executorService, o0OO00OO<T> o0oo00oo2) {
        OooO0O0 oooO0O0 = new OooO0O0();
        OooO00o oooO00o = new OooO00o();
        this.f40195OooO0O0 = oooO0O0;
        this.f40196OooO0OO = o0o00ooo2;
        this.f40197OooO0Oo = executorService;
        this.f40194OooO00o = oooO00o;
        this.f40198OooO0o0 = o0oo00oo2;
    }
}
