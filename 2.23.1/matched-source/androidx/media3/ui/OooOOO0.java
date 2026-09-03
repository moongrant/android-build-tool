package androidx.media3.ui;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import kotlin.jvm.internal.Intrinsics;
import p205o00o0o0o.o000O;
import p474o0OoooOO.oo0oO0;
import p490o0o00O0.o0O0oo00;
import p490o0o00O0.oo0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9647OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f9648OooO0o0;

    public /* synthetic */ OooOOO0(KeyEvent.Callback callback, int i) {
        this.f9647OooO0Oo = i;
        this.f9648OooO0o0 = callback;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean, int] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strOooO0OO;
        boolean z;
        int i;
        int i2 = this.f9647OooO0Oo;
        KeyEvent.Callback callback = this.f9648OooO0o0;
        switch (i2) {
            case 0:
                PlayerControlView.OooO00o((PlayerControlView) callback);
                break;
            default:
                UntieAccountBindActivity this$0 = (UntieAccountBindActivity) callback;
                int i3 = UntieAccountBindActivity.f24889OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                AccountBindInfo accountBindInfo = this$0.f24891OooOo0;
                if (accountBindInfo != null) {
                    Intrinsics.checkNotNull(accountBindInfo);
                    String msg = accountBindInfo.getIsPh();
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    if (!((TextUtils.isEmpty(msg) || Intrinsics.areEqual(AppEventsConstants.EVENT_PARAM_VALUE_NO, msg)) ? false : true)) {
                        AccountBindInfo accountBindInfo2 = this$0.f24891OooOo0;
                        if (accountBindInfo2 != null) {
                            ?? IsBindYallaChat = accountBindInfo2.isBindYallaChat();
                            if (accountBindInfo2.isBindFacebook()) {
                                i = IsBindYallaChat;
                                i = IsBindYallaChat + 1;
                            }
                            i = IsBindYallaChat;
                            int i4 = i;
                            if (accountBindInfo2.isBindTwitter()) {
                                i4 = i + 1;
                            }
                            if (i4 >= 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (!z) {
                            o000O o000o = new o000O(this$0);
                            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                            o000o.OooOOoo(oo0oO0.OooOoO0() ? p565o0oOo000.o000OOo.unbind_account_explanation : p565o0oOo000.o000OOo.unbind_account_explanation_no_phone);
                            o000o.OooOo(true);
                            o000o.OooOo0(new o0O0oo00(this$0));
                            o000o.OooOO0o();
                        }
                    }
                    o000O o000o2 = new o000O(this$0);
                    String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.sure_unbind_account);
                    String[] strArr = new String[1];
                    int i5 = this$0.f24893OooOo0O;
                    if (i5 == 4) {
                        strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.single_third_facebook);
                    } else if (i5 == 5) {
                        strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.single_third_weChat);
                    } else if (i5 == 7) {
                        strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.single_third_instagram);
                    } else if (i5 != 9) {
                        strOooO0OO = i5 != 12 ? this$0.OooOoO0().f45057OooO0o0.getText().toString() : com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.single_third_yallachat);
                    } else {
                        strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.single_third_twitter);
                    }
                    strArr[0] = strOooO0OO;
                    o000o2.OooOo00(com.code.android.util.o0000O.OooO00o(strOooO0OO2, strArr));
                    o000o2.OooOOOO(p565o0oOo000.o000OOo.Unbind);
                    o000o2.OooOo0(new oo0ooO(this$0));
                    o000o2.OooOo(true);
                    o000o2.OooOO0o();
                    break;
                }
                break;
        }
    }
}
