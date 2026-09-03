package com.common.support.roomgiftplayer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.o000OO00;
import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager;
import com.common.support.roomgiftplayer.player.ExoPlayerImpl;
import com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import com.ss.ugc.android.alpha_player.controller.PlayerController;
import com.ss.ugc.android.alpha_player.model.AlphaVideoViewType;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o0OOO0O.OooO0O0;
import o0OOO0O.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0016J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0010H\u0017J\b\u0010*\u001a\u00020\u0010H\u0017J \u0010+\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020#0-2\b\b\u0002\u0010.\u001a\u00020#H\u0002J\u001c\u0010/\u001a\u00020\u00102\b\b\u0002\u00100\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00020#H\u0007J\u0010\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020#H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@GX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/common/support/roomgiftplayer/view/AlphaVideoView;", "Landroid/widget/FrameLayout;", "Lcom/common/support/roomgiftplayer/view/inter/IRoomGiftVideoView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "exoPlayer", "Lcom/common/support/roomgiftplayer/player/ExoPlayerImpl;", "onPlayStopListener", "Lkotlin/Function0;", "", "playJob", "Lkotlinx/coroutines/Job;", "playerController", "Lcom/ss/ugc/android/alpha_player/controller/PlayerController;", "timeOut", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "volume", "getVolume", "()F", "setVolume", "(F)V", "getView", "Landroid/view/View;", "init", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "play", "", "localFile", "Ljava/io/File;", "videoModel", "Lcom/common/support/roomgiftplayer/VideoModel;", "(Ljava/io/File;Lcom/common/support/roomgiftplayer/VideoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "reset", "resumeCoroutine", "playVideoContainer", "Lkotlinx/coroutines/CancellableContinuation;", ReportItem.QualityKeyResult, "setAudioStreamType", "usage", "handleAudioFocus", "showVisible", "visible", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlphaVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaVideoView.kt\ncom/common/support/roomgiftplayer/view/AlphaVideoView\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,184:1\n314#2,11:185\n*S KotlinDebug\n*F\n+ 1 AlphaVideoView.kt\ncom/common/support/roomgiftplayer/view/AlphaVideoView\n*L\n76#1:185,11\n*E\n"})
public final class AlphaVideoView extends FrameLayout implements IRoomGiftVideoView {
    public static final int $stable = 8;
    private CoroutineScope coroutineScope;

    @NotNull
    private final ExoPlayerImpl exoPlayer;

    @Nullable
    private Function0<Unit> onPlayStopListener;

    @Nullable
    private Job playJob;

    @Nullable
    private PlayerController playerController;
    private int timeOut;

    @FloatRange(from = 0.0d, to = 1.0d)
    private float volume;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlphaVideoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeCoroutine(CancellableContinuation<? super Boolean> playVideoContainer, boolean result) {
        this.playJob = null;
        this.onPlayStopListener = null;
        if (playVideoContainer.isActive()) {
            playVideoContainer.resumeWith(Result.m4213constructorimpl(Boolean.valueOf(result)));
        }
    }

    public static /* synthetic */ void resumeCoroutine$default(AlphaVideoView alphaVideoView, CancellableContinuation cancellableContinuation, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        alphaVideoView.resumeCoroutine(cancellableContinuation, z);
    }

    public static /* synthetic */ void setAudioStreamType$default(AlphaVideoView alphaVideoView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        alphaVideoView.setAudioStreamType(i, z);
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    @NotNull
    public View getView() {
        return this;
    }

    public final float getVolume() {
        return this.exoPlayer.getExoPlayer().OoooOOO();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, o0OOO0o0.OooO0OO] */
    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    public void init(@NotNull AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.coroutineScope = LifecycleOwnerKt.getLifecycleScope(activity);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        AlphaVideoViewType alphaVideoViewType = AlphaVideoViewType.GL_TEXTURE_VIEW;
        OooO0OO oooO0O0 = this.exoPlayer;
        if (oooO0O0 == null) {
            oooO0O0 = new OooO0O0();
        }
        PlayerController playerController = new PlayerController(context, activity, alphaVideoViewType, oooO0O0);
        this.playerController = playerController;
        playerController.f21859OooO0oO = new o0OOO00o.OooO0O0() { // from class: com.common.support.roomgiftplayer.view.AlphaVideoView.init.1
            @Override // o0OOO00o.OooO0O0
            public void endAction() {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("AlphaVideoView play end");
                Function0 function0 = AlphaVideoView.this.onPlayStopListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // o0OOO00o.OooO0O0
            public void onVideoSizeChanged(int videoWidth, int videoHeight, @NotNull ScaleType scaleType) {
                Intrinsics.checkNotNullParameter(scaleType, "scaleType");
            }

            @Override // o0OOO00o.OooO0O0
            public void startAction() {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("AlphaVideoView play start");
            }
        };
        PlayerController playerController2 = this.playerController;
        if (playerController2 != null) {
            ?? r5 = playerController2.f21855OooO;
            if (r5 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
            }
            r5.OooO0o(this);
        }
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    @Nullable
    public Object play(@NotNull File file, @NotNull VideoModel videoModel, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        RoomGiftVideoPlayDownloadManager.INSTANCE.log("AlphaVideoView playVideo  " + file + "  " + this.playJob);
        if (this.playJob != null) {
            return Boxing.boxBoolean(false);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope = null;
        }
        this.playJob = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new AlphaVideoView$play$2$1(file, this, cancellableContinuationImpl, videoModel, null), 2, null);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, o0OOO0o0.OooO0OO] */
    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    @MainThread
    public void release() {
        reset();
        PlayerController playerController = this.playerController;
        if (playerController != null) {
            ?? r0 = playerController.f21855OooO;
            if (r0 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
            }
            r0.OooO0o0(this);
        }
        PlayerController playerController2 = this.playerController;
        if (playerController2 != null) {
            playerController2.OooO0o(PlayerController.OooO0Oo(7, null));
        }
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    @MainThread
    public void reset() {
        Job job = this.playJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.playJob = null;
        this.onPlayStopListener = null;
        PlayerController playerController = this.playerController;
        if (playerController != null) {
            playerController.OooO0o(PlayerController.OooO0Oo(9, null));
        }
    }

    @MainThread
    public final void setAudioStreamType(int usage, boolean handleAudioFocus) {
        this.exoPlayer.setAudioStreamType(usage, handleAudioFocus);
    }

    @MainThread
    public final void setVolume(float f) {
        this.exoPlayer.getExoPlayer().OooOOOo(f);
        this.volume = f;
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    public void showVisible(boolean visible) {
        if (visible) {
            o000OO00.OooOOOO(this);
        } else {
            o000OO00.OooO0O0(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlphaVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AlphaVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AlphaVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.exoPlayer = new ExoPlayerImpl(context);
        this.timeOut = 25000;
    }
}
