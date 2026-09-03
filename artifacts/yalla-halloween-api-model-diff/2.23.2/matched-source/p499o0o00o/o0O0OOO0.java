package p499o0o00o;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.o000000;
import com.code.android.util.o000O00O;
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
public final class o0O0OOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomActivityModel.RoomActivitys f49943OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(RoomActivityModel.RoomActivitys roomActivitys) {
        super(0);
        this.f49943OooO0Oo = roomActivitys;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomActivityModel.RoomActivitys roomActivitys = this.f49943OooO0Oo;
        if (roomActivitys != null) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.RoomActivity);
            String activityurl = roomActivitys.activityurl;
            Intrinsics.checkNotNullExpressionValue(activityurl, "activityurl");
            webPageInfo.OooO0o0(activityurl);
            String title = roomActivitys.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            webPageInfo.OooO0Oo(title);
            webPageInfo.f32285OooO0oo = false;
            webPageInfo.f32293OooOOo0 = Long.valueOf(o000000.OooO0o(roomActivitys.id));
            WebPageInfo.ShareType.Companion companion = WebPageInfo.ShareType.INSTANCE;
            int i = roomActivitys.isshare;
            companion.getClass();
            WebPageInfo.ShareType shareTypeOooO00o = WebPageInfo.ShareType.Companion.OooO00o(i);
            String imageurl = roomActivitys.imageurl;
            Intrinsics.checkNotNullExpressionValue(imageurl, "imageurl");
            String description = roomActivitys.description;
            Intrinsics.checkNotNullExpressionValue(description, "description");
            webPageInfo.OooO0OO(shareTypeOooO00o, imageurl, description);
            webPageInfo.OooO00o("barId", String.valueOf(OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue()));
            if (roomActivitys.shopType) {
                OooO00o.f24515OooO0o.OooO0Oo(webPageInfo);
            } else {
                Context context = o000O00O.f13421OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i2 = WebActivity.f25130OooOoO0;
                    WebActivity.OooO00o.OooO00o(activityOooO0O0, webPageInfo);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
