package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<OooO0O0<?>> f19318OooO0Oo;

    public DependencyCycleException(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.f19318OooO0Oo = arrayList;
    }
}
