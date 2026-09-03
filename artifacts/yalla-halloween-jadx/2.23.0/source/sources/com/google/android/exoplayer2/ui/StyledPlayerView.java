package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p245o00oo0o.oo0o0O0;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class StyledPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ int f13971OooOoo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final ImageView f13972OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f13973OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final View f13974OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final AspectRatioFrameLayout f13975OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final View f13976OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f13977OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final SubtitleView f13978OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final View f13979OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final TextView f13980OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final FrameLayout f13981OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final StyledPlayerControlView f13982OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final FrameLayout f13983OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Player f13984OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public StyledPlayerControlView.OooOOOO f13985OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f13986OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f13987OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f13988OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f13989OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public Drawable f13990OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f13991OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public CharSequence f13992OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f13993OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f13994OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f13995OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f13996OooOoo0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ArtworkDisplayMode {
    }

    public final class OooO00o implements Player.OooO0OO, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.OooOOOO, StyledPlayerControlView.OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final com.google.android.exoplayer2.oo0o0Oo.OooO0O0 f13997OooO0Oo = new com.google.android.exoplayer2.oo0o0Oo.OooO0O0();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public Object f13999OooO0o0;

        public OooO00o() {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.OooOOOO
        public final void OooO00o(int i) {
            int i2 = StyledPlayerView.f13971OooOoo;
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            styledPlayerView.OooOO0();
            styledPlayerView.getClass();
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.OooO00o oooO00o) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onAvailableCommandsChanged(Player.OooO00o oooO00o) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = StyledPlayerView.f13971OooOoo;
            StyledPlayerView.this.OooO0oO();
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onCues(List list) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onEvents(Player player, Player.OooO0O0 oooO0O0) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            StyledPlayerView.OooO00o((TextureView) view, StyledPlayerView.this.f13996OooOoo0);
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.o000oOoO o000oooo2, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onMetadata(Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onPlayWhenReadyChanged(boolean z, int i) {
            int i2 = StyledPlayerView.f13971OooOoo;
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            styledPlayerView.OooO();
            if (!styledPlayerView.OooO0O0() || !styledPlayerView.f13993OooOoO) {
                styledPlayerView.OooO0OO(false);
                return;
            }
            StyledPlayerControlView styledPlayerControlView = styledPlayerView.f13982OooOOO0;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.OooO0oO();
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.o00Ooo o00ooo2) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onPlaybackStateChanged(int i) {
            int i2 = StyledPlayerView.f13971OooOoo;
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            styledPlayerView.OooO();
            styledPlayerView.OooOO0O();
            if (!styledPlayerView.OooO0O0() || !styledPlayerView.f13993OooOoO) {
                styledPlayerView.OooO0OO(false);
                return;
            }
            StyledPlayerControlView styledPlayerControlView = styledPlayerView.f13982OooOOO0;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.OooO0oO();
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onRenderedFirstFrame() {
            View view = StyledPlayerView.this.f13974OooO0o;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.oo0o0Oo oo0o0oo, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.OooO oooO) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onTracksChanged(com.google.android.exoplayer2.o0O0O00 o0o0o00) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            Player player = styledPlayerView.f13984OooOOOo;
            player.getClass();
            com.google.android.exoplayer2.oo0o0Oo oo0o0ooOooOO0 = player.Oooo0O0(17) ? player.OooOO0() : com.google.android.exoplayer2.oo0o0Oo.f12895OooO0Oo;
            if (oo0o0ooOooOO0.OooOOo0()) {
                this.f13999OooO0o0 = null;
            } else {
                boolean zOooo0O0 = player.Oooo0O0(30);
                com.google.android.exoplayer2.oo0o0Oo.OooO0O0 oooO0O0 = this.f13997OooO0Oo;
                if (!zOooo0O0 || player.OooO0oo().f12832OooO0Oo.isEmpty()) {
                    Object obj = this.f13999OooO0o0;
                    if (obj != null) {
                        int iOooO0O0 = oo0o0ooOooOO0.OooO0O0(obj);
                        if (iOooO0O0 != -1) {
                            if (player.OooOo00() == oo0o0ooOooOO0.OooO0oO(iOooO0O0, oooO0O0, false).f12906OooO0o) {
                                return;
                            }
                        }
                        this.f13999OooO0o0 = null;
                    }
                } else {
                    this.f13999OooO0o0 = oo0o0ooOooOO0.OooO0oO(player.OoooO(), oooO0O0, true).f12907OooO0o0;
                }
            }
            styledPlayerView.OooOO0o(false);
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onVideoSizeChanged(o0oOOo o0oooo) {
            StyledPlayerView styledPlayerView;
            Player player;
            if (o0oooo.equals(o0oOOo.f40860OooO0oo) || (player = (styledPlayerView = StyledPlayerView.this).f13984OooOOOo) == null || player.OooOOoo() == 1) {
                return;
            }
            styledPlayerView.OooO0oo();
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onVolumeChanged(float f) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onCues(p230o00oOoO0.o0000O0O o0000o0o2) {
            SubtitleView subtitleView = StyledPlayerView.this.f13978OooOO0;
            if (subtitleView != null) {
                subtitleView.setCues(o0000o0o2.f40114OooO0Oo);
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onPositionDiscontinuity(Player.OooO0o oooO0o, Player.OooO0o oooO0o2, int i) {
            StyledPlayerControlView styledPlayerControlView;
            int i2 = StyledPlayerView.f13971OooOoo;
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            if (styledPlayerView.OooO0O0() && styledPlayerView.f13993OooOoO && (styledPlayerControlView = styledPlayerView.f13982OooOOO0) != null) {
                styledPlayerControlView.OooO0oO();
            }
        }
    }

    public interface OooO0O0 {
        void OooO00o();
    }

    public interface OooO0OO {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowBuffering {
    }

    public StyledPlayerView(Context context) {
        this(context, null);
    }

    public static void OooO00o(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final void OooO() {
        boolean z;
        View view = this.f13979OooOO0O;
        if (view != null) {
            Player player = this.f13984OooOOOo;
            if (player == null || player.OooOOoo() != 2) {
                z = false;
            } else {
                int i = this.f13989OooOo0;
                z = true;
                if (i != 2 && (i != 1 || !this.f13984OooOOOo.OooOOO())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final boolean OooO0O0() {
        Player player = this.f13984OooOOOo;
        return player != null && player.Oooo0O0(16) && this.f13984OooOOOo.OooO0Oo() && this.f13984OooOOOo.OooOOO();
    }

    public final void OooO0OO(boolean z) {
        if (!(OooO0O0() && this.f13993OooOoO) && OooOOO0()) {
            StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
            boolean z2 = styledPlayerControlView.OooO0oo() && styledPlayerControlView.getShowTimeoutMs() <= 0;
            boolean zOooO0o0 = OooO0o0();
            if (z || z2 || zOooO0o0) {
                OooO0o(zOooO0o0);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    public final boolean OooO0Oo(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f13987OooOOoo == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f13975OooO0o0;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                ImageView imageView = this.f13972OooO;
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final void OooO0o(boolean z) {
        if (OooOOO0()) {
            int i = z ? 0 : this.f13988OooOo;
            StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
            styledPlayerControlView.setShowTimeoutMs(i);
            o0000 o0000Var = styledPlayerControlView.f13884OooO0Oo;
            StyledPlayerControlView styledPlayerControlView2 = o0000Var.f14034OooO00o;
            if (!styledPlayerControlView2.OooO()) {
                styledPlayerControlView2.setVisibility(0);
                styledPlayerControlView2.OooOO0();
                View view = styledPlayerControlView2.f13896OooOOo;
                if (view != null) {
                    view.requestFocus();
                }
            }
            o0000Var.OooOO0O();
        }
    }

    public final boolean OooO0o0() {
        Player player = this.f13984OooOOOo;
        if (player == null) {
            return true;
        }
        int iOooOOoo = player.OooOOoo();
        if (this.f13994OooOoO0 && (!this.f13984OooOOOo.Oooo0O0(17) || !this.f13984OooOOOo.OooOO0().OooOOo0())) {
            if (iOooOOoo == 1 || iOooOOoo == 4) {
                return true;
            }
            Player player2 = this.f13984OooOOOo;
            player2.getClass();
            if (!player2.OooOOO()) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0oO() {
        if (!OooOOO0() || this.f13984OooOOOo == null) {
            return;
        }
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        if (!styledPlayerControlView.OooO0oo()) {
            OooO0OO(true);
        } else if (this.f13995OooOoOO) {
            styledPlayerControlView.OooO0oO();
        }
    }

    public final void OooO0oo() {
        Player player = this.f13984OooOOOo;
        o0oOOo o0ooooO000oOoO = player != null ? player.o000oOoO() : o0oOOo.f40860OooO0oo;
        int i = o0ooooO000oOoO.f40864OooO0Oo;
        int i2 = o0ooooO000oOoO.f40866OooO0o0;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * o0ooooO000oOoO.f40867OooO0oO) / i2;
        View view = this.f13976OooO0oO;
        if (view instanceof TextureView) {
            int i3 = o0ooooO000oOoO.f40865OooO0o;
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            int i4 = this.f13996OooOoo0;
            OooO00o oooO00o = this.f13973OooO0Oo;
            if (i4 != 0) {
                view.removeOnLayoutChangeListener(oooO00o);
            }
            this.f13996OooOoo0 = i3;
            if (i3 != 0) {
                view.addOnLayoutChangeListener(oooO00o);
            }
            OooO00o((TextureView) view, this.f13996OooOoo0);
        }
        float f2 = this.f13977OooO0oo ? 0.0f : f;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13975OooO0o0;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    public final void OooOO0() {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        if (styledPlayerControlView == null || !this.f13986OooOOo0) {
            setContentDescription(null);
        } else if (styledPlayerControlView.OooO0oo()) {
            setContentDescription(this.f13995OooOoOO ? getResources().getString(Oooo0.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(Oooo0.exo_controls_show));
        }
    }

    public final void OooOO0O() {
        TextView textView = this.f13980OooOO0o;
        if (textView != null) {
            CharSequence charSequence = this.f13992OooOo0o;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                Player player = this.f13984OooOOOo;
                if (player != null) {
                    player.OooooOo();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void OooOO0o(boolean z) {
        boolean z2;
        byte[] bArr;
        Player player = this.f13984OooOOOo;
        View view = this.f13974OooO0o;
        boolean zOooO0Oo = false;
        ImageView imageView = this.f13972OooO;
        if (player == null || !player.Oooo0O0(30) || player.OooO0oo().f12832OooO0Oo.isEmpty()) {
            if (this.f13991OooOo0O) {
                return;
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        if (z && !this.f13991OooOo0O && view != null) {
            view.setVisibility(0);
        }
        if (player.OooO0oo().OooO0O0(2)) {
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
                return;
            }
            return;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.f13987OooOOoo != 0) {
            o00O000o.OooO0o0(imageView);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (player.Oooo0O0(18) && (bArr = player.Ooooooo().f10973OooOOO0) != null) {
                zOooO0Oo = OooO0Oo(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
            }
            if (zOooO0Oo || OooO0Oo(this.f13990OooOo00)) {
                return;
            }
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            imageView.setVisibility(4);
        }
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    public final boolean OooOOO0() {
        if (!this.f13986OooOOo0) {
            return false;
        }
        o00O000o.OooO0o0(this.f13982OooOOO0);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.f13984OooOOOo;
        if (player != null && player.Oooo0O0(16) && this.f13984OooOOOo.OooO0Oo()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        if (z && OooOOO0() && !styledPlayerControlView.OooO0oo()) {
            OooO0OO(true);
        } else {
            if (!(OooOOO0() && styledPlayerControlView.OooO0Oo(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z || !OooOOO0()) {
                    return false;
                }
                OooO0OO(true);
                return false;
            }
            OooO0OO(true);
        }
        return true;
    }

    public List<AdOverlayInfo> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f13983OooOOOO;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout));
        }
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        if (styledPlayerControlView != null) {
            arrayList.add(new AdOverlayInfo(styledPlayerControlView));
        }
        return ImmutableList.OooOO0O(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f13981OooOOO;
        o00O000o.OooO0o(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f13987OooOOoo;
    }

    public boolean getControllerAutoShow() {
        return this.f13994OooOoO0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f13995OooOoOO;
    }

    public int getControllerShowTimeoutMs() {
        return this.f13988OooOo;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f13990OooOo00;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f13983OooOOOO;
    }

    @Nullable
    public Player getPlayer() {
        return this.f13984OooOOOo;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13975OooO0o0;
        o00O000o.OooO0o0(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f13978OooOO0;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f13987OooOOoo != 0;
    }

    public boolean getUseController() {
        return this.f13986OooOOo0;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f13976OooO0oO;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!OooOOO0() || this.f13984OooOOOo == null) {
            return false;
        }
        OooO0OO(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        OooO0oO();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        o00O000o.OooO0Oo(i == 0 || this.f13972OooO != null);
        if (this.f13987OooOOoo != i) {
            this.f13987OooOOoo = i;
            OooOO0o(false);
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.OooO00o oooO00o) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13975OooO0o0;
        o00O000o.OooO0o0(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(oooO00o);
    }

    public void setControllerAutoShow(boolean z) {
        this.f13994OooOoO0 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f13993OooOoO = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        o00O000o.OooO0o0(this.f13982OooOOO0);
        this.f13995OooOoOO = z;
        OooOO0();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable StyledPlayerControlView.OooO0OO oooO0OO) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setOnFullScreenModeChangedListener(oooO0OO);
    }

    public void setControllerShowTimeoutMs(int i) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        this.f13988OooOo = i;
        if (styledPlayerControlView.OooO0oo()) {
            OooO0o(OooO0o0());
        }
    }

    public void setControllerVisibilityListener(@Nullable OooO0O0 oooO0O0) {
        if (oooO0O0 != null) {
            setControllerVisibilityListener((StyledPlayerControlView.OooOOOO) null);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        o00O000o.OooO0Oo(this.f13980OooOO0o != null);
        this.f13992OooOo0o = charSequence;
        OooOO0O();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f13990OooOo00 != drawable) {
            this.f13990OooOo00 = drawable;
            OooOO0o(false);
        }
    }

    public void setErrorMessageProvider(@Nullable oo0o0O0<? super PlaybackException> oo0o0o0) {
        if (oo0o0o0 != null) {
            OooOO0O();
        }
    }

    public void setFullscreenButtonClickListener(@Nullable OooO0OO oooO0OO) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setOnFullScreenModeChangedListener(this.f13973OooO0Oo);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f13991OooOo0O != z) {
            this.f13991OooOo0O = z;
            OooOO0o(false);
        }
    }

    public void setPlayer(@Nullable Player player) {
        o00O000o.OooO0Oo(Looper.myLooper() == Looper.getMainLooper());
        o00O000o.OooO00o(player == null || player.OooOO0O() == Looper.getMainLooper());
        Player player2 = this.f13984OooOOOo;
        if (player2 == player) {
            return;
        }
        View view = this.f13976OooO0oO;
        OooO00o oooO00o = this.f13973OooO0Oo;
        if (player2 != null) {
            player2.OooOooo(oooO00o);
            if (player2.Oooo0O0(27)) {
                if (view instanceof TextureView) {
                    player2.OoooOO0((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    player2.OoooooO((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f13978OooOO0;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f13984OooOOOo = player;
        boolean zOooOOO0 = OooOOO0();
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        if (zOooOOO0) {
            styledPlayerControlView.setPlayer(player);
        }
        OooO();
        OooOO0O();
        OooOO0o(true);
        if (player == null) {
            if (styledPlayerControlView != null) {
                styledPlayerControlView.OooO0oO();
                return;
            }
            return;
        }
        if (player.Oooo0O0(27)) {
            if (view instanceof TextureView) {
                player.Oooo0o((TextureView) view);
            } else if (view instanceof SurfaceView) {
                player.Oooo000((SurfaceView) view);
            }
            if (player.OooO0oo().OooO0OO()) {
                OooO0oo();
            }
        }
        if (subtitleView != null && player.Oooo0O0(28)) {
            subtitleView.setCues(player.OooO().f40114OooO0Oo);
        }
        player.Ooooo00(oooO00o);
        OooO0OO(false);
    }

    public void setRepeatToggleModes(int i) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13975OooO0o0;
        o00O000o.OooO0o0(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f13989OooOo0 != i) {
            this.f13989OooOo0 = i;
            OooO();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        styledPlayerControlView.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(@ColorInt int i) {
        View view = this.f13974OooO0o;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0Oo((z && styledPlayerControlView == null) ? false : true);
        setClickable(z || hasOnClickListeners());
        if (this.f13986OooOOo0 == z) {
            return;
        }
        this.f13986OooOOo0 = z;
        if (OooOOO0()) {
            styledPlayerControlView.setPlayer(this.f13984OooOOOo);
        } else if (styledPlayerControlView != null) {
            styledPlayerControlView.OooO0oO();
            styledPlayerControlView.setPlayer(null);
        }
        OooOO0();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f13976OooO0oO;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public StyledPlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void setControllerVisibilityListener(@Nullable StyledPlayerControlView.OooOOOO oooOOOO) {
        StyledPlayerControlView styledPlayerControlView = this.f13982OooOOO0;
        o00O000o.OooO0o0(styledPlayerControlView);
        StyledPlayerControlView.OooOOOO oooOOOO2 = this.f13985OooOOo;
        if (oooOOOO2 == oooOOOO) {
            return;
        }
        CopyOnWriteArrayList<StyledPlayerControlView.OooOOOO> copyOnWriteArrayList = styledPlayerControlView.f13887OooO0oO;
        if (oooOOOO2 != null) {
            copyOnWriteArrayList.remove(oooOOOO2);
        }
        this.f13985OooOOo = oooOOOO;
        if (oooOOOO != null) {
            copyOnWriteArrayList.add(oooOOOO);
            setControllerVisibilityListener((OooO0O0) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        int i8;
        boolean z5;
        boolean z6;
        boolean z7;
        int i9;
        super(context, attributeSet, i);
        OooO00o oooO00o = new OooO00o();
        this.f13973OooO0Oo = oooO00o;
        if (isInEditMode()) {
            this.f13975OooO0o0 = null;
            this.f13974OooO0o = null;
            this.f13976OooO0oO = null;
            this.f13977OooO0oo = false;
            this.f13972OooO = null;
            this.f13978OooOO0 = null;
            this.f13979OooOO0O = null;
            this.f13980OooOO0o = null;
            this.f13982OooOOO0 = null;
            this.f13981OooOOO = null;
            this.f13983OooOOOO = null;
            ImageView imageView = new ImageView(context);
            if (o0O00.f40595OooO00o >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(o0O00.OooOOOO(context, resources, OooOOO0.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources.getColor(OooOO0.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(o0O00.OooOOOO(context, resources2, OooOOO0.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(OooOO0.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i10 = OooOo.exo_styled_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o0OoOo0.StyledPlayerView, i, 0);
            try {
                int i11 = o0OoOo0.StyledPlayerView_shutter_background_color;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
                int color = typedArrayObtainStyledAttributes.getColor(i11, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(o0OoOo0.StyledPlayerView_player_layout_id, i10);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerView_use_artwork, true);
                int i12 = typedArrayObtainStyledAttributes.getInt(o0OoOo0.StyledPlayerView_artwork_display_mode, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(o0OoOo0.StyledPlayerView_default_artwork, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerView_use_controller, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(o0OoOo0.StyledPlayerView_surface_type, 1);
                int i14 = typedArrayObtainStyledAttributes.getInt(o0OoOo0.StyledPlayerView_resize_mode, 0);
                int i15 = typedArrayObtainStyledAttributes.getInt(o0OoOo0.StyledPlayerView_show_timeout, 5000);
                z2 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerView_hide_on_touch, true);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerView_auto_show, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(o0OoOo0.StyledPlayerView_show_buffering, 0);
                this.f13991OooOo0O = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerView_keep_content_on_player_reset, this.f13991OooOo0O);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.StyledPlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z = z10;
                i4 = integer;
                z6 = z11;
                i10 = resourceId;
                i2 = i15;
                i3 = i13;
                z5 = z9;
                i8 = i12;
                z3 = zHasValue;
                i6 = resourceId2;
                z4 = z8;
                i7 = color;
                i5 = i14;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = true;
            z2 = true;
            i3 = 1;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            z3 = false;
            z4 = true;
            i8 = 1;
            z5 = true;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(OooOOOO.exo_content_frame);
        this.f13975OooO0o0 = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i5);
        }
        View viewFindViewById = findViewById(OooOOOO.exo_shutter);
        this.f13974OooO0o = viewFindViewById;
        if (viewFindViewById != null && z3) {
            viewFindViewById.setBackgroundColor(i7);
        }
        if (aspectRatioFrameLayout != null && i3 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                this.f13976OooO0oO = new TextureView(context);
            } else {
                if (i3 == 3) {
                    try {
                        int i16 = SphericalGLSurfaceView.f14387OooOOOO;
                        this.f13976OooO0oO = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i3 != 4) {
                    this.f13976OooO0oO = new SurfaceView(context);
                } else {
                    try {
                        int i17 = VideoDecoderGLSurfaceView.f14336OooO0o0;
                        this.f13976OooO0oO = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                this.f13976OooO0oO.setLayoutParams(layoutParams);
                this.f13976OooO0oO.setOnClickListener(oooO00o);
                this.f13976OooO0oO.setClickable(false);
                aspectRatioFrameLayout.addView(this.f13976OooO0oO, 0);
            }
            z7 = false;
            this.f13976OooO0oO.setLayoutParams(layoutParams);
            this.f13976OooO0oO.setOnClickListener(oooO00o);
            this.f13976OooO0oO.setClickable(false);
            aspectRatioFrameLayout.addView(this.f13976OooO0oO, 0);
        } else {
            this.f13976OooO0oO = null;
            z7 = false;
        }
        this.f13977OooO0oo = z7;
        this.f13981OooOOO = (FrameLayout) findViewById(OooOOOO.exo_ad_overlay);
        this.f13983OooOOOO = (FrameLayout) findViewById(OooOOOO.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(OooOOOO.exo_artwork);
        this.f13972OooO = imageView2;
        this.f13987OooOOoo = z4 && i8 != 0 && imageView2 != null ? i8 : 0;
        if (i6 != 0) {
            Context context2 = getContext();
            Object obj = ContextCompat.f5271OooO00o;
            this.f13990OooOo00 = ContextCompat.OooO0OO.OooO0O0(context2, i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(OooOOOO.exo_subtitles);
        this.f13978OooOO0 = subtitleView;
        if (subtitleView != null) {
            subtitleView.OooO00o();
            subtitleView.OooO0O0();
        }
        View viewFindViewById2 = findViewById(OooOOOO.exo_buffering);
        this.f13979OooOO0O = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f13989OooOo0 = i4;
        TextView textView = (TextView) findViewById(OooOOOO.exo_error_message);
        this.f13980OooOO0o = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i18 = OooOOOO.exo_controller;
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(i18);
        View viewFindViewById3 = findViewById(OooOOOO.exo_controller_placeholder);
        if (styledPlayerControlView != null) {
            this.f13982OooOOO0 = styledPlayerControlView;
            i9 = 0;
        } else if (viewFindViewById3 != null) {
            i9 = 0;
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context, null, 0, attributeSet);
            this.f13982OooOOO0 = styledPlayerControlView2;
            styledPlayerControlView2.setId(i18);
            styledPlayerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(styledPlayerControlView2, iIndexOfChild);
        } else {
            i9 = 0;
            this.f13982OooOOO0 = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.f13982OooOOO0;
        this.f13988OooOo = styledPlayerControlView3 != null ? i2 : i9;
        this.f13995OooOoOO = z2;
        this.f13994OooOoO0 = z;
        this.f13993OooOoO = z6;
        this.f13986OooOOo0 = (!z5 || styledPlayerControlView3 == null) ? i9 : 1;
        if (styledPlayerControlView3 != null) {
            o0000 o0000Var = styledPlayerControlView3.f13884OooO0Oo;
            int i19 = o0000Var.f14057OooOoO;
            if (i19 != 3 && i19 != 2) {
                o0000Var.OooO0o();
                o0000Var.OooO(2);
            }
            this.f13982OooOOO0.f13887OooO0oO.add(oooO00o);
        }
        if (z5) {
            setClickable(true);
        }
        OooOO0();
    }
}
