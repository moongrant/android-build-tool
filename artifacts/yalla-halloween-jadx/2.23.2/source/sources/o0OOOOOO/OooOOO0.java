package o0OOOOOO;

import com.twitter.sdk.android.core.o000oOoO;
import com.twitter.sdk.android.core.o0OoOo0;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0<T extends o000oOoO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f42833OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO f42834OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OoOo0<T> f42835OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExecutorService f42836OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO f42837OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f42838OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f42839OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Calendar f42840OooO0OO = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    }

    public OooOOO0(com.twitter.sdk.android.core.OooOO0O oooOO0O, ThreadPoolExecutor threadPoolExecutor, OooOo oooOo) {
        OooOOOO oooOOOO = new OooOOOO();
        OooO00o oooO00o = new OooO00o();
        this.f42834OooO0O0 = oooOOOO;
        this.f42835OooO0OO = oooOO0O;
        this.f42836OooO0Oo = threadPoolExecutor;
        this.f42833OooO00o = oooO00o;
        this.f42837OooO0o0 = oooOo;
    }
}
