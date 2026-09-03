package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.SkillCardModel;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0ooOOo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23076OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f23077OooO0o0;

    public /* synthetic */ o0ooOOo(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f23076OooO0Oo = i;
        this.f23077OooO0o0 = baseFragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23076OooO0Oo;
        BaseFragmentActivity baseFragmentActivity = this.f23077OooO0o0;
        switch (i) {
            case 0:
                p501o0o00o00.OooOO0O oooOO0O = ((MixedRoomActivity) baseFragmentActivity).f22967OooOoOO;
                if (oooOO0O != null) {
                    oooOO0O.OooO00o((SkillCardModel) obj);
                }
                break;
            default:
                TurnOnLoginProtectionActivity this$0 = (TurnOnLoginProtectionActivity) baseFragmentActivity;
                int i2 = TurnOnLoginProtectionActivity.f24879OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
        }
    }
}
