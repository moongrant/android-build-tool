package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.k1.AnnotationUtilsKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor;
import org.jetbrains.kotlin.descriptors.ClassDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.descriptors.FunctionDescriptor;
import org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor;
import org.jetbrains.kotlin.descriptors.ParameterDescriptor;
import org.jetbrains.kotlin.descriptors.PropertyDescriptor;
import org.jetbrains.kotlin.descriptors.ScriptDescriptor;
import org.jetbrains.kotlin.descriptors.TypeAliasDescriptor;
import org.jetbrains.kotlin.descriptors.TypeParameterDescriptor;
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor;
import org.jetbrains.kotlin.descriptors.VariableDescriptor;
import org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors;
import org.jetbrains.kotlin.ir.descriptors.IrBasedDeclarationDescriptor;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.DescriptorsRemapper;
import org.jetbrains.kotlin.types.KotlinType;
import org.jetbrains.kotlin.types.TypeProjection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableSymbolRemapper;", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "()V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposableSymbolRemapper extends DeepCopySymbolRemapper {
    public ComposableSymbolRemapper() {
        super(new DescriptorsRemapper() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableSymbolRemapper.1
            private final boolean containsComposable(KotlinType kotlinType) {
                boolean z;
                if (AnnotationUtilsKt.hasComposableAnnotation(kotlinType)) {
                    return true;
                }
                List arguments = kotlinType.getArguments();
                if ((arguments instanceof Collection) && arguments.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = arguments.iterator();
                    while (it.hasNext()) {
                        if (AnnotationUtilsKt.hasComposableAnnotation(((TypeProjection) it.next()).getType())) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return z;
            }

            private final boolean isTransformed(ClassConstructorDescriptor classConstructorDescriptor) {
                boolean z;
                if (classConstructorDescriptor instanceof IrBasedDeclarationDescriptor) {
                    return true;
                }
                List valueParameters = classConstructorDescriptor.getValueParameters();
                if ((valueParameters instanceof Collection) && valueParameters.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = valueParameters.iterator();
                    while (it.hasNext()) {
                        if (containsComposable(((ValueParameterDescriptor) it.next()).getType())) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return z;
            }

            @Nullable
            public ClassDescriptor remapDeclaredClass(@NotNull ClassDescriptor classDescriptor) {
                return DescriptorsRemapper.DefaultImpls.remapDeclaredClass(this, classDescriptor);
            }

            @Nullable
            public ClassConstructorDescriptor remapDeclaredConstructor(@NotNull ClassConstructorDescriptor descriptor) {
                if (isTransformed(descriptor)) {
                    return null;
                }
                return descriptor;
            }

            @Nullable
            public ClassDescriptor remapDeclaredEnumEntry(@NotNull ClassDescriptor classDescriptor) {
                return DescriptorsRemapper.DefaultImpls.remapDeclaredEnumEntry(this, classDescriptor);
            }

            @NotNull
            public PackageFragmentDescriptor remapDeclaredExternalPackageFragment(@NotNull PackageFragmentDescriptor packageFragmentDescriptor) {
                return DescriptorsRemapper.DefaultImpls.remapDeclaredExternalPackageFragment(this, packageFragmentDescriptor);
            }

            @Nullable
            public PropertyDescriptor remapDeclaredField(@NotNull PropertyDescriptor propertyDescriptor) {
                return DescriptorsRemapper.DefaultImpls.remapDeclaredField(this, propertyDescriptor);
            }

            @NotNull
            public PackageFragmentDescriptor remapDeclaredFilePackageFragment(@NotNull PackageFragmentDescriptor packageFragmentDescriptor) {
                return DescriptorsRemapper.DefaultImpls.remapDeclaredFilePackageFragment(this, packageFragmentDescriptor);
            }

            @Nullable
            public VariableDescriptorWithAccessors remapDeclaredLocalDelegatedProperty(@NotNull VariableDescriptorWithAccessors variableDescriptorWithAccessors) {
                return DescriptorsRemapper.DefaultImpls.remapDeclaredLocalDelegatedProperty(this, variableDescriptorWithAccessors);
            }

            @Nullable
            public PropertyDescriptor remapDeclaredProperty(@NotNull PropertyDescriptor propertyDescriptor) {
                return DescriptorsRemapper.DefaultImpls.remapDeclaredProperty(this, propertyDescriptor);
            }

            @Nullable
            public ScriptDescriptor remapDeclaredScript(@NotNull ScriptDescriptor scriptDescriptor) {
                return DescriptorsRemapper.DefaultImpls.remapDeclaredScript(this, scriptDescriptor);
            }

            @Nullable
            public FunctionDescriptor remapDeclaredSimpleFunction(@NotNull FunctionDescriptor descriptor) {
                if (isTransformed(descriptor)) {
                    return null;
                }
                return descriptor;
            }

            @Nullable
            public TypeAliasDescriptor remapDeclaredTypeAlias(@NotNull TypeAliasDescriptor typeAliasDescriptor) {
                return DescriptorsRemapper.DefaultImpls.remapDeclaredTypeAlias(this, typeAliasDescriptor);
            }

            @Nullable
            public TypeParameterDescriptor remapDeclaredTypeParameter(@NotNull TypeParameterDescriptor descriptor) {
                if (isTransformed(descriptor)) {
                    return null;
                }
                return descriptor;
            }

            @Nullable
            public ParameterDescriptor remapDeclaredValueParameter(@NotNull ParameterDescriptor descriptor) {
                if (isTransformed(descriptor)) {
                    return null;
                }
                return descriptor;
            }

            @Nullable
            public VariableDescriptor remapDeclaredVariable(@NotNull VariableDescriptor variableDescriptor) {
                return DescriptorsRemapper.DefaultImpls.remapDeclaredVariable(this, variableDescriptor);
            }

            private final boolean isTransformed(FunctionDescriptor functionDescriptor) {
                boolean z;
                if (functionDescriptor instanceof IrBasedDeclarationDescriptor) {
                    return true;
                }
                List valueParameters = functionDescriptor.getValueParameters();
                if (!(valueParameters instanceof Collection) || !valueParameters.isEmpty()) {
                    Iterator it = valueParameters.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        if (containsComposable(((ValueParameterDescriptor) it.next()).getType())) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    return true;
                }
                KotlinType returnType = functionDescriptor.getReturnType();
                return returnType != null && containsComposable(returnType);
            }

            private final boolean isTransformed(ParameterDescriptor parameterDescriptor) {
                if ((parameterDescriptor instanceof IrBasedDeclarationDescriptor) || containsComposable(parameterDescriptor.getType())) {
                    return true;
                }
                DeclarationDescriptor containingDeclaration = parameterDescriptor.getContainingDeclaration();
                return (containingDeclaration instanceof FunctionDescriptor) && isTransformed((FunctionDescriptor) containingDeclaration);
            }

            private final boolean isTransformed(TypeParameterDescriptor typeParameterDescriptor) {
                if (typeParameterDescriptor instanceof IrBasedDeclarationDescriptor) {
                    return true;
                }
                DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
                return (containingDeclaration instanceof FunctionDescriptor) && isTransformed((FunctionDescriptor) containingDeclaration);
            }
        });
    }
}
