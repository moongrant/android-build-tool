package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/common/model/ShowImageModel;", "Ljava/io/Serializable;", "()V", "data", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/common/model/ShowImageItemModel;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ShowImageModel implements Serializable {
    public static final int $stable = 8;

    @NotNull
    private ArrayList<ShowImageItemModel> data = new ArrayList<>();

    @NotNull
    public final ArrayList<ShowImageItemModel> getData() {
        return this.data;
    }

    public final void setData(@NotNull ArrayList<ShowImageItemModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.data = arrayList;
    }
}
