package com.yalla.android.videoplayer.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o0OOo000.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O000o0;
import p363o0OOo00O.OooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010,\u001a\u00020\u0005¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017Ri\u0010'\u001aI\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/yalla/android/videoplayer/exoplayer/VideoPlayerView;", "Landroid/widget/FrameLayout;", "", "Lo0OOo00O/OooO;", "getPlayControl", "", "mode", "", "setResizeMode", "Landroidx/compose/ui/graphics/Color;", "color", "setBackgroundColor-8_81llA", "(J)V", "setBackgroundColor", "Landroidx/media3/ui/AspectRatioFrameLayout$OooO00o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setAspectRatioListener", "Landroidx/media3/ui/PlayerView;", "OooO0o0", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "setPlayerView", "(Landroidx/media3/ui/PlayerView;)V", "playerView", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "progress", "", "position", "bufferedPosition", "OooO0oO", "Lkotlin/jvm/functions/Function3;", "getProgressUpdateListener", "()Lkotlin/jvm/functions/Function3;", "setProgressUpdateListener", "(Lkotlin/jvm/functions/Function3;)V", "progressUpdateListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "YLVideoPlayer_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/VideoPlayerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,303:1\n329#2,4:304\n*S KotlinDebug\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/VideoPlayerView\n*L\n117#1:304,4\n*E\n"})
public final class VideoPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f22071OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO f22072OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0O000o0 f22073OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public PlayerView playerView;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function3<? super Float, ? super Long, ? super Long, Unit> progressUpdateListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPlayerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o() {
        OooO oooO = this.f22072OooO0Oo;
        if (oooO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayerControl");
            oooO = null;
        }
        androidx.media3.exoplayer.OooO oooO2 = (androidx.media3.exoplayer.OooO) oooO.getPlayer();
        float fO00Oo0 = oooO2.o00Oo0();
        float currentPosition = oooO2.getCurrentPosition();
        Function3<? super Float, ? super Long, ? super Long, Unit> function3 = this.progressUpdateListener;
        if (function3 != null) {
            function3.invoke(Float.valueOf(currentPosition / fO00Oo0), Long.valueOf(oooO2.getCurrentPosition()), Long.valueOf(oooO2.Ooooooo()));
        }
        o0O000o0 o0o000o1 = this.f22073OooO0o;
        removeCallbacks(o0o000o1);
        if (oooO2.isPlaying()) {
            postDelayed(o0o000o1, 10L);
        }
    }

    @NotNull
    public final OooO getPlayControl() {
        OooO oooO = this.f22072OooO0Oo;
        if (oooO != null) {
            return oooO;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoPlayerControl");
        return null;
    }

    @Nullable
    public final PlayerView getPlayerView() {
        return this.playerView;
    }

    @Nullable
    public final Function3<Float, Long, Long, Unit> getProgressUpdateListener() {
        return this.progressUpdateListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.progressUpdateListener != null) {
            OooO00o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f22073OooO0o);
    }

    public void setAspectRatioListener(@NotNull AspectRatioFrameLayout.OooO00o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.setAspectRatioListener(listener);
        }
    }

    /* JADX INFO: renamed from: setBackgroundColor-8_81llA, reason: not valid java name */
    public void m4197setBackgroundColor8_81llA(long color) {
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.setShutterBackgroundColor(ColorKt.m1735toArgb8_81llA(color));
        }
    }

    public final void setPlayerView(@Nullable PlayerView playerView) {
        this.playerView = playerView;
    }

    public final void setProgressUpdateListener(@Nullable Function3<? super Float, ? super Long, ? super Long, Unit> function3) {
        this.progressUpdateListener = function3;
    }

    public void setResizeMode(int mode) {
        PlayerView playerView = this.playerView;
        if (playerView == null) {
            return;
        }
        playerView.setResizeMode(mode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VideoPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22073OooO0o = new o0O000o0(this, 1);
        View viewInflate = LayoutInflater.from(context).inflate(OooO0OO.playerview, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        PlayerView playerView = (PlayerView) viewInflate;
        this.playerView = playerView;
        addView(playerView);
    }
}
