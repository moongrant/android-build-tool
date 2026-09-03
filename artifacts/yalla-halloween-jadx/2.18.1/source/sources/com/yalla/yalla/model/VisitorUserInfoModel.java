package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.common.db.table.UserInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR*\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013¨\u0006 "}, d2 = {"Lcom/yalla/yalla/model/VisitorUserInfoModel;", "Lcom/yalla/yalla/common/db/table/UserInfo;", "", "vid", "Ljava/lang/String;", "getVid", "()Ljava/lang/String;", "setVid", "(Ljava/lang/String;)V", "visittime", "getVisittime", "setVisittime", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isnew", "Z", "getIsnew", "()Z", "setIsnew", "(Z)V", "", "vtime", "J", "getVtime", "()J", "setVtime", "(J)V", "visitorType", "getVisitorType", "setVisitorType", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VisitorUserInfoModel extends UserInfo {
    public static final int $stable = 8;

    @NotNull
    private transient o0O00OO<Boolean> _isnew = o0OOO00.OooO0Oo(Boolean.FALSE);
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
