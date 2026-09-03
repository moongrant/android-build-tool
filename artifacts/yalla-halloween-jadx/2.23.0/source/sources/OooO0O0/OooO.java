package OooO0O0;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements androidx.activity.result.OooO00o, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f87OooO0Oo;

    public /* synthetic */ OooO(Object obj) {
        this.f87OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        ((ContributionFragment) this.f87OooO0Oo).lambda$initView$1();
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        OooO00o oooO00o;
        OooOOO0 this$0 = (OooOOO0) this.f87OooO0Oo;
        ActivityResult activityResult = (ActivityResult) obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = activityResult.f2201OooO0o0;
        int i = 0;
        int i2 = activityResult.f2200OooO0Oo;
        if (i2 == -1) {
            if (intent == null) {
                OooO00o oooO00o2 = this$0.f106OooO0OO;
                if (oooO00o2 == null) {
                    return;
                }
                oooO00o2.OooO0O0("Response data in the intent is null");
                return;
            }
            OooOOO oooOOOOooO00o = this$0.OooO00o(intent);
            if (oooOOOOooO00o == null) {
                return;
            }
            if (oooOOOOooO00o.f102OooO0O0 == 2) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooOO0O(i, this$0, oooOOOOooO00o));
                i = 1;
            }
            if (i != 0 || (oooO00o = this$0.f106OooO0OO) == null) {
                return;
            }
            oooO00o.OooO0OO(oooOOOOooO00o);
            return;
        }
        if (i2 != 0) {
            return;
        }
        if (intent == null) {
            OooO00o oooO00o3 = this$0.f106OooO0OO;
            if (oooO00o3 == null) {
                return;
            }
            oooO00o3.OooO00o(null);
            return;
        }
        OooOOO oooOOOOooO00o2 = this$0.OooO00o(intent);
        if (oooOOOOooO00o2 == null) {
            return;
        }
        if (oooOOOOooO00o2.f102OooO0O0 == 2) {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooOO0(this$0, i));
            return;
        }
        OooO00o oooO00o4 = this$0.f106OooO0OO;
        if (oooO00o4 == null) {
            return;
        }
        oooO00o4.OooO00o(oooOOOOooO00o2);
    }
}
