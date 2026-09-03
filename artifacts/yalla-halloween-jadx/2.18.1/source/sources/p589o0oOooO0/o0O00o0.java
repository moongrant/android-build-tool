package p589o0oOooO0;

import com.opensource.svgaplayer.proto.AudioEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f47174OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f47175OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Integer f47176OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Integer f47177OooO0Oo;

    public o0O00o0(@NotNull AudioEntity audioEntity) {
        String str = audioEntity.audioKey;
        Integer num = audioEntity.startFrame;
        this.f47174OooO00o = num != null ? num.intValue() : 0;
        Integer num2 = audioEntity.endFrame;
        this.f47175OooO0O0 = num2 != null ? num2.intValue() : 0;
        Integer num3 = audioEntity.startTime;
        if (num3 != null) {
            num3.intValue();
        }
        Integer num4 = audioEntity.totalTime;
        if (num4 != null) {
            num4.intValue();
        }
    }
}
