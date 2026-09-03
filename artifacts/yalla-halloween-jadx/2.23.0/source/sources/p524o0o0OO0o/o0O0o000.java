package p524o0o0OO0o;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends Lambda implements Function1<RoomUserInfoModel, MutableStateFlow<Long>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53509OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(o0O00 o0o01) {
        super(1);
        this.f53509OooO0Oo = o0o01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final MutableStateFlow<Long> invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel item = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.isInRoom().getValue().booleanValue()) {
            this.f53509OooO0Oo.f53475OooOo00.put(item.getUserId().getValue(), item);
        }
        return item.getUserId();
    }
}
