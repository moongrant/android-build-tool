package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.CategoryModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function1<CategoryModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26882OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26882OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CategoryModel categoryModel) {
        int i = RoomSettingActivity.f26645Oooo00O;
        this.f26882OooO0Oo.OooOoO0();
        return Unit.INSTANCE;
    }
}
