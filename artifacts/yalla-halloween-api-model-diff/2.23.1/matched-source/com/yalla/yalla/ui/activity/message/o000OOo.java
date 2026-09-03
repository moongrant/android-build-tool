package com.yalla.yalla.ui.activity.message;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.fragment.StoreCoinFragment;
import com.yalla.yalla.util.WebPageInfo;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p593o0oOoooO.h0;
import p675oO0Oo.oO0O00oO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000OOo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25371OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f25372OooO0o0;

    public /* synthetic */ o000OOo(int i, View.OnClickListener onClickListener) {
        this.f25371OooO0Oo = i;
        this.f25372OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        RoomConfiguration roomConfiguration;
        ArrayList<ProfileLimitModel> profileLimit;
        ArrayList<ProfileLimitModel> profileLimit2;
        int i2 = this.f25371OooO0Oo;
        int i3 = 0;
        View.OnClickListener onClickListener = this.f25372OooO0o0;
        boolean z = true;
        switch (i2) {
            case 0:
                PrivateChatActivity this$0 = (PrivateChatActivity) onClickListener;
                String str = (String) obj;
                int i4 = PrivateChatActivity.f25240Oooo000;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (str != null && str.length() != 0) {
                    z = false;
                }
                if (!z) {
                    int itemCount = this$0.OooOo0O().getItemCount();
                    while (i3 < itemCount) {
                        if (Intrinsics.areEqual(str, this$0.OooOo0O().getData(i3).getMid())) {
                            this$0.OooOo0O().notifyItemChanged(i3);
                        } else {
                            i3++;
                        }
                    }
                }
                break;
            case 1:
                RoomSettingActivity this$1 = (RoomSettingActivity) onClickListener;
                int i5 = RoomSettingActivity.f26193Oooo00O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f26200OooOoO.setValue(null);
                RoomConfiguration roomConfiguration2 = this$1.f26196OooOo0;
                if (roomConfiguration2 == null || (profileLimit2 = roomConfiguration2.getProfileLimit()) == null) {
                    i = -1;
                } else {
                    i = -1;
                    for (Object obj2 : profileLimit2) {
                        int i6 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((ProfileLimitModel) obj2).getOperationType() == 1) {
                            i = i3;
                        }
                        i3 = i6;
                    }
                }
                if (i > -1 && (roomConfiguration = this$1.f26196OooOo0) != null && (profileLimit = roomConfiguration.getProfileLimit()) != null) {
                    profileLimit.remove(i);
                    break;
                }
                break;
            case 2:
                oO0O00oO this$2 = (oO0O00oO) onClickListener;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (Intrinsics.areEqual(obj, (Object) 0)) {
                    AppCompatTextView selected = this$2.OooOO0().f43953OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(selected, "selected");
                    p425o0OoO0OO.o00O0O0.OooO0oO(selected, this$2.f59686OooOO0o);
                } else {
                    AppCompatTextView selected2 = this$2.OooOO0().f43953OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(selected2, "selected");
                    p425o0OoO0OO.o00O0O0.OooO0oO(selected2, this$2.f59685OooOO0O);
                }
                break;
            default:
                StoreCoinFragment this$3 = (StoreCoinFragment) onClickListener;
                String url = (String) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (!com.code.android.util.OooOo00.OooO00o(url)) {
                    h0.OooO0O0("105036");
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f32289OooO0o0 = url;
                    webPageInfo.f32286OooO = true;
                    webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.user_unique_id));
                    int i7 = WebActivity.f25131OooOoO0;
                    FragmentActivity fragmentActivityRequireActivity = this$3.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    WebActivity.OooO00o.OooO00o(fragmentActivityRequireActivity, webPageInfo);
                    break;
                }
                break;
        }
    }
}
