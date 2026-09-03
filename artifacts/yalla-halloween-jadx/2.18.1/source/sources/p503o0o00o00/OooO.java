package p503o0o00o00;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o00OOO00.OooOO0;
import o00OOO00.OooOO0O;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034OoooO0O.o0Oo0oo;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oOO00O;
import p104o000oo0O.o00O0O;
import p140o00OOOoO.OooO0OO;
import p140o00OOOoO.OooO0o;
import p462o0Ooo0o.o0000;
import p515o0o0O00.o00O00;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b8\u00109J\t\u0010\b\u001a\u00020\u0007H\u0096\u0001J\u0013\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0001J\u0011\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001JC\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u001d\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010 \u001a\u00020\u0007H\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\u001a\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014J!\u0010#\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0007H\u0016J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u001eH\u0016J\u0012\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u001eH\u0016J\u0016\u0010,\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*H\u0017J\u0014\u0010-\u001a\u00020\u00072\n\u0010+\u001a\u0006\u0012\u0002\b\u00030*H\u0017J\b\u0010.\u001a\u00020\u0007H\u0016R\"\u0010/\u001a\u00028\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u00107\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lo0o00o00/OooO;", "Lo000oo0O/o00O0O;", "VB", "Lo0Ooo0o/o0000;", "Landroid/view/View$OnClickListener;", "Lo00OOOoO/OooO0o;", "Lo00OOO00/OooOO0O;", "", "clearComposeDialogCache", "Landroid/app/Activity;", "activity", "initDialogProxy", "", ViewHierarchyConstants.TAG_KEY, "", "removeComposeDialog", "Lkotlin/Function1;", "Lo000oOoO/o0O00OO;", "Landroidx/compose/runtime/Composable;", "content", "showDialog", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;)Lo000oOoO/o0O00OO;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "isBindingInitialized", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", "onPause", "initViewBinding", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lo000oo0O/o00O0O;", "onDestroy", ViewHierarchyConstants.VIEW_KEY, "onNoDoubleClick", ak.aE, "onClick", "Lo00OOOoO/OooO0OO;", "msg", "onEvent", "onEventMainThread", "scrollTopRefresh", "binding", "Lo000oo0O/o00O0O;", "getBinding", "()Lo000oo0O/o00O0O;", "setBinding", "(Lo000oo0O/o00O0O;)V", "getTimeLengthStr", "()Ljava/lang/String;", "timeLengthStr", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public abstract class OooO<VB extends o00O0O> extends o0000 implements View.OnClickListener, OooO0o, OooOO0O {
    public static final int $stable = 8;
    public VB binding;
    private long resumeTime;
    private long timeLength;
    private final /* synthetic */ OooOO0 $$delegate_0 = new OooOO0();

    @NotNull
    private final o00Oo0 noDoubleClickListener = new OooO00o(this);

    public static final class OooO00o extends o00Oo0 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ OooO<VB> f41604Oooo;

        public OooO00o(OooO<VB> oooO) {
            this.f41604Oooo = oooO;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f41604Oooo.onNoDoubleClick(view);
        }
    }

    public void clearComposeDialogCache() {
        this.$$delegate_0.OooO00o();
    }

    @NotNull
    public final VB getBinding() {
        VB vb = this.binding;
        if (vb != null) {
            return vb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @NotNull
    public final String getTimeLengthStr() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
        sbOooO0o0.append(this.timeLength);
        return sbOooO0o0.toString();
    }

    @NotNull
    public abstract VB getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container);

    public void initDialogProxy(@Nullable Activity activity) {
        this.$$delegate_0.f31673Oooo0o = activity;
    }

    @NotNull
    public View initViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setBinding(getViewBinding(inflater, container));
        View viewOooO0O0 = getBinding().OooO0O0();
        Intrinsics.checkNotNullExpressionValue(viewOooO0O0, "binding.root");
        return viewOooO0O0;
    }

    public boolean isBindingInitialized() {
        return this.binding != null;
    }

    public void onClick(@Nullable View v) {
        this.noDoubleClickListener.onClick(v);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        o0Oo0oo.OooO0oo(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            initDialogProxy(activity);
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return initViewBinding(inflater, container);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        o0Oo0oo.OooO(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void onEvent(@Nullable OooO0OO<?> msg) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(@NotNull OooO0OO<?> msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.timeLength = System.currentTimeMillis() - this.resumeTime;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ActivityStackManager Fragment ");
        sbOooO0o0.append(getClass().getName());
        sbOooO0o0.append(" onPause -> isHide");
        o00O00.OooO0O0(sbOooO0o0.toString());
        MobclickAgent.onPageEnd(getClass().getName());
    }

    @Override // p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ActivityStackManager Fragment ");
        sbOooO0o0.append(getClass().getName());
        sbOooO0o0.append(" onResume -> isVisible");
        o00O00.OooO0O0(sbOooO0o0.toString());
        this.resumeTime = System.currentTimeMillis();
        MobclickAgent.onPageStart(getClass().getName());
    }

    public boolean removeComposeDialog(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.$$delegate_0.OooO0O0(tag);
    }

    public void scrollTopRefresh() {
    }

    public final void setBinding(@NotNull VB vb) {
        Intrinsics.checkNotNullParameter(vb, "<set-?>");
        this.binding = vb;
    }

    @Override // o00OOO00.OooOO0O
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Nullable
    public o0O00OO<Boolean> showDialog(@Nullable String tag, @NotNull Function3<? super o0O00OO<Boolean>, ? super oOO00O, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return this.$$delegate_0.showDialog(tag, content);
    }
}
