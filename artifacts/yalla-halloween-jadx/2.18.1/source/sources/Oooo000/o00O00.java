package Oooo000;

import android.content.Context;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p677o0oooo0o.O0OO00;
import p677o0oooo0o.oO0O00o0;
import p677o0oooo0o.oO0OO0O;
import p677o0oooo0o.oOO00000;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 {
    public static void OooO(File file) {
        if (file.isFile()) {
            file.delete();
            return;
        }
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getAbsolutePath());
            OooO(new File(p058o0000OoO.OooO.OooO00o(sb, File.separator, str)));
        }
    }

    public static float OooO00o(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float OooO0O0(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static void OooO0OO(StringBuffer stringBuffer, oO00000o.OooO0O0 oooO0O0, Hashtable hashtable) {
        if (!oooO0O0.OooOO0O()) {
            if (oooO0O0.OooO() != null) {
                OooO0Oo(stringBuffer, oooO0O0.OooO(), hashtable);
                return;
            }
            return;
        }
        oO00000o.OooO00o[] oooO00oArrOooOO0 = oooO0O0.OooOO0();
        boolean z = true;
        for (int i = 0; i != oooO00oArrOooOO0.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            OooO0Oo(stringBuffer, oooO00oArrOooOO0[i], hashtable);
        }
    }

    public static void OooO0Oo(StringBuffer stringBuffer, oO00000o.OooO00o oooO00o, Hashtable hashtable) {
        String str = (String) hashtable.get(oooO00o.f52371Oooo0o);
        if (str == null) {
            str = oooO00o.f52371Oooo0o.f52198Oooo0o;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(OooOOOO(oooO00o.f52372Oooo0oO));
    }

    public static String OooO0o(Context context) {
        p690oO000o.OooO0o oooO0oOooO00o = p690oO000o.OooO0o.OooO00o(context);
        Objects.requireNonNull(oooO0oOooO00o);
        if (!p690oO000o.OooO0o.f52693OooO0O0) {
            return null;
        }
        String str = p690oO000o.OooO0o.f52699OooO0oo;
        if (str != null) {
            return str;
        }
        oooO0oOooO00o.OooO0O0(0, null);
        if (p690oO000o.OooO0o.f52694OooO0OO == null) {
            Context context2 = p690oO000o.OooO0o.f52692OooO00o;
            p690oO000o.OooO0o.f52694OooO0OO = new p690oO000o.OooO(p690oO000o.OooO0o.f52691OooO, 0);
            context2.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, p690oO000o.OooO0o.f52694OooO0OO);
        }
        return p690oO000o.OooO0o.f52699OooO0oo;
    }

    public static boolean OooO0o0(oO00000o.OooO00o oooO00o, oO00000o.OooO00o oooO00o2) {
        if (oooO00o == oooO00o2) {
            return true;
        }
        return oooO00o != null && oooO00o2 != null && oooO00o.f52371Oooo0o.equals(oooO00o2.f52371Oooo0o) && OooO0oO(OooOOOO(oooO00o.f52372Oooo0oO)).equals(OooO0oO(OooOOOO(oooO00o2.f52372Oooo0oO)));
    }

    public static String OooO0oO(String str) {
        String strOooO0OO = oO000Oo.OooO0o.OooO0OO(str);
        int i = 1;
        if (strOooO0OO.length() > 0 && strOooO0OO.charAt(0) == '#') {
            try {
                Object objOooOO0o = oO0OO0O.OooOO0o(oO0OO0OO.OooO0OO.OooO00o(strOooO0OO.substring(1)));
                if (objOooOO0o instanceof oOO00000) {
                    strOooO0OO = oO000Oo.OooO0o.OooO0OO(((oOO00000) objOooOO0o).OooO0OO());
                }
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: " + e);
            }
        }
        if (strOooO0OO.length() > 1) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i3 >= strOooO0OO.length() || strOooO0OO.charAt(i2) != '\\' || strOooO0OO.charAt(i3) != ' ') {
                    break;
                }
                i2 += 2;
            }
            int length = strOooO0OO.length() - 1;
            while (true) {
                int i4 = length - 1;
                if (i4 <= 0 || strOooO0OO.charAt(i4) != '\\' || strOooO0OO.charAt(length) != ' ') {
                    break;
                }
                length -= 2;
            }
            if (i2 > 0 || length < strOooO0OO.length() - 1) {
                strOooO0OO = strOooO0OO.substring(i2, length + 1);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (strOooO0OO.length() != 0) {
            char cCharAt = strOooO0OO.charAt(0);
            stringBuffer.append(cCharAt);
            while (i < strOooO0OO.length()) {
                char cCharAt2 = strOooO0OO.charAt(i);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static boolean OooO0oo(File file) {
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !OooO0oo(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static int OooOO0(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f3 = ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f4 = ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f5 = (i & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f6 = ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f7 = ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f8 = ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f9 = (i2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float fOooO00o = OooO00o(f3);
        float fOooO00o2 = OooO00o(f4);
        float fOooO00o3 = OooO00o(f5);
        float fOooO00o4 = OooO00o(f7);
        float fOooO00o5 = OooO00o(f8);
        float fOooO00o6 = OooO00o(f9);
        float fOooO00o7 = OooO00o.OooO00o(f6, f2, f, f2);
        float fOooO00o8 = OooO00o.OooO00o(fOooO00o4, fOooO00o, f, fOooO00o);
        float fOooO00o9 = OooO00o.OooO00o(fOooO00o5, fOooO00o2, f, fOooO00o2);
        float fOooO00o10 = OooO00o.OooO00o(fOooO00o6, fOooO00o3, f, fOooO00o3);
        float fOooO0O0 = OooO0O0(fOooO00o8) * 255.0f;
        float fOooO0O1 = OooO0O0(fOooO00o9) * 255.0f;
        return Math.round(OooO0O0(fOooO00o10) * 255.0f) | (Math.round(fOooO0O0) << 16) | (Math.round(fOooO00o7 * 255.0f) << 24) | (Math.round(fOooO0O1) << 8);
    }

    public static boolean OooOO0O(String str) {
        int i = p168o00Ooo0.o0O0O00.f32652OooO00o;
        if (str != null) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (!Character.isWhitespace(str.charAt(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static List OooOO0o(File file, FileFilter fileFilter, boolean z) {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        if ((file != null && file.exists() && file.isDirectory()) && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (fileFilter.accept(file2)) {
                    arrayList.add(file2);
                }
                if (z && file2.isDirectory()) {
                    arrayList.addAll(OooOO0o(file2, fileFilter, true));
                }
            }
        }
        return arrayList;
    }

    public static o00OOOO0 OooOOO(o00OOOO0 redPointNumber, Integer num, float f, boolean z, long j, float f2, float f3, float f4, int i) {
        long j2;
        long j3;
        float f5 = (i & 2) != 0 ? (float) 7.5d : f;
        boolean z2 = (i & 8) != 0 ? false : z;
        boolean z3 = (i & 16) != 0;
        long jOooO0OO = (i & 32) != 0 ? p145o00Oo0.o00000OO.OooO0OO(4293415249L) : j;
        boolean z4 = (i & 64) != 0;
        float f6 = (i & 128) != 0 ? 0 : f2;
        float f7 = (i & 256) != 0 ? 0 : f3;
        long jOooO0OO2 = (i & 512) != 0 ? o0000O0O.o00Oo0.OooO0OO(11) : 0L;
        if ((i & 1024) != 0) {
            o00Oo0.o00000O0.OooO00o oooO00o = p145o00Oo0.o00000O0.f32063OooO0O0;
            j2 = p145o00Oo0.o00000O0.f32067OooO0o0;
        } else {
            j2 = 0;
        }
        float f8 = (i & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0 ? 0 : f4;
        if ((i & 4096) != 0) {
            o00Oo0.o00000O0.OooO00o oooO00o2 = p145o00Oo0.o00000O0.f32063OooO0O0;
            j3 = p145o00Oo0.o00000O0.f32067OooO0o0;
        } else {
            j3 = 0;
        }
        float f9 = (i & 8192) != 0 ? 1.4f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        Intrinsics.checkNotNullParameter(redPointNumber, "$this$redPointNumber");
        return o00OOO0O.OooO0O0(redPointNumber, new p254o00ooO0O.o000OO0O(f8, f6, f7, num, jOooO0OO2, f5, z3, j2, f9, z4, false, z2, jOooO0OO, j3));
    }

    public static o00OOOO0 OooOOO0(o00OOOO0 redPointCircle, boolean z, long j, float f, boolean z2, boolean z3, float f2, float f3, float f4, int i) {
        long j2;
        boolean z4 = (i & 1) != 0 ? true : z;
        long jOooO0OO = (i & 2) != 0 ? p145o00Oo0.o00000OO.OooO0OO(4293415249L) : j;
        float f5 = (i & 4) != 0 ? 5 : f;
        boolean z5 = (i & 8) != 0 ? false : z2;
        boolean z6 = (i & 16) != 0 ? false : z3;
        boolean z7 = (i & 32) != 0;
        float f6 = (i & 64) != 0 ? 0 : f2;
        float f7 = (i & 128) != 0 ? 0 : f3;
        float f8 = (i & 256) != 0 ? 0 : f4;
        if ((i & 512) != 0) {
            o00Oo0.o00000O0.OooO00o oooO00o = p145o00Oo0.o00000O0.f32063OooO0O0;
            j2 = p145o00Oo0.o00000O0.f32067OooO0o0;
        } else {
            j2 = 0;
        }
        Intrinsics.checkNotNullParameter(redPointCircle, "$this$redPointCircle");
        return o00OOO0O.OooO0O0(redPointCircle, new p254o00ooO0O.o000O0(z4, f8, f5, f6, f7, z7, z5, z6, jOooO0OO, j2));
    }

    public static String OooOOOO(oO0O00o0 oo0o00o0) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(oo0o00o0 instanceof oOO00000) || (oo0o00o0 instanceof O0OO00)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("#");
                byte[] bArrOooO0O0 = oO0OO0OO.OooO0OO.OooO0O0(oo0o00o0.OooO0O0().OooO0oo("DER"));
                int length = bArrOooO0O0.length;
                char[] cArr = new char[length];
                for (int i = 0; i != length; i++) {
                    cArr[i] = (char) (bArrOooO0O0[i] & UByte.MAX_VALUE);
                }
                sb.append(new String(cArr));
                stringBuffer.append(sb.toString());
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String strOooO0OO = ((oOO00000) oo0o00o0).OooO0OO();
            if (strOooO0OO.length() > 0 && strOooO0OO.charAt(0) == '#') {
                strOooO0OO = "\\" + strOooO0OO;
            }
            stringBuffer.append(strOooO0OO);
        }
        int length2 = stringBuffer.length();
        int i2 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i2 != length2) {
            if (stringBuffer.charAt(i2) == ',' || stringBuffer.charAt(i2) == '\"' || stringBuffer.charAt(i2) == '\\' || stringBuffer.charAt(i2) == '+' || stringBuffer.charAt(i2) == '=' || stringBuffer.charAt(i2) == '<' || stringBuffer.charAt(i2) == '>' || stringBuffer.charAt(i2) == ';') {
                stringBuffer.insert(i2, "\\");
                i2++;
                length2++;
            }
            i2++;
        }
        if (stringBuffer.length() > 0) {
            for (int i3 = 0; stringBuffer.length() > i3 && stringBuffer.charAt(i3) == ' '; i3 += 2) {
                stringBuffer.insert(i3, "\\");
            }
        }
        for (int length3 = stringBuffer.length() - 1; length3 >= 0 && stringBuffer.charAt(length3) == ' '; length3--) {
            stringBuffer.insert(length3, '\\');
        }
        return stringBuffer.toString();
    }
}
