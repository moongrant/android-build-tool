package p570o0oOoO;

import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.RoomBroadcastModel;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O {
    public static final boolean OooO00o(@Nullable RoomBroadcastModel roomBroadcastModel) {
        return o0OoOo0.OooOO0(roomBroadcastModel != null ? Long.valueOf(roomBroadcastModel.getFromBlindBoxId()) : null) > 0;
    }

    public static final boolean OooO0O0(@Nullable RoomBroadcastModel roomBroadcastModel) {
        Integer numValueOf = roomBroadcastModel != null ? Integer.valueOf(roomBroadcastModel.getType()) : null;
        return ((numValueOf != null && numValueOf.intValue() == 12) || (numValueOf != null && numValueOf.intValue() == 14)) || (numValueOf != null && numValueOf.intValue() == 22);
    }

    public static final boolean OooO0OO(@Nullable RoomBroadcastModel roomBroadcastModel) {
        Integer numValueOf = roomBroadcastModel != null ? Integer.valueOf(roomBroadcastModel.getType()) : null;
        return (((((((numValueOf != null && numValueOf.intValue() == 10) || (numValueOf != null && numValueOf.intValue() == 12)) || (numValueOf != null && numValueOf.intValue() == 14)) || (numValueOf != null && numValueOf.intValue() == 15)) || (numValueOf != null && numValueOf.intValue() == 16)) || (numValueOf != null && numValueOf.intValue() == 17)) || (numValueOf != null && numValueOf.intValue() == 21)) || (numValueOf != null && numValueOf.intValue() == 22);
    }
}
