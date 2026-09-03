package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.compiler.plugins.kotlin.ComposeCallableIds;
import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import androidx.compose.compiler.plugins.kotlin.FunctionMetrics;
import androidx.compose.compiler.plugins.kotlin.KtxNameConventions;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.WeakBindingTraceKt;
import androidx.compose.compiler.plugins.kotlin.analysis.ComposeWritableSlices;
import androidx.compose.compiler.plugins.kotlin.analysis.Stability;
import androidx.compose.compiler.plugins.kotlin.analysis.StabilityKt;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyFqNames;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.FileLoweringPass;
import org.jetbrains.kotlin.backend.common.UtilsKt;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder;
import org.jetbrains.kotlin.backend.jvm.JvmLoweredDeclarationOrigin;
import org.jetbrains.kotlin.backend.jvm.ir.JvmIrTypeUtilsKt;
import org.jetbrains.kotlin.builtins.PrimitiveType;
import org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException;
import org.jetbrains.kotlin.descriptors.VariableDescriptor;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrFileEntry;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.builders.ExpressionHelpersKt;
import org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder;
import org.jetbrains.kotlin.ir.builders.IrBuilderWithScope;
import org.jetbrains.kotlin.ir.builders.declarations.DeclarationBuildersKt;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer;
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationBase;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationWithName;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrEnumEntry;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrPackageFragment;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrTypeAlias;
import org.jetbrains.kotlin.ir.declarations.IrTypeParameter;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.IrVariable;
import org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl;
import org.jetbrains.kotlin.ir.expressions.IrBlock;
import org.jetbrains.kotlin.ir.expressions.IrBody;
import org.jetbrains.kotlin.ir.expressions.IrBranch;
import org.jetbrains.kotlin.ir.expressions.IrBreakContinue;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstKind;
import org.jetbrains.kotlin.ir.expressions.IrContainerExpression;
import org.jetbrains.kotlin.ir.expressions.IrContinue;
import org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop;
import org.jetbrains.kotlin.ir.expressions.IrElseBranch;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;
import org.jetbrains.kotlin.ir.expressions.IrLoop;
import org.jetbrains.kotlin.ir.expressions.IrReturn;
import org.jetbrains.kotlin.ir.expressions.IrSpreadElement;
import org.jetbrains.kotlin.ir.expressions.IrStatementContainer;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.IrVararg;
import org.jetbrains.kotlin.ir.expressions.IrWhen;
import org.jetbrains.kotlin.ir.expressions.IrWhileLoop;
import org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrIfThenElseImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrSpreadElementImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrWhenImpl;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrPropertySymbol;
import org.jetbrains.kotlin.ir.symbols.IrReturnTargetSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrVariableSymbol;
import org.jetbrains.kotlin.ir.symbols.impl.IrVariableSymbolImpl;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypeArgument;
import org.jetbrains.kotlin.ir.types.IrTypePredicatesKt;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrTypeUtilsKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.util.PatchDeclarationParentsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformer;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.platform.JsPlatformKt;
import org.jetbrains.kotlin.platform.jvm.JvmPlatformKt;
import org.jetbrains.kotlin.util.OperatorNameConventions;
import p022Oooo00O.o00O00OO;
import p031OoooO0.o00Ooo;
import p031OoooO0.o0OoOo0;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\fÛ\u0002Ü\u0002Ý\u0002Þ\u0002ß\u0002à\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\n\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0002J\u001a\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u000e\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010tH\u0002JH\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010t2\u000e\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010t2\u000e\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010t2\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008e\u00012\n\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0002Jc\u0010\u0094\u0001\u001a\u00020\u000b2\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\b\u0010\u0097\u0001\u001a\u00030\u0098\u00012\b\u0010\u0099\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020\u001e2\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u00012\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0002J\t\u0010£\u0001\u001a\u00020\u000bH\u0002J\n\u0010¤\u0001\u001a\u00030\u008a\u0001H\u0002J6\u0010¥\u0001\u001a\u00030\u008a\u00012\b\u0010¦\u0001\u001a\u00030\u0082\u00012\u000f\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010¨\u00012\u000f\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010¨\u0001H\u0002J\u001c\u0010ª\u0001\u001a\u00030\u008a\u00012\u0007\u0010«\u0001\u001a\u00020\u000b2\u0007\u0010¬\u0001\u001a\u00020\u000bH\u0002J,\u0010\u00ad\u0001\u001a\u00030\u008a\u00012\b\u0010®\u0001\u001a\u00030¯\u00012\u0016\u0010°\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008a\u00010±\u0001H\u0002J,\u0010²\u0001\u001a\u00030\u008a\u00012\b\u0010³\u0001\u001a\u00030´\u00012\u0016\u0010°\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u008c\u0001\u0012\u0005\u0012\u00030\u008a\u00010±\u0001H\u0002J\u001d\u0010µ\u0001\u001a\u00020\u000b2\b\u0010¶\u0001\u001a\u00030\u008e\u00012\b\u0010·\u0001\u001a\u00030¸\u0001H\u0002J\n\u0010¹\u0001\u001a\u00030º\u0001H\u0002J\u0014\u0010»\u0001\u001a\u00030\u008c\u00012\b\u0010¼\u0001\u001a\u00030½\u0001H\u0002J2\u0010¾\u0001\u001a\u0003H¿\u0001\"\u0005\b\u0000\u0010¿\u00012\u0007\u0010\u009b\u0001\u001a\u00020'2\u000f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u0003H¿\u00010¨\u0001H\u0082\b¢\u0006\u0003\u0010Á\u0001J\u001e\u0010Â\u0001\u001a\u00030\u008c\u00012\b\u0010Ã\u0001\u001a\u00030º\u00012\b\u0010Ä\u0001\u001a\u00030º\u0001H\u0002J;\u0010Å\u0001\u001a\u00030\u008c\u00012\b\u0010Æ\u0001\u001a\u00030º\u00012\b\u0010Ç\u0001\u001a\u00030º\u00012\u0007\u0010È\u0001\u001a\u00020v2\b\u0010É\u0001\u001a\u00030\u008c\u00012\b\u0010Ê\u0001\u001a\u00030\u008c\u0001H\u0002J+\u0010Ë\u0001\u001a\u00030Ì\u00012\u0007\u0010Í\u0001\u001a\u00020z2\n\b\u0002\u0010Æ\u0001\u001a\u00030º\u00012\n\b\u0002\u0010Ç\u0001\u001a\u00030º\u0001H\u0002J\u0014\u0010Î\u0001\u001a\u00030\u008c\u00012\b\u0010Ï\u0001\u001a\u00030\u008c\u0001H\u0002J\u0016\u0010Ð\u0001\u001a\u0005\u0018\u00010\u008c\u00012\b\u0010Ñ\u0001\u001a\u00030\u008c\u0001H\u0002J.\u0010Ò\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010Æ\u0001\u001a\u00030º\u00012\n\b\u0002\u0010Ç\u0001\u001a\u00030º\u00012\n\b\u0002\u0010Ó\u0001\u001a\u00030Ô\u0001H\u0002J\u0012\u0010Õ\u0001\u001a\u00030Ì\u00012\b\u0010Ó\u0001\u001a\u00030Ô\u0001J\n\u0010Ö\u0001\u001a\u00030Ì\u0001H\u0002J\n\u0010×\u0001\u001a\u00030\u008c\u0001H\u0002J\u0014\u0010Ø\u0001\u001a\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002J,\u0010Ù\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010Æ\u0001\u001a\u00030º\u00012\n\b\u0002\u0010Ç\u0001\u001a\u00030º\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002J\u0014\u0010Ú\u0001\u001a\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002J3\u0010Û\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u001e2\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u00012\b\u0010Ü\u0001\u001a\u00030º\u0001H\u0002J\u001e\u0010Ý\u0001\u001a\u00030\u008c\u00012\b\u0010Þ\u0001\u001a\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002J\u0011\u0010ß\u0001\u001a\n\u0012\u0005\u0012\u00030º\u00010à\u0001H\u0002J\u0016\u0010á\u0001\u001a\u0005\u0018\u00010\u008c\u00012\b\u0010â\u0001\u001a\u00030\u008c\u0001H\u0002J\u001e\u0010ã\u0001\u001a\u00030\u008c\u00012\b\u0010ä\u0001\u001a\u00030 \u00012\b\u0010Ä\u0001\u001a\u00030º\u0001H\u0002J\n\u0010å\u0001\u001a\u00030Ì\u0001H\u0002J\f\u0010æ\u0001\u001a\u0005\u0018\u00010\u008c\u0001H\u0002J\u001e\u0010ç\u0001\u001a\u00030\u008c\u00012\b\u0010è\u0001\u001a\u00030\u009d\u00012\b\u0010Ä\u0001\u001a\u00030º\u0001H\u0002J\u001a\u0010é\u0001\u001a\u00030\u008c\u00012\u000e\u0010ê\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010tH\u0002J5\u0010ë\u0001\u001a\u00030Ì\u00012\b\u0010ì\u0001\u001a\u00030\u008c\u00012\u0007\u0010Í\u0001\u001a\u00020z2\n\b\u0002\u0010Æ\u0001\u001a\u00030º\u00012\n\b\u0002\u0010Ç\u0001\u001a\u00030º\u0001H\u0002J<\u0010í\u0001\u001a\u00030\u008c\u00012\b\u0010ì\u0001\u001a\u00030\u008c\u00012\b\u0010³\u0001\u001a\u00030î\u00012\u0016\u0010ï\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u008c\u00010ð\u0001\"\u00030\u008c\u0001H\u0002¢\u0006\u0003\u0010ñ\u0001J\u001e\u0010ò\u0001\u001a\u00030\u008c\u00012\b\u0010Æ\u0001\u001a\u00030º\u00012\b\u0010Ç\u0001\u001a\u00030º\u0001H\u0002J\u0014\u0010ó\u0001\u001a\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002J\u001e\u0010ô\u0001\u001a\u00030\u008c\u00012\b\u0010õ\u0001\u001a\u00030\u0096\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002J*\u0010ö\u0001\u001a\u00030\u008c\u00012\b\u0010õ\u0001\u001a\u00030\u0096\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010÷\u0001\u001a\u00030\u008c\u0001H\u0002J\u0014\u0010ø\u0001\u001a\u00030\u008c\u00012\b\u0010õ\u0001\u001a\u00030\u0096\u0001H\u0002J(\u0010ù\u0001\u001a\u00030\u008c\u00012\b\u0010õ\u0001\u001a\u00030\u0096\u00012\b\u0010ú\u0001\u001a\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002JB\u0010û\u0001\u001a\u00030\u008c\u00012\b\u0010õ\u0001\u001a\u00030\u0096\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010÷\u0001\u001a\u00030\u008c\u00012\n\b\u0002\u0010Æ\u0001\u001a\u00030º\u00012\n\b\u0002\u0010Ç\u0001\u001a\u00030º\u0001H\u0002J*\u0010ü\u0001\u001a\u00030\u008c\u00012\b\u0010õ\u0001\u001a\u00030\u0096\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010÷\u0001\u001a\u00030\u008c\u0001H\u0002JA\u0010ý\u0001\u001a\u00030þ\u00012\b\u0010Ï\u0001\u001a\u00030\u008c\u00012\f\b\u0002\u0010ÿ\u0001\u001a\u0005\u0018\u00010\u0086\u00012\t\b\u0002\u0010\u0080\u0002\u001a\u00020v2\t\b\u0002\u0010\u0081\u0002\u001a\u00020\u000b2\t\b\u0002\u0010\u0082\u0002\u001a\u00020\u000bJ\f\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u008c\u0001H\u0002J\u001f\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u008c\u00012\b\u0010÷\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u001eH\u0002J\u0016\u0010\u0085\u0002\u001a\u0005\u0018\u00010\u008c\u00012\b\u0010·\u0001\u001a\u00030\u0086\u0002H\u0002J\u001e\u0010\u0087\u0002\u001a\u00030\u008c\u00012\b\u0010\u0088\u0002\u001a\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002J\u0014\u0010\u0089\u0002\u001a\u00030\u008a\u00012\b\u0010\u008a\u0002\u001a\u00030\u008b\u0002H\u0016J\u0014\u0010\u0089\u0002\u001a\u00030\u008a\u00012\b\u0010\u008c\u0002\u001a\u00030\u008d\u0002H\u0016J'\u0010\u008e\u0002\u001a\u00020\u000b2\u0007\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020\u001e2\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001H\u0002J\u001b\u0010\u008f\u0002\u001a\u00020\u000b2\u0007\u0010\u009a\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020\u001eH\u0002J\n\u0010\u0090\u0002\u001a\u00030\u0091\u0002H\u0002J\n\u0010\u0092\u0002\u001a\u00030Ô\u0001H\u0002J\u001d\u0010\u0093\u0002\u001a\u00030\u008e\u00012\b\u0010Ñ\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u0094\u0002\u001a\u00020\u000bH\u0002J\u001e\u0010\u0095\u0002\u001a\u00030\u008a\u00012\b\u0010Ñ\u0001\u001a\u00030\u008c\u00012\b\u0010¶\u0001\u001a\u00030\u008e\u0001H\u0002J\n\u0010\u0096\u0002\u001a\u00030\u0086\u0001H\u0002J\u0014\u0010\u0097\u0002\u001a\u00030\u008a\u00012\b\u0010\u0098\u0002\u001a\u00030\u0096\u0001H\u0002J(\u0010\u0099\u0002\u001a\u00030\u008a\u00012\b\u0010\u0098\u0002\u001a\u00030Ì\u00012\b\u0010\u009a\u0002\u001a\u00030º\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002J\u0013\u0010\u009b\u0002\u001a\u00030¢\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u001eH\u0002J\u0014\u0010\u009c\u0002\u001a\u00030\u008c\u00012\b\u0010\u009d\u0002\u001a\u00030\u009e\u0002H\u0016J\u0014\u0010\u009f\u0002\u001a\u00030\u008c\u00012\b\u0010®\u0001\u001a\u00030¯\u0001H\u0016J\u0014\u0010 \u0002\u001a\u00030\u008c\u00012\b\u0010\u009d\u0002\u001a\u00030Ì\u0001H\u0016J\u0014\u0010¡\u0002\u001a\u00030¢\u00022\b\u0010£\u0002\u001a\u00030¤\u0002H\u0016J\u0014\u0010¥\u0002\u001a\u00030\u008c\u00012\b\u0010\u009d\u0002\u001a\u00030Ì\u0001H\u0002J&\u0010¦\u0002\u001a\u00030¢\u00022\u0007\u0010£\u0002\u001a\u00020z2\u0007\u0010\u009b\u0001\u001a\u00020\u001e2\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0002J\u0014\u0010§\u0002\u001a\u00030¢\u00022\b\u0010£\u0002\u001a\u00030¨\u0002H\u0016J\u0014\u0010©\u0002\u001a\u00030\u008c\u00012\b\u0010¼\u0001\u001a\u00030ª\u0002H\u0016J\u0014\u0010«\u0002\u001a\u00030¢\u00022\b\u0010£\u0002\u001a\u00030¬\u0002H\u0016J\u0014\u0010\u00ad\u0002\u001a\u00030\u008b\u00022\b\u0010£\u0002\u001a\u00030\u008b\u0002H\u0016J\u0013\u0010®\u0002\u001a\u00030¢\u00022\u0007\u0010£\u0002\u001a\u00020zH\u0016J\u0013\u0010¯\u0002\u001a\u00030¢\u00022\u0007\u0010£\u0002\u001a\u00020zH\u0002J\u0014\u0010°\u0002\u001a\u00030\u008c\u00012\b\u0010\u009d\u0002\u001a\u00030±\u0002H\u0016J\u0014\u0010²\u0002\u001a\u00030\u008c\u00012\b\u0010\u009d\u0002\u001a\u00030Ì\u0001H\u0002J2\u0010³\u0002\u001a\u00030¢\u00022\u0007\u0010£\u0002\u001a\u00020z2\u0007\u0010\u009b\u0001\u001a\u00020\u001e2\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001H\u0002J\u0014\u0010´\u0002\u001a\u00030\u008c\u00012\b\u0010\u009d\u0002\u001a\u00030Ì\u0001H\u0002J\u0013\u0010µ\u0002\u001a\u00030¢\u00022\u0007\u0010£\u0002\u001a\u00020\"H\u0016J\u0014\u0010¶\u0002\u001a\u00030\u008c\u00012\b\u0010\u009d\u0002\u001a\u00030Ì\u0001H\u0002J2\u0010·\u0002\u001a\u00030¢\u00022\u0007\u0010£\u0002\u001a\u00020z2\u0007\u0010\u009b\u0001\u001a\u00020\u001e2\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001H\u0002J\u0014\u0010¸\u0002\u001a\u00030\u008c\u00012\b\u0010\u009d\u0002\u001a\u00030¹\u0002H\u0016J\u0014\u0010º\u0002\u001a\u00030\u008c\u00012\b\u0010\u009d\u0002\u001a\u00030»\u0002H\u0016J\u0014\u0010¼\u0002\u001a\u00030\u008c\u00012\b\u0010¼\u0001\u001a\u00030½\u0002H\u0016J7\u0010¾\u0002\u001a\u0003H¿\u0002\"\t\b\u0000\u0010¿\u0002*\u00020'2\b\u0010\u009b\u0001\u001a\u0003H¿\u00022\u000f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010¨\u0001H\u0082\b¢\u0006\u0003\u0010À\u0002J,\u0010Á\u0002\u001a\u0013\u0012\u0005\u0012\u00030\u0091\u0002\u0012\u0007\u0012\u0005\u0018\u00010Ã\u00020Â\u0002*\u00030Ä\u00022\u000b\b\u0002\u0010Å\u0002\u001a\u0004\u0018\u00010zH\u0002J\u0019\u0010Æ\u0002\u001a\u00030\u008c\u0001*\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002J\u0019\u0010Ç\u0002\u001a\u00030\u008c\u0001*\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002J\u000e\u0010È\u0002\u001a\u00020\u000b*\u00030\u008c\u0001H\u0002J:\u0010É\u0002\u001a\u00030\u008a\u0001*\u00020'2)\b\u0004\u0010À\u0001\u001a\"\u0012\u0016\u0012\u00140'¢\u0006\u000f\bÊ\u0002\u0012\n\bË\u0002\u0012\u0005\b\b(\u009b\u0001\u0012\u0005\u0012\u00030\u008a\u00010±\u0001H\u0082\bJ'\u0010Ò\u0001\u001a\u00030\u008c\u0001*\u00030\u0082\u00012\n\b\u0002\u0010Æ\u0001\u001a\u00030º\u00012\n\b\u0002\u0010Ç\u0001\u001a\u00030º\u0001H\u0002J\u0016\u0010Ì\u0002\u001a\n\u0012\u0005\u0012\u00030º\u00010à\u0001*\u00030\u0096\u0001H\u0002J\r\u0010Í\u0002\u001a\u00020\u000b*\u00020zH\u0002J\u000f\u0010Î\u0002\u001a\u00030º\u0001*\u00030\u0096\u0001H\u0002J\u000f\u0010Ï\u0002\u001a\u0004\u0018\u00010\u0018*\u00020vH\u0002J8\u0010Ð\u0002\u001a\u0011\u0012\u0005\u0012\u0003H¿\u0002\u0012\u0005\u0012\u00030\u008c\u00010Â\u0002\"\t\b\u0000\u0010¿\u0002*\u00020'*\u00030\u008c\u00012\b\u0010\u009b\u0001\u001a\u0003H¿\u0002H\u0002¢\u0006\u0003\u0010Ñ\u0002J\u0019\u0010Ò\u0002\u001a\u00030Ó\u0002*\u00030\u008c\u00012\b\u0010Ô\u0002\u001a\u00030Ã\u0002H\u0002J\u0019\u0010Õ\u0002\u001a\u00030\u008c\u0001*\u00030\u009e\u00022\b\u0010\u009b\u0001\u001a\u00030\u0082\u0001H\u0002JP\u0010Ö\u0002\u001a\u00030\u008c\u0001*\u00030¢\u00022\b\u0010Æ\u0001\u001a\u00030º\u00012\b\u0010Ç\u0001\u001a\u00030º\u00012\u0007\u0010×\u0002\u001a\u00020v2\u0010\b\u0002\u0010Ø\u0002\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010t2\u0010\b\u0002\u0010Ù\u0002\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010tH\u0002J3\u0010Ö\u0002\u001a\u00030\u008c\u0001*\u00030\u008c\u00012\u0010\b\u0002\u0010Ø\u0002\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010t2\u0010\b\u0002\u0010Ù\u0002\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010tH\u0002J\"\u0010Ú\u0002\u001a\u00030\u008a\u0001*\u00030\u0091\u00022\b\u0010÷\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u001eH\u0002R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010!\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b#\u0010$R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0013\u001a\u0004\b)\u0010$R\u001b\u0010+\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0013\u001a\u0004\b,\u0010\u0011R\u001b\u0010.\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b/\u0010\u0011R\u001b\u00101\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0013\u001a\u0004\b2\u0010\u0011R\u001b\u00104\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0013\u001a\u0004\b5\u0010\u0011R\u001d\u00107\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0013\u001a\u0004\b8\u0010\u0011R\u000e\u0010:\u001a\u00020;X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001b\u0010>\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0013\u001a\u0004\b>\u0010$R\u001d\u0010@\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0013\u001a\u0004\b@\u0010\u0011R\u001b\u0010B\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u0013\u001a\u0004\bC\u0010\u0011R\u0014\u0010E\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010=R\u001b\u0010G\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\u0013\u001a\u0004\bH\u0010\u0011R\u001b\u0010J\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u0013\u001a\u0004\bK\u0010\u0011R\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010P\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u0013\u001a\u0004\bQ\u0010\u0011R\u001b\u0010S\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\u0013\u001a\u0004\bT\u0010\u0011R\u001b\u0010V\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010\u0013\u001a\u0004\bW\u0010\u0011R\u001b\u0010Y\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\u0013\u001a\u0004\bZ\u0010\u0011R\u001b\u0010\\\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010\u0013\u001a\u0004\b]\u0010\u0011R\u001b\u0010_\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010\u0013\u001a\u0004\b`\u0010\u0011R\u001b\u0010b\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010\u0013\u001a\u0004\bc\u0010\u0011R\u001d\u0010e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010\u0013\u001a\u0004\bf\u0010\u0011R\u0014\u0010h\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010=R\u001d\u0010j\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010\u0013\u001a\u0004\bk\u0010\u0011R\u001d\u0010m\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010\u0013\u001a\u0004\bn\u0010\u0011R\u001b\u0010p\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010\u0013\u001a\u0004\bq\u0010\u0011R\u001e\u0010s\u001a\b\u0012\u0004\u0012\u00020u0t*\u00020v8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0018\u0010y\u001a\u00020\u000b*\u00020z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0018\u0010}\u001a\u00020\u000b*\u00020z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b~\u0010|R\u0019\u0010\u007f\u001a\u00020\u000b*\u00020z8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010|R\u001c\u0010\u0081\u0001\u001a\u00020\u000b*\u00030\u0082\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001*\u00030\u0082\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006á\u0002"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering;", "Lorg/jetbrains/kotlin/backend/common/FileLoweringPass;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "sourceInformationEnabled", "", "intrinsicRememberEnabled", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;ZZ)V", "cacheFunction", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "getCacheFunction", "()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "cacheFunction$delegate", "Landroidx/compose/compiler/plugins/kotlin/lower/GuardedLazy;", "changedFunction", "changedInstanceFunction", "changedPrimitiveFunctions", "", "Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "getChangedPrimitiveFunctions", "()Ljava/util/Map;", "changedPrimitiveFunctions$delegate", "collectSourceInformation", "currentFunctionScope", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FunctionScope;", "getCurrentFunctionScope", "()Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FunctionScope;", "currentMarkerProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "getCurrentMarkerProperty", "()Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "currentMarkerProperty$delegate", "currentScope", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "defaultsInvalidFunction", "getDefaultsInvalidFunction", "defaultsInvalidFunction$delegate", "endDefaultsFunction", "getEndDefaultsFunction", "endDefaultsFunction$delegate", "endMovableFunction", "getEndMovableFunction", "endMovableFunction$delegate", "endReplaceableFunction", "getEndReplaceableFunction", "endReplaceableFunction$delegate", "endRestartGroupFunction", "getEndRestartGroupFunction", "endRestartGroupFunction$delegate", "endToMarkerFunction", "getEndToMarkerFunction", "endToMarkerFunction$delegate", "inlineLambdaInfo", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposeInlineLambdaLocator;", "isInComposableScope", "()Z", "isSkippingFunction", "isSkippingFunction$delegate", "isTraceInProgressFunction", "isTraceInProgressFunction$delegate", "joinKeyFunction", "getJoinKeyFunction", "joinKeyFunction$delegate", "rollbackGroupMarkerEnabled", "getRollbackGroupMarkerEnabled", "skipCurrentGroupFunction", "getSkipCurrentGroupFunction", "skipCurrentGroupFunction$delegate", "skipToGroupEndFunction", "getSkipToGroupEndFunction", "skipToGroupEndFunction$delegate", "sourceFixups", "", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$SourceInfoFixup;", "sourceInformationFunction", "getSourceInformationFunction", "sourceInformationFunction$delegate", "sourceInformationMarkerEndFunction", "getSourceInformationMarkerEndFunction", "sourceInformationMarkerEndFunction$delegate", "sourceInformationMarkerStartFunction", "getSourceInformationMarkerStartFunction", "sourceInformationMarkerStartFunction$delegate", "startDefaultsFunction", "getStartDefaultsFunction", "startDefaultsFunction$delegate", "startMovableFunction", "getStartMovableFunction", "startMovableFunction$delegate", "startReplaceableFunction", "getStartReplaceableFunction", "startReplaceableFunction$delegate", "startRestartGroupFunction", "getStartRestartGroupFunction", "startRestartGroupFunction$delegate", "traceEventEndFunction", "getTraceEventEndFunction", "traceEventEndFunction$delegate", "traceEventMarkersEnabled", "getTraceEventMarkersEnabled", "traceEventStartFunction", "getTraceEventStartFunction", "traceEventStartFunction$delegate", "updateChangedFlagsFunction", "getUpdateChangedFlagsFunction", "updateChangedFlagsFunction$delegate", "updateScopeFunction", "getUpdateScopeFunction", "updateScopeFunction$delegate", "arguments", "", "Lorg/jetbrains/kotlin/ir/types/IrTypeArgument;", "Lorg/jetbrains/kotlin/ir/types/IrType;", "getArguments", "(Lorg/jetbrains/kotlin/ir/types/IrType;)Ljava/util/List;", "hasExplicitGroups", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "getHasExplicitGroups", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)Z", "hasNonRestartableAnnotation", "getHasNonRestartableAnnotation", "hasReadOnlyAnnotation", "getHasReadOnlyAnnotation", "hasSourceInformation", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "getHasSourceInformation", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;)Z", "sourceInformation", "", "getSourceInformation", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;)Ljava/lang/String;", "applySourceFixups", "", "buildChangedParamForCall", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", NativeProtocol.WEB_DIALOG_PARAMS, "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$ParamMeta;", "buildChangedParamsForCall", "contextParams", "valueParams", "extensionParam", "dispatchParam", "buildPreambleStatementsAndReturnIfSkippingPossible", "sourceElement", "Lorg/jetbrains/kotlin/ir/IrElement;", "skipPreamble", "Lorg/jetbrains/kotlin/ir/expressions/IrStatementContainer;", "bodyPreamble", "isSkippableDeclaration", "scope", "dirty", "Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;", "changedParam", "defaultParam", "Landroidx/compose/compiler/plugins/kotlin/lower/IrDefaultBitMaskValue;", "defaultScope", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$ParametersScope;", "canElideRememberGroup", "encounteredCapturedComposableCall", "encounteredCoalescableGroup", "coalescableScope", "realizeGroup", "Lkotlin/Function0;", "makeEnd", "encounteredComposableCall", "withGroups", "isCached", "encounteredJump", "jump", "Lorg/jetbrains/kotlin/ir/expressions/IrBreakContinue;", "extraEndLocation", "Lkotlin/Function1;", "encounteredReturn", "symbol", "Lorg/jetbrains/kotlin/ir/symbols/IrReturnTargetSymbol;", "extractParamMetaFromScopes", "meta", "param", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "functionSourceKey", "", "handleLoop", "loop", "Lorg/jetbrains/kotlin/ir/expressions/IrLoop;", "inScope", "R", ReportItem.LogTypeBlock, "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "irBitsForSlot", "bits", "slot", "irCache", "startOffset", "endOffset", "returnType", "invalid", "calculation", "irCall", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "function", "irChanged", AppMeasurementSdk.ConditionalUserProperty.VALUE, "irChangedOrInferredChanged", "arg", "irCurrentComposer", "composerParameter", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "irCurrentMarker", "irDefaultsInvalid", "irEndDefaults", "irEndMovableGroup", "irEndReplaceableGroup", "irEndRestartGroup", "irEndRestartGroupAndUpdateScope", "numRealValueParameters", "irEndToMarker", "marker", "irFunctionSourceKey", "Lorg/jetbrains/kotlin/ir/expressions/IrConst;", "irIfTraceInProgress", "body", "irIsProvided", NewFriendsOld.State_Default, "irIsSkipping", "irIsTraceInProgress", "irIsUncertainAndStable", "changed", "irJoinKeyChain", "keyExprs", "irMethodCall", "target", "irSafeCall", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "args", "", "(Lorg/jetbrains/kotlin/ir/expressions/IrExpression;Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;[Lorg/jetbrains/kotlin/ir/expressions/IrExpression;)Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "irSkipToGroupEnd", "irSourceInformation", "irSourceInformationMarkerEnd", "element", "irSourceInformationMarkerStart", "key", "irStartDefaults", "irStartMovableGroup", "joinedData", "irStartReplaceableGroup", "irStartRestartGroup", "irTemporary", "Lorg/jetbrains/kotlin/ir/declarations/impl/IrVariableImpl;", "nameHint", "irType", "isVar", "exactName", "irTraceEventEnd", "irTraceEventStart", "irTypeParameterStability", "Lorg/jetbrains/kotlin/ir/declarations/IrTypeParameter;", "irWithSourceInformation", "startGroup", "lower", "irFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "mightUseDefaultGroup", "mightUseVarArgsGroup", "mutableStatementContainer", "Lorg/jetbrains/kotlin/ir/expressions/IrContainerExpression;", "nearestComposer", "paramMetaOf", "isProvided", "populateParamMeta", "printScopeStack", "recordCallInSource", "call", "recordSourceParameter", "index", "transformDefaults", "visitBlock", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrBlock;", "visitBreakContinue", "visitCall", "visitClass", "Lorg/jetbrains/kotlin/ir/IrStatement;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "visitComposableCall", "visitComposableLambda", "visitDeclaration", "Lorg/jetbrains/kotlin/ir/declarations/IrDeclarationBase;", "visitDoWhileLoop", "Lorg/jetbrains/kotlin/ir/expressions/IrDoWhileLoop;", "visitField", "Lorg/jetbrains/kotlin/ir/declarations/IrField;", "visitFile", "visitFunction", "visitFunctionInScope", "visitGetValue", "Lorg/jetbrains/kotlin/ir/expressions/IrGetValue;", "visitKeyCall", "visitNonRestartableComposableFunction", "visitNormalComposableCall", "visitProperty", "visitRememberCall", "visitRestartableComposableFunction", "visitReturn", "Lorg/jetbrains/kotlin/ir/expressions/IrReturn;", "visitWhen", "Lorg/jetbrains/kotlin/ir/expressions/IrWhen;", "visitWhileLoop", "Lorg/jetbrains/kotlin/ir/expressions/IrWhileLoop;", "withScope", "T", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;Lkotlin/jvm/functions/Function0;)Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "asBodyAndResultVar", "Lkotlin/Pair;", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "Lorg/jetbrains/kotlin/ir/expressions/IrBody;", "expectedTarget", "asCoalescableGroup", "asReplaceableGroup", "endsWithReturnOrJump", "forEach", "Lkotlin/ParameterName;", "name", "irSourceKey", "shouldBeRestartable", "sourceKey", "toPrimitiveType", "transformWithScope", "(Lorg/jetbrains/kotlin/ir/expressions/IrExpression;Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;)Lkotlin/Pair;", "variablePrefix", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrBlockImpl;", "variable", "withReplaceableGroupStatements", "wrap", "type", "before", "after", "wrapWithTraceEvents", "IrChangedBitMaskValueImpl", "IrChangedBitMaskVariableImpl", "IrDefaultBitMaskValueImpl", "ParamMeta", "Scope", "SourceInfoFixup", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableFunctionBodyTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformerKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n*L\n1#1,4600:1\n2672#1,6:4630\n2660#1,8:4636\n2660#1,8:4644\n2660#1,8:4693\n2660#1,8:4726\n2660#1,8:4734\n2660#1,8:4744\n2647#1,10:4768\n2660#1,8:4778\n2647#1,10:4857\n2647#1,10:4884\n2647#1,10:4894\n2647#1,6:4904\n2654#1,3:4913\n123#2,2:4601\n179#2,2:4603\n4587#3:4605\n4587#3:4606\n4587#3:4607\n4587#3:4608\n4587#3:4609\n4587#3:4610\n4587#3:4611\n4587#3:4612\n4587#3:4613\n4587#3:4614\n4587#3:4615\n4587#3:4616\n4587#3:4617\n4587#3:4618\n4587#3:4619\n4587#3:4620\n4587#3:4621\n4587#3:4622\n4587#3:4623\n4587#3:4624\n4587#3:4625\n4587#3:4626\n4587#3:4627\n4587#3:4628\n4587#3:4629\n4548#3,4:4916\n37#4,2:4652\n37#4,2:4654\n37#4,2:4656\n37#4,2:4662\n37#4,2:4664\n37#4,2:4666\n37#4,2:4668\n37#4,2:4670\n37#4,2:4672\n37#4,2:4674\n37#4,2:4676\n37#4,2:4678\n37#4,2:4686\n37#4,2:4688\n37#4,2:4724\n1#5:4658\n1#5:4817\n1#5:4834\n1#5:4854\n2624#6,3:4659\n1549#6:4680\n1620#6,3:4681\n1002#6,2:4690\n1855#6:4692\n1856#6:4701\n1747#6,3:4702\n1747#6,3:4705\n1864#6,3:4708\n1864#6,3:4711\n1864#6,3:4714\n1864#6,3:4717\n1855#6,2:4720\n2661#6,7:4756\n1855#6,2:4766\n1747#6,3:4786\n378#6,7:4789\n1549#6:4796\n1620#6,3:4797\n1549#6:4800\n1620#6,3:4801\n1864#6,3:4804\n1603#6,9:4807\n1855#6:4816\n1856#6:4818\n1612#6:4819\n1549#6:4820\n1620#6,3:4821\n1603#6,9:4824\n1855#6:4833\n1856#6:4835\n1612#6:4836\n2730#6,7:4837\n1603#6,9:4844\n1855#6:4853\n1856#6:4855\n1612#6:4856\n1549#6:4867\n1620#6,3:4868\n1864#6,3:4871\n2661#6,7:4874\n1789#6,3:4881\n1864#6,3:4910\n618#6,12:4920\n12814#7,2:4684\n12639#7,2:4722\n13644#7,3:4763\n1177#8,2:4742\n1179#8,4:4752\n*S KotlinDebug\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer\n*L\n709#1:4630,6\n728#1:4636,8\n735#1:4644,8\n1342#1:4693,8\n1889#1:4726,8\n1894#1:4734,8\n1900#1:4744,8\n2805#1:4768,10\n2848#1:4778,8\n3206#1:4857,10\n3463#1:4884,10\n3511#1:4894,10\n3564#1:4904,6\n3564#1:4913,3\n491#1:4601,2\n496#1:4603,2\n513#1:4605\n525#1:4606\n532#1:4607\n540#1:4608\n547#1:4609\n554#1:4610\n561#1:4611\n568#1:4612\n575#1:4613\n582#1:4614\n590#1:4615\n597#1:4616\n608#1:4617\n616#1:4618\n620#1:4619\n624#1:4620\n633#1:4621\n639#1:4622\n650#1:4623\n658#1:4624\n665#1:4625\n677#1:4626\n684#1:4627\n692#1:4628\n699#1:4629\n3645#1:4916,4\n923#1:4652,2\n924#1:4654,2\n925#1:4656,2\n1094#1:4662,2\n1095#1:4664,2\n1096#1:4666,2\n1097#1:4668,2\n1108#1:4670,2\n1109#1:4672,2\n1110#1:4674,2\n1111#1:4676,2\n1113#1:4678,2\n1286#1:4686,2\n1287#1:4688,2\n1660#1:4724,2\n3031#1:4817\n3083#1:4834\n3189#1:4854\n997#1:4659,3\n1244#1:4680\n1244#1:4681,3\n1324#1:4690,2\n1339#1:4692\n1339#1:4701\n1366#1:4702,3\n1374#1:4705,3\n1398#1:4708,3\n1450#1:4711,3\n1479#1:4714,3\n1563#1:4717,3\n1627#1:4720,2\n2233#1:4756,7\n2573#1:4766,2\n2864#1:4786,3\n2886#1:4789,7\n2914#1:4796\n2914#1:4797,3\n2919#1:4800\n2919#1:4801,3\n2964#1:4804,3\n3031#1:4807,9\n3031#1:4816\n3031#1:4818\n3031#1:4819\n3067#1:4820\n3067#1:4821,3\n3083#1:4824,9\n3083#1:4833\n3083#1:4835\n3083#1:4836\n3084#1:4837,7\n3189#1:4844,9\n3189#1:4853\n3189#1:4855\n3189#1:4856\n3240#1:4867\n3240#1:4868,3\n3325#1:4871,3\n3392#1:4874,7\n3396#1:4881,3\n3565#1:4910,3\n3666#1:4920,12\n1248#1:4684,2\n1634#1:4722,2\n2256#1:4763,3\n1899#1:4742,2\n1899#1:4752,4\n*E\n"})
public final class ComposableFunctionBodyTransformer extends AbstractComposeLowering implements FileLoweringPass {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "changedPrimitiveFunctions", "getChangedPrimitiveFunctions()Ljava/util/Map;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "skipToGroupEndFunction", "getSkipToGroupEndFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "skipCurrentGroupFunction", "getSkipCurrentGroupFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "startReplaceableFunction", "getStartReplaceableFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "endReplaceableFunction", "getEndReplaceableFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "startDefaultsFunction", "getStartDefaultsFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "endDefaultsFunction", "getEndDefaultsFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "startMovableFunction", "getStartMovableFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "endMovableFunction", "getEndMovableFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "startRestartGroupFunction", "getStartRestartGroupFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "currentMarkerProperty", "getCurrentMarkerProperty()Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "endToMarkerFunction", "getEndToMarkerFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "endRestartGroupFunction", "getEndRestartGroupFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "sourceInformationFunction", "getSourceInformationFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "sourceInformationMarkerStartFunction", "getSourceInformationMarkerStartFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "updateChangedFlagsFunction", "getUpdateChangedFlagsFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "isTraceInProgressFunction", "isTraceInProgressFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "traceEventStartFunction", "getTraceEventStartFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "traceEventEndFunction", "getTraceEventEndFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "sourceInformationMarkerEndFunction", "getSourceInformationMarkerEndFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "updateScopeFunction", "getUpdateScopeFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "isSkippingFunction", "isSkippingFunction()Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "defaultsInvalidFunction", "getDefaultsInvalidFunction()Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "joinKeyFunction", "getJoinKeyFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0), androidx.compose.compiler.plugins.kotlin.k2.OooO00o.OooO00o(ComposableFunctionBodyTransformer.class, "cacheFunction", "getCacheFunction()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 0)};

    /* JADX INFO: renamed from: cacheFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy cacheFunction;

    @NotNull
    private final IrSimpleFunction changedFunction;

    @NotNull
    private final IrSimpleFunction changedInstanceFunction;

    /* JADX INFO: renamed from: changedPrimitiveFunctions$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy changedPrimitiveFunctions;
    private final boolean collectSourceInformation;

    /* JADX INFO: renamed from: currentMarkerProperty$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy currentMarkerProperty;

    @NotNull
    private Scope currentScope;

    /* JADX INFO: renamed from: defaultsInvalidFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy defaultsInvalidFunction;

    /* JADX INFO: renamed from: endDefaultsFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy endDefaultsFunction;

    /* JADX INFO: renamed from: endMovableFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy endMovableFunction;

    /* JADX INFO: renamed from: endReplaceableFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy endReplaceableFunction;

    /* JADX INFO: renamed from: endRestartGroupFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy endRestartGroupFunction;

    /* JADX INFO: renamed from: endToMarkerFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy endToMarkerFunction;

    @NotNull
    private ComposeInlineLambdaLocator inlineLambdaInfo;
    private final boolean intrinsicRememberEnabled;

    /* JADX INFO: renamed from: isSkippingFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy isSkippingFunction;

    /* JADX INFO: renamed from: isTraceInProgressFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy isTraceInProgressFunction;

    /* JADX INFO: renamed from: joinKeyFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy joinKeyFunction;

    /* JADX INFO: renamed from: skipCurrentGroupFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy skipCurrentGroupFunction;

    /* JADX INFO: renamed from: skipToGroupEndFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy skipToGroupEndFunction;

    @NotNull
    private final List<SourceInfoFixup> sourceFixups;

    /* JADX INFO: renamed from: sourceInformationFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy sourceInformationFunction;

    /* JADX INFO: renamed from: sourceInformationMarkerEndFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy sourceInformationMarkerEndFunction;

    /* JADX INFO: renamed from: sourceInformationMarkerStartFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy sourceInformationMarkerStartFunction;

    /* JADX INFO: renamed from: startDefaultsFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy startDefaultsFunction;

    /* JADX INFO: renamed from: startMovableFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy startMovableFunction;

    /* JADX INFO: renamed from: startReplaceableFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy startReplaceableFunction;

    /* JADX INFO: renamed from: startRestartGroupFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy startRestartGroupFunction;

    /* JADX INFO: renamed from: traceEventEndFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy traceEventEndFunction;

    /* JADX INFO: renamed from: traceEventStartFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy traceEventStartFunction;

    /* JADX INFO: renamed from: updateChangedFlagsFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy updateChangedFlagsFunction;

    /* JADX INFO: renamed from: updateScopeFunction$delegate, reason: from kotlin metadata */
    @NotNull
    private final GuardedLazy updateScopeFunction;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0096\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\fH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0016J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0004J \u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006-"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$IrChangedBitMaskValueImpl;", "Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "count", "", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer;Ljava/util/List;I)V", "declarations", "getDeclarations", "()Ljava/util/List;", "used", "", "getUsed", "()Z", "setUsed", "(Z)V", "irCopyToTemporary", "Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskVariable;", "nameHint", "", "isVar", "exactName", "irHasDifferences", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "usedParams", "", "irIsolateBitsAtSlot", "slot", "includeStableBit", "irLowBit", "irShiftBits", "fromSlot", "toSlot", "irSlotAnd", "bits", "irUpdateChangedFlags", "expression", "paramIndexForSlot", "putAsValueArgumentInWithLowBit", "", UserDataStore.FIRST_NAME, "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionAccessExpression;", "startIndex", "lowBit", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComposableFunctionBodyTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$IrChangedBitMaskValueImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4600:1\n1559#2:4601\n1590#2,3:4602\n1789#2,3:4605\n1789#2,3:4608\n1593#2:4611\n2661#2,7:4612\n1559#2:4619\n1590#2,4:4620\n1864#2,3:4624\n*S KotlinDebug\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$IrChangedBitMaskValueImpl\n*L\n4367#1:4601\n4367#1:4602,3\n4379#1:4605,3\n4386#1:4608,3\n4367#1:4611\n4420#1:4612,7\n4429#1:4619\n4429#1:4620,4\n4457#1:4624,3\n*E\n"})
    public class IrChangedBitMaskValueImpl implements IrChangedBitMaskValue {
        private final int count;

        @NotNull
        private final List<IrValueDeclaration> params;
        private boolean used;

        public IrChangedBitMaskValueImpl(List<? extends IrValueDeclaration> list, int i) {
            this.params = list;
            this.count = i;
            int size = list.size();
            int iChangedParamCount = ComposableFunctionBodyTransformerKt.changedParamCount(i, 0);
            if (size == iChangedParamCount) {
                return;
            }
            StringBuilder sbOooO00o = o00000.OooO00o("Function with ", i, " params had ", size, " changed params but expected ");
            sbOooO00o.append(iChangedParamCount);
            throw new IllegalArgumentException(sbOooO00o.toString().toString());
        }

        private final IrExpression irUpdateChangedFlags(IrExpression expression) {
            IrFunction updateChangedFlagsFunction = ComposableFunctionBodyTransformer.this.getUpdateChangedFlagsFunction();
            if (updateChangedFlagsFunction == null) {
                return expression;
            }
            IrExpression irExpressionIrCall$default = ComposableFunctionBodyTransformer.irCall$default(ComposableFunctionBodyTransformer.this, updateChangedFlagsFunction, 0, 0, 6, null);
            irExpressionIrCall$default.putValueArgument(0, expression);
            return irExpressionIrCall$default;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskValue
        @NotNull
        public List<IrValueDeclaration> getDeclarations() {
            return this.params;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskValue
        public boolean getUsed() {
            return this.used;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskValue
        @NotNull
        public IrChangedBitMaskVariable irCopyToTemporary(@Nullable String nameHint, boolean isVar, boolean exactName) {
            setUsed(true);
            List<IrValueDeclaration> list = this.params;
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(list));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                IrValueDeclaration irValueDeclaration = (IrValueDeclaration) obj;
                IrDeclarationOrigin irDeclarationOrigin = IrDeclarationOrigin.DEFINED.INSTANCE;
                IrVariableSymbol irVariableSymbolImpl = new IrVariableSymbolImpl((VariableDescriptor) null, 1, (DefaultConstructorMarker) null);
                String strOooO00o = "$dirty";
                if (i != 0) {
                    strOooO00o = android.support.v4.media.OooO00o.OooO00o("$dirty", i);
                }
                IrVariableImpl irVariableImpl = new IrVariableImpl(-1, -1, irDeclarationOrigin, irVariableSymbolImpl, Name.identifier(strOooO00o), irValueDeclaration.getType(), isVar, false, false);
                irVariableImpl.setInitializer(composableFunctionBodyTransformer.irGet(irValueDeclaration));
                arrayList.add(irVariableImpl);
                i = i2;
            }
            return ComposableFunctionBodyTransformer.this.new IrChangedBitMaskVariableImpl(arrayList, this.count);
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskValue
        @NotNull
        public IrExpression irHasDifferences(@NotNull boolean[] usedParams) {
            setUsed(true);
            int length = usedParams.length;
            int i = this.count;
            if (!(length == i)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i == 0) {
                ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
                return composableFunctionBodyTransformer.irNotEqual(composableFunctionBodyTransformer.irGet(this.params.get(0)), (IrExpression) ComposableFunctionBodyTransformer.this.irConst(0));
            }
            List<IrValueDeclaration> list = this.params;
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer2 = ComposableFunctionBodyTransformer.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(list));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                IrValueDeclaration irValueDeclaration = (IrValueDeclaration) obj;
                int i4 = i2 * 10;
                int iMin = Math.min(i4 + 10, this.count);
                Iterator<Integer> it = RangesKt.until(i4, iMin).iterator();
                int iBitsForSlot = 0;
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    if (usedParams[iNextInt]) {
                        iBitsForSlot |= ComposableFunctionBodyTransformerKt.bitsForSlot(5, iNextInt);
                    }
                }
                Iterator<Integer> it2 = RangesKt.until(i4, iMin).iterator();
                int iBitsForSlot2 = 0;
                while (it2.hasNext()) {
                    int iNextInt2 = ((IntIterator) it2).nextInt();
                    if (usedParams[iNextInt2]) {
                        iBitsForSlot2 |= ComposableFunctionBodyTransformerKt.bitsForSlot(1, iNextInt2);
                    }
                }
                arrayList.add(iBitsForSlot2 == 0 ? composableFunctionBodyTransformer2.irNotEqual((IrExpression) composableFunctionBodyTransformer2.irAnd(composableFunctionBodyTransformer2.irGet(irValueDeclaration), (IrExpression) composableFunctionBodyTransformer2.irConst(1)), (IrExpression) composableFunctionBodyTransformer2.irConst(0)) : composableFunctionBodyTransformer2.irNotEqual((IrExpression) composableFunctionBodyTransformer2.irAnd(composableFunctionBodyTransformer2.irGet(irValueDeclaration), (IrExpression) composableFunctionBodyTransformer2.irConst(iBitsForSlot | 1)), (IrExpression) composableFunctionBodyTransformer2.irConst(iBitsForSlot2 | 0)));
                i2 = i3;
            }
            if (arrayList.size() == 1) {
                return (IrExpression) CollectionsKt.single((List) arrayList);
            }
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer3 = ComposableFunctionBodyTransformer.this;
            Iterator it3 = arrayList.iterator();
            if (!it3.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it3.next();
            while (it3.hasNext()) {
                next = composableFunctionBodyTransformer3.irOrOr((IrExpression) next, (IrExpression) it3.next());
            }
            return (IrExpression) next;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskValue
        @NotNull
        public IrExpression irIsolateBitsAtSlot(int slot, boolean includeStableBit) {
            setUsed(true);
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            return composableFunctionBodyTransformer.irAnd(composableFunctionBodyTransformer.irGet(this.params.get(paramIndexForSlot(slot))), ComposableFunctionBodyTransformer.this.irBitsForSlot(includeStableBit ? ParamState.Mask.getBits() : ParamState.Static.getBits(), slot));
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskValue
        @NotNull
        public IrExpression irLowBit() {
            setUsed(true);
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            return composableFunctionBodyTransformer.irAnd(composableFunctionBodyTransformer.irGet(this.params.get(0)), (IrExpression) ComposableFunctionBodyTransformer.this.irConst(1));
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskValue
        @NotNull
        public IrExpression irShiftBits(int fromSlot, int toSlot) {
            setUsed(true);
            int i = ((toSlot % 10) - (fromSlot % 10)) * 3;
            IrExpression irExpressionIrGet = ComposableFunctionBodyTransformer.this.irGet(this.params.get(paramIndexForSlot(fromSlot)));
            if (i == 0) {
                return irExpressionIrGet;
            }
            IrType intType = ComposableFunctionBodyTransformer.this.getContext().getIrBuiltIns().getIntType();
            IrFunctionSymbol irFunctionSymbolBinaryOperator = ComposableFunctionBodyTransformer.this.binaryOperator(intType, OperatorNameConventions.SHL, intType);
            IrFunctionSymbol irFunctionSymbolBinaryOperator2 = ComposableFunctionBodyTransformer.this.binaryOperator(intType, OperatorNameConventions.SHR, intType);
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            return composableFunctionBodyTransformer.irCall(i > 0 ? irFunctionSymbolBinaryOperator : irFunctionSymbolBinaryOperator2, null, irExpressionIrGet, null, composableFunctionBodyTransformer.irConst(Math.abs(i)));
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskValue
        @NotNull
        public IrExpression irSlotAnd(int slot, int bits) {
            setUsed(true);
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            return composableFunctionBodyTransformer.irAnd(composableFunctionBodyTransformer.irGet(this.params.get(paramIndexForSlot(slot))), ComposableFunctionBodyTransformer.this.irBitsForSlot(bits, slot));
        }

        public final int paramIndexForSlot(int slot) {
            return slot / 10;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskValue
        public void putAsValueArgumentInWithLowBit(@NotNull IrFunctionAccessExpression fn, int startIndex, boolean lowBit) {
            setUsed(true);
            List<IrValueDeclaration> list = this.params;
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                IrValueDeclaration irValueDeclaration = (IrValueDeclaration) obj;
                fn.putValueArgument(startIndex + i, i == 0 ? irUpdateChangedFlags((IrExpression) composableFunctionBodyTransformer.irOr(composableFunctionBodyTransformer.irGet(irValueDeclaration), (IrExpression) composableFunctionBodyTransformer.irConst(lowBit ? 1 : 0))) : irUpdateChangedFlags(composableFunctionBodyTransformer.irGet(irValueDeclaration)));
                i = i2;
            }
        }

        public void setUsed(boolean z) {
            this.used = z;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u00012\u00060\u0002R\u00020\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$IrChangedBitMaskVariableImpl;", "Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskVariable;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$IrChangedBitMaskValueImpl;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer;", "temps", "", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "count", "", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer;Ljava/util/List;I)V", "asStatements", "Lorg/jetbrains/kotlin/ir/IrStatement;", "irOrSetBitsAtSlot", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "slot", AppMeasurementSdk.ConditionalUserProperty.VALUE, "irSetSlotUncertain", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class IrChangedBitMaskVariableImpl extends IrChangedBitMaskValueImpl implements IrChangedBitMaskVariable {

        @NotNull
        private final List<IrVariable> temps;

        public IrChangedBitMaskVariableImpl(List<? extends IrVariable> list, int i) {
            super(list, i);
            this.temps = list;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskVariable
        @NotNull
        public List<IrStatement> asStatements() {
            return this.temps;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskVariable
        @NotNull
        public IrExpression irOrSetBitsAtSlot(int slot, @NotNull IrExpression value) {
            setUsed(true);
            IrValueDeclaration irValueDeclaration = (IrVariable) this.temps.get(paramIndexForSlot(slot));
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            IrValueDeclaration irValueDeclaration2 = irValueDeclaration;
            return composableFunctionBodyTransformer.irSet(irValueDeclaration2, (IrExpression) composableFunctionBodyTransformer.irOr(composableFunctionBodyTransformer.irGet(irValueDeclaration2), value));
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrChangedBitMaskVariable
        @NotNull
        public IrExpression irSetSlotUncertain(int slot) {
            setUsed(true);
            IrValueDeclaration irValueDeclaration = (IrVariable) this.temps.get(paramIndexForSlot(slot));
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            IrValueDeclaration irValueDeclaration2 = irValueDeclaration;
            return composableFunctionBodyTransformer.irSet(irValueDeclaration2, (IrExpression) composableFunctionBodyTransformer.irAnd(composableFunctionBodyTransformer.irGet(irValueDeclaration2), (IrExpression) ComposableFunctionBodyTransformer.this.irConst(~ParamState.Mask.bitsForSlot(slot))));
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$IrDefaultBitMaskValueImpl;", "Landroidx/compose/compiler/plugins/kotlin/lower/IrDefaultBitMaskValue;", NativeProtocol.WEB_DIALOG_PARAMS, "", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "count", "", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer;Ljava/util/List;I)V", "irHasAnyProvidedAndUnstable", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "unstable", "", "irIsolateBitAtIndex", "index", "putAsValueArgumentIn", "", UserDataStore.FIRST_NAME, "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionAccessExpression;", "startIndex", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComposableFunctionBodyTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$IrDefaultBitMaskValueImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4600:1\n1559#2:4601\n1590#2,4:4602\n2661#2,7:4606\n1864#2,3:4613\n*S KotlinDebug\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$IrDefaultBitMaskValueImpl\n*L\n4272#1:4601\n4272#1:4602,4\n4289#1:4606,7\n4293#1:4613,3\n*E\n"})
    public final class IrDefaultBitMaskValueImpl implements IrDefaultBitMaskValue {
        private final int count;

        @NotNull
        private final List<IrValueParameter> params;

        public IrDefaultBitMaskValueImpl(List<? extends IrValueParameter> list, int i) {
            this.params = list;
            this.count = i;
            int size = list.size();
            int iDefaultParamCount = ComposableFunctionBodyTransformerKt.defaultParamCount(i);
            if (size == iDefaultParamCount) {
                return;
            }
            StringBuilder sbOooO00o = o00000.OooO00o("Function with ", i, " params had ", size, " default params but expected ");
            sbOooO00o.append(iDefaultParamCount);
            throw new IllegalArgumentException(sbOooO00o.toString().toString());
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrDefaultBitMaskValue
        @NotNull
        public IrExpression irHasAnyProvidedAndUnstable(@NotNull boolean[] unstable) {
            int i = 0;
            if (!(this.count == unstable.length)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            List<IrValueParameter> list = this.params;
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(list));
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int i3 = i * 31;
                boolean[] zArrSliceArray = ArraysKt.sliceArray(unstable, RangesKt.until(i3, Math.min(i3 + 31, this.count)));
                int iBitMask = composableFunctionBodyTransformer.bitMask(Arrays.copyOf(zArrSliceArray, zArrSliceArray.length));
                arrayList.add(composableFunctionBodyTransformer.irNotEqual((IrExpression) composableFunctionBodyTransformer.irAnd(composableFunctionBodyTransformer.irGet((IrValueDeclaration) ((IrValueParameter) obj)), (IrExpression) composableFunctionBodyTransformer.irConst(iBitMask)), (IrExpression) composableFunctionBodyTransformer.irConst(iBitMask)));
                i = i2;
            }
            if (arrayList.size() == 1) {
                return (IrExpression) CollectionsKt.single((List) arrayList);
            }
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer2 = ComposableFunctionBodyTransformer.this;
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = composableFunctionBodyTransformer2.irOrOr((IrExpression) next, (IrExpression) it.next());
            }
            return (IrExpression) next;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrDefaultBitMaskValue
        @NotNull
        public IrExpression irIsolateBitAtIndex(int index) {
            if (!(index <= this.count)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            return composableFunctionBodyTransformer.irAnd(composableFunctionBodyTransformer.irGet((IrValueDeclaration) this.params.get(ComposableFunctionBodyTransformerKt.defaultsParamIndex(index))), (IrExpression) ComposableFunctionBodyTransformer.this.irConst(1 << ComposableFunctionBodyTransformerKt.defaultsBitIndex(index)));
        }

        @Override // androidx.compose.compiler.plugins.kotlin.lower.IrDefaultBitMaskValue
        public void putAsValueArgumentIn(@NotNull IrFunctionAccessExpression fn, int startIndex) {
            List<IrValueParameter> list = this.params;
            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                fn.putValueArgument(i + startIndex, composableFunctionBodyTransformer.irGet((IrValueDeclaration) ((IrValueParameter) obj)));
                i = i2;
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\nHÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$ParamMeta;", "", "stability", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "isVararg", "", "isProvided", "isStatic", "isCertain", "maskSlot", "", "maskParam", "Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;", "(Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;ZZZZILandroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;)V", "()Z", "setCertain", "(Z)V", "setProvided", "setStatic", "setVararg", "getMaskParam", "()Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;", "setMaskParam", "(Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;)V", "getMaskSlot", "()I", "setMaskSlot", "(I)V", "getStability", "()Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "setStability", "(Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ParamMeta {
        private boolean isCertain;
        private boolean isProvided;
        private boolean isStatic;
        private boolean isVararg;

        @Nullable
        private IrChangedBitMaskValue maskParam;
        private int maskSlot;

        @NotNull
        private Stability stability;

        public ParamMeta() {
            this(null, false, false, false, false, 0, null, 127, null);
        }

        public static /* synthetic */ ParamMeta copy$default(ParamMeta paramMeta, Stability stability, boolean z, boolean z2, boolean z3, boolean z4, int i, IrChangedBitMaskValue irChangedBitMaskValue, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                stability = paramMeta.stability;
            }
            if ((i2 & 2) != 0) {
                z = paramMeta.isVararg;
            }
            boolean z5 = z;
            if ((i2 & 4) != 0) {
                z2 = paramMeta.isProvided;
            }
            boolean z6 = z2;
            if ((i2 & 8) != 0) {
                z3 = paramMeta.isStatic;
            }
            boolean z7 = z3;
            if ((i2 & 16) != 0) {
                z4 = paramMeta.isCertain;
            }
            boolean z8 = z4;
            if ((i2 & 32) != 0) {
                i = paramMeta.maskSlot;
            }
            int i3 = i;
            if ((i2 & 64) != 0) {
                irChangedBitMaskValue = paramMeta.maskParam;
            }
            return paramMeta.copy(stability, z5, z6, z7, z8, i3, irChangedBitMaskValue);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Stability getStability() {
            return this.stability;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsVararg() {
            return this.isVararg;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsProvided() {
            return this.isProvided;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsStatic() {
            return this.isStatic;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsCertain() {
            return this.isCertain;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getMaskSlot() {
            return this.maskSlot;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final IrChangedBitMaskValue getMaskParam() {
            return this.maskParam;
        }

        @NotNull
        public final ParamMeta copy(@NotNull Stability stability, boolean isVararg, boolean isProvided, boolean isStatic, boolean isCertain, int maskSlot, @Nullable IrChangedBitMaskValue maskParam) {
            return new ParamMeta(stability, isVararg, isProvided, isStatic, isCertain, maskSlot, maskParam);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParamMeta)) {
                return false;
            }
            ParamMeta paramMeta = (ParamMeta) other;
            return Intrinsics.areEqual(this.stability, paramMeta.stability) && this.isVararg == paramMeta.isVararg && this.isProvided == paramMeta.isProvided && this.isStatic == paramMeta.isStatic && this.isCertain == paramMeta.isCertain && this.maskSlot == paramMeta.maskSlot && Intrinsics.areEqual(this.maskParam, paramMeta.maskParam);
        }

        @Nullable
        public final IrChangedBitMaskValue getMaskParam() {
            return this.maskParam;
        }

        public final int getMaskSlot() {
            return this.maskSlot;
        }

        @NotNull
        public final Stability getStability() {
            return this.stability;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r0v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iHashCode = this.stability.hashCode() * 31;
            boolean z = this.isVararg;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iHashCode + r1) * 31;
            boolean z2 = this.isProvided;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int i2 = (i + r2) * 31;
            boolean z3 = this.isStatic;
            ?? r3 = z3;
            if (z3) {
                r3 = 1;
            }
            int i3 = (i2 + r3) * 31;
            boolean z4 = this.isCertain;
            int i4 = (((i3 + (z4 ? 1 : z4)) * 31) + this.maskSlot) * 31;
            IrChangedBitMaskValue irChangedBitMaskValue = this.maskParam;
            return i4 + (irChangedBitMaskValue == null ? 0 : irChangedBitMaskValue.hashCode());
        }

        public final boolean isCertain() {
            return this.isCertain;
        }

        public final boolean isProvided() {
            return this.isProvided;
        }

        public final boolean isStatic() {
            return this.isStatic;
        }

        public final boolean isVararg() {
            return this.isVararg;
        }

        public final void setCertain(boolean z) {
            this.isCertain = z;
        }

        public final void setMaskParam(@Nullable IrChangedBitMaskValue irChangedBitMaskValue) {
            this.maskParam = irChangedBitMaskValue;
        }

        public final void setMaskSlot(int i) {
            this.maskSlot = i;
        }

        public final void setProvided(boolean z) {
            this.isProvided = z;
        }

        public final void setStability(@NotNull Stability stability) {
            this.stability = stability;
        }

        public final void setStatic(boolean z) {
            this.isStatic = z;
        }

        public final void setVararg(boolean z) {
            this.isVararg = z;
        }

        @NotNull
        public String toString() {
            return "ParamMeta(stability=" + this.stability + ", isVararg=" + this.isVararg + ", isProvided=" + this.isProvided + ", isStatic=" + this.isStatic + ", isCertain=" + this.isCertain + ", maskSlot=" + this.maskSlot + ", maskParam=" + this.maskParam + ")";
        }

        public ParamMeta(@NotNull Stability stability, boolean z, boolean z2, boolean z3, boolean z4, int i, @Nullable IrChangedBitMaskValue irChangedBitMaskValue) {
            this.stability = stability;
            this.isVararg = z;
            this.isProvided = z2;
            this.isStatic = z3;
            this.isCertain = z4;
            this.maskSlot = i;
            this.maskParam = irChangedBitMaskValue;
        }

        public /* synthetic */ ParamMeta(Stability stability, boolean z, boolean z2, boolean z3, boolean z4, int i, IrChangedBitMaskValue irChangedBitMaskValue, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Stability.INSTANCE.getUnstable() : stability, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) == 0 ? z4 : false, (i2 & 32) != 0 ? -1 : i, (i2 & 64) != 0 ? null : irChangedBitMaskValue);
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0010#$%&'()*+,-./012B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u0082\u0001\u00073456\u000678¨\u00069"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "", "name", "", "(Ljava/lang/String;)V", "fileScope", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FileScope;", "getFileScope", "()Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FileScope;", "functionScope", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FunctionScope;", "getFunctionScope", "()Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FunctionScope;", "isInComposable", "", "()Z", "level", "", "getLevel", "()I", "setLevel", "(I)V", "myComposer", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "getMyComposer", "()Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "getName", "()Ljava/lang/String;", "nearestComposer", "getNearestComposer", "parent", "getParent", "()Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "setParent", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;)V", "BlockScope", "BranchScope", "CallScope", "CaptureScope", "ClassScope", "ComposableLambdaScope", "FieldScope", "FileScope", "FunctionScope", "LoopScope", "ParametersScope", "PropertyScope", "ReturnScope", "RootScope", "SourceLocation", "WhenScope", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$CallScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$ClassScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FieldScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$PropertyScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$RootScope;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Scope {
        private int level;

        @NotNull
        private final String name;

        @Nullable
        private Scope parent;

        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001;B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010 \u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\"J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020\rH\u0016J*\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0)J\u001a\u0010+\u001a\u00020\u000b2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u001a\u0010-\u001a\u00020\u000b2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0006\u0010.\u001a\u00020\u000bJ\u0006\u0010/\u001a\u00020\u000bJ\u0016\u00100\u001a\u00020\u000b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0)H\u0016J\u0016\u0010(\u001a\u00020\u000b2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010)J\u0016\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\rJ\u0018\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u001fJ\u0010\u00108\u001a\u00020\u001f2\u0006\u00105\u001a\u000206H\u0016J\u000e\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u001e\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "name", "", "(Ljava/lang/String;)V", "coalescableChilds", "", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope$CoalescableGroupInfo;", "extraEndLocations", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "", "<set-?>", "", "hasComposableCalls", "getHasComposableCalls", "()Z", "hasComposableCallsWithGroups", "getHasComposableCallsWithGroups", "hasDefaultsGroup", "getHasDefaultsGroup", "setHasDefaultsGroup", "(Z)V", "hasJump", "getHasJump", "setHasJump", "hasReturn", "getHasReturn", "isInComposable", "isIntrinsiceRememberSafe", "sourceLocations", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$SourceLocation;", "addProvisionalSourceLocations", "locations", "", "calculateHasSourceInformation", "sourceInformationEnabled", "calculateSourceInfo", "markCoalescableGroup", "scope", "realizeGroup", "Lkotlin/Function0;", "makeEnd", "markJump", "extraEndLocation", "markReturn", "realizeAllDirectChildren", "realizeCoalescableGroup", "realizeEndCalls", "recordComposableCall", "withGroups", "isCached", "recordSourceLocation", "call", "Lorg/jetbrains/kotlin/ir/IrElement;", "location", "sourceLocationOf", "updateIntrinsiceRememberSafety", "stillSafe", "CoalescableGroupInfo", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nComposableFunctionBodyTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4600:1\n1#2:4601\n1855#3,2:4602\n766#3:4604\n857#3,2:4605\n1855#3,2:4607\n1855#3,2:4609\n*S KotlinDebug\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope\n*L\n4015#1:4602,2\n4056#1:4604\n4056#1:4605,2\n4090#1:4607,2\n4096#1:4609,2\n*E\n"})
        public static abstract class BlockScope extends Scope {

            @NotNull
            private List<CoalescableGroupInfo> coalescableChilds;

            @NotNull
            private final List<Function1<IrExpression, Unit>> extraEndLocations;
            private boolean hasComposableCalls;
            private boolean hasComposableCallsWithGroups;
            private boolean hasDefaultsGroup;
            private boolean hasJump;
            private boolean hasReturn;
            private boolean isIntrinsiceRememberSafe;

            @NotNull
            private final List<SourceLocation> sourceLocations;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope$CoalescableGroupInfo;", "", "scope", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "realizeGroup", "Lkotlin/Function0;", "", "makeEnd", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "realized", "", "shouldRealize", "getShouldRealize", "()Z", "setShouldRealize", "(Z)V", "realize", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class CoalescableGroupInfo {

                @NotNull
                private final Function0<IrExpression> makeEnd;

                @NotNull
                private final Function0<Unit> realizeGroup;
                private boolean realized;

                @NotNull
                private final BlockScope scope;
                private boolean shouldRealize;

                public CoalescableGroupInfo(@NotNull BlockScope blockScope, @NotNull Function0<Unit> function0, @NotNull Function0<? extends IrExpression> function1) {
                    this.scope = blockScope;
                    this.realizeGroup = function0;
                    this.makeEnd = function1;
                }

                public final boolean getShouldRealize() {
                    return this.shouldRealize;
                }

                public final void realize() {
                    if (this.realized) {
                        return;
                    }
                    this.realized = true;
                    if (!this.shouldRealize) {
                        this.scope.realizeCoalescableGroup();
                    } else {
                        this.scope.realizeGroup(this.makeEnd);
                        this.realizeGroup.invoke();
                    }
                }

                public final void setShouldRealize(boolean z) {
                    this.shouldRealize = z;
                }
            }

            public BlockScope(@NotNull String str) {
                super(str, null);
                this.extraEndLocations = new ArrayList();
                this.sourceLocations = new ArrayList();
                this.isIntrinsiceRememberSafe = true;
                this.coalescableChilds = new ArrayList();
            }

            public final void addProvisionalSourceLocations(@NotNull List<? extends SourceLocation> locations) {
                CollectionsKt__MutableCollectionsKt.addAll(this.sourceLocations, locations);
            }

            public boolean calculateHasSourceInformation(boolean sourceInformationEnabled) {
                return sourceInformationEnabled && (this.sourceLocations.isEmpty() ^ true);
            }

            @Nullable
            public String calculateSourceInfo(boolean sourceInformationEnabled) {
                IrFile declaration;
                if (!sourceInformationEnabled || !(!this.sourceLocations.isEmpty())) {
                    return null;
                }
                List<SourceLocation> list = this.sourceLocations;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!((SourceLocation) obj).getUsed()) {
                        arrayList.add(obj);
                    }
                }
                List listDistinct = CollectionsKt.distinct(arrayList);
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                FileScope fileScope = getFileScope();
                final IrFileEntry fileEntry = (fileScope == null || (declaration = fileScope.getDeclaration()) == null) ? null : declaration.getFileEntry();
                if (listDistinct.isEmpty()) {
                    return null;
                }
                return CollectionsKt___CollectionsKt.joinToString$default(listDistinct, ",", null, null, 0, null, new Function1<SourceLocation, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$Scope$BlockScope$calculateSourceInfo$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final CharSequence invoke(@NotNull ComposableFunctionBodyTransformer.Scope.SourceLocation sourceLocation) {
                        sourceLocation.markUsed();
                        IrFileEntry irFileEntry = fileEntry;
                        Object objValueOf = irFileEntry != null ? Integer.valueOf(irFileEntry.getLineNumber(sourceLocation.getElement().getStartOffset())) : "";
                        String strOooO0O0 = sourceLocation.getElement().getStartOffset() < sourceLocation.getElement().getEndOffset() ? OooO0O0.OooO0O0("@", sourceLocation.getElement().getStartOffset(), "L", sourceLocation.getElement().getEndOffset() - sourceLocation.getElement().getStartOffset()) : android.support.v4.media.OooO00o.OooO00o("@", sourceLocation.getElement().getStartOffset());
                        if (sourceLocation.getRepeatable()) {
                            Ref.BooleanRef booleanRef2 = booleanRef;
                            if (!booleanRef2.element) {
                                booleanRef2.element = true;
                                return "*" + objValueOf + strOooO0O0;
                            }
                        }
                        return objValueOf + strOooO0O0;
                    }
                }, 30, null);
            }

            public final boolean getHasComposableCalls() {
                return this.hasComposableCalls;
            }

            public final boolean getHasComposableCallsWithGroups() {
                return this.hasComposableCallsWithGroups;
            }

            public final boolean getHasDefaultsGroup() {
                return this.hasDefaultsGroup;
            }

            public final boolean getHasJump() {
                return this.hasJump;
            }

            public final boolean getHasReturn() {
                return this.hasReturn;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope
            public boolean isInComposable() {
                Scope parent = getParent();
                if (parent != null) {
                    return parent.isInComposable();
                }
                return false;
            }

            /* JADX INFO: renamed from: isIntrinsiceRememberSafe, reason: from getter */
            public final boolean getIsIntrinsiceRememberSafe() {
                return this.isIntrinsiceRememberSafe;
            }

            public final void markCoalescableGroup(@NotNull BlockScope scope, @NotNull Function0<Unit> realizeGroup, @NotNull Function0<? extends IrExpression> makeEnd) {
                addProvisionalSourceLocations(scope.sourceLocations);
                this.coalescableChilds.add(new CoalescableGroupInfo(scope, realizeGroup, makeEnd));
            }

            public final void markJump(@NotNull Function1<? super IrExpression, Unit> extraEndLocation) {
                this.hasJump = true;
                UtilsKt.push(this.extraEndLocations, extraEndLocation);
            }

            public final void markReturn(@NotNull Function1<? super IrExpression, Unit> extraEndLocation) {
                this.hasReturn = true;
                UtilsKt.push(this.extraEndLocations, extraEndLocation);
            }

            public final void realizeAllDirectChildren() {
                if (!this.coalescableChilds.isEmpty()) {
                    Iterator<T> it = this.coalescableChilds.iterator();
                    while (it.hasNext()) {
                        ((CoalescableGroupInfo) it.next()).setShouldRealize(true);
                    }
                }
            }

            public final void realizeCoalescableGroup() {
                Iterator<T> it = this.coalescableChilds.iterator();
                while (it.hasNext()) {
                    ((CoalescableGroupInfo) it.next()).realize();
                }
            }

            public void realizeEndCalls(@NotNull Function0<? extends IrExpression> makeEnd) {
                Iterator<T> it = this.extraEndLocations.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(makeEnd.invoke());
                }
            }

            public final void realizeGroup(@Nullable Function0<? extends IrExpression> makeEnd) {
                realizeCoalescableGroup();
                if (makeEnd != null) {
                    realizeEndCalls(makeEnd);
                }
            }

            public final void recordComposableCall(boolean withGroups, boolean isCached) {
                this.hasComposableCalls = true;
                if (withGroups) {
                    this.hasComposableCallsWithGroups = true;
                }
                if (this.isIntrinsiceRememberSafe && (withGroups || !isCached)) {
                    this.isIntrinsiceRememberSafe = false;
                }
                if (!this.coalescableChilds.isEmpty()) {
                    ((CoalescableGroupInfo) CollectionsKt.last((List) this.coalescableChilds)).setShouldRealize(true);
                }
            }

            @NotNull
            public final SourceLocation recordSourceLocation(@NotNull IrElement call, @Nullable SourceLocation location) {
                if (location == null) {
                    location = sourceLocationOf(call);
                }
                this.sourceLocations.add(location);
                return location;
            }

            public final void setHasDefaultsGroup(boolean z) {
                this.hasDefaultsGroup = z;
            }

            public final void setHasJump(boolean z) {
                this.hasJump = z;
            }

            @NotNull
            public SourceLocation sourceLocationOf(@NotNull IrElement call) {
                return new SourceLocation(call);
            }

            public final void updateIntrinsiceRememberSafety(boolean stillSafe) {
                if (!this.isIntrinsiceRememberSafe || stillSafe) {
                    return;
                }
                this.isIntrinsiceRememberSafe = false;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BranchScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "()V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class BranchScope extends BlockScope {
            public BranchScope() {
                super("branch");
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$CallScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer;", "(Lorg/jetbrains/kotlin/ir/expressions/IrCall;Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer;)V", "getExpression", "()Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "isInComposable", "", "()Z", "<set-?>", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "marker", "getMarker", "()Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "allocateMarker", "getNameForTemporary", "", "nameHint", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nComposableFunctionBodyTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$CallScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4600:1\n1#2:4601\n*E\n"})
        public static final class CallScope extends Scope {

            @NotNull
            private final IrCall expression;

            @Nullable
            private IrVariable marker;

            @NotNull
            private final ComposableFunctionBodyTransformer transformer;

            public CallScope(@NotNull IrCall irCall, @NotNull ComposableFunctionBodyTransformer composableFunctionBodyTransformer) {
                super("call", null);
                this.expression = irCall;
                this.transformer = composableFunctionBodyTransformer;
            }

            private final String getNameForTemporary(String nameHint) {
                String nameForTemporary;
                FunctionScope functionScope = getFunctionScope();
                if (functionScope == null || (nameForTemporary = functionScope.getNameForTemporary(nameHint)) == null) {
                    throw new IllegalStateException("Expected to be in a function".toString());
                }
                return nameForTemporary;
            }

            @NotNull
            public final IrVariable allocateMarker() {
                IrVariable irVariable = this.marker;
                if (irVariable != null) {
                    return irVariable;
                }
                ComposableFunctionBodyTransformer composableFunctionBodyTransformer = this.transformer;
                IrVariable irVariableIrTemporary$default = AbstractComposeLowering.irTemporary$default(composableFunctionBodyTransformer, composableFunctionBodyTransformer.irCurrentMarker(getMyComposer()), getNameForTemporary("marker"), null, false, null, 28, null);
                this.marker = irVariableIrTemporary$default;
                return irVariableIrTemporary$default;
            }

            @NotNull
            public final IrCall getExpression() {
                return this.expression;
            }

            @Nullable
            public final IrVariable getMarker() {
                return this.marker;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope
            public boolean isInComposable() {
                Scope parent = getParent();
                return parent != null && parent.isInComposable();
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$CaptureScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "()V", "<set-?>", "", "hasCapturedComposableCall", "getHasCapturedComposableCall", "()Z", "markCapturedComposableCall", "", "sourceLocationOf", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$SourceLocation;", "call", "Lorg/jetbrains/kotlin/ir/IrElement;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CaptureScope extends BlockScope {
            private boolean hasCapturedComposableCall;

            public CaptureScope() {
                super("capture");
            }

            public final boolean getHasCapturedComposableCall() {
                return this.hasCapturedComposableCall;
            }

            public final void markCapturedComposableCall() {
                this.hasCapturedComposableCall = true;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.BlockScope
            @NotNull
            public SourceLocation sourceLocationOf(@NotNull final IrElement call) {
                return new SourceLocation(call) { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$Scope$CaptureScope$sourceLocationOf$1
                    @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.SourceLocation
                    public boolean getRepeatable() {
                        return true;
                    }
                };
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$ClassScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "name", "Lorg/jetbrains/kotlin/name/Name;", "(Lorg/jetbrains/kotlin/name/Name;)V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ClassScope extends Scope {
            public ClassScope(@NotNull Name name) {
                super(o00O00OO.OooO00o("class ", name.asString()), null);
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$ComposableLambdaScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "()V", "calculateHasSourceInformation", "", "sourceInformationEnabled", "calculateSourceInfo", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ComposableLambdaScope extends BlockScope {
            public ComposableLambdaScope() {
                super("composableLambda");
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.BlockScope
            public boolean calculateHasSourceInformation(boolean sourceInformationEnabled) {
                return sourceInformationEnabled;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.BlockScope
            @Nullable
            public String calculateSourceInfo(boolean sourceInformationEnabled) {
                String strSourceFileInformation$compiler_hosted;
                if (!sourceInformationEnabled) {
                    return null;
                }
                String strCalculateSourceInfo = super.calculateSourceInfo(sourceInformationEnabled);
                String str = "";
                if (strCalculateSourceInfo == null) {
                    strCalculateSourceInfo = "";
                }
                FunctionScope functionScope = getFunctionScope();
                if (functionScope != null && (strSourceFileInformation$compiler_hosted = functionScope.sourceFileInformation$compiler_hosted()) != null) {
                    str = strSourceFileInformation$compiler_hosted;
                }
                return o00Ooo.OooO00o("C", strCalculateSourceInfo, CertificateUtil.DELIMITER, str);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FieldScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "name", "Lorg/jetbrains/kotlin/name/Name;", "(Lorg/jetbrains/kotlin/name/Name;)V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FieldScope extends Scope {
            public FieldScope(@NotNull Name name) {
                super(o00O00OO.OooO00o("field ", name.asString()), null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FileScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "(Lorg/jetbrains/kotlin/ir/declarations/IrFile;)V", "getDeclaration", "()Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "fileScope", "getFileScope", "()Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FileScope;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class FileScope extends Scope {

            @NotNull
            private final IrFile declaration;

            public FileScope(@NotNull IrFile irFile) {
                super(o00O00OO.OooO00o("file ", IrDeclarationsKt.getName(irFile)), null);
                this.declaration = irFile;
            }

            @NotNull
            public final IrFile getDeclaration() {
                return this.declaration;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope
            @NotNull
            public FileScope getFileScope() {
                return this;
            }
        }

        @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0018\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010?\u001a\u00020+J\u0010\u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u00020\"H\u0016J\u0012\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010A\u001a\u00020\"H\u0016J\b\u0010D\u001a\u00020CH\u0002J\u000e\u0010E\u001a\u00020)2\u0006\u0010F\u001a\u00020)J\u0010\u0010G\u001a\u00020C2\b\u0010H\u001a\u0004\u0018\u00010CJ\b\u0010I\u001a\u00020)H\u0002J\b\u0010J\u001a\u00020)H\u0002J\n\u0010K\u001a\u0004\u0018\u00010CH\u0002J\b\u0010L\u001a\u00020CH\u0002J\r\u0010M\u001a\u00020CH\u0000¢\u0006\u0002\bNJ\u0010\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b'\u0010$R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u00104\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0013R\u001e\u00106\u001a\u00020)2\u0006\u0010\f\u001a\u00020)@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001e\u00109\u001a\u00020)2\u0006\u0010\f\u001a\u00020)@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010;\u001a\u00020<¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>¨\u0006S"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FunctionScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "function", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer;", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer;)V", "allTrackedParams", "", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "getAllTrackedParams", "()Ljava/util/List;", "<set-?>", "Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;", "changedParameter", "getChangedParameter", "()Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;", "composerParameter", "getComposerParameter", "()Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "Landroidx/compose/compiler/plugins/kotlin/lower/IrDefaultBitMaskValue;", "defaultParameter", "getDefaultParameter", "()Landroidx/compose/compiler/plugins/kotlin/lower/IrDefaultBitMaskValue;", "dirty", "getDirty", "setDirty", "(Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;)V", "getFunction", "()Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "functionScope", "getFunctionScope", "()Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FunctionScope;", "inComposableCall", "", "getInComposableCall", "()Z", "isComposable", "isInComposable", "isInlinedLambda", "lastTemporaryIndex", "", "marker", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "markerPreamble", "Lorg/jetbrains/kotlin/ir/expressions/IrContainerExpression;", "getMarkerPreamble", "()Lorg/jetbrains/kotlin/ir/expressions/IrContainerExpression;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/FunctionMetrics;", "getMetrics", "()Landroidx/compose/compiler/plugins/kotlin/FunctionMetrics;", "nearestComposer", "getNearestComposer", "realValueParamCount", "getRealValueParamCount", "()I", "slotCount", "getSlotCount", "usedParams", "", "getUsedParams", "()[Z", "allocateMarker", "calculateHasSourceInformation", "sourceInformationEnabled", "calculateSourceInfo", "", "callInformation", "defaultIndexForSlotIndex", "index", "getNameForTemporary", "nameHint", "nextTemporaryIndex", "packageHash", RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME, "parameterInformation", "sourceFileInformation", "sourceFileInformation$compiler_hosted", "sourceLocationOf", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$SourceLocation;", "call", "Lorg/jetbrains/kotlin/ir/IrElement;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nComposableFunctionBodyTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FunctionScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,4600:1\n766#2:4601\n857#2,2:4602\n1559#2:4604\n1590#2,4:4605\n1045#2:4609\n1559#2:4610\n1590#2,4:4611\n1864#2,3:4617\n37#3,2:4615\n1113#4,3:4620\n*S KotlinDebug\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$FunctionScope\n*L\n3796#1:4601\n3796#1:4602,2\n3800#1:4604\n3800#1:4605,4\n3802#1:4609\n3803#1:4610\n3803#1:4611,4\n3822#1:4617,3\n3805#1:4615,2\n3975#1:4620,3\n*E\n"})
        public static final class FunctionScope extends BlockScope {

            @NotNull
            private final List<IrValueParameter> allTrackedParams;

            @Nullable
            private IrChangedBitMaskValue changedParameter;

            @Nullable
            private IrValueParameter composerParameter;

            @Nullable
            private IrDefaultBitMaskValue defaultParameter;

            @Nullable
            private IrChangedBitMaskValue dirty;

            @NotNull
            private final IrFunction function;
            private final boolean isComposable;
            private int lastTemporaryIndex;

            @Nullable
            private IrVariable marker;

            @NotNull
            private final IrContainerExpression markerPreamble;

            @NotNull
            private final FunctionMetrics metrics;
            private int realValueParamCount;
            private int slotCount;

            @NotNull
            private final ComposableFunctionBodyTransformer transformer;

            @NotNull
            private final boolean[] usedParams;

            public FunctionScope(@NotNull IrFunction irFunction, @NotNull ComposableFunctionBodyTransformer composableFunctionBodyTransformer) {
                super(o00O00OO.OooO00o("fun ", irFunction.getName().asString()));
                this.function = irFunction;
                this.transformer = composableFunctionBodyTransformer;
                this.metrics = composableFunctionBodyTransformer.metricsFor(irFunction);
                this.markerPreamble = ComposableFunctionBodyTransformerKt.mutableStatementContainer(composableFunctionBodyTransformer.getContext());
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (IrValueParameter irValueParameter : irFunction.getValueParameters()) {
                    String strAsString = irValueParameter.getName().asString();
                    KtxNameConventions ktxNameConventions = KtxNameConventions.INSTANCE;
                    if (Intrinsics.areEqual(strAsString, ktxNameConventions.getCOMPOSER_PARAMETER().getIdentifier())) {
                        this.composerParameter = irValueParameter;
                    } else if (StringsKt__StringsJVMKt.startsWith$default(strAsString, ktxNameConventions.getDEFAULT_PARAMETER().getIdentifier(), false, 2, null)) {
                        arrayList.add(irValueParameter);
                    } else if (StringsKt__StringsJVMKt.startsWith$default(strAsString, ktxNameConventions.getCHANGED_PARAMETER().getIdentifier(), false, 2, null)) {
                        arrayList2.add(irValueParameter);
                    } else if (!StringsKt__StringsJVMKt.startsWith$default(strAsString, "$context_receiver_", false, 2, null) && !StringsKt__StringsJVMKt.startsWith$default(strAsString, "$name$for$destructuring", false, 2, null) && !StringsKt__StringsJVMKt.startsWith$default(strAsString, "$noName_", false, 2, null) && !Intrinsics.areEqual(strAsString, "$this")) {
                        this.realValueParamCount++;
                    }
                }
                int i = this.realValueParamCount;
                this.slotCount = i;
                this.slotCount = i + this.function.getContextReceiverParametersCount();
                if (this.function.getExtensionReceiverParameter() != null) {
                    this.slotCount++;
                }
                if (this.function.getDispatchReceiverParameter() != null || Intrinsics.areEqual(this.function.getOrigin(), IrDeclarationOrigin.LOCAL_FUNCTION_FOR_LAMBDA.INSTANCE)) {
                    this.slotCount++;
                }
                this.changedParameter = this.composerParameter != null ? this.transformer.new IrChangedBitMaskValueImpl(arrayList2, this.slotCount) : null;
                this.defaultParameter = arrayList.isEmpty() ^ true ? this.transformer.new IrDefaultBitMaskValueImpl(arrayList, this.function.getContextReceiverParametersCount() + this.realValueParamCount) : null;
                this.isComposable = this.composerParameter != null;
                this.allTrackedParams = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(this.function.getExtensionReceiverParameter()), (Iterable) CollectionsKt.take(this.function.getValueParameters(), this.function.getContextReceiverParametersCount() + this.realValueParamCount)), (Iterable) CollectionsKt.listOfNotNull(this.function.getDispatchReceiverParameter()));
                int i2 = this.slotCount;
                boolean[] zArr = new boolean[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    zArr[i3] = false;
                }
                this.usedParams = zArr;
                if (this.isComposable && Intrinsics.areEqual(this.function.getOrigin(), IrDeclarationOrigin.LOCAL_FUNCTION_FOR_LAMBDA.INSTANCE)) {
                    zArr[this.slotCount - 1] = true;
                }
            }

            private final String callInformation() {
                String str = this.function.isInline() ? "C" : "";
                if (this.function.getName().isSpecial()) {
                    return str.concat("C");
                }
                return str + "C(" + this.function.getName().asString() + ")";
            }

            private final int nextTemporaryIndex() {
                int i = this.lastTemporaryIndex;
                this.lastTemporaryIndex = i + 1;
                return i;
            }

            private final int packageHash() {
                String strPackageName = packageName();
                if (strPackageName == null) {
                    return 0;
                }
                int iCharAt = 0;
                for (int i = 0; i < strPackageName.length(); i++) {
                    iCharAt = (iCharAt * 31) + strPackageName.charAt(i);
                }
                return Math.abs(iCharAt);
            }

            private final String packageName() {
                IrDeclarationParent parent = this.function.getParent();
                while (!(parent instanceof IrPackageFragment)) {
                    if (!(parent instanceof IrDeclaration)) {
                        return null;
                    }
                    parent = ((IrDeclaration) parent).getParent();
                }
                return ((IrPackageFragment) parent).getFqName().asString();
            }

            private final String parameterInformation() {
                IrDeclarationWithName irDeclarationWithName;
                FqName fqNameWhenAvailable;
                StringBuilder sb = new StringBuilder("P(");
                List valueParameters = this.function.getValueParameters();
                ArrayList arrayList = new ArrayList();
                for (Object obj : valueParameters) {
                    if (true ^ StringsKt__StringsJVMKt.startsWith$default(((IrValueParameter) obj).getName().asString(), "$", false, 2, null)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
                int i = 0;
                for (Object obj2 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList2.add(new Pair(Integer.valueOf(i), (IrValueParameter) obj2));
                    i = i2;
                }
                List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$Scope$FunctionScope$parameterInformation$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((IrValueParameter) ((Pair) t).getSecond()).getName().asString(), ((IrValueParameter) ((Pair) t2).getSecond()).getName().asString());
                    }
                });
                ArrayList arrayList3 = new ArrayList(CollectionsKt.OooO0oo(listSortedWith));
                int i3 = 0;
                for (Object obj3 : listSortedWith) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList3.add(new Pair(((Pair) obj3).getFirst(), Integer.valueOf(i3)));
                    i3 = i4;
                }
                Pair[] pairArr = (Pair[]) arrayList3.toArray(new Pair[0]);
                Map mapMapOf = MapsKt.mapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                int size = arrayList.size();
                Integer[] numArr = new Integer[size];
                for (int i5 = 0; i5 < size; i5++) {
                    numArr[i5] = Integer.valueOf(i5);
                }
                List mutableList = ArraysKt.toMutableList(numArr);
                Ref.IntRef intRef = new Ref.IntRef();
                boolean z = false;
                int i6 = 0;
                for (Object obj4 : arrayList) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    IrValueParameter irValueParameter = (IrValueParameter) obj4;
                    int iIntValue = ((Number) CollectionsKt.first(mutableList)).intValue();
                    Integer num = (Integer) mapMapOf.get(Integer.valueOf(i6));
                    if (num == null || iIntValue != num.intValue() || JvmIrTypeUtilsKt.isInlineClassType(irValueParameter.getType())) {
                        parameterInformation$emitRun(intRef, sb, arrayList, i6);
                        if (i6 > 0) {
                            sb.append(',');
                        }
                        Integer num2 = (Integer) mapMapOf.get(Integer.valueOf(i6));
                        if (num2 == null) {
                            throw new IllegalStateException(("missing index " + i6).toString());
                        }
                        int iIntValue2 = num2.intValue();
                        sb.append(iIntValue2);
                        mutableList.remove(Integer.valueOf(iIntValue2));
                        if (JvmIrTypeUtilsKt.isInlineClassType(irValueParameter.getType()) && (irDeclarationWithName = IrTypesKt.getClass(irValueParameter.getType())) != null && (fqNameWhenAvailable = IrUtilsKt.getFqNameWhenAvailable(irDeclarationWithName)) != null) {
                            sb.append(':');
                            sb.append(ComposableFunctionBodyTransformerKt.replacePrefix(fqNameWhenAvailable.asString(), "androidx.compose.", "c#"));
                        }
                        z = true;
                    } else {
                        intRef.element++;
                        mutableList.remove(0);
                    }
                    i6 = i7;
                }
                sb.append(')');
                return z ? sb.toString() : "";
            }

            private static final void parameterInformation$emitRun(Ref.IntRef intRef, StringBuilder sb, List<? extends IrValueParameter> list, int i) {
                if (intRef.element > 0) {
                    sb.append('!');
                    if (i < list.size() - 1) {
                        sb.append(intRef.element);
                    }
                    intRef.element = 0;
                }
            }

            @NotNull
            public final IrVariable allocateMarker() {
                IrVariable irVariable = this.marker;
                if (irVariable != null) {
                    return irVariable;
                }
                Scope parent = getParent();
                if (isInlinedLambda() && !this.isComposable && (parent instanceof CallScope)) {
                    return ((CallScope) parent).allocateMarker();
                }
                ComposableFunctionBodyTransformer composableFunctionBodyTransformer = this.transformer;
                IrVariable irVariableIrTemporary$default = AbstractComposeLowering.irTemporary$default(composableFunctionBodyTransformer, composableFunctionBodyTransformer.irCurrentMarker(getMyComposer()), getNameForTemporary("marker"), null, false, null, 28, null);
                this.markerPreamble.getStatements().add(irVariableIrTemporary$default);
                IrVariable irVariable2 = irVariableIrTemporary$default;
                this.marker = irVariable2;
                return irVariable2;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.BlockScope
            public boolean calculateHasSourceInformation(boolean sourceInformationEnabled) {
                if (!sourceInformationEnabled) {
                    return this.function.getVisibility().isPublicAPI();
                }
                if (!ComposableFunctionBodyTransformerKt.isLambda(this.function) || isInlinedLambda()) {
                    return true;
                }
                return super.calculateHasSourceInformation(sourceInformationEnabled);
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.BlockScope
            @Nullable
            public String calculateSourceInfo(boolean sourceInformationEnabled) {
                if (!sourceInformationEnabled) {
                    if (this.function.getVisibility().isPublicAPI()) {
                        return OooOOOO.OooO00o(callInformation(), parameterInformation());
                    }
                    return null;
                }
                String strCallInformation = callInformation();
                String strParameterInformation = parameterInformation();
                String strCalculateSourceInfo = super.calculateSourceInfo(sourceInformationEnabled);
                if (strCalculateSourceInfo == null) {
                    strCalculateSourceInfo = "";
                }
                return strCallInformation + strParameterInformation + strCalculateSourceInfo + CertificateUtil.DELIMITER + sourceFileInformation$compiler_hosted();
            }

            public final int defaultIndexForSlotIndex(int index) {
                return this.function.getExtensionReceiverParameter() != null ? index - 1 : index;
            }

            @NotNull
            public final List<IrValueParameter> getAllTrackedParams() {
                return this.allTrackedParams;
            }

            @Nullable
            public final IrChangedBitMaskValue getChangedParameter() {
                return this.changedParameter;
            }

            @Nullable
            public final IrValueParameter getComposerParameter() {
                return this.composerParameter;
            }

            @Nullable
            public final IrDefaultBitMaskValue getDefaultParameter() {
                return this.defaultParameter;
            }

            @Nullable
            public final IrChangedBitMaskValue getDirty() {
                return this.dirty;
            }

            @NotNull
            public final IrFunction getFunction() {
                return this.function;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope
            @NotNull
            public FunctionScope getFunctionScope() {
                return this;
            }

            public final boolean getInComposableCall() {
                IrCall expression;
                Scope parent = getParent();
                CallScope callScope = parent instanceof CallScope ? (CallScope) parent : null;
                if (callScope == null || (expression = callScope.getExpression()) == null) {
                    return false;
                }
                ComposableFunctionBodyTransformer composableFunctionBodyTransformer = this.transformer;
                return composableFunctionBodyTransformer.isComposableCall(expression) || composableFunctionBodyTransformer.isSyntheticComposableCall(expression);
            }

            @NotNull
            public final IrContainerExpression getMarkerPreamble() {
                return this.markerPreamble;
            }

            @NotNull
            public final FunctionMetrics getMetrics() {
                return this.metrics;
            }

            @NotNull
            public final String getNameForTemporary(@Nullable String nameHint) {
                int iNextTemporaryIndex = nextTemporaryIndex();
                if (nameHint == null) {
                    return android.support.v4.media.OooO00o.OooO00o("tmp", iNextTemporaryIndex);
                }
                return "tmp" + iNextTemporaryIndex + "_" + nameHint;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope
            @Nullable
            public IrValueParameter getNearestComposer() {
                IrValueParameter irValueParameter = this.composerParameter;
                return irValueParameter == null ? super.getNearestComposer() : irValueParameter;
            }

            public final int getRealValueParamCount() {
                return this.realValueParamCount;
            }

            public final int getSlotCount() {
                return this.slotCount;
            }

            @NotNull
            public final boolean[] getUsedParams() {
                return this.usedParams;
            }

            /* JADX INFO: renamed from: isComposable, reason: from getter */
            public final boolean getIsComposable() {
                return this.isComposable;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.BlockScope, androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope
            public boolean isInComposable() {
                if (this.isComposable) {
                    return true;
                }
                if (this.transformer.inlineLambdaInfo.preservesComposableScope(this.function)) {
                    Scope parent = getParent();
                    if (parent != null && parent.isInComposable()) {
                        return true;
                    }
                }
                return false;
            }

            public final boolean isInlinedLambda() {
                return this.transformer.inlineLambdaInfo.isInlineLambda(this.function);
            }

            public final void setDirty(@Nullable IrChangedBitMaskValue irChangedBitMaskValue) {
                this.dirty = irChangedBitMaskValue;
            }

            @NotNull
            public final String sourceFileInformation$compiler_hosted() {
                int iPackageHash = packageHash();
                if (iPackageHash == 0) {
                    return IrDeclarationsKt.getName(IrUtilsKt.getFile(this.function));
                }
                String name = IrDeclarationsKt.getName(IrUtilsKt.getFile(this.function));
                String string = Integer.toString(iPackageHash, CharsKt.checkRadix(36));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                return o0OoOo0.OooO0O0(name, "#", string);
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.BlockScope
            @NotNull
            public SourceLocation sourceLocationOf(@NotNull IrElement call) {
                Scope parent = getParent();
                return (isInlinedLambda() && (parent instanceof BlockScope)) ? ((BlockScope) parent).sourceLocationOf(call) : super.sourceLocationOf(call);
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u0016\u0010\u0015\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$LoopScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "loop", "Lorg/jetbrains/kotlin/ir/expressions/IrLoop;", "(Lorg/jetbrains/kotlin/ir/expressions/IrLoop;)V", "jumpEndLocations", "", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "", "getLoop", "()Lorg/jetbrains/kotlin/ir/expressions/IrLoop;", "<set-?>", "", "needsGroupPerIteration", "getNeedsGroupPerIteration", "()Z", "markJump", "jump", "Lorg/jetbrains/kotlin/ir/expressions/IrBreakContinue;", "extraEndLocation", "realizeEndCalls", "makeEnd", "Lkotlin/Function0;", "sourceLocationOf", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$SourceLocation;", "call", "Lorg/jetbrains/kotlin/ir/IrElement;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nComposableFunctionBodyTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$LoopScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4600:1\n1855#2,2:4601\n*S KotlinDebug\n*F\n+ 1 ComposableFunctionBodyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$LoopScope\n*L\n4176#1:4601,2\n*E\n"})
        public static final class LoopScope extends BlockScope {

            @NotNull
            private final List<Function1<IrExpression, Unit>> jumpEndLocations;

            @NotNull
            private final IrLoop loop;
            private boolean needsGroupPerIteration;

            public LoopScope(@NotNull IrLoop irLoop) {
                super("loop");
                this.loop = irLoop;
                this.jumpEndLocations = new ArrayList();
            }

            @NotNull
            public final IrLoop getLoop() {
                return this.loop;
            }

            public final boolean getNeedsGroupPerIteration() {
                return this.needsGroupPerIteration;
            }

            public final void markJump(@NotNull IrBreakContinue jump, @NotNull Function1<? super IrExpression, Unit> extraEndLocation) {
                if (!Intrinsics.areEqual(jump.getLoop(), this.loop)) {
                    super.markJump(extraEndLocation);
                    return;
                }
                setHasJump(true);
                if (jump instanceof IrContinue) {
                    this.needsGroupPerIteration = true;
                }
                UtilsKt.push(this.jumpEndLocations, extraEndLocation);
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.BlockScope
            public void realizeEndCalls(@NotNull Function0<? extends IrExpression> makeEnd) {
                super.realizeEndCalls(makeEnd);
                if (this.needsGroupPerIteration) {
                    Iterator<T> it = this.jumpEndLocations.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(makeEnd.invoke());
                    }
                }
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.BlockScope
            @NotNull
            public SourceLocation sourceLocationOf(@NotNull final IrElement call) {
                return new SourceLocation(call) { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$Scope$LoopScope$sourceLocationOf$1
                    @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.SourceLocation
                    public boolean getRepeatable() {
                        return !this.getNeedsGroupPerIteration();
                    }
                };
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$ParametersScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "()V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ParametersScope extends BlockScope {
            public ParametersScope() {
                super("parameters");
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$PropertyScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "name", "Lorg/jetbrains/kotlin/name/Name;", "(Lorg/jetbrains/kotlin/name/Name;)V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PropertyScope extends Scope {
            public PropertyScope(@NotNull Name name) {
                super(o00O00OO.OooO00o("val ", name.asString()), null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$ReturnScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrReturn;", "(Lorg/jetbrains/kotlin/ir/expressions/IrReturn;)V", "getExpression", "()Lorg/jetbrains/kotlin/ir/expressions/IrReturn;", "sourceLocationOf", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$SourceLocation;", "call", "Lorg/jetbrains/kotlin/ir/IrElement;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ReturnScope extends BlockScope {

            @NotNull
            private final IrReturn expression;

            public ReturnScope(@NotNull IrReturn irReturn) {
                super("return");
                this.expression = irReturn;
            }

            @NotNull
            public final IrReturn getExpression() {
                return this.expression;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.Scope.BlockScope
            @NotNull
            public SourceLocation sourceLocationOf(@NotNull IrElement call) {
                Scope parent = getParent();
                return parent instanceof BlockScope ? ((BlockScope) parent).sourceLocationOf(call) : super.sourceLocationOf(call);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$RootScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope;", "()V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RootScope extends Scope {
            public RootScope() {
                super("<root>", null);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$SourceLocation;", "", "element", "Lorg/jetbrains/kotlin/ir/IrElement;", "(Lorg/jetbrains/kotlin/ir/IrElement;)V", "getElement", "()Lorg/jetbrains/kotlin/ir/IrElement;", "repeatable", "", "getRepeatable", "()Z", "<set-?>", "used", "getUsed", "markUsed", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static class SourceLocation {

            @NotNull
            private final IrElement element;
            private boolean used;

            public SourceLocation(@NotNull IrElement irElement) {
                this.element = irElement;
            }

            @NotNull
            public final IrElement getElement() {
                return this.element;
            }

            public boolean getRepeatable() {
                return false;
            }

            public final boolean getUsed() {
                return this.used;
            }

            public final void markUsed() {
                this.used = true;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$WhenScope;", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "()V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class WhenScope extends BlockScope {
            public WhenScope() {
                super("when");
            }
        }

        public /* synthetic */ Scope(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Nullable
        public FileScope getFileScope() {
            Scope scope = this.parent;
            if (scope != null) {
                return scope.getFileScope();
            }
            return null;
        }

        @Nullable
        public FunctionScope getFunctionScope() {
            Scope scope = this.parent;
            if (scope != null) {
                return scope.getFunctionScope();
            }
            return null;
        }

        public final int getLevel() {
            return this.level;
        }

        @NotNull
        public final IrValueParameter getMyComposer() {
            IrValueParameter nearestComposer = getNearestComposer();
            if (nearestComposer != null) {
                return nearestComposer;
            }
            throw new IllegalStateException("Not in a composable function".toString());
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @Nullable
        public IrValueParameter getNearestComposer() {
            Scope scope = this.parent;
            if (scope != null) {
                return scope.getNearestComposer();
            }
            return null;
        }

        @Nullable
        public final Scope getParent() {
            return this.parent;
        }

        public boolean isInComposable() {
            return false;
        }

        public final void setLevel(int i) {
            this.level = i;
        }

        public final void setParent(@Nullable Scope scope) {
            this.parent = scope;
        }

        private Scope(String str) {
            this.name = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$SourceInfoFixup;", "", "call", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "index", "", "scope", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "(Lorg/jetbrains/kotlin/ir/expressions/IrCall;ILandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;)V", "getCall", "()Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "getIndex", "()I", "getScope", "()Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$Scope$BlockScope;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SourceInfoFixup {

        @NotNull
        private final IrCall call;
        private final int index;

        @NotNull
        private final Scope.BlockScope scope;

        public SourceInfoFixup(@NotNull IrCall irCall, int i, @NotNull Scope.BlockScope blockScope) {
            this.call = irCall;
            this.index = i;
            this.scope = blockScope;
        }

        @NotNull
        public final IrCall getCall() {
            return this.call;
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final Scope.BlockScope getScope() {
            return this.scope;
        }
    }

    public ComposableFunctionBodyTransformer(@NotNull final IrPluginContext irPluginContext, @NotNull DeepCopySymbolRemapper deepCopySymbolRemapper, @NotNull ModuleMetrics moduleMetrics, boolean z, boolean z2) {
        Object next;
        IrSimpleFunction irSimpleFunction;
        super(irPluginContext, deepCopySymbolRemapper, moduleMetrics);
        this.intrinsicRememberEnabled = z2;
        this.inlineLambdaInfo = new ComposeInlineLambdaLocator(irPluginContext);
        for (IrSimpleFunction irSimpleFunction2 : IrUtilsKt.getFunctions(getComposerIrClass())) {
            if (Intrinsics.areEqual(irSimpleFunction2.getName().getIdentifier(), "changed") && IrTypePredicatesKt.isNullableAny(((IrValueParameter) CollectionsKt.first(irSimpleFunction2.getValueParameters())).getType())) {
                this.changedFunction = irSimpleFunction2;
                Iterator it = IrUtilsKt.getFunctions(getComposerIrClass()).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        irSimpleFunction = (IrSimpleFunction) next;
                    }
                } while (!(Intrinsics.areEqual(irSimpleFunction.getName().getIdentifier(), "changedInstance") && IrTypePredicatesKt.isNullableAny(((IrValueParameter) CollectionsKt.first(irSimpleFunction.getValueParameters())).getType())));
                IrSimpleFunction irSimpleFunction3 = (IrSimpleFunction) next;
                this.changedInstanceFunction = irSimpleFunction3 == null ? this.changedFunction : irSimpleFunction3;
                this.changedPrimitiveFunctions = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<Map<PrimitiveType, ? extends IrSimpleFunction>>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$changedPrimitiveFunctions$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Map<PrimitiveType, ? extends IrSimpleFunction> invoke() {
                        Sequence sequenceFilter = SequencesKt.filter(IrUtilsKt.getFunctions(this.this$0.getComposerIrClass()), new Function1<IrSimpleFunction, Boolean>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$changedPrimitiveFunctions$2.1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(@NotNull IrSimpleFunction irSimpleFunction4) {
                                return Boolean.valueOf(Intrinsics.areEqual(irSimpleFunction4.getName().getIdentifier(), "changed"));
                            }
                        });
                        final ComposableFunctionBodyTransformer composableFunctionBodyTransformer = this.this$0;
                        return MapsKt.toMap(SequencesKt.mapNotNull(sequenceFilter, new Function1<IrSimpleFunction, Pair<? extends PrimitiveType, ? extends IrSimpleFunction>>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$changedPrimitiveFunctions$2.2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final Pair<PrimitiveType, IrSimpleFunction> invoke(@NotNull IrSimpleFunction irSimpleFunction4) {
                                PrimitiveType primitiveType = composableFunctionBodyTransformer.toPrimitiveType(((IrValueParameter) CollectionsKt.first(irSimpleFunction4.getValueParameters())).getType());
                                if (primitiveType != null) {
                                    return TuplesKt.to(primitiveType, irSimpleFunction4);
                                }
                                return null;
                            }
                        }));
                    }
                });
                this.skipToGroupEndFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$skipToGroupEndFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName().getIdentifier(), "skipToGroupEnd") && irSimpleFunction4.getValueParameters().size() == 0) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.skipCurrentGroupFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$skipCurrentGroupFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName().getIdentifier(), "skipCurrentGroup") && irSimpleFunction4.getValueParameters().size() == 0) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.startReplaceableFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$startReplaceableFunction$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        boolean z3;
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName().getIdentifier(), "startReplaceableGroup")) {
                                z3 = true;
                                if (irSimpleFunction4.getValueParameters().size() != 1) {
                                    z3 = false;
                                }
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.endReplaceableFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$endReplaceableFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName().getIdentifier(), "endReplaceableGroup") && irSimpleFunction4.getValueParameters().size() == 0) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.startDefaultsFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$startDefaultsFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName().getIdentifier(), "startDefaults") && irSimpleFunction4.getValueParameters().size() == 0) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.endDefaultsFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$endDefaultsFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName().getIdentifier(), "endDefaults") && irSimpleFunction4.getValueParameters().size() == 0) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.startMovableFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$startMovableFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName().getIdentifier(), "startMovableGroup") && irSimpleFunction4.getValueParameters().size() == 2) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.endMovableFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$endMovableFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName().getIdentifier(), "endMovableGroup") && irSimpleFunction4.getValueParameters().size() == 0) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.startRestartGroupFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$startRestartGroupFunction$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        boolean z3;
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName(), KtxNameConventions.INSTANCE.getSTARTRESTARTGROUP())) {
                                z3 = true;
                                if (irSimpleFunction4.getValueParameters().size() != 1) {
                                    z3 = false;
                                }
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.currentMarkerProperty = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrProperty>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$currentMarkerProperty$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrProperty invoke() {
                        Object next2;
                        Iterator it2 = IrUtilsKt.getProperties(this.this$0.getComposerIrClass()).iterator();
                        while (it2.hasNext()) {
                            next2 = it2.next();
                            if (Intrinsics.areEqual(((IrProperty) next2).getName(), KtxNameConventions.INSTANCE.getCURRENTMARKER())) {
                                return (IrProperty) next2;
                            }
                        }
                        next2 = null;
                        return (IrProperty) next2;
                    }
                });
                this.endToMarkerFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$endToMarkerFunction$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrSimpleFunction invoke() {
                        Object next2;
                        boolean z3;
                        Iterator it2 = IrUtilsKt.getFunctions(this.this$0.getComposerIrClass()).iterator();
                        while (it2.hasNext()) {
                            next2 = it2.next();
                            IrSimpleFunction irSimpleFunction4 = (IrSimpleFunction) next2;
                            if (Intrinsics.areEqual(irSimpleFunction4.getName(), KtxNameConventions.INSTANCE.getENDTOMARKER())) {
                                z3 = true;
                                if (irSimpleFunction4.getValueParameters().size() != 1) {
                                    z3 = false;
                                }
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                return (IrSimpleFunction) next2;
                            }
                        }
                        next2 = null;
                        return (IrSimpleFunction) next2;
                    }
                });
                this.endRestartGroupFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$endRestartGroupFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName(), KtxNameConventions.INSTANCE.getENDRESTARTGROUP()) && irSimpleFunction4.getValueParameters().size() == 0) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.sourceInformationFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$sourceInformationFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        return this.this$0.getTopLevelFunction(ComposeCallableIds.INSTANCE.getSourceInformation()).getOwner();
                    }
                });
                this.sourceInformationMarkerStartFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$sourceInformationMarkerStartFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        return this.this$0.getTopLevelFunction(ComposeCallableIds.INSTANCE.getSourceInformationMarkerStart()).getOwner();
                    }
                });
                this.updateChangedFlagsFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$updateChangedFlagsFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrSimpleFunction invoke() {
                        IrSimpleFunctionSymbol topLevelFunctionOrNull = this.this$0.getTopLevelFunctionOrNull(ComposeCallableIds.INSTANCE.getUpdateChangedFlags());
                        if (topLevelFunctionOrNull == null) {
                            return null;
                        }
                        IrSimpleFunction owner = topLevelFunctionOrNull.getOwner();
                        if (owner.getValueParameters().size() == 1) {
                            return owner;
                        }
                        return null;
                    }
                });
                this.isTraceInProgressFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.isTraceInProgressFunction.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrSimpleFunction invoke() {
                        Iterator<T> it2 = ComposableFunctionBodyTransformer.this.getTopLevelFunctions(ComposeCallableIds.INSTANCE.isTraceInProgress()).iterator();
                        boolean z3 = false;
                        Object obj = null;
                        while (true) {
                            if (!it2.hasNext()) {
                                if (!z3) {
                                    break;
                                }
                                break;
                            }
                            Object next2 = it2.next();
                            if (((IrSimpleFunctionSymbol) next2).getOwner().getValueParameters().isEmpty()) {
                                if (!z3) {
                                    z3 = true;
                                    obj = next2;
                                }
                            }
                            obj = null;
                            break;
                        }
                        IrSimpleFunctionSymbol irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) obj;
                        if (irSimpleFunctionSymbol != null) {
                            return irSimpleFunctionSymbol.getOwner();
                        }
                        return null;
                    }
                });
                this.traceEventStartFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$traceEventStartFunction$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrSimpleFunction invoke() {
                        List<IrSimpleFunctionSymbol> topLevelFunctions = this.this$0.getTopLevelFunctions(ComposeCallableIds.INSTANCE.getTraceEventStart());
                        IrPluginContext irPluginContext2 = irPluginContext;
                        Iterator<T> it2 = topLevelFunctions.iterator();
                        Object obj = null;
                        boolean z3 = false;
                        while (true) {
                            if (!it2.hasNext()) {
                                if (!z3) {
                                    break;
                                }
                                break;
                            }
                            Object next2 = it2.next();
                            List valueParameters = ((IrSimpleFunctionSymbol) next2).getOwner().getValueParameters();
                            ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(valueParameters));
                            Iterator it3 = valueParameters.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(((IrValueParameter) it3.next()).getType());
                            }
                            if (Intrinsics.areEqual(arrayList, CollectionsKt.listOf((Object[]) new IrType[]{irPluginContext2.getIrBuiltIns().getIntType(), irPluginContext2.getIrBuiltIns().getIntType(), irPluginContext2.getIrBuiltIns().getIntType(), irPluginContext2.getIrBuiltIns().getStringType()}))) {
                                if (!z3) {
                                    obj = next2;
                                    z3 = true;
                                }
                            }
                            obj = null;
                            break;
                        }
                        IrSimpleFunctionSymbol irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) obj;
                        if (irSimpleFunctionSymbol != null) {
                            return irSimpleFunctionSymbol.getOwner();
                        }
                        return null;
                    }
                });
                this.traceEventEndFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$traceEventEndFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrSimpleFunction invoke() {
                        Iterator<T> it2 = this.this$0.getTopLevelFunctions(ComposeCallableIds.INSTANCE.getTraceEventEnd()).iterator();
                        boolean z3 = false;
                        Object obj = null;
                        while (true) {
                            if (!it2.hasNext()) {
                                if (!z3) {
                                    break;
                                }
                                break;
                            }
                            Object next2 = it2.next();
                            if (((IrSimpleFunctionSymbol) next2).getOwner().getValueParameters().isEmpty()) {
                                if (!z3) {
                                    z3 = true;
                                    obj = next2;
                                }
                            }
                            obj = null;
                            break;
                        }
                        IrSimpleFunctionSymbol irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) obj;
                        if (irSimpleFunctionSymbol != null) {
                            return irSimpleFunctionSymbol.getOwner();
                        }
                        return null;
                    }
                });
                this.sourceInformationMarkerEndFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$sourceInformationMarkerEndFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        return this.this$0.getTopLevelFunction(ComposeCallableIds.INSTANCE.getSourceInformationMarkerEnd()).getOwner();
                    }
                });
                this.updateScopeFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$updateScopeFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        IrClass owner;
                        Sequence functions;
                        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(this.this$0.getEndRestartGroupFunction().getReturnType());
                        if (classOrNull != null && (owner = classOrNull.getOwner()) != null && (functions = IrUtilsKt.getFunctions(owner)) != null) {
                            ComposableFunctionBodyTransformer composableFunctionBodyTransformer = this.this$0;
                            Iterator it2 = functions.iterator();
                            Object obj = null;
                            boolean z3 = false;
                            Object obj2 = null;
                            while (true) {
                                if (!it2.hasNext()) {
                                    if (!z3) {
                                        break;
                                    }
                                    obj = obj2;
                                    break;
                                }
                                Object next2 = it2.next();
                                IrSimpleFunction irSimpleFunction4 = (IrSimpleFunction) next2;
                                if (Intrinsics.areEqual(irSimpleFunction4.getName(), KtxNameConventions.INSTANCE.getUPDATE_SCOPE()) && composableFunctionBodyTransformer.getArguments(((IrValueParameter) CollectionsKt.first(irSimpleFunction4.getValueParameters())).getType()).size() == 3) {
                                    if (z3) {
                                        break;
                                    }
                                    obj2 = next2;
                                    z3 = true;
                                }
                            }
                            IrSimpleFunction irSimpleFunction5 = (IrSimpleFunction) obj;
                            if (irSimpleFunction5 != null) {
                                return irSimpleFunction5;
                            }
                        }
                        throw new IllegalStateException("new updateScope not found in result type of endRestartGroup".toString());
                    }
                });
                this.isSkippingFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrProperty>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.isSkippingFunction.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrProperty invoke() {
                        for (IrProperty irProperty : IrUtilsKt.getProperties(ComposableFunctionBodyTransformer.this.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irProperty.getName().asString(), "skipping")) {
                                return irProperty;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.defaultsInvalidFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrProperty>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$defaultsInvalidFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrProperty invoke() {
                        for (IrProperty irProperty : IrUtilsKt.getProperties(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irProperty.getName().asString(), "defaultsInvalid")) {
                                return irProperty;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.joinKeyFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$joinKeyFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        for (IrSimpleFunction irSimpleFunction4 : IrUtilsKt.getFunctions(this.this$0.getComposerIrClass())) {
                            if (Intrinsics.areEqual(irSimpleFunction4.getName(), KtxNameConventions.INSTANCE.getJOINKEY()) && irSimpleFunction4.getValueParameters().size() == 2) {
                                return irSimpleFunction4;
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                });
                this.cacheFunction = ComposableFunctionBodyTransformerKt.guardedLazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$cacheFunction$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrSimpleFunction invoke() {
                        for (IrSimpleFunctionSymbol irSimpleFunctionSymbol : this.this$0.getTopLevelFunctions(ComposeCallableIds.INSTANCE.getCache())) {
                            if (irSimpleFunctionSymbol.getOwner().getValueParameters().size() == 2 && irSimpleFunctionSymbol.getOwner().getExtensionReceiverParameter() != null) {
                                return irSimpleFunctionSymbol.getOwner();
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                });
                this.currentScope = new Scope.RootScope();
                this.collectSourceInformation = z;
                this.sourceFixups = new ArrayList();
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final void applySourceFixups() {
        List<SourceInfoFixup> list = this.sourceFixups;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$applySourceFixups$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(-((ComposableFunctionBodyTransformer.SourceInfoFixup) t).getScope().getLevel()), Integer.valueOf(-((ComposableFunctionBodyTransformer.SourceInfoFixup) t2).getScope().getLevel()));
                }
            });
        }
        for (SourceInfoFixup sourceInfoFixup : this.sourceFixups) {
            IrCall call = sourceInfoFixup.getCall();
            int index = sourceInfoFixup.getIndex();
            String sourceInformation = getSourceInformation(sourceInfoFixup.getScope());
            if (sourceInformation == null) {
                sourceInformation = "";
            }
            call.putValueArgument(index, irConst(sourceInformation));
        }
        this.sourceFixups.clear();
    }

    private final Pair<IrContainerExpression, IrVariable> asBodyAndResultVar(IrBody irBody, IrFunction irFunction) {
        IrBlock irCompositeImpl = new IrCompositeImpl(irBody.getStartOffset(), irBody.getEndOffset(), getContext().getIrBuiltIns().getUnitType(), (IrStatementOrigin) null, IrUtilsKt.getStatements(irBody));
        IrBlock irBlock = (IrStatementContainer) irCompositeImpl;
        List statements = irBlock.getStatements();
        IrStatement irStatement = statements != null ? (IrStatement) CollectionsKt.lastOrNull(statements) : null;
        while (irStatement != null) {
            if ((irStatement instanceof IrReturn) && (irFunction == null || Intrinsics.areEqual(irFunction, ((IrReturn) irStatement).getReturnTargetSymbol().getOwner()))) {
                UtilsKt.pop(irBlock.getStatements());
                IrReturn irReturn = (IrReturn) irStatement;
                if (ComposableFunctionBodyTransformerKt.isUnitOrNullableUnit(irReturn.getValue().getType()) || IrTypePredicatesKt.isNothing(irReturn.getValue().getType()) || IrTypePredicatesKt.isNullableNothing(irReturn.getValue().getType())) {
                    irBlock.getStatements().add(irReturn.getValue());
                    return TuplesKt.to(irCompositeImpl, null);
                }
                IrVariableImpl irVariableImplIrTemporary$default = irTemporary$default(this, irReturn.getValue(), (String) null, (IrType) null, false, false, 30, (Object) null);
                irBlock.getStatements().add(irVariableImplIrTemporary$default);
                return TuplesKt.to(irCompositeImpl, irVariableImplIrTemporary$default);
            }
            if (!(irStatement instanceof IrBlock)) {
                return TuplesKt.to(irCompositeImpl, null);
            }
            irBlock = (IrStatementContainer) irStatement;
            irStatement = (IrStatement) CollectionsKt.lastOrNull(irBlock.getStatements());
        }
        return TuplesKt.to(irCompositeImpl, null);
    }

    public static /* synthetic */ Pair asBodyAndResultVar$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, IrBody irBody, IrFunction irFunction, int i, Object obj) {
        if ((i & 1) != 0) {
            irFunction = null;
        }
        return composableFunctionBodyTransformer.asBodyAndResultVar(irBody, irFunction);
    }

    private final IrExpression asCoalescableGroup(final IrExpression irExpression, final Scope.BlockScope blockScope) {
        final FunctionMetrics metrics = getCurrentFunctionScope().getMetrics();
        final IrContainerExpression irContainerExpressionMutableStatementContainer = mutableStatementContainer();
        final IrContainerExpression irContainerExpressionMutableStatementContainer2 = mutableStatementContainer();
        encounteredCoalescableGroup(blockScope, new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.asCoalescableGroup.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (irContainerExpressionMutableStatementContainer.getStatements().isEmpty()) {
                    metrics.recordGroup();
                    irContainerExpressionMutableStatementContainer.getStatements().add(ComposableFunctionBodyTransformer.irStartReplaceableGroup$default(this, irExpression, blockScope, null, 0, 0, 28, null));
                    irContainerExpressionMutableStatementContainer2.getStatements().add(ComposableFunctionBodyTransformer.irEndReplaceableGroup$default(this, 0, 0, blockScope, 3, null));
                }
            }
        }, new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.asCoalescableGroup.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return ComposableFunctionBodyTransformer.irEndReplaceableGroup$default(ComposableFunctionBodyTransformer.this, 0, 0, blockScope, 3, null);
            }
        });
        return wrap(irExpression, CollectionsKt.listOf(irContainerExpressionMutableStatementContainer), CollectionsKt.listOf(irContainerExpressionMutableStatementContainer2));
    }

    private final IrExpression asReplaceableGroup(IrExpression irExpression, final Scope.BlockScope blockScope) {
        getCurrentFunctionScope().getMetrics().recordGroup();
        if (!blockScope.getHasComposableCalls() && !blockScope.getHasReturn() && !blockScope.getHasJump()) {
            return wrap$default(this, irExpression, CollectionsKt.listOf((Object[]) new IrExpression[]{irStartReplaceableGroup$default(this, (IrElement) irExpression, blockScope, null, irExpression.getStartOffset(), irExpression.getEndOffset(), 4, null), irEndReplaceableGroup(irExpression.getStartOffset(), irExpression.getEndOffset(), blockScope)}), null, 2, null);
        }
        blockScope.realizeGroup(new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.asReplaceableGroup.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return ComposableFunctionBodyTransformer.irEndReplaceableGroup$default(ComposableFunctionBodyTransformer.this, 0, 0, blockScope, 3, null);
            }
        });
        return endsWithReturnOrJump(irExpression) ? wrap$default(this, irExpression, CollectionsKt.listOf(irStartReplaceableGroup$default(this, (IrElement) irExpression, blockScope, null, 0, 0, 28, null)), null, 2, null) : wrap(irExpression, CollectionsKt.listOf(irStartReplaceableGroup$default(this, (IrElement) irExpression, blockScope, null, irExpression.getStartOffset(), irExpression.getEndOffset(), 4, null)), CollectionsKt.listOf(irEndReplaceableGroup(irExpression.getStartOffset(), irExpression.getEndOffset(), blockScope)));
    }

    private final IrExpression buildChangedParamForCall(List<ParamMeta> params) {
        int iBitsForSlot;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int iBitsForSlot2 = 0;
        for (Object obj : params) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ParamMeta paramMeta = (ParamMeta) obj;
            Stability stability = paramMeta.getStability();
            if (StabilityKt.knownUnstable(stability)) {
                iBitsForSlot2 = StabilityBits.UNSTABLE.bitsForSlot(i) | iBitsForSlot2;
            } else {
                if (StabilityKt.knownStable(stability)) {
                    iBitsForSlot2 |= StabilityBits.STABLE.bitsForSlot(i);
                } else {
                    IrExpression irExpressionIrStableExpression = irStableExpression(stability, new Function1<IrTypeParameter, IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$buildChangedParamForCall$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @Nullable
                        public final IrExpression invoke(@NotNull IrTypeParameter irTypeParameter) {
                            return this.this$0.irTypeParameterStability(irTypeParameter);
                        }
                    });
                    if (irExpressionIrStableExpression != null) {
                        if (i != 0) {
                            IrType intType = getContext().getIrBuiltIns().getIntType();
                            irExpressionIrStableExpression = (IrExpression) irCall(binaryOperator(intType, OperatorNameConventions.SHL, intType), null, irExpressionIrStableExpression, null, irConst(i * 3));
                        }
                        arrayList.add(irExpressionIrStableExpression);
                    }
                }
                if (paramMeta.isVararg() || !paramMeta.isProvided()) {
                    iBitsForSlot = ParamState.Uncertain.bitsForSlot(i);
                } else if (paramMeta.isStatic()) {
                    iBitsForSlot = ParamState.Static.bitsForSlot(i);
                } else if (paramMeta.isCertain()) {
                    IrChangedBitMaskValue maskParam = paramMeta.getMaskParam();
                    if (maskParam == null) {
                        throw new IllegalStateException("Mask param required if param is Certain".toString());
                    }
                    int maskSlot = paramMeta.getMaskSlot();
                    if (!(maskSlot != -1)) {
                        throw new IllegalArgumentException("invalid parent slot for Certain param".toString());
                    }
                    arrayList.add(irAnd((IrExpression) irConst(ParamState.Mask.bitsForSlot(i)), maskParam.irShiftBits(maskSlot, i)));
                } else {
                    iBitsForSlot = ParamState.Uncertain.bitsForSlot(i);
                }
                iBitsForSlot2 |= iBitsForSlot;
            }
            i = i2;
        }
        if (arrayList.isEmpty()) {
            return irConst(iBitsForSlot2);
        }
        if (iBitsForSlot2 != 0) {
            IrExpression irExpressionIrConst = irConst(iBitsForSlot2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                irExpressionIrConst = (IrExpression) irOr(irExpressionIrConst, (IrExpression) it.next());
            }
            return irExpressionIrConst;
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

    private final List<IrExpression> buildChangedParamsForCall(List<ParamMeta> contextParams, List<ParamMeta> valueParams, ParamMeta extensionParam, ParamMeta dispatchParam) {
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(extensionParam), (Iterable) contextParams), (Iterable) valueParams), (Iterable) CollectionsKt.listOfNotNull(dispatchParam));
        int iChangedParamCount = ComposableFunctionBodyTransformerKt.changedParamCount(listPlus.size(), 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iChangedParamCount; i++) {
            int i2 = i * 10;
            arrayList.add(buildChangedParamForCall(listPlus.subList(i2, Math.min(i2 + 10, listPlus.size()))));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0467  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c4  */
    private final boolean buildPreambleStatementsAndReturnIfSkippingPossible(IrElement sourceElement, IrStatementContainer skipPreamble, IrStatementContainer bodyPreamble, boolean isSkippableDeclaration, Scope.FunctionScope scope, final IrChangedBitMaskValue dirty, IrChangedBitMaskValue changedParam, IrDefaultBitMaskValue defaultParam, Scope.ParametersScope defaultScope) {
        boolean z;
        char c;
        boolean z2;
        char c2;
        boolean z3;
        int i;
        IrExpression irExpressionIrIf;
        IrExpression[] irExpressionArr;
        boolean z4;
        List<IrValueParameter> allTrackedParams = scope.getAllTrackedParams();
        int size = allTrackedParams.size();
        boolean[] zArr = new boolean[size];
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= size) {
                break;
            }
            zArr[i2] = true;
            i2++;
        }
        int size2 = allTrackedParams.size();
        IrExpression[] irExpressionArr2 = new IrExpression[size2];
        for (int i3 = 0; i3 < size2; i3++) {
            irExpressionArr2[i3] = null;
        }
        int size3 = allTrackedParams.size();
        Stability[] stabilityArr = new Stability[size3];
        for (int i4 = 0; i4 < size3; i4++) {
            stabilityArr[i4] = Stability.INSTANCE.getUnstable();
        }
        IrExpression irExpressionMutableStatementContainer = mutableStatementContainer();
        IrContainerExpression irContainerExpressionMutableStatementContainer = mutableStatementContainer();
        Iterator<T> it = allTrackedParams.iterator();
        int i5 = 0;
        while (true) {
            c = 2;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            IrValueParameter irValueParameter = (IrValueParameter) next;
            int iDefaultIndexForSlotIndex = scope.defaultIndexForSlotIndex(i5);
            IrExpressionBody defaultValue = irValueParameter.getDefaultValue();
            IrExpression expression = defaultValue != null ? defaultValue.getExpression() : null;
            if (defaultParam == null || expression == null) {
                irExpressionArr = irExpressionArr2;
                z4 = true;
            } else {
                boolean zIsStatic = isStatic(expression);
                zArr[i5] = zIsStatic;
                irExpressionArr2[i5] = expression;
                if (isSkippableDeclaration && !zIsStatic && (dirty instanceof IrChangedBitMaskVariable)) {
                    IrChangedBitMaskVariable irChangedBitMaskVariable = (IrChangedBitMaskVariable) dirty;
                    z4 = true;
                    irExpressionArr = irExpressionArr2;
                    irExpressionMutableStatementContainer.getStatements().add(irIf(irGetBit(defaultParam, iDefaultIndexForSlotIndex), AbstractComposeLowering.irBlock$default(this, null, null, CollectionsKt.listOf((Object[]) new IrExpression[]{irSet((IrValueDeclaration) irValueParameter, expression), irChangedBitMaskVariable.irSetSlotUncertain(i5)}), 3, null)));
                    irContainerExpressionMutableStatementContainer.getStatements().add(irIf(irGetBit(defaultParam, iDefaultIndexForSlotIndex), irChangedBitMaskVariable.irSetSlotUncertain(i5)));
                } else {
                    irExpressionArr = irExpressionArr2;
                    z4 = true;
                    irExpressionMutableStatementContainer.getStatements().add(irIf(irGetBit(defaultParam, iDefaultIndexForSlotIndex), irSet((IrValueDeclaration) irValueParameter, expression)));
                }
            }
            i5 = i6;
            irExpressionArr2 = irExpressionArr;
            z = z4;
            size = size;
            stabilityArr = stabilityArr;
        }
        Stability[] stabilityArr2 = stabilityArr;
        IrExpression[] irExpressionArr3 = irExpressionArr2;
        boolean z5 = z;
        int i7 = size;
        int i8 = 0;
        boolean z6 = isSkippableDeclaration;
        int i9 = 0;
        for (Object obj : allTrackedParams) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            IrValueParameter irValueParameter2 = (IrValueParameter) obj;
            IrType varargElementType = irValueParameter2.getVarargElementType();
            if (varargElementType == null) {
                varargElementType = irValueParameter2.getType();
            }
            Stability stabilityStabilityOf = StabilityKt.stabilityOf(varargElementType);
            stabilityArr2[i9] = stabilityStabilityOf;
            boolean z7 = irValueParameter2.getDefaultValue() == null ? z5 : false;
            boolean zKnownUnstable = StabilityKt.knownUnstable(stabilityStabilityOf);
            boolean z8 = scope.getUsedParams()[i9];
            scope.getMetrics().recordParameter(irValueParameter2, irValueParameter2.getType(), stabilityStabilityOf, irExpressionArr3[i9], zArr[i9], z8);
            if (z8 && zKnownUnstable && z7) {
                z6 = false;
            }
            i9 = i10;
        }
        int i11 = 0;
        for (Object obj2 : allTrackedParams) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            IrValueParameter irValueParameter3 = (IrValueParameter) obj2;
            if (AdditionalIrUtilsKt.isVararg(irValueParameter3)) {
                c2 = c;
                z3 = z5;
                i = i8;
            } else {
                int iDefaultIndexForSlotIndex2 = scope.defaultIndexForSlotIndex(i11);
                IrExpressionBody defaultValue2 = irValueParameter3.getDefaultValue();
                boolean zKnownUnstable2 = StabilityKt.knownUnstable(stabilityArr2[i11]);
                boolean z9 = scope.getUsedParams()[i11];
                if (z6 && z9 && (dirty instanceof IrChangedBitMaskVariable)) {
                    if (zKnownUnstable2 && defaultParam != null && defaultValue2 != null) {
                        skipPreamble.getStatements().add(irIf(irGetBit(defaultParam, iDefaultIndexForSlotIndex2), ((IrChangedBitMaskVariable) dirty).irOrSetBitsAtSlot(i11, (IrExpression) irConst(ParamState.Same.bitsForSlot(i11)))));
                    } else if (!zKnownUnstable2) {
                        boolean z10 = zArr[i11];
                        IrExpression irExpressionIrChanged = irChanged(irGet((IrValueDeclaration) irValueParameter3));
                        if (defaultParam != null && !z10) {
                            irExpressionIrChanged = irAndAnd(irIsProvided(defaultParam, iDefaultIndexForSlotIndex2), irExpressionIrChanged);
                        }
                        IrChangedBitMaskVariable irChangedBitMaskVariable2 = (IrChangedBitMaskVariable) dirty;
                        int i13 = i11;
                        IrExpression irExpressionIrOrSetBitsAtSlot = irChangedBitMaskVariable2.irOrSetBitsAtSlot(i13, (IrExpression) AbstractComposeLowering.irIfThenElse$default(this, getContext().getIrBuiltIns().getIntType(), irExpressionIrChanged, irConst(ParamState.Different.bitsForSlot(i11)), irConst(ParamState.Same.bitsForSlot(i11)), 0, 0, 48, null));
                        if (defaultParam == null || !z10) {
                            z3 = true;
                            c2 = 2;
                            i = 0;
                            irExpressionIrIf = irIf(irIsUncertainAndStable(changedParam, i13), irExpressionIrOrSetBitsAtSlot);
                        } else {
                            IrStatementOrigin irStatementOrigin = IrStatementOrigin.IF.INSTANCE;
                            c2 = 2;
                            IrBranch irBranch = irBranch(irGetBit(defaultParam, iDefaultIndexForSlotIndex2), irChangedBitMaskVariable2.irOrSetBitsAtSlot(i13, (IrExpression) irConst(ParamState.Static.bitsForSlot(i13))));
                            i = 0;
                            z3 = true;
                            irExpressionIrIf = (IrExpression) AbstractComposeLowering.irWhen$default(this, null, irStatementOrigin, CollectionsKt.listOf((Object[]) new IrBranch[]{irBranch, irBranch(irIsUncertainAndStable(changedParam, i13), irExpressionIrOrSetBitsAtSlot)}), 1, null);
                        }
                        skipPreamble.getStatements().add(irExpressionIrIf);
                    }
                    c2 = c;
                    z3 = z5;
                    i = i8;
                } else {
                    c2 = c;
                    z3 = z5;
                    i = i8;
                }
            }
            c = c2;
            i8 = i;
            i11 = i12;
            zArr = zArr;
            z5 = z3;
        }
        boolean z11 = z5;
        boolean[] zArr2 = zArr;
        int i14 = i8;
        for (Object obj3 : allTrackedParams) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            IrValueParameter irValueParameter4 = (IrValueParameter) obj3;
            IrType varargElementType2 = irValueParameter4.getVarargElementType();
            if (varargElementType2 != null && z6 && (dirty instanceof IrChangedBitMaskVariable)) {
                IrValueDeclaration irValueDeclaration = (IrValueDeclaration) irValueParameter4;
                IrExpression irExpressionIrGet = irGet(irValueDeclaration);
                IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(irValueParameter4.getType());
                Intrinsics.checkNotNull(classOrNull);
                IrSimpleFunctionSymbol propertyGetter = AdditionalIrUtilsKt.getPropertyGetter(classOrNull, "size");
                Intrinsics.checkNotNull(propertyGetter);
                final int i16 = i14;
                skipPreamble.getStatements().add(irStartMovableGroup((IrElement) irValueParameter4, (IrExpression) irMethodCall$default(this, irExpressionIrGet, propertyGetter.getOwner(), 0, 0, 12, null), defaultScope));
                skipPreamble.getStatements().add(irForLoop(varargElementType2, irGet(irValueDeclaration), new Function1<IrValueDeclaration, IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$buildPreambleStatementsAndReturnIfSkippingPossible$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final IrExpression invoke(@NotNull IrValueDeclaration irValueDeclaration2) {
                        IrChangedBitMaskVariable irChangedBitMaskVariable3 = (IrChangedBitMaskVariable) dirty;
                        int i17 = i16;
                        ComposableFunctionBodyTransformer composableFunctionBodyTransformer = this;
                        IrType intType = composableFunctionBodyTransformer.getContext().getIrBuiltIns().getIntType();
                        ComposableFunctionBodyTransformer composableFunctionBodyTransformer2 = this;
                        return irChangedBitMaskVariable3.irOrSetBitsAtSlot(i17, (IrExpression) AbstractComposeLowering.irIfThenElse$default(composableFunctionBodyTransformer, intType, composableFunctionBodyTransformer2.irChanged(composableFunctionBodyTransformer2.irGet(irValueDeclaration2)), this.irConst(ParamState.Different.bitsForSlot(i16)), this.irConst(ParamState.Uncertain.bitsForSlot(i16)), 0, 0, 48, null));
                    }
                }));
                skipPreamble.getStatements().add(irEndMovableGroup(scope));
                skipPreamble.getStatements().add(irIf(irIsUncertainAndStable(dirty, i16), ((IrChangedBitMaskVariable) dirty).irOrSetBitsAtSlot(i16, (IrExpression) irConst(ParamState.Same.bitsForSlot(i16)))));
            }
            z11 = z11;
            i14 = i15;
        }
        boolean z12 = z11;
        Iterator<T> it2 = allTrackedParams.iterator();
        while (it2.hasNext()) {
            ((IrValueParameter) it2.next()).setDefaultValue((IrExpressionBody) null);
        }
        if (z6) {
            int i17 = 0;
            while (true) {
                if (i17 >= i7) {
                    z2 = z12;
                    break;
                }
                if (!zArr2[i17]) {
                    z2 = false;
                    break;
                }
                i17++;
            }
            if (z2) {
                bodyPreamble.getStatements().addAll(irExpressionMutableStatementContainer.getStatements());
            } else if (irExpressionMutableStatementContainer.getStatements().isEmpty() ^ z12) {
                scope.setHasDefaultsGroup(z12);
                scope.getMetrics().recordGroup();
                bodyPreamble.getStatements().add(irStartDefaults(sourceElement));
                List statements = bodyPreamble.getStatements();
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.add(irSkipToGroupEnd(-1, -1));
                spreadBuilder.addSpread(irContainerExpressionMutableStatementContainer.getStatements().toArray(new IrStatement[0]));
                statements.add(AbstractComposeLowering.irIfThenElse$default(this, null, irOrOr(irEqual(changedParam.irLowBit(), (IrExpression) irConst(0)), (IrExpression) irDefaultsInvalid()), irExpressionMutableStatementContainer, AbstractComposeLowering.irBlock$default(this, null, null, CollectionsKt.listOf(spreadBuilder.toArray(new IrStatement[spreadBuilder.size()])), 3, null), 0, 0, 49, null));
                bodyPreamble.getStatements().add(irEndDefaults());
            }
        } else {
            bodyPreamble.getStatements().addAll(irExpressionMutableStatementContainer.getStatements());
        }
        return z6;
    }

    private final boolean canElideRememberGroup() {
        for (Scope parent = this.currentScope; parent != null; parent = ((Scope.CaptureScope) parent).getParent()) {
            if (parent instanceof Scope.FunctionScope) {
                Scope.FunctionScope functionScope = (Scope.FunctionScope) parent;
                return functionScope.getIsIntrinsiceRememberSafe() && !functionScope.isInlinedLambda();
            }
            if (parent instanceof Scope.ParametersScope) {
                return ((Scope.ParametersScope) parent).getIsIntrinsiceRememberSafe();
            }
            if (!(parent instanceof Scope.CaptureScope)) {
                break;
            }
        }
        return false;
    }

    private final void encounteredCapturedComposableCall() {
        for (Scope parent = this.currentScope; parent != null; parent = parent.getParent()) {
            if (parent instanceof Scope.CaptureScope) {
                ((Scope.CaptureScope) parent).markCapturedComposableCall();
                return;
            }
        }
    }

    private final void encounteredCoalescableGroup(Scope.BlockScope coalescableScope, Function0<Unit> realizeGroup, Function0<? extends IrExpression> makeEnd) {
        for (Scope parent = this.currentScope; parent != null; parent = parent.getParent()) {
            if (!(parent instanceof Scope.CallScope ? true : parent instanceof Scope.ReturnScope)) {
                if (!(parent instanceof Scope.FunctionScope)) {
                    if (!(parent instanceof Scope.BlockScope)) {
                        throw new IllegalStateException("Unexpected scope type".toString());
                    }
                    ((Scope.BlockScope) parent).markCoalescableGroup(coalescableScope, realizeGroup, makeEnd);
                    return;
                } else {
                    Scope.FunctionScope functionScope = (Scope.FunctionScope) parent;
                    functionScope.markCoalescableGroup(coalescableScope, realizeGroup, makeEnd);
                    if (!functionScope.isInlinedLambda()) {
                        return;
                    }
                }
            }
        }
    }

    private final void encounteredComposableCall(boolean withGroups, boolean isCached) {
        for (Scope parent = this.currentScope; parent != null; parent = parent.getParent()) {
            if (parent instanceof Scope.FunctionScope) {
                Scope.FunctionScope functionScope = (Scope.FunctionScope) parent;
                functionScope.recordComposableCall(withGroups, isCached);
                if (!functionScope.isInlinedLambda()) {
                    return;
                }
            } else {
                if (parent instanceof Scope.BlockScope) {
                    ((Scope.BlockScope) parent).recordComposableCall(withGroups, isCached);
                } else if (parent instanceof Scope.ClassScope) {
                    return;
                }
            }
            withGroups = true;
        }
    }

    private final void encounteredJump(IrBreakContinue jump, Function1<? super IrExpression, Unit> extraEndLocation) {
        for (Scope parent = this.currentScope; parent != null; parent = parent.getParent()) {
            if (parent instanceof Scope.ClassScope) {
                throw new IllegalStateException("Unexpected Class Scope encountered".toString());
            }
            if (parent instanceof Scope.FunctionScope) {
                if (!((Scope.FunctionScope) parent).isInlinedLambda()) {
                    throw new IllegalStateException("Unexpected Function Scope encountered".toString());
                }
            } else if (parent instanceof Scope.LoopScope) {
                Scope.LoopScope loopScope = (Scope.LoopScope) parent;
                loopScope.markJump(jump, extraEndLocation);
                if (Intrinsics.areEqual(jump.getLoop(), loopScope.getLoop())) {
                    return;
                }
            } else if (parent instanceof Scope.BlockScope) {
                ((Scope.BlockScope) parent).markJump(extraEndLocation);
            }
        }
    }

    private final void encounteredReturn(IrReturnTargetSymbol symbol, final Function1<? super IrExpression, Unit> extraEndLocation) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Scope parent = this.currentScope; parent != null; parent = parent.getParent()) {
            if (parent instanceof Scope.FunctionScope) {
                Scope.FunctionScope functionScope = (Scope.FunctionScope) parent;
                if (Intrinsics.areEqual(functionScope.getFunction(), symbol.getOwner())) {
                    if (z && getRollbackGroupMarkerEnabled()) {
                        Scope scope = this.currentScope;
                        final Scope.BlockScope blockScope = scope instanceof Scope.BlockScope ? (Scope.BlockScope) scope : null;
                        if (blockScope == null) {
                            blockScope = (Scope.BlockScope) parent;
                        }
                        if (functionScope.isInlinedLambda()) {
                            extraEndLocation.invoke(irEndToMarker(irGet((IrValueDeclaration) functionScope.allocateMarker()), blockScope));
                        } else {
                            final IrVariable irVariableAllocateMarker = functionScope.allocateMarker();
                            functionScope.markReturn(new Function1<IrExpression, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.encounteredReturn.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(IrExpression irExpression) {
                                    invoke2(irExpression);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull IrExpression irExpression) {
                                    Function1<IrExpression, Unit> function1 = extraEndLocation;
                                    ComposableFunctionBodyTransformer composableFunctionBodyTransformer = this;
                                    function1.invoke(composableFunctionBodyTransformer.irEndToMarker(composableFunctionBodyTransformer.irGet((IrValueDeclaration) irVariableAllocateMarker), blockScope));
                                    extraEndLocation.invoke(irExpression);
                                }
                            });
                        }
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Scope.BlockScope) it.next()).markReturn(extraEndLocation);
                        }
                        functionScope.markReturn(extraEndLocation);
                    }
                    functionScope.updateIntrinsiceRememberSafety(false);
                    return;
                }
                if (functionScope.isInlinedLambda() && functionScope.getInComposableCall()) {
                    z = true;
                }
            } else if (parent instanceof Scope.BlockScope) {
                arrayList.add(parent);
            }
        }
    }

    private final boolean endsWithReturnOrJump(IrExpression irExpression) {
        Object objLastOrNull = irExpression;
        while (true) {
            IrBlock irBlock = (IrStatement) objLastOrNull;
            if (irBlock == null) {
                return false;
            }
            if ((irBlock instanceof IrReturn) || (irBlock instanceof IrBreakContinue)) {
                return true;
            }
            if (!(irBlock instanceof IrBlock)) {
                return false;
            }
            objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) irBlock.getStatements());
        }
    }

    private final boolean extractParamMetaFromScopes(ParamMeta meta, IrValueDeclaration param) {
        int iIndexOf;
        IrDeclarationParent parent = param.getParent();
        for (Scope parent2 = this.currentScope; parent2 != null; parent2 = parent2.getParent()) {
            if (parent2 instanceof Scope.FunctionScope) {
                Scope.FunctionScope functionScope = (Scope.FunctionScope) parent2;
                if (Intrinsics.areEqual(functionScope.getFunction(), parent)) {
                    if (functionScope.getIsComposable() && (iIndexOf = CollectionsKt.indexOf((List<? extends IrValueDeclaration>) functionScope.getAllTrackedParams(), param)) != -1) {
                        meta.setCertain(true);
                        meta.setMaskParam(functionScope.getDirty());
                        meta.setMaskSlot(iIndexOf);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private final void forEach(Scope scope, Function1<? super Scope, Unit> function1) {
        while (scope != null) {
            function1.invoke(scope);
            scope = scope.getParent();
        }
    }

    private final int functionSourceKey() {
        IrFunction function = getCurrentFunctionScope().getFunction();
        if (function instanceof IrSimpleFunction) {
            return sourceKey((IrSimpleFunction) function);
        }
        throw new IllegalStateException(("expected simple function: " + Reflection.getOrCreateKotlinClass(function.getClass())).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<IrTypeArgument> getArguments(IrType irType) {
        IrSimpleType irSimpleType = irType instanceof IrSimpleType ? (IrSimpleType) irType : null;
        List<IrTypeArgument> arguments = irSimpleType != null ? irSimpleType.getArguments() : null;
        return arguments == null ? CollectionsKt.emptyList() : arguments;
    }

    private final IrSimpleFunction getCacheFunction() {
        return (IrSimpleFunction) this.cacheFunction.value($$delegatedProperties[24].getName());
    }

    private final Map<PrimitiveType, IrSimpleFunction> getChangedPrimitiveFunctions() {
        return (Map) this.changedPrimitiveFunctions.value($$delegatedProperties[0].getName());
    }

    private final Scope.FunctionScope getCurrentFunctionScope() {
        Scope.FunctionScope functionScope = this.currentScope.getFunctionScope();
        if (functionScope != null) {
            return functionScope;
        }
        throw new IllegalStateException(("Expected a FunctionScope but none exist. \n" + printScopeStack()).toString());
    }

    private final IrProperty getCurrentMarkerProperty() {
        return (IrProperty) this.currentMarkerProperty.value($$delegatedProperties[10].getName());
    }

    private final IrProperty getDefaultsInvalidFunction() {
        return (IrProperty) this.defaultsInvalidFunction.value($$delegatedProperties[22].getName());
    }

    private final IrSimpleFunction getEndDefaultsFunction() {
        return (IrSimpleFunction) this.endDefaultsFunction.value($$delegatedProperties[6].getName());
    }

    private final IrSimpleFunction getEndMovableFunction() {
        return (IrSimpleFunction) this.endMovableFunction.value($$delegatedProperties[8].getName());
    }

    private final IrSimpleFunction getEndReplaceableFunction() {
        return (IrSimpleFunction) this.endReplaceableFunction.value($$delegatedProperties[4].getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrSimpleFunction getEndRestartGroupFunction() {
        return (IrSimpleFunction) this.endRestartGroupFunction.value($$delegatedProperties[12].getName());
    }

    private final IrSimpleFunction getEndToMarkerFunction() {
        return (IrSimpleFunction) this.endToMarkerFunction.value($$delegatedProperties[11].getName());
    }

    private final boolean getHasExplicitGroups(IrFunction irFunction) {
        return IrUtilsKt.hasAnnotation((IrAnnotationContainer) irFunction, ComposeFqNames.INSTANCE.getExplicitGroupsComposable());
    }

    private final boolean getHasNonRestartableAnnotation(IrFunction irFunction) {
        return IrUtilsKt.hasAnnotation((IrAnnotationContainer) irFunction, ComposeFqNames.INSTANCE.getNonRestartableComposable());
    }

    private final boolean getHasReadOnlyAnnotation(IrFunction irFunction) {
        return IrUtilsKt.hasAnnotation((IrAnnotationContainer) irFunction, ComposeFqNames.INSTANCE.getReadOnlyComposable());
    }

    private final boolean getHasSourceInformation(Scope.BlockScope blockScope) {
        return blockScope.calculateHasSourceInformation(this.collectSourceInformation);
    }

    private final IrSimpleFunction getJoinKeyFunction() {
        return (IrSimpleFunction) this.joinKeyFunction.value($$delegatedProperties[23].getName());
    }

    private final boolean getRollbackGroupMarkerEnabled() {
        return (getCurrentMarkerProperty() == null || getEndToMarkerFunction() == null) ? false : true;
    }

    private final IrSimpleFunction getSkipCurrentGroupFunction() {
        return (IrSimpleFunction) this.skipCurrentGroupFunction.value($$delegatedProperties[2].getName());
    }

    private final IrSimpleFunction getSkipToGroupEndFunction() {
        return (IrSimpleFunction) this.skipToGroupEndFunction.value($$delegatedProperties[1].getName());
    }

    private final String getSourceInformation(Scope.BlockScope blockScope) {
        return blockScope.calculateSourceInfo(this.collectSourceInformation);
    }

    private final IrSimpleFunction getSourceInformationFunction() {
        return (IrSimpleFunction) this.sourceInformationFunction.value($$delegatedProperties[13].getName());
    }

    private final IrSimpleFunction getSourceInformationMarkerEndFunction() {
        return (IrSimpleFunction) this.sourceInformationMarkerEndFunction.value($$delegatedProperties[19].getName());
    }

    private final IrSimpleFunction getSourceInformationMarkerStartFunction() {
        return (IrSimpleFunction) this.sourceInformationMarkerStartFunction.value($$delegatedProperties[14].getName());
    }

    private final IrSimpleFunction getStartDefaultsFunction() {
        return (IrSimpleFunction) this.startDefaultsFunction.value($$delegatedProperties[5].getName());
    }

    private final IrSimpleFunction getStartMovableFunction() {
        return (IrSimpleFunction) this.startMovableFunction.value($$delegatedProperties[7].getName());
    }

    private final IrSimpleFunction getStartReplaceableFunction() {
        return (IrSimpleFunction) this.startReplaceableFunction.value($$delegatedProperties[3].getName());
    }

    private final IrSimpleFunction getStartRestartGroupFunction() {
        return (IrSimpleFunction) this.startRestartGroupFunction.value($$delegatedProperties[9].getName());
    }

    private final IrSimpleFunction getTraceEventEndFunction() {
        return (IrSimpleFunction) this.traceEventEndFunction.value($$delegatedProperties[18].getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getTraceEventMarkersEnabled() {
        return getTraceEventEndFunction() != null;
    }

    private final IrSimpleFunction getTraceEventStartFunction() {
        return (IrSimpleFunction) this.traceEventStartFunction.value($$delegatedProperties[17].getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrSimpleFunction getUpdateChangedFlagsFunction() {
        return (IrSimpleFunction) this.updateChangedFlagsFunction.value($$delegatedProperties[15].getName());
    }

    private final IrSimpleFunction getUpdateScopeFunction() {
        return (IrSimpleFunction) this.updateScopeFunction.value($$delegatedProperties[20].getName());
    }

    private final IrExpression handleLoop(IrLoop loop) {
        Scope.LoopScope loopScope = new Scope.LoopScope(loop);
        Scope scope = this.currentScope;
        this.currentScope = loopScope;
        loopScope.setParent(scope);
        loopScope.setLevel(scope.getLevel() + 1);
        try {
            loop.setCondition(loop.getCondition().transform((IrElementTransformer) this, (Object) null));
            if (loopScope.getNeedsGroupPerIteration() && loopScope.getHasComposableCalls()) {
                loop.setCondition(asReplaceableGroup(loop.getCondition(), loopScope));
            }
            IrExpression body = loop.getBody();
            loop.setBody(body != null ? body.transform((IrElementTransformer) this, (Object) null) : null);
            if (loopScope.getNeedsGroupPerIteration() && loopScope.getHasComposableCalls()) {
                IrExpression body2 = loop.getBody();
                if (body2 instanceof IrBlock) {
                    loop.setBody(withReplaceableGroupStatements((IrBlock) body2, loopScope));
                } else {
                    loop.setBody(body2 != null ? asReplaceableGroup(body2, loopScope) : null);
                }
            }
            this.currentScope = scope;
            if (loopScope.getNeedsGroupPerIteration() || !loopScope.getHasComposableCalls()) {
                return (IrExpression) loop;
            }
            loopScope.realizeAllDirectChildren();
            return asCoalescableGroup((IrExpression) loop, loopScope);
        } catch (Throwable th) {
            this.currentScope = scope;
            throw th;
        }
    }

    private final <R> R inScope(Scope scope, Function0<? extends R> block) {
        Scope scope2 = this.currentScope;
        this.currentScope = scope;
        scope.setParent(scope2);
        scope.setLevel(scope2.getLevel() + 1);
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            this.currentScope = scope2;
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrExpression irBitsForSlot(int bits, int slot) {
        return irConst(ComposableFunctionBodyTransformerKt.bitsForSlot(bits, slot));
    }

    private final IrExpression irCache(int startOffset, int endOffset, IrType returnType, IrExpression invalid, IrExpression calculation) {
        IrSimpleFunctionSymbol irSimpleFunctionSymbolReferenceFunction = referenceFunction((IrFunctionSymbol) getCacheFunction().getSymbol());
        Intrinsics.checkNotNull(irSimpleFunctionSymbolReferenceFunction, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol");
        IrSimpleFunctionSymbol irSimpleFunctionSymbol = irSimpleFunctionSymbolReferenceFunction;
        IrExpression irCallImpl = new IrCallImpl(startOffset, endOffset, returnType, irSimpleFunctionSymbol, irSimpleFunctionSymbol.getOwner().getTypeParameters().size(), irSimpleFunctionSymbol.getOwner().getValueParameters().size(), (IrStatementOrigin) null, (IrClassSymbol) null, 192, (DefaultConstructorMarker) null);
        irCallImpl.setExtensionReceiver(irCurrentComposer$default(this, 0, 0, (IrValueParameter) null, 7, (Object) null));
        irCallImpl.putValueArgument(0, invalid);
        irCallImpl.putValueArgument(1, calculation);
        irCallImpl.putTypeArgument(0, returnType);
        return irCallImpl;
    }

    private final IrCall irCall(IrFunction function, int startOffset, int endOffset) {
        IrType returnType = function.getReturnType();
        IrSimpleFunctionSymbol irSimpleFunctionSymbolReferenceFunction = referenceFunction(function.getSymbol());
        Intrinsics.checkNotNull(irSimpleFunctionSymbolReferenceFunction, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol");
        IrSimpleFunctionSymbol irSimpleFunctionSymbol = irSimpleFunctionSymbolReferenceFunction;
        return new IrCallImpl(startOffset, endOffset, returnType, irSimpleFunctionSymbol, irSimpleFunctionSymbol.getOwner().getTypeParameters().size(), irSimpleFunctionSymbol.getOwner().getValueParameters().size(), (IrStatementOrigin) null, (IrClassSymbol) null, 192, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ IrCall irCall$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, IrFunction irFunction, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return composableFunctionBodyTransformer.irCall(irFunction, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrExpression irChanged(IrExpression value) {
        IrExpression irExpressionUnboxValueIfInline = unboxValueIfInline(value);
        IrType type = irExpressionUnboxValueIfInline.getType();
        IrSimpleFunction irSimpleFunction = getChangedPrimitiveFunctions().get(toPrimitiveType(type));
        if (irSimpleFunction == null) {
            irSimpleFunction = IrTypeUtilsKt.isFunction(type) ? this.changedInstanceFunction : this.changedFunction;
        }
        IrExpression irExpressionIrMethodCall$default = irMethodCall$default(this, irCurrentComposer$default(this, 0, 0, (IrValueParameter) null, 7, (Object) null), (IrFunction) irSimpleFunction, 0, 0, 12, null);
        irExpressionIrMethodCall$default.putValueArgument(0, irExpressionUnboxValueIfInline);
        return irExpressionIrMethodCall$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrExpression irChangedOrInferredChanged(IrExpression arg) {
        ParamMeta paramMetaParamMetaOf = paramMetaOf(arg, true);
        IrChangedBitMaskValue maskParam = paramMetaParamMetaOf.getMaskParam();
        if (paramMetaParamMetaOf.isStatic()) {
            return null;
        }
        if (paramMetaParamMetaOf.isCertain() && StabilityKt.knownStable(paramMetaParamMetaOf.getStability()) && (maskParam instanceof IrChangedBitMaskVariable)) {
            return irEqual(((IrChangedBitMaskVariable) maskParam).irIsolateBitsAtSlot(paramMetaParamMetaOf.getMaskSlot(), true), (IrExpression) irConst(ParamState.Different.bitsForSlot(paramMetaParamMetaOf.getMaskSlot())));
        }
        if (!paramMetaParamMetaOf.isCertain() || StabilityKt.knownUnstable(paramMetaParamMetaOf.getStability()) || !(maskParam instanceof IrChangedBitMaskVariable)) {
            return (!paramMetaParamMetaOf.isCertain() || StabilityKt.knownUnstable(paramMetaParamMetaOf.getStability()) || maskParam == null) ? irChanged(arg) : irOrOr(irAndAnd((IrExpression) irGreater((IrExpression) irXor(maskParam.irIsolateBitsAtSlot(paramMetaParamMetaOf.getMaskSlot(), true), (IrExpression) irConst(ComposableFunctionBodyTransformerKt.bitsForSlot(3, paramMetaParamMetaOf.getMaskSlot()))), (IrExpression) irConst(ComposableFunctionBodyTransformerKt.bitsForSlot(2, paramMetaParamMetaOf.getMaskSlot()))), irChanged(arg)), irEqual(maskParam.irIsolateBitsAtSlot(paramMetaParamMetaOf.getMaskSlot(), false), (IrExpression) irConst(ParamState.Different.bitsForSlot(paramMetaParamMetaOf.getMaskSlot()))));
        }
        IrChangedBitMaskVariable irChangedBitMaskVariable = (IrChangedBitMaskVariable) maskParam;
        return irOrOr(irEqual(irChangedBitMaskVariable.irIsolateBitsAtSlot(paramMetaParamMetaOf.getMaskSlot(), true), (IrExpression) irConst(ParamState.Different.bitsForSlot(paramMetaParamMetaOf.getMaskSlot()))), irAndAnd(irNotEqual(irChangedBitMaskVariable.irSlotAnd(paramMetaParamMetaOf.getMaskSlot(), StabilityBits.UNSTABLE.getBits()), (IrExpression) irConst(0)), irChanged(arg)));
    }

    private final IrExpression irCurrentComposer(int startOffset, int endOffset, IrValueParameter composerParameter) {
        return new IrGetValueImpl(startOffset, endOffset, composerParameter.getSymbol(), (IrStatementOrigin) null, 8, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ IrExpression irCurrentComposer$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, int i, int i2, IrValueParameter irValueParameter, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        if ((i3 & 4) != 0) {
            irValueParameter = composableFunctionBodyTransformer.nearestComposer();
        }
        return composableFunctionBodyTransformer.irCurrentComposer(i, i2, irValueParameter);
    }

    private final IrCall irDefaultsInvalid() {
        IrExpression irExpressionIrCurrentComposer$default = irCurrentComposer$default(this, 0, 0, (IrValueParameter) null, 7, (Object) null);
        IrFunction getter = getDefaultsInvalidFunction().getGetter();
        Intrinsics.checkNotNull(getter);
        return irMethodCall$default(this, irExpressionIrCurrentComposer$default, getter, 0, 0, 12, null);
    }

    private final IrExpression irEndDefaults() {
        return irMethodCall$default(this, irCurrentComposer$default(this, 0, 0, (IrValueParameter) null, 7, (Object) null), getEndDefaultsFunction(), 0, 0, 12, null);
    }

    private final IrExpression irEndMovableGroup(Scope.BlockScope scope) {
        return irMethodCall$default(this, irCurrentComposer$default(this, scope, 0, 0, 3, (Object) null), getEndMovableFunction(), 0, 0, 12, null);
    }

    private final IrExpression irEndReplaceableGroup(int startOffset, int endOffset, Scope.BlockScope scope) {
        return irMethodCall(irCurrentComposer(scope, startOffset, endOffset), (IrFunction) getEndReplaceableFunction(), startOffset, endOffset);
    }

    public static /* synthetic */ IrExpression irEndReplaceableGroup$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, int i, int i2, Scope.BlockScope blockScope, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return composableFunctionBodyTransformer.irEndReplaceableGroup(i, i2, blockScope);
    }

    private final IrExpression irEndRestartGroup(Scope.BlockScope scope) {
        return irMethodCall$default(this, irCurrentComposer$default(this, scope, 0, 0, 3, (Object) null), getEndRestartGroupFunction(), 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrExpression irEndRestartGroupAndUpdateScope(Scope.FunctionScope scope, final IrChangedBitMaskValue changedParam, final IrDefaultBitMaskValue defaultParam, int numRealValueParameters) {
        final IrDeclarationWithName function = scope.getFunction();
        IrValueParameter dispatchReceiverParameter = function.getDispatchReceiverParameter();
        final IrVariableImpl irVariableImplIrTemporary$default = dispatchReceiverParameter != null ? irTemporary$default(this, irGet((IrValueDeclaration) dispatchReceiverParameter), "rcvr", (IrType) null, false, false, 28, (Object) null) : null;
        int size = function.getValueParameters().size();
        final int contextReceiverParametersCount = function.getContextReceiverParametersCount() + numRealValueParameters;
        final int i = contextReceiverParametersCount + 1;
        final int iChangedParamCount = ComposableFunctionBodyTransformerKt.changedParamCount(numRealValueParameters, ComposableFunctionBodyTransformerKt.getThisParamCount(function)) + i;
        if (defaultParam == null) {
            if (!(size == iChangedParamCount)) {
                throw new IllegalArgumentException(("Expected " + iChangedParamCount + " params for " + IrUtilsKt.getFqNameWhenAvailable(function) + ", found " + size).toString());
            }
        } else {
            int iDefaultParamCount = ComposableFunctionBodyTransformerKt.defaultParamCount(contextReceiverParametersCount) + iChangedParamCount;
            if (!(size == iDefaultParamCount)) {
                throw new IllegalArgumentException(("Expected " + iDefaultParamCount + " params for " + IrUtilsKt.getFqNameWhenAvailable(function) + ", found " + size).toString());
            }
        }
        return AbstractComposeLowering.irBlock$default(this, null, null, CollectionsKt.listOfNotNull((Object[]) new IrElement[]{irVariableImplIrTemporary$default, irSafeCall(irEndRestartGroup(scope), (IrFunctionSymbol) getUpdateScopeFunction().getSymbol(), irLambdaExpression(-1, -1, getBuiltIns().getUnitType(), new Function1<IrSimpleFunction, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$irEndRestartGroupAndUpdateScope$lambda$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IrSimpleFunction irSimpleFunction) {
                invoke2(irSimpleFunction);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IrSimpleFunction irSimpleFunction) {
                irSimpleFunction.setParent(function);
                IrFunction irFunction = (IrFunction) irSimpleFunction;
                KtxNameConventions ktxNameConventions = KtxNameConventions.INSTANCE;
                String identifier = ktxNameConventions.getCOMPOSER_PARAMETER().getIdentifier();
                ComposableFunctionBodyTransformer composableFunctionBodyTransformer = this;
                IrValueDeclaration irValueDeclarationAddValueParameter$default = DeclarationBuildersKt.addValueParameter$default(irFunction, identifier, IrTypesKt.makeNullable(composableFunctionBodyTransformer.replaceArgumentsWithStarProjections((IrType) IrUtilsKt.getDefaultType(composableFunctionBodyTransformer.getComposerIrClass()))), (IrDeclarationOrigin) null, 4, (Object) null);
                DeclarationBuildersKt.addValueParameter$default(irFunction, ktxNameConventions.getFORCE_PARAMETER(), this.getBuiltIns().getIntType(), (IrDeclarationOrigin) null, 4, (Object) null);
                IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(this.getContext(), irSimpleFunction.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
                IrFunction irFunction2 = function;
                int i2 = contextReceiverParametersCount;
                IrChangedBitMaskValue irChangedBitMaskValue = changedParam;
                int i3 = i;
                IrDefaultBitMaskValue irDefaultBitMaskValue = defaultParam;
                int i4 = iChangedParamCount;
                IrValueDeclaration irValueDeclaration = irVariableImplIrTemporary$default;
                IrBuilderWithScope irBlockBodyBuilder = new IrBlockBodyBuilder(declarationIrBuilder.getContext(), declarationIrBuilder.getScope(), declarationIrBuilder.getStartOffset(), declarationIrBuilder.getEndOffset());
                IrBuilderWithScope irBuilderWithScope = irBlockBodyBuilder;
                IrExpression irExpressionIrCall = ExpressionHelpersKt.irCall(irBuilderWithScope, irFunction2.getSymbol());
                int i5 = 0;
                for (Iterator it = irExpressionIrCall.getSymbol().getOwner().getValueParameters().iterator(); it.hasNext(); it = it) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    IrValueDeclaration irValueDeclaration2 = (IrValueParameter) next;
                    if (AdditionalIrUtilsKt.isVararg(irValueDeclaration2)) {
                        IrType type = irValueDeclaration2.getType();
                        IrType varargElementType = irValueDeclaration2.getVarargElementType();
                        Intrinsics.checkNotNull(varargElementType);
                        irExpressionIrCall.putValueArgument(i5, new IrVarargImpl(-1, -1, type, varargElementType, CollectionsKt.listOf(new IrSpreadElementImpl(-1, -1, ExpressionHelpersKt.irGet(irBuilderWithScope, irValueDeclaration2)))));
                    } else {
                        irExpressionIrCall.putValueArgument(i5, ExpressionHelpersKt.irGet(irBuilderWithScope, irValueDeclaration2));
                    }
                    i5 = i6;
                }
                irExpressionIrCall.putValueArgument(i2, ExpressionHelpersKt.irGet(irBuilderWithScope, irValueDeclarationAddValueParameter$default));
                irChangedBitMaskValue.putAsValueArgumentInWithLowBit(irExpressionIrCall, i3, true);
                if (irDefaultBitMaskValue != null) {
                    irDefaultBitMaskValue.putAsValueArgumentIn(irExpressionIrCall, i4);
                }
                IrValueDeclaration extensionReceiverParameter = irFunction2.getExtensionReceiverParameter();
                irExpressionIrCall.setExtensionReceiver((IrExpression) (extensionReceiverParameter != null ? ExpressionHelpersKt.irGet(irBuilderWithScope, extensionReceiverParameter) : null));
                irExpressionIrCall.setDispatchReceiver((IrExpression) (irValueDeclaration != null ? ExpressionHelpersKt.irGet(irBuilderWithScope, irValueDeclaration) : null));
                int i7 = 0;
                for (Object obj : irFunction2.getTypeParameters()) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    irExpressionIrCall.putTypeArgument(i7, IrTypesKt.getDefaultType((IrTypeParameter) obj));
                    i7 = i8;
                }
                Unit unit = Unit.INSTANCE;
                irBlockBodyBuilder.unaryPlus(ExpressionHelpersKt.irReturn(irBuilderWithScope, irExpressionIrCall));
                irSimpleFunction.setBody(irBlockBodyBuilder.doBuild());
            }
        }))}), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrExpression irEndToMarker(IrExpression marker, Scope.BlockScope scope) {
        IrExpression irExpressionIrCurrentComposer$default = irCurrentComposer$default(this, scope, 0, 0, 3, (Object) null);
        IrFunction endToMarkerFunction = getEndToMarkerFunction();
        Intrinsics.checkNotNull(endToMarkerFunction);
        IrExpression irExpressionIrMethodCall$default = irMethodCall$default(this, irExpressionIrCurrentComposer$default, endToMarkerFunction, 0, 0, 12, null);
        irExpressionIrMethodCall$default.putValueArgument(0, marker);
        return irExpressionIrMethodCall$default;
    }

    private final IrConst<Integer> irFunctionSourceKey() {
        return IrConstImpl.Companion.int(-1, -1, getContext().getIrBuiltIns().getIntType(), functionSourceKey());
    }

    private final IrExpression irIfTraceInProgress(IrExpression body) {
        IrExpression irExpressionIrIsTraceInProgress = irIsTraceInProgress();
        if (irExpressionIrIsTraceInProgress != null) {
            return irIf(irExpressionIrIsTraceInProgress, body);
        }
        return null;
    }

    private final IrExpression irIsProvided(IrDefaultBitMaskValue irDefaultBitMaskValue, int slot) {
        return irEqual(irDefaultBitMaskValue.irIsolateBitAtIndex(slot), (IrExpression) irConst(0));
    }

    private final IrCall irIsSkipping() {
        IrExpression irExpressionIrCurrentComposer$default = irCurrentComposer$default(this, 0, 0, (IrValueParameter) null, 7, (Object) null);
        IrFunction getter = isSkippingFunction().getGetter();
        Intrinsics.checkNotNull(getter);
        return irMethodCall$default(this, irExpressionIrCurrentComposer$default, getter, 0, 0, 12, null);
    }

    private final IrExpression irIsTraceInProgress() {
        IrFunction irFunctionIsTraceInProgressFunction = isTraceInProgressFunction();
        return (IrExpression) (irFunctionIsTraceInProgressFunction != null ? irCall$default(this, irFunctionIsTraceInProgressFunction, 0, 0, 6, null) : null);
    }

    private final IrExpression irIsUncertainAndStable(IrChangedBitMaskValue changed, int slot) {
        return irEqual(changed.irIsolateBitsAtSlot(slot, true), (IrExpression) irConst(0));
    }

    private final IrExpression irJoinKeyChain(List<? extends IrExpression> keyExprs) {
        Iterator<T> it = keyExprs.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            IrExpression irExpression = (IrExpression) it.next();
            IrCall irCallIrMethodCall$default = irMethodCall$default(this, irCurrentComposer$default(this, 0, 0, (IrValueParameter) null, 7, (Object) null), getJoinKeyFunction(), 0, 0, 12, null);
            irCallIrMethodCall$default.putValueArgument(0, (IrExpression) next);
            irCallIrMethodCall$default.putValueArgument(1, irExpression);
            next = (IrExpression) irCallIrMethodCall$default;
        }
        return (IrExpression) next;
    }

    private final IrCall irMethodCall(IrExpression target, IrFunction function, int startOffset, int endOffset) {
        IrCall irCall = irCall(function, startOffset, endOffset);
        irCall.setDispatchReceiver(target);
        return irCall;
    }

    public static /* synthetic */ IrCall irMethodCall$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, IrExpression irExpression, IrFunction irFunction, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = -1;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        return composableFunctionBodyTransformer.irMethodCall(irExpression, irFunction, i, i2);
    }

    private final IrExpression irSafeCall(IrExpression target, IrFunctionSymbol symbol, IrExpression... args) {
        IrElement irElementIrTemporary$default = irTemporary$default(this, target, "safe_receiver", (IrType) null, false, false, 28, (Object) null);
        IrStatementOrigin irStatementOrigin = IrStatementOrigin.SAFE_CALL.INSTANCE;
        IrElement[] irElementArr = new IrElement[2];
        int i = 0;
        irElementArr[0] = irElementIrTemporary$default;
        IrValueDeclaration irValueDeclaration = (IrValueDeclaration) irElementIrTemporary$default;
        IrExpression irExpressionIrEqual = irEqual(irGet(irValueDeclaration), (IrExpression) irNull());
        IrExpression irExpressionIrNull = irNull();
        IrExpression irExpressionIrCall$default = AbstractComposeLowering.irCall$default(this, symbol, null, null, null, new IrExpression[0], 14, null);
        irExpressionIrCall$default.setDispatchReceiver(irGet(irValueDeclaration));
        int length = args.length;
        int i2 = 0;
        while (i < length) {
            irExpressionIrCall$default.putValueArgument(i2, args[i]);
            i++;
            i2++;
        }
        Unit unit = Unit.INSTANCE;
        irElementArr[1] = AbstractComposeLowering.irIfThenElse$default(this, null, irExpressionIrEqual, irExpressionIrNull, irExpressionIrCall$default, 0, 0, 49, null);
        return AbstractComposeLowering.irBlock$default(this, null, irStatementOrigin, CollectionsKt.listOf((Object[]) irElementArr), 1, null);
    }

    private final IrExpression irSkipToGroupEnd(int startOffset, int endOffset) {
        return irMethodCall(irCurrentComposer$default(this, startOffset, endOffset, (IrValueParameter) null, 4, (Object) null), (IrFunction) getSkipToGroupEndFunction(), startOffset, endOffset);
    }

    private final IrExpression irSourceInformation(Scope.BlockScope scope) {
        IrExpression irExpressionIrCall$default = irCall$default(this, getSourceInformationFunction(), 0, 0, 6, null);
        irExpressionIrCall$default.putValueArgument(0, irCurrentComposer$default(this, scope, 0, 0, 3, (Object) null));
        recordSourceParameter(irExpressionIrCall$default, 1, scope);
        return irExpressionIrCall$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrExpression irSourceInformationMarkerEnd(IrElement element, Scope.BlockScope scope) {
        IrExpression irExpressionIrCall = irCall((IrFunction) getSourceInformationMarkerEndFunction(), element.getStartOffset(), element.getEndOffset());
        irExpressionIrCall.putValueArgument(0, irCurrentComposer$default(this, scope, 0, 0, 3, (Object) null));
        return irExpressionIrCall;
    }

    private final IrExpression irSourceInformationMarkerStart(IrElement element, Scope.BlockScope scope, IrExpression key) {
        IrExpression irExpressionIrCall = irCall((IrFunction) getSourceInformationMarkerStartFunction(), element.getStartOffset(), element.getEndOffset());
        irExpressionIrCall.putValueArgument(0, irCurrentComposer$default(this, scope, 0, 0, 3, (Object) null));
        irExpressionIrCall.putValueArgument(1, key);
        recordSourceParameter(irExpressionIrCall, 2, scope);
        return irExpressionIrCall;
    }

    public static /* synthetic */ IrExpression irSourceInformationMarkerStart$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, IrElement irElement, Scope.BlockScope blockScope, IrExpression irExpression, int i, Object obj) {
        if ((i & 4) != 0) {
            irExpression = (IrExpression) composableFunctionBodyTransformer.irSourceKey(irElement);
        }
        return composableFunctionBodyTransformer.irSourceInformationMarkerStart(irElement, blockScope, irExpression);
    }

    private final IrConst<Integer> irSourceKey(IrElement irElement) {
        return IrConstImpl.Companion.int(-1, -1, getContext().getIrBuiltIns().getIntType(), sourceKey(irElement));
    }

    private final IrExpression irStartDefaults(IrElement element) {
        return irMethodCall(irCurrentComposer$default(this, 0, 0, (IrValueParameter) null, 7, (Object) null), (IrFunction) getStartDefaultsFunction(), element.getStartOffset(), element.getEndOffset());
    }

    private final IrExpression irStartMovableGroup(IrElement element, IrExpression joinedData, Scope.BlockScope scope) {
        IrCall irCallIrMethodCall = irMethodCall(irCurrentComposer$default(this, scope, 0, 0, 3, (Object) null), (IrFunction) getStartMovableFunction(), element.getStartOffset(), element.getEndOffset());
        irCallIrMethodCall.putValueArgument(0, irSourceKey(element));
        irCallIrMethodCall.putValueArgument(1, joinedData);
        return irWithSourceInformation((IrExpression) irCallIrMethodCall, scope);
    }

    private final IrExpression irStartReplaceableGroup(IrElement element, Scope.BlockScope scope, IrExpression key, int startOffset, int endOffset) {
        IrCall irCallIrMethodCall = irMethodCall(irCurrentComposer(scope, startOffset, endOffset), (IrFunction) getStartReplaceableFunction(), startOffset, endOffset);
        irCallIrMethodCall.putValueArgument(0, key);
        return irWithSourceInformation((IrExpression) irCallIrMethodCall, scope);
    }

    public static /* synthetic */ IrExpression irStartReplaceableGroup$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, IrElement irElement, Scope.BlockScope blockScope, IrExpression irExpression, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            irExpression = (IrExpression) composableFunctionBodyTransformer.irSourceKey(irElement);
        }
        return composableFunctionBodyTransformer.irStartReplaceableGroup(irElement, blockScope, irExpression, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? -1 : i2);
    }

    private final IrExpression irStartRestartGroup(IrElement element, Scope.BlockScope scope, IrExpression key) {
        IrValueDeclaration irValueDeclaration = (IrValueDeclaration) nearestComposer();
        IrCall irCallIrMethodCall = irMethodCall(irCurrentComposer$default(this, scope, 0, 0, 3, (Object) null), (IrFunction) getStartRestartGroupFunction(), element.getStartOffset(), element.getEndOffset());
        irCallIrMethodCall.putValueArgument(0, key);
        Unit unit = Unit.INSTANCE;
        return irWithSourceInformation(irSet(irValueDeclaration, (IrExpression) irCallIrMethodCall), scope);
    }

    public static /* synthetic */ IrExpression irStartRestartGroup$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, IrElement irElement, Scope.BlockScope blockScope, IrExpression irExpression, int i, Object obj) {
        if ((i & 4) != 0) {
            irExpression = (IrExpression) composableFunctionBodyTransformer.irSourceKey(irElement);
        }
        return composableFunctionBodyTransformer.irStartRestartGroup(irElement, blockScope, irExpression);
    }

    public static /* synthetic */ IrVariableImpl irTemporary$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, IrExpression irExpression, String str, IrType irType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            irType = irExpression.getType();
        }
        return composableFunctionBodyTransformer.irTemporary(irExpression, str2, irType, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrExpression irTraceEventEnd() {
        IrFunction traceEventEndFunction = getTraceEventEndFunction();
        if (traceEventEndFunction != null) {
            return irIfTraceInProgress((IrExpression) irCall$default(this, traceEventEndFunction, 0, 0, 6, null));
        }
        return null;
    }

    private final IrExpression irTraceEventStart(IrExpression key, Scope.FunctionScope scope) {
        IrExpression irExpressionIrGet;
        IrExpression irExpressionIrGet2;
        IrValueDeclaration irValueDeclaration;
        IrValueDeclaration irValueDeclaration2;
        IrSimpleFunction traceEventStartFunction = getTraceEventStartFunction();
        List<IrValueDeclaration> declarations = null;
        if (traceEventStartFunction == null) {
            return null;
        }
        IrDeclaration function = scope.getFunction();
        IrBody body = function.getBody();
        Intrinsics.checkNotNull(body);
        int startOffset = body.getStartOffset();
        IrBody body2 = function.getBody();
        Intrinsics.checkNotNull(body2);
        int endOffset = body2.getEndOffset();
        FqName kotlinFqName = AdditionalIrUtilsKt.getKotlinFqName((IrDeclarationParent) function);
        IrDeclaration irDeclaration = function;
        String str = kotlinFqName + " (" + IrDeclarationsKt.getName(IrUtilsKt.getFile(irDeclaration)) + CertificateUtil.DELIMITER + IrUtilsKt.getFile(irDeclaration).getFileEntry().getLineNumber(startOffset) + ")";
        IrChangedBitMaskValue dirty = scope.getDirty();
        IrChangedBitMaskValue changedParameter = scope.getChangedParameter();
        if (dirty != null && dirty.getUsed()) {
            declarations = dirty.getDeclarations();
        } else if (changedParameter != null) {
            declarations = changedParameter.getDeclarations();
        }
        if (declarations == null || (irValueDeclaration2 = (IrValueDeclaration) CollectionsKt.getOrNull(declarations, 0)) == null || (irExpressionIrGet = irGet(irValueDeclaration2)) == null) {
            irExpressionIrGet = (IrExpression) irConst(-1);
        }
        if (declarations == null || (irValueDeclaration = (IrValueDeclaration) CollectionsKt.getOrNull(declarations, 1)) == null || (irExpressionIrGet2 = irGet(irValueDeclaration)) == null) {
            irExpressionIrGet2 = (IrExpression) irConst(-1);
        }
        IrCall irCall = irCall((IrFunction) traceEventStartFunction, startOffset, endOffset);
        irCall.putValueArgument(0, key);
        irCall.putValueArgument(1, irExpressionIrGet);
        irCall.putValueArgument(2, irExpressionIrGet2);
        irCall.putValueArgument(3, irConst(str));
        return irIfTraceInProgress((IrExpression) irCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrExpression irTypeParameterStability(IrTypeParameter param) {
        for (Scope parent = this.currentScope; parent != null; parent = parent.getParent()) {
            if (!(parent instanceof Scope.FunctionScope)) {
                if (parent instanceof Scope.RootScope ? true : parent instanceof Scope.FileScope ? true : parent instanceof Scope.ClassScope) {
                    break;
                }
            } else {
                Scope.FunctionScope functionScope = (Scope.FunctionScope) parent;
                if (functionScope.getIsComposable()) {
                    IrFunction function = functionScope.getFunction();
                    IrChangedBitMaskValue dirty = functionScope.getDirty();
                    if (dirty == null) {
                        dirty = functionScope.getChangedParameter();
                    }
                    if (dirty != null && (true ^ function.getTypeParameters().isEmpty())) {
                        for (IrValueParameter irValueParameter : function.getValueParameters()) {
                            if (Intrinsics.areEqual(IrTypesKt.getClassifierOrNull(irValueParameter.getType()), param.getSymbol())) {
                                int iIndexOf = functionScope.getAllTrackedParams().indexOf(irValueParameter);
                                if (iIndexOf == -1) {
                                    return null;
                                }
                                return irAnd((IrExpression) irConst(StabilityBits.UNSTABLE.bitsForSlot(0)), dirty.irShiftBits(iIndexOf, 0));
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final IrExpression irWithSourceInformation(IrExpression startGroup, Scope.BlockScope scope) {
        return getHasSourceInformation(scope) ? AbstractComposeLowering.irBlock$default(this, null, null, CollectionsKt.listOf((Object[]) new IrExpression[]{startGroup, irSourceInformation(scope)}), 3, null) : startGroup;
    }

    private final boolean isInComposableScope() {
        return this.currentScope.isInComposable();
    }

    private final IrProperty isSkippingFunction() {
        return (IrProperty) this.isSkippingFunction.value($$delegatedProperties[21].getName());
    }

    private final IrSimpleFunction isTraceInProgressFunction() {
        return (IrSimpleFunction) this.isTraceInProgressFunction.value($$delegatedProperties[16].getName());
    }

    private final boolean mightUseDefaultGroup(boolean isSkippableDeclaration, Scope.FunctionScope scope, IrDefaultBitMaskValue defaultParam) {
        IrExpression expression;
        if (!isSkippableDeclaration || defaultParam == null) {
            return false;
        }
        List<IrValueParameter> allTrackedParams = scope.getAllTrackedParams();
        if ((allTrackedParams instanceof Collection) && allTrackedParams.isEmpty()) {
            return false;
        }
        Iterator<T> it = allTrackedParams.iterator();
        while (it.hasNext()) {
            IrExpressionBody defaultValue = ((IrValueParameter) it.next()).getDefaultValue();
            if ((defaultValue == null || (expression = defaultValue.getExpression()) == null || isStatic(expression)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private final boolean mightUseVarArgsGroup(boolean isSkippableDeclaration, Scope.FunctionScope scope) {
        boolean z;
        if (!isSkippableDeclaration) {
            return false;
        }
        List<IrValueParameter> allTrackedParams = scope.getAllTrackedParams();
        if ((allTrackedParams instanceof Collection) && allTrackedParams.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = allTrackedParams.iterator();
            while (it.hasNext()) {
                if (AdditionalIrUtilsKt.isVararg((IrValueParameter) it.next())) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    private final IrContainerExpression mutableStatementContainer() {
        return ComposableFunctionBodyTransformerKt.mutableStatementContainer(getContext());
    }

    private final IrValueParameter nearestComposer() {
        return this.currentScope.getMyComposer();
    }

    private final ParamMeta paramMetaOf(IrExpression arg, boolean isProvided) {
        ParamMeta paramMeta = new ParamMeta(null, false, isProvided, false, false, 0, null, 123, null);
        populateParamMeta(arg, paramMeta);
        return paramMeta;
    }

    private final void populateParamMeta(IrExpression arg, ParamMeta meta) {
        meta.setStability(StabilityKt.stabilityOf(arg));
        if (isStatic(arg)) {
            meta.setStatic(true);
            return;
        }
        if (!(arg instanceof IrGetValue)) {
            if (arg instanceof IrVararg) {
                meta.setStability(StabilityKt.stabilityOf(((IrVararg) arg).getVarargElementType()));
                return;
            }
            return;
        }
        IrVariable owner = ((IrGetValue) arg).getSymbol().getOwner();
        if (owner instanceof IrValueParameter) {
            extractParamMetaFromScopes(meta, owner);
            return;
        }
        if (owner instanceof IrVariable) {
            IrVariable irVariable = owner;
            if (irVariable.isConst()) {
                meta.setStatic(true);
            } else {
                if (irVariable.isVar() || irVariable.getInitializer() == null) {
                    return;
                }
                IrExpression initializer = irVariable.getInitializer();
                Intrinsics.checkNotNull(initializer);
                populateParamMeta(initializer, meta);
            }
        }
    }

    private final String printScopeStack() {
        StringBuilder sb = new StringBuilder();
        for (Scope parent = this.currentScope; parent != null; parent = parent.getParent()) {
            sb.append(parent.getName());
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final void recordCallInSource(IrElement call) {
        Scope.SourceLocation sourceLocationRecordSourceLocation = null;
        for (Scope parent = this.currentScope; parent != null; parent = parent.getParent()) {
            if (parent instanceof Scope.FunctionScope) {
                sourceLocationRecordSourceLocation = ((Scope.FunctionScope) parent).recordSourceLocation(call, sourceLocationRecordSourceLocation);
            } else if (parent instanceof Scope.BlockScope) {
                sourceLocationRecordSourceLocation = ((Scope.BlockScope) parent).recordSourceLocation(call, sourceLocationRecordSourceLocation);
            } else if (parent instanceof Scope.ClassScope) {
                return;
            }
        }
    }

    private final void recordSourceParameter(IrCall call, int index, Scope.BlockScope scope) {
        this.sourceFixups.add(new SourceInfoFixup(call, index, scope));
    }

    private final boolean shouldBeRestartable(IrFunction irFunction) {
        if (irFunction.getBody() == null || !(irFunction instanceof IrSimpleFunction)) {
            return false;
        }
        IrDeclaration irDeclaration = (IrDeclaration) irFunction;
        if (AdditionalIrUtilsKt.isLocal(irDeclaration)) {
            IrClass parentClassOrNull = IrUtilsKt.getParentClassOrNull(irDeclaration);
            if (!Intrinsics.areEqual(parentClassOrNull != null ? parentClassOrNull.getOrigin() : null, JvmLoweredDeclarationOrigin.LAMBDA_IMPL.INSTANCE)) {
                return false;
            }
        }
        if (irFunction.isInline() || getHasNonRestartableAnnotation(irFunction) || getHasExplicitGroups(irFunction) || this.inlineLambdaInfo.isInlineLambda(irFunction) || !IrTypePredicatesKt.isUnit(irFunction.getReturnType()) || isComposableDelegatedAccessor(irFunction) || AbstractComposeLoweringKt.composerParam(irFunction) == null) {
            return false;
        }
        return !Intrinsics.areEqual(irFunction.getOrigin(), IrDeclarationOrigin.LOCAL_FUNCTION_FOR_LAMBDA.INSTANCE);
    }

    private final int sourceKey(IrElement irElement) {
        int iHashCode = (AdditionalIrUtilsKt.getKotlinFqName(getCurrentFunctionScope().getFunction()).asString().hashCode() * 31) + irElement.getStartOffset();
        if (!(irElement instanceof IrConst)) {
            return iHashCode;
        }
        int i = iHashCode * 31;
        Object value = ((IrConst) irElement).getValue();
        return i + (value != null ? value.hashCode() : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PrimitiveType toPrimitiveType(IrType irType) {
        if (IrTypePredicatesKt.isInt(irType)) {
            return PrimitiveType.INT;
        }
        if (IrTypePredicatesKt.isBoolean(irType)) {
            return PrimitiveType.BOOLEAN;
        }
        if (IrTypePredicatesKt.isFloat(irType)) {
            return PrimitiveType.FLOAT;
        }
        if (IrTypePredicatesKt.isLong(irType)) {
            return PrimitiveType.LONG;
        }
        if (IrTypePredicatesKt.isDouble(irType)) {
            return PrimitiveType.DOUBLE;
        }
        if (IrTypePredicatesKt.isByte(irType)) {
            return PrimitiveType.BYTE;
        }
        if (IrTypePredicatesKt.isChar(irType)) {
            return PrimitiveType.CHAR;
        }
        if (IrTypePredicatesKt.isShort(irType)) {
            return PrimitiveType.SHORT;
        }
        return null;
    }

    private final Scope.ParametersScope transformDefaults(Scope.FunctionScope scope) {
        List<IrValueParameter> allTrackedParams = scope.getAllTrackedParams();
        Scope.ParametersScope parametersScope = new Scope.ParametersScope();
        Iterator<T> it = allTrackedParams.iterator();
        while (it.hasNext()) {
            IrExpressionBody defaultValue = ((IrValueParameter) it.next()).getDefaultValue();
            if (defaultValue != null) {
                Scope scope2 = this.currentScope;
                this.currentScope = parametersScope;
                parametersScope.setParent(scope2);
                parametersScope.setLevel(scope2.getLevel() + 1);
                try {
                    IrExpression irExpressionTransform = defaultValue.getExpression().transform((IrElementTransformer) this, (Object) null);
                    this.currentScope = scope2;
                    defaultValue.setExpression(irExpressionTransform);
                } catch (Throwable th) {
                    this.currentScope = scope2;
                    throw th;
                }
            }
        }
        return parametersScope;
    }

    private final <T extends Scope> Pair<T, IrExpression> transformWithScope(IrExpression irExpression, T t) {
        Scope scope = this.currentScope;
        try {
            this.currentScope = t;
            t.setParent(scope);
            t.setLevel(scope.getLevel() + 1);
            return TuplesKt.to(t, irExpression.transform((IrElementTransformer) this, (Object) null));
        } finally {
            this.currentScope = scope;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final IrBlockImpl variablePrefix(IrExpression irExpression, IrVariable irVariable) {
        return new IrBlockImpl(irExpression.getStartOffset(), irExpression.getEndOffset(), irExpression.getType(), (IrStatementOrigin) null, CollectionsKt.listOf((Object[]) new IrElement[]{irVariable, irExpression}));
    }

    private final IrExpression visitComposableCall(IrCall expression) {
        FqName kotlinFqName = AdditionalIrUtilsKt.getKotlinFqName(expression.getSymbol().getOwner());
        ComposeFqNames composeFqNames = ComposeFqNames.INSTANCE;
        if (Intrinsics.areEqual(kotlinFqName, composeFqNames.getRemember())) {
            return this.intrinsicRememberEnabled ? visitRememberCall(expression) : visitNormalComposableCall(expression);
        }
        if (Intrinsics.areEqual(kotlinFqName, composeFqNames.getKey())) {
            return visitKeyCall(expression);
        }
        return Intrinsics.areEqual(kotlinFqName, DecoyFqNames.INSTANCE.getKey()) ? visitKeyCall(expression) : visitNormalComposableCall(expression);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    private final IrStatement visitComposableLambda(IrFunction declaration, final Scope.FunctionScope scope, IrChangedBitMaskValue changedParam) {
        boolean z;
        IrChangedBitMaskValue irChangedBitMaskValueIrCopyToTemporary;
        IrContainerExpression irContainerExpression;
        IrChangedBitMaskValue irChangedBitMaskValue;
        IrFunction irFunction;
        boolean z2;
        final IrBody body = declaration.getBody();
        Intrinsics.checkNotNull(body);
        IrContainerExpression irContainerExpressionMutableStatementContainer = mutableStatementContainer();
        IrContainerExpression irContainerExpressionMutableStatementContainer2 = mutableStatementContainer();
        IrContainerExpression irContainerExpressionMutableStatementContainer3 = mutableStatementContainer();
        IrContainerExpression irContainerExpressionMutableStatementContainer4 = mutableStatementContainer();
        boolean zIsInlinedLambda = scope.isInlinedLambda();
        if (this.collectSourceInformation) {
            if (zIsInlinedLambda) {
                IrElement irElement = (IrElement) body;
                irContainerExpressionMutableStatementContainer.getStatements().add(irSourceInformationMarkerStart$default(this, irElement, scope, null, 4, null));
                irContainerExpressionMutableStatementContainer4.getStatements().add(irSourceInformationMarkerEnd(irElement, scope));
            } else {
                irContainerExpressionMutableStatementContainer.getStatements().add(irSourceInformation(scope));
            }
        }
        if (!IrTypePredicatesKt.isUnit(declaration.getReturnType()) || zIsInlinedLambda) {
            z = false;
        } else {
            List<IrValueParameter> allTrackedParams = scope.getAllTrackedParams();
            if (!(allTrackedParams instanceof Collection) || !allTrackedParams.isEmpty()) {
                Iterator<T> it = allTrackedParams.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = true;
                        break;
                    }
                    if (StabilityKt.knownUnstable(StabilityKt.stabilityOf(((IrValueParameter) it.next()).getType()))) {
                        z2 = false;
                        break;
                    }
                }
            } else {
                z2 = true;
                break;
            }
            if (z2) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z && (!scope.getAllTrackedParams().isEmpty())) {
            irChangedBitMaskValueIrCopyToTemporary = changedParam.irCopyToTemporary("$dirty", (JvmPlatformKt.isJvm(getContext().getPlatform()) || JsPlatformKt.isJs(getContext().getPlatform())) ? false : true, true);
        } else {
            irChangedBitMaskValueIrCopyToTemporary = changedParam;
        }
        scope.setDirty(irChangedBitMaskValueIrCopyToTemporary);
        Pair<IrContainerExpression, IrVariable> pairAsBodyAndResultVar = asBodyAndResultVar(body, declaration);
        IrContainerExpression irContainerExpressionComponent1 = pairAsBodyAndResultVar.component1();
        IrVariable irVariableComponent2 = pairAsBodyAndResultVar.component2();
        boolean z3 = getTraceEventMarkersEnabled() && !scope.isInlinedLambda();
        scope.updateIntrinsiceRememberSafety((mightUseDefaultGroup(z, scope, null) || mightUseVarArgsGroup(z, scope)) ? false : true);
        transformChildrenVoid((IrElement) irContainerExpressionComponent1);
        IrChangedBitMaskValue irChangedBitMaskValue2 = irChangedBitMaskValueIrCopyToTemporary;
        boolean zBuildPreambleStatementsAndReturnIfSkippingPossible = buildPreambleStatementsAndReturnIfSkippingPossible((IrElement) body, (IrStatementContainer) irContainerExpressionMutableStatementContainer2, (IrStatementContainer) irContainerExpressionMutableStatementContainer3, z, scope, irChangedBitMaskValueIrCopyToTemporary, changedParam, null, new Scope.ParametersScope());
        if (z3) {
            irContainerExpression = irContainerExpressionComponent1;
            wrapWithTraceEvents(irContainerExpression, (IrExpression) irFunctionSourceKey(), scope);
        } else {
            irContainerExpression = irContainerExpressionComponent1;
        }
        if (irChangedBitMaskValue2.getUsed()) {
            irChangedBitMaskValue = irChangedBitMaskValue2;
            if (irChangedBitMaskValue instanceof IrChangedBitMaskVariable) {
                irContainerExpressionMutableStatementContainer2.getStatements().addAll(0, ((IrChangedBitMaskVariable) irChangedBitMaskValue).asStatements());
            } else {
                irChangedBitMaskValue = changedParam;
            }
        } else {
            irChangedBitMaskValue = changedParam;
        }
        if (z3) {
            scope.realizeEndCalls(new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.visitComposableLambda.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrExpression invoke() {
                    IrExpression irExpressionIrTraceEventEnd = ComposableFunctionBodyTransformer.this.irTraceEventEnd();
                    Intrinsics.checkNotNull(irExpressionIrTraceEventEnd);
                    return irExpressionIrTraceEventEnd;
                }
            });
        }
        if (this.collectSourceInformation && zIsInlinedLambda) {
            scope.realizeEndCalls(new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.visitComposableLambda.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrExpression invoke() {
                    return ComposableFunctionBodyTransformer.this.irSourceInformationMarkerEnd(body, scope);
                }
            });
        }
        if (zBuildPreambleStatementsAndReturnIfSkippingPossible) {
            IrIfThenElseImpl irIfThenElseImplIrIfThenElse$default = AbstractComposeLowering.irIfThenElse$default(this, null, irOrOr(irChangedBitMaskValue.irHasDifferences(scope.getUsedParams()), irNot((IrExpression) irIsSkipping())), AbstractComposeLowering.irBlock$default(this, getContext().getIrBuiltIns().getUnitType(), null, irContainerExpression.getStatements(), 2, null), irSkipToGroupEnd(body.getEndOffset(), body.getEndOffset()), body.getStartOffset(), body.getEndOffset(), 1, null);
            scope.realizeCoalescableGroup();
            int startOffset = body.getStartOffset();
            int endOffset = body.getEndOffset();
            SpreadBuilder spreadBuilder = new SpreadBuilder(6);
            spreadBuilder.addSpread(irContainerExpressionMutableStatementContainer.getStatements().toArray(new IrStatement[0]));
            spreadBuilder.addSpread(scope.getMarkerPreamble().getStatements().toArray(new IrStatement[0]));
            spreadBuilder.addSpread(irContainerExpressionMutableStatementContainer2.getStatements().toArray(new IrStatement[0]));
            spreadBuilder.addSpread(irContainerExpressionMutableStatementContainer3.getStatements().toArray(new IrStatement[0]));
            spreadBuilder.add(irIfThenElseImplIrIfThenElse$default);
            spreadBuilder.add(irVariableComponent2 != null ? irReturnVar((IrReturnTargetSymbol) declaration.getSymbol(), irVariableComponent2) : null);
            IrBody irBlockBodyImpl = new IrBlockBodyImpl(startOffset, endOffset, CollectionsKt.listOfNotNull(spreadBuilder.toArray(new IrStatement[spreadBuilder.size()])));
            irFunction = declaration;
            irFunction.setBody(irBlockBodyImpl);
        } else {
            irFunction = declaration;
            scope.realizeCoalescableGroup();
            int startOffset2 = body.getStartOffset();
            int endOffset2 = body.getEndOffset();
            SpreadBuilder spreadBuilder2 = new SpreadBuilder(7);
            spreadBuilder2.addSpread(scope.getMarkerPreamble().getStatements().toArray(new IrStatement[0]));
            spreadBuilder2.addSpread(irContainerExpressionMutableStatementContainer.getStatements().toArray(new IrStatement[0]));
            spreadBuilder2.addSpread(irContainerExpressionMutableStatementContainer2.getStatements().toArray(new IrStatement[0]));
            spreadBuilder2.addSpread(irContainerExpressionMutableStatementContainer3.getStatements().toArray(new IrStatement[0]));
            spreadBuilder2.add(irContainerExpression);
            spreadBuilder2.addSpread(irContainerExpressionMutableStatementContainer4.getStatements().toArray(new IrStatement[0]));
            spreadBuilder2.add(irVariableComponent2 != null ? irReturnVar((IrReturnTargetSymbol) declaration.getSymbol(), irVariableComponent2) : null);
            irFunction.setBody(new IrBlockBodyImpl(startOffset2, endOffset2, CollectionsKt.listOfNotNull(spreadBuilder2.toArray(new IrStatement[spreadBuilder2.size()]))));
        }
        scope.getMetrics().recordFunction(true, true, zBuildPreambleStatementsAndReturnIfSkippingPossible, true, false, false, false);
        scope.getMetrics().recordGroup();
        return (IrStatement) irFunction;
    }

    private final IrStatement visitFunctionInScope(IrFunction declaration) {
        Scope.FunctionScope currentFunctionScope = getCurrentFunctionScope();
        if (!currentFunctionScope.getIsComposable()) {
            return super.visitFunction(declaration);
        }
        boolean zShouldBeRestartable = shouldBeRestartable(declaration);
        boolean zIsLambda = ComposableFunctionBodyTransformerKt.isLambda(declaration);
        boolean zIsUnit = IrTypePredicatesKt.isUnit(declaration.getReturnType());
        if (declaration.getBody() == null) {
            return (IrStatement) declaration;
        }
        IrChangedBitMaskValue changedParameter = currentFunctionScope.getChangedParameter();
        Intrinsics.checkNotNull(changedParameter);
        IrDefaultBitMaskValue defaultParameter = currentFunctionScope.getDefaultParameter();
        if (zIsLambda && zIsUnit) {
            return visitComposableLambda(declaration, currentFunctionScope, changedParameter);
        }
        return (zShouldBeRestartable && zIsUnit) ? visitRestartableComposableFunction(declaration, currentFunctionScope, changedParameter, defaultParameter) : visitNonRestartableComposableFunction(declaration, currentFunctionScope, changedParameter, defaultParameter);
    }

    private final IrExpression visitKeyCall(IrCall expression) {
        encounteredComposableCall(true, false);
        ArrayList arrayList = new ArrayList();
        int valueArgumentsCount = expression.getValueArgumentsCount();
        IrVararg irVararg = null;
        for (int i = 0; i < valueArgumentsCount; i++) {
            IrValueParameter irValueParameter = (IrValueParameter) expression.getSymbol().getOwner().getValueParameters().get(i);
            IrVararg valueArgument = expression.getValueArgument(i);
            if (valueArgument == null) {
                throw new IllegalStateException("Unexpected null argument found on key call".toString());
            }
            if (StringsKt__StringsKt.startsWith$default(irValueParameter.getName().asString(), Typography.dollar, false, 2, (Object) null)) {
                break;
            }
            if (Intrinsics.areEqual(irValueParameter.getName().getIdentifier(), ReportItem.LogTypeBlock)) {
                irVararg = valueArgument;
            } else if (valueArgument instanceof IrVararg) {
                List<IrExpression> elements = valueArgument.getElements();
                ArrayList arrayList2 = new ArrayList();
                for (IrExpression irExpression : elements) {
                    IrExpression irExpression2 = irExpression instanceof IrExpression ? irExpression : null;
                    if (irExpression2 != null) {
                        arrayList2.add(irExpression2);
                    }
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(valueArgument);
            }
        }
        IrContainerExpression irContainerExpressionMutableStatementContainer = mutableStatementContainer();
        IrContainerExpression irContainerExpressionMutableStatementContainer2 = mutableStatementContainer();
        if (!(irVararg instanceof IrFunctionExpression)) {
            throw new IllegalStateException(("Expected function expression but was " + (irVararg != null ? Reflection.getOrCreateKotlinClass(irVararg.getClass()) : null)).toString());
        }
        IrBody body = ((IrFunctionExpression) irVararg).getFunction().getBody();
        Intrinsics.checkNotNull(body);
        Pair pairAsBodyAndResultVar$default = asBodyAndResultVar$default(this, body, null, 1, null);
        IrExpression irExpression3 = (IrContainerExpression) pairAsBodyAndResultVar$default.component1();
        IrValueDeclaration irValueDeclaration = (IrVariable) pairAsBodyAndResultVar$default.component2();
        Scope.BlockScope branchScope = new Scope.BranchScope();
        Scope scope = this.currentScope;
        this.currentScope = branchScope;
        branchScope.setParent(scope);
        branchScope.setLevel(scope.getLevel() + 1);
        try {
            irExpression3.transform((IrElementTransformer) this, (Object) null);
            this.currentScope = scope;
            IrElementTransformerVoidKt.transformChildrenVoid((IrElement) irExpression3, new IrElementTransformerVoid() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.visitKeyCall.3
                @NotNull
                public IrStatement visitFunction(@NotNull IrFunction declaration) {
                    return ComposableFunctionBodyTransformer.this.inlineLambdaInfo.isInlineLambda(declaration) ? super.visitFunction(declaration) : (IrStatement) declaration;
                }

                @NotNull
                public IrExpression visitGetValue(@NotNull IrGetValue expression2) {
                    super.visitGetValue(expression2);
                    IrValueDeclaration owner = expression2.getSymbol().getOwner();
                    return ((owner instanceof IrValueParameter) && Intrinsics.areEqual(owner.getName(), KtxNameConventions.INSTANCE.getCOMPOSER_PARAMETER())) ? ComposableFunctionBodyTransformer.irCurrentComposer$default(ComposableFunctionBodyTransformer.this, 0, 0, (IrValueParameter) null, 7, (Object) null) : (IrExpression) expression2;
                }
            });
            IrType type = expression.getType();
            IrExpression[] irExpressionArr = new IrExpression[6];
            irExpressionArr[0] = irContainerExpressionMutableStatementContainer;
            IrElement irElement = (IrElement) expression;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((IrExpression) it.next()).transform((IrElementTransformer) this, (Object) null));
            }
            irExpressionArr[1] = irStartMovableGroup(irElement, irJoinKeyChain(arrayList3), branchScope);
            irExpressionArr[2] = irExpression3;
            irExpressionArr[3] = irEndMovableGroup(branchScope);
            irExpressionArr[4] = irContainerExpressionMutableStatementContainer2;
            irExpressionArr[5] = irValueDeclaration != null ? irGet(irValueDeclaration) : null;
            return AbstractComposeLowering.irBlock$default(this, type, null, CollectionsKt.listOfNotNull((Object[]) irExpressionArr), 2, null);
        } catch (Throwable th) {
            this.currentScope = scope;
            throw th;
        }
    }

    private final IrStatement visitNonRestartableComposableFunction(IrFunction declaration, final Scope.FunctionScope scope, IrChangedBitMaskValue changedParam, IrDefaultBitMaskValue defaultParam) {
        IrContainerExpression irContainerExpression;
        SpreadBuilder spreadBuilder;
        boolean z;
        int i;
        IrExpression irExpressionIrSourceInformationMarkerStart;
        IrExpression irExpressionIrSourceInformationMarkerEnd;
        final IrElement body = declaration.getBody();
        Intrinsics.checkNotNull(body);
        boolean hasExplicitGroups = getHasExplicitGroups(declaration);
        boolean z2 = hasExplicitGroups || getHasReadOnlyAnnotation(declaration) || isComposableDelegatedAccessor(declaration);
        IrContainerExpression irContainerExpressionMutableStatementContainer = mutableStatementContainer();
        IrContainerExpression irContainerExpressionMutableStatementContainer2 = mutableStatementContainer();
        scope.setDirty(changedParam);
        Scope.ParametersScope parametersScopeTransformDefaults = transformDefaults(scope);
        Pair pairAsBodyAndResultVar$default = asBodyAndResultVar$default(this, body, null, 1, null);
        IrContainerExpression irContainerExpression2 = (IrContainerExpression) pairAsBodyAndResultVar$default.component1();
        IrVariable irVariable = (IrVariable) pairAsBodyAndResultVar$default.component2();
        boolean z3 = getTraceEventMarkersEnabled() && !scope.getFunction().isInline();
        scope.updateIntrinsiceRememberSafety((mightUseDefaultGroup(false, scope, defaultParam) || mightUseVarArgsGroup(false, scope)) ? false : true);
        transformChildrenVoid((IrElement) irContainerExpression2);
        final boolean z4 = z3;
        buildPreambleStatementsAndReturnIfSkippingPossible(body, (IrStatementContainer) irContainerExpressionMutableStatementContainer, (IrStatementContainer) irContainerExpressionMutableStatementContainer2, false, scope, changedParam, changedParam, defaultParam, parametersScopeTransformDefaults);
        if (z4) {
            irContainerExpression = irContainerExpression2;
            wrapWithTraceEvents(irContainerExpression, (IrExpression) irFunctionSourceKey(), scope);
        } else {
            irContainerExpression = irContainerExpression2;
        }
        if (!z2) {
            scope.realizeGroup(new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.visitNonRestartableComposableFunction.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrExpression invoke() {
                    ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
                    IrExpression[] irExpressionArr = new IrExpression[2];
                    irExpressionArr[0] = z4 ? composableFunctionBodyTransformer.irTraceEventEnd() : null;
                    irExpressionArr[1] = ComposableFunctionBodyTransformer.irEndReplaceableGroup$default(ComposableFunctionBodyTransformer.this, 0, 0, scope, 3, null);
                    return AbstractComposeLowering.irComposite$default(composableFunctionBodyTransformer, null, null, CollectionsKt.listOfNotNull((Object[]) irExpressionArr), 3, null);
                }
            });
        }
        int startOffset = body.getStartOffset();
        int endOffset = body.getEndOffset();
        SpreadBuilder spreadBuilder2 = new SpreadBuilder(6);
        if (z2) {
            spreadBuilder = spreadBuilder2;
            z = z4;
            i = endOffset;
            irExpressionIrSourceInformationMarkerStart = (!this.collectSourceInformation || hasExplicitGroups) ? null : irSourceInformationMarkerStart(body, scope, (IrExpression) irFunctionSourceKey());
        } else {
            spreadBuilder = spreadBuilder2;
            z = z4;
            i = endOffset;
            irExpressionIrSourceInformationMarkerStart = irStartReplaceableGroup$default(this, body, scope, irFunctionSourceKey(), 0, 0, 24, null);
        }
        SpreadBuilder spreadBuilder3 = spreadBuilder;
        spreadBuilder3.add(irExpressionIrSourceInformationMarkerStart);
        spreadBuilder3.addSpread(scope.getMarkerPreamble().getStatements().toArray(new IrStatement[0]));
        spreadBuilder3.addSpread(irContainerExpressionMutableStatementContainer2.getStatements().toArray(new IrStatement[0]));
        spreadBuilder3.addSpread(irContainerExpression.getStatements().toArray(new IrStatement[0]));
        if (z2) {
            irExpressionIrSourceInformationMarkerEnd = (!this.collectSourceInformation || hasExplicitGroups) ? null : irSourceInformationMarkerEnd(body, scope);
        } else {
            irExpressionIrSourceInformationMarkerEnd = irEndReplaceableGroup$default(this, 0, 0, scope, 3, null);
        }
        spreadBuilder3.add(irExpressionIrSourceInformationMarkerEnd);
        spreadBuilder3.add(irVariable != null ? irReturnVar((IrReturnTargetSymbol) declaration.getSymbol(), irVariable) : null);
        declaration.setBody(new IrBlockBodyImpl(startOffset, i, CollectionsKt.listOfNotNull(spreadBuilder3.toArray(new IrStatement[spreadBuilder3.size()]))));
        if (z2 && !hasExplicitGroups) {
            final boolean z5 = z;
            scope.realizeEndCalls(new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.visitNonRestartableComposableFunction.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrExpression invoke() {
                    ComposableFunctionBodyTransformer composableFunctionBodyTransformer = ComposableFunctionBodyTransformer.this;
                    IrExpression[] irExpressionArr = new IrExpression[2];
                    irExpressionArr[0] = z5 ? composableFunctionBodyTransformer.irTraceEventEnd() : null;
                    irExpressionArr[1] = ComposableFunctionBodyTransformer.this.collectSourceInformation ? ComposableFunctionBodyTransformer.this.irSourceInformationMarkerEnd(body, scope) : null;
                    return AbstractComposeLowering.irComposite$default(composableFunctionBodyTransformer, null, null, CollectionsKt.listOfNotNull((Object[]) irExpressionArr), 3, null);
                }
            });
        }
        scope.getMetrics().recordFunction(true, false, false, ComposableFunctionBodyTransformerKt.isLambda(declaration), declaration.isInline(), false, z2);
        scope.getMetrics().recordGroup();
        return (IrStatement) declaration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final IrExpression visitNormalComposableCall(IrCall expression) {
        Object[] objArr;
        int iNextIndex;
        int iChangedParamCount;
        int i;
        int i2;
        IrBlockImpl irBlockImplVariablePrefix;
        Scope.CallScope callScope = new Scope.CallScope(expression, this);
        Scope scope = this.currentScope;
        this.currentScope = callScope;
        callScope.setParent(scope);
        callScope.setLevel(scope.getLevel() + 1);
        try {
            transformChildrenVoid((IrElement) expression);
            Unit unit = Unit.INSTANCE;
            this.currentScope = scope;
            encounteredComposableCall(!getHasReadOnlyAnnotation(expression.getSymbol().getOwner()), false);
            IrFunction irFunction = (IrSimpleFunction) expression.getSymbol().getOwner();
            int size = irFunction.getValueParameters().size();
            int contextReceiverParametersCount = irFunction.getContextReceiverParametersCount();
            List valueParameters = irFunction.getValueParameters();
            if (!(valueParameters instanceof Collection) || !valueParameters.isEmpty()) {
                Iterator it = valueParameters.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objArr = false;
                        break;
                    }
                    if (Intrinsics.areEqual(((IrValueParameter) it.next()).getName(), KtxNameConventions.INSTANCE.getDEFAULT_PARAMETER())) {
                        objArr = true;
                        break;
                    }
                }
            } else {
                objArr = false;
                break;
            }
            if (objArr == true || !isInvoke(expression)) {
                List valueParameters2 = irFunction.getValueParameters();
                ListIterator listIterator = valueParameters2.listIterator(valueParameters2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    if (!StringsKt__StringsKt.startsWith$default(((IrValueParameter) listIterator.previous()).getName().asString(), Typography.dollar, false, 2, (Object) null)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                int i3 = iNextIndex != -1 ? (iNextIndex + 1) - contextReceiverParametersCount : 0;
                int iDefaultParamCount = objArr != false ? ComposableFunctionBodyTransformerKt.defaultParamCount(contextReceiverParametersCount + i3) : 0;
                iChangedParamCount = ComposableFunctionBodyTransformerKt.changedParamCount(i3, ComposableFunctionBodyTransformerKt.getThisParamCount(irFunction));
                int i4 = i3;
                i = iDefaultParamCount;
                i2 = i4;
            } else {
                int i5 = size - contextReceiverParametersCount;
                int iChangedParamCountFromTotal = ComposableFunctionBodyTransformerKt.changedParamCountFromTotal(ComposableFunctionBodyTransformerKt.getThisParamCount(irFunction) + i5);
                i2 = (i5 - 1) - iChangedParamCountFromTotal;
                iChangedParamCount = iChangedParamCountFromTotal;
                i = 0;
            }
            int i6 = i2 + contextReceiverParametersCount;
            int i7 = i6 + 1;
            int i8 = iChangedParamCount + i7;
            int i9 = i + i8;
            if ((size == i9) != true) {
                throw new IllegalArgumentException(("Expected " + i9 + " params for " + irFunction.getName() + ", but got " + size).toString());
            }
            IntRange intRangeUntil = RangesKt.until(i8, size);
            ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(intRangeUntil));
            Iterator<Integer> it2 = intRangeUntil.iterator();
            while (it2.hasNext()) {
                arrayList.add(expression.getValueArgument(((IntIterator) it2).nextInt()));
            }
            boolean z = !arrayList.isEmpty();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i10 = 0; i10 < i6; i10++) {
                        IrExpression valueArgument = expression.getValueArgument(i10);
                        if (valueArgument == null) {
                            if (((IrValueParameter) expression.getSymbol().getOwner().getValueParameters().get(i10)).getVarargElementType() == null) {
                                throw new IllegalStateException("Unexpected null argument for composable call".toString());
                            }
                            arrayList4.add(new ParamMeta(null, true, false, false, false, 0, null, 125, null));
                        } else if (i10 < contextReceiverParametersCount) {
                            arrayList3.add(paramMetaOf(valueArgument, true));
                        } else {
                            arrayList4.add(paramMetaOf(valueArgument, ((z ? ((Number) arrayList2.get(ComposableFunctionBodyTransformerKt.defaultsParamIndex(i10))).intValue() : 0) & (1 << ComposableFunctionBodyTransformerKt.defaultsBitIndex(i10))) == 0));
                        }
                    }
                    IrExpression extensionReceiver = expression.getExtensionReceiver();
                    ParamMeta paramMetaParamMetaOf = extensionReceiver != null ? paramMetaOf(extensionReceiver, true) : null;
                    IrExpression dispatchReceiver = expression.getDispatchReceiver();
                    int i11 = 0;
                    for (Object obj : buildChangedParamsForCall(arrayList3, arrayList4, paramMetaParamMetaOf, dispatchReceiver != null ? paramMetaOf(dispatchReceiver, true) : null)) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        expression.putValueArgument(i11 + i7, (IrExpression) obj);
                        i11 = i12;
                    }
                    getCurrentFunctionScope().getMetrics().recordComposableCall(expression, arrayList4);
                    getMetrics().recordComposableCall(expression, arrayList4);
                    recordCallInSource((IrElement) expression);
                    IrVariable marker = callScope.getMarker();
                    return (marker == null || (irBlockImplVariablePrefix = variablePrefix((IrExpression) expression, marker)) == null) ? (IrExpression) expression : (IrExpression) irBlockImplVariablePrefix;
                }
                IrConst irConst = (IrExpression) it3.next();
                if (!(irConst instanceof IrConst)) {
                    throw new IllegalStateException("Expected default mask to be a const".toString());
                }
                Object value = irConst.getValue();
                Integer num = value instanceof Integer ? (Integer) value : null;
                if (num == null) {
                    throw new IllegalStateException("Expected default mask to be an Int".toString());
                }
                arrayList2.add(Integer.valueOf(num.intValue()));
            }
        } catch (Throwable th) {
            this.currentScope = scope;
            throw th;
        }
    }

    private final IrExpression visitRememberCall(IrCall expression) {
        Object next;
        IrExpression irExpression;
        if (!canElideRememberGroup()) {
            return visitNormalComposableCall(expression);
        }
        ArrayList arrayList = new ArrayList();
        int valueArgumentsCount = expression.getValueArgumentsCount();
        boolean z = false;
        IrExpression irExpression2 = null;
        for (int i = 0; i < valueArgumentsCount; i++) {
            IrValueParameter irValueParameter = (IrValueParameter) expression.getSymbol().getOwner().getValueParameters().get(i);
            IrExpression valueArgument = expression.getValueArgument(i);
            if (valueArgument == null) {
                throw new IllegalStateException("Unexpected null argument found on key call".toString());
            }
            if (StringsKt__StringsKt.startsWith$default(irValueParameter.getName().asString(), Typography.dollar, false, 2, (Object) null)) {
                break;
            }
            if (Intrinsics.areEqual(irValueParameter.getName().getIdentifier(), "calculation")) {
                irExpression2 = valueArgument;
            } else if (valueArgument instanceof IrVararg) {
                List<IrExpression> elements = ((IrVararg) valueArgument).getElements();
                ArrayList arrayList2 = new ArrayList();
                for (IrExpression irExpression3 : elements) {
                    if (irExpression3 instanceof IrSpreadElement) {
                        z = true;
                        irExpression = valueArgument;
                    } else {
                        irExpression = irExpression3 instanceof IrExpression ? irExpression3 : null;
                    }
                    if (irExpression != null) {
                        arrayList2.add(irExpression);
                    }
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(valueArgument);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, ((IrExpression) arrayList.get(i2)).transform((IrElementTransformer) this, (Object) null));
        }
        if (irExpression2 == null) {
            encounteredComposableCall(true, false);
            recordCallInSource((IrElement) expression);
            return (IrExpression) expression;
        }
        if (z || !canElideRememberGroup()) {
            encounteredComposableCall(true, false);
            recordCallInSource((IrElement) expression);
            irExpression2.transform((IrElementTransformer) this, (Object) null);
            return (IrExpression) expression;
        }
        encounteredComposableCall(false, true);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(paramMetaOf((IrExpression) it.next(), true));
        }
        buildChangedParamsForCall(CollectionsKt.emptyList(), arrayList3, null, null);
        Function1 composableFunctionBodyTransformer$visitRememberCall$changedTestFunction$1 = getUpdateChangedFlagsFunction() == null ? new ComposableFunctionBodyTransformer$visitRememberCall$changedTestFunction$1(this) : new ComposableFunctionBodyTransformer$visitRememberCall$changedTestFunction$2(this);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object objInvoke = composableFunctionBodyTransformer$visitRememberCall$changedTestFunction$1.invoke(it2.next());
            if (objInvoke != null) {
                arrayList4.add(objInvoke);
            }
        }
        Iterator it3 = arrayList4.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            while (it3.hasNext()) {
                next = (IrExpression) irBooleanOr((IrExpression) next, (IrExpression) it3.next());
            }
        } else {
            next = null;
        }
        IrExpression irExpression4 = (IrExpression) next;
        if (irExpression4 == null) {
            irExpression4 = (IrExpression) irConst(false);
        }
        return irCache(expression.getStartOffset(), expression.getEndOffset(), expression.getType(), irExpression4, irExpression2.transform((IrElementTransformer) this, (Object) null));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    private final IrStatement visitRestartableComposableFunction(IrFunction declaration, final Scope.FunctionScope scope, final IrChangedBitMaskValue changedParam, final IrDefaultBitMaskValue defaultParam) {
        IrContainerExpression irContainerExpression;
        int i;
        IrChangedBitMaskValue irChangedBitMaskValue;
        IrExpression irExpressionIrComposite$default;
        IrBody body = declaration.getBody();
        Intrinsics.checkNotNull(body);
        IrContainerExpression irContainerExpressionMutableStatementContainer = mutableStatementContainer();
        IrContainerExpression irContainerExpressionMutableStatementContainer2 = mutableStatementContainer();
        IrChangedBitMaskValue irChangedBitMaskValueIrCopyToTemporary = !scope.getAllTrackedParams().isEmpty() ? changedParam.irCopyToTemporary("$dirty", (JvmPlatformKt.isJvm(getContext().getPlatform()) || JsPlatformKt.isJs(getContext().getPlatform())) ? false : true, true) : changedParam;
        scope.setDirty(irChangedBitMaskValueIrCopyToTemporary);
        Pair pairAsBodyAndResultVar$default = asBodyAndResultVar$default(this, body, null, 1, null);
        IrContainerExpression irContainerExpression2 = (IrContainerExpression) pairAsBodyAndResultVar$default.component1();
        IrVariable irVariable = (IrVariable) pairAsBodyAndResultVar$default.component2();
        final Function0<IrExpression> function0 = new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$visitRestartableComposableFunction$end$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                ComposableFunctionBodyTransformer composableFunctionBodyTransformer = this.this$0;
                ComposableFunctionBodyTransformer.Scope.FunctionScope functionScope = scope;
                return composableFunctionBodyTransformer.irEndRestartGroupAndUpdateScope(functionScope, changedParam, defaultParam, functionScope.getRealValueParamCount());
            }
        };
        Function0<IrExpression> function1 = new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer$visitRestartableComposableFunction$endWithTraceEventEnd$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                ComposableFunctionBodyTransformer composableFunctionBodyTransformer = this.this$0;
                IrExpression[] irExpressionArr = new IrExpression[2];
                irExpressionArr[0] = composableFunctionBodyTransformer.getTraceEventMarkersEnabled() ? this.this$0.irTraceEventEnd() : null;
                irExpressionArr[1] = function0.invoke();
                return AbstractComposeLowering.irComposite$default(composableFunctionBodyTransformer, null, null, CollectionsKt.listOfNotNull((Object[]) irExpressionArr), 3, null);
            }
        };
        Scope.ParametersScope parametersScopeTransformDefaults = transformDefaults(scope);
        scope.updateIntrinsiceRememberSafety((mightUseDefaultGroup(true, scope, defaultParam) || mightUseVarArgsGroup(true, scope)) ? false : true);
        transformChildrenVoid((IrElement) irContainerExpression2);
        IrChangedBitMaskValue irChangedBitMaskValue2 = irChangedBitMaskValueIrCopyToTemporary;
        int i2 = 1;
        boolean zBuildPreambleStatementsAndReturnIfSkippingPossible = buildPreambleStatementsAndReturnIfSkippingPossible((IrElement) body, (IrStatementContainer) irContainerExpressionMutableStatementContainer, (IrStatementContainer) irContainerExpressionMutableStatementContainer2, true, scope, irChangedBitMaskValueIrCopyToTemporary, changedParam, defaultParam, parametersScopeTransformDefaults);
        if (getTraceEventMarkersEnabled()) {
            irContainerExpression = irContainerExpression2;
            wrapWithTraceEvents(irContainerExpression, (IrExpression) irFunctionSourceKey(), scope);
        } else {
            irContainerExpression = irContainerExpression2;
        }
        if (irChangedBitMaskValue2.getUsed()) {
            irChangedBitMaskValue = irChangedBitMaskValue2;
            if (irChangedBitMaskValue instanceof IrChangedBitMaskVariable) {
                i = 0;
                irContainerExpressionMutableStatementContainer.getStatements().addAll(0, ((IrChangedBitMaskVariable) irChangedBitMaskValue).asStatements());
            } else {
                i = 0;
                irChangedBitMaskValue = changedParam;
            }
        } else {
            i = 0;
            irChangedBitMaskValue = changedParam;
        }
        if (zBuildPreambleStatementsAndReturnIfSkippingPossible) {
            IrExpression irExpressionIrOrOr = irOrOr(irChangedBitMaskValue.irHasDifferences(scope.getUsedParams()), irNot((IrExpression) irIsSkipping()));
            List<IrValueParameter> listTake = CollectionsKt.take(declaration.getValueParameters(), scope.getRealValueParamCount() + declaration.getContextReceiverParametersCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(listTake));
            for (IrValueParameter irValueParameter : listTake) {
                IrType varargElementType = irValueParameter.getVarargElementType();
                if (varargElementType == null) {
                    varargElementType = irValueParameter.getType();
                }
                arrayList.add(Boolean.valueOf(StabilityKt.knownUnstable(StabilityKt.stabilityOf(varargElementType))));
            }
            boolean[] booleanArray = CollectionsKt___CollectionsKt.toBooleanArray(arrayList);
            int length = booleanArray.length;
            int i3 = i;
            while (true) {
                if (i3 >= length) {
                    i2 = i;
                    break;
                }
                if (booleanArray[i3]) {
                    break;
                }
                i3++;
            }
            if (i2 != 0 && defaultParam != null) {
                irExpressionIrOrOr = irOrOr(defaultParam.irHasAnyProvidedAndUnstable(booleanArray), irExpressionIrOrOr);
            }
            irExpressionIrComposite$default = (IrExpression) AbstractComposeLowering.irIfThenElse$default(this, null, irExpressionIrOrOr, AbstractComposeLowering.irBlock$default(this, null, null, CollectionsKt.plus((Collection) irContainerExpressionMutableStatementContainer2.getStatements(), (Iterable) irContainerExpression.getStatements()), 3, null), irSkipToGroupEnd(body.getEndOffset(), body.getEndOffset()), body.getStartOffset(), body.getEndOffset(), 1, null);
        } else {
            irExpressionIrComposite$default = AbstractComposeLowering.irComposite$default(this, null, null, CollectionsKt.plus((Collection) irContainerExpressionMutableStatementContainer2.getStatements(), (Iterable) irContainerExpression.getStatements()), 3, null);
        }
        scope.realizeGroup(function1);
        int startOffset = body.getStartOffset();
        int endOffset = body.getEndOffset();
        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
        spreadBuilder.add(irStartRestartGroup((IrElement) body, scope, (IrExpression) irFunctionSourceKey()));
        spreadBuilder.addSpread(scope.getMarkerPreamble().getStatements().toArray(new IrStatement[i]));
        spreadBuilder.addSpread(irContainerExpressionMutableStatementContainer.getStatements().toArray(new IrStatement[i]));
        spreadBuilder.add(irExpressionIrComposite$default);
        spreadBuilder.add(irVariable == null ? function0.invoke() : null);
        spreadBuilder.add(irVariable != null ? irReturnVar((IrReturnTargetSymbol) declaration.getSymbol(), irVariable) : null);
        declaration.setBody(new IrBlockBodyImpl(startOffset, endOffset, CollectionsKt.listOfNotNull(spreadBuilder.toArray(new IrStatement[spreadBuilder.size()]))));
        scope.getMetrics().recordFunction(true, true, zBuildPreambleStatementsAndReturnIfSkippingPossible, false, false, scope.getHasDefaultsGroup(), false);
        scope.getMetrics().recordGroup();
        return (IrStatement) declaration;
    }

    private final IrExpression withReplaceableGroupStatements(IrBlock irBlock, final Scope.BlockScope blockScope) {
        getCurrentFunctionScope().getMetrics().recordGroup();
        blockScope.realizeGroup(new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.withReplaceableGroupStatements.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return ComposableFunctionBodyTransformer.irEndReplaceableGroup$default(ComposableFunctionBodyTransformer.this, 0, 0, blockScope, 3, null);
            }
        });
        return endsWithReturnOrJump((IrExpression) irBlock) ? new IrBlockImpl(irBlock.getStartOffset(), irBlock.getEndOffset(), irBlock.getType(), irBlock.getOrigin(), CollectionsKt.plus((Collection) CollectionsKt.listOf(irStartReplaceableGroup$default(this, (IrElement) irBlock, blockScope, null, 0, 0, 28, null)), (Iterable) irBlock.getStatements())) : new IrBlockImpl(irBlock.getStartOffset(), irBlock.getEndOffset(), irBlock.getType(), irBlock.getOrigin(), CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(irStartReplaceableGroup$default(this, (IrElement) irBlock, blockScope, null, irBlock.getStartOffset(), irBlock.getEndOffset(), 4, null)), (Iterable) irBlock.getStatements()), (Iterable) CollectionsKt.listOf(irEndReplaceableGroup(irBlock.getStartOffset(), irBlock.getEndOffset(), blockScope))));
    }

    private final <T extends Scope> T withScope(T scope, Function0<Unit> block) {
        Scope scope2 = this.currentScope;
        this.currentScope = scope;
        scope.setParent(scope2);
        scope.setLevel(scope2.getLevel() + 1);
        try {
            block.invoke();
            return scope;
        } finally {
            InlineMarker.finallyStart(1);
            this.currentScope = scope2;
            InlineMarker.finallyEnd(1);
        }
    }

    private final IrExpression wrap(IrExpression irExpression, List<? extends IrExpression> list, List<? extends IrExpression> list2) {
        if (list2.isEmpty() || IrTypePredicatesKt.isNothing(irExpression.getType()) || IrTypePredicatesKt.isUnit(irExpression.getType())) {
            return wrap((IrStatement) irExpression, irExpression.getStartOffset(), irExpression.getEndOffset(), irExpression.getType(), list, list2);
        }
        IrVariableImpl irVariableImplIrTemporary$default = irTemporary$default(this, irExpression, "group", (IrType) null, false, false, 28, (Object) null);
        return wrap((IrStatement) irVariableImplIrTemporary$default, irExpression.getStartOffset(), irExpression.getEndOffset(), irExpression.getType(), list, CollectionsKt.plus((Collection<? extends IrExpression>) list2, irGet((IrValueDeclaration) irVariableImplIrTemporary$default)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IrExpression wrap$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, IrExpression irExpression, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return composableFunctionBodyTransformer.wrap(irExpression, list, list2);
    }

    private final void wrapWithTraceEvents(IrContainerExpression irContainerExpression, IrExpression irExpression, Scope.FunctionScope functionScope) {
        IrExpression irExpressionIrTraceEventStart = irTraceEventStart(irExpression, functionScope);
        IrExpression irExpressionIrTraceEventEnd = irTraceEventEnd();
        if (irExpressionIrTraceEventStart == null || irExpressionIrTraceEventEnd == null) {
            return;
        }
        irContainerExpression.getStatements().add(0, irExpressionIrTraceEventStart);
        irContainerExpression.getStatements().add(irExpressionIrTraceEventEnd);
    }

    @NotNull
    public final IrCall irCurrentMarker(@NotNull IrValueParameter composerParameter) {
        IrExpression irExpressionIrCurrentComposer$default = irCurrentComposer$default(this, 0, 0, composerParameter, 3, (Object) null);
        IrProperty currentMarkerProperty = getCurrentMarkerProperty();
        Intrinsics.checkNotNull(currentMarkerProperty);
        IrFunction getter = currentMarkerProperty.getGetter();
        Intrinsics.checkNotNull(getter);
        return irMethodCall$default(this, irExpressionIrCurrentComposer$default, getter, 0, 0, 12, null);
    }

    @NotNull
    public final IrVariableImpl irTemporary(@NotNull IrExpression value, @Nullable String nameHint, @NotNull IrType irType, boolean isVar, boolean exactName) {
        Scope.FunctionScope currentFunctionScope = getCurrentFunctionScope();
        if (!exactName || nameHint == null) {
            nameHint = currentFunctionScope.getNameForTemporary(nameHint);
        }
        return AbstractComposeLowering.irTemporary$default(this, value, nameHint, irType, isVar, null, 16, null);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        IrElement irElement = (IrElement) module;
        this.inlineLambdaInfo.scan(irElement);
        IrElementTransformerVoidKt.transformChildrenVoid(irElement, this);
        applySourceFixups();
        PatchDeclarationParentsKt.patchDeclarationParents$default(irElement, (IrDeclarationParent) null, 1, (Object) null);
    }

    @NotNull
    public IrExpression visitBlock(@NotNull IrBlock expression) {
        IrContainerExpression irContainerExpression;
        IrStatementOrigin origin = expression.getOrigin();
        if (!Intrinsics.areEqual(origin, IrStatementOrigin.FOR_LOOP.INSTANCE)) {
            return Intrinsics.areEqual(origin, IrStatementOrigin.FOR_LOOP_INNER_WHILE.INSTANCE) ? super.visitBlock(expression) : super.visitBlock(expression);
        }
        List statements = expression.getStatements();
        if (!(statements.size() == 2)) {
            throw new IllegalArgumentException("Expected 2 statements in for-loop block".toString());
        }
        Object obj = statements.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrVariable");
        IrVariable irVariable = (IrVariable) obj;
        if (!Intrinsics.areEqual(irVariable.getOrigin(), IrDeclarationOrigin.FOR_LOOP_ITERATOR.INSTANCE)) {
            throw new IllegalArgumentException("Expected FOR_LOOP_ITERATOR origin for iterator variable".toString());
        }
        IrElementTransformer irElementTransformer = (IrElementTransformer) this;
        IrElement irElementTransform = irVariable.transform(irElementTransformer, (Object) null);
        Intrinsics.checkNotNull(irElementTransform, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrVariable");
        IrElement irElement = (IrVariable) irElementTransform;
        Object obj2 = statements.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrWhileLoop");
        IrWhileLoop irWhileLoop = (IrWhileLoop) obj2;
        if (!Intrinsics.areEqual(irWhileLoop.getOrigin(), IrStatementOrigin.FOR_LOOP_INNER_WHILE.INSTANCE)) {
            throw new IllegalArgumentException("Expected FOR_LOOP_INNER_WHILE origin for while loop".toString());
        }
        IrBlock irBlockTransform = irWhileLoop.transform(irElementTransformer, (Object) null);
        if (Intrinsics.areEqual(irElement, irVariable) && Intrinsics.areEqual(irBlockTransform, irWhileLoop)) {
            irContainerExpression = (IrContainerExpression) expression;
        } else {
            if (!(irBlockTransform instanceof IrBlock)) {
                throw new IllegalStateException("Expected transformed loop to be an IrBlock".toString());
            }
            IrBlock irBlock = irBlockTransform;
            if (!(irBlock.getStatements().size() == 3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Object obj3 = irBlock.getStatements().get(0);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrContainerExpression");
            Object obj4 = irBlock.getStatements().get(1);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrWhileLoop");
            Object obj5 = irBlock.getStatements().get(2);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrContainerExpression");
            IrContainerExpression irContainerExpressionMutableStatementContainer = mutableStatementContainer();
            irContainerExpressionMutableStatementContainer.getStatements().addAll(CollectionsKt.listOf((Object[]) new IrExpression[]{(IrContainerExpression) obj3, irBlock(expression.getType(), (IrStatementOrigin) IrStatementOrigin.FOR_LOOP.INSTANCE, CollectionsKt.listOf((Object[]) new IrElement[]{irElement, (IrWhileLoop) obj4})), (IrContainerExpression) obj5}));
            irContainerExpression = irContainerExpressionMutableStatementContainer;
        }
        return (IrExpression) irContainerExpression;
    }

    @NotNull
    public IrExpression visitBreakContinue(@NotNull IrBreakContinue jump) {
        if (!isInComposableScope()) {
            return super.visitBreakContinue(jump);
        }
        final IrContainerExpression irContainerExpressionMutableStatementContainer = mutableStatementContainer();
        encounteredJump(jump, new Function1<IrExpression, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.visitBreakContinue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IrExpression irExpression) {
                invoke2(irExpression);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IrExpression irExpression) {
                irContainerExpressionMutableStatementContainer.getStatements().add(irExpression);
            }
        });
        return wrap$default(this, (IrExpression) jump, CollectionsKt.listOf(irContainerExpressionMutableStatementContainer), null, 2, null);
    }

    @NotNull
    public IrExpression visitCall(@NotNull IrCall expression) {
        if (isComposableCall(expression) || isSyntheticComposableCall(expression)) {
            return visitComposableCall(expression);
        }
        if (!expression.getSymbol().getOwner().isInline()) {
            if (!isComposableSingletonGetter(expression)) {
                return super.visitCall(expression);
            }
            IrPropertySymbol correspondingPropertySymbol = expression.getSymbol().getOwner().getCorrespondingPropertySymbol();
            IrElement irElement = correspondingPropertySymbol != null ? (IrProperty) correspondingPropertySymbol.getOwner() : null;
            if (irElement != null) {
                transformChildrenVoid(irElement);
            }
            return super.visitCall(expression);
        }
        Scope.CaptureScope captureScope = new Scope.CaptureScope();
        Scope scope = this.currentScope;
        this.currentScope = captureScope;
        captureScope.setParent(scope);
        captureScope.setLevel(scope.getLevel() + 1);
        try {
            transformChildrenVoid((IrElement) expression);
            this.currentScope = scope;
            return captureScope.getHasCapturedComposableCall() ? asCoalescableGroup((IrExpression) expression, captureScope) : (IrExpression) expression;
        } catch (Throwable th) {
            this.currentScope = scope;
            throw th;
        }
    }

    @NotNull
    public IrStatement visitClass(@NotNull IrClass declaration) {
        if (isComposableSingletonClass(declaration)) {
            return (IrStatement) declaration;
        }
        Scope.ClassScope classScope = new Scope.ClassScope(declaration.getName());
        Scope scope = this.currentScope;
        this.currentScope = classScope;
        classScope.setParent(scope);
        classScope.setLevel(scope.getLevel() + 1);
        try {
            return super.visitDeclaration((IrDeclarationBase) declaration);
        } finally {
            this.currentScope = scope;
        }
    }

    @NotNull
    public IrStatement visitDeclaration(@NotNull IrDeclarationBase declaration) {
        if (declaration instanceof IrField ? true : declaration instanceof IrProperty ? true : declaration instanceof IrFunction ? true : declaration instanceof IrClass) {
            return super.visitDeclaration(declaration);
        }
        if (declaration instanceof IrTypeAlias ? true : declaration instanceof IrEnumEntry ? true : declaration instanceof IrAnonymousInitializer ? true : declaration instanceof IrTypeParameter ? true : declaration instanceof IrLocalDelegatedProperty ? true : declaration instanceof IrValueDeclaration) {
            return super.visitDeclaration(declaration);
        }
        throw new IllegalStateException("Unhandled declaration! ".concat(declaration.getClass().getSimpleName()).toString());
    }

    @NotNull
    public IrExpression visitDoWhileLoop(@NotNull IrDoWhileLoop loop) {
        return !isInComposableScope() ? super.visitDoWhileLoop(loop) : handleLoop((IrLoop) loop);
    }

    @NotNull
    public IrStatement visitField(@NotNull IrField declaration) {
        Scope.FieldScope fieldScope = new Scope.FieldScope(declaration.getName());
        Scope scope = this.currentScope;
        this.currentScope = fieldScope;
        fieldScope.setParent(scope);
        fieldScope.setLevel(scope.getLevel() + 1);
        try {
            return super.visitField(declaration);
        } finally {
            this.currentScope = scope;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
    @NotNull
    public IrFile visitFile(@NotNull IrFile declaration) throws Exception {
        try {
            Scope.FileScope fileScope = new Scope.FileScope(declaration);
            Scope scope = this.currentScope;
            this.currentScope = fileScope;
            fileScope.setParent(scope);
            fileScope.setLevel(scope.getLevel() + 1);
            try {
                return super.visitFile(declaration);
            } finally {
                this.currentScope = scope;
            }
        } catch (Exception e) {
            throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(declaration)), e);
        } catch (ProcessCanceledException e2) {
            throw e2;
        }
    }

    @NotNull
    public IrStatement visitFunction(@NotNull IrFunction declaration) {
        Scope.FunctionScope functionScope = new Scope.FunctionScope(declaration, this);
        Scope scope = this.currentScope;
        this.currentScope = functionScope;
        functionScope.setParent(scope);
        functionScope.setLevel(scope.getLevel() + 1);
        try {
            IrStatement irStatementVisitFunctionInScope = visitFunctionInScope(declaration);
            this.currentScope = scope;
            if (functionScope.isInlinedLambda() && !functionScope.getIsComposable() && functionScope.getHasComposableCalls()) {
                encounteredCapturedComposableCall();
            }
            getMetrics().recordFunction(functionScope.getMetrics());
            IrAttributeContainer irAttributeContainer = declaration instanceof IrAttributeContainer ? (IrAttributeContainer) declaration : null;
            if (irAttributeContainer != null) {
                WeakBindingTraceKt.getIrTrace(getContext()).record(ComposeWritableSlices.INSTANCE.getFUNCTION_METRICS(), irAttributeContainer, functionScope.getMetrics());
            }
            return irStatementVisitFunctionInScope;
        } catch (Throwable th) {
            this.currentScope = scope;
            throw th;
        }
    }

    @NotNull
    public IrExpression visitGetValue(@NotNull IrGetValue expression) {
        IrValueDeclaration owner = expression.getSymbol().getOwner();
        if (owner instanceof IrValueParameter) {
            IrDeclarationParent parent = owner.getParent();
            for (Scope parent2 = this.currentScope; parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 instanceof Scope.FunctionScope) {
                    Scope.FunctionScope functionScope = (Scope.FunctionScope) parent2;
                    if (Intrinsics.areEqual(functionScope.getFunction(), parent)) {
                        int iIndexOf = functionScope.getAllTrackedParams().indexOf(owner);
                        if (iIndexOf != -1) {
                            functionScope.getUsedParams()[iIndexOf] = true;
                        }
                        return (IrExpression) expression;
                    }
                }
            }
        }
        return (IrExpression) expression;
    }

    @NotNull
    public IrStatement visitProperty(@NotNull IrProperty declaration) {
        Scope.PropertyScope propertyScope = new Scope.PropertyScope(declaration.getName());
        Scope scope = this.currentScope;
        this.currentScope = propertyScope;
        propertyScope.setParent(scope);
        propertyScope.setLevel(scope.getLevel() + 1);
        try {
            return super.visitProperty(declaration);
        } finally {
            this.currentScope = scope;
        }
    }

    @NotNull
    public IrExpression visitReturn(@NotNull IrReturn expression) {
        if (!isInComposableScope()) {
            return super.visitReturn(expression);
        }
        Scope.ReturnScope returnScope = new Scope.ReturnScope(expression);
        Scope scope = this.currentScope;
        this.currentScope = returnScope;
        returnScope.setParent(scope);
        returnScope.setLevel(scope.getLevel() + 1);
        try {
            transformChildrenVoid((IrElement) expression);
            this.currentScope = scope;
            final IrExpression irExpressionMutableStatementContainer = mutableStatementContainer();
            encounteredReturn(expression.getReturnTargetSymbol(), new Function1<IrExpression, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer.visitReturn.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IrExpression irExpression) {
                    invoke2(irExpression);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IrExpression irExpression) {
                    irExpressionMutableStatementContainer.getStatements().add(irExpression);
                }
            });
            if (!returnScope.getHasComposableCalls() && ComposableFunctionBodyTransformerKt.isUnitOrNullableUnit(expression.getValue().getType())) {
                return wrap$default(this, (IrExpression) expression, CollectionsKt.listOf(irExpressionMutableStatementContainer), null, 2, null);
            }
            IrStatement irStatementIrTemporary$default = irTemporary$default(this, expression.getValue(), "return", (IrType) null, false, false, 28, (Object) null);
            return wrap$default(this, irStatementIrTemporary$default, expression.getStartOffset(), expression.getEndOffset(), expression.getType(), null, CollectionsKt.listOf((Object[]) new IrExpression[]{irExpressionMutableStatementContainer, new IrReturnImpl(expression.getStartOffset(), expression.getEndOffset(), expression.getType(), expression.getReturnTargetSymbol(), irGet((IrValueDeclaration) irStatementIrTemporary$default))}), 8, null);
        } catch (Throwable th) {
            this.currentScope = scope;
            throw th;
        }
    }

    @NotNull
    public IrExpression visitWhen(@NotNull IrWhen expression) {
        if (!isInComposableScope()) {
            return super.visitWhen(expression);
        }
        IrExpression irWhenImpl = new IrWhenImpl(expression.getStartOffset(), expression.getEndOffset(), expression.getType(), expression.getOrigin());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Scope.WhenScope whenScope = new Scope.WhenScope();
        Scope scope = this.currentScope;
        this.currentScope = whenScope;
        whenScope.setParent(scope);
        whenScope.setLevel(scope.getLevel() + 1);
        try {
            boolean z = false;
            int i = 0;
            int i2 = 0;
            boolean z2 = false;
            for (Iterator it = expression.getBranches().iterator(); it.hasNext(); it = it) {
                Object next = it.next();
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                IrBranch irBranch = (IrBranch) next;
                if (irBranch instanceof IrElseBranch) {
                    Pair pairTransformWithScope = transformWithScope(irBranch.getResult(), new Scope.BranchScope());
                    Scope.BranchScope branchScope = (Scope.BranchScope) pairTransformWithScope.component1();
                    IrExpression irExpression = (IrExpression) pairTransformWithScope.component2();
                    arrayList2.add(new Scope.BranchScope());
                    arrayList.add(branchScope);
                    if (branchScope.getHasComposableCalls()) {
                        i2++;
                    }
                    irWhenImpl.getBranches().add(new IrElseBranchImpl(irBranch.getStartOffset(), irBranch.getEndOffset(), irBranch.getCondition(), irExpression));
                    z = true;
                } else {
                    Pair pairTransformWithScope2 = transformWithScope(irBranch.getCondition(), new Scope.BranchScope());
                    Scope.BranchScope branchScope2 = (Scope.BranchScope) pairTransformWithScope2.component1();
                    IrExpression irExpression2 = (IrExpression) pairTransformWithScope2.component2();
                    Pair pairTransformWithScope3 = transformWithScope(irBranch.getResult(), new Scope.BranchScope());
                    Scope.BranchScope branchScope3 = (Scope.BranchScope) pairTransformWithScope3.component1();
                    IrExpression irExpression3 = (IrExpression) pairTransformWithScope3.component2();
                    arrayList2.add(branchScope2);
                    arrayList.add(branchScope3);
                    z2 = z2 || (i != 0 && branchScope2.getHasComposableCalls());
                    if (branchScope3.getHasComposableCalls()) {
                        i2++;
                    }
                    irWhenImpl.getBranches().add(new IrBranchImpl(irBranch.getStartOffset(), irBranch.getEndOffset(), irExpression2, irExpression3));
                }
                i = i3;
            }
            this.currentScope = scope;
            if (!z && i2 > 1 && !z2) {
                arrayList2.add(new Scope.BranchScope());
                arrayList.add(new Scope.BranchScope());
                irWhenImpl.getBranches().add(new IrElseBranchImpl(expression.getEndOffset(), expression.getEndOffset(), new IrConstImpl(expression.getEndOffset(), expression.getEndOffset(), getContext().getIrBuiltIns().getBooleanType(), IrConstKind.Boolean.INSTANCE, Boolean.TRUE), new IrBlockImpl(expression.getEndOffset(), expression.getEndOffset(), getContext().getIrBuiltIns().getUnitType(), (IrStatementOrigin) null, CollectionsKt.emptyList())));
            }
            List branches = irWhenImpl.getBranches();
            int size = branches.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = branches.get(i4);
                Object obj2 = arrayList2.get(i4);
                Scope.BranchScope branchScope4 = (Scope.BranchScope) arrayList.get(i4);
                Scope.BranchScope branchScope5 = (Scope.BranchScope) obj2;
                IrBranch irBranch2 = (IrBranch) obj;
                if (z2 && branchScope5.getHasComposableCalls()) {
                    irBranch2.setCondition(asReplaceableGroup(irBranch2.getCondition(), branchScope5));
                }
                if ((i2 > 1 && !z2) || (z2 && branchScope4.getHasComposableCalls())) {
                    irBranch2.setResult(asReplaceableGroup(irBranch2.getResult(), branchScope4));
                }
            }
            if (i2 != 1) {
                return z2 ? asCoalescableGroup(irWhenImpl, whenScope) : irWhenImpl;
            }
            IrExpression irExpression4 = irWhenImpl;
            Object obj3 = null;
            boolean z3 = false;
            for (Object obj4 : arrayList) {
                if (((Scope.BranchScope) obj4).getHasComposableCalls()) {
                    if (z3) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    obj3 = obj4;
                    z3 = true;
                }
            }
            if (z3) {
                return asCoalescableGroup(irExpression4, (Scope.BlockScope) obj3);
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Throwable th) {
            this.currentScope = scope;
            throw th;
        }
    }

    @NotNull
    public IrExpression visitWhileLoop(@NotNull IrWhileLoop loop) {
        return !isInComposableScope() ? super.visitWhileLoop(loop) : handleLoop((IrLoop) loop);
    }

    public static /* synthetic */ IrExpression irCurrentComposer$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, Scope.BlockScope blockScope, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return composableFunctionBodyTransformer.irCurrentComposer(blockScope, i, i2);
    }

    private final IrExpression irCurrentComposer(Scope.BlockScope blockScope, int i, int i2) {
        IrValueParameter nearestComposer = blockScope.getNearestComposer();
        if (nearestComposer == null) {
            nearestComposer = nearestComposer();
        }
        return irCurrentComposer(i, i2, nearestComposer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IrExpression wrap$default(ComposableFunctionBodyTransformer composableFunctionBodyTransformer, IrStatement irStatement, int i, int i2, IrType irType, List list, List list2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i3 & 16) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return composableFunctionBodyTransformer.wrap(irStatement, i, i2, irType, list3, list2);
    }

    public void lower(@NotNull IrFile irFile) {
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) irFile, this);
        applySourceFixups();
    }

    private final IrExpression wrap(IrStatement irStatement, int i, int i2, IrType irType, List<? extends IrExpression> list, List<? extends IrExpression> list2) {
        return new IrBlockImpl(i, i2, irType, (IrStatementOrigin) null, CollectionsKt.plus((Collection) CollectionsKt.plus((Collection<? extends IrStatement>) list, irStatement), (Iterable) list2));
    }
}
