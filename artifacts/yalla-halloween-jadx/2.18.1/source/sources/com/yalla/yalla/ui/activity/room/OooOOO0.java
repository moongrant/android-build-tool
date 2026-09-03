package com.yalla.yalla.ui.activity.room;

import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.model.CategoryModel;
import java.util.Map;
import java.util.Objects;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;
import p544o0o0OoOO.b6;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements o00Oo00.OooO0O0<CategoryModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomReTagActivity f22924OooO0Oo;

    public OooOOO0(RoomReTagActivity roomReTagActivity) {
        this.f22924OooO0Oo = roomReTagActivity;
    }

    @Override // o00Oo00.OooO0O0
    public final void OooO0O0(CategoryModel categoryModel, int i, AbsListenerTag absListenerTag) {
        CategoryModel categoryModel2 = categoryModel;
        if (RoomReTagActivity.OooO00o.f22968OooO00o[absListenerTag.ordinal()] != 1) {
            return;
        }
        RoomReTagActivity roomReTagActivity = this.f22924OooO0Oo;
        int i2 = RoomReTagActivity.f22964Ooooo00;
        Objects.requireNonNull(roomReTagActivity);
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = o00000OO.f32210OooO0Oo;
        String barid = roomReTagActivity.f22967OoooOoo.getBarid();
        String id = categoryModel2.getId();
        b6 b6Var = new b6(roomReTagActivity, categoryModel2);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("barid", barid);
        mapOooO0O0.put("labelid", id);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0Oo(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32260OoooO0, mapOooO0O0, b6Var);
    }
}
