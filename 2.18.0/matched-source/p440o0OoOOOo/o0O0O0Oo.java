package p440o0OoOOOo;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import com.twitter.sdk.android.tweetcomposer.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import kotlin.jvm.internal.Intrinsics;
import p256o00ooO0o.oo0oOO0;
import p536o0o0OOo0.oO0OoOO0;
import p619o0oo0o.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0O0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f40104Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f40105OoooO00;

    public /* synthetic */ o0O0O0Oo(Object obj, int i) {
        this.f40104Oooo = i;
        this.f40105OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f40104Oooo) {
            case 0:
                OooO00o.this.OooO00o();
                break;
            default:
                UntieAccountBindActivity context = (UntieAccountBindActivity) this.f40105OoooO00;
                int i = UntieAccountBindActivity.f21906Oooooo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                AccountBindInfo accountBindInfo = context.f21909OooooOo;
                if (accountBindInfo != null) {
                    if (!Oooo000.OooO0O0(accountBindInfo.getIsPh())) {
                        oo0oOO0 oo0ooo0 = new oo0oOO0(context);
                        oo0ooo0.OooOo0(R.string.Please_bind_up_with_your_phone_number_first);
                        oo0ooo0.OooOoOO(true);
                        oo0ooo0.OooOo0o(new oO0OoOO0(context));
                        oo0ooo0.OooOOO0();
                    } else if (!context.OooOoo().f50615OooO0Oo.isShown()) {
                        String isPh = accountBindInfo.getIsPh();
                        String countryCode = accountBindInfo.getCountryCode();
                        ClientCodeType clientCodeType = ClientCodeType.UnbindThird;
                        int i2 = context.f21910Oooooo0;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intent intent = new Intent(context, (Class<?>) SmsCodeActivity.class);
                        intent.putExtra("PHONE_NUMBER", isPh);
                        intent.putExtra("COUNTRY_AREA_CODE", countryCode);
                        intent.putExtra("TYPE_ACCOUNT", clientCodeType);
                        intent.putExtra("TYPE_UNBIND", i2);
                        intent.putExtra("DELETE_REASON_TYPE", (Parcelable) null);
                        intent.putExtra("IS_ACTIVATE", 0);
                        context.startActivity(intent);
                    } else {
                        context.OooOooO();
                    }
                    break;
                }
                break;
        }
    }
}
