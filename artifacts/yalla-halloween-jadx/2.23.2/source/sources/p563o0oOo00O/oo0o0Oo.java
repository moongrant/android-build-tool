package p563o0oOo00O;

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
import p562o0oOo000.o0OO00O;
import p636o0ooO0oO.o0O00OOO;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends o0O00OOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f56312OooO0O0;

    public oo0o0Oo(o0OOO0o o0ooo0o2) {
        this.f56312OooO0O0 = o0ooo0o2;
    }

    @Override // p636o0ooO0oO.o0O00OOO
    public final int OooO00o() {
        o0OOO0o o0ooo0o2 = this.f56312OooO0O0;
        if (o0ooo0o2.f56284OooO00o.f56290OooO0O0.size() > 0) {
            return o0ooo0o2.f56284OooO00o.f56290OooO0O0.size();
        }
        return 0;
    }

    @Override // p636o0ooO0oO.o0O00OOO
    @NotNull
    public final LinePagerIndicator OooO0O0(@Nullable Context context) {
        LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
        linePagerIndicator.setMode(2);
        o0OOO0o o0ooo0o2 = this.f56312OooO0O0;
        o0ooo0o2.f56284OooO00o.getClass();
        linePagerIndicator.setRoundRadius(0.0f);
        o0OOO0o.OooO00o oooO00o = o0ooo0o2.f56284OooO00o;
        linePagerIndicator.setColors(Integer.valueOf(oooO00o.f56295OooO0oO));
        linePagerIndicator.setLineWidth(oooO00o.f56296OooO0oo);
        linePagerIndicator.setLineHeight(oooO00o.f56288OooO);
        return linePagerIndicator;
    }

    @Override // p636o0ooO0oO.o0O00OOO
    @NotNull
    public final CommonPagerTitleView OooO0OO(final int i, @Nullable Context context) {
        CommonPagerTitleView commonPagerTitleView = new CommonPagerTitleView(context);
        commonPagerTitleView.setContentView(p562o0oOo000.oo0o0Oo.viewpager_title_yl_indicator);
        View viewFindViewById = commonPagerTitleView.findViewById(o0OO00O.layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = commonPagerTitleView.findViewById(o0OO00O.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = commonPagerTitleView.findViewById(o0OO00O.point);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = commonPagerTitleView.findViewById(o0OO00O.start);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = commonPagerTitleView.findViewById(o0OO00O.end);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        final o0OOO0o o0ooo0o2 = this.f56312OooO0O0;
        int size = o0ooo0o2.f56284OooO00o.f56290OooO0O0.size();
        o0OOO0o.OooO00o oooO00o = o0ooo0o2.f56284OooO00o;
        final o0OOO0o.OooO0O0 oooO0O0 = new o0OOO0o.OooO0O0(constraintLayout, textView, (TextView) viewFindViewById3, viewFindViewById4, viewFindViewById5, size, i, oooO00o.f56290OooO0O0.get(i));
        o0ooo0o2.f56285OooO0O0.put(oooO00o.f56290OooO0O0.get(i), oooO0O0.f56302OooO0OO);
        oooO0O0.f56301OooO0O0.setText(oooO00o.f56290OooO0O0.get(i));
        commonPagerTitleView.setOnPagerTitleChangeListener(new o0OO00O(o0ooo0o2, commonPagerTitleView, oooO0O0));
        commonPagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: o0oOo00O.o0Oo0oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0OOO0o this$0 = o0ooo0o2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OOO0o.OooO0O0 this_apply = oooO0O0;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                oo0o0Oo this$1 = this;
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                if (!this$0.f56284OooO00o.f56299OooOO0o) {
                    this_apply.f56300OooO00o.setBackgroundResource(p562o0oOo000.o0Oo0oo.ripple_border);
                }
                o0OOO0o.OooO00o oooO00o2 = this$0.f56284OooO00o;
                oooO00o2.getClass();
                ViewPager viewPager = oooO00o2.f56297OooOO0;
                if (viewPager != null) {
                    int size2 = oooO00o2.f56290OooO0O0.size();
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

    @Override // p636o0ooO0oO.o0O00OOO
    public final void OooO0Oo() {
        this.f56312OooO0O0.f56284OooO00o.getClass();
    }
}
