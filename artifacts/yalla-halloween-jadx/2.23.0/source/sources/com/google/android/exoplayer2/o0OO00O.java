package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p203o00o0o0o.o0oO0Ooo;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0OO00O extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f12845OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f12846OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f12843OooO0oo = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f12842OooO = o0O00.Oooo00O(2);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o0oO0Ooo f12844OooOO0 = new o0oO0Ooo();

    public o0OO00O() {
        this.f12845OooO0o = false;
        this.f12846OooO0oO = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o0OO00O)) {
            return false;
        }
        o0OO00O o0oo00o2 = (o0OO00O) obj;
        return this.f12846OooO0oO == o0oo00o2.f12846OooO0oO && this.f12845OooO0o == o0oo00o2.f12845OooO0o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12845OooO0o), Boolean.valueOf(this.f12846OooO0oO)});
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(o0ooOOo.f12867OooO0Oo, 3);
        bundle.putBoolean(f12843OooO0oo, this.f12845OooO0o);
        bundle.putBoolean(f12842OooO, this.f12846OooO0oO);
        return bundle;
    }

    public o0OO00O(boolean z) {
        this.f12845OooO0o = true;
        this.f12846OooO0oO = z;
    }
}
