package p563o0oOo00O;

import android.graphics.Typeface;
import android.widget.TextView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O implements CommonPagerTitleView.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f56250OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ CommonPagerTitleView f56251OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.OooO0OO f56252OooO0OO;

    public o000000O(o0O0O00 o0o0o00, CommonPagerTitleView commonPagerTitleView, o0O0O00.OooO0OO oooO0OO) {
        this.f56250OooO00o = o0o0o00;
        this.f56251OooO0O0 = commonPagerTitleView;
        this.f56252OooO0OO = oooO0OO;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO00o() {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0O0() {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0OO() {
        o0O0O00 o0o0o00 = this.f56250OooO00o;
        int i = o0o0o00.f56254OooO00o.f56272OooOOo;
        if (i != 0) {
            this.f56251OooO0O0.setBackgroundResource(i);
        }
        o0O0O00.OooO0OO oooO0OO = this.f56252OooO0OO;
        oooO0OO.f56279OooO0O0.setSelected(true);
        o0O0O00.OooO00o oooO00o = o0o0o00.f56254OooO00o;
        int i2 = oooO00o.f56262OooO0o0;
        TextView textView = oooO0OO.f56279OooO0O0;
        textView.setTextColor(i2);
        textView.setTextSize(1, oooO00o.f56259OooO0OO);
        if (!oooO00o.f56271OooOOOo) {
            textView.startAnimation(o0O0O00.OooO00o(o0o0o00, true));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Typeface typeface = oooO00o.f56263OooO0oO;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0Oo() {
        this.f56251OooO0O0.setBackgroundResource(0);
        o0O0O00.OooO0OO oooO0OO = this.f56252OooO0OO;
        oooO0OO.f56279OooO0O0.setSelected(false);
        o0O0O00 o0o0o00 = this.f56250OooO00o;
        int i = o0o0o00.f56254OooO00o.f56264OooO0oo;
        TextView textView = oooO0OO.f56279OooO0O0;
        textView.setTextColor(i);
        o0O0O00.OooO00o oooO00o = o0o0o00.f56254OooO00o;
        textView.setTextSize(1, oooO00o.f56260OooO0Oo);
        if (!oooO00o.f56271OooOOOo) {
            textView.startAnimation(o0O0O00.OooO00o(o0o0o00, false));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Typeface typeface = oooO00o.f56261OooO0o;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }
}
