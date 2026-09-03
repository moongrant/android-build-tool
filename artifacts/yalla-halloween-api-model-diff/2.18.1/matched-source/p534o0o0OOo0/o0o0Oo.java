package p534o0o0OOo0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0o0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f43594Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f43595Oooo0oO;

    public /* synthetic */ o0o0Oo(Object obj, int i) {
        this.f43594Oooo0o = i;
        this.f43595Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43594Oooo0o) {
            case 0:
                DeleteAccountCheckActivity this$0 = (DeleteAccountCheckActivity) this.f43595Oooo0oO;
                DeleteAccountCheckActivity.OooO00o oooO00o = DeleteAccountCheckActivity.f21734Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = this$0.OooOoo().f49716OooOO0;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSelectYallaChat");
                this$0.OooOooO(imageView);
                break;
            case 1:
                ExploreTagRoomListActivity this$1 = (ExploreTagRoomListActivity) this.f43595Oooo0oO;
                ExploreTagRoomListActivity.OooO00o oooO00o2 = ExploreTagRoomListActivity.f22818Ooooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                LinearLayout linearLayout = this$1.OooOoo().f49443OooO0OO.f50801OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llTags.llTagRoot");
                o00O0O.OooO00o(linearLayout);
                break;
            default:
                TreasureBoxDialog this$2 = (TreasureBoxDialog) this.f43595Oooo0oO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOO0O(0);
                this$2.f23787o000oOoO.f50200OooOOO0.setCurrentItem(0, true);
                break;
        }
    }
}
