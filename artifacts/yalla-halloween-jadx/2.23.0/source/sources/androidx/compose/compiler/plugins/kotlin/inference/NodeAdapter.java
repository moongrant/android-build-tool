package androidx.compose.compiler.plugins.kotlin.inference;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/NodeAdapter;", "Type", "Node", "", "containerOf", "node", "(Ljava/lang/Object;)Ljava/lang/Object;", "kindOf", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "(Ljava/lang/Object;)Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "referencedContainerOf", "schemeParameterIndexOf", "", "container", "(Ljava/lang/Object;Ljava/lang/Object;)I", "typeOf", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NodeAdapter<Type, Node> {
    Node containerOf(Node node);

    @NotNull
    NodeKind kindOf(Node node);

    @Nullable
    Node referencedContainerOf(Node node);

    int schemeParameterIndexOf(Node node, Node container);

    @Nullable
    Type typeOf(Node node);
}
