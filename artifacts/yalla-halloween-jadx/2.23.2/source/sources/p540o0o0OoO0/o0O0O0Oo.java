package p540o0o0OoO0;

import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0Oo extends Lambda implements Function1<RoomMemberTaskInfoModel, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O0O0Oo f54778OooO0Oo = new o0O0O0Oo();

    public o0O0O0Oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(RoomMemberTaskInfoModel roomMemberTaskInfoModel) {
        RoomMemberTaskInfoModel it = roomMemberTaskInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getTaskId());
    }
}
