package p579o0oOoOOo;

import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.mixedroom.MixedRoomActivity;
import com.code.android.util.ToastUtil;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.DialogLinkFrom;
import com.yalla.yalla.model.DialogLinkManage;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class p {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f46243Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity) {
            super(0);
            this.f46243Oooo0o = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOo.OooO0O0("102024");
            WalletActivity.f23268OoooooO.OooO00o(this.f46243Oooo0o, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<m, Unit> f46244Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super m, Unit> function1) {
            super(1);
            this.f46244Oooo0o = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            DialogLinkManage.INSTANCE.getQuickRechargeDialogFromGiftSendDialog().postPut(DialogLinkFrom.QuickRechargeDialogFromGiftSendDialog, true, true);
            Function1<m, Unit> function1 = this.f46244Oooo0o;
            if (function1 != null) {
                function1.invoke(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f46245Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(FragmentActivity fragmentActivity) {
            super(0);
            this.f46245Oooo0o = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OooOo.OooO0O0("102024");
            WalletActivity.f23268OoooooO.OooO00o(this.f46245Oooo0o, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    @JvmStatic
    public static final void OooO00o(boolean z, boolean z2, @Nullable Function1<? super m, Unit> function1) {
        boolean z3;
        m mVar;
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
        if (fragmentActivity != null) {
            if (p516o0o0O000.OooOo.f42064OooO00o.OooO0O0()) {
                OooOo.OooO0O0("202006");
                oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivity);
                oo0ooo0.OooOo0(R.string.gold_notenough);
                oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
                oo0ooo0.OooOo0o(new OooO00o(fragmentActivity));
                oo0ooo0.OooOOO0();
                return;
            }
            if (fragmentActivity instanceof MixedRoomActivity) {
                OooOo.OooO0OO("202005", MapsKt.mapOf(new Pair("source", 1)));
            } else {
                if (!(fragmentActivity instanceof PrivateChatActivity)) {
                    if (fragmentActivity instanceof MainActivity ? true : fragmentActivity instanceof PostDetailActivity ? true : fragmentActivity instanceof TopicDetailActivity ? true : fragmentActivity instanceof UserPostListActivity) {
                        OooOo.OooO0OO("202005", MapsKt.mapOf(new Pair("source", 2)));
                    } else {
                        z3 = false;
                    }
                    if (z && !z3) {
                        OooOo.OooO0O0("202006");
                        oo0oOO0 oo0ooo1 = new oo0oOO0(fragmentActivity);
                        oo0ooo1.OooOo0(R.string.gold_notenough);
                        oo0oOO0.OooOoo0(oo0ooo1, false, 1, null);
                        oo0ooo1.OooOo0o(new OooO0OO(fragmentActivity));
                        oo0ooo1.OooOOO0();
                        return;
                    }
                    if (z2) {
                        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.gold_notenough));
                    }
                    mVar = new m(fragmentActivity);
                    mVar.OooO00o(new OooO0O0(function1));
                    if (function1 != null) {
                        function1.invoke(mVar);
                    }
                    mVar.OooOO0();
                }
                OooOo.OooO0OO("202005", MapsKt.mapOf(new Pair("source", 3)));
            }
            z3 = true;
            if (z) {
            }
            if (z2) {
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.gold_notenough));
            }
            mVar = new m(fragmentActivity);
            mVar.OooO00o(new OooO0O0(function1));
            if (function1 != null) {
                function1.invoke(mVar);
            }
            mVar.OooOO0();
        }
    }
}
