package p200o00o0o;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O0OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooO00o f39134OooO00o;

    @RequiresApi(31)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int f39135OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final LogSessionId f39136OooO00o;

        static {
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public OooO00o(LogSessionId logSessionId) {
            this.f39136OooO00o = logSessionId;
        }
    }

    static {
        if (o0O00.f40595OooO00o < 31) {
            new o0O0OOO0();
        } else {
            int i = OooO00o.f39135OooO0O0;
        }
    }

    public o0O0OOO0() {
        this((OooO00o) null);
        o00O000o.OooO0Oo(o0O00.f40595OooO00o < 31);
    }

    @RequiresApi(31)
    public o0O0OOO0(LogSessionId logSessionId) {
        this(new OooO00o(logSessionId));
    }

    public o0O0OOO0(@Nullable OooO00o oooO00o) {
        this.f39134OooO00o = oooO00o;
    }
}
