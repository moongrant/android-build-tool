package com.amazonaws;

import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AmazonWebServiceRequest implements Cloneable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ProgressListener f12052OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Deprecated
    public RequestMetricCollector f12053OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RequestClientOptions f12054OooO0o0 = new RequestClientOptions();

    @Override // 
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public AmazonWebServiceRequest clone() {
        try {
            AmazonWebServiceRequest amazonWebServiceRequest = (AmazonWebServiceRequest) super.clone();
            amazonWebServiceRequest.getClass();
            return amazonWebServiceRequest;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e);
        }
    }
}
