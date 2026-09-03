package p511o0o0O;

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
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p590o0oOooo0.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51017OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(o00000OO o00000oo2) {
        super(1);
        this.f51017OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        GiftPropModel giftPropModel2;
        GiftBlindDetail giftBlindDetail;
        GiftPropModel giftPropModel3 = giftPropModel;
        o00000OO o00000oo2 = this.f51017OooO0Oo;
        if (!o00000oo2.OooOOo0().f44518OooOOoo.isShown() && Intrinsics.areEqual(giftPropModel3, o00000oo2.f50968OooOOo) && (giftPropModel2 = o00000oo2.f50968OooOOo) != null && (giftBlindDetail = giftPropModel2.getGiftBlindDetail()) != null) {
            String blindBoxUrl = giftBlindDetail.getBlindBoxUrl();
            boolean zIsNewType = giftBlindDetail.isNewType();
            FragmentActivity fragmentActivity = o00000oo2.f50959OooO0oO;
            GiftPropTypeShow giftPropTypeShow = o00000oo2.f50958OooO;
            if (zIsNewType) {
                String strOooO00o = c1.OooO00o("");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                Object value = o0O00oO0.OooOOO0().getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                String strOooO0O0 = c1.OooO0O0(strOooO00o, "region", sb.toString());
                long localGiftBlindId = giftBlindDetail.getLocalGiftBlindId();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(localGiftBlindId);
                String strOooO0O1 = c1.OooO0O0(c1.OooO0O0(c1.OooO0O0(strOooO0O0, "giftid", sb2.toString()), "showArea", String.valueOf(giftPropTypeShow.getValue())), "boxTab", String.valueOf(giftBlindDetail.getLevel()));
                String strOooO00o2 = OooOOOO.OooO00o(blindBoxUrl, strOooO0O1);
                if (giftBlindDetail.isFullScreen()) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
                    webPageInfo.f32285OooO0oo = false;
                    webPageInfo.OooO0o0(strOooO00o2);
                    webPageInfo.f32291OooOOOO = o0OOo000.f48190Oooooo;
                    int i = WebActivity.f25130OooOoO0;
                    WebActivity.OooO00o.OooO00o(fragmentActivity, webPageInfo);
                } else {
                    LinkedHashMap linkedHashMap = o00000oo2.f50972OooOo0;
                    if (linkedHashMap.containsKey(strOooO00o2)) {
                        GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = (GiftLayoutHideSelectViewManager) linkedHashMap.get(blindBoxUrl + strOooO0O1);
                        if (giftLayoutHideSelectViewManager != null) {
                            giftLayoutHideSelectViewManager.OooO0O0(blindBoxUrl, strOooO0O1);
                        }
                    } else {
                        FrameLayout layoutHideSelectView = o00000oo2.OooOOo0().f44514OooOOOO;
                        Intrinsics.checkNotNullExpressionValue(layoutHideSelectView, "layoutHideSelectView");
                        GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager2 = new GiftLayoutHideSelectViewManager(o00000oo2, layoutHideSelectView);
                        linkedHashMap.put(strOooO00o2, giftLayoutHideSelectViewManager2);
                        giftLayoutHideSelectViewManager2.f27541OooO0o0 = new oo0oOO0(o00000oo2);
                        giftLayoutHideSelectViewManager2.OooO0O0(blindBoxUrl, strOooO0O1);
                    }
                }
            } else {
                String strOooO00o3 = c1.OooO00o("");
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                Object value2 = o0O00oO0.OooOOO0().getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(value2);
                String strOooO0O2 = c1.OooO0O0(strOooO00o3, "region", sb3.toString());
                long localGiftBlindId2 = giftBlindDetail.getLocalGiftBlindId();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(localGiftBlindId2);
                String strOooO0O3 = c1.OooO0O0(c1.OooO0O0(strOooO0O2, "giftid", sb4.toString()), "showArea", String.valueOf(giftPropTypeShow.getValue()));
                String strOooO00o4 = OooOOOO.OooO00o(blindBoxUrl, strOooO0O3);
                if (giftBlindDetail.isFullScreen()) {
                    WebPageInfo webPageInfo2 = new WebPageInfo(WebFrom.Unknow);
                    webPageInfo2.f32285OooO0oo = false;
                    webPageInfo2.OooO0o0(strOooO00o4);
                    webPageInfo2.f32291OooOOOO = o0OOo000.f48190Oooooo;
                    int i2 = WebActivity.f25130OooOoO0;
                    WebActivity.OooO00o.OooO00o(fragmentActivity, webPageInfo2);
                } else {
                    LinkedHashMap linkedHashMap2 = o00000oo2.f50974OooOo0O;
                    if (linkedHashMap2.containsKey(strOooO00o4)) {
                        GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = (GiftLayoutShowSelectViewManager) linkedHashMap2.get(strOooO00o4);
                        if (giftLayoutShowSelectViewManager != null) {
                            giftLayoutShowSelectViewManager.OooO00o(blindBoxUrl, strOooO0O3);
                        }
                    } else {
                        FrameLayout layoutShowSelectView = o00000oo2.OooOOo0().f44517OooOOo0;
                        Intrinsics.checkNotNullExpressionValue(layoutShowSelectView, "layoutShowSelectView");
                        GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager2 = new GiftLayoutShowSelectViewManager(fragmentActivity, layoutShowSelectView);
                        linkedHashMap2.put(strOooO00o4, giftLayoutShowSelectViewManager2);
                        giftLayoutShowSelectViewManager2.f27560OooO0o0 = new o00O(o00000oo2);
                        giftLayoutShowSelectViewManager2.OooO00o(blindBoxUrl, strOooO0O3);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
