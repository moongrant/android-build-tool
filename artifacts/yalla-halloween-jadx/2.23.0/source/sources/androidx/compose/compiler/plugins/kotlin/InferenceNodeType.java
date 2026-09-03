package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/InferenceNodeType;", "", "()V", "isTypeFor", "", "descriptor", "Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "toScheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "callContext", "Lorg/jetbrains/kotlin/resolve/calls/checkers/CallCheckerContext;", "Landroidx/compose/compiler/plugins/kotlin/InferenceDescriptorType;", "Landroidx/compose/compiler/plugins/kotlin/InferenceKotlinType;", "Landroidx/compose/compiler/plugins/kotlin/InferenceUnknownType;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
abstract class InferenceNodeType {
    private InferenceNodeType() {
    }

    public /* synthetic */ InferenceNodeType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean isTypeFor(@NotNull CallableDescriptor descriptor);

    @NotNull
    public abstract Scheme toScheme(@NotNull CallCheckerContext callContext);
}
