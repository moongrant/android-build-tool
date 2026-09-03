package p669oO0Oo;

import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends Lambda implements Function1<RoomMemberTaskInfoModel, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O0000 f60531OooO0Oo = new o00O0000();

    public o00O0000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(RoomMemberTaskInfoModel roomMemberTaskInfoModel) {
        RoomMemberTaskInfoModel it = roomMemberTaskInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getTaskId());
    }
}
