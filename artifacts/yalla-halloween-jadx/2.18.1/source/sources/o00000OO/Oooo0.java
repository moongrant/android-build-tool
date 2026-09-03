package o00000OO;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final TextUtils.TruncateAt f27036OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CharSequence f27037OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27038OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f27039OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final TextPaint f27040OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final TextDirectionHeuristic f27041OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f27042OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Layout.Alignment f27043OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f27044OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f27045OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float f27046OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float f27047OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f27048OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f27049OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f27050OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f27051OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final int[] f27052OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f27053OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final int[] f27054OooOOoo;

    public Oooo0(@NotNull CharSequence text, int i, @NotNull TextPaint paint, int i2, @NotNull TextDirectionHeuristic textDir, @NotNull Layout.Alignment alignment, int i3, @Nullable TextUtils.TruncateAt truncateAt, int i4, float f, float f2, int i5, boolean z, boolean z2, int i6, int i7, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f27037OooO00o = text;
        this.f27038OooO0O0 = 0;
        this.f27039OooO0OO = i;
        this.f27040OooO0Oo = paint;
        this.f27042OooO0o0 = i2;
        this.f27041OooO0o = textDir;
        this.f27043OooO0oO = alignment;
        this.f27044OooO0oo = i3;
        this.f27036OooO = truncateAt;
        this.f27045OooOO0 = i4;
        this.f27046OooOO0O = f;
        this.f27047OooOO0o = f2;
        this.f27049OooOOO0 = i5;
        this.f27048OooOOO = z;
        this.f27050OooOOOO = z2;
        this.f27051OooOOOo = i6;
        this.f27053OooOOo0 = i7;
        this.f27052OooOOo = iArr;
        this.f27054OooOOoo = iArr2;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i >= 0 && i <= text.length())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
