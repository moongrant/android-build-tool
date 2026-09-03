package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/model/room/RoomMemberConveneListModel;", "Ljava/io/Serializable;", "()V", "data", "", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "datacount", "", "getDatacount", "()I", "setDatacount", "(I)V", "hasNext", "", "getHasNext", "()Z", "setHasNext", "(Z)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomMemberConveneListModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private List<RoomUserInfoDTO> data;
    private int datacount;
    private boolean hasNext;

    @Nullable
    public final List<RoomUserInfoDTO> getData() {
        return this.data;
    }

    public final int getDatacount() {
        return this.datacount;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    public final void setData(@Nullable List<RoomUserInfoDTO> list) {
        this.data = list;
    }

    public final void setDatacount(int i) {
        this.datacount = i;
    }

    public final void setHasNext(boolean z) {
        this.hasNext = z;
    }
}
