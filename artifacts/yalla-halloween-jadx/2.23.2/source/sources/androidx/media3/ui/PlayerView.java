package androidx.media3.ui;

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
import androidx.media3.common.AdOverlayInfo;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
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
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ int f9733OooOoo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final ImageView f9734OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f9735OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final View f9736OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final AspectRatioFrameLayout f9737OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final View f9738OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f9739OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final SubtitleView f9740OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final View f9741OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final TextView f9742OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final FrameLayout f9743OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final PlayerControlView f9744OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final FrameLayout f9745OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Player f9746OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public PlayerControlView.OooOOOO f9747OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f9748OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f9749OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f9750OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f9751OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public Drawable f9752OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f9753OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public CharSequence f9754OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f9755OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f9756OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f9757OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f9758OooOoo0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface ArtworkDisplayMode {
    }

    public final class OooO00o implements Player.OooO0OO, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.OooOOOO, PlayerControlView.OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final androidx.media3.common.Oooo0.OooO0O0 f9759OooO0Oo = new androidx.media3.common.Oooo0.OooO0O0();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public Object f9761OooO0o0;

        public OooO00o() {
        }

        @Override // androidx.media3.ui.PlayerControlView.OooOOOO
        public final void OooOO0O(int i) {
            int i2 = PlayerView.f9733OooOoo;
            PlayerView playerView = PlayerView.this;
            playerView.OooOO0();
            playerView.getClass();
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onAudioAttributesChanged(androidx.media3.common.OooO00o oooO00o) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onAvailableCommandsChanged(Player.OooO00o oooO00o) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = PlayerView.f9733OooOoo;
            PlayerView.this.OooO0oO();
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onCues(List list) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onEvents(Player player, Player.OooO0O0 oooO0O0) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.OooO00o((TextureView) view, PlayerView.this.f9758OooOoo0);
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onMediaItemTransition(androidx.media3.common.OooOOO0 oooOOO0, int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onMetadata(Metadata metadata) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onPlayWhenReadyChanged(boolean z, int i) {
            int i2 = PlayerView.f9733OooOoo;
            PlayerView playerView = PlayerView.this;
            playerView.OooO();
            if (!playerView.OooO0O0() || !playerView.f9755OooOoO) {
                playerView.OooO0OO(false);
                return;
            }
            PlayerControlView playerControlView = playerView.f9744OooOOO0;
            if (playerControlView != null) {
                playerControlView.OooO0oO();
            }
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlaybackParametersChanged(androidx.media3.common.OooOOOO oooOOOO) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onPlaybackStateChanged(int i) {
            int i2 = PlayerView.f9733OooOoo;
            PlayerView playerView = PlayerView.this;
            playerView.OooO();
            playerView.OooOO0O();
            if (!playerView.OooO0O0() || !playerView.f9755OooOoO) {
                playerView.OooO0OO(false);
                return;
            }
            PlayerControlView playerControlView = playerView.f9744OooOOO0;
            if (playerControlView != null) {
                playerControlView.OooO0oO();
            }
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onRenderedFirstFrame() {
            View view = PlayerView.this.f9736OooO0o;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onRepeatModeChanged(int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onTimelineChanged(androidx.media3.common.Oooo0 oooo0, int i) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onTrackSelectionParametersChanged(androidx.media3.common.o00O0O o00o0o2) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onTracksChanged(androidx.media3.common.o00Oo0 o00oo1) {
            PlayerView playerView = PlayerView.this;
            Player player = playerView.f9746OooOOOo;
            player.getClass();
            androidx.media3.common.Oooo0 oooo0OooOo0 = player.OooOOo0(17) ? player.OooOo0() : androidx.media3.common.Oooo0.f6629OooO0Oo;
            if (oooo0OooOo0.OooOo00()) {
                this.f9761OooO0o0 = null;
            } else {
                boolean zOooOOo0 = player.OooOOo0(30);
                androidx.media3.common.Oooo0.OooO0O0 oooO0O0 = this.f9759OooO0Oo;
                if (!zOooOOo0 || player.OooOO0o().f6852OooO0Oo.isEmpty()) {
                    Object obj = this.f9761OooO0o0;
                    if (obj != null) {
                        int iOooO0o0 = oooo0OooOo0.OooO0o0(obj);
                        if (iOooO0o0 != -1) {
                            if (player.Oooo0oO() == oooo0OooOo0.OooOO0(iOooO0o0, oooO0O0, false).f6642OooO0o) {
                                return;
                            }
                        }
                        this.f9761OooO0o0 = null;
                    }
                } else {
                    this.f9761OooO0o0 = oooo0OooOo0.OooOO0(player.OooOooO(), oooO0O0, true).f6643OooO0o0;
                }
            }
            playerView.OooOO0o(false);
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onVideoSizeChanged(androidx.media3.common.o00Ooo o00ooo2) {
            PlayerView playerView;
            Player player;
            if (o00ooo2.equals(androidx.media3.common.o00Ooo.f6864OooO0oo) || (player = (playerView = PlayerView.this).f9746OooOOOo) == null || player.Oooo0o() == 1) {
                return;
            }
            playerView.OooO0oo();
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final /* synthetic */ void onVolumeChanged(float f) {
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onCues(o000O000.OooO0O0 oooO0O0) {
            SubtitleView subtitleView = PlayerView.this.f9740OooOO0;
            if (subtitleView != null) {
                subtitleView.setCues(oooO0O0.f33952OooO0Oo);
            }
        }

        @Override // androidx.media3.common.Player.OooO0OO
        public final void onPositionDiscontinuity(Player.OooO0o oooO0o, Player.OooO0o oooO0o2, int i) {
            PlayerControlView playerControlView;
            int i2 = PlayerView.f9733OooOoo;
            PlayerView playerView = PlayerView.this;
            if (playerView.OooO0O0() && playerView.f9755OooOoO && (playerControlView = playerView.f9744OooOOO0) != null) {
                playerControlView.OooO0oO();
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
    @UnstableApi
    public @interface ShowBuffering {
    }

    public PlayerView(Context context) {
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
        View view = this.f9741OooOO0O;
        if (view != null) {
            Player player = this.f9746OooOOOo;
            if (player == null || player.Oooo0o() != 2) {
                z = false;
            } else {
                int i = this.f9751OooOo0;
                z = true;
                if (i != 2 && (i != 1 || !this.f9746OooOOOo.OooOoOO())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final boolean OooO0O0() {
        Player player = this.f9746OooOOOo;
        return player != null && player.OooOOo0(16) && this.f9746OooOOOo.OooO0o() && this.f9746OooOOOo.OooOoOO();
    }

    public final void OooO0OO(boolean z) {
        if (!(OooO0O0() && this.f9755OooOoO) && OooOOO0()) {
            PlayerControlView playerControlView = this.f9744OooOOO0;
            boolean z2 = playerControlView.OooO0oo() && playerControlView.getShowTimeoutMs() <= 0;
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
                if (this.f9749OooOOoo == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f9737OooO0o0;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                ImageView imageView = this.f9734OooO;
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
            int i = z ? 0 : this.f9750OooOo;
            PlayerControlView playerControlView = this.f9744OooOOO0;
            playerControlView.setShowTimeoutMs(i);
            o0O0O00 o0o0o00 = playerControlView.f9646OooO0Oo;
            PlayerControlView playerControlView2 = o0o0o00.f9852OooO00o;
            if (!playerControlView2.OooO()) {
                playerControlView2.setVisibility(0);
                playerControlView2.OooOO0();
                View view = playerControlView2.f9658OooOOo;
                if (view != null) {
                    view.requestFocus();
                }
            }
            o0o0o00.OooOO0O();
        }
    }

    public final boolean OooO0o0() {
        Player player = this.f9746OooOOOo;
        if (player == null) {
            return true;
        }
        int iOooo0o = player.Oooo0o();
        if (this.f9756OooOoO0 && (!this.f9746OooOOOo.OooOOo0(17) || !this.f9746OooOOOo.OooOo0().OooOo00())) {
            if (iOooo0o == 1 || iOooo0o == 4) {
                return true;
            }
            Player player2 = this.f9746OooOOOo;
            player2.getClass();
            if (!player2.OooOoOO()) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0oO() {
        if (!OooOOO0() || this.f9746OooOOOo == null) {
            return;
        }
        PlayerControlView playerControlView = this.f9744OooOOO0;
        if (!playerControlView.OooO0oo()) {
            OooO0OO(true);
        } else if (this.f9757OooOoOO) {
            playerControlView.OooO0oO();
        }
    }

    public final void OooO0oo() {
        Player player = this.f9746OooOOOo;
        androidx.media3.common.o00Ooo o00oooOooo000 = player != null ? player.Oooo000() : androidx.media3.common.o00Ooo.f6864OooO0oo;
        int i = o00oooOooo000.f6869OooO0Oo;
        int i2 = o00oooOooo000.f6871OooO0o0;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * o00oooOooo000.f6872OooO0oO) / i2;
        View view = this.f9738OooO0oO;
        if (view instanceof TextureView) {
            int i3 = o00oooOooo000.f6870OooO0o;
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            int i4 = this.f9758OooOoo0;
            OooO00o oooO00o = this.f9735OooO0Oo;
            if (i4 != 0) {
                view.removeOnLayoutChangeListener(oooO00o);
            }
            this.f9758OooOoo0 = i3;
            if (i3 != 0) {
                view.addOnLayoutChangeListener(oooO00o);
            }
            OooO00o((TextureView) view, this.f9758OooOoo0);
        }
        float f2 = this.f9739OooO0oo ? 0.0f : f;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f9737OooO0o0;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    public final void OooOO0() {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        if (playerControlView == null || !this.f9748OooOOo0) {
            setContentDescription(null);
        } else if (playerControlView.OooO0oo()) {
            setContentDescription(this.f9757OooOoOO ? getResources().getString(o0000O00.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(o0000O00.exo_controls_show));
        }
    }

    public final void OooOO0O() {
        TextView textView = this.f9742OooOO0o;
        if (textView != null) {
            CharSequence charSequence = this.f9754OooOo0o;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                Player player = this.f9746OooOOOo;
                if (player != null) {
                    player.OooOO0O();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void OooOO0o(boolean z) {
        boolean z2;
        byte[] bArr;
        Player player = this.f9746OooOOOo;
        View view = this.f9736OooO0o;
        boolean zOooO0Oo = false;
        ImageView imageView = this.f9734OooO;
        if (player == null || !player.OooOOo0(30) || player.OooOO0o().f6852OooO0Oo.isEmpty()) {
            if (this.f9753OooOo0O) {
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
        if (z && !this.f9753OooOo0O && view != null) {
            view.setVisibility(0);
        }
        if (player.OooOO0o().OooO0Oo(2)) {
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
        if (this.f9749OooOOoo != 0) {
            p080o000OoO.o00Oo0.OooO0o(imageView);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (player.OooOOo0(18) && (bArr = player.OoooOOO().f6279OooOOO0) != null) {
                zOooO0Oo = OooO0Oo(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
            }
            if (zOooO0Oo || OooO0Oo(this.f9752OooOo00)) {
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
        if (!this.f9748OooOOo0) {
            return false;
        }
        p080o000OoO.o00Oo0.OooO0o(this.f9744OooOOO0);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.f9746OooOOOo;
        if (player != null && player.OooOOo0(16) && this.f9746OooOOOo.OooO0o()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.f9744OooOOO0;
        if (z && OooOOO0() && !playerControlView.OooO0oo()) {
            OooO0OO(true);
        } else {
            if (!(OooOOO0() && playerControlView.OooO0Oo(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
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
        FrameLayout frameLayout = this.f9745OooOOOO;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout));
        }
        PlayerControlView playerControlView = this.f9744OooOOO0;
        if (playerControlView != null) {
            arrayList.add(new AdOverlayInfo(playerControlView));
        }
        return ImmutableList.OooOO0O(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f9743OooOOO;
        p080o000OoO.o00Oo0.OooO0oO(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    @UnstableApi
    public int getArtworkDisplayMode() {
        return this.f9749OooOOoo;
    }

    @UnstableApi
    public boolean getControllerAutoShow() {
        return this.f9756OooOoO0;
    }

    @UnstableApi
    public boolean getControllerHideOnTouch() {
        return this.f9757OooOoOO;
    }

    @UnstableApi
    public int getControllerShowTimeoutMs() {
        return this.f9750OooOo;
    }

    @Nullable
    @UnstableApi
    public Drawable getDefaultArtwork() {
        return this.f9752OooOo00;
    }

    @Nullable
    @UnstableApi
    public FrameLayout getOverlayFrameLayout() {
        return this.f9745OooOOOO;
    }

    @Nullable
    public Player getPlayer() {
        return this.f9746OooOOOo;
    }

    @UnstableApi
    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f9737OooO0o0;
        p080o000OoO.o00Oo0.OooO0o(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    @UnstableApi
    public SubtitleView getSubtitleView() {
        return this.f9740OooOO0;
    }

    @UnstableApi
    @Deprecated
    public boolean getUseArtwork() {
        return this.f9749OooOOoo != 0;
    }

    public boolean getUseController() {
        return this.f9748OooOOo0;
    }

    @Nullable
    @UnstableApi
    public View getVideoSurfaceView() {
        return this.f9738OooO0oO;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!OooOOO0() || this.f9746OooOOOo == null) {
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

    @UnstableApi
    public void setArtworkDisplayMode(int i) {
        p080o000OoO.o00Oo0.OooO0Oo(i == 0 || this.f9734OooO != null);
        if (this.f9749OooOOoo != i) {
            this.f9749OooOOoo = i;
            OooOO0o(false);
        }
    }

    @UnstableApi
    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.OooO00o oooO00o) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f9737OooO0o0;
        p080o000OoO.o00Oo0.OooO0o(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(oooO00o);
    }

    @UnstableApi
    public void setControllerAutoShow(boolean z) {
        this.f9756OooOoO0 = z;
    }

    @UnstableApi
    public void setControllerHideDuringAds(boolean z) {
        this.f9755OooOoO = z;
    }

    @UnstableApi
    public void setControllerHideOnTouch(boolean z) {
        p080o000OoO.o00Oo0.OooO0o(this.f9744OooOOO0);
        this.f9757OooOoOO = z;
        OooOO0();
    }

    @UnstableApi
    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable PlayerControlView.OooO0OO oooO0OO) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setOnFullScreenModeChangedListener(oooO0OO);
    }

    @UnstableApi
    public void setControllerShowTimeoutMs(int i) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        this.f9750OooOo = i;
        if (playerControlView.OooO0oo()) {
            OooO0o(OooO0o0());
        }
    }

    public void setControllerVisibilityListener(@Nullable OooO0O0 oooO0O0) {
        if (oooO0O0 != null) {
            setControllerVisibilityListener((PlayerControlView.OooOOOO) null);
        }
    }

    @UnstableApi
    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        p080o000OoO.o00Oo0.OooO0Oo(this.f9742OooOO0o != null);
        this.f9754OooOo0o = charSequence;
        OooOO0O();
    }

    @UnstableApi
    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f9752OooOo00 != drawable) {
            this.f9752OooOo00 = drawable;
            OooOO0o(false);
        }
    }

    public void setErrorMessageProvider(@Nullable p069o0000ooO.o0000Ooo<? super PlaybackException> o0000ooo) {
        if (o0000ooo != null) {
            OooOO0O();
        }
    }

    public void setFullscreenButtonClickListener(@Nullable OooO0OO oooO0OO) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setOnFullScreenModeChangedListener(this.f9735OooO0Oo);
    }

    @UnstableApi
    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f9753OooOo0O != z) {
            this.f9753OooOo0O = z;
            OooOO0o(false);
        }
    }

    public void setPlayer(@Nullable Player player) {
        p080o000OoO.o00Oo0.OooO0Oo(Looper.myLooper() == Looper.getMainLooper());
        p080o000OoO.o00Oo0.OooO00o(player == null || player.OooOo0O() == Looper.getMainLooper());
        Player player2 = this.f9746OooOOOo;
        if (player2 == player) {
            return;
        }
        View view = this.f9738OooO0oO;
        OooO00o oooO00o = this.f9735OooO0Oo;
        if (player2 != null) {
            player2.OooOOOO(oooO00o);
            if (player2.OooOOo0(27)) {
                if (view instanceof TextureView) {
                    player2.OooOooo((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    player2.OoooO00((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f9740OooOO0;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f9746OooOOOo = player;
        boolean zOooOOO0 = OooOOO0();
        PlayerControlView playerControlView = this.f9744OooOOO0;
        if (zOooOOO0) {
            playerControlView.setPlayer(player);
        }
        OooO();
        OooOO0O();
        OooOO0o(true);
        if (player == null) {
            if (playerControlView != null) {
                playerControlView.OooO0oO();
                return;
            }
            return;
        }
        if (player.OooOOo0(27)) {
            if (view instanceof TextureView) {
                player.OooOoO0((TextureView) view);
            } else if (view instanceof SurfaceView) {
                player.OooO((SurfaceView) view);
            }
            if (!player.OooOOo0(30) || player.OooOO0o().OooO0o0()) {
                OooO0oo();
            }
        }
        if (subtitleView != null && player.OooOOo0(28)) {
            subtitleView.setCues(player.OooOOO().f33952OooO0Oo);
        }
        player.OooOOoo(oooO00o);
        OooO0OO(false);
    }

    @UnstableApi
    public void setRepeatToggleModes(int i) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setRepeatToggleModes(i);
    }

    @UnstableApi
    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f9737OooO0o0;
        p080o000OoO.o00Oo0.OooO0o(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    @UnstableApi
    public void setShowBuffering(int i) {
        if (this.f9751OooOo0 != i) {
            this.f9751OooOo0 = i;
            OooO();
        }
    }

    @UnstableApi
    public void setShowFastForwardButton(boolean z) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setShowFastForwardButton(z);
    }

    @UnstableApi
    public void setShowMultiWindowTimeBar(boolean z) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z);
    }

    @UnstableApi
    public void setShowNextButton(boolean z) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setShowNextButton(z);
    }

    @UnstableApi
    public void setShowPreviousButton(boolean z) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setShowPreviousButton(z);
    }

    @UnstableApi
    public void setShowRewindButton(boolean z) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setShowRewindButton(z);
    }

    @UnstableApi
    public void setShowShuffleButton(boolean z) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setShowShuffleButton(z);
    }

    @UnstableApi
    public void setShowSubtitleButton(boolean z) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setShowSubtitleButton(z);
    }

    @UnstableApi
    public void setShowVrButton(boolean z) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        playerControlView.setShowVrButton(z);
    }

    @UnstableApi
    public void setShutterBackgroundColor(@ColorInt int i) {
        View view = this.f9736OooO0o;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @UnstableApi
    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0Oo((z && playerControlView == null) ? false : true);
        setClickable(z || hasOnClickListeners());
        if (this.f9748OooOOo0 == z) {
            return;
        }
        this.f9748OooOOo0 = z;
        if (OooOOO0()) {
            playerControlView.setPlayer(this.f9746OooOOOo);
        } else if (playerControlView != null) {
            playerControlView.OooO0oO();
            playerControlView.setPlayer(null);
        }
        OooOO0();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f9738OooO0oO;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @UnstableApi
    @Deprecated
    public void setControllerVisibilityListener(@Nullable PlayerControlView.OooOOOO oooOOOO) {
        PlayerControlView playerControlView = this.f9744OooOOO0;
        p080o000OoO.o00Oo0.OooO0o(playerControlView);
        PlayerControlView.OooOOOO oooOOOO2 = this.f9747OooOOo;
        if (oooOOOO2 == oooOOOO) {
            return;
        }
        CopyOnWriteArrayList<PlayerControlView.OooOOOO> copyOnWriteArrayList = playerControlView.f9649OooO0oO;
        if (oooOOOO2 != null) {
            copyOnWriteArrayList.remove(oooOOOO2);
        }
        this.f9747OooOOo = oooOOOO;
        if (oooOOOO != null) {
            copyOnWriteArrayList.add(oooOOOO);
            setControllerVisibilityListener((OooO0O0) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, @Nullable AttributeSet attributeSet, int i) {
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
        this.f9735OooO0Oo = oooO00o;
        if (isInEditMode()) {
            this.f9737OooO0o0 = null;
            this.f9736OooO0o = null;
            this.f9738OooO0oO = null;
            this.f9739OooO0oo = false;
            this.f9734OooO = null;
            this.f9740OooOO0 = null;
            this.f9741OooOO0O = null;
            this.f9742OooOO0o = null;
            this.f9744OooOOO0 = null;
            this.f9743OooOOO = null;
            this.f9745OooOOOO = null;
            ImageView imageView = new ImageView(context);
            if (o00.f34910OooO00o >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(o00.OooOOo0(context, resources, o00000.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources.getColor(o000000.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(o00.OooOOo0(context, resources2, o00000.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(o000000.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i10 = o0000Ooo.exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o0000O0.PlayerView, i, 0);
            try {
                int i11 = o0000O0.PlayerView_shutter_background_color;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
                int color = typedArrayObtainStyledAttributes.getColor(i11, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(o0000O0.PlayerView_player_layout_id, i10);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerView_use_artwork, true);
                int i12 = typedArrayObtainStyledAttributes.getInt(o0000O0.PlayerView_artwork_display_mode, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(o0000O0.PlayerView_default_artwork, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerView_use_controller, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(o0000O0.PlayerView_surface_type, 1);
                int i14 = typedArrayObtainStyledAttributes.getInt(o0000O0.PlayerView_resize_mode, 0);
                int i15 = typedArrayObtainStyledAttributes.getInt(o0000O0.PlayerView_show_timeout, 5000);
                z2 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerView_hide_on_touch, true);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerView_auto_show, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(o0000O0.PlayerView_show_buffering, 0);
                this.f9753OooOo0O = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerView_keep_content_on_player_reset, this.f9753OooOo0O);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(o0000O0.PlayerView_hide_during_ads, true);
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
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(o00000O.exo_content_frame);
        this.f9737OooO0o0 = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i5);
        }
        View viewFindViewById = findViewById(o00000O.exo_shutter);
        this.f9736OooO0o = viewFindViewById;
        if (viewFindViewById != null && z3) {
            viewFindViewById.setBackgroundColor(i7);
        }
        if (aspectRatioFrameLayout != null && i3 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                this.f9738OooO0oO = new TextureView(context);
            } else {
                if (i3 == 3) {
                    try {
                        int i16 = SphericalGLSurfaceView.f8332OooOOOO;
                        this.f9738OooO0oO = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i3 != 4) {
                    this.f9738OooO0oO = new SurfaceView(context);
                } else {
                    try {
                        int i17 = VideoDecoderGLSurfaceView.f8281OooO0o0;
                        this.f9738OooO0oO = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                this.f9738OooO0oO.setLayoutParams(layoutParams);
                this.f9738OooO0oO.setOnClickListener(oooO00o);
                this.f9738OooO0oO.setClickable(false);
                aspectRatioFrameLayout.addView(this.f9738OooO0oO, 0);
            }
            z7 = false;
            this.f9738OooO0oO.setLayoutParams(layoutParams);
            this.f9738OooO0oO.setOnClickListener(oooO00o);
            this.f9738OooO0oO.setClickable(false);
            aspectRatioFrameLayout.addView(this.f9738OooO0oO, 0);
        } else {
            this.f9738OooO0oO = null;
            z7 = false;
        }
        this.f9739OooO0oo = z7;
        this.f9743OooOOO = (FrameLayout) findViewById(o00000O.exo_ad_overlay);
        this.f9745OooOOOO = (FrameLayout) findViewById(o00000O.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(o00000O.exo_artwork);
        this.f9734OooO = imageView2;
        this.f9749OooOOoo = z4 && i8 != 0 && imageView2 != null ? i8 : 0;
        if (i6 != 0) {
            Context context2 = getContext();
            Object obj = ContextCompat.f5281OooO00o;
            this.f9752OooOo00 = ContextCompat.OooO0OO.OooO0O0(context2, i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(o00000O.exo_subtitles);
        this.f9740OooOO0 = subtitleView;
        if (subtitleView != null) {
            subtitleView.OooO00o();
            subtitleView.OooO0O0();
        }
        View viewFindViewById2 = findViewById(o00000O.exo_buffering);
        this.f9741OooOO0O = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f9751OooOo0 = i4;
        TextView textView = (TextView) findViewById(o00000O.exo_error_message);
        this.f9742OooOO0o = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i18 = o00000O.exo_controller;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i18);
        View viewFindViewById3 = findViewById(o00000O.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f9744OooOOO0 = playerControlView;
            i9 = 0;
        } else if (viewFindViewById3 != null) {
            i9 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f9744OooOOO0 = playerControlView2;
            playerControlView2.setId(i18);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i9 = 0;
            this.f9744OooOOO0 = null;
        }
        PlayerControlView playerControlView3 = this.f9744OooOOO0;
        this.f9750OooOo = playerControlView3 != null ? i2 : i9;
        this.f9757OooOoOO = z2;
        this.f9756OooOoO0 = z;
        this.f9755OooOoO = z6;
        this.f9748OooOOo0 = (!z5 || playerControlView3 == null) ? i9 : 1;
        if (playerControlView3 != null) {
            o0O0O00 o0o0o00 = playerControlView3.f9646OooO0Oo;
            int i19 = o0o0o00.f9875OooOoO;
            if (i19 != 3 && i19 != 2) {
                o0o0o00.OooO0o();
                o0o0o00.OooO(2);
            }
            this.f9744OooOOO0.f9649OooO0oO.add(oooO00o);
        }
        if (z5) {
            setClickable(true);
        }
        OooOO0();
    }
}
