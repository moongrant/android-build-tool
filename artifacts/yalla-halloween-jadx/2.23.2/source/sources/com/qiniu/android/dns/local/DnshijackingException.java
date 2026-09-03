package com.qiniu.android.dns.local;

import com.qiniu.android.dns.DnsException;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
public class DnshijackingException extends DnsException {
    public DnshijackingException(String str, String str2) {
        super(str, o00O00OO.OooO00o("has hijacked by ", str2));
    }

    public DnshijackingException(String str, String str2, int i) {
        super(str, "has hijacked by " + str2 + " ttl " + i);
    }
}
