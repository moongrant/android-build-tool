package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.CountryModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/model/CountryListModel;", "", "()V", "data", "", "Lcom/app/base/model/CountryModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "showCount", "", "getShowCount", "()I", "setShowCount", "(I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CountryListModel {
    public static final int $stable = 8;

    @Nullable
    private List<CountryModel> data;
    private int showCount;

    @Nullable
    public final List<CountryModel> getData() {
        return this.data;
    }

    public final int getShowCount() {
        return this.showCount;
    }

    public final void setData(@Nullable List<CountryModel> list) {
        this.data = list;
    }

    public final void setShowCount(int i) {
        this.showCount = i;
    }
}
