package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractErrorUnmarshaller<T> implements Unmarshaller<AmazonServiceException, T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<? extends AmazonServiceException> f11151OooO00o;

    public AbstractErrorUnmarshaller() {
        this.f11151OooO00o = AmazonServiceException.class;
    }

    public AbstractErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        this.f11151OooO00o = cls;
    }
}
