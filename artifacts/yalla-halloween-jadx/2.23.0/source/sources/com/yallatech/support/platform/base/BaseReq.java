package com.yallatech.support.platform.base;

import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/yallatech/support/platform/base/BaseReq;", "Landroid/os/Parcelable;", "", "getType", "()I", "", "transaction", "Ljava/lang/String;", "getTransaction", "()Ljava/lang/String;", "setTransaction", "(Ljava/lang/String;)V", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseReq implements Parcelable {

    @Nullable
    private String transaction;

    @Nullable
    public final String getTransaction() {
        return this.transaction;
    }

    public abstract int getType();

    public final void setTransaction(@Nullable String str) {
        this.transaction = str;
    }
}
