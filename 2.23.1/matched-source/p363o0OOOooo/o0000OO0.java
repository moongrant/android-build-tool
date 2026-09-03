package p363o0OOOooo;

import android.content.Context;
import android.view.View;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p675oO0Oo.oOO0Oo00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000OO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f42961OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f42962OooO0o0;

    public /* synthetic */ o0000OO0(Object obj, int i) {
        this.f42961OooO0Oo = i;
        this.f42962OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i = this.f42961OooO0Oo;
        Object obj = this.f42962OooO0o0;
        switch (i) {
            case 0:
                o000O000 this$0 = (o000O000) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00O0000 o00o0001 = (o00O0000) this$0.f42974OooO0o0.getValue();
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                o00o0001.getClass();
                if (!o00O0000.OooO00o(context, this$0.f42970OooO0O0, this$0.f42969OooO00o).booleanValue()) {
                    this$0.f42971OooO0OO.openCamera();
                    break;
                }
                break;
            default:
                oOO0Oo00 ooo0oo00 = (oOO0Oo00) obj;
                Iterator it = ooo0oo00.f59793OooOooO.f13200OooOOoo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                    } else if (!((RoomUserInfoModel) it.next()).isSelectedForSendHats().getValue().booleanValue()) {
                        z = true;
                    }
                }
                Iterator it2 = ooo0oo00.f59793OooOooO.f13200OooOOoo.iterator();
                while (it2.hasNext()) {
                    ((RoomUserInfoModel) it2.next()).isSelectedForSendHats().setValue(Boolean.valueOf(z));
                }
                ooo0oo00.f59793OooOooO.notifyDataSetChanged();
                ooo0oo00.OooO0Oo();
                ooo0oo00.OooO0OO();
                break;
        }
    }
}
