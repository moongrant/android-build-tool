package com.common.support.roomgiftplayer.view;

import android.graphics.Bitmap;
import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.VideoType;
import com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager;
import com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo;
import com.yy.yyeva.mix.EvaSrc;
import com.yy.yyeva.mix.OooO0OO;
import java.io.File;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p607o0oo0OOo.k1;
import p610o0oo0Ooo.q1;
import p610o0oo0Ooo.r1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.common.support.roomgiftplayer.view.YYEvaVideoView$play$2$1", f = "YYEvaVideoView.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class YYEvaVideoView$play$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GiftPlayReplaceInfo $giftPlayReplaceInfo;
    final /* synthetic */ File $localFile;
    final /* synthetic */ CancellableContinuation<Boolean> $playVideoContainer;
    final /* synthetic */ VideoModel $videoModel;
    int label;
    final /* synthetic */ YYEvaVideoView this$0;

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.view.YYEvaVideoView$play$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.view.YYEvaVideoView$play$2$1$1", f = "YYEvaVideoView.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GiftPlayReplaceInfo $giftPlayReplaceInfo;
        int label;
        final /* synthetic */ YYEvaVideoView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(YYEvaVideoView yYEvaVideoView, GiftPlayReplaceInfo giftPlayReplaceInfo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = yYEvaVideoView;
            this.$giftPlayReplaceInfo = giftPlayReplaceInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$giftPlayReplaceInfo, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                YYEvaVideoView yYEvaVideoView = this.this$0;
                GiftPlayReplaceInfo giftPlayReplaceInfo = this.$giftPlayReplaceInfo;
                this.label = 1;
                if (yYEvaVideoView.createGiftInfo(giftPlayReplaceInfo, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public YYEvaVideoView$play$2$1(File file, YYEvaVideoView yYEvaVideoView, CancellableContinuation<? super Boolean> cancellableContinuation, GiftPlayReplaceInfo giftPlayReplaceInfo, VideoModel videoModel, Continuation<? super YYEvaVideoView$play$2$1> continuation) {
        super(2, continuation);
        this.$localFile = file;
        this.this$0 = yYEvaVideoView;
        this.$playVideoContainer = cancellableContinuation;
        this.$giftPlayReplaceInfo = giftPlayReplaceInfo;
        this.$videoModel = videoModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new YYEvaVideoView$play$2$1(this.$localFile, this.this$0, this.$playVideoContainer, this.$giftPlayReplaceInfo, this.$videoModel, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$localFile.exists()) {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("文件不存在 跳过任务 filePath = " + this.$localFile);
                this.this$0.playJob = null;
                CancellableContinuation<Boolean> cancellableContinuation = this.$playVideoContainer;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m4213constructorimpl(Boxing.boxBoolean(false)));
                return Unit.INSTANCE;
            }
            GiftPlayReplaceInfo giftPlayReplaceInfo = this.$giftPlayReplaceInfo;
            if (giftPlayReplaceInfo != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, giftPlayReplaceInfo, null);
                this.label = 1;
                if (TimeoutKt.withTimeoutOrNull(30000L, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        YYEvaVideoView yYEvaVideoView = this.this$0;
        final GiftPlayReplaceInfo giftPlayReplaceInfo2 = this.$giftPlayReplaceInfo;
        yYEvaVideoView.setFetchResource(new r1() { // from class: com.common.support.roomgiftplayer.view.YYEvaVideoView$play$2$1.2
            @Override // p610o0oo0Ooo.r1
            public void releaseSrc(@NotNull List<OooO0OO> resources) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                Iterator<T> it = resources.iterator();
                while (it.hasNext()) {
                    Bitmap bitmap = ((OooO0OO) it.next()).f32970OooO0O0;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }

            @Override // p610o0oo0Ooo.r1
            public void setImage(@NotNull OooO0OO resource, @NotNull Function2<? super Bitmap, ? super EvaSrc.FitType, Unit> result) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(result, "result");
                GiftPlayReplaceInfo giftPlayReplaceInfo3 = giftPlayReplaceInfo2;
                if (giftPlayReplaceInfo3 == null) {
                    result.invoke(null, null);
                    return;
                }
                GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo fromImage = giftPlayReplaceInfo3.getFromImage(resource.f32969OooO00o);
                if (fromImage != null) {
                    result.invoke(fromImage.getBitmap(), null);
                } else {
                    result.invoke(null, null);
                }
            }

            @Override // p610o0oo0Ooo.r1
            public void setText(@NotNull OooO0OO resource, @NotNull Function2<? super String, ? super String, Unit> result) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(result, "result");
                GiftPlayReplaceInfo giftPlayReplaceInfo3 = giftPlayReplaceInfo2;
                if (giftPlayReplaceInfo3 == null) {
                    result.invoke(null, null);
                    return;
                }
                GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo fromText = giftPlayReplaceInfo3.getFromText(resource.f32969OooO00o);
                if (fromText != null) {
                    result.invoke(fromText.getContent(), "center");
                } else {
                    result.invoke(null, null);
                }
            }
        });
        final YYEvaVideoView yYEvaVideoView2 = this.this$0;
        final CancellableContinuation<Boolean> cancellableContinuation2 = this.$playVideoContainer;
        yYEvaVideoView2.setAnimListener(new q1() { // from class: com.common.support.roomgiftplayer.view.YYEvaVideoView$play$2$1.3
            @Override // p610o0oo0Ooo.q1
            public void onFailed(int errorType, @Nullable String errorMsg) {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("YYEvaVideoView playVideo  onFailed");
            }

            @Override // p610o0oo0Ooo.q1
            public void onVideoComplete() {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("YYEvaVideoView playVideo  onVideoComplete");
                if (yYEvaVideoView2.playJob != null) {
                    yYEvaVideoView2.playJob = null;
                }
                if (cancellableContinuation2.isActive()) {
                    CancellableContinuation<Boolean> cancellableContinuation3 = cancellableContinuation2;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation3.resumeWith(Result.m4213constructorimpl(Boolean.TRUE));
                }
            }

            @Override // p610o0oo0Ooo.q1
            public boolean onVideoConfigReady(@NotNull k1 config) {
                Intrinsics.checkNotNullParameter(config, "config");
                return true;
            }

            @Override // p610o0oo0Ooo.q1
            public void onVideoDestroy() {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("YYEvaVideoView playVideo  onVideoDestroy");
            }

            @Override // p610o0oo0Ooo.q1
            public void onVideoRender(int frameIndex, @Nullable k1 config) {
            }

            @Override // p610o0oo0Ooo.q1
            public void onVideoRestart() {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("YYEvaVideoView playVideo  onVideoRestart");
            }

            @Override // p610o0oo0Ooo.q1
            public void onVideoStart() {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("YYEvaVideoView playVideo  onVideoStart");
            }
        });
        this.this$0.setLoop(this.$videoModel.getRepeatCount() + 1);
        if (this.$videoModel.getType() == VideoType.AlphaVideo) {
            this.this$0.setDefaultMptType(1);
        } else {
            this.this$0.setDefaultMptType(3);
        }
        this.this$0.startPlay(this.$localFile);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((YYEvaVideoView$play$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
