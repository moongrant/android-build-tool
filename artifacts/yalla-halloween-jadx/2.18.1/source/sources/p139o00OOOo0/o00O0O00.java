package p139o00OOOo0;

import android.content.Context;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.CommonModel;
import p160o00OoOO0.o00OO0O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O00 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f31834OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f31835OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ o00O0 f31836OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(o00O0 o00o1, Context context, boolean z, String str) {
        super(context);
        this.f31836OooO0OO = o00o1;
        this.f31834OooO00o = z;
        this.f31835OooO0O0 = str;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        super.onFinish(str);
        if ("1000".equals(((CommonModel) o0Oo0oo.OooO0O0(str, CommonModel.class)).f11862code)) {
            if (this.f31834OooO00o) {
                OooOOO.f41216OooO00o.OooOO0O().postValue(this.f31835OooO0O0);
            } else {
                StringBuilder sb = new StringBuilder();
                for (String str2 : this.f31836OooO0OO.f31811OoooO) {
                    if (!str2.isEmpty()) {
                        sb.append(",");
                        sb.append(str2);
                    }
                }
                OooOOO.f41216OooO00o.OooOO0O().postValue(sb.toString().replaceFirst(",", ""));
            }
            this.f31836OooO0OO.dismiss();
        }
    }
}
