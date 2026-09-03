package com.common.support.imagepicker.mediaedit.utils;

import android.graphics.Bitmap;
import android.net.Uri;
import com.common.support.imagepicker.base.utils.ImagePickerContextUtil;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.dataprovider.entities.AlbumImage;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor$ImageEditTask$start$1", f = "MediaEditPostProcessor.kt", i = {0, 0}, l = {192}, m = "invokeSuspend", n = {"$this$launch", "outputBitmap"}, s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMediaEditPostProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEditPostProcessor.kt\ncom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$ImageEditTask$start$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,372:1\n36#2:373\n*S KotlinDebug\n*F\n+ 1 MediaEditPostProcessor.kt\ncom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$ImageEditTask$start$1\n*L\n246#1:373\n*E\n"})
public final class MediaEditPostProcessor$ImageEditTask$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MediaEditPostProcessor.ImageEditTask this$0;
    final /* synthetic */ MediaEditPostProcessor this$1;

    /* JADX INFO: renamed from: com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor$ImageEditTask$start$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor$ImageEditTask$start$1$1", f = "MediaEditPostProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Bitmap> $outputBitmap;
        int label;
        final /* synthetic */ MediaEditPostProcessor.ImageEditTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<Bitmap> objectRef, MediaEditPostProcessor.ImageEditTask imageEditTask, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$outputBitmap = objectRef;
            this.this$0 = imageEditTask;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$outputBitmap, this.this$0, continuation);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, android.graphics.Bitmap] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef<Bitmap> objectRef = this.$outputBitmap;
            objectRef.element = OffScreenRender.INSTANCE.getCropBitmap(objectRef.element, this.this$0.getInput().getCrop());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEditPostProcessor$ImageEditTask$start$1(MediaEditPostProcessor.ImageEditTask imageEditTask, MediaEditPostProcessor mediaEditPostProcessor, Continuation<? super MediaEditPostProcessor$ImageEditTask$start$1> continuation) {
        super(2, continuation);
        this.this$0 = imageEditTask;
        this.this$1 = mediaEditPostProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MediaEditPostProcessor$ImageEditTask$start$1 mediaEditPostProcessor$ImageEditTask$start$1 = new MediaEditPostProcessor$ImageEditTask$start$1(this.this$0, this.this$1, continuation);
        mediaEditPostProcessor$ImageEditTask$start$1.L$0 = obj;
        return mediaEditPostProcessor$ImageEditTask$start$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, android.graphics.Bitmap] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref.ObjectRef objectRef;
        Object objM4215constructorimpl;
        Pair pair;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                ImagePickerLogUtil.d("MediaEditPostProcessor", "current thread " + Thread.currentThread());
                objectRef = new Ref.ObjectRef();
                objectRef.element = OffScreenRender.INSTANCE.getSourceBitmap(this.this$0.getInput().getItemWrapper());
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, this.this$0, null);
                this.L$0 = coroutineScope;
                this.L$1 = objectRef;
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$1;
                ResultKt.throwOnFailure(obj);
            }
            if (objectRef.element == 0) {
                ImagePickerLogUtil.d("MediaEditPostProcessor", "ImageEditTask failed: targetBitmap == null");
                this.this$0.setComplete(null);
                return Unit.INSTANCE;
            }
            File outPutDir = this.this$1.getOutPutDir();
            if (!outPutDir.exists() && !outPutDir.mkdirs()) {
                ImagePickerLogUtil.d("MediaEditPostProcessor", "ImageEditTask failed: mkdirs failed");
                this.this$0.setComplete(null);
                return Unit.INSTANCE;
            }
            AlbumItem originItem = this.this$0.getInput().getOriginItem();
            if (this.this$0.getNeedDeduplication()) {
                if (this.this$0.getInput().getOriginItem().getWidth() <= 0 || this.this$0.getInput().getOriginItem().getHeight() <= 0) {
                    int[] imageWidthHeight2 = ImageUtils.INSTANCE.getImageWidthHeight2(this.this$1.context, this.this$0.getInput().getOriginItem().getContentUri());
                    pair = new Pair(Boxing.boxInt(imageWidthHeight2[0]), Boxing.boxInt(imageWidthHeight2[1]));
                } else {
                    pair = new Pair(Boxing.boxInt(this.this$0.getInput().getOriginItem().getWidth()), Boxing.boxInt(this.this$0.getInput().getOriginItem().getHeight()));
                }
                Bitmap bitmap = (Bitmap) objectRef.element;
                if (bitmap != null && ((Number) pair.getFirst()).intValue() == bitmap.getWidth()) {
                    Bitmap bitmap2 = (Bitmap) objectRef.element;
                    if (bitmap2 != null && ((Number) pair.getSecond()).intValue() == bitmap2.getHeight()) {
                        MediaEditPostProcessor.ImageEditTask imageEditTask = this.this$0;
                        imageEditTask.setComplete(imageEditTask.getInput().getOriginItem());
                        return Unit.INSTANCE;
                    }
                }
            }
            File file = new File(outPutDir, System.currentTimeMillis() + "." + FileUtils.INSTANCE.getFileExtension(this.this$1.context, originItem.getContentUri()));
            try {
                Result.Companion companion = Result.INSTANCE;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    Bitmap.CompressFormat compressFormat = originItem.isPng() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
                    T t = objectRef.element;
                    Intrinsics.checkNotNull(t);
                    ((Bitmap) t).compress(compressFormat, 100, fileOutputStream);
                    T t2 = objectRef.element;
                    Intrinsics.checkNotNull(t2);
                    ((Bitmap) t2).recycle();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    objM4215constructorimpl = Result.m4215constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                objM4215constructorimpl = Result.m4215constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m4221isFailureimpl(objM4215constructorimpl)) {
                ImagePickerLogUtil.d("MediaEditPostProcessor", "ImageEditTask failed: outputBitmap to File Failed");
                this.this$0.setComplete(null);
                return Unit.INSTANCE;
            }
            Uri uriFromFile = Uri.fromFile(file);
            int[] imageWidthHeight = ImageUtils.INSTANCE.getImageWidthHeight(file);
            MediaUtils mediaUtils = MediaUtils.INSTANCE;
            mediaUtils.sendBroadcastToSystemMedia(this.this$1.context, uriFromFile);
            MediaEditPostProcessor.ImageEditTask imageEditTask2 = this.this$0;
            long id = originItem.getId();
            String title = originItem.getTitle();
            String name = originItem.getName();
            long length = file.length();
            int i2 = imageWidthHeight[0];
            int i3 = imageWidthHeight[1];
            String mimeType = mediaUtils.getMimeType(ImagePickerContextUtil.INSTANCE.getSAppContext(), uriFromFile);
            if (mimeType == null) {
                mimeType = originItem.getMimeType();
            }
            imageEditTask2.setComplete(new AlbumImage(id, uriFromFile, title, name, length, i2, i3, mimeType, new Date().getTime(), -1L, ""));
        } catch (Exception e) {
            ImagePickerLogUtil.e("MediaEditPostProcessor", "ImageEditTask failed: " + e);
            this.this$0.setComplete(null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MediaEditPostProcessor$ImageEditTask$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
