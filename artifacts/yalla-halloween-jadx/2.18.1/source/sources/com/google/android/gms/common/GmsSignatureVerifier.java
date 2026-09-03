package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;
import p330o0O0ooo0.o00;
import p330o0O0ooo0.o000O0Oo;
import p330o0O0ooo0.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GmsSignatureVerifier {
    static {
        zzag.zzl();
        zzag.zzl();
        o000OO0O o000oo0o2 = o00.f37050OooO0Oo;
        zzag zzagVarZzn = zzag.zzn(o000oo0o2.OooOOo(), o00.f37048OooO0O0.OooOOo());
        Preconditions.checkNotNull(zzagVarZzn);
        zzag zzagVarZzk = zzag.zzk(zzagVarZzn);
        o000O0Oo o000o0oo2 = o00.f37049OooO0OO;
        zzag zzagVarZzn2 = zzag.zzn(o000o0oo2.OooOOo(), o00.f37047OooO00o.OooOOo());
        Preconditions.checkNotNull(zzagVarZzn2);
        zzag zzagVarZzk2 = zzag.zzk(zzagVarZzn2);
        if (zzagVarZzk.isEmpty() && zzagVarZzk2.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        zzag.zzl();
        zzag.zzl();
        zzag zzagVarZzm = zzag.zzm(o000oo0o2.OooOOo());
        Preconditions.checkNotNull(zzagVarZzm);
        zzag zzagVarZzk3 = zzag.zzk(zzagVarZzm);
        zzag zzagVarZzm2 = zzag.zzm(o000o0oo2.OooOOo());
        Preconditions.checkNotNull(zzagVarZzm2);
        zzag zzagVarZzk4 = zzag.zzk(zzagVarZzm2);
        if (zzagVarZzk3.isEmpty() && zzagVarZzk4.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        new HashMap();
    }
}
