package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p587o0oOooO.oOO0O0O0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOOO0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23030OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f23031OooO0o0;

    public /* synthetic */ OooOOO0(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f23030OooO0Oo = i;
        this.f23031OooO0o0 = baseFragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23030OooO0Oo;
        int i2 = 0;
        BaseFragmentActivity baseFragmentActivity = this.f23031OooO0o0;
        switch (i) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) baseFragmentActivity;
                int i3 = MixedRoomActivity.f22961OoooO0O;
                mixedRoomActivity.getClass();
                oOO0O0O0.OooO00o(false, true, new o00oO0o(mixedRoomActivity, i2));
                break;
            case 1:
                PhoneBindActivity this$0 = (PhoneBindActivity) baseFragmentActivity;
                int i4 = PhoneBindActivity.f24788OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                TopicSearchActivity this$1 = (TopicSearchActivity) baseFragmentActivity;
                Response response = (Response) obj;
                int i5 = TopicSearchActivity.f25949OooOoo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f25955OooOo0o) {
                    if (response.getIsSuccess()) {
                        this$1.OooOoO().OooOoO0((List) response.getData());
                        if (this$1.OooOoo0().f44596OooO00o.getParent() == null) {
                            this$1.OooOoO().OooOo(this$1.OooOoo0().f44596OooO00o);
                        }
                    }
                    this$1.OooOoO().Oooo0O0(response.getIsSuccess());
                    break;
                }
                break;
        }
    }
}
