package p155o00OoO;

import java.util.HashMap;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap<String, String> f32343OooO00o;

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
        f32343OooO00o = map2;
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
        HashMap map3 = new HashMap();
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
}
