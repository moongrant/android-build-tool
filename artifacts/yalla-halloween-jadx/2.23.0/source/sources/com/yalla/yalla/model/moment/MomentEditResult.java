package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentEditResult;", "Ljava/io/Serializable;", "()V", "dyId", "", "getDyId", "()J", "setDyId", "(J)V", "editId", "getEditId", "setEditId", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentEditResult implements Serializable {
    public static final int $stable = 8;
    private long dyId;
    private long editId;

    public final long getDyId() {
        return this.dyId;
    }

    public final long getEditId() {
        return this.editId;
    }

    public final void setDyId(long j) {
        this.dyId = j;
    }

    public final void setEditId(long j) {
        this.editId = j;
    }
}
