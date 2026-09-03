package p183o00o000O;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207o00o0oO.o00O0;
import p657o0ooo00o.oO0O000;
import p657o0ooo00o.oO0O000o;
import p657o0ooo00o.oOo000o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends oOo000o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f32969OooO0O0;

    public static final class OooO00o implements CommonPagerTitleView.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f32970OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ CommonPagerTitleView f32971OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ TextView f32972OooO0OO;

        public OooO00o(OooO0O0 oooO0O0, CommonPagerTitleView commonPagerTitleView, TextView textView) {
            this.f32970OooO00o = oooO0O0;
            this.f32971OooO0O0 = commonPagerTitleView;
            this.f32972OooO0OO = textView;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
        public final void OooO00o() {
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
        public final void OooO0O0() {
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
        public final void OooO0OO() {
            int i = this.f32970OooO00o.f32973OooO00o.f32993OooOOo0;
            if (i != 0) {
                this.f32971OooO0O0.setBackgroundResource(i);
            }
            this.f32972OooO0OO.setSelected(true);
            this.f32972OooO0OO.setTextColor(this.f32970OooO00o.f32973OooO00o.f32981OooO0o);
            this.f32972OooO0OO.setTextSize(1, this.f32970OooO00o.f32973OooO00o.f32980OooO0Oo);
            OooO0O0 oooO0O0 = this.f32970OooO00o;
            if (oooO0O0.f32973OooO00o.f32990OooOOOO) {
                return;
            }
            this.f32972OooO0OO.startAnimation(OooO0O0.OooO00o(oooO0O0, true));
            this.f32972OooO0OO.setTypeface(Typeface.DEFAULT_BOLD);
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
        public final void OooO0Oo() {
            this.f32971OooO0O0.setBackgroundResource(0);
            this.f32972OooO0OO.setSelected(false);
            this.f32972OooO0OO.setTextColor(this.f32970OooO00o.f32973OooO00o.f32983OooO0oO);
            this.f32972OooO0OO.setTextSize(1, this.f32970OooO00o.f32973OooO00o.f32982OooO0o0);
            OooO0O0 oooO0O0 = this.f32970OooO00o;
            if (oooO0O0.f32973OooO00o.f32990OooOOOO) {
                return;
            }
            this.f32972OooO0OO.startAnimation(OooO0O0.OooO00o(oooO0O0, false));
            this.f32972OooO0OO.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    public OooO(OooO0O0 oooO0O0) {
        this.f32969OooO0O0 = oooO0O0;
    }

    @Override // p657o0ooo00o.oOo000o0
    public final int OooO00o() {
        if (this.f32969OooO0O0.f32973OooO00o.f32979OooO0OO.size() > 0) {
            return this.f32969OooO0O0.f32973OooO00o.f32979OooO0OO.size();
        }
        return 0;
    }

    @Override // p657o0ooo00o.oOo000o0
    @NotNull
    public final oO0O000 OooO0O0(@Nullable Context context) {
        LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
        linePagerIndicator.setMode(2);
        linePagerIndicator.setRoundRadius(this.f32969OooO0O0.f32973OooO00o.f32984OooO0oo);
        linePagerIndicator.setColors(Integer.valueOf(this.f32969OooO0O0.f32973OooO00o.f32976OooO));
        linePagerIndicator.setLineWidth(this.f32969OooO0O0.f32973OooO00o.f32985OooOO0);
        linePagerIndicator.setLineHeight(this.f32969OooO0O0.f32973OooO00o.f32986OooOO0O);
        return linePagerIndicator;
    }

    @Override // p657o0ooo00o.oOo000o0
    @NotNull
    public final oO0O000o OooO0OO(@Nullable Context context, final int i) {
        CommonPagerTitleView commonPagerTitleView = new CommonPagerTitleView(context);
        commonPagerTitleView.setContentView(R.layout.indicator_related_title);
        View viewFindViewById = commonPagerTitleView.findViewById(R.id.cl_yl_tabLayout_indicator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "commonPagerTitleView.fin…l_yl_tabLayout_indicator)");
        final ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = commonPagerTitleView.findViewById(R.id.tv_related_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "commonPagerTitleView.fin…Id(R.id.tv_related_title)");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = commonPagerTitleView.findViewById(R.id.tv_red_point);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "commonPagerTitleView.fin…ewById(R.id.tv_red_point)");
        OooO0O0 oooO0O0 = this.f32969OooO0O0;
        oooO0O0.f32975OooO0OO.put(oooO0O0.f32973OooO00o.f32979OooO0OO.get(i), (TextView) viewFindViewById3);
        textView.setText(this.f32969OooO0O0.f32973OooO00o.f32979OooO0OO.get(i));
        textView.setTextSize(1, this.f32969OooO0O0.f32973OooO00o.f32982OooO0o0);
        textView.setSingleLine();
        if (this.f32969OooO0O0.f32973OooO00o.f32992OooOOo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = o00O0.OooO00o(this.f32969OooO0O0.f32973OooO00o.f32992OooOOo);
            textView.setLayoutParams(layoutParams2);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        OooO0O0.OooO00o oooO00o = this.f32969OooO0O0.f32973OooO00o;
        textView.setPadding(oooO00o.f32995OooOo0, oooO00o.f32994OooOOoo, oooO00o.f32996OooOo00, 0);
        commonPagerTitleView.setOnPagerTitleChangeListener(new OooO00o(this.f32969OooO0O0, commonPagerTitleView, textView));
        final OooO0O0 oooO0O1 = this.f32969OooO0O0;
        commonPagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: o00o000O.OooO0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OooO0O0 this$0 = oooO0O1;
                ConstraintLayout clYlTableLayout = constraintLayout;
                int iOooO00o = i;
                OooO this$1 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(clYlTableLayout, "$clYlTableLayout");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                if (!this$0.f32973OooO00o.f32990OooOOOO) {
                    clYlTableLayout.setBackgroundResource(R.drawable.ripple_border);
                }
                OooO0O0.InterfaceC0348OooO0O0 interfaceC0348OooO0O0 = this$0.f32973OooO00o.f32991OooOOOo;
                if (interfaceC0348OooO0O0 != null) {
                    Intrinsics.checkNotNull(interfaceC0348OooO0O0, "null cannot be cast to non-null type com.app.base.view.indicator.YlNavigatorImpl.OnClickTabListener");
                    boolean z = this$0.f32973OooO00o.f32990OooOOOO;
                    interfaceC0348OooO0O0.OooO00o(iOooO00o);
                }
                OooO0O0.OooO00o oooO00o2 = this$0.f32973OooO00o;
                ViewPager viewPager = oooO00o2.f32987OooOO0o;
                if (viewPager != null) {
                    viewPager.OooOoO(iOooO00o > oooO00o2.f32979OooO0OO.size() ? this$1.OooO00o() - 1 : iOooO00o, true);
                }
                OooO0O0.OooO00o oooO00o3 = this$0.f32973OooO00o;
                ViewPager2 viewPager2 = oooO00o3.f32989OooOOO0;
                if (viewPager2 != null) {
                    if (iOooO00o > oooO00o3.f32979OooO0OO.size()) {
                        iOooO00o = this$1.OooO00o() - 1;
                    }
                    viewPager2.setCurrentItem(iOooO00o, true);
                }
            }
        });
        return commonPagerTitleView;
    }

    @Override // p657o0ooo00o.oOo000o0
    public final void OooO0Oo() {
        Objects.requireNonNull(this.f32969OooO0O0.f32973OooO00o);
    }
}
