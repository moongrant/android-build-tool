package p580o0oOoOo;

import com.yalla.yalla.model.RoomMemberTaskInfoModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ooOOOOoo extends Lambda implements Function1<RoomMemberTaskInfoModel, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final ooOOOOoo f46741Oooo0o = new ooOOOOoo();

    public ooOOOOoo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(RoomMemberTaskInfoModel roomMemberTaskInfoModel) {
        RoomMemberTaskInfoModel it = roomMemberTaskInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getTaskId());
    }
}
