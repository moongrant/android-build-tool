package p246o00oo0o0;

import android.support.v4.media.session.OooO0o;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O00 extends o000OO0O {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Pattern f40722OooOO0 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Pattern f40723OooOO0O = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Pattern f40724OooOO0o = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code duplicated, block: B:28:0x009f A[PHI: r2
      0x009f: PHI (r2v15 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0095, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    @Nullable
    public static o00O00 OooO0O0(File file, long j, long j2, o000OO00 o000oo01) {
        File file2;
        long j3;
        String strGroup;
        File fileOooO0OO;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = f40723OooOO0O.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                strGroup.getClass();
                int i = o0O00.f40595OooO00o;
                int length = strGroup.length();
                int iEnd = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (strGroup.charAt(i3) == '%') {
                        i2++;
                    }
                }
                if (i2 != 0) {
                    int i4 = length - (i2 * 2);
                    StringBuilder sb = new StringBuilder(i4);
                    Matcher matcher2 = o0O00.f40594OooO.matcher(strGroup);
                    while (i2 > 0 && matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        char c = (char) Integer.parseInt(strGroup2, 16);
                        sb.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb.append(c);
                        iEnd = matcher2.end();
                        i2--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb.length() != i4) {
                        strGroup = null;
                    } else {
                        strGroup = sb.toString();
                    }
                }
            } else {
                matcher = f40722OooOO0.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileOooO0OO = null;
            } else {
                File parentFile = file.getParentFile();
                o00O000o.OooO0o0(parentFile);
                int i5 = o000oo01.OooO0Oo(strGroup).f40677OooO00o;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j4 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileOooO0OO = OooO0OO(parentFile, i5, j4, Long.parseLong(strGroup4));
                if (!file.renameTo(fileOooO0OO)) {
                    fileOooO0OO = null;
                }
            }
            if (fileOooO0OO == null) {
                return null;
            }
            file2 = fileOooO0OO;
            name = fileOooO0OO.getName();
        }
        Matcher matcher3 = f40724OooOO0o.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String strGroup5 = matcher3.group(1);
        strGroup5.getClass();
        String str = o000oo01.f40699OooO0O0.get(Integer.parseInt(strGroup5));
        if (str == null) {
            return null;
        }
        long length2 = j == -1 ? file2.length() : j;
        if (length2 == 0) {
            return null;
        }
        String strGroup6 = matcher3.group(2);
        strGroup6.getClass();
        long j5 = Long.parseLong(strGroup6);
        if (j2 == -9223372036854775807L) {
            String strGroup7 = matcher3.group(3);
            strGroup7.getClass();
            j3 = Long.parseLong(strGroup7);
        } else {
            j3 = j2;
        }
        return new o00O00(str, j5, length2, j3, file2);
    }

    public static File OooO0OO(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, OooO0o.OooO0O0(sb, j2, ".v3.exo"));
    }
}
