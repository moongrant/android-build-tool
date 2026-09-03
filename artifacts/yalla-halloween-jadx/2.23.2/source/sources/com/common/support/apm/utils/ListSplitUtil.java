package com.common.support.apm.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/common/support/apm/utils/ListSplitUtil;", "", "()V", "split", "", "T", "dataList", "groupSize", "", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ListSplitUtil {

    @NotNull
    public static final ListSplitUtil INSTANCE = new ListSplitUtil();

    private ListSplitUtil() {
    }

    @NotNull
    public final <T> List<List<T>> split(@NotNull List<? extends T> dataList, int groupSize) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        if (groupSize <= 0) {
            throw new IllegalArgumentException("Argument groupSize must > 0");
        }
        int size = dataList.size();
        int i = ((size + groupSize) - 1) / groupSize;
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 * groupSize;
            i2++;
            int i4 = i2 * groupSize;
            if (i4 >= size) {
                i4 = size;
            }
            arrayList.add(dataList.subList(i3, i4));
        }
        return arrayList;
    }
}
