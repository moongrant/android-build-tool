package com.amazonaws.internal.keyvaluestore;

import java.security.Key;

/* JADX INFO: loaded from: classes.dex */
interface KeyProvider {
    Key OooO00o(String str) throws KeyNotFoundException;

    void OooO0O0(String str);

    Key OooO0OO(String str) throws KeyNotGeneratedException;
}
