package p505o0o00oOO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0ooO implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f50382OooO0Oo;

    public oo0ooO(StoreActivity storeActivity) {
        this.f50382OooO0Oo = storeActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        Long l2 = l;
        StoreActivity storeActivity = this.f50382OooO0Oo;
        if (storeActivity.f26564OooOo0o == 0) {
            storeActivity.f26559OooOOoo.setText(o0O0O0Oo.OooO0Oo(String.valueOf(l2)));
        }
    }
}
