package p669oO0Oo;

import com.yalla.yalla.model.room.RoomMemberTaskHostInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O extends Lambda implements Function1<RoomMemberTaskHostInfoModel, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000O0O f60446OooO0Oo = new o0000O0O();

    public o0000O0O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(RoomMemberTaskHostInfoModel roomMemberTaskHostInfoModel) {
        RoomMemberTaskHostInfoModel it = roomMemberTaskHostInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getTaskId());
    }
}
