package o0OOOOO;

import com.twitter.sdk.android.core.o00O0O;
import com.twitter.sdk.android.core.o0OoOo0;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0<T extends o0OoOo0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f43634OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO f43635OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O<T> f43636OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ExecutorService f43637OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO f43638OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f43639OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f43640OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Calendar f43641OooO0OO = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    }

    public OooOOO0(com.twitter.sdk.android.core.OooOOO0 oooOOO0, ThreadPoolExecutor threadPoolExecutor, OooOo oooOo) {
        OooOOOO oooOOOO = new OooOOOO();
        OooO00o oooO00o = new OooO00o();
        this.f43635OooO0O0 = oooOOOO;
        this.f43636OooO0OO = oooOOO0;
        this.f43637OooO0Oo = threadPoolExecutor;
        this.f43634OooO00o = oooO00o;
        this.f43638OooO0o0 = oooOo;
    }
}
