package OooOO0;

import OooO00o.OooOOO;
import OooO00o.OooOOOO;
import OooO00o.OooOo;
import android.os.Bundle;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AuthResponse;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0Oo.OooOo00;
import p003OooO0Oo.Oooo000;
import p003OooO0Oo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends Oooo000 implements OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooO00o f149OooO0O0;

    public OooO0o(@NotNull OooO00o loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.f149OooO0O0 = loginClient;
    }

    @Override // OooO00o.OooO0O0
    public final void OooO00o(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f149OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, message, 1));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0O0(@Nullable OooOOOO oooOOOO) {
        if (oooOOOO == null) {
            this.f149OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -1002, "Auth Canceled", 1));
            return;
        }
        Bundle bundle = oooOOOO.f85OooO0OO;
        if (bundle == null) {
            this.f149OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, "Request auth code success，but we received a null bundle", 1));
            return;
        }
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        int i = bundle.getInt("yp_biz_response_code");
        String string = bundle.getString("yp_biz_response_msg");
        if (string == null) {
            string = "";
        }
        Pair pair = new Pair(Integer.valueOf(i), string);
        OooO00o oooO00o = this.f149OooO0O0;
        oooO00o.OooO0Oo(oooO00o.OooO00o(((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0OO(@NotNull OooOOOO data) {
        Unit unit;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.f84OooO0O0 != 1) {
            OooO00o oooO00o = this.f149OooO0O0;
            oooO00o.OooO0Oo(oooO00o.OooO00o(-2002, null));
            return;
        }
        Bundle bundle = data.f85OooO0OO;
        if (bundle == null) {
            this.f149OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, "Request auth code success，but we received a null bundle", 1));
            return;
        }
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("yp_biz_auth_temp_code");
        if (string == null) {
            unit = null;
        } else {
            this.f149OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, string, 0, null, 4));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f149OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, "Request temp auth code is ok，but temp auth code is null", 1));
        }
    }

    public final void OooO0o(OooO00o.OooO oooO) {
        try {
            OooOo00.OooO00o oooO00o = this.f149OooO0O0.f112OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            OooOOO oooOOO = this.f149OooO0O0.f109OooO0o;
            Objects.requireNonNull(oooOOO);
            Intrinsics.checkNotNullParameter(this, "bizClient");
            oooOOO.f78OooO0OO = this;
            this.f149OooO0O0.f109OooO0o.OooO0OO(oooO, 1, OooO0oO(), null);
        } catch (Exception e) {
            OooO00o oooO00o2 = this.f149OooO0O0;
            AuthResponse.Companion companion = AuthResponse.INSTANCE;
            String message = e.getMessage();
            if (message == null) {
                message = "launch yallachatsdk exception";
            }
            oooO00o2.OooO0Oo(AuthResponse.Companion.OooO00o(companion, null, -2002, message, 1));
        }
    }

    @Override // p003OooO0Oo.Oooo000
    public final void OooO0o0() {
        Unit unit;
        final OooOo oooOo;
        o00O0O o00o0o2 = this.f149OooO0O0.f108OooO0Oo;
        if (o00o0o2 == null || (oooOo = o00o0o2.f116OooO00o) == null) {
            unit = null;
        } else {
            if (OooO0Oo()) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new Runnable() { // from class: OooOO0.OooO0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooO0o this$0 = this.f147Oooo0o;
                        OooO00o.OooO nativeAppInfo = oooOo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                        this$0.OooO0o(nativeAppInfo);
                    }
                });
            } else {
                OooO0o(oooOo);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f149OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, null, 5));
        }
    }

    public final Bundle OooO0oO() {
        String strJoinToString$default;
        if (this.f149OooO0O0.OooO0oO() == null) {
            return new Bundle();
        }
        String redirectUri = YCSDKOpenKit.getDirectUrl$lib_release();
        OooO0O0 oooO0O0OooO0oO = this.f149OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0O0OooO0oO);
        String stateCode = oooO0O0OooO0oO.f146OooO0OO.getStateCode();
        String scope = "";
        if (stateCode == null) {
            stateCode = "";
        }
        OooO0O0 oooO0O0OooO0oO2 = this.f149OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0O0OooO0oO2);
        String[] scope2 = oooO0O0OooO0oO2.f146OooO0OO.getScope();
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
