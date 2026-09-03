package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;
import p254o00ooO0o.o000OO00;
import p254o00ooO0o.o000OOo0;
import p254o00ooO0o.o00O000;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GmsSignatureVerifier {
    static {
        zzag.zzl();
        zzag.zzl();
        o000OOo0 o000ooo1 = o00O000.f40252OooO0Oo;
        zzag zzagVarZzn = zzag.zzn(o000ooo1.OooOo0(), o00O000.f40250OooO0O0.OooOo0());
        Preconditions.checkNotNull(zzagVarZzn);
        zzag zzagVarZzk = zzag.zzk(zzagVarZzn);
        o000OO00 o000oo01 = o00O000.f40251OooO0OO;
        zzag zzagVarZzn2 = zzag.zzn(o000oo01.OooOo0(), o00O000.f40249OooO00o.OooOo0());
        Preconditions.checkNotNull(zzagVarZzn2);
        zzag zzagVarZzk2 = zzag.zzk(zzagVarZzn2);
        if (204200000 < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (zzagVarZzk.isEmpty() && zzagVarZzk2.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        zzag.zzl();
        zzag.zzl();
        zzag zzagVarZzm = zzag.zzm(o000ooo1.OooOo0());
        Preconditions.checkNotNull(zzagVarZzm);
        zzag zzagVarZzk3 = zzag.zzk(zzagVarZzm);
        zzag zzagVarZzm2 = zzag.zzm(o000oo01.OooOo0());
        Preconditions.checkNotNull(zzagVarZzm2);
        zzag zzagVarZzk4 = zzag.zzk(zzagVarZzm2);
        if (82240000 < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (zzagVarZzk3.isEmpty() && zzagVarZzk4.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        new HashMap();
    }
}
