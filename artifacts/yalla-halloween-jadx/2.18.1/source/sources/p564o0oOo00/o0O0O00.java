package p564o0oOo00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.store.StoreActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 implements Observer<Long> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f45168OooO00o;

    public o0O0O00(StoreActivity storeActivity) {
        this.f45168OooO00o = storeActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        Long l2 = l;
        StoreActivity storeActivity = this.f45168OooO00o;
        if (storeActivity.f23244OooooOO == 0) {
            storeActivity.f23240OoooOoo.setText(p168o00Ooo0.o0O0O00.OooO0Oo(String.valueOf(l2)));
        }
    }
}
