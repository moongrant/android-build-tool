package p358o0OOOooO;

import android.content.Context;
import android.view.View;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f43771OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f43772OooO0o0;

    public /* synthetic */ o00000O0(Object obj, int i) {
        this.f43771OooO0Oo = i;
        this.f43772OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f43771OooO0Oo;
        Object obj = this.f43772OooO0o0;
        switch (i) {
            case 0:
                o00000OO this$0 = (o00000OO) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o000Oo0 o000oo1 = (o000Oo0) this$0.f43778OooO0o0.getValue();
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "it.context");
                o000oo1.getClass();
                if (!o000Oo0.OooO00o(context, this$0.f43774OooO0O0, this$0.f43773OooO00o).booleanValue()) {
                    this$0.f43775OooO0OO.openCamera();
                    break;
                }
                break;
            default:
                MainSearchRoomFragment this$1 = (MainSearchRoomFragment) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.getVm().clearSearchHistory();
                break;
        }
    }
}
