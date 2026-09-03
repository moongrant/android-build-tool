package p306o0O0o0Oo;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0O0o0.OooO;
import o0O0o0.OooO0OO;
import o0OOOO0o.OooO0o;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o extends OooO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f36246OooO0OO = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CharsetDecoder f36247OooO00o = OooO0o.f38232OooO0OO.newDecoder();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CharsetDecoder f36248OooO0O0 = OooO0o.f38231OooO0O0.newDecoder();

    @Override // o0O0o0.OooO
    public final Metadata OooO0O0(OooO0OO oooO0OO, ByteBuffer byteBuffer) {
        String string;
        String str = null;
        try {
            string = this.f36247OooO00o.decode(byteBuffer).toString();
            this.f36247OooO00o.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            this.f36247OooO00o.reset();
            byteBuffer.rewind();
            try {
                string = this.f36248OooO0O0.decode(byteBuffer).toString();
                this.f36248OooO0O0.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f36248OooO0O0.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                this.f36248OooO0O0.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            this.f36247OooO00o.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f36246OooO0OO.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strOooo0 = o000OOo0.Oooo0(matcher.group(1));
            String strGroup = matcher.group(2);
            if (strOooo0 != null) {
                if (strOooo0.equals("streamurl")) {
                    str2 = strGroup;
                } else if (strOooo0.equals("streamtitle")) {
                    str = strGroup;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
