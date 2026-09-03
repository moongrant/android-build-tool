package androidx.compose.compiler.plugins.kotlin;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u001f\u0010\u000b\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0002\b\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/CsvBuilder;", "", "writer", "Ljava/lang/Appendable;", "(Ljava/lang/Appendable;)V", "col", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "", "", "row", UserDataStore.FIRST_NAME, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJsonBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonBuilder.kt\nandroidx/compose/compiler/plugins/kotlin/CsvBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class CsvBuilder {

    @NotNull
    private final Appendable writer;

    public CsvBuilder(@NotNull Appendable writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.writer = writer;
    }

    public final void col(@NotNull String value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        Appendable appendable = this.writer;
        if (!(!StringsKt__StringsKt.contains$default((CharSequence) value, ',', false, 2, (Object) null))) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Illegal character ',' found: ", value).toString());
        }
        appendable.append(value);
        appendable.append(",");
    }

    public final void row(@NotNull Function1<? super CsvBuilder, Unit> fn) {
        Intrinsics.checkNotNullParameter(fn, "fn");
        Appendable appendable = this.writer;
        fn.invoke(this);
        Intrinsics.checkNotNullExpressionValue(appendable.append('\n'), "append('\\n')");
    }

    public final void col(int value) throws IOException {
        Appendable appendable = this.writer;
        appendable.append(String.valueOf(value));
        appendable.append(",");
    }

    public final void col(boolean value) throws IOException {
        Appendable appendable = this.writer;
        appendable.append(value ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        appendable.append(",");
    }
}
