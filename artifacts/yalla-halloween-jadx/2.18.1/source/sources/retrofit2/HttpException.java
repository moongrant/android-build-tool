package retrofit2;

import com.zego.zegoavkit2.ZegoConstants;
import java.util.Objects;
import p660o0ooo0o0.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
public class HttpException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(oo0o0Oo<?> oo0o0oo) {
        super("HTTP " + oo0o0oo.f53906OooO00o.f51443OoooO00 + ZegoConstants.ZegoVideoDataAuxPublishingStream + oo0o0oo.f53906OooO00o.f51437Oooo);
        Objects.requireNonNull(oo0o0oo, "response == null");
        o00OOOO0 o00oooo1 = oo0o0oo.f53906OooO00o;
        int i = o00oooo1.f51443OoooO00;
        String str = o00oooo1.f51437Oooo;
    }
}
