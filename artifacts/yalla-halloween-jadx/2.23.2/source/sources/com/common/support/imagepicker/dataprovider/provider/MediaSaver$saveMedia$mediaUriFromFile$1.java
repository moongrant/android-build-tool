package com.common.support.imagepicker.dataprovider.provider;

import android.content.Context;
import android.net.Uri;
import com.common.support.imagepicker.dataprovider.utils.MediaScannerUtil;
import java.io.Closeable;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/net/Uri;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.common.support.imagepicker.dataprovider.provider.MediaSaver$saveMedia$mediaUriFromFile$1", f = "MediaSaver.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
public final class MediaSaver$saveMedia$mediaUriFromFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ String $contentType;
    final /* synthetic */ Context $context;
    final /* synthetic */ MediaSaver.BaseInput $input;
    final /* synthetic */ Uri $mediaUri;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSaver$saveMedia$mediaUriFromFile$1(Uri uri, MediaSaver.BaseInput baseInput, Context context, String str, Continuation<? super MediaSaver$saveMedia$mediaUriFromFile$1> continuation) {
        super(2, continuation);
        this.$mediaUri = uri;
        this.$input = baseInput;
        this.$context = context;
        this.$contentType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MediaSaver$saveMedia$mediaUriFromFile$1(this.$mediaUri, this.$input, this.$context, this.$contentType, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Closeable closeable;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FileOutputStream fileOutputStream = new FileOutputStream(this.$mediaUri.getPath());
            MediaSaver.BaseInput baseInput = this.$input;
            Context context = this.$context;
            Uri uri = this.$mediaUri;
            String str = this.$contentType;
            try {
                baseInput.writeInto(fileOutputStream);
                MediaScannerUtil mediaScannerUtil = MediaScannerUtil.INSTANCE;
                String path = uri.getPath();
                Intrinsics.checkNotNull(path);
                this.L$0 = fileOutputStream;
                this.label = 1;
                Object objScanFile = mediaScannerUtil.scanFile(context, new String[]{path}, new String[]{str}, this);
                if (objScanFile == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeable = fileOutputStream;
                obj = objScanFile;
            } catch (Throwable th2) {
                closeable = fileOutputStream;
                th = th2;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(closeable, th);
                    throw th4;
                }
            }
        }
        Uri uri2 = (Uri) obj;
        CloseableKt.closeFinally(closeable, null);
        return uri2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Uri> continuation) {
        return ((MediaSaver$saveMedia$mediaUriFromFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
