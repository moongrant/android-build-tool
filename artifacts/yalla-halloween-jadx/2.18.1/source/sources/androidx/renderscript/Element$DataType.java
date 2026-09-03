package androidx.renderscript;

/* JADX INFO: loaded from: classes.dex */
public enum Element$DataType {
    NONE(0, 0),
    FLOAT_32(2, 4),
    FLOAT_64(3, 8),
    SIGNED_8(4, 1),
    SIGNED_16(5, 2),
    SIGNED_32(6, 4),
    SIGNED_64(7, 8),
    UNSIGNED_8(8, 1),
    UNSIGNED_16(9, 2),
    UNSIGNED_32(10, 4),
    UNSIGNED_64(11, 8),
    BOOLEAN(12, 1),
    UNSIGNED_5_6_5(13, 2),
    UNSIGNED_5_5_5_1(14, 2),
    UNSIGNED_4_4_4_4(15, 2),
    MATRIX_4X4(16, 64),
    MATRIX_3X3(17, 36),
    MATRIX_2X2(18, 16),
    RS_ELEMENT(1000),
    RS_TYPE(1001),
    RS_ALLOCATION(1002),
    RS_SAMPLER(1003),
    RS_SCRIPT(1004);

    public int mID;
    public int mSize;

    Element$DataType(int i, int i2) {
        this.mID = i;
        this.mSize = i2;
    }

    Element$DataType(int i) {
        this.mID = i;
        this.mSize = 4;
        int i2 = RenderScript.f9259OooO00o;
    }
}
