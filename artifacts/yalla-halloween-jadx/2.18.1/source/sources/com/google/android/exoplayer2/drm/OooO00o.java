package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.OooO00o;
import java.util.concurrent.CopyOnWriteArrayList;
import p269o00oooOO.w;
import p310o0O0o0oo.o00O00O;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO00o {
    void OooOOOo(int i, @Nullable o00O00O.OooO00o oooO00o);

    void OooOo0O(int i, @Nullable o00O00O.OooO00o oooO00o, Exception exc);

    void OooOoO(int i, @Nullable o00O00O.OooO00o oooO00o);

    void OooOoo(int i, @Nullable o00O00O.OooO00o oooO00o);

    void Oooo0(int i, @Nullable o00O00O.OooO00o oooO00o);

    void Oooo00O(int i, @Nullable o00O00O.OooO00o oooO00o);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0097OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f13720OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o00O00O.OooO00o f13721OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0098OooO00o> f13722OooO0OO;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0098OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public Handler f13723OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public OooO00o f13724OooO0O0;

            public C0098OooO00o(Handler handler, OooO00o oooO00o) {
                this.f13723OooO00o = handler;
                this.f13724OooO0O0 = oooO00o;
            }
        }

        public C0097OooO00o() {
            this.f13722OooO0OO = new CopyOnWriteArrayList<>();
            this.f13720OooO00o = 0;
            this.f13721OooO0O0 = null;
        }

        public final void OooO00o() {
            for (C0098OooO00o c0098OooO00o : this.f13722OooO0OO) {
                o000OOo0.OooOooO(c0098OooO00o.f13723OooO00o, new com.facebook.login.OooOOO0(this, c0098OooO00o.f13724OooO0O0, 1));
            }
        }

        public final void OooO0O0() {
            for (C0098OooO00o c0098OooO00o : this.f13722OooO0OO) {
                final OooO00o oooO00o = c0098OooO00o.f13724OooO0O0;
                o000OOo0.OooOooO(c0098OooO00o.f13723OooO00o, new Runnable() { // from class: o0O0Oooo.o000O
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooO00o.C0097OooO00o c0097OooO00o = this.f36042Oooo0o;
                        oooO00o.Oooo0(c0097OooO00o.f13720OooO00o, c0097OooO00o.f13721OooO0O0);
                    }
                });
            }
        }

        public final void OooO0OO() {
            for (C0098OooO00o c0098OooO00o : this.f13722OooO0OO) {
                o000OOo0.OooOooO(c0098OooO00o.f13723OooO00o, new w(this, c0098OooO00o.f13724OooO0O0, 1));
            }
        }

        public final void OooO0Oo() {
            for (C0098OooO00o c0098OooO00o : this.f13722OooO0OO) {
                o000OOo0.OooOooO(c0098OooO00o.f13723OooO00o, new OooOOO.OooOO0(this, c0098OooO00o.f13724OooO0O0, 1));
            }
        }

        public final void OooO0o() {
            for (C0098OooO00o c0098OooO00o : this.f13722OooO0OO) {
                o000OOo0.OooOooO(c0098OooO00o.f13723OooO00o, new OooOOO.OooOOO0(this, c0098OooO00o.f13724OooO0O0, 2));
            }
        }

        public final void OooO0o0(final Exception exc) {
            for (C0098OooO00o c0098OooO00o : this.f13722OooO0OO) {
                final OooO00o oooO00o = c0098OooO00o.f13724OooO0O0;
                o000OOo0.OooOooO(c0098OooO00o.f13723OooO00o, new Runnable() { // from class: o0O0Oooo.o000OO00
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooO00o.C0097OooO00o c0097OooO00o = this.f36045Oooo0o;
                        oooO00o.OooOo0O(c0097OooO00o.f13720OooO00o, c0097OooO00o.f13721OooO0O0, exc);
                    }
                });
            }
        }

        @CheckResult
        public final C0097OooO00o OooO0oO(int i, @Nullable o00O00O.OooO00o oooO00o) {
            return new C0097OooO00o(this.f13722OooO0OO, i, oooO00o);
        }

        public C0097OooO00o(CopyOnWriteArrayList<C0098OooO00o> copyOnWriteArrayList, int i, @Nullable o00O00O.OooO00o oooO00o) {
            this.f13722OooO0OO = copyOnWriteArrayList;
            this.f13720OooO00o = i;
            this.f13721OooO0O0 = oooO00o;
        }
    }
}
