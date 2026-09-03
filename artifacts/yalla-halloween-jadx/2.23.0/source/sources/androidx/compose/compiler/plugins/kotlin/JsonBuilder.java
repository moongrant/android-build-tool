package androidx.compose.compiler.plugins.kotlin;

import com.facebook.appevents.UserDataStore;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J'\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0015J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0005J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u001f\u0010\u0018\u001a\u00020\u00102\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/JsonBuilder;", "", "sb", "Ljava/lang/Appendable;", "indent", "", "(Ljava/lang/Appendable;I)V", "hasEntry", "", "getHasEntry", "()Z", "setHasEntry", "(Z)V", "nonWordCharRegex", "Lkotlin/text/Regex;", "entry", "", "key", "", UserDataStore.FIRST_NAME, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "entryLiteral", "with", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJsonBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonBuilder.kt\nandroidx/compose/compiler/plugins/kotlin/JsonBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class JsonBuilder {
    private boolean hasEntry;
    private final int indent;

    @NotNull
    private final Regex nonWordCharRegex;

    @NotNull
    private final Appendable sb;

    public JsonBuilder(@NotNull Appendable sb, int i) {
        Intrinsics.checkNotNullParameter(sb, "sb");
        this.sb = sb;
        this.indent = i;
        this.nonWordCharRegex = new Regex("\\W");
    }

    private final void entryLiteral(String key, String value) throws IOException {
        Appendable appendable = this.sb;
        if (this.hasEntry) {
            Appendable appendableAppend = appendable.append(",");
            Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(value)");
            Intrinsics.checkNotNullExpressionValue(appendableAppend.append('\n'), "append('\\n')");
        }
        appendable.append(StringsKt__StringsJVMKt.repeat(ZegoConstants.ZegoVideoDataAuxPublishingStream, this.indent));
        appendable.append("\"" + this.nonWordCharRegex.replace(key, "") + "\"");
        appendable.append(": ");
        appendable.append(value);
        this.hasEntry = true;
    }

    public final void entry(@NotNull String key, int value) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        entryLiteral(key, String.valueOf(value));
    }

    public final boolean getHasEntry() {
        return this.hasEntry;
    }

    public final void setHasEntry(boolean z) {
        this.hasEntry = z;
    }

    public final void with(@NotNull Function1<? super JsonBuilder, Unit> fn) throws IOException {
        Intrinsics.checkNotNullParameter(fn, "fn");
        Appendable appendable = this.sb;
        Appendable appendableAppend = appendable.append("{");
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(value)");
        Intrinsics.checkNotNullExpressionValue(appendableAppend.append('\n'), "append('\\n')");
        fn.invoke(this);
        if (this.hasEntry) {
            Intrinsics.checkNotNullExpressionValue(appendable.append('\n'), "append('\\n')");
        }
        appendable.append("}");
    }

    public final void entry(@NotNull String key, @NotNull Function1<? super JsonBuilder, Unit> fn) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(fn, "fn");
        StringBuilder sb = new StringBuilder();
        new JsonBuilder(sb, this.indent + 1).with(fn);
        Unit unit = Unit.INSTANCE;
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        entryLiteral(key, string);
    }

    public /* synthetic */ JsonBuilder(Appendable appendable, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(appendable, (i2 & 2) != 0 ? 0 : i);
    }
}
