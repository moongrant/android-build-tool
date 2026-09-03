package androidx.compose.compiler.plugins.kotlin.inference;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/SchemeStringSerializationReader;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;)V", "ch", "", "getCh", "()C", "current", "", "kind", "Landroidx/compose/compiler/plugins/kotlin/inference/ItemKind;", "getKind", "()Landroidx/compose/compiler/plugins/kotlin/inference/ItemKind;", "end", "", "expect", "number", "token", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scheme.kt\nandroidx/compose/compiler/plugins/kotlin/inference/SchemeStringSerializationReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,419:1\n1#2:420\n*E\n"})
final class SchemeStringSerializationReader {
    private int current;

    @NotNull
    private final String value;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ItemKind.values().length];
            try {
                iArr[ItemKind.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemKind.Close.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemKind.ResultPrefix.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ItemKind.AnyParameters.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ItemKind.Token.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ItemKind.Number.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ItemKind.End.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SchemeStringSerializationReader(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    private final char getCh() {
        if (this.current < this.value.length()) {
            return this.value.charAt(this.current);
        }
        return (char) 0;
    }

    public final void end() {
        if (getKind() == ItemKind.End) {
            return;
        }
        SchemeKt.schemeParseError();
        throw new KotlinNothingValueException();
    }

    public final void expect(@NotNull ItemKind kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind != ItemKind.Invalid) {
            if (getKind() != kind) {
                SchemeKt.schemeParseError();
                throw new KotlinNothingValueException();
            }
            switch (WhenMappings.$EnumSwitchMapping$0[getKind().ordinal()]) {
                case 1:
                    expect('[');
                    return;
                case 2:
                    expect(']');
                    return;
                case 3:
                    expect(':');
                    return;
                case 4:
                    expect('*');
                    return;
                case 5:
                    token();
                    return;
                case 6:
                    number();
                    return;
                case 7:
                    end();
                    return;
                default:
                    SchemeKt.schemeParseError();
                    throw new KotlinNothingValueException();
            }
        }
    }

    @NotNull
    public final ItemKind getKind() {
        char ch = getCh();
        if (ch == '_') {
            return ItemKind.Number;
        }
        if (ch == '[') {
            return ItemKind.Open;
        }
        if (ch == ']') {
            return ItemKind.Close;
        }
        if (ch == ':') {
            return ItemKind.ResultPrefix;
        }
        if (ch == '*') {
            return ItemKind.AnyParameters;
        }
        if (ch == '\"') {
            return ItemKind.Token;
        }
        if (Character.isLetter(ch)) {
            return ItemKind.Token;
        }
        if (Character.isDigit(ch)) {
            return ItemKind.Number;
        }
        return ch == 0 ? ItemKind.End : ItemKind.Invalid;
    }

    public final int number() throws SchemeParseError {
        if (getCh() == '_') {
            this.current++;
            return -1;
        }
        int i = this.current;
        while (Character.isDigit(getCh())) {
            this.current++;
        }
        try {
            return OooO00o.OooO00o(i, this.current, this.value);
        } catch (NumberFormatException unused) {
            SchemeKt.schemeParseError();
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public final String token() throws SchemeParseError {
        int i;
        int i2 = this.current;
        String str = "";
        if (getCh() == '\"') {
            i2 = this.current + 1;
            this.current = i2;
            while (getCh() != '\"' && getCh() != 0) {
                if (getCh() == '\\') {
                    str = str + ((Object) this.value.subSequence(i2, this.current));
                    i2 = this.current + 1;
                    this.current = i2;
                    if (getCh() != '\"' && getCh() != '\\') {
                        SchemeKt.schemeParseError();
                        throw new KotlinNothingValueException();
                    }
                    this.current++;
                } else {
                    this.current++;
                }
            }
            i = this.current;
            this.current = i + 1;
        } else {
            while (true) {
                char ch = getCh();
                if (!(ch == '.' || Character.isLetter(ch))) {
                    break;
                }
                this.current++;
            }
            i = this.current;
        }
        return str + ((Object) this.value.subSequence(i2, i));
    }

    private final void expect(char ch) throws SchemeParseError {
        if (this.current >= this.value.length() || this.value.charAt(this.current) != ch) {
            SchemeKt.schemeParseError();
            throw new KotlinNothingValueException();
        }
        this.current++;
    }
}
