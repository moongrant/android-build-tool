package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class RemovalCause {
    private static final /* synthetic */ RemovalCause[] $VALUES;
    public static final RemovalCause COLLECTED;
    public static final RemovalCause EXPIRED;
    public static final RemovalCause EXPLICIT;
    public static final RemovalCause REPLACED;
    public static final RemovalCause SIZE;

    public static enum OooO00o extends RemovalCause {
        public OooO00o() {
            super("EXPLICIT", 0, null);
        }
    }

    static {
        OooO00o oooO00o = new OooO00o();
        EXPLICIT = oooO00o;
        RemovalCause removalCause = new RemovalCause() { // from class: com.google.common.cache.RemovalCause.OooO0O0
        };
        REPLACED = removalCause;
        RemovalCause removalCause2 = new RemovalCause() { // from class: com.google.common.cache.RemovalCause.OooO0OO
        };
        COLLECTED = removalCause2;
        RemovalCause removalCause3 = new RemovalCause() { // from class: com.google.common.cache.RemovalCause.OooO0o
        };
        EXPIRED = removalCause3;
        RemovalCause removalCause4 = new RemovalCause() { // from class: com.google.common.cache.RemovalCause.OooO
        };
        SIZE = removalCause4;
        $VALUES = new RemovalCause[]{oooO00o, removalCause, removalCause2, removalCause3, removalCause4};
    }

    public RemovalCause(String str, int i, OooO00o oooO00o) {
        super(str, i);
    }

    public static RemovalCause valueOf(String str) {
        return (RemovalCause) Enum.valueOf(RemovalCause.class, str);
    }

    public static RemovalCause[] values() {
        return (RemovalCause[]) $VALUES.clone();
    }
}
