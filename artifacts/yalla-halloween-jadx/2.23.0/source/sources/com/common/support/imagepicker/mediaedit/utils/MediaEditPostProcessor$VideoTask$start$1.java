package com.common.support.imagepicker.mediaedit.utils;

import android.content.Context;
import android.net.Uri;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumVideo;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Pair;
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
@DebugMetadata(c = "com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor$VideoTask$start$1", f = "MediaEditPostProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaEditPostProcessor$VideoTask$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MediaEditPostProcessor.VideoTask this$0;
    final /* synthetic */ MediaEditPostProcessor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEditPostProcessor$VideoTask$start$1(MediaEditPostProcessor.VideoTask videoTask, MediaEditPostProcessor mediaEditPostProcessor, Continuation<? super MediaEditPostProcessor$VideoTask$start$1> continuation) {
        super(2, continuation);
        this.this$0 = videoTask;
        this.this$1 = mediaEditPostProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MediaEditPostProcessor$VideoTask$start$1(this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws IOException {
        Uri contentUri;
        long jLongValue;
        MediaEditPostProcessor$VideoTask$start$1 mediaEditPostProcessor$VideoTask$start$1 = this;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (mediaEditPostProcessor$VideoTask$start$1.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AlbumItem originItem = mediaEditPostProcessor$VideoTask$start$1.this$0.getInput().getOriginItem();
        Intrinsics.checkNotNull(originItem, "null cannot be cast to non-null type com.common.support.imagepicker.dataprovider.entities.AlbumVideo");
        AlbumVideo albumVideo = (AlbumVideo) originItem;
        File outPutDir = mediaEditPostProcessor$VideoTask$start$1.this$1.getOutPutDir();
        if (!outPutDir.exists() && !outPutDir.mkdirs()) {
            ImagePickerLogUtil.d("MediaEditPostProcessor", "VideoTask failed: mkdirs failed");
            mediaEditPostProcessor$VideoTask$start$1.this$0.setComplete(null);
            return Unit.INSTANCE;
        }
        if (mediaEditPostProcessor$VideoTask$start$1.this$0.getInput().getVideoCrop() == null) {
            MediaEditPostProcessor.VideoTask videoTask = mediaEditPostProcessor$VideoTask$start$1.this$0;
            videoTask.setComplete(videoTask.getInput().getOriginItem());
            return Unit.INSTANCE;
        }
        if (mediaEditPostProcessor$VideoTask$start$1.this$0.getNeedCompress()) {
            mediaEditPostProcessor$VideoTask$start$1 = this;
        } else if (mediaEditPostProcessor$VideoTask$start$1.this$0.getInput().getVideoCrop() == null) {
            MediaUtils mediaUtils = MediaUtils.INSTANCE;
            Pair<Integer, Integer> pairExtractVideoSize = mediaUtils.extractVideoSize(mediaEditPostProcessor$VideoTask$start$1.this$1.context, albumVideo.getContentUri());
            String rootPath = mediaEditPostProcessor$VideoTask$start$1.this$0.getRootPath();
            if (rootPath == null || rootPath.length() == 0) {
                contentUri = albumVideo.getContentUri();
            } else {
                FileUtils fileUtils = FileUtils.INSTANCE;
                Context context = mediaEditPostProcessor$VideoTask$start$1.this$1.context;
                Uri contentUri2 = albumVideo.getContentUri();
                String absolutePath = outPutDir.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "outputDir.absolutePath");
                contentUri = fileUtils.copy(context, contentUri2, absolutePath);
                if (contentUri == null) {
                    contentUri = albumVideo.getContentUri();
                }
            }
            Uri uri = contentUri;
            MediaEditPostProcessor.VideoTask videoTask2 = mediaEditPostProcessor$VideoTask$start$1.this$0;
            long id = albumVideo.getId();
            String title = albumVideo.getTitle();
            String name = albumVideo.getName();
            long size = albumVideo.getSize();
            int iIntValue = pairExtractVideoSize.getFirst().intValue();
            int iIntValue2 = pairExtractVideoSize.getSecond().intValue();
            String mimeType = albumVideo.getMimeType();
            long date = albumVideo.getDate();
            long bucketId = albumVideo.getBucketId();
            String bucketName = albumVideo.getBucketName();
            if (albumVideo.getDuration() > 0) {
                jLongValue = albumVideo.getDuration();
            } else {
                Long videoDuration = mediaUtils.getVideoDuration(mediaEditPostProcessor$VideoTask$start$1.this$1.context, albumVideo.getContentUri());
                jLongValue = videoDuration != null ? videoDuration.longValue() : albumVideo.getDuration();
            }
            videoTask2.setComplete(new AlbumVideo(id, uri, title, name, size, iIntValue, iIntValue2, mimeType, date, bucketId, bucketName, jLongValue));
            return Unit.INSTANCE;
        }
        mediaEditPostProcessor$VideoTask$start$1.this$0.setComplete(null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MediaEditPostProcessor$VideoTask$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
