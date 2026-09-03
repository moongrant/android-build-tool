package kotlin.reflect.jvm.internal.impl.types.checker;

import OooO00o.OooO00o;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilsKt {
    private static final KotlinType approximate(KotlinType kotlinType) {
        return CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType).getUpper();
    }

    private static final String debugInfo(TypeConstructor typeConstructor) {
        StringBuilder sb = new StringBuilder();
        m1800debugInfo$lambda1$unaryPlus("type: " + typeConstructor, sb);
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("hashCode: ");
        sbOooO0o0.append(typeConstructor.hashCode());
        m1800debugInfo$lambda1$unaryPlus(sbOooO0o0.toString(), sb);
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("javaClass: ");
        sbOooO0o1.append(typeConstructor.getClass().getCanonicalName());
        m1800debugInfo$lambda1$unaryPlus(sbOooO0o1.toString(), sb);
        for (DeclarationDescriptor declarationDescriptorMo1790getDeclarationDescriptor = typeConstructor.mo1790getDeclarationDescriptor(); declarationDescriptorMo1790getDeclarationDescriptor != null; declarationDescriptorMo1790getDeclarationDescriptor = declarationDescriptorMo1790getDeclarationDescriptor.getContainingDeclaration()) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("fqName: ");
            sbOooO0o2.append(DescriptorRenderer.FQ_NAMES_IN_TYPES.render(declarationDescriptorMo1790getDeclarationDescriptor));
            m1800debugInfo$lambda1$unaryPlus(sbOooO0o2.toString(), sb);
            StringBuilder sbOooO0o3 = OooO00o.OooO0o0("javaClass: ");
            sbOooO0o3.append(declarationDescriptorMo1790getDeclarationDescriptor.getClass().getCanonicalName());
            m1800debugInfo$lambda1$unaryPlus(sbOooO0o3.toString(), sb);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: debugInfo$lambda-1$unaryPlus, reason: not valid java name */
    private static final StringBuilder m1800debugInfo$lambda1$unaryPlus(String str, StringBuilder sb) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb.append(str);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @Nullable
    public static final KotlinType findCorrespondingSupertype(@NotNull KotlinType subtype, @NotNull KotlinType supertype, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        boolean z;
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new SubtypePathNode(subtype, null));
        TypeConstructor constructor = supertype.getConstructor();
        while (!arrayDeque.isEmpty()) {
            SubtypePathNode subtypePathNode = (SubtypePathNode) arrayDeque.poll();
            KotlinType type = subtypePathNode.getType();
            TypeConstructor constructor2 = type.getConstructor();
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean zIsMarkedNullable = type.isMarkedNullable();
                for (SubtypePathNode previous = subtypePathNode.getPrevious(); previous != null; previous = previous.getPrevious()) {
                    KotlinType type2 = previous.getType();
                    List<TypeProjection> arguments = type2.getArguments();
                    if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                        Iterator<T> it = arguments.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            if (((TypeProjection) it.next()).getProjectionKind() != Variance.INVARIANT) {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        z = false;
                        break;
                    }
                    if (z) {
                        KotlinType kotlinTypeSafeSubstitute = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(TypeConstructorSubstitution.Companion.create(type2), false, 1, null).buildSubstitutor().safeSubstitute(type, Variance.INVARIANT);
                        Intrinsics.checkNotNullExpressionValue(kotlinTypeSafeSubstitute, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        type = approximate(kotlinTypeSafeSubstitute);
                    } else {
                        type = TypeConstructorSubstitution.Companion.create(type2).buildSubstitutor().safeSubstitute(type, Variance.INVARIANT);
                        Intrinsics.checkNotNullExpressionValue(type, "{\n                    Ty…ARIANT)\n                }");
                    }
                    zIsMarkedNullable = zIsMarkedNullable || type2.isMarkedNullable();
                }
                TypeConstructor constructor3 = type.getConstructor();
                if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor)) {
                    return TypeUtils.makeNullableAsSpecified(type, zIsMarkedNullable);
                }
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Type constructors should be equals!\nsubstitutedSuperType: ");
                sbOooO0o0.append(debugInfo(constructor3));
                sbOooO0o0.append(", \n\nsupertype: ");
                sbOooO0o0.append(debugInfo(constructor));
                sbOooO0o0.append(" \n");
                sbOooO0o0.append(typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor));
                throw new AssertionError(sbOooO0o0.toString());
            }
            for (KotlinType immediateSupertype : constructor2.mo1791getSupertypes()) {
                Intrinsics.checkNotNullExpressionValue(immediateSupertype, "immediateSupertype");
                arrayDeque.add(new SubtypePathNode(immediateSupertype, subtypePathNode));
            }
        }
        return null;
    }
}
