package p603o0oo00Oo;

import android.view.View;
import com.yalla.yalla.ui.view.ImageItemView;
import com.yalla.yalla.ui.view.ImageMoreView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p189o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00OO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f48134Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f48135OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f48136OoooO00;

    public /* synthetic */ o00O00OO(Object obj, Object obj2, int i) {
        this.f48134Oooo = i;
        this.f48136OoooO00 = obj;
        this.f48135OoooO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f48134Oooo) {
            case 0:
                ImageMoreView this$0 = (ImageMoreView) this.f48136OoooO00;
                ImageItemView it = (ImageItemView) this.f48135OoooO0;
                int i = ImageMoreView.f24846Ooooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "$it");
                Function2<? super ImageItemView, ? super Integer, Unit> function2 = this$0.com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String;
                if (function2 != null) {
                    function2.invoke(it, Integer.valueOf(it.getPosition()));
                }
                break;
            default:
                oO000 this$1 = (oO000) this.f48136OoooO00;
                OooO0o helper = (OooO0o) this.f48135OoooO0;
                int i2 = oO000.f48254OooO0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(helper, "$helper");
                this$1.f48259OooO0o0 = false;
                this$1.f48257OooO0OO.remove(Integer.valueOf(helper.getLayoutPosition()));
                Function1<? super Integer, Unit> function1 = this$1.f48256OooO0O0;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(helper.getLayoutPosition()));
                }
                this$1.notifyDataSetChanged();
                break;
        }
    }
}
