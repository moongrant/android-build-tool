package com.amazonaws.transform;

import com.amazonaws.AmazonServiceException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractErrorUnmarshaller<T> implements Unmarshaller<AmazonServiceException, T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<? extends AmazonServiceException> f12653OooO00o;

    public AbstractErrorUnmarshaller() {
        this(AmazonServiceException.class);
    }

    public AbstractErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        this.f12653OooO00o = cls;
    }
}
