package p447o0OoOoO0;

import android.app.Activity;
import androidx.lifecycle.Observer;
import com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonSecondChooseScreen;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O00o0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47310OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47311OooO0o0;

    public /* synthetic */ o00O00o0(Object obj, int i) {
        this.f47310OooO0Oo = i;
        this.f47311OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f47310OooO0Oo;
        Object obj2 = this.f47311OooO0o0;
        switch (i) {
            case 0:
                DeleteAccountReasonSecondChooseScreen.MainContent$lambda$2((Activity) obj2, obj);
                break;
            default:
                MainRoomMineJoinedFragment.onLazyInit$lambda$0((MainRoomMineJoinedFragment) obj2, obj);
                break;
        }
    }
}
