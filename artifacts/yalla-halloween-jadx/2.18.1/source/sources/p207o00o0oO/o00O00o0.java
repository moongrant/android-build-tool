package p207o00o0oO;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap<String, String> f33292OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap<String, Boolean> f33293OooO0O0;

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
        HashMap<String, String> map2 = new HashMap<>();
        f33292OooO00o = map2;
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
        HashMap<String, Boolean> map3 = new HashMap<>();
        f33293OooO0O0 = map3;
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

    public static byte[] OooO0O0(Context context, String str) {
        FileInputStream fileInputStream;
        try {
            File file = new File(str);
            if (Build.VERSION.SDK_INT >= 29) {
                Uri uriOooO00o = o00O00OO.OooO00o(context, str);
                fileInputStream = uriOooO00o == null ? new FileInputStream(str) : new FileInputStream(context.getContentResolver().openFileDescriptor(uriOooO00o, "r").getFileDescriptor());
            } else {
                fileInputStream = new FileInputStream(file);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1000);
            byte[] bArr = new byte[1000];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    public static String OooO0OO(String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str) || !str.contains(".")) {
            strSubstring = "";
        } else {
            int iLastIndexOf = str.lastIndexOf(".");
            int length = str.length();
            if (str.contains("?")) {
                length = str.lastIndexOf("?");
            }
            if (iLastIndexOf <= -1 || iLastIndexOf > length) {
                strSubstring = "";
            } else {
                strSubstring = str.substring(iLastIndexOf, length);
            }
        }
        if (strSubstring.length() <= 5) {
            return strSubstring;
        }
        return (((long) 10) + ((long) (Math.random() * ((double) 99)))) + "";
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:43:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String OooO0Oo(Context context, String str) throws Throwable {
        InputStream inputStream;
        Uri uriOooO00o;
        String strOooO00o = null;
        strOooO00o = null;
        strOooO00o = null;
        InputStream inputStream2 = null;
        try {
            try {
                InputStream fileInputStream = (Build.VERSION.SDK_INT < 29 || (uriOooO00o = o00O00OO.OooO00o(context, str)) == null) ? new FileInputStream(str) : context.getContentResolver().openInputStream(uriOooO00o);
                try {
                    byte[] bArr = new byte[4];
                    fileInputStream.read(bArr, 0, 4);
                    strOooO00o = OooO00o(bArr);
                    fileInputStream.close();
                } catch (Exception e) {
                    inputStream = fileInputStream;
                    e = e;
                    try {
                        e.printStackTrace();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (TextUtils.isEmpty(strOooO00o)) {
                            return "";
                        }
                        return strOooO00o.toUpperCase();
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    inputStream2 = fileInputStream;
                    th = th2;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (Exception e4) {
            e = e4;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
        if (TextUtils.isEmpty(strOooO00o)) {
            return "";
        }
        return strOooO00o.toUpperCase();
    }

    public static boolean OooO0o0(String str) {
        Boolean bool = Boolean.FALSE;
        if (f33293OooO0O0.containsKey(OooO0OO(str).toLowerCase())) {
            bool = Boolean.TRUE;
        }
        return bool.booleanValue();
    }
}
