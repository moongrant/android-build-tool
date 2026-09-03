package com.facebook.appevents.codeless;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements GraphRequest.Callback {
    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        ViewIndexer.Companion.m4086buildAppIndexingRequest$lambda0(graphResponse);
    }
}
