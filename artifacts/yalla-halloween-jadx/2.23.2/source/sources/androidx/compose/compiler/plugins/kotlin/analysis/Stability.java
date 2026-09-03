package androidx.compose.compiler.plugins.kotlin.analysis;

import com.facebook.internal.AnalyticsEvents;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrTypeParameter;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0086\u0002J\u0017\u0010\u0003\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0086\u0002\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "", "()V", "plus", "other", "", "Certain", "Combined", "Companion", "Parameter", "Runtime", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Certain;", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Combined;", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Parameter;", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Runtime;", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Unknown;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Stability {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Stability Stable = new Certain(true);

    @NotNull
    private static final Stability Unstable = new Certain(false);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Certain;", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "stable", "", "(Z)V", "getStable", "()Z", "toString", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Certain extends Stability {
        private final boolean stable;

        public Certain(boolean z) {
            super(null);
            this.stable = z;
        }

        public final boolean getStable() {
            return this.stable;
        }

        @NotNull
        public String toString() {
            return this.stable ? "Stable" : "Unstable";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Combined;", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "elements", "", "(Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "toString", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Combined extends Stability {

        @NotNull
        private final List<Stability> elements;

        /* JADX WARN: Multi-variable type inference failed */
        public Combined(@NotNull List<? extends Stability> list) {
            super(null);
            this.elements = list;
        }

        @NotNull
        public final List<Stability> getElements() {
            return this.elements;
        }

        @NotNull
        public String toString() {
            return CollectionsKt___CollectionsKt.joinToString$default(this.elements, ",", null, null, 0, null, null, 62, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Companion;", "", "()V", "Stable", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "getStable", "()Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "Unstable", "getUnstable", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Stability getStable() {
            return Stability.Stable;
        }

        @NotNull
        public final Stability getUnstable() {
            return Stability.Unstable;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Parameter;", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "parameter", "Lorg/jetbrains/kotlin/ir/declarations/IrTypeParameter;", "(Lorg/jetbrains/kotlin/ir/declarations/IrTypeParameter;)V", "getParameter", "()Lorg/jetbrains/kotlin/ir/declarations/IrTypeParameter;", "toString", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Parameter extends Stability {

        @NotNull
        private final IrTypeParameter parameter;

        public Parameter(@NotNull IrTypeParameter irTypeParameter) {
            super(null);
            this.parameter = irTypeParameter;
        }

        @NotNull
        public final IrTypeParameter getParameter() {
            return this.parameter;
        }

        @NotNull
        public String toString() {
            return o000oOoO.OooO0O0("Parameter(", this.parameter.getName().asString(), ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Runtime;", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "(Lorg/jetbrains/kotlin/ir/declarations/IrClass;)V", "getDeclaration", "()Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "toString", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Runtime extends Stability {

        @NotNull
        private final IrClass declaration;

        public Runtime(@NotNull IrClass irClass) {
            super(null);
            this.declaration = irClass;
        }

        @NotNull
        public final IrClass getDeclaration() {
            return this.declaration;
        }

        @NotNull
        public String toString() {
            return o000oOoO.OooO0O0("Runtime(", this.declaration.getName().asString(), ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/analysis/Stability$Unknown;", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "(Lorg/jetbrains/kotlin/ir/declarations/IrClass;)V", "getDeclaration", "()Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "toString", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends Stability {

        @NotNull
        private final IrClass declaration;

        public Unknown(@NotNull IrClass irClass) {
            super(null);
            this.declaration = irClass;
        }

        @NotNull
        public final IrClass getDeclaration() {
            return this.declaration;
        }

        @NotNull
        public String toString() {
            return o000oOoO.OooO0O0("Uncertain(", this.declaration.getName().asString(), ")");
        }
    }

    private Stability() {
    }

    public /* synthetic */ Stability(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final Stability plus(@NotNull Stability other) {
        if (other instanceof Certain) {
            if (!((Certain) other).getStable()) {
                return other;
            }
        } else {
            if (!(this instanceof Certain)) {
                return new Combined(CollectionsKt.listOf((Object[]) new Stability[]{this, other}));
            }
            if (((Certain) this).getStable()) {
                return other;
            }
        }
        return this;
    }

    @NotNull
    public final Stability plus(@NotNull List<? extends Stability> other) {
        Iterator<? extends Stability> it = other.iterator();
        Stability stabilityPlus = this;
        while (it.hasNext()) {
            stabilityPlus = stabilityPlus.plus(it.next());
        }
        return stabilityPlus;
    }
}
