package p271o00ooooo;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Long f40559OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f40560OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f40561OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f40562OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f40563OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f40564OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f40565OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f40566OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Long f40567OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Long f40568OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Boolean f40569OooOO0O;

    public oO00OO0O(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j5 >= 0);
        this.f40560OooO00o = str;
        this.f40561OooO0O0 = str2;
        this.f40562OooO0OO = j;
        this.f40563OooO0Oo = j2;
        this.f40565OooO0o0 = j3;
        this.f40564OooO0o = j4;
        this.f40566OooO0oO = j5;
        this.f40567OooO0oo = l;
        this.f40559OooO = l2;
        this.f40568OooOO0 = l3;
        this.f40569OooOO0O = bool;
    }

    public final oO00OO0O OooO00o(Long l, Long l2, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new oO00OO0O(this.f40560OooO00o, this.f40561OooO0O0, this.f40562OooO0OO, this.f40563OooO0Oo, this.f40565OooO0o0, this.f40564OooO0o, this.f40566OooO0oO, this.f40567OooO0oo, l, l2, bool);
    }

    public final oO00OO0O OooO0O0(long j, long j2) {
        return new oO00OO0O(this.f40560OooO00o, this.f40561OooO0O0, this.f40562OooO0OO, this.f40563OooO0Oo, this.f40565OooO0o0, this.f40564OooO0o, j, Long.valueOf(j2), this.f40559OooO, this.f40568OooOO0, this.f40569OooOO0O);
    }
}
