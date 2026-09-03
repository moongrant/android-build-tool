package com.yalla.yalla.model.user;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.data.db.table.UserInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/model/user/VisitorUserInfoModel;", "Lcom/yalla/yalla/data/db/table/UserInfo;", "()V", "_isnew", "Landroidx/compose/runtime/MutableState;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isnew", "getIsnew", "()Z", "setIsnew", "(Z)V", "vid", "", "getVid", "()Ljava/lang/String;", "setVid", "(Ljava/lang/String;)V", "visitorType", "getVisitorType", "setVisitorType", "visittime", "getVisittime", "setVisittime", "vtime", "", "getVtime", "()J", "setVtime", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VisitorUserInfoModel extends UserInfo {
    public static final int $stable = 8;

    @NotNull
    private transient MutableState<Boolean> _isnew = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private boolean isnew;

    @Nullable
    private String vid;
    private boolean visitorType;

    @Nullable
    private String visittime;
    private long vtime;

    public final boolean getIsnew() {
        if (this.isnew != this._isnew.getValue().booleanValue()) {
            this._isnew.setValue(Boolean.valueOf(this.isnew));
        }
        return this._isnew.getValue().booleanValue();
    }

    @Nullable
    public final String getVid() {
        return this.vid;
    }

    public final boolean getVisitorType() {
        return this.visitorType;
    }

    @Nullable
    public final String getVisittime() {
        return this.visittime;
    }

    public final long getVtime() {
        return this.vtime;
    }

    public final void setIsnew(boolean z) {
        this.isnew = z;
        this._isnew.setValue(Boolean.valueOf(z));
    }

    public final void setVid(@Nullable String str) {
        this.vid = str;
    }

    public final void setVisitorType(boolean z) {
        this.visitorType = z;
    }

    public final void setVisittime(@Nullable String str) {
        this.visittime = str;
    }

    public final void setVtime(long j) {
        this.vtime = j;
    }
}
