package com.yalla.yalla.module.event.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.SquareEventRoomModel;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p394o0Oo00oO.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/module/event/vm/EventRoomPreviewViewModel;", "Lo0Oo00oO/o0O0O00;", "", "initialPageRoomId", "J", "getInitialPageRoomId", "()J", "setInitialPageRoomId", "(J)V", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/SquareEventRoomModel;", "Lkotlin/collections/ArrayList;", "roomListSquare", "Ljava/util/ArrayList;", "getRoomListSquare", "()Ljava/util/ArrayList;", "setRoomListSquare", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class EventRoomPreviewViewModel extends o0O0O00 {
    public static final int $stable = 8;
    private long initialPageRoomId;

    @Nullable
    private ArrayList<SquareEventRoomModel> roomListSquare;

    public final long getInitialPageRoomId() {
        return this.initialPageRoomId;
    }

    @Nullable
    public final ArrayList<SquareEventRoomModel> getRoomListSquare() {
        return this.roomListSquare;
    }

    public final void setInitialPageRoomId(long j) {
        this.initialPageRoomId = j;
    }

    public final void setRoomListSquare(@Nullable ArrayList<SquareEventRoomModel> arrayList) {
        this.roomListSquare = arrayList;
    }
}
