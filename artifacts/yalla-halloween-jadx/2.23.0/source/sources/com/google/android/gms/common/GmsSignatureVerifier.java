package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;
import p252o00ooO0o.o000O0;
import p252o00ooO0o.o000O00O;
import p252o00ooO0o.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GmsSignatureVerifier {
    static {
        zzag.zzl();
        zzag.zzl();
        o000O0 o000o0 = o000OO00.f40927OooO0Oo;
        zzag zzagVarZzn = zzag.zzn(o000o0.OooOo00(), o000OO00.f40925OooO0O0.OooOo00());
        Preconditions.checkNotNull(zzagVarZzn);
        zzag zzagVarZzk = zzag.zzk(zzagVarZzn);
        o000O00O o000o00o2 = o000OO00.f40926OooO0OO;
        zzag zzagVarZzn2 = zzag.zzn(o000o00o2.OooOo00(), o000OO00.f40924OooO00o.OooOo00());
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
        zzag zzagVarZzm = zzag.zzm(o000o0.OooOo00());
        Preconditions.checkNotNull(zzagVarZzm);
        zzag zzagVarZzk3 = zzag.zzk(zzagVarZzm);
        zzag zzagVarZzm2 = zzag.zzm(o000o00o2.OooOo00());
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
