package com.android.billingclient.api;

import android.net.Uri;
import android.text.Selection;
import android.widget.EditText;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000 implements p357o0OOOo0O.o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ o0000 f11258OooO00o = new o0000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f11259OooO0O0 = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f11260OooO0OO = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f11261OooO0Oo = {-1, -1073741826, -1, -1, -1, 1, 1};

    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    public static void OooO(int i, int[] iArr) {
        if (i == 0) {
            if (iArr[4] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((((long) i) & 4294967295L) * (((long) (-2147483647)) & 4294967295L)) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j;
        long j2 = (j >>> 32) + (4294967295L & ((long) iArr[1]));
        iArr[1] = (int) j2;
        if (((j2 >>> 32) != 0 ? p399o0Oo00oo.o00000OO.OooOOOO(5, iArr, 2) : 0) == 0) {
            if (iArr[4] == -1 || !p697oO0OOo0o.Oooo0.OooO0o0(iArr, f11259OooO0O0)) {
                return;
            }
        }
        p399o0Oo00oo.o00000OO.OooO0oO(5, -2147483647, iArr);
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p697oO0OOo0o.Oooo0.OooO00o(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && p697oO0OOo0o.Oooo0.OooO0o0(iArr3, f11259OooO0O0))) {
            p399o0Oo00oo.o00000OO.OooO0oO(5, -2147483647, iArr3);
        }
    }

    public static List OooO0OO(List list) {
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public static boolean OooO0Oo(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && ShareConstants.WEB_DIALOG_PARAM_MEDIA.equals(uri.getAuthority());
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        if (!p697oO0OOo0o.Oooo0.OooO0oO(iArr)) {
            p697oO0OOo0o.Oooo0.OooOO0O(f11259OooO0O0, iArr, iArr2);
            return;
        }
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        iArr2[4] = 0;
    }

    public static void OooO0o0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        p697oO0OOo0o.Oooo0.OooO0oo(iArr, iArr2, iArr4);
        OooO0oo(iArr4, iArr3);
    }

    public static long OooO0oO(p318o0O0oOo.o000 o000Var, int i, int i2) {
        o000Var.OooOoOO(i);
        if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 < 5) {
            return -9223372036854775807L;
        }
        int iOooO0Oo = o000Var.OooO0Oo();
        if ((8388608 & iOooO0Oo) != 0 || ((2096896 & iOooO0Oo) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if (((iOooO0Oo & 32) != 0) && o000Var.OooOOo0() >= 7 && o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 >= 7) {
            if ((o000Var.OooOOo0() & 16) == 16) {
                byte[] bArr = new byte[6];
                o000Var.OooO0OO(bArr, 0, 6);
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    public static void OooO0oo(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[0]) & 4294967295L) + j + (j << 31) + 0;
        iArr2[0] = (int) j6;
        long j7 = (((long) iArr[1]) & 4294967295L) + j2 + (j2 << 31) + (j6 >>> 32);
        iArr2[1] = (int) j7;
        long j8 = (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31) + (j7 >>> 32);
        iArr2[2] = (int) j8;
        long j9 = (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31) + (j8 >>> 32);
        iArr2[3] = (int) j9;
        long j10 = (4294967295L & ((long) iArr[4])) + j5 + (j5 << 31) + (j9 >>> 32);
        iArr2[4] = (int) j10;
        OooO((int) (j10 >>> 32), iArr2);
    }

    public static void OooOO0(EditText editText) {
        if (editText == null) {
            return;
        }
        int length = editText.getText().length();
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        String strTrim = editText.getText().toString().trim();
        if (length > strTrim.length()) {
            length = strTrim.length();
        }
        Selection.setSelection(editText.getText(), length);
    }

    public static void OooOO0O(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        p697oO0OOo0o.Oooo0.OooOO0(iArr, iArr3);
        OooO0oo(iArr3, iArr2);
    }

    public static void OooOO0o(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[10];
        p697oO0OOo0o.Oooo0.OooOO0(iArr, iArr3);
        while (true) {
            OooO0oo(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                p697oO0OOo0o.Oooo0.OooOO0(iArr2, iArr3);
            }
        }
    }

    public static void OooOOO0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p697oO0OOo0o.Oooo0.OooOO0O(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - (4294967295L & ((long) (-2147483647)));
            iArr3[0] = (int) j;
            if ((j >> 32) == 0) {
                return;
            }
            p399o0Oo00oo.o00000OO.OooO0oo(5, iArr3, 1);
        }
    }

    @Override // p357o0OOOo0O.o0OOO0o
    public Object OooO00o(p357o0OOOo0O.o00oO0o o00oo0o2) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(o00oo0o2);
    }
}
