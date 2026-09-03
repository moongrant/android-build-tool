package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFInAppEventType;

/* JADX INFO: loaded from: classes.dex */
public final class cf extends by {
    public cf(@NonNull Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.f
    public final f AFKeystoreWrapper(String str) {
        return super.AFKeystoreWrapper(values(str));
    }
}
