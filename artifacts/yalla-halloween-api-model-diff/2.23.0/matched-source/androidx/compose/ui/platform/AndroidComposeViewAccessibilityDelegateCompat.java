package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.TempListUtilsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.collect.ReportItem;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 £\u00022\u00020\u0001:\u000e¤\u0002¥\u0002¦\u0002£\u0002§\u0002¨\u0002©\u0002B\u0013\u0012\b\u0010§\u0001\u001a\u00030¦\u0001¢\u0006\u0006\b¡\u0002\u0010¢\u0002J-\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ;\u0010\n\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u001f\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\u001f\u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0016J\u000f\u0010+\u001a\u00020\u0015H\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u0015H\u0086@ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u0017\u00102\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b0\u00101J#\u00107\u001a\u00020\u00152\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f03H\u0001¢\u0006\u0004\b5\u00106J\u001f\u0010=\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u00132\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b;\u0010<J\u0012\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J \u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u00130Aj\b\u0012\u0004\u0012\u00020\u0013`B2\u0006\u0010@\u001a\u00020\u0002H\u0002J@\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00130D2\u0006\u0010@\u001a\u00020\u00022\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00130D2\u001a\b\u0002\u0010G\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130D0FH\u0002J$\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130D2\u0006\u0010@\u001a\u00020\u00022\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00130DH\u0002J\b\u0010K\u001a\u00020\u0015H\u0002J\u0010\u0010M\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0018\u0010N\u001a\u00020\u00152\u0006\u0010L\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0018\u0010Q\u001a\u00020\u00152\u0006\u0010L\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010R\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0018\u0010S\u001a\u00020\u00152\u0006\u0010L\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0018\u0010V\u001a\u00020\u00152\u0006\u0010L\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010W\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010X\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J=\u0010\\\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010[\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010ZH\u0002¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J?\u0010d\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010_\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010\u00042\b\u0010a\u001a\u0004\u0018\u00010\u00042\b\u0010c\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\"\u0010j\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010g\u001a\u00020\u00042\b\u0010i\u001a\u0004\u0018\u00010hH\u0002J*\u0010l\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020>2\u0006\u0010k\u001a\u00020O2\b\u0010i\u001a\u0004\u0018\u00010hH\u0002J\u001c\u0010q\u001a\u0004\u0018\u00010p2\b\u0010m\u001a\u0004\u0018\u00010\u00132\u0006\u0010o\u001a\u00020nH\u0002J\u0010\u0010r\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J/\u0010u\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010s*\u00020b2\b\u0010c\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010t\u001a\u00020\u0004H\u0002¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.H\u0002J\u001e\u0010z\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00040xH\u0002J\b\u0010{\u001a\u00020\u0015H\u0002J\b\u0010|\u001a\u00020\u0015H\u0002J\u0018\u0010\u007f\u001a\u00020\u00152\u0006\u0010}\u001a\u00020\u00042\u0006\u0010~\u001a\u00020OH\u0002J!\u0010\u0082\u0001\u001a\u00020\u00022\u0006\u0010}\u001a\u00020\u00042\u000e\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010ZH\u0002J\u0013\u0010\u0084\u0001\u001a\u00020\u00152\b\u0010\u0083\u0001\u001a\u00030\u0080\u0001H\u0002J%\u0010\u0087\u0001\u001a\u00020\u00152\u0007\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00042\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010OH\u0002J\u0010\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u0001*\u00020%H\u0002J\u0010\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u0001*\u00020\u0013H\u0002J\u001e\u0010\u008e\u0001\u001a\u00020\u00152\u0007\u0010\u008c\u0001\u001a\u00020\u00042\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0002J\u0012\u0010\u008f\u0001\u001a\u00020\u00152\u0007\u0010\u008c\u0001\u001a\u00020\u0004H\u0002J\t\u0010\u0090\u0001\u001a\u00020\u0015H\u0002J\u0011\u0010\u0091\u0001\u001a\u00020\u00152\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0019\u0010\u0092\u0001\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u00132\u0006\u0010:\u001a\u000209H\u0002J\u0011\u0010\u0093\u0001\u001a\u00020\u00042\u0006\u0010}\u001a\u00020\u0004H\u0002J,\u0010\u0097\u0001\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00132\u0007\u0010\u0094\u0001\u001a\u00020\u00042\u0007\u0010\u0095\u0001\u001a\u00020\u00022\u0007\u0010\u0096\u0001\u001a\u00020\u0002H\u0002J\u0012\u0010\u0098\u0001\u001a\u00020\u00152\u0007\u0010\u0085\u0001\u001a\u00020\u0004H\u0002J,\u0010\u009c\u0001\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00132\u0007\u0010\u0099\u0001\u001a\u00020\u00042\u0007\u0010\u009a\u0001\u001a\u00020\u00042\u0007\u0010\u009b\u0001\u001a\u00020\u0002H\u0002J\u0011\u0010\u009d\u0001\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0011\u0010\u009e\u0001\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0013H\u0002J\u0011\u0010\u009f\u0001\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u0013H\u0002J\u001f\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00012\b\u0010L\u001a\u0004\u0018\u00010\u00132\u0007\u0010\u0094\u0001\u001a\u00020\u0004H\u0002J\u0015\u0010¢\u0001\u001a\u0004\u0018\u00010O2\b\u0010L\u001a\u0004\u0018\u00010\u0013H\u0002J\u0011\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u0001*\u00030£\u0001H\u0002R\u001d\u0010§\u0001\u001a\u00030¦\u00018\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R)\u0010«\u0001\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R'\u0010²\u0001\u001a\u00030±\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b²\u0001\u0010³\u0001\u0012\u0005\b¶\u0001\u0010*\u001a\u0006\b´\u0001\u0010µ\u0001R)\u0010·\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R'\u0010¾\u0001\u001a\u00030½\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b¾\u0001\u0010¿\u0001\u0012\u0005\bÂ\u0001\u0010*\u001a\u0006\bÀ\u0001\u0010Á\u0001R'\u0010Ä\u0001\u001a\u00030Ã\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\bÄ\u0001\u0010Å\u0001\u0012\u0005\bÈ\u0001\u0010*\u001a\u0006\bÆ\u0001\u0010Ç\u0001RD\u0010Ë\u0001\u001a-\u0012\u000f\u0012\r Ê\u0001*\u0005\u0018\u00010É\u00010É\u0001 Ê\u0001*\u0015\u0012\u000f\u0012\r Ê\u0001*\u0005\u0018\u00010É\u00010É\u0001\u0018\u00010Z0D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0018\u0010Î\u0001\u001a\u00030Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0019\u0010Ð\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0019\u0010Ò\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010¬\u0001R'\u0010Ô\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020b0Ó\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R,\u0010Ö\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u0004030Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010Õ\u0001R\u0019\u0010×\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010¬\u0001R\u001b\u0010Ø\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001d\u0010Ú\u0001\u001a\b\u0012\u0004\u0012\u00020.0x8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001e\u0010Ý\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150Ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0019\u0010ß\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010¸\u0001R)\u0010à\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bà\u0001\u0010¸\u0001\u001a\u0006\bá\u0001\u0010º\u0001\"\u0006\bâ\u0001\u0010¼\u0001R,\u0010ã\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0006\bç\u0001\u0010è\u0001R-\u0010ê\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u008a\u00010é\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bê\u0001\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001R%\u0010î\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040x8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bî\u0001\u0010Û\u0001\u001a\u0006\bï\u0001\u0010ð\u0001R\u001c\u0010ò\u0001\u001a\u0005\u0018\u00010ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R2\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f038@@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\r\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0005\b÷\u0001\u00106R\u001f\u0010ø\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040x8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010Û\u0001RG\u0010û\u0001\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040ù\u0001j\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`ú\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002RG\u0010\u0081\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040ù\u0001j\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`ú\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0081\u0002\u0010ü\u0001\u001a\u0006\b\u0082\u0002\u0010þ\u0001\"\u0006\b\u0083\u0002\u0010\u0080\u0002R\u001f\u0010\u0084\u0002\u001a\u00020O8\u0000X\u0080D¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001f\u0010\u0088\u0002\u001a\u00020O8\u0000X\u0080D¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010\u0085\u0002\u001a\u0006\b\u0089\u0002\u0010\u0087\u0002R\u0018\u0010\u008b\u0002\u001a\u00030\u008a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R;\u0010\u008d\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002090F8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b\u008d\u0002\u0010ô\u0001\u0012\u0005\b\u0090\u0002\u0010*\u001a\u0006\b\u008e\u0002\u0010ö\u0001\"\u0005\b\u008f\u0002\u00106R\u0019\u0010\u0091\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0019\u0010\u0093\u0002\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010¸\u0001R\u0018\u0010\u0095\u0002\u001a\u00030\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0096\u0002R\u001e\u0010\u0097\u0002\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010D8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0002\u0010Ì\u0001R%\u0010\u0099\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0004\u0012\u00020\u00150\u0098\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001e\u0010\u009d\u0002\u001a\u00020\u00028@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u009c\u0002\u0010*\u001a\u0006\b\u009b\u0002\u0010º\u0001R\u0017\u0010\u009e\u0002\u001a\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010º\u0001R\u0017\u0010\u009f\u0002\u001a\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010º\u0001R\u0017\u0010 \u0002\u001a\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0002\u0010º\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006ª\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/OooO00o;", "", "vertical", "", "direction", "Landroidx/compose/ui/geometry/Offset;", "position", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "canScroll", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "canScroll-moWRBKg$ui_release", "(Ljava/util/Collection;ZIJ)Z", "virtualViewId", "Lo0000O/o0Oo0oo;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "populateAccessibilityNodeInfoProperties", "eventType", "Landroid/view/accessibility/AccessibilityEvent;", "createEvent$ui_release", "(II)Landroid/view/accessibility/AccessibilityEvent;", "createEvent", "Landroid/view/MotionEvent;", "event", "dispatchHoverEvent", "", "x", "y", "hitTestSemanticsAt$ui_release", "(FF)I", "hitTestSemanticsAt", "Landroid/view/View;", ReportItem.RequestKeyHost, "Lo0000O/o0OO00O;", "getAccessibilityNodeProvider", "onSemanticsChange$ui_release", "()V", "onSemanticsChange", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "onLayoutChange$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "onLayoutChange", "", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents$ui_release", "(Ljava/util/Map;)V", "sendSemanticsPropertyChangeEvents", "newNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "oldNode", "sendContentCaptureSemanticsStructureChangeEvents$ui_release", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;)V", "sendContentCaptureSemanticsStructureChangeEvents", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createNodeInfo", "layoutIsRtl", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "semanticComparator", "", "parentListToSort", "", "containerChildrenMapping", "sortByGeometryGroupings", "listToSort", "subtreeSortedByGeometryGrouping", "setTraversalValues", "node", "isScreenReaderFocusable", "setContentInvalid", "", "getInfoStateDescriptionOrNull", "setStateDescription", "getInfoIsCheckable", "setIsCheckable", "Landroid/text/SpannableString;", "getInfoText", "setText", "isAccessibilityFocused", "requestAccessibilityFocus", "contentChangeType", "", "contentDescription", "sendEventForVirtualView", "(IILjava/lang/Integer;Ljava/util/List;)Z", "sendEvent", "fromIndex", "toIndex", "itemCount", "", ViewHierarchyConstants.TEXT_KEY, "createTextSelectionChangedEvent", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "clearAccessibilityFocus", NativeProtocol.WEB_DIALOG_ACTION, "Landroid/os/Bundle;", "arguments", "performActionHelper", "extraDataKey", "addExtraDataToAccessibilityNodeInfoHelper", "textNode", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroid/graphics/RectF;", "toScreenCoords", "updateHoveredVirtualView", "T", "size", "trimToSize", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "notifySubtreeAccessibilityStateChangedIfNeeded", "Lo00o0O/OooOOO0;", "subtreeChangedSemanticsNodesIds", "sendSubtreeChangeAccessibilityEvents", "checkForSemanticsChanges", "updateSemanticsNodesCopyAndPanes", "id", "newText", "sendContentCaptureTextUpdateEvent", "Landroidx/compose/ui/platform/ScrollObservationScope;", "oldScrollObservationScopes", "registerScrollingId", "scrollObservationScope", "sendScrollEventIfNeeded", "semanticsNodeId", ShareConstants.WEB_DIALOG_PARAM_TITLE, "sendPaneChangeEvents", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSessionCompat", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "toViewStructure", "virtualId", "viewStructure", "bufferContentCaptureViewAppeared", "bufferContentCaptureViewDisappeared", "notifyContentCaptureChanges", "notifySubtreeAppeared", "sendAccessibilitySemanticsStructureChangeEvents", "semanticsNodeIdToAccessibilityVirtualNodeId", "granularity", "forward", "extendSelection", "traverseAtGranularity", "sendPendingTextTraversedAtGranularityEvent", "start", "end", "traversalMode", "setAccessibilitySelection", "getAccessibilitySelectionStart", "getAccessibilitySelectionEnd", "isAccessibilitySelectionExtendable", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIteratorForGranularity", "getIterableTextForAccessibility", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/text/AnnotatedString;", "getTextForTextField", "Landroidx/compose/ui/platform/AndroidComposeView;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "hoveredVirtualViewId", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release", "()Landroid/view/accessibility/AccessibilityManager;", "getAccessibilityManager$ui_release$annotations", "accessibilityForceEnabledForTesting", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "getEnabledStateListener$ui_release$annotations", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release", "()Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "getTouchExplorationStateListener$ui_release$annotations", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "enabledServices", "Ljava/util/List;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "nodeProvider", "Lo0000O/o0OO00O;", "focusedVirtualViewId", "Lo00o0O/Oooo0;", "actionIdToLabel", "Lo00o0O/Oooo0;", "labelToActionId", "accessibilityCursorPosition", "previousTraversedNode", "Ljava/lang/Integer;", "subtreeChangedLayoutNodes", "Lo00o0O/OooOOO0;", "Lkotlinx/coroutines/channels/Channel;", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "currentSemanticsNodesInvalidated", "contentCaptureForceEnabledForTesting", "getContentCaptureForceEnabledForTesting$ui_release", "setContentCaptureForceEnabledForTesting$ui_release", "contentCaptureSession", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "Lo00o0O/OooOO0;", "bufferedContentCaptureAppearedNodes", "Lo00o0O/OooOO0;", "getBufferedContentCaptureAppearedNodes$ui_release", "()Lo00o0O/OooOO0;", "bufferedContentCaptureDisappearedNodes", "getBufferedContentCaptureDisappearedNodes$ui_release", "()Lo00o0O/OooOOO0;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "Ljava/util/Map;", "getCurrentSemanticsNodes$ui_release", "()Ljava/util/Map;", "setCurrentSemanticsNodes$ui_release", "paneDisplayed", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "idToBeforeMap", "Ljava/util/HashMap;", "getIdToBeforeMap$ui_release", "()Ljava/util/HashMap;", "setIdToBeforeMap$ui_release", "(Ljava/util/HashMap;)V", "idToAfterMap", "getIdToAfterMap$ui_release", "setIdToAfterMap$ui_release", "EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL", "Ljava/lang/String;", "getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release", "()Ljava/lang/String;", "EXTRA_DATA_TEST_TRAVERSALAFTER_VAL", "getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "previousSemanticsNodes", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "getPreviousSemanticsNodes$ui_release$annotations", "previousSemanticsRoot", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "scrollObservationScopes", "Lkotlin/Function1;", "sendScrollEventIfNeededLambda", "Lkotlin/jvm/functions/Function1;", "isEnabled$ui_release", "isEnabled$ui_release$annotations", "isEnabled", "isEnabledForAccessibility", "isEnabledForContentCapture", "isTouchExplorationEnabled", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Companion", "Api24Impl", "Api28Impl", "Api29Impl", "MyNodeProvider", "PendingTextTraversedEvent", "SemanticsNodeCopy", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,3490:1\n1747#2,3:3491\n33#3,6:3494\n33#3,6:3500\n33#3,6:3506\n33#3,6:3512\n69#3,6:3518\n69#3,6:3524\n33#3,6:3531\n33#3,6:3541\n33#3,6:3547\n151#3,3:3553\n33#3,4:3556\n154#3,2:3560\n38#3:3562\n156#3:3563\n151#3,3:3564\n33#3,4:3567\n154#3,2:3571\n38#3:3573\n156#3:3574\n33#3,6:3575\n33#3,6:3581\n33#3,6:3587\n33#3,6:3593\n33#3,6:3599\n33#3,6:3605\n1#4:3530\n37#5,2:3537\n76#6:3539\n76#6:3540\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n487#1:3491,3\n652#1:3494,6\n718#1:3500,6\n803#1:3506,6\n1201#1:3512,6\n1212#1:3518,6\n1219#1:3524,6\n1899#1:3531,6\n2601#1:3541,6\n2605#1:3547,6\n2854#1:3553,3\n2854#1:3556,4\n2854#1:3560,2\n2854#1:3562\n2854#1:3563\n2861#1:3564,3\n2861#1:3567,4\n2861#1:3571,2\n2861#1:3573\n2861#1:3574\n2869#1:3575,6\n2879#1:3581,6\n2897#1:3587,6\n2911#1:3593,6\n2924#1:3599,6\n712#1:3605,6\n1964#1:3537,2\n2080#1:3539\n2251#1:3540\n*E\n"})
public final class AndroidComposeViewAccessibilityDelegateCompat extends androidx.core.view.OooO00o {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;

    @NotNull
    public static final String ClassName = "android.view.View";

    @NotNull
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";

    @NotNull
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;

    @NotNull
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;

    @NotNull
    public static final String TextClassName = "android.widget.TextView";

    @NotNull
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;

    @NotNull
    private final String EXTRA_DATA_TEST_TRAVERSALAFTER_VAL;

    @NotNull
    private final String EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;

    @NotNull
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    @NotNull
    private p188o00o0O.Oooo0<p188o00o0O.Oooo0<CharSequence>> actionIdToLabel;

    @NotNull
    private final Channel<Unit> boundsUpdateChannel;

    @NotNull
    private final p188o00o0O.OooOO0<Integer, ViewStructureCompat> bufferedContentCaptureAppearedNodes;

    @NotNull
    private final p188o00o0O.OooOOO0<Integer> bufferedContentCaptureDisappearedNodes;
    private boolean checkingForSemanticsChanges;
    private boolean contentCaptureForceEnabledForTesting;

    @Nullable
    private ContentCaptureSessionCompat contentCaptureSession;

    @NotNull
    private Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private List<AccessibilityServiceInfo> enabledServices;

    @NotNull
    private final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;

    @NotNull
    private final Handler handler;
    private int hoveredVirtualViewId;

    @NotNull
    private HashMap<Integer, Integer> idToAfterMap;

    @NotNull
    private HashMap<Integer, Integer> idToBeforeMap;

    @NotNull
    private p188o00o0O.Oooo0<Map<CharSequence, Integer>> labelToActionId;

    @NotNull
    private o0000O.o0OO00O nodeProvider;

    @NotNull
    private p188o00o0O.OooOOO0<Integer> paneDisplayed;

    @Nullable
    private PendingTextTraversedEvent pendingTextTraversedEvent;

    @NotNull
    private Map<Integer, SemanticsNodeCopy> previousSemanticsNodes;

    @NotNull
    private SemanticsNodeCopy previousSemanticsRoot;

    @Nullable
    private Integer previousTraversedNode;

    @NotNull
    private final List<ScrollObservationScope> scrollObservationScopes;

    @NotNull
    private final Runnable semanticsChangeChecker;

    @NotNull
    private final Function1<ScrollObservationScope, Unit> sendScrollEventIfNeededLambda;

    @NotNull
    private final p188o00o0O.OooOOO0<LayoutNode> subtreeChangedLayoutNodes;

    @NotNull
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;

    @NotNull
    private final URLSpanCache urlSpanCache;

    @NotNull
    private final AndroidComposeView view;

    @NotNull
    private static final int[] AccessibilityActionsResourceIds = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    @RequiresApi(24)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "Lo0000O/o0Oo0oo;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "addSetProgressAction", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Api24Impl {

        @NotNull
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        @DoNotInline
        public static final void addSetProgressAction(@NotNull o0000O.o0Oo0oo info, @NotNull SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    @RequiresApi(28)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl;", "", "()V", "setScrollEventDelta", "", "event", "Landroid/view/accessibility/AccessibilityEvent;", "deltaX", "", "deltaY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api28Impl {

        @NotNull
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @JvmStatic
        @DoNotInline
        public static final void setScrollEventDelta(@NotNull AccessibilityEvent event, int deltaX, int deltaY) {
            Intrinsics.checkNotNullParameter(event, "event");
            event.setScrollDeltaX(deltaX);
            event.setScrollDeltaY(deltaY);
        }
    }

    @RequiresApi(29)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "Lo0000O/o0Oo0oo;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "addPageActions", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Api29Impl {

        @NotNull
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        @DoNotInline
        public static final void addPageActions(@NotNull o0000O.o0Oo0oo info, @NotNull SemanticsNode semanticsNode) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "performAction", "", NativeProtocol.WEB_DIALOG_ACTION, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public MyNodeProvider() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, @NotNull AccessibilityNodeInfo info, @NotNull String extraDataKey, @Nullable Bundle arguments) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(extraDataKey, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @Nullable
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(virtualViewId);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int virtualViewId, int action, @Nullable Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(virtualViewId, action, arguments);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", NativeProtocol.WEB_DIALOG_ACTION, "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;

        @NotNull
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(@NotNull SemanticsNode node, int i, int i2, int i3, int i4, long j) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        @NotNull
        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "currentSemanticsNodes", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "children", "", "getChildren", "()Ljava/util/Set;", "getSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "hasPaneTitle", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @VisibleForTesting
    @SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3490:1\n33#2,6:3491\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy\n*L\n414#1:3491,6\n*E\n"})
    public static final class SemanticsNodeCopy {

        @NotNull
        private final Set<Integer> children;

        @NotNull
        private final SemanticsNode semanticsNode;

        @NotNull
        private final SemanticsConfiguration unmergedConfig;

        public SemanticsNodeCopy(@NotNull SemanticsNode semanticsNode, @NotNull Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes) {
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
            this.semanticsNode = semanticsNode;
            this.unmergedConfig = semanticsNode.getUnmergedConfig();
            this.children = new LinkedHashSet();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    this.children.add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        @NotNull
        public final Set<Integer> getChildren() {
            return this.children;
        }

        @NotNull
        public final SemanticsNode getSemanticsNode() {
            return this.semanticsNode;
        }

        @NotNull
        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", i = {0, 0, 1, 1}, l = {2177, 2210}, m = "boundsUpdatesEventLoop", n = {"this", "subtreeChangedSemanticsNodesIds", "this", "subtreeChangedSemanticsNodesIds"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C08401 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C08401(Continuation<? super C08401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidComposeViewAccessibilityDelegateCompat.this.boundsUpdatesEventLoop(this);
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@NotNull AndroidComposeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.hoveredVirtualViewId = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.enabledStateListener = new android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.OooOOO
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(this.f4178OooO0Oo, z);
            }
        };
        this.touchExplorationStateListener = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.OooOOOO
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(this.f4180OooO00o, z);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new o0000O.o0OO00O(new MyNodeProvider());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.actionIdToLabel = new p188o00o0O.Oooo0<>();
        this.labelToActionId = new p188o00o0O.Oooo0<>();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new p188o00o0O.OooOOO0<>();
        this.boundsUpdateChannel = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.bufferedContentCaptureAppearedNodes = new p188o00o0O.OooOO0<>();
        this.bufferedContentCaptureDisappearedNodes = new p188o00o0O.OooOOO0<>();
        this.currentSemanticsNodes = MapsKt.emptyMap();
        this.paneDisplayed = new p188o00o0O.OooOOO0<>();
        this.idToBeforeMap = new HashMap<>();
        this.idToAfterMap = new HashMap<>();
        this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = new LinkedHashMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(view.getSemanticsOwner().getUnmergedRootSemanticsNode(), MapsKt.emptyMap());
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager().addAccessibilityStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getEnabledStateListener());
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager().addTouchExplorationStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getTouchExplorationStateListener());
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                androidComposeViewAccessibilityDelegateCompat.setContentCaptureSession$ui_release(androidComposeViewAccessibilityDelegateCompat.getContentCaptureSessionCompat(view2));
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager().removeAccessibilityStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getEnabledStateListener());
                AndroidComposeViewAccessibilityDelegateCompat.this.getAccessibilityManager().removeTouchExplorationStateChangeListener(AndroidComposeViewAccessibilityDelegateCompat.this.getTouchExplorationStateListener());
                AndroidComposeViewAccessibilityDelegateCompat.this.setContentCaptureSession$ui_release(null);
            }
        });
        this.semanticsChangeChecker = new OooOo00(this, 0);
        this.scrollObservationScopes = new ArrayList();
        this.sendScrollEventIfNeededLambda = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScrollObservationScope it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.sendScrollEventIfNeeded(it);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey, Bundle arguments) {
        SemanticsNode semanticsNode;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (Intrinsics.areEqual(extraDataKey, this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL)) {
            Integer num = this.idToBeforeMap.get(Integer.valueOf(virtualViewId));
            if (num != null) {
                info.getExtras().putInt(extraDataKey, num.intValue());
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL)) {
            Integer num2 = this.idToAfterMap.get(Integer.valueOf(virtualViewId));
            if (num2 != null) {
                info.getExtras().putInt(extraDataKey, num2.intValue());
                return;
            }
            return;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsActions.getGetTextLayoutResult()) || arguments == null || !Intrinsics.areEqual(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (!unmergedConfig$ui_release2.contains(semanticsProperties.getTestTag()) || arguments == null || !Intrinsics.areEqual(extraDataKey, ExtraDataTestTagKey)) {
                if (Intrinsics.areEqual(extraDataKey, ExtraDataIdKey)) {
                    info.getExtras().putInt(extraDataKey, semanticsNode.getId());
                    return;
                }
                return;
            } else {
                String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getTestTag());
                if (str != null) {
                    info.getExtras().putCharSequence(extraDataKey, str);
                    return;
                }
                return;
            }
        }
        int i = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i2 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i2 > 0 && i >= 0) {
            if (i < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                ArrayList arrayList = new ArrayList();
                Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig().get(semanticsActions.getGetTextLayoutResult())).getAction();
                if (Intrinsics.areEqual(function1 != null ? (Boolean) function1.invoke(arrayList) : null, Boolean.TRUE)) {
                    TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = i + i3;
                        if (i4 >= textLayoutResult.getLayoutInput().getText().length()) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i4)));
                        }
                    }
                    info.getExtras().putParcelableArray(extraDataKey, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                    return;
                }
                return;
            }
        }
        Log.e(LogTag, "Invalid arguments for accessibility character locations");
    }

    private final void bufferContentCaptureViewAppeared(int virtualId, ViewStructureCompat viewStructure) {
        if (viewStructure == null) {
            return;
        }
        if (this.bufferedContentCaptureDisappearedNodes.contains(Integer.valueOf(virtualId))) {
            this.bufferedContentCaptureDisappearedNodes.remove(Integer.valueOf(virtualId));
        } else {
            this.bufferedContentCaptureAppearedNodes.put(Integer.valueOf(virtualId), viewStructure);
        }
    }

    private final void bufferContentCaptureViewDisappeared(int virtualId) {
        if (this.bufferedContentCaptureAppearedNodes.containsKey(Integer.valueOf(virtualId))) {
            this.bufferedContentCaptureAppearedNodes.remove(Integer.valueOf(virtualId));
        } else {
            this.bufferedContentCaptureDisappearedNodes.add(Integer.valueOf(virtualId));
        }
    }

    private final void checkForSemanticsChanges() {
        sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        sendContentCaptureSemanticsStructureChangeEvents$ui_release(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        sendSemanticsPropertyChangeEvents$ui_release(getCurrentSemanticsNodes$ui_release());
        updateSemanticsNodesCopyAndPanes();
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (!isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityNodeInfo createNodeInfo(int virtualViewId) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        o0000O.o0Oo0oo o0oo0oo2 = new o0000O.o0Oo0oo(accessibilityNodeInfoObtain);
        Intrinsics.checkNotNullExpressionValue(o0oo0oo2, "obtain()");
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (virtualViewId == -1) {
            AndroidComposeView androidComposeView = this.view;
            WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            Object objOooO0o = ViewCompat.OooO0o.OooO0o(androidComposeView);
            View view = objOooO0o instanceof View ? (View) objOooO0o : null;
            o0oo0oo2.f34023OooO0O0 = -1;
            accessibilityNodeInfoObtain.setParent(view);
        } else {
            if (semanticsNode.getParent() == null) {
                throw new IllegalStateException(OooO0OO.OooO00o.OooO00o("semanticsNode ", virtualViewId, " has null parent"));
            }
            SemanticsNode parent = semanticsNode.getParent();
            Intrinsics.checkNotNull(parent);
            int id = parent.getId();
            int i = id != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? id : -1;
            AndroidComposeView androidComposeView2 = this.view;
            o0oo0oo2.f34023OooO0O0 = i;
            accessibilityNodeInfoObtain.setParent(androidComposeView2, i);
        }
        AndroidComposeView androidComposeView3 = this.view;
        o0oo0oo2.f34024OooO0OO = virtualViewId;
        accessibilityNodeInfoObtain.setSource(androidComposeView3, virtualViewId);
        Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long jMo2756localToScreenMKHz9U = this.view.mo2756localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long jMo2756localToScreenMKHz9U2 = this.view.mo2756localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        accessibilityNodeInfoObtain.setBoundsInScreen(new Rect((int) Math.floor(Offset.m1436getXimpl(jMo2756localToScreenMKHz9U)), (int) Math.floor(Offset.m1437getYimpl(jMo2756localToScreenMKHz9U)), (int) Math.ceil(Offset.m1436getXimpl(jMo2756localToScreenMKHz9U2)), (int) Math.ceil(Offset.m1437getYimpl(jMo2756localToScreenMKHz9U2))));
        populateAccessibilityNodeInfoProperties(virtualViewId, o0oo0oo2, semanticsNode);
        return accessibilityNodeInfoObtain;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(virtualViewId, 8192);
        if (fromIndex != null) {
            accessibilityEventCreateEvent$ui_release.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventCreateEvent$ui_release.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventCreateEvent$ui_release.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventCreateEvent$ui_release.getText().add(text);
        }
        return accessibilityEventCreateEvent$ui_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.enabledServices = z ? this$0.accessibilityManager.getEnabledAccessibilityServiceList(-1) : CollectionsKt.emptyList();
    }

    @VisibleForTesting
    public static /* synthetic */ void getAccessibilityManager$ui_release$annotations() {
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !node.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m3305getEndimpl(((TextRange) node.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue());
    }

    private final int getAccessibilitySelectionStart(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !node.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m3310getStartimpl(((TextRange) node.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    @VisibleForTesting
    public static /* synthetic */ void getEnabledStateListener$ui_release$annotations() {
    }

    private final boolean getInfoIsCheckable(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getRole());
        boolean z = toggleableState != null;
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getSelected());
        if (bool == null) {
            return z;
        }
        bool.booleanValue();
        return role != null ? Role.m3151equalsimpl0(role.getValue(), Role.INSTANCE.m3161getTabo7Vup1c()) : false ? z : true;
    }

    private final String getInfoStateDescriptionOrNull(SemanticsNode node) {
        Object string;
        int iCoerceIn;
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getRole());
        if (toggleableState != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i == 1) {
                if ((role == null ? false : Role.m3151equalsimpl0(role.getValue(), Role.INSTANCE.m3160getSwitcho7Vup1c())) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.on);
                }
            } else if (i == 2) {
                if ((role == null ? false : Role.m3151equalsimpl0(role.getValue(), Role.INSTANCE.m3160getSwitcho7Vup1c())) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.off);
                }
            } else if (i == 3 && orNull == null) {
                orNull = this.view.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(role == null ? false : Role.m3151equalsimpl0(role.getValue(), Role.INSTANCE.m3161getTabo7Vup1c())) && orNull == null) {
                orNull = zBooleanValue ? this.view.getContext().getResources().getString(R.string.selected) : this.view.getContext().getResources().getString(R.string.not_selected);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                if (orNull == null) {
                    ClosedFloatingPointRange<Float> range = progressBarRangeInfo.getRange();
                    float fCoerceIn = RangesKt.coerceIn(((range.getEndInclusive().floatValue() - range.getStart().floatValue()) > 0.0f ? 1 : ((range.getEndInclusive().floatValue() - range.getStart().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue()), 0.0f, 1.0f);
                    if (fCoerceIn == 0.0f) {
                        iCoerceIn = 0;
                    } else {
                        iCoerceIn = 100;
                        if (!(fCoerceIn == 1.0f)) {
                            iCoerceIn = RangesKt.coerceIn(MathKt.roundToInt(fCoerceIn * 100), 1, 99);
                        }
                    }
                    string = this.view.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(iCoerceIn));
                    orNull = string;
                }
            } else if (orNull == null) {
                string = this.view.getContext().getResources().getString(R.string.in_progress);
                orNull = string;
            }
        }
        return (String) orNull;
    }

    private final SpannableString getInfoText(SemanticsNode node) {
        AnnotatedString annotatedString;
        FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
        SpannableString accessibilitySpannableString = null;
        SpannableString spannableString = (SpannableString) trimToSize(textForTextField != null ? AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache) : null, ParcelSafeTextLength);
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        if (list != null && (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) != null) {
            accessibilitySpannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), fontFamilyResolver, this.urlSpanCache);
        }
        return spannableString == null ? (SpannableString) trimToSize(accessibilitySpannableString, ParcelSafeTextLength) : spannableString;
    }

    private final String getIterableTextForAccessibility(SemanticsNode node) {
        AnnotatedString annotatedString;
        if (node == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription())) {
            return TempListUtilsKt.fastJoinToString$default((List) node.getUnmergedConfig().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(node)) {
            AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode node, int granularity) {
        if (node == null) {
            return null;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        if (iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator.Companion companion = AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE;
            Locale locale = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale, "view.context.resources.configuration.locale");
            AccessibilityIterators.CharacterTextSegmentIterator companion2 = companion.getInstance(locale);
            companion2.initialize(iterableTextForAccessibility);
            return companion2;
        }
        if (granularity == 2) {
            AccessibilityIterators.WordTextSegmentIterator.Companion companion3 = AccessibilityIterators.WordTextSegmentIterator.INSTANCE;
            Locale locale2 = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale2, "view.context.resources.configuration.locale");
            AccessibilityIterators.WordTextSegmentIterator companion4 = companion3.getInstance(locale2);
            companion4.initialize(iterableTextForAccessibility);
            return companion4;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                AccessibilityIterators.ParagraphTextSegmentIterator companion5 = AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.getInstance();
                companion5.initialize(iterableTextForAccessibility);
                return companion5;
            }
            if (granularity != 16) {
                return null;
            }
        }
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsActions.getGetTextLayoutResult())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Function1 function1 = (Function1) ((AccessibilityAction) node.getUnmergedConfig().get(semanticsActions.getGetTextLayoutResult())).getAction();
        if (!Intrinsics.areEqual(function1 != null ? (Boolean) function1.invoke(arrayList) : null, Boolean.TRUE)) {
            return null;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
        if (granularity == 4) {
            AccessibilityIterators.LineTextSegmentIterator companion6 = AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
            companion6.initialize(iterableTextForAccessibility, textLayoutResult);
            return companion6;
        }
        AccessibilityIterators.PageTextSegmentIterator companion7 = AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
        companion7.initialize(iterableTextForAccessibility, textLayoutResult, node);
        return companion7;
    }

    @VisibleForTesting
    public static /* synthetic */ void getPreviousSemanticsNodes$ui_release$annotations() {
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    @VisibleForTesting
    public static /* synthetic */ void getTouchExplorationStateListener$ui_release$annotations() {
    }

    private final boolean isAccessibilityFocused(int virtualViewId) {
        return this.focusedVirtualViewId == virtualViewId;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return !unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && node.getUnmergedConfig().contains(semanticsProperties.getEditableText());
    }

    @VisibleForTesting
    public static /* synthetic */ void isEnabled$ui_release$annotations() {
    }

    private final boolean isEnabledForAccessibility() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        if (this.accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> enabledServices = this.enabledServices;
            Intrinsics.checkNotNullExpressionValue(enabledServices, "enabledServices");
            if (!enabledServices.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: isEnabledForContentCapture, reason: from getter */
    private final boolean getContentCaptureForceEnabledForTesting() {
        return this.contentCaptureForceEnabledForTesting;
    }

    private final boolean isScreenReaderFocusable(SemanticsNode node) {
        return node.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (node.isUnmergedLeafNode$ui_release() && (AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(node) != null || getInfoText(node) != null || getInfoStateDescriptionOrNull(node) != null || getInfoIsCheckable(node)));
    }

    private final boolean isTouchExplorationEnabled() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void notifyContentCaptureChanges() {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29) {
            if (!this.bufferedContentCaptureAppearedNodes.isEmpty()) {
                Collection<ViewStructureCompat> collectionValues = this.bufferedContentCaptureAppearedNodes.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "bufferedContentCaptureAppearedNodes.values");
                List list = CollectionsKt.toList(collectionValues);
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((ViewStructureCompat) list.get(i)).toViewStructure());
                }
                contentCaptureSessionCompat.notifyViewsAppeared(arrayList);
                this.bufferedContentCaptureAppearedNodes.clear();
            }
            if (!this.bufferedContentCaptureDisappearedNodes.isEmpty()) {
                List list2 = CollectionsKt.toList(this.bufferedContentCaptureDisappearedNodes);
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(Long.valueOf(((Integer) list2.get(i2)).intValue()));
                }
                contentCaptureSessionCompat.notifyViewsDisappeared(CollectionsKt___CollectionsKt.toLongArray(arrayList2));
                this.bufferedContentCaptureDisappearedNodes.clear();
            }
        }
    }

    private final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo5731trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    private final void notifySubtreeAppeared(SemanticsNode node) {
        bufferContentCaptureViewAppeared(node.getId(), toViewStructure(node));
        List<SemanticsNode> replacedChildren$ui_release = node.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            notifySubtreeAppeared(replacedChildren$ui_release.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00d2 -> B:55:0x00d3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:55:0x00d3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean performActionHelper(int r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 1650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        return (f < 0.0f && scrollAxisRange.getValue().invoke().floatValue() > 0.0f) || (f > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue());
    }

    private static final float performActionHelper$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private final boolean registerScrollingId(int id, List<ScrollObservationScope> oldScrollObservationScopes) {
        boolean z;
        ScrollObservationScope scrollObservationScopeFindById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(oldScrollObservationScopes, id);
        if (scrollObservationScopeFindById != null) {
            z = false;
        } else {
            scrollObservationScopeFindById = new ScrollObservationScope(id, this.scrollObservationScopes, null, null, null, null);
            z = true;
        }
        this.scrollObservationScopes.add(scrollObservationScopeFindById);
        return z;
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        int i = this.focusedVirtualViewId;
        if (i != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, ShareRequest.THUMB_DATA_SIZE_LIMIT, null, null, 12, null);
        return true;
    }

    private final Comparator<SemanticsNode> semanticComparator(boolean layoutIsRtl) {
        final Comparator comparatorCompareBy = ComparisonsKt.compareBy(new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getBoundsInWindow().getLeft());
            }
        }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$2
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getBoundsInWindow().getTop());
            }
        }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$3
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getBoundsInWindow().getBottom());
            }
        }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$4
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getBoundsInWindow().getRight());
            }
        });
        if (layoutIsRtl) {
            comparatorCompareBy = ComparisonsKt.compareBy(new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Float.valueOf(it.getBoundsInWindow().getRight());
                }
            }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.2
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Float.valueOf(it.getBoundsInWindow().getTop());
                }
            }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.3
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Float.valueOf(it.getBoundsInWindow().getBottom());
                }
            }, new Function1<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.semanticComparator.4
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Comparable<?> invoke(@NotNull SemanticsNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Float.valueOf(it.getBoundsInWindow().getLeft());
                }
            });
        }
        final Comparator<LayoutNode> zComparator$ui_release = LayoutNode.INSTANCE.getZComparator$ui_release();
        final Comparator comparator = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparatorCompareBy.compare(t, t2);
                return iCompare != 0 ? iCompare : zComparator$ui_release.compare(((SemanticsNode) t).getLayoutNode(), ((SemanticsNode) t2).getLayoutNode());
            }
        };
        return new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(Integer.valueOf(((SemanticsNode) t).getId()), Integer.valueOf(((SemanticsNode) t2).getId()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$45(AndroidComposeViewAccessibilityDelegateCompat this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.compose.ui.node.OooO.OooO0o(this$0.view, false, 1, null);
        this$0.checkForSemanticsChanges();
        this$0.checkingForSemanticsChanges = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int id) {
        if (id == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return id;
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode newNode, SemanticsNodeCopy oldNode) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode.getId()))) {
                if (!oldNode.getChildren().contains(Integer.valueOf(semanticsNode.getId()))) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode.getId()));
            }
        }
        Iterator<Integer> it = oldNode.getChildren().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                return;
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = newNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode2.getId()));
                Intrinsics.checkNotNull(semanticsNodeCopy);
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    private final void sendContentCaptureTextUpdateEvent(int id, String newText) {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29) {
            AutofillId autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(id);
            if (autofillIdNewAutofillId == null) {
                throw new IllegalStateException("Invalid content capture ID".toString());
            }
            contentCaptureSessionCompat.notifyViewTextChanged(autofillIdNewAutofillId, newText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean sendEvent(AccessibilityEvent event) {
        if (isEnabledForAccessibility()) {
            return this.view.getParent().requestSendAccessibilityEvent(this.view, event);
        }
        return false;
    }

    private final boolean sendEventForVirtualView(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventCreateEvent$ui_release.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventCreateEvent$ui_release.setContentDescription(TempListUtilsKt.fastJoinToString$default(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(accessibilityEventCreateEvent$ui_release);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final void sendPaneChangeEvents(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNodeId), 32);
        accessibilityEventCreateEvent$ui_release.setContentChangeTypes(contentChangeType);
        if (title != null) {
            accessibilityEventCreateEvent$ui_release.getText().add(title);
        }
        sendEvent(accessibilityEventCreateEvent$ui_release);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int semanticsNodeId) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (semanticsNodeId != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                accessibilityEventCreateEvent$ui_release.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                accessibilityEventCreateEvent$ui_release.setToIndex(pendingTextTraversedEvent.getToIndex());
                accessibilityEventCreateEvent$ui_release.setAction(pendingTextTraversedEvent.getAction());
                accessibilityEventCreateEvent$ui_release.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                accessibilityEventCreateEvent$ui_release.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(accessibilityEventCreateEvent$ui_release);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.sendScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendScrollEventIfNeeded.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code duplicated, block: B:20:0x005d  */
                /* JADX WARN: Code duplicated, block: B:22:0x0083  */
                /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
                /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    AccessibilityEvent accessibilityEventCreateEvent$ui_release;
                    ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
                    Float oldXValue = scrollObservationScope.getOldXValue();
                    Float oldYValue = scrollObservationScope.getOldYValue();
                    float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (fFloatValue == 0.0f) {
                        if (!(fFloatValue2 == 0.0f)) {
                            int iSemanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(scrollObservationScope.getSemanticsNodeId());
                            AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, iSemanticsNodeIdToAccessibilityVirtualNodeId, 2048, 1, null, 8, null);
                            accessibilityEventCreateEvent$ui_release = this.createEvent$ui_release(iSemanticsNodeIdToAccessibilityVirtualNodeId, 4096);
                            if (horizontalScrollAxisRange != null) {
                                accessibilityEventCreateEvent$ui_release.setScrollX((int) horizontalScrollAxisRange.getValue().invoke().floatValue());
                                accessibilityEventCreateEvent$ui_release.setMaxScrollX((int) horizontalScrollAxisRange.getMaxValue().invoke().floatValue());
                            }
                            if (verticalScrollAxisRange != null) {
                                accessibilityEventCreateEvent$ui_release.setScrollY((int) verticalScrollAxisRange.getValue().invoke().floatValue());
                                accessibilityEventCreateEvent$ui_release.setMaxScrollY((int) verticalScrollAxisRange.getMaxValue().invoke().floatValue());
                            }
                            if (Build.VERSION.SDK_INT >= 28) {
                                Api28Impl.setScrollEventDelta(accessibilityEventCreateEvent$ui_release, (int) fFloatValue, (int) fFloatValue2);
                            }
                            this.sendEvent(accessibilityEventCreateEvent$ui_release);
                        }
                    } else {
                        int iSemanticsNodeIdToAccessibilityVirtualNodeId2 = this.semanticsNodeIdToAccessibilityVirtualNodeId(scrollObservationScope.getSemanticsNodeId());
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, iSemanticsNodeIdToAccessibilityVirtualNodeId2, 2048, 1, null, 8, null);
                        accessibilityEventCreateEvent$ui_release = this.createEvent$ui_release(iSemanticsNodeIdToAccessibilityVirtualNodeId2, 4096);
                        if (horizontalScrollAxisRange != null) {
                            accessibilityEventCreateEvent$ui_release.setScrollX((int) horizontalScrollAxisRange.getValue().invoke().floatValue());
                            accessibilityEventCreateEvent$ui_release.setMaxScrollX((int) horizontalScrollAxisRange.getMaxValue().invoke().floatValue());
                        }
                        if (verticalScrollAxisRange != null) {
                            accessibilityEventCreateEvent$ui_release.setScrollY((int) verticalScrollAxisRange.getValue().invoke().floatValue());
                            accessibilityEventCreateEvent$ui_release.setMaxScrollY((int) verticalScrollAxisRange.getMaxValue().invoke().floatValue());
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            Api28Impl.setScrollEventDelta(accessibilityEventCreateEvent$ui_release, (int) fFloatValue, (int) fFloatValue2);
                        }
                        this.sendEvent(accessibilityEventCreateEvent$ui_release);
                    }
                    if (horizontalScrollAxisRange != null) {
                        scrollObservationScope.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        scrollObservationScope.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }
            });
        }
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, p188o00o0O.OooOOO0<Integer> subtreeChangedSemanticsNodesIds) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        LayoutNode layoutNodeFindClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes().m2957hasH91voCI$ui_release(NodeKind.m2994constructorimpl(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull LayoutNode it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(it.getNodes().m2957hasH91voCI$ui_release(NodeKind.m2994constructorimpl(8)));
                    }
                });
            }
            if (layoutNode == null || (collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release()) == null) {
                return;
            }
            if (!collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants() && (layoutNodeFindClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull LayoutNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SemanticsConfiguration collapsedSemantics$ui_release2 = it.getCollapsedSemantics$ui_release();
                    boolean z = false;
                    if (collapsedSemantics$ui_release2 != null && collapsedSemantics$ui_release2.getIsMergingSemanticsOfDescendants()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            })) != null) {
                layoutNode = layoutNodeFindClosestParentNode;
            }
            int semanticsId = layoutNode.getSemanticsId();
            if (subtreeChangedSemanticsNodesIds.add(Integer.valueOf(semanticsId))) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, null, 8, null);
            }
        }
    }

    private final boolean setAccessibilitySelection(SemanticsNode node, int start, int end, boolean traversalMode) {
        String iterableTextForAccessibility;
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsActions.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(node)) {
            Function3 function3 = (Function3) ((AccessibilityAction) node.getUnmergedConfig().get(semanticsActions.getSetSelection())).getAction();
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
            }
            return false;
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > iterableTextForAccessibility.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        boolean z = iterableTextForAccessibility.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(node.getId()), z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(node.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode node, o0000O.o0Oo0oo info) {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getError())) {
            info.f34022OooO00o.setContentInvalid(true);
            info.f34022OooO00o.setError((CharSequence) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getError()));
        }
    }

    private final void setIsCheckable(SemanticsNode node, o0000O.o0Oo0oo info) {
        info.f34022OooO00o.setCheckable(getInfoIsCheckable(node));
    }

    private final void setStateDescription(SemanticsNode node, o0000O.o0Oo0oo info) {
        info.OooOOOo(getInfoStateDescriptionOrNull(node));
    }

    private final void setText(SemanticsNode node, o0000O.o0Oo0oo info) {
        info.OooOOo0(getInfoText(node));
    }

    private final void setTraversalValues() {
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        Intrinsics.checkNotNull(semanticsNode);
        int i = 1;
        List<SemanticsNode> listSubtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode), CollectionsKt.mutableListOf(semanticsNode));
        int lastIndex = CollectionsKt.getLastIndex(listSubtreeSortedByGeometryGrouping);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int id = listSubtreeSortedByGeometryGrouping.get(i - 1).getId();
            int id2 = listSubtreeSortedByGeometryGrouping.get(i).getId();
            this.idToBeforeMap.put(Integer.valueOf(id), Integer.valueOf(id2));
            this.idToAfterMap.put(Integer.valueOf(id2), Integer.valueOf(id));
            if (i == lastIndex) {
                return;
            } else {
                i++;
            }
        }
    }

    private final List<SemanticsNode> sortByGeometryGroupings(boolean layoutIsRtl, List<SemanticsNode> parentListToSort, Map<Integer, List<SemanticsNode>> containerChildrenMapping) {
        ArrayList arrayList = new ArrayList();
        int lastIndex = CollectionsKt.getLastIndex(parentListToSort);
        int size = 0;
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                SemanticsNode semanticsNode = parentListToSort.get(i);
                if (i == 0 || !sortByGeometryGroupings$placedEntryRowOverlaps(arrayList, semanticsNode)) {
                    arrayList.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt.mutableListOf(semanticsNode)));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        CollectionsKt.sortWith(arrayList, ComparisonsKt.compareBy(new Function1<Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.1
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Comparable<?> invoke2(@NotNull Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getFirst().getTop());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Comparable<?> invoke(Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair) {
                return invoke2((Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>) pair);
            }
        }, new Function1<Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Comparable<?> invoke2(@NotNull Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Float.valueOf(it.getFirst().getBottom());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Comparable<?> invoke(Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair) {
                return invoke2((Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>) pair);
            }
        }));
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            CollectionsKt.sortWith((List) pair.getSecond(), semanticComparator(layoutIsRtl));
            arrayList2.addAll((Collection) pair.getSecond());
        }
        CollectionsKt.sortWith(arrayList2, new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Float.valueOf(AndroidComposeViewAccessibilityDelegateCompat_androidKt.getGetTraversalIndex((SemanticsNode) t)), Float.valueOf(AndroidComposeViewAccessibilityDelegateCompat_androidKt.getGetTraversalIndex((SemanticsNode) t2)));
            }
        });
        while (size <= CollectionsKt.getLastIndex(arrayList2)) {
            int id = ((SemanticsNode) arrayList2.get(size)).getId();
            List<SemanticsNode> list = containerChildrenMapping.get(Integer.valueOf(id));
            if (list != null) {
                arrayList2.remove(size);
                arrayList2.addAll(size, list);
            }
            List<SemanticsNode> list2 = containerChildrenMapping.get(Integer.valueOf(id));
            size += list2 != null ? list2.size() : 1;
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List sortByGeometryGroupings$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, List list, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z, list, map);
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(List<Pair<androidx.compose.ui.geometry.Rect, List<SemanticsNode>>> list, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        OpenEndRange<Float> openEndRangeRangeUntil = AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(top, bottom);
        int lastIndex = CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                androidx.compose.ui.geometry.Rect first = list.get(i).getFirst();
                if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.overlaps(AndroidComposeViewAccessibilityDelegateCompat_androidKt.rangeUntil(first.getTop(), first.getBottom()), openEndRangeRangeUntil)) {
                    list.set(i, new Pair<>(first.intersect(new androidx.compose.ui.geometry.Rect(0.0f, top, Float.POSITIVE_INFINITY, bottom)), list.get(i).getSecond()));
                    list.get(i).getSecond().add(semanticsNode);
                    return true;
                }
                if (i != lastIndex) {
                    i++;
                }
            }
        }
        return false;
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean layoutIsRtl, List<SemanticsNode> listToSort) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = listToSort.size();
        for (int i = 0; i < size; i++) {
            subtreeSortedByGeometryGrouping$depthFirstSearch(this, arrayList, linkedHashMap, layoutIsRtl, listToSort.get(i));
        }
        return sortByGeometryGroupings(layoutIsRtl, arrayList, linkedHashMap);
    }

    private static final void subtreeSortedByGeometryGrouping$depthFirstSearch(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, List<SemanticsNode> list, Map<Integer, List<SemanticsNode>> map, boolean z, SemanticsNode semanticsNode) {
        Boolean boolIsTraversalGroup = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTraversalGroup(semanticsNode);
        Boolean bool = Boolean.TRUE;
        if ((Intrinsics.areEqual(boolIsTraversalGroup, bool) || androidComposeViewAccessibilityDelegateCompat.isScreenReaderFocusable(semanticsNode)) && androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes$ui_release().keySet().contains(Integer.valueOf(semanticsNode.getId()))) {
            list.add(semanticsNode);
        }
        if (Intrinsics.areEqual(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTraversalGroup(semanticsNode), bool)) {
            map.put(Integer.valueOf(semanticsNode.getId()), androidComposeViewAccessibilityDelegateCompat.subtreeSortedByGeometryGrouping(z, CollectionsKt.toMutableList((Collection) semanticsNode.getChildren())));
            return;
        }
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            subtreeSortedByGeometryGrouping$depthFirstSearch(androidComposeViewAccessibilityDelegateCompat, list, map, z, children.get(i));
        }
    }

    private final RectF toScreenCoords(SemanticsNode textNode, androidx.compose.ui.geometry.Rect bounds) {
        if (textNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect rectM1473translatek4lQ0M = bounds.m1473translatek4lQ0M(textNode.m3163getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = textNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect rectIntersect = rectM1473translatek4lQ0M.overlaps(boundsInRoot) ? rectM1473translatek4lQ0M.intersect(boundsInRoot) : null;
        if (rectIntersect == null) {
            return null;
        }
        long jMo2756localToScreenMKHz9U = this.view.mo2756localToScreenMKHz9U(OffsetKt.Offset(rectIntersect.getLeft(), rectIntersect.getTop()));
        long jMo2756localToScreenMKHz9U2 = this.view.mo2756localToScreenMKHz9U(OffsetKt.Offset(rectIntersect.getRight(), rectIntersect.getBottom()));
        return new RectF(Offset.m1436getXimpl(jMo2756localToScreenMKHz9U), Offset.m1437getYimpl(jMo2756localToScreenMKHz9U), Offset.m1436getXimpl(jMo2756localToScreenMKHz9U2), Offset.m1437getYimpl(jMo2756localToScreenMKHz9U2));
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String strM3078toLegacyClassNameV4PA4sw;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || (autofillId = ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent != null) {
            autofillId2 = contentCaptureSessionCompat.newAutofillId(parent.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        Intrinsics.checkNotNullExpressionValue(autofillId2, "if (parentNode != null) ….toAutofillId()\n        }");
        ViewStructureCompat viewStructureCompatNewVirtualViewStructure = contentCaptureSessionCompat.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (viewStructureCompatNewVirtualViewStructure == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getPassword())) {
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getText());
        if (list != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(TextClassName);
            viewStructureCompatNewVirtualViewStructure.setText(TempListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getEditableText());
        if (annotatedString != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(TextFieldClassName);
            viewStructureCompatNewVirtualViewStructure.setText(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getContentDescription());
        if (list2 != null) {
            viewStructureCompatNewVirtualViewStructure.setContentDescription(TempListUtilsKt.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        if (role != null && (strM3078toLegacyClassNameV4PA4sw = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3078toLegacyClassNameV4PA4sw(role.getValue())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(strM3078toLegacyClassNameV4PA4sw);
        }
        androidx.compose.ui.geometry.Rect boundsInWindow = semanticsNode.getBoundsInWindow();
        viewStructureCompatNewVirtualViewStructure.setDimens((int) boundsInWindow.getLeft(), (int) boundsInWindow.getTop(), 0, 0, (int) boundsInWindow.getWidth(), (int) boundsInWindow.getHeight());
        return viewStructureCompatNewVirtualViewStructure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.enabledServices = this$0.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean traverseAtGranularity(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int accessibilitySelectionStart;
        int i;
        int id = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        if ((iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0) || (iteratorForGranularity = getIteratorForGranularity(node, granularity)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(node);
        if (accessibilitySelectionEnd == -1) {
            accessibilitySelectionEnd = forward ? 0 : iterableTextForAccessibility.length();
        }
        int[] iArrFollowing = forward ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
        if (iArrFollowing == null) {
            return false;
        }
        int i2 = iArrFollowing[0];
        int i3 = iArrFollowing[1];
        if (extendSelection && isAccessibilitySelectionExtendable(node)) {
            accessibilitySelectionStart = getAccessibilitySelectionStart(node);
            if (accessibilitySelectionStart == -1) {
                accessibilitySelectionStart = forward ? i2 : i3;
            }
            i = forward ? i3 : i2;
        } else {
            accessibilitySelectionStart = forward ? i3 : i2;
            i = accessibilitySelectionStart;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(node, forward ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : ConstantsKt.MINIMUM_BLOCK_SIZE, granularity, i2, i3, SystemClock.uptimeMillis());
        setAccessibilitySelection(node, accessibilitySelectionStart, i, true);
        return true;
    }

    private final <T extends CharSequence> T trimToSize(T text, @IntRange(from = 1) int size) {
        boolean z = true;
        if (!(size > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (text != null && text.length() != 0) {
            z = false;
        }
        if (z || text.length() <= size) {
            return text;
        }
        int i = size - 1;
        if (Character.isHighSurrogate(text.charAt(i)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i;
        }
        T t = (T) text.subSequence(0, size);
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t;
    }

    private final void updateHoveredVirtualView(int virtualViewId) {
        int i = this.hoveredVirtualViewId;
        if (i == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        sendEventForVirtualView$default(this, virtualViewId, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i, PSKKeyManager.MAX_KEY_LENGTH_BYTES, null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateSemanticsNodesCopyAndPanes() {
        SemanticsConfiguration unmergedConfig;
        p188o00o0O.OooOOO0 oooOOO0 = new p188o00o0O.OooOOO0();
        p188o00o0O.OooOOO0<Integer> oooOOO1 = this.paneDisplayed;
        oooOOO1.getClass();
        o00o0O.OooOOO0.OooO00o oooO00o = new o00o0O.OooOOO0.OooO00o();
        while (oooO00o.hasNext()) {
            Integer id = (Integer) oooO00o.next();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(id);
            String str = null;
            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
            if (semanticsNode == null || !AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(semanticsNode)) {
                oooOOO0.add(id);
                Intrinsics.checkNotNullExpressionValue(id, "id");
                int iIntValue = id.intValue();
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(id);
                if (semanticsNodeCopy != null && (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) != null) {
                    str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle());
                }
                sendPaneChangeEvents(iIntValue, 32, str);
            }
        }
        p188o00o0O.OooOOO0<Integer> oooOOO2 = this.paneDisplayed;
        oooOOO2.getClass();
        int i = oooOOO0.f38787OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            oooOOO2.remove(oooOOO0.f38788OooO0o0[i2]);
        }
        this.previousSemanticsNodes.clear();
        for (Map.Entry<Integer, SemanticsNodeWithAdjustedBounds> entry : getCurrentSemanticsNodes$ui_release().entrySet()) {
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(entry.getValue().getSemanticsNode()) && this.paneDisplayed.add(entry.getKey())) {
                sendPaneChangeEvents(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig().get(SemanticsProperties.INSTANCE.getPaneTitle()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new SemanticsNodeCopy(entry.getValue().getSemanticsNode(), getCurrentSemanticsNodes$ui_release()));
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes$ui_release());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:34:0x0089, B:36:0x008f, B:38:0x0096, B:39:0x00a7, B:41:0x00ae, B:42:0x00b7, B:18:0x004d), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:34:0x0089, B:36:0x008f, B:38:0x0096, B:39:0x00a7, B:41:0x00ae, B:42:0x00b7, B:18:0x004d), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008f A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:34:0x0089, B:36:0x008f, B:38:0x0096, B:39:0x00a7, B:41:0x00ae, B:42:0x00b7, B:18:0x004d), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0096 A[Catch: all -> 0x0051, LOOP:0: B:37:0x0094->B:38:0x0096, LOOP_END, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:34:0x0089, B:36:0x008f, B:38:0x0096, B:39:0x00a7, B:41:0x00ae, B:42:0x00b7, B:18:0x004d), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0034, B:25:0x0063, B:29:0x0075, B:31:0x007d, B:33:0x0086, B:34:0x0089, B:36:0x008f, B:38:0x0096, B:39:0x00a7, B:41:0x00ae, B:42:0x00b7, B:18:0x004d), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ca -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object boundsUpdatesEventLoop(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m3075canScroll0AR0LA0$ui_release(boolean vertical, int direction, long position) {
        return m3076canScrollmoWRBKg$ui_release(getCurrentSemanticsNodes$ui_release().values(), vertical, direction, position);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    @VisibleForTesting
    /* JADX INFO: renamed from: canScroll-moWRBKg$ui_release, reason: not valid java name */
    public final boolean m3076canScrollmoWRBKg$ui_release(@NotNull Collection<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes, boolean vertical, int direction, long position) {
        SemanticsPropertyKey<ScrollAxisRange> horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        boolean z;
        Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
        if (Offset.m1433equalsimpl0(position, Offset.INSTANCE.m1451getUnspecifiedF1C5BW0()) || !Offset.m1439isValidimpl(position)) {
            return false;
        }
        if (vertical) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else {
            if (vertical) {
                throw new NoWhenBranchMatchedException();
            }
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        }
        Collection<SemanticsNodeWithAdjustedBounds> collection = currentSemanticsNodes;
        if (collection.isEmpty()) {
            return false;
        }
        for (SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds : collection) {
            if (RectHelper_androidKt.toComposeRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m1462containsk4lQ0M(position) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig(), horizontalScrollAxisRange)) != null) {
                int i = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                if (direction == 0 && scrollAxisRange.getReverseScrolling()) {
                    i = -1;
                }
                if (i >= 0 ? scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() : scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    @NotNull
    public final AccessibilityEvent createEvent$ui_release(int virtualViewId, int eventType) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
        Intrinsics.checkNotNullExpressionValue(accessibilityEventObtain, "obtain(eventType)");
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(ClassName);
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, virtualViewId);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes$ui_release().get(Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds != null) {
            accessibilityEventObtain.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode()));
        }
        return accessibilityEventObtain;
    }

    public final boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            updateHoveredVirtualView(iHitTestSemanticsAt$ui_release);
            if (iHitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: getAccessibilityForceEnabledForTesting$ui_release, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    @NotNull
    /* JADX INFO: renamed from: getAccessibilityManager$ui_release, reason: from getter */
    public final android.view.accessibility.AccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.core.view.OooO00o
    @NotNull
    public o0000O.o0OO00O getAccessibilityNodeProvider(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return this.nodeProvider;
    }

    @NotNull
    public final p188o00o0O.OooOO0<Integer, ViewStructureCompat> getBufferedContentCaptureAppearedNodes$ui_release() {
        return this.bufferedContentCaptureAppearedNodes;
    }

    @NotNull
    public final p188o00o0O.OooOOO0<Integer> getBufferedContentCaptureDisappearedNodes$ui_release() {
        return this.bufferedContentCaptureDisappearedNodes;
    }

    public final boolean getContentCaptureForceEnabledForTesting$ui_release() {
        return this.contentCaptureForceEnabledForTesting;
    }

    @Nullable
    /* JADX INFO: renamed from: getContentCaptureSession$ui_release, reason: from getter */
    public final ContentCaptureSessionCompat getContentCaptureSession() {
        return this.contentCaptureSession;
    }

    @NotNull
    public final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes$ui_release() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            setTraversalValues();
        }
        return this.currentSemanticsNodes;
    }

    @NotNull
    /* JADX INFO: renamed from: getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL$ui_release, reason: from getter */
    public final String getEXTRA_DATA_TEST_TRAVERSALAFTER_VAL() {
        return this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL;
    }

    @NotNull
    /* JADX INFO: renamed from: getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL$ui_release, reason: from getter */
    public final String getEXTRA_DATA_TEST_TRAVERSALBEFORE_VAL() {
        return this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL;
    }

    @NotNull
    /* JADX INFO: renamed from: getEnabledStateListener$ui_release, reason: from getter */
    public final android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener getEnabledStateListener() {
        return this.enabledStateListener;
    }

    /* JADX INFO: renamed from: getHoveredVirtualViewId$ui_release, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    @NotNull
    public final HashMap<Integer, Integer> getIdToAfterMap$ui_release() {
        return this.idToAfterMap;
    }

    @NotNull
    public final HashMap<Integer, Integer> getIdToBeforeMap$ui_release() {
        return this.idToBeforeMap;
    }

    @NotNull
    public final Map<Integer, SemanticsNodeCopy> getPreviousSemanticsNodes$ui_release() {
        return this.previousSemanticsNodes;
    }

    @NotNull
    /* JADX INFO: renamed from: getTouchExplorationStateListener$ui_release, reason: from getter */
    public final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateListener() {
        return this.touchExplorationStateListener;
    }

    @NotNull
    public final AndroidComposeView getView() {
        return this.view;
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float x, float y) {
        NodeChain nodes;
        androidx.compose.ui.node.OooO.OooO0o(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        this.view.getRoot().m2920hitTestSemanticsM_7yMNQ$ui_release(OffsetKt.Offset(x, y), hitTestResult, (12 & 4) != 0, (12 & 8) != 0);
        Modifier.Node node = (Modifier.Node) CollectionsKt.lastOrNull((List) hitTestResult);
        LayoutNode layoutNodeRequireLayoutNode = node != null ? DelegatableNodeKt.requireLayoutNode(node) : null;
        if (((layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null || !nodes.m2957hasH91voCI$ui_release(NodeKind.m2994constructorimpl(8))) ? false : true) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(SemanticsNodeKt.SemanticsNode(layoutNodeRequireLayoutNode, false)) && this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeRequireLayoutNode) == null) {
            return semanticsNodeIdToAccessibilityVirtualNodeId(layoutNodeRequireLayoutNode.getSemanticsId());
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isEnabled$ui_release() {
        return isEnabledForAccessibility() || getContentCaptureForceEnabledForTesting();
    }

    public final void onLayoutChange$ui_release(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    @VisibleForTesting
    public final void populateAccessibilityNodeInfoProperties(int virtualViewId, @NotNull o0000O.o0Oo0oo info, @NotNull SemanticsNode semanticsNode) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        info.OooOO0(ClassName);
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        AccessibilityNodeInfo accessibilityNodeInfo = info.f34022OooO00o;
        if (role != null) {
            role.getValue();
            if (semanticsNode.getIsFake() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                Role.Companion companion = Role.INSTANCE;
                if (Role.m3151equalsimpl0(role.getValue(), companion.m3161getTabo7Vup1c())) {
                    o0000O.o0Oo0oo.OooO0O0.OooO00o(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", this.view.getContext().getResources().getString(R.string.tab));
                } else if (Role.m3151equalsimpl0(role.getValue(), companion.m3160getSwitcho7Vup1c())) {
                    o0000O.o0Oo0oo.OooO0O0.OooO00o(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", this.view.getContext().getResources().getString(R.string.switch_role));
                } else {
                    String strM3078toLegacyClassNameV4PA4sw = AndroidComposeViewAccessibilityDelegateCompat_androidKt.m3078toLegacyClassNameV4PA4sw(role.getValue());
                    if (!Role.m3151equalsimpl0(role.getValue(), companion.m3158getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui_release() || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        info.OooOO0(strM3078toLegacyClassNameV4PA4sw);
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode)) {
            info.OooOO0(TextFieldClassName);
        }
        if (semanticsNode.getConfig().contains(semanticsProperties.getText())) {
            info.OooOO0(TextClassName);
        }
        accessibilityNodeInfo.setPackageName(this.view.getContext().getPackageName());
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityNodeInfo.setImportantForAccessibility(true);
        }
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode());
                if (androidViewHolder != null) {
                    accessibilityNodeInfo.addChild(androidViewHolder);
                } else {
                    accessibilityNodeInfo.addChild(this.view, semanticsNode2.getId());
                }
            }
        }
        if (this.focusedVirtualViewId == virtualViewId) {
            info.OooO0oO(true);
            info.OooO0O0(o0000O.o0Oo0oo.OooO00o.f34025OooO);
        } else {
            info.OooO0oO(false);
            info.OooO0O0(o0000O.o0Oo0oo.OooO00o.f34029OooO0oo);
        }
        setText(semanticsNode, info);
        setContentInvalid(semanticsNode, info);
        setStateDescription(semanticsNode, info);
        setIsCheckable(semanticsNode, info);
        SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release2, semanticsProperties2.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                accessibilityNodeInfo.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                accessibilityNodeInfo.setChecked(false);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (role == null ? false : Role.m3151equalsimpl0(role.getValue(), Role.INSTANCE.m3161getTabo7Vup1c())) {
                accessibilityNodeInfo.setSelected(zBooleanValue2);
            } else {
                accessibilityNodeInfo.setChecked(zBooleanValue2);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            info.OooOOO0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoContentDescriptionOrNull(semanticsNode));
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getTestTag());
        if (str != null) {
            SemanticsNode parent = semanticsNode;
            while (true) {
                if (parent == null) {
                    zBooleanValue = false;
                    break;
                }
                SemanticsConfiguration unmergedConfig$ui_release3 = parent.getUnmergedConfig();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig$ui_release3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    zBooleanValue = ((Boolean) parent.getUnmergedConfig().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue();
                    break;
                }
                parent = parent.getParent();
            }
            if (zBooleanValue) {
                accessibilityNodeInfo.setViewIdResourceName(str);
            }
        }
        SemanticsConfiguration unmergedConfig$ui_release4 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((Unit) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release4, semanticsProperties3.getHeading())) != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityNodeInfo.setHeading(true);
            } else {
                info.OooO0oo(2, true);
            }
            Unit unit4 = Unit.INSTANCE;
        }
        accessibilityNodeInfo.setPassword(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode));
        accessibilityNodeInfo.setEditable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode));
        accessibilityNodeInfo.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode));
        accessibilityNodeInfo.setFocusable(semanticsNode.getUnmergedConfig().contains(semanticsProperties3.getFocused()));
        if (accessibilityNodeInfo.isFocusable()) {
            accessibilityNodeInfo.setFocused(((Boolean) semanticsNode.getUnmergedConfig().get(semanticsProperties3.getFocused())).booleanValue());
            if (accessibilityNodeInfo.isFocused()) {
                info.OooO00o(2);
            } else {
                info.OooO00o(1);
            }
        }
        accessibilityNodeInfo.setVisibleToUser(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(semanticsNode));
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int iM3145unboximpl = liveRegionMode.getValue();
            LiveRegionMode.Companion companion2 = LiveRegionMode.INSTANCE;
            accessibilityNodeInfo.setLiveRegion((LiveRegionMode.m3142equalsimpl0(iM3145unboximpl, companion2.m3147getPolite0phEisY()) || !LiveRegionMode.m3142equalsimpl0(iM3145unboximpl, companion2.m3146getAssertive0phEisY())) ? 1 : 2);
            Unit unit5 = Unit.INSTANCE;
        }
        accessibilityNodeInfo.setClickable(false);
        SemanticsConfiguration unmergedConfig$ui_release5 = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release5, semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean zAreEqual = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getSelected()), Boolean.TRUE);
            accessibilityNodeInfo.setClickable(!zAreEqual);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) && !zAreEqual) {
                info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(16, accessibilityAction.getLabel()));
            }
            Unit unit6 = Unit.INSTANCE;
        }
        accessibilityNodeInfo.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            accessibilityNodeInfo.setLongClickable(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(32, accessibilityAction2.getLabel()));
            }
            Unit unit7 = Unit.INSTANCE;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(16384, accessibilityAction3.getLabel()));
            Unit unit8 = Unit.INSTANCE;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(2097152, accessibilityAction4.getLabel()));
                Unit unit9 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPerformImeAction());
            if (accessibilityAction5 != null) {
                info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                Unit unit10 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getCutText());
            if (accessibilityAction6 != null) {
                info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(65536, accessibilityAction6.getLabel()));
                Unit unit11 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPasteText());
            if (accessibilityAction7 != null) {
                if (accessibilityNodeInfo.isFocused() && this.view.getClipboardManager().hasText()) {
                    info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(ShareRequest.THUMB_DATA_SIZE_LIMIT, accessibilityAction7.getLabel()));
                }
                Unit unit12 = Unit.INSTANCE;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (!(iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0)) {
            accessibilityNodeInfo.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getSetSelection());
            info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.OooO00o(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            info.OooO00o(ConstantsKt.MINIMUM_BLOCK_SIZE);
            accessibilityNodeInfo.setMovementGranularities(11);
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getContentDescription());
            if ((list == null || list.isEmpty()) && semanticsNode.getUnmergedConfig().contains(semanticsActions.getGetTextLayoutResult()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode)) {
                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities() | 4 | 16);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ExtraDataIdKey);
            CharSequence charSequenceOooO0o = info.OooO0o();
            if (!(charSequenceOooO0o == null || charSequenceOooO0o.length() == 0) && semanticsNode.getUnmergedConfig().contains(semanticsActions.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig().contains(semanticsProperties3.getTestTag())) {
                arrayList.add(ExtraDataTestTagKey);
            }
            AccessibilityNodeInfoVerificationHelperMethods accessibilityNodeInfoVerificationHelperMethods = AccessibilityNodeInfoVerificationHelperMethods.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfo, "info.unwrap()");
            accessibilityNodeInfoVerificationHelperMethods.setAvailableExtraData(accessibilityNodeInfo, arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig().contains(semanticsActions.getSetProgress())) {
                info.OooOO0("android.widget.SeekBar");
            } else {
                info.OooOO0("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig().contains(semanticsActions.getSetProgress()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (progressBarRangeInfo.getCurrent() < RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                    info.OooO0O0(o0000O.o0Oo0oo.OooO00o.f34030OooOO0);
                }
                if (progressBarRangeInfo.getCurrent() > RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                    info.OooO0O0(o0000O.o0Oo0oo.OooO00o.f34031OooOO0O);
                }
            }
        }
        if (i2 >= 24) {
            Api24Impl.addSetProgressAction(info, semanticsNode);
        }
        CollectionInfoKt.setCollectionInfo(semanticsNode, info);
        CollectionInfoKt.setCollectionItemInfo(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                info.OooOO0("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                info.OooOOOO(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    info.OooO0O0(o0000O.o0Oo0oo.OooO00o.f34030OooOO0);
                    info.OooO0O0(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode) ? o0000O.o0Oo0oo.OooO00o.f34037OooOOo : o0000O.o0Oo0oo.OooO00o.f34036OooOOOo);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    info.OooO0O0(o0000O.o0Oo0oo.OooO00o.f34031OooOO0O);
                    info.OooO0O0(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode) ? o0000O.o0Oo0oo.OooO00o.f34036OooOOOo : o0000O.o0Oo0oo.OooO00o.f34037OooOOo);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                info.OooOO0("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                info.OooOOOO(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    info.OooO0O0(o0000O.o0Oo0oo.OooO00o.f34030OooOO0);
                    info.OooO0O0(o0000O.o0Oo0oo.OooO00o.f34038OooOOo0);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    info.OooO0O0(o0000O.o0Oo0oo.OooO00o.f34031OooOO0O);
                    info.OooO0O0(o0000O.o0Oo0oo.OooO00o.f34035OooOOOO);
                }
            }
        }
        if (i2 >= 29) {
            Api29Impl.addPageActions(info, semanticsNode);
        }
        CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getPaneTitle());
        if (i2 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            o0000O.o0Oo0oo.OooO0O0.OooO00o(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getExpand());
            if (accessibilityAction10 != null) {
                info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(262144, accessibilityAction10.getLabel()));
                Unit unit13 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getCollapse());
            if (accessibilityAction11 != null) {
                info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(524288, accessibilityAction11.getLabel()));
                Unit unit14 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getDismiss());
            if (accessibilityAction12 != null) {
                info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(ZegoConstants.ErrorMask.RoomServerErrorMask, accessibilityAction12.getLabel()));
                Unit unit15 = Unit.INSTANCE;
            }
            if (semanticsNode.getUnmergedConfig().contains(semanticsActions.getCustomActions())) {
                List list2 = (List) semanticsNode.getUnmergedConfig().get(semanticsActions.getCustomActions());
                int size2 = list2.size();
                int[] iArr = AccessibilityActionsResourceIds;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException(p022Oooo00O.OooOO0.OooO0O0(new StringBuilder("Can't have more than "), iArr.length, " custom actions for one widget"));
                }
                p188o00o0O.Oooo0<CharSequence> oooo0 = new p188o00o0O.Oooo0<>();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                p188o00o0O.Oooo0<Map<CharSequence, Integer>> oooo1 = this.labelToActionId;
                if (oooo1.f38807OooO0Oo) {
                    oooo1.OooO0o0();
                }
                if (p188o00o0O.OooOOO.OooO0O0(oooo1.f38810OooO0oO, virtualViewId, oooo1.f38809OooO0o0) >= 0) {
                    Map map = (Map) this.labelToActionId.OooO0o(virtualViewId, null);
                    List<Integer> mutableList = ArraysKt.toMutableList(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    for (int size3 = list2.size(); i3 < size3; size3 = size3) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list2.get(i3);
                        Intrinsics.checkNotNull(map);
                        if (map.containsKey(customAccessibilityAction.getLabel())) {
                            Integer num = (Integer) map.get(customAccessibilityAction.getLabel());
                            Intrinsics.checkNotNull(num);
                            oooo0.OooO0oo(num.intValue(), customAccessibilityAction.getLabel());
                            linkedHashMap.put(customAccessibilityAction.getLabel(), num);
                            mutableList.remove(num);
                            info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(num.intValue(), customAccessibilityAction.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                        i3++;
                        map = map;
                    }
                    int size4 = arrayList2.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i4);
                        int iIntValue = mutableList.get(i4).intValue();
                        oooo0.OooO0oo(iIntValue, customAccessibilityAction2.getLabel());
                        linkedHashMap.put(customAccessibilityAction2.getLabel(), Integer.valueOf(iIntValue));
                        info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(iIntValue, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list2.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list2.get(i5);
                        int i6 = AccessibilityActionsResourceIds[i5];
                        oooo0.OooO0oo(i6, customAccessibilityAction3.getLabel());
                        linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(i6));
                        info.OooO0O0(new o0000O.o0Oo0oo.OooO00o(i6, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.OooO0oo(virtualViewId, oooo0);
                this.labelToActionId.OooO0oo(virtualViewId, linkedHashMap);
            }
        }
        boolean zIsScreenReaderFocusable = isScreenReaderFocusable(semanticsNode);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(zIsScreenReaderFocusable);
        } else {
            info.OooO0oo(1, zIsScreenReaderFocusable);
        }
        Integer num2 = this.idToBeforeMap.get(Integer.valueOf(virtualViewId));
        if (num2 != null) {
            num2.intValue();
            View viewSemanticsIdToView = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (viewSemanticsIdToView != null) {
                accessibilityNodeInfo.setTraversalBefore(viewSemanticsIdToView);
            } else {
                accessibilityNodeInfo.setTraversalBefore(this.view, num2.intValue());
            }
            Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfo, "info.unwrap()");
            addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, accessibilityNodeInfo, this.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL, null);
            Unit unit16 = Unit.INSTANCE;
        }
        Integer num3 = this.idToAfterMap.get(Integer.valueOf(virtualViewId));
        if (num3 != null) {
            num3.intValue();
            View viewSemanticsIdToView2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (viewSemanticsIdToView2 != null) {
                accessibilityNodeInfo.setTraversalAfter(viewSemanticsIdToView2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(this.view, num3.intValue());
            }
            Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfo, "info.unwrap()");
            addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, accessibilityNodeInfo, this.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL, null);
            Unit unit17 = Unit.INSTANCE;
        }
    }

    @VisibleForTesting
    public final void sendContentCaptureSemanticsStructureChangeEvents$ui_release(@NotNull SemanticsNode newNode, @NotNull SemanticsNodeCopy oldNode) {
        Intrinsics.checkNotNullParameter(newNode, "newNode");
        Intrinsics.checkNotNullParameter(oldNode, "oldNode");
        List<SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode.getId())) && !oldNode.getChildren().contains(Integer.valueOf(semanticsNode.getId()))) {
                notifySubtreeAppeared(semanticsNode);
            }
        }
        for (Map.Entry<Integer, SemanticsNodeCopy> entry : this.previousSemanticsNodes.entrySet()) {
            if (!getCurrentSemanticsNodes$ui_release().containsKey(entry.getKey())) {
                bufferContentCaptureViewDisappeared(entry.getKey().intValue());
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = newNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes$ui_release().containsKey(Integer.valueOf(semanticsNode2.getId())) && this.previousSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode2.getId()));
                Intrinsics.checkNotNull(semanticsNodeCopy);
                sendContentCaptureSemanticsStructureChangeEvents$ui_release(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x056a  */
    @VisibleForTesting
    public final void sendSemanticsPropertyChangeEvents$ui_release(@NotNull Map<Integer, SemanticsNodeWithAdjustedBounds> newSemanticsNodes) {
        AccessibilityEvent accessibilityEventCreateTextSelectionChangedEvent;
        String text;
        Map<Integer, SemanticsNodeWithAdjustedBounds> newSemanticsNodes2 = newSemanticsNodes;
        Intrinsics.checkNotNullParameter(newSemanticsNodes2, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.scrollObservationScopes);
        this.scrollObservationScopes.clear();
        Iterator<Integer> it = newSemanticsNodes.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(iIntValue));
            if (semanticsNodeCopy != null) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = newSemanticsNodes2.get(Integer.valueOf(iIntValue));
                SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                Intrinsics.checkNotNull(semanticsNode);
                boolean zPropertiesDeleted = false;
                for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsNode.getUnmergedConfig()) {
                    SemanticsPropertyKey<?> key = entry.getKey();
                    SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                    if (((Intrinsics.areEqual(key, semanticsProperties.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(entry.getKey(), semanticsProperties.getVerticalScrollAxisRange())) ? registerScrollingId(iIntValue, arrayList) : false) || !Intrinsics.areEqual(entry.getValue(), SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), entry.getKey()))) {
                        SemanticsPropertyKey<?> key2 = entry.getKey();
                        if (Intrinsics.areEqual(key2, semanticsProperties.getText())) {
                            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsProperties.getText());
                            AnnotatedString annotatedString = list != null ? (AnnotatedString) CollectionsKt.firstOrNull(list) : null;
                            List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getText());
                            AnnotatedString annotatedString2 = list2 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list2) : null;
                            if (!Intrinsics.areEqual(annotatedString, annotatedString2)) {
                                sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(annotatedString2));
                            }
                        } else if (Intrinsics.areEqual(key2, semanticsProperties.getPaneTitle())) {
                            Object value = entry.getValue();
                            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) value;
                            if (semanticsNodeCopy.hasPaneTitle()) {
                                sendPaneChangeEvents(iIntValue, 8, str);
                            }
                        } else if (Intrinsics.areEqual(key2, semanticsProperties.getStateDescription()) ? true : Intrinsics.areEqual(key2, semanticsProperties.getToggleableState())) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 2048, 64, null, 8, null);
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 2048, 0, null, 8, null);
                        } else if (Intrinsics.areEqual(key2, semanticsProperties.getProgressBarRangeInfo())) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 2048, 64, null, 8, null);
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 2048, 0, null, 8, null);
                        } else if (Intrinsics.areEqual(key2, semanticsProperties.getSelected())) {
                            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getRole());
                            if (!(role == null ? false : Role.m3151equalsimpl0(role.getValue(), Role.INSTANCE.m3161getTabo7Vup1c()))) {
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 2048, 64, null, 8, null);
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 2048, 0, null, 8, null);
                            } else if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelected()), Boolean.TRUE)) {
                                AccessibilityEvent accessibilityEventCreateEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 4);
                                SemanticsNode semanticsNodeCopyWithMergingEnabled$ui_release = semanticsNode.copyWithMergingEnabled$ui_release();
                                List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopyWithMergingEnabled$ui_release.getConfig(), semanticsProperties.getContentDescription());
                                String strFastJoinToString$default = list3 != null ? TempListUtilsKt.fastJoinToString$default(list3, ",", null, null, 0, null, null, 62, null) : null;
                                List list4 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopyWithMergingEnabled$ui_release.getConfig(), semanticsProperties.getText());
                                String strFastJoinToString$default2 = list4 != null ? TempListUtilsKt.fastJoinToString$default(list4, ",", null, null, 0, null, null, 62, null) : null;
                                if (strFastJoinToString$default != null) {
                                    accessibilityEventCreateEvent$ui_release.setContentDescription(strFastJoinToString$default);
                                }
                                if (strFastJoinToString$default2 != null) {
                                    accessibilityEventCreateEvent$ui_release.getText().add(strFastJoinToString$default2);
                                }
                                sendEvent(accessibilityEventCreateEvent$ui_release);
                            } else {
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 2048, 0, null, 8, null);
                            }
                        } else if (Intrinsics.areEqual(key2, semanticsProperties.getContentDescription())) {
                            int iSemanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue);
                            Object value2 = entry.getValue();
                            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            sendEventForVirtualView(iSemanticsNodeIdToAccessibilityVirtualNodeId, 2048, 4, (List) value2);
                        } else {
                            String str2 = "";
                            if (Intrinsics.areEqual(key2, semanticsProperties.getEditableText())) {
                                if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode)) {
                                    AnnotatedString textForTextField = getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                    if (textForTextField == null) {
                                        textForTextField = "";
                                    }
                                    AnnotatedString textForTextField2 = getTextForTextField(semanticsNode.getUnmergedConfig());
                                    str2 = textForTextField2 != null ? textForTextField2 : "";
                                    CharSequence charSequenceTrimToSize = trimToSize(str2, ParcelSafeTextLength);
                                    int length = textForTextField.length();
                                    int length2 = str2.length();
                                    int iCoerceAtMost = RangesKt.coerceAtMost(length, length2);
                                    int i = 0;
                                    while (i < iCoerceAtMost && textForTextField.charAt(i) == str2.charAt(i)) {
                                        i++;
                                    }
                                    int i2 = 0;
                                    while (i2 < iCoerceAtMost - i) {
                                        int i3 = iCoerceAtMost;
                                        if (textForTextField.charAt((length - 1) - i2) != str2.charAt((length2 - 1) - i2)) {
                                            break;
                                        }
                                        i2++;
                                        iCoerceAtMost = i3;
                                    }
                                    int i4 = (length - i2) - i;
                                    int i5 = (length2 - i2) - i;
                                    boolean z = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNodeCopy.getSemanticsNode()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeCopy.getSemanticsNode()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode);
                                    boolean z2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNodeCopy.getSemanticsNode()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeCopy.getSemanticsNode()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode);
                                    if (z || z2) {
                                        accessibilityEventCreateTextSelectionChangedEvent = createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 0, 0, Integer.valueOf(length2), charSequenceTrimToSize);
                                    } else {
                                        accessibilityEventCreateTextSelectionChangedEvent = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 16);
                                        accessibilityEventCreateTextSelectionChangedEvent.setFromIndex(i);
                                        accessibilityEventCreateTextSelectionChangedEvent.setRemovedCount(i4);
                                        accessibilityEventCreateTextSelectionChangedEvent.setAddedCount(i5);
                                        accessibilityEventCreateTextSelectionChangedEvent.setBeforeText(textForTextField);
                                        accessibilityEventCreateTextSelectionChangedEvent.getText().add(charSequenceTrimToSize);
                                    }
                                    accessibilityEventCreateTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                    sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                    if (z || z2) {
                                        long jM3314unboximpl = ((TextRange) semanticsNode.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue();
                                        accessibilityEventCreateTextSelectionChangedEvent.setFromIndex(TextRange.m3310getStartimpl(jM3314unboximpl));
                                        accessibilityEventCreateTextSelectionChangedEvent.setToIndex(TextRange.m3305getEndimpl(jM3314unboximpl));
                                        sendEvent(accessibilityEventCreateTextSelectionChangedEvent);
                                    }
                                } else {
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 2048, 2, null, 8, null);
                                }
                            } else if (Intrinsics.areEqual(key2, semanticsProperties.getTextSelectionRange())) {
                                AnnotatedString textForTextField3 = getTextForTextField(semanticsNode.getUnmergedConfig());
                                if (textForTextField3 != null && (text = textForTextField3.getText()) != null) {
                                    str2 = text;
                                }
                                long jM3314unboximpl2 = ((TextRange) semanticsNode.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue();
                                sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), Integer.valueOf(TextRange.m3310getStartimpl(jM3314unboximpl2)), Integer.valueOf(TextRange.m3305getEndimpl(jM3314unboximpl2)), Integer.valueOf(str2.length()), trimToSize(str2, ParcelSafeTextLength)));
                                sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
                            } else if (Intrinsics.areEqual(key2, semanticsProperties.getHorizontalScrollAxisRange()) ? true : Intrinsics.areEqual(key2, semanticsProperties.getVerticalScrollAxisRange())) {
                                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode());
                                ScrollObservationScope scrollObservationScopeFindById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(this.scrollObservationScopes, iIntValue);
                                Intrinsics.checkNotNull(scrollObservationScopeFindById);
                                scrollObservationScopeFindById.setHorizontalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getHorizontalScrollAxisRange()));
                                scrollObservationScopeFindById.setVerticalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getVerticalScrollAxisRange()));
                                sendScrollEventIfNeeded(scrollObservationScopeFindById);
                            } else if (Intrinsics.areEqual(key2, semanticsProperties.getFocused())) {
                                Object value3 = entry.getValue();
                                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                if (((Boolean) value3).booleanValue()) {
                                    sendEvent(createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 8));
                                }
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 2048, 0, null, 8, null);
                            } else {
                                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                                if (Intrinsics.areEqual(key2, semanticsActions.getCustomActions())) {
                                    List list5 = (List) semanticsNode.getUnmergedConfig().get(semanticsActions.getCustomActions());
                                    List list6 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsActions.getCustomActions());
                                    if (list6 != null) {
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        int size = list5.size();
                                        for (int i6 = 0; i6 < size; i6++) {
                                            linkedHashSet.add(((CustomAccessibilityAction) list5.get(i6)).getLabel());
                                        }
                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                        int size2 = list6.size();
                                        for (int i7 = 0; i7 < size2; i7++) {
                                            linkedHashSet2.add(((CustomAccessibilityAction) list6.get(i7)).getLabel());
                                        }
                                        if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                            zPropertiesDeleted = false;
                                        } else {
                                            zPropertiesDeleted = true;
                                        }
                                    } else if (!list5.isEmpty()) {
                                        zPropertiesDeleted = true;
                                    }
                                } else if (entry.getValue() instanceof AccessibilityAction) {
                                    Object value4 = entry.getValue();
                                    Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                    zPropertiesDeleted = !AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((AccessibilityAction) value4, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), entry.getKey()));
                                } else {
                                    zPropertiesDeleted = true;
                                }
                            }
                        }
                    }
                }
                if (!zPropertiesDeleted) {
                    zPropertiesDeleted = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode, semanticsNodeCopy);
                }
                if (zPropertiesDeleted) {
                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(iIntValue), 2048, 0, null, 8, null);
                }
                newSemanticsNodes2 = newSemanticsNodes;
            }
        }
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
    }

    public final void setContentCaptureForceEnabledForTesting$ui_release(boolean z) {
        this.contentCaptureForceEnabledForTesting = z;
    }

    public final void setContentCaptureSession$ui_release(@Nullable ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public final void setCurrentSemanticsNodes$ui_release(@NotNull Map<Integer, SemanticsNodeWithAdjustedBounds> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.currentSemanticsNodes = map;
    }

    public final void setHoveredVirtualViewId$ui_release(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final void setIdToAfterMap$ui_release(@NotNull HashMap<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.idToAfterMap = map;
    }

    public final void setIdToBeforeMap$ui_release(@NotNull HashMap<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.idToBeforeMap = map;
    }

    public final void setPreviousSemanticsNodes$ui_release(@NotNull Map<Integer, SemanticsNodeCopy> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.previousSemanticsNodes = map;
    }
}
