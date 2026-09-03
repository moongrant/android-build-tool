package p563o0oOo00O;

import android.graphics.Typeface;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O implements CommonPagerTitleView.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f56281OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ CommonPagerTitleView f56282OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o.OooO0O0 f56283OooO0OO;

    public o0OO00O(o0OOO0o o0ooo0o2, CommonPagerTitleView commonPagerTitleView, o0OOO0o.OooO0O0 oooO0O0) {
        this.f56281OooO00o = o0ooo0o2;
        this.f56282OooO0O0 = commonPagerTitleView;
        this.f56283OooO0OO = oooO0O0;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO00o() {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0O0() {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0OO() {
        o0OOO0o o0ooo0o2 = this.f56281OooO00o;
        o0ooo0o2.f56284OooO00o.getClass();
        o0OOO0o.OooO0O0 oooO0O0 = this.f56283OooO0OO;
        oooO0O0.f56301OooO0O0.setSelected(true);
        o0OOO0o.OooO00o oooO00o = o0ooo0o2.f56284OooO00o;
        int i = oooO00o.f56294OooO0o0;
        TextView textView = oooO0O0.f56301OooO0O0;
        textView.setTextColor(i);
        textView.setTextSize(1, oooO00o.f56291OooO0OO);
        if (!oooO00o.f56299OooOO0o) {
            textView.startAnimation(o0OOO0o.OooO00o(o0ooo0o2, true));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Function2<? super Boolean, ? super o0OOO0o.OooO0O0, Unit> function2 = o0ooo0o2.f56287OooO0Oo;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, oooO0O0);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.CommonPagerTitleView.OooO0O0
    public final void OooO0Oo() {
        this.f56282OooO0O0.setBackgroundResource(0);
        o0OOO0o.OooO0O0 oooO0O0 = this.f56283OooO0OO;
        oooO0O0.f56301OooO0O0.setSelected(false);
        o0OOO0o o0ooo0o2 = this.f56281OooO00o;
        int i = o0ooo0o2.f56284OooO00o.f56293OooO0o;
        TextView textView = oooO0O0.f56301OooO0O0;
        textView.setTextColor(i);
        o0OOO0o.OooO00o oooO00o = o0ooo0o2.f56284OooO00o;
        textView.setTextSize(1, oooO00o.f56292OooO0Oo);
        if (!oooO00o.f56299OooOO0o) {
            textView.startAnimation(o0OOO0o.OooO00o(o0ooo0o2, false));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Function2<? super Boolean, ? super o0OOO0o.OooO0O0, Unit> function2 = o0ooo0o2.f56287OooO0Oo;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, oooO0O0);
        }
    }
}
