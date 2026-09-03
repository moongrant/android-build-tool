package com.common.videoplayer.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.common.videoplayer.PlayState;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.Oooo000;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import o0O00O0o.OooO0OO;
import o0O00O0o.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p296o0O0OoO0.Oooo0;
import p310o0O0o0oo.o00O00O;
import p310o0O0o0oo.o0O0ooO;
import p310o0O0o0oo.oo0o0O0;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p319o0O0oOo0.o0000O;
import p466o0OooO0.o000O00;
import p466o0OooO0.o000O00O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, d2 = {"Lcom/common/videoplayer/view/VideoView;", "Landroid/widget/FrameLayout;", "Lo0O00O0o/OooO00o;", "", "volume", "", "setVolume", "Lo0O00O0o/OooO0OO;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setStateChangedListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "VideoPlayer_release"}, k = 1, mv = {1, 5, 1})
public final class VideoView extends FrameLayout implements o0O00O0o.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public OooO0OO f12663Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final com.google.android.exoplayer2.upstream.OooO0OO f12664Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Oooo000 f12665Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final TextureView f12666Oooo0oo;

    public static final class OooO00o implements Player.OooO00o {
        public OooO00o() {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooO(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooO00o() {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooO0OO() {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooO0oO(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOO0O(o000O00 o000o01) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final void OooOO0o(@NotNull ExoPlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            OooO0OO oooO0OO = VideoView.this.f12663Oooo;
            if (oooO0OO != null) {
                oooO0OO.onStateChanged(PlayState.Stop);
            }
            VideoView.this.f12665Oooo0oO.OooOOo(false);
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOOO(o000oOoO o000oooo2, int i) {
            o000O00O.OooO00o(this, o000oooo2, i);
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final void OooOOO0(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final void OooOOo0(int i) {
            if (i == 3) {
                OooO0OO oooO0OO = VideoView.this.f12663Oooo;
                if (oooO0OO == null) {
                    return;
                }
                oooO0OO.onStateChanged(PlayState.Prepare);
                return;
            }
            if (i != 4) {
                return;
            }
            OooO0OO oooO0OO2 = VideoView.this.f12663Oooo;
            if (oooO0OO2 != null) {
                oooO0OO2.onStateChanged(PlayState.Stop);
            }
            VideoView.this.f12665Oooo0oO.OooOOo(false);
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOOoo() {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOoOO(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OooOooO(OooOOO oooOOO, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void Oooo0OO(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void Oooo0o0(TrackGroupArray trackGroupArray, o0000O o0000o2) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO00o
        public final /* synthetic */ void OoooO(boolean z) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // o0O00O0o.OooO00o
    public final void OooO00o(@NotNull OooO0o videoItem) {
        o00O00O o0o0ooo;
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        Uri uri = Uri.parse(videoItem.f35128OooO00o);
        OooOOO.OooO0O0 oooO0O0 = new OooOOO.OooO0O0();
        oooO0O0.f13273OooO0O0 = uri;
        OooOOO oooOOOOooO00o = oooO0O0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(oooOOOOooO00o, "fromUri(Uri.parse(videoItem.filePath))");
        if (videoItem.f35129OooO0O0 == 0) {
            o0o0ooo = new oo0o0O0.OooO0O0(this.f12664Oooo0o, new Oooo0()).OooO00o(oooOOOOooO00o);
            Intrinsics.checkNotNullExpressionValue(o0o0ooo, "{\n                ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(mediaItem)\n            }");
        } else {
            o0o0ooo = new o0O0ooO(new oo0o0O0.OooO0O0(this.f12664Oooo0o, new Oooo0()).OooO00o(oooOOOOooO00o), videoItem.f35129OooO0O0);
        }
        this.f12665Oooo0oO.OooOOo(false);
        this.f12665Oooo0oO.OooOo0(true);
        this.f12665Oooo0oO.OooOOo0(o0o0ooo);
        this.f12665Oooo0oO.OooOOO0();
    }

    @Override // o0O00O0o.OooO00o
    public final void OooO0O0() {
        if (this.f12666Oooo0oo.getVisibility() != 0) {
            this.f12666Oooo0oo.setVisibility(0);
        }
        this.f12665Oooo0oO.OooOOo(true);
        OooO0OO oooO0OO = this.f12663Oooo;
        if (oooO0OO == null) {
            return;
        }
        oooO0OO.onStateChanged(PlayState.Playing);
    }

    @Override // o0O00O0o.OooO00o
    public final void pause() {
        this.f12665Oooo0oO.OooOOo(false);
        OooO0OO oooO0OO = this.f12663Oooo;
        if (oooO0OO == null) {
            return;
        }
        oooO0OO.onStateChanged(PlayState.Pause);
    }

    @Override // o0O00O0o.OooO00o
    public final void release() {
        this.f12665Oooo0oO.OooOOO();
    }

    @Override // o0O00O0o.OooO00o
    public void setStateChangedListener(@Nullable OooO0OO listener) {
        this.f12663Oooo = listener;
    }

    public void setVolume(float volume) {
        this.f12665Oooo0oO.OooOo00(volume);
    }

    @Override // o0O00O0o.OooO00o
    public final void stop() {
        this.f12665Oooo0oO.OooOo0(true);
        this.f12666Oooo0oo.setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12664Oooo0o = new com.google.android.exoplayer2.upstream.OooO0OO(context, o000OOo0.OooOo(context));
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(context, new DefaultRenderersFactory(context), new Oooo0());
        o00000O0.OooO0Oo(!oooO00o.f13465OooOOOO);
        oooO00o.f13465OooOOOO = true;
        Oooo000 oooo000 = new Oooo000(oooO00o);
        Intrinsics.checkNotNullExpressionValue(oooo000, "Builder(context).build()");
        this.f12665Oooo0oO = oooo000;
        TextureView textureView = new TextureView(context);
        this.f12666Oooo0oo = textureView;
        addView(textureView, -1, -1);
        oooo000.OooOo0o();
        oooo000.OooOOOO();
        oooo000.OooOo0o();
        oooo000.OooOOOo(2, 8, null);
        oooo000.f13440OooOo0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(oooo000.f13424OooO0Oo);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            oooo000.OooOOoo(null, true);
            oooo000.OooOO0o(0, 0);
        } else {
            oooo000.OooOOoo(new Surface(surfaceTexture), true);
            oooo000.OooOO0o(textureView.getWidth(), textureView.getHeight());
        }
        oooo000.f13423OooO0OO.OooO(new OooO00o());
    }
}
