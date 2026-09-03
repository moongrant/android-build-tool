package com.common.support.atd;

import android.content.Context;
import android.os.Looper;
import com.common.support.atd.base.Env;
import com.common.support.atd.base.InitResult;
import com.common.support.atd.detectors.AccessibilityDetector;
import com.common.support.atd.detectors.ApkSignDetector;
import com.common.support.atd.detectors.DeviceDetector;
import com.common.support.atd.detectors.EmulatorDetector;
import com.common.support.atd.detectors.InstallerDetector;
import com.common.support.atd.detectors.ProxyDetector;
import com.common.support.atd.detectors.RootDetector;
import com.common.support.atd.detectors.TamperDetector;
import com.common.support.atd.detectors.XposedDetector;
import com.common.support.atd.detectors.virtualapk.PackageDataManager;
import com.common.support.atd.detectors.virtualapk.VirtualApkDetector;
import com.common.support.sailfish_commons.logmodels.SecModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u001e\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010#\u001a\u0004\u0018\u00010\u000eJ\n\u0010$\u001a\u0004\u0018\u00010\u001bH\u0007J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0002¨\u0006*"}, d2 = {"Lcom/common/support/atd/Detector;", "", "()V", "INIT_RESULT_LOAD_DEFAULT_PKG_ERROR", "", "INIT_RESULT_LOAD_NATIVE_LIB_ERROR", "INIT_RESULT_OK", "INIT_RESULT_OPEN_DB_ERROR", "INIT_RESULT_QUERY_DB_ERROR", "INIT_RESULT_REQUEST_PKG_ERROR", "SDK_MODEL_VERSION", "SDK_VERSION_NAME", "", "detectResult", "Lcom/common/support/atd/DetectResult;", "<set-?>", "Lcom/common/support/atd/base/Env;", "env", "getEnv", "()Lcom/common/support/atd/base/Env;", "isDynamicDetectStarted", "", "isLogEnabled", "()Z", "setLogEnabled", "(Z)V", "secModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "getSecModel$annotations", "checkThread", "", "dynamicDetect", "detectors", "", "Lcom/common/support/atd/AbstractDetector;", "getDetectResult", "getSecModel", "init", "Lcom/common/support/atd/base/InitResult;", "context", "Landroid/content/Context;", "start", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Detector {
    public static final int INIT_RESULT_LOAD_DEFAULT_PKG_ERROR = 4;
    public static final int INIT_RESULT_LOAD_NATIVE_LIB_ERROR = 8;
    public static final int INIT_RESULT_OK = 0;
    public static final int INIT_RESULT_OPEN_DB_ERROR = 1;
    public static final int INIT_RESULT_QUERY_DB_ERROR = 2;
    public static final int INIT_RESULT_REQUEST_PKG_ERROR = 16;

    @NotNull
    public static final Detector INSTANCE = new Detector();
    private static final int SDK_MODEL_VERSION = 2;

    @NotNull
    private static final String SDK_VERSION_NAME = "1.0.6-beta02";

    @Nullable
    private static DetectResult detectResult;
    private static Env env;
    private static volatile boolean isDynamicDetectStarted;
    private static boolean isLogEnabled;

    @Nullable
    private static SecModel secModel;

    /* JADX INFO: renamed from: com.common.support.atd.Detector$dynamicDetect$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.common.support.atd.Detector$dynamicDetect$2", f = "Detector.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DetectorChain $chain;
        final /* synthetic */ DetectResult $detectResult;
        final /* synthetic */ CoroutineScope $scope;
        int label;
        final /* synthetic */ Detector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CoroutineScope coroutineScope, DetectorChain detectorChain, DetectResult detectResult, Detector detector, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$scope = coroutineScope;
            this.$chain = detectorChain;
            this.$detectResult = detectResult;
            this.this$0 = detector;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$scope, this.$chain, this.$detectResult, this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0024  */
        /* JADX WARN: Code duplicated, block: B:13:0x002e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002c -> B:14:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.throwOnFailure(r6)
                r6 = r5
                goto L2f
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                kotlin.ResultKt.throwOnFailure(r6)
                r6 = r5
            L1c:
                kotlinx.coroutines.CoroutineScope r1 = r6.$scope
                boolean r1 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r1 == 0) goto L48
                r6.label = r2
                r3 = 20000(0x4e20, double:9.8813E-320)
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r3, r6)
                if (r1 != r0) goto L2f
                return r0
            L2f:
                com.common.support.atd.DetectorChain r1 = r6.$chain
                r1.reset()
                com.common.support.atd.DetectorChain r1 = r6.$chain
                r1.process()
                com.common.support.atd.DetectResult r1 = r6.$detectResult
                long r3 = java.lang.System.currentTimeMillis()
                r1.setA18(r3)
                com.common.support.atd.DetectResult r1 = r6.$detectResult
                com.common.support.atd.Detector.access$setDetectResult$p(r1)
                goto L1c
            L48:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.common.support.atd.Detector.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private Detector() {
    }

    private final void checkThread() throws IllegalAccessException {
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw new IllegalAccessException("Only worker thread can init and start ATD SDK！");
        }
    }

    private final void dynamicDetect(List<? extends AbstractDetector> detectors, DetectResult detectResult2) {
        synchronized (this) {
            if (isDynamicDetectStarted) {
                return;
            }
            isDynamicDetectStarted = true;
            Unit unit = Unit.INSTANCE;
            DetectorChain detectorChain = new DetectorChain(detectors, 0, new SecModel(), detectResult2);
            CoroutineScope coroutineScopeMainScope = CoroutineScopeKt.MainScope();
            BuildersKt__Builders_commonKt.launch$default(coroutineScopeMainScope, Dispatchers.getIO(), null, new AnonymousClass2(coroutineScopeMainScope, detectorChain, detectResult2, this, null), 2, null);
        }
    }

    @Deprecated(message = "旧版本的检测结果，等过渡到DetectResult之后，该字段会被移除")
    private static /* synthetic */ void getSecModel$annotations() {
    }

    @Nullable
    public final DetectResult getDetectResult() {
        return detectResult;
    }

    @NotNull
    public final Env getEnv() {
        Env env2 = env;
        if (env2 != null) {
            return env2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("env");
        return null;
    }

    @Deprecated(message = "旧版本的检测结果，等过渡到DetectResult之后，该方法会被移除")
    @Nullable
    public final SecModel getSecModel() {
        return secModel;
    }

    @NotNull
    public final InitResult init(@NotNull Context context, @NotNull Env env2) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(env2, "env");
        checkThread();
        env = env2;
        InitResult initResult = new InitResult(0, null, 3, null);
        YS.init(context, initResult);
        if (initResult.getCode() != 0) {
            return initResult;
        }
        PackageDataManager packageDataManager = PackageDataManager.INSTANCE;
        packageDataManager.init(context, initResult);
        packageDataManager.requestServerData(context, initResult);
        return initResult;
    }

    public final boolean isLogEnabled() {
        return isLogEnabled;
    }

    public final void setLogEnabled(boolean z) {
        isLogEnabled = z;
    }

    @NotNull
    public final SecModel start(@NotNull Context context) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(context, "context");
        checkThread();
        AccessibilityDetector accessibilityDetector = new AccessibilityDetector(context);
        EmulatorDetector emulatorDetector = new EmulatorDetector(context);
        DeviceDetector deviceDetector = new DeviceDetector(context);
        InstallerDetector installerDetector = new InstallerDetector(context);
        ProxyDetector proxyDetector = new ProxyDetector(context);
        RootDetector rootDetector = new RootDetector();
        TamperDetector tamperDetector = new TamperDetector(context);
        List listListOf = CollectionsKt.listOf((Object[]) new AbstractDetector[]{accessibilityDetector, emulatorDetector, deviceDetector, installerDetector, proxyDetector, rootDetector, tamperDetector, new VirtualApkDetector(context), new XposedDetector(context), new ApkSignDetector()});
        String appVersion = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        List<? extends AbstractDetector> listListOf2 = CollectionsKt.listOf((Object[]) new AbstractDetector[]{accessibilityDetector, proxyDetector, tamperDetector});
        long jCurrentTimeMillis = System.currentTimeMillis();
        SecModel secModel2 = new SecModel();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
        secModel2.setVersion(appVersion);
        String str = simpleDateFormat.format(new Date(jCurrentTimeMillis));
        Intrinsics.checkNotNullExpressionValue(str, "instance.format(Date(currTime))");
        secModel2.setTime(str);
        DetectResult detectResult2 = new DetectResult();
        detectResult2.setF(2);
        detectResult2.setA17(SDK_VERSION_NAME);
        detectResult2.setA18(jCurrentTimeMillis);
        new DetectorChain(listListOf, 0, secModel2, detectResult2).process();
        detectResult2.setA20(secModel2.getVersion());
        secModel = secModel2;
        detectResult = detectResult2;
        dynamicDetect(listListOf2, detectResult2);
        return secModel2;
    }
}
