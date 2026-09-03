package androidx.compose.compiler.plugins.kotlin.inference;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0002\u0010\fJ-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0002\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/ErrorReporter;", "Node", "", "log", "", "node", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(Ljava/lang/Object;Ljava/lang/String;)V", "reportCallError", "expected", "received", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "reportParameterError", "index", "", "(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;)V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ErrorReporter<Node> {
    void log(@Nullable Node node, @NotNull String message);

    void reportCallError(Node node, @NotNull String expected, @NotNull String received);

    void reportParameterError(Node node, int index, @NotNull String expected, @NotNull String received);
}
