package o0OOo000;

import android.content.Context;
import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.source.OooO0o;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.common.base.o0O0O00;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200o00o0o.o00O0000;
import p203o00o0o0o.o000O000;
import p209o00o0oo0.oo00o;
import p244o00oo0Oo.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nExoVideoPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExoVideoPlayer.kt\ncom/yalla/android/videoplayer/exoplayer/ExoVideoPlayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final class OooO0O0 implements OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function1<? super OooOO0O, Unit> f43836OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f43837OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Integer> f43838OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f43839OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f43840OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final com.google.android.exoplayer2.OooOOO f43841OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f43842OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o000oOoO f43843OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public OooOOO f43844OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public OooOO0O f43845OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public volatile AtomicBoolean f43846OooOO0O;

    public static final class OooO00o extends Lambda implements Function0<o0OOo000.OooO00o> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OOo000.OooO00o invoke() {
            return new o0OOo000.OooO00o(OooO0O0.this);
        }
    }

    public OooO0O0(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43837OooO00o = context;
        this.f43838OooO0O0 = CollectionsKt.listOf((Object[]) new Integer[]{2, 4});
        this.f43839OooO0OO = 1.0f;
        Lazy lazy = LazyKt.lazy(new OooO00o());
        this.f43842OooO0o0 = lazy;
        final DefaultRenderersFactory defaultRenderersFactory = new DefaultRenderersFactory(context);
        defaultRenderersFactory.f10903OooO0OO = true;
        Unit unit = Unit.INSTANCE;
        com.google.android.exoplayer2.OooOOO0.OooO0O0 oooO0O0 = new com.google.android.exoplayer2.OooOOO0.OooO0O0(context, new o0O0O00() { // from class: o00o0o0o.o000O00O
            @Override // com.google.common.base.o0O0O00
            public final Object get() {
                return defaultRenderersFactory;
            }
        }, new o0O0O00() { // from class: o00o0o0o.o000O0
            @Override // com.google.common.base.o0O0O00
            public final Object get() {
                return new OooO0o(context, new oo00o());
            }
        });
        final o000O000 o000o001 = new o000O000(new o00O000o(), false);
        p245o00oo0o.o00O000o.OooO0Oo(!oooO0O0.f11164OooOo00);
        oooO0O0.f11150OooO0o = new o0O0O00() { // from class: o00o0o0o.o000O0o
            @Override // com.google.common.base.o0O0O00
            public final Object get() {
                return o000o001;
            }
        };
        p245o00oo0o.o00O000o.OooO0Oo(!oooO0O0.f11164OooOo00);
        oooO0O0.f11164OooOo00 = true;
        com.google.android.exoplayer2.OooOOO oooOOO = new com.google.android.exoplayer2.OooOOO(oooO0O0, null);
        oooOOO.Ooooo00((Player.OooO0OO) lazy.getValue());
        Intrinsics.checkNotNullExpressionValue(oooOOO, "Builder(\n        context…er(exoListener)\n        }");
        this.f43841OooO0o = oooOOO;
        this.f43844OooO0oo = new OooOOO((String) null, false, 0L, 0L, 31);
        this.f43846OooOO0O = new AtomicBoolean(false);
    }

    @Override // o0OOo000.OooO0OO
    public final void OooO(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        com.google.android.exoplayer2.OooOOO oooOOO = this.f43841OooO0o;
        oooOOO.OooOooO(OooOO0(this.f43837OooO00o));
        oooOOO.OooO0OO();
        this.f43841OooO0o.Oooo00O(false);
        this.f43846OooOO0O.set(true);
    }

    @Override // o0OOo000.OooO0OO
    public final void OooO00o(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!Intrinsics.areEqual(url, this.f43844OooO0oo.f43858OooO00o)) {
            OooOOO oooOOO = this.f43844OooO0oo;
            oooOOO.getClass();
            Intrinsics.checkNotNullParameter(url, "<set-?>");
            oooOOO.f43858OooO00o = url;
            com.google.android.exoplayer2.OooOOO oooOOO2 = this.f43841OooO0o;
            oooOOO2.OooOooO(OooOO0(this.f43837OooO00o));
            oooOOO2.OooO0OO();
        } else if (this.f43841OooO0o.OooOOoo() == 4) {
            this.f43841OooO0o.o00Ooo(5, 0L);
        }
        this.f43841OooO0o.Oooo00O(true);
        this.f43846OooOO0O.set(true);
    }

    @Override // o0OOo000.OooO0OO
    public final void OooO0O0(@NotNull OooOOO value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f43844OooO0oo = value;
        this.f43843OooO0oO = o000oOoO.OooO00o(value.f43858OooO00o);
    }

    @Override // o0OOo000.OooO0OO
    public final void OooO0OO(@Nullable Function1<? super OooOO0O, Unit> function1) {
        this.f43836OooO = function1;
    }

    @Override // o0OOo000.OooO0OO
    @NotNull
    public final AtomicBoolean OooO0Oo() {
        return this.f43846OooOO0O;
    }

    @Override // o0OOo000.OooO0OO
    public final void OooO0o(boolean z) {
        com.google.android.exoplayer2.OooOOO oooOOO = this.f43841OooO0o;
        if (z) {
            oooOOO.stop();
            oooOOO.OoooO0O();
        } else {
            oooOOO.stop();
        }
        OooOO0O();
    }

    @Override // o0OOo000.OooO0OO
    @NotNull
    public final OooOOO OooO0o0() {
        return this.f43844OooO0oo;
    }

    @Override // o0OOo000.OooO0OO
    public final void OooO0oO(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f43839OooO0OO = f;
        if (this.f43840OooO0Oo) {
            return;
        }
        this.f43841OooO0o.OooOOOo(f);
    }

    @Override // o0OOo000.OooO0OO
    public final void OooO0oo(boolean z) {
        this.f43840OooO0Oo = z;
        com.google.android.exoplayer2.OooOOO oooOOO = this.f43841OooO0o;
        if (z) {
            oooOOO.OooOOOo(0.0f);
        } else {
            oooOOO.OooOOOo(this.f43839OooO0OO);
        }
    }

    public final com.google.android.exoplayer2.source.OooO00o OooOO0(Context context) {
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO;
        com.google.android.exoplayer2.source.OooO00o clippingMediaSource;
        DefaultDrmSessionManager defaultDrmSessionManagerOooO0O0;
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO2;
        CacheDataSource.OooO00o oooO00o = new CacheDataSource.OooO00o();
        oooO00o.f14298OooO00o = OooOOO0.OooO00o(context);
        oooO00o.f14300OooO0OO = new com.google.android.exoplayer2.upstream.OooO0O0.OooO00o(context);
        oooO00o.f14301OooO0Oo = 2;
        Intrinsics.checkNotNullExpressionValue(oooO00o, "Factory().setCache(Video…AG_IGNORE_CACHE_ON_ERROR)");
        OooOOO oooOOO = this.f43844OooO0oo;
        if (oooOOO.f43859OooO0O0) {
            this.f43843OooO0oO = o000oOoO.OooO00o(oooOOO.f43858OooO00o);
            o00O0000 o00o0001 = new o00O0000(new oo00o());
            Object obj = new Object();
            com.google.android.exoplayer2.upstream.OooO oooO = new com.google.android.exoplayer2.upstream.OooO();
            o000oOoO o000oooo2 = this.f43843OooO0oO;
            Intrinsics.checkNotNull(o000oooo2);
            o000oooo2.f12670OooO0o0.getClass();
            Object obj2 = o000oooo2.f12670OooO0o0.f12765OooOO0O;
            o000oooo2.f12670OooO0o0.getClass();
            o000oOoO.OooO oooO2 = o000oooo2.f12670OooO0o0.f12760OooO0o;
            if (oooO2 == null || o0O00.f40595OooO00o < 18) {
                oooO0OO2 = com.google.android.exoplayer2.drm.OooO0OO.f11774OooO00o;
            } else {
                synchronized (obj) {
                    defaultDrmSessionManagerOooO0O0 = o0O00.OooO00o(oooO2, null) ? null : com.google.android.exoplayer2.drm.OooO00o.OooO0O0(oooO2);
                    defaultDrmSessionManagerOooO0O0.getClass();
                }
                oooO0OO2 = defaultDrmSessionManagerOooO0O0;
            }
            com.google.android.exoplayer2.source.o000oOoO o000oooo3 = new com.google.android.exoplayer2.source.o000oOoO(o000oooo2, oooO00o, o00o0001, oooO0OO2, oooO, ZegoConstants.ErrorMask.RoomServerErrorMask);
            OooOOO oooOOO2 = this.f43844OooO0oo;
            long j = 1000;
            clippingMediaSource = new ClippingMediaSource(o000oooo3, oooOOO2.f43861OooO0Oo * j, oooOOO2.f43862OooO0o0 * j, true, true, true);
        } else {
            this.f43843OooO0oO = o000oOoO.OooO00o(oooOOO.f43858OooO00o);
            o00O0000 o00o0002 = new o00O0000(new oo00o());
            Object obj3 = new Object();
            com.google.android.exoplayer2.upstream.OooO oooO3 = new com.google.android.exoplayer2.upstream.OooO();
            o000oOoO o000oooo4 = this.f43843OooO0oO;
            Intrinsics.checkNotNull(o000oooo4);
            o000oooo4.f12670OooO0o0.getClass();
            Object obj4 = o000oooo4.f12670OooO0o0.f12765OooOO0O;
            o000oooo4.f12670OooO0o0.getClass();
            o000oOoO.OooO oooO4 = o000oooo4.f12670OooO0o0.f12760OooO0o;
            if (oooO4 == null || o0O00.f40595OooO00o < 18) {
                oooO0OO = com.google.android.exoplayer2.drm.OooO0OO.f11774OooO00o;
            } else {
                synchronized (obj3) {
                    defaultDrmSessionManagerOooO0O0 = o0O00.OooO00o(oooO4, null) ? null : com.google.android.exoplayer2.drm.OooO00o.OooO0O0(oooO4);
                    defaultDrmSessionManagerOooO0O0.getClass();
                }
                oooO0OO = defaultDrmSessionManagerOooO0O0;
            }
            com.google.android.exoplayer2.source.o000oOoO o000oooo5 = new com.google.android.exoplayer2.source.o000oOoO(o000oooo4, oooO00o, o00o0002, oooO0OO, oooO3, ZegoConstants.ErrorMask.RoomServerErrorMask);
            Intrinsics.checkNotNullExpressionValue(o000oooo5, "{\n                mediaI…ediaItem!!)\n            }");
            clippingMediaSource = o000oooo5;
        }
        return this.f43844OooO0oo.f43860OooO0OO == Integer.MAX_VALUE ? new com.google.android.exoplayer2.source.OooOO0(clippingMediaSource, Integer.MAX_VALUE) : clippingMediaSource;
    }

    public final void OooOO0O() {
        this.f43843OooO0oO = null;
        OooOOO oooOOO = this.f43844OooO0oo;
        oooOOO.getClass();
        Intrinsics.checkNotNullParameter("", "<set-?>");
        oooOOO.f43858OooO00o = "";
        oooOOO.f43859OooO0O0 = false;
        oooOOO.f43860OooO0OO = Integer.MAX_VALUE;
        oooOOO.f43861OooO0Oo = -1L;
        oooOOO.f43862OooO0o0 = -1L;
        this.f43846OooOO0O.set(false);
    }

    @Override // o0OOo000.OooO0OO
    public final long getDuration() {
        return this.f43841OooO0o.getDuration();
    }

    @Override // o0OOo000.OooO0OO
    @NotNull
    public final com.google.android.exoplayer2.OooOOO0 getPlayer() {
        return this.f43841OooO0o;
    }

    @Override // o0OOo000.OooO0OO
    public final boolean isPlaying() {
        return this.f43841OooO0o.isPlaying();
    }

    @Override // o0OOo000.OooO0OO
    public final void pause() {
        com.google.android.exoplayer2.OooOOO oooOOO = this.f43841OooO0o;
        oooOOO.Oooo00O(false);
        oooOOO.Oooo00O(false);
    }

    @Override // o0OOo000.OooO0OO
    public final void release() {
        this.f43841OooO0o.release();
        OooOO0O();
    }
}
