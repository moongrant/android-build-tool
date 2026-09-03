package p193o00o0O0;

import android.view.View;
import androidx.fragment.app.o000O00O;
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
import p194o00o0O00.OooOo00;
import p201o00o0Oo0.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements o0000Ooo, Oooo000, BaseQuickAdapter.OooOOO0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Object f33128Oooo;

    public /* synthetic */ o0ooOOo(Object obj) {
        this.f33128Oooo = obj;
    }

    @Override // p201o00o0Oo0.o0000Ooo
    public final void OooO0o0(Object obj, Object obj2) {
        AllImagesActivity allImagesActivity = (AllImagesActivity) this.f33128Oooo;
        int i = AllImagesActivity.f12266o00Ooo;
        Objects.requireNonNull(allImagesActivity);
        switch (((Integer) obj2).intValue()) {
            case 1010:
                if (allImagesActivity.f12270OoooO0O == 9) {
                    if (OooOo00.f33151OooO0OO == null) {
                        OooOo00.f33151OooO0OO = o000O00O.f8503OooO00o;
                    }
                    OooOo00.f33151OooO0OO.OooO00o("Moments_post_pic_cancel");
                }
                allImagesActivity.onBackPressed();
                break;
            case 1011:
                if (allImagesActivity.f12270OoooO0O == 9) {
                    if (OooOo00.f33151OooO0OO == null) {
                        OooOo00.f33151OooO0OO = o000O00O.f8503OooO00o;
                    }
                    OooOo00.f33151OooO0OO.OooO00o("Moments_post_pic_success");
                }
                allImagesActivity.onBackPressed();
                break;
            case 1012:
            case 1013:
                allImagesActivity.OooOOoo(!allImagesActivity.f12274OoooOo0.isShown());
                break;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        KickRecordActivity this$0 = (KickRecordActivity) this.f33128Oooo;
        int i2 = KickRecordActivity.f22861o0OoOo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23471o0OOO0o;
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.RoomKickUser");
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, this$0, String.valueOf(((RoomKickUser) obj).getUserId()), false, 12);
    }

    @Override // com.android.billingclient.api.Oooo000
    public final void onPurchasesUpdated(OooOOO0 oooOOO0, List list) {
        GooglePayManager.m287purchasesUpdatedListener$lambda0((GooglePayManager) this.f33128Oooo, oooOOO0, list);
    }
}
