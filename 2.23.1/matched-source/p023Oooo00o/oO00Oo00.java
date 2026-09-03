package p023Oooo00o;

import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.view.MarqueeRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO00Oo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f959OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f960OooO0o0;

    public /* synthetic */ oO00Oo00(Object obj, int i) {
        this.f959OooO0Oo = i;
        this.f960OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f959OooO0Oo;
        Object obj = this.f960OooO0o0;
        switch (i) {
            case 0:
                oO00000o.OooO00o(((oO00o000.OooO00o) obj).f968OooO0O0);
                break;
            default:
                BadgeActivity this$0 = (BadgeActivity) obj;
                int i2 = BadgeActivity.f26605OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MarqueeRecyclerView rvBanner = this$0.OooOoO0().f44131OooO0O0.f45404OooO0o0;
                Intrinsics.checkNotNullExpressionValue(rvBanner, "rvBanner");
                o000O.OooOO0O(rvBanner, this$0.OooOoO0().f44131OooO0O0.f45404OooO0o0.getMeasuredWidth() - 1);
                break;
        }
    }
}
