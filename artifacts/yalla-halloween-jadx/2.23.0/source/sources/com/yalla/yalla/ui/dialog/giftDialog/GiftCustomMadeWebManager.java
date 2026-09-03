package com.yalla.yalla.ui.dialog.giftDialog;

import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOOO;
import com.code.android.util.o000OO00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139o00OOooO.OooO0o;
import p140o00OOooo.OooOO0;
import p464o0Oooo.o000000O;
import p520o0o0O0oo.d6;
import p520o0o0O0oo.r5;
import p533o0o0Oo0.oo0O;
import p572o0oOoOO0.oO000Oo0;
import p641o0ooOOOO.x8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class GiftCustomMadeWebManager {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function3<? super Integer, ? super String, ? super GiftPropModel, Unit> f27995OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27996OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final FrameLayout f27997OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final x8 f27998OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f27999OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public RoomUserInfoModel f28000OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f28001OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f28002OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f28003OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f28004OooOO0;

    public static final class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            GiftPropModel giftPropModel = obj instanceof GiftPropModel ? (GiftPropModel) obj : null;
            boolean z = false;
            if (giftPropModel != null && giftPropModel.isCustomMade()) {
                z = true;
            }
            if (z) {
                GiftCustomMadeWebManager.OooO00o(GiftCustomMadeWebManager.this);
            }
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$try2ExitPage$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftCustomMadeWebManager.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            GiftCustomMadeWebManager giftCustomMadeWebManager = GiftCustomMadeWebManager.this;
            ScrollView scrollView = giftCustomMadeWebManager.f27998OooO0OO.f59339OooO0o0.f57486OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
            if (o000OO00.OooO0o0(scrollView)) {
                GiftCustomMadeWebManager.OooO00o(giftCustomMadeWebManager);
            } else {
                x8 x8Var = giftCustomMadeWebManager.f27998OooO0OO;
                SVGAView sVGAView = x8Var.f59336OooO0OO;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
                o000OO00.OooOOOO(sVGAView);
                TextView textView = x8Var.f59337OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSaving");
                o000OO00.OooOOOO(textView);
                BaseWebView baseWebView = x8Var.f59338OooO0o;
                Intrinsics.checkNotNullExpressionValue(baseWebView, "binding.webView");
                Intrinsics.checkNotNullParameter(baseWebView, "<this>");
                oO000Oo0.OooO00o(baseWebView, "customGiftSavePage()");
            }
            return Unit.INSTANCE;
        }
    }

    public GiftCustomMadeWebManager(@NotNull FragmentActivity context, @NotNull FrameLayout overrideGiftContainer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overrideGiftContainer, "overrideGiftContainer");
        this.f27996OooO00o = context;
        this.f27997OooO0O0 = overrideGiftContainer;
        x8 x8VarInflate = x8.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(x8VarInflate, "inflate(LayoutInflater.from(context))");
        this.f27998OooO0OO = x8VarInflate;
        context.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    GiftCustomMadeWebManager giftCustomMadeWebManager = GiftCustomMadeWebManager.this;
                    giftCustomMadeWebManager.getClass();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        if (giftCustomMadeWebManager.f28001OooO0o0) {
                            giftCustomMadeWebManager.f27998OooO0OO.f59338OooO0o.OooO0Oo();
                        }
                        Result.m4213constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m4213constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        });
        LiveEventBus.get("SendGiftSuccess").observe(context, new OooO00o());
    }

    public static final void OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f27996OooO00o), new r5(giftCustomMadeWebManager, null));
    }

    public final void OooO0O0() {
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(this.f27996OooO00o), new OooO0O0(null));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO() {
        MutableStateFlow<String> userHeader;
        String value;
        RoomUserInfoModel roomUserInfoModelOooO0o0;
        MutableStateFlow<String> userHeader2;
        String value2;
        String strOooO0o0;
        RoomUserInfoModel roomUserInfoModelOooO0o1;
        MutableStateFlow<String> userHeader3;
        String value3;
        if (this.f28001OooO0o0) {
            HashMap map = new HashMap();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String str = (String) o000000O.OooO().getValue();
            String str2 = "";
            if (str == null) {
                str = "";
            }
            map.put("self", str);
            RoomUserInfoModel roomUserInfoModel = this.f28000OooO0o;
            if (Intrinsics.areEqual(roomUserInfoModel, d6.f53265OooO0o0)) {
                map.put("other", "");
            } else {
                RoomUserInfoModel roomUserInfoModelOooO0o2 = null;
                boolean z = false;
                if (Intrinsics.areEqual(roomUserInfoModel, d6.f53266OooO0oO)) {
                    Iterator<T> it = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            roomUserInfoModelOooO0o1 = null;
                            break;
                        }
                        oo0O oo0o = (oo0O) it.next();
                        if (oo0o.f54838OooO0OO.getValue().longValue() > 0) {
                            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                            roomUserInfoModelOooO0o1 = com.yalla.yalla.service.room.OooO00o.OooO0o0(oo0o.f54838OooO0OO.getValue());
                            break;
                        }
                    }
                    if (roomUserInfoModelOooO0o1 != null) {
                        long jLongValue = roomUserInfoModelOooO0o1.getUserId().getValue().longValue();
                        o000000O o000000o3 = o000000O.f46674OooO00o;
                        Long l = (Long) o000000O.OooOOo0().getValue();
                        if (l != null && jLongValue == l.longValue()) {
                            roomUserInfoModelOooO0o1 = null;
                        }
                    } else {
                        roomUserInfoModelOooO0o1 = null;
                    }
                    if (roomUserInfoModelOooO0o1 == null) {
                        for (oo0O oo0o2 : com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O) {
                            if (oo0o2.f54838OooO0OO.getValue().longValue() > 0) {
                                if (z) {
                                    ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                                    roomUserInfoModelOooO0o2 = com.yalla.yalla.service.room.OooO00o.OooO0o0(oo0o2.f54838OooO0OO.getValue());
                                    break;
                                }
                                z = true;
                            }
                        }
                    } else {
                        roomUserInfoModelOooO0o2 = roomUserInfoModelOooO0o1;
                    }
                    if (roomUserInfoModelOooO0o2 != null && (userHeader3 = roomUserInfoModelOooO0o2.getUserHeader()) != null && (value3 = userHeader3.getValue()) != null) {
                        str2 = value3;
                    }
                    map.put("other", str2);
                } else if (Intrinsics.areEqual(roomUserInfoModel, d6.f53264OooO0o)) {
                    p475o0o000.o000000O o000000o4 = com.yalla.yalla.service.room.OooO00o.f24981OooOO0;
                    Long l2 = (Long) CollectionsKt.getOrNull(o000000o4.f47414OooO0OO, 0);
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        Long l3 = (Long) o000000O.OooOOo0().getValue();
                        if (l3 != null && jLongValue2 == l3.longValue()) {
                            roomUserInfoModelOooO0o0 = null;
                        } else {
                            ArrayList arrayList3 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                            roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(jLongValue2));
                        }
                    } else {
                        roomUserInfoModelOooO0o0 = null;
                    }
                    if (roomUserInfoModelOooO0o0 == null) {
                        Long l4 = (Long) CollectionsKt.getOrNull(o000000o4.f47414OooO0OO, 1);
                        if (l4 != null) {
                            long jLongValue3 = l4.longValue();
                            ArrayList arrayList4 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                            roomUserInfoModelOooO0o2 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(jLongValue3));
                        }
                    } else {
                        roomUserInfoModelOooO0o2 = roomUserInfoModelOooO0o0;
                    }
                    if (roomUserInfoModelOooO0o2 != null && (userHeader2 = roomUserInfoModelOooO0o2.getUserHeader()) != null && (value2 = userHeader2.getValue()) != null && (strOooO0o0 = OooO0o.OooO0o0(value2)) != null) {
                        str2 = strOooO0o0;
                    }
                    map.put("other", str2);
                } else {
                    RoomUserInfoModel roomUserInfoModel2 = this.f28000OooO0o;
                    if (roomUserInfoModel2 != null && (userHeader = roomUserInfoModel2.getUserHeader()) != null && (value = userHeader.getValue()) != null) {
                        str2 = value;
                    }
                    map.put("other", str2);
                }
            }
            BaseWebView baseWebView = this.f27998OooO0OO.f59338OooO0o;
            Intrinsics.checkNotNullExpressionValue(baseWebView, "binding.webView");
            String jsonString = OooOO0.OooO00o(map);
            Intrinsics.checkNotNullParameter(baseWebView, "<this>");
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            oO000Oo0.OooO00o(baseWebView, "customGiftGetReceiveHead(" + jsonString + ")");
        }
    }
}
