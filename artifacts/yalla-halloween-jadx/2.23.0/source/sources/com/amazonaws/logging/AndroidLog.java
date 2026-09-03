package com.amazonaws.logging;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidLog implements Log {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f9129OooO00o;

    public AndroidLog(String str) {
        this.f9129OooO00o = str;
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO(String str) {
        HashMap map = LogFactory.f9131OooO00o;
        android.util.Log.w(this.f9129OooO00o, str.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO00o(String str, Exception exc) {
        HashMap map = LogFactory.f9131OooO00o;
        android.util.Log.d(this.f9129OooO00o, str.toString(), exc);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0O0() {
        if (!android.util.Log.isLoggable(this.f9129OooO00o, 3)) {
            return false;
        }
        HashMap map = LogFactory.f9131OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0OO() {
        if (!android.util.Log.isLoggable(this.f9129OooO00o, 4)) {
            return false;
        }
        HashMap map = LogFactory.f9131OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0Oo(String str, Exception exc) {
        HashMap map = LogFactory.f9131OooO00o;
        android.util.Log.e(this.f9129OooO00o, str.toString(), exc);
    }

    @Override // com.amazonaws.logging.Log
    public final boolean OooO0o() {
        if (!android.util.Log.isLoggable(this.f9129OooO00o, 6)) {
            return false;
        }
        HashMap map = LogFactory.f9131OooO00o;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0o0(Serializable serializable) {
        HashMap map = LogFactory.f9131OooO00o;
        android.util.Log.e(this.f9129OooO00o, serializable.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0oO(String str) {
        HashMap map = LogFactory.f9131OooO00o;
        android.util.Log.d(this.f9129OooO00o, str.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void OooO0oo(String str) {
        HashMap map = LogFactory.f9131OooO00o;
        android.util.Log.i(this.f9129OooO00o, str.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void OooOO0(String str) {
        HashMap map = LogFactory.f9131OooO00o;
        android.util.Log.v(this.f9129OooO00o, str.toString());
    }

    @Override // com.amazonaws.logging.Log
    public final void OooOO0O(String str, Exception exc) {
        HashMap map = LogFactory.f9131OooO00o;
        android.util.Log.w(this.f9129OooO00o, str.toString(), exc);
    }
}
