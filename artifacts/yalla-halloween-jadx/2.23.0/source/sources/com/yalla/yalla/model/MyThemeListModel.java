package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/model/MyThemeListModel;", "", "()V", "currentThemeId", "", "getCurrentThemeId", "()J", "setCurrentThemeId", "(J)V", "data", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/ThemeModel;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "isRoom", "", "()Z", "setRoom", "(Z)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MyThemeListModel {
    public static final int $stable = 8;
    private long currentThemeId;

    @Nullable
    private ArrayList<ThemeModel> data;
    private boolean isRoom;

    public final long getCurrentThemeId() {
        return this.currentThemeId;
    }

    @Nullable
    public final ArrayList<ThemeModel> getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: isRoom, reason: from getter */
    public final boolean getIsRoom() {
        return this.isRoom;
    }

    public final void setCurrentThemeId(long j) {
        this.currentThemeId = j;
    }

    public final void setData(@Nullable ArrayList<ThemeModel> arrayList) {
        this.data = arrayList;
    }

    public final void setRoom(boolean z) {
        this.isRoom = z;
    }
}
