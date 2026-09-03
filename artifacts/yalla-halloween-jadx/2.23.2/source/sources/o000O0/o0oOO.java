package o000O0;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooO00o f33916OooO00o;

    @RequiresApi(31)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int f33917OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final LogSessionId f33918OooO00o;

        static {
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public OooO00o(LogSessionId logSessionId) {
            this.f33918OooO00o = logSessionId;
        }
    }

    static {
        if (p080o000OoO.o00.f34910OooO00o < 31) {
            new o0oOO();
        } else {
            int i = OooO00o.f33917OooO0O0;
        }
    }

    public o0oOO() {
        this((OooO00o) null);
        p080o000OoO.o00Oo0.OooO0Oo(p080o000OoO.o00.f34910OooO00o < 31);
    }

    @RequiresApi(31)
    public o0oOO(LogSessionId logSessionId) {
        this(new OooO00o(logSessionId));
    }

    public o0oOO(@Nullable OooO00o oooO00o) {
        this.f33916OooO00o = oooO00o;
    }
}
