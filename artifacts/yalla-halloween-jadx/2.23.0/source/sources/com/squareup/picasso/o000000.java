package com.squareup.picasso;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000L);
    }
}
