package com.common.support.apm.monitor.entity;

import com.common.support.apm.Constants;
import com.common.support.apm.Sailfish;
import com.common.support.apm.protobuf.MonitorProto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lcom/common/support/apm/monitor/entity/MonitorMetricModel;", "", "statusMetricModelList", "", "Lcom/common/support/apm/monitor/entity/StatusMetricModel;", "dataMetricModelList", "Lcom/common/support/apm/monitor/entity/DataMetricModel;", "(Ljava/util/List;Ljava/util/List;)V", "getDataMetricModelList", "()Ljava/util/List;", "getStatusMetricModelList", "Companion", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MonitorMetricModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MONITOR_MESSAGE_TYPE = 101;

    @NotNull
    private final List<DataMetricModel> dataMetricModelList;

    @NotNull
    private final List<StatusMetricModel> statusMetricModelList;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/common/support/apm/monitor/entity/MonitorMetricModel$Companion;", "", "()V", "MONITOR_MESSAGE_TYPE", "", "createAppInfo", "Lcom/common/support/apm/protobuf/MonitorProto$AppInfo;", "createModuleMetric", "Lcom/common/support/apm/protobuf/MonitorProto$ModuleMetric;", "dataMetricModel", "Lcom/common/support/apm/monitor/entity/DataMetricModel;", "createModuleStatus", "Lcom/common/support/apm/protobuf/MonitorProto$ModuleStatus;", "statusMetricModel", "Lcom/common/support/apm/monitor/entity/StatusMetricModel;", "createMonitor", "Lcom/common/support/apm/protobuf/MonitorProto$Monitor;", "monitorMetricModel", "Lcom/common/support/apm/monitor/entity/MonitorMetricModel;", "createMonitorMessage", "Lcom/common/support/apm/protobuf/MonitorProto$MonitorMessage;", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final MonitorProto.AppInfo createAppInfo() {
            MonitorProto.AppInfo.Builder builderNewBuilder = MonitorProto.AppInfo.newBuilder();
            builderNewBuilder.setAppId(Sailfish.appId);
            builderNewBuilder.setAppVersion(Sailfish.appVersion);
            builderNewBuilder.setAppDeviceId(Sailfish.deviceId);
            builderNewBuilder.setAppUserIden(Sailfish.uniqueId);
            builderNewBuilder.setSdkVersion(Constants.SDK_VERSION);
            builderNewBuilder.setClientType(Integer.parseInt("1"));
            builderNewBuilder.setAppNamespace(Sailfish.appNameSpace);
            MonitorProto.AppInfo appInfoBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(appInfoBuild, "builder.build()");
            return appInfoBuild;
        }

        private final MonitorProto.ModuleMetric createModuleMetric(DataMetricModel dataMetricModel) {
            MonitorProto.ModuleMetric.Builder builderNewBuilder = MonitorProto.ModuleMetric.newBuilder();
            builderNewBuilder.setType(dataMetricModel.getType());
            builderNewBuilder.setTotalCnt(dataMetricModel.getTotalCnt());
            builderNewBuilder.setFailCnt(dataMetricModel.getFailCnt());
            builderNewBuilder.setErrorCode(dataMetricModel.getErrorCode());
            MonitorProto.ModuleMetric moduleMetricBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(moduleMetricBuild, "builder.build()");
            return moduleMetricBuild;
        }

        private final MonitorProto.ModuleStatus createModuleStatus(StatusMetricModel statusMetricModel) {
            MonitorProto.ModuleStatus.Builder builderNewBuilder = MonitorProto.ModuleStatus.newBuilder();
            builderNewBuilder.setType(statusMetricModel.getType());
            builderNewBuilder.setStatus(statusMetricModel.getStatus());
            MonitorProto.ModuleStatus moduleStatusBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(moduleStatusBuild, "builder.build()");
            return moduleStatusBuild;
        }

        private final MonitorProto.Monitor createMonitor(MonitorMetricModel monitorMetricModel) {
            MonitorProto.Monitor.Builder builderNewBuilder = MonitorProto.Monitor.newBuilder();
            Iterator<T> it = monitorMetricModel.getStatusMetricModelList().iterator();
            while (it.hasNext()) {
                builderNewBuilder.addModuleStatus(MonitorMetricModel.INSTANCE.createModuleStatus((StatusMetricModel) it.next()));
            }
            Iterator<T> it2 = monitorMetricModel.getDataMetricModelList().iterator();
            while (it2.hasNext()) {
                builderNewBuilder.addModuleMetric(MonitorMetricModel.INSTANCE.createModuleMetric((DataMetricModel) it2.next()));
            }
            MonitorProto.Monitor monitorBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(monitorBuild, "builder.build()");
            return monitorBuild;
        }

        @NotNull
        public final MonitorProto.MonitorMessage createMonitorMessage(@NotNull MonitorMetricModel monitorMetricModel) {
            Intrinsics.checkNotNullParameter(monitorMetricModel, "monitorMetricModel");
            MonitorProto.MonitorMessage.Builder builderNewBuilder = MonitorProto.MonitorMessage.newBuilder();
            builderNewBuilder.setHead(101);
            builderNewBuilder.setBody(createMonitor(monitorMetricModel).toByteString());
            MonitorProto.MonitorMessage monitorMessageBuild = builderNewBuilder.build();
            Intrinsics.checkNotNullExpressionValue(monitorMessageBuild, "builder.build()");
            return monitorMessageBuild;
        }
    }

    public MonitorMetricModel(@NotNull List<StatusMetricModel> statusMetricModelList, @NotNull List<DataMetricModel> dataMetricModelList) {
        Intrinsics.checkNotNullParameter(statusMetricModelList, "statusMetricModelList");
        Intrinsics.checkNotNullParameter(dataMetricModelList, "dataMetricModelList");
        this.statusMetricModelList = statusMetricModelList;
        this.dataMetricModelList = dataMetricModelList;
    }

    @NotNull
    public final List<DataMetricModel> getDataMetricModelList() {
        return this.dataMetricModelList;
    }

    @NotNull
    public final List<StatusMetricModel> getStatusMetricModelList() {
        return this.statusMetricModelList;
    }
}
