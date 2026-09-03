package p333o0OO0Ooo;

import com.opensource.svgaplayer.proto.AudioEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f42422OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f42423OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Integer f42424OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Integer f42425OooO0Oo;

    public OooO0o(@NotNull AudioEntity audioItem) {
        Intrinsics.checkNotNullParameter(audioItem, "audioItem");
        String str = audioItem.audioKey;
        Integer num = audioItem.startFrame;
        this.f42422OooO00o = num == null ? 0 : num.intValue();
        Integer num2 = audioItem.endFrame;
        this.f42423OooO0O0 = num2 != null ? num2.intValue() : 0;
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
