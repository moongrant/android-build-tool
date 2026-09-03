package p345o0OOO0Oo;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p071o000O0o.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int[] f38134OooO = new int[3];

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final float[] f38135OooOO0 = {ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f, 1.0f};

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int[] f38136OooOO0O = new int[4];

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final float[] f38137OooOO0o = {ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.5f, 1.0f};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Paint f38139OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Paint f38140OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f38142OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f38143OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Path f38144OooO0oO = new Path();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Paint f38145OooO0oo = new Paint();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Paint f38138OooO00o = new Paint();

    public OooO0OO() {
        OooO00o(-16777216);
        this.f38145OooO0oo.setColor(0);
        Paint paint = new Paint(4);
        this.f38139OooO0O0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f38140OooO0OO = new Paint(paint);
    }

    public final void OooO00o(int i) {
        this.f38141OooO0Oo = OooO0o.OooO0o0(i, 68);
        this.f38143OooO0o0 = OooO0o.OooO0o0(i, 20);
        this.f38142OooO0o = OooO0o.OooO0o0(i, 0);
        this.f38138OooO00o.setColor(this.f38141OooO0Oo);
    }
}
