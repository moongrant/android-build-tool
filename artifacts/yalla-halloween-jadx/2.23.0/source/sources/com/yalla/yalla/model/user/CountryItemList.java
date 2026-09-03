package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.errorprone.annotations.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/model/user/CountryItemList;", "", "all", "", "Lcom/yalla/yalla/model/user/CountryItemData;", "hot", "(Ljava/util/List;Ljava/util/List;)V", "getAll", "()Ljava/util/List;", "getHot", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CountryItemList {
    public static final int $stable = 8;

    @NotNull
    private final List<CountryItemData> all;

    @NotNull
    private final List<CountryItemData> hot;

    public CountryItemList(@NotNull List<CountryItemData> all, @NotNull List<CountryItemData> hot) {
        Intrinsics.checkNotNullParameter(all, "all");
        Intrinsics.checkNotNullParameter(hot, "hot");
        this.all = all;
        this.hot = hot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountryItemList copy$default(CountryItemList countryItemList, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = countryItemList.all;
        }
        if ((i & 2) != 0) {
            list2 = countryItemList.hot;
        }
        return countryItemList.copy(list, list2);
    }

    @NotNull
    public final List<CountryItemData> component1() {
        return this.all;
    }

    @NotNull
    public final List<CountryItemData> component2() {
        return this.hot;
    }

    @NotNull
    public final CountryItemList copy(@NotNull List<CountryItemData> all, @NotNull List<CountryItemData> hot) {
        Intrinsics.checkNotNullParameter(all, "all");
        Intrinsics.checkNotNullParameter(hot, "hot");
        return new CountryItemList(all, hot);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryItemList)) {
            return false;
        }
        CountryItemList countryItemList = (CountryItemList) other;
        return Intrinsics.areEqual(this.all, countryItemList.all) && Intrinsics.areEqual(this.hot, countryItemList.hot);
    }

    @NotNull
    public final List<CountryItemData> getAll() {
        return this.all;
    }

    @NotNull
    public final List<CountryItemData> getHot() {
        return this.hot;
    }

    public int hashCode() {
        return this.hot.hashCode() + (this.all.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CountryItemList(all=" + this.all + ", hot=" + this.hot + ")";
    }
}
