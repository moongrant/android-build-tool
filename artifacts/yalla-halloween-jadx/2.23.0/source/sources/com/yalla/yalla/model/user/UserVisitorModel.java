package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/model/user/UserVisitorModel;", "", "()V", "count", "", "getCount", "()I", "setCount", "(I)V", "data", "", "Lcom/yalla/yalla/model/user/VisitorUserInfoModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "datesort", "", "getDatesort", "()Ljava/lang/String;", "setDatesort", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UserVisitorModel {
    public static final int $stable = 8;
    private int count;

    @NotNull
    private String datesort = "";

    @NotNull
    private List<VisitorUserInfoModel> data = new ArrayList();

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<VisitorUserInfoModel> getData() {
        return this.data;
    }

    @NotNull
    public final String getDatesort() {
        return this.datesort;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setData(@NotNull List<VisitorUserInfoModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setDatesort(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.datesort = str;
    }
}
