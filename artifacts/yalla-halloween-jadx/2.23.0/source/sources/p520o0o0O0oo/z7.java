package p520o0o0O0oo;

import android.widget.FrameLayout;
import androidx.camera.core.impl.OooOOOO;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.gift.GiftBlindDetail;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager;
import com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutShowSelectViewManager;
import com.yalla.yalla.util.WebPageInfo;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p579o0oOoo.oOo0o00;

/* JADX INFO: loaded from: classes4.dex */
public final class z7 extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53420OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(x6 x6Var) {
        super(1);
        this.f53420OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        GiftPropModel giftPropModel2;
        GiftBlindDetail giftBlindDetail;
        GiftPropModel giftPropModel3 = giftPropModel;
        x6 x6Var = this.f53420OooO0Oo;
        if (!x6Var.OooOOo().f58234OooOOoo.isShown() && Intrinsics.areEqual(giftPropModel3, x6Var.f53384OooOOo) && (giftPropModel2 = x6Var.f53384OooOOo) != null && (giftBlindDetail = giftPropModel2.getGiftBlindDetail()) != null) {
            String blindBoxUrl = giftBlindDetail.getBlindBoxUrl();
            boolean zIsNewType = giftBlindDetail.isNewType();
            FragmentActivity fragmentActivity = x6Var.f53375OooO0oO;
            GiftPropTypeShow giftPropTypeShow = x6Var.f53374OooO;
            if (zIsNewType) {
                String strOooO00o = oOo0o00.OooO00o("");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                Object value = o000000O.OooOOO0().getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                String strOooO0O0 = oOo0o00.OooO0O0(strOooO00o, "region", sb.toString());
                long localGiftBlindId = giftBlindDetail.getLocalGiftBlindId();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(localGiftBlindId);
                String strOooO0O1 = oOo0o00.OooO0O0(oOo0o00.OooO0O0(oOo0o00.OooO0O0(strOooO0O0, "giftid", sb2.toString()), "showArea", String.valueOf(giftPropTypeShow.getValue())), "boxTab", String.valueOf(giftBlindDetail.getLevel()));
                String strOooO00o2 = OooOOOO.OooO00o(blindBoxUrl, strOooO0O1);
                if (giftBlindDetail.isFullScreen()) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
                    webPageInfo.f32821OooO0oo = false;
                    webPageInfo.OooO0o0(strOooO00o2);
                    webPageInfo.f32827OooOOOO = o0oO0O0o.f46999OooooOO;
                    int i = WebActivity.f25584OooOoO0;
                    WebActivity.OooO00o.OooO00o(fragmentActivity, webPageInfo);
                } else {
                    LinkedHashMap linkedHashMap = x6Var.f53388OooOo0;
                    if (linkedHashMap.containsKey(strOooO00o2)) {
                        GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = (GiftLayoutHideSelectViewManager) linkedHashMap.get(blindBoxUrl + strOooO0O1);
                        if (giftLayoutHideSelectViewManager != null) {
                            giftLayoutHideSelectViewManager.OooO0O0(blindBoxUrl, strOooO0O1);
                        }
                    } else {
                        FrameLayout frameLayout = x6Var.OooOOo().f58230OooOOOO;
                        Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.layoutHideSelectView");
                        GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager2 = new GiftLayoutHideSelectViewManager(x6Var, frameLayout);
                        linkedHashMap.put(strOooO00o2, giftLayoutHideSelectViewManager2);
                        giftLayoutHideSelectViewManager2.f28012OooO0o0 = new a9(x6Var);
                        giftLayoutHideSelectViewManager2.OooO0O0(blindBoxUrl, strOooO0O1);
                    }
                }
            } else {
                String strOooO00o3 = oOo0o00.OooO00o("");
                o000000O o000000o3 = o000000O.f46674OooO00o;
                Object value2 = o000000O.OooOOO0().getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(value2);
                String strOooO0O2 = oOo0o00.OooO0O0(strOooO00o3, "region", sb3.toString());
                long localGiftBlindId2 = giftBlindDetail.getLocalGiftBlindId();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(localGiftBlindId2);
                String strOooO0O3 = oOo0o00.OooO0O0(oOo0o00.OooO0O0(strOooO0O2, "giftid", sb4.toString()), "showArea", String.valueOf(giftPropTypeShow.getValue()));
                String strOooO00o4 = OooOOOO.OooO00o(blindBoxUrl, strOooO0O3);
                if (giftBlindDetail.isFullScreen()) {
                    WebPageInfo webPageInfo2 = new WebPageInfo(WebFrom.Unknow);
                    webPageInfo2.f32821OooO0oo = false;
                    webPageInfo2.OooO0o0(strOooO00o4);
                    webPageInfo2.f32827OooOOOO = o0oO0O0o.f46999OooooOO;
                    int i2 = WebActivity.f25584OooOoO0;
                    WebActivity.OooO00o.OooO00o(fragmentActivity, webPageInfo2);
                } else {
                    LinkedHashMap linkedHashMap2 = x6Var.f53390OooOo0O;
                    if (linkedHashMap2.containsKey(strOooO00o4)) {
                        GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = (GiftLayoutShowSelectViewManager) linkedHashMap2.get(strOooO00o4);
                        if (giftLayoutShowSelectViewManager != null) {
                            giftLayoutShowSelectViewManager.OooO00o(blindBoxUrl, strOooO0O3);
                        }
                    } else {
                        FrameLayout frameLayout2 = x6Var.OooOOo().f58233OooOOo0;
                        Intrinsics.checkNotNullExpressionValue(frameLayout2, "mBinding.layoutShowSelectView");
                        GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager2 = new GiftLayoutShowSelectViewManager(fragmentActivity, frameLayout2);
                        linkedHashMap2.put(strOooO00o4, giftLayoutShowSelectViewManager2);
                        giftLayoutShowSelectViewManager2.f28032OooO0o0 = new b9(x6Var);
                        giftLayoutShowSelectViewManager2.OooO00o(blindBoxUrl, strOooO0O3);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
