package p530o0o0OOOO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o extends Lambda implements Function1<RoomUserInfoModel, Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53439OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(o0O00oO0 o0o00oo1) {
        super(1);
        this.f53439OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel item = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.isInRoom().getValue().booleanValue()) {
            this.f53439OooO0Oo.f53409OooOo00.put(item.getUserId().getValue(), item);
        }
        return item.getUserId().getValue();
    }
}
