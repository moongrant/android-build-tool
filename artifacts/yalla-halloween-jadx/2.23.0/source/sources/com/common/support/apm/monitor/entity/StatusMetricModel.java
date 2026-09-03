package com.common.support.apm.monitor.entity;

import androidx.compose.foundation.layout.OooO0O0;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/common/support/apm/monitor/entity/StatusMetricModel;", "", "type", "", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "(II)V", "getStatus", "()I", "setStatus", "(I)V", "getType", "setType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class StatusMetricModel {
    private int status;
    private int type;

    public StatusMetricModel(int i, int i2) {
        this.type = i;
        this.status = i2;
    }

    public static /* synthetic */ StatusMetricModel copy$default(StatusMetricModel statusMetricModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = statusMetricModel.type;
        }
        if ((i3 & 2) != 0) {
            i2 = statusMetricModel.status;
        }
        return statusMetricModel.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final StatusMetricModel copy(int type, int status) {
        return new StatusMetricModel(type, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusMetricModel)) {
            return false;
        }
        StatusMetricModel statusMetricModel = (StatusMetricModel) other;
        return this.type == statusMetricModel.type && this.status == statusMetricModel.status;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type * 31) + this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("StatusMetricModel(type=");
        sb.append(this.type);
        sb.append(", status=");
        return OooO0O0.OooO00o(sb, this.status, ')');
    }
}
