package com.common.support.roomgiftplayer.download;

import com.common.support.roomgiftplayer.VideoModel;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p393o0Oo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1", f = "RoomGiftVideoPlayDownloadManager.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
public final class RoomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ VideoModel $videoModel;
    int label;

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1$1", f = "RoomGiftVideoPlayDownloadManager.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        final /* synthetic */ VideoModel $videoModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VideoModel videoModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$videoModel = videoModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$videoModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String url = this.$videoModel.getUrl();
                String fileNameByUrl = this.$videoModel.getFileNameByUrl();
                this.label = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new o00Oo0(fileNameByUrl, url, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super File> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1(VideoModel videoModel, Continuation<? super RoomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1> continuation) {
        super(2, continuation);
        this.$videoModel = videoModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RoomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1(this.$videoModel, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long downloadTimeOut = RoomGiftVideoPlayDownloadManager.INSTANCE.getDownloadTimeOut();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$videoModel, null);
            this.label = 1;
            obj = TimeoutKt.withTimeoutOrNull(downloadTimeOut, anonymousClass1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super File> continuation) {
        return ((RoomGiftVideoPlayDownloadManager$startDownLoad$2$downLoadResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
