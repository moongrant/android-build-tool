package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b?\b\u0000\u0018\u0000 à\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\bà\u0002á\u0002â\u0002ã\u0002B\u0019\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010ä\u0001\u001a\u00030µ\u00012\b\u0010¿\u0001\u001a\u00030´\u0001H\u0000¢\u0006\u0003\bå\u0001J\u0010\u0010æ\u0001\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\bç\u0001J\n\u0010è\u0001\u001a\u00030µ\u0001H\u0002J\u0014\u0010é\u0001\u001a\u00030ê\u00012\b\b\u0002\u0010H\u001a\u00020\u000bH\u0002J\u0010\u0010ë\u0001\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\bì\u0001J\u0010\u0010í\u0001\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\bî\u0001J\u001a\u0010ï\u0001\u001a\u00030µ\u00012\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0000¢\u0006\u0003\bò\u0001J%\u0010ó\u0001\u001a\u00030µ\u00012\u0015\u0010ô\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030µ\u00010³\u0001H\u0086\bø\u0001\u0000J+\u0010õ\u0001\u001a\u00030µ\u00012\u001b\u0010ô\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030µ\u00010ö\u0001H\u0086\bø\u0001\u0000J,\u0010÷\u0001\u001a\u00030µ\u00012\u0016\u0010ô\u0001\u001a\u0011\u0012\u0005\u0012\u00030ø\u0001\u0012\u0005\u0012\u00030µ\u00010³\u0001H\u0080\bø\u0001\u0000¢\u0006\u0003\bù\u0001J+\u0010ú\u0001\u001a\u00030µ\u00012\u0015\u0010ô\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030µ\u00010³\u0001H\u0080\bø\u0001\u0000¢\u0006\u0003\bû\u0001J\n\u0010ü\u0001\u001a\u00030µ\u0001H\u0016J\u0013\u0010ý\u0001\u001a\f\u0018\u00010þ\u0001j\u0005\u0018\u0001`ÿ\u0001H\u0017J\u0010\u0010\u0080\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020$H\u0016JC\u0010\u0082\u0002\u001a\u00030µ\u00012\b\u0010\u0083\u0002\u001a\u00030\u0084\u00022\b\u0010\u0085\u0002\u001a\u00030\u0086\u00022\t\b\u0002\u0010\u0087\u0002\u001a\u00020\t2\t\b\u0002\u0010\u0088\u0002\u001a\u00020\tH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002JC\u0010\u008b\u0002\u001a\u00030µ\u00012\b\u0010\u0083\u0002\u001a\u00030\u0084\u00022\b\u0010\u008c\u0002\u001a\u00030\u0086\u00022\t\b\u0002\u0010\u0087\u0002\u001a\u00020\t2\t\b\u0002\u0010\u0088\u0002\u001a\u00020\tH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\b\u008d\u0002\u0010\u008a\u0002J$\u0010Q\u001a\u00030µ\u00012\u000f\u0010ô\u0001\u001a\n\u0012\u0005\u0012\u00030µ\u00010\u008e\u0002H\u0080\bø\u0001\u0000¢\u0006\u0003\b\u008f\u0002J\"\u0010\u0090\u0002\u001a\u00030µ\u00012\u0007\u0010\u0091\u0002\u001a\u00020\u000b2\u0007\u0010\u0092\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\b\u0093\u0002J\n\u0010\u0094\u0002\u001a\u00030µ\u0001H\u0002J\n\u0010\u0095\u0002\u001a\u00030µ\u0001H\u0002J\u0010\u0010\u0096\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\b\u0097\u0002J\u0010\u0010\u0098\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\b\u0099\u0002J\u0010\u0010\u009a\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\b\u009b\u0002J\u0010\u0010\u009c\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\b\u009d\u0002J\u0010\u0010\u009e\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\b\u009f\u0002J\u0013\u0010 \u0002\u001a\u00030µ\u00012\t\b\u0002\u0010¡\u0002\u001a\u00020\tJ\n\u0010¢\u0002\u001a\u00030µ\u0001H\u0002J#\u0010£\u0002\u001a\u00020\t2\f\b\u0002\u0010¤\u0002\u001a\u0005\u0018\u00010¥\u0002H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0003\b¦\u0002J\u0010\u0010§\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\b¨\u0002J\u0010\u0010©\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\bª\u0002J\u0010\u0010«\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\b¬\u0002J\u0010\u0010\u00ad\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\b®\u0002J\u0010\u0010¯\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\b°\u0002J+\u0010±\u0002\u001a\u00030µ\u00012\u0007\u0010²\u0002\u001a\u00020\u000b2\u0007\u0010³\u0002\u001a\u00020\u000b2\u0007\u0010´\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\bµ\u0002J\u0013\u0010¶\u0002\u001a\u00030µ\u00012\u0007\u0010·\u0002\u001a\u00020\u0000H\u0002J\n\u0010¸\u0002\u001a\u00030µ\u0001H\u0016J\n\u0010¹\u0002\u001a\u00030µ\u0001H\u0002J\n\u0010º\u0002\u001a\u00030µ\u0001H\u0016J\n\u0010»\u0002\u001a\u00030µ\u0001H\u0016J\n\u0010¼\u0002\u001a\u00030µ\u0001H\u0016J\u0010\u0010½\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\b¾\u0002J\"\u0010¿\u0002\u001a\u00030µ\u00012\u0007\u0010À\u0002\u001a\u00020\u000b2\u0007\u0010Á\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\bÂ\u0002J\n\u0010Ã\u0002\u001a\u00030µ\u0001H\u0002J#\u0010Ä\u0002\u001a\u00020\t2\f\b\u0002\u0010¤\u0002\u001a\u0005\u0018\u00010¥\u0002H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0003\bÅ\u0002J\u0010\u0010Æ\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\bÇ\u0002J\"\u0010È\u0002\u001a\u00030µ\u00012\u0007\u0010\u0091\u0002\u001a\u00020\u000b2\u0007\u0010´\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0003\bÉ\u0002J\u0010\u0010Ê\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\bË\u0002J\u001b\u0010Ì\u0002\u001a\u00030µ\u00012\t\b\u0002\u0010Í\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÎ\u0002J&\u0010Ï\u0002\u001a\u00030µ\u00012\t\b\u0002\u0010Í\u0002\u001a\u00020\t2\t\b\u0002\u0010Ð\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÑ\u0002J\u001b\u0010Ò\u0002\u001a\u00030µ\u00012\t\b\u0002\u0010Í\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÓ\u0002J&\u0010Ô\u0002\u001a\u00030µ\u00012\t\b\u0002\u0010Í\u0002\u001a\u00020\t2\t\b\u0002\u0010Ð\u0002\u001a\u00020\tH\u0000¢\u0006\u0003\bÕ\u0002J\u0019\u0010Ö\u0002\u001a\u00030µ\u00012\u0007\u0010×\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0003\bØ\u0002J\n\u0010Ù\u0002\u001a\u00030µ\u0001H\u0002J\u0010\u0010Ú\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\bÛ\u0002J\t\u0010Ü\u0002\u001a\u00020\tH\u0002J\n\u0010Ý\u0002\u001a\u00030ê\u0001H\u0016J\u0010\u0010Þ\u0002\u001a\u00030µ\u0001H\u0000¢\u0006\u0003\bß\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R,\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b8W@WX\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b1\u0010\u001f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00108\u001a\u0002072\u0006\u00106\u001a\u000207@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u000e\u0010A\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010C\u001a\u00020B2\u0006\u00106\u001a\u00020B@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00103\"\u0004\bJ\u00105R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00000$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010'R\u0014\u0010M\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u001cR\u0014\u0010O\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u00103R\u000e\u0010Q\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010R\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0016\u0010U\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010TR\u001a\u0010W\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u001c\"\u0004\bY\u0010\"R\"\u0010Z\u001a\n\u0018\u00010[j\u0004\u0018\u0001`\\X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u001cR\u0014\u0010l\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u001cR\u0013\u0010m\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u001cR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010p\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u001c\"\u0004\br\u0010\"R\u0014\u0010s\u001a\u00020tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR$\u0010x\u001a\u00020w2\u0006\u00106\u001a\u00020w@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0014\u0010}\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u001cR\u0017\u0010\u007f\u001a\u00030\u0080\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0083\u0001\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u001cR\u0016\u0010\u0085\u0001\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u001cR\u001e\u0010\u0087\u0001\u001a\t\u0018\u00010\u0088\u0001R\u00020t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R.\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0092\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0095\u0001\u001a\u00070\u0096\u0001R\u00020t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010\u001cR+\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u00106\u001a\u00030\u009b\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010¡\u0001\u001a\u00020f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010hR\u0016\u0010£\u0001\u001a\u00020f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010hR+\u0010¦\u0001\u001a\u00030¥\u00012\u0007\u00106\u001a\u00030¥\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R\u001d\u0010«\u0001\u001a\u00020\tX\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010\u001c\"\u0005\b\u00ad\u0001\u0010\"R\u0018\u0010®\u0001\u001a\u00030¯\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b°\u0001\u0010±\u0001R0\u0010²\u0001\u001a\u0013\u0012\u0005\u0012\u00030´\u0001\u0012\u0005\u0012\u00030µ\u0001\u0018\u00010³\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R0\u0010º\u0001\u001a\u0013\u0012\u0005\u0012\u00030´\u0001\u0012\u0005\u0012\u00030µ\u0001\u0018\u00010³\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b»\u0001\u0010·\u0001\"\u0006\b¼\u0001\u0010¹\u0001R\u0016\u0010½\u0001\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010TR'\u0010¿\u0001\u001a\u0005\u0018\u00010´\u00012\t\u0010/\u001a\u0005\u0018\u00010´\u0001@BX\u0080\u000e¢\u0006\n\n\u0000\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Â\u0001\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010\u008e\u0001R\u0019\u0010Ä\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0016\u0010Ç\u0001\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u00103R\u000f\u0010É\u0001\u001a\u00020fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u00103\"\u0005\bË\u0001\u00105R\"\u0010Ì\u0001\u001a\u0005\u0018\u00010Í\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R\u000f\u0010Ò\u0001\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010Ô\u0001\u001a\u00030Ó\u00012\u0007\u00106\u001a\u00030Ó\u0001@VX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R\u000f\u0010Ù\u0001\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010Ú\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u00103R\u0018\u0010Ü\u0001\u001a\u00030Ý\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R#\u0010à\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e8@X\u0081\u0004¢\u0006\u000e\u0012\u0005\bá\u0001\u0010\u001f\u001a\u0005\bâ\u0001\u0010\u0010R\u000f\u0010ã\u0001\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006ä\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "Landroidx/compose/ui/node/InteroperableComposeUiNode;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "isVirtual", "", "semanticsId", "", "(ZI)V", "_children", "Landroidx/compose/runtime/collection/MutableVector;", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_collapsedSemantics", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_foldedChildren", "Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", "_foldedParent", "_innerLayerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "_unfoldedChildren", "_zSortedChildren", "alignmentLinesRequired", "getAlignmentLinesRequired$ui_release", "()Z", "canMultiMeasure", "getCanMultiMeasure$ui_release$annotations", "()V", "getCanMultiMeasure$ui_release", "setCanMultiMeasure$ui_release", "(Z)V", "childLookaheadMeasurables", "", "Landroidx/compose/ui/layout/Measurable;", "getChildLookaheadMeasurables$ui_release", "()Ljava/util/List;", "childMeasurables", "getChildMeasurables$ui_release", "children", "getChildren$ui_release", "collapsedSemantics", "getCollapsedSemantics$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "<set-?>", "compositeKeyHash", "getCompositeKeyHash$annotations", "getCompositeKeyHash", "()I", "setCompositeKeyHash", "(I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalMap", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "deactivated", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "depth", "getDepth$ui_release", "setDepth$ui_release", "foldedChildren", "getFoldedChildren$ui_release", "hasFixedInnerContentConstraints", "getHasFixedInnerContentConstraints$ui_release", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "getHeight", "ignoreRemeasureRequests", "innerCoordinator", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinator", "getInnerLayerCoordinator", "innerLayerCoordinatorIsDirty", "getInnerLayerCoordinatorIsDirty$ui_release", "setInnerLayerCoordinatorIsDirty$ui_release", "interopViewFactoryHolder", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "intrinsicsUsageByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getIntrinsicsUsageByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "isAttached", "isPlaced", "isPlacedInLookahead", "()Ljava/lang/Boolean;", "isValidOwnerScope", "isVirtualLookaheadRoot", "isVirtualLookaheadRoot$ui_release", "setVirtualLookaheadRoot$ui_release", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getLayoutDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutPending", "getLayoutPending$ui_release", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "newRoot", "lookaheadRoot", "getLookaheadRoot$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "setLookaheadRoot", "(Landroidx/compose/ui/node/LayoutNode;)V", "mDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePending", "getMeasurePending$ui_release", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measuredByParent", "getMeasuredByParent$ui_release", "measuredByParentInLookahead", "getMeasuredByParentInLookahead$ui_release", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "nodes", "Landroidx/compose/ui/node/NodeChain;", "getNodes$ui_release", "()Landroidx/compose/ui/node/NodeChain;", "onAttach", "Lkotlin/Function1;", "Landroidx/compose/ui/node/Owner;", "", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "outerCoordinator", "getOuterCoordinator$ui_release", "owner", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "parent", "getParent$ui_release", "parentInfo", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "placeOrder", "getPlaceOrder$ui_release", "previousIntrinsicsUsageByParent", "getSemanticsId", "setSemanticsId", "subcompositionsState", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "getSubcompositionsState$ui_release", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "setSubcompositionsState$ui_release", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "unfoldedVirtualChildrenListDirty", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "virtualChildrenCount", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getWidth", "zIndex", "", "getZIndex", "()F", "zSortedChildren", "getZSortedChildren$annotations", "getZSortedChildren", "zSortedChildrenInvalidated", "attach", "attach$ui_release", "clearSubtreeIntrinsicsUsage", "clearSubtreeIntrinsicsUsage$ui_release", "clearSubtreePlacementIntrinsicsUsage", "debugTreeToString", "", "detach", "detach$ui_release", "dispatchOnPositionedCallbacks", "dispatchOnPositionedCallbacks$ui_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "draw$ui_release", "forEachChild", ReportItem.LogTypeBlock, "forEachChildIndexed", "Lkotlin/Function2;", "forEachCoordinator", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "forEachCoordinator$ui_release", "forEachCoordinatorIncludingInner", "forEachCoordinatorIncludingInner$ui_release", "forceRemeasure", "getInteropView", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getModifierInfo", "Landroidx/compose/ui/layout/ModifierInfo;", "hitTest", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestSemantics", "hitSemanticsEntities", "hitTestSemantics-M_7yMNQ$ui_release", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "insertAt", "index", "instance", "insertAt$ui_release", "invalidateFocusOnAttach", "invalidateFocusOnDetach", "invalidateLayer", "invalidateLayer$ui_release", "invalidateLayers", "invalidateLayers$ui_release", "invalidateMeasurements", "invalidateMeasurements$ui_release", "invalidateParentData", "invalidateParentData$ui_release", "invalidateSemantics", "invalidateSemantics$ui_release", "invalidateSubtree", "isRootOfInvalidation", "invalidateUnfoldedVirtualChildren", "lookaheadRemeasure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "lookaheadRemeasure-_Sx5XlM$ui_release", "lookaheadReplace", "lookaheadReplace$ui_release", "markLayoutPending", "markLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadLayoutPending$ui_release", "markLookaheadMeasurePending", "markLookaheadMeasurePending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "move", "from", "to", "count", "move$ui_release", "onChildRemoved", "child", "onDeactivate", "onDensityOrLayoutDirectionChanged", "onLayoutComplete", "onRelease", "onReuse", "onZSortedChildrenInvalidated", "onZSortedChildrenInvalidated$ui_release", "place", "x", "y", "place$ui_release", "recreateUnfoldedChildrenIfDirty", "remeasure", "remeasure-_Sx5XlM$ui_release", "removeAll", "removeAll$ui_release", "removeAt", "removeAt$ui_release", "replace", "replace$ui_release", "requestLookaheadRelayout", "forceRequest", "requestLookaheadRelayout$ui_release", "requestLookaheadRemeasure", "scheduleMeasureAndLayout", "requestLookaheadRemeasure$ui_release", "requestRelayout", "requestRelayout$ui_release", "requestRemeasure", "requestRemeasure$ui_release", "rescheduleRemeasureOrRelayout", "it", "rescheduleRemeasureOrRelayout$ui_release", "resetModifierState", "resetSubtreeIntrinsicsUsage", "resetSubtreeIntrinsicsUsage$ui_release", "shouldInvalidateParentLayer", "toString", "updateChildrenIfDirty", "updateChildrenIfDirty$ui_release", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 12 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 13 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 14 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1461:1\n1242#1,7:1468\n1242#1,7:1540\n1067#1,2:1548\n1069#1,2:1562\n197#1:1565\n1230#1,7:1963\n197#1:2138\n197#1:2150\n197#1:2162\n1242#1,7:2174\n1182#2:1462\n1161#2,2:1463\n1182#2:1465\n1161#2,2:1466\n1182#2:1475\n1161#2,2:1476\n1182#2:1611\n1161#2,2:1612\n1182#2:1675\n1161#2,2:1676\n1182#2:1749\n1161#2,2:1750\n1182#2:1860\n1161#2,2:1861\n1182#2:1924\n1161#2,2:1925\n1182#2:2006\n1161#2,2:2007\n1182#2:2091\n1161#2,2:2092\n48#3:1478\n48#3:1513\n48#3:1528\n48#3:1550\n460#4,7:1479\n146#4:1486\n467#4,4:1487\n460#4,11:1491\n476#4,11:1502\n460#4,11:1514\n460#4,11:1529\n460#4,11:1551\n146#4:1564\n460#4,11:1566\n460#4,11:2045\n460#4,11:2139\n460#4,11:2151\n460#4,11:2163\n76#5:1525\n76#5:1527\n76#5:1547\n78#5:1577\n78#5:1640\n101#5:1714\n88#5:1788\n90#5,3:1804\n94#5:1808\n90#5:1813\n92#5,3:1815\n90#5:1821\n86#5:1888\n86#5:1908\n72#5:1970\n72#5:1990\n84#5:2056\n74#5:2125\n72#5:2126\n72#5:2130\n72#5:2132\n74#5:2133\n1#6:1526\n700#7,8:1578\n723#7,3:1586\n708#7,2:1589\n711#7,2:1634\n726#7,3:1636\n713#7:1639\n700#7,8:1641\n723#7,3:1649\n708#7,2:1652\n701#7:1654\n702#7,11:1698\n726#7,3:1709\n713#7:1712\n703#7:1713\n700#7,8:1715\n723#7,3:1723\n708#7,2:1726\n701#7:1728\n702#7,11:1772\n726#7,3:1783\n713#7:1786\n703#7:1787\n723#7,3:1810\n726#7,3:1818\n739#7,18:1822\n757#7,3:1883\n751#7:1886\n742#7:1887\n700#7,8:1889\n723#7,3:1897\n708#7,2:1900\n701#7:1902\n702#7,11:1947\n726#7,3:1958\n713#7:1961\n703#7:1962\n700#7,8:1971\n723#7,3:1979\n708#7,2:1982\n701#7:1984\n702#7,11:2029\n726#7,3:2040\n713#7:2043\n703#7:2044\n723#7,3:2127\n726#7,3:2135\n383#8,6:1591\n393#8,2:1598\n395#8,8:1603\n403#8,9:1614\n412#8,8:1626\n383#8,6:1655\n393#8,2:1662\n395#8,8:1667\n403#8,9:1678\n412#8,8:1690\n383#8,6:1729\n393#8,2:1736\n395#8,8:1741\n403#8,9:1752\n412#8,8:1764\n383#8,6:1840\n393#8,2:1847\n395#8,8:1852\n403#8,9:1863\n412#8,8:1875\n383#8,5:1903\n388#8:1909\n393#8,2:1911\n395#8,8:1916\n403#8,9:1927\n412#8,8:1939\n383#8,5:1985\n388#8:1991\n393#8,2:1993\n395#8,8:1998\n403#8,9:2009\n412#8,8:2021\n383#8,6:2071\n393#8,2:2078\n395#8,8:2083\n403#8,9:2094\n412#8,8:2106\n261#9:1597\n261#9:1661\n261#9:1735\n261#9:1814\n261#9:1846\n261#9:1910\n261#9:1992\n261#9:2077\n261#9:2131\n261#9:2134\n234#10,3:1600\n237#10,3:1623\n234#10,3:1664\n237#10,3:1687\n234#10,3:1738\n237#10,3:1761\n234#10,3:1849\n237#10,3:1872\n234#10,3:1913\n237#10,3:1936\n234#10,3:1995\n237#10,3:2018\n234#10,3:2080\n237#10,3:2103\n365#11,15:1789\n47#12:1807\n52#13:1809\n107#14:2057\n96#14,13:2058\n109#14:2114\n101#14,10:2115\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n114#1:1468,7\n490#1:1540,7\n524#1:1548,2\n524#1:1562,2\n593#1:1565\n1110#1:1963,7\n1278#1:2138\n1300#1:2150\n1312#1:2162\n1348#1:2174,7\n128#1:1462\n128#1:1463,2\n539#1:1465\n539#1:1466,2\n140#1:1475\n140#1:1476,2\n656#1:1611\n656#1:1612,2\n678#1:1675\n678#1:1676,2\n690#1:1749\n690#1:1750,2\n1058#1:1860\n1058#1:1861,2\n1094#1:1924\n1094#1:1925,2\n1192#1:2006\n1192#1:2007,2\n1221#1:2091\n1221#1:2092,2\n144#1:1478\n368#1:1513\n480#1:1528\n525#1:1550\n144#1:1479,7\n146#1:1486\n144#1:1487,4\n197#1:1491,11\n199#1:1502,11\n368#1:1514,11\n480#1:1529,11\n525#1:1551,11\n555#1:1564\n593#1:1566,11\n1196#1:2045,11\n1278#1:2139,11\n1300#1:2151,11\n1312#1:2163,11\n416#1:1525\n463#1:1527\n520#1:1547\n656#1:1577\n678#1:1640\n690#1:1714\n846#1:1788\n1048#1:1804,3\n1048#1:1808\n1050#1:1813\n1050#1:1815,3\n1058#1:1821\n1094#1:1888\n1095#1:1908\n1192#1:1970\n1193#1:1990\n1221#1:2056\n1251#1:2125\n1251#1:2126\n1253#1:2130\n1254#1:2132\n1258#1:2133\n656#1:1578,8\n656#1:1586,3\n656#1:1589,2\n656#1:1634,2\n656#1:1636,3\n656#1:1639\n678#1:1641,8\n678#1:1649,3\n678#1:1652,2\n678#1:1654\n678#1:1698,11\n678#1:1709,3\n678#1:1712\n678#1:1713\n690#1:1715,8\n690#1:1723,3\n690#1:1726,2\n690#1:1728\n690#1:1772,11\n690#1:1783,3\n690#1:1786\n690#1:1787\n1049#1:1810,3\n1049#1:1818,3\n1058#1:1822,18\n1058#1:1883,3\n1058#1:1886\n1058#1:1887\n1094#1:1889,8\n1094#1:1897,3\n1094#1:1900,2\n1094#1:1902\n1094#1:1947,11\n1094#1:1958,3\n1094#1:1961\n1094#1:1962\n1192#1:1971,8\n1192#1:1979,3\n1192#1:1982,2\n1192#1:1984\n1192#1:2029,11\n1192#1:2040,3\n1192#1:2043\n1192#1:2044\n1252#1:2127,3\n1252#1:2135,3\n656#1:1591,6\n656#1:1598,2\n656#1:1603,8\n656#1:1614,9\n656#1:1626,8\n678#1:1655,6\n678#1:1662,2\n678#1:1667,8\n678#1:1678,9\n678#1:1690,8\n690#1:1729,6\n690#1:1736,2\n690#1:1741,8\n690#1:1752,9\n690#1:1764,8\n1058#1:1840,6\n1058#1:1847,2\n1058#1:1852,8\n1058#1:1863,9\n1058#1:1875,8\n1094#1:1903,5\n1094#1:1909\n1094#1:1911,2\n1094#1:1916,8\n1094#1:1927,9\n1094#1:1939,8\n1192#1:1985,5\n1192#1:1991\n1192#1:1993,2\n1192#1:1998,8\n1192#1:2009,9\n1192#1:2021,8\n1221#1:2071,6\n1221#1:2078,2\n1221#1:2083,8\n1221#1:2094,9\n1221#1:2106,8\n656#1:1597\n678#1:1661\n690#1:1735\n1050#1:1814\n1058#1:1846\n1094#1:1910\n1192#1:1992\n1221#1:2077\n1253#1:2131\n1258#1:2134\n656#1:1600,3\n656#1:1623,3\n678#1:1664,3\n678#1:1687,3\n690#1:1738,3\n690#1:1761,3\n1058#1:1849,3\n1058#1:1872,3\n1094#1:1913,3\n1094#1:1936,3\n1192#1:1995,3\n1192#1:2018,3\n1221#1:2080,3\n1221#1:2103,3\n891#1:1789,15\n1048#1:1807\n1048#1:1809\n1221#1:2057\n1221#1:2058,13\n1221#1:2114\n1221#1:2115,10\n*E\n"})
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;

    @Nullable
    private SemanticsConfiguration _collapsedSemantics;

    @NotNull
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;

    @Nullable
    private LayoutNode _foldedParent;

    @Nullable
    private NodeCoordinator _innerLayerCoordinator;

    @Nullable
    private MutableVector<LayoutNode> _unfoldedChildren;

    @NotNull
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private int compositeKeyHash;

    @NotNull
    private CompositionLocalMap compositionLocalMap;
    private boolean deactivated;

    @NotNull
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;

    @Nullable
    private AndroidViewHolder interopViewFactoryHolder;

    @NotNull
    private final IntrinsicsPolicy intrinsicsPolicy;

    @NotNull
    private UsageByParent intrinsicsUsageByParent;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;

    @NotNull
    private final LayoutNodeLayoutDelegate layoutDelegate;

    @NotNull
    private LayoutDirection layoutDirection;

    @Nullable
    private LayoutNode lookaheadRoot;

    @NotNull
    private MeasurePolicy measurePolicy;

    @NotNull
    private Modifier modifier;
    private boolean needsOnPositionedDispatch;

    @NotNull
    private final NodeChain nodes;

    @Nullable
    private Function1<? super Owner, Unit> onAttach;

    @Nullable
    private Function1<? super Owner, Unit> onDetach;

    @Nullable
    private Owner owner;

    @NotNull
    private UsageByParent previousIntrinsicsUsageByParent;
    private int semanticsId;

    @Nullable
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;

    @NotNull
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo3measure3p2s80s(MeasureScope measureScope, List list, long j) {
            return (MeasureResult) m2934measure3p2s80s(measureScope, (List<? extends Measurable>) list, j);
        }

        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m2934measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };

    @NotNull
    private static final Function0<LayoutNode> Constructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };

    @NotNull
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo2933getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.INSTANCE.m3883getZeroMYxV2XQ();
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };

    @NotNull
    private static final Comparator<LayoutNode> ZComparator = new OooO0o(0);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "ZComparator", "Ljava/util/Comparator;", "getZComparator$ui_release", "()Ljava/util/Comparator;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        @NotNull
        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        @NotNull
        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "error", "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {

        @NotNull
        private final String error;

        public NoIntrinsicsMeasurePolicy(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2935maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2936maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2937minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2938minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @NotNull
        /* JADX INFO: renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m2935maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m2936maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m2937minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @NotNull
        /* JADX INFO: renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m2938minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ZComparator$lambda$38(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return (layoutNode.getZIndex() > layoutNode2.getZIndex() ? 1 : (layoutNode.getZIndex() == layoutNode2.getZIndex() ? 0 : -1)) == 0 ? Intrinsics.compare(layoutNode.getPlaceOrder$ui_release(), layoutNode2.getPlaceOrder$ui_release()) : Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.clearSubtreePlacementIntrinsicsUsage();
                }
                i++;
            } while (i < size);
        }
    }

    private final String debugTreeToString(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                sb.append(content[i2].debugTreeToString(depth + 1));
                i2++;
            } while (i2 < size);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "tree.toString()");
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.debugTreeToString(i);
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCompositeKeyHash$annotations() {
    }

    private final NodeCoordinator getInnerLayerCoordinator() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy = getOuterCoordinator$ui_release().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (!Intrinsics.areEqual(innerCoordinator$ui_release, wrappedBy)) {
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex();
    }

    @PublishedApi
    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m2925hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.m2929hitTestM_7yMNQ$ui_release(j, hitTestResult, z3, z2);
    }

    private final void invalidateFocusOnAttach() {
        if (this.nodes.has$ui_release(NodeKind.m3004constructorimpl(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | NodeKind.m3004constructorimpl(2048) | NodeKind.m3004constructorimpl(4096))) {
            for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
                if (((NodeKind.m3004constructorimpl(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) & head.getKindSet()) != 0) | ((NodeKind.m3004constructorimpl(2048) & head.getKindSet()) != 0) | ((NodeKind.m3004constructorimpl(4096) & head.getKindSet()) != 0)) {
                    NodeKindKt.autoInvalidateInsertedNode(head);
                }
            }
        }
    }

    private final void invalidateFocusOnDetach() {
        NodeChain nodeChain = this.nodes;
        int iM3004constructorimpl = NodeKind.m3004constructorimpl(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if ((nodeChain.getAggregateChildKindSet() & iM3004constructorimpl) != 0) {
            for (Modifier.Node tail = nodeChain.getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & iM3004constructorimpl) != 0) {
                    Modifier.Node nodePop = tail;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        if (nodePop instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                            if (focusTargetNode.getFocusState().isFocused()) {
                                LayoutNodeKt.requireOwner(this).getFocusOwner().clearFocus(true, false);
                                focusTargetNode.scheduleInvalidationForFocusEvents$ui_release();
                            }
                        } else if (((nodePop.getKindSet() & iM3004constructorimpl) != 0) && (nodePop instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                if ((delegate$ui_release.getKindSet() & iM3004constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            mutableVector.add(nodePop);
                                            nodePop = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.invalidateSubtree(z);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.invalidateUnfoldedVirtualChildren();
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m2927lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m2946getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m2931lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    private final void onChildRemoved(LayoutNode child) {
        if (child.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            child.detach$ui_release();
        }
        child._foldedParent = null;
        child.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = child._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                int i = 0;
                do {
                    content[i].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
                    i++;
                } while (i < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                LayoutNode[] content = vector.getContent();
                do {
                    LayoutNode layoutNode = content[i];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m2928remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m2945getLastConstraintsDWUhwKw();
        }
        return layoutNode.m2932remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z, z2);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRelayout$ui_release(z);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        layoutNode.requestRemeasure$ui_release(z, z2);
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        if (Intrinsics.areEqual(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.ensureLookaheadDelegateCreated$ui_release();
            NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
            for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
                outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
            }
        }
        invalidateMeasurements$ui_release();
    }

    private final boolean shouldInvalidateParentLayer() {
        if (this.nodes.m2967hasH91voCI$ui_release(NodeKind.m3004constructorimpl(4)) && !this.nodes.m2967hasH91voCI$ui_release(NodeKind.m3004constructorimpl(2))) {
            return true;
        }
        for (Modifier.Node head = this.nodes.getHead(); head != null; head = head.getChild()) {
            if (((NodeKind.m3004constructorimpl(2) & head.getKindSet()) != 0) && DelegatableNodeKt.m2903requireCoordinator64DMado(head, NodeKind.m3004constructorimpl(2)).getLayer() != null) {
                return false;
            }
            if ((NodeKind.m3004constructorimpl(4) & head.getKindSet()) != 0) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void attach$ui_release(@NotNull Owner owner) {
        Object[] objArr;
        LayoutNode layoutNode;
        Intrinsics.checkNotNullParameter(owner, "owner");
        int i = 0;
        if ((this.owner == null) != true) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + debugTreeToString$default(this, 0, 1, null)).toString());
        }
        LayoutNode layoutNode2 = this._foldedParent;
        if (layoutNode2 == null) {
            objArr = true;
        } else if (Intrinsics.areEqual(layoutNode2 != null ? layoutNode2.owner : null, owner)) {
            objArr = true;
        } else {
            objArr = false;
        }
        if (objArr != true) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(owner);
            sb.append(") than the parent's owner(");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb.append(parent$ui_release != null ? parent$ui_release.owner : null);
            sb.append("). This tree: ");
            sb.append(debugTreeToString$default(this, 0, 1, null));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode3 = this._foldedParent;
            sb.append(layoutNode3 != null ? debugTreeToString$default(layoutNode3, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 == null) {
            getMeasurePassDelegate$ui_release().setPlaced$ui_release(true);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setPlaced(true);
            }
        }
        getOuterCoordinator$ui_release().setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.owner = owner;
        this.depth = (parent$ui_release2 != null ? parent$ui_release2.depth : -1) + 1;
        if (this.nodes.m2967hasH91voCI$ui_release(NodeKind.m3004constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        owner.onAttach(this);
        if (this.isVirtualLookaheadRoot) {
            setLookaheadRoot(this);
        } else {
            LayoutNode layoutNode4 = this._foldedParent;
            if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                layoutNode = this.lookaheadRoot;
            }
            setLookaheadRoot(layoutNode);
        }
        if (!this.deactivated) {
            this.nodes.markAsAttached();
        }
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            do {
                content[i].attach$ui_release(owner);
                i++;
            } while (i < size);
        }
        if (!this.deactivated) {
            this.nodes.runAttachLifecycle();
        }
        invalidateMeasurements$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateMeasurements$ui_release();
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onLayoutNodeAttach();
        }
        Function1<? super Owner, Unit> function1 = this.onAttach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        this.layoutDelegate.updateParentData();
        if (this.deactivated) {
            return;
        }
        invalidateFocusOnAttach();
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb.append(parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        invalidateFocusOnDetach();
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (this.nodes.m2967hasH91voCI$ui_release(NodeKind.m3004constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        this.nodes.runDetachLifecycle$ui_release();
        this.ignoreRemeasureRequests = true;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            LayoutNode[] content = vector.getContent();
            int i = 0;
            do {
                content[i].detach$ui_release();
                i++;
            } while (i < size);
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui_release();
        owner.onDetach(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final void dispatchOnPositionedCallbacks$ui_release() {
        /*
            r11 = this;
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r11.getLayoutState$ui_release()
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.Idle
            if (r0 != r1) goto Lab
            boolean r0 = r11.getLayoutPending$ui_release()
            if (r0 != 0) goto Lab
            boolean r0 = r11.getMeasurePending$ui_release()
            if (r0 == 0) goto L16
            goto Lab
        L16:
            boolean r0 = r11.isPlaced()
            if (r0 != 0) goto L1d
            return
        L1d:
            androidx.compose.ui.node.NodeChain r0 = r11.nodes
            r1 = 256(0x100, float:3.59E-43)
            int r2 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r1)
            int r3 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r0)
            r3 = r3 & r2
            if (r3 == 0) goto Lab
            androidx.compose.ui.Modifier$Node r0 = r0.getHead()
        L30:
            if (r0 == 0) goto Lab
            int r3 = r0.getKindSet()
            r3 = r3 & r2
            if (r3 == 0) goto L9f
            r3 = 0
            r4 = r0
            r5 = r3
        L3c:
            if (r4 == 0) goto L9f
            boolean r6 = r4 instanceof androidx.compose.ui.node.GlobalPositionAwareModifierNode
            if (r6 == 0) goto L50
            androidx.compose.ui.node.GlobalPositionAwareModifierNode r4 = (androidx.compose.ui.node.GlobalPositionAwareModifierNode) r4
            int r6 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r1)
            androidx.compose.ui.node.NodeCoordinator r6 = androidx.compose.ui.node.DelegatableNodeKt.m2903requireCoordinator64DMado(r4, r6)
            r4.onGloballyPositioned(r6)
            goto L9a
        L50:
            int r6 = r4.getKindSet()
            r6 = r6 & r2
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L5b
            r6 = r8
            goto L5c
        L5b:
            r6 = r7
        L5c:
            if (r6 == 0) goto L9a
            boolean r6 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L9a
            r6 = r4
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.getDelegate()
            r9 = r7
        L6a:
            if (r6 == 0) goto L97
            int r10 = r6.getKindSet()
            r10 = r10 & r2
            if (r10 == 0) goto L75
            r10 = r8
            goto L76
        L75:
            r10 = r7
        L76:
            if (r10 == 0) goto L92
            int r9 = r9 + 1
            if (r9 != r8) goto L7e
            r4 = r6
            goto L92
        L7e:
            if (r5 != 0) goto L89
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r10 = 16
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r10]
            r5.<init>(r10, r7)
        L89:
            if (r4 == 0) goto L8f
            r5.add(r4)
            r4 = r3
        L8f:
            r5.add(r6)
        L92:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild()
            goto L6a
        L97:
            if (r9 != r8) goto L9a
            goto L3c
        L9a:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r5)
            goto L3c
        L9f:
            int r3 = r0.getAggregateChildKindSet()
            r3 = r3 & r2
            if (r3 == 0) goto Lab
            androidx.compose.ui.Modifier$Node r0 = r0.getChild()
            goto L30
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.dispatchOnPositionedCallbacks$ui_release():void");
    }

    public final void draw$ui_release(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getOuterCoordinator$ui_release().draw(canvas);
    }

    public final void forEachChild(@NotNull Function1<? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                block.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachChildIndexed(@NotNull Function2<? super Integer, ? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                block.invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachCoordinator$ui_release(@NotNull Function1<? super LayoutModifierNodeCoordinator, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            block.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(@NotNull Function1<? super NodeCoordinator, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            block.invoke(outerCoordinator$ui_release);
        }
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 1, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 1, null);
        }
        Constraints constraintsM2945getLastConstraintsDWUhwKw = this.layoutDelegate.m2945getLastConstraintsDWUhwKw();
        if (constraintsM2945getLastConstraintsDWUhwKw != null) {
            Owner owner = this.owner;
            if (owner != null) {
                owner.mo3059measureAndLayout0kLqBqw(this, constraintsM2945getLastConstraintsDWUhwKw.getValue());
                return;
            }
            return;
        }
        Owner owner2 = this.owner;
        if (owner2 != null) {
            OooO.OooO0o(owner2, false, 1, null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        return lookaheadAlignmentLinesOwner$ui_release != null && (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) != null && alignmentLines.getRequired$ui_release();
    }

    /* JADX INFO: renamed from: getCanMultiMeasure$ui_release, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    @NotNull
    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    @NotNull
    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    @NotNull
    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    @Nullable
    public final SemanticsConfiguration getCollapsedSemantics$ui_release() {
        if (!this.nodes.m2967hasH91voCI$ui_release(NodeKind.m3004constructorimpl(8)) || this._collapsedSemantics != null) {
            return this._collapsedSemantics;
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = new SemanticsConfiguration();
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$collapsedSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
            /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
                java.lang.NullPointerException
                */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                /*
                    r11 = this;
                    androidx.compose.ui.node.LayoutNode r0 = r11.this$0
                    androidx.compose.ui.node.NodeChain r0 = r0.getNodes()
                    r1 = 8
                    int r1 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r1)
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.semantics.SemanticsConfiguration> r2 = r2
                    int r3 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r0)
                    r3 = r3 & r1
                    if (r3 == 0) goto La7
                    androidx.compose.ui.Modifier$Node r0 = r0.getTail()
                L19:
                    if (r0 == 0) goto La7
                    int r3 = r0.getKindSet()
                    r3 = r3 & r1
                    if (r3 == 0) goto La1
                    r3 = 0
                    r4 = r0
                    r5 = r3
                L25:
                    if (r4 == 0) goto La1
                    boolean r6 = r4 instanceof androidx.compose.ui.node.SemanticsModifierNode
                    r7 = 1
                    if (r6 == 0) goto L53
                    androidx.compose.ui.node.SemanticsModifierNode r4 = (androidx.compose.ui.node.SemanticsModifierNode) r4
                    boolean r6 = r4.getIsClearingSemantics()
                    if (r6 == 0) goto L3e
                    androidx.compose.ui.semantics.SemanticsConfiguration r6 = new androidx.compose.ui.semantics.SemanticsConfiguration
                    r6.<init>()
                    r2.element = r6
                    r6.setClearingSemantics(r7)
                L3e:
                    boolean r6 = r4.getShouldMergeDescendantSemantics()
                    if (r6 == 0) goto L4b
                    T r6 = r2.element
                    androidx.compose.ui.semantics.SemanticsConfiguration r6 = (androidx.compose.ui.semantics.SemanticsConfiguration) r6
                    r6.setMergingSemanticsOfDescendants(r7)
                L4b:
                    T r6 = r2.element
                    androidx.compose.ui.semantics.SemanticsConfiguration r6 = (androidx.compose.ui.semantics.SemanticsConfiguration) r6
                    r4.applySemantics(r6)
                    goto L9c
                L53:
                    int r6 = r4.getKindSet()
                    r6 = r6 & r1
                    r8 = 0
                    if (r6 == 0) goto L5d
                    r6 = r7
                    goto L5e
                L5d:
                    r6 = r8
                L5e:
                    if (r6 == 0) goto L9c
                    boolean r6 = r4 instanceof androidx.compose.ui.node.DelegatingNode
                    if (r6 == 0) goto L9c
                    r6 = r4
                    androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
                    androidx.compose.ui.Modifier$Node r6 = r6.getDelegate()
                    r9 = r8
                L6c:
                    if (r6 == 0) goto L99
                    int r10 = r6.getKindSet()
                    r10 = r10 & r1
                    if (r10 == 0) goto L77
                    r10 = r7
                    goto L78
                L77:
                    r10 = r8
                L78:
                    if (r10 == 0) goto L94
                    int r9 = r9 + 1
                    if (r9 != r7) goto L80
                    r4 = r6
                    goto L94
                L80:
                    if (r5 != 0) goto L8b
                    androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
                    r10 = 16
                    androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r10]
                    r5.<init>(r10, r8)
                L8b:
                    if (r4 == 0) goto L91
                    r5.add(r4)
                    r4 = r3
                L91:
                    r5.add(r6)
                L94:
                    androidx.compose.ui.Modifier$Node r6 = r6.getChild()
                    goto L6c
                L99:
                    if (r9 != r7) goto L9c
                    goto L25
                L9c:
                    androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r5)
                    goto L25
                La1:
                    androidx.compose.ui.Modifier$Node r0 = r0.getParent()
                    goto L19
                La7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode$collapsedSemantics$1.invoke2():void");
            }
        });
        T t = objectRef.element;
        this._collapsedSemantics = (SemanticsConfiguration) t;
        return (SemanticsConfiguration) t;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public CompositionLocalMap getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getDepth$ui_release, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    @NotNull
    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asList();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long jM2988getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m2988getLastMeasurementConstraintsmsEJaDk$ui_release();
        return Constraints.m3741getHasFixedWidthimpl(jM2988getLastMeasurementConstraintsmsEJaDk$ui_release) && Constraints.m3740getHasFixedHeightimpl(jM2988getLastMeasurementConstraintsmsEJaDk$ui_release);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    @NotNull
    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator();
    }

    /* JADX INFO: renamed from: getInnerLayerCoordinatorIsDirty$ui_release, reason: from getter */
    public final boolean getInnerLayerCoordinatorIsDirty() {
        return this.innerLayerCoordinatorIsDirty;
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    @Nullable
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getInteropViewFactoryHolder$ui_release, reason: from getter */
    public final AndroidViewHolder getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntrinsicsPolicy$ui_release, reason: from getter */
    public final IntrinsicsPolicy getIntrinsicsPolicy() {
        return this.intrinsicsPolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: getIntrinsicsUsageByParent$ui_release, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutDelegate$ui_release, reason: from getter */
    public final LayoutNodeLayoutDelegate getLayoutDelegate() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending();
    }

    @NotNull
    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending();
    }

    @Nullable
    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate$ui_release() {
        return this.layoutDelegate.getLookaheadPassDelegate();
    }

    @Nullable
    /* JADX INFO: renamed from: getLookaheadRoot$ui_release, reason: from getter */
    public final LayoutNode getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    @NotNull
    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @NotNull
    public final LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate$ui_release() {
        return this.layoutDelegate.getMeasurePassDelegate();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @NotNull
    public final UsageByParent getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent();
    }

    @NotNull
    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        UsageByParent measuredByParent$ui_release;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        return (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent()) == null) ? UsageByParent.NotUsed : measuredByParent$ui_release;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    /* JADX INFO: renamed from: getNeedsOnPositionedDispatch$ui_release, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    @NotNull
    /* JADX INFO: renamed from: getNodes$ui_release, reason: from getter */
    public final NodeChain getNodes() {
        return this.nodes;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    @NotNull
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator();
    }

    @Nullable
    /* JADX INFO: renamed from: getOwner$ui_release, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    @Nullable
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        while (true) {
            boolean z = false;
            if (layoutNode != null && layoutNode.isVirtual) {
                z = true;
            }
            if (!z) {
                return layoutNode;
            }
            layoutNode = layoutNode._foldedParent;
        }
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @Nullable
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    @Nullable
    /* JADX INFO: renamed from: getSubcompositionsState$ui_release, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    @NotNull
    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @NotNull
    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m2929hitTestM_7yMNQ$ui_release(long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        getOuterCoordinator$ui_release().m2991hitTestYqVAtuI(NodeCoordinator.INSTANCE.getPointerInputSource(), getOuterCoordinator$ui_release().m2987fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
    }

    /* JADX INFO: renamed from: hitTestSemantics-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m2930hitTestSemanticsM_7yMNQ$ui_release(long pointerPosition, @NotNull HitTestResult hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitSemanticsEntities, "hitSemanticsEntities");
        getOuterCoordinator$ui_release().m2991hitTestYqVAtuI(NodeCoordinator.INSTANCE.getSemanticsSource(), getOuterCoordinator$ui_release().m2987fromParentPositionMKHz9U(pointerPosition), hitSemanticsEntities, true, isInLayer);
    }

    public final void ignoreRemeasureRequests$ui_release(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.ignoreRemeasureRequests = true;
        block.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void insertAt$ui_release(int index, @NotNull LayoutNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!(instance._foldedParent == null)) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(instance);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(debugTreeToString$default(this, 0, 1, null));
            sb.append(" Other tree: ");
            LayoutNode layoutNode = instance._foldedParent;
            sb.append(layoutNode != null ? debugTreeToString$default(layoutNode, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (!(instance.owner == null)) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + debugTreeToString$default(this, 0, 1, null) + " Other tree: " + debugTreeToString$default(instance, 0, 1, null)).toString());
        }
        instance._foldedParent = this;
        this._foldedChildren.add(index, instance);
        onZSortedChildrenInvalidated$ui_release();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner != null) {
            instance.attach$ui_release(owner);
        }
        if (instance.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator = getInnerLayerCoordinator();
        if (innerLayerCoordinator != null) {
            innerLayerCoordinator.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, 3, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, 3, null);
        }
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    public final void invalidateSemantics$ui_release() {
        this._collapsedSemantics = null;
        LayoutNodeKt.requireOwner(this).onSemanticsChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final void invalidateSubtree(boolean r11) {
        /*
            r10 = this;
            if (r11 == 0) goto Lb
            androidx.compose.ui.node.LayoutNode r11 = r10.getParent$ui_release()
            if (r11 == 0) goto Lb
            r11.invalidateLayer$ui_release()
        Lb:
            r10.invalidateSemantics$ui_release()
            r11 = 3
            r0 = 0
            r1 = 0
            requestRemeasure$ui_release$default(r10, r0, r0, r11, r1)
            androidx.compose.ui.node.NodeChain r11 = r10.nodes
            r2 = 2
            int r3 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r2)
            int r4 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r11)
            r4 = r4 & r3
            r5 = 1
            if (r4 == 0) goto La5
            androidx.compose.ui.Modifier$Node r11 = r11.getHead()
        L27:
            if (r11 == 0) goto La5
            int r4 = r11.getKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L99
            r4 = r11
            r6 = r1
        L32:
            if (r4 == 0) goto L99
            boolean r7 = r4 instanceof androidx.compose.ui.node.LayoutModifierNode
            if (r7 == 0) goto L4c
            androidx.compose.ui.node.LayoutModifierNode r4 = (androidx.compose.ui.node.LayoutModifierNode) r4
            int r7 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r2)
            androidx.compose.ui.node.NodeCoordinator r4 = androidx.compose.ui.node.DelegatableNodeKt.m2903requireCoordinator64DMado(r4, r7)
            androidx.compose.ui.node.OwnedLayer r4 = r4.getLayer()
            if (r4 == 0) goto L94
            r4.invalidate()
            goto L94
        L4c:
            int r7 = r4.getKindSet()
            r7 = r7 & r3
            if (r7 == 0) goto L55
            r7 = r5
            goto L56
        L55:
            r7 = r0
        L56:
            if (r7 == 0) goto L94
            boolean r7 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto L94
            r7 = r4
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate()
            r8 = r0
        L64:
            if (r7 == 0) goto L91
            int r9 = r7.getKindSet()
            r9 = r9 & r3
            if (r9 == 0) goto L6f
            r9 = r5
            goto L70
        L6f:
            r9 = r0
        L70:
            if (r9 == 0) goto L8c
            int r8 = r8 + 1
            if (r8 != r5) goto L78
            r4 = r7
            goto L8c
        L78:
            if (r6 != 0) goto L83
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            r9 = 16
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r9]
            r6.<init>(r9, r0)
        L83:
            if (r4 == 0) goto L89
            r6.add(r4)
            r4 = r1
        L89:
            r6.add(r7)
        L8c:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild()
            goto L64
        L91:
            if (r8 != r5) goto L94
            goto L32
        L94:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L32
        L99:
            int r4 = r11.getAggregateChildKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto La5
            androidx.compose.ui.Modifier$Node r11 = r11.getChild()
            goto L27
        La5:
            androidx.compose.runtime.collection.MutableVector r11 = r10.get_children$ui_release()
            int r1 = r11.getSize()
            if (r1 <= 0) goto Lbe
            java.lang.Object[] r11 = r11.getContent()
            r2 = r0
        Lb4:
            r3 = r11[r2]
            androidx.compose.ui.node.LayoutNode r3 = (androidx.compose.ui.node.LayoutNode) r3
            r3.invalidateSubtree(r0)
            int r2 = r2 + r5
            if (r2 < r1) goto Lb4
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.invalidateSubtree(boolean):void");
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().getIsPlaced();
    }

    @Nullable
    public final Boolean isPlacedInLookahead() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.getIsPlaced());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    /* JADX INFO: renamed from: isVirtualLookaheadRoot$ui_release, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m2931lookaheadRemeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.m2949remeasureBRTryo0(constraints.getValue());
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void move$ui_release(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i = 0; i < count; i++) {
            this._foldedChildren.add(from > to ? to + i : (to + count) - 2, this._foldedChildren.removeAt(from > to ? from + i : from));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        this.deactivated = true;
        resetModifierState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        /*
            r11 = this;
            androidx.compose.ui.node.NodeCoordinator r0 = r11.getInnerCoordinator$ui_release()
            r1 = 128(0x80, float:1.794E-43)
            int r1 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r1)
            boolean r2 = androidx.compose.ui.node.NodeKindKt.m3013getIncludeSelfInTraversalH91voCI(r1)
            androidx.compose.ui.Modifier$Node r3 = r0.getTail()
            if (r2 == 0) goto L15
            goto L1d
        L15:
            androidx.compose.ui.Modifier$Node r3 = r3.getParent()
            if (r3 != 0) goto L1d
            goto L9a
        L1d:
            androidx.compose.ui.Modifier$Node r0 = androidx.compose.ui.node.NodeCoordinator.access$headNode(r0, r2)
        L21:
            if (r0 == 0) goto L9a
            int r2 = r0.getAggregateChildKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L9a
            int r2 = r0.getKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L93
            r2 = 0
            r4 = r0
            r5 = r2
        L34:
            if (r4 == 0) goto L93
            boolean r6 = r4 instanceof androidx.compose.ui.node.LayoutAwareModifierNode
            if (r6 == 0) goto L44
            androidx.compose.ui.node.LayoutAwareModifierNode r4 = (androidx.compose.ui.node.LayoutAwareModifierNode) r4
            androidx.compose.ui.node.NodeCoordinator r6 = r11.getInnerCoordinator$ui_release()
            r4.onPlaced(r6)
            goto L8e
        L44:
            int r6 = r4.getKindSet()
            r6 = r6 & r1
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L4f
            r6 = r8
            goto L50
        L4f:
            r6 = r7
        L50:
            if (r6 == 0) goto L8e
            boolean r6 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L8e
            r6 = r4
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.getDelegate()
            r9 = r7
        L5e:
            if (r6 == 0) goto L8b
            int r10 = r6.getKindSet()
            r10 = r10 & r1
            if (r10 == 0) goto L69
            r10 = r8
            goto L6a
        L69:
            r10 = r7
        L6a:
            if (r10 == 0) goto L86
            int r9 = r9 + 1
            if (r9 != r8) goto L72
            r4 = r6
            goto L86
        L72:
            if (r5 != 0) goto L7d
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r10 = 16
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r10]
            r5.<init>(r10, r7)
        L7d:
            if (r4 == 0) goto L83
            r5.add(r4)
            r4 = r2
        L83:
            r5.add(r6)
        L86:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild()
            goto L5e
        L8b:
            if (r9 != r8) goto L8e
            goto L34
        L8e:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r5)
            goto L34
        L93:
            if (r0 == r3) goto L9a
            androidx.compose.ui.Modifier$Node r0 = r0.getChild()
            goto L21
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.onLayoutComplete():void");
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        NodeCoordinator wrapped = getInnerCoordinator$ui_release().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.onRelease();
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (!isAttached()) {
            throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
        }
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        if (this.deactivated) {
            this.deactivated = false;
        } else {
            resetModifierState();
        }
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        this.nodes.markAsAttached();
        this.nodes.runAttachLifecycle();
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.onZSortedChildrenInvalidated$ui_release();
        }
    }

    public final void place$ui_release(int x, int y) {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
        int measuredWidth = measurePassDelegate$ui_release.getMeasuredWidth();
        LayoutDirection layoutDirection = getLayoutDirection();
        LayoutNode parent$ui_release = getParent$ui_release();
        NodeCoordinator innerCoordinator$ui_release = parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null;
        LayoutCoordinates layoutCoordinates = Placeable.PlacementScope._coordinates;
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.layoutDelegate;
        Placeable.PlacementScope.parentWidth = measuredWidth;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        boolean zConfigureForPlacingForAlignment = companion.configureForPlacingForAlignment(innerCoordinator$ui_release);
        Placeable.PlacementScope.placeRelative$default(companion, measurePassDelegate$ui_release, x, y, 0.0f, 4, null);
        if (innerCoordinator$ui_release != null) {
            innerCoordinator$ui_release.setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
        }
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
        Placeable.PlacementScope._coordinates = layoutCoordinates;
        Placeable.PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m2932remeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate$ui_release().m2952remeasureBRTryo0(constraints.getValue());
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this._foldedChildren.clear();
                return;
            }
            onChildRemoved(this._foldedChildren.get(size));
        }
    }

    public final void removeAt$ui_release(int index, int count) {
        if (!(count >= 0)) {
            throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("count (", count, ") must be greater than 0").toString());
        }
        int i = (count + index) - 1;
        if (index > i) {
            return;
        }
        while (true) {
            onChildRemoved(this._foldedChildren.removeAt(i));
            if (i == index) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void requestLookaheadRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, forceRequest);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (!(this.lookaheadRoot != null)) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this, true, forceRequest, scheduleMeasureAndLayout);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(forceRequest);
    }

    public final void requestRelayout$ui_release(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        OooO.OooO0oo(owner, this, false, forceRequest, 2, null);
    }

    public final void requestRemeasure$ui_release(boolean forceRequest, boolean scheduleMeasureAndLayout) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        OooO.OooO0oO(owner, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(forceRequest);
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(@NotNull LayoutNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (WhenMappings.$EnumSwitchMapping$0[it.getLayoutState$ui_release().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.getLayoutState$ui_release());
        }
        if (it.getMeasurePending$ui_release()) {
            requestRemeasure$ui_release$default(it, true, false, 2, null);
            return;
        }
        if (it.getLayoutPending$ui_release()) {
            it.requestRelayout$ui_release(true);
        } else if (it.getLookaheadMeasurePending$ui_release()) {
            requestLookaheadRemeasure$ui_release$default(it, true, false, 2, null);
        } else if (it.getLookaheadLayoutPending$ui_release()) {
            it.requestLookaheadRelayout$ui_release(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = content[i];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.canMultiMeasure = z;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @ExperimentalComposeUiApi
    public void setCompositeKeyHash(int i) {
        this.compositeKeyHash = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositionLocalMap(@org.jetbrains.annotations.NotNull androidx.compose.runtime.CompositionLocalMap r10) {
        /*
            r9 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r9.compositionLocalMap = r10
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r10.get(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            r9.setDensity(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r10.get(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            r9.setLayoutDirection(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r10 = r10.get(r0)
            androidx.compose.ui.platform.ViewConfiguration r10 = (androidx.compose.ui.platform.ViewConfiguration) r10
            r9.setViewConfiguration(r10)
            androidx.compose.ui.node.NodeChain r10 = r9.nodes
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r0)
            int r1 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r10)
            r1 = r1 & r0
            if (r1 == 0) goto Lc4
            androidx.compose.ui.Modifier$Node r10 = r10.getHead()
        L42:
            if (r10 == 0) goto Lc4
            int r1 = r10.getKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto Lb7
            r1 = 0
            r2 = r10
            r3 = r1
        L4e:
            if (r2 == 0) goto Lb7
            boolean r4 = r2 instanceof androidx.compose.ui.node.CompositionLocalConsumerModifierNode
            r5 = 1
            if (r4 == 0) goto L69
            androidx.compose.ui.node.CompositionLocalConsumerModifierNode r2 = (androidx.compose.ui.node.CompositionLocalConsumerModifierNode) r2
            androidx.compose.ui.Modifier$Node r2 = r2.getNode()
            boolean r4 = r2.getIsAttached()
            if (r4 == 0) goto L65
            androidx.compose.ui.node.NodeKindKt.autoInvalidateUpdatedNode(r2)
            goto Lb2
        L65:
            r2.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(r5)
            goto Lb2
        L69:
            int r4 = r2.getKindSet()
            r4 = r4 & r0
            r6 = 0
            if (r4 == 0) goto L73
            r4 = r5
            goto L74
        L73:
            r4 = r6
        L74:
            if (r4 == 0) goto Lb2
            boolean r4 = r2 instanceof androidx.compose.ui.node.DelegatingNode
            if (r4 == 0) goto Lb2
            r4 = r2
            androidx.compose.ui.node.DelegatingNode r4 = (androidx.compose.ui.node.DelegatingNode) r4
            androidx.compose.ui.Modifier$Node r4 = r4.getDelegate()
            r7 = r6
        L82:
            if (r4 == 0) goto Laf
            int r8 = r4.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto L8d
            r8 = r5
            goto L8e
        L8d:
            r8 = r6
        L8e:
            if (r8 == 0) goto Laa
            int r7 = r7 + 1
            if (r7 != r5) goto L96
            r2 = r4
            goto Laa
        L96:
            if (r3 != 0) goto La1
            androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
            r8 = 16
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r8]
            r3.<init>(r8, r6)
        La1:
            if (r2 == 0) goto La7
            r3.add(r2)
            r2 = r1
        La7:
            r3.add(r4)
        Laa:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            goto L82
        Laf:
            if (r7 != r5) goto Lb2
            goto L4e
        Lb2:
            androidx.compose.ui.Modifier$Node r2 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r3)
            goto L4e
        Lb7:
            int r1 = r10.getAggregateChildKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto Lc4
            androidx.compose.ui.Modifier$Node r10 = r10.getChild()
            goto L42
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.setCompositionLocalMap(androidx.compose.runtime.CompositionLocalMap):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(@org.jetbrains.annotations.NotNull androidx.compose.ui.unit.Density r11) {
        /*
            r10 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            androidx.compose.ui.unit.Density r0 = r10.density
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r11)
            if (r0 != 0) goto L96
            r10.density = r11
            r10.onDensityOrLayoutDirectionChanged()
            androidx.compose.ui.node.NodeChain r11 = r10.nodes
            r0 = 16
            int r1 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r0)
            int r2 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r11)
            r2 = r2 & r1
            if (r2 == 0) goto L96
            androidx.compose.ui.Modifier$Node r11 = r11.getHead()
        L25:
            if (r11 == 0) goto L96
            int r2 = r11.getKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L8a
            r2 = 0
            r3 = r11
            r4 = r2
        L31:
            if (r3 == 0) goto L8a
            boolean r5 = r3 instanceof androidx.compose.ui.node.PointerInputModifierNode
            if (r5 == 0) goto L3d
            androidx.compose.ui.node.PointerInputModifierNode r3 = (androidx.compose.ui.node.PointerInputModifierNode) r3
            r3.onDensityChange()
            goto L85
        L3d:
            int r5 = r3.getKindSet()
            r5 = r5 & r1
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L48
            r5 = r7
            goto L49
        L48:
            r5 = r6
        L49:
            if (r5 == 0) goto L85
            boolean r5 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r5 == 0) goto L85
            r5 = r3
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.getDelegate()
            r8 = r6
        L57:
            if (r5 == 0) goto L82
            int r9 = r5.getKindSet()
            r9 = r9 & r1
            if (r9 == 0) goto L62
            r9 = r7
            goto L63
        L62:
            r9 = r6
        L63:
            if (r9 == 0) goto L7d
            int r8 = r8 + 1
            if (r8 != r7) goto L6b
            r3 = r5
            goto L7d
        L6b:
            if (r4 != 0) goto L74
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r0]
            r4.<init>(r9, r6)
        L74:
            if (r3 == 0) goto L7a
            r4.add(r3)
            r3 = r2
        L7a:
            r4.add(r5)
        L7d:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L57
        L82:
            if (r8 != r7) goto L85
            goto L31
        L85:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r4)
            goto L31
        L8a:
            int r2 = r11.getAggregateChildKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L96
            androidx.compose.ui.Modifier$Node r11 = r11.getChild()
            goto L25
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.setDensity(androidx.compose.ui.unit.Density):void");
    }

    public final void setDepth$ui_release(int i) {
        this.depth = i;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z) {
        this.innerLayerCoordinatorIsDirty = z;
    }

    public final void setInteropViewFactoryHolder$ui_release(@Nullable AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(@NotNull UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.intrinsicsUsageByParent = usageByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(@NotNull LayoutDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.layoutDirection != value) {
            this.layoutDirection = value;
            onDensityOrLayoutDirectionChanged();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(@NotNull MeasurePolicy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.measurePolicy, value)) {
            return;
        }
        this.measurePolicy = value;
        this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
        invalidateMeasurements$ui_release();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(@NotNull Modifier value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(!this.isVirtual || getModifier() == Modifier.INSTANCE)) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.modifier = value;
        this.nodes.updateFrom$ui_release(value);
        this.layoutDelegate.updateParentData();
        if (this.nodes.m2967hasH91voCI$ui_release(NodeKind.m3004constructorimpl(ConstantsKt.MINIMUM_BLOCK_SIZE)) && this.lookaheadRoot == null) {
            setLookaheadRoot(this);
        }
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.needsOnPositionedDispatch = z;
    }

    public final void setOnAttach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    public final void setOnDetach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    public void setSemanticsId(int i) {
        this.semanticsId = i;
    }

    public final void setSubcompositionsState$ui_release(@Nullable LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(@org.jetbrains.annotations.NotNull androidx.compose.ui.platform.ViewConfiguration r11) {
        /*
            r10 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            androidx.compose.ui.platform.ViewConfiguration r0 = r10.viewConfiguration
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r11)
            if (r0 != 0) goto L93
            r10.viewConfiguration = r11
            androidx.compose.ui.node.NodeChain r11 = r10.nodes
            r0 = 16
            int r1 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r0)
            int r2 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r11)
            r2 = r2 & r1
            if (r2 == 0) goto L93
            androidx.compose.ui.Modifier$Node r11 = r11.getHead()
        L22:
            if (r11 == 0) goto L93
            int r2 = r11.getKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L87
            r2 = 0
            r3 = r11
            r4 = r2
        L2e:
            if (r3 == 0) goto L87
            boolean r5 = r3 instanceof androidx.compose.ui.node.PointerInputModifierNode
            if (r5 == 0) goto L3a
            androidx.compose.ui.node.PointerInputModifierNode r3 = (androidx.compose.ui.node.PointerInputModifierNode) r3
            r3.onViewConfigurationChange()
            goto L82
        L3a:
            int r5 = r3.getKindSet()
            r5 = r5 & r1
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L45
            r5 = r7
            goto L46
        L45:
            r5 = r6
        L46:
            if (r5 == 0) goto L82
            boolean r5 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r5 == 0) goto L82
            r5 = r3
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.getDelegate()
            r8 = r6
        L54:
            if (r5 == 0) goto L7f
            int r9 = r5.getKindSet()
            r9 = r9 & r1
            if (r9 == 0) goto L5f
            r9 = r7
            goto L60
        L5f:
            r9 = r6
        L60:
            if (r9 == 0) goto L7a
            int r8 = r8 + 1
            if (r8 != r7) goto L68
            r3 = r5
            goto L7a
        L68:
            if (r4 != 0) goto L71
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r0]
            r4.<init>(r9, r6)
        L71:
            if (r3 == 0) goto L77
            r4.add(r3)
            r3 = r2
        L77:
            r4.add(r5)
        L7a:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L54
        L7f:
            if (r8 != r7) goto L82
            goto L2e
        L82:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r4)
            goto L2e
        L87:
            int r2 = r11.getAggregateChildKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L93
            androidx.compose.ui.Modifier$Node r11 = r11.getChild()
            goto L22
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.setViewConfiguration(androidx.compose.ui.platform.ViewConfiguration):void");
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z) {
        this.isVirtualLookaheadRoot = z;
    }

    @NotNull
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public LayoutNode(boolean z, int i) {
        this.isVirtual = z;
        this.semanticsId = i;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
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
                this.this$0.getLayoutDelegate().markChildrenDirty();
            }
        });
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = LayoutNodeKt.DefaultDensity;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.compositionLocalMap = CompositionLocalMap.INSTANCE.getEmpty();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = Modifier.INSTANCE;
    }

    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i);
    }
}
