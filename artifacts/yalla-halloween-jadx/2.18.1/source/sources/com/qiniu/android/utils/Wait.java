package com.qiniu.android.utils;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public class Wait {
    public final CountDownLatch completeSingle = new CountDownLatch(1);

    public void startWait() {
        while (this.completeSingle.getCount() > 0) {
            try {
                this.completeSingle.await();
                return;
            } catch (InterruptedException unused) {
            }
        }
    }

    public void stopWait() {
        this.completeSingle.countDown();
    }
}
