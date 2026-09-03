package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface OooOo00 {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f7957OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooOOOO.OooO0O0 f7958OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0151OooO00o> f7959OooO0OO;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.source.OooOo00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0151OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Handler f7960OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final OooOo00 f7961OooO0O0;

            public C0151OooO00o(Handler handler, OooOo00 oooOo00) {
                this.f7960OooO00o = handler;
                this.f7961OooO0O0 = oooOo00;
            }
        }

        public OooO00o(CopyOnWriteArrayList<C0151OooO00o> copyOnWriteArrayList, int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            this.f7959OooO0OO = copyOnWriteArrayList;
            this.f7957OooO00o = i;
            this.f7958OooO0O0 = oooO0O0;
        }

        public final void OooO00o(final o000O.Oooo000 oooo000) {
            for (C0151OooO00o c0151OooO00o : this.f7959OooO0OO) {
                final OooOo00 oooOo00 = c0151OooO00o.f7961OooO0O0;
                o00.Oooo0oO(c0151OooO00o.f7960OooO00o, new Runnable() { // from class: o000O.Oooo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.OooOo00.OooO00o oooO00o = this.f33845OooO0Oo;
                        oooOo00.OooOO0O(oooO00o.f7957OooO00o, oooO00o.f7958OooO0O0, oooo000);
                    }
                });
            }
        }

        public final void OooO0O0(final o000O.OooOo oooOo, final o000O.Oooo000 oooo000) {
            for (C0151OooO00o c0151OooO00o : this.f7959OooO0OO) {
                final OooOo00 oooOo00 = c0151OooO00o.f7961OooO0O0;
                o00.Oooo0oO(c0151OooO00o.f7960OooO00o, new Runnable() { // from class: o000O.o000oOoO
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.OooOo00.OooO00o oooO00o = this.f33855OooO0Oo;
                        oooOo00.Oooo0(oooO00o.f7957OooO00o, oooO00o.f7958OooO0O0, oooOo, oooo000);
                    }
                });
            }
        }

        public final void OooO0OO(final o000O.OooOo oooOo, final o000O.Oooo000 oooo000) {
            for (C0151OooO00o c0151OooO00o : this.f7959OooO0OO) {
                final OooOo00 oooOo00 = c0151OooO00o.f7961OooO0O0;
                o00.Oooo0oO(c0151OooO00o.f7960OooO00o, new Runnable() { // from class: o000O.o00Oo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.OooOo00.OooO00o oooO00o = this.f33863OooO0Oo;
                        oooOo00.OooOo(oooO00o.f7957OooO00o, oooO00o.f7958OooO0O0, oooOo, oooo000);
                    }
                });
            }
        }

        public final void OooO0Oo(o000O.OooOo oooOo, @Nullable androidx.media3.common.OooOO0 oooOO1, long j, long j2, IOException iOException, boolean z) {
            OooO0o0(oooOo, new o000O.Oooo000(1, -1, oooOO1, 0, null, o00.o000oOoO(j), o00.o000oOoO(j2)), iOException, z);
        }

        public final void OooO0o(final o000O.OooOo oooOo, final o000O.Oooo000 oooo000) {
            for (C0151OooO00o c0151OooO00o : this.f7959OooO0OO) {
                final OooOo00 oooOo00 = c0151OooO00o.f7961OooO0O0;
                o00.Oooo0oO(c0151OooO00o.f7960OooO00o, new Runnable() { // from class: o000O.o00O0O
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.OooOo00.OooO00o oooO00o = this.f33859OooO0Oo;
                        oooOo00.OooOooO(oooO00o.f7957OooO00o, oooO00o.f7958OooO0O0, oooOo, oooo000);
                    }
                });
            }
        }

        public final void OooO0o0(final o000O.OooOo oooOo, final o000O.Oooo000 oooo000, final IOException iOException, final boolean z) {
            for (C0151OooO00o c0151OooO00o : this.f7959OooO0OO) {
                final OooOo00 oooOo00 = c0151OooO00o.f7961OooO0O0;
                o00.Oooo0oO(c0151OooO00o.f7960OooO00o, new Runnable() { // from class: o000O.o0OoOo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.source.OooOo00 oooOo01 = oooOo00;
                        OooOo oooOo2 = oooOo;
                        Oooo000 oooo001 = oooo000;
                        IOException iOException2 = iOException;
                        boolean z2 = z;
                        androidx.media3.exoplayer.source.OooOo00.OooO00o oooO00o = this.f33885OooO0Oo;
                        oooOo01.OooOooo(oooO00o.f7957OooO00o, oooO00o.f7958OooO0O0, oooOo2, oooo001, iOException2, z2);
                    }
                });
            }
        }
    }

    void OooOO0O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.Oooo000 oooo000);

    void OooOo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.OooOo oooOo, o000O.Oooo000 oooo000);

    void OooOooO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.OooOo oooOo, o000O.Oooo000 oooo000);

    void OooOooo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.OooOo oooOo, o000O.Oooo000 oooo000, IOException iOException, boolean z);

    void Oooo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o000O.OooOo oooOo, o000O.Oooo000 oooo000);
}
