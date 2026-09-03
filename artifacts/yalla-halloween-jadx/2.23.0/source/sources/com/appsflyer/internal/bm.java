package com.appsflyer.internal;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class bm<ResponseBody> {
    final br<ResponseBody> AFInAppEventParameterName;
    final v AFInAppEventType;
    final bj AFKeystoreWrapper;
    public final ExecutorService valueOf;
    public final AtomicBoolean values = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.appsflyer.internal.bm$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        private /* synthetic */ bl values;

        public AnonymousClass3(bl blVar) {
            this.values = blVar;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            try {
                bm bmVar = bm.this;
                bi<String> biVarValueOf = bmVar.AFKeystoreWrapper.valueOf(bmVar.AFInAppEventType);
                bl blVar = this.values;
                if (blVar != null) {
                    blVar.AFInAppEventType(new bi(bm.this.AFInAppEventParameterName.AFKeystoreWrapper(biVarValueOf.values), biVarValueOf.valueOf, biVarValueOf.AFKeystoreWrapper()));
                }
            } catch (IOException e) {
                bl blVar2 = this.values;
                if (blVar2 != null) {
                    blVar2.valueOf(e);
                }
            }
        }
    }

    public bm(v vVar, ExecutorService executorService, bj bjVar, br<ResponseBody> brVar) {
        this.AFInAppEventType = vVar;
        this.valueOf = executorService;
        this.AFKeystoreWrapper = bjVar;
        this.AFInAppEventParameterName = brVar;
    }
}
