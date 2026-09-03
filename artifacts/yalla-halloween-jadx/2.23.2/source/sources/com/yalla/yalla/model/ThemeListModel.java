package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/model/ThemeListModel;", "", "()V", "themItem", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/ThemeModel;", "Lkotlin/collections/ArrayList;", "getThemItem", "()Ljava/util/ArrayList;", "setThemItem", "(Ljava/util/ArrayList;)V", "themTypeId", "", "getThemTypeId", "()I", "setThemTypeId", "(I)V", "themTypeName", "", "getThemTypeName", "()Ljava/lang/String;", "setThemTypeName", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ThemeListModel {
    public static final int $stable = 8;

    @Nullable
    private ArrayList<ThemeModel> themItem;
    private int themTypeId;

    @NotNull
    private String themTypeName = "";

    @Nullable
    public final ArrayList<ThemeModel> getThemItem() {
        return this.themItem;
    }

    public final int getThemTypeId() {
        return this.themTypeId;
    }

    @NotNull
    public final String getThemTypeName() {
        return this.themTypeName;
    }

    public final void setThemItem(@Nullable ArrayList<ThemeModel> arrayList) {
        this.themItem = arrayList;
    }

    public final void setThemTypeId(int i) {
        this.themTypeId = i;
    }

    public final void setThemTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.themTypeName = str;
    }
}
