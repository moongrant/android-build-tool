package com.yalla.yalla.ui.activity.room;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.yalla.ui.vm.CreateRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.O0000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f26866OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(CreateRoomActivity createRoomActivity) {
        super(1);
        this.f26866OooO0Oo = createRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            int i = CreateRoomActivity.f26502OooOoo0;
            CreateRoomActivity createRoomActivity = this.f26866OooO0Oo;
            createRoomActivity.getClass();
            p519o0o0O0oO.o0O00O0o.OooO00o().getClass();
            O0000000 o0000000 = new O0000000();
            o0000000.OooO0O0(oO00OOo0.uploading, createRoomActivity);
            CreateRoomVM createRoomVM = createRoomActivity.f26512OooOoO0;
            if (createRoomVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                createRoomVM = null;
            }
            createRoomVM.uploadRoomHeader(uriOooO0O0).observe(createRoomActivity, new o0OOO0o(o0000000, createRoomActivity));
        }
        return Unit.INSTANCE;
    }
}
