package OooO00o;

import android.content.Intent;
import android.view.View;
import androidx.activity.result.ActivityResult;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements androidx.activity.result.OooO00o, BaseQuickAdapter.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f73OooO0Oo;

    public /* synthetic */ OooOO0(Object obj) {
        this.f73OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        BadgeFragment.m311initView$lambda4((BadgeFragment) this.f73OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        OooO0O0 oooO0O0;
        OooOOO this$0 = (OooOOO) this.f73OooO0Oo;
        ActivityResult activityResult = (ActivityResult) obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = activityResult.f4334Oooo0oO;
        int i = activityResult.f4333Oooo0o;
        int i2 = 0;
        if (i == -1) {
            if (intent == null) {
                OooO0O0 oooO0O1 = this$0.f78OooO0OO;
                if (oooO0O1 == null) {
                    return;
                }
                oooO0O1.OooO00o("Response data in the intent is null");
                return;
            }
            OooOOOO oooOOOOOooO00o = this$0.OooO00o(intent);
            if (oooOOOOOooO00o == null) {
                return;
            }
            if (oooOOOOOooO00o.f84OooO0O0 == 2) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooOOO0(this$0, oooOOOOOooO00o, i2));
                i2 = 1;
            }
            if (i2 != 0 || (oooO0O0 = this$0.f78OooO0OO) == null) {
                return;
            }
            oooO0O0.OooO0OO(oooOOOOOooO00o);
            return;
        }
        if (i != 0) {
            return;
        }
        if (intent == null) {
            OooO0O0 oooO0O2 = this$0.f78OooO0OO;
            if (oooO0O2 == null) {
                return;
            }
            oooO0O2.OooO0O0(null);
            return;
        }
        OooOOOO oooOOOOOooO00o2 = this$0.OooO00o(intent);
        if (oooOOOOOooO00o2 == null) {
            return;
        }
        if (oooOOOOOooO00o2.f84OooO0O0 == 2) {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooOO0O(this$0, i2));
            return;
        }
        OooO0O0 oooO0O3 = this$0.f78OooO0OO;
        if (oooO0O3 == null) {
            return;
        }
        oooO0O3.OooO0O0(oooOOOOOooO00o2);
    }
}
