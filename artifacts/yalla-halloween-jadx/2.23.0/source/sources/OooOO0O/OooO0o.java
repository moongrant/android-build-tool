package OooOO0O;

import OooO0O0.OooOOO;
import OooO0O0.OooOOO0;
import OooO0O0.OooOo00;
import android.os.Bundle;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AuthResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0Oo0oo;
import p003OooO0o0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends oo000o implements OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o f176OooO0O0;

    public OooO0o(@NotNull OooO00o loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f176OooO0O0 = loginClient;
    }

    @Override // OooO0O0.OooO00o
    public final void OooO00o(@Nullable OooOOO oooOOO) {
        OooO00o oooO00o = this.f176OooO0O0;
        if (oooOOO == null) {
            oooO00o.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -1002, "Auth Canceled", 1));
            return;
        }
        Bundle bundle = oooOOO.f103OooO0OO;
        if (bundle == null) {
            oooO00o.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, "Request auth code success，but we received a null bundle", 1));
            return;
        }
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        int i = bundle.getInt("yp_biz_response_code");
        String string = bundle.getString("yp_biz_response_msg");
        if (string == null) {
            string = "";
        }
        Pair pair = new Pair(Integer.valueOf(i), string);
        oooO00o.OooO0Oo(oooO00o.OooO00o(((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0O0(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f176OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, message, 1));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0OO(@NotNull OooOOO data) {
        Unit unit;
        Intrinsics.checkNotNullParameter(data, "data");
        int i = data.f102OooO0O0;
        OooO00o oooO00o = this.f176OooO0O0;
        if (i != 1) {
            oooO00o.OooO0Oo(oooO00o.OooO00o(-2002, null));
            return;
        }
        Bundle bundle = data.f103OooO0OO;
        if (bundle == null) {
            oooO00o.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, "Request auth code success，but we received a null bundle", 1));
            return;
        }
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("yp_biz_auth_temp_code");
        if (string == null) {
            unit = null;
        } else {
            oooO00o.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, string, 0, null, 4));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            oooO00o.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, "Request temp auth code is ok，but temp auth code is null", 1));
        }
    }

    public final void OooO0o(OooO0O0.OooO0o oooO0o) {
        OooO00o oooO00o = this.f176OooO0O0;
        try {
            o00Oo0.OooO00o oooO00o2 = oooO00o.f136OooO0oo;
            if (oooO00o2 != null) {
                oooO00o2.OooO00o();
            }
            OooOOO0 oooOOO0 = oooO00o.f133OooO0o;
            oooOOO0.getClass();
            Intrinsics.checkNotNullParameter(this, "bizClient");
            oooOOO0.f106OooO0OO = this;
            oooO00o.f133OooO0o.OooO0O0(oooO0o, 1, OooO0oO(), null);
        } catch (Exception e) {
            AuthResponse.Companion companion = AuthResponse.INSTANCE;
            String message = e.getMessage();
            if (message == null) {
                message = "launch yallachatsdk exception";
            }
            oooO00o.OooO0Oo(AuthResponse.Companion.OooO00o(companion, null, -2002, message, 1));
        }
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        Unit unit;
        OooOo00 oooOo00;
        OooO00o oooO00o = this.f176OooO0O0;
        o0Oo0oo o0oo0oo2 = oooO00o.f132OooO0Oo;
        if (o0oo0oo2 == null || (oooOo00 = o0oo0oo2.f143OooO00o) == null) {
            unit = null;
        } else {
            if (oo000o.OooO0Oo()) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooO0OO(0, this, oooOo00));
            } else {
                OooO0o(oooOo00);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            oooO00o.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, null, 5));
        }
    }

    public final Bundle OooO0oO() {
        String strJoinToString$default;
        OooO00o oooO00o = this.f176OooO0O0;
        if (oooO00o.OooO0oO() == null) {
            return new Bundle();
        }
        String redirectUri = YCSDKOpenKit.getDirectUrl$lib_release();
        OooO0O0 oooO0O0OooO0oO = oooO00o.OooO0oO();
        Intrinsics.checkNotNull(oooO0O0OooO0oO);
        String stateCode = oooO0O0OooO0oO.f172OooO0OO.getStateCode();
        String scope = "";
        if (stateCode == null) {
            stateCode = "";
        }
        OooO0O0 oooO0O0OooO0oO2 = oooO00o.OooO0oO();
        Intrinsics.checkNotNull(oooO0O0OooO0oO2);
        String[] scope2 = oooO0O0OooO0oO2.f172OooO0OO.getScope();
        if (scope2 != null && (strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(scope2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)) != null) {
            scope = strJoinToString$default;
        }
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Bundle bundle = new Bundle();
        bundle.putString("yp_state_code", stateCode);
        bundle.putString("yp_redirect_uri", redirectUri);
        bundle.putString("yp_auth_scope", scope);
        bundle.putInt("yp_protocol_version", 20210810);
        return bundle;
    }
}
