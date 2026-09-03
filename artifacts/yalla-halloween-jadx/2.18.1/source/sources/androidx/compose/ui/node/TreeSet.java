package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/TreeSet;", "E", "Ljava/util/TreeSet;", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class TreeSet<E> extends java.util.TreeSet<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreeSet(@NotNull Comparator<? super E> comparator) {
        super(comparator);
        Intrinsics.checkNotNullParameter(comparator, "comparator");
    }
}
