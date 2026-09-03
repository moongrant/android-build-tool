package com.common.support.roomgiftplayer.download;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O0;
import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.VideoType;
import com.facebook.internal.AnalyticsEvents;
import com.yalla.yalla.download.fs.MediaType;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p390o0Oo.OooO0OO;
import p415o0Oo0ooO.w0;
import p415o0Oo0ooO.x0;
import p416o0Oo0ooo.y0;
import p416o0Oo0ooo.z0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\\\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\u0006J\u0006\u0010\u0011\u001a\u00020\u000bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager;", "", "", "url", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "progress", "", "progressListener", "Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState;", "state", "onDownLoadListener", "startDownLoad", "cancelDownLoadJob", "Lkotlinx/coroutines/Job;", "mDownloadJob", "Lkotlinx/coroutines/Job;", "Lo0Oo0ooO/x0;", "mDownloadSingleAsyncTask", "Lo0Oo0ooO/x0;", "", "downloadTimeOut", "J", "getDownloadTimeOut", "()J", "setDownloadTimeOut", "(J)V", "<init>", "()V", "DownLoadState", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 8, 0})
public final class VideoDownLoadManager {

    @Nullable
    private static Job mDownloadJob;

    @Nullable
    private static x0 mDownloadSingleAsyncTask;

    @NotNull
    public static final VideoDownLoadManager INSTANCE = new VideoDownLoadManager();
    private static long downloadTimeOut = 10000;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState;", "", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "FileExits", "Success", "Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState$Failed;", "Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState$FileExits;", "Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState$Success;", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface DownLoadState {

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState$Failed;", "Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState;", "()V", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed implements DownLoadState {
            public static final int $stable = 0;

            @NotNull
            public static final Failed INSTANCE = new Failed();

            private Failed() {
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState$FileExits;", "Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState;", "()V", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FileExits implements DownLoadState {
            public static final int $stable = 0;

            @NotNull
            public static final FileExits INSTANCE = new FileExits();

            private FileExits() {
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState$Success;", "Lcom/common/support/roomgiftplayer/download/VideoDownLoadManager$DownLoadState;", "()V", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success implements DownLoadState {
            public static final int $stable = 0;

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
            }
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.download.VideoDownLoadManager$startDownLoad$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.download.VideoDownLoadManager$startDownLoad$1", f = "VideoDownLoadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<DownLoadState, Unit> $onDownLoadListener;
        final /* synthetic */ Function1<Integer, Unit> $progressListener;
        final /* synthetic */ VideoModel $videoModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(VideoModel videoModel, Function1<? super Integer, Unit> function1, Function1<? super DownLoadState, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$videoModel = videoModel;
            this.$progressListener = function1;
            this.$onDownLoadListener = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(Function1 function1, int i) {
            function1.invoke(Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(Function1 function1, boolean z, String str) {
            String strOooO00o;
            if (!z) {
                function1.invoke(DownLoadState.Failed.INSTANCE);
            } else if (str != null) {
                File file = y0.f45407OooO00o;
                File file2 = new File(str);
                Intrinsics.checkNotNullParameter(file2, "file");
                if (Build.VERSION.SDK_INT < 29) {
                    OooO0OO.OooO00o(o000O0.OooO00o(), file2.getAbsolutePath());
                    strOooO00o = file2.getAbsolutePath();
                } else {
                    strOooO00o = z0.OooO00o(o000O0.OooO00o(), file2, MediaType.Video);
                }
                String strValueOf = String.valueOf(strOooO00o);
                if (!(strValueOf.length() == 0)) {
                    String lowerCase = strValueOf.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (!Intrinsics.areEqual("null", lowerCase)) {
                        function1.invoke(DownLoadState.Success.INSTANCE);
                    }
                }
                function1.invoke(DownLoadState.Failed.INSTANCE);
                return;
            }
            VideoDownLoadManager.mDownloadJob = null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$videoModel, this.$progressListener, this.$onDownLoadListener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            VideoDownLoadManager videoDownLoadManager = VideoDownLoadManager.INSTANCE;
            x0 x0VarOooO0O0 = com.google.gson.internal.OooO00o.OooO0O0((File) y0.f45415OooOO0.getValue());
            Intrinsics.checkNotNullExpressionValue(x0VarOooO0O0, "download(mediaVideo)");
            x0VarOooO0O0.f45397OooO = w0.OooO00o(System.currentTimeMillis() + this.$videoModel.getFileNameByUrl());
            final Function1<Integer, Unit> function1 = this.$progressListener;
            x0VarOooO0O0.f45403OooO0o0 = new oo0o0O0.OooO00o() { // from class: com.common.support.roomgiftplayer.download.OooO00o
                @Override // oo0o0O0.OooO00o
                public final void progress(int i) {
                    VideoDownLoadManager.AnonymousClass1.invokeSuspend$lambda$0(function1, i);
                }
            };
            final Function1<DownLoadState, Unit> function2 = this.$onDownLoadListener;
            x0VarOooO0O0.f45401OooO0Oo = new oo0o0O0.OooO0OO() { // from class: com.common.support.roomgiftplayer.download.OooO0O0
                @Override // oo0o0O0.OooO0OO
                public final void result(boolean z, Object obj2) {
                    VideoDownLoadManager.AnonymousClass1.invokeSuspend$lambda$2(function2, z, (String) obj2);
                }
            };
            VideoDownLoadManager.mDownloadSingleAsyncTask = x0VarOooO0O0;
            x0 x0Var = VideoDownLoadManager.mDownloadSingleAsyncTask;
            if (x0Var != null) {
                x0Var.OooO0O0(this.$videoModel.getUrl());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private VideoDownLoadManager() {
    }

    public final void cancelDownLoadJob() {
        Job job = mDownloadJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        x0 x0Var = mDownloadSingleAsyncTask;
        if (x0Var != null) {
            x0Var.cancel(true);
        }
        mDownloadJob = null;
    }

    public final long getDownloadTimeOut() {
        return downloadTimeOut;
    }

    public final void setDownloadTimeOut(long j) {
        downloadTimeOut = j;
    }

    public final void startDownLoad(@NotNull String url, @NotNull CoroutineScope coroutineScope, @NotNull Function1<? super Integer, Unit> progressListener, @NotNull Function1<? super DownLoadState, Unit> onDownLoadListener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(onDownLoadListener, "onDownLoadListener");
        if (mDownloadJob != null) {
            return;
        }
        mDownloadJob = OooOOO.OooO0O0(coroutineScope, new AnonymousClass1(new VideoModel(url, VideoType.FeedVideo, 0, null, 12, null), progressListener, onDownLoadListener, null));
    }
}
