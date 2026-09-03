package androidx.compose.compiler.plugins.kotlin.k2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.fir.FirSession;
import org.jetbrains.kotlin.fir.extensions.FirExtensionRegistrar;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u0004*\u00060\u0005R\u00020\u0001H\u0014¨\u0006\u0006"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposeFirExtensionRegistrar;", "Lorg/jetbrains/kotlin/fir/extensions/FirExtensionRegistrar;", "()V", "configurePlugin", "", "Lorg/jetbrains/kotlin/fir/extensions/FirExtensionRegistrar$ExtensionRegistrarContext;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeFirExtensionRegistrar extends FirExtensionRegistrar {

    /* JADX INFO: renamed from: androidx.compose.compiler.plugins.kotlin.k2.ComposeFirExtensionRegistrar$configurePlugin$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<FirSession, ComposableFunctionTypeKindExtension> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, ComposableFunctionTypeKindExtension.class, "<init>", "<init>(Lorg/jetbrains/kotlin/fir/FirSession;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ComposableFunctionTypeKindExtension invoke(@NotNull FirSession firSession) {
            return new ComposableFunctionTypeKindExtension(firSession);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.compiler.plugins.kotlin.k2.ComposeFirExtensionRegistrar$configurePlugin$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<FirSession, ComposeFirCheckersExtension> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, ComposeFirCheckersExtension.class, "<init>", "<init>(Lorg/jetbrains/kotlin/fir/FirSession;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ComposeFirCheckersExtension invoke(@NotNull FirSession firSession) {
            return new ComposeFirCheckersExtension(firSession);
        }
    }

    public void configurePlugin(@NotNull FirExtensionRegistrar.ExtensionRegistrarContext extensionRegistrarContext) {
        extensionRegistrarContext.plusFunctionTypeKindExtension(AnonymousClass1.INSTANCE);
        extensionRegistrarContext.plusAdditionalCheckersExtension(AnonymousClass2.INSTANCE);
    }
}
