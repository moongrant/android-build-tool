package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.source.OooO0o;
import com.google.android.exoplayer2.trackselection.OooO0O0;
import com.google.common.collect.o0O00;
import p203o00o0o0o.o000OO0O;
import p203o00o0o0o.o0O00O;
import p203o00o0o0o.o0O00OO;
import p203o00o0o0o.o0o0Oo;
import p209o00o0oo0.oo00o;
import p241o00oo0O.o00oOoo;
import p244o00oo0Oo.o000O;
import p244o00oo0Oo.o00O00O;
import p245o00oo0o.o00O00OO;
import p245o00oo0o.o0O0o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface OooOOO0 extends Player {

    public interface OooO00o {
        void OooOo();
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final Looper f11145OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f11146OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O0o f11147OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final com.google.common.base.o0O0O00<o0O00O> f11148OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final com.google.common.base.o0O0O00<com.google.android.exoplayer2.source.OooOOOO.OooO00o> f11149OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public com.google.common.base.o0O0O00<o0o0Oo> f11150OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final com.google.common.base.o0O0O00<o00oOoo> f11151OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final com.google.common.base.o0O0O00<o000O> f11152OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final com.google.common.base.OooOOO0<o00O00OO, p200o00o0o.o00O0O> f11153OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.OooO00o f11154OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f11155OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final boolean f11156OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final long f11157OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final o0O00OO f11158OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final long f11159OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final OooOO0 f11160OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final long f11161OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final long f11162OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final boolean f11163OooOOoo;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f11164OooOo00;

        public OooO0O0(final Context context) {
            this(context, new com.google.common.base.o0O0O00() { // from class: o00o0o0o.o000Oo0
                @Override // com.google.common.base.o0O0O00
                public final Object get() {
                    return new DefaultRenderersFactory(context);
                }
            }, new com.google.common.base.o0O0O00() { // from class: o00o0o0o.o000O00
                @Override // com.google.common.base.o0O0O00
                public final Object get() {
                    return new OooO0o(context, new oo00o());
                }
            });
        }

        public OooO0O0(final Context context, com.google.common.base.o0O0O00<o0O00O> o0o0o00, com.google.common.base.o0O0O00<com.google.android.exoplayer2.source.OooOOOO.OooO00o> o0o0o01) {
            com.google.common.base.o0O0O00<o00oOoo> o0o0o02 = new com.google.common.base.o0O0O00() { // from class: o00o0o0o.o000O0Oo
                @Override // com.google.common.base.o0O0O00
                public final Object get() {
                    return new OooO0O0(context);
                }
            };
            o000OO0O o000oo0o2 = new o000OO0O();
            com.google.common.base.o0O0O00<o000O> o0o0o03 = new com.google.common.base.o0O0O00() { // from class: o00o0o0o.o000O0O0
                @Override // com.google.common.base.o0O0O00
                public final Object get() {
                    o00O00O o00o00o2;
                    Context context2 = context;
                    o0O00 o0o01 = o00O00O.f40486OooOOO;
                    synchronized (o00O00O.class) {
                        if (o00O00O.f40492OooOo00 == null) {
                            o00O00O.OooO00o oooO00o = new o00O00O.OooO00o(context2);
                            o00O00O.f40492OooOo00 = new o00O00O(oooO00o.f40506OooO00o, oooO00o.f40507OooO0O0, oooO00o.f40508OooO0OO, oooO00o.f40509OooO0Oo, oooO00o.f40510OooO0o0);
                        }
                        o00o00o2 = o00O00O.f40492OooOo00;
                    }
                    return o00o00o2;
                }
            };
            OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
            context.getClass();
            this.f11146OooO00o = context;
            this.f11148OooO0OO = o0o0o00;
            this.f11149OooO0Oo = o0o0o01;
            this.f11151OooO0o0 = o0o0o02;
            this.f11150OooO0o = o000oo0o2;
            this.f11152OooO0oO = o0o0o03;
            this.f11153OooO0oo = oooO0O0;
            int i = p245o00oo0o.o0O00.f40595OooO00o;
            Looper looperMyLooper = Looper.myLooper();
            this.f11145OooO = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.f11154OooOO0 = com.google.android.exoplayer2.audio.OooO00o.f11580OooOO0;
            this.f11155OooOO0O = 1;
            this.f11156OooOO0o = true;
            this.f11158OooOOO0 = o0O00OO.f39282OooO0OO;
            this.f11157OooOOO = 5000L;
            this.f11159OooOOOO = 15000L;
            this.f11160OooOOOo = new OooOO0(p245o00oo0o.o0O00.Oooo0O0(20L), p245o00oo0o.o0O00.Oooo0O0(500L), 0.999f);
            this.f11147OooO0O0 = o00O00OO.f40562OooO00o;
            this.f11162OooOOo0 = 500L;
            this.f11161OooOOo = 2000L;
            this.f11163OooOOoo = true;
        }
    }

    void OooOooO(com.google.android.exoplayer2.source.OooOOOO oooOOOO);

    void Oooo0oO(com.google.android.exoplayer2.audio.OooO00o oooO00o, boolean z);
}
