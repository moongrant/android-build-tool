package p544o0o0OoOO;

import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import com.yalla.yalla.ui.vm.room.MemberVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class b5 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MemberListRemoveActivity f44207Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(MemberListRemoveActivity memberListRemoveActivity) {
        super(0);
        this.f44207Oooo0o = memberListRemoveActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MemberListRemoveActivity memberListRemoveActivity = this.f44207Oooo0o;
        MemberListRemoveActivity.OooO00o oooO00o = MemberListRemoveActivity.f22886Oooooo0;
        Objects.requireNonNull(memberListRemoveActivity);
        ArrayList arrayList = new ArrayList();
        Iterator it = memberListRemoveActivity.f22890OooooO0.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((RoomUserInfoModel) it.next()).getUserId()));
        }
        BaseActivityK.OooOoo0(memberListRemoveActivity, null, 0L, 3, null);
        ((MemberVM) memberListRemoveActivity.f22888Ooooo00.getValue()).deleteMemberList(memberListRemoveActivity.f22889Ooooo0o, arrayList).observe(memberListRemoveActivity, new OooOo(new y4(arrayList, memberListRemoveActivity), null, new z4(memberListRemoveActivity), false, 10));
        return Unit.INSTANCE;
    }
}
