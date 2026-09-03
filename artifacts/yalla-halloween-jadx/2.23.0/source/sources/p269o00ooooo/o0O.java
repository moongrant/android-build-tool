package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Long f41144OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41145OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41146OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f41147OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f41148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f41149OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f41150OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f41151OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Long f41152OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Long f41153OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Boolean f41154OooOO0O;

    public o0O(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j5 >= 0);
        this.f41145OooO00o = str;
        this.f41146OooO0O0 = str2;
        this.f41147OooO0OO = j;
        this.f41148OooO0Oo = j2;
        this.f41150OooO0o0 = j3;
        this.f41149OooO0o = j4;
        this.f41151OooO0oO = j5;
        this.f41152OooO0oo = l;
        this.f41144OooO = l2;
        this.f41153OooOO0 = l3;
        this.f41154OooOO0O = bool;
    }

    public final o0O OooO00o(Long l, Long l2, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new o0O(this.f41145OooO00o, this.f41146OooO0O0, this.f41147OooO0OO, this.f41148OooO0Oo, this.f41150OooO0o0, this.f41149OooO0o, this.f41151OooO0oO, this.f41152OooO0oo, l, l2, bool);
    }

    public final o0O OooO0O0(long j, long j2) {
        return new o0O(this.f41145OooO00o, this.f41146OooO0O0, this.f41147OooO0OO, this.f41148OooO0Oo, this.f41150OooO0o0, this.f41149OooO0o, j, Long.valueOf(j2), this.f41144OooO, this.f41153OooOO0, this.f41154OooOO0O);
    }
}
