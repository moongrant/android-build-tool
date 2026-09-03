package com.common.support.imagepicker.preview.component.video.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO0OO;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.player.MediaPlayer;
import com.common.support.imagepicker.player.entites.BasePlayerSource;
import com.common.support.imagepicker.player.entites.VideoSource;
import com.common.support.imagepicker.player.helper.AspectRatioFrameLayoutHelper;
import com.common.support.imagepicker.preview.R;
import com.common.support.imagepicker.preview.attacher.BaseViewAttacher;
import com.common.support.imagepicker.preview.component.image.utils.GlideExtensionsKt;
import com.common.support.imagepicker.preview.component.video.config.MediaPlayerErrorListener;
import com.common.support.imagepicker.preview.component.video.config.VideoView;
import com.common.support.imagepicker.preview.component.video.widget.YLVideoView.MyViewAttacher;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002BCB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010\u000f\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010)\u001a\u00020\fH\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u001aH\u0016J\n\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010\"\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020&H\u0002J\b\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u00020&H\u0002J\b\u00101\u001a\u00020&H\u0002J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0014J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020(H\u0016J\b\u00106\u001a\u00020&H\u0014J\b\u00107\u001a\u00020&H\u0014J\u0010\u00108\u001a\u00020&2\u0006\u00105\u001a\u00020(H\u0016J\u0010\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020\u0018H\u0016J\u0010\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020\u0010H\u0016J\u0012\u0010=\u001a\u00020&2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u001a\u0010@\u001a\u00020&2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010A\u001a\u00020\u0010H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00060\u001fR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010 \u001a\u00060!R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b\"\u0010#¨\u0006D"}, d2 = {"Lcom/common/support/imagepicker/preview/component/video/widget/YLVideoView;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/common/support/imagepicker/preview/component/video/config/VideoView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "controlView", "Lcom/common/support/imagepicker/preview/component/video/widget/BaseVideoControlView;", "coverView", "Landroid/widget/ImageView;", "enableZoom", "", "mAspectRatioFrameLayoutHelper", "Lcom/common/support/imagepicker/player/helper/AspectRatioFrameLayoutHelper;", "getMAspectRatioFrameLayoutHelper", "()Lcom/common/support/imagepicker/player/helper/AspectRatioFrameLayoutHelper;", "mAspectRatioFrameLayoutHelper$delegate", "Lkotlin/Lazy;", "mediaPlayerErrorListener", "Lcom/common/support/imagepicker/preview/component/video/config/MediaPlayerErrorListener;", "player", "Lcom/common/support/imagepicker/player/MediaPlayer;", "showBottomBar", "textureView", "Lcom/common/support/imagepicker/preview/component/video/widget/YLTextureView;", "videoListener", "Lcom/common/support/imagepicker/preview/component/video/widget/YLVideoView$MyListener;", "viewAttacher", "Lcom/common/support/imagepicker/preview/component/video/widget/YLVideoView$MyViewAttacher;", "getViewAttacher", "()Lcom/common/support/imagepicker/preview/component/video/widget/YLVideoView$MyViewAttacher;", "viewAttacher$delegate", "bindLifecycle", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getControlView", "getPlayer", "getTextureViewBitmap", "Landroid/graphics/Bitmap;", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "initAttrs", "initCoverView", "initRatioContainer", "initTextureView", "loadVideoCover", "onAttachedToWindow", "onDestroy", "owner", "onDetachedFromWindow", "onFinishInflate", "onPause", "setMediaPlayerErrorListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setShowBottomBar", "show", "setVideoCover", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "setupPlayer", "autoCover", "MyListener", "MyViewAttacher", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYLVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YLVideoView.kt\ncom/common/support/imagepicker/preview/component/video/widget/YLVideoView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
public final class YLVideoView extends FrameLayout implements DefaultLifecycleObserver, VideoView {
    private BaseVideoControlView controlView;

    @Nullable
    private ImageView coverView;
    private boolean enableZoom;

    /* JADX INFO: renamed from: mAspectRatioFrameLayoutHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAspectRatioFrameLayoutHelper;

    @Nullable
    private MediaPlayerErrorListener mediaPlayerErrorListener;

    @Nullable
    private MediaPlayer player;
    private boolean showBottomBar;

    @Nullable
    private YLTextureView textureView;

    @NotNull
    private MyListener videoListener;

    /* JADX INFO: renamed from: viewAttacher$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewAttacher;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Lcom/common/support/imagepicker/preview/component/video/widget/YLVideoView$MyListener;", "Lcom/common/support/imagepicker/player/MediaPlayer$Listener;", "(Lcom/common/support/imagepicker/preview/component/video/widget/YLVideoView;)V", "onError", "", "player", "Lcom/common/support/imagepicker/player/MediaPlayer;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "renderErrorMsg", "", "onRenderedFirstFrame", "onVideoSizeChanged", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "unAppliedRotationDegrees", "pixelWidthHeightRatio", "", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class MyListener implements MediaPlayer.Listener {
        public MyListener() {
        }

        public void onError(@NotNull MediaPlayer player, @NotNull Exception e, @NotNull String renderErrorMsg) {
            Intrinsics.checkNotNullParameter(player, "player");
            Intrinsics.checkNotNullParameter(e, "e");
            Intrinsics.checkNotNullParameter(renderErrorMsg, "renderErrorMsg");
            MediaPlayerErrorListener mediaPlayerErrorListener = YLVideoView.this.mediaPlayerErrorListener;
            if (mediaPlayerErrorListener != null) {
                mediaPlayerErrorListener.onError(e, renderErrorMsg);
            }
        }

        public void onMediaLoadCompleted(@NotNull BasePlayerSource basePlayerSource) {
            MediaPlayer.Listener.DefaultImpls.onMediaLoadCompleted(this, basePlayerSource);
        }

        public void onPlayBefore(@NotNull MediaPlayer mediaPlayer) {
            MediaPlayer.Listener.DefaultImpls.onPlayBefore(this, mediaPlayer);
        }

        public void onRenderedFirstFrame() {
            MediaPlayer.Listener.DefaultImpls.onRenderedFirstFrame(this);
            ImageView imageView = YLVideoView.this.coverView;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
        }

        public void onSeekFinished() {
            MediaPlayer.Listener.DefaultImpls.onSeekFinished(this);
        }

        public void onSeekStarted() {
            MediaPlayer.Listener.DefaultImpls.onSeekStarted(this);
        }

        public void onStateChanged(boolean z, int i) {
            MediaPlayer.Listener.DefaultImpls.onStateChanged(this, z, i);
        }

        public void onVideoSizeChanged(int width, int height, int unAppliedRotationDegrees, float pixelWidthHeightRatio) {
            MediaPlayer.Listener.DefaultImpls.onVideoSizeChanged(this, width, height, unAppliedRotationDegrees, pixelWidthHeightRatio);
            float f = (height == 0 || width == 0) ? 1.0f : (width * pixelWidthHeightRatio) / height;
            if (unAppliedRotationDegrees == 90 || unAppliedRotationDegrees == 270) {
                f = 1 / f;
            }
            YLTextureView yLTextureView = YLVideoView.this.textureView;
            if (yLTextureView != null) {
                yLTextureView.setTextureRotation(unAppliedRotationDegrees);
            }
            ImagePickerLogUtil.e("YLVideoView", "onVideoSizeChanged videoAspectRatio" + f);
            YLVideoView.this.getMAspectRatioFrameLayoutHelper().setAspectRatio(f);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/common/support/imagepicker/preview/component/video/widget/YLVideoView$MyViewAttacher;", "Lcom/common/support/imagepicker/preview/attacher/BaseViewAttacher;", "(Lcom/common/support/imagepicker/preview/component/video/widget/YLVideoView;)V", "applyMatrix", "", "matrix", "Landroid/graphics/Matrix;", "getContentHeight", "", "getContentWidth", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class MyViewAttacher extends BaseViewAttacher {
        public MyViewAttacher() {
            super(YLVideoView.this);
        }

        @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
        public void applyMatrix(@Nullable Matrix matrix) {
            FrameLayout ratioContainer;
            RectF displayRect = getDisplayRect();
            if (getContentWidth() <= 0 || (ratioContainer = YLVideoView.this.getMAspectRatioFrameLayoutHelper().getRatioContainer()) == null) {
                return;
            }
            YLVideoView yLVideoView = YLVideoView.this;
            float fCenterX = displayRect.centerX() - (yLVideoView.getWidth() / 2);
            float fCenterY = displayRect.centerY() - (yLVideoView.getHeight() / 2);
            ratioContainer.setScaleX(getScale());
            ratioContainer.setScaleY(getScale());
            ratioContainer.setTranslationX(fCenterX);
            ratioContainer.setTranslationY(fCenterY);
        }

        @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
        public int getContentHeight() {
            FrameLayout ratioContainer = YLVideoView.this.getMAspectRatioFrameLayoutHelper().getRatioContainer();
            if (ratioContainer != null) {
                return ratioContainer.getHeight();
            }
            return 0;
        }

        @Override // com.common.support.imagepicker.preview.attacher.BaseViewAttacher
        public int getContentWidth() {
            FrameLayout ratioContainer = YLVideoView.this.getMAspectRatioFrameLayoutHelper().getRatioContainer();
            if (ratioContainer != null) {
                return ratioContainer.getWidth();
            }
            return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YLVideoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AspectRatioFrameLayoutHelper getMAspectRatioFrameLayoutHelper() {
        return (AspectRatioFrameLayoutHelper) this.mAspectRatioFrameLayoutHelper.getValue();
    }

    private final MyViewAttacher getViewAttacher() {
        return (MyViewAttacher) this.viewAttacher.getValue();
    }

    private final void initAttrs() {
        setShowBottomBar(this.showBottomBar);
        enableZoom(this.enableZoom);
    }

    private final void initCoverView() {
        if (this.coverView == null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.coverView = imageView;
            addView(imageView, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    private final void initRatioContainer() {
        AspectRatioFrameLayoutHelper mAspectRatioFrameLayoutHelper = getMAspectRatioFrameLayoutHelper();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        addView(mAspectRatioFrameLayoutHelper.createRatioContainer(context, 0), new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private final void initTextureView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.textureView = new YLTextureView(context, null, 0, 6, null);
        FrameLayout ratioContainer = getMAspectRatioFrameLayoutHelper().getRatioContainer();
        if (ratioContainer != null) {
            ratioContainer.addView(this.textureView, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0052  */
    private final void loadVideoCover() {
        BasePlayerSource playerSource;
        boolean z;
        String scheme;
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer == null || (playerSource = mediaPlayer.getPlayerSource()) == null) {
            return;
        }
        if (!(playerSource instanceof VideoSource)) {
            playerSource = null;
        }
        if (playerSource != null) {
            ImageView imageView = this.coverView;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            Uri contentUri = playerSource.getContentUri();
            String scheme2 = contentUri != null ? contentUri.getScheme() : null;
            if (!(scheme2 != null && StringsKt__StringsJVMKt.startsWith$default(scheme2, "http", false, 2, null))) {
                ImageView imageView2 = this.coverView;
                if (imageView2 != null) {
                    GlideExtensionsKt.loadVideo(imageView2, playerSource.getContentUri(), (126 & 2) != 0 ? null : null, (126 & 4) == 0 ? null : null, (126 & 8) != 0 ? 0 : 0, (126 & 16) != 0 ? 0 : 0, (126 & 32) == 0 ? 0 : 0, (126 & 64) != 0 ? 0L : 0L);
                    return;
                }
                return;
            }
            Uri thumbnailUri = ((VideoSource) playerSource).getThumbnailUri();
            if (thumbnailUri != null && (scheme = thumbnailUri.getScheme()) != null) {
                Intrinsics.checkNotNullExpressionValue(scheme, "scheme");
                z = StringsKt__StringsJVMKt.startsWith$default(scheme, "http", false, 2, null);
            }
            if (z) {
                ImageView imageView3 = this.coverView;
                if (imageView3 != null) {
                    GlideExtensionsKt.loadImg(imageView3, thumbnailUri, (56 & 2) != 0 ? null : 0, (56 & 4) == 0 ? 0 : null, (56 & 8) != 0 ? 0 : 0, (56 & 16) != 0 ? 0 : 0, (56 & 32) == 0 ? 0 : 0);
                    return;
                }
                return;
            }
            ImagePickerLogUtil.INSTANCE.w("YLVideoView", "coverUri = " + (thumbnailUri != null ? thumbnailUri.toString() : null));
        }
    }

    @Override // com.common.support.imagepicker.preview.component.video.config.VideoView
    public void bindLifecycle(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // com.common.support.imagepicker.preview.component.video.config.VideoView
    public void enableZoom(boolean enableZoom) {
        this.enableZoom = enableZoom;
        getViewAttacher().setZoomable(enableZoom);
    }

    @Override // com.common.support.imagepicker.preview.component.video.config.VideoView
    @NotNull
    public BaseVideoControlView getControlView() {
        BaseVideoControlView baseVideoControlView = this.controlView;
        if (baseVideoControlView != null) {
            return baseVideoControlView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlView");
        return null;
    }

    @Override // com.common.support.imagepicker.preview.component.video.config.VideoView
    @Nullable
    public MediaPlayer getPlayer() {
        return this.player;
    }

    @Override // com.common.support.imagepicker.preview.component.video.config.VideoView
    @Nullable
    public Bitmap getTextureViewBitmap() {
        YLTextureView yLTextureView = this.textureView;
        if (yLTextureView != null) {
            return yLTextureView.getBitmap();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            mediaPlayer.addListener(this.videoListener);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        OooO0OO.OooO00o(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            mediaPlayer.removeListener(this.videoListener);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!(getChildAt(getChildCount() - 1) instanceof BaseVideoControlView)) {
            throw new IllegalArgumentException("The last child of the VideoView must be a subclass of the BaseVideoControlView");
        }
        View childAt = getChildAt(getChildCount() - 1);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.common.support.imagepicker.preview.component.video.widget.BaseVideoControlView");
        BaseVideoControlView baseVideoControlView = (BaseVideoControlView) childAt;
        this.controlView = baseVideoControlView;
        if (baseVideoControlView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlView");
            baseVideoControlView = null;
        }
        baseVideoControlView.setViewAttacher(getViewAttacher());
        initAttrs();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        OooO0OO.OooO0Oo(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        OooO0OO.OooO0o0(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        OooO0OO.OooO0o(this, lifecycleOwner);
    }

    @Override // com.common.support.imagepicker.preview.component.video.config.VideoView
    public void setMediaPlayerErrorListener(@NotNull MediaPlayerErrorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mediaPlayerErrorListener = listener;
    }

    @Override // com.common.support.imagepicker.preview.component.video.config.VideoView
    public void setShowBottomBar(boolean show) {
        this.showBottomBar = show;
        BaseVideoControlView baseVideoControlView = this.controlView;
        if (baseVideoControlView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlView");
            baseVideoControlView = null;
        }
        baseVideoControlView.setShowBottomBar(show);
    }

    @Override // com.common.support.imagepicker.preview.component.video.config.VideoView
    public void setVideoCover(@Nullable Uri uri) {
        ImageView imageView = this.coverView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.coverView;
        if (imageView2 != null) {
            imageView2.setBackgroundColor(-16777216);
        }
        if (uri == null) {
            ImageView imageView3 = this.coverView;
            if (imageView3 != null) {
                imageView3.setImageDrawable(null);
                return;
            }
            return;
        }
        ImageView imageView4 = this.coverView;
        if (imageView4 != null) {
            imageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        ImageView imageView5 = this.coverView;
        if (imageView5 != null) {
            GlideExtensionsKt.loadVideo(imageView5, uri, (126 & 2) != 0 ? null : null, (126 & 4) == 0 ? null : null, (126 & 8) != 0 ? 0 : 0, (126 & 16) != 0 ? 0 : 0, (126 & 32) == 0 ? 0 : 0, (126 & 64) != 0 ? 0L : 0L);
        }
    }

    @Override // com.common.support.imagepicker.preview.component.video.config.VideoView
    public void setupPlayer(@Nullable MediaPlayer player, boolean autoCover) {
        BasePlayerSource playerSource;
        if (Intrinsics.areEqual(this.player, player)) {
            return;
        }
        MediaPlayer mediaPlayer = this.player;
        if (mediaPlayer != null) {
            mediaPlayer.removeListener(this.videoListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.videoListener);
        }
        BaseVideoControlView baseVideoControlView = null;
        if (player != null && (playerSource = player.getPlayerSource()) != null) {
            if (!(playerSource instanceof VideoSource)) {
                playerSource = null;
            }
            if (playerSource != null && playerSource.getWidth() > 0 && playerSource.getHeight() > 0) {
                getMAspectRatioFrameLayoutHelper().setAspectRatio((playerSource.getWidth() * 1.0f) / playerSource.getHeight());
            }
        }
        YLTextureView yLTextureView = this.textureView;
        if (yLTextureView != null && player != null) {
            player.setTextureView(yLTextureView);
        }
        BaseVideoControlView baseVideoControlView2 = this.controlView;
        if (baseVideoControlView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlView");
        } else {
            baseVideoControlView = baseVideoControlView2;
        }
        baseVideoControlView.setPlayer(player);
        if (autoCover) {
            loadVideoCover();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YLVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.common.support.imagepicker.preview.component.video.config.VideoView
    @NotNull
    /* JADX INFO: renamed from: getViewAttacher, reason: collision with other method in class */
    public BaseViewAttacher mo4029getViewAttacher() {
        return getViewAttacher();
    }

    public /* synthetic */ YLVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YLVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mAspectRatioFrameLayoutHelper = LazyKt.lazy(new Function0<AspectRatioFrameLayoutHelper>() { // from class: com.common.support.imagepicker.preview.component.video.widget.YLVideoView$mAspectRatioFrameLayoutHelper$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AspectRatioFrameLayoutHelper invoke() {
                return new AspectRatioFrameLayoutHelper();
            }
        });
        this.videoListener = new MyListener();
        this.showBottomBar = true;
        this.viewAttacher = LazyKt.lazy(new Function0<MyViewAttacher>() { // from class: com.common.support.imagepicker.preview.component.video.widget.YLVideoView$viewAttacher$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final YLVideoView.MyViewAttacher invoke() {
                return this.this$0.new MyViewAttacher();
            }
        });
        this.enableZoom = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.preview_YLVideoView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…review_YLVideoView, 0, 0)");
            this.showBottomBar = typedArrayObtainStyledAttributes.getBoolean(R.styleable.preview_YLVideoView_show_bottom_bar, true);
            this.enableZoom = typedArrayObtainStyledAttributes.getBoolean(R.styleable.preview_YLVideoView_enable_zoom, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        initRatioContainer();
        initTextureView();
        initCoverView();
    }
}
