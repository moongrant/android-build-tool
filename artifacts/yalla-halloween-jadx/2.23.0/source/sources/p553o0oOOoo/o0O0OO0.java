package p553o0oOOoo;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p120o00O0Ooo.o0OO00O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p631o0ooO0Oo.o0O0ooO;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0OO0 extends o0O0ooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0oO0O0o f56012OooO0O0;

    public o0O0OO0(o0oO0O0o o0oo0o0o2) {
        this.f56012OooO0O0 = o0oo0o0o2;
    }

    @Override // p631o0ooO0Oo.o0O0ooO
    public final int OooO00o() {
        o0oO0O0o o0oo0o0o2 = this.f56012OooO0O0;
        if (o0oo0o0o2.f56014OooO00o.f56018OooO0O0.size() > 0) {
            return o0oo0o0o2.f56014OooO00o.f56018OooO0O0.size();
        }
        return 0;
    }

    @Override // p631o0ooO0Oo.o0O0ooO
    @NotNull
    public final LinePagerIndicator OooO0O0(@Nullable Context context) {
        LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
        linePagerIndicator.setMode(2);
        o0oO0O0o o0oo0o0o2 = this.f56012OooO0O0;
        linePagerIndicator.setRoundRadius(o0oo0o0o2.f56014OooO00o.f56016OooO);
        o0oO0O0o.OooO00o oooO00o = o0oo0o0o2.f56014OooO00o;
        linePagerIndicator.setColors(Integer.valueOf(oooO00o.f56025OooOO0));
        linePagerIndicator.setLineWidth(oooO00o.f56026OooOO0O);
        linePagerIndicator.setLineHeight(oooO00o.f56027OooOO0o);
        return linePagerIndicator;
    }

    @Override // p631o0ooO0Oo.o0O0ooO
    @NotNull
    public final CommonPagerTitleView OooO0OO(final int i, @Nullable Context context) {
        CommonPagerTitleView commonPagerTitleView = new CommonPagerTitleView(context);
        commonPagerTitleView.setContentView(oO00OO0O.indicator_related_title);
        View viewFindViewById = commonPagerTitleView.findViewById(oO00O0oO.layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.layout)");
        View viewFindViewById2 = commonPagerTitleView.findViewById(oO00O0oO.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.title)");
        View viewFindViewById3 = commonPagerTitleView.findViewById(oO00O0oO.redPoint);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.redPoint)");
        final o0oO0O0o.OooO0OO oooO0OO = new o0oO0O0o.OooO0OO((ConstraintLayout) viewFindViewById, (TextView) viewFindViewById2, (TextView) viewFindViewById3);
        final o0oO0O0o o0oo0o0o2 = this.f56012OooO0O0;
        LinkedHashMap linkedHashMap = o0oo0o0o2.f56015OooO0O0;
        o0oO0O0o.OooO00o oooO00o = o0oo0o0o2.f56014OooO00o;
        linkedHashMap.put(oooO00o.f56018OooO0O0.get(i), oooO0OO.f56040OooO0OO);
        String str = oooO00o.f56018OooO0O0.get(i);
        TextView textView = oooO0OO.f56039OooO0O0;
        textView.setText(str);
        textView.setTextSize(1, oooO00o.f56020OooO0Oo);
        textView.setSingleLine();
        if (oooO00o.f56034OooOOoo > 0.0f) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = o0OO00O.OooO00o(oooO00o.f56034OooOOoo);
            textView.setLayoutParams(layoutParams2);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(oooO00o.f56037OooOo0O, oooO00o.f56036OooOo00, oooO00o.f56035OooOo0, 0);
        commonPagerTitleView.setOnPagerTitleChangeListener(new o0O0O0o0(o0oo0o0o2, commonPagerTitleView, oooO0OO));
        commonPagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: o0oOOoo.o0O0O0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0oO0O0o this$0 = o0oo0o0o2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0oO0O0o.OooO0OO this_apply = oooO0OO;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                o0O0OO0 this$1 = this;
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                if (!this$0.f56014OooO00o.f56031OooOOOo) {
                    this_apply.f56038OooO00o.setBackgroundResource(oOo00OO0.ripple_border);
                }
                o0oO0O0o.OooO00o oooO00o2 = this$0.f56014OooO00o;
                o0oO0O0o.OooO0O0 oooO0O0 = oooO00o2.f56033OooOOo0;
                int iOooO00o = i;
                if (oooO0O0 != null) {
                    Intrinsics.checkNotNull(oooO0O0, "null cannot be cast to non-null type com.yalla.yalla.ui.view.indicator.YlNavigatorImpl.OnClickTabListener");
                    oooO0O0.OooO00o(iOooO00o);
                }
                ViewPager viewPager = oooO00o2.f56029OooOOO0;
                if (viewPager != null) {
                    viewPager.OooOo(iOooO00o > oooO00o2.f56018OooO0O0.size() ? this$1.OooO00o() - 1 : iOooO00o, true);
                }
                ViewPager2 viewPager2 = oooO00o2.f56028OooOOO;
                if (viewPager2 != null) {
                    if (iOooO00o > oooO00o2.f56018OooO0O0.size()) {
                        iOooO00o = this$1.OooO00o() - 1;
                    }
                    viewPager2.setCurrentItem(iOooO00o, true);
                }
            }
        });
        return commonPagerTitleView;
    }

    @Override // p631o0ooO0Oo.o0O0ooO
    public final void OooO0Oo() {
        this.f56012OooO0O0.f56014OooO00o.getClass();
    }
}
