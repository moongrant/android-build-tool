package p193o00o0O00;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.UByte;
import p206o00o0o0o.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap<String, String> f33108OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap<String, Boolean> f33109OooO0O0;

    static {
        HashMap map = new HashMap();
        map.put("FFD8FF", "jpeg");
        map.put("FFD8FFE1", "jpg");
        map.put("FFD8FFE0", "jpg");
        map.put("FFD8FFE", "jpg");
        map.put("89504E47", "png");
        map.put("424D", "bmp");
        map.put("424D3620", "bmp");
        map.put("47494638", "gif");
        map.put("49492A00", "tif");
        map.put("52494646", "avi");
        map.put("41433130", "dwg");
        map.put("38425053", "psd");
        map.put("7B5C727466", "rtf");
        map.put("3C3F786D6C", "xml");
        map.put("68746D6C3E", "html");
        map.put("44656C69766572792D646174653A", "eml");
        map.put("D0CF11E0", "doc");
        map.put("D0CF11E0", "xls");
        map.put("5374616E64617264204A", "mdb");
        map.put("252150532D41646F6265", "ps");
        map.put("255044462D312E", "pdf");
        map.put("504B0304", "docx");
        map.put("504B0304", "xlsx");
        map.put("52617221", "rar");
        map.put("57415645", "wav");
        map.put("41564920", "avi");
        map.put("2E524D46", "rm");
        map.put("000001BA", "mpg");
        map.put("000001B3", "mpg");
        map.put("6D6F6F76", "mov");
        map.put("3026B2758E66CF11", "asf");
        map.put("4D546864", "mid");
        map.put("1F8B08", "gz");
        map.put("00000018", "heic");
        HashMap<String, String> map2 = new HashMap<>();
        f33108OooO00o = map2;
        map2.put("FFD8FFE1", "jpg");
        map2.put("FFD8FFE0", "jpg");
        map2.put("FFD8FF", "jpeg");
        map2.put("FFD8FFE", "jpg");
        map2.put("89504E47", "png");
        map2.put("424D", "bmp");
        map2.put("424D3620", "bmp");
        map2.put("47494638", "gif");
        map2.put("49492A00", "tif");
        map2.put("52494646", "avi");
        map2.put("00000018", "heic");
        HashMap<String, Boolean> map3 = new HashMap<>();
        f33109OooO0O0 = map3;
        Boolean bool = Boolean.TRUE;
        map3.put(".bmp", bool);
        map3.put(".jpg", bool);
        map3.put(".jpeg", bool);
        map3.put(".png", bool);
        map3.put(".gif", bool);
        map3.put(".webp", bool);
        map3.put(".ico", bool);
        map3.put(".tif", bool);
        map3.put(".psd", bool);
        map3.put(".svg", bool);
        map3.put(".heic", bool);
        map3.put(".ai", bool);
        map3.put(".hdri", bool);
        map3.put(".raw", bool);
        map3.put(".wmf", bool);
        map3.put(".flic", bool);
        map3.put(".emf", bool);
        map3.put(".pcx", bool);
        map3.put(".eps", bool);
        map3.put(".tga", bool);
        map3.put(".exif", bool);
        map3.put(".fpx", bool);
        map3.put(".dxf", bool);
        map3.put(".ufo", bool);
        map3.put(".cdr", bool);
        map3.put(".pcd", bool);
    }

    public static String OooO00o(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String upperCase = Integer.toHexString(b & UByte.MAX_VALUE).toUpperCase();
            if (upperCase.length() < 2) {
                sb.append(0);
            }
            sb.append(upperCase);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[LOOP:0: B:41:0x0077->B:91:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x00c7, please report this as an issue */
    public static boolean OooO0O0(Context context, Uri uri) throws Throwable {
        InputStream fileInputStream;
        String upperCase;
        Iterator<String> it;
        Boolean bool;
        String strSubstring;
        boolean z;
        InputStream fileInputStream2;
        String strOooO0O0 = o000Oo0.OooO0O0(context, uri);
        if (!TextUtils.isEmpty(strOooO0O0)) {
            Boolean bool2 = Boolean.FALSE;
            InputStream inputStream = null;
            strOooO00o = null;
            String strOooO00o = null;
            try {
                try {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            try {
                                fileInputStream = new FileInputStream(strOooO0O0);
                                z = true;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                fileInputStream = null;
                                z = false;
                            }
                            if (z) {
                                byte[] bArr = new byte[4];
                                fileInputStream.read(bArr, 0, 4);
                                strOooO00o = OooO00o(bArr);
                                fileInputStream.close();
                                if (TextUtils.isEmpty(strOooO00o)) {
                                    upperCase = "";
                                } else {
                                    upperCase = strOooO00o.toUpperCase();
                                }
                                it = f33108OooO00o.keySet().iterator();
                                while (it.hasNext()) {
                                    if (upperCase.indexOf(it.next()) == 0) {
                                        bool2 = Boolean.TRUE;
                                        break;
                                    }
                                }
                                if (bool2.booleanValue()) {
                                    bool = Boolean.FALSE;
                                    if (TextUtils.isEmpty(strOooO0O0) && strOooO0O0.contains(".")) {
                                        int iLastIndexOf = strOooO0O0.lastIndexOf(".");
                                        int length = strOooO0O0.length();
                                        if (strOooO0O0.contains("?")) {
                                            length = strOooO0O0.lastIndexOf("?");
                                        }
                                        if (iLastIndexOf <= -1 || iLastIndexOf > length) {
                                            strSubstring = "";
                                        } else {
                                            strSubstring = strOooO0O0.substring(iLastIndexOf, length);
                                        }
                                    } else {
                                        strSubstring = "";
                                    }
                                    if (strSubstring.length() > 5) {
                                        strSubstring = (((long) 10) + ((long) (Math.random() * ((double) 99)))) + "";
                                    }
                                    if (f33109OooO0O0.containsKey(strSubstring.toLowerCase())) {
                                        bool = Boolean.TRUE;
                                    }
                                    if (bool.booleanValue()) {
                                        return true;
                                    }
                                }
                            } else {
                                try {
                                    try {
                                        Uri uriOooO0OO = o000Oo0.OooO0OO(context, strOooO0O0);
                                        fileInputStream2 = uriOooO0OO == null ? new FileInputStream(strOooO0O0) : context.getContentResolver().openInputStream(uriOooO0OO);
                                    } catch (Exception e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        if (fileInputStream != null) {
                                        }
                                        if (TextUtils.isEmpty(strOooO00o)) {
                                            upperCase = "";
                                        } else {
                                            upperCase = strOooO00o.toUpperCase();
                                        }
                                        it = f33108OooO00o.keySet().iterator();
                                        while (it.hasNext()) {
                                            if (upperCase.indexOf(it.next()) == 0) {
                                                bool2 = Boolean.TRUE;
                                                break;
                                            }
                                        }
                                        if (bool2.booleanValue()) {
                                            bool = Boolean.FALSE;
                                            if (TextUtils.isEmpty(strOooO0O0)) {
                                                strSubstring = "";
                                            } else {
                                                strSubstring = "";
                                            }
                                            if (strSubstring.length() > 5) {
                                                strSubstring = (((long) 10) + ((long) (Math.random() * ((double) 99)))) + "";
                                            }
                                            if (f33109OooO0O0.containsKey(strSubstring.toLowerCase())) {
                                                bool = Boolean.TRUE;
                                            }
                                            if (bool.booleanValue()) {
                                                return true;
                                            }
                                        }
                                        return false;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream = fileInputStream;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                            e = e2;
                            e.printStackTrace();
                            if (TextUtils.isEmpty(strOooO00o)) {
                                upperCase = "";
                            } else {
                                upperCase = strOooO00o.toUpperCase();
                            }
                            it = f33108OooO00o.keySet().iterator();
                            while (it.hasNext()) {
                                if (upperCase.indexOf(it.next()) == 0) {
                                    bool2 = Boolean.TRUE;
                                    break;
                                }
                            }
                            if (bool2.booleanValue()) {
                                bool = Boolean.FALSE;
                                if (TextUtils.isEmpty(strOooO0O0)) {
                                    strSubstring = "";
                                } else {
                                    strSubstring = "";
                                }
                                if (strSubstring.length() > 5) {
                                    strSubstring = (((long) 10) + ((long) (Math.random() * ((double) 99)))) + "";
                                }
                                if (f33109OooO0O0.containsKey(strSubstring.toLowerCase())) {
                                    bool = Boolean.TRUE;
                                }
                                if (bool.booleanValue()) {
                                    return true;
                                }
                            }
                        } else {
                            fileInputStream2 = new FileInputStream(strOooO0O0);
                        }
                        fileInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    fileInputStream = fileInputStream2;
                    byte[] bArr2 = new byte[4];
                    fileInputStream.read(bArr2, 0, 4);
                    strOooO00o = OooO00o(bArr2);
                } catch (Exception e5) {
                    e = e5;
                    fileInputStream = null;
                }
                if (TextUtils.isEmpty(strOooO00o)) {
                    upperCase = "";
                } else {
                    upperCase = strOooO00o.toUpperCase();
                }
                it = f33108OooO00o.keySet().iterator();
                while (it.hasNext()) {
                    if (upperCase.indexOf(it.next()) == 0) {
                        bool2 = Boolean.TRUE;
                        break;
                    }
                }
                if (bool2.booleanValue()) {
                    bool = Boolean.FALSE;
                    if (TextUtils.isEmpty(strOooO0O0)) {
                        strSubstring = "";
                    } else {
                        strSubstring = "";
                    }
                    if (strSubstring.length() > 5) {
                        strSubstring = (((long) 10) + ((long) (Math.random() * ((double) 99)))) + "";
                    }
                    if (f33109OooO0O0.containsKey(strSubstring.toLowerCase())) {
                        bool = Boolean.TRUE;
                    }
                    if (bool.booleanValue()) {
                        return true;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
        return false;
    }
}
