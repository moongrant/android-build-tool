package org.bouncycastle.crypto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PasswordConverter {
    private static final /* synthetic */ PasswordConverter[] $VALUES;
    public static final PasswordConverter ASCII;
    public static final PasswordConverter PKCS12;
    public static final PasswordConverter UTF8;

    public static enum OooO00o extends PasswordConverter {
        public OooO00o() {
            super("ASCII", 0, null);
        }
    }

    static {
        OooO00o oooO00o = new OooO00o();
        ASCII = oooO00o;
        PasswordConverter passwordConverter = new PasswordConverter() { // from class: org.bouncycastle.crypto.PasswordConverter.OooO0O0
        };
        UTF8 = passwordConverter;
        PasswordConverter passwordConverter2 = new PasswordConverter() { // from class: org.bouncycastle.crypto.PasswordConverter.OooO0OO
        };
        PKCS12 = passwordConverter2;
        $VALUES = new PasswordConverter[]{oooO00o, passwordConverter, passwordConverter2};
    }

    public PasswordConverter(String str, int i, OooO00o oooO00o) {
        super(str, i);
    }

    public static PasswordConverter valueOf(String str) {
        return (PasswordConverter) Enum.valueOf(PasswordConverter.class, str);
    }

    public static PasswordConverter[] values() {
        return (PasswordConverter[]) $VALUES.clone();
    }
}
