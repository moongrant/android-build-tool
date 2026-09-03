package p499o0o00o0O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f49417OooO0Oo;

    public oo00o(StoreActivity storeActivity) {
        this.f49417OooO0Oo = storeActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        Long l2 = l;
        StoreActivity storeActivity = this.f49417OooO0Oo;
        if (storeActivity.f27029OooOo0o == 0) {
            storeActivity.f27024OooOOoo.setText(OooOOOO.OooO0Oo(String.valueOf(l2)));
        }
    }
}
