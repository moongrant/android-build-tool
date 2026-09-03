package p022Oooo00O;

import androidx.camera.core.impl.UseCaseConfigFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int[] f672OooO00o;

    static {
        int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
        f672OooO00o = iArr;
        try {
            iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f672OooO00o[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f672OooO00o[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f672OooO00o[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f672OooO00o[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
