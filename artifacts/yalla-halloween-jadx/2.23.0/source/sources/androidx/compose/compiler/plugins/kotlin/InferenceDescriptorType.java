package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/InferenceDescriptorType;", "Landroidx/compose/compiler/plugins/kotlin/InferenceNodeType;", "descriptor", "Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "equals", "", "other", "", "hashCode", "", "isTypeFor", "toScheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "callContext", "Lorg/jetbrains/kotlin/resolve/calls/checkers/CallCheckerContext;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class InferenceDescriptorType extends InferenceNodeType {

    @NotNull
    private final CallableDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InferenceDescriptorType(@NotNull CallableDescriptor descriptor) {
        super(null);
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.descriptor = descriptor;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof InferenceDescriptorType) && Intrinsics.areEqual(((InferenceDescriptorType) other).descriptor.getOriginal(), this.descriptor.getOriginal());
    }

    @NotNull
    public final CallableDescriptor getDescriptor() {
        return this.descriptor;
    }

    public int hashCode() {
        return this.descriptor.getOriginal().hashCode() * 31;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.InferenceNodeType
    public boolean isTypeFor(@NotNull CallableDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Intrinsics.areEqual(this.descriptor, descriptor);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.InferenceNodeType
    @NotNull
    public Scheme toScheme(@NotNull CallCheckerContext callContext) {
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        return ComposableTargetCheckerKt.toScheme(this.descriptor, callContext);
    }
}
