package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 implements oo000o<Object> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Constructor f20644OooO0O0;

    public Oooo000(Constructor constructor) {
        this.f20644OooO0O0 = constructor;
    }

    @Override // com.google.gson.internal.oo000o
    public final Object OooO00o() {
        Constructor constructor = this.f20644OooO0O0;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e3.getTargetException());
        }
    }
}
