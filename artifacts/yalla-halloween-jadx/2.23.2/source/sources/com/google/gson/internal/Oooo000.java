package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 implements o00oO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Constructor f20171OooO00o;

    public Oooo000(Constructor constructor) {
        this.f20171OooO00o = constructor;
    }

    @Override // com.google.gson.internal.o00oO0o
    public final Object OooO00o() {
        Constructor constructor = this.f20171OooO00o;
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
