package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeClassIds;
import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import androidx.compose.compiler.plugins.kotlin.FunctionMetrics;
import androidx.compose.compiler.plugins.kotlin.KtxNameConventions;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.WeakBindingTrace;
import androidx.compose.compiler.plugins.kotlin.WeakBindingTraceKt;
import androidx.compose.compiler.plugins.kotlin.analysis.ComposeWritableSlices;
import androidx.compose.compiler.plugins.kotlin.analysis.KnownStableConstructs;
import androidx.compose.compiler.plugins.kotlin.analysis.Stability;
import androidx.compose.compiler.plugins.kotlin.analysis.StabilityKt;
import com.common.support.apm.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.jvm.ir.JvmIrTypeUtilsKt;
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities;
import org.jetbrains.kotlin.descriptors.InlineClassRepresentation;
import org.jetbrains.kotlin.descriptors.VariableDescriptor;
import org.jetbrains.kotlin.ir.IrBuiltIns;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.builders.declarations.DeclarationBuildersKt;
import org.jetbrains.kotlin.ir.builders.declarations.IrFieldBuilder;
import org.jetbrains.kotlin.ir.builders.declarations.IrFunctionBuilder;
import org.jetbrains.kotlin.ir.builders.declarations.IrPropertyBuilder;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrFactory;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrTypeParameter;
import org.jetbrains.kotlin.ir.declarations.IrTypeParametersContainer;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.IrVariable;
import org.jetbrains.kotlin.ir.declarations.impl.IrExternalPackageFragmentImpl;
import org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl;
import org.jetbrains.kotlin.ir.expressions.IrBody;
import org.jetbrains.kotlin.ir.expressions.IrBranch;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstKind;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrGetEnumValue;
import org.jetbrains.kotlin.ir.expressions.IrGetField;
import org.jetbrains.kotlin.ir.expressions.IrGetObjectValue;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;
import org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrReturn;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall;
import org.jetbrains.kotlin.ir.expressions.IrVararg;
import org.jetbrains.kotlin.ir.expressions.IrVarargElement;
import org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrFunctionExpressionImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrGetFieldImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrIfThenElseImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrSetValueImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol;
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrPropertySymbol;
import org.jetbrains.kotlin.ir.symbols.IrReturnTargetSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrValueSymbol;
import org.jetbrains.kotlin.ir.symbols.impl.IrVariableSymbolImpl;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypePredicatesKt;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.types.impl.IrSimpleTypeImpl;
import org.jetbrains.kotlin.ir.types.impl.IrStarProjectionImpl;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrTypeUtilsKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid;
import org.jetbrains.kotlin.load.kotlin.MethodSignatureMappingKt;
import org.jetbrains.kotlin.name.CallableId;
import org.jetbrains.kotlin.name.ClassId;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.name.SpecialNames;
import org.jetbrains.kotlin.platform.jvm.JvmPlatformKt;
import org.jetbrains.kotlin.types.Variance;
import org.jetbrains.kotlin.util.OperatorNameConventions;
import org.jetbrains.kotlin.utils.DFS;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0014\u0010$\u001a\u00020%2\n\u0010&\u001a\u00020'\"\u00020(H\u0004J\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0004J\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u000206J\u000e\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020:J\u0010\u0010;\u001a\u0004\u0018\u00010\u001d2\u0006\u00109\u001a\u00020:J\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001d0=2\u0006\u00109\u001a\u00020:J\u000e\u0010>\u001a\u00020?2\u0006\u00109\u001a\u00020:J\u0018\u0010@\u001a\u00020*2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0004J\u0018\u0010C\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0004J,\u0010D\u001a\u00020,2\b\b\u0002\u0010E\u001a\u00020.2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0=H\u0004J\u0018\u0010J\u001a\u00020*2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0004J\u0018\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020,2\u0006\u0010N\u001a\u00020,H\u0004JM\u0010O\u001a\u00020*2\u0006\u0010P\u001a\u00020?2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010,2\u0012\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0T\"\u00020,H\u0004¢\u0006\u0002\u0010UJ,\u0010V\u001a\u00020,2\b\b\u0002\u0010E\u001a\u00020.2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0=H\u0004J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020(0X2\u0006\u0010Y\u001a\u00020(H\u0004J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020%0Z2\u0006\u0010Y\u001a\u00020%H\u0004J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0006\u0010Y\u001a\u00020[H\u0004J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020\\0Z2\u0006\u0010Y\u001a\u00020\\H\u0004J$\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020,2\b\b\u0002\u0010`\u001a\u00020%2\b\b\u0002\u0010a\u001a\u00020%H\u0004J\u0018\u0010b\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0004J,\u0010c\u001a\u00020I2\u0006\u0010d\u001a\u00020.2\u0006\u0010e\u001a\u00020,2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020,0gH\u0004J\u0010\u0010i\u001a\u00020,2\u0006\u0010j\u001a\u00020hH\u0004J\u0018\u0010i\u001a\u00020,2\u0006\u0010E\u001a\u00020.2\u0006\u0010P\u001a\u00020kH\u0004J\u0018\u0010l\u001a\u00020,2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020%H\u0004J\u0018\u0010p\u001a\u00020*2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0004J\u0018\u0010q\u001a\u00020,2\u0006\u0010M\u001a\u00020,2\u0006\u0010r\u001a\u00020,H\u0004J>\u0010s\u001a\u00020t2\b\b\u0002\u0010E\u001a\u00020.2\u0006\u0010M\u001a\u00020,2\u0006\u0010u\u001a\u00020,2\u0006\u0010v\u001a\u00020,2\b\b\u0002\u0010`\u001a\u00020%2\b\b\u0002\u0010a\u001a\u00020%H\u0004J4\u0010w\u001a\u00020,2\u0006\u0010`\u001a\u00020%2\u0006\u0010a\u001a\u00020%2\u0006\u0010x\u001a\u00020.2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020z0gH\u0004J\u0010\u0010{\u001a\u00020,2\u0006\u0010Y\u001a\u00020,H\u0004J\u0018\u0010|\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0004J\u0010\u0010}\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010~0XH\u0004J\u0018\u0010\u007f\u001a\u00020*2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0004J\u0019\u0010\u0080\u0001\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0004J%\u0010\u0081\u0001\u001a\u00020,2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0006\u0010Y\u001a\u00020,2\b\b\u0002\u0010E\u001a\u00020.H\u0004J\u001c\u0010\u0084\u0001\u001a\u00020,2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010Y\u001a\u00030\u0085\u0001H\u0004J\u0019\u0010\u0086\u0001\u001a\u00020,2\u0006\u0010j\u001a\u00020h2\u0006\u0010Y\u001a\u00020,H\u0004J;\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0006\u0010Y\u001a\u00020,2\u0006\u00102\u001a\u00020\\2\t\b\u0002\u0010\u0089\u0001\u001a\u00020.2\t\b\u0002\u0010\u008a\u0001\u001a\u00020(2\t\b\u0002\u0010F\u001a\u00030\u008b\u0001H\u0004J/\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\b\u0002\u0010E\u001a\u00020.2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020L0=H\u0004J\u0019\u0010\u008f\u0001\u001a\u00020*2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0004J\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001J\n\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0004J\u0012\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001J\u0011\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0007\u0010P\u001a\u00030\u0099\u0001J\u000f\u0010\u009a\u0001\u001a\u00020?2\u0006\u0010P\u001a\u00020?J\u000f\u0010\u009b\u0001\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020\u001dJ\u0012\u0010\u009c\u0001\u001a\u00020(*\u0007\u0012\u0002\b\u00030\u009d\u0001H\u0002J\u001e\u0010\u009e\u0001\u001a\u00020?*\u00020.2\u0006\u00102\u001a\u0002012\u0007\u0010\u009f\u0001\u001a\u00020.H\u0004J\u000b\u0010 \u0001\u001a\u00020**\u00020,J\u0016\u0010¡\u0001\u001a\u00020(*\u00020%2\u0006\u0010o\u001a\u00020%H\u0084\u0002J\f\u0010¢\u0001\u001a\u00020(*\u00030£\u0001J\f\u0010¤\u0001\u001a\u00020(*\u00030¥\u0001J(\u0010¦\u0001\u001a\u0004\u0018\u00010,*\u00030§\u00012\u0018\b\u0002\u0010¨\u0001\u001a\u0011\u0012\u0005\u0012\u00030©\u0001\u0012\u0006\u0012\u0004\u0018\u00010,0gJ\f\u0010ª\u0001\u001a\u00020(*\u00030«\u0001J\f\u0010¬\u0001\u001a\u00020(*\u00030\u0097\u0001J\f\u0010\u00ad\u0001\u001a\u00020(*\u00030«\u0001J\u000b\u0010®\u0001\u001a\u00020(*\u00020\u000bJ\f\u0010¯\u0001\u001a\u00020(*\u00030«\u0001J\f\u0010°\u0001\u001a\u00020(*\u00030«\u0001J\u000e\u0010±\u0001\u001a\u00020(*\u00030«\u0001H\u0002J\u000e\u0010±\u0001\u001a\u00020(*\u00030²\u0001H\u0002J\u000b\u0010±\u0001\u001a\u00020(*\u00020,J\f\u0010³\u0001\u001a\u00020(*\u00030«\u0001J\u000b\u0010´\u0001\u001a\u00020.*\u00020.J\u000b\u0010µ\u0001\u001a\u00020%*\u00020yJ\u000b\u0010¶\u0001\u001a\u00020.*\u00020.J\r\u0010·\u0001\u001a\u0004\u0018\u00010.*\u00020.J\r\u0010¸\u0001\u001a\u00020,*\u00020,H\u0004J\u001d\u0010¹\u0001\u001a\u00020%*\u00020%2\u0006\u0010o\u001a\u00020%2\u0006\u0010Y\u001a\u00020(H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006º\u0001"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering;", "Lorg/jetbrains/kotlin/ir/visitors/IrElementTransformerVoid;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "_composableIrClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "_composerIrClass", "builtIns", "Lorg/jetbrains/kotlin/ir/IrBuiltIns;", "getBuiltIns", "()Lorg/jetbrains/kotlin/ir/IrBuiltIns;", "composableIrClass", "getComposableIrClass", "()Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "composerIrClass", "getComposerIrClass", "getContext", "()Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "getMetrics", "()Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "getSymbolRemapper", "()Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "unsafeCoerceIntrinsic", "Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "getUnsafeCoerceIntrinsic$annotations", "()V", "getUnsafeCoerceIntrinsic", "()Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "unsafeCoerceIntrinsic$delegate", "Lkotlin/Lazy;", "bitMask", "", "values", "", "", "coerceInlineClasses", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrCallImpl;", "argument", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "from", "Lorg/jetbrains/kotlin/ir/types/IrType;", "to", "dexSafeName", "Lorg/jetbrains/kotlin/name/Name;", "name", "getTopLevelClass", "Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "classId", "Lorg/jetbrains/kotlin/name/ClassId;", "getTopLevelClassOrNull", "getTopLevelFunction", "callableId", "Lorg/jetbrains/kotlin/name/CallableId;", "getTopLevelFunctionOrNull", "getTopLevelFunctions", "", "getTopLevelPropertyGetter", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "irAnd", "lhs", "rhs", "irAndAnd", "irBlock", "type", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "Lorg/jetbrains/kotlin/ir/expressions/IrStatementOrigin;", "statements", "Lorg/jetbrains/kotlin/ir/IrStatement;", "irBooleanOr", "irBranch", "Lorg/jetbrains/kotlin/ir/expressions/IrBranch;", "condition", ReportItem.QualityKeyResult, "irCall", "symbol", "dispatchReceiver", "extensionReceiver", "args", "", "(Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;Lorg/jetbrains/kotlin/ir/expressions/IrStatementOrigin;Lorg/jetbrains/kotlin/ir/expressions/IrExpression;Lorg/jetbrains/kotlin/ir/expressions/IrExpression;[Lorg/jetbrains/kotlin/ir/expressions/IrExpression;)Lorg/jetbrains/kotlin/ir/expressions/impl/IrCallImpl;", "irComposite", "irConst", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrConstImpl;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lorg/jetbrains/kotlin/ir/expressions/IrConst;", "", "", "irElseBranch", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrElseBranchImpl;", "expression", "startOffset", "endOffset", "irEqual", "irForLoop", "elementType", "subject", "loopBody", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "irGet", "variable", "Lorg/jetbrains/kotlin/ir/symbols/IrValueSymbol;", "irGetBit", "param", "Landroidx/compose/compiler/plugins/kotlin/lower/IrDefaultBitMaskValue;", "index", "irGreater", "irIf", "body", "irIfThenElse", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrIfThenElseImpl;", "thenPart", "elsePart", "irLambdaExpression", "returnType", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "", "irNot", "irNotEqual", "irNull", "", "irOr", "irOrOr", "irReturn", "target", "Lorg/jetbrains/kotlin/ir/symbols/IrReturnTargetSymbol;", "irReturnVar", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "irSet", "irTemporary", "Lorg/jetbrains/kotlin/ir/declarations/impl/IrVariableImpl;", "irType", "isVar", "Lorg/jetbrains/kotlin/ir/declarations/IrDeclarationOrigin;", "irWhen", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrWhenImpl;", "branches", "irXor", "makeStabilityField", "Lorg/jetbrains/kotlin/ir/declarations/IrField;", "makeStabilityProp", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "metricsFor", "Landroidx/compose/compiler/plugins/kotlin/FunctionMetrics;", "function", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "referenceConstructor", "Lorg/jetbrains/kotlin/ir/symbols/IrConstructorSymbol;", "referenceFunction", "referenceSimpleFunction", "areAllArgumentsStatic", "Lorg/jetbrains/kotlin/ir/expressions/IrMemberAccessExpression;", "binaryOperator", "paramType", "coerceToUnboxed", "get", "hasComposableAnnotation", "Lorg/jetbrains/kotlin/ir/declarations/IrAnnotationContainer;", "hasDefaultValueSafe", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "irStableExpression", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "resolve", "Lorg/jetbrains/kotlin/ir/declarations/IrTypeParameter;", "isComposableCall", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "isComposableDelegatedAccessor", "isComposableLambdaInvoke", "isComposableSingletonClass", "isComposableSingletonGetter", "isInvoke", "isStatic", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "isSyntheticComposableCall", "replaceArgumentsWithStarProjections", "sourceKey", "unboxInlineClass", "unboxType", "unboxValueIfInline", "withBit", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbstractComposeLowering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 declarationBuilders.kt\norg/jetbrains/kotlin/ir/builders/declarations/DeclarationBuildersKt\n*L\n1#1,1188:1\n1#2:1189\n1#2:1202\n2141#3,2:1190\n346#3,12:1219\n346#3,12:1231\n346#3,12:1243\n1603#4,9:1192\n1855#4:1201\n1856#4:1203\n1612#4:1204\n2661#4,7:1205\n1549#4:1259\n1620#4,3:1260\n1726#4,3:1271\n1726#4,2:1274\n1726#4,3:1276\n1728#4:1279\n1549#4:1280\n1620#4,3:1281\n13229#5,4:1212\n13644#5,3:1216\n179#6,4:1255\n55#6,4:1263\n92#6,4:1267\n*S KotlinDebug\n*F\n+ 1 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering\n*L\n335#1:1202\n270#1:1190,2\n633#1:1219,12\n643#1:1231,12\n645#1:1243,12\n335#1:1192,9\n335#1:1201\n335#1:1203\n335#1:1204\n340#1:1205,7\n851#1:1259\n851#1:1260,3\n997#1:1271,3\n1049#1:1274,2\n1058#1:1276,3\n1049#1:1279\n233#1:1280\n233#1:1281,3\n379#1:1212,4\n420#1:1216,3\n838#1:1255,4\n859#1:1263,4\n871#1:1267,4\n*E\n"})
public abstract class AbstractComposeLowering extends IrElementTransformerVoid implements ModuleLoweringPass {

    @NotNull
    private final IrClass _composableIrClass;

    @NotNull
    private final IrClass _composerIrClass;

    @NotNull
    private final IrBuiltIns builtIns;

    @NotNull
    private final IrPluginContext context;

    @NotNull
    private final ModuleMetrics metrics;

    @NotNull
    private final DeepCopySymbolRemapper symbolRemapper;

    /* JADX INFO: renamed from: unsafeCoerceIntrinsic$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy unsafeCoerceIntrinsic;

    public AbstractComposeLowering(@NotNull IrPluginContext irPluginContext, @NotNull DeepCopySymbolRemapper deepCopySymbolRemapper, @NotNull ModuleMetrics moduleMetrics) {
        IrClass owner;
        IrClass owner2;
        this.context = irPluginContext;
        this.symbolRemapper = deepCopySymbolRemapper;
        this.metrics = moduleMetrics;
        this.builtIns = irPluginContext.getIrBuiltIns();
        ComposeClassIds composeClassIds = ComposeClassIds.INSTANCE;
        IrClassSymbol irClassSymbolReferenceClass = irPluginContext.referenceClass(composeClassIds.getComposer());
        if (irClassSymbolReferenceClass == null || (owner = irClassSymbolReferenceClass.getOwner()) == null) {
            throw new IllegalStateException("Cannot find the Composer class in the classpath".toString());
        }
        this._composerIrClass = owner;
        IrClassSymbol irClassSymbolReferenceClass2 = irPluginContext.referenceClass(composeClassIds.getComposable());
        if (irClassSymbolReferenceClass2 == null || (owner2 = irClassSymbolReferenceClass2.getOwner()) == null) {
            throw new IllegalStateException("Cannot find the Composable annotation class in the classpath".toString());
        }
        this._composableIrClass = owner2;
        this.unsafeCoerceIntrinsic = LazyKt.lazy(new Function0<IrSimpleFunctionSymbol>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.AbstractComposeLowering$unsafeCoerceIntrinsic$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final IrSimpleFunctionSymbol invoke() {
                if (!JvmPlatformKt.isJvm(this.this$0.getContext().getPlatform())) {
                    return null;
                }
                IrFactory irFactory = this.this$0.getContext().getIrFactory();
                IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
                irFunctionBuilder.setName(Name.special("<unsafe-coerce>"));
                irFunctionBuilder.setOrigin(IrDeclarationOrigin.IR_BUILTINS_STUB.INSTANCE);
                IrFunction irFunctionBuildFunction = DeclarationBuildersKt.buildFunction(irFactory, irFunctionBuilder);
                AbstractComposeLowering abstractComposeLowering = this.this$0;
                irFunctionBuildFunction.setParent(IrExternalPackageFragmentImpl.Companion.createEmptyExternalPackageFragment(abstractComposeLowering.getContext().getModuleDescriptor(), new FqName("kotlin.jvm.internal")));
                IrTypeParametersContainer irTypeParametersContainer = (IrTypeParametersContainer) irFunctionBuildFunction;
                IrTypeParameter irTypeParameterAddTypeParameter$default = DeclarationBuildersKt.addTypeParameter$default(irTypeParametersContainer, "T", abstractComposeLowering.getContext().getIrBuiltIns().getAnyNType(), (Variance) null, 4, (Object) null);
                IrTypeParameter irTypeParameterAddTypeParameter$default2 = DeclarationBuildersKt.addTypeParameter$default(irTypeParametersContainer, "R", abstractComposeLowering.getContext().getIrBuiltIns().getAnyNType(), (Variance) null, 4, (Object) null);
                DeclarationBuildersKt.addValueParameter$default(irFunctionBuildFunction, "v", IrTypesKt.getDefaultType(irTypeParameterAddTypeParameter$default), (IrDeclarationOrigin) null, 4, (Object) null);
                irFunctionBuildFunction.setReturnType(IrTypesKt.getDefaultType(irTypeParameterAddTypeParameter$default2));
                return irFunctionBuildFunction.getSymbol();
            }
        });
    }

    private final boolean areAllArgumentsStatic(IrMemberAccessExpression<?> irMemberAccessExpression) {
        boolean zIsStatic;
        List argumentsWithIr = IrUtilsKt.getArgumentsWithIr(irMemberAccessExpression);
        if ((argumentsWithIr instanceof Collection) && argumentsWithIr.isEmpty()) {
            return true;
        }
        Iterator it = argumentsWithIr.iterator();
        while (it.hasNext()) {
            IrVararg irVararg = (IrExpression) ((Pair) it.next()).component2();
            if (irVararg instanceof IrVararg) {
                List elements = irVararg.getElements();
                if (!(elements instanceof Collection) || !elements.isEmpty()) {
                    Iterator it2 = elements.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            zIsStatic = true;
                            break;
                        }
                        IrVarargElement irVarargElement = (IrVarargElement) it2.next();
                        IrExpression irExpression = irVarargElement instanceof IrExpression ? (IrExpression) irVarargElement : null;
                        if (!(irExpression != null ? isStatic(irExpression) : false)) {
                            zIsStatic = false;
                            break;
                        }
                    }
                } else {
                    zIsStatic = true;
                    break;
                    break;
                }
            } else {
                zIsStatic = isStatic((IrExpression) irVararg);
            }
            if (!zIsStatic) {
                return false;
            }
        }
        return true;
    }

    private final IrSimpleFunctionSymbol getUnsafeCoerceIntrinsic() {
        return (IrSimpleFunctionSymbol) this.unsafeCoerceIntrinsic.getValue();
    }

    private static /* synthetic */ void getUnsafeCoerceIntrinsic$annotations() {
    }

    private static final Iterable hasDefaultValueSafe$lambda$5(IrValueParameter irValueParameter) {
        List<IrSimpleFunctionSymbol> overriddenSymbols;
        IrSimpleFunction parent = irValueParameter.getParent();
        IrSimpleFunction irSimpleFunction = parent instanceof IrSimpleFunction ? parent : null;
        if (irSimpleFunction == null || (overriddenSymbols = irSimpleFunction.getOverriddenSymbols()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(overriddenSymbols));
        for (IrSimpleFunctionSymbol irSimpleFunctionSymbol : overriddenSymbols) {
            IrValueParameter irValueParameter2 = (IrValueParameter) irSimpleFunctionSymbol.getOwner().getValueParameters().get(irValueParameter.getIndex());
            irValueParameter2.setParent(irSimpleFunctionSymbol.getOwner());
            arrayList.add(irValueParameter2);
        }
        return arrayList;
    }

    public static /* synthetic */ IrExpression irBlock$default(AbstractComposeLowering abstractComposeLowering, IrType irType, IrStatementOrigin irStatementOrigin, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: irBlock");
        }
        if ((i & 1) != 0) {
            irType = abstractComposeLowering.context.getIrBuiltIns().getUnitType();
        }
        if ((i & 2) != 0) {
            irStatementOrigin = null;
        }
        return abstractComposeLowering.irBlock(irType, irStatementOrigin, list);
    }

    public static /* synthetic */ IrCallImpl irCall$default(AbstractComposeLowering abstractComposeLowering, IrFunctionSymbol irFunctionSymbol, IrStatementOrigin irStatementOrigin, IrExpression irExpression, IrExpression irExpression2, IrExpression[] irExpressionArr, int i, Object obj) {
        if (obj == null) {
            return abstractComposeLowering.irCall(irFunctionSymbol, (i & 2) != 0 ? null : irStatementOrigin, (i & 4) != 0 ? null : irExpression, (i & 8) != 0 ? null : irExpression2, irExpressionArr);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: irCall");
    }

    public static /* synthetic */ IrExpression irComposite$default(AbstractComposeLowering abstractComposeLowering, IrType irType, IrStatementOrigin irStatementOrigin, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: irComposite");
        }
        if ((i & 1) != 0) {
            irType = abstractComposeLowering.context.getIrBuiltIns().getUnitType();
        }
        if ((i & 2) != 0) {
            irStatementOrigin = null;
        }
        return abstractComposeLowering.irComposite(irType, irStatementOrigin, list);
    }

    public static /* synthetic */ IrElseBranchImpl irElseBranch$default(AbstractComposeLowering abstractComposeLowering, IrExpression irExpression, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: irElseBranch");
        }
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return abstractComposeLowering.irElseBranch(irExpression, i, i2);
    }

    public static /* synthetic */ IrIfThenElseImpl irIfThenElse$default(AbstractComposeLowering abstractComposeLowering, IrType irType, IrExpression irExpression, IrExpression irExpression2, IrExpression irExpression3, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: irIfThenElse");
        }
        if ((i3 & 1) != 0) {
            irType = abstractComposeLowering.context.getIrBuiltIns().getUnitType();
        }
        return abstractComposeLowering.irIfThenElse(irType, irExpression, irExpression2, irExpression3, (i3 & 16) != 0 ? -1 : i, (i3 & 32) != 0 ? -1 : i2);
    }

    public static /* synthetic */ IrExpression irReturn$default(AbstractComposeLowering abstractComposeLowering, IrReturnTargetSymbol irReturnTargetSymbol, IrExpression irExpression, IrType irType, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: irReturn");
        }
        if ((i & 4) != 0) {
            irType = irExpression.getType();
        }
        return abstractComposeLowering.irReturn(irReturnTargetSymbol, irExpression, irType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IrExpression irStableExpression$default(AbstractComposeLowering abstractComposeLowering, Stability stability, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: irStableExpression");
        }
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: androidx.compose.compiler.plugins.kotlin.lower.AbstractComposeLowering.irStableExpression.1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(@NotNull IrTypeParameter irTypeParameter) {
                    return null;
                }
            };
        }
        return abstractComposeLowering.irStableExpression(stability, function1);
    }

    public static /* synthetic */ IrVariableImpl irTemporary$default(AbstractComposeLowering abstractComposeLowering, IrExpression irExpression, String str, IrType irType, boolean z, IrDeclarationOrigin irDeclarationOrigin, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: irTemporary");
        }
        if ((i & 4) != 0) {
            irType = irExpression.getType();
        }
        IrType irType2 = irType;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            irDeclarationOrigin = (IrDeclarationOrigin) IrDeclarationOrigin.IR_TEMPORARY_VARIABLE.INSTANCE;
        }
        return abstractComposeLowering.irTemporary(irExpression, str, irType2, z2, irDeclarationOrigin);
    }

    public static /* synthetic */ IrWhenImpl irWhen$default(AbstractComposeLowering abstractComposeLowering, IrType irType, IrStatementOrigin irStatementOrigin, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: irWhen");
        }
        if ((i & 1) != 0) {
            irType = abstractComposeLowering.context.getIrBuiltIns().getUnitType();
        }
        if ((i & 2) != 0) {
            irStatementOrigin = null;
        }
        return abstractComposeLowering.irWhen(irType, irStatementOrigin, list);
    }

    private final int withBit(int i, int i2, boolean z) {
        return z ? i | (1 << i2) : i & (~(1 << i2));
    }

    @NotNull
    public final IrFunctionSymbol binaryOperator(@NotNull IrType irType, @NotNull Name name, @NotNull IrType irType2) {
        return this.context.getSymbols().getBinaryOperator(name, irType, irType2);
    }

    public final int bitMask(@NotNull boolean... values) {
        int length = values.length;
        int i = 0;
        int iWithBit = 0;
        int i2 = 0;
        while (i < length) {
            iWithBit = withBit(iWithBit, i2, values[i]);
            i++;
            i2++;
        }
        return iWithBit;
    }

    @NotNull
    public final IrCallImpl coerceInlineClasses(@NotNull IrExpression argument, @NotNull IrType from, @NotNull IrType to) {
        IrCallImpl.Companion companion = IrCallImpl.Companion;
        IrSimpleFunctionSymbol unsafeCoerceIntrinsic = getUnsafeCoerceIntrinsic();
        Intrinsics.checkNotNull(unsafeCoerceIntrinsic);
        IrCallImpl irCallImplFromSymbolOwner$default = IrCallImpl.Companion.fromSymbolOwner$default(companion, -1, -1, to, unsafeCoerceIntrinsic, 0, 0, (IrStatementOrigin) null, (IrClassSymbol) null, 240, (Object) null);
        irCallImplFromSymbolOwner$default.putTypeArgument(0, from);
        irCallImplFromSymbolOwner$default.putTypeArgument(1, to);
        irCallImplFromSymbolOwner$default.putValueArgument(0, argument);
        return irCallImplFromSymbolOwner$default;
    }

    @NotNull
    public final IrCallImpl coerceToUnboxed(@NotNull IrExpression irExpression) {
        return coerceInlineClasses(irExpression, irExpression.getType(), unboxInlineClass(irExpression.getType()));
    }

    @NotNull
    public final Name dexSafeName(@NotNull Name name) {
        if (!name.isSpecial()) {
            if (!AbstractComposeLoweringKt.unsafeSymbolsRegex.containsMatchIn(name.asString())) {
                return name;
            }
        }
        return Name.identifier(AbstractComposeLoweringKt.unsafeSymbolsRegex.replace(name.asString(), "\\$"));
    }

    public final boolean get(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    @NotNull
    public final IrBuiltIns getBuiltIns() {
        return this.builtIns;
    }

    @NotNull
    public final IrClass getComposableIrClass() {
        return this.symbolRemapper.getReferencedClass(this._composableIrClass.getSymbol()).getOwner();
    }

    @NotNull
    public final IrClass getComposerIrClass() {
        return this.symbolRemapper.getReferencedClass(this._composerIrClass.getSymbol()).getOwner();
    }

    @NotNull
    public final IrPluginContext getContext() {
        return this.context;
    }

    @NotNull
    public final ModuleMetrics getMetrics() {
        return this.metrics;
    }

    @NotNull
    public final DeepCopySymbolRemapper getSymbolRemapper() {
        return this.symbolRemapper;
    }

    @NotNull
    public final IrClassSymbol getTopLevelClass(@NotNull ClassId classId) {
        IrClassSymbol topLevelClassOrNull = getTopLevelClassOrNull(classId);
        if (topLevelClassOrNull != null) {
            return topLevelClassOrNull;
        }
        throw new IllegalStateException(("Class not found in the classpath: " + classId.asSingleFqName()).toString());
    }

    @Nullable
    public final IrClassSymbol getTopLevelClassOrNull(@NotNull ClassId classId) {
        return this.context.referenceClass(classId);
    }

    @NotNull
    public final IrSimpleFunctionSymbol getTopLevelFunction(@NotNull CallableId callableId) {
        IrSimpleFunctionSymbol topLevelFunctionOrNull = getTopLevelFunctionOrNull(callableId);
        if (topLevelFunctionOrNull != null) {
            return topLevelFunctionOrNull;
        }
        throw new IllegalStateException(("Function not found in the classpath: " + callableId.asSingleFqName()).toString());
    }

    @Nullable
    public final IrSimpleFunctionSymbol getTopLevelFunctionOrNull(@NotNull CallableId callableId) {
        return (IrSimpleFunctionSymbol) CollectionsKt.firstOrNull(this.context.referenceFunctions(callableId));
    }

    @NotNull
    public final List<IrSimpleFunctionSymbol> getTopLevelFunctions(@NotNull CallableId callableId) {
        return CollectionsKt.toList(this.context.referenceFunctions(callableId));
    }

    @NotNull
    public final IrFunctionSymbol getTopLevelPropertyGetter(@NotNull CallableId callableId) {
        IrPropertySymbol irPropertySymbol = (IrPropertySymbol) CollectionsKt.firstOrNull(this.context.referenceProperties(callableId));
        if (irPropertySymbol != null) {
            DeepCopySymbolRemapper deepCopySymbolRemapper = this.symbolRemapper;
            IrSimpleFunction getter = irPropertySymbol.getOwner().getGetter();
            Intrinsics.checkNotNull(getter);
            return deepCopySymbolRemapper.getReferencedFunction(getter.getSymbol());
        }
        throw new IllegalStateException(("Property was not found " + callableId.asSingleFqName()).toString());
    }

    public final boolean hasComposableAnnotation(@NotNull IrAnnotationContainer irAnnotationContainer) {
        return IrUtilsKt.hasAnnotation(irAnnotationContainer, ComposeFqNames.INSTANCE.getComposable());
    }

    public final boolean hasDefaultValueSafe(@NotNull IrValueParameter irValueParameter) {
        return DFS.ifAny(CollectionsKt.listOf(irValueParameter), new OooO00o(), new Function1<IrValueParameter, Boolean>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.AbstractComposeLowering.hasDefaultValueSafe.2
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(IrValueParameter irValueParameter2) {
                return Boolean.valueOf(irValueParameter2.getDefaultValue() != null);
            }
        }).booleanValue();
    }

    @NotNull
    public final IrCallImpl irAnd(@NotNull IrExpression lhs, @NotNull IrExpression rhs) {
        return irCall(binaryOperator(lhs.getType(), OperatorNameConventions.AND, rhs.getType()), null, lhs, null, rhs);
    }

    @NotNull
    public final IrExpression irAndAnd(@NotNull IrExpression lhs, @NotNull IrExpression rhs) {
        return new IrWhenImpl(-1, -1, this.context.getIrBuiltIns().getBooleanType(), IrStatementOrigin.ANDAND.INSTANCE, CollectionsKt.listOf((Object[]) new IrBranch[]{new IrBranchImpl(-1, -1, lhs, rhs), new IrElseBranchImpl(-1, -1, irConst(true), irConst(false))}));
    }

    @NotNull
    public final IrExpression irBlock(@NotNull IrType type, @Nullable IrStatementOrigin origin, @NotNull List<? extends IrStatement> statements) {
        return new IrBlockImpl(-1, -1, type, origin, statements);
    }

    @NotNull
    public final IrCallImpl irBooleanOr(@NotNull IrExpression lhs, @NotNull IrExpression rhs) {
        IrType booleanType = this.context.getIrBuiltIns().getBooleanType();
        return irCall(binaryOperator(booleanType, OperatorNameConventions.OR, booleanType), null, lhs, null, rhs);
    }

    @NotNull
    public final IrBranch irBranch(@NotNull IrExpression condition, @NotNull IrExpression result) {
        return new IrBranchImpl(condition, result);
    }

    @NotNull
    public final IrCallImpl irCall(@NotNull IrFunctionSymbol symbol, @Nullable IrStatementOrigin origin, @Nullable IrExpression dispatchReceiver, @Nullable IrExpression extensionReceiver, @NotNull IrExpression... args) {
        IrType returnType = symbol.getOwner().getReturnType();
        Intrinsics.checkNotNull(symbol, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol");
        IrSimpleFunctionSymbol irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) symbol;
        IrCallImpl irCallImpl = new IrCallImpl(-1, -1, returnType, irSimpleFunctionSymbol, irSimpleFunctionSymbol.getOwner().getTypeParameters().size(), irSimpleFunctionSymbol.getOwner().getValueParameters().size(), origin, (IrClassSymbol) null, 128, (DefaultConstructorMarker) null);
        if (dispatchReceiver != null) {
            irCallImpl.setDispatchReceiver(dispatchReceiver);
        }
        if (extensionReceiver != null) {
            irCallImpl.setExtensionReceiver(extensionReceiver);
        }
        int length = args.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            irCallImpl.putValueArgument(i2, args[i]);
            i++;
            i2++;
        }
        return irCallImpl;
    }

    @NotNull
    public final IrExpression irComposite(@NotNull IrType type, @Nullable IrStatementOrigin origin, @NotNull List<? extends IrStatement> statements) {
        return new IrCompositeImpl(-1, -1, type, origin, statements);
    }

    @NotNull
    public final IrConst<Integer> irConst(int value) {
        return new IrConstImpl<>(-1, -1, this.context.getIrBuiltIns().getIntType(), IrConstKind.Int.INSTANCE, Integer.valueOf(value));
    }

    @NotNull
    public final IrElseBranchImpl irElseBranch(@NotNull IrExpression expression, int startOffset, int endOffset) {
        return new IrElseBranchImpl(startOffset, endOffset, irConst(true), expression);
    }

    @NotNull
    public final IrExpression irEqual(@NotNull IrExpression lhs, @NotNull IrExpression rhs) {
        return irCall((IrFunctionSymbol) this.context.getIrBuiltIns().getEqeqeqSymbol(), null, null, null, lhs, rhs);
    }

    @NotNull
    public final IrStatement irForLoop(@NotNull IrType elementType, @NotNull IrExpression subject, @NotNull Function1<? super IrValueDeclaration, ? extends IrExpression> loopBody) {
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(subject.getType());
        Intrinsics.checkNotNull(classOrNull);
        Object obj = null;
        Object obj2 = null;
        boolean z = false;
        for (Object obj3 : IrUtilsKt.getFunctions(classOrNull.getOwner())) {
            if (Intrinsics.areEqual(((IrSimpleFunction) obj3).getName().asString(), "iterator")) {
                if (z) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                obj2 = obj3;
                z = true;
            }
        }
        if (!z) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        IrSimpleFunction irSimpleFunction = (IrSimpleFunction) obj2;
        IrClassifierSymbol classOrNull2 = IrTypesKt.getClassOrNull(irSimpleFunction.getReturnType());
        Intrinsics.checkNotNull(classOrNull2);
        IrType defaultType = classOrNull2.getOwner().getTypeParameters().isEmpty() ^ true ? (IrType) IrTypesKt.typeWith(classOrNull2, new IrType[]{elementType}) : IrTypesKt.getDefaultType(classOrNull2);
        Object obj4 = null;
        boolean z2 = false;
        for (Object obj5 : IrUtilsKt.getFunctions(classOrNull2.getOwner())) {
            if (Intrinsics.areEqual(((IrSimpleFunction) obj5).getName().asString(), "next")) {
                if (z2) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z2 = true;
                obj4 = obj5;
            }
        }
        if (!z2) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        IrSimpleFunction irSimpleFunction2 = (IrSimpleFunction) obj4;
        boolean z3 = false;
        for (Object obj6 : IrUtilsKt.getFunctions(classOrNull2.getOwner())) {
            if (Intrinsics.areEqual(((IrSimpleFunction) obj6).getName().asString(), "hasNext")) {
                if (z3) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z3 = true;
                obj = obj6;
            }
        }
        if (!z3) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        IrSimpleFunction irSimpleFunction3 = (IrSimpleFunction) obj;
        IrCallImpl irCallImpl = new IrCallImpl(-1, -1, defaultType, irSimpleFunction.getSymbol(), irSimpleFunction.getSymbol().getOwner().getTypeParameters().size(), irSimpleFunction.getSymbol().getOwner().getValueParameters().size(), IrStatementOrigin.FOR_LOOP_ITERATOR.INSTANCE, (IrClassSymbol) null, 128, (DefaultConstructorMarker) null);
        irCallImpl.setDispatchReceiver(subject);
        IrElement irElementIrTemporary = irTemporary((IrExpression) irCallImpl, "tmp0_iterator", defaultType, false, (IrDeclarationOrigin) IrDeclarationOrigin.FOR_LOOP_ITERATOR.INSTANCE);
        IrType unitType = this.builtIns.getUnitType();
        IrStatementOrigin irStatementOrigin = (IrStatementOrigin) IrStatementOrigin.FOR_LOOP.INSTANCE;
        IrWhileLoopImpl irWhileLoopImpl = new IrWhileLoopImpl(-1, -1, this.builtIns.getUnitType(), IrStatementOrigin.FOR_LOOP_INNER_WHILE.INSTANCE);
        IrCallImpl irCallImpl2 = new IrCallImpl(-1, -1, elementType, irSimpleFunction2.getSymbol(), irSimpleFunction2.getSymbol().getOwner().getTypeParameters().size(), irSimpleFunction2.getSymbol().getOwner().getValueParameters().size(), IrStatementOrigin.FOR_LOOP_NEXT.INSTANCE, (IrClassSymbol) null, 128, (DefaultConstructorMarker) null);
        IrValueDeclaration irValueDeclaration = (IrValueDeclaration) irElementIrTemporary;
        irCallImpl2.setDispatchReceiver(irGet(irValueDeclaration));
        IrElement irElementIrTemporary2 = irTemporary((IrExpression) irCallImpl2, AppMeasurementSdk.ConditionalUserProperty.VALUE, elementType, false, (IrDeclarationOrigin) IrDeclarationOrigin.FOR_LOOP_VARIABLE.INSTANCE);
        irWhileLoopImpl.setCondition(irCall$default(this, irSimpleFunction3.getSymbol(), IrStatementOrigin.FOR_LOOP_HAS_NEXT.INSTANCE, irGet(irValueDeclaration), null, new IrExpression[0], 8, null));
        irWhileLoopImpl.setBody(irBlock(this.builtIns.getUnitType(), (IrStatementOrigin) IrStatementOrigin.FOR_LOOP_INNER_WHILE.INSTANCE, CollectionsKt.listOf((Object[]) new IrElement[]{irElementIrTemporary2, loopBody.invoke(irElementIrTemporary2)})));
        Unit unit = Unit.INSTANCE;
        return irBlock(unitType, irStatementOrigin, CollectionsKt.listOf((Object[]) new IrElement[]{irElementIrTemporary, irWhileLoopImpl}));
    }

    @NotNull
    public final IrExpression irGet(@NotNull IrType type, @NotNull IrValueSymbol symbol) {
        return new IrGetValueImpl(-1, -1, type, symbol, (IrStatementOrigin) null, 16, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final IrExpression irGetBit(@NotNull IrDefaultBitMaskValue param, int index) {
        return irNotEqual(param.irIsolateBitAtIndex(index), (IrExpression) irConst(0));
    }

    @NotNull
    public final IrCallImpl irGreater(@NotNull IrExpression lhs, @NotNull IrExpression rhs) {
        IrSimpleFunctionSymbol irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) this.context.getIrBuiltIns().getGreaterFunByOperandType().get(IrTypesKt.getClassifierOrFail(this.context.getIrBuiltIns().getIntType()));
        Intrinsics.checkNotNull(irSimpleFunctionSymbol);
        return irCall((IrFunctionSymbol) irSimpleFunctionSymbol, (IrStatementOrigin) IrStatementOrigin.GT.INSTANCE, null, null, lhs, rhs);
    }

    @NotNull
    public final IrExpression irIf(@NotNull IrExpression condition, @NotNull IrExpression body) {
        IrExpression irIfThenElseImpl = new IrIfThenElseImpl(-1, -1, this.context.getIrBuiltIns().getUnitType(), IrStatementOrigin.IF.INSTANCE);
        irIfThenElseImpl.getBranches().add(new IrBranchImpl(condition, body));
        return irIfThenElseImpl;
    }

    @NotNull
    public final IrIfThenElseImpl irIfThenElse(@NotNull IrType type, @NotNull IrExpression condition, @NotNull IrExpression thenPart, @NotNull IrExpression elsePart, int startOffset, int endOffset) {
        IrIfThenElseImpl irIfThenElseImpl = new IrIfThenElseImpl(startOffset, endOffset, type, IrStatementOrigin.IF.INSTANCE);
        irIfThenElseImpl.getBranches().add(new IrBranchImpl(startOffset, endOffset, condition, thenPart));
        irIfThenElseImpl.getBranches().add(irElseBranch(elsePart, startOffset, endOffset));
        return irIfThenElseImpl;
    }

    @NotNull
    public final IrExpression irLambdaExpression(int startOffset, int endOffset, @NotNull IrType returnType, @NotNull Function1<? super IrSimpleFunction, Unit> body) {
        IrFactory irFactory = this.context.getIrFactory();
        IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
        irFunctionBuilder.setStartOffset(-2);
        irFunctionBuilder.setEndOffset(-2);
        irFunctionBuilder.setReturnType(returnType);
        irFunctionBuilder.setOrigin(IrDeclarationOrigin.LOCAL_FUNCTION_FOR_LAMBDA.INSTANCE);
        irFunctionBuilder.setName(SpecialNames.ANONYMOUS);
        irFunctionBuilder.setVisibility(DescriptorVisibilities.LOCAL);
        IrSimpleFunction irSimpleFunctionBuildFunction = DeclarationBuildersKt.buildFunction(irFactory, irFunctionBuilder);
        body.invoke(irSimpleFunctionBuildFunction);
        IrClassifierSymbol irClassifierSymbolFunction = AbstractComposeLoweringKt.function(this.context, irSimpleFunctionBuildFunction.getValueParameters().size());
        List valueParameters = irSimpleFunctionBuildFunction.getValueParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(valueParameters));
        Iterator it = valueParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((IrValueParameter) it.next()).getType());
        }
        return new IrFunctionExpressionImpl(startOffset, endOffset, IrTypesKt.typeWith(irClassifierSymbolFunction, CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOf(irSimpleFunctionBuildFunction.getReturnType()))), irSimpleFunctionBuildFunction, IrStatementOrigin.LAMBDA.INSTANCE);
    }

    @NotNull
    public final IrExpression irNot(@NotNull IrExpression value) {
        return irCall$default(this, this.context.getIrBuiltIns().getBooleanNotSymbol(), null, value, null, new IrExpression[0], 10, null);
    }

    @NotNull
    public final IrExpression irNotEqual(@NotNull IrExpression lhs, @NotNull IrExpression rhs) {
        return irNot(irEqual(lhs, rhs));
    }

    @NotNull
    public final IrConstImpl irNull() {
        return new IrConstImpl(-1, -1, this.context.getIrBuiltIns().getAnyNType(), IrConstKind.Null.INSTANCE, (Object) null);
    }

    @NotNull
    public final IrCallImpl irOr(@NotNull IrExpression lhs, @NotNull IrExpression rhs) {
        IrType intType = this.context.getIrBuiltIns().getIntType();
        return irCall(binaryOperator(intType, OperatorNameConventions.OR, intType), null, lhs, null, rhs);
    }

    @NotNull
    public final IrExpression irOrOr(@NotNull IrExpression lhs, @NotNull IrExpression rhs) {
        return new IrWhenImpl(-1, -1, this.context.getIrBuiltIns().getBooleanType(), IrStatementOrigin.OROR.INSTANCE, CollectionsKt.listOf((Object[]) new IrBranch[]{new IrBranchImpl(-1, -1, lhs, irConst(true)), new IrElseBranchImpl(-1, -1, irConst(true), rhs)}));
    }

    @NotNull
    public final IrExpression irReturn(@NotNull IrReturnTargetSymbol target, @NotNull IrExpression value, @NotNull IrType type) {
        return new IrReturnImpl(-1, -1, type, target, value);
    }

    @NotNull
    public final IrExpression irReturnVar(@NotNull IrReturnTargetSymbol target, @NotNull IrVariable value) {
        IrExpression initializer = value.getInitializer();
        int startOffset = initializer != null ? initializer.getStartOffset() : -1;
        IrExpression initializer2 = value.getInitializer();
        return new IrReturnImpl(startOffset, initializer2 != null ? initializer2.getEndOffset() : -1, value.getType(), target, irGet((IrValueDeclaration) value));
    }

    @NotNull
    public final IrExpression irSet(@NotNull IrValueDeclaration variable, @NotNull IrExpression value) {
        return new IrSetValueImpl(-1, -1, this.context.getIrBuiltIns().getUnitType(), variable.getSymbol(), value, (IrStatementOrigin) null);
    }

    @Nullable
    public final IrExpression irStableExpression(@NotNull Stability stability, @NotNull Function1<? super IrTypeParameter, ? extends IrExpression> function1) {
        if (!(stability instanceof Stability.Combined)) {
            if (stability instanceof Stability.Certain) {
                return (IrExpression) (((Stability.Certain) stability).getStable() ? irConst(StabilityBits.STABLE.bitsForSlot(0)) : null);
            }
            if (stability instanceof Stability.Parameter) {
                return function1.invoke(((Stability.Parameter) stability).getParameter());
            }
            if (stability instanceof Stability.Runtime) {
                IrField irFieldMakeStabilityField = makeStabilityField();
                irFieldMakeStabilityField.setParent(((Stability.Runtime) stability).getDeclaration());
                return new IrGetFieldImpl(-1, -1, irFieldMakeStabilityField.getSymbol(), irFieldMakeStabilityField.getType(), (IrStatementOrigin) null, (IrClassSymbol) null, 48, (DefaultConstructorMarker) null);
            }
            if (stability instanceof Stability.Unknown) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        Stability.Combined combined = (Stability.Combined) stability;
        List<Stability> elements = combined.getElements();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            IrExpression irExpressionIrStableExpression = irStableExpression((Stability) it.next(), function1);
            if (irExpressionIrStableExpression != null) {
                arrayList.add(irExpressionIrStableExpression);
            }
        }
        if (arrayList.size() != combined.getElements().size()) {
            return null;
        }
        if (arrayList.isEmpty()) {
            return irConst(StabilityBits.STABLE.bitsForSlot(0));
        }
        if (arrayList.size() == 1) {
            return (IrExpression) CollectionsKt.first((List) arrayList);
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = (IrExpression) irOr((IrExpression) next, (IrExpression) it2.next());
        }
        return (IrExpression) next;
    }

    @NotNull
    public final IrVariableImpl irTemporary(@NotNull IrExpression value, @NotNull String name, @NotNull IrType irType, boolean isVar, @NotNull IrDeclarationOrigin origin) {
        IrVariableImpl irVariableImpl = new IrVariableImpl(value.getStartOffset(), value.getEndOffset(), origin, new IrVariableSymbolImpl((VariableDescriptor) null, 1, (DefaultConstructorMarker) null), Name.identifier(name), irType, isVar, false, false);
        irVariableImpl.setInitializer(value);
        return irVariableImpl;
    }

    @NotNull
    public final IrWhenImpl irWhen(@NotNull IrType type, @Nullable IrStatementOrigin origin, @NotNull List<? extends IrBranch> branches) {
        return new IrWhenImpl(-1, -1, type, origin, branches);
    }

    @NotNull
    public final IrCallImpl irXor(@NotNull IrExpression lhs, @NotNull IrExpression rhs) {
        IrType intType = this.context.getIrBuiltIns().getIntType();
        return irCall(binaryOperator(intType, OperatorNameConventions.XOR, intType), null, lhs, null, rhs);
    }

    public final boolean isComposableCall(@NotNull IrCall irCall) {
        return hasComposableAnnotation((IrAnnotationContainer) irCall.getSymbol().getOwner()) || isComposableLambdaInvoke(irCall);
    }

    public final boolean isComposableDelegatedAccessor(@NotNull IrFunction irFunction) {
        boolean zAreEqual;
        IrSimpleFunctionSymbol symbol;
        if (!Intrinsics.areEqual(irFunction.getOrigin(), IrDeclarationOrigin.DELEGATED_PROPERTY_ACCESSOR.INSTANCE)) {
            return false;
        }
        IrBody body = irFunction.getBody();
        if (body != null) {
            Object objSingleOrNull = CollectionsKt.singleOrNull((List<? extends Object>) IrUtilsKt.getStatements(body));
            IrReturn irReturn = objSingleOrNull instanceof IrReturn ? (IrReturn) objSingleOrNull : null;
            IrExpression value = irReturn != null ? irReturn.getValue() : null;
            IrCall irCall = value instanceof IrCall ? (IrCall) value : null;
            IrSimpleFunction irSimpleFunction = (irCall == null || (symbol = irCall.getSymbol()) == null) ? null : (IrSimpleFunction) symbol.getOwner();
            zAreEqual = Intrinsics.areEqual(irSimpleFunction != null ? Boolean.valueOf(hasComposableAnnotation((IrAnnotationContainer) irSimpleFunction)) : null, Boolean.TRUE);
        } else {
            zAreEqual = false;
        }
        return zAreEqual;
    }

    public final boolean isComposableLambdaInvoke(@NotNull IrCall irCall) {
        IrType type;
        if (!isInvoke(irCall)) {
            return false;
        }
        IrExpression dispatchReceiver = irCall.getDispatchReceiver();
        IrExpression irExpression = null;
        if (dispatchReceiver != null) {
            IrAttributeContainer attributeOwnerId = dispatchReceiver.getAttributeOwnerId();
            irExpression = attributeOwnerId instanceof IrExpression ? (IrExpression) attributeOwnerId : null;
            if (irExpression != null) {
                dispatchReceiver = irExpression;
            }
            irExpression = dispatchReceiver;
        }
        if (irExpression == null || (type = irExpression.getType()) == null) {
            return false;
        }
        return hasComposableAnnotation((IrAnnotationContainer) type) || IrInlineReferenceLocatorKt.isSyntheticComposableFunction(type);
    }

    public final boolean isComposableSingletonClass(@NotNull IrClass irClass) {
        return Intrinsics.areEqual(WeakBindingTraceKt.getIrTrace(this.context).get(ComposeWritableSlices.INSTANCE.getIS_COMPOSABLE_SINGLETON_CLASS(), (IrAttributeContainer) irClass), Boolean.TRUE);
    }

    public final boolean isComposableSingletonGetter(@NotNull IrCall irCall) {
        return Intrinsics.areEqual(WeakBindingTraceKt.getIrTrace(this.context).get(ComposeWritableSlices.INSTANCE.getIS_COMPOSABLE_SINGLETON(), (IrAttributeContainer) irCall), Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    public final boolean isInvoke(@NotNull IrCall irCall) {
        boolean z;
        IrType defaultType;
        if (Intrinsics.areEqual(irCall.getOrigin(), IrStatementOrigin.INVOKE.INSTANCE)) {
            return true;
        }
        IrDeclaration irDeclaration = (IrSimpleFunction) irCall.getSymbol().getOwner();
        if (Intrinsics.areEqual(irDeclaration.getName(), OperatorNameConventions.INVOKE)) {
            IrClass parentClassOrNull = IrUtilsKt.getParentClassOrNull(irDeclaration);
            if (parentClassOrNull == null || (defaultType = IrUtilsKt.getDefaultType(parentClassOrNull)) == null) {
                z = false;
            } else {
                IrType irType = defaultType;
                if (IrTypeUtilsKt.isFunction(irType) || IrInlineReferenceLocatorKt.isSyntheticComposableFunction(irType)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean isStatic(@NotNull IrExpression irExpression) {
        IrPropertySymbol correspondingPropertySymbol;
        IrProperty owner;
        if ((irExpression instanceof IrConst) || (irExpression instanceof IrGetEnumValue)) {
            return true;
        }
        if (irExpression instanceof IrGetObjectValue) {
            if (((IrGetObjectValue) irExpression).getSymbol().getOwner().isCompanion()) {
                return true;
            }
            return StabilityKt.knownStable(StabilityKt.stabilityOf(irExpression.getType()));
        }
        if (irExpression instanceof IrConstructorCall) {
            return isStatic((IrConstructorCall) irExpression);
        }
        if (irExpression instanceof IrCall) {
            return isStatic((IrCall) irExpression);
        }
        if (irExpression instanceof IrGetValue) {
            IrVariable owner2 = ((IrGetValue) irExpression).getSymbol().getOwner();
            if (owner2 instanceof IrVariable) {
                IrVariable irVariable = owner2;
                if (!irVariable.isVar()) {
                    IrExpression initializer = irVariable.getInitializer();
                    if (initializer != null && isStatic(initializer)) {
                        return true;
                    }
                }
            }
        } else {
            if (irExpression instanceof IrFunctionExpression ? true : irExpression instanceof IrTypeOperatorCall) {
                Boolean bool = (Boolean) WeakBindingTraceKt.getIrTrace(this.context).get(ComposeWritableSlices.INSTANCE.getIS_STATIC_FUNCTION_EXPRESSION(), (IrAttributeContainer) irExpression);
                if (bool != null) {
                    return bool.booleanValue();
                }
            } else if ((irExpression instanceof IrGetField) && (correspondingPropertySymbol = ((IrGetField) irExpression).getSymbol().getOwner().getCorrespondingPropertySymbol()) != null && (owner = correspondingPropertySymbol.getOwner()) != null && owner.isConst()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isSyntheticComposableCall(@NotNull IrCall irCall) {
        return Intrinsics.areEqual(WeakBindingTraceKt.getIrTrace(this.context).get(ComposeWritableSlices.INSTANCE.getIS_SYNTHETIC_COMPOSABLE_CALL(), (IrAttributeContainer) irCall), Boolean.TRUE);
    }

    @NotNull
    public final IrField makeStabilityField() {
        IrFactory irFactory = this.context.getIrFactory();
        IrFieldBuilder irFieldBuilder = new IrFieldBuilder();
        irFieldBuilder.setStartOffset(-2);
        irFieldBuilder.setEndOffset(-2);
        irFieldBuilder.setName(KtxNameConventions.INSTANCE.getSTABILITY_FLAG());
        irFieldBuilder.setStatic(JvmPlatformKt.isJvm(this.context.getPlatform()));
        irFieldBuilder.setFinal(true);
        irFieldBuilder.setType(this.context.getIrBuiltIns().getIntType());
        irFieldBuilder.setVisibility(DescriptorVisibilities.PUBLIC);
        return DeclarationBuildersKt.buildField(irFactory, irFieldBuilder);
    }

    @NotNull
    public final IrProperty makeStabilityProp() {
        IrFactory irFactory = this.context.getIrFactory();
        IrPropertyBuilder irPropertyBuilder = new IrPropertyBuilder();
        irPropertyBuilder.setStartOffset(-2);
        irPropertyBuilder.setEndOffset(-2);
        irPropertyBuilder.setName(KtxNameConventions.INSTANCE.getSTABILITY_PROP_FLAG());
        irPropertyBuilder.setVisibility(DescriptorVisibilities.PRIVATE);
        return DeclarationBuildersKt.buildProperty(irFactory, irPropertyBuilder);
    }

    @NotNull
    public final FunctionMetrics metricsFor(@NotNull IrFunction function) {
        IrAttributeContainer irAttributeContainer = function instanceof IrAttributeContainer ? (IrAttributeContainer) function : null;
        if (irAttributeContainer != null) {
            WeakBindingTrace irTrace = WeakBindingTraceKt.getIrTrace(this.context);
            ComposeWritableSlices composeWritableSlices = ComposeWritableSlices.INSTANCE;
            FunctionMetrics functionMetricsMakeFunctionMetrics = (FunctionMetrics) irTrace.get(composeWritableSlices.getFUNCTION_METRICS(), irAttributeContainer);
            if (functionMetricsMakeFunctionMetrics == null) {
                functionMetricsMakeFunctionMetrics = this.metrics.makeFunctionMetrics(function);
                WeakBindingTraceKt.getIrTrace(this.context).record(composeWritableSlices.getFUNCTION_METRICS(), irAttributeContainer, functionMetricsMakeFunctionMetrics);
            }
            if (functionMetricsMakeFunctionMetrics != null) {
                return functionMetricsMakeFunctionMetrics;
            }
        }
        return this.metrics.makeFunctionMetrics(function);
    }

    @NotNull
    public final IrConstructorSymbol referenceConstructor(@NotNull IrConstructorSymbol symbol) {
        return this.symbolRemapper.getReferencedConstructor(symbol);
    }

    @NotNull
    public final IrFunctionSymbol referenceFunction(@NotNull IrFunctionSymbol symbol) {
        return this.symbolRemapper.getReferencedFunction(symbol);
    }

    @NotNull
    public final IrSimpleFunctionSymbol referenceSimpleFunction(@NotNull IrSimpleFunctionSymbol symbol) {
        return this.symbolRemapper.getReferencedSimpleFunction(symbol);
    }

    @NotNull
    public final IrType replaceArgumentsWithStarProjections(@NotNull IrType irType) {
        if (!(irType instanceof IrSimpleType)) {
            return irType;
        }
        IrSimpleType irSimpleType = (IrSimpleType) irType;
        IrClassifierSymbol classifier = irSimpleType.getClassifier();
        boolean zIsMarkedNullable = IrTypePredicatesKt.isMarkedNullable(irSimpleType);
        int size = irSimpleType.getArguments().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(IrStarProjectionImpl.INSTANCE);
        }
        return new IrSimpleTypeImpl(classifier, zIsMarkedNullable, arrayList, irType.getAnnotations(), ((IrSimpleType) irType).getAbbreviation());
    }

    public final int sourceKey(@NotNull IrSimpleFunction irSimpleFunction) {
        KeyInfo keyInfo = (KeyInfo) WeakBindingTraceKt.getIrTrace(this.context).get(ComposeWritableSlices.INSTANCE.getDURABLE_FUNCTION_KEY(), (IrAttributeContainer) irSimpleFunction);
        if (keyInfo != null) {
            keyInfo.setUsed(true);
            return keyInfo.getKey();
        }
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(irSimpleFunction.getSymbol().getDescriptor(), false, false, 1, (Object) null);
        return (AdditionalIrUtilsKt.getFqNameForIrSerialization((IrDeclarationParent) irSimpleFunction) + strComputeJvmDescriptor$default).hashCode();
    }

    @NotNull
    public final IrType unboxInlineClass(@NotNull IrType irType) {
        IrType irTypeUnboxType = unboxType(irType);
        return irTypeUnboxType == null ? irType : irTypeUnboxType;
    }

    @Nullable
    public final IrType unboxType(@NotNull IrType irType) {
        IrClass owner;
        InlineClassRepresentation inlineClassRepresentation;
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(irType);
        if (classOrNull == null || (owner = classOrNull.getOwner()) == null || (inlineClassRepresentation = IrDeclarationsKt.getInlineClassRepresentation(owner)) == null || !JvmIrTypeUtilsKt.isInlineClassType(irType)) {
            return null;
        }
        IrType irTypeUnboxInlineClass = unboxInlineClass((IrType) inlineClassRepresentation.getUnderlyingType());
        if (!org.jetbrains.kotlin.ir.types.IrTypeUtilsKt.isNullable(irType)) {
            return irTypeUnboxInlineClass;
        }
        if (!org.jetbrains.kotlin.ir.types.IrTypeUtilsKt.isNullable(irTypeUnboxInlineClass) && !IrTypePredicatesKt.isPrimitiveType$default(irTypeUnboxInlineClass, false, 1, (Object) null)) {
            return IrTypesKt.makeNullable(irTypeUnboxInlineClass);
        }
        return null;
    }

    @NotNull
    public final IrExpression unboxValueIfInline(@NotNull IrExpression irExpression) {
        IrClassSymbol classOrNull;
        boolean z;
        List valueParameters;
        if (org.jetbrains.kotlin.ir.types.IrTypeUtilsKt.isNullable(irExpression.getType()) || (classOrNull = IrTypesKt.getClassOrNull(irExpression.getType())) == null) {
            return irExpression;
        }
        IrDeclarationContainer irDeclarationContainer = (IrClass) classOrNull.getOwner();
        if (!JvmIrTypeUtilsKt.isInlineClassType(irExpression.getType())) {
            return irExpression;
        }
        if (JvmPlatformKt.isJvm(this.context.getPlatform())) {
            return unboxValueIfInline((IrExpression) coerceInlineClasses(irExpression, irExpression.getType(), unboxInlineClass(irExpression.getType())));
        }
        IrConstructor primaryConstructor = IrUtilsKt.getPrimaryConstructor(irDeclarationContainer);
        IrValueParameter irValueParameter = (primaryConstructor == null || (valueParameters = primaryConstructor.getValueParameters()) == null) ? null : (IrValueParameter) valueParameters.get(0);
        boolean z2 = true;
        if (irValueParameter != null) {
            Iterator it = IrUtilsKt.getProperties(irDeclarationContainer).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                IrProperty irProperty = (IrProperty) it.next();
                if (Intrinsics.areEqual(irProperty.getName(), irValueParameter.getName()) && irProperty.getGetter() != null) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            return irExpression;
        }
        Intrinsics.checkNotNull(irValueParameter);
        IrFunctionSymbol propertyGetter = AdditionalIrUtilsKt.getPropertyGetter(irDeclarationContainer, irValueParameter.getName().getIdentifier());
        if (propertyGetter != null) {
            return unboxValueIfInline((IrExpression) irCall$default(this, propertyGetter, null, irExpression, null, new IrExpression[0], 10, null));
        }
        throw new IllegalStateException("Expected a getter".toString());
    }

    @NotNull
    public final IrExpression irGet(@NotNull IrValueDeclaration variable) {
        return irGet(variable.getType(), variable.getSymbol());
    }

    @NotNull
    public final IrConst<Long> irConst(long value) {
        return new IrConstImpl<>(-1, -1, this.context.getIrBuiltIns().getLongType(), IrConstKind.Long.INSTANCE, Long.valueOf(value));
    }

    @NotNull
    public final IrConst<String> irConst(@NotNull String value) {
        return new IrConstImpl<>(-1, -1, this.context.getIrBuiltIns().getStringType(), IrConstKind.String.INSTANCE, value);
    }

    @NotNull
    public final IrConstImpl<Boolean> irConst(boolean value) {
        return new IrConstImpl<>(-1, -1, this.context.getIrBuiltIns().getBooleanType(), IrConstKind.Boolean.INSTANCE, Boolean.valueOf(value));
    }

    private final boolean isStatic(IrConstructorCall irConstructorCall) {
        if (JvmIrTypeUtilsKt.isInlineClassType(irConstructorCall.getType())) {
            if (!StabilityKt.knownStable(StabilityKt.stabilityOf(unboxInlineClass(irConstructorCall.getType())))) {
                return false;
            }
            IrExpression valueArgument = irConstructorCall.getValueArgument(0);
            return valueArgument != null && isStatic(valueArgument);
        }
        if (AbstractComposeLoweringKt.hasAnnotationSafe(IrUtilsKt.getParentAsClass(irConstructorCall.getSymbol().getOwner()), ComposeFqNames.INSTANCE.getImmutable())) {
            return areAllArgumentsStatic((IrMemberAccessExpression) irConstructorCall);
        }
        return false;
    }

    private final boolean isStatic(IrCall irCall) {
        IrPropertySymbol correspondingPropertySymbol;
        IrAnnotationContainer irAnnotationContainer;
        IrSimpleFunction owner = irCall.getSymbol().getOwner();
        FqName kotlinFqName = AdditionalIrUtilsKt.getKotlinFqName((IrDeclarationParent) owner);
        IrStatementOrigin origin = irCall.getOrigin();
        if (origin instanceof IrStatementOrigin.GET_PROPERTY) {
            IrSimpleFunction irSimpleFunction = owner instanceof IrSimpleFunction ? owner : null;
            if (irSimpleFunction == null || (correspondingPropertySymbol = irSimpleFunction.getCorrespondingPropertySymbol()) == null || (irAnnotationContainer = (IrProperty) correspondingPropertySymbol.getOwner()) == null) {
                return false;
            }
            if (irAnnotationContainer.isConst()) {
                return true;
            }
            boolean zKnownStable = StabilityKt.knownStable(StabilityKt.stabilityOf(irCall.getType()));
            IrExpression dispatchReceiver = irCall.getDispatchReceiver();
            boolean z = !((dispatchReceiver == null || isStatic(dispatchReceiver)) ? false : true);
            IrExpression extensionReceiver = irCall.getExtensionReceiver();
            boolean z2 = !((extensionReceiver == null || isStatic(extensionReceiver)) ? false : true);
            if (!irAnnotationContainer.isVar()) {
                IrSimpleFunction getter = irAnnotationContainer.getGetter();
                if (Intrinsics.areEqual(getter != null ? getter.getOrigin() : null, IrDeclarationOrigin.DEFAULT_PROPERTY_ACCESSOR.INSTANCE) && zKnownStable && z && z2) {
                    return true;
                }
            }
            ComposeFqNames composeFqNames = ComposeFqNames.INSTANCE;
            return (IrUtilsKt.hasAnnotation(irAnnotationContainer, composeFqNames.getStable()) || IrUtilsKt.hasAnnotation((IrAnnotationContainer) owner, composeFqNames.getStable())) && zKnownStable && z && z2;
        }
        if (origin instanceof IrStatementOrigin.PLUS ? true : origin instanceof IrStatementOrigin.MUL ? true : origin instanceof IrStatementOrigin.MINUS ? true : origin instanceof IrStatementOrigin.ANDAND ? true : origin instanceof IrStatementOrigin.OROR ? true : origin instanceof IrStatementOrigin.DIV ? true : origin instanceof IrStatementOrigin.EQ ? true : origin instanceof IrStatementOrigin.EQEQ ? true : origin instanceof IrStatementOrigin.EQEQEQ ? true : origin instanceof IrStatementOrigin.GT ? true : origin instanceof IrStatementOrigin.GTEQ ? true : origin instanceof IrStatementOrigin.LT ? true : origin instanceof IrStatementOrigin.LTEQ) {
            boolean z3 = Intrinsics.areEqual(AbstractComposeLoweringKt.topLevelName(kotlinFqName), Constants.SDK_LANGUAGE) || IrUtilsKt.hasAnnotation((IrAnnotationContainer) owner, ComposeFqNames.INSTANCE.getStable());
            if (!StabilityKt.knownStable(StabilityKt.stabilityOf(irCall.getType())) || !z3) {
                return false;
            }
            List argumentsWithIr = IrUtilsKt.getArgumentsWithIr((IrMemberAccessExpression) irCall);
            if (!(argumentsWithIr instanceof Collection) || !argumentsWithIr.isEmpty()) {
                Iterator it = argumentsWithIr.iterator();
                while (it.hasNext()) {
                    if (!isStatic((IrExpression) ((Pair) it.next()).getSecond())) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (origin != null) {
            return false;
        }
        ComposeFqNames composeFqNames2 = ComposeFqNames.INSTANCE;
        if (Intrinsics.areEqual(kotlinFqName, composeFqNames2.getRemember())) {
            if (irCall.getValueArgumentsCount() == 3 && StabilityKt.knownStable(StabilityKt.stabilityOf(irCall.getType()))) {
                return true;
            }
        } else {
            if (Intrinsics.areEqual(kotlinFqName, composeFqNames2.getCache())) {
                if (irCall.getValueArgumentsCount() != 2) {
                    return false;
                }
                IrExpression valueArgument = irCall.getValueArgument(0);
                return (valueArgument != null && IrUtilsKt.isFalseConst(valueArgument)) && StabilityKt.knownStable(StabilityKt.stabilityOf(irCall.getType()));
            }
            if (Intrinsics.areEqual(kotlinFqName, composeFqNames2.getComposableLambda())) {
                return true;
            }
        }
        if (Intrinsics.areEqual(WeakBindingTraceKt.getIrTrace(this.context).get(ComposeWritableSlices.INSTANCE.getIS_COMPOSABLE_SINGLETON(), (IrAttributeContainer) irCall), Boolean.TRUE)) {
            return true;
        }
        if (KnownStableConstructs.INSTANCE.getStableFunctions().containsKey(kotlinFqName.asString()) || (IrUtilsKt.hasAnnotation(irCall.getSymbol().getOwner(), composeFqNames2.getStable()) && StabilityKt.knownStable(StabilityKt.stabilityOf(irCall.getType())))) {
            return areAllArgumentsStatic((IrMemberAccessExpression) irCall);
        }
        return false;
    }
}
