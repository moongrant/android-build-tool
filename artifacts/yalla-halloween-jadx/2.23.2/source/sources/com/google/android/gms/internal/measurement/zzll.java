package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzll extends IOException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f15278OooO0Oo = 0;

    public zzll(String str) {
        super(str);
    }

    public static zzll OooO00o() {
        return new zzll("Protocol message had invalid UTF-8.");
    }

    public static zzll OooO0O0() {
        return new zzll("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzll OooO0OO() {
        return new zzll("Failed to parse the message.");
    }

    public static zzll OooO0Oo() {
        return new zzll("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
