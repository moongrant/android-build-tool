package com.yalla.yalla.model.room;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.Room;
import com.code.android.json.OooO00o;
import com.code.android.util.o000000;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.user.UserInfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b?\b\u0007\u0018\u0000 õ\u00012\u00020\u0001:\u0004õ\u0001ö\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0007\u0010ñ\u0001\u001a\u00020\u0012J\u000f\u0010ò\u0001\u001a\u00020\u0012H\u0007¢\u0006\u0003\u0010ó\u0001J\u0007\u0010ô\u0001\u001a\u00020\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR*\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR \u00100\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR \u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR \u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR \u00109\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR \u0010<\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR \u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR \u0010K\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\tR\"\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010\tR\"\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0007\"\u0004\bT\u0010\tR \u0010U\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0007\"\u0004\bV\u0010\tR \u0010W\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0007\"\u0004\bX\u0010\tR \u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0007\"\u0004\bZ\u0010\tR \u0010[\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0007\"\u0004\b\\\u0010\tR \u0010]\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0007\"\u0004\b^\u0010\tR \u0010_\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0007\"\u0004\b`\u0010\tR \u0010a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0007\"\u0004\bb\u0010\tR \u0010c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0007\"\u0004\bd\u0010\tR \u0010e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0007\"\u0004\bf\u0010\tR \u0010g\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0007\"\u0004\bh\u0010\tR \u0010i\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0007\"\u0004\bj\u0010\tR \u0010k\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0007\"\u0004\bl\u0010\tR \u0010m\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0007\"\u0004\bo\u0010\tR \u0010p\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0007\"\u0004\br\u0010\tR\"\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0007\"\u0004\bu\u0010\tR \u0010v\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0007\"\u0004\bx\u0010\tR \u0010y\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u0007\"\u0004\b{\u0010\tR \u0010|\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0007\"\u0004\b~\u0010\tR\"\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0007\"\u0005\b\u0081\u0001\u0010\tR#\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0007\"\u0005\b\u0084\u0001\u0010\tR%\u0010\u0085\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u0007\"\u0005\b\u0087\u0001\u0010\tR&\u0010\u0088\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0089\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u0007\"\u0005\b\u008b\u0001\u0010\tR+\u0010\u008c\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010\u0007\"\u0005\b\u0090\u0001\u0010\tR'\u0010\u0091\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R#\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010\u0007\"\u0005\b\u009a\u0001\u0010\tR#\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010\u0007\"\u0005\b\u009d\u0001\u0010\tR#\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010\u0007\"\u0005\b \u0001\u0010\tR#\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010\u0007\"\u0005\b£\u0001\u0010\tR#\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010\u0007\"\u0005\b¦\u0001\u0010\tR#\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010\u0007\"\u0005\b©\u0001\u0010\tR#\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010\u0007\"\u0005\b¬\u0001\u0010\tR#\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010\u0007\"\u0005\b¯\u0001\u0010\tR#\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010\u0007\"\u0005\b²\u0001\u0010\tR#\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010\u0007\"\u0005\bµ\u0001\u0010\tR+\u0010¶\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030¸\u00010·\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0001\u0010\u0007\"\u0005\bº\u0001\u0010\tR#\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¼\u0001\u0010\u0007\"\u0005\b½\u0001\u0010\tR%\u0010¾\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0001\u0010\u0007\"\u0005\bÀ\u0001\u0010\tR#\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0001\u0010\u0007\"\u0005\bÃ\u0001\u0010\tR#\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0001\u0010\u0007\"\u0005\bÆ\u0001\u0010\tR#\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0001\u0010\u0007\"\u0005\bÉ\u0001\u0010\tR#\u0010Ê\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u0010\u0007\"\u0005\bÌ\u0001\u0010\tR#\u0010Í\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0001\u0010\u0007\"\u0005\bÏ\u0001\u0010\tR#\u0010Ð\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÑ\u0001\u0010\u0007\"\u0005\bÒ\u0001\u0010\tR#\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0001\u0010\u0007\"\u0005\bÕ\u0001\u0010\tR#\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b×\u0001\u0010\u0007\"\u0005\bØ\u0001\u0010\tR#\u0010Ù\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÚ\u0001\u0010\u0007\"\u0005\bÛ\u0001\u0010\tR#\u0010Ü\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÝ\u0001\u0010\u0007\"\u0005\bÞ\u0001\u0010\tR#\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bà\u0001\u0010\u0007\"\u0005\bá\u0001\u0010\tR#\u0010â\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bã\u0001\u0010\u0007\"\u0005\bä\u0001\u0010\tR#\u0010å\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bæ\u0001\u0010\u0007\"\u0005\bç\u0001\u0010\tR#\u0010è\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bé\u0001\u0010\u0007\"\u0005\bê\u0001\u0010\tR#\u0010ë\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bì\u0001\u0010\u0007\"\u0005\bí\u0001\u0010\tR#\u0010î\u0001\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bï\u0001\u0010\u0007\"\u0005\bð\u0001\u0010\t¨\u0006÷\u0001"}, d2 = {"Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "", "()V", "age", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getAge", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setAge", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "background", "", "getBackground", "setBackground", "badgeLevelUrl", "getBadgeLevelUrl", "setBadgeLevelUrl", "badgeState", "", "getBadgeState", "setBadgeState", "badgeUrl", "getBadgeUrl", "setBadgeUrl", "bio", "getBio", "setBio", "birthday", "getBirthday", "setBirthday", "bubbleInfo", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO$ChatBubbleInfo;", "getBubbleInfo", "setBubbleInfo", "conveneNum", "getConveneNum", "setConveneNum", "countryId", "getCountryId", "setCountryId", "currBadgeLv", "getCurrBadgeLv$annotations", "getCurrBadgeLv", "setCurrBadgeLv", "dayContributeNum", "", "getDayContributeNum", "setDayContributeNum", "eventSubscribeTime", "getEventSubscribeTime", "setEventSubscribeTime", "fansNum", "getFansNum", "setFansNum", "followedNum", "getFollowedNum", "setFollowedNum", "friendTime", "getFriendTime", "setFriendTime", "hasMic", "getHasMic", "setHasMic", "headPhotoResId", "getHeadPhotoResId", "setHeadPhotoResId", "headerCardId", "getHeaderCardId", "setHeaderCardId", "headerCardUrl", "getHeaderCardUrl", "setHeaderCardUrl", "idLevel", "getIdLevel", "setIdLevel", "inHeBlack", "getInHeBlack", "setInHeBlack", "inRoomEffectsInfo", "getInRoomEffectsInfo", "setInRoomEffectsInfo", "inRoomEffectsInfoEntity", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO$InRoomEffectsInfo;", "getInRoomEffectsInfoEntity", "setInRoomEffectsInfoEntity", "isBlack", "setBlack", "isBlackUser", "setBlackUser", "isFollow", "setFollow", "isFriend", "setFriend", "isInRoom", "setInRoom", "isPremium", "setPremium", "isSelected", "setSelected", "isSelectedForSendHats", "setSelectedForSendHats", "isSetting", "setSetting", "isShowMomentPostDialog", "setShowMomentPostDialog", "isTopRank", "setTopRank", "isUnLoginUser", "setUnLoginUser", "joinRoomNum", "getJoinRoomNum", "setJoinRoomNum", "lasttime", "getLasttime", "setLasttime", "medal", "getMedal", "setMedal", "memberLevel", "getMemberLevel", "setMemberLevel", "memoName", "getMemoName", "setMemoName", "micPosition", "getMicPosition", "setMicPosition", "premiumLevel", "getPremiumLevel", "setPremiumLevel", "priority", "getPriority", "setPriority", "profileCardInfo", "getProfileCardInfo", "setProfileCardInfo", "profileCardInfoEntity", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO$ProfileCardInfo;", "getProfileCardInfoEntity", "setProfileCardInfoEntity", "profileLimit", "", "Lcom/yalla/yalla/model/ProfileLimitModel;", "getProfileLimit", "setProfileLimit", "purview", "Landroidx/compose/runtime/MutableState;", "Lcom/yalla/yalla/model/user/UserInfoModel$Purview;", "getPurview", "()Landroidx/compose/runtime/MutableState;", "setPurview", "(Landroidx/compose/runtime/MutableState;)V", "rankDay", "getRankDay", "setRankDay", "rankWeek", "getRankWeek", "setRankWeek", "regTime", "getRegTime", "setRegTime", "region", "getRegion", "setRegion", "role", "getRole", "setRole", "roomMemberType", "getRoomMemberType", "setRoomMemberType", "sex", "getSex", "setSex", "showPremiumFirst", "getShowPremiumFirst", "setShowPremiumFirst", "showVIP", "getShowVIP", "setShowVIP", "silenced", "getSilenced", "setSilenced", "tags", "", "Lcom/yalla/yalla/data/db/table/UserInfo$TagInfo;", "getTags", "setTags", "userHeader", "getUserHeader", "setUserHeader", "userHeaderFrame", "getUserHeaderFrame", "setUserHeaderFrame", "userId", "getUserId", "setUserId", "userIdx", "getUserIdx", "setUserIdx", "userLevel", "getUserLevel", "setUserLevel", "userName", "getUserName", "setUserName", "vehicleId", "getVehicleId", "setVehicleId", "vehicleSVGAUrl", "getVehicleSVGAUrl", "setVehicleSVGAUrl", "vehicleUrl", "getVehicleUrl", "setVehicleUrl", "vipLevel", "getVipLevel", "setVipLevel", "vipState", "getVipState", "setVipState", "visitorNum", "getVisitorNum", "setVisitorNum", "voiceChangerId", "getVoiceChangerId", "setVoiceChangerId", "wealthBadge", "getWealthBadge", "setWealthBadge", "wealthBadgeWithBg", "getWealthBadgeWithBg", "setWealthBadgeWithBg", "wealthLevel", "getWealthLevel", "setWealthLevel", "wealthProfileCardImg", "getWealthProfileCardImg", "setWealthProfileCardImg", "weekContributeNum", "getWeekContributeNum", "setWeekContributeNum", "isOfficialRole", "needShowPremiumJustForCompose", "(Landroidx/compose/runtime/Composer;I)Z", "parseDataByDefaultJsonString", "Companion", "RoomMemberType", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomUserInfoModel {

    @NotNull
    private MutableStateFlow<Integer> age;

    @NotNull
    private MutableStateFlow<String> background;

    @NotNull
    private MutableStateFlow<String> badgeLevelUrl;

    @NotNull
    private MutableStateFlow<Boolean> badgeState;

    @NotNull
    private MutableStateFlow<String> badgeUrl;

    @NotNull
    private MutableStateFlow<String> bio;

    @NotNull
    private MutableStateFlow<String> birthday;

    @NotNull
    private MutableStateFlow<RoomUserInfoDTO.ChatBubbleInfo> bubbleInfo;

    @NotNull
    private MutableStateFlow<Integer> conveneNum;

    @NotNull
    private MutableStateFlow<Integer> countryId;

    @NotNull
    private MutableStateFlow<Integer> currBadgeLv;

    @NotNull
    private MutableStateFlow<Long> dayContributeNum;

    @NotNull
    private MutableStateFlow<Long> eventSubscribeTime;

    @NotNull
    private MutableStateFlow<Integer> fansNum;

    @NotNull
    private MutableStateFlow<Integer> followedNum;

    @NotNull
    private MutableStateFlow<Long> friendTime;

    @NotNull
    private MutableStateFlow<Boolean> hasMic;

    @NotNull
    private MutableStateFlow<Integer> headPhotoResId;

    @NotNull
    private MutableStateFlow<Integer> headerCardId;

    @NotNull
    private MutableStateFlow<String> headerCardUrl;

    @NotNull
    private MutableStateFlow<Integer> idLevel;

    @NotNull
    private MutableStateFlow<Boolean> inHeBlack;

    @NotNull
    private MutableStateFlow<String> inRoomEffectsInfo;

    @NotNull
    private MutableStateFlow<RoomUserInfoDTO.InRoomEffectsInfo> inRoomEffectsInfoEntity;

    @NotNull
    private MutableStateFlow<Boolean> isBlack;

    @NotNull
    private MutableStateFlow<Boolean> isBlackUser;

    @NotNull
    private MutableStateFlow<Boolean> isFollow;

    @NotNull
    private MutableStateFlow<Boolean> isFriend;

    @NotNull
    private MutableStateFlow<Boolean> isInRoom;

    @NotNull
    private MutableStateFlow<Boolean> isPremium;

    @NotNull
    private MutableStateFlow<Boolean> isSelected;

    @NotNull
    private MutableStateFlow<Boolean> isSelectedForSendHats;

    @NotNull
    private MutableStateFlow<Boolean> isSetting;

    @NotNull
    private MutableStateFlow<Boolean> isShowMomentPostDialog;

    @NotNull
    private MutableStateFlow<Boolean> isTopRank;

    @NotNull
    private MutableStateFlow<Boolean> isUnLoginUser;

    @NotNull
    private MutableStateFlow<Integer> joinRoomNum;

    @NotNull
    private MutableStateFlow<Long> lasttime;

    @NotNull
    private MutableStateFlow<String> medal;

    @NotNull
    private MutableStateFlow<Integer> memberLevel;

    @NotNull
    private MutableStateFlow<String> memoName;

    @NotNull
    private MutableStateFlow<Integer> micPosition;

    @NotNull
    private MutableStateFlow<Integer> premiumLevel;

    @NotNull
    private MutableStateFlow<Long> priority;

    @NotNull
    private MutableStateFlow<String> profileCardInfo;

    @NotNull
    private MutableStateFlow<RoomUserInfoDTO.ProfileCardInfo> profileCardInfoEntity;

    @NotNull
    private MutableStateFlow<List<ProfileLimitModel>> profileLimit;

    @NotNull
    private MutableState<UserInfoModel.Purview> purview;

    @NotNull
    private MutableStateFlow<Integer> rankDay;

    @NotNull
    private MutableStateFlow<Integer> rankWeek;

    @NotNull
    private MutableStateFlow<Integer> regTime;

    @NotNull
    private MutableStateFlow<Integer> region;

    @NotNull
    private MutableStateFlow<Integer> role;

    @NotNull
    private MutableStateFlow<Integer> roomMemberType;

    @NotNull
    private MutableStateFlow<Integer> sex;

    @NotNull
    private MutableStateFlow<Boolean> showPremiumFirst;

    @NotNull
    private MutableStateFlow<Boolean> showVIP;

    @NotNull
    private MutableStateFlow<Boolean> silenced;

    @NotNull
    private MutableStateFlow<List<UserInfo.TagInfo>> tags;

    @NotNull
    private MutableStateFlow<String> userHeader;

    @NotNull
    private MutableStateFlow<String> userHeaderFrame;

    @NotNull
    private MutableStateFlow<Long> userId;

    @NotNull
    private MutableStateFlow<String> userIdx;

    @NotNull
    private MutableStateFlow<Integer> userLevel;

    @NotNull
    private MutableStateFlow<String> userName;

    @NotNull
    private MutableStateFlow<Integer> vehicleId;

    @NotNull
    private MutableStateFlow<String> vehicleSVGAUrl;

    @NotNull
    private MutableStateFlow<String> vehicleUrl;

    @NotNull
    private MutableStateFlow<Integer> vipLevel;

    @NotNull
    private MutableStateFlow<Integer> vipState;

    @NotNull
    private MutableStateFlow<Integer> visitorNum;

    @NotNull
    private MutableStateFlow<Integer> voiceChangerId;

    @NotNull
    private MutableStateFlow<String> wealthBadge;

    @NotNull
    private MutableStateFlow<String> wealthBadgeWithBg;

    @NotNull
    private MutableStateFlow<Integer> wealthLevel;

    @NotNull
    private MutableStateFlow<String> wealthProfileCardImg;

    @NotNull
    private MutableStateFlow<Long> weekContributeNum;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/model/room/RoomUserInfoModel$Companion;", "", "()V", "isOfficialRole", "", "userRole", "", "of", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "userModel", "Lcom/app/base/protobuf/room/Room$UserModel;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isOfficialRole(int userRole) {
            return userRole == 2 || userRole == 4;
        }

        @NotNull
        public final RoomUserInfoModel of(@NotNull Room.UserModel userModel) {
            Intrinsics.checkNotNullParameter(userModel, "userModel");
            RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
            roomUserInfoModel.getUserId().setValue(Long.valueOf(userModel.getUserId()));
            MutableStateFlow<String> userName = roomUserInfoModel.getUserName();
            String name = userModel.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            userName.setValue(name);
            roomUserInfoModel.getSex().setValue(Integer.valueOf(userModel.getSex()));
            MutableStateFlow<String> userHeader = roomUserInfoModel.getUserHeader();
            String headphoto = userModel.getHeadphoto();
            Intrinsics.checkNotNullExpressionValue(headphoto, "getHeadphoto(...)");
            userHeader.setValue(headphoto);
            roomUserInfoModel.getUserHeaderFrame().setValue(userModel.getHeadframeurl());
            roomUserInfoModel.getHeaderCardId().setValue(Integer.valueOf(userModel.getHeadweared()));
            MutableStateFlow<String> headerCardUrl = roomUserInfoModel.getHeaderCardUrl();
            String headweareURLNew = userModel.getHeadweareURLNew();
            Intrinsics.checkNotNullExpressionValue(headweareURLNew, "getHeadweareURLNew(...)");
            headerCardUrl.setValue(headweareURLNew);
            roomUserInfoModel.getRankWeek().setValue(Integer.valueOf(userModel.getRankweek()));
            roomUserInfoModel.getRankDay().setValue(Integer.valueOf(userModel.getRankday()));
            roomUserInfoModel.getVehicleId().setValue(Integer.valueOf(userModel.getVehicleid()));
            MutableStateFlow<String> vehicleUrl = roomUserInfoModel.getVehicleUrl();
            String carimg = userModel.getCarimg();
            Intrinsics.checkNotNullExpressionValue(carimg, "getCarimg(...)");
            vehicleUrl.setValue(carimg);
            MutableStateFlow<String> vehicleSVGAUrl = roomUserInfoModel.getVehicleSVGAUrl();
            String carsvga = userModel.getCarsvga();
            Intrinsics.checkNotNullExpressionValue(carsvga, "getCarsvga(...)");
            vehicleSVGAUrl.setValue(carsvga);
            roomUserInfoModel.getPriority().setValue(Long.valueOf(userModel.getPriority()));
            roomUserInfoModel.getRoomMemberType().setValue(Integer.valueOf(userModel.getPosition()));
            roomUserInfoModel.getShowPremiumFirst().setValue(Boolean.valueOf(o000000.OooO00o(Integer.valueOf(userModel.getShowPremiumFirst()))));
            roomUserInfoModel.isPremium().setValue(Boolean.valueOf(o000000.OooO00o(Integer.valueOf(userModel.getIsVIP()))));
            roomUserInfoModel.getPremiumLevel().setValue(Integer.valueOf(userModel.getNVipLv()));
            roomUserInfoModel.getUserIdx().setValue(String.valueOf(userModel.getPrettyid()));
            roomUserInfoModel.getIdLevel().setValue(Integer.valueOf(userModel.getPrettyIdFlag()));
            roomUserInfoModel.getUserLevel().setValue(Integer.valueOf(userModel.getLevel()));
            roomUserInfoModel.getMedal().setValue(userModel.getMedal());
            roomUserInfoModel.getSilenced().setValue(Boolean.valueOf(o000000.OooO00o(Integer.valueOf(userModel.getSilenced()))));
            roomUserInfoModel.getRole().setValue(Integer.valueOf(userModel.getRole()));
            roomUserInfoModel.getShowVIP().setValue(Boolean.valueOf(o000000.OooO00o(Integer.valueOf(userModel.getShowKAVIP()))));
            roomUserInfoModel.getVipState().setValue(Integer.valueOf(userModel.getKaVipState()));
            roomUserInfoModel.getVipLevel().setValue(Integer.valueOf(userModel.getKaVipLv()));
            roomUserInfoModel.getMemberLevel().setValue(Integer.valueOf(userModel.getMemberLevel()));
            roomUserInfoModel.getBadgeState().setValue(Boolean.valueOf(userModel.getBadgeState() == 1));
            MutableStateFlow<String> badgeUrl = roomUserInfoModel.getBadgeUrl();
            String badgeUrl2 = userModel.getBadgeUrl();
            Intrinsics.checkNotNullExpressionValue(badgeUrl2, "getBadgeUrl(...)");
            badgeUrl.setValue(badgeUrl2);
            MutableStateFlow<String> badgeLevelUrl = roomUserInfoModel.getBadgeLevelUrl();
            String badgeLevelUrl2 = userModel.getBadgeLevelUrl();
            Intrinsics.checkNotNullExpressionValue(badgeLevelUrl2, "getBadgeLevelUrl(...)");
            badgeLevelUrl.setValue(badgeLevelUrl2);
            roomUserInfoModel.isTopRank().setValue(Boolean.valueOf(userModel.getIsTopRank()));
            roomUserInfoModel.getHasMic().setValue(Boolean.valueOf(o000000.OooO00o(Integer.valueOf(userModel.getHasMic()))));
            roomUserInfoModel.getDayContributeNum().setValue(Long.valueOf(userModel.getDayContributeNum()));
            roomUserInfoModel.getWeekContributeNum().setValue(Long.valueOf(userModel.getWeekContributeNum()));
            roomUserInfoModel.getProfileCardInfo().setValue(userModel.getProfileCardInfo());
            roomUserInfoModel.getInRoomEffectsInfo().setValue(userModel.getInRoomEffectsInfo());
            roomUserInfoModel.parseDataByDefaultJsonString();
            RoomUserInfoDTO.ChatBubbleInfo chatBubbleInfo = new RoomUserInfoDTO.ChatBubbleInfo();
            String bubbleUrl = userModel.getBubbleInfo().getBubbleUrl();
            Intrinsics.checkNotNullExpressionValue(bubbleUrl, "getBubbleUrl(...)");
            chatBubbleInfo.setBubbleUrl(bubbleUrl);
            String bubbleColour = userModel.getBubbleInfo().getBubbleColour();
            Intrinsics.checkNotNullExpressionValue(bubbleColour, "getBubbleColour(...)");
            chatBubbleInfo.setBubbleColour(bubbleColour);
            String bubbleReplyColour = userModel.getBubbleInfo().getBubbleReplyColour();
            Intrinsics.checkNotNullExpressionValue(bubbleReplyColour, "getBubbleReplyColour(...)");
            chatBubbleInfo.setBubbleReplyColour(bubbleReplyColour);
            roomUserInfoModel.getBubbleInfo().setValue(chatBubbleInfo);
            roomUserInfoModel.getWealthLevel().setValue(Integer.valueOf(userModel.getWealthInfo().getWealthLevel()));
            MutableStateFlow<String> wealthBadgeWithBg = roomUserInfoModel.getWealthBadgeWithBg();
            String badgeRoundedImg = userModel.getWealthInfo().getBadgeRoundedImg();
            Intrinsics.checkNotNullExpressionValue(badgeRoundedImg, "getBadgeRoundedImg(...)");
            wealthBadgeWithBg.setValue(badgeRoundedImg);
            MutableStateFlow<String> wealthBadge = roomUserInfoModel.getWealthBadge();
            String wealthBadgeUrl = userModel.getWealthInfo().getWealthBadgeUrl();
            Intrinsics.checkNotNullExpressionValue(wealthBadgeUrl, "getWealthBadgeUrl(...)");
            wealthBadge.setValue(wealthBadgeUrl);
            MutableStateFlow<String> wealthProfileCardImg = roomUserInfoModel.getWealthProfileCardImg();
            String profileCardImg = userModel.getWealthInfo().getProfileCardImg();
            Intrinsics.checkNotNullExpressionValue(profileCardImg, "getProfileCardImg(...)");
            wealthProfileCardImg.setValue(profileCardImg);
            return roomUserInfoModel;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/model/room/RoomUserInfoModel$RoomMemberType;", "", "()V", "ROOM_ADMIN", "", "ROOM_GUEST", "ROOM_HOST", "ROOM_MEMBER", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RoomMemberType {
        public static final int $stable = 0;

        @NotNull
        public static final RoomMemberType INSTANCE = new RoomMemberType();
        public static final int ROOM_ADMIN = 2;
        public static final int ROOM_GUEST = 0;
        public static final int ROOM_HOST = 1;
        public static final int ROOM_MEMBER = 3;

        private RoomMemberType() {
        }
    }

    public RoomUserInfoModel() {
        Boolean bool = Boolean.FALSE;
        this.hasMic = StateFlowKt.MutableStateFlow(bool);
        this.micPosition = StateFlowKt.MutableStateFlow(0);
        this.roomMemberType = StateFlowKt.MutableStateFlow(0);
        this.silenced = StateFlowKt.MutableStateFlow(bool);
        this.rankWeek = StateFlowKt.MutableStateFlow(0);
        this.rankDay = StateFlowKt.MutableStateFlow(0);
        this.priority = StateFlowKt.MutableStateFlow(0L);
        this.headerCardId = StateFlowKt.MutableStateFlow(0);
        this.headerCardUrl = StateFlowKt.MutableStateFlow("");
        this.isUnLoginUser = StateFlowKt.MutableStateFlow(bool);
        this.vehicleId = StateFlowKt.MutableStateFlow(0);
        this.vehicleUrl = StateFlowKt.MutableStateFlow("");
        this.vehicleSVGAUrl = StateFlowKt.MutableStateFlow("");
        this.isSelectedForSendHats = StateFlowKt.MutableStateFlow(bool);
        this.showPremiumFirst = StateFlowKt.MutableStateFlow(bool);
        this.bubbleInfo = StateFlowKt.MutableStateFlow(null);
        this.badgeState = StateFlowKt.MutableStateFlow(bool);
        this.memberLevel = StateFlowKt.MutableStateFlow(0);
        this.badgeUrl = StateFlowKt.MutableStateFlow("");
        this.badgeLevelUrl = StateFlowKt.MutableStateFlow("");
        this.isTopRank = StateFlowKt.MutableStateFlow(bool);
        this.isSelected = StateFlowKt.MutableStateFlow(bool);
        this.lasttime = StateFlowKt.MutableStateFlow(0L);
        this.headPhotoResId = StateFlowKt.MutableStateFlow(0);
        this.isSetting = StateFlowKt.MutableStateFlow(bool);
        this.dayContributeNum = StateFlowKt.MutableStateFlow(0L);
        this.weekContributeNum = StateFlowKt.MutableStateFlow(0L);
        this.profileCardInfo = StateFlowKt.MutableStateFlow(null);
        this.profileCardInfoEntity = StateFlowKt.MutableStateFlow(null);
        this.inRoomEffectsInfo = StateFlowKt.MutableStateFlow(null);
        this.inRoomEffectsInfoEntity = StateFlowKt.MutableStateFlow(null);
        this.conveneNum = StateFlowKt.MutableStateFlow(0);
        this.wealthBadge = StateFlowKt.MutableStateFlow("");
        this.wealthProfileCardImg = StateFlowKt.MutableStateFlow("");
        this.voiceChangerId = StateFlowKt.MutableStateFlow(0);
        this.isInRoom = StateFlowKt.MutableStateFlow(bool);
        this.isShowMomentPostDialog = StateFlowKt.MutableStateFlow(bool);
        this.isFollow = StateFlowKt.MutableStateFlow(bool);
        this.isFriend = StateFlowKt.MutableStateFlow(bool);
        this.isBlack = StateFlowKt.MutableStateFlow(bool);
        this.inHeBlack = StateFlowKt.MutableStateFlow(bool);
        this.memoName = StateFlowKt.MutableStateFlow("");
        this.profileLimit = StateFlowKt.MutableStateFlow(new ArrayList());
        this.purview = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new UserInfoModel.Purview(), null, 2, null);
        this.friendTime = StateFlowKt.MutableStateFlow(0L);
        this.eventSubscribeTime = StateFlowKt.MutableStateFlow(0L);
        this.userId = StateFlowKt.MutableStateFlow(0L);
        this.userIdx = StateFlowKt.MutableStateFlow("");
        this.idLevel = StateFlowKt.MutableStateFlow(0);
        this.userName = StateFlowKt.MutableStateFlow("");
        this.userHeader = StateFlowKt.MutableStateFlow("");
        this.userHeaderFrame = StateFlowKt.MutableStateFlow(null);
        this.background = StateFlowKt.MutableStateFlow(null);
        this.userLevel = StateFlowKt.MutableStateFlow(0);
        this.isBlackUser = StateFlowKt.MutableStateFlow(bool);
        this.sex = StateFlowKt.MutableStateFlow(2);
        this.bio = StateFlowKt.MutableStateFlow(null);
        this.birthday = StateFlowKt.MutableStateFlow("");
        this.age = StateFlowKt.MutableStateFlow(0);
        this.countryId = StateFlowKt.MutableStateFlow(0);
        this.region = StateFlowKt.MutableStateFlow(0);
        this.medal = StateFlowKt.MutableStateFlow(null);
        this.visitorNum = StateFlowKt.MutableStateFlow(0);
        this.followedNum = StateFlowKt.MutableStateFlow(0);
        this.fansNum = StateFlowKt.MutableStateFlow(0);
        this.joinRoomNum = StateFlowKt.MutableStateFlow(0);
        this.role = StateFlowKt.MutableStateFlow(0);
        this.regTime = StateFlowKt.MutableStateFlow(0);
        this.tags = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.isPremium = StateFlowKt.MutableStateFlow(bool);
        this.premiumLevel = StateFlowKt.MutableStateFlow(0);
        this.vipState = StateFlowKt.MutableStateFlow(0);
        this.vipLevel = StateFlowKt.MutableStateFlow(0);
        this.showVIP = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.wealthLevel = StateFlowKt.MutableStateFlow(0);
        this.wealthBadgeWithBg = StateFlowKt.MutableStateFlow("");
        this.currBadgeLv = StateFlowKt.MutableStateFlow(0);
    }

    @Deprecated(message = "暂不使用")
    public static /* synthetic */ void getCurrBadgeLv$annotations() {
    }

    @NotNull
    public final MutableStateFlow<Integer> getAge() {
        return this.age;
    }

    @NotNull
    public final MutableStateFlow<String> getBackground() {
        return this.background;
    }

    @NotNull
    public final MutableStateFlow<String> getBadgeLevelUrl() {
        return this.badgeLevelUrl;
    }

    @NotNull
    public final MutableStateFlow<Boolean> getBadgeState() {
        return this.badgeState;
    }

    @NotNull
    public final MutableStateFlow<String> getBadgeUrl() {
        return this.badgeUrl;
    }

    @NotNull
    public final MutableStateFlow<String> getBio() {
        return this.bio;
    }

    @NotNull
    public final MutableStateFlow<String> getBirthday() {
        return this.birthday;
    }

    @NotNull
    public final MutableStateFlow<RoomUserInfoDTO.ChatBubbleInfo> getBubbleInfo() {
        return this.bubbleInfo;
    }

    @NotNull
    public final MutableStateFlow<Integer> getConveneNum() {
        return this.conveneNum;
    }

    @NotNull
    public final MutableStateFlow<Integer> getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final MutableStateFlow<Integer> getCurrBadgeLv() {
        return this.currBadgeLv;
    }

    @NotNull
    public final MutableStateFlow<Long> getDayContributeNum() {
        return this.dayContributeNum;
    }

    @NotNull
    public final MutableStateFlow<Long> getEventSubscribeTime() {
        return this.eventSubscribeTime;
    }

    @NotNull
    public final MutableStateFlow<Integer> getFansNum() {
        return this.fansNum;
    }

    @NotNull
    public final MutableStateFlow<Integer> getFollowedNum() {
        return this.followedNum;
    }

    @NotNull
    public final MutableStateFlow<Long> getFriendTime() {
        return this.friendTime;
    }

    @NotNull
    public final MutableStateFlow<Boolean> getHasMic() {
        return this.hasMic;
    }

    @NotNull
    public final MutableStateFlow<Integer> getHeadPhotoResId() {
        return this.headPhotoResId;
    }

    @NotNull
    public final MutableStateFlow<Integer> getHeaderCardId() {
        return this.headerCardId;
    }

    @NotNull
    public final MutableStateFlow<String> getHeaderCardUrl() {
        return this.headerCardUrl;
    }

    @NotNull
    public final MutableStateFlow<Integer> getIdLevel() {
        return this.idLevel;
    }

    @NotNull
    public final MutableStateFlow<Boolean> getInHeBlack() {
        return this.inHeBlack;
    }

    @NotNull
    public final MutableStateFlow<String> getInRoomEffectsInfo() {
        return this.inRoomEffectsInfo;
    }

    @NotNull
    public final MutableStateFlow<RoomUserInfoDTO.InRoomEffectsInfo> getInRoomEffectsInfoEntity() {
        return this.inRoomEffectsInfoEntity;
    }

    @NotNull
    public final MutableStateFlow<Integer> getJoinRoomNum() {
        return this.joinRoomNum;
    }

    @NotNull
    public final MutableStateFlow<Long> getLasttime() {
        return this.lasttime;
    }

    @NotNull
    public final MutableStateFlow<String> getMedal() {
        return this.medal;
    }

    @NotNull
    public final MutableStateFlow<Integer> getMemberLevel() {
        return this.memberLevel;
    }

    @NotNull
    public final MutableStateFlow<String> getMemoName() {
        return this.memoName;
    }

    @NotNull
    public final MutableStateFlow<Integer> getMicPosition() {
        return this.micPosition;
    }

    @NotNull
    public final MutableStateFlow<Integer> getPremiumLevel() {
        return this.premiumLevel;
    }

    @NotNull
    public final MutableStateFlow<Long> getPriority() {
        return this.priority;
    }

    @NotNull
    public final MutableStateFlow<String> getProfileCardInfo() {
        return this.profileCardInfo;
    }

    @NotNull
    public final MutableStateFlow<RoomUserInfoDTO.ProfileCardInfo> getProfileCardInfoEntity() {
        return this.profileCardInfoEntity;
    }

    @NotNull
    public final MutableStateFlow<List<ProfileLimitModel>> getProfileLimit() {
        return this.profileLimit;
    }

    @NotNull
    public final MutableState<UserInfoModel.Purview> getPurview() {
        return this.purview;
    }

    @NotNull
    public final MutableStateFlow<Integer> getRankDay() {
        return this.rankDay;
    }

    @NotNull
    public final MutableStateFlow<Integer> getRankWeek() {
        return this.rankWeek;
    }

    @NotNull
    public final MutableStateFlow<Integer> getRegTime() {
        return this.regTime;
    }

    @NotNull
    public final MutableStateFlow<Integer> getRegion() {
        return this.region;
    }

    @NotNull
    public final MutableStateFlow<Integer> getRole() {
        return this.role;
    }

    @NotNull
    public final MutableStateFlow<Integer> getRoomMemberType() {
        return this.roomMemberType;
    }

    @NotNull
    public final MutableStateFlow<Integer> getSex() {
        return this.sex;
    }

    @NotNull
    public final MutableStateFlow<Boolean> getShowPremiumFirst() {
        return this.showPremiumFirst;
    }

    @NotNull
    public final MutableStateFlow<Boolean> getShowVIP() {
        return this.showVIP;
    }

    @NotNull
    public final MutableStateFlow<Boolean> getSilenced() {
        return this.silenced;
    }

    @NotNull
    public final MutableStateFlow<List<UserInfo.TagInfo>> getTags() {
        return this.tags;
    }

    @NotNull
    public final MutableStateFlow<String> getUserHeader() {
        return this.userHeader;
    }

    @NotNull
    public final MutableStateFlow<String> getUserHeaderFrame() {
        return this.userHeaderFrame;
    }

    @NotNull
    public final MutableStateFlow<Long> getUserId() {
        return this.userId;
    }

    @NotNull
    public final MutableStateFlow<String> getUserIdx() {
        return this.userIdx;
    }

    @NotNull
    public final MutableStateFlow<Integer> getUserLevel() {
        return this.userLevel;
    }

    @NotNull
    public final MutableStateFlow<String> getUserName() {
        return this.userName;
    }

    @NotNull
    public final MutableStateFlow<Integer> getVehicleId() {
        return this.vehicleId;
    }

    @NotNull
    public final MutableStateFlow<String> getVehicleSVGAUrl() {
        return this.vehicleSVGAUrl;
    }

    @NotNull
    public final MutableStateFlow<String> getVehicleUrl() {
        return this.vehicleUrl;
    }

    @NotNull
    public final MutableStateFlow<Integer> getVipLevel() {
        return this.vipLevel;
    }

    @NotNull
    public final MutableStateFlow<Integer> getVipState() {
        return this.vipState;
    }

    @NotNull
    public final MutableStateFlow<Integer> getVisitorNum() {
        return this.visitorNum;
    }

    @NotNull
    public final MutableStateFlow<Integer> getVoiceChangerId() {
        return this.voiceChangerId;
    }

    @NotNull
    public final MutableStateFlow<String> getWealthBadge() {
        return this.wealthBadge;
    }

    @NotNull
    public final MutableStateFlow<String> getWealthBadgeWithBg() {
        return this.wealthBadgeWithBg;
    }

    @NotNull
    public final MutableStateFlow<Integer> getWealthLevel() {
        return this.wealthLevel;
    }

    @NotNull
    public final MutableStateFlow<String> getWealthProfileCardImg() {
        return this.wealthProfileCardImg;
    }

    @NotNull
    public final MutableStateFlow<Long> getWeekContributeNum() {
        return this.weekContributeNum;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isBlack() {
        return this.isBlack;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isBlackUser() {
        return this.isBlackUser;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isFollow() {
        return this.isFollow;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isFriend() {
        return this.isFriend;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isInRoom() {
        return this.isInRoom;
    }

    public final boolean isOfficialRole() {
        return this.role.getValue().intValue() == 2 || this.role.getValue().intValue() == 4;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isPremium() {
        return this.isPremium;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isSelected() {
        return this.isSelected;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isSelectedForSendHats() {
        return this.isSelectedForSendHats;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isSetting() {
        return this.isSetting;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isShowMomentPostDialog() {
        return this.isShowMomentPostDialog;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isTopRank() {
        return this.isTopRank;
    }

    @NotNull
    public final MutableStateFlow<Boolean> isUnLoginUser() {
        return this.isUnLoginUser;
    }

    @Stable
    @Composable
    public final boolean needShowPremiumJustForCompose(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(953210430);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(953210430, i, -1, "com.yalla.yalla.model.room.RoomUserInfoModel.needShowPremiumJustForCompose (RoomUserInfoModel.kt:278)");
        }
        boolean z = true;
        boolean zBooleanValue = ((Boolean) SnapshotStateKt.collectAsState(this.isPremium, null, composer, 8, 1).getValue()).booleanValue();
        int iIntValue = ((Number) SnapshotStateKt.collectAsState(this.vipState, null, composer, 8, 1).getValue()).intValue();
        boolean zBooleanValue2 = ((Boolean) SnapshotStateKt.collectAsState(this.showVIP, null, composer, 8, 1).getValue()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) SnapshotStateKt.collectAsState(this.showPremiumFirst, null, composer, 8, 1).getValue()).booleanValue();
        if ((!zBooleanValue || iIntValue != VipState.Vip.getValue() || (!zBooleanValue3 && zBooleanValue2)) && (!zBooleanValue || iIntValue == VipState.Vip.getValue())) {
            z = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return z;
    }

    @NotNull
    public final RoomUserInfoModel parseDataByDefaultJsonString() {
        String value = this.profileCardInfo.getValue();
        if (!(value == null || StringsKt.isBlank(value))) {
            this.profileCardInfoEntity.setValue((RoomUserInfoDTO.ProfileCardInfo) OooO00o.OooO0OO(RoomUserInfoDTO.ProfileCardInfo.class, value));
            this.profileCardInfo.setValue(null);
        }
        String value2 = this.inRoomEffectsInfo.getValue();
        if (!(value2 == null || StringsKt.isBlank(value2))) {
            this.inRoomEffectsInfoEntity.setValue((RoomUserInfoDTO.InRoomEffectsInfo) OooO00o.OooO0OO(RoomUserInfoDTO.InRoomEffectsInfo.class, value2));
            this.inRoomEffectsInfo.setValue(null);
        }
        return this;
    }

    public final void setAge(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.age = mutableStateFlow;
    }

    public final void setBackground(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.background = mutableStateFlow;
    }

    public final void setBadgeLevelUrl(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.badgeLevelUrl = mutableStateFlow;
    }

    public final void setBadgeState(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.badgeState = mutableStateFlow;
    }

    public final void setBadgeUrl(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.badgeUrl = mutableStateFlow;
    }

    public final void setBio(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.bio = mutableStateFlow;
    }

    public final void setBirthday(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.birthday = mutableStateFlow;
    }

    public final void setBlack(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isBlack = mutableStateFlow;
    }

    public final void setBlackUser(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isBlackUser = mutableStateFlow;
    }

    public final void setBubbleInfo(@NotNull MutableStateFlow<RoomUserInfoDTO.ChatBubbleInfo> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.bubbleInfo = mutableStateFlow;
    }

    public final void setConveneNum(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.conveneNum = mutableStateFlow;
    }

    public final void setCountryId(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.countryId = mutableStateFlow;
    }

    public final void setCurrBadgeLv(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.currBadgeLv = mutableStateFlow;
    }

    public final void setDayContributeNum(@NotNull MutableStateFlow<Long> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.dayContributeNum = mutableStateFlow;
    }

    public final void setEventSubscribeTime(@NotNull MutableStateFlow<Long> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.eventSubscribeTime = mutableStateFlow;
    }

    public final void setFansNum(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.fansNum = mutableStateFlow;
    }

    public final void setFollow(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isFollow = mutableStateFlow;
    }

    public final void setFollowedNum(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.followedNum = mutableStateFlow;
    }

    public final void setFriend(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isFriend = mutableStateFlow;
    }

    public final void setFriendTime(@NotNull MutableStateFlow<Long> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.friendTime = mutableStateFlow;
    }

    public final void setHasMic(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.hasMic = mutableStateFlow;
    }

    public final void setHeadPhotoResId(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.headPhotoResId = mutableStateFlow;
    }

    public final void setHeaderCardId(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.headerCardId = mutableStateFlow;
    }

    public final void setHeaderCardUrl(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.headerCardUrl = mutableStateFlow;
    }

    public final void setIdLevel(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.idLevel = mutableStateFlow;
    }

    public final void setInHeBlack(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.inHeBlack = mutableStateFlow;
    }

    public final void setInRoom(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isInRoom = mutableStateFlow;
    }

    public final void setInRoomEffectsInfo(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.inRoomEffectsInfo = mutableStateFlow;
    }

    public final void setInRoomEffectsInfoEntity(@NotNull MutableStateFlow<RoomUserInfoDTO.InRoomEffectsInfo> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.inRoomEffectsInfoEntity = mutableStateFlow;
    }

    public final void setJoinRoomNum(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.joinRoomNum = mutableStateFlow;
    }

    public final void setLasttime(@NotNull MutableStateFlow<Long> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.lasttime = mutableStateFlow;
    }

    public final void setMedal(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.medal = mutableStateFlow;
    }

    public final void setMemberLevel(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.memberLevel = mutableStateFlow;
    }

    public final void setMemoName(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.memoName = mutableStateFlow;
    }

    public final void setMicPosition(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.micPosition = mutableStateFlow;
    }

    public final void setPremium(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isPremium = mutableStateFlow;
    }

    public final void setPremiumLevel(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.premiumLevel = mutableStateFlow;
    }

    public final void setPriority(@NotNull MutableStateFlow<Long> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.priority = mutableStateFlow;
    }

    public final void setProfileCardInfo(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.profileCardInfo = mutableStateFlow;
    }

    public final void setProfileCardInfoEntity(@NotNull MutableStateFlow<RoomUserInfoDTO.ProfileCardInfo> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.profileCardInfoEntity = mutableStateFlow;
    }

    public final void setProfileLimit(@NotNull MutableStateFlow<List<ProfileLimitModel>> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.profileLimit = mutableStateFlow;
    }

    public final void setPurview(@NotNull MutableState<UserInfoModel.Purview> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.purview = mutableState;
    }

    public final void setRankDay(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.rankDay = mutableStateFlow;
    }

    public final void setRankWeek(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.rankWeek = mutableStateFlow;
    }

    public final void setRegTime(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.regTime = mutableStateFlow;
    }

    public final void setRegion(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.region = mutableStateFlow;
    }

    public final void setRole(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.role = mutableStateFlow;
    }

    public final void setRoomMemberType(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.roomMemberType = mutableStateFlow;
    }

    public final void setSelected(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isSelected = mutableStateFlow;
    }

    public final void setSelectedForSendHats(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isSelectedForSendHats = mutableStateFlow;
    }

    public final void setSetting(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isSetting = mutableStateFlow;
    }

    public final void setSex(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.sex = mutableStateFlow;
    }

    public final void setShowMomentPostDialog(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isShowMomentPostDialog = mutableStateFlow;
    }

    public final void setShowPremiumFirst(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.showPremiumFirst = mutableStateFlow;
    }

    public final void setShowVIP(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.showVIP = mutableStateFlow;
    }

    public final void setSilenced(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.silenced = mutableStateFlow;
    }

    public final void setTags(@NotNull MutableStateFlow<List<UserInfo.TagInfo>> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.tags = mutableStateFlow;
    }

    public final void setTopRank(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isTopRank = mutableStateFlow;
    }

    public final void setUnLoginUser(@NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.isUnLoginUser = mutableStateFlow;
    }

    public final void setUserHeader(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.userHeader = mutableStateFlow;
    }

    public final void setUserHeaderFrame(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.userHeaderFrame = mutableStateFlow;
    }

    public final void setUserId(@NotNull MutableStateFlow<Long> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.userId = mutableStateFlow;
    }

    public final void setUserIdx(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.userIdx = mutableStateFlow;
    }

    public final void setUserLevel(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.userLevel = mutableStateFlow;
    }

    public final void setUserName(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.userName = mutableStateFlow;
    }

    public final void setVehicleId(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.vehicleId = mutableStateFlow;
    }

    public final void setVehicleSVGAUrl(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.vehicleSVGAUrl = mutableStateFlow;
    }

    public final void setVehicleUrl(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.vehicleUrl = mutableStateFlow;
    }

    public final void setVipLevel(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.vipLevel = mutableStateFlow;
    }

    public final void setVipState(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.vipState = mutableStateFlow;
    }

    public final void setVisitorNum(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.visitorNum = mutableStateFlow;
    }

    public final void setVoiceChangerId(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.voiceChangerId = mutableStateFlow;
    }

    public final void setWealthBadge(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.wealthBadge = mutableStateFlow;
    }

    public final void setWealthBadgeWithBg(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.wealthBadgeWithBg = mutableStateFlow;
    }

    public final void setWealthLevel(@NotNull MutableStateFlow<Integer> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.wealthLevel = mutableStateFlow;
    }

    public final void setWealthProfileCardImg(@NotNull MutableStateFlow<String> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.wealthProfileCardImg = mutableStateFlow;
    }

    public final void setWeekContributeNum(@NotNull MutableStateFlow<Long> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.weekContributeNum = mutableStateFlow;
    }
}
