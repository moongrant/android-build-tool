package p244o00oo0Oo;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;
import p200o00o0o.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface o000O {

    public interface OooO00o {

        /* JADX INFO: renamed from: o00oo0Oo.o000O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0447OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0448OooO00o> f40461OooO00o = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: o00oo0Oo.o000O$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0448OooO00o {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final Handler f40462OooO00o;

                /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                public final OooO00o f40463OooO0O0;

                /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
                public boolean f40464OooO0OO;

                public C0448OooO00o(Handler handler, o00O0O o00o0o2) {
                    this.f40462OooO00o = handler;
                    this.f40463OooO0O0 = o00o0o2;
                }
            }

            public final void OooO00o(o00O0O o00o0o2) {
                CopyOnWriteArrayList<C0448OooO00o> copyOnWriteArrayList = this.f40461OooO00o;
                for (C0448OooO00o c0448OooO00o : copyOnWriteArrayList) {
                    if (c0448OooO00o.f40463OooO0O0 == o00o0o2) {
                        c0448OooO00o.f40464OooO0OO = true;
                        copyOnWriteArrayList.remove(c0448OooO00o);
                    }
                }
            }
        }

        void OooO00o(int i, long j, long j2);
    }

    void OooO00o();

    void OooO0OO(Handler handler, o00O0O o00o0o2);

    void OooO0Oo(o00O0O o00o0o2);

    @Nullable
    o00O00O OooO0o0();

    long OooO0oO();
}
