package com.common.support.apm.logger;

import android.content.Context;
import com.common.support.apm.Sailfish;
import com.common.support.apm.configuration.specific.ReportConfig;
import com.common.support.apm.utils.AppUtil;
import com.common.support.apm.utils.NetUtilKt;
import com.common.support.apm.xlog.entity.MetricModel;
import com.common.support.apm.xlog.entity.TraceModel;
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.common.support.sailfish_commons.logmodels.NetModel;
import com.common.support.sailfish_commons.logmodels.SecModel;
import com.common.support.sailfish_commons.logmodels.TrackModel;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/common/support/apm/logger/LoggerImpl;", "Lcom/common/support/apm/logger/Logger;", "Lcom/common/support/apm/logger/OtlpLogger;", "context", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "logWriter", "Lcom/common/support/apm/logger/LogWriter;", "logLevel", "", "(Ljava/lang/ref/WeakReference;Lcom/common/support/apm/logger/LogWriter;I)V", "dateFormat", "Ljava/text/SimpleDateFormat;", "buildCustomLogModel", "Lcom/common/support/sailfish_commons/logmodels/CustomLogModel;", "log", "", "level", "checkSecModel", "", "secModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "customLog", "logD", "logE", "logI", "logV", "logW", "writeCustomLog", "logModel", "writeMetricLog", "metricModel", "Lcom/common/support/apm/xlog/entity/MetricModel;", "writeMonitorLog", "customLogModel", "writeNetLog", "netModel", "Lcom/common/support/sailfish_commons/logmodels/NetModel;", "writeSecLog", "writeTraceLog", "traceModel", "Lcom/common/support/apm/xlog/entity/TraceModel;", "writeTrackLog", "trackModel", "Lcom/common/support/sailfish_commons/logmodels/TrackModel;", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class LoggerImpl implements Logger, OtlpLogger {

    @NotNull
    private final WeakReference<Context> context;

    @NotNull
    private final SimpleDateFormat dateFormat;
    private final int logLevel;

    @NotNull
    private final LogWriter logWriter;

    public LoggerImpl(@NotNull WeakReference<Context> context, @NotNull LogWriter logWriter, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logWriter, "logWriter");
        this.context = context;
        this.logWriter = logWriter;
        this.logLevel = i;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
    }

    private final CustomLogModel buildCustomLogModel(String log, int level) {
        CustomLogModel customLogModel = new CustomLogModel();
        customLogModel.setIden(Sailfish.uniqueId);
        customLogModel.setMessage(log);
        String str = this.dateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(Date())");
        customLogModel.setTime(str);
        Context context = this.context.get();
        if (context != null) {
            customLogModel.setAppVersion(AppUtil.INSTANCE.getVersionName(context));
            customLogModel.setNetworkAvailable(NetUtilKt.isNetAvailable(context));
        }
        customLogModel.setLevel(LevelKt.levelStringValue(level));
        return customLogModel;
    }

    private final void checkSecModel(SecModel secModel) {
        Context context;
        if (StringsKt.isBlank(secModel.getIden())) {
            secModel.setIden(StringsKt.isBlank(Sailfish.uniqueId) ? Sailfish.deviceId : Sailfish.uniqueId);
        }
        if (StringsKt.isBlank(secModel.getUserId())) {
            secModel.setUserId(Sailfish.uniqueId);
        }
        if (StringsKt.isBlank(secModel.getVersion()) && (context = this.context.get()) != null) {
            secModel.setVersion(AppUtil.INSTANCE.getVersionName(context));
        }
        if (StringsKt.isBlank(secModel.getDevice())) {
            secModel.setDevice(AppUtil.INSTANCE.getDeviceInfo());
        }
        if (StringsKt.isBlank(secModel.getTime())) {
            String str = this.dateFormat.format(new Date());
            Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(Date())");
            secModel.setTime(str);
        }
    }

    @Override // com.common.support.apm.logger.Logger
    public void customLog(@NotNull String log, int level) {
        Intrinsics.checkNotNullParameter(log, "log");
        writeCustomLog(buildCustomLogModel(log, level), level);
    }

    @Override // com.common.support.apm.logger.Logger
    public void logD(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        customLog(log, 2);
    }

    @Override // com.common.support.apm.logger.Logger
    public void logE(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        customLog(log, 5);
    }

    @Override // com.common.support.apm.logger.Logger
    public void logI(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        customLog(log, 3);
    }

    @Override // com.common.support.apm.logger.Logger
    public void logV(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        customLog(log, 1);
    }

    @Override // com.common.support.apm.logger.Logger
    public void logW(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        customLog(log, 4);
    }

    @Override // com.common.support.apm.logger.Logger
    public void writeCustomLog(@NotNull CustomLogModel logModel, int level) {
        Intrinsics.checkNotNullParameter(logModel, "logModel");
        if (level >= this.logLevel && ReportConfig.INSTANCE.isReportCustomLog()) {
            logModel.setLevel(LevelKt.levelStringValue(level));
            this.logWriter.write(logModel);
        }
    }

    @Override // com.common.support.apm.logger.OtlpLogger
    public void writeMetricLog(@NotNull MetricModel metricModel) {
        Intrinsics.checkNotNullParameter(metricModel, "metricModel");
        this.logWriter.write(metricModel);
    }

    @Override // com.common.support.apm.logger.Logger
    public void writeMonitorLog(@NotNull CustomLogModel customLogModel) {
        Intrinsics.checkNotNullParameter(customLogModel, "customLogModel");
        this.logWriter.write(customLogModel);
    }

    @Override // com.common.support.apm.logger.Logger
    public void writeNetLog(@NotNull NetModel netModel) {
        Intrinsics.checkNotNullParameter(netModel, "netModel");
        if (ReportConfig.INSTANCE.isReportNetLog()) {
            this.logWriter.write(netModel);
        }
    }

    @Override // com.common.support.apm.logger.Logger
    public void writeSecLog(@NotNull SecModel secModel) {
        Intrinsics.checkNotNullParameter(secModel, "secModel");
        if (ReportConfig.INSTANCE.isReportSecLog()) {
            checkSecModel(secModel);
            this.logWriter.write(secModel);
        }
    }

    @Override // com.common.support.apm.logger.OtlpLogger
    public void writeTraceLog(@NotNull TraceModel traceModel) {
        Intrinsics.checkNotNullParameter(traceModel, "traceModel");
        this.logWriter.write(traceModel);
    }

    @Override // com.common.support.apm.logger.Logger
    public void writeTrackLog(@NotNull TrackModel trackModel) {
        Intrinsics.checkNotNullParameter(trackModel, "trackModel");
        this.logWriter.write(trackModel);
    }
}
