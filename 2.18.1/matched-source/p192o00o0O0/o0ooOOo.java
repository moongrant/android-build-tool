package p192o00o0O0;

import android.view.View;
import com.android.billingclient.api.OooOOO0;
import com.android.billingclient.api.Oooo000;
import com.app.selectPicture.activity.AllImagesActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.common.manager.googlepay.GooglePayManager;
import com.yalla.yalla.model.RoomKickUser;
import com.yalla.yalla.ui.activity.room.KickRecordActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p193o00o0O00.OooOo;
import p200o00o0Oo0.o0000Ooo;
import p200o00o0Oo0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements o0000Ooo, Oooo000, BaseQuickAdapter.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f33105OooO0Oo;

    public /* synthetic */ o0ooOOo(Object obj) {
        this.f33105OooO0Oo = obj;
    }

    @Override // p200o00o0Oo0.o0000Ooo
    public final void OooO0o0(Object obj, Object obj2) {
        AllImagesActivity allImagesActivity = (AllImagesActivity) this.f33105OooO0Oo;
        int i = AllImagesActivity.f12251ooOO;
        Objects.requireNonNull(allImagesActivity);
        switch (((Integer) obj2).intValue()) {
            case 1010:
                if (allImagesActivity.f12252Oooo == 9) {
                    if (OooOo.f33127OooO0OO == null) {
                        OooOo.f33127OooO0OO = new o0000oo() { // from class: o00o0O00.OooOo00
                            @Override // p200o00o0Oo0.o0000oo
                            public final void OooO00o(String str) {
                            }
                        };
                    }
                    OooOo.f33127OooO0OO.OooO00o("Moments_post_pic_cancel");
                }
                allImagesActivity.onBackPressed();
                break;
            case 1011:
                if (allImagesActivity.f12252Oooo == 9) {
                    if (OooOo.f33127OooO0OO == null) {
                        OooOo.f33127OooO0OO = new o0000oo() { // from class: o00o0O00.OooOo00
                            @Override // p200o00o0Oo0.o0000oo
                            public final void OooO00o(String str) {
                            }
                        };
                    }
                    OooOo.f33127OooO0OO.OooO00o("Moments_post_pic_success");
                }
                allImagesActivity.onBackPressed();
                break;
            case 1012:
            case 1013:
                allImagesActivity.OooOOoo(!allImagesActivity.f12274o000oOoO.isShown());
                break;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        KickRecordActivity this$0 = (KickRecordActivity) this.f33105OooO0Oo;
        int i2 = KickRecordActivity.f22842Oooooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.RoomKickUser");
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, this$0, String.valueOf(((RoomKickUser) obj).getUserId()), false, 12);
    }

    @Override // com.android.billingclient.api.Oooo000
    public final void onPurchasesUpdated(OooOOO0 oooOOO0, List list) {
        GooglePayManager.m287purchasesUpdatedListener$lambda0((GooglePayManager) this.f33105OooO0Oo, oooOOO0, list);
    }
}
