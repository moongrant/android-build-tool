package com.yalla.support.cloudfilemanager.uploader;

import com.yalla.support.cloudfilemanager.request.UploadRequest;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.support.cloudfilemanager.uploader.QiniuUploader$uploadFile$2$1$1", f = "QiniuUploader.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class QiniuUploader$uploadFile$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ UploadRequest $uploadRequest;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QiniuUploader$uploadFile$2$1$1(UploadRequest uploadRequest, Continuation<? super QiniuUploader$uploadFile$2$1$1> continuation) {
        super(2, continuation);
        this.$uploadRequest = uploadRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new QiniuUploader$uploadFile$2$1$1(this.$uploadRequest, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((QiniuUploader$uploadFile$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            File file = this.$uploadRequest.getFile();
            Intrinsics.checkNotNull(file);
            if (file.length() != 0) {
                return Unit.INSTANCE;
            }
            this.label = 1;
        } while (DelayKt.delay(200L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
