package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.zego.zegoliveroom.constants.ZegoConstants;
import p200o00o0o.o00O0000;
import p200o00o0o.o0O0OOO0;
import p207o00o0oOo.o0O00O0o;
import p226o00oOo00.o0000Ooo;
import p226o00oOo00.o000O0o;
import p226o00oOo00.o0OO00O;
import p244o00oo0Oo.o000OO0O;
import p244o00oo0Oo.o000OOo0;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000oOoO extends com.google.android.exoplayer2.source.OooO00o implements Oooo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final com.google.android.exoplayer2.o000oOoO.OooOO0O f13283OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final com.google.android.exoplayer2.o000oOoO f13284OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f13285OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Oooo000.OooO00o f13286OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO0OO f13287OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f13288OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f13289OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f13290OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f13291OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f13292OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f13293OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public o00O0OO0 f13294OooOOoo;

    public class OooO00o extends o0000Ooo {
        public OooO00o(o000O0o o000o0o2) {
            super(o000o0o2);
        }

        @Override // p226o00oOo00.o0000Ooo, com.google.android.exoplayer2.oo0o0Oo
        public final oo0o0Oo.OooO0O0 OooO0oO(int i, oo0o0Oo.OooO0O0 oooO0O0, boolean z) {
            super.OooO0oO(i, oooO0O0, z);
            oooO0O0.f12904OooO = true;
            return oooO0O0;
        }

        @Override // p226o00oOo00.o0000Ooo, com.google.android.exoplayer2.oo0o0Oo
        public final oo0o0Oo.OooO0OO OooOOOO(int i, oo0o0Oo.OooO0OO oooO0OO, long j) {
            super.OooOOOO(i, oooO0OO, j);
            oooO0OO.f12938OooOOOO = true;
            return oooO0OO;
        }
    }

    public static final class OooO0O0 implements OooOOOO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f13295OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Oooo000.OooO00o f13296OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o0O00O0o f13297OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public LoadErrorHandlingPolicy f13298OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f13299OooO0o0;

        public OooO0O0(com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o, p209o00o0oo0.o00O0OO0 o00o0oo1) {
            o00O0000 o00o0001 = new o00O0000(o00o0oo1);
            com.google.android.exoplayer2.drm.OooO00o oooO00o = new com.google.android.exoplayer2.drm.OooO00o();
            com.google.android.exoplayer2.upstream.OooO oooO = new com.google.android.exoplayer2.upstream.OooO();
            this.f13295OooO00o = interfaceC0215OooO00o;
            this.f13296OooO0O0 = o00o0001;
            this.f13297OooO0OO = oooO00o;
            this.f13298OooO0Oo = oooO;
            this.f13299OooO0o0 = ZegoConstants.ErrorMask.RoomServerErrorMask;
        }

        @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
        public final OooOOOO OooO00o(com.google.android.exoplayer2.o000oOoO o000oooo2) {
            o000oooo2.f12670OooO0o0.getClass();
            Object obj = o000oooo2.f12670OooO0o0.f12765OooOO0O;
            return new o000oOoO(o000oooo2, this.f13295OooO00o, this.f13296OooO0O0, this.f13297OooO0OO.OooO00o(o000oooo2), this.f13298OooO0Oo, this.f13299OooO0o0);
        }

        @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
        @CanIgnoreReturnValue
        public final OooOOOO.OooO00o OooO0O0(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.f13298OooO0Oo = loadErrorHandlingPolicy;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
        public final OooOOOO.OooO00o OooO0OO(o000OOo0 o000ooo1) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
        @CanIgnoreReturnValue
        public final OooOOOO.OooO00o OooO0Oo(o0O00O0o o0o00o0o) {
            if (o0o00o0o == null) {
                throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.f13297OooO0OO = o0o00o0o;
            return this;
        }
    }

    public o000oOoO(com.google.android.exoplayer2.o000oOoO o000oooo2, com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o, Oooo000.OooO00o oooO00o, com.google.android.exoplayer2.drm.OooO0OO oooO0OO, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i) {
        com.google.android.exoplayer2.o000oOoO.OooOO0O oooOO0O = o000oooo2.f12670OooO0o0;
        oooOO0O.getClass();
        this.f13283OooO = oooOO0O;
        this.f13284OooO0oo = o000oooo2;
        this.f13285OooOO0 = interfaceC0215OooO00o;
        this.f13286OooOO0O = oooO00o;
        this.f13287OooOO0o = oooO0OO;
        this.f13289OooOOO0 = loadErrorHandlingPolicy;
        this.f13288OooOOO = i;
        this.f13290OooOOOO = true;
        this.f13291OooOOOo = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final com.google.android.exoplayer2.o000oOoO OooO0Oo() {
        return this.f13284OooO0oo;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0o0(OooOOO oooOOO) {
        Oooo0 oooo0 = (Oooo0) oooOOO;
        if (oooo0.f13087OooOoO0) {
            for (o00O0O o00o0o2 : oooo0.f13084OooOo0O) {
                o00o0o2.OooO0oo();
                DrmSession drmSession = o00o0o2.f13308OooO0oo;
                if (drmSession != null) {
                    drmSession.OooO0O0(o00o0o2.f13306OooO0o0);
                    o00o0o2.f13308OooO0oo = null;
                    o00o0o2.f13307OooO0oO = null;
                }
            }
        }
        oooo0.f13074OooOOO.OooO0OO(oooo0);
        oooo0.f13080OooOOoo.removeCallbacksAndMessages(null);
        oooo0.f13083OooOo00 = null;
        oooo0.f13102Oooo0oo = true;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final OooOOO OooO0oo(OooOOOO.OooO0O0 oooO0O0, o000OO0O o000oo0o2, long j) {
        com.google.android.exoplayer2.upstream.OooO00o OooO00o2 = this.f13285OooOO0.OooO00o();
        o00O0OO0 o00o0oo1 = this.f13294OooOOoo;
        if (o00o0oo1 != null) {
            OooO00o2.OooO0OO(o00o0oo1);
        }
        com.google.android.exoplayer2.o000oOoO.OooOO0O oooOO0O = this.f13283OooO;
        Uri uri = oooOO0O.f12759OooO0Oo;
        o00O000o.OooO0o0(this.f12979OooO0oO);
        return new Oooo0(uri, OooO00o2, new o0OO00O((p209o00o0oo0.o00O0OO0) ((o00O0000) this.f13286OooOO0O).f39130OooO0Oo), this.f13287OooOO0o, new com.google.android.exoplayer2.drm.OooO0O0.OooO00o(this.f12976OooO0Oo.f11771OooO0OO, 0, oooO0O0), this.f13289OooOOO0, new OooOo00.OooO00o(this.f12975OooO0OO.f13060OooO0OO, 0, oooO0O0), this, o000oo0o2, oooOO0O.f12758OooO, this.f13288OooOOO);
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooOO0o() {
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    public final void OooOOo0(@Nullable o00O0OO0 o00o0oo1) {
        this.f13294OooOOoo = o00o0oo1;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        o0O0OOO0 o0o0ooo0 = this.f12979OooO0oO;
        o00O000o.OooO0o0(o0o0ooo0);
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO = this.f13287OooOO0o;
        oooO0OO.OooO0o0(looperMyLooper, o0o0ooo0);
        oooO0OO.OooO0OO();
        OooOo00();
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    public final void OooOOoo() {
        this.f13287OooOO0o.release();
    }

    public final void OooOo0(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f13291OooOOOo;
        }
        if (!this.f13290OooOOOO && this.f13291OooOOOo == j && this.f13293OooOOo0 == z && this.f13292OooOOo == z2) {
            return;
        }
        this.f13291OooOOOo = j;
        this.f13293OooOOo0 = z;
        this.f13292OooOOo = z2;
        this.f13290OooOOOO = false;
        OooOo00();
    }

    public final void OooOo00() {
        o000O0o o000o0o2 = new o000O0o(this.f13291OooOOOo, this.f13293OooOOo0, this.f13292OooOOo, this.f13284OooO0oo);
        oo0o0Oo oooO00o = o000o0o2;
        if (this.f13290OooOOOO) {
            oooO00o = new OooO00o(o000o0o2);
        }
        OooOOo(oooO00o);
    }
}
