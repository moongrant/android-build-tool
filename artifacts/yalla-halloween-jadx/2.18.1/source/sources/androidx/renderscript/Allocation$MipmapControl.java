package androidx.renderscript;

/* JADX INFO: loaded from: classes.dex */
public enum Allocation$MipmapControl {
    MIPMAP_NONE(0),
    MIPMAP_FULL(1),
    MIPMAP_ON_SYNC_TO_TEXTURE(2);

    public int mID;

    Allocation$MipmapControl(int i) {
        this.mID = i;
    }
}
