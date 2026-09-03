package retrofit2;

import com.zego.zegoavkit2.ZegoConstants;
import java.util.Objects;
import p634o0ooO0oO.o0oOOo;

/* JADX INFO: loaded from: classes5.dex */
public class HttpException extends RuntimeException {
    public HttpException(o0000O0O<?> o0000o0o2) {
        Objects.requireNonNull(o0000o0o2, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        o0oOOo o0oooo = o0000o0o2.f61108OooO00o;
        sb.append(o0oooo.f57345OooO0oO);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(o0oooo.f57343OooO0o);
        super(sb.toString());
        o0oOOo o0oooo2 = o0000o0o2.f61108OooO00o;
        int i = o0oooo2.f57345OooO0oO;
        String str = o0oooo2.f57343OooO0o;
    }
}
