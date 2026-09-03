package p384o0OOooO0;

import com.opensource.svgaplayer.proto.AudioEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f44327OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f44328OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Integer f44329OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Integer f44330OooO0Oo;

    public o0OoOo0(@NotNull AudioEntity audioItem) {
        Intrinsics.checkNotNullParameter(audioItem, "audioItem");
        String str = audioItem.audioKey;
        Integer num = audioItem.startFrame;
        this.f44327OooO00o = num == null ? 0 : num.intValue();
        Integer num2 = audioItem.endFrame;
        this.f44328OooO0O0 = num2 != null ? num2.intValue() : 0;
        Integer num3 = audioItem.startTime;
        if (num3 != null) {
            num3.intValue();
        }
        Integer num4 = audioItem.totalTime;
        if (num4 == null) {
            return;
        }
        num4.intValue();
    }
}
