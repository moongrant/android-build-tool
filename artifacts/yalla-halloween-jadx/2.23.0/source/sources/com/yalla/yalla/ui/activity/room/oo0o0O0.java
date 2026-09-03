package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.model.CategoryModel;
import java.util.LinkedHashMap;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 implements p629o0ooO0O0.o0000Ooo<CategoryModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomReTagActivity f26962OooO00o;

    public oo0o0O0(RoomReTagActivity roomReTagActivity) {
        this.f26962OooO00o = roomReTagActivity;
    }

    @Override // p629o0ooO0O0.o0000Ooo
    public final void OooO00o(int i, Object obj, Object obj2) {
        CategoryModel categoryModel = (CategoryModel) obj;
        if (RoomReTagActivity.OooO00o.f26644OooO00o[((AbsListenerTag) obj2).ordinal()] != 1) {
            return;
        }
        int i2 = RoomReTagActivity.f26640OooOo00;
        RoomReTagActivity roomReTagActivity = this.f26962OooO00o;
        roomReTagActivity.getClass();
        p377o0OOoOo.o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
        String barid = roomReTagActivity.f26643OooOOoo.getBarid();
        String id = categoryModel.getId();
        o00O0OO o00o0oo2 = new o00O0OO(roomReTagActivity, categoryModel);
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("barid", barid);
        linkedHashMapOooO00o.put("labelid", id);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44116OoooO0, linkedHashMapOooO00o, o00o0oo2);
    }
}
