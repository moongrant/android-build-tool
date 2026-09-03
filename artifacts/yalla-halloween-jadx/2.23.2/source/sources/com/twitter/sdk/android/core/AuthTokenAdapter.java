package com.twitter.sdk.android.core;

import com.google.gson.JsonParseException;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AuthTokenAdapter implements com.google.gson.o00oO0o<OooO00o>, com.google.gson.Oooo000<OooO00o> {
    private static final String AUTH_TOKEN = "auth_token";
    private static final String AUTH_TYPE = "auth_type";
    static final Map<String, Class<? extends OooO00o>> authTypeRegistry;
    private final com.google.gson.OooOOO0 gson = new com.google.gson.OooOOO0();

    static {
        HashMap map = new HashMap();
        authTypeRegistry = map;
        map.put("oauth1a", TwitterAuthToken.class);
        map.put("oauth2", OAuth2Token.class);
        map.put("guest", GuestAuthToken.class);
    }

    public static String getAuthTypeString(Class<? extends OooO00o> cls) {
        for (Map.Entry<String, Class<? extends OooO00o>> entry : authTypeRegistry.entrySet()) {
            if (entry.getValue().equals(cls)) {
                return entry.getKey();
            }
        }
        return "";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.Oooo000
    public OooO00o deserialize(com.google.gson.o000oOoO o000oooo2, Type type, com.google.gson.OooOo oooOo) throws JsonParseException {
        com.google.gson.o00O0O o00o0oOooO00o = o000oooo2.OooO00o();
        String strOooO0O0 = ((com.google.gson.o00Ooo) o00o0oOooO00o.f20240OooO0Oo.get("auth_type")).OooO0O0();
        com.google.gson.o000oOoO o000ooooOooO0o = o00o0oOooO00o.OooO0o(AUTH_TOKEN);
        com.google.gson.OooOOO0 oooOOO0 = this.gson;
        Class<? extends OooO00o> cls = authTypeRegistry.get(strOooO0O0);
        oooOOO0.getClass();
        return (OooO00o) com.google.gson.internal.o0OOO0o.OooO0O0(cls).cast(o000ooooOooO0o == null ? null : oooOOO0.OooO0O0(new com.google.gson.internal.bind.OooO0O0(o000ooooOooO0o), cls));
    }

    @Override // com.google.gson.o00oO0o
    public com.google.gson.o000oOoO serialize(OooO00o oooO00o, Type type, com.google.gson.oo000o oo000oVar) {
        com.google.gson.o00O0O o00o0o2 = new com.google.gson.o00O0O();
        o00o0o2.OooO0Oo("auth_type", getAuthTypeString(oooO00o.getClass()));
        com.google.gson.OooOOO0 oooOOO0 = this.gson;
        oooOOO0.getClass();
        Class<?> cls = oooO00o.getClass();
        com.google.gson.internal.bind.OooO0OO oooO0OO = new com.google.gson.internal.bind.OooO0OO();
        oooOOO0.OooOO0(oooO00o, cls, oooO0OO);
        o00o0o2.OooO0OO(AUTH_TOKEN, oooO0OO.OooO00o());
        return o00o0o2;
    }
}
