package p318o0O0oo0;

import com.facebook.internal.security.CertificateUtil;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlin.text.Typography;
import p031OoooO0.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final TimeZone f42602OooO00o = TimeZone.getTimeZone("UTC");

    public static boolean OooO00o(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e1 A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TRY_LEAVE, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:86:0x0196, B:68:0x00f6, B:69:0x0111, B:70:0x0112, B:74:0x012e, B:76:0x013b, B:79:0x0144, B:81:0x0163, B:84:0x0173, B:85:0x0195, B:73:0x011d, B:88:0x01c6, B:89:0x01cd, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:86:0x0196, B:68:0x00f6, B:69:0x0111, B:70:0x0112, B:74:0x012e, B:76:0x013b, B:79:0x0144, B:81:0x0163, B:84:0x0173, B:85:0x0195, B:73:0x011d, B:88:0x01c6, B:89:0x01cd, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6 A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:86:0x0196, B:68:0x00f6, B:69:0x0111, B:70:0x0112, B:74:0x012e, B:76:0x013b, B:79:0x0144, B:81:0x0163, B:84:0x0173, B:85:0x0195, B:73:0x011d, B:88:0x01c6, B:89:0x01cd, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:105:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x011d, please report this as an issue */
    public static Date OooO0O0(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i;
        int iOooO0OO;
        int iOooO0OO2;
        int iOooO0OO3;
        int iOooO0OO4;
        int i2;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str3;
        String id;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iOooO0OO5 = OooO0OO(index, i3, str);
            if (OooO00o(str, i3, '-')) {
                i3++;
            }
            int i4 = i3 + 2;
            int iOooO0OO6 = OooO0OO(i3, i4, str);
            if (OooO00o(str, i4, '-')) {
                i4++;
            }
            int i5 = i4 + 2;
            int iOooO0OO7 = OooO0OO(i4, i5, str);
            boolean zOooO00o = OooO00o(str, i5, 'T');
            if (!zOooO00o && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iOooO0OO5, iOooO0OO6 - 1, iOooO0OO7);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zOooO00o) {
                int i6 = i5 + 1;
                int i7 = i6 + 2;
                iOooO0OO4 = OooO0OO(i6, i7, str);
                if (OooO00o(str, i7, ':')) {
                    i7++;
                }
                int i8 = i7 + 2;
                iOooO0OO = OooO0OO(i7, i8, str);
                if (OooO00o(str, i8, ':')) {
                    i8++;
                }
                if (str.length() <= i8 || (cCharAt2 = str.charAt(i8)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i = iOooO0OO4;
                    i5 = i8;
                } else {
                    i2 = i8 + 2;
                    iOooO0OO3 = OooO0OO(i8, i2, str);
                    if (iOooO0OO3 > 59 && iOooO0OO3 < 63) {
                        iOooO0OO3 = 59;
                    }
                    if (OooO00o(str, i2, '.')) {
                        int i9 = i2 + 1;
                        int length2 = i9 + 1;
                        while (true) {
                            if (length2 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(length2);
                            if (cCharAt3 < '0' || cCharAt3 > '9') {
                                break;
                                break;
                            }
                            length2++;
                        }
                        int iMin = Math.min(length2, i9 + 3);
                        iOooO0OO2 = OooO0OO(i9, iMin, str);
                        int i10 = iMin - i9;
                        if (i10 == 1) {
                            iOooO0OO2 *= 100;
                        } else if (i10 == 2) {
                            iOooO0OO2 *= 10;
                        }
                        i2 = length2;
                    } else {
                        iOooO0OO2 = 0;
                    }
                }
                if (str.length() > i2) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i2);
                timeZone = f42602OooO00o;
                if (cCharAt == 'Z') {
                    length = i2 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i2);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i2 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                        str3 = "GMT" + strSubstring;
                        timeZone = TimeZone.getTimeZone(str3);
                        id = timeZone.getID();
                        if (!id.equals(str3) && !id.replace(CertificateUtil.DELIMITER, "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iOooO0OO5);
                gregorianCalendar2.set(2, iOooO0OO6 - 1);
                gregorianCalendar2.set(5, iOooO0OO7);
                gregorianCalendar2.set(11, iOooO0OO4);
                gregorianCalendar2.set(12, iOooO0OO);
                gregorianCalendar2.set(13, iOooO0OO3);
                gregorianCalendar2.set(14, iOooO0OO2);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i = 0;
            iOooO0OO = 0;
            iOooO0OO2 = 0;
            iOooO0OO3 = 0;
            int i11 = i5;
            iOooO0OO4 = i;
            i2 = i11;
            if (str.length() > i2) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i2);
            timeZone = f42602OooO00o;
            if (cCharAt == 'Z') {
                length = i2 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i2);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i2 + strSubstring.length();
                if (!"+0000".equals(strSubstring)) {
                    str3 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str3);
                    id = timeZone.getID();
                    if (!id.equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iOooO0OO5);
            gregorianCalendar3.set(2, iOooO0OO6 - 1);
            gregorianCalendar3.set(5, iOooO0OO7);
            gregorianCalendar3.set(11, iOooO0OO4);
            gregorianCalendar3.set(12, iOooO0OO);
            gregorianCalendar3.set(13, iOooO0OO3);
            gregorianCalendar3.set(14, iOooO0OO2);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + Typography.quote;
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(o00Ooo.OooO00o("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static int OooO0OO(int i, int i2, String str) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
