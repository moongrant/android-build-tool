package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import androidx.compose.compiler.plugins.kotlin.KtxNameConventions;
import com.common.support.apm.Constants;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException;
import org.jetbrains.kotlin.descriptors.ClassDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.name.ClassId;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.resolve.descriptorUtil.DescriptorUtilsKt;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a-\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0010\u001a\u0012\u0010\u0011\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014\u001a\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019\u001a\n\u0010\u001a\u001a\u00020\u0016*\u00020\u000f\u001a\n\u0010\u001b\u001a\u00020\u001c*\u00020\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"unsafeSymbolsRegex", "Lkotlin/text/Regex;", "annotationClass", "Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "getAnnotationClass", "(Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;)Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "includeFileNameInExceptionTrace", "T", ShareInternalUtility.STAGING_PARAM, "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "body", "Lkotlin/Function0;", "(Lorg/jetbrains/kotlin/ir/declarations/IrFile;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "composerParam", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "function", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "arity", "", "hasAnnotationSafe", "", "Lorg/jetbrains/kotlin/ir/declarations/IrAnnotationContainer;", "fqName", "Lorg/jetbrains/kotlin/name/FqName;", "isComposerParam", "topLevelName", "", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbstractComposeLowering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1157:1\n1747#2,3:1158\n*S KotlinDebug\n*F\n+ 1 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n*L\n1135#1:1158,3\n*E\n"})
public final class AbstractComposeLoweringKt {

    @NotNull
    private static final Regex unsafeSymbolsRegex = new Regex("[ <>]");

    @Nullable
    public static final IrValueParameter composerParam(@NotNull IrFunction irFunction) {
        Intrinsics.checkNotNullParameter(irFunction, "<this>");
        for (IrValueParameter irValueParameter : CollectionsKt.asReversed(irFunction.getValueParameters())) {
            if (isComposerParam(irValueParameter)) {
                return irValueParameter;
            }
            String strAsString = irValueParameter.getName().asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "param.name.asString()");
            if (!StringsKt__StringsKt.startsWith$default(strAsString, Typography.dollar, false, 2, (Object) null)) {
                return null;
            }
        }
        return null;
    }

    @NotNull
    public static final IrClassSymbol function(@NotNull IrPluginContext irPluginContext, int i) {
        Intrinsics.checkNotNullParameter(irPluginContext, "<this>");
        IrClassSymbol irClassSymbolReferenceClass = irPluginContext.referenceClass(new ClassId(new FqName(Constants.SDK_LANGUAGE), Name.identifier(android.support.v4.media.OooO00o.OooO00o("Function", i))));
        Intrinsics.checkNotNull(irClassSymbolReferenceClass);
        return irClassSymbolReferenceClass;
    }

    @Nullable
    public static final IrClassSymbol getAnnotationClass(@NotNull IrConstructorCall irConstructorCall) {
        Intrinsics.checkNotNullParameter(irConstructorCall, "<this>");
        return IrTypesKt.getClassOrNull(irConstructorCall.getType());
    }

    public static final boolean hasAnnotationSafe(@NotNull IrAnnotationContainer irAnnotationContainer, @NotNull FqName fqName) {
        DeclarationDescriptor declarationDescriptor;
        Intrinsics.checkNotNullParameter(irAnnotationContainer, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List annotations = irAnnotationContainer.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            IrClassSymbol annotationClass = getAnnotationClass((IrConstructorCall) it.next());
            if (Intrinsics.areEqual(fqName, (annotationClass == null || (declarationDescriptor = (ClassDescriptor) annotationClass.getDescriptor()) == null) ? null : DescriptorUtilsKt.getFqNameSafe(declarationDescriptor))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
    public static final <T> T includeFileNameInExceptionTrace(@NotNull IrFile file, @NotNull Function0<? extends T> body) throws Exception {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            return body.invoke();
        } catch (Exception e) {
            throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(file)), e);
        } catch (ProcessCanceledException e2) {
            throw e2;
        }
    }

    public static final boolean isComposerParam(@NotNull IrValueParameter irValueParameter) {
        Intrinsics.checkNotNullParameter(irValueParameter, "<this>");
        return Intrinsics.areEqual(irValueParameter.getName(), KtxNameConventions.INSTANCE.getCOMPOSER_PARAMETER()) && Intrinsics.areEqual(IrTypesKt.getClassFqName(irValueParameter.getType()), ComposeFqNames.INSTANCE.getComposer());
    }

    @NotNull
    public static final String topLevelName(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "<this>");
        String strAsString = fqName.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString()");
        return StringsKt__StringsKt.substringBefore$default(strAsString, ".", (String) null, 2, (Object) null);
    }
}
