package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.room.MemberVM;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MemberListRemoveActivity f26400OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(MemberListRemoveActivity memberListRemoveActivity) {
        super(0);
        this.f26400OooO0Oo = memberListRemoveActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MemberListRemoveActivity.f26110OooOoO0;
        MemberListRemoveActivity memberListRemoveActivity = this.f26400OooO0Oo;
        memberListRemoveActivity.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = memberListRemoveActivity.f26115OooOo0O.iterator();
        while (it.hasNext()) {
            arrayList.add(((RoomUserInfoModel) it.next()).getUserId().getValue());
        }
        BaseActivityK.OooOo0o(memberListRemoveActivity, null, 0L, 3);
        ((MemberVM) memberListRemoveActivity.f26114OooOo00.getValue()).deleteMemberList(memberListRemoveActivity.f26113OooOo0, arrayList).observe(memberListRemoveActivity, new p384o0OOoo0O.o000oOoO(new o000(arrayList, memberListRemoveActivity), null, new o000O000(memberListRemoveActivity), false, 10));
        return Unit.INSTANCE;
    }
}
