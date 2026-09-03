package p226o00oOo00;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.compose.compiler.plugins.kotlin.OooO0o;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import p069o0000ooO.o0OO00O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OO0OO;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O00O implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f39870OooO = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f39871OooOO0 = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final o000O00 f39872OooOO0O = new o000O00();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f39873OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f39874OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f39875OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOo[] f39876OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f39877OooO0oo;

    public o000O00O(String str, OooOo... oooOoArr) {
        o00O000o.OooO00o(oooOoArr.length > 0);
        this.f39875OooO0o0 = str;
        this.f39876OooO0oO = oooOoArr;
        this.f39873OooO0Oo = oooOoArr.length;
        int iOooO0oo = o00OO0OO.OooO0oo(oooOoArr[0].f11211OooOOOO);
        this.f39874OooO0o = iOooO0oo == -1 ? o00OO0OO.OooO0oo(oooOoArr[0].f11209OooOOO) : iOooO0oo;
        String str2 = oooOoArr[0].f11202OooO0o;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = oooOoArr[0].f11205OooO0oo | 16384;
        for (int i2 = 1; i2 < oooOoArr.length; i2++) {
            String str3 = oooOoArr[i2].f11202OooO0o;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                OooO00o(i2, "languages", oooOoArr[0].f11202OooO0o, oooOoArr[i2].f11202OooO0o);
                return;
            } else {
                if (i != (oooOoArr[i2].f11205OooO0oo | 16384)) {
                    OooO00o(i2, "role flags", Integer.toBinaryString(oooOoArr[0].f11205OooO0oo), Integer.toBinaryString(oooOoArr[i2].f11205OooO0oo));
                    return;
                }
            }
        }
    }

    public static void OooO00o(int i, String str, @Nullable String str2, @Nullable String str3) {
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbOooO0OO.append(str3);
        sbOooO0OO.append("' (track ");
        sbOooO0OO.append(i);
        sbOooO0OO.append(")");
        Log.OooO0Oo("TrackGroup", "", new IllegalStateException(sbOooO0OO.toString()));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000O00O.class != obj.getClass()) {
            return false;
        }
        o000O00O o000o00o2 = (o000O00O) obj;
        return this.f39875OooO0o0.equals(o000o00o2.f39875OooO0o0) && Arrays.equals(this.f39876OooO0oO, o000o00o2.f39876OooO0oO);
    }

    public final int hashCode() {
        if (this.f39877OooO0oo == 0) {
            this.f39877OooO0oo = o0OO00O.OooO00o(this.f39875OooO0o0, 527, 31) + Arrays.hashCode(this.f39876OooO0oO);
        }
        return this.f39877OooO0oo;
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        OooOo[] oooOoArr = this.f39876OooO0oO;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(oooOoArr.length);
        for (OooOo oooOo : oooOoArr) {
            arrayList.add(oooOo.OooO0o0(true));
        }
        bundle.putParcelableArrayList(f39870OooO, arrayList);
        bundle.putString(f39871OooOO0, this.f39875OooO0o0);
        return bundle;
    }
}
