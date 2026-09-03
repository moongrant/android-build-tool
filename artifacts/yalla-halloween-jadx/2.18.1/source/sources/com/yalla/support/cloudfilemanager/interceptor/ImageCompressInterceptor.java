package com.yalla.support.cloudfilemanager.interceptor;

import com.facebook.appevents.Oooo0;
import com.yalla.support.cloudfilemanager.request.UploadRequest;
import com.yalla.support.cloudfilemanager.util.FileUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000;
import p695oO000oOO.o0O00000;
import p695oO000oOO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/yalla/support/cloudfilemanager/interceptor/ImageCompressInterceptor;", "T", "Lcom/yalla/support/cloudfilemanager/interceptor/Interceptor;", "()V", "onUpload", "", "request", "Lcom/yalla/support/cloudfilemanager/request/UploadRequest;", "fileType", "(Lcom/yalla/support/cloudfilemanager/request/UploadRequest;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ImageCompressInterceptor<T> implements Interceptor<T> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onUpload$lambda-0, reason: not valid java name */
    public static final boolean m252onUpload$lambda0(String it) {
        if (!(it == null || StringsKt.isBlank(it))) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (!StringsKt__StringsJVMKt.endsWith(it, ".gif", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.yalla.support.cloudfilemanager.interceptor.Interceptor
    @Nullable
    public Object onUpload(@NotNull UploadRequest uploadRequest, T t, @NotNull Continuation<? super Unit> continuation) {
        StringBuilder sb = new StringBuilder();
        o00O000 o00o001 = o00O000.f34346OooO00o;
        sb.append(o00O000.OooO00o().getCacheDir().getAbsolutePath());
        sb.append("/compress");
        String string = sb.toString();
        File file = new File(string);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileUtil fileUtil = FileUtil.INSTANCE;
        File file2 = uploadRequest.getFile();
        Intrinsics.checkNotNull(file2);
        String fileMimeType = fileUtil.getFileMimeType(file2);
        boolean z = false;
        File file3 = null;
        if (!StringsKt__StringsKt.contains$default(fileMimeType, "image/", false, 2, (Object) null)) {
            return Unit.INSTANCE;
        }
        try {
            o0O0000O.OooO00o oooO00o = new o0O0000O.OooO00o(o00O000.OooO00o());
            oooO00o.f52723OooO0o0.add(new o0O00000(uploadRequest.getFile()));
            oooO00o.f52720OooO0O0 = string;
            oooO00o.f52721OooO0OO = 100;
            oooO00o.f52722OooO0Oo = Oooo0.f12730OooO0o;
            file3 = (File) CollectionsKt.getOrNull(oooO00o.OooO00o(), 0);
        } catch (NoSuchFileException e) {
            e.printStackTrace();
        }
        if (file3 != null) {
            String absolutePath = file3.getAbsolutePath();
            File file4 = uploadRequest.getFile();
            Intrinsics.checkNotNull(file4);
            if (!Intrinsics.areEqual(absolutePath, file4.getAbsolutePath())) {
                z = true;
            }
        }
        uploadRequest.setTempFile(z);
        if (z) {
            File file5 = uploadRequest.getFile();
            Intrinsics.checkNotNull(file5);
            file5.delete();
            uploadRequest.setFile(file3);
        }
        return Unit.INSTANCE;
    }
}
