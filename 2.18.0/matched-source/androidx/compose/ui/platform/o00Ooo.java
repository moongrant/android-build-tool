package androidx.compose.ui.platform;

import android.R;
import android.content.ClipDescription;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public static final int[] f6540OooOoO = {p048OoooooO.o0oOO.accessibility_custom_action_0, p048OoooooO.o0oOO.accessibility_custom_action_1, p048OoooooO.o0oOO.accessibility_custom_action_2, p048OoooooO.o0oOO.accessibility_custom_action_3, p048OoooooO.o0oOO.accessibility_custom_action_4, p048OoooooO.o0oOO.accessibility_custom_action_5, p048OoooooO.o0oOO.accessibility_custom_action_6, p048OoooooO.o0oOO.accessibility_custom_action_7, p048OoooooO.o0oOO.accessibility_custom_action_8, p048OoooooO.o0oOO.accessibility_custom_action_9, p048OoooooO.o0oOO.accessibility_custom_action_10, p048OoooooO.o0oOO.accessibility_custom_action_11, p048OoooooO.o0oOO.accessibility_custom_action_12, p048OoooooO.o0oOO.accessibility_custom_action_13, p048OoooooO.o0oOO.accessibility_custom_action_14, p048OoooooO.o0oOO.accessibility_custom_action_15, p048OoooooO.o0oOO.accessibility_custom_action_16, p048OoooooO.o0oOO.accessibility_custom_action_17, p048OoooooO.o0oOO.accessibility_custom_action_18, p048OoooooO.o0oOO.accessibility_custom_action_19, p048OoooooO.o0oOO.accessibility_custom_action_20, p048OoooooO.o0oOO.accessibility_custom_action_21, p048OoooooO.o0oOO.accessibility_custom_action_22, p048OoooooO.o0oOO.accessibility_custom_action_23, p048OoooooO.o0oOO.accessibility_custom_action_24, p048OoooooO.o0oOO.accessibility_custom_action_25, p048OoooooO.o0oOO.accessibility_custom_action_26, p048OoooooO.o0oOO.accessibility_custom_action_27, p048OoooooO.o0oOO.accessibility_custom_action_28, p048OoooooO.o0oOO.accessibility_custom_action_29, p048OoooooO.o0oOO.accessibility_custom_action_30, p048OoooooO.o0oOO.accessibility_custom_action_31};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f6541OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final AndroidComposeView f6542OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final AccessibilityManager f6543OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f6544OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Handler f6545OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public p072o000O0o0.o000 f6546OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public p021OooOooo.o0ooOOo<p021OooOooo.o0ooOOo<CharSequence>> f6547OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public p021OooOooo.o0ooOOo<Map<CharSequence, Integer>> f6548OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f6549OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final p021OooOooo.o0OoOo0<LayoutNode> f6550OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Integer f6551OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final Channel<Unit> f6552OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f6553OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public Map<Integer, o00O> f6554OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public OooO f6555OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public p021OooOooo.o0OoOo0<Integer> f6556OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final List<oo0oOO0> f6557OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public OooOO0 f6558OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public Map<Integer, OooOO0> f6559OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f6560OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f6561OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Function1<oo0oOO0, Unit> f6562OooOoO0;

    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o00000O0.o00O0O f6563OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f6564OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f6565OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f6566OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f6567OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f6568OooO0o0;

        public OooO(@NotNull o00000O0.o00O0O node, int i, int i2, int i3, int i4, long j) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f6563OooO00o = node;
            this.f6564OooO0O0 = i;
            this.f6565OooO0OO = i2;
            this.f6566OooO0Oo = i3;
            this.f6568OooO0o0 = i4;
            this.f6567OooO0o = j;
        }
    }

    public static final class OooO00o implements View.OnAttachStateChangeListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o00Ooo o00ooo2 = o00Ooo.this;
            o00ooo2.f6545OooO0oO.removeCallbacks(o00ooo2.f6561OooOo0o);
        }
    }

    @RequiresApi(24)
    public static final class OooO0O0 {
        @JvmStatic
        @DoNotInline
        public static final void OooO00o(@NotNull p072o000O0o0.o0000OO0 info, @NotNull o00000O0.o00O0O semanticsNode) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            if (o0ooOOo.OooO00o(semanticsNode)) {
                o00000O0.OooOOOO oooOOOO = semanticsNode.f26967OooO0o0;
                o00000O0.OooOOO oooOOO = o00000O0.OooOOO.f26934OooO00o;
                o00000O0.OooO00o oooO00o = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(oooOOOO, o00000O0.OooOOO.f26940OooO0oO);
                if (oooO00o != null) {
                    info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(R.id.accessibilityActionSetProgress, oooO00o.f26923OooO00o));
                }
            }
        }
    }

    @RequiresApi(28)
    public static final class OooO0OO {
        @JvmStatic
        @DoNotInline
        public static final void OooO00o(@NotNull AccessibilityEvent event, int i, int i2) {
            Intrinsics.checkNotNullParameter(event, "event");
            event.setScrollDeltaX(i);
            event.setScrollDeltaY(i2);
        }
    }

    public final class OooO0o extends AccessibilityNodeProvider {
        public OooO0o() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, @NotNull AccessibilityNodeInfo info, @NotNull String extraDataKey, @Nullable Bundle bundle) {
            o00000O0.o00O0O o00o0o2;
            String str;
            o00O0O.OooOO0O oooOO0O;
            RectF rectF;
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(extraDataKey, "extraDataKey");
            o00Ooo o00ooo2 = o00Ooo.this;
            o00O o00o2 = o00ooo2.OooOOOo().get(Integer.valueOf(i));
            if (o00o2 == null || (o00o0o2 = o00o2.f6465OooO00o) == null) {
                return;
            }
            String strOooOOo0 = o00ooo2.OooOOo0(o00o0o2);
            o00000O0.OooOOOO oooOOOO = o00o0o2.f26967OooO0o0;
            o00000O0.OooOOO oooOOO = o00000O0.OooOOO.f26934OooO00o;
            o00000O0.o0Oo0oo<o00000O0.OooO00o<Function1<List<o00000O.o0OOO0o>, Boolean>>> o0oo0oo2 = o00000O0.OooOOO.f26935OooO0O0;
            if (!oooOOOO.OooO0O0(o0oo0oo2) || bundle == null || !Intrinsics.areEqual(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                o00000O0.OooOOOO oooOOOO2 = o00o0o2.f26967OooO0o0;
                o00000O0.oo000o oo000oVar = o00000O0.oo000o.f26992OooO00o;
                o00000O0.o0Oo0oo<String> o0oo0oo3 = o00000O0.oo000o.f27009OooOOoo;
                if (!oooOOOO2.OooO0O0(o0oo0oo3) || bundle == null || !Intrinsics.areEqual(extraDataKey, "androidx.compose.ui.semantics.testTag") || (str = (String) o00000O0.OooOo00.OooO00o(o00o0o2.f26967OooO0o0, o0oo0oo3)) == null) {
                    return;
                }
                info.getExtras().putCharSequence(extraDataKey, str);
                return;
            }
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strOooOOo0 != null ? strOooOOo0.length() : Integer.MAX_VALUE)) {
                    ArrayList arrayList = new ArrayList();
                    Function1 function1 = (Function1) ((o00000O0.OooO00o) o00o0o2.f26967OooO0o0.OooO0o0(o0oo0oo2)).f26924OooO0O0;
                    boolean z = false;
                    if (Intrinsics.areEqual(function1 != null ? (Boolean) function1.invoke(arrayList) : null, Boolean.TRUE)) {
                        o00000O.o0OOO0o o0ooo0o2 = (o00000O.o0OOO0o) arrayList.get(0);
                        ArrayList arrayList2 = new ArrayList();
                        int i4 = 0;
                        while (i4 < i3) {
                            int i5 = i2 + i4;
                            if (i5 >= o0ooo0o2.f26896OooO00o.f26904OooO00o.length()) {
                                arrayList2.add(z);
                                i3 = i3;
                            } else {
                                o00O0O.OooOO0O oooOO0OOooO0Oo = o0ooo0o2.OooO0O0(i5).OooO0Oo(o00o0o2.OooO0oo());
                                o00O0O.OooOO0O other = o00o0o2.OooO0Oo();
                                if (oooOO0OOooO0Oo.OooO0O0(other)) {
                                    Intrinsics.checkNotNullParameter(other, "other");
                                    oooOO0O = new o00O0O.OooOO0O(Math.max(oooOO0OOooO0Oo.f30422OooO00o, other.f30422OooO00o), Math.max(oooOO0OOooO0Oo.f30423OooO0O0, other.f30423OooO0O0), Math.min(oooOO0OOooO0Oo.f30424OooO0OO, other.f30424OooO0OO), Math.min(oooOO0OOooO0Oo.f30425OooO0Oo, other.f30425OooO0Oo));
                                } else {
                                    oooOO0O = null;
                                }
                                if (oooOO0O != null) {
                                    long jOooOO0 = o00ooo2.f6542OooO0Oo.OooOO0(o00O0O.OooOO0.OooO00o(oooOO0O.f30422OooO00o, oooOO0O.f30423OooO0O0));
                                    long jOooOO1 = o00ooo2.f6542OooO0Oo.OooOO0(o00O0O.OooOO0.OooO00o(oooOO0O.f30424OooO0OO, oooOO0O.f30425OooO0Oo));
                                    rectF = new RectF(o00O0O.OooO.OooO0OO(jOooOO0), o00O0O.OooO.OooO0Oo(jOooOO0), o00O0O.OooO.OooO0OO(jOooOO1), o00O0O.OooO.OooO0Oo(jOooOO1));
                                } else {
                                    rectF = null;
                                }
                                arrayList2.add(rectF);
                            }
                            i4++;
                            i3 = i3;
                            z = false;
                        }
                        Bundle extras = info.getExtras();
                        Object[] array = arrayList2.toArray(new RectF[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        extras.putParcelableArray(extraDataKey, (Parcelable[]) array);
                        return;
                    }
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @Nullable
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            o000000.oo000o oo000oVarOooO0OO;
            boolean zBooleanValue;
            o00000O.OooO00o oooO00o;
            String str;
            LifecycleOwner lifecycleOwner;
            Lifecycle lifecycle;
            o00Ooo o00ooo2 = o00Ooo.this;
            AndroidComposeView.OooO0O0 viewTreeOwners = o00ooo2.f6542OooO0Oo.getViewTreeOwners();
            if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.f6280OooO00o) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) != Lifecycle.State.DESTROYED) {
                p072o000O0o0.o0000OO0 info = p072o000O0o0.o0000OO0.OooOo0O();
                Intrinsics.checkNotNullExpressionValue(info, "obtain()");
                o00O o00o2 = o00ooo2.OooOOOo().get(Integer.valueOf(i));
                if (o00o2 != null) {
                    o00000O0.o00O0O node = o00o2.f6465OooO00o;
                    if (i == -1) {
                        AndroidComposeView androidComposeView = o00ooo2.f6542OooO0Oo;
                        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7885OooO00o;
                        Object objOooO0o = ViewCompat.OooO0o.OooO0o(androidComposeView);
                        info.OoooOO0(objOooO0o instanceof View ? (View) objOooO0o : null);
                    } else {
                        if (node.OooO0oO() == null) {
                            throw new IllegalStateException(OooO0O0.OooO00o.OooO00o("semanticsNode ", i, " has null parent"));
                        }
                        o00000O0.o00O0O o00o0oOooO0oO = node.OooO0oO();
                        Intrinsics.checkNotNull(o00o0oOooO0oO);
                        int i2 = o00o0oOooO0oO.f26966OooO0o;
                        info.o000oOoO(o00ooo2.f6542OooO0Oo, i2 != o00ooo2.f6542OooO0Oo.getF6224OoooOoo().OooO00o().f26966OooO0o ? i2 : -1);
                    }
                    AndroidComposeView androidComposeView2 = o00ooo2.f6542OooO0Oo;
                    info.f28216OooO0OO = i;
                    info.f28214OooO00o.setSource(androidComposeView2, i);
                    Rect rect = o00o2.f6466OooO0O0;
                    long jOooOO0 = o00ooo2.f6542OooO0Oo.OooOO0(o00O0O.OooOO0.OooO00o(rect.left, rect.top));
                    long jOooOO1 = o00ooo2.f6542OooO0Oo.OooOO0(o00O0O.OooOO0.OooO00o(rect.right, rect.bottom));
                    info.OooOoo(new Rect((int) Math.floor(o00O0O.OooO.OooO0OO(jOooOO0)), (int) Math.floor(o00O0O.OooO.OooO0Oo(jOooOO0)), (int) Math.ceil(o00O0O.OooO.OooO0OO(jOooOO1)), (int) Math.ceil(o00O0O.OooO.OooO0Oo(jOooOO1))));
                    Intrinsics.checkNotNullParameter(info, "info");
                    Intrinsics.checkNotNullParameter(node, "semanticsNode");
                    info.Oooo000("android.view.View");
                    o00000O0.OooOOOO oooOOOO = node.f26967OooO0o0;
                    o00000O0.oo000o oo000oVar = o00000O0.oo000o.f26992OooO00o;
                    o00000O0.OooOO0O oooOO0O = (o00000O0.OooOO0O) o00000O0.OooOo00.OooO00o(oooOOOO, o00000O0.oo000o.f27007OooOOo);
                    int i3 = 0;
                    if (oooOO0O != null) {
                        int i4 = oooOO0O.f26932OooO00o;
                        if (node.f26964OooO0OO || node.OooO0o0(false).isEmpty()) {
                            int i5 = oooOO0O.f26932OooO00o;
                            if (i5 == 4) {
                                info.OoooOOo(o00ooo2.f6542OooO0Oo.getContext().getResources().getString(p048OoooooO.o0O00o0.tab));
                            } else {
                                if (i4 == 0) {
                                    str = "android.widget.Button";
                                } else if (i4 == 1) {
                                    str = "android.widget.CheckBox";
                                } else if (i4 == 2) {
                                    str = "android.widget.Switch";
                                } else {
                                    str = i4 == 3 ? "android.widget.RadioButton" : i4 == 5 ? "android.widget.ImageView" : null;
                                }
                                if (!(i5 == 5) || o0ooOOo.OooO0o(node.f26968OooO0oO, oo000o.f6651Oooo) == null || node.f26967OooO0o0.f26955OoooO00) {
                                    info.Oooo000(str);
                                }
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (o0ooOOo.OooO0Oo(node)) {
                        info.Oooo000("android.widget.EditText");
                    }
                    if (node.OooO0o().OooO0O0(o00000O0.oo000o.f27012OooOo00)) {
                        info.Oooo000("android.widget.TextView");
                    }
                    info.OoooO0O(o00ooo2.f6542OooO0Oo.getContext().getPackageName());
                    List listOooO0o0 = node.OooO0o0(true);
                    int size = listOooO0o0.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        o00000O0.o00O0O o00o0o2 = (o00000O0.o00O0O) listOooO0o0.get(i6);
                        if (o00ooo2.OooOOOo().containsKey(Integer.valueOf(o00o0o2.f26966OooO0o))) {
                            AndroidViewHolder androidViewHolder = o00ooo2.f6542OooO0Oo.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(o00o0o2.f26968OooO0oO);
                            if (androidViewHolder != null) {
                                info.OooO0OO(androidViewHolder);
                            } else {
                                info.f28214OooO00o.addChild(o00ooo2.f6542OooO0Oo, o00o0o2.f26966OooO0o);
                            }
                        }
                    }
                    if (o00ooo2.f6541OooO == i) {
                        info.OooOoO(true);
                        info.OooO0O0(o000O0o0.o0000OO0.OooO00o.f28217OooO);
                    } else {
                        info.OooOoO(false);
                        info.OooO0O0(o000O0o0.o0000OO0.OooO00o.f28221OooO0oo);
                    }
                    o00000oO.o000OOo.OooO0O0 fontFamilyResolver = o00ooo2.f6542OooO0Oo.getFontFamilyResolver();
                    o00000O.OooO00o oooO00oOooOOo = o00ooo2.OooOOo(node.f26967OooO0o0);
                    SpannableString spannableString = (SpannableString) o00ooo2.Oooo0(oooO00oOooOOo != null ? o0000O00.OooO00o.OooO00o(oooO00oOooOOo, o00ooo2.f6542OooO0Oo.getDensity(), fontFamilyResolver) : null);
                    o00000O0.OooOOOO oooOOOO2 = node.f26967OooO0o0;
                    o00000O0.oo000o oo000oVar2 = o00000O0.oo000o.f26992OooO00o;
                    List list = (List) o00000O0.OooOo00.OooO00o(oooOOOO2, o00000O0.oo000o.f27012OooOo00);
                    SpannableString spannableString2 = (SpannableString) o00ooo2.Oooo0((list == null || (oooO00o = (o00000O.OooO00o) CollectionsKt.firstOrNull(list)) == null) ? null : o0000O00.OooO00o.OooO00o(oooO00o, o00ooo2.f6542OooO0Oo.getDensity(), fontFamilyResolver));
                    if (spannableString == null) {
                        spannableString = spannableString2;
                    }
                    info.OooooO0(spannableString);
                    o00000O0.OooOOOO oooOOOO3 = node.f26967OooO0o0;
                    o00000O0.o0Oo0oo<String> o0oo0oo2 = o00000O0.oo000o.f27017OooOoOO;
                    if (oooOOOO3.OooO0O0(o0oo0oo2)) {
                        info.f28214OooO00o.setContentInvalid(true);
                        info.f28214OooO00o.setError((CharSequence) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o0oo0oo2));
                    }
                    info.Ooooo0o((CharSequence) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f26994OooO0OO));
                    ToggleableState toggleableState = (ToggleableState) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f27016OooOoO0);
                    if (toggleableState != null) {
                        info.OooOooO(true);
                        int i7 = OooOO0O.$EnumSwitchMapping$0[toggleableState.ordinal()];
                        if (i7 == 1) {
                            info.OooOooo(true);
                            if ((oooOO0O != null && oooOO0O.f26932OooO00o == 2) && info.OooOOOO() == null) {
                                info.Ooooo0o(o00ooo2.f6542OooO0Oo.getContext().getResources().getString(p048OoooooO.o0O00o0.on));
                            }
                        } else if (i7 == 2) {
                            info.OooOooo(false);
                            if ((oooOO0O != null && oooOO0O.f26932OooO00o == 2) && info.OooOOOO() == null) {
                                info.Ooooo0o(o00ooo2.f6542OooO0Oo.getContext().getResources().getString(p048OoooooO.o0O00o0.off));
                            }
                        } else if (i7 == 3 && info.OooOOOO() == null) {
                            info.Ooooo0o(o00ooo2.f6542OooO0Oo.getContext().getResources().getString(p048OoooooO.o0O00o0.indeterminate));
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    Boolean bool = (Boolean) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f27010OooOo);
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (oooOO0O != null && oooOO0O.f26932OooO00o == 4) {
                            info.OoooOoo(zBooleanValue2);
                        } else {
                            info.OooOooO(true);
                            info.OooOooo(zBooleanValue2);
                            if (info.OooOOOO() == null) {
                                info.Ooooo0o(zBooleanValue2 ? o00ooo2.f6542OooO0Oo.getContext().getResources().getString(p048OoooooO.o0O00o0.selected) : o00ooo2.f6542OooO0Oo.getContext().getResources().getString(p048OoooooO.o0O00o0.not_selected));
                            }
                        }
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (!node.f26967OooO0o0.f26955OoooO00 || node.OooO0o0(false).isEmpty()) {
                        List list2 = (List) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f26993OooO0O0);
                        info.Oooo0O0(list2 != null ? (String) CollectionsKt.firstOrNull(list2) : null);
                    }
                    if (node.f26967OooO0o0.f26955OoooO00) {
                        info.OoooOo0(true);
                    }
                    String str2 = (String) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f27009OooOOoo);
                    if (str2 != null) {
                        o00000O0.o00O0O o00o0oOooO0oO2 = node;
                        while (true) {
                            if (o00o0oOooO0oO2 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            o00000O0.OooOOOO oooOOOO4 = o00o0oOooO0oO2.f26967OooO0o0;
                            o00000O0.o00oO0o o00oo0o2 = o00000O0.o00oO0o.f26972OooO00o;
                            o00000O0.o0Oo0oo<Boolean> o0oo0oo3 = o00000O0.o00oO0o.f26973OooO0O0;
                            if (oooOOOO4.OooO0O0(o0oo0oo3)) {
                                zBooleanValue = ((Boolean) o00o0oOooO0oO2.f26967OooO0o0.OooO0o0(o0oo0oo3)).booleanValue();
                                break;
                            }
                            o00o0oOooO0oO2 = o00o0oOooO0oO2.OooO0oO();
                        }
                        if (zBooleanValue) {
                            info.f28214OooO00o.setViewIdResourceName(str2);
                        }
                    }
                    o00000O0.OooOOOO oooOOOO5 = node.f26967OooO0o0;
                    o00000O0.oo000o oo000oVar3 = o00000O0.oo000o.f26992OooO00o;
                    if (((Unit) o00000O0.OooOo00.OooO00o(oooOOOO5, o00000O0.oo000o.f26991OooO)) != null) {
                        info.Oooo0oo(true);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    info.f28214OooO00o.setPassword(node.OooO0o().OooO0O0(o00000O0.oo000o.f27015OooOoO));
                    info.f28214OooO00o.setEditable(o0ooOOo.OooO0Oo(node));
                    info.Oooo0o0(o0ooOOo.OooO00o(node));
                    o00000O0.OooOOOO oooOOOO6 = node.f26967OooO0o0;
                    o00000O0.o0Oo0oo<Boolean> o0oo0oo4 = o00000O0.oo000o.f27002OooOO0o;
                    info.Oooo0o(oooOOOO6.OooO0O0(o0oo0oo4));
                    if (info.OooOOo()) {
                        info.Oooo0oO(((Boolean) node.f26967OooO0o0.OooO0o0(o0oo0oo4)).booleanValue());
                        if (info.OooOOoo()) {
                            info.OooO00o(2);
                        } else {
                            info.OooO00o(1);
                        }
                    }
                    if (node.f26964OooO0OO) {
                        o00000O0.o00O0O o00o0oOooO0oO3 = node.OooO0oO();
                        oo000oVarOooO0OO = o00o0oOooO0oO3 != null ? o00o0oOooO0oO3.OooO0OO() : null;
                    } else {
                        oo000oVarOooO0OO = node.OooO0OO();
                    }
                    info.OooooOo(!(oo000oVarOooO0OO != null ? oo000oVarOooO0OO.o0000O00() : false) && o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f27004OooOOO0) == null);
                    if (((o00000O0.OooO) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f27001OooOO0O)) != null) {
                        info.f28214OooO00o.setLiveRegion(1);
                        Unit unit5 = Unit.INSTANCE;
                    }
                    info.Oooo00O(false);
                    o00000O0.OooOOOO oooOOOO7 = node.f26967OooO0o0;
                    o00000O0.OooOOO oooOOO = o00000O0.OooOOO.f26934OooO00o;
                    o00000O0.OooO00o oooO00o2 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(oooOOOO7, o00000O0.OooOOO.f26936OooO0OO);
                    if (oooO00o2 != null) {
                        boolean zAreEqual = Intrinsics.areEqual(o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f27010OooOo), Boolean.TRUE);
                        info.Oooo00O(!zAreEqual);
                        if (o0ooOOo.OooO00o(node) && !zAreEqual) {
                            info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(16, oooO00o2.f26923OooO00o));
                        }
                        Unit unit6 = Unit.INSTANCE;
                    }
                    info.OoooO00(false);
                    o00000O0.OooO00o oooO00o3 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.OooOOO.f26937OooO0Oo);
                    if (oooO00o3 != null) {
                        info.OoooO00(true);
                        if (o0ooOOo.OooO00o(node)) {
                            info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(32, oooO00o3.f26923OooO00o));
                        }
                        Unit unit7 = Unit.INSTANCE;
                    }
                    o00000O0.OooO00o oooO00o4 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.OooOOO.f26942OooOO0);
                    if (oooO00o4 != null) {
                        info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(16384, oooO00o4.f26923OooO00o));
                        Unit unit8 = Unit.INSTANCE;
                    }
                    if (o0ooOOo.OooO00o(node)) {
                        o00000O0.OooO00o oooO00o5 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.OooOOO.f26933OooO);
                        if (oooO00o5 != null) {
                            info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(2097152, oooO00o5.f26923OooO00o));
                            Unit unit9 = Unit.INSTANCE;
                        }
                        o00000O0.OooO00o oooO00o6 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.OooOOO.f26943OooOO0O);
                        if (oooO00o6 != null) {
                            info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(65536, oooO00o6.f26923OooO00o));
                            Unit unit10 = Unit.INSTANCE;
                        }
                        o00000O0.OooO00o oooO00o7 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.OooOOO.f26944OooOO0o);
                        if (oooO00o7 != null) {
                            if (info.OooOOoo()) {
                                ClipDescription primaryClipDescription = o00ooo2.f6542OooO0Oo.getClipboardManager().f6317OooO00o.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/plain") : false) {
                                    info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(ShareRequest.THUMB_DATA_SIZE_LIMIT, oooO00o7.f26923OooO00o));
                                }
                            }
                            Unit unit11 = Unit.INSTANCE;
                        }
                    }
                    String strOooOOo0 = o00ooo2.OooOOo0(node);
                    if (!(strOooOOo0 == null || strOooOOo0.length() == 0)) {
                        info.f28214OooO00o.setTextSelection(o00ooo2.OooOOOO(node), o00ooo2.OooOOO(node));
                        o00000O0.OooO00o oooO00o8 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.OooOOO.f26941OooO0oo);
                        info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(131072, oooO00o8 != null ? oooO00o8.f26923OooO00o : null));
                        info.OooO00o(256);
                        info.OooO00o(512);
                        info.OoooO0(11);
                        List list3 = (List) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f26993OooO0O0);
                        if ((list3 == null || list3.isEmpty()) && node.f26967OooO0o0.OooO0O0(o00000O0.OooOOO.f26935OooO0O0) && !o0ooOOo.OooO0O0(node)) {
                            info.OoooO0(info.OooOOO0() | 4 | 16);
                        }
                    }
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 26) {
                        ArrayList arrayList = new ArrayList();
                        CharSequence charSequenceOooOOOo = info.OooOOOo();
                        if (!(charSequenceOooOOOo == null || charSequenceOooOOOo.length() == 0) && node.f26967OooO0o0.OooO0O0(o00000O0.OooOOO.f26935OooO0O0)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (node.f26967OooO0o0.OooO0O0(o00000O0.oo000o.f27009OooOOoo)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (!arrayList.isEmpty()) {
                            androidx.compose.ui.platform.OooOOO oooOOO2 = androidx.compose.ui.platform.OooOOO.f6315OooO00o;
                            AccessibilityNodeInfo accessibilityNodeInfo = info.f28214OooO00o;
                            Intrinsics.checkNotNullExpressionValue(accessibilityNodeInfo, "info.unwrap()");
                            oooOOO2.OooO00o(accessibilityNodeInfo, arrayList);
                        }
                    }
                    o00000O0.OooOO0 oooOO1 = (o00000O0.OooOO0) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f26995OooO0Oo);
                    if (oooOO1 != null) {
                        o00000O0.OooOOOO oooOOOO8 = node.f26967OooO0o0;
                        o00000O0.o0Oo0oo<o00000O0.OooO00o<Function1<Float, Boolean>>> o0oo0oo5 = o00000O0.OooOOO.f26940OooO0oO;
                        if (oooOOOO8.OooO0O0(o0oo0oo5)) {
                            info.Oooo000("android.widget.SeekBar");
                        } else {
                            info.Oooo000("android.widget.ProgressBar");
                        }
                        o00000O0.OooOO0.OooO00o oooO00o9 = o00000O0.OooOO0.f26927OooO0Oo;
                        if (oooOO1 != o00000O0.OooOO0.f26928OooO0o0) {
                            info.OoooOOO(o000O0o0.o0000OO0.OooO0o.OooO00o(oooOO1.f26930OooO0O0.getStart().floatValue(), oooOO1.f26930OooO0O0.getEndInclusive().floatValue(), oooOO1.f26929OooO00o));
                            if (info.OooOOOO() == null) {
                                ClosedFloatingPointRange<Float> closedFloatingPointRange = oooOO1.f26930OooO0O0;
                                float fCoerceIn = RangesKt.coerceIn(((closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue()) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : ((closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue()) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 0 : -1)) == 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : (oooOO1.f26929OooO00o - closedFloatingPointRange.getStart().floatValue()) / (closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue()), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
                                int iCoerceIn = 100;
                                if (fCoerceIn == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    iCoerceIn = 0;
                                } else if (!(fCoerceIn == 1.0f)) {
                                    iCoerceIn = RangesKt.coerceIn(MathKt.roundToInt(fCoerceIn * 100), 1, 99);
                                }
                                info.Ooooo0o(o00ooo2.f6542OooO0Oo.getContext().getResources().getString(p048OoooooO.o0O00o0.template_percent, Integer.valueOf(iCoerceIn)));
                            }
                        } else if (info.OooOOOO() == null) {
                            info.Ooooo0o(o00ooo2.f6542OooO0Oo.getContext().getResources().getString(p048OoooooO.o0O00o0.in_progress));
                        }
                        if (node.f26967OooO0o0.OooO0O0(o0oo0oo5) && o0ooOOo.OooO00o(node)) {
                            if (oooOO1.f26929OooO00o < RangesKt.coerceAtLeast(oooOO1.f26930OooO0O0.getEndInclusive().floatValue(), oooOO1.f26930OooO0O0.getStart().floatValue())) {
                                info.OooO0O0(o000O0o0.o0000OO0.OooO00o.f28222OooOO0);
                            }
                            if (oooOO1.f26929OooO00o > RangesKt.coerceAtMost(oooOO1.f26930OooO0O0.getStart().floatValue(), oooOO1.f26930OooO0O0.getEndInclusive().floatValue())) {
                                info.OooO0O0(o000O0o0.o0000OO0.OooO00o.f28223OooOO0O);
                            }
                        }
                    }
                    if (i8 >= 24) {
                        OooO0O0.OooO00o(info, node);
                    }
                    Intrinsics.checkNotNullParameter(node, "node");
                    Intrinsics.checkNotNullParameter(info, "info");
                    o00000O0.OooO0O0 oooO0O0 = (o00000O0.OooO0O0) o00000O0.OooOo00.OooO00o(node.OooO0o(), o00000O0.oo000o.f26998OooO0oO);
                    if (oooO0O0 != null) {
                        info.Oooo00o(o000O0o0.o0000OO0.OooO0O0.OooO00o(oooO0O0.f26925OooO00o, oooO0O0.f26926OooO0O0, false, 0));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        if (o00000O0.OooOo00.OooO00o(node.OooO0o(), o00000O0.oo000o.f26996OooO0o) != null) {
                            List listOooO0o1 = node.OooO0o0(false);
                            int size2 = listOooO0o1.size();
                            for (int i9 = 0; i9 < size2; i9++) {
                                o00000O0.o00O0O o00o0o3 = (o00000O0.o00O0O) listOooO0o1.get(i9);
                                o00000O0.OooOOOO oooOOOOOooO0o = o00o0o3.OooO0o();
                                o00000O0.oo000o oo000oVar4 = o00000O0.oo000o.f26992OooO00o;
                                if (oooOOOOOooO0o.OooO0O0(o00000O0.oo000o.f27010OooOo)) {
                                    arrayList2.add(o00o0o3);
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            boolean zOooO00o = o000000O.OooO00o.OooO00o(arrayList2);
                            info.Oooo00o(o000O0o0.o0000OO0.OooO0O0.OooO00o(zOooO00o ? 1 : arrayList2.size(), zOooO00o ? arrayList2.size() : 1, false, 0));
                        }
                    }
                    o000000O.OooO00o.OooO0OO(node, info);
                    o00000O0.OooOOOO oooOOOO9 = node.f26967OooO0o0;
                    o00000O0.oo000o oo000oVar5 = o00000O0.oo000o.f26992OooO00o;
                    o00000O0.OooOOO0 oooOOO0 = (o00000O0.OooOOO0) o00000O0.OooOo00.OooO00o(oooOOOO9, o00000O0.oo000o.f27003OooOOO);
                    o00000O0.OooOOOO oooOOOO10 = node.f26967OooO0o0;
                    o00000O0.OooOOO oooOOO3 = o00000O0.OooOOO.f26934OooO00o;
                    o00000O0.OooO00o oooO00o10 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(oooOOOO10, o00000O0.OooOOO.f26939OooO0o0);
                    if (oooOOO0 != null && oooO00o10 != null) {
                        if (!o000000O.OooO00o.OooO0O0(node)) {
                            info.Oooo000("android.widget.HorizontalScrollView");
                        }
                        if (oooOOO0.f26951OooO0O0.invoke().floatValue() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            info.OoooOoO(true);
                        }
                        if (o0ooOOo.OooO00o(node)) {
                            if (o00Ooo.OooOo(oooOOO0)) {
                                info.OooO0O0(o000O0o0.o0000OO0.OooO00o.f28222OooOO0);
                                info.OooO0O0(!o0ooOOo.OooO0OO(node) ? o000O0o0.o0000OO0.OooO00o.f28229OooOOo : o000O0o0.o0000OO0.OooO00o.f28228OooOOOo);
                            }
                            if (o00Ooo.OooOo0o(oooOOO0)) {
                                info.OooO0O0(o000O0o0.o0000OO0.OooO00o.f28223OooOO0O);
                                info.OooO0O0(!o0ooOOo.OooO0OO(node) ? o000O0o0.o0000OO0.OooO00o.f28228OooOOOo : o000O0o0.o0000OO0.OooO00o.f28229OooOOo);
                            }
                        }
                    }
                    o00000O0.OooOOO0 oooOOO1 = (o00000O0.OooOOO0) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f27005OooOOOO);
                    if (oooOOO1 != null && oooO00o10 != null) {
                        if (!o000000O.OooO00o.OooO0O0(node)) {
                            info.Oooo000("android.widget.ScrollView");
                        }
                        if (oooOOO1.f26951OooO0O0.invoke().floatValue() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            info.OoooOoO(true);
                        }
                        if (o0ooOOo.OooO00o(node)) {
                            if (o00Ooo.OooOo(oooOOO1)) {
                                info.OooO0O0(o000O0o0.o0000OO0.OooO00o.f28222OooOO0);
                                info.OooO0O0(o000O0o0.o0000OO0.OooO00o.f28230OooOOo0);
                            }
                            if (o00Ooo.OooOo0o(oooOOO1)) {
                                info.OooO0O0(o000O0o0.o0000OO0.OooO00o.f28223OooOO0O);
                                info.OooO0O0(o000O0o0.o0000OO0.OooO00o.f28227OooOOOO);
                            }
                        }
                    }
                    info.OoooO((CharSequence) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.oo000o.f26997OooO0o0));
                    if (o0ooOOo.OooO00o(node)) {
                        o00000O0.OooO00o oooO00o11 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.OooOOO.f26946OooOOO0);
                        if (oooO00o11 != null) {
                            info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(262144, oooO00o11.f26923OooO00o));
                            Unit unit12 = Unit.INSTANCE;
                        }
                        o00000O0.OooO00o oooO00o12 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.OooOOO.f26945OooOOO);
                        if (oooO00o12 != null) {
                            info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(524288, oooO00o12.f26923OooO00o));
                            Unit unit13 = Unit.INSTANCE;
                        }
                        o00000O0.OooO00o oooO00o13 = (o00000O0.OooO00o) o00000O0.OooOo00.OooO00o(node.f26967OooO0o0, o00000O0.OooOOO.f26947OooOOOO);
                        if (oooO00o13 != null) {
                            info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(1048576, oooO00o13.f26923OooO00o));
                            Unit unit14 = Unit.INSTANCE;
                        }
                        o00000O0.OooOOOO oooOOOO11 = node.f26967OooO0o0;
                        o00000O0.o0Oo0oo<List<o00000O0.OooO0o>> o0oo0oo6 = o00000O0.OooOOO.f26949OooOOo0;
                        if (oooOOOO11.OooO0O0(o0oo0oo6)) {
                            List list4 = (List) node.f26967OooO0o0.OooO0o0(o0oo0oo6);
                            int size3 = list4.size();
                            int[] iArr = o00Ooo.f6540OooOoO;
                            if (size3 >= 32) {
                                throw new IllegalStateException("Can't have more than 32 custom actions for one widget");
                            }
                            p021OooOooo.o0ooOOo<CharSequence> o0ooooo2 = new p021OooOooo.o0ooOOo<>();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            if (o00ooo2.f6548OooOO0O.OooO0o0(i)) {
                                Map<CharSequence, Integer> mapOooO0oO = o00ooo2.f6548OooOO0O.OooO0oO(i, null);
                                List<Integer> mutableList = ArraysKt.toMutableList(iArr);
                                ArrayList arrayList3 = new ArrayList();
                                int size4 = list4.size();
                                for (int i10 = 0; i10 < size4; i10++) {
                                    o00000O0.OooO0o oooO0o = (o00000O0.OooO0o) list4.get(i10);
                                    Intrinsics.checkNotNull(mapOooO0oO);
                                    Objects.requireNonNull(oooO0o);
                                    if (mapOooO0oO.containsKey(null)) {
                                        Integer num = mapOooO0oO.get(null);
                                        Intrinsics.checkNotNull(num);
                                        o0ooooo2.OooOO0O(num.intValue(), null);
                                        linkedHashMap.put(null, num);
                                        mutableList.remove(num);
                                        info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(num.intValue(), (CharSequence) null));
                                    } else {
                                        arrayList3.add(oooO0o);
                                    }
                                }
                                int size5 = arrayList3.size();
                                while (i3 < size5) {
                                    o00000O0.OooO0o oooO0o2 = (o00000O0.OooO0o) arrayList3.get(i3);
                                    int iIntValue = mutableList.get(i3).intValue();
                                    Objects.requireNonNull(oooO0o2);
                                    o0ooooo2.OooOO0O(iIntValue, null);
                                    linkedHashMap.put(null, Integer.valueOf(iIntValue));
                                    info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(iIntValue, (CharSequence) null));
                                    i3++;
                                }
                            } else {
                                int size6 = list4.size();
                                while (i3 < size6) {
                                    o00000O0.OooO0o oooO0o3 = (o00000O0.OooO0o) list4.get(i3);
                                    int i11 = o00Ooo.f6540OooOoO[i3];
                                    Objects.requireNonNull(oooO0o3);
                                    o0ooooo2.OooOO0O(i11, null);
                                    linkedHashMap.put(null, Integer.valueOf(i11));
                                    info.OooO0O0(new o000O0o0.o0000OO0.OooO00o(i11, (CharSequence) null));
                                    i3++;
                                }
                            }
                            o00ooo2.f6547OooOO0.OooOO0O(i, o0ooooo2);
                            o00ooo2.f6548OooOO0O.OooOO0O(i, linkedHashMap);
                        }
                    }
                    return info.f28214OooO00o;
                }
                info.OooOo();
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:297:0x0528  */
        /* JADX WARN: Code duplicated, block: B:300:0x0536  */
        /* JADX WARN: Code duplicated, block: B:302:0x0549  */
        /* JADX WARN: Code duplicated, block: B:303:0x0550  */
        /* JADX WARN: Code duplicated, block: B:306:0x0559  */
        /* JADX WARN: Code duplicated, block: B:308:0x0567  */
        /* JADX WARN: Code duplicated, block: B:310:0x056d  */
        /* JADX WARN: Code duplicated, block: B:312:0x058a  */
        /* JADX WARN: Code duplicated, block: B:314:0x0590  */
        /* JADX WARN: Code duplicated, block: B:352:0x065c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:353:0x065e  */
        /* JADX WARN: Code duplicated, block: B:354:0x0660  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.ui.platform.OooOO0] */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v3, types: [androidx.compose.ui.platform.OooO0O0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.ui.platform.OooOO0O, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v5, types: [androidx.compose.ui.platform.OooO00o, androidx.compose.ui.platform.OooO0o, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v6, types: [androidx.compose.ui.platform.OooO00o, androidx.compose.ui.platform.OooO0OO, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r12v7, types: [androidx.compose.ui.platform.OooO, androidx.compose.ui.platform.OooO00o, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b4 -> B:45:0x00b5). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:45:0x00b5
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
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int r17, int r18, @org.jetbrains.annotations.Nullable android.os.Bundle r19) {
            /*
                Method dump skipped, instruction units count: 1778
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.o00Ooo.OooO0o.performAction(int, int, android.os.Bundle):boolean");
        }
    }

    @VisibleForTesting
    public static final class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o00000O0.OooOOOO f6571OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Set<Integer> f6572OooO0O0;

        public OooOO0(@NotNull o00000O0.o00O0O semanticsNode, @NotNull Map<Integer, o00O> currentSemanticsNodes) {
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
            this.f6571OooO00o = semanticsNode.f26967OooO0o0;
            this.f6572OooO0O0 = new LinkedHashSet();
            List listOooO0o0 = semanticsNode.OooO0o0(false);
            int size = listOooO0o0.size();
            for (int i = 0; i < size; i++) {
                o00000O0.o00O0O o00o0o2 = (o00000O0.o00O0O) listOooO0o0.get(i);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(o00o0o2.f26966OooO0o))) {
                    this.f6572OooO0O0.add(Integer.valueOf(o00o0o2.f26966OooO0o));
                }
            }
        }
    }

    public /* synthetic */ class OooOO0O {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ oo0oOO0 f6573Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00Ooo f6574OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(oo0oOO0 oo0ooo0, o00Ooo o00ooo2) {
            super(0);
            this.f6573Oooo = oo0ooo0;
            this.f6574OoooO00 = o00ooo2;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004b  */
        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:24:0x008e  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AccessibilityEvent accessibilityEventOooOO0o;
            oo0oOO0 oo0ooo0 = this.f6573Oooo;
            o00000O0.OooOOO0 oooOOO0 = oo0ooo0.f6657OoooO;
            o00000O0.OooOOO0 oooOOO1 = oo0ooo0.f6661OoooOO0;
            Float f = oo0ooo0.f6658OoooO0;
            Float f2 = oo0ooo0.f6660OoooO0O;
            float fFloatValue = (oooOOO0 == null || f == null) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : oooOOO0.f26950OooO00o.invoke().floatValue() - f.floatValue();
            float fFloatValue2 = (oooOOO1 == null || f2 == null) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : oooOOO1.f26950OooO00o.invoke().floatValue() - f2.floatValue();
            if (fFloatValue == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                if (!(fFloatValue2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    int iOooOoO0 = this.f6574OoooO00.OooOoO0(this.f6573Oooo.f6656Oooo);
                    o00Ooo.OooOoo0(this.f6574OoooO00, iOooOoO0, RecyclerView.oo0o0Oo.FLAG_MOVED, 1, 8);
                    accessibilityEventOooOO0o = this.f6574OoooO00.OooOO0o(iOooOoO0, 4096);
                    if (oooOOO0 != null) {
                        accessibilityEventOooOO0o.setScrollX((int) oooOOO0.f26950OooO00o.invoke().floatValue());
                        accessibilityEventOooOO0o.setMaxScrollX((int) oooOOO0.f26951OooO0O0.invoke().floatValue());
                    }
                    if (oooOOO1 != null) {
                        accessibilityEventOooOO0o.setScrollY((int) oooOOO1.f26950OooO00o.invoke().floatValue());
                        accessibilityEventOooOO0o.setMaxScrollY((int) oooOOO1.f26951OooO0O0.invoke().floatValue());
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        OooO0OO.OooO00o(accessibilityEventOooOO0o, (int) fFloatValue, (int) fFloatValue2);
                    }
                    this.f6574OoooO00.OooOoO(accessibilityEventOooOO0o);
                }
            } else {
                int iOooOoO1 = this.f6574OoooO00.OooOoO0(this.f6573Oooo.f6656Oooo);
                o00Ooo.OooOoo0(this.f6574OoooO00, iOooOoO1, RecyclerView.oo0o0Oo.FLAG_MOVED, 1, 8);
                accessibilityEventOooOO0o = this.f6574OoooO00.OooOO0o(iOooOoO1, 4096);
                if (oooOOO0 != null) {
                    accessibilityEventOooOO0o.setScrollX((int) oooOOO0.f26950OooO00o.invoke().floatValue());
                    accessibilityEventOooOO0o.setMaxScrollX((int) oooOOO0.f26951OooO0O0.invoke().floatValue());
                }
                if (oooOOO1 != null) {
                    accessibilityEventOooOO0o.setScrollY((int) oooOOO1.f26950OooO00o.invoke().floatValue());
                    accessibilityEventOooOO0o.setMaxScrollY((int) oooOOO1.f26951OooO0O0.invoke().floatValue());
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    OooO0OO.OooO00o(accessibilityEventOooOO0o, (int) fFloatValue, (int) fFloatValue2);
                }
                this.f6574OoooO00.OooOoO(accessibilityEventOooOO0o);
            }
            if (oooOOO0 != null) {
                this.f6573Oooo.f6658OoooO0 = oooOOO0.f26950OooO00o.invoke();
            }
            if (oooOOO1 != null) {
                this.f6573Oooo.f6660OoooO0O = oooOOO1.f26950OooO00o.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", i = {0, 0, 1, 1}, l = {1637, 1666}, m = "boundsUpdatesEventLoop", n = {"this", "subtreeChangedSemanticsNodesIds", "this", "subtreeChangedSemanticsNodesIds"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public o00Ooo f6575Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public ChannelIterator f6577OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public p021OooOooo.o0OoOo0 f6578OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public /* synthetic */ Object f6579OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public int f6580OoooOO0;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f6579OoooO0O = obj;
            this.f6580OoooOO0 |= Integer.MIN_VALUE;
            return o00Ooo.this.OooOO0(this);
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<oo0oOO0, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oo0oOO0 oo0ooo0) {
            oo0oOO0 it = oo0ooo0;
            Intrinsics.checkNotNullParameter(it, "it");
            o00Ooo.this.OooOooo(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooOo f6582Oooo = new OooOo();

        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(o00000O0.o00Oo0.OooO0Oo(it) != null);
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooOo00 f6583Oooo = new OooOo00();

        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            o00000O0.OooOOOO oooOOOOOooO0OO;
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            o00000O0.OooOo oooOoOooO0Oo = o00000O0.o00Oo0.OooO0Oo(it);
            return Boolean.valueOf((oooOoOooO0Oo == null || (oooOOOOOooO0OO = oooOoOooO0Oo.OooO0OO()) == null || !oooOOOOOooO0OO.f26955OoooO00) ? false : true);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.o00Oo0] */
    public o00Ooo(@NotNull AndroidComposeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f6542OooO0Oo = view;
        this.f6544OooO0o0 = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f6543OooO0o = (AccessibilityManager) systemService;
        this.f6545OooO0oO = new Handler(Looper.getMainLooper());
        this.f6546OooO0oo = new p072o000O0o0.o000(new OooO0o());
        this.f6541OooO = Integer.MIN_VALUE;
        this.f6547OooOO0 = new p021OooOooo.o0ooOOo<>();
        this.f6548OooOO0O = new p021OooOooo.o0ooOOo<>();
        this.f6549OooOO0o = -1;
        final int i = 0;
        this.f6550OooOOO = new p021OooOooo.o0OoOo0<>(0);
        this.f6552OooOOOO = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.f6553OooOOOo = true;
        this.f6554OooOOo = MapsKt.emptyMap();
        this.f6556OooOOoo = new p021OooOooo.o0OoOo0<>(0);
        this.f6559OooOo00 = new LinkedHashMap();
        this.f6558OooOo0 = new OooOO0(view.getF6224OoooOoo().OooO00o(), MapsKt.emptyMap());
        view.addOnAttachStateChangeListener(new OooO00o());
        this.f6561OooOo0o = new Runnable() { // from class: androidx.compose.ui.platform.o00Oo0
            /* JADX WARN: Code duplicated, block: B:171:0x045e  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList, java.util.List<androidx.compose.ui.platform.oo0oOO0>] */
            /* JADX WARN: Type inference failed for: r3v19, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, androidx.compose.ui.platform.o00Ooo$OooOO0>] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, androidx.compose.ui.platform.o00Ooo$OooOO0>] */
            /* JADX WARN: Type inference failed for: r7v9, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, androidx.compose.ui.platform.o00Ooo$OooOO0>] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList, java.util.List<androidx.compose.ui.platform.oo0oOO0>] */
            /*  JADX ERROR: NullPointerException in pass: ProcessVariables
                java.lang.NullPointerException
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
                	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 1474
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.o00Oo0.run():void");
            }
        };
        this.f6557OooOo = new ArrayList();
        this.f6562OooOoO0 = new OooOOOO();
    }

    public static final boolean OooOo(o00000O0.OooOOO0 oooOOO0) {
        return (oooOOO0.f26950OooO00o.invoke().floatValue() < oooOOO0.f26951OooO0O0.invoke().floatValue() && !oooOOO0.f26952OooO0OO) || (oooOOO0.f26950OooO00o.invoke().floatValue() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && oooOOO0.f26952OooO0OO);
    }

    public static final boolean OooOo0(o00000O0.OooOOO0 oooOOO0, float f) {
        return (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && oooOOO0.f26950OooO00o.invoke().floatValue() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) || (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && oooOOO0.f26950OooO00o.invoke().floatValue() < oooOOO0.f26951OooO0O0.invoke().floatValue());
    }

    public static final float OooOo0O(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public static final boolean OooOo0o(o00000O0.OooOOO0 oooOOO0) {
        return (oooOOO0.f26950OooO00o.invoke().floatValue() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && !oooOOO0.f26952OooO0OO) || (oooOOO0.f26950OooO00o.invoke().floatValue() < oooOOO0.f26951OooO0O0.invoke().floatValue() && oooOOO0.f26952OooO0OO);
    }

    public static /* synthetic */ boolean OooOoo0(o00Ooo o00ooo2, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        return o00ooo2.OooOoOO(i, i2, num, null);
    }

    @Override // androidx.core.view.OooO00o
    @NotNull
    public final p072o000O0o0.o000 OooO0O0(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return this.f6546OooO0oo;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:13:0x002f, B:23:0x0055, B:27:0x0067, B:29:0x006f, B:31:0x0078, B:33:0x007f, B:34:0x0090, B:36:0x0097, B:37:0x00a0, B:18:0x0042), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:13:0x002f, B:23:0x0055, B:27:0x0067, B:29:0x006f, B:31:0x0078, B:33:0x007f, B:34:0x0090, B:36:0x0097, B:37:0x00a0, B:18:0x0042), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f A[Catch: all -> 0x00b6, LOOP:0: B:32:0x007d->B:33:0x007f, LOOP_END, TryCatch #1 {all -> 0x00b6, blocks: (B:13:0x002f, B:23:0x0055, B:27:0x0067, B:29:0x006f, B:31:0x0078, B:33:0x007f, B:34:0x0090, B:36:0x0097, B:37:0x00a0, B:18:0x0042), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0097 A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:13:0x002f, B:23:0x0055, B:27:0x0067, B:29:0x006f, B:31:0x0078, B:33:0x007f, B:34:0x0090, B:36:0x0097, B:37:0x00a0, B:18:0x0042), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b3 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object OooOO0(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.platform.o00Ooo.OooOOO0
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.ui.platform.o00Ooo$OooOOO0 r0 = (androidx.compose.ui.platform.o00Ooo.OooOOO0) r0
            int r1 = r0.f6580OoooOO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6580OoooOO0 = r1
            goto L18
        L13:
            androidx.compose.ui.platform.o00Ooo$OooOOO0 r0 = new androidx.compose.ui.platform.o00Ooo$OooOOO0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f6579OoooO0O
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6580OoooOO0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3c
            if (r2 != r3) goto L34
            kotlinx.coroutines.channels.ChannelIterator r2 = r0.f6577OoooO0
            OooOooo.o0OoOo0 r6 = r0.f6578OoooO00
            androidx.compose.ui.platform.o00Ooo r7 = r0.f6575Oooo
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> Lb6
        L32:
            r12 = r6
            goto L55
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3c:
            kotlinx.coroutines.channels.ChannelIterator r2 = r0.f6577OoooO0
            OooOooo.o0OoOo0 r6 = r0.f6578OoooO00
            androidx.compose.ui.platform.o00Ooo r7 = r0.f6575Oooo
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> Lb6
            goto L67
        L46:
            kotlin.ResultKt.throwOnFailure(r12)
            OooOooo.o0OoOo0 r12 = new OooOooo.o0OoOo0     // Catch: java.lang.Throwable -> Lc0
            r12.<init>(r4)     // Catch: java.lang.Throwable -> Lc0
            kotlinx.coroutines.channels.Channel<kotlin.Unit> r2 = r11.f6552OooOOOO     // Catch: java.lang.Throwable -> Lc0
            kotlinx.coroutines.channels.ChannelIterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lc0
            r7 = r11
        L55:
            r0.f6575Oooo = r7     // Catch: java.lang.Throwable -> Lb6
            r0.f6578OoooO00 = r12     // Catch: java.lang.Throwable -> Lb6
            r0.f6577OoooO0 = r2     // Catch: java.lang.Throwable -> Lb6
            r0.f6580OoooOO0 = r5     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r6 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> Lb6
            if (r6 != r1) goto L64
            return r1
        L64:
            r10 = r6
            r6 = r12
            r12 = r10
        L67:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> Lb6
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> Lb6
            if (r12 == 0) goto Lb8
            r2.next()     // Catch: java.lang.Throwable -> Lb6
            boolean r12 = r7.OooOOoo()     // Catch: java.lang.Throwable -> Lb6
            if (r12 == 0) goto La0
            OooOooo.o0OoOo0<androidx.compose.ui.node.LayoutNode> r12 = r7.f6550OooOOO     // Catch: java.lang.Throwable -> Lb6
            int r12 = r12.f432OoooO0     // Catch: java.lang.Throwable -> Lb6
            r8 = 0
        L7d:
            if (r8 >= r12) goto L90
            OooOooo.o0OoOo0<androidx.compose.ui.node.LayoutNode> r9 = r7.f6550OooOOO     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object[] r9 = r9.f433OoooO00     // Catch: java.lang.Throwable -> Lb6
            r9 = r9[r8]     // Catch: java.lang.Throwable -> Lb6
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)     // Catch: java.lang.Throwable -> Lb6
            androidx.compose.ui.node.LayoutNode r9 = (androidx.compose.ui.node.LayoutNode) r9     // Catch: java.lang.Throwable -> Lb6
            r7.Oooo00O(r9, r6)     // Catch: java.lang.Throwable -> Lb6
            int r8 = r8 + 1
            goto L7d
        L90:
            r6.clear()     // Catch: java.lang.Throwable -> Lb6
            boolean r12 = r7.f6560OooOo0O     // Catch: java.lang.Throwable -> Lb6
            if (r12 != 0) goto La0
            r7.f6560OooOo0O = r5     // Catch: java.lang.Throwable -> Lb6
            android.os.Handler r12 = r7.f6545OooO0oO     // Catch: java.lang.Throwable -> Lb6
            androidx.compose.ui.platform.o00Oo0 r8 = r7.f6561OooOo0o     // Catch: java.lang.Throwable -> Lb6
            r12.post(r8)     // Catch: java.lang.Throwable -> Lb6
        La0:
            OooOooo.o0OoOo0<androidx.compose.ui.node.LayoutNode> r12 = r7.f6550OooOOO     // Catch: java.lang.Throwable -> Lb6
            r12.clear()     // Catch: java.lang.Throwable -> Lb6
            r8 = 100
            r0.f6575Oooo = r7     // Catch: java.lang.Throwable -> Lb6
            r0.f6578OoooO00 = r6     // Catch: java.lang.Throwable -> Lb6
            r0.f6577OoooO0 = r2     // Catch: java.lang.Throwable -> Lb6
            r0.f6580OoooOO0 = r3     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r8, r0)     // Catch: java.lang.Throwable -> Lb6
            if (r12 != r1) goto L32
            return r1
        Lb6:
            r12 = move-exception
            goto Lc2
        Lb8:
            OooOooo.o0OoOo0<androidx.compose.ui.node.LayoutNode> r12 = r7.f6550OooOOO
            r12.clear()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        Lc0:
            r12 = move-exception
            r7 = r11
        Lc2:
            OooOooo.o0OoOo0<androidx.compose.ui.node.LayoutNode> r0 = r7.f6550OooOOO
            r0.clear()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.o00Ooo.OooOO0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
    public final boolean OooOO0O(boolean z, int i, long j) {
        o00000O0.o0Oo0oo<o00000O0.OooOOO0> o0oo0oo2;
        boolean z2;
        o00000O0.OooOOO0 oooOOO0;
        Collection<o00O> currentSemanticsNodes = OooOOOo().values();
        Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30409OooO0O0;
        if (o00O0O.OooO.OooO00o(j, o00O0O.OooO.f30412OooO0o0)) {
            return false;
        }
        if (!((Float.isNaN(o00O0O.OooO.OooO0OO(j)) || Float.isNaN(o00O0O.OooO.OooO0Oo(j))) ? false : true)) {
            throw new IllegalStateException("Offset argument contained a NaN value.".toString());
        }
        if (z) {
            o00000O0.oo000o oo000oVar = o00000O0.oo000o.f26992OooO00o;
            o0oo0oo2 = o00000O0.oo000o.f27005OooOOOO;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            o00000O0.oo000o oo000oVar2 = o00000O0.oo000o.f26992OooO00o;
            o0oo0oo2 = o00000O0.oo000o.f27003OooOOO;
        }
        if (currentSemanticsNodes.isEmpty()) {
            return false;
        }
        for (o00O o00o2 : currentSemanticsNodes) {
            Rect rect = o00o2.f6466OooO0O0;
            Intrinsics.checkNotNullParameter(rect, "<this>");
            if ((o00O0O.OooO.OooO0OO(j) >= ((float) rect.left) && o00O0O.OooO.OooO0OO(j) < ((float) rect.right) && o00O0O.OooO.OooO0Oo(j) >= ((float) rect.top) && o00O0O.OooO.OooO0Oo(j) < ((float) rect.bottom)) && (oooOOO0 = (o00000O0.OooOOO0) o00000O0.OooOo00.OooO00o(o00o2.f6465OooO00o.OooO0o(), o0oo0oo2)) != null) {
                boolean z3 = oooOOO0.f26952OooO0OO;
                int i2 = z3 ? -i : i;
                if (i == 0 && z3) {
                    i2 = -1;
                }
                if (i2 >= 0 ? oooOOO0.f26950OooO00o.invoke().floatValue() >= oooOOO0.f26951OooO0O0.invoke().floatValue() : oooOOO0.f26950OooO00o.invoke().floatValue() <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    @NotNull
    public final AccessibilityEvent OooOO0o(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        Intrinsics.checkNotNullExpressionValue(accessibilityEventObtain, "obtain(eventType)");
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.f6542OooO0Oo.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.f6542OooO0Oo, i);
        o00O o00o2 = OooOOOo().get(Integer.valueOf(i));
        if (o00o2 != null) {
            o00000O0.OooOOOO oooOOOOOooO0o = o00o2.f6465OooO00o.OooO0o();
            o00000O0.oo000o oo000oVar = o00000O0.oo000o.f26992OooO00o;
            accessibilityEventObtain.setPassword(oooOOOOOooO0o.OooO0O0(o00000O0.oo000o.f27015OooOoO));
        }
        return accessibilityEventObtain;
    }

    public final int OooOOO(o00000O0.o00O0O o00o0o2) {
        o00000O0.OooOOOO oooOOOO = o00o0o2.f26967OooO0o0;
        o00000O0.oo000o oo000oVar = o00000O0.oo000o.f26992OooO00o;
        if (!oooOOOO.OooO0O0(o00000O0.oo000o.f26993OooO0O0)) {
            o00000O0.OooOOOO oooOOOO2 = o00o0o2.f26967OooO0o0;
            o00000O0.o0Oo0oo<o00000O.o0OO00O> o0oo0oo2 = o00000O0.oo000o.f27013OooOo0O;
            if (oooOOOO2.OooO0O0(o0oo0oo2)) {
                return o00000O.o0OO00O.OooO0Oo(((o00000O.o0OO00O) o00o0o2.f26967OooO0o0.OooO0o0(o0oo0oo2)).f26895OooO00o);
            }
        }
        return this.f6549OooOO0o;
    }

    public final AccessibilityEvent OooOOO0(int i, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent accessibilityEventOooOO0o = OooOO0o(i, 8192);
        if (num != null) {
            accessibilityEventOooOO0o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventOooOO0o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventOooOO0o.setItemCount(num3.intValue());
        }
        if (str != null) {
            accessibilityEventOooOO0o.getText().add(str);
        }
        return accessibilityEventOooOO0o;
    }

    public final int OooOOOO(o00000O0.o00O0O o00o0o2) {
        o00000O0.OooOOOO oooOOOO = o00o0o2.f26967OooO0o0;
        o00000O0.oo000o oo000oVar = o00000O0.oo000o.f26992OooO00o;
        if (!oooOOOO.OooO0O0(o00000O0.oo000o.f26993OooO0O0)) {
            o00000O0.OooOOOO oooOOOO2 = o00o0o2.f26967OooO0o0;
            o00000O0.o0Oo0oo<o00000O.o0OO00O> o0oo0oo2 = o00000O0.oo000o.f27013OooOo0O;
            if (oooOOOO2.OooO0O0(o0oo0oo2)) {
                return (int) (((o00000O.o0OO00O) o00o0o2.f26967OooO0o0.OooO0o0(o0oo0oo2)).f26895OooO00o >> 32);
            }
        }
        return this.f6549OooOO0o;
    }

    public final Map<Integer, o00O> OooOOOo() {
        if (this.f6553OooOOOo) {
            o00000O0.o00Ooo f6224OoooOoo = this.f6542OooO0Oo.getF6224OoooOoo();
            Intrinsics.checkNotNullParameter(f6224OoooOoo, "<this>");
            o00000O0.o00O0O o00o0oOooO00o = f6224OoooOoo.OooO00o();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LayoutNode layoutNode = o00o0oOooO00o.f26968OooO0oO;
            if (layoutNode.f6170Ooooooo && layoutNode.OooOoo0()) {
                Region region = new Region();
                region.set(p146o00Oo0.o000O0.OooO00o(o00o0oOooO00o.OooO0Oo()));
                o0ooOOo.OooO0oO(region, o00o0oOooO00o, linkedHashMap, o00o0oOooO00o);
            }
            this.f6554OooOOo = linkedHashMap;
            this.f6553OooOOOo = false;
        }
        return this.f6554OooOOo;
    }

    public final o00000O.OooO00o OooOOo(o00000O0.OooOOOO oooOOOO) {
        o00000O0.oo000o oo000oVar = o00000O0.oo000o.f26992OooO00o;
        return (o00000O.OooO00o) o00000O0.OooOo00.OooO00o(oooOOOO, o00000O0.oo000o.f27011OooOo0);
    }

    public final String OooOOo0(o00000O0.o00O0O o00o0o2) {
        o00000O.OooO00o oooO00o;
        if (o00o0o2 == null) {
            return null;
        }
        o00000O0.OooOOOO oooOOOO = o00o0o2.f26967OooO0o0;
        o00000O0.oo000o oo000oVar = o00000O0.oo000o.f26992OooO00o;
        o00000O0.o0Oo0oo<List<String>> o0oo0oo2 = o00000O0.oo000o.f26993OooO0O0;
        if (oooOOOO.OooO0O0(o0oo0oo2)) {
            return p048OoooooO.o0oOOo.OooO00o((List) o00o0o2.f26967OooO0o0.OooO0o0(o0oo0oo2));
        }
        if (o0ooOOo.OooO0Oo(o00o0o2)) {
            o00000O.OooO00o oooO00oOooOOo = OooOOo(o00o0o2.f26967OooO0o0);
            if (oooO00oOooOOo != null) {
                return oooO00oOooOOo.f26774Oooo;
            }
            return null;
        }
        List list = (List) o00000O0.OooOo00.OooO00o(o00o0o2.f26967OooO0o0, o00000O0.oo000o.f27012OooOo00);
        if (list == null || (oooO00o = (o00000O.OooO00o) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return oooO00o.f26774Oooo;
    }

    public final boolean OooOOoo() {
        return this.f6543OooO0o.isEnabled() && this.f6543OooO0o.isTouchExplorationEnabled();
    }

    public final void OooOo00(LayoutNode layoutNode) {
        if (this.f6550OooOOO.add(layoutNode)) {
            this.f6552OooOOOO.mo2017trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    public final boolean OooOoO(AccessibilityEvent accessibilityEvent) {
        if (OooOOoo()) {
            return this.f6542OooO0Oo.getParent().requestSendAccessibilityEvent(this.f6542OooO0Oo, accessibilityEvent);
        }
        return false;
    }

    public final int OooOoO0(int i) {
        if (i == this.f6542OooO0Oo.getF6224OoooOoo().OooO00o().f26966OooO0o) {
            return -1;
        }
        return i;
    }

    public final boolean OooOoOO(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !OooOOoo()) {
            return false;
        }
        AccessibilityEvent accessibilityEventOooOO0o = OooOO0o(i, i2);
        if (num != null) {
            accessibilityEventOooOO0o.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventOooOO0o.setContentDescription(p048OoooooO.o0oOOo.OooO00o(list));
        }
        return OooOoO(accessibilityEventOooOO0o);
    }

    public final void OooOoo(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventOooOO0o = OooOO0o(OooOoO0(i), 32);
        accessibilityEventOooOO0o.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventOooOO0o.getText().add(str);
        }
        OooOoO(accessibilityEventOooOO0o);
    }

    public final void OooOooO(int i) {
        OooO oooO = this.f6555OooOOo0;
        if (oooO != null) {
            if (i != oooO.f6563OooO00o.f26966OooO0o) {
                return;
            }
            if (SystemClock.uptimeMillis() - oooO.f6567OooO0o <= 1000) {
                AccessibilityEvent accessibilityEventOooOO0o = OooOO0o(OooOoO0(oooO.f6563OooO00o.f26966OooO0o), 131072);
                accessibilityEventOooOO0o.setFromIndex(oooO.f6566OooO0Oo);
                accessibilityEventOooOO0o.setToIndex(oooO.f6568OooO0o0);
                accessibilityEventOooOO0o.setAction(oooO.f6564OooO0O0);
                accessibilityEventOooOO0o.setMovementGranularity(oooO.f6565OooO0OO);
                accessibilityEventOooOO0o.getText().add(OooOOo0(oooO.f6563OooO00o));
                OooOoO(accessibilityEventOooOO0o);
            }
        }
        this.f6555OooOOo0 = null;
    }

    public final void OooOooo(oo0oOO0 oo0ooo0) {
        if (oo0ooo0.f6659OoooO00.contains(oo0ooo0)) {
            this.f6542OooO0Oo.getF6262o00Oo0().OooO00o(oo0ooo0, this.f6562OooOoO0, new OooOOO(oo0ooo0, this));
        }
    }

    public final CharSequence Oooo0(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        return charSequence.subSequence(0, i);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, androidx.compose.ui.platform.o00Ooo$OooOO0>] */
    public final void Oooo000(o00000O0.o00O0O o00o0o2, OooOO0 oooOO1) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listOooO0o0 = o00o0o2.OooO0o0(false);
        int size = listOooO0o0.size();
        for (int i = 0; i < size; i++) {
            o00000O0.o00O0O o00o0o3 = (o00000O0.o00O0O) listOooO0o0.get(i);
            if (OooOOOo().containsKey(Integer.valueOf(o00o0o3.f26966OooO0o))) {
                if (!oooOO1.f6572OooO0O0.contains(Integer.valueOf(o00o0o3.f26966OooO0o))) {
                    OooOo00(o00o0o2.f26968OooO0oO);
                    return;
                }
                linkedHashSet.add(Integer.valueOf(o00o0o3.f26966OooO0o));
            }
        }
        Iterator<Integer> it = oooOO1.f6572OooO0O0.iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(it.next().intValue()))) {
                OooOo00(o00o0o2.f26968OooO0oO);
                return;
            }
        }
        List listOooO0o1 = o00o0o2.OooO0o0(false);
        int size2 = listOooO0o1.size();
        for (int i2 = 0; i2 < size2; i2++) {
            o00000O0.o00O0O o00o0o4 = (o00000O0.o00O0O) listOooO0o1.get(i2);
            if (OooOOOo().containsKey(Integer.valueOf(o00o0o4.f26966OooO0o))) {
                Object obj = this.f6559OooOo00.get(Integer.valueOf(o00o0o4.f26966OooO0o));
                Intrinsics.checkNotNull(obj);
                Oooo000(o00o0o4, (OooOO0) obj);
            }
        }
    }

    public final void Oooo00O(LayoutNode layoutNode, p021OooOooo.o0OoOo0<Integer> o0oooo1) {
        LayoutNode layoutNodeOooO0o;
        o00000O0.OooOo oooOoOooO0Oo;
        if (layoutNode.OooOoo0() && !this.f6542OooO0Oo.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            o00000O0.OooOo oooOoOooO0Oo2 = o00000O0.o00Oo0.OooO0Oo(layoutNode);
            if (oooOoOooO0Oo2 == null) {
                LayoutNode layoutNodeOooO0o2 = o0ooOOo.OooO0o(layoutNode, OooOo.f6582Oooo);
                oooOoOooO0Oo2 = layoutNodeOooO0o2 != null ? o00000O0.o00Oo0.OooO0Oo(layoutNodeOooO0o2) : null;
                if (oooOoOooO0Oo2 == null) {
                    return;
                }
            }
            if (!oooOoOooO0Oo2.OooO0OO().f26955OoooO00 && (layoutNodeOooO0o = o0ooOOo.OooO0o(layoutNode, OooOo00.f6583Oooo)) != null && (oooOoOooO0Oo = o00000O0.o00Oo0.OooO0Oo(layoutNodeOooO0o)) != null) {
                oooOoOooO0Oo2 = oooOoOooO0Oo;
            }
            int id = ((o00000O0.Oooo000) oooOoOooO0Oo2.f26672OoooO00).getId();
            if (o0oooo1.add(Integer.valueOf(id))) {
                OooOoo0(this, OooOoO0(id), RecyclerView.oo0o0Oo.FLAG_MOVED, 1, 8);
            }
        }
    }

    public final boolean Oooo00o(o00000O0.o00O0O o00o0o2, int i, int i2, boolean z) {
        String strOooOOo0;
        o00000O0.OooOOOO oooOOOO = o00o0o2.f26967OooO0o0;
        o00000O0.OooOOO oooOOO = o00000O0.OooOOO.f26934OooO00o;
        o00000O0.o0Oo0oo<o00000O0.OooO00o<Function3<Integer, Integer, Boolean, Boolean>>> o0oo0oo2 = o00000O0.OooOOO.f26941OooO0oo;
        if (oooOOOO.OooO0O0(o0oo0oo2) && o0ooOOo.OooO00o(o00o0o2)) {
            Function3 function3 = (Function3) ((o00000O0.OooO00o) o00o0o2.f26967OooO0o0.OooO0o0(o0oo0oo2)).f26924OooO0O0;
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        }
        if ((i == i2 && i2 == this.f6549OooOO0o) || (strOooOOo0 = OooOOo0(o00o0o2)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > strOooOOo0.length()) {
            i = -1;
        }
        this.f6549OooOO0o = i;
        boolean z2 = strOooOOo0.length() > 0;
        OooOoO(OooOOO0(OooOoO0(o00o0o2.f26966OooO0o), z2 ? Integer.valueOf(this.f6549OooOO0o) : null, z2 ? Integer.valueOf(this.f6549OooOO0o) : null, z2 ? Integer.valueOf(strOooOOo0.length()) : null, strOooOOo0));
        OooOooO(o00o0o2.f26966OooO0o);
        return true;
    }

    public final void Oooo0O0(int i) {
        int i2 = this.f6544OooO0o0;
        if (i2 == i) {
            return;
        }
        this.f6544OooO0o0 = i;
        OooOoo0(this, i, 128, null, 12);
        OooOoo0(this, i2, 256, null, 12);
    }
}
