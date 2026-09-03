package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;
import o0.OooO00o;
import o0.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class zad {
    public static final Api.ClientKey<SignInClientImpl> zaa;

    @ShowFirstParty
    public static final Api.ClientKey<SignInClientImpl> zab;
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> zac;
    public static final Scope zae;
    public static final Scope zaf;
    public static final Api<SignInOptions> zag;
    public static final Api<zac> zah;

    static {
        Api.ClientKey<SignInClientImpl> clientKey = new Api.ClientKey<>();
        zaa = clientKey;
        Api.ClientKey<SignInClientImpl> clientKey2 = new Api.ClientKey<>();
        zab = clientKey2;
        OooO00o oooO00o = new OooO00o();
        zac = oooO00o;
        OooO0O0 oooO0O0 = new OooO0O0();
        zae = new Scope(Scopes.PROFILE);
        zaf = new Scope("email");
        zag = new Api<>("SignIn.API", oooO00o, clientKey);
        zah = new Api<>("SignIn.INTERNAL_API", oooO0O0, clientKey2);
    }
}
