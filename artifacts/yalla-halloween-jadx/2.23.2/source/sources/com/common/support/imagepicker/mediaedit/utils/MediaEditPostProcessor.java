package com.common.support.imagepicker.mediaedit.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.mediaedit.entities.MediaEditConfig;
import com.common.support.imagepicker.mediaedit.entities.MediaEditSource;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.collect.ReportItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0005\u001b\u001c\u001d\u001e\u001fB<\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012!\b\u0002\u0010\u0006\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u0015\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0006\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\b\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\b\u0012\u00060\u0011R\u00020\u00000\u0010j\f\u0012\b\u0012\u00060\u0011R\u00020\u0000`\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor;", "", "context", "Landroid/content/Context;", "mEditConfig", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditConfig;", "onResult", "Lkotlin/Function1;", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/Context;Lcom/common/support/imagepicker/mediaedit/entities/MediaEditConfig;Lkotlin/jvm/functions/Function1;)V", "completed", "", "runningTask", "Ljava/util/ArrayList;", "Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$BaseTask;", "Lkotlin/collections/ArrayList;", "uiHandler", "Landroid/os/Handler;", "begin", "mediaList", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "checkAllCompleted", "getOutPutDir", "Ljava/io/File;", "BaseTask", "Companion", "ImageEditTask", "ImageTask", "VideoTask", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaEditPostProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaEditPostProcessor.kt\ncom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,372:1\n1855#2,2:373\n1855#2,2:375\n1855#2,2:377\n*S KotlinDebug\n*F\n+ 1 MediaEditPostProcessor.kt\ncom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor\n*L\n72#1:373,2\n91#1:375,2\n100#1:377,2\n*E\n"})
public final class MediaEditPostProcessor {

    @NotNull
    private static final String TAG = "MediaEditPostProcessor";
    private int completed;

    @NotNull
    private final Context context;

    @Nullable
    private final MediaEditConfig mEditConfig;

    @Nullable
    private Function1<? super List<AlbumItemWrapper>, Unit> onResult;

    @NotNull
    private ArrayList<BaseTask> runningTask;

    @NotNull
    private final Handler uiHandler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CoroutineScope taskScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b¢\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0004J\b\u0010#\u001a\u00020\u001fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\n¨\u0006$"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$BaseTask;", "", "input", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "(Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor;Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;)V", "canceled", "", "getCanceled", "()Z", "setCanceled", "(Z)V", "getInput", "()Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "needCompress", "getNeedCompress", "needDeduplication", "getNeedDeduplication", "outputItemWrapper", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "getOutputItemWrapper", "()Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "setOutputItemWrapper", "(Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;)V", "rootPath", "", "getRootPath", "()Ljava/lang/String;", "started", "getStarted", "setStarted", "cancel", "", "setComplete", "item", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "start", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public abstract class BaseTask {
        private volatile boolean canceled;

        @NotNull
        private final MediaEditSource input;
        private final boolean needCompress;
        private final boolean needDeduplication;

        @Nullable
        private AlbumItemWrapper outputItemWrapper;

        @Nullable
        private final String rootPath;
        private volatile boolean started;
        final /* synthetic */ MediaEditPostProcessor this$0;

        public BaseTask(@NotNull MediaEditPostProcessor mediaEditPostProcessor, MediaEditSource input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.this$0 = mediaEditPostProcessor;
            this.input = input;
            MediaEditConfig mediaEditConfig = mediaEditPostProcessor.mEditConfig;
            this.rootPath = mediaEditConfig != null ? mediaEditConfig.getRootPath() : null;
            MediaEditConfig mediaEditConfig2 = mediaEditPostProcessor.mEditConfig;
            this.needCompress = mediaEditConfig2 != null ? mediaEditConfig2.getNeedCompress() : false;
            MediaEditConfig mediaEditConfig3 = mediaEditPostProcessor.mEditConfig;
            this.needDeduplication = mediaEditConfig3 != null ? mediaEditConfig3.getNeedDeduplication() : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setComplete$lambda$1(MediaEditPostProcessor this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.completed++;
            this$0.checkAllCompleted();
        }

        public void cancel() {
            this.canceled = true;
        }

        public final boolean getCanceled() {
            return this.canceled;
        }

        @NotNull
        public final MediaEditSource getInput() {
            return this.input;
        }

        public final boolean getNeedCompress() {
            return this.needCompress;
        }

        public final boolean getNeedDeduplication() {
            return this.needDeduplication;
        }

        @Nullable
        public final AlbumItemWrapper getOutputItemWrapper() {
            return this.outputItemWrapper;
        }

        @Nullable
        public final String getRootPath() {
            return this.rootPath;
        }

        public final boolean getStarted() {
            return this.started;
        }

        public final void setCanceled(boolean z) {
            this.canceled = z;
        }

        public final void setComplete(@Nullable AlbumItem item) {
            if (this.canceled) {
                return;
            }
            if (item != null) {
                ImagePickerLogUtil.d(MediaEditPostProcessor.TAG, "setComplete: newItem=" + item.getContentUri() + ", old=" + this.input.getOriginItem().getContentUri());
                this.outputItemWrapper = new AlbumItemWrapper(this.input.getOriginItem(), item, this.input.getSource());
            }
            Handler handler = this.this$0.uiHandler;
            final MediaEditPostProcessor mediaEditPostProcessor = this.this$0;
            handler.post(new Runnable() { // from class: com.common.support.imagepicker.mediaedit.utils.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    MediaEditPostProcessor.BaseTask.setComplete$lambda$1(mediaEditPostProcessor);
                }
            });
        }

        public final void setOutputItemWrapper(@Nullable AlbumItemWrapper albumItemWrapper) {
            this.outputItemWrapper = albumItemWrapper;
        }

        public final void setStarted(boolean z) {
            this.started = z;
        }

        public void start() {
            ImagePickerLogUtil.d(MediaEditPostProcessor.TAG, "task start=" + this);
            this.started = true;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2!\b\u0002\u0010\u0010\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011¢\u0006\u0002\b\u0014H\u0000¢\u0006\u0002\b\u0015J;\u0010\u0016\u001a\u00020\u00172'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019¢\u0006\u0002\b\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$Companion;", "", "()V", "TAG", "", "taskScope", "Lkotlinx/coroutines/CoroutineScope;", "begin", "Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor;", "context", "Landroid/content/Context;", "mediaList", "", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "editConfig", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditConfig;", "onResult", "Lkotlin/Function1;", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "", "Lkotlin/ExtensionFunctionType;", "begin$mediaedit_release", "launch", "Lkotlinx/coroutines/Job;", ReportItem.LogTypeBlock, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "launch$mediaedit_release", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaEditPostProcessor begin$mediaedit_release$default(Companion companion, Context context, List list, MediaEditConfig mediaEditConfig, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                mediaEditConfig = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            return companion.begin$mediaedit_release(context, list, mediaEditConfig, function1);
        }

        @Nullable
        public final MediaEditPostProcessor begin$mediaedit_release(@NotNull Context context, @NotNull List<MediaEditSource> mediaList, @Nullable MediaEditConfig editConfig, @Nullable Function1<? super List<AlbumItemWrapper>, Unit> onResult) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mediaList, "mediaList");
            if (!mediaList.isEmpty()) {
                MediaEditPostProcessor mediaEditPostProcessor = new MediaEditPostProcessor(context, editConfig, onResult);
                mediaEditPostProcessor.begin(mediaList);
                return mediaEditPostProcessor;
            }
            if (onResult == null) {
                return null;
            }
            onResult.invoke(CollectionsKt.emptyList());
            return null;
        }

        @NotNull
        public final Job launch$mediaedit_release(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return BuildersKt__Builders_commonKt.launch$default(MediaEditPostProcessor.taskScope, null, null, new MediaEditPostProcessor$Companion$launch$1(block, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$ImageEditTask;", "Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$BaseTask;", "Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor;", "source", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "(Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor;Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;)V", "job", "Lkotlinx/coroutines/Job;", "cancel", "", "start", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ImageEditTask extends BaseTask {

        @Nullable
        private Job job;
        final /* synthetic */ MediaEditPostProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageEditTask(@NotNull MediaEditPostProcessor mediaEditPostProcessor, MediaEditSource source) {
            super(mediaEditPostProcessor, source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.this$0 = mediaEditPostProcessor;
        }

        @Override // com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor.BaseTask
        public void cancel() {
            super.cancel();
            Job job = this.job;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        @Override // com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor.BaseTask
        public void start() {
            super.start();
            this.job = MediaEditPostProcessor.INSTANCE.launch$mediaedit_release(new MediaEditPostProcessor$ImageEditTask$start$1(this, this.this$0, null));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$ImageTask;", "Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$BaseTask;", "Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor;", "source", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "(Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor;Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;)V", "job", "Lkotlinx/coroutines/Job;", "cancel", "", "start", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ImageTask extends BaseTask {

        @Nullable
        private Job job;
        final /* synthetic */ MediaEditPostProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageTask(@NotNull MediaEditPostProcessor mediaEditPostProcessor, MediaEditSource source) {
            super(mediaEditPostProcessor, source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.this$0 = mediaEditPostProcessor;
        }

        @Override // com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor.BaseTask
        public void cancel() {
            super.cancel();
            Job job = this.job;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        @Override // com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor.BaseTask
        public void start() {
            super.start();
            this.job = MediaEditPostProcessor.INSTANCE.launch$mediaedit_release(new MediaEditPostProcessor$ImageTask$start$1(this, this.this$0, null));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$VideoTask;", "Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor$BaseTask;", "Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor;", "source", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "(Lcom/common/support/imagepicker/mediaedit/utils/MediaEditPostProcessor;Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;)V", "job", "Lkotlinx/coroutines/Job;", "cancel", "", "start", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class VideoTask extends BaseTask {

        @Nullable
        private Job job;
        final /* synthetic */ MediaEditPostProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoTask(@NotNull MediaEditPostProcessor mediaEditPostProcessor, MediaEditSource source) {
            super(mediaEditPostProcessor, source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.this$0 = mediaEditPostProcessor;
        }

        @Override // com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor.BaseTask
        public void cancel() {
            super.cancel();
            Job job = this.job;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        @Override // com.common.support.imagepicker.mediaedit.utils.MediaEditPostProcessor.BaseTask
        public void start() {
            super.start();
            this.job = MediaEditPostProcessor.INSTANCE.launch$mediaedit_release(new MediaEditPostProcessor$VideoTask$start$1(this, this.this$0, null));
        }
    }

    public MediaEditPostProcessor(@NotNull Context context, @Nullable MediaEditConfig mediaEditConfig, @Nullable Function1<? super List<AlbumItemWrapper>, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mEditConfig = mediaEditConfig;
        this.onResult = function1;
        this.runningTask = new ArrayList<>();
        this.uiHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void begin(List<MediaEditSource> mediaList) {
        for (MediaEditSource mediaEditSource : mediaList) {
            this.runningTask.add(mediaEditSource.getOriginItem().isVideo() ? new VideoTask(this, mediaEditSource) : mediaEditSource.isEdited() ? new ImageEditTask(this, mediaEditSource) : new ImageTask(this, mediaEditSource));
        }
        if (!this.runningTask.isEmpty()) {
            ((BaseTask) CollectionsKt.first((List) this.runningTask)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAllCompleted() {
        if (this.runningTask.size() != this.completed) {
            for (BaseTask baseTask : this.runningTask) {
                if (!baseTask.getStarted()) {
                    baseTask.start();
                    return;
                }
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.runningTask.iterator();
        while (it.hasNext()) {
            AlbumItemWrapper outputItemWrapper = ((BaseTask) it.next()).getOutputItemWrapper();
            if (outputItemWrapper != null) {
                arrayList.add(outputItemWrapper);
            }
        }
        Function1<? super List<AlbumItemWrapper>, Unit> function1 = this.onResult;
        if (function1 != null) {
            function1.invoke(arrayList);
        }
    }

    @NotNull
    public final File getOutPutDir() {
        String rootPath;
        MediaEditConfig mediaEditConfig = this.mEditConfig;
        String str = ShareConstants.WEB_DIALOG_PARAM_MEDIA;
        if (mediaEditConfig == null) {
            return new File(this.context.getCacheDir(), ShareConstants.WEB_DIALOG_PARAM_MEDIA);
        }
        String rootPath2 = mediaEditConfig.getRootPath();
        if (!(rootPath2 == null || rootPath2.length() == 0) && (rootPath = mediaEditConfig.getRootPath()) != null) {
            str = rootPath;
        }
        return mediaEditConfig.getSaveToAlbum() ? new File(MediaUtils.INSTANCE.getDefaultRootPath(), str) : new File(this.context.getCacheDir(), str);
    }

    public /* synthetic */ MediaEditPostProcessor(Context context, MediaEditConfig mediaEditConfig, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : mediaEditConfig, (i & 4) != 0 ? null : function1);
    }
}
