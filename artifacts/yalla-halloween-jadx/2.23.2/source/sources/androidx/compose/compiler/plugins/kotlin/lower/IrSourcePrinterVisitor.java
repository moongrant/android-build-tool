package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.compiler.plugins.kotlin.KtxNameConventions;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException;
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities;
import org.jetbrains.kotlin.descriptors.Modality;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationBase;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationWithName;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrEnumEntry;
import org.jetbrains.kotlin.ir.declarations.IrErrorDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrExternalPackageFragment;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrPackageFragment;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrReturnTarget;
import org.jetbrains.kotlin.ir.declarations.IrScript;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrTypeAlias;
import org.jetbrains.kotlin.ir.declarations.IrTypeParameter;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.IrVariable;
import org.jetbrains.kotlin.ir.expressions.IrBlock;
import org.jetbrains.kotlin.ir.expressions.IrBlockBody;
import org.jetbrains.kotlin.ir.expressions.IrBody;
import org.jetbrains.kotlin.ir.expressions.IrBranch;
import org.jetbrains.kotlin.ir.expressions.IrBreak;
import org.jetbrains.kotlin.ir.expressions.IrBreakContinue;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrCallableReference;
import org.jetbrains.kotlin.ir.expressions.IrCatch;
import org.jetbrains.kotlin.ir.expressions.IrClassReference;
import org.jetbrains.kotlin.ir.expressions.IrComposite;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstKind;
import org.jetbrains.kotlin.ir.expressions.IrConstantArray;
import org.jetbrains.kotlin.ir.expressions.IrConstantObject;
import org.jetbrains.kotlin.ir.expressions.IrConstantPrimitive;
import org.jetbrains.kotlin.ir.expressions.IrConstantValue;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrContainerExpression;
import org.jetbrains.kotlin.ir.expressions.IrContinue;
import org.jetbrains.kotlin.ir.expressions.IrDeclarationReference;
import org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop;
import org.jetbrains.kotlin.ir.expressions.IrDynamicExpression;
import org.jetbrains.kotlin.ir.expressions.IrDynamicMemberExpression;
import org.jetbrains.kotlin.ir.expressions.IrDynamicOperatorExpression;
import org.jetbrains.kotlin.ir.expressions.IrElseBranch;
import org.jetbrains.kotlin.ir.expressions.IrEnumConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression;
import org.jetbrains.kotlin.ir.expressions.IrErrorExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.expressions.IrFieldAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionReference;
import org.jetbrains.kotlin.ir.expressions.IrGetClass;
import org.jetbrains.kotlin.ir.expressions.IrGetEnumValue;
import org.jetbrains.kotlin.ir.expressions.IrGetField;
import org.jetbrains.kotlin.ir.expressions.IrGetObjectValue;
import org.jetbrains.kotlin.ir.expressions.IrGetSingletonValue;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;
import org.jetbrains.kotlin.ir.expressions.IrInstanceInitializerCall;
import org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference;
import org.jetbrains.kotlin.ir.expressions.IrLoop;
import org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrPropertyReference;
import org.jetbrains.kotlin.ir.expressions.IrRawFunctionReference;
import org.jetbrains.kotlin.ir.expressions.IrReturn;
import org.jetbrains.kotlin.ir.expressions.IrSetField;
import org.jetbrains.kotlin.ir.expressions.IrSetValue;
import org.jetbrains.kotlin.ir.expressions.IrSpreadElement;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.IrStringConcatenation;
import org.jetbrains.kotlin.ir.expressions.IrSuspendableExpression;
import org.jetbrains.kotlin.ir.expressions.IrSuspensionPoint;
import org.jetbrains.kotlin.ir.expressions.IrSyntheticBody;
import org.jetbrains.kotlin.ir.expressions.IrThrow;
import org.jetbrains.kotlin.ir.expressions.IrTry;
import org.jetbrains.kotlin.ir.expressions.IrTypeOperator;
import org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall;
import org.jetbrains.kotlin.ir.expressions.IrValueAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrVararg;
import org.jetbrains.kotlin.ir.expressions.IrVarargElement;
import org.jetbrains.kotlin.ir.expressions.IrWhen;
import org.jetbrains.kotlin.ir.expressions.IrWhileLoop;
import org.jetbrains.kotlin.ir.expressions.impl.IrIfThenElseImpl;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrPropertySymbol;
import org.jetbrains.kotlin.ir.symbols.IrReturnTargetSymbol;
import org.jetbrains.kotlin.ir.symbols.IrTypeAliasSymbol;
import org.jetbrains.kotlin.ir.types.IrDynamicType;
import org.jetbrains.kotlin.ir.types.IrErrorType;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrStarProjection;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypeAbbreviation;
import org.jetbrains.kotlin.ir.types.IrTypeArgument;
import org.jetbrains.kotlin.ir.types.IrTypePredicatesKt;
import org.jetbrains.kotlin.ir.types.IrTypeProjection;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementVisitor;
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid;
import org.jetbrains.kotlin.ir.visitors.IrVisitorsKt;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.types.Variance;
import org.jetbrains.kotlin.utils.Printer;
import p004OooO0oO.o000oOoO;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0017\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH\u0082\bJ&\u0010 \u001a\u00020\u00062\u001b\u0010!\u001a\u0017\u0012\b\u0012\u00060#j\u0002`$\u0012\u0004\u0012\u00020\u001d0\"¢\u0006\u0002\b%H\u0082\bJ\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060'2\u0006\u0010(\u001a\u00020)H\u0002J\u0017\u0010*\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH\u0082\bJ\u0010\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020)H\u0002J\u0012\u0010-\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u000e\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u000202J\b\u00103\u001a\u00020\u000fH\u0002J\u0012\u00103\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0010\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u000206H\u0002J\u0016\u00107\u001a\u00020\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u0002060'H\u0002J\u0010\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020QH\u0016J\u0014\u0010R\u001a\u00020\u001d2\n\u0010:\u001a\u0006\u0012\u0002\b\u00030SH\u0016J\u0010\u0010T\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u00020\u001d2\u0006\u0010:\u001a\u000206H\u0016J\u0010\u0010W\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020XH\u0016J\u0010\u0010Y\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\\H\u0016J\u0010\u0010]\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020_H\u0016J\u0010\u0010`\u001a\u00020\u001d2\u0006\u0010a\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020dH\u0016J\u0010\u0010e\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020fH\u0016J\u0010\u0010g\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020hH\u0016J\u0010\u0010i\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020jH\u0016J\u0010\u0010k\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u0015H\u0016J\u0010\u0010l\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u0013H\u0016J\u0010\u0010m\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020nH\u0016J\u0010\u0010o\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020pH\u0016J\u0010\u0010q\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020rH\u0016J\u0010\u0010s\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020tH\u0016J\u0010\u0010u\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020vH\u0016J\u0010\u0010w\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020xH\u0016J\u0010\u0010y\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020zH\u0016J\u0010\u0010{\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020|H\u0016J\u0010\u0010}\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020~H\u0016J\u0011\u0010\u007f\u001a\u00020\u001d2\u0007\u0010^\u001a\u00030\u0080\u0001H\u0016J\u0012\u0010\u0081\u0001\u001a\u00020\u001d2\u0007\u0010L\u001a\u00030\u0082\u0001H\u0016J\u0012\u0010\u0083\u0001\u001a\u00020\u001d2\u0007\u0010L\u001a\u00030\u0084\u0001H\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\u001d2\u0007\u0010:\u001a\u00030\u0086\u0001H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u001d2\u0007\u0010:\u001a\u00030\u0088\u0001H\u0016J\u0012\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010:\u001a\u00030\u008a\u0001H\u0016J\u0012\u0010\u008b\u0001\u001a\u00020\u001d2\u0007\u0010:\u001a\u00030\u008c\u0001H\u0016J\u0012\u0010\u008d\u0001\u001a\u00020\u001d2\u0007\u0010L\u001a\u00030\u008e\u0001H\u0016J\u0013\u0010\u008f\u0001\u001a\u00020\u001d2\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0016J\u0012\u0010\u0092\u0001\u001a\u00020\u001d2\u0007\u0010:\u001a\u00030\u0093\u0001H\u0016J\u0012\u0010\u0094\u0001\u001a\u00020\u001d2\u0007\u0010:\u001a\u00030\u0095\u0001H\u0016J\u0013\u0010\u0096\u0001\u001a\u00020\u001d2\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0016J\u0012\u0010\u0099\u0001\u001a\u00020\u001d2\u0007\u0010L\u001a\u00030\u009a\u0001H\u0016J\u0012\u0010\u009b\u0001\u001a\u00020\u001d2\u0007\u0010:\u001a\u00030\u009c\u0001H\u0016J\u0012\u0010\u009d\u0001\u001a\u00020\u001d2\u0007\u0010L\u001a\u00030\u009e\u0001H\u0016J\u0012\u0010\u009f\u0001\u001a\u00020\u001d2\u0007\u0010:\u001a\u00030 \u0001H\u0016J\u0012\u0010¡\u0001\u001a\u00020\u001d2\u0007\u0010L\u001a\u00030¢\u0001H\u0016J\u0012\u0010£\u0001\u001a\u00020\u001d2\u0007\u0010:\u001a\u00030¤\u0001H\u0016J\u0012\u0010¥\u0001\u001a\u00020\u001d2\u0007\u0010L\u001a\u00030¦\u0001H\u0016J\u0012\u0010§\u0001\u001a\u00020\u001d2\u0007\u0010:\u001a\u00030¨\u0001H\u0016J\u0012\u0010©\u0001\u001a\u00020\u001d2\u0007\u0010^\u001a\u00030ª\u0001H\u0016J%\u0010«\u0001\u001a\u0003H¬\u0001\"\u0005\b\u0000\u0010¬\u00012\u000e\u0010\u00ad\u0001\u001a\t\u0012\u0005\u0012\u0003H¬\u00010\u001f¢\u0006\u0003\u0010®\u0001J\u001a\u0010¯\u0001\u001a\u0005\u0018\u00010\u0084\u0001*\u00020M2\b\u0010°\u0001\u001a\u00030¢\u0001H\u0002J\u0018\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060'*\u0007\u0012\u0002\b\u00030²\u0001H\u0002J\u001e\u0010³\u0001\u001a\u00020\b*\u00030´\u00012\u000e\u0010µ\u0001\u001a\t\u0012\u0005\u0012\u00030¶\u00010'H\u0002J\u0017\u0010³\u0001\u001a\u00020\b*\u00030´\u00012\u0007\u0010·\u0001\u001a\u00020\u0015H\u0002J\f\u0010-\u001a\u00020\u001d*\u00020bH\u0002J\u0019\u0010¸\u0001\u001a\u00020\u001d*\u00030¹\u00012\t\b\u0002\u0010º\u0001\u001a\u00020\bH\u0002J#\u0010»\u0001\u001a\u00020\u001d*\u00020\u00132\t\b\u0002\u0010¼\u0001\u001a\u00020\b2\t\b\u0002\u0010½\u0001\u001a\u00020\bH\u0002J\u000b\u0010¾\u0001\u001a\u00020\u001d*\u00020\u0015J\u000b\u0010¿\u0001\u001a\u00020\u001d*\u00020MJ\u000b\u0010À\u0001\u001a\u00020\u001d*\u00020\u0015J\u001f\u0010Á\u0001\u001a\u00020\u001d*\u0007\u0012\u0002\b\u00030²\u00012\u000b\b\u0002\u0010Â\u0001\u001a\u0004\u0018\u00010\u0006H\u0002J\u001e\u0010Ã\u0001\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00020b0'2\t\b\u0002\u0010Ä\u0001\u001a\u00020\u0006H\u0002J\u0018\u0010Å\u0001\u001a\u00020\u001d*\u00020\u00152\t\b\u0002\u0010Æ\u0001\u001a\u00020\bH\u0002J\u0018\u00104\u001a\u00020\u001d*\u00060#j\u0002`$2\u0006\u00105\u001a\u000206H\u0002J\u001c\u0010Ç\u0001\u001a\u00020\u001d*\u00060#j\u0002`$2\t\u0010È\u0001\u001a\u0004\u0018\u00010bH\u0002J\u001b\u0010É\u0001\u001a\u00020\u001d*\u00030Ê\u00012\u000b\u0010Ë\u0001\u001a\u00060#j\u0002`$H\u0002J\u001b\u0010Ì\u0001\u001a\u00020\u001d*\u00030Ê\u00012\u000b\u0010Ë\u0001\u001a\u00060#j\u0002`$H\u0002J\r\u0010Í\u0001\u001a\u00020\u0006*\u000202H\u0002J\u000e\u0010Î\u0001\u001a\u00020\u0006*\u00030Ï\u0001H\u0002J\u000e\u0010Ð\u0001\u001a\u00020\u0006*\u00030Ñ\u0001H\u0002J\u000e\u0010Ò\u0001\u001a\u00020\u0006*\u00030Ó\u0001H\u0002J\r\u0010Ô\u0001\u001a\u00020\u0006*\u000202H\u0002J#\u0010Õ\u0001\u001a\u00020\u001d*\u00020\u00152\u0013\u0010\u00ad\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001d0\"H\u0082\bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\u00020\b*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\b*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0018\u001a\u00020\u0006*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006Ö\u0001"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/IrSourcePrinterVisitor;", "Lorg/jetbrains/kotlin/ir/visitors/IrElementVisitorVoid;", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "indentUnit", "", "useFir", "", "(Ljava/lang/Appendable;Ljava/lang/String;Z)V", "currentScope", "Landroidx/compose/compiler/plugins/kotlin/lower/Scope;", "isInNotCall", "printIntsAsBinary", "printer", "Lorg/jetbrains/kotlin/utils/Printer;", "returnTargetToCall", "", "Lorg/jetbrains/kotlin/ir/symbols/IrReturnTargetSymbol;", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionAccessExpression;", "isDelegatedPropertySetter", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)Z", "isLambda", "normalizedName", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "getNormalizedName", "(Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;)Ljava/lang/String;", "bracedBlock", "", "body", "Lkotlin/Function0;", "buildTrimEnd", UserDataStore.FIRST_NAME, "Lkotlin/Function1;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lkotlin/ExtensionFunctionType;", "getPlaceholderParameterNames", "", "expectedCount", "", "indented", "intAsBinaryString", AppMeasurementSdk.ConditionalUserProperty.VALUE, "print", "obj", "", "printType", "type", "Lorg/jetbrains/kotlin/ir/types/IrType;", "println", "renderAsAnnotation", "irAnnotation", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "renderTypeAnnotations", "annotations", "visitBlock", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrBlock;", "visitBlockBody", "Lorg/jetbrains/kotlin/ir/expressions/IrBlockBody;", "visitBranch", "branch", "Lorg/jetbrains/kotlin/ir/expressions/IrBranch;", "visitBreak", "jump", "Lorg/jetbrains/kotlin/ir/expressions/IrBreak;", "visitBreakContinue", "Lorg/jetbrains/kotlin/ir/expressions/IrBreakContinue;", "visitCall", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "visitCatch", "aCatch", "Lorg/jetbrains/kotlin/ir/expressions/IrCatch;", "visitClass", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "visitClassReference", "Lorg/jetbrains/kotlin/ir/expressions/IrClassReference;", "visitComposite", "Lorg/jetbrains/kotlin/ir/expressions/IrComposite;", "visitConst", "Lorg/jetbrains/kotlin/ir/expressions/IrConst;", "visitConstructor", "Lorg/jetbrains/kotlin/ir/declarations/IrConstructor;", "visitConstructorCall", "visitContainerExpression", "Lorg/jetbrains/kotlin/ir/expressions/IrContainerExpression;", "visitContinue", "Lorg/jetbrains/kotlin/ir/expressions/IrContinue;", "visitDelegatingConstructorCall", "Lorg/jetbrains/kotlin/ir/expressions/IrDelegatingConstructorCall;", "visitDoWhileLoop", "loop", "Lorg/jetbrains/kotlin/ir/expressions/IrDoWhileLoop;", "visitElement", "element", "Lorg/jetbrains/kotlin/ir/IrElement;", "visitElseBranch", "Lorg/jetbrains/kotlin/ir/expressions/IrElseBranch;", "visitExpressionBody", "Lorg/jetbrains/kotlin/ir/expressions/IrExpressionBody;", "visitField", "Lorg/jetbrains/kotlin/ir/declarations/IrField;", "visitFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "visitFunction", "visitFunctionAccess", "visitFunctionExpression", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionExpression;", "visitFunctionReference", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionReference;", "visitGetEnumValue", "Lorg/jetbrains/kotlin/ir/expressions/IrGetEnumValue;", "visitGetField", "Lorg/jetbrains/kotlin/ir/expressions/IrGetField;", "visitGetObjectValue", "Lorg/jetbrains/kotlin/ir/expressions/IrGetObjectValue;", "visitGetValue", "Lorg/jetbrains/kotlin/ir/expressions/IrGetValue;", "visitInstanceInitializerCall", "Lorg/jetbrains/kotlin/ir/expressions/IrInstanceInitializerCall;", "visitLocalDelegatedProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrLocalDelegatedProperty;", "visitLocalDelegatedPropertyReference", "Lorg/jetbrains/kotlin/ir/expressions/IrLocalDelegatedPropertyReference;", "visitLoop", "Lorg/jetbrains/kotlin/ir/expressions/IrLoop;", "visitModuleFragment", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "visitProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "visitPropertyReference", "Lorg/jetbrains/kotlin/ir/expressions/IrPropertyReference;", "visitReturn", "Lorg/jetbrains/kotlin/ir/expressions/IrReturn;", "visitSetField", "Lorg/jetbrains/kotlin/ir/expressions/IrSetField;", "visitSetValue", "Lorg/jetbrains/kotlin/ir/expressions/IrSetValue;", "visitSimpleFunction", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "visitSpreadElement", "spread", "Lorg/jetbrains/kotlin/ir/expressions/IrSpreadElement;", "visitStringConcatenation", "Lorg/jetbrains/kotlin/ir/expressions/IrStringConcatenation;", "visitThrow", "Lorg/jetbrains/kotlin/ir/expressions/IrThrow;", "visitTry", "aTry", "Lorg/jetbrains/kotlin/ir/expressions/IrTry;", "visitTypeAlias", "Lorg/jetbrains/kotlin/ir/declarations/IrTypeAlias;", "visitTypeOperator", "Lorg/jetbrains/kotlin/ir/expressions/IrTypeOperatorCall;", "visitTypeParameter", "Lorg/jetbrains/kotlin/ir/declarations/IrTypeParameter;", "visitValueAccess", "Lorg/jetbrains/kotlin/ir/expressions/IrValueAccessExpression;", "visitValueParameter", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "visitVararg", "Lorg/jetbrains/kotlin/ir/expressions/IrVararg;", "visitVariable", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "visitWhen", "Lorg/jetbrains/kotlin/ir/expressions/IrWhen;", "visitWhileLoop", "Lorg/jetbrains/kotlin/ir/expressions/IrWhileLoop;", "withIntsAsBinaryLiterals", "T", ReportItem.LogTypeBlock, "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "correspondingProperty", "param", "getValueParameterNamesForDebug", "Lorg/jetbrains/kotlin/ir/expressions/IrMemberAccessExpression;", "isLastStatementIn", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "statements", "Lorg/jetbrains/kotlin/ir/IrStatement;", "function", "printAnnotations", "Lorg/jetbrains/kotlin/ir/declarations/IrAnnotationContainer;", "onePerLine", "printArgumentList", "forceParameterNames", "forceSingleLine", "printAsLambda", "printAsObject", "printBody", "printExplicitReceiver", "suffix", "printJoin", "separator", "printPropertyAccessor", "isSetter", "renderAsAnnotationArgument", "irElement", "renderDeclarationFqn", "Lorg/jetbrains/kotlin/ir/declarations/IrDeclaration;", "sb", "renderDeclarationParentFqn", "renderSrc", "renderTypeAbbreviation", "Lorg/jetbrains/kotlin/ir/types/IrTypeAbbreviation;", "renderTypeAliasFqn", "Lorg/jetbrains/kotlin/ir/symbols/IrTypeAliasSymbol;", "renderTypeArgument", "Lorg/jetbrains/kotlin/ir/types/IrTypeArgument;", "renderTypeInner", "scoped", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIrSourcePrinter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IrSourcePrinter.kt\nandroidx/compose/compiler/plugins/kotlin/lower/IrSourcePrinterVisitor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 IrSourcePrinter.kt\nandroidx/compose/compiler/plugins/kotlin/lower/IrSourcePrinterKt\n*L\n1#1,1603:1\n177#1,4:1604\n165#1,10:1617\n183#1,2:1627\n177#1,11:1629\n177#1,2:1641\n179#1,2:1646\n165#1,7:1651\n177#1,4:1658\n173#1,2:1662\n177#1,4:1664\n177#1,4:1676\n183#1,2:1681\n177#1,2:1683\n183#1,2:1686\n177#1,11:1688\n179#1,9:1700\n177#1,4:1709\n177#1,2:1716\n165#1,7:1718\n177#1,4:1725\n173#1,2:1729\n165#1,7:1731\n177#1,4:1738\n173#1,2:1742\n179#1,2:1744\n183#1,2:1773\n177#1,11:1775\n183#1,2:1795\n177#1,11:1797\n183#1,2:1808\n177#1,2:1810\n165#1,10:1812\n165#1,10:1822\n179#1,9:1832\n183#1,2:1841\n177#1,11:1843\n177#1,4:1854\n177#1,4:1859\n177#1,4:1864\n1430#1:1868\n1430#1:1869\n1864#2,3:1608\n1864#2,3:1643\n1864#2,3:1648\n1864#2,3:1668\n1726#2,3:1671\n1864#2,2:1674\n1866#2:1680\n1855#2:1685\n1856#2:1699\n1747#2,3:1713\n1603#2,9:1746\n1855#2:1755\n1856#2:1757\n1612#2:1758\n288#2,2:1759\n1864#2,3:1761\n1747#2,3:1764\n766#2:1767\n857#2,2:1768\n766#2:1770\n857#2,2:1771\n1747#2,3:1786\n766#2:1789\n857#2,2:1790\n766#2:1792\n857#2,2:1793\n1855#2:1858\n1856#2:1863\n1549#2:1870\n1620#2,3:1871\n1549#2:1874\n1620#2,3:1875\n1177#3,6:1611\n1#4:1640\n1#4:1756\n1594#5,9:1878\n*S KotlinDebug\n*F\n+ 1 IrSourcePrinter.kt\nandroidx/compose/compiler/plugins/kotlin/lower/IrSourcePrinterVisitor\n*L\n184#1:1604,4\n227#1:1617,10\n277#1:1627,2\n277#1:1629,11\n549#1:1641,2\n549#1:1646,2\n593#1:1651,7\n603#1:1658,4\n593#1:1662,2\n643#1:1664,4\n771#1:1676,4\n781#1:1681,2\n781#1:1683,2\n791#1:1686,2\n791#1:1688,11\n781#1:1700,9\n808#1:1709,4\n1034#1:1716,2\n1035#1:1718,7\n1041#1:1725,4\n1035#1:1729,2\n1048#1:1731,7\n1053#1:1738,4\n1048#1:1742,2\n1034#1:1744,2\n1186#1:1773,2\n1186#1:1775,11\n1209#1:1795,2\n1209#1:1797,11\n1323#1:1808,2\n1323#1:1810,2\n1325#1:1812,10\n1326#1:1822,10\n1323#1:1832,9\n1339#1:1841,2\n1339#1:1843,11\n1373#1:1854,4\n1380#1:1859,4\n1388#1:1864,4\n1409#1:1868\n1454#1:1869\n190#1:1608,3\n550#1:1643,3\n561#1:1648,3\n707#1:1668,3\n736#1:1671,3\n739#1:1674,2\n739#1:1680\n782#1:1685\n782#1:1699\n942#1:1713,3\n1114#1:1746,9\n1114#1:1755\n1114#1:1757\n1114#1:1758\n1115#1:1759,2\n1163#1:1761,3\n1176#1:1764,3\n1183#1:1767\n1183#1:1768,2\n1184#1:1770\n1184#1:1771,2\n1200#1:1786,3\n1206#1:1789\n1206#1:1790,2\n1207#1:1792\n1207#1:1793,2\n1378#1:1858\n1378#1:1863\n1535#1:1870\n1535#1:1871,3\n1549#1:1874\n1549#1:1875,3\n202#1:1611,6\n1114#1:1756\n1561#1:1878,9\n*E\n"})
public final class IrSourcePrinterVisitor implements IrElementVisitorVoid {

    @NotNull
    private Scope currentScope;
    private boolean isInNotCall;
    private boolean printIntsAsBinary;

    @NotNull
    private final Printer printer;

    @NotNull
    private final Map<IrReturnTargetSymbol, IrFunctionAccessExpression> returnTargetToCall;
    private final boolean useFir;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IrTypeOperator.values().length];
            try {
                iArr[IrTypeOperator.IMPLICIT_COERCION_TO_UNIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IrTypeOperator.NOT_INSTANCEOF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IrTypeOperator.CAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IrTypeOperator.SAFE_CAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IrTypeOperator.IMPLICIT_CAST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IrTypeOperator.SAM_CONVERSION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IrTypeOperator.IMPLICIT_NOTNULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IrTypeOperator.INSTANCEOF.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IrSourcePrinterVisitor(@NotNull Appendable appendable, @NotNull String str, boolean z) {
        this.useFir = z;
        this.printer = new Printer(appendable, str);
        this.currentScope = new Scope(null, null, 3, null);
        this.returnTargetToCall = new LinkedHashMap();
    }

    private final void bracedBlock(Function0<Unit> body) {
        println("{");
        this.printer.pushIndent();
        body.invoke();
        this.printer.popIndent();
        println();
        println("}");
    }

    private final String buildTrimEnd(Function1<? super StringBuilder, Unit> fn) {
        StringBuilder sb = new StringBuilder();
        fn.invoke(sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return StringsKt__StringsKt.trimEnd((CharSequence) string).toString();
    }

    private final IrProperty correspondingProperty(IrClass irClass, IrValueParameter irValueParameter) {
        Object obj;
        boolean zAreEqual;
        IrExpressionBody initializer;
        List declarations = irClass.getDeclarations();
        ArrayList arrayList = new ArrayList();
        Iterator it = declarations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            IrDeclaration irDeclaration = (IrDeclaration) it.next();
            obj = irDeclaration instanceof IrProperty ? (IrProperty) irDeclaration : null;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : arrayList) {
            IrProperty irProperty = (IrProperty) obj2;
            if (Intrinsics.areEqual(irProperty.getName(), irValueParameter.getName())) {
                IrField backingField = irProperty.getBackingField();
                IrExpression expression = (backingField == null || (initializer = backingField.getInitializer()) == null) ? null : initializer.getExpression();
                IrGetValue irGetValue = expression instanceof IrGetValue ? (IrGetValue) expression : null;
                zAreEqual = Intrinsics.areEqual(irGetValue != null ? irGetValue.getOrigin() : null, IrStatementOrigin.INITIALIZE_PROPERTY_FROM_PARAMETER.INSTANCE);
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                obj = obj2;
                break;
            }
        }
        return (IrProperty) obj;
    }

    private final String getNormalizedName(IrValueDeclaration irValueDeclaration) {
        if (Intrinsics.areEqual(irValueDeclaration.getOrigin(), IrDeclarationOrigin.FOR_LOOP_ITERATOR.INSTANCE)) {
            return "<iterator>";
        }
        if (Intrinsics.areEqual(irValueDeclaration.getOrigin(), IrDeclarationOrigin.UNDERSCORE_PARAMETER.INSTANCE)) {
            return "<unused var>";
        }
        if (this.useFir || !StringsKt__StringsJVMKt.endsWith$default(irValueDeclaration.getName().asString(), "_elvis_lhs", false, 2, null)) {
            return (this.useFir || !Intrinsics.areEqual(irValueDeclaration.getName().asString(), "$this$null")) ? irValueDeclaration.getName().asString() : "<this>";
        }
        return "<elvis>";
    }

    private final List<String> getPlaceholderParameterNames(int expectedCount) {
        IntRange intRange = new IntRange(1, expectedCount);
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(intRange));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    private final List<String> getValueParameterNamesForDebug(IrMemberAccessExpression<?> irMemberAccessExpression) {
        int valueArgumentsCount = irMemberAccessExpression.getValueArgumentsCount();
        if (!irMemberAccessExpression.getSymbol().isBound()) {
            return getPlaceholderParameterNames(valueArgumentsCount);
        }
        IrFunction owner = irMemberAccessExpression.getSymbol().getOwner();
        if (!(owner instanceof IrFunction)) {
            return getPlaceholderParameterNames(valueArgumentsCount);
        }
        IntRange intRangeUntil = RangesKt.until(0, valueArgumentsCount);
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(intRangeUntil));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            IrFunction irFunction = owner;
            arrayList.add(iNextInt < irFunction.getValueParameters().size() ? getNormalizedName((IrValueDeclaration) irFunction.getValueParameters().get(iNextInt)) : String.valueOf(iNextInt + 1));
        }
        return arrayList;
    }

    private final void indented(Function0<Unit> body) {
        this.printer.pushIndent();
        body.invoke();
        this.printer.popIndent();
    }

    private final String intAsBinaryString(int value) {
        if (value == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        int i = value >= 0 ? value : ~value;
        String strOooO00o = "";
        while (true) {
            if (i == 0 && strOooO00o.length() % 4 == 0) {
                break;
            }
            boolean z = (i & 1) != 0;
            i >>>= 1;
            strOooO00o = OooOOOO.OooO00o(z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO, strOooO00o);
        }
        return o000oOoO.OooO0O0("0b", strOooO00o, value < 0 ? ".inv()" : "");
    }

    private final boolean isDelegatedPropertySetter(IrFunction irFunction) {
        return AdditionalIrUtilsKt.isSetter((IrDeclaration) irFunction) && Intrinsics.areEqual(irFunction.getOrigin(), IrDeclarationOrigin.DELEGATED_PROPERTY_ACCESSOR.INSTANCE);
    }

    private final boolean isLambda(IrFunction irFunction) {
        return Intrinsics.areEqual(irFunction.getName().asString(), "<anonymous>") || Intrinsics.areEqual(irFunction.getOrigin(), IrDeclarationOrigin.ADAPTER_FOR_CALLABLE_REFERENCE.INSTANCE);
    }

    private final boolean isLastStatementIn(IrExpression irExpression, List<? extends IrStatement> list) {
        IrBlock irBlock = (IrStatement) CollectionsKt.lastOrNull((List) list);
        if (irBlock == irExpression) {
            return true;
        }
        if (irBlock instanceof IrBlock) {
            return isLastStatementIn(irExpression, irBlock.getStatements());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void print(IrElement irElement) {
        irElement.accept((IrElementVisitor) this, (Object) null);
    }

    private final void printAnnotations(IrAnnotationContainer irAnnotationContainer, boolean z) {
        if (!irAnnotationContainer.getAnnotations().isEmpty()) {
            printJoin(irAnnotationContainer.getAnnotations(), z ? "\n" : ZegoConstants.ZegoVideoDataAuxPublishingStream);
            if (z) {
                println();
            } else {
                print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            }
        }
    }

    public static /* synthetic */ void printAnnotations$default(IrSourcePrinterVisitor irSourcePrinterVisitor, IrAnnotationContainer irAnnotationContainer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        irSourcePrinterVisitor.printAnnotations(irAnnotationContainer, z);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    private final void printArgumentList(IrFunctionAccessExpression irFunctionAccessExpression, boolean z, boolean z2) {
        boolean z3;
        IrReturnTargetSymbol irReturnTargetSymbolUnwrapLambda;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int valueArgumentsCount = irFunctionAccessExpression.getValueArgumentsCount();
        IrElement irElement = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= valueArgumentsCount) {
                break;
            }
            IrElement valueArgument = irFunctionAccessExpression.getValueArgument(i2);
            if (valueArgument != null) {
                IrValueDeclaration irValueDeclaration = (IrValueParameter) irFunctionAccessExpression.getSymbol().getOwner().getValueParameters().get(i2);
                if (!(valueArgument instanceof IrFunctionExpression)) {
                    if (valueArgument instanceof IrBlock) {
                        IrBlock irBlock = (IrBlock) valueArgument;
                        z3 = Intrinsics.areEqual(irBlock.getOrigin(), IrStatementOrigin.LAMBDA.INSTANCE) || Intrinsics.areEqual(irBlock.getOrigin(), IrStatementOrigin.ADAPTED_FUNCTION_REFERENCE.INSTANCE);
                    }
                }
                if (z3 && (irReturnTargetSymbolUnwrapLambda = IrInlineReferenceLocatorKt.unwrapLambda(valueArgument)) != null) {
                    this.returnTargetToCall.put(irReturnTargetSymbolUnwrapLambda, irFunctionAccessExpression);
                }
                if (i2 == irFunctionAccessExpression.getSymbol().getOwner().getValueParameters().size() - 1 && z3) {
                    irElement = valueArgument;
                } else {
                    arrayList.add(valueArgument);
                    arrayList2.add(getNormalizedName(irValueDeclaration));
                }
            } else {
                z = true;
            }
            i2++;
        }
        boolean z4 = (arrayList.isEmpty() ^ true) && z && !z2;
        if ((!arrayList.isEmpty()) || irElement == null) {
            print("(");
            if (z4) {
                println();
                this.printer.pushIndent();
                for (Object obj : CollectionsKt.zip(arrayList, arrayList2)) {
                    int i3 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Pair pair = (Pair) obj;
                    IrElement irElement2 = (IrExpression) pair.component1();
                    Object obj2 = (String) pair.component2();
                    if (z) {
                        print(obj2);
                        print(" = ");
                    }
                    print(irElement2);
                    if (i < arrayList.size() - 1) {
                        println(", ");
                    }
                    i = i3;
                }
                this.printer.popIndent();
                println();
            } else {
                for (Object obj3 : CollectionsKt.zip(arrayList, arrayList2)) {
                    int i4 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Pair pair2 = (Pair) obj3;
                    final IrElement irElement3 = (IrExpression) pair2.component1();
                    String str = (String) pair2.component2();
                    if (z) {
                        print(str);
                        print(" = ");
                    }
                    KtxNameConventions ktxNameConventions = KtxNameConventions.INSTANCE;
                    if (StringsKt__StringsJVMKt.startsWith$default(str, ktxNameConventions.getDEFAULT_PARAMETER().getIdentifier(), false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(str, ktxNameConventions.getCHANGED_PARAMETER().getIdentifier(), false, 2, null)) {
                        withIntsAsBinaryLiterals(new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor$printArgumentList$3$1
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
                                this.this$0.print(irElement3);
                            }
                        });
                    } else {
                        print(irElement3);
                    }
                    if (i < arrayList.size() - 1) {
                        print(", ");
                    }
                    i = i4;
                }
            }
            print(")");
        }
        if (irElement != null) {
            print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            print(irElement);
        }
    }

    public static /* synthetic */ void printArgumentList$default(IrSourcePrinterVisitor irSourcePrinterVisitor, IrFunctionAccessExpression irFunctionAccessExpression, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        irSourcePrinterVisitor.printArgumentList(irFunctionAccessExpression, z, z2);
    }

    private final void printExplicitReceiver(IrMemberAccessExpression<?> irMemberAccessExpression, String str) {
        IrGetValue dispatchReceiver = irMemberAccessExpression.getDispatchReceiver();
        IrGetValue extensionReceiver = irMemberAccessExpression.getExtensionReceiver();
        boolean z = (dispatchReceiver instanceof IrGetValue) && dispatchReceiver.getSymbol().getOwner().getName().isSpecial();
        boolean z2 = (extensionReceiver instanceof IrGetValue) && extensionReceiver.getSymbol().getOwner().getName().isSpecial();
        if (dispatchReceiver != null && !z) {
            print((IrElement) dispatchReceiver);
            if (str != null) {
                print(str);
                return;
            }
            return;
        }
        if (extensionReceiver == null || z2) {
            return;
        }
        print((IrElement) extensionReceiver);
        if (str != null) {
            print(str);
        }
    }

    public static /* synthetic */ void printExplicitReceiver$default(IrSourcePrinterVisitor irSourcePrinterVisitor, IrMemberAccessExpression irMemberAccessExpression, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        irSourcePrinterVisitor.printExplicitReceiver(irMemberAccessExpression, str);
    }

    private final void printJoin(List<? extends IrElement> list, String str) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            print((IrElement) obj);
            if (i < list.size() - 1) {
                print(str);
            }
            i = i2;
        }
    }

    public static /* synthetic */ void printJoin$default(IrSourcePrinterVisitor irSourcePrinterVisitor, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        irSourcePrinterVisitor.printJoin(list, str);
    }

    private final void printPropertyAccessor(IrFunction irFunction, boolean z) {
        if (Intrinsics.areEqual(irFunction.getOrigin(), IrDeclarationOrigin.DEFAULT_PROPERTY_ACCESSOR.INSTANCE)) {
            return;
        }
        println();
        printAnnotations$default(this, (IrAnnotationContainer) irFunction, false, 1, null);
        println();
        print(z ? "set" : "get");
        print("(");
        printJoin(irFunction.getValueParameters(), ", ");
        print(") ");
        println("{");
        this.printer.pushIndent();
        IrElement body = irFunction.getBody();
        if (body != null) {
            IrVisitorsKt.acceptVoid(body, this);
        }
        this.printer.popIndent();
        println();
        println("}");
    }

    public static /* synthetic */ void printPropertyAccessor$default(IrSourcePrinterVisitor irSourcePrinterVisitor, IrFunction irFunction, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = AdditionalIrUtilsKt.isSetter((IrDeclaration) irFunction);
        }
        irSourcePrinterVisitor.printPropertyAccessor(irFunction, z);
    }

    private final Printer println(Object obj) {
        return this.printer.println(new Object[]{obj});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String renderAsAnnotation(IrConstructorCall irAnnotation) {
        StringBuilder sb = new StringBuilder();
        renderAsAnnotation(sb, irAnnotation);
        return sb.toString();
    }

    private final void renderAsAnnotationArgument(StringBuilder sb, IrElement irElement) {
        if (irElement == null) {
            sb.append("<null>");
            return;
        }
        if (irElement instanceof IrConstructorCall) {
            renderAsAnnotation(sb, (IrConstructorCall) irElement);
            return;
        }
        if (irElement instanceof IrConst) {
            sb.append('\'');
            sb.append(String.valueOf(((IrConst) irElement).getValue()));
            sb.append('\'');
            return;
        }
        if (!(irElement instanceof IrVararg)) {
            irElement.accept((IrElementVisitor) this, (Object) null);
            sb.append(Unit.INSTANCE);
            return;
        }
        List elements = ((IrVararg) irElement).getElements();
        sb.append("[");
        boolean z = true;
        for (Object obj : elements) {
            if (!z) {
                sb.append(", ");
            }
            renderAsAnnotationArgument(sb, (IrElement) ((IrVarargElement) obj));
            z = false;
        }
        sb.append("]");
    }

    private final void renderDeclarationFqn(IrDeclaration irDeclaration, StringBuilder sb) {
        renderDeclarationParentFqn(irDeclaration, sb);
        sb.append('.');
        if (irDeclaration instanceof IrDeclarationWithName) {
            sb.append(((IrDeclarationWithName) irDeclaration).getName().asString());
        } else {
            sb.append(irDeclaration);
        }
    }

    private final void renderDeclarationParentFqn(IrDeclaration irDeclaration, StringBuilder sb) {
        try {
            IrPackageFragment parent = irDeclaration.getParent();
            if (parent instanceof IrDeclaration) {
                renderDeclarationFqn((IrDeclaration) parent, sb);
            } else if (parent instanceof IrPackageFragment) {
                sb.append(parent.getFqName().toString());
            }
        } catch (UninitializedPropertyAccessException unused) {
            sb.append("<uninitialized parent>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String renderSrc(IrType irType) {
        return OooOOOO.OooO00o(renderTypeAnnotations(irType.getAnnotations()), renderTypeInner(irType));
    }

    private final String renderTypeAbbreviation(IrTypeAbbreviation irTypeAbbreviation) {
        StringBuilder sb = new StringBuilder("{ ");
        sb.append(renderTypeAnnotations(irTypeAbbreviation.getAnnotations()));
        sb.append(renderTypeAliasFqn(irTypeAbbreviation.getTypeAlias()));
        if (!irTypeAbbreviation.getArguments().isEmpty()) {
            sb.append(CollectionsKt___CollectionsKt.joinToString$default(irTypeAbbreviation.getArguments(), ", ", "<", ">", 0, null, new Function1<IrTypeArgument, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor$renderTypeAbbreviation$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull IrTypeArgument irTypeArgument) {
                    return this.this$0.renderTypeArgument(irTypeArgument);
                }
            }, 24, null));
        }
        if (irTypeAbbreviation.getHasQuestionMark()) {
            sb.append('?');
        }
        sb.append(" }");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final String renderTypeAliasFqn(IrTypeAliasSymbol irTypeAliasSymbol) {
        if (irTypeAliasSymbol.isBound()) {
            StringBuilder sb = new StringBuilder();
            renderDeclarationFqn((IrDeclaration) irTypeAliasSymbol.getOwner(), sb);
            return sb.toString();
        }
        return "<unbound " + irTypeAliasSymbol + ": " + irTypeAliasSymbol.getDescriptor() + ">";
    }

    private final String renderTypeAnnotations(List<? extends IrConstructorCall> annotations) {
        return annotations.isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(annotations, ZegoConstants.ZegoVideoDataAuxPublishingStream, "", ZegoConstants.ZegoVideoDataAuxPublishingStream, 0, null, new Function1<IrConstructorCall, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor.renderTypeAnnotations.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull IrConstructorCall irConstructorCall) {
                return o000oOoO.OooO0O0("@[", IrSourcePrinterVisitor.this.renderAsAnnotation(irConstructorCall), "]");
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String renderTypeArgument(IrTypeArgument irTypeArgument) {
        if (irTypeArgument instanceof IrStarProjection) {
            return "*";
        }
        if (!(irTypeArgument instanceof IrTypeProjection)) {
            return "IrTypeArgument[" + irTypeArgument + "]";
        }
        StringBuilder sb = new StringBuilder();
        IrTypeProjection irTypeProjection = (IrTypeProjection) irTypeArgument;
        sb.append(irTypeProjection.getVariance().getLabel());
        if (irTypeProjection.getVariance() != Variance.INVARIANT) {
            sb.append(' ');
        }
        sb.append(renderSrc(irTypeProjection.getType()));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return StringsKt__StringsKt.trimEnd((CharSequence) string).toString();
    }

    private final String renderTypeInner(IrType irType) {
        if (irType instanceof IrDynamicType) {
            return "dynamic";
        }
        if (irType instanceof IrErrorType) {
            return "IrErrorType";
        }
        if (!(irType instanceof IrSimpleType)) {
            return "{" + irType.getClass().getSimpleName() + ZegoConstants.ZegoVideoDataAuxPublishingStream + irType + "}";
        }
        StringBuilder sb = new StringBuilder();
        IrSimpleType irSimpleType = (IrSimpleType) irType;
        IrDeclarationWithName owner = irSimpleType.getClassifier().getOwner();
        Intrinsics.checkNotNull(owner, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrDeclarationWithName");
        sb.append(owner.getName());
        if (!irSimpleType.getArguments().isEmpty()) {
            sb.append(CollectionsKt___CollectionsKt.joinToString$default(irSimpleType.getArguments(), ", ", "<", ">", 0, null, new Function1<IrTypeArgument, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor$renderTypeInner$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull IrTypeArgument irTypeArgument) {
                    return this.this$0.renderTypeArgument(irTypeArgument);
                }
            }, 24, null));
        }
        if (IrTypePredicatesKt.isMarkedNullable(irSimpleType)) {
            sb.append('?');
        }
        IrTypeAbbreviation abbreviation = irSimpleType.getAbbreviation();
        if (abbreviation != null) {
            sb.append(renderTypeAbbreviation(abbreviation));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return StringsKt__StringsKt.trimEnd((CharSequence) string).toString();
    }

    private final void scoped(IrFunction irFunction, Function1<? super IrFunction, Unit> function1) {
        Scope scope = this.currentScope;
        this.currentScope = new Scope(irFunction, new HashSet(irFunction.getValueParameters()));
        function1.invoke(irFunction);
        this.currentScope = scope;
    }

    public final void printAsLambda(@NotNull IrFunction irFunction) {
        Scope scope = this.currentScope;
        this.currentScope = new Scope(irFunction, new HashSet(irFunction.getValueParameters()));
        print("{");
        List<? extends IrElement> valueParameters = irFunction.getValueParameters();
        if (!valueParameters.isEmpty()) {
            print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            printJoin(valueParameters, ", ");
            println(" ->");
        } else {
            println();
        }
        this.printer.pushIndent();
        IrBody body = irFunction.getBody();
        if (body != null) {
            print((IrElement) body);
        }
        this.printer.popIndent();
        println();
        println("}");
        this.currentScope = scope;
    }

    public final void printAsObject(@NotNull IrClass irClass) {
        boolean z;
        print("object ");
        if (!irClass.getName().isSpecial()) {
            print(irClass.getName());
            print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        }
        List superTypes = irClass.getSuperTypes();
        if (!(superTypes instanceof Collection) || !superTypes.isEmpty()) {
            Iterator it = superTypes.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!IrTypePredicatesKt.isAny((IrType) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (z) {
            print(": ");
            print(CollectionsKt___CollectionsKt.joinToString$default(irClass.getSuperTypes(), ", ", null, null, 0, null, new Function1<IrType, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor.printAsObject.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull IrType irType) {
                    return IrSourcePrinterVisitor.this.renderSrc(irType);
                }
            }, 30, null));
            print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        }
        List declarations = irClass.getDeclarations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : declarations) {
            if (!(((IrDeclaration) obj) instanceof IrConstructor)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!Intrinsics.areEqual(((IrDeclaration) obj2).getOrigin(), IrDeclarationOrigin.FAKE_OVERRIDE.INSTANCE)) {
                arrayList2.add(obj2);
            }
        }
        if (!(!arrayList2.isEmpty())) {
            println();
            return;
        }
        println("{");
        this.printer.pushIndent();
        printJoin(arrayList2, "\n");
        this.printer.popIndent();
        println();
        println("}");
    }

    public final void printBody(@NotNull IrFunction irFunction) {
        IrBody body = irFunction.getBody();
        if (body == null) {
            return;
        }
        if (IrUtilsKt.getStatements(body).isEmpty()) {
            println("{ }");
            return;
        }
        println("{");
        this.printer.pushIndent();
        print((IrElement) body);
        this.printer.popIndent();
        println();
        println("}");
    }

    @NotNull
    public final String printType(@NotNull IrType type) {
        return renderSrc(type);
    }

    public /* bridge */ /* synthetic */ Object visitAnonymousInitializer(IrAnonymousInitializer irAnonymousInitializer, Object obj) {
        visitAnonymousInitializer(irAnonymousInitializer, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitBlock(IrBlock irBlock, Object obj) {
        visitBlock(irBlock, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitBlockBody(IrBlockBody irBlockBody, Object obj) {
        visitBlockBody(irBlockBody, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitBody(IrBody irBody, Object obj) {
        visitBody(irBody, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitBranch(IrBranch irBranch, Object obj) {
        visitBranch(irBranch, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitBreak(IrBreak irBreak, Object obj) {
        visitBreak(irBreak, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitBreakContinue(IrBreakContinue irBreakContinue, Object obj) {
        visitBreakContinue(irBreakContinue, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitCall(IrCall irCall, Object obj) {
        visitCall(irCall, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitCallableReference(IrCallableReference irCallableReference, Object obj) {
        visitCallableReference((IrCallableReference<?>) irCallableReference, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitCatch(IrCatch irCatch, Object obj) {
        visitCatch(irCatch, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitClass(IrClass irClass, Object obj) {
        visitClass(irClass, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitClassReference(IrClassReference irClassReference, Object obj) {
        visitClassReference(irClassReference, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitComposite(IrComposite irComposite, Object obj) {
        visitComposite(irComposite, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitConst(IrConst irConst, Object obj) {
        visitConst((IrConst<?>) irConst, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitConstantArray(IrConstantArray irConstantArray, Object obj) {
        visitConstantArray(irConstantArray, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitConstantObject(IrConstantObject irConstantObject, Object obj) {
        visitConstantObject(irConstantObject, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitConstantPrimitive(IrConstantPrimitive irConstantPrimitive, Object obj) {
        visitConstantPrimitive(irConstantPrimitive, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitConstantValue(IrConstantValue irConstantValue, Object obj) {
        visitConstantValue(irConstantValue, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitConstructor(IrConstructor irConstructor, Object obj) {
        visitConstructor(irConstructor, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitConstructorCall(IrConstructorCall irConstructorCall, Object obj) {
        visitConstructorCall(irConstructorCall, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitContainerExpression(IrContainerExpression irContainerExpression, Object obj) {
        visitContainerExpression(irContainerExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitContinue(IrContinue irContinue, Object obj) {
        visitContinue(irContinue, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitDeclaration(IrDeclarationBase irDeclarationBase, Object obj) {
        visitDeclaration(irDeclarationBase, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitDeclarationReference(IrDeclarationReference irDeclarationReference, Object obj) {
        visitDeclarationReference(irDeclarationReference, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitDelegatingConstructorCall(IrDelegatingConstructorCall irDelegatingConstructorCall, Object obj) {
        visitDelegatingConstructorCall(irDelegatingConstructorCall, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitDoWhileLoop(IrDoWhileLoop irDoWhileLoop, Object obj) {
        visitDoWhileLoop(irDoWhileLoop, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitDynamicExpression(IrDynamicExpression irDynamicExpression, Object obj) {
        visitDynamicExpression(irDynamicExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitDynamicMemberExpression(IrDynamicMemberExpression irDynamicMemberExpression, Object obj) {
        visitDynamicMemberExpression(irDynamicMemberExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitDynamicOperatorExpression(IrDynamicOperatorExpression irDynamicOperatorExpression, Object obj) {
        visitDynamicOperatorExpression(irDynamicOperatorExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitElement(IrElement irElement, Object obj) {
        visitElement(irElement, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitElseBranch(IrElseBranch irElseBranch, Object obj) {
        visitElseBranch(irElseBranch, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitEnumConstructorCall(IrEnumConstructorCall irEnumConstructorCall, Object obj) {
        visitEnumConstructorCall(irEnumConstructorCall, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitEnumEntry(IrEnumEntry irEnumEntry, Object obj) {
        visitEnumEntry(irEnumEntry, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitErrorCallExpression(IrErrorCallExpression irErrorCallExpression, Object obj) {
        visitErrorCallExpression(irErrorCallExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitErrorDeclaration(IrErrorDeclaration irErrorDeclaration, Object obj) {
        visitErrorDeclaration(irErrorDeclaration, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitErrorExpression(IrErrorExpression irErrorExpression, Object obj) {
        visitErrorExpression(irErrorExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitExpression(IrExpression irExpression, Object obj) {
        visitExpression(irExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitExpressionBody(IrExpressionBody irExpressionBody, Object obj) {
        visitExpressionBody(irExpressionBody, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitExternalPackageFragment(IrExternalPackageFragment irExternalPackageFragment, Object obj) {
        visitExternalPackageFragment(irExternalPackageFragment, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitField(IrField irField, Object obj) {
        visitField(irField, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitFieldAccess(IrFieldAccessExpression irFieldAccessExpression, Object obj) {
        visitFieldAccess(irFieldAccessExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitFile(IrFile irFile, Object obj) {
        visitFile(irFile, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitFunction(IrFunction irFunction, Object obj) {
        visitFunction(irFunction, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitFunctionAccess(IrFunctionAccessExpression irFunctionAccessExpression, Object obj) {
        visitFunctionAccess(irFunctionAccessExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitFunctionExpression(IrFunctionExpression irFunctionExpression, Object obj) {
        visitFunctionExpression(irFunctionExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitFunctionReference(IrFunctionReference irFunctionReference, Object obj) {
        visitFunctionReference(irFunctionReference, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitGetClass(IrGetClass irGetClass, Object obj) {
        visitGetClass(irGetClass, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitGetEnumValue(IrGetEnumValue irGetEnumValue, Object obj) {
        visitGetEnumValue(irGetEnumValue, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitGetField(IrGetField irGetField, Object obj) {
        visitGetField(irGetField, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitGetObjectValue(IrGetObjectValue irGetObjectValue, Object obj) {
        visitGetObjectValue(irGetObjectValue, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitGetValue(IrGetValue irGetValue, Object obj) {
        visitGetValue(irGetValue, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitInstanceInitializerCall(IrInstanceInitializerCall irInstanceInitializerCall, Object obj) {
        visitInstanceInitializerCall(irInstanceInitializerCall, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitLocalDelegatedProperty(IrLocalDelegatedProperty irLocalDelegatedProperty, Object obj) {
        visitLocalDelegatedProperty(irLocalDelegatedProperty, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitLocalDelegatedPropertyReference(IrLocalDelegatedPropertyReference irLocalDelegatedPropertyReference, Object obj) {
        visitLocalDelegatedPropertyReference(irLocalDelegatedPropertyReference, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitLoop(IrLoop irLoop, Object obj) {
        visitLoop(irLoop, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitMemberAccess(IrMemberAccessExpression irMemberAccessExpression, Object obj) {
        visitMemberAccess((IrMemberAccessExpression<?>) irMemberAccessExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitModuleFragment(IrModuleFragment irModuleFragment, Object obj) {
        visitModuleFragment(irModuleFragment, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitPackageFragment(IrPackageFragment irPackageFragment, Object obj) {
        visitPackageFragment(irPackageFragment, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitProperty(IrProperty irProperty, Object obj) {
        visitProperty(irProperty, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitPropertyReference(IrPropertyReference irPropertyReference, Object obj) {
        visitPropertyReference(irPropertyReference, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitRawFunctionReference(IrRawFunctionReference irRawFunctionReference, Object obj) {
        visitRawFunctionReference(irRawFunctionReference, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitReturn(IrReturn irReturn, Object obj) {
        visitReturn(irReturn, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitScript(IrScript irScript, Object obj) {
        visitScript(irScript, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitSetField(IrSetField irSetField, Object obj) {
        visitSetField(irSetField, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitSetValue(IrSetValue irSetValue, Object obj) {
        visitSetValue(irSetValue, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitSimpleFunction(IrSimpleFunction irSimpleFunction, Object obj) {
        visitSimpleFunction(irSimpleFunction, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitSingletonReference(IrGetSingletonValue irGetSingletonValue, Object obj) {
        visitSingletonReference(irGetSingletonValue, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitSpreadElement(IrSpreadElement irSpreadElement, Object obj) {
        visitSpreadElement(irSpreadElement, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitStringConcatenation(IrStringConcatenation irStringConcatenation, Object obj) {
        visitStringConcatenation(irStringConcatenation, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitSuspendableExpression(IrSuspendableExpression irSuspendableExpression, Object obj) {
        visitSuspendableExpression(irSuspendableExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitSuspensionPoint(IrSuspensionPoint irSuspensionPoint, Object obj) {
        visitSuspensionPoint(irSuspensionPoint, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitSyntheticBody(IrSyntheticBody irSyntheticBody, Object obj) {
        visitSyntheticBody(irSyntheticBody, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitThrow(IrThrow irThrow, Object obj) {
        visitThrow(irThrow, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitTry(IrTry irTry, Object obj) {
        visitTry(irTry, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitTypeAlias(IrTypeAlias irTypeAlias, Object obj) {
        visitTypeAlias(irTypeAlias, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitTypeOperator(IrTypeOperatorCall irTypeOperatorCall, Object obj) {
        visitTypeOperator(irTypeOperatorCall, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitTypeParameter(IrTypeParameter irTypeParameter, Object obj) {
        visitTypeParameter(irTypeParameter, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitValueAccess(IrValueAccessExpression irValueAccessExpression, Object obj) {
        visitValueAccess(irValueAccessExpression, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitValueParameter(IrValueParameter irValueParameter, Object obj) {
        visitValueParameter(irValueParameter, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitVararg(IrVararg irVararg, Object obj) {
        visitVararg(irVararg, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitVariable(IrVariable irVariable, Object obj) {
        visitVariable(irVariable, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitWhen(IrWhen irWhen, Object obj) {
        visitWhen(irWhen, (Void) obj);
        return Unit.INSTANCE;
    }

    public /* bridge */ /* synthetic */ Object visitWhileLoop(IrWhileLoop irWhileLoop, Object obj) {
        visitWhileLoop(irWhileLoop, (Void) obj);
        return Unit.INSTANCE;
    }

    public final <T> T withIntsAsBinaryLiterals(@NotNull Function0<? extends T> block) {
        boolean z = this.printIntsAsBinary;
        try {
            this.printIntsAsBinary = true;
            return block.invoke();
        } finally {
            this.printIntsAsBinary = z;
        }
    }

    private final Printer print(Object obj) {
        return this.printer.print(new Object[]{obj});
    }

    private final Printer println() {
        return this.printer.println(new Object[0]);
    }

    private final void renderAsAnnotation(StringBuilder sb, IrConstructorCall irConstructorCall) {
        String strAsString;
        try {
            strAsString = IrUtilsKt.getParentAsClass(irConstructorCall.getSymbol().getOwner()).getName().asString();
        } catch (Exception unused) {
            strAsString = "<unbound>";
        }
        sb.append(strAsString);
        if (irConstructorCall.getValueArgumentsCount() == 0) {
            return;
        }
        List<String> valueParameterNamesForDebug = getValueParameterNamesForDebug((IrMemberAccessExpression) irConstructorCall);
        sb.append("(");
        int valueArgumentsCount = irConstructorCall.getValueArgumentsCount();
        boolean z = true;
        for (int i = 0; i < valueArgumentsCount; i++) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(valueParameterNamesForDebug.get(i));
            sb.append(" = ");
            renderAsAnnotationArgument(sb, (IrElement) irConstructorCall.getValueArgument(i));
        }
        sb.append(")");
    }

    public void visitAnonymousInitializer(@NotNull IrAnonymousInitializer irAnonymousInitializer) {
        IrElementVisitorVoid.DefaultImpls.visitAnonymousInitializer(this, irAnonymousInitializer);
    }

    public void visitBlock(@NotNull IrBlock irBlock, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitBlock(this, irBlock, r2);
    }

    public void visitBlockBody(@NotNull IrBlockBody irBlockBody, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitBlockBody(this, irBlockBody, r2);
    }

    public void visitBody(@NotNull IrBody irBody) {
        IrElementVisitorVoid.DefaultImpls.visitBody(this, irBody);
    }

    public void visitBranch(@NotNull IrBranch irBranch, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitBranch(this, irBranch, r2);
    }

    public void visitBreak(@NotNull IrBreak irBreak, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitBreak(this, irBreak, r2);
    }

    public void visitBreakContinue(@NotNull IrBreakContinue irBreakContinue, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitBreakContinue(this, irBreakContinue, r2);
    }

    public void visitCall(@NotNull IrCall irCall, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitCall(this, irCall, r2);
    }

    public void visitCallableReference(@NotNull IrCallableReference<?> irCallableReference) {
        IrElementVisitorVoid.DefaultImpls.visitCallableReference(this, irCallableReference);
    }

    public void visitCatch(@NotNull IrCatch irCatch, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitCatch(this, irCatch, r2);
    }

    public void visitClass(@NotNull IrClass irClass, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitClass(this, irClass, r2);
    }

    public void visitClassReference(@NotNull IrClassReference irClassReference, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitClassReference(this, irClassReference, r2);
    }

    public void visitComposite(@NotNull IrComposite irComposite, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitComposite(this, irComposite, r2);
    }

    public void visitConst(@NotNull IrConst<?> irConst, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitConst(this, irConst, r2);
    }

    public void visitConstantArray(@NotNull IrConstantArray irConstantArray) {
        IrElementVisitorVoid.DefaultImpls.visitConstantArray(this, irConstantArray);
    }

    public void visitConstantObject(@NotNull IrConstantObject irConstantObject) {
        IrElementVisitorVoid.DefaultImpls.visitConstantObject(this, irConstantObject);
    }

    public void visitConstantPrimitive(@NotNull IrConstantPrimitive irConstantPrimitive) {
        IrElementVisitorVoid.DefaultImpls.visitConstantPrimitive(this, irConstantPrimitive);
    }

    public void visitConstantValue(@NotNull IrConstantValue irConstantValue) {
        IrElementVisitorVoid.DefaultImpls.visitConstantValue(this, irConstantValue);
    }

    public void visitConstructor(@NotNull IrConstructor irConstructor, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitConstructor(this, irConstructor, r2);
    }

    public void visitConstructorCall(@NotNull IrConstructorCall irConstructorCall, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitConstructorCall(this, irConstructorCall, r2);
    }

    public void visitContainerExpression(@NotNull IrContainerExpression irContainerExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitContainerExpression(this, irContainerExpression, r2);
    }

    public void visitContinue(@NotNull IrContinue irContinue, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitContinue(this, irContinue, r2);
    }

    public void visitDeclaration(@NotNull IrDeclarationBase irDeclarationBase) {
        IrElementVisitorVoid.DefaultImpls.visitDeclaration(this, irDeclarationBase);
    }

    public void visitDeclarationReference(@NotNull IrDeclarationReference irDeclarationReference) {
        IrElementVisitorVoid.DefaultImpls.visitDeclarationReference(this, irDeclarationReference);
    }

    public void visitDelegatingConstructorCall(@NotNull IrDelegatingConstructorCall irDelegatingConstructorCall, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitDelegatingConstructorCall(this, irDelegatingConstructorCall, r2);
    }

    public void visitDoWhileLoop(@NotNull IrDoWhileLoop irDoWhileLoop, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitDoWhileLoop(this, irDoWhileLoop, r2);
    }

    public void visitDynamicExpression(@NotNull IrDynamicExpression irDynamicExpression) {
        IrElementVisitorVoid.DefaultImpls.visitDynamicExpression(this, irDynamicExpression);
    }

    public void visitDynamicMemberExpression(@NotNull IrDynamicMemberExpression irDynamicMemberExpression) {
        IrElementVisitorVoid.DefaultImpls.visitDynamicMemberExpression(this, irDynamicMemberExpression);
    }

    public void visitDynamicOperatorExpression(@NotNull IrDynamicOperatorExpression irDynamicOperatorExpression) {
        IrElementVisitorVoid.DefaultImpls.visitDynamicOperatorExpression(this, irDynamicOperatorExpression);
    }

    public void visitElement(@NotNull IrElement irElement, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitElement(this, irElement, r2);
    }

    public void visitElseBranch(@NotNull IrElseBranch irElseBranch, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitElseBranch(this, irElseBranch, r2);
    }

    public void visitEnumConstructorCall(@NotNull IrEnumConstructorCall irEnumConstructorCall) {
        IrElementVisitorVoid.DefaultImpls.visitEnumConstructorCall(this, irEnumConstructorCall);
    }

    public void visitEnumEntry(@NotNull IrEnumEntry irEnumEntry) {
        IrElementVisitorVoid.DefaultImpls.visitEnumEntry(this, irEnumEntry);
    }

    public void visitErrorCallExpression(@NotNull IrErrorCallExpression irErrorCallExpression) {
        IrElementVisitorVoid.DefaultImpls.visitErrorCallExpression(this, irErrorCallExpression);
    }

    public void visitErrorDeclaration(@NotNull IrErrorDeclaration irErrorDeclaration) {
        IrElementVisitorVoid.DefaultImpls.visitErrorDeclaration(this, irErrorDeclaration);
    }

    public void visitErrorExpression(@NotNull IrErrorExpression irErrorExpression) {
        IrElementVisitorVoid.DefaultImpls.visitErrorExpression(this, irErrorExpression);
    }

    public void visitExpression(@NotNull IrExpression irExpression) {
        IrElementVisitorVoid.DefaultImpls.visitExpression(this, irExpression);
    }

    public void visitExpressionBody(@NotNull IrExpressionBody irExpressionBody, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitExpressionBody(this, irExpressionBody, r2);
    }

    public void visitExternalPackageFragment(@NotNull IrExternalPackageFragment irExternalPackageFragment) {
        IrElementVisitorVoid.DefaultImpls.visitExternalPackageFragment(this, irExternalPackageFragment);
    }

    public void visitField(@NotNull IrField irField, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitField(this, irField, r2);
    }

    public void visitFieldAccess(@NotNull IrFieldAccessExpression irFieldAccessExpression) {
        IrElementVisitorVoid.DefaultImpls.visitFieldAccess(this, irFieldAccessExpression);
    }

    public void visitFile(@NotNull IrFile irFile, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitFile(this, irFile, r2);
    }

    public void visitFunction(@NotNull IrFunction irFunction, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitFunction(this, irFunction, r2);
    }

    public void visitFunctionAccess(@NotNull IrFunctionAccessExpression irFunctionAccessExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitFunctionAccess(this, irFunctionAccessExpression, r2);
    }

    public void visitFunctionExpression(@NotNull IrFunctionExpression irFunctionExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitFunctionExpression(this, irFunctionExpression, r2);
    }

    public void visitFunctionReference(@NotNull IrFunctionReference irFunctionReference, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitFunctionReference(this, irFunctionReference, r2);
    }

    public void visitGetClass(@NotNull IrGetClass irGetClass) {
        IrElementVisitorVoid.DefaultImpls.visitGetClass(this, irGetClass);
    }

    public void visitGetEnumValue(@NotNull IrGetEnumValue irGetEnumValue, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitGetEnumValue(this, irGetEnumValue, r2);
    }

    public void visitGetField(@NotNull IrGetField irGetField, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitGetField(this, irGetField, r2);
    }

    public void visitGetObjectValue(@NotNull IrGetObjectValue irGetObjectValue, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitGetObjectValue(this, irGetObjectValue, r2);
    }

    public void visitGetValue(@NotNull IrGetValue irGetValue, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitGetValue(this, irGetValue, r2);
    }

    public void visitInstanceInitializerCall(@NotNull IrInstanceInitializerCall irInstanceInitializerCall, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitInstanceInitializerCall(this, irInstanceInitializerCall, r2);
    }

    public void visitLocalDelegatedProperty(@NotNull IrLocalDelegatedProperty irLocalDelegatedProperty, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitLocalDelegatedProperty(this, irLocalDelegatedProperty, r2);
    }

    public void visitLocalDelegatedPropertyReference(@NotNull IrLocalDelegatedPropertyReference irLocalDelegatedPropertyReference, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitLocalDelegatedPropertyReference(this, irLocalDelegatedPropertyReference, r2);
    }

    public void visitLoop(@NotNull IrLoop irLoop, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitLoop(this, irLoop, r2);
    }

    public void visitMemberAccess(@NotNull IrMemberAccessExpression<?> irMemberAccessExpression) {
        IrElementVisitorVoid.DefaultImpls.visitMemberAccess(this, irMemberAccessExpression);
    }

    public void visitModuleFragment(@NotNull IrModuleFragment irModuleFragment, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitModuleFragment(this, irModuleFragment, r2);
    }

    public void visitPackageFragment(@NotNull IrPackageFragment irPackageFragment) {
        IrElementVisitorVoid.DefaultImpls.visitPackageFragment(this, irPackageFragment);
    }

    public void visitProperty(@NotNull IrProperty irProperty, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitProperty(this, irProperty, r2);
    }

    public void visitPropertyReference(@NotNull IrPropertyReference irPropertyReference, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitPropertyReference(this, irPropertyReference, r2);
    }

    public void visitRawFunctionReference(@NotNull IrRawFunctionReference irRawFunctionReference) {
        IrElementVisitorVoid.DefaultImpls.visitRawFunctionReference(this, irRawFunctionReference);
    }

    public void visitReturn(@NotNull IrReturn irReturn, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitReturn(this, irReturn, r2);
    }

    public void visitScript(@NotNull IrScript irScript) {
        IrElementVisitorVoid.DefaultImpls.visitScript(this, irScript);
    }

    public void visitSetField(@NotNull IrSetField irSetField, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitSetField(this, irSetField, r2);
    }

    public void visitSetValue(@NotNull IrSetValue irSetValue, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitSetValue(this, irSetValue, r2);
    }

    public void visitSimpleFunction(@NotNull IrSimpleFunction irSimpleFunction, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitSimpleFunction(this, irSimpleFunction, r2);
    }

    public void visitSingletonReference(@NotNull IrGetSingletonValue irGetSingletonValue) {
        IrElementVisitorVoid.DefaultImpls.visitSingletonReference(this, irGetSingletonValue);
    }

    public void visitSpreadElement(@NotNull IrSpreadElement irSpreadElement, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitSpreadElement(this, irSpreadElement, r2);
    }

    public void visitStringConcatenation(@NotNull IrStringConcatenation irStringConcatenation, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitStringConcatenation(this, irStringConcatenation, r2);
    }

    public void visitSuspendableExpression(@NotNull IrSuspendableExpression irSuspendableExpression) {
        IrElementVisitorVoid.DefaultImpls.visitSuspendableExpression(this, irSuspendableExpression);
    }

    public void visitSuspensionPoint(@NotNull IrSuspensionPoint irSuspensionPoint) {
        IrElementVisitorVoid.DefaultImpls.visitSuspensionPoint(this, irSuspensionPoint);
    }

    public void visitSyntheticBody(@NotNull IrSyntheticBody irSyntheticBody) {
        IrElementVisitorVoid.DefaultImpls.visitSyntheticBody(this, irSyntheticBody);
    }

    public void visitThrow(@NotNull IrThrow irThrow, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitThrow(this, irThrow, r2);
    }

    public void visitTry(@NotNull IrTry irTry, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitTry(this, irTry, r2);
    }

    public void visitTypeAlias(@NotNull IrTypeAlias irTypeAlias, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitTypeAlias(this, irTypeAlias, r2);
    }

    public void visitTypeOperator(@NotNull IrTypeOperatorCall irTypeOperatorCall, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitTypeOperator(this, irTypeOperatorCall, r2);
    }

    public void visitTypeParameter(@NotNull IrTypeParameter irTypeParameter, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitTypeParameter(this, irTypeParameter, r2);
    }

    public void visitValueAccess(@NotNull IrValueAccessExpression irValueAccessExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitValueAccess(this, irValueAccessExpression, r2);
    }

    public void visitValueParameter(@NotNull IrValueParameter irValueParameter, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitValueParameter(this, irValueParameter, r2);
    }

    public void visitVararg(@NotNull IrVararg irVararg, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitVararg(this, irVararg, r2);
    }

    public void visitVariable(@NotNull IrVariable irVariable, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitVariable(this, irVariable, r2);
    }

    public void visitWhen(@NotNull IrWhen irWhen, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitWhen(this, irWhen, r2);
    }

    public void visitWhileLoop(@NotNull IrWhileLoop irWhileLoop, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitWhileLoop(this, irWhileLoop, r2);
    }

    private final boolean isLastStatementIn(IrExpression irExpression, IrFunction irFunction) {
        IrBody body = irFunction.getBody();
        if (body != null) {
            return isLastStatementIn(irExpression, IrUtilsKt.getStatements(body));
        }
        return false;
    }

    public void visitAnonymousInitializer(@NotNull IrAnonymousInitializer irAnonymousInitializer, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitAnonymousInitializer(this, irAnonymousInitializer, r2);
    }

    public void visitBlock(@NotNull IrBlock expression) {
        IrStatementOrigin origin = expression.getOrigin();
        if (Intrinsics.areEqual(origin, IrStatementOrigin.POSTFIX_INCR.INSTANCE)) {
            Object obj = expression.getStatements().get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrVariable");
            IrExpression initializer = ((IrVariable) obj).getInitializer();
            if (initializer != null) {
                print((IrElement) initializer);
                print("++");
                return;
            }
            throw new IllegalStateException("Expected initializer".toString());
        }
        if (Intrinsics.areEqual(origin, IrStatementOrigin.POSTFIX_DECR.INSTANCE)) {
            Object obj2 = expression.getStatements().get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrVariable");
            IrExpression initializer2 = ((IrVariable) obj2).getInitializer();
            if (initializer2 != null) {
                print((IrElement) initializer2);
                print("--");
                return;
            }
            throw new IllegalStateException("Expected initializer".toString());
        }
        if (Intrinsics.areEqual(origin, IrStatementOrigin.LAMBDA.INSTANCE) ? true : Intrinsics.areEqual(origin, IrStatementOrigin.ADAPTED_FUNCTION_REFERENCE.INSTANCE)) {
            Object obj3 = expression.getStatements().get(0);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrFunction");
            printAsLambda((IrFunction) obj3);
            return;
        }
        if (Intrinsics.areEqual(origin, IrStatementOrigin.OBJECT_LITERAL.INSTANCE)) {
            Object obj4 = expression.getStatements().get(0);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrClass");
            printAsObject((IrClass) obj4);
            return;
        }
        if (Intrinsics.areEqual(origin, IrStatementOrigin.SAFE_CALL.INSTANCE)) {
            Object obj5 = expression.getStatements().get(0);
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrVariable");
            IrVariable irVariable = (IrVariable) obj5;
            IrStatement initializer3 = (IrStatement) expression.getStatements().get(1);
            if (initializer3 instanceof IrBlock) {
                initializer3 = (IrStatement) ((IrBlock) initializer3).getStatements().get(1);
                if (initializer3 instanceof IrVariable) {
                    initializer3 = ((IrVariable) initializer3).getInitializer();
                }
            }
            Intrinsics.checkNotNull(initializer3, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrWhen");
            IrCall result = ((IrBranch) CollectionsKt.last(((IrWhen) initializer3).getBranches())).getResult();
            IrCall irCall = result instanceof IrCall ? result : null;
            if (irCall == null) {
                printJoin(expression.getStatements(), "\n");
                return;
            }
            IrExpression initializer4 = irVariable.getInitializer();
            if (initializer4 != null) {
                print((IrElement) initializer4);
            }
            print("?.");
            print(irCall.getSymbol().getOwner().getName());
            printArgumentList$default(this, (IrFunctionAccessExpression) irCall, false, false, 3, null);
            return;
        }
        if (Intrinsics.areEqual(origin, IrStatementOrigin.FOR_LOOP.INSTANCE)) {
            printJoin(expression.getStatements(), "\n");
        } else {
            printJoin(expression.getStatements(), "\n");
        }
    }

    public void visitBlockBody(@NotNull IrBlockBody body) {
        printJoin(body.getStatements(), "\n");
    }

    public void visitBody(@NotNull IrBody irBody, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitBody(this, irBody, r2);
    }

    public void visitBranch(@NotNull IrBranch branch) {
        print("<<BRANCH>>");
    }

    public void visitBreak(@NotNull IrBreak jump) {
        print("break");
        if (jump.getLabel() != null) {
            print("@");
            print(jump.getLabel());
        }
    }

    public void visitBreakContinue(@NotNull IrBreakContinue jump) {
        print("<<BREAKCONTINUE>>");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:191:0x0355  */
    /* JADX WARN: Code duplicated, block: B:202:0x036e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0374  */
    /* JADX WARN: Code duplicated, block: B:207:0x0382  */
    /* JADX WARN: Code duplicated, block: B:212:0x0391  */
    /* JADX WARN: Code duplicated, block: B:215:0x0395  */
    /* JADX WARN: Code duplicated, block: B:217:0x039b  */
    /* JADX WARN: Code duplicated, block: B:222:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:224:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:225:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:227:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:229:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:234:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:241:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:242:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:245:0x0400  */
    /* JADX WARN: Code duplicated, block: B:248:0x0407  */
    /* JADX WARN: Code duplicated, block: B:251:0x040e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0415  */
    /* JADX WARN: Code duplicated, block: B:255:0x041f  */
    /* JADX WARN: Code duplicated, block: B:258:0x0426  */
    /* JADX WARN: Code duplicated, block: B:260:0x042c  */
    /* JADX WARN: Code duplicated, block: B:262:0x0432  */
    /* JADX WARN: Code duplicated, block: B:264:0x044d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0457  */
    /* JADX WARN: Code duplicated, block: B:270:0x0463  */
    /* JADX WARN: Code duplicated, block: B:273:0x046d  */
    /* JADX WARN: Code duplicated, block: B:276:0x0477  */
    /* JADX WARN: Code duplicated, block: B:279:0x0481  */
    /* JADX WARN: Code duplicated, block: B:282:0x048b  */
    /* JADX WARN: Code duplicated, block: B:285:0x0495  */
    /* JADX WARN: Code duplicated, block: B:288:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:291:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:294:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:296:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:298:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:301:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:305:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:308:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:310:0x0501  */
    /* JADX WARN: Code duplicated, block: B:312:0x0507  */
    /* JADX WARN: Code duplicated, block: B:313:0x050e  */
    /* JADX WARN: Code duplicated, block: B:316:0x051a  */
    /* JADX WARN: Code duplicated, block: B:319:0x0525  */
    /* JADX WARN: Code duplicated, block: B:321:0x052b  */
    /* JADX WARN: Code duplicated, block: B:324:0x053a  */
    /* JADX WARN: Code duplicated, block: B:326:0x0540  */
    /* JADX WARN: Code duplicated, block: B:329:0x054f  */
    /* JADX WARN: Code duplicated, block: B:332:0x055a  */
    /* JADX WARN: Code duplicated, block: B:334:0x0560  */
    /* JADX WARN: Code duplicated, block: B:336:0x0566  */
    /* JADX WARN: Code duplicated, block: B:338:0x0570  */
    /* JADX WARN: Code duplicated, block: B:341:0x057b  */
    /* JADX WARN: Code duplicated, block: B:343:0x0585 A[PHI: r0
      0x0585: PHI (r0v120 java.lang.Object) = 
      (r0v81 java.lang.Object)
      (r0v82 java.lang.Object)
      (r0v83 java.lang.Object)
      (r0v84 java.lang.Object)
      (r0v93 java.lang.Object)
      (r0v94 java.lang.Object)
      (r0v95 java.lang.Object)
      (r0v107 java.lang.Object)
      (r0v108 java.lang.Object)
      (r0v109 java.lang.Object)
      (r0v110 java.lang.Object)
      (r0v111 java.lang.Object)
      (r0v112 java.lang.Object)
      (r0v113 java.lang.Object)
      (r0v118 java.lang.Object)
      (r0v122 java.lang.Object)
     binds: [B:342:0x0583, B:339:0x0578, B:330:0x0557, B:317:0x0522, B:314:0x0516, B:306:0x04f4, B:292:0x04b5, B:289:0x04a9, B:286:0x049d, B:283:0x0491, B:280:0x0487, B:277:0x047d, B:274:0x0473, B:271:0x0469, B:268:0x045f, B:265:0x0453] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:344:0x0588 A[PHI: r0
      0x0588: PHI (r0v121 java.lang.Object) = (r0v81 java.lang.Object), (r0v109 java.lang.Object), (r0v113 java.lang.Object), (r0v122 java.lang.Object) binds: [B:342:0x0583, B:283:0x0491, B:271:0x0469, B:265:0x0453] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:346:0x058e  */
    /* JADX WARN: Code duplicated, block: B:348:0x0594  */
    /* JADX WARN: Code duplicated, block: B:350:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:353:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:355:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:357:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:359:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:361:0x05de A[PHI: r0
      0x05de: PHI (r0v119 java.lang.Object) = (r0v74 java.lang.Object), (r0v75 java.lang.Object), (r0v120 java.lang.Object) binds: [B:360:0x05dc, B:351:0x05b0, B:343:0x0585] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:362:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:364:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:367:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:371:0x060d  */
    /* JADX WARN: Code duplicated, block: B:373:0x0613  */
    /* JADX WARN: Code duplicated, block: B:375:0x0619  */
    /* JADX WARN: Code duplicated, block: B:377:0x0628  */
    /* JADX WARN: Code duplicated, block: B:379:0x062e  */
    /* JADX WARN: Code duplicated, block: B:381:0x0634  */
    /* JADX WARN: Code duplicated, block: B:384:0x0647  */
    /* JADX WARN: Code duplicated, block: B:387:0x0651  */
    /* JADX WARN: Code duplicated, block: B:439:0x0545 A[SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:371:0x060d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void visitCall(@org.jetbrains.annotations.NotNull org.jetbrains.kotlin.ir.expressions.IrCall r33) {
        /*
            Method dump skipped, instruction units count: 2062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor.visitCall(org.jetbrains.kotlin.ir.expressions.IrCall):void");
    }

    public void visitCallableReference(@NotNull IrCallableReference<?> irCallableReference, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitCallableReference(this, irCallableReference, r2);
    }

    public void visitCatch(@NotNull IrCatch aCatch) {
        print("<<CATCH>>");
    }

    public void visitClass(@NotNull IrClass declaration) {
        boolean z;
        IrConstructor primaryConstructor = IrUtilsKt.getPrimaryConstructor(declaration);
        printAnnotations((IrAnnotationContainer) declaration, true);
        if (!Intrinsics.areEqual(declaration.getVisibility(), DescriptorVisibilities.PUBLIC) && !Intrinsics.areEqual(declaration.getVisibility(), DescriptorVisibilities.LOCAL)) {
            Object lowerCase = declaration.getVisibility().toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            print(lowerCase);
            print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        }
        if (declaration.isInner()) {
            print("inner ");
        }
        if (declaration.isData()) {
            print("data ");
        }
        if (IrUtilsKt.isInterface(declaration)) {
            print("interface ");
        } else if (IrUtilsKt.isObject(declaration)) {
            print("object ");
        } else {
            if (declaration.getModality() != Modality.FINAL) {
                Object lowerCase2 = declaration.getModality().toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                print(lowerCase2);
                print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            }
            if (IrUtilsKt.isAnnotationClass(declaration)) {
                print("annotation ");
            }
            print("class ");
        }
        print(declaration.getName());
        if (!declaration.getTypeParameters().isEmpty()) {
            print("<");
            printJoin(declaration.getTypeParameters(), ", ");
            print("> ");
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (primaryConstructor != null && (!primaryConstructor.getValueParameters().isEmpty())) {
            print("(");
            int i = 0;
            for (Object obj : primaryConstructor.getValueParameters()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                IrValueParameter irValueParameter = (IrValueParameter) obj;
                IrProperty irPropertyCorrespondingProperty = correspondingProperty(declaration, irValueParameter);
                if (irPropertyCorrespondingProperty != null) {
                    linkedHashSet.add(irPropertyCorrespondingProperty);
                    print(irPropertyCorrespondingProperty.isVar() ? "var " : "val ");
                }
                print((IrElement) irValueParameter);
                if (i < primaryConstructor.getValueParameters().size() - 1) {
                    print(", ");
                }
                i = i2;
            }
            print(")");
        }
        print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        List superTypes = declaration.getSuperTypes();
        if (!(superTypes instanceof Collection) || !superTypes.isEmpty()) {
            Iterator it = superTypes.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!IrTypePredicatesKt.isAny((IrType) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (z) {
            print(": ");
            print(CollectionsKt___CollectionsKt.joinToString$default(declaration.getSuperTypes(), ", ", null, null, 0, null, new Function1<IrType, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor.visitClass.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull IrType irType) {
                    return IrSourcePrinterVisitor.this.renderSrc(irType);
                }
            }, 30, null));
            print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        }
        List declarations = declaration.getDeclarations();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : declarations) {
            IrDeclaration irDeclaration = (IrDeclaration) obj2;
            if ((Intrinsics.areEqual(irDeclaration, primaryConstructor) || CollectionsKt.contains(linkedHashSet, irDeclaration)) ? false : true) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!Intrinsics.areEqual(((IrDeclaration) obj3).getOrigin(), IrDeclarationOrigin.FAKE_OVERRIDE.INSTANCE)) {
                arrayList2.add(obj3);
            }
        }
        if (!arrayList2.isEmpty()) {
            println("{");
            this.printer.pushIndent();
            printJoin(arrayList2, "\n");
            this.printer.popIndent();
            println();
            println("}");
            return;
        }
        println();
    }

    public void visitClassReference(@NotNull IrClassReference expression) {
        print(renderSrc(expression.getClassType()));
        print("::class");
    }

    public void visitComposite(@NotNull IrComposite expression) {
        printJoin(expression.getStatements(), "\n");
    }

    public void visitConst(@NotNull IrConst<?> expression) {
        String strValueOf;
        IrConstKind kind = expression.getKind();
        if ((kind instanceof IrConstKind.Null) || (kind instanceof IrConstKind.Boolean)) {
            strValueOf = String.valueOf(expression.getValue());
        } else if (kind instanceof IrConstKind.Char) {
            strValueOf = "'" + expression.getValue() + "'";
        } else if ((kind instanceof IrConstKind.Byte) || (kind instanceof IrConstKind.Short)) {
            strValueOf = String.valueOf(expression.getValue());
        } else if (kind instanceof IrConstKind.Int) {
            if (this.printIntsAsBinary) {
                Object value = expression.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                strValueOf = intAsBinaryString(((Integer) value).intValue());
            } else {
                strValueOf = String.valueOf(expression.getValue());
            }
        } else if (kind instanceof IrConstKind.Long) {
            strValueOf = expression.getValue() + "L";
        } else if (kind instanceof IrConstKind.Float) {
            strValueOf = expression.getValue() + "f";
        } else if (kind instanceof IrConstKind.Double) {
            strValueOf = String.valueOf(expression.getValue());
        } else {
            if (!(kind instanceof IrConstKind.String)) {
                throw new NoWhenBranchMatchedException();
            }
            strValueOf = "\"" + expression.getValue() + "\"";
        }
        print(strValueOf);
    }

    public void visitConstantArray(@NotNull IrConstantArray irConstantArray, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitConstantArray(this, irConstantArray, r2);
    }

    public void visitConstantObject(@NotNull IrConstantObject irConstantObject, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitConstantObject(this, irConstantObject, r2);
    }

    public void visitConstantPrimitive(@NotNull IrConstantPrimitive irConstantPrimitive, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitConstantPrimitive(this, irConstantPrimitive, r2);
    }

    public void visitConstantValue(@NotNull IrConstantValue irConstantValue, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitConstantValue(this, irConstantValue, r2);
    }

    public void visitConstructor(@NotNull IrConstructor declaration) {
        printAnnotations((IrAnnotationContainer) declaration, true);
        print("constructor");
        List<? extends IrElement> valueParameters = declaration.getValueParameters();
        if (true ^ valueParameters.isEmpty()) {
            print("(");
            printJoin(valueParameters, ", ");
            print(")");
        }
        printBody((IrFunction) declaration);
    }

    public void visitConstructorCall(@NotNull IrConstructorCall expression) {
        IrClass constructedClass = AdditionalIrUtilsKt.getConstructedClass(expression.getSymbol().getOwner());
        Name name = constructedClass.getName();
        boolean zIsAnnotationClass = IrUtilsKt.isAnnotationClass(constructedClass);
        if (zIsAnnotationClass) {
            print("@");
        }
        IrExpression dispatchReceiver = expression.getDispatchReceiver();
        if (dispatchReceiver != null) {
            print((IrElement) dispatchReceiver);
            print(".");
        }
        print(name);
        boolean z = true;
        if (zIsAnnotationClass) {
            int valueArgumentsCount = expression.getValueArgumentsCount();
            int i = 0;
            while (true) {
                if (i >= valueArgumentsCount) {
                    z = false;
                    break;
                } else if (expression.getValueArgument(i) != null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (z) {
            printArgumentList((IrFunctionAccessExpression) expression, zIsAnnotationClass, zIsAnnotationClass);
        }
    }

    public void visitContainerExpression(@NotNull IrContainerExpression expression) {
        print("<<CONTAINEREXPR>>");
    }

    public void visitContinue(@NotNull IrContinue jump) {
        print("continue");
        if (jump.getLabel() != null) {
            print("@");
            print(jump.getLabel());
        }
    }

    public void visitDeclaration(@NotNull IrDeclarationBase irDeclarationBase, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitDeclaration(this, irDeclarationBase, r2);
    }

    public void visitDeclarationReference(@NotNull IrDeclarationReference irDeclarationReference, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitDeclarationReference(this, irDeclarationReference, r2);
    }

    public void visitDelegatingConstructorCall(@NotNull IrDelegatingConstructorCall expression) {
        Name name = AdditionalIrUtilsKt.getConstructedClass(expression.getSymbol().getOwner()).getName();
        print("ctor<");
        print(name);
        print(">");
        printArgumentList$default(this, (IrFunctionAccessExpression) expression, false, false, 3, null);
    }

    public void visitDoWhileLoop(@NotNull IrDoWhileLoop loop) {
        println("do {");
        this.printer.pushIndent();
        IrExpression body = loop.getBody();
        if (body != null) {
            print((IrElement) body);
        }
        println();
        this.printer.popIndent();
        print("} while (");
        print((IrElement) loop.getCondition());
        println(")");
    }

    public void visitDynamicExpression(@NotNull IrDynamicExpression irDynamicExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitDynamicExpression(this, irDynamicExpression, r2);
    }

    public void visitDynamicMemberExpression(@NotNull IrDynamicMemberExpression irDynamicMemberExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitDynamicMemberExpression(this, irDynamicMemberExpression, r2);
    }

    public void visitDynamicOperatorExpression(@NotNull IrDynamicOperatorExpression irDynamicOperatorExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitDynamicOperatorExpression(this, irDynamicOperatorExpression, r2);
    }

    public void visitElement(@NotNull IrElement element) {
        print(o000oOoO.OooO0O0("<<", element.getClass().getSimpleName(), ">>"));
    }

    public void visitElseBranch(@NotNull IrElseBranch branch) {
        print("<<ELSE>>");
    }

    public void visitEnumConstructorCall(@NotNull IrEnumConstructorCall irEnumConstructorCall, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitEnumConstructorCall(this, irEnumConstructorCall, r2);
    }

    public void visitEnumEntry(@NotNull IrEnumEntry irEnumEntry, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitEnumEntry(this, irEnumEntry, r2);
    }

    public void visitErrorCallExpression(@NotNull IrErrorCallExpression irErrorCallExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitErrorCallExpression(this, irErrorCallExpression, r2);
    }

    public void visitErrorDeclaration(@NotNull IrErrorDeclaration irErrorDeclaration, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitErrorDeclaration(this, irErrorDeclaration, r2);
    }

    public void visitErrorExpression(@NotNull IrErrorExpression irErrorExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitErrorExpression(this, irErrorExpression, r2);
    }

    public void visitExpression(@NotNull IrExpression irExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitExpression(this, irExpression, r2);
    }

    public void visitExpressionBody(@NotNull IrExpressionBody body) {
        body.getExpression().accept((IrElementVisitor) this, (Object) null);
    }

    public void visitExternalPackageFragment(@NotNull IrExternalPackageFragment irExternalPackageFragment, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitExternalPackageFragment(this, irExternalPackageFragment, r2);
    }

    public void visitField(@NotNull IrField declaration) {
        if (!Intrinsics.areEqual(declaration.getVisibility(), DescriptorVisibilities.PUBLIC) && !Intrinsics.areEqual(declaration.getVisibility(), DescriptorVisibilities.LOCAL)) {
            String lowerCase = declaration.getVisibility().toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            print(lowerCase);
            print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        }
        if (declaration.isStatic()) {
            print("static ");
        }
        if (declaration.isFinal()) {
            print("val ");
        } else {
            print("var ");
        }
        print(declaration.getSymbol().getOwner().getName());
        print(": ");
        print(renderSrc(declaration.getType()));
        IrExpressionBody initializer = declaration.getInitializer();
        if (initializer != null) {
            print(" = ");
            print((IrElement) initializer);
        }
    }

    public void visitFieldAccess(@NotNull IrFieldAccessExpression irFieldAccessExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitFieldAccess(this, irFieldAccessExpression, r2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
    public void visitFile(@NotNull IrFile declaration) throws Exception {
        try {
            printJoin(declaration.getDeclarations(), "\n");
        } catch (Exception e) {
            throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(declaration)), e);
        } catch (ProcessCanceledException e2) {
            throw e2;
        }
    }

    public void visitFunction(@NotNull IrFunction declaration) {
        print("<<FUNCTION>>");
    }

    public void visitFunctionAccess(@NotNull IrFunctionAccessExpression expression) {
        IrElementVisitorVoid.DefaultImpls.visitFunctionAccess(this, expression);
    }

    public void visitFunctionExpression(@NotNull IrFunctionExpression expression) {
        printAsLambda((IrFunction) expression.getFunction());
    }

    public void visitFunctionReference(@NotNull IrFunctionReference expression) {
        IrPropertySymbol correspondingPropertySymbol;
        IrSimpleFunction owner = expression.getSymbol().getOwner();
        printExplicitReceiver((IrMemberAccessExpression) expression, "::");
        IrProperty irProperty = null;
        IrSimpleFunction irSimpleFunction = owner instanceof IrSimpleFunction ? owner : null;
        if (irSimpleFunction != null && (correspondingPropertySymbol = irSimpleFunction.getCorrespondingPropertySymbol()) != null) {
            irProperty = (IrProperty) correspondingPropertySymbol.getOwner();
        }
        if (irProperty != null) {
            print(irProperty.getName().asString());
            if (Intrinsics.areEqual(owner, irProperty.getSetter())) {
                print("::set");
                return;
            } else {
                if (Intrinsics.areEqual(owner, irProperty.getGetter())) {
                    print("::get");
                    return;
                }
                return;
            }
        }
        print(owner.getName().asString());
    }

    public void visitGetClass(@NotNull IrGetClass irGetClass, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitGetClass(this, irGetClass, r2);
    }

    public void visitGetEnumValue(@NotNull IrGetEnumValue expression) {
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(expression.getType());
        if (classOrNull == null) {
            return;
        }
        print(classOrNull.getOwner().getName());
        print(".");
        print(expression.getSymbol().getOwner().getName());
    }

    public void visitGetField(@NotNull IrGetField expression) {
        IrExpression receiver = expression.getReceiver();
        IrField owner = expression.getSymbol().getOwner();
        IrClass parent = owner.getParent();
        if (receiver != null) {
            IrExpression receiver2 = expression.getReceiver();
            if (receiver2 != null) {
                print((IrElement) receiver2);
            }
        } else if (owner.isStatic() && (parent instanceof IrClass)) {
            print(parent.getName());
        }
        print(".");
        print(owner.getName());
    }

    public void visitGetObjectValue(@NotNull IrGetObjectValue expression) {
        print(expression.getSymbol().getOwner().getName());
    }

    public void visitGetValue(@NotNull IrGetValue expression) {
        IrValueDeclaration owner = expression.getSymbol().getOwner();
        print(getNormalizedName(owner));
        if (Intrinsics.areEqual(owner.getParent(), this.currentScope.getOwner())) {
            return;
        }
        HashSet<IrValueDeclaration> localValues = this.currentScope.getLocalValues();
        boolean z = false;
        if (!(localValues instanceof Collection) || !localValues.isEmpty()) {
            Iterator<T> it = localValues.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((IrValueDeclaration) it.next()).getName(), owner.getName())) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            print("@");
            print(AdditionalIrUtilsKt.getKotlinFqName(owner.getParent()));
        }
    }

    public void visitInstanceInitializerCall(@NotNull IrInstanceInitializerCall expression) {
        print("init<" + expression.getClassSymbol().getOwner().getName() + ">()");
    }

    public void visitLocalDelegatedProperty(@NotNull IrLocalDelegatedProperty declaration) {
        printAnnotations((IrAnnotationContainer) declaration, true);
        print(declaration.isVar() ? "var " : "val ");
        print(declaration.getName());
        print(" by ");
        println("{");
        this.printer.pushIndent();
        IrVisitorsKt.acceptVoid(declaration.getDelegate(), this);
        IrFunction getter = declaration.getGetter();
        Scope scope = this.currentScope;
        this.currentScope = new Scope(getter, new HashSet(getter.getValueParameters()));
        printPropertyAccessor$default(this, getter, false, 1, null);
        this.currentScope = scope;
        IrSimpleFunction setter = declaration.getSetter();
        if (setter != null) {
            IrFunction irFunction = (IrFunction) setter;
            Scope scope2 = this.currentScope;
            this.currentScope = new Scope(irFunction, new HashSet(irFunction.getValueParameters()));
            printPropertyAccessor(irFunction, true);
            this.currentScope = scope2;
        }
        this.printer.popIndent();
        println();
        println("}");
    }

    public void visitLocalDelegatedPropertyReference(@NotNull IrLocalDelegatedPropertyReference expression) {
        print("::");
        print(expression.getDelegate().getOwner().getName());
    }

    public void visitLoop(@NotNull IrLoop loop) {
        print("<<LOOP>>");
    }

    public void visitMemberAccess(@NotNull IrMemberAccessExpression<?> irMemberAccessExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitMemberAccess(this, irMemberAccessExpression, r2);
    }

    public void visitModuleFragment(@NotNull IrModuleFragment declaration) {
        printJoin$default(this, declaration.getFiles(), null, 1, null);
    }

    public void visitPackageFragment(@NotNull IrPackageFragment irPackageFragment, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitPackageFragment(this, irPackageFragment, r2);
    }

    public void visitProperty(@NotNull IrProperty declaration) {
        IrType returnType;
        IrExpressionBody initializer;
        printAnnotations((IrAnnotationContainer) declaration, true);
        if (declaration.isLateinit()) {
            print("lateinit");
        }
        if (declaration.isConst()) {
            print("const ");
        } else if (declaration.isVar()) {
            print("var ");
        } else {
            print("val ");
        }
        print(declaration.getName());
        print(": ");
        IrField backingField = declaration.getBackingField();
        if (backingField == null || (returnType = backingField.getType()) == null) {
            IrSimpleFunction getter = declaration.getGetter();
            if (getter == null) {
                throw new IllegalStateException("Couldn't find return type".toString());
            }
            returnType = getter.getReturnType();
        }
        print(renderSrc(returnType));
        IrField backingField2 = declaration.getBackingField();
        if (backingField2 != null && (initializer = backingField2.getInitializer()) != null) {
            print(" = ");
            print((IrElement) initializer);
        }
        this.printer.pushIndent();
        IrAnnotationContainer getter2 = declaration.getGetter();
        if (getter2 != null) {
            IrAnnotationContainer irAnnotationContainer = (IrFunction) getter2;
            Scope scope = this.currentScope;
            this.currentScope = new Scope(irAnnotationContainer, new HashSet(irAnnotationContainer.getValueParameters()));
            if (!Intrinsics.areEqual(irAnnotationContainer.getOrigin(), IrDeclarationOrigin.DEFAULT_PROPERTY_ACCESSOR.INSTANCE)) {
                println();
                printAnnotations$default(this, irAnnotationContainer, false, 1, null);
                println();
                println("get() {");
                this.printer.pushIndent();
                IrBody body = irAnnotationContainer.getBody();
                if (body != null) {
                    body.accept((IrElementVisitor) this, (Object) null);
                }
                this.printer.popIndent();
                println();
                println("}");
            }
            this.currentScope = scope;
        }
        IrAnnotationContainer setter = declaration.getSetter();
        if (setter != null) {
            IrAnnotationContainer irAnnotationContainer2 = (IrFunction) setter;
            Scope scope2 = this.currentScope;
            this.currentScope = new Scope(irAnnotationContainer2, new HashSet(irAnnotationContainer2.getValueParameters()));
            if (!Intrinsics.areEqual(irAnnotationContainer2.getOrigin(), IrDeclarationOrigin.DEFAULT_PROPERTY_ACCESSOR.INSTANCE)) {
                println();
                printAnnotations$default(this, irAnnotationContainer2, false, 1, null);
                println("set(value) {");
                this.printer.pushIndent();
                IrBody body2 = irAnnotationContainer2.getBody();
                if (body2 != null) {
                    body2.accept((IrElementVisitor) this, (Object) null);
                }
                this.printer.popIndent();
                println();
                println("}");
            }
            this.currentScope = scope2;
        }
        this.printer.popIndent();
    }

    public void visitPropertyReference(@NotNull IrPropertyReference expression) {
        IrProperty owner = expression.getSymbol().getOwner();
        printExplicitReceiver$default(this, (IrMemberAccessExpression) expression, null, 1, null);
        print("::");
        print(owner.getName());
    }

    public void visitRawFunctionReference(@NotNull IrRawFunctionReference irRawFunctionReference, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitRawFunctionReference(this, irRawFunctionReference, r2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0039, please report this as an issue */
    public void visitReturn(@NotNull IrReturn expression) {
        IrFunctionAccessExpression irFunctionAccessExpression;
        String str;
        IrExpression value = expression.getValue();
        IrReturnTarget owner = expression.getReturnTargetSymbol().getOwner();
        if (owner instanceof IrFunction) {
            IrFunction irFunction = (IrFunction) owner;
            if ((!isLambda(irFunction) && (this.useFir || !isDelegatedPropertySetter(irFunction))) || !isLastStatementIn((IrExpression) expression, irFunction)) {
                irFunctionAccessExpression = this.returnTargetToCall.get(owner.getSymbol());
                if (irFunctionAccessExpression != null) {
                    str = "@" + irFunctionAccessExpression.getSymbol().getOwner().getName();
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                print(o000oOoO.OooO0O0("return", str, ZegoConstants.ZegoVideoDataAuxPublishingStream));
            }
        } else {
            irFunctionAccessExpression = this.returnTargetToCall.get(owner.getSymbol());
            if (irFunctionAccessExpression != null) {
                str = "@" + irFunctionAccessExpression.getSymbol().getOwner().getName();
                if (str == null) {
                    str = "";
                }
            } else {
                str = "";
            }
            print(o000oOoO.OooO0O0("return", str, ZegoConstants.ZegoVideoDataAuxPublishingStream));
        }
        if (IrTypePredicatesKt.isUnit(value.getType()) && (value instanceof IrGetObjectValue)) {
            return;
        }
        print((IrElement) value);
    }

    public void visitScript(@NotNull IrScript irScript, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitScript(this, irScript, r2);
    }

    public void visitSetField(@NotNull IrSetField expression) {
        IrExpression receiver = expression.getReceiver();
        if (receiver != null) {
            print((IrElement) receiver);
        }
        print(".");
        print(expression.getSymbol().getOwner().getName());
        print(" = ");
        print((IrElement) expression.getValue());
    }

    public void visitSetValue(@NotNull IrSetValue expression) {
        print(getNormalizedName(expression.getSymbol().getOwner()));
        print(" = ");
        print((IrElement) expression.getValue());
    }

    public void visitSimpleFunction(@NotNull IrSimpleFunction declaration) {
        if (Intrinsics.areEqual(declaration.getOrigin(), IrDeclarationOrigin.FAKE_OVERRIDE.INSTANCE)) {
            return;
        }
        IrFunction irFunction = (IrFunction) declaration;
        Scope scope = this.currentScope;
        this.currentScope = new Scope(irFunction, new HashSet(irFunction.getValueParameters()));
        printAnnotations((IrAnnotationContainer) declaration, true);
        if (!declaration.getOverriddenSymbols().isEmpty()) {
            print("override ");
        } else {
            if (!Intrinsics.areEqual(declaration.getVisibility(), DescriptorVisibilities.PUBLIC) && !Intrinsics.areEqual(declaration.getVisibility(), DescriptorVisibilities.LOCAL)) {
                String lowerCase = declaration.getVisibility().toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                print(lowerCase);
                print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            }
            if (declaration.getModality() != Modality.FINAL) {
                String lowerCase2 = declaration.getModality().toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                print(lowerCase2);
                print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            }
        }
        if (declaration.isSuspend()) {
            print("suspend ");
        }
        print("fun ");
        if (!declaration.getTypeParameters().isEmpty()) {
            print("<");
            printJoin(declaration.getTypeParameters(), ", ");
            print("> ");
        }
        IrValueParameter extensionReceiverParameter = declaration.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            print(renderSrc(extensionReceiverParameter.getType()));
            print(".");
        }
        print(declaration.getName());
        print("(");
        printJoin(declaration.getValueParameters(), ", ");
        print(")");
        if (!IrTypePredicatesKt.isUnit(declaration.getReturnType())) {
            print(": ");
            print(renderSrc(declaration.getReturnType()));
        }
        print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        printBody(irFunction);
        this.currentScope = scope;
    }

    public void visitSingletonReference(@NotNull IrGetSingletonValue irGetSingletonValue, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitSingletonReference(this, irGetSingletonValue, r2);
    }

    public void visitSpreadElement(@NotNull IrSpreadElement spread) {
        print("<<SPREAD>>");
    }

    public void visitStringConcatenation(@NotNull IrStringConcatenation expression) {
        List<IrConst> arguments = expression.getArguments();
        print("\"");
        for (IrConst irConst : arguments) {
            if (irConst instanceof IrConst) {
                IrConst irConst2 = irConst;
                if (Intrinsics.areEqual(irConst2.getKind(), IrConstKind.String.INSTANCE)) {
                    print(irConst2.getValue());
                }
            }
            if (irConst instanceof IrGetValue) {
                print("$");
                print((IrElement) irConst);
            } else {
                print("${");
                print((IrElement) irConst);
                print("}");
            }
        }
        print("\"");
    }

    public void visitSuspendableExpression(@NotNull IrSuspendableExpression irSuspendableExpression, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitSuspendableExpression(this, irSuspendableExpression, r2);
    }

    public void visitSuspensionPoint(@NotNull IrSuspensionPoint irSuspensionPoint, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitSuspensionPoint(this, irSuspensionPoint, r2);
    }

    public void visitSyntheticBody(@NotNull IrSyntheticBody irSyntheticBody, @Nullable Void r2) {
        IrElementVisitorVoid.DefaultImpls.visitSyntheticBody(this, irSyntheticBody, r2);
    }

    public void visitThrow(@NotNull IrThrow expression) {
        print("throw ");
        print((IrElement) expression.getValue());
    }

    public void visitTry(@NotNull IrTry aTry) {
        println("try {");
        this.printer.pushIndent();
        print((IrElement) aTry.getTryResult());
        this.printer.popIndent();
        println();
        if (!aTry.getCatches().isEmpty()) {
            for (IrCatch irCatch : aTry.getCatches()) {
                println("} catch() {");
                this.printer.pushIndent();
                print((IrElement) irCatch);
                this.printer.popIndent();
                println();
            }
        }
        IrExpression finallyExpression = aTry.getFinallyExpression();
        if (finallyExpression != null) {
            println("} finally {");
            this.printer.pushIndent();
            print((IrElement) finallyExpression);
            this.printer.popIndent();
            println();
        }
        println("}");
    }

    public void visitTypeAlias(@NotNull IrTypeAlias declaration) {
        print("<<TYPEALIAS>>");
    }

    public void visitTypeOperator(@NotNull IrTypeOperatorCall expression) {
        switch (WhenMappings.$EnumSwitchMapping$0[expression.getOperator().ordinal()]) {
            case 1:
                print((IrElement) expression.getArgument());
                return;
            case 2:
                print((IrElement) expression.getArgument());
                return;
            case 3:
            case 4:
            case 5:
                print((IrElement) expression.getArgument());
                return;
            case 6:
                print(renderSrc(expression.getType()));
                print(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                print((IrElement) expression.getArgument());
                return;
            case 7:
                print((IrElement) expression.getArgument());
                return;
            case 8:
                print((IrElement) expression.getArgument());
                return;
            default:
                throw new IllegalStateException(("Unknown type operator: " + expression.getOperator()).toString());
        }
    }

    public void visitTypeParameter(@NotNull IrTypeParameter declaration) {
        print(declaration.getName());
        if ((declaration.getSuperTypes().isEmpty() ^ true) && !IrTypePredicatesKt.isNullableAny((IrType) declaration.getSuperTypes().get(0))) {
            print(": ");
            print(CollectionsKt___CollectionsKt.joinToString$default(declaration.getSuperTypes(), ", ", null, null, 0, null, new Function1<IrType, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor.visitTypeParameter.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull IrType irType) {
                    return IrSourcePrinterVisitor.this.renderSrc(irType);
                }
            }, 30, null));
        }
    }

    public void visitValueAccess(@NotNull IrValueAccessExpression expression) {
        print("<<VARACCESS>>");
    }

    public void visitValueParameter(@NotNull IrValueParameter declaration) {
        if (declaration.isCrossinline()) {
            print("crossinline ");
        }
        if (declaration.isNoinline()) {
            print("noinline ");
        }
        printAnnotations$default(this, (IrAnnotationContainer) declaration, false, 1, null);
        print(getNormalizedName((IrValueDeclaration) declaration));
        print(": ");
        print(renderSrc(declaration.getType()));
        IrExpressionBody defaultValue = declaration.getDefaultValue();
        if (defaultValue != null) {
            print(" = ");
            print((IrElement) defaultValue);
        }
    }

    public void visitVararg(@NotNull IrVararg expression) {
        int i = 0;
        for (Object obj : expression.getElements()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            IrSpreadElement irSpreadElement = (IrVarargElement) obj;
            if (irSpreadElement instanceof IrSpreadElement) {
                print("*");
                print((IrElement) irSpreadElement.getExpression());
            } else if (irSpreadElement instanceof IrExpression) {
                print((IrElement) irSpreadElement);
            }
            if (i < expression.getElements().size() - 1) {
                print(", ");
            }
            i = i2;
        }
    }

    public void visitVariable(@NotNull IrVariable declaration) {
        this.currentScope.getLocalValues().add(declaration);
        if (declaration.isLateinit()) {
            print("lateinit");
        }
        if (declaration.isConst()) {
            print("const ");
        } else if (declaration.isVar()) {
            print("var ");
        } else {
            print("val ");
        }
        print(getNormalizedName((IrValueDeclaration) declaration));
        IrExpression initializer = declaration.getInitializer();
        if (initializer != null) {
            print(" = ");
            print((IrElement) initializer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    public void visitWhen(@NotNull IrWhen expression) {
        boolean z;
        boolean z2;
        boolean z3 = Intrinsics.areEqual(expression.getOrigin(), IrStatementOrigin.IF.INSTANCE) || (expression instanceof IrIfThenElseImpl);
        if (Intrinsics.areEqual(expression.getOrigin(), IrStatementOrigin.OROR.INSTANCE)) {
            IrExpression condition = ((IrBranch) expression.getBranches().get(0)).getCondition();
            IrExpression result = ((IrBranch) expression.getBranches().get(1)).getResult();
            print((IrElement) condition);
            print(" || ");
            print((IrElement) result);
            return;
        }
        if (Intrinsics.areEqual(expression.getOrigin(), IrStatementOrigin.ANDAND.INSTANCE)) {
            IrExpression condition2 = ((IrBranch) expression.getBranches().get(0)).getCondition();
            IrExpression result2 = ((IrBranch) expression.getBranches().get(0)).getResult();
            print((IrElement) condition2);
            print(" && ");
            print((IrElement) result2);
            return;
        }
        if (z3) {
            List branches = expression.getBranches();
            if (!(branches instanceof Collection) || !branches.isEmpty()) {
                Iterator it = branches.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    IrBranch irBranch = (IrBranch) it.next();
                    if (!((irBranch.getResult() instanceof IrConst) || (irBranch.getResult() instanceof IrGetValue))) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            int i = 0;
            for (Object obj : expression.getBranches()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                IrBranch irBranch2 = (IrBranch) obj;
                if (i == expression.getBranches().size() - 1) {
                    IrConst condition3 = irBranch2.getCondition();
                    IrConst irConst = condition3 instanceof IrConst ? condition3 : null;
                    if (irConst != null ? Intrinsics.areEqual(irConst.getValue(), Boolean.TRUE) : false) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (i == 0) {
                    print("if (");
                    print((IrElement) irBranch2.getCondition());
                    if (z) {
                        print(") ");
                    } else {
                        println(") {");
                    }
                } else if (!z2) {
                    if (z) {
                        print(" else if (");
                    } else {
                        print("} else if (");
                    }
                    print((IrElement) irBranch2.getCondition());
                    if (z) {
                        print(") ");
                    } else {
                        println(") {");
                    }
                } else if (z) {
                    print(" else ");
                } else {
                    println("} else {");
                }
                if (z) {
                    print((IrElement) irBranch2.getResult());
                } else {
                    this.printer.pushIndent();
                    print((IrElement) irBranch2.getResult());
                    println();
                    this.printer.popIndent();
                }
                i = i2;
            }
            if (z) {
                return;
            }
            println("}");
            return;
        }
        print("when ");
        println("{");
        this.printer.pushIndent();
        for (IrBranch irBranch3 : expression.getBranches()) {
            IrConst condition4 = irBranch3.getCondition();
            IrConst irConst2 = condition4 instanceof IrConst ? condition4 : null;
            if (irConst2 != null ? Intrinsics.areEqual(irConst2.getValue(), Boolean.TRUE) : false) {
                print("else");
            } else {
                print((IrElement) irBranch3.getCondition());
            }
            print(" -> ");
            println("{");
            this.printer.pushIndent();
            print((IrElement) irBranch3.getResult());
            this.printer.popIndent();
            println();
            println("}");
        }
        this.printer.popIndent();
        println();
        println("}");
    }

    public void visitWhileLoop(@NotNull IrWhileLoop loop) {
        if (loop.getLabel() != null) {
            print(loop.getLabel());
            print("@");
        }
        print("while (");
        print((IrElement) loop.getCondition());
        println(") {");
        this.printer.pushIndent();
        IrExpression body = loop.getBody();
        if (body != null) {
            print((IrElement) body);
        }
        println();
        this.printer.popIndent();
        println("}");
    }

    public /* synthetic */ IrSourcePrinterVisitor(Appendable appendable, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appendable, (i & 2) != 0 ? "  " : str, (i & 4) != 0 ? false : z);
    }
}
