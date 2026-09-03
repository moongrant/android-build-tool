package com.app.base.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/app/base/model/UserHeaderFrameModelList;", "Ljava/io/Serializable;", "()V", "dataOfLock", "Ljava/util/ArrayList;", "Lcom/app/base/model/UserHeaderFrameModel;", "Lkotlin/collections/ArrayList;", "getDataOfLock", "()Ljava/util/ArrayList;", "setDataOfLock", "(Ljava/util/ArrayList;)V", "dataOfUnlock", "getDataOfUnlock", "setDataOfUnlock", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UserHeaderFrameModelList implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private ArrayList<UserHeaderFrameModel> dataOfLock;

    @Nullable
    private ArrayList<UserHeaderFrameModel> dataOfUnlock;

    @Nullable
    public final ArrayList<UserHeaderFrameModel> getDataOfLock() {
        return this.dataOfLock;
    }

    @Nullable
    public final ArrayList<UserHeaderFrameModel> getDataOfUnlock() {
        return this.dataOfUnlock;
    }

    public final void setDataOfLock(@Nullable ArrayList<UserHeaderFrameModel> arrayList) {
        this.dataOfLock = arrayList;
    }

    public final void setDataOfUnlock(@Nullable ArrayList<UserHeaderFrameModel> arrayList) {
        this.dataOfUnlock = arrayList;
    }
}
