package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.OooO0O0;
import com.google.android.exoplayer2.source.OooOOOO;
import java.util.concurrent.CopyOnWriteArrayList;
import p003OooO0o0.OooOo;
import p203o00o0o0o.o0O00000;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface OooO0O0 {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f11769OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooOOOO.OooO0O0 f11770OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0201OooO00o> f11771OooO0OO;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0201OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Handler f11772OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final OooO0O0 f11773OooO0O0;

            public C0201OooO00o(Handler handler, OooO0O0 oooO0O0) {
                this.f11772OooO00o = handler;
                this.f11773OooO0O0 = oooO0O0;
            }
        }

        public OooO00o() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void OooO00o() {
            for (C0201OooO00o c0201OooO00o : this.f11771OooO0OO) {
                o0O00.Oooo0oO(c0201OooO00o.f11772OooO00o, new p002OooO0Oo.OooOOO0(2, this, c0201OooO00o.f11773OooO0O0));
            }
        }

        public final void OooO0O0() {
            for (C0201OooO00o c0201OooO00o : this.f11771OooO0OO) {
                final OooO0O0 oooO0O0 = c0201OooO00o.f11773OooO0O0;
                o0O00.Oooo0oO(c0201OooO00o.f11772OooO00o, new Runnable() { // from class: o00o0oOo.o0O00
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooO0O0.OooO00o oooO00o = this.f39437OooO0Oo;
                        oooO0O0.OooOo00(oooO00o.f11769OooO00o, oooO00o.f11770OooO0O0);
                    }
                });
            }
        }

        public final void OooO0OO() {
            for (C0201OooO00o c0201OooO00o : this.f11771OooO0OO) {
                o0O00.Oooo0oO(c0201OooO00o.f11772OooO00o, new OooOo(3, this, c0201OooO00o.f11773OooO0O0));
            }
        }

        public final void OooO0Oo(int i) {
            for (C0201OooO00o c0201OooO00o : this.f11771OooO0OO) {
                o0O00.Oooo0oO(c0201OooO00o.f11772OooO00o, new o0O00000(i, this, 1, c0201OooO00o.f11773OooO0O0));
            }
        }

        public final void OooO0o() {
            for (C0201OooO00o c0201OooO00o : this.f11771OooO0OO) {
                final OooO0O0 oooO0O0 = c0201OooO00o.f11773OooO0O0;
                o0O00.Oooo0oO(c0201OooO00o.f11772OooO00o, new Runnable() { // from class: o00o0oOo.o0O000Oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooO0O0.OooO00o oooO00o = this.f39441OooO0Oo;
                        oooO0O0.Oooo0(oooO00o.f11769OooO00o, oooO00o.f11770OooO0O0);
                    }
                });
            }
        }

        public final void OooO0o0(final Exception exc) {
            for (C0201OooO00o c0201OooO00o : this.f11771OooO0OO) {
                final OooO0O0 oooO0O0 = c0201OooO00o.f11773OooO0O0;
                o0O00.Oooo0oO(c0201OooO00o.f11772OooO00o, new Runnable() { // from class: o00o0oOo.o0O000o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooO0O0.OooO00o oooO00o = this.f39443OooO0Oo;
                        oooO0O0.OooOoo(oooO00o.f11769OooO00o, oooO00o.f11770OooO0O0, exc);
                    }
                });
            }
        }

        public OooO00o(CopyOnWriteArrayList<C0201OooO00o> copyOnWriteArrayList, int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            this.f11771OooO0OO = copyOnWriteArrayList;
            this.f11769OooO00o = i;
            this.f11770OooO0O0 = oooO0O0;
        }
    }

    @Deprecated
    void OooOO0O();

    void OooOo00(int i, @Nullable OooOOOO.OooO0O0 oooO0O0);

    void OooOoo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, Exception exc);

    void Oooo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0);

    void Oooo000(int i, @Nullable OooOOOO.OooO0O0 oooO0O0);

    void Oooo00o(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, int i2);

    void Oooo0O0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0);
}
