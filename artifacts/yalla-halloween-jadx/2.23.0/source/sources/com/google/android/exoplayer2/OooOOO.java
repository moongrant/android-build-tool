package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p022Oooo00O.o0OO000o;
import p037OoooOo0.o000OOo0;
import p038OoooOoO.o000OO;
import p200o00o0o.o0O0OOO0;
import p203o00o0o0o.o00;
import p203o00o0o0o.o000OO00;
import p203o00o0o0o.o00O0O00;
import p203o00o0o0o.o00O0OO0;
import p203o00o0o0o.o00OO000;
import p203o00o0o0o.o00OO00O;
import p203o00o0o0o.o00OO0OO;
import p203o00o0o0o.o00OOO0;
import p203o00o0o0o.o0O000o0;
import p203o00o0o0o.o0O00O0o;
import p203o00o0o0o.o0O00OO;
import p203o00o0o0o.o0O0O0O;
import p203o00o0o0o.o0O0ooO;
import p203o00o0o0o.o0oO0O0o;
import p203o00o0o0o.o0oOO;
import p203o00o0o0o.oo00o;
import p203o00o0o0o.oo0o0O0;
import p206o00o0oOO.o0;
import p230o00oOoO0.o0000O0O;
import p230o00oOoO0.o000O0;
import p241o00oo0O.o00O000;
import p241o00oo0O.o00oOoo;
import p244o00oo0Oo.o000O;
import p245o00oo0o.o00O;
import p245o00oo0o.o00O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00O00OO;
import p245o00oo0o.o00O0OO;
import p245o00oo0o.o00O0OOO;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O00o0;
import p245o00oo0o.o0O0o;
import p247o00oo0oO.o00OO;
import p247o00oo0oO.o0oOOo;
import p247o00oo0oO.oo00oO;
import p247o00oo0oO.oo0O;
import p636o0ooOO.O0O0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOOO extends com.google.android.exoplayer2.OooO0OO implements OooOOO0 {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final /* synthetic */ int f11076o0OoOo0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O0OOO f11077OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O000 f11078OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Player.OooO00o f11079OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0 f11080OooO0Oo = new o00O0();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Player f11081OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f11082OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Renderer[] f11083OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00oOoo f11084OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00O0O00 f11085OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOo00 f11086OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o00O<Player.OooO0OO> f11087OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final oo0o0Oo.OooO0O0 f11088OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final CopyOnWriteArraySet<OooOOO0.OooO00o> f11089OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ArrayList f11090OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f11091OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final p200o00o0o.o00O0O f11092OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.OooOOOO.OooO00o f11093OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Looper f11094OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f11095OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final long f11096OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o000O f11097OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final long f11098OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o0O0o f11099OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final com.google.android.exoplayer2.OooO0O0 f11100OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f11101OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AudioFocusManager f11102OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final o0oO0O0o f11103OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final o0O0O0O f11104OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final long f11105OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f11106OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Object f11107Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f11108Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f11109Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f11110Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f11111Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f11112Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final o0O00OO f11113Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Player.OooO00o f11114Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public com.google.android.exoplayer2.source.o00Ooo f11115Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public MediaMetadata f11116Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public AudioTrack f11117Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f11118OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public SurfaceHolder f11119OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Surface f11120OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public SphericalGLSurfaceView f11121OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public TextureView f11122OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public o0O00o0 f11123OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final int f11124OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.OooO00o f11125OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f11126OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f11127OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public o0000O0O f11128Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final boolean f11129Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f11130OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f11131OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public o0oOOo f11132OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public o0O000o0 f11133Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public MediaMetadata f11134Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f11135OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public long f11136Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int f11137o000oOoO;

    @RequiresApi(31)
    public static final class OooO00o {
        @DoNotInline
        public static o0O0OOO0 OooO00o(Context context, OooOOO oooOOO, boolean z) {
            MediaMetricsManager mediaMetricsManagerOooO0O0 = androidx.core.view.OooOOOO.OooO0O0(context.getSystemService("media_metrics"));
            com.google.android.exoplayer2.analytics.OooO0OO oooO0OO = mediaMetricsManagerOooO0O0 == null ? null : new com.google.android.exoplayer2.analytics.OooO0OO(context, mediaMetricsManagerOooO0O0.createPlaybackSession());
            if (oooO0OO == null) {
                Log.OooO0o("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new o0O0OOO0(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                oooOOO.getClass();
                oooOOO.f11092OooOOo.OooOoO(oooO0OO);
            }
            return new o0O0OOO0(oooO0OO.f11408OooO0OO.getSessionId());
        }
    }

    public final class OooO0O0 implements oo00oO, com.google.android.exoplayer2.audio.OooO0o, o000O0, O0O0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.OooO0O0, AudioFocusManager.OooO0O0, com.google.android.exoplayer2.OooO0O0.InterfaceC0196OooO0O0, OooOOO0.OooO00o {
        public OooO0O0() {
        }

        @Override // p247o00oo0oO.oo00oO
        public final void OooO(long j, Object obj) {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.f11092OooOOo.OooO(j, obj);
            if (oooOOO.f11107Oooo == obj) {
                oooOOO.f11087OooOO0o.OooO0o0(26, new androidx.compose.animation.OooOo00());
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.OooO0O0
        public final void OooO00o() {
            OooOOO.this.o00000(null);
        }

        @Override // p247o00oo0oO.oo00oO
        public final void OooO0O0(o0 o0Var) {
            OooOOO.this.f11092OooOOo.OooO0O0(o0Var);
        }

        @Override // p247o00oo0oO.oo00oO
        public final void OooO0OO(String str) {
            OooOOO.this.f11092OooOOo.OooO0OO(str);
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final void OooO0Oo(String str) {
            OooOOO.this.f11092OooOOo.OooO0Oo(str);
        }

        @Override // p247o00oo0oO.oo00oO
        public final void OooO0o(OooOo oooOo, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.getClass();
            oooOOO.f11092OooOOo.OooO0o(oooOo, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final void OooO0o0(Exception exc) {
            OooOOO.this.f11092OooOOo.OooO0o0(exc);
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final void OooO0oO(long j) {
            OooOOO.this.f11092OooOOo.OooO0oO(j);
        }

        @Override // p247o00oo0oO.oo00oO
        public final void OooO0oo(Exception exc) {
            OooOOO.this.f11092OooOOo.OooO0oo(exc);
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final /* synthetic */ void OooOO0() {
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.OooO0O0
        public final void OooOO0O(Surface surface) {
            OooOOO.this.o00000(surface);
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final void OooOO0o(long j, long j2, String str) {
            OooOOO.this.f11092OooOOo.OooOO0o(j, j2, str);
        }

        @Override // p247o00oo0oO.oo00oO
        public final void OooOOO(int i, long j) {
            OooOOO.this.f11092OooOOo.OooOOO(i, j);
        }

        @Override // p247o00oo0oO.oo00oO
        public final void OooOOO0(int i, long j) {
            OooOOO.this.f11092OooOOo.OooOOO0(i, j);
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final void OooOOOO(OooOo oooOo, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.getClass();
            oooOOO.f11092OooOOo.OooOOOO(oooOo, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final void OooOOOo(o0 o0Var) {
            OooOOO.this.f11092OooOOo.OooOOOo(o0Var);
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final void OooOOo(o0 o0Var) {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.getClass();
            oooOOO.f11092OooOOo.OooOOo(o0Var);
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final void OooOOo0(Exception exc) {
            OooOOO.this.f11092OooOOo.OooOOo0(exc);
        }

        @Override // p247o00oo0oO.oo00oO
        public final void OooOOoo(o0 o0Var) {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.getClass();
            oooOOO.f11092OooOOo.OooOOoo(o0Var);
        }

        @Override // com.google.android.exoplayer2.OooOOO0.OooO00o
        public final void OooOo() {
            OooOOO.this.o00000o0();
        }

        @Override // p247o00oo0oO.oo00oO
        public final void OooOo0(long j, long j2, String str) {
            OooOOO.this.f11092OooOOo.OooOo0(j, j2, str);
        }

        @Override // p247o00oo0oO.oo00oO
        public final /* synthetic */ void OooOo00() {
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final void OooOo0O(int i, long j, long j2) {
            OooOOO.this.f11092OooOOo.OooOo0O(i, j, j2);
        }

        @Override // p230o00oOoO0.o000O0
        public final void OooOo0o(ImmutableList immutableList) {
            OooOOO.this.f11087OooOO0o.OooO0o0(27, new o00OO00O(immutableList));
        }

        @Override // p230o00oOoO0.o000O0
        public final void onCues(o0000O0O o0000o0o2) {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.f11128Ooooo00 = o0000o0o2;
            oooOOO.f11087OooOO0o.OooO0o0(27, new o000OO(o0000o0o2));
        }

        @Override // p636o0ooOO.O0O0
        public final void onMetadata(Metadata metadata) {
            OooOOO oooOOO = OooOOO.this;
            MediaMetadata mediaMetadata = oooOOO.f11134Oooooo0;
            mediaMetadata.getClass();
            MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o(mediaMetadata);
            int i = 0;
            int i2 = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f12530OooO0Oo;
                if (i2 >= entryArr.length) {
                    break;
                }
                entryArr[i2].OooooOo(oooO00o);
                i2++;
            }
            oooOOO.f11134Oooooo0 = new MediaMetadata(oooO00o);
            MediaMetadata mediaMetadataOo000o = oooOOO.oo000o();
            boolean zEquals = mediaMetadataOo000o.equals(oooOOO.f11116Oooo0oO);
            o00O<Player.OooO0OO> o00o2 = oooOOO.f11087OooOO0o;
            if (!zEquals) {
                oooOOO.f11116Oooo0oO = mediaMetadataOo000o;
                o00o2.OooO0OO(14, new p203o00o0o0o.o00O(this, i));
            }
            o00o2.OooO0OO(28, new o00OO000(metadata));
            o00o2.OooO0O0();
        }

        @Override // com.google.android.exoplayer2.audio.OooO0o
        public final void onSkipSilenceEnabledChanged(final boolean z) {
            OooOOO oooOOO = OooOOO.this;
            if (oooOOO.f11127OoooOoo == z) {
                return;
            }
            oooOOO.f11127OoooOoo = z;
            oooOOO.f11087OooOO0o.OooO0o0(23, new o00O.OooO00o() { // from class: o00o0o0o.oo0O
                @Override // o00oo0o.o00O.OooO00o
                public final void invoke(Object obj) {
                    ((Player.OooO0OO) obj).onSkipSilenceEnabledChanged(z);
                }
            });
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.getClass();
            Surface surface = new Surface(surfaceTexture);
            oooOOO.o00000(surface);
            oooOOO.f11120OoooO00 = surface;
            oooOOO.o0O0O00(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.o00000(null);
            oooOOO.o0O0O00(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            OooOOO.this.o0O0O00(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // p247o00oo0oO.oo00oO
        public final void onVideoSizeChanged(o0oOOo o0oooo) {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.f11132OooooOo = o0oooo;
            oooOOO.f11087OooOO0o.OooO0o0(25, new o00OO0OO(o0oooo));
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            OooOOO.this.o0O0O00(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            OooOOO oooOOO = OooOOO.this;
            if (oooOOO.f11118OoooO) {
                oooOOO.o00000(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            OooOOO oooOOO = OooOOO.this;
            if (oooOOO.f11118OoooO) {
                oooOOO.o00000(null);
            }
            oooOOO.o0O0O00(0, 0);
        }
    }

    public static final class OooO0OO implements o00OO, o0O0o.OooO00o, oo000o.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public o00OO f11139OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public o00OO f11140OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public o0O0o.OooO00o f11141OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public o0O0o.OooO00o f11142OooO0oO;

        @Override // o0O0o.OooO00o
        public final void OooO00o(float[] fArr, long j) {
            o0O0o.OooO00o oooO00o = this.f11142OooO0oO;
            if (oooO00o != null) {
                oooO00o.OooO00o(fArr, j);
            }
            o0O0o.OooO00o oooO00o2 = this.f11141OooO0o0;
            if (oooO00o2 != null) {
                oooO00o2.OooO00o(fArr, j);
            }
        }

        @Override // p247o00oo0oO.o00OO
        public final void OooO0OO(long j, long j2, OooOo oooOo, @Nullable MediaFormat mediaFormat) {
            o00OO o00oo2 = this.f11140OooO0o;
            if (o00oo2 != null) {
                o00oo2.OooO0OO(j, j2, oooOo, mediaFormat);
            }
            o00OO o00oo3 = this.f11139OooO0Oo;
            if (o00oo3 != null) {
                o00oo3.OooO0OO(j, j2, oooOo, mediaFormat);
            }
        }

        @Override // o0O0o.OooO00o
        public final void OooO0o0() {
            o0O0o.OooO00o oooO00o = this.f11142OooO0oO;
            if (oooO00o != null) {
                oooO00o.OooO0o0();
            }
            o0O0o.OooO00o oooO00o2 = this.f11141OooO0o0;
            if (oooO00o2 != null) {
                oooO00o2.OooO0o0();
            }
        }

        @Override // com.google.android.exoplayer2.oo000o.OooO0O0
        public final void OooOO0O(int i, @Nullable Object obj) {
            if (i == 7) {
                this.f11139OooO0Oo = (o00OO) obj;
                return;
            }
            if (i == 8) {
                this.f11141OooO0o0 = (o0O0o.OooO00o) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f11140OooO0o = null;
                this.f11142OooO0oO = null;
            } else {
                this.f11140OooO0o = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f11142OooO0oO = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public static final class OooO0o implements o0oOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f11143OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public oo0o0Oo f11144OooO0O0;

        public OooO0o(com.google.android.exoplayer2.source.OooOOO0.OooO00o oooO00o, Object obj) {
            this.f11143OooO00o = obj;
            this.f11144OooO0O0 = oooO00o;
        }

        @Override // p203o00o0o0o.o0oOO
        public final Object OooO00o() {
            return this.f11143OooO00o;
        }

        @Override // p203o00o0o0o.o0oOO
        public final oo0o0Oo OooO0O0() {
            return this.f11144OooO0O0;
        }
    }

    static {
        o00OOO0.OooO00o("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public OooOOO(OooOOO0.OooO0O0 oooO0O0, @Nullable Player player) {
        try {
            Log.OooO0o0("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.0] [" + o0O00.f40600OooO0o0 + "]");
            Context context = oooO0O0.f11146OooO00o;
            Looper looper = oooO0O0.f11145OooO;
            this.f11082OooO0o0 = context.getApplicationContext();
            com.google.common.base.OooOOO0<o00O00OO, p200o00o0o.o00O0O> oooOOO0 = oooO0O0.f11153OooO0oo;
            o0O0o o0o0o = oooO0O0.f11147OooO0O0;
            this.f11092OooOOo = oooOOO0.apply(o0o0o);
            this.f11125OoooOo0 = oooO0O0.f11154OooOO0;
            this.f11137o000oOoO = oooO0O0.f11155OooOO0O;
            this.f11127OoooOoo = false;
            this.f11105OooOooO = oooO0O0.f11161OooOOo;
            OooO0O0 oooO0O1 = new OooO0O0();
            this.f11095OooOo = oooO0O1;
            this.f11101OooOoO0 = new OooO0OO();
            Handler handler = new Handler(looper);
            Renderer[] rendererArrOooO00o = oooO0O0.f11148OooO0OO.get().OooO00o(handler, oooO0O1, oooO0O1, oooO0O1, oooO0O1);
            this.f11083OooO0oO = rendererArrOooO00o;
            o00O000o.OooO0Oo(rendererArrOooO00o.length > 0);
            this.f11084OooO0oo = oooO0O0.f11151OooO0o0.get();
            this.f11093OooOOo0 = oooO0O0.f11149OooO0Oo.get();
            this.f11097OooOo00 = oooO0O0.f11152OooO0oO.get();
            this.f11091OooOOOo = oooO0O0.f11156OooOO0o;
            this.f11113Oooo0OO = oooO0O0.f11158OooOOO0;
            this.f11096OooOo0 = oooO0O0.f11157OooOOO;
            this.f11098OooOo0O = oooO0O0.f11159OooOOOO;
            this.f11094OooOOoo = looper;
            this.f11099OooOo0o = o0o0o;
            this.f11081OooO0o = player == null ? this : player;
            this.f11087OooOO0o = new o00O<>(looper, o0o0o, new p203o00o0o0o.o00O0(this));
            this.f11089OooOOO0 = new CopyOnWriteArraySet<>();
            this.f11090OooOOOO = new ArrayList();
            this.f11115Oooo0o0 = new com.google.android.exoplayer2.source.o00Ooo.OooO00o();
            this.f11078OooO0O0 = new o00O000(new o0O00O0o[rendererArrOooO00o.length], new com.google.android.exoplayer2.trackselection.OooO0o[rendererArrOooO00o.length], o0O0O00.f12831OooO0o0, null);
            this.f11088OooOOO = new oo0o0Oo.OooO0O0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            for (int i = 0; i < 19; i++) {
                int i2 = iArr[i];
                o00O000o.OooO0Oo(true);
                sparseBooleanArray.append(i2, true);
            }
            o00oOoo o00oooo2 = this.f11084OooO0oo;
            o00oooo2.getClass();
            if (o00oooo2 instanceof com.google.android.exoplayer2.trackselection.OooO0O0) {
                o00O000o.OooO0Oo(!false);
                sparseBooleanArray.append(29, true);
            }
            o00O000o.OooO0Oo(true);
            o00O0OO o00o0oo2 = new o00O0OO(sparseBooleanArray);
            this.f11079OooO0OO = new Player.OooO00o(o00o0oo2);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i3 = 0; i3 < o00o0oo2.OooO0O0(); i3++) {
                int iOooO00o = o00o0oo2.OooO00o(i3);
                o00O000o.OooO0Oo(true);
                sparseBooleanArray2.append(iOooO00o, true);
            }
            o00O000o.OooO0Oo(true);
            sparseBooleanArray2.append(4, true);
            o00O000o.OooO0Oo(true);
            sparseBooleanArray2.append(10, true);
            o00O000o.OooO0Oo(!false);
            this.f11114Oooo0o = new Player.OooO00o(new o00O0OO(sparseBooleanArray2));
            this.f11077OooO = this.f11099OooOo0o.OooO0O0(this.f11094OooOOoo, null);
            o00O0O00 o00o0o01 = new o00O0O00(this);
            this.f11085OooOO0 = o00o0o01;
            this.f11133Oooooo = o0O000o0.OooO(this.f11078OooO0O0);
            this.f11092OooOOo.OooOo(this.f11081OooO0o, this.f11094OooOOoo);
            int i4 = o0O00.f40595OooO00o;
            this.f11086OooOO0O = new OooOo00(this.f11083OooO0oO, this.f11084OooO0oo, this.f11078OooO0O0, oooO0O0.f11150OooO0o.get(), this.f11097OooOo00, this.f11106OooOooo, this.f11109Oooo000, this.f11092OooOOo, this.f11113Oooo0OO, oooO0O0.f11160OooOOOo, oooO0O0.f11162OooOOo0, false, this.f11094OooOOoo, this.f11099OooOo0o, o00o0o01, i4 < 31 ? new o0O0OOO0() : OooO00o.OooO00o(this.f11082OooO0o0, this, oooO0O0.f11163OooOOoo));
            this.f11126OoooOoO = 1.0f;
            this.f11106OooOooo = 0;
            MediaMetadata mediaMetadata = MediaMetadata.f10930Oooo0o0;
            this.f11116Oooo0oO = mediaMetadata;
            this.f11134Oooooo0 = mediaMetadata;
            int iGenerateAudioSessionId = -1;
            this.f11135OoooooO = -1;
            if (i4 < 21) {
                AudioTrack audioTrack = this.f11117Oooo0oo;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f11117Oooo0oo.release();
                    this.f11117Oooo0oo = null;
                }
                if (this.f11117Oooo0oo == null) {
                    this.f11117Oooo0oo = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f11124OoooOOo = this.f11117Oooo0oo.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f11082OooO0o0.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.f11124OoooOOo = iGenerateAudioSessionId;
            }
            this.f11128Ooooo00 = o0000O0O.f40111OooO0o;
            this.f11129Ooooo0o = true;
            Ooooo00(this.f11092OooOOo);
            this.f11097OooOo00.OooO0OO(new Handler(this.f11094OooOOoo), this.f11092OooOOo);
            this.f11089OooOOO0.add(this.f11095OooOo);
            com.google.android.exoplayer2.OooO0O0 oooO0O2 = new com.google.android.exoplayer2.OooO0O0(context, handler, this.f11095OooOo);
            this.f11100OooOoO = oooO0O2;
            oooO0O2.OooO00o();
            AudioFocusManager audioFocusManager = new AudioFocusManager(context, handler, this.f11095OooOo);
            this.f11102OooOoOO = audioFocusManager;
            audioFocusManager.OooO0OO(null);
            this.f11104OooOoo0 = new o0O0O0O(context);
            this.f11103OooOoo = new o0oO0O0o(context);
            o00oO0O();
            this.f11132OooooOo = o0oOOo.f40860OooO0oo;
            this.f11123OoooOOO = o0O00o0.f40618OooO0OO;
            this.f11084OooO0oo.OooO0o(this.f11125OoooOo0);
            o000000(1, 10, Integer.valueOf(this.f11124OoooOOo));
            o000000(2, 10, Integer.valueOf(this.f11124OoooOOo));
            o000000(1, 3, this.f11125OoooOo0);
            o000000(2, 4, Integer.valueOf(this.f11137o000oOoO));
            o000000(2, 5, 0);
            o000000(1, 9, Boolean.valueOf(this.f11127OoooOoo));
            o000000(2, 7, this.f11101OooOoO0);
            o000000(6, 8, this.f11101OooOoO0);
        } finally {
            this.f11080OooO0Oo.OooO0O0();
        }
    }

    public static DeviceInfo o00oO0O() {
        DeviceInfo.OooO00o oooO00o = new DeviceInfo.OooO00o(0);
        oooO00o.f10913OooO0O0 = 0;
        oooO00o.f10914OooO0OO = 0;
        return oooO00o.OooO00o();
    }

    public static long o0Oo0oo(o0O000o0 o0o000o1) {
        oo0o0Oo.OooO0OO oooO0OO = new oo0o0Oo.OooO0OO();
        oo0o0Oo.OooO0O0 oooO0O0 = new oo0o0Oo.OooO0O0();
        o0o000o1.f39262OooO00o.OooO0oo(o0o000o1.f39263OooO0O0.f39859OooO00o, oooO0O0);
        long j = o0o000o1.f39264OooO0OO;
        return j == -9223372036854775807L ? o0o000o1.f39262OooO00o.OooOOO(oooO0O0.f12906OooO0o, oooO0OO).f12939OooOOOo : oooO0O0.f12909OooO0oo + j;
    }

    @Override // com.google.android.exoplayer2.Player
    public final o0000O0O OooO() {
        o0000Ooo();
        return this.f11128Ooooo00;
    }

    @Override // com.google.android.exoplayer2.Player
    public final o00Ooo OooO00o() {
        o0000Ooo();
        return this.f11133Oooooo.f39273OooOOO;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooO0OO() {
        o0000Ooo();
        boolean zOooOOO = OooOOO();
        int iOooO0o0 = this.f11102OooOoOO.OooO0o0(2, zOooOOO);
        o00000OO(iOooO0o0, (!zOooOOO || iOooO0o0 == 1) ? 1 : 2, zOooOOO);
        o0O000o0 o0o000o1 = this.f11133Oooooo;
        if (o0o000o1.f39267OooO0o0 != 1) {
            return;
        }
        o0O000o0 o0o000o0OooO0o0 = o0o000o1.OooO0o0(null);
        o0O000o0 o0o000o0OooO0oO = o0o000o0OooO0o0.OooO0oO(o0o000o0OooO0o0.f39262OooO00o.OooOOo0() ? 4 : 2);
        this.f11110Oooo00O++;
        this.f11086OooOO0O.f11273OooOO0O.OooO0O0(0).OooO00o();
        o00000Oo(o0o000o0OooO0oO, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean OooO0Oo() {
        o0000Ooo();
        return this.f11133Oooooo.f39263OooO0O0.OooO00o();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooO0o0(o00Ooo o00ooo2) {
        o0000Ooo();
        if (this.f11133Oooooo.f39273OooOOO.equals(o00ooo2)) {
            return;
        }
        o0O000o0 o0o000o0OooO0o = this.f11133Oooooo.OooO0o(o00ooo2);
        this.f11110Oooo00O++;
        this.f11086OooOO0O.f11273OooOO0O.OooO0o0(4, o00ooo2).OooO00o();
        o00000Oo(o0o000o0OooO0o, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final o0O0O00 OooO0oo() {
        o0000Ooo();
        return this.f11133Oooooo.f39261OooO.f40405OooO0Oo;
    }

    @Override // com.google.android.exoplayer2.Player
    public final oo0o0Oo OooOO0() {
        o0000Ooo();
        return this.f11133Oooooo.f39262OooO00o;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Looper OooOO0O() {
        return this.f11094OooOOoo;
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.trackselection.OooO OooOO0o() {
        o0000Ooo();
        return this.f11084OooO0oo.OooO00o();
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean OooOOO() {
        o0000Ooo();
        return this.f11133Oooooo.f39272OooOO0o;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooOOOo(float f) {
        o0000Ooo();
        final float fOooO0oo = o0O00.OooO0oo(f, 0.0f, 1.0f);
        if (this.f11126OoooOoO == fOooO0oo) {
            return;
        }
        this.f11126OoooOoO = fOooO0oo;
        o000000(1, 2, Float.valueOf(this.f11102OooOoOO.f10892OooO0oO * fOooO0oo));
        this.f11087OooOO0o.OooO0o0(22, new o00O.OooO00o() { // from class: o00o0o0o.o00O00
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((Player.OooO0OO) obj).onVolumeChanged(fOooO0oo);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player
    public final long OooOOo() {
        o0000Ooo();
        return o0ooOOo(this.f11133Oooooo);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long OooOOo0() {
        o0000Ooo();
        return this.f11098OooOo0O;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooOOoo() {
        o0000Ooo();
        return this.f11133Oooooo.f39267OooO0o0;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooOo0() {
        o0000Ooo();
        return this.f11106OooOooo;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooOo00() {
        o0000Ooo();
        int iO0OOO0o = o0OOO0o(this.f11133Oooooo);
        if (iO0OOO0o == -1) {
            return 0;
        }
        return iO0OOO0o;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean OooOo0O() {
        o0000Ooo();
        return this.f11109Oooo000;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long OooOo0o() {
        o0000Ooo();
        if (this.f11133Oooooo.f39262OooO00o.OooOOo0()) {
            return this.f11136Ooooooo;
        }
        o0O000o0 o0o000o1 = this.f11133Oooooo;
        if (o0o000o1.f39271OooOO0O.f39862OooO0Oo != o0o000o1.f39263OooO0O0.f39862OooO0Oo) {
            return o0O00.OoooOO0(o0o000o1.f39262OooO00o.OooOOO(OooOo00(), this.f11040OooO00o).f12941OooOOo0);
        }
        long j = o0o000o1.f39276OooOOOo;
        if (this.f11133Oooooo.f39271OooOO0O.OooO00o()) {
            o0O000o0 o0o000o2 = this.f11133Oooooo;
            oo0o0Oo.OooO0O0 oooO0O0OooO0oo = o0o000o2.f39262OooO00o.OooO0oo(o0o000o2.f39271OooOO0O.f39859OooO00o, this.f11088OooOOO);
            long jOooO0Oo = oooO0O0OooO0oo.OooO0Oo(this.f11133Oooooo.f39271OooOO0O.f39860OooO0O0);
            j = jOooO0Oo == Long.MIN_VALUE ? oooO0O0OooO0oo.f12908OooO0oO : jOooO0Oo;
        }
        o0O000o0 o0o000o3 = this.f11133Oooooo;
        oo0o0Oo oo0o0oo = o0o000o3.f39262OooO00o;
        Object obj = o0o000o3.f39271OooOO0O.f39859OooO00o;
        oo0o0Oo.OooO0O0 oooO0O0 = this.f11088OooOOO;
        oo0o0oo.OooO0oo(obj, oooO0O0);
        return o0O00.OoooOO0(j + oooO0O0.f12909OooO0oo);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long OooOoO() {
        o0000Ooo();
        return this.f11096OooOo0;
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final void OooOoOO() {
        o0000Ooo();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long OooOoo() {
        o0000Ooo();
        return o0O00.OoooOO0(this.f11133Oooooo.f39278OooOOo0);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooOoo0(@Nullable Surface surface) {
        o0000Ooo();
        o000OOo();
        o00000(surface);
        int i = surface == null ? 0 : -1;
        o0O0O00(i, i);
    }

    @Override // com.google.android.exoplayer2.OooOOO0
    public final void OooOooO(com.google.android.exoplayer2.source.OooOOOO oooOOOO) {
        o0000Ooo();
        List listSingletonList = Collections.singletonList(oooOOOO);
        o0000Ooo();
        o000000O(listSingletonList);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooOooo(Player.OooO0OO oooO0OO) {
        o0000Ooo();
        oooO0OO.getClass();
        o00O<Player.OooO0OO> o00o2 = this.f11087OooOO0o;
        o00o2.OooO0o();
        CopyOnWriteArraySet<o00O.OooO0OO<Player.OooO0OO>> copyOnWriteArraySet = o00o2.f40547OooO0Oo;
        for (o00O.OooO0OO<Player.OooO0OO> oooO0OO2 : copyOnWriteArraySet) {
            if (oooO0OO2.f40552OooO00o.equals(oooO0OO)) {
                oooO0OO2.f40555OooO0Oo = true;
                if (oooO0OO2.f40554OooO0OO) {
                    oooO0OO2.f40554OooO0OO = false;
                    o00O0OO o00o0ooOooO0O0 = oooO0OO2.f40553OooO0O0.OooO0O0();
                    o00o2.f40546OooO0OO.OooO00o(oooO0OO2.f40552OooO00o, o00o0ooOooO0O0);
                }
                copyOnWriteArraySet.remove(oooO0OO2);
            }
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final Player.OooO00o Oooo() {
        o0000Ooo();
        return this.f11114Oooo0o;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int Oooo0() {
        o0000Ooo();
        if (OooO0Oo()) {
            return this.f11133Oooooo.f39263OooO0O0.f39860OooO0O0;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void Oooo000(@Nullable SurfaceView surfaceView) {
        o0000Ooo();
        if (surfaceView instanceof oo0O) {
            o000OOo();
            o00000(surfaceView);
            o000000o(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof SphericalGLSurfaceView;
        OooO0O0 oooO0O0 = this.f11095OooOo;
        if (z) {
            o000OOo();
            this.f11121OoooO0O = (SphericalGLSurfaceView) surfaceView;
            oo000o oo000oVarO0ooOO0 = o0ooOO0(this.f11101OooOoO0);
            o00O000o.OooO0Oo(!oo000oVarO0ooOO0.f12893OooO0oO);
            oo000oVarO0ooOO0.f12890OooO0Oo = ResponseInfo.UnknownError;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.f11121OoooO0O;
            o00O000o.OooO0Oo(true ^ oo000oVarO0ooOO0.f12893OooO0oO);
            oo000oVarO0ooOO0.f12892OooO0o0 = sphericalGLSurfaceView;
            oo000oVarO0ooOO0.OooO0OO();
            this.f11121OoooO0O.f14389OooO0Oo.add(oooO0O0);
            o00000(this.f11121OoooO0O.getVideoSurface());
            o000000o(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        o0000Ooo();
        if (holder == null) {
            o00oO0o();
            return;
        }
        o000OOo();
        this.f11118OoooO = true;
        this.f11119OoooO0 = holder;
        holder.addCallback(oooO0O0);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            o00000(null);
            o0O0O00(0, 0);
        } else {
            o00000(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            o0O0O00(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void Oooo00O(boolean z) {
        o0000Ooo();
        int iOooO0o0 = this.f11102OooOoOO.OooO0o0(OooOOoo(), z);
        int i = 1;
        if (z && iOooO0o0 != 1) {
            i = 2;
        }
        o00000OO(iOooO0o0, i, z);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void Oooo0o(@Nullable TextureView textureView) {
        o0000Ooo();
        if (textureView == null) {
            o00oO0o();
            return;
        }
        o000OOo();
        this.f11122OoooOO0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.OooO0o("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f11095OooOo);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            o00000(null);
            o0O0O00(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            o00000(surface);
            this.f11120OoooO00 = surface;
            o0O0O00(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final int Oooo0o0() {
        o0000Ooo();
        return this.f11133Oooooo.f39274OooOOO0;
    }

    @Override // com.google.android.exoplayer2.OooOOO0
    public final void Oooo0oO(com.google.android.exoplayer2.audio.OooO00o oooO00o, boolean z) {
        o0000Ooo();
        if (this.f11131OooooOO) {
            return;
        }
        boolean zOooO00o = o0O00.OooO00o(this.f11125OoooOo0, oooO00o);
        int i = 1;
        o00O<Player.OooO0OO> o00o2 = this.f11087OooOO0o;
        if (!zOooO00o) {
            this.f11125OoooOo0 = oooO00o;
            o000000(1, 3, oooO00o);
            o00o2.OooO0OO(20, new o000OOo0(oooO00o));
        }
        com.google.android.exoplayer2.audio.OooO00o oooO00o2 = z ? oooO00o : null;
        AudioFocusManager audioFocusManager = this.f11102OooOoOO;
        audioFocusManager.OooO0OO(oooO00o2);
        this.f11084OooO0oo.OooO0o(oooO00o);
        boolean zOooOOO = OooOOO();
        int iOooO0o0 = audioFocusManager.OooO0o0(OooOOoo(), zOooOOO);
        if (zOooOOO && iOooO0o0 != 1) {
            i = 2;
        }
        o00000OO(iOooO0o0, i, zOooOOO);
        o00o2.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OoooO() {
        o0000Ooo();
        if (this.f11133Oooooo.f39262OooO00o.OooOOo0()) {
            return 0;
        }
        o0O000o0 o0o000o1 = this.f11133Oooooo;
        return o0o000o1.f39262OooO00o.OooO0O0(o0o000o1.f39263OooO0O0.f39859OooO00o);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OoooO0() {
        o0000Ooo();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OoooO00(final boolean z) {
        o0000Ooo();
        if (this.f11109Oooo000 != z) {
            this.f11109Oooo000 = z;
            this.f11086OooOO0O.f11273OooOO0O.OooO0oO(12, z ? 1 : 0, 0).OooO00o();
            o00O.OooO00o<Player.OooO0OO> oooO00o = new o00O.OooO00o() { // from class: o00o0o0o.o00O00o0
                @Override // o00oo0o.o00O.OooO00o
                public final void invoke(Object obj) {
                    ((Player.OooO0OO) obj).onShuffleModeEnabledChanged(z);
                }
            };
            o00O<Player.OooO0OO> o00o2 = this.f11087OooOO0o;
            o00o2.OooO0OO(9, oooO00o);
            o00000O();
            o00o2.OooO0O0();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OoooO0O() {
        int i;
        p203o00o0o0o.o0O00 o0o01;
        Pair<Object, Long> pairOo0o0Oo;
        o0000Ooo();
        ArrayList arrayList = this.f11090OooOOOO;
        int size = arrayList.size();
        int iMin = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        o0O000o0 o0o000o1 = this.f11133Oooooo;
        int iO0OOO0o = o0OOO0o(o0o000o1);
        long jO0ooOOo = o0ooOOo(o0o000o1);
        int size2 = arrayList.size();
        this.f11110Oooo00O++;
        for (int i2 = iMin - 1; i2 >= 0; i2--) {
            arrayList.remove(i2);
        }
        this.f11115Oooo0o0 = this.f11115Oooo0o0.OooO00o(iMin);
        p203o00o0o0o.o0O00 o0o02 = new p203o00o0o0o.o0O00(arrayList, this.f11115Oooo0o0);
        oo0o0Oo oo0o0oo = o0o000o1.f39262OooO00o;
        boolean z = false;
        if (oo0o0oo.OooOOo0() || o0o02.OooOOo0()) {
            i = iO0OOO0o;
            o0o01 = o0o02;
            boolean z2 = !oo0o0oo.OooOOo0() && o0o01.OooOOo0();
            int i3 = z2 ? -1 : i;
            if (z2) {
                jO0ooOOo = -9223372036854775807L;
            }
            pairOo0o0Oo = oo0o0Oo(o0o01, i3, jO0ooOOo);
        } else {
            pairOo0o0Oo = oo0o0oo.OooOO0(this.f11040OooO00o, this.f11088OooOOO, iO0OOO0o, o0O00.Oooo0O0(jO0ooOOo));
            Object obj = pairOo0o0Oo.first;
            if (o0o02.OooO0O0(obj) != -1) {
                i = iO0OOO0o;
                o0o01 = o0o02;
            } else {
                i = iO0OOO0o;
                o0o01 = o0o02;
                Object objOooo0 = OooOo00.Oooo0(this.f11040OooO00o, this.f11088OooOOO, this.f11106OooOooo, this.f11109Oooo000, obj, oo0o0oo, o0o01);
                if (objOooo0 != null) {
                    oo0o0Oo.OooO0O0 oooO0O0 = this.f11088OooOOO;
                    o0o01.OooO0oo(objOooo0, oooO0O0);
                    int i4 = oooO0O0.f12906OooO0o;
                    pairOo0o0Oo = oo0o0Oo(o0o01, i4, o0O00.OoooOO0(o0o01.OooOOO(i4, this.f11040OooO00o).f12939OooOOOo));
                } else {
                    pairOo0o0Oo = oo0o0Oo(o0o01, -1, -9223372036854775807L);
                }
            }
        }
        o0O000o0 o0o000o0O0OO00O = o0OO00O(o0o000o1, o0o01, pairOo0o0Oo);
        int i5 = o0o000o0O0OO00O.f39267OooO0o0;
        if (i5 != 1 && i5 != 4 && iMin > 0 && iMin == size2 && i >= o0o000o0O0OO00O.f39262OooO00o.OooOOOo()) {
            z = true;
        }
        if (z) {
            o0o000o0O0OO00O = o0o000o0O0OO00O.OooO0oO(4);
        }
        o0O000o0 o0o000o2 = o0o000o0O0OO00O;
        this.f11086OooOO0O.f11273OooOO0O.OooOO0(iMin, this.f11115Oooo0o0).OooO00o();
        o00000Oo(o0o000o2, 0, 1, !o0o000o2.f39263OooO0O0.f39859OooO00o.equals(this.f11133Oooooo.f39263OooO0O0.f39859OooO00o), 4, o0ooOoO(o0o000o2), -1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OoooOO0(@Nullable TextureView textureView) {
        o0000Ooo();
        if (textureView == null || textureView != this.f11122OoooOO0) {
            return;
        }
        o00oO0o();
    }

    @Override // com.google.android.exoplayer2.Player
    public final float OoooOOO() {
        o0000Ooo();
        return this.f11126OoooOoO;
    }

    @Override // com.google.android.exoplayer2.Player
    public final com.google.android.exoplayer2.audio.OooO00o OoooOOo() {
        o0000Ooo();
        return this.f11125OoooOo0;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OoooOoO() {
        o0000Ooo();
        if (OooO0Oo()) {
            return this.f11133Oooooo.f39263OooO0O0.f39861OooO0OO;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void Ooooo00(Player.OooO0OO oooO0OO) {
        oooO0OO.getClass();
        this.f11087OooOO0o.OooO00o(oooO0OO);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long Ooooo0o() {
        o0000Ooo();
        if (!OooO0Oo()) {
            return OooOo0o();
        }
        o0O000o0 o0o000o1 = this.f11133Oooooo;
        return o0o000o1.f39271OooOO0O.equals(o0o000o1.f39263OooO0O0) ? o0O00.OoooOO0(this.f11133Oooooo.f39276OooOOOo) : getDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OooooOO(com.google.android.exoplayer2.trackselection.OooO oooO) {
        o0000Ooo();
        o00oOoo o00oooo2 = this.f11084OooO0oo;
        o00oooo2.getClass();
        if (!(o00oooo2 instanceof com.google.android.exoplayer2.trackselection.OooO0O0) || oooO.equals(o00oooo2.OooO00o())) {
            return;
        }
        o00oooo2.OooO0oO(oooO);
        this.f11087OooOO0o.OooO0o0(19, new oo00o(oooO));
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public final ExoPlaybackException OooooOo() {
        o0000Ooo();
        return this.f11133Oooooo.f39266OooO0o;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void Oooooo(com.google.common.collect.o0O00 o0o01) {
        o0000Ooo();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < o0o01.f19538OooO0oO; i++) {
            arrayList.add(this.f11093OooOOo0.OooO00o((o000oOoO) o0o01.get(i)));
        }
        o000000O(arrayList);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void Oooooo0(final int i) {
        o0000Ooo();
        if (this.f11106OooOooo != i) {
            this.f11106OooOooo = i;
            this.f11086OooOO0O.f11273OooOO0O.OooO0oO(11, i, 0).OooO00o();
            o00O.OooO00o<Player.OooO0OO> oooO00o = new o00O.OooO00o() { // from class: o00o0o0o.oOO00O
                @Override // o00oo0o.o00O.OooO00o
                public final void invoke(Object obj) {
                    ((Player.OooO0OO) obj).onRepeatModeChanged(i);
                }
            };
            o00O<Player.OooO0OO> o00o2 = this.f11087OooOO0o;
            o00o2.OooO0OO(8, oooO00o);
            o00000O();
            o00o2.OooO0O0();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void OoooooO(@Nullable SurfaceView surfaceView) {
        o0000Ooo();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        o0000Ooo();
        if (holder == null || holder != this.f11119OoooO0) {
            return;
        }
        o00oO0o();
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaMetadata Ooooooo() {
        o0000Ooo();
        return this.f11116Oooo0oO;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        o0000Ooo();
        return o0O00.OoooOO0(o0ooOoO(this.f11133Oooooo));
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
        o0000Ooo();
        if (!OooO0Oo()) {
            return OooOOOO();
        }
        o0O000o0 o0o000o1 = this.f11133Oooooo;
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = o0o000o1.f39263OooO0O0;
        oo0o0Oo oo0o0oo = o0o000o1.f39262OooO00o;
        Object obj = oooO0O0.f39859OooO00o;
        oo0o0Oo.OooO0O0 oooO0O1 = this.f11088OooOOO;
        oo0o0oo.OooO0oo(obj, oooO0O1);
        return o0O00.OoooOO0(oooO0O1.OooO00o(oooO0O0.f39860OooO0O0, oooO0O0.f39861OooO0OO));
    }

    public final void o00000(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Renderer renderer : this.f11083OooO0oO) {
            if (renderer.OooOOO() == 2) {
                oo000o oo000oVarO0ooOO0 = o0ooOO0(renderer);
                o00O000o.OooO0Oo(!oo000oVarO0ooOO0.f12893OooO0oO);
                oo000oVarO0ooOO0.f12890OooO0Oo = 1;
                o00O000o.OooO0Oo(true ^ oo000oVarO0ooOO0.f12893OooO0oO);
                oo000oVarO0ooOO0.f12892OooO0o0 = obj;
                oo000oVarO0ooOO0.OooO0OO();
                arrayList.add(oo000oVarO0ooOO0);
            }
        }
        Object obj2 = this.f11107Oooo;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((oo000o) it.next()).OooO00o(this.f11105OooOooO);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f11107Oooo;
            Surface surface = this.f11120OoooO00;
            if (obj3 == surface) {
                surface.release();
                this.f11120OoooO00 = null;
            }
        }
        this.f11107Oooo = obj;
        if (z) {
            o00000O0(new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
        }
    }

    public final void o000000(int i, int i2, @Nullable Object obj) {
        for (Renderer renderer : this.f11083OooO0oO) {
            if (renderer.OooOOO() == i) {
                oo000o oo000oVarO0ooOO0 = o0ooOO0(renderer);
                o00O000o.OooO0Oo(!oo000oVarO0ooOO0.f12893OooO0oO);
                oo000oVarO0ooOO0.f12890OooO0Oo = i2;
                o00O000o.OooO0Oo(!oo000oVarO0ooOO0.f12893OooO0oO);
                oo000oVarO0ooOO0.f12892OooO0o0 = obj;
                oo000oVarO0ooOO0.OooO0OO();
            }
        }
    }

    public final void o000000O(List list) {
        o0000Ooo();
        o0OOO0o(this.f11133Oooooo);
        getCurrentPosition();
        this.f11110Oooo00O++;
        ArrayList arrayList = this.f11090OooOOOO;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = size - 1; i >= 0; i--) {
                arrayList.remove(i);
            }
            this.f11115Oooo0o0 = this.f11115Oooo0o0.OooO00o(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            o00O0O.OooO0OO oooO0OO = new o00O0O.OooO0OO((com.google.android.exoplayer2.source.OooOOOO) list.get(i2), this.f11091OooOOOo);
            arrayList2.add(oooO0OO);
            arrayList.add(i2 + 0, new OooO0o(oooO0OO.f12816OooO00o.f13033OooOOOO, oooO0OO.f12817OooO0O0));
        }
        this.f11115Oooo0o0 = this.f11115Oooo0o0.OooO0oO(arrayList2.size());
        p203o00o0o0o.o0O00 o0o01 = new p203o00o0o0o.o0O00(arrayList, this.f11115Oooo0o0);
        boolean zOooOOo0 = o0o01.OooOOo0();
        int i3 = o0o01.f39240OooOO0o;
        if (!zOooOOo0 && -1 >= i3) {
            throw new IllegalSeekPositionException();
        }
        int iOooO00o = o0o01.OooO00o(this.f11109Oooo000);
        o0O000o0 o0o000o0O0OO00O = o0OO00O(this.f11133Oooooo, o0o01, oo0o0Oo(o0o01, iOooO00o, -9223372036854775807L));
        int i4 = o0o000o0O0OO00O.f39267OooO0o0;
        if (iOooO00o != -1 && i4 != 1) {
            i4 = (o0o01.OooOOo0() || iOooO00o >= i3) ? 4 : 2;
        }
        o0O000o0 o0o000o0OooO0oO = o0o000o0O0OO00O.OooO0oO(i4);
        long jOooo0O0 = o0O00.Oooo0O0(-9223372036854775807L);
        com.google.android.exoplayer2.source.o00Ooo o00ooo2 = this.f11115Oooo0o0;
        OooOo00 oooOo00 = this.f11086OooOO0O;
        oooOo00.getClass();
        oooOo00.f11273OooOO0O.OooO0o0(17, new OooOo00.OooO00o(arrayList2, o00ooo2, iOooO00o, jOooo0O0)).OooO00o();
        o00000Oo(o0o000o0OooO0oO, 0, 1, (this.f11133Oooooo.f39263OooO0O0.f39859OooO00o.equals(o0o000o0OooO0oO.f39263OooO0O0.f39859OooO00o) || this.f11133Oooooo.f39262OooO00o.OooOOo0()) ? false : true, 4, o0ooOoO(o0o000o0OooO0oO), -1, false);
    }

    public final void o000000o(SurfaceHolder surfaceHolder) {
        this.f11118OoooO = false;
        this.f11119OoooO0 = surfaceHolder;
        surfaceHolder.addCallback(this.f11095OooOo);
        Surface surface = this.f11119OoooO0.getSurface();
        if (surface == null || !surface.isValid()) {
            o0O0O00(0, 0);
        } else {
            Rect surfaceFrame = this.f11119OoooO0.getSurfaceFrame();
            o0O0O00(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void o00000O() {
        Player.OooO00o oooO00o = this.f11114Oooo0o;
        int i = o0O00.f40595OooO00o;
        Player player = this.f11081OooO0o;
        boolean zOooO0Oo = player.OooO0Oo();
        boolean zOooooO0 = player.OooooO0();
        boolean zOoooOo0 = player.OoooOo0();
        boolean zOooo00o = player.Oooo00o();
        boolean zO0OoOo0 = player.o0OoOo0();
        boolean zOooo0OO = player.Oooo0OO();
        boolean zOooOOo0 = player.OooOO0().OooOOo0();
        Player.OooO00o.C0197OooO00o c0197OooO00o = new Player.OooO00o.C0197OooO00o();
        o00O0OO o00o0oo2 = this.f11079OooO0OO.f11344OooO0Oo;
        o00O0OO.OooO00o oooO00o2 = c0197OooO00o.f11345OooO00o;
        oooO00o2.getClass();
        boolean z = false;
        for (int i2 = 0; i2 < o00o0oo2.OooO0O0(); i2++) {
            oooO00o2.OooO00o(o00o0oo2.OooO00o(i2));
        }
        boolean z2 = !zOooO0Oo;
        c0197OooO00o.OooO00o(4, z2);
        c0197OooO00o.OooO00o(5, zOooooO0 && !zOooO0Oo);
        c0197OooO00o.OooO00o(6, zOoooOo0 && !zOooO0Oo);
        c0197OooO00o.OooO00o(7, !zOooOOo0 && (zOoooOo0 || !zO0OoOo0 || zOooooO0) && !zOooO0Oo);
        c0197OooO00o.OooO00o(8, zOooo00o && !zOooO0Oo);
        c0197OooO00o.OooO00o(9, !zOooOOo0 && (zOooo00o || (zO0OoOo0 && zOooo0OO)) && !zOooO0Oo);
        c0197OooO00o.OooO00o(10, z2);
        c0197OooO00o.OooO00o(11, zOooooO0 && !zOooO0Oo);
        if (zOooooO0 && !zOooO0Oo) {
            z = true;
        }
        c0197OooO00o.OooO00o(12, z);
        Player.OooO00o oooO00o3 = new Player.OooO00o(oooO00o2.OooO0O0());
        this.f11114Oooo0o = oooO00o3;
        if (oooO00o3.equals(oooO00o)) {
            return;
        }
        this.f11087OooOO0o.OooO0OO(13, new o0OO000o(this));
    }

    public final void o00000O0(@Nullable ExoPlaybackException exoPlaybackException) {
        o0O000o0 o0o000o1 = this.f11133Oooooo;
        o0O000o0 o0o000o0OooO0O0 = o0o000o1.OooO0O0(o0o000o1.f39263OooO0O0);
        o0o000o0OooO0O0.f39276OooOOOo = o0o000o0OooO0O0.f39277OooOOo;
        o0o000o0OooO0O0.f39278OooOOo0 = 0L;
        o0O000o0 o0o000o0OooO0oO = o0o000o0OooO0O0.OooO0oO(1);
        if (exoPlaybackException != null) {
            o0o000o0OooO0oO = o0o000o0OooO0oO.OooO0o0(exoPlaybackException);
        }
        this.f11110Oooo00O++;
        this.f11086OooOO0O.f11273OooOO0O.OooO0O0(6).OooO00o();
        o00000Oo(o0o000o0OooO0oO, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o00000OO(int i, int i2, boolean z) {
        int i3 = 0;
        ?? r15 = (!z || i == -1) ? 0 : 1;
        if (r15 != 0 && i != 1) {
            i3 = 1;
        }
        o0O000o0 o0o000o1 = this.f11133Oooooo;
        if (o0o000o1.f39272OooOO0o == r15 && o0o000o1.f39274OooOOO0 == i3) {
            return;
        }
        this.f11110Oooo00O++;
        boolean z2 = o0o000o1.f39275OooOOOO;
        o0O000o0 o0o000o0OooO00o = o0o000o1;
        if (z2) {
            o0o000o0OooO00o = o0o000o1.OooO00o();
        }
        o0O000o0 o0o000o0OooO0Oo = o0o000o0OooO00o.OooO0Oo(i3, r15);
        OooOo00 oooOo00 = this.f11086OooOO0O;
        oooOo00.getClass();
        oooOo00.f11273OooOO0O.OooO0oO(1, r15, i3).OooO00o();
        o00000Oo(o0o000o0OooO0Oo, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    public final void o00000Oo(final o0O000o0 o0o000o1, final int i, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
        Pair pair;
        int i5;
        final o000oOoO o000oooo2;
        int i6;
        Object obj;
        o000oOoO o000oooo3;
        Object obj2;
        int i7;
        long jO0Oo0oo;
        long jO0Oo0oo2;
        Object obj3;
        o000oOoO o000oooo4;
        Object obj4;
        int i8;
        o0O000o0 o0o000o2 = this.f11133Oooooo;
        this.f11133Oooooo = o0o000o1;
        boolean z3 = !o0o000o2.f39262OooO00o.equals(o0o000o1.f39262OooO00o);
        oo0o0Oo oo0o0oo = o0o000o2.f39262OooO00o;
        oo0o0Oo oo0o0oo2 = o0o000o1.f39262OooO00o;
        int i9 = 0;
        if (oo0o0oo2.OooOOo0() && oo0o0oo.OooOOo0()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (oo0o0oo2.OooOOo0() != oo0o0oo.OooOOo0()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = o0o000o2.f39263OooO0O0;
            Object obj5 = oooO0O0.f39859OooO00o;
            oo0o0Oo.OooO0O0 oooO0O1 = this.f11088OooOOO;
            int i10 = oo0o0oo.OooO0oo(obj5, oooO0O1).f12906OooO0o;
            oo0o0Oo.OooO0OO oooO0OO = this.f11040OooO00o;
            Object obj6 = oo0o0oo.OooOOO(i10, oooO0OO).f12928OooO0Oo;
            com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O2 = o0o000o1.f39263OooO0O0;
            if (!obj6.equals(oo0o0oo2.OooOOO(oo0o0oo2.OooO0oo(oooO0O2.f39859OooO00o, oooO0O1).f12906OooO0o, oooO0OO).f12928OooO0Oo)) {
                if (z && i3 == 0) {
                    i5 = 1;
                } else if (z && i3 == 1) {
                    i5 = 2;
                } else {
                    if (!z3) {
                        throw new IllegalStateException();
                    }
                    i5 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
            } else if (z && i3 == 0 && oooO0O0.f39862OooO0Oo < oooO0O2.f39862OooO0Oo) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = (z && i3 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        MediaMetadata mediaMetadataOo000o = this.f11116Oooo0oO;
        if (zBooleanValue) {
            if (o0o000o1.f39262OooO00o.OooOOo0()) {
                o000oooo2 = null;
            } else {
                o000oooo2 = o0o000o1.f39262OooO00o.OooOOO(o0o000o1.f39262OooO00o.OooO0oo(o0o000o1.f39263OooO0O0.f39859OooO00o, this.f11088OooOOO).f12906OooO0o, this.f11040OooO00o).f12929OooO0o;
            }
            this.f11134Oooooo0 = MediaMetadata.f10930Oooo0o0;
        } else {
            o000oooo2 = null;
        }
        if (zBooleanValue || !o0o000o2.f39270OooOO0.equals(o0o000o1.f39270OooOO0)) {
            MediaMetadata mediaMetadata = this.f11134Oooooo0;
            mediaMetadata.getClass();
            MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o(mediaMetadata);
            List<Metadata> list = o0o000o1.f39270OooOO0;
            int i11 = 0;
            while (i11 < list.size()) {
                Metadata metadata = list.get(i11);
                int i12 = i9;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f12530OooO0Oo;
                    if (i12 < entryArr.length) {
                        entryArr[i12].OooooOo(oooO00o);
                        i12++;
                    }
                }
                i11++;
                i9 = 0;
            }
            this.f11134Oooooo0 = new MediaMetadata(oooO00o);
            mediaMetadataOo000o = oo000o();
        }
        boolean z4 = !mediaMetadataOo000o.equals(this.f11116Oooo0oO);
        this.f11116Oooo0oO = mediaMetadataOo000o;
        boolean z5 = o0o000o2.f39272OooOO0o != o0o000o1.f39272OooOO0o;
        boolean z6 = o0o000o2.f39267OooO0o0 != o0o000o1.f39267OooO0o0;
        if (z6 || z5) {
            o00000o0();
        }
        boolean z7 = o0o000o2.f39268OooO0oO != o0o000o1.f39268OooO0oO;
        if (z3) {
            this.f11087OooOO0o.OooO0OO(0, new o00O.OooO00o() { // from class: o00o0o0o.o00O0O0
                @Override // o00oo0o.o00O.OooO00o
                public final void invoke(Object obj7) {
                    ((Player.OooO0OO) obj7).onTimelineChanged(o0o000o1.f39262OooO00o, i);
                }
            });
        }
        if (z) {
            oo0o0Oo.OooO0O0 oooO0O3 = new oo0o0Oo.OooO0O0();
            if (o0o000o2.f39262OooO00o.OooOOo0()) {
                i6 = i4;
                obj = null;
                o000oooo3 = null;
                obj2 = null;
                i7 = -1;
            } else {
                Object obj7 = o0o000o2.f39263OooO0O0.f39859OooO00o;
                o0o000o2.f39262OooO00o.OooO0oo(obj7, oooO0O3);
                int i13 = oooO0O3.f12906OooO0o;
                int iOooO0O0 = o0o000o2.f39262OooO00o.OooO0O0(obj7);
                obj2 = obj7;
                obj = o0o000o2.f39262OooO00o.OooOOO(i13, this.f11040OooO00o).f12928OooO0Oo;
                o000oooo3 = this.f11040OooO00o.f12929OooO0o;
                i6 = i13;
                i7 = iOooO0O0;
            }
            if (i3 == 0) {
                if (o0o000o2.f39263OooO0O0.OooO00o()) {
                    com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O4 = o0o000o2.f39263OooO0O0;
                    jO0Oo0oo = oooO0O3.OooO00o(oooO0O4.f39860OooO0O0, oooO0O4.f39861OooO0OO);
                    jO0Oo0oo2 = o0Oo0oo(o0o000o2);
                } else {
                    jO0Oo0oo = o0o000o2.f39263OooO0O0.f39863OooO0o0 != -1 ? o0Oo0oo(this.f11133Oooooo) : oooO0O3.f12909OooO0oo + oooO0O3.f12908OooO0oO;
                    jO0Oo0oo2 = jO0Oo0oo;
                }
            } else if (o0o000o2.f39263OooO0O0.OooO00o()) {
                jO0Oo0oo = o0o000o2.f39277OooOOo;
                jO0Oo0oo2 = o0Oo0oo(o0o000o2);
            } else {
                jO0Oo0oo = oooO0O3.f12909OooO0oo + o0o000o2.f39277OooOOo;
                jO0Oo0oo2 = jO0Oo0oo;
            }
            long jOoooOO0 = o0O00.OoooOO0(jO0Oo0oo);
            long jOoooOO1 = o0O00.OoooOO0(jO0Oo0oo2);
            com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O5 = o0o000o2.f39263OooO0O0;
            final Player.OooO0o oooO0o = new Player.OooO0o(obj, i6, o000oooo3, obj2, i7, jOoooOO0, jOoooOO1, oooO0O5.f39860OooO0O0, oooO0O5.f39861OooO0OO);
            int iOooOo00 = OooOo00();
            if (this.f11133Oooooo.f39262OooO00o.OooOOo0()) {
                obj3 = null;
                o000oooo4 = null;
                obj4 = null;
                i8 = -1;
            } else {
                o0O000o0 o0o000o3 = this.f11133Oooooo;
                Object obj8 = o0o000o3.f39263OooO0O0.f39859OooO00o;
                o0o000o3.f39262OooO00o.OooO0oo(obj8, this.f11088OooOOO);
                int iOooO0O1 = this.f11133Oooooo.f39262OooO00o.OooO0O0(obj8);
                oo0o0Oo oo0o0oo3 = this.f11133Oooooo.f39262OooO00o;
                oo0o0Oo.OooO0OO oooO0OO2 = this.f11040OooO00o;
                Object obj9 = oo0o0oo3.OooOOO(iOooOo00, oooO0OO2).f12928OooO0Oo;
                i8 = iOooO0O1;
                o000oooo4 = oooO0OO2.f12929OooO0o;
                obj4 = obj8;
                obj3 = obj9;
            }
            long jOoooOO2 = o0O00.OoooOO0(j);
            long jOoooOO3 = this.f11133Oooooo.f39263OooO0O0.OooO00o() ? o0O00.OoooOO0(o0Oo0oo(this.f11133Oooooo)) : jOoooOO2;
            com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O6 = this.f11133Oooooo.f39263OooO0O0;
            final Player.OooO0o oooO0o2 = new Player.OooO0o(obj3, iOooOo00, o000oooo4, obj4, i8, jOoooOO2, jOoooOO3, oooO0O6.f39860OooO0O0, oooO0O6.f39861OooO0OO);
            this.f11087OooOO0o.OooO0OO(11, new o00O.OooO00o() { // from class: o00o0o0o.o00O0OOO
                @Override // o00oo0o.o00O.OooO00o
                public final void invoke(Object obj10) {
                    Player.OooO0OO oooO0OO3 = (Player.OooO0OO) obj10;
                    int i14 = i3;
                    oooO0OO3.onPositionDiscontinuity(i14);
                    oooO0OO3.onPositionDiscontinuity(oooO0o, oooO0o2, i14);
                }
            });
        }
        if (zBooleanValue) {
            this.f11087OooOO0o.OooO0OO(1, new o00O.OooO00o() { // from class: o00o0o0o.o000O
                @Override // o00oo0o.o00O.OooO00o
                public final void invoke(Object obj10) {
                    ((Player.OooO0OO) obj10).onMediaItemTransition(o000oooo2, iIntValue);
                }
            });
        }
        if (o0o000o2.f39266OooO0o != o0o000o1.f39266OooO0o) {
            this.f11087OooOO0o.OooO0OO(10, new o000OO00(o0o000o1));
            if (o0o000o1.f39266OooO0o != null) {
                this.f11087OooOO0o.OooO0OO(10, new p203o00o0o0o.o000OOo0(o0o000o1));
            }
        }
        o00O000 o00o001 = o0o000o2.f39261OooO;
        o00O000 o00o002 = o0o000o1.f39261OooO;
        if (o00o001 != o00o002) {
            this.f11084OooO0oo.OooO0OO(o00o002.f40406OooO0o0);
            this.f11087OooOO0o.OooO0OO(2, new o00(o0o000o1));
        }
        if (z4) {
            final MediaMetadata mediaMetadata2 = this.f11116Oooo0oO;
            this.f11087OooOO0o.OooO0OO(14, new o00O.OooO00o() { // from class: o00o0o0o.o00O0000
                @Override // o00oo0o.o00O.OooO00o
                public final void invoke(Object obj10) {
                    ((Player.OooO0OO) obj10).onMediaMetadataChanged(mediaMetadata2);
                }
            });
        }
        if (z7) {
            this.f11087OooOO0o.OooO0OO(3, new o0O0ooO(o0o000o1));
        }
        if (z6 || z5) {
            this.f11087OooOO0o.OooO0OO(-1, new o00O.OooO00o() { // from class: o00o0o0o.o00oOoo
                @Override // o00oo0o.o00O.OooO00o
                public final void invoke(Object obj10) {
                    o0O000o0 o0o000o4 = o0o000o1;
                    ((Player.OooO0OO) obj10).onPlayerStateChanged(o0o000o4.f39272OooOO0o, o0o000o4.f39267OooO0o0);
                }
            });
        }
        if (z6) {
            this.f11087OooOO0o.OooO0OO(4, new o00O.OooO00o() { // from class: o00o0o0o.o00O000
                @Override // o00oo0o.o00O.OooO00o
                public final void invoke(Object obj10) {
                    ((Player.OooO0OO) obj10).onPlaybackStateChanged(o0o000o1.f39267OooO0o0);
                }
            });
        }
        if (z5) {
            this.f11087OooOO0o.OooO0OO(5, new o00O.OooO00o() { // from class: o00o0o0o.o00O0O0O
                @Override // o00oo0o.o00O.OooO00o
                public final void invoke(Object obj10) {
                    ((Player.OooO0OO) obj10).onPlayWhenReadyChanged(o0o000o1.f39272OooOO0o, i2);
                }
            });
        }
        if (o0o000o2.f39274OooOOO0 != o0o000o1.f39274OooOOO0) {
            this.f11087OooOO0o.OooO0OO(6, new o00O0OO0(o0o000o1));
        }
        if (o0o000o2.OooOO0O() != o0o000o1.OooOO0O()) {
            this.f11087OooOO0o.OooO0OO(7, new oo0o0O0(o0o000o1));
        }
        if (!o0o000o2.f39273OooOOO.equals(o0o000o1.f39273OooOOO)) {
            this.f11087OooOO0o.OooO0OO(12, new p203o00o0o0o.o00O0OO(o0o000o1));
        }
        o00000O();
        this.f11087OooOO0o.OooO0O0();
        if (o0o000o2.f39275OooOOOO != o0o000o1.f39275OooOOOO) {
            Iterator<OooOOO0.OooO00o> it = this.f11089OooOOO0.iterator();
            while (it.hasNext()) {
                it.next().OooOo();
            }
        }
    }

    public final void o00000o0() {
        int iOooOOoo = OooOOoo();
        o0oO0O0o o0oo0o0o2 = this.f11103OooOoo;
        o0O0O0O o0o0o0o = this.f11104OooOoo0;
        if (iOooOOoo != 1) {
            if (iOooOOoo == 2 || iOooOOoo == 3) {
                o0000Ooo();
                boolean z = this.f11133Oooooo.f39275OooOOOO;
                OooOOO();
                o0o0o0o.getClass();
                OooOOO();
                o0oo0o0o2.getClass();
                return;
            }
            if (iOooOOoo != 4) {
                throw new IllegalStateException();
            }
        }
        o0o0o0o.getClass();
        o0oo0o0o2.getClass();
    }

    public final void o0000Ooo() {
        o00O0 o00o1 = this.f11080OooO0Oo;
        synchronized (o00o1) {
            boolean z = false;
            while (!o00o1.f40556OooO00o) {
                try {
                    o00o1.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f11094OooOOoo;
        if (threadCurrentThread != looper.getThread()) {
            String strOooOO0o = o0O00.OooOO0o("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), looper.getThread().getName());
            if (this.f11129Ooooo0o) {
                throw new IllegalStateException(strOooOO0o);
            }
            Log.OooO0oO("ExoPlayerImpl", strOooOO0o, this.f11130OooooO0 ? null : new IllegalStateException());
            this.f11130OooooO0 = true;
        }
    }

    public final void o000OOo() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.f11121OoooO0O;
        OooO0O0 oooO0O0 = this.f11095OooOo;
        if (sphericalGLSurfaceView != null) {
            oo000o oo000oVarO0ooOO0 = o0ooOO0(this.f11101OooOoO0);
            o00O000o.OooO0Oo(!oo000oVarO0ooOO0.f12893OooO0oO);
            oo000oVarO0ooOO0.f12890OooO0Oo = ResponseInfo.UnknownError;
            o00O000o.OooO0Oo(!oo000oVarO0ooOO0.f12893OooO0oO);
            oo000oVarO0ooOO0.f12892OooO0o0 = null;
            oo000oVarO0ooOO0.OooO0OO();
            this.f11121OoooO0O.f14389OooO0Oo.remove(oooO0O0);
            this.f11121OoooO0O = null;
        }
        TextureView textureView = this.f11122OoooOO0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != oooO0O0) {
                Log.OooO0o("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f11122OoooOO0.setSurfaceTextureListener(null);
            }
            this.f11122OoooOO0 = null;
        }
        SurfaceHolder surfaceHolder = this.f11119OoooO0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(oooO0O0);
            this.f11119OoooO0 = null;
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final o0oOOo o000oOoO() {
        o0000Ooo();
        return this.f11132OooooOo;
    }

    @Override // com.google.android.exoplayer2.OooO0OO
    public final void o00Oo0(long j, boolean z, int i, int i2) {
        o0000Ooo();
        int i3 = 0;
        o00O000o.OooO00o(i >= 0);
        this.f11092OooOOo.OooOo0o();
        oo0o0Oo oo0o0oo = this.f11133Oooooo.f39262OooO00o;
        if (oo0o0oo.OooOOo0() || i < oo0o0oo.OooOOOo()) {
            this.f11110Oooo00O++;
            if (OooO0Oo()) {
                Log.OooO0o("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                OooOo00.OooO0o oooO0o = new OooOo00.OooO0o(this.f11133Oooooo);
                oooO0o.OooO00o(1);
                OooOOO oooOOO = (OooOOO) this.f11085OooOO0.f39193OooO0Oo;
                oooOOO.getClass();
                oooOOO.f11077OooO.OooO0oo(new p203o00o0o0o.o00O00OO(i3, oooOOO, oooO0o));
                return;
            }
            o0O000o0 o0o000o0OooO0oO = this.f11133Oooooo;
            int i4 = o0o000o0OooO0oO.f39267OooO0o0;
            if (i4 == 3 || (i4 == 4 && !oo0o0oo.OooOOo0())) {
                o0o000o0OooO0oO = this.f11133Oooooo.OooO0oO(2);
            }
            int iOooOo00 = OooOo00();
            o0O000o0 o0o000o0O0OO00O = o0OO00O(o0o000o0OooO0oO, oo0o0oo, oo0o0Oo(oo0o0oo, i, j));
            long jOooo0O0 = o0O00.Oooo0O0(j);
            OooOo00 oooOo00 = this.f11086OooOO0O;
            oooOo00.getClass();
            oooOo00.f11273OooOO0O.OooO0o0(3, new OooOo00.OooOO0O(oo0o0oo, i, jOooo0O0)).OooO00o();
            o00000Oo(o0o000o0O0OO00O, 0, 1, true, 1, o0ooOoO(o0o000o0O0OO00O), iOooOo00, z);
        }
    }

    public final void o00oO0o() {
        o0000Ooo();
        o000OOo();
        o00000(null);
        o0O0O00(0, 0);
    }

    public final void o0O0O00(final int i, final int i2) {
        o0O00o0 o0o00o1 = this.f11123OoooOOO;
        if (i == o0o00o1.f40619OooO00o && i2 == o0o00o1.f40620OooO0O0) {
            return;
        }
        this.f11123OoooOOO = new o0O00o0(i, i2);
        this.f11087OooOO0o.OooO0o0(24, new o00O.OooO00o() { // from class: o00o0o0o.o00O00O
            @Override // o00oo0o.o00O.OooO00o
            public final void invoke(Object obj) {
                ((Player.OooO0OO) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        o000000(2, 14, new o0O00o0(i, i2));
    }

    public final o0O000o0 o0OO00O(o0O000o0 o0o000o1, oo0o0Oo oo0o0oo, @Nullable Pair<Object, Long> pair) {
        List<Metadata> list;
        o00O000o.OooO00o(oo0o0oo.OooOOo0() || pair != null);
        oo0o0Oo oo0o0oo2 = o0o000o1.f39262OooO00o;
        long jO0ooOOo = o0ooOOo(o0o000o1);
        o0O000o0 o0o000o0OooO0oo = o0o000o1.OooO0oo(oo0o0oo);
        if (oo0o0oo.OooOOo0()) {
            com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = o0O000o0.f39260OooOo00;
            long jOooo0O0 = o0O00.Oooo0O0(this.f11136Ooooooo);
            o0O000o0 o0o000o0OooO0O0 = o0o000o0OooO0oo.OooO0OO(oooO0O0, jOooo0O0, jOooo0O0, jOooo0O0, 0L, p226o00oOo00.o000O0.f39864OooO0oO, this.f11078OooO0O0, com.google.common.collect.o0O00.f19536OooO0oo).OooO0O0(oooO0O0);
            o0o000o0OooO0O0.f39276OooOOOo = o0o000o0OooO0O0.f39277OooOOo;
            return o0o000o0OooO0O0;
        }
        Object obj = o0o000o0OooO0oo.f39263OooO0O0.f39859OooO00o;
        boolean z = !obj.equals(pair.first);
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O1 = z ? new com.google.android.exoplayer2.source.OooOOOO.OooO0O0(pair.first) : o0o000o0OooO0oo.f39263OooO0O0;
        long jLongValue = ((Long) pair.second).longValue();
        long jOooo0O1 = o0O00.Oooo0O0(jO0ooOOo);
        if (!oo0o0oo2.OooOOo0()) {
            jOooo0O1 -= oo0o0oo2.OooO0oo(obj, this.f11088OooOOO).f12909OooO0oo;
        }
        if (z || jLongValue < jOooo0O1) {
            o00O000o.OooO0Oo(!oooO0O1.OooO00o());
            p226o00oOo00.o000O0 o000o0 = z ? p226o00oOo00.o000O0.f39864OooO0oO : o0o000o0OooO0oo.f39269OooO0oo;
            o00O000 o00o001 = z ? this.f11078OooO0O0 : o0o000o0OooO0oo.f39261OooO;
            if (z) {
                ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f19157OooO0o0;
                list = com.google.common.collect.o0O00.f19536OooO0oo;
            } else {
                list = o0o000o0OooO0oo.f39270OooOO0;
            }
            o0O000o0 o0o000o0OooO0O1 = o0o000o0OooO0oo.OooO0OO(oooO0O1, jLongValue, jLongValue, jLongValue, 0L, o000o0, o00o001, list).OooO0O0(oooO0O1);
            o0o000o0OooO0O1.f39276OooOOOo = jLongValue;
            return o0o000o0OooO0O1;
        }
        if (jLongValue != jOooo0O1) {
            o00O000o.OooO0Oo(!oooO0O1.OooO00o());
            long jMax = Math.max(0L, o0o000o0OooO0oo.f39278OooOOo0 - (jLongValue - jOooo0O1));
            long j = o0o000o0OooO0oo.f39276OooOOOo;
            if (o0o000o0OooO0oo.f39271OooOO0O.equals(o0o000o0OooO0oo.f39263OooO0O0)) {
                j = jLongValue + jMax;
            }
            o0O000o0 o0o000o0OooO0OO = o0o000o0OooO0oo.OooO0OO(oooO0O1, jLongValue, jLongValue, jLongValue, jMax, o0o000o0OooO0oo.f39269OooO0oo, o0o000o0OooO0oo.f39261OooO, o0o000o0OooO0oo.f39270OooOO0);
            o0o000o0OooO0OO.f39276OooOOOo = j;
            return o0o000o0OooO0OO;
        }
        int iOooO0O0 = oo0o0oo.OooO0O0(o0o000o0OooO0oo.f39271OooOO0O.f39859OooO00o);
        if (iOooO0O0 != -1 && oo0o0oo.OooO0oO(iOooO0O0, this.f11088OooOOO, false).f12906OooO0o == oo0o0oo.OooO0oo(oooO0O1.f39859OooO00o, this.f11088OooOOO).f12906OooO0o) {
            return o0o000o0OooO0oo;
        }
        oo0o0oo.OooO0oo(oooO0O1.f39859OooO00o, this.f11088OooOOO);
        long jOooO00o = oooO0O1.OooO00o() ? this.f11088OooOOO.OooO00o(oooO0O1.f39860OooO0O0, oooO0O1.f39861OooO0OO) : this.f11088OooOOO.f12908OooO0oO;
        o0O000o0 o0o000o0OooO0O2 = o0o000o0OooO0oo.OooO0OO(oooO0O1, o0o000o0OooO0oo.f39277OooOOo, o0o000o0OooO0oo.f39277OooOOo, o0o000o0OooO0oo.f39265OooO0Oo, jOooO00o - o0o000o0OooO0oo.f39277OooOOo, o0o000o0OooO0oo.f39269OooO0oo, o0o000o0OooO0oo.f39261OooO, o0o000o0OooO0oo.f39270OooOO0).OooO0O0(oooO0O1);
        o0o000o0OooO0O2.f39276OooOOOo = jOooO00o;
        return o0o000o0OooO0O2;
    }

    public final int o0OOO0o(o0O000o0 o0o000o1) {
        if (o0o000o1.f39262OooO00o.OooOOo0()) {
            return this.f11135OoooooO;
        }
        return o0o000o1.f39262OooO00o.OooO0oo(o0o000o1.f39263OooO0O0.f39859OooO00o, this.f11088OooOOO).f12906OooO0o;
    }

    public final oo000o o0ooOO0(oo000o.OooO0O0 oooO0O0) {
        int iO0OOO0o = o0OOO0o(this.f11133Oooooo);
        oo0o0Oo oo0o0oo = this.f11133Oooooo.f39262OooO00o;
        if (iO0OOO0o == -1) {
            iO0OOO0o = 0;
        }
        o0O0o o0o0o = this.f11099OooOo0o;
        OooOo00 oooOo00 = this.f11086OooOO0O;
        return new oo000o(oooOo00, oooO0O0, oo0o0oo, iO0OOO0o, o0o0o, oooOo00.f11276OooOOO0);
    }

    public final long o0ooOOo(o0O000o0 o0o000o1) {
        if (!o0o000o1.f39263OooO0O0.OooO00o()) {
            return o0O00.OoooOO0(o0ooOoO(o0o000o1));
        }
        Object obj = o0o000o1.f39263OooO0O0.f39859OooO00o;
        oo0o0Oo oo0o0oo = o0o000o1.f39262OooO00o;
        oo0o0Oo.OooO0O0 oooO0O0 = this.f11088OooOOO;
        oo0o0oo.OooO0oo(obj, oooO0O0);
        long j = o0o000o1.f39264OooO0OO;
        return j == -9223372036854775807L ? o0O00.OoooOO0(oo0o0oo.OooOOO(o0OOO0o(o0o000o1), this.f11040OooO00o).f12939OooOOOo) : o0O00.OoooOO0(oooO0O0.f12909OooO0oo) + o0O00.OoooOO0(j);
    }

    public final long o0ooOoO(o0O000o0 o0o000o1) {
        if (o0o000o1.f39262OooO00o.OooOOo0()) {
            return o0O00.Oooo0O0(this.f11136Ooooooo);
        }
        long jOooOO0 = o0o000o1.f39275OooOOOO ? o0o000o1.OooOO0() : o0o000o1.f39277OooOOo;
        if (o0o000o1.f39263OooO0O0.OooO00o()) {
            return jOooOO0;
        }
        oo0o0Oo oo0o0oo = o0o000o1.f39262OooO00o;
        Object obj = o0o000o1.f39263OooO0O0.f39859OooO00o;
        oo0o0Oo.OooO0O0 oooO0O0 = this.f11088OooOOO;
        oo0o0oo.OooO0oo(obj, oooO0O0);
        return jOooOO0 + oooO0O0.f12909OooO0oo;
    }

    public final MediaMetadata oo000o() {
        oo0o0Oo oo0o0ooOooOO0 = OooOO0();
        if (oo0o0ooOooOO0.OooOOo0()) {
            return this.f11134Oooooo0;
        }
        o000oOoO o000oooo2 = oo0o0ooOooOO0.OooOOO(OooOo00(), this.f11040OooO00o).f12929OooO0o;
        MediaMetadata mediaMetadata = this.f11134Oooooo0;
        mediaMetadata.getClass();
        MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o(mediaMetadata);
        MediaMetadata mediaMetadata2 = o000oooo2.f12671OooO0oO;
        if (mediaMetadata2 != null) {
            CharSequence charSequence = mediaMetadata2.f10964OooO0Oo;
            if (charSequence != null) {
                oooO00o.f10998OooO00o = charSequence;
            }
            CharSequence charSequence2 = mediaMetadata2.f10966OooO0o0;
            if (charSequence2 != null) {
                oooO00o.f10999OooO0O0 = charSequence2;
            }
            CharSequence charSequence3 = mediaMetadata2.f10965OooO0o;
            if (charSequence3 != null) {
                oooO00o.f11000OooO0OO = charSequence3;
            }
            CharSequence charSequence4 = mediaMetadata2.f10967OooO0oO;
            if (charSequence4 != null) {
                oooO00o.f11001OooO0Oo = charSequence4;
            }
            CharSequence charSequence5 = mediaMetadata2.f10968OooO0oo;
            if (charSequence5 != null) {
                oooO00o.f11003OooO0o0 = charSequence5;
            }
            CharSequence charSequence6 = mediaMetadata2.f10963OooO;
            if (charSequence6 != null) {
                oooO00o.f11002OooO0o = charSequence6;
            }
            CharSequence charSequence7 = mediaMetadata2.f10969OooOO0;
            if (charSequence7 != null) {
                oooO00o.f11004OooO0oO = charSequence7;
            }
            o0ooOOo o0ooooo = mediaMetadata2.f10970OooOO0O;
            if (o0ooooo != null) {
                oooO00o.f11005OooO0oo = o0ooooo;
            }
            o0ooOOo o0ooooo2 = mediaMetadata2.f10971OooOO0o;
            if (o0ooooo2 != null) {
                oooO00o.f10997OooO = o0ooooo2;
            }
            byte[] bArr = mediaMetadata2.f10973OooOOO0;
            if (bArr != null) {
                oooO00o.f11006OooOO0 = (byte[]) bArr.clone();
                oooO00o.f11007OooOO0O = mediaMetadata2.f10972OooOOO;
            }
            Uri uri = mediaMetadata2.f10974OooOOOO;
            if (uri != null) {
                oooO00o.f11008OooOO0o = uri;
            }
            Integer num = mediaMetadata2.f10975OooOOOo;
            if (num != null) {
                oooO00o.f11010OooOOO0 = num;
            }
            Integer num2 = mediaMetadata2.f10977OooOOo0;
            if (num2 != null) {
                oooO00o.f11009OooOOO = num2;
            }
            Integer num3 = mediaMetadata2.f10976OooOOo;
            if (num3 != null) {
                oooO00o.f11011OooOOOO = num3;
            }
            Boolean bool = mediaMetadata2.f10978OooOOoo;
            if (bool != null) {
                oooO00o.f11012OooOOOo = bool;
            }
            Boolean bool2 = mediaMetadata2.f10981OooOo00;
            if (bool2 != null) {
                oooO00o.f11014OooOOo0 = bool2;
            }
            Integer num4 = mediaMetadata2.f10980OooOo0;
            if (num4 != null) {
                oooO00o.f11013OooOOo = num4;
            }
            Integer num5 = mediaMetadata2.f10982OooOo0O;
            if (num5 != null) {
                oooO00o.f11013OooOOo = num5;
            }
            Integer num6 = mediaMetadata2.f10983OooOo0o;
            if (num6 != null) {
                oooO00o.f11015OooOOoo = num6;
            }
            Integer num7 = mediaMetadata2.f10979OooOo;
            if (num7 != null) {
                oooO00o.f11018OooOo00 = num7;
            }
            Integer num8 = mediaMetadata2.f10985OooOoO0;
            if (num8 != null) {
                oooO00o.f11017OooOo0 = num8;
            }
            Integer num9 = mediaMetadata2.f10984OooOoO;
            if (num9 != null) {
                oooO00o.f11019OooOo0O = num9;
            }
            Integer num10 = mediaMetadata2.f10986OooOoOO;
            if (num10 != null) {
                oooO00o.f11020OooOo0o = num10;
            }
            CharSequence charSequence8 = mediaMetadata2.f10988OooOoo0;
            if (charSequence8 != null) {
                oooO00o.f11016OooOo = charSequence8;
            }
            CharSequence charSequence9 = mediaMetadata2.f10987OooOoo;
            if (charSequence9 != null) {
                oooO00o.f11022OooOoO0 = charSequence9;
            }
            CharSequence charSequence10 = mediaMetadata2.f10989OooOooO;
            if (charSequence10 != null) {
                oooO00o.f11021OooOoO = charSequence10;
            }
            Integer num11 = mediaMetadata2.f10990OooOooo;
            if (num11 != null) {
                oooO00o.f11023OooOoOO = num11;
            }
            Integer num12 = mediaMetadata2.f10992Oooo000;
            if (num12 != null) {
                oooO00o.f11025OooOoo0 = num12;
            }
            CharSequence charSequence11 = mediaMetadata2.f10993Oooo00O;
            if (charSequence11 != null) {
                oooO00o.f11024OooOoo = charSequence11;
            }
            CharSequence charSequence12 = mediaMetadata2.f10994Oooo00o;
            if (charSequence12 != null) {
                oooO00o.f11026OooOooO = charSequence12;
            }
            CharSequence charSequence13 = mediaMetadata2.f10991Oooo0;
            if (charSequence13 != null) {
                oooO00o.f11027OooOooo = charSequence13;
            }
            Integer num13 = mediaMetadata2.f10995Oooo0O0;
            if (num13 != null) {
                oooO00o.f11028Oooo000 = num13;
            }
            Bundle bundle = mediaMetadata2.f10996Oooo0OO;
            if (bundle != null) {
                oooO00o.f11029Oooo00O = bundle;
            }
        }
        return new MediaMetadata(oooO00o);
    }

    @Nullable
    public final Pair<Object, Long> oo0o0Oo(oo0o0Oo oo0o0oo, int i, long j) {
        if (oo0o0oo.OooOOo0()) {
            this.f11135OoooooO = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f11136Ooooooo = j;
            return null;
        }
        if (i == -1 || i >= oo0o0oo.OooOOOo()) {
            i = oo0o0oo.OooO00o(this.f11109Oooo000);
            j = o0O00.OoooOO0(oo0o0oo.OooOOO(i, this.f11040OooO00o).f12939OooOOOo);
        }
        return oo0o0oo.OooOO0(this.f11040OooO00o, this.f11088OooOOO, i, o0O00.Oooo0O0(j));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void release() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.19.0] [");
        sb.append(o0O00.f40600OooO0o0);
        sb.append("] [");
        HashSet<String> hashSet = o00OOO0.f39206OooO00o;
        synchronized (o00OOO0.class) {
            str = o00OOO0.f39207OooO0O0;
        }
        sb.append(str);
        sb.append("]");
        Log.OooO0o0("ExoPlayerImpl", sb.toString());
        o0000Ooo();
        if (o0O00.f40595OooO00o < 21 && (audioTrack = this.f11117Oooo0oo) != null) {
            audioTrack.release();
            this.f11117Oooo0oo = null;
        }
        this.f11100OooOoO.OooO00o();
        this.f11104OooOoo0.getClass();
        this.f11103OooOoo.getClass();
        AudioFocusManager audioFocusManager = this.f11102OooOoOO;
        audioFocusManager.f10888OooO0OO = null;
        audioFocusManager.OooO00o();
        if (!this.f11086OooOO0O.OooOoO0()) {
            this.f11087OooOO0o.OooO0o0(10, new p203o00o0o0o.o00O000o());
        }
        this.f11087OooOO0o.OooO0Oo();
        this.f11077OooO.OooO0OO();
        this.f11097OooOo00.OooO0Oo(this.f11092OooOOo);
        o0O000o0 o0o000o1 = this.f11133Oooooo;
        if (o0o000o1.f39275OooOOOO) {
            this.f11133Oooooo = o0o000o1.OooO00o();
        }
        o0O000o0 o0o000o0OooO0oO = this.f11133Oooooo.OooO0oO(1);
        this.f11133Oooooo = o0o000o0OooO0oO;
        o0O000o0 o0o000o0OooO0O0 = o0o000o0OooO0oO.OooO0O0(o0o000o0OooO0oO.f39263OooO0O0);
        this.f11133Oooooo = o0o000o0OooO0O0;
        o0o000o0OooO0O0.f39276OooOOOo = o0o000o0OooO0O0.f39277OooOOo;
        this.f11133Oooooo.f39278OooOOo0 = 0L;
        this.f11092OooOOo.release();
        this.f11084OooO0oo.OooO0Oo();
        o000OOo();
        Surface surface = this.f11120OoooO00;
        if (surface != null) {
            surface.release();
            this.f11120OoooO00 = null;
        }
        this.f11128Ooooo00 = o0000O0O.f40111OooO0o;
        this.f11131OooooOO = true;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop() {
        o0000Ooo();
        this.f11102OooOoOO.OooO0o0(1, OooOOO());
        o00000O0(null);
        this.f11128Ooooo00 = new o0000O0O(this.f11133Oooooo.f39277OooOOo, com.google.common.collect.o0O00.f19536OooO0oo);
    }
}
