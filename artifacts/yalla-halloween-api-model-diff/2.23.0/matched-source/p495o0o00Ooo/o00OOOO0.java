package p495o0o00Ooo;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.o000000;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.room.RoomActivityModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomActivityModel.RoomActivitys f48768OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(RoomActivityModel.RoomActivitys roomActivitys) {
        super(0);
        this.f48768OooO0Oo = roomActivitys;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomActivityModel.RoomActivitys roomActivitys = this.f48768OooO0Oo;
        if (roomActivitys != null) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.RoomActivity);
            String str = roomActivitys.activityurl;
            Intrinsics.checkNotNullExpressionValue(str, "it.activityurl");
            webPageInfo.OooO0o0(str);
            String str2 = roomActivitys.title;
            Intrinsics.checkNotNullExpressionValue(str2, "it.title");
            webPageInfo.OooO0Oo(str2);
            webPageInfo.f32821OooO0oo = false;
            webPageInfo.f32829OooOOo0 = Long.valueOf(o000000.OooO0o(roomActivitys.id));
            WebPageInfo.ShareType.Companion companion = WebPageInfo.ShareType.INSTANCE;
            int i = roomActivitys.isshare;
            companion.getClass();
            WebPageInfo.ShareType shareTypeOooO00o = WebPageInfo.ShareType.Companion.OooO00o(i);
            String str3 = roomActivitys.imageurl;
            Intrinsics.checkNotNullExpressionValue(str3, "it.imageurl");
            String str4 = roomActivitys.description;
            Intrinsics.checkNotNullExpressionValue(str4, "it.description");
            webPageInfo.OooO0OO(shareTypeOooO00o, str3, str4);
            webPageInfo.OooO00o("barId", String.valueOf(OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue()));
            if (roomActivitys.shopType) {
                OooO00o.f24977OooO0o.OooO0Oo(webPageInfo);
            } else {
                Context context = o000O0.f10354OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i2 = WebActivity.f25584OooOoO0;
                    WebActivity.OooO00o.OooO00o(activityOooO0O0, webPageInfo);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
