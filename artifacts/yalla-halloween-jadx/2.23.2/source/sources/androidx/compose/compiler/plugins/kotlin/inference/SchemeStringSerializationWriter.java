package androidx.compose.compiler.plugins.kotlin.inference;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tR\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/SchemeStringSerializationWriter;", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "(Ljava/lang/StringBuilder;)V", "isNormal", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toString", "writeAnyParameters", "", "writeClose", "writeNumber", "number", "", "writeOpen", "writeResultPrefix", "writeToken", "token", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scheme.kt\nandroidx/compose/compiler/plugins/kotlin/inference/SchemeStringSerializationWriter\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,441:1\n1064#2,2:442\n*S KotlinDebug\n*F\n+ 1 Scheme.kt\nandroidx/compose/compiler/plugins/kotlin/inference/SchemeStringSerializationWriter\n*L\n305#1:442,2\n*E\n"})
public final class SchemeStringSerializationWriter {

    @NotNull
    private final StringBuilder builder;

    public SchemeStringSerializationWriter(@NotNull StringBuilder sb) {
        this.builder = sb;
    }

    private final boolean isNormal(String value) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= value.length()) {
                return true;
            }
            char cCharAt = value.charAt(i);
            if (cCharAt != '.' && !Character.isLetter(cCharAt)) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    @NotNull
    public String toString() {
        return this.builder.toString();
    }

    public final void writeAnyParameters() {
        this.builder.append('*');
    }

    public final void writeClose() {
        this.builder.append(']');
    }

    public final void writeNumber(int number) {
        if (number < 0) {
            this.builder.append('_');
        } else {
            this.builder.append(number);
        }
    }

    public final void writeOpen() {
        this.builder.append('[');
    }

    public final void writeResultPrefix() {
        this.builder.append(':');
    }

    public final void writeToken(@NotNull String token) {
        if (isNormal(token)) {
            this.builder.append(token);
            return;
        }
        this.builder.append(Typography.quote);
        this.builder.append(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(token, "\\", "\\\\", false, 4, (Object) null), "\"", "\\\"", false, 4, (Object) null));
        this.builder.append(Typography.quote);
    }
}
