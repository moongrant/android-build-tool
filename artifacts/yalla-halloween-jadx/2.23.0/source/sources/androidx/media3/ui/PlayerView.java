package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
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
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f6655OooOoO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final SubtitleView f6656OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f6657OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final View f6658OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final AspectRatioFrameLayout f6659OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final View f6660OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final ImageView f6661OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final View f6662OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final TextView f6663OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final PlayerControlView f6664OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final FrameLayout f6665OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final FrameLayout f6666OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f6667OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public PlayerControlView.OooOOOO f6668OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Drawable f6669OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f6670OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f6671OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f6672OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public CharSequence f6673OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f6674OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f6675OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f6676OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f6677OooOoO0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface ArtworkDisplayMode {
    }

    public final class OooO00o implements View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.OooOOOO, PlayerControlView.OooO0OO {
        public OooO00o() {
            new androidx.media3.common.OooO0OO.OooO0O0();
        }

        @Override // androidx.media3.ui.PlayerControlView.OooOOOO
        public final void OooO00o(int i) {
            int i2 = PlayerView.f6655OooOoO;
            PlayerView playerView = PlayerView.this;
            playerView.OooO0o();
            playerView.getClass();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = PlayerView.f6655OooOoO;
            PlayerView.this.OooO0Oo();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            TextureView textureView = (TextureView) view;
            PlayerView.this.getClass();
            Matrix matrix = new Matrix();
            float width = textureView.getWidth();
            float height = textureView.getHeight();
            if (width != 0.0f) {
                int i9 = (height > 0.0f ? 1 : (height == 0.0f ? 0 : -1));
            }
            textureView.setTransform(matrix);
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

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    public final boolean OooO() {
        if (!this.f6667OooOOOO) {
            return false;
        }
        o000O000.OooO00o.OooO0OO(this.f6664OooOO0o);
        return true;
    }

    public final void OooO00o(boolean z) {
        if (OooO()) {
            PlayerControlView playerControlView = this.f6664OooOO0o;
            boolean z2 = playerControlView.OooO0oO() && playerControlView.getShowTimeoutMs() <= 0;
            boolean zOooO0O0 = OooO0O0();
            if (z || z2 || zOooO0O0) {
                OooO0OO(zOooO0O0);
            }
        }
    }

    public final boolean OooO0O0() {
        return true;
    }

    public final void OooO0OO(boolean z) {
        if (OooO()) {
            int i = z ? 0 : this.f6675OooOo0O;
            PlayerControlView playerControlView = this.f6664OooOO0o;
            playerControlView.setShowTimeoutMs(i);
            oo0o0Oo oo0o0oo = playerControlView.f6579OooO0Oo;
            PlayerControlView playerControlView2 = oo0o0oo.f6767OooO00o;
            if (!playerControlView2.OooO0oo()) {
                playerControlView2.setVisibility(0);
                playerControlView2.OooO();
                View view = playerControlView2.f6592OooOOo0;
                if (view != null) {
                    view.requestFocus();
                }
            }
            oo0o0oo.OooOO0O();
        }
    }

    public final void OooO0Oo() {
        OooO();
    }

    public final void OooO0o() {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        if (playerControlView == null || !this.f6667OooOOOO) {
            setContentDescription(null);
        } else if (playerControlView.OooO0oO()) {
            setContentDescription(this.f6677OooOoO0 ? getResources().getString(o0000.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(o0000.exo_controls_show));
        }
    }

    public final void OooO0o0() {
        View view = this.f6662OooOO0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void OooO0oO() {
        TextView textView = this.f6663OooOO0O;
        if (textView != null) {
            CharSequence charSequence = this.f6673OooOo0;
            if (charSequence == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequence);
                textView.setVisibility(0);
            }
        }
    }

    public final void OooO0oo() {
        if (this.f6674OooOo00) {
            return;
        }
        ImageView imageView = this.f6661OooO0oo;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            imageView.setVisibility(4);
        }
        View view = this.f6658OooO0o;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.f6664OooOO0o;
        if (z && OooO() && !playerControlView.OooO0oO()) {
            OooO00o(true);
        } else {
            if (!(OooO() && playerControlView.OooO0Oo(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z || !OooO()) {
                    return false;
                }
                OooO00o(true);
                return false;
            }
            OooO00o(true);
        }
        return true;
    }

    public List<AdOverlayInfo> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f6665OooOOO;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout));
        }
        PlayerControlView playerControlView = this.f6664OooOO0o;
        if (playerControlView != null) {
            arrayList.add(new AdOverlayInfo(playerControlView));
        }
        return ImmutableList.OooOO0O(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f6666OooOOO0;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw new IllegalStateException("exo_ad_overlay must be present for ad playback");
    }

    @UnstableApi
    public int getArtworkDisplayMode() {
        return this.f6670OooOOo0;
    }

    @UnstableApi
    public boolean getControllerAutoShow() {
        return this.f6676OooOo0o;
    }

    @UnstableApi
    public boolean getControllerHideOnTouch() {
        return this.f6677OooOoO0;
    }

    @UnstableApi
    public int getControllerShowTimeoutMs() {
        return this.f6675OooOo0O;
    }

    @Nullable
    @UnstableApi
    public Drawable getDefaultArtwork() {
        return this.f6669OooOOo;
    }

    @Nullable
    @UnstableApi
    public FrameLayout getOverlayFrameLayout() {
        return this.f6665OooOOO;
    }

    @Nullable
    public Player getPlayer() {
        return null;
    }

    @UnstableApi
    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6659OooO0o0;
        o000O000.OooO00o.OooO0OO(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    @UnstableApi
    public SubtitleView getSubtitleView() {
        return this.f6656OooO;
    }

    @UnstableApi
    @Deprecated
    public boolean getUseArtwork() {
        return this.f6670OooOOo0 != 0;
    }

    public boolean getUseController() {
        return this.f6667OooOOOO;
    }

    @Nullable
    @UnstableApi
    public View getVideoSurfaceView() {
        return this.f6660OooO0oO;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        OooO();
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        OooO0Oo();
        return super.performClick();
    }

    @UnstableApi
    public void setArtworkDisplayMode(int i) {
        o000O000.OooO00o.OooO0O0(i == 0 || this.f6661OooO0oo != null);
        if (this.f6670OooOOo0 != i) {
            this.f6670OooOOo0 = i;
            OooO0oo();
        }
    }

    @UnstableApi
    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.OooO00o oooO00o) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6659OooO0o0;
        o000O000.OooO00o.OooO0OO(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(oooO00o);
    }

    @UnstableApi
    public void setControllerAutoShow(boolean z) {
        this.f6676OooOo0o = z;
    }

    @UnstableApi
    public void setControllerHideDuringAds(boolean z) {
        this.f6672OooOo = z;
    }

    @UnstableApi
    public void setControllerHideOnTouch(boolean z) {
        o000O000.OooO00o.OooO0OO(this.f6664OooOO0o);
        this.f6677OooOoO0 = z;
        OooO0o();
    }

    @UnstableApi
    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable PlayerControlView.OooO0OO oooO0OO) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setOnFullScreenModeChangedListener(oooO0OO);
    }

    @UnstableApi
    public void setControllerShowTimeoutMs(int i) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        this.f6675OooOo0O = i;
        if (playerControlView.OooO0oO()) {
            OooO0OO(OooO0O0());
        }
    }

    public void setControllerVisibilityListener(@Nullable OooO0O0 oooO0O0) {
        if (oooO0O0 != null) {
            setControllerVisibilityListener((PlayerControlView.OooOOOO) null);
        }
    }

    @UnstableApi
    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        o000O000.OooO00o.OooO0O0(this.f6663OooOO0O != null);
        this.f6673OooOo0 = charSequence;
        OooO0oO();
    }

    @UnstableApi
    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f6669OooOOo != drawable) {
            this.f6669OooOOo = drawable;
            OooO0oo();
        }
    }

    public void setErrorMessageProvider(@Nullable p069o0000ooO.oo0o0Oo<? super PlaybackException> oo0o0oo) {
        if (oo0o0oo != null) {
            OooO0oO();
        }
    }

    public void setFullscreenButtonClickListener(@Nullable OooO0OO oooO0OO) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setOnFullScreenModeChangedListener(this.f6657OooO0Oo);
    }

    @UnstableApi
    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f6674OooOo00 != z) {
            this.f6674OooOo00 = z;
            OooO0oo();
        }
    }

    public void setPlayer(@Nullable Player player) {
        boolean z = true;
        o000O000.OooO00o.OooO0O0(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.OooOO0O() != Looper.getMainLooper()) {
            z = false;
        }
        o000O000.OooO00o.OooO00o(z);
        if (player == null) {
            return;
        }
        View view = this.f6660OooO0oO;
        SubtitleView subtitleView = this.f6656OooO;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        boolean zOooO = OooO();
        PlayerControlView playerControlView = this.f6664OooOO0o;
        if (zOooO) {
            playerControlView.setPlayer(player);
        }
        OooO0o0();
        OooO0oO();
        OooO0oo();
        if (player == null) {
            if (playerControlView != null) {
                playerControlView.OooO0o();
                return;
            }
            return;
        }
        if (!player.OooOoOO()) {
            if (subtitleView != null && player.OooOoOO()) {
                player.OooO();
                throw null;
            }
            player.Oooo0();
            OooO00o(false);
            return;
        }
        if (view instanceof TextureView) {
            player.Oooo0OO();
        } else if (view instanceof SurfaceView) {
            player.Oooo00o();
        }
        player.OooO0oo();
        throw null;
    }

    @UnstableApi
    public void setRepeatToggleModes(int i) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setRepeatToggleModes(i);
    }

    @UnstableApi
    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6659OooO0o0;
        o000O000.OooO00o.OooO0OO(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    @UnstableApi
    public void setShowBuffering(int i) {
        if (this.f6671OooOOoo != i) {
            this.f6671OooOOoo = i;
            OooO0o0();
        }
    }

    @UnstableApi
    public void setShowFastForwardButton(boolean z) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setShowFastForwardButton(z);
    }

    @UnstableApi
    public void setShowMultiWindowTimeBar(boolean z) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z);
    }

    @UnstableApi
    public void setShowNextButton(boolean z) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setShowNextButton(z);
    }

    @UnstableApi
    public void setShowPreviousButton(boolean z) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setShowPreviousButton(z);
    }

    @UnstableApi
    public void setShowRewindButton(boolean z) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setShowRewindButton(z);
    }

    @UnstableApi
    public void setShowShuffleButton(boolean z) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setShowShuffleButton(z);
    }

    @UnstableApi
    public void setShowSubtitleButton(boolean z) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setShowSubtitleButton(z);
    }

    @UnstableApi
    public void setShowVrButton(boolean z) {
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        playerControlView.setShowVrButton(z);
    }

    @UnstableApi
    public void setShutterBackgroundColor(@ColorInt int i) {
        View view = this.f6658OooO0o;
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
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0O0((z && playerControlView == null) ? false : true);
        setClickable(z || hasOnClickListeners());
        if (this.f6667OooOOOO == z) {
            return;
        }
        this.f6667OooOOOO = z;
        if (OooO()) {
            playerControlView.setPlayer(null);
        } else if (playerControlView != null) {
            playerControlView.OooO0o();
            playerControlView.setPlayer(null);
        }
        OooO0o();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f6660OooO0oO;
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
        PlayerControlView playerControlView = this.f6664OooOO0o;
        o000O000.OooO00o.OooO0OO(playerControlView);
        PlayerControlView.OooOOOO oooOOOO2 = this.f6668OooOOOo;
        if (oooOOOO2 == oooOOOO) {
            return;
        }
        if (oooOOOO2 != null) {
            playerControlView.f6582OooO0oO.remove(oooOOOO2);
        }
        this.f6668OooOOOo = oooOOOO;
        if (oooOOOO != null) {
            playerControlView.getClass();
            playerControlView.f6582OooO0oO.add(oooOOOO);
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
        int i9;
        super(context, attributeSet, i);
        OooO00o oooO00o = new OooO00o();
        this.f6657OooO0Oo = oooO00o;
        if (isInEditMode()) {
            this.f6659OooO0o0 = null;
            this.f6658OooO0o = null;
            this.f6660OooO0oO = null;
            this.f6661OooO0oo = null;
            this.f6656OooO = null;
            this.f6662OooOO0 = null;
            this.f6663OooOO0O = null;
            this.f6664OooOO0o = null;
            this.f6666OooOOO0 = null;
            this.f6665OooOOO = null;
            ImageView imageView = new ImageView(context);
            if (o000O000.OooO0o.f34423OooO00o >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(o000O000.OooO0o.OooO0OO(context, resources, o000000O.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources.getColor(o000OOo.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(o000O000.OooO0o.OooO0OO(context, resources2, o000000O.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(o000OOo.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i10 = o00000OO.exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o0000oo.PlayerView, i, 0);
            try {
                int i11 = o0000oo.PlayerView_shutter_background_color;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
                int color = typedArrayObtainStyledAttributes.getColor(i11, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(o0000oo.PlayerView_player_layout_id, i10);
                boolean z7 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerView_use_artwork, true);
                int i12 = typedArrayObtainStyledAttributes.getInt(o0000oo.PlayerView_artwork_display_mode, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(o0000oo.PlayerView_default_artwork, 0);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerView_use_controller, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(o0000oo.PlayerView_surface_type, 1);
                int i14 = typedArrayObtainStyledAttributes.getInt(o0000oo.PlayerView_resize_mode, 0);
                int i15 = typedArrayObtainStyledAttributes.getInt(o0000oo.PlayerView_show_timeout, 5000);
                z2 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerView_hide_on_touch, true);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerView_auto_show, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(o0000oo.PlayerView_show_buffering, 0);
                this.f6674OooOo00 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerView_keep_content_on_player_reset, this.f6674OooOo00);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(o0000oo.PlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z = z9;
                i4 = integer;
                z6 = z10;
                i10 = resourceId;
                i2 = i15;
                i3 = i13;
                z5 = z8;
                i8 = i12;
                z3 = zHasValue;
                i6 = resourceId2;
                z4 = z7;
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
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(o00000O0.exo_content_frame);
        this.f6659OooO0o0 = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i5);
        }
        View viewFindViewById = findViewById(o00000O0.exo_shutter);
        this.f6658OooO0o = viewFindViewById;
        if (viewFindViewById != null && z3) {
            viewFindViewById.setBackgroundColor(i7);
        }
        if (aspectRatioFrameLayout != null && i3 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 == 2) {
                this.f6660OooO0oO = new TextureView(context);
            } else if (i3 == 3) {
                try {
                    int i16 = SphericalGLSurfaceView.f6314OooOOOO;
                    this.f6660OooO0oO = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i3 != 4) {
                this.f6660OooO0oO = new SurfaceView(context);
            } else {
                try {
                    int i17 = VideoDecoderGLSurfaceView.f6287OooO0o0;
                    this.f6660OooO0oO = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            }
            this.f6660OooO0oO.setLayoutParams(layoutParams);
            this.f6660OooO0oO.setOnClickListener(oooO00o);
            this.f6660OooO0oO.setClickable(false);
            aspectRatioFrameLayout.addView(this.f6660OooO0oO, 0);
        } else {
            this.f6660OooO0oO = null;
        }
        this.f6666OooOOO0 = (FrameLayout) findViewById(o00000O0.exo_ad_overlay);
        this.f6665OooOOO = (FrameLayout) findViewById(o00000O0.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(o00000O0.exo_artwork);
        this.f6661OooO0oo = imageView2;
        this.f6670OooOOo0 = z4 && i8 != 0 && imageView2 != null ? i8 : 0;
        if (i6 != 0) {
            Context context2 = getContext();
            Object obj = ContextCompat.f5271OooO00o;
            this.f6669OooOOo = ContextCompat.OooO0OO.OooO0O0(context2, i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(o00000O0.exo_subtitles);
        this.f6656OooO = subtitleView;
        if (subtitleView != null) {
            subtitleView.OooO00o();
            subtitleView.OooO0O0();
        }
        View viewFindViewById2 = findViewById(o00000O0.exo_buffering);
        this.f6662OooOO0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f6671OooOOoo = i4;
        TextView textView = (TextView) findViewById(o00000O0.exo_error_message);
        this.f6663OooOO0O = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i18 = o00000O0.exo_controller;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i18);
        View viewFindViewById3 = findViewById(o00000O0.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f6664OooOO0o = playerControlView;
            i9 = 0;
        } else if (viewFindViewById3 != null) {
            i9 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f6664OooOO0o = playerControlView2;
            playerControlView2.setId(i18);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i9 = 0;
            this.f6664OooOO0o = null;
        }
        PlayerControlView playerControlView3 = this.f6664OooOO0o;
        this.f6675OooOo0O = playerControlView3 != null ? i2 : i9;
        this.f6677OooOoO0 = z2;
        this.f6676OooOo0o = z;
        this.f6672OooOo = z6;
        this.f6667OooOOOO = (!z5 || playerControlView3 == null) ? i9 : 1;
        if (playerControlView3 != null) {
            oo0o0Oo oo0o0oo = playerControlView3.f6579OooO0Oo;
            int i19 = oo0o0oo.f6790OooOoO;
            if (i19 != 3 && i19 != 2) {
                oo0o0oo.OooO0o();
                oo0o0oo.OooO(2);
            }
            this.f6664OooOO0o.f6582OooO0oO.add(oooO00o);
        }
        if (z5) {
            setClickable(true);
        }
        OooO0o();
    }
}
