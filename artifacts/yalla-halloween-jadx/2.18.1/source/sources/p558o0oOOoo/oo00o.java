package p558o0oOOoo;

import android.app.Activity;
import com.app.base.model.RoomActivityModel;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000Oo0;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomActivityModel.RoomActivitys f44829Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Activity f44830Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(RoomActivityModel.RoomActivitys roomActivitys, Activity activity) {
        super(0);
        this.f44829Oooo0o = roomActivitys;
        this.f44830Oooo0oO = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomActivityModel.RoomActivitys roomActivitys = this.f44829Oooo0o;
        if (roomActivitys != null) {
            Activity activity = this.f44830Oooo0oO;
            o0O00000.OooO0o0("InRoom_activity", roomActivitys.title);
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
            String str = roomActivitys.activityurl;
            Intrinsics.checkNotNullExpressionValue(str, "it.activityurl");
            webPageInfo.OooO0Oo(str);
            String str2 = roomActivitys.title;
            Intrinsics.checkNotNullExpressionValue(str2, "it.title");
            webPageInfo.OooO0OO(str2);
            webPageInfo.f21221OoooO00 = false;
            webPageInfo.f21227OoooOoO = Long.valueOf(o000Oo0.OooO0o0(roomActivitys.id));
            WebPageInfo.ShareType shareTypeOooO00o = WebPageInfo.ShareType.INSTANCE.OooO00o(roomActivitys.isshare);
            String str3 = roomActivitys.imageurl;
            Intrinsics.checkNotNullExpressionValue(str3, "it.imageurl");
            String str4 = roomActivitys.description;
            Intrinsics.checkNotNullExpressionValue(str4, "it.description");
            webPageInfo.OooO0O0(shareTypeOooO00o, str3, str4);
            webPageInfo.OooO00o("barId", String.valueOf(o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue()));
            if (roomActivitys.shopType) {
                o00O.f43140OooO00o.OooOOO(webPageInfo);
                return Unit.INSTANCE;
            }
            if (activity != null) {
                WebActivity.f22108OoooooO.OooO00o(activity, webPageInfo);
                return Unit.INSTANCE;
            }
        }
        return null;
    }
}
