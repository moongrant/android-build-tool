package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.CategoryModel;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0O extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomReTagActivity f26415OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CategoryModel f26416OooO0o0;

    public o00O0O0O(RoomReTagActivity roomReTagActivity, CategoryModel categoryModel) {
        this.f26415OooO0o = roomReTagActivity;
        this.f26416OooO0o0 = categoryModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        CategoryModel categoryModel = this.f26416OooO0o0;
        RoomReTagActivity roomReTagActivity = this.f26415OooO0o;
        try {
            CategoryModel categoryModel2 = new CategoryModel();
            categoryModel2.id = categoryModel.getId();
            categoryModel2.labelname = categoryModel.getLabelname();
            com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24551OooOOo.postValue(categoryModel2);
            p545o0oO0O00.OooOo00.OooO0O0(54, roomReTagActivity.f26189OooOOoo);
            roomReTagActivity.setResult(-1);
            roomReTagActivity.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
