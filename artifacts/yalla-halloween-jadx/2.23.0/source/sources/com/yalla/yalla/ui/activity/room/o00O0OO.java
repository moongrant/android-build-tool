package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.CategoryModel;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomReTagActivity f26871OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CategoryModel f26872OooO0o0;

    public o00O0OO(RoomReTagActivity roomReTagActivity, CategoryModel categoryModel) {
        this.f26871OooO0o = roomReTagActivity;
        this.f26872OooO0o0 = categoryModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        CategoryModel categoryModel = this.f26872OooO0o0;
        RoomReTagActivity roomReTagActivity = this.f26871OooO0o;
        try {
            CategoryModel categoryModel2 = new CategoryModel();
            categoryModel2.id = categoryModel.getId();
            categoryModel2.labelname = categoryModel.getLabelname();
            com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25013OooOOo.postValue(categoryModel2);
            com.squareup.okhttp.OooOo.OooO0OO(54, roomReTagActivity.f26643OooOOoo);
            roomReTagActivity.setResult(-1);
            roomReTagActivity.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
