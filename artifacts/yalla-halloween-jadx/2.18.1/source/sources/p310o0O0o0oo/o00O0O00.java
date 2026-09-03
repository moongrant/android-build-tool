package p310o0O0o0oo;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public interface o00O0O00 {
    void OooO0oo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2);

    void OooOo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2);

    void OooOooo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2, IOException iOException, boolean z);

    void Oooo0o(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2);

    void OoooO0(int i, @Nullable o00O00O.OooO00o oooO00o, o00O000o o00o000o2);

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36343OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o00O00O.OooO00o f36344OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0369OooO00o> f36345OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f36346OooO0Oo;

        /* JADX INFO: renamed from: o0O0o0oo.o00O0O00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0369OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public Handler f36347OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public o00O0O00 f36348OooO0O0;

            public C0369OooO00o(Handler handler, o00O0O00 o00o0o01) {
                this.f36347OooO00o = handler;
                this.f36348OooO0O0 = o00o0o01;
            }
        }

        public OooO00o() {
            this.f36345OooO0OO = new CopyOnWriteArrayList<>();
            this.f36343OooO00o = 0;
            this.f36344OooO0O0 = null;
            this.f36346OooO0Oo = 0L;
        }

        public final long OooO00o(long j) {
            long jOooO0O0 = C.OooO0O0(j);
            if (jOooO0O0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f36346OooO0Oo + jOooO0O0;
        }

        public final void OooO0O0(o00O000o o00o000o2) {
            for (C0369OooO00o c0369OooO00o : this.f36345OooO0OO) {
                o000OOo0.OooOooO(c0369OooO00o.f36347OooO00o, new com.facebook.login.OooO00o(this, c0369OooO00o.f36348OooO0O0, o00o000o2, 1));
            }
        }

        public final void OooO0OO(final o00O0000 o00o0001, final o00O000o o00o000o2) {
            for (C0369OooO00o c0369OooO00o : this.f36345OooO0OO) {
                final o00O0O00 o00o0o01 = c0369OooO00o.f36348OooO0O0;
                o000OOo0.OooOooO(c0369OooO00o.f36347OooO00o, new Runnable() { // from class: o0O0o0oo.oo00o
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O00.OooO00o oooO00o = this.f36481Oooo0o;
                        o00o0o01.Oooo0o(oooO00o.f36343OooO00o, oooO00o.f36344OooO0O0, o00o0001, o00o000o2);
                    }
                });
            }
        }

        public final void OooO0Oo(final o00O0000 o00o0001, final o00O000o o00o000o2) {
            for (C0369OooO00o c0369OooO00o : this.f36345OooO0OO) {
                final o00O0O00 o00o0o01 = c0369OooO00o.f36348OooO0O0;
                o000OOo0.OooOooO(c0369OooO00o.f36347OooO00o, new Runnable() { // from class: o0O0o0oo.o00O00o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O00.OooO00o oooO00o = this.f36340Oooo0o;
                        o00o0o01.OooOo(oooO00o.f36343OooO00o, oooO00o.f36344OooO0O0, o00o0001, o00o000o2);
                    }
                });
            }
        }

        public final void OooO0o(final o00O0000 o00o0001, final o00O000o o00o000o2) {
            for (C0369OooO00o c0369OooO00o : this.f36345OooO0OO) {
                final o00O0O00 o00o0o01 = c0369OooO00o.f36348OooO0O0;
                o000OOo0.OooOooO(c0369OooO00o.f36347OooO00o, new Runnable() { // from class: o0O0o0oo.o00O00OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O00.OooO00o oooO00o = this.f36336Oooo0o;
                        o00o0o01.OooO0oo(oooO00o.f36343OooO00o, oooO00o.f36344OooO0O0, o00o0001, o00o000o2);
                    }
                });
            }
        }

        public final void OooO0o0(final o00O0000 o00o0001, final o00O000o o00o000o2, final IOException iOException, final boolean z) {
            for (C0369OooO00o c0369OooO00o : this.f36345OooO0OO) {
                final o00O0O00 o00o0o01 = c0369OooO00o.f36348OooO0O0;
                o000OOo0.OooOooO(c0369OooO00o.f36347OooO00o, new Runnable() { // from class: o0O0o0oo.o00O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O00.OooO00o oooO00o = this.f36302Oooo0o;
                        o00o0o01.OooOooo(oooO00o.f36343OooO00o, oooO00o.f36344OooO0O0, o00o0001, o00o000o2, iOException, z);
                    }
                });
            }
        }

        @CheckResult
        public final OooO00o OooO0oO(int i, @Nullable o00O00O.OooO00o oooO00o) {
            return new OooO00o(this.f36345OooO0OO, i, oooO00o);
        }

        public OooO00o(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable o00O00O.OooO00o oooO00o) {
            this.f36345OooO0OO = copyOnWriteArrayList;
            this.f36343OooO00o = i;
            this.f36344OooO0O0 = oooO00o;
            this.f36346OooO0Oo = 0L;
        }
    }
}
