package p520o0o0O0oo;

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
import p553o0oOOoo.o0oO0O0o;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nGiftSendDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog$initData$1$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1595:1\n215#2,2:1596\n*S KotlinDebug\n*F\n+ 1 GiftSendDialog.kt\ncom/yalla/yalla/ui/dialog/giftDialog/GiftSendDialog$initData$1$1\n*L\n946#1:1596,2\n*E\n"})
public final class d7 extends Lambda implements Function1<List<GiftSendFragment>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53271OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(x6 x6Var) {
        super(1);
        this.f53271OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<GiftSendFragment> list) {
        List<GiftSendFragment> fragmentList = list;
        Intrinsics.checkNotNullParameter(fragmentList, "fragmentList");
        if (!fragmentList.isEmpty()) {
            x6 x6Var = this.f53271OooO0Oo;
            x6Var.OooOOo().f58242OooOoOO.setOffscreenPageLimit(fragmentList.size());
            c6 c6Var = x6Var.f53391OooOo0o;
            GiftSendFragment giftSendFragment = fragmentList.get(c6Var.f53258OooO0Oo);
            x6Var.f53380OooOOO = giftSendFragment;
            int i = c6Var.f53258OooO0Oo;
            Integer numValueOf = giftSendFragment != null ? Integer.valueOf(giftSendFragment.getPageTypeUser()) : null;
            GiftSendFragment giftSendFragment2 = x6Var.f53380OooOOO;
            Integer numValueOf2 = giftSendFragment2 != null ? Integer.valueOf(giftSendFragment2.getPageIndex()) : null;
            GiftPropModel giftPropModel = x6Var.f53384OooOOo;
            GiftSendFragment giftSendFragment3 = x6Var.f53380OooOOO;
            OooOOO0.OooO0O0("observeAllGiftList\nadapter.defaultCurrentPagerIndex = " + i + " \ncurrentFragment: getPageType= " + numValueOf + " , getPageIndex = " + numValueOf2 + " \ncurrentGift = " + giftPropModel + "\ncurrentData = " + (giftSendFragment3 != null ? giftSendFragment3.getCurrentData() : null));
            GiftSendFragment giftSendFragment4 = x6Var.f53380OooOOO;
            if (giftSendFragment4 != null) {
                GiftPropModel giftPropModel2 = x6Var.f53384OooOOo;
                giftSendFragment4.setGiftId(o0OoOo0.OooO0o0(0, giftPropModel2 != null ? Integer.valueOf(giftPropModel2.getGiftId()) : null));
            }
            Context context = x6Var.f10133OooO00o;
            Intrinsics.checkNotNullParameter(context, "context");
            o0oO0O0o.OooO00o oooO00o = new o0oO0O0o.OooO00o(context);
            oooO00o.f56019OooO0OO = 13.0f;
            oooO00o.f56020OooO0Oo = 13.0f;
            oooO00o.OooO0O0(CollectionsKt.toMutableList((Collection) c6Var.f53256OooO0O0));
            h9.OooO00o oooO00o2 = x6Var.f53376OooO0oo;
            oooO00o.f56022OooO0o0 = o0000.OooO00o(oooO00o2.f53298OooO0o0);
            oooO00o.f56024OooO0oo = o0000.OooO00o(oooO00o2.f53296OooO0Oo);
            oooO00o.f56036OooOo00 = o0000O0.OooO00o(10.0f);
            oooO00o.f56037OooOo0O = o0000O0.OooO00o(8.0f);
            oooO00o.f56035OooOo0 = o0000O0.OooO00o(8.0f);
            oooO00o.f56016OooO = 5.0f;
            oooO00o.f56025OooOO0 = o0000.OooO00o(oooO00o2.f53295OooO0OO);
            oooO00o.f56026OooOO0O = o0000O0.OooO00o(12.0f);
            oooO00o.f56027OooOO0o = o0000O0.OooO00o(2.0f);
            oooO00o.f56017OooO00o.setAdjustMode(false);
            ViewPager2 viewPager2 = x6Var.OooOOo().f58242OooOoOO;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "mBinding.viewPager");
            oooO00o.OooO0OO(viewPager2);
            c7 onClickTabListener = new c7(fragmentList);
            Intrinsics.checkNotNullParameter(onClickTabListener, "onClickTabListener");
            oooO00o.f56033OooOOo0 = onClickTabListener;
            YlTableLayout ylTableLayout = x6Var.OooOOo().f58236OooOo0;
            Intrinsics.checkNotNullExpressionValue(ylTableLayout, "mBinding.tabLayout");
            x6Var.f53393OooOoO0 = oooO00o.OooO00o(ylTableLayout);
            for (Map.Entry entry : c6Var.f53257OooO0OO.entrySet()) {
                o0oO0O0o o0oo0o0o2 = x6Var.f53393OooOoO0;
                if (o0oo0o0o2 != null) {
                    o0oo0o0o2.OooO0O0((String) entry.getKey(), ((Number) entry.getValue()).longValue() > 0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
