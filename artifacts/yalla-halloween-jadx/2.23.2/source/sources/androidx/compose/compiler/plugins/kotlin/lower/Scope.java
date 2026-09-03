package androidx.compose.compiler.plugins.kotlin.lower;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/Scope;", "", "owner", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "localValues", "Ljava/util/HashSet;", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "Lkotlin/collections/HashSet;", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;Ljava/util/HashSet;)V", "getLocalValues", "()Ljava/util/HashSet;", "getOwner", "()Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Scope {

    @NotNull
    private final HashSet<IrValueDeclaration> localValues;

    @Nullable
    private final IrFunction owner;

    /* JADX WARN: Illegal instructions before constructor call */
    public Scope() {
        IrFunction irFunction = null;
        this(irFunction, irFunction, 3, irFunction);
    }

    @NotNull
    public final HashSet<IrValueDeclaration> getLocalValues() {
        return this.localValues;
    }

    @Nullable
    public final IrFunction getOwner() {
        return this.owner;
    }

    public Scope(@Nullable IrFunction irFunction, @NotNull HashSet<IrValueDeclaration> hashSet) {
        this.owner = irFunction;
        this.localValues = hashSet;
    }

    public /* synthetic */ Scope(IrFunction irFunction, HashSet hashSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : irFunction, (i & 2) != 0 ? new HashSet() : hashSet);
    }
}
