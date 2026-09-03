package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b#\b \u0018\u0000 \u0092\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004\u0092\u0002\u0093\u0002B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u0086\u0001\u001a\u00020\u00072\u0007\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020 H\u0002J,\u0010\u0086\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u00002\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J \u0010\u008e\u0001\u001a\u00020Q2\u0006\u0010P\u001a\u00020QH\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J*\u0010\u0091\u0001\u001a\u00020\u001a2\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\u0006\u0010P\u001a\u00020QH\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0010\u0010\u0095\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u0006J\u001c\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u00062\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0004J\u0012\u0010\u009a\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u009b\u0001\u001a\u00020\u0007H&J\u0018\u0010\u009c\u0001\u001a\u00020\u00002\u0007\u0010\u009d\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0003\b\u009e\u0001J\"\u0010\u009f\u0001\u001a\u00030\u008a\u00012\u0007\u0010b\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b \u0001\u0010\u0090\u0001J\u001b\u0010¡\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020 H\u0002J&\u0010£\u0001\u001a\u00020 2\f\u0010¤\u0001\u001a\u0007\u0012\u0002\b\u00030¥\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J&\u0010¨\u0001\u001a\u0004\u0018\u00010w2\f\u0010¤\u0001\u001a\u0007\u0012\u0002\b\u00030¥\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0014\u0010«\u0001\u001a\u0004\u0018\u00010w2\u0007\u0010¬\u0001\u001a\u00020 H\u0002JF\u0010\u00ad\u0001\u001a\u00020\u00072\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020 2\u0007\u0010³\u0001\u001a\u00020 ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b´\u0001\u0010µ\u0001JH\u0010¶\u0001\u001a\u00020\u00072\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020 2\u0007\u0010³\u0001\u001a\u00020 H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b·\u0001\u0010µ\u0001J\t\u0010¸\u0001\u001a\u00020\u0007H\u0016J\u0013\u0010¹\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0096\u0002J\"\u0010º\u0001\u001a\u00020 2\b\u0010\u0092\u0001\u001a\u00030\u008a\u0001H\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0007\u0010½\u0001\u001a\u00020 J\u001c\u0010¾\u0001\u001a\u00030¿\u00012\u0007\u0010À\u0001\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020 H\u0016J,\u0010Á\u0001\u001a\u00030\u008a\u00012\u0007\u0010À\u0001\u001a\u00020\u00032\b\u0010Â\u0001\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J#\u0010Å\u0001\u001a\u00030\u008a\u00012\b\u0010Æ\u0001\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÇ\u0001\u0010\u0090\u0001J#\u0010È\u0001\u001a\u00030\u008a\u00012\b\u0010Æ\u0001\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÉ\u0001\u0010\u0090\u0001J#\u0010Ê\u0001\u001a\u00030\u008a\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bË\u0001\u0010\u0090\u0001J\u000f\u0010Ì\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\bÍ\u0001J\t\u0010Î\u0001\u001a\u00020\u0007H\u0016J\u0007\u0010Ï\u0001\u001a\u00020\u0007J\u001b\u0010Ð\u0001\u001a\u00020\u00072\u0007\u0010Ñ\u0001\u001a\u00020V2\u0007\u0010Ò\u0001\u001a\u00020VH\u0014J\u0007\u0010Ó\u0001\u001a\u00020\u0007J\u0007\u0010Ô\u0001\u001a\u00020\u0007J\u0007\u0010Õ\u0001\u001a\u00020\u0007J\u0012\u0010Ö\u0001\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u0006H\u0016J8\u0010×\u0001\u001a\u00030Ø\u00012\u0007\u0010Ù\u0001\u001a\u00020-2\u0010\b\u0004\u0010Ú\u0001\u001a\t\u0012\u0005\u0012\u00030Ø\u00010$H\u0084\bø\u0001\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001JD\u0010Ý\u0001\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0007\u0010\u0082\u0001\u001a\u00020\u001a2\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b5H\u0014ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÞ\u0001\u0010ß\u0001JD\u0010à\u0001\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0007\u0010\u0082\u0001\u001a\u00020\u001a2\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b5H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bá\u0001\u0010ß\u0001JB\u0010â\u0001\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0007\u0010\u0082\u0001\u001a\u00020\u001a2\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b5ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bã\u0001\u0010ß\u0001J\u001d\u0010ä\u0001\u001a\u00020\u00072\b\u0010\u0088\u0001\u001a\u00030¿\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010å\u0001J,\u0010æ\u0001\u001a\u00020\u00072\u0007\u0010¢\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020 2\t\b\u0002\u0010ç\u0001\u001a\u00020 H\u0000¢\u0006\u0003\bè\u0001J\u000f\u0010é\u0001\u001a\u00020\u0007H\u0010¢\u0006\u0003\bê\u0001J\u0007\u0010ë\u0001\u001a\u00020 J\"\u0010ì\u0001\u001a\u00030\u008a\u00012\u0007\u0010b\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bí\u0001\u0010\u0090\u0001J\b\u0010î\u0001\u001a\u00030¿\u0001J+\u0010ï\u0001\u001a\u00020\u00072\u0007\u0010À\u0001\u001a\u00020\u00032\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bò\u0001\u0010ó\u0001J+\u0010ô\u0001\u001a\u00020\u00072\u0007\u0010\u0087\u0001\u001a\u00020\u00002\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bõ\u0001\u0010ö\u0001J+\u0010÷\u0001\u001a\u00020\u00072\u0007\u0010\u0087\u0001\u001a\u00020\u00002\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010ö\u0001J-\u0010ù\u0001\u001a\u00020\u00072\u0019\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b52\t\b\u0002\u0010ú\u0001\u001a\u00020 J\u0014\u0010û\u0001\u001a\u00020\u00072\t\b\u0002\u0010ü\u0001\u001a\u00020 H\u0002JL\u0010ý\u0001\u001a\u00020\u0007\"\u0007\b\u0000\u0010þ\u0001\u0018\u00012\u000f\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u0003Hþ\u00010¥\u00012\u0014\u0010Ú\u0001\u001a\u000f\u0012\u0005\u0012\u0003Hþ\u0001\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J4\u0010ý\u0001\u001a\u00020\u00072\u0007\u0010\u0081\u0002\u001a\u00020V2\u0007\u0010¬\u0001\u001a\u00020 2\u0013\u0010Ú\u0001\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0003J#\u0010\u0082\u0002\u001a\u00030\u008a\u00012\b\u0010\u0083\u0002\u001a\u00030\u008a\u0001H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0084\u0002\u0010\u0090\u0001J+\u0010\u0085\u0002\u001a\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00020\u00062\u0013\u0010Ú\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0003J\"\u0010\u0086\u0002\u001a\u00020 2\b\u0010\u0092\u0001\u001a\u00030\u008a\u0001H\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0087\u0002\u0010¼\u0001JN\u0010\u0088\u0002\u001a\u00020\u0007*\u0004\u0018\u00010w2\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020 2\u0007\u0010³\u0001\u001a\u00020 H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002JW\u0010\u008b\u0002\u001a\u00020\u0007*\u0004\u0018\u00010w2\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020 2\u0007\u0010³\u0001\u001a\u00020 2\u0007\u0010\u008c\u0002\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002JW\u0010\u008f\u0002\u001a\u00020\u0007*\u0004\u0018\u00010w2\b\u0010®\u0001\u001a\u00030¯\u00012\b\u0010\u0092\u0001\u001a\u00030\u008a\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010²\u0001\u001a\u00020 2\u0007\u0010³\u0001\u001a\u00020 2\u0007\u0010\u008c\u0002\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0090\u0002\u0010\u008e\u0002J\r\u0010\u0091\u0002\u001a\u00020\u0000*\u00020\u0003H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u000e\u0010&\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\"R\u000e\u0010(\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020 @BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u001d\u0010,\u001a\u00020-8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b.\u0010/R\"\u00101\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u000100@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103RD\u00106\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b52\u0019\u0010)\u001a\u0015\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b5@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR&\u0010E\u001a\u0004\u0018\u00010D2\b\u0010)\u001a\u0004\u0018\u00010D@dX¦\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020\f8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020Q8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bR\u0010/R\u001c\u0010S\u001a\u0010\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V\u0018\u00010TX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010W\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0015R\u0013\u0010Y\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0018R\u0016\u0010[\u001a\u0004\u0018\u00010\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0013\u0010_\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b`\u0010\u0018R/\u0010b\u001a\u00020a2\u0006\u0010)\u001a\u00020a@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010f\u001a\u0004\bc\u0010/\"\u0004\bd\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020U0h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u000e\u0010n\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010o\u001a\u00020p8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bq\u0010/R\u0014\u0010r\u001a\u00020s8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0012\u0010v\u001a\u00020wX¦\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u001c\u0010z\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010|\"\u0005\b\u0081\u0001\u0010~R(\u0010\u0082\u0001\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a@DX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u001c\"\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006\u0094\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "child", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinates", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "hasMeasureResult", "", "getHasMeasureResult", "()Z", "invalidateParentLayer", "Lkotlin/Function0;", "isAttached", "isClipping", "isValidOwnerScope", "lastLayerAlpha", "<set-?>", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "lastMeasurementConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastMeasurementConstraints-msEJaDk$ui_release", "()J", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "measureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "minimumTouchTargetSize", "Landroidx/compose/ui/geometry/Size;", "getMinimumTouchTargetSize-NH-jbRc", "oldAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "parent", "getParent", "parentCoordinates", "getParentCoordinates", "parentData", "", "getParentData", "()Ljava/lang/Object;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "Landroidx/compose/ui/unit/IntOffset;", "position", "getPosition-nOcc-ac", "setPosition--gyyYBs", "(J)V", "J", "providedAlignmentLines", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "rectCache", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "released", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "wrapped", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "zIndex", "getZIndex", "setZIndex", "(F)V", "ancestorToLocal", "ancestor", "rect", "clipBounds", "Landroidx/compose/ui/geometry/Offset;", "offset", "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "calculateMinimumTouchTargetPadding", "calculateMinimumTouchTargetPadding-E7KxVPU", "(J)J", "distanceInMinimumTouchTarget", "pointerPosition", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "draw", "canvas", "drawBorder", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawContainedDrawModifiers", "ensureLookaheadDelegateCreated", "findCommonAncestor", "other", "findCommonAncestor$ui_release", "fromParentPosition", "fromParentPosition-MK-Hz9U", "fromParentRect", "bounds", "hasNode", "type", "Landroidx/compose/ui/node/NodeKind;", "hasNode-H91voCI", "(I)Z", "head", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", "headNode", "includeTail", "hitTest", "hitTestSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "isInLayer", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestChild", "hitTestChild-YqVAtuI", "invalidateLayer", "invoke", "isPointerInBounds", "isPointerInBounds-k-4lQ0M", "(J)Z", "isTransparent", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "localPositionOf", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "localToWindow", "localToWindow-MK-Hz9U", "offsetFromEdge", "offsetFromEdge-MK-Hz9U", "onCoordinatesUsed", "onCoordinatesUsed$ui_release", "onLayoutModifierNodeChanged", "onLayoutNodeAttach", "onMeasureResultChanged", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "onMeasured", "onPlaced", "onRelease", "performDraw", "performingMeasure", "Landroidx/compose/ui/layout/Placeable;", "constraints", ReportItem.LogTypeBlock, "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "placeAt", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeSelf", "placeSelf-f8xVGno", "placeSelfApparentToRealOffset", "placeSelfApparentToRealOffset-f8xVGno", "propagateRelocationRequest", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rectInParent", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "replace", "replace$ui_release", "shouldSharePointerInputWithSiblings", "toParentPosition", "toParentPosition-MK-Hz9U", "touchBoundsInRoot", "transformFrom", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFromAncestor", "transformFromAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformToAncestor-EL8BTi8", "updateLayerBlock", "forceUpdateLayerParameters", "updateLayerParameters", "invokeOnLayoutChange", "visitNodes", "T", "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "mask", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "withPositionTranslation", "withinLayerBounds", "withinLayerBounds-k-4lQ0M", "hit", "hit-1hIXUjU", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitNear", "distanceFromEdge", "hitNear-JHbHoSQ", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZF)V", "speculativeHit", "speculativeHit-JHbHoSQ", "toCoordinator", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 11 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 12 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1351:1\n96#1,5:1352\n101#1,4:1400\n96#1,9:1404\n107#1:1415\n96#1,13:1416\n109#1:1472\n101#1,10:1473\n107#1:1545\n96#1,13:1546\n109#1:1602\n101#1,10:1603\n107#1:1618\n96#1,13:1619\n109#1:1675\n101#1,10:1676\n383#2,6:1357\n393#2,2:1364\n395#2,8:1369\n403#2,9:1380\n412#2,8:1392\n383#2,6:1429\n393#2,2:1436\n395#2,8:1441\n403#2,9:1452\n412#2,8:1464\n383#2,6:1490\n393#2,2:1497\n395#2,8:1502\n403#2,9:1513\n412#2,8:1525\n383#2,6:1559\n393#2,2:1566\n395#2,8:1571\n403#2,9:1582\n412#2,8:1594\n383#2,6:1632\n393#2,2:1639\n395#2,8:1644\n403#2,9:1655\n412#2,8:1667\n206#2:1688\n207#2,8:1690\n219#2:1700\n190#2:1701\n191#2,6:1703\n220#2:1709\n383#2,6:1710\n393#2,2:1717\n395#2,8:1722\n403#2,9:1733\n412#2,8:1745\n221#2:1753\n198#2,3:1754\n261#3:1363\n261#3:1435\n261#3:1488\n261#3:1496\n261#3:1565\n261#3:1638\n261#3:1716\n234#4,3:1366\n237#4,3:1389\n234#4,3:1438\n237#4,3:1461\n234#4,3:1499\n237#4,3:1522\n234#4,3:1568\n237#4,3:1591\n234#4,3:1641\n237#4,3:1664\n234#4,3:1719\n237#4,3:1742\n1182#5:1377\n1161#5,2:1378\n1182#5:1449\n1161#5,2:1450\n1182#5:1510\n1161#5,2:1511\n1182#5:1579\n1161#5,2:1580\n1182#5:1652\n1161#5,2:1653\n1182#5:1730\n1161#5,2:1731\n1#6:1413\n1#6:1689\n1#6:1702\n74#7:1414\n82#7:1483\n82#7:1487\n82#7:1489\n84#7:1536\n84#7:1544\n74#7:1616\n84#7:1617\n72#7:1686\n72#7:1687\n78#7:1698\n78#7:1699\n754#8,3:1484\n757#8,3:1533\n495#9,4:1537\n500#9:1614\n129#10,3:1541\n133#10:1613\n86#11:1615\n66#12,5:1757\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n107#1:1352,5\n107#1:1400,4\n117#1:1404,9\n215#1:1415\n215#1:1416,13\n215#1:1472\n215#1:1473,10\n294#1:1545\n294#1:1546,13\n294#1:1602\n294#1:1603,10\n374#1:1618\n374#1:1619,13\n374#1:1675\n374#1:1676,10\n108#1:1357,6\n108#1:1364,2\n108#1:1369,8\n108#1:1380,9\n108#1:1392,8\n215#1:1429,6\n215#1:1436,2\n215#1:1441,8\n215#1:1452,9\n215#1:1464,8\n239#1:1490,6\n239#1:1497,2\n239#1:1502,8\n239#1:1513,9\n239#1:1525,8\n294#1:1559,6\n294#1:1566,2\n294#1:1571,8\n294#1:1582,9\n294#1:1594,8\n374#1:1632,6\n374#1:1639,2\n374#1:1644,8\n374#1:1655,9\n374#1:1667,8\n1067#1:1688\n1067#1:1690,8\n1100#1:1700\n1100#1:1701\n1100#1:1703,6\n1100#1:1709\n1100#1:1710,6\n1100#1:1717,2\n1100#1:1722,8\n1100#1:1733,9\n1100#1:1745,8\n1100#1:1753\n1100#1:1754,3\n108#1:1363\n215#1:1435\n238#1:1488\n239#1:1496\n294#1:1565\n374#1:1638\n1100#1:1716\n108#1:1366,3\n108#1:1389,3\n215#1:1438,3\n215#1:1461,3\n239#1:1499,3\n239#1:1522,3\n294#1:1568,3\n294#1:1591,3\n374#1:1641,3\n374#1:1664,3\n1100#1:1719,3\n1100#1:1742,3\n108#1:1377\n108#1:1378,2\n215#1:1449\n215#1:1450,2\n239#1:1510\n239#1:1511,2\n294#1:1579\n294#1:1580,2\n374#1:1652\n374#1:1653,2\n1100#1:1730\n1100#1:1731,2\n1067#1:1689\n1100#1:1702\n215#1:1414\n231#1:1483\n238#1:1487\n239#1:1489\n292#1:1536\n294#1:1544\n360#1:1616\n374#1:1617\n667#1:1686\n1067#1:1687\n1099#1:1698\n1100#1:1699\n237#1:1484,3\n237#1:1533,3\n293#1:1537,4\n293#1:1614\n293#1:1541,3\n293#1:1613\n340#1:1615\n1142#1:1757,5\n*E\n"})
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope, Function1<Canvas, Unit> {

    @NotNull
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";

    @NotNull
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";

    @Nullable
    private MeasureResult _measureResult;

    @Nullable
    private MutableRect _rectCache;

    @NotNull
    private final Function0<Unit> invalidateParentLayer;
    private boolean isClipping;
    private float lastLayerAlpha;
    private boolean lastLayerDrawingWasSkipped;

    @Nullable
    private OwnedLayer layer;

    @Nullable
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;

    @NotNull
    private Density layerDensity;

    @NotNull
    private LayoutDirection layerLayoutDirection;

    @Nullable
    private LayerPositionalProperties layerPositionalProperties;

    @NotNull
    private final LayoutNode layoutNode;

    @Nullable
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position;
    private boolean released;

    @Nullable
    private NodeCoordinator wrapped;

    @Nullable
    private NodeCoordinator wrappedBy;
    private float zIndex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayerParams = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull NodeCoordinator coordinator) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            if (coordinator.isValidOwnerScope()) {
                LayerPositionalProperties layerPositionalProperties = coordinator.layerPositionalProperties;
                if (layerPositionalProperties == null) {
                    NodeCoordinator.updateLayerParameters$default(coordinator, false, 1, null);
                    return;
                }
                NodeCoordinator.tmpLayerPositionalProperties.copyFrom(layerPositionalProperties);
                NodeCoordinator.updateLayerParameters$default(coordinator, false, 1, null);
                if (NodeCoordinator.tmpLayerPositionalProperties.hasSameValuesAs(layerPositionalProperties)) {
                    return;
                }
                LayoutNode layoutNode = coordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner owner = layoutNode.getOwner();
                if (owner != null) {
                    owner.requestOnPositionedCallback(layoutNode);
                }
            }
        }
    };

    @NotNull
    private static final Function1<NodeCoordinator, Unit> onCommitAffectingLayer = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull NodeCoordinator coordinator) {
            Intrinsics.checkNotNullParameter(coordinator, "coordinator");
            OwnedLayer layer = coordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };

    @NotNull
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();

    @NotNull
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();

    @NotNull
    private static final float[] tmpMatrix = Matrix.m1886constructorimpl$default(null, 1, null);

    @NotNull
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo2999childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m2929hitTestM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo3000entityTypeOLwlOKw() {
            return NodeKind.m3004constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException
            */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier.Node r10) {
            /*
                r9 = this;
                java.lang.String r0 = "node"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r0 = 16
                int r1 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r0)
                r2 = 0
                r3 = r2
            Ld:
                r4 = 0
                if (r10 == 0) goto L69
                boolean r5 = r10 instanceof androidx.compose.ui.node.PointerInputModifierNode
                r6 = 1
                if (r5 == 0) goto L1e
                androidx.compose.ui.node.PointerInputModifierNode r10 = (androidx.compose.ui.node.PointerInputModifierNode) r10
                boolean r10 = r10.interceptOutOfBoundsChildEvents()
                if (r10 == 0) goto L64
                return r6
            L1e:
                int r5 = r10.getKindSet()
                r5 = r5 & r1
                if (r5 == 0) goto L27
                r5 = r6
                goto L28
            L27:
                r5 = r4
            L28:
                if (r5 == 0) goto L64
                boolean r5 = r10 instanceof androidx.compose.ui.node.DelegatingNode
                if (r5 == 0) goto L64
                r5 = r10
                androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
                androidx.compose.ui.Modifier$Node r5 = r5.getDelegate()
                r7 = r4
            L36:
                if (r5 == 0) goto L61
                int r8 = r5.getKindSet()
                r8 = r8 & r1
                if (r8 == 0) goto L41
                r8 = r6
                goto L42
            L41:
                r8 = r4
            L42:
                if (r8 == 0) goto L5c
                int r7 = r7 + 1
                if (r7 != r6) goto L4a
                r10 = r5
                goto L5c
            L4a:
                if (r3 != 0) goto L53
                androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
                androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r0]
                r3.<init>(r8, r4)
            L53:
                if (r10 == 0) goto L59
                r3.add(r10)
                r10 = r2
            L59:
                r3.add(r5)
            L5c:
                androidx.compose.ui.Modifier$Node r5 = r5.getChild()
                goto L36
            L61:
                if (r7 != r6) goto L64
                goto Ld
            L64:
                androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r3)
                goto Ld
            L69:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1.interceptOutOfBoundsChildEvents(androidx.compose.ui.Modifier$Node):boolean");
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            return true;
        }
    };

    @NotNull
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        public void mo2999childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.m2930hitTestSemanticsM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw */
        public int mo3000entityTypeOLwlOKw() {
            return NodeKind.m3004constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(@NotNull Modifier.Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            SemanticsConfiguration collapsedSemantics$ui_release = parentLayoutNode.getCollapsedSemantics$ui_release();
            boolean z = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.getIsClearingSemantics()) {
                z = true;
            }
            return !z;
        }
    };

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\u00020\u0016X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "()V", "ExpectAttachedLayoutCoordinates", "", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "UnmeasuredError", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "onCommitAffectingLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayerParams", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        @NotNull
        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J=\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H&ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0005H&ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "node", "Landroidx/compose/ui/Modifier$Node;", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface HitTestSource {
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        void mo2999childHitTestYqVAtuI(@NotNull LayoutNode layoutNode, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer);

        /* JADX INFO: renamed from: entityType-OLwlOKw */
        int mo3000entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(@NotNull Modifier.Node node);

        boolean shouldHitTestChildren(@NotNull LayoutNode parentLayoutNode);
    }

    public NodeCoordinator(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.layerDensity = getLayoutNode().getDensity();
        this.layerLayoutDirection = getLayoutNode().getLayoutDirection();
        this.lastLayerAlpha = 0.8f;
        this.position = IntOffset.INSTANCE.m3903getZeronOccac();
        this.invalidateParentLayer = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
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
                NodeCoordinator wrappedBy = this.this$0.getWrappedBy();
                if (wrappedBy != null) {
                    wrappedBy.invalidateLayer();
                }
            }
        };
    }

    private final void ancestorToLocal(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.ancestorToLocal(ancestor, rect, clipBounds);
        }
        fromParentRect(rect, clipBounds);
    }

    /* JADX INFO: renamed from: ancestorToLocal-R5De75A, reason: not valid java name */
    private final long m2976ancestorToLocalR5De75A(NodeCoordinator ancestor, long offset) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || Intrinsics.areEqual(ancestor, nodeCoordinator)) ? m2987fromParentPositionMKHz9U(offset) : m2987fromParentPositionMKHz9U(nodeCoordinator.m2976ancestorToLocalR5De75A(ancestor, offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas) {
        Modifier.Node nodeM2990headH91voCI = m2990headH91voCI(NodeKind.m3004constructorimpl(4));
        if (nodeM2990headH91voCI == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m2939drawx_KDEd0$ui_release(canvas, IntSizeKt.m3945toSizeozmzZPI(mo2811getSizeYbymL2g()), this, nodeM2990headH91voCI);
        }
    }

    private final void fromParentRect(MutableRect bounds, boolean clipBounds) {
        float fM3893getXimpl = IntOffset.m3893getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() - fM3893getXimpl);
        bounds.setRight(bounds.getRight() - fM3893getXimpl);
        float fM3894getYimpl = IntOffset.m3894getYimpl(getPosition());
        bounds.setTop(bounds.getTop() - fM3894getYimpl);
        bounds.setBottom(bounds.getBottom() - fM3894getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.intersect(0.0f, 0.0f, IntSize.m3935getWidthimpl(mo2811getSizeYbymL2g()), IntSize.m3934getHeightimpl(mo2811getSizeYbymL2g()));
                bounds.isEmpty();
            }
        }
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m2977hasNodeH91voCI(int type) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m3013getIncludeSelfInTraversalH91voCI(type));
        return nodeHeadNode != null && DelegatableNodeKt.m2901has64DMado(nodeHeadNode, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean includeTail) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null && (tail = nodeCoordinator.getTail()) != null) {
                return tail.getChild();
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hit-1hIXUjU, reason: not valid java name */
    public final void m2978hit1hIXUjU(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final boolean z, final boolean z2) {
        if (node == null) {
            mo2924hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hit(node, z2, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
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
                    this.this$0.m2978hit1hIXUjU(NodeCoordinatorKt.m3002nextUntilhw7D004(node, hitTestSource.mo3000entityTypeOLwlOKw(), NodeKind.m3004constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hitNear-JHbHoSQ, reason: not valid java name */
    public final void m2979hitNearJHbHoSQ(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final boolean z, final boolean z2, final float f) {
        if (node == null) {
            mo2924hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hitInMinimumTouchTarget(node, f, z2, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
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
                    this.this$0.m2979hitNearJHbHoSQ(NodeCoordinatorKt.m3002nextUntilhw7D004(node, hitTestSource.mo3000entityTypeOLwlOKw(), NodeKind.m3004constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2, f);
                }
            });
        }
    }

    /* JADX INFO: renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m2980offsetFromEdgeMKHz9U(long pointerPosition) {
        float fM1447getXimpl = Offset.m1447getXimpl(pointerPosition);
        float fMax = Math.max(0.0f, fM1447getXimpl < 0.0f ? -fM1447getXimpl : fM1447getXimpl - getMeasuredWidth());
        float fM1448getYimpl = Offset.m1448getYimpl(pointerPosition);
        return OffsetKt.Offset(fMax, Math.max(0.0f, fM1448getYimpl < 0.0f ? -fM1448getYimpl : fM1448getYimpl - getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: placeSelf-f8xVGno, reason: not valid java name */
    private final void m2981placeSelff8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        updateLayerBlock$default(this, layerBlock, false, 2, null);
        if (!IntOffset.m3892equalsimpl0(getPosition(), position)) {
            m2995setPositiongyyYBs(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo3052movegyyYBs(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
    }

    public static /* synthetic */ Object propagateRelocationRequest$suspendImpl(NodeCoordinator nodeCoordinator, Rect rect, Continuation<? super Unit> continuation) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.wrappedBy;
        if (nodeCoordinator2 == null) {
            return Unit.INSTANCE;
        }
        Object objPropagateRelocationRequest = nodeCoordinator2.propagateRelocationRequest(rect.m1484translatek4lQ0M(nodeCoordinator2.localBoundingBoxOf(nodeCoordinator, false).m1482getTopLeftF1C5BW0()), continuation);
        return objPropagateRelocationRequest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPropagateRelocationRequest : Unit.INSTANCE;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: speculativeHit-JHbHoSQ, reason: not valid java name */
    public final void m2982speculativeHitJHbHoSQ(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final boolean z, final boolean z2, final float f) {
        if (node == null) {
            mo2924hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f, z2, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
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
                    this.this$0.m2982speculativeHitJHbHoSQ(NodeCoordinatorKt.m3002nextUntilhw7D004(node, hitTestSource.mo3000entityTypeOLwlOKw(), NodeKind.m3004constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2, f);
                }
            });
        } else {
            m2982speculativeHitJHbHoSQ(NodeCoordinatorKt.m3002nextUntilhw7D004(node, hitTestSource.mo3000entityTypeOLwlOKw(), NodeKind.m3004constructorimpl(2)), hitTestSource, j, hitTestResult, z, z2, f);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinatesImpl = layoutCoordinates instanceof LookaheadLayoutCoordinatesImpl ? (LookaheadLayoutCoordinatesImpl) layoutCoordinates : null;
        if (lookaheadLayoutCoordinatesImpl != null && (coordinator = lookaheadLayoutCoordinatesImpl.getCoordinator()) != null) {
            return coordinator;
        }
        Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* JADX INFO: renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m2983transformFromAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        if (Intrinsics.areEqual(ancestor, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        Intrinsics.checkNotNull(nodeCoordinator);
        nodeCoordinator.m2983transformFromAncestorEL8BTi8(ancestor, matrix);
        if (!IntOffset.m3892equalsimpl0(getPosition(), IntOffset.INSTANCE.m3903getZeronOccac())) {
            float[] fArr = tmpMatrix;
            Matrix.m1895resetimpl(fArr);
            Matrix.m1906translateimpl$default(fArr, -IntOffset.m3893getXimpl(getPosition()), -IntOffset.m3894getYimpl(getPosition()), 0.0f, 4, null);
            Matrix.m1903timesAssign58bKbWc(matrix, fArr);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo3049inverseTransform58bKbWc(matrix);
        }
    }

    /* JADX INFO: renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m2984transformToAncestorEL8BTi8(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator nodeCoordinator = this;
        while (!Intrinsics.areEqual(nodeCoordinator, ancestor)) {
            OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                ownedLayer.mo3054transform58bKbWc(matrix);
            }
            long position = nodeCoordinator.getPosition();
            if (!IntOffset.m3892equalsimpl0(position, IntOffset.INSTANCE.m3903getZeronOccac())) {
                float[] fArr = tmpMatrix;
                Matrix.m1895resetimpl(fArr);
                Matrix.m1906translateimpl$default(fArr, IntOffset.m3893getXimpl(position), IntOffset.m3894getYimpl(position), 0.0f, 4, null);
                Matrix.m1903timesAssign58bKbWc(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, Function1 function1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.updateLayerBlock(function1, z);
    }

    private final void updateLayerParameters(boolean invokeOnLayoutChange) {
        Owner owner;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            if (!(this.layerBlock == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return;
        }
        final Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
        if (function1 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
        reusableGraphicsLayerScope.reset();
        reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
        reusableGraphicsLayerScope.m1964setSizeuvyYCjk(IntSizeKt.m3945toSizeozmzZPI(mo2811getSizeYbymL2g()));
        getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator.updateLayerParameters.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                function1.invoke(NodeCoordinator.graphicsLayerScope);
            }
        });
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
        ownedLayer.mo3055updateLayerPropertiesdDxrwY(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.getTransformOrigin(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), reusableGraphicsLayerScope.getRenderEffect(), reusableGraphicsLayerScope.getAmbientShadowColor(), reusableGraphicsLayerScope.getSpotShadowColor(), reusableGraphicsLayerScope.getCompositingStrategy(), getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
        this.isClipping = reusableGraphicsLayerScope.getClip();
        this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
        if (!invokeOnLayoutChange || (owner = getLayoutNode().getOwner()) == null) {
            return;
        }
        owner.onLayoutChange(getLayoutNode());
    }

    public static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nodeCoordinator.updateLayerParameters(z);
    }

    /* JADX INFO: renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m2985calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        return SizeKt.Size(Math.max(0.0f, (Size.m1516getWidthimpl(minimumTouchTargetSize) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m1513getHeightimpl(minimumTouchTargetSize) - getMeasuredHeight()) / 2.0f));
    }

    /* JADX INFO: renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m2986distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= Size.m1516getWidthimpl(minimumTouchTargetSize) && getMeasuredHeight() >= Size.m1513getHeightimpl(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long jM2985calculateMinimumTouchTargetPaddingE7KxVPU = m2985calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float fM1516getWidthimpl = Size.m1516getWidthimpl(jM2985calculateMinimumTouchTargetPaddingE7KxVPU);
        float fM1513getHeightimpl = Size.m1513getHeightimpl(jM2985calculateMinimumTouchTargetPaddingE7KxVPU);
        long jM2980offsetFromEdgeMKHz9U = m2980offsetFromEdgeMKHz9U(pointerPosition);
        if ((fM1516getWidthimpl > 0.0f || fM1513getHeightimpl > 0.0f) && Offset.m1447getXimpl(jM2980offsetFromEdgeMKHz9U) <= fM1516getWidthimpl && Offset.m1448getYimpl(jM2980offsetFromEdgeMKHz9U) <= fM1513getHeightimpl) {
            return Offset.m1446getDistanceSquaredimpl(jM2980offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float fM3893getXimpl = IntOffset.m3893getXimpl(getPosition());
        float fM3894getYimpl = IntOffset.m3894getYimpl(getPosition());
        canvas.translate(fM3893getXimpl, fM3894getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-fM3893getXimpl, -fM3894getYimpl);
    }

    public final void drawBorder(@NotNull Canvas canvas, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m3935getWidthimpl(getMeasuredSize()) - 0.5f, IntSize.m3934getHeightimpl(getMeasuredSize()) - 0.5f), paint);
    }

    public abstract void ensureLookaheadDelegateCreated();

    @NotNull
    public final NodeCoordinator findCommonAncestor$ui_release(@NotNull NodeCoordinator other) {
        Intrinsics.checkNotNullParameter(other, "other");
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = other.getTail();
            Modifier.Node tail2 = getTail();
            int iM3004constructorimpl = NodeKind.m3004constructorimpl(2);
            if (!tail2.getNode().getIsAttached()) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
            }
            for (Modifier.Node parent$ui_release = tail2.getNode().getParent(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent()) {
                if ((parent$ui_release.getKindSet() & iM3004constructorimpl) != 0 && parent$ui_release == tail) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 == getLayoutNode()) {
            return this;
        }
        return layoutNode == other.getLayoutNode() ? other : layoutNode.getInnerCoordinator$ui_release();
    }

    /* JADX INFO: renamed from: fromParentPosition-MK-Hz9U, reason: not valid java name */
    public long m2987fromParentPositionMKHz9U(long position) {
        long jM3905minusNvtHpc = IntOffsetKt.m3905minusNvtHpc(position, getPosition());
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo3051mapOffset8S9VItk(jM3905minusNvtHpc, true) : jM3905minusNvtHpc;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    /* JADX INFO: renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* JADX INFO: renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m2988getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return getMeasurementConstraints();
    }

    @Nullable
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Nullable
    public final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    @NotNull
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Nullable
    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @NotNull
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m2989getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo327toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo2933getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    @Nullable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        return this.wrappedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getParentData() {
        /*
            r12 = this;
            androidx.compose.ui.node.LayoutNode r0 = r12.getLayoutNode()
            androidx.compose.ui.node.NodeChain r0 = r0.getNodes()
            r1 = 64
            int r2 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r1)
            boolean r0 = r0.m2967hasH91voCI$ui_release(r2)
            r2 = 0
            if (r0 == 0) goto Lb2
            r12.getTail()
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            androidx.compose.ui.node.LayoutNode r3 = r12.getLayoutNode()
            androidx.compose.ui.node.NodeChain r3 = r3.getNodes()
            androidx.compose.ui.Modifier$Node r3 = r3.getTail()
        L29:
            if (r3 == 0) goto Laf
            int r4 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r1)
            int r5 = r3.getKindSet()
            r4 = r4 & r5
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L3a
            r4 = r6
            goto L3b
        L3a:
            r4 = r5
        L3b:
            if (r4 == 0) goto La9
            int r4 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r1)
            r8 = r2
            r7 = r3
        L43:
            if (r7 == 0) goto La9
            boolean r9 = r7 instanceof androidx.compose.ui.node.ParentDataModifierNode
            if (r9 == 0) goto L5c
            androidx.compose.ui.node.ParentDataModifierNode r7 = (androidx.compose.ui.node.ParentDataModifierNode) r7
            androidx.compose.ui.node.LayoutNode r9 = r12.getLayoutNode()
            androidx.compose.ui.unit.Density r9 = r9.getDensity()
            T r10 = r0.element
            java.lang.Object r7 = r7.modifyParentData(r9, r10)
            r0.element = r7
            goto La4
        L5c:
            int r9 = r7.getKindSet()
            r9 = r9 & r4
            if (r9 == 0) goto L65
            r9 = r6
            goto L66
        L65:
            r9 = r5
        L66:
            if (r9 == 0) goto La4
            boolean r9 = r7 instanceof androidx.compose.ui.node.DelegatingNode
            if (r9 == 0) goto La4
            r9 = r7
            androidx.compose.ui.node.DelegatingNode r9 = (androidx.compose.ui.node.DelegatingNode) r9
            androidx.compose.ui.Modifier$Node r9 = r9.getDelegate()
            r10 = r5
        L74:
            if (r9 == 0) goto La1
            int r11 = r9.getKindSet()
            r11 = r11 & r4
            if (r11 == 0) goto L7f
            r11 = r6
            goto L80
        L7f:
            r11 = r5
        L80:
            if (r11 == 0) goto L9c
            int r10 = r10 + 1
            if (r10 != r6) goto L88
            r7 = r9
            goto L9c
        L88:
            if (r8 != 0) goto L93
            androidx.compose.runtime.collection.MutableVector r8 = new androidx.compose.runtime.collection.MutableVector
            r11 = 16
            androidx.compose.ui.Modifier$Node[] r11 = new androidx.compose.ui.Modifier.Node[r11]
            r8.<init>(r11, r5)
        L93:
            if (r7 == 0) goto L99
            r8.add(r7)
            r7 = r2
        L99:
            r8.add(r9)
        L9c:
            androidx.compose.ui.Modifier$Node r9 = r9.getChild()
            goto L74
        La1:
            if (r10 != r6) goto La4
            goto L43
        La4:
            androidx.compose.ui.Modifier$Node r7 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r8)
            goto L43
        La9:
            androidx.compose.ui.Modifier$Node r3 = r3.getParent()
            goto L29
        Laf:
            T r0 = r0.element
            return r0
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.getParentData():java.lang.Object");
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            boolean z = false;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                z = true;
            }
            if (z) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? SetsKt.emptySet() : linkedHashSet;
    }

    @NotNull
    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo2811getSizeYbymL2g() {
        return getMeasuredSize();
    }

    @NotNull
    public abstract Modifier.Node getTail();

    @Nullable
    /* JADX INFO: renamed from: getWrapped$ui_release, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    @Nullable
    /* JADX INFO: renamed from: getWrappedBy$ui_release, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m2990headH91voCI(int type) {
        boolean zM3013getIncludeSelfInTraversalH91voCI = NodeKindKt.m3013getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM3013getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM3013getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & type) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & type) != 0) {
                return nodeHeadNode;
            }
            if (nodeHeadNode == tail) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: hitTest-YqVAtuI, reason: not valid java name */
    public final void m2991hitTestYqVAtuI(@NotNull HitTestSource hitTestSource, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        Modifier.Node nodeM2990headH91voCI = m2990headH91voCI(hitTestSource.mo3000entityTypeOLwlOKw());
        if (!m2998withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (isTouchEvent) {
                float fM2986distanceInMinimumTouchTargettz77jQw = m2986distanceInMinimumTouchTargettz77jQw(pointerPosition, m2989getMinimumTouchTargetSizeNHjbRc());
                if (((Float.isInfinite(fM2986distanceInMinimumTouchTargettz77jQw) || Float.isNaN(fM2986distanceInMinimumTouchTargettz77jQw)) ? false : true) && hitTestResult.isHitInMinimumTouchTargetBetter(fM2986distanceInMinimumTouchTargettz77jQw, false)) {
                    m2979hitNearJHbHoSQ(nodeM2990headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, fM2986distanceInMinimumTouchTargettz77jQw);
                    return;
                }
                return;
            }
            return;
        }
        if (nodeM2990headH91voCI == null) {
            mo2924hitTestChildYqVAtuI(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (m2992isPointerInBoundsk4lQ0M(pointerPosition)) {
            m2978hit1hIXUjU(nodeM2990headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float fM2986distanceInMinimumTouchTargettz77jQw2 = !isTouchEvent ? Float.POSITIVE_INFINITY : m2986distanceInMinimumTouchTargettz77jQw(pointerPosition, m2989getMinimumTouchTargetSizeNHjbRc());
        if (((Float.isInfinite(fM2986distanceInMinimumTouchTargettz77jQw2) || Float.isNaN(fM2986distanceInMinimumTouchTargettz77jQw2)) ? false : true) && hitTestResult.isHitInMinimumTouchTargetBetter(fM2986distanceInMinimumTouchTargettz77jQw2, isInLayer)) {
            m2979hitNearJHbHoSQ(nodeM2990headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM2986distanceInMinimumTouchTargettz77jQw2);
        } else {
            m2982speculativeHitJHbHoSQ(nodeM2990headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fM2986distanceInMinimumTouchTargettz77jQw2);
        }
    }

    /* JADX INFO: renamed from: hitTestChild-YqVAtuI */
    public void mo2924hitTestChildYqVAtuI(@NotNull HitTestSource hitTestSource, long pointerPosition, @NotNull HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m2991hitTestYqVAtuI(hitTestSource, nodeCoordinator.m2987fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
        invoke2(canvas);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return !this.released && getLayoutNode().isAttached();
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m2992isPointerInBoundsk4lQ0M(long pointerPosition) {
        float fM1447getXimpl = Offset.m1447getXimpl(pointerPosition);
        float fM1448getYimpl = Offset.m1448getYimpl(pointerPosition);
        return fM1447getXimpl >= 0.0f && fM1448getYimpl >= 0.0f && fM1447getXimpl < ((float) getMeasuredWidth()) && fM1448getYimpl < ((float) getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.layer != null && isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        if (!sourceCoordinates.isAttached()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(IntSize.m3935getWidthimpl(sourceCoordinates.mo2811getSizeYbymL2g()));
        rectCache.setBottom(IntSize.m3934getHeightimpl(sourceCoordinates.mo2811getSizeYbymL2g()));
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            rectInParent$ui_release$default(coordinator, rectCache, clipBounds, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui_release, rectCache, clipBounds);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo2812localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (sourceCoordinates instanceof LookaheadLayoutCoordinatesImpl) {
            return Offset.m1456unaryMinusF1C5BW0(sourceCoordinates.mo2812localPositionOfR5De75A(this, Offset.m1456unaryMinusF1C5BW0(relativeToSource)));
        }
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            relativeToSource = coordinator.m2996toParentPositionMKHz9U(relativeToSource);
            coordinator = coordinator.wrappedBy;
            Intrinsics.checkNotNull(coordinator);
        }
        return m2976ancestorToLocalR5De75A(nodeCoordinatorFindCommonAncestor$ui_release, relativeToSource);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo2813localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            relativeToLocal = nodeCoordinator.m2996toParentPositionMKHz9U(relativeToLocal);
        }
        return relativeToLocal;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo2814localToWindowMKHz9U(long relativeToLocal) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo3057calculatePositionInWindowMKHz9U(mo2813localToRootMKHz9U(relativeToLocal));
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public void onMeasureResultChanged(int r10, int r11) {
        /*
            r9 = this;
            androidx.compose.ui.node.OwnedLayer r0 = r9.layer
            if (r0 == 0) goto Lc
            long r1 = androidx.compose.ui.unit.IntSizeKt.IntSize(r10, r11)
            r0.mo3053resizeozmzZPI(r1)
            goto L13
        Lc:
            androidx.compose.ui.node.NodeCoordinator r0 = r9.wrappedBy
            if (r0 == 0) goto L13
            r0.invalidateLayer()
        L13:
            long r10 = androidx.compose.ui.unit.IntSizeKt.IntSize(r10, r11)
            r9.m2846setMeasuredSizeozmzZPI(r10)
            r10 = 0
            r9.updateLayerParameters(r10)
            r11 = 4
            int r11 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r11)
            boolean r0 = androidx.compose.ui.node.NodeKindKt.m3013getIncludeSelfInTraversalH91voCI(r11)
            androidx.compose.ui.Modifier$Node r1 = r9.getTail()
            if (r0 == 0) goto L2e
            goto L36
        L2e:
            androidx.compose.ui.Modifier$Node r1 = r1.getParent()
            if (r1 != 0) goto L36
            goto Lae
        L36:
            androidx.compose.ui.Modifier$Node r0 = access$headNode(r9, r0)
        L3a:
            if (r0 == 0) goto Lae
            int r2 = r0.getAggregateChildKindSet()
            r2 = r2 & r11
            if (r2 == 0) goto Lae
            int r2 = r0.getKindSet()
            r2 = r2 & r11
            if (r2 == 0) goto La7
            r2 = 0
            r3 = r0
            r4 = r2
        L4d:
            if (r3 == 0) goto La7
            boolean r5 = r3 instanceof androidx.compose.ui.node.DrawModifierNode
            if (r5 == 0) goto L59
            androidx.compose.ui.node.DrawModifierNode r3 = (androidx.compose.ui.node.DrawModifierNode) r3
            r3.onMeasureResultChanged()
            goto La2
        L59:
            int r5 = r3.getKindSet()
            r5 = r5 & r11
            r6 = 1
            if (r5 == 0) goto L63
            r5 = r6
            goto L64
        L63:
            r5 = r10
        L64:
            if (r5 == 0) goto La2
            boolean r5 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r5 == 0) goto La2
            r5 = r3
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.getDelegate()
            r7 = r10
        L72:
            if (r5 == 0) goto L9f
            int r8 = r5.getKindSet()
            r8 = r8 & r11
            if (r8 == 0) goto L7d
            r8 = r6
            goto L7e
        L7d:
            r8 = r10
        L7e:
            if (r8 == 0) goto L9a
            int r7 = r7 + 1
            if (r7 != r6) goto L86
            r3 = r5
            goto L9a
        L86:
            if (r4 != 0) goto L91
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            r8 = 16
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r8]
            r4.<init>(r8, r10)
        L91:
            if (r3 == 0) goto L97
            r4.add(r3)
            r3 = r2
        L97:
            r4.add(r5)
        L9a:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L72
        L9f:
            if (r7 != r6) goto La2
            goto L4d
        La2:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r4)
            goto L4d
        La7:
            if (r0 == r1) goto Lae
            androidx.compose.ui.Modifier$Node r0 = r0.getChild()
            goto L3a
        Lae:
            androidx.compose.ui.node.LayoutNode r10 = r9.getLayoutNode()
            androidx.compose.ui.node.Owner r10 = r10.getOwner()
            if (r10 == 0) goto Lbf
            androidx.compose.ui.node.LayoutNode r11 = r9.getLayoutNode()
            r10.onLayoutChange(r11)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.onMeasureResultChanged(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final void onMeasured() {
        /*
            r13 = this;
            r0 = 128(0x80, float:1.794E-43)
            int r1 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r0)
            boolean r1 = r13.m2977hasNodeH91voCI(r1)
            if (r1 == 0) goto Lc1
            androidx.compose.runtime.snapshots.Snapshot$Companion r1 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE
            androidx.compose.runtime.snapshots.Snapshot r1 = r1.createNonObservableSnapshot()
            androidx.compose.runtime.snapshots.Snapshot r2 = r1.makeCurrent()     // Catch: java.lang.Throwable -> Lbc
            int r0 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r0)     // Catch: java.lang.Throwable -> Lb7
            boolean r3 = androidx.compose.ui.node.NodeKindKt.m3013getIncludeSelfInTraversalH91voCI(r0)     // Catch: java.lang.Throwable -> Lb7
            if (r3 == 0) goto L25
            androidx.compose.ui.Modifier$Node r4 = r13.getTail()     // Catch: java.lang.Throwable -> Lb7
            goto L31
        L25:
            androidx.compose.ui.Modifier$Node r4 = r13.getTail()     // Catch: java.lang.Throwable -> Lb7
            androidx.compose.ui.Modifier$Node r4 = r4.getParent()     // Catch: java.lang.Throwable -> Lb7
            if (r4 != 0) goto L31
            goto Lae
        L31:
            androidx.compose.ui.Modifier$Node r3 = access$headNode(r13, r3)     // Catch: java.lang.Throwable -> Lb7
        L35:
            if (r3 == 0) goto Lae
            int r5 = r3.getAggregateChildKindSet()     // Catch: java.lang.Throwable -> Lb7
            r5 = r5 & r0
            if (r5 == 0) goto Lae
            int r5 = r3.getKindSet()     // Catch: java.lang.Throwable -> Lb7
            r5 = r5 & r0
            if (r5 == 0) goto La7
            r5 = 0
            r6 = r3
            r7 = r5
        L48:
            if (r6 == 0) goto La7
            boolean r8 = r6 instanceof androidx.compose.ui.node.LayoutAwareModifierNode     // Catch: java.lang.Throwable -> Lb7
            if (r8 == 0) goto L58
            androidx.compose.ui.node.LayoutAwareModifierNode r6 = (androidx.compose.ui.node.LayoutAwareModifierNode) r6     // Catch: java.lang.Throwable -> Lb7
            long r8 = r13.getMeasuredSize()     // Catch: java.lang.Throwable -> Lb7
            r6.mo226onRemeasuredozmzZPI(r8)     // Catch: java.lang.Throwable -> Lb7
            goto La2
        L58:
            int r8 = r6.getKindSet()     // Catch: java.lang.Throwable -> Lb7
            r8 = r8 & r0
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L63
            r8 = r10
            goto L64
        L63:
            r8 = r9
        L64:
            if (r8 == 0) goto La2
            boolean r8 = r6 instanceof androidx.compose.ui.node.DelegatingNode     // Catch: java.lang.Throwable -> Lb7
            if (r8 == 0) goto La2
            r8 = r6
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8     // Catch: java.lang.Throwable -> Lb7
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate()     // Catch: java.lang.Throwable -> Lb7
            r11 = r9
        L72:
            if (r8 == 0) goto L9f
            int r12 = r8.getKindSet()     // Catch: java.lang.Throwable -> Lb7
            r12 = r12 & r0
            if (r12 == 0) goto L7d
            r12 = r10
            goto L7e
        L7d:
            r12 = r9
        L7e:
            if (r12 == 0) goto L9a
            int r11 = r11 + 1
            if (r11 != r10) goto L86
            r6 = r8
            goto L9a
        L86:
            if (r7 != 0) goto L91
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector     // Catch: java.lang.Throwable -> Lb7
            r12 = 16
            androidx.compose.ui.Modifier$Node[] r12 = new androidx.compose.ui.Modifier.Node[r12]     // Catch: java.lang.Throwable -> Lb7
            r7.<init>(r12, r9)     // Catch: java.lang.Throwable -> Lb7
        L91:
            if (r6 == 0) goto L97
            r7.add(r6)     // Catch: java.lang.Throwable -> Lb7
            r6 = r5
        L97:
            r7.add(r8)     // Catch: java.lang.Throwable -> Lb7
        L9a:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild()     // Catch: java.lang.Throwable -> Lb7
            goto L72
        L9f:
            if (r11 != r10) goto La2
            goto L48
        La2:
            androidx.compose.ui.Modifier$Node r6 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r7)     // Catch: java.lang.Throwable -> Lb7
            goto L48
        La7:
            if (r3 == r4) goto Lae
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()     // Catch: java.lang.Throwable -> Lb7
            goto L35
        Lae:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb7
            r1.restoreCurrent(r2)     // Catch: java.lang.Throwable -> Lbc
            r1.dispose()
            goto Lc1
        Lb7:
            r0 = move-exception
            r1.restoreCurrent(r2)     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r0 = move-exception
            r1.dispose()
            throw r0
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.onMeasured():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final void onPlaced() {
        /*
            r11 = this;
            r0 = 128(0x80, float:1.794E-43)
            int r0 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r0)
            boolean r1 = androidx.compose.ui.node.NodeKindKt.m3013getIncludeSelfInTraversalH91voCI(r0)
            androidx.compose.ui.Modifier$Node r2 = r11.getTail()
            if (r1 == 0) goto L11
            goto L19
        L11:
            androidx.compose.ui.Modifier$Node r2 = r2.getParent()
            if (r2 != 0) goto L19
            goto L92
        L19:
            androidx.compose.ui.Modifier$Node r1 = access$headNode(r11, r1)
        L1d:
            if (r1 == 0) goto L92
            int r3 = r1.getAggregateChildKindSet()
            r3 = r3 & r0
            if (r3 == 0) goto L92
            int r3 = r1.getKindSet()
            r3 = r3 & r0
            if (r3 == 0) goto L8b
            r3 = 0
            r4 = r1
            r5 = r3
        L30:
            if (r4 == 0) goto L8b
            boolean r6 = r4 instanceof androidx.compose.ui.node.LayoutAwareModifierNode
            if (r6 == 0) goto L3c
            androidx.compose.ui.node.LayoutAwareModifierNode r4 = (androidx.compose.ui.node.LayoutAwareModifierNode) r4
            r4.onPlaced(r11)
            goto L86
        L3c:
            int r6 = r4.getKindSet()
            r6 = r6 & r0
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L47
            r6 = r8
            goto L48
        L47:
            r6 = r7
        L48:
            if (r6 == 0) goto L86
            boolean r6 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L86
            r6 = r4
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.getDelegate()
            r9 = r7
        L56:
            if (r6 == 0) goto L83
            int r10 = r6.getKindSet()
            r10 = r10 & r0
            if (r10 == 0) goto L61
            r10 = r8
            goto L62
        L61:
            r10 = r7
        L62:
            if (r10 == 0) goto L7e
            int r9 = r9 + 1
            if (r9 != r8) goto L6a
            r4 = r6
            goto L7e
        L6a:
            if (r5 != 0) goto L75
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r10 = 16
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r10]
            r5.<init>(r10, r7)
        L75:
            if (r4 == 0) goto L7b
            r5.add(r4)
            r4 = r3
        L7b:
            r5.add(r6)
        L7e:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild()
            goto L56
        L83:
            if (r9 != r8) goto L86
            goto L30
        L86:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r5)
            goto L30
        L8b:
            if (r1 == r2) goto L92
            androidx.compose.ui.Modifier$Node r1 = r1.getChild()
            goto L1d
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.onPlaced():void");
    }

    public final void onRelease() {
        this.released = true;
        if (this.layer != null) {
            updateLayerBlock$default(this, null, false, 2, null);
        }
    }

    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m2993performingMeasureK40F9xA(long constraints, @NotNull Function0<? extends Placeable> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m2847setMeasurementConstraintsBRTryo0(constraints);
        return block.invoke();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2805placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        m2981placeSelff8xVGno(position, zIndex, layerBlock);
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset-f8xVGno, reason: not valid java name */
    public final void m2994placeSelfApparentToRealOffsetf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock) {
        long jM2843getApparentToRealOffsetnOccac = getApparentToRealOffset();
        m2981placeSelff8xVGno(androidx.compose.foundation.lazy.OooO0o.OooO00o(jM2843getApparentToRealOffsetnOccac, IntOffset.m3894getYimpl(position), IntOffset.m3893getXimpl(jM2843getApparentToRealOffsetnOccac) + IntOffset.m3893getXimpl(position)), zIndex, layerBlock);
    }

    @Nullable
    public Object propagateRelocationRequest(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation) {
        return propagateRelocationRequest$suspendImpl(this, rect, continuation);
    }

    public final void rectInParent$ui_release(@NotNull MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jM2989getMinimumTouchTargetSizeNHjbRc = m2989getMinimumTouchTargetSizeNHjbRc();
                    float fM1516getWidthimpl = Size.m1516getWidthimpl(jM2989getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float fM1513getHeightimpl = Size.m1513getHeightimpl(jM2989getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-fM1516getWidthimpl, -fM1513getHeightimpl, IntSize.m3935getWidthimpl(mo2811getSizeYbymL2g()) + fM1516getWidthimpl, IntSize.m3934getHeightimpl(mo2811getSizeYbymL2g()) + fM1513getHeightimpl);
                } else if (clipBounds) {
                    bounds.intersect(0.0f, 0.0f, IntSize.m3935getWidthimpl(mo2811getSizeYbymL2g()), IntSize.m3934getHeightimpl(mo2811getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float fM3893getXimpl = IntOffset.m3893getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() + fM3893getXimpl);
        bounds.setRight(bounds.getRight() + fM3893getXimpl);
        float fM3894getYimpl = IntOffset.m3894getYimpl(getPosition());
        bounds.setTop(bounds.getTop() + fM3894getYimpl);
        bounds.setBottom(bounds.getBottom() + fM3894getYimpl);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo2805placeAtf8xVGno(getPosition(), this.zIndex, this.layerBlock);
    }

    public abstract void setLookaheadDelegate(@Nullable LookaheadDelegate lookaheadDelegate);

    public void setMeasureResult$ui_release(@NotNull MeasureResult value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MeasureResult measureResult = this._measureResult;
        if (value != measureResult) {
            this._measureResult = value;
            if (measureResult == null || value.getWidth() != measureResult.getWidth() || value.getHeight() != measureResult.getHeight()) {
                onMeasureResultChanged(value.getWidth(), value.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if ((!(map == null || map.isEmpty()) || (!value.getAlignmentLines().isEmpty())) && !Intrinsics.areEqual(value.getAlignmentLines(), this.oldAlignmentLines)) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                Map linkedHashMap = this.oldAlignmentLines;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.oldAlignmentLines = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(value.getAlignmentLines());
            }
        }
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m2995setPositiongyyYBs(long j) {
        this.position = j;
    }

    public final void setWrapped$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public final void setZIndex(float f) {
        this.zIndex = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final boolean shouldSharePointerInputWithSiblings() {
        /*
            r11 = this;
            r0 = 16
            int r1 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r0)
            boolean r1 = androidx.compose.ui.node.NodeKindKt.m3013getIncludeSelfInTraversalH91voCI(r1)
            androidx.compose.ui.Modifier$Node r1 = r11.headNode(r1)
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            int r3 = androidx.compose.ui.node.NodeKind.m3004constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r4 = r1.getNode()
            boolean r4 = r4.getIsAttached()
            if (r4 == 0) goto L9c
            androidx.compose.ui.Modifier$Node r1 = r1.getNode()
            int r4 = r1.getAggregateChildKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L9b
            androidx.compose.ui.Modifier$Node r1 = r1.getChild()
        L2f:
            if (r1 == 0) goto L9b
            int r4 = r1.getKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L96
            r4 = 0
            r5 = r1
            r6 = r4
        L3b:
            if (r5 == 0) goto L96
            boolean r7 = r5 instanceof androidx.compose.ui.node.PointerInputModifierNode
            r8 = 1
            if (r7 == 0) goto L4b
            androidx.compose.ui.node.PointerInputModifierNode r5 = (androidx.compose.ui.node.PointerInputModifierNode) r5
            boolean r5 = r5.sharePointerInputWithSiblings()
            if (r5 == 0) goto L91
            return r8
        L4b:
            int r7 = r5.getKindSet()
            r7 = r7 & r3
            if (r7 == 0) goto L54
            r7 = r8
            goto L55
        L54:
            r7 = r2
        L55:
            if (r7 == 0) goto L91
            boolean r7 = r5 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto L91
            r7 = r5
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate()
            r9 = r2
        L63:
            if (r7 == 0) goto L8e
            int r10 = r7.getKindSet()
            r10 = r10 & r3
            if (r10 == 0) goto L6e
            r10 = r8
            goto L6f
        L6e:
            r10 = r2
        L6f:
            if (r10 == 0) goto L89
            int r9 = r9 + 1
            if (r9 != r8) goto L77
            r5 = r7
            goto L89
        L77:
            if (r6 != 0) goto L80
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r0]
            r6.<init>(r10, r2)
        L80:
            if (r5 == 0) goto L86
            r6.add(r5)
            r5 = r4
        L86:
            r6.add(r7)
        L89:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild()
            goto L63
        L8e:
            if (r9 != r8) goto L91
            goto L3b
        L91:
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L3b
        L96:
            androidx.compose.ui.Modifier$Node r1 = r1.getChild()
            goto L2f
        L9b:
            return r2
        L9c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "visitLocalDescendants called on an unattached node"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.shouldSharePointerInputWithSiblings():boolean");
    }

    /* JADX INFO: renamed from: toParentPosition-MK-Hz9U, reason: not valid java name */
    public long m2996toParentPositionMKHz9U(long position) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo3051mapOffset8S9VItk(position, false);
        }
        return IntOffsetKt.m3907plusNvtHpc(position, getPosition());
    }

    @NotNull
    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.INSTANCE.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM2985calculateMinimumTouchTargetPaddingE7KxVPU = m2985calculateMinimumTouchTargetPaddingE7KxVPU(m2989getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-Size.m1516getWidthimpl(jM2985calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-Size.m1513getHeightimpl(jM2985calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(Size.m1516getWidthimpl(jM2985calculateMinimumTouchTargetPaddingE7KxVPU) + getMeasuredWidth());
        rectCache.setBottom(Size.m1513getHeightimpl(jM2985calculateMinimumTouchTargetPaddingE7KxVPU) + getMeasuredHeight());
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo2815transformFromEL8BTi8(@NotNull LayoutCoordinates sourceCoordinates, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m1895resetimpl(matrix);
        coordinator.m2984transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
        m2983transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, matrix);
    }

    public final void updateLayerBlock(@Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock, boolean forceUpdateLayerParameters) {
        Owner owner;
        LayoutNode layoutNode = getLayoutNode();
        boolean z = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && Intrinsics.areEqual(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerBlock = layerBlock;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!isAttached() || layerBlock == null) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && (owner = layoutNode.getOwner()) != null) {
                    owner.onLayoutChange(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        if (this.layer != null) {
            if (z) {
                updateLayerParameters$default(this, false, 1, null);
                return;
            }
            return;
        }
        OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(layoutNode).createLayer(this, this.invalidateParentLayer);
        ownedLayerCreateLayer.mo3053resizeozmzZPI(getMeasuredSize());
        ownedLayerCreateLayer.mo3052movegyyYBs(getPosition());
        this.layer = ownedLayerCreateLayer;
        updateLayerParameters$default(this, false, 1, null);
        layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
    }

    public final void visitNodes(int mask, boolean includeTail, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Modifier.Node tail = getTail();
        if (!includeTail && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(includeTail); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & mask) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & mask) != 0) {
                block.invoke(nodeHeadNode);
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m2997visitNodesaLcG6gQ(int type, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zM3013getIncludeSelfInTraversalH91voCI = NodeKindKt.m3013getIncludeSelfInTraversalH91voCI(type);
        Modifier.Node tail = getTail();
        if (!zM3013getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM3013getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet() & type) != 0; nodeHeadNode = nodeHeadNode.getChild()) {
            if ((nodeHeadNode.getKindSet() & type) != 0) {
                for (Modifier.Node nodePop = nodeHeadNode; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    block.invoke(nodePop);
                }
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo2816windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo2812localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m1451minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo3056calculateLocalPositionMKHz9U(relativeToWindow), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    public final void withPositionTranslation(@NotNull Canvas canvas, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        float fM3893getXimpl = IntOffset.m3893getXimpl(getPosition());
        float fM3894getYimpl = IntOffset.m3894getYimpl(getPosition());
        canvas.translate(fM3893getXimpl, fM3894getYimpl);
        block.invoke(canvas);
        canvas.translate(-fM3893getXimpl, -fM3894getYimpl);
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m2998withinLayerBoundsk4lQ0M(long pointerPosition) {
        if (!OffsetKt.m1464isFinitek4lQ0M(pointerPosition)) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo3050isInLayerk4lQ0M(pointerPosition);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull final Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!getLayoutNode().isPlaced()) {
            this.lastLayerDrawingWasSkipped = true;
        } else {
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayer, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator.invoke.1
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
                    NodeCoordinator.this.drawContainedDrawModifiers(canvas);
                }
            });
            this.lastLayerDrawingWasSkipped = false;
        }
    }
}
