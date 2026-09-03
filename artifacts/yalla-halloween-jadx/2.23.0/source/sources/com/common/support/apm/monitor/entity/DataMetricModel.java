package com.common.support.apm.monitor.entity;

import androidx.compose.foundation.layout.OooO0O0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/common/support/apm/monitor/entity/DataMetricModel;", "", "type", "", "totalCnt", "failCnt", "errorCode", "(IIII)V", "getErrorCode", "()I", "setErrorCode", "(I)V", "getFailCnt", "setFailCnt", "getTotalCnt", "setTotalCnt", "getType", "setType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DataMetricModel {
    private int errorCode;
    private int failCnt;
    private int totalCnt;
    private int type;

    public DataMetricModel(int i, int i2, int i3, int i4) {
        this.type = i;
        this.totalCnt = i2;
        this.failCnt = i3;
        this.errorCode = i4;
    }

    public static /* synthetic */ DataMetricModel copy$default(DataMetricModel dataMetricModel, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = dataMetricModel.type;
        }
        if ((i5 & 2) != 0) {
            i2 = dataMetricModel.totalCnt;
        }
        if ((i5 & 4) != 0) {
            i3 = dataMetricModel.failCnt;
        }
        if ((i5 & 8) != 0) {
            i4 = dataMetricModel.errorCode;
        }
        return dataMetricModel.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalCnt() {
        return this.totalCnt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFailCnt() {
        return this.failCnt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final DataMetricModel copy(int type, int totalCnt, int failCnt, int errorCode) {
        return new DataMetricModel(type, totalCnt, failCnt, errorCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataMetricModel)) {
            return false;
        }
        DataMetricModel dataMetricModel = (DataMetricModel) other;
        return this.type == dataMetricModel.type && this.totalCnt == dataMetricModel.totalCnt && this.failCnt == dataMetricModel.failCnt && this.errorCode == dataMetricModel.errorCode;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getFailCnt() {
        return this.failCnt;
    }

    public final int getTotalCnt() {
        return this.totalCnt;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type * 31) + this.totalCnt) * 31) + this.failCnt) * 31) + this.errorCode;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setFailCnt(int i) {
        this.failCnt = i;
    }

    public final void setTotalCnt(int i) {
        this.totalCnt = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DataMetricModel(type=");
        sb.append(this.type);
        sb.append(", totalCnt=");
        sb.append(this.totalCnt);
        sb.append(", failCnt=");
        sb.append(this.failCnt);
        sb.append(", errorCode=");
        return OooO0O0.OooO00o(sb, this.errorCode, ')');
    }
}
