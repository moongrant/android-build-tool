package androidx.renderscript;

/* JADX INFO: loaded from: classes.dex */
public enum Element$DataKind {
    USER(0),
    PIXEL_L(7),
    PIXEL_A(8),
    PIXEL_LA(9),
    PIXEL_RGB(10),
    PIXEL_RGBA(11),
    PIXEL_DEPTH(12),
    PIXEL_YUV(13);

    public int mID;

    Element$DataKind(int i) {
        this.mID = i;
    }
}
