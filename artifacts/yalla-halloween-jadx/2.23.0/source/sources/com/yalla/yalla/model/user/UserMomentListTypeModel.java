package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/user/UserMomentListTypeModel;", "Ljava/io/Serializable;", "type", "", "reId", "(II)V", "getReId", "()I", "getType", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UserMomentListTypeModel implements Serializable {
    public static final int $stable = 0;
    private final int reId;
    private final int type;

    public UserMomentListTypeModel(int i, int i2) {
        this.type = i;
        this.reId = i2;
    }

    public final int getReId() {
        return this.reId;
    }

    public final int getType() {
        return this.type;
    }
}
