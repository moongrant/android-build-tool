package com.common.support.roomgiftplayer.download;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.log.PlayerLogger;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p466o0OooOoo.o0O0o00O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\rJ\r\u0010!\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%J\u0019\u0010&\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010'J#\u0010(\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0002\b*R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/common/support/roomgiftplayer/download/RoomGiftVideoPlayDownloadManager;", "", "()V", "downloadTimeOut", "", "getDownloadTimeOut", "()J", "setDownloadTimeOut", "(J)V", "mCurrentDownLoadVideoModel", "Lcom/common/support/roomgiftplayer/VideoModel;", "mCurrentWaitToPlayCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "mCurrentWaitToPlayVideoModel", "mDownLoadVideoModelList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mDownloadJob", "Lkotlinx/coroutines/Job;", "playerLogger", "Lcom/common/support/roomgiftplayer/log/PlayerLogger;", "getPlayerLogger", "()Lcom/common/support/roomgiftplayer/log/PlayerLogger;", "setPlayerLogger", "(Lcom/common/support/roomgiftplayer/log/PlayerLogger;)V", "addDownloadVideo", "", "videoModel", "videoDir", "Ljava/io/File;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "addToFirst", "clearWaiting", "clearWaiting$RoomGiftVideoPlayer_release", "log", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "startDownLoad", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitToPlayVideoModel", "cancellableContinuation", "waitToPlayVideoModel$RoomGiftVideoPlayer_release", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomGiftVideoPlayDownloadManager {

    @Nullable
    private static VideoModel mCurrentDownLoadVideoModel;

    @Nullable
    private static CancellableContinuation<? super Boolean> mCurrentWaitToPlayCancellableContinuation;

    @Nullable
    private static VideoModel mCurrentWaitToPlayVideoModel;

    @Nullable
    private static Job mDownloadJob;

    @Nullable
    private static PlayerLogger playerLogger;

    @NotNull
    public static final RoomGiftVideoPlayDownloadManager INSTANCE = new RoomGiftVideoPlayDownloadManager();

    @NotNull
    private static final CopyOnWriteArrayList<VideoModel> mDownLoadVideoModelList = new CopyOnWriteArrayList<>();
    private static long downloadTimeOut = 30000;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager$addDownloadVideo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager$addDownloadVideo$1", f = "RoomGiftVideoPlayDownloadManager.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $addToFirst;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ File $videoDir;
        final /* synthetic */ VideoModel $videoModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VideoModel videoModel, File file, boolean z, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$videoModel = videoModel;
            this.$videoDir = file;
            this.$addToFirst = z;
            this.$coroutineScope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$videoModel, this.$videoDir, this.$addToFirst, this.$coroutineScope, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$videoModel.isDownloadUrl() && !this.$videoModel.existsFile(this.$videoDir) && !Intrinsics.areEqual(RoomGiftVideoPlayDownloadManager.mCurrentDownLoadVideoModel, this.$videoModel)) {
                    if (!RoomGiftVideoPlayDownloadManager.mDownLoadVideoModelList.contains(this.$videoModel)) {
                        if (this.$addToFirst) {
                            RoomGiftVideoPlayDownloadManager.mDownLoadVideoModelList.add(0, this.$videoModel);
                        } else {
                            RoomGiftVideoPlayDownloadManager.mDownLoadVideoModelList.add(this.$videoModel);
                        }
                        RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager = RoomGiftVideoPlayDownloadManager.INSTANCE;
                        CoroutineScope coroutineScope = this.$coroutineScope;
                        this.label = 1;
                        if (roomGiftVideoPlayDownloadManager.startDownLoad(coroutineScope, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (this.$addToFirst) {
                        RoomGiftVideoPlayDownloadManager.mDownLoadVideoModelList.remove(this.$videoModel);
                        RoomGiftVideoPlayDownloadManager.mDownLoadVideoModelList.add(0, this.$videoModel);
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager$startDownLoad$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager$startDownLoad$2", f = "RoomGiftVideoPlayDownloadManager.kt", i = {0}, l = {72, 100}, m = "invokeSuspend", n = {"videoModel"}, s = {"L$0"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CoroutineScope coroutineScope, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$coroutineScope = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$coroutineScope, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00d5 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            VideoModel videoModel;
            RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager;
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    videoModel = (VideoModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            videoModel = (VideoModel) RoomGiftVideoPlayDownloadManager.mDownLoadVideoModelList.remove(0);
            File file = o0O0o00O.f47844OooO00o;
            if (!videoModel.existsFile(o0O0o00O.OooO0OO())) {
                RoomGiftVideoPlayDownloadManager.mCurrentDownLoadVideoModel = videoModel;
                RoomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1 roomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1 = new RoomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1(videoModel, null);
                this.L$0 = videoModel;
                this.label = 1;
                obj = OooOOO.OooO0Oo(roomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            RoomGiftVideoPlayDownloadManager.mDownloadJob = null;
            roomGiftVideoPlayDownloadManager = RoomGiftVideoPlayDownloadManager.INSTANCE;
            coroutineScope = this.$coroutineScope;
            this.L$0 = null;
            this.label = 2;
            if (roomGiftVideoPlayDownloadManager.startDownLoad(coroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            File file2 = (File) obj;
            RoomGiftVideoPlayDownloadManager.mCurrentDownLoadVideoModel = null;
            if (file2 != null) {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("下载成功: " + videoModel);
            } else {
                RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager2 = RoomGiftVideoPlayDownloadManager.INSTANCE;
                roomGiftVideoPlayDownloadManager2.log("下载失败: " + videoModel);
                if (videoModel == null) {
                    roomGiftVideoPlayDownloadManager2.log("下载失败:下载超时");
                }
            }
            if (RoomGiftVideoPlayDownloadManager.mCurrentWaitToPlayCancellableContinuation != null && Intrinsics.areEqual(RoomGiftVideoPlayDownloadManager.mCurrentWaitToPlayVideoModel, videoModel)) {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("下载成功并唤起 " + videoModel);
                CancellableContinuation cancellableContinuation = RoomGiftVideoPlayDownloadManager.mCurrentWaitToPlayCancellableContinuation;
                Intrinsics.checkNotNull(cancellableContinuation);
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m4215constructorimpl(Boxing.boxBoolean(true)));
                RoomGiftVideoPlayDownloadManager.mCurrentWaitToPlayVideoModel = null;
                RoomGiftVideoPlayDownloadManager.mCurrentWaitToPlayCancellableContinuation = null;
            }
            RoomGiftVideoPlayDownloadManager.mDownloadJob = null;
            roomGiftVideoPlayDownloadManager = RoomGiftVideoPlayDownloadManager.INSTANCE;
            coroutineScope = this.$coroutineScope;
            this.L$0 = null;
            this.label = 2;
            if (roomGiftVideoPlayDownloadManager.startDownLoad(coroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private RoomGiftVideoPlayDownloadManager() {
    }

    public static /* synthetic */ void addDownloadVideo$default(RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager, VideoModel videoModel, File file, CoroutineScope coroutineScope, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        roomGiftVideoPlayDownloadManager.addDownloadVideo(videoModel, file, coroutineScope, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object startDownLoad(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        log("startDownLoad");
        if (mDownloadJob != null || mDownLoadVideoModelList.isEmpty()) {
            log("当前已有下载 或 列表为空");
            return Unit.INSTANCE;
        }
        mDownloadJob = OooOOO.OooO0OO(coroutineScope, new AnonymousClass2(coroutineScope, null));
        return Unit.INSTANCE;
    }

    public final void addDownloadVideo(@NotNull VideoModel videoModel, @NotNull File videoDir, @NotNull CoroutineScope coroutineScope, boolean addToFirst) {
        Intrinsics.checkNotNullParameter(videoModel, "videoModel");
        Intrinsics.checkNotNullParameter(videoDir, "videoDir");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        OooOOO.OooO0OO(coroutineScope, new AnonymousClass1(videoModel, videoDir, addToFirst, coroutineScope, null));
    }

    public final void clearWaiting$RoomGiftVideoPlayer_release() {
        mCurrentWaitToPlayVideoModel = null;
        mCurrentWaitToPlayCancellableContinuation = null;
    }

    public final long getDownloadTimeOut() {
        return downloadTimeOut;
    }

    @Nullable
    public final PlayerLogger getPlayerLogger() {
        return playerLogger;
    }

    public final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        PlayerLogger playerLogger2 = playerLogger;
        if (playerLogger2 != null) {
            playerLogger2.log(message);
        }
    }

    public final void setDownloadTimeOut(long j) {
        downloadTimeOut = j;
    }

    public final void setPlayerLogger(@Nullable PlayerLogger playerLogger2) {
        playerLogger = playerLogger2;
    }

    public final void waitToPlayVideoModel$RoomGiftVideoPlayer_release(@NotNull VideoModel videoModel, @NotNull CancellableContinuation<? super Boolean> cancellableContinuation) {
        Intrinsics.checkNotNullParameter(videoModel, "videoModel");
        Intrinsics.checkNotNullParameter(cancellableContinuation, "cancellableContinuation");
        CopyOnWriteArrayList<VideoModel> copyOnWriteArrayList = mDownLoadVideoModelList;
        if (copyOnWriteArrayList.contains(videoModel)) {
            copyOnWriteArrayList.remove(videoModel);
            copyOnWriteArrayList.add(0, videoModel);
        }
        if (Intrinsics.areEqual(mCurrentDownLoadVideoModel, videoModel) || copyOnWriteArrayList.contains(videoModel)) {
            mCurrentWaitToPlayVideoModel = videoModel;
            mCurrentWaitToPlayCancellableContinuation = cancellableContinuation;
            return;
        }
        log("下载失败了，直接唤起" + mCurrentDownLoadVideoModel);
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m4215constructorimpl(Boolean.TRUE));
    }
}
