package androidx.compose.compiler.plugins.kotlin.lower;

import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.collect.ReportItem;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004J'\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014¢\u0006\u0002\u0010\u0015J/\u0010\u0016\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014¢\u0006\u0002\u0010\u0019J'\u0010\u0018\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/DurableKeyVisitor;", "", "keys", "", "", "(Ljava/util/Set;)V", "current", "Landroidx/compose/compiler/plugins/kotlin/lower/PathPartInfo;", "parent", "sibling", "buildPath", "Lkotlin/Pair;", "", "prefix", "pathSeparator", "siblingSeparator", "enter", "T", "part", ReportItem.LogTypeBlock, "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "root", "(Ljava/util/Set;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "siblings", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DurableKeyVisitor {

    @NotNull
    private PathPartInfo current;

    @NotNull
    private Set<String> keys;

    @Nullable
    private PathPartInfo parent;

    @Nullable
    private PathPartInfo sibling;

    /* JADX WARN: Multi-variable type inference failed */
    public DurableKeyVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Pair buildPath$default(DurableKeyVisitor durableKeyVisitor, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "/";
        }
        if ((i & 4) != 0) {
            str3 = CertificateUtil.DELIMITER;
        }
        return durableKeyVisitor.buildPath(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object root$default(DurableKeyVisitor durableKeyVisitor, Set set, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            set = new LinkedHashSet();
        }
        return durableKeyVisitor.root(set, function0);
    }

    @NotNull
    public final Pair<String, Boolean> buildPath(@NotNull String prefix, @NotNull String pathSeparator, @NotNull String siblingSeparator) {
        StringBuilder sbOooO00o = o0o0Oo.OooO00o(prefix);
        this.current.print(sbOooO00o, pathSeparator, siblingSeparator);
        String string = sbOooO00o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return TuplesKt.to(string, Boolean.valueOf(this.keys.add(string)));
    }

    public final <T> T enter(@NotNull String part, @NotNull Function0<? extends T> block) {
        PathPartInfo pathPartInfo = this.current;
        PathPartInfo pathPartInfo2 = this.sibling;
        PathPartInfo pathPartInfo3 = this.parent;
        PathPartInfo pathPartInfo4 = new PathPartInfo(part);
        try {
            if (pathPartInfo3 != null && pathPartInfo2 == null) {
                pathPartInfo4.setParent(pathPartInfo3);
                this.sibling = pathPartInfo4;
                this.parent = null;
            } else if (pathPartInfo3 == null || pathPartInfo2 == null) {
                pathPartInfo4.setParent(pathPartInfo);
                this.parent = null;
            } else {
                pathPartInfo4.setPrev(pathPartInfo2);
                this.sibling = pathPartInfo4;
                this.parent = null;
            }
            this.current = pathPartInfo4;
            T tInvoke = block.invoke();
            this.current = pathPartInfo;
            this.parent = pathPartInfo3;
            return tInvoke;
        } catch (Throwable th) {
            this.current = pathPartInfo;
            this.parent = pathPartInfo3;
            throw th;
        }
    }

    public final <T> T root(@NotNull Set<String> keys, @NotNull Function0<? extends T> block) {
        Set<String> set = this.keys;
        PathPartInfo pathPartInfo = this.current;
        PathPartInfo pathPartInfo2 = this.parent;
        PathPartInfo pathPartInfo3 = this.sibling;
        try {
            this.keys = keys;
            this.current = PathPartInfo.INSTANCE.getROOT();
            this.parent = null;
            this.sibling = null;
            return (T) siblings(block);
        } finally {
            this.keys = set;
            this.current = pathPartInfo;
            this.parent = pathPartInfo2;
            this.sibling = pathPartInfo3;
        }
    }

    public final <T> T siblings(@NotNull Function0<? extends T> block) {
        PathPartInfo pathPartInfo = this.parent;
        if (pathPartInfo != null) {
            return block.invoke();
        }
        PathPartInfo pathPartInfo2 = this.sibling;
        PathPartInfo pathPartInfo3 = this.current;
        try {
            this.parent = pathPartInfo3;
            this.sibling = null;
            return block.invoke();
        } finally {
            this.parent = pathPartInfo;
            this.sibling = pathPartInfo2;
            this.current = pathPartInfo3;
        }
    }

    public DurableKeyVisitor(@NotNull Set<String> set) {
        this.keys = set;
        this.current = PathPartInfo.INSTANCE.getROOT();
    }

    public /* synthetic */ DurableKeyVisitor(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashSet() : set);
    }

    public final <T> T siblings(@NotNull String part, @NotNull final Function0<? extends T> block) {
        return (T) enter(part, new Function0<T>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyVisitor.siblings.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) DurableKeyVisitor.this.siblings(block);
            }
        });
    }
}
