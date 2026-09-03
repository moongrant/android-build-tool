package p553o0oOOoo;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p631o0ooO0Oo.o0O0ooO;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0O0O extends o0O0ooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0oO0Ooo f56004OooO0O0;

    public o0O0O0O(o0oO0Ooo o0oo0ooo2) {
        this.f56004OooO0O0 = o0oo0ooo2;
    }

    @Override // p631o0ooO0Oo.o0O0ooO
    public final int OooO00o() {
        o0oO0Ooo o0oo0ooo2 = this.f56004OooO0O0;
        if (o0oo0ooo2.f56041OooO00o.f56047OooO0O0.size() > 0) {
            return o0oo0ooo2.f56041OooO00o.f56047OooO0O0.size();
        }
        return 0;
    }

    @Override // p631o0ooO0Oo.o0O0ooO
    @NotNull
    public final LinePagerIndicator OooO0O0(@Nullable Context context) {
        LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
        linePagerIndicator.setMode(2);
        o0oO0Ooo o0oo0ooo2 = this.f56004OooO0O0;
        o0oo0ooo2.f56041OooO00o.getClass();
        linePagerIndicator.setRoundRadius(0.0f);
        o0oO0Ooo.OooO00o oooO00o = o0oo0ooo2.f56041OooO00o;
        linePagerIndicator.setColors(Integer.valueOf(oooO00o.f56052OooO0oO));
        linePagerIndicator.setLineWidth(oooO00o.f56053OooO0oo);
        linePagerIndicator.setLineHeight(oooO00o.f56045OooO);
        return linePagerIndicator;
    }

    @Override // p631o0ooO0Oo.o0O0ooO
    @NotNull
    public final CommonPagerTitleView OooO0OO(final int i, @Nullable Context context) {
        CommonPagerTitleView commonPagerTitleView = new CommonPagerTitleView(context);
        commonPagerTitleView.setContentView(oO00OO0O.viewpager_title_yl_indicator);
        View viewFindViewById = commonPagerTitleView.findViewById(oO00O0oO.layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.layout)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = commonPagerTitleView.findViewById(oO00O0oO.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.title)");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = commonPagerTitleView.findViewById(oO00O0oO.point);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.point)");
        View viewFindViewById4 = commonPagerTitleView.findViewById(oO00O0oO.start);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.start)");
        View viewFindViewById5 = commonPagerTitleView.findViewById(oO00O0oO.end);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.end)");
        final o0oO0Ooo o0oo0ooo2 = this.f56004OooO0O0;
        int size = o0oo0ooo2.f56041OooO00o.f56047OooO0O0.size();
        o0oO0Ooo.OooO00o oooO00o = o0oo0ooo2.f56041OooO00o;
        final o0oO0Ooo.OooO0O0 oooO0O0 = new o0oO0Ooo.OooO0O0(constraintLayout, textView, (TextView) viewFindViewById3, viewFindViewById4, viewFindViewById5, size, i, oooO00o.f56047OooO0O0.get(i));
        o0oo0ooo2.f56042OooO0O0.put(oooO00o.f56047OooO0O0.get(i), oooO0O0.f56059OooO0OO);
        oooO0O0.f56058OooO0O0.setText(oooO00o.f56047OooO0O0.get(i));
        commonPagerTitleView.setOnPagerTitleChangeListener(new o0O00oO0(o0oo0ooo2, commonPagerTitleView, oooO0O0));
        commonPagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: o0oOOoo.o0O00o00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0oO0Ooo this$0 = o0oo0ooo2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0oO0Ooo.OooO0O0 this_apply = oooO0O0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                o0O0O0O this$1 = this;
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                if (!this$0.f56041OooO00o.f56056OooOO0o) {
                    this_apply.f56057OooO00o.setBackgroundResource(oOo00OO0.ripple_border);
                }
                o0oO0Ooo.OooO00o oooO00o2 = this$0.f56041OooO00o;
                oooO00o2.getClass();
                ViewPager viewPager = oooO00o2.f56054OooOO0;
                if (viewPager != null) {
                    int size2 = oooO00o2.f56047OooO0O0.size();
                    int iOooO00o = i;
                    if (iOooO00o > size2) {
                        iOooO00o = this$1.OooO00o() - 1;
                    }
                    viewPager.OooOo(iOooO00o, true);
                }
            }
        });
        return commonPagerTitleView;
    }

    @Override // p631o0ooO0Oo.o0O0ooO
    public final void OooO0Oo() {
        this.f56004OooO0O0.f56041OooO00o.getClass();
    }
}
