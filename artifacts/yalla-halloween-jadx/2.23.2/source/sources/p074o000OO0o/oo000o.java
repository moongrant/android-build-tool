package p074o000OO0o;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface oo000o {

    public interface OooO00o {

        /* JADX INFO: renamed from: o000OO0o.oo000o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0398OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0399OooO00o> f34472OooO00o = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: o000OO0o.oo000o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0399OooO00o {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final Handler f34473OooO00o;

                /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                public final OooO00o f34474OooO0O0;

                /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
                public boolean f34475OooO0OO;

                public C0399OooO00o(Handler handler, o000O0.OooO00o oooO00o) {
                    this.f34473OooO00o = handler;
                    this.f34474OooO0O0 = oooO00o;
                }
            }

            public final void OooO00o(o000O0.OooO00o oooO00o) {
                CopyOnWriteArrayList<C0399OooO00o> copyOnWriteArrayList = this.f34472OooO00o;
                for (C0399OooO00o c0399OooO00o : copyOnWriteArrayList) {
                    if (c0399OooO00o.f34474OooO0O0 == oooO00o) {
                        c0399OooO00o.f34475OooO0OO = true;
                        copyOnWriteArrayList.remove(c0399OooO00o);
                    }
                }
            }
        }

        void OooOOoo(int i, long j, long j2);
    }

    @Nullable
    o0Oo0oo OooO0OO();

    void OooO0Oo(o000O0.OooO00o oooO00o);

    void OooO0o0(Handler handler, o000O0.OooO00o oooO00o);
}
