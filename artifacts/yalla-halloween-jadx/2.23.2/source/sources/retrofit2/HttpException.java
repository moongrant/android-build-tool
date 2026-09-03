package retrofit2;

import com.zego.zegoavkit2.ZegoConstants;
import java.util.Objects;
import p641o0ooOO0o.o0O00o00;

/* JADX INFO: loaded from: classes5.dex */
public class HttpException extends RuntimeException {
    public HttpException(o0000O0<?> o0000o1) {
        Objects.requireNonNull(o0000o1, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        o0O00o00 o0o00o01 = o0000o1.f60546OooO00o;
        sb.append(o0o00o01.f57850OooO0oO);
        sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sb.append(o0o00o01.f57848OooO0o);
        super(sb.toString());
        o0O00o00 o0o00o02 = o0000o1.f60546OooO00o;
        int i = o0o00o02.f57850OooO0oO;
        String str = o0o00o02.f57848OooO0o;
    }
}
