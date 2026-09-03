package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.security.CertificateUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p688oO000OoO.o00Oo00;
import p688oO000OoO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oo000o extends BufferedReader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(@NotNull Reader reader) {
        super(reader);
        Intrinsics.checkNotNullParameter(reader, "reader");
    }

    @NotNull
    public final List<o0oOO> OooO00o() throws IOException {
        String line;
        ArrayList arrayList = new ArrayList();
        String line2 = readLine();
        while (line2 != null) {
            if (StringsKt.OooOoOO(line2, "-----BEGIN ")) {
                String strSubstring = line2.substring(11);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, '-', 0, false, 6, (Object) null);
                String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                if (iIndexOf$default > 0) {
                    String strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo("-----END ", strSubstring2);
                    StringBuffer stringBuffer = new StringBuffer();
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        line = readLine();
                        if (line == null) {
                            break;
                        }
                        Intrinsics.checkNotNull(line);
                        if (StringsKt__StringsKt.indexOf$default((CharSequence) line, CertificateUtil.DELIMITER, 0, false, 6, (Object) null) >= 0) {
                            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 0, false, 6, (Object) null);
                            String strSubstring3 = line.substring(0, iIndexOf$default2);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                            String strSubstring4 = line.substring(iIndexOf$default2 + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
                            int length = strSubstring4.length() - 1;
                            int i = 0;
                            boolean z = false;
                            while (i <= length) {
                                boolean z2 = Intrinsics.compare((int) strSubstring4.charAt(!z ? i : length), 32) <= 0;
                                if (z) {
                                    if (!z2) {
                                        break;
                                    }
                                    length--;
                                } else if (z2) {
                                    i++;
                                } else {
                                    z = true;
                                }
                            }
                            arrayList2.add(new o00Oo00(strSubstring3, strSubstring4.subSequence(i, length + 1).toString()));
                        } else {
                            if (StringsKt__StringsKt.indexOf$default((CharSequence) line, strOooO0Oo, 0, false, 6, (Object) null) != -1) {
                                break;
                            }
                            int length2 = line.length() - 1;
                            int i2 = 0;
                            boolean z3 = false;
                            while (i2 <= length2) {
                                boolean z4 = Intrinsics.compare((int) line.charAt(!z3 ? i2 : length2), 32) <= 0;
                                if (z3) {
                                    if (!z4) {
                                        break;
                                    }
                                    length2--;
                                } else if (z4) {
                                    i2++;
                                } else {
                                    z3 = true;
                                }
                            }
                            stringBuffer.append(line.subSequence(i2, length2 + 1).toString());
                        }
                    }
                    if (line == null) {
                        throw new IOException(p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " not found"));
                    }
                    arrayList.add(new o0oOO(strSubstring2, arrayList2, oO0OO0OO.OooO00o.OooO00o(stringBuffer.toString())));
                } else {
                    continue;
                }
            }
            line2 = readLine();
        }
        return arrayList;
    }
}
