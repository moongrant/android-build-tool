package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.inference.Open;
import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/InferenceUnknownType;", "Landroidx/compose/compiler/plugins/kotlin/InferenceNodeType;", "()V", "equals", "", "other", "", "hashCode", "", "isTypeFor", "descriptor", "Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "toScheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "callContext", "Lorg/jetbrains/kotlin/resolve/calls/checkers/CallCheckerContext;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class InferenceUnknownType extends InferenceNodeType {
    public InferenceUnknownType() {
        super(null);
    }

    public boolean equals(@Nullable Object other) {
        return other == this;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.InferenceNodeType
    public boolean isTypeFor(@NotNull CallableDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return false;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.InferenceNodeType
    @NotNull
    public Scheme toScheme(@NotNull CallCheckerContext callContext) {
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        return new Scheme(new Open(-1, false, 2, null), null, null, false, 14, null);
    }
}
