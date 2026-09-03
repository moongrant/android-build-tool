package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.OooOOOO;
import java.util.concurrent.CopyOnWriteArrayList;
import o000O00O.o00O0OO0;
import p039OoooOoo.o0oOOo;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface OooO0O0 {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f7639OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooOOOO.OooO0O0 f7640OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0147OooO00o> f7641OooO0OO;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0147OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Handler f7642OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final OooO0O0 f7643OooO0O0;

            public C0147OooO00o(Handler handler, OooO0O0 oooO0O0) {
                this.f7642OooO00o = handler;
                this.f7643OooO0O0 = oooO0O0;
            }
        }

        public OooO00o() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void OooO00o() {
            for (C0147OooO00o c0147OooO00o : this.f7641OooO0OO) {
                final OooO0O0 oooO0O0 = c0147OooO00o.f7643OooO0O0;
                o00.Oooo0oO(c0147OooO00o.f7642OooO00o, new Runnable() { // from class: o000OO0O.OooO
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o = this.f34405OooO0Oo;
                        oooO0O0.OooOo0o(oooO00o.f7639OooO00o, oooO00o.f7640OooO0O0);
                    }
                });
            }
        }

        public final void OooO0O0() {
            for (C0147OooO00o c0147OooO00o : this.f7641OooO0OO) {
                final OooO0O0 oooO0O0 = c0147OooO00o.f7643OooO0O0;
                o00.Oooo0oO(c0147OooO00o.f7642OooO00o, new Runnable() { // from class: o000OO0O.OooO0o
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o = this.f34414OooO0Oo;
                        oooO0O0.OooOoOO(oooO00o.f7639OooO00o, oooO00o.f7640OooO0O0);
                    }
                });
            }
        }

        public final void OooO0OO() {
            for (C0147OooO00o c0147OooO00o : this.f7641OooO0OO) {
                o00.Oooo0oO(c0147OooO00o.f7642OooO00o, new o0oOOo(2, this, c0147OooO00o.f7643OooO0O0));
            }
        }

        public final void OooO0Oo(final int i) {
            for (C0147OooO00o c0147OooO00o : this.f7641OooO0OO) {
                final OooO0O0 oooO0O0 = c0147OooO00o.f7643OooO0O0;
                o00.Oooo0oO(c0147OooO00o.f7642OooO00o, new Runnable() { // from class: o000OO0O.OooO0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o = this.f34408OooO0Oo;
                        int i2 = oooO00o.f7639OooO00o;
                        androidx.media3.exoplayer.drm.OooO0O0 oooO0O1 = oooO0O0;
                        oooO0O1.OooOOO0();
                        oooO0O1.OooOoO(i2, oooO00o.f7640OooO0O0, i);
                    }
                });
            }
        }

        public final void OooO0o() {
            for (C0147OooO00o c0147OooO00o : this.f7641OooO0OO) {
                o00.Oooo0oO(c0147OooO00o.f7642OooO00o, new o00O0OO0(1, this, c0147OooO00o.f7643OooO0O0));
            }
        }

        public final void OooO0o0(final Exception exc) {
            for (C0147OooO00o c0147OooO00o : this.f7641OooO0OO) {
                final OooO0O0 oooO0O0 = c0147OooO00o.f7643OooO0O0;
                o00.Oooo0oO(c0147OooO00o.f7642OooO00o, new Runnable() { // from class: o000OO0O.OooO0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o = this.f34411OooO0Oo;
                        oooO0O0.OooOoo0(oooO00o.f7639OooO00o, oooO00o.f7640OooO0O0, exc);
                    }
                });
            }
        }

        public OooO00o(CopyOnWriteArrayList<C0147OooO00o> copyOnWriteArrayList, int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            this.f7641OooO0OO = copyOnWriteArrayList;
            this.f7639OooO00o = i;
            this.f7640OooO0O0 = oooO0O0;
        }
    }

    @Deprecated
    void OooOOO0();

    void OooOo0o(int i, @Nullable OooOOOO.OooO0O0 oooO0O0);

    void OooOoO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, int i2);

    void OooOoOO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0);

    void OooOoo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, Exception exc);

    void Oooo000(int i, @Nullable OooOOOO.OooO0O0 oooO0O0);

    void Oooo00O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0);
}
