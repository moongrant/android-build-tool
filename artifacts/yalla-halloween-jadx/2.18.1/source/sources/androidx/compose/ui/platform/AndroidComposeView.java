package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
import com.umeng.analytics.pro.o;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OO000;
import p100o000oOoO.o0OOO00;
import p650o0ooOoO.e;
import p650o0ooOoO.f;
import p650o0ooOoO.g;
import p650o0ooOoO.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004¯\u0001°\u0001B\u0013\u0012\b\u0010¬\u0001\u001a\u00030«\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001a\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u00102\u001a\u00020)8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u00101\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010;\u001a\u0002038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u00101\u001a\u0004\b6\u00107\"\u0004\b8\u00109R/\u0010C\u001a\u0004\u0018\u00010\u00072\b\u0010<\u001a\u0004\u0018\u00010\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR+\u0010J\u001a\u00020D2\u0006\u0010<\u001a\u00020D8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010>\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR+\u0010Q\u001a\u00020K2\u0006\u0010<\u001a\u00020K8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010>\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010S\u001a\u00020R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR$\u0010[\u001a\u00020Z2\u0006\u0010<\u001a\u00020Z8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001a\u0010h\u001a\u00020g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010m\u001a\u00020l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010r\u001a\u00020q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0016\u0010y\u001a\u0004\u0018\u00010v8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u001a\u0010{\u001a\u00020z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0084\u0001\u001a\u0002038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u00107R \u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u008b\u0001\u001a\u00020)8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010-R'\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0016X\u0096\u0004¢\u0006\u0017\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u0012\u0005\b\u0091\u0001\u00101\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R'\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u0012\u0005\b\u0097\u0001\u00101\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010¢\u0001\u001a\u00030¡\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010§\u0001\u001a\u00030¦\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001¨\u0006±\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Lo000000/o00000;", "", "Lo0Oo0oo/o0000oo;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$OooO0O0;", "", "callback", "setOnViewTreeOwnersAvailable", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "Landroidx/compose/ui/node/LayoutNode;", "o000oOoO", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroid/content/res/Configuration;", "OooooOo", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "configurationChangeObserver", "Landroidx/compose/ui/platform/OooOo00;", "OoooooO", "Landroidx/compose/ui/platform/OooOo00;", "getClipboardManager", "()Landroidx/compose/ui/platform/OooOo00;", "clipboardManager", "Landroidx/compose/ui/platform/OooOOOO;", "Ooooooo", "Landroidx/compose/ui/platform/OooOOOO;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/OooOOOO;", "accessibilityManager", "", "ooOO", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "", "o0ooOoO", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "<set-?>", "viewTreeOwners$delegate", "Lo000oOoO/o0O00OO;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$OooO0O0;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$OooO0O0;)V", "viewTreeOwners", "Lo00000oO/o000OOo$OooO0O0;", "fontFamilyResolver$delegate", "getFontFamilyResolver", "()Lo00000oO/o000OOo$OooO0O0;", "setFontFamilyResolver", "(Lo00000oO/o000OOo$OooO0O0;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection$delegate", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Lo000000/o00O0O;", "sharedDrawScope", "Lo000000/o00O0O;", "getSharedDrawScope", "()Lo000000/o00O0O;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Lo0000O0O/OooO;", "density", "Lo0000O0O/OooO;", "getDensity", "()Lo0000O0O/OooO;", "LooOO/o0ooOOo;", "getFocusManager", "()LooOO/o0ooOOo;", "focusManager", "Landroidx/compose/ui/platform/oo00oO;", "getWindowInfo", "()Landroidx/compose/ui/platform/oo00oO;", "windowInfo", "Lo000000/o0000O00;", "rootForTest", "Lo000000/o0000O00;", "getRootForTest", "()Lo000000/o0000O00;", "Lo00000O0/o00Ooo;", "semanticsOwner", "Lo00000O0/o00Ooo;", "getSemanticsOwner", "()Lo00000O0/o00Ooo;", "LOoooooo/o0O000Oo;", "autofillTree", "LOoooooo/o0O000Oo;", "getAutofillTree", "()LOoooooo/o0O000Oo;", "LOoooooo/o0O00000;", "getAutofill", "()LOoooooo/o0O00000;", "autofill", "Lo000000/o00000OO;", "snapshotObserver", "Lo000000/o00000OO;", "getSnapshotObserver", "()Lo000000/o00000OO;", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "Landroidx/compose/ui/platform/o00OOOOo;", "viewConfiguration", "Landroidx/compose/ui/platform/o00OOOOo;", "getViewConfiguration", "()Landroidx/compose/ui/platform/o00OOOOo;", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lo00000oo/o00OO000;", "textInputService", "Lo00000oo/o00OO000;", "getTextInputService", "()Lo00000oo/o00OO000;", "getTextInputService$annotations", "Lo00000oO/o0O0O00$OooO00o;", "fontLoader", "Lo00000oO/o0O0O00$OooO00o;", "getFontLoader", "()Lo00000oO/o0O0O00$OooO00o;", "getFontLoader$annotations", "Lo00oO0O/oo000o;", "hapticFeedBack", "Lo00oO0O/oo000o;", "getHapticFeedBack", "()Lo00oO0O/oo000o;", "Lo0ooOO0/o00O0;", "getInputModeManager", "()Lo0ooOO0/o00O0;", "inputModeManager", "Landroidx/compose/ui/platform/o00OO0OO;", "textToolbar", "Landroidx/compose/ui/platform/o00OO0OO;", "getTextToolbar", "()Landroidx/compose/ui/platform/o00OO0OO;", "Lo0Oo0oo/o0ooOOo;", "pointerIconService", "Lo0Oo0oo/o0ooOOo;", "getPointerIconService", "()Lo0Oo0oo/o0ooOOo;", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "OooO00o", "OooO0O0", "ui_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"ViewConstructor", "VisibleForTests"})
public final class AndroidComposeView extends ViewGroup implements o000000.o00000, o000000.o0000O00, p418o0Oo0oo.o0000oo, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f6196o0000OOO = new OooO00o();

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    @Nullable
    public static Class<?> f6197o0000OOo;

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    @Nullable
    public static Method f6198o0000Oo0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public o0000O0O.OooOO0 f6199Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f6200Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f6201Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o000000.o00O0O f6202Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final p048OoooooO.o00OOOO0 f6203OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final o0oOOo f6204OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final p710ooOO.o0OOO0o f6205OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final h f6206OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final p145o00Oo0.o000OOo f6207OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final AndroidComposeView f6208OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final o00000O0.o00Ooo f6209OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final o00Ooo f6210OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final p049Ooooooo.o0O000Oo f6211OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final List<o000000.o000000> f6212OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public List<o000000.o000000> f6213Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f6214Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final p418o0Oo0oo.Oooo0 f6215OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final p418o0Oo0oo.o000OOo f6216OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super Configuration, Unit> configurationChangeObserver;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f6218Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public final p049Ooooooo.o0 f6219Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.compose.ui.platform.OooOo00 clipboardManager;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.compose.ui.platform.OooOOOO accessibilityManager;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public long f6222o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    @NotNull
    public final p054o00000oo.o00OO000 f6223o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    @NotNull
    public final Oooo000 f6224o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    @NotNull
    public final Oooo0 f6225o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    @NotNull
    public final p054o00000oo.o00OO00O f6226o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f6227o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    @NotNull
    public final o00000O0 f6228o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public int f6229o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f6230o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    @NotNull
    public final p218o00oO0O.o00oO0o f6231o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    @NotNull
    public final o00000O f6232o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    @Nullable
    public MotionEvent f6233o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    @NotNull
    public final o0000O0 f6234o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    @NotNull
    public final o000oOoO f6235o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    @NotNull
    public final o0O00o0<o000000.o000000> f6236o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public boolean f6237o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    @NotNull
    public final OooOO0 f6238o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    @Nullable
    public p418o0Oo0oo.o00oO0o f6239o0000OO0;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    @NotNull
    public final p643o0ooOO0.o00O0O00 f6240o0000Ooo;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f6241o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    @NotNull
    public final p036OoooOOO.o000OOo<Function0<Unit>> f6242o0000oo;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f6243o000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    @NotNull
    public final OooOo f6244o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutNode root;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @Nullable
    public AndroidViewsHandler f6246o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public DrawChildContainer f6247o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @Nullable
    public o0000O0O.OooO0O0 f6248o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f6249o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @NotNull
    public final int[] f6250o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public long f6251o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @NotNull
    public final o000000.o0ooOOo f6252o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    @Nullable
    public Function1<? super OooO0O0, Unit> f6253o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public boolean f6254o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public boolean f6255o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public long f6256o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public final o000000.o00000OO f6257o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @NotNull
    public final float[] f6258o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @NotNull
    public final float[] f6259o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name and from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NotNull
    public final o0000oo f6261oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f6262oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    public static final class OooO extends Lambda implements Function1<f, Boolean> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(f fVar) {
            p710ooOO.o0OoOo0 o0oooo1;
            KeyEvent isShiftPressed = fVar.f51138OooO00o;
            Intrinsics.checkNotNullParameter(isShiftPressed, "it");
            Objects.requireNonNull(AndroidComposeView.this);
            Intrinsics.checkNotNullParameter(isShiftPressed, "keyEvent");
            long jOooO00o = g.OooO00o(isShiftPressed);
            e.OooO00o oooO00o = e.f51128OooO00o;
            if (e.OooO00o(jOooO00o, e.f51135OooO0oo)) {
                Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
                o0oooo1 = new p710ooOO.o0OoOo0(isShiftPressed.isShiftPressed() ? 2 : 1);
            } else if (e.OooO00o(jOooO00o, e.f51132OooO0o)) {
                o0oooo1 = new p710ooOO.o0OoOo0(4);
            } else if (e.OooO00o(jOooO00o, e.f51133OooO0o0)) {
                o0oooo1 = new p710ooOO.o0OoOo0(3);
            } else if (e.OooO00o(jOooO00o, e.f51130OooO0OO)) {
                o0oooo1 = new p710ooOO.o0OoOo0(5);
            } else if (e.OooO00o(jOooO00o, e.f51131OooO0Oo)) {
                o0oooo1 = new p710ooOO.o0OoOo0(6);
            } else {
                if (e.OooO00o(jOooO00o, e.f51134OooO0oO) ? true : e.OooO00o(jOooO00o, e.f51127OooO) ? true : e.OooO00o(jOooO00o, e.f51137OooOO0O)) {
                    o0oooo1 = new p710ooOO.o0OoOo0(7);
                } else {
                    o0oooo1 = e.OooO00o(jOooO00o, e.f51129OooO0O0) ? true : e.OooO00o(jOooO00o, e.f51136OooOO0) ? new p710ooOO.o0OoOo0(8) : null;
                }
            }
            if (o0oooo1 != null) {
                if (g.OooO0O0(isShiftPressed) == 2) {
                    return Boolean.valueOf(AndroidComposeView.this.getFocusManager().OooO00o(o0oooo1.f53495OooO00o));
                }
            }
            return Boolean.FALSE;
        }
    }

    public static final class OooO00o {
        public static final boolean OooO00o() {
            OooO00o oooO00o = AndroidComposeView.f6196o0000OOO;
            try {
                if (AndroidComposeView.f6197o0000OOo == null) {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.f6197o0000OOo = cls;
                    AndroidComposeView.f6198o0000Oo0 = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.f6198o0000Oo0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final LifecycleOwner f6265OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final p094o000o0OO.o00Oo0 f6266OooO0O0;

        public OooO0O0(@NotNull LifecycleOwner lifecycleOwner, @NotNull p094o000o0OO.o00Oo0 savedStateRegistryOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
            this.f6265OooO00o = lifecycleOwner;
            this.f6266OooO0O0 = savedStateRegistryOwner;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<p643o0ooOO0.oo00o, Boolean> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(p643o0ooOO0.oo00o oo00oVar) {
            int i = oo00oVar.f48882OooO00o;
            boolean zRequestFocusFromTouch = false;
            if (i == 1) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else {
                if (i == 2) {
                    zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true;
                }
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Configuration, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f6268Oooo0o = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Configuration configuration) {
            Configuration it = configuration;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 implements p418o0Oo0oo.o0ooOOo {
        public OooOO0() {
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int actionMasked;
            MotionEvent motionEvent = AndroidComposeView.this.f6233o00000oo;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                AndroidComposeView.this.f6222o0000 = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.post(androidComposeView.f6241o0000oO);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<oo0o0Oo.OooO0OO, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO f6271Oooo0o = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(oo0o0Oo.OooO0OO oooO0OO) {
            oo0o0Oo.OooO0OO it = oooO0OO;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    public static final class OooOOO0 implements Runnable {
        public OooOOO0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.f6233o00000oo;
            if (motionEvent != null) {
                boolean z = false;
                boolean z2 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (!z2 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z = true;
                }
                if (z) {
                    int i = (actionMasked == 7 || actionMasked == 9) ? 7 : 2;
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.Oooo0O0(motionEvent, i, androidComposeView.f6222o0000, false);
                }
            }
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<o00000O0.o0OO00O, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOOO f6273Oooo0o = new OooOOOO();

        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00000O0.o0OO00O o0oo00o2) {
            o00000O0.o0OO00O $receiver = o0oo00o2;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            Function0<? extends Unit> command = function0;
            Intrinsics.checkNotNullParameter(command, "command");
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                command.invoke();
            } else {
                Handler handler2 = AndroidComposeView.this.getHandler();
                if (handler2 != null) {
                    handler2.post(new o00O0O(command, 0));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.platform.OooOo] */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.compose.ui.platform.Oooo000] */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.compose.ui.platform.Oooo0] */
    public AndroidComposeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
        this.f6200Oooo0o = o00O0O.OooO.f30394OooO0o0;
        this.f6201Oooo0oO = true;
        this.f6202Oooo0oo = new o000000.o00O0O();
        this.f6199Oooo = (o0000O0O.OooOO0) o0000O0O.OooO00o.OooO00o(context);
        o00000O0.Oooo0.OooO00o oooO00o2 = o00000O0.Oooo0.f26939Oooo0oo;
        o00000O0.Oooo0 other = new o00000O0.Oooo0(o00000O0.Oooo0.f26938Oooo.addAndGet(1), false, OooOOOO.f6273Oooo0o);
        p710ooOO.o0OOO0o o0ooo0o2 = new p710ooOO.o0OOO0o();
        this.f6205OoooO00 = o0ooo0o2;
        this.f6204OoooO0 = new o0oOOo();
        h hVar = new h(new OooO(), null);
        this.f6206OoooO0O = hVar;
        OoooooO.o00OOOO0.OooO00o oooO00o3 = OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
        OooOOO onRotaryScrollEvent = OooOOO.f6271Oooo0o;
        p076o000OOo.OooOo00<p648o0ooOOo.d<oo0o0Oo.OooO0OO>> oooOo00 = oo0o0Oo.OooO00o.f53356OooO00o;
        Intrinsics.checkNotNullParameter(oooO00o3, "<this>");
        Intrinsics.checkNotNullParameter(onRotaryScrollEvent, "onRotaryScrollEvent");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        p048OoooooO.o00OOOO0 o00oooo0OooO00o = o00oOoo.OooO00o(oooO00o3, new p648o0ooOOo.d(new oo0o0Oo.OooO0O0(onRotaryScrollEvent), oo0o0Oo.OooO00o.f53356OooO00o));
        this.f6203OoooO = o00oooo0OooO00o;
        this.f6207OoooOO0 = new p145o00Oo0.o000OOo();
        LayoutNode layoutNode = new LayoutNode(false);
        layoutNode.OooO0Oo(o0O0O00.o000O00O.f35271OooO0O0);
        Intrinsics.checkNotNullParameter(other, "other");
        layoutNode.OooO0O0(p048OoooooO.o0o0Oo.OooO00o(other, o00oooo0OooO00o).OooOOoo(o0ooo0o2.f53492OooO0O0).OooOOoo(hVar));
        layoutNode.OooO0OO(getDensity());
        this.root = layoutNode;
        this.f6208OoooOOO = this;
        this.f6209OoooOOo = new o00000O0.o00Ooo(getRoot());
        o00Ooo o00ooo2 = new o00Ooo(this);
        this.f6210OoooOo0 = o00ooo2;
        this.f6211OoooOoO = new p049Ooooooo.o0O000Oo();
        this.f6212OoooOoo = new ArrayList();
        this.f6215OooooO0 = new p418o0Oo0oo.Oooo0();
        this.f6216OooooOO = new p418o0Oo0oo.o000OOo(getRoot());
        this.configurationChangeObserver = OooO0o.f6268Oooo0o;
        this.f6219Oooooo0 = OooOOo() ? new p049Ooooooo.o0(this, getF6211OoooOoO()) : null;
        this.clipboardManager = new androidx.compose.ui.platform.OooOo00(context);
        this.accessibilityManager = new androidx.compose.ui.platform.OooOOOO(context);
        this.f6257o0OoOo0 = new o000000.o00000OO(new OooOo00());
        this.f6252o00ooo = new o000000.o0ooOOo(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        this.f6261oo000o = new o0000oo(viewConfiguration);
        o0000O0O.OooOo.OooO00o oooO00o4 = o0000O0O.OooOo.f27310OooO0O0;
        this.f6251o00oO0o = o0000O0O.OooOo.f27311OooO0OO;
        this.f6250o00oO0O = new int[]{0, 0};
        this.f6258o0ooOO0 = p145o00Oo0.o0000O.OooO00o();
        this.f6259o0ooOOo = p145o00Oo0.o0000O.OooO00o();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.f6256o0Oo0oo = o00O0O.OooO.f30393OooO0Oo;
        this.f6254o0OO00O = true;
        this.f6262oo0o0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f6244o000OOo = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.OooOo
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView this$0 = this.f6301Oooo0o;
                AndroidComposeView.OooO00o oooO00o5 = AndroidComposeView.f6196o0000OOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo0OO();
            }
        };
        this.f6224o000000 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.Oooo000
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView this$0 = this.f6304Oooo0o;
                AndroidComposeView.OooO00o oooO00o5 = AndroidComposeView.f6196o0000OOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo0OO();
            }
        };
        this.f6225o000000O = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.Oooo0
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView this$0 = this.f6303Oooo0o;
                AndroidComposeView.OooO00o oooO00o5 = AndroidComposeView.f6196o0000OOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f6240o0000Ooo.f48881OooO0O0.setValue(new p643o0ooOO0.oo00o(z ? 1 : 2));
                p710ooOO.o0Oo0oo.OooO0O0(this$0.f6205OoooO00.f53491OooO00o);
            }
        };
        p054o00000oo.o00OO00O o00oo00o = new p054o00000oo.o00OO00O(this);
        this.f6226o000000o = o00oo00o;
        Function1<? super p054o00000oo.o00O0O0O, ? extends p054o00000oo.o00OO000> function3 = oo0o0Oo.f6644OooO00o;
        this.f6223o00000 = (p054o00000oo.o00OO000) oo0o0Oo.f6644OooO00o.invoke(o00oo00o);
        this.f6228o00000O0 = new o00000O0(context);
        this.f6227o00000O = (ParcelableSnapshotMutableState) o0OOO00.OooO0OO(p053o00000oO.o00000O0.OooO00o(context), o0OO000.f29595OooO00o);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        this.f6229o00000OO = OooOo0O(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "context.resources.configuration");
        Intrinsics.checkNotNullParameter(configuration2, "<this>");
        int layoutDirection = configuration2.getLayoutDirection();
        LayoutDirection layoutDirection2 = (layoutDirection == 0 || layoutDirection != 1) ? LayoutDirection.Ltr : LayoutDirection.Rtl;
        this.f6230o00000Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(layoutDirection2);
        this.f6231o00000o0 = new p218o00oO0O.o00oO0o(this);
        this.f6240o0000Ooo = new p643o0ooOO0.o00O0O00(isInTouchMode() ? 1 : 2, new OooO0OO(), null);
        this.f6232o00000oO = new o00000O(this);
        this.f6236o0000O00 = new o0O00o0<>();
        this.f6242o0000oo = new p036OoooOOO.o000OOo<>(new Function0[16]);
        this.f6241o0000oO = new OooOOO0();
        this.f6235o0000O0 = new o000oOoO(this, 0);
        this.f6243o000OO = new OooOO0O();
        int i = Build.VERSION.SDK_INT;
        this.f6234o0000O = i >= 29 ? new o000OO() : new o0000O0O();
        setWillNotDraw(false);
        setFocusable(true);
        if (i >= 26) {
            o0OO00O.f6615OooO00o.OooO00o(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        ViewCompat.OooOo0o(this, o00ooo2);
        getRoot().OooOO0(this);
        if (i >= 29) {
            o0OOO0o.f6616OooO00o.OooO00o(this);
        }
        this.f6238o0000OO = new OooOO0();
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private void setFontFamilyResolver(o00000oO.o000OOo.OooO0O0 oooO0O0) {
        this.f6227o00000O.setValue(oooO0O0);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.f6230o00000Oo.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(OooO0O0 oooO0O0) {
        this.f6262oo0o0Oo.setValue(oooO0O0);
    }

    @Override // o000000.o00000
    public final void OooO(@NotNull LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.f6252o00ooo.OooO(layoutNode, z)) {
            Oooo00o(null);
        }
    }

    @Override // o000000.o00000
    public final void OooO00o(boolean z) {
        Function0<Unit> function0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                function0 = this.f6243o000OO;
            } finally {
                Trace.endSection();
            }
        } else {
            function0 = null;
        }
        if (this.f6252o00ooo.OooO0o(function0)) {
            requestLayout();
        }
        this.f6252o00ooo.OooO0O0(false);
        Unit unit = Unit.INSTANCE;
    }

    @Override // o000000.o00000
    public final void OooO0O0(@NotNull LayoutNode layoutNode, long j) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f6252o00ooo.OooO0oO(layoutNode, j);
            this.f6252o00ooo.OooO0O0(false);
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // o000000.o00000
    public final void OooO0OO(@NotNull o000000.o00000.OooO00o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000000.o0ooOOo o0ooooo2 = this.f6252o00ooo;
        Objects.requireNonNull(o0ooooo2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o0ooooo2.f26691OooO0o0.OooO0O0(listener);
        Oooo00o(null);
    }

    @Override // o000000.o00000
    public final long OooO0Oo(long j) {
        OooOooo();
        return p145o00Oo0.o0000O.OooO0O0(this.f6258o0ooOO0, j);
    }

    @Override // o000000.o00000
    public final void OooO0o(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        o00Ooo o00ooo2 = this.f6210OoooOo0;
        Objects.requireNonNull(o00ooo2);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        o00ooo2.f6528OooOOOo = true;
        if (o00ooo2.OooOOoo()) {
            o00ooo2.OooOo00(layoutNode);
        }
    }

    @Override // o000000.o00000
    public final long OooO0o0(long j) {
        OooOooo();
        return p145o00Oo0.o0000O.OooO0O0(this.f6259o0ooOOo, j);
    }

    @Override // o000000.o00000
    public final void OooO0oO(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f6252o00ooo.OooO0Oo(layoutNode);
    }

    @Override // o000000.o00000
    public final void OooO0oo(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        o000000.o0ooOOo o0ooooo2 = this.f6252o00ooo;
        Objects.requireNonNull(o0ooooo2);
        Intrinsics.checkNotNullParameter(node, "node");
        o0ooooo2.f26687OooO0O0.OooO0OO(node);
        this.f6218Oooooo = true;
    }

    @Override // p418o0Oo0oo.o0000oo
    public final long OooOO0(long j) {
        OooOooo();
        long jOooO0O0 = p145o00Oo0.o0000O.OooO0O0(this.f6258o0ooOO0, j);
        return o00O0O.OooOO0.OooO00o(o00O0O.OooO.OooO0OO(this.f6256o0Oo0oo) + o00O0O.OooO.OooO0OO(jOooO0O0), o00O0O.OooO.OooO0Oo(this.f6256o0Oo0oo) + o00O0O.OooO.OooO0Oo(jOooO0O0));
    }

    @Override // o000000.o00000
    @NotNull
    public final o000000.o000000 OooOO0O(@NotNull Function1<? super p145o00Oo0.o0O0O00, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        o000000.o000000 o000000Var;
        DrawChildContainer viewLayerContainer;
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        o0O00o0<o000000.o000000> o0o00o1 = this.f6236o0000O00;
        o0o00o1.OooO00o();
        do {
            if (!o0o00o1.f6588OooO00o.OooOO0()) {
                o000000Var = null;
                break;
            }
            p036OoooOOO.o000OOo<Reference<o000000.o000000>> o000ooo2 = o0o00o1.f6588OooO00o;
            o000000Var = o000ooo2.OooOOO0(o000ooo2.f3664Oooo0oo - 1).get();
        } while (o000000Var == null);
        o000000.o000000 o000000Var2 = o000000Var;
        if (o000000Var2 != null) {
            o000000Var2.OooO0O0(drawBlock, invalidateParentLayer);
            return o000000Var2;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.f6254o0OO00O) {
            try {
                return new oo0o0O0(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.f6254o0OO00O = false;
            }
        }
        if (this.f6247o00Oo0 == null) {
            ViewLayer.OooO0OO oooO0OO = ViewLayer.f6305OoooOo0;
            if (!ViewLayer.f6310OooooO0) {
                oooO0OO.OooO00o(new View(getContext()));
            }
            if (ViewLayer.f6311OooooOO) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                viewLayerContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                viewLayerContainer = new ViewLayerContainer(context2);
            }
            this.f6247o00Oo0 = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.f6247o00Oo0;
        Intrinsics.checkNotNull(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, drawBlock, invalidateParentLayer);
    }

    @Override // o000000.o00000
    public final void OooOO0o(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f6242o0000oo.OooO0o(listener)) {
            return;
        }
        this.f6242o0000oo.OooO0O0(listener);
    }

    @Override // o000000.o00000
    public final void OooOOO() {
        o00Ooo o00ooo2 = this.f6210OoooOo0;
        o00ooo2.f6528OooOOOo = true;
        if (!o00ooo2.OooOOoo() || o00ooo2.f6535OooOo0O) {
            return;
        }
        o00ooo2.f6535OooOo0O = true;
        o00ooo2.f6520OooO0oO.post(o00ooo2.f6536OooOo0o);
    }

    @Override // o000000.o00000
    public final void OooOOO0() {
        if (this.f6218Oooooo) {
            p047Oooooo0.o00OOO0 o00ooo1 = getF6257o0OoOo0().f26627OooO00o;
            o000000.o00000O predicate = o000000.o00000O.f26626Oooo0o;
            Objects.requireNonNull(o00ooo1);
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            synchronized (o00ooo1.f4115OooO0Oo) {
                p036OoooOOO.o000OOo<Oooooo0.o00OOO0.OooO00o<?>> o000ooo2 = o00ooo1.f4115OooO0Oo;
                int i = o000ooo2.f3664Oooo0oo;
                if (i > 0) {
                    Oooooo0.o00OOO0.OooO00o<?>[] oooO00oArr = o000ooo2.f3662Oooo0o;
                    int i2 = 0;
                    while (true) {
                        p036OoooOOO.o0O0O00<?> o0o0o00 = oooO00oArr[i2].f4120OooO0O0;
                        int i3 = o0o0o00.f3674OooO0Oo;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i3) {
                            int i6 = o0o0o00.f3671OooO00o[i4];
                            p036OoooOOO.oo0o0Oo<?> oo0o0oo = o0o0o00.f3673OooO0OO[i6];
                            Intrinsics.checkNotNull(oo0o0oo);
                            int i7 = oo0o0oo.f3681Oooo0o;
                            int i8 = 0;
                            int i9 = 0;
                            while (i9 < i7) {
                                Object obj = oo0o0oo.f3682Oooo0oO[i9];
                                if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                }
                                if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                                    oooO00oArr = oooO00oArr;
                                } else {
                                    if (i8 != i9) {
                                        oo0o0oo.f3682Oooo0oO[i8] = obj;
                                    }
                                    i8++;
                                }
                                i9++;
                                oooO00oArr = oooO00oArr;
                            }
                            Oooooo0.o00OOO0.OooO00o<?>[] oooO00oArr2 = oooO00oArr;
                            int i10 = oo0o0oo.f3681Oooo0o;
                            for (int i11 = i8; i11 < i10; i11++) {
                                oo0o0oo.f3682Oooo0oO[i11] = null;
                            }
                            oo0o0oo.f3681Oooo0o = i8;
                            if (i8 > 0) {
                                if (i5 != i4) {
                                    int[] iArr = o0o0o00.f3671OooO00o;
                                    int i12 = iArr[i5];
                                    iArr[i5] = i6;
                                    iArr[i4] = i12;
                                }
                                i5++;
                            }
                            i4++;
                            oooO00oArr = oooO00oArr2;
                        }
                        Oooooo0.o00OOO0.OooO00o<?>[] oooO00oArr3 = oooO00oArr;
                        int i13 = o0o0o00.f3674OooO0Oo;
                        for (int i14 = i5; i14 < i13; i14++) {
                            o0o0o00.f3672OooO0O0[o0o0o00.f3671OooO00o[i14]] = null;
                        }
                        o0o0o00.f3674OooO0Oo = i5;
                        i2++;
                        if (i2 >= i) {
                            break;
                        } else {
                            oooO00oArr = oooO00oArr3;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            this.f6218Oooooo = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f6246o00O0O;
        if (androidViewsHandler != null) {
            OooOOoo(androidViewsHandler);
        }
        while (this.f6242o0000oo.OooOO0()) {
            int i15 = this.f6242o0000oo.f3664Oooo0oo;
            for (int i16 = 0; i16 < i15; i16++) {
                Function0<Unit>[] function0Arr = this.f6242o0000oo.f3662Oooo0o;
                Function0<Unit> function0 = function0Arr[i16];
                Function0<Unit> function1 = function0Arr[i16];
                function0Arr[i16] = null;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            p036OoooOOO.o000OOo<Function0<Unit>> o000ooo3 = this.f6242o0000oo;
            Objects.requireNonNull(o000ooo3);
            if (i15 > 0) {
                int i17 = o000ooo3.f3664Oooo0oo;
                if (i15 < i17) {
                    Function0<Unit>[] function0Arr2 = o000ooo3.f3662Oooo0o;
                    ArraysKt.copyInto(function0Arr2, function0Arr2, 0, i15, i17);
                }
                int i18 = o000ooo3.f3664Oooo0oo;
                int i19 = i18 - (i15 + 0);
                int i20 = i18 - 1;
                if (i19 <= i20) {
                    int i21 = i19;
                    while (true) {
                        o000ooo3.f3662Oooo0o[i21] = null;
                        if (i21 == i20) {
                            break;
                        } else {
                            i21++;
                        }
                    }
                }
                o000ooo3.f3664Oooo0oo = i19;
            }
        }
    }

    @Override // p418o0Oo0oo.o0000oo
    public final long OooOOOO(long j) {
        OooOooo();
        return p145o00Oo0.o0000O.OooO0O0(this.f6259o0ooOOo, o00O0O.OooOO0.OooO00o(o00O0O.OooO.OooO0OO(j) - o00O0O.OooO.OooO0OO(this.f6256o0Oo0oo), o00O0O.OooO.OooO0Oo(j) - o00O0O.OooO.OooO0Oo(this.f6256o0Oo0oo)));
    }

    @Override // o000000.o00000
    public final void OooOOOo(@NotNull LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.f6252o00ooo.OooOO0(layoutNode, z)) {
            Oooo00o(layoutNode);
        }
    }

    public final boolean OooOOo() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Override // o000000.o00000
    public final void OooOOo0(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
    }

    public final void OooOOoo(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).OooOOO0();
            } else if (childAt instanceof ViewGroup) {
                OooOOoo((ViewGroup) childAt);
            }
        }
    }

    public final boolean OooOo(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    public final View OooOo0(int i, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (Intrinsics.areEqual(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "currentView.getChildAt(i)");
            View viewOooOo0 = OooOo0(i, childAt);
            if (viewOooOo0 != null) {
                return viewOooOo0;
            }
        }
        return null;
    }

    public final Pair<Integer, Integer> OooOo00(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return TuplesKt.to(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return TuplesKt.to(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return TuplesKt.to(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public final int OooOo0O(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    public final int OooOo0o(MotionEvent motionEvent) {
        int actionMasked;
        removeCallbacks(this.f6241o0000oO);
        try {
            Oooo000(motionEvent);
            boolean z = true;
            this.f6255o0OOO0o = true;
            OooO00o(false);
            this.f6239o0000OO0 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f6233o00000oo;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && OooOo(motionEvent, motionEvent2)) {
                    if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        this.f6216OooooOO.OooO0O0();
                    } else if (motionEvent2.getActionMasked() != 10 && z2) {
                        Oooo0O0(motionEvent2, 10, motionEvent2.getEventTime(), true);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z = false;
                }
                if (!z2 && z && actionMasked2 != 3 && actionMasked2 != 9 && OooOoo0(motionEvent)) {
                    Oooo0O0(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f6233o00000oo = MotionEvent.obtainNoHistory(motionEvent);
                int iOooo0 = Oooo0(motionEvent);
                Trace.endSection();
                if (Build.VERSION.SDK_INT >= 24) {
                    o0Oo0oo.f6617OooO00o.OooO00o(this, this.f6239o0000OO0);
                }
                this.f6255o0OOO0o = false;
                return iOooo0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            this.f6255o0OOO0o = false;
            throw th2;
        }
    }

    public final void OooOoO(LayoutNode layoutNode) {
        int i = 0;
        this.f6252o00ooo.OooOO0(layoutNode, false);
        p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo0 = layoutNode.OooOo0();
        int i2 = o000oooOooOo0.f3664Oooo0oo;
        if (i2 > 0) {
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            do {
                OooOoO(layoutNodeArr[i]);
                i++;
            } while (i < i2);
        }
    }

    public final void OooOoO0(LayoutNode layoutNode) {
        layoutNode.OooOoO();
        p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo0 = layoutNode.OooOo0();
        int i = o000oooOooOo0.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            do {
                OooOoO0(layoutNodeArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    public final boolean OooOoOO(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (!((Float.isInfinite(x) || Float.isNaN(x)) ? false : true)) {
            return true;
        }
        float y = motionEvent.getY();
        if (!((Float.isInfinite(y) || Float.isNaN(y)) ? false : true)) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (!((Float.isInfinite(rawX) || Float.isNaN(rawX)) ? false : true)) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        return !(!Float.isInfinite(rawY) && !Float.isNaN(rawY));
    }

    public final boolean OooOoo(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f6233o00000oo) == null) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
        }
        return true;
    }

    public final boolean OooOoo0(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE <= x && x <= ((float) getWidth())) {
            if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE <= y && y <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList, java.util.List<o000000.o000000>] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.List<o000000.o000000>] */
    public final void OooOooO(@NotNull o000000.o000000 layer, boolean z) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (!z) {
            if (!this.f6214Ooooo0o && !this.f6212OoooOoo.remove(layer)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            if (!this.f6214Ooooo0o) {
                this.f6212OoooOoo.add(layer);
                return;
            }
            List arrayList = this.f6213Ooooo00;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f6213Ooooo00 = arrayList;
            }
            arrayList.add(layer);
        }
    }

    public final void OooOooo() {
        if (this.f6255o0OOO0o) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            this.f6234o0000O.OooO00o(this, this.f6258o0ooOO0);
            o00O00O.OooO00o(this.f6258o0ooOO0, this.f6259o0ooOOo);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.f6250o00oO0O);
            int[] iArr = this.f6250o00oO0O;
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.f6250o00oO0O;
            this.f6256o0Oo0oo = o00O0O.OooOO0.OooO00o(f - iArr2[0], f2 - iArr2[1]);
        }
    }

    public final int Oooo0(MotionEvent motionEvent) {
        p418o0Oo0oo.o0O0O00 o0o0o00Previous;
        p418o0Oo0oo.oo0o0Oo oo0o0ooOooO00o = this.f6215OooooO0.OooO00o(motionEvent, this);
        if (oo0o0ooOooO00o == null) {
            this.f6216OooooOO.OooO0O0();
            return p418o0Oo0oo.o0000.OooO00o(false, false);
        }
        List<p418o0Oo0oo.o0O0O00> list = oo0o0ooOooO00o.f39760OooO00o;
        ListIterator<p418o0Oo0oo.o0O0O00> listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                o0o0o00Previous = null;
                break;
            }
            o0o0o00Previous = listIterator.previous();
        } while (!o0o0o00Previous.f39733OooO0o0);
        p418o0Oo0oo.o0O0O00 o0o0o00 = o0o0o00Previous;
        if (o0o0o00 != null) {
            this.f6200Oooo0o = o0o0o00.f39731OooO0Oo;
        }
        int iOooO00o = this.f6216OooooOO.OooO00o(oo0o0ooOooO00o, this, OooOoo0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || p418o0Oo0oo.o0000O0.OooO00o(iOooO00o)) {
            return iOooO00o;
        }
        p418o0Oo0oo.Oooo0 oooo0 = this.f6215OooooO0;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        oooo0.f39661OooO0OO.delete(pointerId);
        oooo0.f39660OooO0O0.delete(pointerId);
        return iOooO00o;
    }

    public final void Oooo000(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        this.f6234o0000O.OooO00o(this, this.f6258o0ooOO0);
        o00O00O.OooO00o(this.f6258o0ooOO0, this.f6259o0ooOOo);
        long jOooO0O0 = p145o00Oo0.o0000O.OooO0O0(this.f6258o0ooOO0, o00O0O.OooOO0.OooO00o(motionEvent.getX(), motionEvent.getY()));
        this.f6256o0Oo0oo = o00O0O.OooOO0.OooO00o(motionEvent.getRawX() - o00O0O.OooO.OooO0OO(jOooO0O0), motionEvent.getRawY() - o00O0O.OooO.OooO0Oo(jOooO0O0));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public final boolean Oooo00O(@NotNull o000000.o000000 layer) {
        boolean z;
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (this.f6247o00Oo0 != null) {
            ViewLayer.OooO0OO oooO0OO = ViewLayer.f6305OoooOo0;
            if (ViewLayer.f6311OooooOO || Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                o0O00o0<o000000.o000000> o0o00o1 = this.f6236o0000O00;
                o0o00o1.OooO00o();
                if (o0o00o1.f6588OooO00o.f3664Oooo0oo < 10) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = true;
        }
        if (z) {
            o0O00o0<o000000.o000000> o0o00o2 = this.f6236o0000O00;
            o0o00o2.OooO00o();
            o0o00o2.f6588OooO00o.OooO0O0(new WeakReference(layer, o0o00o2.f6589OooO0O0));
        }
        return z;
    }

    public final void Oooo00o(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.f6249o00o0O && layoutNode != null) {
            while (layoutNode != null && layoutNode.f6174o0OoOo0 == LayoutNode.UsageByParent.InMeasureBlock) {
                layoutNode = layoutNode.OooOOoo();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void Oooo0O0(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            long jOooOO0 = OooOO0(o00O0O.OooOO0.OooO00o(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = o00O0O.OooO.OooO0OO(jOooOO0);
            pointerCoords.y = o00O0O.OooO.OooO0Oo(jOooOO0);
            i4++;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        p418o0Oo0oo.Oooo0 oooo0 = this.f6215OooooO0;
        Intrinsics.checkNotNullExpressionValue(event, "event");
        p418o0Oo0oo.oo0o0Oo oo0o0ooOooO00o = oooo0.OooO00o(event, this);
        Intrinsics.checkNotNull(oo0o0ooOooO00o);
        this.f6216OooooOO.OooO00o(oo0o0ooOooO00o, this, true);
        event.recycle();
    }

    public final void Oooo0OO() {
        getLocationOnScreen(this.f6250o00oO0O);
        long j = this.f6251o00oO0o;
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        boolean z = false;
        if (((int) (j >> 32)) != this.f6250o00oO0O[0] || o0000O0O.OooOo.OooO0OO(j) != this.f6250o00oO0O[1]) {
            int[] iArr = this.f6250o00oO0O;
            this.f6251o00oO0o = o0000O0O.Oooo000.OooO00o(iArr[0], iArr[1]);
            z = true;
        }
        this.f6252o00ooo.OooO0O0(z);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, Ooooooo.o0OoOoOo>] */
    @Override // android.view.View
    public final void autofill(@NotNull SparseArray<AutofillValue> values) {
        p049Ooooooo.o0 o0Var;
        Intrinsics.checkNotNullParameter(values, "values");
        if (!OooOOo() || (o0Var = this.f6219Oooooo0) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        int size = values.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = values.keyAt(i);
            AutofillValue value = values.get(iKeyAt);
            p049Ooooooo.o0O000 o0o001 = p049Ooooooo.o0O000.f4211OooO00o;
            Intrinsics.checkNotNullExpressionValue(value, "value");
            if (o0o001.OooO0Oo(value)) {
                p049Ooooooo.o0O000Oo o0o000oo2 = o0Var.f4209OooO0O0;
                String value2 = o0o001.OooO(value).toString();
                Objects.requireNonNull(o0o000oo2);
                Intrinsics.checkNotNullParameter(value2, "value");
            } else {
                if (o0o001.OooO0O0(value)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (o0o001.OooO0OO(value)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (o0o001.OooO0o0(value)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f6210OoooOo0.OooOO0O(false, i, this.f6200Oooo0o);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f6210OoooOo0.OooOO0O(true, i, this.f6200Oooo0o);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            OooOoO0(getRoot());
        }
        int i = o000000.o000000O.f26625OooO00o;
        OooO00o(true);
        this.f6214Ooooo0o = true;
        p145o00Oo0.o000OOo o000ooo2 = this.f6207OoooOO0;
        p145o00Oo0.OooOOO oooOOO = o000ooo2.f32110OooO00o;
        Canvas canvas2 = oooOOO.f32046OooO00o;
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        oooOOO.f32046OooO00o = canvas;
        p145o00Oo0.OooOOO canvas3 = o000ooo2.f32110OooO00o;
        LayoutNode root = getRoot();
        Objects.requireNonNull(root);
        Intrinsics.checkNotNullParameter(canvas3, "canvas");
        root.f6166o00o0O.f26635OoooO0.o000OOo(canvas3);
        o000ooo2.f32110OooO00o.OooOo0O(canvas2);
        if (!this.f6212OoooOoo.isEmpty()) {
            int size = this.f6212OoooOoo.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f6212OoooOoo.get(i2).OooO0oo();
            }
        }
        ViewLayer.OooO0OO oooO0OO = ViewLayer.f6305OoooOo0;
        if (ViewLayer.f6311OooooOO) {
            int iSave = canvas.save();
            canvas.clipRect(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.f6212OoooOoo.clear();
        this.f6214Ooooo0o = false;
        List<o000000.o000000> list = this.f6213Ooooo00;
        if (list != 0) {
            Intrinsics.checkNotNull(list);
            this.f6212OoooOoo.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(event);
        }
        if (!event.isFromSource(4194304)) {
            return (OooOoOO(event) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(event) : p418o0Oo0oo.o0000O0.OooO00o(OooOo0o(event));
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = -event.getAxisValue(26);
        Context context = getContext();
        Method method = o000O0O0.o000OOo.f28122OooO00o;
        int i = Build.VERSION.SDK_INT;
        oo0o0Oo.OooO0OO event2 = new oo0o0Oo.OooO0OO((i >= 26 ? o000O0O0.o000OOo.OooO00o.OooO0O0(viewConfiguration) : o000O0O0.o000OOo.OooO00o(viewConfiguration, context)) * f, f * (i >= 26 ? o000O0O0.o000OOo.OooO00o.OooO00o(viewConfiguration) : o000O0O0.o000OOo.OooO00o(viewConfiguration, getContext())), event.getEventTime());
        p710ooOO.o0OO00O o0oo00oOooO00o = p710ooOO.o0Oo0oo.OooO00o(this.f6205OoooO00.f53491OooO00o);
        if (o0oo00oOooO00o == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(event2, "event");
        p648o0ooOOo.d<oo0o0Oo.OooO0OO> dVar = o0oo00oOooO00o.f53481OoooO0O;
        if (dVar == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(event2, "event");
        return dVar.OooO0O0(event2) || dVar.OooO00o(event2);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        if (r0 == Integer.MIN_VALUE) goto L27;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        int iOooOoO0;
        boolean zDispatchGenericMotionEvent;
        LayoutNode layoutNode;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f6237o0000O0O) {
            removeCallbacks(this.f6235o0000O0);
            this.f6235o0000O0.run();
        }
        if (OooOoOO(event) || !isAttachedToWindow()) {
            return false;
        }
        if (!event.isFromSource(o.a.b) || event.getToolType(0) != 1) {
            int actionMasked = event.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && OooOoo0(event)) {
                    if (event.getToolType(0) != 3) {
                        MotionEvent motionEvent = this.f6233o00000oo;
                        if (motionEvent != null) {
                            motionEvent.recycle();
                        }
                        this.f6233o00000oo = MotionEvent.obtainNoHistory(event);
                        this.f6237o0000O0O = true;
                        post(this.f6235o0000O0);
                        return false;
                    }
                    if (event.getButtonState() != 0) {
                        return false;
                    }
                }
            } else if (!OooOoo(event)) {
                return false;
            }
            return p418o0Oo0oo.o0000O0.OooO00o(OooOo0o(event));
        }
        o00Ooo o00ooo2 = this.f6210OoooOo0;
        Objects.requireNonNull(o00ooo2);
        Intrinsics.checkNotNullParameter(event, "event");
        if (!o00ooo2.OooOOoo()) {
            return false;
        }
        int action = event.getAction();
        if (action != 7 && action != 9) {
            if (action != 10) {
                return false;
            }
            if (o00ooo2.f6519OooO0o0 != Integer.MIN_VALUE) {
                o00ooo2.Oooo0O0(Integer.MIN_VALUE);
                return true;
            }
            zDispatchGenericMotionEvent = o00ooo2.f6517OooO0Oo.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            return zDispatchGenericMotionEvent;
        }
        float x = event.getX();
        float y = event.getY();
        AndroidComposeView androidComposeView = o00ooo2.f6517OooO0Oo;
        o00000O0.OooOo outerSemanticsEntity = null;
        int i = o000000.o000000O.f26625OooO00o;
        androidComposeView.OooO00o(true);
        o000000.OooOOO0 oooOOO0 = new o000000.OooOOO0();
        LayoutNode root = o00ooo2.f6517OooO0Oo.getRoot();
        long jOooO00o = o00O0O.OooOO0.OooO00o(x, y);
        LayoutNode.OooOO0 oooOO1 = LayoutNode.f6131o000000o;
        root.OooOo0o(jOooO00o, oooOOO0, true);
        o00000O0.OooOo oooOo = (o00000O0.OooOo) CollectionsKt.lastOrNull((List) oooOOO0);
        if (oooOo != null && (layoutNode = oooOo.f26652Oooo0o.f26702OoooO00) != null) {
            outerSemanticsEntity = o00000O0.o00Oo0.OooO0Oo(layoutNode);
        }
        if (outerSemanticsEntity != null) {
            Intrinsics.checkNotNullParameter(outerSemanticsEntity, "outerSemanticsEntity");
            o00000O0.OooOOOO oooOOOOOooO0OO = outerSemanticsEntity.OooO0OO();
            ((o00000O0.Oooo000) outerSemanticsEntity.f26653Oooo0oO).getId();
            o000000.oo000o oo000oVar = outerSemanticsEntity.f26652Oooo0o;
            LayoutNode layoutNode2 = oo000oVar.f26702OoooO00;
            if (oooOOOOOooO0OO.f26935Oooo0oO) {
                o00000O0.OooOo oooOoOooO0OO = o00000O0.o00Oo0.OooO0OO(layoutNode2);
                if (oooOoOooO0OO == null) {
                    oooOoOooO0OO = outerSemanticsEntity;
                }
                oo000oVar = oooOoOooO0OO.f26652Oooo0o;
            }
            o00000O0.oo000o oo000oVar2 = o00000O0.oo000o.f26973OooO00o;
            if (oooOOOOOooO0OO.OooO0O0(o00000O0.oo000o.f26985OooOOO0) || oo000oVar.o0000O00() || o00ooo2.f6517OooO0Oo.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(outerSemanticsEntity.f26652Oooo0o.f26702OoooO00) != null) {
                iOooOoO0 = Integer.MIN_VALUE;
            } else {
                iOooOoO0 = o00ooo2.OooOoO0(((o00000O0.Oooo000) outerSemanticsEntity.f26653Oooo0oO).getId());
            }
        } else {
            iOooOoO0 = Integer.MIN_VALUE;
        }
        zDispatchGenericMotionEvent = o00ooo2.f6517OooO0Oo.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        o00ooo2.Oooo0O0(iOooOoO0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@NotNull KeyEvent keyEvent) {
        p710ooOO.o0OO00O o0oo00oOooO0O0;
        LayoutNode layoutNode;
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        Intrinsics.checkNotNullParameter(keyEvent, "nativeKeyEvent");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        h hVar = this.f6206OoooO0O;
        Objects.requireNonNull(hVar);
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        p710ooOO.o0OO00O o0oo00o2 = hVar.f51142Oooo0oo;
        if (o0oo00o2 != null && (o0oo00oOooO0O0 = p710ooOO.o0000O0O.OooO0O0(o0oo00o2)) != null) {
            Intrinsics.checkNotNullParameter(o0oo00oOooO0O0, "<this>");
            o000000.oo000o oo000oVar = o0oo00oOooO0O0.f53485OoooOo0;
            h hVar2 = null;
            if (oo000oVar != null && (layoutNode = oo000oVar.f26702OoooO00) != null) {
                p036OoooOOO.o000OOo<h> o000ooo2 = o0oo00oOooO0O0.f53488Ooooo00;
                int i = o000ooo2.f3664Oooo0oo;
                if (i > 0) {
                    int i2 = 0;
                    h[] hVarArr = o000ooo2.f3662Oooo0o;
                    do {
                        h hVar3 = hVarArr[i2];
                        if (Intrinsics.areEqual(hVar3.f51143OoooO00, layoutNode)) {
                            if (hVar2 == null) {
                                hVar2 = hVar3;
                                break;
                            }
                            LayoutNode layoutNode2 = hVar3.f51143OoooO00;
                            h hVar4 = hVar2;
                            while (!Intrinsics.areEqual(hVar4, hVar3)) {
                                hVar4 = hVar4.f51139Oooo;
                                if (hVar4 == null || !Intrinsics.areEqual(hVar4.f51143OoooO00, layoutNode2)) {
                                    hVar2 = hVar3;
                                    break;
                                }
                            }
                        }
                        i2++;
                    } while (i2 < i);
                }
                if (hVar2 == null) {
                    hVar2 = o0oo00oOooO0O0.f53487OoooOoo;
                }
            }
            if (hVar2 != null) {
                if (hVar2.OooO0O0(keyEvent)) {
                    return true;
                }
                return hVar2.OooO00o(keyEvent);
            }
        }
        throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.f6237o0000O0O) {
            removeCallbacks(this.f6235o0000O0);
            MotionEvent motionEvent2 = this.f6233o00000oo;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || OooOo(motionEvent, motionEvent2)) {
                this.f6235o0000O0.run();
            } else {
                this.f6237o0000O0O = false;
            }
        }
        if (OooOoOO(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !OooOoo(motionEvent)) {
            return false;
        }
        int iOooOo0o = OooOo0o(motionEvent);
        if ((iOooOo0o & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return p418o0Oo0oo.o0000O0.OooO00o(iOooOo0o);
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        View viewOooOo0 = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
                if (objInvoke instanceof View) {
                    viewOooOo0 = (View) objInvoke;
                }
            } else {
                viewOooOo0 = OooOo0(accessibilityId, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewOooOo0;
    }

    @NotNull
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.f6246o00O0O == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this.f6246o00O0O = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this.f6246o00O0O;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // o000000.o00000
    @Nullable
    public p049Ooooooo.o0O00000 getAutofill() {
        return this.f6219Oooooo0;
    }

    @Override // o000000.o00000
    @NotNull
    /* JADX INFO: renamed from: getAutofillTree, reason: from getter */
    public p049Ooooooo.o0O000Oo getF6211OoooOoO() {
        return this.f6211OoooOoO;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Override // o000000.o00000
    @NotNull
    public o0000O0O.OooO getDensity() {
        return this.f6199Oooo;
    }

    @Override // o000000.o00000
    @NotNull
    public p710ooOO.o0ooOOo getFocusManager() {
        return this.f6205OoooO00;
    }

    @Override // android.view.View
    public final void getFocusedRect(@NotNull Rect rect) {
        Unit unit;
        Intrinsics.checkNotNullParameter(rect, "rect");
        p710ooOO.o0OO00O o0oo00oOooO00o = p710ooOO.o0Oo0oo.OooO00o(this.f6205OoooO00.f53491OooO00o);
        if (o0oo00oOooO00o != null) {
            o00O0O.OooOO0O oooOO0OOooO0Oo = p710ooOO.o0000O0O.OooO0Oo(o0oo00oOooO00o);
            rect.left = MathKt.roundToInt(oooOO0OOooO0Oo.f30404OooO00o);
            rect.top = MathKt.roundToInt(oooOO0OOooO0Oo.f30405OooO0O0);
            rect.right = MathKt.roundToInt(oooOO0OOooO0Oo.f30406OooO0OO);
            rect.bottom = MathKt.roundToInt(oooOO0OOooO0Oo.f30407OooO0Oo);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // o000000.o00000
    @NotNull
    public o00000oO.o000OOo.OooO0O0 getFontFamilyResolver() {
        return (o00000oO.o000OOo.OooO0O0) this.f6227o00000O.getValue();
    }

    @Override // o000000.o00000
    @NotNull
    public o00000oO.o0O0O00.OooO00o getFontLoader() {
        return this.f6228o00000O0;
    }

    @Override // o000000.o00000
    @NotNull
    public p218o00oO0O.oo000o getHapticFeedBack() {
        return this.f6231o00000o0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.f6252o00ooo.f26687OooO0O0.OooO0O0();
    }

    @Override // o000000.o00000
    @NotNull
    public p643o0ooOO0.o00O0 getInputModeManager() {
        return this.f6240o0000Ooo;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, o000000.o00000
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.f6230o00000Oo.getValue();
    }

    public long getMeasureIteration() {
        o000000.o0ooOOo o0ooooo2 = this.f6252o00ooo;
        if (o0ooooo2.f26688OooO0OO) {
            return o0ooooo2.f26690OooO0o;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    @Override // o000000.o00000
    @NotNull
    public p418o0Oo0oo.o0ooOOo getPointerIconService() {
        return this.f6238o0000OO;
    }

    @NotNull
    public LayoutNode getRoot() {
        return this.root;
    }

    @NotNull
    public o000000.o0000O00 getRootForTest() {
        return this.f6208OoooOOO;
    }

    @NotNull
    /* JADX INFO: renamed from: getSemanticsOwner, reason: from getter */
    public o00000O0.o00Ooo getF6209OoooOOo() {
        return this.f6209OoooOOo;
    }

    @Override // o000000.o00000
    @NotNull
    /* JADX INFO: renamed from: getSharedDrawScope, reason: from getter */
    public o000000.o00O0O getF6202Oooo0oo() {
        return this.f6202Oooo0oo;
    }

    @Override // o000000.o00000
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // o000000.o00000
    @NotNull
    /* JADX INFO: renamed from: getSnapshotObserver, reason: from getter */
    public o000000.o00000OO getF6257o0OoOo0() {
        return this.f6257o0OoOo0;
    }

    @Override // o000000.o00000
    @NotNull
    /* JADX INFO: renamed from: getTextInputService, reason: from getter */
    public p054o00000oo.o00OO000 getF6223o00000() {
        return this.f6223o00000;
    }

    @Override // o000000.o00000
    @NotNull
    public o00OO0OO getTextToolbar() {
        return this.f6232o00000oO;
    }

    @NotNull
    public View getView() {
        return this;
    }

    @Override // o000000.o00000
    @NotNull
    public o00OOOOo getViewConfiguration() {
        return this.f6261oo000o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final OooO0O0 getViewTreeOwners() {
        return (OooO0O0) this.f6262oo0o0Oo.getValue();
    }

    @Override // o000000.o00000
    @NotNull
    public oo00oO getWindowInfo() {
        return this.f6204OoooO0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        p049Ooooooo.o0 o0Var;
        super.onAttachedToWindow();
        OooOoO(getRoot());
        OooOoO0(getRoot());
        getF6257o0OoOo0().f26627OooO00o.OooO0OO();
        if (OooOOo() && (o0Var = this.f6219Oooooo0) != null) {
            p049Ooooooo.o0O000O.f4213OooO00o.OooO00o(o0Var);
        }
        LifecycleOwner lifecycleOwner3 = ViewTreeLifecycleOwner.get(this);
        p094o000o0OO.o00Oo0 o00oo0OooO00o = p094o000o0OO.o00Ooo.OooO00o(this);
        OooO0O0 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(lifecycleOwner3 == null || o00oo0OooO00o == null || (lifecycleOwner3 == (lifecycleOwner2 = viewTreeOwners.f6265OooO00o) && o00oo0OooO00o == lifecycleOwner2))) {
            if (lifecycleOwner3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (o00oo0OooO00o == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.f6265OooO00o) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner3.getLifecycle().addObserver(this);
            OooO0O0 oooO0O0 = new OooO0O0(lifecycleOwner3, o00oo0OooO00o);
            setViewTreeOwners(oooO0O0);
            Function1<? super OooO0O0, Unit> function1 = this.f6253o0O0O00;
            if (function1 != null) {
                function1.invoke(oooO0O0);
            }
            this.f6253o0O0O00 = null;
        }
        OooO0O0 viewTreeOwners2 = getViewTreeOwners();
        Intrinsics.checkNotNull(viewTreeOwners2);
        viewTreeOwners2.f6265OooO00o.getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f6244o000OOo);
        getViewTreeObserver().addOnScrollChangedListener(this.f6224o000000);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f6225o000000O);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return this.f6226o000000o.f27203OooO0OO;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.f6199Oooo = (o0000O0O.OooOO0) o0000O0O.OooO00o.OooO00o(context);
        if (OooOo0O(newConfig) != this.f6229o00000OO) {
            this.f6229o00000OO = OooOo0O(newConfig);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setFontFamilyResolver(p053o00000oO.o00000O0.OooO00o(context2));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.OooO0O0.OooO00o(this, lifecycleOwner);
    }

    @Override // android.view.View
    @Nullable
    public final InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        int i;
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        p054o00000oo.o00OO00O o00oo00o = this.f6226o000000o;
        Objects.requireNonNull(o00oo00o);
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        if (!o00oo00o.f27203OooO0OO) {
            return null;
        }
        p054o00000oo.o00O00 imeOptions = o00oo00o.f27207OooO0oO;
        p054o00000oo.oo0oOO0 textFieldValue = o00oo00o.f27205OooO0o;
        Intrinsics.checkNotNullParameter(outAttrs, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int i2 = imeOptions.f27175OooO0o0;
        if (i2 == 1) {
            i = imeOptions.f27171OooO00o ? 6 : 0;
        } else {
            if (i2 == 0) {
                i = 1;
            } else {
                if (i2 == 2) {
                    i = 2;
                } else {
                    if (i2 == 6) {
                        i = 5;
                    } else {
                        if (i2 == 5) {
                            i = 7;
                        } else {
                            if (i2 == 3) {
                                i = 3;
                            } else {
                                if (i2 == 4) {
                                    i = 4;
                                } else {
                                    if (!(i2 == 7)) {
                                        throw new IllegalStateException("invalid ImeAction".toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        outAttrs.imeOptions = i;
        int i3 = imeOptions.f27174OooO0Oo;
        if (i3 == 1) {
            outAttrs.inputType = 1;
        } else {
            if (i3 == 2) {
                outAttrs.inputType = 1;
                outAttrs.imeOptions = i | Integer.MIN_VALUE;
            } else {
                if (i3 == 3) {
                    outAttrs.inputType = 2;
                } else {
                    if (i3 == 4) {
                        outAttrs.inputType = 3;
                    } else {
                        if (i3 == 5) {
                            outAttrs.inputType = 17;
                        } else {
                            if (i3 == 6) {
                                outAttrs.inputType = 33;
                            } else {
                                if (i3 == 7) {
                                    outAttrs.inputType = Constants.ERR_WATERMARK_READ;
                                } else {
                                    if (i3 == 8) {
                                        outAttrs.inputType = 18;
                                    } else {
                                        if (!(i3 == 9)) {
                                            throw new IllegalStateException("Invalid Keyboard Type".toString());
                                        }
                                        outAttrs.inputType = o.a.q;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!imeOptions.f27171OooO00o) {
            int i4 = outAttrs.inputType;
            if ((i4 & 1) == 1) {
                outAttrs.inputType = i4 | 131072;
                if (i2 == 1) {
                    outAttrs.imeOptions |= 1073741824;
                }
            }
        }
        int i5 = outAttrs.inputType;
        if ((i5 & 1) == 1) {
            int i6 = imeOptions.f27172OooO0O0;
            if (i6 == 1) {
                outAttrs.inputType = i5 | 4096;
            } else {
                if (i6 == 2) {
                    outAttrs.inputType = i5 | 8192;
                } else {
                    if (i6 == 3) {
                        outAttrs.inputType = i5 | 16384;
                    }
                }
            }
            if (imeOptions.f27173OooO0OO) {
                outAttrs.inputType |= ShareRequest.THUMB_DATA_SIZE_LIMIT;
            }
        }
        long j = textFieldValue.f27237OooO0O0;
        o00000O.o0OO00O.OooO00o oooO00o = o00000O.o0OO00O.f26874OooO0O0;
        outAttrs.initialSelStart = (int) (j >> 32);
        outAttrs.initialSelEnd = o00000O.o0OO00O.OooO0Oo(j);
        p074o000O0oo.OooOO0O.OooO0Oo(outAttrs, textFieldValue.f27236OooO00o.f26756Oooo0o);
        outAttrs.imeOptions |= 33554432;
        p054o00000oo.o00O0OO0 o00o0oo1 = new p054o00000oo.o00O0OO0(o00oo00o.f27205OooO0o, new p054o00000oo.o00OO0OO(o00oo00o), o00oo00o.f27207OooO0oO.f27173OooO0OO);
        o00oo00o.f27208OooO0oo = o00o0oo1;
        return o00o0oo1;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.OooO0O0.OooO0O0(this, lifecycleOwner);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        p049Ooooooo.o0 o0Var;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        o000000.o00000OO f6257o0OoOo0 = getF6257o0OoOo0();
        f6257o0OoOo0.f26627OooO00o.OooO0Oo();
        f6257o0OoOo0.f26627OooO00o.OooO00o();
        OooO0O0 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.f6265OooO00o) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        if (OooOOo() && (o0Var = this.f6219Oooooo0) != null) {
            p049Ooooooo.o0O000O.f4213OooO00o.OooO0O0(o0Var);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f6244o000OOo);
        getViewTreeObserver().removeOnScrollChangedListener(this.f6224o000000);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f6225o000000O);
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + ')');
        p710ooOO.o0OOO0o o0ooo0o2 = this.f6205OoooO00;
        if (!z) {
            p710ooOO.o0000O0.OooO0OO(o0ooo0o2.f53491OooO00o, true);
            return;
        }
        p710ooOO.o0OO00O o0oo00o2 = o0ooo0o2.f53491OooO00o;
        if (o0oo00o2.f53475Oooo == FocusStateImpl.Inactive) {
            o0oo00o2.OooO0O0(FocusStateImpl.Active);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f6248o00Ooo = null;
        Oooo0OO();
        if (this.f6246o00O0O != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                OooOoO(getRoot());
            }
            Pair<Integer, Integer> pairOooOo00 = OooOo00(i);
            int iIntValue = pairOooOo00.component1().intValue();
            int iIntValue2 = pairOooOo00.component2().intValue();
            Pair<Integer, Integer> pairOooOo01 = OooOo00(i2);
            long jOooO00o = o0000O0O.OooO0OO.OooO00o(iIntValue, iIntValue2, pairOooOo01.component1().intValue(), pairOooOo01.component2().intValue());
            o0000O0O.OooO0O0 oooO0O0 = this.f6248o00Ooo;
            if (oooO0O0 == null) {
                this.f6248o00Ooo = new o0000O0O.OooO0O0(jOooO00o);
                this.f6249o00o0O = false;
            } else if (!o0000O0O.OooO0O0.OooO0O0(oooO0O0.f27302OooO00o, jOooO00o)) {
                this.f6249o00o0O = true;
            }
            this.f6252o00ooo.OooOO0O(jOooO00o);
            this.f6252o00ooo.OooO0o(this.f6243o000OO);
            setMeasuredDimension(getRoot().f6166o00o0O.f35265Oooo0o, getRoot().f6166o00o0O.f35266Oooo0oO);
            if (this.f6246o00O0O != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f6166o00o0O.f35265Oooo0o, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f6166o00o0O.f35266Oooo0oO, 1073741824));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.OooO0O0.OooO0OO(this, lifecycleOwner);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, Ooooooo.o0OoOoOo>] */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(@Nullable ViewStructure root, int i) {
        p049Ooooooo.o0 o0Var;
        if (!OooOOo() || root == null || (o0Var = this.f6219Oooooo0) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(root, "root");
        int iOooO00o = p049Ooooooo.o0O0000O.f4212OooO00o.OooO00o(root, o0Var.f4209OooO0O0.f4214OooO00o.size());
        for (Map.Entry entry : o0Var.f4209OooO0O0.f4214OooO00o.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            p049Ooooooo.o0OoOoOo o0oooooo2 = (p049Ooooooo.o0OoOoOo) entry.getValue();
            p049Ooooooo.o0O0000O o0o0000o2 = p049Ooooooo.o0O0000O.f4212OooO00o;
            ViewStructure viewStructureOooO0O0 = o0o0000o2.OooO0O0(root, iOooO00o);
            if (viewStructureOooO0O0 != null) {
                p049Ooooooo.o0O000 o0o001 = p049Ooooooo.o0O000.f4211OooO00o;
                AutofillId autofillIdOooO00o = o0o001.OooO00o(root);
                Intrinsics.checkNotNull(autofillIdOooO00o);
                o0o001.OooO0oO(viewStructureOooO0O0, autofillIdOooO00o, iIntValue);
                o0o0000o2.OooO0Oo(viewStructureOooO0O0, iIntValue, o0Var.f4208OooO00o.getContext().getPackageName(), null, null);
                o0o001.OooO0oo(viewStructureOooO0O0, 1);
                Objects.requireNonNull(o0oooooo2);
                throw null;
            }
            iOooO00o++;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setShowLayoutBounds(OooO00o.OooO00o());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f6201Oooo0oO) {
            Function1<? super p054o00000oo.o00O0O0O, ? extends p054o00000oo.o00OO000> function1 = oo0o0Oo.f6644OooO00o;
            LayoutDirection layoutDirection = (i == 0 || i != 1) ? LayoutDirection.Ltr : LayoutDirection.Rtl;
            setLayoutDirection(layoutDirection);
            p710ooOO.o0OOO0o o0ooo0o2 = this.f6205OoooO00;
            Objects.requireNonNull(o0ooo0o2);
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            o0ooo0o2.f53493OooO0OO = layoutDirection;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.OooO0O0.OooO0o0(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.OooO0O0.OooO0o(this, lifecycleOwner);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zOooO00o;
        this.f6204OoooO0.f6626OooO00o.setValue(Boolean.valueOf(z));
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (zOooO00o = OooO00o.OooO00o())) {
            return;
        }
        setShowLayoutBounds(zOooO00o);
        OooOoO0(getRoot());
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.configurationChangeObserver = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super OooO0O0, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        OooO0O0 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f6253o0O0O00 = callback;
    }

    @Override // o000000.o00000
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // o000000.o00000
    @NotNull
    public androidx.compose.ui.platform.OooOOOO getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // o000000.o00000
    @NotNull
    public androidx.compose.ui.platform.OooOo00 getClipboardManager() {
        return this.clipboardManager;
    }
}
