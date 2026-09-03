package com.common.support.imagepicker.mediaedit.utils;

import android.content.Context;
import android.net.Uri;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.dataprovider.entities.AlbumImage;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import java.io.File;
import java.io.FileNotFoundException;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor$ImageTask$start$1", f = "MediaEditPostProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaEditPostProcessor$ImageTask$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MediaEditPostProcessor.ImageTask this$0;
    final /* synthetic */ MediaEditPostProcessor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEditPostProcessor$ImageTask$start$1(MediaEditPostProcessor.ImageTask imageTask, MediaEditPostProcessor mediaEditPostProcessor, Continuation<? super MediaEditPostProcessor$ImageTask$start$1> continuation) {
        super(2, continuation);
        this.this$0 = imageTask;
        this.this$1 = mediaEditPostProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MediaEditPostProcessor$ImageTask$start$1(this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws FileNotFoundException {
        Uri contentUri;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AlbumItem originItem = this.this$0.getInput().getOriginItem();
        File outPutDir = this.this$1.getOutPutDir();
        if (!outPutDir.exists() && !outPutDir.mkdirs()) {
            ImagePickerLogUtil.d("MediaEditPostProcessor", "ImageTask failed: mkdirs failed");
            this.this$0.setComplete(null);
            return Unit.INSTANCE;
        }
        if (this.this$0.getNeedCompress()) {
            this.this$0.setComplete(null);
            return Unit.INSTANCE;
        }
        if (this.this$0.getNeedDeduplication()) {
            this.this$0.setComplete(originItem);
            return Unit.INSTANCE;
        }
        int[] imageWidthHeight = ImageUtils.INSTANCE.getImageWidthHeight(this.this$1.context, originItem.getContentUri());
        String rootPath = this.this$0.getRootPath();
        if (rootPath == null || rootPath.length() == 0) {
            contentUri = originItem.getContentUri();
        } else {
            FileUtils fileUtils = FileUtils.INSTANCE;
            Context context = this.this$1.context;
            Uri contentUri2 = originItem.getContentUri();
            String absolutePath = outPutDir.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "outputDir.absolutePath");
            contentUri = fileUtils.copy(context, contentUri2, absolutePath);
            if (contentUri == null) {
                contentUri = originItem.getContentUri();
            }
        }
        this.this$0.setComplete(new AlbumImage(originItem.getId(), contentUri, originItem.getTitle(), originItem.getName(), originItem.getSize(), imageWidthHeight[0], imageWidthHeight[1], originItem.getMimeType(), originItem.getDate(), originItem.getBucketId(), originItem.getBucketName()));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MediaEditPostProcessor$ImageTask$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
