package com.amazonaws.logging;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ApacheCommonsLogging implements Log {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final org.apache.commons.logging.Log f12220OooO00o;

    public ApacheCommonsLogging(String str) {
        this.f12220OooO00o = org.apache.commons.logging.LogFactory.getLog(str);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO(String str) {
        HashMap map = LogFactory.f12221OooO00o;
        this.f12220OooO00o.warn(str);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO00o(String str, Exception exc) {
        HashMap map = LogFactory.f12221OooO00o;
        this.f12220OooO00o.debug(str, exc);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0O0() {
        if (!this.f12220OooO00o.isDebugEnabled()) {
            return false;
        }
        HashMap map = LogFactory.f12221OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0OO() {
        if (!this.f12220OooO00o.isInfoEnabled()) {
            return false;
        }
        HashMap map = LogFactory.f12221OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0Oo(String str, Exception exc) {
        HashMap map = LogFactory.f12221OooO00o;
        this.f12220OooO00o.error(str, exc);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0o() {
        if (!this.f12220OooO00o.isErrorEnabled()) {
            return false;
        }
        HashMap map = LogFactory.f12221OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0o0(Serializable serializable) {
        HashMap map = LogFactory.f12221OooO00o;
        this.f12220OooO00o.error(serializable);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0oO(String str) {
        HashMap map = LogFactory.f12221OooO00o;
        this.f12220OooO00o.debug(str);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0oo(String str) {
        HashMap map = LogFactory.f12221OooO00o;
        this.f12220OooO00o.info(str);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooOO0(String str) {
        HashMap map = LogFactory.f12221OooO00o;
        this.f12220OooO00o.trace(str);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooOO0O(String str, Exception exc) {
        HashMap map = LogFactory.f12221OooO00o;
        this.f12220OooO00o.warn(str, exc);
    }
}
