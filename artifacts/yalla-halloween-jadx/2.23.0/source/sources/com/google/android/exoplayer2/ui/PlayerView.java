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
import java.util.Iterator;
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
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ int f13853OooOoo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final ImageView f13854OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f13855OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final View f13856OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final AspectRatioFrameLayout f13857OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final View f13858OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f13859OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final SubtitleView f13860OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final View f13861OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final TextView f13862OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final FrameLayout f13863OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final PlayerControlView f13864OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final FrameLayout f13865OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Player f13866OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public PlayerControlView.OooO0o f13867OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f13868OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f13869OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f13870OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f13871OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public Drawable f13872OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f13873OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public CharSequence f13874OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f13875OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f13876OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f13877OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f13878OooOoo0;

    public final class OooO00o implements Player.OooO0OO, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final com.google.android.exoplayer2.oo0o0Oo.OooO0O0 f13879OooO0Oo = new com.google.android.exoplayer2.oo0o0Oo.OooO0O0();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public Object f13881OooO0o0;

        public OooO00o() {
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.OooO0o
        public final void OooO00o(int i) {
            int i2 = PlayerView.f13853OooOoo;
            PlayerView.this.OooOO0();
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.OooO00o oooO00o) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onAvailableCommandsChanged(Player.OooO00o oooO00o) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = PlayerView.f13853OooOoo;
            PlayerView.this.OooO0oO();
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
            PlayerView.OooO00o((TextureView) view, PlayerView.this.f13878OooOoo0);
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
            int i2 = PlayerView.f13853OooOoo;
            PlayerView playerView = PlayerView.this;
            playerView.OooO();
            if (!playerView.OooO0O0() || !playerView.f13875OooOoO) {
                playerView.OooO0OO(false);
                return;
            }
            PlayerControlView playerControlView = playerView.f13864OooOOO0;
            if (playerControlView != null) {
                playerControlView.OooO0O0();
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.o00Ooo o00ooo2) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onPlaybackStateChanged(int i) {
            int i2 = PlayerView.f13853OooOoo;
            PlayerView playerView = PlayerView.this;
            playerView.OooO();
            playerView.OooOO0O();
            if (!playerView.OooO0O0() || !playerView.f13875OooOoO) {
                playerView.OooO0OO(false);
                return;
            }
            PlayerControlView playerControlView = playerView.f13864OooOOO0;
            if (playerControlView != null) {
                playerControlView.OooO0O0();
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
            View view = PlayerView.this.f13856OooO0o;
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
            PlayerView playerView = PlayerView.this;
            Player player = playerView.f13866OooOOOo;
            player.getClass();
            com.google.android.exoplayer2.oo0o0Oo oo0o0ooOooOO0 = player.OooOO0();
            if (oo0o0ooOooOO0.OooOOo0()) {
                this.f13881OooO0o0 = null;
            } else {
                boolean zIsEmpty = player.OooO0oo().f12832OooO0Oo.isEmpty();
                com.google.android.exoplayer2.oo0o0Oo.OooO0O0 oooO0O0 = this.f13879OooO0Oo;
                if (zIsEmpty) {
                    Object obj = this.f13881OooO0o0;
                    if (obj != null) {
                        int iOooO0O0 = oo0o0ooOooOO0.OooO0O0(obj);
                        if (iOooO0O0 != -1) {
                            if (player.OooOo00() == oo0o0ooOooOO0.OooO0oO(iOooO0O0, oooO0O0, false).f12906OooO0o) {
                                return;
                            }
                        }
                        this.f13881OooO0o0 = null;
                    }
                } else {
                    this.f13881OooO0o0 = oo0o0ooOooOO0.OooO0oO(player.OoooO(), oooO0O0, true).f12907OooO0o0;
                }
            }
            playerView.OooOO0o(false);
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onVideoSizeChanged(o0oOOo o0oooo) {
            int i = PlayerView.f13853OooOoo;
            PlayerView.this.OooO0oo();
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final /* synthetic */ void onVolumeChanged(float f) {
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onCues(p230o00oOoO0.o0000O0O o0000o0o2) {
            SubtitleView subtitleView = PlayerView.this.f13860OooOO0;
            if (subtitleView != null) {
                subtitleView.setCues(o0000o0o2.f40114OooO0Oo);
            }
        }

        @Override // com.google.android.exoplayer2.Player.OooO0OO
        public final void onPositionDiscontinuity(Player.OooO0o oooO0o, Player.OooO0o oooO0o2, int i) {
            PlayerControlView playerControlView;
            int i2 = PlayerView.f13853OooOoo;
            PlayerView playerView = PlayerView.this;
            if (playerView.OooO0O0() && playerView.f13875OooOoO && (playerControlView = playerView.f13864OooOOO0) != null) {
                playerControlView.OooO0O0();
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
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
        View view = this.f13861OooOO0O;
        if (view != null) {
            Player player = this.f13866OooOOOo;
            if (player == null || player.OooOOoo() != 2) {
                z = false;
            } else {
                int i = this.f13871OooOo0;
                z = true;
                if (i != 2 && (i != 1 || !this.f13866OooOOOo.OooOOO())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final boolean OooO0O0() {
        Player player = this.f13866OooOOOo;
        return player != null && player.OooO0Oo() && this.f13866OooOOOo.OooOOO();
    }

    public final void OooO0OO(boolean z) {
        if (!(OooO0O0() && this.f13875OooOoO) && OooOOO0()) {
            PlayerControlView playerControlView = this.f13864OooOOO0;
            boolean z2 = playerControlView.OooO0Oo() && playerControlView.getShowTimeoutMs() <= 0;
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
                float f = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f13857OooO0o0;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                ImageView imageView = this.f13854OooO;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final void OooO0o(boolean z) {
        if (OooOOO0()) {
            int i = z ? 0 : this.f13870OooOo;
            PlayerControlView playerControlView = this.f13864OooOOO0;
            playerControlView.setShowTimeoutMs(i);
            if (!playerControlView.OooO0Oo()) {
                playerControlView.setVisibility(0);
                Iterator<PlayerControlView.OooO0o> it = playerControlView.f13803OooO0o0.iterator();
                while (it.hasNext()) {
                    it.next().OooO00o(playerControlView.getVisibility());
                }
                playerControlView.OooO0oO();
                playerControlView.OooO0o();
                playerControlView.OooO();
                playerControlView.OooOO0();
                playerControlView.OooOO0O();
                boolean zOoooO00 = o0O00.OoooO00(playerControlView.f13833Oooo0O0);
                View view = playerControlView.f13800OooO;
                View view2 = playerControlView.f13805OooO0oo;
                if (zOoooO00 && view2 != null) {
                    view2.requestFocus();
                } else if (!zOoooO00 && view != null) {
                    view.requestFocus();
                }
                boolean zOoooO01 = o0O00.OoooO00(playerControlView.f13833Oooo0O0);
                if (zOoooO01 && view2 != null) {
                    view2.sendAccessibilityEvent(8);
                } else if (!zOoooO01 && view != null) {
                    view.sendAccessibilityEvent(8);
                }
            }
            playerControlView.OooO0OO();
        }
    }

    public final boolean OooO0o0() {
        Player player = this.f13866OooOOOo;
        if (player == null) {
            return true;
        }
        int iOooOOoo = player.OooOOoo();
        return this.f13876OooOoO0 && (iOooOOoo == 1 || iOooOOoo == 4 || !this.f13866OooOOOo.OooOOO());
    }

    public final void OooO0oO() {
        if (!OooOOO0() || this.f13866OooOOOo == null) {
            return;
        }
        PlayerControlView playerControlView = this.f13864OooOOO0;
        if (!playerControlView.OooO0Oo()) {
            OooO0OO(true);
        } else if (this.f13877OooOoOO) {
            playerControlView.OooO0O0();
        }
    }

    public final void OooO0oo() {
        Player player = this.f13866OooOOOo;
        o0oOOo o0ooooO000oOoO = player != null ? player.o000oOoO() : o0oOOo.f40860OooO0oo;
        int i = o0ooooO000oOoO.f40864OooO0Oo;
        int i2 = o0ooooO000oOoO.f40866OooO0o0;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * o0ooooO000oOoO.f40867OooO0oO) / i2;
        View view = this.f13858OooO0oO;
        if (view instanceof TextureView) {
            int i3 = o0ooooO000oOoO.f40865OooO0o;
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            int i4 = this.f13878OooOoo0;
            OooO00o oooO00o = this.f13855OooO0Oo;
            if (i4 != 0) {
                view.removeOnLayoutChangeListener(oooO00o);
            }
            this.f13878OooOoo0 = i3;
            if (i3 != 0) {
                view.addOnLayoutChangeListener(oooO00o);
            }
            OooO00o((TextureView) view, this.f13878OooOoo0);
        }
        float f2 = this.f13859OooO0oo ? 0.0f : f;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13857OooO0o0;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    public final void OooOO0() {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        if (playerControlView == null || !this.f13868OooOOo0) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.f13877OooOoOO ? getResources().getString(Oooo0.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(Oooo0.exo_controls_show));
        }
    }

    public final void OooOO0O() {
        TextView textView = this.f13862OooOO0o;
        if (textView != null) {
            CharSequence charSequence = this.f13874OooOo0o;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                Player player = this.f13866OooOOOo;
                if (player != null) {
                    player.OooooOo();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void OooOO0o(boolean z) {
        boolean z2;
        Player player = this.f13866OooOOOo;
        View view = this.f13856OooO0o;
        boolean zOooO0Oo = false;
        ImageView imageView = this.f13854OooO;
        if (player == null || !player.Oooo0O0(30) || player.OooO0oo().f12832OooO0Oo.isEmpty()) {
            if (this.f13873OooOo0O) {
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
        if (z && !this.f13873OooOo0O && view != null) {
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
        if (this.f13869OooOOoo) {
            o00O000o.OooO0o0(imageView);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            byte[] bArr = player.Ooooooo().f10973OooOOO0;
            if (bArr != null) {
                zOooO0Oo = OooO0Oo(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
            }
            if (zOooO0Oo || OooO0Oo(this.f13872OooOo00)) {
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
        if (!this.f13868OooOOo0) {
            return false;
        }
        o00O000o.OooO0o0(this.f13864OooOOO0);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.f13866OooOOOo;
        if (player != null && player.OooO0Oo()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.f13864OooOOO0;
        if (z && OooOOO0() && !playerControlView.OooO0Oo()) {
            OooO0OO(true);
        } else {
            if (!(OooOOO0() && playerControlView.OooO00o(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
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
        FrameLayout frameLayout = this.f13865OooOOOO;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout));
        }
        PlayerControlView playerControlView = this.f13864OooOOO0;
        if (playerControlView != null) {
            arrayList.add(new AdOverlayInfo(playerControlView));
        }
        return ImmutableList.OooOO0O(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f13863OooOOO;
        o00O000o.OooO0o(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.f13876OooOoO0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f13877OooOoOO;
    }

    public int getControllerShowTimeoutMs() {
        return this.f13870OooOo;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f13872OooOo00;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f13865OooOOOO;
    }

    @Nullable
    public Player getPlayer() {
        return this.f13866OooOOOo;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13857OooO0o0;
        o00O000o.OooO0o0(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f13860OooOO0;
    }

    public boolean getUseArtwork() {
        return this.f13869OooOOoo;
    }

    public boolean getUseController() {
        return this.f13868OooOOo0;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f13858OooO0oO;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!OooOOO0() || this.f13866OooOOOo == null) {
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

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.OooO00o oooO00o) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13857OooO0o0;
        o00O000o.OooO0o0(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(oooO00o);
    }

    public void setControllerAutoShow(boolean z) {
        this.f13876OooOoO0 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f13875OooOoO = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        o00O000o.OooO0o0(this.f13864OooOOO0);
        this.f13877OooOoOO = z;
        OooOO0();
    }

    public void setControllerShowTimeoutMs(int i) {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        o00O000o.OooO0o0(playerControlView);
        this.f13870OooOo = i;
        if (playerControlView.OooO0Oo()) {
            OooO0o(OooO0o0());
        }
    }

    public void setControllerVisibilityListener(@Nullable PlayerControlView.OooO0o oooO0o) {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        o00O000o.OooO0o0(playerControlView);
        PlayerControlView.OooO0o oooO0o2 = this.f13867OooOOo;
        if (oooO0o2 == oooO0o) {
            return;
        }
        CopyOnWriteArrayList<PlayerControlView.OooO0o> copyOnWriteArrayList = playerControlView.f13803OooO0o0;
        if (oooO0o2 != null) {
            copyOnWriteArrayList.remove(oooO0o2);
        }
        this.f13867OooOOo = oooO0o;
        if (oooO0o != null) {
            copyOnWriteArrayList.add(oooO0o);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        o00O000o.OooO0Oo(this.f13862OooOO0o != null);
        this.f13874OooOo0o = charSequence;
        OooOO0O();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f13872OooOo00 != drawable) {
            this.f13872OooOo00 = drawable;
            OooOO0o(false);
        }
    }

    public void setErrorMessageProvider(@Nullable oo0o0O0<? super PlaybackException> oo0o0o0) {
        if (oo0o0o0 != null) {
            OooOO0O();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f13873OooOo0O != z) {
            this.f13873OooOo0O = z;
            OooOO0o(false);
        }
    }

    public void setPlayer(@Nullable Player player) {
        o00O000o.OooO0Oo(Looper.myLooper() == Looper.getMainLooper());
        o00O000o.OooO00o(player == null || player.OooOO0O() == Looper.getMainLooper());
        Player player2 = this.f13866OooOOOo;
        if (player2 == player) {
            return;
        }
        View view = this.f13858OooO0oO;
        OooO00o oooO00o = this.f13855OooO0Oo;
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
        SubtitleView subtitleView = this.f13860OooOO0;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f13866OooOOOo = player;
        boolean zOooOOO0 = OooOOO0();
        PlayerControlView playerControlView = this.f13864OooOOO0;
        if (zOooOOO0) {
            playerControlView.setPlayer(player);
        }
        OooO();
        OooOO0O();
        OooOO0o(true);
        if (player == null) {
            if (playerControlView != null) {
                playerControlView.OooO0O0();
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
            OooO0oo();
        }
        if (subtitleView != null && player.Oooo0O0(28)) {
            subtitleView.setCues(player.OooO().f40114OooO0Oo);
        }
        player.Ooooo00(oooO00o);
        OooO0OO(false);
    }

    public void setRepeatToggleModes(int i) {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        o00O000o.OooO0o0(playerControlView);
        playerControlView.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13857OooO0o0;
        o00O000o.OooO0o0(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f13871OooOo0 != i) {
            this.f13871OooOo0 = i;
            OooO();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        o00O000o.OooO0o0(playerControlView);
        playerControlView.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        o00O000o.OooO0o0(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        o00O000o.OooO0o0(playerControlView);
        playerControlView.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        o00O000o.OooO0o0(playerControlView);
        playerControlView.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        o00O000o.OooO0o0(playerControlView);
        playerControlView.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        o00O000o.OooO0o0(playerControlView);
        playerControlView.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f13856OooO0o;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        o00O000o.OooO0Oo((z && this.f13854OooO == null) ? false : true);
        if (this.f13869OooOOoo != z) {
            this.f13869OooOOoo = z;
            OooOO0o(false);
        }
    }

    public void setUseController(boolean z) {
        PlayerControlView playerControlView = this.f13864OooOOO0;
        o00O000o.OooO0Oo((z && playerControlView == null) ? false : true);
        setClickable(z || hasOnClickListeners());
        if (this.f13868OooOOo0 == z) {
            return;
        }
        this.f13868OooOOo0 = z;
        if (OooOOO0()) {
            playerControlView.setPlayer(this.f13866OooOOOo);
        } else if (playerControlView != null) {
            playerControlView.OooO0O0();
            playerControlView.setPlayer(null);
        }
        OooOO0();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f13858OooO0oO;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        int i3;
        int integer;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        boolean z6;
        boolean z7;
        int i7;
        boolean z8;
        super(context, attributeSet, i);
        OooO00o oooO00o = new OooO00o();
        this.f13855OooO0Oo = oooO00o;
        if (isInEditMode()) {
            this.f13857OooO0o0 = null;
            this.f13856OooO0o = null;
            this.f13858OooO0oO = null;
            this.f13859OooO0oo = false;
            this.f13854OooO = null;
            this.f13860OooOO0 = null;
            this.f13861OooOO0O = null;
            this.f13862OooOO0o = null;
            this.f13864OooOOO0 = null;
            this.f13863OooOOO = null;
            this.f13865OooOOOO = null;
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
        int i8 = OooOo.exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o0OoOo0.PlayerView, i, 0);
            try {
                int i9 = o0OoOo0.PlayerView_shutter_background_color;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i9);
                int color = typedArrayObtainStyledAttributes.getColor(i9, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(o0OoOo0.PlayerView_player_layout_id, i8);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerView_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(o0OoOo0.PlayerView_default_artwork, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerView_use_controller, true);
                int i10 = typedArrayObtainStyledAttributes.getInt(o0OoOo0.PlayerView_surface_type, 1);
                int i11 = typedArrayObtainStyledAttributes.getInt(o0OoOo0.PlayerView_resize_mode, 0);
                int i12 = typedArrayObtainStyledAttributes.getInt(o0OoOo0.PlayerView_show_timeout, 5000);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerView_hide_on_touch, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerView_auto_show, true);
                integer = typedArrayObtainStyledAttributes.getInteger(o0OoOo0.PlayerView_show_buffering, 0);
                this.f13873OooOo0O = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerView_keep_content_on_player_reset, this.f13873OooOo0O);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(o0OoOo0.PlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z3 = z11;
                z = z12;
                i3 = i11;
                z6 = z10;
                i6 = resourceId2;
                z5 = z9;
                z4 = zHasValue;
                i5 = color;
                i4 = i10;
                i8 = resourceId;
                i2 = i12;
                z2 = z13;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = true;
            i3 = 0;
            integer = 0;
            z2 = true;
            z3 = true;
            i4 = 1;
            i5 = 0;
            z4 = false;
            z5 = true;
            i6 = 0;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(OooOOOO.exo_content_frame);
        this.f13857OooO0o0 = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i3);
        }
        View viewFindViewById = findViewById(OooOOOO.exo_shutter);
        this.f13856OooO0o = viewFindViewById;
        if (viewFindViewById != null && z4) {
            viewFindViewById.setBackgroundColor(i5);
        }
        if (aspectRatioFrameLayout != null && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 == 2) {
                this.f13858OooO0oO = new TextureView(context);
            } else {
                if (i4 == 3) {
                    try {
                        int i13 = SphericalGLSurfaceView.f14387OooOOOO;
                        this.f13858OooO0oO = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                        z8 = true;
                    } catch (Exception e) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i4 != 4) {
                    this.f13858OooO0oO = new SurfaceView(context);
                } else {
                    try {
                        int i14 = VideoDecoderGLSurfaceView.f14336OooO0o0;
                        this.f13858OooO0oO = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                }
                this.f13858OooO0oO.setLayoutParams(layoutParams);
                this.f13858OooO0oO.setOnClickListener(oooO00o);
                this.f13858OooO0oO.setClickable(false);
                aspectRatioFrameLayout.addView(this.f13858OooO0oO, 0);
                z7 = z8;
            }
            z8 = false;
            this.f13858OooO0oO.setLayoutParams(layoutParams);
            this.f13858OooO0oO.setOnClickListener(oooO00o);
            this.f13858OooO0oO.setClickable(false);
            aspectRatioFrameLayout.addView(this.f13858OooO0oO, 0);
            z7 = z8;
        } else {
            this.f13858OooO0oO = null;
            z7 = false;
        }
        this.f13859OooO0oo = z7;
        this.f13863OooOOO = (FrameLayout) findViewById(OooOOOO.exo_ad_overlay);
        this.f13865OooOOOO = (FrameLayout) findViewById(OooOOOO.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(OooOOOO.exo_artwork);
        this.f13854OooO = imageView2;
        this.f13869OooOOoo = z5 && imageView2 != null;
        if (i6 != 0) {
            Context context2 = getContext();
            Object obj = ContextCompat.f5271OooO00o;
            this.f13872OooOo00 = ContextCompat.OooO0OO.OooO0O0(context2, i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(OooOOOO.exo_subtitles);
        this.f13860OooOO0 = subtitleView;
        if (subtitleView != null) {
            subtitleView.OooO00o();
            subtitleView.OooO0O0();
        }
        View viewFindViewById2 = findViewById(OooOOOO.exo_buffering);
        this.f13861OooOO0O = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f13871OooOo0 = integer;
        TextView textView = (TextView) findViewById(OooOOOO.exo_error_message);
        this.f13862OooOO0o = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i15 = OooOOOO.exo_controller;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i15);
        View viewFindViewById3 = findViewById(OooOOOO.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f13864OooOOO0 = playerControlView;
            i7 = 0;
        } else if (viewFindViewById3 != null) {
            i7 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f13864OooOOO0 = playerControlView2;
            playerControlView2.setId(i15);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i7 = 0;
            this.f13864OooOOO0 = null;
        }
        PlayerControlView playerControlView3 = this.f13864OooOOO0;
        this.f13870OooOo = playerControlView3 != null ? i2 : i7;
        this.f13877OooOoOO = z3;
        this.f13876OooOoO0 = z;
        this.f13875OooOoO = z2;
        this.f13868OooOOo0 = (!z6 || playerControlView3 == null) ? i7 : 1;
        if (playerControlView3 != null) {
            playerControlView3.OooO0O0();
            this.f13864OooOOO0.f13803OooO0o0.add(oooO00o);
        }
        if (z6) {
            setClickable(true);
        }
        OooOO0();
    }
}
