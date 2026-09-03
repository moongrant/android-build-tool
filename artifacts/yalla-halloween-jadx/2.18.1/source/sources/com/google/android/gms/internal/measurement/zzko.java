package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzko extends IOException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final /* synthetic */ int f15981Oooo0o = 0;

    public zzko(String str) {
        super(str);
    }

    public static zzko OooO00o() {
        return new zzko("Protocol message had invalid UTF-8.");
    }

    public static zzko OooO0O0() {
        return new zzko("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzko OooO0OO() {
        return new zzko("Failed to parse the message.");
    }

    public static zzko OooO0Oo() {
        return new zzko("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
