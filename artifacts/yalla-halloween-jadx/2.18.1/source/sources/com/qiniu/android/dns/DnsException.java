package com.qiniu.android.dns;

import OooO0o.OooO0OO;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DnsException extends IOException {
    public DnsException(String str, String str2) {
        super(OooO0OO.OooO00o(str, ": ", str2));
    }
}
