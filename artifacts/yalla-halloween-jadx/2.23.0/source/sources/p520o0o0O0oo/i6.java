package p520o0o0O0oo;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class i6 extends Lambda implements Function1<RoomUserInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<RoomUserInfoModel, Unit> f53301OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(k8 k8Var) {
        super(1);
        this.f53301OooO0Oo = k8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel it = roomUserInfoModel;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<RoomUserInfoModel, Unit> function1 = this.f53301OooO0Oo;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }
}
