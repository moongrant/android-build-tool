package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import com.facebook.internal.security.CertificateUtil;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f7854OooO00o = versionedParcel.OooOO0O(iconCompat.f7854OooO00o, 1);
        byte[] bArrOooO0oO = iconCompat.f7856OooO0OO;
        if (versionedParcel.OooO(2)) {
            bArrOooO0oO = versionedParcel.OooO0oO();
        }
        iconCompat.f7856OooO0OO = bArrOooO0oO;
        iconCompat.f7857OooO0Oo = versionedParcel.OooOOO0(iconCompat.f7857OooO0Oo, 3);
        iconCompat.f7859OooO0o0 = versionedParcel.OooOO0O(iconCompat.f7859OooO0o0, 4);
        iconCompat.f7858OooO0o = versionedParcel.OooOO0O(iconCompat.f7858OooO0o, 5);
        iconCompat.f7860OooO0oO = (ColorStateList) versionedParcel.OooOOO0(iconCompat.f7860OooO0oO, 6);
        String strOooOOO = iconCompat.f7853OooO;
        if (versionedParcel.OooO(7)) {
            strOooOOO = versionedParcel.OooOOO();
        }
        iconCompat.f7853OooO = strOooOOO;
        String strOooOOO2 = iconCompat.f7862OooOO0;
        if (versionedParcel.OooO(8)) {
            strOooOOO2 = versionedParcel.OooOOO();
        }
        iconCompat.f7862OooOO0 = strOooOOO2;
        iconCompat.f7861OooO0oo = PorterDuff.Mode.valueOf(iconCompat.f7853OooO);
        switch (iconCompat.f7854OooO00o) {
            case -1:
                Parcelable parcelable = iconCompat.f7857OooO0Oo;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f7855OooO0O0 = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f7857OooO0Oo;
                if (parcelable2 != null) {
                    iconCompat.f7855OooO0O0 = parcelable2;
                } else {
                    byte[] bArr = iconCompat.f7856OooO0OO;
                    iconCompat.f7855OooO0O0 = bArr;
                    iconCompat.f7854OooO00o = 3;
                    iconCompat.f7859OooO0o0 = 0;
                    iconCompat.f7858OooO0o = bArr.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f7856OooO0OO, Charset.forName("UTF-16"));
                iconCompat.f7855OooO0O0 = str;
                if (iconCompat.f7854OooO00o == 2 && iconCompat.f7862OooOO0 == null) {
                    iconCompat.f7862OooOO0 = str.split(CertificateUtil.DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f7855OooO0O0 = iconCompat.f7856OooO0OO;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        iconCompat.f7853OooO = iconCompat.f7861OooO0oo.name();
        switch (iconCompat.f7854OooO00o) {
            case -1:
                iconCompat.f7857OooO0Oo = (Parcelable) iconCompat.f7855OooO0O0;
                break;
            case 1:
            case 5:
                iconCompat.f7857OooO0Oo = (Parcelable) iconCompat.f7855OooO0O0;
                break;
            case 2:
                iconCompat.f7856OooO0OO = ((String) iconCompat.f7855OooO0O0).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f7856OooO0OO = (byte[]) iconCompat.f7855OooO0O0;
                break;
            case 4:
            case 6:
                iconCompat.f7856OooO0OO = iconCompat.f7855OooO0O0.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f7854OooO00o;
        if (-1 != i) {
            versionedParcel.OooOo0(i, 1);
        }
        byte[] bArr = iconCompat.f7856OooO0OO;
        if (bArr != null) {
            versionedParcel.OooOOOo(2);
            versionedParcel.OooOOo(bArr);
        }
        Parcelable parcelable = iconCompat.f7857OooO0Oo;
        if (parcelable != null) {
            versionedParcel.OooOo0o(parcelable, 3);
        }
        int i2 = iconCompat.f7859OooO0o0;
        if (i2 != 0) {
            versionedParcel.OooOo0(i2, 4);
        }
        int i3 = iconCompat.f7858OooO0o;
        if (i3 != 0) {
            versionedParcel.OooOo0(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f7860OooO0oO;
        if (colorStateList != null) {
            versionedParcel.OooOo0o(colorStateList, 6);
        }
        String str = iconCompat.f7853OooO;
        if (str != null) {
            versionedParcel.OooOOOo(7);
            versionedParcel.OooOo(str);
        }
        String str2 = iconCompat.f7862OooOO0;
        if (str2 != null) {
            versionedParcel.OooOOOo(8);
            versionedParcel.OooOo(str2);
        }
    }
}
