package p085o000OooO;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import com.google.common.base.OooO0OO;
import com.google.common.base.OooOO0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p081o000OoOO.o00000OO;
import p081o000OoOO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0000O00 extends o0000Ooo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f35005OooO0OO = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CharsetDecoder f35006OooO00o = OooOO0.f18592OooO0OO.newDecoder();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CharsetDecoder f35007OooO0O0 = OooOO0.f18591OooO0O0.newDecoder();

    @Override // p081o000OoOO.o0000Ooo
    public final Metadata OooO0O0(o00000OO o00000oo2, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f35007OooO0O0;
        CharsetDecoder charsetDecoder2 = this.f35006OooO00o;
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
        Matcher matcher = f35005OooO0OO.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strOooO00o = OooO0OO.OooO00o(strGroup);
                strOooO00o.getClass();
                if (strOooO00o.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strOooO00o.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(str, str2, bArr));
    }
}
