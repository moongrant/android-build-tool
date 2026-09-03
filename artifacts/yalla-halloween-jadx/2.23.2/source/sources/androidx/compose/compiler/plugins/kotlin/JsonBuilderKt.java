package androidx.compose.compiler.plugins.kotlin;

import com.facebook.appevents.UserDataStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006\u001a#\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006\u001a#\u0010\t\u001a\u00020\u0001*\u00020\n2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006¨\u0006\f"}, d2 = {"appendCsv", "", "Ljava/lang/Appendable;", UserDataStore.FIRST_NAME, "Lkotlin/Function1;", "Landroidx/compose/compiler/plugins/kotlin/CsvBuilder;", "Lkotlin/ExtensionFunctionType;", "appendJson", "Landroidx/compose/compiler/plugins/kotlin/JsonBuilder;", "write", "Ljava/io/File;", "Ljava/io/OutputStreamWriter;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JsonBuilderKt {
    public static final void appendCsv(@NotNull Appendable appendable, @NotNull Function1<? super CsvBuilder, Unit> function1) {
        function1.invoke(new CsvBuilder(appendable));
    }

    public static final void appendJson(@NotNull Appendable appendable, @NotNull Function1<? super JsonBuilder, Unit> function1) throws IOException {
        new JsonBuilder(appendable, 1).with(function1);
    }

    public static final void write(@NotNull File file, @NotNull Function1<? super OutputStreamWriter, Unit> function1) throws IOException {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8);
        try {
            function1.invoke(outputStreamWriter);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStreamWriter, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(outputStreamWriter, th);
                throw th2;
            }
        }
    }
}
