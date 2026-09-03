package com.common.support.roomgiftplayer.view;

import com.common.support.roomgiftplayer.VideoModel;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.common.support.roomgiftplayer.view.AlphaVideoView$play$2$1", f = "AlphaVideoView.kt", i = {0, 0, 0, 0}, l = {99}, m = "invokeSuspend", n = {"$this$launch", "dataSource", "it", "i"}, s = {"L$0", "L$1", "L$6", "I$0"})
public final class AlphaVideoView$play$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $localFile;
    final /* synthetic */ CancellableContinuation<Boolean> $playVideoContainer;
    final /* synthetic */ VideoModel $videoModel;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ AlphaVideoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlphaVideoView$play$2$1(File file, AlphaVideoView alphaVideoView, CancellableContinuation<? super Boolean> cancellableContinuation, VideoModel videoModel, Continuation<? super AlphaVideoView$play$2$1> continuation) {
        super(2, continuation);
        this.$localFile = file;
        this.this$0 = alphaVideoView;
        this.$playVideoContainer = cancellableContinuation;
        this.$videoModel = videoModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AlphaVideoView$play$2$1 alphaVideoView$play$2$1 = new AlphaVideoView$play$2$1(this.$localFile, this.this$0, this.$playVideoContainer, this.$videoModel, continuation);
        alphaVideoView$play$2$1.L$0 = obj;
        return alphaVideoView$play$2$1;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x015e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x015f  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x015f -> B:49:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01b6 -> B:51:0x01be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.common.support.roomgiftplayer.view.AlphaVideoView$play$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AlphaVideoView$play$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
