package p511o0o0O;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.fragment.GiftSendFragment;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p563o0oOo00O.o0O0O00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nGiftSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog$initData$1$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1595:1\n215#2,2:1596\n*S KotlinDebug\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog$initData$1$1\n*L\n946#1:1596,2\n*E\n"})
public final class o0000O0O extends Lambda implements Function1<List<GiftSendFragment>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51002OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(o00000OO o00000oo2) {
        super(1);
        this.f51002OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<GiftSendFragment> list) {
        List<GiftSendFragment> fragmentList = list;
        Intrinsics.checkNotNullParameter(fragmentList, "fragmentList");
        if (!fragmentList.isEmpty()) {
            o00000OO o00000oo2 = this.f51002OooO0Oo;
            o00000oo2.OooOOo0().f44526OooOoOO.setOffscreenPageLimit(fragmentList.size());
            OooOo oooOo = o00000oo2.f50975OooOo0o;
            GiftSendFragment giftSendFragment = fragmentList.get(oooOo.f50931OooO0Oo);
            o00000oo2.f50964OooOOO = giftSendFragment;
            int i = oooOo.f50931OooO0Oo;
            Integer numValueOf = giftSendFragment != null ? Integer.valueOf(giftSendFragment.getPageTypeUser()) : null;
            GiftSendFragment giftSendFragment2 = o00000oo2.f50964OooOOO;
            Integer numValueOf2 = giftSendFragment2 != null ? Integer.valueOf(giftSendFragment2.getPageIndex()) : null;
            GiftPropModel giftPropModel = o00000oo2.f50968OooOOo;
            GiftSendFragment giftSendFragment3 = o00000oo2.f50964OooOOO;
            o0000O00.OooO0O0("observeAllGiftList\nadapter.defaultCurrentPagerIndex = " + i + " \ncurrentFragment: getPageType= " + numValueOf + " , getPageIndex = " + numValueOf2 + " \ncurrentGift = " + giftPropModel + "\ncurrentData = " + (giftSendFragment3 != null ? giftSendFragment3.getCurrentData() : null));
            GiftSendFragment giftSendFragment4 = o00000oo2.f50964OooOOO;
            if (giftSendFragment4 != null) {
                GiftPropModel giftPropModel2 = o00000oo2.f50968OooOOo;
                giftSendFragment4.setGiftId(o0OoOo0.OooO0o0(0, giftPropModel2 != null ? Integer.valueOf(giftPropModel2.getGiftId()) : null));
            }
            Context context = o00000oo2.f38487OooO00o;
            Intrinsics.checkNotNullParameter(context, "context");
            o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(context);
            oooO00o.f56259OooO0OO = 13.0f;
            oooO00o.f56260OooO0Oo = 13.0f;
            oooO00o.OooO0O0(CollectionsKt.toMutableList((Collection) oooOo.f50929OooO0O0));
            o00OO.OooO00o oooO00o2 = o00000oo2.f50960OooO0oo;
            oooO00o.f56262OooO0o0 = o0000.OooO00o(oooO00o2.f51047OooO0o0);
            oooO00o.f56264OooO0oo = o0000.OooO00o(oooO00o2.f51045OooO0Oo);
            oooO00o.f56276OooOo00 = o0000O0.OooO00o(10.0f);
            oooO00o.f56277OooOo0O = o0000O0.OooO00o(8.0f);
            oooO00o.f56275OooOo0 = o0000O0.OooO00o(8.0f);
            oooO00o.f56256OooO = 5.0f;
            oooO00o.f56265OooOO0 = o0000.OooO00o(oooO00o2.f51044OooO0OO);
            oooO00o.f56266OooOO0O = o0000O0.OooO00o(12.0f);
            oooO00o.f56267OooOO0o = o0000O0.OooO00o(2.0f);
            oooO00o.f56257OooO00o.setAdjustMode(false);
            ViewPager2 viewPager = o00000oo2.OooOOo0().f44526OooOoOO;
            Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
            oooO00o.OooO0OO(viewPager);
            o0000O0 onClickTabListener = new o0000O0(fragmentList);
            Intrinsics.checkNotNullParameter(onClickTabListener, "onClickTabListener");
            oooO00o.f56273OooOOo0 = onClickTabListener;
            YlTableLayout tabLayout = o00000oo2.OooOOo0().f44520OooOo0;
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
            o00000oo2.f50977OooOoO0 = oooO00o.OooO00o(tabLayout);
            for (Map.Entry entry : oooOo.f50930OooO0OO.entrySet()) {
                o0O0O00 o0o0o00 = o00000oo2.f50977OooOoO0;
                if (o0o0o00 != null) {
                    o0o0o00.OooO0O0((String) entry.getKey(), ((Number) entry.getValue()).longValue() > 0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
