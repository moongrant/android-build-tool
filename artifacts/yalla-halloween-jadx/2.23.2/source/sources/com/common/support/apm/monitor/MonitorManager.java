package com.common.support.apm.monitor;

import com.common.support.apm.Sailfish;
import com.common.support.apm.monitor.entity.DataMetricModel;
import com.common.support.apm.monitor.entity.MonitorMetricModel;
import com.common.support.apm.monitor.entity.StatusMetricModel;
import com.facebook.internal.AnalyticsEvents;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0014\u0010\u0012J+\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0012J+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0012J,\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\u001f\u0010%\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u0016\u0010(\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fJ(\u0010)\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fJ\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001f0+H\u0002J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020-0+H\u0002J*\u0010/\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002J*\u0010/\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002J4\u0010\u001e\u001a\u00020\u00042\u0006\u00100\u001a\u00020-2\u0006\u00102\u001a\u0002012\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002J\u001a\u00103\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u00104\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J&\u00103\u001a\u00020\u00042\u0006\u00100\u001a\u00020-2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002J2\u0010)\u001a\u00020\u00042\u0006\u00100\u001a\u00020-2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u00105\u001a\u00020\u000fH\u0002J\u0010\u00106\u001a\u00020\u00042\u0006\u00100\u001a\u00020-H\u0002J\u0010\u00107\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002R\u0014\u00108\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010?\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010<R\u0016\u0010@\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010A\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010<R\u0016\u0010B\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010<R\u0016\u0010C\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010<R\u0016\u0010D\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010G\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010H\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020-0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010Q\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010O¨\u0006T"}, d2 = {"Lcom/common/support/apm/monitor/MonitorManager;", "", "Lo0ooOO0o/o0OoO00O;", "okHttpClient", "", "init$sailfish_release", "(Lo0ooOO0o/o0OoO00O;)V", "init", "", "createMonitorMessage$sailfish_release", "()[B", "createMonitorMessage", "", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "errorCode", "", "instantReport", "updateInitStatusMetric$sailfish_release", "(IIZ)V", "updateInitStatusMetric", "updateGetConfigStatusMetric$sailfish_release", "updateGetConfigStatusMetric", "updateNetDetectStatusMetric$sailfish_release", "updateNetDetectStatusMetric", "updateUploadStatusMetric$sailfish_release", "updateUploadStatusMetric", "type", "isSuccess", "", "throwable", "updateHttpCallDataMetric", "Lcom/common/support/apm/monitor/entity/StatusMetricModel;", "statusMetric", "", "initSpendTime", "writeMonitorLogForInit$sailfish_release", "(Lcom/common/support/apm/monitor/entity/StatusMetricModel;J)V", "writeMonitorLogForInit", "totalCnt", "failCnt", "updateUploadOperatorDataMetric", "updateDataMetric", "resetAllDataMetric", "", "createStatusMetricModel", "Lcom/common/support/apm/monitor/entity/DataMetricModel;", "createDataMetricModel", "updateStatusMetric", "dataMetric", "Lcom/common/support/apm/monitor/ConsecutiveEventIntGenerator;", "generator", "writeMonitorLog", "getModuleErrorType", "reset", "resetDataMetric", "convertToModuleStatus", "DEFAULT_CONSECUTIVE_TIMES", "I", "DEFAULT_EXCLUDED_ELEMENT", "initStatusMetric", "Lcom/common/support/apm/monitor/entity/StatusMetricModel;", "configStatusMetric", "netDetectStatusMetric", "uploadStatusMetric", "lastInitStatusMetric", "lastConfigStatusMetric", "lastNetDetectStatusMetric", "lastUploadStatusMetric", "getConfigHttpCallMetric", "Lcom/common/support/apm/monitor/entity/DataMetricModel;", "netDetectHttpCallMetric", "fileUploadHttpCallMetric", "uploadOperatorMetric", "dataMetricList", "Ljava/util/List;", "Lcom/common/support/apm/monitor/MonitorReport;", "monitorReport", "Lcom/common/support/apm/monitor/MonitorReport;", "getConfigGenerator", "Lcom/common/support/apm/monitor/ConsecutiveEventIntGenerator;", "netDetectGenerator", "fileUploadGenerator", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 7, 1})
public final class MonitorManager {
    private static final int DEFAULT_CONSECUTIVE_TIMES = 3;
    private static final int DEFAULT_EXCLUDED_ELEMENT = 0;

    @NotNull
    private static final List<DataMetricModel> dataMetricList;

    @NotNull
    private static final ConsecutiveEventIntGenerator fileUploadGenerator;

    @NotNull
    private static final ConsecutiveEventIntGenerator getConfigGenerator;
    private static MonitorReport monitorReport;

    @NotNull
    private static final ConsecutiveEventIntGenerator netDetectGenerator;

    @NotNull
    private static DataMetricModel uploadOperatorMetric;

    @NotNull
    public static final MonitorManager INSTANCE = new MonitorManager();

    @NotNull
    private static StatusMetricModel initStatusMetric = new StatusMetricModel(1, 0);

    @NotNull
    private static StatusMetricModel configStatusMetric = new StatusMetricModel(2, 0);

    @NotNull
    private static StatusMetricModel netDetectStatusMetric = new StatusMetricModel(3, 0);

    @NotNull
    private static StatusMetricModel uploadStatusMetric = new StatusMetricModel(4, 0);

    @NotNull
    private static StatusMetricModel lastInitStatusMetric = StatusMetricModel.copy$default(initStatusMetric, 0, 0, 3, null);

    @NotNull
    private static StatusMetricModel lastConfigStatusMetric = StatusMetricModel.copy$default(configStatusMetric, 0, 0, 3, null);

    @NotNull
    private static StatusMetricModel lastNetDetectStatusMetric = StatusMetricModel.copy$default(netDetectStatusMetric, 0, 0, 3, null);

    @NotNull
    private static StatusMetricModel lastUploadStatusMetric = StatusMetricModel.copy$default(uploadStatusMetric, 0, 0, 3, null);

    @NotNull
    private static DataMetricModel getConfigHttpCallMetric = new DataMetricModel(2, 0, 0, 0);

    @NotNull
    private static DataMetricModel netDetectHttpCallMetric = new DataMetricModel(3, 0, 0, 0);

    @NotNull
    private static DataMetricModel fileUploadHttpCallMetric = new DataMetricModel(4, 0, 0, 0);

    static {
        DataMetricModel dataMetricModel = new DataMetricModel(5, 0, 0, 0);
        uploadOperatorMetric = dataMetricModel;
        dataMetricList = CollectionsKt.listOf((Object[]) new DataMetricModel[]{getConfigHttpCallMetric, netDetectHttpCallMetric, fileUploadHttpCallMetric, dataMetricModel});
        getConfigGenerator = new ConsecutiveEventIntGenerator(3, 0, new Function1<Integer, Unit>() { // from class: com.common.support.apm.monitor.MonitorManager$getConfigGenerator$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MonitorManager monitorManager = MonitorManager.INSTANCE;
                MonitorManager.updateGetConfigStatusMetric$sailfish_release$default(monitorManager, monitorManager.convertToModuleStatus(i), i, false, 4, null);
            }
        }, new Function1<Integer, Unit>() { // from class: com.common.support.apm.monitor.MonitorManager$getConfigGenerator$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MonitorManager.updateGetConfigStatusMetric$sailfish_release$default(MonitorManager.INSTANCE, i, 0, false, 6, null);
            }
        });
        netDetectGenerator = new ConsecutiveEventIntGenerator(3, 0, new Function1<Integer, Unit>() { // from class: com.common.support.apm.monitor.MonitorManager$netDetectGenerator$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MonitorManager monitorManager = MonitorManager.INSTANCE;
                MonitorManager.updateNetDetectStatusMetric$sailfish_release$default(monitorManager, monitorManager.convertToModuleStatus(i), i, false, 4, null);
            }
        }, new Function1<Integer, Unit>() { // from class: com.common.support.apm.monitor.MonitorManager$netDetectGenerator$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MonitorManager.updateNetDetectStatusMetric$sailfish_release$default(MonitorManager.INSTANCE, i, 0, false, 6, null);
            }
        });
        fileUploadGenerator = new ConsecutiveEventIntGenerator(3, 0, new Function1<Integer, Unit>() { // from class: com.common.support.apm.monitor.MonitorManager$fileUploadGenerator$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MonitorManager monitorManager = MonitorManager.INSTANCE;
                MonitorManager.updateUploadStatusMetric$sailfish_release$default(monitorManager, monitorManager.convertToModuleStatus(i), i, false, 4, null);
            }
        }, new Function1<Integer, Unit>() { // from class: com.common.support.apm.monitor.MonitorManager$fileUploadGenerator$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                MonitorManager.updateUploadStatusMetric$sailfish_release$default(MonitorManager.INSTANCE, i, 0, false, 6, null);
            }
        });
    }

    private MonitorManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int convertToModuleStatus(int errorCode) {
        boolean z = false;
        if (errorCode >= 0) {
            if (errorCode == 403) {
                return 4;
            }
            return errorCode >= 0 && errorCode < 1000 ? 5 : 6;
        }
        if (errorCode != -100) {
            if (-399 <= errorCode && errorCode < -199) {
                z = true;
            }
            if (z) {
                return 1;
            }
            if (errorCode <= -400) {
                return 2;
            }
        }
        return 3;
    }

    private final List<DataMetricModel> createDataMetricModel() {
        List<DataMetricModel> list = dataMetricList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((DataMetricModel) obj).getTotalCnt() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<StatusMetricModel> createStatusMetricModel() {
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.areEqual(lastInitStatusMetric, initStatusMetric)) {
            StatusMetricModel statusMetricModelCopy$default = StatusMetricModel.copy$default(initStatusMetric, 0, 0, 3, null);
            lastInitStatusMetric = statusMetricModelCopy$default;
            arrayList.add(statusMetricModelCopy$default);
        }
        if (!Intrinsics.areEqual(lastConfigStatusMetric, configStatusMetric)) {
            StatusMetricModel statusMetricModelCopy$default2 = StatusMetricModel.copy$default(configStatusMetric, 0, 0, 3, null);
            lastConfigStatusMetric = statusMetricModelCopy$default2;
            arrayList.add(statusMetricModelCopy$default2);
        }
        if (!Intrinsics.areEqual(lastNetDetectStatusMetric, netDetectStatusMetric)) {
            StatusMetricModel statusMetricModelCopy$default3 = StatusMetricModel.copy$default(netDetectStatusMetric, 0, 0, 3, null);
            lastNetDetectStatusMetric = statusMetricModelCopy$default3;
            arrayList.add(statusMetricModelCopy$default3);
        }
        if (!Intrinsics.areEqual(lastUploadStatusMetric, uploadStatusMetric)) {
            StatusMetricModel statusMetricModelCopy$default4 = StatusMetricModel.copy$default(uploadStatusMetric, 0, 0, 3, null);
            lastUploadStatusMetric = statusMetricModelCopy$default4;
            arrayList.add(statusMetricModelCopy$default4);
        }
        return arrayList;
    }

    private final int getModuleErrorType(int errorCode) {
        return errorCode >= 0 ? 1 : 0;
    }

    private final void resetDataMetric(DataMetricModel dataMetric) {
        dataMetric.setTotalCnt(0);
        dataMetric.setFailCnt(0);
        dataMetric.setErrorCode(0);
    }

    public static /* synthetic */ void updateDataMetric$default(MonitorManager monitorManager, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        monitorManager.updateDataMetric(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateGetConfigStatusMetric$sailfish_release$default(MonitorManager monitorManager, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        monitorManager.updateGetConfigStatusMetric$sailfish_release(i, i2, z);
    }

    public static /* synthetic */ void updateHttpCallDataMetric$default(MonitorManager monitorManager, int i, boolean z, int i2, Throwable th, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            th = null;
        }
        monitorManager.updateHttpCallDataMetric(i, z, i2, th);
    }

    public static /* synthetic */ void updateInitStatusMetric$sailfish_release$default(MonitorManager monitorManager, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        monitorManager.updateInitStatusMetric$sailfish_release(i, i2, z);
    }

    public static /* synthetic */ void updateNetDetectStatusMetric$sailfish_release$default(MonitorManager monitorManager, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        monitorManager.updateNetDetectStatusMetric$sailfish_release(i, i2, z);
    }

    private final void updateStatusMetric(int type, int status, int errorCode, boolean instantReport) {
        if (type == 1) {
            updateStatusMetric(initStatusMetric, status, errorCode, instantReport);
            return;
        }
        if (type == 2) {
            updateStatusMetric(configStatusMetric, status, errorCode, instantReport);
        } else if (type == 3) {
            updateStatusMetric(netDetectStatusMetric, status, errorCode, instantReport);
        } else {
            if (type != 4) {
                return;
            }
            updateStatusMetric(uploadStatusMetric, status, errorCode, instantReport);
        }
    }

    public static /* synthetic */ void updateStatusMetric$default(MonitorManager monitorManager, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z = false;
        }
        monitorManager.updateStatusMetric(i, i2, i3, z);
    }

    public static /* synthetic */ void updateUploadStatusMetric$sailfish_release$default(MonitorManager monitorManager, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        monitorManager.updateUploadStatusMetric$sailfish_release(i, i2, z);
    }

    private final void writeMonitorLog(StatusMetricModel statusMetric, int errorCode) {
        Sailfish.INSTANCE.writeMonitorLog(MonitorLogHelper.INSTANCE.create(statusMetric.getType(), statusMetric.getStatus(), getModuleErrorType(errorCode), errorCode, ""));
    }

    public static /* synthetic */ void writeMonitorLog$default(MonitorManager monitorManager, StatusMetricModel statusMetricModel, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        monitorManager.writeMonitorLog(statusMetricModel, i);
    }

    @NotNull
    public final byte[] createMonitorMessage$sailfish_release() {
        byte[] byteArray = MonitorMetricModel.INSTANCE.createMonitorMessage(new MonitorMetricModel(createStatusMetricModel(), createDataMetricModel())).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "MonitorMetricModel.creat…etricModel).toByteArray()");
        return byteArray;
    }

    public final void init$sailfish_release(@NotNull o0OoO00O okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        MonitorReport monitorReport2 = new MonitorReport(okHttpClient);
        monitorReport = monitorReport2;
        monitorReport2.start();
    }

    public final void resetAllDataMetric() {
        Iterator<T> it = dataMetricList.iterator();
        while (it.hasNext()) {
            INSTANCE.resetDataMetric((DataMetricModel) it.next());
        }
    }

    public final void updateDataMetric(int type, int totalCnt, int failCnt, int errorCode) {
        if (type == 2) {
            updateDataMetric$default(this, getConfigHttpCallMetric, totalCnt, failCnt, errorCode, false, 16, null);
            return;
        }
        if (type == 3) {
            updateDataMetric$default(this, netDetectHttpCallMetric, totalCnt, failCnt, errorCode, false, 16, null);
        } else if (type == 4) {
            updateDataMetric$default(this, fileUploadHttpCallMetric, totalCnt, failCnt, errorCode, false, 16, null);
        } else {
            if (type != 5) {
                return;
            }
            updateDataMetric(uploadOperatorMetric, totalCnt, failCnt, errorCode, true);
        }
    }

    public final void updateGetConfigStatusMetric$sailfish_release(int status, int errorCode, boolean instantReport) {
        updateStatusMetric(2, status, errorCode, instantReport);
    }

    public final void updateHttpCallDataMetric(int type, boolean isSuccess, int errorCode, @Nullable Throwable throwable) {
        if (type == 2) {
            updateHttpCallDataMetric(getConfigHttpCallMetric, getConfigGenerator, isSuccess, errorCode, throwable);
        } else if (type == 3) {
            updateHttpCallDataMetric(netDetectHttpCallMetric, netDetectGenerator, isSuccess, errorCode, throwable);
        } else {
            if (type != 4) {
                return;
            }
            updateHttpCallDataMetric(fileUploadHttpCallMetric, fileUploadGenerator, isSuccess, errorCode, throwable);
        }
    }

    public final void updateInitStatusMetric$sailfish_release(int status, int errorCode, boolean instantReport) {
        updateStatusMetric(1, status, errorCode, instantReport);
    }

    public final void updateNetDetectStatusMetric$sailfish_release(int status, int errorCode, boolean instantReport) {
        updateStatusMetric(3, status, errorCode, instantReport);
    }

    public final void updateUploadOperatorDataMetric(int totalCnt, int failCnt) {
        if (failCnt > 0) {
            updateDataMetric$default(this, 5, totalCnt, failCnt, 0, 8, null);
        }
    }

    public final void updateUploadStatusMetric$sailfish_release(int status, int errorCode, boolean instantReport) {
        updateStatusMetric(4, status, errorCode, instantReport);
    }

    public final void writeMonitorLogForInit$sailfish_release(@NotNull StatusMetricModel statusMetric, long initSpendTime) {
        Intrinsics.checkNotNullParameter(statusMetric, "statusMetric");
        Sailfish.INSTANCE.writeMonitorLog(MonitorLogHelper.INSTANCE.createInit(statusMetric.getType(), statusMetric.getStatus(), -1, initSpendTime, 0, ""));
    }

    public static /* synthetic */ void updateDataMetric$default(MonitorManager monitorManager, DataMetricModel dataMetricModel, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        monitorManager.updateDataMetric(dataMetricModel, i, i2, i3, z);
    }

    public static /* synthetic */ void updateHttpCallDataMetric$default(MonitorManager monitorManager, DataMetricModel dataMetricModel, ConsecutiveEventIntGenerator consecutiveEventIntGenerator, boolean z, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            th = null;
        }
        monitorManager.updateHttpCallDataMetric(dataMetricModel, consecutiveEventIntGenerator, z, i, th);
    }

    public static /* synthetic */ void updateStatusMetric$default(MonitorManager monitorManager, StatusMetricModel statusMetricModel, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            z = false;
        }
        monitorManager.updateStatusMetric(statusMetricModel, i, i2, z);
    }

    public static /* synthetic */ void writeMonitorLog$default(MonitorManager monitorManager, DataMetricModel dataMetricModel, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        monitorManager.writeMonitorLog(dataMetricModel, i, th);
    }

    private final void updateHttpCallDataMetric(DataMetricModel dataMetric, ConsecutiveEventIntGenerator generator, boolean isSuccess, int errorCode, Throwable throwable) {
        if (isSuccess) {
            dataMetric.setTotalCnt(dataMetric.getTotalCnt() + 1);
            dataMetric.setFailCnt(dataMetric.getFailCnt() + 0);
            generator.addElement(0);
            return;
        }
        dataMetric.setTotalCnt(dataMetric.getTotalCnt() + 1);
        dataMetric.setFailCnt(dataMetric.getFailCnt() + 1);
        dataMetric.setErrorCode(errorCode);
        generator.addElement(errorCode);
        if (throwable instanceof UnknownHostException) {
            return;
        }
        writeMonitorLog(dataMetric, errorCode, throwable);
    }

    private final void updateDataMetric(DataMetricModel dataMetric, int totalCnt, int failCnt, int errorCode, boolean reset) {
        if (reset) {
            resetDataMetric(dataMetric);
        }
        dataMetric.setTotalCnt(dataMetric.getTotalCnt() + totalCnt);
        dataMetric.setFailCnt(dataMetric.getFailCnt() + failCnt);
        dataMetric.setErrorCode(errorCode);
    }

    private final void updateStatusMetric(StatusMetricModel statusMetric, int status, int errorCode, boolean instantReport) {
        statusMetric.setStatus(status);
        if (status != 0) {
            writeMonitorLog(statusMetric, errorCode);
        }
        if (instantReport) {
            MonitorReport monitorReport2 = monitorReport;
            if (monitorReport2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("monitorReport");
                monitorReport2 = null;
            }
            monitorReport2.reportMonitor();
        }
    }

    private final void writeMonitorLog(DataMetricModel dataMetric, int errorCode, Throwable throwable) {
        String string;
        MonitorLogHelper.Companion companion = MonitorLogHelper.INSTANCE;
        int type = dataMetric.getType();
        if (throwable == null || (string = throwable.toString()) == null) {
            string = "";
        }
        Sailfish.INSTANCE.writeMonitorLog(companion.create(type, 0, 1, errorCode, string));
    }
}
