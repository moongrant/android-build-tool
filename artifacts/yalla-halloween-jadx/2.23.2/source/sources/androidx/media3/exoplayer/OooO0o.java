package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.source.OooOOOO;
import com.google.common.base.o000OOo;
import com.google.common.collect.o0O00;
import o000O00O.Oooo000;
import o000O00O.o00OO00O;
import o000O00O.o00OO0O0;
import o000O00O.o00oOoo;
import p037OoooOo0.o000O0o;
import p074o000OO0o.oo000o;
import p080o000OoO.o00;
import p080o000OoO.o000O00;
import p080o000OoO.o00Oo0;
import p080o000OoO.o0ooOOo;
import p425o0OoO0o.o00000;

/* JADX INFO: loaded from: classes.dex */
public interface OooO0o extends Player {

    @UnstableApi
    public interface OooO00o {
        void OooOo();
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final Looper f7215OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f7216OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O00 f7217OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000OOo<o00OO00O> f7218OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000OOo<OooOOOO.OooO00o> f7219OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public o000OOo<o00oOoo> f7220OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000OOo<o00000> f7221OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o000OOo<oo000o> f7222OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final com.google.common.base.OooOOO<o0ooOOo, o000O0.OooO00o> f7223OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final androidx.media3.common.OooO00o f7224OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f7225OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final boolean f7226OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final long f7227OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final o00OO0O0 f7228OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final long f7229OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final Oooo000 f7230OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final long f7231OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final long f7232OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final boolean f7233OooOOoo;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f7234OooOo00;

        public OooO0O0(final Context context) {
            this(context, new o000OOo() { // from class: o000O00O.o00O0O
                @Override // com.google.common.base.o000OOo
                public final Object get() {
                    return new DefaultRenderersFactory(context);
                }
            }, new o000OOo() { // from class: o000O00O.o00Oo0
                @Override // com.google.common.base.o000OOo
                public final Object get() {
                    return new androidx.media3.exoplayer.source.OooO0o(context, new o000OOoO.OooOOO());
                }
            });
        }

        public final OooO OooO00o() {
            o00Oo0.OooO0Oo(!this.f7234OooOo00);
            this.f7234OooOo00 = true;
            return new OooO(this);
        }

        public OooO0O0(final Context context, o000OOo<o00OO00O> o000ooo2, o000OOo<OooOOOO.OooO00o> o000ooo3) {
            o000OOo<o00000> o000ooo4 = new o000OOo() { // from class: o000O00O.o00oO0o
                @Override // com.google.common.base.o000OOo
                public final Object get() {
                    return new androidx.media3.exoplayer.trackselection.OooO0O0(context);
                }
            };
            o000O00O.o0ooOOo o0ooooo = new o000O00O.o0ooOOo();
            o000OOo<oo000o> o000ooo5 = new o000OOo() { // from class: o000O00O.o0OOO0o
                @Override // com.google.common.base.o000OOo
                public final Object get() {
                    p074o000OO0o.o0Oo0oo o0oo0oo2;
                    Context context2 = context;
                    o0O00 o0o01 = p074o000OO0o.o0Oo0oo.f34441OooOOO;
                    synchronized (p074o000OO0o.o0Oo0oo.class) {
                        if (p074o000OO0o.o0Oo0oo.f34447OooOo00 == null) {
                            o000OO0o.o0Oo0oo.OooO00o oooO00o = new o000OO0o.o0Oo0oo.OooO00o(context2);
                            p074o000OO0o.o0Oo0oo.f34447OooOo00 = new p074o000OO0o.o0Oo0oo(oooO00o.f34461OooO00o, oooO00o.f34462OooO0O0, oooO00o.f34463OooO0OO, oooO00o.f34464OooO0Oo, oooO00o.f34465OooO0o0);
                        }
                        o0oo0oo2 = p074o000OO0o.o0Oo0oo.f34447OooOo00;
                    }
                    return o0oo0oo2;
                }
            };
            o000O0o o000o0o2 = new o000O0o();
            context.getClass();
            this.f7216OooO00o = context;
            this.f7218OooO0OO = o000ooo2;
            this.f7219OooO0Oo = o000ooo3;
            this.f7221OooO0o0 = o000ooo4;
            this.f7220OooO0o = o0ooooo;
            this.f7222OooO0oO = o000ooo5;
            this.f7223OooO0oo = o000o0o2;
            int i = o00.f34910OooO00o;
            Looper looperMyLooper = Looper.myLooper();
            this.f7215OooO = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.f7224OooOO0 = androidx.media3.common.OooO00o.f6341OooOO0;
            this.f7225OooOO0O = 1;
            this.f7226OooOO0o = true;
            this.f7228OooOOO0 = o00OO0O0.f34129OooO0OO;
            this.f7227OooOOO = 5000L;
            this.f7229OooOOOO = 15000L;
            this.f7230OooOOOo = new Oooo000(o00.Oooo0OO(20L), o00.Oooo0OO(500L), 0.999f);
            this.f7217OooO0O0 = o0ooOOo.f34997OooO00o;
            this.f7232OooOOo0 = 500L;
            this.f7231OooOOo = 2000L;
            this.f7233OooOOoo = true;
        }
    }
}
