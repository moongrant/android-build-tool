package androidx.media3.ui;

import android.view.View;
import android.widget.LinearLayout;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.view.SetLuckyNumberLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.g5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f6564OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6565OooO0o0;

    public /* synthetic */ OooOO0O(Object obj, int i) {
        this.f6564OooO0Oo = i;
        this.f6565OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6564OooO0Oo;
        Object obj = this.f6565OooO0o0;
        switch (i) {
            case 0:
                PlayerControlView.OooO00o((PlayerControlView) obj);
                break;
            case 1:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) obj;
                int i2 = ExploreCountryRoomListActivity.f26525OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout linearLayout = this$0.OooOo().f58507OooO0OO.f57723OooO0OO;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
                o000OO00.OooO0O0(linearLayout);
                break;
            case 2:
                g5 this$1 = (g5) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
            default:
                SetLuckyNumberLayout this$2 = (SetLuckyNumberLayout) obj;
                int i3 = SetLuckyNumberLayout.f30669OooO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooO0OO(3);
                this$2.currRange = 3;
                Function1<? super Integer, Unit> function1 = this$2.rangeListener;
                if (function1 != null) {
                    function1.invoke(3);
                }
                break;
        }
    }
}
