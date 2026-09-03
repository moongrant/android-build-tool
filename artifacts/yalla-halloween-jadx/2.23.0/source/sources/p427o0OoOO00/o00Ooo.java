package p427o0OoOO00;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.GTCaptcha4Config;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p045Oooooo.o000O00O;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo {
    @NotNull
    public static GTCaptcha4Client OooO00o(@NotNull Context context, @NotNull String code, @NotNull Function0 callNetFailure, @NotNull final Function0 checkError, @Nullable Function0 function0, @NotNull final Function1 checkSuccess) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callNetFailure, "callNetFailure");
        Intrinsics.checkNotNullParameter(checkError, "checkError");
        Intrinsics.checkNotNullParameter(checkSuccess, "checkSuccess");
        HashMap map = new HashMap();
        map.put("hideSuccess", Boolean.TRUE);
        map.put("loading", "");
        map.put("bgColor", "#00000000");
        String strOooO0O0 = OooO.OooO0O0();
        int iHashCode = strOooO0O0.hashCode();
        if (iHashCode == 3329 ? strOooO0O0.equals("hi") : iHashCode == 3710 ? strOooO0O0.equals("tr") : !(iHashCode != 3741 || !strOooO0O0.equals("ur"))) {
            strOooO0O0 = "en";
        }
        GTCaptcha4Client gtCaptcha4Client = GTCaptcha4Client.getClient(context).init(code, new GTCaptcha4Config.Builder().setLanguage(strOooO0O0).setCanceledOnTouchOutside(false).setDialogStyle("geet_dialog_style").setParams(map).build());
        gtCaptcha4Client.addOnSuccessListener(new GTCaptcha4Client.OnSuccessListener() { // from class: o0OoOO00.o00O0O
            @Override // com.geetest.captcha.GTCaptcha4Client.OnSuccessListener
            public final void onSuccess(boolean z, String geetInfo) {
                Function1 checkSuccess2 = checkSuccess;
                Intrinsics.checkNotNullParameter(checkSuccess2, "$checkSuccess");
                Function0 checkError2 = checkError;
                Intrinsics.checkNotNullParameter(checkError2, "$checkError");
                if (!z) {
                    checkError2.invoke();
                } else {
                    Intrinsics.checkNotNullExpressionValue(geetInfo, "geetInfo");
                    checkSuccess2.invoke(geetInfo);
                }
            }
        }).addOnFailureListener(new o000O00O(callNetFailure)).addOnWebViewShowListener(new o00Oo0(function0)).verifyWithCaptcha();
        Intrinsics.checkNotNullExpressionValue(gtCaptcha4Client, "gtCaptcha4Client");
        return gtCaptcha4Client;
    }
}
