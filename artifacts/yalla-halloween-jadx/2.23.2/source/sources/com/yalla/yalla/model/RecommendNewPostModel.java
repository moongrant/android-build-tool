package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.data.db.table.UserInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/model/RecommendNewPostModel;", "Lcom/yalla/yalla/data/db/table/UserInfo;", "()V", "isRead", "", "()Z", "setRead", "(Z)V", "maxDyId", "", "getMaxDyId", "()J", "setMaxDyId", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RecommendNewPostModel extends UserInfo {
    public static final int $stable = 8;
    private boolean isRead;
    private long maxDyId;

    public final long getMaxDyId() {
        return this.maxDyId;
    }

    /* JADX INFO: renamed from: isRead, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    public final void setMaxDyId(long j) {
        this.maxDyId = j;
    }

    public final void setRead(boolean z) {
        this.isRead = z;
    }
}
