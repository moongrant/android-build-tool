package com.app.base.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/app/base/model/CountryCodeModel;", "Ljava/io/Serializable;", "()V", "hotCountries", "", "Lcom/app/base/model/CountryCodeItemModel;", "getHotCountries", "()Ljava/util/List;", "setHotCountries", "(Ljava/util/List;)V", "moreCountries", "getMoreCountries", "setMoreCountries", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CountryCodeModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private List<CountryCodeItemModel> hotCountries;

    @Nullable
    private List<CountryCodeItemModel> moreCountries;

    @Nullable
    public final List<CountryCodeItemModel> getHotCountries() {
        return this.hotCountries;
    }

    @Nullable
    public final List<CountryCodeItemModel> getMoreCountries() {
        return this.moreCountries;
    }

    public final void setHotCountries(@Nullable List<CountryCodeItemModel> list) {
        this.hotCountries = list;
    }

    public final void setMoreCountries(@Nullable List<CountryCodeItemModel> list) {
        this.moreCountries = list;
    }
}
