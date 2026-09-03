package com.twitter.sdk.android.core;

import com.google.gson.JsonParseException;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AuthTokenAdapter implements com.google.gson.oo000o<OooO00o>, com.google.gson.Oooo000<OooO00o> {
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
    public OooO00o deserialize(com.google.gson.Oooo0 oooo0, Type type, com.google.gson.OooOo oooOo) throws JsonParseException {
        com.google.gson.o0OoOo0 o0oooo0OooO00o = oooo0.OooO00o();
        String strOooO0O0 = ((com.google.gson.o00Oo0) o0oooo0OooO00o.f20715OooO0Oo.get("auth_type")).OooO0O0();
        com.google.gson.Oooo0 oooo0OooO0o = o0oooo0OooO00o.OooO0o(AUTH_TOKEN);
        com.google.gson.OooOOO0 oooOOO0 = this.gson;
        Class<? extends OooO00o> cls = authTypeRegistry.get(strOooO0O0);
        oooOOO0.getClass();
        return (OooO00o) o00O0.OooO0o.OooO0o0(cls).cast(oooo0OooO0o == null ? null : oooOOO0.OooO0O0(new com.google.gson.internal.bind.OooO0O0(oooo0OooO0o), cls));
    }

    @Override // com.google.gson.oo000o
    public com.google.gson.Oooo0 serialize(OooO00o oooO00o, Type type, com.google.gson.o00Ooo o00ooo2) {
        com.google.gson.o0OoOo0 o0oooo0 = new com.google.gson.o0OoOo0();
        o0oooo0.OooO0Oo("auth_type", getAuthTypeString(oooO00o.getClass()));
        com.google.gson.OooOOO0 oooOOO0 = this.gson;
        oooOOO0.getClass();
        Class<?> cls = oooO00o.getClass();
        com.google.gson.internal.bind.OooO0OO oooO0OO = new com.google.gson.internal.bind.OooO0OO();
        oooOOO0.OooOO0(oooO00o, cls, oooO0OO);
        o0oooo0.OooO0OO(AUTH_TOKEN, oooO0OO.OooO00o());
        return o0oooo0;
    }
}
