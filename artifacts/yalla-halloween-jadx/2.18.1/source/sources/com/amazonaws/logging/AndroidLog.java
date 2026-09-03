package com.amazonaws.logging;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AndroidLog implements Log {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10441OooO00o;

    public AndroidLog(String str) {
        this.f10441OooO00o = str;
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO(Object obj) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        android.util.Log.w(this.f10441OooO00o, obj.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO00o(Object obj) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        android.util.Log.d(this.f10441OooO00o, obj.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0O0(Object obj, Throwable th) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        android.util.Log.d(this.f10441OooO00o, obj.toString(), th);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0OO() {
        if (!android.util.Log.isLoggable(this.f10441OooO00o, 3)) {
            return false;
        }
        Map<String, Log> map = LogFactory.f10443OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0Oo() {
        if (!android.util.Log.isLoggable(this.f10441OooO00o, 6)) {
            return false;
        }
        Map<String, Log> map = LogFactory.f10443OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0o(Object obj) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        android.util.Log.i(this.f10441OooO00o, obj.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0o0() {
        if (!android.util.Log.isLoggable(this.f10441OooO00o, 4)) {
            return false;
        }
        Map<String, Log> map = LogFactory.f10443OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0oO(Object obj, Throwable th) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        android.util.Log.w(this.f10441OooO00o, obj.toString(), th);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0oo(Object obj, Throwable th) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        android.util.Log.e(this.f10441OooO00o, obj.toString(), th);
    }

    @Override // com.amazonaws.logging.Log
    public final void OooOO0(Object obj) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        android.util.Log.e(this.f10441OooO00o, obj.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void OooOO0O(Object obj) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        android.util.Log.v(this.f10441OooO00o, obj.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void OooOO0o(Object obj, Throwable th) {
        Map<String, Log> map = LogFactory.f10443OooO00o;
        android.util.Log.i(this.f10441OooO00o, obj.toString(), th);
    }
}
