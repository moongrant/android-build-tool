package com.common.support.apm.xlog;

import android.content.Context;
import com.common.support.apm.Sailfish;
import com.common.support.apm.base.Env;
import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.logger.LogWriter;
import com.common.support.apm.monitor.MonitorErrorCodeKt;
import com.common.support.apm.monitor.MonitorLogHelper;
import com.common.support.apm.nlog.NLog;
import com.common.support.apm.utils.FileUtilKt;
import com.common.support.sailfish_commons.logmodels.BaseModel;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o000O0o;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020\u0004H\u0002J$\u0010)\u001a\u00020&2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.J\b\u0010/\u001a\u00020&H\u0002J\u001f\u00100\u001a\u000201\"\b\b\u0000\u00102*\u0002032\u0006\u00104\u001a\u0002H2H\u0016¢\u0006\u0002\u00105J\u001a\u00106\u001a\u00020&2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/common/support/apm/xlog/XlogWriter;", "Lcom/common/support/apm/logger/LogWriter;", "()V", "CACHE_DIR_NAME", "", "DEFAULT_MAX_ALIVE_TIME", "", "DEFAULT_MAX_FILE_SIZE", "DEV_DIR_SUFFIX", "FAT_DIR_SUFFIX", "LOG_DIR_CACHE_SUFFIX", "LOG_DIR_NAME", "MAX_SIZE_OF_SINGLE_LINE_LOG", "cacheDir", "getCacheDir", "()Ljava/lang/String;", "setCacheDir", "(Ljava/lang/String;)V", "convertor", "Lcom/common/support/apm/xlog/XlogProtoConvertor;", "envDirSuffix", "fileLogConfig", "Lcom/common/support/apm/xlog/FileLogConfig;", "getFileLogConfig$sailfish_release", "()Lcom/common/support/apm/xlog/FileLogConfig;", "setFileLogConfig$sailfish_release", "(Lcom/common/support/apm/xlog/FileLogConfig;)V", "logCacheDir", "getLogCacheDir$sailfish_release", "setLogCacheDir$sailfish_release", "logDir", "getLogDir", "setLogDir", "uploader", "Lcom/common/support/apm/xlog/Uploader;", "xlog", "Lcom/common/support/apm/xlog/Xlog;", "deleteExpiredFiles", "", "flush", "getEnvDirSuffix", "init", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "open", "write", "", "T", "Lcom/common/support/sailfish_commons/logmodels/BaseModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "(Lcom/common/support/sailfish_commons/logmodels/BaseModel;)Z", "writeLog", "errorCode", "", "errorMsg", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class XlogWriter implements LogWriter {

    @NotNull
    private static final String CACHE_DIR_NAME = "xlog_cache_v2";
    public static final long DEFAULT_MAX_ALIVE_TIME = 25200;
    public static final long DEFAULT_MAX_FILE_SIZE = 102400;

    @NotNull
    private static final String DEV_DIR_SUFFIX = "_dev";

    @NotNull
    private static final String FAT_DIR_SUFFIX = "_fat";

    @NotNull
    public static final XlogWriter INSTANCE;

    @NotNull
    private static final String LOG_DIR_CACHE_SUFFIX = "_cache";

    @NotNull
    private static final String LOG_DIR_NAME = "xlog_v2";
    public static final long MAX_SIZE_OF_SINGLE_LINE_LOG = 10240;
    public static String cacheDir;

    @NotNull
    private static final XlogProtoConvertor convertor;

    @NotNull
    private static final String envDirSuffix;
    public static FileLogConfig fileLogConfig;

    @NotNull
    private static String logCacheDir;
    public static String logDir;

    @Nullable
    private static Uploader uploader;
    private static Xlog xlog;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Env.values().length];
            iArr[Env.dev.ordinal()] = 1;
            iArr[Env.fat.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.common.support.apm.xlog.XlogWriter$deleteExpiredFiles$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.common.support.apm.xlog.XlogWriter$deleteExpiredFiles$1", f = "XlogWriter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FileUtilKt.deleteExpiredFiles$default(XlogWriter.INSTANCE.getLogCacheDir$sailfish_release(), 0, 2, (Object) null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        XlogWriter xlogWriter = new XlogWriter();
        INSTANCE = xlogWriter;
        convertor = new XlogProtoConvertor();
        logCacheDir = "";
        envDirSuffix = xlogWriter.getEnvDirSuffix();
    }

    private XlogWriter() {
    }

    private final void deleteExpiredFiles() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    private final String getEnvDirSuffix() {
        int i = WhenMappings.$EnumSwitchMapping$0[Sailfish.INSTANCE.getConfig$sailfish_release().getEnv().ordinal()];
        if (i != 1) {
            return i != 2 ? "" : FAT_DIR_SUFFIX;
        }
        return DEV_DIR_SUFFIX;
    }

    private final void open() {
        Xlog.open(getLogDir(), getFileLogConfig$sailfish_release().getNamePrefix(), NLog.INSTANCE.H(Sailfish.INSTANCE.getConfig$sailfish_release().getEnv()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeLog(int errorCode, String errorMsg) {
        Sailfish.INSTANCE.writeMonitorLog(MonitorLogHelper.INSTANCE.create(4, 0, 0, errorCode, errorMsg));
    }

    @Override // com.common.support.apm.logger.LogWriter
    public void flush() {
        Uploader uploader2 = uploader;
        if (uploader2 != null) {
            uploader2.flush();
        }
    }

    @NotNull
    public final String getCacheDir() {
        String str = cacheDir;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cacheDir");
        return null;
    }

    @NotNull
    public final FileLogConfig getFileLogConfig$sailfish_release() {
        FileLogConfig fileLogConfig2 = fileLogConfig;
        if (fileLogConfig2 != null) {
            return fileLogConfig2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fileLogConfig");
        return null;
    }

    @NotNull
    public final String getLogCacheDir$sailfish_release() {
        return logCacheDir;
    }

    @NotNull
    public final String getLogDir() {
        String str = logDir;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logDir");
        return null;
    }

    public final void init(@NotNull WeakReference<Context> contextRef, @NotNull FileLogConfig fileLogConfig2, @NotNull CoroutineScope scope) {
        String string;
        Intrinsics.checkNotNullParameter(contextRef, "contextRef");
        Intrinsics.checkNotNullParameter(fileLogConfig2, "fileLogConfig");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Xlog.loadLib();
        XlogWriter xlogWriter = INSTANCE;
        xlogWriter.setFileLogConfig$sailfish_release(fileLogConfig2);
        String logDir2 = xlogWriter.getFileLogConfig$sailfish_release().getLogDir();
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        StringBuilder sbOooO00o = StringsKt__StringsJVMKt.endsWith$default(logDir2, separator, false, 2, null) ? o0o0Oo.OooO00o(logDir2) : o000O0o.OooO0O0(logDir2, separator);
        sbOooO00o.append(LOG_DIR_NAME);
        String string2 = sbOooO00o.toString();
        StringBuilder sbOooO00o2 = o0o0Oo.OooO00o(string2);
        sbOooO00o2.append(getEnvDirSuffix());
        setLogDir(sbOooO00o2.toString());
        logCacheDir = new File(string2).getAbsolutePath() + LOG_DIR_CACHE_SUFFIX;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        if (StringsKt__StringsJVMKt.endsWith$default(logDir2, separator, false, 2, null)) {
            StringBuilder sbOooO0O0 = o000O0o.OooO0O0(logDir2, CACHE_DIR_NAME);
            sbOooO0O0.append(envDirSuffix);
            string = sbOooO0O0.toString();
        } else {
            string = logDir2 + separator + CACHE_DIR_NAME + envDirSuffix;
        }
        setCacheDir(string);
        xlog = new Xlog();
        open();
        deleteExpiredFiles();
        Uploader uploader2 = new Uploader(contextRef, scope, fileLogConfig2.getIsDeleteLogWhenUploadSucceeded(), new Function0<Unit>() { // from class: com.common.support.apm.xlog.XlogWriter$init$uploader$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Xlog xlog2 = XlogWriter.xlog;
                if (xlog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("xlog");
                    xlog2 = null;
                }
                final boolean zAppenderFlush = xlog2.appenderFlush(true);
                LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.xlog.XlogWriter$init$uploader$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Before upload. Is the flush operation successful? " + zAppenderFlush;
                    }
                }, 1, null);
                if (zAppenderFlush) {
                    return;
                }
                XlogWriter.INSTANCE.writeLog(MonitorErrorCodeKt.MONITOR_ERROR_XLOG_FLUSH_FAILED, "Xlog flush failed!");
            }
        });
        uploader2.start();
        uploader = uploader2;
    }

    public final void setCacheDir(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        cacheDir = str;
    }

    public final void setFileLogConfig$sailfish_release(@NotNull FileLogConfig fileLogConfig2) {
        Intrinsics.checkNotNullParameter(fileLogConfig2, "<set-?>");
        fileLogConfig = fileLogConfig2;
    }

    public final void setLogCacheDir$sailfish_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        logCacheDir = str;
    }

    public final void setLogDir(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        logDir = str;
    }

    @Override // com.common.support.apm.logger.LogWriter
    public <T extends BaseModel> boolean write(@NotNull final T model) {
        Intrinsics.checkNotNullParameter(model, "model");
        boolean z = true;
        for (final byte[] bArr : convertor.convert((BaseModel) model)) {
            Xlog xlog2 = null;
            if (bArr.length > MAX_SIZE_OF_SINGLE_LINE_LOG) {
                LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.xlog.XlogWriter$write$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Incorrect types in method signature: ([BTT;)V */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Log size is " + bArr.length + "B. The max size of single line log is 10 * 1024B, " + model.getClass().getName();
                    }
                }, 1, null);
                INSTANCE.writeLog(MonitorErrorCodeKt.MONITOR_ERROR_XLOG_LINE_EXCEED_MAX_SIZE, "Xlog line size: " + bArr.length + "B, " + model.getClass().getName());
                z = false;
            } else {
                Xlog xlog3 = xlog;
                if (xlog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("xlog");
                } else {
                    xlog2 = xlog3;
                }
                xlog2.logWrite(bArr);
            }
        }
        return z;
    }
}
