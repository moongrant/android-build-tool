package com.yallatech.support.platform.base.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yallatech/support/platform/base/bean/EnableBackForward;", "", "", "back", "I", "getBack", "()I", "forward", "getForward", "<init>", "(II)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class EnableBackForward {
    private final int back;
    private final int forward;

    /* JADX WARN: Illegal instructions before constructor call */
    public EnableBackForward() {
        int i = 0;
        this(i, i, 3, null);
    }

    public EnableBackForward(int i, int i2) {
        this.back = i;
        this.forward = i2;
    }

    public final int getBack() {
        return this.back;
    }

    public final int getForward() {
        return this.forward;
    }

    public /* synthetic */ EnableBackForward(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2);
    }
}
