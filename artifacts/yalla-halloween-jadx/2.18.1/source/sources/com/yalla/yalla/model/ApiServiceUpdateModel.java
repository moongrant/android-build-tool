package com.yalla.yalla.model;

import Oooo000.Oooo0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/ApiServiceUpdateModel;", "", "isServiceUp", "", "(Z)V", "()Z", "setServiceUp", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ApiServiceUpdateModel {
    public static final int $stable = 8;
    private boolean isServiceUp;

    public ApiServiceUpdateModel() {
        this(false, 1, null);
    }

    public ApiServiceUpdateModel(boolean z) {
        this.isServiceUp = z;
    }

    public static /* synthetic */ ApiServiceUpdateModel copy$default(ApiServiceUpdateModel apiServiceUpdateModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = apiServiceUpdateModel.isServiceUp;
        }
        return apiServiceUpdateModel.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsServiceUp() {
        return this.isServiceUp;
    }

    @NotNull
    public final ApiServiceUpdateModel copy(boolean isServiceUp) {
        return new ApiServiceUpdateModel(isServiceUp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiServiceUpdateModel) && this.isServiceUp == ((ApiServiceUpdateModel) other).isServiceUp;
    }

    public int hashCode() {
        boolean z = this.isServiceUp;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isServiceUp() {
        return this.isServiceUp;
    }

    public final void setServiceUp(boolean z) {
        this.isServiceUp = z;
    }

    @NotNull
    public String toString() {
        return Oooo0.OooO0O0(OooO00o.OooO00o.OooO0o0("ApiServiceUpdateModel(isServiceUp="), this.isServiceUp, ')');
    }

    public /* synthetic */ ApiServiceUpdateModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
