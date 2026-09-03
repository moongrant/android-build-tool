package p088o000o00;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.facebook.internal.security.CertificateUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f28605OooO00o = {112, 114, 111, 0};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f28606OooO0O0 = {112, 114, 109, 0};

    @NonNull
    public static OooO0OO[] OooO(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i, OooO0OO[] oooO0OOArr) throws IOException {
        if (inputStream.available() == 0) {
            return new OooO0OO[0];
        }
        if (i != oooO0OOArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            OooO0o.OooO0o(inputStream);
            String strOooO0Oo = OooO0o.OooO0Oo(inputStream, OooO0o.OooO0o(inputStream));
            long jOooO0o0 = OooO0o.OooO0o0(inputStream, 4);
            int iOooO0o = OooO0o.OooO0o(inputStream);
            OooO0OO oooO0OO = null;
            if (oooO0OOArr.length > 0) {
                int iIndexOf = strOooO0Oo.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = strOooO0Oo.indexOf(CertificateUtil.DELIMITER);
                }
                String strSubstring = iIndexOf > 0 ? strOooO0Oo.substring(iIndexOf + 1) : strOooO0Oo;
                for (int i3 = 0; i3 < oooO0OOArr.length; i3++) {
                    if (oooO0OOArr[i3].f28591OooO0O0.equals(strSubstring)) {
                        oooO0OO = oooO0OOArr[i3];
                        break;
                    }
                }
            }
            if (oooO0OO == null) {
                throw new IllegalStateException(OooOo00.OooO0Oo("Missing profile key: ", strOooO0Oo));
            }
            oooO0OO.f28593OooO0Oo = jOooO0o0;
            int[] iArrOooO0o0 = OooO0o0(inputStream, iOooO0o);
            if (Arrays.equals(bArr, OooOo00.f28615OooO0o0)) {
                oooO0OO.f28595OooO0o0 = iOooO0o;
                oooO0OO.f28597OooO0oo = iArrOooO0o0;
            }
        }
        return oooO0OOArr;
    }

    @NonNull
    public static byte[] OooO00o(@NonNull OooO0OO[] oooO0OOArr, @NonNull byte[] bArr) throws IOException {
        int i = 0;
        int iOooO0oo = 0;
        for (OooO0OO oooO0OO : oooO0OOArr) {
            iOooO0oo += (((((oooO0OO.f28596OooO0oO * 2) + 8) - 1) & (-8)) / 8) + (oooO0OO.f28595OooO0o0 * 2) + OooO0o.OooO0oo(OooO0OO(oooO0OO.f28590OooO00o, oooO0OO.f28591OooO0O0, bArr)) + 16 + oooO0OO.f28594OooO0o;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iOooO0oo);
        if (Arrays.equals(bArr, OooOo00.f28612OooO0OO)) {
            int length = oooO0OOArr.length;
            while (i < length) {
                OooO0OO oooO0OO2 = oooO0OOArr[i];
                OooOOO(byteArrayOutputStream, oooO0OO2, OooO0OO(oooO0OO2.f28590OooO00o, oooO0OO2.f28591OooO0O0, bArr));
                OooOOOo(byteArrayOutputStream, oooO0OO2);
                OooOOO0(byteArrayOutputStream, oooO0OO2);
                OooOOOO(byteArrayOutputStream, oooO0OO2);
                i++;
            }
        } else {
            for (OooO0OO oooO0OO3 : oooO0OOArr) {
                OooOOO(byteArrayOutputStream, oooO0OO3, OooO0OO(oooO0OO3.f28590OooO00o, oooO0OO3.f28591OooO0O0, bArr));
            }
            int length2 = oooO0OOArr.length;
            while (i < length2) {
                OooO0OO oooO0OO4 = oooO0OOArr[i];
                OooOOOo(byteArrayOutputStream, oooO0OO4);
                OooOOO0(byteArrayOutputStream, oooO0OO4);
                OooOOOO(byteArrayOutputStream, oooO0OO4);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iOooO0oo) {
            return byteArrayOutputStream.toByteArray();
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("The bytes saved do not match expectation. actual=");
        sbOooO0o0.append(byteArrayOutputStream.size());
        sbOooO0o0.append(" expected=");
        sbOooO0o0.append(iOooO0oo);
        throw new IllegalStateException(sbOooO0o0.toString());
    }

    @NonNull
    public static String OooO0O0(@NonNull String str, @NonNull String str2) {
        if ("!".equals(str2)) {
            return str.replace(CertificateUtil.DELIMITER, "!");
        }
        return CertificateUtil.DELIMITER.equals(str2) ? str.replace("!", CertificateUtil.DELIMITER) : str;
    }

    @NonNull
    public static String OooO0OO(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String strOooO00o = OooOo00.OooO00o(bArr);
        if (str.length() <= 0) {
            return OooO0O0(str2, strOooO00o);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(CertificateUtil.DELIMITER)) {
            return OooO0O0(str2, strOooO00o);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0(str);
        sbOooO0o0.append(OooOo00.OooO00o(bArr));
        sbOooO0o0.append(str2);
        return sbOooO0o0.toString();
    }

    public static int OooO0Oo(int i, int i2, int i3) {
        if (i == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Unexpected flag: ", i));
    }

    public static byte[] OooO0o(@NonNull InputStream inputStream, @NonNull byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, OooO0o.OooO0O0(inputStream, bArr.length))) {
            return OooO0o.OooO0O0(inputStream, 4);
        }
        throw new IllegalStateException("Invalid magic");
    }

    public static int[] OooO0o0(@NonNull InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iOooO0o = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iOooO0o += OooO0o.OooO0o(inputStream);
            iArr[i2] = iOooO0o;
        }
        return iArr;
    }

    @NonNull
    public static OooO0OO[] OooO0oO(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, OooO0OO[] oooO0OOArr) throws IOException {
        byte[] bArr3 = OooOo00.f28614OooO0o;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, OooOo00.f28616OooO0oO)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iOooO0o = OooO0o.OooO0o(inputStream);
            byte[] bArrOooO0OO = OooO0o.OooO0OO(inputStream, (int) OooO0o.OooO0o0(inputStream, 4), (int) OooO0o.OooO0o0(inputStream, 4));
            if (inputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOooO0OO);
            try {
                OooO0OO[] oooO0OOArrOooO = OooO(byteArrayInputStream, bArr2, iOooO0o, oooO0OOArr);
                byteArrayInputStream.close();
                return oooO0OOArrOooO;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(OooOo00.f28610OooO00o, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iOooO0oO = OooO0o.OooO0oO(inputStream);
        byte[] bArrOooO0OO2 = OooO0o.OooO0OO(inputStream, (int) OooO0o.OooO0o0(inputStream, 4), (int) OooO0o.OooO0o0(inputStream, 4));
        if (inputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrOooO0OO2);
        try {
            OooO0OO[] oooO0OOArrOooO0oo = OooO0oo(byteArrayInputStream2, iOooO0oO, oooO0OOArr);
            byteArrayInputStream2.close();
            return oooO0OOArrOooO0oo;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @NonNull
    public static OooO0OO[] OooO0oo(@NonNull InputStream inputStream, int i, OooO0OO[] oooO0OOArr) throws IOException {
        if (inputStream.available() == 0) {
            return new OooO0OO[0];
        }
        if (i != oooO0OOArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iOooO0o = OooO0o.OooO0o(inputStream);
            iArr[i2] = OooO0o.OooO0o(inputStream);
            strArr[i2] = OooO0o.OooO0Oo(inputStream, iOooO0o);
        }
        for (int i3 = 0; i3 < i; i3++) {
            OooO0OO oooO0OO = oooO0OOArr[i3];
            if (!oooO0OO.f28591OooO0O0.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            oooO0OO.f28595OooO0o0 = i4;
            oooO0OO.f28597OooO0oo = OooO0o0(inputStream, i4);
        }
        return oooO0OOArr;
    }

    @NonNull
    public static OooO0OO[] OooOO0(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, OooOo00.f28611OooO0O0)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iOooO0oO = OooO0o.OooO0oO(inputStream);
        byte[] bArrOooO0OO = OooO0o.OooO0OO(inputStream, (int) OooO0o.OooO0o0(inputStream, 4), (int) OooO0o.OooO0o0(inputStream, 4));
        if (inputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOooO0OO);
        try {
            OooO0OO[] oooO0OOArrOooOO0O = OooOO0O(byteArrayInputStream, str, iOooO0oO);
            byteArrayInputStream.close();
            return oooO0OOArrOooOO0O;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    public static OooO0OO[] OooOO0O(@NonNull InputStream inputStream, @NonNull String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new OooO0OO[0];
        }
        OooO0OO[] oooO0OOArr = new OooO0OO[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iOooO0o = OooO0o.OooO0o(inputStream);
            int iOooO0o2 = OooO0o.OooO0o(inputStream);
            oooO0OOArr[i2] = new OooO0OO(str, OooO0o.OooO0Oo(inputStream, iOooO0o), OooO0o.OooO0o0(inputStream, 4), iOooO0o2, (int) OooO0o.OooO0o0(inputStream, 4), (int) OooO0o.OooO0o0(inputStream, 4), new int[iOooO0o2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            OooO0OO oooO0OO = oooO0OOArr[i3];
            int iAvailable = inputStream.available() - oooO0OO.f28594OooO0o;
            int iOooO0o3 = 0;
            while (inputStream.available() > iAvailable) {
                iOooO0o3 += OooO0o.OooO0o(inputStream);
                oooO0OO.f28589OooO.put(Integer.valueOf(iOooO0o3), 1);
                for (int iOooO0o4 = OooO0o.OooO0o(inputStream); iOooO0o4 > 0; iOooO0o4--) {
                    OooO0o.OooO0o(inputStream);
                    int iOooO0oO = OooO0o.OooO0oO(inputStream);
                    if (iOooO0oO != 6 && iOooO0oO != 7) {
                        while (iOooO0oO > 0) {
                            OooO0o.OooO0oO(inputStream);
                            for (int iOooO0oO2 = OooO0o.OooO0oO(inputStream); iOooO0oO2 > 0; iOooO0oO2--) {
                                OooO0o.OooO0o(inputStream);
                            }
                            iOooO0oO--;
                        }
                    }
                }
            }
            if (inputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            oooO0OO.f28597OooO0oo = OooO0o0(inputStream, oooO0OO.f28595OooO0o0);
            BitSet bitSetValueOf = BitSet.valueOf(OooO0o.OooO0O0(inputStream, ((((oooO0OO.f28596OooO0oO * 2) + 8) - 1) & (-8)) / 8));
            int i4 = 0;
            while (true) {
                int i5 = oooO0OO.f28596OooO0oO;
                if (i4 < i5) {
                    int i6 = bitSetValueOf.get(OooO0Oo(2, i4, i5)) ? 2 : 0;
                    if (bitSetValueOf.get(OooO0Oo(4, i4, i5))) {
                        i6 |= 4;
                    }
                    if (i6 != 0) {
                        Integer num = oooO0OO.f28589OooO.get(Integer.valueOf(i4));
                        if (num == null) {
                            num = 0;
                        }
                        oooO0OO.f28589OooO.put(Integer.valueOf(i4), Integer.valueOf(num.intValue() | i6));
                    }
                    i4++;
                }
            }
        }
        return oooO0OOArr;
    }

    public static boolean OooOO0o(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull OooO0OO[] oooO0OOArr) throws IOException {
        ArrayList arrayList;
        int length;
        if (!Arrays.equals(bArr, OooOo00.f28610OooO00o)) {
            byte[] bArr2 = OooOo00.f28611OooO0O0;
            if (Arrays.equals(bArr, bArr2)) {
                byte[] bArrOooO00o = OooO00o(oooO0OOArr, bArr2);
                OooO0o.OooOO0o(outputStream, oooO0OOArr.length);
                OooO0o.OooOO0(outputStream, bArrOooO00o.length, 4);
                byte[] bArrOooO00o2 = OooO0o.OooO00o(bArrOooO00o);
                OooO0o.OooOO0(outputStream, bArrOooO00o2.length, 4);
                outputStream.write(bArrOooO00o2);
                return true;
            }
            if (Arrays.equals(bArr, OooOo00.f28613OooO0Oo)) {
                OooO0o.OooOO0o(outputStream, oooO0OOArr.length);
                for (OooO0OO oooO0OO : oooO0OOArr) {
                    int size = oooO0OO.f28589OooO.size() * 4;
                    String strOooO0OO = OooO0OO(oooO0OO.f28590OooO00o, oooO0OO.f28591OooO0O0, OooOo00.f28613OooO0Oo);
                    OooO0o.OooOO0O(outputStream, OooO0o.OooO0oo(strOooO0OO));
                    OooO0o.OooOO0O(outputStream, oooO0OO.f28597OooO0oo.length);
                    OooO0o.OooOO0(outputStream, size, 4);
                    OooO0o.OooOO0(outputStream, oooO0OO.f28592OooO0OO, 4);
                    OooO0o.OooO(outputStream, strOooO0OO);
                    Iterator<Integer> it = oooO0OO.f28589OooO.keySet().iterator();
                    while (it.hasNext()) {
                        OooO0o.OooOO0O(outputStream, it.next().intValue());
                        OooO0o.OooOO0O(outputStream, 0);
                    }
                    for (int i : oooO0OO.f28597OooO0oo) {
                        OooO0o.OooOO0O(outputStream, i);
                    }
                }
                return true;
            }
            byte[] bArr3 = OooOo00.f28612OooO0OO;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrOooO00o3 = OooO00o(oooO0OOArr, bArr3);
                OooO0o.OooOO0o(outputStream, oooO0OOArr.length);
                OooO0o.OooOO0(outputStream, bArrOooO00o3.length, 4);
                byte[] bArrOooO00o4 = OooO0o.OooO00o(bArrOooO00o3);
                OooO0o.OooOO0(outputStream, bArrOooO00o4.length, 4);
                outputStream.write(bArrOooO00o4);
                return true;
            }
            if (!Arrays.equals(bArr, OooOo00.f28615OooO0o0)) {
                return false;
            }
            OooO0o.OooOO0O(outputStream, oooO0OOArr.length);
            for (OooO0OO oooO0OO2 : oooO0OOArr) {
                String strOooO0OO2 = OooO0OO(oooO0OO2.f28590OooO00o, oooO0OO2.f28591OooO0O0, OooOo00.f28615OooO0o0);
                OooO0o.OooOO0O(outputStream, OooO0o.OooO0oo(strOooO0OO2));
                OooO0o.OooOO0O(outputStream, oooO0OO2.f28589OooO.size());
                OooO0o.OooOO0O(outputStream, oooO0OO2.f28597OooO0oo.length);
                OooO0o.OooOO0(outputStream, oooO0OO2.f28592OooO0OO, 4);
                OooO0o.OooO(outputStream, strOooO0OO2);
                Iterator<Integer> it2 = oooO0OO2.f28589OooO.keySet().iterator();
                while (it2.hasNext()) {
                    OooO0o.OooOO0O(outputStream, it2.next().intValue());
                }
                for (int i2 : oooO0OO2.f28597OooO0oo) {
                    OooO0o.OooOO0O(outputStream, i2);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OooO0o.OooOO0O(byteArrayOutputStream, oooO0OOArr.length);
            int i3 = 2;
            int i4 = 2;
            for (OooO0OO oooO0OO3 : oooO0OOArr) {
                OooO0o.OooOO0(byteArrayOutputStream, oooO0OO3.f28592OooO0OO, 4);
                OooO0o.OooOO0(byteArrayOutputStream, oooO0OO3.f28593OooO0Oo, 4);
                OooO0o.OooOO0(byteArrayOutputStream, oooO0OO3.f28596OooO0oO, 4);
                String strOooO0OO3 = OooO0OO(oooO0OO3.f28590OooO00o, oooO0OO3.f28591OooO0O0, OooOo00.f28610OooO00o);
                int iOooO0oo = OooO0o.OooO0oo(strOooO0OO3);
                OooO0o.OooOO0O(byteArrayOutputStream, iOooO0oo);
                i4 = i4 + 4 + 4 + 4 + 2 + (iOooO0oo * 1);
                OooO0o.OooO(byteArrayOutputStream, strOooO0OO3);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i4 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
            }
            OooOo oooOo = new OooOo(OooO.DEX_FILES, byteArray, false);
            byteArrayOutputStream.close();
            arrayList2.add(oooOo);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i5 = 0;
            for (int i6 = 0; i6 < oooO0OOArr.length; i6++) {
                try {
                    OooO0OO oooO0OO4 = oooO0OOArr[i6];
                    OooO0o.OooOO0O(byteArrayOutputStream2, i6);
                    OooO0o.OooOO0O(byteArrayOutputStream2, oooO0OO4.f28595OooO0o0);
                    i5 = i5 + 2 + 2 + (oooO0OO4.f28595OooO0o0 * 2);
                    OooOOO0(byteArrayOutputStream2, oooO0OO4);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
            }
            OooOo oooOo2 = new OooOo(OooO.CLASSES, byteArray2, true);
            byteArrayOutputStream2.close();
            arrayList2.add(oooOo2);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < oooO0OOArr.length) {
                try {
                    OooO0OO oooO0OO5 = oooO0OOArr[i7];
                    Iterator<Map.Entry<Integer, Integer>> it3 = oooO0OO5.f28589OooO.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        OooOOOO(byteArrayOutputStream4, oooO0OO5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                        try {
                            OooOOOo(byteArrayOutputStream5, oooO0OO5);
                            byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                            byteArrayOutputStream5.close();
                            OooO0o.OooOO0O(byteArrayOutputStream3, i7);
                            int length2 = byteArray3.length + i3 + byteArray4.length;
                            int i9 = i8 + 2 + 4;
                            ArrayList arrayList4 = arrayList3;
                            OooO0o.OooOO0(byteArrayOutputStream3, length2, 4);
                            OooO0o.OooOO0O(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i8 = i9 + length2;
                            i7++;
                            arrayList3 = arrayList4;
                            i3 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream5.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream4.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray5.length);
            }
            OooOo oooOo3 = new OooOo(OooO.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(oooOo3);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList2.size() * 16));
            OooO0o.OooOO0(outputStream, arrayList2.size(), 4);
            int i10 = 0;
            while (i10 < arrayList2.size()) {
                OooOo oooOo4 = (OooOo) arrayList2.get(i10);
                OooO0o.OooOO0(outputStream, oooOo4.f28607OooO00o.OooO00o(), 4);
                OooO0o.OooOO0(outputStream, size2, 4);
                if (oooOo4.f28609OooO0OO) {
                    byte[] bArr4 = oooOo4.f28608OooO0O0;
                    long length3 = bArr4.length;
                    byte[] bArrOooO00o5 = OooO0o.OooO00o(bArr4);
                    arrayList = arrayList5;
                    arrayList.add(bArrOooO00o5);
                    OooO0o.OooOO0(outputStream, bArrOooO00o5.length, 4);
                    OooO0o.OooOO0(outputStream, length3, 4);
                    length = bArrOooO00o5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(oooOo4.f28608OooO0O0);
                    OooO0o.OooOO0(outputStream, oooOo4.f28608OooO0O0.length, 4);
                    OooO0o.OooOO0(outputStream, 0L, 4);
                    length = oooOo4.f28608OooO0O0.length;
                }
                size2 += (long) length;
                i10++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i11 = 0; i11 < arrayList6.size(); i11++) {
                outputStream.write((byte[]) arrayList6.get(i11));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void OooOOO(@NonNull OutputStream outputStream, @NonNull OooO0OO oooO0OO, @NonNull String str) throws IOException {
        OooO0o.OooOO0O(outputStream, OooO0o.OooO0oo(str));
        OooO0o.OooOO0O(outputStream, oooO0OO.f28595OooO0o0);
        OooO0o.OooOO0(outputStream, oooO0OO.f28594OooO0o, 4);
        OooO0o.OooOO0(outputStream, oooO0OO.f28592OooO0OO, 4);
        OooO0o.OooOO0(outputStream, oooO0OO.f28596OooO0oO, 4);
        OooO0o.OooO(outputStream, str);
    }

    public static void OooOOO0(@NonNull OutputStream outputStream, @NonNull OooO0OO oooO0OO) throws IOException {
        int iIntValue = 0;
        for (int i : oooO0OO.f28597OooO0oo) {
            Integer numValueOf = Integer.valueOf(i);
            OooO0o.OooOO0O(outputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    public static void OooOOOO(@NonNull OutputStream outputStream, @NonNull OooO0OO oooO0OO) throws IOException {
        byte[] bArr = new byte[((((oooO0OO.f28596OooO0oO * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : oooO0OO.f28589OooO.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int iOooO0Oo = OooO0Oo(2, iIntValue, oooO0OO.f28596OooO0oO);
                int i = iOooO0Oo / 8;
                bArr[i] = (byte) ((1 << (iOooO0Oo % 8)) | bArr[i]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iOooO0Oo2 = OooO0Oo(4, iIntValue, oooO0OO.f28596OooO0oO);
                int i2 = iOooO0Oo2 / 8;
                bArr[i2] = (byte) ((1 << (iOooO0Oo2 % 8)) | bArr[i2]);
            }
        }
        outputStream.write(bArr);
    }

    public static void OooOOOo(@NonNull OutputStream outputStream, @NonNull OooO0OO oooO0OO) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : oooO0OO.f28589OooO.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                OooO0o.OooOO0O(outputStream, iIntValue - i);
                OooO0o.OooOO0O(outputStream, 0);
                i = iIntValue;
            }
        }
    }
}
