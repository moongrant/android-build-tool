package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.data.db.table.UserInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/GuessUserData;", "Lcom/yalla/yalla/data/db/table/UserInfo;", "()V", "differenceNumber", "", "getDifferenceNumber", "()I", "setDifferenceNumber", "(I)V", "moraRankType", "getMoraRankType", "setMoraRankType", "num", "getNum", "setNum", "number", "getNumber", "setNumber", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GuessUserData extends UserInfo {
    public static final int $stable = 8;
    private int differenceNumber;
    private int moraRankType = 1;
    private int num;
    private int number;

    public final int getDifferenceNumber() {
        return this.differenceNumber;
    }

    public final int getMoraRankType() {
        return this.moraRankType;
    }

    public final int getNum() {
        return this.num;
    }

    public final int getNumber() {
        return this.number;
    }

    public final void setDifferenceNumber(int i) {
        this.differenceNumber = i;
    }

    public final void setMoraRankType(int i) {
        this.moraRankType = i;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setNumber(int i) {
        this.number = i;
    }
}
