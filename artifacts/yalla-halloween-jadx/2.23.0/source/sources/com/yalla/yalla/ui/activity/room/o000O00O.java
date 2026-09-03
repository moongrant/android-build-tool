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
public final class o000O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MemberListRemoveActivity f26845OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(MemberListRemoveActivity memberListRemoveActivity) {
        super(0);
        this.f26845OooO0Oo = memberListRemoveActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MemberListRemoveActivity.f26562OooOoO0;
        MemberListRemoveActivity memberListRemoveActivity = this.f26845OooO0Oo;
        memberListRemoveActivity.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = memberListRemoveActivity.f26567OooOo0O.iterator();
        while (it.hasNext()) {
            arrayList.add(((RoomUserInfoModel) it.next()).getUserId().getValue());
        }
        BaseActivityK.OooOo0o(memberListRemoveActivity, null, 0L, 3);
        ((MemberVM) memberListRemoveActivity.f26566OooOo00.getValue()).deleteMemberList(memberListRemoveActivity.f26565OooOo0, arrayList).observe(memberListRemoveActivity, new p377o0OOoOo.o0000OO0(new o000O0o(arrayList, memberListRemoveActivity), null, new o000Oo0(memberListRemoveActivity), false, 10));
        return Unit.INSTANCE;
    }
}
