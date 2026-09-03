package com.yallatech.support.platform.base.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yallatech/support/platform/base/bean/PopWindow;", "", "", "animator", "Z", "getAnimator", "()Z", "<init>", "(Z)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PopWindow {
    private final boolean animator;

    public PopWindow(boolean z) {
        this.animator = z;
    }

    public final boolean getAnimator() {
        return this.animator;
    }
}
