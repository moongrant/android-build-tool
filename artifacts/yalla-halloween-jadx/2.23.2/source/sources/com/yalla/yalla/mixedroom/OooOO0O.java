package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOO0O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23023OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f23024OooO0o0;

    public /* synthetic */ OooOO0O(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f23023OooO0Oo = i;
        this.f23024OooO0o0 = baseFragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23023OooO0Oo;
        BaseFragmentActivity baseFragmentActivity = this.f23024OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) baseFragmentActivity;
                int i2 = MixedRoomActivity.f22956OoooO0O;
                MixedRoomActivity.OooO0O0 oooO0O0 = mixedRoomActivity.f22957OooOOo;
                if (oooO0O0 != null) {
                    mixedRoomActivity.unbindService(oooO0O0);
                    mixedRoomActivity.f22957OooOOo = null;
                }
                break;
            case 1:
                PhoneBindActivity this$0 = (PhoneBindActivity) baseFragmentActivity;
                int i3 = PhoneBindActivity.f24787OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                TopicSearchActivity this$1 = (TopicSearchActivity) baseFragmentActivity;
                Response response = (Response) obj;
                int i4 = TopicSearchActivity.f25947OooOoo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f25953OooOo0o) {
                    if (response.getIsSuccess()) {
                        this$1.OooOoO().OooOoO0((List) response.getData());
                        if (this$1.OooOoo0().f44601OooO00o.getParent() == null) {
                            this$1.OooOoO().OooOo(this$1.OooOoo0().f44601OooO00o);
                        }
                    }
                    this$1.OooOoO().Oooo0O0(response.getIsSuccess());
                    break;
                }
                break;
        }
    }
}
