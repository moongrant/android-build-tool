package p566o0oOo00;

import android.content.Intent;
import android.os.Looper;
import android.view.View;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.store.CoinCrystalDetailActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p256o00ooO0o.oo0oOO0;
import p584o0oOoOoO.b3;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O00O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f45168Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f45169OoooO00;

    public /* synthetic */ o000O00O(Object obj, int i) {
        this.f45168Oooo = i;
        this.f45169OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f45168Oooo) {
            case 0:
                WalletActivity this$0 = (WalletActivity) this.f45169OoooO00;
                WalletActivity.OooO00o oooO00o = WalletActivity.f23287ooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!(this$0.f23291Oooooo == 0.0d)) {
                    Intent intent = new Intent(this$0, (Class<?>) CoinCrystalDetailActivity.class);
                    intent.putExtra("type", 2);
                    this$0.startActivity(intent);
                } else {
                    Intent intent2 = new Intent(this$0, (Class<?>) CoinCrystalDetailActivity.class);
                    intent2.putExtra("type", 1);
                    this$0.startActivity(intent2);
                }
                break;
            case 1:
                MainExploreFragment.m341showOrInitErrorView$lambda11((MainExploreFragment) this.f45169OoooO00, view);
                break;
            default:
                RoomMemberConveneListDialog this$1 = (RoomMemberConveneListDialog) this.f45169OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                OooOo.OooO0O0("102207");
                if (this$1.f24188Oooooo) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.room_member_convene_send_success);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        } else {
                            o0o0oooOooO0O0.run();
                        }
                        break;
                    }
                } else if (!this$1.f24182OoooOoo.isEmpty()) {
                    oo0oOO0 oo0ooo0 = new oo0oOO0(this$1.f24178OoooOOO);
                    oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.room_member_convene_dialog_title));
                    oo0ooo0.OooOo0(R.string.room_member_convene_dialog_content);
                    oo0ooo0.OooOo0o(new b3(this$1));
                    oo0ooo0.OooOoOO(true);
                    oo0ooo0.OooOOO0();
                    break;
                } else {
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.please_select_the_members_to_convene_first);
                    ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o002 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                        } else {
                            o0o0oooOooO0O1.run();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
