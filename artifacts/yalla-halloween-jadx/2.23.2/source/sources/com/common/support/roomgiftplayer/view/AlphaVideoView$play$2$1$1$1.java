package com.common.support.roomgiftplayer.view;

import com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager;
import com.ss.ugc.android.alpha_player.controller.PlayerController;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o0OOO0O.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.common.support.roomgiftplayer.view.AlphaVideoView$play$2$1$1$1", f = "AlphaVideoView.kt", i = {}, l = {100, 185}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAlphaVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaVideoView.kt\ncom/common/support/roomgiftplayer/view/AlphaVideoView$play$2$1$1$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,184:1\n314#2,11:185\n*S KotlinDebug\n*F\n+ 1 AlphaVideoView.kt\ncom/common/support/roomgiftplayer/view/AlphaVideoView$play$2$1$1$1\n*L\n104#1:185,11\n*E\n"})
public final class AlphaVideoView$play$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ OooO00o $dataSource;
    final /* synthetic */ PlayerController $it;
    final /* synthetic */ File $localFile;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AlphaVideoView this$0;

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.view.AlphaVideoView$play$2$1$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.view.AlphaVideoView$play$2$1$1$1$1", f = "AlphaVideoView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OooO00o $dataSource;
        final /* synthetic */ PlayerController $it;
        final /* synthetic */ File $localFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(File file, PlayerController playerController, OooO00o oooO00o, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$localFile = file;
            this.$it = playerController;
            this.$dataSource = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$localFile, this.$it, this.$dataSource, continuation);
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, o0OOO0oO.OooOO0] */
        /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, o0OOO0oO.OooOO0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RoomGiftVideoPlayDownloadManager.INSTANCE.log("AlphaVideoView  开始播放 " + this.$localFile);
            PlayerController playerController = this.$it;
            OooO00o oooO00o = this.$dataSource;
            playerController.getClass();
            if (oooO00o.OooO00o()) {
                ?? r1 = playerController.f21382OooO;
                if (r1 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
                }
                r1.setVisibility(0);
                ?? r2 = playerController.f21382OooO;
                if (r2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
                }
                r2.bringToFront();
                playerController.OooO0o(PlayerController.OooO0Oo(2, oooO00o));
            } else {
                playerController.OooO0OO();
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
    public AlphaVideoView$play$2$1$1$1(File file, PlayerController playerController, OooO00o oooO00o, AlphaVideoView alphaVideoView, Continuation<? super AlphaVideoView$play$2$1$1$1> continuation) {
        super(2, continuation);
        this.$localFile = file;
        this.$it = playerController;
        this.$dataSource = oooO00o;
        this.this$0 = alphaVideoView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AlphaVideoView$play$2$1$1$1(this.$localFile, this.$it, this.$dataSource, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        }
        ResultKt.throwOnFailure(obj);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$localFile, this.$it, this.$dataSource, null);
        this.label = 1;
        if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        final AlphaVideoView alphaVideoView = this.this$0;
        final File file = this.$localFile;
        this.L$0 = alphaVideoView;
        this.L$1 = file;
        this.label = 2;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
        cancellableContinuationImpl.initCancellability();
        alphaVideoView.onPlayStopListener = new Function0<Unit>() { // from class: com.common.support.roomgiftplayer.view.AlphaVideoView$play$2$1$1$1$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("AlphaVideoView  播放结束 " + file);
                CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m4215constructorimpl(Boolean.TRUE));
                alphaVideoView.onPlayStopListener = null;
            }
        };
        obj = cancellableContinuationImpl.getResult();
        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
        return ((AlphaVideoView$play$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
