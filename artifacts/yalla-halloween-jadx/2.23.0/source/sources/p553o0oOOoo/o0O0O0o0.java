package p553o0oOOoo;

import android.graphics.Typeface;
import android.widget.TextView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0O0o0 implements CommonPagerTitleView.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0oO0O0o f56009OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ CommonPagerTitleView f56010OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o0oO0O0o.OooO0OO f56011OooO0OO;

    public o0O0O0o0(o0oO0O0o o0oo0o0o2, CommonPagerTitleView commonPagerTitleView, o0oO0O0o.OooO0OO oooO0OO) {
        this.f56009OooO00o = o0oo0o0o2;
        this.f56010OooO0O0 = commonPagerTitleView;
        this.f56011OooO0OO = oooO0OO;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO00o() {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0O0() {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0OO() {
        o0oO0O0o o0oo0o0o2 = this.f56009OooO00o;
        int i = o0oo0o0o2.f56014OooO00o.f56032OooOOo;
        if (i != 0) {
            this.f56010OooO0O0.setBackgroundResource(i);
        }
        o0oO0O0o.OooO0OO oooO0OO = this.f56011OooO0OO;
        oooO0OO.f56039OooO0O0.setSelected(true);
        o0oO0O0o.OooO00o oooO00o = o0oo0o0o2.f56014OooO00o;
        int i2 = oooO00o.f56022OooO0o0;
        TextView textView = oooO0OO.f56039OooO0O0;
        textView.setTextColor(i2);
        textView.setTextSize(1, oooO00o.f56019OooO0OO);
        if (!oooO00o.f56031OooOOOo) {
            textView.startAnimation(o0oO0O0o.OooO00o(o0oo0o0o2, true));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Typeface typeface = oooO00o.f56023OooO0oO;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0Oo() {
        this.f56010OooO0O0.setBackgroundResource(0);
        o0oO0O0o.OooO0OO oooO0OO = this.f56011OooO0OO;
        oooO0OO.f56039OooO0O0.setSelected(false);
        o0oO0O0o o0oo0o0o2 = this.f56009OooO00o;
        int i = o0oo0o0o2.f56014OooO00o.f56024OooO0oo;
        TextView textView = oooO0OO.f56039OooO0O0;
        textView.setTextColor(i);
        o0oO0O0o.OooO00o oooO00o = o0oo0o0o2.f56014OooO00o;
        textView.setTextSize(1, oooO00o.f56020OooO0Oo);
        if (!oooO00o.f56031OooOOOo) {
            textView.startAnimation(o0oO0O0o.OooO00o(o0oo0o0o2, false));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Typeface typeface = oooO00o.f56021OooO0o;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }
}
