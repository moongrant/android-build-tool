package com.google.firebase.components;

import OooO00o.OooO00o;
import java.util.Arrays;
import java.util.List;
import p357o0OOOo0O.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<oo000o<?>> f18792Oooo0o;

    /* JADX WARN: Illegal instructions before constructor call */
    public DependencyCycleException(List<oo000o<?>> list) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Dependency cycle detected: ");
        sbOooO0o0.append(Arrays.toString(list.toArray()));
        super(sbOooO0o0.toString());
        this.f18792Oooo0o = list;
    }
}
