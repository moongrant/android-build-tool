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
import androidx.media3.common.o00Oo0;
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
import o000O0.o0;
import o000O00O.OooOo;
import o000O00O.o0000;
import o000O00O.o000000O;
import o000O00O.o0000O;
import o000O00O.o0000O00;
import o000O00O.o000O;
import o000O00O.o000O0;
import o000O00O.o000O00O;
import o000O00O.o000O0Oo;
import o000O00O.o000OO00;
import o000O00O.o000OO0O;
import o000O00O.o000Oo0;
import o000O00O.o00O;
import o000O00O.o00O000;
import o000O00O.o00O00OO;
import o000O00O.o00O0OOO;
import o000O00O.o00OO00O;
import o000O00O.o00OO0OO;
import o000O00O.o00OOO0;
import o000O00O.o00OOO00;
import o000O00O.o0O0O00;
import o000O00O.oo0o0Oo;
import o000OOO.o000oOoO;
import p037OoooOo0.o00O0000;
import p038OoooOoO.o000OO;
import p069o0000ooO.o0000O0;
import p074o000OO0o.oo000o;
import p080o000OoO.o000O000;
import p080o000OoO.o000O0o;
import p080o000OoO.o000OOo;
import p080o000OoO.o00O0O;
import p080o000OoO.o00oO0o;
import p080o000OoO.o0OO00O;
import p427o0OoO0o.o00000;
import p427o0OoO0o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends androidx.media3.common.OooO0O0 implements androidx.media3.exoplayer.OooO0o {

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final /* synthetic */ int f7126Ooooooo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000OOo f7127OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O0 f7128OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Player.OooO00o f7129OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OO00O f7130OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Player f7131OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f7132OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Renderer[] f7133OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000 f7134OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000000O f7135OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O f7136OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final p080o000OoO.o00000<Player.OooO0OO> f7137OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Oooo0.OooO0O0 f7138OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final CopyOnWriteArraySet<androidx.media3.exoplayer.OooO0o.OooO00o> f7139OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ArrayList f7140OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f7141OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o000O0.OooO00o f7142OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final OooOOOO.OooO00o f7143OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Looper f7144OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f7145OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final long f7146OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final oo000o f7147OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final long f7148OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o000O0o f7149OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final androidx.media3.exoplayer.OooO00o f7150OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f7151OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AudioFocusManager f7152OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final o00OOO0 f7153OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final o00OOO00 f7154OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final long f7155OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f7156OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Surface f7157Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f7158Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f7159Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f7160Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f7161Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f7162Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public o00Ooo f7163Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public MediaMetadata f7164Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public Player.OooO00o f7165Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public AudioTrack f7166Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Object f7167Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public TextureView f7168OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public SphericalGLSurfaceView f7169OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public SurfaceHolder f7170OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f7171OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f7172OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final int f7173OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public androidx.media3.common.OooO00o f7174OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f7175OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f7176OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public o000O000.OooO0O0 f7177OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final boolean f7178Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f7179Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f7180OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public androidx.media3.common.o00Ooo f7181OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public MediaMetadata f7182OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f7183Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public o00O0OOO f7184Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public long f7185OoooooO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public o000O000 f7186o000oOoO;

    @RequiresApi(31)
    public static final class OooO00o {
        @DoNotInline
        public static o0 OooO00o(Context context, OooO oooO, boolean z) {
            MediaMetricsManager mediaMetricsManagerOooO00o = o000O0.o000O000.OooO00o(context.getSystemService("media_metrics"));
            androidx.media3.exoplayer.analytics.OooO0OO oooO0OO = mediaMetricsManagerOooO00o == null ? null : new androidx.media3.exoplayer.analytics.OooO0OO(context, mediaMetricsManagerOooO00o.createPlaybackSession());
            if (oooO0OO == null) {
                Log.OooO0o("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new o0(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                oooO.getClass();
                oooO.f7142OooOOo.OooOoo(oooO0OO);
            }
            return new o0(oooO0OO.f7380OooO0OO.getSessionId());
        }
    }

    public final class OooO0O0 implements o000oOoO, androidx.media3.exoplayer.audio.OooO0O0, o000OO00.OooO0OO, p071o000O0o0.o00Ooo, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.OooO0O0, AudioFocusManager.OooO0O0, androidx.media3.exoplayer.OooO00o.OooO0O0, androidx.media3.exoplayer.OooO0o.OooO00o {
        public OooO0O0() {
        }

        @Override // o000OOO.o000oOoO
        public final void OooO(Exception exc) {
            OooO.this.f7142OooOOo.OooO(exc);
        }

        @Override // o000OOO.o000oOoO
        public final void OooO00o(OooOo oooOo) {
            OooO.this.f7142OooOOo.OooO00o(oooOo);
        }

        @Override // o000OOO.o000oOoO
        public final void OooO0O0(String str) {
            OooO.this.f7142OooOOo.OooO0O0(str);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0OO(String str) {
            OooO.this.f7142OooOOo.OooO0OO(str);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0Oo(OooOo oooOo) {
            OooO.this.f7142OooOOo.OooO0Oo(oooOo);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0o(long j) {
            OooO.this.f7142OooOOo.OooO0o(j);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0o0(Exception exc) {
            OooO.this.f7142OooOOo.OooO0o0(exc);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0oO(androidx.media3.common.OooOO0 oooOO1, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            OooO oooO = OooO.this;
            oooO.getClass();
            oooO.f7142OooOOo.OooO0oO(oooOO1, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooO0oo(OooOo oooOo) {
            OooO oooO = OooO.this;
            oooO.getClass();
            oooO.f7142OooOOo.OooO0oo(oooOo);
        }

        @Override // o000OOO.o000oOoO
        public final void OooOO0(long j, Object obj) {
            OooO oooO = OooO.this;
            oooO.f7142OooOOo.OooOO0(j, obj);
            if (oooO.f7167Oooo0oo == obj) {
                oooO.f7137OooOO0o.OooO0o(26, new o000O());
            }
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final /* synthetic */ void OooOO0O() {
        }

        @Override // o000OOO.o000oOoO
        public final void OooOO0o(OooOo oooOo) {
            OooO oooO = OooO.this;
            oooO.getClass();
            oooO.f7142OooOOo.OooOO0o(oooOo);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooOOO(long j, long j2, String str) {
            OooO.this.f7142OooOOo.OooOOO(j, j2, str);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.OooO0O0
        public final void OooOOO0(Surface surface) {
            OooO.this.o0Oo0oo(surface);
        }

        @Override // o000OOO.o000oOoO
        public final void OooOOOO(int i, long j) {
            OooO.this.f7142OooOOo.OooOOOO(i, j);
        }

        @Override // o000OOO.o000oOoO
        public final void OooOOOo(int i, long j) {
            OooO.this.f7142OooOOo.OooOOOo(i, j);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooOOo(Exception exc) {
            OooO.this.f7142OooOOo.OooOOo(exc);
        }

        @Override // o000OOO.o000oOoO
        public final void OooOOo0(androidx.media3.common.OooOO0 oooOO1, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            OooO oooO = OooO.this;
            oooO.getClass();
            oooO.f7142OooOOo.OooOOo0(oooOO1, decoderReuseEvaluation);
        }

        @Override // o000OOO.o000oOoO
        public final /* synthetic */ void OooOOoo() {
        }

        @Override // androidx.media3.exoplayer.OooO0o.OooO00o
        public final void OooOo() {
            OooO.this.o000000o();
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void OooOo0(int i, long j, long j2) {
            OooO.this.f7142OooOOo.OooOo0(i, j, j2);
        }

        @Override // o000OOO.o000oOoO
        public final void OooOo00(long j, long j2, String str) {
            OooO.this.f7142OooOOo.OooOo00(j, j2, str);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.OooO0O0
        public final void OooOo0O() {
            OooO.this.o0Oo0oo(null);
        }

        @Override // o000OO00.OooO0OO
        public final void OooOo0o(ImmutableList immutableList) {
            OooO.this.f7137OooOO0o.OooO0o(27, new o000O00O(immutableList));
        }

        @Override // o000OO00.OooO0OO
        public final void onCues(o000O000.OooO0O0 oooO0O0) {
            OooO oooO = OooO.this;
            oooO.f7177OoooOoo = oooO0O0;
            oooO.f7137OooOO0o.OooO0o(27, new o000OO0O(oooO0O0));
        }

        @Override // p071o000O0o0.o00Ooo
        public final void onMetadata(Metadata metadata) {
            OooO oooO = OooO.this;
            MediaMetadata mediaMetadata = oooO.f7182OooooOo;
            mediaMetadata.getClass();
            MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o(mediaMetadata);
            int i = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f6341OooO0Oo;
                if (i >= entryArr.length) {
                    break;
                }
                entryArr[i].o0ooOOo(oooO00o);
                i++;
            }
            oooO.f7182OooooOo = new MediaMetadata(oooO00o);
            MediaMetadata mediaMetadataOooooOo = oooO.OooooOo();
            boolean zEquals = mediaMetadataOooooOo.equals(oooO.f7164Oooo0o);
            p080o000OoO.o00000<Player.OooO0OO> o00000Var = oooO.f7137OooOO0o;
            if (!zEquals) {
                oooO.f7164Oooo0o = mediaMetadataOooooOo;
                o00000Var.OooO0OO(14, new o000O0(this));
            }
            o00000Var.OooO0OO(28, new o000O0Oo(metadata));
            o00000Var.OooO0O0();
        }

        @Override // androidx.media3.exoplayer.audio.OooO0O0
        public final void onSkipSilenceEnabledChanged(final boolean z) {
            OooO oooO = OooO.this;
            if (oooO.f7176OoooOoO == z) {
                return;
            }
            oooO.f7176OoooOoO = z;
            oooO.f7137OooOO0o.OooO0o(23, new o000OoO.o00000.OooO00o() { // from class: o000O00O.o000OOo0
                @Override // o000OoO.o00000.OooO00o
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
            oooO.f7157Oooo = surface;
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

        @Override // o000OOO.o000oOoO
        public final void onVideoSizeChanged(androidx.media3.common.o00Ooo o00ooo2) {
            OooO oooO = OooO.this;
            oooO.f7181OooooOO = o00ooo2;
            oooO.f7137OooOO0o.OooO0o(25, new o000OO00(o00ooo2));
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            OooO.this.oo000o(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            OooO oooO = OooO.this;
            if (oooO.f7171OoooO0O) {
                oooO.o0Oo0oo(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            OooO oooO = OooO.this;
            if (oooO.f7171OoooO0O) {
                oooO.o0Oo0oo(null);
            }
            oooO.oo000o(0, 0);
        }
    }

    public static final class OooO0OO implements o000OOO.OooOO0, o000OOo0.OooO00o, OooOOO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public o000OOO.OooOO0 f7188OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public o000OOO.OooOO0 f7189OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public o000OOo0.OooO00o f7190OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public o000OOo0.OooO00o f7191OooO0oO;

        @Override // o000OOo0.OooO00o
        public final void OooO00o(float[] fArr, long j) {
            o000OOo0.OooO00o oooO00o = this.f7191OooO0oO;
            if (oooO00o != null) {
                oooO00o.OooO00o(fArr, j);
            }
            o000OOo0.OooO00o oooO00o2 = this.f7190OooO0o0;
            if (oooO00o2 != null) {
                oooO00o2.OooO00o(fArr, j);
            }
        }

        @Override // o000OOo0.OooO00o
        public final void OooO0O0() {
            o000OOo0.OooO00o oooO00o = this.f7191OooO0oO;
            if (oooO00o != null) {
                oooO00o.OooO0O0();
            }
            o000OOo0.OooO00o oooO00o2 = this.f7190OooO0o0;
            if (oooO00o2 != null) {
                oooO00o2.OooO0O0();
            }
        }

        @Override // o000OOO.OooOO0
        public final void OooO0OO(long j, long j2, androidx.media3.common.OooOO0 oooOO1, @Nullable MediaFormat mediaFormat) {
            o000OOO.OooOO0 oooOO2 = this.f7189OooO0o;
            if (oooOO2 != null) {
                oooOO2.OooO0OO(j, j2, oooOO1, mediaFormat);
            }
            o000OOO.OooOO0 oooOO3 = this.f7188OooO0Oo;
            if (oooOO3 != null) {
                oooOO3.OooO0OO(j, j2, oooOO1, mediaFormat);
            }
        }

        @Override // androidx.media3.exoplayer.OooOOO.OooO0O0
        public final void OooOO0o(int i, @Nullable Object obj) {
            if (i == 7) {
                this.f7188OooO0Oo = (o000OOO.OooOO0) obj;
                return;
            }
            if (i == 8) {
                this.f7190OooO0o0 = (o000OOo0.OooO00o) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f7189OooO0o = null;
                this.f7191OooO0oO = null;
            } else {
                this.f7189OooO0o = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f7191OooO0oO = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public static final class OooO0o implements o00O00OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f7192OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Oooo0 f7193OooO0O0;

        public OooO0o(androidx.media3.exoplayer.source.OooOOO0.OooO00o oooO00o, Object obj) {
            this.f7192OooO00o = obj;
            this.f7193OooO0O0 = oooO00o;
        }

        @Override // o000O00O.o00O00OO
        public final Object OooO00o() {
            return this.f7192OooO00o;
        }

        @Override // o000O00O.o00O00OO
        public final Oooo0 OooO0O0() {
            return this.f7193OooO0O0;
        }
    }

    static {
        o0000O0.OooO00o("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public OooO(androidx.media3.exoplayer.OooO0o.OooO0O0 oooO0O0) throws Throwable {
        OooO oooO = this;
        oooO.f7130OooO0Oo = new o0OO00O();
        try {
            Log.OooO0o0("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.1.1] [" + p080o000OoO.o000OO00.f34970OooO0o0 + "]");
            Context context = oooO0O0.f7221OooO00o;
            Context applicationContext = context.getApplicationContext();
            oooO.f7132OooO0o0 = applicationContext;
            com.google.common.base.OooOOO<o00oO0o, o000O0.OooO00o> oooOOO = oooO0O0.f7228OooO0oo;
            o000O0o o000o0o2 = oooO0O0.f7222OooO0O0;
            o000O0.OooO00o oooO00oApply = oooOOO.apply(o000o0o2);
            oooO.f7142OooOOo = oooO00oApply;
            oooO.f7174OoooOOo = oooO0O0.f7229OooOO0;
            oooO.f7172OoooOO0 = oooO0O0.f7230OooOO0O;
            oooO.f7176OoooOoO = false;
            oooO.f7155OooOooO = oooO0O0.f7236OooOOo;
            OooO0O0 oooO0O1 = oooO.new OooO0O0();
            oooO.f7145OooOo = oooO0O1;
            oooO.f7151OooOoO0 = new OooO0OO();
            Handler handler = new Handler(oooO0O0.f7220OooO);
            Renderer[] rendererArrOooO00o = oooO0O0.f7223OooO0OO.get().OooO00o(handler, oooO0O1, oooO0O1, oooO0O1, oooO0O1);
            oooO.f7133OooO0oO = rendererArrOooO00o;
            o00O0O.OooO0Oo(rendererArrOooO00o.length > 0);
            o00000 o00000Var = oooO0O0.f7226OooO0o0.get();
            oooO.f7134OooO0oo = o00000Var;
            oooO.f7143OooOOo0 = oooO0O0.f7224OooO0Oo.get();
            oo000o oo000oVar = oooO0O0.f7227OooO0oO.get();
            oooO.f7147OooOo00 = oo000oVar;
            oooO.f7141OooOOOo = oooO0O0.f7231OooOO0o;
            o00OO0OO o00oo0oo = oooO0O0.f7233OooOOO0;
            oooO.f7146OooOo0 = oooO0O0.f7232OooOOO;
            oooO.f7148OooOo0O = oooO0O0.f7234OooOOOO;
            Looper looper = oooO0O0.f7220OooO;
            oooO.f7144OooOOoo = looper;
            oooO.f7149OooOo0o = o000o0o2;
            oooO.f7131OooO0o = oooO;
            oooO.f7137OooOO0o = new p080o000OoO.o00000<>(looper, o000o0o2, new o000OO(oooO));
            CopyOnWriteArraySet<androidx.media3.exoplayer.OooO0o.OooO00o> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            oooO.f7139OooOOO0 = copyOnWriteArraySet;
            oooO.f7140OooOOOO = new ArrayList();
            oooO.f7163Oooo0OO = new o00Ooo.OooO00o();
            o00000O0 o00000o1 = new o00000O0(new o00OO00O[rendererArrOooO00o.length], new androidx.media3.exoplayer.trackselection.OooO0o[rendererArrOooO00o.length], o00Oo0.f6855OooO0o0, null);
            oooO.f7128OooO0O0 = o00000o1;
            oooO.f7138OooOOO = new Oooo0.OooO0O0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = length;
                int i3 = iArr[i];
                o00O0O.OooO0Oo(!false);
                sparseBooleanArray.append(i3, true);
                i++;
                length = i2;
                iArr = iArr;
            }
            o00000Var.getClass();
            if (o00000Var instanceof androidx.media3.exoplayer.trackselection.OooO0O0) {
                o00O0O.OooO0Oo(!false);
                sparseBooleanArray.append(29, true);
            }
            o00O0O.OooO0Oo(!false);
            androidx.media3.common.OooO oooO2 = new androidx.media3.common.OooO(sparseBooleanArray);
            oooO.f7129OooO0OO = new Player.OooO00o(oooO2);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            int i4 = 0;
            while (i4 < oooO2.OooO0OO()) {
                int iOooO0O0 = oooO2.OooO0O0(i4);
                o00O0O.OooO0Oo(!false);
                sparseBooleanArray2.append(iOooO0O0, true);
                i4++;
                oooO2 = oooO2;
            }
            o00O0O.OooO0Oo(!false);
            sparseBooleanArray2.append(4, true);
            o00O0O.OooO0Oo(!false);
            sparseBooleanArray2.append(10, true);
            o00O0O.OooO0Oo(!false);
            oooO.f7165Oooo0o0 = new Player.OooO00o(new androidx.media3.common.OooO(sparseBooleanArray2));
            oooO.f7127OooO = o000o0o2.OooO0O0(looper, null);
            o000000O o000000o2 = new o000000O(oooO);
            oooO.f7135OooOO0 = o000000o2;
            oooO.f7184Oooooo0 = o00O0OOO.OooO(o00000o1);
            oooO00oApply.Oooo00o(oooO, looper);
            int i5 = p080o000OoO.o000OO00.f34965OooO00o;
            o0 o0Var = i5 < 31 ? new o0() : OooO00o.OooO00o(applicationContext, oooO, oooO0O0.f7238OooOOoo);
            o00O000 o00o001 = oooO0O0.f7225OooO0o.get();
            int i6 = oooO.f7156OooOooo;
            boolean z = oooO.f7159Oooo000;
            try {
                oooO = this;
                oooO.f7136OooOO0O = new OooOO0O(rendererArrOooO00o, o00000Var, o00000o1, o00o001, oo000oVar, i6, z, oooO00oApply, o00oo0oo, oooO0O0.f7235OooOOOo, oooO0O0.f7237OooOOo0, looper, o000o0o2, o000000o2, o0Var);
                oooO.f7175OoooOo0 = 1.0f;
                oooO.f7156OooOooo = 0;
                MediaMetadata mediaMetadata = MediaMetadata.f6241Oooo0o0;
                oooO.f7164Oooo0o = mediaMetadata;
                oooO.f7182OooooOo = mediaMetadata;
                int iGenerateAudioSessionId = -1;
                oooO.f7183Oooooo = -1;
                if (i5 < 21) {
                    AudioTrack audioTrack = oooO.f7166Oooo0oO;
                    if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                        oooO.f7166Oooo0oO.release();
                        oooO.f7166Oooo0oO = null;
                    }
                    if (oooO.f7166Oooo0oO == null) {
                        oooO.f7166Oooo0oO = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                    }
                    oooO.f7173OoooOOO = oooO.f7166Oooo0oO.getAudioSessionId();
                } else {
                    AudioManager audioManager = (AudioManager) oooO.f7132OooO0o0.getSystemService("audio");
                    if (audioManager != null) {
                        iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                    }
                    oooO.f7173OoooOOO = iGenerateAudioSessionId;
                }
                oooO.f7177OoooOoo = o000O000.OooO0O0.f33946OooO0o;
                oooO.f7178Ooooo00 = true;
                oooO.OooOOoo(oooO.f7142OooOOo);
                oo000oVar.OooO0o0(new Handler(looper), oooO.f7142OooOOo);
                copyOnWriteArraySet.add(oooO0O1);
                androidx.media3.exoplayer.OooO00o oooO00o = new androidx.media3.exoplayer.OooO00o(context, handler, oooO0O1);
                oooO.f7150OooOoO = oooO00o;
                oooO00o.OooO00o();
                AudioFocusManager audioFocusManager = new AudioFocusManager(context, handler, oooO0O1);
                oooO.f7152OooOoOO = audioFocusManager;
                audioFocusManager.OooO0OO(null);
                oooO.f7154OooOoo0 = new o00OOO00(context);
                oooO.f7153OooOoo = new o00OOO0(context);
                Oooooo();
                oooO.f7181OooooOO = androidx.media3.common.o00Ooo.f6869OooO0oo;
                oooO.f7186o000oOoO = o000O000.f34957OooO0OO;
                oooO.f7134OooO0oo.OooO0o(oooO.f7174OoooOOo);
                oooO.o00oO0O(1, 10, Integer.valueOf(oooO.f7173OoooOOO));
                oooO.o00oO0O(2, 10, Integer.valueOf(oooO.f7173OoooOOO));
                oooO.o00oO0O(1, 3, oooO.f7174OoooOOo);
                oooO.o00oO0O(2, 4, Integer.valueOf(oooO.f7172OoooOO0));
                oooO.o00oO0O(2, 5, 0);
                oooO.o00oO0O(1, 9, Boolean.valueOf(oooO.f7176OoooOoO));
                oooO.o00oO0O(2, 7, oooO.f7151OooOoO0);
                oooO.o00oO0O(6, 8, oooO.f7151OooOoO0);
                oooO.f7130OooO0Oo.OooO0Oo();
            } catch (Throwable th) {
                th = th;
                oooO = this;
                oooO.f7130OooO0Oo.OooO0Oo();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static DeviceInfo Oooooo() {
        DeviceInfo.OooO00o oooO00o = new DeviceInfo.OooO00o(0);
        oooO00o.f6227OooO0O0 = 0;
        oooO00o.f6228OooO0OO = 0;
        return oooO00o.OooO00o();
    }

    public static long o00Ooo(o00O0OOO o00o0ooo2) {
        Oooo0.OooO0o oooO0o = new Oooo0.OooO0o();
        Oooo0.OooO0O0 oooO0O0 = new Oooo0.OooO0O0();
        o00o0ooo2.f34097OooO00o.OooOO0O(o00o0ooo2.f34098OooO0O0.f33815OooO00o, oooO0O0);
        long j = o00o0ooo2.f34099OooO0OO;
        return j == -9223372036854775807L ? o00o0ooo2.f34097OooO00o.OooOOo0(oooO0O0.f6647OooO0o, oooO0o).f6685OooOOOo : oooO0O0.f6650OooO0oo + j;
    }

    @Override // androidx.media3.common.Player
    public final void OooO(@Nullable SurfaceView surfaceView) {
        o00000();
        if (surfaceView instanceof o000OOO.OooO) {
            o00oO0o();
            o0Oo0oo(surfaceView);
            o0ooOoO(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof SphericalGLSurfaceView;
        OooO0O0 oooO0O0 = this.f7145OooOo;
        if (z) {
            o00oO0o();
            this.f7169OoooO0 = (SphericalGLSurfaceView) surfaceView;
            OooOOO oooOOOOoooooO = OoooooO(this.f7151OooOoO0);
            o00O0O.OooO0Oo(!oooOOOOoooooO.f7310OooO0oO);
            oooOOOOoooooO.f7307OooO0Oo = ResponseInfo.UnknownError;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.f7169OoooO0;
            o00O0O.OooO0Oo(true ^ oooOOOOoooooO.f7310OooO0oO);
            oooOOOOoooooO.f7309OooO0o0 = sphericalGLSurfaceView;
            oooOOOOoooooO.OooO0OO();
            this.f7169OoooO0.f8339OooO0Oo.add(oooO0O0);
            o0Oo0oo(this.f7169OoooO0.getVideoSurface());
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
        this.f7171OoooO0O = true;
        this.f7170OoooO00 = holder;
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
        if (this.f7184Oooooo0.f34108OooOOO.equals(oooOOOO)) {
            return;
        }
        o00O0OOO o00o0oooOooO0o = this.f7184Oooooo0.OooO0o(oooOOOO);
        this.f7160Oooo00O++;
        this.f7136OooOO0O.f7248OooOO0O.OooO0o0(4, oooOOOO).OooO00o();
        o000000O(o00o0oooOooO0o, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.OooOOOO OooO0O0() {
        o00000();
        return this.f7184Oooooo0.f34108OooOOO;
    }

    @Override // androidx.media3.common.Player
    public final boolean OooO0o() {
        o00000();
        return this.f7184Oooooo0.f34098OooO0O0.OooO00o();
    }

    @Override // androidx.media3.common.Player
    public final void OooO0o0() {
        o00000();
        boolean zOooOoOO = OooOoOO();
        int iOooO0o0 = this.f7152OooOoOO.OooO0o0(2, zOooOoOO);
        o000000(iOooO0o0, (!zOooOoOO || iOooO0o0 == 1) ? 1 : 2, zOooOoOO);
        o00O0OOO o00o0ooo2 = this.f7184Oooooo0;
        if (o00o0ooo2.f34102OooO0o0 != 1) {
            return;
        }
        o00O0OOO o00o0oooOooO0o0 = o00o0ooo2.OooO0o0(null);
        o00O0OOO o00o0oooOooO0oO = o00o0oooOooO0o0.OooO0oO(o00o0oooOooO0o0.f34097OooO00o.OooOo00() ? 4 : 2);
        this.f7160Oooo00O++;
        this.f7136OooOO0O.f7248OooOO0O.OooO0O0(0).OooO00o();
        o000000O(o00o0oooOooO0oO, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.Player
    public final long OooO0oO() {
        o00000();
        return p080o000OoO.o000OO00.o000oOoO(this.f7184Oooooo0.f34113OooOOo0);
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public final PlaybackException OooOO0O() {
        o00000();
        return this.f7184Oooooo0.f34101OooO0o;
    }

    @Override // androidx.media3.common.Player
    public final o00Oo0 OooOO0o() {
        o00000();
        return this.f7184Oooooo0.f34096OooO.f46757OooO0Oo;
    }

    @Override // androidx.media3.common.Player
    public final o000O000.OooO0O0 OooOOO() {
        o00000();
        return this.f7177OoooOoo;
    }

    @Override // androidx.media3.common.Player
    public final void OooOOOO(Player.OooO0OO oooO0OO) {
        o00000();
        oooO0OO.getClass();
        this.f7137OooOO0o.OooO0o0(oooO0OO);
    }

    @Override // androidx.media3.common.Player
    public final int OooOOOo() {
        o00000();
        if (OooO0o()) {
            return this.f7184Oooooo0.f34098OooO0O0.f33816OooO0O0;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final void OooOOoo(Player.OooO0OO oooO0OO) {
        oooO0OO.getClass();
        this.f7137OooOO0o.OooO00o(oooO0OO);
    }

    @Override // androidx.media3.common.Player
    public final Oooo0 OooOo0() {
        o00000();
        return this.f7184Oooooo0.f34097OooO00o;
    }

    @Override // androidx.media3.common.Player
    public final int OooOo00() {
        o00000();
        return this.f7184Oooooo0.f34109OooOOO0;
    }

    @Override // androidx.media3.common.Player
    public final Looper OooOo0O() {
        return this.f7144OooOOoo;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.o00O0O OooOo0o() {
        o00000();
        return this.f7134OooO0oo.OooO00o();
    }

    @Override // androidx.media3.common.Player
    public final void OooOoO0(@Nullable TextureView textureView) {
        o00000();
        if (textureView == null) {
            Oooooo0();
            return;
        }
        o00oO0o();
        this.f7168OoooO = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.OooO0o("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f7145OooOo);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            o0Oo0oo(null);
            oo000o(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            o0Oo0oo(surface);
            this.f7157Oooo = surface;
            oo000o(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean OooOoOO() {
        o00000();
        return this.f7184Oooooo0.f34107OooOO0o;
    }

    @Override // androidx.media3.common.Player
    public final void OooOoo0(final boolean z) {
        o00000();
        if (this.f7159Oooo000 != z) {
            this.f7159Oooo000 = z;
            this.f7136OooOO0O.f7248OooOO0O.OooO0oo(12, z ? 1 : 0, 0).OooO00o();
            o000OoO.o00000.OooO00o<Player.OooO0OO> oooO00o = new o000OoO.o00000.OooO00o() { // from class: o000O00O.o0000oo
                @Override // o000OoO.o00000.OooO00o
                public final void invoke(Object obj) {
                    ((Player.OooO0OO) obj).onShuffleModeEnabledChanged(z);
                }
            };
            p080o000OoO.o00000<Player.OooO0OO> o00000Var = this.f7137OooOO0o;
            o00000Var.OooO0OO(9, oooO00o);
            o000OOo();
            o00000Var.OooO0O0();
        }
    }

    @Override // androidx.media3.common.Player
    public final int OooOooO() {
        o00000();
        if (this.f7184Oooooo0.f34097OooO00o.OooOo00()) {
            return 0;
        }
        o00O0OOO o00o0ooo2 = this.f7184Oooooo0;
        return o00o0ooo2.f34097OooO00o.OooO0o0(o00o0ooo2.f34098OooO0O0.f33815OooO00o);
    }

    @Override // androidx.media3.common.Player
    public final void OooOooo(@Nullable TextureView textureView) {
        o00000();
        if (textureView == null || textureView != this.f7168OoooO) {
            return;
        }
        Oooooo0();
    }

    @Override // androidx.media3.common.Player
    public final void Oooo(androidx.media3.common.o00O0O o00o0o2) {
        o00000();
        o00000 o00000Var = this.f7134OooO0oo;
        o00000Var.getClass();
        if (!(o00000Var instanceof androidx.media3.exoplayer.trackselection.OooO0O0) || o00o0o2.equals(o00000Var.OooO00o())) {
            return;
        }
        o00000Var.OooO0oO(o00o0o2);
        this.f7137OooOO0o.OooO0o(19, new o000O00O.o0000O0(o00o0o2));
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.o00Ooo Oooo000() {
        o00000();
        return this.f7181OooooOO;
    }

    @Override // androidx.media3.common.Player
    public final int Oooo00o() {
        o00000();
        if (OooO0o()) {
            return this.f7184Oooooo0.f34098OooO0O0.f33817OooO0OO;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final long Oooo0O0() {
        o00000();
        return this.f7148OooOo0O;
    }

    @Override // androidx.media3.common.Player
    public final long Oooo0OO() {
        o00000();
        return o0OoOo0(this.f7184Oooooo0);
    }

    @Override // androidx.media3.common.Player
    public final int Oooo0o() {
        o00000();
        return this.f7184Oooooo0.f34102OooO0o0;
    }

    @Override // androidx.media3.common.Player
    public final int Oooo0oO() {
        o00000();
        int iO00O0O = o00O0O(this.f7184Oooooo0);
        if (iO00O0O == -1) {
            return 0;
        }
        return iO00O0O;
    }

    @Override // androidx.media3.common.Player
    public final void Oooo0oo(final int i) {
        o00000();
        if (this.f7156OooOooo != i) {
            this.f7156OooOooo = i;
            this.f7136OooOO0O.f7248OooOO0O.OooO0oo(11, i, 0).OooO00o();
            o000OoO.o00000.OooO00o<Player.OooO0OO> oooO00o = new o000OoO.o00000.OooO00o() { // from class: o000O00O.o00000
                @Override // o000OoO.o00000.OooO00o
                public final void invoke(Object obj) {
                    ((Player.OooO0OO) obj).onRepeatModeChanged(i);
                }
            };
            p080o000OoO.o00000<Player.OooO0OO> o00000Var = this.f7137OooOO0o;
            o00000Var.OooO0OO(8, oooO00o);
            o000OOo();
            o00000Var.OooO0O0();
        }
    }

    @Override // androidx.media3.common.Player
    public final long OoooO() {
        o00000();
        if (this.f7184Oooooo0.f34097OooO00o.OooOo00()) {
            return this.f7185OoooooO;
        }
        o00O0OOO o00o0ooo2 = this.f7184Oooooo0;
        if (o00o0ooo2.f34106OooOO0O.f33818OooO0Oo != o00o0ooo2.f34098OooO0O0.f33818OooO0Oo) {
            return o00o0ooo2.f34097OooO00o.OooOOo0(Oooo0oO(), this.f6360OooO00o).OooO0OO();
        }
        long j = o00o0ooo2.f34111OooOOOo;
        if (this.f7184Oooooo0.f34106OooOO0O.OooO00o()) {
            o00O0OOO o00o0ooo3 = this.f7184Oooooo0;
            Oooo0.OooO0O0 oooO0O0OooOO0O = o00o0ooo3.f34097OooO00o.OooOO0O(o00o0ooo3.f34106OooOO0O.f33815OooO00o, this.f7138OooOOO);
            long jOooO0oO = oooO0O0OooOO0O.OooO0oO(this.f7184Oooooo0.f34106OooOO0O.f33816OooO0O0);
            j = jOooO0oO == Long.MIN_VALUE ? oooO0O0OooOO0O.f6649OooO0oO : jOooO0oO;
        }
        o00O0OOO o00o0ooo4 = this.f7184Oooooo0;
        Oooo0 oooo0 = o00o0ooo4.f34097OooO00o;
        Object obj = o00o0ooo4.f34106OooOO0O.f33815OooO00o;
        Oooo0.OooO0O0 oooO0O0 = this.f7138OooOOO;
        oooo0.OooOO0O(obj, oooO0O0);
        return p080o000OoO.o000OO00.o000oOoO(j + oooO0O0.f6650OooO0oo);
    }

    @Override // androidx.media3.common.Player
    public final int OoooO0() {
        o00000();
        return this.f7156OooOooo;
    }

    @Override // androidx.media3.common.Player
    public final void OoooO00(@Nullable SurfaceView surfaceView) {
        o00000();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        o00000();
        if (holder == null || holder != this.f7170OoooO00) {
            return;
        }
        Oooooo0();
    }

    @Override // androidx.media3.common.Player
    public final boolean OoooO0O() {
        o00000();
        return this.f7159Oooo000;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata OoooOOO() {
        o00000();
        return this.f7164Oooo0o;
    }

    @Override // androidx.media3.common.Player
    public final long OoooOOo() {
        o00000();
        return this.f7146OooOo0;
    }

    @Override // androidx.media3.common.OooO0O0
    public final void Ooooo00(long j, boolean z, int i) {
        o00000();
        o00O0O.OooO00o(i >= 0);
        this.f7142OooOOo.OooOo0O();
        Oooo0 oooo0 = this.f7184Oooooo0.f34097OooO00o;
        if (oooo0.OooOo00() || i < oooo0.OooOOoo()) {
            this.f7160Oooo00O++;
            if (OooO0o()) {
                Log.OooO0o("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                OooOO0O.OooO0o oooO0o = new OooOO0O.OooO0o(this.f7184Oooooo0);
                oooO0o.OooO00o(1);
                OooO oooO = (OooO) this.f7135OooOO0.f34004OooO0Oo;
                oooO.getClass();
                oooO.f7127OooO.OooO(new o0000O00(oooO, oooO0o));
                return;
            }
            o00O0OOO o00o0oooOooO0oO = this.f7184Oooooo0;
            int i2 = o00o0oooOooO0oO.f34102OooO0o0;
            if (i2 == 3 || (i2 == 4 && !oooo0.OooOo00())) {
                o00o0oooOooO0oO = this.f7184Oooooo0.OooO0oO(2);
            }
            int iOooo0oO = Oooo0oO();
            o00O0OOO o00o0oooO00o0O = o00o0O(o00o0oooOooO0oO, oooo0, o00ooo(oooo0, i, j));
            long jOooo0OO = p080o000OoO.o000OO00.Oooo0OO(j);
            OooOO0O oooOO0O = this.f7136OooOO0O;
            oooOO0O.getClass();
            oooOO0O.f7248OooOO0O.OooO0o0(3, new OooOO0O.C0144OooOO0O(oooo0, i, jOooo0OO)).OooO00o();
            o000000O(o00o0oooO00o0O, 0, 1, true, 1, ooOO(o00o0oooO00o0O), iOooo0oO, z);
        }
    }

    public final MediaMetadata OooooOo() {
        Oooo0 oooo0OooOo0 = OooOo0();
        if (oooo0OooOo0.OooOo00()) {
            return this.f7182OooooOo;
        }
        androidx.media3.common.OooOOO0 oooOOO0 = oooo0OooOo0.OooOOo0(Oooo0oO(), this.f6360OooO00o).f6675OooO0o;
        MediaMetadata mediaMetadata = this.f7182OooooOo;
        mediaMetadata.getClass();
        MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o(mediaMetadata);
        MediaMetadata mediaMetadata2 = oooOOO0.f6492OooO0oO;
        if (mediaMetadata2 != null) {
            CharSequence charSequence = mediaMetadata2.f6275OooO0Oo;
            if (charSequence != null) {
                oooO00o.f6309OooO00o = charSequence;
            }
            CharSequence charSequence2 = mediaMetadata2.f6277OooO0o0;
            if (charSequence2 != null) {
                oooO00o.f6310OooO0O0 = charSequence2;
            }
            CharSequence charSequence3 = mediaMetadata2.f6276OooO0o;
            if (charSequence3 != null) {
                oooO00o.f6311OooO0OO = charSequence3;
            }
            CharSequence charSequence4 = mediaMetadata2.f6278OooO0oO;
            if (charSequence4 != null) {
                oooO00o.f6312OooO0Oo = charSequence4;
            }
            CharSequence charSequence5 = mediaMetadata2.f6279OooO0oo;
            if (charSequence5 != null) {
                oooO00o.f6314OooO0o0 = charSequence5;
            }
            CharSequence charSequence6 = mediaMetadata2.f6274OooO;
            if (charSequence6 != null) {
                oooO00o.f6313OooO0o = charSequence6;
            }
            CharSequence charSequence7 = mediaMetadata2.f6280OooOO0;
            if (charSequence7 != null) {
                oooO00o.f6315OooO0oO = charSequence7;
            }
            OooOo00 oooOo00 = mediaMetadata2.f6281OooOO0O;
            if (oooOo00 != null) {
                oooO00o.f6316OooO0oo = oooOo00;
            }
            OooOo00 oooOo01 = mediaMetadata2.f6282OooOO0o;
            if (oooOo01 != null) {
                oooO00o.f6308OooO = oooOo01;
            }
            byte[] bArr = mediaMetadata2.f6284OooOOO0;
            if (bArr != null) {
                oooO00o.OooO0o0(bArr, mediaMetadata2.f6283OooOOO);
            }
            Uri uri = mediaMetadata2.f6285OooOOOO;
            if (uri != null) {
                oooO00o.f6319OooOO0o = uri;
            }
            Integer num = mediaMetadata2.f6286OooOOOo;
            if (num != null) {
                oooO00o.f6321OooOOO0 = num;
            }
            Integer num2 = mediaMetadata2.f6288OooOOo0;
            if (num2 != null) {
                oooO00o.f6320OooOOO = num2;
            }
            Integer num3 = mediaMetadata2.f6287OooOOo;
            if (num3 != null) {
                oooO00o.f6322OooOOOO = num3;
            }
            Boolean bool = mediaMetadata2.f6289OooOOoo;
            if (bool != null) {
                oooO00o.f6323OooOOOo = bool;
            }
            Boolean bool2 = mediaMetadata2.f6292OooOo00;
            if (bool2 != null) {
                oooO00o.f6325OooOOo0 = bool2;
            }
            Integer num4 = mediaMetadata2.f6291OooOo0;
            if (num4 != null) {
                oooO00o.f6324OooOOo = num4;
            }
            Integer num5 = mediaMetadata2.f6293OooOo0O;
            if (num5 != null) {
                oooO00o.f6324OooOOo = num5;
            }
            Integer num6 = mediaMetadata2.f6294OooOo0o;
            if (num6 != null) {
                oooO00o.f6326OooOOoo = num6;
            }
            Integer num7 = mediaMetadata2.f6290OooOo;
            if (num7 != null) {
                oooO00o.f6329OooOo00 = num7;
            }
            Integer num8 = mediaMetadata2.f6296OooOoO0;
            if (num8 != null) {
                oooO00o.f6328OooOo0 = num8;
            }
            Integer num9 = mediaMetadata2.f6295OooOoO;
            if (num9 != null) {
                oooO00o.f6330OooOo0O = num9;
            }
            Integer num10 = mediaMetadata2.f6297OooOoOO;
            if (num10 != null) {
                oooO00o.f6331OooOo0o = num10;
            }
            CharSequence charSequence8 = mediaMetadata2.f6299OooOoo0;
            if (charSequence8 != null) {
                oooO00o.f6327OooOo = charSequence8;
            }
            CharSequence charSequence9 = mediaMetadata2.f6298OooOoo;
            if (charSequence9 != null) {
                oooO00o.f6333OooOoO0 = charSequence9;
            }
            CharSequence charSequence10 = mediaMetadata2.f6300OooOooO;
            if (charSequence10 != null) {
                oooO00o.f6332OooOoO = charSequence10;
            }
            Integer num11 = mediaMetadata2.f6301OooOooo;
            if (num11 != null) {
                oooO00o.f6334OooOoOO = num11;
            }
            Integer num12 = mediaMetadata2.f6303Oooo000;
            if (num12 != null) {
                oooO00o.f6336OooOoo0 = num12;
            }
            CharSequence charSequence11 = mediaMetadata2.f6304Oooo00O;
            if (charSequence11 != null) {
                oooO00o.f6335OooOoo = charSequence11;
            }
            CharSequence charSequence12 = mediaMetadata2.f6305Oooo00o;
            if (charSequence12 != null) {
                oooO00o.f6337OooOooO = charSequence12;
            }
            CharSequence charSequence13 = mediaMetadata2.f6302Oooo0;
            if (charSequence13 != null) {
                oooO00o.f6338OooOooo = charSequence13;
            }
            Integer num13 = mediaMetadata2.f6306Oooo0O0;
            if (num13 != null) {
                oooO00o.f6339Oooo000 = num13;
            }
            Bundle bundle = mediaMetadata2.f6307Oooo0OO;
            if (bundle != null) {
                oooO00o.f6340Oooo00O = bundle;
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
        int iO00O0O = o00O0O(this.f7184Oooooo0);
        Oooo0 oooo0 = this.f7184Oooooo0.f34097OooO00o;
        if (iO00O0O == -1) {
            iO00O0O = 0;
        }
        o000O0o o000o0o2 = this.f7149OooOo0o;
        OooOO0O oooOO0O = this.f7136OooOO0O;
        return new OooOOO(oooOO0O, oooO0O0, oooo0, iO00O0O, o000o0o2, oooOO0O.f7251OooOOO0);
    }

    public final long Ooooooo() {
        o00000();
        if (!OooO0o()) {
            return OoooO();
        }
        o00O0OOO o00o0ooo2 = this.f7184Oooooo0;
        return o00o0ooo2.f34106OooOO0O.equals(o00o0ooo2.f34098OooO0O0) ? p080o000OoO.o000OO00.o000oOoO(this.f7184Oooooo0.f34111OooOOOo) : o00Oo0();
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        o00000();
        return p080o000OoO.o000OO00.o000oOoO(ooOO(this.f7184Oooooo0));
    }

    public final void o00000() {
        o0OO00O o0oo00o2 = this.f7130OooO0Oo;
        synchronized (o0oo00o2) {
            boolean z = false;
            while (!o0oo00o2.f34991OooO00o) {
                try {
                    o0oo00o2.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f7144OooOOoo;
        if (threadCurrentThread != looper.getThread()) {
            String strOooOOO = p080o000OoO.o000OO00.OooOOO("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), looper.getThread().getName());
            if (this.f7178Ooooo00) {
                throw new IllegalStateException(strOooOOO);
            }
            Log.OooO0oO("ExoPlayerImpl", strOooOOO, this.f7179Ooooo0o ? null : new IllegalStateException());
            this.f7179Ooooo0o = true;
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
        o00O0OOO o00o0ooo2 = this.f7184Oooooo0;
        if (o00o0ooo2.f34107OooOO0o == r15 && o00o0ooo2.f34109OooOOO0 == i3) {
            return;
        }
        this.f7160Oooo00O++;
        boolean z2 = o00o0ooo2.f34110OooOOOO;
        o00O0OOO o00o0oooOooO00o = o00o0ooo2;
        if (z2) {
            o00o0oooOooO00o = o00o0ooo2.OooO00o();
        }
        o00O0OOO o00o0oooOooO0Oo = o00o0oooOooO00o.OooO0Oo(i3, r15);
        OooOO0O oooOO0O = this.f7136OooOO0O;
        oooOO0O.getClass();
        oooOO0O.f7248OooOO0O.OooO0oo(1, r15, i3).OooO00o();
        o000000O(o00o0oooOooO0Oo, 0, i2, false, 5, -9223372036854775807L, -1, false);
    }

    public final void o000000O(final o00O0OOO o00o0ooo2, final int i, final int i2, boolean z, final int i3, long j, int i4, boolean z2) {
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
        o00O0OOO o00o0ooo3 = this.f7184Oooooo0;
        this.f7184Oooooo0 = o00o0ooo2;
        boolean z3 = !o00o0ooo3.f34097OooO00o.equals(o00o0ooo2.f34097OooO00o);
        Oooo0 oooo0 = o00o0ooo3.f34097OooO00o;
        Oooo0 oooo1 = o00o0ooo2.f34097OooO00o;
        int i10 = 0;
        if (oooo1.OooOo00() && oooo0.OooOo00()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (oooo1.OooOo00() != oooo0.OooOo00()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            OooOOOO.OooO0O0 oooO0O0 = o00o0ooo3.f34098OooO0O0;
            Object obj5 = oooO0O0.f33815OooO00o;
            Oooo0.OooO0O0 oooO0O1 = this.f7138OooOOO;
            int i11 = oooo0.OooOO0O(obj5, oooO0O1).f6647OooO0o;
            Oooo0.OooO0o oooO0o = this.f6360OooO00o;
            Object obj6 = oooo0.OooOOo0(i11, oooO0o).f6674OooO0Oo;
            OooOOOO.OooO0O0 oooO0O2 = o00o0ooo2.f34098OooO0O0;
            if (!obj6.equals(oooo1.OooOOo0(oooo1.OooOO0O(oooO0O2.f33815OooO00o, oooO0O1).f6647OooO0o, oooO0o).f6674OooO0Oo)) {
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
            } else if (z && i3 == 0 && oooO0O0.f33818OooO0Oo < oooO0O2.f33818OooO0Oo) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = (z && i3 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        MediaMetadata mediaMetadataOooooOo = this.f7164Oooo0o;
        if (zBooleanValue) {
            if (o00o0ooo2.f34097OooO00o.OooOo00()) {
                oooOOO0 = null;
            } else {
                oooOOO0 = o00o0ooo2.f34097OooO00o.OooOOo0(o00o0ooo2.f34097OooO00o.OooOO0O(o00o0ooo2.f34098OooO0O0.f33815OooO00o, this.f7138OooOOO).f6647OooO0o, this.f6360OooO00o).f6675OooO0o;
            }
            this.f7182OooooOo = MediaMetadata.f6241Oooo0o0;
        } else {
            oooOOO0 = null;
        }
        if (zBooleanValue || !o00o0ooo3.f34105OooOO0.equals(o00o0ooo2.f34105OooOO0)) {
            MediaMetadata mediaMetadata = this.f7182OooooOo;
            mediaMetadata.getClass();
            MediaMetadata.OooO00o oooO00o = new MediaMetadata.OooO00o(mediaMetadata);
            List<Metadata> list = o00o0ooo2.f34105OooOO0;
            int i12 = 0;
            while (i12 < list.size()) {
                Metadata metadata = list.get(i12);
                int i13 = i10;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f6341OooO0Oo;
                    if (i13 < entryArr.length) {
                        entryArr[i13].o0ooOOo(oooO00o);
                        i13++;
                    }
                }
                i12++;
                i10 = 0;
            }
            this.f7182OooooOo = new MediaMetadata(oooO00o);
            mediaMetadataOooooOo = OooooOo();
        }
        boolean z4 = !mediaMetadataOooooOo.equals(this.f7164Oooo0o);
        this.f7164Oooo0o = mediaMetadataOooooOo;
        boolean z5 = o00o0ooo3.f34107OooOO0o != o00o0ooo2.f34107OooOO0o;
        boolean z6 = o00o0ooo3.f34102OooO0o0 != o00o0ooo2.f34102OooO0o0;
        if (z6 || z5) {
            o000000o();
        }
        boolean z7 = o00o0ooo3.f34103OooO0oO != o00o0ooo2.f34103OooO0oO;
        if (z3) {
            this.f7137OooOO0o.OooO0OO(0, new o000OoO.o00000.OooO00o() { // from class: o000O00O.o0000Ooo
                @Override // o000OoO.o00000.OooO00o
                public final void invoke(Object obj7) {
                    ((Player.OooO0OO) obj7).onTimelineChanged(o00o0ooo2.f34097OooO00o, i);
                }
            });
        }
        if (z) {
            Oooo0.OooO0O0 oooO0O3 = new Oooo0.OooO0O0();
            if (o00o0ooo3.f34097OooO00o.OooOo00()) {
                i7 = i4;
                obj = null;
                oooOOO1 = null;
                obj2 = null;
                i8 = -1;
            } else {
                Object obj7 = o00o0ooo3.f34098OooO0O0.f33815OooO00o;
                o00o0ooo3.f34097OooO00o.OooOO0O(obj7, oooO0O3);
                int i14 = oooO0O3.f6647OooO0o;
                int iOooO0o0 = o00o0ooo3.f34097OooO00o.OooO0o0(obj7);
                obj2 = obj7;
                obj = o00o0ooo3.f34097OooO00o.OooOOo0(i14, this.f6360OooO00o).f6674OooO0Oo;
                oooOOO1 = this.f6360OooO00o.f6675OooO0o;
                i7 = i14;
                i8 = iOooO0o0;
            }
            if (i3 == 0) {
                if (o00o0ooo3.f34098OooO0O0.OooO00o()) {
                    OooOOOO.OooO0O0 oooO0O4 = o00o0ooo3.f34098OooO0O0;
                    jO00Ooo = oooO0O3.OooO0Oo(oooO0O4.f33816OooO0O0, oooO0O4.f33817OooO0OO);
                    jO00Ooo2 = o00Ooo(o00o0ooo3);
                } else {
                    jO00Ooo = o00o0ooo3.f34098OooO0O0.f33819OooO0o0 != -1 ? o00Ooo(this.f7184Oooooo0) : oooO0O3.f6650OooO0oo + oooO0O3.f6649OooO0oO;
                    jO00Ooo2 = jO00Ooo;
                }
            } else if (o00o0ooo3.f34098OooO0O0.OooO00o()) {
                jO00Ooo = o00o0ooo3.f34112OooOOo;
                jO00Ooo2 = o00Ooo(o00o0ooo3);
            } else {
                jO00Ooo = oooO0O3.f6650OooO0oo + o00o0ooo3.f34112OooOOo;
                jO00Ooo2 = jO00Ooo;
            }
            long jO000oOoO = p080o000OoO.o000OO00.o000oOoO(jO00Ooo);
            long jO000oOoO2 = p080o000OoO.o000OO00.o000oOoO(jO00Ooo2);
            OooOOOO.OooO0O0 oooO0O5 = o00o0ooo3.f34098OooO0O0;
            final Player.OooO0o oooO0o2 = new Player.OooO0o(obj, i7, oooOOO1, obj2, i8, jO000oOoO, jO000oOoO2, oooO0O5.f33816OooO0O0, oooO0O5.f33817OooO0OO);
            int iOooo0oO = Oooo0oO();
            if (this.f7184Oooooo0.f34097OooO00o.OooOo00()) {
                obj3 = null;
                oooOOO2 = null;
                obj4 = null;
                i9 = -1;
            } else {
                o00O0OOO o00o0ooo4 = this.f7184Oooooo0;
                Object obj8 = o00o0ooo4.f34098OooO0O0.f33815OooO00o;
                o00o0ooo4.f34097OooO00o.OooOO0O(obj8, this.f7138OooOOO);
                int iOooO0o1 = this.f7184Oooooo0.f34097OooO00o.OooO0o0(obj8);
                Oooo0 oooo2 = this.f7184Oooooo0.f34097OooO00o;
                Oooo0.OooO0o oooO0o3 = this.f6360OooO00o;
                Object obj9 = oooo2.OooOOo0(iOooo0oO, oooO0o3).f6674OooO0Oo;
                i9 = iOooO0o1;
                oooOOO2 = oooO0o3.f6675OooO0o;
                obj4 = obj8;
                obj3 = obj9;
            }
            long jO000oOoO3 = p080o000OoO.o000OO00.o000oOoO(j);
            long jO000oOoO4 = this.f7184Oooooo0.f34098OooO0O0.OooO00o() ? p080o000OoO.o000OO00.o000oOoO(o00Ooo(this.f7184Oooooo0)) : jO000oOoO3;
            OooOOOO.OooO0O0 oooO0O6 = this.f7184Oooooo0.f34098OooO0O0;
            final Player.OooO0o oooO0o4 = new Player.OooO0o(obj3, iOooo0oO, oooOOO2, obj4, i9, jO000oOoO3, jO000oOoO4, oooO0O6.f33816OooO0O0, oooO0O6.f33817OooO0OO);
            this.f7137OooOO0o.OooO0OO(11, new o000OoO.o00000.OooO00o() { // from class: o000O00O.o0000OO0
                @Override // o000OoO.o00000.OooO00o
                public final void invoke(Object obj10) {
                    Player.OooO0OO oooO0OO = (Player.OooO0OO) obj10;
                    int i15 = i3;
                    oooO0OO.onPositionDiscontinuity(i15);
                    oooO0OO.onPositionDiscontinuity(oooO0o2, oooO0o4, i15);
                }
            });
        }
        if (zBooleanValue) {
            this.f7137OooOO0o.OooO0OO(1, new o000OoO.o00000.OooO00o() { // from class: o000O00O.o000
                @Override // o000OoO.o00000.OooO00o
                public final void invoke(Object obj10) {
                    ((Player.OooO0OO) obj10).onMediaItemTransition(oooOOO0, iIntValue);
                }
            });
        }
        if (o00o0ooo3.f34101OooO0o != o00o0ooo2.f34101OooO0o) {
            final int i15 = 0;
            this.f7137OooOO0o.OooO0OO(10, new o000OoO.o00000.OooO00o() { // from class: o000O00O.o000O000
                @Override // o000OoO.o00000.OooO00o
                public final void invoke(Object obj10) {
                    int i16 = i15;
                    Object obj11 = o00o0ooo2;
                    switch (i16) {
                        case 0:
                            ((Player.OooO0OO) obj10).onPlayerErrorChanged(((o00O0OOO) obj11).f34101OooO0o);
                            return;
                        default:
                            ((androidx.media3.session.o000O0Oo.OooO0OO) obj11).getClass();
                            throw null;
                    }
                }
            });
            if (o00o0ooo2.f34101OooO0o != null) {
                this.f7137OooOO0o.OooO0OO(10, new o000O00O.o000O0o(o00o0ooo2, i15));
            }
        }
        o00000O0 o00000o1 = o00o0ooo3.f34096OooO;
        o00000O0 o00000o2 = o00o0ooo2.f34096OooO;
        if (o00000o1 != o00000o2) {
            this.f7134OooO0oo.OooO0OO(o00000o2.f46758OooO0o0);
            i6 = 0;
            this.f7137OooOO0o.OooO0OO(2, new o000Oo0(o00o0ooo2, i6));
        } else {
            i6 = 0;
        }
        if (z4) {
            this.f7137OooOO0o.OooO0OO(14, new o000O00O.o0OO00O(this.f7164Oooo0o, i6));
        }
        if (z7) {
            this.f7137OooOO0o.OooO0OO(3, new oo0o0Oo(o00o0ooo2, i6));
        }
        if (z6 || z5) {
            this.f7137OooOO0o.OooO0OO(-1, new o0O0O00(o00o0ooo2));
        }
        if (z6) {
            this.f7137OooOO0o.OooO0OO(4, new o000O00O.o000OOo(o00o0ooo2));
        }
        if (z5) {
            this.f7137OooOO0o.OooO0OO(5, new o000OoO.o00000.OooO00o() { // from class: o000O00O.o0000O0O
                @Override // o000OoO.o00000.OooO00o
                public final void invoke(Object obj10) {
                    ((Player.OooO0OO) obj10).onPlayWhenReadyChanged(o00o0ooo2.f34107OooOO0o, i2);
                }
            });
        }
        if (o00o0ooo3.f34109OooOOO0 != o00o0ooo2.f34109OooOOO0) {
            this.f7137OooOO0o.OooO0OO(6, new o000O00O.o000OO(o00o0ooo2));
        }
        if (o00o0ooo3.OooOO0O() != o00o0ooo2.OooOO0O()) {
            this.f7137OooOO0o.OooO0OO(7, new o00O0000(o00o0ooo2, 1));
        }
        if (!o00o0ooo3.f34108OooOOO.equals(o00o0ooo2.f34108OooOOO)) {
            this.f7137OooOO0o.OooO0OO(12, new o0000O(o00o0ooo2, 0));
        }
        o000OOo();
        this.f7137OooOO0o.OooO0O0();
        if (o00o0ooo3.f34110OooOOOO != o00o0ooo2.f34110OooOOOO) {
            Iterator<androidx.media3.exoplayer.OooO0o.OooO00o> it = this.f7139OooOOO0.iterator();
            while (it.hasNext()) {
                it.next().OooOo();
            }
        }
    }

    public final void o000000o() {
        int iOooo0o = Oooo0o();
        o00OOO0 o00ooo1 = this.f7153OooOoo;
        o00OOO00 o00ooo00 = this.f7154OooOoo0;
        if (iOooo0o != 1) {
            if (iOooo0o == 2 || iOooo0o == 3) {
                o00000();
                boolean z = this.f7184Oooooo0.f34110OooOOOO;
                OooOoOO();
                o00ooo00.getClass();
                OooOoOO();
                o00ooo1.getClass();
                return;
            }
            if (iOooo0o != 4) {
                throw new IllegalStateException();
            }
        }
        o00ooo00.getClass();
        o00ooo1.getClass();
    }

    public final void o000OOo() {
        Player.OooO00o oooO00o = this.f7165Oooo0o0;
        int i = p080o000OoO.o000OO00.f34965OooO00o;
        Player player = this.f7131OooO0o;
        boolean zOooO0o = player.OooO0o();
        boolean zOooo0o0 = player.Oooo0o0();
        boolean zOooo00O = player.Oooo00O();
        boolean zOooOOO0 = player.OooOOO0();
        boolean zOoooOo0 = player.OoooOo0();
        boolean zOooOOo = player.OooOOo();
        boolean zOooOo00 = player.OooOo0().OooOo00();
        Player.OooO00o.C0140OooO00o c0140OooO00o = new Player.OooO00o.C0140OooO00o();
        androidx.media3.common.OooO oooO = this.f7129OooO0OO.f6708OooO0Oo;
        androidx.media3.common.OooO.OooO00o oooO00o2 = c0140OooO00o.f6710OooO00o;
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
        this.f7165Oooo0o0 = oooO00o3;
        if (oooO00o3.equals(oooO00o)) {
            return;
        }
        this.f7137OooOO0o.OooO0OO(13, new o0000(this, i2));
    }

    public final int o00O0O(o00O0OOO o00o0ooo2) {
        if (o00o0ooo2.f34097OooO00o.OooOo00()) {
            return this.f7183Oooooo;
        }
        return o00o0ooo2.f34097OooO00o.OooOO0O(o00o0ooo2.f34098OooO0O0.f33815OooO00o, this.f7138OooOOO).f6647OooO0o;
    }

    public final long o00Oo0() {
        o00000();
        if (!OooO0o()) {
            return OooOoo();
        }
        o00O0OOO o00o0ooo2 = this.f7184Oooooo0;
        OooOOOO.OooO0O0 oooO0O0 = o00o0ooo2.f34098OooO0O0;
        Oooo0 oooo0 = o00o0ooo2.f34097OooO00o;
        Object obj = oooO0O0.f33815OooO00o;
        Oooo0.OooO0O0 oooO0O1 = this.f7138OooOOO;
        oooo0.OooOO0O(obj, oooO0O1);
        return p080o000OoO.o000OO00.o000oOoO(oooO0O1.OooO0Oo(oooO0O0.f33816OooO0O0, oooO0O0.f33817OooO0OO));
    }

    public final o00O0OOO o00o0O(o00O0OOO o00o0ooo2, Oooo0 oooo0, @Nullable Pair<Object, Long> pair) {
        List<Metadata> list;
        o00O0O.OooO00o(oooo0.OooOo00() || pair != null);
        Oooo0 oooo1 = o00o0ooo2.f34097OooO00o;
        long jO0OoOo0 = o0OoOo0(o00o0ooo2);
        o00O0OOO o00o0oooOooO0oo = o00o0ooo2.OooO0oo(oooo0);
        if (oooo0.OooOo00()) {
            OooOOOO.OooO0O0 oooO0O0 = o00O0OOO.f34095OooOo00;
            long jOooo0OO = p080o000OoO.o000OO00.Oooo0OO(this.f7185OoooooO);
            o00O0OOO o00o0oooOooO0O0 = o00o0oooOooO0oo.OooO0OO(oooO0O0, jOooo0OO, jOooo0OO, jOooo0OO, 0L, o000O.oo0o0Oo.f33888OooO0oO, this.f7128OooO0O0, o0O00.f19065OooO0oo).OooO0O0(oooO0O0);
            o00o0oooOooO0O0.f34111OooOOOo = o00o0oooOooO0O0.f34112OooOOo;
            return o00o0oooOooO0O0;
        }
        Object obj = o00o0oooOooO0oo.f34098OooO0O0.f33815OooO00o;
        boolean z = !obj.equals(pair.first);
        OooOOOO.OooO0O0 oooO0O1 = z ? new OooOOOO.OooO0O0(pair.first) : o00o0oooOooO0oo.f34098OooO0O0;
        long jLongValue = ((Long) pair.second).longValue();
        long jOooo0OO2 = p080o000OoO.o000OO00.Oooo0OO(jO0OoOo0);
        if (!oooo1.OooOo00()) {
            jOooo0OO2 -= oooo1.OooOO0O(obj, this.f7138OooOOO).f6650OooO0oo;
        }
        if (z || jLongValue < jOooo0OO2) {
            o00O0O.OooO0Oo(!oooO0O1.OooO00o());
            o000O.oo0o0Oo oo0o0oo = z ? o000O.oo0o0Oo.f33888OooO0oO : o00o0oooOooO0oo.f34104OooO0oo;
            o00000O0 o00000o1 = z ? this.f7128OooO0O0 : o00o0oooOooO0oo.f34096OooO;
            if (z) {
                ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f18686OooO0o0;
                list = o0O00.f19065OooO0oo;
            } else {
                list = o00o0oooOooO0oo.f34105OooOO0;
            }
            o00O0OOO o00o0oooOooO0O1 = o00o0oooOooO0oo.OooO0OO(oooO0O1, jLongValue, jLongValue, jLongValue, 0L, oo0o0oo, o00000o1, list).OooO0O0(oooO0O1);
            o00o0oooOooO0O1.f34111OooOOOo = jLongValue;
            return o00o0oooOooO0O1;
        }
        if (jLongValue != jOooo0OO2) {
            o00O0O.OooO0Oo(!oooO0O1.OooO00o());
            long jMax = Math.max(0L, o00o0oooOooO0oo.f34113OooOOo0 - (jLongValue - jOooo0OO2));
            long j = o00o0oooOooO0oo.f34111OooOOOo;
            if (o00o0oooOooO0oo.f34106OooOO0O.equals(o00o0oooOooO0oo.f34098OooO0O0)) {
                j = jLongValue + jMax;
            }
            o00O0OOO o00o0oooOooO0OO = o00o0oooOooO0oo.OooO0OO(oooO0O1, jLongValue, jLongValue, jLongValue, jMax, o00o0oooOooO0oo.f34104OooO0oo, o00o0oooOooO0oo.f34096OooO, o00o0oooOooO0oo.f34105OooOO0);
            o00o0oooOooO0OO.f34111OooOOOo = j;
            return o00o0oooOooO0OO;
        }
        int iOooO0o0 = oooo0.OooO0o0(o00o0oooOooO0oo.f34106OooOO0O.f33815OooO00o);
        if (iOooO0o0 != -1 && oooo0.OooOO0(iOooO0o0, this.f7138OooOOO, false).f6647OooO0o == oooo0.OooOO0O(oooO0O1.f33815OooO00o, this.f7138OooOOO).f6647OooO0o) {
            return o00o0oooOooO0oo;
        }
        oooo0.OooOO0O(oooO0O1.f33815OooO00o, this.f7138OooOOO);
        long jOooO0Oo = oooO0O1.OooO00o() ? this.f7138OooOOO.OooO0Oo(oooO0O1.f33816OooO0O0, oooO0O1.f33817OooO0OO) : this.f7138OooOOO.f6649OooO0oO;
        o00O0OOO o00o0oooOooO0O2 = o00o0oooOooO0oo.OooO0OO(oooO0O1, o00o0oooOooO0oo.f34112OooOOo, o00o0oooOooO0oo.f34112OooOOo, o00o0oooOooO0oo.f34100OooO0Oo, jOooO0Oo - o00o0oooOooO0oo.f34112OooOOo, o00o0oooOooO0oo.f34104OooO0oo, o00o0oooOooO0oo.f34096OooO, o00o0oooOooO0oo.f34105OooOO0).OooO0O0(oooO0O1);
        o00o0oooOooO0O2.f34111OooOOOo = jOooO0Oo;
        return o00o0oooOooO0O2;
    }

    public final void o00oO0O(int i, int i2, @Nullable Object obj) {
        for (Renderer renderer : this.f7133OooO0oO) {
            if (renderer.OooOOOO() == i) {
                OooOOO oooOOOOoooooO = OoooooO(renderer);
                o00O0O.OooO0Oo(!oooOOOOoooooO.f7310OooO0oO);
                oooOOOOoooooO.f7307OooO0Oo = i2;
                o00O0O.OooO0Oo(!oooOOOOoooooO.f7310OooO0oO);
                oooOOOOoooooO.f7309OooO0o0 = obj;
                oooOOOOoooooO.OooO0OO();
            }
        }
    }

    public final void o00oO0o() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.f7169OoooO0;
        OooO0O0 oooO0O0 = this.f7145OooOo;
        if (sphericalGLSurfaceView != null) {
            OooOOO oooOOOOoooooO = OoooooO(this.f7151OooOoO0);
            o00O0O.OooO0Oo(!oooOOOOoooooO.f7310OooO0oO);
            oooOOOOoooooO.f7307OooO0Oo = ResponseInfo.UnknownError;
            o00O0O.OooO0Oo(!oooOOOOoooooO.f7310OooO0oO);
            oooOOOOoooooO.f7309OooO0o0 = null;
            oooOOOOoooooO.OooO0OO();
            this.f7169OoooO0.f8339OooO0Oo.remove(oooO0O0);
            this.f7169OoooO0 = null;
        }
        TextureView textureView = this.f7168OoooO;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != oooO0O0) {
                Log.OooO0o("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f7168OoooO.setSurfaceTextureListener(null);
            }
            this.f7168OoooO = null;
        }
        SurfaceHolder surfaceHolder = this.f7170OoooO00;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(oooO0O0);
            this.f7170OoooO00 = null;
        }
    }

    @Nullable
    public final Pair<Object, Long> o00ooo(Oooo0 oooo0, int i, long j) {
        if (oooo0.OooOo00()) {
            this.f7183Oooooo = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f7185OoooooO = j;
            return null;
        }
        if (i == -1 || i >= oooo0.OooOOoo()) {
            i = oooo0.OooO0Oo(this.f7159Oooo000);
            j = p080o000OoO.o000OO00.o000oOoO(oooo0.OooOOo0(i, this.f6360OooO00o).f6685OooOOOo);
        }
        return oooo0.OooOOO0(this.f6360OooO00o, this.f7138OooOOO, i, p080o000OoO.o000OO00.Oooo0OO(j));
    }

    public final void o0O0O00(@Nullable ExoPlaybackException exoPlaybackException) {
        o00O0OOO o00o0ooo2 = this.f7184Oooooo0;
        o00O0OOO o00o0oooOooO0O0 = o00o0ooo2.OooO0O0(o00o0ooo2.f34098OooO0O0);
        o00o0oooOooO0O0.f34111OooOOOo = o00o0oooOooO0O0.f34112OooOOo;
        o00o0oooOooO0O0.f34113OooOOo0 = 0L;
        o00O0OOO o00o0oooOooO0oO = o00o0oooOooO0O0.OooO0oO(1);
        if (exoPlaybackException != null) {
            o00o0oooOooO0oO = o00o0oooOooO0oO.OooO0o0(exoPlaybackException);
        }
        this.f7160Oooo00O++;
        this.f7136OooOO0O.f7248OooOO0O.OooO0O0(6).OooO00o();
        o000000O(o00o0oooOooO0oO, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void o0OO00O(float f) {
        o00000();
        final float fOooO0oo = p080o000OoO.o000OO00.OooO0oo(f, 0.0f, 1.0f);
        if (this.f7175OoooOo0 == fOooO0oo) {
            return;
        }
        this.f7175OoooOo0 = fOooO0oo;
        o00oO0O(1, 2, Float.valueOf(this.f7152OooOoOO.f7101OooO0oO * fOooO0oo));
        this.f7137OooOO0o.OooO0o(22, new o000OoO.o00000.OooO00o() { // from class: o000O00O.o00000OO
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((Player.OooO0OO) obj).onVolumeChanged(fOooO0oo);
            }
        });
    }

    public final void o0OOO0o(boolean z) {
        o00000();
        int iOooO0o0 = this.f7152OooOoOO.OooO0o0(Oooo0o(), z);
        int i = 1;
        if (z && iOooO0o0 != 1) {
            i = 2;
        }
        o000000(iOooO0o0, i, z);
    }

    public final void o0Oo0oo(@Nullable Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Renderer renderer : this.f7133OooO0oO) {
            if (renderer.OooOOOO() == 2) {
                OooOOO oooOOOOoooooO = OoooooO(renderer);
                o00O0O.OooO0Oo(!oooOOOOoooooO.f7310OooO0oO);
                oooOOOOoooooO.f7307OooO0Oo = 1;
                o00O0O.OooO0Oo(true ^ oooOOOOoooooO.f7310OooO0oO);
                oooOOOOoooooO.f7309OooO0o0 = obj;
                oooOOOOoooooO.OooO0OO();
                arrayList.add(oooOOOOoooooO);
            }
        }
        Object obj2 = this.f7167Oooo0oo;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OooOOO) it.next()).OooO00o(this.f7155OooOooO);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = this.f7167Oooo0oo;
            Surface surface = this.f7157Oooo;
            if (obj3 == surface) {
                surface.release();
                this.f7157Oooo = null;
            }
        }
        this.f7167Oooo0oo = obj;
        if (z) {
            o0O0O00(new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
        }
    }

    public final long o0OoOo0(o00O0OOO o00o0ooo2) {
        if (!o00o0ooo2.f34098OooO0O0.OooO00o()) {
            return p080o000OoO.o000OO00.o000oOoO(ooOO(o00o0ooo2));
        }
        Object obj = o00o0ooo2.f34098OooO0O0.f33815OooO00o;
        Oooo0 oooo0 = o00o0ooo2.f34097OooO00o;
        Oooo0.OooO0O0 oooO0O0 = this.f7138OooOOO;
        oooo0.OooOO0O(obj, oooO0O0);
        long j = o00o0ooo2.f34099OooO0OO;
        return j == -9223372036854775807L ? p080o000OoO.o000OO00.o000oOoO(oooo0.OooOOo0(o00O0O(o00o0ooo2), this.f6360OooO00o).f6685OooOOOo) : p080o000OoO.o000OO00.o000oOoO(oooO0O0.f6650OooO0oo) + p080o000OoO.o000OO00.o000oOoO(j);
    }

    public final void o0ooOO0(OooOOOO oooOOOO) {
        o00000();
        List listSingletonList = Collections.singletonList(oooOOOO);
        o00000();
        o0ooOOo(listSingletonList);
    }

    public final void o0ooOOo(List list) {
        o00000();
        o00O0O(this.f7184Oooooo0);
        getCurrentPosition();
        this.f7160Oooo00O++;
        ArrayList arrayList = this.f7140OooOOOO;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = size - 1; i >= 0; i--) {
                arrayList.remove(i);
            }
            this.f7163Oooo0OO = this.f7163Oooo0OO.OooO00o(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            OooOOO0.OooO0OO oooO0OO = new OooOOO0.OooO0OO((OooOOOO) list.get(i2), this.f7141OooOOOo);
            arrayList2.add(oooO0OO);
            arrayList.add(i2 + 0, new OooO0o(oooO0OO.f7329OooO00o.f7937OooOOOO, oooO0OO.f7330OooO0O0));
        }
        this.f7163Oooo0OO = this.f7163Oooo0OO.OooO0oO(arrayList2.size());
        o00O o00o2 = new o00O(arrayList, this.f7163Oooo0OO);
        boolean zOooOo00 = o00o2.OooOo00();
        int i3 = o00o2.f34037OooOOO0;
        if (!zOooOo00 && -1 >= i3) {
            throw new IllegalSeekPositionException();
        }
        int iOooO0Oo = o00o2.OooO0Oo(this.f7159Oooo000);
        o00O0OOO o00o0oooO00o0O = o00o0O(this.f7184Oooooo0, o00o2, o00ooo(o00o2, iOooO0Oo, -9223372036854775807L));
        int i4 = o00o0oooO00o0O.f34102OooO0o0;
        if (iOooO0Oo != -1 && i4 != 1) {
            i4 = (o00o2.OooOo00() || iOooO0Oo >= i3) ? 4 : 2;
        }
        o00O0OOO o00o0oooOooO0oO = o00o0oooO00o0O.OooO0oO(i4);
        long jOooo0OO = p080o000OoO.o000OO00.Oooo0OO(-9223372036854775807L);
        o00Ooo o00ooo2 = this.f7163Oooo0OO;
        OooOO0O oooOO0O = this.f7136OooOO0O;
        oooOO0O.getClass();
        oooOO0O.f7248OooOO0O.OooO0o0(17, new OooOO0O.OooO00o(arrayList2, o00ooo2, iOooO0Oo, jOooo0OO)).OooO00o();
        o000000O(o00o0oooOooO0oO, 0, 1, (this.f7184Oooooo0.f34098OooO0O0.f33815OooO00o.equals(o00o0oooOooO0oO.f34098OooO0O0.f33815OooO00o) || this.f7184Oooooo0.f34097OooO00o.OooOo00()) ? false : true, 4, ooOO(o00o0oooOooO0oO), -1, false);
    }

    public final void o0ooOoO(SurfaceHolder surfaceHolder) {
        this.f7171OoooO0O = false;
        this.f7170OoooO00 = surfaceHolder;
        surfaceHolder.addCallback(this.f7145OooOo);
        Surface surface = this.f7170OoooO00.getSurface();
        if (surface == null || !surface.isValid()) {
            oo000o(0, 0);
        } else {
            Rect surfaceFrame = this.f7170OoooO00.getSurfaceFrame();
            oo000o(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void oo000o(final int i, final int i2) {
        o000O000 o000o001 = this.f7186o000oOoO;
        if (i == o000o001.f34958OooO00o && i2 == o000o001.f34959OooO0O0) {
            return;
        }
        this.f7186o000oOoO = new o000O000(i, i2);
        this.f7137OooOO0o.OooO0o(24, new o000OoO.o00000.OooO00o() { // from class: o000O00O.o00000O
            @Override // o000OoO.o00000.OooO00o
            public final void invoke(Object obj) {
                ((Player.OooO0OO) obj).onSurfaceSizeChanged(i, i2);
            }
        });
        o00oO0O(2, 14, new o000O000(i, i2));
    }

    public final void oo0o0Oo() {
        o00000();
        this.f7152OooOoOO.OooO0o0(1, OooOoOO());
        o0O0O00(null);
        this.f7177OoooOoo = new o000O000.OooO0O0(this.f7184Oooooo0.f34112OooOOo, o0O00.f19065OooO0oo);
    }

    public final long ooOO(o00O0OOO o00o0ooo2) {
        if (o00o0ooo2.f34097OooO00o.OooOo00()) {
            return p080o000OoO.o000OO00.Oooo0OO(this.f7185OoooooO);
        }
        long jOooOO0 = o00o0ooo2.f34110OooOOOO ? o00o0ooo2.OooOO0() : o00o0ooo2.f34112OooOOo;
        if (o00o0ooo2.f34098OooO0O0.OooO00o()) {
            return jOooOO0;
        }
        Oooo0 oooo0 = o00o0ooo2.f34097OooO00o;
        Object obj = o00o0ooo2.f34098OooO0O0.f33815OooO00o;
        Oooo0.OooO0O0 oooO0O0 = this.f7138OooOOO;
        oooo0.OooOO0O(obj, oooO0O0);
        return jOooOO0 + oooO0O0.f6650OooO0oo;
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.1.1] [");
        sb.append(p080o000OoO.o000OO00.f34970OooO0o0);
        sb.append("] [");
        HashSet<String> hashSet = o0000O0.f33813OooO00o;
        synchronized (o0000O0.class) {
            str = o0000O0.f33814OooO0O0;
        }
        sb.append(str);
        sb.append("]");
        Log.OooO0o0("ExoPlayerImpl", sb.toString());
        o00000();
        if (p080o000OoO.o000OO00.f34965OooO00o < 21 && (audioTrack = this.f7166Oooo0oO) != null) {
            audioTrack.release();
            this.f7166Oooo0oO = null;
        }
        this.f7150OooOoO.OooO00o();
        this.f7154OooOoo0.getClass();
        this.f7153OooOoo.getClass();
        AudioFocusManager audioFocusManager = this.f7152OooOoOO;
        audioFocusManager.f7097OooO0OO = null;
        audioFocusManager.OooO00o();
        if (!this.f7136OooOO0O.OooOoO0()) {
            this.f7137OooOO0o.OooO0o(10, new o000O00O.o00000O0());
        }
        this.f7137OooOO0o.OooO0Oo();
        this.f7127OooO.OooO0OO();
        this.f7147OooOo00.OooO0Oo(this.f7142OooOOo);
        o00O0OOO o00o0ooo2 = this.f7184Oooooo0;
        if (o00o0ooo2.f34110OooOOOO) {
            this.f7184Oooooo0 = o00o0ooo2.OooO00o();
        }
        o00O0OOO o00o0oooOooO0oO = this.f7184Oooooo0.OooO0oO(1);
        this.f7184Oooooo0 = o00o0oooOooO0oO;
        o00O0OOO o00o0oooOooO0O0 = o00o0oooOooO0oO.OooO0O0(o00o0oooOooO0oO.f34098OooO0O0);
        this.f7184Oooooo0 = o00o0oooOooO0O0;
        o00o0oooOooO0O0.f34111OooOOOo = o00o0oooOooO0O0.f34112OooOOo;
        this.f7184Oooooo0.f34113OooOOo0 = 0L;
        this.f7142OooOOo.release();
        this.f7134OooO0oo.OooO0Oo();
        o00oO0o();
        Surface surface = this.f7157Oooo;
        if (surface != null) {
            surface.release();
            this.f7157Oooo = null;
        }
        this.f7177OoooOoo = o000O000.OooO0O0.f33946OooO0o;
        this.f7180OooooO0 = true;
    }
}
