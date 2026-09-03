package com.facebook;

import java.util.Set;
import org.json.JSONObject;
import p314o0O0oOo0.o000O00;
import p314o0O0oOo0.o000O00O;
import p314o0O0oOo0.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000oOoO implements FacebookSdk.GraphRequestCreator, com.google.firebase.components.OooO {
    @Override // com.google.firebase.components.OooO
    public Object OooO0OO(com.google.firebase.components.oo000o oo000oVar) {
        Set setOooO0oo = oo000oVar.OooO0oo(o000O00O.class);
        o000O00 o000o01 = o000O00.f42589OooO0O0;
        if (o000o01 == null) {
            synchronized (o000O00.class) {
                o000o01 = o000O00.f42589OooO0O0;
                if (o000o01 == null) {
                    o000o01 = new o000O00();
                    o000O00.f42589OooO0O0 = o000o01;
                }
            }
        }
        return new o000Oo0(setOooO0oo, o000o01);
    }

    @Override // com.facebook.FacebookSdk.GraphRequestCreator
    public GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return FacebookSdk.m4037graphRequestCreator$lambda0(accessToken, str, jSONObject, callback);
    }
}
