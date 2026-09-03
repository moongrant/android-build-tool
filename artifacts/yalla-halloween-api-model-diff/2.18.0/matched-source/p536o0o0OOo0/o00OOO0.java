package p536o0o0OOo0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43545Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f43546OoooO00;

    public /* synthetic */ o00OOO0(Object obj, int i) {
        this.f43545Oooo = i;
        this.f43546OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43545Oooo) {
            case 0:
                DeleteAccountCheckActivity this$0 = (DeleteAccountCheckActivity) this.f43546OoooO00;
                DeleteAccountCheckActivity.OooO00o oooO00o = DeleteAccountCheckActivity.f21753Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = this$0.OooOoo().f49653OooOO0;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSelectYallaChat");
                this$0.OooOooO(imageView);
                break;
            case 1:
                ExploreTagRoomListActivity this$1 = (ExploreTagRoomListActivity) this.f43546OoooO00;
                ExploreTagRoomListActivity.OooO00o oooO00o2 = ExploreTagRoomListActivity.f22837o00O0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                LinearLayout linearLayout = this$1.OooOoo().f49380OooO0OO.f50738OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llTags.llTagRoot");
                o00O0O.OooO00o(linearLayout);
                break;
            default:
                TreasureBoxDialog this$2 = (TreasureBoxDialog) this.f43546OoooO00;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOO0O(0);
                this$2.f23805OoooOo0.f50137OooOOO0.setCurrentItem(0, true);
                break;
        }
    }
}
