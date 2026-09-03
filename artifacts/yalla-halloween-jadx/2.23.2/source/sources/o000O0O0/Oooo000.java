package o000O0O0;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.model.SystemMessageModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo000 implements androidx.media3.exoplayer.mediacodec.OooO {
    public static long OooO0O0(String str, String str2, MessageIM.Message message, SystemMessageModel systemMessageModel) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        long time = message.getTime();
        Intrinsics.checkNotNull(systemMessageModel);
        return time;
    }

    @Override // androidx.media3.exoplayer.mediacodec.OooO
    public List OooO00o(String str, boolean z, boolean z2) {
        return MediaCodecUtil.OooO0o0(str, z, z2);
    }
}
