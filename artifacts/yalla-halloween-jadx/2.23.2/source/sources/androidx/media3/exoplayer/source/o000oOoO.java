package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.o000OOo0;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.concurrent.ExecutorService;
import o000O.o0OOO0o;
import o000O0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000oOoO extends androidx.media3.exoplayer.source.OooO00o implements Oooo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final androidx.media3.common.OooOOO0.OooOO0O f8025OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final androidx.media3.common.OooOOO0 f8026OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o f8027OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Oooo000.OooO00o f8028OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.OooO0OO f8029OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f8030OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f8031OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f8032OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f8033OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f8034OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f8035OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public o000O0O.OooOo f8036OooOOoo;

    public class OooO00o extends o000O.OooOo00 {
        public OooO00o(o0OOO0o o0ooo0o2) {
            super(o0ooo0o2);
        }

        @Override // o000O.OooOo00, androidx.media3.common.Oooo0
        public final androidx.media3.common.Oooo0.OooO0O0 OooOO0(int i, androidx.media3.common.Oooo0.OooO0O0 oooO0O0, boolean z) {
            super.OooOO0(i, oooO0O0, z);
            oooO0O0.f6640OooO = true;
            return oooO0O0;
        }

        @Override // o000O.OooOo00, androidx.media3.common.Oooo0
        public final androidx.media3.common.Oooo0.OooO0o OooOOo(int i, androidx.media3.common.Oooo0.OooO0o oooO0o, long j) {
            super.OooOOo(i, oooO0o, j);
            oooO0o.f6679OooOOOO = true;
            return oooO0o;
        }
    }

    public static final class OooO0O0 implements OooOOOO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o f8037OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Oooo000.OooO00o f8038OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o000OO0O.OooOO0O f8039OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public LoadErrorHandlingPolicy f8040OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f8041OooO0o0;

        public OooO0O0(androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00o, o000OOoO.o0OoOo0 o0oooo1) {
            o000OOo0 o000ooo1 = new o000OOo0(o0oooo1);
            androidx.media3.exoplayer.drm.OooO00o oooO00o = new androidx.media3.exoplayer.drm.OooO00o();
            androidx.media3.exoplayer.upstream.OooO00o oooO00o2 = new androidx.media3.exoplayer.upstream.OooO00o();
            this.f8037OooO00o = interfaceC0142OooO00o;
            this.f8038OooO0O0 = o000ooo1;
            this.f8039OooO0OO = oooO00o;
            this.f8040OooO0Oo = oooO00o2;
            this.f8041OooO0o0 = ZegoConstants.ErrorMask.RoomServerErrorMask;
        }

        @Override // androidx.media3.exoplayer.source.OooOOOO.OooO00o
        public final OooOOOO OooO00o(androidx.media3.common.OooOOO0 oooOOO0) {
            oooOOO0.f6486OooO0o0.getClass();
            return new o000oOoO(oooOOO0, this.f8037OooO00o, this.f8038OooO0O0, this.f8039OooO0OO.OooO00o(oooOOO0), this.f8040OooO0Oo, this.f8041OooO0o0);
        }

        @Override // androidx.media3.exoplayer.source.OooOOOO.OooO00o
        @CanIgnoreReturnValue
        public final OooOOOO.OooO00o OooO0O0(o000OO0O.OooOO0O oooOO0O) {
            if (oooOO0O == null) {
                throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.f8039OooO0OO = oooOO0O;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.OooOOOO.OooO00o
        public final OooOOOO.OooO00o OooO0OO(p074o000OO0o.o00oO0o o00oo0o2) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.OooOOOO.OooO00o
        @CanIgnoreReturnValue
        public final OooOOOO.OooO00o OooO0Oo(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.f8040OooO0Oo = loadErrorHandlingPolicy;
            return this;
        }
    }

    public o000oOoO(androidx.media3.common.OooOOO0 oooOOO0, androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00o, Oooo000.OooO00o oooO00o, androidx.media3.exoplayer.drm.OooO0OO oooO0OO, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i) {
        androidx.media3.common.OooOOO0.OooOO0O oooOO0O = oooOOO0.f6486OooO0o0;
        oooOO0O.getClass();
        this.f8025OooO = oooOO0O;
        this.f8026OooO0oo = oooOOO0;
        this.f8027OooOO0 = interfaceC0142OooO00o;
        this.f8028OooOO0O = oooO00o;
        this.f8029OooOO0o = oooO0OO;
        this.f8031OooOOO0 = loadErrorHandlingPolicy;
        this.f8030OooOOO = i;
        this.f8032OooOOOO = true;
        this.f8033OooOOOo = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final OooOOO OooO0OO(OooOOOO.OooO0O0 oooO0O0, p074o000OO0o.o00Oo0 o00oo1, long j) {
        androidx.media3.datasource.OooO00o OooO00o2 = this.f8027OooOO0.OooO00o();
        o000O0O.OooOo oooOo = this.f8036OooOOoo;
        if (oooOo != null) {
            OooO00o2.OooO0oO(oooOo);
        }
        androidx.media3.common.OooOOO0.OooOO0O oooOO0O = this.f8025OooO;
        Uri uri = oooOO0O.f6575OooO0Oo;
        p080o000OoO.o00Oo0.OooO0o(this.f7878OooO0oO);
        return new Oooo0(uri, OooO00o2, new o000O.OooO00o((o000OOoO.o0OoOo0) ((o000OOo0) this.f8028OooOO0O).f3706OooO0Oo), this.f8029OooOO0o, new androidx.media3.exoplayer.drm.OooO0O0.OooO00o(this.f7875OooO0Oo.f7641OooO0OO, 0, oooO0O0), this.f8031OooOOO0, new OooOo00.OooO00o(this.f7874OooO0OO.f7959OooO0OO, 0, oooO0O0), this, o00oo1, oooOO0O.f6574OooO, this.f8030OooOOO);
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final androidx.media3.common.OooOOO0 OooO0Oo() {
        return this.f8026OooO0oo;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO0oO(OooOOO oooOOO) {
        Oooo0 oooo0 = (Oooo0) oooOOO;
        if (oooo0.f7986OooOoO0) {
            for (o00O0O o00o0o2 : oooo0.f7983OooOo0O) {
                o00o0o2.OooO0oO();
                DrmSession drmSession = o00o0o2.f8050OooO0oo;
                if (drmSession != null) {
                    drmSession.OooO0o0(o00o0o2.f8048OooO0o0);
                    o00o0o2.f8050OooO0oo = null;
                    o00o0o2.f8049OooO0oO = null;
                }
            }
        }
        Loader loader = oooo0.f7973OooOOO;
        Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f8256OooO0O0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(true);
        }
        Loader.OooOO0 oooOO1 = new Loader.OooOO0(oooo0);
        ExecutorService executorService = loader.f8255OooO00o;
        executorService.execute(oooOO1);
        executorService.shutdown();
        oooo0.f7979OooOOoo.removeCallbacksAndMessages(null);
        oooo0.f7982OooOo00 = null;
        oooo0.f8001Oooo0oo = true;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooOO0o() {
    }

    @Override // androidx.media3.exoplayer.source.OooO00o
    public final void OooOOo0(@Nullable o000O0O.OooOo oooOo) {
        this.f8036OooOOoo = oooOo;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        o0oOO o0ooo2 = this.f7878OooO0oO;
        p080o000OoO.o00Oo0.OooO0o(o0ooo2);
        androidx.media3.exoplayer.drm.OooO0OO oooO0OO = this.f8029OooOO0o;
        oooO0OO.OooO00o(looperMyLooper, o0ooo2);
        oooO0OO.OooO0o0();
        OooOo00();
    }

    @Override // androidx.media3.exoplayer.source.OooO00o
    public final void OooOOoo() {
        this.f8029OooOO0o.release();
    }

    public final void OooOo0(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f8033OooOOOo;
        }
        if (!this.f8032OooOOOO && this.f8033OooOOOo == j && this.f8035OooOOo0 == z && this.f8034OooOOo == z2) {
            return;
        }
        this.f8033OooOOOo = j;
        this.f8035OooOOo0 = z;
        this.f8034OooOOo = z2;
        this.f8032OooOOOO = false;
        OooOo00();
    }

    public final void OooOo00() {
        o0OOO0o o0ooo0o2 = new o0OOO0o(this.f8033OooOOOo, this.f8035OooOOo0, this.f8034OooOOo, this.f8026OooO0oo);
        androidx.media3.common.Oooo0 oooO00o = o0ooo0o2;
        if (this.f8032OooOOOO) {
            oooO00o = new OooO00o(o0ooo0o2);
        }
        OooOOo(oooO00o);
    }
}
