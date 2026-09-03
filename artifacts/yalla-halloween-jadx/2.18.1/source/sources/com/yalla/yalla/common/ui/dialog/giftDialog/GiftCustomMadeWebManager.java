package com.yalla.yalla.common.ui.dialog.giftDialog;

import android.util.SparseArray;
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
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.HashMap;
import java.util.Objects;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00OO0OO;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.oOO00O;
import p498o0o00Oo0.OooOOO;
import p501o0o00o.o00000;
import p501o0o00o.o0OOO0o;
import p501o0o00o.o0ooOOo;
import p516o0o0O000.o0Oo0oo;
import p522o0o0O0o.o00OO000;
import p530o0o0OOO.o00O;
import p649o0ooOOoo.ig;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class GiftCustomMadeWebManager {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function3<? super Integer, ? super String, ? super GiftPropModel, Unit> f20891OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f20892OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final FrameLayout f20893OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ig f20894OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f20895OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public RoomUserInfoModel f20896OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f20897OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f20898OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f20899OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f20900OooOO0;

    @DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager$try2ExitPage$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GiftCustomMadeWebManager.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ScrollView scrollView = GiftCustomMadeWebManager.this.f20894OooO0OO.f49680OooO0o0.f49665OooO00o;
            Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
            if (oOO00O.OooO0Oo(scrollView)) {
                GiftCustomMadeWebManager.OooO00o(GiftCustomMadeWebManager.this);
            } else {
                SVGAView sVGAView = GiftCustomMadeWebManager.this.f20894OooO0OO.f49677OooO0OO;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
                oOO00O.OooO(sVGAView);
                TextView textView = GiftCustomMadeWebManager.this.f20894OooO0OO.f49678OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSaving");
                oOO00O.OooO(textView);
                BaseWebView baseWebView = GiftCustomMadeWebManager.this.f20894OooO0OO.f49679OooO0o;
                Intrinsics.checkNotNullExpressionValue(baseWebView, "binding.webView");
                Intrinsics.checkNotNullParameter(baseWebView, "<this>");
                o00OO000.OooO00o(baseWebView, "customGiftSavePage()");
            }
            return Unit.INSTANCE;
        }
    }

    public GiftCustomMadeWebManager(@NotNull FragmentActivity context, @NotNull FrameLayout overrideGiftContainer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overrideGiftContainer, "overrideGiftContainer");
        this.f20892OooO00o = context;
        this.f20893OooO0O0 = overrideGiftContainer;
        ig igVarInflate = ig.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(igVarInflate, "inflate(LayoutInflater.from(context))");
        this.f20894OooO0OO = igVarInflate;
        context.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    GiftCustomMadeWebManager giftCustomMadeWebManager = GiftCustomMadeWebManager.this;
                    Objects.requireNonNull(giftCustomMadeWebManager);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        if (giftCustomMadeWebManager.f20897OooO0o0) {
                            giftCustomMadeWebManager.f20894OooO0OO.f49679OooO0o.OooO0OO();
                        }
                        Result.m502constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m502constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        });
        LiveEventBus.get("SendGiftSuccess").observe(context, new o0ooOOo(this, 0));
    }

    public static final void OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f20892OooO00o), new o0OOO0o(giftCustomMadeWebManager, null));
    }

    public final void OooO0O0() {
        o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this.f20892OooO00o), new OooO00o(null));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    public final void OooO0OO() {
        String userHeader;
        RoomUserInfoModel roomUserInfoModelOooOO0;
        String userHeader2;
        String strImgPng;
        RoomUserInfoModel roomUserInfoModel;
        String userHeader3;
        if (this.f20897OooO0o0) {
            HashMap map = new HashMap();
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            String value = oooOOO.OooO0oo().getValue();
            String str = "";
            if (value == null) {
                value = "";
            }
            map.put("self", value);
            RoomUserInfoModel roomUserInfoModel2 = this.f20896OooO0o;
            o00000.OooO00o oooO00o = o00000.f41437OooO0o0;
            RoomUserInfoModel roomUserInfoModelOooOO1 = null;
            if (Intrinsics.areEqual(roomUserInfoModel2, o00000.f41436OooO0o)) {
                map.put("other", "");
            } else {
                if (Intrinsics.areEqual(roomUserInfoModel2, o00000.f41439OooO0oo)) {
                    o000O00O o000o00oOooO = o000O00O.OooO();
                    int i = 0;
                    while (true) {
                        if (i >= o000o00oOooO.f32431OoooO.size()) {
                            roomUserInfoModel = null;
                            break;
                        }
                        SparseArray<RoomLoginInformation.MIC> sparseArray = o000o00oOooO.f32431OoooO;
                        roomUserInfoModel = sparseArray.get(sparseArray.keyAt(i)).user;
                        if (roomUserInfoModel != null) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (roomUserInfoModel != null) {
                        long userId = roomUserInfoModel.getUserId();
                        Long value2 = OooOOO.f41216OooO00o.OooOo().getValue();
                        if (value2 != null && userId == value2.longValue()) {
                            roomUserInfoModel = null;
                        }
                    } else {
                        roomUserInfoModel = null;
                    }
                    if (roomUserInfoModel != null) {
                        roomUserInfoModelOooOO1 = roomUserInfoModel;
                        break;
                    }
                    o000O00O o000o00oOooO2 = o000O00O.OooO();
                    int i2 = 0;
                    for (int i3 = 0; i3 < o000o00oOooO2.f32431OoooO.size(); i3++) {
                        SparseArray<RoomLoginInformation.MIC> sparseArray2 = o000o00oOooO2.f32431OoooO;
                        roomUserInfoModel = sparseArray2.get(sparseArray2.keyAt(i3)).user;
                        if (roomUserInfoModel != null) {
                            if (i2 == 1) {
                                roomUserInfoModelOooOO1 = roomUserInfoModel;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (roomUserInfoModelOooOO1 != null && (userHeader3 = roomUserInfoModelOooOO1.getUserHeader()) != null) {
                        str = userHeader3;
                    }
                    map.put("other", str);
                } else if (Intrinsics.areEqual(roomUserInfoModel2, o00000.f41438OooO0oO)) {
                    o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
                    o00OO0OO<Long> o00oo0oo = o00O.OooOO0.f43246OooO0Oo;
                    Long l = (Long) CollectionsKt.getOrNull(o00oo0oo, 0);
                    if (l != null) {
                        long jLongValue = l.longValue();
                        Long value3 = oooOOO.OooOo().getValue();
                        if (value3 != null && jLongValue == value3.longValue()) {
                            roomUserInfoModelOooOO0 = null;
                        } else {
                            roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(jLongValue);
                        }
                    } else {
                        roomUserInfoModelOooOO0 = null;
                    }
                    if (roomUserInfoModelOooOO0 == null) {
                        Long l2 = (Long) CollectionsKt.getOrNull(o00oo0oo, 1);
                        if (l2 != null) {
                            roomUserInfoModelOooOO1 = o00O.f43140OooO00o.OooOO0(l2.longValue());
                        }
                    } else {
                        roomUserInfoModelOooOO1 = roomUserInfoModelOooOO0;
                    }
                    if (roomUserInfoModelOooOO1 != null && (userHeader2 = roomUserInfoModelOooOO1.getUserHeader()) != null && (strImgPng = CloudImageUtilKt.imgPng(userHeader2)) != null) {
                        str = strImgPng;
                    }
                    map.put("other", str);
                } else {
                    RoomUserInfoModel roomUserInfoModel3 = this.f20896OooO0o;
                    if (roomUserInfoModel3 != null && (userHeader = roomUserInfoModel3.getUserHeader()) != null) {
                        str = userHeader;
                    }
                    map.put("other", str);
                }
            }
            BaseWebView baseWebView = this.f20894OooO0OO.f49679OooO0o;
            Intrinsics.checkNotNullExpressionValue(baseWebView, "binding.webView");
            String jsonString = o0Oo0oo.OooO0O0(map);
            Intrinsics.checkNotNullParameter(baseWebView, "<this>");
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            o00OO000.OooO00o(baseWebView, "customGiftGetReceiveHead(" + jsonString + ')');
        }
    }
}
