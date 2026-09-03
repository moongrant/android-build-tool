package p429o0OoOO;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.GTCaptcha4Config;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00O.o000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 {
    /* JADX WARN: Multi-variable type inference failed */
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
        String strOooO0O0 = OooOo00.OooO0O0();
        int iHashCode = strOooO0O0.hashCode();
        if (iHashCode == 3329 ? strOooO0O0.equals("hi") : iHashCode == 3710 ? strOooO0O0.equals("tr") : !(iHashCode != 3741 || !strOooO0O0.equals("ur"))) {
            strOooO0O0 = "en";
        }
        GTCaptcha4Client gTCaptcha4ClientInit = GTCaptcha4Client.getClient(context).init(code, new GTCaptcha4Config.Builder().setLanguage(strOooO0O0).setCanceledOnTouchOutside(false).setDialogStyle("geet_dialog_style").setParams(map).build());
        gTCaptcha4ClientInit.addOnSuccessListener(new GTCaptcha4Client.OnSuccessListener() { // from class: o0OoOO.o0OoOo0
            @Override // com.geetest.captcha.GTCaptcha4Client.OnSuccessListener
            public final void onSuccess(boolean z, String str) {
                Function1 checkSuccess2 = checkSuccess;
                Intrinsics.checkNotNullParameter(checkSuccess2, "$checkSuccess");
                Function0 checkError2 = checkError;
                Intrinsics.checkNotNullParameter(checkError2, "$checkError");
                if (!z) {
                    checkError2.invoke();
                } else {
                    Intrinsics.checkNotNull(str);
                    checkSuccess2.invoke(str);
                }
            }
        }).addOnFailureListener(new o00O0O((Lambda) callNetFailure)).addOnWebViewShowListener(new o000O(function0)).verifyWithCaptcha();
        Intrinsics.checkNotNull(gTCaptcha4ClientInit);
        return gTCaptcha4ClientInit;
    }
}
