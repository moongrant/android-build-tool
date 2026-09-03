package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class be implements bg {
    private ExecutorService AFInAppEventParameterName;

    @Nullable
    public Context AFInAppEventType;
    private av AFKeystoreWrapper;
    private u AFVersionDeclaration;
    private bd valueOf;
    private final int values = (int) TimeUnit.SECONDS.toMillis(30);

    @Override // com.appsflyer.internal.bg
    public final bh AFInAppEventType() {
        if (this.AFVersionDeclaration == null) {
            bj bjVar = new bj(this.values);
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = Executors.newCachedThreadPool();
            }
            this.AFVersionDeclaration = new u(bjVar, this.AFInAppEventParameterName);
        }
        u uVar = this.AFVersionDeclaration;
        Context context = this.AFInAppEventType;
        if (context != null) {
            return new bh(uVar, new n(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.bg
    public final av AFKeystoreWrapper() {
        if (this.AFKeystoreWrapper == null) {
            if (this.valueOf == null) {
                this.valueOf = new bd();
            }
            bd bdVar = this.valueOf;
            Context context = this.AFInAppEventType;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            bf bfVar = new bf(context);
            Context context2 = this.AFInAppEventType;
            if (context2 == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            ba baVar = new ba(ag.AFInAppEventParameterName(context2));
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = Executors.newCachedThreadPool();
            }
            this.AFKeystoreWrapper = new av(bdVar, bfVar, baVar, this.AFInAppEventParameterName, AFInAppEventType());
        }
        return this.AFKeystoreWrapper;
    }
}
