package com.yalla.yalla.model.http;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/model/http/ApiPage;", "", "pageIndex", "", "pageSize", "dateSort", "", "(IILjava/lang/Long;)V", "getDateSort", "()Ljava/lang/Long;", "setDateSort", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPageIndex", "()I", "setPageIndex", "(I)V", "getPageSize", "setPageSize", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ApiPage {
    public static final int $stable = 8;

    @SerializedName(alternate = {"datesort"}, value = "dateSort")
    @Nullable
    private Long dateSort;

    @SerializedName(alternate = {"pageindex", "index"}, value = "pageIndex")
    private int pageIndex;

    @SerializedName(alternate = {"pagesize"}, value = "pageSize")
    private int pageSize;

    public ApiPage() {
        this(0, 0, null, 7, null);
    }

    @Nullable
    public final Long getDateSort() {
        return this.dateSort;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final void setDateSort(@Nullable Long l) {
        this.dateSort = l;
    }

    public final void setPageIndex(int i) {
        this.pageIndex = i;
    }

    public final void setPageSize(int i) {
        this.pageSize = i;
    }

    public ApiPage(int i, int i2, @Nullable Long l) {
        this.pageIndex = i;
        this.pageSize = i2;
        this.dateSort = l;
    }

    public ApiPage(int i, int i2, Long l, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? Integer.parseInt("15") : i2, (i3 & 4) != 0 ? 0L : l);
    }
}
