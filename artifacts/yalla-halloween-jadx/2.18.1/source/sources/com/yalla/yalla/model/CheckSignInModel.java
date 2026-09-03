package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/CheckSignInModel;", "", "()V", ServerProtocol.DIALOG_PARAM_STATE, "", "getState", "()I", "setState", "(I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CheckSignInModel {
    public static final int $stable = 8;
    private int state;

    public final int getState() {
        return this.state;
    }

    public final void setState(int i) {
        this.state = i;
    }
}
