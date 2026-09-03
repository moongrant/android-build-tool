package com.common.support.apm.xlog;

import android.content.Context;
import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.configuration.specific.ReportConfig;
import com.common.support.apm.monitor.MonitorManager;
import com.common.support.apm.sailfishhttp.BaseServerResponse;
import com.common.support.apm.uploader.UploadService;
import com.common.support.apm.utils.MD5UtilKt;
import com.common.support.networkstate.NetworkState;
import com.common.support.networkstate.NetworkStateUtil;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0006\u0010\u001a\u001a\u00020\u000bJ\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u000bJ\b\u0010\u001f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020!H\u0002R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/common/support/apm/xlog/Uploader;", "", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "isDeleteLogWhenUploadSucceeded", "", "beforeUpload", "Lkotlin/Function0;", "", "(Ljava/lang/ref/WeakReference;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function0;)V", "delayJob", "Lkotlinx/coroutines/Deferred;", "fileProvider", "Lcom/common/support/apm/xlog/XlogFileProvider;", "flushFlag", "isUploadWhenConnected", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "reportFrequencyWhenDisconnected", "", "task", "Lkotlinx/coroutines/Job;", "delayedTime", "flush", "onNetworkStateChanged", "state", "Lcom/common/support/networkstate/NetworkState;", "start", "upload", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Uploader {

    @Nullable
    private final Function0<Unit> beforeUpload;

    @NotNull
    private final WeakReference<Context> contextRef;

    @NotNull
    private final CoroutineScope coroutineScope;

    @Nullable
    private Deferred<Unit> delayJob;

    @NotNull
    private final XlogFileProvider fileProvider;
    private volatile boolean flushFlag;
    private final boolean isDeleteLogWhenUploadSucceeded;
    private boolean isUploadWhenConnected;

    @NotNull
    private final Mutex mutex;
    private final long reportFrequencyWhenDisconnected;

    @Nullable
    private Job task;

    /* JADX INFO: renamed from: com.common.support.apm.xlog.Uploader$flush$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.common.support.apm.xlog.Uploader$flush$1", f = "Uploader.kt", i = {0, 0}, l = {189}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock$iv"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = Uploader.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            Mutex mutex;
            Uploader uploader;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                mutex = Uploader.this.mutex;
                Uploader uploader2 = Uploader.this;
                this.L$0 = coroutineScope;
                this.L$1 = mutex;
                this.L$2 = uploader2;
                this.label = 1;
                if (mutex.lock(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uploader = uploader2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uploader = (Uploader) this.L$2;
                mutex = (Mutex) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            try {
                if (uploader.flushFlag) {
                    return Unit.INSTANCE;
                }
                Deferred deferred = uploader.delayJob;
                boolean z = false;
                if (deferred != null && deferred.isActive()) {
                    z = true;
                }
                if (z) {
                    Deferred deferred2 = uploader.delayJob;
                    Intrinsics.checkNotNull(deferred2);
                    Job.DefaultImpls.cancel$default((Job) deferred2, (CancellationException) null, 1, (Object) null);
                } else {
                    uploader.flushFlag = true;
                }
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            } finally {
                mutex.unlock(coroutineScope);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.apm.xlog.Uploader$onNetworkStateChanged$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.common.support.apm.xlog.Uploader$onNetworkStateChanged$2", f = "Uploader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NetworkState $state;
        int label;
        final /* synthetic */ Uploader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NetworkState networkState, Uploader uploader, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$state = networkState;
            this.this$0 = uploader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$state, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Deferred deferred;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = false;
            if (this.$state.isConnected()) {
                this.this$0.isUploadWhenConnected = true;
                Deferred deferred2 = this.this$0.delayJob;
                if (deferred2 != null && deferred2.isActive()) {
                    z = true;
                }
                if (z && (deferred = this.this$0.delayJob) != null) {
                    Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
                }
            } else {
                this.this$0.isUploadWhenConnected = false;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.apm.xlog.Uploader$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.common.support.apm.xlog.Uploader$start$1", f = "Uploader.kt", i = {0, 0, 1}, l = {189, 86}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock$iv", "$this$launch"}, s = {"L$0", "L$1", "L$0"})
    public static final class C08741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public C08741(Continuation<? super C08741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C08741 c08741 = Uploader.this.new C08741(continuation);
            c08741.L$0 = obj;
            return c08741;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0044 A[Catch: CancellationException -> 0x00be, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x00be, blocks: (B:17:0x003e, B:19:0x0044, B:28:0x008c, B:36:0x00ab, B:38:0x00b2, B:39:0x00b5, B:40:0x00b6, B:13:0x0031, B:23:0x0067, B:25:0x006d, B:27:0x008a, B:26:0x0083), top: B:47:0x000c, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x005f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0060  */
        /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:23:0x0067, B:25:0x006d, B:27:0x008a, B:26:0x0083), top: B:45:0x0067, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0083 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:23:0x0067, B:25:0x006d, B:27:0x008a, B:26:0x0083), top: B:45:0x0067, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x0097  */
        /* JADX WARN: Code duplicated, block: B:32:0x009a A[Catch: CancellationException -> 0x00a9, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00a9, blocks: (B:29:0x008f, B:32:0x009a), top: B:48:0x008f }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[RETURN] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.common.support.apm.xlog.Uploader.C08741.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C08741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public Uploader(@NotNull WeakReference<Context> contextRef, @NotNull CoroutineScope coroutineScope, boolean z, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(contextRef, "contextRef");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.contextRef = contextRef;
        this.coroutineScope = coroutineScope;
        this.isDeleteLogWhenUploadSucceeded = z;
        this.beforeUpload = function0;
        this.fileProvider = new XlogFileProvider(new File(XlogWriter.INSTANCE.getLogDir()));
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.reportFrequencyWhenDisconnected = 7200L;
        this.isUploadWhenConnected = true;
        Context context = contextRef.get();
        if (context == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new Uploader$1$1(context, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long delayedTime() {
        return (this.isUploadWhenConnected ? ReportConfig.INSTANCE.fileLogReportFrequency() : this.reportFrequencyWhenDisconnected) * ((long) 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNetworkStateChanged(final NetworkState state) {
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.xlog.Uploader.onNetworkStateChanged.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return Intrinsics.stringPlus("NetworkState isConnected: ", Boolean.valueOf(state.isConnected()));
            }
        }, 1, null);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass2(state, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void upload() {
        try {
            Function0<Unit> function0 = this.beforeUpload;
            if (function0 != null) {
                function0.invoke();
            }
            List<File> listQueryAllLogFiles = this.fileProvider.queryAllLogFiles();
            if (listQueryAllLogFiles.isEmpty()) {
                LoggerKt.logE$default(null, null, new Function0<String>() { // from class: com.common.support.apm.xlog.Uploader.upload.1
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "There is no files found in the log directory.";
                    }
                }, 3, null);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listQueryAllLogFiles) {
                Boolean boolValueOf = Boolean.valueOf(upload((File) obj));
                Object arrayList = linkedHashMap.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(boolValueOf, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            List<? extends File> list = (List) linkedHashMap.get(Boolean.TRUE);
            List list2 = (List) linkedHashMap.get(Boolean.FALSE);
            MonitorManager.INSTANCE.updateUploadOperatorDataMetric(listQueryAllLogFiles.size(), list2 == null ? 0 : list2.size());
            if (!(list == null || list.isEmpty())) {
                if (this.isDeleteLogWhenUploadSucceeded) {
                    this.fileProvider.deleteAllFiles(list);
                } else {
                    this.fileProvider.allFilesAddUploadedTag(list);
                }
            }
            LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.xlog.Uploader.upload.2
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Log upload finished!";
                }
            }, 1, null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void flush() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    public final void start() {
        this.task = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C08741(null), 3, null);
    }

    public /* synthetic */ Uploader(WeakReference weakReference, CoroutineScope coroutineScope, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, coroutineScope, z, (i & 8) != 0 ? null : function0);
    }

    private final boolean upload(File file) {
        Context context = this.contextRef.get();
        Boolean boolValueOf = context == null ? null : Boolean.valueOf(NetworkStateUtil.INSTANCE.isRealConnected(context));
        if (!(boolValueOf == null ? false : boolValueOf.booleanValue())) {
            LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.xlog.Uploader.upload.3
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Log upload but network disconnected";
                }
            }, 1, null);
            return false;
        }
        try {
            final BaseServerResponse<Unit> baseServerResponseUploadFileLog = UploadService.INSTANCE.uploadFileLog(file, MD5UtilKt.getFileMD5(file));
            if (baseServerResponseUploadFileLog == null) {
                LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.xlog.Uploader.upload.4
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Log upload response null";
                    }
                }, 1, null);
                return false;
            }
            if (!baseServerResponseUploadFileLog.getSuccess()) {
                LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.xlog.Uploader.upload.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "log upload failed with " + baseServerResponseUploadFileLog.getCode() + ", and error msg is " + baseServerResponseUploadFileLog.getMessage();
                    }
                }, 1, null);
            } else {
                LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.xlog.Uploader.upload.6
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "log uploaded successfully";
                    }
                }, 1, null);
            }
            return baseServerResponseUploadFileLog.getSuccess();
        } catch (Throwable th) {
            LoggerKt.logE$default(null, null, new Function0<String>() { // from class: com.common.support.apm.xlog.Uploader.upload.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return th.toString();
                }
            }, 3, null);
            return false;
        }
    }
}
