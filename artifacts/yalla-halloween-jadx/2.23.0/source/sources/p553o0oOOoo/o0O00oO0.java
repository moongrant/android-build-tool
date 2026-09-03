package p553o0oOOoo;

import android.graphics.Typeface;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00oO0 implements CommonPagerTitleView.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0oO0Ooo f56001OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ CommonPagerTitleView f56002OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o0oO0Ooo.OooO0O0 f56003OooO0OO;

    public o0O00oO0(o0oO0Ooo o0oo0ooo2, CommonPagerTitleView commonPagerTitleView, o0oO0Ooo.OooO0O0 oooO0O0) {
        this.f56001OooO00o = o0oo0ooo2;
        this.f56002OooO0O0 = commonPagerTitleView;
        this.f56003OooO0OO = oooO0O0;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO00o() {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0O0() {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0OO() {
        o0oO0Ooo o0oo0ooo2 = this.f56001OooO00o;
        o0oo0ooo2.f56041OooO00o.getClass();
        o0oO0Ooo.OooO0O0 oooO0O0 = this.f56003OooO0OO;
        oooO0O0.f56058OooO0O0.setSelected(true);
        o0oO0Ooo.OooO00o oooO00o = o0oo0ooo2.f56041OooO00o;
        int i = oooO00o.f56051OooO0o0;
        TextView textView = oooO0O0.f56058OooO0O0;
        textView.setTextColor(i);
        textView.setTextSize(1, oooO00o.f56048OooO0OO);
        if (!oooO00o.f56056OooOO0o) {
            textView.startAnimation(o0oO0Ooo.OooO00o(o0oo0ooo2, true));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Function2<? super Boolean, ? super o0oO0Ooo.OooO0O0, Unit> function2 = o0oo0ooo2.f56044OooO0Oo;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, oooO0O0);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0Oo() {
        this.f56002OooO0O0.setBackgroundResource(0);
        o0oO0Ooo.OooO0O0 oooO0O0 = this.f56003OooO0OO;
        oooO0O0.f56058OooO0O0.setSelected(false);
        o0oO0Ooo o0oo0ooo2 = this.f56001OooO00o;
        int i = o0oo0ooo2.f56041OooO00o.f56050OooO0o;
        TextView textView = oooO0O0.f56058OooO0O0;
        textView.setTextColor(i);
        o0oO0Ooo.OooO00o oooO00o = o0oo0ooo2.f56041OooO00o;
        textView.setTextSize(1, oooO00o.f56049OooO0Oo);
        if (!oooO00o.f56056OooOO0o) {
            textView.startAnimation(o0oO0Ooo.OooO00o(o0oo0ooo2, false));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Function2<? super Boolean, ? super o0oO0Ooo.OooO0O0, Unit> function2 = o0oo0ooo2.f56044OooO0Oo;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, oooO0O0);
        }
    }
}
