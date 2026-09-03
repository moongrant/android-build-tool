package p501o0o00o;

import android.webkit.JavascriptInterface;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.GiftPropModel;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p130o00O0oo.o00oOoo;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.oo0oOO0;
import p488o0o000oo.o0OO00O;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0Oo0oo;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo extends o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Integer f41474OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f41475OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ GiftPropModel f41476OooO0OO;

    @DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftFailedToSave$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f41477Oooo0o;

        /* JADX INFO: renamed from: o0o00o.o000OOo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0395OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ GiftCustomMadeWebManager f41478Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0395OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager) {
                super(0);
                this.f41478Oooo0o = giftCustomMadeWebManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                OooOo.OooO0O0("102222");
                GiftCustomMadeWebManager.OooO00o(this.f41478Oooo0o);
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ GiftCustomMadeWebManager f41479Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(GiftCustomMadeWebManager giftCustomMadeWebManager) {
                super(0);
                this.f41479Oooo0o = giftCustomMadeWebManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                OooOo.OooO0O0("102221");
                this.f41479Oooo0o.OooO0O0();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f41477Oooo0o = giftCustomMadeWebManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f41477Oooo0o, continuation);
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
            SVGAView sVGAView = this.f41477Oooo0o.f20894OooO0OO.f49677OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            oOO00O.OooO00o(sVGAView);
            TextView textView = this.f41477Oooo0o.f20894OooO0OO.f49678OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSaving");
            oOO00O.OooO00o(textView);
            OooOo.OooO0O0("202024");
            oo0oOO0 oo0ooo0 = new oo0oOO0(this.f41477Oooo0o.f20892OooO00o);
            oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.failed_save_try_again));
            oo0ooo0.OooO0oO(false);
            oo0ooo0.OooOoO0(o000O0O0.OooO0OO(R.string.Cancel));
            oo0ooo0.OooOo(new C0395OooO00o(this.f41477Oooo0o));
            oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.try_again));
            oo0ooo0.OooOo0o(new OooO0O0(this.f41477Oooo0o));
            oo0ooo0.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftOpenRules$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f41480Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f41480Oooo0o = giftCustomMadeWebManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f41480Oooo0o, continuation);
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
            oo0oOO0 oo0ooo0 = new oo0oOO0(this.f41480Oooo0o.f20892OooO00o);
            oo0ooo0.OooOooo();
            oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.Instructions));
            oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.Room_gifts_custom_made_content));
            oo0ooo0.OooOOo(false);
            oo0ooo0.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftSuccesToSave$1$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ GiftPropModel f41481Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f41482Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000OOo f41483Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f41484Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(GiftCustomMadeWebManager giftCustomMadeWebManager, o000OOo o000ooo2, String str, GiftPropModel giftPropModel, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f41482Oooo0o = giftCustomMadeWebManager;
            this.f41483Oooo0oO = o000ooo2;
            this.f41484Oooo0oo = str;
            this.f41481Oooo = giftPropModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f41482Oooo0o, this.f41483Oooo0oO, this.f41484Oooo0oo, this.f41481Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Function3<? super Integer, ? super String, ? super GiftPropModel, Unit> function3 = this.f41482Oooo0o.f20891OooO;
            if (function3 != null) {
                Integer num = this.f41483Oooo0oO.f41474OooO00o;
                String str = this.f41484Oooo0oo;
                GiftPropModel giftPropModel = this.f41481Oooo;
                Intrinsics.checkNotNull(giftPropModel);
                function3.invoke(num, str, giftPropModel);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftSuccesToSave$2", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f41485Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f41485Oooo0o = giftCustomMadeWebManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f41485Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SVGAView sVGAView = this.f41485Oooo0o.f20894OooO0OO.f49677OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            oOO00O.OooO00o(sVGAView);
            TextView textView = this.f41485Oooo0o.f20894OooO0OO.f49678OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSaving");
            oOO00O.OooO00o(textView);
            GiftCustomMadeWebManager giftCustomMadeWebManager = this.f41485Oooo0o;
            giftCustomMadeWebManager.f20899OooO0oo = false;
            Function0<Unit> function0 = giftCustomMadeWebManager.f20898OooO0oO;
            if (function0 != null) {
                function0.invoke();
                giftCustomMadeWebManager.f20898OooO0oO = null;
            }
            return Unit.INSTANCE;
        }
    }

    public o000OOo(GiftCustomMadeWebManager giftCustomMadeWebManager, GiftPropModel giftPropModel) {
        this.f41475OooO0O0 = giftCustomMadeWebManager;
        this.f41476OooO0OO = giftPropModel;
    }

    @Override // p488o0o000oo.o0OO00O
    @JavascriptInterface
    public void closePage() {
        this.f41475OooO0O0.OooO0O0();
    }

    @JavascriptInterface
    public final void customGiftFailedToSave() {
        o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this.f41475OooO0O0.f20892OooO00o), new OooO00o(this.f41475OooO0O0, null));
    }

    @JavascriptInterface
    public final void customGiftOpenRules() {
        o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this.f41475OooO0O0.f20892OooO00o), new OooO0O0(this.f41475OooO0O0, null));
    }

    @JavascriptInterface
    public final void customGiftShowToast(int i) {
        if (i == 1) {
            showToastMsg(o000O0O0.OooO0OO(R.string.gift_toast_pp));
        } else {
            if (i != 2) {
                return;
            }
            OooOo.OooO0O0("102220");
            showToastMsg(o000O0O0.OooO0OO(R.string.ResetSucceeded));
        }
    }

    @JavascriptInterface
    public final void customGiftSuccesToSave(@Nullable String str) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("customGiftSuccesToSave    savePrice:  ");
        sbOooO0o0.append(this.f41474OooO00o);
        sbOooO0o0.append("    ");
        o00O00.OooO0O0(sbOooO0o0.toString());
        o00O00.OooO0O0("customGiftSuccesToSave    picUrl:     " + str);
        if (str != null) {
            GiftCustomMadeWebManager giftCustomMadeWebManager = this.f41475OooO0O0;
            o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f20892OooO00o), new OooO0OO(giftCustomMadeWebManager, this, str, this.f41476OooO0OO, null));
        }
        OooOo.OooO0O0("202023");
        GiftCustomMadeWebManager giftCustomMadeWebManager2 = this.f41475OooO0O0;
        if (giftCustomMadeWebManager2.f20899OooO0oo) {
            o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager2.f20892OooO00o), new OooO0o(this.f41475OooO0O0, null));
        } else {
            GiftCustomMadeWebManager.OooO00o(giftCustomMadeWebManager2);
        }
    }

    @JavascriptInterface
    public final void customGiftSuccesToSavePre(int i) {
        this.f41474OooO00o = Integer.valueOf(i);
    }

    @JavascriptInterface
    public final void webEventLog(@Nullable String str, @Nullable String str2) {
        Map<String, Object> mapOooO00o = str2 != null ? o0Oo0oo.OooO00o(str2) : null;
        if (str != null) {
            OooOo.OooO0OO(str, mapOooO00o);
        }
        StringBuilder sbOooO00o = o00oOoo.OooO00o("webEventLog:     ", str, "        ", str2, "          ");
        sbOooO00o.append(mapOooO00o);
        o00O00.OooO0O0(sbOooO00o.toString());
    }
}
