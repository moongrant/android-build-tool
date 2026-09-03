package com.yalla.android.videoplayer.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.StyledPlayerView;
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
import p359o0OOOooo.o000O0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010,\u001a\u00020\u0005¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001d\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017Ri\u0010'\u001aI\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/yalla/android/videoplayer/exoplayer/VideoPlayerView;", "Landroid/widget/FrameLayout;", "", "Lo0OOo000/OooO0OO;", "getPlayControl", "", "mode", "", "setResizeMode", "Landroidx/compose/ui/graphics/Color;", "color", "setBackgroundColor-8_81llA", "(J)V", "setBackgroundColor", "Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout$OooO00o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setAspectRatioListener", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "OooO0o0", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "getPlayerView", "()Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "setPlayerView", "(Lcom/google/android/exoplayer2/ui/StyledPlayerView;)V", "playerView", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "progress", "", "position", "bufferedPosition", "OooO0oO", "Lkotlin/jvm/functions/Function3;", "getProgressUpdateListener", "()Lkotlin/jvm/functions/Function3;", "setProgressUpdateListener", "(Lkotlin/jvm/functions/Function3;)V", "progressUpdateListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "YLVideoPlayer_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/VideoPlayerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,301:1\n329#2,4:302\n*S KotlinDebug\n*F\n+ 1 PlayerView.kt\ncom/yalla/android/videoplayer/exoplayer/VideoPlayerView\n*L\n115#1:302,4\n*E\n"})
public final class VideoPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f22544OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO f22545OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooOOOO f22546OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public StyledPlayerView playerView;

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
        OooO0OO oooO0OO = this.f22545OooO0Oo;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoPlayerControl");
            oooO0OO = null;
        }
        Player player = oooO0OO.getPlayer();
        float duration = player.getDuration();
        float currentPosition = player.getCurrentPosition();
        Function3<? super Float, ? super Long, ? super Long, Unit> function3 = this.progressUpdateListener;
        if (function3 != null) {
            function3.invoke(Float.valueOf(currentPosition / duration), Long.valueOf(player.getCurrentPosition()), Long.valueOf(player.Ooooo0o()));
        }
        OooOOOO oooOOOO = this.f22546OooO0o;
        removeCallbacks(oooOOOO);
        if (((com.google.android.exoplayer2.OooO0OO) player).isPlaying()) {
            postDelayed(oooOOOO, 10L);
        }
    }

    @NotNull
    public final OooO0OO getPlayControl() {
        OooO0OO oooO0OO = this.f22545OooO0Oo;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoPlayerControl");
        return null;
    }

    @Nullable
    public final StyledPlayerView getPlayerView() {
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
        removeCallbacks(this.f22546OooO0o);
    }

    public void setAspectRatioListener(@NotNull AspectRatioFrameLayout.OooO00o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        StyledPlayerView styledPlayerView = this.playerView;
        if (styledPlayerView != null) {
            styledPlayerView.setAspectRatioListener(listener);
        }
    }

    /* JADX INFO: renamed from: setBackgroundColor-8_81llA, reason: not valid java name */
    public void m4195setBackgroundColor8_81llA(long color) {
        StyledPlayerView styledPlayerView = this.playerView;
        if (styledPlayerView != null) {
            styledPlayerView.setShutterBackgroundColor(ColorKt.m1724toArgb8_81llA(color));
        }
    }

    public final void setPlayerView(@Nullable StyledPlayerView styledPlayerView) {
        this.playerView = styledPlayerView;
    }

    public final void setProgressUpdateListener(@Nullable Function3<? super Float, ? super Long, ? super Long, Unit> function3) {
        this.progressUpdateListener = function3;
    }

    public void setResizeMode(int mode) {
        StyledPlayerView styledPlayerView = this.playerView;
        if (styledPlayerView == null) {
            return;
        }
        styledPlayerView.setResizeMode(mode);
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
        this.f22546OooO0o = new OooOOOO(this, 1);
        View viewInflate = LayoutInflater.from(context).inflate(o000O0O0.playerview, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.google.android.exoplayer2.ui.StyledPlayerView");
        StyledPlayerView styledPlayerView = (StyledPlayerView) viewInflate;
        this.playerView = styledPlayerView;
        addView(styledPlayerView);
    }
}
