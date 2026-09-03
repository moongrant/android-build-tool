package p536o0o0OOo0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import kotlin.jvm.internal.Intrinsics;
import p581o0oOoOOo.l1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OOO00 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43547Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f43548OoooO00;

    public /* synthetic */ o00OOO00(Object obj, int i) {
        this.f43547Oooo = i;
        this.f43548OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43547Oooo) {
            case 0:
                DeleteAccountCheckActivity this$0 = (DeleteAccountCheckActivity) this.f43548OoooO00;
                DeleteAccountCheckActivity.OooO00o oooO00o = DeleteAccountCheckActivity.f21753Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = this$0.OooOoo().f49649OooO0o;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSelectFacebook");
                this$0.OooOooO(imageView);
                break;
            case 1:
                ExploreTagRoomListActivity this$1 = (ExploreTagRoomListActivity) this.f43548OoooO00;
                ExploreTagRoomListActivity.OooO00o oooO00o2 = ExploreTagRoomListActivity.f22837o00O0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                LinearLayout linearLayout = this$1.OooOoo().f49380OooO0OO.f50738OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llTags.llTagRoot");
                o00O0O.OooO00o(linearLayout);
                break;
            default:
                TreasureBoxDialog this$2 = (TreasureBoxDialog) this.f43548OoooO00;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                new l1(this$2.f23803OoooOOO).OooOO0();
                break;
        }
    }
}
