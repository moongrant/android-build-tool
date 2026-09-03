package androidx.renderscript;

/* JADX INFO: loaded from: classes.dex */
public enum Sampler$Value {
    NEAREST(0),
    LINEAR(1),
    LINEAR_MIP_LINEAR(2),
    LINEAR_MIP_NEAREST(5),
    WRAP(3),
    CLAMP(4),
    MIRRORED_REPEAT(6);

    public int mID;

    Sampler$Value(int i) {
        this.mID = i;
    }
}
