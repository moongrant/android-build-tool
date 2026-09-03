package com.yalla.yalla.common.manager;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.ml.OooO;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.GTCaptcha4Config;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.GeetCodeModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p031OoooO.o0000O;
import p168o00Ooo0.oo000o;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0011J\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/common/manager/GeetCodeManager;", "", "()V", "DEFAULT_GEET_CODE", "", "GEET_CODE_KEY", "SP_NAME_GEET_CODE", "call", "Lcom/geetest/captcha/GTCaptcha4Client;", "activity", "Landroid/app/Activity;", "code", "callNetFailure", "Lkotlin/Function0;", "", "checkError", "checkSuccess", "Lkotlin/Function1;", "getGeetCode", "init", d.R, "Landroid/content/Context;", "updateGeetCode", "data", "Lcom/yalla/yalla/model/GeetCodeModel;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeetCodeManager {
    public static final int $stable = 0;

    @NotNull
    private static final String SP_NAME_GEET_CODE = o000O0O0.OooO00o(-18725229272592L);

    @NotNull
    private static final String GEET_CODE_KEY = o000O0O0.OooO00o(-18802538683920L);

    @NotNull
    private static final String DEFAULT_GEET_CODE = o000O0O0.OooO00o(-18862668226064L);

    @NotNull
    public static final GeetCodeManager INSTANCE = new GeetCodeManager();

    private GeetCodeManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: call$lambda-0, reason: not valid java name */
    public static final void m253call$lambda0(Function1 function1, Function0 function0, boolean z, String str) {
        Intrinsics.checkNotNullParameter(function1, o000O0O0.OooO00o(-18506185940496L));
        Intrinsics.checkNotNullParameter(function0, o000O0O0.OooO00o(-18566315482640L));
        if (!z) {
            function0.invoke();
        } else {
            Intrinsics.checkNotNullExpressionValue(str, o000O0O0.OooO00o(-18617855090192L));
            function1.invoke(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: call$lambda-1, reason: not valid java name */
    public static final void m254call$lambda1(Function0 function0, String str) {
        Intrinsics.checkNotNullParameter(function0, o000O0O0.OooO00o(-18656509795856L));
        function0.invoke();
    }

    @NotNull
    public final GTCaptcha4Client call(@NotNull Activity activity, @NotNull String code2, @NotNull Function0<Unit> callNetFailure, @NotNull final Function0<Unit> checkError, @NotNull final Function1<? super String, Unit> checkSuccess) throws JSONException {
        Intrinsics.checkNotNullParameter(activity, o000O0O0.OooO00o(-17883415682576L));
        Intrinsics.checkNotNullParameter(code2, o000O0O0.OooO00o(-17922070388240L));
        Intrinsics.checkNotNullParameter(callNetFailure, o000O0O0.OooO00o(-17943545224720L));
        Intrinsics.checkNotNullParameter(checkError, o000O0O0.OooO00o(-18007969734160L));
        Intrinsics.checkNotNullParameter(checkSuccess, o000O0O0.OooO00o(-18055214374416L));
        HashMap map = new HashMap();
        map.put(o000O0O0.OooO00o(-18111048949264L), Boolean.TRUE);
        map.put(o000O0O0.OooO00o(-18162588556816L), o000O0O0.OooO00o(-18196948295184L));
        map.put(o000O0O0.OooO00o(-18201243262480L), o000O0O0.OooO00o(-18235603000848L));
        String strOooO00o = oo000o.OooO00o();
        if (strOooO00o != null) {
            int iHashCode = strOooO00o.hashCode();
            if (iHashCode != 3329) {
                if (iHashCode != 3710) {
                    if (iHashCode == 3741 && strOooO00o.equals(o000O0O0.OooO00o(-18291437575696L))) {
                        strOooO00o = o000O0O0.OooO00o(-18342977183248L);
                    }
                } else if (strOooO00o.equals(o000O0O0.OooO00o(-18304322477584L))) {
                    strOooO00o = o000O0O0.OooO00o(-18317207379472L);
                }
            } else if (strOooO00o.equals(o000O0O0.OooO00o(-18278552673808L))) {
                strOooO00o = o000O0O0.OooO00o(-18330092281360L);
            }
        }
        GTCaptcha4Client gTCaptcha4ClientInit = GTCaptcha4Client.getClient(activity).init(code2, new GTCaptcha4Config.Builder().setLanguage(strOooO00o).setCanceledOnTouchOutside(false).setDialogStyle(o000O0O0.OooO00o(-18355862085136L)).setParams(map).build());
        gTCaptcha4ClientInit.addOnSuccessListener(new GTCaptcha4Client.OnSuccessListener() { // from class: com.yalla.yalla.common.manager.OooO00o
            @Override // com.geetest.captcha.GTCaptcha4Client.OnSuccessListener
            public final void onSuccess(boolean z, String str) {
                GeetCodeManager.m253call$lambda0(checkSuccess, checkError, z, str);
            }
        }).addOnFailureListener(new OooO(callNetFailure, 2)).verifyWithCaptcha();
        Intrinsics.checkNotNullExpressionValue(gTCaptcha4ClientInit, o000O0O0.OooO00o(-18433171496464L));
        return gTCaptcha4ClientInit;
    }

    @NotNull
    public final String getGeetCode() {
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        String string = context.getSharedPreferences(o000O0O0.OooO00o(-17599947841040L), 0).getString(o000O0O0.OooO00o(-17677257252368L), o000O0O0.OooO00o(-17737386794512L));
        return string == null ? o000O0O0.OooO00o(-17741681761808L) : string;
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, o000O0O0.OooO00o(-17221990718992L));
        SharedPreferences sharedPreferences = context.getSharedPreferences(o000O0O0.OooO00o(-17256350457360L), 0);
        if (TextUtils.isEmpty(sharedPreferences.getString(o000O0O0.OooO00o(-17333659868688L), o000O0O0.OooO00o(-17393789410832L)))) {
            sharedPreferences.edit().putString(o000O0O0.OooO00o(-17398084378128L), o000O0O0.OooO00o(-17458213920272L)).commit();
        }
    }

    public final void updateGeetCode(@Nullable GeetCodeModel data) {
        Context context = null;
        if (data != null || TextUtils.isEmpty(null)) {
            Context context2 = o0000O.f2657OooO00o;
            if (context2 != null) {
                context = context2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(o000O0O0.OooO00o(-17745976729104L), 0).edit();
            String strOooO00o = o000O0O0.OooO00o(-17823286140432L);
            Intrinsics.checkNotNull(data);
            editorEdit.putString(strOooO00o, data.getCaptchaId()).commit();
        }
    }
}
