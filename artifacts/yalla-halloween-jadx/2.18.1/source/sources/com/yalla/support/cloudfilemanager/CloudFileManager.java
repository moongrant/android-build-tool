package com.yalla.support.cloudfilemanager;

import android.content.ContentResolver;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.yalla.support.cloudfilemanager.interceptor.Interceptor;
import com.yalla.support.cloudfilemanager.request.UploadRequest;
import com.yalla.support.cloudfilemanager.uploader.AWSUploader;
import com.yalla.support.cloudfilemanager.uploader.QiniuUploader;
import com.yalla.support.cloudfilemanager.util.FileUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J!\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ!\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ7\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010*J7\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010+\u001a\u00020,2\b\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-JC\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010.2\u0006\u0010\u001d\u001a\u00028\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020%0.2\b\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)H\u0086@ø\u0001\u0000¢\u0006\u0002\u00100JC\u00101\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010.2\u0006\u0010\u001d\u001a\u00028\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020,0.2\b\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)H\u0086@ø\u0001\u0000¢\u0006\u0002\u00100R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/yalla/support/cloudfilemanager/CloudFileManager;", "T", "", "uploadInfoLoader", "Lcom/yalla/support/cloudfilemanager/UploadInfoLoader;", "(Lcom/yalla/support/cloudfilemanager/UploadInfoLoader;)V", "awsUploader", "Lcom/yalla/support/cloudfilemanager/uploader/AWSUploader;", "getAwsUploader", "()Lcom/yalla/support/cloudfilemanager/uploader/AWSUploader;", "awsUploader$delegate", "Lkotlin/Lazy;", "interceptors", "", "Lcom/yalla/support/cloudfilemanager/interceptor/Interceptor;", "qiniuUploader", "Lcom/yalla/support/cloudfilemanager/uploader/QiniuUploader;", "getQiniuUploader", "()Lcom/yalla/support/cloudfilemanager/uploader/QiniuUploader;", "qiniuUploader$delegate", "addInterceptor", "", "interceptor", "deleteTempFile", "uploadRequest", "Lcom/yalla/support/cloudfilemanager/request/UploadRequest;", "getImageSize", "Landroid/graphics/BitmapFactory$Options;", "invokeInterceptor", "fileType", "(Lcom/yalla/support/cloudfilemanager/request/UploadRequest;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeInterceptor", "upload", "", "uploadFile", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "sourceId", "", "autoName", "", "(Ljava/lang/Object;Landroid/net/Uri;Ljava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "(Ljava/lang/Object;Ljava/io/File;Ljava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uris", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFiles", "files", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CloudFileManager<T> {

    /* JADX INFO: renamed from: awsUploader$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy awsUploader;

    @NotNull
    private final List<Interceptor<T>> interceptors;

    /* JADX INFO: renamed from: qiniuUploader$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy qiniuUploader;

    @NotNull
    private final UploadInfoLoader<T> uploadInfoLoader;

    /* JADX INFO: renamed from: com.yalla.support.cloudfilemanager.CloudFileManager$invokeInterceptor$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.support.cloudfilemanager.CloudFileManager", f = "CloudFileManager.kt", i = {0, 0}, l = {134}, m = "invokeInterceptor", n = {"uploadRequest", "fileType"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ CloudFileManager<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CloudFileManager<T> cloudFileManager, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = cloudFileManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.invokeInterceptor(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.support.cloudfilemanager.CloudFileManager$upload$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.support.cloudfilemanager.CloudFileManager", f = "CloudFileManager.kt", i = {0, 0}, l = {102, 104, 105}, m = "upload", n = {"this", "uploadRequest"}, s = {"L$0", "L$1"})
    public static final class C04581 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ CloudFileManager<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04581(CloudFileManager<T> cloudFileManager, Continuation<? super C04581> continuation) {
            super(continuation);
            this.this$0 = cloudFileManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.upload(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.support.cloudfilemanager.CloudFileManager$uploadFile$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.support.cloudfilemanager.CloudFileManager$uploadFile$2", f = "CloudFileManager.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CloudFileInfo>, Object> {
        public final /* synthetic */ boolean $autoName;
        public final /* synthetic */ T $fileType;
        public final /* synthetic */ Long $sourceId;
        public final /* synthetic */ Uri $uri;
        public int label;
        public final /* synthetic */ CloudFileManager<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Uri uri, CloudFileManager<T> cloudFileManager, T t, Long l, boolean z, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.this$0 = cloudFileManager;
            this.$fileType = t;
            this.$sourceId = l;
            this.$autoName = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$uri, this.this$0, this.$fileType, this.$sourceId, this.$autoName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super CloudFileInfo> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                File fileCopyFile2Cache = FileUtil.INSTANCE.copyFile2Cache(this.$uri);
                if (fileCopyFile2Cache == null) {
                    return null;
                }
                CloudFileManager<T> cloudFileManager = this.this$0;
                T t = this.$fileType;
                Long l = this.$sourceId;
                boolean z = this.$autoName;
                this.label = 1;
                obj = cloudFileManager.uploadFile(t, fileCopyFile2Cache, l, z, this);
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
    }

    /* JADX INFO: renamed from: com.yalla.support.cloudfilemanager.CloudFileManager$uploadFile$4, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.support.cloudfilemanager.CloudFileManager$uploadFile$4", f = "CloudFileManager.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends CloudFileInfo>>, Object> {
        public final /* synthetic */ boolean $autoName;
        public final /* synthetic */ T $fileType;
        public final /* synthetic */ Long $sourceId;
        public final /* synthetic */ List<Uri> $uris;
        public int label;
        public final /* synthetic */ CloudFileManager<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(List<? extends Uri> list, CloudFileManager<T> cloudFileManager, T t, Long l, boolean z, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$uris = list;
            this.this$0 = cloudFileManager;
            this.$fileType = t;
            this.$sourceId = l;
            this.$autoName = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass4(this.$uris, this.this$0, this.$fileType, this.$sourceId, this.$autoName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends CloudFileInfo>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<CloudFileInfo>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<CloudFileInfo>> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = this.$uris.iterator();
                while (it.hasNext()) {
                    File fileCopyFile2Cache = FileUtil.INSTANCE.copyFile2Cache((Uri) it.next());
                    if (fileCopyFile2Cache == null) {
                        return null;
                    }
                    arrayList.add(fileCopyFile2Cache);
                }
                CloudFileManager<T> cloudFileManager = this.this$0;
                T t = this.$fileType;
                Long l = this.$sourceId;
                boolean z = this.$autoName;
                this.label = 1;
                obj = cloudFileManager.uploadFiles(t, arrayList, l, z, this);
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
    }

    /* JADX INFO: renamed from: com.yalla.support.cloudfilemanager.CloudFileManager$uploadFile$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.support.cloudfilemanager.CloudFileManager", f = "CloudFileManager.kt", i = {}, l = {55}, m = "uploadFile", n = {}, s = {})
    public static final class AnonymousClass5 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ CloudFileManager<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(CloudFileManager<T> cloudFileManager, Continuation<? super AnonymousClass5> continuation) {
            super(continuation);
            this.this$0 = cloudFileManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.uploadFile((Object) null, (File) null, (Long) null, false, (Continuation<? super CloudFileInfo>) this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.support.cloudfilemanager.CloudFileManager$uploadFiles$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.support.cloudfilemanager.CloudFileManager$uploadFiles$2", f = "CloudFileManager.kt", i = {1, 1, 1, 1, 1}, l = {72, 85}, m = "invokeSuspend", n = {"uploadInfo", "uploadRequest", "mutableList", ShareInternalUtility.STAGING_PARAM, "index$iv"}, s = {"L$0", "L$1", "L$2", "L$6", "I$0"})
    public static final class C04592 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<CloudFileInfo>>, Object> {
        public final /* synthetic */ boolean $autoName;
        public final /* synthetic */ T $fileType;
        public final /* synthetic */ List<File> $files;
        public final /* synthetic */ Long $sourceId;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public final /* synthetic */ CloudFileManager<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04592(List<? extends File> list, CloudFileManager<T> cloudFileManager, T t, Long l, boolean z, Continuation<? super C04592> continuation) {
            super(2, continuation);
            this.$files = list;
            this.this$0 = cloudFileManager;
            this.$fileType = t;
            this.$sourceId = l;
            this.$autoName = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04592(this.$files, this.this$0, this.$fileType, this.$sourceId, this.$autoName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<CloudFileInfo>> continuation) {
            return ((C04592) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:31:0x00de  */
        /* JADX WARN: Code duplicated, block: B:34:0x00fd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:38:0x010c  */
        /* JADX WARN: Code duplicated, block: B:40:0x0111  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00fe -> B:36:0x0104). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 321
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yalla.support.cloudfilemanager.CloudFileManager.C04592.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public CloudFileManager(@NotNull UploadInfoLoader<T> uploadInfoLoader) {
        Intrinsics.checkNotNullParameter(uploadInfoLoader, "uploadInfoLoader");
        this.uploadInfoLoader = uploadInfoLoader;
        this.interceptors = new ArrayList();
        this.qiniuUploader = LazyKt.lazy(new Function0<QiniuUploader>() { // from class: com.yalla.support.cloudfilemanager.CloudFileManager$qiniuUploader$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final QiniuUploader invoke() {
                return new QiniuUploader();
            }
        });
        this.awsUploader = LazyKt.lazy(new Function0<AWSUploader>() { // from class: com.yalla.support.cloudfilemanager.CloudFileManager$awsUploader$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AWSUploader invoke() {
                return new AWSUploader();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteTempFile(UploadRequest uploadRequest) {
        if (uploadRequest.getIsTempFile()) {
            File file = uploadRequest.getFile();
            if (file != null) {
                file.delete();
            }
            uploadRequest.setFile(null);
            uploadRequest.setTempFile(false);
        }
    }

    private final AWSUploader getAwsUploader() {
        return (AWSUploader) this.awsUploader.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BitmapFactory.Options getImageSize(UploadRequest uploadRequest) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (uploadRequest.getFile() != null) {
            File file = uploadRequest.getFile();
            Intrinsics.checkNotNull(file);
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        } else {
            o00O000 o00o001 = o00O000.f34346OooO00o;
            ContentResolver contentResolver = o00O000.OooO00o().getContentResolver();
            Uri uri = uploadRequest.getUri();
            Intrinsics.checkNotNull(uri);
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    private final QiniuUploader getQiniuUploader() {
        return (QiniuUploader) this.qiniuUploader.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeInterceptor(UploadRequest uploadRequest, T t, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        UploadRequest uploadRequest2;
        Iterator<T> it;
        Object obj;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        Object obj2 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            uploadRequest2 = uploadRequest;
            it = this.interceptors.iterator();
            obj = t;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) anonymousClass1.L$2;
            Object obj3 = anonymousClass1.L$1;
            UploadRequest uploadRequest3 = (UploadRequest) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj3;
            uploadRequest2 = uploadRequest3;
        }
        while (it.hasNext()) {
            Interceptor interceptor = (Interceptor) it.next();
            anonymousClass1.L$0 = uploadRequest2;
            anonymousClass1.L$1 = obj;
            anonymousClass1.L$2 = it;
            anonymousClass1.label = 1;
            if (interceptor.onUpload(uploadRequest2, obj, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object upload(UploadRequest uploadRequest, T t, Continuation<? super String> continuation) {
        C04581 c04581;
        CloudFileManager cloudFileManager;
        if (continuation instanceof C04581) {
            c04581 = (C04581) continuation;
            int i = c04581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04581.label = i - Integer.MIN_VALUE;
            } else {
                c04581 = new C04581(this, continuation);
            }
        } else {
            c04581 = new C04581(this, continuation);
        }
        Object objUploadFile = c04581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadFile);
            c04581.L$0 = this;
            c04581.L$1 = uploadRequest;
            c04581.label = 1;
            if (invokeInterceptor(uploadRequest, t, c04581) == coroutine_suspended) {
                return coroutine_suspended;
            }
            cloudFileManager = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objUploadFile);
                }
                if (i2 == 3) {
                    ResultKt.throwOnFailure(objUploadFile);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uploadRequest = (UploadRequest) c04581.L$1;
            CloudFileManager cloudFileManager2 = (CloudFileManager) c04581.L$0;
            ResultKt.throwOnFailure(objUploadFile);
            cloudFileManager = cloudFileManager2;
        }
        CloudFileUploadInfo cloudFileUploadInfo = uploadRequest.getCloudFileUploadInfo();
        if (cloudFileUploadInfo instanceof CloudFileUploadInfo.QiNiuUploadInfo) {
            QiniuUploader qiniuUploader = cloudFileManager.getQiniuUploader();
            c04581.L$0 = null;
            c04581.L$1 = null;
            c04581.label = 2;
            objUploadFile = qiniuUploader.uploadFile(uploadRequest, c04581);
            return objUploadFile == coroutine_suspended ? coroutine_suspended : objUploadFile;
        }
        if (!(cloudFileUploadInfo instanceof CloudFileUploadInfo.AWSUploadInfo)) {
            return "";
        }
        AWSUploader awsUploader = cloudFileManager.getAwsUploader();
        c04581.L$0 = null;
        c04581.L$1 = null;
        c04581.label = 3;
        objUploadFile = awsUploader.uploadFile(uploadRequest, c04581);
        return objUploadFile == coroutine_suspended ? coroutine_suspended : objUploadFile;
    }

    public final void addInterceptor(@NotNull Interceptor<T> interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.interceptors.add(interceptor);
    }

    public final void removeInterceptor(@NotNull Interceptor<T> interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.interceptors.remove(interceptor);
    }

    @Nullable
    public final Object uploadFile(T t, @NotNull Uri uri, @Nullable Long l, boolean z, @NotNull Continuation<? super CloudFileInfo> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(uri, this, t, l, z, null), continuation);
    }

    @Nullable
    public final Object uploadFiles(T t, @NotNull List<? extends File> list, @Nullable Long l, boolean z, @NotNull Continuation<? super List<CloudFileInfo>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C04592(list, this, t, l, z, null), continuation);
    }

    @Nullable
    public final Object uploadFile(T t, @NotNull List<? extends Uri> list, @Nullable Long l, boolean z, @NotNull Continuation<? super List<CloudFileInfo>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass4(list, this, t, l, z, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object uploadFile(T t, @NotNull File file, @Nullable Long l, boolean z, @NotNull Continuation<? super CloudFileInfo> continuation) {
        AnonymousClass5 anonymousClass5;
        if (continuation instanceof AnonymousClass5) {
            anonymousClass5 = (AnonymousClass5) continuation;
            int i = anonymousClass5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass5.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass5 = new AnonymousClass5(this, continuation);
            }
        } else {
            anonymousClass5 = new AnonymousClass5(this, continuation);
        }
        AnonymousClass5 anonymousClass6 = anonymousClass5;
        Object objUploadFiles = anonymousClass6.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass6.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadFiles);
            List<? extends File> listMutableListOf = CollectionsKt.mutableListOf(file);
            anonymousClass6.label = 1;
            objUploadFiles = uploadFiles(t, listMutableListOf, l, z, anonymousClass6);
            if (objUploadFiles == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUploadFiles);
        }
        List list = (List) objUploadFiles;
        if (list != null) {
            return (CloudFileInfo) list.get(0);
        }
        return null;
    }
}
