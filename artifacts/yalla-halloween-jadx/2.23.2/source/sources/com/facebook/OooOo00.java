package com.facebook;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements FacebookSdk.GraphRequestCreator {
    @Override // com.facebook.FacebookSdk.GraphRequestCreator
    public final GraphRequest createPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.Callback callback) {
        return FacebookSdk.m4039graphRequestCreator$lambda0(accessToken, str, jSONObject, callback);
    }
}
