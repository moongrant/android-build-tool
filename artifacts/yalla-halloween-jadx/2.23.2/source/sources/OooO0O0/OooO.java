package OooO0O0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements androidx.activity.result.OooO00o, BaseQuickAdapter.OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f87OooO0Oo;

    public /* synthetic */ OooO(Object obj) {
        this.f87OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        MainRoomMineFollowingFragment.initView$lambda$2((MainRoomMineFollowingFragment) this.f87OooO0Oo);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        OooO00o oooO00o;
        final OooOOO0 this$0 = (OooOOO0) this.f87OooO0Oo;
        ActivityResult activityResult = (ActivityResult) obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = activityResult.f2199OooO0o0;
        int i = 0;
        int i2 = activityResult.f2198OooO0Oo;
        if (i2 == -1) {
            if (intent == null) {
                OooO00o oooO00o2 = this$0.f105OooO0OO;
                if (oooO00o2 == null) {
                    return;
                }
                oooO00o2.OooO0O0("Response data in the intent is null");
                return;
            }
            final OooOOO oooOOOOooO00o = this$0.OooO00o(intent);
            if (oooOOOOooO00o == null) {
                return;
            }
            if (oooOOOOooO00o.f101OooO0O0 == 2) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new Runnable() { // from class: OooO0O0.OooOO0O
                    @Override // java.lang.Runnable
                    public final void run() {
                        Pair pair;
                        OooOOO0 this$1 = this$0;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        OooOOO data = oooOOOOooO00o;
                        Intrinsics.checkNotNullParameter(data, "$data");
                        o0OoOo0.OooO00o oooO00o3 = this$1.f106OooO0Oo;
                        if (oooO00o3 == null) {
                            return;
                        }
                        Bundle bundle = data.f102OooO0OO;
                        if (bundle == null) {
                            pair = null;
                        } else {
                            Intrinsics.checkNotNullParameter(bundle, "bundle");
                            String string = bundle.getString("auth_sdk_version");
                            if (string == null) {
                                string = "";
                            }
                            pair = new Pair(string, Integer.valueOf(bundle.getInt("auth_service_version", -1)));
                        }
                        if (pair == null) {
                            pair = new Pair("", -1);
                        }
                        String str = (String) pair.component1();
                        ((Number) pair.component2()).intValue();
                        OooOo00 oooOo00 = OooOo00.f108OooO0O0;
                        oooOo00.getClass();
                        Intrinsics.checkNotNullParameter(str, "<set-?>");
                        oooOo00.f95OooO00o = str;
                        oooO00o3.invoke(oooOo00);
                    }
                });
                i = 1;
            }
            if (i != 0 || (oooO00o = this$0.f105OooO0OO) == null) {
                return;
            }
            oooO00o.OooO0OO(oooOOOOooO00o);
            return;
        }
        if (i2 != 0) {
            return;
        }
        if (intent == null) {
            OooO00o oooO00o3 = this$0.f105OooO0OO;
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
        if (oooOOOOooO00o2.f101OooO0O0 == 2) {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooOO0(this$0, i));
            return;
        }
        OooO00o oooO00o4 = this$0.f105OooO0OO;
        if (oooO00o4 == null) {
            return;
        }
        oooO00o4.OooO00o(oooOOOOooO00o2);
    }
}
