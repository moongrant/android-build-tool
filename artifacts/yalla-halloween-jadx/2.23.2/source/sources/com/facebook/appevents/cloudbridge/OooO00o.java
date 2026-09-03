package com.facebook.appevents.cloudbridge;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements GraphRequest.Callback {
    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        AppEventsCAPIManager.m4077enable$lambda0(graphResponse);
    }
}
