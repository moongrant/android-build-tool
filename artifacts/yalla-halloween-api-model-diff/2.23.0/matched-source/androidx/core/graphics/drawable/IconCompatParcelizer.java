package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import com.facebook.internal.security.CertificateUtil;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f5301OooO00o = versionedParcel.OooOO0(iconCompat.f5301OooO00o, 1);
        byte[] bArrOooO0o = iconCompat.f5303OooO0OO;
        if (versionedParcel.OooO0oo(2)) {
            bArrOooO0o = versionedParcel.OooO0o();
        }
        iconCompat.f5303OooO0OO = bArrOooO0o;
        iconCompat.f5304OooO0Oo = versionedParcel.OooOO0o(iconCompat.f5304OooO0Oo, 3);
        iconCompat.f5306OooO0o0 = versionedParcel.OooOO0(iconCompat.f5306OooO0o0, 4);
        iconCompat.f5305OooO0o = versionedParcel.OooOO0(iconCompat.f5305OooO0o, 5);
        iconCompat.f5307OooO0oO = (ColorStateList) versionedParcel.OooOO0o(iconCompat.f5307OooO0oO, 6);
        String strOooOOO0 = iconCompat.f5300OooO;
        if (versionedParcel.OooO0oo(7)) {
            strOooOOO0 = versionedParcel.OooOOO0();
        }
        iconCompat.f5300OooO = strOooOOO0;
        String strOooOOO1 = iconCompat.f5309OooOO0;
        if (versionedParcel.OooO0oo(8)) {
            strOooOOO1 = versionedParcel.OooOOO0();
        }
        iconCompat.f5309OooOO0 = strOooOOO1;
        iconCompat.f5308OooO0oo = PorterDuff.Mode.valueOf(iconCompat.f5300OooO);
        switch (iconCompat.f5301OooO00o) {
            case -1:
                Parcelable parcelable = iconCompat.f5304OooO0Oo;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f5302OooO0O0 = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f5304OooO0Oo;
                if (parcelable2 != null) {
                    iconCompat.f5302OooO0O0 = parcelable2;
                } else {
                    byte[] bArr = iconCompat.f5303OooO0OO;
                    iconCompat.f5302OooO0O0 = bArr;
                    iconCompat.f5301OooO00o = 3;
                    iconCompat.f5306OooO0o0 = 0;
                    iconCompat.f5305OooO0o = bArr.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f5303OooO0OO, Charset.forName("UTF-16"));
                iconCompat.f5302OooO0O0 = str;
                if (iconCompat.f5301OooO00o == 2 && iconCompat.f5309OooOO0 == null) {
                    iconCompat.f5309OooOO0 = str.split(CertificateUtil.DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f5302OooO0O0 = iconCompat.f5303OooO0OO;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        iconCompat.f5300OooO = iconCompat.f5308OooO0oo.name();
        switch (iconCompat.f5301OooO00o) {
            case -1:
                iconCompat.f5304OooO0Oo = (Parcelable) iconCompat.f5302OooO0O0;
                break;
            case 1:
            case 5:
                iconCompat.f5304OooO0Oo = (Parcelable) iconCompat.f5302OooO0O0;
                break;
            case 2:
                iconCompat.f5303OooO0OO = ((String) iconCompat.f5302OooO0O0).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f5303OooO0OO = (byte[]) iconCompat.f5302OooO0O0;
                break;
            case 4:
            case 6:
                iconCompat.f5303OooO0OO = iconCompat.f5302OooO0O0.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f5301OooO00o;
        if (-1 != i) {
            versionedParcel.OooOo00(i, 1);
        }
        byte[] bArr = iconCompat.f5303OooO0OO;
        if (bArr != null) {
            versionedParcel.OooOOOO(2);
            versionedParcel.OooOOo0(bArr);
        }
        Parcelable parcelable = iconCompat.f5304OooO0Oo;
        if (parcelable != null) {
            versionedParcel.OooOOOO(3);
            versionedParcel.OooOo0(parcelable);
        }
        int i2 = iconCompat.f5306OooO0o0;
        if (i2 != 0) {
            versionedParcel.OooOo00(i2, 4);
        }
        int i3 = iconCompat.f5305OooO0o;
        if (i3 != 0) {
            versionedParcel.OooOo00(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f5307OooO0oO;
        if (colorStateList != null) {
            versionedParcel.OooOOOO(6);
            versionedParcel.OooOo0(colorStateList);
        }
        String str = iconCompat.f5300OooO;
        if (str != null) {
            versionedParcel.OooOOOO(7);
            versionedParcel.OooOo0O(str);
        }
        String str2 = iconCompat.f5309OooOO0;
        if (str2 != null) {
            versionedParcel.OooOOOO(8);
            versionedParcel.OooOo0O(str2);
        }
    }
}
