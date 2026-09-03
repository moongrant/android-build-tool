package androidx.compose.compiler.plugins.kotlin.lower;

import com.facebook.internal.security.CertificateUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0003J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0018"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/PathPartInfo;", "", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "parent", "getParent", "()Landroidx/compose/compiler/plugins/kotlin/lower/PathPartInfo;", "setParent", "(Landroidx/compose/compiler/plugins/kotlin/lower/PathPartInfo;)V", "prev", "getPrev", "setPrev", "print", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "pathSeparator", "siblingSeparator", "toString", "Companion", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDurableKeyVisitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurableKeyVisitor.kt\nandroidx/compose/compiler/plugins/kotlin/lower/PathPartInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
public final class PathPartInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PathPartInfo ROOT = new PathPartInfo("ROOT");

    @NotNull
    private final String key;

    @Nullable
    private PathPartInfo parent;

    @Nullable
    private PathPartInfo prev;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/PathPartInfo$Companion;", "", "()V", "ROOT", "Landroidx/compose/compiler/plugins/kotlin/lower/PathPartInfo;", "getROOT", "()Landroidx/compose/compiler/plugins/kotlin/lower/PathPartInfo;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PathPartInfo getROOT() {
            return PathPartInfo.ROOT;
        }
    }

    public PathPartInfo(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    public static /* synthetic */ void print$default(PathPartInfo pathPartInfo, StringBuilder sb, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "/";
        }
        if ((i & 4) != 0) {
            str2 = CertificateUtil.DELIMITER;
        }
        pathPartInfo.print(sb, str, str2);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final PathPartInfo getParent() {
        return this.parent;
    }

    @Nullable
    public final PathPartInfo getPrev() {
        return this.prev;
    }

    public final void print(@NotNull StringBuilder builder, @NotNull String pathSeparator, @NotNull String siblingSeparator) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(pathSeparator, "pathSeparator");
        Intrinsics.checkNotNullParameter(siblingSeparator, "siblingSeparator");
        if (Intrinsics.areEqual(this, ROOT)) {
            builder.append("<ROOT>");
            return;
        }
        PathPartInfo pathPartInfo = this;
        while (!Intrinsics.areEqual(pathPartInfo, ROOT)) {
            builder.append(pathSeparator);
            builder.append(pathPartInfo.key);
            String str = pathPartInfo.key;
            int i = 0;
            while (true) {
                PathPartInfo pathPartInfo2 = pathPartInfo.prev;
                if (pathPartInfo2 == null) {
                    break;
                }
                if (Intrinsics.areEqual(pathPartInfo2 != null ? pathPartInfo2.key : null, str)) {
                    i++;
                }
                pathPartInfo = pathPartInfo.prev;
                Intrinsics.checkNotNull(pathPartInfo);
            }
            if (i > 0) {
                builder.append(siblingSeparator);
                builder.append(i);
            }
            pathPartInfo = pathPartInfo.parent;
            if (pathPartInfo == null) {
                pathPartInfo = ROOT;
            }
        }
    }

    public final void setParent(@Nullable PathPartInfo pathPartInfo) {
        this.parent = pathPartInfo;
    }

    public final void setPrev(@Nullable PathPartInfo pathPartInfo) {
        this.prev = pathPartInfo;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print$default(this, sb, null, null, 6, null);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().also { print(it) }.toString()");
        return string;
    }
}
