package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.bean.AbsJavaBeanApiList;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/FriendsModelBean;", "Lcom/yalla/yalla/model/bean/AbsJavaBeanApiList;", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/FriendsModel;", "Lkotlin/collections/ArrayList;", "()V", "isreset", "", "getIsreset", "()Z", "setIsreset", "(Z)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FriendsModelBean extends AbsJavaBeanApiList<ArrayList<FriendsModel>> {
    public static final int $stable = 8;
    private boolean isreset;

    public final boolean getIsreset() {
        return this.isreset;
    }

    public final void setIsreset(boolean z) {
        this.isreset = z;
    }
}
