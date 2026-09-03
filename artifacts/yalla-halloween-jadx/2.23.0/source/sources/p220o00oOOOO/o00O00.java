package p220o00oOOOO;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.common.base.OooO;
import com.google.common.base.OooO0OO;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p636o0ooOO.O0000000;
import p636o0ooOO.O0OO00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O00 extends O0OO00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f39745OooO0OO = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CharsetDecoder f39746OooO00o = OooO.f19059OooO0OO.newDecoder();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CharsetDecoder f39747OooO0O0 = OooO.f19058OooO0O0.newDecoder();

    @Override // p636o0ooOO.O0OO00
    public final Metadata OooO0O0(O0000000 o0000000, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f39747OooO0O0;
        CharsetDecoder charsetDecoder2 = this.f39746OooO00o;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new IcyInfo(null, null, bArr));
        }
        Matcher matcher = f39745OooO0OO.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strOooO0O0 = OooO0OO.OooO0O0(strGroup);
                strOooO0O0.getClass();
                if (strOooO0O0.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strOooO0O0.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(str, str2, bArr));
    }
}
