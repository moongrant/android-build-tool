package p564o0oOo00;

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
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.oo0oOO0;
import p582o0oOoOoO.c3;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O00 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f45150Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f45151Oooo0oO;

    public /* synthetic */ o000O00(Object obj, int i) {
        this.f45150Oooo0o = i;
        this.f45151Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f45150Oooo0o) {
            case 0:
                WalletActivity this$0 = (WalletActivity) this.f45151Oooo0oO;
                WalletActivity.OooO00o oooO00o = WalletActivity.f23268OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!(this$0.f23273OooooOO == 0.0d)) {
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
                MainExploreFragment.m341showOrInitErrorView$lambda11((MainExploreFragment) this.f45151Oooo0oO, view);
                break;
            default:
                RoomMemberConveneListDialog this$1 = (RoomMemberConveneListDialog) this.f45151Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                OooOo.OooO0O0("102207");
                if (this$1.f24169OooooOO) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.room_member_convene_send_success);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        } else {
                            o0o0oooOooO0O0.run();
                        }
                        break;
                    }
                } else if (!this$1.f24162OoooOOo.isEmpty()) {
                    oo0oOO0 oo0ooo0 = new oo0oOO0(this$1.f24159OoooO);
                    oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.room_member_convene_dialog_title));
                    oo0ooo0.OooOo0(R.string.room_member_convene_dialog_content);
                    oo0ooo0.OooOo0o(new c3(this$1));
                    oo0ooo0.OooOoOO(true);
                    oo0ooo0.OooOOO0();
                    break;
                } else {
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.please_select_the_members_to_convene_first);
                    ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o002 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
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
