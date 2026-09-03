package p501o0o00o;

import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 extends Lambda implements Function1<RoomUserInfoModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<RoomUserInfoModel, Unit> f41435Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000(Function1<? super RoomUserInfoModel, Unit> function1) {
        super(1);
        this.f41435Oooo0o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel it = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<RoomUserInfoModel, Unit> function1 = this.f41435Oooo0o;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }
}
