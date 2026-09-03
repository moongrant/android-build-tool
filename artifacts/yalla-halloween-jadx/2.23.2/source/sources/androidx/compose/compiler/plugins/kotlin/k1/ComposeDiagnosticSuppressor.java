package androidx.compose.compiler.plugins.kotlin.k1;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.com.intellij.openapi.Disposable;
import org.jetbrains.kotlin.com.intellij.openapi.extensions.Extensions;
import org.jetbrains.kotlin.com.intellij.openapi.project.Project;
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.kotlin.diagnostics.Diagnostic;
import org.jetbrains.kotlin.diagnostics.Errors;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.psi.KtAnnotatedExpression;
import org.jetbrains.kotlin.psi.KtAnnotationEntry;
import org.jetbrains.kotlin.psi.KtCallExpression;
import org.jetbrains.kotlin.psi.KtElement;
import org.jetbrains.kotlin.resolve.BindingContext;
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall;
import org.jetbrains.kotlin.resolve.calls.util.CallUtilKt;
import org.jetbrains.kotlin.resolve.diagnostics.DiagnosticSuppressor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k1/ComposeDiagnosticSuppressor;", "Lorg/jetbrains/kotlin/resolve/diagnostics/DiagnosticSuppressor;", "()V", "isSuppressed", "", "diagnostic", "Lorg/jetbrains/kotlin/diagnostics/Diagnostic;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "Companion", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComposeDiagnosticSuppressor implements DiagnosticSuppressor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k1/ComposeDiagnosticSuppressor$Companion;", "", "()V", "registerExtension", "", "project", "Lorg/jetbrains/kotlin/com/intellij/openapi/project/Project;", ShareConstants.MEDIA_EXTENSION, "Lorg/jetbrains/kotlin/resolve/diagnostics/DiagnosticSuppressor;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void registerExtension(@NotNull Project project, @NotNull DiagnosticSuppressor extension) {
            Extensions.getRootArea().getExtensionPoint(DiagnosticSuppressor.Companion.getEP_NAME()).registerExtension(extension, (Disposable) project);
        }
    }

    public boolean isSuppressed(@NotNull Diagnostic diagnostic) {
        return isSuppressed(diagnostic, null);
    }

    public boolean isSuppressed(@NotNull Diagnostic diagnostic, @Nullable BindingContext bindingContext) {
        if (Intrinsics.areEqual(diagnostic.getFactory(), Errors.NON_SOURCE_ANNOTATION_ON_INLINED_LAMBDA_EXPRESSION)) {
            KtAnnotatedExpression parent = diagnostic.getPsiElement().getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type org.jetbrains.kotlin.psi.KtAnnotatedExpression");
            for (KtAnnotationEntry ktAnnotationEntry : parent.getAnnotationEntries()) {
                if (bindingContext != null) {
                    AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) bindingContext.get(BindingContext.ANNOTATION, ktAnnotationEntry);
                    if (annotationDescriptor != null && AnnotationUtilsKt.isComposableAnnotation(annotationDescriptor)) {
                        return true;
                    }
                } else {
                    Name shortName = ktAnnotationEntry.getShortName();
                    if (Intrinsics.areEqual(shortName != null ? shortName.getIdentifier() : null, "Composable")) {
                        return true;
                    }
                }
            }
        }
        if (!Intrinsics.areEqual(diagnostic.getFactory(), Errors.NAMED_ARGUMENTS_NOT_ALLOWED) || bindingContext == null) {
            return false;
        }
        KtElement parent2 = diagnostic.getPsiElement().getParent().getParent().getParent().getParent();
        Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type org.jetbrains.kotlin.psi.KtCallExpression");
        ResolvedCall resolvedCall = CallUtilKt.getResolvedCall(CallUtilKt.getCall((KtCallExpression) parent2, bindingContext), bindingContext);
        if (resolvedCall != null) {
            return ComposableCallCheckerKt.isComposableInvocation(resolvedCall);
        }
        return false;
    }
}
