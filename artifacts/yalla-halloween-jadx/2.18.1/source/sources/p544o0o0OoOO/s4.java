package p544o0o0OoOO;

import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class s4 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MemberListConveneActivity f44307Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(MemberListConveneActivity memberListConveneActivity) {
        super(1);
        this.f44307Oooo0o = memberListConveneActivity;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f44307Oooo0o.f22869OoooooO.clear();
        }
        return Unit.INSTANCE;
    }
}
