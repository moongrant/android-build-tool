package androidx.compose.compiler.plugins.kotlin.lower;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.kotlin.ir.declarations.IrSymbolOwner;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001a\u0010\b\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001a\u0010\u000b\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"MAX_RESTART_ARGUMENT_COUNT", "", "recordCapture", "", "", "Landroidx/compose/compiler/plugins/kotlin/lower/DeclarationContext;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "recordLocalCapture", ImagesContract.LOCAL, "Lorg/jetbrains/kotlin/ir/declarations/IrSymbolOwner;", "recordLocalDeclaration", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposerLambdaMemoization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerLambdaMemoization.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposerLambdaMemoizationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1030:1\n1#2:1031\n1855#3,2:1032\n*S KotlinDebug\n*F\n+ 1 ComposerLambdaMemoization.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposerLambdaMemoizationKt\n*L\n148#1:1032,2\n*E\n"})
public final class ComposerLambdaMemoizationKt {
    private static final int MAX_RESTART_ARGUMENT_COUNT = 22;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recordCapture(List<? extends DeclarationContext> list, IrValueDeclaration irValueDeclaration) {
        Iterator it = CollectionsKt.reversed(list).iterator();
        while (it.hasNext() && !((DeclarationContext) it.next()).recordCapture(irValueDeclaration)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recordLocalCapture(List<? extends DeclarationContext> list, IrSymbolOwner irSymbolOwner) {
        Set<IrValueDeclaration> set;
        Iterator it = CollectionsKt.reversed(list).iterator();
        do {
            if (!it.hasNext()) {
                set = null;
                break;
            }
            set = ((DeclarationContext) it.next()).getLocalDeclarationCaptures().get(irSymbolOwner);
        } while (set == null);
        if (set != null) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                recordCapture(list, (IrValueDeclaration) it2.next());
            }
            for (DeclarationContext declarationContext : CollectionsKt.reversed(list)) {
                declarationContext.recordCapture(irSymbolOwner);
                if (declarationContext.getLocalDeclarationCaptures().containsKey(irSymbolOwner)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recordLocalDeclaration(List<? extends DeclarationContext> list, DeclarationContext declarationContext) {
        Iterator it = CollectionsKt.reversed(list).iterator();
        while (it.hasNext()) {
            ((DeclarationContext) it.next()).recordLocalDeclaration(declarationContext);
        }
    }
}
