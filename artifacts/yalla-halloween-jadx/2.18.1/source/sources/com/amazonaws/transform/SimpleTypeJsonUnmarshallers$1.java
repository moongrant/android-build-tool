package com.amazonaws.transform;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class SimpleTypeJsonUnmarshallers$1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int[] f11153OooO00o;

    static {
        int[] iArr = new int[TimestampFormat.values().length];
        f11153OooO00o = iArr;
        try {
            iArr[TimestampFormat.ISO_8601.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11153OooO00o[TimestampFormat.RFC_822.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11153OooO00o[TimestampFormat.UNIX_TIMESTAMP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
