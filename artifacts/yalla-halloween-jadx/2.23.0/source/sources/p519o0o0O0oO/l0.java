package p519o0o0O0oO;

import android.content.Context;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.CommonModel;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f52413OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f52414OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ k0 f52415OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k0 k0Var, Context context, boolean z, String str) {
        super(context);
        this.f52415OooO0oO = k0Var;
        this.f52414OooO0o0 = z;
        this.f52413OooO0o = str;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        if ("1000".equals(((CommonModel) oOo00OO0.OooO00o(str, CommonModel.class)).code)) {
            boolean z = this.f52414OooO0o0;
            k0 k0Var = this.f52415OooO0oO;
            if (z) {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o000000O.OooOO0O().postValue(this.f52413OooO0o);
            } else {
                StringBuilder sb = new StringBuilder();
                for (String str2 : k0Var.f52393OooOO0O) {
                    if (!str2.isEmpty()) {
                        sb.append(",");
                        sb.append(str2);
                    }
                }
                String strReplaceFirst = sb.toString().replaceFirst(",", "");
                o000000O o000000o3 = o000000O.f46674OooO00o;
                o000000O.OooOO0O().postValue(strReplaceFirst);
            }
            k0Var.dismiss();
        }
    }
}
