package com.yalla.yalla.model.moment;

import android.graphics.BitmapFactory;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o000Oo0;
import com.code.android.util.o000O0;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.MomentSelectMedia;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;
import p417o0OoO0.o0000O0O;
import p464o0Oooo.o000000O;
import p586o0oOooOo.q;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010Ö\u0001\u001a\u00030×\u00012\u0007\u0010Á\u0001\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u0018J\u0007\u0010Ø\u0001\u001a\u00020\tJ\u0007\u0010Ù\u0001\u001a\u00020\tJ\u0007\u0010Ú\u0001\u001a\u00020\tJ\b\u0010/\u001a\u0004\u0018\u000102J\n\u0010Û\u0001\u001a\u0005\u0018\u00010Ü\u0001J\u0007\u0010Ý\u0001\u001a\u00020\u0018J\u0017\u0010Þ\u0001\u001a\u0012\u0012\u0004\u0012\u00020y0xj\b\u0012\u0004\u0012\u00020y`zJ\u0010\u0010ß\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010\u007fJ\u0017\u0010à\u0001\u001a\u0012\u0012\u0004\u0012\u00020y0xj\b\u0012\u0004\u0012\u00020y`zJ\u0007\u0010á\u0001\u001a\u00020\tJ\u0011\u0010â\u0001\u001a\u00030×\u00012\u0007\u0010ã\u0001\u001a\u00020\u0018J\t\u0010ä\u0001\u001a\u00020\u0018H\u0016J\u0012\u0010å\u0001\u001a\u00030×\u00012\b\u0010æ\u0001\u001a\u00030\u009d\u0001J\u001b\u0010ç\u0001\u001a\u00030×\u00012\u0007\u0010è\u0001\u001a\u00020\u00182\b\u0010é\u0001\u001a\u00030\u0080\u0001R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001cR\u001a\u00106\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010+\"\u0004\b8\u0010-R&\u00109\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0012\u0010C\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010D\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010;\"\u0004\bF\u0010=R\u001a\u0010G\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010\u001cR\u001e\u0010J\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010+\"\u0004\bL\u0010-R\u001a\u0010M\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001f\"\u0004\bN\u0010!R\u001a\u0010O\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001f\"\u0004\bP\u0010!R\u001a\u0010Q\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u001f\"\u0004\bR\u0010!R\u001a\u0010S\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u001f\"\u0004\bT\u0010!R\u001a\u0010U\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u001f\"\u0004\bV\u0010!R\u001e\u0010W\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u001f\"\u0004\bX\u0010!R\u001a\u0010Y\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u001f\"\u0004\bZ\u0010!R&\u0010[\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u001f\"\u0004\b\\\u0010!R\u001a\u0010]\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u001f\"\u0004\bA\u0010!R\u001e\u0010^\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u001f\"\u0004\b_\u0010!R\u001a\u0010`\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010;\"\u0004\ba\u0010=R&\u0010b\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u001f\"\u0004\bc\u0010!R&\u0010d\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u001f\"\u0004\be\u0010!R\u0019\u0010f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR&\u0010h\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t8F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u001f\"\u0004\bi\u0010!R\u001a\u0010j\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u001f\"\u0004\bk\u0010!R\u001a\u0010l\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u001f\"\u0004\bm\u0010!R\u001e\u0010n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u001f\"\u0004\bp\u0010!R\u001a\u0010q\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010;\"\u0004\bs\u0010=R\u001a\u0010t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010;\"\u0004\bv\u0010=R\u001e\u0010w\u001a\u0012\u0012\u0004\u0012\u00020y0xj\b\u0012\u0004\u0012\u00020y`zX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010{\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u001a\"\u0004\b}\u0010\u001cR\u0019\u0010~\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u0001\u0018\u00010\u007fX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0081\u0001\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010;\"\u0005\b\u0083\u0001\u0010=R\u001d\u0010\u0084\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u001a\"\u0005\b\u0086\u0001\u0010\u001cR!\u0010\u0087\u0001\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u001a\"\u0005\b\u0089\u0001\u0010\u001cR\u001d\u0010\u008a\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u001a\"\u0005\b\u008c\u0001\u0010\u001cR\u001d\u0010\u008d\u0001\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010;\"\u0005\b\u008f\u0001\u0010=R!\u0010\u0090\u0001\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010;\"\u0005\b\u0092\u0001\u0010=R\u001d\u0010\u0093\u0001\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010;\"\u0005\b\u0095\u0001\u0010=R)\u0010\u0096\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010+\"\u0005\b\u0098\u0001\u0010-R\u001d\u0010\u0099\u0001\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010;\"\u0005\b\u009b\u0001\u0010=R\"\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R+\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010£\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R#\u0010©\u0001\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010\u001a\"\u0005\b«\u0001\u0010\u001cR\u001d\u0010¬\u0001\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010;\"\u0005\b®\u0001\u0010=R)\u0010¯\u0001\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010;\"\u0005\b±\u0001\u0010=R\u001d\u0010²\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u0010\u001a\"\u0005\b´\u0001\u0010\u001cR\u001d\u0010µ\u0001\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0001\u0010+\"\u0005\b·\u0001\u0010-R)\u0010¸\u0001\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0001\u0010;\"\u0005\bº\u0001\u0010=R)\u0010»\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¼\u0001\u0010+\"\u0005\b½\u0001\u0010-R\u001d\u0010¾\u0001\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0001\u0010;\"\u0005\bÀ\u0001\u0010=R\u001d\u0010Á\u0001\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0001\u0010+\"\u0005\bÃ\u0001\u0010-R\u001d\u0010Ä\u0001\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0001\u0010+\"\u0005\bÆ\u0001\u0010-R\u001d\u0010Ç\u0001\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0001\u0010;\"\u0005\bÉ\u0001\u0010=R\u001d\u0010Ê\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u0010\u001a\"\u0005\bÌ\u0001\u0010\u001cR\u001d\u0010Í\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0001\u0010\u001a\"\u0005\bÏ\u0001\u0010\u001cR\u001d\u0010Ð\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÑ\u0001\u0010\u001a\"\u0005\bÒ\u0001\u0010\u001cR\u001d\u0010Ó\u0001\u001a\u00020\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0001\u0010;\"\u0005\bÕ\u0001\u0010=¨\u0006ê\u0001"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentDetailModel;", "Ljava/io/Serializable;", "()V", "_commentNum", "Landroidx/compose/runtime/MutableState;", "", "_deleteType", "", "_isFollow", "", "_isInRoom", "_isPraise", "_isTop", "_praiseNum", "_shareNum", "_state", "_totalPropValue", "adData", "Lcom/yalla/yalla/model/moment/MomentAdDataModel;", "getAdData", "()Lcom/yalla/yalla/model/moment/MomentAdDataModel;", "setAdData", "(Lcom/yalla/yalla/model/moment/MomentAdDataModel;)V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "circleDisbanded", "getCircleDisbanded", "()Z", "setCircleDisbanded", "(Z)V", "comment", "Lcom/yalla/yalla/model/moment/MomentCommentModel;", "getComment", "()Lcom/yalla/yalla/model/moment/MomentCommentModel;", "setComment", "(Lcom/yalla/yalla/model/moment/MomentCommentModel;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "commentNum", "getCommentNum", "()J", "setCommentNum", "(J)V", "content", "getContent", "setContent", "contentModel", "Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "coverPic", "getCoverPic", "setCoverPic", "createTime", "getCreateTime", "setCreateTime", "deleteType", "getDeleteType", "()I", "setDeleteType", "(I)V", "forward", "getForward", "()Lcom/yalla/yalla/model/moment/MomentDetailModel;", "setForward", "(Lcom/yalla/yalla/model/moment/MomentDetailModel;)V", "forwardContent", "forwardType", "getForwardType", "setForwardType", "headUrl", "getHeadUrl", "setHeadUrl", "id", "getId", "setId", "isCanDel", "setCanDel", "isCanEdit", "setCanEdit", "isCanReport", "setCanReport", "isCanShare", "setCanShare", "isCanTop", "setCanTop", "isEdited", "setEdited", "isFeatured", "setFeatured", "isFollow", "setFollow", "isForward", "isFriend", "setFriend", "isInHeBlack", "setInHeBlack", "isInRoom", "setInRoom", "isPraise", "setPraise", "isPropUserListChange", "()Landroidx/compose/runtime/MutableState;", "isTop", "setTop", "isVIP", "setVIP", "isWaterMark", "setWaterMark", "isblack", "getIsblack", "setIsblack", "kaVipLv", "getKaVipLv", "setKaVipLv", "kaVipState", "getKaVipState", "setKaVipState", "listImageInfo", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/moment/MomentImageModel;", "Lkotlin/collections/ArrayList;", "medal", "getMedal", "setMedal", "momentPoll", "Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/yalla/model/moment/MomentPoll;", "nVipLv", "getNVipLv", "setNVipLv", "nickName", "getNickName", "setNickName", "pFName", "getPFName", "setPFName", "pNumber", "getPNumber", "setPNumber", "playNum", "getPlayNum", "setPlayNum", "positionid", "getPositionid", "setPositionid", "power", "getPower", "setPower", "praiseNum", "getPraiseNum", "setPraiseNum", "role", "getRole", "setRole", "sendPostModel", "Lcom/yalla/yalla/model/moment/MomentSendModel;", "getSendPostModel", "()Lcom/yalla/yalla/model/moment/MomentSendModel;", "setSendPostModel", "(Lcom/yalla/yalla/model/moment/MomentSendModel;)V", "sendPropUsers", "", "Lcom/yalla/yalla/data/db/table/UserInfo;", "getSendPropUsers", "()Ljava/util/List;", "setSendPropUsers", "(Ljava/util/List;)V", "sessionId", "getSessionId", "setSessionId", "sex", "getSex", "setSex", "shareNum", "getShareNum", "setShareNum", "size", "getSize", "setSize", "sourcesId", "getSourcesId", "setSourcesId", "state", "getState", "setState", "totalPropValue", "getTotalPropValue", "setTotalPropValue", "type", "getType", "setType", "userId", "getUserId", "setUserId", "userIdx", "getUserIdx", "setUserIdx", "videoDuration", "getVideoDuration", "setVideoDuration", "videoSize", "getVideoSize", "setVideoSize", "videoUrl", "getVideoUrl", "setVideoUrl", "wealthBadgeImage", "getWealthBadgeImage", "setWealthBadgeImage", "wealthLevel", "getWealthLevel", "setWealthLevel", "addGiftGiver", "", "containGifImage", "containGifImageOrVideo", "containVideo", "getForwardContent", "Lcom/yalla/yalla/model/moment/MomentForwardContent;", "getForwardContentStr", "getImageInfoList", "getMomentPollLiveData", "getVideoInfoList", "isMySelf", "setMomentPoll", "pollJsonString", "toString", "transformBySendModel", "sendModel", "updatePollData", "jsonString", "data", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMomentDetailModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailModel.kt\ncom/yalla/yalla/model/moment/MomentDetailModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,676:1\n1855#2,2:677\n1855#2,2:679\n1855#2,2:681\n*S KotlinDebug\n*F\n+ 1 MomentDetailModel.kt\ncom/yalla/yalla/model/moment/MomentDetailModel\n*L\n496#1:677,2\n531#1:679,2\n543#1:681,2\n*E\n"})
public final class MomentDetailModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private transient MutableState<Integer> _deleteType;

    @Nullable
    private transient MutableState<Boolean> _isFollow;

    @Nullable
    private transient MutableState<Boolean> _isInRoom;

    @Nullable
    private transient MutableState<Boolean> _isPraise;

    @Nullable
    private transient MutableState<Boolean> _isTop;

    @Nullable
    private transient MutableState<Integer> _shareNum;

    @Nullable
    private transient MutableState<Integer> _state;

    @Nullable
    private transient MutableState<Long> _totalPropValue;

    @Nullable
    private MomentAdDataModel adData;
    private boolean circleDisbanded;

    @SerializedName(alternate = {"commentHotInfo"}, value = "comment")
    @Nullable
    private MomentCommentModel comment;
    private long commentNum;

    @Nullable
    private String content;

    @Nullable
    private MomentSendContentModel contentModel;

    @NotNull
    private String coverPic;
    private long createTime;
    private int deleteType;

    @Nullable
    private MomentDetailModel forward;

    @SerializedName("forwardConent")
    @NotNull
    private String forwardContent;
    private int forwardType;

    @SerializedName(alternate = {"dyid"}, value = "id")
    private long id;
    private boolean isCanDel;
    private boolean isCanEdit;
    private boolean isCanReport;
    private boolean isCanShare;
    private boolean isCanTop;

    @SerializedName(alternate = {"isEdited"}, value = "isEdit")
    private boolean isEdited;
    private boolean isFeatured;
    private boolean isFollow;
    private boolean isForward;

    @SerializedName("isFrind")
    private boolean isFriend;
    private int isInHeBlack;
    private boolean isInRoom;
    private boolean isPraise;

    @Nullable
    private final transient MutableState<Boolean> isPropUserListChange;

    @SerializedName(alternate = {"isTop", "isTopForUserPostList"}, value = "istop")
    private boolean isTop;
    private boolean isVIP;
    private boolean isWaterMark;

    @SerializedName(alternate = {"isBlack"}, value = "isblack")
    private boolean isblack;
    private int kaVipLv;
    private int kaVipState;

    @NotNull
    private ArrayList<MomentImageModel> listImageInfo;

    @NotNull
    private String medal;

    @Nullable
    private transient MutableLiveData<MomentPoll> momentPoll;

    @SerializedName(alternate = {"nVIPLv", "nVipLv"}, value = "nvipLv")
    private int nVipLv;

    @SerializedName("pFname")
    @NotNull
    private String pFName;

    @NotNull
    private String pNumber;
    private int playNum;

    @SerializedName(alternate = {"positionId"}, value = "positionid")
    private int positionid;
    private int power;
    private long praiseNum;
    private int role;

    @Nullable
    private MomentSendModel sendPostModel;

    @SerializedName("sendPropUsers")
    @NotNull
    private List<UserInfo> sendPropUsers;

    @SerializedName(alternate = {"sessionid"}, value = "sessionId")
    @Nullable
    private String sessionId;
    private int sex;
    private int shareNum;

    @NotNull
    private String size;
    private long sourcesId;
    private int state;
    private long totalPropValue;
    private int type;
    private long userId;
    private long userIdx;
    private int videoDuration;

    @NotNull
    private String videoSize;

    @NotNull
    private String videoUrl;

    @NotNull
    private String wealthBadgeImage;
    private int wealthLevel;

    @NotNull
    private String nickName = "";

    @NotNull
    private String headUrl = "";

    @NotNull
    private String address = "";

    @Nullable
    private transient MutableState<Long> _praiseNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    @Nullable
    private transient MutableState<Long> _commentNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    public MomentDetailModel() {
        Boolean bool = Boolean.FALSE;
        this._isPraise = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.pFName = "";
        this.pNumber = "";
        this.size = "";
        this.medal = "";
        this._totalPropValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.sendPropUsers = new ArrayList();
        this.isPropUserListChange = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._deleteType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this._isInRoom = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._isFollow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._isTop = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.wealthBadgeImage = "";
        this._shareNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this._state = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
        this.state = 1;
        this.forwardContent = "";
        this.videoUrl = "";
        this.videoSize = "";
        this.coverPic = "";
        this.listImageInfo = new ArrayList<>();
        this.isInHeBlack = -1;
    }

    public final void addGiftGiver(final long userId, @NotNull String headUrl) {
        Intrinsics.checkNotNullParameter(headUrl, "headUrl");
        CollectionsKt.removeAll((List) this.sendPropUsers, (Function1) new Function1<UserInfo, Boolean>() { // from class: com.yalla.yalla.model.moment.MomentDetailModel.addGiftGiver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull UserInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getUserId() == userId);
            }
        });
        List<UserInfo> list = this.sendPropUsers;
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setUserHeader(headUrl);
        Unit unit = Unit.INSTANCE;
        list.add(0, userInfo);
        MutableState<Boolean> mutableState = this.isPropUserListChange;
        if (mutableState == null) {
            return;
        }
        mutableState.setValue(Boolean.valueOf(!(mutableState != null ? mutableState.getValue().booleanValue() : false)));
    }

    public final boolean containGifImage() {
        MomentDetailModel momentDetailModel;
        Iterator<T> it = getImageInfoList().iterator();
        while (it.hasNext()) {
            if (((MomentImageModel) it.next()).isGif()) {
                return true;
            }
        }
        if (!this.isForward || (momentDetailModel = this.forward) == null) {
            return false;
        }
        return momentDetailModel.containGifImage();
    }

    public final boolean containGifImageOrVideo() {
        MomentDetailModel momentDetailModel;
        if (this.type == MomentType.Video.getValue()) {
            return true;
        }
        Iterator<T> it = getImageInfoList().iterator();
        while (it.hasNext()) {
            if (((MomentImageModel) it.next()).isGif()) {
                return true;
            }
        }
        if (!this.isForward || (momentDetailModel = this.forward) == null) {
            return false;
        }
        return momentDetailModel.containGifImageOrVideo();
    }

    public final boolean containVideo() {
        MomentDetailModel momentDetailModel;
        if (this.type == MomentType.Video.getValue()) {
            return true;
        }
        if (!this.isForward || (momentDetailModel = this.forward) == null) {
            return false;
        }
        return momentDetailModel.containVideo();
    }

    @Nullable
    public final MomentAdDataModel getAdData() {
        return this.adData;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    public final boolean getCircleDisbanded() {
        return this.circleDisbanded;
    }

    @Nullable
    public final MomentCommentModel getComment() {
        return this.comment;
    }

    public final long getCommentNum() {
        if (this._commentNum == null) {
            this._commentNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(this.commentNum), null, 2, null);
        }
        long j = this.commentNum;
        MutableState<Long> mutableState = this._commentNum;
        Intrinsics.checkNotNull(mutableState);
        if (j != mutableState.getValue().longValue()) {
            MutableState<Long> mutableState2 = this._commentNum;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Long.valueOf(this.commentNum));
        }
        MutableState<Long> mutableState3 = this._commentNum;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().longValue();
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getCoverPic() {
        return this.coverPic;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDeleteType() {
        if (this._deleteType == null) {
            this._deleteType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(this.deleteType), null, 2, null);
        }
        int i = this.deleteType;
        MutableState<Integer> mutableState = this._deleteType;
        Intrinsics.checkNotNull(mutableState);
        if (i != mutableState.getValue().intValue()) {
            MutableState<Integer> mutableState2 = this._deleteType;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Integer.valueOf(this.deleteType));
        }
        MutableState<Integer> mutableState3 = this._deleteType;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().intValue();
    }

    @Nullable
    public final MomentDetailModel getForward() {
        return this.forward;
    }

    @Nullable
    public final MomentForwardContent getForwardContent() {
        try {
            if (o0000O0O.OooO0o(this.forwardContent)) {
                return (MomentForwardContent) OooOO0.OooO0O0(MomentForwardContent.class, this.forwardContent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getForwardContentStr, reason: from getter */
    public final String getForwardContent() {
        return this.forwardContent;
    }

    public final int getForwardType() {
        return this.forwardType;
    }

    @NotNull
    public final String getHeadUrl() {
        return this.headUrl;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ArrayList<MomentImageModel> getImageInfoList() {
        if (!this.listImageInfo.isEmpty()) {
            return this.listImageInfo;
        }
        ArrayList<MomentImageModel> arrayListOooO0O0 = o000Oo0.OooO0O0(this.pFName, this.pNumber, this.size);
        Intrinsics.checkNotNullExpressionValue(arrayListOooO0O0, "getImageInfoList(pFName, pNumber, size)");
        this.listImageInfo = arrayListOooO0O0;
        return arrayListOooO0O0;
    }

    public final boolean getIsblack() {
        return this.isblack;
    }

    public final int getKaVipLv() {
        return this.kaVipLv;
    }

    public final int getKaVipState() {
        return this.kaVipState;
    }

    @NotNull
    public final String getMedal() {
        return this.medal;
    }

    @NotNull
    public final MutableLiveData<MomentPoll> getMomentPollLiveData() {
        try {
            if (this.momentPoll == null) {
                this.momentPoll = new MutableLiveData<>();
            }
            MutableLiveData<MomentPoll> mutableLiveData = this.momentPoll;
            Intrinsics.checkNotNull(mutableLiveData);
            if (mutableLiveData.getValue() == null && this.type == 21 && o0000O0O.OooO0o(this.forwardContent)) {
                MutableLiveData<MomentPoll> mutableLiveData2 = this.momentPoll;
                Intrinsics.checkNotNull(mutableLiveData2);
                mutableLiveData2.setValue((MomentPoll) OooOO0.OooO0O0(MomentPoll.class, this.forwardContent));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        MutableLiveData<MomentPoll> mutableLiveData3 = this.momentPoll;
        Intrinsics.checkNotNull(mutableLiveData3);
        return mutableLiveData3;
    }

    public final int getNVipLv() {
        return this.nVipLv;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final String getPFName() {
        return this.pFName;
    }

    @NotNull
    public final String getPNumber() {
        return this.pNumber;
    }

    public final int getPlayNum() {
        return this.playNum;
    }

    public final int getPositionid() {
        return this.positionid;
    }

    public final int getPower() {
        return this.power;
    }

    public final long getPraiseNum() {
        if (this._praiseNum == null) {
            this._praiseNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(this.praiseNum), null, 2, null);
        }
        long j = this.praiseNum;
        MutableState<Long> mutableState = this._praiseNum;
        Intrinsics.checkNotNull(mutableState);
        if (j != mutableState.getValue().longValue()) {
            MutableState<Long> mutableState2 = this._praiseNum;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Long.valueOf(this.praiseNum));
        }
        MutableState<Long> mutableState3 = this._praiseNum;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().longValue();
    }

    public final int getRole() {
        return this.role;
    }

    @Nullable
    public final MomentSendModel getSendPostModel() {
        return this.sendPostModel;
    }

    @NotNull
    public final List<UserInfo> getSendPropUsers() {
        return this.sendPropUsers;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSex() {
        return this.sex;
    }

    public final int getShareNum() {
        if (this._shareNum == null) {
            this._shareNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(this.shareNum), null, 2, null);
        }
        int i = this.shareNum;
        MutableState<Integer> mutableState = this._shareNum;
        Intrinsics.checkNotNull(mutableState);
        if (i != mutableState.getValue().intValue()) {
            MutableState<Integer> mutableState2 = this._shareNum;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Integer.valueOf(this.shareNum));
        }
        MutableState<Integer> mutableState3 = this._shareNum;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().intValue();
    }

    @NotNull
    public final String getSize() {
        return this.size;
    }

    public final long getSourcesId() {
        return this.sourcesId;
    }

    public final int getState() {
        if (this._state == null) {
            this._state = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(this.state), null, 2, null);
        }
        int i = this.state;
        MutableState<Integer> mutableState = this._state;
        Intrinsics.checkNotNull(mutableState);
        if (i != mutableState.getValue().intValue()) {
            MutableState<Integer> mutableState2 = this._state;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Integer.valueOf(this.state));
        }
        MutableState<Integer> mutableState3 = this._state;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().intValue();
    }

    public final long getTotalPropValue() {
        if (this._totalPropValue == null) {
            this._totalPropValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(this.totalPropValue), null, 2, null);
        }
        long j = this.totalPropValue;
        MutableState<Long> mutableState = this._totalPropValue;
        Intrinsics.checkNotNull(mutableState);
        if (j != mutableState.getValue().longValue()) {
            MutableState<Long> mutableState2 = this._totalPropValue;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Long.valueOf(this.totalPropValue));
        }
        MutableState<Long> mutableState3 = this._totalPropValue;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().longValue();
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final long getUserIdx() {
        return this.userIdx;
    }

    public final int getVideoDuration() {
        return this.videoDuration;
    }

    @NotNull
    public final ArrayList<MomentImageModel> getVideoInfoList() {
        return this.listImageInfo;
    }

    @NotNull
    public final String getVideoSize() {
        return this.videoSize;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @NotNull
    public final String getWealthBadgeImage() {
        return this.wealthBadgeImage;
    }

    public final int getWealthLevel() {
        return this.wealthLevel;
    }

    /* JADX INFO: renamed from: isCanDel, reason: from getter */
    public final boolean getIsCanDel() {
        return this.isCanDel;
    }

    /* JADX INFO: renamed from: isCanEdit, reason: from getter */
    public final boolean getIsCanEdit() {
        return this.isCanEdit;
    }

    /* JADX INFO: renamed from: isCanReport, reason: from getter */
    public final boolean getIsCanReport() {
        return this.isCanReport;
    }

    /* JADX INFO: renamed from: isCanShare, reason: from getter */
    public final boolean getIsCanShare() {
        return this.isCanShare;
    }

    /* JADX INFO: renamed from: isCanTop, reason: from getter */
    public final boolean getIsCanTop() {
        return this.isCanTop;
    }

    /* JADX INFO: renamed from: isEdited, reason: from getter */
    public final boolean getIsEdited() {
        return this.isEdited;
    }

    /* JADX INFO: renamed from: isFeatured, reason: from getter */
    public final boolean getIsFeatured() {
        return this.isFeatured;
    }

    public final boolean isFollow() {
        if (this._isFollow == null) {
            this._isFollow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.isFollow), null, 2, null);
        }
        boolean z = this.isFollow;
        MutableState<Boolean> mutableState = this._isFollow;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._isFollow;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.isFollow));
        }
        MutableState<Boolean> mutableState3 = this._isFollow;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: isForward, reason: from getter */
    public final boolean getIsForward() {
        return this.isForward;
    }

    /* JADX INFO: renamed from: isFriend, reason: from getter */
    public final boolean getIsFriend() {
        return this.isFriend;
    }

    /* JADX INFO: renamed from: isInHeBlack, reason: from getter */
    public final int getIsInHeBlack() {
        return this.isInHeBlack;
    }

    public final boolean isInRoom() {
        if (this._isInRoom == null) {
            this._isInRoom = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.isInRoom), null, 2, null);
        }
        boolean z = this.isInRoom;
        MutableState<Boolean> mutableState = this._isInRoom;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._isInRoom;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.isInRoom));
        }
        MutableState<Boolean> mutableState3 = this._isInRoom;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isMySelf() {
        long j = this.userId;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        return l != null && j == l.longValue();
    }

    public final boolean isPraise() {
        if (this._isPraise == null) {
            this._isPraise = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.isPraise), null, 2, null);
        }
        boolean z = this.isPraise;
        MutableState<Boolean> mutableState = this._isPraise;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._isPraise;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.isPraise));
        }
        MutableState<Boolean> mutableState3 = this._isPraise;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
    }

    @Nullable
    public final MutableState<Boolean> isPropUserListChange() {
        return this.isPropUserListChange;
    }

    public final boolean isTop() {
        if (this._isTop == null) {
            this._isTop = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.isTop), null, 2, null);
        }
        boolean z = this.isTop;
        MutableState<Boolean> mutableState = this._isTop;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._isTop;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.isTop));
        }
        MutableState<Boolean> mutableState3 = this._isTop;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: isVIP, reason: from getter */
    public final boolean getIsVIP() {
        return this.isVIP;
    }

    /* JADX INFO: renamed from: isWaterMark, reason: from getter */
    public final boolean getIsWaterMark() {
        return this.isWaterMark;
    }

    public final void setAdData(@Nullable MomentAdDataModel momentAdDataModel) {
        this.adData = momentAdDataModel;
    }

    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void setCanDel(boolean z) {
        this.isCanDel = z;
    }

    public final void setCanEdit(boolean z) {
        this.isCanEdit = z;
    }

    public final void setCanReport(boolean z) {
        this.isCanReport = z;
    }

    public final void setCanShare(boolean z) {
        this.isCanShare = z;
    }

    public final void setCanTop(boolean z) {
        this.isCanTop = z;
    }

    public final void setCircleDisbanded(boolean z) {
        this.circleDisbanded = z;
    }

    public final void setComment(@Nullable MomentCommentModel momentCommentModel) {
        this.comment = momentCommentModel;
    }

    public final void setCommentNum(long j) {
        this.commentNum = j;
        if (this._commentNum == null) {
            this._commentNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
        }
        MutableState<Long> mutableState = this._commentNum;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Long.valueOf(j));
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setCoverPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coverPic = str;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDeleteType(int i) {
        this.deleteType = i;
        if (this._deleteType == null) {
            this._deleteType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        }
        MutableState<Integer> mutableState = this._deleteType;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Integer.valueOf(i));
    }

    public final void setEdited(boolean z) {
        this.isEdited = z;
    }

    public final void setFeatured(boolean z) {
        this.isFeatured = z;
    }

    public final void setFollow(boolean z) {
        this.isFollow = z;
        if (this._isFollow == null) {
            this._isFollow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        MutableState<Boolean> mutableState = this._isFollow;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void setForward(boolean z) {
        this.isForward = z;
    }

    public final void setForwardType(int i) {
        this.forwardType = i;
    }

    public final void setFriend(boolean z) {
        this.isFriend = z;
    }

    public final void setHeadUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headUrl = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setInHeBlack(int i) {
        this.isInHeBlack = i;
    }

    public final void setInRoom(boolean z) {
        this.isInRoom = z;
        if (this._isInRoom == null) {
            this._isInRoom = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        MutableState<Boolean> mutableState = this._isInRoom;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void setIsblack(boolean z) {
        this.isblack = z;
    }

    public final void setKaVipLv(int i) {
        this.kaVipLv = i;
    }

    public final void setKaVipState(int i) {
        this.kaVipState = i;
    }

    public final void setMedal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.medal = str;
    }

    public final void setMomentPoll(@NotNull String pollJsonString) {
        Intrinsics.checkNotNullParameter(pollJsonString, "pollJsonString");
        this.forwardContent = pollJsonString;
    }

    public final void setNVipLv(int i) {
        this.nVipLv = i;
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    public final void setPFName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pFName = str;
    }

    public final void setPNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pNumber = str;
    }

    public final void setPlayNum(int i) {
        this.playNum = i;
    }

    public final void setPositionid(int i) {
        this.positionid = i;
    }

    public final void setPower(int i) {
        this.power = i;
    }

    public final void setPraise(boolean z) {
        this.isPraise = z;
        if (this._isPraise == null) {
            this._isPraise = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        MutableState<Boolean> mutableState = this._isPraise;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void setPraiseNum(long j) {
        this.praiseNum = j;
        if (this._praiseNum == null) {
            this._praiseNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
        }
        MutableState<Long> mutableState = this._praiseNum;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Long.valueOf(j));
    }

    public final void setRole(int i) {
        this.role = i;
    }

    public final void setSendPostModel(@Nullable MomentSendModel momentSendModel) {
        this.sendPostModel = momentSendModel;
    }

    public final void setSendPropUsers(@NotNull List<UserInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sendPropUsers = list;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setShareNum(int i) {
        this.shareNum = i;
        if (this._shareNum == null) {
            this._shareNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        }
        MutableState<Integer> mutableState = this._shareNum;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Integer.valueOf(i));
    }

    public final void setSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.size = str;
    }

    public final void setSourcesId(long j) {
        this.sourcesId = j;
    }

    public final void setState(int i) {
        this.state = i;
        if (this._state == null) {
            this._state = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        }
        MutableState<Integer> mutableState = this._state;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Integer.valueOf(i));
    }

    public final void setTop(boolean z) {
        this.isTop = z;
        if (this._isTop == null) {
            this._isTop = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        MutableState<Boolean> mutableState = this._isTop;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void setTotalPropValue(long j) {
        this.totalPropValue = j;
        if (this._totalPropValue == null) {
            this._totalPropValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
        }
        MutableState<Long> mutableState = this._totalPropValue;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Long.valueOf(j));
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setUserIdx(long j) {
        this.userIdx = j;
    }

    public final void setVIP(boolean z) {
        this.isVIP = z;
    }

    public final void setVideoDuration(int i) {
        this.videoDuration = i;
    }

    public final void setVideoSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoSize = str;
    }

    public final void setVideoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoUrl = str;
    }

    public final void setWaterMark(boolean z) {
        this.isWaterMark = z;
    }

    public final void setWealthBadgeImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wealthBadgeImage = str;
    }

    public final void setWealthLevel(int i) {
        this.wealthLevel = i;
    }

    @NotNull
    public String toString() {
        return OooOO0.OooO00o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void transformBySendModel(@NotNull MomentSendModel sendModel) {
        String jSONString;
        Intrinsics.checkNotNullParameter(sendModel, "sendModel");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String str = (String) o000000O.OooO().getValue();
        if (str == null) {
            str = "";
        }
        this.headUrl = str;
        String str2 = (String) o000000O.OooOOoo().getValue();
        if (str2 == null) {
            str2 = "";
        }
        this.nickName = str2;
        Integer num = (Integer) o000000O.OooOOO().getValue();
        this.sex = num == null ? 2 : num.intValue();
        Pair pair = (Pair) o000000O.OooOO0().getValue();
        this.kaVipState = pair != null ? ((Number) pair.getSecond()).intValue() : 0;
        Pair pair2 = (Pair) o000000O.OooOO0o().getValue();
        this.isVIP = pair2 != null ? ((Boolean) pair2.getFirst()).booleanValue() : false;
        Pair pair3 = (Pair) o000000O.OooOO0o().getValue();
        this.nVipLv = pair3 != null ? ((Number) pair3.getSecond()).intValue() : 0;
        MomentSendContentModel content = sendModel.getContent();
        this.content = content != null ? content.toJSONString() : null;
        this.address = sendModel.getAddress();
        this.power = sendModel.getPower();
        if (sendModel.getPoll() != null) {
            this.type = MomentType.Poll.getValue();
            MomentSendPollModel poll = sendModel.getPoll();
            if (poll == null || (jSONString = poll.toJSONString()) == null) {
                jSONString = "";
            }
            setMomentPoll(jSONString);
        }
        Pair pair4 = (Pair) o000000O.OooOO0().getValue();
        this.kaVipLv = pair4 != null ? ((Number) pair4.getSecond()).intValue() : 0;
        String str3 = (String) o000000O.OooOO0O().getValue();
        this.medal = str3 != null ? str3 : "";
        this.listImageInfo.clear();
        for (MomentSelectMedia momentSelectMedia : sendModel.getListSendPostMedia()) {
            ArrayList<MomentImageModel> arrayList = this.listImageInfo;
            MomentImageModel momentImageModel = new MomentImageModel(momentSelectMedia.getPath());
            momentImageModel.setDuration(momentSelectMedia.getDuration());
            if (momentImageModel.getDuration() == 0) {
                MomentType momentType = MomentType.Image;
                this.type = momentType.getValue();
                BitmapFactory.Options optionsOooO00o = q.OooO00o(o000O0.OooO00o(), momentSelectMedia.getPath());
                momentImageModel.setWidth(optionsOooO00o.outWidth);
                momentImageModel.setHeight(optionsOooO00o.outHeight);
                this.type = momentType.getValue();
            } else {
                MomentType momentType2 = MomentType.Video;
                this.type = momentType2.getValue();
                momentImageModel.setWidth(momentSelectMedia.getWidth());
                momentImageModel.setHeight(momentSelectMedia.getHeight());
                this.type = momentType2.getValue();
                this.videoDuration = (int) momentImageModel.getDuration();
            }
            if (momentImageModel.getWidth() == 0 || momentImageModel.getHeight() == 0) {
                momentImageModel.setWidth(100);
                momentImageModel.setHeight(100);
            }
            arrayList.add(momentImageModel);
        }
        this.createTime = System.currentTimeMillis();
    }

    public final void updatePollData(@NotNull String jsonString, @NotNull MomentPoll data) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        Intrinsics.checkNotNullParameter(data, "data");
        setMomentPoll(jsonString);
        MutableLiveData<MomentPoll> mutableLiveData = this.momentPoll;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(data);
        }
    }

    @Nullable
    public final MomentSendContentModel getContent() {
        if (this.contentModel == null) {
            String str = this.content;
            this.contentModel = str != null ? (MomentSendContentModel) OooOO0.OooO0O0(MomentSendContentModel.class, str) : null;
        }
        return this.contentModel;
    }

    public final void setForward(@Nullable MomentDetailModel momentDetailModel) {
        this.forward = momentDetailModel;
    }
}
