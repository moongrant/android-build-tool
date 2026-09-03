package p536o0o0OOoo;

import androidx.lifecycle.Observer;
import com.app.base.model.RoomIndexModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import kotlin.jvm.internal.Intrinsics;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class y1<T> implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f43895OooO00o;

    public y1(SystemMessageActivity systemMessageActivity) {
        this.f43895OooO00o = systemMessageActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        String barid;
        String it = (String) t;
        if (OooO0OO.OooO00o(it)) {
            return;
        }
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        RoomIndexModel value = OooOOO.f41251Oooo0OO.getValue();
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserLevel);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        webPageInfo.OooO0Oo(it);
        webPageInfo.OooO0OO(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.room_info_bonus));
        if (value != null && (barid = value.barid) != null) {
            Intrinsics.checkNotNullExpressionValue(barid, "barid");
            webPageInfo.OooO00o("barId", barid);
        }
        WebActivity.f22108OoooooO.OooO00o(this.f43895OooO00o, webPageInfo);
    }
}
