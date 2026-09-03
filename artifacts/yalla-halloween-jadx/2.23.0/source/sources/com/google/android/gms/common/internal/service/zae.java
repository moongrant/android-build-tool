package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import p256o00ooOo0.o0OoO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class zae {
    public final PendingResult<Status> zaa(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new o0OoO00O(googleApiClient));
    }
}
