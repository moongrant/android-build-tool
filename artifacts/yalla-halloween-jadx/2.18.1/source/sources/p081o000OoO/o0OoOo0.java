package p081o000OoO;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f28345OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f28346OooO0O0;

    public o0OoOo0(@NonNull List<Integer> list, @NonNull List<Float> list2) {
        int size = list.size();
        this.f28345OooO00o = new int[size];
        this.f28346OooO0O0 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f28345OooO00o[i] = list.get(i).intValue();
            this.f28346OooO0O0[i] = list2.get(i).floatValue();
        }
    }

    public o0OoOo0(@ColorInt int i, @ColorInt int i2) {
        this.f28345OooO00o = new int[]{i, i2};
        this.f28346OooO0O0 = new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f};
    }

    public o0OoOo0(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
        this.f28345OooO00o = new int[]{i, i2, i3};
        this.f28346OooO0O0 = new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f, 1.0f};
    }
}
