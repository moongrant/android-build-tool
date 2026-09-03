package p363o0OOo00O;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.FloatRange;
import androidx.camera.core.impl.o000OOo0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.OooOOO0;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.OooO;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.OooO0OO;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.OooOO0;
import androidx.media3.exoplayer.source.o000oOoO;
import com.google.common.base.o000OOo;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.Oooo0;
import o000OOoO.OooOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p074o000OO0o.o0ooOOo;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nExoVideoPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExoVideoPlayer.kt\ncom/yalla/android/videoplayer/exoplayer/ExoVideoPlayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1#2:292\n*E\n"})
public final class OooO0o implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function1<? super OooOOO, Unit> f43011OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f43012OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Integer> f43013OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f43014OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f43015OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooO f43016OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f43017OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooOOO0 f43018OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public OooOo f43019OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public OooOOO f43020OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public volatile AtomicBoolean f43021OooOO0O;

    public static final class OooO00o extends Lambda implements Function0<OooO0OO> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0OO invoke() {
            return new OooO0OO(OooO0o.this);
        }
    }

    public OooO0o(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43012OooO00o = context;
        this.f43013OooO0O0 = CollectionsKt.listOf((Object[]) new Integer[]{2, 4});
        this.f43014OooO0OO = 1.0f;
        Lazy lazy = LazyKt.lazy(new OooO00o());
        this.f43017OooO0o0 = lazy;
        final DefaultRenderersFactory defaultRenderersFactory = new DefaultRenderersFactory(context);
        defaultRenderersFactory.f7107OooO0OO = true;
        Unit unit = Unit.INSTANCE;
        androidx.media3.exoplayer.OooO0o.OooO0O0 oooO0O0 = new androidx.media3.exoplayer.OooO0o.OooO0O0(context, new o000OOo() { // from class: o000O00O.o00Ooo
            @Override // com.google.common.base.o000OOo
            public final Object get() {
                return defaultRenderersFactory;
            }
        }, new o000OOo() { // from class: o000O00O.oo000o
            @Override // com.google.common.base.o000OOo
            public final Object get() {
                return new androidx.media3.exoplayer.source.OooO0o(context, new o000OOoO.OooOOO());
            }
        });
        final Oooo0 oooo0 = new Oooo0(new o0ooOOo(), false);
        o00Oo0.OooO0Oo(!oooO0O0.f7234OooOo00);
        oooO0O0.f7220OooO0o = new o000OOo() { // from class: o000O00O.o0OoOo0
            @Override // com.google.common.base.o000OOo
            public final Object get() {
                return oooo0;
            }
        };
        OooO oooOOooO00o = oooO0O0.OooO00o();
        oooOOooO00o.OooOOoo((Player.OooO0OO) lazy.getValue());
        Intrinsics.checkNotNullExpressionValue(oooOOooO00o, "also(...)");
        this.f43016OooO0o = oooOOooO00o;
        this.f43019OooO0oo = new OooOo((String) null, false, 0L, 0L, 31);
        this.f43021OooOO0O = new AtomicBoolean(false);
    }

    @Override // p363o0OOo00O.OooO
    public final void OooO(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        OooO oooO = this.f43016OooO0o;
        oooO.o0ooOO0(OooOO0(this.f43012OooO00o, this.f43019OooO0oo));
        oooO.OooO0o0();
        this.f43016OooO0o.o0OOO0o(false);
        this.f43021OooOO0O.set(true);
    }

    @Override // p363o0OOo00O.OooO
    public final void OooO00o(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!Intrinsics.areEqual(url, this.f43019OooO0oo.f43056OooO00o)) {
            OooOo oooOo = this.f43019OooO0oo;
            oooOo.getClass();
            Intrinsics.checkNotNullParameter(url, "<set-?>");
            oooOo.f43056OooO00o = url;
            OooO oooO = this.f43016OooO0o;
            oooO.o0ooOO0(OooOO0(this.f43012OooO00o, this.f43019OooO0oo));
            oooO.OooO0o0();
        } else if (this.f43016OooO0o.Oooo0o() == 4) {
            this.f43016OooO0o.Ooooo0o(5, 0L);
        }
        this.f43016OooO0o.OooO0Oo();
        this.f43021OooOO0O.set(true);
    }

    @Override // p363o0OOo00O.OooO
    public final void OooO0O0(@Nullable Function1<? super OooOOO, Unit> function1) {
        this.f43011OooO = function1;
    }

    @Override // p363o0OOo00O.OooO
    @NotNull
    public final AtomicBoolean OooO0OO() {
        return this.f43021OooOO0O;
    }

    @Override // p363o0OOo00O.OooO
    public final void OooO0Oo(@NotNull OooOo oooOo) {
        Intrinsics.checkNotNullParameter(oooOo, "<set-?>");
        this.f43019OooO0oo = oooOo;
    }

    @Override // p363o0OOo00O.OooO
    public final void OooO0o(boolean z) {
        OooO oooO = this.f43016OooO0o;
        if (z) {
            oooO.oo0o0Oo();
            oooO.OooO0OO();
        } else {
            oooO.oo0o0Oo();
        }
        OooOO0O();
    }

    @Override // p363o0OOo00O.OooO
    @NotNull
    public final OooOo OooO0o0() {
        return this.f43019OooO0oo;
    }

    @Override // p363o0OOo00O.OooO
    public final void OooO0oO(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f43014OooO0OO = f;
        if (this.f43015OooO0Oo) {
            return;
        }
        this.f43016OooO0o.o0OO00O(f);
    }

    @Override // p363o0OOo00O.OooO
    public final void OooO0oo(boolean z) {
        this.f43015OooO0Oo = z;
        OooO oooO = this.f43016OooO0o;
        if (z) {
            oooO.o0OO00O(0.0f);
        } else {
            oooO.o0OO00O(this.f43014OooO0OO);
        }
    }

    public final androidx.media3.exoplayer.source.OooO00o OooOO0(Context context, OooOo oooOo) {
        androidx.media3.exoplayer.source.OooO00o o000oooo2;
        OooO0OO oooO0OO;
        DefaultDrmSessionManager defaultDrmSessionManagerOooO0O0;
        OooO0OO oooO0OO2;
        if (oooOo.f43057OooO0O0) {
            OooOOO0.OooO0O0 oooO0O0 = new OooOOO0.OooO0O0();
            String str = oooOo.f43056OooO00o;
            oooO0O0.f6520OooO0O0 = str == null ? null : Uri.parse(str);
            oooO0O0.f6525OooO0oO = oooOo.f43056OooO00o;
            this.f43018OooO0oO = oooO0O0.OooO00o();
            androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00oOooO0O0 = OooOo00.f43061OooO00o.OooO0O0(context);
            o000OOo0 o000ooo1 = new o000OOo0(new OooOOO());
            Object obj = new Object();
            androidx.media3.exoplayer.upstream.OooO00o oooO00o = new androidx.media3.exoplayer.upstream.OooO00o();
            OooOOO0 oooOOO0 = this.f43018OooO0oO;
            Intrinsics.checkNotNull(oooOOO0);
            oooOOO0.f6486OooO0o0.getClass();
            oooOOO0.f6486OooO0o0.getClass();
            OooOOO0.OooO oooO = oooOOO0.f6486OooO0o0.f6576OooO0o;
            if (oooO == null || o00.f34910OooO00o < 18) {
                oooO0OO2 = OooO0OO.f7644OooO00o;
            } else {
                synchronized (obj) {
                    defaultDrmSessionManagerOooO0O0 = o00.OooO00o(oooO, null) ? null : androidx.media3.exoplayer.drm.OooO00o.OooO0O0(oooO);
                    defaultDrmSessionManagerOooO0O0.getClass();
                }
                oooO0OO2 = defaultDrmSessionManagerOooO0O0;
            }
            long j = 1000;
            o000oooo2 = new ClippingMediaSource(new o000oOoO(oooOOO0, interfaceC0142OooO00oOooO0O0, o000ooo1, oooO0OO2, oooO00o, ZegoConstants.ErrorMask.RoomServerErrorMask), oooOo.f43059OooO0Oo * j, oooOo.f43060OooO0o0 * j, true, true, true);
        } else {
            OooOOO0.OooO0O0 oooO0O1 = new OooOOO0.OooO0O0();
            String str2 = oooOo.f43056OooO00o;
            oooO0O1.f6520OooO0O0 = str2 == null ? null : Uri.parse(str2);
            oooO0O1.f6525OooO0oO = oooOo.f43056OooO00o;
            this.f43018OooO0oO = oooO0O1.OooO00o();
            androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00oOooO0O1 = OooOo00.f43061OooO00o.OooO0O0(context);
            o000OOo0 o000ooo2 = new o000OOo0(new OooOOO());
            Object obj2 = new Object();
            androidx.media3.exoplayer.upstream.OooO00o oooO00o2 = new androidx.media3.exoplayer.upstream.OooO00o();
            OooOOO0 oooOOO1 = this.f43018OooO0oO;
            Intrinsics.checkNotNull(oooOOO1);
            oooOOO1.f6486OooO0o0.getClass();
            oooOOO1.f6486OooO0o0.getClass();
            OooOOO0.OooO oooO2 = oooOOO1.f6486OooO0o0.f6576OooO0o;
            if (oooO2 == null || o00.f34910OooO00o < 18) {
                oooO0OO = OooO0OO.f7644OooO00o;
            } else {
                synchronized (obj2) {
                    defaultDrmSessionManagerOooO0O0 = o00.OooO00o(oooO2, null) ? null : androidx.media3.exoplayer.drm.OooO00o.OooO0O0(oooO2);
                    defaultDrmSessionManagerOooO0O0.getClass();
                }
                oooO0OO = defaultDrmSessionManagerOooO0O0;
            }
            o000oooo2 = new o000oOoO(oooOOO1, interfaceC0142OooO00oOooO0O1, o000ooo2, oooO0OO, oooO00o2, ZegoConstants.ErrorMask.RoomServerErrorMask);
            Intrinsics.checkNotNull(o000oooo2);
        }
        return oooOo.f43058OooO0OO == Integer.MAX_VALUE ? new OooOO0(o000oooo2, Integer.MAX_VALUE) : o000oooo2;
    }

    public final void OooOO0O() {
        this.f43018OooO0oO = null;
        OooOo oooOo = this.f43019OooO0oo;
        oooOo.getClass();
        Intrinsics.checkNotNullParameter("", "<set-?>");
        oooOo.f43056OooO00o = "";
        oooOo.f43057OooO0O0 = false;
        oooOo.f43058OooO0OO = Integer.MAX_VALUE;
        oooOo.f43059OooO0Oo = -1L;
        oooOo.f43060OooO0o0 = -1L;
        this.f43021OooOO0O.set(false);
    }

    @Override // p363o0OOo00O.OooO
    public final long getDuration() {
        return this.f43016OooO0o.o00Oo0();
    }

    @Override // p363o0OOo00O.OooO
    @NotNull
    public final androidx.media3.exoplayer.OooO0o getPlayer() {
        return this.f43016OooO0o;
    }

    @Override // p363o0OOo00O.OooO
    public final boolean isPlaying() {
        return this.f43016OooO0o.isPlaying();
    }

    @Override // p363o0OOo00O.OooO
    public final void pause() {
        OooO oooO = this.f43016OooO0o;
        oooO.pause();
        oooO.o0OOO0o(false);
    }

    @Override // p363o0OOo00O.OooO
    public final void release() {
        this.f43016OooO0o.release();
        OooOO0O();
    }
}
