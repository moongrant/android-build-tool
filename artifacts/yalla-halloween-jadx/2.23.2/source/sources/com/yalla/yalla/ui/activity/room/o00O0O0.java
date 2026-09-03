package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.model.CategoryModel;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 implements p400o0Oo0O0.OooOOO0<CategoryModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomReTagActivity f26412OooO00o;

    public o00O0O0(RoomReTagActivity roomReTagActivity) {
        this.f26412OooO00o = roomReTagActivity;
    }

    @Override // p400o0Oo0O0.OooOOO0
    public final void OooO00o(int i, Object obj, Object obj2) {
        CategoryModel categoryModel = (CategoryModel) obj;
        if (RoomReTagActivity.OooO00o.f26190OooO00o[((AbsListenerTag) obj2).ordinal()] != 1) {
            return;
        }
        int i2 = RoomReTagActivity.f26186OooOo00;
        RoomReTagActivity roomReTagActivity = this.f26412OooO00o;
        roomReTagActivity.getClass();
        p384o0OOoo0O.o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
        String barid = roomReTagActivity.f26189OooOOoo.getBarid();
        String id = categoryModel.getId();
        o00O0O0O o00o0o0o2 = new o00O0O0O(roomReTagActivity, categoryModel);
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("barid", barid);
        linkedHashMapOooO00o.put("labelid", id);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43375OoooO0, linkedHashMapOooO00o, o00o0o0o2);
    }
}
