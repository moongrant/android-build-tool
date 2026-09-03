package androidx.media3.exoplayer;

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
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOo00;
import androidx.media3.common.Oooo0;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.o00O0O;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.source.OooOOOO;
import androidx.media3.exoplayer.source.o00Ooo;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import o000O0.o0000O;
import o000O0.o0oOO;
import o000O00O.OooOo;
import o000O00O.o0000O0O;
import o000O00O.o0000Ooo;
import o000O00O.o0000oo;
import o000O00O.o000O;
import o000O00O.o000O0;
import o000O00O.o000O000;
import o000O00O.o000O00O;
import o000O00O.o000O0O0;
import o000O00O.o000O0Oo;
import o000O00O.o000O0o;
import o000O00O.o00O0OO;
import o000O00O.o00OO;
import o000O00O.o00OO000;
import o000O00O.o00OO0O0;
import o000O00O.o00OOO00;
import o000O00O.o00oOoo;
import o000O00O.o0O0O00;
import o000O00O.o0OO00O;
import o000O00O.o0Oo0oo;
import o000O00O.oOO00O;
import o000O00O.oo0oOO0;
import o000OOO.o0OoOo0;
import p037OoooOo0.o00O0000;
import p038OoooOoO.o000OO;
import p069o0000ooO.o0000;
import p074o000OO0o.oo000o;
import p080o000OoO.o00;
import p080o000OoO.o000000;
import p080o000OoO.o000O00;
import p080o000OoO.o000Oo0;
import p080o000OoO.o00Oo0;
import p080o000OoO.o0ooOOo;
import p080o000OoO.oo0o0Oo;
import p425o0OoO0o.o00000;
import p425o0OoO0o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends androidx.media3.common.OooO0O0 implements androidx.media3.exoplayer.OooO0o {

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final /* synthetic */ int f7121Ooooooo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000000 f7122OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O0 f7123OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Player.OooO00o f7124OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0o0Oo f7125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Player f7126OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f7127OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Renderer[] f7128OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000 f7129OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000O00O.o000000 f7130OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O f7131OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final p080o000OoO.o00000O0<Player.OooO0OO> f7132OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Oooo0.OooO0O0 f7133OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final CopyOnWriteArraySet<androidx.media3.exoplayer.OooO0o.OooO00o> f7134OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ArrayList f7135OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f7136OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o000O0.OooO00o f7137OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final OooOOOO.OooO00o f7138OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Looper f7139OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f7140OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final long f7141OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final oo000o f7142OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final long f7143OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o000O00 f7144OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final androidx.media3.exoplayer.OooO00o f7145OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f7146OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AudioFocusManager f7147OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final o00OOO00 f7148OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final o00OO f7149OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final long f7150OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f7151OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Surface f7152Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f7153Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f7154Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f7155Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f7156Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f7157Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public o00Ooo f7158Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public MediaMetadata f7159Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public Player.OooO00o f7160Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public AudioTrack f7161Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Object f7162Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public TextureView f7163OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public SphericalGLSurfaceView f7164OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public SurfaceHolder f7165OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f7166OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f7167OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final int f7168OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public androidx.media3.common.OooO00o f7169OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f7170OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f7171OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public o000O000.OooO0O0 f7172OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final boolean f7173Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f7174Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f7175OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public androidx.media3.common.o00Ooo f7176OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public MediaMetadata f7177OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f7178Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public o00O0OO f7179Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public long f7180OoooooO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public o000Oo0 f7181o000oOoO;

    @RequiresApi(31)
    public static final class OooO00o {
        @DoNotInline
        public static o0oOO OooO00o(Context context, OooO oooO, boolean z) {
            MediaMetricsManager mediaMetricsManagerOooO00o = o0000O.OooO00o(context.getSystemService("media_metrics"));
            androidx.media3.exoplayer.analytics.OooO0OO oooO0OO = mediaMetricsManagerOooO00o == null ? null : new androidx.media3.exoplayer.analytics.OooO0OO(context, mediaMetricsManagerOooO00o.createPlaybackSession());
            if (oooO0OO == null) {
                Log.OooO0o("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new o0oOO(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                oooO.getClass();
                oooO.f7137OooOOo.OooOoo(oooO0OO);
            }
            return new o0oOO(oooO0OO.f7375OooO0OO.getSessionId());
        }
    }

    public final class OooO0O0 implements o0OoOo0, androidx.media3.exoplayer.audio.OooO0O0, o000OO00.OooO0OO, p071o000O0o0.o00Ooo, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.OooO0O0, AudioFocusManager.OooO0O0, androidx.media3.exoplayer.OooO00o.OooO0O0, androidx.media3.exoplayer.OooO0o.OooO00o {
        public OooO0O0() {
        }

        @Override // o000OOO.o0OoOo0
        public final void OooO(Exception exc) {
            OooO.this.f7137OooOOo.OooO(exc);
        }

        @Override // o000OOO.o0OoOo0
        public final void OooO00o(OooOo oooOo) {
            OooO.this.f7137OooOOo.OooO00o(oooOo);
        }

        @Override // o000OOO.o0OoOo0
        public final void OooO0O0(String str) {
            OooO.this.f7137OooOOo.OooO0O0(str);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0OO(String str) {
            OooO.this.f7137OooOOo.OooO0OO(str);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0Oo(OooOo oooOo) {
            OooO.this.f7137OooOOo.OooO0Oo(oooOo);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0o(long j) {
            OooO.this.f7137OooOOo.OooO0o(j);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0o0(Exception exc) {
            OooO.this.f7137OooOOo.OooO0o0(exc);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0oO(androidx.media3.common.OooOO0 oooOO1, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            OooO oooO = OooO.this;
            oooO.getClass();
            oooO.f7137OooOOo.OooO0oO(oooOO1, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0oo(OooOo oooOo) {
            OooO oooO = OooO.this;
            oooO.getClass();
            oooO.f7137OooOOo.OooO0oo(oooOo);
        }

        @Override // o000OOO.o0OoOo0
        public final void OooOO0(long j, Object obj) {
            OooO oooO = OooO.this;
            oooO.f7137OooOOo.OooOO0(j, obj);
            if (oooO.f7162Oooo0oo == obj) {
                oooO.f7132OooOO0o.OooO0o(26, new o000O0O0());
            }
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final /* synthetic */ void OooOO0O() {
        }

        @Override // o000OOO.o0OoOo0
        public final void OooOO0o(OooOo oooOo) {
            OooO oooO = OooO.this;
            oooO.getClass();
            oooO.f7137OooOOo.OooOO0o(oooOo);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooOOO(long j, long j2, String str) {
            OooO.this.f7137OooOOo.OooOOO(j, j2, str);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.OooO0O0
        public final void OooOOO0(Surface surface) {
            OooO.this.o0Oo0oo(surface);
        }

        @Override // o000OOO.o0OoOo0
        public final void OooOOOO(int i, long j) {
            OooO.this.f7137OooOOo.OooOOOO(i, j);
        }

        @Override // o000OOO.o0OoOo0
        public final void OooOOOo(int i, long j) {
            OooO.this.f7137OooOOo.OooOOOo(i, j);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooOOo(Exception exc) {
            OooO.this.f7137OooOOo.OooOOo(exc);
        }

        @Override // o000OOO.o0OoOo0
        public final void OooOOo0(androidx.media3.common.OooOO0 oooOO1, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            OooO oooO = OooO.this;
            oooO.getClass();
            oooO.f7137OooOOo.OooOOo0(oooOO1, decoderReuseEvaluation);
        }

        @Override // o000OOO.o0OoOo0
        public final /* synthetic */ void OooOOoo() {
        }

        @Override // androidx.media3.exoplayer.OooO0o.OooO00o
        public final void OooOo() {
            OooO.this.o000000o();
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooOo0(int i, long j, long j2) {
            OooO.this.f7137OooOOo.OooOo0(i, j, j2);
        }

        @Override // o000OOO.o0OoOo0
        public final void OooOo00(long j, long j2, String str) {
            OooO.this.f7137OooOOo.OooOo00(j, j2, str);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.OooO0O0
        public final void OooOo0O() {
            OooO.this.o0Oo0oo(null);
        }

        @Override // o000OO00.OooO0OO
        public final void OooOo0o(ImmutableList immutableList) {
            OooO.this.f7132OooOO0o.OooO0o(27, new o000O00O.o000O00(immutableList));
        }

        @Override // o000OO00.OooO0OO
        public final void onCues(o000O000.OooO0O0 oooO0O0) {
            OooO oooO = OooO.this;
            oooO.f7172OoooOoo = oooO0O0;
            oooO.f7132OooOO0o.OooO0o(27, new o000O0Oo(oooO0O0));
        }

        @Override // p071o000O0o0.o00Ooo
        public final void onMetadata(Metadata metadata) {
            OooO oooO = OooO.this;
            MediaMetadata mediaMetadata = oooO.f7177OooooOo;
            mediaMetadata.getClass();
            MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o(mediaMetadata);
            int i = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f6336OooO0Oo;
                if (i >= entryArr.length) {
                    break;
                }
                entryArr[i].o0ooOoO(oooO00o);
                i++;
            }
            oooO.f7177OooooOo = new MediaMetadata(oooO00o);
            MediaMetadata mediaMetadataOooooOo = oooO.OooooOo();
            boolean zEquals = mediaMetadataOooooOo.equals(oooO.f7159Oooo0o);
            p080o000OoO.o00000O0<Player.OooO0OO> o00000o1 = oooO.f7132OooOO0o;
            if (!zEquals) {
                oooO.f7159Oooo0o = mediaMetadataOooooOo;
                o00000o1.OooO0OO(14, new o000O00O(this));
            }
            o00000o1.OooO0OO(28, new o000O0(metadata));
            o00000o1.OooO0O0();
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void onSkipSilenceEnabledChanged(final boolean z) {
            OooO oooO = OooO.this;
            if (oooO.f7171OoooOoO == z) {
                return;
            }
            oooO.f7171OoooOoO = z;
            oooO.f7132OooOO0o.OooO0o(23, new o000OoO.o00000O0.OooO00o() { // from class: o000O00O.o000OO00
                @Override // o000OoO.o00000O0.OooO00o
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
            OooO oooO = OooO.this;
            oooO.getClass();
            Surface surface = new Surface(surfaceTexture);
            oooO.o0Oo0oo(surface);
            oooO.f7152Oooo = surface;
            oooO.oo000o(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            OooO oooO = OooO.this;
            oooO.o0Oo0oo(null);
            oooO.oo000o(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            OooO.this.oo000o(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // o000OOO.o0OoOo0
        public final void onVideoSizeChanged(androidx.media3.common.o00Ooo o00ooo2) {
            OooO oooO = OooO.this;
            oooO.f7176OooooOO = o00ooo2;
            oooO.f7132OooOO0o.OooO0o(25, new o000O(o00ooo2));
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            OooO.this.oo000o(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            OooO oooO = OooO.this;
            if (oooO.f7166OoooO0O) {
                oooO.o0Oo0oo(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            OooO oooO = OooO.this;
            if (oooO.f7166OoooO0O) {
                oooO.o0Oo0oo(null);
            }
            oooO.oo000o(0, 0);
        }
    }

    public static final class OooO0OO implements o000OOO.OooOO0O, o000OOo0.OooO00o, OooOOO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public o000OOO.OooOO0O f7183OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public o000OOO.OooOO0O f7184OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public o000OOo0.OooO00o f7185OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public o000OOo0.OooO00o f7186OooO0oO;

        @Override // o000OOo0.OooO00o
        public final void OooO00o(float[] fArr, long j) {
            o000OOo0.OooO00o oooO00o = this.f7186OooO0oO;
            if (oooO00o != null) {
                oooO00o.OooO00o(fArr, j);
            }
            o000OOo0.OooO00o oooO00o2 = this.f7185OooO0o0;
            if (oooO00o2 != null) {
                oooO00o2.OooO00o(fArr, j);
            }
        }

        @Override // o000OOo0.OooO00o
        public final void OooO0O0() {
            o000OOo0.OooO00o oooO00o = this.f7186OooO0oO;
            if (oooO00o != null) {
                oooO00o.OooO0O0();
            }
            o000OOo0.OooO00o oooO00o2 = this.f7185OooO0o0;
            if (oooO00o2 != null) {
                oooO00o2.OooO0O0();
            }
        }

        @Override // o000OOO.OooOO0O
        public final void OooO0OO(long j, long j2, androidx.media3.common.OooOO0 oooOO1, @Nullable MediaFormat mediaFormat) {
            o000OOO.OooOO0O oooOO0O = this.f7184OooO0o;
            if (oooOO0O != null) {
                oooOO0O.OooO0OO(j, j2, oooOO1, mediaFormat);
            }
            o000OOO.OooOO0O oooOO0O2 = this.f7183OooO0Oo;
            if (oooOO0O2 != null) {
                oooOO0O2.OooO0OO(j, j2, oooOO1, mediaFormat);
            }
        }

        @Override // androidx.media3.exoplayer.OooOOO.OooO0O0
        public final void OooOO0o(int i, @Nullable Object obj) {
            if (i == 7) {
                this.f7183OooO0Oo = (o000OOO.OooOO0O) obj;
                return;
            }
            if (i == 8) {
                this.f7185OooO0o0 = (o000OOo0.OooO00o) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f7184OooO0o = null;
                this.f7186OooO0oO = null;
            } else {
                this.f7184OooO0o = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f7186OooO0oO = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public static final class OooO0o implements oOO00O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f7187OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Oooo0 f7188OooO0O0;

        public OooO0o(androidx.media3.exoplayer.source.OooOOO0.OooO00o oooO00o, Object obj) {
            this.f7187OooO00o = obj;
            this.f7188OooO0O0 = oooO00o;
        }

        @Override // o000O00O.oOO00O
        public final Object OooO00o() {
            return this.f7187OooO00o;
        }

        @Override // o000O00O.oOO00O
        public final Oooo0 OooO0O0() {
            return this.f7188OooO0O0;
        }
    }

    static {
        o0000.OooO00o("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public OooO(androidx.media3.exoplayer.OooO0o.OooO0O0 oooO0O0) throws Throwable {
        OooO oooO = this;
        oooO.f7125OooO0Oo = new oo0o0Oo();
        try {
            Log.OooO0o0("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.1.1] [" + o00.f34915OooO0o0 + "]");
            Context context = oooO0O0.f7216OooO00o;
            Context applicationContext = context.getApplicationContext();
            oooO.f7127OooO0o0 = applicationContext;
            com.google.common.base.OooOOO<o0ooOOo, o000O0.OooO00o> oooOOO = oooO0O0.f7223OooO0oo;
            o000O00 o000o01 = oooO0O0.f7217OooO0O0;
            o000O0.OooO00o oooO00oApply = oooOOO.apply(o000o01);
            oooO.f7137OooOOo = oooO00oApply;
            oooO.f7169OoooOOo = oooO0O0.f7224OooOO0;
            oooO.f7167OoooOO0 = oooO0O0.f7225OooOO0O;
            oooO.f7171OoooOoO = false;
            oooO.f7150OooOooO = oooO0O0.f7231OooOOo;
            OooO0O0 oooO0O1 = oooO.new OooO0O0();
            oooO.f7140OooOo = oooO0O1;
            oooO.f7146OooOoO0 = new OooO0OO();
            Handler handler = new Handler(oooO0O0.f7215OooO);
            Renderer[] rendererArrOooO00o = oooO0O0.f7218OooO0OO.get().OooO00o(handler, oooO0O1, oooO0O1, oooO0O1, oooO0O1);
            oooO.f7128OooO0oO = rendererArrOooO00o;
            o00Oo0.OooO0Oo(rendererArrOooO00o.length > 0);
            o00000 o00000Var = oooO0O0.f7221OooO0o0.get();
            oooO.f7129OooO0oo = o00000Var;
            oooO.f7138OooOOo0 = oooO0O0.f7219OooO0Oo.get();
            oo000o oo000oVar = oooO0O0.f7222OooO0oO.get();
            oooO.f7142OooOo00 = oo000oVar;
            oooO.f7136OooOOOo = oooO0O0.f7226OooOO0o;
            o00OO0O0 o00oo0o1 = oooO0O0.f7228OooOOO0;
            oooO.f7141OooOo0 = oooO0O0.f7227OooOOO;
            oooO.f7143OooOo0O = oooO0O0.f7229OooOOOO;
            Looper looper = oooO0O0.f7215OooO;
            oooO.f7139OooOOoo = looper;
            oooO.f7144OooOo0o = o000o01;
            oooO.f7126OooO0o = oooO;
            oooO.f7132OooOO0o = new p080o000OoO.o00000O0<>(looper, o000o01, new o000OO(oooO));
            CopyOnWriteArraySet<androidx.media3.exoplayer.OooO0o.OooO00o> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            oooO.f7134OooOOO0 = copyOnWriteArraySet;
            oooO.f7135OooOOOO = new ArrayList();
            oooO.f7158Oooo0OO = new o00Ooo.OooO00o();
            o00000O0 o00000o1 = new o00000O0(new o00OO000[rendererArrOooO00o.length], new androidx.media3.exoplayer.trackselection.OooO0o[rendererArrOooO00o.length], androidx.media3.common.o00Oo0.f6850OooO0o0, null);
            oooO.f7123OooO0O0 = o00000o1;
            oooO.f7133OooOOO = new Oooo0.OooO0O0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = length;
                int i3 = iArr[i];
                o00Oo0.OooO0Oo(!false);
                sparseBooleanArray.append(i3, true);
                i++;
                length = i2;
                iArr = iArr;
            }
            o00000Var.getClass();
            if (o00000Var instanceof androidx.media3.exoplayer.trackselection.OooO0O0) {
                o00Oo0.OooO0Oo(!false);
                sparseBooleanArray.append(29, true);
            }
            o00Oo0.OooO0Oo(!false);
            androidx.media3.common.OooO oooO2 = new androidx.media3.common.OooO(sparseBooleanArray);
            oooO.f7124OooO0OO = new Player.OooO00o(oooO2);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            int i4 = 0;
            while (i4 < oooO2.OooO0OO()) {
                int iOooO0O0 = oooO2.OooO0O0(i4);
                o00Oo0.OooO0Oo(!false);
                sparseBooleanArray2.append(iOooO0O0, true);
                i4++;
                oooO2 = oooO2;
            }
            o00Oo0.OooO0Oo(!false);
            sparseBooleanArray2.append(4, true);
            o00Oo0.OooO0Oo(!false);
            sparseBooleanArray2.append(10, true);
            o00Oo0.OooO0Oo(!false);
            oooO.f7160Oooo0o0 = new Player.OooO00o(new androidx.media3.common.OooO(sparseBooleanArray2));
            oooO.f7122OooO = o000o01.OooO0O0(looper, null);
            o000O00O.o000000 o000000Var = new o000O00O.o000000(oooO);
            oooO.f7130OooOO0 = o000000Var;
            oooO.f7179Oooooo0 = o00O0OO.OooO(o00000o1);
            oooO00oApply.Oooo00o(oooO, looper);
            int i5 = o00.f34910OooO00o;
            o0oOO o0ooo2 = i5 < 31 ? new o0oOO() : OooO00o.OooO00o(applicationContext, oooO, oooO0O0.f7233OooOOoo);
            o00oOoo o00oooo2 = oooO0O0.f7220OooO0o.get();
            int i6 = oooO.f7151OooOooo;
            boolean z = oooO.f7154Oooo000;
            try {
                oooO = this;
                oooO.f7131OooOO0O = new OooOO0O(rendererArrOooO00o, o00000Var, o00000o1, o00oooo2, oo000oVar, i6, z, oooO00oApply, o00oo0o1, oooO0O0.f7230OooOOOo, oooO0O0.f7232OooOOo0, looper, o000o01, o000000Var, o0ooo2);
                oooO.f7170OoooOo0 = 1.0f;
                oooO.f7151OooOooo = 0;
                MediaMetadata mediaMetadata = MediaMetadata.f6236Oooo0o0;
                oooO.f7159Oooo0o = mediaMetadata;
                oooO.f7177OooooOo = mediaMetadata;
                int iGenerateAudioSessionId = -1;
                oooO.f7178Oooooo = -1;
                if (i5 < 21) {
                    AudioTrack audioTrack = oooO.f7161Oooo0oO;
                    if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                        oooO.f7161Oooo0oO.release();
                        oooO.f7161Oooo0oO = null;
                    }
                    if (oooO.f7161Oooo0oO == null) {
                        oooO.f7161Oooo0oO = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                    }
                    oooO.f7168OoooOOO = oooO.f7161Oooo0oO.getAudioSessionId();
                } else {
                    AudioManager audioManager = (AudioManager) oooO.f7127OooO0o0.getSystemService("audio");
                    if (audioManager != null) {
                        iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                    }
                    oooO.f7168OoooOOO = iGenerateAudioSessionId;
                }
                oooO.f7172OoooOoo = o000O000.OooO0O0.f33949OooO0o;
                oooO.f7173Ooooo00 = true;
                oooO.OooOOoo(oooO.f7137OooOOo);
                oo000oVar.OooO0o0(new Handler(looper), oooO.f7137OooOOo);
                copyOnWriteArraySet.add(oooO0O1);
                androidx.media3.exoplayer.OooO00o oooO00o = new androidx.media3.exoplayer.OooO00o(context, handler, oooO0O1);
                oooO.f7145OooOoO = oooO00o;
                oooO00o.OooO00o();
                AudioFocusManager audioFocusManager = new AudioFocusManager(context, handler, oooO0O1);
                oooO.f7147OooOoOO = audioFocusManager;
                audioFocusManager.OooO0OO(null);
                oooO.f7149OooOoo0 = new o00OO(context);
                oooO.f7148OooOoo = new o00OOO00(context);
                Oooooo();
                oooO.f7176OooooOO = androidx.media3.common.o00Ooo.f6864OooO0oo;
                oooO.f7181o000oOoO = o000Oo0.f34984OooO0OO;
                oooO.f7129OooO0oo.OooO0o(oooO.f7169OoooOOo);
                oooO.o00oO0O(1, 10, Integer.valueOf(oooO.f7168OoooOOO));
                oooO.o00oO0O(2, 10, Integer.valueOf(oooO.f7168OoooOOO));
                oooO.o00oO0O(1, 3, oooO.f7169OoooOOo);
                oooO.o00oO0O(2, 4, Integer.valueOf(oooO.f7167OoooOO0));
                oooO.o00oO0O(2, 5, 0);
                oooO.o00oO0O(1, 9, Boolean.valueOf(oooO.f7171OoooOoO));
                oooO.o00oO0O(2, 7, oooO.f7146OooOoO0);
                oooO.o00oO0O(6, 8, oooO.f7146OooOoO0);
                oooO.f7125OooO0Oo.OooO0Oo();
            } catch (Throwable th) {
                th = th;
                oooO = this;
                oooO.f7125OooO0Oo.OooO0Oo();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static DeviceInfo Oooooo() {
        DeviceInfo.OooO00o oooO00o = new DeviceInfo.OooO00o(0);
        oooO00o.f6222OooO0O0 = 0;
        oooO00o.f6223OooO0OO = 0;
        return oooO00o.OooO00o();
    }

    public static long o00Ooo(o00O0OO o00o0oo2) {
        Oooo0.OooO0o oooO0o = new Oooo0.OooO0o();
        Oooo0.OooO0O0 oooO0O0 = new Oooo0.OooO0O0();
        o00o0oo2.f34105OooO00o.OooOO0O(o00o0oo2.f34106OooO0O0.f33816OooO00o, oooO0O0);
        long j = o00o0oo2.f34107OooO0OO;
        return j == -9223372036854775807L ? o00o0oo2.f34105OooO00o.OooOOo0(oooO0O0.f6642OooO0o, oooO0o).f6680OooOOOo : oooO0O0.f6645OooO0oo + j;
    }

    @Override // androidx.media3.common.Player
    public final void OooO(@Nullable SurfaceView surfaceView) {
        o00000();
        if (surfaceView instanceof o000OOO.OooOO0) {
            o00oO0o();
            o0Oo0oo(surfaceView);
            o0ooOoO(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof SphericalGLSurfaceView;
        OooO0O0 oooO0O0 = this.f7140OooOo;
        if (z) {
            o00oO0o();
            this.f7164OoooO0 = (SphericalGLSurfaceView) surfaceView;
            OooOOO oooOOOOoooooO = OoooooO(this.f7146OooOoO0);
            o00Oo0.OooO0Oo(!oooOOOOoooooO.f7305OooO0oO);
            oooOOOOoooooO.f7302OooO0Oo = ResponseInfo.UnknownError;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.f7164OoooO0;
            o00Oo0.OooO0Oo(true ^ oooOOOOoooooO.f7305OooO0oO);
            oooOOOOoooooO.f7304OooO0o0 = sphericalGLSurfaceView;
            oooOOOOoooooO.OooO0OO();
            this.f7164OoooO0.f8334OooO0Oo.add(oooO0O0);
            o0Oo0oo(this.f7164OoooO0.getVideoSurface());
            o0ooOoO(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        o00000();
        if (holder == null) {
            Oooooo0();
            return;
        }
        o00oO0o();
        this.f7166OoooO0O = true;
        this.f7165OoooO00 = holder;
        holder.addCallback(oooO0O0);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            o0Oo0oo(null);
            oo000o(0, 0);
        } else {
            o0Oo0oo(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            oo000o(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.common.Player
    public final void OooO00o(androidx.media3.common.OooOOOO oooOOOO) {
        o00000();
        if (this.f7179Oooooo0.f34116OooOOO.equals(oooOOOO)) {
            return;
        }
        o00O0OO o00o0ooOooO0o = this.f7179Oooooo0.OooO0o(oooOOOO);
        this.f7155Oooo00O++;
        this.f7131OooOO0O.f7243OooOO0O.OooO0o0(4, oooOOOO).OooO00o();
        o000000O(o00o0ooOooO0o, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.OooOOOO OooO0O0() {
        o00000();
        return this.f7179Oooooo0.f34116OooOOO;
    }

    @Override // androidx.media3.common.Player
    public final boolean OooO0o() {
        o00000();
        return this.f7179Oooooo0.f34106OooO0O0.OooO00o();
    }

    @Override // androidx.media3.common.Player
    public final void OooO0o0() {
        o00000();
        boolean zOooOoOO = OooOoOO();
        int iOooO0o0 = this.f7147OooOoOO.OooO0o0(2, zOooOoOO);
        o000000(iOooO0o0, (!zOooOoOO || iOooO0o0 == 1) ? 1 : 2, zOooOoOO);
        o00O0OO o00o0oo2 = this.f7179Oooooo0;
        if (o00o0oo2.f34110OooO0o0 != 1) {
            return;
        }
        o00O0OO o00o0ooOooO0o0 = o00o0oo2.OooO0o0(null);
        o00O0OO o00o0ooOooO0oO = o00o0ooOooO0o0.OooO0oO(o00o0ooOooO0o0.f34105OooO00o.OooOo00() ? 4 : 2);
        this.f7155Oooo00O++;
        this.f7131OooOO0O.f7243OooOO0O.OooO0O0(0).OooO00o();
        o000000O(o00o0ooOooO0oO, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.Player
    public final long OooO0oO() {
        o00000();
        return o00.o000oOoO(this.f7179Oooooo0.f34121OooOOo0);
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public final PlaybackException OooOO0O() {
        o00000();
        return this.f7179Oooooo0.f34109OooO0o;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.o00Oo0 OooOO0o() {
        o00000();
        return this.f7179Oooooo0.f34104OooO.f46757OooO0Oo;
    }

    @Override // androidx.media3.common.Player
    public final o000O000.OooO0O0 OooOOO() {
        o00000();
        return this.f7172OoooOoo;
    }

    @Override // androidx.media3.common.Player
    public final void OooOOOO(Player.OooO0OO oooO0OO) {
        o00000();
        oooO0OO.getClass();
        this.f7132OooOO0o.OooO0o0(oooO0OO);
    }

    @Override // androidx.media3.common.Player
    public final int OooOOOo() {
        o00000();
        if (OooO0o()) {
            return this.f7179Oooooo0.f34106OooO0O0.f33817OooO0O0;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final void OooOOoo(Player.OooO0OO oooO0OO) {
        oooO0OO.getClass();
        this.f7132OooOO0o.OooO00o(oooO0OO);
    }

    @Override // androidx.media3.common.Player
    public final Oooo0 OooOo0() {
        o00000();
        return this.f7179Oooooo0.f34105OooO00o;
    }

    @Override // androidx.media3.common.Player
    public final int OooOo00() {
        o00000();
        return this.f7179Oooooo0.f34117OooOOO0;
    }

    @Override // androidx.media3.common.Player
    public final Looper OooOo0O() {
        return this.f7139OooOOoo;
    }

    @Override // androidx.media3.common.Player
    public final o00O0O OooOo0o() {
        o00000();
        return this.f7129OooO0oo.OooO00o();
    }

    @Override // androidx.media3.common.Player
    public final void OooOoO0(@Nullable TextureView textureView) {
        o00000();
        if (textureView == null) {
            Oooooo0();
            return;
        }
        o00oO0o();
        this.f7163OoooO = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.OooO0o("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f7140OooOo);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            o0Oo0oo(null);
            oo000o(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            o0Oo0oo(surface);
            this.f7152Oooo = surface;
            oo000o(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean OooOoOO() {
        o00000();
        return this.f7179Oooooo0.f34115OooOO0o;
    }

    @Override // androidx.media3.common.Player
    public final void OooOoo0(final boolean z) {
        o00000();
        if (this.f7154Oooo000 != z) {
            this.f7154Oooo000 = z;
            this.f7131OooOO0O.f7243OooOO0O.OooO0oo(12, z ? 1 : 0, 0).OooO00o();
            o000OoO.o00000O0.OooO00o<Player.OooO0OO> oooO00o = new o000OoO.o00000O0.OooO00o() { // from class: o000O00O.o0000O00
                @Override // o000OoO.o00000O0.OooO00o
                public final void invoke(Object obj) {
                    ((Player.OooO0OO) obj).onShuffleModeEnabledChanged(z);
                }
            };
            p080o000OoO.o00000O0<Player.OooO0OO> o00000o1 = this.f7132OooOO0o;
            o00000o1.OooO0OO(9, oooO00o);
            o000OOo();
            o00000o1.OooO0O0();
        }
    }

    @Override // androidx.media3.common.Player
    public final int OooOooO() {
        o00000();
        if (this.f7179Oooooo0.f34105OooO00o.OooOo00()) {
            return 0;
        }
        o00O0OO o00o0oo2 = this.f7179Oooooo0;
        return o00o0oo2.f34105OooO00o.OooO0o0(o00o0oo2.f34106OooO0O0.f33816OooO00o);
    }

    @Override // androidx.media3.common.Player
    public final void OooOooo(@Nullable TextureView textureView) {
        o00000();
        if (textureView == null || textureView != this.f7163OoooO) {
            return;
        }
        Oooooo0();
    }

    @Override // androidx.media3.common.Player
    public final void Oooo(o00O0O o00o0o2) {
        o00000();
        o00000 o00000Var = this.f7129OooO0oo;
        o00000Var.getClass();
        if (!(o00000Var instanceof androidx.media3.exoplayer.trackselection.OooO0O0) || o00o0o2.equals(o00000Var.OooO00o())) {
            return;
        }
        o00000Var.OooO0oO(o00o0o2);
        this.f7132OooOO0o.OooO0o(19, new o0000oo(o00o0o2));
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.o00Ooo Oooo000() {
        o00000();
        return this.f7176OooooOO;
    }

    @Override // androidx.media3.common.Player
    public final int Oooo00o() {
        o00000();
        if (OooO0o()) {
            return this.f7179Oooooo0.f34106OooO0O0.f33818OooO0OO;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final long Oooo0O0() {
        o00000();
        return this.f7143OooOo0O;
    }

    @Override // androidx.media3.common.Player
    public final long Oooo0OO() {
        o00000();
        return o0OoOo0(this.f7179Oooooo0);
    }

    @Override // androidx.media3.common.Player
    public final int Oooo0o() {
        o00000();
        return this.f7179Oooooo0.f34110OooO0o0;
    }

    @Override // androidx.media3.common.Player
    public final int Oooo0oO() {
        o00000();
        int iO00O0O = o00O0O(this.f7179Oooooo0);
        if (iO00O0O == -1) {
            return 0;
        }
        return iO00O0O;
    }

    @Override // androidx.media3.common.Player
    public final void Oooo0oo(final int i) {
        o00000();
        if (this.f7151OooOooo != i) {
            this.f7151OooOooo = i;
            this.f7131OooOO0O.f7243OooOO0O.OooO0oo(11, i, 0).OooO00o();
            o000OoO.o00000O0.OooO00o<Player.OooO0OO> oooO00o = new o000OoO.o00000O0.OooO00o() { // from class: o000O00O.o000000O
                @Override // o000OoO.o00000O0.OooO00o
                public final void invoke(Object obj) {
                    ((Player.OooO0OO) obj).onRepeatModeChanged(i);
                }
            };
            p080o000OoO.o00000O0<Player.OooO0OO> o00000o1 = this.f7132OooOO0o;
            o00000o1.OooO0OO(8, oooO00o);
            o000OOo();
            o00000o1.OooO0O0();
        }
    }

    @Override // androidx.media3.common.Player
    public final long OoooO() {
        o00000();
        if (this.f7179Oooooo0.f34105OooO00o.OooOo00()) {
            return this.f7180OoooooO;
        }
        o00O0OO o00o0oo2 = this.f7179Oooooo0;
        if (o00o0oo2.f34114OooOO0O.f33819OooO0Oo != o00o0oo2.f34106OooO0O0.f33819OooO0Oo) {
            return o00o0oo2.f34105OooO00o.OooOOo0(Oooo0oO(), this.f6355OooO00o).OooO0OO();
        }
        long j = o00o0oo2.f34119OooOOOo;
        if (this.f7179Oooooo0.f34114OooOO0O.OooO00o()) {
            o00O0OO o00o0oo3 = this.f7179Oooooo0;
            Oooo0.OooO0O0 oooO0O0OooOO0O = o00o0oo3.f34105OooO00o.OooOO0O(o00o0oo3.f34114OooOO0O.f33816OooO00o, this.f7133OooOOO);
            long jOooO0oO = oooO0O0OooOO0O.OooO0oO(this.f7179Oooooo0.f34114OooOO0O.f33817OooO0O0);
            j = jOooO0oO == Long.MIN_VALUE ? oooO0O0OooOO0O.f6644OooO0oO : jOooO0oO;
        }
        o00O0OO o00o0oo4 = this.f7179Oooooo0;
        Oooo0 oooo0 = o00o0oo4.f34105OooO00o;
        Object obj = o00o0oo4.f34114OooOO0O.f33816OooO00o;
        Oooo0.OooO0O0 oooO0O0 = this.f7133OooOOO;
        oooo0.OooOO0O(obj, oooO0O0);
        return o00.o000oOoO(j + oooO0O0.f6645OooO0oo);
    }

    @Override // androidx.media3.common.Player
    public final int OoooO0() {
        o00000();
        return this.f7151OooOooo;
    }

    @Override // androidx.media3.common.Player
    public final void OoooO00(@Nullable SurfaceView surfaceView) {
        o00000();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        o00000();
        if (holder == null || holder != this.f7165OoooO00) {
            return;
        }
        Oooooo0();
    }

    @Override // androidx.media3.common.Player
    public final boolean OoooO0O() {
        o00000();
        return this.f7154Oooo000;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata OoooOOO() {
        o00000();
        return this.f7159Oooo0o;
    }

    @Override // androidx.media3.common.Player
    public final long OoooOOo() {
        o00000();
        return this.f7141OooOo0;
    }

    @Override // androidx.media3.common.OooO0O0
    public final void Ooooo00(long j, boolean z, int i) {
        o00000();
        o00Oo0.OooO00o(i >= 0);
        this.f7137OooOOo.OooOo0O();
        Oooo0 oooo0 = this.f7179Oooooo0.f34105OooO00o;
        if (oooo0.OooOo00() || i < oooo0.OooOOoo()) {
            this.f7155Oooo00O++;
            if (OooO0o()) {
                Log.OooO0o("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                OooOO0O.OooO0o oooO0o = new OooOO0O.OooO0o(this.f7179Oooooo0);
                oooO0o.OooO00o(1);
                OooO oooO = (OooO) this.f7130OooOO0.f34006OooO0Oo;
                oooO.getClass();
                oooO.f7122OooO.OooO(new o000O00O.o0000(oooO, oooO0o));
                return;
            }
            o00O0OO o00o0ooOooO0oO = this.f7179Oooooo0;
            int i2 = o00o0ooOooO0oO.f34110OooO0o0;
            if (i2 == 3 || (i2 == 4 && !oooo0.OooOo00())) {
                o00o0ooOooO0oO = this.f7179Oooooo0.OooO0oO(2);
            }
            int iOooo0oO = Oooo0oO();
            o00O0OO o00o0ooO00o0O = o00o0O(o00o0ooOooO0oO, oooo0, o00ooo(oooo0, i, j));
            long jOooo0OO = o00.Oooo0OO(j);
            OooOO0O oooOO0O = this.f7131OooOO0O;
            oooOO0O.getClass();
            oooOO0O.f7243OooOO0O.OooO0o0(3, new OooOO0O.C0144OooOO0O(oooo0, i, jOooo0OO)).OooO00o();
            o000000O(o00o0ooO00o0O, 0, 1, true, 1, ooOO(o00o0ooO00o0O), iOooo0oO, z);
        }
    }

    public final MediaMetadata OooooOo() {
        Oooo0 oooo0OooOo0 = OooOo0();
        if (oooo0OooOo0.OooOo00()) {
            return this.f7177OooooOo;
        }
        androidx.media3.common.OooOOO0 oooOOO0 = oooo0OooOo0.OooOOo0(Oooo0oO(), this.f6355OooO00o).f6670OooO0o;
        MediaMetadata mediaMetadata = this.f7177OooooOo;
        mediaMetadata.getClass();
        MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o(mediaMetadata);
        MediaMetadata mediaMetadata2 = oooOOO0.f6487OooO0oO;
        if (mediaMetadata2 != null) {
            CharSequence charSequence = mediaMetadata2.f6270OooO0Oo;
            if (charSequence != null) {
                oooO00o.f6304OooO00o = charSequence;
            }
            CharSequence charSequence2 = mediaMetadata2.f6272OooO0o0;
            if (charSequence2 != null) {
                oooO00o.f6305OooO0O0 = charSequence2;
            }
            CharSequence charSequence3 = mediaMetadata2.f6271OooO0o;
            if (charSequence3 != null) {
                oooO00o.f6306OooO0OO = charSequence3;
            }
            CharSequence charSequence4 = mediaMetadata2.f6273OooO0oO;
            if (charSequence4 != null) {
                oooO00o.f6307OooO0Oo = charSequence4;
            }
            CharSequence charSequence5 = mediaMetadata2.f6274OooO0oo;
            if (charSequence5 != null) {
                oooO00o.f6309OooO0o0 = charSequence5;
            }
            CharSequence charSequence6 = mediaMetadata2.f6269OooO;
            if (charSequence6 != null) {
                oooO00o.f6308OooO0o = charSequence6;
            }
            CharSequence charSequence7 = mediaMetadata2.f6275OooOO0;
            if (charSequence7 != null) {
                oooO00o.f6310OooO0oO = charSequence7;
            }
            OooOo00 oooOo00 = mediaMetadata2.f6276OooOO0O;
            if (oooOo00 != null) {
                oooO00o.f6311OooO0oo = oooOo00;
            }
            OooOo00 oooOo01 = mediaMetadata2.f6277OooOO0o;
            if (oooOo01 != null) {
                oooO00o.f6303OooO = oooOo01;
            }
            byte[] bArr = mediaMetadata2.f6279OooOOO0;
            if (bArr != null) {
                oooO00o.OooO0o0(bArr, mediaMetadata2.f6278OooOOO);
            }
            Uri uri = mediaMetadata2.f6280OooOOOO;
            if (uri != null) {
                oooO00o.f6314OooOO0o = uri;
            }
            Integer num = mediaMetadata2.f6281OooOOOo;
            if (num != null) {
                oooO00o.f6316OooOOO0 = num;
            }
            Integer num2 = mediaMetadata2.f6283OooOOo0;
            if (num2 != null) {
                oooO00o.f6315OooOOO = num2;
            }
            Integer num3 = mediaMetadata2.f6282OooOOo;
            if (num3 != null) {
                oooO00o.f6317OooOOOO = num3;
            }
            Boolean bool = mediaMetadata2.f6284OooOOoo;
            if (bool != null) {
                oooO00o.f6318OooOOOo = bool;
            }
            Boolean bool2 = mediaMetadata2.f6287OooOo00;
            if (bool2 != null) {
                oooO00o.f6320OooOOo0 = bool2;
            }
            Integer num4 = mediaMetadata2.f6286OooOo0;
            if (num4 != null) {
                oooO00o.f6319OooOOo = num4;
            }
            Integer num5 = mediaMetadata2.f6288OooOo0O;
            if (num5 != null) {
                oooO00o.f6319OooOOo = num5;
            }
            Integer num6 = mediaMetadata2.f6289OooOo0o;
            if (num6 != null) {
                oooO00o.f6321OooOOoo = num6;
            }
            Integer num7 = mediaMetadata2.f6285OooOo;
            if (num7 != null) {
                oooO00o.f6324OooOo00 = num7;
            }
            Integer num8 = mediaMetadata2.f6291OooOoO0;
            if (num8 != null) {
                oooO00o.f6323OooOo0 = num8;
            }
            Integer num9 = mediaMetadata2.f6290OooOoO;
            if (num9 != null) {
                oooO00o.f6325OooOo0O = num9;
            }
            Integer num10 = mediaMetadata2.f6292OooOoOO;
            if (num10 != null) {
                oooO00o.f6326OooOo0o = num10;
            }
            CharSequence charSequence8 = mediaMetadata2.f6294OooOoo0;
            if (charSequence8 != null) {
                oooO00o.f6322OooOo = charSequence8;
            }
            CharSequence charSequence9 = mediaMetadata2.f6293OooOoo;
            if (charSequence9 != null) {
                oooO00o.f6328OooOoO0 = charSequence9;
            }
            CharSequence charSequence10 = mediaMetadata2.f6295OooOooO;
            if (charSequence10 != null) {
                oooO00o.f6327OooOoO = charSequence10;
            }
            Integer num11 = mediaMetadata2.f6296OooOooo;
            if (num11 != null) {
                oooO00o.f6329OooOoOO = num11;
            }
            Integer num12 = mediaMetadata2.f6298Oooo000;
            if (num12 != null) {
                oooO00o.f6331OooOoo0 = num12;
            }
            CharSequence charSequence11 = mediaMetadata2.f6299Oooo00O;
            if (charSequence11 != null) {
                oooO00o.f6330OooOoo = charSequence11;
            }
            CharSequence charSequence12 = mediaMetadata2.f6300Oooo00o;
            if (charSequence12 != null) {
                oooO00o.f6332OooOooO = charSequence12;
            }
            CharSequence charSequence13 = mediaMetadata2.f6297Oooo0;
            if (charSequence13 != null) {
                oooO00o.f6333OooOooo = charSequence13;
            }
            Integer num13 = mediaMetadata2.f6301Oooo0O0;
            if (num13 != null) {
                oooO00o.f6334Oooo000 = num13;
            }
            Bundle bundle = mediaMetadata2.f6302Oooo0OO;
            if (bundle != null) {
                oooO00o.f6335Oooo00O = bundle;
            }
        }
        return new MediaMetadata(oooO00o);
    }

    public final void Oooooo0() {
        o00000();
        o00oO0o();
        o0Oo0oo(null);
        oo000o(0, 0);
    }

    public final OooOOO OoooooO(OooOOO.OooO0O0 oooO0O0) {
        int iO00O0O = o00O0O(this.f7179Oooooo0);
        Oooo0 oooo0 = this.f7179Oooooo0.f34105OooO00o;
        if (iO00O0O == -1) {
            iO00O0O = 0;
        }
        o000O00 o000o01 = this.f7144OooOo0o;
        OooOO0O oooOO0O = this.f7131OooOO0O;
        return new OooOOO(oooOO0O, oooO0O0, oooo0, iO00O0O, o000o01, oooOO0O.f7246OooOOO0);
    }

    public final long Ooooooo() {
        o00000();
        if (!OooO0o()) {
            return OoooO();
        }
        o00O0OO o00o0oo2 = this.f7179Oooooo0;
        return o00o0oo2.f34114OooOO0O.equals(o00o0oo2.f34106OooO0O0) ? o00.o000oOoO(this.f7179Oooooo0.f34119OooOOOo) : o00Oo0();
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        o00000();
        return o00.o000oOoO(ooOO(this.f7179Oooooo0));
    }

    public final void o00000() {
        oo0o0Oo oo0o0oo = this.f7125OooO0Oo;
        synchronized (oo0o0oo) {
            boolean z = false;
            while (!oo0o0oo.f35000OooO00o) {
                try {
                    oo0o0oo.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f7139OooOOoo;
        if (threadCurrentThread != looper.getThread()) {
            String strOooOOO = o00.OooOOO("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), looper.getThread().getName());
            if (this.f7173Ooooo00) {
                throw new IllegalStateException(strOooOOO);
            }
            Log.OooO0oO("ExoPlayerImpl", strOooOOO, this.f7174Ooooo0o ? null : new IllegalStateException());
            this.f7174Ooooo0o = true;
        }
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
    public final void o000000(int i, int i2, boolean z) {
        int i3 = 0;
        ?? r15 = (!z || i == -1) ? 0 : 1;
        if (r15 != 0 && i != 1) {
            i3 = 1;
        }
        o00O0OO o00o0oo2 = this.f7179Oooooo0;
        if (o00o0oo2.f34115OooOO0o == r15 && o00o0oo2.f34117OooOOO0 == i3) {
            return;
        }
        this.f7155Oooo00O++;
        boolean z2 = o00o0oo2.f34118OooOOOO;
        o00O0OO o00o0ooOooO00o = o00o0oo2;
        if (z2) {
            o00o0ooOooO00o = o00o0oo2.OooO00o();
        }
        o00O0OO o00o0ooOooO0Oo = o00o0ooOooO00o.OooO0Oo(i3, r15);
        OooOO0O oooOO0O = this.f7131OooOO0O;
        oooOO0O.getClass();
        oooOO0O.f7243OooOO0O.OooO0oo(1, r15, i3).OooO00o();
        o000000O(o00o0ooOooO0Oo, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    public final void o000000O(final o00O0OO o00o0oo2, final int i, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
        Pair pair;
        int i5;
        final androidx.media3.common.OooOOO0 oooOOO0;
        int i6;
        int i7;
        Object obj;
        androidx.media3.common.OooOOO0 oooOOO1;
        Object obj2;
        int i8;
        long jO00Ooo;
        long jO00Ooo2;
        Object obj3;
        androidx.media3.common.OooOOO0 oooOOO2;
        Object obj4;
        int i9;
        o00O0OO o00o0oo3 = this.f7179Oooooo0;
        this.f7179Oooooo0 = o00o0oo2;
        boolean z3 = !o00o0oo3.f34105OooO00o.equals(o00o0oo2.f34105OooO00o);
        Oooo0 oooo0 = o00o0oo3.f34105OooO00o;
        Oooo0 oooo1 = o00o0oo2.f34105OooO00o;
        int i10 = 0;
        if (oooo1.OooOo00() && oooo0.OooOo00()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (oooo1.OooOo00() != oooo0.OooOo00()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            OooOOOO.OooO0O0 oooO0O0 = o00o0oo3.f34106OooO0O0;
            Object obj5 = oooO0O0.f33816OooO00o;
            Oooo0.OooO0O0 oooO0O1 = this.f7133OooOOO;
            int i11 = oooo0.OooOO0O(obj5, oooO0O1).f6642OooO0o;
            Oooo0.OooO0o oooO0o = this.f6355OooO00o;
            Object obj6 = oooo0.OooOOo0(i11, oooO0o).f6669OooO0Oo;
            OooOOOO.OooO0O0 oooO0O2 = o00o0oo2.f34106OooO0O0;
            if (!obj6.equals(oooo1.OooOOo0(oooo1.OooOO0O(oooO0O2.f33816OooO00o, oooO0O1).f6642OooO0o, oooO0o).f6669OooO0Oo)) {
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
            } else if (z && i3 == 0 && oooO0O0.f33819OooO0Oo < oooO0O2.f33819OooO0Oo) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = (z && i3 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        MediaMetadata mediaMetadataOooooOo = this.f7159Oooo0o;
        if (zBooleanValue) {
            if (o00o0oo2.f34105OooO00o.OooOo00()) {
                oooOOO0 = null;
            } else {
                oooOOO0 = o00o0oo2.f34105OooO00o.OooOOo0(o00o0oo2.f34105OooO00o.OooOO0O(o00o0oo2.f34106OooO0O0.f33816OooO00o, this.f7133OooOOO).f6642OooO0o, this.f6355OooO00o).f6670OooO0o;
            }
            this.f7177OooooOo = MediaMetadata.f6236Oooo0o0;
        } else {
            oooOOO0 = null;
        }
        if (zBooleanValue || !o00o0oo3.f34113OooOO0.equals(o00o0oo2.f34113OooOO0)) {
            MediaMetadata mediaMetadata = this.f7177OooooOo;
            mediaMetadata.getClass();
            MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o(mediaMetadata);
            List<Metadata> list = o00o0oo2.f34113OooOO0;
            int i12 = 0;
            while (i12 < list.size()) {
                Metadata metadata = list.get(i12);
                int i13 = i10;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f6336OooO0Oo;
                    if (i13 < entryArr.length) {
                        entryArr[i13].o0ooOoO(oooO00o);
                        i13++;
                    }
                }
                i12++;
                i10 = 0;
            }
            this.f7177OooooOo = new MediaMetadata(oooO00o);
            mediaMetadataOooooOo = OooooOo();
        }
        boolean z4 = !mediaMetadataOooooOo.equals(this.f7159Oooo0o);
        this.f7159Oooo0o = mediaMetadataOooooOo;
        boolean z5 = o00o0oo3.f34115OooOO0o != o00o0oo2.f34115OooOO0o;
        boolean z6 = o00o0oo3.f34110OooO0o0 != o00o0oo2.f34110OooO0o0;
        if (z6 || z5) {
            o000000o();
        }
        boolean z7 = o00o0oo3.f34111OooO0oO != o00o0oo2.f34111OooO0oO;
        if (z3) {
            this.f7132OooOO0o.OooO0OO(0, new o000OoO.o00000O0.OooO00o() { // from class: o000O00O.o00000OO
                @Override // o000OoO.o00000O0.OooO00o
                public final void invoke(Object obj7) {
                    ((Player.OooO0OO) obj7).onTimelineChanged(o00o0oo2.f34105OooO00o, i);
                }
            });
        }
        if (z) {
            Oooo0.OooO0O0 oooO0O3 = new Oooo0.OooO0O0();
            if (o00o0oo3.f34105OooO00o.OooOo00()) {
                i7 = i4;
                obj = null;
                oooOOO1 = null;
                obj2 = null;
                i8 = -1;
            } else {
                Object obj7 = o00o0oo3.f34106OooO0O0.f33816OooO00o;
                o00o0oo3.f34105OooO00o.OooOO0O(obj7, oooO0O3);
                int i14 = oooO0O3.f6642OooO0o;
                int iOooO0o0 = o00o0oo3.f34105OooO00o.OooO0o0(obj7);
                obj2 = obj7;
                obj = o00o0oo3.f34105OooO00o.OooOOo0(i14, this.f6355OooO00o).f6669OooO0Oo;
                oooOOO1 = this.f6355OooO00o.f6670OooO0o;
                i7 = i14;
                i8 = iOooO0o0;
            }
            if (i3 == 0) {
                if (o00o0oo3.f34106OooO0O0.OooO00o()) {
                    OooOOOO.OooO0O0 oooO0O4 = o00o0oo3.f34106OooO0O0;
                    jO00Ooo = oooO0O3.OooO0Oo(oooO0O4.f33817OooO0O0, oooO0O4.f33818OooO0OO);
                    jO00Ooo2 = o00Ooo(o00o0oo3);
                } else {
                    jO00Ooo = o00o0oo3.f34106OooO0O0.f33820OooO0o0 != -1 ? o00Ooo(this.f7179Oooooo0) : oooO0O3.f6645OooO0oo + oooO0O3.f6644OooO0oO;
                    jO00Ooo2 = jO00Ooo;
                }
            } else if (o00o0oo3.f34106OooO0O0.OooO00o()) {
                jO00Ooo = o00o0oo3.f34120OooOOo;
                jO00Ooo2 = o00Ooo(o00o0oo3);
            } else {
                jO00Ooo = oooO0O3.f6645OooO0oo + o00o0oo3.f34120OooOOo;
                jO00Ooo2 = jO00Ooo;
            }
            long jO000oOoO = o00.o000oOoO(jO00Ooo);
            long jO000oOoO2 = o00.o000oOoO(jO00Ooo2);
            OooOOOO.OooO0O0 oooO0O5 = o00o0oo3.f34106OooO0O0;
            final Player.OooO0o oooO0o2 = new Player.OooO0o(obj, i7, oooOOO1, obj2, i8, jO000oOoO, jO000oOoO2, oooO0O5.f33817OooO0O0, oooO0O5.f33818OooO0OO);
            int iOooo0oO = Oooo0oO();
            if (this.f7179Oooooo0.f34105OooO00o.OooOo00()) {
                obj3 = null;
                oooOOO2 = null;
                obj4 = null;
                i9 = -1;
            } else {
                o00O0OO o00o0oo4 = this.f7179Oooooo0;
                Object obj8 = o00o0oo4.f34106OooO0O0.f33816OooO00o;
                o00o0oo4.f34105OooO00o.OooOO0O(obj8, this.f7133OooOOO);
                int iOooO0o1 = this.f7179Oooooo0.f34105OooO00o.OooO0o0(obj8);
                Oooo0 oooo2 = this.f7179Oooooo0.f34105OooO00o;
                Oooo0.OooO0o oooO0o3 = this.f6355OooO00o;
                Object obj9 = oooo2.OooOOo0(iOooo0oO, oooO0o3).f6669OooO0Oo;
                i9 = iOooO0o1;
                oooOOO2 = oooO0o3.f6670OooO0o;
                obj4 = obj8;
                obj3 = obj9;
            }
            long jO000oOoO3 = o00.o000oOoO(j);
            long jO000oOoO4 = this.f7179Oooooo0.f34106OooO0O0.OooO00o() ? o00.o000oOoO(o00Ooo(this.f7179Oooooo0)) : jO000oOoO3;
            OooOOOO.OooO0O0 oooO0O6 = this.f7179Oooooo0.f34106OooO0O0;
            final Player.OooO0o oooO0o4 = new Player.OooO0o(obj3, iOooo0oO, oooOOO2, obj4, i9, jO000oOoO3, jO000oOoO4, oooO0O6.f33817OooO0O0, oooO0O6.f33818OooO0OO);
            this.f7132OooOO0o.OooO0OO(11, new o000OoO.o00000O0.OooO00o() { // from class: o000O00O.o0000O
                @Override // o000OoO.o00000O0.OooO00o
                public final void invoke(Object obj10) {
                    Player.OooO0OO oooO0OO = (Player.OooO0OO) obj10;
                    int i15 = i3;
                    oooO0OO.onPositionDiscontinuity(i15);
                    oooO0OO.onPositionDiscontinuity(oooO0o2, oooO0o4, i15);
                }
            });
        }
        if (zBooleanValue) {
            this.f7132OooOO0o.OooO0OO(1, new o000OoO.o00000O0.OooO00o() { // from class: o000O00O.o0000OO0
                @Override // o000OoO.o00000O0.OooO00o
                public final void invoke(Object obj10) {
                    ((Player.OooO0OO) obj10).onMediaItemTransition(oooOOO0, iIntValue);
                }
            });
        }
        if (o00o0oo3.f34109OooO0o != o00o0oo2.f34109OooO0o) {
            final int i15 = 0;
            this.f7132OooOO0o.OooO0OO(10, new o000OoO.o00000O0.OooO00o() { // from class: o000O00O.o000
                @Override // o000OoO.o00000O0.OooO00o
                public final void invoke(Object obj10) {
                    int i16 = i15;
                    Object obj11 = o00o0oo2;
                    switch (i16) {
                        case 0:
                            ((Player.OooO0OO) obj10).onPlayerErrorChanged(((o00O0OO) obj11).f34109OooO0o);
                            return;
                        default:
                            ((androidx.media3.session.o000OO0O.OooO0OO) obj11).getClass();
                            throw null;
                    }
                }
            });
            if (o00o0oo2.f34109OooO0o != null) {
                this.f7132OooOO0o.OooO0OO(10, new o000O000(o00o0oo2, i15));
            }
        }
        o00000O0 o00000o1 = o00o0oo3.f34104OooO;
        o00000O0 o00000o2 = o00o0oo2.f34104OooO;
        if (o00000o1 != o00000o2) {
            this.f7129OooO0oo.OooO0OO(o00000o2.f46758OooO0o0);
            i6 = 0;
            this.f7132OooOO0o.OooO0OO(2, new o000O0o(o00o0oo2, i6));
        } else {
            i6 = 0;
        }
        if (z4) {
            this.f7132OooOO0o.OooO0OO(14, new o0Oo0oo(this.f7159Oooo0o, i6));
        }
        if (z7) {
            this.f7132OooOO0o.OooO0OO(3, new o0OO00O(o00o0oo2, i6));
        }
        if (z6 || z5) {
            this.f7132OooOO0o.OooO0OO(-1, new o000O00O.oo0o0Oo(o00o0oo2));
        }
        if (z6) {
            this.f7132OooOO0o.OooO0OO(4, new o0O0O00(o00o0oo2));
        }
        if (z5) {
            this.f7132OooOO0o.OooO0OO(5, new o000OoO.o00000O0.OooO00o() { // from class: o000O00O.o0000O0
                @Override // o000OoO.o00000O0.OooO00o
                public final void invoke(Object obj10) {
                    ((Player.OooO0OO) obj10).onPlayWhenReadyChanged(o00o0oo2.f34115OooOO0o, i2);
                }
            });
        }
        if (o00o0oo3.f34117OooOOO0 != o00o0oo2.f34117OooOOO0) {
            this.f7132OooOO0o.OooO0OO(6, new o0000O0O(o00o0oo2));
        }
        if (o00o0oo3.OooOO0O() != o00o0oo2.OooOO0O()) {
            this.f7132OooOO0o.OooO0OO(7, new o00O0000(o00o0oo2, 1));
        }
        if (!o00o0oo3.f34116OooOOO.equals(o00o0oo2.f34116OooOOO)) {
            this.f7132OooOO0o.OooO0OO(12, new o000O00O.o000OO(o00o0oo2, 0));
        }
        o000OOo();
        this.f7132OooOO0o.OooO0O0();
        if (o00o0oo3.f34118OooOOOO != o00o0oo2.f34118OooOOOO) {
            Iterator<androidx.media3.exoplayer.OooO0o.OooO00o> it = this.f7134OooOOO0.iterator();
            while (it.hasNext()) {
                it.next().OooOo();
            }
        }
    }

    public final void o000000o() {
        int iOooo0o = Oooo0o();
        o00OOO00 o00ooo00 = this.f7148OooOoo;
        o00OO o00oo2 = this.f7149OooOoo0;
        if (iOooo0o != 1) {
            if (iOooo0o == 2 || iOooo0o == 3) {
                o00000();
                boolean z = this.f7179Oooooo0.f34118OooOOOO;
                OooOoOO();
                o00oo2.getClass();
                OooOoOO();
                o00ooo00.getClass();
                return;
            }
            if (iOooo0o != 4) {
                throw new IllegalStateException();
            }
        }
        o00oo2.getClass();
        o00ooo00.getClass();
    }

    public final void o000OOo() {
        Player.OooO00o oooO00o = this.f7160Oooo0o0;
        int i = o00.f34910OooO00o;
        Player player = this.f7126OooO0o;
        boolean zOooO0o = player.OooO0o();
        boolean zOooo0o0 = player.Oooo0o0();
        boolean zOooo00O = player.Oooo00O();
        boolean zOooOOO0 = player.OooOOO0();
        boolean zOoooOo0 = player.OoooOo0();
        boolean zOooOOo = player.OooOOo();
        boolean zOooOo00 = player.OooOo0().OooOo00();
        Player.OooO00o.C0140OooO00o c0140OooO00o = new Player.OooO00o.C0140OooO00o();
        androidx.media3.common.OooO oooO = this.f7124OooO0OO.f6703OooO0Oo;
        androidx.media3.common.OooO.OooO00o oooO00o2 = c0140OooO00o.f6705OooO00o;
        oooO00o2.getClass();
        int i2 = 0;
        for (int i3 = 0; i3 < oooO.OooO0OO(); i3++) {
            oooO00o2.OooO00o(oooO.OooO0O0(i3));
        }
        boolean z = !zOooO0o;
        c0140OooO00o.OooO00o(4, z);
        c0140OooO00o.OooO00o(5, zOooo0o0 && !zOooO0o);
        c0140OooO00o.OooO00o(6, zOooo00O && !zOooO0o);
        c0140OooO00o.OooO00o(7, !zOooOo00 && (zOooo00O || !zOoooOo0 || zOooo0o0) && !zOooO0o);
        c0140OooO00o.OooO00o(8, zOooOOO0 && !zOooO0o);
        c0140OooO00o.OooO00o(9, !zOooOo00 && (zOooOOO0 || (zOoooOo0 && zOooOOo)) && !zOooO0o);
        c0140OooO00o.OooO00o(10, z);
        c0140OooO00o.OooO00o(11, zOooo0o0 && !zOooO0o);
        c0140OooO00o.OooO00o(12, zOooo0o0 && !zOooO0o);
        Player.OooO00o oooO00o3 = new Player.OooO00o(oooO00o2.OooO0O0());
        this.f7160Oooo0o0 = oooO00o3;
        if (oooO00o3.equals(oooO00o)) {
            return;
        }
        this.f7132OooOO0o.OooO0OO(13, new o0000Ooo(this, i2));
    }

    public final int o00O0O(o00O0OO o00o0oo2) {
        if (o00o0oo2.f34105OooO00o.OooOo00()) {
            return this.f7178Oooooo;
        }
        return o00o0oo2.f34105OooO00o.OooOO0O(o00o0oo2.f34106OooO0O0.f33816OooO00o, this.f7133OooOOO).f6642OooO0o;
    }

    public final long o00Oo0() {
        o00000();
        if (!OooO0o()) {
            return OooOoo();
        }
        o00O0OO o00o0oo2 = this.f7179Oooooo0;
        OooOOOO.OooO0O0 oooO0O0 = o00o0oo2.f34106OooO0O0;
        Oooo0 oooo0 = o00o0oo2.f34105OooO00o;
        Object obj = oooO0O0.f33816OooO00o;
        Oooo0.OooO0O0 oooO0O1 = this.f7133OooOOO;
        oooo0.OooOO0O(obj, oooO0O1);
        return o00.o000oOoO(oooO0O1.OooO0Oo(oooO0O0.f33817OooO0O0, oooO0O0.f33818OooO0OO));
    }

    public final o00O0OO o00o0O(o00O0OO o00o0oo2, Oooo0 oooo0, @Nullable Pair<Object, Long> pair) {
        List<Metadata> list;
        o00Oo0.OooO00o(oooo0.OooOo00() || pair != null);
        Oooo0 oooo1 = o00o0oo2.f34105OooO00o;
        long jO0OoOo0 = o0OoOo0(o00o0oo2);
        o00O0OO o00o0ooOooO0oo = o00o0oo2.OooO0oo(oooo0);
        if (oooo0.OooOo00()) {
            OooOOOO.OooO0O0 oooO0O0 = o00O0OO.f34103OooOo00;
            long jOooo0OO = o00.Oooo0OO(this.f7180OoooooO);
            o00O0OO o00o0ooOooO0O0 = o00o0ooOooO0oo.OooO0OO(oooO0O0, jOooo0OO, jOooo0OO, jOooo0OO, 0L, o000O.oo0o0Oo.f33891OooO0oO, this.f7123OooO0O0, o0O00.f19060OooO0oo).OooO0O0(oooO0O0);
            o00o0ooOooO0O0.f34119OooOOOo = o00o0ooOooO0O0.f34120OooOOo;
            return o00o0ooOooO0O0;
        }
        Object obj = o00o0ooOooO0oo.f34106OooO0O0.f33816OooO00o;
        boolean z = !obj.equals(pair.first);
        OooOOOO.OooO0O0 oooO0O1 = z ? new OooOOOO.OooO0O0(pair.first) : o00o0ooOooO0oo.f34106OooO0O0;
        long jLongValue = ((Long) pair.second).longValue();
        long jOooo0OO2 = o00.Oooo0OO(jO0OoOo0);
        if (!oooo1.OooOo00()) {
            jOooo0OO2 -= oooo1.OooOO0O(obj, this.f7133OooOOO).f6645OooO0oo;
        }
        if (z || jLongValue < jOooo0OO2) {
            o00Oo0.OooO0Oo(!oooO0O1.OooO00o());
            o000O.oo0o0Oo oo0o0oo = z ? o000O.oo0o0Oo.f33891OooO0oO : o00o0ooOooO0oo.f34112OooO0oo;
            o00000O0 o00000o1 = z ? this.f7123OooO0O0 : o00o0ooOooO0oo.f34104OooO;
            if (z) {
                ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f18681OooO0o0;
                list = o0O00.f19060OooO0oo;
            } else {
                list = o00o0ooOooO0oo.f34113OooOO0;
            }
            o00O0OO o00o0ooOooO0O1 = o00o0ooOooO0oo.OooO0OO(oooO0O1, jLongValue, jLongValue, jLongValue, 0L, oo0o0oo, o00000o1, list).OooO0O0(oooO0O1);
            o00o0ooOooO0O1.f34119OooOOOo = jLongValue;
            return o00o0ooOooO0O1;
        }
        if (jLongValue != jOooo0OO2) {
            o00Oo0.OooO0Oo(!oooO0O1.OooO00o());
            long jMax = Math.max(0L, o00o0ooOooO0oo.f34121OooOOo0 - (jLongValue - jOooo0OO2));
            long j = o00o0ooOooO0oo.f34119OooOOOo;
            if (o00o0ooOooO0oo.f34114OooOO0O.equals(o00o0ooOooO0oo.f34106OooO0O0)) {
                j = jLongValue + jMax;
            }
            o00O0OO o00o0ooOooO0OO = o00o0ooOooO0oo.OooO0OO(oooO0O1, jLongValue, jLongValue, jLongValue, jMax, o00o0ooOooO0oo.f34112OooO0oo, o00o0ooOooO0oo.f34104OooO, o00o0ooOooO0oo.f34113OooOO0);
            o00o0ooOooO0OO.f34119OooOOOo = j;
            return o00o0ooOooO0OO;
        }
        int iOooO0o0 = oooo0.OooO0o0(o00o0ooOooO0oo.f34114OooOO0O.f33816OooO00o);
        if (iOooO0o0 != -1 && oooo0.OooOO0(iOooO0o0, this.f7133OooOOO, false).f6642OooO0o == oooo0.OooOO0O(oooO0O1.f33816OooO00o, this.f7133OooOOO).f6642OooO0o) {
            return o00o0ooOooO0oo;
        }
        oooo0.OooOO0O(oooO0O1.f33816OooO00o, this.f7133OooOOO);
        long jOooO0Oo = oooO0O1.OooO00o() ? this.f7133OooOOO.OooO0Oo(oooO0O1.f33817OooO0O0, oooO0O1.f33818OooO0OO) : this.f7133OooOOO.f6644OooO0oO;
        o00O0OO o00o0ooOooO0O2 = o00o0ooOooO0oo.OooO0OO(oooO0O1, o00o0ooOooO0oo.f34120OooOOo, o00o0ooOooO0oo.f34120OooOOo, o00o0ooOooO0oo.f34108OooO0Oo, jOooO0Oo - o00o0ooOooO0oo.f34120OooOOo, o00o0ooOooO0oo.f34112OooO0oo, o00o0ooOooO0oo.f34104OooO, o00o0ooOooO0oo.f34113OooOO0).OooO0O0(oooO0O1);
        o00o0ooOooO0O2.f34119OooOOOo = jOooO0Oo;
        return o00o0ooOooO0O2;
    }

    public final void o00oO0O(int i, int i2, @Nullable Object obj) {
        for (Renderer renderer : this.f7128OooO0oO) {
            if (renderer.OooOOOO() == i) {
                OooOOO oooOOOOoooooO = OoooooO(renderer);
                o00Oo0.OooO0Oo(!oooOOOOoooooO.f7305OooO0oO);
                oooOOOOoooooO.f7302OooO0Oo = i2;
                o00Oo0.OooO0Oo(!oooOOOOoooooO.f7305OooO0oO);
                oooOOOOoooooO.f7304OooO0o0 = obj;
                oooOOOOoooooO.OooO0OO();
            }
        }
    }

    public final void o00oO0o() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.f7164OoooO0;
        OooO0O0 oooO0O0 = this.f7140OooOo;
        if (sphericalGLSurfaceView != null) {
            OooOOO oooOOOOoooooO = OoooooO(this.f7146OooOoO0);
            o00Oo0.OooO0Oo(!oooOOOOoooooO.f7305OooO0oO);
            oooOOOOoooooO.f7302OooO0Oo = ResponseInfo.UnknownError;
            o00Oo0.OooO0Oo(!oooOOOOoooooO.f7305OooO0oO);
            oooOOOOoooooO.f7304OooO0o0 = null;
            oooOOOOoooooO.OooO0OO();
            this.f7164OoooO0.f8334OooO0Oo.remove(oooO0O0);
            this.f7164OoooO0 = null;
        }
        TextureView textureView = this.f7163OoooO;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != oooO0O0) {
                Log.OooO0o("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f7163OoooO.setSurfaceTextureListener(null);
            }
            this.f7163OoooO = null;
        }
        SurfaceHolder surfaceHolder = this.f7165OoooO00;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(oooO0O0);
            this.f7165OoooO00 = null;
        }
    }

    @Nullable
    public final Pair<Object, Long> o00ooo(Oooo0 oooo0, int i, long j) {
        if (oooo0.OooOo00()) {
            this.f7178Oooooo = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f7180OoooooO = j;
            return null;
        }
        if (i == -1 || i >= oooo0.OooOOoo()) {
            i = oooo0.OooO0Oo(this.f7154Oooo000);
            j = o00.o000oOoO(oooo0.OooOOo0(i, this.f6355OooO00o).f6680OooOOOo);
        }
        return oooo0.OooOOO0(this.f6355OooO00o, this.f7133OooOOO, i, o00.Oooo0OO(j));
    }

    public final void o0O0O00(@Nullable ExoPlaybackException exoPlaybackException) {
        o00O0OO o00o0oo2 = this.f7179Oooooo0;
        o00O0OO o00o0ooOooO0O0 = o00o0oo2.OooO0O0(o00o0oo2.f34106OooO0O0);
        o00o0ooOooO0O0.f34119OooOOOo = o00o0ooOooO0O0.f34120OooOOo;
        o00o0ooOooO0O0.f34121OooOOo0 = 0L;
        o00O0OO o00o0ooOooO0oO = o00o0ooOooO0O0.OooO0oO(1);
        if (exoPlaybackException != null) {
            o00o0ooOooO0oO = o00o0ooOooO0oO.OooO0o0(exoPlaybackException);
        }
        this.f7155Oooo00O++;
        this.f7131OooOO0O.f7243OooOO0O.OooO0O0(6).OooO00o();
        o000000O(o00o0ooOooO0oO, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void o0OO00O(float f) {
        o00000();
        final float fOooO0oo = o00.OooO0oo(f, 0.0f, 1.0f);
        if (this.f7170OoooOo0 == fOooO0oo) {
            return;
        }
        this.f7170OoooOo0 = fOooO0oo;
        o00oO0O(1, 2, Float.valueOf(this.f7147OooOoOO.f7096OooO0oO * fOooO0oo));
        this.f7132OooOO0o.OooO0o(22, new o000OoO.o00000O0.OooO00o() { // from class: o000O00O.o00000O
            @Override // o000OoO.o00000O0.OooO00o
            public final void invoke(Object obj) {
                ((Player.OooO0OO) obj).onVolumeChanged(fOooO0oo);
            }
        });
    }

    public final void o0OOO0o(boolean z) {
        o00000();
        int iOooO0o0 = this.f7147OooOoOO.OooO0o0(Oooo0o(), z);
        int i = 1;
        if (z && iOooO0o0 != 1) {
            i = 2;
        }
        o000000(iOooO0o0, i, z);
    }

    public final void o0Oo0oo(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Renderer renderer : this.f7128OooO0oO) {
            if (renderer.OooOOOO() == 2) {
                OooOOO oooOOOOoooooO = OoooooO(renderer);
                o00Oo0.OooO0Oo(!oooOOOOoooooO.f7305OooO0oO);
                oooOOOOoooooO.f7302OooO0Oo = 1;
                o00Oo0.OooO0Oo(true ^ oooOOOOoooooO.f7305OooO0oO);
                oooOOOOoooooO.f7304OooO0o0 = obj;
                oooOOOOoooooO.OooO0OO();
                arrayList.add(oooOOOOoooooO);
            }
        }
        Object obj2 = this.f7162Oooo0oo;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OooOOO) it.next()).OooO00o(this.f7150OooOooO);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f7162Oooo0oo;
            Surface surface = this.f7152Oooo;
            if (obj3 == surface) {
                surface.release();
                this.f7152Oooo = null;
            }
        }
        this.f7162Oooo0oo = obj;
        if (z) {
            o0O0O00(new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
        }
    }

    public final long o0OoOo0(o00O0OO o00o0oo2) {
        if (!o00o0oo2.f34106OooO0O0.OooO00o()) {
            return o00.o000oOoO(ooOO(o00o0oo2));
        }
        Object obj = o00o0oo2.f34106OooO0O0.f33816OooO00o;
        Oooo0 oooo0 = o00o0oo2.f34105OooO00o;
        Oooo0.OooO0O0 oooO0O0 = this.f7133OooOOO;
        oooo0.OooOO0O(obj, oooO0O0);
        long j = o00o0oo2.f34107OooO0OO;
        return j == -9223372036854775807L ? o00.o000oOoO(oooo0.OooOOo0(o00O0O(o00o0oo2), this.f6355OooO00o).f6680OooOOOo) : o00.o000oOoO(oooO0O0.f6645OooO0oo) + o00.o000oOoO(j);
    }

    public final void o0ooOO0(OooOOOO oooOOOO) {
        o00000();
        List listSingletonList = Collections.singletonList(oooOOOO);
        o00000();
        o0ooOOo(listSingletonList);
    }

    public final void o0ooOOo(List list) {
        o00000();
        o00O0O(this.f7179Oooooo0);
        getCurrentPosition();
        this.f7155Oooo00O++;
        ArrayList arrayList = this.f7135OooOOOO;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = size - 1; i >= 0; i--) {
                arrayList.remove(i);
            }
            this.f7158Oooo0OO = this.f7158Oooo0OO.OooO00o(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            OooOOO0.OooO0OO oooO0OO = new OooOOO0.OooO0OO((OooOOOO) list.get(i2), this.f7136OooOOOo);
            arrayList2.add(oooO0OO);
            arrayList.add(i2 + 0, new OooO0o(oooO0OO.f7324OooO00o.f7932OooOOOO, oooO0OO.f7325OooO0O0));
        }
        this.f7158Oooo0OO = this.f7158Oooo0OO.OooO0oO(arrayList2.size());
        oo0oOO0 oo0ooo0 = new oo0oOO0(arrayList, this.f7158Oooo0OO);
        boolean zOooOo00 = oo0ooo0.OooOo00();
        int i3 = oo0ooo0.f34158OooOOO0;
        if (!zOooOo00 && -1 >= i3) {
            throw new IllegalSeekPositionException();
        }
        int iOooO0Oo = oo0ooo0.OooO0Oo(this.f7154Oooo000);
        o00O0OO o00o0ooO00o0O = o00o0O(this.f7179Oooooo0, oo0ooo0, o00ooo(oo0ooo0, iOooO0Oo, -9223372036854775807L));
        int i4 = o00o0ooO00o0O.f34110OooO0o0;
        if (iOooO0Oo != -1 && i4 != 1) {
            i4 = (oo0ooo0.OooOo00() || iOooO0Oo >= i3) ? 4 : 2;
        }
        o00O0OO o00o0ooOooO0oO = o00o0ooO00o0O.OooO0oO(i4);
        long jOooo0OO = o00.Oooo0OO(-9223372036854775807L);
        o00Ooo o00ooo2 = this.f7158Oooo0OO;
        OooOO0O oooOO0O = this.f7131OooOO0O;
        oooOO0O.getClass();
        oooOO0O.f7243OooOO0O.OooO0o0(17, new OooOO0O.OooO00o(arrayList2, o00ooo2, iOooO0Oo, jOooo0OO)).OooO00o();
        o000000O(o00o0ooOooO0oO, 0, 1, (this.f7179Oooooo0.f34106OooO0O0.f33816OooO00o.equals(o00o0ooOooO0oO.f34106OooO0O0.f33816OooO00o) || this.f7179Oooooo0.f34105OooO00o.OooOo00()) ? false : true, 4, ooOO(o00o0ooOooO0oO), -1, false);
    }

    public final void o0ooOoO(SurfaceHolder surfaceHolder) {
        this.f7166OoooO0O = false;
        this.f7165OoooO00 = surfaceHolder;
        surfaceHolder.addCallback(this.f7140OooOo);
        Surface surface = this.f7165OoooO00.getSurface();
        if (surface == null || !surface.isValid()) {
            oo000o(0, 0);
        } else {
            Rect surfaceFrame = this.f7165OoooO00.getSurfaceFrame();
            oo000o(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void oo000o(final int i, final int i2) {
        o000Oo0 o000oo1 = this.f7181o000oOoO;
        if (i == o000oo1.f34985OooO00o && i2 == o000oo1.f34986OooO0O0) {
            return;
        }
        this.f7181o000oOoO = new o000Oo0(i, i2);
        this.f7132OooOO0o.OooO0o(24, new o000OoO.o00000O0.OooO00o() { // from class: o000O00O.o00000O0
            @Override // o000OoO.o00000O0.OooO00o
            public final void invoke(Object obj) {
                ((Player.OooO0OO) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        o00oO0O(2, 14, new o000Oo0(i, i2));
    }

    public final void oo0o0Oo() {
        o00000();
        this.f7147OooOoOO.OooO0o0(1, OooOoOO());
        o0O0O00(null);
        this.f7172OoooOoo = new o000O000.OooO0O0(this.f7179Oooooo0.f34120OooOOo, o0O00.f19060OooO0oo);
    }

    public final long ooOO(o00O0OO o00o0oo2) {
        if (o00o0oo2.f34105OooO00o.OooOo00()) {
            return o00.Oooo0OO(this.f7180OoooooO);
        }
        long jOooOO0 = o00o0oo2.f34118OooOOOO ? o00o0oo2.OooOO0() : o00o0oo2.f34120OooOOo;
        if (o00o0oo2.f34106OooO0O0.OooO00o()) {
            return jOooOO0;
        }
        Oooo0 oooo0 = o00o0oo2.f34105OooO00o;
        Object obj = o00o0oo2.f34106OooO0O0.f33816OooO00o;
        Oooo0.OooO0O0 oooO0O0 = this.f7133OooOOO;
        oooo0.OooOO0O(obj, oooO0O0);
        return jOooOO0 + oooO0O0.f6645OooO0oo;
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.1.1] [");
        sb.append(o00.f34915OooO0o0);
        sb.append("] [");
        HashSet<String> hashSet = o0000.f33812OooO00o;
        synchronized (o0000.class) {
            str = o0000.f33813OooO0O0;
        }
        sb.append(str);
        sb.append("]");
        Log.OooO0o0("ExoPlayerImpl", sb.toString());
        o00000();
        if (o00.f34910OooO00o < 21 && (audioTrack = this.f7161Oooo0oO) != null) {
            audioTrack.release();
            this.f7161Oooo0oO = null;
        }
        this.f7145OooOoO.OooO00o();
        this.f7149OooOoo0.getClass();
        this.f7148OooOoo.getClass();
        AudioFocusManager audioFocusManager = this.f7147OooOoOO;
        audioFocusManager.f7092OooO0OO = null;
        audioFocusManager.OooO00o();
        if (!this.f7131OooOO0O.OooOoO0()) {
            this.f7132OooOO0o.OooO0o(10, new o000O00O.o00000());
        }
        this.f7132OooOO0o.OooO0Oo();
        this.f7122OooO.OooO0OO();
        this.f7142OooOo00.OooO0Oo(this.f7137OooOOo);
        o00O0OO o00o0oo2 = this.f7179Oooooo0;
        if (o00o0oo2.f34118OooOOOO) {
            this.f7179Oooooo0 = o00o0oo2.OooO00o();
        }
        o00O0OO o00o0ooOooO0oO = this.f7179Oooooo0.OooO0oO(1);
        this.f7179Oooooo0 = o00o0ooOooO0oO;
        o00O0OO o00o0ooOooO0O0 = o00o0ooOooO0oO.OooO0O0(o00o0ooOooO0oO.f34106OooO0O0);
        this.f7179Oooooo0 = o00o0ooOooO0O0;
        o00o0ooOooO0O0.f34119OooOOOo = o00o0ooOooO0O0.f34120OooOOo;
        this.f7179Oooooo0.f34121OooOOo0 = 0L;
        this.f7137OooOOo.release();
        this.f7129OooO0oo.OooO0Oo();
        o00oO0o();
        Surface surface = this.f7152Oooo;
        if (surface != null) {
            surface.release();
            this.f7152Oooo = null;
        }
        this.f7172OoooOoo = o000O000.OooO0O0.f33949OooO0o;
        this.f7175OooooO0 = true;
    }
}
