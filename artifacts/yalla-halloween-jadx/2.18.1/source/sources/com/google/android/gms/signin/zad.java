package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;
import p389o0OOooO0.o00O0O;
import p389o0OOooO0.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zad {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Api.AbstractClientBuilder<SignInClientImpl, zac> f16342OooO00o;
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
        o00O0O o00o0o2 = new o00O0O();
        zac = o00o0o2;
        o00Oo0 o00oo1 = new o00Oo0();
        f16342OooO00o = o00oo1;
        zae = new Scope(Scopes.PROFILE);
        zaf = new Scope("email");
        zag = new Api<>("SignIn.API", o00o0o2, clientKey);
        zah = new Api<>("SignIn.INTERNAL_API", o00oo1, clientKey2);
    }
}
