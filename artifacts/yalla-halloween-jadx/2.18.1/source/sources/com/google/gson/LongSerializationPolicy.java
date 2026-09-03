package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class LongSerializationPolicy {
    private static final /* synthetic */ LongSerializationPolicy[] $VALUES;
    public static final LongSerializationPolicy DEFAULT;
    public static final LongSerializationPolicy STRING;

    public final enum OooO00o extends LongSerializationPolicy {
        public OooO00o() {
            super("DEFAULT", 0, null);
        }
    }

    static {
        OooO00o oooO00o = new OooO00o();
        DEFAULT = oooO00o;
        LongSerializationPolicy longSerializationPolicy = new LongSerializationPolicy() { // from class: com.google.gson.LongSerializationPolicy.OooO0O0
        };
        STRING = longSerializationPolicy;
        $VALUES = new LongSerializationPolicy[]{oooO00o, longSerializationPolicy};
    }

    public LongSerializationPolicy(String str, int i, OooO00o oooO00o) {
        super(str, i);
    }

    public static LongSerializationPolicy valueOf(String str) {
        return (LongSerializationPolicy) Enum.valueOf(LongSerializationPolicy.class, str);
    }

    public static LongSerializationPolicy[] values() {
        return (LongSerializationPolicy[]) $VALUES.clone();
    }
}
