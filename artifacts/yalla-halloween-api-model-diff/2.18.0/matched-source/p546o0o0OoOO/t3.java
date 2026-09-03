package p546o0o0OoOO;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.view.RoomMemberConveneSelectItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0O.oOO00O;
import p581o0oOoOOo.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t3 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f44327Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f44328OoooO00;

    public /* synthetic */ t3(Object obj, int i) {
        this.f44327Oooo = i;
        this.f44328OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44327Oooo) {
            case 0:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) this.f44328OoooO00;
                ExploreCountryRoomListActivity.OooO00o oooO00o = ExploreCountryRoomListActivity.f22816o00O0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout linearLayout = this$0.OooOoo().f49290OooO0OO.f50632OooO0OO;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
                oOO00O.OooO00o(linearLayout);
                break;
            case 1:
                oOo0oooO this$1 = (oOo0oooO) this.f44328OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
            default:
                Function0 function0 = (Function0) this.f44328OoooO00;
                int i = RoomMemberConveneSelectItemView.f25136OoooO0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
