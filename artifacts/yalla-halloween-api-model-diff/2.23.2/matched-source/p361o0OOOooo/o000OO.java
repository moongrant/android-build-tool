package p361o0OOOooo;

import android.content.Context;
import android.view.View;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p650o0ooo.oO00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f42984OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f42985OooO0o0;

    public /* synthetic */ o000OO(Object obj, int i) {
        this.f42984OooO0Oo = i;
        this.f42985OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i = this.f42984OooO0Oo;
        Object obj = this.f42985OooO0o0;
        switch (i) {
            case 0:
                o0000OO0 this$0 = (o0000OO0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o000OOo0 o000ooo1 = (o000OOo0) this$0.f42968OooO0o0.getValue();
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                o000ooo1.getClass();
                if (!o000OOo0.OooO00o(context, this$0.f42964OooO0O0, this$0.f42963OooO00o).booleanValue()) {
                    this$0.f42965OooO0OO.openCamera();
                    break;
                }
                break;
            default:
                oO00Oo0 oo00oo0 = (oO00Oo0) obj;
                Iterator it = oo00oo0.f58825OooOooO.f13189OooOOoo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                    } else if (!((RoomUserInfoModel) it.next()).isSelectedForSendHats().getValue().booleanValue()) {
                        z = true;
                    }
                }
                Iterator it2 = oo00oo0.f58825OooOooO.f13189OooOOoo.iterator();
                while (it2.hasNext()) {
                    ((RoomUserInfoModel) it2.next()).isSelectedForSendHats().setValue(Boolean.valueOf(z));
                }
                oo00oo0.f58825OooOooO.notifyDataSetChanged();
                oo00oo0.OooO0Oo();
                oo00oo0.OooO0OO();
                break;
        }
    }
}
