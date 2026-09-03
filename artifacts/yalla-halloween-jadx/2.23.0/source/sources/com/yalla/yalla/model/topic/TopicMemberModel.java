package com.yalla.yalla.model.topic;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.data.db.table.UserInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/topic/TopicMemberModel;", "", "()V", "data", "", "Lcom/yalla/yalla/data/db/table/UserInfo;", "getData", "()Ljava/util/List;", "dateSort", "", "getDateSort", "()J", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicMemberModel {
    public static final int $stable = 8;

    @Nullable
    private final List<UserInfo> data;

    @SerializedName("datesort")
    private final long dateSort;

    @Nullable
    public final List<UserInfo> getData() {
        return this.data;
    }

    public final long getDateSort() {
        return this.dateSort;
    }
}
