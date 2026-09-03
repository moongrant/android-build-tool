package p501o0o00o;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager;
import com.yalla.yalla.ui.dialog.GiftBlindHistoryDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o00O000;
import p488o0o000oo.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GiftBlindWebManager f41514OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f41515OooO0O0;

    @DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager$showWebView$4$toBlindboxRecord$1$1", f = "GiftBlindWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f41516Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ GiftBlindWebManager f41517Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f41518Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity, GiftBlindWebManager giftBlindWebManager, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f41516Oooo0o = fragmentActivity;
            this.f41517Oooo0oO = giftBlindWebManager;
            this.f41518Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f41516Oooo0o, this.f41517Oooo0oO, this.f41518Oooo0oo, continuation);
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
            MutableLiveData<String> giftBlindHistory = SharedUrlManager.INSTANCE.getGiftBlindHistory();
            FragmentActivity fragmentActivity = this.f41516Oooo0o;
            final GiftBlindWebManager giftBlindWebManager = this.f41517Oooo0oO;
            final String str = this.f41518Oooo0oo;
            giftBlindHistory.observe(fragmentActivity, new Observer() { // from class: o0o00o.o00Oo0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    GiftBlindWebManager giftBlindWebManager2 = giftBlindWebManager;
                    String str2 = str;
                    GiftBlindHistoryDialog giftBlindHistoryDialog = new GiftBlindHistoryDialog(giftBlindWebManager2.f20886OooO00o);
                    String url = ((String) obj2) + str2;
                    Intrinsics.checkNotNullParameter(url, "url");
                    giftBlindHistoryDialog.f23731OooO = url;
                    giftBlindHistoryDialog.OooOOO0();
                }
            });
            return Unit.INSTANCE;
        }
    }

    public o00Ooo(GiftBlindWebManager giftBlindWebManager, String str) {
        this.f41514OooO00o = giftBlindWebManager;
        this.f41515OooO0O0 = str;
    }

    @Override // p488o0o000oo.o0OO00O
    @JavascriptInterface
    public void closePage() {
        GiftBlindWebManager giftBlindWebManager = this.f41514OooO00o;
        o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(giftBlindWebManager.f20886OooO00o), new o00oO0o(giftBlindWebManager, null));
    }

    @Override // p488o0o000oo.o0OO00O
    @JavascriptInterface
    public void toBlindboxRecord() {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Activity activityOooO0O0 = o00O000.OooO0O0();
        FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
        if (fragmentActivity != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO00o(fragmentActivity, this.f41514OooO00o, this.f41515OooO0O0, null), 2, null);
        }
    }
}
