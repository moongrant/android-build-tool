package p524o0o0OO0o;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends Lambda implements Function1<RoomUserInfoModel, MutableStateFlow<Long>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O0o0 f53508OooO0Oo = new o0O0o0();

    public o0O0o0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MutableStateFlow<Long> invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel item = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getUserId();
    }
}
