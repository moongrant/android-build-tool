package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.OooOo00;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p045Oooooo.o0000O0O;
import p226o00oOo00.o0000;
import p226o00oOo00.o0000O00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface OooOo00 {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f13058OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooOOOO.OooO0O0 f13059OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0209OooO00o> f13060OooO0OO;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.OooOo00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0209OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Handler f13061OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final OooOo00 f13062OooO0O0;

            public C0209OooO00o(Handler handler, OooOo00 oooOo00) {
                this.f13061OooO00o = handler;
                this.f13062OooO0O0 = oooOo00;
            }
        }

        public OooO00o(CopyOnWriteArrayList<C0209OooO00o> copyOnWriteArrayList, int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            this.f13060OooO0OO = copyOnWriteArrayList;
            this.f13058OooO00o = i;
            this.f13059OooO0O0 = oooO0O0;
        }

        public final void OooO(o0000 o0000Var, int i, int i2, @Nullable com.google.android.exoplayer2.OooOo oooOo, int i3, @Nullable Object obj, long j, long j2) {
            OooOO0(o0000Var, new o0000O00(i, i2, oooOo, i3, obj, o0O00.OoooOO0(j), o0O00.OoooOO0(j2)));
        }

        public final void OooO00o(int i, @Nullable com.google.android.exoplayer2.OooOo oooOo, int i2, @Nullable Object obj, long j) {
            OooO0O0(new o0000O00(1, i, oooOo, i2, obj, o0O00.OoooOO0(j), -9223372036854775807L));
        }

        public final void OooO0O0(o0000O00 o0000o00) {
            for (C0209OooO00o c0209OooO00o : this.f13060OooO0OO) {
                o0O00.Oooo0oO(c0209OooO00o.f13061OooO00o, new o0000O0O(1, this, c0209OooO00o.f13062OooO0O0, o0000o00));
            }
        }

        public final void OooO0OO(o0000 o0000Var, int i, int i2, @Nullable com.google.android.exoplayer2.OooOo oooOo, int i3, @Nullable Object obj, long j, long j2) {
            OooO0Oo(o0000Var, new o0000O00(i, i2, oooOo, i3, obj, o0O00.OoooOO0(j), o0O00.OoooOO0(j2)));
        }

        public final void OooO0Oo(final o0000 o0000Var, final o0000O00 o0000o00) {
            for (C0209OooO00o c0209OooO00o : this.f13060OooO0OO) {
                final OooOo00 oooOo00 = c0209OooO00o.f13062OooO0O0;
                o0O00.Oooo0oO(c0209OooO00o.f13061OooO00o, new Runnable() { // from class: o00oOo00.o0000O
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOo00.OooO00o oooO00o = this.f39833OooO0Oo;
                        oooOo00.OooOoO0(oooO00o.f13058OooO00o, oooO00o.f13059OooO0O0, o0000Var, o0000o00);
                    }
                });
            }
        }

        public final void OooO0o(final o0000 o0000Var, final o0000O00 o0000o00) {
            for (C0209OooO00o c0209OooO00o : this.f13060OooO0OO) {
                final OooOo00 oooOo00 = c0209OooO00o.f13062OooO0O0;
                o0O00.Oooo0oO(c0209OooO00o.f13061OooO00o, new Runnable() { // from class: o00oOo00.o000OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOo00.OooO00o oooO00o = this.f39889OooO0Oo;
                        oooOo00.OooOooo(oooO00o.f13058OooO00o, oooO00o.f13059OooO0O0, o0000Var, o0000o00);
                    }
                });
            }
        }

        public final void OooO0o0(o0000 o0000Var, int i, int i2, @Nullable com.google.android.exoplayer2.OooOo oooOo, int i3, @Nullable Object obj, long j, long j2) {
            OooO0o(o0000Var, new o0000O00(i, i2, oooOo, i3, obj, o0O00.OoooOO0(j), o0O00.OoooOO0(j2)));
        }

        public final void OooO0oO(o0000 o0000Var, int i, int i2, @Nullable com.google.android.exoplayer2.OooOo oooOo, int i3, @Nullable Object obj, long j, long j2, IOException iOException, boolean z) {
            OooO0oo(o0000Var, new o0000O00(i, i2, oooOo, i3, obj, o0O00.OoooOO0(j), o0O00.OoooOO0(j2)), iOException, z);
        }

        public final void OooO0oo(final o0000 o0000Var, final o0000O00 o0000o00, final IOException iOException, final boolean z) {
            for (C0209OooO00o c0209OooO00o : this.f13060OooO0OO) {
                final OooOo00 oooOo00 = c0209OooO00o.f13062OooO0O0;
                o0O00.Oooo0oO(c0209OooO00o.f13061OooO00o, new Runnable() { // from class: o00oOo00.o0000O0O
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOo00 oooOo01 = oooOo00;
                        o0000 o0000Var2 = o0000Var;
                        o0000O00 o0000o01 = o0000o00;
                        IOException iOException2 = iOException;
                        boolean z2 = z;
                        OooOo00.OooO00o oooO00o = this.f39849OooO0Oo;
                        oooOo01.OooOO0(oooO00o.f13058OooO00o, oooO00o.f13059OooO0O0, o0000Var2, o0000o01, iOException2, z2);
                    }
                });
            }
        }

        public final void OooOO0(final o0000 o0000Var, final o0000O00 o0000o00) {
            for (C0209OooO00o c0209OooO00o : this.f13060OooO0OO) {
                final OooOo00 oooOo00 = c0209OooO00o.f13062OooO0O0;
                o0O00.Oooo0oO(c0209OooO00o.f13061OooO00o, new Runnable() { // from class: o00oOo00.o0000O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOo00.OooO00o oooO00o = this.f39837OooO0Oo;
                        oooOo00.OooOoOO(oooO00o.f13058OooO00o, oooO00o.f13059OooO0O0, o0000Var, o0000o00);
                    }
                });
            }
        }

        public final void OooOO0O(final o0000O00 o0000o00) {
            final OooOOOO.OooO0O0 oooO0O0 = this.f13059OooO0O0;
            oooO0O0.getClass();
            for (C0209OooO00o c0209OooO00o : this.f13060OooO0OO) {
                final OooOo00 oooOo00 = c0209OooO00o.f13062OooO0O0;
                o0O00.Oooo0oO(c0209OooO00o.f13061OooO00o, new Runnable() { // from class: o00oOo00.o0000OO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        oooOo00.OooOoo0(this.f39854OooO0Oo.f13058OooO00o, oooO0O0, o0000o00);
                    }
                });
            }
        }
    }

    void OooOO0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000 o0000Var, o0000O00 o0000o00, IOException iOException, boolean z);

    void OooOoO0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000 o0000Var, o0000O00 o0000o00);

    void OooOoOO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000 o0000Var, o0000O00 o0000o00);

    void OooOoo0(int i, OooOOOO.OooO0O0 oooO0O0, o0000O00 o0000o00);

    void OooOooo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000 o0000Var, o0000O00 o0000o00);

    void Oooo00O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, o0000O00 o0000o00);
}
