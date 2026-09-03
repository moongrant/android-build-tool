package com.twitter.sdk.android.core;

import com.google.gson.JsonParseException;
import com.google.gson.internal.bind.OooO0O0;
import com.google.gson.internal.bind.OooO0OO;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O000;
import p386o0OOoo0O.o00O000o;
import p386o0OOoo0O.o00O00O;
import p386o0OOoo0O.o00O00OO;
import p386o0OOoo0O.o00O00o0;
import p386o0OOoo0O.o00oOoo;
import p386o0OOoo0O.oOO00O;
import p433o0OoOO0o.o0oOOo;
import p660o0ooo0o0.oo0O;

/* JADX INFO: loaded from: classes2.dex */
public class AuthTokenAdapter implements o00O00o0<o0oOOo>, o00O000<o0oOOo> {
    private static final String AUTH_TOKEN = "auth_token";
    private static final String AUTH_TYPE = "auth_type";
    public static final Map<String, Class<? extends o0oOOo>> authTypeRegistry;
    private final o000OOo0 gson = new o000OOo0();

    static {
        HashMap map = new HashMap();
        authTypeRegistry = map;
        map.put("oauth1a", TwitterAuthToken.class);
        map.put("oauth2", OAuth2Token.class);
        map.put("guest", GuestAuthToken.class);
    }

    public static String getAuthTypeString(Class<? extends o0oOOo> cls) {
        for (Map.Entry<String, Class<? extends o0oOOo>> entry : authTypeRegistry.entrySet()) {
            if (entry.getValue().equals(cls)) {
                return entry.getKey();
            }
        }
        return "";
    }

    @Override // p386o0OOoo0O.o00O000
    public o0oOOo deserialize(o00O000o o00o000o2, Type type, o00oOoo o00oooo2) throws JsonParseException {
        o00O00O o00o00oOooO00o = o00o000o2.OooO00o();
        String strOooO0OO = ((oOO00O) o00o00oOooO00o.f38885OooO00o.get("auth_type")).OooO0OO();
        o00O000o o00o000oOooO0oo = o00o00oOooO00o.OooO0oo(AUTH_TOKEN);
        o000OOo0 o000ooo1 = this.gson;
        Class<? extends o0oOOo> cls = authTypeRegistry.get(strOooO0OO);
        Objects.requireNonNull(o000ooo1);
        return (o0oOOo) oo0O.OooO0O0(cls).cast(o00o000oOooO0oo == null ? null : o000ooo1.OooO0O0(new OooO0O0(o00o000oOooO0oo), cls));
    }

    @Override // p386o0OOoo0O.o00O00o0
    public o00O000o serialize(o0oOOo o0oooo2, Type type, o00O00OO o00o00oo2) {
        o00O00O o00o00o2 = new o00O00O();
        o00o00o2.OooO0oO("auth_type", getAuthTypeString(o0oooo2.getClass()));
        o000OOo0 o000ooo1 = this.gson;
        Objects.requireNonNull(o000ooo1);
        Class<?> cls = o0oooo2.getClass();
        OooO0OO oooO0OO = new OooO0OO();
        o000ooo1.OooOO0(o0oooo2, cls, oooO0OO);
        o00o00o2.OooO0o0(AUTH_TOKEN, oooO0OO.OooO00o());
        return o00o00o2;
    }
}
