package androidx.paging;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OOo {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[LoadType.values().length];
        try {
            iArr[LoadType.REFRESH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoadType.PREPEND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LoadType.APPEND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
