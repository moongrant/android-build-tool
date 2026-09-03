package p536o0o0OOoo;

import androidx.lifecycle.Observer;
import com.app.base.interfaceType.FeedbackType;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z1<T> implements Observer {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        String it = (String) t;
        if (OooO0OO.OooO00o(it)) {
            return;
        }
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        webPageInfo.OooO0Oo(it);
        webPageInfo.f21220OoooO0 = true;
        webPageInfo.OooO0OO(OooOOO.OooO0OO(R.string.user_unique_id));
        webPageInfo.OooO00o("type", FeedbackType.Suggestions);
    }
}
