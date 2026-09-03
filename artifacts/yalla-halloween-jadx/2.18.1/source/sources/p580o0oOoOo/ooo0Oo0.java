package p580o0oOoOo;

import com.yalla.yalla.model.RoomMemberTaskHostInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ooo0Oo0 extends Lambda implements Function1<RoomMemberTaskHostInfoModel, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final ooo0Oo0 f46742Oooo0o = new ooo0Oo0();

    public ooo0Oo0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(RoomMemberTaskHostInfoModel roomMemberTaskHostInfoModel) {
        RoomMemberTaskHostInfoModel it = roomMemberTaskHostInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getTaskId());
    }
}
