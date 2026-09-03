package p544o0o0OoOO;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import com.yalla.yalla.ui.view.RoomMemberConveneSelectItemView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.oOO00O;
import p579o0oOoOOo.oO0O0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u3 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f44318Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f44319Oooo0oO;

    public /* synthetic */ u3(Object obj, int i) {
        this.f44318Oooo0o = i;
        this.f44319Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44318Oooo0o) {
            case 0:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) this.f44319Oooo0oO;
                ExploreCountryRoomListActivity.OooO00o oooO00o = ExploreCountryRoomListActivity.f22797Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout linearLayout = this$0.OooOoo().f49353OooO0OO.f50695OooO0OO;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llCountries.llCountryRoot");
                oOO00O.OooO00o(linearLayout);
                break;
            case 1:
                oO0O0Oo0 this$1 = (oO0O0Oo0) this.f44319Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
            default:
                Function0 function0 = (Function0) this.f44319Oooo0oO;
                int i = RoomMemberConveneSelectItemView.f25117Oooo0oo;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
