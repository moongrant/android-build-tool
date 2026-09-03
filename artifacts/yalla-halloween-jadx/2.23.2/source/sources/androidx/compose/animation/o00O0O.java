package androidx.compose.animation;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O implements androidx.media3.common.OooO0OO.OooO00o {
    public static float OooO00o(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static String OooO0O0(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        int i = bundle.getInt(androidx.media3.common.OooOo00.f6627OooO0Oo, -1);
        if (i == 0) {
            return (androidx.media3.common.OooOo00) androidx.media3.common.OooOO0O.f6469OooOO0.OooO0OO(bundle);
        }
        if (i == 1) {
            return (androidx.media3.common.OooOo00) androidx.media3.common.OooOOO.f6473OooO0oo.OooO0OO(bundle);
        }
        if (i == 2) {
            return (androidx.media3.common.OooOo00) androidx.media3.common.OooOo.f6624OooOO0.OooO0OO(bundle);
        }
        if (i == 3) {
            return (androidx.media3.common.OooOo00) androidx.media3.common.Oooo000.f6687OooOO0.OooO0OO(bundle);
        }
        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown RatingType: ", i));
    }
}
