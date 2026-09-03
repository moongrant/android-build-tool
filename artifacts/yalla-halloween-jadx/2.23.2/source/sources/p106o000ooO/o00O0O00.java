package p106o000ooO;

import android.support.v4.media.OooO00o;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.facebook.internal.security.CertificateUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p028Oooo0oO.o0oOO;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
public final class o00O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f35795OooO00o = {112, 114, 111, 0};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f35796OooO0O0 = {112, 114, 109, 0};

    @NonNull
    public static o00O00[] OooO(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull String str, int i) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new o00O00[0];
        }
        o00O00[] o00o00Arr = new o00O00[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iOooO0o0 = o00O00O.OooO0o0(byteArrayInputStream);
            int iOooO0o1 = o00O00O.OooO0o0(byteArrayInputStream);
            o00o00Arr[i2] = new o00O00(str, new String(o00O00O.OooO0O0(byteArrayInputStream, iOooO0o0), StandardCharsets.UTF_8), o00O00O.OooO0Oo(byteArrayInputStream, 4), iOooO0o1, (int) o00O00O.OooO0Oo(byteArrayInputStream, 4), (int) o00O00O.OooO0Oo(byteArrayInputStream, 4), new int[iOooO0o1], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            o00O00 o00o01 = o00o00Arr[i3];
            int iAvailable = byteArrayInputStream.available() - o00o01.f35780OooO0o;
            int iOooO0o2 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = o00o01.f35775OooO;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iOooO0o2 += o00O00O.OooO0o0(byteArrayInputStream);
                treeMap.put(Integer.valueOf(iOooO0o2), 1);
                for (int iOooO0o3 = o00O00O.OooO0o0(byteArrayInputStream); iOooO0o3 > 0; iOooO0o3--) {
                    o00O00O.OooO0o0(byteArrayInputStream);
                    int iOooO0Oo = (int) o00O00O.OooO0Oo(byteArrayInputStream, 1);
                    if (iOooO0Oo != 6 && iOooO0Oo != 7) {
                        while (iOooO0Oo > 0) {
                            o00O00O.OooO0Oo(byteArrayInputStream, 1);
                            for (int iOooO0Oo2 = (int) o00O00O.OooO0Oo(byteArrayInputStream, 1); iOooO0Oo2 > 0; iOooO0Oo2--) {
                                o00O00O.OooO0o0(byteArrayInputStream);
                            }
                            iOooO0Oo--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            o00o01.f35783OooO0oo = OooO0Oo(byteArrayInputStream, o00o01.f35781OooO0o0);
            int i4 = o00o01.f35782OooO0oO;
            BitSet bitSetValueOf = BitSet.valueOf(o00O00O.OooO0O0(byteArrayInputStream, ((((i4 * 2) + 8) - 1) & (-8)) / 8));
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bitSetValueOf.get(OooO0OO(2, i5, i4)) ? 2 : 0;
                if (bitSetValueOf.get(OooO0OO(4, i5, i4))) {
                    i6 |= 4;
                }
                if (i6 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i5));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i5), Integer.valueOf(i6 | num.intValue()));
                }
            }
        }
        return o00o00Arr;
    }

    @NonNull
    public static byte[] OooO00o(@NonNull o00O00[] o00o00Arr, @NonNull byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (o00O00 o00o01 : o00o00Arr) {
            length += (((((o00o01.f35782OooO0oO * 2) + 8) - 1) & (-8)) / 8) + (o00o01.f35781OooO0o0 * 2) + OooO0O0(o00o01.f35776OooO00o, o00o01.f35777OooO0O0, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + o00o01.f35780OooO0o;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, o00O0O0.f35790OooO0OO)) {
            int length2 = o00o00Arr.length;
            while (i < length2) {
                o00O00 o00o02 = o00o00Arr[i];
                OooOO0o(byteArrayOutputStream, o00o02, OooO0O0(o00o02.f35776OooO00o, o00o02.f35777OooO0O0, bArr));
                OooOOO(byteArrayOutputStream, o00o02);
                OooOO0O(byteArrayOutputStream, o00o02);
                OooOOO0(byteArrayOutputStream, o00o02);
                i++;
            }
        } else {
            for (o00O00 o00o03 : o00o00Arr) {
                OooOO0o(byteArrayOutputStream, o00o03, OooO0O0(o00o03.f35776OooO00o, o00o03.f35777OooO0O0, bArr));
            }
            int length3 = o00o00Arr.length;
            while (i < length3) {
                o00O00 o00o04 = o00o00Arr[i];
                OooOOO(byteArrayOutputStream, o00o04);
                OooOO0O(byteArrayOutputStream, o00o04);
                OooOOO0(byteArrayOutputStream, o00o04);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    @NonNull
    public static String OooO0O0(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        byte[] bArr2 = o00O0O0.f35793OooO0o0;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = o00O0O0.f35791OooO0Oo;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? CertificateUtil.DELIMITER : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(CertificateUtil.DELIMITER, "!");
            }
            if (CertificateUtil.DELIMITER.equals(obj)) {
                str2 = str2.replace("!", CertificateUtil.DELIMITER);
            }
            return str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(CertificateUtil.DELIMITER)) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return o0oOO.OooO0O0(o0o0Oo.OooO00o(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? CertificateUtil.DELIMITER : "!", str2);
        }
        if ("!".equals(obj)) {
            return str2.replace(CertificateUtil.DELIMITER, "!");
        }
        if (CertificateUtil.DELIMITER.equals(obj)) {
            str2 = str2.replace("!", CertificateUtil.DELIMITER);
        }
        return str2;
    }

    public static int OooO0OO(int i, int i2, int i3) {
        if (i == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw new IllegalStateException(OooO00o.OooO00o("Unexpected flag: ", i));
    }

    public static int[] OooO0Oo(@NonNull ByteArrayInputStream byteArrayInputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iOooO0o0 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iOooO0o0 += o00O00O.OooO0o0(byteArrayInputStream);
            iArr[i2] = iOooO0o0;
        }
        return iArr;
    }

    @NonNull
    public static o00O00[] OooO0o(@NonNull ByteArrayInputStream byteArrayInputStream, int i, o00O00[] o00o00Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new o00O00[0];
        }
        if (i != o00o00Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iOooO0o0 = o00O00O.OooO0o0(byteArrayInputStream);
            iArr[i2] = o00O00O.OooO0o0(byteArrayInputStream);
            strArr[i2] = new String(o00O00O.OooO0O0(byteArrayInputStream, iOooO0o0), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            o00O00 o00o01 = o00o00Arr[i3];
            if (!o00o01.f35777OooO0O0.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            o00o01.f35781OooO0o0 = i4;
            o00o01.f35783OooO0oo = OooO0Oo(byteArrayInputStream, i4);
        }
        return o00o00Arr;
    }

    @NonNull
    public static o00O00[] OooO0o0(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, o00O00[] o00o00Arr) throws IOException {
        byte[] bArr3 = o00O0O0.f35792OooO0o;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, o00O0O0.f35794OooO0oO)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iOooO0o0 = o00O00O.OooO0o0(fileInputStream);
            byte[] bArrOooO0OO = o00O00O.OooO0OO(fileInputStream, (int) o00O00O.OooO0Oo(fileInputStream, 4), (int) o00O00O.OooO0Oo(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOooO0OO);
            try {
                o00O00[] o00o00ArrOooO0oO = OooO0oO(byteArrayInputStream, bArr2, iOooO0o0, o00o00Arr);
                byteArrayInputStream.close();
                return o00o00ArrOooO0oO;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(o00O0O0.f35788OooO00o, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iOooO0Oo = (int) o00O00O.OooO0Oo(fileInputStream, 1);
        byte[] bArrOooO0OO2 = o00O00O.OooO0OO(fileInputStream, (int) o00O00O.OooO0Oo(fileInputStream, 4), (int) o00O00O.OooO0Oo(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrOooO0OO2);
        try {
            o00O00[] o00o00ArrOooO0o = OooO0o(byteArrayInputStream2, iOooO0Oo, o00o00Arr);
            byteArrayInputStream2.close();
            return o00o00ArrOooO0o;
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
    public static o00O00[] OooO0oO(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull byte[] bArr, int i, o00O00[] o00o00Arr) throws IOException {
        o00O00 o00o01;
        if (byteArrayInputStream.available() == 0) {
            return new o00O00[0];
        }
        if (i != o00o00Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            o00O00O.OooO0o0(byteArrayInputStream);
            String str = new String(o00O00O.OooO0O0(byteArrayInputStream, o00O00O.OooO0o0(byteArrayInputStream)), StandardCharsets.UTF_8);
            long jOooO0Oo = o00O00O.OooO0Oo(byteArrayInputStream, 4);
            int iOooO0o0 = o00O00O.OooO0o0(byteArrayInputStream);
            if (o00o00Arr.length <= 0) {
                o00o01 = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(CertificateUtil.DELIMITER);
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= o00o00Arr.length) {
                    o00o01 = null;
                    break;
                }
                if (o00o00Arr[i3].f35777OooO0O0.equals(strSubstring)) {
                    o00o01 = o00o00Arr[i3];
                    break;
                }
                i3++;
            }
            if (o00o01 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            o00o01.f35779OooO0Oo = jOooO0Oo;
            int[] iArrOooO0Oo = OooO0Oo(byteArrayInputStream, iOooO0o0);
            if (Arrays.equals(bArr, o00O0O0.f35793OooO0o0)) {
                o00o01.f35781OooO0o0 = iOooO0o0;
                o00o01.f35783OooO0oo = iArrOooO0Oo;
            }
        }
        return o00o00Arr;
    }

    @NonNull
    public static o00O00[] OooO0oo(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, o00O0O0.f35789OooO0O0)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iOooO0Oo = (int) o00O00O.OooO0Oo(fileInputStream, 1);
        byte[] bArrOooO0OO = o00O00O.OooO0OO(fileInputStream, (int) o00O00O.OooO0Oo(fileInputStream, 4), (int) o00O00O.OooO0Oo(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOooO0OO);
        try {
            o00O00[] o00o00ArrOooO = OooO(byteArrayInputStream, str, iOooO0Oo);
            byteArrayInputStream.close();
            return o00o00ArrOooO;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean OooOO0(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull byte[] bArr, @NonNull o00O00[] o00o00Arr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = o00O0O0.f35788OooO00o;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = o00O0O0.f35789OooO0O0;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrOooO00o = OooO00o(o00o00Arr, bArr3);
                o00O00O.OooO0o(byteArrayOutputStream, o00o00Arr.length, 1);
                o00O00O.OooO0o(byteArrayOutputStream, bArrOooO00o.length, 4);
                byte[] bArrOooO00o2 = o00O00O.OooO00o(bArrOooO00o);
                o00O00O.OooO0o(byteArrayOutputStream, bArrOooO00o2.length, 4);
                byteArrayOutputStream.write(bArrOooO00o2);
                return true;
            }
            byte[] bArr4 = o00O0O0.f35791OooO0Oo;
            if (Arrays.equals(bArr, bArr4)) {
                o00O00O.OooO0o(byteArrayOutputStream, o00o00Arr.length, 1);
                for (o00O00 o00o01 : o00o00Arr) {
                    int size = o00o01.f35775OooO.size() * 4;
                    String strOooO0O0 = OooO0O0(o00o01.f35776OooO00o, o00o01.f35777OooO0O0, bArr4);
                    o00O00O.OooO0oO(byteArrayOutputStream, strOooO0O0.getBytes(StandardCharsets.UTF_8).length);
                    o00O00O.OooO0oO(byteArrayOutputStream, o00o01.f35783OooO0oo.length);
                    o00O00O.OooO0o(byteArrayOutputStream, size, 4);
                    o00O00O.OooO0o(byteArrayOutputStream, o00o01.f35778OooO0OO, 4);
                    byteArrayOutputStream.write(strOooO0O0.getBytes(StandardCharsets.UTF_8));
                    Iterator<Integer> it = o00o01.f35775OooO.keySet().iterator();
                    while (it.hasNext()) {
                        o00O00O.OooO0oO(byteArrayOutputStream, it.next().intValue());
                        o00O00O.OooO0oO(byteArrayOutputStream, 0);
                    }
                    for (int i2 : o00o01.f35783OooO0oo) {
                        o00O00O.OooO0oO(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = o00O0O0.f35790OooO0OO;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrOooO00o3 = OooO00o(o00o00Arr, bArr5);
                o00O00O.OooO0o(byteArrayOutputStream, o00o00Arr.length, 1);
                o00O00O.OooO0o(byteArrayOutputStream, bArrOooO00o3.length, 4);
                byte[] bArrOooO00o4 = o00O00O.OooO00o(bArrOooO00o3);
                o00O00O.OooO0o(byteArrayOutputStream, bArrOooO00o4.length, 4);
                byteArrayOutputStream.write(bArrOooO00o4);
                return true;
            }
            byte[] bArr6 = o00O0O0.f35793OooO0o0;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            o00O00O.OooO0oO(byteArrayOutputStream, o00o00Arr.length);
            for (o00O00 o00o02 : o00o00Arr) {
                String strOooO0O1 = OooO0O0(o00o02.f35776OooO00o, o00o02.f35777OooO0O0, bArr6);
                o00O00O.OooO0oO(byteArrayOutputStream, strOooO0O1.getBytes(StandardCharsets.UTF_8).length);
                TreeMap<Integer, Integer> treeMap = o00o02.f35775OooO;
                o00O00O.OooO0oO(byteArrayOutputStream, treeMap.size());
                o00O00O.OooO0oO(byteArrayOutputStream, o00o02.f35783OooO0oo.length);
                o00O00O.OooO0o(byteArrayOutputStream, o00o02.f35778OooO0OO, 4);
                byteArrayOutputStream.write(strOooO0O1.getBytes(StandardCharsets.UTF_8));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    o00O00O.OooO0oO(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i3 : o00o02.f35783OooO0oo) {
                    o00O00O.OooO0oO(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            o00O00O.OooO0oO(byteArrayOutputStream2, o00o00Arr.length);
            int i4 = 2;
            int i5 = 2;
            for (o00O00 o00o03 : o00o00Arr) {
                o00O00O.OooO0o(byteArrayOutputStream2, o00o03.f35778OooO0OO, 4);
                o00O00O.OooO0o(byteArrayOutputStream2, o00o03.f35779OooO0Oo, 4);
                o00O00O.OooO0o(byteArrayOutputStream2, o00o03.f35782OooO0oO, 4);
                String strOooO0O2 = OooO0O0(o00o03.f35776OooO00o, o00o03.f35777OooO0O0, bArr2);
                int length2 = strOooO0O2.getBytes(StandardCharsets.UTF_8).length;
                o00O00O.OooO0oO(byteArrayOutputStream2, length2);
                i5 = i5 + 4 + 4 + 4 + 2 + (length2 * 1);
                byteArrayOutputStream2.write(strOooO0O2.getBytes(StandardCharsets.UTF_8));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            o00O0O0O o00o0o0o2 = new o00O0O0O(oOO00O.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(o00o0o0o2);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < o00o00Arr.length; i7++) {
                try {
                    o00O00 o00o04 = o00o00Arr[i7];
                    o00O00O.OooO0oO(byteArrayOutputStream3, i7);
                    o00O00O.OooO0oO(byteArrayOutputStream3, o00o04.f35781OooO0o0);
                    i6 = i6 + 2 + 2 + (o00o04.f35781OooO0o0 * 2);
                    OooOO0O(byteArrayOutputStream3, o00o04);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            o00O0O0O o00o0o0o3 = new o00O0O0O(oOO00O.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(o00o0o0o3);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < o00o00Arr.length) {
                try {
                    o00O00 o00o05 = o00o00Arr[i8];
                    Iterator<Map.Entry<Integer, Integer>> it3 = o00o05.f35775OooO.entrySet().iterator();
                    int iIntValue = i;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        OooOOO0(byteArrayOutputStream5, o00o05);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            OooOOO(byteArrayOutputStream6, o00o05);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            o00O00O.OooO0oO(byteArrayOutputStream4, i8);
                            int length3 = byteArray3.length + i4 + byteArray4.length;
                            int i10 = i9 + 2 + 4;
                            ArrayList arrayList4 = arrayList3;
                            o00O00O.OooO0o(byteArrayOutputStream4, length3, 4);
                            o00O00O.OooO0oO(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i9 = i10 + length3;
                            i8++;
                            arrayList3 = arrayList4;
                            i = 0;
                            i4 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i9 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray5.length);
            }
            o00O0O0O o00o0o0o4 = new o00O0O0O(oOO00O.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(o00o0o0o4);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList2.size() * 16));
            o00O00O.OooO0o(byteArrayOutputStream, arrayList2.size(), 4);
            int i11 = 0;
            while (i11 < arrayList2.size()) {
                o00O0O0O o00o0o0o5 = (o00O0O0O) arrayList2.get(i11);
                o00O00O.OooO0o(byteArrayOutputStream, o00o0o0o5.f35797OooO00o.OooO00o(), 4);
                o00O00O.OooO0o(byteArrayOutputStream, size2, 4);
                boolean z = o00o0o0o5.f35799OooO0OO;
                byte[] bArr7 = o00o0o0o5.f35798OooO0O0;
                if (z) {
                    long length4 = bArr7.length;
                    byte[] bArrOooO00o5 = o00O00O.OooO00o(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrOooO00o5);
                    o00O00O.OooO0o(byteArrayOutputStream, bArrOooO00o5.length, 4);
                    o00O00O.OooO0o(byteArrayOutputStream, length4, 4);
                    length = bArrOooO00o5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    o00O00O.OooO0o(byteArrayOutputStream, bArr7.length, 4);
                    o00O00O.OooO0o(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i11++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i12));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void OooOO0O(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull o00O00 o00o01) throws IOException {
        int iIntValue = 0;
        for (int i : o00o01.f35783OooO0oo) {
            Integer numValueOf = Integer.valueOf(i);
            o00O00O.OooO0oO(byteArrayOutputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    public static void OooOO0o(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull o00O00 o00o01, @NonNull String str) throws IOException {
        o00O00O.OooO0oO(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        o00O00O.OooO0oO(byteArrayOutputStream, o00o01.f35781OooO0o0);
        o00O00O.OooO0o(byteArrayOutputStream, o00o01.f35780OooO0o, 4);
        o00O00O.OooO0o(byteArrayOutputStream, o00o01.f35778OooO0OO, 4);
        o00O00O.OooO0o(byteArrayOutputStream, o00o01.f35782OooO0oO, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void OooOOO(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull o00O00 o00o01) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : o00o01.f35775OooO.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                o00O00O.OooO0oO(byteArrayOutputStream, iIntValue - i);
                o00O00O.OooO0oO(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static void OooOOO0(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull o00O00 o00o01) throws IOException {
        byte[] bArr = new byte[((((o00o01.f35782OooO0oO * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : o00o01.f35775OooO.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i = iIntValue2 & 2;
            int i2 = o00o01.f35782OooO0oO;
            if (i != 0) {
                int iOooO0OO = OooO0OO(2, iIntValue, i2);
                int i3 = iOooO0OO / 8;
                bArr[i3] = (byte) ((1 << (iOooO0OO % 8)) | bArr[i3]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iOooO0OO2 = OooO0OO(4, iIntValue, i2);
                int i4 = iOooO0OO2 / 8;
                bArr[i4] = (byte) ((1 << (iOooO0OO2 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }
}
