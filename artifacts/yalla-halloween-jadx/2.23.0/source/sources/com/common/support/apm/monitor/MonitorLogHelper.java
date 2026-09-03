package com.common.support.apm.monitor;

import com.common.support.apm.Sailfish;
import com.common.support.apm.base.LoggerKt;
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/common/support/apm/monitor/MonitorLogHelper;", "", "()V", "monitorLogList", "Ljava/util/ArrayList;", "Lcom/common/support/sailfish_commons/logmodels/CustomLogModel;", "Lkotlin/collections/ArrayList;", "add", "", "customLogModel", "getAllAndClear", "", "getFirstAndRemove", "isEmpty", "", "size", "", "Companion", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MonitorLogHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private ArrayList<CustomLogModel> monitorLogList = new ArrayList<>();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ<\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\u000f"}, d2 = {"Lcom/common/support/apm/monitor/MonitorLogHelper$Companion;", "", "()V", "create", "Lcom/common/support/sailfish_commons/logmodels/CustomLogModel;", "type", "", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "errorType", "errorCode", "errorMsg", "", "createInit", "initSpendTime", "", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CustomLogModel create$default(Companion companion, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            int i6 = i4;
            if ((i5 & 16) != 0) {
                str = "";
            }
            return companion.create(i, i2, i3, i6, str);
        }

        @NotNull
        public final CustomLogModel create(int type, int status, int errorType, int errorCode, @Nullable String errorMsg) {
            CustomLogModel customLogModel = new CustomLogModel();
            customLogModel.setTag(LoggerKt.DEFAULT_LOG_TAG);
            customLogModel.setIden(Sailfish.uniqueId);
            if (errorMsg == null) {
                errorMsg = "";
            }
            customLogModel.setMessage(errorMsg);
            customLogModel.setTime(String.valueOf(System.currentTimeMillis()));
            customLogModel.setAppVersion(Sailfish.appVersion);
            customLogModel.setNetworkAvailable(Sailfish.INSTANCE.isNetAvailable$sailfish_release());
            customLogModel.addParams("type", type);
            customLogModel.addParams(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, status);
            customLogModel.addParams("errorType", errorType);
            customLogModel.addParams("errorCode", errorCode);
            return customLogModel;
        }

        @NotNull
        public final CustomLogModel createInit(int type, int status, int errorType, long initSpendTime, int errorCode, @Nullable String errorMsg) {
            CustomLogModel customLogModelCreate = create(type, status, errorType, errorCode, errorMsg);
            customLogModelCreate.addParams("initSpendTime", initSpendTime);
            return customLogModelCreate;
        }
    }

    public final synchronized void add(@NotNull CustomLogModel customLogModel) {
        Intrinsics.checkNotNullParameter(customLogModel, "customLogModel");
        this.monitorLogList.add(customLogModel);
    }

    @NotNull
    public final synchronized List<CustomLogModel> getAllAndClear() {
        List<CustomLogModel> list;
        list = CollectionsKt.toList(this.monitorLogList);
        this.monitorLogList.clear();
        return list;
    }

    @Nullable
    public final synchronized CustomLogModel getFirstAndRemove() {
        CustomLogModel customLogModel;
        customLogModel = (CustomLogModel) CollectionsKt.firstOrNull((List) this.monitorLogList);
        this.monitorLogList.remove(customLogModel);
        return customLogModel;
    }

    public final synchronized boolean isEmpty() {
        return this.monitorLogList.isEmpty();
    }

    public final synchronized int size() {
        return this.monitorLogList.size();
    }
}
