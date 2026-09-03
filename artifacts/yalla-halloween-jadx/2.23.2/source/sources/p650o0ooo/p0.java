package p650o0ooo;

import android.content.Context;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.CommonModel;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f59082OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f59083OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ n0 f59084OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(n0 n0Var, Context context, boolean z, String str) {
        super(context);
        this.f59084OooO0oO = n0Var;
        this.f59083OooO0o0 = z;
        this.f59082OooO0o = str;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        if ("1000".equals(((CommonModel) oOOO00.OooO00o(str, CommonModel.class)).code)) {
            boolean z = this.f59083OooO0o0;
            n0 n0Var = this.f59084OooO0oO;
            if (z) {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooOO0O().postValue(this.f59082OooO0o);
            } else {
                StringBuilder sb = new StringBuilder();
                for (String str2 : n0Var.f58405OooOO0O) {
                    if (!str2.isEmpty()) {
                        sb.append(",");
                        sb.append(str2);
                    }
                }
                String strReplaceFirst = sb.toString().replaceFirst(",", "");
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooOO0O().postValue(strReplaceFirst);
            }
            n0Var.dismiss();
        }
    }
}
