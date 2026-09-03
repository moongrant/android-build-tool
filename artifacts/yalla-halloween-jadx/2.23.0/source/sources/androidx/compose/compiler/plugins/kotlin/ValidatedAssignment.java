package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.descriptors.FunctionDescriptor;
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall;
import org.jetbrains.kotlin.types.KotlinType;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ValidatedAssignment;", "", "validationType", "Landroidx/compose/compiler/plugins/kotlin/ValidationType;", "validationCall", "Lorg/jetbrains/kotlin/resolve/calls/model/ResolvedCall;", "uncheckedValidationCall", "assignment", "assignmentLambda", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "type", "Lorg/jetbrains/kotlin/types/KotlinType;", "name", "", "descriptor", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;", "(Landroidx/compose/compiler/plugins/kotlin/ValidationType;Lorg/jetbrains/kotlin/resolve/calls/model/ResolvedCall;Lorg/jetbrains/kotlin/resolve/calls/model/ResolvedCall;Lorg/jetbrains/kotlin/resolve/calls/model/ResolvedCall;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lorg/jetbrains/kotlin/types/KotlinType;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;)V", "getAssignment", "()Lorg/jetbrains/kotlin/resolve/calls/model/ResolvedCall;", "getAssignmentLambda", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;", "getName", "()Ljava/lang/String;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "getUncheckedValidationCall", "getValidationCall", "getValidationType", "()Landroidx/compose/compiler/plugins/kotlin/ValidationType;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ValidatedAssignment {

    @Nullable
    private final ResolvedCall<?> assignment;

    @Nullable
    private final FunctionDescriptor assignmentLambda;

    @NotNull
    private final DeclarationDescriptor descriptor;

    @NotNull
    private final String name;

    @NotNull
    private final KotlinType type;

    @Nullable
    private final ResolvedCall<?> uncheckedValidationCall;

    @Nullable
    private final ResolvedCall<?> validationCall;

    @NotNull
    private final ValidationType validationType;

    public ValidatedAssignment(@NotNull ValidationType validationType, @Nullable ResolvedCall<?> resolvedCall, @Nullable ResolvedCall<?> resolvedCall2, @Nullable ResolvedCall<?> resolvedCall3, @Nullable FunctionDescriptor functionDescriptor, @NotNull KotlinType type, @NotNull String name, @NotNull DeclarationDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(validationType, "validationType");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.validationType = validationType;
        this.validationCall = resolvedCall;
        this.uncheckedValidationCall = resolvedCall2;
        this.assignment = resolvedCall3;
        this.assignmentLambda = functionDescriptor;
        this.type = type;
        this.name = name;
        this.descriptor = descriptor;
    }

    @Nullable
    public final ResolvedCall<?> getAssignment() {
        return this.assignment;
    }

    @Nullable
    public final FunctionDescriptor getAssignmentLambda() {
        return this.assignmentLambda;
    }

    @NotNull
    public final DeclarationDescriptor getDescriptor() {
        return this.descriptor;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }

    @Nullable
    public final ResolvedCall<?> getUncheckedValidationCall() {
        return this.uncheckedValidationCall;
    }

    @Nullable
    public final ResolvedCall<?> getValidationCall() {
        return this.validationCall;
    }

    @NotNull
    public final ValidationType getValidationType() {
        return this.validationType;
    }
}
