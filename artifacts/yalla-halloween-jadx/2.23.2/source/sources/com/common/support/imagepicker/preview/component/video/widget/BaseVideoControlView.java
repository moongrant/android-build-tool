package com.common.support.imagepicker.preview.component.video.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.media3.ui.o000O000;
import com.common.support.imagepicker.player.MediaPlayer;
import com.common.support.imagepicker.player.entites.BasePlayerSource;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.component.video.config.VideoControlViewUIChangeListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045Oooooo.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0002^_B'\b\u0007\u0012\u0006\u0010W\u001a\u00020V\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010X\u0012\b\b\u0002\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\u0006\u0010\u0004\u001a\u00020\u0003J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0014J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0014J\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0003J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0015H&J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0012\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&J\u0012\u0010 \u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010!\u001a\u00020\u0003H\u0002R\u001a\u0010#\u001a\u00020\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010\bR\u0016\u00106\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010@\u001a\u0004\u0018\u00010?8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u0004\u0018\u00010F8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010M\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Q\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bQ\u00107\u001a\u0004\bQ\u0010N\"\u0004\bR\u0010PR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006`"}, d2 = {"Lcom/common/support/imagepicker/preview/component/video/widget/BaseVideoControlView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "", "initView", "Lcom/common/support/imagepicker/preview/component/video/config/VideoControlViewUIChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setUIChangeListener$preview_release", "(Lcom/common/support/imagepicker/preview/component/video/config/VideoControlViewUIChangeListener;)V", "setUIChangeListener", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "viewAttacher", "setViewAttacher", "Lcom/common/support/imagepicker/player/MediaPlayer;", "player", "setPlayer", "onAttachedToWindow", "Landroid/view/View;", "v", "onClick", "onDetachedFromWindow", "", "show", "setShowBottomBar", "showBottomBar", "playing", "updatePlayPauseButton", "updateVideoPlayerTimeline", "", "currentPosition", "updateVideoPlayerTime", "Lcom/common/support/imagepicker/player/MediaPlayer$Listener;", "setVideoListener", "hideBottomBar", "Landroid/os/Handler;", "mUIHandler", "Landroid/os/Handler;", "getMUIHandler", "()Landroid/os/Handler;", "mViewAttacher", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "mPlayer", "Lcom/common/support/imagepicker/player/MediaPlayer;", "getMPlayer", "()Lcom/common/support/imagepicker/player/MediaPlayer;", "setMPlayer", "(Lcom/common/support/imagepicker/player/MediaPlayer;)V", "mVideoListener", "Lcom/common/support/imagepicker/player/MediaPlayer$Listener;", "mUIChangeListener", "Lcom/common/support/imagepicker/preview/component/video/config/VideoControlViewUIChangeListener;", "getMUIChangeListener", "()Lcom/common/support/imagepicker/preview/component/video/config/VideoControlViewUIChangeListener;", "setMUIChangeListener", "mShowBottomBar", "Z", "Landroid/widget/ImageButton;", "btnPlayPause", "Landroid/widget/ImageButton;", "getBtnPlayPause", "()Landroid/widget/ImageButton;", "setBtnPlayPause", "(Landroid/widget/ImageButton;)V", "Landroidx/media3/ui/o000O000;", "vTimeBar", "Landroidx/media3/ui/o000O000;", "getVTimeBar", "()Landroidx/media3/ui/o000O000;", "setVTimeBar", "(Landroidx/media3/ui/o000O000;)V", "Landroid/view/ViewGroup;", "lytBottomBar", "Landroid/view/ViewGroup;", "getLytBottomBar", "()Landroid/view/ViewGroup;", "setLytBottomBar", "(Landroid/view/ViewGroup;)V", "isPlaying", "()Z", "setPlaying", "(Z)V", "isScrubbing", "setScrubbing", "Ljava/lang/Runnable;", "updateProgressRunnable", "Ljava/lang/Runnable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MyListener", "MyOnScrubListener", "preview_release"}, k = 1, mv = {1, 8, 0})
public abstract class BaseVideoControlView extends FrameLayout implements View.OnClickListener {

    @Nullable
    private ImageButton btnPlayPause;
    private boolean isPlaying;
    private boolean isScrubbing;

    @Nullable
    private ViewGroup lytBottomBar;

    @Nullable
    private MediaPlayer mPlayer;
    private boolean mShowBottomBar;

    @Nullable
    private VideoControlViewUIChangeListener mUIChangeListener;

    @NotNull
    private final Handler mUIHandler;

    @Nullable
    private MediaPlayer.Listener mVideoListener;

    @Nullable
    private BaseViewAttacher mViewAttacher;

    @NotNull
    private final Runnable updateProgressRunnable;

    @Nullable
    private o000O000 vTimeBar;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/common/support/imagepicker/preview/component/video/widget/BaseVideoControlView$MyListener;", "Lcom/common/support/imagepicker/player/MediaPlayer$Listener;", "(Lcom/common/support/imagepicker/preview/component/video/widget/BaseVideoControlView;)V", "onStateChanged", "", "playWhenReady", "", "playbackState", "", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class MyListener implements MediaPlayer.Listener {
        public MyListener() {
        }

        public void onError(@NotNull MediaPlayer mediaPlayer, @NotNull Exception exc, @NotNull String str) {
            MediaPlayer.Listener.DefaultImpls.onError(this, mediaPlayer, exc, str);
        }

        public void onMediaLoadCompleted(@NotNull BasePlayerSource basePlayerSource) {
            MediaPlayer.Listener.DefaultImpls.onMediaLoadCompleted(this, basePlayerSource);
        }

        public void onPlayBefore(@NotNull MediaPlayer mediaPlayer) {
            MediaPlayer.Listener.DefaultImpls.onPlayBefore(this, mediaPlayer);
        }

        public void onRenderedFirstFrame() {
            MediaPlayer.Listener.DefaultImpls.onRenderedFirstFrame(this);
        }

        public void onSeekFinished() {
            MediaPlayer.Listener.DefaultImpls.onSeekFinished(this);
        }

        public void onSeekStarted() {
            MediaPlayer.Listener.DefaultImpls.onSeekStarted(this);
        }

        public void onStateChanged(boolean playWhenReady, int playbackState) {
            MediaPlayer mPlayer = BaseVideoControlView.this.getMPlayer();
            if (!(mPlayer != null && mPlayer.isPlaying()) || playbackState == 4) {
                if (BaseVideoControlView.this.getIsPlaying() || playbackState == 4) {
                    BaseVideoControlView.this.setPlaying(false);
                    BaseVideoControlView.this.getMUIHandler().removeCallbacks(BaseVideoControlView.this.updateProgressRunnable);
                }
            } else if (!BaseVideoControlView.this.getIsPlaying()) {
                BaseVideoControlView.this.setPlaying(true);
                BaseVideoControlView.this.getMUIHandler().post(BaseVideoControlView.this.updateProgressRunnable);
            }
            BaseVideoControlView baseVideoControlView = BaseVideoControlView.this;
            MediaPlayer mPlayer2 = baseVideoControlView.getMPlayer();
            baseVideoControlView.updatePlayPauseButton(mPlayer2 != null ? mPlayer2.isPlaying() : false);
            BaseVideoControlView.this.updateVideoPlayerTimeline();
            BaseVideoControlView.updateVideoPlayerTime$default(BaseVideoControlView.this, 0L, 1, null);
        }

        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            MediaPlayer.Listener.DefaultImpls.onVideoSizeChanged(this, i, i2, i3, f);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/common/support/imagepicker/preview/component/video/widget/BaseVideoControlView$MyOnScrubListener;", "Landroidx/media3/ui/o000O000$OooO00o;", "", "position", "", "seekTo", "Landroidx/media3/ui/o000O000;", "timeBar", "onScrubStart", "onScrubMove", "", "canceled", "onScrubStop", "J", "Ljava/lang/Runnable;", "seekToRunnable", "Ljava/lang/Runnable;", "resumePlay", "Z", "<init>", "(Lcom/common/support/imagepicker/preview/component/video/widget/BaseVideoControlView;)V", "preview_release"}, k = 1, mv = {1, 8, 0})
    public final class MyOnScrubListener implements o000O000.OooO00o {
        private boolean resumePlay;
        private long seekTo;

        @Nullable
        private Runnable seekToRunnable;

        public MyOnScrubListener() {
        }

        private final void seekTo(long position) {
            this.seekTo = position;
            if (this.seekToRunnable == null) {
                final BaseVideoControlView baseVideoControlView = BaseVideoControlView.this;
                this.seekToRunnable = new Runnable() { // from class: com.common.support.imagepicker.preview.component.video.widget.OooO00o
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseVideoControlView.MyOnScrubListener.seekTo$lambda$0(baseVideoControlView, this);
                    }
                };
                Handler mUIHandler = baseVideoControlView.getMUIHandler();
                Runnable runnable = this.seekToRunnable;
                Intrinsics.checkNotNull(runnable);
                mUIHandler.postDelayed(runnable, 100L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void seekTo$lambda$0(BaseVideoControlView this$0, MyOnScrubListener this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            MediaPlayer mPlayer = this$0.getMPlayer();
            if (mPlayer != null) {
                mPlayer.seekTo(this$1.seekTo);
            }
            this$1.seekToRunnable = null;
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public void onScrubMove(@NotNull o000O000 timeBar, long position) {
            Intrinsics.checkNotNullParameter(timeBar, "timeBar");
            BaseVideoControlView.this.updateVideoPlayerTime(position);
            seekTo(position);
            VideoControlViewUIChangeListener mUIChangeListener = BaseVideoControlView.this.getMUIChangeListener();
            if (mUIChangeListener != null) {
                mUIChangeListener.onScrubMove();
            }
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public void onScrubStart(@NotNull o000O000 timeBar, long position) {
            Intrinsics.checkNotNullParameter(timeBar, "timeBar");
            BaseVideoControlView.this.setScrubbing(true);
            BaseVideoControlView.this.updateVideoPlayerTime(position);
            VideoControlViewUIChangeListener mUIChangeListener = BaseVideoControlView.this.getMUIChangeListener();
            if (mUIChangeListener != null) {
                mUIChangeListener.onScrubStart();
            }
            MediaPlayer mPlayer = BaseVideoControlView.this.getMPlayer();
            this.resumePlay = mPlayer != null ? mPlayer.isPlaying() : false;
            MediaPlayer mPlayer2 = BaseVideoControlView.this.getMPlayer();
            if (mPlayer2 != null) {
                mPlayer2.pause();
            }
        }

        @Override // androidx.media3.ui.o000O000.OooO00o
        public void onScrubStop(@NotNull o000O000 timeBar, long position, boolean canceled) {
            MediaPlayer mPlayer;
            Intrinsics.checkNotNullParameter(timeBar, "timeBar");
            BaseVideoControlView.this.setScrubbing(false);
            if (!canceled) {
                Runnable runnable = this.seekToRunnable;
                if (runnable != null) {
                    BaseVideoControlView.this.getMUIHandler().removeCallbacks(runnable);
                    runnable.run();
                } else {
                    MediaPlayer mPlayer2 = BaseVideoControlView.this.getMPlayer();
                    if (mPlayer2 != null) {
                        mPlayer2.seekTo(position);
                    }
                }
                BaseVideoControlView.this.updateVideoPlayerTimeline();
            }
            if (this.resumePlay && (mPlayer = BaseVideoControlView.this.getMPlayer()) != null) {
                mPlayer.play();
            }
            VideoControlViewUIChangeListener mUIChangeListener = BaseVideoControlView.this.getMUIChangeListener();
            if (mUIChangeListener != null) {
                mUIChangeListener.onScrubStop();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseVideoControlView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void hideBottomBar() {
        VideoControlViewUIChangeListener videoControlViewUIChangeListener = this.mUIChangeListener;
        if (videoControlViewUIChangeListener != null) {
            videoControlViewUIChangeListener.onCollapse();
        }
        ViewGroup viewGroup = this.lytBottomBar;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private final void setVideoListener(MediaPlayer.Listener listener) {
        this.mVideoListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProgressRunnable$lambda$1$lambda$0(BaseVideoControlView this_run) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        if (this_run.mPlayer != null && !this_run.isScrubbing) {
            this_run.updateVideoPlayerTimeline();
            updateVideoPlayerTime$default(this_run, 0L, 1, null);
        }
        if (this_run.isPlaying) {
            this_run.mUIHandler.removeCallbacks(this_run.updateProgressRunnable);
            this_run.mUIHandler.postDelayed(this_run.updateProgressRunnable, 17L);
        }
    }

    public static /* synthetic */ void updateVideoPlayerTime$default(BaseVideoControlView baseVideoControlView, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateVideoPlayerTime");
        }
        if ((i & 1) != 0) {
            MediaPlayer mediaPlayer = baseVideoControlView.mPlayer;
            j = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : 0L;
        }
        baseVideoControlView.updateVideoPlayerTime(j);
    }

    @Nullable
    public final ImageButton getBtnPlayPause() {
        return this.btnPlayPause;
    }

    @Nullable
    public final ViewGroup getLytBottomBar() {
        return this.lytBottomBar;
    }

    @Nullable
    public final MediaPlayer getMPlayer() {
        return this.mPlayer;
    }

    @Nullable
    public final VideoControlViewUIChangeListener getMUIChangeListener() {
        return this.mUIChangeListener;
    }

    @NotNull
    public final Handler getMUIHandler() {
        return this.mUIHandler;
    }

    @Nullable
    public final o000O000 getVTimeBar() {
        return this.vTimeBar;
    }

    public final void initView() {
        o000O000 o000o001 = this.vTimeBar;
        if (o000o001 != null) {
            o000o001.OooO00o(new MyOnScrubListener());
        }
        setShowBottomBar(false);
        setVideoListener(new MyListener());
    }

    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: isScrubbing, reason: from getter */
    public final boolean getIsScrubbing() {
        return this.isScrubbing;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        MediaPlayer mediaPlayer;
        super.onAttachedToWindow();
        MediaPlayer.Listener listener = this.mVideoListener;
        if (listener != null && (mediaPlayer = this.mPlayer) != null) {
            mediaPlayer.addListener(listener);
        }
        if (this.isPlaying) {
            this.mUIHandler.post(this.updateProgressRunnable);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        MediaPlayer mediaPlayer;
        if (!Intrinsics.areEqual(v, this.btnPlayPause) || (mediaPlayer = this.mPlayer) == null) {
            return;
        }
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        } else {
            mediaPlayer.play();
            setShowBottomBar(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        MediaPlayer mediaPlayer;
        super.onDetachedFromWindow();
        MediaPlayer.Listener listener = this.mVideoListener;
        if (listener != null && (mediaPlayer = this.mPlayer) != null) {
            mediaPlayer.removeListener(listener);
        }
        if (this.isPlaying) {
            this.mUIHandler.removeCallbacks(this.updateProgressRunnable);
        }
    }

    public final void setBtnPlayPause(@Nullable ImageButton imageButton) {
        this.btnPlayPause = imageButton;
    }

    public final void setLytBottomBar(@Nullable ViewGroup viewGroup) {
        this.lytBottomBar = viewGroup;
    }

    public final void setMPlayer(@Nullable MediaPlayer mediaPlayer) {
        this.mPlayer = mediaPlayer;
    }

    public final void setMUIChangeListener(@Nullable VideoControlViewUIChangeListener videoControlViewUIChangeListener) {
        this.mUIChangeListener = videoControlViewUIChangeListener;
    }

    public void setPlayer(@Nullable MediaPlayer player) {
        MediaPlayer.Listener listener = this.mVideoListener;
        if (listener != null) {
            if (Intrinsics.areEqual(this.mPlayer, player)) {
                return;
            }
            MediaPlayer mediaPlayer = this.mPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.removeListener(listener);
            }
            this.mPlayer = player;
            if (player != null) {
                player.addListener(listener);
            }
        }
        MediaPlayer mediaPlayer2 = this.mPlayer;
        updatePlayPauseButton(mediaPlayer2 != null ? mediaPlayer2.isPlaying() : false);
        updateVideoPlayerTimeline();
        updateVideoPlayerTime$default(this, 0L, 1, null);
    }

    public final void setPlaying(boolean z) {
        this.isPlaying = z;
    }

    public final void setScrubbing(boolean z) {
        this.isScrubbing = z;
    }

    public final void setShowBottomBar(boolean show) {
        this.mShowBottomBar = show;
        if (show) {
            showBottomBar();
        } else {
            hideBottomBar();
        }
    }

    public final void setUIChangeListener$preview_release(@Nullable VideoControlViewUIChangeListener listener) {
        this.mUIChangeListener = listener;
    }

    public final void setVTimeBar(@Nullable o000O000 o000o001) {
        this.vTimeBar = o000o001;
    }

    public void setViewAttacher(@NotNull BaseViewAttacher viewAttacher) {
        Intrinsics.checkNotNullParameter(viewAttacher, "viewAttacher");
        this.mViewAttacher = viewAttacher;
    }

    public final void showBottomBar() {
        VideoControlViewUIChangeListener videoControlViewUIChangeListener = this.mUIChangeListener;
        if (videoControlViewUIChangeListener != null) {
            videoControlViewUIChangeListener.onExpand();
        }
        ViewGroup viewGroup = this.lytBottomBar;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    public abstract void updatePlayPauseButton(boolean playing);

    public abstract void updateVideoPlayerTime(long currentPosition);

    public void updateVideoPlayerTimeline() {
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            long currentPosition = mediaPlayer.getCurrentPosition();
            if (mediaPlayer.getCurrentPosition() < 0 || currentPosition < 0) {
                return;
            }
            o000O000 o000o001 = this.vTimeBar;
            if (o000o001 != null) {
                o000o001.setPosition(mediaPlayer.getCurrentPosition());
            }
            o000O000 o000o002 = this.vTimeBar;
            if (o000o002 != null) {
                o000o002.setDuration(mediaPlayer.getDuration());
            }
            o000O000 o000o003 = this.vTimeBar;
            if (o000o003 != null) {
                o000o003.setBufferedPosition(mediaPlayer.getBufferedPosition());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseVideoControlView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BaseVideoControlView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseVideoControlView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mUIHandler = new Handler(Looper.getMainLooper());
        this.mShowBottomBar = true;
        this.updateProgressRunnable = new o000000O(this, 2);
    }
}
