package com.amazonaws.logging;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ApacheCommonsLogging implements Log {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public org.apache.commons.logging.Log f10442OooO00o;

    public ApacheCommonsLogging(String str) {
        this.f10442OooO00o = org.apache.commons.logging.LogFactory.getLog(str);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO(Object obj) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        this.f10442OooO00o.warn(obj);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO00o(Object obj) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        this.f10442OooO00o.debug(obj);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0O0(Object obj, Throwable th) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        this.f10442OooO00o.debug(obj, th);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0OO() {
        if (!this.f10442OooO00o.isDebugEnabled()) {
            return false;
        }
        Map<String, Log> map = LogFactory.f10443OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0Oo() {
        if (!this.f10442OooO00o.isErrorEnabled()) {
            return false;
        }
        Map<String, Log> map = LogFactory.f10443OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0o(Object obj) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        this.f10442OooO00o.info(obj);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0o0() {
        if (!this.f10442OooO00o.isInfoEnabled()) {
            return false;
        }
        Map<String, Log> map = LogFactory.f10443OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0oO(Object obj, Throwable th) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        this.f10442OooO00o.warn(obj, th);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0oo(Object obj, Throwable th) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        this.f10442OooO00o.error(obj, th);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooOO0(Object obj) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        this.f10442OooO00o.error(obj);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooOO0O(Object obj) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        this.f10442OooO00o.trace(obj);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooOO0o(Object obj, Throwable th) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        this.f10442OooO00o.info(obj, th);
    }
}
