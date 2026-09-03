package com.yalla.yalla.ui.activity.room;

import android.net.Uri;
import androidx.lifecycle.Observer;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.vm.CreateRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.a;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f26433OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(CreateRoomActivity createRoomActivity) {
        super(1);
        this.f26433OooO0Oo = createRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            int i = CreateRoomActivity.f26050OooOoo0;
            final CreateRoomActivity createRoomActivity = this.f26433OooO0Oo;
            createRoomActivity.getClass();
            p650o0ooo.o00O0OO0.OooO00o().getClass();
            final a aVar = new a();
            aVar.OooO0O0(p562o0oOo000.o000000.uploading, createRoomActivity);
            CreateRoomVM createRoomVM = createRoomActivity.f26060OooOoO0;
            if (createRoomVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                createRoomVM = null;
            }
            createRoomVM.uploadRoomHeader(uriOooO0O0).observe(createRoomActivity, new Observer() { // from class: com.yalla.yalla.ui.activity.room.o00O0O
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    String strOooO00o;
                    p182o00o000O.OooO0o oooO0o = (p182o00o000O.OooO0o) obj;
                    int i2 = CreateRoomActivity.f26050OooOoo0;
                    CreateRoomActivity this$0 = createRoomActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    aVar.OooO00o();
                    if (oooO0o == null || (strOooO00o = oooO0o.OooO00o()) == null) {
                        return;
                    }
                    this$0.f26061OooOoOO = strOooO00o;
                    o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this$0);
                    int iOooO00o = com.code.android.util.o0000O0.OooO00o(110);
                    oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o, iOooO00o, strOooO00o);
                    oooO00o.f43124OooO00o = 0;
                    oooO00o.OooO0o0(com.code.android.util.o0000O0.OooO00o(6));
                    NetImageView netImageView = this$0.f26052OooOOo0;
                    if (netImageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
                        netImageView = null;
                    }
                    oooO00o.OooO0Oo(netImageView);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
