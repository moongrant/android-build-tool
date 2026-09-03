package com.amazonaws;

import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class AmazonWebServiceRequest implements Cloneable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ProgressListener f10272Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final RequestClientOptions f10273Oooo0oO = new RequestClientOptions();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Deprecated
    public RequestMetricCollector f10274Oooo0oo;

    @Override // 
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public AmazonWebServiceRequest clone() {
        try {
            AmazonWebServiceRequest amazonWebServiceRequest = (AmazonWebServiceRequest) super.clone();
            Objects.requireNonNull(amazonWebServiceRequest);
            return amazonWebServiceRequest;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
        }
    }
}
